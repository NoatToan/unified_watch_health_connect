package com.xiaomi.push;

import java.io.PrintStream;
import java.io.PrintWriter;

/* JADX INFO: loaded from: classes22.dex */
public class cd extends Exception {
    private cm a;
    private cn b;
    private Throwable c;

    public cd() {
        this.a = null;
        this.b = null;
        this.c = null;
    }

    public cd(cm cmVar) {
        this.a = null;
        this.b = null;
        this.c = null;
        this.a = cmVar;
    }

    public cd(String str) {
        super(str);
        this.a = null;
        this.b = null;
        this.c = null;
    }

    public cd(String str, Throwable th) {
        super(str);
        this.a = null;
        this.b = null;
        this.c = null;
        this.c = th;
    }

    public cd(Throwable th) {
        this.a = null;
        this.b = null;
        this.c = null;
        this.c = th;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        cm cmVar;
        cn cnVar;
        String message = super.getMessage();
        if (message != null || (cnVar = this.b) == null) {
            return (message != null || (cmVar = this.a) == null) ? message : cmVar.toString();
        }
        return cnVar.toString();
    }

    @Override // java.lang.Throwable
    public void printStackTrace() {
        printStackTrace(System.err);
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintStream printStream) {
        super.printStackTrace(printStream);
        if (this.c != null) {
            printStream.println("Nested Exception: ");
            this.c.printStackTrace(printStream);
        }
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintWriter printWriter) {
        super.printStackTrace(printWriter);
        if (this.c != null) {
            printWriter.println("Nested Exception: ");
            this.c.printStackTrace(printWriter);
        }
    }

    @Override // java.lang.Throwable
    public String toString() {
        StringBuilder sb = new StringBuilder();
        String message = super.getMessage();
        if (message != null) {
            sb.append(message);
            sb.append(": ");
        }
        cn cnVar = this.b;
        if (cnVar != null) {
            sb.append(cnVar);
        }
        cm cmVar = this.a;
        if (cmVar != null) {
            sb.append(cmVar);
        }
        if (this.c != null) {
            sb.append("\n  -- caused by: ");
            sb.append(this.c);
        }
        return sb.toString();
    }
}
