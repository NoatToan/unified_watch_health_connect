package org.joda.time.chrono;

import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import org.joda.time.Chronology;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationField;
import org.joda.time.IllegalFieldValueException;
import org.joda.time.Instant;
import org.joda.time.LocalDate;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePartial;
import org.joda.time.field.BaseDateTimeField;
import org.joda.time.field.DecoratedDurationField;
import org.joda.time.format.ISODateTimeFormat;
import vb.h;

/* JADX INFO: loaded from: classes3.dex */
public final class GJChronology extends AssembledChronology {
    static final Instant DEFAULT_CUTOVER = new Instant(-12219292800000L);
    private static final ConcurrentHashMap<GJCacheKey, GJChronology> cCache = new ConcurrentHashMap<>();
    private static final long serialVersionUID = -2545574827706931671L;
    private Instant iCutoverInstant;
    private long iCutoverMillis;
    private long iGapDuration;
    private GregorianChronology iGregorianChronology;
    private JulianChronology iJulianChronology;

    private GJChronology(JulianChronology julianChronology, GregorianChronology gregorianChronology, Instant instant) {
        super(null, new Object[]{julianChronology, gregorianChronology, instant});
    }

    private static long convertByWeekyear(long j8, Chronology chronology, Chronology chronology2) {
        return chronology2.millisOfDay().set(chronology2.dayOfWeek().set(chronology2.weekOfWeekyear().set(chronology2.weekyear().set(0L, chronology.weekyear().get(j8)), chronology.weekOfWeekyear().get(j8)), chronology.dayOfWeek().get(j8)), chronology.millisOfDay().get(j8));
    }

    private static long convertByYear(long j8, Chronology chronology, Chronology chronology2) {
        return chronology2.getDateTimeMillis(chronology.year().get(j8), chronology.monthOfYear().get(j8), chronology.dayOfMonth().get(j8), chronology.millisOfDay().get(j8));
    }

    public static GJChronology getInstance(DateTimeZone dateTimeZone, ReadableInstant readableInstant, int i14) {
        Instant instant;
        DateTimeZone zone = DateTimeUtils.getZone(dateTimeZone);
        if (readableInstant == null) {
            instant = DEFAULT_CUTOVER;
        } else {
            instant = readableInstant.toInstant();
            if (new LocalDate(instant.getMillis(), GregorianChronology.getInstance(zone)).getYear() <= 0) {
                h.s("Cutover too early. Must be on or after 0001-01-01.");
                return null;
            }
        }
        GJCacheKey gJCacheKey = new GJCacheKey(zone, instant, i14);
        ConcurrentHashMap<GJCacheKey, GJChronology> concurrentHashMap = cCache;
        GJChronology gJChronology = concurrentHashMap.get(gJCacheKey);
        if (gJChronology == null) {
            DateTimeZone dateTimeZone2 = DateTimeZone.UTC;
            if (zone == dateTimeZone2) {
                gJChronology = new GJChronology(JulianChronology.getInstance(zone, i14), GregorianChronology.getInstance(zone, i14), instant);
            } else {
                GJChronology gJChronology2 = getInstance(dateTimeZone2, instant, i14);
                gJChronology = new GJChronology(ZonedChronology.getInstance(gJChronology2, zone), gJChronology2.iJulianChronology, gJChronology2.iGregorianChronology, gJChronology2.iCutoverInstant);
            }
            GJChronology gJChronologyPutIfAbsent = concurrentHashMap.putIfAbsent(gJCacheKey, gJChronology);
            if (gJChronologyPutIfAbsent != null) {
                return gJChronologyPutIfAbsent;
            }
        }
        return gJChronology;
    }

    public static GJChronology getInstanceUTC() {
        return getInstance(DateTimeZone.UTC, DEFAULT_CUTOVER, 4);
    }

    private Object readResolve() {
        return getInstance(getZone(), this.iCutoverInstant, getMinimumDaysInFirstWeek());
    }

    @Override // org.joda.time.chrono.AssembledChronology
    public void assemble(AssembledChronology.Fields fields) {
        Object[] objArr = (Object[]) getParam();
        JulianChronology julianChronology = (JulianChronology) objArr[0];
        GregorianChronology gregorianChronology = (GregorianChronology) objArr[1];
        Instant instant = (Instant) objArr[2];
        this.iCutoverMillis = instant.getMillis();
        this.iJulianChronology = julianChronology;
        this.iGregorianChronology = gregorianChronology;
        this.iCutoverInstant = instant;
        if (getBase() != null) {
            return;
        }
        if (julianChronology.getMinimumDaysInFirstWeek() != gregorianChronology.getMinimumDaysInFirstWeek()) {
            h.w();
            return;
        }
        long j8 = this.iCutoverMillis;
        this.iGapDuration = j8 - julianToGregorianByYear(j8);
        fields.copyFieldsFrom(gregorianChronology);
        if (gregorianChronology.millisOfDay().get(this.iCutoverMillis) == 0) {
            fields.millisOfSecond = new CutoverField(this, julianChronology.millisOfSecond(), fields.millisOfSecond, this.iCutoverMillis);
            fields.millisOfDay = new CutoverField(this, julianChronology.millisOfDay(), fields.millisOfDay, this.iCutoverMillis);
            fields.secondOfMinute = new CutoverField(this, julianChronology.secondOfMinute(), fields.secondOfMinute, this.iCutoverMillis);
            fields.secondOfDay = new CutoverField(this, julianChronology.secondOfDay(), fields.secondOfDay, this.iCutoverMillis);
            fields.minuteOfHour = new CutoverField(this, julianChronology.minuteOfHour(), fields.minuteOfHour, this.iCutoverMillis);
            fields.minuteOfDay = new CutoverField(this, julianChronology.minuteOfDay(), fields.minuteOfDay, this.iCutoverMillis);
            fields.hourOfDay = new CutoverField(this, julianChronology.hourOfDay(), fields.hourOfDay, this.iCutoverMillis);
            fields.hourOfHalfday = new CutoverField(this, julianChronology.hourOfHalfday(), fields.hourOfHalfday, this.iCutoverMillis);
            fields.clockhourOfDay = new CutoverField(this, julianChronology.clockhourOfDay(), fields.clockhourOfDay, this.iCutoverMillis);
            fields.clockhourOfHalfday = new CutoverField(this, julianChronology.clockhourOfHalfday(), fields.clockhourOfHalfday, this.iCutoverMillis);
            fields.halfdayOfDay = new CutoverField(this, julianChronology.halfdayOfDay(), fields.halfdayOfDay, this.iCutoverMillis);
        }
        fields.era = new CutoverField(this, julianChronology.era(), fields.era, this.iCutoverMillis);
        ImpreciseCutoverField impreciseCutoverField = new ImpreciseCutoverField(this, julianChronology.year(), fields.year, this.iCutoverMillis);
        fields.year = impreciseCutoverField;
        fields.years = impreciseCutoverField.getDurationField();
        fields.yearOfEra = new ImpreciseCutoverField(this, julianChronology.yearOfEra(), fields.yearOfEra, fields.years, this.iCutoverMillis);
        ImpreciseCutoverField impreciseCutoverField2 = new ImpreciseCutoverField(this, julianChronology.centuryOfEra(), fields.centuryOfEra, this.iCutoverMillis);
        fields.centuryOfEra = impreciseCutoverField2;
        fields.centuries = impreciseCutoverField2.getDurationField();
        fields.yearOfCentury = new ImpreciseCutoverField(this, julianChronology.yearOfCentury(), fields.yearOfCentury, fields.years, fields.centuries, this.iCutoverMillis);
        ImpreciseCutoverField impreciseCutoverField3 = new ImpreciseCutoverField(this, julianChronology.monthOfYear(), fields.monthOfYear, (DurationField) null, fields.years, this.iCutoverMillis);
        fields.monthOfYear = impreciseCutoverField3;
        fields.months = impreciseCutoverField3.getDurationField();
        ImpreciseCutoverField impreciseCutoverField4 = new ImpreciseCutoverField(julianChronology.weekyear(), fields.weekyear, (DurationField) null, this.iCutoverMillis, true);
        fields.weekyear = impreciseCutoverField4;
        fields.weekyears = impreciseCutoverField4.getDurationField();
        fields.weekyearOfCentury = new ImpreciseCutoverField(this, julianChronology.weekyearOfCentury(), fields.weekyearOfCentury, fields.weekyears, fields.centuries, this.iCutoverMillis);
        fields.dayOfYear = new CutoverField(julianChronology.dayOfYear(), fields.dayOfYear, fields.years, gregorianChronology.year().roundCeiling(this.iCutoverMillis), false);
        fields.weekOfWeekyear = new CutoverField(julianChronology.weekOfWeekyear(), fields.weekOfWeekyear, fields.weekyears, gregorianChronology.weekyear().roundCeiling(this.iCutoverMillis), true);
        CutoverField cutoverField = new CutoverField(this, julianChronology.dayOfMonth(), fields.dayOfMonth, this.iCutoverMillis);
        cutoverField.iRangeDurationField = fields.months;
        fields.dayOfMonth = cutoverField;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GJChronology) {
            GJChronology gJChronology = (GJChronology) obj;
            if (this.iCutoverMillis == gJChronology.iCutoverMillis && getMinimumDaysInFirstWeek() == gJChronology.getMinimumDaysInFirstWeek() && getZone().equals(gJChronology.getZone())) {
                return true;
            }
        }
        return false;
    }

    @Override // org.joda.time.chrono.AssembledChronology, org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
    public long getDateTimeMillis(int i14, int i15, int i16, int i17, int i18, int i19, int i24) {
        int i25;
        long dateTimeMillis;
        Chronology base = getBase();
        if (base != null) {
            return base.getDateTimeMillis(i14, i15, i16, i17, i18, i19, i24);
        }
        try {
            dateTimeMillis = this.iGregorianChronology.getDateTimeMillis(i14, i15, i16, i17, i18, i19, i24);
            i25 = i16;
        } catch (IllegalFieldValueException e4) {
            i25 = i16;
            if (i15 != 2 || i25 != 29) {
                throw e4;
            }
            long dateTimeMillis2 = this.iGregorianChronology.getDateTimeMillis(i14, i15, 28, i17, i18, i19, i24);
            if (dateTimeMillis2 >= this.iCutoverMillis) {
                throw e4;
            }
            dateTimeMillis = dateTimeMillis2;
        }
        if (dateTimeMillis >= this.iCutoverMillis) {
            return dateTimeMillis;
        }
        long dateTimeMillis3 = this.iJulianChronology.getDateTimeMillis(i14, i15, i25, i17, i18, i19, i24);
        if (dateTimeMillis3 < this.iCutoverMillis) {
            return dateTimeMillis3;
        }
        h.s("Specified date does not exist");
        return 0L;
    }

    public Instant getGregorianCutover() {
        return this.iCutoverInstant;
    }

    public int getMinimumDaysInFirstWeek() {
        return this.iGregorianChronology.getMinimumDaysInFirstWeek();
    }

    @Override // org.joda.time.chrono.AssembledChronology, org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
    public DateTimeZone getZone() {
        Chronology base = getBase();
        return base != null ? base.getZone() : DateTimeZone.UTC;
    }

    public long gregorianToJulianByWeekyear(long j8) {
        return convertByWeekyear(j8, this.iGregorianChronology, this.iJulianChronology);
    }

    public long gregorianToJulianByYear(long j8) {
        return convertByYear(j8, this.iGregorianChronology, this.iJulianChronology);
    }

    public int hashCode() {
        return this.iCutoverInstant.hashCode() + getMinimumDaysInFirstWeek() + getZone().hashCode() + 25025;
    }

    public long julianToGregorianByWeekyear(long j8) {
        return convertByWeekyear(j8, this.iJulianChronology, this.iGregorianChronology);
    }

    public long julianToGregorianByYear(long j8) {
        return convertByYear(j8, this.iJulianChronology, this.iGregorianChronology);
    }

    @Override // org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer(60);
        stringBuffer.append("GJChronology[");
        stringBuffer.append(getZone().getID());
        if (this.iCutoverMillis != DEFAULT_CUTOVER.getMillis()) {
            stringBuffer.append(",cutover=");
            (withUTC().dayOfYear().remainder(this.iCutoverMillis) == 0 ? ISODateTimeFormat.date() : ISODateTimeFormat.dateTime()).withChronology(withUTC()).printTo(stringBuffer, this.iCutoverMillis);
        }
        if (getMinimumDaysInFirstWeek() != 4) {
            stringBuffer.append(",mdfw=");
            stringBuffer.append(getMinimumDaysInFirstWeek());
        }
        stringBuffer.append(']');
        return stringBuffer.toString();
    }

    @Override // org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
    public Chronology withUTC() {
        return withZone(DateTimeZone.UTC);
    }

    @Override // org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
    public Chronology withZone(DateTimeZone dateTimeZone) {
        if (dateTimeZone == null) {
            dateTimeZone = DateTimeZone.getDefault();
        }
        return dateTimeZone == getZone() ? this : getInstance(dateTimeZone, this.iCutoverInstant, getMinimumDaysInFirstWeek());
    }

    public static class LinkedDurationField extends DecoratedDurationField {
        private static final long serialVersionUID = 4097975388007713084L;
        private final ImpreciseCutoverField iField;

        public LinkedDurationField(DurationField durationField, ImpreciseCutoverField impreciseCutoverField) {
            super(durationField, durationField.getType());
            this.iField = impreciseCutoverField;
        }

        @Override // org.joda.time.field.DecoratedDurationField, org.joda.time.DurationField
        public long add(long j8, int i14) {
            return this.iField.add(j8, i14);
        }

        @Override // org.joda.time.field.BaseDurationField, org.joda.time.DurationField
        public int getDifference(long j8, long j14) {
            return this.iField.getDifference(j8, j14);
        }

        @Override // org.joda.time.field.DecoratedDurationField, org.joda.time.DurationField
        public long getDifferenceAsLong(long j8, long j14) {
            return this.iField.getDifferenceAsLong(j8, j14);
        }

        @Override // org.joda.time.field.DecoratedDurationField, org.joda.time.DurationField
        public long add(long j8, long j14) {
            return this.iField.add(j8, j14);
        }
    }

    private GJChronology(Chronology chronology, JulianChronology julianChronology, GregorianChronology gregorianChronology, Instant instant) {
        super(chronology, new Object[]{julianChronology, gregorianChronology, instant});
    }

    public class CutoverField extends BaseDateTimeField {
        private static final long serialVersionUID = 3528501219481026402L;
        final boolean iConvertByWeekyear;
        final long iCutover;
        protected DurationField iDurationField;
        final DateTimeField iGregorianField;
        final DateTimeField iJulianField;
        protected DurationField iRangeDurationField;

        public CutoverField(DateTimeField dateTimeField, DateTimeField dateTimeField2, DurationField durationField, long j8, boolean z14) {
            super(dateTimeField2.getType());
            this.iJulianField = dateTimeField;
            this.iGregorianField = dateTimeField2;
            this.iCutover = j8;
            this.iConvertByWeekyear = z14;
            this.iDurationField = dateTimeField2.getDurationField();
            if (durationField == null && (durationField = dateTimeField2.getRangeDurationField()) == null) {
                durationField = dateTimeField.getRangeDurationField();
            }
            this.iRangeDurationField = durationField;
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public int[] add(ReadablePartial readablePartial, int i14, int[] iArr, int i15) {
            if (i15 == 0) {
                return iArr;
            }
            if (!DateTimeUtils.isContiguous(readablePartial)) {
                return super.add(readablePartial, i14, iArr, i15);
            }
            int size = readablePartial.size();
            long j8 = 0;
            for (int i16 = 0; i16 < size; i16++) {
                j8 = readablePartial.getFieldType(i16).getField(GJChronology.this).set(j8, iArr[i16]);
            }
            return GJChronology.this.get(readablePartial, add(j8, i15));
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public int get(long j8) {
            return j8 >= this.iCutover ? this.iGregorianField.get(j8) : this.iJulianField.get(j8);
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public String getAsShortText(long j8, Locale locale) {
            return j8 >= this.iCutover ? this.iGregorianField.getAsShortText(j8, locale) : this.iJulianField.getAsShortText(j8, locale);
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public String getAsText(long j8, Locale locale) {
            return j8 >= this.iCutover ? this.iGregorianField.getAsText(j8, locale) : this.iJulianField.getAsText(j8, locale);
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public int getDifference(long j8, long j14) {
            return this.iGregorianField.getDifference(j8, j14);
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public long getDifferenceAsLong(long j8, long j14) {
            return this.iGregorianField.getDifferenceAsLong(j8, j14);
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public DurationField getDurationField() {
            return this.iDurationField;
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public int getLeapAmount(long j8) {
            return j8 >= this.iCutover ? this.iGregorianField.getLeapAmount(j8) : this.iJulianField.getLeapAmount(j8);
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public DurationField getLeapDurationField() {
            return this.iGregorianField.getLeapDurationField();
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public int getMaximumShortTextLength(Locale locale) {
            return Math.max(this.iJulianField.getMaximumShortTextLength(locale), this.iGregorianField.getMaximumShortTextLength(locale));
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public int getMaximumTextLength(Locale locale) {
            return Math.max(this.iJulianField.getMaximumTextLength(locale), this.iGregorianField.getMaximumTextLength(locale));
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public int getMaximumValue(long j8) {
            if (j8 >= this.iCutover) {
                return this.iGregorianField.getMaximumValue(j8);
            }
            int maximumValue = this.iJulianField.getMaximumValue(j8);
            long j14 = this.iJulianField.set(j8, maximumValue);
            long j15 = this.iCutover;
            if (j14 < j15) {
                return maximumValue;
            }
            DateTimeField dateTimeField = this.iJulianField;
            return dateTimeField.get(dateTimeField.add(j15, -1));
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public int getMinimumValue(long j8) {
            if (j8 < this.iCutover) {
                return this.iJulianField.getMinimumValue(j8);
            }
            int minimumValue = this.iGregorianField.getMinimumValue(j8);
            long j14 = this.iGregorianField.set(j8, minimumValue);
            long j15 = this.iCutover;
            return j14 < j15 ? this.iGregorianField.get(j15) : minimumValue;
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public DurationField getRangeDurationField() {
            return this.iRangeDurationField;
        }

        public long gregorianToJulian(long j8) {
            boolean z14 = this.iConvertByWeekyear;
            GJChronology gJChronology = GJChronology.this;
            return z14 ? gJChronology.gregorianToJulianByWeekyear(j8) : gJChronology.gregorianToJulianByYear(j8);
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public boolean isLeap(long j8) {
            return j8 >= this.iCutover ? this.iGregorianField.isLeap(j8) : this.iJulianField.isLeap(j8);
        }

        @Override // org.joda.time.DateTimeField
        public boolean isLenient() {
            return false;
        }

        public long julianToGregorian(long j8) {
            boolean z14 = this.iConvertByWeekyear;
            GJChronology gJChronology = GJChronology.this;
            return z14 ? gJChronology.julianToGregorianByWeekyear(j8) : gJChronology.julianToGregorianByYear(j8);
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public long roundCeiling(long j8) {
            if (j8 >= this.iCutover) {
                return this.iGregorianField.roundCeiling(j8);
            }
            long jRoundCeiling = this.iJulianField.roundCeiling(j8);
            return (jRoundCeiling < this.iCutover || jRoundCeiling - GJChronology.this.iGapDuration < this.iCutover) ? jRoundCeiling : julianToGregorian(jRoundCeiling);
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public long roundFloor(long j8) {
            if (j8 < this.iCutover) {
                return this.iJulianField.roundFloor(j8);
            }
            long jRoundFloor = this.iGregorianField.roundFloor(j8);
            return (jRoundFloor >= this.iCutover || GJChronology.this.iGapDuration + jRoundFloor >= this.iCutover) ? jRoundFloor : gregorianToJulian(jRoundFloor);
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public long set(long j8, int i14) {
            if (j8 >= this.iCutover) {
                long jGregorianToJulian = this.iGregorianField.set(j8, i14);
                if (jGregorianToJulian >= this.iCutover) {
                    return jGregorianToJulian;
                }
                if (GJChronology.this.iGapDuration + jGregorianToJulian < this.iCutover) {
                    jGregorianToJulian = gregorianToJulian(jGregorianToJulian);
                }
                if (get(jGregorianToJulian) == i14) {
                    return jGregorianToJulian;
                }
                throw new IllegalFieldValueException(this.iGregorianField.getType(), Integer.valueOf(i14), (Number) null, (Number) null);
            }
            long jJulianToGregorian = this.iJulianField.set(j8, i14);
            if (jJulianToGregorian < this.iCutover) {
                return jJulianToGregorian;
            }
            if (jJulianToGregorian - GJChronology.this.iGapDuration >= this.iCutover) {
                jJulianToGregorian = julianToGregorian(jJulianToGregorian);
            }
            if (get(jJulianToGregorian) == i14) {
                return jJulianToGregorian;
            }
            throw new IllegalFieldValueException(this.iJulianField.getType(), Integer.valueOf(i14), (Number) null, (Number) null);
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public String getAsShortText(int i14, Locale locale) {
            return this.iGregorianField.getAsShortText(i14, locale);
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public String getAsText(int i14, Locale locale) {
            return this.iGregorianField.getAsText(i14, locale);
        }

        public CutoverField(GJChronology gJChronology, DateTimeField dateTimeField, DateTimeField dateTimeField2, long j8, boolean z14) {
            this(dateTimeField, dateTimeField2, null, j8, z14);
        }

        public CutoverField(GJChronology gJChronology, DateTimeField dateTimeField, DateTimeField dateTimeField2, long j8) {
            this(gJChronology, dateTimeField, dateTimeField2, j8, false);
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public int getMinimumValue(ReadablePartial readablePartial) {
            return this.iJulianField.getMinimumValue(readablePartial);
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public int getMinimumValue(ReadablePartial readablePartial, int[] iArr) {
            return this.iJulianField.getMinimumValue(readablePartial, iArr);
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public int getMinimumValue() {
            return this.iJulianField.getMinimumValue();
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public int getMaximumValue() {
            return this.iGregorianField.getMaximumValue();
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public int getMaximumValue(ReadablePartial readablePartial) {
            return getMaximumValue(GJChronology.getInstanceUTC().set(readablePartial, 0L));
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public int getMaximumValue(ReadablePartial readablePartial, int[] iArr) {
            GJChronology instanceUTC = GJChronology.getInstanceUTC();
            int size = readablePartial.size();
            long j8 = 0;
            for (int i14 = 0; i14 < size; i14++) {
                DateTimeField field = readablePartial.getFieldType(i14).getField(instanceUTC);
                if (iArr[i14] <= field.getMaximumValue(j8)) {
                    j8 = field.set(j8, iArr[i14]);
                }
            }
            return getMaximumValue(j8);
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public long add(long j8, long j14) {
            return this.iGregorianField.add(j8, j14);
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public long add(long j8, int i14) {
            return this.iGregorianField.add(j8, i14);
        }

        @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public long set(long j8, String str, Locale locale) {
            if (j8 >= this.iCutover) {
                long j14 = this.iGregorianField.set(j8, str, locale);
                return (j14 >= this.iCutover || GJChronology.this.iGapDuration + j14 >= this.iCutover) ? j14 : gregorianToJulian(j14);
            }
            long j15 = this.iJulianField.set(j8, str, locale);
            return (j15 < this.iCutover || j15 - GJChronology.this.iGapDuration < this.iCutover) ? j15 : julianToGregorian(j15);
        }
    }

    public final class ImpreciseCutoverField extends CutoverField {
        private static final long serialVersionUID = 3410248757173576441L;

        public ImpreciseCutoverField(DateTimeField dateTimeField, DateTimeField dateTimeField2, DurationField durationField, long j8, boolean z14) {
            super(GJChronology.this, dateTimeField, dateTimeField2, j8, z14);
            this.iDurationField = durationField == null ? new LinkedDurationField(this.iDurationField, this) : durationField;
        }

        @Override // org.joda.time.chrono.GJChronology.CutoverField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public long add(long j8, int i14) {
            if (j8 < this.iCutover) {
                long jAdd = this.iJulianField.add(j8, i14);
                return (jAdd < this.iCutover || jAdd - GJChronology.this.iGapDuration < this.iCutover) ? jAdd : julianToGregorian(jAdd);
            }
            long jAdd2 = this.iGregorianField.add(j8, i14);
            if (jAdd2 >= this.iCutover || GJChronology.this.iGapDuration + jAdd2 >= this.iCutover) {
                return jAdd2;
            }
            boolean z14 = this.iConvertByWeekyear;
            GJChronology gJChronology = GJChronology.this;
            if (z14) {
                if (gJChronology.iGregorianChronology.weekyear().get(jAdd2) <= 0) {
                    jAdd2 = GJChronology.this.iGregorianChronology.weekyear().add(jAdd2, -1);
                }
            } else if (gJChronology.iGregorianChronology.year().get(jAdd2) <= 0) {
                jAdd2 = GJChronology.this.iGregorianChronology.year().add(jAdd2, -1);
            }
            return gregorianToJulian(jAdd2);
        }

        @Override // org.joda.time.chrono.GJChronology.CutoverField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public int getDifference(long j8, long j14) {
            long j15 = this.iCutover;
            if (j8 >= j15) {
                if (j14 >= j15) {
                    return this.iGregorianField.getDifference(j8, j14);
                }
                return this.iJulianField.getDifference(gregorianToJulian(j8), j14);
            }
            if (j14 < j15) {
                return this.iJulianField.getDifference(j8, j14);
            }
            return this.iGregorianField.getDifference(julianToGregorian(j8), j14);
        }

        @Override // org.joda.time.chrono.GJChronology.CutoverField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public long getDifferenceAsLong(long j8, long j14) {
            long j15 = this.iCutover;
            if (j8 >= j15) {
                if (j14 >= j15) {
                    return this.iGregorianField.getDifferenceAsLong(j8, j14);
                }
                return this.iJulianField.getDifferenceAsLong(gregorianToJulian(j8), j14);
            }
            if (j14 < j15) {
                return this.iJulianField.getDifferenceAsLong(j8, j14);
            }
            return this.iGregorianField.getDifferenceAsLong(julianToGregorian(j8), j14);
        }

        @Override // org.joda.time.chrono.GJChronology.CutoverField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public int getMaximumValue(long j8) {
            return j8 >= this.iCutover ? this.iGregorianField.getMaximumValue(j8) : this.iJulianField.getMaximumValue(j8);
        }

        @Override // org.joda.time.chrono.GJChronology.CutoverField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public int getMinimumValue(long j8) {
            return j8 >= this.iCutover ? this.iGregorianField.getMinimumValue(j8) : this.iJulianField.getMinimumValue(j8);
        }

        public ImpreciseCutoverField(GJChronology gJChronology, DateTimeField dateTimeField, DateTimeField dateTimeField2, DurationField durationField, long j8) {
            this(dateTimeField, dateTimeField2, durationField, j8, false);
        }

        public ImpreciseCutoverField(GJChronology gJChronology, DateTimeField dateTimeField, DateTimeField dateTimeField2, DurationField durationField, DurationField durationField2, long j8) {
            this(dateTimeField, dateTimeField2, durationField, j8, false);
            this.iRangeDurationField = durationField2;
        }

        public ImpreciseCutoverField(GJChronology gJChronology, DateTimeField dateTimeField, DateTimeField dateTimeField2, long j8) {
            this(dateTimeField, dateTimeField2, (DurationField) null, j8, false);
        }

        @Override // org.joda.time.chrono.GJChronology.CutoverField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
        public long add(long j8, long j14) {
            if (j8 >= this.iCutover) {
                long jAdd = this.iGregorianField.add(j8, j14);
                if (jAdd >= this.iCutover || GJChronology.this.iGapDuration + jAdd >= this.iCutover) {
                    return jAdd;
                }
                boolean z14 = this.iConvertByWeekyear;
                GJChronology gJChronology = GJChronology.this;
                if (z14) {
                    if (gJChronology.iGregorianChronology.weekyear().get(jAdd) <= 0) {
                        jAdd = GJChronology.this.iGregorianChronology.weekyear().add(jAdd, -1);
                    }
                } else if (gJChronology.iGregorianChronology.year().get(jAdd) <= 0) {
                    jAdd = GJChronology.this.iGregorianChronology.year().add(jAdd, -1);
                }
                return gregorianToJulian(jAdd);
            }
            long jAdd2 = this.iJulianField.add(j8, j14);
            return (jAdd2 < this.iCutover || jAdd2 - GJChronology.this.iGapDuration < this.iCutover) ? jAdd2 : julianToGregorian(jAdd2);
        }
    }

    @Override // org.joda.time.chrono.AssembledChronology, org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
    public long getDateTimeMillis(int i14, int i15, int i16, int i17) {
        Chronology base = getBase();
        if (base != null) {
            return base.getDateTimeMillis(i14, i15, i16, i17);
        }
        long dateTimeMillis = this.iGregorianChronology.getDateTimeMillis(i14, i15, i16, i17);
        if (dateTimeMillis >= this.iCutoverMillis) {
            return dateTimeMillis;
        }
        long dateTimeMillis2 = this.iJulianChronology.getDateTimeMillis(i14, i15, i16, i17);
        if (dateTimeMillis2 < this.iCutoverMillis) {
            return dateTimeMillis2;
        }
        h.s("Specified date does not exist");
        return 0L;
    }

    public static GJChronology getInstance(DateTimeZone dateTimeZone) {
        return getInstance(dateTimeZone, DEFAULT_CUTOVER, 4);
    }

    public static GJChronology getInstance(DateTimeZone dateTimeZone, ReadableInstant readableInstant) {
        return getInstance(dateTimeZone, readableInstant, 4);
    }

    public static GJChronology getInstance() {
        return getInstance(DateTimeZone.getDefault(), DEFAULT_CUTOVER, 4);
    }

    public static GJChronology getInstance(DateTimeZone dateTimeZone, long j8, int i14) {
        return getInstance(dateTimeZone, j8 == DEFAULT_CUTOVER.getMillis() ? null : new Instant(j8), i14);
    }
}
