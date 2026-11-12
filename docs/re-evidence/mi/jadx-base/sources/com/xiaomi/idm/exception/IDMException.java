package com.xiaomi.idm.exception;

import com.xiaomi.idm.constant.ResponseCode;
import defpackage.gpe;

/* JADX INFO: loaded from: classes11.dex */
public class IDMException extends Exception {
    private static final String TAG = "IDMException";
    private final int code;

    public IDMException(int i, String str) {
        super("code = " + i + ", msg = " + str);
        this.code = i;
    }

    public static IDMException asIDMException(Exception exc) {
        return new IDMException(-1, exc.getMessage());
    }

    public static IDMException create(ResponseCode responseCode) {
        return new IDMException(responseCode.getCode(), responseCode.getMsg());
    }

    public static int resolveIDMExceptionCode(String str) {
        if (str == null || str.equals("")) {
            return -9999;
        }
        String[] strArrSplit = str.split(",")[0].split(" = ");
        try {
            if (strArrSplit.length > 1) {
                return Integer.parseInt(strArrSplit[1]);
            }
            return -9999;
        } catch (NumberFormatException e) {
            gpe.b(TAG, "resolveIDMExceptionCode failed, " + str, e);
            return -9999;
        }
    }

    public int getCode() {
        return this.code;
    }
}
