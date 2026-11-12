package lf1;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.b0;
import c2.j;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import e23.l;
import e23.p;
import gl1.y;
import h4.g;
import h4.k;
import h4.r;
import h5.e0;
import i3.mh;
import java.util.Arrays;
import l72.n2;
import o4.d0;
import o70.t;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.x0;
import p005kotlin.math.MathKt;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import p5.v;
import u4.d;
import v.h;
import w2.a0;
import yz1.u;
import yz1.z;
import z3.e;
import z3.f;

/* JADX INFO: loaded from: classes9.dex */
public final class c {
    /* JADX WARN: Code duplicated, block: B:56:0x011e  */
    public static final void a(r rVar, hf1.c cVar, m mVar, int i14) {
        int i15;
        o0 o0Var;
        z zVar;
        Integer num;
        Integer num2;
        o0 o0VarE = mVar.E(1406139451);
        if ((i14 & 6) == 0) {
            i15 = i14 | (o0VarE.B(rVar) ? 4 : 2);
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.B(cVar) ? 32 : 16;
        }
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            final int iIntValue = (cVar == null || (num2 = cVar.f83637c) == null) ? 0 : num2.intValue();
            final int iIntValue2 = (cVar == null || (num = cVar.f83639e) == null) ? 0 : num.intValue();
            final float f14 = iIntValue / iIntValue2;
            final of1.a aVar = new of1.a(context);
            t tVar = t.f130078w;
            String strD = tVar.d(a0.s(o0VarE), null);
            d dVarB = t.b(tVar);
            final String strQ = y.Q(o0VarE, R.string.running_tolerance_no_data_home);
            if (iIntValue > 0 || iIntValue2 > 0) {
                o0VarE.C(1485134100);
                x0 x0Var = x0.f105818a;
                strQ = String.format(y.Q(o0VarE, R.string.running_tolerance_secondary_stat_card_accessibility), Arrays.copyOf(new Object[]{of1.a.f(iIntValue), Integer.valueOf(MathKt.c(100 * f14)), of1.a.d(o0VarE, iIntValue2)}, 3));
                o0VarE.g0(false);
            } else {
                o0VarE.C(1485466761);
                o0VarE.g0(false);
            }
            yz1.d dVar = new yz1.d(u.SUCCESS, null, false, 6, null);
            long jD = hb.a.d(d92.b.f58623a, o0VarE);
            if (cVar == null) {
                zVar = z.EMPTY;
            } else {
                zVar = (cVar.f83637c == null && cVar.f83638d == null && cVar.f83639e == null) ? z.EMPTY : z.VALID_DATA;
            }
            z zVar2 = zVar;
            String strQ2 = y.Q(o0VarE, R.string.running_tolerance_no_data_home);
            d0 d0VarA = d0.a(jD);
            e eVarC = f.c(-497552546, new p() { // from class: lf1.b
                /* JADX WARN: Code duplicated, block: B:12:0x003e  */
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    m mVar2 = (m) obj;
                    int iIntValue3 = ((Integer) obj2).intValue();
                    if (mVar2.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                        x1 x1Var2 = n.f135158a;
                        r.a aVar2 = r.S;
                        r rVarD = x2.d(aVar2, 1.0f);
                        String str = strQ;
                        boolean zB = mVar2.B(str);
                        Object objQ = mVar2.q();
                        if (zB) {
                            objQ = new n2(str, 8);
                            mVar2.K(objQ);
                        } else {
                            m.f135153a.getClass();
                            if (objQ == m.a.f135155b) {
                                objQ = new n2(str, 8);
                                mVar2.K(objQ);
                            }
                        }
                        r rVarC = v.c((l) objQ, rVarD, false);
                        j.f22691a.getClass();
                        j.g gVar = j.f22698h;
                        h4.d.f81522a.getClass();
                        g.a aVar3 = h4.d.a.f81536n;
                        c2.z zVarA = c2.y.a(gVar, aVar3, mVar2, 6);
                        int iHashCode = Long.hashCode(mVar2.getU());
                        i2 i2VarX = mVar2.x();
                        r rVarC2 = k.c(rVarC, mVar2);
                        h5.g.V.getClass();
                        e0.a aVar4 = h5.g.a.f81805b;
                        if (mVar2.F() == null) {
                            p0.l();
                            throw null;
                        }
                        mVar2.z();
                        if (mVar2.getT()) {
                            mVar2.M(aVar4);
                        } else {
                            mVar2.c();
                        }
                        h5.g.a.e eVar = h5.g.a.f81810g;
                        b4.c(eVar, zVarA, mVar2);
                        h5.g.a.C1623g c1623g = h5.g.a.f81809f;
                        b4.c(c1623g, i2VarX, mVar2);
                        h5.g.a.b bVar = h5.g.a.f81813j;
                        if (mVar2.getT() || !s.g(mVar2.q(), Integer.valueOf(iHashCode))) {
                            h.z(iHashCode, mVar2, iHashCode, bVar);
                        }
                        h5.g.a.f fVar = h5.g.a.f81807d;
                        b4.c(fVar, rVarC2, mVar2);
                        b0 b0Var = b0.f22601a;
                        g6.f.a aVar5 = g6.f.f75994b;
                        r rVarQ = x2.q(aVar2, 95);
                        g.a aVar6 = h4.d.a.f81537o;
                        r rVarB = b0Var.b(rVarQ, aVar6);
                        float f15 = 6;
                        float f16 = f14;
                        z72.l lVar = new z72.l(f16, of1.a.g(f16, mVar2), null);
                        float f17 = f16 >= 1.0f ? 0.0f : 1.0f - f16;
                        gl.c.f77766a.getClass();
                        z72.k.c(rVarB, i53.a.a(lVar, new z72.l(f17, gl.c.a(mVar2).g(), null)), null, null, f15, 0.0f, f.c(1122352518, new as.e(aVar, iIntValue), mVar2), mVar2, 12779520, 92);
                        String strQ3 = y.Q(mVar2, R.string.acute_impact_load);
                        d92.b.f58623a.getClass();
                        d92.b.f58624b.getClass();
                        s5.x0 x0Var2 = j92.f.f97931h;
                        mh.c(strQ3, b0Var.b(aVar2, aVar6), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(x0Var2, mVar2), mVar2, 0, 0, 131068);
                        c2.z zVarA2 = c2.y.a(j.f22694d, aVar3, mVar2, 0);
                        int iHashCode2 = Long.hashCode(mVar2.getU());
                        i2 i2VarX2 = mVar2.x();
                        r rVarC3 = k.c(aVar2, mVar2);
                        if (mVar2.F() == null) {
                            p0.l();
                            throw null;
                        }
                        mVar2.z();
                        if (mVar2.getT()) {
                            mVar2.M(aVar4);
                        } else {
                            mVar2.c();
                        }
                        b4.c(eVar, zVarA2, mVar2);
                        b4.c(c1623g, i2VarX2, mVar2);
                        if (mVar2.getT() || !s.g(mVar2.q(), Integer.valueOf(iHashCode2))) {
                            h.z(iHashCode2, mVar2, iHashCode2, bVar);
                        }
                        b4.c(fVar, rVarC3, mVar2);
                        String strD2 = of1.a.d(mVar2, iIntValue2);
                        mVar2.C(182240371);
                        mh.c(strD2, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(x0Var2, mVar2), mVar2, 0, 0, 131070);
                        mVar2.f();
                        mh.c(y.Q(mVar2, R.string.weekly_tolerance), null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97937n, mVar2), mVar2, 0, 0, 131070);
                        mVar2.y();
                        mVar2.y();
                    } else {
                        mVar2.e();
                    }
                    return Unit.INSTANCE;
                }
            }, o0VarE);
            boolean zR = o0VarE.r(context);
            Object objQ = o0VarE.q();
            if (zR) {
                objQ = new l71.g(context, 2);
                o0VarE.K(objQ);
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new l71.g(context, 2);
                    o0VarE.K(objQ);
                }
            }
            o0Var = o0VarE;
            yz1.y.c(rVar, dVar, strD, null, dVarB, d0VarA, 0.0f, 0, null, 0.0f, null, null, null, null, eVarC, (e23.a) objQ, zVar2, strQ2, null, null, o0Var, i15 & 14, 24576, 802760);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ik1.a(rVar, cVar, i14, 23);
        }
    }
}
