package com.huawei.hms.network.embedded;

import com.huawei.hms.framework.common.Logger;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes34.dex */
public class f2 extends InputStream {
    public static final String e = "CronetInputStream";
    public static final int f = 32768;
    public static final int g = 1;
    public static final int h = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j2 f14752a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f14753b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ByteBuffer f14754c;
    public IOException d;

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        try {
            this.f14752a.setReadStatus(1);
            if (i2 < 0 || i < 0 || i + i2 > bArr.length) {
                throw new IndexOutOfBoundsException();
            }
            if (i2 == 0) {
                return 0;
            }
            s();
            if (!t()) {
                return -1;
            }
            int iMin = Math.min(this.f14754c.limit() - this.f14754c.position(), i2);
            this.f14754c.get(bArr, i, iMin);
            return iMin;
        } catch (Throwable th) {
            Logger.e(e, "cronet stream read error:", th);
            this.f14752a.setReadStatus(2);
            throw th;
        }
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        try {
            this.f14752a.setReadStatus(1);
            s();
            if (t()) {
                return this.f14754c.get() & 255;
            }
            return -1;
        } catch (Throwable th) {
            Logger.e(e, "cronet stream read error:", th);
            this.f14752a.setReadStatus(2);
            throw th;
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f14752a.disconnect();
    }

    public void a(IOException iOException) {
        this.d = iOException;
        this.f14753b = true;
        this.f14754c = null;
    }

    private boolean t() {
        ByteBuffer byteBuffer = this.f14754c;
        return byteBuffer != null && byteBuffer.hasRemaining();
    }

    private void s() throws IOException {
        if (this.f14753b) {
            IOException iOException = this.d;
            if (iOException != null) {
                throw iOException;
            }
        } else {
            if (t()) {
                return;
            }
            if (this.f14754c == null) {
                this.f14754c = ByteBuffer.allocateDirect(32768);
            }
            this.f14754c.clear();
            this.f14752a.a(this.f14754c);
            IOException iOException2 = this.d;
            if (iOException2 != null) {
                throw iOException2;
            }
            ByteBuffer byteBuffer = this.f14754c;
            if (byteBuffer != null) {
                byteBuffer.flip();
            }
        }
    }

    public f2(j2 j2Var) {
        this.f14752a = j2Var;
    }
}
