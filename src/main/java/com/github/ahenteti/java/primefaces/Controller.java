package com.github.ahenteti.java.primefaces;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import java.io.Serializable;
import java.time.LocalDateTime;

@ViewScoped
@ManagedBean
public class Controller implements Serializable {

    private LocalDateTime dateMin;
    private LocalDateTime dateMax;

    @PostConstruct
    public void init() {
        this.dateMin = LocalDateTime.now();
        this.dateMax = LocalDateTime.now().plusMinutes(5);
    }
    
    public void submit() {
        System.out.println(dateMin + ", " + dateMax);
    }

    public LocalDateTime getDateMin() {
        return dateMin;
    }

    public void setDateMin(LocalDateTime dateMin) {
        this.dateMin = dateMin;
    }

    public LocalDateTime getDateMax() {
        return dateMax;
    }

    public void setDateMax(LocalDateTime dateMax) {
        this.dateMax = dateMax;
    }
}