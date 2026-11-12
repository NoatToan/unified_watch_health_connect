package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes4.dex */
public final class vqf extends InputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xuc f37132a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InputStream f37133b;
    public byte[] c;
    public int d;
    public final int e;

    public vqf(xuc xucVar, InputStream inputStream, byte[] bArr, int i, int i2) {
        this.f37132a = xucVar;
        this.f37133b = inputStream;
        this.c = bArr;
        this.d = i;
        this.e = i2;
    }

    public final void a() {
        byte[] bArr = this.c;
        if (bArr != null) {
            this.c = null;
            xuc xucVar = this.f37132a;
            if (xucVar != null) {
                xucVar.r(bArr);
            }
        }
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        return this.c != null ? this.e - this.d : this.f37133b.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        a();
        this.f37133b.close();
    }

    @Override // java.io.InputStream
    public void mark(int i) {
        if (this.c == null) {
            this.f37133b.mark(i);
        }
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.c == null && this.f37133b.markSupported();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        byte[] bArr = this.c;
        if (bArr == null) {
            return this.f37133b.read();
        }
        int i = this.d;
        int i2 = i + 1;
        this.d = i2;
        int i3 = bArr[i] & 255;
        if (i2 >= this.e) {
            a();
        }
        return i3;
    }

    @Override // java.io.InputStream
    public void reset() throws IOException {
        if (this.c == null) {
            this.f37133b.reset();
        }
    }

    @Override // java.io.InputStream
    public long skip(long j) throws IOException {
        long j2;
        if (this.c != null) {
            int i = this.e;
            int i2 = this.d;
            j2 = i - i2;
            if (j2 > j) {
                this.d = i2 + ((int) j);
                return j;
            }
            a();
            j -= j2;
        } else {
            j2 = 0;
        }
        return j > 0 ? j2 + this.f37133b.skip(j) : j2;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        byte[] bArr2 = this.c;
        if (bArr2 != null) {
            int i3 = this.e;
            int i4 = this.d;
            int i5 = i3 - i4;
            if (i2 > i5) {
                i2 = i5;
            }
            System.arraycopy(bArr2, i4, bArr, i, i2);
            int i6 = this.d + i2;
            this.d = i6;
            if (i6 >= this.e) {
                a();
            }
            return i2;
        }
        return this.f37133b.read(bArr, i, i2);
    }
}
