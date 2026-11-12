package org.joda.time.chrono;

import defpackage.bw3;
import defpackage.fl9;
import defpackage.gq5;
import defpackage.ogj;
import defpackage.qgj;
import defpackage.t67;
import java.io.Serializable;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationFieldType;
import org.joda.time.IllegalFieldValueException;
import org.joda.time.field.UnsupportedDateTimeField;
import org.joda.time.field.UnsupportedDurationField;

/* JADX INFO: loaded from: classes3.dex */
public abstract class BaseChronology extends bw3 implements Serializable {
    private static final long serialVersionUID = -7310865996721419676L;

    @Override // defpackage.bw3
    public long add(qgj qgjVar, long j, int i) {
        if (i != 0 && qgjVar != null) {
            int size = qgjVar.size();
            for (int i2 = 0; i2 < size; i2++) {
                long value = qgjVar.getValue(i2);
                if (value != 0) {
                    j = qgjVar.getFieldType(i2).getField(this).add(j, value * ((long) i));
                }
            }
        }
        return j;
    }

    @Override // defpackage.bw3
    public t67 centuries() {
        return UnsupportedDurationField.getInstance(DurationFieldType.centuries());
    }

    @Override // defpackage.bw3
    public gq5 centuryOfEra() {
        return UnsupportedDateTimeField.getInstance(DateTimeFieldType.centuryOfEra(), centuries());
    }

    @Override // defpackage.bw3
    public gq5 clockhourOfDay() {
        return UnsupportedDateTimeField.getInstance(DateTimeFieldType.clockhourOfDay(), hours());
    }

    @Override // defpackage.bw3
    public gq5 clockhourOfHalfday() {
        return UnsupportedDateTimeField.getInstance(DateTimeFieldType.clockhourOfHalfday(), hours());
    }

    @Override // defpackage.bw3
    public gq5 dayOfMonth() {
        return UnsupportedDateTimeField.getInstance(DateTimeFieldType.dayOfMonth(), days());
    }

    @Override // defpackage.bw3
    public gq5 dayOfWeek() {
        return UnsupportedDateTimeField.getInstance(DateTimeFieldType.dayOfWeek(), days());
    }

    @Override // defpackage.bw3
    public gq5 dayOfYear() {
        return UnsupportedDateTimeField.getInstance(DateTimeFieldType.dayOfYear(), days());
    }

    @Override // defpackage.bw3
    public t67 days() {
        return UnsupportedDurationField.getInstance(DurationFieldType.days());
    }

    @Override // defpackage.bw3
    public gq5 era() {
        return UnsupportedDateTimeField.getInstance(DateTimeFieldType.era(), eras());
    }

    @Override // defpackage.bw3
    public t67 eras() {
        return UnsupportedDurationField.getInstance(DurationFieldType.eras());
    }

    @Override // defpackage.bw3
    public int[] get(ogj ogjVar, long j) {
        int size = ogjVar.size();
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            iArr[i] = ogjVar.getFieldType(i).getField(this).get(j);
        }
        return iArr;
    }

    @Override // defpackage.bw3
    public long getDateTimeMillis(int i, int i2, int i3, int i4) throws IllegalArgumentException {
        return millisOfDay().set(dayOfMonth().set(monthOfYear().set(year().set(0L, i), i2), i3), i4);
    }

    @Override // defpackage.bw3
    public abstract DateTimeZone getZone();

    @Override // defpackage.bw3
    public gq5 halfdayOfDay() {
        return UnsupportedDateTimeField.getInstance(DateTimeFieldType.halfdayOfDay(), halfdays());
    }

    @Override // defpackage.bw3
    public t67 halfdays() {
        return UnsupportedDurationField.getInstance(DurationFieldType.halfdays());
    }

    @Override // defpackage.bw3
    public gq5 hourOfDay() {
        return UnsupportedDateTimeField.getInstance(DateTimeFieldType.hourOfDay(), hours());
    }

    @Override // defpackage.bw3
    public gq5 hourOfHalfday() {
        return UnsupportedDateTimeField.getInstance(DateTimeFieldType.hourOfHalfday(), hours());
    }

    @Override // defpackage.bw3
    public t67 hours() {
        return UnsupportedDurationField.getInstance(DurationFieldType.hours());
    }

    @Override // defpackage.bw3
    public t67 millis() {
        return UnsupportedDurationField.getInstance(DurationFieldType.millis());
    }

    @Override // defpackage.bw3
    public gq5 millisOfDay() {
        return UnsupportedDateTimeField.getInstance(DateTimeFieldType.millisOfDay(), millis());
    }

    @Override // defpackage.bw3
    public gq5 millisOfSecond() {
        return UnsupportedDateTimeField.getInstance(DateTimeFieldType.millisOfSecond(), millis());
    }

    @Override // defpackage.bw3
    public gq5 minuteOfDay() {
        return UnsupportedDateTimeField.getInstance(DateTimeFieldType.minuteOfDay(), minutes());
    }

    @Override // defpackage.bw3
    public gq5 minuteOfHour() {
        return UnsupportedDateTimeField.getInstance(DateTimeFieldType.minuteOfHour(), minutes());
    }

    @Override // defpackage.bw3
    public t67 minutes() {
        return UnsupportedDurationField.getInstance(DurationFieldType.minutes());
    }

    @Override // defpackage.bw3
    public gq5 monthOfYear() {
        return UnsupportedDateTimeField.getInstance(DateTimeFieldType.monthOfYear(), months());
    }

    @Override // defpackage.bw3
    public t67 months() {
        return UnsupportedDurationField.getInstance(DurationFieldType.months());
    }

    @Override // defpackage.bw3
    public gq5 secondOfDay() {
        return UnsupportedDateTimeField.getInstance(DateTimeFieldType.secondOfDay(), seconds());
    }

    @Override // defpackage.bw3
    public gq5 secondOfMinute() {
        return UnsupportedDateTimeField.getInstance(DateTimeFieldType.secondOfMinute(), seconds());
    }

    @Override // defpackage.bw3
    public t67 seconds() {
        return UnsupportedDurationField.getInstance(DurationFieldType.seconds());
    }

    @Override // defpackage.bw3
    public long set(ogj ogjVar, long j) {
        int size = ogjVar.size();
        for (int i = 0; i < size; i++) {
            j = ogjVar.getFieldType(i).getField(this).set(j, ogjVar.getValue(i));
        }
        return j;
    }

    @Override // defpackage.bw3
    public abstract String toString();

    @Override // defpackage.bw3
    public void validate(ogj ogjVar, int[] iArr) {
        int size = ogjVar.size();
        for (int i = 0; i < size; i++) {
            int i2 = iArr[i];
            gq5 field = ogjVar.getField(i);
            if (i2 < field.getMinimumValue()) {
                throw new IllegalFieldValueException(field.getType(), Integer.valueOf(i2), Integer.valueOf(field.getMinimumValue()), (Number) null);
            }
            if (i2 > field.getMaximumValue()) {
                throw new IllegalFieldValueException(field.getType(), Integer.valueOf(i2), (Number) null, Integer.valueOf(field.getMaximumValue()));
            }
        }
        for (int i3 = 0; i3 < size; i3++) {
            int i4 = iArr[i3];
            gq5 field2 = ogjVar.getField(i3);
            if (i4 < field2.getMinimumValue(ogjVar, iArr)) {
                throw new IllegalFieldValueException(field2.getType(), Integer.valueOf(i4), Integer.valueOf(field2.getMinimumValue(ogjVar, iArr)), (Number) null);
            }
            if (i4 > field2.getMaximumValue(ogjVar, iArr)) {
                throw new IllegalFieldValueException(field2.getType(), Integer.valueOf(i4), (Number) null, Integer.valueOf(field2.getMaximumValue(ogjVar, iArr)));
            }
        }
    }

    @Override // defpackage.bw3
    public gq5 weekOfWeekyear() {
        return UnsupportedDateTimeField.getInstance(DateTimeFieldType.weekOfWeekyear(), weeks());
    }

    @Override // defpackage.bw3
    public t67 weeks() {
        return UnsupportedDurationField.getInstance(DurationFieldType.weeks());
    }

    @Override // defpackage.bw3
    public gq5 weekyear() {
        return UnsupportedDateTimeField.getInstance(DateTimeFieldType.weekyear(), weekyears());
    }

    @Override // defpackage.bw3
    public gq5 weekyearOfCentury() {
        return UnsupportedDateTimeField.getInstance(DateTimeFieldType.weekyearOfCentury(), weekyears());
    }

    @Override // defpackage.bw3
    public t67 weekyears() {
        return UnsupportedDurationField.getInstance(DurationFieldType.weekyears());
    }

    @Override // defpackage.bw3
    public abstract bw3 withUTC();

    @Override // defpackage.bw3
    public abstract bw3 withZone(DateTimeZone dateTimeZone);

    @Override // defpackage.bw3
    public gq5 year() {
        return UnsupportedDateTimeField.getInstance(DateTimeFieldType.year(), years());
    }

    @Override // defpackage.bw3
    public gq5 yearOfCentury() {
        return UnsupportedDateTimeField.getInstance(DateTimeFieldType.yearOfCentury(), years());
    }

    @Override // defpackage.bw3
    public gq5 yearOfEra() {
        return UnsupportedDateTimeField.getInstance(DateTimeFieldType.yearOfEra(), years());
    }

    @Override // defpackage.bw3
    public t67 years() {
        return UnsupportedDurationField.getInstance(DurationFieldType.years());
    }

    @Override // defpackage.bw3
    public int[] get(qgj qgjVar, long j, long j2) {
        int size = qgjVar.size();
        int[] iArr = new int[size];
        if (j != j2) {
            for (int i = 0; i < size; i++) {
                t67 field = qgjVar.getFieldType(i).getField(this);
                int difference = field.getDifference(j2, j);
                if (difference != 0) {
                    j = field.add(j, difference);
                }
                iArr[i] = difference;
            }
        }
        return iArr;
    }

    @Override // defpackage.bw3
    public long add(long j, long j2, int i) {
        return (j2 == 0 || i == 0) ? j : fl9.e(j, fl9.i(j2, i));
    }

    @Override // defpackage.bw3
    public long getDateTimeMillis(int i, int i2, int i3, int i4, int i5, int i6, int i7) throws IllegalArgumentException {
        return millisOfSecond().set(secondOfMinute().set(minuteOfHour().set(hourOfDay().set(dayOfMonth().set(monthOfYear().set(year().set(0L, i), i2), i3), i4), i5), i6), i7);
    }

    @Override // defpackage.bw3
    public int[] get(qgj qgjVar, long j) {
        int size = qgjVar.size();
        int[] iArr = new int[size];
        long jAdd = 0;
        if (j != 0) {
            for (int i = 0; i < size; i++) {
                t67 field = qgjVar.getFieldType(i).getField(this);
                if (field.isPrecise()) {
                    int difference = field.getDifference(j, jAdd);
                    jAdd = field.add(jAdd, difference);
                    iArr[i] = difference;
                }
            }
        }
        return iArr;
    }

    @Override // defpackage.bw3
    public long getDateTimeMillis(long j, int i, int i2, int i3, int i4) throws IllegalArgumentException {
        return millisOfSecond().set(secondOfMinute().set(minuteOfHour().set(hourOfDay().set(j, i), i2), i3), i4);
    }
}
