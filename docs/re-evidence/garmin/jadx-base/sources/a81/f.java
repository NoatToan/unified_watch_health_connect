package a81;

import c22.c0;
import com.garmin.android.apps.connectmobile.R;
import g81.d0;
import g81.e0;
import g81.f0;
import g81.g0;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p13.h0;
import p13.p0;
import p13.x;
import p13.y;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"La81/f;", "", "<init>", "()V", "gcm-performance-scores_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f1960a = new f();

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t7, T t14) {
            return r13.a.b((Float) ((o13.p) t7).f128594a, (Float) ((o13.p) t14).f128594a);
        }
    }

    private f() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, java.util.List] */
    public static i53.c a(int i14, List list, List list2) {
        float fFloatValue;
        int iW0 = (int) h0.w0(list);
        int iR0 = (int) h0.r0(list);
        c0 c0Var = new c0(list, list2);
        ArrayList arrayList = new ArrayList();
        int i15 = 0;
        int i16 = 0;
        for (Object obj : list) {
            int i17 = i16 + 1;
            if (i16 < 0) {
                x.q();
                throw null;
            }
            float fFloatValue2 = ((Number) obj).floatValue();
            int i18 = (int) fFloatValue2;
            if (iW0 <= i18 && i18 <= iR0) {
                arrayList.add(new o13.p(Float.valueOf(fFloatValue2), list2.get(i16)));
            }
            i16 = i17;
        }
        j23.j jVarN = j23.t.n(i14, j23.t.o(iW0, iR0));
        int i19 = jVarN.f96796a;
        int i24 = jVarN.f96797b;
        int i25 = jVarN.f96798c;
        if ((i25 > 0 && i19 <= i24) || (i25 < 0 && i24 <= i19)) {
            while (true) {
                float f14 = i19;
                ?? r14 = c0Var.f23013c;
                if (r14.isEmpty()) {
                    fFloatValue = Float.NaN;
                } else {
                    Float fValueOf = Float.valueOf(f14);
                    List<Float> list3 = c0Var.f23011a;
                    int iG = x.g(list3, fValueOf);
                    if (iG < 0) {
                        iG = -(iG + 1);
                    }
                    int iMax = Math.max(i15, iG - 1);
                    float fFloatValue3 = (f14 - list3.get(iMax).floatValue()) / (list3.get(iMax + 1).floatValue() - list3.get(iMax).floatValue());
                    int iMin = Math.min(iG, list3.size() - 1);
                    float f15 = 2;
                    double d14 = fFloatValue3;
                    double d15 = 3;
                    float f16 = 3;
                    double d16 = 2;
                    float fPow = ((((float) Math.pow(d14, d15)) * f15) - (((float) Math.pow(d14, d16)) * f16)) + 1;
                    List<Float> list4 = c0Var.f23012b;
                    fFloatValue = (((Number) r14.get(iMin)).floatValue() * (list3.get(iMin).floatValue() - list3.get(iMax).floatValue()) * (((float) Math.pow(d14, d15)) - ((float) Math.pow(d14, d16)))) + (list4.get(iMin).floatValue() * ((((float) Math.pow(d14, d16)) * f16) + (((float) Math.pow(d14, d15)) * (-2)))) + (((Number) r14.get(iMax)).floatValue() * (list3.get(iMin).floatValue() - list3.get(iMax).floatValue()) * ((((float) Math.pow(d14, d15)) - (((float) Math.pow(d14, d16)) * f15)) + fFloatValue3)) + (list4.get(iMax).floatValue() * fPow);
                }
                arrayList.add(new o13.p(Float.valueOf(f14), Float.valueOf(fFloatValue)));
                int i26 = i19;
                if (i26 == i24) {
                    break;
                }
                i19 = i26 + i25;
                c0Var = c0Var;
                arrayList = arrayList;
                i25 = i25;
                i15 = 0;
            }
        } else {
            arrayList = arrayList;
        }
        i53.c<o13.p> cVarE = i53.a.e(h0.N0(arrayList, new g()));
        ArrayList arrayList2 = new ArrayList(y.r(cVarE, 10));
        for (o13.p pVar : cVarE) {
            arrayList2.add(new g0(((Number) pVar.f128594a).floatValue(), ((Number) pVar.f128595b).floatValue()));
        }
        return i53.a.e(arrayList2);
    }

    /* JADX WARN: Code duplicated, block: B:77:0x028f  */
    public static g81.b b(l22.b bVar, String str, boolean z14, ArrayList arrayList, List list, List list2, List list3, List list4, int i14, String str2, String str3, e23.l lVar, e23.l lVar2, e23.p pVar, k kVar) {
        int i15;
        Integer numI;
        Integer numI2;
        String str4;
        int iSignum;
        Integer numValueOf;
        g81.a aVar;
        String str5;
        e23.l lVar3 = lVar;
        n23.j.x(str, list, list2, list3, list4);
        float fMax = Math.max(h0.r0(list3), h0.r0(list4));
        float fMax2 = Math.max(h0.r0(list), h0.r0(list2));
        float fMin = Math.min(h0.w0(list), h0.w0(list2));
        i53.c cVarE = e(arrayList, list3, list);
        i53.c cVarE2 = e(arrayList, list4, list2);
        i53.c cVarA = a(i14, h0.G0(list3), h0.G0(list));
        i53.c cVarA2 = a(i14, h0.G0(list4), h0.G0(list2));
        i53.c cVarD = d(Math.max(h0.r0(list4), h0.r0(list3)), h0.G0(arrayList), h0.G0(list4));
        ArrayList arrayListG = g(h0.G0(list3), h0.G0(list), h0.G0(list4), h0.G0(list2), i14);
        i53.c cVarF = f(list3, list, list4, list2);
        i53.f fVarJ = i53.a.j(h(fMax, lVar3));
        boolean z15 = am.j.z(f12.l.f68084a);
        if (z14) {
            i15 = R.string.lbl_watts;
        } else {
            i15 = z15 ? R.string.lbl_pace_unit_km : R.string.lbl_pace_unit_mi;
        }
        String string = bVar.getString(i15);
        i53.c cVarE3 = i53.a.e(arrayListG);
        ArrayList arrayList2 = new ArrayList(y.r(cVarA, 10));
        Iterator<E> it = cVarA.iterator();
        while (it.hasNext()) {
            arrayList2.add(Float.valueOf(((g0) it.next()).f76332a));
        }
        List listG0 = h0.G0(list3);
        ArrayList arrayList3 = new ArrayList(y.r(cVarA, 10));
        Iterator<E> it3 = cVarA.iterator();
        while (it3.hasNext()) {
            arrayList3.add(Float.valueOf(((g0) it3.next()).f76333b));
        }
        ArrayList arrayList4 = new ArrayList(y.r(cVarA2, 10));
        Iterator<E> it4 = cVarA2.iterator();
        while (it4.hasNext()) {
            arrayList4.add(Float.valueOf(((g0) it4.next()).f76332a));
        }
        List listG1 = h0.G0(list4);
        ArrayList arrayList5 = new ArrayList(y.r(cVarA2, 10));
        Iterator<E> it5 = cVarA2.iterator();
        while (it5.hasNext()) {
            arrayList5.add(Float.valueOf(((g0) it5.next()).f76333b));
            cVarA2 = cVarA2;
        }
        i53.c cVar = cVarA2;
        List listG2 = h0.G0(arrayList);
        String string2 = bVar.getString(z14 ? R.string.no_value : R.string.no_duration_value);
        j23.j jVarN = j23.t.n(i14, new j23.l((int) Math.min(h0.w0(arrayList2), h0.w0(arrayList4)), (int) Math.max(h0.r0(arrayList2), h0.r0(arrayList4))));
        ArrayList arrayList6 = new ArrayList();
        Iterator<Integer> it6 = jVarN.iterator();
        while (((j23.k) it6).f96801c) {
            float fNextInt = ((p0) it6).nextInt();
            int iG = x.g(arrayList2, Float.valueOf(fNextInt));
            Iterator<Integer> it7 = it6;
            if (iG < -1) {
                iG = (-iG) + 1;
            }
            i53.f fVar = fVarJ;
            int iG2 = x.g(arrayList4, Float.valueOf(fNextInt));
            if (iG2 < -1) {
                iG2 = (-iG2) + 1;
            }
            Float f14 = (Float) h0.e0(iG, arrayList3);
            Float f15 = (Float) h0.e0(iG2, arrayList5);
            if (f14 == null && f15 == null) {
                listG0 = listG0;
                arrayList3 = arrayList3;
                aVar = null;
            } else {
                Float fValueOf = Float.valueOf(fNextInt);
                String str6 = kVar != null ? (String) kVar.invoke(fValueOf) : (String) lVar3.invoke(fValueOf);
                f fVar2 = f1960a;
                if (f14 != null) {
                    fVar2.getClass();
                    numI = i(fNextInt, listG0, listG2);
                } else {
                    numI = null;
                }
                e0 e0Var = new e0(numI, (f14 == null || (str5 = (String) lVar2.invoke(f14)) == null) ? string2 : str5, string, str2);
                if (f15 != null) {
                    fVar2.getClass();
                    numI2 = i(fNextInt, listG1, listG2);
                } else {
                    numI2 = null;
                }
                if (f15 == null || (str4 = (String) lVar2.invoke(f15)) == null) {
                    str4 = string2;
                }
                e0 e0Var2 = new e0(numI2, str4, string, str3);
                fVar2.getClass();
                Float fValueOf2 = (f14 == null || f15 == null) ? null : Float.valueOf(f15.floatValue() - f14.floatValue());
                if (z14) {
                    if (fValueOf2 != null) {
                        iSignum = (int) Math.signum(fValueOf2.floatValue());
                        numValueOf = Integer.valueOf(iSignum);
                    } else {
                        numValueOf = null;
                    }
                } else if (fValueOf2 != null) {
                    iSignum = -((int) Math.signum(fValueOf2.floatValue()));
                    numValueOf = Integer.valueOf(iSignum);
                } else {
                    numValueOf = null;
                }
                int i16 = R.color.gds_data_viz_neutral_secondary;
                if (numValueOf != null && (!z14 ? numValueOf.intValue() < 0 : numValueOf.intValue() > 0)) {
                    i16 = R.color.gds_data_viz_green_primary;
                }
                aVar = new g81.a(fNextInt, str6, e0Var, e0Var2, new d0(numValueOf, i16, (String) pVar.invoke(f14, f15)));
            }
            if (aVar != null) {
                arrayList6.add(aVar);
            }
            it6 = it7;
            listG1 = listG1;
            lVar3 = lVar;
            fVarJ = fVar;
            listG0 = listG0;
            arrayList3 = arrayList3;
            arrayList4 = arrayList4;
        }
        return new g81.b(str, fMax2, fMin, fMax, 0.0f, cVarA, cVarE, cVar, cVarD, cVarE2, cVarE3, cVarF, fVarJ, i53.a.e(arrayList6), str2, str3);
    }

    public static g81.e c(l22.b bVar, String str, String str2, String str3, boolean z14, List list, List list2, List list3, List list4, ArrayList arrayList, int i14, e23.l lVar, e23.l lVar2, k kVar) {
        g81.d dVar;
        float fMax;
        float fMin;
        List list5 = list4;
        str.getClass();
        str2.getClass();
        str3.getClass();
        list.getClass();
        list2.getClass();
        list3.getClass();
        list5.getClass();
        float fR0 = h0.r0(list);
        float fW0 = h0.w0(list3);
        float fR1 = h0.r0(list5);
        i53.c cVarE = e(arrayList, list5, list2);
        i53.c cVarA = a(i14, h0.G0(list5), h0.G0(list2));
        i53.c cVarD = d(h0.r0(list5), h0.G0(arrayList), h0.G0(list5));
        ArrayList arrayListG = g(h0.G0(list5), h0.G0(list), h0.G0(list5), h0.G0(list3), i14);
        i53.c cVarF = f(list5, list, list5, list3);
        e23.l lVar3 = lVar;
        ArrayList arrayListH = h(fR1, lVar3);
        i53.c cVarE2 = i53.a.e(h0.N0(cVarD, new e()));
        i53.c cVar = cVarE;
        i53.c cVarE3 = i53.a.e(arrayListG);
        i53.c cVarE4 = i53.a.e(arrayListH);
        ArrayList arrayList2 = new ArrayList(y.r(cVarA, 10));
        Iterator<E> it = cVarA.iterator();
        while (it.hasNext()) {
            arrayList2.add(Float.valueOf(((g0) it.next()).f76332a));
        }
        ArrayList arrayList3 = new ArrayList(y.r(cVarA, 10));
        Iterator<E> it3 = cVarA.iterator();
        while (it3.hasNext()) {
            arrayList3.add(Float.valueOf(((g0) it3.next()).f76333b));
        }
        ArrayList arrayList4 = new ArrayList(y.r(arrayListG, 10));
        Iterator it4 = arrayListG.iterator();
        while (it4.hasNext()) {
            arrayList4.add(Float.valueOf(((g81.h0) it4.next()).f76336c));
        }
        ArrayList arrayList5 = new ArrayList(y.r(arrayListG, 10));
        Iterator it5 = arrayListG.iterator();
        while (it5.hasNext()) {
            arrayList5.add(Float.valueOf(((g81.h0) it5.next()).f76335b));
        }
        if (kVar != null) {
            lVar3 = kVar;
        }
        boolean z15 = am.j.z(f12.l.f68084a);
        ArrayList arrayList6 = new ArrayList();
        int i15 = 0;
        for (Object obj : arrayList2) {
            int i16 = i15 + 1;
            if (i15 < 0) {
                x.q();
                throw null;
            }
            float fFloatValue = ((Number) obj).floatValue();
            i53.c cVar2 = cVarA;
            int size = arrayList.size();
            i53.c cVar3 = cVar;
            int i17 = 0;
            int i18 = 0;
            while (i17 < size) {
                int i19 = size;
                int i24 = i17 * 2;
                float fFloatValue2 = ((Number) list5.get(i24)).floatValue();
                int i25 = i17;
                float fFloatValue3 = ((Number) list5.get(i24 + 2)).floatValue();
                float fMin2 = Math.min(fFloatValue2, fFloatValue3);
                if (fFloatValue <= Math.max(fFloatValue2, fFloatValue3) && fMin2 <= fFloatValue) {
                    i18 = i25;
                }
                i17 = i25 + 1;
                size = i19;
            }
            zp1.a.C3847a c3847a = zp1.a.f206590d;
            Integer numValueOf = Integer.valueOf(i18 + 1);
            c3847a.getClass();
            zp1.a aVarA = zp1.a.C3847a.a(numValueOf);
            if (aVarA != null) {
                if (z14) {
                    int i26 = i15 * 2;
                    fMax = Math.min(((Number) arrayList4.get(i26)).floatValue(), ((Number) arrayList5.get(i26)).floatValue());
                } else {
                    int i27 = i15 * 2;
                    fMax = Math.max(((Number) arrayList4.get(i27)).floatValue(), ((Number) arrayList5.get(i27)).floatValue());
                }
                if (z14) {
                    int i28 = i15 * 2;
                    fMin = Math.max(((Number) arrayList4.get(i28)).floatValue(), ((Number) arrayList5.get(i28)).floatValue());
                } else {
                    int i29 = i15 * 2;
                    fMin = Math.min(((Number) arrayList4.get(i29)).floatValue(), ((Number) arrayList5.get(i29)).floatValue());
                }
                dVar = new g81.d(fFloatValue, (String) lVar3.invoke(Float.valueOf(fFloatValue)), (String) lVar2.invoke(arrayList3.get(i15)), bVar.getString(z14 ? R.string.lbl_watts : z15 ? R.string.lbl_pace_unit_km : R.string.lbl_pace_unit_mi), bVar.getString(aVarA.f206596b), aVarA.f206597c, bVar.a(R.string.string_line_string_pattern_no_space, lVar2.invoke(Float.valueOf(fMax)), lVar2.invoke(Float.valueOf(fMin))), str3, str2);
            } else {
                dVar = null;
            }
            if (dVar != null) {
                arrayList6.add(dVar);
            }
            cVarA = cVar2;
            cVar = cVar3;
            list5 = list4;
            i15 = i16;
        }
        return new g81.e(str, str2, fR0, fW0, fR1, 0.0f, cVarA, cVar, cVarE2, cVarE3, cVarF, cVarE4, i53.a.e(arrayList6));
    }

    public static i53.c d(float f14, List list, List list2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new o13.p(Float.valueOf(0.0f), list.get(0)));
        int size = list.size();
        for (int i14 = 0; i14 < size; i14++) {
            arrayList.add(new o13.p(Float.valueOf(((Number) list2.get((i14 * 2) + 1)).floatValue() / f14), list.get(i14)));
        }
        arrayList.add(new o13.p(Float.valueOf(1.0f), list.get(4)));
        return i53.a.e(h0.N0(arrayList, new a()));
    }

    public static i53.c e(ArrayList arrayList, List list, List list2) {
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i14 = 0; i14 < size; i14++) {
            int i15 = (i14 * 2) + 1;
            arrayList2.add(new f0(((Number) list.get(i15)).floatValue(), ((Number) list2.get(i15)).floatValue(), ((Number) arrayList.get(i14)).intValue()));
        }
        return i53.a.e(arrayList2);
    }

    public static i53.c f(List list, List list2, List list3, List list4) {
        ArrayList arrayList = new ArrayList();
        j23.j jVarN = j23.t.n(2, j23.t.o(0, list2.size()));
        int i14 = jVarN.f96796a;
        int i15 = jVarN.f96797b;
        int i16 = jVarN.f96798c;
        if ((i16 > 0 && i14 <= i15) || (i16 < 0 && i15 <= i14)) {
            while (true) {
                float fFloatValue = ((Number) list3.get(i14)).floatValue() == ((Number) list.get(i14)).floatValue() ? ((Number) list3.get(i14)).floatValue() - 1 : ((Number) list3.get(i14)).floatValue();
                int i17 = (((Number) list3.get(i14)).floatValue() > ((Number) list.get(i14)).floatValue() ? 1 : (((Number) list3.get(i14)).floatValue() == ((Number) list.get(i14)).floatValue() ? 0 : -1));
                arrayList.add(i53.a.a(new g0(fFloatValue, ((Number) list4.get(i14)).floatValue()), new g0(((Number) list.get(i14)).floatValue(), ((Number) list2.get(i14)).floatValue())));
                if (i14 == i15) {
                    break;
                }
                i14 += i16;
            }
        }
        return i53.a.e(arrayList.subList(1, arrayList.size() - 1));
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0098  */
    /* JADX WARN: Code duplicated, block: B:30:0x00be  */
    public static ArrayList g(List list, List list2, List list3, List list4, int i14) {
        Float fValueOf;
        Float fValueOf2;
        i53.c cVarA = a(i14, list, list2);
        i53.c cVarA2 = a(i14, list3, list4);
        ArrayList arrayList = new ArrayList(y.r(cVarA, 10));
        Iterator<E> it = cVarA.iterator();
        while (it.hasNext()) {
            arrayList.add(Float.valueOf(((g0) it.next()).f76332a));
        }
        ArrayList arrayList2 = new ArrayList(y.r(cVarA2, 10));
        Iterator<E> it3 = cVarA2.iterator();
        while (it3.hasNext()) {
            arrayList2.add(Float.valueOf(((g0) it3.next()).f76332a));
        }
        List listM0 = h0.M0(h0.C0(arrayList, arrayList2));
        ArrayList arrayList3 = new ArrayList();
        Iterator it4 = listM0.iterator();
        while (it4.hasNext()) {
            float fFloatValue = ((Number) it4.next()).floatValue();
            int iE = x.e(new d(fFloatValue, 0), cVarA, cVarA.size());
            g81.h0 h0Var = null;
            if (iE == -1) {
                fValueOf = null;
            } else {
                if (iE < 0) {
                    iE = (-iE) - 1;
                }
                g0 g0Var = (g0) h0.e0(iE, cVarA);
                if (g0Var != null) {
                    fValueOf = Float.valueOf(g0Var.f76333b);
                } else {
                    fValueOf = null;
                }
            }
            int iE2 = x.e(new d(fFloatValue, 1), cVarA2, cVarA2.size());
            if (iE2 == -1) {
                fValueOf2 = null;
            } else {
                if (iE2 < 0) {
                    iE2 = (-iE2) - 1;
                }
                g0 g0Var2 = (g0) h0.e0(iE2, cVarA2);
                if (g0Var2 != null) {
                    fValueOf2 = Float.valueOf(g0Var2.f76333b);
                } else {
                    fValueOf2 = null;
                }
            }
            if (fValueOf == null || fValueOf2 == null) {
                f fVar = f1960a;
                if (fValueOf != null) {
                    Iterator<E> it5 = cVarA2.iterator();
                    if (!it5.hasNext()) {
                        c22.t.g();
                        return null;
                    }
                    float fMin = ((g0) it5.next()).f76332a;
                    while (it5.hasNext()) {
                        fMin = Math.min(fMin, ((g0) it5.next()).f76332a);
                    }
                    if (fFloatValue < fMin) {
                        g0 g0Var3 = (g0) h0.b0(cVarA);
                        g0 g0Var4 = (g0) h0.b0(cVarA2);
                        List listK = x.k(Float.valueOf(g0Var3.f76332a), Float.valueOf(g0Var4.f76332a));
                        List listK2 = x.k(Float.valueOf(g0Var3.f76333b), Float.valueOf(g0Var4.f76333b));
                        fVar.getClass();
                        float fJ = j(fFloatValue, listK, listK2);
                        h0Var = new g81.h0(fFloatValue, Math.min(fValueOf.floatValue(), fJ), Math.max(fValueOf.floatValue(), fJ));
                    } else {
                        g0 g0Var5 = (g0) h0.m0(cVarA);
                        g0 g0Var6 = (g0) h0.m0(cVarA2);
                        List listK3 = x.k(Float.valueOf(g0Var5.f76332a), Float.valueOf(g0Var6.f76332a));
                        List listK4 = x.k(Float.valueOf(g0Var5.f76333b), Float.valueOf(g0Var6.f76333b));
                        fVar.getClass();
                        float fJ2 = j(fFloatValue, listK3, listK4);
                        h0Var = new g81.h0(fFloatValue, Math.min(fValueOf.floatValue(), fJ2), Math.max(fValueOf.floatValue(), fJ2));
                    }
                } else if (fValueOf2 != null) {
                    Iterator<E> it6 = cVarA.iterator();
                    if (!it6.hasNext()) {
                        c22.t.g();
                        return null;
                    }
                    float fMin2 = ((g0) it6.next()).f76332a;
                    while (it6.hasNext()) {
                        fMin2 = Math.min(fMin2, ((g0) it6.next()).f76332a);
                    }
                    if (fFloatValue < fMin2) {
                        g0 g0Var7 = (g0) h0.b0(cVarA);
                        g0 g0Var8 = (g0) h0.b0(cVarA2);
                        List listK5 = x.k(Float.valueOf(g0Var7.f76332a), Float.valueOf(g0Var8.f76332a));
                        List listK6 = x.k(Float.valueOf(g0Var7.f76333b), Float.valueOf(g0Var8.f76333b));
                        fVar.getClass();
                        float fJ3 = j(fFloatValue, listK5, listK6);
                        h0Var = new g81.h0(fFloatValue, Math.min(fJ3, fValueOf2.floatValue()), Math.max(fJ3, fValueOf2.floatValue()));
                    } else {
                        g0 g0Var9 = (g0) h0.m0(cVarA);
                        g0 g0Var10 = (g0) h0.m0(cVarA2);
                        List listK7 = x.k(Float.valueOf(g0Var9.f76332a), Float.valueOf(g0Var10.f76332a));
                        List listK8 = x.k(Float.valueOf(g0Var9.f76333b), Float.valueOf(g0Var10.f76333b));
                        fVar.getClass();
                        float fJ4 = j(fFloatValue, listK7, listK8);
                        h0Var = new g81.h0(fFloatValue, Math.min(fJ4, fValueOf2.floatValue()), Math.max(fJ4, fValueOf2.floatValue()));
                    }
                }
            } else {
                h0Var = new g81.h0(fFloatValue, Math.min(fValueOf2.floatValue(), fValueOf.floatValue()), Math.max(fValueOf2.floatValue(), fValueOf.floatValue()));
            }
            if (h0Var != null) {
                arrayList3.add(h0Var);
            }
        }
        return arrayList3;
    }

    public static ArrayList h(float f14, e23.l lVar) {
        int i14 = (int) f14;
        int i15 = 0;
        j23.j jVarN = j23.t.n(i14 / 10, new j23.l(0, i14));
        ArrayList arrayList = new ArrayList(y.r(jVarN, 10));
        Iterator<Integer> it = jVarN.iterator();
        while (it.hasNext()) {
            int iNextInt = ((p0) it).nextInt();
            int i16 = i15 + 1;
            if (i15 < 0) {
                x.q();
                throw null;
            }
            arrayList.add(i15 % 2 == 0 ? (String) lVar.invoke(Float.valueOf(iNextInt)) : "");
            i15 = i16;
        }
        return arrayList;
    }

    public static Integer i(float f14, List list, List list2) {
        int size = list2.size();
        int i14 = 0;
        for (int i15 = 0; i15 < size; i15++) {
            int i16 = i15 * 2;
            float fFloatValue = ((Number) list.get(i16)).floatValue();
            float fFloatValue2 = ((Number) list.get(i16 + 2)).floatValue();
            float fMin = Math.min(fFloatValue, fFloatValue2);
            if (f14 <= Math.max(fFloatValue, fFloatValue2) && fMin <= f14) {
                i14 = i15;
            }
        }
        return (Integer) h0.e0(i14, list2);
    }

    public static float j(float f14, List list, List list2) {
        if (list.size() != list2.size()) {
            return Float.NaN;
        }
        float fK = 0.0f;
        int i14 = 0;
        for (Object obj : list2) {
            int i15 = i14 + 1;
            if (i14 < 0) {
                x.q();
                throw null;
            }
            fK += (k(f14, list, i14) / k(((Number) list.get(i14)).floatValue(), list, i14)) * ((Number) obj).floatValue();
            i14 = i15;
        }
        return fK;
    }

    public static final float k(float f14, List<Float> list, int i14) {
        float f15 = 1.0f;
        int i15 = 0;
        for (Object obj : list) {
            int i16 = i15 + 1;
            if (i15 < 0) {
                x.q();
                throw null;
            }
            float fFloatValue = ((Number) obj).floatValue();
            if (i15 != i14) {
                f15 = (f14 - fFloatValue) * f15;
            }
            i15 = i16;
        }
        return f15;
    }
}
