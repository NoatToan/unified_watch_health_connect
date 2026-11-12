package iv1;

import com.garmin.android.apps.connectmobile.R;
import e23.q;
import gl1.y;
import h82.r;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class c implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f95209a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f95210b;

    public /* synthetic */ c(d dVar, int i14) {
        this.f95209a = i14;
        this.f95210b = dVar;
    }

    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i14 = this.f95209a;
        d dVar = this.f95210b;
        switch (i14) {
            case 0:
                m mVar = (m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                int i15 = d.f95211i;
                if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                    x1 x1Var = n.f135158a;
                    dVar.g(mVar, 0);
                } else {
                    mVar.e();
                }
                break;
            default:
                r rVar = (r) obj;
                m mVar2 = (m) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                int i16 = d.f95211i;
                rVar.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= mVar2.B(rVar) ? 4 : 2;
                }
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    x1 x1Var2 = n.f135158a;
                    int i17 = (iIntValue2 << 3) & 112;
                    rVar.D(R.string.welcome_to_garmin_coach, mVar2, i17);
                    int i18 = (iIntValue2 << 6) & 896;
                    rVar.l(R.string.garmin_coach_help_description, i18, 2, null, mVar2);
                    rVar.t(R.string.benchmark_workouts, mVar2, i17);
                    rVar.o(R.string.benchmark_workout_help_description1, i18, 2, null, mVar2);
                    if (dVar.f95212f) {
                        mVar2.C(-1771816475);
                        rVar.o(R.string.benchmark_workout_help_description2_fitness, i18, 2, null, mVar2);
                        mVar2.f();
                    } else {
                        mVar2.C(-1771708595);
                        rVar.o(R.string.benchmark_workout_help_description2, i18, 2, null, mVar2);
                        mVar2.f();
                    }
                    rVar.s(i18, 2, y.Q(mVar2, R.string.accessing_workouts), null, mVar2);
                    hv1.d dVar2 = dVar.f95214h;
                    if (dVar2 == hv1.d.NO_SCREENLESS || dVar2 == hv1.d.BOTH_SCREENED_AND_SCREENLESS) {
                        mVar2.C(-1771075761);
                        rVar.o(R.string.accessing_workouts_on_device_help, i18, 2, null, mVar2);
                        mVar2.f();
                    } else {
                        mVar2.C(-1770986388);
                        mVar2.f();
                    }
                    hv1.d dVar3 = dVar.f95214h;
                    if (dVar3 == hv1.d.ONLY_SCREENLESS || dVar3 == hv1.d.BOTH_SCREENED_AND_SCREENLESS) {
                        mVar2.C(-1770837774);
                        rVar.q(y.P(R.string.accessing_workouts_help_2, new Object[]{y.P(R.string.quotation_text, new Object[]{y.Q(mVar2, R.string.do_workout)}, mVar2)}, mVar2), mVar2, i17);
                        mVar2.f();
                    } else {
                        mVar2.C(-1770536020);
                        mVar2.f();
                    }
                    if (dVar.f95213g) {
                        mVar2.C(-1770486730);
                        rVar.t(R.string.recovery_workouts, mVar2, i17);
                        rVar.q(y.Q(mVar2, R.string.beginner_recovery_workouts_description), mVar2, i17);
                        mVar2.f();
                    } else {
                        mVar2.C(-1770311828);
                        mVar2.f();
                    }
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
