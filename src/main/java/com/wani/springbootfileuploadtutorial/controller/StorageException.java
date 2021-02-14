package com.wani.springbootfileuploadtutorial.controller;

import java.io.IOException;

public class StorageException extends RuntimeException {
    public StorageException(String could_not_initialize_storage, IOException e) {
    }

    public StorageException(String could_not_initialize_storage) {

    }
}
