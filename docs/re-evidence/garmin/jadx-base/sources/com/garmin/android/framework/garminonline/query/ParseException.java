package com.garmin.android.framework.garminonline.query;

import com.google.firebase.perf.util.Constants;

/* JADX INFO: loaded from: classes8.dex */
public class ParseException extends QueryException {
    public static final int CLD_PARSE_ERROR = 1;
    public static final int PARSE_ERROR = 0;
    public static final int TUNICK_PARSE_ERROR = 2;

    public ParseException(int i14) {
        super(getErrorCode(i14));
    }

    public static int getErrorCode(int i14) {
        if (i14 == 1) {
            return 701;
        }
        if (i14 != 2) {
            return Constants.FROZEN_FRAME_TIME;
        }
        return 702;
    }

    public ParseException(String str, int i14) {
        super(str, getErrorCode(i14));
    }

    public ParseException(String str, Throwable th3, int i14) {
        super(str, th3, getErrorCode(i14));
    }

    public ParseException(Throwable th3, int i14) {
        super(th3, getErrorCode(i14));
    }
}
