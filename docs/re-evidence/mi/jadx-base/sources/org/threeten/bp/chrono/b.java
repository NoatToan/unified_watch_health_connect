package org.threeten.bp.chrono;

import com.xiaomi.fitness.device.manager.export.bean.Feature;
import defpackage.a5p;
import defpackage.ad8;
import defpackage.aw3;
import defpackage.b5p;
import defpackage.crd;
import defpackage.g14;
import defpackage.gwl;
import defpackage.kq5;
import defpackage.s4p;
import defpackage.sv5;
import defpackage.t4p;
import defpackage.vv3;
import defpackage.wv3;
import defpackage.xv3;
import defpackage.yv3;
import defpackage.z4p;
import defpackage.zv3;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectStreamException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.ServiceLoader;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.threeten.bp.DateTimeException;
import org.threeten.bp.Instant;
import org.threeten.bp.LocalDate;
import org.threeten.bp.LocalTime;
import org.threeten.bp.ZoneId;
import org.threeten.bp.format.ResolverStyle;
import org.threeten.bp.format.TextStyle;
import org.threeten.bp.temporal.ChronoField;
import org.threeten.bp.temporal.UnsupportedTemporalTypeException;
import org.threeten.bp.temporal.ValueRange;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b implements Comparable<b> {
    private static final Method LOCALE_METHOD;
    public static final b5p<b> FROM = new a();
    private static final ConcurrentHashMap<String, b> CHRONOS_BY_ID = new ConcurrentHashMap<>();
    private static final ConcurrentHashMap<String, b> CHRONOS_BY_TYPE = new ConcurrentHashMap<>();

    public class a implements b5p<b> {
        @Override // defpackage.b5p
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public b a(t4p t4pVar) {
            return b.from(t4pVar);
        }
    }

    /* JADX INFO: renamed from: org.threeten.bp.chrono.b$b, reason: collision with other inner class name */
    public class C1069b extends sv5 {
        public C1069b() {
        }

        @Override // defpackage.t4p
        public long getLong(z4p z4pVar) {
            throw new UnsupportedTemporalTypeException("Unsupported field: " + z4pVar);
        }

        @Override // defpackage.t4p
        public boolean isSupported(z4p z4pVar) {
            return false;
        }

        @Override // defpackage.sv5, defpackage.t4p
        public <R> R query(b5p<R> b5pVar) {
            return b5pVar == a5p.a() ? (R) b.this : (R) super.query(b5pVar);
        }
    }

    static {
        Method method;
        try {
            method = Locale.class.getMethod("getUnicodeLocaleType", String.class);
        } catch (Throwable unused) {
            method = null;
        }
        LOCALE_METHOD = method;
    }

    public static b from(t4p t4pVar) {
        crd.i(t4pVar, "temporal");
        b bVar = (b) t4pVar.query(a5p.a());
        return bVar != null ? bVar : IsoChronology.INSTANCE;
    }

    public static Set<b> getAvailableChronologies() {
        init();
        return new HashSet(CHRONOS_BY_ID.values());
    }

    private static void init() {
        ConcurrentHashMap<String, b> concurrentHashMap = CHRONOS_BY_ID;
        if (concurrentHashMap.isEmpty()) {
            register(IsoChronology.INSTANCE);
            register(ThaiBuddhistChronology.INSTANCE);
            register(MinguoChronology.INSTANCE);
            register(JapaneseChronology.INSTANCE);
            HijrahChronology hijrahChronology = HijrahChronology.INSTANCE;
            register(hijrahChronology);
            concurrentHashMap.putIfAbsent("Hijrah", hijrahChronology);
            CHRONOS_BY_TYPE.putIfAbsent("islamic", hijrahChronology);
            for (b bVar : ServiceLoader.load(b.class, b.class.getClassLoader())) {
                CHRONOS_BY_ID.putIfAbsent(bVar.getId(), bVar);
                String calendarType = bVar.getCalendarType();
                if (calendarType != null) {
                    CHRONOS_BY_TYPE.putIfAbsent(calendarType, bVar);
                }
            }
        }
    }

    public static b of(String str) {
        init();
        b bVar = CHRONOS_BY_ID.get(str);
        if (bVar != null) {
            return bVar;
        }
        b bVar2 = CHRONOS_BY_TYPE.get(str);
        if (bVar2 != null) {
            return bVar2;
        }
        throw new DateTimeException("Unknown chronology: " + str);
    }

    public static b ofLocale(Locale locale) {
        String str;
        init();
        crd.i(locale, "locale");
        Method method = LOCALE_METHOD;
        if (method != null) {
            try {
                str = (String) method.invoke(locale, "ca");
            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused) {
            }
        } else {
            str = locale.equals(JapaneseChronology.LOCALE) ? "japanese" : "iso";
        }
        if (str == null || "iso".equals(str) || "iso8601".equals(str)) {
            return IsoChronology.INSTANCE;
        }
        b bVar = CHRONOS_BY_TYPE.get(str);
        if (bVar != null) {
            return bVar;
        }
        throw new DateTimeException("Unknown calendar system: " + str);
    }

    public static b readExternal(DataInput dataInput) throws IOException {
        return of(dataInput.readUTF());
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private static void register(b bVar) {
        CHRONOS_BY_ID.putIfAbsent(bVar.getId(), bVar);
        String calendarType = bVar.getCalendarType();
        if (calendarType != null) {
            CHRONOS_BY_TYPE.putIfAbsent(calendarType, bVar);
        }
    }

    private Object writeReplace() {
        return new gwl((byte) 11, this);
    }

    public abstract org.threeten.bp.chrono.a date(int i, int i2, int i3);

    public org.threeten.bp.chrono.a date(ad8 ad8Var, int i, int i2, int i3) {
        return date(prolepticYear(ad8Var, i), i2, i3);
    }

    public abstract org.threeten.bp.chrono.a date(t4p t4pVar);

    public abstract org.threeten.bp.chrono.a dateEpochDay(long j);

    public org.threeten.bp.chrono.a dateNow() {
        return dateNow(g14.d());
    }

    public abstract org.threeten.bp.chrono.a dateYearDay(int i, int i2);

    public org.threeten.bp.chrono.a dateYearDay(ad8 ad8Var, int i, int i2) {
        return dateYearDay(prolepticYear(ad8Var, i), i2);
    }

    public <D extends org.threeten.bp.chrono.a> D ensureChronoLocalDate(s4p s4pVar) {
        D d = (D) s4pVar;
        if (equals(d.getChronology())) {
            return d;
        }
        throw new ClassCastException("Chrono mismatch, expected: " + getId() + ", actual: " + d.getChronology().getId());
    }

    public <D extends org.threeten.bp.chrono.a> wv3<D> ensureChronoLocalDateTime(s4p s4pVar) {
        wv3<D> wv3Var = (wv3) s4pVar;
        if (equals(wv3Var.toLocalDate().getChronology())) {
            return wv3Var;
        }
        throw new ClassCastException("Chrono mismatch, required: " + getId() + ", supplied: " + wv3Var.toLocalDate().getChronology().getId());
    }

    public <D extends org.threeten.bp.chrono.a> aw3<D> ensureChronoZonedDateTime(s4p s4pVar) {
        aw3<D> aw3Var = (aw3) s4pVar;
        if (equals(aw3Var.toLocalDate().getChronology())) {
            return aw3Var;
        }
        throw new ClassCastException("Chrono mismatch, required: " + getId() + ", supplied: " + aw3Var.toLocalDate().getChronology().getId());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && compareTo((b) obj) == 0;
    }

    public abstract ad8 eraOf(int i);

    public abstract List<ad8> eras();

    public abstract String getCalendarType();

    public String getDisplayName(TextStyle textStyle, Locale locale) {
        return new kq5().b(textStyle).w(locale).b(new C1069b());
    }

    public abstract String getId();

    public int hashCode() {
        return getClass().hashCode() ^ getId().hashCode();
    }

    public abstract boolean isLeapYear(long j);

    public vv3<?> localDateTime(t4p t4pVar) {
        try {
            return date(t4pVar).atTime(LocalTime.from(t4pVar));
        } catch (DateTimeException e) {
            throw new DateTimeException("Unable to obtain ChronoLocalDateTime from TemporalAccessor: " + t4pVar.getClass(), e);
        }
    }

    public xv3 period(int i, int i2, int i3) {
        return new yv3(this, i, i2, i3);
    }

    public abstract int prolepticYear(ad8 ad8Var, int i);

    public abstract ValueRange range(ChronoField chronoField);

    public abstract org.threeten.bp.chrono.a resolveDate(Map<z4p, Long> map, ResolverStyle resolverStyle);

    public String toString() {
        return getId();
    }

    public void updateResolveMap(Map<z4p, Long> map, ChronoField chronoField, long j) {
        Long l = map.get(chronoField);
        if (l == null || l.longValue() == j) {
            map.put(chronoField, Long.valueOf(j));
            return;
        }
        throw new DateTimeException("Invalid state, field: " + chronoField + " " + l + " conflicts with " + chronoField + " " + j);
    }

    public void writeExternal(DataOutput dataOutput) throws IOException {
        dataOutput.writeUTF(getId());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v6, types: [zv3, zv3<?>] */
    public zv3<?> zonedDateTime(t4p t4pVar) {
        try {
            ZoneId zoneIdFrom = ZoneId.from(t4pVar);
            try {
                t4pVar = zonedDateTime(Instant.from(t4pVar), zoneIdFrom);
                return t4pVar;
            } catch (DateTimeException unused) {
                return aw3.b(ensureChronoLocalDateTime(localDateTime(t4pVar)), zoneIdFrom, null);
            }
        } catch (DateTimeException e) {
            throw new DateTimeException("Unable to obtain ChronoZonedDateTime from TemporalAccessor: " + t4pVar.getClass(), e);
        }
    }

    @Override // java.lang.Comparable
    public int compareTo(b bVar) {
        return getId().compareTo(bVar.getId());
    }

    public org.threeten.bp.chrono.a dateNow(ZoneId zoneId) {
        return dateNow(g14.c(zoneId));
    }

    public org.threeten.bp.chrono.a dateNow(g14 g14Var) {
        crd.i(g14Var, Feature.CLOCK);
        return date(LocalDate.now(g14Var));
    }

    public zv3<?> zonedDateTime(Instant instant, ZoneId zoneId) {
        return aw3.c(this, instant, zoneId);
    }
}
