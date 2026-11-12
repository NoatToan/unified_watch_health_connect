package l3;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Ll3/j1;", "Lh5/x0;", "Ll3/i1;", "Lkotlin/Function1;", "Lp5/k0;", "", "properties", "<init>", "(Le23/l;)V", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class j1 extends h5.x0<i1> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e23.l<p5.k0, Unit> f109293a;

    /* JADX WARN: Multi-variable type inference failed */
    public j1(e23.l<? super p5.k0, Unit> lVar) {
        this.f109293a = lVar;
    }

    @Override // h5.x0
    public final h4.r.c create() {
        return new i1(this.f109293a);
    }

    @Override // h5.x0
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j1) {
            return this.f109293a == ((j1) obj).f109293a;
        }
        return false;
    }

    @Override // h5.x0
    public final int hashCode() {
        return this.f109293a.hashCode();
    }

    @Override // h5.x0
    public final void inspectableProperties(kotlin.m2 m2Var) {
        m2Var.f91341a = "parentSemantics";
        m2Var.f91343c.c(this.f109293a, "properties");
    }

    @Override // h5.x0
    public final void update(h4.r.c cVar) {
        i1 i1Var = (i1) cVar;
        i1Var.f109271a = this.f109293a;
        h5.k.g(i1Var).U();
    }
}
