package vm1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import km1.r;
import mm1.c;
import mm1.d;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDate;
import p005kotlin.jvm.internal.s;
import zm1.e;
import zm1.f;
import zm1.g;
import zm1.h;
import zm1.q;

/* JADX INFO: loaded from: classes10.dex */
public final class a {
    /* JADX WARN: Code duplicated, block: B:13:0x002b  */
    public static final ArrayList a(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            zm1.a aVar = null;
            if (!it.hasNext()) {
                break;
            }
            c cVar = (c) it.next();
            if (cVar.getCalendarDate() == null) {
                cVar = null;
            } else {
                c.a values = cVar.getValues();
                if ((values != null ? values.getBodyBatteryChange() : null) == null) {
                    cVar = null;
                }
            }
            if (cVar != null) {
                LocalDate localDateA = d.a(cVar);
                c.a values2 = cVar.getValues();
                aVar = new zm1.a(localDateA, values2 != null ? values2.getBodyBatteryChange() : null);
            }
            if (aVar != null) {
                arrayList.add(aVar);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002b  */
    public static final ArrayList b(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            e eVar = null;
            if (!it.hasNext()) {
                break;
            }
            c cVar = (c) it.next();
            if (cVar.getCalendarDate() == null) {
                cVar = null;
            } else {
                c.a values = cVar.getValues();
                if ((values != null ? values.getSpO2() : null) == null) {
                    cVar = null;
                }
            }
            if (cVar != null) {
                LocalDate localDateA = d.a(cVar);
                c.a values2 = cVar.getValues();
                eVar = new e(localDateA, values2 != null ? values2.getSpO2() : null);
            }
            if (eVar != null) {
                arrayList.add(eVar);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002b  */
    public static final ArrayList c(List list) {
        Double respiration;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            f fVar = null;
            dValueOf = null;
            Double dValueOf = null;
            if (!it.hasNext()) {
                break;
            }
            c cVar = (c) it.next();
            if (cVar.getCalendarDate() == null) {
                cVar = null;
            } else {
                c.a values = cVar.getValues();
                if ((values != null ? values.getRespiration() : null) == null) {
                    cVar = null;
                }
            }
            if (cVar != null) {
                LocalDate localDateA = d.a(cVar);
                c.a values2 = cVar.getValues();
                if (values2 != null && (respiration = values2.getRespiration()) != null) {
                    dValueOf = Double.valueOf(Math.floor(respiration.doubleValue()));
                }
                fVar = new f(localDateA, dValueOf);
            }
            if (fVar != null) {
                arrayList.add(fVar);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002b  */
    public static final ArrayList d(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            g gVar = null;
            if (!it.hasNext()) {
                break;
            }
            c cVar = (c) it.next();
            if (cVar.getCalendarDate() == null) {
                cVar = null;
            } else {
                c.a values = cVar.getValues();
                if ((values != null ? values.getRestingHeartRate() : null) == null) {
                    cVar = null;
                }
            }
            if (cVar != null) {
                LocalDate localDateA = d.a(cVar);
                c.a values2 = cVar.getValues();
                gVar = new g(localDateA, values2 != null ? values2.getRestingHeartRate() : null);
            }
            if (gVar != null) {
                arrayList.add(gVar);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0039  */
    public static final ArrayList e(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            h hVar = null;
            if (!it.hasNext()) {
                break;
            }
            c cVar = (c) it.next();
            if (cVar.getCalendarDate() == null) {
                cVar = null;
            } else {
                c.a values = cVar.getValues();
                if ((values != null ? values.getSkinTempC() : null) == null) {
                    cVar = null;
                } else {
                    c.a values2 = cVar.getValues();
                    if ((values2 != null ? values2.getSkinTempF() : null) == null) {
                        cVar = null;
                    }
                }
            }
            if (cVar != null) {
                LocalDate localDateA = d.a(cVar);
                c.a values3 = cVar.getValues();
                Double skinTempC = values3 != null ? values3.getSkinTempC() : null;
                c.a values4 = cVar.getValues();
                hVar = new h(localDateA, skinTempC, values4 != null ? values4.getSkinTempF() : null);
            }
            if (hVar != null) {
                arrayList.add(hVar);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0039  */
    public static final ArrayList f(List list) {
        Long localSleepEndTimeInMillis;
        DateTime dateTimeAtStartOfDay;
        Long localSleepStartTimeInMillis;
        DateTime dateTimeAtStartOfDay2;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            Object eVar = null;
            if (!it.hasNext()) {
                break;
            }
            c cVar = (c) it.next();
            if (cVar.getCalendarDate() == null) {
                cVar = null;
            } else {
                c.a values = cVar.getValues();
                if ((values != null ? values.getLocalSleepStartTimeInMillis() : null) == null) {
                    cVar = null;
                } else {
                    c.a values2 = cVar.getValues();
                    if ((values2 != null ? values2.getLocalSleepEndTimeInMillis() : null) == null) {
                        cVar = null;
                    }
                }
            }
            if (cVar != null) {
                LocalDate localDateA = d.a(cVar);
                LocalDate localDateA2 = d.a(cVar);
                long jLongValue = -1;
                long millis = (localDateA2 == null || (dateTimeAtStartOfDay2 = localDateA2.toDateTimeAtStartOfDay(DateTimeZone.UTC)) == null) ? -1L : dateTimeAtStartOfDay2.getMillis();
                c.a values3 = cVar.getValues();
                long jLongValue2 = ((values3 == null || (localSleepStartTimeInMillis = values3.getLocalSleepStartTimeInMillis()) == null) ? -1L : localSleepStartTimeInMillis.longValue()) - millis;
                long j8 = 1000;
                long j14 = jLongValue2 / j8;
                LocalDate localDateA3 = d.a(cVar);
                long millis2 = (localDateA3 == null || (dateTimeAtStartOfDay = localDateA3.toDateTimeAtStartOfDay(DateTimeZone.UTC)) == null) ? -1L : dateTimeAtStartOfDay.getMillis();
                c.a values4 = cVar.getValues();
                if (values4 != null && (localSleepEndTimeInMillis = values4.getLocalSleepEndTimeInMillis()) != null) {
                    jLongValue = localSleepEndTimeInMillis.longValue();
                }
                long j15 = (jLongValue - millis2) / j8;
                for (Object obj : r.f105571n) {
                    String str = ((r) obj).f105572a;
                    c.a values5 = cVar.getValues();
                    if (s.g(str, values5 != null ? values5.getSleepAlignmentStatus() : null)) {
                        eVar = obj;
                        break;
                    }
                }
                r rVar = (r) eVar;
                if (rVar == null) {
                    rVar = r.NOT_ENOUGH_DATA;
                }
                eVar = new xm1.e(localDateA, j14, j15, rVar);
            }
            if (eVar != null) {
                arrayList.add(eVar);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002b  */
    public static final ArrayList g(List list) {
        Integer totalSleepTimeInSeconds;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            ym1.d dVar = null;
            if (!it.hasNext()) {
                break;
            }
            c cVar = (c) it.next();
            if (cVar.getCalendarDate() == null) {
                cVar = null;
            } else {
                c.a values = cVar.getValues();
                if ((values != null ? values.getTotalSleepTimeInSeconds() : null) == null) {
                    cVar = null;
                }
            }
            if (cVar != null) {
                LocalDate localDateA = d.a(cVar);
                c.a values2 = cVar.getValues();
                dVar = new ym1.d(localDateA, Integer.valueOf((values2 == null || (totalSleepTimeInSeconds = values2.getTotalSleepTimeInSeconds()) == null) ? 0 : totalSleepTimeInSeconds.intValue()));
            }
            if (dVar != null) {
                arrayList.add(dVar);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002b  */
    public static final ArrayList h(List list) {
        Integer sleepNeed;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            ym1.g gVar = null;
            if (!it.hasNext()) {
                break;
            }
            c cVar = (c) it.next();
            if (cVar.getCalendarDate() == null) {
                cVar = null;
            } else {
                c.a values = cVar.getValues();
                if ((values != null ? values.getSleepNeed() : null) == null) {
                    cVar = null;
                }
            }
            if (cVar != null) {
                LocalDate localDateA = d.a(cVar);
                c.a values2 = cVar.getValues();
                gVar = new ym1.g(localDateA, Integer.valueOf(((values2 == null || (sleepNeed = values2.getSleepNeed()) == null) ? 0 : sleepNeed.intValue()) * 60));
            }
            if (gVar != null) {
                arrayList.add(gVar);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002b  */
    public static final ArrayList i(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            q qVar = null;
            if (!it.hasNext()) {
                break;
            }
            c cVar = (c) it.next();
            if (cVar.getCalendarDate() == null) {
                cVar = null;
            } else {
                c.a values = cVar.getValues();
                if ((values != null ? values.getSleepScore() : null) == null) {
                    cVar = null;
                }
            }
            if (cVar != null) {
                LocalDate localDateA = d.a(cVar);
                c.a values2 = cVar.getValues();
                qVar = new q(localDateA, values2 != null ? values2.getSleepScore() : null);
            }
            if (qVar != null) {
                arrayList.add(qVar);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }
}
