package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes5.dex */
public final class ybs extends InputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InputStream f40025a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f40026b;

    public ybs(InputStream inputStream, long j) {
        this.f40025a = inputStream;
        this.f40026b = j;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        super.close();
        this.f40025a.close();
        this.f40026b = 0L;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        long j = this.f40026b;
        if (j <= 0) {
            return -1;
        }
        this.f40026b = j - 1;
        return this.f40025a.read();
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        long j = this.f40026b;
        if (j <= 0) {
            return -1;
        }
        int i3 = this.f40025a.read(bArr, i, (int) Math.min(i2, j));
        if (i3 != -1) {
            this.f40026b -= (long) i3;
        }
        return i3;
    }
}
