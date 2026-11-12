package defpackage;

import java.io.OutputStream;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes4.dex */
public final class t63 extends OutputStream {
    public static final byte[] f = new byte[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x53 f34357a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedList<byte[]> f34358b;
    public int c;
    public byte[] d;
    public int e;

    public t63() {
        this((x53) null);
    }

    public byte[] D() {
        int i = this.c + this.e;
        if (i == 0) {
            return f;
        }
        byte[] bArr = new byte[i];
        int i2 = 0;
        for (byte[] bArr2 : this.f34358b) {
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i2, length);
            i2 += length;
        }
        System.arraycopy(this.d, 0, bArr, i2, this.e);
        int i3 = i2 + this.e;
        if (i3 == i) {
            if (!this.f34358b.isEmpty()) {
                reset();
            }
            return bArr;
        }
        throw new RuntimeException("Internal error: total len assumed to be " + i + ", copied " + i3 + " bytes");
    }

    public final void a() {
        int length = this.c + this.d.length;
        if (length < 0) {
            throw new IllegalStateException("Maximum Java array size (2GB) exceeded by `ByteArrayBuilder`");
        }
        this.c = length;
        int iMax = Math.max(length >> 1, 1000);
        if (iMax > 262144) {
            iMax = 262144;
        }
        this.f34358b.add(this.d);
        this.d = new byte[iMax];
        this.e = 0;
    }

    public void b(int i) {
        if (this.e >= this.d.length) {
            a();
        }
        byte[] bArr = this.d;
        int i2 = this.e;
        this.e = i2 + 1;
        bArr[i2] = (byte) i;
    }

    public void c(int i) {
        int i2 = this.e;
        int i3 = i2 + 2;
        byte[] bArr = this.d;
        if (i3 >= bArr.length) {
            b(i >> 16);
            b(i >> 8);
            b(i);
        } else {
            bArr[i2] = (byte) (i >> 16);
            bArr[i2 + 1] = (byte) (i >> 8);
            this.e = i2 + 3;
            bArr[i2 + 2] = (byte) i;
        }
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    public void d(int i) {
        int i2 = this.e;
        int i3 = i2 + 1;
        byte[] bArr = this.d;
        if (i3 >= bArr.length) {
            b(i >> 8);
            b(i);
        } else {
            bArr[i2] = (byte) (i >> 8);
            this.e = i2 + 2;
            bArr[i2 + 1] = (byte) i;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() {
    }

    public byte[] l(int i) {
        this.e = i;
        return D();
    }

    public byte[] m() {
        a();
        return this.d;
    }

    public byte[] n() {
        return this.d;
    }

    public int o() {
        return this.e;
    }

    public void p() {
        byte[] bArr;
        reset();
        x53 x53Var = this.f34357a;
        if (x53Var == null || (bArr = this.d) == null) {
            return;
        }
        x53Var.i(2, bArr);
        this.d = null;
    }

    public void reset() {
        this.c = 0;
        this.e = 0;
        if (this.f34358b.isEmpty()) {
            return;
        }
        this.f34358b.clear();
    }

    public byte[] s() {
        reset();
        return this.d;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    public void y(int i) {
        this.e = i;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) {
        while (true) {
            int iMin = Math.min(this.d.length - this.e, i2);
            if (iMin > 0) {
                System.arraycopy(bArr, i, this.d, this.e, iMin);
                i += iMin;
                this.e += iMin;
                i2 -= iMin;
            }
            if (i2 <= 0) {
                return;
            } else {
                a();
            }
        }
    }

    public t63(int i) {
        this(null, i);
    }

    public t63(x53 x53Var) {
        this(x53Var, 500);
    }

    public t63(x53 x53Var, int i) {
        this.f34358b = new LinkedList<>();
        this.f34357a = x53Var;
        this.d = x53Var == null ? new byte[i] : x53Var.a(2);
    }

    @Override // java.io.OutputStream
    public void write(int i) {
        b(i);
    }
}
