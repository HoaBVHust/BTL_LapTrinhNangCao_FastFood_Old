package edu.hust.talent.fastfood.controller;


import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String index(){return "home";}
    @GetMapping("/user")
    public String indexLogin(Model model) {
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        UserDetails userDetails = ((UserDetails) principal);
        model.addAttribute("userDetails",userDetails);
        return "home";
    }

    @GetMapping("/admin")
    public String admin() {
        return "admin";
    }

    @GetMapping("/403")
    public String accessDenied() {
        return "403";
    }

    @GetMapping("/login")
    public String getLogin() { return "login"; }

    @GetMapping("/about")
    public String getAbout() { return "about"; }

    @GetMapping("/menu")
    public String getMenu() { return "menu"; }

    @GetMapping("/chef")
    public String getChef() { return "chef"; }

    @GetMapping("/blogSingle")
    public String getBlog() { return "blog"; }

    @GetMapping("/blogDetails")
    public String getBlogDetails() { return "blog-details"; }

    @GetMapping("/contact")
    public String getContact() { return "contact"; }

}