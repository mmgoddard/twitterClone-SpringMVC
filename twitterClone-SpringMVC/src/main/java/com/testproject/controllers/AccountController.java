package com.testproject.controllers;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@Component
@RequestMapping("account")
public class AccountController {

        @RequestMapping(method = RequestMethod.GET)
        private ModelAndView serveAccount(Model model) {
            return new ModelAndView("account");
        }
}
