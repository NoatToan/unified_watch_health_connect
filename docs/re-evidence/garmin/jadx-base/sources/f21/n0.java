package f21;

import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.koin.java.KoinJavaComponent;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final class n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i53.f<g21.c> f68602a;

    static {
        Double dValueOf = Double.valueOf(18.0d);
        Double dValueOf2 = Double.valueOf(25.0d);
        Double dValueOf3 = Double.valueOf(15.0d);
        Double dValueOf4 = Double.valueOf(8.0d);
        Double dValueOf5 = Double.valueOf(900.0d);
        Double dValueOf6 = Double.valueOf(700.0d);
        Double dValueOf7 = Double.valueOf(12.0d);
        g21.c cVar = new g21.c(dValueOf, dValueOf2, dValueOf3, dValueOf4, dValueOf5, dValueOf6, dValueOf7);
        Double dValueOf8 = Double.valueOf(22.0d);
        Double dValueOf9 = Double.valueOf(30.0d);
        Double dValueOf10 = Double.valueOf(10.0d);
        g21.c cVar2 = new g21.c(dValueOf8, dValueOf9, dValueOf, dValueOf10, Double.valueOf(1000.0d), Double.valueOf(800.0d), dValueOf3);
        Double dValueOf11 = Double.valueOf(20.0d);
        f68602a = i53.a.a(cVar, cVar2, new g21.c(dValueOf3, dValueOf11, dValueOf7, Double.valueOf(6.0d), Double.valueOf(750.0d), Double.valueOf(600.0d), dValueOf4), new g21.c(dValueOf2, Double.valueOf(35.0d), dValueOf11, dValueOf7, Double.valueOf(1100.0d), dValueOf5, dValueOf), new g21.c(dValueOf10, dValueOf3, dValueOf4, Double.valueOf(4.0d), Double.valueOf(500.0d), Double.valueOf(400.0d), Double.valueOf(5.0d)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(b63.o oVar, b63.o oVar2, boolean z14, List list, i53.f fVar, i53.f fVar2, g21.r rVar, int i14, List list2, pi0.e eVar, v21.e eVar2, p3.m mVar, int i15) {
        boolean z15;
        oVar.getClass();
        oVar2.getClass();
        list.getClass();
        fVar.getClass();
        fVar2.getClass();
        rVar.getClass();
        list2.getClass();
        eVar2.getClass();
        p3.o0 o0VarE = mVar.E(-792942827);
        int i16 = (o0VarE.r(oVar) ? 4 : 2) | i15 | (o0VarE.r(oVar2) ? 32 : 16);
        if ((i15 & 384) == 0) {
            i16 |= o0VarE.h(z14) ? 256 : 128;
        }
        if ((i15 & 3072) == 0) {
            i16 |= o0VarE.r(list) ? 2048 : 1024;
        }
        int i17 = i16 | (o0VarE.B(fVar) ? 16384 : 8192) | (o0VarE.B(fVar2) ? 131072 : 65536);
        if ((1572864 & i15) == 0) {
            i17 |= o0VarE.k(rVar.ordinal()) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        int i18 = i17 | (o0VarE.k(i14) ? 8388608 : 4194304) | (o0VarE.r(list2) ? 67108864 : 33554432);
        if ((805306368 & i15) == 0) {
            i18 |= o0VarE.r(eVar) ? 536870912 : 268435456;
        }
        int i19 = i18;
        int i24 = o0VarE.r(eVar2) ? 4 : 2;
        if (o0VarE.n(i19 & 1, ((i19 & 306783379) == 306783378 && (i24 & 3) == 2) ? false : true)) {
            x1 x1Var = p3.n.f135158a;
            long jO = l0.o(o0VarE, i14);
            long jP = l0.p(o0VarE, i14);
            String strQ = gl1.y.Q(o0VarE, g21.s.a(rVar).f14352b);
            String strT = gl1.d.T(rVar.f75492b, o0VarE, 0);
            f02.u.f67749a.getClass();
            long jC = f02.u.c(o0VarE);
            float fG = w02.b0.g(v21.d.f175298b, o0VarE);
            l22.a aVarS = w2.a0.s(o0VarE);
            o0VarE.C(-1808806518);
            ArrayList arrayList = new ArrayList();
            o0VarE.C(-1808810211);
            ArrayList arrayList2 = new ArrayList(p13.y.r(fVar, 10));
            Iterator<E> it = fVar.iterator();
            while (it.hasNext()) {
                arrayList2.add(l0.m((g21.c) it.next(), rVar));
            }
            o0VarE.g0(false);
            o0VarE.C(-1808807588);
            ArrayList arrayList3 = new ArrayList(p13.y.r(fVar2, 10));
            Iterator<E> it3 = fVar2.iterator();
            while (it3.hasNext()) {
                arrayList3.add(l0.j((g21.c0) it3.next(), rVar));
            }
            o0VarE.g0(false);
            g21.d0 d0VarF = l0.f(arrayList2, arrayList3, jO, jP);
            List<m92.h0.e.a> list3 = d0VarF.f75408b;
            List<m92.h0.e.a> list4 = d0VarF.f75409c;
            v21.f fVar3 = v21.f.f175333a;
            ArrayList arrayListC0 = p13.h0.C0(list3, list4);
            fVar3.getClass();
            float fJ = v21.f.j(arrayListC0);
            ArrayList arrayListK1 = p13.h0.k1(arrayList3, arrayList2);
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
            v21.f.f175333a.getClass();
            float f14 = 1;
            arrayList.add(new g21.y(l0.c(fG, jO, v21.f.A(oVar, oVar2) + f14, fJ, d0VarF.f75407a, o0VarE), i53.a.j(list3), p13.u.C(new j82.f[]{new j82.f(strQ, new j82.g.a(jO, null), null, 4, null), z15 ? new j82.f(strT, new j82.g.a(jP, null), null, 4, null) : null}), p13.x.k(new i(fVar, rVar, list, aVarS, eVar2, jO, 1), new h(fVar, rVar, list, aVarS, fVar2, eVar2, jO, 1))));
            arrayList.add(new g21.y(l0.d(i53.a.j(list4), v21.f.A(oVar, oVar2) + f14, Float.valueOf(fJ), o0VarE, 0), i53.a.j(list4), p13.w.c(new j82.f(gl1.y.Q(o0VarE, R.string.lbl_goal), new j82.g.e(jC, null), null, 4, null)), p13.w.c(new i(fVar2, rVar, list, aVarS, eVar2, jC, 2))));
            o0VarE.g0(false);
            ArrayList arrayList4 = new ArrayList();
            Iterator it6 = arrayList.iterator();
            while (it6.hasNext()) {
                p13.d0.v(arrayList4, ((g21.y) it6.next()).f75536b);
            }
            float fJ2 = v21.f.j(arrayList4);
            v21.f.f175333a.getClass();
            o0VarE = o0VarE;
            l0.b(oVar, null, arrayList, z14, gl1.y.Q(o0VarE, !z14 ? R.string.weight_no_data_for_time_period : R.string.common_no_data), list2, Float.valueOf(fJ2), null, null, eVar, eVar2, o0VarE, (i19 & 14) | 48 | ((i19 << 3) & 7168) | ((i19 >> 9) & 458752) | 1073741824 | (i19 & 1879048192), i24 & 14, 384);
            x1 x1Var2 = p3.n.f135158a;
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new c12.f(oVar, oVar2, z14, list, fVar, fVar2, rVar, i14, list2, eVar, eVar2, i15);
        }
    }

    public static final void b(b63.o oVar, b63.o oVar2, boolean z14, List list, i53.f fVar, g21.r rVar, ArrayList arrayList, pi0.e eVar, p3.m mVar, int i14) {
        p3.o0 o0Var;
        oVar.getClass();
        oVar2.getClass();
        list.getClass();
        fVar.getClass();
        rVar.getClass();
        p3.o0 o0VarE = mVar.E(1334021346);
        int i15 = (o0VarE.r(oVar) ? 4 : 2) | i14 | (o0VarE.r(oVar2) ? 32 : 16);
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.h(z14) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.r(list) ? 2048 : 1024;
        }
        int i16 = i15 | (o0VarE.r(fVar) ? 16384 : 8192) | (o0VarE.k(rVar.ordinal()) ? 131072 : 65536) | (o0VarE.r(arrayList) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288);
        if ((12582912 & i14) == 0) {
            i16 |= o0VarE.r(eVar) ? 8388608 : 4194304;
        }
        if (o0VarE.n(i16 & 1, (4793491 & i16) != 4793490)) {
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
            ArrayList arrayList2 = new ArrayList(p13.y.r(fVar, 10));
            Iterator<E> it = fVar.iterator();
            while (it.hasNext()) {
                arrayList2.add(gl1.y.T(((k01.l) it.next()).f102096c));
            }
            i53.f fVarJ = i53.a.j(arrayList2);
            ArrayList arrayList3 = new ArrayList(p13.y.r(fVar, 10));
            Iterator<E> it3 = fVar.iterator();
            while (it3.hasNext()) {
                k01.k kVar = ((k01.l) it3.next()).f102097d;
                arrayList3.add(new g21.c0(kVar != null ? kVar.f102078g : null, kVar != null ? kVar.f102080i : null, kVar != null ? kVar.f102081j : null, kVar != null ? kVar.f102088q : null, kVar != null ? kVar.f102089r : null, kVar != null ? kVar.f102090s : null, kVar != null ? kVar.f102092u : null));
            }
            i53.f fVarJ2 = i53.a.j(arrayList3);
            int iIndexOf = arrayList.indexOf(rVar);
            o0Var = o0VarE;
            a(oVar, oVar2, z14, list, fVarJ, fVarJ2, rVar, iIndexOf < 0 ? 0 : iIndexOf, listE, eVar, eVar2, o0Var, (i16 & 8190) | ((i16 << 3) & 3670016) | 1073741824 | ((i16 << 6) & 1879048192));
            x1 x1Var2 = p3.n.f135158a;
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e52.d(oVar, oVar2, z14, list, fVar, rVar, arrayList, eVar, i14, 1);
        }
    }
}
