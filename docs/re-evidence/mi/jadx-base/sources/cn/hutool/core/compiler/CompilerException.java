package cn.hutool.core.compiler;

import defpackage.mf8;
import defpackage.tt3;

/* JADX INFO: loaded from: classes.dex */
public class CompilerException extends RuntimeException {
    private static final long serialVersionUID = 1;

    public CompilerException(Throwable th) {
        super(mf8.a(th), th);
    }

    public CompilerException(String str) {
        super(str);
    }

    public CompilerException(String str, Object... objArr) {
        super(tt3.y(str, objArr));
    }

    public CompilerException(String str, Throwable th) {
        super(str, th);
    }

    public CompilerException(Throwable th, String str, Object... objArr) {
        super(tt3.y(str, objArr), th);
    }
}
