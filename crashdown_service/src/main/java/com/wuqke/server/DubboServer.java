package com.wuqke.server;

import com.alibaba.dubbo.container.Main;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by wuqiongke on 2017/10/24.
 */
public class DubboServer {

    private static final Logger logger = LoggerFactory.getLogger(DubboServer.class);

    public static void main(String[] args) {
        logger.info("provider start now!");
        Main.main(args);
        logger.info("provider stop now!");

    }
}
