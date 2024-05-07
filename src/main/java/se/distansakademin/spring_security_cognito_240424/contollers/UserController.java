package se.distansakademin.spring_security_cognito_240424.contollers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import se.distansakademin.spring_security_cognito_240424.models.SignUpRequest;
import se.distansakademin.spring_security_cognito_240424.services.UserService;

import java.util.List;

@Controller
public class UserController {
    @GetMapping("/user")
    public String getUserPage(Model model, OAuth2AuthenticationToken token) {
        var sub = token.getPrincipal().getAttribute("sub");
        model.addAttribute("username", token.getName());
        model.addAttribute("userId", sub);
        return "user";
    }
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users")
    public String listAllUsers(Model model) {
        List<SignUpRequest> users = userService.getAllUsers();
        model.addAttribute("users", users);
        return "users";
    }
}
