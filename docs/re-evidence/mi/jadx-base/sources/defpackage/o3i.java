package defpackage;

import com.facebook.common.memory.PooledByteBuffer;
import java.io.InputStream;

/* JADX INFO: loaded from: classes4.dex */
public class o3i extends InputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PooledByteBuffer f28696a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f28697b;
    public int c;

    public o3i(PooledByteBuffer pooledByteBuffer) {
        b6i.b(!pooledByteBuffer.isClosed());
        this.f28696a = (PooledByteBuffer) b6i.g(pooledByteBuffer);
        this.f28697b = 0;
        this.c = 0;
    }

    @Override // java.io.InputStream
    public int available() {
        return this.f28696a.size() - this.f28697b;
    }

    @Override // java.io.InputStream
    public void mark(int i) {
        this.c = this.f28697b;
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        if (i < 0 || i2 < 0 || i + i2 > bArr.length) {
            throw new ArrayIndexOutOfBoundsException("length=" + bArr.length + "; regionStart=" + i + "; regionLength=" + i2);
        }
        int iAvailable = available();
        if (iAvailable <= 0) {
            return -1;
        }
        if (i2 <= 0) {
            return 0;
        }
        int iMin = Math.min(iAvailable, i2);
        this.f28696a.i(this.f28697b, bArr, i, iMin);
        this.f28697b += iMin;
        return iMin;
    }

    @Override // java.io.InputStream
    public void reset() {
        this.f28697b = this.c;
    }

    @Override // java.io.InputStream
    public long skip(long j) {
        b6i.b(j >= 0);
        int iMin = Math.min((int) j, available());
        this.f28697b += iMin;
        return iMin;
    }

    @Override // java.io.InputStream
    public int read() {
        if (available() <= 0) {
            return -1;
        }
        PooledByteBuffer pooledByteBuffer = this.f28696a;
        int i = this.f28697b;
        this.f28697b = i + 1;
        return pooledByteBuffer.k(i) & 255;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }
}
