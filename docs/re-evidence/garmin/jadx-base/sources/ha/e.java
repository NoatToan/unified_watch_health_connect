package ha;

import com.google.common.primitives.UnsignedBytes;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class e extends InputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f82549a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f82550b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f82552d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f82553e = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f82551c = new byte[1];

    public e(d dVar, g gVar) {
        this.f82549a = dVar;
        this.f82550b = gVar;
    }

    public final void a() {
        if (this.f82552d) {
            return;
        }
        this.f82549a.b(this.f82550b);
        this.f82552d = true;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f82553e) {
            return;
        }
        this.f82549a.close();
        this.f82553e = true;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i14, int i15) {
        fa.a.d(!this.f82553e);
        a();
        int i16 = this.f82549a.read(bArr, i14, i15);
        if (i16 == -1) {
            return -1;
        }
        return i16;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = this.f82551c;
        if (read(bArr, 0, bArr.length) == -1) {
            return -1;
        }
        return bArr[0] & UnsignedBytes.MAX_VALUE;
    }
}
