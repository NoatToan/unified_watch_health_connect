package defpackage;

import androidx.annotation.VisibleForTesting;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes4.dex */
public final class a63 extends OutputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OutputStream f673a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f674b;
    public nj1 c;
    public int d;

    public a63(OutputStream outputStream, nj1 nj1Var) {
        this(outputStream, nj1Var, 65536);
    }

    public final void a() throws IOException {
        int i = this.d;
        if (i > 0) {
            this.f673a.write(this.f674b, 0, i);
            this.d = 0;
        }
    }

    public final void b() throws IOException {
        if (this.d == this.f674b.length) {
            a();
        }
    }

    public final void c() {
        byte[] bArr = this.f674b;
        if (bArr != null) {
            this.c.put(bArr);
            this.f674b = null;
        }
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            flush();
            this.f673a.close();
            c();
        } catch (Throwable th) {
            this.f673a.close();
            throw th;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        a();
        this.f673a.flush();
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
        int i3 = 0;
        do {
            int i4 = i2 - i3;
            int i5 = i + i3;
            int i6 = this.d;
            if (i6 == 0 && i4 >= this.f674b.length) {
                this.f673a.write(bArr, i5, i4);
                return;
            }
            int iMin = Math.min(i4, this.f674b.length - i6);
            System.arraycopy(bArr, i5, this.f674b, this.d, iMin);
            this.d += iMin;
            i3 += iMin;
            b();
        } while (i3 < i2);
    }

    @VisibleForTesting
    public a63(OutputStream outputStream, nj1 nj1Var, int i) {
        this.f673a = outputStream;
        this.c = nj1Var;
        this.f674b = (byte[]) nj1Var.a(i, byte[].class);
    }

    @Override // java.io.OutputStream
    public void write(int i) throws IOException {
        byte[] bArr = this.f674b;
        int i2 = this.d;
        this.d = i2 + 1;
        bArr[i2] = (byte) i;
        b();
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }
}
