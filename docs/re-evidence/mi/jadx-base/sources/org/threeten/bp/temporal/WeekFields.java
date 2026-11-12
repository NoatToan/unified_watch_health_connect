package org.threeten.bp.temporal;

import defpackage.c5p;
import defpackage.crd;
import defpackage.did;
import defpackage.s4p;
import defpackage.t4p;
import defpackage.z4p;
import java.io.InvalidObjectException;
import java.io.Serializable;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.threeten.bp.DateTimeException;
import org.threeten.bp.DayOfWeek;
import org.threeten.bp.Year;
import org.threeten.bp.chrono.b;
import org.threeten.bp.format.ResolverStyle;

/* JADX INFO: loaded from: classes3.dex */
public final class WeekFields implements Serializable {
    private static final ConcurrentMap<String, WeekFields> CACHE = new ConcurrentHashMap(4, 0.75f, 2);
    public static final WeekFields ISO = new WeekFields(DayOfWeek.MONDAY, 4);
    public static final WeekFields SUNDAY_START = of(DayOfWeek.SUNDAY, 1);
    private static final long serialVersionUID = -1177360819670808121L;
    private final DayOfWeek firstDayOfWeek;
    private final int minimalDays;
    private final transient z4p dayOfWeek = a.g(this);
    private final transient z4p weekOfMonth = a.i(this);
    private final transient z4p weekOfYear = a.k(this);
    private final transient z4p weekOfWeekBasedYear = a.j(this);
    private final transient z4p weekBasedYear = a.h(this);

    public static class a implements z4p {
        public static final ValueRange f = ValueRange.of(1, 7);
        public static final ValueRange g = ValueRange.of(0, 1, 4, 6);
        public static final ValueRange h = ValueRange.of(0, 1, 52, 54);
        public static final ValueRange i = ValueRange.of(1, 52, 53);
        public static final ValueRange j = ChronoField.YEAR.range();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f29618a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final WeekFields f29619b;
        public final c5p c;
        public final c5p d;
        public final ValueRange e;

        public a(String str, WeekFields weekFields, c5p c5pVar, c5p c5pVar2, ValueRange valueRange) {
            this.f29618a = str;
            this.f29619b = weekFields;
            this.c = c5pVar;
            this.d = c5pVar2;
            this.e = valueRange;
        }

        public static a g(WeekFields weekFields) {
            return new a("DayOfWeek", weekFields, ChronoUnit.DAYS, ChronoUnit.WEEKS, f);
        }

        public static a h(WeekFields weekFields) {
            return new a("WeekBasedYear", weekFields, did.e, ChronoUnit.FOREVER, j);
        }

        public static a i(WeekFields weekFields) {
            return new a("WeekOfMonth", weekFields, ChronoUnit.WEEKS, ChronoUnit.MONTHS, g);
        }

        public static a j(WeekFields weekFields) {
            return new a("WeekOfWeekBasedYear", weekFields, ChronoUnit.WEEKS, did.e, i);
        }

        public static a k(WeekFields weekFields) {
            return new a("WeekOfYear", weekFields, ChronoUnit.WEEKS, ChronoUnit.YEARS, h);
        }

        public final int a(int i2, int i3) {
            return ((i2 + 7) + (i3 - 1)) / 7;
        }

        @Override // defpackage.z4p
        public <R extends s4p> R adjustInto(R r2, long j2) {
            int iCheckValidIntValue = this.e.checkValidIntValue(j2, this);
            int i2 = r2.get(this);
            if (iCheckValidIntValue == i2) {
                return r2;
            }
            if (this.d != ChronoUnit.FOREVER) {
                return (R) r2.plus(iCheckValidIntValue - i2, this.c);
            }
            int i3 = r2.get(this.f29619b.weekOfWeekBasedYear);
            long j3 = (long) ((j2 - ((long) i2)) * 52.1775d);
            ChronoUnit chronoUnit = ChronoUnit.WEEKS;
            s4p s4pVarPlus = r2.plus(j3, chronoUnit);
            if (s4pVarPlus.get(this) > iCheckValidIntValue) {
                return (R) s4pVarPlus.minus(s4pVarPlus.get(this.f29619b.weekOfWeekBasedYear), chronoUnit);
            }
            if (s4pVarPlus.get(this) < iCheckValidIntValue) {
                s4pVarPlus = s4pVarPlus.plus(2L, chronoUnit);
            }
            R r3 = (R) s4pVarPlus.plus(i3 - s4pVarPlus.get(this.f29619b.weekOfWeekBasedYear), chronoUnit);
            return r3.get(this) > iCheckValidIntValue ? (R) r3.minus(1L, chronoUnit) : r3;
        }

        public final int b(t4p t4pVar, int i2) {
            return crd.f(t4pVar.get(ChronoField.DAY_OF_WEEK) - i2, 7) + 1;
        }

        public final int c(t4p t4pVar) {
            int iF = crd.f(t4pVar.get(ChronoField.DAY_OF_WEEK) - this.f29619b.getFirstDayOfWeek().getValue(), 7) + 1;
            int i2 = t4pVar.get(ChronoField.YEAR);
            long jF = f(t4pVar, iF);
            if (jF == 0) {
                return i2 - 1;
            }
            if (jF < 53) {
                return i2;
            }
            return jF >= ((long) a(m(t4pVar.get(ChronoField.DAY_OF_YEAR), iF), (Year.isLeap((long) i2) ? 366 : 365) + this.f29619b.getMinimalDaysInFirstWeek())) ? i2 + 1 : i2;
        }

        public final int d(t4p t4pVar) {
            int iF = crd.f(t4pVar.get(ChronoField.DAY_OF_WEEK) - this.f29619b.getFirstDayOfWeek().getValue(), 7) + 1;
            long jF = f(t4pVar, iF);
            if (jF == 0) {
                return ((int) f(b.from(t4pVar).date(t4pVar).minus(1L, (c5p) ChronoUnit.WEEKS), iF)) + 1;
            }
            if (jF >= 53) {
                int iA = a(m(t4pVar.get(ChronoField.DAY_OF_YEAR), iF), (Year.isLeap((long) t4pVar.get(ChronoField.YEAR)) ? 366 : 365) + this.f29619b.getMinimalDaysInFirstWeek());
                if (jF >= iA) {
                    return (int) (jF - ((long) (iA - 1)));
                }
            }
            return (int) jF;
        }

        public final long e(t4p t4pVar, int i2) {
            int i3 = t4pVar.get(ChronoField.DAY_OF_MONTH);
            return a(m(i3, i2), i3);
        }

        public final long f(t4p t4pVar, int i2) {
            int i3 = t4pVar.get(ChronoField.DAY_OF_YEAR);
            return a(m(i3, i2), i3);
        }

        @Override // defpackage.z4p
        public long getFrom(t4p t4pVar) {
            int iC;
            int iF = crd.f(t4pVar.get(ChronoField.DAY_OF_WEEK) - this.f29619b.getFirstDayOfWeek().getValue(), 7) + 1;
            c5p c5pVar = this.d;
            if (c5pVar == ChronoUnit.WEEKS) {
                return iF;
            }
            if (c5pVar == ChronoUnit.MONTHS) {
                int i2 = t4pVar.get(ChronoField.DAY_OF_MONTH);
                iC = a(m(i2, iF), i2);
            } else if (c5pVar == ChronoUnit.YEARS) {
                int i3 = t4pVar.get(ChronoField.DAY_OF_YEAR);
                iC = a(m(i3, iF), i3);
            } else if (c5pVar == did.e) {
                iC = d(t4pVar);
            } else {
                if (c5pVar != ChronoUnit.FOREVER) {
                    throw new IllegalStateException("unreachable");
                }
                iC = c(t4pVar);
            }
            return iC;
        }

        @Override // defpackage.z4p
        public boolean isDateBased() {
            return true;
        }

        @Override // defpackage.z4p
        public boolean isSupportedBy(t4p t4pVar) {
            if (!t4pVar.isSupported(ChronoField.DAY_OF_WEEK)) {
                return false;
            }
            c5p c5pVar = this.d;
            if (c5pVar == ChronoUnit.WEEKS) {
                return true;
            }
            if (c5pVar == ChronoUnit.MONTHS) {
                return t4pVar.isSupported(ChronoField.DAY_OF_MONTH);
            }
            if (c5pVar == ChronoUnit.YEARS) {
                return t4pVar.isSupported(ChronoField.DAY_OF_YEAR);
            }
            if (c5pVar == did.e || c5pVar == ChronoUnit.FOREVER) {
                return t4pVar.isSupported(ChronoField.EPOCH_DAY);
            }
            return false;
        }

        @Override // defpackage.z4p
        public boolean isTimeBased() {
            return false;
        }

        public final ValueRange l(t4p t4pVar) {
            int iF = crd.f(t4pVar.get(ChronoField.DAY_OF_WEEK) - this.f29619b.getFirstDayOfWeek().getValue(), 7) + 1;
            long jF = f(t4pVar, iF);
            if (jF == 0) {
                return l(b.from(t4pVar).date(t4pVar).minus(2L, (c5p) ChronoUnit.WEEKS));
            }
            int iA = a(m(t4pVar.get(ChronoField.DAY_OF_YEAR), iF), (Year.isLeap((long) t4pVar.get(ChronoField.YEAR)) ? 366 : 365) + this.f29619b.getMinimalDaysInFirstWeek());
            return jF >= ((long) iA) ? l(b.from(t4pVar).date(t4pVar).plus(2L, (c5p) ChronoUnit.WEEKS)) : ValueRange.of(1L, iA - 1);
        }

        public final int m(int i2, int i3) {
            int iF = crd.f(i2 - i3, 7);
            return iF + 1 > this.f29619b.getMinimalDaysInFirstWeek() ? 7 - iF : -iF;
        }

        @Override // defpackage.z4p
        public ValueRange range() {
            return this.e;
        }

        @Override // defpackage.z4p
        public ValueRange rangeRefinedBy(t4p t4pVar) {
            ChronoField chronoField;
            c5p c5pVar = this.d;
            if (c5pVar == ChronoUnit.WEEKS) {
                return this.e;
            }
            if (c5pVar == ChronoUnit.MONTHS) {
                chronoField = ChronoField.DAY_OF_MONTH;
            } else {
                if (c5pVar != ChronoUnit.YEARS) {
                    if (c5pVar == did.e) {
                        return l(t4pVar);
                    }
                    if (c5pVar == ChronoUnit.FOREVER) {
                        return t4pVar.range(ChronoField.YEAR);
                    }
                    throw new IllegalStateException("unreachable");
                }
                chronoField = ChronoField.DAY_OF_YEAR;
            }
            int iM = m(t4pVar.get(chronoField), crd.f(t4pVar.get(ChronoField.DAY_OF_WEEK) - this.f29619b.getFirstDayOfWeek().getValue(), 7) + 1);
            ValueRange valueRangeRange = t4pVar.range(chronoField);
            return ValueRange.of(a(iM, (int) valueRangeRange.getMinimum()), a(iM, (int) valueRangeRange.getMaximum()));
        }

        @Override // defpackage.z4p
        public t4p resolve(Map<z4p, Long> map, t4p t4pVar, ResolverStyle resolverStyle) {
            long j2;
            int iB;
            long jCheckValidIntValue;
            org.threeten.bp.chrono.a aVarDate;
            long jCheckValidIntValue2;
            org.threeten.bp.chrono.a aVarDate2;
            long jCheckValidIntValue3;
            int iB2;
            long jF;
            int value = this.f29619b.getFirstDayOfWeek().getValue();
            if (this.d == ChronoUnit.WEEKS) {
                map.put(ChronoField.DAY_OF_WEEK, Long.valueOf(crd.f((value - 1) + (this.e.checkValidIntValue(map.remove(this).longValue(), this) - 1), 7) + 1));
                return null;
            }
            ChronoField chronoField = ChronoField.DAY_OF_WEEK;
            if (!map.containsKey(chronoField)) {
                return null;
            }
            if (this.d == ChronoUnit.FOREVER) {
                if (!map.containsKey(this.f29619b.weekOfWeekBasedYear)) {
                    return null;
                }
                b bVarFrom = b.from(t4pVar);
                int iF = crd.f(chronoField.checkValidIntValue(map.get(chronoField).longValue()) - value, 7) + 1;
                int iCheckValidIntValue = range().checkValidIntValue(map.get(this).longValue(), this);
                if (resolverStyle == ResolverStyle.LENIENT) {
                    aVarDate2 = bVarFrom.date(iCheckValidIntValue, 1, this.f29619b.getMinimalDaysInFirstWeek());
                    jCheckValidIntValue3 = map.get(this.f29619b.weekOfWeekBasedYear).longValue();
                    iB2 = b(aVarDate2, value);
                    jF = f(aVarDate2, iB2);
                } else {
                    aVarDate2 = bVarFrom.date(iCheckValidIntValue, 1, this.f29619b.getMinimalDaysInFirstWeek());
                    jCheckValidIntValue3 = this.f29619b.weekOfWeekBasedYear.range().checkValidIntValue(map.get(this.f29619b.weekOfWeekBasedYear).longValue(), this.f29619b.weekOfWeekBasedYear);
                    iB2 = b(aVarDate2, value);
                    jF = f(aVarDate2, iB2);
                }
                org.threeten.bp.chrono.a aVarPlus = aVarDate2.plus(((jCheckValidIntValue3 - jF) * 7) + ((long) (iF - iB2)), (c5p) ChronoUnit.DAYS);
                if (resolverStyle == ResolverStyle.STRICT && aVarPlus.getLong(this) != map.get(this).longValue()) {
                    throw new DateTimeException("Strict mode rejected date parsed to a different year");
                }
                map.remove(this);
                map.remove(this.f29619b.weekOfWeekBasedYear);
                map.remove(chronoField);
                return aVarPlus;
            }
            ChronoField chronoField2 = ChronoField.YEAR;
            if (!map.containsKey(chronoField2)) {
                return null;
            }
            int iF2 = crd.f(chronoField.checkValidIntValue(map.get(chronoField).longValue()) - value, 7) + 1;
            int iCheckValidIntValue2 = chronoField2.checkValidIntValue(map.get(chronoField2).longValue());
            b bVarFrom2 = b.from(t4pVar);
            c5p c5pVar = this.d;
            ChronoUnit chronoUnit = ChronoUnit.MONTHS;
            if (c5pVar != chronoUnit) {
                if (c5pVar != ChronoUnit.YEARS) {
                    throw new IllegalStateException("unreachable");
                }
                long jLongValue = map.remove(this).longValue();
                org.threeten.bp.chrono.a aVarDate3 = bVarFrom2.date(iCheckValidIntValue2, 1, 1);
                if (resolverStyle == ResolverStyle.LENIENT) {
                    iB = b(aVarDate3, value);
                    jCheckValidIntValue = jLongValue - f(aVarDate3, iB);
                    j2 = 7;
                } else {
                    j2 = 7;
                    iB = b(aVarDate3, value);
                    jCheckValidIntValue = ((long) this.e.checkValidIntValue(jLongValue, this)) - f(aVarDate3, iB);
                }
                org.threeten.bp.chrono.a aVarPlus2 = aVarDate3.plus((jCheckValidIntValue * j2) + ((long) (iF2 - iB)), (c5p) ChronoUnit.DAYS);
                if (resolverStyle == ResolverStyle.STRICT && aVarPlus2.getLong(chronoField2) != map.get(chronoField2).longValue()) {
                    throw new DateTimeException("Strict mode rejected date parsed to a different year");
                }
                map.remove(this);
                map.remove(chronoField2);
                map.remove(chronoField);
                return aVarPlus2;
            }
            ChronoField chronoField3 = ChronoField.MONTH_OF_YEAR;
            if (!map.containsKey(chronoField3)) {
                return null;
            }
            long jLongValue2 = map.remove(this).longValue();
            if (resolverStyle == ResolverStyle.LENIENT) {
                aVarDate = bVarFrom2.date(iCheckValidIntValue2, 1, 1).plus(map.get(chronoField3).longValue() - 1, (c5p) chronoUnit);
                int iB3 = b(aVarDate, value);
                jCheckValidIntValue2 = ((jLongValue2 - e(aVarDate, iB3)) * 7) + ((long) (iF2 - iB3));
            } else {
                aVarDate = bVarFrom2.date(iCheckValidIntValue2, chronoField3.checkValidIntValue(map.get(chronoField3).longValue()), 8);
                int iB4 = b(aVarDate, value);
                jCheckValidIntValue2 = ((long) (iF2 - iB4)) + ((((long) this.e.checkValidIntValue(jLongValue2, this)) - e(aVarDate, iB4)) * 7);
            }
            org.threeten.bp.chrono.a aVarPlus3 = aVarDate.plus(jCheckValidIntValue2, (c5p) ChronoUnit.DAYS);
            if (resolverStyle == ResolverStyle.STRICT && aVarPlus3.getLong(chronoField3) != map.get(chronoField3).longValue()) {
                throw new DateTimeException("Strict mode rejected date parsed to a different month");
            }
            map.remove(this);
            map.remove(chronoField2);
            map.remove(chronoField3);
            map.remove(chronoField);
            return aVarPlus3;
        }

        public String toString() {
            return this.f29618a + "[" + this.f29619b.toString() + "]";
        }
    }

    private WeekFields(DayOfWeek dayOfWeek, int i) {
        crd.i(dayOfWeek, "firstDayOfWeek");
        if (i < 1 || i > 7) {
            throw new IllegalArgumentException("Minimal number of days is invalid");
        }
        this.firstDayOfWeek = dayOfWeek;
        this.minimalDays = i;
    }

    public static WeekFields of(Locale locale) {
        crd.i(locale, "locale");
        GregorianCalendar gregorianCalendar = new GregorianCalendar(new Locale(locale.getLanguage(), locale.getCountry()));
        return of(DayOfWeek.SUNDAY.plus(gregorianCalendar.getFirstDayOfWeek() - 1), gregorianCalendar.getMinimalDaysInFirstWeek());
    }

    private Object readResolve() throws InvalidObjectException {
        try {
            return of(this.firstDayOfWeek, this.minimalDays);
        } catch (IllegalArgumentException e) {
            throw new InvalidObjectException("Invalid WeekFields" + e.getMessage());
        }
    }

    public z4p dayOfWeek() {
        return this.dayOfWeek;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof WeekFields) && hashCode() == obj.hashCode();
    }

    public DayOfWeek getFirstDayOfWeek() {
        return this.firstDayOfWeek;
    }

    public int getMinimalDaysInFirstWeek() {
        return this.minimalDays;
    }

    public int hashCode() {
        return (this.firstDayOfWeek.ordinal() * 7) + this.minimalDays;
    }

    public String toString() {
        return "WeekFields[" + this.firstDayOfWeek + ',' + this.minimalDays + AbstractJsonLexerKt.END_LIST;
    }

    public z4p weekBasedYear() {
        return this.weekBasedYear;
    }

    public z4p weekOfMonth() {
        return this.weekOfMonth;
    }

    public z4p weekOfWeekBasedYear() {
        return this.weekOfWeekBasedYear;
    }

    public z4p weekOfYear() {
        return this.weekOfYear;
    }

    public static WeekFields of(DayOfWeek dayOfWeek, int i) {
        String str = dayOfWeek.toString() + i;
        ConcurrentMap<String, WeekFields> concurrentMap = CACHE;
        WeekFields weekFields = concurrentMap.get(str);
        if (weekFields != null) {
            return weekFields;
        }
        concurrentMap.putIfAbsent(str, new WeekFields(dayOfWeek, i));
        return concurrentMap.get(str);
    }
}
