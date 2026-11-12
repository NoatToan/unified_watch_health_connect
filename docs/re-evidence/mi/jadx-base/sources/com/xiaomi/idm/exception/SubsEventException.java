package com.xiaomi.idm.exception;

import com.xiaomi.idm.constant.ResponseCode;

/* JADX INFO: loaded from: classes11.dex */
public class SubsEventException extends RmiException {
    public SubsEventException(ResponseCode.SubsEventCode subsEventCode) {
        super(subsEventCode.getCode(), subsEventCode.getMsg());
    }
}
