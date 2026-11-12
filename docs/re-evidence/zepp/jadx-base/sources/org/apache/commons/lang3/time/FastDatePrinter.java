package org.apache.commons.lang3.time;

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
import kotlinx.serialization.json.internal.JsonLexerKt;
import org.apache.commons.lang3.exception.ExceptionUtils;

/* JADX INFO: loaded from: classes23.dex */
public class FastDatePrinter implements DatePrinter, Serializable {
    public static final int FULL = 0;
    public static final int LONG = 1;
    public static final int MEDIUM = 2;
    public static final int SHORT = 3;
    private static final int f = 10;
    private static final ConcurrentMap<i, String> g = new ConcurrentHashMap(7);
    private static final long serialVersionUID = 1;
    private final String a;
    private final TimeZone b;
    private final Locale c;
    private transient f[] d;
    private transient int e;

    public static class a implements f {
        private final char a;

        public a(char c) {
            this.a = c;
        }

        @Override // org.apache.commons.lang3.time.FastDatePrinter.f
        public int a() {
            return 1;
        }

        @Override // org.apache.commons.lang3.time.FastDatePrinter.f
        public void c(Appendable appendable, Calendar calendar) throws IOException {
            appendable.append(this.a);
        }
    }

    public static class b implements d {
        private final d a;

        public b(d dVar) {
            this.a = dVar;
        }

        @Override // org.apache.commons.lang3.time.FastDatePrinter.f
        public int a() {
            return this.a.a();
        }

        @Override // org.apache.commons.lang3.time.FastDatePrinter.d
        public void b(Appendable appendable, int i) throws IOException {
            this.a.b(appendable, i);
        }

        @Override // org.apache.commons.lang3.time.FastDatePrinter.f
        public void c(Appendable appendable, Calendar calendar) throws IOException {
            int i = calendar.get(7);
            this.a.b(appendable, i != 1 ? i - 1 : 7);
        }
    }

    public static class c implements f {
        public static final c b = new c(3);
        public static final c c = new c(5);
        public static final c d = new c(6);
        public final int a;

        public c(int i) {
            this.a = i;
        }

        public static c d(int i) {
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

        @Override // org.apache.commons.lang3.time.FastDatePrinter.f
        public int a() {
            return this.a;
        }

        @Override // org.apache.commons.lang3.time.FastDatePrinter.f
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
            FastDatePrinter.c(appendable, i2);
            int i3 = this.a;
            if (i3 < 5) {
                return;
            }
            if (i3 == 6) {
                appendable.append(JsonLexerKt.COLON);
            }
            FastDatePrinter.c(appendable, (i / 60000) - (i2 * 60));
        }
    }

    public interface d extends f {
        void b(Appendable appendable, int i) throws IOException;
    }

    public static class e implements d {
        private final int a;
        private final int b;

        public e(int i, int i2) {
            if (i2 < 3) {
                throw new IllegalArgumentException();
            }
            this.a = i;
            this.b = i2;
        }

        @Override // org.apache.commons.lang3.time.FastDatePrinter.f
        public int a() {
            return this.b;
        }

        @Override // org.apache.commons.lang3.time.FastDatePrinter.d
        public final void b(Appendable appendable, int i) throws IOException {
            FastDatePrinter.e(appendable, i, this.b);
        }

        @Override // org.apache.commons.lang3.time.FastDatePrinter.f
        public void c(Appendable appendable, Calendar calendar) throws IOException {
            b(appendable, calendar.get(this.a));
        }
    }

    public interface f {
        int a();

        void c(Appendable appendable, Calendar calendar) throws IOException;
    }

    public static class g implements f {
        private final String a;

        public g(String str) {
            this.a = str;
        }

        @Override // org.apache.commons.lang3.time.FastDatePrinter.f
        public int a() {
            return this.a.length();
        }

        @Override // org.apache.commons.lang3.time.FastDatePrinter.f
        public void c(Appendable appendable, Calendar calendar) throws IOException {
            appendable.append(this.a);
        }
    }

    public static class h implements f {
        private final int a;
        private final String[] b;

        public h(int i, String[] strArr) {
            this.a = i;
            this.b = strArr;
        }

        @Override // org.apache.commons.lang3.time.FastDatePrinter.f
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

        @Override // org.apache.commons.lang3.time.FastDatePrinter.f
        public void c(Appendable appendable, Calendar calendar) throws IOException {
            appendable.append(this.b[calendar.get(this.a)]);
        }
    }

    public static class i {
        private final TimeZone a;
        private final int b;
        private final Locale c;

        public i(TimeZone timeZone, boolean z, int i, Locale locale) {
            this.a = timeZone;
            if (z) {
                this.b = Integer.MIN_VALUE | i;
            } else {
                this.b = i;
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
            return this.a.equals(iVar.a) && this.b == iVar.b && this.c.equals(iVar.c);
        }

        public int hashCode() {
            return (((this.b * 31) + this.c.hashCode()) * 31) + this.a.hashCode();
        }
    }

    public static class j implements f {
        private final Locale a;
        private final int b;
        private final String c;
        private final String d;

        public j(TimeZone timeZone, Locale locale, int i) {
            this.a = locale;
            this.b = i;
            this.c = FastDatePrinter.i(timeZone, false, i, locale);
            this.d = FastDatePrinter.i(timeZone, true, i, locale);
        }

        @Override // org.apache.commons.lang3.time.FastDatePrinter.f
        public int a() {
            return Math.max(this.c.length(), this.d.length());
        }

        @Override // org.apache.commons.lang3.time.FastDatePrinter.f
        public void c(Appendable appendable, Calendar calendar) throws IOException {
            TimeZone timeZone = calendar.getTimeZone();
            if (calendar.get(16) != 0) {
                appendable.append(FastDatePrinter.i(timeZone, true, this.b, this.a));
            } else {
                appendable.append(FastDatePrinter.i(timeZone, false, this.b, this.a));
            }
        }
    }

    public static class k implements f {
        public static final k b = new k(true);
        public static final k c = new k(false);
        public final boolean a;

        public k(boolean z) {
            this.a = z;
        }

        @Override // org.apache.commons.lang3.time.FastDatePrinter.f
        public int a() {
            return 5;
        }

        @Override // org.apache.commons.lang3.time.FastDatePrinter.f
        public void c(Appendable appendable, Calendar calendar) throws IOException {
            int i = calendar.get(15) + calendar.get(16);
            if (i < 0) {
                appendable.append('-');
                i = -i;
            } else {
                appendable.append('+');
            }
            int i2 = i / 3600000;
            FastDatePrinter.c(appendable, i2);
            if (this.a) {
                appendable.append(JsonLexerKt.COLON);
            }
            FastDatePrinter.c(appendable, (i / 60000) - (i2 * 60));
        }
    }

    public static class l implements d {
        private final d a;

        public l(d dVar) {
            this.a = dVar;
        }

        @Override // org.apache.commons.lang3.time.FastDatePrinter.f
        public int a() {
            return this.a.a();
        }

        @Override // org.apache.commons.lang3.time.FastDatePrinter.d
        public void b(Appendable appendable, int i) throws IOException {
            this.a.b(appendable, i);
        }

        @Override // org.apache.commons.lang3.time.FastDatePrinter.f
        public void c(Appendable appendable, Calendar calendar) throws IOException {
            int leastMaximum = calendar.get(10);
            if (leastMaximum == 0) {
                leastMaximum = calendar.getLeastMaximum(10) + 1;
            }
            this.a.b(appendable, leastMaximum);
        }
    }

    public static class m implements d {
        private final d a;

        public m(d dVar) {
            this.a = dVar;
        }

        @Override // org.apache.commons.lang3.time.FastDatePrinter.f
        public int a() {
            return this.a.a();
        }

        @Override // org.apache.commons.lang3.time.FastDatePrinter.d
        public void b(Appendable appendable, int i) throws IOException {
            this.a.b(appendable, i);
        }

        @Override // org.apache.commons.lang3.time.FastDatePrinter.f
        public void c(Appendable appendable, Calendar calendar) throws IOException {
            int maximum = calendar.get(11);
            if (maximum == 0) {
                maximum = calendar.getMaximum(11) + 1;
            }
            this.a.b(appendable, maximum);
        }
    }

    public static class n implements d {
        public static final n a = new n();

        @Override // org.apache.commons.lang3.time.FastDatePrinter.f
        public int a() {
            return 2;
        }

        @Override // org.apache.commons.lang3.time.FastDatePrinter.d
        public final void b(Appendable appendable, int i) throws IOException {
            FastDatePrinter.c(appendable, i);
        }

        @Override // org.apache.commons.lang3.time.FastDatePrinter.f
        public void c(Appendable appendable, Calendar calendar) throws IOException {
            b(appendable, calendar.get(2) + 1);
        }
    }

    public static class o implements d {
        private final int a;

        public o(int i) {
            this.a = i;
        }

        @Override // org.apache.commons.lang3.time.FastDatePrinter.f
        public int a() {
            return 2;
        }

        @Override // org.apache.commons.lang3.time.FastDatePrinter.d
        public final void b(Appendable appendable, int i) throws IOException {
            if (i < 100) {
                FastDatePrinter.c(appendable, i);
            } else {
                FastDatePrinter.e(appendable, i, 2);
            }
        }

        @Override // org.apache.commons.lang3.time.FastDatePrinter.f
        public void c(Appendable appendable, Calendar calendar) throws IOException {
            b(appendable, calendar.get(this.a));
        }
    }

    public static class p implements d {
        public static final p a = new p();

        @Override // org.apache.commons.lang3.time.FastDatePrinter.f
        public int a() {
            return 2;
        }

        @Override // org.apache.commons.lang3.time.FastDatePrinter.d
        public final void b(Appendable appendable, int i) throws IOException {
            FastDatePrinter.c(appendable, i);
        }

        @Override // org.apache.commons.lang3.time.FastDatePrinter.f
        public void c(Appendable appendable, Calendar calendar) throws IOException {
            b(appendable, calendar.get(1) % 100);
        }
    }

    public static class q implements d {
        public static final q a = new q();

        @Override // org.apache.commons.lang3.time.FastDatePrinter.f
        public int a() {
            return 2;
        }

        @Override // org.apache.commons.lang3.time.FastDatePrinter.d
        public final void b(Appendable appendable, int i) throws IOException {
            if (i < 10) {
                appendable.append((char) (i + 48));
            } else {
                FastDatePrinter.c(appendable, i);
            }
        }

        @Override // org.apache.commons.lang3.time.FastDatePrinter.f
        public void c(Appendable appendable, Calendar calendar) throws IOException {
            b(appendable, calendar.get(2) + 1);
        }
    }

    public static class r implements d {
        private final int a;

        public r(int i) {
            this.a = i;
        }

        @Override // org.apache.commons.lang3.time.FastDatePrinter.f
        public int a() {
            return 4;
        }

        @Override // org.apache.commons.lang3.time.FastDatePrinter.d
        public final void b(Appendable appendable, int i) throws IOException {
            if (i < 10) {
                appendable.append((char) (i + 48));
            } else if (i < 100) {
                FastDatePrinter.c(appendable, i);
            } else {
                FastDatePrinter.e(appendable, i, 1);
            }
        }

        @Override // org.apache.commons.lang3.time.FastDatePrinter.f
        public void c(Appendable appendable, Calendar calendar) throws IOException {
            b(appendable, calendar.get(this.a));
        }
    }

    public static class s implements d {
        private final d a;

        public s(d dVar) {
            this.a = dVar;
        }

        @Override // org.apache.commons.lang3.time.FastDatePrinter.f
        public int a() {
            return this.a.a();
        }

        @Override // org.apache.commons.lang3.time.FastDatePrinter.d
        public void b(Appendable appendable, int i) throws IOException {
            this.a.b(appendable, i);
        }

        @Override // org.apache.commons.lang3.time.FastDatePrinter.f
        public void c(Appendable appendable, Calendar calendar) throws IOException {
            this.a.b(appendable, calendar.getWeekYear());
        }
    }

    public FastDatePrinter(String str, TimeZone timeZone, Locale locale) {
        this.a = str;
        this.b = timeZone;
        this.c = locale;
        j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(Appendable appendable, int i2) throws IOException {
        appendable.append((char) ((i2 / 10) + 48));
        appendable.append((char) ((i2 % 10) + 48));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void e(Appendable appendable, int i2, int i3) throws IOException {
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

    private <B extends Appendable> B f(Calendar calendar, B b2) {
        try {
            for (f fVar : this.d) {
                fVar.c(b2, calendar);
            }
        } catch (IOException e2) {
            ExceptionUtils.rethrow(e2);
        }
        return b2;
    }

    private String g(Calendar calendar) {
        return ((StringBuilder) f(calendar, new StringBuilder(this.e))).toString();
    }

    public static String i(TimeZone timeZone, boolean z, int i2, Locale locale) {
        i iVar = new i(timeZone, z, i2, locale);
        ConcurrentMap<i, String> concurrentMap = g;
        String str = concurrentMap.get(iVar);
        if (str != null) {
            return str;
        }
        String displayName = timeZone.getDisplayName(z, i2, locale);
        String strPutIfAbsent = concurrentMap.putIfAbsent(iVar, displayName);
        return strPutIfAbsent != null ? strPutIfAbsent : displayName;
    }

    private void j() {
        List<f> pattern = parsePattern();
        f[] fVarArr = (f[]) pattern.toArray(new f[pattern.size()]);
        this.d = fVarArr;
        int length = fVarArr.length;
        int iA = 0;
        while (true) {
            length--;
            if (length < 0) {
                this.e = iA;
                return;
            }
            iA += this.d[length].a();
        }
    }

    private Calendar k() {
        return Calendar.getInstance(this.b, this.c);
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        j();
    }

    @Deprecated
    public StringBuffer applyRules(Calendar calendar, StringBuffer stringBuffer) {
        return (StringBuffer) f(calendar, stringBuffer);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof FastDatePrinter)) {
            return false;
        }
        FastDatePrinter fastDatePrinter = (FastDatePrinter) obj;
        return this.a.equals(fastDatePrinter.a) && this.b.equals(fastDatePrinter.b) && this.c.equals(fastDatePrinter.c);
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
        StringBuilder sb = new StringBuilder();
        sb.append("Unknown class: ");
        sb.append(obj == null ? "<null>" : obj.getClass().getName());
        throw new IllegalArgumentException(sb.toString());
    }

    @Override // org.apache.commons.lang3.time.DatePrinter
    public Locale getLocale() {
        return this.c;
    }

    public int getMaxLengthEstimate() {
        return this.e;
    }

    @Override // org.apache.commons.lang3.time.DatePrinter
    public String getPattern() {
        return this.a;
    }

    @Override // org.apache.commons.lang3.time.DatePrinter
    public TimeZone getTimeZone() {
        return this.b;
    }

    public String h(Object obj) {
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

    public int hashCode() {
        return this.a.hashCode() + ((this.b.hashCode() + (this.c.hashCode() * 13)) * 13);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0082  */
    /* JADX WARN: Code duplicated, block: B:64:0x0164  */
    /* JADX WARN: Code duplicated, block: B:65:0x0169 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:66:0x016b  */
    /* JADX WARN: Code duplicated, block: B:67:0x016e  */
    /* JADX WARN: Code duplicated, block: B:71:0x0177  */
    /* JADX WARN: Code duplicated, block: B:80:0x017d A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v14 */
    /* JADX WARN: Type inference failed for: r12v18 */
    /* JADX WARN: Type inference failed for: r12v19 */
    /* JADX WARN: Type inference failed for: r12v20 */
    /* JADX WARN: Type inference failed for: r12v6, types: [org.apache.commons.lang3.time.FastDatePrinter$d] */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r12v9, types: [java.lang.Object] */
    public List<f> parsePattern() {
        int i2;
        ?? sVar;
        f jVar;
        DateFormatSymbols dateFormatSymbols = new DateFormatSymbols(this.c);
        ArrayList arrayList = new ArrayList();
        String[] eras = dateFormatSymbols.getEras();
        String[] months = dateFormatSymbols.getMonths();
        String[] shortMonths = dateFormatSymbols.getShortMonths();
        String[] weekdays = dateFormatSymbols.getWeekdays();
        String[] shortWeekdays = dateFormatSymbols.getShortWeekdays();
        String[] amPmStrings = dateFormatSymbols.getAmPmStrings();
        int length = this.a.length();
        int[] iArr = new int[1];
        int i3 = 0;
        int i4 = 0;
        while (i4 < length) {
            iArr[i3] = i4;
            String token = parseToken(this.a, iArr);
            int i5 = iArr[i3];
            int length2 = token.length();
            if (length2 == 0) {
                return arrayList;
            }
            char cCharAt = token.charAt(i3);
            if (cCharAt == 'y') {
                i3 = 0;
                if (length2 == 2) {
                    sVar = p.a;
                } else {
                    if (length2 < 4) {
                        i2 = 1;
                        length2 = 4;
                    } else {
                        i2 = 1;
                    }
                    sVar = selectNumberRule(i2, length2);
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
                            jVar = strSubstring.length() != 1 ? new g(strSubstring) : new a(strSubstring.charAt(0));
                            break;
                        case 'K':
                            jVar = selectNumberRule(10, length2);
                            break;
                        case 'M':
                            if (length2 >= 4) {
                                jVar = new h(2, months);
                            } else if (length2 != 3) {
                                jVar = length2 != 2 ? q.a : n.a;
                            } else {
                                jVar = new h(2, shortMonths);
                            }
                            break;
                        case 'S':
                            jVar = selectNumberRule(14, length2);
                            break;
                        case 'a':
                            jVar = new h(9, amPmStrings);
                            break;
                        case 'd':
                            jVar = selectNumberRule(5, length2);
                            break;
                        case 'h':
                            jVar = new l(selectNumberRule(10, length2));
                            break;
                        case 'k':
                            jVar = new m(selectNumberRule(11, length2));
                            break;
                        case 'm':
                            jVar = selectNumberRule(12, length2);
                            break;
                        case 's':
                            jVar = selectNumberRule(13, length2);
                            break;
                        case 'u':
                            jVar = new b(selectNumberRule(7, length2));
                            break;
                        case 'w':
                            jVar = selectNumberRule(3, length2);
                            break;
                        default:
                            switch (cCharAt) {
                                case 'D':
                                    jVar = selectNumberRule(6, length2);
                                    break;
                                case 'E':
                                    sVar = new h(7, length2 < 4 ? shortWeekdays : weekdays);
                                    i3 = 0;
                                    break;
                                case 'F':
                                    jVar = selectNumberRule(8, length2);
                                    break;
                                case 'G':
                                    i3 = 0;
                                    sVar = new h(0, eras);
                                    break;
                                case 'H':
                                    jVar = selectNumberRule(11, length2);
                                    break;
                                default:
                                    switch (cCharAt) {
                                        case 'W':
                                            jVar = selectNumberRule(4, length2);
                                            break;
                                        case 'X':
                                            jVar = c.d(length2);
                                            break;
                                        case 'Y':
                                            i3 = 0;
                                            if (length2 == 2) {
                                                sVar = p.a;
                                            } else {
                                                if (length2 < 4) {
                                                    i2 = 1;
                                                    length2 = 4;
                                                } else {
                                                    i2 = 1;
                                                }
                                                sVar = selectNumberRule(i2, length2);
                                            }
                                            if (cCharAt == 'Y') {
                                                sVar = new s(sVar);
                                                continue;
                                            }
                                            break;
                                        case 'Z':
                                            if (length2 != 1) {
                                                jVar = length2 != 2 ? k.b : c.d;
                                            } else {
                                                jVar = k.c;
                                            }
                                            break;
                                        default:
                                            throw new IllegalArgumentException("Illegal pattern component: " + token);
                                    }
                                    break;
                            }
                            break;
                    }
                } else {
                    jVar = length2 >= 4 ? new j(this.b, this.c, 1) : new j(this.b, this.c, 0);
                }
                sVar = jVar;
                i3 = 0;
            }
            arrayList.add(sVar);
            i4 = i5 + 1;
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

    public String toString() {
        return "FastDatePrinter[" + this.a + "," + this.c + "," + this.b.getID() + "]";
    }

    @Override // org.apache.commons.lang3.time.DatePrinter
    public String format(long j2) {
        Calendar calendarK = k();
        calendarK.setTimeInMillis(j2);
        return g(calendarK);
    }

    @Override // org.apache.commons.lang3.time.DatePrinter
    public String format(Date date) {
        Calendar calendarK = k();
        calendarK.setTime(date);
        return g(calendarK);
    }

    @Override // org.apache.commons.lang3.time.DatePrinter
    public String format(Calendar calendar) {
        return ((StringBuilder) format(calendar, new StringBuilder(this.e))).toString();
    }

    @Override // org.apache.commons.lang3.time.DatePrinter
    public StringBuffer format(long j2, StringBuffer stringBuffer) {
        Calendar calendarK = k();
        calendarK.setTimeInMillis(j2);
        return (StringBuffer) f(calendarK, stringBuffer);
    }

    @Override // org.apache.commons.lang3.time.DatePrinter
    public StringBuffer format(Date date, StringBuffer stringBuffer) {
        Calendar calendarK = k();
        calendarK.setTime(date);
        return (StringBuffer) f(calendarK, stringBuffer);
    }

    @Override // org.apache.commons.lang3.time.DatePrinter
    public StringBuffer format(Calendar calendar, StringBuffer stringBuffer) {
        return format(calendar.getTime(), stringBuffer);
    }

    @Override // org.apache.commons.lang3.time.DatePrinter
    public <B extends Appendable> B format(long j2, B b2) {
        Calendar calendarK = k();
        calendarK.setTimeInMillis(j2);
        return (B) f(calendarK, b2);
    }

    @Override // org.apache.commons.lang3.time.DatePrinter
    public <B extends Appendable> B format(Date date, B b2) {
        Calendar calendarK = k();
        calendarK.setTime(date);
        return (B) f(calendarK, b2);
    }

    @Override // org.apache.commons.lang3.time.DatePrinter
    public <B extends Appendable> B format(Calendar calendar, B b2) {
        if (!calendar.getTimeZone().equals(this.b)) {
            calendar = (Calendar) calendar.clone();
            calendar.setTimeZone(this.b);
        }
        return (B) f(calendar, b2);
    }
}
