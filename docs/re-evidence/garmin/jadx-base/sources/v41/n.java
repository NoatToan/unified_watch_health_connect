package v41;

import android.content.Context;
import c22.l3;
import c22.m3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.courses.model.GeoPointDTO;
import com.garmin.android.apps.connectmobile.pacepro.data.dto.PaceBandSplitDTO;
import gg1.o0;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeSet;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.c1;
import p13.m0;
import p13.p0;
import r53.z1;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.pacepro.domain.usecase.PlanChartUseCase$updatePaceProChartState$2", f = "PlanChartUseCase.kt", l = {}, m = "invokeSuspend", v = 2)
public final class n extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o f175643a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(o oVar, t13.d<? super n> dVar) {
        super(2, dVar);
        this.f175643a = oVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new n(this.f175643a, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((n) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:125:0x034b  */
    /* JADX WARN: Code duplicated, block: B:134:0x0379  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v5, types: [p13.j0] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.util.ArrayList] */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        o51.b bVar;
        u41.b value;
        boolean z14;
        Float fValueOf;
        Float fValueOf2;
        List<PaceBandSplitDTO> list;
        i53.c cVarA;
        i53.c<m92.h0.e.a> cVarE;
        Float fValueOf3;
        Float fValueOf4;
        Float fValueOf5;
        ?? arrayList;
        Object next;
        int iIndexOf;
        m92.h0.e.a aVar;
        o51.a aVar2;
        Object next2;
        Iterable<o13.p> iterable;
        m92.h0.e.a aVar3;
        List listC;
        u13.a aVar4 = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        o oVar = this.f175643a;
        u41.b value2 = oVar.f175645b.getValue();
        com.garmin.android.apps.connectmobile.pacepro.data.dto.a aVar5 = value2.f168609a;
        double d14 = aVar5.f39760b.f() ? 1000.0d : 1609.344d;
        com.garmin.android.apps.connectmobile.pacepro.data.dto.b bVar2 = aVar5.f39760b;
        float f14 = (float) (bVar2.f39773j / (bVar2.f39770g / d14));
        float f15 = value2.f168613e;
        float f16 = value2.f168612d;
        boolean zF = aVar5.f39760b.f();
        boolean zContains = p13.x.k(o0.METRIC, o0.STATUTE_UK).contains(oVar.f175647d.g());
        List<PaceBandSplitDTO> list2 = aVar5.f39759a;
        com.garmin.android.apps.connectmobile.courses.model.e value3 = oVar.f175646c.getValue();
        y41.b bVar3 = new y41.b(f14, f15, f16, zF, zContains, list2, value3 != null ? value3.geoPoints : null);
        Context context = oVar.f175644a;
        List<PaceBandSplitDTO> list3 = bVar3.f194477f;
        PaceBandSplitDTO paceBandSplitDTO = (PaceBandSplitDTO) p13.h0.n0(list3);
        if (paceBandSplitDTO != null) {
            double cumulativeDistanceFromStart = paceBandSplitDTO.getCumulativeDistanceFromStart();
            int i14 = 6;
            j23.l lVar = new j23.l(0, 6);
            ArrayList arrayList2 = new ArrayList(p13.y.r(lVar, 10));
            Iterator<Integer> it = lVar.iterator();
            while (true) {
                boolean z15 = ((j23.k) it).f96801c;
                z14 = bVar3.f194475d;
                if (!z15) {
                    break;
                }
                int iNextInt = ((p0) it).nextInt();
                l3.a aVar6 = l3.f23124b;
                double d15 = ((double) iNextInt) * (cumulativeDistanceFromStart / ((double) i14));
                m3 m3Var = z14 ? m3.KILOMETER : m3.MILE;
                DecimalFormat decimalFormat = l3.f23125c;
                aVar6.getClass();
                arrayList2.add(l3.a.N(d15, m3Var, decimalFormat));
                i14 = 6;
            }
            i53.c cVarE2 = i53.a.e(arrayList2);
            double d16 = z14 ? 1000.0d : 1609.344d;
            ArrayList arrayList3 = new ArrayList();
            Iterator it3 = list3.iterator();
            double d17 = 0.0d;
            int i15 = 0;
            double d18 = 0.0d;
            while (true) {
                if (!it3.hasNext()) {
                    ArrayList arrayList4 = new ArrayList(arrayList3);
                    float f17 = (float) d17;
                    m92.h0.e.a aVar7 = (m92.h0.e.a) p13.h0.n0(arrayList4);
                    arrayList4.add(new m92.h0.e.a(f17, aVar7 != null ? aVar7.f117347b : 0.0f));
                    Iterator it4 = arrayList4.iterator();
                    if (it4.hasNext()) {
                        float fMax = ((m92.h0.e.a) it4.next()).f117347b;
                        while (it4.hasNext()) {
                            fMax = Math.max(fMax, ((m92.h0.e.a) it4.next()).f117347b);
                        }
                        fValueOf = Float.valueOf(fMax);
                    } else {
                        fValueOf = null;
                    }
                    float fFloatValue = fValueOf != null ? fValueOf.floatValue() : 3600.0f;
                    Iterator it5 = arrayList4.iterator();
                    if (it5.hasNext()) {
                        float fMin = ((m92.h0.e.a) it5.next()).f117347b;
                        while (it5.hasNext()) {
                            fMin = Math.min(fMin, ((m92.h0.e.a) it5.next()).f117347b);
                        }
                        fValueOf2 = Float.valueOf(fMin);
                    } else {
                        fValueOf2 = null;
                    }
                    float fFloatValue2 = fValueOf2 != null ? fValueOf2.floatValue() : 60.0f;
                    Integer numValueOf = Integer.valueOf(R.color.gcm_pace_pro_avg);
                    float f18 = bVar3.f194472a;
                    boolean z16 = fFloatValue2 <= f18 && f18 <= fFloatValue;
                    boolean z17 = Math.abs(fFloatValue2 - fFloatValue) < 0.01f * f18;
                    if (!z16 || z17) {
                        list = list3;
                        cVarA = i53.a.a(new o13.p(Float.valueOf(0.0f), numValueOf), new o13.p(Float.valueOf(1.0f), numValueOf));
                    } else {
                        float f19 = 5;
                        float f22 = (f18 - fFloatValue2) / f19;
                        float f24 = (fFloatValue - f18) / f19;
                        float f25 = bVar3.f194473b;
                        float f26 = bVar3.f194474c;
                        float f27 = f25 - f26;
                        ArrayList arrayList5 = new ArrayList();
                        int i16 = 0;
                        for (int i17 = 5; i16 < i17; i17 = 5) {
                            float f28 = i16 + 0.5f;
                            arrayList5.add(new o13.p(Float.valueOf((((f28 * f22) + fFloatValue2) - f26) / f27), y41.b.f194471i.get(i16)));
                            arrayList5.add(new o13.p(Float.valueOf((((f28 * f24) + f18) - f26) / f27), y41.b.f194470h.get(i16)));
                            i16++;
                            list3 = list3;
                        }
                        list = list3;
                        List listN0 = p13.h0.N0(arrayList5, new y41.c());
                        HashSet hashSet = new HashSet();
                        ArrayList arrayList6 = new ArrayList();
                        for (Object obj2 : listN0) {
                            if (hashSet.add(Float.valueOf(((Number) ((o13.p) obj2).f128594a).floatValue()))) {
                                arrayList6.add(obj2);
                            }
                        }
                        cVarA = i53.a.e(arrayList6);
                    }
                    i53.c cVar = cVarA;
                    if (list.size() == 1 && (aVar3 = (m92.h0.e.a) p13.h0.n0(arrayList4)) != null) {
                        f18 = aVar3.f117347b;
                    }
                    float f29 = f18;
                    List<GeoPointDTO> list4 = bVar3.f194478g;
                    if (list4 != null) {
                        ArrayList arrayList7 = new ArrayList(p13.y.r(list4, 10));
                        for (GeoPointDTO geoPointDTO : list4) {
                            Double d19 = geoPointDTO.distance;
                            float fDoubleValue = (float) (d19 != null ? d19.doubleValue() : 0.0d);
                            Double d24 = geoPointDTO.elevation;
                            arrayList7.add(new m92.h0.e.a(fDoubleValue, (float) (d24 != null ? d24.doubleValue() : 0.0d)));
                        }
                        cVarE = i53.a.e(arrayList7);
                    } else {
                        cVarE = null;
                    }
                    boolean z18 = bVar3.f194476e;
                    if (!z18) {
                        if (cVarE != null) {
                            ArrayList arrayList8 = new ArrayList(p13.y.r(cVarE, 10));
                            for (m92.h0.e.a aVar8 : cVarE) {
                                float f34 = aVar8.f117346a;
                                l3.a aVar9 = l3.f23124b;
                                double d25 = aVar8.f117347b;
                                aVar9.getClass();
                                arrayList8.add(new m92.h0.e.a(f34, (float) (d25 * 3.2808399d)));
                            }
                            cVarE = i53.a.e(arrayList8);
                        } else {
                            cVarE = null;
                        }
                    }
                    if (cVarE != null) {
                        Iterator it6 = cVarE.iterator();
                        if (it6.hasNext()) {
                            float fMax2 = ((m92.h0.e.a) it6.next()).f117347b;
                            while (it6.hasNext()) {
                                fMax2 = Math.max(fMax2, ((m92.h0.e.a) it6.next()).f117347b);
                            }
                            fValueOf3 = Float.valueOf(fMax2);
                        } else {
                            fValueOf3 = null;
                        }
                    } else {
                        fValueOf3 = null;
                    }
                    if (cVarE != null) {
                        Iterator it7 = cVarE.iterator();
                        if (it7.hasNext()) {
                            float fMin2 = ((m92.h0.e.a) it7.next()).f117347b;
                            while (it7.hasNext()) {
                                fMin2 = Math.min(fMin2, ((m92.h0.e.a) it7.next()).f117347b);
                            }
                            fValueOf4 = Float.valueOf(fMin2);
                        } else {
                            fValueOf4 = null;
                        }
                    } else {
                        fValueOf4 = null;
                    }
                    if (fValueOf3 == null || fValueOf4 == null) {
                        fValueOf5 = null;
                    } else {
                        float fFloatValue3 = fValueOf3.floatValue() - fValueOf4.floatValue();
                        if (fFloatValue3 < 50.0f) {
                            fFloatValue3 = 50.0f;
                        }
                        fValueOf5 = Float.valueOf(fFloatValue3);
                    }
                    Float fValueOf6 = (fValueOf5 == null || fValueOf3 == null) ? null : Float.valueOf(fValueOf5.floatValue() + fValueOf3.floatValue());
                    if (cVarE == null) {
                        Iterator it8 = arrayList4.iterator();
                        if (it8.hasNext()) {
                            ArrayList arrayList9 = new ArrayList();
                            Object next3 = it8.next();
                            while (it8.hasNext()) {
                                Object next4 = it8.next();
                                arrayList9.add(new o13.p(next3, next4));
                                next3 = next4;
                            }
                            iterable = arrayList9;
                        } else {
                            iterable = p13.j0.f134944a;
                        }
                        ArrayList arrayList10 = new ArrayList();
                        for (o13.p pVar : iterable) {
                            m92.h0.e.a aVar10 = (m92.h0.e.a) pVar.f128594a;
                            float f35 = ((m92.h0.e.a) pVar.f128595b).f117346a - aVar10.f117346a;
                            int i18 = (int) (f35 / 10.0f);
                            j23.l lVarO = j23.t.o(0, i18);
                            ArrayList arrayList11 = new ArrayList(p13.y.r(lVarO, 10));
                            Iterator<Integer> it9 = lVarO.iterator();
                            while (((j23.k) it9).f96801c) {
                                arrayList11.add(new m92.h0.e.a(((((p0) it9).nextInt() / i18) * f35) + aVar10.f117346a, aVar10.f117347b));
                            }
                            p13.d0.v(arrayList10, arrayList11);
                        }
                        arrayList4 = p13.h0.C0(arrayList10, p13.w.c(p13.h0.m0(arrayList4)));
                    }
                    i53.c cVarE3 = i53.a.e(arrayList4);
                    TreeSet treeSet = new TreeSet();
                    ArrayList arrayList12 = new ArrayList(p13.y.r(arrayList4, 10));
                    Iterator it10 = arrayList4.iterator();
                    while (it10.hasNext()) {
                        arrayList12.add(Float.valueOf(((m92.h0.e.a) it10.next()).f117346a));
                    }
                    LinkedHashSet linkedHashSetH = c1.h(treeSet, arrayList12);
                    if (cVarE != null) {
                        arrayList = new ArrayList(p13.y.r(cVarE, 10));
                        Iterator it11 = cVarE.iterator();
                        while (it11.hasNext()) {
                            arrayList.add(Float.valueOf(((m92.h0.e.a) it11.next()).f117346a));
                        }
                    } else {
                        arrayList = p13.j0.f134944a;
                    }
                    LinkedHashSet linkedHashSetH2 = c1.h(linkedHashSetH, arrayList);
                    ArrayList arrayList13 = new ArrayList();
                    Iterator it12 = linkedHashSetH2.iterator();
                    while (it12.hasNext()) {
                        float fFloatValue4 = ((Number) it12.next()).floatValue();
                        Iterator it13 = arrayList4.iterator();
                        do {
                            if (!it13.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it13.next();
                        } while (((m92.h0.e.a) next).f117346a < fFloatValue4);
                        m92.h0.e.a aVar11 = (m92.h0.e.a) next;
                        if (aVar11 == null) {
                            aVar2 = null;
                        } else {
                            if (aVar11.f117346a == fFloatValue4) {
                                Iterator it14 = p13.h0.j1(arrayList4).iterator();
                                Object obj3 = null;
                                while (true) {
                                    p13.o0 o0Var = (p13.o0) it14;
                                    if (!o0Var.f134956a.hasNext()) {
                                        break;
                                    }
                                    Object next5 = o0Var.next();
                                    m92.h0.e.a aVar12 = (m92.h0.e.a) ((m0) next5).f134952b;
                                    List<Integer> list5 = y41.b.f194470h;
                                    aVar12.getClass();
                                    if (aVar12.f117346a == fFloatValue4) {
                                        obj3 = next5;
                                    }
                                }
                                m0 m0Var = (m0) obj3;
                                iIndexOf = m0Var != null ? m0Var.f134951a : -1;
                            } else {
                                iIndexOf = arrayList4.indexOf(aVar11);
                            }
                            m92.h0.e.a aVar13 = (m92.h0.e.a) arrayList4.get(iIndexOf);
                            if (cVarE != null) {
                                Iterator it15 = cVarE.iterator();
                                if (it15.hasNext()) {
                                    next2 = it15.next();
                                    if (it15.hasNext()) {
                                        float fAbs = Math.abs(((m92.h0.e.a) next2).f117346a - fFloatValue4);
                                        do {
                                            Object next6 = it15.next();
                                            float fAbs2 = Math.abs(((m92.h0.e.a) next6).f117346a - fFloatValue4);
                                            if (Float.compare(fAbs, fAbs2) > 0) {
                                                next2 = next6;
                                                fAbs = fAbs2;
                                            }
                                        } while (it15.hasNext());
                                    }
                                } else {
                                    next2 = null;
                                }
                                aVar = (m92.h0.e.a) next2;
                            } else {
                                aVar = null;
                            }
                            l3.a aVar14 = l3.f23124b;
                            double d26 = aVar13.f117347b;
                            aVar14.getClass();
                            String strX0 = l3.a.x0(context, d26, bVar3.f194475d, true, "");
                            aVar2 = new o51.a(fFloatValue4, l3.a.Q(context, fFloatValue4, l3.f23125c, true, bVar3.f194475d), strX0, aVar != null ? l3.a.Z(context, aVar.f117347b, z18 ? o0.METRIC : o0.STATUTE_US, false, l3.f23131i) : null);
                        }
                        if (aVar2 != null) {
                            arrayList13.add(aVar2);
                        }
                    }
                    bVar = new o51.b(cVarE3, cVar, cVarE, cVarE2, i53.a.e(arrayList13), bVar3.f194473b, bVar3.f194474c, f29, fValueOf6, fValueOf4, bVar3.f194475d);
                    break;
                }
                Object next7 = it3.next();
                int i19 = i15 + 1;
                if (i15 < 0) {
                    p13.x.q();
                    throw null;
                }
                PaceBandSplitDTO paceBandSplitDTO2 = (PaceBandSplitDTO) next7;
                Float splitTime = paceBandSplitDTO2.getSplitTime();
                float fFloatValue5 = splitTime != null ? splitTime.floatValue() : 0.0f;
                double splitDistance = paceBandSplitDTO2.getSplitDistance();
                double d27 = ((double) fFloatValue5) / (splitDistance / d16);
                if (i15 != 0) {
                    float f36 = (float) d17;
                    listC = p13.x.k(new m92.h0.e.a(f36, (float) d18), new m92.h0.e.a(f36, (float) d27));
                } else {
                    listC = p13.w.c(new m92.h0.e.a((float) d17, (float) d27));
                }
                d17 += splitDistance;
                p13.d0.v(arrayList3, listC);
                d18 = d27;
                i15 = i19;
            }
        } else {
            bVar = null;
        }
        z1<u41.b> z1Var = oVar.f175645b;
        do {
            value = z1Var.getValue();
        } while (!z1Var.b(value, u41.b.a(value, null, null, null, 0, 0, null, bVar, null, null, null, null, false, false, false, 16319)));
        return Unit.INSTANCE;
    }
}
