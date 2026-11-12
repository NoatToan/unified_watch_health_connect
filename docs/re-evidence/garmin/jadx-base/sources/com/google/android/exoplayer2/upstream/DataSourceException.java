package com.google.android.exoplayer2.upstream;

import java.io.IOException;

/* JADX INFO: loaded from: classes14.dex */
public class DataSourceException extends IOException {

    @Deprecated
    public static final int POSITION_OUT_OF_RANGE = 2008;
    public final int reason;

    public DataSourceException(int i14) {
        this.reason = i14;
    }

    public static boolean isCausedByPositionOutOfRange(IOException iOException) {
        for (Throwable cause = iOException; cause != null; cause = cause.getCause()) {
            if ((cause instanceof DataSourceException) && ((DataSourceException) cause).reason == 2008) {
                return true;
            }
        }
        return false;
    }

    public DataSourceException(Throwable th3, int i14) {
        super(th3);
        this.reason = i14;
    }

    public DataSourceException(String str, int i14) {
        super(str);
        this.reason = i14;
    }

    public DataSourceException(String str, Throwable th3, int i14) {
        super(str, th3);
        this.reason = i14;
    }
}
