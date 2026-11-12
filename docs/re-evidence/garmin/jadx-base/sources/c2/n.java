package c2;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B+\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lc2/n;", "Lh5/x0;", "Lc2/o;", "Lh4/d;", "alignment", "", "matchParentSize", "Lkotlin/Function1;", "Li5/m2;", "", "inspectorInfo", "<init>", "(Lh4/d;ZLe23/l;)V", "foundation-layout"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class n extends h5.x0<o> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h4.d f22777a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f22778b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e23.l<kotlin.m2, Unit> f22779c;

    /* JADX WARN: Multi-variable type inference failed */
    public n(h4.d dVar, boolean z14, e23.l<? super kotlin.m2, Unit> lVar) {
        this.f22777a = dVar;
        this.f22778b = z14;
        this.f22779c = lVar;
    }

    @Override // h5.x0
    public final h4.r.c create() {
        return new o(this.f22777a, this.f22778b);
    }

    @Override // h5.x0
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        n nVar = obj instanceof n ? (n) obj : null;
        return nVar != null && p005kotlin.jvm.internal.s.g(this.f22777a, nVar.f22777a) && this.f22778b == nVar.f22778b;
    }

    @Override // h5.x0
    public final int hashCode() {
        return Boolean.hashCode(this.f22778b) + (this.f22777a.hashCode() * 31);
    }

    @Override // h5.x0
    public final void inspectableProperties(kotlin.m2 m2Var) {
        this.f22779c.invoke(m2Var);
    }

    @Override // h5.x0
    public final void update(h4.r.c cVar) {
        o oVar = (o) cVar;
        oVar.f22789a = this.f22777a;
        oVar.f22790b = this.f22778b;
    }
}
