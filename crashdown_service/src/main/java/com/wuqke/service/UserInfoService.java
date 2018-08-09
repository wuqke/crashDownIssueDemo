package com.wuqke.service;

import com.wuqke.dto.UserinfoDto;

import java.util.List;

/**
 * Created by wuqiongke on 2017/10/23.
 */
public interface UserInfoService {



    UserinfoDto getUserInfoById(Integer userId);


    List<UserinfoDto> getAllUserInfo();
}
