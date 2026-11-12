package com.huami.discovery.bridge.jsbridge.common;

/* JADX INFO: loaded from: classes8.dex */
public class ErrorMessage {
    private String a;
    public String message;

    public ErrorMessage(String str) {
        this.a = str;
    }

    public String toString() {
        return "{\"errorCode\":\"" + this.a + "\",\"errorMessage\":\"" + this.message + "\"}";
    }
}
