package defpackage;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.upstream.a;
import com.google.android.exoplayer2.upstream.b;

/* JADX INFO: loaded from: classes4.dex */
public abstract class tif extends cw3 {
    public final long j;

    public tif(a aVar, b bVar, Format format, int i, Object obj, long j, long j2, long j3) {
        super(aVar, bVar, 1, format, i, obj, j, j2);
        rk1.e(format);
        this.j = j3;
    }

    public long f() {
        long j = this.j;
        if (j != -1) {
            return 1 + j;
        }
        return -1L;
    }

    public abstract boolean g();
}
