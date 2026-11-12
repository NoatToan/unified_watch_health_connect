package org.joda.time.chrono;

import java.util.HashMap;
import java.util.Locale;
import org.apache.commons.lang3.e;
import org.joda.time.Chronology;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationField;
import org.joda.time.IllegalFieldValueException;
import org.joda.time.IllegalInstantException;
import org.joda.time.ReadablePartial;
import org.joda.time.field.BaseDateTimeField;
import org.joda.time.field.BaseDurationField;
import vb.h;

/* JADX INFO: loaded from: classes3.dex */
public final class ZonedChronology extends AssembledChronology {
    private static final long NEAR_ZERO = 604800000;
    private static final long serialVersionUID = -1079258847191166848L;

    private ZonedChronology(Chronology chronology, DateTimeZone dateTimeZone) {
        super(chronology, dateTimeZone);
    }

    private DateTimeField convertField(DateTimeField dateTimeField, HashMap<Object, Object> map) {
        if (dateTimeField == null || !dateTimeField.isSupported()) {
            return dateTimeField;
        }
        if (map.containsKey(dateTimeField)) {
            return (DateTimeField) map.get(dateTimeField);
        }
        ZonedDateTimeField zonedDateTimeField = new ZonedDateTimeField(dateTimeField, getZone(), convertField(dateTimeField.getDurationField(), map), convertField(dateTimeField.getRangeDurationField(), map), convertField(dateTimeField.getLeapDurationField(), map));
        map.put(dateTimeField, zonedDateTimeField);
        return zonedDateTimeField;
    }

    public static ZonedChronology getInstance(Chronology chronology, DateTimeZone dateTimeZone) {
        if (chronology == null) {
            h.s("Must supply a chronology");
            return null;
        }
        Chronology chronologyWithUTC = chronology.withUTC();
        if (chronologyWithUTC == null) {
            h.s("UTC chronology must not be null");
            return null;
        }
        if (dateTimeZone != null) {
            return new ZonedChronology(chronologyWithUTC, dateTimeZone);
        }
        h.s("DateTimeZone must not be null");
        return null;
    }

    private long localToUTC(long j8) {
        if (j8 == Long.MAX_VALUE) {
            return Long.MAX_VALUE;
        }
        if (j8 == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        DateTimeZone zone = getZone();
        int offsetFromLocal = zone.getOffsetFromLocal(j8);
        long j14 = j8 - ((long) offsetFromLocal);
        if (j8 > 604800000 && j14 < 0) {
            return Long.MAX_VALUE;
        }
        if (j8 < -604800000 && j14 > 0) {
            return Long.MIN_VALUE;
        }
        if (offsetFromLocal == zone.getOffset(j14)) {
            return j14;
        }
        throw new IllegalInstantException(j8, zone.getID());
    }

    public static boolean useTimeArithmetic(DurationField durationField) {
        return durationField != null && durationField.getUnitMillis() < 43200000;
    }

    @Override // org.joda.time.chrono.AssembledChronology
    public void assemble(AssembledChronology.Fields fields) {
        HashMap<Object, Object> map = new HashMap<>();
        fields.eras = convertField(fields.eras, map);
        fields.centuries = convertField(fields.centuries, map);
        fields.years = convertField(fields.years, map);
        fields.months = convertField(fields.months, map);
        fields.weekyears = convertField(fields.weekyears, map);
        fields.weeks = convertField(fields.weeks, map);
        fields.days = convertField(fields.days, map);
        fields.halfdays = convertField(fields.halfdays, map);
        fields.hours = convertField(fields.hours, map);
        fields.minutes = convertField(fields.minutes, map);
        fields.seconds = convertField(fields.seconds, map);
        fields.millis = convertField(fields.millis, map);
        fields.year = convertField(fields.year, map);
        fields.yearOfEra = convertField(fields.yearOfEra, map);
        fields.yearOfCentury = convertField(fields.yearOfCentury, map);
        fields.centuryOfEra = convertField(fields.centuryOfEra, map);
        fields.era = convertField(fields.era, map);
        fields.dayOfWeek = convertField(fields.dayOfWeek, map);
        fields.dayOfMonth = convertField(fields.dayOfMonth, map);
        fields.dayOfYear = convertField(fields.dayOfYear, map);
        fields.monthOfYear = convertField(fields.monthOfYear, map);
        fields.weekOfWeekyear = convertField(fields.weekOfWeekyear, map);
        fields.weekyear = convertField(fields.weekyear, map);
        fields.weekyearOfCentury = convertField(fields.weekyearOfCentury, map);
        fields.millisOfSecond = convertField(fields.millisOfSecond, map);
        fields.millisOfDay = convertField(fields.millisOfDay, map);
        fields.secondOfMinute = convertField(fields.secondOfMinute, map);
        fields.secondOfDay = convertField(fields.secondOfDay, map);
        fields.minuteOfHour = convertField(fields.minuteOfHour, map);
        fields.minuteOfDay = convertField(fields.minuteOfDay, map);
        fields.hourOfDay = convertField(fields.hourOfDay, map);
        fields.hourOfHalfday = convertField(fields.hourOfHalfday, map);
        fields.clockhourOfDay = convertField(fields.clockhourOfDay, map);
        fields.clockhourOfHalfday = convertField(fields.clockhourOfHalfday, map);
        fields.halfdayOfDay = convertField(fields.halfdayOfDay, map);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ZonedChronology)) {
            return false;
        }
        ZonedChronology zonedChronology = (ZonedChronology) obj;
        return getBase().equals(zonedChronology.getBase()) && getZone().equals(zonedChronology.getZone());
    }

    @Override // org.joda.time.chrono.AssembledChronology, org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
    public long getDateTimeMillis(long j8, int i14, int i15, int i16, int i17) {
        return localToUTC(getBase().getDateTimeMillis(((long) getZone().getOffset(j8)) + j8, i14, i15, i16, i17));
    }

    @Override // org.joda.time.chrono.AssembledChronology, org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
    public DateTimeZone getZone() {
        return (DateTimeZone) getParam();
    }

    public int hashCode() {
        return (getBase().hashCode() * 7) + (getZone().hashCode() * 11) + 326565;
    }

    @Override // org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
    public String toString() {
        return "ZonedChronology[" + getBase() + ", " + getZone().getID() + ']';
    }

    @Override // org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
    public Chronology withUTC() {
        return getBase();
    }

    @Override // org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
    public Chronology withZone(DateTimeZone dateTimeZone) {
        if (dateTimeZone == null) {
            dateTimeZone = DateTimeZone.getDefault();
        }
        if (dateTimeZone == getParam()) {
            return this;
        }
        return dateTimeZone == DateTimeZone.UTC ? getBase() : new ZonedChronology(getBase(), dateTimeZone);
    }

    public static class ZonedDurationField extends BaseDurationField {
        private static final long serialVersionUID = -485345310999208286L;
        final DurationField iField;
        final boolean iTimeField;
        final DateTimeZone iZone;

        public ZonedDurationField(DurationField durationField, DateTimeZone dateTimeZone) {
            super(durationField.getType());
            if (!durationField.isSupported()) {
                h.w();
                throw null;
            }
            this.iField = durationField;
            this.iTimeField = ZonedChronology.useTimeArithmetic(durationField);
            this.iZone = dateTimeZone;
        }

        private long addOffset(long j8) {
            return this.iZone.convertUTCToLocal(j8);
        }

        private int getOffsetFromLocalToSubtract(long j8) {
            int offsetFromLocal = this.iZone.getOffsetFromLocal(j8);
            long j14 = offsetFromLocal;
            if (((j8 - j14) ^ j8) >= 0 || (j8 ^ j14) >= 0) {
                return offsetFromLocal;
            }
            e.u("Subtracting time zone offset caused overflow");
            return 0;
        }

        private int getOffsetToAdd(long j8) {
            int offset = this.iZone.getOffset(j8);
            long j14 = offset;
            if (((j8 + j14) ^ j8) >= 0 || (j8 ^ j14) < 0) {
                return offset;
            }
            e.u("Adding time zone offset caused overflow");
            return 0;
        }

        @Override // org.joda.time.DurationField
        public long add(long j8, int i14) {
            int offsetToAdd = getOffsetToAdd(j8);
            long jAdd = this.iField.add(j8 + ((long) offsetToAdd), i14);
            if (!this.iTimeField) {
                offsetToAdd = getOffsetFromLocalToSubtract(jAdd);
            }
            return jAdd - ((long) offsetToAdd);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof ZonedDurationField) {
                ZonedDurationField zonedDurationField = (ZonedDurationField) obj;
                if (this.iField.equals(zonedDurationField.iField) && this.iZone.equals(zonedDurationField.iZone)) {
                    return true;
                }
            }
            return false;
        }

        @Override // org.joda.time.field.BaseDurationField, org.joda.time.DurationField
        public int getDifference(long j8, long j14) {
            int offsetToAdd = getOffsetToAdd(j14);
            return this.iField.getDifference(j8 + ((long) (this.iTimeField ? offsetToAdd : getOffsetToAdd(j8))), j14 + ((long) offsetToAdd));
        }

        @Override // org.joda.time.DurationField
        public long getDifferenceAsLong(long j8, long j14) {
            int offsetToAdd = getOffsetToAdd(j14);
            return this.iField.getDifferenceAsLong(j8 + ((long) (this.iTimeField ? offsetToAdd : getOffsetToAdd(j8))), j14 + ((long) offsetToAdd));
        }

        @Override // org.joda.time.DurationField
        public long getMillis(int i14, long j8) {
            return this.iField.getMillis(i14, addOffset(j8));
        }

        @Override // org.joda.time.DurationField
        public long getUnitMillis() {
            return this.iField.getUnitMillis();
        }

        @Override // org.joda.time.field.BaseDurationField, org.joda.time.DurationField
        public int getValue(long j8, long j14) {
            return this.iField.getValue(j8, addOffset(j14));
        }

        @Override // org.joda.time.DurationField
        public long getValueAsLong(long j8, long j14) {
            return this.iField.getValueAsLong(j8, addOffset(j14));
        }

        public int hashCode() {
            return this.iField.hashCode() ^ this.iZone.hashCode();
        }

        @Override // org.joda.time.DurationField
        public boolean isPrecise() {
            boolean z14 = this.iTimeField;
            DurationField durationField = this.iField;
            if (z14) {
                return durationField.isPrecise();
            }
            return durationField.isPrecise() && this.iZone.isFixed();
        }

        @Override // org.joda.time.DurationField
        public long getMillis(long j8, long j14) {
            return this.iField.getMillis(j8, addOffset(j14));
        }

        @Override // org.joda.time.DurationField
        public long add(long j8, long j14) {
            int offsetToAdd = getOffsetToAdd(j8);
            long jAdd = this.iField.add(j8 + ((long) offsetToAdd), j14);
            if (!this.iTimeField) {
                offsetToAdd = getOffsetFromLocalToSubtract(jAdd);
            }
            return jAdd - ((long) offsetToAdd);
        }
    }

    public static final class ZonedDateTimeField extends BaseDateTimeField {
        private static final long serialVersionUID = -3968986277775529794L;
        final DurationField iDurationField;
        final DateTimeField iField;
        final DurationField iLeapDurationField;
        final DurationField iRangeDurationField;
        final boolean iTimeField;
        final DateTimeZone iZone;

        public ZonedDateTimeField(DateTimeField dateTimeField, DateTimeZone dateTimeZone, DurationField durationField, DurationField durationField2, DurationField durationField3) {
            super(dateTimeField.getType());
            if (!dateTimeField.isSupported()) {
                h.w();
                throw null;
            }
            this.iField = dateTimeField;
            this.iZone = dateTimeZone;
            this.iDurationField = durationField;
            this.iTimeField = ZonedChronology.useTimeArithmetic(durationField);
            this.iRangeDurationField = durationField2;
            this.iLeapDurationField = durationField3;
        }

        private int getOffsetToAdd(long j8) {
            int offset = this.iZone.getOffset(j8);
            long j14 = offset;
            if (((j8 + j14) ^ j8) >= 0 || (j8 ^ j14) < 0) {
                return offset;
            }
            e.u("Adding time zone offset caused overflow");
            return 0;
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public long add(long j8, int i14) {
            if (this.iTimeField) {
                long offsetToAdd = getOffsetToAdd(j8);
                return this.iField.add(j8 + offsetToAdd, i14) - offsetToAdd;
            }
            return this.iZone.convertLocalToUTC(this.iField.add(this.iZone.convertUTCToLocal(j8), i14), false, j8);
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public long addWrapField(long j8, int i14) {
            if (this.iTimeField) {
                long offsetToAdd = getOffsetToAdd(j8);
                return this.iField.addWrapField(j8 + offsetToAdd, i14) - offsetToAdd;
            }
            return this.iZone.convertLocalToUTC(this.iField.addWrapField(this.iZone.convertUTCToLocal(j8), i14), false, j8);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof ZonedDateTimeField) {
                ZonedDateTimeField zonedDateTimeField = (ZonedDateTimeField) obj;
                if (this.iField.equals(zonedDateTimeField.iField) && this.iZone.equals(zonedDateTimeField.iZone) && this.iDurationField.equals(zonedDateTimeField.iDurationField) && this.iRangeDurationField.equals(zonedDateTimeField.iRangeDurationField)) {
                    return true;
                }
            }
            return false;
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public int get(long j8) {
            return this.iField.get(this.iZone.convertUTCToLocal(j8));
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public String getAsShortText(long j8, Locale locale) {
            return this.iField.getAsShortText(this.iZone.convertUTCToLocal(j8), locale);
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public String getAsText(long j8, Locale locale) {
            return this.iField.getAsText(this.iZone.convertUTCToLocal(j8), locale);
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public int getDifference(long j8, long j14) {
            int offsetToAdd = getOffsetToAdd(j14);
            return this.iField.getDifference(j8 + ((long) (this.iTimeField ? offsetToAdd : getOffsetToAdd(j8))), j14 + ((long) offsetToAdd));
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public long getDifferenceAsLong(long j8, long j14) {
            int offsetToAdd = getOffsetToAdd(j14);
            return this.iField.getDifferenceAsLong(j8 + ((long) (this.iTimeField ? offsetToAdd : getOffsetToAdd(j8))), j14 + ((long) offsetToAdd));
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public final DurationField getDurationField() {
            return this.iDurationField;
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public int getLeapAmount(long j8) {
            return this.iField.getLeapAmount(this.iZone.convertUTCToLocal(j8));
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public final DurationField getLeapDurationField() {
            return this.iLeapDurationField;
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public int getMaximumShortTextLength(Locale locale) {
            return this.iField.getMaximumShortTextLength(locale);
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public int getMaximumTextLength(Locale locale) {
            return this.iField.getMaximumTextLength(locale);
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public int getMaximumValue(long j8) {
            return this.iField.getMaximumValue(this.iZone.convertUTCToLocal(j8));
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public int getMinimumValue(long j8) {
            return this.iField.getMinimumValue(this.iZone.convertUTCToLocal(j8));
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public final DurationField getRangeDurationField() {
            return this.iRangeDurationField;
        }

        public int hashCode() {
            return this.iField.hashCode() ^ this.iZone.hashCode();
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public boolean isLeap(long j8) {
            return this.iField.isLeap(this.iZone.convertUTCToLocal(j8));
        }

        @Override // org.joda.time.DateTimeField
        public boolean isLenient() {
            return this.iField.isLenient();
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public long remainder(long j8) {
            return this.iField.remainder(this.iZone.convertUTCToLocal(j8));
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public long roundCeiling(long j8) {
            if (this.iTimeField) {
                long offsetToAdd = getOffsetToAdd(j8);
                return this.iField.roundCeiling(j8 + offsetToAdd) - offsetToAdd;
            }
            return this.iZone.convertLocalToUTC(this.iField.roundCeiling(this.iZone.convertUTCToLocal(j8)), false, j8);
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public long roundFloor(long j8) {
            if (this.iTimeField) {
                long offsetToAdd = getOffsetToAdd(j8);
                return this.iField.roundFloor(j8 + offsetToAdd) - offsetToAdd;
            }
            return this.iZone.convertLocalToUTC(this.iField.roundFloor(this.iZone.convertUTCToLocal(j8)), false, j8);
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public long set(long j8, int i14) {
            long j14 = this.iField.set(this.iZone.convertUTCToLocal(j8), i14);
            long jConvertLocalToUTC = this.iZone.convertLocalToUTC(j14, false, j8);
            if (get(jConvertLocalToUTC) == i14) {
                return jConvertLocalToUTC;
            }
            IllegalInstantException illegalInstantException = new IllegalInstantException(j14, this.iZone.getID());
            IllegalFieldValueException illegalFieldValueException = new IllegalFieldValueException(this.iField.getType(), Integer.valueOf(i14), illegalInstantException.getMessage());
            illegalFieldValueException.initCause(illegalInstantException);
            throw illegalFieldValueException;
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public String getAsShortText(int i14, Locale locale) {
            return this.iField.getAsShortText(i14, locale);
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public String getAsText(int i14, Locale locale) {
            return this.iField.getAsText(i14, locale);
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public int getMaximumValue() {
            return this.iField.getMaximumValue();
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public int getMinimumValue() {
            return this.iField.getMinimumValue();
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public int getMaximumValue(ReadablePartial readablePartial) {
            return this.iField.getMaximumValue(readablePartial);
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public int getMinimumValue(ReadablePartial readablePartial) {
            return this.iField.getMinimumValue(readablePartial);
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public int getMaximumValue(ReadablePartial readablePartial, int[] iArr) {
            return this.iField.getMaximumValue(readablePartial, iArr);
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public int getMinimumValue(ReadablePartial readablePartial, int[] iArr) {
            return this.iField.getMinimumValue(readablePartial, iArr);
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public long add(long j8, long j14) {
            if (this.iTimeField) {
                long offsetToAdd = getOffsetToAdd(j8);
                return this.iField.add(j8 + offsetToAdd, j14) - offsetToAdd;
            }
            return this.iZone.convertLocalToUTC(this.iField.add(this.iZone.convertUTCToLocal(j8), j14), false, j8);
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public long set(long j8, String str, Locale locale) {
            return this.iZone.convertLocalToUTC(this.iField.set(this.iZone.convertUTCToLocal(j8), str, locale), false, j8);
        }
    }

    @Override // org.joda.time.chrono.AssembledChronology, org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
    public long getDateTimeMillis(int i14, int i15, int i16, int i17, int i18, int i19, int i24) {
        return localToUTC(getBase().getDateTimeMillis(i14, i15, i16, i17, i18, i19, i24));
    }

    @Override // org.joda.time.chrono.AssembledChronology, org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
    public long getDateTimeMillis(int i14, int i15, int i16, int i17) {
        return localToUTC(getBase().getDateTimeMillis(i14, i15, i16, i17));
    }

    private DurationField convertField(DurationField durationField, HashMap<Object, Object> map) {
        if (durationField == null || !durationField.isSupported()) {
            return durationField;
        }
        if (map.containsKey(durationField)) {
            return (DurationField) map.get(durationField);
        }
        ZonedDurationField zonedDurationField = new ZonedDurationField(durationField, getZone());
        map.put(durationField, zonedDurationField);
        return zonedDurationField;
    }
}
