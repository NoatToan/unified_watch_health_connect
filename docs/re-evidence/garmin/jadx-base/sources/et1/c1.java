package et1;

import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import i3.mh;
import i3.p7;
import java.util.List;
import p005kotlin.Unit;
import p3.b4;
import p3.y3;

/* JADX INFO: loaded from: classes10.dex */
public final class c1 {
    /* JADX WARN: Code duplicated, block: B:59:0x0110  */
    public static final void a(h4.r rVar, pt1.p pVar, e23.l<? super Integer, Unit> lVar, e23.l<? super pt1.n, Unit> lVar2, p3.m mVar, int i14) {
        p3.o0 o0Var;
        boolean z14;
        rVar.getClass();
        pVar.getClass();
        lVar.getClass();
        lVar2.getClass();
        p3.o0 o0VarE = mVar.E(934291048);
        int i15 = (o0VarE.B(rVar) ? 4 : 2) | i14 | (o0VarE.B(pVar) ? 32 : 16);
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(lVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.r(lVar2) ? 2048 : 1024;
        }
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            p3.x1 x1Var = p3.n.f135158a;
            c2.j jVar = c2.j.f22691a;
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            float f14 = eVar.f97918c;
            jVar.getClass();
            c2.j.i iVarI = c2.j.i(f14);
            h4.d.f81522a.getClass();
            c2.z zVarA = c2.y.a(iVarI, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            p3.i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVar, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p3.p0.l();
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
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            h4.r.a aVar2 = h4.r.S;
            h4.r rVarF = x2.f(aVar2, 1.0f);
            boolean z15 = ((i15 & 112) == 32) | ((i15 & 896) == 256) | ((i15 & 7168) == 2048);
            Object objQ = o0VarE.q();
            if (z15) {
                z14 = true;
                objQ = new a1(lVar, pVar, lVar2, 1);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    z14 = true;
                    objQ = new a1(lVar, pVar, lVar2, 1);
                    o0VarE.K(objQ);
                } else {
                    z14 = true;
                }
            }
            jt1.l.a(rVarF, (e23.l) objQ, o0VarE, 6);
            String strQ = gl1.y.Q(o0VarE, R.string.trail_reviews_empty_state_title);
            j92.f fVar = d92.b.f58624b;
            fVar.getClass();
            s5.x0 x0Var = j92.f.f97930g;
            h4.g.a aVar3 = h4.d.a.f81537o;
            h4.r rVarB = b0Var.b(aVar2, aVar3);
            bVar.getClass();
            float f15 = eVar.f97920e;
            bVar.getClass();
            float f16 = eVar.f97920e;
            bVar.getClass();
            h4.r rVarC2 = c2.l.C(rVarB, f15, eVar.f97920e, f16, 0.0f, 8);
            d6.h.f57752b.getClass();
            int i16 = d6.h.f57755e;
            boolean z16 = z14;
            mh.c(strQ, rVarC2, 0L, null, 0L, null, 0L, d6.h.a(i16), 0L, 0, false, 0, 0, null, x0Var, o0VarE, 0, 0, 130044);
            String strQ2 = gl1.y.Q(o0VarE, R.string.trail_reviews_empty_state_message);
            fVar.getClass();
            s5.x0 x0Var2 = j92.f.f97932i;
            h4.r rVarB2 = b0Var.b(aVar2, aVar3);
            bVar.getClass();
            float f17 = eVar.f97920e;
            bVar.getClass();
            float f18 = eVar.f97920e;
            bVar.getClass();
            mh.c(strQ2, c2.l.C(rVarB2, f17, 0.0f, f18, eVar.f97920e, 2), 0L, null, 0L, null, 0L, d6.h.a(i16), 0L, 0, false, 0, 0, null, x0Var2, o0VarE, 0, 0, 130044);
            o0Var = o0VarE;
            o0Var.g0(z16);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p3.p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new com.google.maps.android.compose.u(rVar, pVar, lVar, lVar2, i14, 19);
        }
    }

    public static final void b(int i14, e23.a aVar, h4.r rVar, p3.m mVar) {
        int i15;
        rVar.getClass();
        aVar.getClass();
        p3.o0 o0VarE = mVar.E(-856755956);
        if ((i14 & 6) == 0) {
            i15 = i14 | (o0VarE.B(rVar) ? 4 : 2);
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(aVar) ? 32 : 16;
        }
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            p3.x1 x1Var = p3.n.f135158a;
            c2.j jVar = c2.j.f22691a;
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            float f14 = j92.b.f97899b.f97918c;
            jVar.getClass();
            c2.j.i iVarI = c2.j.i(f14);
            h4.d.f81522a.getClass();
            c2.z zVarA = c2.y.a(iVarI, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            p3.i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVar, o0VarE);
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
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            String strQ = gl1.y.Q(o0VarE, R.string.trail_reviews_loading_error_title);
            j92.f fVar = d92.b.f58624b;
            fVar.getClass();
            s5.x0 x0Var = j92.f.f97930g;
            h4.r.a aVar3 = h4.r.S;
            h4.g.a aVar4 = h4.d.a.f81537o;
            h4.r rVarB = b0Var.b(aVar3, aVar4);
            d6.h.f57752b.getClass();
            int i16 = d6.h.f57755e;
            mh.c(strQ, rVarB, 0L, null, 0L, null, 0L, d6.h.a(i16), 0L, 0, false, 0, 0, null, x0Var, o0VarE, 0, 0, 130044);
            String strQ2 = gl1.y.Q(o0VarE, R.string.trail_reviews_loading_error_message);
            fVar.getClass();
            mh.c(strQ2, b0Var.b(aVar3, aVar4), 0L, null, 0L, null, 0L, d6.h.a(i16), 0L, 0, false, 0, 0, null, j92.f.f97932i, o0VarE, 0, 0, 130044);
            o0VarE = o0VarE;
            l72.f0.f110999a.d((i15 << 9) & 57344, 9, aVar, b0Var.b(aVar3, aVar4), gl1.y.Q(o0VarE, R.string.common_retry), o0VarE, null, false);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ba2.g(rVar, aVar, i14, 2, (byte) 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void c(h4.r rVar, pt1.w wVar, i53.c<? extends us1.e> cVar, e23.l<? super us1.e, Unit> lVar, p3.m mVar, int i14) {
        e23.l<? super us1.e, Unit> lVar2;
        p3.o0 o0Var;
        p3.o0 o0VarE = mVar.E(1661070772);
        int i15 = (o0VarE.B(rVar) ? 4 : 2) | i14;
        if ((i14 & 48) == 0) {
            i15 |= (i14 & 64) == 0 ? o0VarE.B(wVar) : o0VarE.r(wVar) ? 32 : 16;
        }
        int i16 = i15 | (o0VarE.B(cVar) ? 256 : 128);
        if ((i14 & 3072) == 0) {
            lVar2 = lVar;
            i16 |= o0VarE.r(lVar2) ? 2048 : 1024;
        } else {
            lVar2 = lVar;
        }
        if (o0VarE.n(i16 & 1, (i16 & 1171) != 1170)) {
            p3.x1 x1Var = p3.n.f135158a;
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p3.p0.n(Boolean.FALSE);
                o0VarE.K(objQ);
            }
            p3.p1 p1Var = (p3.p1) objQ;
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            h4.r rVarC = c2.l.C(rVar, 0.0f, 0.0f, j92.b.f97899b.f97918c, 0.0f, 11);
            h4.d.f81522a.getClass();
            f5.z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
            int iHashCode = Long.hashCode(o0VarE.U);
            p3.i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC2 = h4.k.c(rVarC, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, z0VarD, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC2, o0VarE);
            c2.u uVar = c2.u.f22885a;
            y3 y3Var = p7.f89282d;
            g6.f.f75994b.getClass();
            p3.v.a(y3Var.c(g6.f.a(g6.f.f75996d)), z3.f.c(684127790, new d81.h(23, p1Var, wVar), o0VarE), o0VarE, 56);
            h4.r rVarE = u1.n.e(h4.r.S, d92.b.a(o0VarE).c().g(), o4.m1.f128891a);
            boolean zBooleanValue = ((Boolean) p1Var.getF182175a()).booleanValue();
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = new dv0.f(p1Var, 29);
                o0VarE.K(objQ2);
            }
            i3.u.a(zBooleanValue, (e23.a) objQ2, rVarE, 0L, null, null, null, 0L, 0.0f, 0.0f, z3.f.c(288744041, new a42.y((List) cVar, (e23.l) lVar2, p1Var, (Object) wVar, 23), o0VarE), o0VarE, 48, 48, 2040);
            o0Var = o0VarE;
            o0Var.g0(true);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p3.p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new com.google.maps.android.compose.u(rVar, wVar, cVar, lVar, i14, 18);
        }
    }

    /* JADX WARN: Code duplicated, block: B:120:0x01c6  */
    public static final void d(pt1.w wVar, final pt1.p pVar, final i53.c<? extends us1.e> cVar, final e23.l<? super us1.e, Unit> lVar, final e23.q<? super Integer, ? super List<kt1.b>, ? super Boolean, Unit> qVar, final e23.p<? super Long, ? super Boolean, Unit> pVar2, final e23.l<? super Long, Unit> lVar2, final e23.l<? super Long, Unit> lVar3, final e23.l<? super Long, Unit> lVar4, final e23.l<? super String, Unit> lVar5, final e23.l<? super Integer, Unit> lVar6, final e23.l<? super Long, Unit> lVar7, final e23.l<? super pt1.n, Unit> lVar8, p3.m mVar, final int i14, final int i15) {
        e23.q<? super Integer, ? super List<kt1.b>, ? super Boolean, Unit> qVar2;
        final pt1.w wVar2;
        e23.l<? super pt1.n, Unit> lVar9 = lVar8;
        p3.o0 o0VarE = mVar.E(-2108251794);
        int i16 = (o0VarE.B(wVar) ? 4 : 2) | i14 | (o0VarE.B(pVar) ? 32 : 16) | (o0VarE.B(cVar) ? 256 : 128);
        if ((i14 & 3072) == 0) {
            i16 |= o0VarE.r(lVar) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            qVar2 = qVar;
            i16 |= o0VarE.r(qVar2) ? 16384 : 8192;
        } else {
            qVar2 = qVar;
        }
        if ((i14 & 196608) == 0) {
            i16 |= o0VarE.r(pVar2) ? 131072 : 65536;
        }
        e23.l<? super Long, Unit> lVar10 = lVar2;
        if ((i14 & 1572864) == 0) {
            i16 |= o0VarE.r(lVar10) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((i14 & 12582912) == 0) {
            i16 |= o0VarE.r(lVar3) ? 8388608 : 4194304;
        }
        if ((i14 & 100663296) == 0) {
            i16 |= o0VarE.r(lVar4) ? 67108864 : 33554432;
        }
        if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
            i16 |= o0VarE.r(lVar5) ? 536870912 : 268435456;
        }
        int i17 = (i15 & 6) == 0 ? i15 | (o0VarE.r(lVar6) ? 4 : 2) : i15;
        if ((i15 & 48) == 0) {
            i17 |= o0VarE.r(lVar7) ? 32 : 16;
        }
        int i18 = i17 | (o0VarE.r(lVar9) ? 256 : 128);
        if (o0VarE.n(i16 & 1, ((i16 & 306783379) == 306783378 && (i18 & 147) == 146) ? false : true)) {
            p3.x1 x1Var = p3.n.f135158a;
            c2.j jVar = c2.j.f22691a;
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            float f14 = eVar.f97918c;
            jVar.getClass();
            c2.j.i iVarI = c2.j.i(f14);
            h4.r.a aVar = h4.r.S;
            h4.d.f81522a.getClass();
            c2.z zVarA = c2.y.a(iVarI, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            p3.i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(aVar, o0VarE);
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
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            h4.r rVarF = x2.f(aVar, 1.0f);
            boolean z14 = ((i18 & 14) == 4) | ((i16 & 112) == 32) | ((i18 & 896) == 256);
            Object objQ = o0VarE.q();
            if (z14) {
                objQ = new a1(lVar6, pVar, lVar9, 0);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new a1(lVar6, pVar, lVar9, 0);
                    o0VarE.K(objQ);
                }
            }
            jt1.l.a(rVarF, (e23.l) objQ, o0VarE, 6);
            h4.r rVarB = b0Var.b(aVar, h4.d.a.f81538p);
            bVar.getClass();
            int i19 = i16;
            wVar2 = wVar;
            c(c2.l.A(rVarB, eVar.f97920e, 0.0f, 2), wVar2, cVar, lVar, o0VarE, ((i16 << 3) & 112) | (i16 & 896) | (i16 & 7168));
            o0VarE.C(-694858455);
            List<pt1.x> list = wVar2.f141000d;
            if (list == null) {
                list = p13.j0.f134944a;
            }
            for (pt1.x xVar : list) {
                if (!xVar.f141023t || xVar.f141019p) {
                    o0VarE.C(-65650476);
                    int i24 = i19 >> 3;
                    jt1.k.e(xVar, pVar.f140931c.f140953a, true, qVar2, pVar2, lVar10, lVar3, lVar4, lVar5, null, lVar7, lVar9, o0VarE, (i24 & 7168) | 384 | (57344 & i24) | (458752 & i24) | (3670016 & i24) | (29360128 & i24) | (i24 & 234881024), (i18 >> 3) & 126, 512);
                    o0VarE.g0(false);
                    qVar2 = qVar;
                    lVar10 = lVar2;
                    lVar9 = lVar8;
                    i18 = i18;
                } else {
                    o0VarE.C(-64981186);
                    o0VarE.g0(false);
                }
            }
            o0VarE.g0(false);
            o0VarE.g0(true);
            p3.x1 x1Var2 = p3.n.f135158a;
        } else {
            wVar2 = wVar;
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e23.p() { // from class: et1.b1
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iT = p3.p0.t(i14 | 1);
                    int iT2 = p3.p0.t(i15);
                    c1.d(wVar2, pVar, cVar, lVar, qVar, pVar2, lVar2, lVar3, lVar4, lVar5, lVar6, lVar7, lVar8, (p3.m) obj, iT, iT2);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:104:0x0323  */
    /* JADX WARN: Code duplicated, block: B:107:0x0343  */
    /* JADX WARN: Code duplicated, block: B:108:0x0349  */
    /* JADX WARN: Code duplicated, block: B:111:0x0356  */
    /* JADX WARN: Code duplicated, block: B:112:0x0359  */
    /* JADX WARN: Code duplicated, block: B:115:0x0360  */
    /* JADX WARN: Code duplicated, block: B:116:0x0363  */
    /* JADX WARN: Code duplicated, block: B:119:0x036b  */
    /* JADX WARN: Code duplicated, block: B:120:0x036e  */
    /* JADX WARN: Code duplicated, block: B:123:0x0376  */
    /* JADX WARN: Code duplicated, block: B:124:0x0379  */
    /* JADX WARN: Code duplicated, block: B:127:0x0384  */
    /* JADX WARN: Code duplicated, block: B:130:0x038c  */
    /* JADX WARN: Code duplicated, block: B:131:0x0392  */
    /* JADX WARN: Code duplicated, block: B:134:0x03ac  */
    /* JADX WARN: Code duplicated, block: B:135:0x03ae  */
    /* JADX WARN: Code duplicated, block: B:138:0x03b5  */
    /* JADX WARN: Code duplicated, block: B:140:0x03bc  */
    /* JADX WARN: Code duplicated, block: B:99:0x02c6  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [l72.p2] */
    /* JADX WARN: Type inference failed for: r13v1, types: [p3.o0] */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v3, types: [p3.o0] */
    /* JADX WARN: Type inference failed for: r13v4, types: [p3.m, p3.o0] */
    /* JADX WARN: Type inference failed for: r13v6, types: [p3.o0] */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r16v7, types: [p3.m] */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r1v39 */
    /* JADX WARN: Type inference failed for: r3v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v16, types: [int] */
    /* JADX WARN: Type inference failed for: r3v22, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v38 */
    /* JADX WARN: Type inference failed for: r4v39 */
    /* JADX WARN: Type inference failed for: r4v40 */
    /* JADX WARN: Type inference failed for: r4v7, types: [p3.m, p3.o0] */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [boolean, int] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void e(pt1.w wVar, pt1.p pVar, e23.l lVar, e23.a aVar, e23.l lVar2, e23.q qVar, e23.p pVar2, e23.a aVar2, e23.l lVar3, e23.l lVar4, e23.l lVar5, e23.l lVar6, e23.l lVar7, e23.l lVar8, e23.l lVar9, p3.m mVar, int i14) {
        e23.l lVar10;
        pt1.w wVar2;
        ?? r14;
        c2.b0 b0Var;
        int i15;
        p3.o0 o0Var;
        ?? r15;
        h4.r.a aVar3;
        float f14;
        boolean z14;
        ?? r16;
        float f15;
        boolean z15;
        ?? r17;
        ?? r18;
        j92.b bVar;
        j92.e eVar;
        float f16;
        ?? r19;
        ?? r24;
        ?? r25;
        int i16;
        ?? r26;
        int i17;
        Object objQ;
        p3.m.a aVar4;
        ?? r27;
        Object objQ2;
        Object obj;
        boolean z16;
        p3.o0 o0Var2;
        wVar.getClass();
        boolean z17 = wVar.f141001e;
        boolean z18 = wVar.f140997a;
        boolean z19 = wVar.f140998b;
        pVar.getClass();
        lVar.getClass();
        aVar.getClass();
        lVar2.getClass();
        qVar.getClass();
        pVar2.getClass();
        aVar2.getClass();
        lVar3.getClass();
        lVar4.getClass();
        lVar5.getClass();
        lVar6.getClass();
        lVar7.getClass();
        lVar8.getClass();
        lVar9.getClass();
        p3.o0 o0VarE = mVar.E(667193346);
        int i18 = i14 | (o0VarE.B(wVar) ? 4 : 2) | (o0VarE.B(pVar) ? 32 : 16) | (o0VarE.r(lVar) ? 256 : 128) | (o0VarE.r(aVar) ? 2048 : 1024) | (o0VarE.r(lVar2) ? 16384 : 8192) | (o0VarE.r(qVar) ? 131072 : 65536) | (o0VarE.r(pVar2) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (o0VarE.r(aVar2) ? 8388608 : 4194304) | (o0VarE.r(lVar3) ? 67108864 : 33554432) | (o0VarE.r(lVar4) ? 536870912 : 268435456);
        int i19 = (o0VarE.r(lVar5) ? 4 : 2) | (o0VarE.r(lVar6) ? 32 : 16) | (o0VarE.r(lVar7) ? 256 : 128) | (o0VarE.r(lVar8) ? 2048 : 1024) | (o0VarE.r(lVar9) ? 16384 : 8192);
        if (o0VarE.n(i18 & 1, ((i18 & 306783379) == 306783378 && (i19 & 9363) == 9362) ? false : true)) {
            p3.x1 x1Var = p3.n.f135158a;
            h4.r.a aVar5 = h4.r.S;
            h4.r rVarE = u1.n.e(x2.f(aVar5, 1.0f), vb.h.f(d92.b.f58623a, o0VarE), o4.m1.f128891a);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            p3.i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarE, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar6 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar6);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.b0 b0Var2 = c2.b0.f22601a;
            i53.c<pt1.x> cVar = wVar.f141000d;
            if (cVar == null || !(!cVar.isEmpty())) {
                b0Var = b0Var2;
                i15 = i18;
                o0Var = o0VarE;
                r15 = 0;
                z16 = false;
                r15 = 0;
                wVar2 = wVar;
                if (wVar2.f141003g) {
                    o0Var.C(-729376766);
                    aVar3 = aVar5;
                    f14 = 1.0f;
                    h4.r rVarF = x2.f(aVar3, 1.0f);
                    d92.b.f58625c.getClass();
                    b((i15 >> 18) & 112, aVar2, c2.l.y(rVarF, j92.b.f97899b.f97920e), o0Var);
                    o0Var.g0(false);
                    o0Var2 = o0Var;
                } else {
                    aVar3 = aVar5;
                    f14 = 1.0f;
                    if (z19 || z18) {
                        z14 = true;
                        o0Var.C(-728624086);
                        o0Var.g0(false);
                        r16 = o0Var;
                    } else {
                        o0Var.C(-729029628);
                        h4.r rVarF2 = x2.f(aVar3, 1.0f);
                        d92.b.f58625c.getClass();
                        z14 = true;
                        a(c2.l.A(rVarF2, 0.0f, j92.b.f97899b.f97920e, 1), pVar, lVar3, lVar, o0Var, (i15 & 112) | ((i15 >> 18) & 896) | ((i15 << 3) & 7168));
                        o0Var.g0(false);
                    }
                }
                if (!z19 || z18) {
                    r16 = o0Var;
                    r16.C(-728538774);
                    l72.p2.f111205a.a(gl1.y.Q(r16, R.string.lbl_loading), r16, r15);
                    r16.g0(r15);
                } else {
                    r16.C(-728446518);
                    r16.g0(r15);
                }
                if (!z18 || z19 || z17) {
                    ?? r110 = r16;
                    ?? r28 = r15;
                    f15 = f14;
                    z15 = z14;
                    r110.C(-727853302);
                    r110.g0(r28);
                    r18 = r28;
                    r17 = r110;
                } else {
                    r16.C(-728311699);
                    h4.r rVarB = b0Var.b(x2.f(aVar3, f14), h4.d.a.f81537o);
                    a.f65277a.getClass();
                    z15 = z14;
                    ?? r111 = r16;
                    ?? r29 = r15;
                    f15 = f14;
                    i3.h1.c(aVar, rVarB, false, null, null, null, null, null, a.f65278b, r111, ((i15 >> 9) & 14) | C.ENCODING_PCM_32BIT, 508);
                    ?? r112 = r111;
                    r112.g0(r29);
                    r18 = r29;
                    r17 = r112;
                }
                h4.r rVarF3 = x2.f(aVar3, f15);
                bVar = d92.b.f58625c;
                bVar.getClass();
                eVar = j92.b.f97899b;
                float f17 = eVar.f97920e;
                if (z17) {
                    bVar.getClass();
                    f16 = eVar.f97920e;
                } else {
                    f16 = (float) r18;
                    g6.f.a aVar7 = g6.f.f75994b;
                }
                h4.r rVarZ = c2.l.z(rVarF3, f17, f16);
                if ((i15 & 112) == 32) {
                    r19 = z15;
                } else {
                    r19 = r18;
                }
                if ((i19 & 57344) == 16384) {
                    r24 = z15;
                } else {
                    r24 = r18;
                }
                int i24 = r24 | r19;
                if ((i15 & 234881024) == 67108864) {
                    r25 = z15;
                } else {
                    r25 = r18;
                }
                int i25 = (i24 == true ? 1 : 0) | r25;
                i16 = i15 & 896;
                if (i16 == 256) {
                    r26 = z15;
                } else {
                    r26 = r18;
                }
                i17 = (i25 == true ? 1 : 0) | r26;
                objQ = r17.q();
                aVar4 = p3.m.f135153a;
                if (i17 == 0) {
                    aVar4.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        x xVar = new x(pVar, lVar9, lVar3, lVar, 5);
                        lVar10 = lVar;
                        r17.K(xVar);
                        objQ = xVar;
                    } else {
                        lVar10 = lVar;
                    }
                } else {
                    x xVar2 = new x(pVar, lVar9, lVar3, lVar, 5);
                    lVar10 = lVar;
                    r17.K(xVar2);
                    objQ = xVar2;
                }
                e23.l lVar11 = (e23.l) objQ;
                if (i16 == 256) {
                    r27 = z15;
                } else {
                    r27 = r18;
                }
                objQ2 = r17.q();
                if (r27 == 0) {
                    aVar4.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        obj = objQ2;
                        e40.g gVar = new e40.g(lVar10, 17);
                        r17.K(gVar);
                        obj = gVar;
                    }
                } else {
                    obj = objQ2;
                    e40.g gVar2 = new e40.g(lVar10, 17);
                    r17.K(gVar2);
                    obj = gVar2;
                }
                obj = objQ2;
                jt1.n.a(rVarZ, lVar11, (e23.a) obj, r17, r18);
                r17.g0(z15);
                r14 = r17;
            } else {
                o0VarE.C(-730191756);
                int i26 = i18 >> 3;
                b0Var = b0Var2;
                i15 = i18;
                d(wVar, pVar, i53.a.e(us1.e.f172385f), lVar2, qVar, pVar2, lVar6, lVar4, lVar5, lVar8, lVar3, lVar7, lVar, o0VarE, (i18 & 126) | (i26 & 7168) | (i26 & 57344) | (i26 & 458752) | ((i19 << 15) & 3670016) | (29360128 & (i18 >> 6)) | ((i19 << 24) & 234881024) | ((i19 << 18) & 1879048192), ((i18 >> 24) & 14) | ((i19 >> 3) & 112) | (i18 & 896));
                wVar2 = wVar;
                p3.o0 o0Var3 = o0VarE;
                z16 = false;
                o0Var3.g0(false);
                aVar3 = aVar5;
                f14 = 1.0f;
                o0Var2 = o0Var3;
            }
            z14 = true;
            r16 = o0Var2;
            r15 = z16;
            if (z19) {
                r16 = o0Var;
                r16.C(-728538774);
                l72.p2.f111205a.a(gl1.y.Q(r16, R.string.lbl_loading), r16, r15);
                r16.g0(r15);
            } else {
                r16 = o0Var;
                r16.C(-728538774);
                l72.p2.f111205a.a(gl1.y.Q(r16, R.string.lbl_loading), r16, r15);
                r16.g0(r15);
            }
            if (z18) {
                ?? r113 = r16;
                ?? r210 = r15;
                f15 = f14;
                z15 = z14;
                r113.C(-727853302);
                r113.g0(r210);
                r18 = r210;
                r17 = r113;
            } else {
                ?? r114 = r16;
                ?? r211 = r15;
                f15 = f14;
                z15 = z14;
                r114.C(-727853302);
                r114.g0(r211);
                r18 = r211;
                r17 = r114;
            }
            h4.r rVarF4 = x2.f(aVar3, f15);
            bVar = d92.b.f58625c;
            bVar.getClass();
            eVar = j92.b.f97899b;
            float f18 = eVar.f97920e;
            if (z17) {
                bVar.getClass();
                f16 = eVar.f97920e;
            } else {
                f16 = (float) r18;
                g6.f.a aVar8 = g6.f.f75994b;
            }
            h4.r rVarZ2 = c2.l.z(rVarF4, f18, f16);
            if ((i15 & 112) == 32) {
                r19 = z15;
            } else {
                r19 = r18;
            }
            if ((i19 & 57344) == 16384) {
                r24 = z15;
            } else {
                r24 = r18;
            }
            int i27 = r24 | r19;
            if ((i15 & 234881024) == 67108864) {
                r25 = z15;
            } else {
                r25 = r18;
            }
            int i28 = (i27 == true ? 1 : 0) | r25;
            i16 = i15 & 896;
            if (i16 == 256) {
                r26 = z15;
            } else {
                r26 = r18;
            }
            i17 = (i28 == true ? 1 : 0) | r26;
            objQ = r17.q();
            aVar4 = p3.m.f135153a;
            if (i17 == 0) {
                aVar4.getClass();
                if (objQ == p3.m.a.f135155b) {
                    x xVar3 = new x(pVar, lVar9, lVar3, lVar, 5);
                    lVar10 = lVar;
                    r17.K(xVar3);
                    objQ = xVar3;
                } else {
                    lVar10 = lVar;
                }
            } else {
                x xVar4 = new x(pVar, lVar9, lVar3, lVar, 5);
                lVar10 = lVar;
                r17.K(xVar4);
                objQ = xVar4;
            }
            e23.l lVar12 = (e23.l) objQ;
            if (i16 == 256) {
                r27 = z15;
            } else {
                r27 = r18;
            }
            objQ2 = r17.q();
            if (r27 == 0) {
                aVar4.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    obj = objQ2;
                    e40.g gVar3 = new e40.g(lVar10, 17);
                    r17.K(gVar3);
                    obj = gVar3;
                }
            } else {
                obj = objQ2;
                e40.g gVar4 = new e40.g(lVar10, 17);
                r17.K(gVar4);
                obj = gVar4;
            }
            obj = objQ2;
            jt1.n.a(rVarZ2, lVar12, (e23.a) obj, r17, r18);
            r17.g0(z15);
            r14 = r17;
        } else {
            lVar10 = lVar;
            wVar2 = wVar;
            o0VarE.e();
            r14 = o0VarE;
        }
        p3.p2 p2VarI0 = r14.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new z0(wVar2, pVar, lVar10, aVar, lVar2, qVar, pVar2, aVar2, lVar3, lVar4, lVar5, lVar6, lVar7, lVar8, lVar9, i14);
        }
    }
}
