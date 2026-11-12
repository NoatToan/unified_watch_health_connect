package org.apache.commons.lang;

import java.io.PrintStream;
import java.io.PrintWriter;
import org.apache.commons.lang.exception.Nestable;
import org.apache.commons.lang.exception.NestableDelegate;

/* JADX INFO: loaded from: classes23.dex */
public class NotImplementedException extends UnsupportedOperationException implements Nestable {
    private static final String c = "Code is not implemented";
    private static final long serialVersionUID = -6894122266938754088L;
    private NestableDelegate a;
    private Throwable b;

    public NotImplementedException() {
        super(c);
        this.a = new NestableDelegate(this);
    }

    @Override // java.lang.Throwable, org.apache.commons.lang.exception.Nestable
    public Throwable getCause() {
        return this.b;
    }

    @Override // java.lang.Throwable, org.apache.commons.lang.exception.Nestable
    public String getMessage() {
        if (super.getMessage() != null) {
            return super.getMessage();
        }
        Throwable th = this.b;
        if (th != null) {
            return th.toString();
        }
        return null;
    }

    @Override // org.apache.commons.lang.exception.Nestable
    public String[] getMessages() {
        return this.a.getMessages();
    }

    @Override // org.apache.commons.lang.exception.Nestable
    public Throwable getThrowable(int i) {
        return this.a.getThrowable(i);
    }

    @Override // org.apache.commons.lang.exception.Nestable
    public int getThrowableCount() {
        return this.a.getThrowableCount();
    }

    @Override // org.apache.commons.lang.exception.Nestable
    public Throwable[] getThrowables() {
        return this.a.getThrowables();
    }

    @Override // org.apache.commons.lang.exception.Nestable
    public int indexOfThrowable(Class cls) {
        return this.a.indexOfThrowable(cls, 0);
    }

    @Override // org.apache.commons.lang.exception.Nestable
    public final void printPartialStackTrace(PrintWriter printWriter) {
        super.printStackTrace(printWriter);
    }

    @Override // java.lang.Throwable
    public void printStackTrace() {
        this.a.printStackTrace();
    }

    @Override // org.apache.commons.lang.exception.Nestable
    public int indexOfThrowable(Class cls, int i) {
        return this.a.indexOfThrowable(cls, i);
    }

    @Override // java.lang.Throwable, org.apache.commons.lang.exception.Nestable
    public void printStackTrace(PrintStream printStream) {
        this.a.printStackTrace(printStream);
    }

    public NotImplementedException(String str) {
        super(str == null ? c : str);
        this.a = new NestableDelegate(this);
    }

    @Override // java.lang.Throwable, org.apache.commons.lang.exception.Nestable
    public void printStackTrace(PrintWriter printWriter) {
        this.a.printStackTrace(printWriter);
    }

    public NotImplementedException(Throwable th) {
        super(c);
        this.a = new NestableDelegate(this);
        this.b = th;
    }

    @Override // org.apache.commons.lang.exception.Nestable
    public String getMessage(int i) {
        if (i == 0) {
            return super.getMessage();
        }
        return this.a.getMessage(i);
    }

    public NotImplementedException(String str, Throwable th) {
        super(str == null ? c : str);
        this.a = new NestableDelegate(this);
        this.b = th;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public NotImplementedException(Class cls) {
        String string;
        if (cls == null) {
            string = c;
        } else {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("Code is not implemented in ");
            stringBuffer.append(cls);
            string = stringBuffer.toString();
        }
        super(string);
        this.a = new NestableDelegate(this);
    }
}
