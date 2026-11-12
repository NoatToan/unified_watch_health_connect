package org.apache.commons.lang.exception;

import defpackage.xig;
import java.io.PrintStream;
import java.io.PrintWriter;

/* JADX INFO: loaded from: classes3.dex */
public class NestableRuntimeException extends RuntimeException implements xig {
    private static final long serialVersionUID = 1;
    private Throwable cause;
    protected NestableDelegate delegate;

    public NestableRuntimeException() {
        this.delegate = new NestableDelegate(this);
        this.cause = null;
    }

    @Override // java.lang.Throwable, defpackage.xig
    public Throwable getCause() {
        return this.cause;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        if (super.getMessage() != null) {
            return super.getMessage();
        }
        Throwable th = this.cause;
        if (th != null) {
            return th.toString();
        }
        return null;
    }

    public String[] getMessages() {
        return this.delegate.getMessages();
    }

    public Throwable getThrowable(int i) {
        return this.delegate.getThrowable(i);
    }

    public int getThrowableCount() {
        return this.delegate.getThrowableCount();
    }

    public Throwable[] getThrowables() {
        return this.delegate.getThrowables();
    }

    public int indexOfThrowable(Class cls) {
        return this.delegate.indexOfThrowable(cls, 0);
    }

    @Override // defpackage.xig
    public final void printPartialStackTrace(PrintWriter printWriter) {
        super.printStackTrace(printWriter);
    }

    @Override // java.lang.Throwable
    public void printStackTrace() {
        this.delegate.printStackTrace();
    }

    public int indexOfThrowable(Class cls, int i) {
        return this.delegate.indexOfThrowable(cls, i);
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintStream printStream) {
        this.delegate.printStackTrace(printStream);
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintWriter printWriter) {
        this.delegate.printStackTrace(printWriter);
    }

    public NestableRuntimeException(String str) {
        super(str);
        this.delegate = new NestableDelegate(this);
        this.cause = null;
    }

    @Override // defpackage.xig
    public String getMessage(int i) {
        if (i == 0) {
            return super.getMessage();
        }
        return this.delegate.getMessage(i);
    }

    public NestableRuntimeException(Throwable th) {
        this.delegate = new NestableDelegate(this);
        this.cause = th;
    }

    public NestableRuntimeException(String str, Throwable th) {
        super(str);
        this.delegate = new NestableDelegate(this);
        this.cause = th;
    }
}
