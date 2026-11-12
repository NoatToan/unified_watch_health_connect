package ln1;

import android.content.Context;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.b0;
import c2.x2;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.charts.mpchart3.wrapper.CustomCombinedChart;
import d53.u;
import h5.e0;
import i3.mh;
import km1.v;
import l72.x0;
import lc.u0;
import li0.x;
import o72.t;
import org.joda.time.DateTimeConstants;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.p0;
import p3.x1;
import p3.y3;
import w2.a0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class f implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f113661a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ km1.c f113662b;

    public /* synthetic */ f(km1.c cVar, int i14) {
        this.f113661a = i14;
        this.f113662b = cVar;
    }

    private final Object a(Object obj, Object obj2) {
        jm1.c sleepScores;
        p3.m mVar = (p3.m) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            mn1.a aVar = new mn1.a(a0.s(mVar));
            v dailySleep = this.f113662b.getDailySleep();
            jm1.d lightPercentage = (dailySleep == null || (sleepScores = dailySleep.getSleepScores()) == null) ? null : sleepScores.getLightPercentage();
            g6.f.a aVar2 = g6.f.f75994b;
            h4.r rVarZ = c2.l.z(h4.r.S, 16, 8);
            Integer numValueOf = dailySleep != null ? Integer.valueOf(dailySleep.k0()) : null;
            Double optimalStart = lightPercentage != null ? lightPercentage.getOptimalStart() : null;
            Double optimalEnd = lightPercentage != null ? lightPercentage.getOptimalEnd() : null;
            l22.b bVar = aVar.f119755a;
            String strA = (numValueOf != null && numValueOf.intValue() == 2 && optimalStart != null && optimalStart.doubleValue() > 0.0d && optimalEnd != null && optimalEnd.doubleValue() > 0.0d) ? bVar.a(R.string.string_space_string_pattern, bVar.a(R.string.msg_sleep_score_light_recommendation_range, String.valueOf((int) optimalStart.doubleValue()), String.valueOf((int) optimalEnd.doubleValue())), bVar.a(R.string.msg_your_light_sleep_percentage, aVar.f119756b.a(lightPercentage.getValue()))) : bVar.a(R.string.msg_sleep_score_light_recommendation_range, "37", "60");
            d92.b.f58623a.getClass();
            d92.b.f58624b.getClass();
            mh.c(strA, rVarZ, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97933j, mVar), mVar, 0, 0, 131068);
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    private final Object b(Object obj, Object obj2) {
        jm1.c sleepScores;
        p3.m mVar = (p3.m) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            h4.r.a aVar = h4.r.S;
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = y.a(kVar, h4.d.a.f81536n, mVar, 0);
            int iHashCode = Long.hashCode(mVar.getU());
            i2 i2VarX = mVar.x();
            h4.r rVarC = h4.k.c(aVar, mVar);
            h5.g.V.getClass();
            e0.a aVar2 = h5.g.a.f81805b;
            jm1.d remPercentage = null;
            if (mVar.F() == null) {
                p0.l();
                throw null;
            }
            mVar.z();
            if (mVar.getT()) {
                mVar.M(aVar2);
            } else {
                mVar.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, mVar);
            b4.c(h5.g.a.f81809f, i2VarX, mVar);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (mVar.getT() || !s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                v.h.z(iHashCode, mVar, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, mVar);
            b0 b0Var = b0.f22601a;
            km1.c cVar = this.f113662b;
            v dailySleep = cVar.getDailySleep();
            if (dailySleep != null && (sleepScores = dailySleep.getSleepScores()) != null) {
                remPercentage = sleepScores.getRemPercentage();
            }
            if (remPercentage != null) {
                mVar.C(-1635036877);
                g6.f.a aVar3 = g6.f.f75994b;
                c2.l.f(x2.h(aVar, 48), mVar);
                int iK0 = (int) (((double) cVar.k0()) * 60.0d);
                Double value = remPercentage.getValue();
                double dDoubleValue = value != null ? value.doubleValue() : 0.0d;
                int iD = remPercentage.d();
                int iB = remPercentage.b();
                rl1.k.a aVar4 = rl1.k.f153439c;
                rl1.k kVar2 = rl1.k.REM;
                aVar4.getClass();
                kn1.j.b(iK0, dDoubleValue, iD, iB, rl1.k.a.a(kVar2, mVar), R.string.sleep_help_rem_sleep_label, cVar.a0(), R.string.lbl_total_rem_sleep_range, mVar, 0);
                mVar.f();
            } else {
                mVar.C(-1634225793);
                mVar.f();
            }
            mVar.y();
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    private final Object c(Object obj, Object obj2) {
        p3.m mVar = (p3.m) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            h4.r.a aVar = h4.r.S;
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = y.a(kVar, h4.d.a.f81536n, mVar, 0);
            int iHashCode = Long.hashCode(mVar.getU());
            i2 i2VarX = mVar.x();
            h4.r rVarC = h4.k.c(aVar, mVar);
            h5.g.V.getClass();
            e0.a aVar2 = h5.g.a.f81805b;
            if (mVar.F() == null) {
                p0.l();
                throw null;
            }
            mVar.z();
            if (mVar.getT()) {
                mVar.M(aVar2);
            } else {
                mVar.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, mVar);
            b4.c(h5.g.a.f81809f, i2VarX, mVar);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (mVar.getT() || !s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                v.h.z(iHashCode, mVar, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, mVar);
            b0 b0Var = b0.f22601a;
            mn1.d dVar = new mn1.d(a0.s(mVar));
            oi0.h hVar = new oi0.h((Context) mVar.A(AndroidCompositionLocals_androidKt.f6042b));
            g6.f.a aVar3 = g6.f.f75994b;
            c2.l.f(x2.h(aVar, 8), mVar);
            x0.f111346a.e(c2.l.y(aVar, 16), z3.f.c(-1576838819, new h(dVar, this.f113662b, hVar, 3), mVar), mVar, (x0.f111348c << 6) | 54, 0);
            mVar.y();
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    private final Object d(Object obj, Object obj2) {
        jm1.c sleepScores;
        p3.m mVar = (p3.m) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            mn1.a aVar = new mn1.a(a0.s(mVar));
            v dailySleep = this.f113662b.getDailySleep();
            jm1.d remPercentage = (dailySleep == null || (sleepScores = dailySleep.getSleepScores()) == null) ? null : sleepScores.getRemPercentage();
            g6.f.a aVar2 = g6.f.f75994b;
            h4.r rVarZ = c2.l.z(h4.r.S, 16, 8);
            Integer numValueOf = dailySleep != null ? Integer.valueOf(dailySleep.k0()) : null;
            Double optimalStart = remPercentage != null ? remPercentage.getOptimalStart() : null;
            Double optimalEnd = remPercentage != null ? remPercentage.getOptimalEnd() : null;
            l22.b bVar = aVar.f119755a;
            String strA = (numValueOf != null && numValueOf.intValue() == 2 && optimalStart != null && optimalStart.doubleValue() > 0.0d && optimalEnd != null && optimalEnd.doubleValue() > 0.0d) ? bVar.a(R.string.string_space_string_pattern, bVar.a(R.string.msg_sleep_score_rem_recommendation_range, String.valueOf((int) optimalStart.doubleValue()), String.valueOf((int) optimalEnd.doubleValue())), bVar.a(R.string.msg_your_rem_sleep_percentage, aVar.f119756b.a(remPercentage.getValue()))) : bVar.a(R.string.msg_sleep_score_rem_recommendation_range, "21", "29");
            d92.b.f58623a.getClass();
            d92.b.f58624b.getClass();
            mh.c(strA, rVarZ, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97933j, mVar), mVar, 0, 0, 131068);
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    private final Object e(Object obj, Object obj2) {
        p3.m mVar = (p3.m) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            Context context = (Context) mVar.A(AndroidCompositionLocals_androidKt.f6042b);
            String strQ = gl1.y.Q(mVar, R.string.lbl_about_stress_and_sleep);
            km1.c cVar = this.f113662b;
            kn1.f.a(strQ, z3.f.c(-1130269161, new l(context, cVar), mVar), z3.f.c(2099730904, new f(cVar, 24), mVar), z3.f.c(1034763673, new f(cVar, 25), mVar), mVar, 3504, 0);
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    private final Object f(Object obj, Object obj2) {
        p3.m mVar = (p3.m) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            v dailySleep = this.f113662b.getDailySleep();
            int iK0 = dailySleep != null ? dailySleep.k0() : 1;
            nn1.a aVar = (iK0 == 1 || iK0 != 2) ? nn1.b.f126696h : nn1.b.f126697i;
            kn1.f.b(aVar, mVar, 0);
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    private final Object g(Object obj, Object obj2) {
        p3.m mVar = (p3.m) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            h4.r.a aVar = h4.r.S;
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = y.a(kVar, h4.d.a.f81536n, mVar, 0);
            int iHashCode = Long.hashCode(mVar.getU());
            i2 i2VarX = mVar.x();
            h4.r rVarC = h4.k.c(aVar, mVar);
            h5.g.V.getClass();
            e0.a aVar2 = h5.g.a.f81805b;
            if (mVar.F() == null) {
                p0.l();
                throw null;
            }
            mVar.z();
            if (mVar.getT()) {
                mVar.M(aVar2);
            } else {
                mVar.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, mVar);
            b4.c(h5.g.a.f81809f, i2VarX, mVar);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (mVar.getT() || !s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                v.h.z(iHashCode, mVar, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, mVar);
            b0 b0Var = b0.f22601a;
            mn1.d dVar = new mn1.d(a0.s(mVar));
            g6.f.a aVar3 = g6.f.f75994b;
            c2.l.f(x2.h(aVar, 8), mVar);
            x0.f111346a.e(c2.l.y(aVar, 16), z3.f.c(743337127, new i(dVar, this.f113662b, 1), mVar), mVar, (x0.f111348c << 6) | 54, 0);
            mVar.y();
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        jm1.c sleepScores;
        jm1.c sleepScores2;
        jm1.b bVar;
        String strA;
        jm1.c sleepScores3;
        jm1.c sleepScores4;
        jm1.c sleepScores5;
        int i14 = this.f113661a;
        p3.m.a aVar = p3.m.f135153a;
        int i15 = 14;
        int i16 = 20;
        int i17 = 19;
        int i18 = 6;
        int i19 = 16;
        jm1.d deepPercentage = null;
        lightPercentage = null;
        jm1.d lightPercentage = null;
        deepPercentage = null;
        final km1.c cVar = this.f113662b;
        int i24 = 2;
        boolean z14 = false;
        final int i25 = 1;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    String strV = u.v(gl1.y.Q(mVar, R.string.lbl_about_awake_restlessness), "/", " & ", false);
                    z3.e eVarC = z3.f.c(-2058167123, new f(cVar, i25), mVar);
                    z3.e eVarC2 = z3.f.c(-832501330, new f(cVar, i24), mVar);
                    a.f113649a.getClass();
                    kn1.f.a(strV, eVarC, eVarC2, a.f113650b, mVar, 3504, 0);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 1:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar2.n(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    g6.f.a aVar2 = g6.f.f75994b;
                    h4.r rVarH = x2.h(x2.f(h4.r.S, 1.0f), 270);
                    Object objQ = mVar2.q();
                    aVar.getClass();
                    p3.m.a.C2565a c2565a = p3.m.a.f135155b;
                    if (objQ == c2565a) {
                        objQ = new x(20);
                        mVar2.K(objQ);
                    }
                    e23.l lVar = (e23.l) objQ;
                    boolean zR = mVar2.r(cVar);
                    Object objQ2 = mVar2.q();
                    if (zR || objQ2 == c2565a) {
                        final int i26 = z14 ? 1 : 0;
                        objQ2 = new e23.l() { // from class: ln1.j
                            @Override // e23.l
                            public final Object invoke(Object obj3) {
                                View view2 = (View) obj3;
                                switch (i26) {
                                    case 0:
                                        if (view2 instanceof CustomCombinedChart) {
                                            sl1.h hVar = new sl1.h((CustomCombinedChart) view2, rl1.j.STAGES, rl1.i.AWAKE_RESTLESSNESS, null, 8, null);
                                            tm1.a.f165439a.getClass();
                                            uz.a.a(hVar, tm1.a.C3110a.a(cVar), null, 6);
                                        }
                                        break;
                                    default:
                                        if (view2 instanceof CustomCombinedChart) {
                                            sl1.h hVar2 = new sl1.h((CustomCombinedChart) view2, rl1.j.STAGES, null, null, 12, null);
                                            tm1.a.f165439a.getClass();
                                            uz.a.a(hVar2, tm1.a.C3110a.a(cVar), null, 6);
                                        }
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar2.K(objQ2);
                    }
                    p002j6.c.b(lVar, rVarH, (e23.l) objQ2, mVar2, 54, 0);
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 2:
                p3.m mVar3 = (p3.m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x1 x1Var3 = p3.n.f135158a;
                    h4.r.a aVar3 = h4.r.S;
                    c2.j.f22691a.getClass();
                    c2.j.k kVar = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    z zVarA = y.a(kVar, h4.d.a.f81536n, mVar3, 0);
                    int iHashCode = Long.hashCode(mVar3.getU());
                    i2 i2VarX = mVar3.x();
                    h4.r rVarC = h4.k.c(aVar3, mVar3);
                    h5.g.V.getClass();
                    e0.a aVar4 = h5.g.a.f81805b;
                    if (mVar3.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar3.z();
                    if (mVar3.getT()) {
                        mVar3.M(aVar4);
                    } else {
                        mVar3.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA, mVar3);
                    b4.c(h5.g.a.f81809f, i2VarX, mVar3);
                    h5.g.a.b bVar2 = h5.g.a.f81813j;
                    if (mVar3.getT() || !s.g(mVar3.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar3, iHashCode, bVar2);
                    }
                    b4.c(h5.g.a.f81807d, rVarC, mVar3);
                    b0 b0Var = b0.f22601a;
                    mn1.d dVar = new mn1.d(a0.s(mVar3));
                    oi0.h hVar = new oi0.h((Context) mVar3.A(AndroidCompositionLocals_androidKt.f6042b));
                    g6.f.a aVar5 = g6.f.f75994b;
                    c2.l.f(x2.h(aVar3, 8), mVar3);
                    x0 x0Var = x0.f111346a;
                    float f14 = 16;
                    h4.r rVarY = c2.l.y(aVar3, f14);
                    z3.e eVarC3 = z3.f.c(287934269, new h(dVar, cVar, hVar, 0), mVar3);
                    int i27 = (x0.f111348c << 6) | 54;
                    x0Var.e(rVarY, eVarC3, mVar3, i27, 0);
                    x0Var.e(c2.l.y(aVar3, f14), z3.f.c(-2040944268, new i(dVar, cVar, 0), mVar3), mVar3, i27, 0);
                    mVar3.y();
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            case 3:
                p3.m mVar4 = (p3.m) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    x1 x1Var4 = p3.n.f135158a;
                    Context context = (Context) mVar4.A(AndroidCompositionLocals_androidKt.f6042b);
                    String strQ = gl1.y.Q(mVar4, R.string.lbl_about_awake_time);
                    z3.e eVarC4 = z3.f.c(1000260653, new l(cVar, context), mVar4);
                    b.f113652a.getClass();
                    kn1.f.a(strQ, eVarC4, null, b.f113653b, mVar4, 3120, 4);
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
            case 4:
                p3.m mVar5 = (p3.m) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (mVar5.n(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    x1 x1Var5 = p3.n.f135158a;
                    kn1.f.a(gl1.y.Q(mVar5, R.string.lbl_about_deep_sleep), z3.f.c(-900378521, new f(cVar, 5), mVar5), z3.f.c(1159543976, new f(cVar, i18), mVar5), z3.f.c(-1075500823, new f(cVar, 7), mVar5), mVar5, 3504, 0);
                } else {
                    mVar5.e();
                }
                return Unit.INSTANCE;
            case 5:
                p3.m mVar6 = (p3.m) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (mVar6.n(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    x1 x1Var6 = p3.n.f135158a;
                    h4.r.a aVar6 = h4.r.S;
                    c2.j.f22691a.getClass();
                    c2.j.k kVar2 = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    z zVarA2 = y.a(kVar2, h4.d.a.f81536n, mVar6, 0);
                    int iHashCode2 = Long.hashCode(mVar6.getU());
                    i2 i2VarX2 = mVar6.x();
                    h4.r rVarC2 = h4.k.c(aVar6, mVar6);
                    h5.g.V.getClass();
                    e0.a aVar7 = h5.g.a.f81805b;
                    if (mVar6.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar6.z();
                    if (mVar6.getT()) {
                        mVar6.M(aVar7);
                    } else {
                        mVar6.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA2, mVar6);
                    b4.c(h5.g.a.f81809f, i2VarX2, mVar6);
                    h5.g.a.b bVar3 = h5.g.a.f81813j;
                    if (mVar6.getT() || !s.g(mVar6.q(), Integer.valueOf(iHashCode2))) {
                        v.h.z(iHashCode2, mVar6, iHashCode2, bVar3);
                    }
                    b4.c(h5.g.a.f81807d, rVarC2, mVar6);
                    b0 b0Var2 = b0.f22601a;
                    v dailySleep = cVar.getDailySleep();
                    if (dailySleep != null && (sleepScores = dailySleep.getSleepScores()) != null) {
                        deepPercentage = sleepScores.getDeepPercentage();
                    }
                    if (deepPercentage != null) {
                        mVar6.C(450329457);
                        g6.f.a aVar8 = g6.f.f75994b;
                        c2.l.f(x2.h(aVar6, 48), mVar6);
                        int iI0 = (int) (((double) cVar.i0()) * 60.0d);
                        Double value = deepPercentage.getValue();
                        double dDoubleValue = value != null ? value.doubleValue() : 0.0d;
                        int iD = deepPercentage.d();
                        int iB = deepPercentage.b();
                        rl1.k.a aVar9 = rl1.k.f153439c;
                        rl1.k kVar3 = rl1.k.DEEP;
                        aVar9.getClass();
                        kn1.j.b(iI0, dDoubleValue, iD, iB, rl1.k.a.a(kVar3, mVar6), R.string.sleep_help_deep_sleep_label, cVar.H(), R.string.lbl_total_deep_sleep_range, mVar6, 0);
                        mVar6.f();
                    } else {
                        mVar6.C(451148229);
                        mVar6.f();
                    }
                    mVar6.y();
                } else {
                    mVar6.e();
                }
                return Unit.INSTANCE;
            case 6:
                p3.m mVar7 = (p3.m) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (mVar7.n(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    x1 x1Var7 = p3.n.f135158a;
                    h4.r.a aVar10 = h4.r.S;
                    c2.j.f22691a.getClass();
                    c2.j.k kVar4 = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    z zVarA3 = y.a(kVar4, h4.d.a.f81536n, mVar7, 0);
                    int iHashCode3 = Long.hashCode(mVar7.getU());
                    i2 i2VarX3 = mVar7.x();
                    h4.r rVarC3 = h4.k.c(aVar10, mVar7);
                    h5.g.V.getClass();
                    e0.a aVar11 = h5.g.a.f81805b;
                    if (mVar7.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar7.z();
                    if (mVar7.getT()) {
                        mVar7.M(aVar11);
                    } else {
                        mVar7.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA3, mVar7);
                    b4.c(h5.g.a.f81809f, i2VarX3, mVar7);
                    h5.g.a.b bVar4 = h5.g.a.f81813j;
                    if (mVar7.getT() || !s.g(mVar7.q(), Integer.valueOf(iHashCode3))) {
                        v.h.z(iHashCode3, mVar7, iHashCode3, bVar4);
                    }
                    b4.c(h5.g.a.f81807d, rVarC3, mVar7);
                    b0 b0Var3 = b0.f22601a;
                    mn1.d dVar2 = new mn1.d(a0.s(mVar7));
                    oi0.h hVar2 = new oi0.h((Context) mVar7.A(AndroidCompositionLocals_androidKt.f6042b));
                    g6.f.a aVar12 = g6.f.f75994b;
                    c2.l.f(x2.h(aVar10, 8), mVar7);
                    x0.f111346a.e(c2.l.y(aVar10, 16), z3.f.c(329518839, new h(dVar2, cVar, hVar2, 1), mVar7), mVar7, (x0.f111348c << 6) | 54, 0);
                    mVar7.y();
                } else {
                    mVar7.e();
                }
                return Unit.INSTANCE;
            case 7:
                p3.m mVar8 = (p3.m) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (mVar8.n(1 & iIntValue8, (iIntValue8 & 3) != 2)) {
                    x1 x1Var8 = p3.n.f135158a;
                    mn1.a aVar13 = new mn1.a(a0.s(mVar8));
                    v dailySleep2 = cVar.getDailySleep();
                    jm1.d deepPercentage2 = (dailySleep2 == null || (sleepScores2 = dailySleep2.getSleepScores()) == null) ? null : sleepScores2.getDeepPercentage();
                    g6.f.a aVar14 = g6.f.f75994b;
                    h4.r rVarZ = c2.l.z(h4.r.S, 16, 8);
                    Integer numValueOf = dailySleep2 != null ? Integer.valueOf(dailySleep2.k0()) : null;
                    Double optimalStart = deepPercentage2 != null ? deepPercentage2.getOptimalStart() : null;
                    Double optimalEnd = deepPercentage2 != null ? deepPercentage2.getOptimalEnd() : null;
                    l22.b bVar5 = aVar13.f119755a;
                    String strA2 = (numValueOf != null && numValueOf.intValue() == 2 && optimalStart != null && optimalStart.doubleValue() > 0.0d && optimalEnd != null && optimalEnd.doubleValue() > 0.0d) ? bVar5.a(R.string.string_space_string_pattern, bVar5.a(R.string.msg_sleep_score_deep_recommendation_range, String.valueOf((int) optimalStart.doubleValue()), String.valueOf((int) optimalEnd.doubleValue())), bVar5.a(R.string.msg_your_deep_sleep_percentage, aVar13.f119756b.a(deepPercentage2.getValue()))) : bVar5.a(R.string.msg_sleep_score_deep_recommendation_range, "17", "35");
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    mh.c(strA2, rVarZ, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97933j, mVar8), mVar8, 0, 0, 131068);
                } else {
                    mVar8.e();
                }
                return Unit.INSTANCE;
            case 8:
                p3.m mVar9 = (p3.m) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                if (mVar9.n(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    x1 x1Var9 = p3.n.f135158a;
                    kn1.f.a(gl1.y.Q(mVar9, R.string.lbl_about_sleep_duration), z3.f.c(-1478180969, new f(cVar, 10), mVar9), z3.f.c(660658904, new f(cVar, 11), mVar9), z3.f.c(-1495468519, new f(cVar, 12), mVar9), mVar9, 3504, 0);
                } else {
                    mVar9.e();
                }
                return Unit.INSTANCE;
            case 9:
                p3.m mVar10 = (p3.m) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                if (mVar10.n(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    x1 x1Var10 = p3.n.f135158a;
                    v dailySleep3 = cVar.getDailySleep();
                    int iK0 = dailySleep3 != null ? dailySleep3.k0() : 1;
                    nn1.a aVar15 = (iK0 == 1 || iK0 != 2) ? nn1.b.f126689a : nn1.b.f126690b;
                    kn1.f.b(aVar15, mVar10, 0);
                } else {
                    mVar10.e();
                }
                return Unit.INSTANCE;
            case 10:
                p3.m mVar11 = (p3.m) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                if (mVar11.n(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    x1 x1Var11 = p3.n.f135158a;
                    g6.f.a aVar16 = g6.f.f75994b;
                    h4.r rVarH2 = x2.h(x2.f(h4.r.S, 1.0f), 270);
                    Object objQ3 = mVar11.q();
                    aVar.getClass();
                    p3.m.a.C2565a c2565a2 = p3.m.a.f135155b;
                    if (objQ3 == c2565a2) {
                        objQ3 = new x(22);
                        mVar11.K(objQ3);
                    }
                    e23.l lVar2 = (e23.l) objQ3;
                    boolean zR2 = mVar11.r(cVar);
                    Object objQ4 = mVar11.q();
                    if (zR2 || objQ4 == c2565a2) {
                        objQ4 = new e23.l() { // from class: ln1.j
                            @Override // e23.l
                            public final Object invoke(Object obj3) {
                                View view2 = (View) obj3;
                                switch (i25) {
                                    case 0:
                                        if (view2 instanceof CustomCombinedChart) {
                                            sl1.h hVar3 = new sl1.h((CustomCombinedChart) view2, rl1.j.STAGES, rl1.i.AWAKE_RESTLESSNESS, null, 8, null);
                                            tm1.a.f165439a.getClass();
                                            uz.a.a(hVar3, tm1.a.C3110a.a(cVar), null, 6);
                                        }
                                        break;
                                    default:
                                        if (view2 instanceof CustomCombinedChart) {
                                            sl1.h hVar4 = new sl1.h((CustomCombinedChart) view2, rl1.j.STAGES, null, null, 12, null);
                                            tm1.a.f165439a.getClass();
                                            uz.a.a(hVar4, tm1.a.C3110a.a(cVar), null, 6);
                                        }
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar11.K(objQ4);
                    }
                    p002j6.c.b(lVar2, rVarH2, (e23.l) objQ4, mVar11, 54, 0);
                } else {
                    mVar11.e();
                }
                return Unit.INSTANCE;
            case 11:
                p3.m mVar12 = (p3.m) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                if (mVar12.n(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    x1 x1Var12 = p3.n.f135158a;
                    h4.r.a aVar17 = h4.r.S;
                    c2.j.f22691a.getClass();
                    c2.j.k kVar5 = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    z zVarA4 = y.a(kVar5, h4.d.a.f81536n, mVar12, 0);
                    int iHashCode4 = Long.hashCode(mVar12.getU());
                    i2 i2VarX4 = mVar12.x();
                    h4.r rVarC4 = h4.k.c(aVar17, mVar12);
                    h5.g.V.getClass();
                    e0.a aVar18 = h5.g.a.f81805b;
                    if (mVar12.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar12.z();
                    if (mVar12.getT()) {
                        mVar12.M(aVar18);
                    } else {
                        mVar12.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA4, mVar12);
                    b4.c(h5.g.a.f81809f, i2VarX4, mVar12);
                    h5.g.a.b bVar6 = h5.g.a.f81813j;
                    if (mVar12.getT() || !s.g(mVar12.q(), Integer.valueOf(iHashCode4))) {
                        v.h.z(iHashCode4, mVar12, iHashCode4, bVar6);
                    }
                    b4.c(h5.g.a.f81807d, rVarC4, mVar12);
                    b0 b0Var4 = b0.f22601a;
                    b10.c cVar2 = new b10.c(a0.s(mVar12));
                    y3 y3Var = AndroidCompositionLocals_androidKt.f6042b;
                    b10.d dVar3 = new b10.d((Context) mVar12.A(y3Var));
                    oi0.h hVar3 = new oi0.h((Context) mVar12.A(y3Var));
                    tm1.a.C3110a c3110a = tm1.a.f165439a;
                    km1.c cVar3 = this.f113662b;
                    tm1.b bVarN = t.N(cVar3);
                    c3110a.getClass();
                    rl1.h hVarC = tm1.a.C3110a.c(bVarN);
                    g6.f.a aVar19 = g6.f.f75994b;
                    c2.l.f(x2.h(aVar17, 8), mVar12);
                    x0.f111346a.e(c2.l.y(aVar17, 16), z3.f.c(-200020441, new ku1.l(dVar3, cVar3, cVar2, hVarC, hVar3, 4), mVar12), mVar12, (x0.f111348c << 6) | 54, 0);
                    in1.j.b(hVarC, in1.a.a(cVar3), mVar12, 0);
                    mVar12.y();
                } else {
                    mVar12.e();
                }
                return Unit.INSTANCE;
            case 12:
                p3.m mVar13 = (p3.m) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                if (mVar13.n(1 & iIntValue13, (iIntValue13 & 3) != 2)) {
                    x1 x1Var13 = p3.n.f135158a;
                    mn1.a aVar20 = new mn1.a(a0.s(mVar13));
                    int iU = ((bv.d) KoinJavaComponent.get$default(bv.d.class, null, null, 6, null)).u();
                    v dailySleep4 = cVar.getDailySleep();
                    jm1.d totalDuration = (dailySleep4 == null || (sleepScores3 = dailySleep4.getSleepScores()) == null) ? null : sleepScores3.getTotalDuration();
                    v dailySleep5 = cVar.getDailySleep();
                    Integer numValueOf2 = dailySleep5 != null ? Integer.valueOf(dailySleep5.k0()) : null;
                    g6.f.a aVar21 = g6.f.f75994b;
                    h4.r rVarZ2 = c2.l.z(h4.r.S, 16, 8);
                    if (iU == 13) {
                        bVar = jm1.b.AGE_13;
                    } else if (14 <= iU && iU < 16) {
                        bVar = jm1.b.AGE_14_15;
                    } else if (16 <= iU && iU < 19) {
                        bVar = jm1.b.AGE_16_18;
                    } else if (19 <= iU && iU < 22) {
                        bVar = jm1.b.AGE_19_21;
                    } else if (22 > iU || iU >= 80) {
                        bVar = (80 > iU || iU >= 110) ? jm1.b.AGE_UNDEFINED : jm1.b.AGE_80_109;
                    } else {
                        bVar = jm1.b.AGE_22_79;
                    }
                    Double optimalEnd2 = totalDuration != null ? totalDuration.getOptimalEnd() : null;
                    l22.b bVar7 = aVar20.f119755a;
                    if (numValueOf2 != null && numValueOf2.intValue() == 2 && optimalEnd2 != null && optimalEnd2.doubleValue() > 0.0d) {
                        int iDoubleValue = (int) optimalEnd2.doubleValue();
                        int i28 = iDoubleValue / DateTimeConstants.SECONDS_PER_HOUR;
                        int i29 = (iDoubleValue % DateTimeConstants.SECONDS_PER_HOUR) / 60;
                        strA = i29 > 0 ? bVar7.a(R.string.lbl_hours_and_minutes, String.valueOf(i28), String.valueOf(i29)) : bVar7.a(R.string.lbl_plural_more_than_one_hour, String.valueOf(i28));
                    } else {
                        switch (mn1.a.b.f119757a[bVar.ordinal()]) {
                            case 1:
                                strA = bVar7.a(R.string.lbl_plural_more_than_one_hour, "10");
                                break;
                            case 2:
                                strA = bVar7.a(R.string.lbl_hours_and_minutes, "9", "30");
                                break;
                            case 3:
                                strA = bVar7.a(R.string.lbl_plural_more_than_one_hour, "9");
                                break;
                            case 4:
                                strA = bVar7.a(R.string.lbl_hours_and_minutes, "8", "30");
                                break;
                            case 5:
                                strA = bVar7.a(R.string.lbl_plural_more_than_one_hour, "8");
                                break;
                            case 6:
                                strA = bVar7.a(R.string.lbl_hours_and_minutes, "7", "30");
                                break;
                            case 7:
                                strA = null;
                                break;
                            default:
                                u0.r();
                                return null;
                        }
                    }
                    String strA3 = "";
                    if (strA != null) {
                        switch (mn1.a.b.f119757a[bVar.ordinal()]) {
                            case 1:
                            case 2:
                            case 3:
                                strA3 = bVar7.a(R.string.msg_sleep_duration_teens, strA);
                                break;
                            case 4:
                            case 5:
                            case 6:
                                strA3 = bVar7.a(R.string.msg_sleep_duration_adults, strA);
                                break;
                            case 7:
                                break;
                            default:
                                u0.r();
                                return null;
                        }
                    }
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    mh.c(strA3, rVarZ2, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97933j, mVar13), mVar13, 0, 0, 131068);
                } else {
                    mVar13.e();
                }
                return Unit.INSTANCE;
            case 13:
                p3.m mVar14 = (p3.m) obj;
                int iIntValue14 = ((Integer) obj2).intValue();
                if (mVar14.n(1 & iIntValue14, (iIntValue14 & 3) != 2)) {
                    x1 x1Var14 = p3.n.f135158a;
                    kn1.f.a(gl1.y.Q(mVar14, R.string.lbl_about_light_sleep), z3.f.c(1173115789, new f(cVar, i15), mVar14), z3.f.c(778711950, new f(cVar, 15), mVar14), z3.f.c(384308111, new f(cVar, i19), mVar14), mVar14, 3504, 0);
                } else {
                    mVar14.e();
                }
                return Unit.INSTANCE;
            case 14:
                p3.m mVar15 = (p3.m) obj;
                int iIntValue15 = ((Integer) obj2).intValue();
                if (mVar15.n(iIntValue15 & 1, (iIntValue15 & 3) != 2)) {
                    x1 x1Var15 = p3.n.f135158a;
                    h4.r.a aVar22 = h4.r.S;
                    c2.j.f22691a.getClass();
                    c2.j.k kVar6 = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    z zVarA5 = y.a(kVar6, h4.d.a.f81536n, mVar15, 0);
                    int iHashCode5 = Long.hashCode(mVar15.getU());
                    i2 i2VarX5 = mVar15.x();
                    h4.r rVarC5 = h4.k.c(aVar22, mVar15);
                    h5.g.V.getClass();
                    e0.a aVar23 = h5.g.a.f81805b;
                    if (mVar15.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar15.z();
                    if (mVar15.getT()) {
                        mVar15.M(aVar23);
                    } else {
                        mVar15.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA5, mVar15);
                    b4.c(h5.g.a.f81809f, i2VarX5, mVar15);
                    h5.g.a.b bVar8 = h5.g.a.f81813j;
                    if (mVar15.getT() || !s.g(mVar15.q(), Integer.valueOf(iHashCode5))) {
                        v.h.z(iHashCode5, mVar15, iHashCode5, bVar8);
                    }
                    b4.c(h5.g.a.f81807d, rVarC5, mVar15);
                    b0 b0Var5 = b0.f22601a;
                    v dailySleep6 = cVar.getDailySleep();
                    if (dailySleep6 != null && (sleepScores4 = dailySleep6.getSleepScores()) != null) {
                        lightPercentage = sleepScores4.getLightPercentage();
                    }
                    if (lightPercentage != null) {
                        mVar15.C(739729571);
                        g6.f.a aVar24 = g6.f.f75994b;
                        c2.l.f(x2.h(aVar22, 48), mVar15);
                        int iJ0 = (int) (((double) cVar.j0()) * 60.0d);
                        Double value2 = lightPercentage.getValue();
                        double dDoubleValue2 = value2 != null ? value2.doubleValue() : 0.0d;
                        int iD2 = lightPercentage.d();
                        int iB2 = lightPercentage.b();
                        rl1.k.a aVar25 = rl1.k.f153439c;
                        rl1.k kVar7 = rl1.k.LIGHT;
                        aVar25.getClass();
                        kn1.j.b(iJ0, dDoubleValue2, iD2, iB2, rl1.k.a.a(kVar7, mVar15), R.string.sleep_help_light_sleep_label, cVar.M(), R.string.lbl_total_light_sleep_range, mVar15, 0);
                        mVar15.f();
                    } else {
                        mVar15.C(740556031);
                        mVar15.f();
                    }
                    mVar15.y();
                } else {
                    mVar15.e();
                }
                return Unit.INSTANCE;
            case 15:
                p3.m mVar16 = (p3.m) obj;
                int iIntValue16 = ((Integer) obj2).intValue();
                if (mVar16.n(iIntValue16 & 1, (iIntValue16 & 3) != 2)) {
                    x1 x1Var16 = p3.n.f135158a;
                    h4.r.a aVar26 = h4.r.S;
                    c2.j.f22691a.getClass();
                    c2.j.k kVar8 = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    z zVarA6 = y.a(kVar8, h4.d.a.f81536n, mVar16, 0);
                    int iHashCode6 = Long.hashCode(mVar16.getU());
                    i2 i2VarX6 = mVar16.x();
                    h4.r rVarC6 = h4.k.c(aVar26, mVar16);
                    h5.g.V.getClass();
                    e0.a aVar27 = h5.g.a.f81805b;
                    if (mVar16.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar16.z();
                    if (mVar16.getT()) {
                        mVar16.M(aVar27);
                    } else {
                        mVar16.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA6, mVar16);
                    b4.c(h5.g.a.f81809f, i2VarX6, mVar16);
                    h5.g.a.b bVar9 = h5.g.a.f81813j;
                    if (mVar16.getT() || !s.g(mVar16.q(), Integer.valueOf(iHashCode6))) {
                        v.h.z(iHashCode6, mVar16, iHashCode6, bVar9);
                    }
                    b4.c(h5.g.a.f81807d, rVarC6, mVar16);
                    b0 b0Var6 = b0.f22601a;
                    mn1.d dVar4 = new mn1.d(a0.s(mVar16));
                    oi0.h hVar4 = new oi0.h((Context) mVar16.A(AndroidCompositionLocals_androidKt.f6042b));
                    g6.f.a aVar28 = g6.f.f75994b;
                    c2.l.f(x2.h(aVar26, 8), mVar16);
                    x0.f111346a.e(c2.l.y(aVar26, 16), z3.f.c(1988472349, new h(dVar4, cVar, hVar4, 2), mVar16), mVar16, (x0.f111348c << 6) | 54, 0);
                    mVar16.y();
                } else {
                    mVar16.e();
                }
                return Unit.INSTANCE;
            case 16:
                return a(obj, obj2);
            case 17:
                p3.m mVar17 = (p3.m) obj;
                int iIntValue17 = ((Integer) obj2).intValue();
                if (mVar17.n(iIntValue17 & 1, (iIntValue17 & 3) != 2)) {
                    x1 x1Var17 = p3.n.f135158a;
                    kn1.f.a(gl1.y.Q(mVar17, R.string.lbl_about_rem_sleep), z3.f.c(-1980352819, new f(cVar, i17), mVar17), z3.f.c(-1902231730, new f(cVar, i16), mVar17), z3.f.c(-1824110641, new f(cVar, 21), mVar17), mVar17, 3504, 0);
                } else {
                    mVar17.e();
                }
                return Unit.INSTANCE;
            case 18:
                p3.m mVar18 = (p3.m) obj;
                int iIntValue18 = ((Integer) obj2).intValue();
                if (mVar18.n(iIntValue18 & 1, (iIntValue18 & 3) != 2)) {
                    x1 x1Var18 = p3.n.f135158a;
                    v dailySleep7 = cVar.getDailySleep();
                    int iK1 = dailySleep7 != null ? dailySleep7.k0() : 1;
                    nn1.a aVar29 = (iK1 == 1 || iK1 != 2) ? nn1.b.f126693e : nn1.b.f126694f;
                    kn1.f.b(aVar29, mVar18, 0);
                } else {
                    mVar18.e();
                }
                return Unit.INSTANCE;
            case 19:
                return b(obj, obj2);
            case 20:
                return c(obj, obj2);
            case 21:
                return d(obj, obj2);
            case 22:
                return e(obj, obj2);
            case 23:
                return f(obj, obj2);
            case 24:
                return g(obj, obj2);
            default:
                p3.m mVar19 = (p3.m) obj;
                int iIntValue19 = ((Integer) obj2).intValue();
                if (mVar19.n(iIntValue19 & 1, (iIntValue19 & 3) != 2)) {
                    x1 x1Var19 = p3.n.f135158a;
                    mn1.a aVar30 = new mn1.a(a0.s(mVar19));
                    v dailySleep8 = cVar.getDailySleep();
                    jm1.d stress = (dailySleep8 == null || (sleepScores5 = dailySleep8.getSleepScores()) == null) ? null : sleepScores5.getStress();
                    v dailySleep9 = cVar.getDailySleep();
                    Integer numValueOf3 = dailySleep9 != null ? Integer.valueOf(dailySleep9.k0()) : null;
                    g6.f.a aVar31 = g6.f.f75994b;
                    h4.r rVarZ3 = c2.l.z(h4.r.S, 16, 8);
                    Double optimalEnd3 = stress != null ? stress.getOptimalEnd() : null;
                    l22.b bVar10 = aVar30.f119755a;
                    String strA4 = (numValueOf3 != null && numValueOf3.intValue() == 2 && optimalEnd3 != null && optimalEnd3.doubleValue() > 0.0d) ? bVar10.a(R.string.msg_sleep_time_stress_recommendation_value_2, String.valueOf((int) optimalEnd3.doubleValue())) : bVar10.getString(R.string.msg_sleep_time_stress_recommendation);
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    mh.c(strA4, rVarZ3, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97933j, mVar19), mVar19, 0, 0, 131068);
                } else {
                    mVar19.e();
                }
                return Unit.INSTANCE;
        }
    }
}
