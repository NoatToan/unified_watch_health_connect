package com.xiaomi.idm.exception;

import com.xiaomi.idm.constant.ResponseCode;

/* JADX INFO: loaded from: classes11.dex */
public class RequestException extends RmiException {
    public RequestException(int i) {
        this(i, ResponseCode.RequestCode.getResponseMsg(i));
    }

    public RequestException(ResponseCode.RequestCode requestCode) {
        this(requestCode.getCode());
    }

    public RequestException(int i, String str) {
        super(i, str);
    }
}
