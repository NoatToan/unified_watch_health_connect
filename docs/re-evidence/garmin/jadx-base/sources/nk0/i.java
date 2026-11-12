package nk0;

import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.gear.presentation.GearActivity;
import com.garmin.android.apps.connectmobile.gear.presentation.navigation.GearRoute;
import e23.p;
import gl1.y;
import lc.m0;
import lc.v0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;
import p3.n;
import p3.v;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class i implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f126396a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GearActivity f126397b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ GearRoute f126398c;

    public /* synthetic */ i(GearRoute gearRoute, GearActivity gearActivity) {
        this.f126396a = 2;
        this.f126398c = gearRoute;
        this.f126397b = gearActivity;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f126396a;
        GearRoute gearRoute = this.f126398c;
        GearActivity gearActivity = this.f126397b;
        int i15 = 1;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                GearActivity.a aVar = GearActivity.f35500b;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    z02.b.a(false, null, null, null, true, z3.f.c(1902507127, new i(gearActivity, gearRoute, i15), mVar), mVar, 221184, 15);
                } else {
                    mVar.e();
                }
                break;
            case 1:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                GearActivity.a aVar2 = GearActivity.f35500b;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = n.f135158a;
                    v.a(g02.d.f74342a.c(gearActivity.getOnBackPressedDispatcher()), z3.f.c(-1248990921, new i(gearRoute, gearActivity), mVar2), mVar2, 56);
                } else {
                    mVar2.e();
                }
                break;
            default:
                p3.m mVar3 = (p3.m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                GearActivity.a aVar3 = GearActivity.f35500b;
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x1 x1Var3 = n.f135158a;
                    m0 m0VarI = y.I(new v0[0], mVar3);
                    Object objQ = mVar3.q();
                    p3.m.f135153a.getClass();
                    p3.m.a.C2565a c2565a = p3.m.a.f135155b;
                    if (objQ == c2565a) {
                        objQ = (bv.d) KoinJavaComponent.get$default(bv.d.class, null, null, 6, null);
                        mVar3.K(objQ);
                    }
                    bv.d dVar = (bv.d) objQ;
                    Object objQ2 = mVar3.q();
                    if (objQ2 == c2565a) {
                        objQ2 = (mk0.e) KoinJavaComponent.get$default(mk0.e.class, null, null, 6, null);
                        mVar3.K(objQ2);
                    }
                    mk0.e eVar = (mk0.e) objQ2;
                    String strQ = y.Q(mVar3, R.string.add_gear_photos_message);
                    GearActivity gearActivity2 = this.f126397b;
                    boolean zR = mVar3.r(gearActivity2) | mVar3.r(dVar) | mVar3.r(m0VarI) | mVar3.r(eVar) | mVar3.B(strQ);
                    Object objQ3 = mVar3.q();
                    if (zR || objQ3 == c2565a) {
                        jv0.c cVar = new jv0.c(gearActivity2, m0VarI, strQ, dVar, eVar, 9);
                        mVar3.K(cVar);
                        objQ3 = cVar;
                    }
                    nc.y.a(m0VarI, this.f126398c, null, null, null, null, null, null, null, (e23.l) objQ3, mVar3, 0, 2044);
                } else {
                    mVar3.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ i(GearActivity gearActivity, GearRoute gearRoute, int i14) {
        this.f126396a = i14;
        this.f126397b = gearActivity;
        this.f126398c = gearRoute;
    }
}
