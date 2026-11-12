package org.joda.time.chrono;

import ch.qos.logback.core.CoreConstants;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DurationField;
import org.joda.time.field.FieldUtils;
import org.joda.time.field.ImpreciseDateTimeField;

/* JADX INFO: loaded from: classes3.dex */
final class BasicWeekyearDateTimeField extends ImpreciseDateTimeField {
    private static final long WEEK_53 = 31449600000L;
    private static final long serialVersionUID = 6215066916806820644L;
    private final BasicChronology iChronology;

    public BasicWeekyearDateTimeField(BasicChronology basicChronology) {
        super(DateTimeFieldType.weekyear(), basicChronology.getAverageMillisPerYear());
        this.iChronology = basicChronology;
    }

    private Object readResolve() {
        return this.iChronology.weekyear();
    }

    @Override // org.joda.time.field.ImpreciseDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long add(long j8, int i14) {
        return i14 == 0 ? j8 : set(j8, get(j8) + i14);
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long addWrapField(long j8, int i14) {
        return add(j8, i14);
    }

    @Override // org.joda.time.field.ImpreciseDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public int get(long j8) {
        return this.iChronology.getWeekyear(j8);
    }

    @Override // org.joda.time.field.ImpreciseDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long getDifferenceAsLong(long j8, long j14) {
        if (j8 < j14) {
            return -getDifference(j14, j8);
        }
        int i14 = get(j8);
        int i15 = get(j14);
        long jRemainder = remainder(j8);
        long jRemainder2 = remainder(j14);
        if (jRemainder2 >= WEEK_53 && this.iChronology.getWeeksInYear(i14) <= 52) {
            jRemainder2 -= CoreConstants.MILLIS_IN_ONE_WEEK;
        }
        int i16 = i14 - i15;
        if (jRemainder < jRemainder2) {
            i16--;
        }
        return i16;
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public int getLeapAmount(long j8) {
        BasicChronology basicChronology = this.iChronology;
        return basicChronology.getWeeksInYear(basicChronology.getWeekyear(j8)) - 52;
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public DurationField getLeapDurationField() {
        return this.iChronology.weeks();
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public int getMaximumValue() {
        return this.iChronology.getMaxYear();
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public int getMinimumValue() {
        return this.iChronology.getMinYear();
    }

    @Override // org.joda.time.field.ImpreciseDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public DurationField getRangeDurationField() {
        return null;
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public boolean isLeap(long j8) {
        BasicChronology basicChronology = this.iChronology;
        return basicChronology.getWeeksInYear(basicChronology.getWeekyear(j8)) > 52;
    }

    @Override // org.joda.time.DateTimeField
    public boolean isLenient() {
        return false;
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long remainder(long j8) {
        return j8 - roundFloor(j8);
    }

    @Override // org.joda.time.field.ImpreciseDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long roundFloor(long j8) {
        long jRoundFloor = this.iChronology.weekOfWeekyear().roundFloor(j8);
        int weekOfWeekyear = this.iChronology.getWeekOfWeekyear(jRoundFloor);
        return weekOfWeekyear > 1 ? jRoundFloor - (((long) (weekOfWeekyear - 1)) * CoreConstants.MILLIS_IN_ONE_WEEK) : jRoundFloor;
    }

    @Override // org.joda.time.field.ImpreciseDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long set(long j8, int i14) {
        FieldUtils.verifyValueBounds(this, Math.abs(i14), this.iChronology.getMinYear(), this.iChronology.getMaxYear());
        int i15 = get(j8);
        if (i15 == i14) {
            return j8;
        }
        int dayOfWeek = this.iChronology.getDayOfWeek(j8);
        int weeksInYear = this.iChronology.getWeeksInYear(i15);
        int weeksInYear2 = this.iChronology.getWeeksInYear(i14);
        if (weeksInYear2 < weeksInYear) {
            weeksInYear = weeksInYear2;
        }
        int weekOfWeekyear = this.iChronology.getWeekOfWeekyear(j8);
        if (weekOfWeekyear <= weeksInYear) {
            weeksInYear = weekOfWeekyear;
        }
        long year = this.iChronology.setYear(j8, i14);
        int i16 = get(year);
        if (i16 < i14) {
            year += CoreConstants.MILLIS_IN_ONE_WEEK;
        } else if (i16 > i14) {
            year -= CoreConstants.MILLIS_IN_ONE_WEEK;
        }
        return this.iChronology.dayOfWeek().set((((long) (weeksInYear - this.iChronology.getWeekOfWeekyear(year))) * CoreConstants.MILLIS_IN_ONE_WEEK) + year, dayOfWeek);
    }

    @Override // org.joda.time.field.ImpreciseDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long add(long j8, long j14) {
        return add(j8, FieldUtils.safeToInt(j14));
    }
}
