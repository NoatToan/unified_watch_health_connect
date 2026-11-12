package ky0;

import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class t0 implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f107543a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ cy0.i f107544b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l22.b f107545c;

    public /* synthetic */ t0(l22.b bVar, cy0.i iVar, int i14) {
        this.f107543a = 3;
        this.f107545c = bVar;
        this.f107544b = iVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f107543a;
        cy0.i iVar = this.f107544b;
        l22.b bVar = this.f107545c;
        p3.m mVar = (p3.m) obj;
        Integer num = (Integer) obj2;
        switch (i14) {
            case 0:
                int iIntValue = num.intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    p3.x1 x1Var = p3.n.f135158a;
                    h4.r rVarF = x2.f(h4.r.S, 1.0f);
                    c2.j.f22691a.getClass();
                    c2.j.k kVar = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, mVar, 0);
                    int iHashCode = Long.hashCode(mVar.getU());
                    i2 i2VarX = mVar.x();
                    h4.r rVarC = h4.k.c(rVarF, mVar);
                    h5.g.V.getClass();
                    h5.e0.a aVar = h5.g.a.f81805b;
                    if (mVar.F() == null) {
                        p3.p0.l();
                        throw null;
                    }
                    mVar.z();
                    if (mVar.getT()) {
                        mVar.M(aVar);
                    } else {
                        mVar.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA, mVar);
                    b4.c(h5.g.a.f81809f, i2VarX, mVar);
                    h5.g.a.b bVar2 = h5.g.a.f81813j;
                    if (mVar.getT() || !p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar, iHashCode, bVar2);
                    }
                    b4.c(h5.g.a.f81807d, rVarC, mVar);
                    c2.b0 b0Var = c2.b0.f22601a;
                    Float f14 = iVar.f56724d;
                    if (f14 == null) {
                        mVar.C(-1505228085);
                        mVar.f();
                    } else {
                        mVar.C(-1505228084);
                        float fFloatValue = f14.floatValue();
                        c22.x0.f23314a.getClass();
                        v0.d(gl1.d.W(c22.x0.P9), ss.k.b(ls.e.CALORIES, bVar, Double.valueOf(fFloatValue), 16), mVar, 0);
                        mVar.f();
                    }
                    Float f15 = iVar.f56723c;
                    if (f15 == null) {
                        mVar.C(-1504880854);
                        mVar.f();
                    } else {
                        mVar.C(-1504880853);
                        float fFloatValue2 = f15.floatValue();
                        c22.x0.f23314a.getClass();
                        v0.d(gl1.d.W(c22.x0.Q9), ss.k.b(ls.e.CALORIES, bVar, Double.valueOf(fFloatValue2), 16), mVar, 0);
                        mVar.f();
                    }
                    Float f16 = iVar.f56725e;
                    if (f16 == null) {
                        mVar.C(-1504535018);
                        mVar.f();
                    } else {
                        mVar.C(-1504535017);
                        v0.d(gl1.y.Q(mVar, R.string.common_lbl_avg_daily_total), ss.k.b(ls.e.CALORIES, bVar, Double.valueOf(f16.floatValue()), 16), mVar, 0);
                        mVar.f();
                    }
                    mVar.y();
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 1:
                int iIntValue2 = num.intValue();
                if (mVar.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    p3.x1 x1Var2 = p3.n.f135158a;
                    h4.r rVarF2 = x2.f(h4.r.S, 1.0f);
                    c2.j.f22691a.getClass();
                    c2.j.k kVar2 = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    c2.z zVarA2 = c2.y.a(kVar2, h4.d.a.f81536n, mVar, 0);
                    int iHashCode2 = Long.hashCode(mVar.getU());
                    i2 i2VarX2 = mVar.x();
                    h4.r rVarC2 = h4.k.c(rVarF2, mVar);
                    h5.g.V.getClass();
                    h5.e0.a aVar2 = h5.g.a.f81805b;
                    if (mVar.F() == null) {
                        p3.p0.l();
                        throw null;
                    }
                    mVar.z();
                    if (mVar.getT()) {
                        mVar.M(aVar2);
                    } else {
                        mVar.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA2, mVar);
                    b4.c(h5.g.a.f81809f, i2VarX2, mVar);
                    h5.g.a.b bVar3 = h5.g.a.f81813j;
                    if (mVar.getT() || !p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode2))) {
                        v.h.z(iHashCode2, mVar, iHashCode2, bVar3);
                    }
                    b4.c(h5.g.a.f81807d, rVarC2, mVar);
                    c2.b0 b0Var2 = c2.b0.f22601a;
                    Double d14 = iVar.f56722b;
                    if (d14 == null) {
                        mVar.C(-377666797);
                        mVar.f();
                    } else {
                        mVar.C(-377666796);
                        v0.d(gl1.y.Q(mVar, R.string.activities_average_resting_lbl), ss.k.b(ls.e.AVERAGE_HEART_RATE, bVar, Double.valueOf(d14.doubleValue()), 9), mVar, 0);
                        mVar.f();
                    }
                    Double d15 = iVar.f56721a;
                    if (d15 == null) {
                        mVar.C(-377356859);
                        mVar.f();
                    } else {
                        mVar.C(-377356858);
                        v0.d(gl1.y.Q(mVar, R.string.lbl_avg_high), ss.k.b(ls.e.AVERAGE_HEART_RATE, bVar, Double.valueOf(d15.doubleValue()), 9), mVar, 0);
                        mVar.f();
                    }
                    mVar.y();
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 2:
                int iIntValue3 = num.intValue();
                if (mVar.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    p3.x1 x1Var3 = p3.n.f135158a;
                    h4.r rVarF3 = x2.f(h4.r.S, 1.0f);
                    c2.j.f22691a.getClass();
                    c2.j.k kVar3 = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    c2.z zVarA3 = c2.y.a(kVar3, h4.d.a.f81536n, mVar, 0);
                    int iHashCode3 = Long.hashCode(mVar.getU());
                    i2 i2VarX3 = mVar.x();
                    h4.r rVarC3 = h4.k.c(rVarF3, mVar);
                    h5.g.V.getClass();
                    h5.e0.a aVar3 = h5.g.a.f81805b;
                    if (mVar.F() == null) {
                        p3.p0.l();
                        throw null;
                    }
                    mVar.z();
                    if (mVar.getT()) {
                        mVar.M(aVar3);
                    } else {
                        mVar.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA3, mVar);
                    b4.c(h5.g.a.f81809f, i2VarX3, mVar);
                    h5.g.a.b bVar4 = h5.g.a.f81813j;
                    if (mVar.getT() || !p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode3))) {
                        v.h.z(iHashCode3, mVar, iHashCode3, bVar4);
                    }
                    b4.c(h5.g.a.f81807d, rVarC3, mVar);
                    c2.b0 b0Var3 = c2.b0.f22601a;
                    boolean zC = ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).c();
                    Double d16 = iVar.f56726f;
                    if (d16 == null) {
                        mVar.C(-614190165);
                        mVar.f();
                    } else {
                        mVar.C(-614190164);
                        v0.d(gl1.y.Q(mVar, R.string.lbl_avg_score), String.valueOf((int) d16.doubleValue()), mVar, 0);
                        mVar.f();
                    }
                    Double d17 = iVar.f56727g;
                    if (d17 == null) {
                        mVar.C(-613934756);
                        mVar.f();
                    } else {
                        mVar.C(-613934755);
                        v0.d(gl1.y.Q(mVar, R.string.lbl_avg_overnight_hr), ss.k.b(ls.e.AVERAGE_HEART_RATE, bVar, Double.valueOf(d17.doubleValue()), 9), mVar, 0);
                        mVar.f();
                    }
                    Double d18 = iVar.f56728h;
                    if (d18 == null) {
                        mVar.C(-613626771);
                        mVar.f();
                    } else {
                        mVar.C(-613626770);
                        double dDoubleValue = d18.doubleValue();
                        c22.x0.f23314a.getClass();
                        v0.d(gl1.d.W(c22.x0.R9), ss.k.b(ls.e.AVERAGE_HEART_RATE, bVar, Double.valueOf(dDoubleValue), 9), mVar, 0);
                        mVar.f();
                    }
                    Integer num2 = iVar.f56729i;
                    if (num2 == null) {
                        mVar.C(-613302480);
                        mVar.f();
                    } else {
                        mVar.C(-613302479);
                        v0.d(gl1.y.Q(mVar, R.string.lbl_avg_body_battery_change), ss.k.b(ls.e.BODY_BATTERY_DRAIN, bVar, Integer.valueOf(num2.intValue()), 16), mVar, 0);
                        mVar.f();
                    }
                    Double d19 = iVar.f56730j;
                    if (d19 == null) {
                        mVar.C(-612964549);
                        mVar.f();
                    } else {
                        mVar.C(-612964548);
                        v0.d(gl1.y.Q(mVar, R.string.lbl_pulse_ox_avg_spo2_short), ss.k.b(ls.e.AVERAGE_SPO2, bVar, Double.valueOf(d19.doubleValue()), 9), mVar, 0);
                        mVar.f();
                    }
                    Double d24 = iVar.f56731k;
                    if (d24 == null) {
                        mVar.C(-612660656);
                        mVar.f();
                    } else {
                        mVar.C(-612660655);
                        v0.d(gl1.y.Q(mVar, R.string.lbl_avg_respiration_abbrev), ss.k.b(ls.e.AVERAGE_RESPIRATION_RATE, bVar, Double.valueOf(d24.doubleValue()), 9), mVar, 0);
                        mVar.f();
                    }
                    if (zC) {
                        mVar.C(-612304279);
                        Double d25 = iVar.f56733m;
                        if (d25 == null) {
                            mVar.C(-612304280);
                            mVar.f();
                        } else {
                            mVar.C(-612304279);
                            v0.d(gl1.y.Q(mVar, R.string.lbl_avg_skin_temp_change), new on1.a(bVar).a(d25.doubleValue()), mVar, 0);
                            mVar.f();
                            Unit unit = Unit.INSTANCE;
                        }
                        mVar.f();
                    } else {
                        mVar.C(-611955095);
                        Double d26 = iVar.f56732l;
                        if (d26 == null) {
                            mVar.C(-611955096);
                            mVar.f();
                        } else {
                            mVar.C(-611955095);
                            v0.d(gl1.y.Q(mVar, R.string.lbl_avg_skin_temp_change), new on1.a(bVar).a(d26.doubleValue()), mVar, 0);
                            mVar.f();
                            Unit unit2 = Unit.INSTANCE;
                        }
                        mVar.f();
                    }
                    mVar.y();
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            default:
                num.getClass();
                v0.b(bVar, iVar, mVar, p3.p0.t(9));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ t0(cy0.i iVar, l22.b bVar, int i14) {
        this.f107543a = i14;
        this.f107544b = iVar;
        this.f107545c = bVar;
    }
}
