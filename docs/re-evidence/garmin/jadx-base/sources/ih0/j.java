package ih0;

import p005kotlin.Unit;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class j implements e23.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f93456a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f93457b;

    public /* synthetic */ j(m mVar, int i14) {
        this.f93456a = i14;
        this.f93457b = mVar;
    }

    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i14 = this.f93456a;
        m mVar = this.f93457b;
        switch (i14) {
            case 0:
                p3.m mVar2 = (p3.m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                int i15 = m.f93463f;
                if (mVar2.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                    x1 x1Var = p3.n.f135158a;
                    mVar.j(mVar2, h82.c.f82429e);
                } else {
                    mVar2.e();
                }
                break;
            case 1:
                p3.m mVar3 = (p3.m) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                int i16 = m.f93463f;
                if (mVar3.n(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    x1 x1Var2 = p3.n.f135158a;
                    mVar.g(mVar3, h82.c.f82429e);
                } else {
                    mVar3.e();
                }
                break;
            case 2:
                p3.m mVar4 = (p3.m) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                int i17 = m.f93463f;
                if (mVar4.n(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    x1 x1Var3 = p3.n.f135158a;
                    mVar.h(mVar4, h82.c.f82429e);
                } else {
                    mVar4.e();
                }
                break;
            case 3:
                p3.m mVar5 = (p3.m) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                int i18 = m.f93463f;
                if (mVar5.n(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    x1 x1Var4 = p3.n.f135158a;
                    mVar.i(mVar5, h82.c.f82429e);
                } else {
                    mVar5.e();
                }
                break;
            default:
                h82.r rVar = (h82.r) obj;
                p3.m mVar6 = (p3.m) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                int i19 = m.f93463f;
                rVar.getClass();
                if ((iIntValue5 & 6) == 0) {
                    iIntValue5 |= mVar6.B(rVar) ? 4 : 2;
                }
                if (mVar6.n(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                    x1 x1Var5 = p3.n.f135158a;
                    int i24 = ((iIntValue5 << 3) & 112) | 6;
                    rVar.k(z3.f.c(-882158273, new i40.a(rVar, 14), mVar6), mVar6, i24);
                    rVar.a(z3.f.c(2119954792, new i20.b(8, rVar, mVar), mVar6), mVar6, i24);
                } else {
                    mVar6.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
