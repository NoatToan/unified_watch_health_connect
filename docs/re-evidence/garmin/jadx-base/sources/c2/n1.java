package c2;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B+\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lc2/n1;", "Lh5/x0;", "Lc2/o1;", "Lc2/q1;", "height", "", "enforceIncoming", "Lkotlin/Function1;", "Li5/m2;", "", "inspectorInfo", "<init>", "(Lc2/q1;ZLe23/l;)V", "foundation-layout"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class n1 extends h5.x0<o1> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q1 f22784a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f22785b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e23.l<kotlin.m2, Unit> f22786c;

    /* JADX WARN: Multi-variable type inference failed */
    public n1(q1 q1Var, boolean z14, e23.l<? super kotlin.m2, Unit> lVar) {
        this.f22784a = q1Var;
        this.f22785b = z14;
        this.f22786c = lVar;
    }

    @Override // h5.x0
    public final h4.r.c create() {
        return new o1(this.f22784a, this.f22785b);
    }

    @Override // h5.x0
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        n1 n1Var = obj instanceof n1 ? (n1) obj : null;
        return n1Var != null && this.f22784a == n1Var.f22784a && this.f22785b == n1Var.f22785b;
    }

    @Override // h5.x0
    public final int hashCode() {
        return Boolean.hashCode(this.f22785b) + (this.f22784a.hashCode() * 31);
    }

    @Override // h5.x0
    public final void inspectableProperties(kotlin.m2 m2Var) {
        this.f22786c.invoke(m2Var);
    }

    @Override // h5.x0
    public final void update(h4.r.c cVar) {
        o1 o1Var = (o1) cVar;
        o1Var.f22803a = this.f22784a;
        o1Var.f22804b = this.f22785b;
    }
}
