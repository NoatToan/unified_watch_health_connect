package com.xiaomi.idm.exception;

import com.xiaomi.idm.constant.ResponseCode;

/* JADX INFO: loaded from: classes11.dex */
public class PropertyException extends RmiException {
    public PropertyException(int i) {
        super(i, ResponseCode.PropertyStatusCode.fromCode(i).getMsg());
    }

    public PropertyException(ResponseCode.PropertyStatusCode propertyStatusCode) {
        super(propertyStatusCode.getCode(), propertyStatusCode.getMsg());
    }

    public PropertyException(int i, String str) {
        super(i, str);
    }
}
