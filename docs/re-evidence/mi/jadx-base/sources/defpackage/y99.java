package defpackage;

import java.io.OutputStream;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public class y99 extends OutputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z99 f39954a;

    public y99() {
        this(1024);
    }

    public byte[] a() {
        return this.f39954a.d();
    }

    public String b(Charset charset) {
        return new String(a(), (Charset) g4h.e(charset, au3.c()));
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    public String toString() {
        return b(au3.c());
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) {
        this.f39954a.b(bArr, i, i2);
    }

    @Override // java.io.OutputStream
    public void write(int i) {
        this.f39954a.a((byte) i);
    }

    public y99(int i) {
        this.f39954a = new z99(i);
    }
}
