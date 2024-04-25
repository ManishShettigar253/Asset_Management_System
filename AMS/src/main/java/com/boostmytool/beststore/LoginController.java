package com.boostmytool.beststore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpSession;

@Controller
public class LoginController {
    @Autowired
    private UserRepository userRepository;

    @PostMapping("/login")
    public String login(@RequestParam("username") String username,
                        @RequestParam("password") String password,
                        HttpSession session) {
        User user = userRepository.findByUsernameAndPassword(username, password);
        if (user != null) {
            //session.setAttribute("loggedInUser", user.getUsername());

            return "redirect:/index.html";
        } else {

            return "redirect:/login.html";  // Return to the login page with the message
        }
    }

    @RequestMapping("/logout")
    public String logout(HttpSession session) {
        // Invalidating session
        session.invalidate();
        return "redirect:/login.html";
    }
}
