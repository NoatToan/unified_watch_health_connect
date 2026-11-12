package com.xiaomi.push;

import defpackage.lys;
import java.io.PrintStream;
import java.io.PrintWriter;

/* JADX INFO: loaded from: classes11.dex */
public class ha extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private f f14056a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private Throwable f83a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private lys f84a;

    public ha() {
        this.f84a = null;
        this.f14056a = null;
        this.f83a = null;
    }

    public Throwable a() {
        return this.f83a;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        lys lysVar;
        f fVar;
        String message = super.getMessage();
        if (message != null || (fVar = this.f14056a) == null) {
            return (message != null || (lysVar = this.f84a) == null) ? message : lysVar.toString();
        }
        return fVar.toString();
    }

    @Override // java.lang.Throwable
    public void printStackTrace() {
        printStackTrace(System.err);
    }

    @Override // java.lang.Throwable
    public String toString() {
        StringBuilder sb = new StringBuilder();
        String message = super.getMessage();
        if (message != null) {
            sb.append(message);
            sb.append(": ");
        }
        f fVar = this.f14056a;
        if (fVar != null) {
            sb.append(fVar);
        }
        lys lysVar = this.f84a;
        if (lysVar != null) {
            sb.append(lysVar);
        }
        if (this.f83a != null) {
            sb.append("\n  -- caused by: ");
            sb.append(this.f83a);
        }
        return sb.toString();
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintStream printStream) {
        super.printStackTrace(printStream);
        if (this.f83a != null) {
            printStream.println("Nested Exception: ");
            this.f83a.printStackTrace(printStream);
        }
    }

    public ha(String str) {
        super(str);
        this.f84a = null;
        this.f14056a = null;
        this.f83a = null;
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintWriter printWriter) {
        super.printStackTrace(printWriter);
        if (this.f83a != null) {
            printWriter.println("Nested Exception: ");
            this.f83a.printStackTrace(printWriter);
        }
    }

    public ha(Throwable th) {
        this.f84a = null;
        this.f14056a = null;
        this.f83a = th;
    }

    public ha(lys lysVar) {
        this.f14056a = null;
        this.f83a = null;
        this.f84a = lysVar;
    }

    public ha(String str, Throwable th) {
        super(str);
        this.f84a = null;
        this.f14056a = null;
        this.f83a = th;
    }
}
