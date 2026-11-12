package com.miui.tsmclient.common.net.internal.okhttp;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public class InternalIOException extends IOException {
    private int mErrorCode;

    public InternalIOException(int i) {
        this.mErrorCode = i;
    }

    public int getErrorCode() {
        return this.mErrorCode;
    }

    public InternalIOException(int i, String str) {
        super(str);
        this.mErrorCode = i;
    }
}
