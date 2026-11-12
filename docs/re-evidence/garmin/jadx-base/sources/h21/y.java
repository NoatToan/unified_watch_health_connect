package h21;

import a42.d0;
import b82.g1;
import b82.k1;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import g02.q0;
import g21.f0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o4.m1;
import p005kotlin.Unit;
import p3.l0;
import p3.o0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final class y {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f81198a;

        static {
            int[] iArr = new int[g21.t.values().length];
            try {
                iArr[g21.t.MACRONUTRIENTS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[g21.t.OTHER_NUTRIENTS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f81198a = iArr;
        }
    }

    public static final void a(v21.e eVar, String str, g21.u uVar, f0 f0Var, p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(1213492865);
        int i15 = i14 | (o0VarE.r(eVar) ? 4 : 2);
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.B(str) ? 32 : 16;
        }
        int i16 = i15 | (o0VarE.B(uVar) ? 256 : 128) | (o0VarE.B(f0Var) ? 2048 : 1024);
        if (o0VarE.n(i16 & 1, (i16 & 1171) != 1170)) {
            x1 x1Var = p3.n.f135158a;
            int i17 = i16 << 3;
            z01.c.a(x2.f(h4.r.S, 1.0f), eVar, str, uVar, f0Var, null, j53.l.b(), false, o0VarE, (i17 & 112) | 1769478 | (i17 & 896) | (i17 & 7168) | (i17 & 57344), 128);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new q0(eVar, str, uVar, f0Var, i14);
        }
    }

    /* JADX WARN: Code duplicated, block: B:51:0x0100  */
    public static final void b(h4.r rVar, v21.e eVar, g21.u uVar, i53.c cVar, f0 f0Var, g21.t tVar, List list, e23.l lVar, p3.m mVar, int i14) {
        h4.r rVar2;
        o0 o0VarE = mVar.E(-222798328);
        int i15 = i14 | 6 | (o0VarE.r(eVar) ? 32 : 16) | (o0VarE.B(uVar) ? 256 : 128) | (o0VarE.B(cVar) ? 2048 : 1024) | (o0VarE.B(f0Var) ? 16384 : 8192) | (o0VarE.k(tVar.ordinal()) ? 131072 : 65536) | (o0VarE.r(list) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (o0VarE.r(lVar) ? 8388608 : 4194304);
        if (o0VarE.n(i15 & 1, (4793491 & i15) != 4793490)) {
            h4.r.a aVar = h4.r.S;
            x1 x1Var = p3.n.f135158a;
            o0VarE.C(639184734);
            ArrayList arrayList = new ArrayList(p13.y.r(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new g1(gl1.d.T(((g21.t) it.next()).f75498a, o0VarE, 0), null, null, null, 14, null));
            }
            o0VarE.g0(false);
            i53.f fVarJ = i53.a.j(arrayList);
            int iIndexOf = list.indexOf(tVar);
            if (iIndexOf < 0) {
                iIndexOf = 0;
            }
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            h4.r rVarY = c2.l.y(aVar, j92.b.f97899b.f97920e);
            boolean z14 = (i15 & 29360128) == 8388608;
            Object objQ = o0VarE.q();
            if (z14) {
                objQ = new fb0.d(lVar, 8);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new fb0.d(lVar, 8);
                    o0VarE.K(objQ);
                }
            }
            k1.a(fVarJ, iIndexOf, rVarY, null, 0.0f, (e23.l) objQ, o0VarE, 3072, 16);
            h4.d.f81522a.getClass();
            r1.b.a(tVar, null, null, h4.d.a.f81525c, "MacrosAndMicrosGoalsChartSection", null, z3.f.c(1466356128, new d0(eVar, uVar, f0Var, cVar, 21), o0VarE), o0VarE, ((i15 >> 15) & 14) | 1600512, 38);
            o0VarE = o0VarE;
            x1 x1Var2 = p3.n.f135158a;
            rVar2 = aVar;
        } else {
            o0VarE.e();
            rVar2 = rVar;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new dd1.d(rVar2, eVar, uVar, cVar, f0Var, tVar, list, lVar, i14);
        }
    }

    public static final void c(final o82.a aVar, x01.e eVar, final i21.d dVar, n82.f fVar, v21.e eVar2, final i21.c cVar, final e23.p pVar, final e23.p pVar2, final e23.r rVar, final e23.r rVar2, final e23.r rVar3, final e23.a aVar2, final e23.a aVar3, p3.m mVar, int i14) {
        int i15;
        x01.e eVar3;
        n82.f fVar2;
        v21.e eVar4;
        o0 o0Var;
        aVar.getClass();
        eVar.getClass();
        dVar.getClass();
        eVar2.getClass();
        cVar.getClass();
        pVar.getClass();
        pVar2.getClass();
        rVar.getClass();
        rVar2.getClass();
        rVar3.getClass();
        o0 o0VarP = fb1.c.p(aVar2, aVar3, mVar, 519694248);
        if ((i14 & 6) == 0) {
            i15 = (o0VarP.B(aVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            eVar3 = eVar;
            i15 |= o0VarP.r(eVar3) ? 32 : 16;
        } else {
            eVar3 = eVar;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarP.r(dVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            fVar2 = fVar;
            i15 |= o0VarP.B(fVar2) ? 2048 : 1024;
        } else {
            fVar2 = fVar;
        }
        if ((i14 & 24576) == 0) {
            eVar4 = eVar2;
            i15 |= o0VarP.r(eVar4) ? 16384 : 8192;
        } else {
            eVar4 = eVar2;
        }
        if ((i14 & 196608) == 0) {
            i15 |= o0VarP.r(cVar) ? 131072 : 65536;
        }
        if ((i14 & 1572864) == 0) {
            i15 |= o0VarP.r(pVar) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((i14 & 12582912) == 0) {
            i15 |= o0VarP.r(pVar2) ? 8388608 : 4194304;
        }
        if ((i14 & 100663296) == 0) {
            i15 |= o0VarP.r(rVar) ? 67108864 : 33554432;
        }
        if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
            i15 |= o0VarP.r(rVar2) ? 536870912 : 268435456;
        }
        int i16 = i15;
        if (o0VarP.n(i16 & 1, ((i16 & 306783379) == 306783378 && ((((o0VarP.r(rVar3) ? (char) 4 : (char) 2) | (o0VarP.r(aVar2) ? ' ' : (char) 16)) | (o0VarP.r(aVar3) ? 256 : 128)) & 147) == 146) ? false : true)) {
            x1 x1Var = p3.n.f135158a;
            final n82.f fVar3 = fVar2;
            final x01.e eVar5 = eVar3;
            final v21.e eVar6 = eVar4;
            o0Var = o0VarP;
            u82.e.b(aVar, dVar.f87289w, null, false, z3.f.c(-2047703288, new e23.r() { // from class: h21.v
                /* JADX WARN: Code duplicated, block: B:37:0x00bb  */
                /* JADX WARN: Code duplicated, block: B:55:0x01ba  */
                @Override // e23.r
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    g21.g gVar;
                    h4.r rVarF;
                    Object iVar;
                    p3.m mVar2;
                    Integer num;
                    g21.h hVar;
                    g21.h hVar2;
                    u82.f fVar4 = (u82.f) obj2;
                    p3.m mVar3 = (p3.m) obj3;
                    ((Integer) obj4).getClass();
                    Double dValueOf = Double.valueOf(0.0d);
                    ((c2.t) obj).getClass();
                    fVar4.getClass();
                    x1 x1Var2 = p3.n.f135158a;
                    g21.i iVar2 = (g21.i) fVar4.a();
                    b11.f fVar5 = null;
                    List<b11.o> list = iVar2 != null ? iVar2.f75435c : null;
                    g21.i iVar3 = (g21.i) fVar4.a();
                    g21.u uVar = (iVar3 == null || (hVar2 = iVar3.f75433a) == null) ? null : hVar2.f75428e;
                    g21.i iVar4 = (g21.i) fVar4.a();
                    if (iVar4 != null && (hVar = iVar4.f75433a) != null) {
                        fVar5 = hVar.f75429f;
                    }
                    boolean z14 = false;
                    boolean z15 = (fVar5 == null || (num = fVar5.f14266a) == null || num.intValue() <= 0) ? false : true;
                    f0 f0VarG = fVar5 != null ? fVar5.g() : new f0(0, dValueOf, dValueOf, dValueOf);
                    g21.i iVar5 = (g21.i) fVar4.a();
                    if (iVar5 == null || (gVar = iVar5.f75434b) == null) {
                        gVar = new g21.g(j53.l.b(), c22.i.b(R.string.lbl_daily_timeline), true);
                    }
                    n82.f fVar6 = fVar3;
                    boolean zB = mVar3.B(fVar6);
                    o82.a aVar4 = aVar;
                    boolean zB2 = zB | mVar3.B(aVar4);
                    i21.d dVar2 = dVar;
                    boolean zR = zB2 | mVar3.r(dVar2) | mVar3.B(uVar) | mVar3.r(fVar5);
                    Object objQ = mVar3.q();
                    p3.m.a aVar5 = p3.m.f135153a;
                    if (zR) {
                        objQ = new x(fVar6, aVar4, dVar2, uVar, fVar5, null);
                        mVar3.K(objQ);
                    } else {
                        aVar5.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new x(fVar6, aVar4, dVar2, uVar, fVar5, null);
                            mVar3.K(objQ);
                        }
                    }
                    l0.f(fVar5, uVar, (e23.p) objQ, mVar3);
                    boolean zA = g22.l.a(aVar4.f130843a);
                    x01.e eVar7 = eVar5;
                    if (zA && !z15) {
                        x01.f fVar7 = eVar7.f188254c;
                        x01.f fVar8 = x01.f.ACTIVE;
                        if (fVar7 != fVar8 && eVar7.f188255d != fVar8) {
                            z14 = true;
                        }
                    }
                    if (z14) {
                        mVar3.C(-1705895878);
                        rVarF = x2.d(u1.n.e(h4.r.S, vb.h.e(d92.b.f58623a, mVar3), m1.f128891a), 1.0f);
                        mVar3.f();
                    } else {
                        mVar3.C(-1705765461);
                        mVar3.f();
                        rVarF = x2.f(h4.r.S, 1.0f);
                    }
                    h4.r rVar4 = rVarF;
                    h4.d.f81522a.getClass();
                    h4.g.a aVar6 = h4.d.a.f81537o;
                    boolean zH = mVar3.h(z14) | mVar3.r(eVar7);
                    e23.a aVar7 = aVar3;
                    boolean zB3 = zH | mVar3.B(aVar7);
                    e23.a aVar8 = aVar2;
                    boolean zB4 = zB3 | mVar3.B(aVar8) | mVar3.B(uVar) | mVar3.r(list);
                    v21.e eVar8 = eVar6;
                    boolean zR2 = zB4 | mVar3.r(eVar8) | mVar3.B(f0VarG);
                    i21.c cVar2 = cVar;
                    boolean zR3 = zR2 | mVar3.r(cVar2) | mVar3.r(dVar2);
                    boolean z16 = z14;
                    e23.p pVar3 = pVar;
                    boolean zB5 = zR3 | mVar3.B(pVar3) | mVar3.B(aVar4);
                    e23.p pVar4 = pVar2;
                    boolean zB6 = zB5 | mVar3.B(pVar4) | mVar3.r(gVar) | mVar3.r(fVar4);
                    e23.r rVar5 = rVar3;
                    boolean zB7 = zB6 | mVar3.B(rVar5);
                    e23.r rVar6 = rVar2;
                    boolean zB8 = zB7 | mVar3.B(rVar6) | mVar3.B(fVar6);
                    e23.r rVar7 = rVar;
                    boolean zB9 = zB8 | mVar3.B(rVar7);
                    Object objQ2 = mVar3.q();
                    if (zB9) {
                        mVar2 = mVar3;
                        iVar = new gw0.i(z16, eVar7, dVar2, eVar8, gVar, aVar7, aVar8, uVar, list, f0VarG, cVar2, pVar3, aVar4, pVar4, fVar4, rVar5, rVar6, fVar6, rVar7);
                        mVar2.K(iVar);
                    } else {
                        aVar5.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            mVar2 = mVar3;
                            iVar = new gw0.i(z16, eVar7, dVar2, eVar8, gVar, aVar7, aVar8, uVar, list, f0VarG, cVar2, pVar3, aVar4, pVar4, fVar4, rVar5, rVar6, fVar6, rVar7);
                            mVar2.K(iVar);
                        } else {
                            iVar = objQ2;
                            mVar2 = mVar3;
                        }
                    }
                    e2.c.b(rVar4, null, null, null, aVar6, null, false, null, (e23.l) iVar, mVar2, 196608, 478);
                    return Unit.INSTANCE;
                }
            }, o0VarP), o0Var, (i16 & 14) | 27648, 4);
        } else {
            o0Var = o0VarP;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ds.u(aVar, eVar, dVar, fVar, eVar2, cVar, pVar, pVar2, rVar, rVar2, rVar3, aVar2, aVar3, i14);
        }
    }
}
