package cn.hutool.core.exceptions;

import defpackage.tt3;

/* JADX INFO: loaded from: classes.dex */
public class NotInitedException extends RuntimeException {
    private static final long serialVersionUID = 8247610319171014183L;

    public NotInitedException(Throwable th) {
        super(th);
    }

    public NotInitedException(String str) {
        super(str);
    }

    public NotInitedException(String str, Object... objArr) {
        super(tt3.y(str, objArr));
    }

    public NotInitedException(String str, Throwable th) {
        super(str, th);
    }

    public NotInitedException(Throwable th, String str, Object... objArr) {
        super(tt3.y(str, objArr), th);
    }
}
