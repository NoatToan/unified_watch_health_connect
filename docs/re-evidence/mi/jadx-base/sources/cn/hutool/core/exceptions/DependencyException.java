package cn.hutool.core.exceptions;

import defpackage.mf8;
import defpackage.tt3;

/* JADX INFO: loaded from: classes.dex */
public class DependencyException extends RuntimeException {
    private static final long serialVersionUID = 8247610319171014183L;

    public DependencyException(Throwable th) {
        super(mf8.a(th), th);
    }

    public DependencyException(String str) {
        super(str);
    }

    public DependencyException(String str, Object... objArr) {
        super(tt3.y(str, objArr));
    }

    public DependencyException(String str, Throwable th) {
        super(str, th);
    }

    public DependencyException(Throwable th, String str, Object... objArr) {
        super(tt3.y(str, objArr), th);
    }
}
