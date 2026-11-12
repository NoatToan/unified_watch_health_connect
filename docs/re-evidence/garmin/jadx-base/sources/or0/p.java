package or0;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.TreeMap;
import org.joda.time.DateTime;
import org.joda.time.DateTimeConstants;
import org.joda.time.DateTimeZone;
import org.joda.time.Days;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p13.h0;
import p13.u0;

/* JADX INFO: loaded from: classes8.dex */
public final class p {

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t7, T t14) {
            return r13.a.b(((hz.d) t7).f86388a, ((hz.d) t14).f86388a);
        }
    }

    public static final hz.a a(ir0.e eVar) {
        List<ir0.f> list;
        List<ir0.f> list2;
        LocalDate localDatePlusDays = null;
        ir0.f fVar = (eVar == null || (list2 = eVar.f94793a) == null) ? null : (ir0.f) h0.d0(list2);
        ir0.f fVar2 = (eVar == null || (list = eVar.f94793a) == null) ? null : (ir0.f) h0.n0(list);
        LocalDate localDateB = fVar != null ? fVar.b() : null;
        LocalDate localDateB2 = fVar2 != null ? fVar2.b() : null;
        if (localDateB != null && localDateB2 != null && Days.daysBetween(localDateB, localDateB2).getDays() >= 27) {
            localDatePlusDays = localDateB2;
        } else if (localDateB != null) {
            localDatePlusDays = localDateB.plusDays(27);
        }
        return new hz.a(localDateB, localDatePlusDays);
    }

    public static final hz.b b(ir0.e eVar) {
        ir0.f fVar;
        LocalDate localDate;
        DateTime dateTimeQ;
        DateTime dateTimeQ2;
        List<ir0.f> list;
        ir0.f fVarPrevious;
        List<ir0.f> list2;
        List<ir0.f> list3;
        ir0.f fVar2 = (eVar == null || (list3 = eVar.f94793a) == null) ? null : (ir0.f) h0.d0(list3);
        ir0.f fVar3 = (eVar == null || (list2 = eVar.f94793a) == null) ? null : (ir0.f) h0.n0(list2);
        if (eVar == null || (list = eVar.f94793a) == null) {
            fVar = null;
        } else {
            ListIterator<ir0.f> listIterator = list.listIterator(list.size());
            do {
                if (!listIterator.hasPrevious()) {
                    fVarPrevious = null;
                    break;
                }
                fVarPrevious = listIterator.previous();
            } while (fVarPrevious.f94797b <= 0);
            fVar = fVarPrevious;
        }
        LocalDate localDateB = fVar2 != null ? fVar2.b() : null;
        LocalDate localDateB2 = fVar3 != null ? fVar3.b() : null;
        if (localDateB != null && localDateB2 != null && Days.daysBetween(localDateB, localDateB2).getDays() >= 6) {
            localDate = localDateB2;
        } else if (localDateB != null) {
            localDateB2 = localDateB.plusDays(6);
            localDate = localDateB2;
        } else {
            localDate = null;
        }
        if (fVar2 != null) {
            String str = fVar2.f94803h;
            dateTimeQ = str != null ? g22.k.q(str, "yyyy-MM-dd'T'HH:mm:ss.SSS", DateTimeZone.UTC) : null;
        } else {
            dateTimeQ = null;
        }
        if (fVar != null) {
            String str2 = fVar.f94804i;
            dateTimeQ2 = str2 != null ? g22.k.q(str2, "yyyy-MM-dd'T'HH:mm:ss.SSS", DateTimeZone.UTC) : null;
        } else {
            dateTimeQ2 = null;
        }
        return new hz.c(localDateB, localDate, dateTimeQ, dateTimeQ2, dateTimeQ2 != null ? dateTimeQ2.withZone(DateTimeZone.forOffsetMillis(fVar.f94802g * DateTimeConstants.MILLIS_PER_MINUTE)) : null, 60).a();
    }

    /* JADX WARN: Code duplicated, block: B:75:0x011f  */
    public static final pr0.d c(ir0.e eVar) {
        int i14;
        List<ir0.f> list;
        Object next;
        List<ir0.f> list2;
        DateTime dateTimeAtStartOfDay;
        float f14;
        DateTimeZone dateTimeZone = b(eVar).f86381d;
        ArrayList arrayList = new ArrayList();
        if (eVar != null && (list2 = eVar.f94793a) != null && !list2.isEmpty()) {
            float f15 = 0.0f;
            for (ir0.f fVar : list2) {
                String str = fVar.f94803h;
                DateTime dateTimeQ = str != null ? g22.k.q(str, "yyyy-MM-dd'T'HH:mm:ss.SSS", DateTimeZone.UTC) : null;
                String str2 = fVar.f94804i;
                DateTime dateTimeQ2 = str2 != null ? g22.k.q(str2, "yyyy-MM-dd'T'HH:mm:ss.SSS", DateTimeZone.UTC) : null;
                List<ir0.g> list3 = fVar.f94805j;
                if (list3 == null || list3.isEmpty()) {
                    LocalDate localDateB = fVar.b();
                    DateTime dateTimePlusHours = (localDateB == null || (dateTimeAtStartOfDay = localDateB.toDateTimeAtStartOfDay(dateTimeZone)) == null) ? null : dateTimeAtStartOfDay.plusHours(12);
                    Integer numG = fVar.g();
                    int iIntValue = (numG != null ? numG.intValue() : 0) * 2;
                    Integer numD = fVar.d();
                    int iIntValue2 = iIntValue + (numD != null ? numD.intValue() : 0);
                    f15 += iIntValue2;
                    if (dateTimePlusHours != null && iIntValue2 > 0) {
                        arrayList.add(new hz.d(dateTimePlusHours, f15));
                    }
                } else if (!list3.isEmpty()) {
                    Iterator<T> it = list3.iterator();
                    while (it.hasNext()) {
                        if (((ir0.g) it.next()).f94808b > 0) {
                            Iterator<T> it3 = list3.iterator();
                            while (true) {
                                f14 = f15;
                                while (true) {
                                    if (!it3.hasNext()) {
                                        break;
                                    }
                                    ir0.g gVar = (ir0.g) it3.next();
                                    DateTime dateTime = new DateTime(gVar.f94807a, dateTimeZone);
                                    if (g22.k.e(dateTime, dateTimeQ, dateTimeQ2)) {
                                        f15 += gVar.f94808b;
                                        arrayList.add(new hz.d(dateTime, f15));
                                    } else {
                                        a2 a2Var = a2.ACTIVITIES;
                                        String strD = n23.j.d(gVar.f94807a, "IM 7d chart value's date is not in day's range for ", fVar.f94796a, " timestamp=");
                                        i2.f36769a.getClass();
                                        i2.a.b(a2Var, "SummarySevenDaysChart", strD);
                                    }
                                }
                            }
                            f15 = f14;
                            break;
                        }
                    }
                }
            }
        }
        hz.d dVar = (hz.d) h0.n0(arrayList);
        float f16 = dVar != null ? dVar.f86389b : 0.0f;
        if (eVar == null || (list = eVar.f94793a) == null) {
            i14 = 150;
        } else {
            Iterator<T> it4 = list.iterator();
            do {
                if (!it4.hasNext()) {
                    next = null;
                    break;
                }
                next = it4.next();
            } while (((ir0.f) next).f94797b <= 0);
            ir0.f fVar2 = (ir0.f) next;
            if (fVar2 != null) {
                i14 = fVar2.f94797b;
            } else {
                i14 = 150;
            }
        }
        return new pr0.d(h0.N0(arrayList, new a()), 0.0f, f16, i14);
    }

    public static final ir0.e d(List<ir0.f> list, DateTime dateTime, DateTime dateTime2, int i14) {
        list.getClass();
        dateTime.getClass();
        dateTime2.getClass();
        TreeMap treeMap = new TreeMap();
        u0.k(treeMap, new o13.p[0]);
        e32.d dVar = new e32.d(null, 1, null);
        oe2.g gVar = new oe2.g(18);
        for (ir0.f fVar : list) {
            treeMap.put(fVar.f94796a, fVar);
        }
        dVar.a(dateTime, dateTime2, treeMap, i14, gVar);
        Collection collectionValues = treeMap.values();
        collectionValues.getClass();
        return new ir0.e(h0.b1(collectionValues), i14 == 1);
    }
}
