package u1;

import android.view.View;
import kotlin.m2;
import kotlin.v3;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u008f\u0001\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003\u0012\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\b\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\r\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lu1/g1;", "Lh5/x0;", "Lu1/i1;", "Lkotlin/Function1;", "Lg6/c;", "Ln4/c;", "sourceCenter", "magnifierCenter", "Lg6/h;", "", "onSizeChanged", "", "zoom", "", "useTextDefault", "size", "Lg6/f;", "cornerRadius", "elevation", "clippingEnabled", "Lu1/v1;", "platformMagnifierFactory", "<init>", "(Le23/l;Le23/l;Le23/l;FZJFFZLu1/v1;Lkotlin/jvm/internal/j;)V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class g1 extends h5.x0<i1> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e23.l<g6.c, n4.c> f167503a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e23.l<g6.c, n4.c> f167504b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e23.l<g6.h, Unit> f167505c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f167506d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f167507e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f167508f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f167509g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f167510h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f167511i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final v1 f167512j;

    /* JADX WARN: Illegal instructions before constructor call */
    public g1(e23.l lVar, e23.l lVar2, e23.l lVar3, float f14, boolean z14, long j8, float f15, float f16, boolean z15, v1 v1Var, int i14, p005kotlin.jvm.internal.j jVar) {
        long j14;
        float f17;
        float f18;
        e23.l lVar4 = (i14 & 2) != 0 ? null : lVar2;
        e23.l lVar5 = (i14 & 4) != 0 ? null : lVar3;
        float f19 = (i14 & 8) != 0 ? Float.NaN : f14;
        boolean z16 = (i14 & 16) != 0 ? false : z14;
        if ((i14 & 32) != 0) {
            g6.h.f76000b.getClass();
            j14 = g6.h.f76001c;
        } else {
            j14 = j8;
        }
        if ((i14 & 64) != 0) {
            g6.f.f75994b.getClass();
            f17 = g6.f.f75996d;
        } else {
            f17 = f15;
        }
        if ((i14 & 128) != 0) {
            g6.f.f75994b.getClass();
            f18 = g6.f.f75996d;
        } else {
            f18 = f16;
        }
        this(lVar, lVar4, lVar5, f19, z16, j14, f17, f18, (i14 & 256) != 0 ? true : z15, v1Var, null);
    }

    @Override // h5.x0
    public final h4.r.c create() {
        return new i1(this.f167503a, this.f167504b, this.f167505c, this.f167506d, this.f167507e, this.f167508f, this.f167509g, this.f167510h, this.f167511i, this.f167512j, null);
    }

    @Override // h5.x0
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g1) {
            g1 g1Var = (g1) obj;
            if (this.f167503a == g1Var.f167503a && this.f167504b == g1Var.f167504b && this.f167506d == g1Var.f167506d && this.f167507e == g1Var.f167507e) {
                long j8 = g1Var.f167508f;
                g6.h.a aVar = g6.h.f76000b;
                if (this.f167508f == j8 && g6.f.c(this.f167509g, g1Var.f167509g) && g6.f.c(this.f167510h, g1Var.f167510h) && this.f167511i == g1Var.f167511i && this.f167505c == g1Var.f167505c && p005kotlin.jvm.internal.s.g(this.f167512j, g1Var.f167512j)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // h5.x0
    public final int hashCode() {
        int iHashCode = this.f167503a.hashCode() * 31;
        e23.l<g6.c, n4.c> lVar = this.f167504b;
        int iG = q6.f.g(q6.f.d(this.f167506d, (iHashCode + (lVar != null ? lVar.hashCode() : 0)) * 31, 31), 31, this.f167507e);
        g6.h.a aVar = g6.h.f76000b;
        int iE = q6.f.e(iG, 31, this.f167508f);
        g6.f.a aVar2 = g6.f.f75994b;
        int iG2 = q6.f.g(q6.f.d(this.f167510h, q6.f.d(this.f167509g, iE, 31), 31), 31, this.f167511i);
        e23.l<g6.h, Unit> lVar2 = this.f167505c;
        return this.f167512j.hashCode() + ((iG2 + (lVar2 != null ? lVar2.hashCode() : 0)) * 31);
    }

    @Override // h5.x0
    public final void inspectableProperties(m2 m2Var) {
        m2Var.f91341a = "magnifier";
        v3 v3Var = m2Var.f91343c;
        v3Var.c(this.f167503a, "sourceCenter");
        v3Var.c(this.f167504b, "magnifierCenter");
        v3Var.c(Float.valueOf(this.f167506d), "zoom");
        v3Var.c(g6.h.a(this.f167508f), "size");
        v3Var.c(g6.f.a(this.f167509g), "cornerRadius");
        v3Var.c(g6.f.a(this.f167510h), "elevation");
        v3Var.c(Boolean.valueOf(this.f167511i), "clippingEnabled");
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0098  */
    @Override // h5.x0
    public final void update(h4.r.c cVar) {
        i1 i1Var = (i1) cVar;
        float f14 = i1Var.f167550d;
        long j8 = i1Var.f167552f;
        float f15 = i1Var.f167553g;
        boolean z14 = i1Var.f167551e;
        float f16 = i1Var.f167554h;
        boolean z15 = i1Var.f167555i;
        v1 v1Var = i1Var.f167556j;
        View view2 = i1Var.f167557k;
        g6.c cVar2 = i1Var.f167558l;
        i1Var.f167547a = this.f167503a;
        i1Var.f167548b = this.f167504b;
        float f17 = this.f167506d;
        i1Var.f167550d = f17;
        boolean z16 = this.f167507e;
        i1Var.f167551e = z16;
        long j14 = this.f167508f;
        i1Var.f167552f = j14;
        float f18 = this.f167509g;
        i1Var.f167553g = f18;
        float f19 = this.f167510h;
        i1Var.f167554h = f19;
        boolean z17 = this.f167511i;
        i1Var.f167555i = z17;
        i1Var.f167549c = this.f167505c;
        v1 v1Var2 = this.f167512j;
        i1Var.f167556j = v1Var2;
        View viewA = h5.l.a(i1Var);
        g6.c cVar3 = h5.k.g(i1Var).A;
        if (i1Var.f167559m != null) {
            p5.j0<e23.a<n4.c>> j0Var = j1.f167577a;
            if ((Float.isNaN(f17) && Float.isNaN(f14)) || f17 == f14 || v1Var2.a()) {
                g6.h.a aVar = g6.h.f76000b;
                if (j14 != j8 || !g6.f.c(f18, f15) || !g6.f.c(f19, f16) || z16 != z14 || z17 != z15 || !p005kotlin.jvm.internal.s.g(v1Var2, v1Var) || !viewA.equals(view2) || !p005kotlin.jvm.internal.s.g(cVar3, cVar2)) {
                    i1Var.V1();
                }
            } else {
                i1Var.V1();
            }
        }
        i1Var.W1();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private g1(e23.l<? super g6.c, n4.c> lVar, e23.l<? super g6.c, n4.c> lVar2, e23.l<? super g6.h, Unit> lVar3, float f14, boolean z14, long j8, float f15, float f16, boolean z15, v1 v1Var) {
        this.f167503a = lVar;
        this.f167504b = lVar2;
        this.f167505c = lVar3;
        this.f167506d = f14;
        this.f167507e = z14;
        this.f167508f = j8;
        this.f167509g = f15;
        this.f167510h = f16;
        this.f167511i = z15;
        this.f167512j = v1Var;
    }

    public /* synthetic */ g1(e23.l lVar, e23.l lVar2, e23.l lVar3, float f14, boolean z14, long j8, float f15, float f16, boolean z15, v1 v1Var, p005kotlin.jvm.internal.j jVar) {
        this(lVar, lVar2, lVar3, f14, z14, j8, f15, f16, z15, v1Var);
    }
}
