package com.xiaomi.idm.exception;

import com.xiaomi.idm.constant.ResponseCode;
import defpackage.gpe;
import java.util.concurrent.ExecutionException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class EventException extends RmiException {
    private static final String TAG = "EventException";

    public EventException(int i) {
        this(i, ResponseCode.EventCode.fromCode(i).getMsg());
    }

    public static EventException createException(ExecutionException executionException) {
        int iResolveIDMExceptionCode;
        String message = executionException.getMessage();
        try {
            iResolveIDMExceptionCode = new JSONObject(message).getInt("code");
        } catch (JSONException e) {
            gpe.b(TAG, e.getMessage(), e);
            iResolveIDMExceptionCode = IDMException.resolveIDMExceptionCode(message);
        }
        ResponseCode.EventCode eventCodeFromCode = ResponseCode.EventCode.fromCode(iResolveIDMExceptionCode);
        return new EventException(eventCodeFromCode.getCode(), eventCodeFromCode.getMsg());
    }

    public EventException(ResponseCode.EventCode eventCode) {
        this(eventCode.getCode());
    }

    public EventException(int i, String str) {
        super(i, str);
    }
}
