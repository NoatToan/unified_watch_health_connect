package c2;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B+\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lc2/s1;", "Lh5/x0;", "Lc2/t1;", "Lc2/q1;", "width", "", "enforceIncoming", "Lkotlin/Function1;", "Li5/m2;", "", "inspectorInfo", "<init>", "(Lc2/q1;ZLe23/l;)V", "foundation-layout"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class s1 extends h5.x0<t1> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q1 f22868a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f22869b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e23.l<kotlin.m2, Unit> f22870c;

    /* JADX WARN: Multi-variable type inference failed */
    public s1(q1 q1Var, boolean z14, e23.l<? super kotlin.m2, Unit> lVar) {
        this.f22868a = q1Var;
        this.f22869b = z14;
        this.f22870c = lVar;
    }

    @Override // h5.x0
    public final h4.r.c create() {
        return new t1(this.f22868a, this.f22869b);
    }

    @Override // h5.x0
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        s1 s1Var = obj instanceof s1 ? (s1) obj : null;
        return s1Var != null && this.f22868a == s1Var.f22868a && this.f22869b == s1Var.f22869b;
    }

    @Override // h5.x0
    public final int hashCode() {
        return Boolean.hashCode(this.f22869b) + (this.f22868a.hashCode() * 31);
    }

    @Override // h5.x0
    public final void inspectableProperties(kotlin.m2 m2Var) {
        this.f22870c.invoke(m2Var);
    }

    @Override // h5.x0
    public final void update(h4.r.c cVar) {
        t1 t1Var = (t1) cVar;
        t1Var.f22880a = this.f22868a;
        t1Var.f22881b = this.f22869b;
    }
}
