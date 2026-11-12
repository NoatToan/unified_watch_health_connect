package org.apache.commons.lang.time;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.text.DateFormat;
import java.text.DateFormatSymbols;
import java.text.FieldPosition;
import java.text.Format;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import kotlinx.serialization.json.internal.JsonLexerKt;
import org.apache.commons.lang.Validate;
import org.apache.commons.lang.text.StrBuilder;

/* JADX INFO: loaded from: classes23.dex */
public class FastDateFormat extends Format {
    public static final int FULL = 0;
    public static final int LONG = 1;
    public static final int MEDIUM = 2;
    public static final int SHORT = 3;
    private static String h = null;
    private static final Map i = new HashMap(7);
    private static final Map j = new HashMap(7);
    private static final Map k = new HashMap(7);
    private static final Map l = new HashMap(7);
    private static final Map m = new HashMap(7);
    private static final long serialVersionUID = 1;
    private final String a;
    private final TimeZone b;
    private final boolean c;
    private final Locale d;
    private final boolean e;
    private transient e[] f;
    private transient int g;

    public static class a implements e {
        private final char a;

        public a(char c) {
            this.a = c;
        }

        @Override // org.apache.commons.lang.time.FastDateFormat.e
        public int a() {
            return 1;
        }

        @Override // org.apache.commons.lang.time.FastDateFormat.e
        public void c(StringBuffer stringBuffer, Calendar calendar) {
            stringBuffer.append(this.a);
        }
    }

    public interface b extends e {
        void b(StringBuffer stringBuffer, int i);
    }

    public static class c implements b {
        private final int a;
        private final int b;

        public c(int i, int i2) {
            if (i2 < 3) {
                throw new IllegalArgumentException();
            }
            this.a = i;
            this.b = i2;
        }

        @Override // org.apache.commons.lang.time.FastDateFormat.e
        public int a() {
            return 4;
        }

        @Override // org.apache.commons.lang.time.FastDateFormat.b
        public final void b(StringBuffer stringBuffer, int i) {
            int length;
            if (i < 100) {
                int i2 = this.b;
                while (true) {
                    i2--;
                    if (i2 < 2) {
                        stringBuffer.append((char) ((i / 10) + 48));
                        stringBuffer.append((char) ((i % 10) + 48));
                        return;
                    }
                    stringBuffer.append('0');
                }
            } else {
                if (i < 1000) {
                    length = 3;
                } else {
                    Validate.isTrue(i > -1, "Negative values should not be possible", i);
                    length = Integer.toString(i).length();
                }
                int i3 = this.b;
                while (true) {
                    i3--;
                    if (i3 < length) {
                        stringBuffer.append(Integer.toString(i));
                        return;
                    }
                    stringBuffer.append('0');
                }
            }
        }

        @Override // org.apache.commons.lang.time.FastDateFormat.e
        public void c(StringBuffer stringBuffer, Calendar calendar) {
            b(stringBuffer, calendar.get(this.a));
        }
    }

    public static class d {
        private final Object a;
        private final Object b;

        public d(Object obj, Object obj2) {
            this.a = obj;
            this.b = obj2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            Object obj2 = this.a;
            if (obj2 != null ? obj2.equals(dVar.a) : dVar.a == null) {
                Object obj3 = this.b;
                Object obj4 = dVar.b;
                if (obj3 == null) {
                    if (obj4 == null) {
                        return true;
                    }
                } else if (obj3.equals(obj4)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            Object obj = this.a;
            int iHashCode = obj == null ? 0 : obj.hashCode();
            Object obj2 = this.b;
            return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
        }

        public String toString() {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("[");
            stringBuffer.append(this.a);
            stringBuffer.append(JsonLexerKt.COLON);
            stringBuffer.append(this.b);
            stringBuffer.append(JsonLexerKt.END_LIST);
            return stringBuffer.toString();
        }
    }

    public interface e {
        int a();

        void c(StringBuffer stringBuffer, Calendar calendar);
    }

    public static class f implements e {
        private final String a;

        public f(String str) {
            this.a = str;
        }

        @Override // org.apache.commons.lang.time.FastDateFormat.e
        public int a() {
            return this.a.length();
        }

        @Override // org.apache.commons.lang.time.FastDateFormat.e
        public void c(StringBuffer stringBuffer, Calendar calendar) {
            stringBuffer.append(this.a);
        }
    }

    public static class g implements e {
        private final int a;
        private final String[] b;

        public g(int i, String[] strArr) {
            this.a = i;
            this.b = strArr;
        }

        @Override // org.apache.commons.lang.time.FastDateFormat.e
        public int a() {
            int length = this.b.length;
            int i = 0;
            while (true) {
                length--;
                if (length < 0) {
                    return i;
                }
                int length2 = this.b[length].length();
                if (length2 > i) {
                    i = length2;
                }
            }
        }

        @Override // org.apache.commons.lang.time.FastDateFormat.e
        public void c(StringBuffer stringBuffer, Calendar calendar) {
            stringBuffer.append(this.b[calendar.get(this.a)]);
        }
    }

    public static class h {
        private final TimeZone a;
        private final int b;
        private final Locale c;

        public h(TimeZone timeZone, boolean z, int i, Locale locale) {
            this.a = timeZone;
            this.b = z ? i | Integer.MIN_VALUE : i;
            this.c = locale;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return this.a.equals(hVar.a) && this.b == hVar.b && this.c.equals(hVar.c);
        }

        public int hashCode() {
            return (this.b * 31) + this.c.hashCode();
        }
    }

    public static class i implements e {
        private final TimeZone a;
        private final boolean b;
        private final Locale c;
        private final int d;
        private final String e;
        private final String f;

        public i(TimeZone timeZone, boolean z, Locale locale, int i) {
            this.a = timeZone;
            this.b = z;
            this.c = locale;
            this.d = i;
            if (z) {
                this.e = FastDateFormat.b(timeZone, false, i, locale);
                this.f = FastDateFormat.b(timeZone, true, i, locale);
            } else {
                this.e = null;
                this.f = null;
            }
        }

        @Override // org.apache.commons.lang.time.FastDateFormat.e
        public int a() {
            if (this.b) {
                return Math.max(this.e.length(), this.f.length());
            }
            return this.d == 0 ? 4 : 40;
        }

        @Override // org.apache.commons.lang.time.FastDateFormat.e
        public void c(StringBuffer stringBuffer, Calendar calendar) {
            if (this.b) {
                if (!this.a.useDaylightTime() || calendar.get(16) == 0) {
                    stringBuffer.append(this.e);
                    return;
                } else {
                    stringBuffer.append(this.f);
                    return;
                }
            }
            TimeZone timeZone = calendar.getTimeZone();
            if (!timeZone.useDaylightTime() || calendar.get(16) == 0) {
                stringBuffer.append(FastDateFormat.b(timeZone, false, this.d, this.c));
            } else {
                stringBuffer.append(FastDateFormat.b(timeZone, true, this.d, this.c));
            }
        }
    }

    public static class j implements e {
        public static final j b = new j(true);
        public static final j c = new j(false);
        public final boolean a;

        public j(boolean z) {
            this.a = z;
        }

        @Override // org.apache.commons.lang.time.FastDateFormat.e
        public int a() {
            return 5;
        }

        @Override // org.apache.commons.lang.time.FastDateFormat.e
        public void c(StringBuffer stringBuffer, Calendar calendar) {
            int i = calendar.get(15) + calendar.get(16);
            if (i < 0) {
                stringBuffer.append('-');
                i = -i;
            } else {
                stringBuffer.append('+');
            }
            int i2 = i / 3600000;
            stringBuffer.append((char) ((i2 / 10) + 48));
            stringBuffer.append((char) ((i2 % 10) + 48));
            if (this.a) {
                stringBuffer.append(JsonLexerKt.COLON);
            }
            int i3 = (i / 60000) - (i2 * 60);
            stringBuffer.append((char) ((i3 / 10) + 48));
            stringBuffer.append((char) ((i3 % 10) + 48));
        }
    }

    public static class k implements b {
        private final b a;

        public k(b bVar) {
            this.a = bVar;
        }

        @Override // org.apache.commons.lang.time.FastDateFormat.e
        public int a() {
            return this.a.a();
        }

        @Override // org.apache.commons.lang.time.FastDateFormat.b
        public void b(StringBuffer stringBuffer, int i) {
            this.a.b(stringBuffer, i);
        }

        @Override // org.apache.commons.lang.time.FastDateFormat.e
        public void c(StringBuffer stringBuffer, Calendar calendar) {
            int leastMaximum = calendar.get(10);
            if (leastMaximum == 0) {
                leastMaximum = calendar.getLeastMaximum(10) + 1;
            }
            this.a.b(stringBuffer, leastMaximum);
        }
    }

    public static class l implements b {
        private final b a;

        public l(b bVar) {
            this.a = bVar;
        }

        @Override // org.apache.commons.lang.time.FastDateFormat.e
        public int a() {
            return this.a.a();
        }

        @Override // org.apache.commons.lang.time.FastDateFormat.b
        public void b(StringBuffer stringBuffer, int i) {
            this.a.b(stringBuffer, i);
        }

        @Override // org.apache.commons.lang.time.FastDateFormat.e
        public void c(StringBuffer stringBuffer, Calendar calendar) {
            int maximum = calendar.get(11);
            if (maximum == 0) {
                maximum = calendar.getMaximum(11) + 1;
            }
            this.a.b(stringBuffer, maximum);
        }
    }

    public static class m implements b {
        public static final m a = new m();

        @Override // org.apache.commons.lang.time.FastDateFormat.e
        public int a() {
            return 2;
        }

        @Override // org.apache.commons.lang.time.FastDateFormat.b
        public final void b(StringBuffer stringBuffer, int i) {
            stringBuffer.append((char) ((i / 10) + 48));
            stringBuffer.append((char) ((i % 10) + 48));
        }

        @Override // org.apache.commons.lang.time.FastDateFormat.e
        public void c(StringBuffer stringBuffer, Calendar calendar) {
            b(stringBuffer, calendar.get(2) + 1);
        }
    }

    public static class n implements b {
        private final int a;

        public n(int i) {
            this.a = i;
        }

        @Override // org.apache.commons.lang.time.FastDateFormat.e
        public int a() {
            return 2;
        }

        @Override // org.apache.commons.lang.time.FastDateFormat.b
        public final void b(StringBuffer stringBuffer, int i) {
            if (i >= 100) {
                stringBuffer.append(Integer.toString(i));
            } else {
                stringBuffer.append((char) ((i / 10) + 48));
                stringBuffer.append((char) ((i % 10) + 48));
            }
        }

        @Override // org.apache.commons.lang.time.FastDateFormat.e
        public void c(StringBuffer stringBuffer, Calendar calendar) {
            b(stringBuffer, calendar.get(this.a));
        }
    }

    public static class o implements b {
        public static final o a = new o();

        @Override // org.apache.commons.lang.time.FastDateFormat.e
        public int a() {
            return 2;
        }

        @Override // org.apache.commons.lang.time.FastDateFormat.b
        public final void b(StringBuffer stringBuffer, int i) {
            stringBuffer.append((char) ((i / 10) + 48));
            stringBuffer.append((char) ((i % 10) + 48));
        }

        @Override // org.apache.commons.lang.time.FastDateFormat.e
        public void c(StringBuffer stringBuffer, Calendar calendar) {
            b(stringBuffer, calendar.get(1) % 100);
        }
    }

    public static class p implements b {
        public static final p a = new p();

        @Override // org.apache.commons.lang.time.FastDateFormat.e
        public int a() {
            return 2;
        }

        @Override // org.apache.commons.lang.time.FastDateFormat.b
        public final void b(StringBuffer stringBuffer, int i) {
            if (i < 10) {
                stringBuffer.append((char) (i + 48));
            } else {
                stringBuffer.append((char) ((i / 10) + 48));
                stringBuffer.append((char) ((i % 10) + 48));
            }
        }

        @Override // org.apache.commons.lang.time.FastDateFormat.e
        public void c(StringBuffer stringBuffer, Calendar calendar) {
            b(stringBuffer, calendar.get(2) + 1);
        }
    }

    public static class q implements b {
        private final int a;

        public q(int i) {
            this.a = i;
        }

        @Override // org.apache.commons.lang.time.FastDateFormat.e
        public int a() {
            return 4;
        }

        @Override // org.apache.commons.lang.time.FastDateFormat.b
        public final void b(StringBuffer stringBuffer, int i) {
            if (i < 10) {
                stringBuffer.append((char) (i + 48));
            } else if (i >= 100) {
                stringBuffer.append(Integer.toString(i));
            } else {
                stringBuffer.append((char) ((i / 10) + 48));
                stringBuffer.append((char) ((i % 10) + 48));
            }
        }

        @Override // org.apache.commons.lang.time.FastDateFormat.e
        public void c(StringBuffer stringBuffer, Calendar calendar) {
            b(stringBuffer, calendar.get(this.a));
        }
    }

    public FastDateFormat(String str, TimeZone timeZone, Locale locale) {
        if (str == null) {
            throw new IllegalArgumentException("The pattern must not be null");
        }
        this.a = str;
        this.c = timeZone != null;
        this.b = timeZone == null ? TimeZone.getDefault() : timeZone;
        this.e = locale != null;
        this.d = locale == null ? Locale.getDefault() : locale;
    }

    private static synchronized String a() {
        if (h == null) {
            h = new SimpleDateFormat().toPattern();
        }
        return h;
    }

    public static synchronized String b(TimeZone timeZone, boolean z, int i2, Locale locale) {
        String displayName;
        h hVar = new h(timeZone, z, i2, locale);
        Map map = m;
        displayName = (String) map.get(hVar);
        if (displayName == null) {
            displayName = timeZone.getDisplayName(z, i2, locale);
            map.put(hVar, displayName);
        }
        return displayName;
    }

    public static FastDateFormat getDateInstance(int i2) {
        return getDateInstance(i2, null, null);
    }

    public static FastDateFormat getDateTimeInstance(int i2, int i3) {
        return getDateTimeInstance(i2, i3, null, null);
    }

    public static FastDateFormat getInstance() {
        return getInstance(a(), null, null);
    }

    public static FastDateFormat getTimeInstance(int i2) {
        return getTimeInstance(i2, null, null);
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        init();
    }

    public StringBuffer applyRules(Calendar calendar, StringBuffer stringBuffer) {
        for (e eVar : this.f) {
            eVar.c(stringBuffer, calendar);
        }
        return stringBuffer;
    }

    public boolean equals(Object obj) {
        TimeZone timeZone;
        TimeZone timeZone2;
        Locale locale;
        Locale locale2;
        if (!(obj instanceof FastDateFormat)) {
            return false;
        }
        FastDateFormat fastDateFormat = (FastDateFormat) obj;
        String str = this.a;
        String str2 = fastDateFormat.a;
        return (str == str2 || str.equals(str2)) && ((timeZone = this.b) == (timeZone2 = fastDateFormat.b) || timeZone.equals(timeZone2)) && (((locale = this.d) == (locale2 = fastDateFormat.d) || locale.equals(locale2)) && this.c == fastDateFormat.c && this.e == fastDateFormat.e);
    }

    @Override // java.text.Format
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
        StringBuffer stringBuffer2 = new StringBuffer();
        stringBuffer2.append("Unknown class: ");
        stringBuffer2.append(obj == null ? "<null>" : obj.getClass().getName());
        throw new IllegalArgumentException(stringBuffer2.toString());
    }

    public Locale getLocale() {
        return this.d;
    }

    public int getMaxLengthEstimate() {
        return this.g;
    }

    public String getPattern() {
        return this.a;
    }

    public TimeZone getTimeZone() {
        return this.b;
    }

    public boolean getTimeZoneOverridesCalendar() {
        return this.c;
    }

    public int hashCode() {
        return this.a.hashCode() + 0 + this.b.hashCode() + (this.c ? 1 : 0) + this.d.hashCode() + (this.e ? 1 : 0);
    }

    public void init() {
        List pattern = parsePattern();
        e[] eVarArr = (e[]) pattern.toArray(new e[pattern.size()]);
        this.f = eVarArr;
        int length = eVarArr.length;
        int iA = 0;
        while (true) {
            length--;
            if (length < 0) {
                this.g = iA;
                return;
            }
            iA += this.f[length].a();
        }
    }

    @Override // java.text.Format
    public Object parseObject(String str, ParsePosition parsePosition) {
        parsePosition.setIndex(0);
        parsePosition.setErrorIndex(0);
        return null;
    }

    public List parsePattern() {
        Object objSelectNumberRule;
        Object iVar;
        DateFormatSymbols dateFormatSymbols = new DateFormatSymbols(this.d);
        ArrayList arrayList = new ArrayList();
        String[] eras = dateFormatSymbols.getEras();
        String[] months = dateFormatSymbols.getMonths();
        String[] shortMonths = dateFormatSymbols.getShortMonths();
        String[] weekdays = dateFormatSymbols.getWeekdays();
        String[] shortWeekdays = dateFormatSymbols.getShortWeekdays();
        String[] amPmStrings = dateFormatSymbols.getAmPmStrings();
        int length = this.a.length();
        int[] iArr = new int[1];
        int i2 = 0;
        int i3 = 0;
        while (i3 < length) {
            iArr[i2] = i3;
            String token = parseToken(this.a, iArr);
            int i4 = iArr[i2];
            int length2 = token.length();
            if (length2 == 0) {
                return arrayList;
            }
            char cCharAt = token.charAt(i2);
            if (cCharAt != 'y') {
                if (cCharAt != 'z') {
                    switch (cCharAt) {
                        case '\'':
                            String strSubstring = token.substring(1);
                            iVar = strSubstring.length() != 1 ? new f(strSubstring) : new a(strSubstring.charAt(0));
                            break;
                        case 'K':
                            iVar = selectNumberRule(10, length2);
                            break;
                        case 'M':
                            if (length2 >= 4) {
                                objSelectNumberRule = new g(2, months);
                            } else if (length2 != 3) {
                                iVar = length2 != 2 ? p.a : m.a;
                            } else {
                                objSelectNumberRule = new g(2, shortMonths);
                            }
                            break;
                        case 'S':
                            iVar = selectNumberRule(14, length2);
                            break;
                        case 'W':
                            iVar = selectNumberRule(4, length2);
                            break;
                        case 'Z':
                            iVar = length2 != 1 ? j.b : j.c;
                            break;
                        case 'a':
                            iVar = new g(9, amPmStrings);
                            break;
                        case 'd':
                            iVar = selectNumberRule(5, length2);
                            break;
                        case 'h':
                            iVar = new k(selectNumberRule(10, length2));
                            break;
                        case 'k':
                            objSelectNumberRule = new l(selectNumberRule(11, length2));
                            break;
                        case 'm':
                            iVar = selectNumberRule(12, length2);
                            break;
                        case 's':
                            iVar = selectNumberRule(13, length2);
                            break;
                        case 'w':
                            iVar = selectNumberRule(3, length2);
                            break;
                        default:
                            switch (cCharAt) {
                                case 'D':
                                    iVar = selectNumberRule(6, length2);
                                    break;
                                case 'E':
                                    iVar = new g(7, length2 < 4 ? shortWeekdays : weekdays);
                                    break;
                                case 'F':
                                    iVar = selectNumberRule(8, length2);
                                    break;
                                case 'G':
                                    iVar = new g(0, eras);
                                    break;
                                case 'H':
                                    iVar = selectNumberRule(11, length2);
                                    break;
                                default:
                                    StringBuffer stringBuffer = new StringBuffer();
                                    stringBuffer.append("Illegal pattern component: ");
                                    stringBuffer.append(token);
                                    throw new IllegalArgumentException(stringBuffer.toString());
                            }
                            break;
                    }
                } else if (length2 >= 4) {
                    iVar = new i(this.b, this.c, this.d, 1);
                } else {
                    objSelectNumberRule = new i(this.b, this.c, this.d, 0);
                }
                objSelectNumberRule = iVar;
            } else {
                objSelectNumberRule = length2 >= 4 ? selectNumberRule(1, length2) : o.a;
            }
            arrayList.add(objSelectNumberRule);
            i3 = i4 + 1;
            i2 = 0;
        }
        return arrayList;
    }

    public String parseToken(String str, int[] iArr) {
        StrBuilder strBuilder = new StrBuilder();
        int i2 = iArr[0];
        int length = str.length();
        char cCharAt = str.charAt(i2);
        if ((cCharAt < 'A' || cCharAt > 'Z') && (cCharAt < 'a' || cCharAt > 'z')) {
            strBuilder.append('\'');
            boolean z = false;
            while (i2 < length) {
                char cCharAt2 = str.charAt(i2);
                if (cCharAt2 != '\'') {
                    if (!z && ((cCharAt2 >= 'A' && cCharAt2 <= 'Z') || (cCharAt2 >= 'a' && cCharAt2 <= 'z'))) {
                        i2--;
                        break;
                    }
                    strBuilder.append(cCharAt2);
                } else {
                    int i3 = i2 + 1;
                    if (i3 >= length || str.charAt(i3) != '\'') {
                        z = !z;
                    } else {
                        strBuilder.append(cCharAt2);
                        i2 = i3;
                    }
                }
                i2++;
            }
        } else {
            strBuilder.append(cCharAt);
            while (true) {
                int i4 = i2 + 1;
                if (i4 >= length || str.charAt(i4) != cCharAt) {
                    break;
                }
                strBuilder.append(cCharAt);
                i2 = i4;
            }
        }
        iArr[0] = i2;
        return strBuilder.toString();
    }

    public b selectNumberRule(int i2, int i3) {
        if (i3 != 1) {
            return i3 != 2 ? new c(i2, i3) : new n(i2);
        }
        return new q(i2);
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("FastDateFormat[");
        stringBuffer.append(this.a);
        stringBuffer.append("]");
        return stringBuffer.toString();
    }

    public static FastDateFormat getDateInstance(int i2, Locale locale) {
        return getDateInstance(i2, null, locale);
    }

    public static FastDateFormat getDateTimeInstance(int i2, int i3, Locale locale) {
        return getDateTimeInstance(i2, i3, null, locale);
    }

    public static FastDateFormat getInstance(String str) {
        return getInstance(str, null, null);
    }

    public static FastDateFormat getTimeInstance(int i2, Locale locale) {
        return getTimeInstance(i2, null, locale);
    }

    public static FastDateFormat getDateInstance(int i2, TimeZone timeZone) {
        return getDateInstance(i2, timeZone, null);
    }

    public static FastDateFormat getDateTimeInstance(int i2, int i3, TimeZone timeZone) {
        return getDateTimeInstance(i2, i3, timeZone, null);
    }

    public static FastDateFormat getInstance(String str, TimeZone timeZone) {
        return getInstance(str, timeZone, null);
    }

    public static FastDateFormat getTimeInstance(int i2, TimeZone timeZone) {
        return getTimeInstance(i2, timeZone, null);
    }

    public static synchronized FastDateFormat getDateInstance(int i2, TimeZone timeZone, Locale locale) {
        FastDateFormat fastDateFormat;
        Object num = new Integer(i2);
        if (timeZone != null) {
            num = new d(num, timeZone);
        }
        if (locale == null) {
            locale = Locale.getDefault();
        }
        d dVar = new d(num, locale);
        Map map = j;
        fastDateFormat = (FastDateFormat) map.get(dVar);
        if (fastDateFormat == null) {
            try {
                fastDateFormat = getInstance(((SimpleDateFormat) DateFormat.getDateInstance(i2, locale)).toPattern(), timeZone, locale);
                map.put(dVar, fastDateFormat);
            } catch (ClassCastException unused) {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("No date pattern for locale: ");
                stringBuffer.append(locale);
                throw new IllegalArgumentException(stringBuffer.toString());
            }
        }
        return fastDateFormat;
    }

    public static synchronized FastDateFormat getDateTimeInstance(int i2, int i3, TimeZone timeZone, Locale locale) {
        FastDateFormat fastDateFormat;
        d dVar = new d(new Integer(i2), new Integer(i3));
        if (timeZone != null) {
            dVar = new d(dVar, timeZone);
        }
        if (locale == null) {
            locale = Locale.getDefault();
        }
        d dVar2 = new d(dVar, locale);
        Map map = l;
        fastDateFormat = (FastDateFormat) map.get(dVar2);
        if (fastDateFormat == null) {
            try {
                fastDateFormat = getInstance(((SimpleDateFormat) DateFormat.getDateTimeInstance(i2, i3, locale)).toPattern(), timeZone, locale);
                map.put(dVar2, fastDateFormat);
            } catch (ClassCastException unused) {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("No date time pattern for locale: ");
                stringBuffer.append(locale);
                throw new IllegalArgumentException(stringBuffer.toString());
            }
        }
        return fastDateFormat;
    }

    public static FastDateFormat getInstance(String str, Locale locale) {
        return getInstance(str, null, locale);
    }

    public static synchronized FastDateFormat getTimeInstance(int i2, TimeZone timeZone, Locale locale) {
        FastDateFormat fastDateFormat;
        Object num = new Integer(i2);
        if (timeZone != null) {
            num = new d(num, timeZone);
        }
        if (locale != null) {
            num = new d(num, locale);
        }
        Map map = k;
        fastDateFormat = (FastDateFormat) map.get(num);
        if (fastDateFormat == null) {
            if (locale == null) {
                locale = Locale.getDefault();
            }
            try {
                fastDateFormat = getInstance(((SimpleDateFormat) DateFormat.getTimeInstance(i2, locale)).toPattern(), timeZone, locale);
                map.put(num, fastDateFormat);
            } catch (ClassCastException unused) {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("No date pattern for locale: ");
                stringBuffer.append(locale);
                throw new IllegalArgumentException(stringBuffer.toString());
            }
        }
        return fastDateFormat;
    }

    public static synchronized FastDateFormat getInstance(String str, TimeZone timeZone, Locale locale) {
        FastDateFormat fastDateFormat;
        fastDateFormat = new FastDateFormat(str, timeZone, locale);
        Map map = i;
        FastDateFormat fastDateFormat2 = (FastDateFormat) map.get(fastDateFormat);
        if (fastDateFormat2 == null) {
            fastDateFormat.init();
            map.put(fastDateFormat, fastDateFormat);
        } else {
            fastDateFormat = fastDateFormat2;
        }
        return fastDateFormat;
    }

    public String format(long j2) {
        return format(new Date(j2));
    }

    public String format(Date date) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar(this.b, this.d);
        gregorianCalendar.setTime(date);
        return applyRules(gregorianCalendar, new StringBuffer(this.g)).toString();
    }

    public String format(Calendar calendar) {
        return format(calendar, new StringBuffer(this.g)).toString();
    }

    public StringBuffer format(long j2, StringBuffer stringBuffer) {
        return format(new Date(j2), stringBuffer);
    }

    public StringBuffer format(Date date, StringBuffer stringBuffer) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar(this.b);
        gregorianCalendar.setTime(date);
        return applyRules(gregorianCalendar, stringBuffer);
    }

    public StringBuffer format(Calendar calendar, StringBuffer stringBuffer) {
        if (this.c) {
            calendar.getTime();
            calendar = (Calendar) calendar.clone();
            calendar.setTimeZone(this.b);
        }
        return applyRules(calendar, stringBuffer);
    }
}
