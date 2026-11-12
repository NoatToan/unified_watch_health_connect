package org.threeten.bp;

import com.xiaomi.mipush.sdk.Constants;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.threeten.bp.chrono.ChronoLocalDate;
import org.threeten.bp.chrono.ChronoPeriod;
import org.threeten.bp.chrono.Chronology;
import org.threeten.bp.chrono.IsoChronology;
import org.threeten.bp.format.DateTimeParseException;
import org.threeten.bp.jdk8.Jdk8Methods;
import org.threeten.bp.temporal.ChronoUnit;
import org.threeten.bp.temporal.Temporal;
import org.threeten.bp.temporal.TemporalAmount;
import org.threeten.bp.temporal.TemporalUnit;
import org.threeten.bp.temporal.UnsupportedTemporalTypeException;

/* JADX INFO: loaded from: classes23.dex */
public final class Period extends ChronoPeriod implements Serializable {
    public static final Period ZERO = new Period(0, 0, 0);
    private static final Pattern d = Pattern.compile("([-+]?)P(?:([-+]?[0-9]+)Y)?(?:([-+]?[0-9]+)M)?(?:([-+]?[0-9]+)W)?(?:([-+]?[0-9]+)D)?", 2);
    private static final long serialVersionUID = -8290556941213247973L;
    private final int a;
    private final int b;
    private final int c;

    private Period(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    private static Period a(int i, int i2, int i3) {
        return ((i | i2) | i3) == 0 ? ZERO : new Period(i, i2, i3);
    }

    private static int b(CharSequence charSequence, String str, int i) {
        if (str == null) {
            return 0;
        }
        try {
            return Jdk8Methods.safeMultiply(Integer.parseInt(str), i);
        } catch (ArithmeticException e) {
            throw ((DateTimeParseException) new DateTimeParseException("Text cannot be parsed to a Period", charSequence, 0).initCause(e));
        }
    }

    public static Period between(LocalDate localDate, LocalDate localDate2) {
        return localDate.until((ChronoLocalDate) localDate2);
    }

    public static Period from(TemporalAmount temporalAmount) {
        if (temporalAmount instanceof Period) {
            return (Period) temporalAmount;
        }
        if ((temporalAmount instanceof ChronoPeriod) && !IsoChronology.INSTANCE.equals(((ChronoPeriod) temporalAmount).getChronology())) {
            throw new DateTimeException("Period requires ISO chronology: " + temporalAmount);
        }
        Jdk8Methods.requireNonNull(temporalAmount, "amount");
        int iSafeToInt = 0;
        int iSafeToInt2 = 0;
        int iSafeToInt3 = 0;
        for (TemporalUnit temporalUnit : temporalAmount.getUnits()) {
            long j = temporalAmount.get(temporalUnit);
            if (temporalUnit == ChronoUnit.YEARS) {
                iSafeToInt = Jdk8Methods.safeToInt(j);
            } else if (temporalUnit == ChronoUnit.MONTHS) {
                iSafeToInt2 = Jdk8Methods.safeToInt(j);
            } else {
                if (temporalUnit != ChronoUnit.DAYS) {
                    throw new DateTimeException("Unit must be Years, Months or Days, but was " + temporalUnit);
                }
                iSafeToInt3 = Jdk8Methods.safeToInt(j);
            }
        }
        return a(iSafeToInt, iSafeToInt2, iSafeToInt3);
    }

    public static Period of(int i, int i2, int i3) {
        return a(i, i2, i3);
    }

    public static Period ofDays(int i) {
        return a(0, 0, i);
    }

    public static Period ofMonths(int i) {
        return a(0, i, 0);
    }

    public static Period ofWeeks(int i) {
        return a(0, 0, Jdk8Methods.safeMultiply(i, 7));
    }

    public static Period ofYears(int i) {
        return a(i, 0, 0);
    }

    public static Period parse(CharSequence charSequence) {
        Jdk8Methods.requireNonNull(charSequence, "text");
        Matcher matcher = d.matcher(charSequence);
        if (matcher.matches()) {
            int i = Constants.ACCEPT_TIME_SEPARATOR_SERVER.equals(matcher.group(1)) ? -1 : 1;
            String strGroup = matcher.group(2);
            String strGroup2 = matcher.group(3);
            String strGroup3 = matcher.group(4);
            String strGroup4 = matcher.group(5);
            if (strGroup != null || strGroup2 != null || strGroup3 != null || strGroup4 != null) {
                try {
                    return a(b(charSequence, strGroup, i), b(charSequence, strGroup2, i), Jdk8Methods.safeAdd(b(charSequence, strGroup4, i), Jdk8Methods.safeMultiply(b(charSequence, strGroup3, i), 7)));
                } catch (NumberFormatException e) {
                    throw ((DateTimeParseException) new DateTimeParseException("Text cannot be parsed to a Period", charSequence, 0).initCause(e));
                }
            }
        }
        throw new DateTimeParseException("Text cannot be parsed to a Period", charSequence, 0);
    }

    private Object readResolve() {
        return ((this.a | this.b) | this.c) == 0 ? ZERO : this;
    }

    @Override // org.threeten.bp.chrono.ChronoPeriod, org.threeten.bp.temporal.TemporalAmount
    public Temporal addTo(Temporal temporal) {
        Jdk8Methods.requireNonNull(temporal, "temporal");
        int i = this.a;
        if (i != 0) {
            temporal = this.b != 0 ? temporal.plus(toTotalMonths(), ChronoUnit.MONTHS) : temporal.plus(i, ChronoUnit.YEARS);
        } else {
            int i2 = this.b;
            if (i2 != 0) {
                temporal = temporal.plus(i2, ChronoUnit.MONTHS);
            }
        }
        int i3 = this.c;
        return i3 != 0 ? temporal.plus(i3, ChronoUnit.DAYS) : temporal;
    }

    @Override // org.threeten.bp.chrono.ChronoPeriod
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Period)) {
            return false;
        }
        Period period = (Period) obj;
        return this.a == period.a && this.b == period.b && this.c == period.c;
    }

    @Override // org.threeten.bp.chrono.ChronoPeriod, org.threeten.bp.temporal.TemporalAmount
    public long get(TemporalUnit temporalUnit) {
        int i;
        if (temporalUnit == ChronoUnit.YEARS) {
            i = this.a;
        } else if (temporalUnit == ChronoUnit.MONTHS) {
            i = this.b;
        } else {
            if (temporalUnit != ChronoUnit.DAYS) {
                throw new UnsupportedTemporalTypeException("Unsupported unit: " + temporalUnit);
            }
            i = this.c;
        }
        return i;
    }

    @Override // org.threeten.bp.chrono.ChronoPeriod
    public Chronology getChronology() {
        return IsoChronology.INSTANCE;
    }

    public int getDays() {
        return this.c;
    }

    public int getMonths() {
        return this.b;
    }

    @Override // org.threeten.bp.chrono.ChronoPeriod, org.threeten.bp.temporal.TemporalAmount
    public List<TemporalUnit> getUnits() {
        return Collections.unmodifiableList(Arrays.asList(ChronoUnit.YEARS, ChronoUnit.MONTHS, ChronoUnit.DAYS));
    }

    public int getYears() {
        return this.a;
    }

    @Override // org.threeten.bp.chrono.ChronoPeriod
    public int hashCode() {
        return this.a + Integer.rotateLeft(this.b, 8) + Integer.rotateLeft(this.c, 16);
    }

    @Override // org.threeten.bp.chrono.ChronoPeriod
    public boolean isNegative() {
        return this.a < 0 || this.b < 0 || this.c < 0;
    }

    @Override // org.threeten.bp.chrono.ChronoPeriod
    public boolean isZero() {
        return this == ZERO;
    }

    public Period minusDays(long j) {
        return j == Long.MIN_VALUE ? plusDays(Long.MAX_VALUE).plusDays(1L) : plusDays(-j);
    }

    public Period minusMonths(long j) {
        return j == Long.MIN_VALUE ? plusMonths(Long.MAX_VALUE).plusMonths(1L) : plusMonths(-j);
    }

    public Period minusYears(long j) {
        return j == Long.MIN_VALUE ? plusYears(Long.MAX_VALUE).plusYears(1L) : plusYears(-j);
    }

    public Period plusDays(long j) {
        return j == 0 ? this : a(this.a, this.b, Jdk8Methods.safeToInt(Jdk8Methods.safeAdd(this.c, j)));
    }

    public Period plusMonths(long j) {
        return j == 0 ? this : a(this.a, Jdk8Methods.safeToInt(Jdk8Methods.safeAdd(this.b, j)), this.c);
    }

    public Period plusYears(long j) {
        return j == 0 ? this : a(Jdk8Methods.safeToInt(Jdk8Methods.safeAdd(this.a, j)), this.b, this.c);
    }

    @Override // org.threeten.bp.chrono.ChronoPeriod, org.threeten.bp.temporal.TemporalAmount
    public Temporal subtractFrom(Temporal temporal) {
        Jdk8Methods.requireNonNull(temporal, "temporal");
        int i = this.a;
        if (i != 0) {
            temporal = this.b != 0 ? temporal.minus(toTotalMonths(), ChronoUnit.MONTHS) : temporal.minus(i, ChronoUnit.YEARS);
        } else {
            int i2 = this.b;
            if (i2 != 0) {
                temporal = temporal.minus(i2, ChronoUnit.MONTHS);
            }
        }
        int i3 = this.c;
        return i3 != 0 ? temporal.minus(i3, ChronoUnit.DAYS) : temporal;
    }

    @Override // org.threeten.bp.chrono.ChronoPeriod
    public String toString() {
        if (this == ZERO) {
            return "P0D";
        }
        StringBuilder sb = new StringBuilder();
        sb.append('P');
        int i = this.a;
        if (i != 0) {
            sb.append(i);
            sb.append('Y');
        }
        int i2 = this.b;
        if (i2 != 0) {
            sb.append(i2);
            sb.append('M');
        }
        int i3 = this.c;
        if (i3 != 0) {
            sb.append(i3);
            sb.append('D');
        }
        return sb.toString();
    }

    public long toTotalMonths() {
        return (((long) this.a) * 12) + ((long) this.b);
    }

    public Period withDays(int i) {
        return i == this.c ? this : a(this.a, this.b, i);
    }

    public Period withMonths(int i) {
        return i == this.b ? this : a(this.a, i, this.c);
    }

    public Period withYears(int i) {
        return i == this.a ? this : a(i, this.b, this.c);
    }

    @Override // org.threeten.bp.chrono.ChronoPeriod
    public Period minus(TemporalAmount temporalAmount) {
        Period periodFrom = from(temporalAmount);
        return a(Jdk8Methods.safeSubtract(this.a, periodFrom.a), Jdk8Methods.safeSubtract(this.b, periodFrom.b), Jdk8Methods.safeSubtract(this.c, periodFrom.c));
    }

    @Override // org.threeten.bp.chrono.ChronoPeriod
    public Period multipliedBy(int i) {
        return (this == ZERO || i == 1) ? this : a(Jdk8Methods.safeMultiply(this.a, i), Jdk8Methods.safeMultiply(this.b, i), Jdk8Methods.safeMultiply(this.c, i));
    }

    @Override // org.threeten.bp.chrono.ChronoPeriod
    public Period negated() {
        return multipliedBy(-1);
    }

    @Override // org.threeten.bp.chrono.ChronoPeriod
    public Period normalized() {
        long totalMonths = toTotalMonths();
        long j = totalMonths / 12;
        int i = (int) (totalMonths % 12);
        return (j == ((long) this.a) && i == this.b) ? this : a(Jdk8Methods.safeToInt(j), i, this.c);
    }

    @Override // org.threeten.bp.chrono.ChronoPeriod
    public Period plus(TemporalAmount temporalAmount) {
        Period periodFrom = from(temporalAmount);
        return a(Jdk8Methods.safeAdd(this.a, periodFrom.a), Jdk8Methods.safeAdd(this.b, periodFrom.b), Jdk8Methods.safeAdd(this.c, periodFrom.c));
    }
}
