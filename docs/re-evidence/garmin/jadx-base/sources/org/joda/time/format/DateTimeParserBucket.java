package org.joda.time.format;

import ch.qos.logback.core.CoreConstants;
import java.util.Arrays;
import java.util.Locale;
import org.joda.time.Chronology;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationField;
import org.joda.time.DurationFieldType;
import org.joda.time.IllegalFieldValueException;
import org.joda.time.IllegalInstantException;
import vb.h;

/* JADX INFO: loaded from: classes3.dex */
public class DateTimeParserBucket {
    private final Chronology iChrono;
    private final Integer iDefaultPivotYear;
    private final int iDefaultYear;
    private final DateTimeZone iDefaultZone;
    private final Locale iLocale;
    private final long iMillis;
    private Integer iOffset;
    private Integer iPivotYear;
    private SavedField[] iSavedFields;
    private int iSavedFieldsCount;
    private boolean iSavedFieldsShared;
    private Object iSavedState;
    private DateTimeZone iZone;

    public class SavedState {
        final Integer iOffset;
        final SavedField[] iSavedFields;
        final int iSavedFieldsCount;
        final DateTimeZone iZone;

        public SavedState() {
            this.iZone = DateTimeParserBucket.this.iZone;
            this.iOffset = DateTimeParserBucket.this.iOffset;
            this.iSavedFields = DateTimeParserBucket.this.iSavedFields;
            this.iSavedFieldsCount = DateTimeParserBucket.this.iSavedFieldsCount;
        }

        public boolean restoreState(DateTimeParserBucket dateTimeParserBucket) {
            if (dateTimeParserBucket != DateTimeParserBucket.this) {
                return false;
            }
            dateTimeParserBucket.iZone = this.iZone;
            dateTimeParserBucket.iOffset = this.iOffset;
            dateTimeParserBucket.iSavedFields = this.iSavedFields;
            if (this.iSavedFieldsCount < dateTimeParserBucket.iSavedFieldsCount) {
                dateTimeParserBucket.iSavedFieldsShared = true;
            }
            dateTimeParserBucket.iSavedFieldsCount = this.iSavedFieldsCount;
            return true;
        }
    }

    public DateTimeParserBucket(long j8, Chronology chronology, Locale locale, Integer num, int i14) {
        Chronology chronology2 = DateTimeUtils.getChronology(chronology);
        this.iMillis = j8;
        DateTimeZone zone = chronology2.getZone();
        this.iDefaultZone = zone;
        this.iChrono = chronology2.withUTC();
        this.iLocale = locale == null ? Locale.getDefault() : locale;
        this.iDefaultYear = i14;
        this.iDefaultPivotYear = num;
        this.iZone = zone;
        this.iPivotYear = num;
        this.iSavedFields = new SavedField[8];
    }

    public static int compareReverse(DurationField durationField, DurationField durationField2) {
        if (durationField == null || !durationField.isSupported()) {
            return (durationField2 == null || !durationField2.isSupported()) ? 0 : -1;
        }
        if (durationField2 == null || !durationField2.isSupported()) {
            return 1;
        }
        return -durationField.compareTo(durationField2);
    }

    private SavedField obtainSaveField() {
        SavedField[] savedFieldArr = this.iSavedFields;
        int i14 = this.iSavedFieldsCount;
        if (i14 == savedFieldArr.length || this.iSavedFieldsShared) {
            SavedField[] savedFieldArr2 = new SavedField[i14 == savedFieldArr.length ? i14 * 2 : savedFieldArr.length];
            System.arraycopy(savedFieldArr, 0, savedFieldArr2, 0, i14);
            this.iSavedFields = savedFieldArr2;
            this.iSavedFieldsShared = false;
            savedFieldArr = savedFieldArr2;
        }
        this.iSavedState = null;
        SavedField savedField = savedFieldArr[i14];
        if (savedField == null) {
            savedField = new SavedField();
            savedFieldArr[i14] = savedField;
        }
        this.iSavedFieldsCount = i14 + 1;
        return savedField;
    }

    private static void sort(SavedField[] savedFieldArr, int i14) {
        if (i14 > 10) {
            Arrays.sort(savedFieldArr, 0, i14);
            return;
        }
        for (int i15 = 0; i15 < i14; i15++) {
            for (int i16 = i15; i16 > 0; i16--) {
                int i17 = i16 - 1;
                if (savedFieldArr[i17].compareTo(savedFieldArr[i16]) <= 0) {
                    break;
                }
                SavedField savedField = savedFieldArr[i16];
                savedFieldArr[i16] = savedFieldArr[i17];
                savedFieldArr[i17] = savedField;
            }
        }
    }

    public long computeMillis(boolean z14, CharSequence charSequence) {
        SavedField[] savedFieldArr = this.iSavedFields;
        int i14 = this.iSavedFieldsCount;
        if (this.iSavedFieldsShared) {
            savedFieldArr = (SavedField[]) savedFieldArr.clone();
            this.iSavedFields = savedFieldArr;
            this.iSavedFieldsShared = false;
        }
        sort(savedFieldArr, i14);
        if (i14 > 0) {
            DurationField field = DurationFieldType.months().getField(this.iChrono);
            DurationField field2 = DurationFieldType.days().getField(this.iChrono);
            DurationField durationField = savedFieldArr[0].iField.getDurationField();
            if (compareReverse(durationField, field) >= 0 && compareReverse(durationField, field2) <= 0) {
                saveField(DateTimeFieldType.year(), this.iDefaultYear);
                return computeMillis(z14, charSequence);
            }
        }
        long j8 = this.iMillis;
        for (int i15 = 0; i15 < i14; i15++) {
            try {
                j8 = savedFieldArr[i15].set(j8, z14);
            } catch (IllegalFieldValueException e4) {
                if (charSequence != null) {
                    e4.prependMessage("Cannot parse \"" + ((Object) charSequence) + CoreConstants.DOUBLE_QUOTE_CHAR);
                }
                throw e4;
            }
        }
        if (z14) {
            int i16 = 0;
            while (i16 < i14) {
                if (!savedFieldArr[i16].iField.isLenient()) {
                    j8 = savedFieldArr[i16].set(j8, i16 == i14 + (-1));
                }
                i16++;
            }
        }
        Integer num = this.iOffset;
        if (num != null) {
            return j8 - ((long) num.intValue());
        }
        DateTimeZone dateTimeZone = this.iZone;
        if (dateTimeZone != null) {
            int offsetFromLocal = dateTimeZone.getOffsetFromLocal(j8);
            j8 -= (long) offsetFromLocal;
            if (offsetFromLocal != this.iZone.getOffset(j8)) {
                String str = "Illegal instant due to time zone offset transition (" + this.iZone + CoreConstants.RIGHT_PARENTHESIS_CHAR;
                if (charSequence != null) {
                    str = "Cannot parse \"" + ((Object) charSequence) + "\": " + str;
                }
                throw new IllegalInstantException(str);
            }
        }
        return j8;
    }

    public long doParseMillis(InternalParser internalParser, CharSequence charSequence) {
        int into = internalParser.parseInto(this, charSequence, 0);
        if (into < 0) {
            into = ~into;
        } else if (into >= charSequence.length()) {
            return computeMillis(true, charSequence);
        }
        h.s(FormatUtils.createErrorMessage(charSequence.toString(), into));
        return 0L;
    }

    public Chronology getChronology() {
        return this.iChrono;
    }

    public Locale getLocale() {
        return this.iLocale;
    }

    @Deprecated
    public int getOffset() {
        Integer num = this.iOffset;
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public Integer getOffsetInteger() {
        return this.iOffset;
    }

    public Integer getPivotYear() {
        return this.iPivotYear;
    }

    public DateTimeZone getZone() {
        return this.iZone;
    }

    public long parseMillis(DateTimeParser dateTimeParser, CharSequence charSequence) {
        reset();
        return doParseMillis(DateTimeParserInternalParser.of(dateTimeParser), charSequence);
    }

    public void reset() {
        this.iZone = this.iDefaultZone;
        this.iOffset = null;
        this.iPivotYear = this.iDefaultPivotYear;
        this.iSavedFieldsCount = 0;
        this.iSavedFieldsShared = false;
        this.iSavedState = null;
    }

    public boolean restoreState(Object obj) {
        if (!(obj instanceof SavedState) || !((SavedState) obj).restoreState(this)) {
            return false;
        }
        this.iSavedState = obj;
        return true;
    }

    public void saveField(DateTimeFieldType dateTimeFieldType, int i14) {
        obtainSaveField().init(dateTimeFieldType.getField(this.iChrono), i14);
    }

    public Object saveState() {
        if (this.iSavedState == null) {
            this.iSavedState = new SavedState();
        }
        return this.iSavedState;
    }

    @Deprecated
    public void setOffset(int i14) {
        this.iSavedState = null;
        this.iOffset = Integer.valueOf(i14);
    }

    @Deprecated
    public void setPivotYear(Integer num) {
        this.iPivotYear = num;
    }

    public void setZone(DateTimeZone dateTimeZone) {
        this.iSavedState = null;
        this.iZone = dateTimeZone;
    }

    public static class SavedField implements Comparable<SavedField> {
        DateTimeField iField;
        Locale iLocale;
        String iText;
        int iValue;

        @Override // java.lang.Comparable
        public int compareTo(SavedField savedField) {
            DateTimeField dateTimeField = savedField.iField;
            int iCompareReverse = DateTimeParserBucket.compareReverse(this.iField.getRangeDurationField(), dateTimeField.getRangeDurationField());
            return iCompareReverse != 0 ? iCompareReverse : DateTimeParserBucket.compareReverse(this.iField.getDurationField(), dateTimeField.getDurationField());
        }

        public void init(DateTimeField dateTimeField, int i14) {
            this.iField = dateTimeField;
            this.iValue = i14;
            this.iText = null;
            this.iLocale = null;
        }

        public long set(long j8, boolean z14) {
            String str = this.iText;
            DateTimeField dateTimeField = this.iField;
            long extended = str == null ? dateTimeField.setExtended(j8, this.iValue) : dateTimeField.set(j8, str, this.iLocale);
            return z14 ? this.iField.roundFloor(extended) : extended;
        }

        public void init(DateTimeField dateTimeField, String str, Locale locale) {
            this.iField = dateTimeField;
            this.iValue = 0;
            this.iText = str;
            this.iLocale = locale;
        }
    }

    public void setOffset(Integer num) {
        this.iSavedState = null;
        this.iOffset = num;
    }

    public void saveField(DateTimeField dateTimeField, int i14) {
        obtainSaveField().init(dateTimeField, i14);
    }

    public void saveField(DateTimeFieldType dateTimeFieldType, String str, Locale locale) {
        obtainSaveField().init(dateTimeFieldType.getField(this.iChrono), str, locale);
    }

    @Deprecated
    public DateTimeParserBucket(long j8, Chronology chronology, Locale locale, Integer num) {
        this(j8, chronology, locale, num, 2000);
    }

    @Deprecated
    public DateTimeParserBucket(long j8, Chronology chronology, Locale locale) {
        this(j8, chronology, locale, null, 2000);
    }

    public long computeMillis(boolean z14) {
        return computeMillis(z14, (CharSequence) null);
    }

    public long computeMillis(boolean z14, String str) {
        return computeMillis(z14, (CharSequence) str);
    }

    public long computeMillis() {
        return computeMillis(false, (CharSequence) null);
    }
}
