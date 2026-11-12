package defpackage;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes4.dex */
public class tfe extends FilterInputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f34644a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f34645b;

    public tfe(InputStream inputStream, int i) {
        super(inputStream);
        inputStream.getClass();
        if (i < 0) {
            throw new IllegalArgumentException("limit must be >= 0");
        }
        this.f34644a = i;
        this.f34645b = -1;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() throws IOException {
        return Math.min(((FilterInputStream) this).in.available(), this.f34644a);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void mark(int i) {
        if (((FilterInputStream) this).in.markSupported()) {
            ((FilterInputStream) this).in.mark(i);
            this.f34645b = this.f34644a;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        if (this.f34644a == 0) {
            return -1;
        }
        int i = ((FilterInputStream) this).in.read();
        if (i != -1) {
            this.f34644a--;
        }
        return i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void reset() throws IOException {
        if (!((FilterInputStream) this).in.markSupported()) {
            throw new IOException("mark is not supported");
        }
        if (this.f34645b == -1) {
            throw new IOException("mark not set");
        }
        ((FilterInputStream) this).in.reset();
        this.f34644a = this.f34645b;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j) throws IOException {
        long jSkip = ((FilterInputStream) this).in.skip(Math.min(j, this.f34644a));
        this.f34644a = (int) (((long) this.f34644a) - jSkip);
        return jSkip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.f34644a;
        if (i3 == 0) {
            return -1;
        }
        int i4 = ((FilterInputStream) this).in.read(bArr, i, Math.min(i2, i3));
        if (i4 > 0) {
            this.f34644a -= i4;
        }
        return i4;
    }
}
