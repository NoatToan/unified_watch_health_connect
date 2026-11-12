package org.threeten.bp;

import defpackage.c5p;
import defpackage.crd;
import defpackage.s4p;
import defpackage.xv3;
import defpackage.y4p;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.threeten.bp.chrono.IsoChronology;
import org.threeten.bp.chrono.b;
import org.threeten.bp.format.DateTimeParseException;
import org.threeten.bp.temporal.ChronoUnit;
import org.threeten.bp.temporal.UnsupportedTemporalTypeException;

/* JADX INFO: loaded from: classes3.dex */
public final class Period extends xv3 implements Serializable {
    private static final long serialVersionUID = -8290556941213247973L;
    private final int days;
    private final int months;
    private final int years;
    public static final Period ZERO = new Period(0, 0, 0);
    private static final Pattern PATTERN = Pattern.compile("([-+]?)P(?:([-+]?[0-9]+)Y)?(?:([-+]?[0-9]+)M)?(?:([-+]?[0-9]+)W)?(?:([-+]?[0-9]+)D)?", 2);

    private Period(int i, int i2, int i3) {
        this.years = i;
        this.months = i2;
        this.days = i3;
    }

    public static Period between(LocalDate localDate, LocalDate localDate2) {
        return localDate.until((org.threeten.bp.chrono.a) localDate2);
    }

    private static Period create(int i, int i2, int i3) {
        return ((i | i2) | i3) == 0 ? ZERO : new Period(i, i2, i3);
    }

    public static Period from(y4p y4pVar) {
        if (y4pVar instanceof Period) {
            return (Period) y4pVar;
        }
        if ((y4pVar instanceof xv3) && !IsoChronology.INSTANCE.equals(((xv3) y4pVar).getChronology())) {
            throw new DateTimeException("Period requires ISO chronology: " + y4pVar);
        }
        crd.i(y4pVar, "amount");
        int iQ = 0;
        int iQ2 = 0;
        int iQ3 = 0;
        for (c5p c5pVar : y4pVar.getUnits()) {
            long j = y4pVar.get(c5pVar);
            if (c5pVar == ChronoUnit.YEARS) {
                iQ = crd.q(j);
            } else if (c5pVar == ChronoUnit.MONTHS) {
                iQ2 = crd.q(j);
            } else {
                if (c5pVar != ChronoUnit.DAYS) {
                    throw new DateTimeException("Unit must be Years, Months or Days, but was " + c5pVar);
                }
                iQ3 = crd.q(j);
            }
        }
        return create(iQ, iQ2, iQ3);
    }

    public static Period of(int i, int i2, int i3) {
        return create(i, i2, i3);
    }

    public static Period ofDays(int i) {
        return create(0, 0, i);
    }

    public static Period ofMonths(int i) {
        return create(0, i, 0);
    }

    public static Period ofWeeks(int i) {
        return create(0, 0, crd.l(i, 7));
    }

    public static Period ofYears(int i) {
        return create(i, 0, 0);
    }

    public static Period parse(CharSequence charSequence) {
        crd.i(charSequence, "text");
        Matcher matcher = PATTERN.matcher(charSequence);
        if (matcher.matches()) {
            int i = "-".equals(matcher.group(1)) ? -1 : 1;
            String strGroup = matcher.group(2);
            String strGroup2 = matcher.group(3);
            String strGroup3 = matcher.group(4);
            String strGroup4 = matcher.group(5);
            if (strGroup != null || strGroup2 != null || strGroup3 != null || strGroup4 != null) {
                try {
                    return create(parseNumber(charSequence, strGroup, i), parseNumber(charSequence, strGroup2, i), crd.j(parseNumber(charSequence, strGroup4, i), crd.l(parseNumber(charSequence, strGroup3, i), 7)));
                } catch (NumberFormatException e) {
                    throw ((DateTimeParseException) new DateTimeParseException("Text cannot be parsed to a Period", charSequence, 0).initCause(e));
                }
            }
        }
        throw new DateTimeParseException("Text cannot be parsed to a Period", charSequence, 0);
    }

    private static int parseNumber(CharSequence charSequence, String str, int i) {
        if (str == null) {
            return 0;
        }
        try {
            return crd.l(Integer.parseInt(str), i);
        } catch (ArithmeticException e) {
            throw ((DateTimeParseException) new DateTimeParseException("Text cannot be parsed to a Period", charSequence, 0).initCause(e));
        }
    }

    private Object readResolve() {
        return ((this.years | this.months) | this.days) == 0 ? ZERO : this;
    }

    @Override // defpackage.xv3, defpackage.y4p
    public s4p addTo(s4p s4pVar) {
        crd.i(s4pVar, "temporal");
        int i = this.years;
        if (i != 0) {
            s4pVar = this.months != 0 ? s4pVar.plus(toTotalMonths(), ChronoUnit.MONTHS) : s4pVar.plus(i, ChronoUnit.YEARS);
        } else {
            int i2 = this.months;
            if (i2 != 0) {
                s4pVar = s4pVar.plus(i2, ChronoUnit.MONTHS);
            }
        }
        int i3 = this.days;
        return i3 != 0 ? s4pVar.plus(i3, ChronoUnit.DAYS) : s4pVar;
    }

    @Override // defpackage.xv3
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Period)) {
            return false;
        }
        Period period = (Period) obj;
        return this.years == period.years && this.months == period.months && this.days == period.days;
    }

    @Override // defpackage.xv3, defpackage.y4p
    public long get(c5p c5pVar) {
        int i;
        if (c5pVar == ChronoUnit.YEARS) {
            i = this.years;
        } else if (c5pVar == ChronoUnit.MONTHS) {
            i = this.months;
        } else {
            if (c5pVar != ChronoUnit.DAYS) {
                throw new UnsupportedTemporalTypeException("Unsupported unit: " + c5pVar);
            }
            i = this.days;
        }
        return i;
    }

    @Override // defpackage.xv3
    public b getChronology() {
        return IsoChronology.INSTANCE;
    }

    public int getDays() {
        return this.days;
    }

    public int getMonths() {
        return this.months;
    }

    @Override // defpackage.xv3, defpackage.y4p
    public List<c5p> getUnits() {
        return Collections.unmodifiableList(Arrays.asList(ChronoUnit.YEARS, ChronoUnit.MONTHS, ChronoUnit.DAYS));
    }

    public int getYears() {
        return this.years;
    }

    @Override // defpackage.xv3
    public int hashCode() {
        return this.years + Integer.rotateLeft(this.months, 8) + Integer.rotateLeft(this.days, 16);
    }

    @Override // defpackage.xv3
    public boolean isNegative() {
        return this.years < 0 || this.months < 0 || this.days < 0;
    }

    @Override // defpackage.xv3
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
        return j == 0 ? this : create(this.years, this.months, crd.q(crd.k(this.days, j)));
    }

    public Period plusMonths(long j) {
        return j == 0 ? this : create(this.years, crd.q(crd.k(this.months, j)), this.days);
    }

    public Period plusYears(long j) {
        return j == 0 ? this : create(crd.q(crd.k(this.years, j)), this.months, this.days);
    }

    @Override // defpackage.xv3, defpackage.y4p
    public s4p subtractFrom(s4p s4pVar) {
        crd.i(s4pVar, "temporal");
        int i = this.years;
        if (i != 0) {
            s4pVar = this.months != 0 ? s4pVar.minus(toTotalMonths(), ChronoUnit.MONTHS) : s4pVar.minus(i, ChronoUnit.YEARS);
        } else {
            int i2 = this.months;
            if (i2 != 0) {
                s4pVar = s4pVar.minus(i2, ChronoUnit.MONTHS);
            }
        }
        int i3 = this.days;
        return i3 != 0 ? s4pVar.minus(i3, ChronoUnit.DAYS) : s4pVar;
    }

    @Override // defpackage.xv3
    public String toString() {
        if (this == ZERO) {
            return "P0D";
        }
        StringBuilder sb = new StringBuilder();
        sb.append('P');
        int i = this.years;
        if (i != 0) {
            sb.append(i);
            sb.append('Y');
        }
        int i2 = this.months;
        if (i2 != 0) {
            sb.append(i2);
            sb.append('M');
        }
        int i3 = this.days;
        if (i3 != 0) {
            sb.append(i3);
            sb.append('D');
        }
        return sb.toString();
    }

    public long toTotalMonths() {
        return (((long) this.years) * 12) + ((long) this.months);
    }

    public Period withDays(int i) {
        return i == this.days ? this : create(this.years, this.months, i);
    }

    public Period withMonths(int i) {
        return i == this.months ? this : create(this.years, i, this.days);
    }

    public Period withYears(int i) {
        return i == this.years ? this : create(i, this.months, this.days);
    }

    @Override // defpackage.xv3
    public Period minus(y4p y4pVar) {
        Period periodFrom = from(y4pVar);
        return create(crd.o(this.years, periodFrom.years), crd.o(this.months, periodFrom.months), crd.o(this.days, periodFrom.days));
    }

    @Override // defpackage.xv3
    public Period multipliedBy(int i) {
        return (this == ZERO || i == 1) ? this : create(crd.l(this.years, i), crd.l(this.months, i), crd.l(this.days, i));
    }

    @Override // defpackage.xv3
    public Period negated() {
        return multipliedBy(-1);
    }

    @Override // defpackage.xv3
    public Period normalized() {
        long totalMonths = toTotalMonths();
        long j = totalMonths / 12;
        int i = (int) (totalMonths % 12);
        return (j == ((long) this.years) && i == this.months) ? this : create(crd.q(j), i, this.days);
    }

    @Override // defpackage.xv3
    public Period plus(y4p y4pVar) {
        Period periodFrom = from(y4pVar);
        return create(crd.j(this.years, periodFrom.years), crd.j(this.months, periodFrom.months), crd.j(this.days, periodFrom.days));
    }
}
