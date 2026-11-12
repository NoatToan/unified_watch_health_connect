package zq2;

import com.garmin.android.apps.connectmobile.R;
import com.garmin.feature.garminpay.ui.addcard.SelectOperatorActivity;
import e23.p;
import gl1.y;
import java.util.ArrayList;
import java.util.List;
import lc.u0;
import p005kotlin.Unit;
import p13.h0;
import p3.l0;
import p3.m;
import p3.n;
import p3.x1;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class k implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f206696a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SelectOperatorActivity f206697b;

    public /* synthetic */ k(SelectOperatorActivity selectOperatorActivity, int i14) {
        this.f206696a = i14;
        this.f206697b = selectOperatorActivity;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0086  */
    /* JADX WARN: Code duplicated, block: B:42:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:66:0x0185  */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, o13.l] */
    /* JADX WARN: Type inference failed for: r13v19, types: [java.lang.Object, o13.l] */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14;
        int i15 = this.f206696a;
        m.a aVar = m.f135153a;
        SelectOperatorActivity selectOperatorActivity = this.f206697b;
        int i16 = 2;
        int i17 = 1;
        switch (i15) {
            case 0:
                m mVar = (m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                SelectOperatorActivity.a aVar2 = SelectOperatorActivity.f51812i;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    Unit unit = Unit.INSTANCE;
                    boolean zR = mVar.r(selectOperatorActivity);
                    Object objQ = mVar.q();
                    if (zR) {
                        objQ = new SelectOperatorActivity.c(selectOperatorActivity, null);
                        mVar.K(objQ);
                    } else {
                        aVar.getClass();
                        if (objQ == m.a.f135155b) {
                            objQ = new SelectOperatorActivity.c(selectOperatorActivity, null);
                            mVar.K(objQ);
                        }
                    }
                    l0.e((p) objQ, unit, mVar);
                    z02.b.a(false, null, null, null, false, z3.f.c(999483915, new k(selectOperatorActivity, i17), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 1:
                m mVar2 = (m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                SelectOperatorActivity.a aVar3 = SelectOperatorActivity.f51812i;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = n.f135158a;
                    z02.d.a(false, z3.f.c(1804276880, new k(selectOperatorActivity, i16), mVar2), null, null, null, z3.f.c(-1813684076, new k(selectOperatorActivity, 3), mVar2), mVar2, 196656, 29);
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 2:
                m mVar3 = (m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                SelectOperatorActivity.a aVar4 = SelectOperatorActivity.f51812i;
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x1 x1Var3 = n.f135158a;
                    qs2.e eVar = ((ar2.e) selectOperatorActivity.f51813g.getValue()).f12590f;
                    int i18 = eVar == null ? -1 : SelectOperatorActivity.b.f51815a[eVar.ordinal()];
                    if (i18 == -1) {
                        return Unit.INSTANCE;
                    }
                    if (i18 == 1) {
                        i14 = R.string.wallet_credit_debit_card;
                    } else {
                        if (i18 != 2) {
                            u0.r();
                            return null;
                        }
                        i14 = R.string.wallet_transit_card;
                    }
                    String strQ = y.Q(mVar3, i14);
                    boolean zR2 = mVar3.r(selectOperatorActivity);
                    Object objQ2 = mVar3.q();
                    if (zR2) {
                        objQ2 = new SelectOperatorActivity.d(selectOperatorActivity);
                        mVar3.K(objQ2);
                    } else {
                        aVar.getClass();
                        if (objQ2 == m.a.f135155b) {
                            objQ2 = new SelectOperatorActivity.d(selectOperatorActivity);
                            mVar3.K(objQ2);
                        }
                    }
                    z02.f.c(0, 54, null, (e23.a) ((k23.g) objQ2), null, strQ, mVar3, null);
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            default:
                ?? r14 = selectOperatorActivity.f51813g;
                m mVar4 = (m) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                SelectOperatorActivity.a aVar5 = SelectOperatorActivity.f51812i;
                if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    x1 x1Var4 = n.f135158a;
                    List<ms2.e> listN0 = h0.N0(((ar2.e) r14.getValue()).f12591g, new SelectOperatorActivity.f());
                    ArrayList arrayList = new ArrayList(p13.y.r(listN0, 10));
                    for (ms2.e eVar2 : listN0) {
                        arrayList.add(new o13.p(eVar2, new f(eVar2.getF206683d(), eVar2.getF206682c(), eVar2.getF206684e())));
                    }
                    ar2.e eVar3 = (ar2.e) r14.getValue();
                    boolean zR3 = mVar4.r(eVar3);
                    Object objQ3 = mVar4.q();
                    if (zR3) {
                        objQ3 = new SelectOperatorActivity.e(eVar3);
                        mVar4.K(objQ3);
                    } else {
                        aVar.getClass();
                        if (objQ3 == m.a.f135155b) {
                            objQ3 = new SelectOperatorActivity.e(eVar3);
                            mVar4.K(objQ3);
                        }
                    }
                    gr2.f.b(arrayList, (e23.l) ((k23.g) objQ3), mVar4, 0);
                    x1 x1Var5 = n.f135158a;
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
        }
    }
}
