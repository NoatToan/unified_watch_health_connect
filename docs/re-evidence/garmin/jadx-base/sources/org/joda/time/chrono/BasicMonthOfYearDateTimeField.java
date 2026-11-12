package org.joda.time.chrono;

import org.apache.commons.lang3.e;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeUtils;
import org.joda.time.DurationField;
import org.joda.time.ReadablePartial;
import org.joda.time.field.FieldUtils;
import org.joda.time.field.ImpreciseDateTimeField;
import vb.h;

/* JADX INFO: loaded from: classes3.dex */
class BasicMonthOfYearDateTimeField extends ImpreciseDateTimeField {
    private static final int MIN = 1;
    private static final long serialVersionUID = -8258715387168736L;
    private final BasicChronology iChronology;
    private final int iLeapMonth;
    private final int iMax;

    public BasicMonthOfYearDateTimeField(BasicChronology basicChronology, int i14) {
        super(DateTimeFieldType.monthOfYear(), basicChronology.getAverageMillisPerMonth());
        this.iChronology = basicChronology;
        this.iMax = basicChronology.getMaxMonth();
        this.iLeapMonth = i14;
    }

    private Object readResolve() {
        return this.iChronology.monthOfYear();
    }

    @Override // org.joda.time.field.ImpreciseDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long add(long j8, long j14) {
        long j15;
        long j16;
        long j17;
        int i14 = (int) j14;
        if (i14 == j14) {
            return add(j8, i14);
        }
        long millisOfDay = this.iChronology.getMillisOfDay(j8);
        int year = this.iChronology.getYear(j8);
        int monthOfYear = this.iChronology.getMonthOfYear(j8, year);
        long j18 = ((long) (monthOfYear - 1)) + j14;
        int i15 = this.iMax;
        if (j18 >= 0) {
            j15 = millisOfDay;
            j17 = (j18 / ((long) i15)) + ((long) year);
            j16 = (j18 % ((long) i15)) + 1;
        } else {
            j15 = millisOfDay;
            long j19 = ((long) year) + (j18 / ((long) i15));
            long j24 = j19 - 1;
            long jAbs = Math.abs(j18);
            int i16 = this.iMax;
            int i17 = (int) (jAbs % ((long) i16));
            if (i17 == 0) {
                i17 = i16;
            }
            j16 = (i16 - i17) + 1;
            j17 = j16 == 1 ? j19 : j24;
        }
        if (j17 < this.iChronology.getMinYear() || j17 > this.iChronology.getMaxYear()) {
            h.s(e.e(j14, "Magnitude of add amount is too large: "));
            return 0L;
        }
        int i18 = (int) j17;
        int i19 = (int) j16;
        int dayOfMonth = this.iChronology.getDayOfMonth(j8, year, monthOfYear);
        int daysInYearMonth = this.iChronology.getDaysInYearMonth(i18, i19);
        if (dayOfMonth > daysInYearMonth) {
            dayOfMonth = daysInYearMonth;
        }
        return this.iChronology.getYearMonthDayMillis(i18, i19, dayOfMonth) + j15;
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long addWrapField(long j8, int i14) {
        return set(j8, FieldUtils.getWrappedValue(get(j8), i14, 1, this.iMax));
    }

    @Override // org.joda.time.field.ImpreciseDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public int get(long j8) {
        return this.iChronology.getMonthOfYear(j8);
    }

    @Override // org.joda.time.field.ImpreciseDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long getDifferenceAsLong(long j8, long j14) {
        if (j8 < j14) {
            return -getDifference(j14, j8);
        }
        int year = this.iChronology.getYear(j8);
        int monthOfYear = this.iChronology.getMonthOfYear(j8, year);
        int year2 = this.iChronology.getYear(j14);
        int monthOfYear2 = this.iChronology.getMonthOfYear(j14, year2);
        long j15 = ((((long) (year - year2)) * ((long) this.iMax)) + ((long) monthOfYear)) - ((long) monthOfYear2);
        int dayOfMonth = this.iChronology.getDayOfMonth(j8, year, monthOfYear);
        if (dayOfMonth == this.iChronology.getDaysInYearMonth(year, monthOfYear) && this.iChronology.getDayOfMonth(j14, year2, monthOfYear2) > dayOfMonth) {
            j14 = this.iChronology.dayOfMonth().set(j14, dayOfMonth);
        }
        return j8 - this.iChronology.getYearMonthMillis(year, monthOfYear) < j14 - this.iChronology.getYearMonthMillis(year2, monthOfYear2) ? j15 - 1 : j15;
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public int getLeapAmount(long j8) {
        return isLeap(j8) ? 1 : 0;
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public DurationField getLeapDurationField() {
        return this.iChronology.days();
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public int getMaximumValue() {
        return this.iMax;
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public int getMinimumValue() {
        return 1;
    }

    @Override // org.joda.time.field.ImpreciseDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public DurationField getRangeDurationField() {
        return this.iChronology.years();
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public boolean isLeap(long j8) {
        int year = this.iChronology.getYear(j8);
        return this.iChronology.isLeapYear(year) && this.iChronology.getMonthOfYear(j8, year) == this.iLeapMonth;
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
        int year = this.iChronology.getYear(j8);
        return this.iChronology.getYearMonthMillis(year, this.iChronology.getMonthOfYear(j8, year));
    }

    @Override // org.joda.time.field.ImpreciseDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long set(long j8, int i14) {
        FieldUtils.verifyValueBounds(this, i14, 1, this.iMax);
        int year = this.iChronology.getYear(j8);
        int dayOfMonth = this.iChronology.getDayOfMonth(j8, year);
        int daysInYearMonth = this.iChronology.getDaysInYearMonth(year, i14);
        if (dayOfMonth > daysInYearMonth) {
            dayOfMonth = daysInYearMonth;
        }
        return this.iChronology.getYearMonthDayMillis(year, i14, dayOfMonth) + ((long) this.iChronology.getMillisOfDay(j8));
    }

    @Override // org.joda.time.field.ImpreciseDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long add(long j8, int i14) {
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        if (i14 == 0) {
            return j8;
        }
        long millisOfDay = this.iChronology.getMillisOfDay(j8);
        int year = this.iChronology.getYear(j8);
        int monthOfYear = this.iChronology.getMonthOfYear(j8, year);
        int i24 = monthOfYear - 1;
        int i25 = i24 + i14;
        if (monthOfYear <= 0 || i25 >= 0) {
            i15 = year;
        } else {
            float fSignum = Math.signum(this.iMax + i14);
            float fSignum2 = Math.signum(i14);
            int i26 = this.iMax;
            if (fSignum == fSignum2) {
                i18 = year - 1;
                i19 = i14 + i26;
            } else {
                i18 = year + 1;
                i19 = i14 - i26;
            }
            int i27 = i18;
            i25 = i19 + i24;
            i15 = i27;
        }
        int i28 = this.iMax;
        if (i25 >= 0) {
            i16 = (i25 / i28) + i15;
            i17 = (i25 % i28) + 1;
        } else {
            i16 = (i25 / i28) + i15;
            int i29 = i16 - 1;
            int iAbs = Math.abs(i25);
            int i30 = this.iMax;
            int i34 = iAbs % i30;
            if (i34 == 0) {
                i34 = i30;
            }
            i17 = (i30 - i34) + 1;
            if (i17 != 1) {
                i16 = i29;
            }
        }
        int dayOfMonth = this.iChronology.getDayOfMonth(j8, year, monthOfYear);
        int daysInYearMonth = this.iChronology.getDaysInYearMonth(i16, i17);
        if (dayOfMonth > daysInYearMonth) {
            dayOfMonth = daysInYearMonth;
        }
        return this.iChronology.getYearMonthDayMillis(i16, i17, dayOfMonth) + millisOfDay;
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public int[] add(ReadablePartial readablePartial, int i14, int[] iArr, int i15) {
        if (i15 == 0) {
            return iArr;
        }
        if (readablePartial.size() > 0 && readablePartial.getFieldType(0).equals(DateTimeFieldType.monthOfYear()) && i14 == 0) {
            return set(readablePartial, 0, iArr, ((((i15 % 12) + (iArr[0] - 1)) + 12) % 12) + 1);
        }
        if (DateTimeUtils.isContiguous(readablePartial)) {
            int size = readablePartial.size();
            long j8 = 0;
            for (int i16 = 0; i16 < size; i16++) {
                j8 = readablePartial.getFieldType(i16).getField(this.iChronology).set(j8, iArr[i16]);
            }
            return this.iChronology.get(readablePartial, add(j8, i15));
        }
        return super.add(readablePartial, i14, iArr, i15);
    }
}
