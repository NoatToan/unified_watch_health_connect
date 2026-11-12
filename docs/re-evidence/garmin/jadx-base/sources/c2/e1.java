package c2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lc2/e1;", "Lh5/x0;", "Lc2/f1;", "Lh4/d$b;", "horizontal", "<init>", "(Lh4/d$b;)V", "foundation-layout"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class e1 extends h5.x0<f1> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h4.d.b f22633a;

    public e1(h4.d.b bVar) {
        this.f22633a = bVar;
    }

    @Override // h5.x0
    public final h4.r.c create() {
        return new f1(this.f22633a);
    }

    @Override // h5.x0
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        e1 e1Var = obj instanceof e1 ? (e1) obj : null;
        if (e1Var == null) {
            return false;
        }
        return p005kotlin.jvm.internal.s.g(this.f22633a, e1Var.f22633a);
    }

    @Override // h5.x0
    public final int hashCode() {
        return this.f22633a.hashCode();
    }

    @Override // h5.x0
    public final void inspectableProperties(kotlin.m2 m2Var) {
        m2Var.f91341a = "align";
        m2Var.f91342b = this.f22633a;
    }

    @Override // h5.x0
    public final void update(h4.r.c cVar) {
        ((f1) cVar).f22646a = this.f22633a;
    }
}
