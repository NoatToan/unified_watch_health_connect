package t31;

import com.garmin.android.apps.connectmobile.overnighthrv.OvernightHrvActivity;
import e23.p;
import h4.r;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.x1;
import sg0.w0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class h implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f162219a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ OvernightHrvActivity f162220b;

    public /* synthetic */ h(OvernightHrvActivity overnightHrvActivity, int i14) {
        this.f162219a = i14;
        this.f162220b = overnightHrvActivity;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003e  */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f162219a;
        OvernightHrvActivity overnightHrvActivity = this.f162220b;
        int i15 = 1;
        switch (i14) {
            case 0:
                m mVar = (m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                OvernightHrvActivity.a aVar = OvernightHrvActivity.f39738n;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(327458059, new h(overnightHrvActivity, i15), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                break;
            default:
                m mVar2 = (m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                OvernightHrvActivity.a aVar2 = OvernightHrvActivity.f39738n;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = n.f135158a;
                    r rVarB = p02.a.b(r.S, mVar2);
                    tn1.d dVar = tn1.d.HRV_STATUS;
                    boolean zR = mVar2.r(overnightHrvActivity);
                    Object objQ = mVar2.q();
                    if (zR) {
                        objQ = new w0(overnightHrvActivity, 11);
                        mVar2.K(objQ);
                    } else {
                        m.f135153a.getClass();
                        if (objQ == m.a.f135155b) {
                            objQ = new w0(overnightHrvActivity, 11);
                            mVar2.K(objQ);
                        }
                    }
                    p02.a.a(rVarB, dVar, null, (e23.a) objQ, mVar2, 48, 4);
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
