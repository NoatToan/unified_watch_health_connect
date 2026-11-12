package i3;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Li3/w5;", "Lh5/x0;", "Li3/x5;", "Lkotlin/Function0;", "", "updateStateOnAttach", "<init>", "(Le23/a;)V", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class w5 extends h5.x0<x5> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e23.a<Unit> f90092a;

    public w5(e23.a<Unit> aVar) {
        this.f90092a = aVar;
    }

    @Override // h5.x0
    public final h4.r.c create() {
        return new x5(this.f90092a);
    }

    @Override // h5.x0
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof w5) {
            return this.f90092a == ((w5) obj).f90092a;
        }
        return false;
    }

    @Override // h5.x0
    public final int hashCode() {
        return this.f90092a.hashCode();
    }

    @Override // h5.x0
    public final void inspectableProperties(kotlin.m2 m2Var) {
        m2Var.f91341a = "exposedDropdownMenuAnchorType";
        m2Var.f91343c.c(this.f90092a, "updateStateOnAttach");
    }

    @Override // h5.x0
    public final void update(h4.r.c cVar) {
        ((x5) cVar).f90282a = this.f90092a;
    }
}
