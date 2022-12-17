package com.example.demo;

//import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

//import com.example.demo.entity.User;

@RestController
public class UserController {

	@GetMapping("/hello/{name}")
	public String getHelloWorld (@PathVariable String name)
	{
	return "Hello World "+name;
	}

//    @PostMapping("/add")
//    public void saveEmployeeProfile(@RequestBody User user) {
//    	userService.addUser(user);
//    }
//
//    @GetMapping("/getAll")
//    public List <User> getAllUsers() {
//        return userService.getUsers();
//    }
}
