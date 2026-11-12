package c2;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B/\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0003¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lc2/a3;", "Lh5/x0;", "Lc2/b3;", "Lkotlin/Function1;", "Li5/m2;", "", "inspectorInfo", "Lc2/m3;", "Lc2/k3;", "insetsGetter", "<init>", "(Le23/l;Le23/l;)V", "foundation-layout"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class a3 extends h5.x0<b3> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e23.l<kotlin.m2, Unit> f22592a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e23.l<m3, k3> f22593b;

    /* JADX WARN: Multi-variable type inference failed */
    public a3(e23.l<? super kotlin.m2, Unit> lVar, e23.l<? super m3, ? extends k3> lVar2) {
        this.f22592a = lVar;
        this.f22593b = lVar2;
    }

    @Override // h5.x0
    public final h4.r.c create() {
        return new b3(this.f22593b);
    }

    @Override // h5.x0
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a3) {
            return this.f22593b == ((a3) obj).f22593b;
        }
        return false;
    }

    @Override // h5.x0
    public final int hashCode() {
        return this.f22593b.hashCode();
    }

    @Override // h5.x0
    public final void inspectableProperties(kotlin.m2 m2Var) {
        this.f22592a.invoke(m2Var);
    }

    @Override // h5.x0
    public final void update(h4.r.c cVar) {
        b3 b3Var = (b3) cVar;
        e23.l<? super m3, ? extends k3> lVar = b3Var.f22607d;
        e23.l<m3, k3> lVar2 = this.f22593b;
        if (lVar != lVar2) {
            b3Var.f22607d = lVar2;
            m3 m3Var = b3Var.f22608e;
            if (m3Var != null) {
                k3 k3VarInvoke = lVar2.invoke(m3Var);
                if (p005kotlin.jvm.internal.s.g(k3VarInvoke, b3Var.f22725c)) {
                    return;
                }
                b3Var.f22725c = k3VarInvoke;
                b3Var.V1();
            }
        }
    }
}
