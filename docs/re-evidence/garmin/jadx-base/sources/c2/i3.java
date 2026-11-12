package c2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lc2/i3;", "Lh5/x0;", "Lc2/j3;", "Lh4/d$c;", "alignment", "<init>", "(Lh4/d$c;)V", "foundation-layout"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class i3 extends h5.x0<j3> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h4.d.c f22690a;

    public i3(h4.d.c cVar) {
        this.f22690a = cVar;
    }

    @Override // h5.x0
    public final h4.r.c create() {
        return new j3(this.f22690a);
    }

    @Override // h5.x0
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        i3 i3Var = obj instanceof i3 ? (i3) obj : null;
        if (i3Var == null) {
            return false;
        }
        return p005kotlin.jvm.internal.s.g(this.f22690a, i3Var.f22690a);
    }

    @Override // h5.x0
    public final int hashCode() {
        return this.f22690a.hashCode();
    }

    @Override // h5.x0
    public final void inspectableProperties(kotlin.m2 m2Var) {
        m2Var.f91341a = "align";
        m2Var.f91342b = this.f22690a;
    }

    @Override // h5.x0
    public final void update(h4.r.c cVar) {
        ((j3) cVar).f22717a = this.f22690a;
    }
}
