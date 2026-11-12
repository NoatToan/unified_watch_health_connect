package dj;

import com.google.common.primitives.UnsignedBytes;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes7.dex */
public class y extends FilterInputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile byte[] f59887a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f59888b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f59889c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f59890d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f59891e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final xi.b f59892f;

    public static class a extends IOException {
        public a(String str) {
            super(str);
        }
    }

    public y(InputStream inputStream, xi.b bVar, int i14) {
        super(inputStream);
        this.f59890d = -1;
        this.f59892f = bVar;
        this.f59887a = (byte[]) bVar.c(i14, byte[].class);
    }

    public static void c() throws IOException {
        throw new IOException("BufferedInputStream is closed");
    }

    public final int a(InputStream inputStream, byte[] bArr) throws IOException {
        int i14 = this.f59890d;
        if (i14 != -1) {
            int i15 = this.f59891e - i14;
            int i16 = this.f59889c;
            if (i15 < i16) {
                if (i14 == 0 && i16 > bArr.length && this.f59888b == bArr.length) {
                    int length = bArr.length * 2;
                    if (length <= i16) {
                        i16 = length;
                    }
                    byte[] bArr2 = (byte[]) this.f59892f.c(i16, byte[].class);
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    this.f59887a = bArr2;
                    this.f59892f.put(bArr);
                    bArr = bArr2;
                } else if (i14 > 0) {
                    System.arraycopy(bArr, i14, bArr, 0, bArr.length - i14);
                }
                int i17 = this.f59891e - this.f59890d;
                this.f59891e = i17;
                this.f59890d = 0;
                this.f59888b = 0;
                int i18 = inputStream.read(bArr, i17, bArr.length - i17);
                int i19 = this.f59891e;
                if (i18 > 0) {
                    i19 += i18;
                }
                this.f59888b = i19;
                return i18;
            }
        }
        int i24 = inputStream.read(bArr);
        if (i24 > 0) {
            this.f59890d = -1;
            this.f59891e = 0;
            this.f59888b = i24;
        }
        return i24;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int available() {
        InputStream inputStream;
        inputStream = ((FilterInputStream) this).in;
        if (this.f59887a == null || inputStream == null) {
            c();
            throw null;
        }
        return (this.f59888b - this.f59891e) + inputStream.available();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f59887a != null) {
            this.f59892f.put(this.f59887a);
            this.f59887a = null;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        ((FilterInputStream) this).in = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i14) {
        this.f59889c = Math.max(this.f59889c, i14);
        this.f59890d = this.f59891e;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read(byte[] bArr, int i14, int i15) {
        int i16;
        int i17;
        byte[] bArr2 = this.f59887a;
        if (bArr2 == null) {
            c();
            throw null;
        }
        if (i15 == 0) {
            return 0;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream == null) {
            c();
            throw null;
        }
        int i18 = this.f59891e;
        int i19 = this.f59888b;
        if (i18 < i19) {
            int i24 = i19 - i18;
            if (i24 >= i15) {
                i24 = i15;
            }
            System.arraycopy(bArr2, i18, bArr, i14, i24);
            this.f59891e += i24;
            if (i24 == i15 || inputStream.available() == 0) {
                return i24;
            }
            i14 += i24;
            i16 = i15 - i24;
        } else {
            i16 = i15;
        }
        while (true) {
            if (this.f59890d == -1 && i16 >= bArr2.length) {
                i17 = inputStream.read(bArr, i14, i16);
                if (i17 == -1) {
                    return i16 != i15 ? i15 - i16 : -1;
                }
            } else {
                if (a(inputStream, bArr2) == -1) {
                    return i16 != i15 ? i15 - i16 : -1;
                }
                if (bArr2 != this.f59887a && (bArr2 = this.f59887a) == null) {
                    c();
                    throw null;
                }
                int i25 = this.f59888b;
                int i26 = this.f59891e;
                i17 = i25 - i26;
                if (i17 >= i16) {
                    i17 = i16;
                }
                System.arraycopy(bArr2, i26, bArr, i14, i17);
                this.f59891e += i17;
            }
            i16 -= i17;
            if (i16 == 0) {
                return i15;
            }
            if (inputStream.available() == 0) {
                return i15 - i16;
            }
            i14 += i17;
        }
    }

    public final synchronized void release() {
        if (this.f59887a != null) {
            this.f59892f.put(this.f59887a);
            this.f59887a = null;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        if (this.f59887a == null) {
            throw new IOException("Stream is closed");
        }
        int i14 = this.f59890d;
        if (-1 == i14) {
            throw new a("Mark has been invalidated, pos: " + this.f59891e + " markLimit: " + this.f59889c);
        }
        this.f59891e = i14;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized long skip(long j8) {
        if (j8 < 1) {
            return 0L;
        }
        byte[] bArr = this.f59887a;
        if (bArr == null) {
            c();
            throw null;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream == null) {
            c();
            throw null;
        }
        int i14 = this.f59888b;
        int i15 = this.f59891e;
        if (i14 - i15 >= j8) {
            this.f59891e = (int) (((long) i15) + j8);
            return j8;
        }
        long j14 = ((long) i14) - ((long) i15);
        this.f59891e = i14;
        if (this.f59890d == -1 || j8 > this.f59889c) {
            long jSkip = inputStream.skip(j8 - j14);
            if (jSkip > 0) {
                this.f59890d = -1;
            }
            return j14 + jSkip;
        }
        if (a(inputStream, bArr) == -1) {
            return j14;
        }
        int i16 = this.f59888b;
        int i17 = this.f59891e;
        if (i16 - i17 >= j8 - j14) {
            this.f59891e = (int) ((((long) i17) + j8) - j14);
            return j8;
        }
        long j15 = (j14 + ((long) i16)) - ((long) i17);
        this.f59891e = i16;
        return j15;
    }

    public y(InputStream inputStream, xi.b bVar) {
        this(inputStream, bVar, 65536);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read() {
        byte[] bArr = this.f59887a;
        InputStream inputStream = ((FilterInputStream) this).in;
        if (bArr != null && inputStream != null) {
            if (this.f59891e >= this.f59888b && a(inputStream, bArr) == -1) {
                return -1;
            }
            if (bArr != this.f59887a && (bArr = this.f59887a) == null) {
                c();
                throw null;
            }
            int i14 = this.f59888b;
            int i15 = this.f59891e;
            if (i14 - i15 <= 0) {
                return -1;
            }
            this.f59891e = i15 + 1;
            return bArr[i15] & UnsignedBytes.MAX_VALUE;
        }
        c();
        throw null;
    }
}
