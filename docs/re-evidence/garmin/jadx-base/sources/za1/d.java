package za1;

import am.j;
import android.content.Context;
import c22.l3;
import c22.m3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.courses.model.GeoPointDTO;
import com.garmin.android.apps.connectmobile.settings.user.PowerZonesDTO;
import com.github.mikephil.charting.data.Entry;
import f12.l;
import gg1.o0;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import p13.h0;
import p13.x;
import p13.y;
import p13.y0;

/* JADX INFO: loaded from: classes9.dex */
public final class d {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v32 */
    /* JADX WARN: Type inference failed for: r0v33 */
    /* JADX WARN: Type inference failed for: r19v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v23, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r20v0 */
    /* JADX WARN: Type inference failed for: r20v1, types: [java.lang.Throwable, za1.c] */
    /* JADX WARN: Type inference failed for: r20v3 */
    /* JADX WARN: Type inference failed for: r25v1 */
    /* JADX WARN: Type inference failed for: r25v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r25v3 */
    /* JADX WARN: Type inference failed for: r25v4 */
    /* JADX WARN: Type inference failed for: r27v0 */
    /* JADX WARN: Type inference failed for: r27v1, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r27v2 */
    public static final c a(ab1.f fVar, Context context) {
        com.garmin.android.apps.connectmobile.courses.model.e eVar;
        Integer num;
        ArrayList arrayList;
        Double dU0;
        List<ab1.e> listF;
        List<GeoPointDTO> list;
        boolean z14;
        ?? r24;
        ArrayList arrayList2;
        PowerZonesDTO powerZonesDTO;
        List<ab1.e> list2;
        int i14;
        ?? r14;
        List<ab1.e> list3;
        String str;
        m3 m3Var;
        String str2;
        o0 o0Var;
        String str3;
        PowerZonesDTO powerZonesDTO2;
        y0 y0Var;
        ?? aVar;
        ?? Previous;
        ?? r15;
        Integer numValueOf;
        ?? ValueOf;
        String str4;
        ?? r25;
        Integer numValueOf2;
        Entry entry;
        fVar.getClass();
        context.getClass();
        ab1.d dVar = fVar.f2563a;
        if (dVar != null && (eVar = fVar.f2564b) != null && (num = dVar.getPowerGuidanceSummary().f2573f) != null) {
            int iIntValue = num.intValue();
            List<ab1.e> listF2 = dVar.f();
            if (listF2 != null) {
                ArrayList arrayList3 = new ArrayList(y.r(listF2, 10));
                Iterator it = listF2.iterator();
                while (it.hasNext()) {
                    arrayList3.add(Integer.valueOf(((ab1.e) it.next()).getPowerTarget()));
                }
                Integer num2 = (Integer) h0.t0(arrayList3);
                if (num2 != null) {
                    int iIntValue2 = num2.intValue();
                    Integer num3 = dVar.getPowerGuidanceSummary().f2583p;
                    if (num3 != null) {
                        int iIntValue3 = num3.intValue();
                        Integer num4 = (Integer) h0.o0(arrayList3);
                        if (num4 != null) {
                            int iIntValue4 = num4.intValue();
                            double dQ = eVar.q();
                            List<GeoPointDTO> list4 = eVar.geoPoints;
                            if (list4 != null) {
                                arrayList = new ArrayList();
                                for (GeoPointDTO geoPointDTO : list4) {
                                    Double d14 = geoPointDTO.elevation;
                                    Double d15 = (d14 == null || Double.isNaN(d14.doubleValue())) ? null : geoPointDTO.elevation;
                                    if (d15 != null) {
                                        arrayList.add(d15);
                                    }
                                }
                            } else {
                                arrayList = null;
                            }
                            if (arrayList != null && (dU0 = h0.u0(arrayList)) != null) {
                                double dDoubleValue = dU0.doubleValue();
                                Double dP0 = h0.p0(arrayList);
                                if (dP0 != null) {
                                    double dDoubleValue2 = dP0.doubleValue();
                                    PowerZonesDTO powerZonesDTO3 = fVar.f2565c;
                                    if (powerZonesDTO3 != null && (listF = dVar.f()) != null) {
                                        if (list4 == null || list4.isEmpty() || listF.isEmpty()) {
                                            list = list4;
                                            z14 = false;
                                            r24 = 0;
                                            arrayList2 = null;
                                        } else {
                                            ArrayList arrayList4 = new ArrayList();
                                            for (Iterator it3 = listF.iterator(); it3.hasNext(); it3 = it3) {
                                                ab1.e eVar2 = (ab1.e) it3.next();
                                                GeoPointDTO geoPointDTO2 = (GeoPointDTO) h0.e0(eVar2.getCoursePointIndex(), list4);
                                                if (geoPointDTO2 != null) {
                                                    Double d16 = geoPointDTO2.distance;
                                                    entry = new Entry(d16 != null ? (float) d16.doubleValue() : 0.0f, eVar2.getPowerTarget());
                                                } else {
                                                    entry = null;
                                                }
                                                if (entry != null) {
                                                    arrayList4.add(entry);
                                                }
                                            }
                                            r24 = 0;
                                            GeoPointDTO geoPointDTO3 = (GeoPointDTO) h0.m0(list4);
                                            ab1.e eVar3 = (ab1.e) h0.m0(listF);
                                            Double d17 = geoPointDTO3.distance;
                                            list = list4;
                                            arrayList4.add(new Entry(d17 != null ? (float) d17.doubleValue() : 0.0f, eVar3.getPowerTarget()));
                                            HashSet hashSet = new HashSet();
                                            ArrayList arrayList5 = new ArrayList();
                                            for (Object obj : arrayList4) {
                                                if (hashSet.add(Float.valueOf(((Entry) obj).getX()))) {
                                                    arrayList5.add(obj);
                                                }
                                            }
                                            if (arrayList5.size() < 2) {
                                                Double d18 = ((GeoPointDTO) h0.b0(list)).distance;
                                                Entry entry2 = new Entry(d18 != null ? (float) d18.doubleValue() : 0.0f, ((ab1.e) h0.b0(listF)).getPowerTarget());
                                                z14 = false;
                                                arrayList4.add(0, entry2);
                                            } else {
                                                z14 = false;
                                            }
                                            arrayList2 = arrayList4;
                                        }
                                        if (arrayList2 == null) {
                                            return r24;
                                        }
                                        if (list == null || list.isEmpty()) {
                                            powerZonesDTO = powerZonesDTO3;
                                            list2 = listF;
                                            i14 = iIntValue3;
                                            r14 = r24;
                                        } else {
                                            boolean z15 = j.z(l.f68084a);
                                            o0 o0VarG = l.a.a().g();
                                            m3 m3Var2 = z15 ? m3.KILOMETER : m3.MILE;
                                            boolean z16 = (o0VarG == o0.METRIC || o0VarG == o0.STATUTE_UK) ? true : z14;
                                            String string = context.getString(R.string.lbl_power_cap);
                                            String strD = p6.b.d(context, R.string.lbl_watts, string);
                                            String string2 = context.getString(R.string.no_value_card);
                                            string2.getClass();
                                            String string3 = context.getString(z16 ? R.string.lbl_meter : R.string.lbl_foot);
                                            PowerZonesDTO powerZonesDTO4 = powerZonesDTO3;
                                            String strD2 = p6.b.d(context, R.string.activity_details_elevation, string3);
                                            y0 y0Var2 = new y0(listF);
                                            boolean z17 = listF.size() == 1;
                                            ArrayList arrayList6 = new ArrayList();
                                            int i15 = 0;
                                            ArrayList arrayList7 = arrayList6;
                                            for (Object obj2 : list) {
                                                int i16 = i15 + 1;
                                                if (i15 < 0) {
                                                    x.q();
                                                    throw r24;
                                                }
                                                String str5 = string3;
                                                GeoPointDTO geoPointDTO4 = (GeoPointDTO) obj2;
                                                ArrayList arrayList8 = arrayList7;
                                                Double d19 = geoPointDTO4.distance;
                                                if (d19 == null || geoPointDTO4.elevation == null) {
                                                    list3 = listF;
                                                    str = string;
                                                    m3Var = m3Var2;
                                                    str2 = strD;
                                                    o0Var = o0VarG;
                                                    str3 = string2;
                                                    powerZonesDTO2 = powerZonesDTO4;
                                                    y0Var = y0Var2;
                                                    aVar = r24;
                                                } else {
                                                    l3.a aVar2 = l3.f23124b;
                                                    double dDoubleValue3 = d19.doubleValue();
                                                    String str6 = string;
                                                    m3 m3Var3 = m3Var2;
                                                    DecimalFormat decimalFormat = l3.f23129g;
                                                    aVar2.getClass();
                                                    list3 = listF;
                                                    str2 = strD;
                                                    str3 = string2;
                                                    y0Var = y0Var2;
                                                    int i17 = i15;
                                                    o0 o0Var2 = o0VarG;
                                                    powerZonesDTO2 = powerZonesDTO4;
                                                    String strO = l3.a.O(context, dDoubleValue3, m3Var3, decimalFormat, true);
                                                    m3Var = m3Var3;
                                                    Iterator it4 = y0Var.iterator();
                                                    do {
                                                        ListIterator listIterator = ((y0.a) it4).f134967a;
                                                        if (!listIterator.hasPrevious()) {
                                                            Previous = r24;
                                                            break;
                                                        }
                                                        Previous = listIterator.previous();
                                                    } while (((ab1.e) Previous).getCoursePointIndex() > i17);
                                                    ab1.e eVar4 = (ab1.e) Previous;
                                                    if (eVar4 != null) {
                                                        numValueOf2 = Integer.valueOf(eVar4.getPowerTarget());
                                                    } else if (z17) {
                                                        numValueOf = Integer.valueOf(((ab1.e) h0.b0(list3)).getPowerTarget());
                                                    } else {
                                                        r15 = r24;
                                                    }
                                                    if (r15 != 0) {
                                                        r15 = numValueOf;
                                                        r15 = numValueOf2;
                                                        String strValueOf = String.valueOf(r15.intValue());
                                                        ValueOf = Integer.valueOf(xa1.h.d(r15.intValue(), powerZonesDTO2));
                                                        str4 = strValueOf;
                                                        r25 = str2;
                                                    } else {
                                                        r15 = numValueOf;
                                                        r15 = numValueOf2;
                                                        ?? r26 = r24;
                                                        ValueOf = r26;
                                                        str4 = str3;
                                                        r25 = r26;
                                                    }
                                                    l3.a aVar3 = l3.f23124b;
                                                    Double d24 = geoPointDTO4.elevation;
                                                    double dDoubleValue4 = d24 != null ? d24.doubleValue() : 0.0d;
                                                    aVar3.getClass();
                                                    o0Var = o0Var2;
                                                    g gVar = new g(strO, str4, r25, str6, ValueOf, l3.a.a0(context, dDoubleValue4, o0Var, false, false), str5, strD2, R.color.gray_45_static);
                                                    str = str6;
                                                    Double d25 = geoPointDTO4.distance;
                                                    float fDoubleValue = d25 != null ? (float) d25.doubleValue() : 0.0f;
                                                    Double d26 = geoPointDTO4.elevation;
                                                    aVar = new a(fDoubleValue, d26 != null ? (float) d26.doubleValue() : 0.0f, gVar);
                                                }
                                                if (aVar != 0) {
                                                    arrayList8.add(aVar);
                                                }
                                                arrayList7 = arrayList8;
                                                powerZonesDTO4 = powerZonesDTO2;
                                                string3 = str5;
                                                i15 = i16;
                                                strD = str2;
                                                listF = list3;
                                                y0Var2 = y0Var;
                                                string2 = str3;
                                                iIntValue3 = iIntValue3;
                                                m3Var2 = m3Var;
                                                o0VarG = o0Var;
                                                string = str;
                                            }
                                            list2 = listF;
                                            i14 = iIntValue3;
                                            powerZonesDTO = powerZonesDTO4;
                                            r14 = arrayList7;
                                        }
                                        return (r14 == 0 || list == null || list.isEmpty() || list2.isEmpty()) ? r24 : new c(iIntValue2, i14, iIntValue4, iIntValue, dQ, dDoubleValue, dDoubleValue2, arrayList2, r14, powerZonesDTO);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return null;
    }
}
