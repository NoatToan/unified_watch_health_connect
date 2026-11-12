package c2;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B#\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lc2/j1;", "Lh5/x0;", "Lc2/k1;", "Lc2/k3;", "insets", "Lkotlin/Function1;", "Li5/m2;", "", "inspectorInfo", "<init>", "(Lc2/k3;Le23/l;)V", "foundation-layout"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class j1 extends h5.x0<k1> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k3 f22714a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e23.l<kotlin.m2, Unit> f22715b;

    /* JADX WARN: Multi-variable type inference failed */
    public j1(k3 k3Var, e23.l<? super kotlin.m2, Unit> lVar) {
        this.f22714a = k3Var;
        this.f22715b = lVar;
    }

    @Override // h5.x0
    public final h4.r.c create() {
        return new k1(this.f22714a);
    }

    @Override // h5.x0
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j1) {
            return p005kotlin.jvm.internal.s.g(((j1) obj).f22714a, this.f22714a);
        }
        return false;
    }

    @Override // h5.x0
    public final int hashCode() {
        return this.f22714a.hashCode();
    }

    @Override // h5.x0
    public final void inspectableProperties(kotlin.m2 m2Var) {
        this.f22715b.invoke(m2Var);
    }

    @Override // h5.x0
    public final void update(h4.r.c cVar) {
        k1 k1Var = (k1) cVar;
        k3 k3Var = k1Var.f22725c;
        k3 k3Var2 = this.f22714a;
        if (p005kotlin.jvm.internal.s.g(k3Var2, k3Var)) {
            return;
        }
        k1Var.f22725c = k3Var2;
        k1Var.V1();
    }
}
