package org.apache.commons.lang3.time;

import am.j;
import com.mapbox.maps.p;
import com.nimbusds.jose.shaded.gson.internal.a;
import fb1.c;
import i3.e5;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.text.DateFormatSymbols;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.commons.lang3.LocaleUtils;
import u62.z;
import vb.h;

/* JADX INFO: loaded from: classes3.dex */
public class FastDateParser implements DateParser, Serializable {
    private static final long serialVersionUID = 3;
    private final int century;
    private final Locale locale;
    private final String pattern;
    private transient List<StrategyAndWidth> patterns;
    private final int startYear;
    private final TimeZone timeZone;
    static final Locale JAPANESE_IMPERIAL = new Locale("ja", "JP", "JP");
    private static final Comparator<String> LONGER_FIRST_LOWERCASE = Comparator.reverseOrder();
    private static final ConcurrentMap<Locale, Strategy>[] caches = new ConcurrentMap[17];
    private static final Strategy ABBREVIATED_YEAR_STRATEGY = new NumberStrategy(1) { // from class: org.apache.commons.lang3.time.FastDateParser.1
        @Override // org.apache.commons.lang3.time.FastDateParser.NumberStrategy
        public int modify(FastDateParser fastDateParser, int i14) {
            return i14 < 100 ? fastDateParser.adjustYear(i14) : i14;
        }
    };
    private static final Strategy NUMBER_MONTH_STRATEGY = new NumberStrategy(2) { // from class: org.apache.commons.lang3.time.FastDateParser.2
        @Override // org.apache.commons.lang3.time.FastDateParser.NumberStrategy
        public int modify(FastDateParser fastDateParser, int i14) {
            return i14 - 1;
        }
    };
    private static final Strategy LITERAL_YEAR_STRATEGY = new NumberStrategy(1);
    private static final Strategy WEEK_OF_YEAR_STRATEGY = new NumberStrategy(3);
    private static final Strategy WEEK_OF_MONTH_STRATEGY = new NumberStrategy(4);
    private static final Strategy DAY_OF_YEAR_STRATEGY = new NumberStrategy(6);
    private static final Strategy DAY_OF_MONTH_STRATEGY = new NumberStrategy(5);
    private static final Strategy DAY_OF_WEEK_STRATEGY = new NumberStrategy(7) { // from class: org.apache.commons.lang3.time.FastDateParser.3
        @Override // org.apache.commons.lang3.time.FastDateParser.NumberStrategy
        public int modify(FastDateParser fastDateParser, int i14) {
            if (i14 == 7) {
                return 1;
            }
            return i14 + 1;
        }
    };
    private static final Strategy DAY_OF_WEEK_IN_MONTH_STRATEGY = new NumberStrategy(8);
    private static final Strategy HOUR_OF_DAY_STRATEGY = new NumberStrategy(11);
    private static final Strategy HOUR24_OF_DAY_STRATEGY = new NumberStrategy(11) { // from class: org.apache.commons.lang3.time.FastDateParser.4
        @Override // org.apache.commons.lang3.time.FastDateParser.NumberStrategy
        public int modify(FastDateParser fastDateParser, int i14) {
            if (i14 == 24) {
                return 0;
            }
            return i14;
        }
    };
    private static final Strategy HOUR12_STRATEGY = new NumberStrategy(10) { // from class: org.apache.commons.lang3.time.FastDateParser.5
        @Override // org.apache.commons.lang3.time.FastDateParser.NumberStrategy
        public int modify(FastDateParser fastDateParser, int i14) {
            if (i14 == 12) {
                return 0;
            }
            return i14;
        }
    };
    private static final Strategy HOUR_STRATEGY = new NumberStrategy(10);
    private static final Strategy MINUTE_STRATEGY = new NumberStrategy(12);
    private static final Strategy SECOND_STRATEGY = new NumberStrategy(13);
    private static final Strategy MILLISECOND_STRATEGY = new NumberStrategy(14);

    public static class CaseInsensitiveTextStrategy extends PatternStrategy {
        private final int field;
        private final Map<String, Integer> lKeyValues;
        final Locale locale;

        public CaseInsensitiveTextStrategy(int i14, Calendar calendar, Locale locale) {
            super();
            this.field = i14;
            this.locale = LocaleUtils.toLocale(locale);
            StringBuilder sbK = e5.k("((?iu)");
            this.lKeyValues = FastDateParser.appendDisplayNames(calendar, locale, i14, sbK);
            sbK.setLength(sbK.length() - 1);
            sbK.append(")");
            createPattern(sbK);
        }

        @Override // org.apache.commons.lang3.time.FastDateParser.PatternStrategy
        public void setCalendar(FastDateParser fastDateParser, Calendar calendar, String str) {
            String lowerCase = str.toLowerCase(this.locale);
            Integer num = this.lKeyValues.get(lowerCase);
            if (num == null) {
                num = this.lKeyValues.get(lowerCase + '.');
            }
            calendar.set(this.field, num.intValue());
        }

        @Override // org.apache.commons.lang3.time.FastDateParser.PatternStrategy
        public String toString() {
            return "CaseInsensitiveTextStrategy [field=" + this.field + ", locale=" + this.locale + ", lKeyValues=" + this.lKeyValues + ", pattern=" + this.pattern + "]";
        }
    }

    public static class CopyQuotedStrategy extends Strategy {
        private final String formatField;

        public CopyQuotedStrategy(String str) {
            super();
            this.formatField = str;
        }

        @Override // org.apache.commons.lang3.time.FastDateParser.Strategy
        public boolean isNumber() {
            return false;
        }

        @Override // org.apache.commons.lang3.time.FastDateParser.Strategy
        public boolean parse(FastDateParser fastDateParser, Calendar calendar, String str, ParsePosition parsePosition, int i14) {
            for (int i15 = 0; i15 < this.formatField.length(); i15++) {
                int index = parsePosition.getIndex() + i15;
                if (index == str.length()) {
                    parsePosition.setErrorIndex(index);
                    return false;
                }
                if (this.formatField.charAt(i15) != str.charAt(index)) {
                    parsePosition.setErrorIndex(index);
                    return false;
                }
            }
            parsePosition.setIndex(parsePosition.getIndex() + this.formatField.length());
            return true;
        }

        public String toString() {
            return j.o(this.formatField, "]", new StringBuilder("CopyQuotedStrategy [formatField="));
        }
    }

    public static class ISO8601TimeZoneStrategy extends PatternStrategy {
        private static final Strategy ISO_8601_1_STRATEGY = new ISO8601TimeZoneStrategy("(Z|(?:[+-]\\d{2}))");
        private static final Strategy ISO_8601_2_STRATEGY = new ISO8601TimeZoneStrategy("(Z|(?:[+-]\\d{2}\\d{2}))");
        private static final Strategy ISO_8601_3_STRATEGY = new ISO8601TimeZoneStrategy("(Z|(?:[+-]\\d{2}(?::)\\d{2}))");

        public ISO8601TimeZoneStrategy(String str) {
            super();
            createPattern(str);
        }

        public static Strategy getStrategy(int i14) {
            if (i14 == 1) {
                return ISO_8601_1_STRATEGY;
            }
            if (i14 == 2) {
                return ISO_8601_2_STRATEGY;
            }
            if (i14 == 3) {
                return ISO_8601_3_STRATEGY;
            }
            h.s("invalid number of X");
            return null;
        }

        @Override // org.apache.commons.lang3.time.FastDateParser.PatternStrategy
        public void setCalendar(FastDateParser fastDateParser, Calendar calendar, String str) {
            calendar.setTimeZone(FastTimeZone.getGmtTimeZone(str));
        }
    }

    public static class NumberStrategy extends Strategy {
        private final int field;

        public NumberStrategy(int i14) {
            super();
            this.field = i14;
        }

        @Override // org.apache.commons.lang3.time.FastDateParser.Strategy
        public boolean isNumber() {
            return true;
        }

        public int modify(FastDateParser fastDateParser, int i14) {
            return i14;
        }

        @Override // org.apache.commons.lang3.time.FastDateParser.Strategy
        public boolean parse(FastDateParser fastDateParser, Calendar calendar, String str, ParsePosition parsePosition, int i14) {
            int index = parsePosition.getIndex();
            int length = str.length();
            if (i14 == 0) {
                while (index < length && Character.isWhitespace(str.charAt(index))) {
                    index++;
                }
                parsePosition.setIndex(index);
            } else {
                int i15 = i14 + index;
                if (length > i15) {
                    length = i15;
                }
            }
            while (index < length && Character.isDigit(str.charAt(index))) {
                index++;
            }
            if (parsePosition.getIndex() == index) {
                parsePosition.setErrorIndex(index);
                return false;
            }
            int i16 = Integer.parseInt(str.substring(parsePosition.getIndex(), index));
            parsePosition.setIndex(index);
            calendar.set(this.field, modify(fastDateParser, i16));
            return true;
        }

        public String toString() {
            return j.q(new StringBuilder("NumberStrategy [field="), this.field, "]");
        }
    }

    public static abstract class Strategy {
        private Strategy() {
        }

        public boolean isNumber() {
            return false;
        }

        public abstract boolean parse(FastDateParser fastDateParser, Calendar calendar, String str, ParsePosition parsePosition, int i14);
    }

    public static class StrategyAndWidth {
        final Strategy strategy;
        final int width;

        public StrategyAndWidth(Strategy strategy, int i14) {
            this.strategy = strategy;
            this.width = i14;
        }

        public int getMaxWidth(ListIterator<StrategyAndWidth> listIterator) {
            if (this.strategy.isNumber() && listIterator.hasNext()) {
                Strategy strategy = listIterator.next().strategy;
                listIterator.previous();
                if (strategy.isNumber()) {
                    return this.width;
                }
            }
            return 0;
        }

        public String toString() {
            StringBuilder sb3 = new StringBuilder("StrategyAndWidth [strategy=");
            sb3.append(this.strategy);
            sb3.append(", width=");
            return j.q(sb3, this.width, "]");
        }
    }

    public class StrategyParser {
        private int currentIdx;
        private final Calendar definingCalendar;

        public StrategyParser(Calendar calendar) {
            this.definingCalendar = calendar;
        }

        private StrategyAndWidth letterPattern(char c14) {
            int i14 = this.currentIdx;
            do {
                int i15 = this.currentIdx + 1;
                this.currentIdx = i15;
                if (i15 >= FastDateParser.this.pattern.length()) {
                    break;
                }
            } while (FastDateParser.this.pattern.charAt(this.currentIdx) == c14);
            int i16 = this.currentIdx - i14;
            return new StrategyAndWidth(FastDateParser.this.getStrategy(c14, i16, this.definingCalendar), i16);
        }

        private StrategyAndWidth literal() {
            StringBuilder sb3 = new StringBuilder();
            boolean z14 = false;
            while (this.currentIdx < FastDateParser.this.pattern.length()) {
                char cCharAt = FastDateParser.this.pattern.charAt(this.currentIdx);
                if (!z14 && FastDateParser.isFormatLetter(cCharAt)) {
                    break;
                }
                if (cCharAt == '\'') {
                    int i14 = this.currentIdx + 1;
                    this.currentIdx = i14;
                    if (i14 == FastDateParser.this.pattern.length() || FastDateParser.this.pattern.charAt(this.currentIdx) != '\'') {
                        z14 = !z14;
                    }
                }
                this.currentIdx++;
                sb3.append(cCharAt);
            }
            if (z14) {
                h.s("Unterminated quote");
                return null;
            }
            String string = sb3.toString();
            return new StrategyAndWidth(new CopyQuotedStrategy(string), string.length());
        }

        public StrategyAndWidth getNextStrategy() {
            if (this.currentIdx >= FastDateParser.this.pattern.length()) {
                return null;
            }
            char cCharAt = FastDateParser.this.pattern.charAt(this.currentIdx);
            return FastDateParser.isFormatLetter(cCharAt) ? letterPattern(cCharAt) : literal();
        }
    }

    public static class TimeZoneStrategy extends PatternStrategy {
        private static final String GMT_OPTION = "GMT[+-]\\d{1,2}:\\d{2}";
        private static final int ID = 0;
        private static final String RFC_822_TIME_ZONE = "[+-]\\d{4}";
        private final Locale locale;
        private final Map<String, TzInfo> tzNames;

        public static class TzInfo {
            final int dstOffset;
            final TimeZone zone;

            public TzInfo(TimeZone timeZone, boolean z14) {
                this.zone = timeZone;
                this.dstOffset = z14 ? timeZone.getDSTSavings() : 0;
            }
        }

        public TimeZoneStrategy(Locale locale) {
            super();
            this.tzNames = new HashMap();
            this.locale = LocaleUtils.toLocale(locale);
            StringBuilder sb3 = new StringBuilder("((?iu)[+-]\\d{4}|GMT[+-]\\d{1,2}:\\d{2}");
            TreeSet<String> treeSet = new TreeSet(FastDateParser.LONGER_FIRST_LOWERCASE);
            for (String[] strArr : DateFormatSymbols.getInstance(locale).getZoneStrings()) {
                String str = strArr[0];
                if (!str.equalsIgnoreCase(TimeZones.GMT_ID)) {
                    TimeZone timeZone = TimeZone.getTimeZone(str);
                    TzInfo tzInfo = new TzInfo(timeZone, false);
                    TzInfo tzInfo2 = tzInfo;
                    for (int i14 = 1; i14 < strArr.length; i14++) {
                        if (i14 == 3) {
                            tzInfo2 = new TzInfo(timeZone, true);
                        } else if (i14 == 5) {
                            tzInfo2 = tzInfo;
                        }
                        String str2 = strArr[i14];
                        if (str2 != null) {
                            String lowerCase = str2.toLowerCase(locale);
                            if (treeSet.add(lowerCase)) {
                                this.tzNames.put(lowerCase, tzInfo2);
                            }
                        }
                    }
                }
            }
            for (String str3 : treeSet) {
                sb3.append('|');
                FastDateParser.simpleQuote(sb3, str3);
            }
            sb3.append(")");
            createPattern(sb3);
        }

        @Override // org.apache.commons.lang3.time.FastDateParser.PatternStrategy
        public void setCalendar(FastDateParser fastDateParser, Calendar calendar, String str) {
            TimeZone gmtTimeZone = FastTimeZone.getGmtTimeZone(str);
            if (gmtTimeZone != null) {
                calendar.setTimeZone(gmtTimeZone);
                return;
            }
            String lowerCase = str.toLowerCase(this.locale);
            TzInfo tzInfo = this.tzNames.get(lowerCase);
            if (tzInfo == null) {
                tzInfo = this.tzNames.get(lowerCase + '.');
            }
            calendar.set(16, tzInfo.dstOffset);
            calendar.set(15, tzInfo.zone.getRawOffset());
        }

        @Override // org.apache.commons.lang3.time.FastDateParser.PatternStrategy
        public String toString() {
            return "TimeZoneStrategy [locale=" + this.locale + ", tzNames=" + this.tzNames + ", pattern=" + this.pattern + "]";
        }
    }

    public FastDateParser(String str, TimeZone timeZone, Locale locale, Date date) {
        int i14;
        this.pattern = str;
        this.timeZone = timeZone;
        Locale locale2 = LocaleUtils.toLocale(locale);
        this.locale = locale2;
        Calendar calendar = Calendar.getInstance(timeZone, locale2);
        if (date != null) {
            calendar.setTime(date);
            i14 = calendar.get(1);
        } else if (locale2.equals(JAPANESE_IMPERIAL)) {
            i14 = 0;
        } else {
            calendar.setTime(new Date());
            i14 = calendar.get(1) - 80;
        }
        int i15 = (i14 / 100) * 100;
        this.century = i15;
        this.startYear = i14 - i15;
        init(calendar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int adjustYear(int i14) {
        int i15 = this.century + i14;
        return i14 >= this.startYear ? i15 : i15 + 100;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Map<String, Integer> appendDisplayNames(Calendar calendar, Locale locale, int i14, StringBuilder sb3) {
        HashMap map = new HashMap();
        Locale locale2 = LocaleUtils.toLocale(locale);
        Map<String, Integer> displayNames = calendar.getDisplayNames(i14, 0, locale2);
        TreeSet treeSet = new TreeSet(LONGER_FIRST_LOWERCASE);
        for (Map.Entry<String, Integer> entry : displayNames.entrySet()) {
            String lowerCase = entry.getKey().toLowerCase(locale2);
            if (treeSet.add(lowerCase)) {
                map.put(lowerCase, entry.getValue());
            }
        }
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            simpleQuote(sb3, (String) it.next()).append('|');
        }
        return map;
    }

    private static ConcurrentMap<Locale, Strategy> getCache(int i14) {
        ConcurrentMap<Locale, Strategy> concurrentMap;
        ConcurrentMap<Locale, Strategy>[] concurrentMapArr = caches;
        synchronized (concurrentMapArr) {
            try {
                if (concurrentMapArr[i14] == null) {
                    concurrentMapArr[i14] = new ConcurrentHashMap(3);
                }
                concurrentMap = concurrentMapArr[i14];
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return concurrentMap;
    }

    private Strategy getLocaleSpecificStrategy(int i14, Calendar calendar) {
        ConcurrentMap<Locale, Strategy> cache = getCache(i14);
        Strategy strategy = cache.get(this.locale);
        if (strategy != null) {
            return strategy;
        }
        Locale locale = this.locale;
        Strategy timeZoneStrategy = i14 == 15 ? new TimeZoneStrategy(locale) : new CaseInsensitiveTextStrategy(i14, calendar, locale);
        Strategy strategyPutIfAbsent = cache.putIfAbsent(this.locale, timeZoneStrategy);
        return strategyPutIfAbsent != null ? strategyPutIfAbsent : timeZoneStrategy;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Strategy getStrategy(char c14, int i14, Calendar calendar) {
        if (c14 != 'y') {
            if (c14 != 'z') {
                switch (c14) {
                    case 'D':
                        return DAY_OF_YEAR_STRATEGY;
                    case 'E':
                        return getLocaleSpecificStrategy(7, calendar);
                    case 'F':
                        return DAY_OF_WEEK_IN_MONTH_STRATEGY;
                    case 'G':
                        return getLocaleSpecificStrategy(0, calendar);
                    case 'H':
                        return HOUR_OF_DAY_STRATEGY;
                    default:
                        switch (c14) {
                            case 'K':
                                return HOUR_STRATEGY;
                            case 'M':
                                return i14 >= 3 ? getLocaleSpecificStrategy(2, calendar) : NUMBER_MONTH_STRATEGY;
                            case 'S':
                                return MILLISECOND_STRATEGY;
                            case 'a':
                                return getLocaleSpecificStrategy(9, calendar);
                            case 'd':
                                return DAY_OF_MONTH_STRATEGY;
                            case 'h':
                                return HOUR12_STRATEGY;
                            case 'k':
                                return HOUR24_OF_DAY_STRATEGY;
                            case 'm':
                                return MINUTE_STRATEGY;
                            case 's':
                                return SECOND_STRATEGY;
                            case 'u':
                                return DAY_OF_WEEK_STRATEGY;
                            case 'w':
                                return WEEK_OF_YEAR_STRATEGY;
                            default:
                                switch (c14) {
                                    case 'W':
                                        return WEEK_OF_MONTH_STRATEGY;
                                    case 'X':
                                        return ISO8601TimeZoneStrategy.getStrategy(i14);
                                    case 'Y':
                                        break;
                                    case 'Z':
                                        if (i14 == 2) {
                                            return ISO8601TimeZoneStrategy.ISO_8601_3_STRATEGY;
                                        }
                                        break;
                                    default:
                                        a.n(c14, "Format '", "' not supported");
                                        return null;
                                }
                                break;
                        }
                        break;
                }
            }
            return getLocaleSpecificStrategy(15, calendar);
        }
        return i14 > 2 ? LITERAL_YEAR_STRATEGY : ABBREVIATED_YEAR_STRATEGY;
    }

    private void init(Calendar calendar) {
        this.patterns = new ArrayList();
        StrategyParser strategyParser = new StrategyParser(calendar);
        while (true) {
            StrategyAndWidth nextStrategy = strategyParser.getNextStrategy();
            if (nextStrategy == null) {
                return;
            } else {
                this.patterns.add(nextStrategy);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isFormatLetter(char c14) {
        if (c14 < 'A' || c14 > 'Z') {
            return c14 >= 'a' && c14 <= 'z';
        }
        return true;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        init(Calendar.getInstance(this.timeZone, this.locale));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:20:0x002f  */
    public static StringBuilder simpleQuote(StringBuilder sb3, String str) {
        for (int i14 = 0; i14 < str.length(); i14++) {
            char cCharAt = str.charAt(i14);
            if (cCharAt != '$' && cCharAt != '.' && cCharAt != '?' && cCharAt != '^' && cCharAt != '[' && cCharAt != '\\' && cCharAt != '{' && cCharAt != '|') {
                switch (cCharAt) {
                    case '(':
                    case ')':
                    case '*':
                    case '+':
                        sb3.append('\\');
                        break;
                }
            } else {
                sb3.append('\\');
            }
            sb3.append(cCharAt);
        }
        if (sb3.charAt(sb3.length() - 1) == '.') {
            sb3.append('?');
        }
        return sb3;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof FastDateParser)) {
            return false;
        }
        FastDateParser fastDateParser = (FastDateParser) obj;
        return this.pattern.equals(fastDateParser.pattern) && this.timeZone.equals(fastDateParser.timeZone) && this.locale.equals(fastDateParser.locale);
    }

    @Override // org.apache.commons.lang3.time.DateParser, org.apache.commons.lang3.time.DatePrinter
    public Locale getLocale() {
        return this.locale;
    }

    @Override // org.apache.commons.lang3.time.DateParser, org.apache.commons.lang3.time.DatePrinter
    public String getPattern() {
        return this.pattern;
    }

    @Override // org.apache.commons.lang3.time.DateParser, org.apache.commons.lang3.time.DatePrinter
    public TimeZone getTimeZone() {
        return this.timeZone;
    }

    public int hashCode() {
        return (((this.locale.hashCode() * 13) + this.timeZone.hashCode()) * 13) + this.pattern.hashCode();
    }

    @Override // org.apache.commons.lang3.time.DateParser
    public Date parse(String str) throws ParseException {
        ParsePosition parsePosition = new ParsePosition(0);
        Date date = parse(str, parsePosition);
        if (date != null) {
            return date;
        }
        if (!this.locale.equals(JAPANESE_IMPERIAL)) {
            p.i(parsePosition.getErrorIndex(), c.n("Unparseable date: ", str));
            return null;
        }
        p.i(parsePosition.getErrorIndex(), "(The " + this.locale + " locale does not support dates before 1868 AD)\nUnparseable date: \"" + str);
        return null;
    }

    @Override // org.apache.commons.lang3.time.DateParser
    public Object parseObject(String str) {
        return parse(str);
    }

    public String toString() {
        return "FastDateParser[" + this.pattern + ", " + this.locale + ", " + this.timeZone.getID() + "]";
    }

    public String toStringAll() {
        StringBuilder sb3 = new StringBuilder("FastDateParser [pattern=");
        sb3.append(this.pattern);
        sb3.append(", timeZone=");
        sb3.append(this.timeZone);
        sb3.append(", locale=");
        sb3.append(this.locale);
        sb3.append(", century=");
        sb3.append(this.century);
        sb3.append(", startYear=");
        sb3.append(this.startYear);
        sb3.append(", patterns=");
        return z.c(sb3, this.patterns, "]");
    }

    @Override // org.apache.commons.lang3.time.DateParser
    public Object parseObject(String str, ParsePosition parsePosition) {
        return parse(str, parsePosition);
    }

    public static abstract class PatternStrategy extends Strategy {
        Pattern pattern;

        private PatternStrategy() {
            super();
        }

        public void createPattern(StringBuilder sb3) {
            createPattern(sb3.toString());
        }

        @Override // org.apache.commons.lang3.time.FastDateParser.Strategy
        public boolean isNumber() {
            return false;
        }

        @Override // org.apache.commons.lang3.time.FastDateParser.Strategy
        public boolean parse(FastDateParser fastDateParser, Calendar calendar, String str, ParsePosition parsePosition, int i14) {
            Matcher matcher = this.pattern.matcher(str.substring(parsePosition.getIndex()));
            if (!matcher.lookingAt()) {
                parsePosition.setErrorIndex(parsePosition.getIndex());
                return false;
            }
            parsePosition.setIndex(matcher.end(1) + parsePosition.getIndex());
            setCalendar(fastDateParser, calendar, matcher.group(1));
            return true;
        }

        public abstract void setCalendar(FastDateParser fastDateParser, Calendar calendar, String str);

        public String toString() {
            return getClass().getSimpleName() + " [pattern=" + this.pattern + "]";
        }

        public void createPattern(String str) {
            this.pattern = Pattern.compile(str);
        }
    }

    public FastDateParser(String str, TimeZone timeZone, Locale locale) {
        this(str, timeZone, locale, null);
    }

    @Override // org.apache.commons.lang3.time.DateParser
    public Date parse(String str, ParsePosition parsePosition) {
        Calendar calendar = Calendar.getInstance(this.timeZone, this.locale);
        calendar.clear();
        if (parse(str, parsePosition, calendar)) {
            return calendar.getTime();
        }
        return null;
    }

    @Override // org.apache.commons.lang3.time.DateParser
    public boolean parse(String str, ParsePosition parsePosition, Calendar calendar) {
        ListIterator<StrategyAndWidth> listIterator = this.patterns.listIterator();
        while (listIterator.hasNext()) {
            StrategyAndWidth next = listIterator.next();
            String str2 = str;
            ParsePosition parsePosition2 = parsePosition;
            Calendar calendar2 = calendar;
            if (!next.strategy.parse(this, calendar2, str2, parsePosition2, next.getMaxWidth(listIterator))) {
                return false;
            }
            calendar = calendar2;
            str = str2;
            parsePosition = parsePosition2;
        }
        return true;
    }
}
