package com.xiaomi.phonenum.bean;

import defpackage.ork;

/* JADX INFO: loaded from: classes11.dex */
public enum HttpError {
    ENCRYPT(460),
    DECRYPT(461),
    DATA_NOT_ENABLED(462),
    NO_CHANGE_NETWORK_STATE_PERMISSION(463),
    CELLULAR_NETWORK_NOT_AVAILABLE(464),
    CELLULAR_NETWORK_IO_EXCEPTION(600);

    public final int code;

    HttpError(int i) {
        this.code = i;
    }

    public ork result() {
        return new ork.a().c(this.code).a(toString()).b();
    }
}
