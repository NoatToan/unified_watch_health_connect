package cn.hutool.core.date;

import defpackage.mf8;
import defpackage.tt3;

/* JADX INFO: loaded from: classes.dex */
public class DateException extends RuntimeException {
    private static final long serialVersionUID = 8247610319171014183L;

    public DateException(Throwable th) {
        super(mf8.a(th), th);
    }

    public DateException(String str) {
        super(str);
    }

    public DateException(String str, Object... objArr) {
        super(tt3.y(str, objArr));
    }

    public DateException(String str, Throwable th) {
        super(str, th);
    }

    public DateException(Throwable th, String str, Object... objArr) {
        super(tt3.y(str, objArr), th);
    }
}
