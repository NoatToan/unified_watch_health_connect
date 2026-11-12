package defpackage;

import java.text.DateFormatSymbols;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationFieldType;
import org.joda.time.Interval;
import org.joda.time.PeriodType;
import org.joda.time.chrono.ISOChronology;

/* JADX INFO: loaded from: classes3.dex */
public class wq5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f38246a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile a f38247b;
    public static final AtomicReference<Map<String, DateTimeZone>> c;

    public interface a {
        long getMillis();
    }

    public static class b implements a {
        @Override // wq5.a
        public long getMillis() {
            return System.currentTimeMillis();
        }
    }

    static {
        b bVar = new b();
        f38246a = bVar;
        f38247b = bVar;
        c = new AtomicReference<>();
    }

    public static Map<String, DateTimeZone> a() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        DateTimeZone dateTimeZone = DateTimeZone.UTC;
        linkedHashMap.put("UT", dateTimeZone);
        linkedHashMap.put("UTC", dateTimeZone);
        linkedHashMap.put("GMT", dateTimeZone);
        o(linkedHashMap, "EST", "America/New_York");
        o(linkedHashMap, "EDT", "America/New_York");
        o(linkedHashMap, "CST", "America/Chicago");
        o(linkedHashMap, "CDT", "America/Chicago");
        o(linkedHashMap, "MST", "America/Denver");
        o(linkedHashMap, "MDT", "America/Denver");
        o(linkedHashMap, "PST", "America/Los_Angeles");
        o(linkedHashMap, "PDT", "America/Los_Angeles");
        return Collections.unmodifiableMap(linkedHashMap);
    }

    public static final long b() {
        return f38247b.getMillis();
    }

    public static final bw3 c(bw3 bw3Var) {
        return bw3Var == null ? ISOChronology.getInstance() : bw3Var;
    }

    public static final DateFormatSymbols d(Locale locale) {
        try {
            return (DateFormatSymbols) DateFormatSymbols.class.getMethod("getInstance", Locale.class).invoke(null, locale);
        } catch (Exception unused) {
            return new DateFormatSymbols(locale);
        }
    }

    public static final Map<String, DateTimeZone> e() {
        AtomicReference<Map<String, DateTimeZone>> atomicReference = c;
        Map<String, DateTimeZone> map = atomicReference.get();
        if (map != null) {
            return map;
        }
        Map<String, DateTimeZone> mapA = a();
        return !d8i.a(atomicReference, null, mapA) ? atomicReference.get() : mapA;
    }

    public static final long f(hgj hgjVar) {
        if (hgjVar == null) {
            return 0L;
        }
        return hgjVar.getMillis();
    }

    public static final bw3 g(kgj kgjVar) {
        bw3 chronology;
        return (kgjVar == null || (chronology = kgjVar.getChronology()) == null) ? ISOChronology.getInstance() : chronology;
    }

    public static final long h(kgj kgjVar) {
        return kgjVar == null ? b() : kgjVar.getMillis();
    }

    public static final bw3 i(kgj kgjVar, kgj kgjVar2) {
        bw3 chronology;
        if (kgjVar != null) {
            chronology = kgjVar.getChronology();
        } else {
            chronology = kgjVar2 != null ? kgjVar2.getChronology() : null;
        }
        return chronology == null ? ISOChronology.getInstance() : chronology;
    }

    public static final bw3 j(mgj mgjVar) {
        bw3 chronology;
        return (mgjVar == null || (chronology = mgjVar.getChronology()) == null) ? ISOChronology.getInstance() : chronology;
    }

    public static final PeriodType k(PeriodType periodType) {
        return periodType == null ? PeriodType.standard() : periodType;
    }

    public static final mgj l(mgj mgjVar) {
        if (mgjVar != null) {
            return mgjVar;
        }
        long jB = b();
        return new Interval(jB, jB);
    }

    public static final DateTimeZone m(DateTimeZone dateTimeZone) {
        return dateTimeZone == null ? DateTimeZone.getDefault() : dateTimeZone;
    }

    public static final boolean n(ogj ogjVar) {
        if (ogjVar == null) {
            throw new IllegalArgumentException("Partial must not be null");
        }
        DurationFieldType type = null;
        for (int i = 0; i < ogjVar.size(); i++) {
            gq5 field = ogjVar.getField(i);
            if (i > 0 && (field.getRangeDurationField() == null || field.getRangeDurationField().getType() != type)) {
                return false;
            }
            type = field.getDurationField().getType();
        }
        return true;
    }

    public static void o(Map<String, DateTimeZone> map, String str, String str2) {
        try {
            map.put(str, DateTimeZone.forID(str2));
        } catch (RuntimeException unused) {
        }
    }
}
