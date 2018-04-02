package com.kevin.japi;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.kevin.japi.services.v1.User;

public class BusinessManager {

	private static final Logger log = Logger.getLogger(BusinessManager.class.getName());
	private static BusinessManager INSTANCE = new BusinessManager();
	
	public static BusinessManager getInstance() {
		return INSTANCE;
	}
	
	private BusinessManager() {
		
	}
	
	public User findUser(String userId) {
		log.info("=========== BusinessManager :: findUser started ==========");
		User user = new User();
		user.setId("112233");
		user.setName("Kevin");
		return user;
	}
	
	public List<User> findUsers(){
		List<User> users = new ArrayList<User>();
		User user_1 = new User();
		user_1.setId("332211");
		user_1.setName("Jay");
		
		User user_2 = new User();
		user_2.setId("112233");
		user_2.setName("Kevin");
		
		users.add(user_1);
		users.add(user_2);
		
		return users;
	}

	public User addUser(User user) {
		user.setId("4444");
		user.setName("Ssss");
		return user;
	}
	
}
