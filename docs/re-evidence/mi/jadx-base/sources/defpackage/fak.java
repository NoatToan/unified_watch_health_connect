package defpackage;

import androidx.annotation.VisibleForTesting;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes4.dex */
public class fak extends FilterInputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile byte[] f17603a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f17604b;
    public int c;
    public int d;
    public int e;
    public final nj1 f;

    public static class a extends IOException {
        private static final long serialVersionUID = -4338378848813561757L;

        public a(String str) {
            super(str);
        }
    }

    public fak(InputStream inputStream, nj1 nj1Var) {
        this(inputStream, nj1Var, 65536);
    }

    public static IOException d() throws IOException {
        throw new IOException("BufferedInputStream is closed");
    }

    public final int a(InputStream inputStream, byte[] bArr) throws IOException {
        int i = this.d;
        if (i != -1) {
            int i2 = this.e - i;
            int i3 = this.c;
            if (i2 < i3) {
                if (i == 0 && i3 > bArr.length && this.f17604b == bArr.length) {
                    int length = bArr.length * 2;
                    if (length <= i3) {
                        i3 = length;
                    }
                    byte[] bArr2 = (byte[]) this.f.a(i3, byte[].class);
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    this.f17603a = bArr2;
                    this.f.put(bArr);
                    bArr = bArr2;
                } else if (i > 0) {
                    System.arraycopy(bArr, i, bArr, 0, bArr.length - i);
                }
                int i4 = this.e - this.d;
                this.e = i4;
                this.d = 0;
                this.f17604b = 0;
                int i5 = inputStream.read(bArr, i4, bArr.length - i4);
                int i6 = this.e;
                if (i5 > 0) {
                    i6 += i5;
                }
                this.f17604b = i6;
                return i5;
            }
        }
        int i7 = inputStream.read(bArr);
        if (i7 > 0) {
            this.d = -1;
            this.e = 0;
            this.f17604b = i7;
        }
        return i7;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int available() throws IOException {
        InputStream inputStream;
        inputStream = ((FilterInputStream) this).in;
        if (this.f17603a == null || inputStream == null) {
            throw d();
        }
        return (this.f17604b - this.e) + inputStream.available();
    }

    public synchronized void b() {
        this.c = this.f17603a.length;
    }

    public synchronized void c() {
        if (this.f17603a != null) {
            this.f.put(this.f17603a);
            this.f17603a = null;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f17603a != null) {
            this.f.put(this.f17603a);
            this.f17603a = null;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        ((FilterInputStream) this).in = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i) {
        this.c = Math.max(this.c, i);
        this.d = this.e;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return true;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read() throws IOException {
        byte[] bArr = this.f17603a;
        InputStream inputStream = ((FilterInputStream) this).in;
        if (bArr == null || inputStream == null) {
            throw d();
        }
        if (this.e >= this.f17604b && a(inputStream, bArr) == -1) {
            return -1;
        }
        if (bArr != this.f17603a && (bArr = this.f17603a) == null) {
            throw d();
        }
        int i = this.f17604b;
        int i2 = this.e;
        if (i - i2 <= 0) {
            return -1;
        }
        this.e = i2 + 1;
        return bArr[i2] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() throws IOException {
        if (this.f17603a == null) {
            throw new IOException("Stream is closed");
        }
        int i = this.d;
        if (-1 == i) {
            throw new a("Mark has been invalidated, pos: " + this.e + " markLimit: " + this.c);
        }
        this.e = i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized long skip(long j) throws IOException {
        if (j < 1) {
            return 0L;
        }
        byte[] bArr = this.f17603a;
        if (bArr == null) {
            throw d();
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream == null) {
            throw d();
        }
        int i = this.f17604b;
        int i2 = this.e;
        if (i - i2 >= j) {
            this.e = (int) (((long) i2) + j);
            return j;
        }
        long j2 = ((long) i) - ((long) i2);
        this.e = i;
        if (this.d == -1 || j > this.c) {
            long jSkip = inputStream.skip(j - j2);
            if (jSkip > 0) {
                this.d = -1;
            }
            return j2 + jSkip;
        }
        if (a(inputStream, bArr) == -1) {
            return j2;
        }
        int i3 = this.f17604b;
        int i4 = this.e;
        if (i3 - i4 >= j - j2) {
            this.e = (int) ((((long) i4) + j) - j2);
            return j;
        }
        long j3 = (j2 + ((long) i3)) - ((long) i4);
        this.e = i3;
        return j3;
    }

    @VisibleForTesting
    public fak(InputStream inputStream, nj1 nj1Var, int i) {
        super(inputStream);
        this.d = -1;
        this.f = nj1Var;
        this.f17603a = (byte[]) nj1Var.a(i, byte[].class);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        int i4;
        byte[] bArr2 = this.f17603a;
        if (bArr2 == null) {
            throw d();
        }
        if (i2 == 0) {
            return 0;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream != null) {
            int i5 = this.e;
            int i6 = this.f17604b;
            if (i5 < i6) {
                int i7 = i6 - i5 >= i2 ? i2 : i6 - i5;
                System.arraycopy(bArr2, i5, bArr, i, i7);
                this.e += i7;
                if (i7 == i2 || inputStream.available() == 0) {
                    return i7;
                }
                i += i7;
                i3 = i2 - i7;
            } else {
                i3 = i2;
            }
            while (true) {
                if (this.d == -1 && i3 >= bArr2.length) {
                    i4 = inputStream.read(bArr, i, i3);
                    if (i4 == -1) {
                        return i3 != i2 ? i2 - i3 : -1;
                    }
                } else {
                    if (a(inputStream, bArr2) == -1) {
                        return i3 != i2 ? i2 - i3 : -1;
                    }
                    if (bArr2 != this.f17603a && (bArr2 = this.f17603a) == null) {
                        throw d();
                    }
                    int i8 = this.f17604b;
                    int i9 = this.e;
                    i4 = i8 - i9 >= i3 ? i3 : i8 - i9;
                    System.arraycopy(bArr2, i9, bArr, i, i4);
                    this.e += i4;
                }
                i3 -= i4;
                if (i3 == 0) {
                    return i2;
                }
                if (inputStream.available() == 0) {
                    return i2 - i3;
                }
                i += i4;
            }
        } else {
            throw d();
        }
    }
}
