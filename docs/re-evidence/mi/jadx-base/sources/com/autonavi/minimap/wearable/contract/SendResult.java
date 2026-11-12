package com.autonavi.minimap.wearable.contract;

/* JADX INFO: loaded from: classes4.dex */
public enum SendResult {
    SUCCESS(1, "send_success"),
    FAILED(2, "send_failed");

    public int code;
    public String message;

    SendResult(int i, String str) {
        this.code = i;
        this.message = str;
    }
}
