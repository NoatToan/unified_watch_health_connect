package kq;

import p005kotlin.Unit;
import p3.x1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class c implements e23.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f106050a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f106051b;

    public /* synthetic */ c(f fVar, int i14) {
        this.f106050a = i14;
        this.f106051b = fVar;
    }

    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i14 = this.f106050a;
        f fVar = this.f106051b;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                int i15 = f.f106067f;
                if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                    x1 x1Var = p3.n.f135158a;
                    fVar.g(mVar, h82.c.f82429e);
                } else {
                    mVar.e();
                }
                break;
            case 1:
                p3.m mVar2 = (p3.m) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                int i16 = f.f106067f;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    x1 x1Var2 = p3.n.f135158a;
                    fVar.i(mVar2, h82.c.f82429e);
                } else {
                    mVar2.e();
                }
                break;
            case 2:
                p3.m mVar3 = (p3.m) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                int i17 = f.f106067f;
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    x1 x1Var3 = p3.n.f135158a;
                    fVar.h(mVar3, h82.c.f82429e);
                } else {
                    mVar3.e();
                }
                break;
            case 3:
                p3.m mVar4 = (p3.m) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                int i18 = f.f106067f;
                if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    x1 x1Var4 = p3.n.f135158a;
                    fVar.j(mVar4, h82.c.f82429e);
                } else {
                    mVar4.e();
                }
                break;
            default:
                h82.r rVar = (h82.r) obj;
                p3.m mVar5 = (p3.m) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                int i19 = f.f106067f;
                rVar.getClass();
                if ((iIntValue5 & 6) == 0) {
                    iIntValue5 |= mVar5.B(rVar) ? 4 : 2;
                }
                if (mVar5.n(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                    x1 x1Var5 = p3.n.f135158a;
                    int i24 = ((iIntValue5 << 3) & 112) | 6;
                    rVar.k(z3.f.c(-405351369, new ix0.f(rVar, 6), mVar5), mVar5, i24);
                    rVar.a(z3.f.c(1321594080, new k41.e(15, rVar, fVar), mVar5), mVar5, i24);
                } else {
                    mVar5.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
