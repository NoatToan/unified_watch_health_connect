package qj;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes7.dex */
public class j extends FilterInputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f144978a;

    public j(InputStream inputStream) {
        super(inputStream);
        this.f144978a = Integer.MIN_VALUE;
    }

    public final long a(long j8) {
        int i14 = this.f144978a;
        if (i14 == 0) {
            return -1L;
        }
        return (i14 == Integer.MIN_VALUE || j8 <= ((long) i14)) ? j8 : i14;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        int i14 = this.f144978a;
        return i14 == Integer.MIN_VALUE ? super.available() : Math.min(i14, super.available());
    }

    public final void c(long j8) {
        int i14 = this.f144978a;
        if (i14 == Integer.MIN_VALUE || j8 == -1) {
            return;
        }
        this.f144978a = (int) (((long) i14) - j8);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i14) {
        super.mark(i14);
        this.f144978a = i14;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        if (a(1L) == -1) {
            return -1;
        }
        int i14 = super.read();
        c(1L);
        return i14;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        super.reset();
        this.f144978a = Integer.MIN_VALUE;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j8) throws IOException {
        long jA = a(j8);
        if (jA == -1) {
            return 0L;
        }
        long jSkip = super.skip(jA);
        c(jSkip);
        return jSkip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i14, int i15) throws IOException {
        int iA = (int) a(i15);
        if (iA == -1) {
            return -1;
        }
        int i16 = super.read(bArr, i14, iA);
        c(i16);
        return i16;
    }
}
