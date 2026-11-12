package o4;

import kotlin.m2;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lo4/u;", "Lh5/x0;", "Lo4/v;", "Lkotlin/Function1;", "Lo4/t0;", "", "block", "<init>", "(Le23/l;)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class u extends h5.x0<v> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e23.l<t0, Unit> f129008a;

    /* JADX WARN: Multi-variable type inference failed */
    public u(e23.l<? super t0, Unit> lVar) {
        this.f129008a = lVar;
    }

    @Override // h5.x0
    public final h4.r.c create() {
        return new v(this.f129008a);
    }

    @Override // h5.x0
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof u) {
            return this.f129008a == ((u) obj).f129008a;
        }
        return false;
    }

    @Override // h5.x0
    public final int hashCode() {
        return this.f129008a.hashCode();
    }

    @Override // h5.x0
    public final void inspectableProperties(m2 m2Var) {
        m2Var.f91341a = "graphicsLayer";
        m2Var.f91343c.c(this.f129008a, "block");
    }

    @Override // h5.x0
    public final void update(h4.r.c cVar) {
        h5.c1 c1Var;
        v vVar = (v) cVar;
        e23.l<t0, Unit> lVar = this.f129008a;
        vVar.f129014a = lVar;
        if (vVar.getNode().getIsAttached() && (c1Var = h5.k.e(vVar, 2).f81714t) != null) {
            c1Var.k2(lVar, true);
        }
    }
}
