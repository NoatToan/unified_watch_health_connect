package org.joda.time.format;

import am.j;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.spi.AbstractComponentTracker;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.MediaPeriodQueue;
import com.google.protobuf.a;
import i3.e5;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import okhttp3.internal.connection.RealConnection;
import org.apache.commons.lang3.e;
import org.joda.time.Chronology;
import org.joda.time.DateTimeConstants;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;
import org.joda.time.MutableDateTime;
import org.joda.time.ReadablePartial;
import org.joda.time.field.MillisDurationField;
import org.joda.time.field.PreciseDateTimeField;
import vb.h;

/* JADX INFO: loaded from: classes3.dex */
public class DateTimeFormatterBuilder {
    private ArrayList<Object> iElementPairs = new ArrayList<>();
    private Object iFormatter;

    public static class FixedNumber extends PaddedNumber {
        public FixedNumber(DateTimeFieldType dateTimeFieldType, int i14, boolean z14) {
            super(dateTimeFieldType, i14, z14, i14);
        }

        @Override // org.joda.time.format.DateTimeFormatterBuilder.NumberFormatter, org.joda.time.format.InternalParser
        public int parseInto(DateTimeParserBucket dateTimeParserBucket, CharSequence charSequence, int i14) {
            int i15;
            char cCharAt;
            int into = super.parseInto(dateTimeParserBucket, charSequence, i14);
            if (into < 0 || into == (i15 = this.iMaxParsedDigits + i14)) {
                return into;
            }
            if (this.iSigned && ((cCharAt = charSequence.charAt(i14)) == '-' || cCharAt == '+')) {
                i15++;
            }
            if (into > i15) {
                return ~(i15 + 1);
            }
            return into < i15 ? ~into : into;
        }
    }

    public static class MatchingParser implements InternalParser {
        private final int iParsedLengthEstimate;
        private final InternalParser[] iParsers;

        public MatchingParser(InternalParser[] internalParserArr) {
            int iEstimateParsedLength;
            this.iParsers = internalParserArr;
            int length = internalParserArr.length;
            int i14 = 0;
            while (true) {
                length--;
                if (length < 0) {
                    this.iParsedLengthEstimate = i14;
                    return;
                }
                InternalParser internalParser = internalParserArr[length];
                if (internalParser != null && (iEstimateParsedLength = internalParser.estimateParsedLength()) > i14) {
                    i14 = iEstimateParsedLength;
                }
            }
        }

        @Override // org.joda.time.format.InternalParser
        public int estimateParsedLength() {
            return this.iParsedLengthEstimate;
        }

        @Override // org.joda.time.format.InternalParser
        public int parseInto(DateTimeParserBucket dateTimeParserBucket, CharSequence charSequence, int i14) {
            int i15;
            int i16;
            InternalParser[] internalParserArr = this.iParsers;
            int length = internalParserArr.length;
            Object objSaveState = dateTimeParserBucket.saveState();
            boolean z14 = false;
            Object objSaveState2 = null;
            int i17 = i14;
            int i18 = i17;
            for (int i19 = 0; i19 < length; i19++) {
                InternalParser internalParser = internalParserArr[i19];
                if (internalParser == null) {
                    if (i17 > i14) {
                        z14 = true;
                        break;
                    }
                    return i14;
                }
                int into = internalParser.parseInto(dateTimeParserBucket, charSequence, i14);
                if (into >= i14) {
                    if (into <= i17) {
                        continue;
                    } else {
                        if (into >= charSequence.length() || (i16 = i19 + 1) >= length || internalParserArr[i16] == null) {
                            return into;
                        }
                        objSaveState2 = dateTimeParserBucket.saveState();
                        i17 = into;
                    }
                } else if (into < 0 && (i15 = ~into) > i18) {
                    i18 = i15;
                }
                dateTimeParserBucket.restoreState(objSaveState);
            }
            if (i17 <= i14 && (i17 != i14 || !z14)) {
                return ~i18;
            }
            if (objSaveState2 != null) {
                dateTimeParserBucket.restoreState(objSaveState2);
            }
            return i17;
        }
    }

    public static abstract class NumberFormatter implements InternalPrinter, InternalParser {
        protected final DateTimeFieldType iFieldType;
        protected final int iMaxParsedDigits;
        protected final boolean iSigned;

        public NumberFormatter(DateTimeFieldType dateTimeFieldType, int i14, boolean z14) {
            this.iFieldType = dateTimeFieldType;
            this.iMaxParsedDigits = i14;
            this.iSigned = z14;
        }

        @Override // org.joda.time.format.InternalParser
        public int estimateParsedLength() {
            return this.iMaxParsedDigits;
        }

        public int parseInto(DateTimeParserBucket dateTimeParserBucket, CharSequence charSequence, int i14) {
            int i15;
            int i16;
            char cCharAt;
            int iMin = Math.min(this.iMaxParsedDigits, charSequence.length() - i14);
            int i17 = 0;
            boolean z14 = false;
            boolean z15 = false;
            while (i17 < iMin) {
                int i18 = i14 + i17;
                char cCharAt2 = charSequence.charAt(i18);
                if (i17 == 0 && ((cCharAt2 == '-' || cCharAt2 == '+') && this.iSigned)) {
                    boolean z16 = cCharAt2 == '-';
                    boolean z17 = cCharAt2 == '+';
                    int i19 = i17 + 1;
                    if (i19 >= iMin || (cCharAt = charSequence.charAt(i18 + 1)) < '0' || cCharAt > '9') {
                        boolean z18 = z16;
                        z15 = z17;
                        z14 = z18;
                        break;
                    }
                    iMin = Math.min(iMin + 1, charSequence.length() - i14);
                    boolean z19 = z16;
                    z15 = z17;
                    z14 = z19;
                    i17 = i19;
                } else {
                    if (cCharAt2 < '0' || cCharAt2 > '9') {
                        break;
                    }
                    i17++;
                }
            }
            if (i17 == 0) {
                return ~i14;
            }
            if (i17 < 9) {
                int i24 = (z14 || z15) ? i14 + 1 : i14;
                int i25 = i24 + 1;
                try {
                    int iCharAt = charSequence.charAt(i24) - '0';
                    i15 = i14 + i17;
                    while (i25 < i15) {
                        int i26 = (iCharAt << 3) + (iCharAt << 1);
                        int i27 = i25 + 1;
                        int iCharAt2 = (charSequence.charAt(i25) + i26) - 48;
                        i25 = i27;
                        iCharAt = iCharAt2;
                    }
                    i16 = z14 ? -iCharAt : iCharAt;
                } catch (StringIndexOutOfBoundsException unused) {
                    return ~i14;
                }
            } else if (z15) {
                i15 = i14 + i17;
                i16 = Integer.parseInt(charSequence.subSequence(i14 + 1, i15).toString());
            } else {
                int i28 = i14 + i17;
                i16 = Integer.parseInt(charSequence.subSequence(i14, i28).toString());
                i15 = i28;
            }
            dateTimeParserBucket.saveField(this.iFieldType, i16);
            return i15;
        }
    }

    private DateTimeFormatterBuilder append0(Object obj) {
        this.iFormatter = null;
        this.iElementPairs.add(obj);
        this.iElementPairs.add(obj);
        return this;
    }

    public static void appendUnknownString(Appendable appendable, int i14) throws IOException {
        while (true) {
            i14--;
            if (i14 < 0) {
                return;
            } else {
                appendable.append((char) 65533);
            }
        }
    }

    private void checkParser(DateTimeParser dateTimeParser) {
        if (dateTimeParser != null) {
            return;
        }
        h.s("No parser supplied");
    }

    private void checkPrinter(DateTimePrinter dateTimePrinter) {
        if (dateTimePrinter != null) {
            return;
        }
        h.s("No printer supplied");
    }

    public static boolean csStartsWith(CharSequence charSequence, int i14, String str) {
        int length = str.length();
        if (charSequence.length() - i14 < length) {
            return false;
        }
        for (int i15 = 0; i15 < length; i15++) {
            if (charSequence.charAt(i14 + i15) != str.charAt(i15)) {
                return false;
            }
        }
        return true;
    }

    public static boolean csStartsWithIgnoreCase(CharSequence charSequence, int i14, String str) {
        char upperCase;
        char upperCase2;
        int length = str.length();
        if (charSequence.length() - i14 < length) {
            return false;
        }
        for (int i15 = 0; i15 < length; i15++) {
            char cCharAt = charSequence.charAt(i14 + i15);
            char cCharAt2 = str.charAt(i15);
            if (cCharAt != cCharAt2 && (upperCase = Character.toUpperCase(cCharAt)) != (upperCase2 = Character.toUpperCase(cCharAt2)) && Character.toLowerCase(upperCase) != Character.toLowerCase(upperCase2)) {
                return false;
            }
        }
        return true;
    }

    private Object getFormatter() {
        Object composite = this.iFormatter;
        if (composite == null) {
            if (this.iElementPairs.size() == 2) {
                Object obj = this.iElementPairs.get(0);
                Object obj2 = this.iElementPairs.get(1);
                if (obj == null) {
                    composite = obj2;
                } else if (obj == obj2 || obj2 == null) {
                    composite = obj;
                }
            }
            if (composite == null) {
                composite = new Composite(this.iElementPairs);
            }
            this.iFormatter = composite;
        }
        return composite;
    }

    private boolean isFormatter(Object obj) {
        return isPrinter(obj) || isParser(obj);
    }

    private boolean isParser(Object obj) {
        if (!(obj instanceof InternalParser)) {
            return false;
        }
        if (obj instanceof Composite) {
            return ((Composite) obj).isParser();
        }
        return true;
    }

    private boolean isPrinter(Object obj) {
        if (!(obj instanceof InternalPrinter)) {
            return false;
        }
        if (obj instanceof Composite) {
            return ((Composite) obj).isPrinter();
        }
        return true;
    }

    public DateTimeFormatterBuilder append(DateTimePrinter dateTimePrinter, DateTimeParser[] dateTimeParserArr) {
        if (dateTimePrinter != null) {
            checkPrinter(dateTimePrinter);
        }
        if (dateTimeParserArr == null) {
            h.s("No parsers supplied");
            return null;
        }
        int length = dateTimeParserArr.length;
        int i14 = 0;
        if (length == 1) {
            if (dateTimeParserArr[0] != null) {
                return append0(DateTimePrinterInternalPrinter.of(dateTimePrinter), DateTimeParserInternalParser.of(dateTimeParserArr[0]));
            }
            h.s("No parser supplied");
            return null;
        }
        InternalParser[] internalParserArr = new InternalParser[length];
        while (i14 < length - 1) {
            InternalParser internalParserOf = DateTimeParserInternalParser.of(dateTimeParserArr[i14]);
            internalParserArr[i14] = internalParserOf;
            if (internalParserOf == null) {
                h.s("Incomplete parser array");
                return null;
            }
            i14++;
        }
        internalParserArr[i14] = DateTimeParserInternalParser.of(dateTimeParserArr[i14]);
        return append0(DateTimePrinterInternalPrinter.of(dateTimePrinter), new MatchingParser(internalParserArr));
    }

    public DateTimeFormatterBuilder appendCenturyOfEra(int i14, int i15) {
        return appendSignedDecimal(DateTimeFieldType.centuryOfEra(), i14, i15);
    }

    public DateTimeFormatterBuilder appendClockhourOfDay(int i14) {
        return appendDecimal(DateTimeFieldType.clockhourOfDay(), i14, 2);
    }

    public DateTimeFormatterBuilder appendClockhourOfHalfday(int i14) {
        return appendDecimal(DateTimeFieldType.clockhourOfHalfday(), i14, 2);
    }

    public DateTimeFormatterBuilder appendDayOfMonth(int i14) {
        return appendDecimal(DateTimeFieldType.dayOfMonth(), i14, 2);
    }

    public DateTimeFormatterBuilder appendDayOfWeek(int i14) {
        return appendDecimal(DateTimeFieldType.dayOfWeek(), i14, 1);
    }

    public DateTimeFormatterBuilder appendDayOfWeekShortText() {
        return appendShortText(DateTimeFieldType.dayOfWeek());
    }

    public DateTimeFormatterBuilder appendDayOfWeekText() {
        return appendText(DateTimeFieldType.dayOfWeek());
    }

    public DateTimeFormatterBuilder appendDayOfYear(int i14) {
        return appendDecimal(DateTimeFieldType.dayOfYear(), i14, 3);
    }

    public DateTimeFormatterBuilder appendDecimal(DateTimeFieldType dateTimeFieldType, int i14, int i15) {
        if (dateTimeFieldType == null) {
            h.s("Field type must not be null");
            return null;
        }
        if (i15 < i14) {
            i15 = i14;
        }
        if (i14 >= 0 && i15 > 0) {
            return i14 <= 1 ? append0(new UnpaddedNumber(dateTimeFieldType, i15, false)) : append0(new PaddedNumber(dateTimeFieldType, i15, false, i14));
        }
        h.w();
        return null;
    }

    public DateTimeFormatterBuilder appendEraText() {
        return appendText(DateTimeFieldType.era());
    }

    public DateTimeFormatterBuilder appendFixedDecimal(DateTimeFieldType dateTimeFieldType, int i14) {
        if (dateTimeFieldType == null) {
            h.s("Field type must not be null");
            return null;
        }
        if (i14 > 0) {
            return append0(new FixedNumber(dateTimeFieldType, i14, false));
        }
        h.s(j.h(i14, "Illegal number of digits: "));
        return null;
    }

    public DateTimeFormatterBuilder appendFixedSignedDecimal(DateTimeFieldType dateTimeFieldType, int i14) {
        if (dateTimeFieldType == null) {
            h.s("Field type must not be null");
            return null;
        }
        if (i14 > 0) {
            return append0(new FixedNumber(dateTimeFieldType, i14, true));
        }
        h.s(j.h(i14, "Illegal number of digits: "));
        return null;
    }

    public DateTimeFormatterBuilder appendFraction(DateTimeFieldType dateTimeFieldType, int i14, int i15) {
        if (dateTimeFieldType == null) {
            h.s("Field type must not be null");
            return null;
        }
        if (i15 < i14) {
            i15 = i14;
        }
        if (i14 >= 0 && i15 > 0) {
            return append0(new Fraction(dateTimeFieldType, i14, i15));
        }
        h.w();
        return null;
    }

    public DateTimeFormatterBuilder appendFractionOfDay(int i14, int i15) {
        return appendFraction(DateTimeFieldType.dayOfYear(), i14, i15);
    }

    public DateTimeFormatterBuilder appendFractionOfHour(int i14, int i15) {
        return appendFraction(DateTimeFieldType.hourOfDay(), i14, i15);
    }

    public DateTimeFormatterBuilder appendFractionOfMinute(int i14, int i15) {
        return appendFraction(DateTimeFieldType.minuteOfDay(), i14, i15);
    }

    public DateTimeFormatterBuilder appendFractionOfSecond(int i14, int i15) {
        return appendFraction(DateTimeFieldType.secondOfDay(), i14, i15);
    }

    public DateTimeFormatterBuilder appendHalfdayOfDayText() {
        return appendText(DateTimeFieldType.halfdayOfDay());
    }

    public DateTimeFormatterBuilder appendHourOfDay(int i14) {
        return appendDecimal(DateTimeFieldType.hourOfDay(), i14, 2);
    }

    public DateTimeFormatterBuilder appendHourOfHalfday(int i14) {
        return appendDecimal(DateTimeFieldType.hourOfHalfday(), i14, 2);
    }

    public DateTimeFormatterBuilder appendLiteral(String str) {
        if (str == null) {
            h.s("Literal must not be null");
            return null;
        }
        int length = str.length();
        if (length != 0) {
            return length != 1 ? append0(new StringLiteral(str)) : append0(new CharacterLiteral(str.charAt(0)));
        }
        return this;
    }

    public DateTimeFormatterBuilder appendMillisOfDay(int i14) {
        return appendDecimal(DateTimeFieldType.millisOfDay(), i14, 8);
    }

    public DateTimeFormatterBuilder appendMillisOfSecond(int i14) {
        return appendDecimal(DateTimeFieldType.millisOfSecond(), i14, 3);
    }

    public DateTimeFormatterBuilder appendMinuteOfDay(int i14) {
        return appendDecimal(DateTimeFieldType.minuteOfDay(), i14, 4);
    }

    public DateTimeFormatterBuilder appendMinuteOfHour(int i14) {
        return appendDecimal(DateTimeFieldType.minuteOfHour(), i14, 2);
    }

    public DateTimeFormatterBuilder appendMonthOfYear(int i14) {
        return appendDecimal(DateTimeFieldType.monthOfYear(), i14, 2);
    }

    public DateTimeFormatterBuilder appendMonthOfYearShortText() {
        return appendShortText(DateTimeFieldType.monthOfYear());
    }

    public DateTimeFormatterBuilder appendMonthOfYearText() {
        return appendText(DateTimeFieldType.monthOfYear());
    }

    public DateTimeFormatterBuilder appendOptional(DateTimeParser dateTimeParser) {
        checkParser(dateTimeParser);
        return append0(null, new MatchingParser(new InternalParser[]{DateTimeParserInternalParser.of(dateTimeParser), null}));
    }

    public DateTimeFormatterBuilder appendPattern(String str) {
        DateTimeFormat.appendPatternTo(this, str);
        return this;
    }

    public DateTimeFormatterBuilder appendSecondOfDay(int i14) {
        return appendDecimal(DateTimeFieldType.secondOfDay(), i14, 5);
    }

    public DateTimeFormatterBuilder appendSecondOfMinute(int i14) {
        return appendDecimal(DateTimeFieldType.secondOfMinute(), i14, 2);
    }

    public DateTimeFormatterBuilder appendShortText(DateTimeFieldType dateTimeFieldType) {
        if (dateTimeFieldType != null) {
            return append0(new TextField(dateTimeFieldType, true));
        }
        h.s("Field type must not be null");
        return null;
    }

    public DateTimeFormatterBuilder appendSignedDecimal(DateTimeFieldType dateTimeFieldType, int i14, int i15) {
        if (dateTimeFieldType == null) {
            h.s("Field type must not be null");
            return null;
        }
        if (i15 < i14) {
            i15 = i14;
        }
        if (i14 >= 0 && i15 > 0) {
            return i14 <= 1 ? append0(new UnpaddedNumber(dateTimeFieldType, i15, true)) : append0(new PaddedNumber(dateTimeFieldType, i15, true, i14));
        }
        h.w();
        return null;
    }

    public DateTimeFormatterBuilder appendText(DateTimeFieldType dateTimeFieldType) {
        if (dateTimeFieldType != null) {
            return append0(new TextField(dateTimeFieldType, false));
        }
        h.s("Field type must not be null");
        return null;
    }

    public DateTimeFormatterBuilder appendTimeZoneId() {
        TimeZoneId timeZoneId = TimeZoneId.INSTANCE;
        return append0(timeZoneId, timeZoneId);
    }

    public DateTimeFormatterBuilder appendTimeZoneName() {
        return append0(new TimeZoneName(0, null), null);
    }

    public DateTimeFormatterBuilder appendTimeZoneOffset(String str, boolean z14, int i14, int i15) {
        return append0(new TimeZoneOffset(str, str, z14, i14, i15));
    }

    public DateTimeFormatterBuilder appendTimeZoneShortName() {
        return append0(new TimeZoneName(1, null), null);
    }

    public DateTimeFormatterBuilder appendTwoDigitWeekyear(int i14, boolean z14) {
        return append0(new TwoDigitYear(DateTimeFieldType.weekyear(), i14, z14));
    }

    public DateTimeFormatterBuilder appendTwoDigitYear(int i14, boolean z14) {
        return append0(new TwoDigitYear(DateTimeFieldType.year(), i14, z14));
    }

    public DateTimeFormatterBuilder appendWeekOfWeekyear(int i14) {
        return appendDecimal(DateTimeFieldType.weekOfWeekyear(), i14, 2);
    }

    public DateTimeFormatterBuilder appendWeekyear(int i14, int i15) {
        return appendSignedDecimal(DateTimeFieldType.weekyear(), i14, i15);
    }

    public DateTimeFormatterBuilder appendYear(int i14, int i15) {
        return appendSignedDecimal(DateTimeFieldType.year(), i14, i15);
    }

    public DateTimeFormatterBuilder appendYearOfCentury(int i14, int i15) {
        return appendDecimal(DateTimeFieldType.yearOfCentury(), i14, i15);
    }

    public DateTimeFormatterBuilder appendYearOfEra(int i14, int i15) {
        return appendDecimal(DateTimeFieldType.yearOfEra(), i14, i15);
    }

    public boolean canBuildFormatter() {
        return isFormatter(getFormatter());
    }

    public boolean canBuildParser() {
        return isParser(getFormatter());
    }

    public boolean canBuildPrinter() {
        return isPrinter(getFormatter());
    }

    public void clear() {
        this.iFormatter = null;
        this.iElementPairs.clear();
    }

    public DateTimeFormatter toFormatter() {
        Object formatter = getFormatter();
        InternalPrinter internalPrinter = isPrinter(formatter) ? (InternalPrinter) formatter : null;
        InternalParser internalParser = isParser(formatter) ? (InternalParser) formatter : null;
        if (internalPrinter != null || internalParser != null) {
            return new DateTimeFormatter(internalPrinter, internalParser);
        }
        e.w("Both printing and parsing not supported");
        return null;
    }

    public DateTimeParser toParser() {
        Object formatter = getFormatter();
        if (isParser(formatter)) {
            return InternalParserDateTimeParser.of((InternalParser) formatter);
        }
        e.w("Parsing is not supported");
        return null;
    }

    public DateTimePrinter toPrinter() {
        Object formatter = getFormatter();
        if (isPrinter(formatter)) {
            return InternalPrinterDateTimePrinter.of((InternalPrinter) formatter);
        }
        e.w("Printing is not supported");
        return null;
    }

    public static class CharacterLiteral implements InternalPrinter, InternalParser {
        private final char iValue;

        public CharacterLiteral(char c14) {
            this.iValue = c14;
        }

        @Override // org.joda.time.format.InternalParser
        public int estimateParsedLength() {
            return 1;
        }

        @Override // org.joda.time.format.InternalPrinter
        public int estimatePrintedLength() {
            return 1;
        }

        @Override // org.joda.time.format.InternalParser
        public int parseInto(DateTimeParserBucket dateTimeParserBucket, CharSequence charSequence, int i14) {
            char upperCase;
            char upperCase2;
            if (i14 >= charSequence.length()) {
                return ~i14;
            }
            char cCharAt = charSequence.charAt(i14);
            char c14 = this.iValue;
            return (cCharAt == c14 || (upperCase = Character.toUpperCase(cCharAt)) == (upperCase2 = Character.toUpperCase(c14)) || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2)) ? i14 + 1 : ~i14;
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, long j8, Chronology chronology, int i14, DateTimeZone dateTimeZone, Locale locale) throws IOException {
            appendable.append(this.iValue);
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, ReadablePartial readablePartial, Locale locale) throws IOException {
            appendable.append(this.iValue);
        }
    }

    public static class StringLiteral implements InternalPrinter, InternalParser {
        private final String iValue;

        public StringLiteral(String str) {
            this.iValue = str;
        }

        @Override // org.joda.time.format.InternalParser
        public int estimateParsedLength() {
            return this.iValue.length();
        }

        @Override // org.joda.time.format.InternalPrinter
        public int estimatePrintedLength() {
            return this.iValue.length();
        }

        @Override // org.joda.time.format.InternalParser
        public int parseInto(DateTimeParserBucket dateTimeParserBucket, CharSequence charSequence, int i14) {
            return DateTimeFormatterBuilder.csStartsWithIgnoreCase(charSequence, i14, this.iValue) ? this.iValue.length() + i14 : ~i14;
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, long j8, Chronology chronology, int i14, DateTimeZone dateTimeZone, Locale locale) throws IOException {
            appendable.append(this.iValue);
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, ReadablePartial readablePartial, Locale locale) throws IOException {
            appendable.append(this.iValue);
        }
    }

    public static class TimeZoneName implements InternalPrinter, InternalParser {
        static final int LONG_NAME = 0;
        static final int SHORT_NAME = 1;
        private final Map<String, DateTimeZone> iParseLookup;
        private final int iType;

        public TimeZoneName(int i14, Map<String, DateTimeZone> map) {
            this.iType = i14;
            this.iParseLookup = map;
        }

        private String print(long j8, DateTimeZone dateTimeZone, Locale locale) {
            if (dateTimeZone == null) {
                return "";
            }
            int i14 = this.iType;
            if (i14 != 0) {
                return i14 != 1 ? "" : dateTimeZone.getShortName(j8, locale);
            }
            return dateTimeZone.getName(j8, locale);
        }

        @Override // org.joda.time.format.InternalParser
        public int estimateParsedLength() {
            return this.iType == 1 ? 4 : 20;
        }

        @Override // org.joda.time.format.InternalPrinter
        public int estimatePrintedLength() {
            return this.iType == 1 ? 4 : 20;
        }

        @Override // org.joda.time.format.InternalParser
        public int parseInto(DateTimeParserBucket dateTimeParserBucket, CharSequence charSequence, int i14) {
            Map<String, DateTimeZone> defaultTimeZoneNames = this.iParseLookup;
            if (defaultTimeZoneNames == null) {
                defaultTimeZoneNames = DateTimeUtils.getDefaultTimeZoneNames();
            }
            String str = null;
            for (String str2 : defaultTimeZoneNames.keySet()) {
                if (DateTimeFormatterBuilder.csStartsWith(charSequence, i14, str2) && (str == null || str2.length() > str.length())) {
                    str = str2;
                }
            }
            if (str == null) {
                return ~i14;
            }
            dateTimeParserBucket.setZone(defaultTimeZoneNames.get(str));
            return str.length() + i14;
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, long j8, Chronology chronology, int i14, DateTimeZone dateTimeZone, Locale locale) throws IOException {
            appendable.append(print(j8 - ((long) i14), dateTimeZone, locale));
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, ReadablePartial readablePartial, Locale locale) {
        }
    }

    public enum TimeZoneId implements InternalPrinter, InternalParser {
        INSTANCE;

        private static final List<String> ALL_IDS;
        private static final List<String> BASE_GROUPED_IDS = new ArrayList();
        private static final Map<String, List<String>> GROUPED_IDS;
        static final int MAX_LENGTH;
        static final int MAX_PREFIX_LENGTH;

        static {
            ArrayList<String> arrayList = new ArrayList(DateTimeZone.getAvailableIDs());
            ALL_IDS = arrayList;
            Collections.sort(arrayList);
            GROUPED_IDS = new HashMap();
            int iMax = 0;
            int iMax2 = 0;
            for (String str : arrayList) {
                int iIndexOf = str.indexOf(47);
                if (iIndexOf >= 0) {
                    iIndexOf = iIndexOf < str.length() ? iIndexOf + 1 : iIndexOf;
                    iMax2 = Math.max(iMax2, iIndexOf);
                    String strSubstring = str.substring(0, iIndexOf + 1);
                    String strSubstring2 = str.substring(iIndexOf);
                    Map<String, List<String>> map = GROUPED_IDS;
                    if (!map.containsKey(strSubstring)) {
                        map.put(strSubstring, new ArrayList());
                    }
                    map.get(strSubstring).add(strSubstring2);
                } else {
                    BASE_GROUPED_IDS.add(str);
                }
                iMax = Math.max(iMax, str.length());
            }
            MAX_LENGTH = iMax;
            MAX_PREFIX_LENGTH = iMax2;
        }

        @Override // org.joda.time.format.InternalParser
        public int estimateParsedLength() {
            return MAX_LENGTH;
        }

        @Override // org.joda.time.format.InternalPrinter
        public int estimatePrintedLength() {
            return MAX_LENGTH;
        }

        @Override // org.joda.time.format.InternalParser
        public int parseInto(DateTimeParserBucket dateTimeParserBucket, CharSequence charSequence, int i14) {
            String string;
            int length;
            String string2;
            List<String> list = BASE_GROUPED_IDS;
            int length2 = charSequence.length();
            int iMin = Math.min(length2, MAX_PREFIX_LENGTH + i14);
            int i15 = i14;
            while (true) {
                if (i15 >= iMin) {
                    string = "";
                    length = i14;
                    break;
                }
                if (charSequence.charAt(i15) == '/') {
                    int i16 = i15 + 1;
                    string = charSequence.subSequence(i14, i16).toString();
                    length = string.length() + i14;
                    if (i15 < length2 - 1) {
                        StringBuilder sbK = e5.k(string);
                        sbK.append(charSequence.charAt(i16));
                        string2 = sbK.toString();
                    } else {
                        string2 = string;
                    }
                    list = GROUPED_IDS.get(string2);
                    if (list != null) {
                        break;
                    }
                    return ~i14;
                }
                i15++;
            }
            String str = null;
            for (int i17 = 0; i17 < list.size(); i17++) {
                String str2 = list.get(i17);
                if (DateTimeFormatterBuilder.csStartsWith(charSequence, length, str2) && (str == null || str2.length() > str.length())) {
                    str = str2;
                }
            }
            if (str == null) {
                return ~i14;
            }
            dateTimeParserBucket.setZone(DateTimeZone.forID(string.concat(str)));
            return str.length() + length;
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, long j8, Chronology chronology, int i14, DateTimeZone dateTimeZone, Locale locale) throws IOException {
            appendable.append(dateTimeZone != null ? dateTimeZone.getID() : "");
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, ReadablePartial readablePartial, Locale locale) {
        }
    }

    public DateTimeFormatterBuilder appendTimeZoneName(Map<String, DateTimeZone> map) {
        TimeZoneName timeZoneName = new TimeZoneName(0, map);
        return append0(timeZoneName, timeZoneName);
    }

    public DateTimeFormatterBuilder appendTimeZoneShortName(Map<String, DateTimeZone> map) {
        TimeZoneName timeZoneName = new TimeZoneName(1, map);
        return append0(timeZoneName, timeZoneName);
    }

    public static class TextField implements InternalPrinter, InternalParser {
        private static Map<Locale, Map<DateTimeFieldType, Object[]>> cParseCache = new ConcurrentHashMap();
        private final DateTimeFieldType iFieldType;
        private final boolean iShort;

        public TextField(DateTimeFieldType dateTimeFieldType, boolean z14) {
            this.iFieldType = dateTimeFieldType;
            this.iShort = z14;
        }

        private String print(ReadablePartial readablePartial, Locale locale) {
            if (!readablePartial.isSupported(this.iFieldType)) {
                return "�";
            }
            DateTimeField field = this.iFieldType.getField(readablePartial.getChronology());
            return this.iShort ? field.getAsShortText(readablePartial, locale) : field.getAsText(readablePartial, locale);
        }

        @Override // org.joda.time.format.InternalParser
        public int estimateParsedLength() {
            return estimatePrintedLength();
        }

        @Override // org.joda.time.format.InternalPrinter
        public int estimatePrintedLength() {
            return this.iShort ? 6 : 20;
        }

        @Override // org.joda.time.format.InternalParser
        public int parseInto(DateTimeParserBucket dateTimeParserBucket, CharSequence charSequence, int i14) {
            int iIntValue;
            Map map;
            Locale locale = dateTimeParserBucket.getLocale();
            Map<DateTimeFieldType, Object[]> concurrentHashMap = cParseCache.get(locale);
            if (concurrentHashMap == null) {
                concurrentHashMap = new ConcurrentHashMap<>();
                cParseCache.put(locale, concurrentHashMap);
            }
            Object[] objArr = concurrentHashMap.get(this.iFieldType);
            if (objArr == null) {
                ConcurrentHashMap concurrentHashMap2 = new ConcurrentHashMap(32);
                MutableDateTime.Property property = new MutableDateTime(0L, DateTimeZone.UTC).property(this.iFieldType);
                int minimumValueOverall = property.getMinimumValueOverall();
                int maximumValueOverall = property.getMaximumValueOverall();
                if (maximumValueOverall - minimumValueOverall > 32) {
                    return ~i14;
                }
                iIntValue = property.getMaximumTextLength(locale);
                while (minimumValueOverall <= maximumValueOverall) {
                    property.set(minimumValueOverall);
                    String asShortText = property.getAsShortText(locale);
                    Boolean bool = Boolean.TRUE;
                    concurrentHashMap2.put(asShortText, bool);
                    concurrentHashMap2.put(property.getAsShortText(locale).toLowerCase(locale), bool);
                    concurrentHashMap2.put(property.getAsShortText(locale).toUpperCase(locale), bool);
                    concurrentHashMap2.put(property.getAsText(locale), bool);
                    concurrentHashMap2.put(property.getAsText(locale).toLowerCase(locale), bool);
                    concurrentHashMap2.put(property.getAsText(locale).toUpperCase(locale), bool);
                    minimumValueOverall++;
                }
                if ("en".equals(locale.getLanguage()) && this.iFieldType == DateTimeFieldType.era()) {
                    Boolean bool2 = Boolean.TRUE;
                    concurrentHashMap2.put("BCE", bool2);
                    concurrentHashMap2.put("bce", bool2);
                    concurrentHashMap2.put("CE", bool2);
                    concurrentHashMap2.put("ce", bool2);
                    iIntValue = 3;
                }
                concurrentHashMap.put(this.iFieldType, new Object[]{concurrentHashMap2, Integer.valueOf(iIntValue)});
                map = concurrentHashMap2;
            } else {
                Map map2 = (Map) objArr[0];
                iIntValue = ((Integer) objArr[1]).intValue();
                map = map2;
            }
            for (int iMin = Math.min(charSequence.length(), iIntValue + i14); iMin > i14; iMin--) {
                String string = charSequence.subSequence(i14, iMin).toString();
                if (map.containsKey(string)) {
                    dateTimeParserBucket.saveField(this.iFieldType, string, locale);
                    return iMin;
                }
            }
            return ~i14;
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, long j8, Chronology chronology, int i14, DateTimeZone dateTimeZone, Locale locale) throws IOException {
            try {
                appendable.append(print(j8, chronology, locale));
            } catch (RuntimeException unused) {
                appendable.append((char) 65533);
            }
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, ReadablePartial readablePartial, Locale locale) throws IOException {
            try {
                appendable.append(print(readablePartial, locale));
            } catch (RuntimeException unused) {
                appendable.append((char) 65533);
            }
        }

        private String print(long j8, Chronology chronology, Locale locale) {
            DateTimeField field = this.iFieldType.getField(chronology);
            if (this.iShort) {
                return field.getAsShortText(j8, locale);
            }
            return field.getAsText(j8, locale);
        }
    }

    private DateTimeFormatterBuilder append0(InternalPrinter internalPrinter, InternalParser internalParser) {
        this.iFormatter = null;
        this.iElementPairs.add(internalPrinter);
        this.iElementPairs.add(internalParser);
        return this;
    }

    public DateTimeFormatterBuilder appendTwoDigitWeekyear(int i14) {
        return appendTwoDigitWeekyear(i14, false);
    }

    public DateTimeFormatterBuilder appendTwoDigitYear(int i14) {
        return appendTwoDigitYear(i14, false);
    }

    public DateTimeFormatterBuilder appendTimeZoneOffset(String str, String str2, boolean z14, int i14, int i15) {
        return append0(new TimeZoneOffset(str, str2, z14, i14, i15));
    }

    public static class TwoDigitYear implements InternalPrinter, InternalParser {
        private final boolean iLenientParse;
        private final int iPivot;
        private final DateTimeFieldType iType;

        public TwoDigitYear(DateTimeFieldType dateTimeFieldType, int i14, boolean z14) {
            this.iType = dateTimeFieldType;
            this.iPivot = i14;
            this.iLenientParse = z14;
        }

        private int getTwoDigitYear(ReadablePartial readablePartial) {
            if (!readablePartial.isSupported(this.iType)) {
                return -1;
            }
            try {
                int i14 = readablePartial.get(this.iType);
                if (i14 < 0) {
                    i14 = -i14;
                }
                return i14 % 100;
            } catch (RuntimeException unused) {
                return -1;
            }
        }

        @Override // org.joda.time.format.InternalParser
        public int estimateParsedLength() {
            return this.iLenientParse ? 4 : 2;
        }

        @Override // org.joda.time.format.InternalPrinter
        public int estimatePrintedLength() {
            return 2;
        }

        @Override // org.joda.time.format.InternalParser
        public int parseInto(DateTimeParserBucket dateTimeParserBucket, CharSequence charSequence, int i14) {
            int i15;
            int i16;
            int length = charSequence.length() - i14;
            if (this.iLenientParse) {
                int i17 = 0;
                boolean z14 = false;
                boolean z15 = false;
                while (i17 < length) {
                    char cCharAt = charSequence.charAt(i14 + i17);
                    if (i17 == 0 && (cCharAt == '-' || cCharAt == '+')) {
                        z15 = cCharAt == '-';
                        if (z15) {
                            i17++;
                        } else {
                            i14++;
                            length--;
                        }
                        z14 = true;
                    } else {
                        if (cCharAt < '0' || cCharAt > '9') {
                            break;
                        }
                        i17++;
                    }
                }
                if (i17 == 0) {
                    return ~i14;
                }
                if (z14 || i17 != 2) {
                    if (i17 >= 9) {
                        i15 = i17 + i14;
                        i16 = Integer.parseInt(charSequence.subSequence(i14, i15).toString());
                    } else {
                        int i18 = z15 ? i14 + 1 : i14;
                        int i19 = i18 + 1;
                        try {
                            int iCharAt = charSequence.charAt(i18) - '0';
                            i15 = i17 + i14;
                            while (i19 < i15) {
                                int iCharAt2 = (charSequence.charAt(i19) + ((iCharAt << 3) + (iCharAt << 1))) - 48;
                                i19++;
                                iCharAt = iCharAt2;
                            }
                            i16 = z15 ? -iCharAt : iCharAt;
                        } catch (StringIndexOutOfBoundsException unused) {
                            return ~i14;
                        }
                    }
                    dateTimeParserBucket.saveField(this.iType, i16);
                    return i15;
                }
            } else if (Math.min(2, length) < 2) {
                return ~i14;
            }
            char cCharAt2 = charSequence.charAt(i14);
            if (cCharAt2 < '0' || cCharAt2 > '9') {
                return ~i14;
            }
            int i24 = cCharAt2 - '0';
            char cCharAt3 = charSequence.charAt(i14 + 1);
            if (cCharAt3 < '0' || cCharAt3 > '9') {
                return ~i14;
            }
            int i25 = (((i24 << 3) + (i24 << 1)) + cCharAt3) - 48;
            int iIntValue = this.iPivot;
            if (dateTimeParserBucket.getPivotYear() != null) {
                iIntValue = dateTimeParserBucket.getPivotYear().intValue();
            }
            int i26 = iIntValue - 50;
            int i27 = i26 >= 0 ? i26 % 100 : ((iIntValue - 49) % 100) + 99;
            dateTimeParserBucket.saveField(this.iType, ((i26 + (i25 < i27 ? 100 : 0)) - i27) + i25);
            return i14 + 2;
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, long j8, Chronology chronology, int i14, DateTimeZone dateTimeZone, Locale locale) throws IOException {
            int twoDigitYear = getTwoDigitYear(j8, chronology);
            if (twoDigitYear >= 0) {
                FormatUtils.appendPaddedInteger(appendable, twoDigitYear, 2);
            } else {
                appendable.append((char) 65533);
                appendable.append((char) 65533);
            }
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, ReadablePartial readablePartial, Locale locale) throws IOException {
            int twoDigitYear = getTwoDigitYear(readablePartial);
            if (twoDigitYear < 0) {
                appendable.append((char) 65533);
                appendable.append((char) 65533);
            } else {
                FormatUtils.appendPaddedInteger(appendable, twoDigitYear, 2);
            }
        }

        private int getTwoDigitYear(long j8, Chronology chronology) {
            try {
                int i14 = this.iType.getField(chronology).get(j8);
                if (i14 < 0) {
                    i14 = -i14;
                }
                return i14 % 100;
            } catch (RuntimeException unused) {
                return -1;
            }
        }
    }

    public static class UnpaddedNumber extends NumberFormatter {
        public UnpaddedNumber(DateTimeFieldType dateTimeFieldType, int i14, boolean z14) {
            super(dateTimeFieldType, i14, z14);
        }

        @Override // org.joda.time.format.InternalPrinter
        public int estimatePrintedLength() {
            return this.iMaxParsedDigits;
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, ReadablePartial readablePartial, Locale locale) throws IOException {
            if (!readablePartial.isSupported(this.iFieldType)) {
                appendable.append((char) 65533);
                return;
            }
            try {
                FormatUtils.appendUnpaddedInteger(appendable, readablePartial.get(this.iFieldType));
            } catch (RuntimeException unused) {
                appendable.append((char) 65533);
            }
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, long j8, Chronology chronology, int i14, DateTimeZone dateTimeZone, Locale locale) throws IOException {
            try {
                FormatUtils.appendUnpaddedInteger(appendable, this.iFieldType.getField(chronology).get(j8));
            } catch (RuntimeException unused) {
                appendable.append((char) 65533);
            }
        }
    }

    public static class PaddedNumber extends NumberFormatter {
        protected final int iMinPrintedDigits;

        public PaddedNumber(DateTimeFieldType dateTimeFieldType, int i14, boolean z14, int i15) {
            super(dateTimeFieldType, i14, z14);
            this.iMinPrintedDigits = i15;
        }

        @Override // org.joda.time.format.InternalPrinter
        public int estimatePrintedLength() {
            return this.iMaxParsedDigits;
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, ReadablePartial readablePartial, Locale locale) throws IOException {
            if (!readablePartial.isSupported(this.iFieldType)) {
                DateTimeFormatterBuilder.appendUnknownString(appendable, this.iMinPrintedDigits);
                return;
            }
            try {
                FormatUtils.appendPaddedInteger(appendable, readablePartial.get(this.iFieldType), this.iMinPrintedDigits);
            } catch (RuntimeException unused) {
                DateTimeFormatterBuilder.appendUnknownString(appendable, this.iMinPrintedDigits);
            }
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, long j8, Chronology chronology, int i14, DateTimeZone dateTimeZone, Locale locale) throws IOException {
            try {
                FormatUtils.appendPaddedInteger(appendable, this.iFieldType.getField(chronology).get(j8), this.iMinPrintedDigits);
            } catch (RuntimeException unused) {
                DateTimeFormatterBuilder.appendUnknownString(appendable, this.iMinPrintedDigits);
            }
        }
    }

    public static class Composite implements InternalPrinter, InternalParser {
        private final int iParsedLengthEstimate;
        private final InternalParser[] iParsers;
        private final int iPrintedLengthEstimate;
        private final InternalPrinter[] iPrinters;

        public Composite(List<Object> list) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            decompose(list, arrayList, arrayList2);
            if (arrayList.contains(null) || arrayList.isEmpty()) {
                this.iPrinters = null;
                this.iPrintedLengthEstimate = 0;
            } else {
                int size = arrayList.size();
                this.iPrinters = new InternalPrinter[size];
                int iEstimatePrintedLength = 0;
                for (int i14 = 0; i14 < size; i14++) {
                    InternalPrinter internalPrinter = (InternalPrinter) arrayList.get(i14);
                    iEstimatePrintedLength += internalPrinter.estimatePrintedLength();
                    this.iPrinters[i14] = internalPrinter;
                }
                this.iPrintedLengthEstimate = iEstimatePrintedLength;
            }
            if (arrayList2.contains(null) || arrayList2.isEmpty()) {
                this.iParsers = null;
                this.iParsedLengthEstimate = 0;
                return;
            }
            int size2 = arrayList2.size();
            this.iParsers = new InternalParser[size2];
            int iEstimateParsedLength = 0;
            for (int i15 = 0; i15 < size2; i15++) {
                InternalParser internalParser = (InternalParser) arrayList2.get(i15);
                iEstimateParsedLength += internalParser.estimateParsedLength();
                this.iParsers[i15] = internalParser;
            }
            this.iParsedLengthEstimate = iEstimateParsedLength;
        }

        private void addArrayToList(List<Object> list, Object[] objArr) {
            if (objArr != null) {
                for (Object obj : objArr) {
                    list.add(obj);
                }
            }
        }

        private void decompose(List<Object> list, List<Object> list2, List<Object> list3) {
            int size = list.size();
            for (int i14 = 0; i14 < size; i14 += 2) {
                Object obj = list.get(i14);
                if (obj instanceof Composite) {
                    addArrayToList(list2, ((Composite) obj).iPrinters);
                } else {
                    list2.add(obj);
                }
                Object obj2 = list.get(i14 + 1);
                if (obj2 instanceof Composite) {
                    addArrayToList(list3, ((Composite) obj2).iParsers);
                } else {
                    list3.add(obj2);
                }
            }
        }

        @Override // org.joda.time.format.InternalParser
        public int estimateParsedLength() {
            return this.iParsedLengthEstimate;
        }

        @Override // org.joda.time.format.InternalPrinter
        public int estimatePrintedLength() {
            return this.iPrintedLengthEstimate;
        }

        public boolean isParser() {
            return this.iParsers != null;
        }

        public boolean isPrinter() {
            return this.iPrinters != null;
        }

        @Override // org.joda.time.format.InternalParser
        public int parseInto(DateTimeParserBucket dateTimeParserBucket, CharSequence charSequence, int i14) {
            InternalParser[] internalParserArr = this.iParsers;
            if (internalParserArr == null) {
                a.m();
                return 0;
            }
            int length = internalParserArr.length;
            for (int i15 = 0; i15 < length && i14 >= 0; i15++) {
                i14 = internalParserArr[i15].parseInto(dateTimeParserBucket, charSequence, i14);
            }
            return i14;
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, long j8, Chronology chronology, int i14, DateTimeZone dateTimeZone, Locale locale) {
            InternalPrinter[] internalPrinterArr = this.iPrinters;
            if (internalPrinterArr == null) {
                a.m();
                return;
            }
            Locale locale2 = locale == null ? Locale.getDefault() : locale;
            for (InternalPrinter internalPrinter : internalPrinterArr) {
                internalPrinter.printTo(appendable, j8, chronology, i14, dateTimeZone, locale2);
            }
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, ReadablePartial readablePartial, Locale locale) {
            InternalPrinter[] internalPrinterArr = this.iPrinters;
            if (internalPrinterArr != null) {
                if (locale == null) {
                    locale = Locale.getDefault();
                }
                for (InternalPrinter internalPrinter : internalPrinterArr) {
                    internalPrinter.printTo(appendable, readablePartial, locale);
                }
                return;
            }
            a.m();
        }
    }

    public DateTimeFormatterBuilder appendLiteral(char c14) {
        return append0(new CharacterLiteral(c14));
    }

    public DateTimeFormatterBuilder append(DateTimePrinter dateTimePrinter) {
        checkPrinter(dateTimePrinter);
        return append0(DateTimePrinterInternalPrinter.of(dateTimePrinter), null);
    }

    public DateTimeFormatterBuilder append(DateTimeParser dateTimeParser) {
        checkParser(dateTimeParser);
        return append0(null, DateTimeParserInternalParser.of(dateTimeParser));
    }

    public DateTimeFormatterBuilder append(DateTimePrinter dateTimePrinter, DateTimeParser dateTimeParser) {
        checkPrinter(dateTimePrinter);
        checkParser(dateTimeParser);
        return append0(DateTimePrinterInternalPrinter.of(dateTimePrinter), DateTimeParserInternalParser.of(dateTimeParser));
    }

    public DateTimeFormatterBuilder append(DateTimeFormatter dateTimeFormatter) {
        if (dateTimeFormatter != null) {
            return append0(dateTimeFormatter.getPrinter0(), dateTimeFormatter.getParser0());
        }
        h.s("No formatter supplied");
        return null;
    }

    public static class Fraction implements InternalPrinter, InternalParser {
        private final DateTimeFieldType iFieldType;
        protected int iMaxDigits;
        protected int iMinDigits;

        public Fraction(DateTimeFieldType dateTimeFieldType, int i14, int i15) {
            this.iFieldType = dateTimeFieldType;
            i15 = i15 > 18 ? 18 : i15;
            this.iMinDigits = i14;
            this.iMaxDigits = i15;
        }

        private long[] getFractionData(long j8, DateTimeField dateTimeField) {
            long j14;
            long unitMillis = dateTimeField.getDurationField().getUnitMillis();
            int i14 = this.iMaxDigits;
            while (true) {
                switch (i14) {
                    case 1:
                        j14 = 10;
                        break;
                    case 2:
                        j14 = 100;
                        break;
                    case 3:
                        j14 = 1000;
                        break;
                    case 4:
                        j14 = AbstractComponentTracker.LINGERING_TIMEOUT;
                        break;
                    case 5:
                        j14 = 100000;
                        break;
                    case 6:
                        j14 = 1000000;
                        break;
                    case 7:
                        j14 = 10000000;
                        break;
                    case 8:
                        j14 = 100000000;
                        break;
                    case 9:
                        j14 = C.NANOS_PER_SECOND;
                        break;
                    case 10:
                        j14 = RealConnection.IDLE_CONNECTION_HEALTHY_NS;
                        break;
                    case 11:
                        j14 = 100000000000L;
                        break;
                    case 12:
                        j14 = MediaPeriodQueue.INITIAL_RENDERER_POSITION_OFFSET_US;
                        break;
                    case 13:
                        j14 = 10000000000000L;
                        break;
                    case 14:
                        j14 = 100000000000000L;
                        break;
                    case 15:
                        j14 = 1000000000000000L;
                        break;
                    case 16:
                        j14 = 10000000000000000L;
                        break;
                    case 17:
                        j14 = 100000000000000000L;
                        break;
                    case 18:
                        j14 = 1000000000000000000L;
                        break;
                    default:
                        j14 = 1;
                        break;
                }
                if ((unitMillis * j14) / j14 == unitMillis) {
                    return new long[]{(j8 * j14) / unitMillis, i14};
                }
                i14--;
            }
        }

        @Override // org.joda.time.format.InternalParser
        public int estimateParsedLength() {
            return this.iMaxDigits;
        }

        @Override // org.joda.time.format.InternalPrinter
        public int estimatePrintedLength() {
            return this.iMaxDigits;
        }

        @Override // org.joda.time.format.InternalParser
        public int parseInto(DateTimeParserBucket dateTimeParserBucket, CharSequence charSequence, int i14) {
            DateTimeField field = this.iFieldType.getField(dateTimeParserBucket.getChronology());
            int iMin = Math.min(this.iMaxDigits, charSequence.length() - i14);
            long unitMillis = field.getDurationField().getUnitMillis() * 10;
            long j8 = 0;
            int i15 = 0;
            while (i15 < iMin) {
                char cCharAt = charSequence.charAt(i14 + i15);
                if (cCharAt < '0' || cCharAt > '9') {
                    break;
                }
                i15++;
                unitMillis /= 10;
                j8 += ((long) (cCharAt - '0')) * unitMillis;
            }
            long j14 = j8 / 10;
            if (i15 != 0 && j14 <= 2147483647L) {
                dateTimeParserBucket.saveField(new PreciseDateTimeField(DateTimeFieldType.millisOfSecond(), MillisDurationField.INSTANCE, field.getDurationField()), (int) j14);
                return i14 + i15;
            }
            return ~i14;
        }

        public void printTo(Appendable appendable, long j8, Chronology chronology) throws IOException {
            DateTimeField field = this.iFieldType.getField(chronology);
            int i14 = this.iMinDigits;
            try {
                long jRemainder = field.remainder(j8);
                if (jRemainder != 0) {
                    long[] fractionData = getFractionData(jRemainder, field);
                    long j14 = fractionData[0];
                    int i15 = (int) fractionData[1];
                    String string = (2147483647L & j14) == j14 ? Integer.toString((int) j14) : Long.toString(j14);
                    int length = string.length();
                    while (length < i15) {
                        appendable.append('0');
                        i14--;
                        i15--;
                    }
                    if (i14 < i15) {
                        while (i14 < i15 && length > 1 && string.charAt(length - 1) == '0') {
                            i15--;
                            length--;
                        }
                        if (length < string.length()) {
                            for (int i16 = 0; i16 < length; i16++) {
                                appendable.append(string.charAt(i16));
                            }
                            return;
                        }
                    }
                    appendable.append(string);
                    return;
                }
                while (true) {
                    i14--;
                    if (i14 < 0) {
                        return;
                    } else {
                        appendable.append('0');
                    }
                }
            } catch (RuntimeException unused) {
                DateTimeFormatterBuilder.appendUnknownString(appendable, i14);
            }
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, ReadablePartial readablePartial, Locale locale) throws IOException {
            printTo(appendable, readablePartial.getChronology().set(readablePartial, 0L), readablePartial.getChronology());
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, long j8, Chronology chronology, int i14, DateTimeZone dateTimeZone, Locale locale) throws IOException {
            printTo(appendable, j8, chronology);
        }
    }

    public static class TimeZoneOffset implements InternalPrinter, InternalParser {
        private final int iMaxFields;
        private final int iMinFields;
        private final boolean iShowSeparators;
        private final String iZeroOffsetParseText;
        private final String iZeroOffsetPrintText;

        public TimeZoneOffset(String str, String str2, boolean z14, int i14, int i15) {
            this.iZeroOffsetPrintText = str;
            this.iZeroOffsetParseText = str2;
            this.iShowSeparators = z14;
            if (i14 <= 0 || i15 < i14) {
                h.w();
                throw null;
            }
            if (i14 > 4) {
                i14 = 4;
                i15 = 4;
            }
            this.iMinFields = i14;
            this.iMaxFields = i15;
        }

        private int digitCount(CharSequence charSequence, int i14, int i15) {
            int i16 = 0;
            for (int iMin = Math.min(charSequence.length() - i14, i15); iMin > 0; iMin--) {
                char cCharAt = charSequence.charAt(i14 + i16);
                if (cCharAt < '0' || cCharAt > '9') {
                    break;
                }
                i16++;
            }
            return i16;
        }

        @Override // org.joda.time.format.InternalParser
        public int estimateParsedLength() {
            return estimatePrintedLength();
        }

        @Override // org.joda.time.format.InternalPrinter
        public int estimatePrintedLength() {
            int i14 = this.iMinFields;
            int i15 = (i14 + 1) << 1;
            if (this.iShowSeparators) {
                i15 += i14 - 1;
            }
            String str = this.iZeroOffsetPrintText;
            return (str == null || str.length() <= i15) ? i15 : this.iZeroOffsetPrintText.length();
        }

        /* JADX WARN: Code duplicated, block: B:60:0x00ad  */
        /* JADX WARN: Code duplicated, block: B:82:0x00e8  */
        @Override // org.joda.time.format.InternalParser
        public int parseInto(DateTimeParserBucket dateTimeParserBucket, CharSequence charSequence, int i14) {
            boolean z14;
            int twoDigits;
            int twoDigits2;
            int twoDigits3;
            char cCharAt;
            boolean z15 = false;
            int length = charSequence.length() - i14;
            String str = this.iZeroOffsetParseText;
            if (str != null) {
                if (str.length() == 0) {
                    if (length <= 0 || ((cCharAt = charSequence.charAt(i14)) != '-' && cCharAt != '+')) {
                        dateTimeParserBucket.setOffset((Integer) 0);
                        return i14;
                    }
                } else if (DateTimeFormatterBuilder.csStartsWithIgnoreCase(charSequence, i14, this.iZeroOffsetParseText)) {
                    dateTimeParserBucket.setOffset((Integer) 0);
                    return this.iZeroOffsetParseText.length() + i14;
                }
            }
            if (length <= 1) {
                return ~i14;
            }
            char cCharAt2 = charSequence.charAt(i14);
            if (cCharAt2 == '-') {
                z14 = true;
            } else {
                if (cCharAt2 != '+') {
                    return ~i14;
                }
                z14 = false;
            }
            int i15 = i14 + 1;
            if (digitCount(charSequence, i15, 2) >= 2 && (twoDigits = FormatUtils.parseTwoDigits(charSequence, i15)) <= 23) {
                int iCharAt = twoDigits * DateTimeConstants.MILLIS_PER_HOUR;
                int i16 = length - 3;
                int i17 = i14 + 3;
                if (i16 > 0) {
                    char cCharAt3 = charSequence.charAt(i17);
                    if (cCharAt3 == ':') {
                        i16 = length - 4;
                        i17 = i14 + 4;
                        z15 = true;
                    } else if (cCharAt3 >= '0' && cCharAt3 <= '9') {
                    }
                    int iDigitCount = digitCount(charSequence, i17, 2);
                    if (iDigitCount != 0 || z15) {
                        if (iDigitCount >= 2 && (twoDigits2 = FormatUtils.parseTwoDigits(charSequence, i17)) <= 59) {
                            iCharAt += twoDigits2 * DateTimeConstants.MILLIS_PER_MINUTE;
                            int i18 = i16 - 2;
                            int i19 = i17 + 2;
                            if (i18 > 0) {
                                if (!z15) {
                                    i17 = i19;
                                } else if (charSequence.charAt(i19) != ':') {
                                    i17 = i19;
                                } else {
                                    i18 = i16 - 3;
                                    i17 += 3;
                                }
                                int iDigitCount2 = digitCount(charSequence, i17, 2);
                                if (iDigitCount2 != 0 || z15) {
                                    if (iDigitCount2 >= 2 && (twoDigits3 = FormatUtils.parseTwoDigits(charSequence, i17)) <= 59) {
                                        iCharAt += twoDigits3 * 1000;
                                        int i24 = i17 + 2;
                                        if (i18 - 2 > 0) {
                                            if (!z15) {
                                                i17 = i24;
                                            } else if (charSequence.charAt(i24) == '.' || charSequence.charAt(i24) == ',') {
                                                i17 += 3;
                                            } else {
                                                i17 = i24;
                                            }
                                            int iDigitCount3 = digitCount(charSequence, i17, 3);
                                            if (iDigitCount3 != 0 || z15) {
                                                if (iDigitCount3 < 1) {
                                                    return ~i17;
                                                }
                                                int i25 = i17 + 1;
                                                iCharAt += (charSequence.charAt(i17) - '0') * 100;
                                                if (iDigitCount3 > 1) {
                                                    int i26 = i17 + 2;
                                                    iCharAt += (charSequence.charAt(i25) - '0') * 10;
                                                    if (iDigitCount3 > 2) {
                                                        i17 += 3;
                                                        iCharAt += charSequence.charAt(i26) - '0';
                                                    } else {
                                                        i17 = i26;
                                                    }
                                                } else {
                                                    i17 = i25;
                                                }
                                            }
                                        } else {
                                            i17 = i24;
                                        }
                                    }
                                    return ~i17;
                                }
                            } else {
                                i17 = i19;
                            }
                        }
                        return ~i17;
                    }
                }
                if (z14) {
                    iCharAt = -iCharAt;
                }
                dateTimeParserBucket.setOffset(Integer.valueOf(iCharAt));
                return i17;
            }
            return ~i15;
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, long j8, Chronology chronology, int i14, DateTimeZone dateTimeZone, Locale locale) throws IOException {
            String str;
            if (dateTimeZone == null) {
                return;
            }
            if (i14 == 0 && (str = this.iZeroOffsetPrintText) != null) {
                appendable.append(str);
                return;
            }
            if (i14 >= 0) {
                appendable.append('+');
            } else {
                appendable.append('-');
                i14 = -i14;
            }
            int i15 = i14 / DateTimeConstants.MILLIS_PER_HOUR;
            FormatUtils.appendPaddedInteger(appendable, i15, 2);
            if (this.iMaxFields == 1) {
                return;
            }
            int i16 = i14 - (i15 * DateTimeConstants.MILLIS_PER_HOUR);
            if (i16 != 0 || this.iMinFields > 1) {
                int i17 = i16 / DateTimeConstants.MILLIS_PER_MINUTE;
                if (this.iShowSeparators) {
                    appendable.append(CoreConstants.COLON_CHAR);
                }
                FormatUtils.appendPaddedInteger(appendable, i17, 2);
                if (this.iMaxFields == 2) {
                    return;
                }
                int i18 = i16 - (i17 * DateTimeConstants.MILLIS_PER_MINUTE);
                if (i18 != 0 || this.iMinFields > 2) {
                    int i19 = i18 / 1000;
                    if (this.iShowSeparators) {
                        appendable.append(CoreConstants.COLON_CHAR);
                    }
                    FormatUtils.appendPaddedInteger(appendable, i19, 2);
                    if (this.iMaxFields == 3) {
                        return;
                    }
                    int i24 = i18 - (i19 * 1000);
                    if (i24 != 0 || this.iMinFields > 3) {
                        if (this.iShowSeparators) {
                            appendable.append('.');
                        }
                        FormatUtils.appendPaddedInteger(appendable, i24, 3);
                    }
                }
            }
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, ReadablePartial readablePartial, Locale locale) {
        }
    }
}
