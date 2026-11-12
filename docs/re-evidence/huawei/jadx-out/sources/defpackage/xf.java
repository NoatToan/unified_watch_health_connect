package defpackage;

import java.io.Writer;

/* JADX INFO: loaded from: classes21.dex */
public final class xf extends Writer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final yh f52820a;

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
    }

    public xf(xw xwVar) {
        this.f52820a = new yh(xwVar);
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(char c2) {
        write(c2);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(CharSequence charSequence) {
        String string = charSequence.toString();
        this.f52820a.e(string, 0, string.length());
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(CharSequence charSequence, int i, int i2) {
        String string = charSequence.subSequence(i, i2).toString();
        this.f52820a.e(string, 0, string.length());
        return this;
    }

    @Override // java.io.Writer
    public void write(char[] cArr) {
        this.f52820a.c(cArr, 0, cArr.length);
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i, int i2) {
        this.f52820a.c(cArr, i, i2);
    }

    @Override // java.io.Writer
    public void write(int i) {
        this.f52820a.c((char) i);
    }

    @Override // java.io.Writer
    public void write(String str) {
        this.f52820a.e(str, 0, str.length());
    }

    @Override // java.io.Writer
    public void write(String str, int i, int i2) {
        this.f52820a.e(str, i, i2);
    }

    public String d() {
        String strD = this.f52820a.d();
        this.f52820a.l();
        return strD;
    }
}
