package com.xiaomi.fitness.sync.model;

/* JADX INFO: loaded from: classes10.dex */
public class BaseResult {
    public int code;
    public String message;

    public boolean isSuccess() {
        return this.code == 0;
    }

    public String toString() {
        return "code: " + this.code + ", message: " + this.message;
    }
}
