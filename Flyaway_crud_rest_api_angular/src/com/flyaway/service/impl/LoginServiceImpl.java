package com.flyaway.service.impl;

import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;

import com.flyaway.dao.LoginDAO;
import com.flyaway.dao.impl.LoginDAOImpl;
import com.flyaway.model.Login;
import com.flyaway.service.LoginService;

public class LoginServiceImpl implements LoginService
{

	private LoginDAO dao = new LoginDAOImpl();
	public Login createLogin(Login login)
	{
		return dao.createLogin(login);
	}
    public List<String> checkLogin(String userName, String userPassword)
    {
		Boolean check;
		check =  dao.checkLogin(userName, userPassword) ;
        List<String> response = new ArrayList<>(); 
    	if (check == true)
    	{
            response.add("Login successful");
    		return response;
    	}
    	else
    	{
    	    response.add("Login failed");
      		return response;    	}

	 
}
	@Override
	public Login updateLogin(Login login) {
		return dao.updateLogin(login);
	}
}
