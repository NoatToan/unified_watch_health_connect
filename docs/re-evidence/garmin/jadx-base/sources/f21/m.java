package f21;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.koin.java.KoinJavaComponent;
import p13.t0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i53.f<m92.h0.e.a> f68592a = i53.a.a(new m92.h0.e.a(0.0f, 1700.0f), new m92.h0.e.a(1.0f, 2200.0f), new m92.h0.e.a(2.0f, 2200.0f), new m92.h0.e.a(3.0f, 2100.0f), new m92.h0.e.a(4.0f, 100.0f), new m92.h0.e.a(5.0f, 0.0f), new m92.h0.e.a(6.0f, 1986.0f));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final i53.f<m92.h0.e.a> f68593b = i53.a.a(new m92.h0.e.a(0.0f, 500.0f), new m92.h0.e.a(1.0f, 800.0f), new m92.h0.e.a(2.0f, 1200.0f), new m92.h0.e.a(3.0f, 750.0f), new m92.h0.e.a(4.0f, 750.0f), new m92.h0.e.a(5.0f, 946.0f), new m92.h0.e.a(6.0f, 1834.0f));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final i53.f<m92.h0.e.a> f68594c = i53.a.a(new m92.h0.e.a(0.0f, 170.0f), new m92.h0.e.a(1.0f, 120.0f), new m92.h0.e.a(2.0f, 56.0f), new m92.h0.e.a(3.0f, 75.0f), new m92.h0.e.a(4.0f, 77.0f), new m92.h0.e.a(5.0f, 20.0f), new m92.h0.e.a(6.0f, 45.0f));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final i53.f<m92.h0.e.a> f68595d = i53.a.a(new m92.h0.e.a(0.0f, 1200.0f), new m92.h0.e.a(1.0f, 1990.0f), new m92.h0.e.a(2.0f, 2200.0f), new m92.h0.e.a(3.0f, 1200.0f), new m92.h0.e.a(4.0f, 2200.0f), new m92.h0.e.a(5.0f, 2200.0f), new m92.h0.e.a(6.0f, 1200.0f), new m92.h0.e.a(7.0f, 1200.0f), new m92.h0.e.a(8.0f, 1200.0f), new m92.h0.e.a(9.0f, 1200.0f), new m92.h0.e.a(10.0f, 0.0f), new m92.h0.e.a(11.0f, 2200.0f), new m92.h0.e.a(12.0f, 2200.0f), new m92.h0.e.a(13.0f, 2200.0f), new m92.h0.e.a(14.0f, 2200.0f), new m92.h0.e.a(15.0f, 2200.0f), new m92.h0.e.a(16.0f, 1990.0f), new m92.h0.e.a(17.0f, 0.0f), new m92.h0.e.a(18.0f, 2200.0f), new m92.h0.e.a(19.0f, 2200.0f), new m92.h0.e.a(20.0f, 3000.0f), new m92.h0.e.a(21.0f, 2800.0f), new m92.h0.e.a(22.0f, 2800.0f), new m92.h0.e.a(23.0f, 1000.0f), new m92.h0.e.a(24.0f, 2800.0f), new m92.h0.e.a(25.0f, 1000.0f), new m92.h0.e.a(26.0f, 2800.0f), new m92.h0.e.a(27.0f, 1000.0f));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final i53.f<m92.h0.e.a> f68596e = i53.a.a(new m92.h0.e.a(0.0f, 2000.0f), new m92.h0.e.a(27.0f, 2200.0f));

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final i53.f<m92.h0.e.a> f68597f = i53.a.a(new m92.h0.e.a(0.0f, 1200.0f), new m92.h0.e.a(1.0f, 3000.0f), new m92.h0.e.a(2.0f, 2200.0f), new m92.h0.e.a(3.0f, 1800.0f), new m92.h0.e.a(4.0f, 2200.0f), new m92.h0.e.a(5.0f, 2200.0f), new m92.h0.e.a(6.0f, 1200.0f), new m92.h0.e.a(7.0f, 1200.0f), new m92.h0.e.a(8.0f, 1200.0f), new m92.h0.e.a(9.0f, 1200.0f), new m92.h0.e.a(10.0f, 0.0f), new m92.h0.e.a(11.0f, 1200.0f), new m92.h0.e.a(12.0f, 1700.0f), new m92.h0.e.a(13.0f, 2200.0f), new m92.h0.e.a(14.0f, 3100.0f), new m92.h0.e.a(15.0f, 2200.0f), new m92.h0.e.a(16.0f, 1990.0f), new m92.h0.e.a(17.0f, 900.0f), new m92.h0.e.a(18.0f, 2200.0f), new m92.h0.e.a(19.0f, 2200.0f), new m92.h0.e.a(20.0f, 3000.0f), new m92.h0.e.a(21.0f, 3200.0f), new m92.h0.e.a(22.0f, 1200.0f), new m92.h0.e.a(23.0f, 1000.0f), new m92.h0.e.a(24.0f, 2800.0f), new m92.h0.e.a(25.0f, 1000.0f), new m92.h0.e.a(26.0f, 1800.0f), new m92.h0.e.a(27.0f, 1700.0f));

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final i53.f<m92.h0.e.a> f68598g = i53.a.a(new m92.h0.e.a(0.0f, 2000.0f), new m92.h0.e.a(27.0f, 2200.0f));

    public static final void a(b63.o oVar, b63.o oVar2, boolean z14, List list, g21.v vVar, List list2, p3.m mVar, int i14) {
        LinkedHashMap linkedHashMap;
        LinkedHashMap linkedHashMap2;
        LinkedHashMap linkedHashMap3;
        LinkedHashMap linkedHashMap4;
        i53.c cVarE;
        Double dValueOf;
        i53.c cVarE2;
        i53.c cVarE3;
        i53.c cVarE4;
        oVar.getClass();
        oVar2.getClass();
        p3.o0 o0VarE = mVar.E(804939887);
        int i15 = i14 | (o0VarE.r(oVar) ? 4 : 2) | (o0VarE.r(oVar2) ? 32 : 16) | (o0VarE.h(z14) ? 256 : 128) | (o0VarE.r(list) ? 2048 : 1024) | (o0VarE.k(vVar == null ? -1 : vVar.ordinal()) ? 16384 : 8192) | (o0VarE.r(list2) ? 131072 : 65536);
        if (o0VarE.n(i15 & 1, (74899 & i15) != 74898)) {
            x1 x1Var = p3.n.f135158a;
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            if (objQ == p3.m.a.f135155b) {
                objQ = (v21.e) KoinJavaComponent.get$default(v21.e.class, null, null, 6, null);
                o0VarE.K(objQ);
            }
            v21.e eVar = (v21.e) objQ;
            ArrayList arrayListD = c02.a.d(oVar, oVar2);
            int iAbs = Math.abs(b63.p.a(oVar, oVar2)) + 1;
            if (list != null) {
                int iA = t0.a(p13.y.r(list, 10));
                if (iA < 16) {
                    iA = 16;
                }
                linkedHashMap = new LinkedHashMap(iA);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    k01.h hVar = (k01.h) it.next();
                    String strValueOf = String.valueOf(hVar.f102060a);
                    k01.k kVar = hVar.f102061b;
                    o13.p pVar = new o13.p(strValueOf, kVar != null ? kVar.f102072a : null);
                    linkedHashMap.put(pVar.f128594a, pVar.f128595b);
                }
            } else {
                linkedHashMap = null;
            }
            i53.f fVarF = linkedHashMap != null ? c02.a.f(linkedHashMap, g22.l.h(oVar2), iAbs) : null;
            i53.f<m92.h0.e.a> fVarG = (fVarF == null || (cVarE4 = i53.a.e(fVarF)) == null) ? null : c02.a.g(cVarE4);
            if (list != null) {
                int iA2 = t0.a(p13.y.r(list, 10));
                if (iA2 < 16) {
                    iA2 = 16;
                }
                linkedHashMap2 = new LinkedHashMap(iA2);
                Iterator it3 = list.iterator();
                while (it3.hasNext()) {
                    k01.h hVar2 = (k01.h) it3.next();
                    String strValueOf2 = String.valueOf(hVar2.f102060a);
                    k01.d dVar = hVar2.f102062c;
                    o13.p pVar2 = new o13.p(strValueOf2, dVar != null ? dVar.f102022a : null);
                    linkedHashMap2.put(pVar2.f128594a, pVar2.f128595b);
                }
            } else {
                linkedHashMap2 = null;
            }
            i53.f fVarF2 = linkedHashMap2 != null ? c02.a.f(linkedHashMap2, g22.l.h(oVar2), iAbs) : null;
            i53.f<m92.h0.e.a> fVarG2 = (fVarF2 == null || (cVarE3 = i53.a.e(fVarF2)) == null) ? null : c02.a.g(cVarE3);
            if (list != null) {
                int iA3 = t0.a(p13.y.r(list, 10));
                if (iA3 < 16) {
                    iA3 = 16;
                }
                linkedHashMap3 = new LinkedHashMap(iA3);
                Iterator it4 = list.iterator();
                while (it4.hasNext()) {
                    k01.h hVar3 = (k01.h) it4.next();
                    String strValueOf3 = String.valueOf(hVar3.f102060a);
                    k01.d dVar2 = hVar3.f102062c;
                    i53.f<m92.h0.e.a> fVar = fVarG2;
                    o13.p pVar3 = new o13.p(strValueOf3, dVar2 != null ? dVar2.f102023b : null);
                    linkedHashMap3.put(pVar3.f128594a, pVar3.f128595b);
                    fVarG2 = fVar;
                }
            } else {
                linkedHashMap3 = null;
            }
            i53.f<m92.h0.e.a> fVar2 = fVarG2;
            i53.f fVarF3 = linkedHashMap3 != null ? c02.a.f(linkedHashMap3, g22.l.h(oVar2), iAbs) : null;
            i53.f<m92.h0.e.a> fVarG3 = (fVarF3 == null || (cVarE2 = i53.a.e(fVarF3)) == null) ? null : c02.a.g(cVarE2);
            if (list2 != null) {
                int iA4 = t0.a(p13.y.r(list2, 10));
                if (iA4 < 16) {
                    iA4 = 16;
                }
                LinkedHashMap linkedHashMap5 = new LinkedHashMap(iA4);
                Iterator it5 = list2.iterator();
                while (it5.hasNext()) {
                    l42.b bVar = (l42.b) it5.next();
                    l42.c cVarF = bVar.f();
                    String summaryDate = bVar.getSummaryDate();
                    if (cVarF != null) {
                        v21.f.f175333a.getClass();
                        dValueOf = Double.valueOf(v21.f.q(cVarF, vVar));
                    } else {
                        dValueOf = null;
                    }
                    o13.p pVar4 = new o13.p(summaryDate, dValueOf);
                    linkedHashMap5.put(pVar4.f128594a, pVar4.f128595b);
                }
                linkedHashMap4 = new LinkedHashMap();
                for (Map.Entry entry : linkedHashMap5.entrySet()) {
                    if (zf.b.D((Double) entry.getValue())) {
                        linkedHashMap4.put(entry.getKey(), entry.getValue());
                    }
                }
            } else {
                linkedHashMap4 = null;
            }
            i53.f fVarF4 = linkedHashMap4 != null ? c02.a.f(linkedHashMap4, g22.l.h(oVar2), iAbs) : null;
            i53.f<m92.h0.e.a> fVarG4 = (fVarF4 == null || (cVarE = i53.a.e(fVarF4)) == null) ? null : c02.a.g(cVarE);
            if (fVarG == null) {
                fVarG = j53.l.b();
            }
            i53.f<m92.h0.e.a> fVar3 = fVarG;
            i53.f<m92.h0.e.a> fVarB = fVar2 == null ? j53.l.b() : fVar2;
            if (fVarG3 == null) {
                fVarG3 = j53.l.b();
            }
            b(oVar, fVar3, fVarB, fVarG3, fVarG4, vVar, z14, iAbs, arrayListD, eVar, o0VarE, (i15 & 14) | ((i15 << 3) & 458752) | ((i15 << 12) & 3670016));
            x1 x1Var2 = p3.n.f135158a;
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ck0.h(oVar, oVar2, z14, list, vVar, list2, i14, 7);
        }
    }

    /* JADX WARN: Code duplicated, block: B:114:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:169:0x0380  */
    /* JADX WARN: Code duplicated, block: B:171:0x0384  */
    /* JADX WARN: Code duplicated, block: B:177:0x03ae  */
    /* JADX WARN: Code duplicated, block: B:179:0x03b1  */
    /* JADX WARN: Code duplicated, block: B:183:0x03f3  */
    /* JADX WARN: Code duplicated, block: B:186:0x0439  */
    /* JADX WARN: Code duplicated, block: B:208:0x05d9  */
    /* JADX WARN: Code duplicated, block: B:231:0x0457 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(b63.o oVar, i53.f fVar, i53.f fVar2, i53.f fVar3, i53.f fVar4, g21.v vVar, boolean z14, int i14, ArrayList arrayList, v21.e eVar, p3.m mVar, int i15) {
        o4.d0 d0VarA;
        float fG;
        boolean z15;
        i53.f fVar5;
        int i16;
        boolean z16;
        e23.l lVar;
        boolean z17;
        p3.o0 o0Var;
        Float f14;
        o4.d0 d0Var;
        e23.l lVar2;
        i53.f fVarB;
        boolean z18;
        Iterable iterableK;
        Float fValueOf;
        float f15;
        oVar.getClass();
        fVar.getClass();
        fVar2.getClass();
        fVar3.getClass();
        eVar.getClass();
        p3.o0 o0VarE = mVar.E(517395140);
        int i17 = (i15 & 6) == 0 ? (o0VarE.r(oVar) ? 4 : 2) | i15 : i15;
        if ((i15 & 48) == 0) {
            i17 |= (i15 & 64) == 0 ? o0VarE.B(fVar) : o0VarE.r(fVar) ? 32 : 16;
        }
        if ((i15 & 384) == 0) {
            i17 |= (i15 & 512) == 0 ? o0VarE.B(fVar2) : o0VarE.r(fVar2) ? 256 : 128;
        }
        if ((i15 & 3072) == 0) {
            i17 |= (i15 & 4096) == 0 ? o0VarE.B(fVar3) : o0VarE.r(fVar3) ? 2048 : 1024;
        }
        if ((i15 & 24576) == 0) {
            i17 |= (32768 & i15) == 0 ? o0VarE.B(fVar4) : o0VarE.r(fVar4) ? 16384 : 8192;
        }
        if ((196608 & i15) == 0) {
            i17 |= o0VarE.k(vVar == null ? -1 : vVar.ordinal()) ? 131072 : 65536;
        }
        if ((1572864 & i15) == 0) {
            i17 |= o0VarE.h(z14) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((12582912 & i15) == 0) {
            i17 |= o0VarE.k(i14) ? 8388608 : 4194304;
        }
        if ((100663296 & i15) == 0) {
            i17 |= o0VarE.r(arrayList) ? 67108864 : 33554432;
        }
        if ((805306368 & i15) == 0) {
            i17 |= o0VarE.r(eVar) ? 536870912 : 268435456;
        }
        int i18 = i17;
        if (o0VarE.n(i18 & 1, (i18 & 306783379) != 306783378)) {
            x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            v21.f fVar6 = v21.f.f175333a;
            fVar6.getClass();
            boolean zR = v21.f.r(fVar2, fVar3);
            f02.u.f67749a.getClass();
            long jC = f02.u.c(o0VarE);
            long jB = f02.u.b(o0VarE);
            long jD = f02.u.d(o0VarE);
            long jA = f02.u.a(o0VarE);
            if (vVar == null) {
                o0VarE.C(-917963570);
                o0VarE.g0(false);
                d0VarA = null;
            } else {
                o0VarE.C(-999443053);
                long jA2 = g21.w.a(vVar, o0VarE);
                o0VarE.g0(false);
                d0VarA = o4.d0.a(jA2);
            }
            if (i14 == 7) {
                o0VarE.C(-917899957);
                fG = w02.b0.g(v21.d.f175297a, o0VarE);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-917843506);
                fG = w02.b0.g(v21.d.f175298b, o0VarE);
                o0VarE.g0(false);
            }
            if (vVar == null) {
                z15 = false;
            } else if (fVar4 == null || fVar4.isEmpty()) {
                z15 = true;
            } else {
                z15 = false;
            }
            o13.p pVarC = v21.f.c(fVar6, fVar4);
            boolean z19 = z15;
            Float f16 = (Float) pVarC.f128594a;
            Float f17 = (Float) pVarC.f128595b;
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            long jA3 = f02.u.a(o0VarE);
            float f18 = fG;
            long jB2 = f02.u.b(o0VarE);
            long jD2 = f02.u.d(o0VarE);
            ArrayList arrayList4 = new ArrayList(p13.y.r(fVar, 10));
            Iterator<E> it = fVar.iterator();
            while (it.hasNext()) {
                arrayList4.add(Float.valueOf(((m92.h0.e.a) it.next()).f117346a));
            }
            ArrayList arrayList5 = new ArrayList(p13.y.r(fVar2, 10));
            Iterator<E> it3 = fVar2.iterator();
            while (it3.hasNext()) {
                arrayList5.add(Float.valueOf(((m92.h0.e.a) it3.next()).f117346a));
            }
            ArrayList arrayListC0 = p13.h0.C0(arrayList4, arrayList5);
            ArrayList arrayList6 = new ArrayList(p13.y.r(fVar3, 10));
            Iterator<E> it4 = fVar3.iterator();
            while (it4.hasNext()) {
                arrayList6.add(Float.valueOf(((m92.h0.e.a) it4.next()).f117346a));
            }
            List listM0 = p13.h0.M0(p13.h0.g1(p13.h0.C0(arrayListC0, arrayList6)));
            int iA = t0.a(p13.y.r(fVar, 10));
            if (iA < 16) {
                iA = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
            for (Object obj : fVar) {
                linkedHashMap.put(Float.valueOf(((m92.h0.e.a) obj).f117346a), obj);
                listM0 = listM0;
            }
            List list = listM0;
            int iA2 = t0.a(p13.y.r(fVar2, 10));
            if (iA2 < 16) {
                iA2 = 16;
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(iA2);
            for (Iterator it5 = fVar2.iterator(); it5.hasNext(); it5 = it5) {
                Object next = it5.next();
                linkedHashMap2.put(Float.valueOf(((m92.h0.e.a) next).f117346a), next);
            }
            int iA3 = t0.a(p13.y.r(fVar3, 10));
            if (iA3 < 16) {
                iA3 = 16;
            }
            LinkedHashMap linkedHashMap3 = new LinkedHashMap(iA3);
            for (Iterator it6 = fVar3.iterator(); it6.hasNext(); it6 = it6) {
                Object next2 = it6.next();
                linkedHashMap3.put(Float.valueOf(((m92.h0.e.a) next2).f117346a), next2);
            }
            Iterator it7 = list.iterator();
            while (it7.hasNext()) {
                float fFloatValue = ((Number) it7.next()).floatValue();
                Iterator it8 = it7;
                m92.h0.e.a aVar = (m92.h0.e.a) linkedHashMap.get(Float.valueOf(fFloatValue));
                LinkedHashMap linkedHashMap4 = linkedHashMap;
                m92.h0.e.a aVar2 = (m92.h0.e.a) linkedHashMap2.get(Float.valueOf(fFloatValue));
                Float fValueOf2 = aVar2 != null ? Float.valueOf(aVar2.f117347b) : null;
                LinkedHashMap linkedHashMap5 = linkedHashMap2;
                m92.h0.e.a aVar3 = (m92.h0.e.a) linkedHashMap3.get(Float.valueOf(fFloatValue));
                if (aVar3 != null) {
                    f15 = aVar3.f117347b;
                } else {
                    if (aVar != null) {
                        f15 = aVar.f117347b;
                    } else {
                        fValueOf = null;
                    }
                    if (aVar != null && fValueOf2 != null && fValueOf != null && !p005kotlin.jvm.internal.s.f(fValueOf, fValueOf2)) {
                        m92.h0.e.a aVar4 = new m92.h0.e.a(fFloatValue, fValueOf.floatValue());
                        arrayList2.add(new m92.l0(new m92.h0.e.b(aVar4, jA3, null), true, false, 4, null));
                        arrayList3.add(aVar4);
                    }
                    if (aVar != null) {
                        float f19 = aVar.f117347b;
                        if (fValueOf2 == null && p005kotlin.jvm.internal.s.f(fValueOf, fValueOf2)) {
                            arrayList2.add(new m92.l0(new m92.h0.e.b(aVar, jB2, null), true, false, 4, null));
                            arrayList3.add(aVar);
                        } else if (fValueOf == null && fValueOf.floatValue() > f19) {
                            m92.h0.e.a aVarA = m92.h0.e.a.a(aVar, 0.0f, fValueOf.floatValue(), 1);
                            arrayList2.add(new m92.l0(new m92.h0.e.b(aVarA, jA3, null), true, false, 4, null));
                            arrayList2.add(new m92.l0(new m92.h0.e.b(aVar, jB2, null), true, false, 4, null));
                            arrayList3.add(aVarA);
                        } else if (fValueOf != null || f19 <= fValueOf.floatValue()) {
                            arrayList2.add(new m92.l0(new m92.h0.e.b(aVar, jB2, null), true, false, 4, null));
                            arrayList3.add(aVar);
                        } else {
                            m92.h0.e.a aVarA2 = m92.h0.e.a.a(aVar, 0.0f, fValueOf.floatValue(), 1);
                            arrayList2.add(new m92.l0(new m92.h0.e.b(m92.h0.e.a.a(aVar, 0.0f, f19, 1), jD2, null), true, false, 4, null));
                            arrayList2.add(new m92.l0(new m92.h0.e.b(aVarA2, jB2, null), false, false, 4, null));
                            arrayList3.add(aVar);
                        }
                    }
                    it7 = it8;
                    linkedHashMap = linkedHashMap4;
                    linkedHashMap2 = linkedHashMap5;
                    linkedHashMap3 = linkedHashMap3;
                }
                fValueOf = Float.valueOf(f15);
                if (aVar != null) {
                }
                if (aVar != null) {
                    float f110 = aVar.f117347b;
                    if (fValueOf2 == null) {
                        if (fValueOf == null) {
                        }
                        if (fValueOf != null) {
                            arrayList2.add(new m92.l0(new m92.h0.e.b(aVar, jB2, null), true, false, 4, null));
                            arrayList3.add(aVar);
                        } else {
                            arrayList2.add(new m92.l0(new m92.h0.e.b(aVar, jB2, null), true, false, 4, null));
                            arrayList3.add(aVar);
                        }
                    } else {
                        if (fValueOf == null) {
                        }
                        if (fValueOf != null) {
                            arrayList2.add(new m92.l0(new m92.h0.e.b(aVar, jB2, null), true, false, 4, null));
                            arrayList3.add(aVar);
                        } else {
                            arrayList2.add(new m92.l0(new m92.h0.e.b(aVar, jB2, null), true, false, 4, null));
                            arrayList3.add(aVar);
                        }
                    }
                }
                it7 = it8;
                linkedHashMap = linkedHashMap4;
                linkedHashMap2 = linkedHashMap5;
                linkedHashMap3 = linkedHashMap3;
            }
            o13.p pVar = new o13.p(arrayList2, i53.a.j(arrayList3));
            x1 x1Var2 = p3.n.f135158a;
            List list2 = (List) pVar.f128594a;
            i53.f fVar7 = (i53.f) pVar.f128595b;
            o0VarE.C(-999417547);
            ArrayList arrayList7 = new ArrayList();
            if (z19) {
                fVar5 = fVar2;
                i16 = i14;
                z16 = false;
                lVar = null;
                o0VarE.C(1649715878);
                o0VarE.g0(false);
            } else {
                o0VarE.C(1646443673);
                List listC = p13.w.c(new j82.f(gl1.y.Q(o0VarE, R.string.lbl_calories), new j82.g.a(jB, null), null, 4, null));
                if (zR) {
                    o0VarE.C(1646626480);
                    iterableK = p13.x.k(new j82.f(gl1.y.Q(o0VarE, R.string.lbl_adjusted_goal), new j82.g.a(jA, null), null, 4, null), new j82.f(gl1.y.Q(o0VarE, R.string.lbl_caloric_surplus), new j82.g.a(jD, null), null, 4, null));
                    z18 = false;
                    o0VarE.g0(false);
                } else {
                    z18 = false;
                    o0VarE.C(1647116187);
                    o0VarE.g0(false);
                    iterableK = p13.j0.f134944a;
                }
                ArrayList arrayListC1 = p13.h0.C0(listC, iterableK);
                i16 = i14;
                float f22 = i16;
                v21.f fVar8 = v21.f.f175333a;
                ArrayList arrayListC2 = p13.h0.C0(p13.h0.C0(fVar, fVar2), fVar7);
                fVar8.getClass();
                z16 = z18;
                arrayList7.add(new g21.y(l0.c(f18, jB, f22, v21.f.j(arrayListC2), list2, o0VarE), fVar, arrayListC1, p13.w.c(new k(fVar, jB, z16 ? 1 : 0))));
                fVar5 = fVar2;
                lVar = null;
                arrayList7.add(new g21.y(l0.d(fVar5, f22, Float.valueOf(v21.f.j(p13.h0.C0(p13.h0.C0(fVar, fVar2), fVar7))), o0VarE, (i18 >> 6) & 14), fVar5, p13.w.c(new j82.f(gl1.y.Q(o0VarE, R.string.lbl_goal), new j82.g.e(jC, null), null, 4, null)), p13.w.c(new k(fVar5, jC, 1))));
                o0VarE.g0(z16);
            }
            if (vVar == null || (d0Var = d0VarA) == null) {
                z17 = z16;
                o0Var = o0VarE;
                f14 = f17;
                o0Var.C(1651316966);
                o0Var.g0(z17);
            } else {
                o0VarE.C(1649829338);
                if (fVar4 == null) {
                    o0VarE.C(1649901040);
                    o0VarE.g0(z16);
                    lVar2 = lVar;
                    f14 = f17;
                } else {
                    o0VarE.C(1649901041);
                    e23.l lVarE = l0.e(fVar4, i16, f16, f17, d0Var.f128833a, o0VarE);
                    f14 = f17;
                    o0VarE.g0(z16);
                    lVar2 = lVarE;
                }
                if (fVar4 != null) {
                    o0VarE = o0VarE;
                    fVarB = i53.a.j(fVar4);
                    if (fVarB == null) {
                        o0VarE = o0VarE;
                        fVarB = j53.l.b();
                    }
                } else {
                    o0VarE = o0VarE;
                    fVarB = j53.l.b();
                }
                o0Var = o0VarE;
                arrayList7.add(new g21.y(lVar2, fVarB, l0.h(z19, vVar, zR, o0VarE, (i18 >> 12) & 112, 0), p13.w.c(new l(fVar4, context, vVar, d0Var, 0))));
                z17 = false;
                o0Var.g0(false);
            }
            o0Var.g0(z17);
            String strQ = gl1.y.Q(o0Var, R.string.lbl_daily_calories);
            v21.f.f175333a.getClass();
            p3.o0 o0Var2 = o0Var;
            l0.a(oVar, strQ, arrayList7, gl1.y.Q(o0Var, (vVar == null || !z14) ? R.string.weight_no_data_for_time_period : R.string.common_no_data), z14, arrayList, Float.valueOf(v21.f.j(p13.h0.C0(p13.h0.C0(fVar5, fVar), fVar7))), f16, f14, eVar, o0Var2, (i18 & 14) | (57344 & (i18 >> 6)) | ((i18 >> 9) & 458752) | (i18 & 1879048192), 0);
            o0VarE = o0Var2;
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e2.b(oVar, fVar, fVar2, fVar3, fVar4, vVar, z14, i14, arrayList, eVar, i15);
        }
    }
}
