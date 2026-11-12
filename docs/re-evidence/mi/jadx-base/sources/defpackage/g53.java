package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes6.dex */
public class g53 extends InputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InputStream f18610a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f18611b;
    public long c = 0;
    public long d = -1;
    public boolean e = true;

    public g53(InputStream inputStream, long j) {
        this.f18611b = j;
        this.f18610a = inputStream;
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        long j = this.f18611b;
        if (j < 0 || this.c < j) {
            return this.f18610a.available();
        }
        return 0;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.e) {
            this.f18610a.close();
        }
    }

    @Override // java.io.InputStream
    public synchronized void mark(int i) {
        this.f18610a.mark(i);
        this.d = this.c;
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.f18610a.markSupported();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        long j = this.f18611b;
        if (j < 0 || this.c < j) {
            int i = this.f18610a.read();
            this.c++;
            return i;
        }
        throw new IOException("Exceeded configured input limit of " + this.f18611b + " bytes");
    }

    @Override // java.io.InputStream
    public synchronized void reset() throws IOException {
        this.f18610a.reset();
        this.c = this.d;
    }

    @Override // java.io.InputStream
    public long skip(long j) throws IOException {
        long j2 = this.f18611b;
        if (j2 >= 0) {
            j = Math.min(j, j2 - this.c);
        }
        long jSkip = this.f18610a.skip(j);
        this.c += jSkip;
        return jSkip;
    }

    public String toString() {
        return this.f18610a.toString();
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        long j = this.f18611b;
        if (j >= 0 && this.c >= j) {
            throw new IOException("Exceeded configured input limit of " + this.f18611b + " bytes");
        }
        int i3 = this.f18610a.read(bArr, i, i2);
        if (i3 == -1) {
            return -1;
        }
        long j2 = this.c + ((long) i3);
        this.c = j2;
        long j3 = this.f18611b;
        if (j3 < 0 || j2 < j3) {
            return i3;
        }
        throw new IOException("Exceeded configured input limit of " + this.f18611b + " bytes");
    }
}
