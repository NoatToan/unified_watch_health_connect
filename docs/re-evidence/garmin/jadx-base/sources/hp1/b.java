package hp1;

import e23.q;
import h82.r;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.x1;
import z3.f;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class b implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f84940a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f84941b;

    public /* synthetic */ b(e eVar, int i14) {
        this.f84940a = i14;
        this.f84941b = eVar;
    }

    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i14 = this.f84940a;
        e eVar = this.f84941b;
        switch (i14) {
            case 0:
                m mVar = (m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                int i15 = e.f84947f;
                if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                    x1 x1Var = n.f135158a;
                    eVar.i(mVar, h82.c.f82429e);
                } else {
                    mVar.e();
                }
                break;
            case 1:
                m mVar2 = (m) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                int i16 = e.f84947f;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    x1 x1Var2 = n.f135158a;
                    eVar.g(mVar2, h82.c.f82429e);
                } else {
                    mVar2.e();
                }
                break;
            case 2:
                m mVar3 = (m) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                int i17 = e.f84947f;
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    x1 x1Var3 = n.f135158a;
                    eVar.h(mVar3, h82.c.f82429e);
                } else {
                    mVar3.e();
                }
                break;
            default:
                r rVar = (r) obj;
                m mVar4 = (m) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                int i18 = e.f84947f;
                rVar.getClass();
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= mVar4.B(rVar) ? 4 : 2;
                }
                if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                    x1 x1Var4 = n.f135158a;
                    int i19 = ((iIntValue4 << 3) & 112) | 6;
                    rVar.k(f.c(1101446528, new fe1.a(rVar, 21), mVar4), mVar4, i19);
                    rVar.a(f.c(695885289, new g80.e(26, rVar, eVar), mVar4), mVar4, i19);
                } else {
                    mVar4.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
