package com.huawei.hms.network.embedded;

import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes34.dex */
public final class z9 implements Closeable {
    public static final Logger g = Logger.getLogger(u9.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cb f15655a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f15656b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final bb f15657c;
    public int d;
    public boolean e;
    public final t9.b f;

    public int t() {
        return this.d;
    }

    public void s() throws IOException {
        synchronized (this) {
            if (this.e) {
                throw new IOException("closed");
            }
            if (this.f15656b) {
                Logger logger = g;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(f8.a(">> CONNECTION %s", u9.f15453a.d()));
                }
                this.f15655a.write(u9.f15453a.m());
                this.f15655a.flush();
            }
        }
    }

    public void flush() throws IOException {
        synchronized (this) {
            if (this.e) {
                throw new IOException("closed");
            }
            this.f15655a.flush();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        synchronized (this) {
            this.e = true;
            this.f15655a.close();
        }
    }

    public void b(ca caVar) throws IOException {
        int i;
        synchronized (this) {
            if (this.e) {
                throw new IOException("closed");
            }
            int i2 = 0;
            a(0, caVar.d() * 6, (byte) 4, (byte) 0);
            while (i2 < 10) {
                if (caVar.e(i2)) {
                    if (i2 == 4) {
                        i = 3;
                    } else {
                        i = i2 == 7 ? 4 : i2;
                    }
                    this.f15655a.writeShort(i);
                    this.f15655a.writeInt(caVar.a(i2));
                }
                i2++;
            }
            this.f15655a.flush();
        }
    }

    public void a(boolean z, int i, List<s9> list) throws IOException {
        synchronized (this) {
            if (this.e) {
                throw new IOException("closed");
            }
            this.f.a(list);
            long jB = this.f15657c.B();
            int iMin = (int) Math.min(this.d, jB);
            long j = iMin;
            byte b2 = jB == j ? (byte) 4 : (byte) 0;
            if (z) {
                b2 = (byte) (b2 | 1);
            }
            a(i, iMin, (byte) 1, b2);
            this.f15655a.write(this.f15657c, j);
            if (jB > j) {
                b(i, jB - j);
            }
        }
    }

    public void a(boolean z, int i, bb bbVar, int i2) throws IOException {
        synchronized (this) {
            if (this.e) {
                throw new IOException("closed");
            }
            a(i, z ? (byte) 1 : (byte) 0, bbVar, i2);
        }
    }

    public void a(boolean z, int i, int i2) throws IOException {
        synchronized (this) {
            if (this.e) {
                throw new IOException("closed");
            }
            a(0, 8, (byte) 6, z ? (byte) 1 : (byte) 0);
            this.f15655a.writeInt(i);
            this.f15655a.writeInt(i2);
            this.f15655a.flush();
        }
    }

    public void a(ca caVar) throws IOException {
        synchronized (this) {
            if (this.e) {
                throw new IOException("closed");
            }
            this.d = caVar.c(this.d);
            if (caVar.b() != -1) {
                this.f.a(caVar.b());
            }
            a(0, 0, (byte) 4, (byte) 1);
            this.f15655a.flush();
        }
    }

    public void a(int i, r9 r9Var, byte[] bArr) throws IOException {
        synchronized (this) {
            if (this.e) {
                throw new IOException("closed");
            }
            if (r9Var.f15304a == -1) {
                throw u9.a("errorCode.httpCode == -1", new Object[0]);
            }
            a(0, bArr.length + 8, (byte) 7, (byte) 0);
            this.f15655a.writeInt(i);
            this.f15655a.writeInt(r9Var.f15304a);
            if (bArr.length > 0) {
                this.f15655a.write(bArr);
            }
            this.f15655a.flush();
        }
    }

    public void a(int i, r9 r9Var) throws IOException {
        synchronized (this) {
            if (this.e) {
                throw new IOException("closed");
            }
            if (r9Var.f15304a == -1) {
                throw new IllegalArgumentException();
            }
            a(i, 4, (byte) 3, (byte) 0);
            this.f15655a.writeInt(r9Var.f15304a);
            this.f15655a.flush();
        }
    }

    public void a(int i, long j) throws IOException {
        synchronized (this) {
            if (this.e) {
                throw new IOException("closed");
            }
            if (j == 0 || j > 2147483647L) {
                throw u9.a("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", Long.valueOf(j));
            }
            a(i, 4, (byte) 8, (byte) 0);
            this.f15655a.writeInt((int) j);
            this.f15655a.flush();
        }
    }

    public void a(int i, int i2, List<s9> list) throws IOException {
        synchronized (this) {
            if (this.e) {
                throw new IOException("closed");
            }
            this.f.a(list);
            long jB = this.f15657c.B();
            int iMin = (int) Math.min(this.d - 4, jB);
            long j = iMin;
            a(i, iMin + 4, (byte) 5, jB == j ? (byte) 4 : (byte) 0);
            this.f15655a.writeInt(i2 & Integer.MAX_VALUE);
            this.f15655a.write(this.f15657c, j);
            if (jB > j) {
                b(i, jB - j);
            }
        }
    }

    public void a(int i, int i2, byte b2, byte b3) throws IOException {
        Logger logger = g;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(u9.a(false, i, i2, b2, b3));
        }
        int i3 = this.d;
        if (i2 > i3) {
            throw u9.a("FRAME_SIZE_ERROR length > %d: %d", Integer.valueOf(i3), Integer.valueOf(i2));
        }
        if ((Integer.MIN_VALUE & i) != 0) {
            throw u9.a("reserved bit set: %s", Integer.valueOf(i));
        }
        a(this.f15655a, i2);
        this.f15655a.writeByte(b2 & 255);
        this.f15655a.writeByte(b3 & 255);
        this.f15655a.writeInt(i & Integer.MAX_VALUE);
    }

    public void a(int i, byte b2, bb bbVar, int i2) throws IOException {
        a(i, i2, (byte) 0, b2);
        if (i2 > 0) {
            this.f15655a.write(bbVar, i2);
        }
    }

    private void b(int i, long j) throws IOException {
        while (j > 0) {
            int iMin = (int) Math.min(this.d, j);
            long j2 = iMin;
            j -= j2;
            a(i, iMin, (byte) 9, j == 0 ? (byte) 4 : (byte) 0);
            this.f15655a.write(this.f15657c, j2);
        }
    }

    public static void a(cb cbVar, int i) throws IOException {
        cbVar.writeByte((i >>> 16) & 255);
        cbVar.writeByte((i >>> 8) & 255);
        cbVar.writeByte(i & 255);
    }

    public z9(cb cbVar, boolean z) {
        this.f15655a = cbVar;
        this.f15656b = z;
        bb bbVar = new bb();
        this.f15657c = bbVar;
        this.f = new t9.b(bbVar);
        this.d = 16384;
    }
}
