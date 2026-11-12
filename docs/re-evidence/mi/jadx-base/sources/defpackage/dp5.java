package defpackage;

import com.google.android.exoplayer2.upstream.a;
import com.google.android.exoplayer2.upstream.b;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes4.dex */
public final class dp5 extends InputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f15777a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f15778b;
    public long f;
    public boolean d = false;
    public boolean e = false;
    public final byte[] c = new byte[1];

    public dp5(a aVar, b bVar) {
        this.f15777a = aVar;
        this.f15778b = bVar;
    }

    public final void a() throws IOException {
        if (this.d) {
            return;
        }
        this.f15777a.b(this.f15778b);
        this.d = true;
    }

    public void b() throws IOException {
        a();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.e) {
            return;
        }
        this.f15777a.close();
        this.e = true;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (read(this.c) == -1) {
            return -1;
        }
        return this.c[0] & 255;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        rk1.g(!this.e);
        a();
        int i3 = this.f15777a.read(bArr, i, i2);
        if (i3 == -1) {
            return -1;
        }
        this.f += (long) i3;
        return i3;
    }
}
