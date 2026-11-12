package com.garmin.samd.exception;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/garmin/samd/exception/GarminDeviceNotCapableException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "deviceUnitId", "", "message", "", "(JLjava/lang/String;)V", "SaMD_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class GarminDeviceNotCapableException extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GarminDeviceNotCapableException(long j8, String str) {
        super("deviceUnitId " + j8 + ": " + str);
        str.getClass();
    }
}
