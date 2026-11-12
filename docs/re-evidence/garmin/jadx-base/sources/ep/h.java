package ep;

import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activities.powercurve.PowerCurveDetailsActivity;
import e23.p;
import gl1.y;
import p005kotlin.Unit;
import p3.x1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class h implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f64819a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PowerCurveDetailsActivity f64820b;

    public /* synthetic */ h(PowerCurveDetailsActivity powerCurveDetailsActivity, int i14) {
        this.f64819a = i14;
        this.f64820b = powerCurveDetailsActivity;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x006a  */
    /* JADX WARN: Type inference failed for: r11v22, types: [java.lang.Object, o13.l] */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f64819a;
        PowerCurveDetailsActivity powerCurveDetailsActivity = this.f64820b;
        int i15 = 2;
        int i16 = 1;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                PowerCurveDetailsActivity.a aVar = PowerCurveDetailsActivity.f29752b;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(-688064811, new h(powerCurveDetailsActivity, i16), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                break;
            case 1:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                PowerCurveDetailsActivity.a aVar2 = PowerCurveDetailsActivity.f29752b;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    z02.d.a(false, z3.f.c(-1798154982, new h(powerCurveDetailsActivity, i15), mVar2), null, null, null, z3.f.c(-1763056610, new h(powerCurveDetailsActivity, 3), mVar2), mVar2, 196656, 29);
                } else {
                    mVar2.e();
                }
                break;
            case 2:
                p3.m mVar3 = (p3.m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                PowerCurveDetailsActivity.a aVar3 = PowerCurveDetailsActivity.f29752b;
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x1 x1Var3 = p3.n.f135158a;
                    String strQ = y.Q(mVar3, R.string.power_curve_label);
                    boolean zR = mVar3.r(powerCurveDetailsActivity);
                    Object objQ = mVar3.q();
                    if (zR) {
                        objQ = new e40.d(powerCurveDetailsActivity, 5);
                        mVar3.K(objQ);
                    } else {
                        p3.m.f135153a.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new e40.d(powerCurveDetailsActivity, 5);
                            mVar3.K(objQ);
                        }
                    }
                    z02.f.c(0, 54, null, (e23.a) objQ, null, strQ, mVar3, null);
                } else {
                    mVar3.e();
                }
                break;
            default:
                p3.m mVar4 = (p3.m) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                PowerCurveDetailsActivity.a aVar4 = PowerCurveDetailsActivity.f29752b;
                if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    x1 x1Var4 = p3.n.f135158a;
                    k.d(null, (o) powerCurveDetailsActivity.f29753a.getValue(), mVar4, 0);
                } else {
                    mVar4.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
