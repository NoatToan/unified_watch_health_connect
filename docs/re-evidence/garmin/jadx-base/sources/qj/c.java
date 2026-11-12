package qj;

import ds.e0;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes7.dex */
public final class c extends FilterInputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f144963a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f144964b;

    private c(InputStream inputStream, long j8) {
        super(inputStream);
        this.f144963a = j8;
    }

    public static c c(InputStream inputStream, long j8) {
        return new c(inputStream, j8);
    }

    public final void a(int i14) throws IOException {
        int i15 = this.f144964b;
        if (i14 >= 0) {
            this.f144964b = i15 + i14;
            return;
        }
        long j8 = this.f144963a;
        if (j8 - ((long) i15) <= 0) {
            return;
        }
        StringBuilder sbK = e0.k(j8, "Failed to read all expected data, expected: ", ", but read: ");
        sbK.append(this.f144964b);
        throw new IOException(sbK.toString());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int available() {
        return (int) Math.max(this.f144963a - ((long) this.f144964b), ((FilterInputStream) this).in.available());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read() {
        int i14;
        i14 = super.read();
        a(i14 >= 0 ? 1 : -1);
        return i14;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read(byte[] bArr, int i14, int i15) {
        int i16;
        i16 = super.read(bArr, i14, i15);
        a(i16);
        return i16;
    }
}
