package cn.hutool.core.clone;

import defpackage.mf8;
import defpackage.tt3;

/* JADX INFO: loaded from: classes.dex */
public class CloneRuntimeException extends RuntimeException {
    private static final long serialVersionUID = 6774837422188798989L;

    public CloneRuntimeException(Throwable th) {
        super(mf8.a(th), th);
    }

    public CloneRuntimeException(String str) {
        super(str);
    }

    public CloneRuntimeException(String str, Object... objArr) {
        super(tt3.y(str, objArr));
    }

    public CloneRuntimeException(String str, Throwable th) {
        super(str, th);
    }

    public CloneRuntimeException(Throwable th, String str, Object... objArr) {
        super(tt3.y(str, objArr), th);
    }
}
