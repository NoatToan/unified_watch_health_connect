package org.apache.commons.lang3.time;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.text.DateFormatSymbols;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.SortedMap;
import java.util.TimeZone;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public class FastDateParser implements Serializable {
    private static final long serialVersionUID = 2;
    private final int century;
    private transient String currentFormatField;
    private final Locale locale;
    private transient g nextStrategy;
    private transient Pattern parsePattern;
    private final String pattern;
    private final int startYear;
    private transient g[] strategies;
    private final TimeZone timeZone;
    static final Locale JAPANESE_IMPERIAL = new Locale("ja", "JP", "JP");
    private static final Pattern formatPattern = Pattern.compile("D+|E+|F+|G+|H+|K+|M+|S+|W+|Z+|a+|d+|h+|k+|m+|s+|w+|y+|z+|''|'[^']++(''[^']*+)*+'|[^'A-Za-z]++");
    private static final ConcurrentMap<Locale, g>[] caches = new ConcurrentMap[17];
    private static final g ABBREVIATED_YEAR_STRATEGY = new a(1);
    private static final g NUMBER_MONTH_STRATEGY = new b(2);
    private static final g LITERAL_YEAR_STRATEGY = new f(1);
    private static final g WEEK_OF_YEAR_STRATEGY = new f(3);
    private static final g WEEK_OF_MONTH_STRATEGY = new f(4);
    private static final g DAY_OF_YEAR_STRATEGY = new f(6);
    private static final g DAY_OF_MONTH_STRATEGY = new f(5);
    private static final g DAY_OF_WEEK_IN_MONTH_STRATEGY = new f(8);
    private static final g HOUR_OF_DAY_STRATEGY = new f(11);
    private static final g MODULO_HOUR_OF_DAY_STRATEGY = new c(11);
    private static final g MODULO_HOUR_STRATEGY = new d(10);
    private static final g HOUR_STRATEGY = new f(10);
    private static final g MINUTE_STRATEGY = new f(12);
    private static final g SECOND_STRATEGY = new f(13);
    private static final g MILLISECOND_STRATEGY = new f(14);

    public static class a extends f {
        public a(int i) {
            super(i);
        }

        @Override // org.apache.commons.lang3.time.FastDateParser.f, org.apache.commons.lang3.time.FastDateParser.g
        public void c(FastDateParser fastDateParser, Calendar calendar, String str) {
            int iAdjustYear = Integer.parseInt(str);
            if (iAdjustYear < 100) {
                iAdjustYear = fastDateParser.adjustYear(iAdjustYear);
            }
            calendar.set(1, iAdjustYear);
        }
    }

    public static class b extends f {
        public b(int i) {
            super(i);
        }

        @Override // org.apache.commons.lang3.time.FastDateParser.f
        public int d(int i) {
            return i - 1;
        }
    }

    public static class c extends f {
        public c(int i) {
            super(i);
        }

        @Override // org.apache.commons.lang3.time.FastDateParser.f
        public int d(int i) {
            return i % 24;
        }
    }

    public static class d extends f {
        public d(int i) {
            super(i);
        }

        @Override // org.apache.commons.lang3.time.FastDateParser.f
        public int d(int i) {
            return i % 12;
        }
    }

    public static class e extends g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f29471a;

        public e(String str) {
            super(null);
            this.f29471a = str;
        }

        @Override // org.apache.commons.lang3.time.FastDateParser.g
        public boolean a(FastDateParser fastDateParser, StringBuilder sb) {
            FastDateParser.escapeRegex(sb, this.f29471a, true);
            return false;
        }

        @Override // org.apache.commons.lang3.time.FastDateParser.g
        public boolean b() {
            char cCharAt = this.f29471a.charAt(0);
            if (cCharAt == '\'') {
                cCharAt = this.f29471a.charAt(1);
            }
            return Character.isDigit(cCharAt);
        }
    }

    public static class f extends g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f29472a;

        public f(int i) {
            super(null);
            this.f29472a = i;
        }

        @Override // org.apache.commons.lang3.time.FastDateParser.g
        public boolean a(FastDateParser fastDateParser, StringBuilder sb) {
            if (!fastDateParser.isNextNumber()) {
                sb.append("(\\p{Nd}++)");
                return true;
            }
            sb.append("(\\p{Nd}{");
            sb.append(fastDateParser.getFieldWidth());
            sb.append("}+)");
            return true;
        }

        @Override // org.apache.commons.lang3.time.FastDateParser.g
        public boolean b() {
            return true;
        }

        @Override // org.apache.commons.lang3.time.FastDateParser.g
        public void c(FastDateParser fastDateParser, Calendar calendar, String str) {
            calendar.set(this.f29472a, d(Integer.parseInt(str)));
        }

        public int d(int i) {
            return i;
        }
    }

    public static abstract class g {
        public g() {
        }

        public /* synthetic */ g(a aVar) {
            this();
        }

        public abstract boolean a(FastDateParser fastDateParser, StringBuilder sb);

        public boolean b() {
            return false;
        }

        public void c(FastDateParser fastDateParser, Calendar calendar, String str) {
        }
    }

    public static class h extends g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f29473a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Map<String, Integer> f29474b;

        public h(int i, Calendar calendar, Locale locale) {
            super(null);
            this.f29473a = i;
            this.f29474b = FastDateParser.getDisplayNames(i, calendar, locale);
        }

        @Override // org.apache.commons.lang3.time.FastDateParser.g
        public boolean a(FastDateParser fastDateParser, StringBuilder sb) {
            sb.append('(');
            Iterator<String> it = this.f29474b.keySet().iterator();
            while (it.hasNext()) {
                FastDateParser.escapeRegex(sb, it.next(), false).append('|');
            }
            sb.setCharAt(sb.length() - 1, ')');
            return true;
        }

        @Override // org.apache.commons.lang3.time.FastDateParser.g
        public void c(FastDateParser fastDateParser, Calendar calendar, String str) {
            Integer num = this.f29474b.get(str);
            if (num != null) {
                calendar.set(this.f29473a, num.intValue());
                return;
            }
            StringBuilder sb = new StringBuilder(str);
            sb.append(" not in (");
            Iterator<String> it = this.f29474b.keySet().iterator();
            while (it.hasNext()) {
                sb.append(it.next());
                sb.append(' ');
            }
            sb.setCharAt(sb.length() - 1, ')');
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public static class i extends g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f29475a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final SortedMap<String, TimeZone> f29476b;

        public i(Locale locale) {
            super(null);
            this.f29476b = new TreeMap(String.CASE_INSENSITIVE_ORDER);
            for (String[] strArr : DateFormatSymbols.getInstance(locale).getZoneStrings()) {
                if (!strArr[0].startsWith("GMT")) {
                    TimeZone timeZone = TimeZone.getTimeZone(strArr[0]);
                    if (!this.f29476b.containsKey(strArr[1])) {
                        this.f29476b.put(strArr[1], timeZone);
                    }
                    if (!this.f29476b.containsKey(strArr[2])) {
                        this.f29476b.put(strArr[2], timeZone);
                    }
                    if (timeZone.useDaylightTime()) {
                        if (!this.f29476b.containsKey(strArr[3])) {
                            this.f29476b.put(strArr[3], timeZone);
                        }
                        if (!this.f29476b.containsKey(strArr[4])) {
                            this.f29476b.put(strArr[4], timeZone);
                        }
                    }
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append("(GMT[+\\-]\\d{0,1}\\d{2}|[+\\-]\\d{2}:?\\d{2}|");
            Iterator<String> it = this.f29476b.keySet().iterator();
            while (it.hasNext()) {
                FastDateParser.escapeRegex(sb, it.next(), false).append('|');
            }
            sb.setCharAt(sb.length() - 1, ')');
            this.f29475a = sb.toString();
        }

        @Override // org.apache.commons.lang3.time.FastDateParser.g
        public boolean a(FastDateParser fastDateParser, StringBuilder sb) {
            sb.append(this.f29475a);
            return true;
        }

        @Override // org.apache.commons.lang3.time.FastDateParser.g
        public void c(FastDateParser fastDateParser, Calendar calendar, String str) {
            TimeZone timeZone;
            if (str.charAt(0) == '+' || str.charAt(0) == '-') {
                timeZone = TimeZone.getTimeZone("GMT" + str);
            } else if (str.startsWith("GMT")) {
                timeZone = TimeZone.getTimeZone(str);
            } else {
                timeZone = this.f29476b.get(str);
                if (timeZone == null) {
                    throw new IllegalArgumentException(str + " is not a supported timezone name");
                }
            }
            calendar.setTimeZone(timeZone);
        }
    }

    public FastDateParser(String str, TimeZone timeZone, Locale locale) {
        this(str, timeZone, locale, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int adjustYear(int i2) {
        int i3 = this.century + i2;
        return i2 >= this.startYear ? i3 : i3 + 100;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static StringBuilder escapeRegex(StringBuilder sb, String str, boolean z) {
        sb.append("\\Q");
        int i2 = 0;
        while (i2 < str.length()) {
            char cCharAt = str.charAt(i2);
            if (cCharAt != '\'') {
                if (cCharAt == '\\' && (i2 = i2 + 1) != str.length()) {
                    sb.append(cCharAt);
                    cCharAt = str.charAt(i2);
                    if (cCharAt == 'E') {
                        sb.append("E\\\\E\\");
                        cCharAt = 'Q';
                    }
                }
            } else if (z) {
                i2++;
                if (i2 == str.length()) {
                    return sb;
                }
                cCharAt = str.charAt(i2);
            } else {
                continue;
            }
            sb.append(cCharAt);
            i2++;
        }
        sb.append("\\E");
        return sb;
    }

    private static ConcurrentMap<Locale, g> getCache(int i2) {
        ConcurrentMap<Locale, g> concurrentMap;
        ConcurrentMap<Locale, g>[] concurrentMapArr = caches;
        synchronized (concurrentMapArr) {
            try {
                if (concurrentMapArr[i2] == null) {
                    concurrentMapArr[i2] = new ConcurrentHashMap(3);
                }
                concurrentMap = concurrentMapArr[i2];
            } catch (Throwable th) {
                throw th;
            }
        }
        return concurrentMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Map<String, Integer> getDisplayNames(int i2, Calendar calendar, Locale locale) {
        return calendar.getDisplayNames(i2, 0, locale);
    }

    private g getLocaleSpecificStrategy(int i2, Calendar calendar) {
        ConcurrentMap<Locale, g> cache = getCache(i2);
        g iVar = cache.get(this.locale);
        if (iVar == null) {
            iVar = i2 == 15 ? new i(this.locale) : new h(i2, calendar, this.locale);
            g gVarPutIfAbsent = cache.putIfAbsent(this.locale, iVar);
            if (gVarPutIfAbsent != null) {
                return gVarPutIfAbsent;
            }
        }
        return iVar;
    }

    private g getStrategy(String str, Calendar calendar) {
        char cCharAt = str.charAt(0);
        if (cCharAt == 'y') {
            return str.length() > 2 ? LITERAL_YEAR_STRATEGY : ABBREVIATED_YEAR_STRATEGY;
        }
        if (cCharAt != 'z') {
            switch (cCharAt) {
                case '\'':
                    if (str.length() > 2) {
                        return new e(str.substring(1, str.length() - 1));
                    }
                    break;
                case 'K':
                    return HOUR_STRATEGY;
                case 'M':
                    return str.length() >= 3 ? getLocaleSpecificStrategy(2, calendar) : NUMBER_MONTH_STRATEGY;
                case 'S':
                    return MILLISECOND_STRATEGY;
                case 'W':
                    return WEEK_OF_MONTH_STRATEGY;
                case 'Z':
                    break;
                case 'a':
                    return getLocaleSpecificStrategy(9, calendar);
                case 'd':
                    return DAY_OF_MONTH_STRATEGY;
                case 'h':
                    return MODULO_HOUR_STRATEGY;
                case 'k':
                    return HOUR_OF_DAY_STRATEGY;
                case 'm':
                    return MINUTE_STRATEGY;
                case 's':
                    return SECOND_STRATEGY;
                case 'w':
                    return WEEK_OF_YEAR_STRATEGY;
                default:
                    switch (cCharAt) {
                        case 'D':
                            return DAY_OF_YEAR_STRATEGY;
                        case 'E':
                            return getLocaleSpecificStrategy(7, calendar);
                        case 'F':
                            return DAY_OF_WEEK_IN_MONTH_STRATEGY;
                        case 'G':
                            return getLocaleSpecificStrategy(0, calendar);
                        case 'H':
                            return MODULO_HOUR_OF_DAY_STRATEGY;
                    }
            }
            return new e(str);
        }
        return getLocaleSpecificStrategy(15, calendar);
    }

    private void init(Calendar calendar) {
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList = new ArrayList();
        Matcher matcher = formatPattern.matcher(this.pattern);
        if (!matcher.lookingAt()) {
            throw new IllegalArgumentException("Illegal pattern character '" + this.pattern.charAt(matcher.regionStart()) + "'");
        }
        String strGroup = matcher.group();
        this.currentFormatField = strGroup;
        g strategy = getStrategy(strGroup, calendar);
        while (true) {
            matcher.region(matcher.end(), matcher.regionEnd());
            if (!matcher.lookingAt()) {
                break;
            }
            String strGroup2 = matcher.group();
            this.nextStrategy = getStrategy(strGroup2, calendar);
            if (strategy.a(this, sb)) {
                arrayList.add(strategy);
            }
            this.currentFormatField = strGroup2;
            strategy = this.nextStrategy;
        }
        this.nextStrategy = null;
        if (matcher.regionStart() == matcher.regionEnd()) {
            if (strategy.a(this, sb)) {
                arrayList.add(strategy);
            }
            this.currentFormatField = null;
            this.strategies = (g[]) arrayList.toArray(new g[arrayList.size()]);
            this.parsePattern = Pattern.compile(sb.toString());
            return;
        }
        throw new IllegalArgumentException("Failed to parse \"" + this.pattern + "\" ; gave up at index " + matcher.regionStart());
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        init(Calendar.getInstance(this.timeZone, this.locale));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof FastDateParser)) {
            return false;
        }
        FastDateParser fastDateParser = (FastDateParser) obj;
        return this.pattern.equals(fastDateParser.pattern) && this.timeZone.equals(fastDateParser.timeZone) && this.locale.equals(fastDateParser.locale);
    }

    public int getFieldWidth() {
        return this.currentFormatField.length();
    }

    public Locale getLocale() {
        return this.locale;
    }

    public Pattern getParsePattern() {
        return this.parsePattern;
    }

    public String getPattern() {
        return this.pattern;
    }

    public TimeZone getTimeZone() {
        return this.timeZone;
    }

    public int hashCode() {
        return this.pattern.hashCode() + ((this.timeZone.hashCode() + (this.locale.hashCode() * 13)) * 13);
    }

    public boolean isNextNumber() {
        g gVar = this.nextStrategy;
        return gVar != null && gVar.b();
    }

    public Date parse(String str) throws ParseException {
        Date date = parse(str, new ParsePosition(0));
        if (date != null) {
            return date;
        }
        if (!this.locale.equals(JAPANESE_IMPERIAL)) {
            throw new ParseException("Unparseable date: \"" + str + "\" does not match " + this.parsePattern.pattern(), 0);
        }
        throw new ParseException("(The " + this.locale + " locale does not support dates before 1868 AD)\nUnparseable date: \"" + str + "\" does not match " + this.parsePattern.pattern(), 0);
    }

    public Object parseObject(String str) throws ParseException {
        return parse(str);
    }

    public String toString() {
        return "FastDateParser[" + this.pattern + "," + this.locale + "," + this.timeZone.getID() + "]";
    }

    public FastDateParser(String str, TimeZone timeZone, Locale locale, Date date) {
        int i2;
        this.pattern = str;
        this.timeZone = timeZone;
        this.locale = locale;
        Calendar calendar = Calendar.getInstance(timeZone, locale);
        if (date != null) {
            calendar.setTime(date);
            i2 = calendar.get(1);
        } else if (locale.equals(JAPANESE_IMPERIAL)) {
            i2 = 0;
        } else {
            calendar.setTime(new Date());
            i2 = calendar.get(1) - 80;
        }
        int i3 = (i2 / 100) * 100;
        this.century = i3;
        this.startYear = i2 - i3;
        init(calendar);
    }

    public Object parseObject(String str, ParsePosition parsePosition) {
        return parse(str, parsePosition);
    }

    public Date parse(String str, ParsePosition parsePosition) {
        int index = parsePosition.getIndex();
        Matcher matcher = this.parsePattern.matcher(str.substring(index));
        if (!matcher.lookingAt()) {
            return null;
        }
        Calendar calendar = Calendar.getInstance(this.timeZone, this.locale);
        calendar.clear();
        int i2 = 0;
        while (true) {
            g[] gVarArr = this.strategies;
            if (i2 < gVarArr.length) {
                int i3 = i2 + 1;
                gVarArr[i2].c(this, calendar, matcher.group(i3));
                i2 = i3;
            } else {
                parsePosition.setIndex(index + matcher.end());
                return calendar.getTime();
            }
        }
    }
}
