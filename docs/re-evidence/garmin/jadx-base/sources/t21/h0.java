package t21;

import c2.t2;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import i3.i7;
import i3.mh;
import kotlin.t1;
import p005kotlin.Unit;
import p3.p2;
import p3.x1;
import sk0.r1;
import v62.h7;

/* JADX INFO: loaded from: classes9.dex */
public final class h0 {
    /* JADX WARN: Code duplicated, block: B:32:0x0088  */
    /* JADX WARN: Code duplicated, block: B:49:0x00d6  */
    public static final void a(h4.r rVar, u21.i iVar, e23.l lVar, e23.p pVar, e23.a aVar, p3.m mVar, int i14) {
        h4.r rVar2;
        p3.o0 o0VarE = mVar.E(1272654942);
        int i15 = i14 | 6 | (o0VarE.r(iVar) ? 32 : 16) | (o0VarE.r(lVar) ? 256 : 128) | (o0VarE.r(pVar) ? 2048 : 1024) | (o0VarE.r(aVar) ? 16384 : 8192);
        if (o0VarE.n(i15 & 1, (i15 & 9363) != 9362)) {
            h4.r.a aVar2 = h4.r.S;
            x1 x1Var = p3.n.f135158a;
            float f69051c = ((g6.c) o0VarE.A(t1.f91490h)).getF69051c();
            l22.a aVarS = w2.a0.s(o0VarE);
            e2.i0 i0VarA = e2.k0.a(0, 0, 3, o0VarE);
            int i16 = i15 & 7168;
            boolean z14 = i16 == 2048;
            Object objQ = o0VarE.q();
            p3.m.a aVar3 = p3.m.f135153a;
            if (z14) {
                objQ = new g0(pVar, null);
                o0VarE.K(objQ);
            } else {
                aVar3.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new g0(pVar, null);
                    o0VarE.K(objQ);
                }
            }
            j02.h0 h0VarB = j02.d0.b(i0VarA, (e23.r) objQ, o0VarE);
            boolean zR = ((i15 & 896) == 256) | o0VarE.r(iVar) | o0VarE.r(aVarS) | o0VarE.B(h0VarB) | (i16 == 2048) | o0VarE.i(f69051c) | ((i15 & 57344) == 16384);
            Object objQ2 = o0VarE.q();
            if (zR) {
                m92.v vVar = new m92.v(iVar, aVarS, h0VarB, lVar, pVar, f69051c, aVar, 2);
                o0VarE.K(vVar);
                objQ2 = vVar;
            } else {
                aVar3.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    m92.v vVar2 = new m92.v(iVar, aVarS, h0VarB, lVar, pVar, f69051c, aVar, 2);
                    o0VarE.K(vVar2);
                    objQ2 = vVar2;
                }
            }
            rVar2 = aVar2;
            e2.c.b(rVar2, i0VarA, null, null, null, null, false, null, (e23.l) objQ2, o0VarE, 6, 508);
        } else {
            o0VarE.e();
            rVar2 = rVar;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new sg2.g((Object) rVar2, (Object) iVar, lVar, (o13.h) pVar, aVar, i14, 8);
        }
    }

    public static final void b(u21.i iVar, e23.l<? super s21.m.c, Unit> lVar, e23.p<? super Integer, ? super Integer, Unit> pVar, e23.a<Unit> aVar, e23.a<Unit> aVar2, e23.a<Unit> aVar3, e23.a<Unit> aVar4, e23.a<Unit> aVar5, e23.a<Unit> aVar6, p3.m mVar, int i14, int i15) {
        e23.l<? super s21.m.c, Unit> lVar2;
        int i16;
        e23.p<? super Integer, ? super Integer, Unit> pVar2;
        int i17;
        e23.a<Unit> aVar7;
        int i18;
        e23.a<Unit> aVar8;
        int i19;
        e23.a<Unit> aVar9;
        int i24;
        e23.a<Unit> aVar10;
        int i25;
        int i26;
        int i27;
        e23.a<Unit> aVar11;
        e23.p<? super Integer, ? super Integer, Unit> pVar3;
        e23.a<Unit> aVar12;
        e23.a<Unit> aVar13;
        e23.l<? super s21.m.c, Unit> lVar3;
        e23.a<Unit> aVar14;
        e23.a<Unit> aVar15;
        e23.a<Unit> aVar16;
        e23.a<Unit> aVar17;
        iVar.getClass();
        p3.o0 o0VarE = mVar.E(1740612105);
        int i28 = i14 | (o0VarE.r(iVar) ? 4 : 2);
        int i29 = i15 & 2;
        if (i29 != 0) {
            i16 = i28 | 48;
            lVar2 = lVar;
        } else {
            lVar2 = lVar;
            i16 = i28 | (o0VarE.r(lVar2) ? 32 : 16);
        }
        int i30 = i15 & 4;
        if (i30 != 0) {
            i17 = i16 | 384;
            pVar2 = pVar;
        } else {
            pVar2 = pVar;
            i17 = i16 | (o0VarE.r(pVar2) ? 256 : 128);
        }
        int i34 = i15 & 8;
        if (i34 != 0) {
            i18 = i17 | 3072;
            aVar7 = aVar;
        } else {
            aVar7 = aVar;
            i18 = i17 | (o0VarE.r(aVar7) ? 2048 : 1024);
        }
        int i35 = i15 & 16;
        if (i35 != 0) {
            i19 = i18 | 24576;
            aVar8 = aVar2;
        } else {
            aVar8 = aVar2;
            i19 = i18 | (o0VarE.r(aVar8) ? 16384 : 8192);
        }
        int i36 = i15 & 32;
        if (i36 != 0) {
            i24 = i19 | 196608;
            aVar9 = aVar3;
        } else {
            aVar9 = aVar3;
            i24 = i19 | (o0VarE.r(aVar9) ? 131072 : 65536);
        }
        int i37 = i15 & 64;
        if (i37 != 0) {
            i25 = i24 | 1572864;
            aVar10 = aVar4;
        } else {
            aVar10 = aVar4;
            i25 = i24 | (o0VarE.r(aVar10) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288);
        }
        int i38 = i15 & 128;
        if (i38 != 0) {
            i26 = i25 | 12582912;
        } else {
            i26 = i25 | (o0VarE.r(aVar5) ? 8388608 : 4194304);
        }
        int i39 = i15 & 256;
        if (i39 != 0) {
            i27 = i26 | 100663296;
        } else {
            i27 = i26 | (o0VarE.r(aVar6) ? 67108864 : 33554432);
        }
        if (o0VarE.n(i27 & 1, (i27 & 38347923) != 38347922)) {
            p3.m.a aVar18 = p3.m.f135153a;
            if (i29 != 0) {
                Object objQ = o0VarE.q();
                aVar18.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new r1(28);
                    o0VarE.K(objQ);
                }
                lVar2 = (e23.l) objQ;
            }
            if (i30 != 0) {
                Object objQ2 = o0VarE.q();
                aVar18.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new c((byte) 0, 8);
                    o0VarE.K(objQ2);
                }
                pVar2 = (e23.p) objQ2;
            }
            if (i34 != 0) {
                Object objQ3 = o0VarE.q();
                aVar18.getClass();
                if (objQ3 == p3.m.a.f135155b) {
                    objQ3 = new f(2);
                    o0VarE.K(objQ3);
                }
                aVar7 = (e23.a) objQ3;
            }
            if (i35 != 0) {
                Object objQ4 = o0VarE.q();
                aVar18.getClass();
                if (objQ4 == p3.m.a.f135155b) {
                    objQ4 = new f(3);
                    o0VarE.K(objQ4);
                }
                aVar8 = (e23.a) objQ4;
            }
            if (i36 != 0) {
                Object objQ5 = o0VarE.q();
                aVar18.getClass();
                if (objQ5 == p3.m.a.f135155b) {
                    objQ5 = new f(4);
                    o0VarE.K(objQ5);
                }
                aVar9 = (e23.a) objQ5;
            }
            if (i37 != 0) {
                Object objQ6 = o0VarE.q();
                aVar18.getClass();
                if (objQ6 == p3.m.a.f135155b) {
                    objQ6 = new f(5);
                    o0VarE.K(objQ6);
                }
                aVar10 = (e23.a) objQ6;
            }
            if (i38 != 0) {
                Object objQ7 = o0VarE.q();
                aVar18.getClass();
                if (objQ7 == p3.m.a.f135155b) {
                    objQ7 = new f(6);
                    o0VarE.K(objQ7);
                }
                aVar16 = (e23.a) objQ7;
            } else {
                aVar16 = aVar5;
            }
            if (i39 != 0) {
                Object objQ8 = o0VarE.q();
                aVar18.getClass();
                if (objQ8 == p3.m.a.f135155b) {
                    objQ8 = new f(7);
                    o0VarE.K(objQ8);
                }
                aVar17 = (e23.a) objQ8;
            } else {
                aVar17 = aVar6;
            }
            x1 x1Var = p3.n.f135158a;
            z02.d.a(false, z3.f.c(-1164202482, new nw0.l(aVar17, aVar16, 10), o0VarE), null, null, null, z3.f.c(1600079890, new r11.k(iVar, lVar2, pVar2, aVar8, aVar7, aVar9, aVar10), o0VarE), o0VarE, 196656, 29);
            aVar11 = aVar17;
            pVar3 = pVar2;
            aVar12 = aVar16;
            aVar13 = aVar10;
            aVar14 = aVar7;
            aVar15 = aVar8;
            lVar3 = lVar2;
        } else {
            o0VarE.e();
            aVar11 = aVar6;
            pVar3 = pVar2;
            aVar12 = aVar5;
            aVar13 = aVar10;
            lVar3 = lVar2;
            aVar14 = aVar7;
            aVar15 = aVar8;
        }
        e23.a<Unit> aVar19 = aVar9;
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new fo.b(iVar, lVar3, pVar3, aVar14, aVar15, aVar19, aVar13, aVar12, aVar11, i14, i15);
        }
    }

    public static final void c(final float f14, final int i14, final e23.a aVar, h4.r rVar, p3.m mVar, final boolean z14) {
        int i15;
        final h4.r rVar2;
        p3.o0 o0VarE = mVar.E(354615982);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.h(z14) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(aVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.i(f14) ? 256 : 128;
        }
        int i16 = i15 | 3072;
        if (o0VarE.n(i16 & 1, (i16 & 1171) != 1170)) {
            h4.r.a aVar2 = h4.r.S;
            x1 x1Var = p3.n.f135158a;
            int i17 = z14 ? R.drawable.ic_remove_red : R.drawable.ic_add_round;
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            float f15 = j92.b.f97901d.f97904c * f14;
            g6.f.a aVar3 = g6.f.f75994b;
            h4.r rVarQ = x2.q(aVar2, f15);
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = new u(0);
                o0VarE.K(objQ);
            }
            h4.r rVarB = p5.v.b(rVarQ, (e23.l) objQ);
            boolean z15 = (i16 & 112) == 32;
            Object objQ2 = o0VarE.q();
            if (z15 || objQ2 == c2565a) {
                objQ2 = new a(aVar, 4);
                o0VarE.K(objQ2);
            }
            h4.r rVarD = u1.w.d(rVarB, false, null, null, (e23.a) objQ2, 15);
            t4.d dVarA = n5.c.a(i17, o0VarE, 0);
            o4.d0.f128823b.getClass();
            i7.a(dVarA, null, rVarD, o4.d0.f128832k, o0VarE, 3120, 0);
            rVar2 = aVar2;
        } else {
            o0VarE.e();
            rVar2 = rVar;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e23.p() { // from class: t21.r
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iT = p3.p0.t(i14 | 1);
                    h0.c(f14, iT, aVar, rVar2, (p3.m) obj, z14);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final void d(t2 t2Var, boolean z14, String str, e23.a<Unit> aVar, float f14, p3.m mVar, int i14) {
        p3.o0 o0VarE = mVar.E(91362808);
        int i15 = i14 | (o0VarE.B(t2Var) ? 4 : 2) | (o0VarE.h(z14) ? 32 : 16) | (o0VarE.B(str) ? 256 : 128) | (o0VarE.r(aVar) ? 2048 : 1024) | (o0VarE.i(f14) ? 16384 : 8192);
        if (o0VarE.n(i15 & 1, (i15 & 9363) != 9362)) {
            x1 x1Var = p3.n.f135158a;
            int i16 = (i15 >> 3) & 14;
            int i17 = i15 >> 6;
            c(f14, i16 | (i17 & 112) | (i17 & 896), aVar, null, o0VarE, z14);
            d92.b.f58623a.getClass();
            d92.b.f58624b.getClass();
            s5.x0 x0VarB = d92.c.b(j92.f.f97931h, o0VarE);
            h4.r.a aVar2 = h4.r.S;
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            mh.c(str, t2Var.a(c2.l.A(aVar2, j92.b.f97899b.f97919d, 0.0f, 2), 1.0f, true), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB, o0VarE, i17 & 14, 0, 131068);
            if (z14) {
                o0VarE = o0VarE;
                o0VarE.C(-1219381303);
                bVar.getClass();
                float f15 = j92.b.f97901d.f97904c * f14;
                g6.f.a aVar3 = g6.f.f75994b;
                h4.r rVarQ = x2.q(aVar2, f15);
                s62.a.f157643a.getClass();
                i7.b(h7.a(t62.b.f162798a), null, rVarQ, am.j.d(o0VarE), o0VarE, 48, 0);
                o0VarE = o0VarE;
                o0VarE.g0(false);
            } else {
                o0VarE = o0VarE;
                o0VarE.C(-1219159126);
                o0VarE.g0(false);
            }
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new t(t2Var, z14, str, aVar, f14, i14);
        }
    }
}
