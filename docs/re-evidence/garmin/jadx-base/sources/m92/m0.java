package m92;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fB7\b\u0016\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\rB7\b\u0016\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\u0010¨\u0006\u0011"}, d2 = {"Lm92/m0;", "", "Li53/c;", "Lm92/h0;", "values", "Lo4/d0;", "surfaceOutlineColor", "Lm92/m;", "surfaceColor", "Lg6/f;", "surfaceOutlineStroke", "<init>", "(Li53/c;Lo4/d0;Lm92/m;Lg6/f;Lkotlin/jvm/internal/j;)V", "(Li53/c;Lo4/d0;JLg6/f;Lkotlin/jvm/internal/j;)V", "Lm92/m$b;", "surfaceColorGradient", "(Li53/c;Lo4/d0;Lm92/m$b;Lg6/f;Lkotlin/jvm/internal/j;)V", "lib_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i53.c<h0> f117409a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o4.d0 f117410b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m f117411c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g6.f f117412d;

    public /* synthetic */ m0(i53.c cVar, o4.d0 d0Var, m mVar, g6.f fVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(cVar, (i14 & 2) != 0 ? null : d0Var, (i14 & 4) != 0 ? null : mVar, (i14 & 8) != 0 ? null : fVar, (p005kotlin.jvm.internal.j) null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj;
        return p005kotlin.jvm.internal.s.g(this.f117409a, m0Var.f117409a) && p005kotlin.jvm.internal.s.g(this.f117410b, m0Var.f117410b) && p005kotlin.jvm.internal.s.g(this.f117411c, m0Var.f117411c) && p005kotlin.jvm.internal.s.g(this.f117412d, m0Var.f117412d);
    }

    public final int hashCode() {
        int iHashCode;
        int iHashCode2 = this.f117409a.hashCode() * 31;
        o4.d0 d0Var = this.f117410b;
        if (d0Var == null) {
            iHashCode = 0;
        } else {
            long j8 = d0Var.f128833a;
            o13.z.a aVar = o13.z.f128618b;
            iHashCode = Long.hashCode(j8);
        }
        int i14 = (iHashCode2 + iHashCode) * 31;
        m mVar = this.f117411c;
        int iHashCode3 = (i14 + (mVar == null ? 0 : mVar.hashCode())) * 31;
        g6.f fVar = this.f117412d;
        return iHashCode3 + (fVar != null ? Float.hashCode(fVar.f75997a) : 0);
    }

    public final String toString() {
        return "SurfaceChartConfig(values=" + this.f117409a + ", surfaceOutlineColor=" + this.f117410b + ", surfaceColor=" + this.f117411c + ", surfaceOutlineStroke=" + this.f117412d + ")";
    }

    public /* synthetic */ m0(i53.c cVar, o4.d0 d0Var, m.b bVar, g6.f fVar, p005kotlin.jvm.internal.j jVar) {
        this((i53.c<? extends h0>) cVar, d0Var, bVar, fVar);
    }

    public /* synthetic */ m0(i53.c cVar, o4.d0 d0Var, m mVar, g6.f fVar, p005kotlin.jvm.internal.j jVar) {
        this((i53.c<? extends h0>) cVar, d0Var, mVar, fVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private m0(i53.c<? extends h0> cVar, o4.d0 d0Var, m mVar, g6.f fVar) {
        cVar.getClass();
        this.f117409a = cVar;
        this.f117410b = d0Var;
        this.f117411c = mVar;
        this.f117412d = fVar;
    }

    public /* synthetic */ m0(i53.c cVar, o4.d0 d0Var, long j8, g6.f fVar, p005kotlin.jvm.internal.j jVar) {
        this((i53.c<? extends h0>) cVar, d0Var, j8, fVar);
    }

    public /* synthetic */ m0(i53.c cVar, o4.d0 d0Var, long j8, g6.f fVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(cVar, (i14 & 2) != 0 ? null : d0Var, j8, (i14 & 8) != 0 ? null : fVar, (p005kotlin.jvm.internal.j) null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    private m0(i53.c<? extends h0> cVar, o4.d0 d0Var, long j8, g6.f fVar) {
        this(cVar, d0Var, new m.d(j8, null), fVar, (p005kotlin.jvm.internal.j) null);
        cVar.getClass();
    }

    public /* synthetic */ m0(i53.c cVar, o4.d0 d0Var, m.b bVar, g6.f fVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(cVar, (i14 & 2) != 0 ? null : d0Var, bVar, (i14 & 8) != 0 ? null : fVar, (p005kotlin.jvm.internal.j) null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    private m0(i53.c<? extends h0> cVar, o4.d0 d0Var, m.b bVar, g6.f fVar) {
        this((i53.c) cVar, d0Var, (m) bVar, fVar, (p005kotlin.jvm.internal.j) null);
        cVar.getClass();
        bVar.getClass();
    }
}
