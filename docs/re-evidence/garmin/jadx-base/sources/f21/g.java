package f21;

import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.DefaultLoadControl;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import com.google.android.gms.auth.api.proxy.AuthApiStatusCodes;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import lc.u0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;
import p13.p0;
import p13.t0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i53.f<g21.z> f68533a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final i53.f<g21.a0> f68534b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final i53.f<g21.z> f68535c;

    static {
        b63.o oVar = new b63.o(2024, 4, 1);
        Integer numValueOf = Integer.valueOf(AuthApiStatusCodes.AUTH_API_INVALID_CREDENTIALS);
        Double dValueOf = Double.valueOf(120.0d);
        Double dValueOf2 = Double.valueOf(80.0d);
        Double dValueOf3 = Double.valueOf(250.0d);
        g21.z zVar = new g21.z(oVar, numValueOf, dValueOf, dValueOf2, dValueOf3, 400);
        b63.o oVar2 = new b63.o(2024, 4, 2);
        Double dValueOf4 = Double.valueOf(150.0d);
        Double dValueOf5 = Double.valueOf(0.0d);
        g21.z zVar2 = new g21.z(oVar2, 2200, dValueOf4, dValueOf5, Double.valueOf(300.0d), 500);
        b63.o oVar3 = new b63.o(2024, 4, 3);
        Double dValueOf6 = Double.valueOf(90.0d);
        Double dValueOf7 = Double.valueOf(60.0d);
        Double dValueOf8 = Double.valueOf(200.0d);
        g21.z zVar3 = new g21.z(oVar3, 2000, dValueOf6, dValueOf7, dValueOf8, 0);
        b63.o oVar4 = new b63.o(2024, 4, 4);
        Double dValueOf9 = Double.valueOf(140.0d);
        g21.z zVar4 = new g21.z(oVar4, 2800, dValueOf9, dValueOf6, Double.valueOf(280.0d), 0);
        b63.o oVar5 = new b63.o(2024, 4, 5);
        Double dValueOf10 = Double.valueOf(70.0d);
        Double dValueOf11 = Double.valueOf(180.0d);
        g21.z zVar5 = new g21.z(oVar5, 2000, dValueOf5, dValueOf10, dValueOf11, 0);
        g21.z zVar6 = new g21.z(new b63.o(2024, 4, 6), numValueOf, Double.valueOf(160.0d), Double.valueOf(230.0d), dValueOf5, 0);
        b63.o oVar6 = new b63.o(2024, 4, 7);
        Double dValueOf12 = Double.valueOf(130.0d);
        Double dValueOf13 = Double.valueOf(85.0d);
        Double dValueOf14 = Double.valueOf(270.0d);
        f68533a = i53.a.a(zVar, zVar2, zVar3, zVar4, zVar5, zVar6, new g21.z(oVar6, 2365, dValueOf12, dValueOf13, dValueOf14, 0));
        Double dValueOf15 = Double.valueOf(300.0d);
        Double dValueOf16 = Double.valueOf(310.0d);
        Double dValueOf17 = Double.valueOf(100.0d);
        f68534b = i53.a.a(new g21.a0(dValueOf15, dValueOf6, dValueOf3, dValueOf16, dValueOf17, dValueOf14), new g21.a0(dValueOf8, dValueOf2, dValueOf2, Double.valueOf(220.0d), dValueOf17, dValueOf17), new g21.a0(Double.valueOf(70.0d), dValueOf2, dValueOf2, dValueOf6, dValueOf17, dValueOf8), new g21.a0(dValueOf9, dValueOf17, dValueOf2, dValueOf9, dValueOf, dValueOf8), new g21.a0(dValueOf17, dValueOf2, dValueOf11, dValueOf9, dValueOf17, dValueOf8), new g21.a0(dValueOf11, dValueOf17, dValueOf11, Double.valueOf(190.0d), dValueOf11, dValueOf8), new g21.a0(dValueOf11, dValueOf17, dValueOf11, Double.valueOf(190.0d), dValueOf11, dValueOf8));
        f68535c = i53.a.a(new g21.z(new b63.o(2025, 5, 1), Integer.valueOf(DefaultLoadControl.DEFAULT_BUFFER_FOR_PLAYBACK_MS), dValueOf, dValueOf2, dValueOf3, 0), new g21.z(new b63.o(2025, 5, 2), numValueOf, Double.valueOf(150.0d), dValueOf17, Double.valueOf(300.0d), 200), new g21.z(new b63.o(2025, 5, 3), 2000, dValueOf6, Double.valueOf(60.0d), dValueOf8, 100), new g21.z(new b63.o(2025, 5, 4), 3200, dValueOf9, dValueOf6, Double.valueOf(280.0d), 50), new g21.z(new b63.o(2025, 5, 5), 1100, dValueOf5, dValueOf5, dValueOf11, 0), new g21.z(new b63.o(2025, 5, 6), 1000, Double.valueOf(160.0d), dValueOf5, dValueOf5, 0), new g21.z(new b63.o(2025, 5, 7), 2800, Double.valueOf(130.0d), Double.valueOf(85.0d), dValueOf14, 10), new g21.z(new b63.o(2025, 5, 8), Integer.valueOf(DefaultLoadControl.DEFAULT_BUFFER_FOR_PLAYBACK_MS), Double.valueOf(110.0d), Double.valueOf(75.0d), Double.valueOf(230.0d), 5), new g21.z(new b63.o(2025, 5, 9), 200, dValueOf5, dValueOf5, dValueOf5, 20), new g21.z(new b63.o(2025, 5, 10), 0, dValueOf5, dValueOf5, dValueOf5, 20), new g21.z(new b63.o(2025, 5, 11), 2200, Double.valueOf(125.0d), dValueOf2, Double.valueOf(260.0d), 30), new g21.z(new b63.o(2025, 5, 12), 1200, dValueOf5, Double.valueOf(95.0d), dValueOf5, 40), new g21.z(new b63.o(2025, 5, 13), 2000, dValueOf17, Double.valueOf(65.0d), Double.valueOf(210.0d), 50), new g21.z(new b63.o(2025, 5, 14), numValueOf, Double.valueOf(155.0d), Double.valueOf(105.0d), Double.valueOf(310.0d), 10), new g21.z(new b63.o(2025, 5, 15), 540, Double.valueOf(135.0d), dValueOf5, dValueOf5, 100), new g21.z(new b63.o(2025, 5, 16), 2400, Double.valueOf(115.0d), Double.valueOf(75.0d), Double.valueOf(240.0d), 10), new g21.z(new b63.o(2025, 5, 17), 3200, Double.valueOf(165.0d), Double.valueOf(110.0d), Double.valueOf(330.0d), 0), new g21.z(new b63.o(2025, 5, 18), 1320, dValueOf5, Double.valueOf(60.0d), Double.valueOf(195.0d), 0), new g21.z(new b63.o(2025, 5, 19), 2460, Double.valueOf(175.0d), dValueOf5, Double.valueOf(340.0d), 0), new g21.z(new b63.o(2025, 5, 20), 1000, dValueOf5, dValueOf5, dValueOf3, 0), new g21.z(new b63.o(2025, 5, 21), 2700, dValueOf9, dValueOf6, Double.valueOf(280.0d), 0), new g21.z(new b63.o(2025, 5, 22), 1845, dValueOf5, Double.valueOf(85.0d), dValueOf14, 0), new g21.z(new b63.o(2025, 5, 23), 3100, Double.valueOf(160.0d), Double.valueOf(105.0d), Double.valueOf(320.0d), 0), new g21.z(new b63.o(2025, 5, 24), 800, Double.valueOf(130.0d), dValueOf5, dValueOf5, 0), new g21.z(new b63.o(2025, 5, 25), 900, dValueOf5, dValueOf17, dValueOf5, 2), new g21.z(new b63.o(2025, 5, 26), 2100, Double.valueOf(110.0d), Double.valueOf(70.0d), Double.valueOf(220.0d), 10), new g21.z(new b63.o(2025, 5, 27), 3500, dValueOf11, dValueOf, Double.valueOf(360.0d), 5), new g21.z(new b63.o(2025, 5, 28), 2200, Double.valueOf(125.0d), dValueOf2, Double.valueOf(260.0d), 5));
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0276 A[LOOP:1: B:100:0x0270->B:102:0x0276, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:106:0x02bd A[LOOP:2: B:104:0x02b7->B:106:0x02bd, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:108:0x02de  */
    /* JADX WARN: Code duplicated, block: B:111:0x0304 A[LOOP:4: B:109:0x02fe->B:111:0x0304, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:115:0x0333 A[LOOP:5: B:113:0x032d->B:115:0x0333, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:119:0x0360  */
    /* JADX WARN: Code duplicated, block: B:121:0x0378  */
    /* JADX WARN: Code duplicated, block: B:123:0x037b  */
    /* JADX WARN: Code duplicated, block: B:125:0x037e  */
    /* JADX WARN: Code duplicated, block: B:126:0x0380  */
    /* JADX WARN: Code duplicated, block: B:127:0x0383  */
    /* JADX WARN: Code duplicated, block: B:128:0x0387  */
    /* JADX WARN: Code duplicated, block: B:133:0x03b7  */
    /* JADX WARN: Code duplicated, block: B:135:0x03bf  */
    /* JADX WARN: Code duplicated, block: B:142:0x040b A[PHI: r14
      0x040b: PHI (r14v7 long) = (r14v4 long), (r14v9 long) binds: [B:145:0x0417, B:141:0x03e1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:144:0x0415  */
    /* JADX WARN: Code duplicated, block: B:146:0x0419  */
    /* JADX WARN: Code duplicated, block: B:148:0x042a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:152:0x0450  */
    /* JADX WARN: Code duplicated, block: B:154:0x0453  */
    /* JADX WARN: Code duplicated, block: B:158:0x049b  */
    /* JADX WARN: Code duplicated, block: B:161:0x04ef  */
    /* JADX WARN: Code duplicated, block: B:167:0x0584  */
    /* JADX WARN: Code duplicated, block: B:168:0x05c9  */
    /* JADX WARN: Code duplicated, block: B:171:0x0603  */
    /* JADX WARN: Code duplicated, block: B:172:0x0653  */
    /* JADX WARN: Code duplicated, block: B:177:0x0677 A[LOOP:3: B:175:0x0671->B:177:0x0677, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:180:0x068c  */
    /* JADX WARN: Code duplicated, block: B:181:0x069a  */
    /* JADX WARN: Code duplicated, block: B:187:0x06b8  */
    /* JADX WARN: Code duplicated, block: B:207:0x0526 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:89:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:92:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:94:0x0209  */
    /* JADX WARN: Code duplicated, block: B:98:0x0217 A[LOOP:0: B:96:0x0211->B:98:0x0217, LOOP_END] */
    public static final void a(b63.o oVar, b63.o oVar2, i53.f fVar, i53.f fVar2, boolean z14, ArrayList arrayList, g21.l lVar, v21.e eVar, Integer num, p3.m mVar, int i14) {
        Integer num2;
        boolean z15;
        long j8;
        int i15;
        int i16;
        String strJ;
        String str;
        long jA;
        long jC;
        int iA;
        float fG;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        Iterator<E> it;
        ArrayList arrayList5;
        Iterator<E> it3;
        ArrayList arrayList6;
        Iterator<E> it4;
        ArrayList arrayList7;
        ArrayList arrayList8;
        Iterator it5;
        int i17;
        long j14;
        long j15;
        boolean zR;
        List<m92.h0.e.a> list;
        float fJ;
        Iterable iterableK;
        float f14;
        ArrayList arrayList9;
        boolean z16;
        String str2;
        Object next;
        int i18;
        Double d14;
        Double d15;
        Double d16;
        long j16;
        Iterator it6;
        m92.h0.e.a aVar;
        ArrayList arrayList10;
        long j17;
        long j18;
        g21.a0 a0Var;
        int i19;
        Double d17;
        ArrayList arrayList11;
        Iterator it7;
        String strL;
        int i24;
        LinkedHashMap linkedHashMap;
        int iA2;
        ArrayList arrayList12;
        p13.c.b bVar;
        ArrayList arrayList13;
        p13.c.b bVar2;
        oVar.getClass();
        oVar2.getClass();
        fVar.getClass();
        fVar2.getClass();
        lVar.getClass();
        eVar.getClass();
        p3.o0 o0VarE = mVar.E(1171081433);
        int i25 = (i14 & 6) == 0 ? (o0VarE.r(oVar) ? 4 : 2) | i14 : i14;
        if ((i14 & 48) == 0) {
            i25 |= o0VarE.r(oVar2) ? 32 : 16;
        }
        int i26 = i25 | (o0VarE.r(fVar) ? 256 : 128) | (o0VarE.B(fVar2) ? 2048 : 1024);
        if ((i14 & 24576) == 0) {
            i26 |= o0VarE.h(z14) ? 16384 : 8192;
        }
        int i27 = i26 | (o0VarE.r(arrayList) ? 131072 : 65536);
        if ((1572864 & i14) == 0) {
            i27 |= o0VarE.k(lVar.ordinal()) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        int i28 = i27 | (o0VarE.r(eVar) ? 8388608 : 4194304);
        if ((100663296 & i14) == 0) {
            i28 |= o0VarE.B(num) ? 67108864 : 33554432;
        }
        int i29 = i28;
        if (o0VarE.n(i29 & 1, (i29 & 38347923) != 38347922)) {
            x1 x1Var = p3.n.f135158a;
            g21.n nVarA = g21.m.a(lVar);
            g21.n.f75455a.getClass();
            long jB = g21.n.a.b(nVarA, o0VarE);
            int[] iArr = g21.n.a.C1518a.f75462a;
            int i30 = iArr[nVarA.ordinal()];
            if (i30 == 1) {
                z15 = false;
                o0VarE.C(781417648);
                f02.u.f67749a.getClass();
                gl.c.f77766a.getClass();
                j8 = gl.c.a(o0VarE).j();
                o0VarE.g0(false);
            } else if (i30 == 2) {
                z15 = false;
                o0VarE.C(781419628);
                f02.u.f67749a.getClass();
                gl.c.f77766a.getClass();
                j8 = gl.c.a(o0VarE).h();
                o0VarE.g0(false);
            } else if (i30 == 3) {
                z15 = false;
                o0VarE.C(781421550);
                f02.u.f67749a.getClass();
                gl.c.f77766a.getClass();
                j8 = gl.c.a(o0VarE).n();
                o0VarE.g0(false);
            } else {
                if (i30 != 4) {
                    throw kg.f.h(o0VarE, 781415977, false);
                }
                o0VarE.C(781423527);
                f02.u.f67749a.getClass();
                gl.c.f77766a.getClass();
                j8 = gl.c.a(o0VarE).m();
                z15 = false;
                o0VarE.g0(false);
            }
            long j19 = j8;
            int i34 = iArr[nVarA.ordinal()];
            if (i34 == 1) {
                i15 = -794543627;
                i16 = R.string.lbl_protein_surplus;
            } else if (i34 != 2) {
                if (i34 == 3) {
                    i15 = -794539341;
                    i16 = R.string.lbl_carbs_surplus;
                } else {
                    if (i34 != 4) {
                        throw kg.f.h(o0VarE, -794544724, z15);
                    }
                    o0VarE.C(1139150421);
                    o0VarE.g0(z15);
                    strJ = "";
                }
                str = strJ;
                f02.u.f67749a.getClass();
                jA = f02.u.a(o0VarE);
                jC = f02.u.c(o0VarE);
                iA = b63.p.a(oVar, oVar2) + 1;
                if (iA == 7) {
                    o0VarE.C(-331519210);
                    fG = w02.b0.g(v21.d.f175297a, o0VarE);
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(-331462759);
                    fG = w02.b0.g(v21.d.f175298b, o0VarE);
                    o0VarE.g0(false);
                }
                o0VarE.C(127866792);
                arrayList2 = new ArrayList();
                if (lVar == g21.l.ALL) {
                    o0VarE.C(57166701);
                    iA2 = t0.a(p13.y.r(fVar, 10));
                    if (iA2 < 16) {
                        iA2 = 16;
                    }
                    linkedHashMap = new LinkedHashMap(iA2);
                    for (Object obj : fVar) {
                        g21.z zVar = (g21.z) obj;
                        v21.f fVar3 = v21.f.f175333a;
                        Double d18 = zVar.f75541c;
                        Double d19 = zVar.f75542d;
                        float f15 = fG;
                        Double d24 = zVar.f75543e;
                        Integer num3 = zVar.f75544f;
                        fVar3.getClass();
                        linkedHashMap.put(obj, v21.f.e(d18, d19, d24, num3));
                        fG = f15;
                    }
                    g21.d0 d0VarG = l0.g(fVar, linkedHashMap, o0VarE);
                    List<m92.h0.e.a> list2 = d0VarG.f75408b;
                    v21.f.f175333a.getClass();
                    e23.l lVarC = l0.c(fG, jB, iA, v21.f.j(list2), d0VarG.f75407a, o0VarE);
                    i53.f fVarJ = i53.a.j(list2);
                    w13.c cVar = g21.n.f75461g;
                    arrayList12 = new ArrayList(p13.y.r(cVar, 10));
                    bVar = new p13.c.b();
                    while (bVar.hasNext()) {
                        g21.n nVar = (g21.n) bVar.next();
                        g21.n.f75455a.getClass();
                        arrayList12.add(new j82.f(g21.n.a.c(nVar, o0VarE), new j82.g.a(g21.n.a.b(nVar, o0VarE), null), null, 4, null));
                    }
                    w13.c cVar2 = g21.n.f75461g;
                    arrayList13 = new ArrayList(p13.y.r(cVar2, 10));
                    bVar2 = new p13.c.b();
                    while (bVar2.hasNext()) {
                        arrayList13.add(new e(fVar, (g21.n) bVar2.next(), 0));
                    }
                    z16 = false;
                    arrayList2.add(new g21.y(lVarC, fVarJ, arrayList12, arrayList13));
                    o0VarE.g0(false);
                    arrayList9 = arrayList2;
                    str2 = null;
                } else {
                    arrayList3 = arrayList2;
                    o0VarE.C(59365748);
                    o0VarE.C(2080122020);
                    float f16 = fG;
                    arrayList4 = new ArrayList(p13.y.r(fVar, 10));
                    it = fVar.iterator();
                    while (it.hasNext()) {
                        arrayList4.add(l0.l((g21.z) it.next(), nVarA));
                    }
                    o0VarE.g0(false);
                    o0VarE.C(2080124579);
                    arrayList5 = new ArrayList(p13.y.r(fVar2, 10));
                    it3 = fVar2.iterator();
                    while (it3.hasNext()) {
                        arrayList5.add(l0.i((g21.a0) it3.next(), nVarA));
                    }
                    o0VarE.g0(false);
                    o0VarE.C(2080127239);
                    arrayList6 = new ArrayList(p13.y.r(fVar2, 10));
                    it4 = fVar2.iterator();
                    while (it4.hasNext()) {
                        a0Var = (g21.a0) it4.next();
                        float f17 = l0.f68589a;
                        a0Var.getClass();
                        x1 x1Var2 = p3.n.f135158a;
                        i19 = l0.a.f68590a[nVarA.ordinal()];
                        if (i19 != 1) {
                            d17 = a0Var.f75376d;
                        } else if (i19 != 2) {
                            d17 = a0Var.f75377e;
                        } else if (i19 != 3) {
                            d17 = null;
                        } else {
                            d17 = a0Var.f75378f;
                        }
                        arrayList6.add(d17);
                    }
                    o0VarE.g0(false);
                    float f18 = l0.f68589a;
                    x1 x1Var3 = p3.n.f135158a;
                    arrayList7 = new ArrayList();
                    arrayList8 = new ArrayList();
                    i53.f<m92.h0.e.a> fVarG = c02.a.g(i53.a.e(arrayList5));
                    it5 = arrayList4.iterator();
                    i17 = 0;
                    while (it5.hasNext()) {
                        next = it5.next();
                        i18 = i17 + 1;
                        if (i17 >= 0) {
                            p13.x.q();
                            throw null;
                        }
                        d14 = (Double) next;
                        ArrayList arrayList14 = arrayList5;
                        d15 = (Double) p13.h0.e0(i17, arrayList5);
                        ArrayList arrayList15 = arrayList6;
                        d16 = (Double) p13.h0.e0(i17, arrayList6);
                        if (d14 == null || d15 == null || d16 == null || p005kotlin.jvm.internal.s.d(d16, d15)) {
                            j16 = jA;
                            if (d14 != null) {
                                it6 = it5;
                                arrayList10 = arrayList3;
                                aVar = new m92.h0.e.a(i17, (float) d14.doubleValue());
                                if (d15 == null && d16 != null && p005kotlin.jvm.internal.s.d(d16, d15)) {
                                    arrayList7.add(new m92.l0(new m92.h0.e.b(aVar, jB, null), true, false, 4, null));
                                    arrayList8.add(aVar);
                                } else {
                                    if (d16 == null && d16.doubleValue() > d14.doubleValue()) {
                                        m92.h0.e.a aVarA = m92.h0.e.a.a(aVar, 0.0f, (float) d16.doubleValue(), 1);
                                        arrayList7.add(new m92.l0(new m92.h0.e.b(aVarA, j16, null), true, false, 4, null));
                                        arrayList7.add(new m92.l0(new m92.h0.e.b(aVar, jB, null), true, false, 4, null));
                                        arrayList8.add(aVarA);
                                    } else if (d16 != null || d14.doubleValue() <= d16.doubleValue()) {
                                        j17 = j16;
                                        j18 = j19;
                                        arrayList7.add(new m92.l0(new m92.h0.e.b(aVar, jB, null), true, false, 4, null));
                                        arrayList8.add(aVar);
                                    } else {
                                        m92.h0.e.a aVarA2 = m92.h0.e.a.a(aVar, 0.0f, (float) d16.doubleValue(), 1);
                                        j17 = j16;
                                        j18 = j19;
                                        arrayList7.add(new m92.l0(new m92.h0.e.b(m92.h0.e.a.a(aVar, 0.0f, (float) d14.doubleValue(), 1), j18, null), true, false, 4, null));
                                        arrayList7.add(new m92.l0(new m92.h0.e.b(aVarA2, jB, null), false, false, 4, null));
                                        arrayList8.add(aVar);
                                    }
                                    j19 = j18;
                                    it5 = it6;
                                    arrayList3 = arrayList10;
                                    i17 = i18;
                                    arrayList5 = arrayList14;
                                    arrayList6 = arrayList15;
                                    jA = j17;
                                }
                            }
                            j17 = j16;
                            j18 = j19;
                            j19 = j18;
                            it5 = it6;
                            arrayList3 = arrayList10;
                            i17 = i18;
                            arrayList5 = arrayList14;
                            arrayList6 = arrayList15;
                            jA = j17;
                        } else {
                            m92.h0.e.a aVar2 = new m92.h0.e.a(i17, (float) d16.doubleValue());
                            j16 = jA;
                            arrayList7.add(new m92.l0(new m92.h0.e.b(aVar2, j16, null), true, false, 4, null));
                            arrayList8.add(aVar2);
                        }
                        arrayList10 = arrayList3;
                        it6 = it5;
                        j17 = j16;
                        j18 = j19;
                        j19 = j18;
                        it5 = it6;
                        arrayList3 = arrayList10;
                        i17 = i18;
                        arrayList5 = arrayList14;
                        arrayList6 = arrayList15;
                        jA = j17;
                    }
                    j14 = jA;
                    j15 = j19;
                    ArrayList arrayList16 = arrayList3;
                    g21.d0 d0Var = new g21.d0(arrayList7, arrayList8, fVarG);
                    x1 x1Var4 = p3.n.f135158a;
                    i53.f<m92.h0.e.a> fVarG2 = c02.a.g(i53.a.e(arrayList6));
                    i53.f<m92.h0.e.a> fVarG3 = c02.a.g(i53.a.e(arrayList5));
                    v21.f.f175333a.getClass();
                    zR = v21.f.r(fVarG3, fVarG2);
                    List<m92.h0.e.a> list3 = d0Var.f75408b;
                    list = d0Var.f75409c;
                    fJ = v21.f.j(p13.h0.C0(list3, list));
                    g21.n.f75455a.getClass();
                    List listC = p13.w.c(new j82.f(g21.n.a.c(nVarA, o0VarE), new j82.g.a(jB, null), null, 4, null));
                    if (zR) {
                        o0VarE.C(60509958);
                        iterableK = p13.x.k(new j82.f(gl1.y.Q(o0VarE, R.string.lbl_adjusted_goal), new j82.g.a(j14, null), null, 4, null), new j82.f(str, new j82.g.a(j15, null), null, 4, null));
                        o0VarE.g0(false);
                    } else {
                        o0VarE.C(60973718);
                        o0VarE.g0(false);
                        iterableK = p13.j0.f134944a;
                    }
                    f14 = iA;
                    g21.y yVar = new g21.y(l0.c(f16, jB, f14, fJ, d0Var.f75407a, o0VarE), i53.a.j(list3), p13.h0.C0(listC, iterableK), p13.w.c(new e(fVar, nVarA, 1)));
                    arrayList9 = arrayList16;
                    arrayList9.add(yVar);
                    if (nVarA != g21.n.OTHER) {
                        o0VarE.C(62346460);
                        str2 = null;
                        arrayList9.add(new g21.y(l0.d(i53.a.j(list), f14, Float.valueOf(fJ), o0VarE, 0), i53.a.j(list), p13.w.c(new j82.f(gl1.y.Q(o0VarE, R.string.lbl_goal), new j82.g.e(jC, null), null, 4, null)), p13.w.c(new f(fVar2, nVarA, jC, 0))));
                        z16 = false;
                        o0VarE.g0(false);
                    } else {
                        z16 = false;
                        str2 = null;
                        o0VarE.C(63827361);
                        o0VarE.g0(false);
                    }
                    o0VarE.g0(z16);
                    Unit unit = Unit.INSTANCE;
                }
                o0VarE.g0(z16);
                v21.f fVar4 = v21.f.f175333a;
                arrayList11 = new ArrayList();
                it7 = arrayList9.iterator();
                while (it7.hasNext()) {
                    p13.d0.v(arrayList11, ((g21.y) it7.next()).f75536b);
                }
                fVar4.getClass();
                float fJ2 = v21.f.j(arrayList11);
                if (num == null) {
                    o0VarE.C(-324299218);
                    o0VarE.g0(false);
                    num2 = num;
                    strL = str2;
                } else {
                    num2 = num;
                    strL = u0.l(o0VarE, -324299217, num2, o0VarE, false);
                }
                v21.f.f175333a.getClass();
                if (z14 || v21.f.a.f175335b[lVar.ordinal()] == 1) {
                    i24 = R.string.weight_no_data_for_time_period;
                } else {
                    i24 = R.string.common_no_data;
                }
                l0.a(oVar, strL, arrayList9, gl1.y.Q(o0VarE, i24), z14, arrayList, Float.valueOf(fJ2), null, null, eVar, o0VarE, (i29 & 516110) | (1879048192 & (i29 << 6)), 384);
                o0VarE = o0VarE;
                x1 x1Var5 = p3.n.f135158a;
            } else {
                i15 = -794541455;
                i16 = R.string.lbl_fat_surplus;
            }
            strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, i15, i16, o0VarE, z15);
            str = strJ;
            f02.u.f67749a.getClass();
            jA = f02.u.a(o0VarE);
            jC = f02.u.c(o0VarE);
            iA = b63.p.a(oVar, oVar2) + 1;
            if (iA == 7) {
                o0VarE.C(-331519210);
                fG = w02.b0.g(v21.d.f175297a, o0VarE);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-331462759);
                fG = w02.b0.g(v21.d.f175298b, o0VarE);
                o0VarE.g0(false);
            }
            o0VarE.C(127866792);
            arrayList2 = new ArrayList();
            if (lVar == g21.l.ALL) {
                o0VarE.C(57166701);
                iA2 = t0.a(p13.y.r(fVar, 10));
                if (iA2 < 16) {
                    iA2 = 16;
                }
                linkedHashMap = new LinkedHashMap(iA2);
                while (r7.hasNext()) {
                    g21.z zVar2 = (g21.z) obj;
                    v21.f fVar5 = v21.f.f175333a;
                    Double d110 = zVar2.f75541c;
                    Double d111 = zVar2.f75542d;
                    float f19 = fG;
                    Double d25 = zVar2.f75543e;
                    Integer num4 = zVar2.f75544f;
                    fVar5.getClass();
                    linkedHashMap.put(obj, v21.f.e(d110, d111, d25, num4));
                    fG = f19;
                }
                g21.d0 d0VarG2 = l0.g(fVar, linkedHashMap, o0VarE);
                List<m92.h0.e.a> list4 = d0VarG2.f75408b;
                v21.f.f175333a.getClass();
                e23.l lVarC2 = l0.c(fG, jB, iA, v21.f.j(list4), d0VarG2.f75407a, o0VarE);
                i53.f fVarJ2 = i53.a.j(list4);
                w13.c cVar3 = g21.n.f75461g;
                arrayList12 = new ArrayList(p13.y.r(cVar3, 10));
                bVar = new p13.c.b();
                while (bVar.hasNext()) {
                    g21.n nVar2 = (g21.n) bVar.next();
                    g21.n.f75455a.getClass();
                    arrayList12.add(new j82.f(g21.n.a.c(nVar2, o0VarE), new j82.g.a(g21.n.a.b(nVar2, o0VarE), null), null, 4, null));
                }
                w13.c cVar4 = g21.n.f75461g;
                arrayList13 = new ArrayList(p13.y.r(cVar4, 10));
                bVar2 = new p13.c.b();
                while (bVar2.hasNext()) {
                    arrayList13.add(new e(fVar, (g21.n) bVar2.next(), 0));
                }
                z16 = false;
                arrayList2.add(new g21.y(lVarC2, fVarJ2, arrayList12, arrayList13));
                o0VarE.g0(false);
                arrayList9 = arrayList2;
                str2 = null;
            } else {
                arrayList3 = arrayList2;
                o0VarE.C(59365748);
                o0VarE.C(2080122020);
                float f110 = fG;
                arrayList4 = new ArrayList(p13.y.r(fVar, 10));
                it = fVar.iterator();
                while (it.hasNext()) {
                    arrayList4.add(l0.l((g21.z) it.next(), nVarA));
                }
                o0VarE.g0(false);
                o0VarE.C(2080124579);
                arrayList5 = new ArrayList(p13.y.r(fVar2, 10));
                it3 = fVar2.iterator();
                while (it3.hasNext()) {
                    arrayList5.add(l0.i((g21.a0) it3.next(), nVarA));
                }
                o0VarE.g0(false);
                o0VarE.C(2080127239);
                arrayList6 = new ArrayList(p13.y.r(fVar2, 10));
                it4 = fVar2.iterator();
                while (it4.hasNext()) {
                    a0Var = (g21.a0) it4.next();
                    float f111 = l0.f68589a;
                    a0Var.getClass();
                    x1 x1Var6 = p3.n.f135158a;
                    i19 = l0.a.f68590a[nVarA.ordinal()];
                    if (i19 != 1) {
                        d17 = a0Var.f75376d;
                    } else if (i19 != 2) {
                        d17 = a0Var.f75377e;
                    } else if (i19 != 3) {
                        d17 = null;
                    } else {
                        d17 = a0Var.f75378f;
                    }
                    arrayList6.add(d17);
                }
                o0VarE.g0(false);
                float f112 = l0.f68589a;
                x1 x1Var7 = p3.n.f135158a;
                arrayList7 = new ArrayList();
                arrayList8 = new ArrayList();
                i53.f<m92.h0.e.a> fVarG4 = c02.a.g(i53.a.e(arrayList5));
                it5 = arrayList4.iterator();
                i17 = 0;
                while (it5.hasNext()) {
                    next = it5.next();
                    i18 = i17 + 1;
                    if (i17 >= 0) {
                        p13.x.q();
                        throw null;
                    }
                    d14 = (Double) next;
                    ArrayList arrayList17 = arrayList5;
                    d15 = (Double) p13.h0.e0(i17, arrayList5);
                    ArrayList arrayList18 = arrayList6;
                    d16 = (Double) p13.h0.e0(i17, arrayList6);
                    if (d14 == null) {
                        j16 = jA;
                        if (d14 != null) {
                            it6 = it5;
                            arrayList10 = arrayList3;
                            aVar = new m92.h0.e.a(i17, (float) d14.doubleValue());
                            if (d15 == null) {
                                if (d16 == null) {
                                }
                                if (d16 != null) {
                                    j17 = j16;
                                    j18 = j19;
                                    arrayList7.add(new m92.l0(new m92.h0.e.b(aVar, jB, null), true, false, 4, null));
                                    arrayList8.add(aVar);
                                } else {
                                    j17 = j16;
                                    j18 = j19;
                                    arrayList7.add(new m92.l0(new m92.h0.e.b(aVar, jB, null), true, false, 4, null));
                                    arrayList8.add(aVar);
                                }
                            } else {
                                if (d16 == null) {
                                }
                                if (d16 != null) {
                                    j17 = j16;
                                    j18 = j19;
                                    arrayList7.add(new m92.l0(new m92.h0.e.b(aVar, jB, null), true, false, 4, null));
                                    arrayList8.add(aVar);
                                } else {
                                    j17 = j16;
                                    j18 = j19;
                                    arrayList7.add(new m92.l0(new m92.h0.e.b(aVar, jB, null), true, false, 4, null));
                                    arrayList8.add(aVar);
                                }
                            }
                        } else {
                            arrayList10 = arrayList3;
                            it6 = it5;
                        }
                        j17 = j16;
                        j18 = j19;
                    } else {
                        j16 = jA;
                        if (d14 != null) {
                            it6 = it5;
                            arrayList10 = arrayList3;
                            aVar = new m92.h0.e.a(i17, (float) d14.doubleValue());
                            if (d15 == null) {
                                if (d16 == null) {
                                }
                                if (d16 != null) {
                                    j17 = j16;
                                    j18 = j19;
                                    arrayList7.add(new m92.l0(new m92.h0.e.b(aVar, jB, null), true, false, 4, null));
                                    arrayList8.add(aVar);
                                } else {
                                    j17 = j16;
                                    j18 = j19;
                                    arrayList7.add(new m92.l0(new m92.h0.e.b(aVar, jB, null), true, false, 4, null));
                                    arrayList8.add(aVar);
                                }
                            } else {
                                if (d16 == null) {
                                }
                                if (d16 != null) {
                                    j17 = j16;
                                    j18 = j19;
                                    arrayList7.add(new m92.l0(new m92.h0.e.b(aVar, jB, null), true, false, 4, null));
                                    arrayList8.add(aVar);
                                } else {
                                    j17 = j16;
                                    j18 = j19;
                                    arrayList7.add(new m92.l0(new m92.h0.e.b(aVar, jB, null), true, false, 4, null));
                                    arrayList8.add(aVar);
                                }
                            }
                        } else {
                            arrayList10 = arrayList3;
                            it6 = it5;
                        }
                        j17 = j16;
                        j18 = j19;
                    }
                    j19 = j18;
                    it5 = it6;
                    arrayList3 = arrayList10;
                    i17 = i18;
                    arrayList5 = arrayList17;
                    arrayList6 = arrayList18;
                    jA = j17;
                }
                j14 = jA;
                j15 = j19;
                ArrayList arrayList19 = arrayList3;
                g21.d0 d0Var2 = new g21.d0(arrayList7, arrayList8, fVarG4);
                x1 x1Var8 = p3.n.f135158a;
                i53.f<m92.h0.e.a> fVarG5 = c02.a.g(i53.a.e(arrayList6));
                i53.f<m92.h0.e.a> fVarG6 = c02.a.g(i53.a.e(arrayList5));
                v21.f.f175333a.getClass();
                zR = v21.f.r(fVarG6, fVarG5);
                List<m92.h0.e.a> list5 = d0Var2.f75408b;
                list = d0Var2.f75409c;
                fJ = v21.f.j(p13.h0.C0(list5, list));
                g21.n.f75455a.getClass();
                List listC2 = p13.w.c(new j82.f(g21.n.a.c(nVarA, o0VarE), new j82.g.a(jB, null), null, 4, null));
                if (zR) {
                    o0VarE.C(60509958);
                    iterableK = p13.x.k(new j82.f(gl1.y.Q(o0VarE, R.string.lbl_adjusted_goal), new j82.g.a(j14, null), null, 4, null), new j82.f(str, new j82.g.a(j15, null), null, 4, null));
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(60973718);
                    o0VarE.g0(false);
                    iterableK = p13.j0.f134944a;
                }
                f14 = iA;
                g21.y yVar2 = new g21.y(l0.c(f110, jB, f14, fJ, d0Var2.f75407a, o0VarE), i53.a.j(list5), p13.h0.C0(listC2, iterableK), p13.w.c(new e(fVar, nVarA, 1)));
                arrayList9 = arrayList19;
                arrayList9.add(yVar2);
                if (nVarA != g21.n.OTHER) {
                    o0VarE.C(62346460);
                    str2 = null;
                    arrayList9.add(new g21.y(l0.d(i53.a.j(list), f14, Float.valueOf(fJ), o0VarE, 0), i53.a.j(list), p13.w.c(new j82.f(gl1.y.Q(o0VarE, R.string.lbl_goal), new j82.g.e(jC, null), null, 4, null)), p13.w.c(new f(fVar2, nVarA, jC, 0))));
                    z16 = false;
                    o0VarE.g0(false);
                } else {
                    z16 = false;
                    str2 = null;
                    o0VarE.C(63827361);
                    o0VarE.g0(false);
                }
                o0VarE.g0(z16);
                Unit unit2 = Unit.INSTANCE;
            }
            o0VarE.g0(z16);
            v21.f fVar6 = v21.f.f175333a;
            arrayList11 = new ArrayList();
            it7 = arrayList9.iterator();
            while (it7.hasNext()) {
                p13.d0.v(arrayList11, ((g21.y) it7.next()).f75536b);
            }
            fVar6.getClass();
            float fJ3 = v21.f.j(arrayList11);
            if (num == null) {
                o0VarE.C(-324299218);
                o0VarE.g0(false);
                num2 = num;
                strL = str2;
            } else {
                num2 = num;
                strL = u0.l(o0VarE, -324299217, num2, o0VarE, false);
            }
            v21.f.f175333a.getClass();
            if (z14) {
                i24 = R.string.weight_no_data_for_time_period;
            } else {
                i24 = R.string.common_no_data;
            }
            l0.a(oVar, strL, arrayList9, gl1.y.Q(o0VarE, i24), z14, arrayList, Float.valueOf(fJ3), null, null, eVar, o0VarE, (i29 & 516110) | (1879048192 & (i29 << 6)), 384);
            o0VarE = o0VarE;
            x1 x1Var9 = p3.n.f135158a;
        } else {
            num2 = num;
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a11.v(oVar, oVar2, fVar, fVar2, z14, arrayList, lVar, eVar, num2, i14);
        }
    }

    public static final void b(b63.o oVar, b63.o oVar2, boolean z14, i53.f fVar, g21.l lVar, Integer num, p3.m mVar, int i14) {
        boolean z15;
        k01.h hVar;
        k01.d dVar;
        k01.d dVar2;
        k01.d dVar3;
        k01.d dVar4;
        k01.d dVar5;
        k01.d dVar6;
        Object next;
        k01.h hVar2;
        k01.k kVar;
        k01.k kVar2;
        k01.k kVar3;
        k01.k kVar4;
        k01.k kVar5;
        Object next2;
        b63.o oVar3 = oVar;
        oVar3.getClass();
        oVar2.getClass();
        lVar.getClass();
        p3.o0 o0VarE = mVar.E(-1309943727);
        int i15 = (o0VarE.r(oVar3) ? 4 : 2) | i14 | (o0VarE.r(oVar2) ? 32 : 16);
        if ((i14 & 384) == 0) {
            z15 = z14;
            i15 |= o0VarE.h(z15) ? 256 : 128;
        } else {
            z15 = z14;
        }
        int i16 = i15 | (o0VarE.r(fVar) ? 2048 : 1024) | (o0VarE.k(lVar.ordinal()) ? 16384 : 8192);
        if ((196608 & i14) == 0) {
            i16 |= o0VarE.B(num) ? 131072 : 65536;
        }
        if (o0VarE.n(i16 & 1, (74899 & i16) != 74898)) {
            x1 x1Var = p3.n.f135158a;
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            if (objQ == p3.m.a.f135155b) {
                objQ = (v21.e) KoinJavaComponent.get$default(v21.e.class, null, null, 6, null);
                o0VarE.K(objQ);
            }
            v21.e eVar = (v21.e) objQ;
            ArrayList arrayListD = c02.a.d(oVar, oVar2);
            j23.l lVarI = p13.x.i(arrayListD);
            ArrayList arrayList = new ArrayList(p13.y.r(lVarI, 10));
            Iterator<Integer> it = lVarI.iterator();
            while (((j23.k) it).f96801c) {
                b63.o oVarC = b63.p.c(oVar3, new b63.d(0, 0, ((p0) it).nextInt(), 3, null));
                if (fVar != null) {
                    Iterator<E> it3 = fVar.iterator();
                    do {
                        if (!it3.hasNext()) {
                            next2 = null;
                            break;
                        }
                        next2 = it3.next();
                    } while (!p005kotlin.jvm.internal.s.g(((k01.h) next2).f102060a, oVarC));
                    hVar2 = (k01.h) next2;
                } else {
                    hVar2 = null;
                }
                arrayList.add(new g21.z(oVarC, (hVar2 == null || (kVar5 = hVar2.f102061b) == null) ? null : kVar5.f102072a, (hVar2 == null || (kVar4 = hVar2.f102061b) == null) ? null : kVar4.f102074c, (hVar2 == null || (kVar3 = hVar2.f102061b) == null) ? null : kVar3.f102073b, (hVar2 == null || (kVar2 = hVar2.f102061b) == null) ? null : kVar2.f102075d, (hVar2 == null || (kVar = hVar2.f102061b) == null) ? null : kVar.f102076e));
            }
            i53.f fVarJ = i53.a.j(arrayList);
            j23.l lVarI2 = p13.x.i(arrayListD);
            ArrayList arrayList2 = new ArrayList(p13.y.r(lVarI2, 10));
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
                arrayList2.add(new g21.a0((hVar == null || (dVar6 = hVar.f102062c) == null) ? null : dVar6.f102025d, (hVar == null || (dVar5 = hVar.f102062c) == null) ? null : dVar5.f102024c, (hVar == null || (dVar4 = hVar.f102062c) == null) ? null : dVar4.f102026e, (hVar == null || (dVar3 = hVar.f102062c) == null) ? null : dVar3.f102029h, (hVar == null || (dVar2 = hVar.f102062c) == null) ? null : dVar2.f102028g, (hVar == null || (dVar = hVar.f102062c) == null) ? null : dVar.f102027f));
                oVar3 = oVar;
            }
            i53.f fVarJ2 = i53.a.j(arrayList2);
            int i17 = i16 << 6;
            a(oVar, oVar2, fVarJ, fVarJ2, z15, arrayListD, lVar, eVar, num, o0VarE, (i16 & 126) | (57344 & i17) | (i17 & 3670016) | ((i16 << 9) & 234881024));
            x1 x1Var2 = p3.n.f135158a;
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a82.b(oVar, oVar2, z14, fVar, lVar, num, i14);
        }
    }
}
