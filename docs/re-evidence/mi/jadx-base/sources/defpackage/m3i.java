package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes4.dex */
public class m3i extends InputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InputStream f25713a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f25714b;
    public final frk<byte[]> c;
    public int d = 0;
    public int e = 0;
    public boolean f = false;

    public m3i(InputStream inputStream, byte[] bArr, frk<byte[]> frkVar) {
        this.f25713a = (InputStream) b6i.g(inputStream);
        this.f25714b = (byte[]) b6i.g(bArr);
        this.c = (frk) b6i.g(frkVar);
    }

    public final boolean a() throws IOException {
        if (this.e < this.d) {
            return true;
        }
        int i = this.f25713a.read(this.f25714b);
        if (i <= 0) {
            return false;
        }
        this.d = i;
        this.e = 0;
        return true;
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        b6i.i(this.e <= this.d);
        b();
        return (this.d - this.e) + this.f25713a.available();
    }

    public final void b() throws IOException {
        if (this.f) {
            throw new IOException("stream already closed");
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f) {
            return;
        }
        this.f = true;
        this.c.release(this.f25714b);
        super.close();
    }

    public void finalize() throws Throwable {
        if (!this.f) {
            cm8.i("PooledByteInputStream", "Finalized without closing");
            close();
        }
        super.finalize();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        b6i.i(this.e <= this.d);
        b();
        if (!a()) {
            return -1;
        }
        byte[] bArr = this.f25714b;
        int i = this.e;
        this.e = i + 1;
        return bArr[i] & 255;
    }

    @Override // java.io.InputStream
    public long skip(long j) throws IOException {
        b6i.i(this.e <= this.d);
        b();
        int i = this.d;
        int i2 = this.e;
        long j2 = i - i2;
        if (j2 >= j) {
            this.e = (int) (((long) i2) + j);
            return j;
        }
        this.e = i;
        return j2 + this.f25713a.skip(j - j2);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        b6i.i(this.e <= this.d);
        b();
        if (!a()) {
            return -1;
        }
        int iMin = Math.min(this.d - this.e, i2);
        System.arraycopy(this.f25714b, this.e, bArr, i, iMin);
        this.e += iMin;
        return iMin;
    }
}
