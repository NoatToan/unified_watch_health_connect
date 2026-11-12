package xn;

import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Unit;
import p3.x1;
import w02.b0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class m implements e23.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f191613a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f191614b;

    public /* synthetic */ m(p pVar, int i14) {
        this.f191613a = i14;
        this.f191614b = pVar;
    }

    /* JADX WARN: Code duplicated, block: B:108:0x01b8  */
    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i14 = this.f191613a;
        int i15 = 2;
        int i16 = 16;
        p pVar = this.f191614b;
        int i17 = 0;
        switch (i14) {
            case 0:
                h82.r rVar = (h82.r) obj;
                p3.m mVar = (p3.m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                int i18 = p.f191619g;
                rVar.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= mVar.B(rVar) ? 4 : 2;
                }
                if (mVar.n(iIntValue & 1, (iIntValue & 19) != 18)) {
                    x1 x1Var = p3.n.f135158a;
                    b0.a(mVar, 0);
                    rVar.c(mVar, iIntValue & 14);
                    boolean zR = mVar.r(pVar);
                    Object objQ = mVar.q();
                    if (zR) {
                        objQ = new o(pVar, i17);
                        mVar.K(objQ);
                    } else {
                        p3.m.f135153a.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new o(pVar, i17);
                            mVar.K(objQ);
                        }
                    }
                    rVar.B(R.string.lbl_calories_during_an_activity, null, false, (e23.a) objQ, mVar, (iIntValue << 12) & 57344, 6);
                } else {
                    mVar.e();
                }
                break;
            case 1:
                p3.m mVar2 = (p3.m) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                int i19 = p.f191619g;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    x1 x1Var2 = p3.n.f135158a;
                    pVar.j(mVar2, 0);
                } else {
                    mVar2.e();
                }
                break;
            case 2:
                p3.m mVar3 = (p3.m) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                int i24 = p.f191619g;
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    x1 x1Var3 = p3.n.f135158a;
                    pVar.g(mVar3, 0);
                } else {
                    mVar3.e();
                }
                break;
            case 3:
                p3.m mVar4 = (p3.m) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                int i25 = p.f191619g;
                if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    x1 x1Var4 = p3.n.f135158a;
                    pVar.h(mVar4, 0);
                } else {
                    mVar4.e();
                }
                break;
            case 4:
                p3.m mVar5 = (p3.m) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                int i26 = p.f191619g;
                if (mVar5.n(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    x1 x1Var5 = p3.n.f135158a;
                    pVar.i(mVar5, 0);
                } else {
                    mVar5.e();
                }
                break;
            case 5:
                p3.m mVar6 = (p3.m) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                int i27 = p.f191619g;
                if (mVar6.n(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    x1 x1Var6 = p3.n.f135158a;
                    pVar.j(mVar6, 0);
                } else {
                    mVar6.e();
                }
                break;
            case 6:
                p3.m mVar7 = (p3.m) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                int i28 = p.f191619g;
                if (mVar7.n(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    x1 x1Var7 = p3.n.f135158a;
                    pVar.g(mVar7, 0);
                } else {
                    mVar7.e();
                }
                break;
            case 7:
                p3.m mVar8 = (p3.m) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                int i29 = p.f191619g;
                if (mVar8.n(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                    x1 x1Var8 = p3.n.f135158a;
                    pVar.h(mVar8, 0);
                } else {
                    mVar8.e();
                }
                break;
            default:
                h82.r rVar2 = (h82.r) obj;
                p3.m mVar9 = (p3.m) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                int i30 = p.f191619g;
                rVar2.getClass();
                if ((iIntValue9 & 6) == 0) {
                    iIntValue9 |= mVar9.B(rVar2) ? 4 : 2;
                }
                if (mVar9.n(iIntValue9 & 1, (iIntValue9 & 19) != 18)) {
                    x1 x1Var9 = p3.n.f135158a;
                    int i34 = ((iIntValue9 << 3) & 112) | 6;
                    rVar2.k(z3.f.c(887932435, new wd0.a(rVar2, i16), mVar9), mVar9, i34);
                    rVar2.a(z3.f.c(778361290, new xm0.h(i15, rVar2, pVar), mVar9), mVar9, i34);
                } else {
                    mVar9.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
