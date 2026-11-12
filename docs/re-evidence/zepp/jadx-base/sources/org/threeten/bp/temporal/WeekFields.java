package org.threeten.bp.temporal;

import java.io.InvalidObjectException;
import java.io.Serializable;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import kotlinx.serialization.json.internal.JsonLexerKt;
import org.threeten.bp.DateTimeException;
import org.threeten.bp.DayOfWeek;
import org.threeten.bp.Year;
import org.threeten.bp.chrono.ChronoLocalDate;
import org.threeten.bp.chrono.Chronology;
import org.threeten.bp.format.ResolverStyle;
import org.threeten.bp.jdk8.Jdk8Methods;

/* JADX INFO: loaded from: classes23.dex */
public final class WeekFields implements Serializable {
    private static final long serialVersionUID = -1177360819670808121L;
    private final DayOfWeek a;
    private final int b;
    private final transient TemporalField c = a.g(this);
    private final transient TemporalField d = a.i(this);
    private final transient TemporalField e = a.k(this);
    private final transient TemporalField f = a.j(this);
    private final transient TemporalField g = a.h(this);
    private static final ConcurrentMap<String, WeekFields> h = new ConcurrentHashMap(4, 0.75f, 2);
    public static final WeekFields ISO = new WeekFields(DayOfWeek.MONDAY, 4);
    public static final WeekFields SUNDAY_START = of(DayOfWeek.SUNDAY, 1);

    public static class a implements TemporalField {
        private static final ValueRange f = ValueRange.of(1, 7);
        private static final ValueRange g = ValueRange.of(0, 1, 4, 6);
        private static final ValueRange h = ValueRange.of(0, 1, 52, 54);
        private static final ValueRange i = ValueRange.of(1, 52, 53);
        private static final ValueRange j = ChronoField.YEAR.range();
        private final String a;
        private final WeekFields b;
        private final TemporalUnit c;
        private final TemporalUnit d;
        private final ValueRange e;

        private a(String str, WeekFields weekFields, TemporalUnit temporalUnit, TemporalUnit temporalUnit2, ValueRange valueRange) {
            this.a = str;
            this.b = weekFields;
            this.c = temporalUnit;
            this.d = temporalUnit2;
            this.e = valueRange;
        }

        private int a(int i2, int i3) {
            return ((i2 + 7) + (i3 - 1)) / 7;
        }

        private int b(TemporalAccessor temporalAccessor, int i2) {
            return Jdk8Methods.floorMod(temporalAccessor.get(ChronoField.DAY_OF_WEEK) - i2, 7) + 1;
        }

        private int c(TemporalAccessor temporalAccessor) {
            int iFloorMod = Jdk8Methods.floorMod(temporalAccessor.get(ChronoField.DAY_OF_WEEK) - this.b.getFirstDayOfWeek().getValue(), 7) + 1;
            int i2 = temporalAccessor.get(ChronoField.YEAR);
            long jF = f(temporalAccessor, iFloorMod);
            if (jF == 0) {
                return i2 - 1;
            }
            if (jF < 53) {
                return i2;
            }
            return jF >= ((long) a(m(temporalAccessor.get(ChronoField.DAY_OF_YEAR), iFloorMod), (Year.isLeap((long) i2) ? 366 : 365) + this.b.getMinimalDaysInFirstWeek())) ? i2 + 1 : i2;
        }

        private int d(TemporalAccessor temporalAccessor) {
            int iFloorMod = Jdk8Methods.floorMod(temporalAccessor.get(ChronoField.DAY_OF_WEEK) - this.b.getFirstDayOfWeek().getValue(), 7) + 1;
            long jF = f(temporalAccessor, iFloorMod);
            if (jF == 0) {
                return ((int) f(Chronology.from(temporalAccessor).date(temporalAccessor).minus(1L, (TemporalUnit) ChronoUnit.WEEKS), iFloorMod)) + 1;
            }
            if (jF >= 53) {
                int iA = a(m(temporalAccessor.get(ChronoField.DAY_OF_YEAR), iFloorMod), (Year.isLeap((long) temporalAccessor.get(ChronoField.YEAR)) ? 366 : 365) + this.b.getMinimalDaysInFirstWeek());
                if (jF >= iA) {
                    return (int) (jF - ((long) (iA - 1)));
                }
            }
            return (int) jF;
        }

        private long e(TemporalAccessor temporalAccessor, int i2) {
            int i3 = temporalAccessor.get(ChronoField.DAY_OF_MONTH);
            return a(m(i3, i2), i3);
        }

        private long f(TemporalAccessor temporalAccessor, int i2) {
            int i3 = temporalAccessor.get(ChronoField.DAY_OF_YEAR);
            return a(m(i3, i2), i3);
        }

        public static a g(WeekFields weekFields) {
            return new a("DayOfWeek", weekFields, ChronoUnit.DAYS, ChronoUnit.WEEKS, f);
        }

        public static a h(WeekFields weekFields) {
            return new a("WeekBasedYear", weekFields, IsoFields.WEEK_BASED_YEARS, ChronoUnit.FOREVER, j);
        }

        public static a i(WeekFields weekFields) {
            return new a("WeekOfMonth", weekFields, ChronoUnit.WEEKS, ChronoUnit.MONTHS, g);
        }

        public static a j(WeekFields weekFields) {
            return new a("WeekOfWeekBasedYear", weekFields, ChronoUnit.WEEKS, IsoFields.WEEK_BASED_YEARS, i);
        }

        public static a k(WeekFields weekFields) {
            return new a("WeekOfYear", weekFields, ChronoUnit.WEEKS, ChronoUnit.YEARS, h);
        }

        private ValueRange l(TemporalAccessor temporalAccessor) {
            int iFloorMod = Jdk8Methods.floorMod(temporalAccessor.get(ChronoField.DAY_OF_WEEK) - this.b.getFirstDayOfWeek().getValue(), 7) + 1;
            long jF = f(temporalAccessor, iFloorMod);
            if (jF == 0) {
                return l(Chronology.from(temporalAccessor).date(temporalAccessor).minus(2L, (TemporalUnit) ChronoUnit.WEEKS));
            }
            int iA = a(m(temporalAccessor.get(ChronoField.DAY_OF_YEAR), iFloorMod), (Year.isLeap((long) temporalAccessor.get(ChronoField.YEAR)) ? 366 : 365) + this.b.getMinimalDaysInFirstWeek());
            return jF >= ((long) iA) ? l(Chronology.from(temporalAccessor).date(temporalAccessor).plus(2L, (TemporalUnit) ChronoUnit.WEEKS)) : ValueRange.of(1L, iA - 1);
        }

        private int m(int i2, int i3) {
            int iFloorMod = Jdk8Methods.floorMod(i2 - i3, 7);
            return iFloorMod + 1 > this.b.getMinimalDaysInFirstWeek() ? 7 - iFloorMod : -iFloorMod;
        }

        @Override // org.threeten.bp.temporal.TemporalField
        public <R extends Temporal> R adjustInto(R r, long j2) {
            int iCheckValidIntValue = this.e.checkValidIntValue(j2, this);
            int i2 = r.get(this);
            if (iCheckValidIntValue == i2) {
                return r;
            }
            if (this.d != ChronoUnit.FOREVER) {
                return (R) r.plus(iCheckValidIntValue - i2, this.c);
            }
            int i3 = r.get(this.b.f);
            long j3 = (long) ((j2 - ((long) i2)) * 52.1775d);
            ChronoUnit chronoUnit = ChronoUnit.WEEKS;
            Temporal temporalPlus = r.plus(j3, chronoUnit);
            if (temporalPlus.get(this) > iCheckValidIntValue) {
                return (R) temporalPlus.minus(temporalPlus.get(this.b.f), chronoUnit);
            }
            if (temporalPlus.get(this) < iCheckValidIntValue) {
                temporalPlus = temporalPlus.plus(2L, chronoUnit);
            }
            R r2 = (R) temporalPlus.plus(i3 - temporalPlus.get(this.b.f), chronoUnit);
            return r2.get(this) > iCheckValidIntValue ? (R) r2.minus(1L, chronoUnit) : r2;
        }

        @Override // org.threeten.bp.temporal.TemporalField
        public TemporalUnit getBaseUnit() {
            return this.c;
        }

        @Override // org.threeten.bp.temporal.TemporalField
        public String getDisplayName(Locale locale) {
            Jdk8Methods.requireNonNull(locale, "locale");
            return this.d == ChronoUnit.YEARS ? "Week" : toString();
        }

        @Override // org.threeten.bp.temporal.TemporalField
        public long getFrom(TemporalAccessor temporalAccessor) {
            int iC;
            int iFloorMod = Jdk8Methods.floorMod(temporalAccessor.get(ChronoField.DAY_OF_WEEK) - this.b.getFirstDayOfWeek().getValue(), 7) + 1;
            TemporalUnit temporalUnit = this.d;
            if (temporalUnit == ChronoUnit.WEEKS) {
                return iFloorMod;
            }
            if (temporalUnit == ChronoUnit.MONTHS) {
                int i2 = temporalAccessor.get(ChronoField.DAY_OF_MONTH);
                iC = a(m(i2, iFloorMod), i2);
            } else if (temporalUnit == ChronoUnit.YEARS) {
                int i3 = temporalAccessor.get(ChronoField.DAY_OF_YEAR);
                iC = a(m(i3, iFloorMod), i3);
            } else if (temporalUnit == IsoFields.WEEK_BASED_YEARS) {
                iC = d(temporalAccessor);
            } else {
                if (temporalUnit != ChronoUnit.FOREVER) {
                    throw new IllegalStateException("unreachable");
                }
                iC = c(temporalAccessor);
            }
            return iC;
        }

        @Override // org.threeten.bp.temporal.TemporalField
        public TemporalUnit getRangeUnit() {
            return this.d;
        }

        @Override // org.threeten.bp.temporal.TemporalField
        public boolean isDateBased() {
            return true;
        }

        @Override // org.threeten.bp.temporal.TemporalField
        public boolean isSupportedBy(TemporalAccessor temporalAccessor) {
            if (!temporalAccessor.isSupported(ChronoField.DAY_OF_WEEK)) {
                return false;
            }
            TemporalUnit temporalUnit = this.d;
            if (temporalUnit == ChronoUnit.WEEKS) {
                return true;
            }
            if (temporalUnit == ChronoUnit.MONTHS) {
                return temporalAccessor.isSupported(ChronoField.DAY_OF_MONTH);
            }
            if (temporalUnit == ChronoUnit.YEARS) {
                return temporalAccessor.isSupported(ChronoField.DAY_OF_YEAR);
            }
            if (temporalUnit == IsoFields.WEEK_BASED_YEARS) {
                return temporalAccessor.isSupported(ChronoField.EPOCH_DAY);
            }
            if (temporalUnit == ChronoUnit.FOREVER) {
                return temporalAccessor.isSupported(ChronoField.EPOCH_DAY);
            }
            return false;
        }

        @Override // org.threeten.bp.temporal.TemporalField
        public boolean isTimeBased() {
            return false;
        }

        @Override // org.threeten.bp.temporal.TemporalField
        public ValueRange range() {
            return this.e;
        }

        @Override // org.threeten.bp.temporal.TemporalField
        public ValueRange rangeRefinedBy(TemporalAccessor temporalAccessor) {
            ChronoField chronoField;
            TemporalUnit temporalUnit = this.d;
            if (temporalUnit == ChronoUnit.WEEKS) {
                return this.e;
            }
            if (temporalUnit == ChronoUnit.MONTHS) {
                chronoField = ChronoField.DAY_OF_MONTH;
            } else {
                if (temporalUnit != ChronoUnit.YEARS) {
                    if (temporalUnit == IsoFields.WEEK_BASED_YEARS) {
                        return l(temporalAccessor);
                    }
                    if (temporalUnit == ChronoUnit.FOREVER) {
                        return temporalAccessor.range(ChronoField.YEAR);
                    }
                    throw new IllegalStateException("unreachable");
                }
                chronoField = ChronoField.DAY_OF_YEAR;
            }
            int iM = m(temporalAccessor.get(chronoField), Jdk8Methods.floorMod(temporalAccessor.get(ChronoField.DAY_OF_WEEK) - this.b.getFirstDayOfWeek().getValue(), 7) + 1);
            ValueRange valueRangeRange = temporalAccessor.range(chronoField);
            return ValueRange.of(a(iM, (int) valueRangeRange.getMinimum()), a(iM, (int) valueRangeRange.getMaximum()));
        }

        @Override // org.threeten.bp.temporal.TemporalField
        public TemporalAccessor resolve(Map<TemporalField, Long> map, TemporalAccessor temporalAccessor, ResolverStyle resolverStyle) {
            long j2;
            int iB;
            long jCheckValidIntValue;
            ChronoLocalDate chronoLocalDateDate;
            long jCheckValidIntValue2;
            ChronoLocalDate chronoLocalDateDate2;
            long jCheckValidIntValue3;
            int iB2;
            long jF;
            int value = this.b.getFirstDayOfWeek().getValue();
            if (this.d == ChronoUnit.WEEKS) {
                map.put(ChronoField.DAY_OF_WEEK, Long.valueOf(Jdk8Methods.floorMod((value - 1) + (this.e.checkValidIntValue(map.remove(this).longValue(), this) - 1), 7) + 1));
                return null;
            }
            ChronoField chronoField = ChronoField.DAY_OF_WEEK;
            if (!map.containsKey(chronoField)) {
                return null;
            }
            if (this.d == ChronoUnit.FOREVER) {
                if (!map.containsKey(this.b.f)) {
                    return null;
                }
                Chronology chronologyFrom = Chronology.from(temporalAccessor);
                int iFloorMod = Jdk8Methods.floorMod(chronoField.checkValidIntValue(map.get(chronoField).longValue()) - value, 7) + 1;
                int iCheckValidIntValue = range().checkValidIntValue(map.get(this).longValue(), this);
                if (resolverStyle == ResolverStyle.LENIENT) {
                    chronoLocalDateDate2 = chronologyFrom.date(iCheckValidIntValue, 1, this.b.getMinimalDaysInFirstWeek());
                    jCheckValidIntValue3 = map.get(this.b.f).longValue();
                    iB2 = b(chronoLocalDateDate2, value);
                    jF = f(chronoLocalDateDate2, iB2);
                } else {
                    chronoLocalDateDate2 = chronologyFrom.date(iCheckValidIntValue, 1, this.b.getMinimalDaysInFirstWeek());
                    jCheckValidIntValue3 = this.b.f.range().checkValidIntValue(map.get(this.b.f).longValue(), this.b.f);
                    iB2 = b(chronoLocalDateDate2, value);
                    jF = f(chronoLocalDateDate2, iB2);
                }
                ChronoLocalDate chronoLocalDatePlus = chronoLocalDateDate2.plus(((jCheckValidIntValue3 - jF) * 7) + ((long) (iFloorMod - iB2)), (TemporalUnit) ChronoUnit.DAYS);
                if (resolverStyle == ResolverStyle.STRICT && chronoLocalDatePlus.getLong(this) != map.get(this).longValue()) {
                    throw new DateTimeException("Strict mode rejected date parsed to a different year");
                }
                map.remove(this);
                map.remove(this.b.f);
                map.remove(chronoField);
                return chronoLocalDatePlus;
            }
            ChronoField chronoField2 = ChronoField.YEAR;
            if (!map.containsKey(chronoField2)) {
                return null;
            }
            int iFloorMod2 = Jdk8Methods.floorMod(chronoField.checkValidIntValue(map.get(chronoField).longValue()) - value, 7) + 1;
            int iCheckValidIntValue2 = chronoField2.checkValidIntValue(map.get(chronoField2).longValue());
            Chronology chronologyFrom2 = Chronology.from(temporalAccessor);
            TemporalUnit temporalUnit = this.d;
            ChronoUnit chronoUnit = ChronoUnit.MONTHS;
            if (temporalUnit != chronoUnit) {
                if (temporalUnit != ChronoUnit.YEARS) {
                    throw new IllegalStateException("unreachable");
                }
                long jLongValue = map.remove(this).longValue();
                ChronoLocalDate chronoLocalDateDate3 = chronologyFrom2.date(iCheckValidIntValue2, 1, 1);
                if (resolverStyle == ResolverStyle.LENIENT) {
                    iB = b(chronoLocalDateDate3, value);
                    jCheckValidIntValue = jLongValue - f(chronoLocalDateDate3, iB);
                    j2 = 7;
                } else {
                    j2 = 7;
                    iB = b(chronoLocalDateDate3, value);
                    jCheckValidIntValue = ((long) this.e.checkValidIntValue(jLongValue, this)) - f(chronoLocalDateDate3, iB);
                }
                ChronoLocalDate chronoLocalDatePlus2 = chronoLocalDateDate3.plus((jCheckValidIntValue * j2) + ((long) (iFloorMod2 - iB)), (TemporalUnit) ChronoUnit.DAYS);
                if (resolverStyle == ResolverStyle.STRICT && chronoLocalDatePlus2.getLong(chronoField2) != map.get(chronoField2).longValue()) {
                    throw new DateTimeException("Strict mode rejected date parsed to a different year");
                }
                map.remove(this);
                map.remove(chronoField2);
                map.remove(chronoField);
                return chronoLocalDatePlus2;
            }
            ChronoField chronoField3 = ChronoField.MONTH_OF_YEAR;
            if (!map.containsKey(chronoField3)) {
                return null;
            }
            long jLongValue2 = map.remove(this).longValue();
            if (resolverStyle == ResolverStyle.LENIENT) {
                chronoLocalDateDate = chronologyFrom2.date(iCheckValidIntValue2, 1, 1).plus(map.get(chronoField3).longValue() - 1, (TemporalUnit) chronoUnit);
                int iB3 = b(chronoLocalDateDate, value);
                jCheckValidIntValue2 = ((jLongValue2 - e(chronoLocalDateDate, iB3)) * 7) + ((long) (iFloorMod2 - iB3));
            } else {
                chronoLocalDateDate = chronologyFrom2.date(iCheckValidIntValue2, chronoField3.checkValidIntValue(map.get(chronoField3).longValue()), 8);
                int iB4 = b(chronoLocalDateDate, value);
                jCheckValidIntValue2 = ((long) (iFloorMod2 - iB4)) + ((((long) this.e.checkValidIntValue(jLongValue2, this)) - e(chronoLocalDateDate, iB4)) * 7);
            }
            ChronoLocalDate chronoLocalDatePlus3 = chronoLocalDateDate.plus(jCheckValidIntValue2, (TemporalUnit) ChronoUnit.DAYS);
            if (resolverStyle == ResolverStyle.STRICT && chronoLocalDatePlus3.getLong(chronoField3) != map.get(chronoField3).longValue()) {
                throw new DateTimeException("Strict mode rejected date parsed to a different month");
            }
            map.remove(this);
            map.remove(chronoField2);
            map.remove(chronoField3);
            map.remove(chronoField);
            return chronoLocalDatePlus3;
        }

        public String toString() {
            return this.a + "[" + this.b.toString() + "]";
        }
    }

    private WeekFields(DayOfWeek dayOfWeek, int i) {
        Jdk8Methods.requireNonNull(dayOfWeek, "firstDayOfWeek");
        if (i < 1 || i > 7) {
            throw new IllegalArgumentException("Minimal number of days is invalid");
        }
        this.a = dayOfWeek;
        this.b = i;
    }

    public static WeekFields of(Locale locale) {
        Jdk8Methods.requireNonNull(locale, "locale");
        GregorianCalendar gregorianCalendar = new GregorianCalendar(new Locale(locale.getLanguage(), locale.getCountry()));
        return of(DayOfWeek.SUNDAY.plus(gregorianCalendar.getFirstDayOfWeek() - 1), gregorianCalendar.getMinimalDaysInFirstWeek());
    }

    private Object readResolve() throws InvalidObjectException {
        try {
            return of(this.a, this.b);
        } catch (IllegalArgumentException e) {
            throw new InvalidObjectException("Invalid WeekFields" + e.getMessage());
        }
    }

    public TemporalField dayOfWeek() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof WeekFields) && hashCode() == obj.hashCode();
    }

    public DayOfWeek getFirstDayOfWeek() {
        return this.a;
    }

    public int getMinimalDaysInFirstWeek() {
        return this.b;
    }

    public int hashCode() {
        return (this.a.ordinal() * 7) + this.b;
    }

    public String toString() {
        return "WeekFields[" + this.a + ',' + this.b + JsonLexerKt.END_LIST;
    }

    public TemporalField weekBasedYear() {
        return this.g;
    }

    public TemporalField weekOfMonth() {
        return this.d;
    }

    public TemporalField weekOfWeekBasedYear() {
        return this.f;
    }

    public TemporalField weekOfYear() {
        return this.e;
    }

    public static WeekFields of(DayOfWeek dayOfWeek, int i) {
        String str = dayOfWeek.toString() + i;
        ConcurrentMap<String, WeekFields> concurrentMap = h;
        WeekFields weekFields = concurrentMap.get(str);
        if (weekFields != null) {
            return weekFields;
        }
        concurrentMap.putIfAbsent(str, new WeekFields(dayOfWeek, i));
        return concurrentMap.get(str);
    }
}
