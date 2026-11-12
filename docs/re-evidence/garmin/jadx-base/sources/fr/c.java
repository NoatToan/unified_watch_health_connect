package fr;

import am.x0;
import am.z0;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.activities.newmodel.ActivityDetailChartDTO;
import com.garmin.android.apps.connectmobile.activities.newmodel.y;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import o72.t;
import org.joda.time.DateTime;
import p005kotlin.jvm.internal.r0;
import p005kotlin.jvm.internal.s;
import p005kotlin.math.MathKt;
import p13.h0;
import p13.j0;
import p13.w;
import p13.x;
import ps.b1;
import ps.e1;
import ps.r1;
import ps.t1;
import ps.x1;
import ss.j;

/* JADX INFO: loaded from: classes7.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List<b1> f73284a = x.k(b1.e.f139707m, b1.f.f139709m, b1.g.f139711m, b1.h.f139713m, b1.i.f139715m);

    public static final ArrayList a(Long l14, ActivityDetailChartDTO activityDetailChartDTO, List list, List list2, String str) {
        List<y> listG;
        ArrayList arrayList;
        Object obj;
        ArrayList arrayList2;
        if (list == null || list.isEmpty() || list2 == null || list2.isEmpty()) {
            if (activityDetailChartDTO != null) {
                return t.I(activityDetailChartDTO, str);
            }
            return null;
        }
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayListI = activityDetailChartDTO != null ? t.I(activityDetailChartDTO, "DIRECTTIMESTAMP") : null;
        if (l14 != null) {
            long jLongValue = l14.longValue();
            int i14 = 0;
            if (arrayListI != null && !arrayListI.isEmpty()) {
                jLongValue = MathKt.d(((Number) arrayListI.get(0)).doubleValue());
            }
            if (activityDetailChartDTO != null && (listG = activityDetailChartDTO.G()) != null) {
                Iterator<y> it = listG.iterator();
                int i15 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i15 = -1;
                        break;
                    }
                    if ("sumDuration".equalsIgnoreCase(it.next().F())) {
                        break;
                    }
                    i15++;
                }
                List<y> listG2 = activityDetailChartDTO.G();
                if (listG2 != null) {
                    Iterator<y> it3 = listG2.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            i14 = -1;
                            break;
                        }
                        if (str.equalsIgnoreCase(it3.next().F())) {
                            break;
                        }
                        i14++;
                    }
                    if (i15 != -1 && i14 != -1) {
                        List<com.garmin.android.apps.connectmobile.activities.newmodel.b> listC = activityDetailChartDTO.C();
                        listC.getClass();
                        Iterator<com.garmin.android.apps.connectmobile.activities.newmodel.b> it4 = listC.iterator();
                        double d14 = 0.0d;
                        while (it4.hasNext()) {
                            List<Double> listC2 = it4.next().C();
                            listC2.getClass();
                            double dDoubleValue = listC2.get(i15).doubleValue();
                            double dDoubleValue2 = listC2.get(i14).doubleValue();
                            Iterator it5 = list.iterator();
                            while (true) {
                                if (!it5.hasNext()) {
                                    arrayList = arrayList3;
                                    obj = null;
                                    break;
                                }
                                Object next = it5.next();
                                x1 x1Var = (x1) next;
                                DateTime startDateTime = x1Var.getStartDateTime();
                                arrayList = arrayList3;
                                float millis = ((startDateTime != null ? startDateTime.getMillis() : 0L) - jLongValue) / 1000.0f;
                                DateTime endDateTime = x1Var.getEndDateTime();
                                float millis2 = ((endDateTime != null ? endDateTime.getMillis() : 0L) - jLongValue) / 1000.0f;
                                Iterator it6 = it5;
                                if (millis <= dDoubleValue && dDoubleValue <= millis2 && x1Var.a2() != null) {
                                    obj = next;
                                    break;
                                }
                                it5 = it6;
                                arrayList3 = arrayList;
                            }
                            x1 x1Var2 = (x1) obj;
                            if (x1Var2 == null) {
                                arrayList2 = arrayList;
                                arrayList2.add(Double.valueOf(d14));
                            } else if (h0.R(list2, x1Var2.a2())) {
                                d14 = Double.NaN;
                                arrayList2 = arrayList;
                                arrayList2.add(Double.valueOf(Double.NaN));
                            } else {
                                ArrayList arrayList4 = arrayList;
                                arrayList4.add(Double.valueOf(dDoubleValue2));
                                arrayList3 = arrayList4;
                                d14 = dDoubleValue2;
                            }
                            arrayList3 = arrayList2;
                        }
                        return arrayList3;
                    }
                }
            }
        }
        return null;
    }

    public static final ArrayList b(Long l14, ActivityDetailChartDTO activityDetailChartDTO, List list, b1 b1Var, String str) {
        List<qs.x> listK;
        ArrayList arrayList;
        List<y> listG;
        ArrayList arrayList2;
        Object next;
        if (s.g(b1Var, b1.w.f139733m)) {
            listK = x.k(qs.x.RWD_RUN, qs.x.RWD_WALK, qs.x.RWD_STAND);
        } else if (s.g(b1Var, b1.u.f139730m)) {
            listK = x.k(qs.x.SKI_RUN, qs.x.SKI_LIFT);
        } else if (s.g(b1Var, b1.d.f139705m)) {
            listK = x.k(qs.x.DOWNHILL_RUN, qs.x.DOWNHILL_LIFT);
        } else if (s.g(b1Var, b1.a.f139701m)) {
            listK = x.k(qs.x.ASCENT, qs.x.DESCENT, qs.x.TRANSITION);
        } else if (s.g(b1Var, b1.c.f139703m)) {
            listK = x.k(qs.x.ASCENT, qs.x.DESCENT);
        } else {
            listK = s.g(b1Var, b1.z.f139737m) ? x.k(qs.x.SURFACE_TYPE_UNPAVED, qs.x.SURFACE_TYPE_PAVED) : j0.f134944a;
        }
        if (list != null) {
            arrayList = new ArrayList();
            for (Object obj : list) {
                if (h0.R(listK, ((x1) obj).a2())) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = null;
        }
        if (arrayList == null || arrayList.isEmpty()) {
            return null;
        }
        ArrayList arrayList3 = new ArrayList();
        if (l14 == null) {
            return null;
        }
        long jLongValue = l14.longValue();
        ArrayList arrayListI = activityDetailChartDTO != null ? t.I(activityDetailChartDTO, "DIRECTTIMESTAMP") : null;
        int i14 = 0;
        if (arrayListI != null && !arrayListI.isEmpty()) {
            jLongValue = MathKt.d(((Number) arrayListI.get(0)).doubleValue());
        }
        if (activityDetailChartDTO == null || (listG = activityDetailChartDTO.G()) == null) {
            return null;
        }
        Iterator<y> it = listG.iterator();
        while (true) {
            if (!it.hasNext()) {
                i14 = -1;
                break;
            }
            if (str.equalsIgnoreCase(it.next().F())) {
                break;
            }
            i14++;
        }
        List<com.garmin.android.apps.connectmobile.activities.newmodel.b> listC = activityDetailChartDTO.C();
        listC.getClass();
        Iterator<com.garmin.android.apps.connectmobile.activities.newmodel.b> it3 = listC.iterator();
        double d14 = 0.0d;
        while (it3.hasNext()) {
            List<Double> listC2 = it3.next().C();
            listC2.getClass();
            double dDoubleValue = listC2.get(i14).doubleValue();
            Iterator it4 = arrayList.iterator();
            while (true) {
                if (!it4.hasNext()) {
                    arrayList2 = arrayList;
                    next = null;
                    break;
                }
                next = it4.next();
                x1 x1Var = (x1) next;
                DateTime startDateTime = x1Var.getStartDateTime();
                arrayList2 = arrayList;
                float millis = ((startDateTime != null ? startDateTime.getMillis() : 0L) - jLongValue) / 1000.0f;
                DateTime endDateTime = x1Var.getEndDateTime();
                float millis2 = ((endDateTime != null ? endDateTime.getMillis() : 0L) - jLongValue) / 1000.0f;
                if (millis <= dDoubleValue && dDoubleValue <= millis2) {
                    break;
                }
                arrayList = arrayList2;
            }
            x1 x1Var2 = (x1) next;
            if (x1Var2 == null) {
                arrayList3.add(Double.valueOf(d14));
            }
            for (qs.x xVar : listK) {
                int iIndexOf = listK.indexOf(xVar);
                if (x1Var2 != null && x1Var2.a2() == xVar) {
                    d14 = iIndexOf;
                    arrayList3.add(Double.valueOf(d14));
                }
            }
            arrayList = arrayList2;
        }
        return arrayList3;
    }

    public static final t1 c(b1 b1Var, List<Double> list, List<Double> list2, boolean z14) {
        boolean z15;
        if (list == null || list.isEmpty()) {
            return null;
        }
        list2.getClass();
        Iterator<Double> it = list2.iterator();
        while (true) {
            if (!it.hasNext()) {
                z15 = !list2.isEmpty();
                break;
            }
            if (Double.isNaN(it.next().doubleValue())) {
                z15 = false;
                break;
            }
        }
        if (z15) {
            return z14 ? new e1(b1Var, list, list2) : new t1(b1Var, list, list2);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:285:0x06d0  */
    /* JADX WARN: Code duplicated, block: B:293:0x06d3 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v33, types: [T, java.lang.Iterable, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r10v67 */
    /* JADX WARN: Type inference failed for: r10v68 */
    /* JADX WARN: Type inference failed for: r10v69 */
    /* JADX WARN: Type inference failed for: r10v70 */
    /* JADX WARN: Type inference failed for: r10v71 */
    /* JADX WARN: Type inference failed for: r10v72 */
    /* JADX WARN: Type inference failed for: r10v73 */
    /* JADX WARN: Type inference failed for: r10v74 */
    /* JADX WARN: Type inference failed for: r10v75 */
    /* JADX WARN: Type inference failed for: r10v76 */
    /* JADX WARN: Type inference failed for: r10v77 */
    /* JADX WARN: Type inference failed for: r11v111, types: [p13.j0] */
    /* JADX WARN: Type inference failed for: r11v112, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v113, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r11v114, types: [p13.j0] */
    /* JADX WARN: Type inference failed for: r11v115, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v116, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r11v76, types: [T, java.util.ArrayList, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r13v29, types: [p13.j0] */
    /* JADX WARN: Type inference failed for: r13v30, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r13v31, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r14v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r14v11, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r14v9, types: [p13.j0] */
    /* JADX WARN: Type inference failed for: r9v2, types: [T, java.util.ArrayList] */
    public static final ArrayList d(x0 x0Var, Long l14, ActivityDetailChartDTO activityDetailChartDTO, ArrayList arrayList, List list, List list2, List list3, int i14) {
        ?? K;
        Parcelable parcelable;
        boolean z14;
        t1 t1Var;
        ?? arrayList2;
        ?? arrayList3;
        boolean z15;
        ?? arrayList4;
        ?? arrayList5;
        r0 r0Var = new r0();
        String str = x0Var != null ? x0Var.f4358a : null;
        z0 z0Var = z0.f4390a;
        boolean z16 = false;
        if (z0.b(x0.U0, str)) {
            K = x.k(b1.t.f139729m, b1.x.f139735m, b1.o.f139724m, b1.j.f139717m, b1.l.f139719m, b1.n.f139722m, b1.e.f139707m, b1.f.f139709m, b1.g.f139711m, b1.h.f139713m, b1.i.f139715m);
        } else if (z0.b(x0.R0, str)) {
            K = x.k(b1.d.f139705m, b1.t.f139729m, b1.x.f139735m, b1.o.f139724m, b1.j.f139717m, b1.n.f139722m, b1.l.f139719m);
        } else if (z0.x(str)) {
            K = x.k(b1.c.f139703m, b1.t.f139729m, b1.x.f139735m, b1.o.f139724m, b1.j.f139717m, b1.n.f139722m, b1.l.f139719m, b1.e.f139707m, b1.f.f139709m, b1.g.f139711m, b1.h.f139713m, b1.i.f139715m);
        } else if (z0.b(x0.f4312o, str)) {
            K = x.k(b1.t.f139729m, b1.x.f139735m, b1.o.f139724m, b1.j.f139717m, b1.z.f139737m, b1.l.f139719m, b1.n.f139722m, b1.e.f139707m, b1.f.f139709m, b1.g.f139711m, b1.h.f139713m, b1.i.f139715m);
        } else if (z0.b(x0.f4331t, str) || z0.b(x0.f4320q, str) || z0.b(x0.F2, str)) {
            K = x.k(b1.s.f139728m, b1.m.f139721m, b1.o.f139724m, b1.j.f139717m, b1.w.f139733m);
        } else if (z0.b(x0.O0, str) || z0.b(x0.D2, str) || z0.b(x0.f4308n, str)) {
            K = x.k(b1.s.f139728m, b1.m.f139721m, b1.o.f139724m, b1.v.f139732m, b1.j.f139717m, b1.w.f139733m);
        } else if (z0.d0(str)) {
            K = x.k(b1.x.f139735m, b1.o.f139724m, b1.j.f139717m);
        } else if (z0.b(x0.f4271b3, str) || z0.b(x0.f4274c3, str)) {
            K = x.k(b1.x.f139735m, b1.o.f139724m, b1.j.f139717m);
        } else if (z0.o(str)) {
            K = x.k(b1.x.f139735m, b1.j.f139717m, b1.a.f139701m);
        } else {
            K = z0.P(str) ? x.k(b1.u.f139730m, b1.y.f139736m, b1.p.f139725m, b1.k.f139718m) : j0.f134944a;
        }
        r0Var.f105810a = K;
        if (K == 0 || !K.isEmpty()) {
            for (b1 b1Var : K) {
                List<b1> list4 = f73284a;
                if (list4.contains(b1Var)) {
                    Iterable iterable = (Iterable) r0Var.f105810a;
                    ?? arrayList6 = new ArrayList();
                    for (Object obj : iterable) {
                        if (!list4.contains((b1) obj)) {
                            arrayList6.add(obj);
                        }
                    }
                    r0Var.f105810a = arrayList6;
                    if (i14 == 3) {
                        parcelable = b1.e.f139707m;
                    } else if (i14 == 4) {
                        parcelable = b1.f.f139709m;
                    } else if (i14 == 5) {
                        parcelable = b1.g.f139711m;
                    } else if (i14 == 6) {
                        parcelable = b1.h.f139713m;
                    } else {
                        parcelable = i14 >= 7 ? b1.i.f139715m : null;
                    }
                    if (parcelable == null) {
                        break;
                    }
                    ?? arrayList7 = new ArrayList((Collection) arrayList6);
                    arrayList7.add(parcelable);
                    r0Var.f105810a = arrayList7;
                    break;
                }
            }
        }
        List<b1> list5 = (List) r0Var.f105810a;
        ArrayList arrayList8 = new ArrayList();
        for (b1 b1Var2 : list5) {
            b1.e eVar = b1.e.f139707m;
            if (s.g(b1Var2, eVar)) {
                List listF = f(activityDetailChartDTO != null ? t.I(activityDetailChartDTO, "directEbikeAssistMode") : null, arrayList);
                eVar.getClass();
                z15 = z16;
                t1Var = c(eVar, listF, b1.e.f139708n, z15);
            } else {
                b1.f fVar = b1.f.f139709m;
                if (s.g(b1Var2, fVar)) {
                    List listF2 = f(activityDetailChartDTO != null ? t.I(activityDetailChartDTO, "directEbikeAssistMode") : null, arrayList);
                    fVar.getClass();
                    z15 = false;
                    t1Var = c(fVar, listF2, b1.f.f139710n, false);
                } else {
                    b1.g gVar = b1.g.f139711m;
                    if (s.g(b1Var2, gVar)) {
                        List listF3 = f(activityDetailChartDTO != null ? t.I(activityDetailChartDTO, "directEbikeAssistMode") : null, arrayList);
                        gVar.getClass();
                        z15 = false;
                        t1Var = c(gVar, listF3, b1.g.f139712n, false);
                    } else {
                        b1.h hVar = b1.h.f139713m;
                        if (s.g(b1Var2, hVar)) {
                            List listF4 = f(activityDetailChartDTO != null ? t.I(activityDetailChartDTO, "directEbikeAssistMode") : null, arrayList);
                            hVar.getClass();
                            z15 = false;
                            t1Var = c(hVar, listF4, b1.h.f139714n, false);
                        } else {
                            b1.i iVar = b1.i.f139715m;
                            if (s.g(b1Var2, iVar)) {
                                List listF5 = f(activityDetailChartDTO != null ? t.I(activityDetailChartDTO, "directEbikeAssistMode") : null, arrayList);
                                iVar.getClass();
                                z15 = false;
                                t1Var = c(iVar, listF5, b1.i.f139716n, false);
                            } else {
                                b1.j jVar = b1.j.f139717m;
                                if (s.g(b1Var2, jVar)) {
                                    List listF6 = f(activityDetailChartDTO != null ? t.I(activityDetailChartDTO, "DIRECTELEVATION") : null, arrayList);
                                    z15 = false;
                                    t1Var = c(jVar, listF6, j.a(jVar.f139693e.length, listF6), false);
                                } else {
                                    if (s.g(b1Var2, b1.k.f139718m)) {
                                        List<qs.x> listE = e(x0Var != null ? x0Var.f4358a : null);
                                        t1Var = c(jVar, f(a(l14, activityDetailChartDTO, list, listE, "DIRECTELEVATION"), arrayList), j.a(jVar.f139693e.length, activityDetailChartDTO != null ? t.I(activityDetailChartDTO, "DIRECTELEVATION") : null), !listE.isEmpty());
                                    } else {
                                        b1.l lVar = b1.l.f139719m;
                                        if (s.g(b1Var2, lVar)) {
                                            List listF7 = f(activityDetailChartDTO != null ? t.I(activityDetailChartDTO, "directFlow") : null, arrayList);
                                            lVar.getClass();
                                            z15 = false;
                                            t1Var = c(lVar, listF7, b1.l.f139720n, false);
                                        } else {
                                            if (s.g(b1Var2, b1.m.f139721m)) {
                                                ArrayList arrayListI = activityDetailChartDTO != null ? t.I(activityDetailChartDTO, "directGradeAdjustedSpeed") : null;
                                                if (arrayListI != null && !arrayListI.isEmpty()) {
                                                    Iterator it = arrayListI.iterator();
                                                    while (true) {
                                                        if (it.hasNext()) {
                                                            double dDoubleValue = ((Number) it.next()).doubleValue();
                                                            if (!Double.isNaN(dDoubleValue) && dDoubleValue > 0.0d) {
                                                                List listF8 = f(arrayListI, arrayList);
                                                                b1.m mVar = b1.m.f139721m;
                                                                z15 = false;
                                                                t1Var = c(mVar, listF8, j.a(mVar.f139693e.length, listF8), false);
                                                            }
                                                        }
                                                    }
                                                }
                                                t1Var = null;
                                            } else {
                                                b1.n nVar = b1.n.f139722m;
                                                if (s.g(b1Var2, nVar)) {
                                                    List listF9 = f(activityDetailChartDTO != null ? t.I(activityDetailChartDTO, "directGrit") : null, arrayList);
                                                    nVar.getClass();
                                                    z15 = false;
                                                    t1Var = c(nVar, listF9, b1.n.f139723n, false);
                                                } else {
                                                    b1.o oVar = b1.o.f139724m;
                                                    if (s.g(b1Var2, oVar)) {
                                                        List listF10 = f(activityDetailChartDTO != null ? t.I(activityDetailChartDTO, "DIRECTHEARTRATE") : null, arrayList);
                                                        if (list2 != null) {
                                                            arrayList5 = new ArrayList(p13.y.r(list2, 10));
                                                            Iterator it3 = list2.iterator();
                                                            while (it3.hasNext()) {
                                                                Double zoneLowBoundary = ((r1) it3.next()).getZoneLowBoundary();
                                                                arrayList5.add(Double.valueOf(zoneLowBoundary != null ? zoneLowBoundary.doubleValue() : 0.0d));
                                                            }
                                                        } else {
                                                            arrayList5 = j0.f134944a;
                                                        }
                                                        z15 = false;
                                                        t1Var = c(oVar, listF10, arrayList5, false);
                                                    } else if (s.g(b1Var2, b1.p.f139725m)) {
                                                        List<qs.x> listE2 = e(x0Var != null ? x0Var.f4358a : null);
                                                        List listF11 = f(a(l14, activityDetailChartDTO, list, listE2, "DIRECTHEARTRATE"), arrayList);
                                                        if (list2 != null) {
                                                            arrayList4 = new ArrayList(p13.y.r(list2, 10));
                                                            Iterator it4 = list2.iterator();
                                                            while (it4.hasNext()) {
                                                                Double zoneLowBoundary2 = ((r1) it4.next()).getZoneLowBoundary();
                                                                arrayList4.add(Double.valueOf(zoneLowBoundary2 != null ? zoneLowBoundary2.doubleValue() : 0.0d));
                                                            }
                                                        } else {
                                                            arrayList4 = j0.f134944a;
                                                        }
                                                        t1Var = c(oVar, listF11, arrayList4, !listE2.isEmpty());
                                                    } else if (b1Var2 instanceof b1.r) {
                                                        t1Var = null;
                                                    } else {
                                                        b1.s sVar = b1.s.f139728m;
                                                        if (s.g(b1Var2, sVar)) {
                                                            List listF12 = f(activityDetailChartDTO != null ? t.I(activityDetailChartDTO, "DIRECTSPEED") : null, arrayList);
                                                            z15 = false;
                                                            t1Var = c(sVar, listF12, j.a(b1.x.f139735m.f139693e.length, listF12), false);
                                                        } else {
                                                            b1.t tVar = b1.t.f139729m;
                                                            if (s.g(b1Var2, tVar)) {
                                                                List listF13 = f(activityDetailChartDTO != null ? t.I(activityDetailChartDTO, "DIRECTPOWER") : null, arrayList);
                                                                if (list3 != null) {
                                                                    arrayList3 = new ArrayList(p13.y.r(list3, 10));
                                                                    Iterator it5 = list3.iterator();
                                                                    while (it5.hasNext()) {
                                                                        Double zoneLowBoundary3 = ((r1) it5.next()).getZoneLowBoundary();
                                                                        arrayList3.add(Double.valueOf(zoneLowBoundary3 != null ? zoneLowBoundary3.doubleValue() : 0.0d));
                                                                    }
                                                                } else {
                                                                    arrayList3 = j0.f134944a;
                                                                }
                                                                z15 = false;
                                                                t1Var = c(tVar, listF13, arrayList3, false);
                                                            } else {
                                                                b1.v vVar = b1.v.f139732m;
                                                                if (s.g(b1Var2, vVar)) {
                                                                    List listF14 = f(activityDetailChartDTO != null ? t.I(activityDetailChartDTO, "DIRECTPOWER") : null, arrayList);
                                                                    if (list3 != null) {
                                                                        arrayList2 = new ArrayList(p13.y.r(list3, 10));
                                                                        Iterator it6 = list3.iterator();
                                                                        while (it6.hasNext()) {
                                                                            Double zoneLowBoundary4 = ((r1) it6.next()).getZoneLowBoundary();
                                                                            arrayList2.add(Double.valueOf(zoneLowBoundary4 != null ? zoneLowBoundary4.doubleValue() : 0.0d));
                                                                        }
                                                                    } else {
                                                                        arrayList2 = j0.f134944a;
                                                                    }
                                                                    z14 = false;
                                                                    t1Var = c(vVar, listF14, arrayList2, false);
                                                                } else {
                                                                    z14 = false;
                                                                    b1.w wVar = b1.w.f139733m;
                                                                    if (s.g(b1Var2, wVar)) {
                                                                        List listF15 = f(b(l14, activityDetailChartDTO, list, wVar, "sumDuration"), arrayList);
                                                                        wVar.getClass();
                                                                        t1Var = c(wVar, listF15, b1.w.f139734n, false);
                                                                    } else {
                                                                        b1.x xVar = b1.x.f139735m;
                                                                        if (s.g(b1Var2, xVar)) {
                                                                            List listF16 = f(activityDetailChartDTO != null ? t.I(activityDetailChartDTO, "DIRECTSPEED") : null, arrayList);
                                                                            t1Var = c(xVar, listF16, j.a(xVar.f139693e.length, listF16), false);
                                                                            z14 = false;
                                                                        } else if (s.g(b1Var2, b1.y.f139736m)) {
                                                                            List<qs.x> listE3 = e(x0Var != null ? x0Var.f4358a : null);
                                                                            t1Var = c(xVar, f(a(l14, activityDetailChartDTO, list, listE3, "DIRECTSPEED"), arrayList), j.a(xVar.f139693e.length, activityDetailChartDTO != null ? t.I(activityDetailChartDTO, "DIRECTSPEED") : null), !listE3.isEmpty());
                                                                            z14 = false;
                                                                        } else {
                                                                            b1.u uVar = b1.u.f139730m;
                                                                            if (s.g(b1Var2, uVar)) {
                                                                                List listF17 = f(b(l14, activityDetailChartDTO, list, uVar, "SUMELAPSEDDURATION"), arrayList);
                                                                                uVar.getClass();
                                                                                z14 = false;
                                                                                t1Var = c(uVar, listF17, b1.u.f139731n, false);
                                                                            } else {
                                                                                z14 = false;
                                                                                b1.d dVar = b1.d.f139705m;
                                                                                if (s.g(b1Var2, dVar)) {
                                                                                    List listF18 = f(b(l14, activityDetailChartDTO, list, dVar, "sumDuration"), arrayList);
                                                                                    dVar.getClass();
                                                                                    t1Var = c(dVar, listF18, b1.d.f139706n, false);
                                                                                } else {
                                                                                    b1.a aVar = b1.a.f139701m;
                                                                                    if (s.g(b1Var2, aVar)) {
                                                                                        List listF19 = f(b(l14, activityDetailChartDTO, list, aVar, "SUMELAPSEDDURATION"), arrayList);
                                                                                        aVar.getClass();
                                                                                        t1Var = c(aVar, listF19, b1.a.f139702n, false);
                                                                                    } else {
                                                                                        b1.c cVar = b1.c.f139703m;
                                                                                        if (s.g(b1Var2, cVar)) {
                                                                                            List listF20 = f(b(l14, activityDetailChartDTO, list, cVar, "sumDuration"), arrayList);
                                                                                            cVar.getClass();
                                                                                            t1Var = c(cVar, listF20, b1.c.f139704n, false);
                                                                                        } else {
                                                                                            b1.z zVar = b1.z.f139737m;
                                                                                            if (s.g(b1Var2, zVar)) {
                                                                                                List listF21 = f(b(l14, activityDetailChartDTO, list, zVar, "SUMELAPSEDDURATION"), arrayList);
                                                                                                zVar.getClass();
                                                                                                t1Var = c(zVar, listF21, b1.z.f139738n, false);
                                                                                            } else {
                                                                                                b1.q qVar = b1.q.f139726m;
                                                                                                if (!s.g(b1Var2, qVar)) {
                                                                                                    u0.r();
                                                                                                    return null;
                                                                                                }
                                                                                                j0 j0Var = j0.f134944a;
                                                                                                t1Var = new t1(qVar, j0Var, j0Var);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            if (t1Var != null) {
                                                arrayList8.add(t1Var);
                                            }
                                            z16 = z14;
                                        }
                                    }
                                    z14 = false;
                                    if (t1Var != null) {
                                        arrayList8.add(t1Var);
                                    }
                                    z16 = z14;
                                }
                            }
                        }
                    }
                }
            }
            z14 = z15;
            if (t1Var != null) {
                arrayList8.add(t1Var);
            }
            z16 = z14;
        }
        return arrayList8;
    }

    public static final List<qs.x> e(String str) {
        if (z0.P(str)) {
            return w.c(qs.x.SKI_LIFT);
        }
        return z0.b(x0.R0, str) ? w.c(qs.x.DOWNHILL_LIFT) : j0.f134944a;
    }

    public static final List f(ArrayList arrayList, List list) {
        if (arrayList == null || arrayList.isEmpty() || list == null || list.isEmpty()) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Double d14 = (Double) h0.e0(((Number) it.next()).intValue(), arrayList);
            if (d14 != null) {
                arrayList2.add(d14);
            }
        }
        return arrayList2;
    }
}
