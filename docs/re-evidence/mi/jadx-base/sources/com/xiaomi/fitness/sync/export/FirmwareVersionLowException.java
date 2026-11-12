package com.xiaomi.fitness.sync.export;

/* JADX INFO: loaded from: classes10.dex */
public class FirmwareVersionLowException extends IllegalArgumentException {
    public String errorMessage;

    public FirmwareVersionLowException(String str) {
        this.errorMessage = str;
    }
}
