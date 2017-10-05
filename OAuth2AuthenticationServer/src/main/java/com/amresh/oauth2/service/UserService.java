package com.amresh.oauth2.service;

import com.amresh.oauth2.model.User;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface UserService {
	@GET("login")
	Call<User> login(@Query("login") String login);
}