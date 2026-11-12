package i61;

import c53.q;
import com.garmin.android.apps.connectmobile.R;
import ho0.g;
import i53.c;
import j23.t;
import j61.h;
import j61.i;
import j61.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import k61.b;
import lc.u0;
import m92.h0;
import org.joda.time.DateTime;
import org.joda.time.Days;
import org.joda.time.Interval;
import org.joda.time.format.DateTimeFormat;
import ww1.a0;
import ww1.x;

/* JADX INFO: loaded from: classes9.dex */
public final class a {

    /* JADX INFO: renamed from: i61.a$a, reason: collision with other inner class name */
    public static final /* synthetic */ class C1756a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f91824a;

        static {
            int[] iArr = new int[h.values().length];
            try {
                iArr[h.DAILY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[h.WEEKLY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[h.MONTHLY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f91824a = iArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:58:0x011e  */
    /* JADX WARN: Code duplicated, block: B:60:0x0122  */
    /* JADX WARN: Code duplicated, block: B:66:0x014a  */
    /* JADX WARN: Code duplicated, block: B:68:0x014e  */
    /* JADX WARN: Code duplicated, block: B:74:0x0176  */
    /* JADX WARN: Code duplicated, block: B:76:0x017a  */
    /* JADX WARN: Code duplicated, block: B:99:0x018c A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14, types: [ww1.a0] */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r17v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.Float] */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16, types: [java.lang.Float] */
    /* JADX WARN: Type inference failed for: r1v40 */
    /* JADX WARN: Type inference failed for: r1v41 */
    /* JADX WARN: Type inference failed for: r1v42 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Float] */
    public static final b a(j jVar, List<x> list, h hVar) {
        DateTime dateTime;
        Map<String, i> map;
        ?? arrayList;
        DateTime dateTimePlusDays;
        Iterator it;
        c cVar;
        ?? trainingPhase;
        i iVar;
        ?? r14;
        i iVar2;
        ?? r15;
        i iVar3;
        ?? r16;
        Integer num;
        Float fValueOf;
        Integer num2;
        Float fValueOf2;
        Integer num3;
        Float fValueOf3;
        Object objPrevious;
        Object next;
        jVar.getClass();
        DateTime dateTime2 = jVar.f97357a;
        c cVar2 = null;
        if (dateTime2 == null || (dateTime = jVar.f97358b) == null || (map = jVar.f97359c) == null) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        Iterator it3 = map.entrySet().iterator();
        int i14 = 0;
        while (it3.hasNext()) {
            Object next2 = it3.next();
            int i15 = i14 + 1;
            if (i14 < 0) {
                ?? r17 = cVar2;
                p13.x.q();
                throw r17;
            }
            Map.Entry entry = (Map.Entry) next2;
            DateTime dateTime3 = DateTimeFormat.forPattern("yyyy-MM-dd").parseDateTime((String) entry.getKey());
            dateTime3.getClass();
            arrayList2.add(dateTime3);
            int i16 = hVar == null ? -1 : C1756a.f91824a[hVar.ordinal()];
            if (i16 == -1 || i16 == 1) {
                dateTimePlusDays = dateTime3;
            } else if (i16 == 2) {
                dateTimePlusDays = dateTime3.plusDays(6);
            } else {
                if (i16 != 3) {
                    u0.r();
                    return null;
                }
                dateTimePlusDays = dateTime3.plusDays(Days.daysBetween(dateTime3, dateTime3.plusMonths(1).minusDays(1)).getDays());
            }
            if (list != 0) {
                ListIterator<x> listIterator = list.listIterator(list.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        it = it3;
                        cVar = cVar2;
                        objPrevious = cVar;
                        break;
                    }
                    objPrevious = listIterator.previous();
                    x xVar = (x) objPrevious;
                    cVar = cVar2;
                    it = it3;
                    Interval interval = new Interval(xVar.getStartDate(), xVar.getEndDate());
                    Iterator it4 = q.e(new g(dateTimePlusDays, 19), dateTime3).iterator();
                    while (true) {
                        if (!it4.hasNext()) {
                            next = cVar;
                            break;
                        }
                        next = it4.next();
                        Iterator it5 = it4;
                        if (interval.contains((DateTime) next)) {
                            break;
                        }
                        it4 = it5;
                    }
                    if (next != null) {
                        break;
                    }
                    it3 = it;
                    cVar2 = cVar;
                }
                x xVar2 = (x) objPrevious;
                if (xVar2 != null) {
                    trainingPhase = xVar2.getTrainingPhase();
                }
                iVar = (i) entry.getValue();
                if (iVar != null || (num3 = iVar.f97350d) == null) {
                    r14 = cVar;
                } else {
                    fValueOf3 = Float.valueOf(num3.intValue());
                }
                if (r14 != 0) {
                    r14 = fValueOf3;
                    arrayList3.add(new k61.a(new h0.e.a(i14, r14.floatValue()), dateTime3, trainingPhase));
                }
                r14 = fValueOf3;
                iVar2 = (i) entry.getValue();
                if (iVar2 != null || (num2 = iVar2.f97352f) == null) {
                    r15 = cVar;
                } else {
                    fValueOf2 = Float.valueOf(num2.intValue());
                }
                if (r15 != 0) {
                    r15 = fValueOf2;
                    arrayList4.add(new k61.a(new h0.e.a(i14, r15.floatValue()), dateTime3, trainingPhase));
                }
                r15 = fValueOf2;
                iVar3 = (i) entry.getValue();
                if (iVar3 != null || (num = iVar3.f97354h) == null) {
                    r16 = cVar;
                } else {
                    fValueOf = Float.valueOf(num.intValue());
                }
                if (r16 != 0) {
                    r16 = fValueOf;
                    arrayList5.add(new k61.a(new h0.e.a(i14, r16.floatValue()), dateTime3, trainingPhase));
                } else {
                    r16 = fValueOf;
                }
                it3 = it;
                i14 = i15;
                cVar2 = cVar;
            } else {
                it = it3;
                cVar = cVar2;
            }
            trainingPhase = cVar;
            iVar = (i) entry.getValue();
            if (iVar != null) {
                r14 = cVar;
            } else {
                r14 = cVar;
            }
            if (r14 != 0) {
                r14 = fValueOf3;
                arrayList3.add(new k61.a(new h0.e.a(i14, r14.floatValue()), dateTime3, trainingPhase));
            }
            r14 = fValueOf3;
            iVar2 = (i) entry.getValue();
            if (iVar2 != null) {
                r15 = cVar;
            } else {
                r15 = cVar;
            }
            if (r15 != 0) {
                r15 = fValueOf2;
                arrayList4.add(new k61.a(new h0.e.a(i14, r15.floatValue()), dateTime3, trainingPhase));
            }
            r15 = fValueOf2;
            iVar3 = (i) entry.getValue();
            if (iVar3 != null) {
                r16 = cVar;
            } else {
                r16 = cVar;
            }
            if (r16 != 0) {
                r16 = fValueOf;
                arrayList5.add(new k61.a(new h0.e.a(i14, r16.floatValue()), dateTime3, trainingPhase));
            } else {
                r16 = fValueOf;
            }
            it3 = it;
            i14 = i15;
            cVar2 = cVar;
        }
        c cVar3 = cVar2;
        if (list != null) {
            arrayList = new ArrayList();
            Iterator it6 = list.iterator();
            while (it6.hasNext()) {
                a0 trainingPhase2 = ((x) it6.next()).getTrainingPhase();
                if (trainingPhase2 != null) {
                    arrayList.add(trainingPhase2);
                }
            }
        } else {
            arrayList = cVar3;
        }
        return new b(dateTime2, dateTime, i53.a.j(arrayList2), arrayList != 0 ? i53.a.j(arrayList) : cVar3, hVar, i53.a.j(arrayList3), i53.a.j(arrayList4), i53.a.j(arrayList5));
    }

    public static final int b(int i14) {
        if (t.o(0, 30).d(i14)) {
            return R.string.hrv_stress_level_low;
        }
        if (t.o(30, 60).d(i14)) {
            return R.string.hrv_stress_level_moderate;
        }
        return t.o(60, 90).d(i14) ? R.string.hrv_stress_level_high : R.string.hrv_stress_level_very_high;
    }
}
