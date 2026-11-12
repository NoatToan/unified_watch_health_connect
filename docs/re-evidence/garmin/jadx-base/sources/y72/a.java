package y72;

import android.annotation.SuppressLint;
import c2.j;
import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import cw1.v0;
import d92.b;
import d92.c;
import e23.l;
import g6.f;
import h4.d;
import h4.g;
import h4.k;
import h4.r;
import h5.e0;
import i3.mh;
import i3.r1;
import i3.s1;
import i3.tb;
import l72.v2;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import s5.x0;
import v.h;

/* JADX INFO: loaded from: classes9.dex */
public final class a {
    public static final void a(String str, boolean z14, boolean z15, @SuppressLint({"ModifierParameter"}) r rVar, l<? super Boolean, Unit> lVar, m mVar, int i14, int i15) {
        boolean z16;
        int i16;
        r rVar2;
        x0 x0VarF;
        lVar.getClass();
        o0 o0VarE = mVar.E(1853155380);
        int i17 = (o0VarE.h(z14) ? 32 : 16) | i14;
        int i18 = i15 & 4;
        if (i18 != 0) {
            i16 = i17 | 384;
            z16 = z15;
        } else {
            z16 = z15;
            i16 = i17 | (o0VarE.h(z16) ? 256 : 128);
        }
        int i19 = i16 | 3072;
        if ((i14 & 24576) == 0) {
            i19 |= o0VarE.r(lVar) ? 16384 : 8192;
        }
        if (o0VarE.n(i19 & 1, (i19 & 9363) != 9362)) {
            boolean z17 = i18 != 0 ? true : z16;
            r.a aVar = r.S;
            x1 x1Var = n.f135158a;
            d.f81522a.getClass();
            g.b bVar = d.a.f81534l;
            int i24 = i19 >> 3;
            r rVarA = v2.a(aVar, z17, new tb(z14, lVar, 7), o0VarE, (i24 & 112) | 6);
            float f14 = 8;
            f.a aVar2 = f.f75994b;
            r rVarThen = c2.l.C(rVarA, 0.0f, f14, 0.0f, f14, 5).then(aVar);
            j.f22691a.getClass();
            s2 s2VarA = q2.a(j.f22692b, bVar, o0VarE, 48);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = k.c(rVarThen, o0VarE);
            h5.g.V.getClass();
            e0.a aVar3 = h5.g.a.f81805b;
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
            b4.c(h5.g.a.f81810g, s2VarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            u2 u2Var = u2.f22900a;
            r1 r1Var = r1.f89474a;
            b.f58623a.getClass();
            long jA = b.a(o0VarE).f().a();
            r1Var.getClass();
            z16 = z17;
            o0VarE = o0VarE;
            s1.a(z14, null, null, z16, r1.a(jA, 0L, o0VarE, 62), o0VarE, (i24 & 14) | 48 | ((i19 << 3) & 7168), 36);
            c2.l.f(x2.u(aVar, 16), o0VarE);
            if (z16) {
                o0VarE.C(376963317);
                o0VarE.g0(false);
                b.f58624b.getClass();
                x0VarF = j92.f.f97932i;
            } else {
                o0VarE.C(376964160);
                b.f58624b.getClass();
                x0VarF = c.f(j92.f.f97932i, o0VarE);
                o0VarE.g0(false);
            }
            mh.c(str, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarF, o0VarE, 6, 0, 131070);
            o0VarE.g0(true);
            rVar2 = aVar;
        } else {
            o0VarE.e();
            rVar2 = rVar;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new v0(str, z14, z16, rVar2, lVar, i14, i15);
        }
    }
}
