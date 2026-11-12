package cn.hutool.core.date.format;

import cn.hutool.core.date.DateException;
import defpackage.aq5;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.text.DateFormatSymbols;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes.dex */
public class FastDatePrinter extends AbstractDateBasic implements aq5 {
    private static final ConcurrentMap<i, String> C_TIME_ZONE_DISPLAY_CACHE = new ConcurrentHashMap(7);
    private static final int MAX_DIGITS = 10;
    private static final long serialVersionUID = -6305750172255764887L;
    private transient int mMaxLengthEstimate;
    private transient f[] rules;

    public static class a implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final char f5525a;

        public a(char c) {
            this.f5525a = c;
        }

        @Override // cn.hutool.core.date.format.FastDatePrinter.f
        public int a() {
            return 1;
        }

        @Override // cn.hutool.core.date.format.FastDatePrinter.f
        public void c(Appendable appendable, Calendar calendar) throws IOException {
            appendable.append(this.f5525a);
        }
    }

    public static class b implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f5526a;

        public b(d dVar) {
            this.f5526a = dVar;
        }

        @Override // cn.hutool.core.date.format.FastDatePrinter.f
        public int a() {
            return this.f5526a.a();
        }

        @Override // cn.hutool.core.date.format.FastDatePrinter.d
        public void b(Appendable appendable, int i) throws IOException {
            this.f5526a.b(appendable, i);
        }

        @Override // cn.hutool.core.date.format.FastDatePrinter.f
        public void c(Appendable appendable, Calendar calendar) throws IOException {
            int i = calendar.get(7);
            this.f5526a.b(appendable, i != 1 ? i - 1 : 7);
        }
    }

    public static class c implements f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c f5527b = new c(3);
        public static final c c = new c(5);
        public static final c d = new c(6);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f5528a;

        public c(int i) {
            this.f5528a = i;
        }

        public static c d(int i) {
            if (i == 1) {
                return f5527b;
            }
            if (i == 2) {
                return c;
            }
            if (i == 3) {
                return d;
            }
            throw new IllegalArgumentException("invalid number of X");
        }

        @Override // cn.hutool.core.date.format.FastDatePrinter.f
        public int a() {
            return this.f5528a;
        }

        @Override // cn.hutool.core.date.format.FastDatePrinter.f
        public void c(Appendable appendable, Calendar calendar) throws IOException {
            int i = calendar.get(15) + calendar.get(16);
            if (i == 0) {
                appendable.append("Z");
                return;
            }
            if (i < 0) {
                appendable.append('-');
                i = -i;
            } else {
                appendable.append('+');
            }
            int i2 = i / 3600000;
            FastDatePrinter.appendDigits(appendable, i2);
            int i3 = this.f5528a;
            if (i3 < 5) {
                return;
            }
            if (i3 == 6) {
                appendable.append(AbstractJsonLexerKt.COLON);
            }
            FastDatePrinter.appendDigits(appendable, (i / 60000) - (i2 * 60));
        }
    }

    public interface d extends f {
        void b(Appendable appendable, int i) throws IOException;
    }

    public static class e implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f5529a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f5530b;

        public e(int i, int i2) {
            if (i2 < 3) {
                throw new IllegalArgumentException();
            }
            this.f5529a = i;
            this.f5530b = i2;
        }

        @Override // cn.hutool.core.date.format.FastDatePrinter.f
        public int a() {
            return this.f5530b;
        }

        @Override // cn.hutool.core.date.format.FastDatePrinter.d
        public final void b(Appendable appendable, int i) throws IOException {
            FastDatePrinter.appendFullDigits(appendable, i, this.f5530b);
        }

        @Override // cn.hutool.core.date.format.FastDatePrinter.f
        public void c(Appendable appendable, Calendar calendar) throws IOException {
            b(appendable, calendar.get(this.f5529a));
        }
    }

    public interface f {
        int a();

        void c(Appendable appendable, Calendar calendar) throws IOException;
    }

    public static class g implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f5531a;

        public g(String str) {
            this.f5531a = str;
        }

        @Override // cn.hutool.core.date.format.FastDatePrinter.f
        public int a() {
            return this.f5531a.length();
        }

        @Override // cn.hutool.core.date.format.FastDatePrinter.f
        public void c(Appendable appendable, Calendar calendar) throws IOException {
            appendable.append(this.f5531a);
        }
    }

    public static class h implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f5532a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String[] f5533b;

        public h(int i, String[] strArr) {
            this.f5532a = i;
            this.f5533b = strArr;
        }

        @Override // cn.hutool.core.date.format.FastDatePrinter.f
        public int a() {
            int length = this.f5533b.length;
            int i = 0;
            while (true) {
                length--;
                if (length < 0) {
                    return i;
                }
                int length2 = this.f5533b[length].length();
                if (length2 > i) {
                    i = length2;
                }
            }
        }

        @Override // cn.hutool.core.date.format.FastDatePrinter.f
        public void c(Appendable appendable, Calendar calendar) throws IOException {
            appendable.append(this.f5533b[calendar.get(this.f5532a)]);
        }
    }

    public static class i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TimeZone f5534a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f5535b;
        public final Locale c;

        public i(TimeZone timeZone, boolean z, int i, Locale locale) {
            this.f5534a = timeZone;
            if (z) {
                this.f5535b = Integer.MIN_VALUE | i;
            } else {
                this.f5535b = i;
            }
            this.c = locale;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return this.f5534a.equals(iVar.f5534a) && this.f5535b == iVar.f5535b && this.c.equals(iVar.c);
        }

        public int hashCode() {
            return (((this.f5535b * 31) + this.c.hashCode()) * 31) + this.f5534a.hashCode();
        }
    }

    public static class j implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Locale f5536a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f5537b;
        public final String c;
        public final String d;

        public j(TimeZone timeZone, Locale locale, int i) {
            this.f5536a = locale;
            this.f5537b = i;
            this.c = FastDatePrinter.getTimeZoneDisplay(timeZone, false, i, locale);
            this.d = FastDatePrinter.getTimeZoneDisplay(timeZone, true, i, locale);
        }

        @Override // cn.hutool.core.date.format.FastDatePrinter.f
        public int a() {
            return Math.max(this.c.length(), this.d.length());
        }

        @Override // cn.hutool.core.date.format.FastDatePrinter.f
        public void c(Appendable appendable, Calendar calendar) throws IOException {
            TimeZone timeZone = calendar.getTimeZone();
            if (calendar.get(16) != 0) {
                appendable.append(FastDatePrinter.getTimeZoneDisplay(timeZone, true, this.f5537b, this.f5536a));
            } else {
                appendable.append(FastDatePrinter.getTimeZoneDisplay(timeZone, false, this.f5537b, this.f5536a));
            }
        }
    }

    public static class k implements f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final k f5538b = new k(true);
        public static final k c = new k(false);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f5539a;

        public k(boolean z) {
            this.f5539a = z;
        }

        @Override // cn.hutool.core.date.format.FastDatePrinter.f
        public int a() {
            return 5;
        }

        @Override // cn.hutool.core.date.format.FastDatePrinter.f
        public void c(Appendable appendable, Calendar calendar) throws IOException {
            int i = calendar.get(15) + calendar.get(16);
            if (i < 0) {
                appendable.append('-');
                i = -i;
            } else {
                appendable.append('+');
            }
            int i2 = i / 3600000;
            FastDatePrinter.appendDigits(appendable, i2);
            if (this.f5539a) {
                appendable.append(AbstractJsonLexerKt.COLON);
            }
            FastDatePrinter.appendDigits(appendable, (i / 60000) - (i2 * 60));
        }
    }

    public static class l implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f5540a;

        public l(d dVar) {
            this.f5540a = dVar;
        }

        @Override // cn.hutool.core.date.format.FastDatePrinter.f
        public int a() {
            return this.f5540a.a();
        }

        @Override // cn.hutool.core.date.format.FastDatePrinter.d
        public void b(Appendable appendable, int i) throws IOException {
            this.f5540a.b(appendable, i);
        }

        @Override // cn.hutool.core.date.format.FastDatePrinter.f
        public void c(Appendable appendable, Calendar calendar) throws IOException {
            int leastMaximum = calendar.get(10);
            if (leastMaximum == 0) {
                leastMaximum = calendar.getLeastMaximum(10) + 1;
            }
            this.f5540a.b(appendable, leastMaximum);
        }
    }

    public static class m implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f5541a;

        public m(d dVar) {
            this.f5541a = dVar;
        }

        @Override // cn.hutool.core.date.format.FastDatePrinter.f
        public int a() {
            return this.f5541a.a();
        }

        @Override // cn.hutool.core.date.format.FastDatePrinter.d
        public void b(Appendable appendable, int i) throws IOException {
            this.f5541a.b(appendable, i);
        }

        @Override // cn.hutool.core.date.format.FastDatePrinter.f
        public void c(Appendable appendable, Calendar calendar) throws IOException {
            int maximum = calendar.get(11);
            if (maximum == 0) {
                maximum = calendar.getMaximum(11) + 1;
            }
            this.f5541a.b(appendable, maximum);
        }
    }

    public static class n implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final n f5542a = new n();

        @Override // cn.hutool.core.date.format.FastDatePrinter.f
        public int a() {
            return 2;
        }

        @Override // cn.hutool.core.date.format.FastDatePrinter.d
        public final void b(Appendable appendable, int i) throws IOException {
            FastDatePrinter.appendDigits(appendable, i);
        }

        @Override // cn.hutool.core.date.format.FastDatePrinter.f
        public void c(Appendable appendable, Calendar calendar) throws IOException {
            b(appendable, calendar.get(2) + 1);
        }
    }

    public static class o implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f5543a;

        public o(int i) {
            this.f5543a = i;
        }

        @Override // cn.hutool.core.date.format.FastDatePrinter.f
        public int a() {
            return 2;
        }

        @Override // cn.hutool.core.date.format.FastDatePrinter.d
        public final void b(Appendable appendable, int i) throws IOException {
            if (i < 100) {
                FastDatePrinter.appendDigits(appendable, i);
            } else {
                FastDatePrinter.appendFullDigits(appendable, i, 2);
            }
        }

        @Override // cn.hutool.core.date.format.FastDatePrinter.f
        public void c(Appendable appendable, Calendar calendar) throws IOException {
            b(appendable, calendar.get(this.f5543a));
        }
    }

    public static class p implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final p f5544a = new p();

        @Override // cn.hutool.core.date.format.FastDatePrinter.f
        public int a() {
            return 2;
        }

        @Override // cn.hutool.core.date.format.FastDatePrinter.d
        public final void b(Appendable appendable, int i) throws IOException {
            FastDatePrinter.appendDigits(appendable, i);
        }

        @Override // cn.hutool.core.date.format.FastDatePrinter.f
        public void c(Appendable appendable, Calendar calendar) throws IOException {
            b(appendable, calendar.get(1) % 100);
        }
    }

    public static class q implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final q f5545a = new q();

        @Override // cn.hutool.core.date.format.FastDatePrinter.f
        public int a() {
            return 2;
        }

        @Override // cn.hutool.core.date.format.FastDatePrinter.d
        public final void b(Appendable appendable, int i) throws IOException {
            if (i < 10) {
                appendable.append((char) (i + 48));
            } else {
                FastDatePrinter.appendDigits(appendable, i);
            }
        }

        @Override // cn.hutool.core.date.format.FastDatePrinter.f
        public void c(Appendable appendable, Calendar calendar) throws IOException {
            b(appendable, calendar.get(2) + 1);
        }
    }

    public static class r implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f5546a;

        public r(int i) {
            this.f5546a = i;
        }

        @Override // cn.hutool.core.date.format.FastDatePrinter.f
        public int a() {
            return 4;
        }

        @Override // cn.hutool.core.date.format.FastDatePrinter.d
        public final void b(Appendable appendable, int i) throws IOException {
            if (i < 10) {
                appendable.append((char) (i + 48));
            } else if (i < 100) {
                FastDatePrinter.appendDigits(appendable, i);
            } else {
                FastDatePrinter.appendFullDigits(appendable, i, 1);
            }
        }

        @Override // cn.hutool.core.date.format.FastDatePrinter.f
        public void c(Appendable appendable, Calendar calendar) throws IOException {
            b(appendable, calendar.get(this.f5546a));
        }
    }

    public static class s implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f5547a;

        public s(d dVar) {
            this.f5547a = dVar;
        }

        @Override // cn.hutool.core.date.format.FastDatePrinter.f
        public int a() {
            return this.f5547a.a();
        }

        @Override // cn.hutool.core.date.format.FastDatePrinter.d
        public void b(Appendable appendable, int i) throws IOException {
            this.f5547a.b(appendable, i);
        }

        @Override // cn.hutool.core.date.format.FastDatePrinter.f
        public void c(Appendable appendable, Calendar calendar) throws IOException {
            this.f5547a.b(appendable, calendar.getWeekYear());
        }
    }

    public FastDatePrinter(String str, TimeZone timeZone, Locale locale) {
        super(str, timeZone, locale);
        init();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void appendDigits(Appendable appendable, int i2) throws IOException {
        appendable.append((char) ((i2 / 10) + 48));
        appendable.append((char) ((i2 % 10) + 48));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void appendFullDigits(Appendable appendable, int i2, int i3) throws IOException {
        int i4;
        if (i2 < 10000) {
            if (i2 >= 1000) {
                i4 = 4;
            } else if (i2 < 100) {
                i4 = i2 < 10 ? 1 : 2;
            } else {
                i4 = 3;
            }
            for (int i5 = i3 - i4; i5 > 0; i5--) {
                appendable.append('0');
            }
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 != 3) {
                        if (i4 != 4) {
                            return;
                        }
                        appendable.append((char) ((i2 / 1000) + 48));
                        i2 %= 1000;
                    }
                    if (i2 >= 100) {
                        appendable.append((char) ((i2 / 100) + 48));
                        i2 %= 100;
                    } else {
                        appendable.append('0');
                    }
                }
                if (i2 >= 10) {
                    appendable.append((char) ((i2 / 10) + 48));
                    i2 %= 10;
                } else {
                    appendable.append('0');
                }
            }
            appendable.append((char) (i2 + 48));
            return;
        }
        char[] cArr = new char[10];
        int i6 = 0;
        while (i2 != 0) {
            cArr[i6] = (char) ((i2 % 10) + 48);
            i2 /= 10;
            i6++;
        }
        while (i6 < i3) {
            appendable.append('0');
            i3--;
        }
        while (true) {
            i6--;
            if (i6 < 0) {
                return;
            } else {
                appendable.append(cArr[i6]);
            }
        }
    }

    private <B extends Appendable> B applyRules(Calendar calendar, B b2) {
        try {
            for (f fVar : this.rules) {
                fVar.c(b2, calendar);
            }
            return b2;
        } catch (IOException e2) {
            throw new DateException(e2);
        }
    }

    private String applyRulesToString(Calendar calendar) {
        return ((StringBuilder) applyRules(calendar, new StringBuilder(this.mMaxLengthEstimate))).toString();
    }

    public static String getTimeZoneDisplay(TimeZone timeZone, boolean z, int i2, Locale locale) {
        i iVar = new i(timeZone, z, i2, locale);
        ConcurrentMap<i, String> concurrentMap = C_TIME_ZONE_DISPLAY_CACHE;
        String str = concurrentMap.get(iVar);
        if (str != null) {
            return str;
        }
        String displayName = timeZone.getDisplayName(z, i2, locale);
        String strPutIfAbsent = concurrentMap.putIfAbsent(iVar, displayName);
        return strPutIfAbsent != null ? strPutIfAbsent : displayName;
    }

    private void init() {
        int iA = 0;
        f[] fVarArr = (f[]) parsePattern().toArray(new f[0]);
        this.rules = fVarArr;
        int length = fVarArr.length;
        while (true) {
            length--;
            if (length < 0) {
                this.mMaxLengthEstimate = iA;
                return;
            }
            iA += this.rules[length].a();
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        init();
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
        StringBuilder sb = new StringBuilder();
        sb.append("Unknown class: ");
        sb.append(obj == null ? "<null>" : obj.getClass().getName());
        throw new IllegalArgumentException(sb.toString());
    }

    public int getMaxLengthEstimate() {
        return this.mMaxLengthEstimate;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0085  */
    /* JADX WARN: Code duplicated, block: B:66:0x016b  */
    /* JADX WARN: Code duplicated, block: B:67:0x016f  */
    /* JADX WARN: Code duplicated, block: B:70:0x017c  */
    /* JADX WARN: Code duplicated, block: B:79:0x0182 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v11, types: [cn.hutool.core.date.format.FastDatePrinter$j] */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v4, types: [cn.hutool.core.date.format.FastDatePrinter$d] */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v76 */
    /* JADX WARN: Type inference failed for: r9v77 */
    /* JADX WARN: Type inference failed for: r9v78 */
    /* JADX WARN: Type inference failed for: r9v79 */
    /* JADX WARN: Type inference failed for: r9v80 */
    public List<f> parsePattern() {
        boolean z;
        ?? sVar;
        f bVar;
        f aVar;
        DateFormatSymbols dateFormatSymbols = new DateFormatSymbols(this.locale);
        ArrayList arrayList = new ArrayList();
        String[] eras = dateFormatSymbols.getEras();
        String[] months = dateFormatSymbols.getMonths();
        String[] shortMonths = dateFormatSymbols.getShortMonths();
        String[] weekdays = dateFormatSymbols.getWeekdays();
        String[] shortWeekdays = dateFormatSymbols.getShortWeekdays();
        String[] amPmStrings = dateFormatSymbols.getAmPmStrings();
        int length = this.pattern.length();
        int[] iArr = new int[1];
        int i2 = 0;
        int i3 = 0;
        while (i3 < length) {
            iArr[i2] = i3;
            String token = parseToken(this.pattern, iArr);
            int i4 = iArr[i2];
            int length2 = token.length();
            if (length2 == 0) {
                return arrayList;
            }
            char cCharAt = token.charAt(i2);
            if (cCharAt == 'y') {
                i2 = 0;
                if (length2 == 2) {
                    z = true;
                    sVar = p.f5544a;
                } else {
                    z = true;
                    sVar = selectNumberRule(1, Math.max(length2, 4));
                }
                if (cCharAt == 'Y') {
                    sVar = new s(sVar);
                    continue;
                }
            } else {
                if (cCharAt != 'z') {
                    switch (cCharAt) {
                        case '\'':
                            String strSubstring = token.substring(1);
                            aVar = strSubstring.length() == 1 ? new a(strSubstring.charAt(0)) : new g(strSubstring);
                            i2 = 0;
                            sVar = aVar;
                            break;
                        case 'K':
                            aVar = selectNumberRule(10, length2);
                            i2 = 0;
                            sVar = aVar;
                            break;
                        case 'M':
                            if (length2 >= 4) {
                                aVar = new h(2, months);
                            } else if (length2 == 3) {
                                aVar = new h(2, shortMonths);
                            } else {
                                aVar = length2 == 2 ? n.f5542a : q.f5545a;
                            }
                            i2 = 0;
                            sVar = aVar;
                            break;
                        case 'S':
                            aVar = selectNumberRule(14, length2);
                            i2 = 0;
                            sVar = aVar;
                            break;
                        case 'a':
                            aVar = new h(9, amPmStrings);
                            i2 = 0;
                            sVar = aVar;
                            break;
                        case 'd':
                            aVar = selectNumberRule(5, length2);
                            i2 = 0;
                            sVar = aVar;
                            break;
                        case 'h':
                            aVar = new l(selectNumberRule(10, length2));
                            i2 = 0;
                            sVar = aVar;
                            break;
                        case 'k':
                            aVar = new m(selectNumberRule(11, length2));
                            i2 = 0;
                            sVar = aVar;
                            break;
                        case 'm':
                            aVar = selectNumberRule(12, length2);
                            i2 = 0;
                            sVar = aVar;
                            break;
                        case 's':
                            aVar = selectNumberRule(13, length2);
                            i2 = 0;
                            sVar = aVar;
                            break;
                        case 'u':
                            bVar = new b(selectNumberRule(7, length2));
                            aVar = bVar;
                            i2 = 0;
                            sVar = aVar;
                            break;
                        case 'w':
                            aVar = selectNumberRule(3, length2);
                            i2 = 0;
                            sVar = aVar;
                            break;
                        default:
                            switch (cCharAt) {
                                case 'D':
                                    aVar = selectNumberRule(6, length2);
                                    i2 = 0;
                                    sVar = aVar;
                                    break;
                                case 'E':
                                    bVar = new h(7, length2 < 4 ? shortWeekdays : weekdays);
                                    aVar = bVar;
                                    i2 = 0;
                                    sVar = aVar;
                                    break;
                                case 'F':
                                    aVar = selectNumberRule(8, length2);
                                    i2 = 0;
                                    sVar = aVar;
                                    break;
                                case 'G':
                                    i2 = 0;
                                    sVar = new h(0, eras);
                                    break;
                                case 'H':
                                    aVar = selectNumberRule(11, length2);
                                    i2 = 0;
                                    sVar = aVar;
                                    break;
                                default:
                                    switch (cCharAt) {
                                        case 'W':
                                            aVar = selectNumberRule(4, length2);
                                            break;
                                        case 'X':
                                            aVar = c.d(length2);
                                            break;
                                        case 'Y':
                                            i2 = 0;
                                            if (length2 == 2) {
                                                z = true;
                                                sVar = p.f5544a;
                                            } else {
                                                z = true;
                                                sVar = selectNumberRule(1, Math.max(length2, 4));
                                            }
                                            if (cCharAt == 'Y') {
                                                sVar = new s(sVar);
                                                continue;
                                            }
                                            break;
                                        case 'Z':
                                            if (length2 != 1) {
                                                aVar = length2 != 2 ? k.f5538b : c.d;
                                            } else {
                                                aVar = k.c;
                                            }
                                            break;
                                        default:
                                            throw new IllegalArgumentException("Illegal pattern component: " + token);
                                    }
                                    i2 = 0;
                                    sVar = aVar;
                                    break;
                            }
                            break;
                    }
                } else if (length2 >= 4) {
                    sVar = new j(this.timeZone, this.locale, 1);
                    z = true;
                    i2 = 0;
                } else {
                    i2 = 0;
                    sVar = new j(this.timeZone, this.locale, 0);
                }
                z = true;
            }
            arrayList.add(sVar);
            i3 = i4 + 1;
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

    public d selectNumberRule(int i2, int i3) {
        if (i3 != 1) {
            return i3 != 2 ? new e(i2, i3) : new o(i2);
        }
        return new r(i2);
    }

    public String format(long j2) {
        Calendar calendar = Calendar.getInstance(this.timeZone, this.locale);
        calendar.setTimeInMillis(j2);
        return applyRulesToString(calendar);
    }

    @Override // defpackage.aq5
    public String format(Date date) {
        Calendar calendar = Calendar.getInstance(this.timeZone, this.locale);
        calendar.setTime(date);
        return applyRulesToString(calendar);
    }

    public String format(Calendar calendar) {
        return ((StringBuilder) format(calendar, new StringBuilder(this.mMaxLengthEstimate))).toString();
    }

    public <B extends Appendable> B format(long j2, B b2) {
        Calendar calendar = Calendar.getInstance(this.timeZone, this.locale);
        calendar.setTimeInMillis(j2);
        return (B) applyRules(calendar, b2);
    }

    public <B extends Appendable> B format(Date date, B b2) {
        Calendar calendar = Calendar.getInstance(this.timeZone, this.locale);
        calendar.setTime(date);
        return (B) applyRules(calendar, b2);
    }

    public <B extends Appendable> B format(Calendar calendar, B b2) {
        if (!calendar.getTimeZone().equals(this.timeZone)) {
            calendar = (Calendar) calendar.clone();
            calendar.setTimeZone(this.timeZone);
        }
        return (B) applyRules(calendar, b2);
    }
}
