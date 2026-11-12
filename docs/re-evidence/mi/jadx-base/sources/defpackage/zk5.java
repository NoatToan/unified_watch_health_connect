package defpackage;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.upstream.a;
import com.google.android.exoplayer2.upstream.b;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zk5 extends cw3 {
    public byte[] j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public volatile boolean f41396k;

    public zk5(a aVar, b bVar, int i, Format format, int i2, Object obj, byte[] bArr) {
        super(aVar, bVar, i, format, i2, obj, -9223372036854775807L, -9223372036854775807L);
        this.j = bArr == null ? wlq.f : bArr;
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.e
    public final void b() {
        this.f41396k = true;
    }

    public abstract void f(byte[] bArr, int i) throws IOException;

    public byte[] g() {
        return this.j;
    }

    public final void h(int i) {
        byte[] bArr = this.j;
        if (bArr.length < i + 16384) {
            this.j = Arrays.copyOf(bArr, bArr.length + 16384);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.e
    public final void load() throws IOException {
        try {
            this.i.b(this.f14795b);
            int i = 0;
            int i2 = 0;
            while (i != -1 && !this.f41396k) {
                h(i2);
                i = this.i.read(this.j, i2, 16384);
                if (i != -1) {
                    i2 += i;
                }
            }
            if (!this.f41396k) {
                f(this.j, i2);
            }
        } finally {
            wlq.n(this.i);
        }
    }
}
