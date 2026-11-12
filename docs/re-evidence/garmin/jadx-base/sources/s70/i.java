package s70;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import i3.e9;
import i3.h7;
import i3.i7;
import i3.mc;
import i3.mh;
import java.util.ArrayList;
import java.util.List;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.p2;

/* JADX INFO: loaded from: classes8.dex */
public final class i {
    public static final void a(int i14, final e23.a aVar, final e23.l lVar, mc mcVar, final i53.c cVar, p3.m mVar) {
        p3.o0 o0Var;
        mcVar.getClass();
        aVar.getClass();
        p3.o0 o0VarE = mVar.E(64279187);
        int i15 = i14 | (o0VarE.B(cVar) ? 4 : 2) | (o0VarE.B(mcVar) ? 32 : 16) | (o0VarE.r(aVar) ? 256 : 128) | (o0VarE.r(lVar) ? 2048 : 1024);
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            p3.x1 x1Var = p3.n.f135158a;
            final Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            final float f69051c = ((g6.c) o0VarE.A(kotlin.t1.f91490h)).getF69051c();
            final e2.i0 i0VarA = e2.k0.a(0, 0, 3, o0VarE);
            long jC = am.j.c(d92.b.f58623a, o0VarE);
            long jB = p6.b.b(o0VarE);
            h4.r rVarD = x2.d(h4.r.S, 1.0f);
            w.f157813a.getClass();
            o0Var = o0VarE;
            e9.a(aVar, rVarD, mcVar, 0.0f, false, null, jC, 0L, 0.0f, jB, w.f157814b, new s5.d0(28), null, z3.f.c(-284702991, new e23.q() { // from class: s70.c
                /* JADX WARN: Code duplicated, block: B:46:0x01f4  */
                @Override // e23.q
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    p3.m mVar2;
                    p3.m mVar3 = (p3.m) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((c2.a0) obj).getClass();
                    if (mVar3.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                        p3.x1 x1Var2 = p3.n.f135158a;
                        h4.r.a aVar2 = h4.r.S;
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        j92.e eVar = j92.b.f97899b;
                        h4.r rVarA = c2.l.A(aVar2, 0.0f, eVar.f97920e, 1);
                        c2.j.f22691a.getClass();
                        c2.j.k kVar = c2.j.f22694d;
                        h4.d.f81522a.getClass();
                        c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, mVar3, 0);
                        int iHashCode = Long.hashCode(mVar3.getU());
                        i2 i2VarX = mVar3.x();
                        h4.r rVarC = h4.k.c(rVarA, mVar3);
                        h5.g.V.getClass();
                        h5.e0.a aVar3 = h5.g.a.f81805b;
                        List listN0 = null;
                        if (mVar3.F() == null) {
                            p3.p0.l();
                            throw null;
                        }
                        mVar3.z();
                        if (mVar3.getT()) {
                            mVar3.M(aVar3);
                        } else {
                            mVar3.c();
                        }
                        h5.g.a.e eVar2 = h5.g.a.f81810g;
                        b4.c(eVar2, zVarA, mVar3);
                        h5.g.a.C1623g c1623g = h5.g.a.f81809f;
                        b4.c(c1623g, i2VarX, mVar3);
                        h5.g.a.b bVar = h5.g.a.f81813j;
                        if (mVar3.getT() || !p005kotlin.jvm.internal.s.g(mVar3.q(), Integer.valueOf(iHashCode))) {
                            v.h.z(iHashCode, mVar3, iHashCode, bVar);
                        }
                        h5.g.a.f fVar = h5.g.a.f81807d;
                        b4.c(fVar, rVarC, mVar3);
                        c2.b0 b0Var = c2.b0.f22601a;
                        h4.r rVarF = x2.f(c2.l.y(aVar2, eVar.f97920e), 1.0f);
                        s2 s2VarA = q2.a(c2.j.f22698h, h4.d.a.f81534l, mVar3, 54);
                        int iHashCode2 = Long.hashCode(mVar3.getU());
                        i2 i2VarX2 = mVar3.x();
                        h4.r rVarC2 = h4.k.c(rVarF, mVar3);
                        if (mVar3.F() == null) {
                            p3.p0.l();
                            throw null;
                        }
                        mVar3.z();
                        if (mVar3.getT()) {
                            mVar3.M(aVar3);
                        } else {
                            mVar3.c();
                        }
                        b4.c(eVar2, s2VarA, mVar3);
                        b4.c(c1623g, i2VarX2, mVar3);
                        if (mVar3.getT() || !p005kotlin.jvm.internal.s.g(mVar3.q(), Integer.valueOf(iHashCode2))) {
                            v.h.z(iHashCode2, mVar3, iHashCode2, bVar);
                        }
                        b4.c(fVar, rVarC2, mVar3);
                        u2 u2Var = u2.f22900a;
                        String strQ = gl1.y.Q(mVar3, R.string.title_add_a_secondary_stats_card);
                        d92.b.f58624b.getClass();
                        mh.c(strQ, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(d92.c.e(j92.f.f97930g), mVar3), mVar3, 0, 0, 131070);
                        h4.r rVarC3 = c2.l.C(aVar2, eVar.f97918c, 0.0f, 0.0f, 0.0f, 14);
                        float f14 = j92.b.f97901d.f97904c;
                        float f15 = f69051c;
                        g6.f.a aVar4 = g6.f.f75994b;
                        h4.r rVarQ = x2.q(rVarC3, f14 * f15);
                        w.f157813a.getClass();
                        h7.a(aVar, rVarQ, false, null, null, w.f157815c, mVar3, 1572864, 60);
                        mVar3.y();
                        i53.c<j70.b> cVar2 = cVar;
                        if (cVar2 != null) {
                            ArrayList arrayList = new ArrayList();
                            for (j70.b bVar2 : cVar2) {
                                o70.t.a aVar5 = o70.t.f130062f;
                                String cardType = bVar2.getCardType();
                                aVar5.getClass();
                                o70.t tVarA = o70.t.a.a(cardType);
                                if (tVarA != null) {
                                    arrayList.add(tVarA);
                                }
                            }
                            listN0 = p13.h0.N0(arrayList, new d(context));
                        }
                        List list = listN0;
                        if (list == null) {
                            mVar3.C(-933032400);
                            mVar3.f();
                            mVar2 = mVar3;
                        } else {
                            mVar3.C(-933032399);
                            boolean zR = mVar3.r(list) | mVar3.i(f15);
                            e23.l lVar2 = lVar;
                            boolean zB = zR | mVar3.B(lVar2);
                            Object objQ = mVar3.q();
                            if (zB) {
                                objQ = new cq.p(list, f15, lVar2, 7);
                                mVar3.K(objQ);
                            } else {
                                p3.m.f135153a.getClass();
                                if (objQ == p3.m.a.f135155b) {
                                    objQ = new cq.p(list, f15, lVar2, 7);
                                    mVar3.K(objQ);
                                }
                            }
                            mVar2 = mVar3;
                            e2.c.b(null, i0VarA, null, null, null, null, false, null, (e23.l) objQ, mVar2, 0, 509);
                            mVar2.f();
                        }
                        mVar2.y();
                        p3.x1 x1Var3 = p3.n.f135158a;
                    } else {
                        mVar3.e();
                    }
                    return Unit.INSTANCE;
                }
            }, o0VarE), o0Var, ((i15 >> 6) & 14) | 48 | ((i15 << 3) & 896), 3078, 4536);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ib0.a(cVar, mcVar, aVar, lVar, i14);
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x008f  */
    public static final void b(o70.t tVar, float f14, e23.l<? super j70.b, Unit> lVar, p3.m mVar, int i14) {
        long jB;
        tVar.getClass();
        lVar.getClass();
        p3.o0 o0VarE = mVar.E(1126821121);
        int i15 = (o0VarE.k(tVar.ordinal()) ? 4 : 2) | i14 | (o0VarE.i(f14) ? 32 : 16) | (o0VarE.r(lVar) ? 256 : 128);
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            p3.x1 x1Var = p3.n.f135158a;
            h4.r.a aVar = h4.r.S;
            h4.r rVarX = x2.x(aVar, null, 3);
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            float f15 = eVar.f97920e;
            float f16 = eVar.f97920e;
            h4.r rVarA = c2.l.A(rVarX, f15, 0.0f, 2);
            boolean z14 = ((i15 & 14) == 4) | ((i15 & 896) == 256);
            Object objQ = o0VarE.q();
            if (z14) {
                objQ = new rk0.f(20, lVar, tVar);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new rk0.f(20, lVar, tVar);
                    o0VarE.K(objQ);
                }
            }
            h4.r rVarD = u1.w.d(rVarA, true, null, null, (e23.a) objQ, 14);
            c2.j.f22691a.getClass();
            c2.j.C0343j c0343j = c2.j.f22692b;
            h4.d.f81522a.getClass();
            s2 s2VarA = q2.a(c0343j, h4.d.a.f81534l, o0VarE, 54);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarD, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar2 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, s2VarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            u2 u2Var = u2.f22900a;
            bVar.getClass();
            h4.r rVarA2 = c2.l.A(aVar, 0.0f, f16, 1);
            bVar.getClass();
            float f17 = j92.b.f97901d.f97904c * f14;
            g6.f.a aVar3 = g6.f.f75994b;
            h4.r rVarQ = x2.q(rVarA2, f17);
            u4.d dVarB = o70.t.b(tVar);
            o4.d0 d0VarE = tVar.e(null, o0VarE, 1);
            if (d0VarE == null) {
                o0VarE.C(-1988317244);
                jB = d92.b.a(o0VarE).f().b();
                o0VarE.g0(false);
            } else {
                o0VarE.C(-1988318453);
                o0VarE.g0(false);
                jB = d0VarE.f128833a;
            }
            i7.b(dVarB, null, rVarQ, jB, o0VarE, 48, 0);
            bVar.getClass();
            float f18 = eVar.f97918c;
            bVar.getClass();
            h4.r rVarF = x2.f(c2.l.z(aVar, f18, f16), 1.0f);
            String strD = tVar.d(w2.a0.s(o0VarE), null);
            d92.b.f58624b.getClass();
            mh.c(strD, rVarF, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97931h, o0VarE), o0VarE, 0, 0, 131068);
            o0VarE = o0VarE;
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new fx0.g(tVar, f14, lVar, i14);
        }
    }
}
