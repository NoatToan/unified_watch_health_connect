package kq;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class f0 implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f106068a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g0 f106069b;

    public /* synthetic */ f0(g0 g0Var, int i14, int i15) {
        this.f106068a = i15;
        this.f106069b = g0Var;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f106068a;
        g0 g0Var = this.f106069b;
        p3.m mVar = (p3.m) obj;
        ((Integer) obj2).getClass();
        int i15 = g0.f106072g;
        switch (i14) {
            case 0:
                g0Var.j(mVar, p3.p0.t(1));
                break;
            case 1:
                g0Var.i(mVar, p3.p0.t(1));
                break;
            default:
                g0Var.k(mVar, p3.p0.t(1));
                break;
        }
        return Unit.INSTANCE;
    }
}
