package net.javaguides.springboot.controller;

import lombok.AllArgsConstructor;
import net.javaguides.springboot.entity.User;
import net.javaguides.springboot.repository.UserRepository;
import net.javaguides.springboot.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController //combination of @Responsebody and @Controller used for REST API annotations  and it's corresponding work.
@AllArgsConstructor
@RequestMapping("api/users") //this annotation is to have a common base url for all the functionalities of APIs.
public class UserController {

    private UserService userService;

    //for any REST API functionality we just create a function and annotate with respective Http Matching request.
    @PostMapping //for matching post request from Http .
    public ResponseEntity<User> createUser(@RequestBody User user){
        User savedUser = userService.createUser(user);
        return new ResponseEntity<>(savedUser, HttpStatus.CREATED);
    }

    //http://localhost:8080/api/users/1 (here it takes 1 as id by our naming in Getmapping and transfers as method parameterby @PathVariable.)
    @GetMapping("{id}") // for matching get request from Http url
    public ResponseEntity<User> getUserById(@PathVariable("id") Long userId){ //pathVariable is for knowing which variable from url if parameter is of different name.
        User user = userService.getUserById(userId);
        return new ResponseEntity<>(user,HttpStatus.OK);
    }

    //Build get all users REST API

    //http://localhost:8080/api/users
    @GetMapping
    public ResponseEntity<List<User>> getAllUsers(){
        List<User> users = userService.getAllUsers();
        return new ResponseEntity<>(users,HttpStatus.OK);
    }

    //Build update users REST API
    //http://localhost:8080/api/users/1
    @PutMapping("{id}") //Annotation for put request of HTTP.
    public ResponseEntity<User> updateUser(@PathVariable Long id,@RequestBody User user){  //RequestBody is for converting Json to Java object.
        user.setId(id);
        User updating_user = userService.updateUser(user);
        return new ResponseEntity<>(updating_user,HttpStatus.OK);

    }

    //Build Delete User REST API
    //http://localhost:8080/api/users/1  (if we send a id in path respective user will be deleted).
    @DeleteMapping("{id}") //Annotation for delete request of HTTP.
    public ResponseEntity<User> delteUser(@PathVariable Long id){
        userService.deleteUser(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }




}
