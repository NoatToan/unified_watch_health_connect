package cn.hutool.core.io.watch;

import defpackage.mf8;
import defpackage.tt3;

/* JADX INFO: loaded from: classes.dex */
public class WatchException extends RuntimeException {
    private static final long serialVersionUID = 8068509879445395353L;

    public WatchException(Throwable th) {
        super(mf8.a(th), th);
    }

    public WatchException(String str) {
        super(str);
    }

    public WatchException(String str, Object... objArr) {
        super(tt3.y(str, objArr));
    }

    public WatchException(String str, Throwable th) {
        super(str, th);
    }

    public WatchException(Throwable th, String str, Object... objArr) {
        super(tt3.y(str, objArr), th);
    }
}
