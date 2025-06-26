package com.example.expense_backend;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/expenses")
public class ExpenseController {
    private final ExpenseRepository repo;

    public ExpenseController(ExpenseRepository repo) {
        this.repo = repo;
    }

    @GetMapping
    public List<Expense> listAll() {
        return repo.findAll();
    }

    @PostMapping
    public Expense create(@RequestBody Expense e) {
        return repo.save(e);
    }
}
