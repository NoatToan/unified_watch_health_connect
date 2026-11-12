package c2;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B/\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lc2/c0;", "Lh5/x0;", "Lc2/d0;", "Lkotlin/Function1;", "Lc2/k3;", "", "block", "Li5/m2;", "inspectorInfo", "<init>", "(Le23/l;Le23/l;)V", "foundation-layout"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class c0 extends h5.x0<d0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e23.l<k3, Unit> f22609a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e23.l<kotlin.m2, Unit> f22610b;

    /* JADX WARN: Multi-variable type inference failed */
    public c0(e23.l<? super k3, Unit> lVar, e23.l<? super kotlin.m2, Unit> lVar2) {
        this.f22609a = lVar;
        this.f22610b = lVar2;
    }

    @Override // h5.x0
    public final h4.r.c create() {
        return new d0(this.f22609a);
    }

    @Override // h5.x0
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c0) && ((c0) obj).f22609a == this.f22609a;
    }

    @Override // h5.x0
    public final int hashCode() {
        return this.f22609a.hashCode();
    }

    @Override // h5.x0
    public final void inspectableProperties(kotlin.m2 m2Var) {
        this.f22610b.invoke(m2Var);
    }

    @Override // h5.x0
    public final void update(h4.r.c cVar) {
        d0 d0Var = (d0) cVar;
        e23.l<? super k3, Unit> lVar = d0Var.f22619c;
        e23.l<k3, Unit> lVar2 = this.f22609a;
        if (lVar2 != lVar) {
            d0Var.f22619c = lVar2;
        }
    }
}
