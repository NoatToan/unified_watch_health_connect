package ew1;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class s implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f66720a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u f66721b;

    public /* synthetic */ s(u uVar, int i14) {
        this.f66720a = i14;
        this.f66721b = uVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f66720a;
        u uVar = this.f66721b;
        int i15 = 1;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    p3.x1 x1Var = p3.n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(316396110, new s(uVar, i15), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                break;
            default:
                androidx.lifecycle.w1 w1Var = uVar.f66772a;
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    p3.x1 x1Var2 = p3.n.f135158a;
                    f10.o.a(uVar.v6(), 0.0f, ((aw1.h) w1Var.getValue()).C5(uVar.x3()), ((aw1.h) w1Var.getValue()).Y5(), mVar2, 0, 2);
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
