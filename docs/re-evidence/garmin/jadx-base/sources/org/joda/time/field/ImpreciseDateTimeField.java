package org.joda.time.field;

import org.joda.time.DateTimeFieldType;
import org.joda.time.DurationField;
import org.joda.time.DurationFieldType;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ImpreciseDateTimeField extends BaseDateTimeField {
    private static final long serialVersionUID = 7190739608550251860L;
    private final DurationField iDurationField;
    final long iUnitMillis;

    public ImpreciseDateTimeField(DateTimeFieldType dateTimeFieldType, long j8) {
        super(dateTimeFieldType);
        this.iUnitMillis = j8;
        this.iDurationField = new LinkedDurationField(dateTimeFieldType.getDurationType());
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public abstract long add(long j8, int i14);

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public abstract long add(long j8, long j14);

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public abstract int get(long j8);

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public int getDifference(long j8, long j14) {
        return FieldUtils.safeToInt(getDifferenceAsLong(j8, j14));
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long getDifferenceAsLong(long j8, long j14) {
        if (j8 < j14) {
            return -getDifferenceAsLong(j14, j8);
        }
        long j15 = (j8 - j14) / this.iUnitMillis;
        if (add(j14, j15) >= j8) {
            if (add(j14, j15) > j8) {
                do {
                    j15--;
                } while (add(j14, j15) > j8);
            }
            return j15;
        }
        while (true) {
            long j16 = j15 + 1;
            if (add(j14, j16) > j8) {
                return j15;
            }
            j15 = j16;
        }
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public final DurationField getDurationField() {
        return this.iDurationField;
    }

    public final long getDurationUnitMillis() {
        return this.iUnitMillis;
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public abstract DurationField getRangeDurationField();

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public abstract long roundFloor(long j8);

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public abstract long set(long j8, int i14);

    public final class LinkedDurationField extends BaseDurationField {
        private static final long serialVersionUID = -203813474600094134L;

        public LinkedDurationField(DurationFieldType durationFieldType) {
            super(durationFieldType);
        }

        @Override // org.joda.time.DurationField
        public long add(long j8, int i14) {
            return ImpreciseDateTimeField.this.add(j8, i14);
        }

        @Override // org.joda.time.field.BaseDurationField, org.joda.time.DurationField
        public int getDifference(long j8, long j14) {
            return ImpreciseDateTimeField.this.getDifference(j8, j14);
        }

        @Override // org.joda.time.DurationField
        public long getDifferenceAsLong(long j8, long j14) {
            return ImpreciseDateTimeField.this.getDifferenceAsLong(j8, j14);
        }

        @Override // org.joda.time.DurationField
        public long getMillis(int i14, long j8) {
            return ImpreciseDateTimeField.this.add(j8, i14) - j8;
        }

        @Override // org.joda.time.DurationField
        public long getUnitMillis() {
            return ImpreciseDateTimeField.this.iUnitMillis;
        }

        @Override // org.joda.time.field.BaseDurationField, org.joda.time.DurationField
        public int getValue(long j8, long j14) {
            return ImpreciseDateTimeField.this.getDifference(j8 + j14, j14);
        }

        @Override // org.joda.time.DurationField
        public long getValueAsLong(long j8, long j14) {
            return ImpreciseDateTimeField.this.getDifferenceAsLong(j8 + j14, j14);
        }

        @Override // org.joda.time.DurationField
        public boolean isPrecise() {
            return false;
        }

        @Override // org.joda.time.DurationField
        public long add(long j8, long j14) {
            return ImpreciseDateTimeField.this.add(j8, j14);
        }

        @Override // org.joda.time.DurationField
        public long getMillis(long j8, long j14) {
            return ImpreciseDateTimeField.this.add(j14, j8) - j14;
        }
    }
}
