package w52;

import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.consent.ChildConsentsFlowActivity;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class n implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f182655a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f182656b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f182657c;

    public /* synthetic */ n(int i14, o13.t tVar) {
        this.f182655a = 15;
        this.f182656b = i14;
        this.f182657c = tVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        o4.d0 d0VarA;
        long j8;
        String string;
        int i14 = this.f182655a;
        int i15 = this.f182656b;
        Object obj3 = this.f182657c;
        switch (i14) {
            case 0:
                ((Integer) obj2).getClass();
                o.a((com.garmin.android.apps.connectmobile.workouts.presentation.edit.j) obj3, (p3.m) obj, p3.p0.t(i15 | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                m0.a((c62.y0) obj3, (p3.m) obj, p3.p0.t(i15 | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                int i16 = wd0.c.f184361f;
                ((wd0.c) obj3).g((p3.m) obj, p3.p0.t(i15 | 1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                int i17 = xc1.b.f189966f;
                ((xc1.b) obj3).g((p3.m) obj, p3.p0.t(i15 | 1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                int i18 = xn.h.f191606f;
                ((xn.h) obj3).g((p3.m) obj, p3.p0.t(i15 | 1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                int i19 = xn.k.f191611f;
                ((xn.k) obj3).g((p3.m) obj, p3.p0.t(i15 | 1));
                break;
            case 6:
                ((Integer) obj2).getClass();
                int i24 = xn.l.f191612f;
                ((xn.l) obj3).g((p3.m) obj, p3.p0.t(i15 | 1));
                break;
            case 7:
                ((Integer) obj2).getClass();
                int i25 = xn.s.f191625f;
                ((xn.s) obj3).g((p3.m) obj, p3.p0.t(i15 | 1));
                break;
            case 8:
                ((Integer) obj2).getClass();
                int i26 = xn.u.f191628f;
                ((xn.u) obj3).g((p3.m) obj, p3.p0.t(i15 | 1));
                break;
            case 9:
                ((Integer) obj2).getClass();
                int i27 = xo.b.f191749f;
                ((xo.b) obj3).g((p3.m) obj, p3.p0.t(i15 | 1));
                break;
            case 10:
                ((Integer) obj2).getClass();
                int i28 = xw.f.f192299f;
                ((xw.f) obj3).g((p3.m) obj, p3.p0.t(i15 | 1));
                break;
            case 11:
                ((Integer) obj2).getClass();
                int i29 = y91.b.f195291f;
                ((y91.b) obj3).g((p3.m) obj, p3.p0.t(i15 | 1));
                break;
            case 12:
                ((Integer) obj2).getClass();
                int i30 = yn.c.f198134f;
                ((yn.c) obj3).g((p3.m) obj, p3.p0.t(i15 | 1));
                break;
            case 13:
                ((Integer) obj2).getClass();
                int i34 = yn.d.f198135f;
                ((yn.d) obj3).g((p3.m) obj, p3.p0.t(i15 | 1));
                break;
            case 14:
                ((Integer) obj2).getClass();
                yn0.k.d((nk0.l) obj3, (p3.m) obj, p3.p0.t(i15 | 1));
                break;
            case 15:
                o13.t tVar = (o13.t) obj3;
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    p3.x1 x1Var = p3.n.f135158a;
                    ((sr.h) tVar.getValue()).getClass();
                    Integer numA = sr.h.a(i15);
                    if (numA == null) {
                        mVar.C(705162776);
                        mVar.f();
                        d0VarA = null;
                    } else {
                        mVar.C(705162777);
                        long jA = n5.a.a(mVar, numA.intValue());
                        mVar.f();
                        d0VarA = o4.d0.a(jA);
                    }
                    if (d0VarA != null) {
                        j8 = d0VarA.f128833a;
                    } else {
                        o4.d0.f128823b.getClass();
                        j8 = o4.d0.f128831j;
                    }
                    long j14 = j8;
                    String strB = ((sr.h) tVar.getValue()).b(i15);
                    l22.b bVar = ((sr.h) tVar.getValue()).f160571a;
                    if (j23.t.o(0, 34).d(i15)) {
                        string = bVar.getString(R.string.workout_execution_score_interval_low);
                    } else if (j23.t.o(34, 67).d(i15)) {
                        string = bVar.getString(R.string.workout_execution_score_interval_average);
                    } else {
                        string = i15 >= 67 ? bVar.getString(R.string.workout_execution_score_interval_good) : bVar.getString(R.string.lbl_empty_string);
                    }
                    yr.c0.f(0, j14, strB, string, mVar);
                } else {
                    mVar.e();
                }
                break;
            case 16:
                ((Integer) obj2).getClass();
                ChildConsentsFlowActivity.a aVar = ChildConsentsFlowActivity.f32139f;
                ((ChildConsentsFlowActivity) obj3).ea((p3.m) obj, p3.p0.t(i15 | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                int i35 = zx0.l.f207368f;
                ((zx0.l) obj3).g((p3.m) obj, p3.p0.t(i15 | 1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ n(Object obj, int i14, int i15) {
        this.f182655a = i15;
        this.f182657c = obj;
        this.f182656b = i14;
    }
}
