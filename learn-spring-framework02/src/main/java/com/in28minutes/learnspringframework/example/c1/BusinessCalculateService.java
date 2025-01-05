package com.in28minutes.learnspringframework.example.c1;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Arrays;
//@Component
@Service
public class BusinessCalculateService {


    private DataService dataService;

    public BusinessCalculateService(DataService dataService) {
        this.dataService = dataService;
    }
    public int findMax(){
        return Arrays.stream(dataService.retrieveData()).max().orElse(-1);
    }
}
