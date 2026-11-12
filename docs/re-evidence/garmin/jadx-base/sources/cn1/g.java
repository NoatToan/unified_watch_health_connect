package cn1;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.b0;
import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import ca0.v0;
import com.garmin.android.apps.connectmobile.R;
import f02.z;
import f5.z0;
import f72.ib;
import gl1.y;
import i3.e5;
import i3.mh;
import km1.e0;
import kotlin.t1;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import u1.w;

/* JADX INFO: loaded from: classes10.dex */
public final class g {
    /* JADX WARN: Code duplicated, block: B:55:0x01bd  */
    public static final void a(qm1.m mVar, p3.m mVar2, int i14) {
        int i15;
        String str;
        String strA;
        String string;
        o0 o0VarE = mVar2.E(-1255342182);
        if ((i14 & 6) == 0) {
            i15 = i14 | (o0VarE.r(mVar) ? 4 : 2);
        } else {
            i15 = i14;
        }
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            b10.c cVar = new b10.c(new l22.a(context));
            b10.a aVar = new b10.a(context);
            e0 e0Var = new e0(context, bo1.a.a().c().e());
            Integer num = mVar.f145630b;
            int iIntValue = num != null ? num.intValue() * 60 : 0;
            String strP = y.P(R.string.lbl_value_recommended, new Object[]{cVar.f14213c.c(iIntValue)}, o0VarE);
            String strP2 = y.P(R.string.lbl_value_recommended, new Object[]{new oi0.h(context).c(iIntValue, false)}, o0VarE);
            Integer num2 = mVar.f145633e;
            if (num2 == null || num2.intValue() == 0) {
                str = null;
            } else {
                int iIntValue2 = num2.intValue();
                l22.b bVar = cVar.f14211a;
                if (iIntValue2 != 1) {
                    string = iIntValue2 != 2 ? bVar.getString(R.string.msg_more_than_two_naps_taken_today) : bVar.a(R.string.msg_x_naps_taken_today, num2);
                } else {
                    string = bVar.getString(R.string.msg_one_nap_taken_today);
                }
                str = string;
            }
            String strA2 = e0Var.a(mVar.f145631c);
            sn1.b.f160414a.getClass();
            String str2 = (!sn1.b.e() || (strA = aVar.a(mVar.f145634f, mVar.f145635g, true)) == null) ? strA2 : strA;
            h4.r.a aVar2 = h4.r.S;
            d92.b.f58623a.getClass();
            j92.b bVar2 = d92.b.f58625c;
            bVar2.getClass();
            j92.e eVar = j92.b.f97899b;
            h4.r rVarA = c2.l.A(aVar2, 0.0f, eVar.f97917b, 1);
            s62.a.f157643a.getClass();
            u4.d dVarA = ib.a(t62.c.f162799a);
            f02.h.f67736a.getClass();
            long jA = f02.h.a(o0VarE);
            z.f67754a.getClass();
            gl.c.f77766a.getClass();
            g02.i.a(rVarA, dVarA, jA, gl.c.a(o0VarE).c(), w13.b.j(o0VarE), 0.0f, null, o0VarE, 0, 224);
            h4.r rVarF = x2.f(aVar2, 1.0f);
            c2.j jVar = c2.j.f22691a;
            bVar2.getClass();
            float f14 = eVar.f97917b;
            jVar.getClass();
            c2.j.i iVarI = c2.j.i(f14);
            h4.d.f81522a.getClass();
            c2.z zVarA = c2.y.a(iVarI, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarF, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar3 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar3 = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar3);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            b0 b0Var = b0.f22601a;
            boolean zB = o0VarE.B(strP2);
            Object objQ = o0VarE.q();
            if (zB) {
                objQ = new c82.b(strP2, 25);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new c82.b(strP2, 25);
                    o0VarE.K(objQ);
                }
            }
            h4.r rVarC2 = p5.v.c((e23.l) objQ, aVar2, false);
            j92.f fVar = d92.b.f58624b;
            fVar.getClass();
            mh.c(strP, rVarC2, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(d92.c.e(j92.f.f97931h), o0VarE), o0VarE, 0, 0, 131068);
            o0VarE = o0VarE;
            if (str == null) {
                o0VarE.C(1522950190);
                o0VarE.g0(false);
            } else {
                o0VarE.C(1522950191);
                fVar.getClass();
                mh.c(str, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97932i, o0VarE), o0VarE, 0, 0, 131070);
                o0VarE.g0(false);
            }
            if (str2 == null) {
                o0VarE = o0VarE;
                o0VarE.C(1523114862);
                o0VarE.g0(false);
            } else {
                o0VarE = o0VarE;
                o0VarE.C(1523114863);
                fVar.getClass();
                o0 o0Var = o0VarE;
                mh.c(str2, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97932i, o0VarE), o0Var, 0, 0, 131070);
                o0VarE = o0Var;
                o0VarE.g0(false);
            }
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a03.k(mVar, i14, 10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00bc  */
    public static final void b(h4.r rVar, qm1.m mVar, e23.a aVar, p3.m mVar2, int i14) {
        int i15;
        o0 o0Var;
        qm1.m mVar3;
        Integer num;
        boolean z14;
        boolean z15;
        o0 o0VarE = mVar2.E(-126031267);
        p3.c<?> cVar = o0VarE.f135177b;
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(rVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(mVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(aVar) ? 256 : 128;
        }
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            if (!p005kotlin.jvm.internal.s.g(mVar.f145632d, Boolean.TRUE) || mVar.f145631c == null || (num = mVar.f145630b) == null || num.intValue() <= 0) {
                o0Var = o0VarE;
                mVar3 = mVar;
                o0Var.C(-794029851);
                o0Var.g0(false);
            } else {
                o0VarE.C(-795849985);
                float f75992b = ((g6.c) o0VarE.A(t1.f91490h)).getF75992b();
                long jA = am.j.A(d92.b.f58623a, o0VarE);
                j92.b bVar = d92.b.f58625c;
                bVar.getClass();
                j92.e eVar = j92.b.f97899b;
                float f14 = eVar.f97918c;
                float f15 = eVar.f97918c;
                float f16 = eVar.f97920e;
                h4.r rVarE = u1.n.e(rVar, jA, k2.i.a(f14));
                boolean z16 = aVar != null;
                boolean z17 = (i15 & 896) == 256;
                Object objQ = o0VarE.q();
                if (z17) {
                    objQ = new v0(aVar, 14);
                    o0VarE.K(objQ);
                } else {
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new v0(aVar, 14);
                        o0VarE.K(objQ);
                    }
                }
                h4.r rVarD = w.d(rVarE, z16, null, null, (e23.a) objQ, 14);
                h4.d.f81522a.getClass();
                z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
                int iHashCode = Long.hashCode(o0VarE.U);
                i2 i2VarA0 = o0VarE.a0();
                h4.r rVarC = h4.k.c(rVarD, o0VarE);
                h5.g.V.getClass();
                int i16 = i15;
                h5.e0.a aVar2 = h5.g.a.f81805b;
                if (cVar == null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar2);
                } else {
                    o0VarE.c();
                }
                h5.g.a.e eVar2 = h5.g.a.f81810g;
                b4.c(eVar2, z0VarD, o0VarE);
                h5.g.a.C1623g c1623g = h5.g.a.f81809f;
                b4.c(c1623g, i2VarA0, o0VarE);
                h5.g.a.b bVar2 = h5.g.a.f81813j;
                if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
                }
                h5.g.a.f fVar = h5.g.a.f81807d;
                b4.c(fVar, rVarC, o0VarE);
                c2.u uVar = c2.u.f22885a;
                h4.r.a aVar3 = h4.r.S;
                h4.r rVarF = x2.f(aVar3, 1.0f);
                bVar.getClass();
                bVar.getClass();
                bVar.getClass();
                bVar.getClass();
                h4.r rVarB = c2.l.B(rVarF, f16, f16, f16, f16);
                c2.j.f22691a.getClass();
                c2.j.k kVar = c2.j.f22694d;
                h4.g.a aVar4 = h4.d.a.f81536n;
                c2.z zVarA = c2.y.a(kVar, aVar4, o0VarE, 0);
                int iHashCode2 = Long.hashCode(o0VarE.U);
                i2 i2VarA1 = o0VarE.a0();
                h4.r rVarC2 = h4.k.c(rVarB, o0VarE);
                if (cVar == null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar2);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar2, zVarA, o0VarE);
                b4.c(c1623g, i2VarA1, o0VarE);
                if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                    v.h.A(iHashCode2, o0VarE, iHashCode2, bVar2);
                }
                b4.c(fVar, rVarC2, o0VarE);
                b0 b0Var = b0.f22601a;
                String strQ = y.Q(o0VarE, R.string.lbl_sleep_coach);
                d92.b.f58624b.getClass();
                mh.c(strQ, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97931h, o0VarE), o0VarE, 0, 0, 131070);
                o0Var = o0VarE;
                if (f75992b <= 1.5f) {
                    h4.r rVarC3 = c2.l.C(ds.e0.g(o0Var, -1304710130, aVar3, 1.0f, bVar), 0.0f, eVar.f97918c, 0.0f, 0.0f, 13);
                    bVar.getClass();
                    z14 = false;
                    s2 s2VarA = q2.a(c2.j.i(f15), h4.d.a.f81533k, o0Var, 0);
                    int iHashCode3 = Long.hashCode(o0Var.U);
                    i2 i2VarA2 = o0Var.a0();
                    h4.r rVarC4 = h4.k.c(rVarC3, o0Var);
                    if (cVar == null) {
                        p0.l();
                        throw null;
                    }
                    o0Var.z();
                    if (o0Var.T) {
                        o0Var.M(aVar2);
                    } else {
                        o0Var.c();
                    }
                    b4.c(eVar2, s2VarA, o0Var);
                    b4.c(c1623g, i2VarA2, o0Var);
                    if (o0Var.T || !p005kotlin.jvm.internal.s.g(o0Var.q(), Integer.valueOf(iHashCode3))) {
                        v.h.A(iHashCode3, o0Var, iHashCode3, bVar2);
                    }
                    b4.c(fVar, rVarC4, o0Var);
                    u2 u2Var = u2.f22900a;
                    mVar3 = mVar;
                    a(mVar3, o0Var, (i16 >> 3) & 14);
                    z15 = true;
                    o0Var.g0(true);
                    o0Var.g0(false);
                } else {
                    mVar3 = mVar;
                    z14 = false;
                    z15 = true;
                    h4.r rVarC5 = c2.l.C(ds.e0.g(o0Var, -1304291475, aVar3, 1.0f, bVar), 0.0f, eVar.f97918c, 0.0f, 0.0f, 13);
                    bVar.getClass();
                    c2.z zVarA2 = c2.y.a(c2.j.i(f15), aVar4, o0Var, 0);
                    int iHashCode4 = Long.hashCode(o0Var.U);
                    i2 i2VarA3 = o0Var.a0();
                    h4.r rVarC6 = h4.k.c(rVarC5, o0Var);
                    if (cVar == null) {
                        p0.l();
                        throw null;
                    }
                    o0Var.z();
                    if (o0Var.T) {
                        o0Var.M(aVar2);
                    } else {
                        o0Var.c();
                    }
                    b4.c(eVar2, zVarA2, o0Var);
                    b4.c(c1623g, i2VarA3, o0Var);
                    if (o0Var.T || !p005kotlin.jvm.internal.s.g(o0Var.q(), Integer.valueOf(iHashCode4))) {
                        v.h.A(iHashCode4, o0Var, iHashCode4, bVar2);
                    }
                    b4.c(fVar, rVarC6, o0Var);
                    a(mVar3, o0Var, (i16 >> 3) & 14);
                    o0Var.g0(true);
                    o0Var.g0(false);
                }
                e5.u(o0Var, z15, z15, z14);
            }
        } else {
            o0Var = o0VarE;
            mVar3 = mVar;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a42.f(rVar, (Object) mVar3, (Object) aVar, i14, 26);
        }
    }
}
