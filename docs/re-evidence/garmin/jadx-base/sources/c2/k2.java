package c2;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B#\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lc2/k2;", "Lh5/x0;", "Lc2/n2;", "Lc2/h2;", "paddingValues", "Lkotlin/Function1;", "Li5/m2;", "", "inspectorInfo", "<init>", "(Lc2/h2;Le23/l;)V", "foundation-layout"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class k2 extends h5.x0<n2> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h2 f22726a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e23.l<kotlin.m2, Unit> f22727b;

    /* JADX WARN: Multi-variable type inference failed */
    public k2(h2 h2Var, e23.l<? super kotlin.m2, Unit> lVar) {
        this.f22726a = h2Var;
        this.f22727b = lVar;
    }

    @Override // h5.x0
    public final h4.r.c create() {
        return new n2(this.f22726a);
    }

    @Override // h5.x0
    public final boolean equals(Object obj) {
        k2 k2Var = obj instanceof k2 ? (k2) obj : null;
        if (k2Var == null) {
            return false;
        }
        return p005kotlin.jvm.internal.s.g(this.f22726a, k2Var.f22726a);
    }

    @Override // h5.x0
    public final int hashCode() {
        return this.f22726a.hashCode();
    }

    @Override // h5.x0
    public final void inspectableProperties(kotlin.m2 m2Var) {
        this.f22727b.invoke(m2Var);
    }

    @Override // h5.x0
    public final void update(h4.r.c cVar) {
        ((n2) cVar).f22787a = this.f22726a;
    }
}
