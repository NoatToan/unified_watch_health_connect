package gx;

import ae0.g;
import ae0.h;
import android.text.format.DateUtils;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import g22.k;
import hd1.m;
import hs1.o;
import j23.l;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import o13.p;
import o13.r;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.ReadablePartial;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.h0;
import p13.u;
import p13.u0;
import r53.i;
import r53.j;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d implements i<b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f80027a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f80028b;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a<T> implements j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j f80029a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ c f80030b;

        /* JADX INFO: renamed from: gx.d$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        @v13.e(c = "com.garmin.android.apps.connectmobile.bodybattery.domain.dashboard.GetBodyBatteryDataUseCase$invoke$$inlined$map$1$2", f = "GetBodyBatteryDataUseCase.kt", l = {50}, m = "emit", v = 2)
        public static final class C1602a extends v13.c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f80031a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f80032b;

            public C1602a(t13.d dVar) {
                super(dVar);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                this.f80031a = obj;
                this.f80032b |= Integer.MIN_VALUE;
                return a.this.emit(null, this);
            }
        }

        public a(j jVar, c cVar) {
            this.f80029a = jVar;
            this.f80030b = cVar;
        }

        /* JADX WARN: Code duplicated, block: B:116:0x023f  */
        /* JADX WARN: Code duplicated, block: B:124:0x0254  */
        /* JADX WARN: Code duplicated, block: B:213:0x0495  */
        /* JADX WARN: Code duplicated, block: B:218:0x04a3  */
        /* JADX WARN: Code duplicated, block: B:223:0x04b1  */
        /* JADX WARN: Code duplicated, block: B:225:0x04b4  */
        /* JADX WARN: Code duplicated, block: B:226:0x04bb  */
        /* JADX WARN: Code duplicated, block: B:234:0x04cf  */
        /* JADX WARN: Code duplicated, block: B:239:0x04e3  */
        /* JADX WARN: Code duplicated, block: B:243:0x04f7  */
        /* JADX WARN: Code duplicated, block: B:245:0x0505  */
        /* JADX WARN: Code duplicated, block: B:246:0x0510  */
        /* JADX WARN: Code duplicated, block: B:256:0x0552  */
        /* JADX WARN: Code duplicated, block: B:258:0x0560  */
        /* JADX WARN: Code duplicated, block: B:259:0x056b  */
        /* JADX WARN: Code duplicated, block: B:268:0x0598  */
        /* JADX WARN: Code duplicated, block: B:270:0x05a4  */
        /* JADX WARN: Code duplicated, block: B:274:0x05d9  */
        /* JADX WARN: Code duplicated, block: B:279:0x05f0  */
        /* JADX WARN: Code duplicated, block: B:282:0x05f6  */
        /* JADX WARN: Code duplicated, block: B:283:0x05f9  */
        /* JADX WARN: Code duplicated, block: B:286:0x0619  */
        /* JADX WARN: Code duplicated, block: B:287:0x061c  */
        /* JADX WARN: Code duplicated, block: B:290:0x063f A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:7:0x0017  */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // r53.j
        public final Object emit(Object obj, t13.d dVar) {
            C1602a c1602a;
            T next;
            DateTimeZone zone;
            o oVarM;
            DateTime dateTimeC;
            T next2;
            Double d14;
            T next3;
            C1602a c1602a2;
            u13.a aVar;
            String str;
            String str2;
            Map<String, Double> map;
            String str3;
            Map mapE;
            Integer numB;
            Integer numA;
            Integer numC;
            Integer numValueOf;
            Integer num;
            Integer num2;
            int i14;
            int i15;
            String str4;
            i53.f fVarA;
            String str5;
            Iterator<T> it;
            int i16;
            boolean z14;
            boolean z15;
            b bVar;
            C1602a c1602a3;
            u13.a aVar2;
            hs1.a aVarA;
            int iIntValue;
            Integer numD;
            Double value;
            Integer num3;
            Double value2;
            Integer num4;
            DateTime dateTime;
            hs1.a aVarA2;
            hs1.a aVarA3;
            hs1.a aVarA4;
            DateTime dateTimeD;
            o oVarM2;
            DateTime dateTime2;
            DateTime dateTime3;
            DateTime dateTime4;
            Object obj2;
            if (dVar instanceof C1602a) {
                c1602a = (C1602a) dVar;
                int i17 = c1602a.f80032b;
                if ((i17 & Integer.MIN_VALUE) != 0) {
                    c1602a.f80032b = i17 - Integer.MIN_VALUE;
                } else {
                    c1602a = new C1602a(dVar);
                }
            } else {
                c1602a = new C1602a(dVar);
            }
            Object obj3 = c1602a.f80031a;
            u13.a aVar3 = u13.a.COROUTINE_SUSPENDED;
            int i18 = c1602a.f80032b;
            int i19 = 1;
            if (i18 == 0) {
                r.b(obj3);
                j70.j jVar = (j70.j) obj;
                c cVar = this.f80030b;
                ae0.b bVar2 = cVar.f80023d;
                ae0.f fVar = cVar.f80025f;
                ServerData serverdata = jVar.f97543b;
                List list = (List) serverdata;
                int i24 = 0;
                List listA = ae0.b.a(list != null ? (String) h0.e0(0, list) : null, e32.o.f62808k);
                List list2 = (List) serverdata;
                String str6 = list2 != null ? (String) h0.e0(1, list2) : null;
                char c14 = 2;
                Map<String, p<Double, String>> map2 = ((j70.p.b) cVar.f80021b.b(list2 != null ? (String) h0.e0(2, list2) : null)).f97618a;
                Map<String, Double> map3 = ((j70.p.a) cVar.f80022c.b(list2 != null ? (String) h0.e0(2, list2) : null)).f97617a;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry<String, p<Double, String>> entry : map2.entrySet()) {
                    char c15 = c14;
                    String str7 = entry.getValue().f128595b;
                    int i25 = i24;
                    double d15 = str7 != null ? Double.parseDouble(str7) : 1.0d;
                    gs1.e.d.c cVar2 = gs1.e.d.f78738b;
                    Double d16 = new Double(d15);
                    cVar2.getClass();
                    if (s.c(d16, 1.0d)) {
                        obj2 = gs1.e.d.C1587e.f78743c;
                    } else if (s.c(d16, 2.0d)) {
                        obj2 = gs1.e.d.f.f78744c;
                    } else if (s.c(d16, 3.0d)) {
                        obj2 = gs1.e.d.a.f78740c;
                    } else if (s.c(d16, 4.0d)) {
                        obj2 = gs1.e.d.b.f78741c;
                    } else {
                        obj2 = s.c(d16, 125.0d) ? gs1.e.d.g.f78745c : gs1.e.d.C1586d.f78742c;
                    }
                    obj2.getClass();
                    gs1.e.d[] dVarArr = new gs1.e.d[3];
                    dVarArr[i25] = gs1.e.d.f.f78744c;
                    dVarArr[i19] = gs1.e.d.b.f78741c;
                    dVarArr[c15] = gs1.e.d.g.f78745c;
                    if (u.z(dVarArr, obj2)) {
                        linkedHashMap2.put(entry.getKey(), entry.getValue().f128594a);
                    } else {
                        linkedHashMap.put(entry.getKey(), entry.getValue().f128594a);
                    }
                    c14 = c15;
                    i24 = i25;
                    i19 = i19;
                }
                int i26 = i19;
                int i27 = i24;
                p<DateTime, DateTime> pVarB = fVar.b(str6, cVar.f80024e);
                Iterator<T> it3 = listA.iterator();
                do {
                    if (!it3.hasNext()) {
                        next = (T) null;
                        break;
                    }
                    next = it3.next();
                } while (!k.g(((hs1.d) next).b(), LocalDate.now()));
                hs1.d dVar2 = next;
                if (dVar2 == null || (oVarM2 = dVar2.getWellnessChronology()) == null) {
                    zone = null;
                } else {
                    DateTime dateTimeC2 = oVarM2.c();
                    Long lValueOf = dateTimeC2 != null ? Long.valueOf(dateTimeC2.getMillis()) : null;
                    DateTime dateTimeD2 = oVarM2.d();
                    Long lValueOf2 = dateTimeD2 != null ? Long.valueOf(dateTimeD2.getMillis()) : null;
                    DateTime dateTimeA = oVarM2.a();
                    Long lValueOf3 = dateTimeA != null ? Long.valueOf(dateTimeA.getMillis()) : null;
                    DateTime dateTimeB = oVarM2.b();
                    Long lValueOf4 = dateTimeB != null ? Long.valueOf(dateTimeB.getMillis()) : null;
                    rm1.b bVar3 = (lValueOf == null || lValueOf2 == null || lValueOf3 == null || lValueOf4 == null || lValueOf.longValue() <= 0 || lValueOf2.longValue() <= 0 || lValueOf3.longValue() <= 0 || lValueOf4.longValue() <= 0) ? null : new rm1.b(lValueOf.longValue(), lValueOf2.longValue(), lValueOf3.longValue(), lValueOf4.longValue());
                    if (s.g((bVar3 == null || (dateTime4 = bVar3.f153533b) == null) ? null : dateTime4.getZone(), (bVar3 == null || (dateTime3 = bVar3.f153532a) == null) ? null : dateTime3.getZone()) || bVar3 == null || (dateTime2 = bVar3.f153533b) == null) {
                        zone = null;
                    } else {
                        zone = dateTime2.getZone();
                    }
                }
                if (zone != null) {
                    o oVarM3 = dVar2.getWellnessChronology();
                    if (oVarM3 == null || (dateTimeD = oVarM3.d()) == null) {
                        dateTimeC = null;
                    } else {
                        dateTimeC = dateTimeD.withZoneRetainFields(zone);
                    }
                } else if (dVar2 == null || (oVarM = dVar2.getWellnessChronology()) == null) {
                    dateTimeC = null;
                } else {
                    dateTimeC = oVarM.c();
                }
                yz1.d dVar3 = jVar.f97542a;
                String str8 = list2 != null ? (String) h0.e0(3, list2) : null;
                String str9 = list2 != null ? (String) h0.e0(4, list2) : null;
                String str10 = list2 != null ? (String) h0.e0(5, list2) : null;
                String str11 = list2 != null ? (String) h0.e0(6, list2) : null;
                m mVar = (m) jVar.f97544c;
                m mVar2 = (mVar == null || mVar.f83391b != -1) ? mVar : null;
                String str12 = str11;
                DateTime dateTimeNow = (mVar2 != null ? new Long(mVar2.f83396a) : null) != null ? DateTime.now(DateTimeZone.UTC) : null;
                Double d17 = mVar2 != null ? new Double(mVar2.f83391b) : null;
                Iterator<T> it4 = linkedHashMap.entrySet().iterator();
                if (it4.hasNext()) {
                    next2 = it4.next();
                    if (it4.hasNext()) {
                        LocalDateTime localDateTime = new LocalDateTime(((Map.Entry) next2).getKey());
                        next2 = next2;
                        while (true) {
                            T next4 = it4.next();
                            T t7 = next2;
                            d14 = d17;
                            LocalDateTime localDateTime2 = new LocalDateTime(((Map.Entry) next4).getKey());
                            if (localDateTime.compareTo(localDateTime2) > 0) {
                                localDateTime = localDateTime2;
                                next2 = next4;
                            } else {
                                next2 = t7;
                            }
                            if (!it4.hasNext()) {
                                break;
                            }
                            d17 = d14;
                        }
                    } else {
                        d14 = d17;
                    }
                } else {
                    d14 = d17;
                    next2 = null;
                }
                Map.Entry entry2 = (Map.Entry) next2;
                String str13 = entry2 != null ? (String) entry2.getKey() : null;
                Iterator<T> it5 = linkedHashMap.entrySet().iterator();
                if (it5.hasNext()) {
                    next3 = it5.next();
                    if (it5.hasNext()) {
                        LocalDateTime localDateTime3 = new LocalDateTime(((Map.Entry) next3).getKey());
                        next3 = next3;
                        while (true) {
                            T next5 = it5.next();
                            T t14 = next3;
                            Iterator<T> it6 = it5;
                            LocalDateTime localDateTime4 = new LocalDateTime(((Map.Entry) next5).getKey());
                            if (localDateTime3.compareTo(localDateTime4) < 0) {
                                localDateTime3 = localDateTime4;
                                next3 = next5;
                            } else {
                                next3 = t14;
                            }
                            if (!it6.hasNext()) {
                                break;
                            }
                            pVarB = pVarB;
                            map3 = map3;
                            it5 = it6;
                        }
                    }
                } else {
                    next3 = null;
                }
                Map.Entry entry3 = (Map.Entry) next3;
                String str14 = entry3 != null ? (String) entry3.getKey() : null;
                Double d18 = entry3 != null ? (Double) entry3.getValue() : null;
                if (dateTimeNow == null || d14 == null || str14 == null || d18 == null) {
                    c1602a2 = c1602a;
                    aVar = aVar3;
                    str = str14;
                    str2 = str10;
                    map = map3;
                    str3 = str6;
                } else {
                    str2 = str10;
                    map = map3;
                    double dDoubleValue = d18.doubleValue();
                    c1602a2 = c1602a;
                    aVar = aVar3;
                    double dDoubleValue2 = d14.doubleValue();
                    a2 a2Var = a2.DASHBOARD;
                    str3 = str6;
                    i2.f36769a.getClass();
                    i2.a.b(a2Var, "GetBodyBatteryDataUseCase", "rtdBodyBattery: " + dDoubleValue2);
                    i2.a.b(a2Var, "GetBodyBatteryDataUseCase", "lastEntryBB: " + dDoubleValue);
                    DateTime dateTimeP = k.p(str14, "yyyy-MM-dd'T'HH:mm:ss.S", DateTimeZone.UTC);
                    long millis = dateTimeP.getMillis();
                    str = str14;
                    i2.a.b(a2Var, "GetBodyBatteryDataUseCase", "lastEntryDateTime: " + dateTimeP);
                    long millis2 = dateTimeNow.getMillis();
                    i2.a.b(a2Var, "GetBodyBatteryDataUseCase", "rtdDateTime: " + dateTimeNow);
                    if (millis + ((long) 180000) < millis2) {
                        String string = dateTimeNow.toLocalDateTime().toString();
                        string.getClass();
                        String string2 = dateTimeP.toLocalDateTime().toString();
                        string2.getClass();
                        mapE = u0.e(new p(string2, new Double(dDoubleValue)), new p(string, new Double(dDoubleValue2)));
                    }
                    i2.f36769a.getClass();
                    i2.a.b(a2.DASHBOARD, "GetBodyBatteryDataUseCase", "bodyBatteryRealTimeData: " + mapE);
                    if (dVar2 != 0 || (aVarA4 = dVar2.getBodyBattery()) == null) {
                        numB = null;
                    } else {
                        numB = aVarA4.getDrainedValue();
                    }
                    if (dVar2 != 0 || (aVarA3 = dVar2.getBodyBattery()) == null) {
                        numA = null;
                    } else {
                        numA = aVarA3.getChargedValue();
                    }
                    if (dVar2 != 0 || (aVarA2 = dVar2.getBodyBattery()) == null) {
                        numC = null;
                    } else {
                        numC = aVarA2.getLatestValue();
                    }
                    if (mVar2 != null) {
                        numValueOf = Integer.valueOf(mVar2.f83391b);
                    } else {
                        numValueOf = null;
                    }
                    if (numValueOf != null || numValueOf.intValue() < 0 || numValueOf.intValue() > 100) {
                        num = numC;
                    } else {
                        num = numValueOf;
                    }
                    if (pVarB != null || (dateTime = pVarB.f128595b) == null) {
                        num2 = null;
                    } else {
                        num2 = new Integer(dateTime.getMinuteOfDay());
                    }
                    LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                    for (Map.Entry<String, Double> entry4 : map.entrySet()) {
                        value2 = entry4.getValue();
                        if (value2 != null) {
                            num4 = new Integer((int) value2.doubleValue());
                        } else {
                            num4 = null;
                        }
                        int i28 = i27;
                        l lVar = new l(i28, 25);
                        if (num4 == null && lVar.d(num4.intValue())) {
                            linkedHashMap3.put(entry4.getKey(), entry4.getValue());
                        }
                        i27 = i28;
                    }
                    i14 = 481;
                    i53.f fVarA2 = or1.c.a(linkedHashMap3, dateTimeC, 481, 3);
                    LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                    for (Map.Entry<String, Double> entry5 : map.entrySet()) {
                        value = entry5.getValue();
                        if (value != null) {
                            num3 = new Integer((int) value.doubleValue());
                        } else {
                            num3 = null;
                        }
                        l lVar2 = new l(26, 100);
                        if (num3 == null && lVar2.d(num3.intValue())) {
                            linkedHashMap4.put(entry5.getKey(), entry5.getValue());
                        }
                        i14 = 481;
                    }
                    i15 = i14;
                    i53.f fVarA3 = or1.c.a(linkedHashMap4, dateTimeC, i15, 3);
                    if (mapE != null) {
                        fVarA = or1.c.a(mapE, dateTimeC, i15, 3);
                        str4 = str13;
                    } else {
                        str4 = str13;
                        fVarA = null;
                    }
                    String str15 = str2;
                    i53.f fVarA4 = or1.c.a(linkedHashMap, dateTimeC, i15, 3);
                    i53.f fVarA5 = or1.c.a(linkedHashMap2, dateTimeC, i15, 3);
                    str5 = str;
                    i53.f<h> fVarB = g.b(fVar.a(dVar3, str8, str9, str15, str12, pVarB, str3));
                    it = listA.iterator();
                    i16 = 0;
                    while (it.hasNext()) {
                        aVarA = ((hs1.d) it.next()).getBodyBattery();
                        if (aVarA != null || (numD = aVarA.getMaxValue()) == null) {
                            iIntValue = 0;
                        } else {
                            iIntValue = numD.intValue();
                        }
                        i16 += iIntValue;
                    }
                    if (i16 > 0) {
                        z14 = i26;
                    } else {
                        z14 = 0;
                    }
                    boolean zIsToday = DateUtils.isToday(cVar.f80026g.L());
                    if (new LocalDateTime(str5).minusHours(4).compareTo((ReadablePartial) new LocalDateTime(str4)) >= 0) {
                        z15 = i26;
                    } else {
                        z15 = 0;
                    }
                    bVar = new b(dVar3, numB, numA, num, num2, fVarA, fVarA4, fVarA5, fVarA3, fVarA2, fVarB, z14, zIsToday, z15);
                    c1602a3 = c1602a2;
                    c1602a3.f80032b = i26;
                    aVar2 = aVar;
                    if (this.f80029a.emit(bVar, c1602a3) == aVar2) {
                        return aVar2;
                    }
                }
                mapE = null;
                i2.f36769a.getClass();
                i2.a.b(a2.DASHBOARD, "GetBodyBatteryDataUseCase", "bodyBatteryRealTimeData: " + mapE);
                if (dVar2 != 0) {
                    numB = null;
                } else {
                    numB = null;
                }
                if (dVar2 != 0) {
                    numA = null;
                } else {
                    numA = null;
                }
                if (dVar2 != 0) {
                    numC = null;
                } else {
                    numC = null;
                }
                if (mVar2 != null) {
                    numValueOf = Integer.valueOf(mVar2.f83391b);
                } else {
                    numValueOf = null;
                }
                if (numValueOf != null) {
                    num = numC;
                } else {
                    num = numC;
                }
                if (pVarB != null) {
                    num2 = null;
                } else {
                    num2 = null;
                }
                LinkedHashMap linkedHashMap5 = new LinkedHashMap();
                while (r9.hasNext()) {
                    value2 = entry4.getValue();
                    if (value2 != null) {
                        num4 = new Integer((int) value2.doubleValue());
                    } else {
                        num4 = null;
                    }
                    int i29 = i27;
                    l lVar3 = new l(i29, 25);
                    if (num4 == null) {
                    }
                    i27 = i29;
                }
                i14 = 481;
                i53.f fVarA6 = or1.c.a(linkedHashMap5, dateTimeC, 481, 3);
                LinkedHashMap linkedHashMap6 = new LinkedHashMap();
                while (r10.hasNext()) {
                    value = entry5.getValue();
                    if (value != null) {
                        num3 = new Integer((int) value.doubleValue());
                    } else {
                        num3 = null;
                    }
                    l lVar4 = new l(26, 100);
                    if (num3 == null) {
                    }
                    i14 = 481;
                }
                i15 = i14;
                i53.f fVarA7 = or1.c.a(linkedHashMap6, dateTimeC, i15, 3);
                if (mapE != null) {
                    fVarA = or1.c.a(mapE, dateTimeC, i15, 3);
                    str4 = str13;
                } else {
                    str4 = str13;
                    fVarA = null;
                }
                String str16 = str2;
                i53.f fVarA8 = or1.c.a(linkedHashMap, dateTimeC, i15, 3);
                i53.f fVarA9 = or1.c.a(linkedHashMap2, dateTimeC, i15, 3);
                str5 = str;
                i53.f<h> fVarB2 = g.b(fVar.a(dVar3, str8, str9, str16, str12, pVarB, str3));
                it = listA.iterator();
                i16 = 0;
                while (it.hasNext()) {
                    aVarA = ((hs1.d) it.next()).getBodyBattery();
                    if (aVarA != null) {
                        iIntValue = 0;
                    } else {
                        iIntValue = 0;
                    }
                    i16 += iIntValue;
                }
                if (i16 > 0) {
                    z14 = i26;
                } else {
                    z14 = 0;
                }
                boolean zIsToday2 = DateUtils.isToday(cVar.f80026g.L());
                if (new LocalDateTime(str5).minusHours(4).compareTo((ReadablePartial) new LocalDateTime(str4)) >= 0) {
                    z15 = i26;
                } else {
                    z15 = 0;
                }
                bVar = new b(dVar3, numB, numA, num, num2, fVarA, fVarA8, fVarA9, fVarA7, fVarA6, fVarB2, z14, zIsToday2, z15);
                c1602a3 = c1602a2;
                c1602a3.f80032b = i26;
                aVar2 = aVar;
                if (this.f80029a.emit(bVar, c1602a3) == aVar2) {
                    return aVar2;
                }
            } else {
                if (i18 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj3);
            }
            return Unit.INSTANCE;
        }
    }

    public d(i iVar, c cVar) {
        this.f80027a = iVar;
        this.f80028b = cVar;
    }

    @Override // r53.i
    public final Object collect(j<? super b> jVar, t13.d dVar) {
        Object objCollect = this.f80027a.collect(new a(jVar, this.f80028b), dVar);
        return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
    }
}
