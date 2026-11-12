package n41;

import i41.f;
import java.util.ArrayList;
import java.util.List;
import o13.p;
import org.joda.time.DateTime;
import org.joda.time.Days;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Ln41/c;", "", "<init>", "()V", "a", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f123606a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d f123607b = new d(d.a.LOWER, 0.0d);

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Ln41/c$a;", "", "<init>", "()V", "", "ONE_WEEK_IN_DAYS", "I", "Ln41/d;", "yRangeBound", "Ln41/d;", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static z31.b a(a aVar, List list, DateTime dateTime, DateTime dateTime2) {
            int i14;
            ArrayList arrayList;
            p pVar;
            double dMin;
            double dMax;
            double dCeil;
            double d14;
            aVar.getClass();
            list.getClass();
            dateTime.getClass();
            dateTime2.getClass();
            int days = Days.daysBetween(dateTime, dateTime2).getDays() + 1;
            ArrayList<f> arrayList2 = new ArrayList(list);
            if (list.isEmpty()) {
                return new z31.b(Float.valueOf(110.0f), Float.valueOf(0.0f), Float.valueOf(0), Float.valueOf(days), dateTime, dateTime2, days, null, false, 384, null);
            }
            int i15 = Integer.MAX_VALUE;
            int i16 = Integer.MIN_VALUE;
            for (f fVar : arrayList2) {
                Integer weeklyAvg = fVar.getWeeklyAvg();
                Integer lastNightAvg = fVar.getLastNightAvg();
                if (weeklyAvg != null) {
                    int iIntValue = weeklyAvg.intValue();
                    if (i15 > iIntValue) {
                        i15 = iIntValue;
                    } else if (i16 < iIntValue) {
                        i16 = iIntValue;
                    }
                }
                if (lastNightAvg != null) {
                    int iIntValue2 = lastNightAvg.intValue();
                    if (i15 > iIntValue2) {
                        i15 = iIntValue2;
                    } else if (i16 < iIntValue2) {
                        i16 = iIntValue2;
                    }
                }
                i41.a baseline = fVar.getBaseline();
                if (baseline != null) {
                    Integer balancedLow = baseline.getBalancedLow();
                    Integer balancedUpper = baseline.getBalancedUpper();
                    Integer lowUpper = baseline.getLowUpper();
                    if (balancedLow != null) {
                        int iIntValue3 = balancedLow.intValue();
                        if (i15 > iIntValue3) {
                            i15 = iIntValue3;
                        } else if (i16 < iIntValue3) {
                            i16 = iIntValue3;
                        }
                    }
                    if (balancedUpper != null) {
                        int iIntValue4 = balancedUpper.intValue();
                        if (i15 > iIntValue4) {
                            i15 = iIntValue4;
                        } else if (i16 < iIntValue4) {
                            i16 = iIntValue4;
                        }
                    }
                    if (lowUpper != null) {
                        int iIntValue5 = lowUpper.intValue();
                        if (i15 > iIntValue5) {
                            i15 = iIntValue5;
                        } else if (i16 < iIntValue5) {
                            i16 = iIntValue5;
                        }
                    }
                }
            }
            DateTime dateTimePlusDays = dateTime;
            int i17 = 0;
            while (true) {
                if (!dateTimePlusDays.isBefore(dateTime2) && !dateTimePlusDays.isEqual(dateTime2)) {
                    break;
                }
                LocalDate localDateF = ((f) arrayList2.get(i17)).f();
                if (localDateF == null) {
                    localDateF = LocalDate.now();
                }
                int days2 = Days.daysBetween(dateTimePlusDays.toLocalDate(), localDateF).getDays();
                if (days2 > 0) {
                    while (days2 > 0 && dateTimePlusDays.toLocalDate().isBefore(localDateF)) {
                        arrayList2.add(i17, new f(dateTimePlusDays.toString(), (Integer) null, (Integer) null, (Integer) null, (i41.a) null, (String) null, (String) null, (String) null, 254, (j) null));
                        i17++;
                        days2--;
                        dateTimePlusDays = dateTimePlusDays.plusDays(1);
                        dateTimePlusDays.getClass();
                    }
                } else if (days2 != 0) {
                    if (days == arrayList2.size()) {
                        break;
                    }
                    i17++;
                    arrayList2.add(i17, new f(dateTimePlusDays.toString(), (Integer) null, (Integer) null, (Integer) null, (i41.a) null, (String) null, (String) null, (String) null, 254, (j) null));
                } else {
                    dateTimePlusDays = dateTimePlusDays.plusDays(1);
                    dateTimePlusDays.getClass();
                    if (dateTimePlusDays.isBefore(dateTime2) && (i14 = i17 + 1) < arrayList2.size()) {
                        i17 = i14;
                    }
                }
            }
            int i18 = (i15 + i16) / 2;
            double d15 = 1.1d;
            while (d15 <= 2.0d) {
                double d16 = ((double) (i16 - i15)) * d15;
                d dVar = c.f123607b;
                d.a aVar2 = dVar.f123608a;
                d.a aVar3 = d.a.LOWER;
                int i19 = i15;
                double d17 = dVar.f123609b;
                if (aVar2 == aVar3) {
                    dMax = Math.max(((double) i18) - (d16 / 2.0d), d17);
                    dMin = dMax + d16;
                } else {
                    dMin = Math.min((d16 / 2.0d) + ((double) i18), d17);
                    dMax = dMin - d16;
                }
                double d18 = dMax;
                if (dMax == dMin) {
                    double d19 = 3;
                    dMin += d19;
                    dMax = d18 - d19;
                }
                int i24 = i18;
                double d24 = (dMin - dMax) / ((double) 3);
                arrayList = arrayList2;
                double d25 = d15;
                double dPow = Math.pow(10.0d, Math.floor(Math.log10(d24 >= 1.0d ? d24 : 1.0d)));
                int i25 = ((int) ((d24 / dPow) + 0.5d)) * ((int) dPow) <= 1 ? 1 : 5;
                if (dVar.f123608a == aVar3) {
                    d14 = (((int) dMax) / i25) * i25;
                    dCeil = ((double) (i25 * 4)) + d14;
                } else {
                    dCeil = ((double) ((float) Math.ceil(((float) dMin) / i25))) * ((double) i25);
                    d14 = dCeil - ((double) (i25 * 4));
                }
                i15 = i19;
                if (d14 <= i15 && i16 <= dCeil) {
                    pVar = new p(Integer.valueOf((int) d14), Integer.valueOf((int) dCeil));
                    return new z31.b(Float.valueOf(((Number) pVar.f128595b).intValue()), Float.valueOf(((Number) pVar.f128594a).intValue()), Float.valueOf(0), Float.valueOf(days), dateTime, dateTime2, days, arrayList, false, 256, null);
                }
                d15 = d25 + 0.1d;
                i18 = i24;
                arrayList2 = arrayList;
            }
            arrayList = arrayList2;
            pVar = new p(Integer.valueOf(i15), Integer.valueOf(i16));
            return new z31.b(Float.valueOf(((Number) pVar.f128595b).intValue()), Float.valueOf(((Number) pVar.f128594a).intValue()), Float.valueOf(0), Float.valueOf(days), dateTime, dateTime2, days, arrayList, false, 256, null);
        }

        private a() {
        }
    }
}
