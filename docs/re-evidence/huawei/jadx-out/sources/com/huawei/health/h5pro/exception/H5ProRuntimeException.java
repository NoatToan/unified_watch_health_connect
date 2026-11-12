package com.huawei.health.h5pro.exception;

/* JADX INFO: loaded from: classes28.dex */
public class H5ProRuntimeException extends RuntimeException {
    private int d;

    public H5ProRuntimeException(String str) {
        super(str);
        this.d = -1;
    }

    public H5ProRuntimeException(int i, String str) {
        super(str);
        this.d = i;
    }
}
