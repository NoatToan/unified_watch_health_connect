package ug2;

import com.garmin.android.apps.connectmobile.presentation.dev.PromotionsDevMenuActivity;
import com.garmin.android.apps.connectmobile.running_economy.presentation.RunningEconomyReportsActivity;
import l72.h3;
import l72.i3;
import p005kotlin.Unit;
import p3.x1;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class v implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f171034a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ lc.m0 f171035b;

    public /* synthetic */ v(lc.m0 m0Var, int i14) {
        this.f171034a = i14;
        this.f171035b = m0Var;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x003e  */
    /* JADX WARN: Code duplicated, block: B:28:0x0081  */
    /* JADX WARN: Code duplicated, block: B:42:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:56:0x0143  */
    /* JADX WARN: Code duplicated, block: B:70:0x018f  */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f171034a;
        p3.m.a aVar = p3.m.f135153a;
        lc.m0 m0Var = this.f171035b;
        switch (i14) {
            case 0:
                String str = (String) obj;
                bg2.h hVar = (bg2.h) obj2;
                str.getClass();
                hVar.getClass();
                lc.y.l(m0Var, new vg2.a.d(str, hVar));
                break;
            case 1:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i15 = PromotionsDevMenuActivity.f41027b;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    wb1.j.b(null, m0Var, mVar, 0);
                } else {
                    mVar.e();
                }
                break;
            case 2:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                int i16 = PromotionsDevMenuActivity.f41027b;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    boolean zR = mVar2.r(m0Var);
                    Object objQ = mVar2.q();
                    if (zR) {
                        objQ = new x(m0Var, 18);
                        mVar2.K(objQ);
                    } else {
                        aVar.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new x(m0Var, 18);
                            mVar2.K(objQ);
                        }
                    }
                    z02.f.c(6, 54, null, (e23.a) objQ, null, "Details", mVar2, null);
                } else {
                    mVar2.e();
                }
                break;
            case 3:
                p3.m mVar3 = (p3.m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                int i17 = PromotionsDevMenuActivity.f41027b;
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x1 x1Var3 = p3.n.f135158a;
                    boolean zR2 = mVar3.r(m0Var);
                    Object objQ2 = mVar3.q();
                    if (zR2) {
                        objQ2 = new x(m0Var, 20);
                        mVar3.K(objQ2);
                    } else {
                        aVar.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new x(m0Var, 20);
                            mVar3.K(objQ2);
                        }
                    }
                    z02.f.c(6, 54, null, (e23.a) objQ2, null, "Promo Card Previews", mVar3, null);
                } else {
                    mVar3.e();
                }
                break;
            case 4:
                p3.m mVar4 = (p3.m) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                int i18 = PromotionsDevMenuActivity.f41027b;
                if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    x1 x1Var4 = p3.n.f135158a;
                    i53.c cVarE = i53.a.e(p13.x.k(new i3("menuItemManageCache", "Manage Cache", false, (u4.d) null, (String) null, 28, (p005kotlin.jvm.internal.j) null), new i3("menuItemOverridePromoConditions", "Override promo conditions", false, (u4.d) null, (String) null, 28, (p005kotlin.jvm.internal.j) null)));
                    boolean zR3 = mVar4.r(m0Var);
                    Object objQ3 = mVar4.q();
                    if (zR3) {
                        objQ3 = new ky0.w(m0Var, 29);
                        mVar4.K(objQ3);
                    } else {
                        aVar.getClass();
                        if (objQ3 == p3.m.a.f135155b) {
                            objQ3 = new ky0.w(m0Var, 29);
                            mVar4.K(objQ3);
                        }
                    }
                    h3.a(null, null, cVarE, "More", (e23.l) objQ3, mVar4, 3632);
                } else {
                    mVar4.e();
                }
                break;
            case 5:
                p3.m mVar5 = (p3.m) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                int i19 = PromotionsDevMenuActivity.f41027b;
                if (mVar5.n(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    x1 x1Var5 = p3.n.f135158a;
                    boolean zR4 = mVar5.r(m0Var);
                    Object objQ4 = mVar5.q();
                    if (zR4) {
                        objQ4 = new x(m0Var, 19);
                        mVar5.K(objQ4);
                    } else {
                        aVar.getClass();
                        if (objQ4 == p3.m.a.f135155b) {
                            objQ4 = new x(m0Var, 19);
                            mVar5.K(objQ4);
                        }
                    }
                    z02.f.c(6, 54, null, (e23.a) objQ4, null, "Promo Conditions", mVar5, null);
                } else {
                    mVar5.e();
                }
                break;
            default:
                p3.m mVar6 = (p3.m) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                RunningEconomyReportsActivity.a aVar2 = RunningEconomyReportsActivity.f41149c;
                if (mVar6.n(1 & iIntValue6, (iIntValue6 & 3) != 2)) {
                    x1 x1Var6 = p3.n.f135158a;
                    boolean zR5 = mVar6.r(m0Var);
                    Object objQ5 = mVar6.q();
                    if (zR5) {
                        objQ5 = new x(m0Var, 21);
                        mVar6.K(objQ5);
                    } else {
                        aVar.getClass();
                        if (objQ5 == p3.m.a.f135155b) {
                            objQ5 = new x(m0Var, 21);
                            mVar6.K(objQ5);
                        }
                    }
                    t70.s0.d(null, (e23.a) objQ5, mVar6, 0);
                } else {
                    mVar6.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
