package com.tencent.mm.opensdk.diffdev.a;

import com.xiaomi.infra.galaxy.fds.Common;

/* JADX INFO: loaded from: classes18.dex */
public enum g {
    UUID_EXPIRED(402),
    UUID_CANCELED(403),
    UUID_SCANED(404),
    UUID_CONFIRM(Common.HTTP_STATUS_METHOD_NOT_ALLOWED),
    UUID_KEEP_CONNECT(408),
    UUID_ERROR(500);

    private int code;

    g(int i) {
        this.code = i;
    }

    public final int getCode() {
        return this.code;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "UUIDStatusCode:" + this.code;
    }
}
