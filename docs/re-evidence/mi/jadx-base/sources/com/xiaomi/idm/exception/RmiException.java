package com.xiaomi.idm.exception;

import com.xiaomi.idm.constant.ResponseCode;
import defpackage.gpe;
import java.util.concurrent.ExecutionException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class RmiException extends IDMException {
    private static final String TAG = "RmiException";

    public RmiException(int i, String str) {
        super(i, str);
    }

    public static RmiException createException(ExecutionException executionException) {
        int iResolveIDMExceptionCode;
        String message = executionException.getMessage();
        try {
            iResolveIDMExceptionCode = new JSONObject(message).getInt("code");
        } catch (JSONException e) {
            gpe.b(TAG, e.getMessage(), e);
            iResolveIDMExceptionCode = IDMException.resolveIDMExceptionCode(message);
        }
        ResponseCode.RequestCode requestCodeFromCode = ResponseCode.RequestCode.fromCode(iResolveIDMExceptionCode);
        return new RmiException(requestCodeFromCode.getCode(), requestCodeFromCode.getMsg());
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return super.getMessage() + "; response code: " + getCode();
    }

    public int getResponseCode() {
        return getCode();
    }
}
