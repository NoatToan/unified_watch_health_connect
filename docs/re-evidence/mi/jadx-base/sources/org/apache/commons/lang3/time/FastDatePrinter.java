package org.apache.commons.lang3.time;

import defpackage.zmq;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.text.DateFormatSymbols;
import java.text.FieldPosition;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes3.dex */
public class FastDatePrinter implements Serializable {
    public static final int FULL = 0;
    public static final int LONG = 1;
    public static final int MEDIUM = 2;
    public static final int SHORT = 3;
    private static final ConcurrentMap<g, String> cTimeZoneDisplayCache = new ConcurrentHashMap(7);
    private static final long serialVersionUID = 1;
    private final Locale mLocale;
    private transient int mMaxLengthEstimate;
    private final String mPattern;
    private transient d[] mRules;
    private final TimeZone mTimeZone;

    public static class a implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final char f29477a;

        public a(char c) {
            this.f29477a = c;
        }

        @Override // org.apache.commons.lang3.time.FastDatePrinter.d
        public int a() {
            return 1;
        }

        @Override // org.apache.commons.lang3.time.FastDatePrinter.d
        public void c(StringBuffer stringBuffer, Calendar calendar) {
            stringBuffer.append(this.f29477a);
        }
    }

    public interface b extends d {
        void b(StringBuffer stringBuffer, int i);
    }

    public static class c implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f29478a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f29479b;

        public c(int i, int i2) {
            if (i2 < 3) {
                throw new IllegalArgumentException();
            }
            this.f29478a = i;
            this.f29479b = i2;
        }

        @Override // org.apache.commons.lang3.time.FastDatePrinter.d
        public int a() {
            return 4;
        }

        @Override // org.apache.commons.lang3.time.FastDatePrinter.b
        public final void b(StringBuffer stringBuffer, int i) {
            int length;
            if (i < 100) {
                int i2 = this.f29479b;
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
                    zmq.b(i > -1, "Negative values should not be possible", i);
                    length = Integer.toString(i).length();
                }
                int i3 = this.f29479b;
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

        @Override // org.apache.commons.lang3.time.FastDatePrinter.d
        public void c(StringBuffer stringBuffer, Calendar calendar) {
            b(stringBuffer, calendar.get(this.f29478a));
        }
    }

    public interface d {
        int a();

        void c(StringBuffer stringBuffer, Calendar calendar);
    }

    public static class e implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f29480a;

        public e(String str) {
            this.f29480a = str;
        }

        @Override // org.apache.commons.lang3.time.FastDatePrinter.d
        public int a() {
            return this.f29480a.length();
        }

        @Override // org.apache.commons.lang3.time.FastDatePrinter.d
        public void c(StringBuffer stringBuffer, Calendar calendar) {
            stringBuffer.append(this.f29480a);
        }
    }

    public static class f implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f29481a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String[] f29482b;

        public f(int i, String[] strArr) {
            this.f29481a = i;
            this.f29482b = strArr;
        }

        @Override // org.apache.commons.lang3.time.FastDatePrinter.d
        public int a() {
            int length = this.f29482b.length;
            int i = 0;
            while (true) {
                length--;
                if (length < 0) {
                    return i;
                }
                int length2 = this.f29482b[length].length();
                if (length2 > i) {
                    i = length2;
                }
            }
        }

        @Override // org.apache.commons.lang3.time.FastDatePrinter.d
        public void c(StringBuffer stringBuffer, Calendar calendar) {
            stringBuffer.append(this.f29482b[calendar.get(this.f29481a)]);
        }
    }

    public static class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TimeZone f29483a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f29484b;
        public final Locale c;

        public g(TimeZone timeZone, boolean z, int i, Locale locale) {
            this.f29483a = timeZone;
            if (z) {
                this.f29484b = Integer.MIN_VALUE | i;
            } else {
                this.f29484b = i;
            }
            this.c = locale;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return this.f29483a.equals(gVar.f29483a) && this.f29484b == gVar.f29484b && this.c.equals(gVar.c);
        }

        public int hashCode() {
            return (((this.f29484b * 31) + this.c.hashCode()) * 31) + this.f29483a.hashCode();
        }
    }

    public static class h implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Locale f29485a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f29486b;
        public final String c;
        public final String d;

        public h(TimeZone timeZone, Locale locale, int i) {
            this.f29485a = locale;
            this.f29486b = i;
            this.c = FastDatePrinter.getTimeZoneDisplay(timeZone, false, i, locale);
            this.d = FastDatePrinter.getTimeZoneDisplay(timeZone, true, i, locale);
        }

        @Override // org.apache.commons.lang3.time.FastDatePrinter.d
        public int a() {
            return Math.max(this.c.length(), this.d.length());
        }

        @Override // org.apache.commons.lang3.time.FastDatePrinter.d
        public void c(StringBuffer stringBuffer, Calendar calendar) {
            TimeZone timeZone = calendar.getTimeZone();
            if (!timeZone.useDaylightTime() || calendar.get(16) == 0) {
                stringBuffer.append(FastDatePrinter.getTimeZoneDisplay(timeZone, false, this.f29486b, this.f29485a));
            } else {
                stringBuffer.append(FastDatePrinter.getTimeZoneDisplay(timeZone, true, this.f29486b, this.f29485a));
            }
        }
    }

    public static class i implements d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final i f29487b = new i(true);
        public static final i c = new i(false);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f29488a;

        public i(boolean z) {
            this.f29488a = z;
        }

        @Override // org.apache.commons.lang3.time.FastDatePrinter.d
        public int a() {
            return 5;
        }

        @Override // org.apache.commons.lang3.time.FastDatePrinter.d
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
            if (this.f29488a) {
                stringBuffer.append(AbstractJsonLexerKt.COLON);
            }
            int i3 = (i / 60000) - (i2 * 60);
            stringBuffer.append((char) ((i3 / 10) + 48));
            stringBuffer.append((char) ((i3 % 10) + 48));
        }
    }

    public static class j implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f29489a;

        public j(b bVar) {
            this.f29489a = bVar;
        }

        @Override // org.apache.commons.lang3.time.FastDatePrinter.d
        public int a() {
            return this.f29489a.a();
        }

        @Override // org.apache.commons.lang3.time.FastDatePrinter.b
        public void b(StringBuffer stringBuffer, int i) {
            this.f29489a.b(stringBuffer, i);
        }

        @Override // org.apache.commons.lang3.time.FastDatePrinter.d
        public void c(StringBuffer stringBuffer, Calendar calendar) {
            int leastMaximum = calendar.get(10);
            if (leastMaximum == 0) {
                leastMaximum = calendar.getLeastMaximum(10) + 1;
            }
            this.f29489a.b(stringBuffer, leastMaximum);
        }
    }

    public static class k implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f29490a;

        public k(b bVar) {
            this.f29490a = bVar;
        }

        @Override // org.apache.commons.lang3.time.FastDatePrinter.d
        public int a() {
            return this.f29490a.a();
        }

        @Override // org.apache.commons.lang3.time.FastDatePrinter.b
        public void b(StringBuffer stringBuffer, int i) {
            this.f29490a.b(stringBuffer, i);
        }

        @Override // org.apache.commons.lang3.time.FastDatePrinter.d
        public void c(StringBuffer stringBuffer, Calendar calendar) {
            int maximum = calendar.get(11);
            if (maximum == 0) {
                maximum = calendar.getMaximum(11) + 1;
            }
            this.f29490a.b(stringBuffer, maximum);
        }
    }

    public static class l implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final l f29491a = new l();

        @Override // org.apache.commons.lang3.time.FastDatePrinter.d
        public int a() {
            return 2;
        }

        @Override // org.apache.commons.lang3.time.FastDatePrinter.b
        public final void b(StringBuffer stringBuffer, int i) {
            stringBuffer.append((char) ((i / 10) + 48));
            stringBuffer.append((char) ((i % 10) + 48));
        }

        @Override // org.apache.commons.lang3.time.FastDatePrinter.d
        public void c(StringBuffer stringBuffer, Calendar calendar) {
            b(stringBuffer, calendar.get(2) + 1);
        }
    }

    public static class m implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f29492a;

        public m(int i) {
            this.f29492a = i;
        }

        @Override // org.apache.commons.lang3.time.FastDatePrinter.d
        public int a() {
            return 2;
        }

        @Override // org.apache.commons.lang3.time.FastDatePrinter.b
        public final void b(StringBuffer stringBuffer, int i) {
            if (i >= 100) {
                stringBuffer.append(Integer.toString(i));
            } else {
                stringBuffer.append((char) ((i / 10) + 48));
                stringBuffer.append((char) ((i % 10) + 48));
            }
        }

        @Override // org.apache.commons.lang3.time.FastDatePrinter.d
        public void c(StringBuffer stringBuffer, Calendar calendar) {
            b(stringBuffer, calendar.get(this.f29492a));
        }
    }

    public static class n implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final n f29493a = new n();

        @Override // org.apache.commons.lang3.time.FastDatePrinter.d
        public int a() {
            return 2;
        }

        @Override // org.apache.commons.lang3.time.FastDatePrinter.b
        public final void b(StringBuffer stringBuffer, int i) {
            stringBuffer.append((char) ((i / 10) + 48));
            stringBuffer.append((char) ((i % 10) + 48));
        }

        @Override // org.apache.commons.lang3.time.FastDatePrinter.d
        public void c(StringBuffer stringBuffer, Calendar calendar) {
            b(stringBuffer, calendar.get(1) % 100);
        }
    }

    public static class o implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final o f29494a = new o();

        @Override // org.apache.commons.lang3.time.FastDatePrinter.d
        public int a() {
            return 2;
        }

        @Override // org.apache.commons.lang3.time.FastDatePrinter.b
        public final void b(StringBuffer stringBuffer, int i) {
            if (i < 10) {
                stringBuffer.append((char) (i + 48));
            } else {
                stringBuffer.append((char) ((i / 10) + 48));
                stringBuffer.append((char) ((i % 10) + 48));
            }
        }

        @Override // org.apache.commons.lang3.time.FastDatePrinter.d
        public void c(StringBuffer stringBuffer, Calendar calendar) {
            b(stringBuffer, calendar.get(2) + 1);
        }
    }

    public static class p implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f29495a;

        public p(int i) {
            this.f29495a = i;
        }

        @Override // org.apache.commons.lang3.time.FastDatePrinter.d
        public int a() {
            return 4;
        }

        @Override // org.apache.commons.lang3.time.FastDatePrinter.b
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

        @Override // org.apache.commons.lang3.time.FastDatePrinter.d
        public void c(StringBuffer stringBuffer, Calendar calendar) {
            b(stringBuffer, calendar.get(this.f29495a));
        }
    }

    public FastDatePrinter(String str, TimeZone timeZone, Locale locale) {
        this.mPattern = str;
        this.mTimeZone = timeZone;
        this.mLocale = locale;
        init();
    }

    private String applyRulesToString(Calendar calendar) {
        return applyRules(calendar, new StringBuffer(this.mMaxLengthEstimate)).toString();
    }

    public static String getTimeZoneDisplay(TimeZone timeZone, boolean z, int i2, Locale locale) {
        g gVar = new g(timeZone, z, i2, locale);
        ConcurrentMap<g, String> concurrentMap = cTimeZoneDisplayCache;
        String str = concurrentMap.get(gVar);
        if (str != null) {
            return str;
        }
        String displayName = timeZone.getDisplayName(z, i2, locale);
        String strPutIfAbsent = concurrentMap.putIfAbsent(gVar, displayName);
        return strPutIfAbsent != null ? strPutIfAbsent : displayName;
    }

    private void init() {
        List<d> pattern = parsePattern();
        d[] dVarArr = (d[]) pattern.toArray(new d[pattern.size()]);
        this.mRules = dVarArr;
        int length = dVarArr.length;
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

    private GregorianCalendar newCalendar() {
        return new GregorianCalendar(this.mTimeZone, this.mLocale);
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        init();
    }

    public StringBuffer applyRules(Calendar calendar, StringBuffer stringBuffer) {
        for (d dVar : this.mRules) {
            dVar.c(stringBuffer, calendar);
        }
        return stringBuffer;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof FastDatePrinter)) {
            return false;
        }
        FastDatePrinter fastDatePrinter = (FastDatePrinter) obj;
        return this.mPattern.equals(fastDatePrinter.mPattern) && this.mTimeZone.equals(fastDatePrinter.mTimeZone) && this.mLocale.equals(fastDatePrinter.mLocale);
    }

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
        StringBuilder sb = new StringBuilder();
        sb.append("Unknown class: ");
        sb.append(obj == null ? "<null>" : obj.getClass().getName());
        throw new IllegalArgumentException(sb.toString());
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

    public int hashCode() {
        return this.mPattern.hashCode() + ((this.mTimeZone.hashCode() + (this.mLocale.hashCode() * 13)) * 13);
    }

    public List<d> parsePattern() {
        int i2;
        d dVarSelectNumberRule;
        d hVar;
        d aVar;
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
                if (length2 == 2) {
                    hVar = n.f29493a;
                    dVarSelectNumberRule = hVar;
                } else {
                    if (length2 < 4) {
                        length2 = 4;
                    }
                    dVarSelectNumberRule = selectNumberRule(1, length2);
                }
            } else if (cCharAt != 'z') {
                switch (cCharAt) {
                    case '\'':
                        String strSubstring = token.substring(1);
                        aVar = strSubstring.length() == 1 ? new a(strSubstring.charAt(0)) : new e(strSubstring);
                        dVarSelectNumberRule = aVar;
                        i2 = 0;
                        break;
                    case 'K':
                        aVar = selectNumberRule(10, length2);
                        dVarSelectNumberRule = aVar;
                        i2 = 0;
                        break;
                    case 'M':
                        if (length2 >= 4) {
                            aVar = new f(2, months);
                        } else if (length2 == 3) {
                            aVar = new f(2, shortMonths);
                        } else {
                            aVar = length2 == 2 ? l.f29491a : o.f29494a;
                        }
                        dVarSelectNumberRule = aVar;
                        i2 = 0;
                        break;
                    case 'S':
                        aVar = selectNumberRule(14, length2);
                        dVarSelectNumberRule = aVar;
                        i2 = 0;
                        break;
                    case 'W':
                        aVar = selectNumberRule(4, length2);
                        dVarSelectNumberRule = aVar;
                        i2 = 0;
                        break;
                    case 'Z':
                        aVar = length2 == 1 ? i.c : i.f29487b;
                        dVarSelectNumberRule = aVar;
                        i2 = 0;
                        break;
                    case 'a':
                        aVar = new f(9, amPmStrings);
                        dVarSelectNumberRule = aVar;
                        i2 = 0;
                        break;
                    case 'd':
                        aVar = selectNumberRule(5, length2);
                        dVarSelectNumberRule = aVar;
                        i2 = 0;
                        break;
                    case 'h':
                        aVar = new j(selectNumberRule(10, length2));
                        dVarSelectNumberRule = aVar;
                        i2 = 0;
                        break;
                    case 'k':
                        dVarSelectNumberRule = new k(selectNumberRule(11, length2));
                        i2 = 0;
                        break;
                    case 'm':
                        aVar = selectNumberRule(12, length2);
                        dVarSelectNumberRule = aVar;
                        i2 = 0;
                        break;
                    case 's':
                        aVar = selectNumberRule(13, length2);
                        dVarSelectNumberRule = aVar;
                        i2 = 0;
                        break;
                    case 'w':
                        aVar = selectNumberRule(3, length2);
                        dVarSelectNumberRule = aVar;
                        i2 = 0;
                        break;
                    default:
                        switch (cCharAt) {
                            case 'D':
                                aVar = selectNumberRule(6, length2);
                                dVarSelectNumberRule = aVar;
                                i2 = 0;
                                break;
                            case 'E':
                                aVar = new f(7, length2 < 4 ? shortWeekdays : weekdays);
                                dVarSelectNumberRule = aVar;
                                i2 = 0;
                                break;
                            case 'F':
                                aVar = selectNumberRule(8, length2);
                                dVarSelectNumberRule = aVar;
                                i2 = 0;
                                break;
                            case 'G':
                                hVar = new f(0, eras);
                                i2 = 0;
                                dVarSelectNumberRule = hVar;
                                break;
                            case 'H':
                                aVar = selectNumberRule(11, length2);
                                dVarSelectNumberRule = aVar;
                                i2 = 0;
                                break;
                            default:
                                throw new IllegalArgumentException("Illegal pattern component: " + token);
                        }
                        break;
                }
            } else if (length2 >= 4) {
                dVarSelectNumberRule = new h(this.mTimeZone, this.mLocale, 1);
                i2 = 0;
            } else {
                i2 = 0;
                hVar = new h(this.mTimeZone, this.mLocale, 0);
                dVarSelectNumberRule = hVar;
            }
            arrayList.add(dVarSelectNumberRule);
            i4 = i5 + 1;
            i3 = i2;
        }
        return arrayList;
    }

    public String parseToken(String str, int[] iArr) {
        StringBuilder sb = new StringBuilder();
        int i2 = iArr[0];
        int length = str.length();
        char cCharAt = str.charAt(i2);
        if ((cCharAt < 'A' || cCharAt > 'Z') && (cCharAt < 'a' || cCharAt > 'z')) {
            sb.append('\'');
            boolean z = false;
            while (i2 < length) {
                char cCharAt2 = str.charAt(i2);
                if (cCharAt2 != '\'') {
                    if (!z && ((cCharAt2 >= 'A' && cCharAt2 <= 'Z') || (cCharAt2 >= 'a' && cCharAt2 <= 'z'))) {
                        i2--;
                        break;
                    }
                    sb.append(cCharAt2);
                } else {
                    int i3 = i2 + 1;
                    if (i3 >= length || str.charAt(i3) != '\'') {
                        z = !z;
                    } else {
                        sb.append(cCharAt2);
                        i2 = i3;
                    }
                }
                i2++;
            }
        } else {
            sb.append(cCharAt);
            while (true) {
                int i4 = i2 + 1;
                if (i4 >= length || str.charAt(i4) != cCharAt) {
                    break;
                }
                sb.append(cCharAt);
                i2 = i4;
            }
        }
        iArr[0] = i2;
        return sb.toString();
    }

    public b selectNumberRule(int i2, int i3) {
        if (i3 != 1) {
            return i3 != 2 ? new c(i2, i3) : new m(i2);
        }
        return new p(i2);
    }

    public String toString() {
        return "FastDatePrinter[" + this.mPattern + "," + this.mLocale + "," + this.mTimeZone.getID() + "]";
    }

    public String format(long j2) {
        GregorianCalendar gregorianCalendarNewCalendar = newCalendar();
        gregorianCalendarNewCalendar.setTimeInMillis(j2);
        return applyRulesToString(gregorianCalendarNewCalendar);
    }

    public String format(Date date) {
        GregorianCalendar gregorianCalendarNewCalendar = newCalendar();
        gregorianCalendarNewCalendar.setTime(date);
        return applyRulesToString(gregorianCalendarNewCalendar);
    }

    public String format(Calendar calendar) {
        return format(calendar, new StringBuffer(this.mMaxLengthEstimate)).toString();
    }

    public StringBuffer format(long j2, StringBuffer stringBuffer) {
        return format(new Date(j2), stringBuffer);
    }

    public StringBuffer format(Date date, StringBuffer stringBuffer) {
        GregorianCalendar gregorianCalendarNewCalendar = newCalendar();
        gregorianCalendarNewCalendar.setTime(date);
        return applyRules(gregorianCalendarNewCalendar, stringBuffer);
    }

    public StringBuffer format(Calendar calendar, StringBuffer stringBuffer) {
        return applyRules(calendar, stringBuffer);
    }
}
