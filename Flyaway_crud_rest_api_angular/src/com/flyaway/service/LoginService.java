package com.flyaway.service;

import java.util.List;

import com.flyaway.model.Login;

public interface LoginService {
	public Login createLogin(Login login);
    public List<String> checkLogin(String userName, String userPassword);
    public Login updateLogin(Login login);
}
