package com.sanzsolutions.controller;

import com.sanzsolutions.entity.Inquiry;
import com.sanzsolutions.repository.InquiryRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class ContactController {

    private final InquiryRepository repo;

    public ContactController(InquiryRepository repo) {
        this.repo = repo;
    }

    @PostMapping("/contact")
    public String submit(@ModelAttribute Inquiry inquiry) {
        repo.save(inquiry);
        return "redirect:/contact?success";
    }
}