package kq;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class k0 implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f106093a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l0 f106094b;

    public /* synthetic */ k0(l0 l0Var, int i14, int i15) {
        this.f106093a = i15;
        this.f106094b = l0Var;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f106093a;
        l0 l0Var = this.f106094b;
        p3.m mVar = (p3.m) obj;
        ((Integer) obj2).getClass();
        int i15 = l0.f106099g;
        switch (i14) {
            case 0:
                l0Var.h(mVar, p3.p0.t(1));
                break;
            case 1:
                l0Var.i(mVar, p3.p0.t(1));
                break;
            default:
                l0Var.g(mVar, p3.p0.t(1));
                break;
        }
        return Unit.INSTANCE;
    }
}
