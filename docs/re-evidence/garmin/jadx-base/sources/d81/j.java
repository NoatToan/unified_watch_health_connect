package d81;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import f72.n0;
import i3.mh;
import java.util.ArrayList;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final class j {
    /* JADX WARN: Code duplicated, block: B:65:0x01ef  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v36 */
    public static final void a(g81.p pVar, p3.m mVar, int i14) {
        ?? r14;
        o0 o0Var;
        boolean z14;
        o0 o0Var2;
        a81.c cVar;
        String str;
        boolean z15;
        c2.b0 b0Var;
        o0 o0Var3;
        o0 o0Var4;
        o0 o0Var5;
        boolean z16;
        o0 o0VarE = mVar.E(1164703510);
        p3.c<?> cVar2 = o0VarE.f135177b;
        int i15 = i14 | (o0VarE.r(pVar) ? 4 : 2);
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            h4.r.a aVar = h4.r.S;
            h4.r rVarD = x2.d(aVar, 1.0f);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            h4.g.a aVar2 = h4.d.a.f81536n;
            c2.z zVarA = c2.y.a(kVar, aVar2, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarD, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar3 = h5.g.a.f81805b;
            if (cVar2 == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
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
            c2.b0 b0Var2 = c2.b0.f22601a;
            if ((pVar != null ? pVar.f76389a : null) != null) {
                o0VarE.C(-463380363);
                a81.c.a aVar4 = a81.c.f1953c;
                Integer num = pVar.f76391c;
                String str2 = pVar.f76394f;
                aVar4.getClass();
                if (num == null || num.intValue() >= a81.c.EARLY_ONBOARDING_FIRST_OUTPUT.f1956a) {
                    o0VarE.C(-462856928);
                    h4.r rVarD2 = x2.d(aVar, 1.0f);
                    c2.z zVarA2 = c2.y.a(kVar, aVar2, o0VarE, 0);
                    int iHashCode2 = Long.hashCode(o0VarE.U);
                    i2 i2VarA1 = o0VarE.a0();
                    h4.r rVarC2 = h4.k.c(rVarD2, o0VarE);
                    if (cVar2 == null) {
                        p0.l();
                        throw null;
                    }
                    o0VarE.z();
                    if (o0VarE.T) {
                        o0VarE.M(aVar3);
                    } else {
                        o0VarE.c();
                    }
                    b4.c(eVar, zVarA2, o0VarE);
                    b4.c(c1623g, i2VarA1, o0VarE);
                    if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                        v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
                    }
                    b4.c(fVar, rVarC2, o0VarE);
                    g6.f.a aVar5 = g6.f.f75994b;
                    h4.r rVarB = b0Var2.b(x2.q(aVar, 200), h4.d.a.f81537o);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    b(c2.l.C(rVarB, 0.0f, j92.b.f97899b.f97921f, 0.0f, 0.0f, 13), pVar.f76395g, o0VarE, 0);
                    Integer num2 = pVar.f76391c;
                    a81.c[] cVarArrValues = a81.c.values();
                    int length = cVarArrValues.length;
                    int i16 = 0;
                    while (true) {
                        if (i16 >= length) {
                            cVar = null;
                            break;
                        }
                        cVar = cVarArrValues[i16];
                        int i17 = cVar.f1956a;
                        if (num2 != null && i17 == num2.intValue()) {
                            break;
                        } else {
                            i16++;
                        }
                    }
                    Integer numValueOf = cVar != null ? Integer.valueOf(cVar.f1957b) : null;
                    if (numValueOf == null) {
                        o0VarE.C(1077625655);
                        z15 = false;
                        o0VarE.g0(false);
                        b0Var = b0Var2;
                        str = str2;
                        o0Var3 = o0VarE;
                    } else {
                        o0VarE.C(1077625656);
                        String strQ = gl1.y.Q(o0VarE, numValueOf.intValue());
                        h4.r.a aVar6 = h4.r.S;
                        boolean zR = o0VarE.r(context) | o0VarE.B(numValueOf);
                        Object objQ = o0VarE.q();
                        if (zR) {
                            objQ = new cn1.d(17, context, (Object) numValueOf);
                            o0VarE.K(objQ);
                        } else {
                            p3.m.f135153a.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                objQ = new cn1.d(17, context, (Object) numValueOf);
                                o0VarE.K(objQ);
                            }
                        }
                        h4.r rVarC3 = p5.v.c((e23.l) objQ, aVar6, false);
                        h4.d.f81522a.getClass();
                        h4.r rVarB2 = b0Var2.b(rVarC3, h4.d.a.f81537o);
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        h4.r rVarY = c2.l.y(rVarB2, j92.b.f97899b.f97920e);
                        d92.b.f58624b.getClass();
                        str = str2;
                        z15 = false;
                        b0Var = b0Var2;
                        mh.c(strQ, rVarY, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97932i, o0VarE), o0VarE, 0, 0, 131068);
                        o0 o0Var6 = o0VarE;
                        Unit unit = Unit.INSTANCE;
                        o0Var6.g0(false);
                        o0Var3 = o0Var6;
                    }
                    if (!p005kotlin.jvm.internal.s.g(pVar.f76393e, Boolean.FALSE) || str == null) {
                        o0Var3.C(1078960919);
                        o0Var3.g0(z15);
                        o0Var4 = o0Var3;
                    } else {
                        o0Var3.C(1078423720);
                        String strP = gl1.y.P(R.string.lbl_endurance_score_sync_ptd_message, new Object[]{str}, o0Var3);
                        h4.r.a aVar7 = h4.r.S;
                        h4.d.f81522a.getClass();
                        h4.r rVarB3 = b0Var.b(aVar7, h4.d.a.f81537o);
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        h4.r rVarY2 = c2.l.y(rVarB3, j92.b.f97899b.f97920e);
                        d92.b.f58624b.getClass();
                        o0 o0Var7 = o0Var3;
                        mh.c(strP, rVarY2, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97933j, o0Var3), o0Var7, 0, 0, 131068);
                        o0 o0Var8 = o0Var7;
                        o0Var8.g0(z15);
                        o0Var4 = o0Var8;
                    }
                    o0Var4.g0(true);
                    o0Var4.g0(z15);
                    z16 = z15;
                    o0Var5 = o0Var4;
                } else {
                    o0VarE.C(-463338079);
                    h4.r rVarF = x2.f(aVar, 1.0f);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    h4.r rVarC4 = c2.l.C(rVarF, 0.0f, j92.b.f97899b.f97921f, 0.0f, 0.0f, 13);
                    s62.a.f157643a.getClass();
                    b82.n.c(n0.a(t62.c.f162799a), gl1.y.Q(o0VarE, R.string.msg_not_enough_data), gl1.y.Q(o0VarE, R.string.lbl_endurance_score_feedback_early_onboarding), rVarC4, null, o0VarE, 0, 16);
                    z16 = false;
                    o0VarE.g0(false);
                    o0Var5 = o0VarE;
                }
                o0Var5.g0(z16);
                z14 = z16;
                o0Var2 = o0Var5;
            } else {
                z14 = false;
                o0VarE.C(-460937904);
                h4.r rVarF2 = x2.f(aVar, 1.0f);
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                h4.r rVarC5 = c2.l.C(rVarF2, 0.0f, j92.b.f97899b.f97921f, 0.0f, 0.0f, 13);
                s62.a.f157643a.getClass();
                b82.n.c(n0.a(t62.c.f162799a), gl1.y.Q(o0VarE, R.string.common_no_data), gl1.y.Q(o0VarE, R.string.msg_endurance_score_sync_device), rVarC5, null, o0VarE, 0, 16);
                o0VarE.g0(false);
                o0Var2 = o0VarE;
            }
            o0Var2.g0(true);
            x1 x1Var2 = p3.n.f135158a;
            r14 = z14;
            o0Var = o0Var2;
        } else {
            r14 = 0;
            o0VarE.e();
            o0Var = o0VarE;
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new i(pVar, i14, r14);
        }
    }

    public static final void b(h4.r rVar, g81.s sVar, p3.m mVar, int i14) {
        rVar.getClass();
        sVar.getClass();
        o0 o0VarE = mVar.E(31445203);
        int i15 = (o0VarE.B(rVar) ? 4 : 2) | i14 | (o0VarE.B(sVar) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            o0VarE.C(154073131);
            i53.c<o13.p<Float, Integer>> cVar = sVar.f76400d;
            ArrayList arrayList = new ArrayList(p13.y.r(cVar, 10));
            for (o13.p<Float, Integer> pVar : cVar) {
                arrayList.add(new z72.l(pVar.f128594a.floatValue(), n5.a.a(o0VarE, pVar.f128595b.intValue()), null));
            }
            o0VarE.g0(false);
            i53.c cVarE = i53.a.e(arrayList);
            long jA = n5.a.a(o0VarE, sVar.f76401e);
            float f14 = sVar.f76397a;
            g6.f.a aVar = g6.f.f75994b;
            z72.k.a(rVar, cVarE, Float.valueOf(f14), o4.d0.a(jA), null, 8, 2.0f, false, false, z3.f.c(1698430343, new a71.n(sVar, 19), o0VarE), o0VarE, (i15 & 14) | 807075840, 400);
            x1 x1Var2 = p3.n.f135158a;
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new h(rVar, sVar, i14, 0);
        }
    }
}
