package f21;

import b21.n9;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.koin.java.KoinJavaComponent;
import p13.p0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i53.f<g21.b0> f68558a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final i53.f<g21.c0> f68559b;

    static {
        b63.o oVar = new b63.o(2024, 4, 1);
        Double dValueOf = Double.valueOf(18.0d);
        Double dValueOf2 = Double.valueOf(25.0d);
        Double dValueOf3 = Double.valueOf(15.0d);
        Double dValueOf4 = Double.valueOf(8.0d);
        Double dValueOf5 = Double.valueOf(900.0d);
        Double dValueOf6 = Double.valueOf(700.0d);
        Double dValueOf7 = Double.valueOf(12.0d);
        g21.b0 b0Var = new g21.b0(oVar, dValueOf, dValueOf2, dValueOf3, dValueOf4, dValueOf5, dValueOf6, dValueOf7);
        b63.o oVar2 = new b63.o(2024, 4, 2);
        Double dValueOf8 = Double.valueOf(22.0d);
        Double dValueOf9 = Double.valueOf(30.0d);
        Double dValueOf10 = Double.valueOf(10.0d);
        Double dValueOf11 = Double.valueOf(1000.0d);
        Double dValueOf12 = Double.valueOf(800.0d);
        g21.b0 b0Var2 = new g21.b0(oVar2, dValueOf8, dValueOf9, dValueOf, dValueOf10, dValueOf11, dValueOf12, dValueOf3);
        b63.o oVar3 = new b63.o(2024, 4, 3);
        Double dValueOf13 = Double.valueOf(20.0d);
        Double dValueOf14 = Double.valueOf(6.0d);
        Double dValueOf15 = Double.valueOf(750.0d);
        g21.b0 b0Var3 = new g21.b0(oVar3, dValueOf3, dValueOf13, dValueOf7, dValueOf14, dValueOf15, Double.valueOf(600.0d), dValueOf4);
        g21.b0 b0Var4 = new g21.b0(new b63.o(2024, 4, 4), dValueOf2, Double.valueOf(35.0d), dValueOf13, dValueOf7, Double.valueOf(1100.0d), dValueOf5, dValueOf);
        g21.b0 b0Var5 = new g21.b0(new b63.o(2024, 4, 5), dValueOf10, dValueOf3, dValueOf4, Double.valueOf(4.0d), Double.valueOf(500.0d), Double.valueOf(400.0d), Double.valueOf(5.0d));
        b63.o oVar4 = new b63.o(2024, 4, 6);
        Double dValueOf16 = Double.valueOf(28.0d);
        Double dValueOf17 = Double.valueOf(16.0d);
        Double dValueOf18 = Double.valueOf(9.0d);
        Double dValueOf19 = Double.valueOf(950.0d);
        Double dValueOf20 = Double.valueOf(14.0d);
        f68558a = i53.a.a(b0Var, b0Var2, b0Var3, b0Var4, b0Var5, new g21.b0(oVar4, dValueOf13, dValueOf16, dValueOf17, dValueOf18, dValueOf19, dValueOf15, dValueOf20), new g21.b0(new b63.o(2024, 4, 7), dValueOf16, Double.valueOf(32.0d), dValueOf8, dValueOf20, Double.valueOf(1200.0d), dValueOf11, dValueOf13));
        f68559b = i53.a.a(new g21.c0(dValueOf2, dValueOf9, dValueOf13, dValueOf10, dValueOf11, dValueOf12, dValueOf3), new g21.c0(dValueOf2, dValueOf9, dValueOf13, dValueOf10, dValueOf11, dValueOf12, dValueOf3), new g21.c0(dValueOf2, dValueOf9, dValueOf13, dValueOf10, dValueOf11, dValueOf12, dValueOf3), new g21.c0(dValueOf2, dValueOf9, dValueOf13, dValueOf10, dValueOf11, dValueOf12, dValueOf3), new g21.c0(dValueOf2, dValueOf9, dValueOf13, dValueOf10, dValueOf11, dValueOf12, dValueOf3), new g21.c0(dValueOf2, dValueOf9, dValueOf13, dValueOf10, dValueOf11, dValueOf12, dValueOf3), new g21.c0(dValueOf2, dValueOf9, dValueOf13, dValueOf10, dValueOf11, dValueOf12, dValueOf3));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(b63.o oVar, b63.o oVar2, List list, i53.f fVar, i53.f fVar2, boolean z14, ArrayList arrayList, g21.r rVar, int i14, v21.e eVar, p3.m mVar, int i15) {
        int i16;
        p3.o0 o0Var;
        float fG;
        boolean z15;
        oVar.getClass();
        oVar2.getClass();
        list.getClass();
        fVar.getClass();
        fVar2.getClass();
        rVar.getClass();
        eVar.getClass();
        p3.o0 o0VarE = mVar.E(-180196355);
        if ((i15 & 6) == 0) {
            i16 = (o0VarE.r(oVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= o0VarE.r(oVar2) ? 32 : 16;
        }
        if ((i15 & 384) == 0) {
            i16 |= o0VarE.r(list) ? 256 : 128;
        }
        int i17 = i16 | (o0VarE.r(fVar) ? 2048 : 1024) | (o0VarE.B(fVar2) ? 16384 : 8192);
        if ((196608 & i15) == 0) {
            i17 |= o0VarE.h(z14) ? 131072 : 65536;
        }
        int i18 = i17 | (o0VarE.r(arrayList) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288);
        if ((12582912 & i15) == 0) {
            i18 |= o0VarE.k(rVar.ordinal()) ? 8388608 : 4194304;
        }
        int i19 = i18 | (o0VarE.k(i14) ? 67108864 : 33554432) | (o0VarE.r(eVar) ? 536870912 : 268435456);
        if (o0VarE.n(i19 & 1, (i19 & 306783379) != 306783378)) {
            x1 x1Var = p3.n.f135158a;
            l22.a aVarS = w2.a0.s(o0VarE);
            long jO = l0.o(o0VarE, i14);
            long jP = l0.p(o0VarE, i14);
            String strQ = gl1.y.Q(o0VarE, g21.s.a(rVar).f14352b);
            String strT = gl1.d.T(rVar.f75492b, o0VarE, 0);
            f02.u.f67749a.getClass();
            long jC = f02.u.c(o0VarE);
            int iA = b63.p.a(oVar, oVar2) + 1;
            if (iA == 7) {
                o0VarE.C(480447218);
                fG = w02.b0.g(v21.d.f175297a, o0VarE);
                o0VarE.g0(false);
            } else {
                o0VarE.C(480503669);
                fG = w02.b0.g(v21.d.f175298b, o0VarE);
                o0VarE.g0(false);
            }
            float f14 = fG;
            o0VarE.C(-1369962846);
            ArrayList arrayList2 = new ArrayList();
            o0VarE.C(-1369966523);
            ArrayList arrayList3 = new ArrayList(p13.y.r(fVar, 10));
            Iterator<E> it = fVar.iterator();
            while (it.hasNext()) {
                arrayList3.add(l0.n((g21.b0) it.next(), rVar));
            }
            o0VarE.g0(false);
            o0VarE.C(-1369963932);
            ArrayList arrayList4 = new ArrayList(p13.y.r(fVar2, 10));
            Iterator<E> it3 = fVar2.iterator();
            while (it3.hasNext()) {
                arrayList4.add(l0.j((g21.c0) it3.next(), rVar));
            }
            o0VarE.g0(false);
            g21.d0 d0VarF = l0.f(arrayList3, arrayList4, jO, jP);
            List<m92.h0.e.a> list2 = d0VarF.f75408b;
            List<m92.h0.e.a> list3 = d0VarF.f75409c;
            v21.f fVar3 = v21.f.f175333a;
            ArrayList arrayListC0 = p13.h0.C0(list2, list3);
            fVar3.getClass();
            float fJ = v21.f.j(arrayListC0);
            ArrayList arrayListK1 = p13.h0.k1(arrayList4, arrayList3);
            if (!arrayListK1.isEmpty()) {
                Iterator it4 = arrayListK1.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        z15 = false;
                        break;
                    }
                    o13.p pVar = (o13.p) it4.next();
                    Iterator it5 = it4;
                    Double d14 = (Double) pVar.f128594a;
                    Double d15 = (Double) pVar.f128595b;
                    if (d14 != null && d15 != null && d15.doubleValue() > d14.doubleValue()) {
                        z15 = true;
                        break;
                    }
                    it4 = it5;
                }
            } else {
                z15 = false;
                break;
            }
            float f15 = iA;
            arrayList2.add(new g21.y(l0.c(f14, jO, f15, fJ, d0VarF.f75407a, o0VarE), i53.a.j(list2), p13.u.C(new j82.f[]{new j82.f(strQ, new j82.g.a(jO, null), null, 4, null), z15 ? new j82.f(strT, new j82.g.a(jP, null), null, 4, null) : null}), p13.x.k(new h(fVar, rVar, list, aVarS, eVar, jO, strQ), new h(fVar, rVar, list, aVarS, fVar2, eVar, jP, 0))));
            arrayList2.add(new g21.y(l0.d(i53.a.j(list3), f15, Float.valueOf(fJ), o0VarE, 0), i53.a.j(list3), p13.w.c(new j82.f(gl1.y.Q(o0VarE, R.string.lbl_goal), new j82.g.e(jC, null), null, 4, null)), p13.w.c(new i(fVar2, rVar, list, aVarS, eVar, jC, 0))));
            o0VarE.g0(false);
            v21.f fVar4 = v21.f.f175333a;
            ArrayList arrayList5 = new ArrayList();
            Iterator it6 = arrayList2.iterator();
            while (it6.hasNext()) {
                p13.d0.v(arrayList5, ((g21.y) it6.next()).f75536b);
            }
            fVar4.getClass();
            float fJ2 = v21.f.j(arrayList5);
            v21.f.f175333a.getClass();
            int i24 = i19 >> 3;
            l0.a(oVar, null, arrayList2, gl1.y.Q(o0VarE, !z14 ? R.string.weight_no_data_for_time_period : R.string.common_no_data), z14, arrayList, Float.valueOf(fJ2), null, null, eVar, o0VarE, (i19 & 14) | 48 | (57344 & i24) | (i24 & 458752) | (i19 & 1879048192), 384);
            o0Var = o0VarE;
            x1 x1Var2 = p3.n.f135158a;
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e2.b(oVar, oVar2, list, fVar, fVar2, z14, arrayList, rVar, i14, eVar, i15);
        }
    }

    public static final void b(b63.o oVar, b63.o oVar2, boolean z14, List list, i53.f fVar, g21.r rVar, ArrayList arrayList, p3.m mVar, int i14) {
        boolean z15;
        List list2;
        k01.h hVar;
        k01.d dVar;
        k01.d dVar2;
        k01.d dVar3;
        k01.d dVar4;
        k01.d dVar5;
        k01.d dVar6;
        k01.d dVar7;
        Object next;
        char c14;
        k01.h hVar2;
        k01.k kVar;
        k01.k kVar2;
        k01.k kVar3;
        k01.k kVar4;
        k01.k kVar5;
        k01.k kVar6;
        k01.k kVar7;
        Object next2;
        b63.o oVar3 = oVar;
        oVar3.getClass();
        oVar2.getClass();
        list.getClass();
        rVar.getClass();
        p3.o0 o0VarE = mVar.E(-1075139514);
        int i15 = (o0VarE.r(oVar3) ? 4 : 2) | i14 | (o0VarE.r(oVar2) ? 32 : 16);
        if ((i14 & 384) == 0) {
            z15 = z14;
            i15 |= o0VarE.h(z15) ? 256 : 128;
        } else {
            z15 = z14;
        }
        if ((i14 & 3072) == 0) {
            list2 = list;
            i15 |= o0VarE.r(list2) ? 2048 : 1024;
        } else {
            list2 = list;
        }
        int i16 = i15 | (o0VarE.r(fVar) ? 16384 : 8192) | (o0VarE.k(rVar.ordinal()) ? 131072 : 65536) | (o0VarE.r(arrayList) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288);
        if (o0VarE.n(i16 & 1, (599187 & i16) != 599186)) {
            x1 x1Var = p3.n.f135158a;
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            char c15 = 6;
            if (objQ == p3.m.a.f135155b) {
                objQ = (v21.e) KoinJavaComponent.get$default(v21.e.class, null, null, 6, null);
                o0VarE.K(objQ);
            }
            v21.e eVar = (v21.e) objQ;
            ArrayList arrayListD = c02.a.d(oVar, oVar2);
            j23.l lVarI = p13.x.i(arrayListD);
            ArrayList arrayList2 = new ArrayList(p13.y.r(lVarI, 10));
            Iterator<Integer> it = lVarI.iterator();
            while (((j23.k) it).f96801c) {
                b63.o oVarC = b63.p.c(oVar3, new b63.d(0, 0, ((p0) it).nextInt(), 3, null));
                if (fVar != null) {
                    Iterator<E> it3 = fVar.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            c14 = c15;
                            next2 = null;
                            break;
                        } else {
                            next2 = it3.next();
                            c14 = c15;
                            if (p005kotlin.jvm.internal.s.g(((k01.h) next2).f102060a, oVarC)) {
                                break;
                            } else {
                                c15 = c14;
                            }
                        }
                    }
                    hVar2 = (k01.h) next2;
                } else {
                    c14 = c15;
                    hVar2 = null;
                }
                arrayList2.add(new g21.b0(oVarC, (hVar2 == null || (kVar7 = hVar2.f102061b) == null) ? null : kVar7.f102078g, (hVar2 == null || (kVar6 = hVar2.f102061b) == null) ? null : kVar6.f102080i, (hVar2 == null || (kVar5 = hVar2.f102061b) == null) ? null : kVar5.f102081j, (hVar2 == null || (kVar4 = hVar2.f102061b) == null) ? null : kVar4.f102088q, (hVar2 == null || (kVar = hVar2.f102061b) == null) ? null : kVar.f102089r, (hVar2 == null || (kVar3 = hVar2.f102061b) == null) ? null : kVar3.f102090s, (hVar2 == null || (kVar2 = hVar2.f102061b) == null) ? null : kVar2.f102092u));
                c15 = c14;
            }
            i53.f fVarJ = i53.a.j(arrayList2);
            j23.l lVarI2 = p13.x.i(arrayListD);
            ArrayList arrayList3 = new ArrayList(p13.y.r(lVarI2, 10));
            Iterator<Integer> it4 = lVarI2.iterator();
            while (((j23.k) it4).f96801c) {
                b63.o oVarC2 = b63.p.c(oVar3, new b63.d(0, 0, ((p0) it4).nextInt(), 3, null));
                if (fVar != null) {
                    Iterator<E> it5 = fVar.iterator();
                    do {
                        if (!it5.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it5.next();
                    } while (!p005kotlin.jvm.internal.s.g(((k01.h) next).f102060a, oVarC2));
                    hVar = (k01.h) next;
                } else {
                    hVar = null;
                }
                arrayList3.add(new g21.c0((hVar == null || (dVar7 = hVar.f102062c) == null) ? null : dVar7.f102031j, (hVar == null || (dVar6 = hVar.f102062c) == null) ? null : dVar6.f102033l, (hVar == null || (dVar5 = hVar.f102062c) == null) ? null : dVar5.f102034m, (hVar == null || (dVar4 = hVar.f102062c) == null) ? null : dVar4.f102041t, (hVar == null || (dVar = hVar.f102062c) == null) ? null : dVar.f102042u, (hVar == null || (dVar3 = hVar.f102062c) == null) ? null : dVar3.f102043v, (hVar == null || (dVar2 = hVar.f102062c) == null) ? null : dVar2.f102045x));
                oVar3 = oVar;
            }
            i53.f fVarJ2 = i53.a.j(arrayList3);
            int iIndexOf = arrayList.indexOf(rVar);
            if (iIndexOf < 0) {
                iIndexOf = 0;
            }
            a(oVar, oVar2, list2, fVarJ, fVarJ2, z15, arrayListD, rVar, iIndexOf, eVar, o0VarE, (i16 & 126) | ((i16 >> 3) & 896) | ((i16 << 9) & 458752) | ((i16 << 6) & 29360128));
            x1 x1Var2 = p3.n.f135158a;
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new n9(oVar, oVar2, z14, list, fVar, rVar, arrayList, i14, 5);
        }
    }
}
