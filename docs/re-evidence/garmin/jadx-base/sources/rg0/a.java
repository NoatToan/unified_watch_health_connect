package rg0;

import p005kotlin.Unit;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class a implements e23.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f152503a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f152504b;

    public /* synthetic */ a(d dVar, int i14) {
        this.f152503a = i14;
        this.f152504b = dVar;
    }

    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i14 = this.f152503a;
        d dVar = this.f152504b;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                int i15 = d.f152524f;
                if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                    x1 x1Var = p3.n.f135158a;
                    dVar.i(mVar, h82.c.f82429e);
                } else {
                    mVar.e();
                }
                break;
            case 1:
                p3.m mVar2 = (p3.m) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                int i16 = d.f152524f;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    x1 x1Var2 = p3.n.f135158a;
                    dVar.h(mVar2, h82.c.f82429e);
                } else {
                    mVar2.e();
                }
                break;
            case 2:
                p3.m mVar3 = (p3.m) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                int i17 = d.f152524f;
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    x1 x1Var3 = p3.n.f135158a;
                    dVar.g(mVar3, h82.c.f82429e);
                } else {
                    mVar3.e();
                }
                break;
            default:
                h82.r rVar = (h82.r) obj;
                p3.m mVar4 = (p3.m) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                int i18 = d.f152524f;
                rVar.getClass();
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= mVar4.B(rVar) ? 4 : 2;
                }
                if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                    x1 x1Var4 = p3.n.f135158a;
                    int i19 = ((iIntValue4 << 3) & 112) | 6;
                    rVar.k(z3.f.c(2074483650, new pk1.g(rVar, 24), mVar4), mVar4, i19);
                    rVar.a(z3.f.c(-1867511445, new q72.f(27, rVar, dVar), mVar4), mVar4, i19);
                } else {
                    mVar4.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
