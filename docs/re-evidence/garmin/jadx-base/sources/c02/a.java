package c02;

import b63.o;
import b63.p;
import c22.j0;
import c22.t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import m92.h0;
import org.joda.time.DateTime;
import org.joda.time.Days;
import org.joda.time.DurationFieldType;
import org.joda.time.LocalDate;
import org.joda.time.Months;
import org.joda.time.ReadablePartial;
import org.joda.time.format.DateTimeFormatter;
import p005kotlin.Unit;
import p1.z;
import p13.k0;
import p13.x;

/* JADX INFO: loaded from: classes10.dex */
public final class a {
    public static final i53.d a(LinkedHashMap linkedHashMap, ArrayList arrayList, List list) {
        if (linkedHashMap.isEmpty()) {
            k0 k0Var = k0.f134949a;
            k0Var.getClass();
            return i53.a.g(k0Var);
        }
        Iterator it = linkedHashMap.entrySet().iterator();
        if (!it.hasNext()) {
            t.g();
            return null;
        }
        float fFloatValue = ((Number) ((Map.Entry) it.next()).getValue()).floatValue();
        while (it.hasNext()) {
            fFloatValue = Math.min(fFloatValue, ((Number) ((Map.Entry) it.next()).getValue()).floatValue());
        }
        Iterator it3 = linkedHashMap.entrySet().iterator();
        if (!it3.hasNext()) {
            t.g();
            return null;
        }
        float fFloatValue2 = ((Number) ((Map.Entry) it3.next()).getValue()).floatValue();
        while (it3.hasNext()) {
            fFloatValue2 = Math.max(fFloatValue2, ((Number) ((Map.Entry) it3.next()).getValue()).floatValue());
        }
        float f14 = fFloatValue2 - fFloatValue;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        int i14 = 0;
        for (Object obj : list) {
            int i15 = i14 + 1;
            if (i14 < 0) {
                x.q();
                throw null;
            }
            float fFloatValue3 = ((Number) obj).floatValue();
            if (i14 == list.size() - 1) {
                fFloatValue3 = fFloatValue2;
            }
            float f15 = i14 == 0 ? 0.0f : (fFloatValue3 - fFloatValue) / f14;
            if (f15 >= 1.0f) {
                f15 = 1.0f;
            }
            linkedHashMap2.put(Float.valueOf(f15), arrayList.get(i14));
            if (f15 == 1.0f) {
                break;
            }
            i14 = i15;
        }
        return i53.a.k(linkedHashMap2);
    }

    public static final float b(int i14, int i15) {
        float f14 = i15;
        float fCeil = ((float) Math.ceil(i14 / f14)) * f14;
        return fCeil % ((float) (i15 * 2)) == 0.0f ? fCeil : fCeil + f14;
    }

    public static final ArrayList c(DateTime dateTime, DateTime dateTime2) {
        dateTime.getClass();
        dateTime2.getClass();
        int days = Days.daysBetween(dateTime.toLocalDate(), dateTime2.toLocalDate()).getDays();
        int i14 = days + 1;
        ArrayList arrayList = new ArrayList(i14);
        for (int i15 = 0; i15 < i14; i15++) {
            arrayList.add("");
        }
        j0.f23099a.getClass();
        arrayList.set(0, j0.k(dateTime, 'S'));
        arrayList.set(days, j0.k(dateTime2, 'S'));
        return arrayList;
    }

    public static final ArrayList d(o oVar, o oVar2) {
        oVar.getClass();
        oVar2.getClass();
        int iA = p.a(oVar, oVar2);
        int i14 = iA + 1;
        ArrayList arrayList = new ArrayList(i14);
        for (int i15 = 0; i15 < i14; i15++) {
            arrayList.add("");
        }
        j0 j0Var = j0.f23099a;
        LocalDate localDateH = g22.l.h(oVar);
        j0Var.getClass();
        arrayList.set(0, j0.l(localDateH));
        LocalDate localDateH2 = g22.l.h(oVar2);
        j0Var.getClass();
        arrayList.set(iA, j0.l(localDateH2));
        return arrayList;
    }

    public static final List<String> e(DateTime dateTime, DateTime dateTime2, DateTimeFormatter dateTimeFormatter) {
        dateTime.getClass();
        dateTime2.getClass();
        dateTimeFormatter.getClass();
        z zVar = new z(Months.monthsBetween(dateTime.toLocalDate(), dateTime2.toLocalDate()).get(DurationFieldType.months()));
        int i14 = 0;
        while (true) {
            if (!dateTime.isBefore(dateTime2)) {
                j0.f23099a.getClass();
                if (!j0.G(dateTime, dateTime2)) {
                    c22.p.f23187a.getClass();
                    return c22.p.b(zVar);
                }
            }
            int i15 = i14 + 1;
            long j8 = i14;
            String strPrint = dateTimeFormatter.print(dateTime);
            strPrint.getClass();
            zVar.f(j8, strPrint);
            dateTime = dateTime.plusMonths(1);
            dateTime.getClass();
            i14 = i15;
        }
    }

    public static final i53.f f(LinkedHashMap linkedHashMap, LocalDate localDate, int i14) {
        LocalDate localDateMinusDays = localDate.minusDays(i14 - 1);
        ArrayList arrayList = new ArrayList();
        localDateMinusDays.getClass();
        while (localDateMinusDays.compareTo((ReadablePartial) localDate) <= 0) {
            arrayList.add(linkedHashMap.get(localDateMinusDays.toString()));
            Unit unit = Unit.INSTANCE;
            localDateMinusDays = localDateMinusDays.plusDays(1);
            localDateMinusDays.getClass();
        }
        return i53.a.j(arrayList);
    }

    public static final <T extends Number> i53.f<h0.e.a> g(i53.c<? extends T> cVar) {
        cVar.getClass();
        ArrayList arrayList = new ArrayList();
        int i14 = 0;
        for (T t7 : cVar) {
            int i15 = i14 + 1;
            if (i14 < 0) {
                x.q();
                throw null;
            }
            T t14 = t7;
            h0.e.a aVar = t14 != null ? new h0.e.a(i14, t14.floatValue()) : null;
            if (aVar != null) {
                arrayList.add(aVar);
            }
            i14 = i15;
        }
        return i53.a.j(arrayList);
    }
}
