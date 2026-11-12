package cn.hutool.core.exceptions;

import defpackage.tt3;

/* JADX INFO: loaded from: classes.dex */
public class ValidateException extends StatefulException {
    private static final long serialVersionUID = 6057602589533840889L;

    public ValidateException() {
    }

    public ValidateException(String str) {
        super(str);
    }

    public ValidateException(String str, Object... objArr) {
        super(tt3.y(str, objArr));
    }

    public ValidateException(Throwable th) {
        super(th);
    }

    public ValidateException(String str, Throwable th) {
        super(str, th);
    }

    public ValidateException(int i, String str) {
        super(i, str);
    }

    public ValidateException(int i, Throwable th) {
        super(i, th);
    }

    public ValidateException(int i, String str, Throwable th) {
        super(i, str, th);
    }
}
