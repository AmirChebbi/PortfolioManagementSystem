package com.ThePrince.PortfolioManagementSystem.Handler;

import com.ThePrince.PortfolioManagementSystem.DAOs.File.File;
import com.ThePrince.PortfolioManagementSystem.DTOs.Directory.DirectoryPathDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.time.LocalDateTime;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class ResponseHandler {
    public static ResponseEntity<Object> generateResponse(Object object, HttpStatus status, List<DirectoryPathDTO> pathDTOS){
        HashMap<String, Object> map = new HashMap<>();
        map.put("http", status.value());
        map.put("status", "success");
        map.put("data",object);
        map.put("sendingDate", LocalDateTime.now());
        map.put("path", pathDTOS);
        return new ResponseEntity<>(map, status);
    }

    public static ResponseEntity<Object> generateResponse(String message, Object object, HttpStatus status){
        HashMap<String, Object> map = new HashMap<>();
        map.put("http", status.value());
        map.put("message", message);
        map.put("data", object);
        map.put("sendingDate", LocalDateTime.now());
        return new ResponseEntity<>(map, status);
    }

    public static ResponseEntity<Object> generateResponse(Object object, HttpStatus status, int size, int total){
        HashMap<String, Object> map = new HashMap<>();
        map.put("http", status.value());
        map.put("status", "success");
        map.put("size",size);
        map.put("total", total);
        map.put("data", object);
        map.put("sendingDate", LocalDateTime.now());
        return new ResponseEntity<>(map, status);
    }

    public static ResponseEntity<Object> generateResponse(Object object, HttpStatus status){
        HashMap<String, Object> map = new HashMap<>();
        map.put("http", status.value());
        map.put("status", "success");
        map.put("data",object);
        map.put("sendingDate", LocalDateTime.now());
        return new ResponseEntity<>(map, status);
    }
    public static ResponseEntity<Object> generateErrorResponse(String message, HttpStatus status){
        HashMap<String, Object> map = new HashMap<>();
        map.put("http", status);
        map.put("errorMessage",message);
        map.put("Date", LocalDateTime.now());
        return new ResponseEntity<>(map, status);
    }
    public static ResponseEntity<Object> generateProfileResponse(HashMap countMap, List<Object> list, HttpStatus status){
        HashMap<String, Object> map = new HashMap<>();
        map.put("http", status);
        map.put("message", "success");
        map.put("counts", countMap);
        map.put("objectList",list);
        map.put("Date", LocalDateTime.now());
        return new ResponseEntity<>(map, status);
    }
}
