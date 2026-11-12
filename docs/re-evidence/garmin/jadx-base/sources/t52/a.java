package t52;

import c2.b0;
import c2.j;
import c2.l;
import c2.x2;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.workouts.presentation.benchmark.viewbinder.BenchmarkExerciseOneRepMaxView;
import com.google.firebase.messaging.Constants;
import e23.p;
import h4.d;
import h4.k;
import h4.r;
import h5.e0;
import h5.g;
import i3.mh;
import l72.c1;
import l72.p2;
import l72.v2;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.p0;
import p3.p1;
import p3.x1;
import p5.v;
import r82.u;
import s5.x0;
import sg0.w0;
import sy.i;
import t21.v0;
import v.h;
import z3.e;
import z3.f;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class a implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f162550a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BenchmarkExerciseOneRepMaxView f162551b;

    public /* synthetic */ a(BenchmarkExerciseOneRepMaxView benchmarkExerciseOneRepMaxView, int i14) {
        this.f162550a = i14;
        this.f162551b = benchmarkExerciseOneRepMaxView;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00d8  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        String strH;
        int i14 = this.f162550a;
        m.a aVar = m.f135153a;
        BenchmarkExerciseOneRepMaxView benchmarkExerciseOneRepMaxView = this.f162551b;
        int i15 = 2;
        int i16 = 3;
        boolean z14 = false;
        int i17 = 1;
        switch (i14) {
            case 0:
                m mVar = (m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i18 = BenchmarkExerciseOneRepMaxView.f48406i;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    z02.b.a(false, null, null, null, false, f.c(-146107335, new a(benchmarkExerciseOneRepMaxView, i17), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 1:
                m mVar2 = (m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                int i19 = BenchmarkExerciseOneRepMaxView.f48406i;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = n.f135158a;
                    Object[] objArr = new Object[0];
                    Object objQ = mVar2.q();
                    aVar.getClass();
                    m.a.C2565a c2565a = m.a.f135155b;
                    if (objQ == c2565a) {
                        objQ = new t21.f(18);
                        mVar2.K(objQ);
                    }
                    p1 p1Var = (p1) d4.a.e(objArr, (e23.a) objQ, mVar2, 48);
                    r.a aVar2 = r.S;
                    j.f22691a.getClass();
                    j.k kVar = j.f22694d;
                    d.f81522a.getClass();
                    z zVarA = y.a(kVar, d.a.f81536n, mVar2, 0);
                    int iHashCode = Long.hashCode(mVar2.getU());
                    i2 i2VarX = mVar2.x();
                    r rVarC = k.c(aVar2, mVar2);
                    g.V.getClass();
                    e0.a aVar3 = g.a.f81805b;
                    if (mVar2.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar2.z();
                    if (mVar2.getT()) {
                        mVar2.M(aVar3);
                    } else {
                        mVar2.c();
                    }
                    b4.c(g.a.f81810g, zVarA, mVar2);
                    b4.c(g.a.f81809f, i2VarX, mVar2);
                    g.a.b bVar = g.a.f81813j;
                    if (mVar2.getT() || !s.g(mVar2.q(), Integer.valueOf(iHashCode))) {
                        h.z(iHashCode, mVar2, iHashCode, bVar);
                    }
                    b4.c(g.a.f81807d, rVarC, mVar2);
                    b0 b0Var = b0.f22601a;
                    String strQ = gl1.y.Q(mVar2, R.string.msg_benchmark_rep_max_calculation);
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    x0 x0VarF = d92.c.f(j92.f.f97931h, mVar2);
                    g6.f.a aVar4 = g6.f.f75994b;
                    r rVarY = l.y(aVar2, 16);
                    boolean zB = mVar2.B(strQ) | mVar2.r(benchmarkExerciseOneRepMaxView);
                    Object objQ2 = mVar2.q();
                    if (zB || objQ2 == c2565a) {
                        objQ2 = new i(5, strQ, benchmarkExerciseOneRepMaxView);
                        mVar2.K(objQ2);
                    }
                    mh.c(strQ, v.c((e23.l) objQ2, rVarY, false), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarF, mVar2, 0, 0, 131068);
                    p2 p2Var = p2.f111205a;
                    String strQ2 = gl1.y.Q(mVar2, R.string.strength_training_reps);
                    b92.a.C0235a c0235a = new b92.a.C0235a(null, 1, null);
                    c0235a.f16962a.put(Constants.ScionAnalytics.PARAM_LABEL, gl1.y.Q(mVar2, R.string.lbl_repetitions));
                    b92.a aVarB = c0235a.b();
                    e eVarC = f.c(189126616, new a(benchmarkExerciseOneRepMaxView, i15), mVar2);
                    boolean zR = mVar2.r(benchmarkExerciseOneRepMaxView);
                    Object objQ3 = mVar2.q();
                    if (zR || objQ3 == c2565a) {
                        objQ3 = new w0(benchmarkExerciseOneRepMaxView, 12);
                        mVar2.K(objQ3);
                    }
                    int i24 = b92.a.f16960b;
                    p2Var.g(strQ2, null, aVarB, null, eVarC, false, false, (e23.a) objQ3, mVar2, 24576, 234);
                    String strQ3 = gl1.y.Q(mVar2, R.string.lbl_weight);
                    e eVarC2 = f.c(-1743653439, new a(benchmarkExerciseOneRepMaxView, i16), mVar2);
                    boolean zB2 = mVar2.B(p1Var);
                    Object objQ4 = mVar2.q();
                    if (zB2 || objQ4 == c2565a) {
                        objQ4 = new sg0.l(p1Var, 25);
                        mVar2.K(objQ4);
                    }
                    p2Var.g(strQ3, null, null, null, eVarC2, false, false, (e23.a) objQ4, mVar2, 24576, 238);
                    mVar2.y();
                    if (((Boolean) p1Var.getF182175a()).booleanValue()) {
                        mVar2.C(-1878280862);
                        c1 c1Var = c1.f110940a;
                        String strQ4 = gl1.y.Q(mVar2, R.string.lbl_weight);
                        e eVarC3 = f.c(-1951362662, new a(benchmarkExerciseOneRepMaxView, 4), mVar2);
                        String strQ5 = gl1.y.Q(mVar2, R.string.lbl_done);
                        boolean zB3 = mVar2.B(p1Var);
                        Object objQ5 = mVar2.q();
                        if (zB3 || objQ5 == c2565a) {
                            objQ5 = new sg0.l(p1Var, 24);
                            mVar2.K(objQ5);
                        }
                        c1Var.a(true, strQ4, null, eVarC3, null, strQ5, false, false, (e23.a) objQ5, null, null, mVar2, 3078, 0, 1748);
                        mVar2.f();
                    } else {
                        mVar2.C(-1876490519);
                        mVar2.f();
                    }
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 2:
                m mVar3 = (m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                int i25 = BenchmarkExerciseOneRepMaxView.f48406i;
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x1 x1Var3 = n.f135158a;
                    if (benchmarkExerciseOneRepMaxView.f48410d > 0) {
                        mVar3.C(1362053794);
                        mVar3.f();
                        strH = String.valueOf(benchmarkExerciseOneRepMaxView.f48410d);
                    } else {
                        strH = sn.a.h(mVar3, 1362054329, R.string.no_value, mVar3);
                    }
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    mh.c(strH, v2.a(r.S, benchmarkExerciseOneRepMaxView.f48410d <= 0, new v0(benchmarkExerciseOneRepMaxView, i17), mVar3, 6), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97931h, mVar3), mVar3, 0, 0, 131068);
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            case 3:
                m mVar4 = (m) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                int i26 = BenchmarkExerciseOneRepMaxView.f48406i;
                if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    x1 x1Var4 = n.f135158a;
                    String strB = k52.e.b(benchmarkExerciseOneRepMaxView.f48409c, benchmarkExerciseOneRepMaxView.f48411e, benchmarkExerciseOneRepMaxView.f48413g);
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    mh.c(strB, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97931h, mVar4), mVar4, 0, 0, 131070);
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
            default:
                m mVar5 = (m) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                int i27 = BenchmarkExerciseOneRepMaxView.f48406i;
                if (mVar5.n(1 & iIntValue5, (iIntValue5 & 3) != 2)) {
                    x1 x1Var5 = n.f135158a;
                    r.a aVar5 = r.S;
                    r rVarF = x2.f(aVar5, 1.0f);
                    d.f81522a.getClass();
                    h4.g.a aVar6 = d.a.f81537o;
                    j.f22691a.getClass();
                    z zVarA2 = y.a(j.f22694d, aVar6, mVar5, 48);
                    int iHashCode2 = Long.hashCode(mVar5.getU());
                    i2 i2VarX2 = mVar5.x();
                    r rVarC2 = k.c(rVarF, mVar5);
                    g.V.getClass();
                    e0.a aVar7 = g.a.f81805b;
                    if (mVar5.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar5.z();
                    if (mVar5.getT()) {
                        mVar5.M(aVar7);
                    } else {
                        mVar5.c();
                    }
                    b4.c(g.a.f81810g, zVarA2, mVar5);
                    b4.c(g.a.f81809f, i2VarX2, mVar5);
                    g.a.b bVar2 = g.a.f81813j;
                    if (mVar5.getT() || !s.g(mVar5.q(), Integer.valueOf(iHashCode2))) {
                        h.z(iHashCode2, mVar5, iHashCode2, bVar2);
                    }
                    b4.c(g.a.f81807d, rVarC2, mVar5);
                    b0 b0Var2 = b0.f22601a;
                    r rVarX = x2.x(x2.z(aVar5, null, 3), null, 3);
                    Double d14 = benchmarkExerciseOneRepMaxView.f48411e;
                    double dDoubleValue = d14 != null ? d14.doubleValue() : 0.0d;
                    boolean z15 = benchmarkExerciseOneRepMaxView.f48413g;
                    String strQ6 = gl1.y.Q(mVar5, R.string.lbl_kg);
                    String strQ7 = gl1.y.Q(mVar5, R.string.lbl_lbs);
                    boolean zR2 = mVar5.r(benchmarkExerciseOneRepMaxView);
                    Object objQ6 = mVar5.q();
                    if (zR2) {
                        objQ6 = new b(benchmarkExerciseOneRepMaxView, z14 ? 1 : 0);
                        mVar5.K(objQ6);
                    } else {
                        aVar.getClass();
                        if (objQ6 == m.a.f135155b) {
                            objQ6 = new b(benchmarkExerciseOneRepMaxView, z14 ? 1 : 0);
                            mVar5.K(objQ6);
                        }
                    }
                    u.a(rVarX, z15, false, strQ6, strQ7, null, null, dDoubleValue, 453.5d, 999.5d, 0, 0.0d, (e23.l) objQ6, null, null, true, false, mVar5, 905969670, 1769472, 27748);
                    mVar5.y();
                } else {
                    mVar5.e();
                }
                return Unit.INSTANCE;
        }
    }
}
