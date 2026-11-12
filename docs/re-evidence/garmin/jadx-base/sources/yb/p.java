package yb;

import androidx.media3.common.q;
import androidx.media3.common.x;
import bb.l0;
import fa.r;
import fa.z;
import java.io.EOFException;

/* JADX INFO: loaded from: classes.dex */
public final class p implements l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l0 f195669a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n.a f195670b;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public n f195676h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public q f195677i;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f195671c = new b();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f195673e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f195674f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public byte[] f195675g = z.f70076f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final r f195672d = new r();

    public p(l0 l0Var, n.a aVar) {
        this.f195669a = l0Var;
        this.f195670b = aVar;
    }

    @Override // bb.l0
    public final void a(r rVar, int i14, int i15) {
        if (this.f195676h == null) {
            this.f195669a.a(rVar, i14, i15);
            return;
        }
        g(i14);
        rVar.e(this.f195675g, this.f195674f, i14);
        this.f195674f += i14;
    }

    @Override // bb.l0
    public final void c(long j8, int i14, int i15, int i16, l0.a aVar) {
        if (this.f195676h == null) {
            this.f195669a.c(j8, i14, i15, i16, aVar);
            return;
        }
        fa.a.b(aVar == null, "DRM on subtitles is not supported");
        int i17 = (this.f195674f - i16) - i15;
        this.f195676h.c(this.f195675g, i17, i15, n.b.f195663c, new ja.c(this, j8, i14));
        int i18 = i17 + i15;
        this.f195673e = i18;
        if (i18 == this.f195674f) {
            this.f195673e = 0;
            this.f195674f = 0;
        }
    }

    @Override // bb.l0
    public final void d(q qVar) {
        qVar.f8386n.getClass();
        String str = qVar.f8386n;
        fa.a.a(x.h(str) == 3);
        boolean zEquals = qVar.equals(this.f195677i);
        n.a aVar = this.f195670b;
        if (!zEquals) {
            this.f195677i = qVar;
            this.f195676h = aVar.a(qVar) ? aVar.c(qVar) : null;
        }
        n nVar = this.f195676h;
        l0 l0Var = this.f195669a;
        if (nVar == null) {
            l0Var.d(qVar);
            return;
        }
        q.b bVarA = qVar.a();
        bVarA.f8411m = x.n("application/x-media3-cues");
        bVarA.f8408j = str;
        bVarA.f8416r = Long.MAX_VALUE;
        bVarA.H = aVar.b(qVar);
        l0Var.d(bVarA.a());
    }

    @Override // bb.l0
    public final int e(androidx.media3.common.j jVar, int i14, boolean z14) throws EOFException {
        if (this.f195676h == null) {
            return this.f195669a.e(jVar, i14, z14);
        }
        g(i14);
        int i15 = jVar.read(this.f195675g, this.f195674f, i14);
        if (i15 != -1) {
            this.f195674f += i15;
            return i15;
        }
        if (z14) {
            return -1;
        }
        vb.h.m();
        return 0;
    }

    public final void g(int i14) {
        int length = this.f195675g.length;
        int i15 = this.f195674f;
        if (length - i15 >= i14) {
            return;
        }
        int i16 = i15 - this.f195673e;
        int iMax = Math.max(i16 * 2, i14 + i16);
        byte[] bArr = this.f195675g;
        byte[] bArr2 = iMax <= bArr.length ? bArr : new byte[iMax];
        System.arraycopy(bArr, this.f195673e, bArr2, 0, i16);
        this.f195673e = 0;
        this.f195674f = i16;
        this.f195675g = bArr2;
    }
}
