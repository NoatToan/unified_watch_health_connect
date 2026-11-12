package org.threeten.bp.chrono;

import com.xiaomi.hm.health.model.account.HMCalendarConfig;
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
import org.threeten.bp.Clock;
import org.threeten.bp.DateTimeException;
import org.threeten.bp.Instant;
import org.threeten.bp.LocalDate;
import org.threeten.bp.LocalTime;
import org.threeten.bp.ZoneId;
import org.threeten.bp.format.DateTimeFormatterBuilder;
import org.threeten.bp.format.ResolverStyle;
import org.threeten.bp.format.TextStyle;
import org.threeten.bp.jdk8.DefaultInterfaceTemporalAccessor;
import org.threeten.bp.jdk8.Jdk8Methods;
import org.threeten.bp.temporal.ChronoField;
import org.threeten.bp.temporal.Temporal;
import org.threeten.bp.temporal.TemporalAccessor;
import org.threeten.bp.temporal.TemporalField;
import org.threeten.bp.temporal.TemporalQueries;
import org.threeten.bp.temporal.TemporalQuery;
import org.threeten.bp.temporal.UnsupportedTemporalTypeException;
import org.threeten.bp.temporal.ValueRange;

/* JADX INFO: loaded from: classes23.dex */
public abstract class Chronology implements Comparable<Chronology> {
    public static final TemporalQuery<Chronology> FROM = new a();
    private static final ConcurrentHashMap<String, Chronology> a = new ConcurrentHashMap<>();
    private static final ConcurrentHashMap<String, Chronology> b = new ConcurrentHashMap<>();
    private static final Method c;

    public class a implements TemporalQuery<Chronology> {
        @Override // org.threeten.bp.temporal.TemporalQuery
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Chronology queryFrom(TemporalAccessor temporalAccessor) {
            return Chronology.from(temporalAccessor);
        }
    }

    public class b extends DefaultInterfaceTemporalAccessor {
        public b() {
        }

        @Override // org.threeten.bp.temporal.TemporalAccessor
        public long getLong(TemporalField temporalField) {
            throw new UnsupportedTemporalTypeException("Unsupported field: " + temporalField);
        }

        @Override // org.threeten.bp.temporal.TemporalAccessor
        public boolean isSupported(TemporalField temporalField) {
            return false;
        }

        @Override // org.threeten.bp.jdk8.DefaultInterfaceTemporalAccessor, org.threeten.bp.temporal.TemporalAccessor
        public <R> R query(TemporalQuery<R> temporalQuery) {
            return temporalQuery == TemporalQueries.chronology() ? (R) Chronology.this : (R) super.query(temporalQuery);
        }
    }

    static {
        Method method;
        try {
            method = Locale.class.getMethod("getUnicodeLocaleType", String.class);
        } catch (Throwable unused) {
            method = null;
        }
        c = method;
    }

    private static void e() {
        ConcurrentHashMap<String, Chronology> concurrentHashMap = a;
        if (concurrentHashMap.isEmpty()) {
            g(IsoChronology.INSTANCE);
            g(ThaiBuddhistChronology.INSTANCE);
            g(MinguoChronology.INSTANCE);
            g(JapaneseChronology.INSTANCE);
            HijrahChronology hijrahChronology = HijrahChronology.INSTANCE;
            g(hijrahChronology);
            concurrentHashMap.putIfAbsent("Hijrah", hijrahChronology);
            b.putIfAbsent(HMCalendarConfig.VALUE_ISLAMIC, hijrahChronology);
            for (Chronology chronology : ServiceLoader.load(Chronology.class, Chronology.class.getClassLoader())) {
                a.putIfAbsent(chronology.getId(), chronology);
                String calendarType = chronology.getCalendarType();
                if (calendarType != null) {
                    b.putIfAbsent(calendarType, chronology);
                }
            }
        }
    }

    public static Chronology f(DataInput dataInput) throws IOException {
        return of(dataInput.readUTF());
    }

    public static Chronology from(TemporalAccessor temporalAccessor) {
        Jdk8Methods.requireNonNull(temporalAccessor, "temporal");
        Chronology chronology = (Chronology) temporalAccessor.query(TemporalQueries.chronology());
        return chronology != null ? chronology : IsoChronology.INSTANCE;
    }

    private static void g(Chronology chronology) {
        a.putIfAbsent(chronology.getId(), chronology);
        String calendarType = chronology.getCalendarType();
        if (calendarType != null) {
            b.putIfAbsent(calendarType, chronology);
        }
    }

    public static Set<Chronology> getAvailableChronologies() {
        e();
        return new HashSet(a.values());
    }

    public static Chronology of(String str) {
        e();
        Chronology chronology = a.get(str);
        if (chronology != null) {
            return chronology;
        }
        Chronology chronology2 = b.get(str);
        if (chronology2 != null) {
            return chronology2;
        }
        throw new DateTimeException("Unknown chronology: " + str);
    }

    public static Chronology ofLocale(Locale locale) {
        String str;
        e();
        Jdk8Methods.requireNonNull(locale, "locale");
        Method method = c;
        if (method != null) {
            try {
                str = (String) method.invoke(locale, "ca");
            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused) {
            }
        } else {
            str = locale.equals(JapaneseChronology.d) ? "japanese" : "iso";
        }
        if (str == null || "iso".equals(str) || "iso8601".equals(str)) {
            return IsoChronology.INSTANCE;
        }
        Chronology chronology = b.get(str);
        if (chronology != null) {
            return chronology;
        }
        throw new DateTimeException("Unknown calendar system: " + str);
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new e((byte) 11, this);
    }

    public <D extends ChronoLocalDate> D a(Temporal temporal) {
        D d = (D) temporal;
        if (equals(d.getChronology())) {
            return d;
        }
        throw new ClassCastException("Chrono mismatch, expected: " + getId() + ", actual: " + d.getChronology().getId());
    }

    public <D extends ChronoLocalDate> org.threeten.bp.chrono.b<D> b(Temporal temporal) {
        org.threeten.bp.chrono.b<D> bVar = (org.threeten.bp.chrono.b) temporal;
        if (equals(bVar.toLocalDate().getChronology())) {
            return bVar;
        }
        throw new ClassCastException("Chrono mismatch, required: " + getId() + ", supplied: " + bVar.toLocalDate().getChronology().getId());
    }

    public <D extends ChronoLocalDate> d<D> c(Temporal temporal) {
        d<D> dVar = (d) temporal;
        if (equals(dVar.toLocalDate().getChronology())) {
            return dVar;
        }
        throw new ClassCastException("Chrono mismatch, required: " + getId() + ", supplied: " + dVar.toLocalDate().getChronology().getId());
    }

    public abstract ChronoLocalDate date(int i, int i2, int i3);

    public ChronoLocalDate date(Era era, int i, int i2, int i3) {
        return date(prolepticYear(era, i), i2, i3);
    }

    public abstract ChronoLocalDate date(TemporalAccessor temporalAccessor);

    public abstract ChronoLocalDate dateEpochDay(long j);

    public ChronoLocalDate dateNow() {
        return dateNow(Clock.systemDefaultZone());
    }

    public abstract ChronoLocalDate dateYearDay(int i, int i2);

    public ChronoLocalDate dateYearDay(Era era, int i, int i2) {
        return dateYearDay(prolepticYear(era, i), i2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Chronology) && compareTo((Chronology) obj) == 0;
    }

    public abstract Era eraOf(int i);

    public abstract List<Era> eras();

    public abstract String getCalendarType();

    public String getDisplayName(TextStyle textStyle, Locale locale) {
        return new DateTimeFormatterBuilder().appendChronologyText(textStyle).toFormatter(locale).format(new b());
    }

    public abstract String getId();

    public void h(Map<TemporalField, Long> map, ChronoField chronoField, long j) {
        Long l = map.get(chronoField);
        if (l == null || l.longValue() == j) {
            map.put(chronoField, Long.valueOf(j));
            return;
        }
        throw new DateTimeException("Invalid state, field: " + chronoField + " " + l + " conflicts with " + chronoField + " " + j);
    }

    public int hashCode() {
        return getClass().hashCode() ^ getId().hashCode();
    }

    void i(DataOutput dataOutput) throws IOException {
        dataOutput.writeUTF(getId());
    }

    public abstract boolean isLeapYear(long j);

    public ChronoLocalDateTime<?> localDateTime(TemporalAccessor temporalAccessor) {
        try {
            return date(temporalAccessor).atTime(LocalTime.from(temporalAccessor));
        } catch (DateTimeException e) {
            throw new DateTimeException("Unable to obtain ChronoLocalDateTime from TemporalAccessor: " + temporalAccessor.getClass(), e);
        }
    }

    public ChronoPeriod period(int i, int i2, int i3) {
        return new c(this, i, i2, i3);
    }

    public abstract int prolepticYear(Era era, int i);

    public abstract ValueRange range(ChronoField chronoField);

    public abstract ChronoLocalDate resolveDate(Map<TemporalField, Long> map, ResolverStyle resolverStyle);

    public String toString() {
        return getId();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v6, types: [org.threeten.bp.chrono.ChronoZonedDateTime, org.threeten.bp.chrono.ChronoZonedDateTime<?>] */
    public ChronoZonedDateTime<?> zonedDateTime(TemporalAccessor temporalAccessor) {
        try {
            ZoneId zoneIdFrom = ZoneId.from(temporalAccessor);
            try {
                temporalAccessor = zonedDateTime(Instant.from(temporalAccessor), zoneIdFrom);
                return temporalAccessor;
            } catch (DateTimeException unused) {
                return d.b(b(localDateTime(temporalAccessor)), zoneIdFrom, null);
            }
        } catch (DateTimeException e) {
            throw new DateTimeException("Unable to obtain ChronoZonedDateTime from TemporalAccessor: " + temporalAccessor.getClass(), e);
        }
    }

    @Override // java.lang.Comparable
    public int compareTo(Chronology chronology) {
        return getId().compareTo(chronology.getId());
    }

    public ChronoLocalDate dateNow(ZoneId zoneId) {
        return dateNow(Clock.system(zoneId));
    }

    public ChronoLocalDate dateNow(Clock clock) {
        Jdk8Methods.requireNonNull(clock, "clock");
        return date(LocalDate.now(clock));
    }

    public ChronoZonedDateTime<?> zonedDateTime(Instant instant, ZoneId zoneId) {
        return d.c(this, instant, zoneId);
    }
}
