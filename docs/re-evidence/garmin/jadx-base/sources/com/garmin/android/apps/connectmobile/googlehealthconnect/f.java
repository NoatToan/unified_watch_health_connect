package com.garmin.android.apps.connectmobile.googlehealthconnect;

import am.x0;
import am.y0;
import android.text.TextUtils;
import c22.j0;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.f3;
import com.garmin.android.apps.connectmobile.i2;
import ds.e0;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.joda.time.DateTime;
import org.joda.time.DateTimeConstants;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDateTime;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.h0;
import p13.k0;
import p13.m0;
import p13.o0;
import rb2.b0;
import rb2.p;
import y8.a1;
import y8.d1;
import y8.o;
import y8.s0;
import y8.u;
import y8.v;
import y8.w;
import y8.x;
import y8.z0;
import zb0.u0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/googlehealthconnect/f;", "", "<init>", "()V", "a", "gcm-google-health-connect_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f36059a = new a(null);

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/garmin/android/apps/connectmobile/googlehealthconnect/f$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "", "HEART_RATE_END_TIME_OFFSET", "I", "gcm-google-health-connect_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static ArrayList a(pb2.g.c cVar, boolean z14) {
            LocalDateTime localDateTime;
            DateTime dateTime;
            ArrayList arrayList = new ArrayList();
            em0.a.f64581a.getClass();
            long jA = em0.a.C1371a.a("WRITE_ACTIVE_CALORIES_BURNED");
            ArrayList<rb2.a.c> arrayListO = o(cVar);
            if (arrayListO != null) {
                for (rb2.a.c cVar2 : arrayListO) {
                    if (cVar2 != null && (localDateTime = cVar2.f151682z) != null && (dateTime = localDateTime.toDateTime(DateTimeZone.UTC)) != null) {
                        long millis = dateTime.getMillis();
                        Double d14 = cVar2.f151663g;
                        Long lValueOf = d14 != null ? Long.valueOf((long) (d14.doubleValue() * ((double) 1000))) : null;
                        if (lValueOf == null || lValueOf.longValue() != 0) {
                            Long lValueOf2 = lValueOf != null ? Long.valueOf(lValueOf.longValue() + millis) : null;
                            Double d15 = cVar2.f151673q;
                            Double d16 = cVar2.f151672p;
                            double dDoubleValue = d16 != null ? d16.doubleValue() : 0.0d;
                            if (lValueOf2 != null && d15 != null) {
                                double dDoubleValue2 = d15.doubleValue();
                                long jLongValue = lValueOf2.longValue();
                                if (z14 || jLongValue > jA || millis > DateTime.now().getMillis()) {
                                    Instant instantOfEpochMilli = Instant.ofEpochMilli(millis);
                                    Instant instantOfEpochMilli2 = Instant.ofEpochMilli(jLongValue);
                                    ZoneOffset zoneOffsetL = f3.l(instantOfEpochMilli);
                                    ZoneOffset zoneOffsetL2 = f3.l(instantOfEpochMilli2);
                                    a aVar = f.f36059a;
                                    String strValueOf = String.valueOf(cVar2.f151658b);
                                    aVar.getClass();
                                    z8.c cVarI = i(strValueOf, cVar2);
                                    double d17 = dDoubleValue2 - dDoubleValue;
                                    if (d17 > 0.0d) {
                                        try {
                                            instantOfEpochMilli.getClass();
                                            instantOfEpochMilli2.getClass();
                                            c9.b.f25946c.getClass();
                                            try {
                                                arrayList.add(new y8.a(instantOfEpochMilli, zoneOffsetL, instantOfEpochMilli2, zoneOffsetL2, c9.b.a.a(d17), cVarI));
                                                jA = jLongValue;
                                            } catch (IllegalArgumentException e4) {
                                                e = e4;
                                                jA = jLongValue;
                                                b bVar = b.f36013a;
                                                b.a aVar2 = b.a.ACTIVE_CALORIES_BURNED;
                                                bVar.getClass();
                                                b.a(aVar2);
                                                a aVar3 = f.f36059a;
                                                i2.a aVar4 = i2.f36769a;
                                                a2 a2Var = a2.GENERAL;
                                                aVar4.getClass();
                                                i2.a.g(a2Var, "GHCModelConverter", e);
                                            }
                                        } catch (IllegalArgumentException e14) {
                                            e = e14;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            em0.a.f64581a.getClass();
            em0.a.C1371a.b(jA, "WRITE_ACTIVE_CALORIES_BURNED");
            return arrayList;
        }

        public static ArrayList b(pb2.g.c cVar) {
            List<b0.a> list;
            int i14;
            b0 b0Var;
            ArrayList arrayList = new ArrayList();
            em0.a.f64581a.getClass();
            long jA = em0.a.C1371a.a("WRITE_BODY_FAT");
            List<pb2.g.b> list2 = cVar.f137141a;
            if (list2 != null) {
                for (pb2.g.b bVar : list2) {
                    f.f36059a.getClass();
                    b0.c cVar2 = (bVar == null || (b0Var = bVar.f137139d) == null) ? null : b0Var.f151695a;
                    if (cVar2 != null && (list = cVar2.f151709b) != null) {
                        for (b0.a aVar : list) {
                            Long l14 = aVar != null ? aVar.f151705j : null;
                            Double d14 = aVar != null ? aVar.f151698c : null;
                            String str = aVar != null ? aVar.f151702g : null;
                            if (l14 != null && d14 != null && str != null) {
                                double dDoubleValue = d14.doubleValue();
                                long jLongValue = l14.longValue();
                                if (jLongValue > jA) {
                                    Instant instantOfEpochMilli = Instant.ofEpochMilli(jLongValue);
                                    ZoneOffset zoneOffsetL = f3.l(instantOfEpochMilli);
                                    if (dDoubleValue > 0.0d) {
                                        try {
                                            instantOfEpochMilli.getClass();
                                            c9.e eVar = new c9.e(dDoubleValue);
                                            z8.c.a aVar2 = z8.c.f202966h;
                                            em0.a.f64581a.getClass();
                                            switch (em0.a.C1371a.e.f64612a[em0.a.C1371a.b.valueOf(str).ordinal()]) {
                                                case 1:
                                                case 2:
                                                case 3:
                                                case 4:
                                                case 5:
                                                    i14 = 2;
                                                    break;
                                                case 6:
                                                    i14 = 1;
                                                    break;
                                                case 7:
                                                    i14 = 3;
                                                    break;
                                                default:
                                                    i14 = 0;
                                                    break;
                                            }
                                            z8.b bVar2 = new z8.b(i14, null, null, 6, null);
                                            String strValueOf = String.valueOf(jLongValue);
                                            aVar2.getClass();
                                            y8.g gVar = new y8.g(instantOfEpochMilli, zoneOffsetL, eVar, z8.c.a.a(bVar2, strValueOf));
                                            if (jLongValue > jA) {
                                                jA = jLongValue;
                                            }
                                            arrayList.add(gVar);
                                        } catch (IllegalArgumentException e4) {
                                            b bVar3 = b.f36013a;
                                            b.a aVar3 = b.a.WEIGHT;
                                            bVar3.getClass();
                                            b.a(aVar3);
                                            a aVar4 = f.f36059a;
                                            i2.a aVar5 = i2.f36769a;
                                            a2 a2Var = a2.GENERAL;
                                            aVar5.getClass();
                                            i2.a.g(a2Var, "GHCModelConverter", e4);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            em0.a.f64581a.getClass();
            em0.a.C1371a.b(jA, "WRITE_BODY_FAT");
            return arrayList;
        }

        /* JADX WARN: Code duplicated, block: B:96:0x02fe  */
        /* JADX WARN: Multi-variable type inference failed */
        public static ArrayList c(pb2.g.c cVar) {
            Iterator it;
            double d14;
            double d15;
            double d16;
            LocalDateTime localDateTime;
            DateTime dateTime;
            p.d dVar;
            ArrayList arrayList = new ArrayList();
            pb2.g.c cVar2 = cVar;
            List<pb2.g.b> list = cVar2.f137141a;
            if (list != null) {
                Iterator it3 = list.iterator();
                while (it3.hasNext()) {
                    pb2.g.b bVar = (pb2.g.b) it3.next();
                    f.f36059a.getClass();
                    pb2.g.e eVar = bVar != null ? bVar.f137138c : null;
                    if (eVar == null) {
                        it = it3;
                    } else {
                        p pVar = eVar.f137148d;
                        p.c cVar3 = pVar != null ? pVar.f151749a : null;
                        DateTime dateTime2 = eVar.f137146b;
                        Double d17 = (cVar3 == null || (dVar = cVar3.f151753a) == null) ? null : dVar.f151755a;
                        if (dateTime2 == null || d17 == null) {
                            it = it3;
                        } else {
                            double dDoubleValue = d17.doubleValue();
                            ArrayList<o13.p> arrayList2 = new ArrayList();
                            long millis = dateTime2.getMillis();
                            ArrayList<rb2.a.c> arrayListO = o(cVar2);
                            if (arrayListO != null) {
                                d15 = 0.0d;
                                for (rb2.a.c cVar4 : arrayListO) {
                                    Long lValueOf = (cVar4 == null || (localDateTime = cVar4.f151682z) == null || (dateTime = localDateTime.toDateTime(DateTimeZone.UTC)) == null) ? null : Long.valueOf(dateTime.getMillis());
                                    long millis2 = DateTime.now().getMillis();
                                    Iterator it4 = it3;
                                    if (lValueOf != null) {
                                        d16 = dDoubleValue;
                                        if (j0.E(lValueOf.longValue(), dateTime2.getMillis()) || lValueOf.longValue() > millis2) {
                                            Double d18 = cVar4.f151663g;
                                            Long lValueOf2 = d18 != null ? Long.valueOf((long) (d18.doubleValue() * ((double) 1000))) : null;
                                            if (lValueOf2 != null && lValueOf2.longValue() == 0) {
                                                a aVar = f.f36059a;
                                                String str = "getDistanceRecord, duration=" + lValueOf2 + ", not writing record";
                                                i2.a aVar2 = i2.f36769a;
                                                a2 a2Var = a2.GENERAL;
                                                aVar2.getClass();
                                                i2.a.b(a2Var, "GHCModelConverter", str);
                                            } else {
                                                Long lValueOf3 = lValueOf2 != null ? Long.valueOf(lValueOf.longValue() + lValueOf2.longValue()) : null;
                                                Double d19 = cVar4.f151662f;
                                                if (lValueOf3 != null && d19 != null) {
                                                    double dDoubleValue2 = d19.doubleValue();
                                                    long jLongValue = lValueOf3.longValue();
                                                    long jLongValue2 = lValueOf.longValue();
                                                    Instant instantOfEpochMilli = Instant.ofEpochMilli(jLongValue2);
                                                    Instant instantOfEpochMilli2 = Instant.ofEpochMilli(jLongValue);
                                                    ZoneOffset zoneOffsetL = f3.l(instantOfEpochMilli);
                                                    ZoneOffset zoneOffsetL2 = f3.l(instantOfEpochMilli2);
                                                    a aVar3 = f.f36059a;
                                                    String strValueOf = String.valueOf(cVar4.f151658b);
                                                    aVar3.getClass();
                                                    z8.c cVarI = i(strValueOf, cVar4);
                                                    try {
                                                        instantOfEpochMilli.getClass();
                                                        instantOfEpochMilli2.getClass();
                                                        c9.c.f25961c.getClass();
                                                        y8.n nVar = new y8.n(instantOfEpochMilli, zoneOffsetL, instantOfEpochMilli2, zoneOffsetL2, c9.c.a.a(dDoubleValue2), cVarI);
                                                        double d24 = d15 + dDoubleValue2;
                                                        try {
                                                            arrayList2.add(new o13.p(Long.valueOf(millis), Long.valueOf(jLongValue2)));
                                                            if (d24 > 0.0d) {
                                                                try {
                                                                    arrayList.add(nVar);
                                                                } catch (IllegalArgumentException e4) {
                                                                    e = e4;
                                                                    d15 = d24;
                                                                    millis = jLongValue;
                                                                    b bVar2 = b.f36013a;
                                                                    b.a aVar4 = b.a.ACTIVE_DISTANCE;
                                                                    bVar2.getClass();
                                                                    b.a(aVar4);
                                                                    a aVar5 = f.f36059a;
                                                                    i2.a aVar6 = i2.f36769a;
                                                                    a2 a2Var2 = a2.GENERAL;
                                                                    aVar6.getClass();
                                                                    i2.a.g(a2Var2, "GHCModelConverter", e);
                                                                    Unit unit = Unit.INSTANCE;
                                                                }
                                                            } else {
                                                                i2.a aVar7 = i2.f36769a;
                                                                a2 a2Var3 = a2.GENERAL;
                                                                aVar7.getClass();
                                                                i2.a.b(a2Var3, "GHCModelConverter", "getDistanceRecord, totalActivityDistance=" + d24 + ", not writing record");
                                                                Unit unit2 = Unit.INSTANCE;
                                                            }
                                                            d15 = d24;
                                                            millis = jLongValue;
                                                        } catch (IllegalArgumentException e14) {
                                                            e = e14;
                                                            d15 = d24;
                                                        }
                                                    } catch (IllegalArgumentException e15) {
                                                        e = e15;
                                                    }
                                                }
                                            }
                                        }
                                        it3 = it4;
                                        dDoubleValue = d16;
                                    } else {
                                        d16 = dDoubleValue;
                                    }
                                    a aVar8 = f.f36059a;
                                    String str2 = "getDistanceRecord: problematic timestamps for activity distance, not writing record, activityStartTime=" + lValueOf + ", safeTime.millis=" + dateTime2.getMillis() + ", dateTimeNow=" + millis2;
                                    i2.a aVar9 = i2.f36769a;
                                    a2 a2Var4 = a2.GENERAL;
                                    aVar9.getClass();
                                    i2.a.b(a2Var4, "GHCModelConverter", str2);
                                    it3 = it4;
                                    dDoubleValue = d16;
                                }
                                d14 = 0.0d;
                            } else {
                                d14 = 0.0d;
                                d15 = 0.0d;
                            }
                            it = it3;
                            double d25 = dDoubleValue;
                            arrayList2.add(new o13.p(Long.valueOf(millis), Long.valueOf(dateTime2.plusDays(1).minusSeconds(1).getMillis())));
                            long jLongValue3 = 0;
                            for (o13.p pVar2 : arrayList2) {
                                jLongValue3 += ((Number) pVar2.f128595b).longValue() - ((Number) pVar2.f128594a).longValue();
                            }
                            for (o13.p pVar3 : arrayList2) {
                                try {
                                    double dLongValue = ((((Number) pVar3.f128595b).longValue() - ((Number) pVar3.f128594a).longValue()) / jLongValue3) * (d25 - d15);
                                    long jLongValue4 = ((Number) pVar3.f128594a).longValue();
                                    long jLongValue5 = ((Number) pVar3.f128595b).longValue();
                                    Instant instantOfEpochMilli3 = Instant.ofEpochMilli(jLongValue4);
                                    Instant instantOfEpochMilli4 = Instant.ofEpochMilli(jLongValue5);
                                    ZoneOffset offset = ZoneId.systemDefault().getRules().getOffset(instantOfEpochMilli3);
                                    ZoneOffset offset2 = ZoneId.systemDefault().getRules().getOffset(instantOfEpochMilli4);
                                    if (dLongValue > d14) {
                                        instantOfEpochMilli3.getClass();
                                        instantOfEpochMilli4.getClass();
                                        c9.c.f25961c.getClass();
                                        c9.c cVarA = c9.c.a.a(dLongValue);
                                        z8.c.a aVar10 = z8.c.f202966h;
                                        z8.b bVar3 = new z8.b(1, null, null, 6, null);
                                        String strValueOf2 = String.valueOf(jLongValue4);
                                        aVar10.getClass();
                                        arrayList.add(new y8.n(instantOfEpochMilli3, offset, instantOfEpochMilli4, offset2, cVarA, z8.c.a.a(bVar3, strValueOf2)));
                                    } else {
                                        a aVar11 = f.f36059a;
                                        String str3 = "getDistanceRecord: distributedDistance=" + dLongValue + ", not writing record";
                                        i2.a aVar12 = i2.f36769a;
                                        a2 a2Var5 = a2.GENERAL;
                                        aVar12.getClass();
                                        i2.a.b(a2Var5, "GHCModelConverter", str3);
                                    }
                                } catch (IllegalArgumentException e16) {
                                    b bVar4 = b.f36013a;
                                    b.a aVar13 = b.a.PASSIVE_DISTANCE;
                                    bVar4.getClass();
                                    b.a(aVar13);
                                    a aVar14 = f.f36059a;
                                    i2.a aVar15 = i2.f36769a;
                                    a2 a2Var6 = a2.GENERAL;
                                    aVar15.getClass();
                                    i2.a.g(a2Var6, "GHCModelConverter", e16);
                                }
                            }
                        }
                    }
                    cVar2 = cVar;
                    it3 = it;
                }
            }
            return arrayList;
        }

        /* JADX WARN: Code duplicated, block: B:49:0x00a9  */
        /* JADX WARN: Code duplicated, block: B:69:0x00de  */
        public static ArrayList d(pb2.g.c cVar, boolean z14) {
            Integer num;
            Integer num2;
            rb2.a.b bVar;
            List<rb2.a.C2855a> list;
            Iterator it;
            char c14;
            List<Double> list2;
            Double d14;
            List<Double> list3;
            Double d15;
            rb2.a.b bVar2;
            List<rb2.a.e> list4;
            Object next;
            rb2.a.e eVar;
            rb2.a.b bVar3;
            List<rb2.a.e> list5;
            Object next2;
            rb2.a.e eVar2;
            Double d16;
            LocalDateTime localDateTime;
            DateTime dateTime;
            ArrayList arrayList = new ArrayList();
            em0.a.f64581a.getClass();
            long jA = em0.a.C1371a.a("WRITE_ELEVATION_GAINED");
            ArrayList arrayListO = o(cVar);
            if (arrayListO != null) {
                Iterator it3 = arrayListO.iterator();
                while (it3.hasNext()) {
                    rb2.a.c cVar2 = (rb2.a.c) it3.next();
                    Long lValueOf = (cVar2 == null || (localDateTime = cVar2.f151682z) == null || (dateTime = localDateTime.toDateTime(DateTimeZone.UTC)) == null) ? null : Long.valueOf(dateTime.getMillis());
                    Long lValueOf2 = (cVar2 == null || (d16 = cVar2.f151663g) == null) ? null : Long.valueOf((long) (d16.doubleValue() * ((double) 1000)));
                    Long lValueOf3 = (lValueOf == null || lValueOf2 == null) ? null : Long.valueOf(lValueOf.longValue() + lValueOf2.longValue());
                    if (lValueOf3 != null && (z14 || lValueOf3.longValue() > jA)) {
                        if (cVar2 == null || (bVar3 = cVar2.f151657a) == null || (list5 = bVar3.f151655e) == null) {
                            num = null;
                        } else {
                            Iterator<T> it4 = list5.iterator();
                            do {
                                if (!it4.hasNext()) {
                                    next2 = null;
                                    break;
                                }
                                next2 = it4.next();
                                eVar2 = (rb2.a.e) next2;
                            } while (!s.g(eVar2 != null ? eVar2.f151685a : null, em0.a.C1371a.EnumC1372a.DIRECT_ELEVATION.f64588a));
                            rb2.a.e eVar3 = (rb2.a.e) next2;
                            if (eVar3 != null) {
                                num = eVar3.f151686b;
                            } else {
                                num = null;
                            }
                        }
                        if (cVar2 == null || (bVar2 = cVar2.f151657a) == null || (list4 = bVar2.f151655e) == null) {
                            num2 = null;
                        } else {
                            Iterator<T> it5 = list4.iterator();
                            do {
                                if (!it5.hasNext()) {
                                    next = null;
                                    break;
                                }
                                next = it5.next();
                                eVar = (rb2.a.e) next;
                            } while (!s.g(eVar != null ? eVar.f151685a : null, em0.a.C1371a.EnumC1372a.SUM_DURATION.f64588a));
                            rb2.a.e eVar4 = (rb2.a.e) next;
                            if (eVar4 != null) {
                                num2 = eVar4.f151686b;
                            } else {
                                num2 = null;
                            }
                        }
                        if (num != null && num2 != null && lValueOf != null) {
                            long jLongValue = lValueOf.longValue();
                            int iIntValue = num2.intValue();
                            int iIntValue2 = num.intValue();
                            if (cVar2 != null && (bVar = cVar2.f151657a) != null && (list = bVar.f151651a) != null) {
                                List<Double> list6 = null;
                                for (rb2.a.C2855a c2855a : list) {
                                    Double d17 = list6 != null ? list6.get(iIntValue2) : null;
                                    Long lValueOf4 = (list6 == null || (d15 = list6.get(iIntValue)) == null) ? null : Long.valueOf((long) d15.doubleValue());
                                    Double d18 = (c2855a == null || (list3 = c2855a.f151650a) == null) ? null : list3.get(iIntValue2);
                                    List<Double> list7 = list6;
                                    Long lValueOf5 = (c2855a == null || (list2 = c2855a.f151650a) == null || (d14 = list2.get(iIntValue)) == null) ? null : Long.valueOf((long) d14.doubleValue());
                                    if (d18 != null && lValueOf5 != null) {
                                        list7 = c2855a != null ? c2855a.f151650a : null;
                                    }
                                    if (lValueOf4 == null || lValueOf5 == null || d17 == null || d18 == null) {
                                        it = it3;
                                        c14 = 1000;
                                    } else {
                                        double dDoubleValue = d18.doubleValue();
                                        double dDoubleValue2 = d17.doubleValue();
                                        long jLongValue2 = lValueOf5.longValue();
                                        it = it3;
                                        c14 = 1000;
                                        long j8 = 1000;
                                        long jLongValue3 = (lValueOf4.longValue() * j8) + jLongValue;
                                        long j14 = (jLongValue2 * j8) + jLongValue;
                                        if (z14 || j14 > jA) {
                                            double d19 = dDoubleValue - dDoubleValue2;
                                            if (d19 > 0.0d) {
                                                Instant instantOfEpochMilli = Instant.ofEpochMilli(jLongValue3);
                                                Instant instantOfEpochMilli2 = Instant.ofEpochMilli(j14);
                                                ZoneOffset zoneOffsetL = f3.l(instantOfEpochMilli);
                                                ZoneOffset zoneOffsetL2 = f3.l(instantOfEpochMilli2);
                                                Long l14 = cVar2.f151658b;
                                                long epochMilli = instantOfEpochMilli.toEpochMilli();
                                                StringBuilder sb3 = new StringBuilder();
                                                sb3.append(l14);
                                                sb3.append(epochMilli);
                                                String string = sb3.toString();
                                                f.f36059a.getClass();
                                                z8.c cVarI = i(string, cVar2);
                                                try {
                                                    instantOfEpochMilli2.getClass();
                                                    c9.c.f25961c.getClass();
                                                    try {
                                                        arrayList.add(new o(instantOfEpochMilli, zoneOffsetL, instantOfEpochMilli2, zoneOffsetL2, c9.c.a.a(d19), cVarI));
                                                        jA = j14;
                                                    } catch (IllegalArgumentException e4) {
                                                        e = e4;
                                                        jA = j14;
                                                        b bVar4 = b.f36013a;
                                                        b.a aVar = b.a.ELEVATION_GAINED;
                                                        bVar4.getClass();
                                                        b.a(aVar);
                                                        a aVar2 = f.f36059a;
                                                        i2.a aVar3 = i2.f36769a;
                                                        a2 a2Var = a2.GENERAL;
                                                        aVar3.getClass();
                                                        i2.a.g(a2Var, "GHCModelConverter", e);
                                                    }
                                                } catch (IllegalArgumentException e14) {
                                                    e = e14;
                                                }
                                            }
                                        }
                                    }
                                    list6 = list7;
                                    it3 = it;
                                    jA = jA;
                                }
                            }
                        }
                    }
                    it3 = it3;
                }
            }
            em0.a.f64581a.getClass();
            em0.a.C1371a.b(jA, "WRITE_ELEVATION_GAINED");
            return arrayList;
        }

        public static LinkedHashMap e(List list, List list2) {
            String string;
            k0 k0Var = k0.f134949a;
            k0Var.getClass();
            LinkedHashMap linkedHashMap = new LinkedHashMap(k0Var);
            if (list != null && list2 != null) {
                ArrayList arrayListZ = h0.Z(list2);
                ArrayList<List> arrayList = new ArrayList();
                for (Object obj : arrayListZ) {
                    if (((List) obj).size() == list.size()) {
                        arrayList.add(obj);
                    }
                }
                for (List list3 : arrayList) {
                    Object objE0 = h0.e0(0, list3);
                    if (objE0 != null) {
                        String string2 = objE0.toString();
                        Object objE1 = h0.e0(1, list3);
                        linkedHashMap.put(string2, (objE1 == null || (string = objE1.toString()) == null) ? null : Double.valueOf(Double.parseDouble(string)));
                    }
                }
            }
            return linkedHashMap;
        }

        /* JADX WARN: Code duplicated, block: B:130:0x02a3  */
        /* JADX WARN: Code duplicated, block: B:131:0x02a6  */
        /* JADX WARN: Code duplicated, block: B:163:0x0303  */
        /* JADX WARN: Code duplicated, block: B:168:0x0316  */
        /* JADX WARN: Code duplicated, block: B:175:0x0336  */
        /* JADX WARN: Code duplicated, block: B:181:0x0361  */
        /* JADX WARN: Code duplicated, block: B:185:0x0372  */
        /* JADX WARN: Code duplicated, block: B:84:0x01eb  */
        public static ArrayList f(pb2.g.c cVar, boolean z14) {
            Integer num;
            Double d14;
            int i14;
            long j8;
            ArrayList arrayList;
            Long l14;
            Integer num2;
            Integer num3;
            ArrayList arrayList2;
            List<rb2.a.C2855a> list;
            Iterator it;
            rb2.a.C2855a c2855a;
            Double d15;
            Double dValueOf;
            List<Double> list2;
            Double d16;
            List<Double> list3;
            List<rb2.a.e> list4;
            Object next;
            List<rb2.a.e> list5;
            Object next2;
            rb2.a.e eVar;
            rb2.a.e eVar2;
            rb2.a.d dVar;
            Long l15;
            Double d17;
            LocalDateTime localDateTime;
            DateTime dateTime;
            ArrayList arrayList3 = new ArrayList();
            em0.a.f64581a.getClass();
            long jA = em0.a.C1371a.a("WRITE_EXERCISE");
            ArrayList<rb2.a.c> arrayListO = o(cVar);
            if (arrayListO != null) {
                for (rb2.a.c cVar2 : arrayListO) {
                    Long lValueOf = (cVar2 == null || (localDateTime = cVar2.f151682z) == null || (dateTime = localDateTime.toDateTime(DateTimeZone.UTC)) == null) ? null : Long.valueOf(dateTime.getMillis());
                    Long lValueOf2 = (cVar2 == null || (d17 = cVar2.f151663g) == null) ? null : Long.valueOf((long) (d17.doubleValue() * ((double) 1000)));
                    if (lValueOf2 == null || lValueOf2.longValue() != 0) {
                        Long lValueOf3 = (lValueOf == null || lValueOf2 == null) ? null : Long.valueOf(lValueOf.longValue() + lValueOf2.longValue());
                        x0 x0VarJ = (cVar2 == null || (dVar = cVar2.f151660d) == null || (l15 = dVar.f151683a) == null) ? null : ((y0) KoinJavaComponent.get$default(y0.class, null, null, 6, null)).j((int) l15.longValue());
                        if (x0VarJ != null) {
                            em0.a.f64581a.getClass();
                            num = 31;
                            switch (em0.a.C1371a.e.f64613b[x0VarJ.ordinal()]) {
                                case 1:
                                    num = 2;
                                    break;
                                case 2:
                                    num = 4;
                                    break;
                                case 3:
                                    num = 5;
                                    break;
                                case 4:
                                case 5:
                                case 6:
                                case 7:
                                case 8:
                                case 9:
                                case 10:
                                case 11:
                                case 12:
                                case 13:
                                case 14:
                                case 15:
                                    num = 8;
                                    break;
                                case 16:
                                    num = 11;
                                    break;
                                case 17:
                                    num = 14;
                                    break;
                                case 18:
                                    num = 16;
                                    break;
                                case 19:
                                    num = 25;
                                    break;
                                case 20:
                                    num = 28;
                                    break;
                                case 21:
                                case 22:
                                    break;
                                case 23:
                                    num = 32;
                                    break;
                                case 24:
                                    num = 36;
                                    break;
                                case 25:
                                    num = 37;
                                    break;
                                case 26:
                                    num = 38;
                                    break;
                                case 27:
                                    num = 48;
                                    break;
                                case 28:
                                    num = 50;
                                    break;
                                case 29:
                                case 30:
                                    num = 51;
                                    break;
                                case 31:
                                    num = 52;
                                    break;
                                case 32:
                                case 33:
                                    num = 53;
                                    break;
                                case 34:
                                case 35:
                                    num = 54;
                                    break;
                                case 36:
                                    num = 55;
                                    break;
                                case 37:
                                case 38:
                                case 39:
                                case 40:
                                case 41:
                                case 42:
                                case 43:
                                case 44:
                                case 45:
                                    num = 56;
                                    break;
                                case 46:
                                    num = 57;
                                    break;
                                case 47:
                                case 48:
                                    num = 58;
                                    break;
                                case 49:
                                    num = 59;
                                    break;
                                case 50:
                                case 51:
                                    num = 60;
                                    break;
                                case 52:
                                case 53:
                                case 54:
                                    num = 61;
                                    break;
                                case 55:
                                case 56:
                                    num = 62;
                                    break;
                                case 57:
                                    num = 63;
                                    break;
                                case 58:
                                    num = 64;
                                    break;
                                case 59:
                                    num = 65;
                                    break;
                                case 60:
                                    num = 66;
                                    break;
                                case 61:
                                    num = 68;
                                    break;
                                case 62:
                                case 63:
                                    num = 70;
                                    break;
                                case 64:
                                case 65:
                                    num = 72;
                                    break;
                                case 66:
                                case 67:
                                    num = 74;
                                    break;
                                case 68:
                                    num = 73;
                                    break;
                                case 69:
                                    num = 75;
                                    break;
                                case 70:
                                    num = 76;
                                    break;
                                case 71:
                                    num = 78;
                                    break;
                                case 72:
                                case 73:
                                case 74:
                                case 75:
                                    num = 79;
                                    break;
                                case 76:
                                    num = 83;
                                    break;
                                case 77:
                                case 78:
                                case 79:
                                case 80:
                                case 81:
                                case 82:
                                case 83:
                                case 84:
                                case 85:
                                case 86:
                                case 87:
                                case 88:
                                case 89:
                                case 90:
                                case 91:
                                case 92:
                                case 93:
                                case 94:
                                case 95:
                                case 96:
                                    num = null;
                                    break;
                                default:
                                    num = 0;
                                    break;
                            }
                        } else {
                            num = null;
                        }
                        if (lValueOf == null || lValueOf3 == null || num == null || cVar2 == null) {
                            jA = jA;
                        } else {
                            Long l16 = cVar2.f151658b;
                            int iIntValue = num.intValue();
                            long jLongValue = lValueOf3.longValue();
                            long jLongValue2 = lValueOf.longValue();
                            if (z14 || jLongValue > jA || jLongValue2 > DateTime.now().getMillis()) {
                                ArrayList arrayList4 = new ArrayList();
                                if ((iIntValue == 73 || iIntValue == 74) && (d14 = cVar2.f151680x) != null) {
                                    double dDoubleValue = d14.doubleValue();
                                    int i15 = iIntValue == 74 ? 62 : 60;
                                    if (dDoubleValue > 0.0d) {
                                        try {
                                            Instant instantOfEpochMilli = Instant.ofEpochMilli(jLongValue2);
                                            instantOfEpochMilli.getClass();
                                            Instant instantOfEpochMilli2 = Instant.ofEpochMilli(jLongValue);
                                            instantOfEpochMilli2.getClass();
                                            arrayList4.add(new u(instantOfEpochMilli, instantOfEpochMilli2, i15, (int) dDoubleValue));
                                        } catch (IllegalArgumentException e4) {
                                            b bVar = b.f36013a;
                                            b.a aVar = b.a.EXERCISE_SEGMENT;
                                            bVar.getClass();
                                            b.a(aVar);
                                            a aVar2 = f.f36059a;
                                            i2.a aVar3 = i2.f36769a;
                                            a2 a2Var = a2.GENERAL;
                                            aVar3.getClass();
                                            i2.a.g(a2Var, "GHCModelConverter", e4);
                                        }
                                    }
                                    i14 = 8;
                                } else {
                                    i14 = 8;
                                }
                                if (iIntValue == i14) {
                                    f.f36059a.getClass();
                                    ArrayList arrayList5 = new ArrayList();
                                    rb2.a.b bVar2 = cVar2.f151657a;
                                    if (bVar2 == null || (list5 = bVar2.f151655e) == null) {
                                        num2 = null;
                                    } else {
                                        Iterator<T> it3 = list5.iterator();
                                        do {
                                            if (it3.hasNext()) {
                                                next2 = it3.next();
                                                eVar2 = (rb2.a.e) next2;
                                            } else {
                                                next2 = null;
                                            }
                                            eVar = (rb2.a.e) next2;
                                            if (eVar != null) {
                                                num2 = eVar.f151686b;
                                            } else {
                                                num2 = null;
                                            }
                                        } while (!s.g(eVar2 != null ? eVar2.f151685a : null, em0.a.C1371a.EnumC1372a.DIRECT_BIKE_CADENCE.f64588a));
                                        eVar = (rb2.a.e) next2;
                                        if (eVar != null) {
                                            num2 = eVar.f151686b;
                                        } else {
                                            num2 = null;
                                        }
                                    }
                                    if (bVar2 == null || (list4 = bVar2.f151655e) == null) {
                                        j8 = jA;
                                    } else {
                                        Iterator<T> it4 = list4.iterator();
                                        while (true) {
                                            if (it4.hasNext()) {
                                                next = it4.next();
                                                rb2.a.e eVar3 = (rb2.a.e) next;
                                                j8 = jA;
                                                if (!s.g(eVar3 != null ? eVar3.f151685a : null, em0.a.C1371a.EnumC1372a.SUM_DURATION.f64588a)) {
                                                    jA = j8;
                                                }
                                            } else {
                                                j8 = jA;
                                                next = null;
                                            }
                                        }
                                        rb2.a.e eVar4 = (rb2.a.e) next;
                                        num3 = eVar4 != null ? eVar4.f151686b : null;
                                        arrayList2 = new ArrayList();
                                        if (num2 != null && num3 != null) {
                                            int iIntValue2 = num3.intValue();
                                            int iIntValue3 = num2.intValue();
                                            if (bVar2 != null && (list = bVar2.f151651a) != null) {
                                                for (it = list.iterator(); it.hasNext(); it = it) {
                                                    c2855a = (rb2.a.C2855a) it.next();
                                                    if (c2855a != null || (list3 = c2855a.f151650a) == null) {
                                                        d15 = null;
                                                    } else {
                                                        d15 = list3.get(iIntValue3);
                                                    }
                                                    if (c2855a != null || (list2 = c2855a.f151650a) == null || (d16 = list2.get(iIntValue2)) == null) {
                                                        dValueOf = null;
                                                    } else {
                                                        dValueOf = Double.valueOf(d16.doubleValue() * ((double) 1000));
                                                    }
                                                    if (d15 == null && dValueOf != null) {
                                                        double dDoubleValue2 = dValueOf.doubleValue();
                                                        double dDoubleValue3 = d15.doubleValue();
                                                        long j14 = jLongValue2 + ((long) dDoubleValue2);
                                                        if (dDoubleValue3 > 0.0d) {
                                                            Instant instantOfEpochMilli3 = Instant.ofEpochMilli(j14);
                                                            instantOfEpochMilli3.getClass();
                                                            arrayList2.add(new y8.m.b(instantOfEpochMilli3, dDoubleValue3));
                                                        }
                                                    }
                                                    l16 = l16;
                                                    arrayList4 = arrayList4;
                                                }
                                            }
                                        }
                                        arrayList = arrayList4;
                                        l14 = l16;
                                        if (!arrayList2.isEmpty()) {
                                            List listN0 = h0.N0(arrayList2, new c());
                                            Instant instant = ((y8.m.b) h0.b0(listN0)).f194892a;
                                            Instant instant2 = ((y8.m.b) h0.m0(listN0)).f194892a;
                                            try {
                                                arrayList5.add(new y8.m(instant, f3.l(instant), instant2, f3.l(instant2), arrayList2, i(String.valueOf(l14), cVar2)));
                                            } catch (IllegalArgumentException e14) {
                                                b bVar3 = b.f36013a;
                                                b.a aVar4 = b.a.CYCLING_PEDALING_CADENCE;
                                                bVar3.getClass();
                                                b.a(aVar4);
                                                i2.a aVar5 = i2.f36769a;
                                                a2 a2Var2 = a2.GENERAL;
                                                aVar5.getClass();
                                                i2.a.g(a2Var2, "GHCModelConverter", e14);
                                            }
                                        }
                                        arrayList3.addAll(arrayList5);
                                    }
                                    arrayList2 = new ArrayList();
                                    if (num2 != null) {
                                        int iIntValue4 = num3.intValue();
                                        int iIntValue5 = num2.intValue();
                                        if (bVar2 != null) {
                                            while (it.hasNext()) {
                                                c2855a = (rb2.a.C2855a) it.next();
                                                if (c2855a != null) {
                                                    d15 = null;
                                                } else {
                                                    d15 = null;
                                                }
                                                if (c2855a != null) {
                                                    dValueOf = null;
                                                } else {
                                                    dValueOf = null;
                                                }
                                                if (d15 == null) {
                                                }
                                                l16 = l16;
                                                arrayList4 = arrayList4;
                                            }
                                        }
                                    }
                                    arrayList = arrayList4;
                                    l14 = l16;
                                    if (!arrayList2.isEmpty()) {
                                        List listN1 = h0.N0(arrayList2, new c());
                                        Instant instant3 = ((y8.m.b) h0.b0(listN1)).f194892a;
                                        Instant instant4 = ((y8.m.b) h0.m0(listN1)).f194892a;
                                        arrayList5.add(new y8.m(instant3, f3.l(instant3), instant4, f3.l(instant4), arrayList2, i(String.valueOf(l14), cVar2)));
                                    }
                                    arrayList3.addAll(arrayList5);
                                } else {
                                    j8 = jA;
                                    arrayList = arrayList4;
                                    l14 = l16;
                                }
                                Instant instantOfEpochMilli4 = Instant.ofEpochMilli(jLongValue2);
                                ArrayList arrayList6 = arrayList;
                                Instant instantOfEpochMilli5 = Instant.ofEpochMilli(jLongValue);
                                ZoneOffset zoneOffsetL = f3.l(instantOfEpochMilli4);
                                ZoneOffset zoneOffsetL2 = f3.l(instantOfEpochMilli5);
                                a aVar6 = f.f36059a;
                                String strValueOf = String.valueOf(l14);
                                aVar6.getClass();
                                z8.c cVarI = i(strValueOf, cVar2);
                                try {
                                    instantOfEpochMilli4.getClass();
                                    instantOfEpochMilli5.getClass();
                                    try {
                                        arrayList3.add(new v(instantOfEpochMilli4, zoneOffsetL, instantOfEpochMilli5, zoneOffsetL2, cVarI, iIntValue, (String) null, (String) null, arrayList6, (List) null, (y8.s) null, (String) null, 3776, (p005kotlin.jvm.internal.j) null));
                                        jA = jLongValue;
                                    } catch (IllegalArgumentException e15) {
                                        e = e15;
                                        jA = jLongValue;
                                        b bVar4 = b.f36013a;
                                        b.a aVar7 = b.a.EXERCISE;
                                        bVar4.getClass();
                                        b.a(aVar7);
                                        a aVar8 = f.f36059a;
                                        i2.a aVar9 = i2.f36769a;
                                        a2 a2Var3 = a2.GENERAL;
                                        aVar9.getClass();
                                        i2.a.g(a2Var3, "GHCModelConverter", e);
                                        Unit unit = Unit.INSTANCE;
                                    }
                                } catch (IllegalArgumentException e16) {
                                    e = e16;
                                    jA = j8;
                                }
                            }
                        }
                    }
                }
            }
            em0.a.f64581a.getClass();
            em0.a.C1371a.b(jA, "WRITE_EXERCISE");
            return arrayList3;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static ArrayList g(pb2.g.c cVar) {
            Integer numValueOf;
            Integer numValueOf2;
            String string;
            Object next;
            Object next2;
            p.b bVar;
            p.e eVar;
            p.b bVar2;
            p.e eVar2;
            ArrayList arrayList = new ArrayList();
            em0.a.f64581a.getClass();
            long jA = em0.a.C1371a.a("WRITE_FLOORS_CLIMBED");
            List<pb2.g.b> list = cVar.f137141a;
            if (list != null) {
                for (pb2.g.b bVar3 : list) {
                    f.f36059a.getClass();
                    pb2.g.e eVar3 = bVar3 != null ? bVar3.f137138c : null;
                    if (eVar3 != null) {
                        p pVar = eVar3.f137148d;
                        p.c cVar2 = pVar != null ? pVar.f151749a : null;
                        List<String> list2 = (cVar2 == null || (bVar2 = cVar2.f151754b) == null || (eVar2 = bVar2.f151752a) == null) ? null : eVar2.f151759b;
                        List<List<Object>> list3 = (cVar2 == null || (bVar = cVar2.f151754b) == null || (eVar = bVar.f151752a) == null) ? null : eVar.f151758a;
                        k0 k0Var = k0.f134949a;
                        k0Var.getClass();
                        LinkedHashMap linkedHashMap = new LinkedHashMap(k0Var);
                        if (list2 != null) {
                            Iterator it = h0.j1(list2).iterator();
                            do {
                                o0 o0Var = (o0) it;
                                if (!o0Var.f134956a.hasNext()) {
                                    next2 = null;
                                    break;
                                }
                                next2 = o0Var.next();
                            } while (!d53.u.q((String) ((m0) next2).f134952b, "ascended", false));
                            m0 m0Var = (m0) next2;
                            numValueOf = Integer.valueOf(m0Var != null ? m0Var.f134951a : -1);
                        } else {
                            numValueOf = null;
                        }
                        if (list2 != null) {
                            Iterator it3 = h0.j1(list2).iterator();
                            do {
                                o0 o0Var2 = (o0) it3;
                                if (!o0Var2.f134956a.hasNext()) {
                                    next = null;
                                    break;
                                }
                                next = o0Var2.next();
                            } while (!d53.u.q((String) ((m0) next).f134952b, "timestampGmt", false));
                            m0 m0Var2 = (m0) next;
                            numValueOf2 = Integer.valueOf(m0Var2 != null ? m0Var2.f134951a : -1);
                        } else {
                            numValueOf2 = null;
                        }
                        if (list2 != null && list3 != null && numValueOf2 != null && numValueOf != null) {
                            int iIntValue = numValueOf.intValue();
                            int iIntValue2 = numValueOf2.intValue();
                            ArrayList arrayListZ = h0.Z(list3);
                            ArrayList<List> arrayList2 = new ArrayList();
                            for (Object obj : arrayListZ) {
                                if (((List) obj).size() == list2.size()) {
                                    arrayList2.add(obj);
                                }
                            }
                            for (List list4 : arrayList2) {
                                Object objE0 = h0.e0(iIntValue2, list4);
                                if (objE0 != null) {
                                    String string2 = objE0.toString();
                                    Object objE1 = h0.e0(iIntValue, list4);
                                    linkedHashMap.put(string2, (objE1 == null || (string = objE1.toString()) == null) ? null : Double.valueOf(Double.parseDouble(string)));
                                }
                            }
                        }
                        for (Map.Entry entry : linkedHashMap.entrySet()) {
                            DateTime dateTimeN = j0.N((String) entry.getKey(), true);
                            Double d14 = (Double) entry.getValue();
                            if (dateTimeN != null && d14 != null) {
                                double dDoubleValue = d14.doubleValue();
                                long millis = dateTimeN.getMillis();
                                long millis2 = dateTimeN.getMillis() - ((long) 900000);
                                if (millis2 <= DateTime.now().getMillis() && millis > jA) {
                                    Instant instantOfEpochMilli = Instant.ofEpochMilli(millis2);
                                    Instant instantOfEpochMilli2 = Instant.ofEpochMilli(millis);
                                    ZoneOffset zoneOffsetL = f3.l(instantOfEpochMilli);
                                    ZoneOffset zoneOffsetL2 = f3.l(instantOfEpochMilli2);
                                    if (dDoubleValue > 0.0d) {
                                        try {
                                            instantOfEpochMilli.getClass();
                                            instantOfEpochMilli2.getClass();
                                            z8.c.a aVar = z8.c.f202966h;
                                            z8.b bVar4 = new z8.b(1, null, null, 6, null);
                                            String strValueOf = String.valueOf(millis2);
                                            aVar.getClass();
                                            try {
                                                arrayList.add(new w(instantOfEpochMilli, zoneOffsetL, instantOfEpochMilli2, zoneOffsetL2, dDoubleValue, z8.c.a.a(bVar4, strValueOf)));
                                                jA = millis;
                                            } catch (IllegalArgumentException e4) {
                                                e = e4;
                                                jA = millis;
                                                b bVar5 = b.f36013a;
                                                b.a aVar2 = b.a.FLOORS_CLIMBED;
                                                bVar5.getClass();
                                                b.a(aVar2);
                                                a aVar3 = f.f36059a;
                                                i2.a aVar4 = i2.f36769a;
                                                a2 a2Var = a2.GENERAL;
                                                aVar4.getClass();
                                                i2.a.g(a2Var, "GHCModelConverter", e);
                                            }
                                        } catch (IllegalArgumentException e14) {
                                            e = e14;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            em0.a.f64581a.getClass();
            em0.a.C1371a.b(jA, "WRITE_FLOORS_CLIMBED");
            return arrayList;
        }

        /* JADX WARN: Code duplicated, block: B:116:0x0204  */
        /* JADX WARN: Code duplicated, block: B:63:0x011d  */
        /* JADX WARN: Code duplicated, block: B:82:0x0151  */
        /* JADX WARN: Multi-variable type inference failed */
        public static ArrayList h(pb2.g.c cVar, boolean z14) {
            Iterator it;
            long j8;
            String str;
            pb2.g.e eVar;
            ArrayList arrayList;
            rb2.l.b bVar;
            rb2.l.b bVar2;
            pb2.g.e eVar2;
            String str2;
            String str3;
            Integer num;
            Integer num2;
            List<rb2.a.C2855a> list;
            String str4;
            List<Double> list2;
            Double d14;
            List<Double> list3;
            List<rb2.a.e> list4;
            Object next;
            rb2.a.e eVar3;
            List<rb2.a.e> list5;
            Object next2;
            rb2.a.e eVar4;
            LocalDateTime localDateTime;
            DateTime dateTime;
            ArrayList arrayList2 = new ArrayList();
            em0.a.f64581a.getClass();
            long jA = em0.a.C1371a.a("WRITE_HEART_RATE");
            pb2.g.c cVar2 = cVar;
            List<pb2.g.b> list6 = cVar2.f137141a;
            if (list6 != null) {
                Iterator it3 = list6.iterator();
                while (it3.hasNext()) {
                    pb2.g.b bVar3 = (pb2.g.b) it3.next();
                    f.f36059a.getClass();
                    pb2.g.e eVar5 = bVar3 != null ? bVar3.f137138c : null;
                    if (eVar5 != null) {
                        ArrayList arrayList3 = new ArrayList();
                        ArrayList<rb2.a.c> arrayListO = o(cVar2);
                        String str5 = "GHCModelConverter";
                        if (arrayListO != null) {
                            for (rb2.a.c cVar3 : arrayListO) {
                                Long lValueOf = (cVar3 == null || (localDateTime = cVar3.f151682z) == null || (dateTime = localDateTime.toDateTime(DateTimeZone.UTC)) == null) ? null : Long.valueOf(dateTime.getMillis());
                                DateTime dateTime2 = eVar5.f137146b;
                                if (lValueOf == null || dateTime2 == null) {
                                    eVar2 = eVar5;
                                    str2 = str5;
                                } else {
                                    eVar2 = eVar5;
                                    String str6 = str5;
                                    if (j0.E(lValueOf.longValue(), dateTime2.getMillis())) {
                                        Double d15 = cVar3.f151663g;
                                        rb2.a.b bVar4 = cVar3.f151657a;
                                        Long lValueOf2 = d15 != null ? Long.valueOf((long) (d15.doubleValue() * ((double) 1000))) : null;
                                        if (lValueOf2 != null && lValueOf2.longValue() == 0) {
                                            a aVar = f.f36059a;
                                            i2.a aVar2 = i2.f36769a;
                                            a2 a2Var = a2.GENERAL;
                                            aVar2.getClass();
                                            str3 = str6;
                                            i2.a.b(a2Var, str3, "HeartRate: duration cannot be zero");
                                        } else {
                                            str3 = str6;
                                            if ((lValueOf2 != null ? Long.valueOf(lValueOf.longValue() + lValueOf2.longValue()) : null) == null) {
                                                a aVar3 = f.f36059a;
                                                i2.a aVar4 = i2.f36769a;
                                                a2 a2Var2 = a2.GENERAL;
                                                aVar4.getClass();
                                                i2.a.b(a2Var2, str3, "HeartRate: endTime cannot be null");
                                            } else {
                                                if (bVar4 == null || (list5 = bVar4.f151655e) == null) {
                                                    num = null;
                                                } else {
                                                    Iterator<T> it4 = list5.iterator();
                                                    do {
                                                        if (!it4.hasNext()) {
                                                            next2 = null;
                                                            break;
                                                        }
                                                        next2 = it4.next();
                                                        eVar4 = (rb2.a.e) next2;
                                                    } while (!s.g(eVar4 != null ? eVar4.f151685a : null, em0.a.C1371a.EnumC1372a.DIRECT_HEART_RATE.f64588a));
                                                    rb2.a.e eVar6 = (rb2.a.e) next2;
                                                    if (eVar6 != null) {
                                                        num = eVar6.f151686b;
                                                    } else {
                                                        num = null;
                                                    }
                                                }
                                                if (bVar4 == null || (list4 = bVar4.f151655e) == null) {
                                                    num2 = null;
                                                } else {
                                                    Iterator<T> it5 = list4.iterator();
                                                    do {
                                                        if (!it5.hasNext()) {
                                                            next = null;
                                                            break;
                                                        }
                                                        next = it5.next();
                                                        eVar3 = (rb2.a.e) next;
                                                    } while (!s.g(eVar3 != null ? eVar3.f151685a : null, em0.a.C1371a.EnumC1372a.SUM_DURATION.f64588a));
                                                    rb2.a.e eVar7 = (rb2.a.e) next;
                                                    if (eVar7 != null) {
                                                        num2 = eVar7.f151686b;
                                                    } else {
                                                        num2 = null;
                                                    }
                                                }
                                                ArrayList arrayList4 = new ArrayList();
                                                if (num == null || num2 == null) {
                                                    str2 = str3;
                                                    it3 = it3;
                                                } else {
                                                    int iIntValue = num2.intValue();
                                                    int iIntValue2 = num.intValue();
                                                    if (bVar4 == null || (list = bVar4.f151651a) == null) {
                                                        str2 = str3;
                                                        it3 = it3;
                                                    } else {
                                                        for (rb2.a.C2855a c2855a : list) {
                                                            Double d16 = (c2855a == null || (list3 = c2855a.f151650a) == null) ? null : list3.get(iIntValue2);
                                                            Double dValueOf = (c2855a == null || (list2 = c2855a.f151650a) == null || (d14 = list2.get(iIntValue)) == null) ? null : Double.valueOf(d14.doubleValue() * ((double) 1000));
                                                            if (d16 == null || dValueOf == null) {
                                                                str4 = str3;
                                                            } else {
                                                                long jLongValue = lValueOf.longValue();
                                                                String str7 = str3;
                                                                double dDoubleValue = dValueOf.doubleValue();
                                                                double dDoubleValue2 = d16.doubleValue();
                                                                try {
                                                                    Instant instantOfEpochMilli = Instant.ofEpochMilli(jLongValue + ((long) dDoubleValue));
                                                                    instantOfEpochMilli.getClass();
                                                                    arrayList4.add(new x.b(instantOfEpochMilli, (long) dDoubleValue2));
                                                                    str4 = str7;
                                                                } catch (IllegalArgumentException e4) {
                                                                    b bVar5 = b.f36013a;
                                                                    b.a aVar5 = b.a.HEART_RATE_SAMPLES;
                                                                    bVar5.getClass();
                                                                    b.a(aVar5);
                                                                    a aVar6 = f.f36059a;
                                                                    i2.a aVar7 = i2.f36769a;
                                                                    a2 a2Var3 = a2.GENERAL;
                                                                    aVar7.getClass();
                                                                    str4 = str7;
                                                                    i2.a.g(a2Var3, str4, e4);
                                                                    Unit unit = Unit.INSTANCE;
                                                                }
                                                            }
                                                            str3 = str4;
                                                            it3 = it3;
                                                            iIntValue = iIntValue;
                                                        }
                                                        str2 = str3;
                                                        it3 = it3;
                                                        Unit unit2 = Unit.INSTANCE;
                                                    }
                                                }
                                                if (arrayList4.isEmpty()) {
                                                    a aVar8 = f.f36059a;
                                                    i2.a aVar9 = i2.f36769a;
                                                    a2 a2Var4 = a2.GENERAL;
                                                    aVar9.getClass();
                                                    i2.a.b(a2Var4, str2, "HeartRate: heartRateSamples count cannot be zero");
                                                } else {
                                                    List listN0 = h0.N0(arrayList4, new d());
                                                    arrayList3.add(new o13.p(Long.valueOf(((x.b) h0.b0(listN0)).f195049a.toEpochMilli()), Long.valueOf(((x.b) h0.m0(listN0)).f195049a.toEpochMilli())));
                                                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                                                    for (Object obj : arrayList4) {
                                                        Instant instantTruncatedTo = ((x.b) obj).f195049a.truncatedTo(ChronoUnit.MINUTES);
                                                        Object arrayList5 = linkedHashMap.get(instantTruncatedTo);
                                                        if (arrayList5 == null) {
                                                            arrayList5 = new ArrayList();
                                                            linkedHashMap.put(instantTruncatedTo, arrayList5);
                                                        }
                                                        ((List) arrayList5).add(obj);
                                                    }
                                                    Iterator it6 = linkedHashMap.values().iterator();
                                                    while (it6.hasNext()) {
                                                        List listN1 = h0.N0((List) it6.next(), new e());
                                                        try {
                                                            Instant instantOfEpochMilli2 = Instant.ofEpochMilli(((x.b) h0.b0(listN1)).f195049a.toEpochMilli());
                                                            Instant instantOfEpochMilli3 = Instant.ofEpochMilli(((x.b) h0.m0(listN1)).f195049a.toEpochMilli() + ((long) 999));
                                                            ZoneOffset offset = ZoneId.systemDefault().getRules().getOffset(instantOfEpochMilli2);
                                                            ZoneOffset offset2 = ZoneId.systemDefault().getRules().getOffset(instantOfEpochMilli3);
                                                            Long l14 = cVar3.f151658b;
                                                            long epochMilli = instantOfEpochMilli2.toEpochMilli();
                                                            StringBuilder sb3 = new StringBuilder();
                                                            sb3.append(l14);
                                                            sb3.append(epochMilli);
                                                            String string = sb3.toString();
                                                            f.f36059a.getClass();
                                                            z8.c cVarI = i(string, cVar3);
                                                            instantOfEpochMilli3.getClass();
                                                            arrayList2.add(new x(instantOfEpochMilli2, offset, instantOfEpochMilli3, offset2, listN1, cVarI));
                                                        } catch (IllegalArgumentException e14) {
                                                            b bVar6 = b.f36013a;
                                                            b.a aVar10 = b.a.ACTIVE_HEART_RATE;
                                                            bVar6.getClass();
                                                            b.a(aVar10);
                                                            a aVar11 = f.f36059a;
                                                            i2.a aVar12 = i2.f36769a;
                                                            a2 a2Var5 = a2.GENERAL;
                                                            aVar12.getClass();
                                                            i2.a.g(a2Var5, str2, e14);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        str2 = str3;
                                        it3 = it3;
                                    } else {
                                        str2 = str6;
                                    }
                                    str5 = str2;
                                    eVar5 = eVar2;
                                    it3 = it3;
                                    jA = jA;
                                }
                                a aVar13 = f.f36059a;
                                i2.a aVar14 = i2.f36769a;
                                a2 a2Var6 = a2.GENERAL;
                                aVar14.getClass();
                                i2.a.b(a2Var6, str2, "HeartRate: invalid time, activityStartTime=" + lValueOf + ", metricsDate=" + dateTime2);
                                str5 = str2;
                                eVar5 = eVar2;
                                it3 = it3;
                                jA = jA;
                            }
                            j8 = jA;
                            it = it3;
                            str = str5;
                            Unit unit3 = Unit.INSTANCE;
                            eVar = eVar5;
                        } else {
                            j8 = jA;
                            it = it3;
                            str = "GHCModelConverter";
                            eVar = eVar5;
                        }
                        rb2.l lVar = eVar.f137149e;
                        rb2.l.a aVar15 = lVar != null ? lVar.f151738a : null;
                        a aVar16 = f.f36059a;
                        List<String> list7 = (aVar15 == null || (bVar2 = aVar15.f151740b) == null) ? null : bVar2.f151741a;
                        List<List<Object>> list8 = (aVar15 == null || (bVar = aVar15.f151740b) == null) ? null : bVar.f151742b;
                        aVar16.getClass();
                        long epochMilli2 = j8;
                        for (Map.Entry entry : e(list7, list8).entrySet()) {
                            DateTime dateTimeN = j0.N((String) entry.getKey(), true);
                            Double d17 = (Double) entry.getValue();
                            if (dateTimeN == null || d17 == null) {
                                arrayList = arrayList3;
                            } else {
                                double dDoubleValue3 = d17.doubleValue();
                                Iterator it7 = arrayList3.iterator();
                                while (true) {
                                    if (it7.hasNext()) {
                                        o13.p pVar = (o13.p) it7.next();
                                        long jLongValue2 = ((Number) pVar.f128594a).longValue();
                                        arrayList = arrayList3;
                                        long jLongValue3 = ((Number) pVar.f128595b).longValue();
                                        long millis = dateTimeN.getMillis();
                                        if ((jLongValue2 > millis || millis > jLongValue3) && (z14 || dateTimeN.getMillis() > epochMilli2)) {
                                            arrayList3 = arrayList;
                                        } else {
                                            a aVar17 = f.f36059a;
                                            StringBuilder sbK = e0.k(jLongValue2, "HeartRate: ending write, activeStartTime=", ", activeEndTime=");
                                            sbK.append(jLongValue3);
                                            sbK.append(", safeTime.millis=");
                                            sbK.append(dateTimeN);
                                            j20.x.j(epochMilli2, ".millis, latestTimestamp=", ", bypassTimer=", sbK);
                                            sbK.append(z14);
                                            String string2 = sbK.toString();
                                            i2.a aVar18 = i2.f36769a;
                                            a2 a2Var7 = a2.GENERAL;
                                            aVar18.getClass();
                                            i2.a.b(a2Var7, str, string2);
                                        }
                                    } else {
                                        arrayList = arrayList3;
                                        try {
                                            ArrayList arrayList6 = new ArrayList();
                                            Instant instantOfEpochMilli4 = Instant.ofEpochMilli(dateTimeN.getMillis());
                                            instantOfEpochMilli4.getClass();
                                            arrayList6.add(new x.b(instantOfEpochMilli4, (long) dDoubleValue3));
                                            if (arrayList6.isEmpty()) {
                                                a aVar19 = f.f36059a;
                                                i2.a aVar20 = i2.f36769a;
                                                a2 a2Var8 = a2.GENERAL;
                                                aVar20.getClass();
                                                i2.a.b(a2Var8, str, "HeartRate: passive sample is empty. This should never call, but keeping this here for safety.");
                                            } else {
                                                Instant instantOfEpochMilli5 = Instant.ofEpochMilli(((x.b) h0.b0(arrayList6)).f195049a.toEpochMilli());
                                                try {
                                                    Instant instantOfEpochMilli6 = Instant.ofEpochMilli(((x.b) h0.m0(arrayList6)).f195049a.toEpochMilli() + ((long) 999));
                                                    ZoneOffset offset3 = ZoneId.systemDefault().getRules().getOffset(instantOfEpochMilli5);
                                                    ZoneOffset offset4 = ZoneId.systemDefault().getRules().getOffset(instantOfEpochMilli6);
                                                    instantOfEpochMilli5.getClass();
                                                    instantOfEpochMilli6.getClass();
                                                    z8.c.a aVar21 = z8.c.f202966h;
                                                    z8.b bVar7 = new z8.b(1, null, null, 6, null);
                                                    String string3 = instantOfEpochMilli5.toString();
                                                    string3.getClass();
                                                    aVar21.getClass();
                                                    x xVar = new x(instantOfEpochMilli5, offset3, instantOfEpochMilli6, offset4, arrayList6, z8.c.a.a(bVar7, string3));
                                                    epochMilli2 = instantOfEpochMilli5.toEpochMilli();
                                                    arrayList2.add(xVar);
                                                } catch (IllegalArgumentException e15) {
                                                    e = e15;
                                                    b bVar8 = b.f36013a;
                                                    b.a aVar22 = b.a.PASSIVE_HEART_RATE;
                                                    bVar8.getClass();
                                                    b.a(aVar22);
                                                    a aVar23 = f.f36059a;
                                                    i2.a aVar24 = i2.f36769a;
                                                    a2 a2Var9 = a2.GENERAL;
                                                    aVar24.getClass();
                                                    i2.a.g(a2Var9, str, e);
                                                    Unit unit4 = Unit.INSTANCE;
                                                }
                                            }
                                        } catch (IllegalArgumentException e16) {
                                            e = e16;
                                        }
                                        arrayList3 = arrayList;
                                    }
                                }
                            }
                            arrayList3 = arrayList;
                        }
                        Unit unit5 = Unit.INSTANCE;
                        jA = epochMilli2;
                    } else {
                        it = it3;
                    }
                    cVar2 = cVar;
                    it3 = it;
                }
                Unit unit6 = Unit.INSTANCE;
            }
            em0.a.f64581a.getClass();
            em0.a.C1371a.b(jA, "WRITE_HEART_RATE");
            return arrayList2;
        }

        /* JADX WARN: Code duplicated, block: B:54:0x00ce  */
        public static z8.c i(String str, rb2.a.c cVar) {
            Long l14;
            u0 u0Var;
            u0 u0Var2;
            int i14 = 0;
            if (cVar != null ? s.g(cVar.f151666j, Boolean.TRUE) : false) {
                z8.c.a aVar = z8.c.f202966h;
                z8.b bVar = new z8.b(2, null, null, 6, null);
                aVar.getClass();
                str.getClass();
                return new z8.c(3, null, null, null, str, 1L, bVar, 14, null);
            }
            if (cVar != null && (l14 = cVar.f151661e) != null) {
                long jLongValue = l14.longValue();
                em0.a.f64581a.getClass();
                rd2.f.a().f152045a.getClass();
                sd2.f fVarI = rd2.j.i(jLongValue, null);
                String productNumber = fVarI != null ? fVarI.getProductNumber() : null;
                yl2.b bVar2 = (yl2.b) yl2.b.B6.get(productNumber);
                if (productNumber != null && bVar2 != null) {
                    if (bVar2 != yl2.b.f197749n6) {
                        if (!u0.q(productNumber)) {
                            if (!u0.s(productNumber)) {
                                if (!u0.r(productNumber)) {
                                    if (!u0.t(productNumber)) {
                                        if (!u0.v(productNumber)) {
                                            if (!TextUtils.isEmpty(productNumber) && (u0Var2 = (u0) u0.f203782n6.get(productNumber)) != null) {
                                                switch (em0.a.C1371a.e.f64615d[u0Var2.ordinal()]) {
                                                    case 1:
                                                    case 2:
                                                    case 3:
                                                    case 4:
                                                    case 5:
                                                    case 6:
                                                    case 7:
                                                    case 8:
                                                    case 9:
                                                    case 10:
                                                    case 11:
                                                    case 12:
                                                    case 13:
                                                    case 14:
                                                    case 15:
                                                    case 16:
                                                        i14 = 14;
                                                        break;
                                                }
                                            }
                                            if (!TextUtils.isEmpty(productNumber) && (u0Var = (u0) u0.f203782n6.get(productNumber)) != null) {
                                                int iOrdinal = u0Var.ordinal();
                                                if (iOrdinal != 266 && iOrdinal != 284 && iOrdinal != 285) {
                                                    switch (iOrdinal) {
                                                        case 260:
                                                        case 261:
                                                        case 262:
                                                            break;
                                                        default:
                                                            i14 = 1;
                                                            break;
                                                    }
                                                }
                                            } else {
                                                i14 = 1;
                                            }
                                        } else {
                                            i14 = 14;
                                        }
                                    } else {
                                        i14 = 15;
                                    }
                                } else {
                                    i14 = 3;
                                }
                            } else {
                                i14 = 1;
                            }
                        } else {
                            i14 = 7;
                        }
                    } else {
                        i14 = 6;
                    }
                }
            }
            z8.c.a aVar2 = z8.c.f202966h;
            z8.b bVar3 = new z8.b(i14, null, null, 6, null);
            aVar2.getClass();
            str.getClass();
            return new z8.c(1, null, null, null, str, 1L, bVar3, 14, null);
        }

        public static ArrayList j(pb2.g.c cVar) {
            rb2.w wVar;
            rb2.w.b bVar;
            rb2.w.a aVar;
            ArrayList arrayList = new ArrayList();
            em0.a.f64581a.getClass();
            long jA = em0.a.C1371a.a("WRITE_RESTING_HEART_RATE");
            List<pb2.g.b> list = cVar.f137141a;
            if (list != null) {
                for (pb2.g.b bVar2 : list) {
                    f.f36059a.getClass();
                    pb2.g.e eVar = bVar2 != null ? bVar2.f137138c : null;
                    if (eVar != null) {
                        rb2.l lVar = eVar.f137149e;
                        rb2.l.a aVar2 = lVar != null ? lVar.f151738a : null;
                        Long l14 = (bVar2 == null || (wVar = bVar2.f137140e) == null || (bVar = wVar.f151772a) == null || (aVar = bVar.f151787a) == null) ? null : aVar.f151782j;
                        Integer num = aVar2 != null ? aVar2.f151739a : null;
                        if (l14 != null && num != null) {
                            int iIntValue = num.intValue();
                            long jLongValue = l14.longValue();
                            if (jLongValue > jA) {
                                Instant instantOfEpochMilli = Instant.ofEpochMilli(jLongValue);
                                ZoneOffset zoneOffsetL = f3.l(instantOfEpochMilli);
                                if (iIntValue > 0) {
                                    try {
                                        instantOfEpochMilli.getClass();
                                        long j8 = iIntValue;
                                        z8.c.a aVar3 = z8.c.f202966h;
                                        z8.b bVar3 = new z8.b(1, null, null, 6, null);
                                        String strValueOf = String.valueOf(jLongValue);
                                        aVar3.getClass();
                                        try {
                                            arrayList.add(new s0(instantOfEpochMilli, zoneOffsetL, j8, z8.c.a.a(bVar3, strValueOf)));
                                            jA = jLongValue;
                                        } catch (IllegalArgumentException e4) {
                                            e = e4;
                                            jA = jLongValue;
                                            b bVar4 = b.f36013a;
                                            b.a aVar4 = b.a.RESTING_HEART_RATE;
                                            bVar4.getClass();
                                            b.a(aVar4);
                                            a aVar5 = f.f36059a;
                                            i2.a aVar6 = i2.f36769a;
                                            a2 a2Var = a2.GENERAL;
                                            aVar6.getClass();
                                            i2.a.g(a2Var, "GHCModelConverter", e);
                                        }
                                    } catch (IllegalArgumentException e14) {
                                        e = e14;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            em0.a.f64581a.getClass();
            em0.a.C1371a.b(jA, "WRITE_RESTING_HEART_RATE");
            return arrayList;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code duplicated, block: B:115:0x01d3 A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:127:0x0211  */
        /* JADX WARN: Code duplicated, block: B:143:0x02a4  */
        /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r14v15 java.lang.Object, still in use, count: 2, list:
              (r14v15 java.lang.Object) from 0x0092: PHI (r14 I:??) = (r14v1 java.lang.Object), (r14v15 java.lang.Object) binds: [B:48:0x0091, B:163:0x0092] A[DONT_GENERATE, DONT_INLINE]
              (r14v15 java.lang.Object) from 0x0086: CHECK_CAST (em0.a$a$c) (r14v15 java.lang.Object)
            	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
            	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
            	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
            	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
            	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
            	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
            	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
            	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
            	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
            */
        public static java.util.ArrayList k(pb2.g.c r42, boolean r43) {
            /*
                Method dump skipped, instruction units count: 714
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.garmin.android.apps.connectmobile.googlehealthconnect.f.a.k(pb2.g$c, boolean):java.util.ArrayList");
        }

        /* JADX WARN: Code duplicated, block: B:49:0x00ac  */
        /* JADX WARN: Code duplicated, block: B:69:0x00e1  */
        public static ArrayList l(pb2.g.c cVar, boolean z14) {
            long j8;
            Integer num;
            Integer num2;
            String str;
            rb2.a.b bVar;
            List<rb2.a.C2855a> list;
            long j14;
            int i14;
            List<Double> list2;
            Double d14;
            List<Double> list3;
            rb2.a.b bVar2;
            List<rb2.a.e> list4;
            Object next;
            rb2.a.e eVar;
            rb2.a.b bVar3;
            List<rb2.a.e> list5;
            Object next2;
            rb2.a.e eVar2;
            Double d15;
            LocalDateTime localDateTime;
            DateTime dateTime;
            ArrayList arrayList = new ArrayList();
            em0.a.f64581a.getClass();
            long jA = em0.a.C1371a.a("WRITE_SPEED");
            ArrayList<rb2.a.c> arrayListO = o(cVar);
            if (arrayListO != null) {
                for (rb2.a.c cVar2 : arrayListO) {
                    Long lValueOf = (cVar2 == null || (localDateTime = cVar2.f151682z) == null || (dateTime = localDateTime.toDateTime(DateTimeZone.UTC)) == null) ? null : Long.valueOf(dateTime.getMillis());
                    int i15 = 1000;
                    Long lValueOf2 = (cVar2 == null || (d15 = cVar2.f151663g) == null) ? null : Long.valueOf((long) (d15.doubleValue() * ((double) 1000)));
                    Long lValueOf3 = (lValueOf == null || lValueOf2 == null) ? null : Long.valueOf(lValueOf.longValue() + lValueOf2.longValue());
                    if (lValueOf3 == null || (!z14 && lValueOf3.longValue() <= jA)) {
                        j8 = jA;
                        jA = j8;
                    } else {
                        if (cVar2 == null || (bVar3 = cVar2.f151657a) == null || (list5 = bVar3.f151655e) == null) {
                            num = null;
                        } else {
                            Iterator<T> it = list5.iterator();
                            do {
                                if (!it.hasNext()) {
                                    next2 = null;
                                    break;
                                }
                                next2 = it.next();
                                eVar2 = (rb2.a.e) next2;
                            } while (!s.g(eVar2 != null ? eVar2.f151685a : null, em0.a.C1371a.EnumC1372a.DIRECT_SPEED.f64588a));
                            rb2.a.e eVar3 = (rb2.a.e) next2;
                            if (eVar3 != null) {
                                num = eVar3.f151686b;
                            } else {
                                num = null;
                            }
                        }
                        if (cVar2 == null || (bVar2 = cVar2.f151657a) == null || (list4 = bVar2.f151655e) == null) {
                            num2 = null;
                        } else {
                            Iterator<T> it3 = list4.iterator();
                            do {
                                if (!it3.hasNext()) {
                                    next = null;
                                    break;
                                }
                                next = it3.next();
                                eVar = (rb2.a.e) next;
                            } while (!s.g(eVar != null ? eVar.f151685a : null, em0.a.C1371a.EnumC1372a.SUM_DURATION.f64588a));
                            rb2.a.e eVar4 = (rb2.a.e) next;
                            if (eVar4 != null) {
                                num2 = eVar4.f151686b;
                            } else {
                                num2 = null;
                            }
                        }
                        ArrayList arrayList2 = new ArrayList();
                        if (num != null && num2 != null) {
                            int iIntValue = num2.intValue();
                            int iIntValue2 = num.intValue();
                            if (cVar2 != null && (bVar = cVar2.f151657a) != null && (list = bVar.f151651a) != null) {
                                for (rb2.a.C2855a c2855a : list) {
                                    Double d16 = (c2855a == null || (list3 = c2855a.f151650a) == null) ? null : list3.get(iIntValue2);
                                    Double dValueOf = (c2855a == null || (list2 = c2855a.f151650a) == null || (d14 = list2.get(iIntValue)) == null) ? null : Double.valueOf(d14.doubleValue() * ((double) i15));
                                    if (d16 == null || dValueOf == null || lValueOf == 0) {
                                        j14 = jA;
                                        i14 = iIntValue;
                                    } else {
                                        long jLongValue = lValueOf.longValue();
                                        i14 = iIntValue;
                                        double dDoubleValue = dValueOf.doubleValue();
                                        j14 = jA;
                                        double dDoubleValue2 = d16.doubleValue();
                                        long j15 = jLongValue + ((long) dDoubleValue);
                                        if (dDoubleValue2 > 0.0d) {
                                            try {
                                                Instant instantOfEpochMilli = Instant.ofEpochMilli(j15);
                                                instantOfEpochMilli.getClass();
                                                c9.k.f26017c.getClass();
                                                try {
                                                    arrayList2.add(new y8.x0.e(instantOfEpochMilli, new c9.k(dDoubleValue2, c9.k.b.f26021a, null)));
                                                } catch (IllegalArgumentException e4) {
                                                    e = e4;
                                                    b bVar4 = b.f36013a;
                                                    b.a aVar = b.a.SPEED_SAMPLE;
                                                    bVar4.getClass();
                                                    b.a(aVar);
                                                    a aVar2 = f.f36059a;
                                                    i2.a aVar3 = i2.f36769a;
                                                    a2 a2Var = a2.GENERAL;
                                                    aVar3.getClass();
                                                    i2.a.g(a2Var, "GHCModelConverter", e);
                                                }
                                            } catch (IllegalArgumentException e14) {
                                                e = e14;
                                            }
                                        }
                                        iIntValue = i14;
                                        lValueOf = lValueOf;
                                        jA = j14;
                                        i15 = 1000;
                                    }
                                    iIntValue = i14;
                                    lValueOf = lValueOf;
                                    jA = j14;
                                    i15 = 1000;
                                }
                            }
                        }
                        j8 = jA;
                        if (!arrayList2.isEmpty()) {
                            Instant instant = ((y8.x0.e) h0.b0(arrayList2)).f195058a;
                            Instant instant2 = ((y8.x0.e) h0.m0(arrayList2)).f195058a;
                            Long l14 = cVar2 != null ? cVar2.f151658b : null;
                            if (l14 != null) {
                                long jLongValue2 = l14.longValue();
                                ZoneOffset zoneOffsetL = f3.l(instant);
                                ZoneOffset zoneOffsetL2 = f3.l(instant2);
                                a aVar4 = f.f36059a;
                                String strValueOf = String.valueOf(jLongValue2);
                                aVar4.getClass();
                                z8.c cVarI = i(strValueOf, cVar2);
                                try {
                                    str = "GHCModelConverter";
                                    try {
                                        y8.x0 x0Var = new y8.x0(instant, zoneOffsetL, instant2, zoneOffsetL2, arrayList2, cVarI);
                                        long epochMilli = instant2.toEpochMilli();
                                        try {
                                            arrayList.add(x0Var);
                                            jA = epochMilli;
                                        } catch (IllegalArgumentException e15) {
                                            e = e15;
                                            j8 = epochMilli;
                                            b bVar5 = b.f36013a;
                                            b.a aVar5 = b.a.SPEED;
                                            bVar5.getClass();
                                            b.a(aVar5);
                                            a aVar6 = f.f36059a;
                                            i2.a aVar7 = i2.f36769a;
                                            a2 a2Var2 = a2.GENERAL;
                                            aVar7.getClass();
                                            i2.a.g(a2Var2, str, e);
                                            Unit unit = Unit.INSTANCE;
                                            jA = j8;
                                        }
                                    } catch (IllegalArgumentException e16) {
                                        e = e16;
                                    }
                                } catch (IllegalArgumentException e17) {
                                    e = e17;
                                    str = "GHCModelConverter";
                                }
                            }
                        }
                        jA = j8;
                    }
                }
            }
            em0.a.f64581a.getClass();
            em0.a.C1371a.b(jA, "WRITE_SPEED");
            return arrayList;
        }

        public static ArrayList m(pb2.g.c cVar) {
            p.d dVar;
            p.a aVar;
            p.d dVar2;
            p.a aVar2;
            ArrayList arrayList = new ArrayList();
            em0.a.f64581a.getClass();
            long jA = em0.a.C1371a.a("WRITE_STEPS");
            List<pb2.g.b> list = cVar.f137141a;
            if (list != null) {
                for (pb2.g.b bVar : list) {
                    f.f36059a.getClass();
                    List<List<Object>> list2 = null;
                    pb2.g.e eVar = bVar != null ? bVar.f137138c : null;
                    if (eVar != null) {
                        p pVar = eVar.f137148d;
                        p.c cVar2 = pVar != null ? pVar.f151749a : null;
                        List<String> list3 = (cVar2 == null || (dVar2 = cVar2.f151753a) == null || (aVar2 = dVar2.f151757c) == null) ? null : aVar2.f151750a;
                        if (cVar2 != null && (dVar = cVar2.f151753a) != null && (aVar = dVar.f151757c) != null) {
                            list2 = aVar.f151751b;
                        }
                        for (Map.Entry entry : e(list3, list2).entrySet()) {
                            DateTime dateTimeN = j0.N((String) entry.getKey(), true);
                            Double d14 = (Double) entry.getValue();
                            if (dateTimeN != null && d14 != null) {
                                double dDoubleValue = d14.doubleValue();
                                long millis = dateTimeN.getMillis();
                                long millis2 = dateTimeN.getMillis() - ((long) DateTimeConstants.MILLIS_PER_MINUTE);
                                if (millis > jA) {
                                    Instant instantOfEpochMilli = Instant.ofEpochMilli(millis2);
                                    Instant instantOfEpochMilli2 = Instant.ofEpochMilli(millis);
                                    ZoneOffset zoneOffsetL = f3.l(instantOfEpochMilli);
                                    ZoneOffset zoneOffsetL2 = f3.l(instantOfEpochMilli2);
                                    long j8 = (long) dDoubleValue;
                                    try {
                                        instantOfEpochMilli.getClass();
                                        instantOfEpochMilli2.getClass();
                                        z8.c.a aVar3 = z8.c.f202966h;
                                        z8.b bVar2 = new z8.b(1, null, null, 6, null);
                                        String strValueOf = String.valueOf(millis2);
                                        aVar3.getClass();
                                        try {
                                            arrayList.add(new z0(instantOfEpochMilli, zoneOffsetL, instantOfEpochMilli2, zoneOffsetL2, j8, z8.c.a.a(bVar2, strValueOf)));
                                            jA = millis;
                                        } catch (IllegalArgumentException e4) {
                                            e = e4;
                                            jA = millis;
                                            b bVar3 = b.f36013a;
                                            b.a aVar4 = b.a.STEPS;
                                            bVar3.getClass();
                                            b.a(aVar4);
                                            a aVar5 = f.f36059a;
                                            i2.a aVar6 = i2.f36769a;
                                            a2 a2Var = a2.GENERAL;
                                            aVar6.getClass();
                                            i2.a.g(a2Var, "GHCModelConverter", e);
                                        }
                                    } catch (IllegalArgumentException e14) {
                                        e = e14;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            em0.a.f64581a.getClass();
            em0.a.C1371a.b(jA, "WRITE_STEPS");
            return arrayList;
        }

        /* JADX WARN: Code duplicated, block: B:44:0x00a6  */
        /* JADX WARN: Code duplicated, block: B:45:0x00b4  */
        /* JADX WARN: Code duplicated, block: B:52:0x00c3  */
        /* JADX WARN: Code duplicated, block: B:53:0x00d1  */
        /* JADX WARN: Multi-variable type inference failed */
        public static ArrayList n(pb2.g.c cVar) {
            double d14;
            double d15;
            long j8;
            Long lValueOf;
            Double d16;
            Long lValueOf2;
            Long lValueOf3;
            LocalDateTime localDateTime;
            ArrayList arrayList = new ArrayList();
            List<pb2.g.b> list = cVar.f137141a;
            if (list != null) {
                for (pb2.g.b bVar : list) {
                    f.f36059a.getClass();
                    pb2.g.e eVar = bVar != null ? bVar.f137138c : null;
                    if (eVar != null) {
                        rb2.i iVar = eVar.f137150f;
                        rb2.i.a aVar = iVar != null ? iVar.f151731a : null;
                        DateTime dateTime = eVar.f137146b;
                        Integer num = aVar != null ? aVar.f151733b : null;
                        if (dateTime != null && num != null) {
                            int iIntValue = num.intValue();
                            ArrayList<o13.p> arrayList2 = new ArrayList();
                            long millis = dateTime.getMillis();
                            ArrayList<rb2.a.c> arrayListO = o(cVar);
                            if (arrayListO != null) {
                                d15 = 0.0d;
                                for (rb2.a.c cVar2 : arrayListO) {
                                    if (cVar2 == null || (localDateTime = cVar2.f151682z) == null) {
                                        j8 = 0;
                                    } else {
                                        j8 = 0;
                                        DateTime dateTime2 = localDateTime.toDateTime(DateTimeZone.UTC);
                                        lValueOf = dateTime2 != null ? Long.valueOf(dateTime2.getMillis()) : null;
                                        if (lValueOf != null && (j0.E(lValueOf.longValue(), dateTime.getMillis()) || lValueOf.longValue() > DateTime.now().getMillis())) {
                                            d16 = cVar2.f151663g;
                                            if (d16 != null) {
                                                lValueOf2 = Long.valueOf((long) (d16.doubleValue() * ((double) 1000)));
                                            } else {
                                                lValueOf2 = null;
                                            }
                                            if (lValueOf2 != null || lValueOf2.longValue() != j8) {
                                                if (lValueOf2 != null) {
                                                    lValueOf3 = Long.valueOf(lValueOf.longValue() + lValueOf2.longValue());
                                                } else {
                                                    lValueOf3 = null;
                                                }
                                                Double d17 = cVar2.f151673q;
                                                if (lValueOf3 == null && d17 != null) {
                                                    double dDoubleValue = d17.doubleValue();
                                                    long jLongValue = lValueOf3.longValue();
                                                    long jLongValue2 = lValueOf.longValue();
                                                    Instant instantOfEpochMilli = Instant.ofEpochMilli(jLongValue2);
                                                    Instant instantOfEpochMilli2 = Instant.ofEpochMilli(jLongValue);
                                                    ZoneOffset zoneOffsetL = f3.l(instantOfEpochMilli);
                                                    ZoneOffset zoneOffsetL2 = f3.l(instantOfEpochMilli2);
                                                    a aVar2 = f.f36059a;
                                                    String strValueOf = String.valueOf(cVar2.f151658b);
                                                    aVar2.getClass();
                                                    z8.c cVarI = i(strValueOf, cVar2);
                                                    try {
                                                        instantOfEpochMilli.getClass();
                                                        instantOfEpochMilli2.getClass();
                                                        c9.b.f25946c.getClass();
                                                        a1 a1Var = new a1(instantOfEpochMilli, zoneOffsetL, instantOfEpochMilli2, zoneOffsetL2, c9.b.a.a(dDoubleValue), cVarI);
                                                        d15 += dDoubleValue;
                                                        arrayList2.add(new o13.p(Long.valueOf(millis), Long.valueOf(jLongValue2)));
                                                        if (d15 > 0.0d) {
                                                            try {
                                                                arrayList.add(a1Var);
                                                            } catch (IllegalArgumentException e4) {
                                                                e = e4;
                                                                millis = jLongValue;
                                                                b bVar2 = b.f36013a;
                                                                b.a aVar3 = b.a.ACTIVE_TOTAL_CALORIES_BURNED;
                                                                bVar2.getClass();
                                                                b.a(aVar3);
                                                                a aVar4 = f.f36059a;
                                                                i2.a aVar5 = i2.f36769a;
                                                                a2 a2Var = a2.GENERAL;
                                                                aVar5.getClass();
                                                                i2.a.g(a2Var, "GHCModelConverter", e);
                                                            }
                                                        }
                                                        millis = jLongValue;
                                                    } catch (IllegalArgumentException e14) {
                                                        e = e14;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    if (lValueOf != null) {
                                        d16 = cVar2.f151663g;
                                        if (d16 != null) {
                                            lValueOf2 = Long.valueOf((long) (d16.doubleValue() * ((double) 1000)));
                                        } else {
                                            lValueOf2 = null;
                                        }
                                        if (lValueOf2 != null) {
                                        }
                                        if (lValueOf2 != null) {
                                            lValueOf3 = Long.valueOf(lValueOf.longValue() + lValueOf2.longValue());
                                        } else {
                                            lValueOf3 = null;
                                        }
                                        Double d18 = cVar2.f151673q;
                                        if (lValueOf3 == null) {
                                        }
                                    }
                                }
                                d14 = 0.0d;
                            } else {
                                d14 = 0.0d;
                                d15 = 0.0d;
                            }
                            arrayList2.add(new o13.p(Long.valueOf(millis), Long.valueOf(dateTime.plusDays(1).minusSeconds(1).getMillis())));
                            long jLongValue3 = 0;
                            for (o13.p pVar : arrayList2) {
                                jLongValue3 += ((Number) pVar.f128595b).longValue() - ((Number) pVar.f128594a).longValue();
                            }
                            for (o13.p pVar2 : arrayList2) {
                                try {
                                    double dLongValue = ((((Number) pVar2.f128595b).longValue() - ((Number) pVar2.f128594a).longValue()) / jLongValue3) * (((double) iIntValue) - d15);
                                    long jLongValue4 = ((Number) pVar2.f128594a).longValue();
                                    long jLongValue5 = ((Number) pVar2.f128595b).longValue();
                                    Instant instantOfEpochMilli3 = Instant.ofEpochMilli(jLongValue4);
                                    Instant instantOfEpochMilli4 = Instant.ofEpochMilli(jLongValue5);
                                    ZoneOffset offset = ZoneId.systemDefault().getRules().getOffset(instantOfEpochMilli3);
                                    ZoneOffset offset2 = ZoneId.systemDefault().getRules().getOffset(instantOfEpochMilli4);
                                    if (dLongValue > d14) {
                                        instantOfEpochMilli3.getClass();
                                        instantOfEpochMilli4.getClass();
                                        c9.b.f25946c.getClass();
                                        c9.b bVarA = c9.b.a.a(dLongValue);
                                        z8.c.a aVar6 = z8.c.f202966h;
                                        z8.b bVar3 = new z8.b(1, null, null, 6, null);
                                        String strValueOf2 = String.valueOf(jLongValue4);
                                        aVar6.getClass();
                                        arrayList.add(new a1(instantOfEpochMilli3, offset, instantOfEpochMilli4, offset2, bVarA, z8.c.a.a(bVar3, strValueOf2)));
                                    }
                                } catch (IllegalArgumentException e15) {
                                    b bVar4 = b.f36013a;
                                    b.a aVar7 = b.a.PASSIVE_TOTAL_CALORIES_BURNED;
                                    bVar4.getClass();
                                    b.a(aVar7);
                                    a aVar8 = f.f36059a;
                                    i2.a aVar9 = i2.f36769a;
                                    a2 a2Var2 = a2.GENERAL;
                                    aVar9.getClass();
                                    i2.a.g(a2Var2, "GHCModelConverter", e15);
                                }
                            }
                        }
                    }
                }
            }
            return arrayList;
        }

        public static ArrayList o(pb2.g.c cVar) {
            rb2.a aVar;
            List<rb2.a.c> list;
            pb2.g.d dVar = cVar.f137142b;
            if (dVar == null || (aVar = dVar.f137144b) == null || (list = aVar.f151649a) == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                rb2.a.c cVar2 = (rb2.a.c) obj;
                if (!s.g(cVar2 != null ? cVar2.f151667k : null, "GARMIN")) {
                    if (s.g(cVar2 != null ? cVar2.f151667k : null, "TACX")) {
                    }
                }
                arrayList.add(obj);
            }
            return arrayList;
        }

        public static ArrayList p(pb2.g.c cVar) {
            List<b0.a> list;
            int i14;
            b0 b0Var;
            ArrayList arrayList = new ArrayList();
            em0.a.f64581a.getClass();
            long jA = em0.a.C1371a.a("WRITE_WEIGHT");
            List<pb2.g.b> list2 = cVar.f137141a;
            if (list2 != null) {
                for (pb2.g.b bVar : list2) {
                    f.f36059a.getClass();
                    b0.c cVar2 = (bVar == null || (b0Var = bVar.f137139d) == null) ? null : b0Var.f151695a;
                    if (cVar2 != null && (list = cVar2.f151709b) != null) {
                        for (b0.a aVar : list) {
                            Long l14 = aVar != null ? aVar.f151705j : null;
                            Double d14 = aVar != null ? aVar.f151696a : null;
                            String str = aVar != null ? aVar.f151702g : null;
                            if (l14 != null && d14 != null && str != null) {
                                double dDoubleValue = d14.doubleValue();
                                long jLongValue = l14.longValue();
                                if (jLongValue > jA) {
                                    Instant instantOfEpochMilli = Instant.ofEpochMilli(jLongValue);
                                    ZoneOffset zoneOffsetL = f3.l(instantOfEpochMilli);
                                    if (dDoubleValue > 0.0d) {
                                        try {
                                            instantOfEpochMilli.getClass();
                                            c9.d.f25972c.getClass();
                                            c9.d dVarA = c9.d.a.a(dDoubleValue);
                                            z8.c.a aVar2 = z8.c.f202966h;
                                            em0.a.f64581a.getClass();
                                            switch (em0.a.C1371a.e.f64612a[em0.a.C1371a.b.valueOf(str).ordinal()]) {
                                                case 1:
                                                case 2:
                                                case 3:
                                                case 4:
                                                case 5:
                                                    i14 = 2;
                                                    break;
                                                case 6:
                                                    i14 = 1;
                                                    break;
                                                case 7:
                                                    i14 = 3;
                                                    break;
                                                default:
                                                    i14 = 0;
                                                    break;
                                            }
                                            z8.b bVar2 = new z8.b(i14, null, null, 6, null);
                                            String strValueOf = String.valueOf(jLongValue);
                                            aVar2.getClass();
                                            try {
                                                arrayList.add(new d1(instantOfEpochMilli, zoneOffsetL, dVarA, z8.c.a.a(bVar2, strValueOf)));
                                                jA = jLongValue;
                                            } catch (IllegalArgumentException e4) {
                                                e = e4;
                                                jA = jLongValue;
                                                b bVar3 = b.f36013a;
                                                b.a aVar3 = b.a.WEIGHT;
                                                bVar3.getClass();
                                                b.a(aVar3);
                                                a aVar4 = f.f36059a;
                                                i2.a aVar5 = i2.f36769a;
                                                a2 a2Var = a2.GENERAL;
                                                aVar5.getClass();
                                                i2.a.g(a2Var, "GHCModelConverter", e);
                                            }
                                        } catch (IllegalArgumentException e14) {
                                            e = e14;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            em0.a.f64581a.getClass();
            em0.a.C1371a.b(jA, "WRITE_WEIGHT");
            return arrayList;
        }

        private a() {
        }
    }
}
