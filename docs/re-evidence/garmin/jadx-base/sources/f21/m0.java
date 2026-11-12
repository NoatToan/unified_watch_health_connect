package f21;

import b21.n9;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import okhttp3.internal.http2.Http2Connection;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;
import p13.t0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i53.f<g21.b> f68599a;

    static {
        Double dValueOf = Double.valueOf(85.0d);
        Double dValueOf2 = Double.valueOf(120.0d);
        g21.b bVar = new g21.b(dValueOf, dValueOf2, Double.valueOf(280.0d), 10);
        Double dValueOf3 = Double.valueOf(90.0d);
        g21.b bVar2 = new g21.b(dValueOf3, Double.valueOf(130.0d), Double.valueOf(295.0d), 0);
        Double dValueOf4 = Double.valueOf(0.0d);
        g21.b bVar3 = new g21.b(dValueOf4, dValueOf4, dValueOf4, 0);
        g21.b bVar4 = new g21.b(Double.valueOf(75.0d), Double.valueOf(110.0d), Double.valueOf(270.0d), 5);
        g21.b bVar5 = new g21.b(Double.valueOf(95.0d), Double.valueOf(140.0d), Double.valueOf(300.0d), 50);
        g21.b bVar6 = new g21.b(dValueOf4, dValueOf4, Double.valueOf(200.0d), 100);
        Double dValueOf5 = Double.valueOf(80.0d);
        g21.b bVar7 = new g21.b(dValueOf5, Double.valueOf(125.0d), Double.valueOf(285.0d), 100);
        Double dValueOf6 = Double.valueOf(100.0d);
        g21.b bVar8 = new g21.b(dValueOf4, dValueOf6, dValueOf4, 20);
        g21.b bVar9 = new g21.b(Double.valueOf(78.0d), Double.valueOf(115.0d), Double.valueOf(275.0d), 30);
        g21.b bVar10 = new g21.b(Double.valueOf(88.0d), Double.valueOf(128.0d), Double.valueOf(290.0d), 40);
        g21.b bVar11 = new g21.b(Double.valueOf(70.0d), Double.valueOf(105.0d), Double.valueOf(260.0d), 0);
        g21.b bVar12 = new g21.b(dValueOf3, dValueOf4, dValueOf4, 0);
        g21.b bVar13 = new g21.b(dValueOf4, dValueOf4, dValueOf4, 200);
        g21.b bVar14 = new g21.b(Double.valueOf(92.0d), Double.valueOf(135.0d), Double.valueOf(305.0d), 2);
        g21.b bVar15 = new g21.b(dValueOf4, dValueOf5, Double.valueOf(180.0d), 50);
        g21.b bVar16 = new g21.b(Double.valueOf(82.0d), Double.valueOf(118.0d), Double.valueOf(278.0d), 100);
        g21.b bVar17 = new g21.b(Double.valueOf(65.0d), dValueOf4, Double.valueOf(150.0d), 200);
        g21.b bVar18 = new g21.b(Double.valueOf(86.0d), Double.valueOf(122.0d), Double.valueOf(288.0d), 10);
        g21.b bVar19 = new g21.b(Double.valueOf(98.0d), Double.valueOf(145.0d), Double.valueOf(315.0d), 200);
        g21.b bVar20 = new g21.b(Double.valueOf(65.0d), dValueOf4, dValueOf4, 10);
        Double dValueOf7 = Double.valueOf(108.0d);
        f68599a = i53.a.a(bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, bVar9, bVar10, bVar11, bVar12, bVar13, bVar14, bVar15, bVar16, bVar17, bVar18, bVar19, bVar20, new g21.b(dValueOf4, dValueOf7, Double.valueOf(265.0d), 0), new g21.b(dValueOf4, dValueOf4, dValueOf4, 0), new g21.b(Double.valueOf(84.0d), dValueOf2, Double.valueOf(282.0d), 10), new g21.b(dValueOf4, dValueOf4, Double.valueOf(160.0d), 2), new g21.b(Double.valueOf(79.0d), Double.valueOf(114.0d), Double.valueOf(273.0d), 40), new g21.b(dValueOf4, Double.valueOf(98.0d), dValueOf4, 4), new g21.b(Double.valueOf(89.0d), Double.valueOf(132.0d), Double.valueOf(296.0d), 0), new g21.b(Double.valueOf(102.0d), Double.valueOf(150.0d), Double.valueOf(325.0d), 0), new g21.b(Double.valueOf(68.0d), dValueOf4, Double.valueOf(195.0d), 20), new g21.b(dValueOf5, dValueOf4, dValueOf4, 100), new g21.b(Double.valueOf(83.0d), Double.valueOf(118.0d), Double.valueOf(276.0d), 500), new g21.b(dValueOf4, dValueOf4, dValueOf4, 20), new g21.b(dValueOf4, Double.valueOf(112.0d), Double.valueOf(268.0d), 40), new g21.b(dValueOf4, dValueOf4, Double.valueOf(210.0d), 0), new g21.b(Double.valueOf(87.0d), Double.valueOf(126.0d), Double.valueOf(289.0d), 10), new g21.b(Double.valueOf(94.0d), Double.valueOf(138.0d), Double.valueOf(302.0d), 10), new g21.b(dValueOf4, Double.valueOf(102.0d), dValueOf4, 2), new g21.b(Double.valueOf(81.0d), Double.valueOf(116.0d), Double.valueOf(274.0d), 0), new g21.b(dValueOf4, dValueOf4, dValueOf4, 500), new g21.b(dValueOf, Double.valueOf(124.0d), Double.valueOf(285.0d), 20), new g21.b(Double.valueOf(72.0d), dValueOf4, Double.valueOf(185.0d), 0), new g21.b(dValueOf6, Double.valueOf(148.0d), Double.valueOf(320.0d), 0), new g21.b(dValueOf3, dValueOf4, dValueOf4, 20), new g21.b(Double.valueOf(92.0d), Double.valueOf(134.0d), Double.valueOf(298.0d), 20), new g21.b(dValueOf4, dValueOf4, dValueOf4, 500), new g21.b(dValueOf4, Double.valueOf(115.0d), Double.valueOf(272.0d), 40), new g21.b(dValueOf4, dValueOf4, Double.valueOf(170.0d), 20), new g21.b(Double.valueOf(83.0d), Double.valueOf(119.0d), Double.valueOf(278.0d), 0), new g21.b(dValueOf7, Double.valueOf(160.0d), Double.valueOf(340.0d), 0), new g21.b(Double.valueOf(105.0d), Double.valueOf(155.0d), Double.valueOf(335.0d), 0), new g21.b(dValueOf4, Double.valueOf(110.0d), dValueOf4, 220), new g21.b(dValueOf4, dValueOf6, dValueOf4, 0), new g21.b(Double.valueOf(75.0d), dValueOf7, Double.valueOf(265.0d), 10));
    }

    public static final void a(b63.o oVar, b63.o oVar2, boolean z14, i53.f<g21.b> fVar, i53.f<g21.a0> fVar2, g21.l lVar, List<String> list, pi0.e eVar, v21.e eVar2, Integer num, p3.m mVar, int i14) {
        boolean z15;
        String str;
        String str2;
        oVar.getClass();
        oVar2.getClass();
        fVar.getClass();
        fVar2.getClass();
        lVar.getClass();
        list.getClass();
        eVar2.getClass();
        p3.o0 o0VarE = mVar.E(1071284181);
        int i15 = (o0VarE.r(oVar) ? 4 : 2) | i14 | (o0VarE.r(oVar2) ? 32 : 16);
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.h(z14) ? 256 : 128;
        }
        int i16 = i15 | (o0VarE.B(fVar) ? 2048 : 1024) | (o0VarE.B(fVar2) ? 16384 : 8192);
        if ((196608 & i14) == 0) {
            i16 |= o0VarE.k(lVar.ordinal()) ? 131072 : 65536;
        }
        int i17 = i16 | (o0VarE.r(list) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288);
        if ((12582912 & i14) == 0) {
            i17 |= o0VarE.r(eVar) ? 8388608 : 4194304;
        }
        int i18 = i17 | (o0VarE.r(eVar2) ? 67108864 : 33554432);
        if ((805306368 & i14) == 0) {
            i18 |= o0VarE.B(num) ? 536870912 : 268435456;
        }
        int i19 = i18;
        if (o0VarE.n(i19 & 1, (i19 & 306783379) != 306783378)) {
            x1 x1Var = p3.n.f135158a;
            g21.n nVarA = g21.m.a(lVar);
            g21.n.f75455a.getClass();
            long jB = g21.n.a.b(nVarA, o0VarE);
            f02.u.f67749a.getClass();
            long jC = f02.u.c(o0VarE);
            float fG = w02.b0.g(v21.d.f175298b, o0VarE);
            o0VarE.C(-1288022531);
            ArrayList arrayList = new ArrayList();
            if (lVar == g21.l.ALL) {
                o0VarE.C(111190353);
                int iA = t0.a(p13.y.r(fVar, 10));
                if (iA < 16) {
                    iA = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
                for (g21.b bVar : fVar) {
                    g21.b bVar2 = bVar;
                    v21.f fVar3 = v21.f.f175333a;
                    Double d14 = bVar2.f75380b;
                    Double d15 = bVar2.f75379a;
                    Double d16 = bVar2.f75381c;
                    Integer num2 = bVar2.f75382d;
                    fVar3.getClass();
                    linkedHashMap.put(bVar, v21.f.e(d14, d15, d16, num2));
                }
                g21.d0 d0VarG = l0.g(fVar, linkedHashMap, o0VarE);
                List<m92.h0.e.a> list2 = d0VarG.f75408b;
                v21.f.f175333a.getClass();
                e23.l lVarC = l0.c(fG, jB, v21.f.A(oVar, oVar2) + 1, v21.f.j(list2), d0VarG.f75407a, o0VarE);
                i53.f fVarJ = i53.a.j(list2);
                w13.c cVar = g21.n.f75461g;
                ArrayList arrayList2 = new ArrayList(p13.y.r(cVar, 10));
                p13.c.b bVar3 = new p13.c.b();
                while (bVar3.hasNext()) {
                    g21.n nVar = (g21.n) bVar3.next();
                    g21.n.f75455a.getClass();
                    arrayList2.add(new j82.f(g21.n.a.c(nVar, o0VarE), new j82.g.a(g21.n.a.b(nVar, o0VarE), null), null, 4, null));
                }
                w13.c cVar2 = g21.n.f75461g;
                ArrayList arrayList3 = new ArrayList(p13.y.r(cVar2, 10));
                p13.c.b bVar4 = new p13.c.b();
                while (bVar4.hasNext()) {
                    arrayList3.add(new e(fVar, (g21.n) bVar4.next(), 2));
                }
                arrayList.add(new g21.y(lVarC, fVarJ, arrayList2, arrayList3));
                z15 = false;
                o0VarE.g0(false);
                str = null;
            } else {
                o0VarE.C(113400095);
                o0VarE.C(-550533072);
                ArrayList arrayList4 = new ArrayList(p13.y.r(fVar, 10));
                Iterator<g21.b> it = fVar.iterator();
                while (it.hasNext()) {
                    arrayList4.add(l0.k(it.next(), nVarA));
                }
                o0VarE.g0(false);
                o0VarE.C(-550530481);
                ArrayList arrayList5 = new ArrayList(p13.y.r(fVar2, 10));
                Iterator<g21.a0> it3 = fVar2.iterator();
                while (it3.hasNext()) {
                    arrayList5.add(l0.i(it3.next(), nVarA));
                }
                o0VarE.g0(false);
                float f14 = l0.f68589a;
                x1 x1Var2 = p3.n.f135158a;
                i53.f<m92.h0.e.a> fVarG = c02.a.g(i53.a.e(arrayList4));
                i53.f<m92.h0.e.a> fVarG2 = c02.a.g(i53.a.e(arrayList5));
                ArrayList arrayList6 = new ArrayList();
                Iterator<m92.h0.e.a> it4 = fVarG.iterator();
                while (it4.hasNext()) {
                    arrayList6.add(new m92.l0(new m92.h0.e.b(it4.next(), jB, null), true, false, 4, null));
                }
                g21.d0 d0Var = new g21.d0(arrayList6, fVarG, fVarG2);
                x1 x1Var3 = p3.n.f135158a;
                v21.f fVar4 = v21.f.f175333a;
                List<m92.h0.e.a> list3 = d0Var.f75408b;
                List<m92.h0.e.a> list4 = d0Var.f75409c;
                ArrayList arrayListC0 = p13.h0.C0(list3, list4);
                fVar4.getClass();
                float fJ = v21.f.j(arrayListC0);
                float f15 = 1;
                e23.l lVarC2 = l0.c(fG, jB, v21.f.A(oVar, oVar2) + f15, fJ, d0Var.f75407a, o0VarE);
                i53.f fVarJ2 = i53.a.j(list3);
                g21.n.f75455a.getClass();
                arrayList.add(new g21.y(lVarC2, fVarJ2, p13.w.c(new j82.f(g21.n.a.c(nVarA, o0VarE), new j82.g.a(jB, null), null, 4, null)), p13.w.c(new e(fVar, nVarA, 3))));
                if (nVarA != g21.n.OTHER) {
                    o0VarE.C(115253554);
                    str = null;
                    arrayList.add(new g21.y(l0.d(i53.a.j(list4), v21.f.A(oVar, oVar2) + f15, Float.valueOf(fJ), o0VarE, 0), i53.a.j(list4), p13.w.c(new j82.f(gl1.y.Q(o0VarE, R.string.lbl_goal), new j82.g.e(jC, null), null, 4, null)), p13.w.c(new f(fVar2, nVarA, jC, 1))));
                    z15 = false;
                    o0VarE.g0(false);
                } else {
                    z15 = false;
                    str = null;
                    o0VarE.C(116763285);
                    o0VarE.g0(false);
                }
                o0VarE.g0(z15);
                Unit unit = Unit.INSTANCE;
            }
            o0VarE.g0(z15);
            v21.f fVar5 = v21.f.f175333a;
            ArrayList arrayList7 = new ArrayList();
            Iterator it5 = arrayList.iterator();
            while (it5.hasNext()) {
                p13.d0.v(arrayList7, ((g21.y) it5.next()).f75536b);
            }
            fVar5.getClass();
            float fJ2 = v21.f.j(arrayList7);
            if (num == null) {
                o0VarE.C(-1268241211);
                o0VarE.g0(false);
                str2 = str;
            } else {
                o0VarE.C(-1268241210);
                String strQ = gl1.y.Q(o0VarE, num.intValue());
                o0VarE.g0(false);
                str2 = strQ;
            }
            v21.f.f175333a.getClass();
            l0.b(oVar, str2, arrayList, z14, gl1.y.Q(o0VarE, (z14 && v21.f.a.f175335b[lVar.ordinal()] != 1) ? R.string.common_no_data : R.string.weight_no_data_for_time_period), list, Float.valueOf(fJ2), null, null, eVar, eVar2, o0VarE, (i19 & 14) | ((i19 << 3) & 7168) | ((i19 >> 3) & 458752) | 1073741824 | (1879048192 & (i19 << 6)), (i19 >> 24) & 14, 384);
            o0VarE = o0VarE;
            x1 x1Var4 = p3.n.f135158a;
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new d50.k(oVar, oVar2, z14, fVar, fVar2, lVar, list, eVar, eVar2, num, i14);
        }
    }

    public static final void b(b63.o oVar, b63.o oVar2, boolean z14, i53.f<k01.l> fVar, g21.l lVar, pi0.e eVar, Integer num, p3.m mVar, int i14) {
        p3.o0 o0Var;
        oVar.getClass();
        oVar2.getClass();
        fVar.getClass();
        lVar.getClass();
        p3.o0 o0VarE = mVar.E(-857373049);
        int i15 = (o0VarE.r(oVar) ? 4 : 2) | i14 | (o0VarE.r(oVar2) ? 32 : 16);
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.h(z14) ? 256 : 128;
        }
        int i16 = i15 | (o0VarE.r(fVar) ? 2048 : 1024) | (o0VarE.k(lVar.ordinal()) ? 16384 : 8192);
        if ((196608 & i14) == 0) {
            i16 |= o0VarE.r(eVar) ? 131072 : 65536;
        }
        if ((1572864 & i14) == 0) {
            i16 |= o0VarE.B(num) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if (o0VarE.n(i16 & 1, (599187 & i16) != 599186)) {
            x1 x1Var = p3.n.f135158a;
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            if (objQ == p3.m.a.f135155b) {
                objQ = (v21.e) KoinJavaComponent.get$default(v21.e.class, null, null, 6, null);
                o0VarE.K(objQ);
            }
            v21.e eVar2 = (v21.e) objQ;
            DateTime dateTimeK = vb.h.k(oVar);
            DateTime dateTimeK2 = vb.h.k(oVar2);
            DateTimeFormatter dateTimeFormatterForPattern = DateTimeFormat.forPattern("MMM");
            dateTimeFormatterForPattern.getClass();
            List<String> listE = c02.a.e(dateTimeK, dateTimeK2, dateTimeFormatterForPattern);
            ArrayList arrayList = new ArrayList(p13.y.r(fVar, 10));
            Iterator<k01.l> it = fVar.iterator();
            while (it.hasNext()) {
                arrayList.add(gl1.y.S(it.next().f102096c));
            }
            i53.f fVarJ = i53.a.j(arrayList);
            ArrayList arrayList2 = new ArrayList(p13.y.r(fVar, 10));
            Iterator<k01.l> it3 = fVar.iterator();
            while (it3.hasNext()) {
                k01.k kVar = it3.next().f102097d;
                arrayList2.add(new g21.a0(kVar != null ? kVar.f102074c : null, kVar != null ? kVar.f102073b : null, kVar != null ? kVar.f102075d : null, null, null, null, 56, null));
            }
            o0Var = o0VarE;
            a(oVar, oVar2, z14, fVarJ, i53.a.j(arrayList2), lVar, listE, eVar, eVar2, num, o0Var, (i16 & 1022) | ((i16 << 3) & 458752) | Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE | ((i16 << 6) & 29360128) | ((i16 << 9) & 1879048192));
            x1 x1Var2 = p3.n.f135158a;
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new n9(oVar, oVar2, z14, fVar, lVar, eVar, num, i14, 6);
        }
    }
}
