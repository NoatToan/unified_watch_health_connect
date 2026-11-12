package r21;

import c2.a0;
import c2.b0;
import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import c2.y;
import c2.z;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import h5.e0;
import i3.e9;
import i3.h7;
import i3.mc;
import i3.mh;
import java.util.List;
import kotlin.t1;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final class l {
    public static final void a(final String str, final List list, final Object obj, mc mcVar, final e23.q qVar, final e23.l lVar, final e23.a aVar, p3.m mVar, int i14) {
        o0 o0Var;
        str.getClass();
        list.getClass();
        mcVar.getClass();
        aVar.getClass();
        o0 o0VarE = mVar.E(373622282);
        final int i15 = i14 | (o0VarE.B(str) ? 4 : 2) | (o0VarE.r(list) ? 32 : 16) | (o0VarE.B(obj) ? 256 : 128) | (o0VarE.B(mcVar) ? 2048 : 1024) | (o0VarE.r(qVar) ? 16384 : 8192) | (o0VarE.r(lVar) ? 131072 : 65536) | (o0VarE.r(aVar) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288);
        if (o0VarE.n(i15 & 1, (599187 & i15) != 599186)) {
            x1 x1Var = p3.n.f135158a;
            final float f75992b = ((g6.c) o0VarE.A(t1.f91490h)).getF75992b();
            long jC = am.j.c(d92.b.f58623a, o0VarE);
            long jB = p6.b.b(o0VarE);
            h4.r rVarD = x2.d(h4.r.S, 1.0f);
            c.f149479a.getClass();
            o0Var = o0VarE;
            e9.a(aVar, rVarD, mcVar, 0.0f, false, null, jC, 0L, 0.0f, jB, c.f149480b, new qx1.p(21), null, z3.f.c(-1914764696, new e23.q() { // from class: r21.g
                /* JADX WARN: Code duplicated, block: B:34:0x01ac  */
                @Override // e23.q
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    p3.m mVar2 = (p3.m) obj3;
                    int iIntValue = ((Integer) obj4).intValue();
                    ((a0) obj2).getClass();
                    if (mVar2.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                        x1 x1Var2 = p3.n.f135158a;
                        h4.r.a aVar2 = h4.r.S;
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        j92.e eVar = j92.b.f97899b;
                        h4.r rVarA = c2.l.A(aVar2, 0.0f, eVar.f97920e, 1);
                        c2.j.f22691a.getClass();
                        c2.j.k kVar = c2.j.f22694d;
                        h4.d.f81522a.getClass();
                        z zVarA = y.a(kVar, h4.d.a.f81536n, mVar2, 0);
                        int iHashCode = Long.hashCode(mVar2.getU());
                        i2 i2VarX = mVar2.x();
                        h4.r rVarC = h4.k.c(rVarA, mVar2);
                        h5.g.V.getClass();
                        e0.a aVar3 = h5.g.a.f81805b;
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
                        h5.g.a.e eVar2 = h5.g.a.f81810g;
                        b4.c(eVar2, zVarA, mVar2);
                        h5.g.a.C1623g c1623g = h5.g.a.f81809f;
                        b4.c(c1623g, i2VarX, mVar2);
                        h5.g.a.b bVar = h5.g.a.f81813j;
                        if (mVar2.getT() || !s.g(mVar2.q(), Integer.valueOf(iHashCode))) {
                            v.h.z(iHashCode, mVar2, iHashCode, bVar);
                        }
                        h5.g.a.f fVar = h5.g.a.f81807d;
                        b4.c(fVar, rVarC, mVar2);
                        b0 b0Var = b0.f22601a;
                        h4.r rVarF = x2.f(c2.l.y(aVar2, eVar.f97920e), 1.0f);
                        s2 s2VarA = q2.a(c2.j.f22698h, h4.d.a.f81534l, mVar2, 54);
                        int iHashCode2 = Long.hashCode(mVar2.getU());
                        i2 i2VarX2 = mVar2.x();
                        h4.r rVarC2 = h4.k.c(rVarF, mVar2);
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
                        b4.c(eVar2, s2VarA, mVar2);
                        b4.c(c1623g, i2VarX2, mVar2);
                        if (mVar2.getT() || !s.g(mVar2.q(), Integer.valueOf(iHashCode2))) {
                            v.h.z(iHashCode2, mVar2, iHashCode2, bVar);
                        }
                        b4.c(fVar, rVarC2, mVar2);
                        u2 u2Var = u2.f22900a;
                        d92.b.f58624b.getClass();
                        mh.c(str, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(d92.c.e(j92.f.f97930g), mVar2), mVar2, 0, 0, 131070);
                        h4.r rVarC3 = c2.l.C(aVar2, eVar.f97918c, 0.0f, 0.0f, 0.0f, 14);
                        float f14 = j92.b.f97901d.f97904c * f75992b;
                        g6.f.a aVar4 = g6.f.f75994b;
                        h4.r rVarQ = x2.q(rVarC3, f14);
                        c.f149479a.getClass();
                        h7.a(aVar, rVarQ, false, null, null, c.f149481c, mVar2, 1572864, 60);
                        mVar2.y();
                        List list2 = list;
                        boolean zR = mVar2.r(list2);
                        Object obj5 = obj;
                        boolean zR2 = zR | mVar2.r(obj5);
                        e23.q qVar2 = qVar;
                        boolean zB = zR2 | mVar2.B(qVar2);
                        e23.l lVar2 = lVar;
                        boolean zB2 = zB | mVar2.B(lVar2);
                        Object objQ = mVar2.q();
                        if (zB2) {
                            b81.b bVar2 = new b81.b(list2, obj5, qVar2, i15, lVar2, 5);
                            mVar2.K(bVar2);
                            objQ = bVar2;
                        } else {
                            p3.m.f135153a.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                b81.b bVar3 = new b81.b(list2, obj5, qVar2, i15, lVar2, 5);
                                mVar2.K(bVar3);
                                objQ = bVar3;
                            }
                        }
                        e2.c.b(null, null, null, null, null, null, false, null, (e23.l) objQ, mVar2, 0, 511);
                        mVar2.y();
                    } else {
                        mVar2.e();
                    }
                    return Unit.INSTANCE;
                }
            }, o0VarE), o0Var, ((i15 >> 18) & 14) | 48 | ((i15 >> 3) & 896), 3078, 4536);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new r11.k(i14, 1, str, list, obj, mcVar, lVar, aVar, qVar);
        }
    }
}
