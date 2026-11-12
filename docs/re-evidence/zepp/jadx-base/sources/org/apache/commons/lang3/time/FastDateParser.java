package org.apache.commons.lang3.time;

import com.google.android.material.datepicker.UtcDates;
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

/* JADX INFO: loaded from: classes23.dex */
public class FastDateParser implements DateParser, Serializable {
    private static final long serialVersionUID = 3;
    private final String a;
    private final TimeZone b;
    private final Locale c;
    private final int d;
    private final int e;
    private transient List<m> f;
    public static final Locale g = new Locale("ja", "JP", "JP");
    private static final Comparator<String> h = new a();
    private static final ConcurrentMap<Locale, l>[] i = new ConcurrentMap[17];
    private static final l j = new b(1);
    private static final l k = new c(2);
    private static final l l = new j(1);
    private static final l m = new j(3);
    private static final l n = new j(4);
    private static final l o = new j(6);
    private static final l p = new j(5);
    private static final l q = new d(7);
    private static final l r = new j(8);
    private static final l s = new j(11);
    private static final l t = new e(11);
    private static final l u = new f(10);
    private static final l v = new j(10);
    private static final l w = new j(12);
    private static final l x = new j(13);
    private static final l y = new j(14);

    public static class a implements Comparator<String> {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(String str, String str2) {
            return str2.compareTo(str);
        }
    }

    public static class b extends j {
        public b(int i) {
            super(i);
        }

        @Override // org.apache.commons.lang3.time.FastDateParser.j
        public int c(FastDateParser fastDateParser, int i) {
            return i < 100 ? fastDateParser.i(i) : i;
        }
    }

    public static class c extends j {
        public c(int i) {
            super(i);
        }

        @Override // org.apache.commons.lang3.time.FastDateParser.j
        public int c(FastDateParser fastDateParser, int i) {
            return i - 1;
        }
    }

    public static class d extends j {
        public d(int i) {
            super(i);
        }

        @Override // org.apache.commons.lang3.time.FastDateParser.j
        public int c(FastDateParser fastDateParser, int i) {
            if (i != 7) {
                return 1 + i;
            }
            return 1;
        }
    }

    public static class e extends j {
        public e(int i) {
            super(i);
        }

        @Override // org.apache.commons.lang3.time.FastDateParser.j
        public int c(FastDateParser fastDateParser, int i) {
            if (i == 24) {
                return 0;
            }
            return i;
        }
    }

    public static class f extends j {
        public f(int i) {
            super(i);
        }

        @Override // org.apache.commons.lang3.time.FastDateParser.j
        public int c(FastDateParser fastDateParser, int i) {
            if (i == 12) {
                return 0;
            }
            return i;
        }
    }

    public static class g extends k {
        private final int b;
        public final Locale c;
        private final Map<String, Integer> d;

        public g(int i, Calendar calendar, Locale locale) {
            super(null);
            this.b = i;
            this.c = locale;
            StringBuilder sb = new StringBuilder();
            sb.append("((?iu)");
            this.d = FastDateParser.j(calendar, locale, i, sb);
            sb.setLength(sb.length() - 1);
            sb.append(")");
            d(sb);
        }

        @Override // org.apache.commons.lang3.time.FastDateParser.k
        public void e(FastDateParser fastDateParser, Calendar calendar, String str) {
            calendar.set(this.b, this.d.get(str.toLowerCase(this.c)).intValue());
        }
    }

    public static class h extends l {
        private final String a;

        public h(String str) {
            super(null);
            this.a = str;
        }

        @Override // org.apache.commons.lang3.time.FastDateParser.l
        public boolean a() {
            return false;
        }

        @Override // org.apache.commons.lang3.time.FastDateParser.l
        public boolean b(FastDateParser fastDateParser, Calendar calendar, String str, ParsePosition parsePosition, int i) {
            for (int i2 = 0; i2 < this.a.length(); i2++) {
                int index = parsePosition.getIndex() + i2;
                if (index == str.length()) {
                    parsePosition.setErrorIndex(index);
                    return false;
                }
                if (this.a.charAt(i2) != str.charAt(index)) {
                    parsePosition.setErrorIndex(index);
                    return false;
                }
            }
            parsePosition.setIndex(this.a.length() + parsePosition.getIndex());
            return true;
        }
    }

    public static class i extends k {
        private static final l b = new i("(Z|(?:[+-]\\d{2}))");
        private static final l c = new i("(Z|(?:[+-]\\d{2}\\d{2}))");
        private static final l d = new i("(Z|(?:[+-]\\d{2}(?::)\\d{2}))");

        public i(String str) {
            super(null);
            c(str);
        }

        public static l g(int i) {
            if (i == 1) {
                return b;
            }
            if (i == 2) {
                return c;
            }
            if (i == 3) {
                return d;
            }
            throw new IllegalArgumentException("invalid number of X");
        }

        @Override // org.apache.commons.lang3.time.FastDateParser.k
        public void e(FastDateParser fastDateParser, Calendar calendar, String str) {
            if (str.equals("Z")) {
                calendar.setTimeZone(TimeZone.getTimeZone(UtcDates.UTC));
                return;
            }
            calendar.setTimeZone(TimeZone.getTimeZone("GMT" + str));
        }
    }

    public static class j extends l {
        private final int a;

        public j(int i) {
            super(null);
            this.a = i;
        }

        @Override // org.apache.commons.lang3.time.FastDateParser.l
        public boolean a() {
            return true;
        }

        @Override // org.apache.commons.lang3.time.FastDateParser.l
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
            calendar.set(this.a, c(fastDateParser, i3));
            return true;
        }

        public int c(FastDateParser fastDateParser, int i) {
            return i;
        }
    }

    public static abstract class k extends l {
        private Pattern a;

        private k() {
            super(null);
        }

        @Override // org.apache.commons.lang3.time.FastDateParser.l
        public boolean a() {
            return false;
        }

        @Override // org.apache.commons.lang3.time.FastDateParser.l
        public boolean b(FastDateParser fastDateParser, Calendar calendar, String str, ParsePosition parsePosition, int i) {
            Matcher matcher = this.a.matcher(str.substring(parsePosition.getIndex()));
            if (!matcher.lookingAt()) {
                parsePosition.setErrorIndex(parsePosition.getIndex());
                return false;
            }
            parsePosition.setIndex(parsePosition.getIndex() + matcher.end(1));
            e(fastDateParser, calendar, matcher.group(1));
            return true;
        }

        public void c(String str) {
            this.a = Pattern.compile(str);
        }

        public void d(StringBuilder sb) {
            c(sb.toString());
        }

        public abstract void e(FastDateParser fastDateParser, Calendar calendar, String str);

        public /* synthetic */ k(a aVar) {
            this();
        }
    }

    public static abstract class l {
        private l() {
        }

        public boolean a() {
            return false;
        }

        public abstract boolean b(FastDateParser fastDateParser, Calendar calendar, String str, ParsePosition parsePosition, int i);

        public /* synthetic */ l(a aVar) {
            this();
        }
    }

    public static class m {
        public final l a;
        public final int b;

        public m(l lVar, int i) {
            this.a = lVar;
            this.b = i;
        }

        public int a(ListIterator<m> listIterator) {
            if (!this.a.a() || !listIterator.hasNext()) {
                return 0;
            }
            l lVar = listIterator.next().a;
            listIterator.previous();
            if (lVar.a()) {
                return this.b;
            }
            return 0;
        }
    }

    public class n {
        private final Calendar a;
        private int b;

        public n(Calendar calendar) {
            this.a = calendar;
        }

        private m b(char c) {
            int i = this.b;
            do {
                int i2 = this.b + 1;
                this.b = i2;
                if (i2 >= FastDateParser.this.a.length()) {
                    break;
                }
            } while (FastDateParser.this.a.charAt(this.b) == c);
            int i3 = this.b - i;
            return new m(FastDateParser.this.n(c, i3, this.a), i3);
        }

        private m c() {
            StringBuilder sb = new StringBuilder();
            boolean z = false;
            while (this.b < FastDateParser.this.a.length()) {
                char cCharAt = FastDateParser.this.a.charAt(this.b);
                if (!z && FastDateParser.p(cCharAt)) {
                    break;
                }
                if (cCharAt == '\'') {
                    int i = this.b + 1;
                    this.b = i;
                    if (i == FastDateParser.this.a.length() || FastDateParser.this.a.charAt(this.b) != '\'') {
                        z = !z;
                    }
                }
                this.b++;
                sb.append(cCharAt);
            }
            if (z) {
                throw new IllegalArgumentException("Unterminated quote");
            }
            String string = sb.toString();
            return new m(new h(string), string.length());
        }

        public m a() {
            if (this.b >= FastDateParser.this.a.length()) {
                return null;
            }
            char cCharAt = FastDateParser.this.a.charAt(this.b);
            return FastDateParser.p(cCharAt) ? b(cCharAt) : c();
        }
    }

    public static class o extends k {
        private static final String d = "[+-]\\d{4}";
        private static final String e = "GMT[+-]\\d{1,2}:\\d{2}";
        private static final int f = 0;
        private final Locale b;
        private final Map<String, a> c;

        public static class a {
            public TimeZone a;
            public int b;

            public a(TimeZone timeZone, boolean z) {
                this.a = timeZone;
                this.b = z ? timeZone.getDSTSavings() : 0;
            }
        }

        public o(Locale locale) {
            super(null);
            this.c = new HashMap();
            this.b = locale;
            StringBuilder sb = new StringBuilder();
            sb.append("((?iu)[+-]\\d{4}|GMT[+-]\\d{1,2}:\\d{2}");
            TreeSet<String> treeSet = new TreeSet(FastDateParser.h);
            for (String[] strArr : DateFormatSymbols.getInstance(locale).getZoneStrings()) {
                String str = strArr[0];
                if (!str.equalsIgnoreCase("GMT")) {
                    TimeZone timeZone = TimeZone.getTimeZone(str);
                    a aVar = new a(timeZone, false);
                    a aVar2 = aVar;
                    for (int i = 1; i < strArr.length; i++) {
                        if (i == 3) {
                            aVar2 = new a(timeZone, true);
                        } else if (i == 5) {
                            aVar2 = aVar;
                        }
                        if (strArr[i] != null) {
                            String lowerCase = strArr[i].toLowerCase(locale);
                            if (treeSet.add(lowerCase)) {
                                this.c.put(lowerCase, aVar2);
                            }
                        }
                    }
                }
            }
            for (String str2 : treeSet) {
                sb.append('|');
                FastDateParser.q(sb, str2);
            }
            sb.append(")");
            d(sb);
        }

        @Override // org.apache.commons.lang3.time.FastDateParser.k
        public void e(FastDateParser fastDateParser, Calendar calendar, String str) {
            if (str.charAt(0) == '+' || str.charAt(0) == '-') {
                calendar.setTimeZone(TimeZone.getTimeZone("GMT" + str));
                return;
            }
            if (str.regionMatches(true, 0, "GMT", 0, 3)) {
                calendar.setTimeZone(TimeZone.getTimeZone(str.toUpperCase()));
                return;
            }
            a aVar = this.c.get(str.toLowerCase(this.b));
            calendar.set(16, aVar.b);
            calendar.set(15, aVar.a.getRawOffset());
        }
    }

    public FastDateParser(String str, TimeZone timeZone, Locale locale) {
        this(str, timeZone, locale, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int i(int i2) {
        int i3 = this.d + i2;
        return i2 >= this.e ? i3 : i3 + 100;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Map<String, Integer> j(Calendar calendar, Locale locale, int i2, StringBuilder sb) {
        HashMap map = new HashMap();
        Map<String, Integer> displayNames = calendar.getDisplayNames(i2, 0, locale);
        TreeSet treeSet = new TreeSet(h);
        for (Map.Entry<String, Integer> entry : displayNames.entrySet()) {
            String lowerCase = entry.getKey().toLowerCase(locale);
            if (treeSet.add(lowerCase)) {
                map.put(lowerCase, entry.getValue());
            }
        }
        Iterator it2 = treeSet.iterator();
        while (it2.hasNext()) {
            q(sb, (String) it2.next()).append('|');
        }
        return map;
    }

    private static ConcurrentMap<Locale, l> k(int i2) {
        ConcurrentMap<Locale, l> concurrentMap;
        ConcurrentMap<Locale, l>[] concurrentMapArr = i;
        synchronized (concurrentMapArr) {
            if (concurrentMapArr[i2] == null) {
                concurrentMapArr[i2] = new ConcurrentHashMap(3);
            }
            concurrentMap = concurrentMapArr[i2];
        }
        return concurrentMap;
    }

    private l m(int i2, Calendar calendar) {
        ConcurrentMap<Locale, l> concurrentMapK = k(i2);
        l oVar = concurrentMapK.get(this.c);
        if (oVar == null) {
            oVar = i2 == 15 ? new o(this.c) : new g(i2, calendar, this.c);
            l lVarPutIfAbsent = concurrentMapK.putIfAbsent(this.c, oVar);
            if (lVarPutIfAbsent != null) {
                return lVarPutIfAbsent;
            }
        }
        return oVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public l n(char c2, int i2, Calendar calendar) {
        if (c2 != 'y') {
            if (c2 != 'z') {
                switch (c2) {
                    case 'D':
                        return o;
                    case 'E':
                        return m(7, calendar);
                    case 'F':
                        return r;
                    case 'G':
                        return m(0, calendar);
                    case 'H':
                        return s;
                    default:
                        switch (c2) {
                            case 'K':
                                return v;
                            case 'M':
                                return i2 >= 3 ? m(2, calendar) : k;
                            case 'S':
                                return y;
                            case 'a':
                                return m(9, calendar);
                            case 'd':
                                return p;
                            case 'h':
                                return u;
                            case 'k':
                                return t;
                            case 'm':
                                return w;
                            case 's':
                                return x;
                            case 'u':
                                return q;
                            case 'w':
                                return m;
                            default:
                                switch (c2) {
                                    case 'W':
                                        return n;
                                    case 'X':
                                        return i.g(i2);
                                    case 'Y':
                                        break;
                                    case 'Z':
                                        if (i2 == 2) {
                                            return i.d;
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
            return m(15, calendar);
        }
        return i2 > 2 ? l : j;
    }

    private void o(Calendar calendar) {
        this.f = new ArrayList();
        n nVar = new n(calendar);
        while (true) {
            m mVarA = nVar.a();
            if (mVarA == null) {
                return;
            } else {
                this.f.add(mVarA);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean p(char c2) {
        return (c2 >= 'A' && c2 <= 'Z') || (c2 >= 'a' && c2 <= 'z');
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:22:0x002f  */
    public static StringBuilder q(StringBuilder sb, String str) {
        for (int i2 = 0; i2 < str.length(); i2++) {
            char cCharAt = str.charAt(i2);
            if (cCharAt != '$' && cCharAt != '.' && cCharAt != '?' && cCharAt != '^' && cCharAt != '[' && cCharAt != '\\' && cCharAt != '{' && cCharAt != '|') {
                switch (cCharAt) {
                    case '(':
                    case ')':
                    case '*':
                    case '+':
                        sb.append('\\');
                        break;
                }
            } else {
                sb.append('\\');
            }
            sb.append(cCharAt);
        }
        return sb;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        o(Calendar.getInstance(this.b, this.c));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof FastDateParser)) {
            return false;
        }
        FastDateParser fastDateParser = (FastDateParser) obj;
        return this.a.equals(fastDateParser.a) && this.b.equals(fastDateParser.b) && this.c.equals(fastDateParser.c);
    }

    @Override // org.apache.commons.lang3.time.DateParser, org.apache.commons.lang3.time.DatePrinter
    public Locale getLocale() {
        return this.c;
    }

    @Override // org.apache.commons.lang3.time.DateParser, org.apache.commons.lang3.time.DatePrinter
    public String getPattern() {
        return this.a;
    }

    @Override // org.apache.commons.lang3.time.DateParser, org.apache.commons.lang3.time.DatePrinter
    public TimeZone getTimeZone() {
        return this.b;
    }

    public int hashCode() {
        return this.a.hashCode() + ((this.b.hashCode() + (this.c.hashCode() * 13)) * 13);
    }

    @Override // org.apache.commons.lang3.time.DateParser
    public Date parse(String str) throws ParseException {
        ParsePosition parsePosition = new ParsePosition(0);
        Date date = parse(str, parsePosition);
        if (date != null) {
            return date;
        }
        if (!this.c.equals(g)) {
            throw new ParseException("Unparseable date: " + str, parsePosition.getErrorIndex());
        }
        throw new ParseException("(The " + this.c + " locale does not support dates before 1868 AD)\nUnparseable date: \"" + str, parsePosition.getErrorIndex());
    }

    @Override // org.apache.commons.lang3.time.DateParser
    public Object parseObject(String str) throws ParseException {
        return parse(str);
    }

    public String toString() {
        return "FastDateParser[" + this.a + "," + this.c + "," + this.b.getID() + "]";
    }

    public FastDateParser(String str, TimeZone timeZone, Locale locale, Date date) {
        int i2;
        this.a = str;
        this.b = timeZone;
        this.c = locale;
        Calendar calendar = Calendar.getInstance(timeZone, locale);
        if (date != null) {
            calendar.setTime(date);
            i2 = calendar.get(1);
        } else if (locale.equals(g)) {
            i2 = 0;
        } else {
            calendar.setTime(new Date());
            i2 = calendar.get(1) - 80;
        }
        int i3 = (i2 / 100) * 100;
        this.d = i3;
        this.e = i2 - i3;
        o(calendar);
    }

    @Override // org.apache.commons.lang3.time.DateParser
    public Object parseObject(String str, ParsePosition parsePosition) {
        return parse(str, parsePosition);
    }

    @Override // org.apache.commons.lang3.time.DateParser
    public Date parse(String str, ParsePosition parsePosition) {
        Calendar calendar = Calendar.getInstance(this.b, this.c);
        calendar.clear();
        if (parse(str, parsePosition, calendar)) {
            return calendar.getTime();
        }
        return null;
    }

    @Override // org.apache.commons.lang3.time.DateParser
    public boolean parse(String str, ParsePosition parsePosition, Calendar calendar) {
        ListIterator<m> listIterator = this.f.listIterator();
        while (listIterator.hasNext()) {
            m next = listIterator.next();
            if (!next.a.b(this, calendar, str, parsePosition, next.a(listIterator))) {
                return false;
            }
        }
        return true;
    }
}
