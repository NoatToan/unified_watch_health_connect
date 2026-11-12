package r2;

import f5.c0;
import h4.r;
import h5.x0;
import kotlin.m2;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001Be\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u001e\u0010\t\u001a\u001a\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0005\u0012\u001e\u0010\n\u001a\u001a\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0005\u0012\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0005¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lr2/k;", "Lh5/x0;", "Lr2/n;", "Lr2/p;", "requester", "Lkotlin/Function1;", "Lt13/d;", "", "", "onShow", "onHide", "Lf5/c0;", "Ln4/d;", "computeContentBounds", "<init>", "(Lr2/p;Le23/l;Le23/l;Le23/l;)V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class k extends x0<n> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f149448a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e23.l<t13.d<? super Unit>, Object> f149449b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e23.l<t13.d<? super Unit>, Object> f149450c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e23.l<c0, n4.d> f149451d;

    /* JADX WARN: Multi-variable type inference failed */
    public k(p pVar, e23.l<? super t13.d<? super Unit>, ? extends Object> lVar, e23.l<? super t13.d<? super Unit>, ? extends Object> lVar2, e23.l<? super c0, n4.d> lVar3) {
        this.f149448a = pVar;
        this.f149449b = lVar;
        this.f149450c = lVar2;
        this.f149451d = lVar3;
    }

    @Override // h5.x0
    public final r.c create() {
        return new n(this.f149448a, this.f149449b, this.f149450c, this.f149451d);
    }

    @Override // h5.x0
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f149448a == kVar.f149448a && this.f149449b == kVar.f149449b && this.f149450c == kVar.f149450c && this.f149451d == kVar.f149451d;
    }

    @Override // h5.x0
    public final int hashCode() {
        int iHashCode = this.f149448a.hashCode() * 31;
        e23.l<t13.d<? super Unit>, Object> lVar = this.f149449b;
        int iHashCode2 = (iHashCode + (lVar != null ? lVar.hashCode() : 0)) * 31;
        e23.l<t13.d<? super Unit>, Object> lVar2 = this.f149450c;
        return this.f149451d.hashCode() + ((iHashCode2 + (lVar2 != null ? lVar2.hashCode() : 0)) * 31);
    }

    @Override // h5.x0
    public final void inspectableProperties(m2 m2Var) {
    }

    @Override // h5.x0
    public final void update(r.c cVar) {
        n nVar = (n) cVar;
        nVar.f149456c.f149467a = null;
        p pVar = this.f149448a;
        nVar.f149456c = pVar;
        pVar.f149467a = nVar;
        pVar.f149468b = nVar.getIsAttached() ? o.Attached : o.Detached;
        nVar.f149457d = this.f149449b;
        nVar.f149458e = this.f149450c;
        nVar.f149459f = this.f149451d;
    }
}
