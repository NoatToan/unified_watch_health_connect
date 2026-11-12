package l3;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Ll3/j0;", "Lh5/x0;", "Ll3/i0;", "Lkotlin/Function1;", "Lp5/k0;", "", "properties", "<init>", "(Le23/l;)V", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class j0 extends h5.x0<i0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e23.l<p5.k0, Unit> f109292a;

    /* JADX WARN: Multi-variable type inference failed */
    public j0(e23.l<? super p5.k0, Unit> lVar) {
        this.f109292a = lVar;
    }

    @Override // h5.x0
    public final h4.r.c create() {
        return new i0(this.f109292a);
    }

    @Override // h5.x0
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j0) {
            return this.f109292a == ((j0) obj).f109292a;
        }
        return false;
    }

    @Override // h5.x0
    public final int hashCode() {
        return this.f109292a.hashCode();
    }

    @Override // h5.x0
    public final void inspectableProperties(kotlin.m2 m2Var) {
        m2Var.f91341a = "childSemantics";
        m2Var.f91343c.c(this.f109292a, "properties");
    }

    @Override // h5.x0
    public final void update(h4.r.c cVar) {
        i0 i0Var = (i0) cVar;
        i0Var.f109270a = this.f109292a;
        h5.k.g(i0Var).U();
    }
}
