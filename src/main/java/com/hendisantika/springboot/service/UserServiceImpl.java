package com.hendisantika.springboot.service;

import com.hendisantika.springboot.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;


@Service("userService")
public class UserServiceImpl implements UserService{
	
	private static final AtomicLong counter = new AtomicLong();
	
	private static List<User> users;
	
	static{
		users= populateDummyUsers();
	}

	public List<User> findAllUsers() {
		return users;
	}
	
	public User findById(long id) {
		for(User user : users){
			if(user.getId() == id){
				return user;
			}
		}
		return null;
	}
	
	public User findByName(String name) {
		for(User user : users){
			if(user.getName().equalsIgnoreCase(name)){
				return user;
			}
		}
		return null;
	}
	
	public void saveUser(User user) {
		user.setId(counter.incrementAndGet());
		users.add(user);
	}

	public void updateUser(User user) {
		int index = users.indexOf(user);
		users.set(index, user);
	}

	public void deleteUserById(long id) {
		
		for (Iterator<User> iterator = users.iterator(); iterator.hasNext(); ) {
		    User user = iterator.next();
		    if (user.getId() == id) {
		        iterator.remove();
		    }
		}
	}

	public boolean isUserExist(User user) {
		return findByName(user.getName())!=null;
	}
	
	public void deleteAllUsers(){
		users.clear();
	}

	private static List<User> populateDummyUsers(){
		List<User> users = new ArrayList<User>();
		users.add(new User(counter.incrementAndGet(),"Naruto",30, 70000));
		users.add(new User(counter.incrementAndGet(),"Sasuke",40, 50000));
		users.add(new User(counter.incrementAndGet(),"Sakura",45, 30000));
		users.add(new User(counter.incrementAndGet(),"Kakashi",50, 40000));
        users.add(new User(counter.incrementAndGet(), "Minato", 50, 40000));
        users.add(new User(counter.incrementAndGet(), "Sarutobi", 50, 40000));
        users.add(new User(counter.incrementAndGet(), "Orochimaru", 50, 40000));
        users.add(new User(counter.incrementAndGet(), "Jiraiya", 50, 40000));
        users.add(new User(counter.incrementAndGet(), "Tsunade", 50, 40000));
        users.add(new User(counter.incrementAndGet(), "Kiba", 50, 40000));
        users.add(new User(counter.incrementAndGet(), "Hyuuga", 50, 40000));
        users.add(new User(counter.incrementAndGet(), "Hinata", 50, 40000));
        users.add(new User(counter.incrementAndGet(), "Shino", 50, 40000));
        users.add(new User(counter.incrementAndGet(), "Ten-ten", 50, 40000));
        users.add(new User(counter.incrementAndGet(), "Rock Lee", 50, 40000));
		return users;
	}

}
