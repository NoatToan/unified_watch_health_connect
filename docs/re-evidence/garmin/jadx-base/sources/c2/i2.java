package c2;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B#\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lc2/i2;", "Lh5/x0;", "Lc2/j2;", "Lc2/h2;", "paddingValues", "Lkotlin/Function1;", "Li5/m2;", "", "inspectorInfo", "<init>", "(Lc2/h2;Le23/l;)V", "foundation-layout"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class i2 extends h5.x0<j2> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h2 f22688a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e23.l<kotlin.m2, Unit> f22689b;

    /* JADX WARN: Multi-variable type inference failed */
    public i2(h2 h2Var, e23.l<? super kotlin.m2, Unit> lVar) {
        this.f22688a = h2Var;
        this.f22689b = lVar;
    }

    @Override // h5.x0
    public final h4.r.c create() {
        return new j2(this.f22688a);
    }

    @Override // h5.x0
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i2) {
            return p005kotlin.jvm.internal.s.g(((i2) obj).f22688a, this.f22688a);
        }
        return false;
    }

    @Override // h5.x0
    public final int hashCode() {
        return this.f22688a.hashCode();
    }

    @Override // h5.x0
    public final void inspectableProperties(kotlin.m2 m2Var) {
        this.f22689b.invoke(m2Var);
    }

    @Override // h5.x0
    public final void update(h4.r.c cVar) {
        j2 j2Var = (j2) cVar;
        h2 h2Var = j2Var.f22716c;
        h2 h2Var2 = this.f22688a;
        if (p005kotlin.jvm.internal.s.g(h2Var2, h2Var)) {
            return;
        }
        j2Var.f22716c = h2Var2;
        j2Var.V1();
    }
}
