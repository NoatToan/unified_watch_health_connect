package defpackage;

import java.util.Map;
import org.threeten.bp.DayOfWeek;
import org.threeten.bp.Duration;
import org.threeten.bp.LocalDate;
import org.threeten.bp.chrono.IsoChronology;
import org.threeten.bp.format.ResolverStyle;
import org.threeten.bp.temporal.ChronoField;
import org.threeten.bp.temporal.ChronoUnit;
import org.threeten.bp.temporal.UnsupportedTemporalTypeException;
import org.threeten.bp.temporal.ValueRange;

/* JADX INFO: loaded from: classes3.dex */
public final class did {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final z4p f15554a = b.f15557a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final z4p f15555b = b.f15558b;
    public static final z4p c = b.c;
    public static final z4p d = b.d;
    public static final c5p e = c.WEEK_BASED_YEARS;
    public static final c5p f = c.QUARTER_YEARS;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15556a;

        static {
            int[] iArr = new int[c.values().length];
            f15556a = iArr;
            try {
                iArr[c.WEEK_BASED_YEARS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15556a[c.QUARTER_YEARS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static abstract class b implements z4p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f15557a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f15558b;
        public static final b c;
        public static final b d;
        public static final int[] e;
        public static final /* synthetic */ b[] f;

        public final enum a extends b {
            public a(String str, int i) {
                super(str, i, null);
            }

            @Override // defpackage.z4p
            public <R extends s4p> R adjustInto(R r2, long j) {
                long from = getFrom(r2);
                range().checkValidValue(j, this);
                ChronoField chronoField = ChronoField.DAY_OF_YEAR;
                return (R) r2.with(chronoField, r2.getLong(chronoField) + (j - from));
            }

            @Override // defpackage.z4p
            public long getFrom(t4p t4pVar) {
                if (!t4pVar.isSupported(this)) {
                    throw new UnsupportedTemporalTypeException("Unsupported field: DayOfQuarter");
                }
                return t4pVar.get(ChronoField.DAY_OF_YEAR) - b.e[((t4pVar.get(ChronoField.MONTH_OF_YEAR) - 1) / 3) + (IsoChronology.INSTANCE.isLeapYear(t4pVar.getLong(ChronoField.YEAR)) ? 4 : 0)];
            }

            @Override // defpackage.z4p
            public boolean isSupportedBy(t4p t4pVar) {
                return t4pVar.isSupported(ChronoField.DAY_OF_YEAR) && t4pVar.isSupported(ChronoField.MONTH_OF_YEAR) && t4pVar.isSupported(ChronoField.YEAR) && b.o(t4pVar);
            }

            @Override // defpackage.z4p
            public ValueRange range() {
                return ValueRange.of(1L, 90L, 92L);
            }

            @Override // defpackage.z4p
            public ValueRange rangeRefinedBy(t4p t4pVar) {
                if (!t4pVar.isSupported(this)) {
                    throw new UnsupportedTemporalTypeException("Unsupported field: DayOfQuarter");
                }
                long j = t4pVar.getLong(b.f15558b);
                if (j == 1) {
                    return IsoChronology.INSTANCE.isLeapYear(t4pVar.getLong(ChronoField.YEAR)) ? ValueRange.of(1L, 91L) : ValueRange.of(1L, 90L);
                }
                if (j == 2) {
                    return ValueRange.of(1L, 91L);
                }
                return (j == 3 || j == 4) ? ValueRange.of(1L, 92L) : range();
            }

            @Override // did.b, defpackage.z4p
            public t4p resolve(Map<z4p, Long> map, t4p t4pVar, ResolverStyle resolverStyle) {
                LocalDate localDatePlusDays;
                ChronoField chronoField = ChronoField.YEAR;
                Long l = map.get(chronoField);
                z4p z4pVar = b.f15558b;
                Long l2 = map.get(z4pVar);
                if (l == null || l2 == null) {
                    return null;
                }
                int iCheckValidIntValue = chronoField.checkValidIntValue(l.longValue());
                long jLongValue = map.get(b.f15557a).longValue();
                if (resolverStyle == ResolverStyle.LENIENT) {
                    localDatePlusDays = LocalDate.of(iCheckValidIntValue, 1, 1).plusMonths(crd.m(crd.p(l2.longValue(), 1L), 3)).plusDays(crd.p(jLongValue, 1L));
                } else {
                    int iCheckValidIntValue2 = z4pVar.range().checkValidIntValue(l2.longValue(), z4pVar);
                    if (resolverStyle == ResolverStyle.STRICT) {
                        int i = 91;
                        if (iCheckValidIntValue2 == 1) {
                            if (!IsoChronology.INSTANCE.isLeapYear(iCheckValidIntValue)) {
                                i = 90;
                            }
                        } else if (iCheckValidIntValue2 != 2) {
                            i = 92;
                        }
                        ValueRange.of(1L, i).checkValidValue(jLongValue, this);
                    } else {
                        range().checkValidValue(jLongValue, this);
                    }
                    localDatePlusDays = LocalDate.of(iCheckValidIntValue, ((iCheckValidIntValue2 - 1) * 3) + 1, 1).plusDays(jLongValue - 1);
                }
                map.remove(this);
                map.remove(chronoField);
                map.remove(z4pVar);
                return localDatePlusDays;
            }

            @Override // java.lang.Enum
            public String toString() {
                return "DayOfQuarter";
            }
        }

        /* JADX INFO: renamed from: did$b$b, reason: collision with other inner class name */
        public final enum C0913b extends b {
            public C0913b(String str, int i) {
                super(str, i, null);
            }

            @Override // defpackage.z4p
            public <R extends s4p> R adjustInto(R r2, long j) {
                long from = getFrom(r2);
                range().checkValidValue(j, this);
                ChronoField chronoField = ChronoField.MONTH_OF_YEAR;
                return (R) r2.with(chronoField, r2.getLong(chronoField) + ((j - from) * 3));
            }

            @Override // defpackage.z4p
            public long getFrom(t4p t4pVar) {
                if (t4pVar.isSupported(this)) {
                    return (t4pVar.getLong(ChronoField.MONTH_OF_YEAR) + 2) / 3;
                }
                throw new UnsupportedTemporalTypeException("Unsupported field: QuarterOfYear");
            }

            @Override // defpackage.z4p
            public boolean isSupportedBy(t4p t4pVar) {
                return t4pVar.isSupported(ChronoField.MONTH_OF_YEAR) && b.o(t4pVar);
            }

            @Override // defpackage.z4p
            public ValueRange range() {
                return ValueRange.of(1L, 4L);
            }

            @Override // defpackage.z4p
            public ValueRange rangeRefinedBy(t4p t4pVar) {
                return range();
            }

            @Override // java.lang.Enum
            public String toString() {
                return "QuarterOfYear";
            }
        }

        public final enum c extends b {
            public c(String str, int i) {
                super(str, i, null);
            }

            @Override // defpackage.z4p
            public <R extends s4p> R adjustInto(R r2, long j) {
                range().checkValidValue(j, this);
                return (R) r2.plus(crd.p(j, getFrom(r2)), ChronoUnit.WEEKS);
            }

            @Override // defpackage.z4p
            public long getFrom(t4p t4pVar) {
                if (t4pVar.isSupported(this)) {
                    return b.i(LocalDate.from(t4pVar));
                }
                throw new UnsupportedTemporalTypeException("Unsupported field: WeekOfWeekBasedYear");
            }

            @Override // defpackage.z4p
            public boolean isSupportedBy(t4p t4pVar) {
                return t4pVar.isSupported(ChronoField.EPOCH_DAY) && b.o(t4pVar);
            }

            @Override // defpackage.z4p
            public ValueRange range() {
                return ValueRange.of(1L, 52L, 53L);
            }

            @Override // defpackage.z4p
            public ValueRange rangeRefinedBy(t4p t4pVar) {
                if (t4pVar.isSupported(this)) {
                    return b.n(LocalDate.from(t4pVar));
                }
                throw new UnsupportedTemporalTypeException("Unsupported field: WeekOfWeekBasedYear");
            }

            @Override // did.b, defpackage.z4p
            public t4p resolve(Map<z4p, Long> map, t4p t4pVar, ResolverStyle resolverStyle) {
                LocalDate localDateWith;
                long j;
                z4p z4pVar = b.d;
                Long l = map.get(z4pVar);
                ChronoField chronoField = ChronoField.DAY_OF_WEEK;
                Long l2 = map.get(chronoField);
                if (l == null || l2 == null) {
                    return null;
                }
                int iCheckValidIntValue = z4pVar.range().checkValidIntValue(l.longValue(), z4pVar);
                long jLongValue = map.get(b.c).longValue();
                if (resolverStyle == ResolverStyle.LENIENT) {
                    long jLongValue2 = l2.longValue();
                    if (jLongValue2 > 7) {
                        long j2 = jLongValue2 - 1;
                        j = j2 / 7;
                        jLongValue2 = (j2 % 7) + 1;
                    } else if (jLongValue2 < 1) {
                        j = (jLongValue2 / 7) - 1;
                        jLongValue2 = (jLongValue2 % 7) + 7;
                    } else {
                        j = 0;
                    }
                    localDateWith = LocalDate.of(iCheckValidIntValue, 1, 4).plusWeeks(jLongValue - 1).plusWeeks(j).with((z4p) chronoField, jLongValue2);
                } else {
                    int iCheckValidIntValue2 = chronoField.checkValidIntValue(l2.longValue());
                    if (resolverStyle == ResolverStyle.STRICT) {
                        b.n(LocalDate.of(iCheckValidIntValue, 1, 4)).checkValidValue(jLongValue, this);
                    } else {
                        range().checkValidValue(jLongValue, this);
                    }
                    localDateWith = LocalDate.of(iCheckValidIntValue, 1, 4).plusWeeks(jLongValue - 1).with((z4p) chronoField, iCheckValidIntValue2);
                }
                map.remove(this);
                map.remove(z4pVar);
                map.remove(chronoField);
                return localDateWith;
            }

            @Override // java.lang.Enum
            public String toString() {
                return "WeekOfWeekBasedYear";
            }
        }

        public final enum d extends b {
            public d(String str, int i) {
                super(str, i, null);
            }

            @Override // defpackage.z4p
            public <R extends s4p> R adjustInto(R r2, long j) {
                if (!isSupportedBy(r2)) {
                    throw new UnsupportedTemporalTypeException("Unsupported field: WeekBasedYear");
                }
                int iCheckValidIntValue = range().checkValidIntValue(j, b.d);
                LocalDate localDateFrom = LocalDate.from((t4p) r2);
                ChronoField chronoField = ChronoField.DAY_OF_WEEK;
                int i = localDateFrom.get(chronoField);
                int i2 = b.i(localDateFrom);
                if (i2 == 53 && b.m(iCheckValidIntValue) == 52) {
                    i2 = 52;
                }
                LocalDate localDateOf = LocalDate.of(iCheckValidIntValue, 1, 4);
                return (R) r2.with(localDateOf.plusDays((i - localDateOf.get(chronoField)) + ((i2 - 1) * 7)));
            }

            @Override // defpackage.z4p
            public long getFrom(t4p t4pVar) {
                if (t4pVar.isSupported(this)) {
                    return b.k(LocalDate.from(t4pVar));
                }
                throw new UnsupportedTemporalTypeException("Unsupported field: WeekBasedYear");
            }

            @Override // defpackage.z4p
            public boolean isSupportedBy(t4p t4pVar) {
                return t4pVar.isSupported(ChronoField.EPOCH_DAY) && b.o(t4pVar);
            }

            @Override // defpackage.z4p
            public ValueRange range() {
                return ChronoField.YEAR.range();
            }

            @Override // defpackage.z4p
            public ValueRange rangeRefinedBy(t4p t4pVar) {
                return ChronoField.YEAR.range();
            }

            @Override // java.lang.Enum
            public String toString() {
                return "WeekBasedYear";
            }
        }

        static {
            a aVar = new a("DAY_OF_QUARTER", 0);
            f15557a = aVar;
            C0913b c0913b = new C0913b("QUARTER_OF_YEAR", 1);
            f15558b = c0913b;
            c cVar = new c("WEEK_OF_WEEK_BASED_YEAR", 2);
            c = cVar;
            d dVar = new d("WEEK_BASED_YEAR", 3);
            d = dVar;
            f = new b[]{aVar, c0913b, cVar, dVar};
            e = new int[]{0, 90, 181, 273, 0, 91, 182, 274};
        }

        public b(String str, int i) {
            super(str, i);
        }

        public static int i(LocalDate localDate) {
            int iOrdinal = localDate.getDayOfWeek().ordinal();
            int dayOfYear = localDate.getDayOfYear() - 1;
            int i = (3 - iOrdinal) + dayOfYear;
            int i2 = i - ((i / 7) * 7);
            int i3 = i2 - 3;
            if (i3 < -3) {
                i3 = i2 + 4;
            }
            if (dayOfYear < i3) {
                return (int) n(localDate.withDayOfYear(180).minusYears(1L)).getMaximum();
            }
            int i4 = ((dayOfYear - i3) / 7) + 1;
            if (i4 != 53 || i3 == -3 || (i3 == -2 && localDate.isLeapYear())) {
                return i4;
            }
            return 1;
        }

        public static int k(LocalDate localDate) {
            int year = localDate.getYear();
            int dayOfYear = localDate.getDayOfYear();
            if (dayOfYear <= 3) {
                return dayOfYear - localDate.getDayOfWeek().ordinal() < -2 ? year - 1 : year;
            }
            if (dayOfYear >= 363) {
                return ((dayOfYear - 363) - (localDate.isLeapYear() ? 1 : 0)) - localDate.getDayOfWeek().ordinal() >= 0 ? year + 1 : year;
            }
            return year;
        }

        public static int m(int i) {
            LocalDate localDateOf = LocalDate.of(i, 1, 1);
            if (localDateOf.getDayOfWeek() != DayOfWeek.THURSDAY) {
                return (localDateOf.getDayOfWeek() == DayOfWeek.WEDNESDAY && localDateOf.isLeapYear()) ? 53 : 52;
            }
            return 53;
        }

        public static ValueRange n(LocalDate localDate) {
            return ValueRange.of(1L, m(k(localDate)));
        }

        public static boolean o(t4p t4pVar) {
            return org.threeten.bp.chrono.b.from(t4pVar).equals(IsoChronology.INSTANCE);
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f.clone();
        }

        @Override // defpackage.z4p
        public boolean isDateBased() {
            return true;
        }

        @Override // defpackage.z4p
        public boolean isTimeBased() {
            return false;
        }

        @Override // defpackage.z4p
        public t4p resolve(Map<z4p, Long> map, t4p t4pVar, ResolverStyle resolverStyle) {
            return null;
        }

        public /* synthetic */ b(String str, int i, a aVar) {
            this(str, i);
        }
    }

    public enum c implements c5p {
        WEEK_BASED_YEARS("WeekBasedYears", Duration.ofSeconds(31556952)),
        QUARTER_YEARS("QuarterYears", Duration.ofSeconds(7889238));


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f15559a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Duration f15560b;

        c(String str, Duration duration) {
            this.f15559a = str;
            this.f15560b = duration;
        }

        @Override // defpackage.c5p
        public <R extends s4p> R addTo(R r2, long j) {
            int i = a.f15556a[ordinal()];
            if (i == 1) {
                z4p z4pVar = did.d;
                return (R) r2.with(z4pVar, crd.k(r2.get(z4pVar), j));
            }
            if (i == 2) {
                return (R) r2.plus(j / 256, ChronoUnit.YEARS).plus((j % 256) * 3, ChronoUnit.MONTHS);
            }
            throw new IllegalStateException("Unreachable");
        }

        @Override // defpackage.c5p
        public long between(s4p s4pVar, s4p s4pVar2) {
            int i = a.f15556a[ordinal()];
            if (i == 1) {
                z4p z4pVar = did.d;
                return crd.p(s4pVar2.getLong(z4pVar), s4pVar.getLong(z4pVar));
            }
            if (i == 2) {
                return s4pVar.until(s4pVar2, ChronoUnit.MONTHS) / 3;
            }
            throw new IllegalStateException("Unreachable");
        }

        @Override // defpackage.c5p
        public Duration getDuration() {
            return this.f15560b;
        }

        @Override // defpackage.c5p
        public boolean isDateBased() {
            return true;
        }

        @Override // defpackage.c5p
        public boolean isDurationEstimated() {
            return true;
        }

        @Override // defpackage.c5p
        public boolean isSupportedBy(s4p s4pVar) {
            return s4pVar.isSupported(ChronoField.EPOCH_DAY);
        }

        @Override // defpackage.c5p
        public boolean isTimeBased() {
            return false;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.f15559a;
        }
    }
}
