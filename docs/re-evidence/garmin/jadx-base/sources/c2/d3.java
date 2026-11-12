package c2;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B#\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lc2/d3;", "Lh5/x0;", "Lc2/e3;", "Lc2/k3;", "insets", "Lkotlin/Function1;", "Li5/m2;", "", "inspectorInfo", "<init>", "(Lc2/k3;Le23/l;)V", "foundation-layout"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class d3 extends h5.x0<e3> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k3 f22623a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e23.l<kotlin.m2, Unit> f22624b;

    /* JADX WARN: Multi-variable type inference failed */
    public d3(k3 k3Var, e23.l<? super kotlin.m2, Unit> lVar) {
        this.f22623a = k3Var;
        this.f22624b = lVar;
    }

    @Override // h5.x0
    public final h4.r.c create() {
        return new e3(this.f22623a);
    }

    @Override // h5.x0
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d3) {
            return p005kotlin.jvm.internal.s.g(((d3) obj).f22623a, this.f22623a);
        }
        return false;
    }

    @Override // h5.x0
    public final int hashCode() {
        return this.f22623a.hashCode();
    }

    @Override // h5.x0
    public final void inspectableProperties(kotlin.m2 m2Var) {
        this.f22624b.invoke(m2Var);
    }

    @Override // h5.x0
    public final void update(h4.r.c cVar) {
        e3 e3Var = (e3) cVar;
        k3 k3Var = e3Var.f22640c;
        k3 k3Var2 = this.f22623a;
        if (p005kotlin.jvm.internal.s.g(k3Var2, k3Var)) {
            return;
        }
        e3Var.f22640c = k3Var2;
        e3Var.V1();
    }
}
