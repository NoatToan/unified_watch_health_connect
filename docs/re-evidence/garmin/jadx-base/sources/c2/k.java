package c2;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B+\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lc2/k;", "Lh5/x0;", "Lc2/m;", "", "aspectRatio", "", "matchHeightConstraintsFirst", "Lkotlin/Function1;", "Li5/m2;", "", "inspectorInfo", "<init>", "(FZLe23/l;)V", "foundation-layout"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class k extends h5.x0<m> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f22718a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f22719b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e23.l<kotlin.m2, Unit> f22720c;

    /* JADX WARN: Multi-variable type inference failed */
    public k(float f14, boolean z14, e23.l<? super kotlin.m2, Unit> lVar) {
        this.f22718a = f14;
        this.f22719b = z14;
        this.f22720c = lVar;
        if (f14 > 0.0f) {
            return;
        }
        d2.a.a("aspectRatio " + f14 + " must be > 0");
    }

    @Override // h5.x0
    public final h4.r.c create() {
        return new m(this.f22718a, this.f22719b);
    }

    @Override // h5.x0
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        k kVar = obj instanceof k ? (k) obj : null;
        if (kVar != null && this.f22718a == kVar.f22718a) {
            if (this.f22719b == ((k) obj).f22719b) {
                return true;
            }
        }
        return false;
    }

    @Override // h5.x0
    public final int hashCode() {
        return Boolean.hashCode(this.f22719b) + (Float.hashCode(this.f22718a) * 31);
    }

    @Override // h5.x0
    public final void inspectableProperties(kotlin.m2 m2Var) {
        this.f22720c.invoke(m2Var);
    }

    @Override // h5.x0
    public final void update(h4.r.c cVar) {
        m mVar = (m) cVar;
        mVar.f22742a = this.f22718a;
        mVar.f22743b = this.f22719b;
    }
}
