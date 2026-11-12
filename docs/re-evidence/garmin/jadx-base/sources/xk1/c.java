package xk1;

import p005kotlin.Unit;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class c implements e23.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f191215a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f191216b;

    public /* synthetic */ c(f fVar, int i14) {
        this.f191215a = i14;
        this.f191216b = fVar;
    }

    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i14 = this.f191215a;
        f fVar = this.f191216b;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                int i15 = f.f191223j;
                if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                    x1 x1Var = p3.n.f135158a;
                    fVar.h(mVar, 0);
                } else {
                    mVar.e();
                }
                break;
            case 1:
                p3.m mVar2 = (p3.m) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                int i16 = f.f191223j;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    x1 x1Var2 = p3.n.f135158a;
                    fVar.g(mVar2, 0);
                } else {
                    mVar2.e();
                }
                break;
            case 2:
                p3.m mVar3 = (p3.m) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                int i17 = f.f191223j;
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    x1 x1Var3 = p3.n.f135158a;
                    fVar.i(mVar3, 0);
                } else {
                    mVar3.e();
                }
                break;
            default:
                h82.r rVar = (h82.r) obj;
                p3.m mVar4 = (p3.m) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                int i18 = f.f191223j;
                rVar.getClass();
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= mVar4.B(rVar) ? 4 : 2;
                }
                if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                    x1 x1Var4 = p3.n.f135158a;
                    int i19 = ((iIntValue4 << 3) & 112) | 6;
                    rVar.k(z3.f.c(-1115879293, new wd0.a(rVar, 13), mVar4), mVar4, i19);
                    rVar.a(z3.f.c(199020090, new wb1.i(28, rVar, fVar), mVar4), mVar4, i19);
                } else {
                    mVar4.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
