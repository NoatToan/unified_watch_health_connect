package org.apache.commons.lang.time;

import defpackage.anq;
import defpackage.eio;
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
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes3.dex */
public class FastDateFormat extends Format {
    public static final int FULL = 0;
    public static final int LONG = 1;
    public static final int MEDIUM = 2;
    public static final int SHORT = 3;
    private static String cDefaultPattern = null;
    private static final long serialVersionUID = 1;
    private final Locale mLocale;
    private final boolean mLocaleForced;
    private transient int mMaxLengthEstimate;
    private final String mPattern;
    private transient e[] mRules;
    private final TimeZone mTimeZone;
    private final boolean mTimeZoneForced;
    private static final Map cInstanceCache = new HashMap(7);
    private static final Map cDateInstanceCache = new HashMap(7);
    private static final Map cTimeInstanceCache = new HashMap(7);
    private static final Map cDateTimeInstanceCache = new HashMap(7);
    private static final Map cTimeZoneDisplayCache = new HashMap(7);

    public static class a implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final char f29441a;

        public a(char c) {
            this.f29441a = c;
        }

        @Override // org.apache.commons.lang.time.FastDateFormat.e
        public int a() {
            return 1;
        }

        @Override // org.apache.commons.lang.time.FastDateFormat.e
        public void c(StringBuffer stringBuffer, Calendar calendar) {
            stringBuffer.append(this.f29441a);
        }
    }

    public interface b extends e {
        void b(StringBuffer stringBuffer, int i);
    }

    public static class c implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f29442a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f29443b;

        public c(int i, int i2) {
            if (i2 < 3) {
                throw new IllegalArgumentException();
            }
            this.f29442a = i;
            this.f29443b = i2;
        }

        @Override // org.apache.commons.lang.time.FastDateFormat.e
        public int a() {
            return 4;
        }

        @Override // org.apache.commons.lang.time.FastDateFormat.b
        public final void b(StringBuffer stringBuffer, int i) {
            int length;
            if (i < 100) {
                int i2 = this.f29443b;
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
                    anq.b(i > -1, "Negative values should not be possible", i);
                    length = Integer.toString(i).length();
                }
                int i3 = this.f29443b;
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
            b(stringBuffer, calendar.get(this.f29442a));
        }
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f29444a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Object f29445b;

        public d(Object obj, Object obj2) {
            this.f29444a = obj;
            this.f29445b = obj2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            Object obj2 = this.f29444a;
            if (obj2 != null ? obj2.equals(dVar.f29444a) : dVar.f29444a == null) {
                Object obj3 = this.f29445b;
                Object obj4 = dVar.f29445b;
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
            Object obj = this.f29444a;
            int iHashCode = obj == null ? 0 : obj.hashCode();
            Object obj2 = this.f29445b;
            return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
        }

        public String toString() {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("[");
            stringBuffer.append(this.f29444a);
            stringBuffer.append(AbstractJsonLexerKt.COLON);
            stringBuffer.append(this.f29445b);
            stringBuffer.append(AbstractJsonLexerKt.END_LIST);
            return stringBuffer.toString();
        }
    }

    public interface e {
        int a();

        void c(StringBuffer stringBuffer, Calendar calendar);
    }

    public static class f implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f29446a;

        public f(String str) {
            this.f29446a = str;
        }

        @Override // org.apache.commons.lang.time.FastDateFormat.e
        public int a() {
            return this.f29446a.length();
        }

        @Override // org.apache.commons.lang.time.FastDateFormat.e
        public void c(StringBuffer stringBuffer, Calendar calendar) {
            stringBuffer.append(this.f29446a);
        }
    }

    public static class g implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f29447a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String[] f29448b;

        public g(int i, String[] strArr) {
            this.f29447a = i;
            this.f29448b = strArr;
        }

        @Override // org.apache.commons.lang.time.FastDateFormat.e
        public int a() {
            int length = this.f29448b.length;
            int i = 0;
            while (true) {
                length--;
                if (length < 0) {
                    return i;
                }
                int length2 = this.f29448b[length].length();
                if (length2 > i) {
                    i = length2;
                }
            }
        }

        @Override // org.apache.commons.lang.time.FastDateFormat.e
        public void c(StringBuffer stringBuffer, Calendar calendar) {
            stringBuffer.append(this.f29448b[calendar.get(this.f29447a)]);
        }
    }

    public static class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TimeZone f29449a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f29450b;
        public final Locale c;

        public h(TimeZone timeZone, boolean z, int i, Locale locale) {
            this.f29449a = timeZone;
            this.f29450b = z ? i | Integer.MIN_VALUE : i;
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
            return this.f29449a.equals(hVar.f29449a) && this.f29450b == hVar.f29450b && this.c.equals(hVar.c);
        }

        public int hashCode() {
            return (this.f29450b * 31) + this.c.hashCode();
        }
    }

    public static class i implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TimeZone f29451a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f29452b;
        public final Locale c;
        public final int d;
        public final String e;
        public final String f;

        public i(TimeZone timeZone, boolean z, Locale locale, int i) {
            this.f29451a = timeZone;
            this.f29452b = z;
            this.c = locale;
            this.d = i;
            if (z) {
                this.e = FastDateFormat.getTimeZoneDisplay(timeZone, false, i, locale);
                this.f = FastDateFormat.getTimeZoneDisplay(timeZone, true, i, locale);
            } else {
                this.e = null;
                this.f = null;
            }
        }

        @Override // org.apache.commons.lang.time.FastDateFormat.e
        public int a() {
            if (this.f29452b) {
                return Math.max(this.e.length(), this.f.length());
            }
            return this.d == 0 ? 4 : 40;
        }

        @Override // org.apache.commons.lang.time.FastDateFormat.e
        public void c(StringBuffer stringBuffer, Calendar calendar) {
            if (this.f29452b) {
                if (!this.f29451a.useDaylightTime() || calendar.get(16) == 0) {
                    stringBuffer.append(this.e);
                    return;
                } else {
                    stringBuffer.append(this.f);
                    return;
                }
            }
            TimeZone timeZone = calendar.getTimeZone();
            if (!timeZone.useDaylightTime() || calendar.get(16) == 0) {
                stringBuffer.append(FastDateFormat.getTimeZoneDisplay(timeZone, false, this.d, this.c));
            } else {
                stringBuffer.append(FastDateFormat.getTimeZoneDisplay(timeZone, true, this.d, this.c));
            }
        }
    }

    public static class j implements e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final j f29453b = new j(true);
        public static final j c = new j(false);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f29454a;

        public j(boolean z) {
            this.f29454a = z;
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
            if (this.f29454a) {
                stringBuffer.append(AbstractJsonLexerKt.COLON);
            }
            int i3 = (i / 60000) - (i2 * 60);
            stringBuffer.append((char) ((i3 / 10) + 48));
            stringBuffer.append((char) ((i3 % 10) + 48));
        }
    }

    public static class k implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f29455a;

        public k(b bVar) {
            this.f29455a = bVar;
        }

        @Override // org.apache.commons.lang.time.FastDateFormat.e
        public int a() {
            return this.f29455a.a();
        }

        @Override // org.apache.commons.lang.time.FastDateFormat.b
        public void b(StringBuffer stringBuffer, int i) {
            this.f29455a.b(stringBuffer, i);
        }

        @Override // org.apache.commons.lang.time.FastDateFormat.e
        public void c(StringBuffer stringBuffer, Calendar calendar) {
            int leastMaximum = calendar.get(10);
            if (leastMaximum == 0) {
                leastMaximum = calendar.getLeastMaximum(10) + 1;
            }
            this.f29455a.b(stringBuffer, leastMaximum);
        }
    }

    public static class l implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f29456a;

        public l(b bVar) {
            this.f29456a = bVar;
        }

        @Override // org.apache.commons.lang.time.FastDateFormat.e
        public int a() {
            return this.f29456a.a();
        }

        @Override // org.apache.commons.lang.time.FastDateFormat.b
        public void b(StringBuffer stringBuffer, int i) {
            this.f29456a.b(stringBuffer, i);
        }

        @Override // org.apache.commons.lang.time.FastDateFormat.e
        public void c(StringBuffer stringBuffer, Calendar calendar) {
            int maximum = calendar.get(11);
            if (maximum == 0) {
                maximum = calendar.getMaximum(11) + 1;
            }
            this.f29456a.b(stringBuffer, maximum);
        }
    }

    public static class m implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final m f29457a = new m();

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

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f29458a;

        public n(int i) {
            this.f29458a = i;
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
            b(stringBuffer, calendar.get(this.f29458a));
        }
    }

    public static class o implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final o f29459a = new o();

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

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final p f29460a = new p();

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

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f29461a;

        public q(int i) {
            this.f29461a = i;
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
            b(stringBuffer, calendar.get(this.f29461a));
        }
    }

    public FastDateFormat(String str, TimeZone timeZone, Locale locale) {
        if (str == null) {
            throw new IllegalArgumentException("The pattern must not be null");
        }
        this.mPattern = str;
        this.mTimeZoneForced = timeZone != null;
        this.mTimeZone = timeZone == null ? TimeZone.getDefault() : timeZone;
        this.mLocaleForced = locale != null;
        this.mLocale = locale == null ? Locale.getDefault() : locale;
    }

    public static FastDateFormat getDateInstance(int i2) {
        return getDateInstance(i2, null, null);
    }

    public static FastDateFormat getDateTimeInstance(int i2, int i3) {
        return getDateTimeInstance(i2, i3, null, null);
    }

    private static synchronized String getDefaultPattern() {
        try {
            if (cDefaultPattern == null) {
                cDefaultPattern = new SimpleDateFormat().toPattern();
            }
        } catch (Throwable th) {
            throw th;
        }
        return cDefaultPattern;
    }

    public static FastDateFormat getInstance() {
        return getInstance(getDefaultPattern(), null, null);
    }

    public static FastDateFormat getTimeInstance(int i2) {
        return getTimeInstance(i2, null, null);
    }

    public static synchronized String getTimeZoneDisplay(TimeZone timeZone, boolean z, int i2, Locale locale) {
        String displayName;
        h hVar = new h(timeZone, z, i2, locale);
        Map map = cTimeZoneDisplayCache;
        displayName = (String) map.get(hVar);
        if (displayName == null) {
            displayName = timeZone.getDisplayName(z, i2, locale);
            map.put(hVar, displayName);
        }
        return displayName;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        init();
    }

    public StringBuffer applyRules(Calendar calendar, StringBuffer stringBuffer) {
        for (e eVar : this.mRules) {
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
        String str = this.mPattern;
        String str2 = fastDateFormat.mPattern;
        return (str == str2 || str.equals(str2)) && ((timeZone = this.mTimeZone) == (timeZone2 = fastDateFormat.mTimeZone) || timeZone.equals(timeZone2)) && (((locale = this.mLocale) == (locale2 = fastDateFormat.mLocale) || locale.equals(locale2)) && this.mTimeZoneForced == fastDateFormat.mTimeZoneForced && this.mLocaleForced == fastDateFormat.mLocaleForced);
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
        return this.mLocale;
    }

    public int getMaxLengthEstimate() {
        return this.mMaxLengthEstimate;
    }

    public String getPattern() {
        return this.mPattern;
    }

    public TimeZone getTimeZone() {
        return this.mTimeZone;
    }

    public boolean getTimeZoneOverridesCalendar() {
        return this.mTimeZoneForced;
    }

    public int hashCode() {
        return this.mPattern.hashCode() + this.mTimeZone.hashCode() + (this.mTimeZoneForced ? 1 : 0) + this.mLocale.hashCode() + (this.mLocaleForced ? 1 : 0);
    }

    public void init() {
        List pattern = parsePattern();
        e[] eVarArr = (e[]) pattern.toArray(new e[pattern.size()]);
        this.mRules = eVarArr;
        int length = eVarArr.length;
        int iA = 0;
        while (true) {
            length--;
            if (length < 0) {
                this.mMaxLengthEstimate = iA;
                return;
            }
            iA += this.mRules[length].a();
        }
    }

    @Override // java.text.Format
    public Object parseObject(String str, ParsePosition parsePosition) {
        parsePosition.setIndex(0);
        parsePosition.setErrorIndex(0);
        return null;
    }

    public List parsePattern() {
        int i2;
        Object objSelectNumberRule;
        Object iVar;
        Object aVar;
        DateFormatSymbols dateFormatSymbols = new DateFormatSymbols(this.mLocale);
        ArrayList arrayList = new ArrayList();
        String[] eras = dateFormatSymbols.getEras();
        String[] months = dateFormatSymbols.getMonths();
        String[] shortMonths = dateFormatSymbols.getShortMonths();
        String[] weekdays = dateFormatSymbols.getWeekdays();
        String[] shortWeekdays = dateFormatSymbols.getShortWeekdays();
        String[] amPmStrings = dateFormatSymbols.getAmPmStrings();
        int length = this.mPattern.length();
        int[] iArr = new int[1];
        int i3 = 0;
        int i4 = 0;
        while (i4 < length) {
            iArr[i3] = i4;
            String token = parseToken(this.mPattern, iArr);
            int i5 = iArr[i3];
            int length2 = token.length();
            if (length2 == 0) {
                return arrayList;
            }
            char cCharAt = token.charAt(i3);
            if (cCharAt == 'y') {
                i2 = 0;
                objSelectNumberRule = length2 >= 4 ? selectNumberRule(1, length2) : o.f29459a;
            } else if (cCharAt != 'z') {
                switch (cCharAt) {
                    case '\'':
                        String strSubstring = token.substring(1);
                        aVar = strSubstring.length() == 1 ? new a(strSubstring.charAt(0)) : new f(strSubstring);
                        objSelectNumberRule = aVar;
                        i2 = 0;
                        break;
                    case 'K':
                        aVar = selectNumberRule(10, length2);
                        objSelectNumberRule = aVar;
                        i2 = 0;
                        break;
                    case 'M':
                        if (length2 >= 4) {
                            aVar = new g(2, months);
                        } else if (length2 == 3) {
                            aVar = new g(2, shortMonths);
                        } else {
                            aVar = length2 == 2 ? m.f29457a : p.f29460a;
                        }
                        objSelectNumberRule = aVar;
                        i2 = 0;
                        break;
                    case 'S':
                        aVar = selectNumberRule(14, length2);
                        objSelectNumberRule = aVar;
                        i2 = 0;
                        break;
                    case 'W':
                        aVar = selectNumberRule(4, length2);
                        objSelectNumberRule = aVar;
                        i2 = 0;
                        break;
                    case 'Z':
                        aVar = length2 == 1 ? j.c : j.f29453b;
                        objSelectNumberRule = aVar;
                        i2 = 0;
                        break;
                    case 'a':
                        aVar = new g(9, amPmStrings);
                        objSelectNumberRule = aVar;
                        i2 = 0;
                        break;
                    case 'd':
                        aVar = selectNumberRule(5, length2);
                        objSelectNumberRule = aVar;
                        i2 = 0;
                        break;
                    case 'h':
                        aVar = new k(selectNumberRule(10, length2));
                        objSelectNumberRule = aVar;
                        i2 = 0;
                        break;
                    case 'k':
                        objSelectNumberRule = new l(selectNumberRule(11, length2));
                        i2 = 0;
                        break;
                    case 'm':
                        aVar = selectNumberRule(12, length2);
                        objSelectNumberRule = aVar;
                        i2 = 0;
                        break;
                    case 's':
                        aVar = selectNumberRule(13, length2);
                        objSelectNumberRule = aVar;
                        i2 = 0;
                        break;
                    case 'w':
                        aVar = selectNumberRule(3, length2);
                        objSelectNumberRule = aVar;
                        i2 = 0;
                        break;
                    default:
                        switch (cCharAt) {
                            case 'D':
                                aVar = selectNumberRule(6, length2);
                                objSelectNumberRule = aVar;
                                i2 = 0;
                                break;
                            case 'E':
                                aVar = new g(7, length2 < 4 ? shortWeekdays : weekdays);
                                objSelectNumberRule = aVar;
                                i2 = 0;
                                break;
                            case 'F':
                                aVar = selectNumberRule(8, length2);
                                objSelectNumberRule = aVar;
                                i2 = 0;
                                break;
                            case 'G':
                                iVar = new g(0, eras);
                                i2 = 0;
                                objSelectNumberRule = iVar;
                                break;
                            case 'H':
                                aVar = selectNumberRule(11, length2);
                                objSelectNumberRule = aVar;
                                i2 = 0;
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
                objSelectNumberRule = new i(this.mTimeZone, this.mTimeZoneForced, this.mLocale, 1);
                i2 = 0;
            } else {
                i2 = 0;
                iVar = new i(this.mTimeZone, this.mTimeZoneForced, this.mLocale, 0);
                objSelectNumberRule = iVar;
            }
            arrayList.add(objSelectNumberRule);
            i4 = i5 + 1;
            i3 = i2;
        }
        return arrayList;
    }

    public String parseToken(String str, int[] iArr) {
        eio eioVar = new eio();
        int i2 = iArr[0];
        int length = str.length();
        char cCharAt = str.charAt(i2);
        if ((cCharAt < 'A' || cCharAt > 'Z') && (cCharAt < 'a' || cCharAt > 'z')) {
            eioVar.a('\'');
            boolean z = false;
            while (i2 < length) {
                char cCharAt2 = str.charAt(i2);
                if (cCharAt2 != '\'') {
                    if (!z && ((cCharAt2 >= 'A' && cCharAt2 <= 'Z') || (cCharAt2 >= 'a' && cCharAt2 <= 'z'))) {
                        i2--;
                        break;
                    }
                    eioVar.a(cCharAt2);
                } else {
                    int i3 = i2 + 1;
                    if (i3 >= length || str.charAt(i3) != '\'') {
                        z = !z;
                    } else {
                        eioVar.a(cCharAt2);
                        i2 = i3;
                    }
                }
                i2++;
            }
        } else {
            eioVar.a(cCharAt);
            while (true) {
                int i4 = i2 + 1;
                if (i4 >= length || str.charAt(i4) != cCharAt) {
                    break;
                }
                eioVar.a(cCharAt);
                i2 = i4;
            }
        }
        iArr[0] = i2;
        return eioVar.toString();
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
        stringBuffer.append(this.mPattern);
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
        try {
            Object num = new Integer(i2);
            if (timeZone != null) {
                num = new d(num, timeZone);
            }
            if (locale == null) {
                locale = Locale.getDefault();
            }
            d dVar = new d(num, locale);
            Map map = cDateInstanceCache;
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
        } catch (Throwable th) {
            throw th;
        }
        return fastDateFormat;
    }

    public static synchronized FastDateFormat getDateTimeInstance(int i2, int i3, TimeZone timeZone, Locale locale) {
        FastDateFormat fastDateFormat;
        try {
            d dVar = new d(new Integer(i2), new Integer(i3));
            if (timeZone != null) {
                dVar = new d(dVar, timeZone);
            }
            if (locale == null) {
                locale = Locale.getDefault();
            }
            d dVar2 = new d(dVar, locale);
            Map map = cDateTimeInstanceCache;
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
        } catch (Throwable th) {
            throw th;
        }
        return fastDateFormat;
    }

    public static FastDateFormat getInstance(String str, Locale locale) {
        return getInstance(str, null, locale);
    }

    public static synchronized FastDateFormat getTimeInstance(int i2, TimeZone timeZone, Locale locale) {
        FastDateFormat fastDateFormat;
        try {
            Object num = new Integer(i2);
            if (timeZone != null) {
                num = new d(num, timeZone);
            }
            if (locale != null) {
                num = new d(num, locale);
            }
            Map map = cTimeInstanceCache;
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
        } catch (Throwable th) {
            throw th;
        }
        return fastDateFormat;
    }

    public static synchronized FastDateFormat getInstance(String str, TimeZone timeZone, Locale locale) {
        FastDateFormat fastDateFormat;
        fastDateFormat = new FastDateFormat(str, timeZone, locale);
        Map map = cInstanceCache;
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
        GregorianCalendar gregorianCalendar = new GregorianCalendar(this.mTimeZone, this.mLocale);
        gregorianCalendar.setTime(date);
        return applyRules(gregorianCalendar, new StringBuffer(this.mMaxLengthEstimate)).toString();
    }

    public String format(Calendar calendar) {
        return format(calendar, new StringBuffer(this.mMaxLengthEstimate)).toString();
    }

    public StringBuffer format(long j2, StringBuffer stringBuffer) {
        return format(new Date(j2), stringBuffer);
    }

    public StringBuffer format(Date date, StringBuffer stringBuffer) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar(this.mTimeZone);
        gregorianCalendar.setTime(date);
        return applyRules(gregorianCalendar, stringBuffer);
    }

    public StringBuffer format(Calendar calendar, StringBuffer stringBuffer) {
        if (this.mTimeZoneForced) {
            calendar.getTime();
            calendar = (Calendar) calendar.clone();
            calendar.setTimeZone(this.mTimeZone);
        }
        return applyRules(calendar, stringBuffer);
    }
}
