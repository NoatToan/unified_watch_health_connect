package cn.hutool.core.comparator;

import defpackage.mf8;
import defpackage.tt3;

/* JADX INFO: loaded from: classes.dex */
public class ComparatorException extends RuntimeException {
    private static final long serialVersionUID = 4475602435485521971L;

    public ComparatorException(Throwable th) {
        super(mf8.a(th), th);
    }

    public ComparatorException(String str) {
        super(str);
    }

    public ComparatorException(String str, Object... objArr) {
        super(tt3.y(str, objArr));
    }

    public ComparatorException(String str, Throwable th) {
        super(str, th);
    }

    public ComparatorException(Throwable th, String str, Object... objArr) {
        super(tt3.y(str, objArr), th);
    }
}
