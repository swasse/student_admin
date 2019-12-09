package be.ehb.admin.controllers;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;

@Controller
public class SumThingWongController implements ErrorController {

    @RequestMapping("/error")
    public String handleError() {
        return "404";
    }

    @Override
    public String getErrorPath() {
        return "/error";
    }
}
