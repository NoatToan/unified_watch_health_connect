package w21;

import android.content.Context;
import android.media.AudioRecord;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.b0;
import c2.q;
import c2.u;
import c2.x2;
import c2.z;
import c22.x0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.nutrition.presentation.NutritionActivity;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.audio.AacUtil;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import e11.t;
import e23.p;
import f5.z0;
import gl1.y;
import h4.r;
import h5.e0;
import i3.fe;
import i3.i5;
import i3.i7;
import i3.mh;
import i3.s4;
import i3.ua;
import i3.x8;
import l72.c1;
import o4.d0;
import o4.m1;
import o4.s0;
import o4.t1;
import o4.u1;
import o4.v1;
import o4.w;
import o53.f0;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.j0;
import p3.b4;
import p3.i2;
import p3.l0;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import p3.y3;
import s1.n0;
import s1.y0;
import u1.a2;
import u1.d2;
import v62.ea;

/* JADX INFO: loaded from: classes9.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u4.d f181559a;

    static {
        s62.a.f157643a.getClass();
        f181559a = ea.a(t62.b.f162798a);
    }

    public static final void a(float f14, boolean z14, p3.m mVar, int i14) {
        int i15;
        int i16;
        Object eVar;
        int i17;
        int i18;
        s1.b bVar;
        Object fVar;
        s1.b bVar2;
        o0 o0VarE = mVar.E(-21509812);
        p3.c<?> cVar = o0VarE.f135177b;
        if ((i14 & 6) == 0) {
            i15 = i14 | (o0VarE.i(f14) ? 4 : 2);
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.h(z14) ? 32 : 16;
        }
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = s1.d.a(1.6f, 0.01f);
                o0VarE.K(objQ);
            }
            s1.b bVar3 = (s1.b) objQ;
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = s1.d.a(0.85f, 0.01f);
                o0VarE.K(objQ2);
            }
            s1.b bVar4 = (s1.b) objQ2;
            d92.b.f58623a.getClass();
            long jE = d92.b.a(o0VarE).e().e();
            Float fValueOf = Float.valueOf(f14);
            Boolean boolValueOf = Boolean.valueOf(z14);
            int i19 = i15 & 112;
            int i24 = i15 & 14;
            boolean zR = (i19 == 32) | (i24 == 4) | o0VarE.r(bVar3);
            Object objQ3 = o0VarE.q();
            if (zR || objQ3 == c2565a) {
                i17 = i19;
                i18 = i24;
                bVar = bVar3;
                eVar = new e(z14, 1.6f, f14, bVar, null);
                o0VarE.K(eVar);
            } else {
                i17 = i19;
                i18 = i24;
                eVar = objQ3;
                bVar = bVar3;
            }
            l0.f(fValueOf, boolValueOf, (p) eVar, o0VarE);
            Float fValueOf2 = Float.valueOf(f14);
            Boolean boolValueOf2 = Boolean.valueOf(z14);
            boolean zR2 = (i17 == 32) | (i18 == 4) | o0VarE.r(bVar4);
            Object objQ4 = o0VarE.q();
            if (zR2 || objQ4 == c2565a) {
                bVar2 = bVar4;
                fVar = new f(z14, 0.85f, f14, bVar2, null);
                o0VarE.K(fVar);
            } else {
                fVar = objQ4;
                bVar2 = bVar4;
            }
            l0.f(fValueOf2, boolValueOf2, (p) fVar, o0VarE);
            h4.d.f81522a.getClass();
            h4.g gVar = h4.d.a.f81528f;
            r.a aVar = r.S;
            r rVarQ = x2.q(aVar, v21.d.f175300d);
            z0 z0VarD = q.d(gVar, false);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = h4.k.c(rVarQ, o0VarE);
            h5.g.V.getClass();
            e0.a aVar2 = h5.g.a.f81805b;
            if (cVar == 0) {
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
            h5.g.a.b bVar5 = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar5);
            }
            h5.g.a.f fVar2 = h5.g.a.f81807d;
            b4.c(fVar2, rVarC, o0VarE);
            u uVar = u.f22885a;
            if (z14) {
                o0VarE.C(-379502170);
                r rVarQ2 = x2.q(aVar, v21.d.f175301e);
                boolean zR3 = o0VarE.r(bVar) | o0VarE.r(bVar2);
                Object objQ5 = o0VarE.q();
                if (zR3 || objQ5 == c2565a) {
                    objQ5 = new w02.b(6, bVar, bVar2);
                    o0VarE.K(objQ5);
                }
                r rVarA = s0.a(rVarQ2, (e23.l) objQ5);
                w.a aVar3 = w.f129023a;
                o13.p pVar = new o13.p(Float.valueOf(0.0f), d0.a(d0.c(0.95f, jE, 14)));
                o13.p pVar2 = new o13.p(Float.valueOf(0.45f), d0.a(d0.c(0.5f, jE, 14)));
                Float fValueOf3 = Float.valueOf(1.0f);
                d0.f128823b.getClass();
                q.a(u1.n.d(rVarA, w.a.f(aVar3, new o13.p[]{pVar, pVar2, new o13.p(fValueOf3, d0.a(d0.f128831j))}, 0L, 0.0f, 14), k2.i.f102406a, 4), o0VarE, 0);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-378693008);
                o0VarE.g0(false);
            }
            j92.b bVar6 = d92.b.f58625c;
            bVar6.getClass();
            j92.c cVar2 = j92.b.f97901d;
            r rVarQ3 = x2.q(aVar, cVar2.f97908g);
            boolean zR4 = o0VarE.r(bVar);
            Object objQ6 = o0VarE.q();
            if (zR4 || objQ6 == c2565a) {
                objQ6 = new x8(bVar, 1);
                o0VarE.K(objQ6);
            }
            r rVarE = u1.n.e(s0.a(rVarQ3, (e23.l) objQ6), jE, k2.i.f102406a);
            z0 z0VarD2 = q.d(gVar, false);
            int iHashCode2 = Long.hashCode(o0VarE.U);
            i2 i2VarA1 = o0VarE.a0();
            r rVarC2 = h4.k.c(rVarE, o0VarE);
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
            b4.c(eVar2, z0VarD2, o0VarE);
            b4.c(c1623g, i2VarA1, o0VarE);
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar5);
            }
            b4.c(fVar2, rVarC2, o0VarE);
            bVar6.getClass();
            r rVarQ4 = x2.q(aVar, cVar2.f97906e);
            d0.f128823b.getClass();
            i7.b(f181559a, null, rVarQ4, d0.f128826e, o0VarE, 3126, 0);
            i16 = 1;
            o0VarE.g0(true);
            o0VarE.g0(true);
        } else {
            i16 = 1;
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new g02.z0(i14, f14, i16, z14);
        }
    }

    public static final void b(e23.a<Unit> aVar, e23.a<Unit> aVar2, p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(289578467);
        int i15 = i14 | (o0VarE.r(aVar) ? 4 : 2) | (o0VarE.r(aVar2) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            c1 c1Var = c1.f110940a;
            x0.f23314a.getClass();
            c1Var.a(false, gl1.d.W(x0.Ze), gl1.d.W(x0.Ye), null, null, y.Q(o0VarE, R.string.lbl_settings), false, false, aVar, y.Q(o0VarE, R.string.lbl_cancel), aVar2, o0VarE, ((i15 << 24) & 234881024) | 6, (i15 >> 3) & 14, 216);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new nw0.l(aVar, aVar2, i14, 20);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00c7  */
    public static final void c(p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(234364769);
        p3.c<?> cVar = o0VarE.f135177b;
        if (o0VarE.n(i14 & 1, i14 != 0)) {
            x1 x1Var = n.f135158a;
            d92.b.f58623a.getClass();
            long jE = d92.b.a(o0VarE).e().e();
            n0.a aVarA = s1.p0.a(s1.p0.c("searchSpin", o0VarE, 0), 0.0f, 360.0f, s1.l.a(s1.l.d(1200, 0, s1.e0.f155563d, 2), y0.Restart, 4), "spinAngle", o0VarE, 29112, 0);
            h4.d.f81522a.getClass();
            h4.g gVar = h4.d.a.f81528f;
            r.a aVar = r.S;
            r rVarQ = x2.q(aVar, v21.d.f175300d);
            z0 z0VarD = q.d(gVar, false);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = h4.k.c(rVarQ, o0VarE);
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
            h5.g.a.e eVar = h5.g.a.f81810g;
            b4.c(eVar, z0VarD, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            h5.g.a.f fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC, o0VarE);
            u uVar = u.f22885a;
            r rVarQ2 = x2.q(aVar, v21.d.f175302f);
            boolean zB = o0VarE.B(aVarA);
            Object objQ = o0VarE.q();
            p3.m.a aVar3 = p3.m.f135153a;
            if (zB) {
                objQ = new i5(aVarA, 11);
                o0VarE.K(objQ);
            } else {
                aVar3.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new i5(aVarA, 11);
                    o0VarE.K(objQ);
                }
            }
            r rVarA = s0.a(rVarQ2, (e23.l) objQ);
            long jD = am.j.d(o0VarE);
            float f14 = v21.d.f175304h;
            u1.f129010b.getClass();
            int i15 = u1.f129011c;
            long jF = ds.e0.f(o0VarE);
            Object objQ2 = o0VarE.q();
            aVar3.getClass();
            if (objQ2 == p3.m.a.f135155b) {
                objQ2 = new w11.b(7);
                o0VarE.K(objQ2);
            }
            ua.b((e23.a) objQ2, rVarA, jD, f14, jF, i15, 0.0f, o0VarE, 3078, 64);
            o0VarE = o0VarE;
            r rVarE = u1.n.e(x2.q(aVar, v21.d.f175303g), jE, k2.i.f102406a);
            z0 z0VarD2 = q.d(gVar, false);
            int iHashCode2 = Long.hashCode(o0VarE.U);
            i2 i2VarA1 = o0VarE.a0();
            r rVarC2 = h4.k.c(rVarE, o0VarE);
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
            b4.c(eVar, z0VarD2, o0VarE);
            b4.c(c1623g, i2VarA1, o0VarE);
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
            }
            b4.c(fVar, rVarC2, o0VarE);
            b3.b.f15502a.getClass();
            u4.d dVarC = d3.p.f57319a;
            if (dVarC == null) {
                g6.f.a aVar4 = g6.f.f75994b;
                u4.d.a aVar5 = new u4.d.a("Filled.Search", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96, null);
                j0 j0Var = u4.m.f168519a;
                d0.f128823b.getClass();
                t1 t1Var = new t1(d0.f128824c, null);
                v1.f129019b.getClass();
                int i16 = v1.f129021d;
                u4.e eVar2 = new u4.e();
                eVar2.k(15.5f, 14.0f);
                eVar2.h(-0.79f);
                eVar2.j(-0.28f, -0.27f);
                eVar2.d(15.41f, 12.59f, 16.0f, 11.11f, 16.0f, 9.5f);
                eVar2.d(16.0f, 5.91f, 13.09f, 3.0f, 9.5f, 3.0f);
                eVar2.m(3.0f, 5.91f, 3.0f, 9.5f);
                eVar2.m(5.91f, 16.0f, 9.5f, 16.0f);
                eVar2.e(1.61f, 0.0f, 3.09f, -0.59f, 4.23f, -1.57f);
                eVar2.j(0.27f, 0.28f);
                eVar2.p(0.79f);
                eVar2.j(5.0f, 4.99f);
                com.nimbusds.jose.shaded.gson.internal.a.w(eVar2, 20.49f, 19.0f, -4.99f, -5.0f);
                eVar2.k(9.5f, 14.0f);
                eVar2.d(7.01f, 14.0f, 5.0f, 11.99f, 5.0f, 9.5f);
                eVar2.m(7.01f, 5.0f, 9.5f, 5.0f);
                eVar2.m(14.0f, 7.01f, 14.0f, 9.5f);
                eVar2.m(11.99f, 14.0f, 9.5f, 14.0f);
                eVar2.c();
                u4.d.a.b(aVar5, eVar2.f168407a, 0, t1Var, 1.0f, null, 1.0f, i16, 1.0f);
                dVarC = aVar5.c();
                d3.p.f57319a = dVarC;
            }
            u4.d dVar = dVarC;
            d92.b.f58625c.getClass();
            r rVarQ3 = x2.q(aVar, j92.b.f97901d.f97906e);
            d0.f128823b.getClass();
            i7.b(dVar, null, rVarQ3, d0.f128826e, o0VarE, 3120, 0);
            o0VarE.g0(true);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new vp1.a(i14, 17);
        }
    }

    public static final void d(String str, d2 d2Var, boolean z14, p3.m mVar, int i14) {
        o0 o0Var;
        o0 o0VarE = mVar.E(382927822);
        int i15 = i14 | (o0VarE.B(str) ? 4 : 2) | (o0VarE.B(d2Var) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = n.f135158a;
            d92.b.f58623a.getClass();
            d92.b.f58624b.getClass();
            s5.x0 x0VarB = d92.c.b(j92.f.f97931h, o0VarE);
            s5.w wVar = x0VarB.f157323b;
            s5.x0 x0VarA = z14 ? s5.x0.a(x0VarB, d0.c(0.5f, x0VarB.c(), 14), 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214) : x0VarB;
            long j8 = wVar.f157308c;
            g6.q.a aVar = g6.q.f76018b;
            if ((j8 & 1095216660480L) != 4294967296L) {
                j8 = x0VarB.f157322a.fontSize;
            }
            g6.c cVar = (g6.c) o0VarE.A(kotlin.t1.f91490h);
            f0.n(j8);
            float fH0 = cVar.H0(f0.H(g6.q.d(j8) * 12, 1095216660480L & j8));
            r.a aVar2 = r.S;
            r rVarB = a2.b(x2.j(x2.f(aVar2, 1.0f), 0.0f, fH0, 1), d2Var, true);
            h4.d.f81522a.getClass();
            z0 z0VarD = q.d(h4.d.a.f81524b, false);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = h4.k.c(rVarB, o0VarE);
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
            b4.c(h5.g.a.f81810g, z0VarD, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            u uVar = u.f22885a;
            d6.h.f57752b.getClass();
            mh.c(str, x2.f(aVar2, 1.0f), 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57755e), 0L, 0, false, 0, 0, null, x0VarA, o0VarE, (i15 & 14) | 48, 0, 130044);
            o0Var = o0VarE;
            o0Var.g0(true);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new r11.l(str, d2Var, z14, i14);
        }
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00aa  */
    public static final void e(y21.a aVar, boolean z14, float f14, e23.a aVar2, e23.a aVar3, e23.a aVar4, p3.m mVar, int i14) {
        boolean z15;
        j92.e eVar;
        float f15;
        r.a aVar5;
        String str;
        boolean z16;
        boolean z17;
        o0 o0VarE = mVar.E(1167280316);
        p3.c<?> cVar = o0VarE.f135177b;
        int i15 = i14 | (o0VarE.r(aVar) ? 4 : 2) | (o0VarE.h(z14) ? 32 : 16) | (o0VarE.i(f14) ? 256 : 128) | (o0VarE.r(aVar2) ? 2048 : 1024) | (o0VarE.r(aVar3) ? 16384 : 8192) | (o0VarE.r(aVar4) ? 131072 : 65536);
        if (o0VarE.n(i15 & 1, (i15 & 74899) != 74898)) {
            x1 x1Var = n.f135158a;
            boolean z18 = aVar.f194226c;
            String str2 = aVar.f194225b;
            boolean z19 = !z18 && aVar.f194227d;
            boolean z24 = (z18 || z19 || str2.length() <= 0) ? false : true;
            d2 d2VarA = a2.a(o0VarE);
            boolean zB = o0VarE.B(d2VarA);
            Object objQ = o0VarE.q();
            if (zB) {
                objQ = new g(d2VarA, null);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new g(d2VarA, null);
                    o0VarE.K(objQ);
                }
            }
            l0.e((p) objQ, str2, o0VarE);
            r.a aVar6 = r.S;
            r rVarE = u1.n.e(c2.l.D(x2.d(aVar6, 1.0f)), tn.k.b(d92.b.f58623a, o0VarE), m1.f128891a);
            h4.d.f81522a.getClass();
            h4.g.a aVar7 = h4.d.a.f81537o;
            c2.j.f22691a.getClass();
            z zVarA = c2.y.a(c2.j.f22694d, aVar7, o0VarE, 48);
            boolean z25 = z24;
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = h4.k.c(rVarE, o0VarE);
            h5.g.V.getClass();
            e0.a aVar8 = h5.g.a.f81805b;
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar8);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar2 = h5.g.a.f81810g;
            b4.c(eVar2, zVarA, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            h5.g.a.f fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC, o0VarE);
            b0 b0Var = b0.f22601a;
            r rVarF = x2.f(aVar6, 1.0f);
            j92.b bVar2 = d92.b.f58625c;
            bVar2.getClass();
            j92.e eVar3 = j92.b.f97899b;
            float f16 = eVar3.f97923h;
            float f17 = eVar3.f97921f;
            r rVarC2 = c2.l.C(rVarF, 0.0f, f16, 0.0f, 0.0f, 13);
            h4.g gVar = h4.d.a.f81525c;
            z0 z0VarD = q.d(gVar, false);
            int iHashCode2 = Long.hashCode(o0VarE.U);
            i2 i2VarA1 = o0VarE.a0();
            r rVarC3 = h4.k.c(rVarC2, o0VarE);
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar8);
            } else {
                o0VarE.c();
            }
            b4.c(eVar2, z0VarD, o0VarE);
            b4.c(c1623g, i2VarA1, o0VarE);
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
            }
            b4.c(fVar, rVarC3, o0VarE);
            u uVar = u.f22885a;
            if (z18) {
                o0VarE.C(1626301264);
                z15 = false;
                c(o0VarE, 0);
                o0VarE.g0(false);
            } else {
                o0VarE.C(1626302697);
                a(f14, z14 && !z19, o0VarE, (i15 >> 6) & 14);
                z15 = false;
                o0VarE.g0(false);
            }
            o0VarE.g0(true);
            r rVarA = b0Var.a(x2.f(aVar6, 1.0f), 1.0f, true);
            bVar2.getClass();
            r rVarA2 = c2.l.A(rVarA, f17, 0.0f, 2);
            z0 z0VarD2 = q.d(gVar, z15);
            int iHashCode3 = Long.hashCode(o0VarE.U);
            i2 i2VarA2 = o0VarE.a0();
            r rVarC4 = h4.k.c(rVarA2, o0VarE);
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar8);
            } else {
                o0VarE.c();
            }
            b4.c(eVar2, z0VarD2, o0VarE);
            b4.c(c1623g, i2VarA2, o0VarE);
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode3))) {
                v.h.A(iHashCode3, o0VarE, iHashCode3, bVar);
            }
            b4.c(fVar, rVarC4, o0VarE);
            bVar2.getClass();
            c2.j.i iVarI = c2.j.i(eVar3.f97918c);
            bVar2.getClass();
            r rVarC5 = c2.l.C(aVar6, 0.0f, eVar3.f97921f, 0.0f, 0.0f, 13);
            z zVarA2 = c2.y.a(iVarI, aVar7, o0VarE, 48);
            int iHashCode4 = Long.hashCode(o0VarE.U);
            i2 i2VarA3 = o0VarE.a0();
            r rVarC6 = h4.k.c(rVarC5, o0VarE);
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar8);
            } else {
                o0VarE.c();
            }
            b4.c(eVar2, zVarA2, o0VarE);
            b4.c(c1623g, i2VarA3, o0VarE);
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode4))) {
                v.h.A(iHashCode4, o0VarE, iHashCode4, bVar);
            }
            b4.c(fVar, rVarC6, o0VarE);
            if (z18) {
                o0VarE.C(1161416518);
                String strQ = y.Q(o0VarE, R.string.lbl_common_processing);
                d92.b.f58624b.getClass();
                s5.x0 x0VarB = d92.c.b(j92.f.f97929f, o0VarE);
                d6.h.f57752b.getClass();
                eVar = eVar3;
                f15 = f17;
                str = str2;
                aVar5 = aVar6;
                mh.c(strQ, null, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57755e), 0L, 0, false, 0, 0, null, x0VarB, o0VarE, 0, 0, 130046);
                o0VarE = o0VarE;
                d(str, d2VarA, true, o0VarE, 384);
                o0VarE.g0(false);
                z17 = true;
                z16 = false;
            } else {
                eVar = eVar3;
                f15 = f17;
                aVar5 = aVar6;
                str = str2;
                if (z19) {
                    o0VarE.C(1162050654);
                    String strQ2 = y.Q(o0VarE, R.string.lbl_no_results_found);
                    j92.f fVar2 = d92.b.f58624b;
                    fVar2.getClass();
                    s5.x0 x0VarB2 = d92.c.b(j92.f.f97929f, o0VarE);
                    d6.h.f57752b.getClass();
                    int i16 = d6.h.f57755e;
                    mh.c(strQ2, null, 0L, null, 0L, null, 0L, d6.h.a(i16), 0L, 0, false, 0, 0, null, x0VarB2, o0VarE, 0, 0, 130046);
                    x0.f23314a.getClass();
                    String strW = gl1.d.W(x0.Rf);
                    fVar2.getClass();
                    mh.c(strW, null, 0L, null, 0L, null, 0L, d6.h.a(i16), 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97931h, o0VarE), o0VarE, 0, 0, 130046);
                    o0VarE = o0VarE;
                    o0VarE.g0(false);
                    z16 = false;
                    z17 = true;
                } else {
                    if (z25) {
                        o0VarE.C(1162722641);
                        x0.f23314a.getClass();
                        String strW2 = gl1.d.W(x0.Ue);
                        d92.b.f58624b.getClass();
                        s5.x0 x0VarB3 = d92.c.b(j92.f.f97929f, o0VarE);
                        d6.h.f57752b.getClass();
                        z16 = false;
                        mh.c(strW2, null, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57755e), 0L, 0, false, 0, 0, null, x0VarB3, o0VarE, 0, 0, 130046);
                        o0VarE = o0VarE;
                        d(str, d2VarA, false, o0VarE, 384);
                        o0VarE.g0(false);
                    } else {
                        z16 = false;
                        if (z14) {
                            o0VarE.C(1163362667);
                            x0.f23314a.getClass();
                            String strW3 = gl1.d.W(x0.Ue);
                            d92.b.f58624b.getClass();
                            s5.x0 x0VarB4 = d92.c.b(j92.f.f97929f, o0VarE);
                            d6.h.f57752b.getClass();
                            mh.c(strW3, null, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57755e), 0L, 0, false, 0, 0, null, x0VarB4, o0VarE, 0, 0, 130046);
                            o0VarE = o0VarE;
                            o0VarE.g0(false);
                        } else {
                            o0VarE.C(1163621455);
                            o0VarE.g0(false);
                        }
                    }
                    z17 = true;
                }
            }
            o0VarE.g0(z17);
            o0VarE.g0(z17);
            r rVarF2 = x2.f(aVar5, 1.0f);
            bVar2.getClass();
            bVar2.getClass();
            r rVarZ = c2.l.z(rVarF2, f15, eVar.f97920e);
            if (z18) {
                o0VarE.C(-712764743);
                o0 o0Var = o0VarE;
                l72.f0.f110999a.i(y.Q(o0VarE, R.string.lbl_cancel), rVarZ, false, aVar3, o0Var, (i15 >> 3) & 7168, 4);
                o0VarE = o0Var;
                o0VarE.g0(z16);
            } else if (z19) {
                o0VarE.C(-712473095);
                l72.f0.f110999a.d((i15 >> 3) & 57344, 9, aVar4, rVarZ, y.Q(o0VarE, R.string.lbl_try_again), o0VarE, null, false);
                o0VarE.g0(z16);
            } else {
                o0VarE.C(-712197443);
                l72.f0.f110999a.d((i15 << 3) & 57344, 1, aVar2, rVarZ, y.Q(o0VarE, R.string.lbl_finish), o0VarE, null, str.length() > 0 ? true : z16);
                o0VarE.g0(z16);
            }
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new c(aVar, z14, f14, aVar2, aVar3, aVar4, i14);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void f(y21.a aVar, fe feVar, e23.l lVar, e23.l lVar2, e23.l lVar3, e23.a aVar2, e23.a aVar3, e23.a aVar4, e23.a aVar5, NutritionActivity.g gVar, p3.m mVar, int i14) {
        int i15;
        o0 o0Var;
        p1 p1Var;
        p1 p1Var2;
        x21.c cVar;
        aVar.getClass();
        feVar.getClass();
        lVar.getClass();
        lVar2.getClass();
        lVar3.getClass();
        aVar2.getClass();
        aVar3.getClass();
        aVar4.getClass();
        aVar5.getClass();
        o0 o0VarE = mVar.E(-881170328);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.r(aVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.B(feVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(lVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.r(lVar2) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.r(lVar3) ? 16384 : 8192;
        }
        if ((196608 & i14) == 0) {
            i15 |= o0VarE.r(aVar2) ? 131072 : 65536;
        }
        if ((1572864 & i14) == 0) {
            i15 |= o0VarE.r(aVar3) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((12582912 & i14) == 0) {
            i15 |= o0VarE.r(aVar4) ? 8388608 : 4194304;
        }
        if ((i14 & 100663296) == 0) {
            i15 |= o0VarE.r(aVar5) ? 67108864 : 33554432;
        }
        if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
            i15 |= o0VarE.r(gVar) ? 536870912 : 268435456;
        }
        if (o0VarE.n(i15 & 1, (i15 & 306783379) != 306783378)) {
            x1 x1Var = n.f135158a;
            y3 y3Var = AndroidCompositionLocals_androidKt.f6042b;
            Context context = (Context) o0VarE.A(y3Var);
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p0.n(Boolean.TRUE);
                o0VarE.K(objQ);
            }
            p1 p1Var3 = (p1) objQ;
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = p0.n(Boolean.FALSE);
                o0VarE.K(objQ2);
            }
            p1 p1Var4 = (p1) objQ2;
            Object objQ3 = o0VarE.q();
            if (objQ3 == c2565a) {
                objQ3 = p0.n(Boolean.FALSE);
                o0VarE.K(objQ3);
            }
            p1 p1Var5 = (p1) objQ3;
            Object objQ4 = o0VarE.q();
            if (objQ4 == c2565a) {
                objQ4 = p0.n(Boolean.FALSE);
                o0VarE.K(objQ4);
            }
            p1 p1Var6 = (p1) objQ4;
            Context context2 = (Context) o0VarE.A(y3Var);
            Object objQ5 = o0VarE.q();
            if (objQ5 == c2565a) {
                objQ5 = new x21.c(context2);
                o0VarE.K(objQ5);
            }
            x21.c cVar2 = (x21.c) objQ5;
            Unit unit = Unit.INSTANCE;
            boolean zR = o0VarE.r(cVar2);
            Object objQ6 = o0VarE.q();
            if (zR || objQ6 == c2565a) {
                objQ6 = new x21.b(cVar2, 4);
                o0VarE.K(objQ6);
            }
            l0.a(unit, (e23.l) objQ6, o0VarE);
            String str = (String) cVar2.f188494d.getF182175a();
            boolean zR2 = o0VarE.r(cVar2);
            int i16 = i15 & 458752;
            boolean z14 = (i16 == 131072) | zR2;
            Object objQ7 = o0VarE.q();
            if (z14 || objQ7 == c2565a) {
                objQ7 = new h(cVar2, aVar2, p1Var4, p1Var3, null);
                o0VarE.K(objQ7);
            }
            l0.e((p) objQ7, str, o0VarE);
            Boolean bool = (Boolean) r17.f188495e.getF182175a();
            bool.getClass();
            boolean zR3 = (i16 == 131072) | o0VarE.r(r17);
            Object objQ8 = o0VarE.q();
            if (zR3 || objQ8 == c2565a) {
                objQ8 = new i(cVar2, aVar2, p1Var4, p1Var3, null);
                o0VarE.K(objQ8);
            }
            l0.e((p) objQ8, bool, o0VarE);
            Boolean bool2 = (Boolean) r17.f188491a.getF182175a();
            bool2.getClass();
            Boolean boolValueOf = Boolean.valueOf(i(p1Var4));
            boolean zR4 = ((i15 & 7168) == 2048) | o0VarE.r(r17);
            Object objQ9 = o0VarE.q();
            if (zR4 || objQ9 == c2565a) {
                objQ9 = new j(lVar2, r17, p1Var4, null);
                o0VarE.K(objQ9);
            }
            l0.f(bool2, boolValueOf, (p) objQ9, o0VarE);
            String str2 = (String) r17.f188492b.getF182175a();
            boolean zR5 = o0VarE.r(r17) | ((i15 & 896) == 256);
            Object objQ10 = o0VarE.q();
            if (zR5 || objQ10 == c2565a) {
                p1Var = p1Var4;
                objQ10 = new k(r17, lVar, p1Var, p1Var3, p1Var5, null);
                o0VarE.K(objQ10);
            } else {
                p1Var = p1Var4;
            }
            l0.e((p) objQ10, str2, o0VarE);
            g.g gVar2 = new g.g();
            int i17 = 29360128 & i15;
            boolean zR6 = ((i15 & 234881024) == 67108864) | (i17 == 8388608) | o0VarE.r(r17);
            Object objQ11 = o0VarE.q();
            if (zR6 || objQ11 == c2565a) {
                p1 p1Var7 = p1Var;
                objQ11 = new ug2.q(aVar5, aVar4, r17, p1Var7, p1Var3, 7);
                p1Var = p1Var7;
                p1Var3 = p1Var3;
                o0VarE.K(objQ11);
            }
            c.q qVarC = c.w.c(gVar2, (e23.l) objQ11, o0VarE, 0);
            g.h hVar = new g.h();
            boolean zR7 = o0VarE.r(context) | (i17 == 8388608) | o0VarE.r(r17);
            Object objQ12 = o0VarE.q();
            if (zR7 || objQ12 == c2565a) {
                p1 p1Var8 = p1Var3;
                p1 p1Var9 = p1Var;
                objQ12 = new ug2.q(context, aVar4, r17, p1Var9, p1Var8, 8);
                p1Var = p1Var9;
                p1Var3 = p1Var8;
                o0VarE.K(objQ12);
            }
            c.q qVarC2 = c.w.c(hVar, (e23.l) objQ12, o0VarE, 0);
            boolean zR8 = o0VarE.r(context) | (i17 == 8388608) | o0VarE.r(r17) | o0VarE.r(aVar) | o0VarE.r(qVarC);
            Object objQ13 = o0VarE.q();
            if (zR8 || objQ13 == c2565a) {
                p1Var2 = p1Var6;
                l lVar4 = new l(p1Var3, context, aVar, qVarC, aVar4, r17, p1Var, p1Var2, null);
                cVar = r17;
                context = context;
                o0VarE.K(lVar4);
                objQ13 = lVar4;
            } else {
                cVar = cVar2;
                p1Var2 = p1Var6;
            }
            l0.e((p) objQ13, unit, o0VarE);
            x21.c cVar3 = cVar;
            p1 p1Var10 = p1Var3;
            p1 p1Var11 = p1Var;
            z3.e eVarC = z3.f.c(-857289597, new d((Object) cVar3, (Object) gVar, (Object) p1Var11, (Object) p1Var10, 0), o0VarE);
            z3.e eVarC2 = z3.f.c(-1516355678, new p21.b(feVar, 26), o0VarE);
            z3.e eVarC3 = z3.f.c(801413375, new t(aVar, cVar3, lVar3, gVar, aVar3, context, aVar4, qVarC, qVarC2, p1Var10, p1Var11, p1Var2, p1Var5), o0VarE);
            o0Var = o0VarE;
            z02.d.a(false, eVarC, eVarC2, null, null, eVarC3, o0Var, 197040, 25);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new s4(aVar, feVar, lVar, lVar2, lVar3, aVar2, aVar3, aVar4, aVar5, gVar, i14);
        }
    }

    public static final void g(e23.a aVar, p1 p1Var, p1 p1Var2, x21.c cVar) {
        j(p1Var, true);
        h(p1Var2, false);
        cVar.f188496f.h();
        aVar.invoke();
    }

    public static final void h(p1<Boolean> p1Var, boolean z14) {
        p1Var.setValue(Boolean.valueOf(z14));
    }

    public static final boolean i(p1<Boolean> p1Var) {
        return p1Var.getF182175a().booleanValue();
    }

    public static final void j(p1<Boolean> p1Var, boolean z14) {
        p1Var.setValue(Boolean.valueOf(z14));
    }

    public static final void k(e23.a aVar, p1 p1Var, p1 p1Var2, x21.c cVar) {
        aVar.invoke();
        j(p1Var, false);
        h(p1Var2, true);
        x21.g gVar = cVar.f188496f;
        x21.h hVar = gVar.f188512j;
        hVar.f188523a.setLength(0);
        hVar.f188524b = "";
        hVar.f188525c = false;
        gVar.f188505c.invoke("");
        gVar.f188514l = 0;
        if (gVar.f188510h) {
            x21.a aVar2 = gVar.f188515m;
            if (aVar2 == null) {
                aVar2 = new x21.a(new vu1.b(gVar, 25));
                gVar.f188515m = aVar2;
            }
            if (!aVar2.f188485e) {
                AudioRecord audioRecord = new AudioRecord(6, AacUtil.AAC_HE_V1_MAX_RATE_BYTES_PER_SECOND, 16, 2, aVar2.f188482b);
                if (audioRecord.getState() != 1) {
                    try {
                        int i14 = o13.q.f128596b;
                        audioRecord.release();
                        Unit unit = Unit.INSTANCE;
                    } catch (Throwable th3) {
                        int i15 = o13.q.f128596b;
                        new o13.q.b(th3);
                    }
                    gVar.f188507e.invoke("Audio recording error");
                    return;
                }
                aVar2.f188483c = audioRecord;
                aVar2.f188485e = true;
                audioRecord.startRecording();
                Thread thread = new Thread(new vg1.d(14, aVar2, audioRecord), "MicrophoneRecorder");
                thread.setPriority(10);
                thread.start();
                aVar2.f188484d = thread;
            }
        }
        gVar.e();
        if (gVar.f188511i == null) {
            return;
        }
        gVar.f188513k = true;
        gVar.f188509g.removeCallbacks(gVar.f188519q);
        gVar.f188509g.removeCallbacks(gVar.f188520r);
        gVar.f188509g.postDelayed(gVar.f188520r, 60000L);
        gVar.g();
    }
}
