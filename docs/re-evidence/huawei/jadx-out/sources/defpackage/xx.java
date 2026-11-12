package defpackage;

import java.io.OutputStream;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes21.dex */
public final class xx extends OutputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f53304a = new byte[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f53305b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private byte[] f53306c;
    private final xw d;
    private final LinkedList<byte[]> e;
    private int h;

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() {
    }

    public xx() {
        this((xw) null);
    }

    public xx(xw xwVar) {
        this(xwVar, 500);
    }

    public xx(int i) {
        this(null, i);
    }

    public xx(xw xwVar, int i) {
        this.e = new LinkedList<>();
        this.d = xwVar;
        this.f53306c = xwVar == null ? new byte[i > 131072 ? 131072 : i] : xwVar.b(2);
    }

    private xx(xw xwVar, byte[] bArr, int i) {
        this.e = new LinkedList<>();
        this.d = null;
        this.f53306c = bArr;
        this.f53305b = i;
    }

    public static xx a(byte[] bArr, int i) {
        return new xx(null, bArr, i);
    }

    public void c() {
        this.h = 0;
        this.f53305b = 0;
        if (this.e.isEmpty()) {
            return;
        }
        this.e.clear();
    }

    public void d() {
        byte[] bArr;
        c();
        xw xwVar = this.d;
        if (xwVar == null || (bArr = this.f53306c) == null) {
            return;
        }
        xwVar.a(2, bArr);
        this.f53306c = null;
    }

    public void c(int i) {
        if (this.f53305b >= this.f53306c.length) {
            g();
        }
        byte[] bArr = this.f53306c;
        int i2 = this.f53305b;
        this.f53305b = i2 + 1;
        bArr[i2] = (byte) i;
    }

    public void e(int i) {
        int i2 = this.f53305b;
        byte[] bArr = this.f53306c;
        int i3 = i2 + 1;
        if (i3 < bArr.length) {
            bArr[i2] = (byte) (i >> 8);
            this.f53305b = i2 + 2;
            bArr[i3] = (byte) i;
        } else {
            c(i >> 8);
            c(i);
        }
    }

    public void d(int i) {
        int i2 = this.f53305b;
        byte[] bArr = this.f53306c;
        int i3 = i2 + 2;
        if (i3 < bArr.length) {
            bArr[i2] = (byte) (i >> 16);
            bArr[i2 + 1] = (byte) (i >> 8);
            this.f53305b = i2 + 3;
            bArr[i3] = (byte) i;
            return;
        }
        c(i >> 16);
        c(i >> 8);
        c(i);
    }

    public byte[] i() {
        int i = this.h + this.f53305b;
        if (i == 0) {
            return f53304a;
        }
        byte[] bArr = new byte[i];
        int i2 = 0;
        for (byte[] bArr2 : this.e) {
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i2, length);
            i2 += length;
        }
        System.arraycopy(this.f53306c, 0, bArr, i2, this.f53305b);
        int i3 = i2 + this.f53305b;
        if (i3 != i) {
            throw new RuntimeException("Internal error: total len assumed to be " + i + ", copied " + i3 + " bytes");
        }
        if (!this.e.isEmpty()) {
            c();
        }
        return bArr;
    }

    public byte[] f() {
        c();
        return this.f53306c;
    }

    public byte[] e() {
        g();
        return this.f53306c;
    }

    public byte[] b(int i) {
        this.f53305b = i;
        return i();
    }

    public byte[] a() {
        return this.f53306c;
    }

    public void a(int i) {
        this.f53305b = i;
    }

    public int b() {
        return this.f53305b;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) {
        while (true) {
            int iMin = Math.min(this.f53306c.length - this.f53305b, i2);
            if (iMin > 0) {
                System.arraycopy(bArr, i, this.f53306c, this.f53305b, iMin);
                i += iMin;
                this.f53305b += iMin;
                i2 -= iMin;
            }
            if (i2 <= 0) {
                return;
            } else {
                g();
            }
        }
    }

    @Override // java.io.OutputStream
    public void write(int i) {
        c(i);
    }

    private void g() {
        int length = this.h + this.f53306c.length;
        if (length < 0) {
            throw new IllegalStateException("Maximum Java array size (2GB) exceeded by `ByteArrayBuilder`");
        }
        this.h = length;
        int iMax = Math.max(length >> 1, 1000);
        if (iMax > 131072) {
            iMax = 131072;
        }
        this.e.add(this.f53306c);
        this.f53306c = new byte[iMax];
        this.f53305b = 0;
    }
}
