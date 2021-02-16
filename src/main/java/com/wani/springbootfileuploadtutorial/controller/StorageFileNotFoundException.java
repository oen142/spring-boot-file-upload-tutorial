package com.wani.springbootfileuploadtutorial.controller;

import java.io.IOException;
import java.net.MalformedURLException;

public class StorageFileNotFoundException extends StorageException {

    public StorageFileNotFoundException(String could_not_initialize_storage, IOException e) {
        super(could_not_initialize_storage, e);
    }

    public StorageFileNotFoundException(String could_not_initialize_storage) {
        super(could_not_initialize_storage);
    }
}
