package com.yml.employeepayroll;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileIO {
    
    public boolean checkIfExists(Path filePath) {
        return Files.exists(filePath);
    }

    public void deleteFile(Path filePath) throws IOException {
        if (checkIfExists(filePath)) {
            Files.deleteIfExists(filePath);
        }
    }

    public void createDirectory(Path filePath) throws IOException {
        Files.createDirectory(filePath);
    }

    public void createFile(Path filePath) throws IOException {
        Files.createFile(filePath);
    }

    public void listFiles(Path filePath) throws IOException {
        Files.list(filePath).forEach(file->System.out.println(file));;
    }
}
