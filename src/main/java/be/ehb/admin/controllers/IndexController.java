package be.ehb.admin.controllers;

import be.ehb.admin.model.Student;
import be.ehb.admin.model.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class IndexController {

    @Autowired
    private StudentRepository repo;

    @ModelAttribute("all")
    public Iterable<Student> findAll(){
        return repo.findAll();
    }

    @RequestMapping(value = {"/index", "/"}, method = RequestMethod.GET)
    public String showIndex(ModelMap map){
        return "index";
    }

}
