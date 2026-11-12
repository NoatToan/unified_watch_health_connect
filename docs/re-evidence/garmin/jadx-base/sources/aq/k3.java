package aq;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class k3 implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12032a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o3 f12033b;

    public /* synthetic */ k3(o3 o3Var, int i14, int i15) {
        this.f12032a = i15;
        this.f12033b = o3Var;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f12032a;
        o3 o3Var = this.f12033b;
        p3.m mVar = (p3.m) obj;
        ((Integer) obj2).getClass();
        int i15 = o3.f12139h;
        switch (i14) {
            case 0:
                o3Var.l(mVar, p3.p0.t(1));
                break;
            case 1:
                o3Var.g(mVar, p3.p0.t(1));
                break;
            case 2:
                o3Var.m(mVar, p3.p0.t(1));
                break;
            case 3:
                o3Var.k(mVar, p3.p0.t(1));
                break;
            case 4:
                o3Var.h(mVar, p3.p0.t(1));
                break;
            default:
                o3Var.n(mVar, p3.p0.t(1));
                break;
        }
        return Unit.INSTANCE;
    }
}
