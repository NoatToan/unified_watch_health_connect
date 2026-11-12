package defpackage;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.upstream.a;
import com.google.android.exoplayer2.upstream.b;

/* JADX INFO: loaded from: classes4.dex */
public abstract class f92 extends tif {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f17542k;
    public final long l;
    public h92 m;
    public int[] n;

    public f92(a aVar, b bVar, Format format, int i, Object obj, long j, long j2, long j3, long j4, long j5) {
        super(aVar, bVar, format, i, obj, j, j2, j5);
        this.f17542k = j3;
        this.l = j4;
    }

    public final int h(int i) {
        return ((int[]) rk1.i(this.n))[i];
    }

    public final h92 i() {
        return (h92) rk1.i(this.m);
    }

    public void j(h92 h92Var) {
        this.m = h92Var;
        this.n = h92Var.a();
    }
}
