package cw1;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import g02.b2;
import java.util.List;
import l72.p2;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.x1;
import u1.a2;

/* JADX INFO: loaded from: classes10.dex */
public final class r0 {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f56184a;

        static {
            int[] iArr = new int[vt1.o.values().length];
            try {
                iArr[vt1.o.f180175f.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[vt1.o.f180176g.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f56184a = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(String str, List<? extends wt1.q> list, p3.m mVar, int i14) {
        p3.o0 o0VarE = mVar.E(-1647641776);
        int i15 = i14 | (o0VarE.B(str) ? 4 : 2) | (o0VarE.r(list) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            tu1.i.f166483a.getClass();
            o13.p pVarC = tu1.i.a.c(context, list);
            String str2 = (String) pVarC.f128594a;
            String str3 = (String) pVarC.f128595b;
            p2 p2Var = p2.f111205a;
            b92.a aVarA = wz1.a.a(str3);
            int i16 = i15 & 14;
            int i17 = b92.a.f16960b;
            p2Var.h(str, str2, null, null, aVarA, false, false, null, null, null, null, o0VarE, i16, 0, 2028);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new bv1.c(i14, 2, str, list);
        }
    }

    public static final void b(h4.r rVar, jv1.z zVar, boolean z14, int i14, int i15, e23.a aVar, e23.a aVar2, p3.m mVar, int i16) {
        h4.r rVar2;
        String strQ;
        e23.a aVar3 = aVar;
        e23.a aVar4 = aVar2;
        vt1.o oVar = zVar.f101180a;
        List<wt1.q> list = zVar.f101183d;
        p3.o0 o0VarE = mVar.E(1614146038);
        p3.c<?> cVar = o0VarE.f135177b;
        int i17 = i16 | 6 | (o0VarE.r(zVar) ? 32 : 16) | (o0VarE.h(z14) ? 256 : 128) | (o0VarE.k(i14) ? 2048 : 1024) | (o0VarE.k(i15) ? 16384 : 8192) | (o0VarE.r(aVar3) ? 131072 : 65536) | (o0VarE.r(aVar4) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288);
        if (o0VarE.n(i17 & 1, (599187 & i17) != 599186)) {
            h4.r.a aVar5 = h4.r.S;
            x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            h4.r rVarD = x2.d(aVar5, 1.0f);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            h4.g.a aVar6 = h4.d.a.f81536n;
            c2.z zVarA = c2.y.a(kVar, aVar6, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarD, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar7 = h5.g.a.f81805b;
            if (cVar == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar7);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar = h5.g.a.f81810g;
            b4.c(eVar, zVarA, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            h5.g.a.f fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC, o0VarE);
            h4.r rVarB = a2.b(c2.b0.f22601a.a(x2.f(aVar5, 1.0f), 1.0f, true), a2.a(o0VarE), true);
            c2.z zVarA2 = c2.y.a(kVar, aVar6, o0VarE, 0);
            int iHashCode2 = Long.hashCode(o0VarE.U);
            i2 i2VarA1 = o0VarE.a0();
            h4.r rVarC2 = h4.k.c(rVarB, o0VarE);
            if (cVar == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar7);
            } else {
                o0VarE.c();
            }
            b4.c(eVar, zVarA2, o0VarE);
            b4.c(c1623g, i2VarA1, o0VarE);
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
            }
            b4.c(fVar, rVarC2, o0VarE);
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            b2.a(c2.l.C(aVar5, 0.0f, 0.0f, 0.0f, j92.b.f97899b.f97921f, 7), z14, i14, i15, gl1.y.Q(o0VarE, R.string.confirm_training_preferences), gl1.y.Q(o0VarE, R.string.training_preferences_description), null, null, null, o0VarE, (i17 >> 3) & 8176, 448);
            o0VarE = o0VarE;
            if (zVar.f101187h) {
                o0VarE.C(1330915370);
                tw1.k kVar2 = zVar.f101188i;
                if (kVar2 == null) {
                    o0VarE.C(-1691296489);
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(-1691296488);
                    p2.f111205a.h(gl1.y.Q(o0VarE, R.string.lbl_training_level), gl1.y.Q(o0VarE, kVar2.f166749c), null, null, null, false, false, null, null, null, null, o0VarE, 0, 0, 2044);
                    o0VarE = o0VarE;
                    Unit unit = Unit.INSTANCE;
                    o0VarE.g0(false);
                }
                o0VarE.g0(false);
            } else {
                o0VarE.C(-1691036584);
                o0VarE.g0(false);
            }
            if (zVar.f101181b) {
                o0VarE.C(-1690929758);
                p3.o0 o0Var = o0VarE;
                p2.f111205a.h(gl1.y.Q(o0VarE, R.string.strength_workouts), gl1.y.Q(o0VarE, zVar.f101186g.f180121b), null, null, null, false, false, null, null, null, null, o0Var, 0, 0, 2044);
                o0VarE = o0Var;
                Unit unit2 = Unit.INSTANCE;
                o0VarE.g0(false);
            } else {
                o0VarE.C(-1690601096);
                o0VarE.g0(false);
            }
            a(gl1.y.Q(o0VarE, R.string.training_days), zVar.f101182c, o0VarE, 0);
            int i18 = a.f56184a[oVar.ordinal()];
            if (i18 == 1) {
                o0VarE.C(-1690264932);
                strQ = gl1.y.Q(o0VarE, list.size() > 1 ? R.string.long_run_days : R.string.atp_lbl_long_run_day);
                o0VarE.g0(false);
            } else if (i18 != 2) {
                o0VarE.C(-1689884004);
                strQ = gl1.y.Q(o0VarE, list.size() > 1 ? R.string.long_workout_days : R.string.long_workout_day);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-1690069322);
                strQ = gl1.y.Q(o0VarE, list.size() > 1 ? R.string.long_ride_days : R.string.itp_setup_option_long_day);
                o0VarE.g0(false);
            }
            a(strQ, list, o0VarE, 0);
            if (oVar == vt1.o.f180178i) {
                o0VarE.C(-1689476788);
                List<wt1.q> list2 = zVar.f101184e;
                if (list2 == null) {
                    o0VarE.C(-1689360322);
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(-1689360321);
                    a(gl1.y.Q(o0VarE, list2.size() > 1 ? R.string.swim_days : R.string.swim_day), list2, o0VarE, 0);
                    Unit unit3 = Unit.INSTANCE;
                    o0VarE.g0(false);
                }
                hv1.i iVar = zVar.f101185f;
                if (iVar == null) {
                    o0VarE.C(-1688958283);
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(-1688958282);
                    hv1.i.a aVar8 = hv1.i.f85867c;
                    String strB = iVar.b(context, false);
                    String strA = hv1.i.a(iVar, context);
                    p2 p2Var = p2.f111205a;
                    String strQ2 = gl1.y.Q(o0VarE, R.string.swim_distance);
                    b92.a aVarA = wz1.a.a(strA);
                    int i19 = b92.a.f16960b;
                    p3.o0 o0Var2 = o0VarE;
                    p2Var.h(strQ2, strB, null, null, aVarA, false, false, null, null, null, null, o0Var2, 0, 0, 2028);
                    o0VarE = o0Var2;
                    Unit unit4 = Unit.INSTANCE;
                    o0VarE.g0(false);
                }
                o0VarE.g0(false);
            } else {
                o0VarE.C(-1688481192);
                o0VarE.g0(false);
            }
            o0VarE.g0(true);
            aVar4 = aVar2;
            aVar3 = aVar;
            b82.c.b(null, null, z3.f.c(-423671093, new cq0.p(aVar4, 7), o0VarE), z3.f.c(-577444148, new cq0.p(aVar3, 8), o0VarE), 0L, o0VarE, 3456, 19);
            o0VarE.g0(true);
            rVar2 = aVar5;
        } else {
            o0VarE.e();
            rVar2 = rVar;
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a82.a(rVar2, zVar, z14, i14, i15, aVar3, aVar4, i16);
        }
    }
}
