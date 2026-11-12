package com.bumptech.glide.load;

import java.io.IOException;

/* JADX INFO: loaded from: classes7.dex */
public final class HttpException extends IOException {
    public static final int UNKNOWN = -1;
    private static final long serialVersionUID = 1;
    private final int statusCode;

    public HttpException(String str, int i14, Throwable th3) {
        super(vb.h.h(i14, str, ", status code: "), th3);
        this.statusCode = i14;
    }

    public int getStatusCode() {
        return this.statusCode;
    }

    @Deprecated
    public HttpException(String str) {
        this(str, -1);
    }

    public HttpException(String str, int i14) {
        this(str, i14, null);
    }

    public HttpException(int i14) {
        this("Http request failed", i14);
    }
}
