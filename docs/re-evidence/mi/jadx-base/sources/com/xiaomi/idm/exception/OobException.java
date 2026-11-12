package com.xiaomi.idm.exception;

import com.xiaomi.idm.constant.ResponseCode;

/* JADX INFO: loaded from: classes11.dex */
public class OobException extends IDMException {
    public OobException(int i, String str) {
        super(i, str);
    }

    public OobException(ResponseCode.OobCode oobCode) {
        super(oobCode.code, oobCode.msg);
    }
}
