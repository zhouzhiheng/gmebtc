package com.gmebtc.web.portal.service;

import com.gmebtc.web.portal.entity.User;

import javax.servlet.http.HttpServletRequest;

public interface UserService {
    String userPhoneRegister(User user,HttpServletRequest request);
}