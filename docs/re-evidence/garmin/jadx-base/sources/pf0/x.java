package pf0;

import com.garmin.android.apps.connectmobile.R;
import l72.p2;
import org.joda.time.DateTime;
import p005kotlin.Unit;
import p3.x1;
import p40.o0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class x implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f137541a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.ecg.presentation.stats.c.C0591c f137542b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ gf0.a f137543c;

    public /* synthetic */ x(com.garmin.android.apps.connectmobile.ecg.presentation.stats.c.C0591c c0591c, gf0.a aVar, int i14) {
        this.f137541a = i14;
        this.f137542b = c0591c;
        this.f137543c = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0071  */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f137541a;
        gf0.a aVar = this.f137543c;
        com.garmin.android.apps.connectmobile.ecg.presentation.stats.c.C0591c c0591c = this.f137542b;
        int i15 = 1;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i16 = com.garmin.android.apps.connectmobile.ecg.presentation.stats.c.C0591c.f34901d;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(1971187325, new x(c0591c, aVar, i15), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                break;
            default:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                int i17 = com.garmin.android.apps.connectmobile.ecg.presentation.stats.c.C0591c.f34901d;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    p2 p2Var = p2.f111205a;
                    String strB = c0591c.f34903b.b(aVar);
                    s sVar = c0591c.f34903b;
                    sVar.getClass();
                    DateTime dateTimeK = aVar.k();
                    String strB2 = dateTimeK != null ? sVar.f137531c.b(dateTimeK, qi0.b.NUMERICAL_DATE_RELATIVE_24H_AM_PM_TIME) : sVar.f137530b.getString(R.string.no_value);
                    c.f137472a.getClass();
                    z3.e eVar = c.f137473b;
                    boolean zR = mVar2.r(c0591c) | mVar2.r(aVar);
                    Object objQ = mVar2.q();
                    if (zR) {
                        objQ = new o0(5, c0591c, aVar);
                        mVar2.K(objQ);
                    } else {
                        p3.m.f135153a.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new o0(5, c0591c, aVar);
                            mVar2.K(objQ);
                        }
                    }
                    p2Var.h(strB, strB2, null, null, null, false, false, eVar, null, null, (e23.a) objQ, mVar2, 12582912, 0, 892);
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
