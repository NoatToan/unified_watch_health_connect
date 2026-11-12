package cn.hutool.core.bean;

import defpackage.mf8;
import defpackage.tt3;

/* JADX INFO: loaded from: classes.dex */
public class BeanException extends RuntimeException {
    private static final long serialVersionUID = -8096998667745023423L;

    public BeanException(Throwable th) {
        super(mf8.a(th), th);
    }

    public BeanException(String str) {
        super(str);
    }

    public BeanException(String str, Object... objArr) {
        super(tt3.y(str, objArr));
    }

    public BeanException(String str, Throwable th) {
        super(str, th);
    }

    public BeanException(Throwable th, String str, Object... objArr) {
        super(tt3.y(str, objArr), th);
    }
}
