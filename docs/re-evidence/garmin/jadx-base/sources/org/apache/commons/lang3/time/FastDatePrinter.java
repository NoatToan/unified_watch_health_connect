package org.apache.commons.lang3.time;

import ch.qos.logback.core.CoreConstants;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.text.DateFormatSymbols;
import java.text.FieldPosition;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import org.apache.commons.lang3.LocaleUtils;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.joda.time.DateTimeConstants;
import vb.h;

/* JADX INFO: loaded from: classes3.dex */
public class FastDatePrinter implements DatePrinter, Serializable {
    public static final int FULL = 0;
    public static final int LONG = 1;
    private static final int MAX_DIGITS = 10;
    public static final int MEDIUM = 2;
    public static final int SHORT = 3;
    private static final long serialVersionUID = 1;
    private final Locale mLocale;
    private transient int mMaxLengthEstimate;
    private final String mPattern;
    private transient Rule[] mRules;
    private final TimeZone mTimeZone;
    private static final Rule[] EMPTY_RULE_ARRAY = new Rule[0];
    private static final ConcurrentMap<TimeZoneDisplayKey, String> cTimeZoneDisplayCache = new ConcurrentHashMap(7);

    public static class CharacterLiteral implements Rule {
        private final char mValue;

        public CharacterLiteral(char c14) {
            this.mValue = c14;
        }

        @Override // org.apache.commons.lang3.time.FastDatePrinter.Rule
        public void appendTo(Appendable appendable, Calendar calendar) throws IOException {
            appendable.append(this.mValue);
        }

        @Override // org.apache.commons.lang3.time.FastDatePrinter.Rule
        public int estimateLength() {
            return 1;
        }
    }

    public static class Iso8601_Rule implements Rule {
        final int length;
        static final Iso8601_Rule ISO8601_HOURS = new Iso8601_Rule(3);
        static final Iso8601_Rule ISO8601_HOURS_MINUTES = new Iso8601_Rule(5);
        static final Iso8601_Rule ISO8601_HOURS_COLON_MINUTES = new Iso8601_Rule(6);

        public Iso8601_Rule(int i14) {
            this.length = i14;
        }

        public static Iso8601_Rule getRule(int i14) {
            if (i14 == 1) {
                return ISO8601_HOURS;
            }
            if (i14 == 2) {
                return ISO8601_HOURS_MINUTES;
            }
            if (i14 == 3) {
                return ISO8601_HOURS_COLON_MINUTES;
            }
            h.s("invalid number of X");
            return null;
        }

        @Override // org.apache.commons.lang3.time.FastDatePrinter.Rule
        public void appendTo(Appendable appendable, Calendar calendar) throws IOException {
            int i14 = calendar.get(16) + calendar.get(15);
            if (i14 == 0) {
                appendable.append("Z");
                return;
            }
            if (i14 < 0) {
                appendable.append('-');
                i14 = -i14;
            } else {
                appendable.append('+');
            }
            int i15 = i14 / DateTimeConstants.MILLIS_PER_HOUR;
            FastDatePrinter.appendDigits(appendable, i15);
            int i16 = this.length;
            if (i16 < 5) {
                return;
            }
            if (i16 == 6) {
                appendable.append(CoreConstants.COLON_CHAR);
            }
            FastDatePrinter.appendDigits(appendable, (i14 / DateTimeConstants.MILLIS_PER_MINUTE) - (i15 * 60));
        }

        @Override // org.apache.commons.lang3.time.FastDatePrinter.Rule
        public int estimateLength() {
            return this.length;
        }
    }

    public interface NumberRule extends Rule {
        void appendTo(Appendable appendable, int i14);
    }

    public interface Rule {
        void appendTo(Appendable appendable, Calendar calendar);

        int estimateLength();
    }

    public static class StringLiteral implements Rule {
        private final String mValue;

        public StringLiteral(String str) {
            this.mValue = str;
        }

        @Override // org.apache.commons.lang3.time.FastDatePrinter.Rule
        public void appendTo(Appendable appendable, Calendar calendar) throws IOException {
            appendable.append(this.mValue);
        }

        @Override // org.apache.commons.lang3.time.FastDatePrinter.Rule
        public int estimateLength() {
            return this.mValue.length();
        }
    }

    public static class TextField implements Rule {
        private final int mField;
        private final String[] mValues;

        public TextField(int i14, String[] strArr) {
            this.mField = i14;
            this.mValues = strArr;
        }

        @Override // org.apache.commons.lang3.time.FastDatePrinter.Rule
        public void appendTo(Appendable appendable, Calendar calendar) throws IOException {
            appendable.append(this.mValues[calendar.get(this.mField)]);
        }

        @Override // org.apache.commons.lang3.time.FastDatePrinter.Rule
        public int estimateLength() {
            int length = this.mValues.length;
            int i14 = 0;
            while (true) {
                length--;
                if (length < 0) {
                    return i14;
                }
                int length2 = this.mValues[length].length();
                if (length2 > i14) {
                    i14 = length2;
                }
            }
        }
    }

    public static class TimeZoneDisplayKey {
        private final Locale mLocale;
        private final int mStyle;
        private final TimeZone mTimeZone;

        public TimeZoneDisplayKey(TimeZone timeZone, boolean z14, int i14, Locale locale) {
            this.mTimeZone = timeZone;
            if (z14) {
                this.mStyle = Integer.MIN_VALUE | i14;
            } else {
                this.mStyle = i14;
            }
            this.mLocale = LocaleUtils.toLocale(locale);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof TimeZoneDisplayKey) {
                TimeZoneDisplayKey timeZoneDisplayKey = (TimeZoneDisplayKey) obj;
                if (this.mTimeZone.equals(timeZoneDisplayKey.mTimeZone) && this.mStyle == timeZoneDisplayKey.mStyle && this.mLocale.equals(timeZoneDisplayKey.mLocale)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return this.mTimeZone.hashCode() + ((this.mLocale.hashCode() + (this.mStyle * 31)) * 31);
        }
    }

    public static class TimeZoneNameRule implements Rule {
        private final String mDaylight;
        private final Locale mLocale;
        private final String mStandard;
        private final int mStyle;

        public TimeZoneNameRule(TimeZone timeZone, Locale locale, int i14) {
            this.mLocale = LocaleUtils.toLocale(locale);
            this.mStyle = i14;
            this.mStandard = FastDatePrinter.getTimeZoneDisplay(timeZone, false, i14, locale);
            this.mDaylight = FastDatePrinter.getTimeZoneDisplay(timeZone, true, i14, locale);
        }

        @Override // org.apache.commons.lang3.time.FastDatePrinter.Rule
        public void appendTo(Appendable appendable, Calendar calendar) throws IOException {
            TimeZone timeZone = calendar.getTimeZone();
            int i14 = calendar.get(16);
            int i15 = this.mStyle;
            if (i14 == 0) {
                appendable.append(FastDatePrinter.getTimeZoneDisplay(timeZone, false, i15, this.mLocale));
            } else {
                appendable.append(FastDatePrinter.getTimeZoneDisplay(timeZone, true, i15, this.mLocale));
            }
        }

        @Override // org.apache.commons.lang3.time.FastDatePrinter.Rule
        public int estimateLength() {
            return Math.max(this.mStandard.length(), this.mDaylight.length());
        }
    }

    public static class TimeZoneNumberRule implements Rule {
        static final TimeZoneNumberRule INSTANCE_COLON = new TimeZoneNumberRule(true);
        static final TimeZoneNumberRule INSTANCE_NO_COLON = new TimeZoneNumberRule(false);
        final boolean mColon;

        public TimeZoneNumberRule(boolean z14) {
            this.mColon = z14;
        }

        @Override // org.apache.commons.lang3.time.FastDatePrinter.Rule
        public void appendTo(Appendable appendable, Calendar calendar) throws IOException {
            int i14 = calendar.get(16) + calendar.get(15);
            if (i14 < 0) {
                appendable.append('-');
                i14 = -i14;
            } else {
                appendable.append('+');
            }
            int i15 = i14 / DateTimeConstants.MILLIS_PER_HOUR;
            FastDatePrinter.appendDigits(appendable, i15);
            if (this.mColon) {
                appendable.append(CoreConstants.COLON_CHAR);
            }
            FastDatePrinter.appendDigits(appendable, (i14 / DateTimeConstants.MILLIS_PER_MINUTE) - (i15 * 60));
        }

        @Override // org.apache.commons.lang3.time.FastDatePrinter.Rule
        public int estimateLength() {
            return 5;
        }
    }

    public FastDatePrinter(String str, TimeZone timeZone, Locale locale) {
        this.mPattern = str;
        this.mTimeZone = timeZone;
        this.mLocale = LocaleUtils.toLocale(locale);
        init();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void appendDigits(Appendable appendable, int i14) throws IOException {
        appendable.append((char) ((i14 / 10) + 48));
        appendable.append((char) ((i14 % 10) + 48));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void appendFullDigits(Appendable appendable, int i14, int i15) throws IOException {
        int i16;
        if (i14 < 10000) {
            if (i14 >= 1000) {
                i16 = 4;
            } else if (i14 < 100) {
                i16 = i14 < 10 ? 1 : 2;
            } else {
                i16 = 3;
            }
            for (int i17 = i15 - i16; i17 > 0; i17--) {
                appendable.append('0');
            }
            if (i16 != 1) {
                if (i16 != 2) {
                    if (i16 != 3) {
                        if (i16 != 4) {
                            return;
                        }
                        appendable.append((char) ((i14 / 1000) + 48));
                        i14 %= 1000;
                    }
                    if (i14 >= 100) {
                        appendable.append((char) ((i14 / 100) + 48));
                        i14 %= 100;
                    } else {
                        appendable.append('0');
                    }
                }
                if (i14 >= 10) {
                    appendable.append((char) ((i14 / 10) + 48));
                    i14 %= 10;
                } else {
                    appendable.append('0');
                }
            }
            appendable.append((char) (i14 + 48));
            return;
        }
        char[] cArr = new char[10];
        int i18 = 0;
        while (i14 != 0) {
            cArr[i18] = (char) ((i14 % 10) + 48);
            i14 /= 10;
            i18++;
        }
        while (i18 < i15) {
            appendable.append('0');
            i15--;
        }
        while (true) {
            i18--;
            if (i18 < 0) {
                return;
            } else {
                appendable.append(cArr[i18]);
            }
        }
    }

    private <B extends Appendable> B applyRules(Calendar calendar, B b14) {
        try {
            for (Rule rule : this.mRules) {
                rule.appendTo(b14, calendar);
            }
            return b14;
        } catch (IOException e4) {
            ExceptionUtils.rethrow(e4);
            return b14;
        }
    }

    private String applyRulesToString(Calendar calendar) {
        return ((StringBuilder) applyRules(calendar, new StringBuilder(this.mMaxLengthEstimate))).toString();
    }

    public static String getTimeZoneDisplay(TimeZone timeZone, boolean z14, int i14, Locale locale) {
        TimeZoneDisplayKey timeZoneDisplayKey = new TimeZoneDisplayKey(timeZone, z14, i14, locale);
        ConcurrentMap<TimeZoneDisplayKey, String> concurrentMap = cTimeZoneDisplayCache;
        String str = concurrentMap.get(timeZoneDisplayKey);
        if (str != null) {
            return str;
        }
        String displayName = timeZone.getDisplayName(z14, i14, locale);
        String strPutIfAbsent = concurrentMap.putIfAbsent(timeZoneDisplayKey, displayName);
        return strPutIfAbsent != null ? strPutIfAbsent : displayName;
    }

    private void init() {
        Rule[] ruleArr = (Rule[]) parsePattern().toArray(EMPTY_RULE_ARRAY);
        this.mRules = ruleArr;
        int length = ruleArr.length;
        int iEstimateLength = 0;
        while (true) {
            length--;
            if (length < 0) {
                this.mMaxLengthEstimate = iEstimateLength;
                return;
            }
            iEstimateLength += this.mRules[length].estimateLength();
        }
    }

    private Calendar newCalendar() {
        return Calendar.getInstance(this.mTimeZone, this.mLocale);
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        init();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof FastDatePrinter)) {
            return false;
        }
        FastDatePrinter fastDatePrinter = (FastDatePrinter) obj;
        return this.mPattern.equals(fastDatePrinter.mPattern) && this.mTimeZone.equals(fastDatePrinter.mTimeZone) && this.mLocale.equals(fastDatePrinter.mLocale);
    }

    @Override // org.apache.commons.lang3.time.DatePrinter
    @Deprecated
    public StringBuffer format(Object obj, StringBuffer stringBuffer, FieldPosition fieldPosition) {
        if (obj instanceof Date) {
            return format((Date) obj, stringBuffer);
        }
        if (obj instanceof Calendar) {
            return format((Calendar) obj, stringBuffer);
        }
        if (obj instanceof Long) {
            return format(((Long) obj).longValue(), stringBuffer);
        }
        throw new IllegalArgumentException("Unknown class: ".concat(obj == null ? "<null>" : obj.getClass().getName()));
    }

    @Override // org.apache.commons.lang3.time.DatePrinter
    public Locale getLocale() {
        return this.mLocale;
    }

    public int getMaxLengthEstimate() {
        return this.mMaxLengthEstimate;
    }

    @Override // org.apache.commons.lang3.time.DatePrinter
    public String getPattern() {
        return this.mPattern;
    }

    @Override // org.apache.commons.lang3.time.DatePrinter
    public TimeZone getTimeZone() {
        return this.mTimeZone;
    }

    public int hashCode() {
        return (((this.mLocale.hashCode() * 13) + this.mTimeZone.hashCode()) * 13) + this.mPattern.hashCode();
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0076  */
    /* JADX WARN: Code duplicated, block: B:65:0x0159  */
    /* JADX WARN: Code duplicated, block: B:66:0x015c  */
    /* JADX WARN: Code duplicated, block: B:69:0x0169  */
    /* JADX WARN: Code duplicated, block: B:78:0x016f A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v38 */
    /* JADX WARN: Type inference failed for: r11v42, types: [org.apache.commons.lang3.time.FastDatePrinter$TextField] */
    /* JADX WARN: Type inference failed for: r11v5, types: [org.apache.commons.lang3.time.FastDatePrinter$NumberRule] */
    /* JADX WARN: Type inference failed for: r11v51 */
    /* JADX WARN: Type inference failed for: r11v52 */
    /* JADX WARN: Type inference failed for: r11v53 */
    /* JADX WARN: Type inference failed for: r11v54 */
    /* JADX WARN: Type inference failed for: r11v55 */
    /* JADX WARN: Type inference failed for: r11v56 */
    /* JADX WARN: Type inference failed for: r11v57 */
    /* JADX WARN: Type inference failed for: r11v58 */
    /* JADX WARN: Type inference failed for: r11v59 */
    /* JADX WARN: Type inference failed for: r11v60 */
    /* JADX WARN: Type inference failed for: r11v61 */
    /* JADX WARN: Type inference failed for: r11v62 */
    /* JADX WARN: Type inference failed for: r11v63 */
    /* JADX WARN: Type inference failed for: r11v64 */
    /* JADX WARN: Type inference failed for: r11v65 */
    /* JADX WARN: Type inference failed for: r11v66 */
    /* JADX WARN: Type inference failed for: r11v67 */
    /* JADX WARN: Type inference failed for: r11v68 */
    /* JADX WARN: Type inference failed for: r11v69 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v70 */
    /* JADX WARN: Type inference failed for: r11v71 */
    /* JADX WARN: Type inference failed for: r11v72 */
    /* JADX WARN: Type inference failed for: r11v73 */
    /* JADX WARN: Type inference failed for: r11v74 */
    /* JADX WARN: Type inference failed for: r11v8, types: [java.lang.Object] */
    public List<Rule> parsePattern() {
        int i14;
        ?? textField;
        Object weekYear;
        Object timeZoneNameRule;
        DateFormatSymbols dateFormatSymbols = new DateFormatSymbols(this.mLocale);
        ArrayList arrayList = new ArrayList();
        String[] eras = dateFormatSymbols.getEras();
        String[] months = dateFormatSymbols.getMonths();
        String[] shortMonths = dateFormatSymbols.getShortMonths();
        String[] weekdays = dateFormatSymbols.getWeekdays();
        String[] shortWeekdays = dateFormatSymbols.getShortWeekdays();
        String[] amPmStrings = dateFormatSymbols.getAmPmStrings();
        int length = this.mPattern.length();
        int i15 = 0;
        int i16 = 0;
        while (i16 < length) {
            int[] iArr = {i16};
            String token = parseToken(this.mPattern, iArr);
            int i17 = iArr[i15];
            int length2 = token.length();
            if (length2 == 0) {
                return arrayList;
            }
            char cCharAt = token.charAt(i15);
            if (cCharAt == 'y') {
                i14 = 0;
                if (length2 == 2) {
                    textField = TwoDigitYearField.INSTANCE;
                } else {
                    textField = selectNumberRule(1, Math.max(length2, 4));
                }
                if (cCharAt == 'Y') {
                    weekYear = new WeekYear(textField);
                    textField = weekYear;
                }
            } else {
                if (cCharAt != 'z') {
                    switch (cCharAt) {
                        case '\'':
                            String strSubstring = token.substring(1);
                            timeZoneNameRule = strSubstring.length() != 1 ? new StringLiteral(strSubstring) : new CharacterLiteral(strSubstring.charAt(0));
                            break;
                        case 'K':
                            textField = selectNumberRule(10, length2);
                            i14 = 0;
                            break;
                        case 'M':
                            if (length2 >= 4) {
                                textField = new TextField(2, months);
                            } else if (length2 == 3) {
                                textField = new TextField(2, shortMonths);
                            } else {
                                textField = length2 == 2 ? TwoDigitMonthField.INSTANCE : UnpaddedMonthField.INSTANCE;
                            }
                            i14 = 0;
                            break;
                        case 'S':
                            textField = selectNumberRule(14, length2);
                            i14 = 0;
                            break;
                        case 'a':
                            textField = new TextField(9, amPmStrings);
                            i14 = 0;
                            break;
                        case 'd':
                            textField = selectNumberRule(5, length2);
                            i14 = 0;
                            break;
                        case 'h':
                            textField = new TwelveHourField(selectNumberRule(10, length2));
                            i14 = 0;
                            break;
                        case 'k':
                            textField = new TwentyFourHourField(selectNumberRule(11, length2));
                            i14 = 0;
                            break;
                        case 'm':
                            textField = selectNumberRule(12, length2);
                            i14 = 0;
                            break;
                        case 's':
                            textField = selectNumberRule(13, length2);
                            i14 = 0;
                            break;
                        case 'u':
                            textField = new DayInWeekField(selectNumberRule(7, length2));
                            i14 = 0;
                            break;
                        case 'w':
                            textField = selectNumberRule(3, length2);
                            i14 = 0;
                            break;
                        default:
                            switch (cCharAt) {
                                case 'D':
                                    textField = selectNumberRule(6, length2);
                                    i14 = 0;
                                    break;
                                case 'E':
                                    textField = new TextField(7, length2 < 4 ? shortWeekdays : weekdays);
                                    i14 = 0;
                                    break;
                                case 'F':
                                    textField = selectNumberRule(8, length2);
                                    i14 = 0;
                                    break;
                                case 'G':
                                    textField = new TextField(0, eras);
                                    i14 = 0;
                                    break;
                                case 'H':
                                    textField = selectNumberRule(11, length2);
                                    i14 = 0;
                                    break;
                                default:
                                    switch (cCharAt) {
                                        case 'W':
                                            textField = selectNumberRule(4, length2);
                                            i14 = 0;
                                            break;
                                        case 'X':
                                            textField = Iso8601_Rule.getRule(length2);
                                            i14 = 0;
                                            break;
                                        case 'Y':
                                            i14 = 0;
                                            if (length2 == 2) {
                                                textField = TwoDigitYearField.INSTANCE;
                                            } else {
                                                textField = selectNumberRule(1, Math.max(length2, 4));
                                            }
                                            if (cCharAt == 'Y') {
                                                weekYear = new WeekYear(textField);
                                                textField = weekYear;
                                            }
                                            break;
                                        case 'Z':
                                            textField = length2 == 1 ? TimeZoneNumberRule.INSTANCE_NO_COLON : length2 == 2 ? Iso8601_Rule.ISO8601_HOURS_COLON_MINUTES : TimeZoneNumberRule.INSTANCE_COLON;
                                            i14 = 0;
                                            break;
                                        default:
                                            h.s("Illegal pattern component: ".concat(token));
                                            return null;
                                    }
                                    break;
                            }
                            break;
                    }
                } else {
                    TimeZone timeZone = this.mTimeZone;
                    if (length2 >= 4) {
                        timeZoneNameRule = new TimeZoneNameRule(timeZone, this.mLocale, 1);
                    } else {
                        i14 = 0;
                        weekYear = new TimeZoneNameRule(timeZone, this.mLocale, 0);
                        textField = weekYear;
                    }
                }
                textField = timeZoneNameRule;
                i14 = 0;
            }
            arrayList.add(textField);
            i16 = i17 + 1;
            i15 = i14;
        }
        return arrayList;
    }

    public String parseToken(String str, int[] iArr) {
        StringBuilder sb3 = new StringBuilder();
        int i14 = iArr[0];
        int length = str.length();
        char cCharAt = str.charAt(i14);
        if ((cCharAt < 'A' || cCharAt > 'Z') && (cCharAt < 'a' || cCharAt > 'z')) {
            sb3.append(CoreConstants.SINGLE_QUOTE_CHAR);
            boolean z14 = false;
            while (i14 < length) {
                char cCharAt2 = str.charAt(i14);
                if (cCharAt2 != '\'') {
                    if (!z14 && ((cCharAt2 >= 'A' && cCharAt2 <= 'Z') || (cCharAt2 >= 'a' && cCharAt2 <= 'z'))) {
                        i14--;
                        break;
                    }
                    sb3.append(cCharAt2);
                } else {
                    int i15 = i14 + 1;
                    if (i15 >= length || str.charAt(i15) != '\'') {
                        z14 = !z14;
                    } else {
                        sb3.append(cCharAt2);
                        i14 = i15;
                    }
                }
                i14++;
            }
        } else {
            sb3.append(cCharAt);
            while (true) {
                int i16 = i14 + 1;
                if (i16 >= length || str.charAt(i16) != cCharAt) {
                    break;
                }
                sb3.append(cCharAt);
                i14 = i16;
            }
        }
        iArr[0] = i14;
        return sb3.toString();
    }

    public NumberRule selectNumberRule(int i14, int i15) {
        if (i15 != 1) {
            return i15 != 2 ? new PaddedNumberField(i14, i15) : new TwoDigitNumberField(i14);
        }
        return new UnpaddedNumberField(i14);
    }

    public String toString() {
        return "FastDatePrinter[" + this.mPattern + "," + this.mLocale + "," + this.mTimeZone.getID() + "]";
    }

    public static class PaddedNumberField implements NumberRule {
        private final int mField;
        private final int mSize;

        public PaddedNumberField(int i14, int i15) {
            if (i15 < 3) {
                h.w();
                throw null;
            }
            this.mField = i14;
            this.mSize = i15;
        }

        @Override // org.apache.commons.lang3.time.FastDatePrinter.Rule
        public void appendTo(Appendable appendable, Calendar calendar) throws IOException {
            appendTo(appendable, calendar.get(this.mField));
        }

        @Override // org.apache.commons.lang3.time.FastDatePrinter.Rule
        public int estimateLength() {
            return this.mSize;
        }

        @Override // org.apache.commons.lang3.time.FastDatePrinter.NumberRule
        public final void appendTo(Appendable appendable, int i14) throws IOException {
            FastDatePrinter.appendFullDigits(appendable, i14, this.mSize);
        }
    }

    public static class WeekYear implements NumberRule {
        private final NumberRule mRule;

        public WeekYear(NumberRule numberRule) {
            this.mRule = numberRule;
        }

        @Override // org.apache.commons.lang3.time.FastDatePrinter.Rule
        public void appendTo(Appendable appendable, Calendar calendar) {
            this.mRule.appendTo(appendable, calendar.getWeekYear());
        }

        @Override // org.apache.commons.lang3.time.FastDatePrinter.Rule
        public int estimateLength() {
            return this.mRule.estimateLength();
        }

        @Override // org.apache.commons.lang3.time.FastDatePrinter.NumberRule
        public void appendTo(Appendable appendable, int i14) {
            this.mRule.appendTo(appendable, i14);
        }
    }

    public static class TwoDigitMonthField implements NumberRule {
        static final TwoDigitMonthField INSTANCE = new TwoDigitMonthField();

        @Override // org.apache.commons.lang3.time.FastDatePrinter.Rule
        public void appendTo(Appendable appendable, Calendar calendar) throws IOException {
            appendTo(appendable, calendar.get(2) + 1);
        }

        @Override // org.apache.commons.lang3.time.FastDatePrinter.Rule
        public int estimateLength() {
            return 2;
        }

        @Override // org.apache.commons.lang3.time.FastDatePrinter.NumberRule
        public final void appendTo(Appendable appendable, int i14) throws IOException {
            FastDatePrinter.appendDigits(appendable, i14);
        }
    }

    public static class TwoDigitYearField implements NumberRule {
        static final TwoDigitYearField INSTANCE = new TwoDigitYearField();

        @Override // org.apache.commons.lang3.time.FastDatePrinter.Rule
        public void appendTo(Appendable appendable, Calendar calendar) throws IOException {
            appendTo(appendable, calendar.get(1) % 100);
        }

        @Override // org.apache.commons.lang3.time.FastDatePrinter.Rule
        public int estimateLength() {
            return 2;
        }

        @Override // org.apache.commons.lang3.time.FastDatePrinter.NumberRule
        public final void appendTo(Appendable appendable, int i14) throws IOException {
            FastDatePrinter.appendDigits(appendable, i14 % 100);
        }
    }

    public static class TwoDigitNumberField implements NumberRule {
        private final int mField;

        public TwoDigitNumberField(int i14) {
            this.mField = i14;
        }

        @Override // org.apache.commons.lang3.time.FastDatePrinter.NumberRule
        public final void appendTo(Appendable appendable, int i14) throws IOException {
            if (i14 < 100) {
                FastDatePrinter.appendDigits(appendable, i14);
            } else {
                FastDatePrinter.appendFullDigits(appendable, i14, 2);
            }
        }

        @Override // org.apache.commons.lang3.time.FastDatePrinter.Rule
        public int estimateLength() {
            return 2;
        }

        @Override // org.apache.commons.lang3.time.FastDatePrinter.Rule
        public void appendTo(Appendable appendable, Calendar calendar) throws IOException {
            appendTo(appendable, calendar.get(this.mField));
        }
    }

    public static class UnpaddedMonthField implements NumberRule {
        static final UnpaddedMonthField INSTANCE = new UnpaddedMonthField();

        @Override // org.apache.commons.lang3.time.FastDatePrinter.NumberRule
        public final void appendTo(Appendable appendable, int i14) throws IOException {
            if (i14 < 10) {
                appendable.append((char) (i14 + 48));
            } else {
                FastDatePrinter.appendDigits(appendable, i14);
            }
        }

        @Override // org.apache.commons.lang3.time.FastDatePrinter.Rule
        public int estimateLength() {
            return 2;
        }

        @Override // org.apache.commons.lang3.time.FastDatePrinter.Rule
        public void appendTo(Appendable appendable, Calendar calendar) throws IOException {
            appendTo(appendable, calendar.get(2) + 1);
        }
    }

    public static class DayInWeekField implements NumberRule {
        private final NumberRule mRule;

        public DayInWeekField(NumberRule numberRule) {
            this.mRule = numberRule;
        }

        @Override // org.apache.commons.lang3.time.FastDatePrinter.Rule
        public void appendTo(Appendable appendable, Calendar calendar) {
            int i14 = calendar.get(7);
            this.mRule.appendTo(appendable, i14 != 1 ? i14 - 1 : 7);
        }

        @Override // org.apache.commons.lang3.time.FastDatePrinter.Rule
        public int estimateLength() {
            return this.mRule.estimateLength();
        }

        @Override // org.apache.commons.lang3.time.FastDatePrinter.NumberRule
        public void appendTo(Appendable appendable, int i14) {
            this.mRule.appendTo(appendable, i14);
        }
    }

    public static class TwelveHourField implements NumberRule {
        private final NumberRule mRule;

        public TwelveHourField(NumberRule numberRule) {
            this.mRule = numberRule;
        }

        @Override // org.apache.commons.lang3.time.FastDatePrinter.Rule
        public void appendTo(Appendable appendable, Calendar calendar) {
            int leastMaximum = calendar.get(10);
            if (leastMaximum == 0) {
                leastMaximum = calendar.getLeastMaximum(10) + 1;
            }
            this.mRule.appendTo(appendable, leastMaximum);
        }

        @Override // org.apache.commons.lang3.time.FastDatePrinter.Rule
        public int estimateLength() {
            return this.mRule.estimateLength();
        }

        @Override // org.apache.commons.lang3.time.FastDatePrinter.NumberRule
        public void appendTo(Appendable appendable, int i14) {
            this.mRule.appendTo(appendable, i14);
        }
    }

    public static class TwentyFourHourField implements NumberRule {
        private final NumberRule mRule;

        public TwentyFourHourField(NumberRule numberRule) {
            this.mRule = numberRule;
        }

        @Override // org.apache.commons.lang3.time.FastDatePrinter.Rule
        public void appendTo(Appendable appendable, Calendar calendar) {
            int maximum = calendar.get(11);
            if (maximum == 0) {
                maximum = calendar.getMaximum(11) + 1;
            }
            this.mRule.appendTo(appendable, maximum);
        }

        @Override // org.apache.commons.lang3.time.FastDatePrinter.Rule
        public int estimateLength() {
            return this.mRule.estimateLength();
        }

        @Override // org.apache.commons.lang3.time.FastDatePrinter.NumberRule
        public void appendTo(Appendable appendable, int i14) {
            this.mRule.appendTo(appendable, i14);
        }
    }

    @Deprecated
    public StringBuffer applyRules(Calendar calendar, StringBuffer stringBuffer) {
        return (StringBuffer) applyRules(calendar, stringBuffer);
    }

    public static class UnpaddedNumberField implements NumberRule {
        private final int mField;

        public UnpaddedNumberField(int i14) {
            this.mField = i14;
        }

        @Override // org.apache.commons.lang3.time.FastDatePrinter.NumberRule
        public final void appendTo(Appendable appendable, int i14) throws IOException {
            if (i14 < 10) {
                appendable.append((char) (i14 + 48));
            } else if (i14 < 100) {
                FastDatePrinter.appendDigits(appendable, i14);
            } else {
                FastDatePrinter.appendFullDigits(appendable, i14, 1);
            }
        }

        @Override // org.apache.commons.lang3.time.FastDatePrinter.Rule
        public int estimateLength() {
            return 4;
        }

        @Override // org.apache.commons.lang3.time.FastDatePrinter.Rule
        public void appendTo(Appendable appendable, Calendar calendar) throws IOException {
            appendTo(appendable, calendar.get(this.mField));
        }
    }

    public String format(Object obj) {
        if (obj instanceof Date) {
            return format((Date) obj);
        }
        if (obj instanceof Calendar) {
            return format((Calendar) obj);
        }
        if (obj instanceof Long) {
            return format(((Long) obj).longValue());
        }
        throw new IllegalArgumentException("Unknown class: ".concat(obj == null ? "<null>" : obj.getClass().getName()));
    }

    @Override // org.apache.commons.lang3.time.DatePrinter
    public String format(long j8) {
        Calendar calendarNewCalendar = newCalendar();
        calendarNewCalendar.setTimeInMillis(j8);
        return applyRulesToString(calendarNewCalendar);
    }

    @Override // org.apache.commons.lang3.time.DatePrinter
    public String format(Date date) {
        Calendar calendarNewCalendar = newCalendar();
        calendarNewCalendar.setTime(date);
        return applyRulesToString(calendarNewCalendar);
    }

    @Override // org.apache.commons.lang3.time.DatePrinter
    public String format(Calendar calendar) {
        return ((StringBuilder) format(calendar, new StringBuilder(this.mMaxLengthEstimate))).toString();
    }

    @Override // org.apache.commons.lang3.time.DatePrinter
    public StringBuffer format(long j8, StringBuffer stringBuffer) {
        Calendar calendarNewCalendar = newCalendar();
        calendarNewCalendar.setTimeInMillis(j8);
        return (StringBuffer) applyRules(calendarNewCalendar, stringBuffer);
    }

    @Override // org.apache.commons.lang3.time.DatePrinter
    public StringBuffer format(Date date, StringBuffer stringBuffer) {
        Calendar calendarNewCalendar = newCalendar();
        calendarNewCalendar.setTime(date);
        return (StringBuffer) applyRules(calendarNewCalendar, stringBuffer);
    }

    @Override // org.apache.commons.lang3.time.DatePrinter
    public StringBuffer format(Calendar calendar, StringBuffer stringBuffer) {
        return format(calendar.getTime(), stringBuffer);
    }

    @Override // org.apache.commons.lang3.time.DatePrinter
    public <B extends Appendable> B format(long j8, B b14) {
        Calendar calendarNewCalendar = newCalendar();
        calendarNewCalendar.setTimeInMillis(j8);
        return (B) applyRules(calendarNewCalendar, b14);
    }

    @Override // org.apache.commons.lang3.time.DatePrinter
    public <B extends Appendable> B format(Date date, B b14) {
        Calendar calendarNewCalendar = newCalendar();
        calendarNewCalendar.setTime(date);
        return (B) applyRules(calendarNewCalendar, b14);
    }

    @Override // org.apache.commons.lang3.time.DatePrinter
    public <B extends Appendable> B format(Calendar calendar, B b14) {
        if (!calendar.getTimeZone().equals(this.mTimeZone)) {
            calendar = (Calendar) calendar.clone();
            calendar.setTimeZone(this.mTimeZone);
        }
        return (B) applyRules(calendar, b14);
    }
}
