package cn.hutool.core.date.format;

import defpackage.vp5;
import java.io.IOException;
import java.io.ObjectInputStream;
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
import java.util.Objects;
import java.util.TimeZone;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes.dex */
public class FastDateParser extends AbstractDateBasic implements vp5 {
    private static final long serialVersionUID = -3199383897950947498L;
    private final int century;
    private transient List<l> patterns;
    private final int startYear;
    static final Locale JAPANESE_IMPERIAL = new Locale("ja", "JP", "JP");
    private static final Comparator<String> LONGER_FIRST_LOWERCASE = Comparator.reverseOrder();
    private static final ConcurrentMap<Locale, k>[] CACHES = new ConcurrentMap[17];
    private static final k ABBREVIATED_YEAR_STRATEGY = new a(1);
    private static final k NUMBER_MONTH_STRATEGY = new b(2);
    private static final k LITERAL_YEAR_STRATEGY = new i(1);
    private static final k WEEK_OF_YEAR_STRATEGY = new i(3);
    private static final k WEEK_OF_MONTH_STRATEGY = new i(4);
    private static final k DAY_OF_YEAR_STRATEGY = new i(6);
    private static final k DAY_OF_MONTH_STRATEGY = new i(5);
    private static final k DAY_OF_WEEK_STRATEGY = new c(7);
    private static final k DAY_OF_WEEK_IN_MONTH_STRATEGY = new i(8);
    private static final k HOUR_OF_DAY_STRATEGY = new i(11);
    private static final k HOUR24_OF_DAY_STRATEGY = new d(11);
    private static final k HOUR12_STRATEGY = new e(10);
    private static final k HOUR_STRATEGY = new i(10);
    private static final k MINUTE_STRATEGY = new i(12);
    private static final k SECOND_STRATEGY = new i(13);
    private static final k MILLISECOND_STRATEGY = new i(14);

    public static class a extends i {
        public a(int i) {
            super(i);
        }

        @Override // cn.hutool.core.date.format.FastDateParser.i
        public int c(FastDateParser fastDateParser, int i) {
            return i < 100 ? fastDateParser.adjustYear(i) : i;
        }
    }

    public static class b extends i {
        public b(int i) {
            super(i);
        }

        @Override // cn.hutool.core.date.format.FastDateParser.i
        public int c(FastDateParser fastDateParser, int i) {
            return i - 1;
        }
    }

    public static class c extends i {
        public c(int i) {
            super(i);
        }

        @Override // cn.hutool.core.date.format.FastDateParser.i
        public int c(FastDateParser fastDateParser, int i) {
            if (i != 7) {
                return 1 + i;
            }
            return 1;
        }
    }

    public static class d extends i {
        public d(int i) {
            super(i);
        }

        @Override // cn.hutool.core.date.format.FastDateParser.i
        public int c(FastDateParser fastDateParser, int i) {
            if (i == 24) {
                return 0;
            }
            return i;
        }
    }

    public static class e extends i {
        public e(int i) {
            super(i);
        }

        @Override // cn.hutool.core.date.format.FastDateParser.i
        public int c(FastDateParser fastDateParser, int i) {
            if (i == 12) {
                return 0;
            }
            return i;
        }
    }

    public static class f extends j {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f5513b;
        public final Locale c;
        public final Map<String, Integer> d;

        public f(int i, Calendar calendar, Locale locale) {
            super(null);
            this.f5513b = i;
            this.c = locale;
            StringBuilder sb = new StringBuilder();
            sb.append("((?iu)");
            this.d = FastDateParser.appendDisplayNames(calendar, locale, i, sb);
            sb.setLength(sb.length() - 1);
            sb.append(")");
            d(sb);
        }

        @Override // cn.hutool.core.date.format.FastDateParser.j
        public void e(FastDateParser fastDateParser, Calendar calendar, String str) {
            calendar.set(this.f5513b, this.d.get(str.toLowerCase(this.c)).intValue());
        }
    }

    public static class g extends k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f5514a;

        public g(String str) {
            super(null);
            this.f5514a = str;
        }

        @Override // cn.hutool.core.date.format.FastDateParser.k
        public boolean a() {
            return false;
        }

        @Override // cn.hutool.core.date.format.FastDateParser.k
        public boolean b(FastDateParser fastDateParser, Calendar calendar, String str, ParsePosition parsePosition, int i) {
            for (int i2 = 0; i2 < this.f5514a.length(); i2++) {
                int index = parsePosition.getIndex() + i2;
                if (index == str.length()) {
                    parsePosition.setErrorIndex(index);
                    return false;
                }
                if (this.f5514a.charAt(i2) != str.charAt(index)) {
                    parsePosition.setErrorIndex(index);
                    return false;
                }
            }
            parsePosition.setIndex(this.f5514a.length() + parsePosition.getIndex());
            return true;
        }
    }

    public static class h extends j {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final k f5515b = new h("(Z|(?:[+-]\\d{2}))");
        public static final k c = new h("(Z|(?:[+-]\\d{2}\\d{2}))");
        public static final k d = new h("(Z|(?:[+-]\\d{2}(?::)\\d{2}))");

        public h(String str) {
            super(null);
            c(str);
        }

        public static k g(int i) {
            if (i == 1) {
                return f5515b;
            }
            if (i == 2) {
                return c;
            }
            if (i == 3) {
                return d;
            }
            throw new IllegalArgumentException("invalid number of X");
        }

        @Override // cn.hutool.core.date.format.FastDateParser.j
        public void e(FastDateParser fastDateParser, Calendar calendar, String str) {
            if (Objects.equals(str, "Z")) {
                calendar.setTimeZone(TimeZone.getTimeZone("UTC"));
                return;
            }
            calendar.setTimeZone(TimeZone.getTimeZone("GMT" + str));
        }
    }

    public static class i extends k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f5516a;

        public i(int i) {
            super(null);
            this.f5516a = i;
        }

        @Override // cn.hutool.core.date.format.FastDateParser.k
        public boolean a() {
            return true;
        }

        @Override // cn.hutool.core.date.format.FastDateParser.k
        public boolean b(FastDateParser fastDateParser, Calendar calendar, String str, ParsePosition parsePosition, int i) {
            int index = parsePosition.getIndex();
            int length = str.length();
            if (i == 0) {
                while (index < length && Character.isWhitespace(str.charAt(index))) {
                    index++;
                }
                parsePosition.setIndex(index);
            } else {
                int i2 = i + index;
                if (length > i2) {
                    length = i2;
                }
            }
            while (index < length && Character.isDigit(str.charAt(index))) {
                index++;
            }
            if (parsePosition.getIndex() == index) {
                parsePosition.setErrorIndex(index);
                return false;
            }
            int i3 = Integer.parseInt(str.substring(parsePosition.getIndex(), index));
            parsePosition.setIndex(index);
            calendar.set(this.f5516a, c(fastDateParser, i3));
            return true;
        }

        public int c(FastDateParser fastDateParser, int i) {
            return i;
        }
    }

    public static abstract class j extends k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Pattern f5517a;

        public j() {
            super(null);
        }

        @Override // cn.hutool.core.date.format.FastDateParser.k
        public boolean a() {
            return false;
        }

        @Override // cn.hutool.core.date.format.FastDateParser.k
        public boolean b(FastDateParser fastDateParser, Calendar calendar, String str, ParsePosition parsePosition, int i) {
            Matcher matcher = this.f5517a.matcher(str.substring(parsePosition.getIndex()));
            if (!matcher.lookingAt()) {
                parsePosition.setErrorIndex(parsePosition.getIndex());
                return false;
            }
            parsePosition.setIndex(parsePosition.getIndex() + matcher.end(1));
            e(fastDateParser, calendar, matcher.group(1));
            return true;
        }

        public void c(String str) {
            this.f5517a = Pattern.compile(str);
        }

        public void d(StringBuilder sb) {
            c(sb.toString());
        }

        public abstract void e(FastDateParser fastDateParser, Calendar calendar, String str);

        public /* synthetic */ j(a aVar) {
            this();
        }
    }

    public static abstract class k {
        public k() {
        }

        public /* synthetic */ k(a aVar) {
            this();
        }

        public boolean a() {
            return false;
        }

        public abstract boolean b(FastDateParser fastDateParser, Calendar calendar, String str, ParsePosition parsePosition, int i);
    }

    public static class l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final k f5518a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f5519b;

        public l(k kVar, int i) {
            this.f5518a = kVar;
            this.f5519b = i;
        }

        public int a(ListIterator<l> listIterator) {
            if (!this.f5518a.a() || !listIterator.hasNext()) {
                return 0;
            }
            k kVar = listIterator.next().f5518a;
            listIterator.previous();
            if (kVar.a()) {
                return this.f5519b;
            }
            return 0;
        }
    }

    public class m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Calendar f5520a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f5521b;

        public m(Calendar calendar) {
            this.f5520a = calendar;
        }

        public l a() {
            if (this.f5521b >= FastDateParser.this.pattern.length()) {
                return null;
            }
            char cCharAt = FastDateParser.this.pattern.charAt(this.f5521b);
            return FastDateParser.isFormatLetter(cCharAt) ? b(cCharAt) : c();
        }

        public final l b(char c) {
            int i = this.f5521b;
            do {
                int i2 = this.f5521b + 1;
                this.f5521b = i2;
                if (i2 >= FastDateParser.this.pattern.length()) {
                    break;
                }
            } while (FastDateParser.this.pattern.charAt(this.f5521b) == c);
            int i3 = this.f5521b - i;
            return new l(FastDateParser.this.getStrategy(c, i3, this.f5520a), i3);
        }

        public final l c() {
            StringBuilder sb = new StringBuilder();
            boolean z = false;
            while (this.f5521b < FastDateParser.this.pattern.length()) {
                char cCharAt = FastDateParser.this.pattern.charAt(this.f5521b);
                if (!z && FastDateParser.isFormatLetter(cCharAt)) {
                    break;
                }
                if (cCharAt == '\'') {
                    int i = this.f5521b + 1;
                    this.f5521b = i;
                    if (i == FastDateParser.this.pattern.length() || FastDateParser.this.pattern.charAt(this.f5521b) != '\'') {
                        z = !z;
                    }
                }
                this.f5521b++;
                sb.append(cCharAt);
            }
            if (z) {
                throw new IllegalArgumentException("Unterminated quote");
            }
            String string = sb.toString();
            return new l(new g(string), string.length());
        }
    }

    public static class n extends j {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Locale f5522b;
        public final Map<String, a> c;

        public static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public TimeZone f5523a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f5524b;

            public a(TimeZone timeZone, boolean z) {
                this.f5523a = timeZone;
                this.f5524b = z ? timeZone.getDSTSavings() : 0;
            }
        }

        public n(Locale locale) {
            super(null);
            this.c = new HashMap();
            this.f5522b = locale;
            StringBuilder sb = new StringBuilder();
            sb.append("((?iu)[+-]\\d{4}|[+-]\\d{2}:\\d{2}|GMT[+-]\\d{1,2}:\\d{2}");
            TreeSet<String> treeSet = new TreeSet(FastDateParser.LONGER_FIRST_LOWERCASE);
            for (String[] strArr : DateFormatSymbols.getInstance(locale).getZoneStrings()) {
                String str = strArr[0];
                if (!"GMT".equalsIgnoreCase(str)) {
                    TimeZone timeZone = TimeZone.getTimeZone(str);
                    a aVar = new a(timeZone, false);
                    a aVar2 = aVar;
                    for (int i = 1; i < strArr.length; i++) {
                        if (i == 3) {
                            aVar2 = new a(timeZone, true);
                        } else if (i == 5) {
                            aVar2 = aVar;
                        }
                        String str2 = strArr[i];
                        if (str2 != null) {
                            String lowerCase = str2.toLowerCase(locale);
                            if (treeSet.add(lowerCase)) {
                                this.c.put(lowerCase, aVar2);
                            }
                        }
                    }
                }
            }
            for (String str3 : treeSet) {
                sb.append('|');
                FastDateParser.simpleQuote(sb, str3);
            }
            sb.append(")");
            d(sb);
        }

        @Override // cn.hutool.core.date.format.FastDateParser.j
        public void e(FastDateParser fastDateParser, Calendar calendar, String str) {
            if (str.charAt(0) == '+' || str.charAt(0) == '-') {
                calendar.setTimeZone(TimeZone.getTimeZone("GMT" + str));
                return;
            }
            if (str.regionMatches(true, 0, "GMT", 0, 3)) {
                calendar.setTimeZone(TimeZone.getTimeZone(str.toUpperCase()));
            } else {
                calendar.set(16, this.c.get(str.toLowerCase(this.f5522b)).f5524b);
                calendar.set(15, fastDateParser.getTimeZone().getRawOffset());
            }
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
    public static Map<String, Integer> appendDisplayNames(Calendar calendar, Locale locale, int i2, StringBuilder sb) {
        HashMap map = new HashMap();
        Map<String, Integer> displayNames = calendar.getDisplayNames(i2, 0, locale);
        TreeSet treeSet = new TreeSet(LONGER_FIRST_LOWERCASE);
        for (Map.Entry<String, Integer> entry : displayNames.entrySet()) {
            String lowerCase = entry.getKey().toLowerCase(locale);
            if (treeSet.add(lowerCase)) {
                map.put(lowerCase, entry.getValue());
            }
        }
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            simpleQuote(sb, (String) it.next()).append('|');
        }
        return map;
    }

    private static ConcurrentMap<Locale, k> getCache(int i2) {
        ConcurrentMap<Locale, k> concurrentMap;
        ConcurrentMap<Locale, k>[] concurrentMapArr = CACHES;
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

    private k getLocaleSpecificStrategy(int i2, Calendar calendar) {
        ConcurrentMap<Locale, k> cache = getCache(i2);
        k nVar = cache.get(this.locale);
        if (nVar == null) {
            nVar = i2 == 15 ? new n(this.locale) : new f(i2, calendar, this.locale);
            k kVarPutIfAbsent = cache.putIfAbsent(this.locale, nVar);
            if (kVarPutIfAbsent != null) {
                return kVarPutIfAbsent;
            }
        }
        return nVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public k getStrategy(char c2, int i2, Calendar calendar) {
        if (c2 != 'y') {
            if (c2 != 'z') {
                switch (c2) {
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
                        switch (c2) {
                            case 'K':
                                return HOUR_STRATEGY;
                            case 'M':
                                return i2 >= 3 ? getLocaleSpecificStrategy(2, calendar) : NUMBER_MONTH_STRATEGY;
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
                                switch (c2) {
                                    case 'W':
                                        return WEEK_OF_MONTH_STRATEGY;
                                    case 'X':
                                        return h.g(i2);
                                    case 'Y':
                                        break;
                                    case 'Z':
                                        if (i2 == 2) {
                                            return h.d;
                                        }
                                        break;
                                    default:
                                        throw new IllegalArgumentException("Format '" + c2 + "' not supported");
                                }
                                break;
                        }
                        break;
                }
            }
            return getLocaleSpecificStrategy(15, calendar);
        }
        return i2 > 2 ? LITERAL_YEAR_STRATEGY : ABBREVIATED_YEAR_STRATEGY;
    }

    private void init(Calendar calendar) {
        this.patterns = new ArrayList();
        m mVar = new m(calendar);
        while (true) {
            l lVarA = mVar.a();
            if (lVarA == null) {
                return;
            } else {
                this.patterns.add(lVarA);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isFormatLetter(char c2) {
        return (c2 >= 'A' && c2 <= 'Z') || (c2 >= 'a' && c2 <= 'z');
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        init(Calendar.getInstance(this.timeZone, this.locale));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:22:0x002f  */
    public static StringBuilder simpleQuote(StringBuilder sb, String str) {
        for (int i2 = 0; i2 < str.length(); i2++) {
            char cCharAt = str.charAt(i2);
            if (cCharAt != '$' && cCharAt != '.' && cCharAt != '?' && cCharAt != '^' && cCharAt != '[' && cCharAt != '\\' && cCharAt != '{' && cCharAt != '|') {
                switch (cCharAt) {
                    case '(':
                    case ')':
                    case '*':
                    case '+':
                        sb.append(AbstractJsonLexerKt.STRING_ESC);
                        break;
                }
            } else {
                sb.append(AbstractJsonLexerKt.STRING_ESC);
            }
            sb.append(cCharAt);
        }
        return sb;
    }

    @Override // defpackage.vp5
    public Date parse(String str) throws ParseException {
        ParsePosition parsePosition = new ParsePosition(0);
        Date date = parse(str, parsePosition);
        if (date != null) {
            return date;
        }
        if (!this.locale.equals(JAPANESE_IMPERIAL)) {
            throw new ParseException("Unparseable date: " + str, parsePosition.getErrorIndex());
        }
        throw new ParseException("(The " + this.locale + " locale does not support dates before 1868 AD)\nUnparseable date: \"" + str, parsePosition.getErrorIndex());
    }

    public Object parseObject(String str) throws ParseException {
        return parse(str);
    }

    public FastDateParser(String str, TimeZone timeZone, Locale locale, Date date) {
        int i2;
        super(str, timeZone, locale);
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
        Calendar calendar = Calendar.getInstance(this.timeZone, this.locale);
        calendar.clear();
        if (parse(str, parsePosition, calendar)) {
            return calendar.getTime();
        }
        return null;
    }

    public boolean parse(String str, ParsePosition parsePosition, Calendar calendar) {
        ListIterator<l> listIterator = this.patterns.listIterator();
        while (listIterator.hasNext()) {
            l next = listIterator.next();
            if (!next.f5518a.b(this, calendar, str, parsePosition, next.a(listIterator))) {
                return false;
            }
        }
        return true;
    }
}
