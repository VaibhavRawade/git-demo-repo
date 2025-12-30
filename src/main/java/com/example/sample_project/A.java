package com.example.sample_project;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class A 
{
	@GetMapping
    public String getNamde()
	{
        return "vaibhav rawade learning devops";
    }
}
