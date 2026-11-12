package h50;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.b0;
import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import dv0.t;
import h4.r;
import h5.e0;
import i3.i7;
import i3.mh;
import kotlin.t1;
import o4.m1;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import p5.v;
import s5.x0;
import u1.w;

/* JADX INFO: loaded from: classes8.dex */
public final class e {
    public static final void a(int i14, String str, String str2, p3.m mVar, boolean z14) {
        float f14;
        o0 o0VarE = mVar.E(-1431885999);
        p3.c<?> cVar = o0VarE.f135177b;
        int i15 = (o0VarE.h(z14) ? 4 : 2) | i14 | (o0VarE.B(str) ? 32 : 16) | (o0VarE.B(str2) ? 256 : 128);
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = n.f135158a;
            boolean z15 = ((g6.c) o0VarE.A(t1.f91490h)).getF75992b() > 1.0f;
            d92.b.f58623a.getClass();
            if (z15) {
                d92.b.f58625c.getClass();
                f14 = j92.b.f97899b.f97917b;
            } else {
                d92.b.f58625c.getClass();
                f14 = j92.b.f97899b.f97920e;
            }
            z3.e eVarC = z3.f.c(1493797158, new c(f14, str2, z14, str), o0VarE);
            if (z15) {
                o0VarE.C(300324144);
                r.a aVar = r.S;
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                r rVarC = c2.l.C(aVar, 0.0f, j92.b.f97899b.f97917b, 0.0f, 0.0f, 13);
                c2.j.f22691a.getClass();
                c2.j.k kVar = c2.j.f22694d;
                h4.d.f81522a.getClass();
                z zVarA = y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
                int iHashCode = Long.hashCode(o0VarE.U);
                i2 i2VarA0 = o0VarE.a0();
                r rVarC2 = h4.k.c(rVarC, o0VarE);
                h5.g.V.getClass();
                e0.a aVar2 = h5.g.a.f81805b;
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
                b4.c(h5.g.a.f81810g, zVarA, o0VarE);
                b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
                h5.g.a.b bVar = h5.g.a.f81813j;
                if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                }
                b4.c(h5.g.a.f81807d, rVarC2, o0VarE);
                b0 b0Var = b0.f22601a;
                eVarC.invoke(o0VarE, 6);
                o0VarE.g0(true);
                o0VarE.g0(false);
            } else {
                o0VarE.C(300428800);
                r.a aVar3 = r.S;
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                r rVarC3 = c2.l.C(aVar3, 0.0f, j92.b.f97899b.f97917b, 0.0f, 0.0f, 13);
                h4.d.f81522a.getClass();
                h4.g.b bVar2 = h4.d.a.f81534l;
                c2.j.f22691a.getClass();
                s2 s2VarA = q2.a(c2.j.f22692b, bVar2, o0VarE, 48);
                int iHashCode2 = Long.hashCode(o0VarE.U);
                i2 i2VarA1 = o0VarE.a0();
                r rVarC4 = h4.k.c(rVarC3, o0VarE);
                h5.g.V.getClass();
                e0.a aVar4 = h5.g.a.f81805b;
                if (cVar == null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar4);
                } else {
                    o0VarE.c();
                }
                b4.c(h5.g.a.f81810g, s2VarA, o0VarE);
                b4.c(h5.g.a.f81809f, i2VarA1, o0VarE);
                h5.g.a.b bVar3 = h5.g.a.f81813j;
                if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                    v.h.A(iHashCode2, o0VarE, iHashCode2, bVar3);
                }
                b4.c(h5.g.a.f81807d, rVarC4, o0VarE);
                u2 u2Var = u2.f22900a;
                eVarC.invoke(o0VarE, 6);
                o0VarE.g0(true);
                o0VarE.g0(false);
            }
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new d(i14, str, str2, z14);
        }
    }

    public static final void b(i50.f fVar, boolean z14, gg1.o0 o0Var, r rVar, p3.m mVar, int i14) {
        o0 o0Var2;
        int i15;
        int i16;
        Object bVar;
        String str;
        o0 o0VarE = mVar.E(-2120172120);
        int i17 = i14 | (o0VarE.B(fVar) ? 4 : 2) | (o0VarE.h(z14) ? 32 : 16) | (o0VarE.k(o0Var.ordinal()) ? 256 : 128) | (o0VarE.B(rVar) ? 2048 : 1024);
        if (o0VarE.n(i17 & 1, (i17 & 1171) != 1170)) {
            x1 x1Var = n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            String str2 = fVar.f91739b;
            boolean z15 = fVar.f91745h;
            boolean z16 = fVar.f91744g;
            String strA = s20.d.a(context, str2);
            String strC = s20.d.c(fVar.f91741d, context, z14);
            String strJ = "";
            if (strC == null) {
                strC = "";
            }
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = new h02.a(10);
                o0VarE.K(objQ);
            }
            String strB = oi0.c.B(strC, (e23.l) objQ, o0VarE);
            String str3 = strC;
            String strE = s20.d.e(context, fVar.f91742e, o0Var, true, false);
            if (strE == null) {
                strE = "";
            }
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = new h02.a(11);
                o0VarE.K(objQ2);
            }
            String strB2 = oi0.c.B(strE, (e23.l) objQ2, o0VarE);
            if (z16) {
                i15 = -1670881973;
                i16 = R.string.lbl_public;
            } else {
                i15 = -1670880660;
                i16 = R.string.lbl_private;
            }
            String strP = gl1.y.P(R.string.lbl_privacy_value, new Object[]{com.airbnb.lottie.animation.keyframe.a.j(o0VarE, i15, i16, o0VarE, false)}, o0VarE);
            if (z15) {
                strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -1670877352, R.string.power_guide_course_list, o0VarE, false);
            } else {
                o0VarE.C(-257538218);
                o0VarE.g0(false);
            }
            boolean zB = o0VarE.B(strA) | o0VarE.B(strB) | o0VarE.B(strB2) | o0VarE.B(strJ) | o0VarE.B(strP);
            Object objQ3 = o0VarE.q();
            if (zB || objQ3 == c2565a) {
                str = strA;
                bVar = new b(str, 0, strB, strB2, strJ, strP);
                o0VarE.K(bVar);
            } else {
                bVar = objQ3;
                str = strA;
            }
            r rVarC = v.c((e23.l) bVar, rVar, false);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC2 = h4.k.c(rVarC, o0VarE);
            h5.g.V.getClass();
            e0.a aVar = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(h5.g.a.f81807d, rVarC2, o0VarE);
            b0 b0Var = b0.f22601a;
            d92.b.f58623a.getClass();
            j92.f fVar2 = d92.b.f58624b;
            fVar2.getClass();
            mh.c(str, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0.a(j92.f.f97931h, hb.a.e(o0VarE), 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214), o0VarE, 0, 0, 131070);
            o0Var2 = o0VarE;
            a(0, str3, strE, o0Var2, z16);
            if (z15) {
                o0Var2.C(866450273);
                String strQ = gl1.y.Q(o0Var2, R.string.power_guide_course_list);
                fVar2.getClass();
                mh.c(strQ, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97933j, o0Var2), o0Var2, 0, 0, 131070);
                o0Var2 = o0Var2;
                o0Var2.g0(false);
            } else {
                o0Var2.C(866618448);
                o0Var2.g0(false);
            }
            o0Var2.g0(true);
        } else {
            o0Var2 = o0VarE;
            o0Var2.e();
        }
        p2 p2VarI0 = o0Var2.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ad0.g(fVar, z14, o0Var, rVar, i14, 14);
        }
    }

    public static final void c(i50.f fVar, boolean z14, gg1.o0 o0Var, e23.a<Unit> aVar, e23.a<Unit> aVar2, e23.a<Unit> aVar3, p3.m mVar, int i14) {
        e23.a<Unit> aVar4;
        fVar.getClass();
        aVar.getClass();
        aVar2.getClass();
        aVar3.getClass();
        o0 o0VarE = mVar.E(-282042845);
        p3.c<?> cVar = o0VarE.f135177b;
        int i15 = i14 | (o0VarE.B(fVar) ? 4 : 2) | (o0VarE.h(z14) ? 32 : 16) | (o0VarE.k(o0Var.ordinal()) ? 256 : 128) | (o0VarE.r(aVar) ? 2048 : 1024) | (o0VarE.r(aVar2) ? 16384 : 8192) | (o0VarE.r(aVar3) ? 131072 : 65536);
        if (o0VarE.n(i15 & 1, (74899 & i15) != 74898)) {
            x1 x1Var = n.f135158a;
            r.a aVar5 = r.S;
            r rVarE = u1.n.e(x2.x(x2.f(aVar5, 1.0f), null, 3), am.j.c(d92.b.f58623a, o0VarE), m1.f128891a);
            h4.d.f81522a.getClass();
            h4.g.b bVar = h4.d.a.f81534l;
            c2.j.f22691a.getClass();
            c2.j.C0343j c0343j = c2.j.f22692b;
            s2 s2VarA = q2.a(c0343j, bVar, o0VarE, 48);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = h4.k.c(rVarE, o0VarE);
            h5.g.V.getClass();
            e0.a aVar6 = h5.g.a.f81805b;
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar6);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar = h5.g.a.f81810g;
            b4.c(eVar, s2VarA, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA0, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            h5.g.a.f fVar2 = h5.g.a.f81807d;
            b4.c(fVar2, rVarC, o0VarE);
            u2 u2Var = u2.f22900a;
            r rVarF = w.f(239, aVar2, aVar, u2Var.a(aVar5, 1.0f, true), null, false);
            j92.b bVar3 = d92.b.f58625c;
            bVar3.getClass();
            j92.e eVar2 = j92.b.f97899b;
            r rVarY = c2.l.y(rVarF, eVar2.f97920e);
            s2 s2VarA2 = q2.a(c0343j, bVar, o0VarE, 48);
            int iHashCode2 = Long.hashCode(o0VarE.U);
            i2 i2VarA1 = o0VarE.a0();
            r rVarC2 = h4.k.c(rVarY, o0VarE);
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar6);
            } else {
                o0VarE.c();
            }
            b4.c(eVar, s2VarA2, o0VarE);
            b4.c(c1623g, i2VarA1, o0VarE);
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar2);
            }
            b4.c(fVar2, rVarC2, o0VarE);
            t4.d dVarA = n5.c.a(fVar.f91740c.f32981c, o0VarE, 0);
            long jD = d92.b.a(o0VarE).f().d();
            bVar3.getClass();
            r rVarQ = x2.q(aVar5, j92.b.f97901d.f97906e);
            bVar3.getClass();
            i7.a(dVarA, null, c2.l.C(rVarQ, 0.0f, 0.0f, eVar2.f97920e, 0.0f, 11), jD, o0VarE, 48, 0);
            b(fVar, z14, o0Var, u2Var.a(aVar5, 1.0f, true), o0VarE, i15 & 1022);
            o0VarE.g0(true);
            aVar4 = aVar3;
            d(fVar.f91743f, aVar4, o0VarE, (i15 >> 12) & 112);
            o0VarE.g0(true);
        } else {
            aVar4 = aVar3;
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ck0.h(fVar, z14, o0Var, aVar, aVar2, aVar4, i14, 10);
        }
    }

    public static final void d(boolean z14, e23.a<Unit> aVar, p3.m mVar, int i14) {
        int i15;
        long jD;
        o0 o0VarE = mVar.E(554698716);
        if ((i14 & 6) == 0) {
            i15 = i14 | (o0VarE.h(z14) ? 4 : 2);
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(aVar) ? 32 : 16;
        }
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            String strJ = z14 ? com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -2004577473, R.string.activity_unfavorite_icon_title, o0VarE, false) : com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -2004501151, R.string.activity_favorite_icon_title, o0VarE, false);
            int i16 = z14 ? R.drawable.star_filled : R.drawable.star_outlined;
            if (z14) {
                o0VarE.C(489534985);
                gl.c.f77766a.getClass();
                jD = gl.c.a(o0VarE).r();
            } else {
                o0VarE.C(489536101);
                d92.b.f58623a.getClass();
                jD = d92.b.a(o0VarE).f().d();
            }
            o0VarE.g0(false);
            long j8 = jD;
            t4.d dVarA = n5.c.a(i16, o0VarE, 0);
            r rVarD = w.d(r.S, false, null, null, aVar, 15);
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            float f14 = eVar.f97918c;
            bVar.getClass();
            r rVarZ = c2.l.z(rVarD, f14, eVar.f97920e);
            bVar.getClass();
            i7.a(dVarA, strJ, x2.q(rVarZ, j92.b.f97901d.f97905d), j8, o0VarE, 0, 0);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new t(z14, aVar, i14, 2, (byte) 0);
        }
    }
}
