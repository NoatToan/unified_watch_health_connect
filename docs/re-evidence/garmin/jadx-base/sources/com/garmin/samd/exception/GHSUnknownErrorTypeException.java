package com.garmin.samd.exception;

import am.j;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/samd/exception/GHSUnknownErrorTypeException;", "Lcom/garmin/samd/exception/GHSBaseException;", "errorType", "", "ghsErrorId", "message", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "SaMD_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class GHSUnknownErrorTypeException extends GHSBaseException {
    public GHSUnknownErrorTypeException(String str, String str2, String str3) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        StringBuilder sb3 = new StringBuilder("errorType ");
        sb3.append(str);
        super(j.o("\n", str3, sb3), str2);
    }
}
