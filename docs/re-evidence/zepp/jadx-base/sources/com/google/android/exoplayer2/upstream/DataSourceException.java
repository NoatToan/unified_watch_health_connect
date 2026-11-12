package com.google.android.exoplayer2.upstream;

import androidx.annotation.Nullable;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class DataSourceException extends IOException {

    @Deprecated
    public static final int POSITION_OUT_OF_RANGE = 2008;
    public final int reason;

    public DataSourceException(int reason) {
        this.reason = reason;
    }

    public static boolean isCausedByPositionOutOfRange(IOException iOException) {
        for (Throwable cause = iOException; cause != null; cause = cause.getCause()) {
            if ((cause instanceof DataSourceException) && ((DataSourceException) cause).reason == 2008) {
                return true;
            }
        }
        return false;
    }

    public DataSourceException(@Nullable Throwable cause, int reason) {
        super(cause);
        this.reason = reason;
    }

    public DataSourceException(@Nullable String message, int reason) {
        super(message);
        this.reason = reason;
    }

    public DataSourceException(@Nullable String message, @Nullable Throwable cause, int reason) {
        super(message, cause);
        this.reason = reason;
    }
}
