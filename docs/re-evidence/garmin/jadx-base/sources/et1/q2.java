package et1;

import c2.s2;
import c2.u2;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.C;
import com.google.common.base.Ascii;
import i3.e9;
import i3.fe;
import i3.mc;
import i3.p7;
import i3.pc;
import java.util.List;
import p005kotlin.Unit;
import p3.b4;
import p3.y3;

/* JADX INFO: loaded from: classes10.dex */
public final class q2 {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f65793a;

        static {
            int[] iArr = new int[pc.values().length];
            try {
                iArr[pc.Hidden.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f65793a = iArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0110  */
    /* JADX WARN: Code duplicated, block: B:41:0x0117  */
    /* JADX WARN: Code duplicated, block: B:42:0x011b  */
    /* JADX WARN: Code duplicated, block: B:47:0x0136  */
    /* JADX WARN: Code duplicated, block: B:50:0x0191  */
    /* JADX WARN: Code duplicated, block: B:52:0x01c9  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(h4.r rVar, us1.o oVar, List list, p3.p1 p1Var, e23.l lVar, p3.m mVar, int i14) {
        Throwable th3;
        h5.g.a.f fVar;
        h4.r.a aVar;
        s2 s2VarA;
        int iHashCode;
        p3.i2 i2VarA0;
        h4.r rVarC;
        Object objQ;
        oVar.getClass();
        list.getClass();
        p1Var.getClass();
        lVar.getClass();
        p3.o0 o0VarE = mVar.E(1314401678);
        p3.c<?> cVar = o0VarE.f135177b;
        int i15 = i14 | (o0VarE.B(rVar) ? 4 : 2) | (o0VarE.k(oVar.ordinal()) ? 32 : 16) | (o0VarE.r(list) ? 256 : 128) | (o0VarE.r(lVar) ? 16384 : 8192);
        if (o0VarE.n(i15 & 1, (i15 & 9363) != 9362)) {
            p3.x1 x1Var = p3.n.f135158a;
            h4.d.f81522a.getClass();
            f5.z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
            int iHashCode2 = Long.hashCode(o0VarE.U);
            p3.i2 i2VarA1 = o0VarE.a0();
            h4.r rVarC2 = h4.k.c(rVar, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar2 = h5.g.a.f81805b;
            if (cVar == null) {
                p3.p0.l();
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
            b4.c(c1623g, i2VarA1, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T) {
                th3 = null;
            } else {
                th3 = null;
                if (!p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                }
                fVar = h5.g.a.f81807d;
                b4.c(fVar, rVarC2, o0VarE);
                c2.u uVar = c2.u.f22885a;
                aVar = h4.r.S;
                h4.r rVarC3 = uVar.c(aVar, h4.d.a.f81529g);
                d92.b.f58623a.getClass();
                j92.b bVar2 = d92.b.f58625c;
                bVar2.getClass();
                j92.e eVar2 = j92.b.f97899b;
                float f14 = eVar2.f97920e;
                bVar2.getClass();
                float f15 = eVar2.f97920e;
                bVar2.getClass();
                h4.r rVarC4 = c2.l.C(rVarC3, f14, eVar2.f97918c, f15, 0.0f, 8);
                c2.j.f22691a.getClass();
                s2VarA = c2.q2.a(c2.j.f22692b, h4.d.a.f81533k, o0VarE, 0);
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = h4.k.c(rVarC4, o0VarE);
                if (cVar != null) {
                    p3.p0.l();
                    throw th3;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar2);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar, s2VarA, o0VarE);
                b4.c(c1623g, i2VarA0, o0VarE);
                if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                }
                b4.c(fVar, rVarC, o0VarE);
                u2 u2Var = u2.f22900a;
                y3 y3Var = p7.f89282d;
                g6.f.f75994b.getClass();
                p3.v.a(y3Var.c(g6.f.a(g6.f.f75996d)), z3.f.c(-1786322652, new d81.h(24, p1Var, oVar), o0VarE), o0VarE, 56);
                o0VarE.g0(true);
                h4.r rVarE = u1.n.e(aVar, d92.b.a(o0VarE).c().g(), o4.m1.f128891a);
                boolean zBooleanValue = ((Boolean) p1Var.getF182175a()).booleanValue();
                objQ = o0VarE.q();
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new a2(p1Var, 0);
                    o0VarE.K(objQ);
                }
                i3.u.a(zBooleanValue, (e23.a) objQ, rVarE, 0L, null, null, null, 0L, 0.0f, 0.0f, z3.f.c(-857621821, new a42.y(list, lVar, p1Var, (Object) oVar, 24), o0VarE), o0VarE, 0, 48, 2040);
                o0VarE.g0(true);
            }
            v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
            fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC2, o0VarE);
            c2.u uVar2 = c2.u.f22885a;
            aVar = h4.r.S;
            h4.r rVarC5 = uVar2.c(aVar, h4.d.a.f81529g);
            d92.b.f58623a.getClass();
            j92.b bVar3 = d92.b.f58625c;
            bVar3.getClass();
            j92.e eVar3 = j92.b.f97899b;
            float f16 = eVar3.f97920e;
            bVar3.getClass();
            float f17 = eVar3.f97920e;
            bVar3.getClass();
            h4.r rVarC6 = c2.l.C(rVarC5, f16, eVar3.f97918c, f17, 0.0f, 8);
            c2.j.f22691a.getClass();
            s2VarA = c2.q2.a(c2.j.f22692b, h4.d.a.f81533k, o0VarE, 0);
            iHashCode = Long.hashCode(o0VarE.U);
            i2VarA0 = o0VarE.a0();
            rVarC = h4.k.c(rVarC6, o0VarE);
            if (cVar != null) {
                p3.p0.l();
                throw th3;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            b4.c(eVar, s2VarA, o0VarE);
            b4.c(c1623g, i2VarA0, o0VarE);
            if (o0VarE.T) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            } else {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(fVar, rVarC, o0VarE);
            u2 u2Var2 = u2.f22900a;
            y3 y3Var2 = p7.f89282d;
            g6.f.f75994b.getClass();
            p3.v.a(y3Var2.c(g6.f.a(g6.f.f75996d)), z3.f.c(-1786322652, new d81.h(24, p1Var, oVar), o0VarE), o0VarE, 56);
            o0VarE.g0(true);
            h4.r rVarE2 = u1.n.e(aVar, d92.b.a(o0VarE).c().g(), o4.m1.f128891a);
            boolean zBooleanValue2 = ((Boolean) p1Var.getF182175a()).booleanValue();
            objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            if (objQ == p3.m.a.f135155b) {
                objQ = new a2(p1Var, 0);
                o0VarE.K(objQ);
            }
            i3.u.a(zBooleanValue2, (e23.a) objQ, rVarE2, 0L, null, null, null, 0L, 0.0f, 0.0f, z3.f.c(-857621821, new a42.y(list, lVar, p1Var, (Object) oVar, 24), o0VarE), o0VarE, 0, 48, 2040);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new et.p(rVar, oVar, list, p1Var, lVar, i14, 3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r29v3 */
    /* JADX WARN: Type inference failed for: r29v4 */
    /* JADX WARN: Type inference failed for: r29v8 */
    /* JADX WARN: Type inference failed for: r2v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r4v14, types: [p3.m, p3.o0] */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v4, types: [p3.o0] */
    /* JADX WARN: Type inference failed for: r5v31 */
    /* JADX WARN: Type inference failed for: r5v32, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v33 */
    public static final void b(final pt1.a0 a0Var, final pt1.l lVar, final fe feVar, final e23.l lVar2, final e23.q qVar, final e23.p pVar, final e23.l lVar3, final e23.l lVar4, final e23.l lVar5, final e23.l lVar6, final e23.l lVar7, final e23.l lVar8, final e23.l lVar9, final e23.p pVar2, final e23.l lVar10, final e23.l lVar11, final e23.a aVar, final e23.a aVar2, e23.a aVar3, final e23.a aVar4, final e23.a aVar5, e23.a aVar6, e23.a aVar7, e23.a aVar8, p3.m mVar, int i14) {
        int i15;
        ?? r14;
        Object obj;
        int i16;
        Object obj2;
        mc mcVar;
        p3.m.a.C2565a c2565a;
        int i17;
        int i18;
        Object obj3;
        pt1.z zVar;
        int i19;
        p3.m.a.C2565a c2565a2;
        ?? r15;
        Object obj4;
        Object obj5;
        Object obj6;
        pt1.e eVar;
        int i24;
        e23.a aVar9 = aVar6;
        e23.a aVar10 = aVar7;
        e23.a aVar11 = aVar8;
        a0Var.getClass();
        pt1.n nVar = a0Var.f140809g;
        lVar.getClass();
        lVar2.getClass();
        qVar.getClass();
        pVar.getClass();
        lVar3.getClass();
        lVar4.getClass();
        lVar5.getClass();
        lVar6.getClass();
        lVar7.getClass();
        lVar8.getClass();
        lVar9.getClass();
        pVar2.getClass();
        lVar10.getClass();
        lVar11.getClass();
        aVar.getClass();
        aVar2.getClass();
        aVar3.getClass();
        aVar4.getClass();
        aVar5.getClass();
        aVar9.getClass();
        aVar10.getClass();
        aVar11.getClass();
        p3.o0 o0VarE = mVar.E(802748906);
        if ((i14 & 6) == 0) {
            i15 = ((i14 & 8) == 0 ? o0VarE.B(a0Var) : o0VarE.r(a0Var) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= (i14 & 64) == 0 ? o0VarE.B(lVar) : o0VarE.r(lVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.B(feVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.r(lVar2) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.r(qVar) ? 16384 : 8192;
        }
        int i25 = i14 & 196608;
        char c14 = Ascii.MIN;
        if (i25 == 0) {
            i15 |= o0VarE.r(pVar) ? 131072 : 65536;
        }
        int i26 = i14 & 1572864;
        char c15 = Ascii.MIN;
        if (i26 == 0) {
            i15 |= o0VarE.r(lVar3) ? 1048576 : 524288;
        }
        int i27 = i14 & 12582912;
        char c16 = Ascii.MIN;
        if (i27 == 0) {
            i15 |= o0VarE.r(lVar4) ? 8388608 : 4194304;
        }
        int i28 = i14 & 100663296;
        char c17 = Ascii.MIN;
        if (i28 == 0) {
            i15 |= o0VarE.r(lVar5) ? 67108864 : 33554432;
        }
        int i29 = i14 & C.ENCODING_PCM_32BIT;
        char c18 = Ascii.MIN;
        if (i29 == 0) {
            i15 |= o0VarE.r(lVar6) ? 536870912 : 268435456;
        }
        int i30 = (o0VarE.r(lVar7) ? (char) 4 : (char) 2) | (o0VarE.r(lVar8) ? ' ' : (char) 16) | (o0VarE.r(lVar9) ? 256 : 128) | (o0VarE.r(pVar2) ? 2048 : 1024) | (o0VarE.r(lVar10) ? (char) 16384 : (char) 8192);
        if (o0VarE.r(lVar11)) {
            c14 = 0;
        }
        int i34 = i30 | c14;
        if (o0VarE.r(aVar)) {
            c15 = 0;
        }
        int i35 = i34 | c15;
        if (o0VarE.r(aVar2)) {
            c16 = 0;
        }
        int i36 = i35 | c16;
        if (o0VarE.r(aVar3)) {
            c17 = Ascii.MIN;
        }
        int i37 = i36 | c17;
        if (o0VarE.r(aVar4)) {
            c18 = Ascii.MIN;
        }
        int i38 = i37 | c18;
        int i39 = (o0VarE.r(aVar5) ? (char) 4 : (char) 2) | (o0VarE.r(aVar9) ? ' ' : (char) 16) | (o0VarE.r(aVar10) ? 256 : 128) | (o0VarE.r(aVar11) ? (char) 2048 : (char) 1024);
        int i44 = i15;
        if (o0VarE.n(i44 & 1, ((i44 & 306783379) == 306783378 && (i38 & 306783379) == 306783378 && (i39 & 1171) == 1170) ? false : true)) {
            p3.x1 x1Var = p3.n.f135158a;
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a3 = p3.m.a.f135155b;
            if (objQ == c2565a3) {
                obj = objQ;
                p3.c2 c2VarN = p3.p0.n(Boolean.FALSE);
                o0VarE.K(c2VarN);
                obj = c2VarN;
            }
            obj = objQ;
            final p3.p1 p1Var = (p3.p1) obj;
            Object objQ2 = o0VarE.q();
            Object obj7 = objQ2;
            if (objQ2 == c2565a3) {
                p3.c2 c2VarN2 = p3.p0.n(a0Var.f140807e);
                o0VarE.K(c2VarN2);
                obj7 = c2VarN2;
            }
            final p3.p1 p1Var2 = (p3.p1) obj7;
            Object[] objArr = new Object[0];
            int i45 = i44 & 14;
            boolean z14 = i45 == 4 || ((i44 & 8) != 0 && o0VarE.r(a0Var));
            Object objQ3 = o0VarE.q();
            Object obj8 = objQ3;
            if (z14 || objQ3 == c2565a3) {
                e40.d dVar = new e40.d(a0Var, 9);
                o0VarE.K(dVar);
                obj8 = dVar;
            }
            final p3.p1 p1Var3 = (p3.p1) d4.a.e(objArr, (e23.a) obj8, o0VarE, 0);
            p3.p1 p1VarQ = p3.p0.q(nVar, o0VarE);
            final u1.d2 d2VarA = u1.a2.a(o0VarE);
            final int i46 = -((int) w02.b0.g(gl.b.q(o0VarE, R.dimen.review_sort_header_max_height), o0VarE));
            boolean zB = o0VarE.B(p1VarQ);
            Object objQ4 = o0VarE.q();
            if (zB || objQ4 == c2565a3) {
                i16 = 0;
                b2 b2Var = new b2(p1VarQ, 0);
                o0VarE.K(b2Var);
                obj2 = b2Var;
            } else {
                i16 = 0;
                obj2 = objQ4;
            }
            mc mcVarF = e9.f(true, (e23.l) obj2, o0VarE, 6, i16);
            final m3.s sVarE = m3.l.e(o0VarE);
            boolean zB2 = (i45 == 4 || ((i44 & 8) != 0 && o0VarE.r(a0Var))) | o0VarE.B(mcVarF) | ((i38 & 234881024) == 67108864) | o0VarE.B(p1Var3);
            Object objQ5 = o0VarE.q();
            if (zB2 || objQ5 == c2565a3) {
                mcVar = mcVarF;
                c2565a = c2565a3;
                i17 = 536870912;
                g2 g2Var = new g2(a0Var, mcVar, aVar3, p1Var3, null);
                o0VarE.K(g2Var);
                objQ5 = g2Var;
            } else {
                c2565a = c2565a3;
                i17 = 536870912;
                mcVar = mcVarF;
            }
            p3.l0.e((e23.p) objQ5, nVar, o0VarE);
            boolean zB3 = o0VarE.B(mcVar) | ((i38 & 1879048192) == i17);
            Object objQ6 = o0VarE.q();
            if (zB3 || objQ6 == c2565a) {
                i18 = 1;
                c0 c0Var = new c0(mcVar, aVar4, 1);
                o0VarE.K(c0Var);
                obj3 = c0Var;
            } else {
                i18 = 1;
                obj3 = objQ6;
            }
            c.w.a(0, i18, (e23.a) obj3, o0VarE, false);
            boolean z15 = a0Var.f140804b;
            if (!z15 || (eVar = a0Var.f140811i) == null || (i24 = eVar.f140840b) <= 0 || eVar.f140839a >= i24) {
                zVar = z15 ? pt1.z.INDETERMINATE : pt1.z.NONE;
            } else {
                zVar = pt1.z.DETERMINATE;
            }
            int i47 = (zVar != pt1.z.INDETERMINATE || mcVar.e()) ? 0 : i18;
            final mc mcVar2 = mcVar;
            p3.m.a.C2565a c2565a4 = c2565a;
            int i48 = i18;
            e23.p pVar3 = new e23.p() { // from class: et1.c2
                @Override // e23.p
                public final Object invoke(Object obj9, Object obj10) {
                    pt1.z zVar2;
                    int i49;
                    p3.m mVar2 = (p3.m) obj9;
                    int iIntValue = ((Integer) obj10).intValue();
                    if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                        p3.x1 x1Var2 = p3.n.f135158a;
                        final pt1.a0 a0Var2 = a0Var;
                        boolean z16 = a0Var2.f140804b;
                        pt1.e eVar2 = a0Var2.f140811i;
                        if (!z16 || eVar2 == null || (i49 = eVar2.f140840b) <= 0 || eVar2.f140839a >= i49) {
                            zVar2 = z16 ? pt1.z.INDETERMINATE : pt1.z.NONE;
                        } else {
                            zVar2 = pt1.z.DETERMINATE;
                        }
                        boolean z17 = zVar2 == pt1.z.DETERMINATE;
                        int i54 = eVar2 != null ? eVar2.f140839a : 0;
                        int i55 = eVar2 != null ? eVar2.f140840b : 1;
                        final pt1.l lVar12 = lVar;
                        final e23.l lVar13 = lVar7;
                        final e23.a aVar12 = aVar4;
                        final fe feVar2 = feVar;
                        final m3.r rVar = sVarE;
                        final e23.a aVar13 = aVar;
                        final u1.d2 d2Var = d2VarA;
                        final e23.l lVar14 = lVar2;
                        final e23.q qVar2 = qVar;
                        boolean z18 = z17;
                        final e23.p pVar4 = pVar;
                        final e23.l lVar15 = lVar4;
                        final e23.l lVar16 = lVar3;
                        final e23.l lVar17 = lVar6;
                        final e23.l lVar18 = lVar5;
                        final int i56 = i46;
                        final mc mcVar3 = mcVar2;
                        final p3.p1 p1Var4 = p1Var;
                        final p3.p1 p1Var5 = p1Var2;
                        final e23.l lVar19 = lVar8;
                        final e23.l lVar20 = lVar9;
                        final e23.p pVar5 = pVar2;
                        final e23.l lVar21 = lVar10;
                        final e23.l lVar22 = lVar11;
                        final e23.a aVar14 = aVar2;
                        final p3.p1 p1Var6 = p1Var3;
                        y1.a(z18, i54, i55, aVar5, z3.f.c(-280192989, new e23.p() { // from class: et1.e2
                            /* JADX WARN: Code duplicated, block: B:12:0x00c7  */
                            @Override // e23.p
                            public final Object invoke(Object obj11, Object obj12) {
                                p3.m mVar3 = (p3.m) obj11;
                                int iIntValue2 = ((Integer) obj12).intValue();
                                if (mVar3.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                    p3.x1 x1Var3 = p3.n.f135158a;
                                    z3.e eVarC = z3.f.c(1624179070, new cq0.p(aVar12, 15), mVar3);
                                    fe feVar3 = feVar2;
                                    z3.e eVarC2 = z3.f.c(2102151389, new ak0.o(feVar3, 12), mVar3);
                                    pt1.a0 a0Var3 = a0Var2;
                                    m3.r rVar2 = rVar;
                                    e23.a aVar15 = aVar13;
                                    u1.d2 d2Var2 = d2Var;
                                    e23.l lVar23 = lVar14;
                                    e23.q qVar3 = qVar2;
                                    e23.p pVar6 = pVar4;
                                    e23.l lVar24 = lVar15;
                                    e23.l lVar25 = lVar16;
                                    e23.l lVar26 = lVar17;
                                    e23.l lVar27 = lVar18;
                                    int i57 = i56;
                                    mc mcVar4 = mcVar3;
                                    e23.l lVar28 = lVar13;
                                    p3.p1 p1Var7 = p1Var4;
                                    p3.p1 p1Var8 = p1Var5;
                                    pt1.l lVar29 = lVar12;
                                    z02.d.a(false, eVarC, eVarC2, null, null, z3.f.c(-758898950, new d2(a0Var3, rVar2, aVar15, d2Var2, lVar23, qVar3, pVar6, lVar24, lVar25, lVar26, lVar27, i57, mcVar4, lVar28, p1Var7, p1Var8, feVar3, lVar29, lVar19, lVar20, pVar5, lVar21, lVar22, aVar14, p1Var6), mVar3), mVar3, 197040, 25);
                                    boolean zR = mVar3.r(lVar29) | mVar3.B(lVar28);
                                    Object objQ7 = mVar3.q();
                                    if (zR) {
                                        objQ7 = new l2(lVar29, lVar28, null);
                                        mVar3.K(objQ7);
                                    } else {
                                        p3.m.f135153a.getClass();
                                        if (objQ7 == p3.m.a.f135155b) {
                                            objQ7 = new l2(lVar29, lVar28, null);
                                            mVar3.K(objQ7);
                                        }
                                    }
                                    p3.l0.e((e23.p) objQ7, lVar29, mVar3);
                                } else {
                                    mVar3.e();
                                }
                                return Unit.INSTANCE;
                            }
                        }, mVar2), mVar2, 24576);
                    } else {
                        mVar2.e();
                    }
                    return Unit.INSTANCE;
                }
            };
            ?? r16 = o0VarE;
            g02.s0.a(null, i47, z3.f.c(-948983244, pVar3, r16), r16, 384, 1);
            if (a0Var.f140812j) {
                r16.C(326681336);
                i19 = i39;
                boolean z16 = (i19 & 112) == 32 ? i48 == true ? 1 : 0 : false;
                Object objQ7 = r16.q();
                if (z16) {
                    c2565a2 = c2565a4;
                } else {
                    c2565a2 = c2565a4;
                    if (objQ7 != c2565a2) {
                        aVar9 = aVar6;
                        obj6 = objQ7;
                    }
                    r15 = 0;
                    o53.f0.i((e23.a) obj6, r16, 0);
                    r16.g0(false);
                }
                aVar9 = aVar6;
                e52.c cVar = new e52.c(aVar9, 26);
                r16.K(cVar);
                obj6 = cVar;
                r15 = 0;
                o53.f0.i((e23.a) obj6, r16, 0);
                r16.g0(false);
            } else {
                aVar9 = aVar6;
                i19 = i39;
                c2565a2 = c2565a4;
                r15 = 0;
                r16.C(326773592);
                r16.g0(false);
            }
            if (a0Var.f140813k) {
                r16.C(326836212);
                ?? r17 = (i19 & 896) == 256 ? i48 == true ? 1 : 0 : r15;
                Object objQ8 = r16.q();
                if (r17 != 0 || objQ8 == c2565a2) {
                    aVar10 = aVar7;
                    e52.c cVar2 = new e52.c(aVar10, 27);
                    r16.K(cVar2);
                    obj4 = cVar2;
                } else {
                    aVar10 = aVar7;
                    obj4 = objQ8;
                }
                e23.a aVar12 = (e23.a) obj4;
                ?? r29 = i48;
                if ((i19 & 7168) != 2048) {
                    r29 = r15;
                }
                Object objQ9 = r16.q();
                if (r29 != 0 || objQ9 == c2565a2) {
                    aVar11 = aVar8;
                    e52.c cVar3 = new e52.c(aVar11, 28);
                    r16.K(cVar3);
                    obj5 = cVar3;
                } else {
                    aVar11 = aVar8;
                    obj5 = objQ9;
                }
                at1.i.a(aVar12, (e23.a) obj5, r16, r15);
                r16.g0(r15);
                r14 = r16;
            } else {
                aVar10 = aVar7;
                aVar11 = aVar8;
                r16.C(327055320);
                r16.g0(r15);
                r14 = r16;
            }
        } else {
            p3.o0 o0Var = o0VarE;
            o0Var.e();
            r14 = o0Var;
        }
        p3.p2 p2VarI0 = r14.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new d2(a0Var, lVar, feVar, lVar2, qVar, pVar, lVar3, lVar4, lVar5, lVar6, lVar7, lVar8, lVar9, pVar2, lVar10, lVar11, aVar, aVar2, aVar3, aVar4, aVar5, aVar9, aVar10, aVar11, i14);
        }
    }
}
