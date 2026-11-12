package u91;

import c2.b0;
import c2.q;
import c2.q2;
import c2.s2;
import c2.u;
import c2.u2;
import c2.x2;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import e23.p;
import f5.z0;
import h4.r;
import h5.e0;
import i3.i7;
import i3.mh;
import java.util.Set;
import l72.f0;
import l72.l2;
import o4.m1;
import okhttp3.internal.http.StatusLine;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.a1;
import p3.b4;
import p3.i2;
import p3.l0;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import p5.v;
import s5.x0;
import tn2.t;
import u1.p1;
import u1.w;
import v62.d9;
import v62.e9;
import v62.j5;

/* JADX INFO: loaded from: classes9.dex */
public final class h {
    /* JADX WARN: Code duplicated, block: B:127:0x02ed  */
    /* JADX WARN: Code duplicated, block: B:174:0x053f  */
    /* JADX WARN: Code duplicated, block: B:68:0x011e  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(r rVar, aa1.d dVar, q91.d dVar2, boolean z14, boolean z15, boolean z16, boolean z17, p pVar, e23.a aVar, e23.a aVar2, p pVar2, m mVar, int i14) {
        o0 o0Var;
        h5.g.a.b bVar;
        int i15;
        r.a aVar3;
        boolean z18;
        o0 o0Var2;
        h4.g.a aVar4;
        o13.p pVar3;
        boolean z19;
        dVar.getClass();
        dVar2.getClass();
        pVar.getClass();
        aVar.getClass();
        aVar2.getClass();
        pVar2.getClass();
        o0 o0VarE = mVar.E(-586252551);
        p3.c<?> cVar = o0VarE.f135177b;
        int i16 = i14 | (o0VarE.B(rVar) ? 4 : 2) | (o0VarE.B(dVar) ? 32 : 16) | (o0VarE.k(dVar2.ordinal()) ? 256 : 128) | (o0VarE.h(z14) ? 2048 : 1024) | (o0VarE.h(z15) ? 16384 : 8192) | (o0VarE.h(z16) ? 131072 : 65536) | (o0VarE.h(z17) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (o0VarE.r(pVar) ? 8388608 : 4194304) | (o0VarE.r(aVar) ? 67108864 : 33554432) | (o0VarE.r(aVar2) ? 536870912 : 268435456);
        char c14 = o0VarE.r(pVar2) ? (char) 4 : (char) 2;
        if (o0VarE.n(i16 & 1, ((i16 & 306783379) == 306783378 && (c14 & 3) == 2) ? false : true)) {
            x1 x1Var = n.f135158a;
            d92.b.f58623a.getClass();
            j92.b bVar2 = d92.b.f58625c;
            bVar2.getClass();
            r rVarB = l4.k.b(rVar, k2.i.a(j92.b.f97900c.f97911c));
            long jT = v.h.t(o0VarE);
            m1.a aVar5 = m1.f128891a;
            r rVarE = u1.n.e(rVarB, jT, aVar5);
            boolean z24 = !z15;
            int i17 = i16 & 112;
            boolean z25 = (i17 == 32) | ((29360128 & i16) == 8388608);
            Object objQ = o0VarE.q();
            m.a aVar6 = m.f135153a;
            if (z25) {
                objQ = new tb0.d(24, dVar, pVar);
                o0VarE.K(objQ);
            } else {
                aVar6.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new tb0.d(24, dVar, pVar);
                    o0VarE.K(objQ);
                }
            }
            r rVarD = w.d(rVarE, z24, null, null, (e23.a) objQ, 14);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            h4.g.a aVar7 = h4.d.a.f81536n;
            z zVarA = y.a(kVar, aVar7, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = h4.k.c(rVarD, o0VarE);
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
            h5.g.a.e eVar = h5.g.a.f81810g;
            b4.c(eVar, zVarA, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA0, o0VarE);
            h5.g.a.b bVar3 = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar3);
            }
            h5.g.a.f fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC, o0VarE);
            b0 b0Var = b0.f22601a;
            r.a aVar9 = r.S;
            r rVarF = x2.f(aVar9, 1.0f);
            h4.g.b bVar4 = h4.d.a.f81534l;
            s2 s2VarA = q2.a(c2.j.f22692b, bVar4, o0VarE, 48);
            int iHashCode2 = Long.hashCode(o0VarE.U);
            i2 i2VarA1 = o0VarE.a0();
            r rVarC2 = h4.k.c(rVarF, o0VarE);
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
            b4.c(eVar, s2VarA, o0VarE);
            b4.c(c1623g, i2VarA1, o0VarE);
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                bVar = bVar3;
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
            } else {
                bVar = bVar3;
            }
            b4.c(fVar, rVarC2, o0VarE);
            u2 u2Var = u2.f22900a;
            float f14 = z15 ? 0.65f : 0.7f;
            if (z15) {
                o0VarE.C(1577641780);
                bVar2.getClass();
                r rVarC3 = c2.l.C(aVar9, j92.b.f97899b.f97920e, 0.0f, 0.0f, 0.0f, 14);
                z0 z0VarD = q.d(h4.d.a.f81528f, false);
                int iHashCode3 = Long.hashCode(o0VarE.U);
                i2 i2VarA2 = o0VarE.a0();
                r rVarC4 = h4.k.c(rVarC3, o0VarE);
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
                b4.c(eVar, z0VarD, o0VarE);
                b4.c(c1623g, i2VarA2, o0VarE);
                if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode3))) {
                    v.h.A(iHashCode3, o0VarE, iHashCode3, bVar);
                }
                b4.c(fVar, rVarC4, o0VarE);
                u uVar = u.f22885a;
                bVar2.getClass();
                j92.c cVar2 = j92.b.f97901d;
                q.a(u1.n.e(l4.k.b(x2.q(aVar9, cVar2.f97904c), k2.i.f102406a), d92.b.a(o0VarE).f().f63508c, aVar5), o0VarE, 0);
                s62.a.f157643a.getClass();
                u4.d dVarA = j5.a(t62.b.f162798a);
                long jF = d92.b.a(o0VarE).f().f();
                String strQ = gl1.y.Q(o0VarE, R.string.lbl_remove);
                bVar2.getClass();
                r rVarQ = x2.q(aVar9, cVar2.f97905d);
                i15 = i16;
                boolean z26 = (i17 == 32) | ((c14 & 14) == 4) | ((i15 & 896) == 256);
                Object objQ2 = o0VarE.q();
                if (z26) {
                    objQ2 = new sg0.j(dVar, 28, pVar2, dVar2);
                    o0VarE.K(objQ2);
                } else {
                    aVar6.getClass();
                    if (objQ2 == m.a.f135155b) {
                        objQ2 = new sg0.j(dVar, 28, pVar2, dVar2);
                        o0VarE.K(objQ2);
                    }
                }
                aVar4 = aVar7;
                aVar3 = aVar9;
                z18 = true;
                i7.b(dVarA, strQ, w.d(rVarQ, false, null, null, (e23.a) objQ2, 15), jF, o0VarE, 0, 0);
                o0Var2 = o0VarE;
                o0Var2.g0(true);
                o0Var2.g0(false);
            } else {
                i15 = i16;
                aVar3 = aVar9;
                z18 = true;
                o0Var2 = o0VarE;
                aVar4 = aVar7;
                o0Var2.C(1578671011);
                o0Var2.g0(false);
            }
            float f15 = f14;
            r rVarA = u2Var.a(aVar3, f15, z18);
            bVar2.getClass();
            j92.e eVar2 = j92.b.f97899b;
            r rVarY = c2.l.y(rVarA, eVar2.f97920e);
            bVar2.getClass();
            z zVarA2 = y.a(c2.j.i(eVar2.f97918c), aVar4, o0Var2, 0);
            int iHashCode4 = Long.hashCode(o0Var2.getU());
            i2 i2VarA3 = o0Var2.a0();
            r rVarC5 = h4.k.c(rVarY, o0Var2);
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0Var2.z();
            if (o0Var2.T) {
                o0Var2.M(aVar8);
            } else {
                o0Var2.c();
            }
            b4.c(eVar, zVarA2, o0Var2);
            b4.c(c1623g, i2VarA3, o0Var2);
            if (o0Var2.T || !s.g(o0Var2.q(), Integer.valueOf(iHashCode4))) {
                v.h.A(iHashCode4, o0Var2, iHashCode4, bVar);
            }
            b4.c(fVar, rVarC5, o0Var2);
            bVar2.getClass();
            s2 s2VarA2 = q2.a(c2.j.i(eVar2.f97918c), bVar4, o0Var2, 48);
            int iHashCode5 = Long.hashCode(o0Var2.getU());
            i2 i2VarA4 = o0Var2.a0();
            r rVarC6 = h4.k.c(aVar3, o0Var2);
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0Var2.z();
            if (o0Var2.T) {
                o0Var2.M(aVar8);
            } else {
                o0Var2.c();
            }
            b4.c(eVar, s2VarA2, o0Var2);
            b4.c(c1623g, i2VarA4, o0Var2);
            if (o0Var2.T || !s.g(o0Var2.q(), Integer.valueOf(iHashCode5))) {
                v.h.A(iHashCode5, o0Var2, iHashCode5, bVar);
            }
            b4.c(fVar, rVarC6, o0Var2);
            r rVarA2 = u2Var.a(aVar3, 1.0f, false);
            String str = dVar.f2249a;
            j92.f fVar2 = d92.b.f58624b;
            fVar2.getClass();
            o0 o0Var3 = o0Var2;
            mh.c(str, rVarA2, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(d92.c.e(j92.f.f97932i), o0Var2), o0Var3, 0, 0, 131068);
            o0 o0Var4 = o0Var3;
            if (z17) {
                o0Var4.C(135730383);
                s62.a.f157643a.getClass();
                t62.b.f162798a.getClass();
                pVar3 = new o13.p(e72.a.a(d9.f175854a), gl1.y.Q(o0Var4, R.string.personal_records_current_best_effort_accessibility));
                o0Var4.g0(false);
            } else if (z16) {
                o0Var4.C(135735216);
                s62.a.f157643a.getClass();
                pVar3 = new o13.p(e9.a(t62.b.f162798a), gl1.y.Q(o0Var4, R.string.lbl_current_personal_record));
                o0Var4.g0(false);
            } else {
                o0Var4.C(135738609);
                o0Var4.g0(false);
                pVar3 = new o13.p(null, null);
            }
            u4.d dVar3 = (u4.d) pVar3.f128594a;
            String str2 = (String) pVar3.f128595b;
            if (dVar3 != null) {
                o0Var4.C(-86955157);
                gl.c.f77766a.getClass();
                long jI = gl.c.a(o0Var4).i();
                bVar2.getClass();
                i7.b(dVar3, str2, x2.q(aVar3, j92.b.f97901d.f97904c), jI, o0Var4, 0, 0);
                o0Var4 = o0Var4;
                o0Var4.g0(false);
            } else {
                o0Var4.C(-86639267);
                o0Var4.g0(false);
            }
            o0Var4.g0(true);
            String str3 = dVar.f2251c;
            fVar2.getClass();
            o0 o0Var5 = o0Var4;
            g02.c.a(str3, null, 0L, null, 0, false, 1, d92.c.f(j92.f.f97933j, o0Var4), 0.0d, o0Var5, 1572864, 318);
            o0Var5.g0(true);
            String str4 = dVar.f2253e;
            fVar2.getClass();
            x0 x0VarB = d92.c.b(j92.f.f97931h, o0Var5);
            r rVarA3 = u2Var.a(aVar3, 1.0f - f15, true);
            bVar2.getClass();
            r rVarA4 = c2.l.A(rVarA3, eVar2.f97920e, 0.0f, 2);
            boolean z27 = i17 == 32;
            Object objQ3 = o0Var5.q();
            if (z27) {
                objQ3 = new t(dVar, 22);
                o0Var5.K(objQ3);
            } else {
                aVar6.getClass();
                if (objQ3 == m.a.f135155b) {
                    objQ3 = new t(dVar, 22);
                    o0Var5.K(objQ3);
                }
            }
            r rVarC7 = v.c((e23.l) objQ3, rVarA4, false);
            d6.h.f57752b.getClass();
            g02.c.a(str4, rVarC7, 0L, d6.h.a(d6.h.f57758h), 0, false, 1, x0VarB, 0.0d, o0Var5, 1572864, StatusLine.HTTP_PERM_REDIRECT);
            o0Var = o0Var5;
            o0Var.g0(true);
            if (z14) {
                o0Var.C(1845779336);
                r rVarB2 = b0Var.b(aVar3, h4.d.a.f81538p);
                bVar2.getClass();
                r rVarA5 = c2.l.A(rVarB2, eVar2.f97920e, 0.0f, 2);
                bVar2.getClass();
                r rVarC8 = c2.l.C(rVarA5, 0.0f, 0.0f, 0.0f, eVar2.f97920e, 7);
                bVar2.getClass();
                s2 s2VarA3 = q2.a(c2.j.i(eVar2.f97920e), bVar4, o0Var, 48);
                int iHashCode6 = Long.hashCode(o0Var.getU());
                i2 i2VarA5 = o0Var.a0();
                r rVarC9 = h4.k.c(rVarC8, o0Var);
                if (cVar == null) {
                    p0.l();
                    throw null;
                }
                o0Var.z();
                if (o0Var.T) {
                    o0Var.M(aVar8);
                } else {
                    o0Var.c();
                }
                b4.c(eVar, s2VarA3, o0Var);
                b4.c(c1623g, i2VarA5, o0Var);
                if (o0Var.T || !s.g(o0Var.q(), Integer.valueOf(iHashCode6))) {
                    v.h.A(iHashCode6, o0Var, iHashCode6, bVar);
                }
                b4.c(fVar, rVarC9, o0Var);
                f0.a aVar10 = f0.a.f111000a;
                aVar10.j(gl1.y.Q(o0Var, R.string.lbl_decline), null, false, aVar2, o0Var, (i15 >> 18) & 7168, 6);
                aVar10.f(gl1.y.Q(o0Var, R.string.lbl_accept), null, false, aVar, o0Var, (i15 >> 15) & 7168, 6);
                o0Var = o0Var;
                z19 = true;
                o0Var.g0(true);
                o0Var.g0(false);
            } else {
                z19 = true;
                o0Var.C(1846508735);
                o0Var.g0(false);
            }
            o0Var.g0(z19);
            x1 x1Var2 = n.f135158a;
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new f(rVar, dVar, dVar2, z14, z15, z16, z17, pVar, aVar, aVar2, pVar2, i14);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x014a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:101:0x014c  */
    /* JADX WARN: Code duplicated, block: B:102:0x014e  */
    /* JADX WARN: Code duplicated, block: B:104:0x0151  */
    /* JADX WARN: Code duplicated, block: B:105:0x0154  */
    /* JADX WARN: Code duplicated, block: B:107:0x0158  */
    /* JADX WARN: Code duplicated, block: B:108:0x015a  */
    /* JADX WARN: Code duplicated, block: B:110:0x015d  */
    /* JADX WARN: Code duplicated, block: B:111:0x015f  */
    /* JADX WARN: Code duplicated, block: B:114:0x016f  */
    /* JADX WARN: Code duplicated, block: B:117:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:119:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:120:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:125:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:131:0x021f  */
    /* JADX WARN: Code duplicated, block: B:134:0x0227  */
    /* JADX WARN: Code duplicated, block: B:137:0x0285  */
    /* JADX WARN: Code duplicated, block: B:139:0x028a  */
    /* JADX WARN: Code duplicated, block: B:142:0x029a  */
    /* JADX WARN: Code duplicated, block: B:144:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:0x007a  */
    /* JADX WARN: Code duplicated, block: B:32:0x007f  */
    /* JADX WARN: Code duplicated, block: B:34:0x0085  */
    /* JADX WARN: Code duplicated, block: B:36:0x008b  */
    /* JADX WARN: Code duplicated, block: B:37:0x008e  */
    /* JADX WARN: Code duplicated, block: B:41:0x0096  */
    /* JADX WARN: Code duplicated, block: B:42:0x009d  */
    /* JADX WARN: Code duplicated, block: B:44:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:45:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:49:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:51:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:53:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:54:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:58:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:59:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:62:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:64:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:65:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:69:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:71:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:72:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:74:0x0101  */
    /* JADX WARN: Code duplicated, block: B:77:0x0107  */
    /* JADX WARN: Code duplicated, block: B:79:0x010d  */
    /* JADX WARN: Code duplicated, block: B:80:0x0110  */
    /* JADX WARN: Code duplicated, block: B:84:0x0118  */
    /* JADX WARN: Code duplicated, block: B:86:0x0120  */
    /* JADX WARN: Code duplicated, block: B:87:0x0123  */
    /* JADX WARN: Code duplicated, block: B:90:0x012a  */
    /* JADX WARN: Code duplicated, block: B:97:0x0141  */
    public static final void b(final r rVar, final aa1.d dVar, final q91.d dVar2, final boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, final p<? super Long, ? super String, Unit> pVar, final e23.a<Unit> aVar, final e23.a<Unit> aVar2, final p<? super Long, ? super q91.d, Unit> pVar2, final p<? super Long, ? super q91.d, Unit> pVar3, m mVar, final int i14, final int i15, final int i16) {
        int i17;
        boolean z19;
        int i18;
        int i19;
        int i24;
        final boolean z24;
        int i25;
        int i26;
        int i27;
        boolean z25;
        int i28;
        int i29;
        int i30;
        int i34;
        int i35;
        boolean z26;
        o0 o0Var;
        final boolean z27;
        final boolean z28;
        final boolean z29;
        p2 p2VarI0;
        boolean z34;
        boolean z35;
        boolean z36;
        boolean z37;
        Object objQ;
        m.a.C2565a c2565a;
        o53.b0 b0Var;
        z0 z0VarD;
        boolean z38;
        int iHashCode;
        i2 i2VarA0;
        r rVarC;
        e0.a aVar3;
        h5.g.a.b bVar;
        boolean z39;
        Object objQ2;
        int i36;
        int i37;
        int i38;
        int i39;
        dVar.getClass();
        dVar2.getClass();
        pVar.getClass();
        aVar.getClass();
        aVar2.getClass();
        pVar2.getClass();
        pVar3.getClass();
        o0 o0VarE = mVar.E(-1043579808);
        if ((i14 & 6) == 0) {
            i17 = (o0VarE.B(rVar) ? 4 : 2) | i14;
        } else {
            i17 = i14;
        }
        int i44 = i17 | (o0VarE.B(dVar) ? 32 : 16) | (o0VarE.k(dVar2.ordinal()) ? 256 : 128);
        int i45 = i16 & 16;
        if (i45 == 0) {
            if ((i14 & 24576) == 0) {
                z19 = z15;
                i44 |= o0VarE.h(z19) ? 16384 : 8192;
            }
            i18 = i16 & 32;
            if (i18 != 0) {
                i44 |= 196608;
            } else if ((i14 & 196608) == 0) {
                if (o0VarE.h(z16)) {
                    i19 = 131072;
                } else {
                    i19 = 65536;
                }
                i44 |= i19;
            }
            i24 = i16 & 64;
            if (i24 != 0) {
                i26 = i44 | 1572864;
                z24 = z17;
            } else {
                z24 = z17;
                if (o0VarE.h(z24)) {
                    i25 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                } else {
                    i25 = 524288;
                }
                i26 = i44 | i25;
            }
            i27 = i16 & 128;
            if (i27 != 0) {
                i29 = i26 | 12582912;
                z25 = z18;
            } else {
                z25 = z18;
                if (o0VarE.h(z25)) {
                    i28 = 8388608;
                } else {
                    i28 = 4194304;
                }
                i29 = i26 | i28;
            }
            if (o0VarE.r(pVar)) {
                i30 = 67108864;
            } else {
                i30 = 33554432;
            }
            i34 = i29 | i30;
            if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
                if (o0VarE.r(aVar)) {
                    i39 = 536870912;
                } else {
                    i39 = 268435456;
                }
                i34 |= i39;
            }
            if ((i15 & 6) == 0) {
                if (o0VarE.r(aVar2)) {
                    i38 = 4;
                } else {
                    i38 = 2;
                }
                i35 = i15 | i38;
            } else {
                i35 = i15;
            }
            if ((i15 & 48) == 0) {
                if (o0VarE.r(pVar2)) {
                    i37 = 32;
                } else {
                    i37 = 16;
                }
                i35 |= i37;
            }
            if ((i15 & 384) != 0) {
                if (o0VarE.r(pVar3)) {
                    i36 = 256;
                } else {
                    i36 = 128;
                }
                i35 |= i36;
            }
            int i46 = i35;
            if ((i34 & 306783379) == 306783378 || (i46 & 147) != 146) {
                z26 = true;
            } else {
                z26 = false;
            }
            if (o0VarE.n(i34 & 1, z26)) {
                if (i45 != 0) {
                    z34 = false;
                } else {
                    z34 = z19;
                }
                if (i18 != 0) {
                    z35 = true;
                } else {
                    z35 = z16;
                }
                if (i24 != 0) {
                    z36 = false;
                } else {
                    z36 = z24;
                }
                if (i27 != 0) {
                    z37 = false;
                } else {
                    z37 = z25;
                }
                x1 x1Var = n.f135158a;
                objQ = o0VarE.q();
                m.f135153a.getClass();
                c2565a = m.a.f135155b;
                if (objQ == c2565a) {
                    objQ = l0.j(t13.h.f161748a, o0VarE);
                    o0VarE.K(objQ);
                }
                b0Var = (o53.b0) objQ;
                r rVarF = x2.f(r.S, 1.0f);
                d92.b.f58623a.getClass();
                j92.b bVar2 = d92.b.f58625c;
                bVar2.getClass();
                r rVarA = c2.l.A(rVarF, j92.b.f97899b.f97920e, 0.0f, 2);
                bVar2.getClass();
                r rVarB = l4.k.b(rVarA, k2.i.a(j92.b.f97900c.f97911c));
                h4.d.f81522a.getClass();
                z0VarD = q.d(h4.d.a.f81524b, false);
                z38 = z34;
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = h4.k.c(rVarB, o0VarE);
                h5.g.V.getClass();
                aVar3 = h5.g.a.f81805b;
                if (o0VarE.f135177b != null) {
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
                bVar = h5.g.a.f81813j;
                if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                }
                b4.c(h5.g.a.f81807d, rVarC, o0VarE);
                u uVar = u.f22885a;
                Set setB = a1.b(new c92.b.a(c92.a.DELETE, gl1.y.Q(o0VarE, R.string.lbl_remove)));
                if (z38 && !z14 && z35) {
                    z39 = true;
                } else {
                    z39 = false;
                }
                objQ2 = o0VarE.q();
                if (objQ2 == c2565a) {
                    objQ2 = new p1(6);
                    o0VarE.K(objQ2);
                }
                z19 = z38;
                boolean z44 = z36;
                boolean z45 = z37;
                l2.a(setB, b0Var, z39, null, (e23.a) objQ2, z3.f.c(176135427, new f(rVar, dVar, dVar2, z14, z38, z36, z37, pVar, aVar, aVar2, pVar3), o0VarE), z3.f.c(376366690, new ng2.i(dVar, 28, pVar2, dVar2), o0VarE), o0VarE, 1794048, 8);
                o0Var = o0VarE;
                o0Var.g0(true);
                z27 = z35;
                z24 = z44;
                z28 = z45;
            } else {
                o0Var = o0VarE;
                o0Var.e();
                z27 = z16;
                z28 = z25;
            }
            z29 = z19;
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new p() { // from class: u91.g
                    @Override // e23.p
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iT = p0.t(i14 | 1);
                        int iT2 = p0.t(i15);
                        h.b(rVar, dVar, dVar2, z14, z29, z27, z24, z28, pVar, aVar, aVar2, pVar2, pVar3, (m) obj, iT, iT2, i16);
                        return Unit.INSTANCE;
                    }
                };
            }
        }
        i44 |= 24576;
        z19 = z15;
        i18 = i16 & 32;
        if (i18 != 0) {
            i44 |= 196608;
        } else if ((i14 & 196608) == 0) {
            if (o0VarE.h(z16)) {
                i19 = 131072;
            } else {
                i19 = 65536;
            }
            i44 |= i19;
        }
        i24 = i16 & 64;
        if (i24 != 0) {
            i26 = i44 | 1572864;
            z24 = z17;
        } else {
            z24 = z17;
            if (o0VarE.h(z24)) {
                i25 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
            } else {
                i25 = 524288;
            }
            i26 = i44 | i25;
        }
        i27 = i16 & 128;
        if (i27 != 0) {
            i29 = i26 | 12582912;
            z25 = z18;
        } else {
            z25 = z18;
            if (o0VarE.h(z25)) {
                i28 = 8388608;
            } else {
                i28 = 4194304;
            }
            i29 = i26 | i28;
        }
        if (o0VarE.r(pVar)) {
            i30 = 67108864;
        } else {
            i30 = 33554432;
        }
        i34 = i29 | i30;
        if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
            if (o0VarE.r(aVar)) {
                i39 = 536870912;
            } else {
                i39 = 268435456;
            }
            i34 |= i39;
        }
        if ((i15 & 6) == 0) {
            if (o0VarE.r(aVar2)) {
                i38 = 4;
            } else {
                i38 = 2;
            }
            i35 = i15 | i38;
        } else {
            i35 = i15;
        }
        if ((i15 & 48) == 0) {
            if (o0VarE.r(pVar2)) {
                i37 = 32;
            } else {
                i37 = 16;
            }
            i35 |= i37;
        }
        if ((i15 & 384) != 0) {
            if (o0VarE.r(pVar3)) {
                i36 = 256;
            } else {
                i36 = 128;
            }
            i35 |= i36;
        }
        int i47 = i35;
        if ((i34 & 306783379) == 306783378) {
            z26 = true;
        } else {
            z26 = true;
        }
        if (o0VarE.n(i34 & 1, z26)) {
            if (i45 != 0) {
                z34 = false;
            } else {
                z34 = z19;
            }
            if (i18 != 0) {
                z35 = true;
            } else {
                z35 = z16;
            }
            if (i24 != 0) {
                z36 = false;
            } else {
                z36 = z24;
            }
            if (i27 != 0) {
                z37 = false;
            } else {
                z37 = z25;
            }
            x1 x1Var2 = n.f135158a;
            objQ = o0VarE.q();
            m.f135153a.getClass();
            c2565a = m.a.f135155b;
            if (objQ == c2565a) {
                objQ = l0.j(t13.h.f161748a, o0VarE);
                o0VarE.K(objQ);
            }
            b0Var = (o53.b0) objQ;
            r rVarF2 = x2.f(r.S, 1.0f);
            d92.b.f58623a.getClass();
            j92.b bVar3 = d92.b.f58625c;
            bVar3.getClass();
            r rVarA2 = c2.l.A(rVarF2, j92.b.f97899b.f97920e, 0.0f, 2);
            bVar3.getClass();
            r rVarB2 = l4.k.b(rVarA2, k2.i.a(j92.b.f97900c.f97911c));
            h4.d.f81522a.getClass();
            z0VarD = q.d(h4.d.a.f81524b, false);
            z38 = z34;
            iHashCode = Long.hashCode(o0VarE.U);
            i2VarA0 = o0VarE.a0();
            rVarC = h4.k.c(rVarB2, o0VarE);
            h5.g.V.getClass();
            aVar3 = h5.g.a.f81805b;
            if (o0VarE.f135177b != null) {
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
            bVar = h5.g.a.f81813j;
            if (o0VarE.T) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            } else {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            u uVar2 = u.f22885a;
            Set setB2 = a1.b(new c92.b.a(c92.a.DELETE, gl1.y.Q(o0VarE, R.string.lbl_remove)));
            if (z38) {
                z39 = false;
            } else {
                z39 = false;
            }
            objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = new p1(6);
                o0VarE.K(objQ2);
            }
            z19 = z38;
            boolean z46 = z36;
            boolean z47 = z37;
            l2.a(setB2, b0Var, z39, null, (e23.a) objQ2, z3.f.c(176135427, new f(rVar, dVar, dVar2, z14, z38, z36, z37, pVar, aVar, aVar2, pVar3), o0VarE), z3.f.c(376366690, new ng2.i(dVar, 28, pVar2, dVar2), o0VarE), o0VarE, 1794048, 8);
            o0Var = o0VarE;
            o0Var.g0(true);
            z27 = z35;
            z24 = z46;
            z28 = z47;
        } else {
            o0Var = o0VarE;
            o0Var.e();
            z27 = z16;
            z28 = z25;
        }
        z29 = z19;
        p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new p() { // from class: u91.g
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iT = p0.t(i14 | 1);
                    int iT2 = p0.t(i15);
                    h.b(rVar, dVar, dVar2, z14, z29, z27, z24, z28, pVar, aVar, aVar2, pVar2, pVar3, (m) obj, iT, iT2, i16);
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
