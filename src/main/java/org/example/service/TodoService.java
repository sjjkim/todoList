package org.example.service;

import lombok.AllArgsConstructor;
import org.example.model.TodoEntity;
import org.springframework.stereotype.Service;
import repository.TodoRepository;

@Service
@AllArgsConstructor
public class TodoService {

    private final TodoRepository todoRepository;

    public TodoEntity add(TodoEntity request){
        return null;
    }

    public TodoEntity searchById(Long id) {
        return null;
    }
}
