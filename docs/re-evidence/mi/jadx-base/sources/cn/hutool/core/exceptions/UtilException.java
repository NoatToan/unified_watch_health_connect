package cn.hutool.core.exceptions;

import defpackage.mf8;
import defpackage.tt3;

/* JADX INFO: loaded from: classes.dex */
public class UtilException extends RuntimeException {
    private static final long serialVersionUID = 8247610319171014183L;

    public UtilException(Throwable th) {
        super(mf8.a(th), th);
    }

    public UtilException(String str) {
        super(str);
    }

    public UtilException(String str, Object... objArr) {
        super(tt3.y(str, objArr));
    }

    public UtilException(String str, Throwable th) {
        super(str, th);
    }

    public UtilException(Throwable th, String str, Object... objArr) {
        super(tt3.y(str, objArr), th);
    }
}
