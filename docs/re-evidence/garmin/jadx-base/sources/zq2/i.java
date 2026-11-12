package zq2;

import com.garmin.android.apps.connectmobile.R;
import com.garmin.feature.garminpay.ui.addcard.SelectCategoryActivity;
import com.garmin.feature.garminpay.ui.addcard.SelectCategoryActivity.b;
import com.garmin.proto.generated.GDIInReachMessaging;
import e23.p;
import gl1.y;
import java.util.ArrayList;
import java.util.List;
import l72.i3;
import lc.u0;
import p005kotlin.Unit;
import p13.h0;
import p3.l0;
import p3.m;
import p3.n;
import p3.x1;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class i implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f206692a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SelectCategoryActivity f206693b;

    public /* synthetic */ i(SelectCategoryActivity selectCategoryActivity, int i14) {
        this.f206692a = i14;
        this.f206693b = selectCategoryActivity;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:44:0x0117  */
    /* JADX WARN: Code duplicated, block: B:49:0x0153  */
    /* JADX WARN: Code duplicated, block: B:72:0x01e7  */
    /* JADX WARN: Type inference failed for: r1v33, types: [java.lang.Object, o13.l] */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14;
        int i15;
        int i16 = this.f206692a;
        m.a aVar = m.f135153a;
        SelectCategoryActivity selectCategoryActivity = this.f206693b;
        int i17 = 2;
        int i18 = 1;
        switch (i16) {
            case 0:
                m mVar = (m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                SelectCategoryActivity.a aVar2 = SelectCategoryActivity.f51799i;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    Unit unit = Unit.INSTANCE;
                    boolean zR = mVar.r(selectCategoryActivity);
                    Object objQ = mVar.q();
                    if (zR) {
                        objQ = selectCategoryActivity.new b(null);
                        mVar.K(objQ);
                    } else {
                        aVar.getClass();
                        if (objQ == m.a.f135155b) {
                            objQ = selectCategoryActivity.new b(null);
                            mVar.K(objQ);
                        }
                    }
                    l0.e((p) objQ, unit, mVar);
                    z02.b.a(false, null, null, null, false, z3.f.c(2118652631, new i(selectCategoryActivity, i18), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 1:
                m mVar2 = (m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                SelectCategoryActivity.a aVar3 = SelectCategoryActivity.f51799i;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = n.f135158a;
                    z02.d.a(false, z3.f.c(-1371521700, new i(selectCategoryActivity, i17), mVar2), null, null, null, z3.f.c(-694515360, new i(selectCategoryActivity, 3), mVar2), mVar2, 196656, 29);
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 2:
                m mVar3 = (m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                SelectCategoryActivity.a aVar4 = SelectCategoryActivity.f51799i;
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x1 x1Var3 = n.f135158a;
                    String strQ = y.Q(mVar3, R.string.wallet_card_type);
                    boolean zR2 = mVar3.r(selectCategoryActivity);
                    Object objQ2 = mVar3.q();
                    if (zR2) {
                        objQ2 = new SelectCategoryActivity.c(selectCategoryActivity);
                        mVar3.K(objQ2);
                    } else {
                        aVar.getClass();
                        if (objQ2 == m.a.f135155b) {
                            objQ2 = new SelectCategoryActivity.c(selectCategoryActivity);
                            mVar3.K(objQ2);
                        }
                    }
                    e23.a aVar5 = (e23.a) ((k23.g) objQ2);
                    i53.f fVarA = i53.a.a(new i3("HELP", y.Q(mVar3, R.string.lbl_help), false, (u4.d) null, (String) null, 28, (p005kotlin.jvm.internal.j) null));
                    boolean zR3 = mVar3.r(selectCategoryActivity);
                    Object objQ3 = mVar3.q();
                    if (zR3) {
                        objQ3 = new j(selectCategoryActivity, 1);
                        mVar3.K(objQ3);
                    } else {
                        aVar.getClass();
                        if (objQ3 == m.a.f135155b) {
                            objQ3 = new j(selectCategoryActivity, 1);
                            mVar3.K(objQ3);
                        }
                    }
                    z02.f.d(strQ, null, null, aVar5, fVarA, null, (e23.l) objQ3, mVar3, GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE, 86);
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            default:
                ?? r14 = selectCategoryActivity.f51800g;
                m mVar4 = (m) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                SelectCategoryActivity.a aVar6 = SelectCategoryActivity.f51799i;
                if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    x1 x1Var4 = n.f135158a;
                    mVar4.C(-1709326958);
                    List<qs2.e> listN0 = h0.N0(g8.i.m(((ar2.b) r14.getValue()).f12579f), new ar2.d());
                    ArrayList arrayList = new ArrayList(p13.y.r(listN0, 10));
                    for (qs2.e eVar : listN0) {
                        SelectCategoryActivity.f51799i.getClass();
                        int[] iArr = SelectCategoryActivity.a.C1077a.f51802a;
                        int i19 = iArr[eVar.ordinal()];
                        if (i19 == 1) {
                            i14 = R.drawable.ic_credit_card;
                        } else {
                            if (i19 != 2) {
                                u0.r();
                                return null;
                            }
                            i14 = R.drawable.ic_transit_card;
                        }
                        ms2.a.C2286a c2286a = new ms2.a.C2286a(i14);
                        int i24 = iArr[eVar.ordinal()];
                        if (i24 == 1) {
                            i15 = R.string.wallet_credit_debit;
                        } else {
                            if (i24 != 2) {
                                u0.r();
                                return null;
                            }
                            i15 = R.string.wallet_transit;
                        }
                        arrayList.add(new o13.p(eVar, new f(c2286a, y.Q(mVar4, i15), null, 4, null)));
                    }
                    mVar4.f();
                    ar2.b bVar = (ar2.b) r14.getValue();
                    boolean zR4 = mVar4.r(bVar);
                    Object objQ4 = mVar4.q();
                    if (zR4) {
                        objQ4 = new SelectCategoryActivity.d(bVar);
                        mVar4.K(objQ4);
                    } else {
                        aVar.getClass();
                        if (objQ4 == m.a.f135155b) {
                            objQ4 = new SelectCategoryActivity.d(bVar);
                            mVar4.K(objQ4);
                        }
                    }
                    gr2.f.b(arrayList, (e23.l) ((k23.g) objQ4), mVar4, 0);
                    x1 x1Var5 = n.f135158a;
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
        }
    }
}
