package com.xiaomi.infra.galaxy.fds.exception;

import com.xiaomi.infra.galaxy.fds.FDSError;

/* JADX INFO: loaded from: classes22.dex */
public class GalaxyFDSException extends Exception {
    private static String a = null;
    private static final long serialVersionUID = -7688381775178948719L;

    public GalaxyFDSException() {
    }

    public static void setLocationInfo(String str) {
        a = str;
    }

    public FDSError getError() {
        return FDSError.InternalServerError;
    }

    @Override // java.lang.Throwable
    public String toString() {
        StringBuilder sb = new StringBuilder("Galaxy FDS Error: ");
        sb.append(getError().description());
        String message = getMessage();
        if (message != null) {
            sb.append(" [");
            sb.append(message);
            sb.append("]");
        }
        if (a != null) {
            sb.append(" ");
            sb.append(a);
        }
        return sb.toString();
    }

    public GalaxyFDSException(String str, Throwable th) {
        super(str, th);
    }

    public GalaxyFDSException(String str) {
        super(str, null);
    }

    public GalaxyFDSException(Throwable th) {
        super(th == null ? null : th.getMessage(), th);
    }
}
