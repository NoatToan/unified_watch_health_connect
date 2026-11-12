package com.garmin.samd.exception;

import am.j;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/garmin/samd/exception/GHSGarminDeviceInactiveException;", "Lcom/garmin/samd/exception/GHSBaseException;", "deviceUnitId", "", "ghsErrorId", "", "ghsMessage", "(JLjava/lang/String;Ljava/lang/String;)V", "SaMD_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class GHSGarminDeviceInactiveException extends GHSBaseException {
    public GHSGarminDeviceInactiveException(long j8, String str, String str2) {
        str.getClass();
        str2.getClass();
        StringBuilder sb3 = new StringBuilder("deviceUnitId ");
        sb3.append(j8);
        super(j.o(": ", str2, sb3), str);
    }
}
