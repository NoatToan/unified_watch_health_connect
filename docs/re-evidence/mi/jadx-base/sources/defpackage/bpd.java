package defpackage;

import androidx.health.platform.client.proto.f0;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class bpd extends InputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Iterator<ByteBuffer> f4451a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ByteBuffer f4452b;
    public int c = 0;
    public int d;
    public int e;
    public boolean f;
    public byte[] g;
    public int h;
    public long i;

    public bpd(Iterable<ByteBuffer> iterable) {
        this.f4451a = iterable.iterator();
        for (ByteBuffer byteBuffer : iterable) {
            this.c++;
        }
        this.d = -1;
        if (a()) {
            return;
        }
        this.f4452b = f0.e;
        this.d = 0;
        this.e = 0;
        this.i = 0L;
    }

    public final boolean a() {
        this.d++;
        if (!this.f4451a.hasNext()) {
            return false;
        }
        ByteBuffer next = this.f4451a.next();
        this.f4452b = next;
        this.e = next.position();
        if (this.f4452b.hasArray()) {
            this.f = true;
            this.g = this.f4452b.array();
            this.h = this.f4452b.arrayOffset();
        } else {
            this.f = false;
            this.i = hbq.k(this.f4452b);
            this.g = null;
        }
        return true;
    }

    public final void b(int i) {
        int i2 = this.e + i;
        this.e = i2;
        if (i2 == this.f4452b.limit()) {
            a();
        }
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (this.d == this.c) {
            return -1;
        }
        if (this.f) {
            int i = this.g[this.e + this.h] & 255;
            b(1);
            return i;
        }
        int iW = hbq.w(((long) this.e) + this.i) & 255;
        b(1);
        return iW;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (this.d == this.c) {
            return -1;
        }
        int iLimit = this.f4452b.limit();
        int i3 = this.e;
        int i4 = iLimit - i3;
        if (i2 > i4) {
            i2 = i4;
        }
        if (this.f) {
            System.arraycopy(this.g, i3 + this.h, bArr, i, i2);
            b(i2);
        } else {
            int iPosition = this.f4452b.position();
            vqd.c(this.f4452b, this.e);
            this.f4452b.get(bArr, i, i2);
            vqd.c(this.f4452b, iPosition);
            b(i2);
        }
        return i2;
    }
}
