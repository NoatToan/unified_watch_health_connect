package defpackage;

import com.google.typography.font.sfntly.data.FontData;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public class jgj extends FontData {
    public volatile boolean d;
    public final Object e;
    public volatile long f;
    public volatile int[] g;

    public jgj(r63<? extends r63<?>> r63Var) {
        super(r63Var);
        this.d = false;
        this.e = new Object();
    }

    public static jgj l(byte[] bArr) {
        return new jgj(new epf(bArr));
    }

    public jgj A(int i, int i2) {
        if (i < 0 || i2 < 0 || i > Integer.MAX_VALUE - i2 || i + i2 > f()) {
            throw new IndexOutOfBoundsException("Attempt to bind data outside of its limits.");
        }
        return new jgj(this, i, i2);
    }

    public String B(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("[l=" + e() + ", cs=" + g() + "]\n");
        sb.append(this.f9792a.n(c(0), b(0, i)));
        return sb.toString();
    }

    public long g() {
        if (!this.d) {
            i();
        }
        return this.f;
    }

    public final long h(int i, int i2) {
        long jT = 0;
        while (i <= i2 - 4) {
            jT += t(i);
            i += 4;
        }
        int i3 = i2 & (-4);
        if (i3 >= i2) {
            return jT;
        }
        int iS = s(i3);
        int i4 = i3 + 1;
        int i5 = i3 + 2;
        return jT + ((long) ((iS << 24) | ((i4 < i2 ? s(i4) : 0) << 16) | ((i5 < i2 ? s(i5) : 0) << 8)));
    }

    public final void i() {
        long jH;
        synchronized (this.e) {
            try {
                if (this.d) {
                    return;
                }
                if (this.g == null) {
                    jH = h(0, e());
                } else {
                    int i = 0;
                    jH = 0;
                    while (i < this.g.length) {
                        jH += h(this.g[i], i == this.g.length - 1 ? e() : this.g[i + 1]);
                        i += 2;
                    }
                }
                this.f = jH & 4294967295L;
                this.d = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public int j(apr aprVar) {
        return this.f9792a.a(aprVar.c(0), aprVar.f9792a, c(0), e());
    }

    public int k(OutputStream outputStream) throws IOException {
        return this.f9792a.b(outputStream, c(0), e());
    }

    public int m(int i) {
        if (!d(i, 1)) {
            throw new IndexOutOfBoundsException("Index attempted to be read from is out of bounds: " + Integer.toHexString(i));
        }
        int iC = this.f9792a.c(c(i));
        if (iC >= 0) {
            return (iC << 24) >> 24;
        }
        throw new IndexOutOfBoundsException("Index attempted to be read from is out of bounds: " + Integer.toHexString(i));
    }

    public int n(int i, byte[] bArr, int i2, int i3) {
        int iD = this.f9792a.d(c(i), bArr, i2, b(i, i3));
        if (iD >= 0) {
            return iD;
        }
        throw new IndexOutOfBoundsException("Index attempted to be read from is out of bounds: " + Integer.toHexString(i));
    }

    public int o(int i) {
        return r(i);
    }

    public int p(int i) {
        return q(i);
    }

    public int q(int i) {
        return s(i + 3) | (m(i) << 24) | (s(i + 1) << 16) | (s(i + 2) << 8);
    }

    public int r(int i) {
        return ((s(i + 1) | (m(i) << 8)) << 16) >> 16;
    }

    public int s(int i) {
        if (!d(i, 1)) {
            throw new IndexOutOfBoundsException("Index attempted to be read from is out of bounds: " + Integer.toHexString(i));
        }
        int iC = this.f9792a.c(c(i));
        if (iC >= 0) {
            return iC;
        }
        throw new IndexOutOfBoundsException("Index attempted to be read from is out of bounds: " + Integer.toHexString(i));
    }

    public long t(int i) {
        return ((long) (s(i + 3) | (s(i) << 24) | (s(i + 1) << 16) | (s(i + 2) << 8))) & 4294967295L;
    }

    public String toString() {
        return B(0);
    }

    public int u(int i) {
        long jT = t(i);
        if ((jT & (-2147483648L)) != -2147483648L) {
            return (int) jT;
        }
        throw new ArithmeticException("Long value too large to fit into an integer.");
    }

    public int v(int i) {
        return (s(i + 1) | (s(i) << 8)) & 65535;
    }

    public int w(int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = 0;
        while (i5 != i7) {
            int i8 = (i5 + i7) / 2;
            if (i6 < u((i8 * i2) + i)) {
                i5 = i8;
            } else {
                if (i6 <= u((i8 * i4) + i3)) {
                    return i8;
                }
                i7 = i8 + 1;
            }
        }
        return -1;
    }

    public int x(int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = 0;
        while (i5 != i7) {
            int i8 = (i5 + i7) / 2;
            if (i6 < v((i8 * i2) + i)) {
                i5 = i8;
            } else {
                if (i6 <= v((i8 * i4) + i3)) {
                    return i8;
                }
                i7 = i8 + 1;
            }
        }
        return -1;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0012 A[Catch: all -> 0x0010, TryCatch #0 {all -> 0x0010, blocks: (B:5:0x0005, B:7:0x0008, B:11:0x0015, B:12:0x0018, B:10:0x0012), top: B:16:0x0005 }] */
    public void y(int... iArr) {
        synchronized (this.e) {
            if (iArr != null) {
                try {
                    if (iArr.length > 0) {
                        this.g = Arrays.copyOf(iArr, iArr.length);
                    } else {
                        this.g = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            } else {
                this.g = null;
            }
            this.d = false;
        }
    }

    public jgj z(int i) {
        if (i < 0 || i > f()) {
            throw new IndexOutOfBoundsException("Attempt to bind data outside of its limits.");
        }
        return new jgj(this, i);
    }

    public jgj(jgj jgjVar, int i) {
        super(jgjVar, i);
        this.d = false;
        this.e = new Object();
    }

    public jgj(jgj jgjVar, int i, int i2) {
        super(jgjVar, i, i2);
        this.d = false;
        this.e = new Object();
    }
}
