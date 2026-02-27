package org.example.cicdjava.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Version {


    @Value("${app.version:0.0.0}")
    private String appVersion;

    @GetMapping("/version")
    public ResponseEntity<String> version_name() {
        return ResponseEntity.ok(appVersion);
    }
}