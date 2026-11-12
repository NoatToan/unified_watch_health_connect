package defpackage;

import java.io.Writer;

/* JADX INFO: loaded from: classes4.dex */
public final class irl extends Writer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o7p f22022a;

    public irl(x53 x53Var) {
        this.f22022a = new o7p(x53Var);
    }

    public String a() {
        String strL = this.f22022a.l();
        this.f22022a.w();
        return strL;
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
    }

    @Override // java.io.Writer
    public void write(char[] cArr) {
        this.f22022a.c(cArr, 0, cArr.length);
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i, int i2) {
        this.f22022a.c(cArr, i, i2);
    }

    @Override // java.io.Writer
    public void write(int i) {
        this.f22022a.a((char) i);
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(char c) {
        write(c);
        return this;
    }

    @Override // java.io.Writer
    public void write(String str) {
        this.f22022a.b(str, 0, str.length());
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(CharSequence charSequence) {
        String string = charSequence.toString();
        this.f22022a.b(string, 0, string.length());
        return this;
    }

    @Override // java.io.Writer
    public void write(String str, int i, int i2) {
        this.f22022a.b(str, i, i2);
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(CharSequence charSequence, int i, int i2) {
        String string = charSequence.subSequence(i, i2).toString();
        this.f22022a.b(string, 0, string.length());
        return this;
    }
}
