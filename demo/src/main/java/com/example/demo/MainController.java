package com.example.demo; // <--- И ТУТ ТОЖЕ demo

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MainController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("title", "Главная");
        return "index";
    }

    @GetMapping("/projects")
    public String projects(Model model) {
        List<Project> list = new ArrayList<>();
        // Добавляем данные (можешь поменять текст на свой)
        list.add(new Project("Telegram Bot", "Бот для расписания", 2024));
        list.add(new Project("Java Game", "Змейка", 2023));
        list.add(new Project("Web Site", "Сайт на Spring Boot", 2024));

        model.addAttribute("projectsList", list);
        return "projects";
    }

    @GetMapping("/about")
    public String about(Model model) {
        return "about";
    }

    @GetMapping("/services")
    public String services(Model model) {
        return "services";
    }

    @GetMapping("/contacts")
    public String contacts(Model model) {
        return "contacts";
    }
}