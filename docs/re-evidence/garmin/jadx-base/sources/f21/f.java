package f21;

import com.garmin.android.apps.connectmobile.R;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class f implements e23.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f68517a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i53.f f68518b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g21.n f68519c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f68520d;

    public /* synthetic */ f(i53.f fVar, g21.n nVar, long j8, int i14) {
        this.f68517a = i14;
        this.f68518b = fVar;
        this.f68519c = nVar;
        this.f68520d = j8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i14 = this.f68517a;
        d82.a aVar = null;
        long j8 = this.f68520d;
        g21.n nVar = this.f68519c;
        i53.f fVar = this.f68518b;
        float fFloatValue = ((Float) obj).floatValue();
        p3.m mVar = (p3.m) obj2;
        ((Integer) obj3).getClass();
        switch (i14) {
            case 0:
                mVar.C(-137440178);
                x1 x1Var = p3.n.f135158a;
                Double dI = l0.i((g21.a0) fVar.get((int) fFloatValue), nVar);
                if (dI == null) {
                    mVar.C(-1376283347);
                    mVar.f();
                } else {
                    mVar.C(-1376283346);
                    double dDoubleValue = dI.doubleValue();
                    aVar = new d82.a(gl1.y.Q(mVar, R.string.lbl_goal), new d02.a().a(dDoubleValue), new j82.g.e(j8, null), gl1.y.Q(mVar, R.string.unit_g));
                    mVar.f();
                }
                mVar.f();
                break;
            default:
                mVar.C(-503127872);
                x1 x1Var2 = p3.n.f135158a;
                Double dI2 = l0.i((g21.a0) fVar.get((int) fFloatValue), nVar);
                if (dI2 == null) {
                    mVar.C(753657627);
                    mVar.f();
                } else {
                    mVar.C(753657628);
                    double dDoubleValue2 = dI2.doubleValue();
                    aVar = new d82.a(gl1.y.Q(mVar, R.string.avg_goal), new d02.a().a(dDoubleValue2), new j82.g.e(j8, null), gl1.y.Q(mVar, R.string.unit_g));
                    mVar.f();
                }
                mVar.f();
                break;
        }
        return aVar;
    }
}
