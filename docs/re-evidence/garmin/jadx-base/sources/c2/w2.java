package c2;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BK\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lc2/w2;", "Lh5/x0;", "Lc2/y2;", "Lg6/f;", "minWidth", "minHeight", "maxWidth", "maxHeight", "", "enforceIncoming", "Lkotlin/Function1;", "Li5/m2;", "", "inspectorInfo", "<init>", "(FFFFZLe23/l;Lkotlin/jvm/internal/j;)V", "foundation-layout"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class w2 extends h5.x0<y2> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f22919a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f22920b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f22921c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f22922d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f22923e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final e23.l<kotlin.m2, Unit> f22924f;

    /* JADX WARN: Illegal instructions before constructor call */
    public w2(float f14, float f15, float f16, float f17, boolean z14, e23.l lVar, int i14, p005kotlin.jvm.internal.j jVar) {
        if ((i14 & 1) != 0) {
            g6.f.f75994b.getClass();
            f14 = g6.f.f75996d;
        }
        float f18 = f14;
        if ((i14 & 2) != 0) {
            g6.f.f75994b.getClass();
            f15 = g6.f.f75996d;
        }
        float f19 = f15;
        if ((i14 & 4) != 0) {
            g6.f.f75994b.getClass();
            f16 = g6.f.f75996d;
        }
        float f22 = f16;
        if ((i14 & 8) != 0) {
            g6.f.f75994b.getClass();
            f17 = g6.f.f75996d;
        }
        this(f18, f19, f22, f17, z14, lVar, null);
    }

    @Override // h5.x0
    public final h4.r.c create() {
        return new y2(this.f22919a, this.f22920b, this.f22921c, this.f22922d, this.f22923e, null);
    }

    @Override // h5.x0
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w2)) {
            return false;
        }
        w2 w2Var = (w2) obj;
        return g6.f.c(this.f22919a, w2Var.f22919a) && g6.f.c(this.f22920b, w2Var.f22920b) && g6.f.c(this.f22921c, w2Var.f22921c) && g6.f.c(this.f22922d, w2Var.f22922d) && this.f22923e == w2Var.f22923e;
    }

    @Override // h5.x0
    public final int hashCode() {
        g6.f.a aVar = g6.f.f75994b;
        return Boolean.hashCode(this.f22923e) + q6.f.d(this.f22922d, q6.f.d(this.f22921c, q6.f.d(this.f22920b, Float.hashCode(this.f22919a) * 31, 31), 31), 31);
    }

    @Override // h5.x0
    public final void inspectableProperties(kotlin.m2 m2Var) {
        this.f22924f.invoke(m2Var);
    }

    @Override // h5.x0
    public final void update(h4.r.c cVar) {
        y2 y2Var = (y2) cVar;
        y2Var.f22954a = this.f22919a;
        y2Var.f22955b = this.f22920b;
        y2Var.f22956c = this.f22921c;
        y2Var.f22957d = this.f22922d;
        y2Var.f22958e = this.f22923e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private w2(float f14, float f15, float f16, float f17, boolean z14, e23.l<? super kotlin.m2, Unit> lVar) {
        this.f22919a = f14;
        this.f22920b = f15;
        this.f22921c = f16;
        this.f22922d = f17;
        this.f22923e = z14;
        this.f22924f = lVar;
    }

    public /* synthetic */ w2(float f14, float f15, float f16, float f17, boolean z14, e23.l lVar, p005kotlin.jvm.internal.j jVar) {
        this(f14, f15, f16, f17, z14, lVar);
    }
}
