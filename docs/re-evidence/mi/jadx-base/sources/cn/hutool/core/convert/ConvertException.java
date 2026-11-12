package cn.hutool.core.convert;

import defpackage.mf8;
import defpackage.tt3;

/* JADX INFO: loaded from: classes.dex */
public class ConvertException extends RuntimeException {
    private static final long serialVersionUID = 4730597402855274362L;

    public ConvertException(Throwable th) {
        super(mf8.a(th), th);
    }

    public ConvertException(String str) {
        super(str);
    }

    public ConvertException(String str, Object... objArr) {
        super(tt3.y(str, objArr));
    }

    public ConvertException(String str, Throwable th) {
        super(str, th);
    }

    public ConvertException(Throwable th, String str, Object... objArr) {
        super(tt3.y(str, objArr), th);
    }
}
