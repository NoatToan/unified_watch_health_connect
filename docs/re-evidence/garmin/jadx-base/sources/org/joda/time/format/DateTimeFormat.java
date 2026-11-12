package org.joda.time.format;

import ch.qos.logback.core.CoreConstants;
import com.google.firebase.messaging.l;
import fb1.c;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReferenceArray;
import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.ReadablePartial;
import tn.k;
import vb.h;

/* JADX INFO: loaded from: classes3.dex */
public class DateTimeFormat {
    static final int DATE = 0;
    static final int DATETIME = 2;
    static final int FULL = 0;
    static final int LONG = 1;
    static final int MEDIUM = 2;
    static final int NONE = 4;
    private static final int PATTERN_CACHE_SIZE = 500;
    static final int SHORT = 3;
    static final int TIME = 1;
    private static final ConcurrentHashMap<String, DateTimeFormatter> cPatternCache = new ConcurrentHashMap<>();
    private static final AtomicReferenceArray<DateTimeFormatter> cStyleCache = new AtomicReferenceArray<>(25);

    public static class StyleFormatterCacheKey {
        private final int combinedTypeAndStyle;
        private final Locale locale;

        public StyleFormatterCacheKey(int i14, int i15, int i16, Locale locale) {
            this.locale = locale;
            this.combinedTypeAndStyle = i14 + (i15 << 4) + (i16 << 8);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof StyleFormatterCacheKey)) {
                return false;
            }
            StyleFormatterCacheKey styleFormatterCacheKey = (StyleFormatterCacheKey) obj;
            if (this.combinedTypeAndStyle != styleFormatterCacheKey.combinedTypeAndStyle) {
                return false;
            }
            Locale locale = this.locale;
            Locale locale2 = styleFormatterCacheKey.locale;
            if (locale == null) {
                if (locale2 != null) {
                    return false;
                }
            } else if (!locale.equals(locale2)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            int i14 = (this.combinedTypeAndStyle + 31) * 31;
            Locale locale = this.locale;
            return i14 + (locale == null ? 0 : locale.hashCode());
        }
    }

    public static void appendPatternTo(DateTimeFormatterBuilder dateTimeFormatterBuilder, String str) {
        parsePatternTo(dateTimeFormatterBuilder, str);
    }

    private static DateTimeFormatter createDateTimeFormatter(int i14, int i15) {
        int i16;
        if (i14 == 4) {
            i16 = 1;
        } else {
            i16 = i15 == 4 ? 0 : 2;
        }
        StyleFormatter styleFormatter = new StyleFormatter(i14, i15, i16);
        return new DateTimeFormatter(styleFormatter, styleFormatter);
    }

    private static DateTimeFormatter createFormatterForPattern(String str) {
        DateTimeFormatter dateTimeFormatterPutIfAbsent;
        if (str == null || str.length() == 0) {
            h.s("Invalid pattern specification: Pattern is null or empty");
            return null;
        }
        ConcurrentHashMap<String, DateTimeFormatter> concurrentHashMap = cPatternCache;
        DateTimeFormatter formatter = concurrentHashMap.get(str);
        if (formatter == null) {
            DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
            parsePatternTo(dateTimeFormatterBuilder, str);
            formatter = dateTimeFormatterBuilder.toFormatter();
            if (concurrentHashMap.size() < 500 && (dateTimeFormatterPutIfAbsent = concurrentHashMap.putIfAbsent(str, formatter)) != null) {
                return dateTimeFormatterPutIfAbsent;
            }
        }
        return formatter;
    }

    private static DateTimeFormatter createFormatterForStyle(String str) {
        if (str == null || str.length() != 2) {
            h.s(c.n("Invalid style specification: ", str));
            return null;
        }
        int iSelectStyle = selectStyle(str.charAt(0));
        int iSelectStyle2 = selectStyle(str.charAt(1));
        if (iSelectStyle != 4 || iSelectStyle2 != 4) {
            return createFormatterForStyleIndex(iSelectStyle, iSelectStyle2);
        }
        h.s("Style '--' is invalid");
        return null;
    }

    private static DateTimeFormatter createFormatterForStyleIndex(int i14, int i15) {
        int i16 = (i14 << 2) + i14 + i15;
        AtomicReferenceArray<DateTimeFormatter> atomicReferenceArray = cStyleCache;
        if (i16 >= atomicReferenceArray.length()) {
            return createDateTimeFormatter(i14, i15);
        }
        DateTimeFormatter dateTimeFormatter = atomicReferenceArray.get(i16);
        if (dateTimeFormatter != null) {
            return dateTimeFormatter;
        }
        DateTimeFormatter dateTimeFormatterCreateDateTimeFormatter = createDateTimeFormatter(i14, i15);
        while (!atomicReferenceArray.compareAndSet(i16, null, dateTimeFormatterCreateDateTimeFormatter)) {
            if (atomicReferenceArray.get(i16) != null) {
                return cStyleCache.get(i16);
            }
        }
        return dateTimeFormatterCreateDateTimeFormatter;
    }

    public static DateTimeFormatter forPattern(String str) {
        return createFormatterForPattern(str);
    }

    public static DateTimeFormatter forStyle(String str) {
        return createFormatterForStyle(str);
    }

    public static DateTimeFormatter fullDate() {
        return createFormatterForStyleIndex(0, 4);
    }

    public static DateTimeFormatter fullDateTime() {
        return createFormatterForStyleIndex(0, 0);
    }

    public static DateTimeFormatter fullTime() {
        return createFormatterForStyleIndex(4, 0);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0013 A[RETURN] */
    private static boolean isNumericToken(String str) {
        int length = str.length();
        if (length > 0) {
            switch (str.charAt(0)) {
                case 'C':
                case 'D':
                case 'F':
                case 'H':
                case 'K':
                case 'S':
                case 'W':
                case 'Y':
                case 'c':
                case 'd':
                case 'e':
                case 'h':
                case 'k':
                case 'm':
                case 's':
                case 'w':
                case 'x':
                case 'y':
                    return true;
                case 'M':
                    if (length <= 2) {
                        return true;
                    }
                    break;
            }
        }
        return false;
    }

    public static DateTimeFormatter longDate() {
        return createFormatterForStyleIndex(1, 4);
    }

    public static DateTimeFormatter longDateTime() {
        return createFormatterForStyleIndex(1, 1);
    }

    public static DateTimeFormatter longTime() {
        return createFormatterForStyleIndex(4, 1);
    }

    public static DateTimeFormatter mediumDate() {
        return createFormatterForStyleIndex(2, 4);
    }

    public static DateTimeFormatter mediumDateTime() {
        return createFormatterForStyleIndex(2, 2);
    }

    public static DateTimeFormatter mediumTime() {
        return createFormatterForStyleIndex(4, 2);
    }

    /* JADX WARN: Code duplicated, block: B:135:0x017f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:59:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:61:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:62:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:64:0x00df  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:68:0x0105  */
    /* JADX WARN: Code duplicated, block: B:70:0x0114  */
    /* JADX WARN: Code duplicated, block: B:73:0x011c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:74:0x011e  */
    /* JADX WARN: Code duplicated, block: B:77:0x0124  */
    /* JADX WARN: Code duplicated, block: B:78:0x0128  */
    /* JADX WARN: Code duplicated, block: B:79:0x012c  */
    /* JADX WARN: Switch 'out' block B:57:0x00c0 for B:37:0x005d already processed. Defaulting to fallback option. */
    private static void parsePatternTo(DateTimeFormatterBuilder dateTimeFormatterBuilder, String str) {
        int i14;
        boolean z14;
        int length = str.length();
        int[] iArr = new int[1];
        int i15 = 0;
        while (i15 < length) {
            iArr[0] = i15;
            String token = parseToken(str, iArr);
            int i16 = iArr[0];
            int length2 = token.length();
            if (length2 == 0) {
                return;
            }
            char cCharAt = token.charAt(0);
            if (cCharAt == '\'') {
                String strSubstring = token.substring(1);
                if (strSubstring.length() == 1) {
                    dateTimeFormatterBuilder.appendLiteral(strSubstring.charAt(0));
                } else {
                    dateTimeFormatterBuilder.appendLiteral(new String(strSubstring));
                }
            } else if (cCharAt == 'K') {
                dateTimeFormatterBuilder.appendHourOfHalfday(length2);
            } else if (cCharAt != 'M') {
                if (cCharAt == 'S') {
                    dateTimeFormatterBuilder.appendFractionOfSecond(length2, length2);
                } else if (cCharAt == 'a') {
                    dateTimeFormatterBuilder.appendHalfdayOfDayText();
                } else if (cCharAt == 'h') {
                    dateTimeFormatterBuilder.appendClockhourOfHalfday(length2);
                } else if (cCharAt == 'k') {
                    dateTimeFormatterBuilder.appendClockhourOfDay(length2);
                } else if (cCharAt == 'm') {
                    dateTimeFormatterBuilder.appendMinuteOfHour(length2);
                } else if (cCharAt == 's') {
                    dateTimeFormatterBuilder.appendSecondOfMinute(length2);
                } else if (cCharAt == 'G') {
                    dateTimeFormatterBuilder.appendEraText();
                } else if (cCharAt == 'H') {
                    dateTimeFormatterBuilder.appendHourOfDay(length2);
                } else if (cCharAt == 'Y') {
                    if (length2 != 2) {
                        if (i16 + 1 < length) {
                            iArr[0] = iArr[0] + 1;
                            z14 = !isNumericToken(parseToken(str, iArr));
                            iArr[0] = iArr[0] - 1;
                        } else {
                            z14 = true;
                        }
                        if (cCharAt == 'x') {
                            dateTimeFormatterBuilder.appendTwoDigitYear(new DateTime().getYear() - 30, z14);
                        } else {
                            dateTimeFormatterBuilder.appendTwoDigitWeekyear(new DateTime().getWeekyear() - 30, z14);
                        }
                    } else {
                        i14 = 9;
                        if (i16 + 1 < length) {
                            iArr[0] = iArr[0] + 1;
                            i14 = isNumericToken(parseToken(str, iArr)) ? length2 : 9;
                            iArr[0] = iArr[0] - 1;
                        }
                        if (cCharAt != 'Y') {
                            dateTimeFormatterBuilder.appendYearOfEra(length2, i14);
                        } else if (cCharAt != 'x') {
                            dateTimeFormatterBuilder.appendWeekyear(length2, i14);
                        } else if (cCharAt != 'y') {
                            dateTimeFormatterBuilder.appendYear(length2, i14);
                        }
                    }
                } else if (cCharAt != 'Z') {
                    if (cCharAt == 'd') {
                        dateTimeFormatterBuilder.appendDayOfMonth(length2);
                    } else if (cCharAt != 'e') {
                        switch (cCharAt) {
                            case 'C':
                                dateTimeFormatterBuilder.appendCenturyOfEra(length2, length2);
                                continue;
                            case 'D':
                                dateTimeFormatterBuilder.appendDayOfYear(length2);
                                continue;
                            case 'E':
                                if (length2 < 4) {
                                    dateTimeFormatterBuilder.appendDayOfWeekShortText();
                                } else {
                                    dateTimeFormatterBuilder.appendDayOfWeekText();
                                    continue;
                                }
                                break;
                            default:
                                switch (cCharAt) {
                                    case 'w':
                                        dateTimeFormatterBuilder.appendWeekOfWeekyear(length2);
                                        break;
                                    case 'x':
                                    case 'y':
                                        if (length2 != 2) {
                                            i14 = 9;
                                            if (i16 + 1 < length) {
                                                iArr[0] = iArr[0] + 1;
                                                if (isNumericToken(parseToken(str, iArr))) {
                                                }
                                                iArr[0] = iArr[0] - 1;
                                            }
                                            if (cCharAt != 'Y') {
                                                dateTimeFormatterBuilder.appendYearOfEra(length2, i14);
                                            } else if (cCharAt != 'x') {
                                                dateTimeFormatterBuilder.appendWeekyear(length2, i14);
                                            } else if (cCharAt != 'y') {
                                                dateTimeFormatterBuilder.appendYear(length2, i14);
                                            }
                                        } else {
                                            if (i16 + 1 < length) {
                                                iArr[0] = iArr[0] + 1;
                                                z14 = !isNumericToken(parseToken(str, iArr));
                                                iArr[0] = iArr[0] - 1;
                                            } else {
                                                z14 = true;
                                            }
                                            if (cCharAt == 'x') {
                                                dateTimeFormatterBuilder.appendTwoDigitWeekyear(new DateTime().getWeekyear() - 30, z14);
                                            } else {
                                                dateTimeFormatterBuilder.appendTwoDigitYear(new DateTime().getYear() - 30, z14);
                                            }
                                        }
                                        break;
                                    case 'z':
                                        if (length2 < 4) {
                                            dateTimeFormatterBuilder.appendTimeZoneShortName(null);
                                        } else {
                                            dateTimeFormatterBuilder.appendTimeZoneName();
                                            continue;
                                        }
                                        break;
                                    default:
                                        h.s("Illegal pattern component: ".concat(token));
                                        return;
                                }
                                break;
                        }
                    } else {
                        dateTimeFormatterBuilder.appendDayOfWeek(length2);
                    }
                } else if (length2 == 1) {
                    dateTimeFormatterBuilder.appendTimeZoneOffset(null, "Z", false, 2, 2);
                } else if (length2 == 2) {
                    dateTimeFormatterBuilder.appendTimeZoneOffset(null, "Z", true, 2, 2);
                } else {
                    dateTimeFormatterBuilder.appendTimeZoneId();
                }
            } else if (length2 < 3) {
                dateTimeFormatterBuilder.appendMonthOfYear(length2);
            } else if (length2 >= 4) {
                dateTimeFormatterBuilder.appendMonthOfYearText();
            } else {
                dateTimeFormatterBuilder.appendMonthOfYearShortText();
            }
            i15 = i16 + 1;
        }
    }

    private static String parseToken(String str, int[] iArr) {
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

    public static String patternForStyle(String str, Locale locale) {
        DateTimeFormatter dateTimeFormatterCreateFormatterForStyle = createFormatterForStyle(str);
        if (locale == null) {
            locale = Locale.getDefault();
        }
        return ((StyleFormatter) dateTimeFormatterCreateFormatterForStyle.getPrinter0()).getPattern(locale);
    }

    private static int selectStyle(char c14) {
        if (c14 == '-') {
            return 4;
        }
        if (c14 == 'F') {
            return 0;
        }
        if (c14 == 'S') {
            return 3;
        }
        if (c14 == 'L') {
            return 1;
        }
        if (c14 == 'M') {
            return 2;
        }
        h.s(k.f("Invalid style character: ", c14));
        return 0;
    }

    public static DateTimeFormatter shortDate() {
        return createFormatterForStyleIndex(3, 4);
    }

    public static DateTimeFormatter shortDateTime() {
        return createFormatterForStyleIndex(3, 3);
    }

    public static DateTimeFormatter shortTime() {
        return createFormatterForStyleIndex(4, 3);
    }

    public static class StyleFormatter implements InternalPrinter, InternalParser {
        private static final ConcurrentHashMap<StyleFormatterCacheKey, DateTimeFormatter> cCache = new ConcurrentHashMap<>();
        private final int iDateStyle;
        private final int iTimeStyle;
        private final int iType;

        public StyleFormatter(int i14, int i15, int i16) {
            this.iDateStyle = i14;
            this.iTimeStyle = i15;
            this.iType = i16;
        }

        private DateTimeFormatter getFormatter(Locale locale) {
            if (locale == null) {
                locale = Locale.getDefault();
            }
            StyleFormatterCacheKey styleFormatterCacheKey = new StyleFormatterCacheKey(this.iType, this.iDateStyle, this.iTimeStyle, locale);
            ConcurrentHashMap<StyleFormatterCacheKey, DateTimeFormatter> concurrentHashMap = cCache;
            DateTimeFormatter dateTimeFormatter = concurrentHashMap.get(styleFormatterCacheKey);
            if (dateTimeFormatter != null) {
                return dateTimeFormatter;
            }
            DateTimeFormatter dateTimeFormatterForPattern = DateTimeFormat.forPattern(getPattern(locale));
            DateTimeFormatter dateTimeFormatterPutIfAbsent = concurrentHashMap.putIfAbsent(styleFormatterCacheKey, dateTimeFormatterForPattern);
            return dateTimeFormatterPutIfAbsent != null ? dateTimeFormatterPutIfAbsent : dateTimeFormatterForPattern;
        }

        @Override // org.joda.time.format.InternalParser
        public int estimateParsedLength() {
            return 40;
        }

        @Override // org.joda.time.format.InternalPrinter
        public int estimatePrintedLength() {
            return 40;
        }

        public String getPattern(Locale locale) {
            DateFormat dateInstance;
            int i14 = this.iType;
            if (i14 == 0) {
                dateInstance = DateFormat.getDateInstance(this.iDateStyle, locale);
            } else if (i14 != 1) {
                dateInstance = i14 != 2 ? null : DateFormat.getDateTimeInstance(this.iDateStyle, this.iTimeStyle, locale);
            } else {
                dateInstance = DateFormat.getTimeInstance(this.iTimeStyle, locale);
            }
            if (dateInstance instanceof SimpleDateFormat) {
                return ((SimpleDateFormat) dateInstance).toPattern();
            }
            l.j(locale, "No datetime pattern for locale: ");
            return null;
        }

        @Override // org.joda.time.format.InternalParser
        public int parseInto(DateTimeParserBucket dateTimeParserBucket, CharSequence charSequence, int i14) {
            return getFormatter(dateTimeParserBucket.getLocale()).getParser0().parseInto(dateTimeParserBucket, charSequence, i14);
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, long j8, Chronology chronology, int i14, DateTimeZone dateTimeZone, Locale locale) {
            getFormatter(locale).getPrinter0().printTo(appendable, j8, chronology, i14, dateTimeZone, locale);
        }

        @Override // org.joda.time.format.InternalPrinter
        public void printTo(Appendable appendable, ReadablePartial readablePartial, Locale locale) {
            getFormatter(locale).getPrinter0().printTo(appendable, readablePartial, locale);
        }
    }
}
