package com.wuqke.service;

import com.wuqke.dto.UserinfoDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wuqiongke on 2017/10/24.
 */
public class UserInfoServiceImpl implements UserInfoService {

    private static final Logger logger = LoggerFactory.getLogger(UserInfoServiceImpl.class);




    @Override
    public UserinfoDto getUserInfoById(Integer userId) {
        UserinfoDto userinfoDto = new UserinfoDto();
        return userinfoDto;
    }

    @Override
    public List<UserinfoDto> getAllUserInfo() {
        List<UserinfoDto> resultList = new ArrayList<>();
        return resultList;


    }


}
