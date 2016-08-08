package com.fsck.k9.mail;


import java.util.UUID;


public class UUIDGenerator {
    private static final UUIDGenerator INSTANCE = new UUIDGenerator();

    public static UUIDGenerator getInstance() {
        return INSTANCE;
    }

    public UUID generateUUID() {
        return UUID.randomUUID();
    }
}
