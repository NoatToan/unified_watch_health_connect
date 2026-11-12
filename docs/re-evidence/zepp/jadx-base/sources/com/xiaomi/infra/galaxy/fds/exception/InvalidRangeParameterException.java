package com.xiaomi.infra.galaxy.fds.exception;

import com.xiaomi.infra.galaxy.fds.FDSError;

/* JADX INFO: loaded from: classes22.dex */
public class InvalidRangeParameterException extends GalaxyFDSException {
    private final long[] b;

    public InvalidRangeParameterException(long[] jArr) {
        super(a(jArr), null);
        this.b = jArr;
    }

    public static String a(long[] jArr) {
        if (jArr == null) {
            return "range parameter is null";
        }
        if (jArr.length == 1) {
            return "[ " + jArr[0] + "]";
        }
        if (jArr.length == 2) {
            return "[" + jArr[0] + ", " + jArr[1] + "]";
        }
        return "[" + jArr[0] + " " + jArr[1] + " " + jArr[2] + "...]";
    }

    @Override // com.xiaomi.infra.galaxy.fds.exception.GalaxyFDSException
    public FDSError getError() {
        return FDSError.InvalidRequestRange;
    }

    @Override // com.xiaomi.infra.galaxy.fds.exception.GalaxyFDSException, java.lang.Throwable
    public String toString() {
        String string = super.toString();
        if (this.b == null) {
            return string;
        }
        return string + a(this.b) + " in request";
    }
}
