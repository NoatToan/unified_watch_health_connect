package r2;

import f5.c0;
import o53.c2;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.d0;
import p3.p0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003Be\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u001e\u0010\n\u001a\u001a\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\u0006\u0012\u001e\u0010\u000b\u001a\u001a\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\u0006\u0012\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\r0\u0006¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lr2/n;", "Lh5/m;", "Lh5/h;", "Ls2/e;", "Lr2/p;", "requester", "Lkotlin/Function1;", "Lt13/d;", "", "", "onShow", "onHide", "Lf5/c0;", "Ln4/d;", "computeContentBounds", "<init>", "(Lr2/p;Le23/l;Le23/l;Le23/l;)V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class n extends h5.m implements h5.h, s2.e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public p f149456c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public e23.l<? super t13.d<? super Unit>, ? extends Object> f149457d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public e23.l<? super t13.d<? super Unit>, ? extends Object> f149458e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public e23.l<? super c0, n4.d> f149459f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public c2 f149460g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final d0 f149461h = p0.f(new q42.d(this, 26));

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public n4.d f149462i;

    public n(p pVar, e23.l<? super t13.d<? super Unit>, ? extends Object> lVar, e23.l<? super t13.d<? super Unit>, ? extends Object> lVar2, e23.l<? super c0, n4.d> lVar3) {
        this.f149456c = pVar;
        this.f149457d = lVar;
        this.f149458e = lVar2;
        this.f149459f = lVar3;
        n4.d.f123545e.getClass();
        this.f149462i = n4.d.f123546f;
    }

    @Override // s2.e
    public final o2.d F() {
        return (o2.d) this.f149461h.getF182175a();
    }

    @Override // s2.e
    public final long e0(c0 c0Var) {
        return v1(c0Var).i();
    }

    @Override // h4.r.c
    public final void onAttach() {
        super.onAttach();
        p pVar = this.f149456c;
        pVar.f149468b = o.Attached;
        pVar.f149467a = this;
    }

    @Override // h4.r.c
    public final void onDetach() {
        p pVar = this.f149456c;
        pVar.f149468b = o.Detached;
        pVar.f149467a = null;
        super.onDetach();
    }

    @Override // s2.e
    public final n4.d v1(c0 c0Var) {
        n4.d dVarInvoke;
        if (getIsAttached() && (dVarInvoke = this.f149459f.invoke(c0Var)) != null) {
            this.f149462i = dVarInvoke;
            return dVarInvoke;
        }
        return this.f149462i;
    }
}
