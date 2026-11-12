package cn.hutool.core.exceptions;

import defpackage.tt3;

/* JADX INFO: loaded from: classes.dex */
public class StatefulException extends RuntimeException {
    private static final long serialVersionUID = 6057602589533840889L;
    private int status;

    public StatefulException() {
    }

    public int getStatus() {
        return this.status;
    }

    public StatefulException(String str) {
        super(str);
    }

    public StatefulException(String str, Object... objArr) {
        super(tt3.y(str, objArr));
    }

    public StatefulException(Throwable th) {
        super(th);
    }

    public StatefulException(String str, Throwable th) {
        super(str, th);
    }

    public StatefulException(int i, String str) {
        super(str);
        this.status = i;
    }

    public StatefulException(int i, Throwable th) {
        super(th);
        this.status = i;
    }

    public StatefulException(int i, String str, Throwable th) {
        super(str, th);
        this.status = i;
    }
}
