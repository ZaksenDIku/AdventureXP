package com.xpgruppe.AdventureXP.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class activityDetailsController {

    @GetMapping("/activity-details")
    public String home() {
        return "activityDetails";
    }

}
