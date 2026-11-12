package q42;

import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Unit;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class m implements e23.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f142661a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f142662b;

    public /* synthetic */ m(p pVar, int i14) {
        this.f142661a = i14;
        this.f142662b = pVar;
    }

    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i14 = this.f142661a;
        p pVar = this.f142662b;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                int i15 = p.f142668f;
                if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                    x1 x1Var = p3.n.f135158a;
                    pVar.j(mVar, h82.c.f82429e);
                } else {
                    mVar.e();
                }
                break;
            case 1:
                h82.r rVar = (h82.r) obj;
                p3.m mVar2 = (p3.m) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                int i16 = p.f142668f;
                rVar.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= mVar2.B(rVar) ? 4 : 2;
                }
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    x1 x1Var2 = p3.n.f135158a;
                    int i17 = ((iIntValue2 << 3) & 112) | 6;
                    rVar.k(z3.f.c(-1170276617, new pk1.g(rVar, 4), mVar2), mVar2, i17);
                    rVar.a(z3.f.c(-1539428896, new oo0.f(27, rVar, pVar), mVar2), mVar2, i17);
                } else {
                    mVar2.e();
                }
                break;
            case 2:
                p3.m mVar3 = (p3.m) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                int i18 = p.f142668f;
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    x1 x1Var3 = p3.n.f135158a;
                    pVar.k(R.string.title_measuring_weight, R.string.measuring_weight_message, h82.c.f82429e << 6, mVar3);
                } else {
                    mVar3.e();
                }
                break;
            case 3:
                p3.m mVar4 = (p3.m) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                int i19 = p.f142668f;
                if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    x1 x1Var4 = p3.n.f135158a;
                    pVar.g(mVar4, h82.c.f82429e);
                } else {
                    mVar4.e();
                }
                break;
            case 4:
                p3.m mVar5 = (p3.m) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                int i24 = p.f142668f;
                if (mVar5.n(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    x1 x1Var5 = p3.n.f135158a;
                    pVar.h(mVar5, h82.c.f82429e);
                } else {
                    mVar5.e();
                }
                break;
            case 5:
                p3.m mVar6 = (p3.m) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                int i25 = p.f142668f;
                if (mVar6.n(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    x1 x1Var6 = p3.n.f135158a;
                    pVar.k(R.string.title_water_weight, R.string.body_water_percentage_message, h82.c.f82429e << 6, mVar6);
                } else {
                    mVar6.e();
                }
                break;
            case 6:
                p3.m mVar7 = (p3.m) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                int i26 = p.f142668f;
                if (mVar7.n(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    x1 x1Var7 = p3.n.f135158a;
                    pVar.l(mVar7, h82.c.f82429e);
                } else {
                    mVar7.e();
                }
                break;
            default:
                p3.m mVar8 = (p3.m) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                int i27 = p.f142668f;
                if (mVar8.n(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                    x1 x1Var8 = p3.n.f135158a;
                    pVar.i(mVar8, h82.c.f82429e);
                } else {
                    mVar8.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
