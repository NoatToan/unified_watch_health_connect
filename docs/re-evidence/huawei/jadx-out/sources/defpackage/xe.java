package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes21.dex */
public final class xe extends InputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private byte[] f52759a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f52760b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f52761c;
    private final xa d;
    private final InputStream e;

    public xe(xa xaVar, InputStream inputStream, byte[] bArr, int i, int i2) {
        this.d = xaVar;
        this.e = inputStream;
        this.f52759a = bArr;
        this.f52760b = i;
        this.f52761c = i2;
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        if (this.f52759a != null) {
            return this.f52761c - this.f52760b;
        }
        return this.e.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        e();
        this.e.close();
    }

    @Override // java.io.InputStream
    public void mark(int i) {
        synchronized (this) {
            if (this.f52759a == null) {
                this.e.mark(i);
            }
        }
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.f52759a == null && this.e.markSupported();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        byte[] bArr = this.f52759a;
        if (bArr != null) {
            int i = this.f52760b;
            int i2 = i + 1;
            this.f52760b = i2;
            byte b2 = bArr[i];
            if (i2 >= this.f52761c) {
                e();
            }
            return b2 & 255;
        }
        return this.e.read();
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        byte[] bArr2 = this.f52759a;
        if (bArr2 != null) {
            int i3 = this.f52761c;
            int i4 = this.f52760b;
            int i5 = i3 - i4;
            if (i2 > i5) {
                i2 = i5;
            }
            System.arraycopy(bArr2, i4, bArr, i, i2);
            int i6 = this.f52760b + i2;
            this.f52760b = i6;
            if (i6 >= this.f52761c) {
                e();
            }
            return i2;
        }
        return this.e.read(bArr, i, i2);
    }

    @Override // java.io.InputStream
    public void reset() throws IOException {
        synchronized (this) {
            if (this.f52759a == null) {
                this.e.reset();
            }
        }
    }

    @Override // java.io.InputStream
    public long skip(long j) throws IOException {
        long j2;
        if (this.f52759a != null) {
            int i = this.f52761c;
            int i2 = this.f52760b;
            j2 = i - i2;
            if (j2 > j) {
                this.f52760b = i2 + ((int) j);
                return j;
            }
            e();
            j -= j2;
        } else {
            j2 = 0;
        }
        return j > 0 ? j2 + this.e.skip(j) : j2;
    }

    private void e() {
        byte[] bArr = this.f52759a;
        if (bArr != null) {
            this.f52759a = null;
            xa xaVar = this.d;
            if (xaVar != null) {
                xaVar.e(bArr);
            }
        }
    }
}
