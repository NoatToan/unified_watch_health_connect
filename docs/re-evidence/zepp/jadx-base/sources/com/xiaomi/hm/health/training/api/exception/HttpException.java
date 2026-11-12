package com.xiaomi.hm.health.training.api.exception;

import java.util.Locale;

/* JADX INFO: loaded from: classes21.dex */
public class HttpException extends RuntimeException {
    private int a;

    public HttpException(int i, String str) {
        super(String.format(Locale.CHINA, "http请求返回不正确的结果, code: %d, url: %s", Integer.valueOf(i), str));
        this.a = i;
    }

    public int getHttpCode() {
        return this.a;
    }
}
