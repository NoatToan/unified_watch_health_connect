package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import miuix.animation.internal.FolmeCore;
import okhttp3.internal.connection.RealConnection;
import okio.Utf8;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.MutableDateTime;
import org.joda.time.field.MillisDurationField;

/* JADX INFO: loaded from: classes3.dex */
public class lq5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList<Object> f25322a = new ArrayList<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f25323b;

    public static class a implements dfd, bfd {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final char f25324a;

        public a(char c) {
            this.f25324a = c;
        }

        @Override // defpackage.bfd
        public int a() {
            return 1;
        }

        @Override // defpackage.dfd
        public void b(Appendable appendable, long j, bw3 bw3Var, int i, DateTimeZone dateTimeZone, Locale locale) throws IOException {
            appendable.append(this.f25324a);
        }

        @Override // defpackage.bfd
        public int c(pq5 pq5Var, CharSequence charSequence, int i) {
            char upperCase;
            char upperCase2;
            if (i >= charSequence.length()) {
                return ~i;
            }
            char cCharAt = charSequence.charAt(i);
            char c = this.f25324a;
            return (cCharAt == c || (upperCase = Character.toUpperCase(cCharAt)) == (upperCase2 = Character.toUpperCase(c)) || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2)) ? i + 1 : ~i;
        }

        @Override // defpackage.dfd
        public int d() {
            return 1;
        }

        @Override // defpackage.dfd
        public void e(Appendable appendable, ogj ogjVar, Locale locale) throws IOException {
            appendable.append(this.f25324a);
        }
    }

    public static class b implements dfd, bfd {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final dfd[] f25325a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final bfd[] f25326b;
        public final int c;
        public final int d;

        public b(List<Object> list) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            g(list, arrayList, arrayList2);
            if (arrayList.contains(null) || arrayList.isEmpty()) {
                this.f25325a = null;
                this.c = 0;
            } else {
                int size = arrayList.size();
                this.f25325a = new dfd[size];
                int iD = 0;
                for (int i = 0; i < size; i++) {
                    dfd dfdVar = (dfd) arrayList.get(i);
                    iD += dfdVar.d();
                    this.f25325a[i] = dfdVar;
                }
                this.c = iD;
            }
            if (arrayList2.contains(null) || arrayList2.isEmpty()) {
                this.f25326b = null;
                this.d = 0;
                return;
            }
            int size2 = arrayList2.size();
            this.f25326b = new bfd[size2];
            int iA = 0;
            for (int i2 = 0; i2 < size2; i2++) {
                bfd bfdVar = (bfd) arrayList2.get(i2);
                iA += bfdVar.a();
                this.f25326b[i2] = bfdVar;
            }
            this.d = iA;
        }

        @Override // defpackage.bfd
        public int a() {
            return this.d;
        }

        @Override // defpackage.dfd
        public void b(Appendable appendable, long j, bw3 bw3Var, int i, DateTimeZone dateTimeZone, Locale locale) throws IOException {
            dfd[] dfdVarArr = this.f25325a;
            if (dfdVarArr == null) {
                throw new UnsupportedOperationException();
            }
            Locale locale2 = locale == null ? Locale.getDefault() : locale;
            for (dfd dfdVar : dfdVarArr) {
                dfdVar.b(appendable, j, bw3Var, i, dateTimeZone, locale2);
            }
        }

        @Override // defpackage.bfd
        public int c(pq5 pq5Var, CharSequence charSequence, int i) {
            bfd[] bfdVarArr = this.f25326b;
            if (bfdVarArr == null) {
                throw new UnsupportedOperationException();
            }
            int length = bfdVarArr.length;
            for (int i2 = 0; i2 < length && i >= 0; i2++) {
                i = bfdVarArr[i2].c(pq5Var, charSequence, i);
            }
            return i;
        }

        @Override // defpackage.dfd
        public int d() {
            return this.c;
        }

        @Override // defpackage.dfd
        public void e(Appendable appendable, ogj ogjVar, Locale locale) throws IOException {
            dfd[] dfdVarArr = this.f25325a;
            if (dfdVarArr == null) {
                throw new UnsupportedOperationException();
            }
            if (locale == null) {
                locale = Locale.getDefault();
            }
            for (dfd dfdVar : dfdVarArr) {
                dfdVar.e(appendable, ogjVar, locale);
            }
        }

        public final void f(List<Object> list, Object[] objArr) {
            if (objArr != null) {
                for (Object obj : objArr) {
                    list.add(obj);
                }
            }
        }

        public final void g(List<Object> list, List<Object> list2, List<Object> list3) {
            int size = list.size();
            for (int i = 0; i < size; i += 2) {
                Object obj = list.get(i);
                if (obj instanceof b) {
                    f(list2, ((b) obj).f25325a);
                } else {
                    list2.add(obj);
                }
                Object obj2 = list.get(i + 1);
                if (obj2 instanceof b) {
                    f(list3, ((b) obj2).f25326b);
                } else {
                    list3.add(obj2);
                }
            }
        }

        public boolean h() {
            return this.f25326b != null;
        }

        public boolean i() {
            return this.f25325a != null;
        }
    }

    public static class c extends g {
        public c(DateTimeFieldType dateTimeFieldType, int i, boolean z) {
            super(dateTimeFieldType, i, z, i);
        }

        @Override // lq5.f, defpackage.bfd
        public int c(pq5 pq5Var, CharSequence charSequence, int i) {
            int i2;
            char cCharAt;
            int iC = super.c(pq5Var, charSequence, i);
            if (iC < 0 || iC == (i2 = this.f25332b + i)) {
                return iC;
            }
            if (this.c && ((cCharAt = charSequence.charAt(i)) == '-' || cCharAt == '+')) {
                i2++;
            }
            if (iC > i2) {
                return ~(i2 + 1);
            }
            return iC < i2 ? ~iC : iC;
        }
    }

    public static class d implements dfd, bfd {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final DateTimeFieldType f25327a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f25328b;
        public int c;

        public d(DateTimeFieldType dateTimeFieldType, int i, int i2) {
            this.f25327a = dateTimeFieldType;
            i2 = i2 > 18 ? 18 : i2;
            this.f25328b = i;
            this.c = i2;
        }

        @Override // defpackage.bfd
        public int a() {
            return this.c;
        }

        @Override // defpackage.dfd
        public void b(Appendable appendable, long j, bw3 bw3Var, int i, DateTimeZone dateTimeZone, Locale locale) throws IOException {
            g(appendable, j, bw3Var);
        }

        @Override // defpackage.bfd
        public int c(pq5 pq5Var, CharSequence charSequence, int i) {
            gq5 field = this.f25327a.getField(pq5Var.n());
            int iMin = Math.min(this.c, charSequence.length() - i);
            long unitMillis = field.getDurationField().getUnitMillis() * 10;
            long j = 0;
            int i2 = 0;
            while (i2 < iMin) {
                char cCharAt = charSequence.charAt(i + i2);
                if (cCharAt < '0' || cCharAt > '9') {
                    break;
                }
                i2++;
                unitMillis /= 10;
                j += ((long) (cCharAt - '0')) * unitMillis;
            }
            long j2 = j / 10;
            if (i2 != 0 && j2 <= 2147483647L) {
                pq5Var.u(new j5i(DateTimeFieldType.millisOfSecond(), MillisDurationField.INSTANCE, field.getDurationField()), (int) j2);
                return i + i2;
            }
            return ~i;
        }

        @Override // defpackage.dfd
        public int d() {
            return this.c;
        }

        @Override // defpackage.dfd
        public void e(Appendable appendable, ogj ogjVar, Locale locale) throws IOException {
            g(appendable, ogjVar.getChronology().set(ogjVar, 0L), ogjVar.getChronology());
        }

        public final long[] f(long j, gq5 gq5Var) {
            long j2;
            long unitMillis = gq5Var.getDurationField().getUnitMillis();
            int i = this.c;
            while (true) {
                switch (i) {
                    case 1:
                        j2 = 10;
                        break;
                    case 2:
                        j2 = 100;
                        break;
                    case 3:
                        j2 = 1000;
                        break;
                    case 4:
                        j2 = 10000;
                        break;
                    case 5:
                        j2 = 100000;
                        break;
                    case 6:
                        j2 = FolmeCore.NANOS_TO_MS;
                        break;
                    case 7:
                        j2 = 10000000;
                        break;
                    case 8:
                        j2 = 100000000;
                        break;
                    case 9:
                        j2 = FolmeCore.NANOS_TO_S;
                        break;
                    case 10:
                        j2 = RealConnection.IDLE_CONNECTION_HEALTHY_NS;
                        break;
                    case 11:
                        j2 = 100000000000L;
                        break;
                    case 12:
                        j2 = 1000000000000L;
                        break;
                    case 13:
                        j2 = 10000000000000L;
                        break;
                    case 14:
                        j2 = 100000000000000L;
                        break;
                    case 15:
                        j2 = 1000000000000000L;
                        break;
                    case 16:
                        j2 = 10000000000000000L;
                        break;
                    case 17:
                        j2 = 100000000000000000L;
                        break;
                    case 18:
                        j2 = 1000000000000000000L;
                        break;
                    default:
                        j2 = 1;
                        break;
                }
                if ((unitMillis * j2) / j2 == unitMillis) {
                    return new long[]{(j * j2) / unitMillis, i};
                }
                i--;
            }
        }

        public void g(Appendable appendable, long j, bw3 bw3Var) throws IOException {
            gq5 field = this.f25327a.getField(bw3Var);
            int i = this.f25328b;
            try {
                long jRemainder = field.remainder(j);
                if (jRemainder != 0) {
                    long[] jArrF = f(jRemainder, field);
                    long j2 = jArrF[0];
                    int i2 = (int) jArrF[1];
                    String string = (2147483647L & j2) == j2 ? Integer.toString((int) j2) : Long.toString(j2);
                    int length = string.length();
                    while (length < i2) {
                        appendable.append('0');
                        i--;
                        i2--;
                    }
                    if (i < i2) {
                        while (i < i2 && length > 1 && string.charAt(length - 1) == '0') {
                            i2--;
                            length--;
                        }
                        if (length < string.length()) {
                            for (int i3 = 0; i3 < length; i3++) {
                                appendable.append(string.charAt(i3));
                            }
                            return;
                        }
                    }
                    appendable.append(string);
                    return;
                }
                while (true) {
                    i--;
                    if (i < 0) {
                        return;
                    } else {
                        appendable.append('0');
                    }
                }
            } catch (RuntimeException unused) {
                lq5.Q(appendable, i);
            }
        }
    }

    public static class e implements bfd {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final bfd[] f25329a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f25330b;

        public e(bfd[] bfdVarArr) {
            int iA;
            this.f25329a = bfdVarArr;
            int length = bfdVarArr.length;
            int i = 0;
            while (true) {
                length--;
                if (length < 0) {
                    this.f25330b = i;
                    return;
                }
                bfd bfdVar = bfdVarArr[length];
                if (bfdVar != null && (iA = bfdVar.a()) > i) {
                    i = iA;
                }
            }
        }

        @Override // defpackage.bfd
        public int a() {
            return this.f25330b;
        }

        @Override // defpackage.bfd
        public int c(pq5 pq5Var, CharSequence charSequence, int i) {
            int i2;
            int i3;
            bfd[] bfdVarArr = this.f25329a;
            int length = bfdVarArr.length;
            Object objX = pq5Var.x();
            boolean z = false;
            Object objX2 = null;
            int i4 = i;
            int i5 = i4;
            for (int i6 = 0; i6 < length; i6++) {
                bfd bfdVar = bfdVarArr[i6];
                if (bfdVar == null) {
                    if (i4 > i) {
                        z = true;
                        break;
                    }
                    return i;
                }
                int iC = bfdVar.c(pq5Var, charSequence, i);
                if (iC >= i) {
                    if (iC <= i4) {
                        continue;
                    } else {
                        if (iC >= charSequence.length() || (i3 = i6 + 1) >= length || bfdVarArr[i3] == null) {
                            return iC;
                        }
                        objX2 = pq5Var.x();
                        i4 = iC;
                    }
                } else if (iC < 0 && (i2 = ~iC) > i5) {
                    i5 = i2;
                }
                pq5Var.t(objX);
            }
            if (i4 <= i && (i4 != i || !z)) {
                return ~i5;
            }
            if (objX2 != null) {
                pq5Var.t(objX2);
            }
            return i4;
        }
    }

    public static abstract class f implements dfd, bfd {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final DateTimeFieldType f25331a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f25332b;
        public final boolean c;

        public f(DateTimeFieldType dateTimeFieldType, int i, boolean z) {
            this.f25331a = dateTimeFieldType;
            this.f25332b = i;
            this.c = z;
        }

        @Override // defpackage.bfd
        public int a() {
            return this.f25332b;
        }

        public int c(pq5 pq5Var, CharSequence charSequence, int i) {
            int i2;
            int i3;
            char cCharAt;
            int iMin = Math.min(this.f25332b, charSequence.length() - i);
            int i4 = 0;
            boolean z = false;
            boolean z2 = false;
            while (i4 < iMin) {
                int i5 = i + i4;
                char cCharAt2 = charSequence.charAt(i5);
                if (i4 == 0 && ((cCharAt2 == '-' || cCharAt2 == '+') && this.c)) {
                    boolean z3 = cCharAt2 == '-';
                    boolean z4 = cCharAt2 == '+';
                    int i6 = i4 + 1;
                    if (i6 >= iMin || (cCharAt = charSequence.charAt(i5 + 1)) < '0' || cCharAt > '9') {
                        boolean z5 = z3;
                        z2 = z4;
                        z = z5;
                        break;
                    }
                    iMin = Math.min(iMin + 1, charSequence.length() - i);
                    i4 = i6;
                    boolean z6 = z3;
                    z2 = z4;
                    z = z6;
                } else {
                    if (cCharAt2 < '0' || cCharAt2 > '9') {
                        break;
                    }
                    i4++;
                }
            }
            if (i4 == 0) {
                return ~i;
            }
            if (i4 < 9) {
                int i7 = (z || z2) ? i + 1 : i;
                int i8 = i7 + 1;
                try {
                    int iCharAt = charSequence.charAt(i7) - '0';
                    i2 = i + i4;
                    while (i8 < i2) {
                        int i9 = (iCharAt << 3) + (iCharAt << 1);
                        int i10 = i8 + 1;
                        int iCharAt2 = (i9 + charSequence.charAt(i8)) - 48;
                        i8 = i10;
                        iCharAt = iCharAt2;
                    }
                    i3 = z ? -iCharAt : iCharAt;
                } catch (StringIndexOutOfBoundsException unused) {
                    return ~i;
                }
            } else if (z2) {
                i2 = i + i4;
                i3 = Integer.parseInt(charSequence.subSequence(i + 1, i2).toString());
            } else {
                int i11 = i + i4;
                i3 = Integer.parseInt(charSequence.subSequence(i, i11).toString());
                i2 = i11;
            }
            pq5Var.v(this.f25331a, i3);
            return i2;
        }
    }

    public static class g extends f {
        public final int d;

        public g(DateTimeFieldType dateTimeFieldType, int i, boolean z, int i2) {
            super(dateTimeFieldType, i, z);
            this.d = i2;
        }

        @Override // defpackage.dfd
        public void b(Appendable appendable, long j, bw3 bw3Var, int i, DateTimeZone dateTimeZone, Locale locale) throws IOException {
            try {
                d1a.a(appendable, this.f25331a.getField(bw3Var).get(j), this.d);
            } catch (RuntimeException unused) {
                lq5.Q(appendable, this.d);
            }
        }

        @Override // defpackage.dfd
        public int d() {
            return this.f25332b;
        }

        @Override // defpackage.dfd
        public void e(Appendable appendable, ogj ogjVar, Locale locale) throws IOException {
            if (!ogjVar.isSupported(this.f25331a)) {
                lq5.Q(appendable, this.d);
                return;
            }
            try {
                d1a.a(appendable, ogjVar.get(this.f25331a), this.d);
            } catch (RuntimeException unused) {
                lq5.Q(appendable, this.d);
            }
        }
    }

    public static class h implements dfd, bfd {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f25333a;

        public h(String str) {
            this.f25333a = str;
        }

        @Override // defpackage.bfd
        public int a() {
            return this.f25333a.length();
        }

        @Override // defpackage.dfd
        public void b(Appendable appendable, long j, bw3 bw3Var, int i, DateTimeZone dateTimeZone, Locale locale) throws IOException {
            appendable.append(this.f25333a);
        }

        @Override // defpackage.bfd
        public int c(pq5 pq5Var, CharSequence charSequence, int i) {
            return lq5.Z(charSequence, i, this.f25333a) ? i + this.f25333a.length() : ~i;
        }

        @Override // defpackage.dfd
        public int d() {
            return this.f25333a.length();
        }

        @Override // defpackage.dfd
        public void e(Appendable appendable, ogj ogjVar, Locale locale) throws IOException {
            appendable.append(this.f25333a);
        }
    }

    public static class i implements dfd, bfd {
        public static Map<Locale, Map<DateTimeFieldType, Object[]>> c = new ConcurrentHashMap();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final DateTimeFieldType f25334a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f25335b;

        public i(DateTimeFieldType dateTimeFieldType, boolean z) {
            this.f25334a = dateTimeFieldType;
            this.f25335b = z;
        }

        @Override // defpackage.bfd
        public int a() {
            return d();
        }

        @Override // defpackage.dfd
        public void b(Appendable appendable, long j, bw3 bw3Var, int i, DateTimeZone dateTimeZone, Locale locale) throws IOException {
            try {
                appendable.append(f(j, bw3Var, locale));
            } catch (RuntimeException unused) {
                appendable.append(Utf8.REPLACEMENT_CHARACTER);
            }
        }

        @Override // defpackage.bfd
        public int c(pq5 pq5Var, CharSequence charSequence, int i) {
            int iIntValue;
            Map concurrentHashMap;
            Locale localeO = pq5Var.o();
            Map<DateTimeFieldType, Object[]> concurrentHashMap2 = c.get(localeO);
            if (concurrentHashMap2 == null) {
                concurrentHashMap2 = new ConcurrentHashMap<>();
                c.put(localeO, concurrentHashMap2);
            }
            Object[] objArr = concurrentHashMap2.get(this.f25334a);
            if (objArr == null) {
                concurrentHashMap = new ConcurrentHashMap(32);
                MutableDateTime.Property property = new MutableDateTime(0L, DateTimeZone.UTC).property(this.f25334a);
                int minimumValueOverall = property.getMinimumValueOverall();
                int maximumValueOverall = property.getMaximumValueOverall();
                if (maximumValueOverall - minimumValueOverall > 32) {
                    return ~i;
                }
                iIntValue = property.getMaximumTextLength(localeO);
                while (minimumValueOverall <= maximumValueOverall) {
                    property.set(minimumValueOverall);
                    String asShortText = property.getAsShortText(localeO);
                    Boolean bool = Boolean.TRUE;
                    concurrentHashMap.put(asShortText, bool);
                    concurrentHashMap.put(property.getAsShortText(localeO).toLowerCase(localeO), bool);
                    concurrentHashMap.put(property.getAsShortText(localeO).toUpperCase(localeO), bool);
                    concurrentHashMap.put(property.getAsText(localeO), bool);
                    concurrentHashMap.put(property.getAsText(localeO).toLowerCase(localeO), bool);
                    concurrentHashMap.put(property.getAsText(localeO).toUpperCase(localeO), bool);
                    minimumValueOverall++;
                }
                if ("en".equals(localeO.getLanguage()) && this.f25334a == DateTimeFieldType.era()) {
                    Boolean bool2 = Boolean.TRUE;
                    concurrentHashMap.put("BCE", bool2);
                    concurrentHashMap.put("bce", bool2);
                    concurrentHashMap.put("CE", bool2);
                    concurrentHashMap.put("ce", bool2);
                    iIntValue = 3;
                }
                concurrentHashMap2.put(this.f25334a, new Object[]{concurrentHashMap, Integer.valueOf(iIntValue)});
            } else {
                Map map = (Map) objArr[0];
                iIntValue = ((Integer) objArr[1]).intValue();
                concurrentHashMap = map;
            }
            for (int iMin = Math.min(charSequence.length(), iIntValue + i); iMin > i; iMin--) {
                String string = charSequence.subSequence(i, iMin).toString();
                if (concurrentHashMap.containsKey(string)) {
                    pq5Var.w(this.f25334a, string, localeO);
                    return iMin;
                }
            }
            return ~i;
        }

        @Override // defpackage.dfd
        public int d() {
            return this.f25335b ? 6 : 20;
        }

        @Override // defpackage.dfd
        public void e(Appendable appendable, ogj ogjVar, Locale locale) throws IOException {
            try {
                appendable.append(g(ogjVar, locale));
            } catch (RuntimeException unused) {
                appendable.append(Utf8.REPLACEMENT_CHARACTER);
            }
        }

        public final String f(long j, bw3 bw3Var, Locale locale) {
            gq5 field = this.f25334a.getField(bw3Var);
            return this.f25335b ? field.getAsShortText(j, locale) : field.getAsText(j, locale);
        }

        public final String g(ogj ogjVar, Locale locale) {
            if (!ogjVar.isSupported(this.f25334a)) {
                return "�";
            }
            gq5 field = this.f25334a.getField(ogjVar.getChronology());
            return this.f25335b ? field.getAsShortText(ogjVar, locale) : field.getAsText(ogjVar, locale);
        }
    }

    public enum j implements dfd, bfd {
        INSTANCE;


        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final List<String> f25337b;
        public static final Map<String, List<String>> c;
        public static final List<String> d = new ArrayList();
        public static final int e;
        public static final int f;

        static {
            ArrayList<String> arrayList = new ArrayList(DateTimeZone.getAvailableIDs());
            f25337b = arrayList;
            Collections.sort(arrayList);
            c = new HashMap();
            int iMax = 0;
            int iMax2 = 0;
            for (String str : arrayList) {
                int iIndexOf = str.indexOf(47);
                if (iIndexOf >= 0) {
                    iIndexOf = iIndexOf < str.length() ? iIndexOf + 1 : iIndexOf;
                    iMax2 = Math.max(iMax2, iIndexOf);
                    String strSubstring = str.substring(0, iIndexOf + 1);
                    String strSubstring2 = str.substring(iIndexOf);
                    Map<String, List<String>> map = c;
                    if (!map.containsKey(strSubstring)) {
                        map.put(strSubstring, new ArrayList());
                    }
                    map.get(strSubstring).add(strSubstring2);
                } else {
                    d.add(str);
                }
                iMax = Math.max(iMax, str.length());
            }
            e = iMax;
            f = iMax2;
        }

        @Override // defpackage.bfd
        public int a() {
            return e;
        }

        @Override // defpackage.dfd
        public void b(Appendable appendable, long j, bw3 bw3Var, int i, DateTimeZone dateTimeZone, Locale locale) throws IOException {
            appendable.append(dateTimeZone != null ? dateTimeZone.getID() : "");
        }

        @Override // defpackage.bfd
        public int c(pq5 pq5Var, CharSequence charSequence, int i) {
            String string;
            int length;
            List<String> list = d;
            int length2 = charSequence.length();
            int iMin = Math.min(length2, f + i);
            int i2 = i;
            while (true) {
                if (i2 >= iMin) {
                    string = "";
                    length = i;
                    break;
                }
                if (charSequence.charAt(i2) == '/') {
                    int i3 = i2 + 1;
                    string = charSequence.subSequence(i, i3).toString();
                    length = string.length() + i;
                    list = c.get(i2 < length2 - 1 ? string + charSequence.charAt(i3) : string);
                    if (list != null) {
                        break;
                    }
                    return ~i;
                }
                i2++;
            }
            String str = null;
            for (int i4 = 0; i4 < list.size(); i4++) {
                String str2 = list.get(i4);
                if (lq5.Y(charSequence, length, str2) && (str == null || str2.length() > str.length())) {
                    str = str2;
                }
            }
            if (str == null) {
                return ~i;
            }
            pq5Var.z(DateTimeZone.forID(string + str));
            return length + str.length();
        }

        @Override // defpackage.dfd
        public int d() {
            return e;
        }

        @Override // defpackage.dfd
        public void e(Appendable appendable, ogj ogjVar, Locale locale) throws IOException {
        }
    }

    public static class k implements dfd, bfd {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Map<String, DateTimeZone> f25338a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f25339b;

        public k(int i, Map<String, DateTimeZone> map) {
            this.f25339b = i;
            this.f25338a = map;
        }

        @Override // defpackage.bfd
        public int a() {
            return this.f25339b == 1 ? 4 : 20;
        }

        @Override // defpackage.dfd
        public void b(Appendable appendable, long j, bw3 bw3Var, int i, DateTimeZone dateTimeZone, Locale locale) throws IOException {
            appendable.append(f(j - ((long) i), dateTimeZone, locale));
        }

        @Override // defpackage.bfd
        public int c(pq5 pq5Var, CharSequence charSequence, int i) {
            Map<String, DateTimeZone> mapE = this.f25338a;
            if (mapE == null) {
                mapE = wq5.e();
            }
            String str = null;
            for (String str2 : mapE.keySet()) {
                if (lq5.Y(charSequence, i, str2) && (str == null || str2.length() > str.length())) {
                    str = str2;
                }
            }
            if (str == null) {
                return ~i;
            }
            pq5Var.z(mapE.get(str));
            return i + str.length();
        }

        @Override // defpackage.dfd
        public int d() {
            return this.f25339b == 1 ? 4 : 20;
        }

        @Override // defpackage.dfd
        public void e(Appendable appendable, ogj ogjVar, Locale locale) throws IOException {
        }

        public final String f(long j, DateTimeZone dateTimeZone, Locale locale) {
            if (dateTimeZone == null) {
                return "";
            }
            int i = this.f25339b;
            if (i != 0) {
                return i != 1 ? "" : dateTimeZone.getShortName(j, locale);
            }
            return dateTimeZone.getName(j, locale);
        }
    }

    public static class l implements dfd, bfd {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f25340a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f25341b;
        public final boolean c;
        public final int d;
        public final int e;

        public l(String str, String str2, boolean z, int i, int i2) {
            this.f25340a = str;
            this.f25341b = str2;
            this.c = z;
            if (i <= 0 || i2 < i) {
                throw new IllegalArgumentException();
            }
            if (i > 4) {
                i = 4;
                i2 = 4;
            }
            this.d = i;
            this.e = i2;
        }

        @Override // defpackage.bfd
        public int a() {
            return d();
        }

        @Override // defpackage.dfd
        public void b(Appendable appendable, long j, bw3 bw3Var, int i, DateTimeZone dateTimeZone, Locale locale) throws IOException {
            String str;
            if (dateTimeZone == null) {
                return;
            }
            if (i == 0 && (str = this.f25340a) != null) {
                appendable.append(str);
                return;
            }
            if (i >= 0) {
                appendable.append('+');
            } else {
                appendable.append('-');
                i = -i;
            }
            int i2 = i / 3600000;
            d1a.a(appendable, i2, 2);
            if (this.e == 1) {
                return;
            }
            int i3 = i - (i2 * 3600000);
            if (i3 != 0 || this.d > 1) {
                int i4 = i3 / 60000;
                if (this.c) {
                    appendable.append(AbstractJsonLexerKt.COLON);
                }
                d1a.a(appendable, i4, 2);
                if (this.e == 2) {
                    return;
                }
                int i5 = i3 - (i4 * 60000);
                if (i5 != 0 || this.d > 2) {
                    int i6 = i5 / 1000;
                    if (this.c) {
                        appendable.append(AbstractJsonLexerKt.COLON);
                    }
                    d1a.a(appendable, i6, 2);
                    if (this.e == 3) {
                        return;
                    }
                    int i7 = i5 - (i6 * 1000);
                    if (i7 != 0 || this.d > 3) {
                        if (this.c) {
                            appendable.append('.');
                        }
                        d1a.a(appendable, i7, 3);
                    }
                }
            }
        }

        /* JADX WARN: Code duplicated, block: B:60:0x00ad  */
        /* JADX WARN: Code duplicated, block: B:82:0x00e7 A[PHI: r0 r6
          0x00e7: PHI (r0v4 int) = (r0v3 int), (r0v5 int), (r0v3 int) binds: [B:75:0x00d2, B:93:0x0105, B:81:0x00e5] A[DONT_GENERATE, DONT_INLINE]
          0x00e7: PHI (r6v8 int) = (r6v7 int), (r6v9 int), (r6v7 int) binds: [B:75:0x00d2, B:93:0x0105, B:81:0x00e5] A[DONT_GENERATE, DONT_INLINE]] */
        @Override // defpackage.bfd
        public int c(pq5 pq5Var, CharSequence charSequence, int i) {
            boolean z;
            int i2;
            int i3;
            int i4;
            char cCharAt;
            int length = charSequence.length() - i;
            String str = this.f25341b;
            boolean z2 = false;
            if (str != null) {
                if (str.length() == 0) {
                    if (length <= 0 || ((cCharAt = charSequence.charAt(i)) != '-' && cCharAt != '+')) {
                        pq5Var.y(0);
                        return i;
                    }
                } else if (lq5.Z(charSequence, i, this.f25341b)) {
                    pq5Var.y(0);
                    return i + this.f25341b.length();
                }
            }
            if (length <= 1) {
                return ~i;
            }
            char cCharAt2 = charSequence.charAt(i);
            if (cCharAt2 == '-') {
                z = true;
            } else {
                if (cCharAt2 != '+') {
                    return ~i;
                }
                z = false;
            }
            int i5 = i + 1;
            if (f(charSequence, i5, 2) >= 2 && (i2 = d1a.i(charSequence, i5)) <= 23) {
                int iCharAt = i2 * 3600000;
                int i6 = length - 3;
                int i7 = i + 3;
                if (i6 > 0) {
                    char cCharAt3 = charSequence.charAt(i7);
                    if (cCharAt3 == ':') {
                        i6 = length - 4;
                        i7 = i + 4;
                        z2 = true;
                    } else if (cCharAt3 >= '0' && cCharAt3 <= '9') {
                    }
                    int iF = f(charSequence, i7, 2);
                    if (iF != 0 || z2) {
                        if (iF >= 2 && (i3 = d1a.i(charSequence, i7)) <= 59) {
                            iCharAt += i3 * 60000;
                            int i8 = i6 - 2;
                            int i9 = i7 + 2;
                            if (i8 > 0) {
                                if (!z2) {
                                    i7 = i9;
                                } else if (charSequence.charAt(i9) != ':') {
                                    i7 = i9;
                                } else {
                                    i8 = i6 - 3;
                                    i7 += 3;
                                }
                                int iF2 = f(charSequence, i7, 2);
                                if (iF2 != 0 || z2) {
                                    if (iF2 >= 2 && (i4 = d1a.i(charSequence, i7)) <= 59) {
                                        iCharAt += i4 * 1000;
                                        int i10 = i7 + 2;
                                        if (i8 - 2 > 0) {
                                            if (!z2) {
                                                i7 = i10;
                                            } else if (charSequence.charAt(i10) == '.' || charSequence.charAt(i10) == ',') {
                                                i7 += 3;
                                            } else {
                                                i7 = i10;
                                            }
                                            int iF3 = f(charSequence, i7, 3);
                                            if (iF3 != 0 || z2) {
                                                if (iF3 < 1) {
                                                    return ~i7;
                                                }
                                                i10 = i7 + 1;
                                                iCharAt += (charSequence.charAt(i7) - '0') * 100;
                                                if (iF3 > 1) {
                                                    int i11 = i7 + 2;
                                                    iCharAt += (charSequence.charAt(i10) - '0') * 10;
                                                    if (iF3 > 2) {
                                                        i7 += 3;
                                                        iCharAt += charSequence.charAt(i11) - '0';
                                                    } else {
                                                        i7 = i11;
                                                    }
                                                } else {
                                                    i7 = i10;
                                                }
                                            }
                                        } else {
                                            i7 = i10;
                                        }
                                    }
                                    return ~i7;
                                }
                            } else {
                                i7 = i9;
                            }
                        }
                        return ~i7;
                    }
                }
                if (z) {
                    iCharAt = -iCharAt;
                }
                pq5Var.y(Integer.valueOf(iCharAt));
                return i7;
            }
            return ~i5;
        }

        @Override // defpackage.dfd
        public int d() {
            int i = this.d;
            int i2 = (i + 1) << 1;
            if (this.c) {
                i2 += i - 1;
            }
            String str = this.f25340a;
            return (str == null || str.length() <= i2) ? i2 : this.f25340a.length();
        }

        @Override // defpackage.dfd
        public void e(Appendable appendable, ogj ogjVar, Locale locale) throws IOException {
        }

        public final int f(CharSequence charSequence, int i, int i2) {
            int i3 = 0;
            for (int iMin = Math.min(charSequence.length() - i, i2); iMin > 0; iMin--) {
                char cCharAt = charSequence.charAt(i + i3);
                if (cCharAt < '0' || cCharAt > '9') {
                    break;
                }
                i3++;
            }
            return i3;
        }
    }

    public static class m implements dfd, bfd {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final DateTimeFieldType f25342a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f25343b;
        public final boolean c;

        public m(DateTimeFieldType dateTimeFieldType, int i, boolean z) {
            this.f25342a = dateTimeFieldType;
            this.f25343b = i;
            this.c = z;
        }

        @Override // defpackage.bfd
        public int a() {
            return this.c ? 4 : 2;
        }

        @Override // defpackage.dfd
        public void b(Appendable appendable, long j, bw3 bw3Var, int i, DateTimeZone dateTimeZone, Locale locale) throws IOException {
            int iF = f(j, bw3Var);
            if (iF >= 0) {
                d1a.a(appendable, iF, 2);
            } else {
                appendable.append(Utf8.REPLACEMENT_CHARACTER);
                appendable.append(Utf8.REPLACEMENT_CHARACTER);
            }
        }

        @Override // defpackage.bfd
        public int c(pq5 pq5Var, CharSequence charSequence, int i) {
            int i2;
            int i3;
            int length = charSequence.length() - i;
            if (this.c) {
                int i4 = 0;
                boolean z = false;
                boolean z2 = false;
                while (i4 < length) {
                    char cCharAt = charSequence.charAt(i + i4);
                    if (i4 == 0 && (cCharAt == '-' || cCharAt == '+')) {
                        z2 = cCharAt == '-';
                        if (z2) {
                            i4++;
                        } else {
                            i++;
                            length--;
                        }
                        z = true;
                    } else {
                        if (cCharAt < '0' || cCharAt > '9') {
                            break;
                        }
                        i4++;
                    }
                }
                if (i4 == 0) {
                    return ~i;
                }
                if (z || i4 != 2) {
                    if (i4 >= 9) {
                        i2 = i4 + i;
                        i3 = Integer.parseInt(charSequence.subSequence(i, i2).toString());
                    } else {
                        int i5 = z2 ? i + 1 : i;
                        int i6 = i5 + 1;
                        try {
                            int iCharAt = charSequence.charAt(i5) - '0';
                            i2 = i4 + i;
                            while (i6 < i2) {
                                int iCharAt2 = (((iCharAt << 3) + (iCharAt << 1)) + charSequence.charAt(i6)) - 48;
                                i6++;
                                iCharAt = iCharAt2;
                            }
                            i3 = z2 ? -iCharAt : iCharAt;
                        } catch (StringIndexOutOfBoundsException unused) {
                            return ~i;
                        }
                    }
                    pq5Var.v(this.f25342a, i3);
                    return i2;
                }
            } else if (Math.min(2, length) < 2) {
                return ~i;
            }
            char cCharAt2 = charSequence.charAt(i);
            if (cCharAt2 < '0' || cCharAt2 > '9') {
                return ~i;
            }
            int i7 = cCharAt2 - '0';
            char cCharAt3 = charSequence.charAt(i + 1);
            if (cCharAt3 < '0' || cCharAt3 > '9') {
                return ~i;
            }
            int i8 = (((i7 << 3) + (i7 << 1)) + cCharAt3) - 48;
            int iIntValue = this.f25343b;
            if (pq5Var.q() != null) {
                iIntValue = pq5Var.q().intValue();
            }
            int i9 = iIntValue - 50;
            int i10 = i9 >= 0 ? i9 % 100 : ((iIntValue - 49) % 100) + 99;
            pq5Var.v(this.f25342a, i8 + ((i9 + (i8 < i10 ? 100 : 0)) - i10));
            return i + 2;
        }

        @Override // defpackage.dfd
        public int d() {
            return 2;
        }

        @Override // defpackage.dfd
        public void e(Appendable appendable, ogj ogjVar, Locale locale) throws IOException {
            int iG = g(ogjVar);
            if (iG >= 0) {
                d1a.a(appendable, iG, 2);
            } else {
                appendable.append(Utf8.REPLACEMENT_CHARACTER);
                appendable.append(Utf8.REPLACEMENT_CHARACTER);
            }
        }

        public final int f(long j, bw3 bw3Var) {
            try {
                int i = this.f25342a.getField(bw3Var).get(j);
                if (i < 0) {
                    i = -i;
                }
                return i % 100;
            } catch (RuntimeException unused) {
                return -1;
            }
        }

        public final int g(ogj ogjVar) {
            if (!ogjVar.isSupported(this.f25342a)) {
                return -1;
            }
            try {
                int i = ogjVar.get(this.f25342a);
                if (i < 0) {
                    i = -i;
                }
                return i % 100;
            } catch (RuntimeException unused) {
                return -1;
            }
        }
    }

    public static class n extends f {
        public n(DateTimeFieldType dateTimeFieldType, int i, boolean z) {
            super(dateTimeFieldType, i, z);
        }

        @Override // defpackage.dfd
        public void b(Appendable appendable, long j, bw3 bw3Var, int i, DateTimeZone dateTimeZone, Locale locale) throws IOException {
            try {
                d1a.c(appendable, this.f25331a.getField(bw3Var).get(j));
            } catch (RuntimeException unused) {
                appendable.append(Utf8.REPLACEMENT_CHARACTER);
            }
        }

        @Override // defpackage.dfd
        public int d() {
            return this.f25332b;
        }

        @Override // defpackage.dfd
        public void e(Appendable appendable, ogj ogjVar, Locale locale) throws IOException {
            if (!ogjVar.isSupported(this.f25331a)) {
                appendable.append(Utf8.REPLACEMENT_CHARACTER);
                return;
            }
            try {
                d1a.c(appendable, ogjVar.get(this.f25331a));
            } catch (RuntimeException unused) {
                appendable.append(Utf8.REPLACEMENT_CHARACTER);
            }
        }
    }

    public static void Q(Appendable appendable, int i2) throws IOException {
        while (true) {
            i2--;
            if (i2 < 0) {
                return;
            } else {
                appendable.append(Utf8.REPLACEMENT_CHARACTER);
            }
        }
    }

    public static boolean Y(CharSequence charSequence, int i2, String str) {
        int length = str.length();
        if (charSequence.length() - i2 < length) {
            return false;
        }
        for (int i3 = 0; i3 < length; i3++) {
            if (charSequence.charAt(i2 + i3) != str.charAt(i3)) {
                return false;
            }
        }
        return true;
    }

    public static boolean Z(CharSequence charSequence, int i2, String str) {
        char upperCase;
        char upperCase2;
        int length = str.length();
        if (charSequence.length() - i2 < length) {
            return false;
        }
        for (int i3 = 0; i3 < length; i3++) {
            char cCharAt = charSequence.charAt(i2 + i3);
            char cCharAt2 = str.charAt(i3);
            if (cCharAt != cCharAt2 && (upperCase = Character.toUpperCase(cCharAt)) != (upperCase2 = Character.toUpperCase(cCharAt2)) && Character.toLowerCase(upperCase) != Character.toLowerCase(upperCase2)) {
                return false;
            }
        }
        return true;
    }

    public lq5 A(int i2) {
        return n(DateTimeFieldType.minuteOfHour(), i2, 2);
    }

    public lq5 B(int i2) {
        return n(DateTimeFieldType.monthOfYear(), i2, 2);
    }

    public lq5 C() {
        return G(DateTimeFieldType.monthOfYear());
    }

    public lq5 D() {
        return I(DateTimeFieldType.monthOfYear());
    }

    public lq5 E(oq5 oq5Var) {
        W(oq5Var);
        return d(null, new e(new bfd[]{qq5.d(oq5Var), null}));
    }

    public lq5 F(int i2) {
        return n(DateTimeFieldType.secondOfMinute(), i2, 2);
    }

    public lq5 G(DateTimeFieldType dateTimeFieldType) {
        if (dateTimeFieldType != null) {
            return e(new i(dateTimeFieldType, true));
        }
        throw new IllegalArgumentException("Field type must not be null");
    }

    public lq5 H(DateTimeFieldType dateTimeFieldType, int i2, int i3) {
        if (dateTimeFieldType == null) {
            throw new IllegalArgumentException("Field type must not be null");
        }
        if (i3 < i2) {
            i3 = i2;
        }
        if (i2 < 0 || i3 <= 0) {
            throw new IllegalArgumentException();
        }
        return i2 <= 1 ? e(new n(dateTimeFieldType, i3, true)) : e(new g(dateTimeFieldType, i3, true, i2));
    }

    public lq5 I(DateTimeFieldType dateTimeFieldType) {
        if (dateTimeFieldType != null) {
            return e(new i(dateTimeFieldType, false));
        }
        throw new IllegalArgumentException("Field type must not be null");
    }

    public lq5 J() {
        j jVar = j.INSTANCE;
        return d(jVar, jVar);
    }

    public lq5 K() {
        return d(new k(0, null), null);
    }

    public lq5 L(String str, String str2, boolean z, int i2, int i3) {
        return e(new l(str, str2, z, i2, i3));
    }

    public lq5 M(String str, boolean z, int i2, int i3) {
        return e(new l(str, str, z, i2, i3));
    }

    public lq5 N(Map<String, DateTimeZone> map) {
        k kVar = new k(1, map);
        return d(kVar, kVar);
    }

    public lq5 O(int i2, boolean z) {
        return e(new m(DateTimeFieldType.weekyear(), i2, z));
    }

    public lq5 P(int i2, boolean z) {
        return e(new m(DateTimeFieldType.year(), i2, z));
    }

    public lq5 R(int i2) {
        return n(DateTimeFieldType.weekOfWeekyear(), i2, 2);
    }

    public lq5 S(int i2, int i3) {
        return H(DateTimeFieldType.weekyear(), i2, i3);
    }

    public lq5 T(int i2, int i3) {
        return H(DateTimeFieldType.year(), i2, i3);
    }

    public lq5 U(int i2, int i3) {
        return n(DateTimeFieldType.yearOfEra(), i2, i3);
    }

    public boolean V() {
        return b0(a0());
    }

    public final void W(oq5 oq5Var) {
        if (oq5Var == null) {
            throw new IllegalArgumentException("No parser supplied");
        }
    }

    public final void X(sq5 sq5Var) {
        if (sq5Var == null) {
            throw new IllegalArgumentException("No printer supplied");
        }
    }

    public lq5 a(jq5 jq5Var) {
        if (jq5Var != null) {
            return d(jq5Var.d(), jq5Var.c());
        }
        throw new IllegalArgumentException("No formatter supplied");
    }

    public final Object a0() {
        Object bVar = this.f25323b;
        if (bVar == null) {
            if (this.f25322a.size() == 2) {
                Object obj = this.f25322a.get(0);
                Object obj2 = this.f25322a.get(1);
                if (obj == null) {
                    bVar = obj2;
                } else if (obj == obj2 || obj2 == null) {
                    bVar = obj;
                }
            }
            if (bVar == null) {
                bVar = new b(this.f25322a);
            }
            this.f25323b = bVar;
        }
        return bVar;
    }

    public lq5 b(oq5 oq5Var) {
        W(oq5Var);
        return d(null, qq5.d(oq5Var));
    }

    public final boolean b0(Object obj) {
        return d0(obj) || c0(obj);
    }

    public lq5 c(sq5 sq5Var, oq5[] oq5VarArr) {
        if (sq5Var != null) {
            X(sq5Var);
        }
        if (oq5VarArr == null) {
            throw new IllegalArgumentException("No parsers supplied");
        }
        int length = oq5VarArr.length;
        int i2 = 0;
        if (length == 1) {
            if (oq5VarArr[0] != null) {
                return d(tq5.a(sq5Var), qq5.d(oq5VarArr[0]));
            }
            throw new IllegalArgumentException("No parser supplied");
        }
        bfd[] bfdVarArr = new bfd[length];
        while (i2 < length - 1) {
            bfd bfdVarD = qq5.d(oq5VarArr[i2]);
            bfdVarArr[i2] = bfdVarD;
            if (bfdVarD == null) {
                throw new IllegalArgumentException("Incomplete parser array");
            }
            i2++;
        }
        bfdVarArr[i2] = qq5.d(oq5VarArr[i2]);
        return d(tq5.a(sq5Var), new e(bfdVarArr));
    }

    public final boolean c0(Object obj) {
        if (!(obj instanceof bfd)) {
            return false;
        }
        if (obj instanceof b) {
            return ((b) obj).h();
        }
        return true;
    }

    public final lq5 d(dfd dfdVar, bfd bfdVar) {
        this.f25323b = null;
        this.f25322a.add(dfdVar);
        this.f25322a.add(bfdVar);
        return this;
    }

    public final boolean d0(Object obj) {
        if (!(obj instanceof dfd)) {
            return false;
        }
        if (obj instanceof b) {
            return ((b) obj).i();
        }
        return true;
    }

    public final lq5 e(Object obj) {
        this.f25323b = null;
        this.f25322a.add(obj);
        this.f25322a.add(obj);
        return this;
    }

    public jq5 e0() {
        Object objA0 = a0();
        dfd dfdVar = d0(objA0) ? (dfd) objA0 : null;
        bfd bfdVar = c0(objA0) ? (bfd) objA0 : null;
        if (dfdVar == null && bfdVar == null) {
            throw new UnsupportedOperationException("Both printing and parsing not supported");
        }
        return new jq5(dfdVar, bfdVar);
    }

    public lq5 f(int i2, int i3) {
        return H(DateTimeFieldType.centuryOfEra(), i2, i3);
    }

    public oq5 f0() {
        Object objA0 = a0();
        if (c0(objA0)) {
            return cfd.d((bfd) objA0);
        }
        throw new UnsupportedOperationException("Parsing is not supported");
    }

    public lq5 g(int i2) {
        return n(DateTimeFieldType.clockhourOfDay(), i2, 2);
    }

    public lq5 h(int i2) {
        return n(DateTimeFieldType.clockhourOfHalfday(), i2, 2);
    }

    public lq5 i(int i2) {
        return n(DateTimeFieldType.dayOfMonth(), i2, 2);
    }

    public lq5 j(int i2) {
        return n(DateTimeFieldType.dayOfWeek(), i2, 1);
    }

    public lq5 k() {
        return G(DateTimeFieldType.dayOfWeek());
    }

    public lq5 l() {
        return I(DateTimeFieldType.dayOfWeek());
    }

    public lq5 m(int i2) {
        return n(DateTimeFieldType.dayOfYear(), i2, 3);
    }

    public lq5 n(DateTimeFieldType dateTimeFieldType, int i2, int i3) {
        if (dateTimeFieldType == null) {
            throw new IllegalArgumentException("Field type must not be null");
        }
        if (i3 < i2) {
            i3 = i2;
        }
        if (i2 < 0 || i3 <= 0) {
            throw new IllegalArgumentException();
        }
        return i2 <= 1 ? e(new n(dateTimeFieldType, i3, false)) : e(new g(dateTimeFieldType, i3, false, i2));
    }

    public lq5 o() {
        return I(DateTimeFieldType.era());
    }

    public lq5 p(DateTimeFieldType dateTimeFieldType, int i2) {
        if (dateTimeFieldType == null) {
            throw new IllegalArgumentException("Field type must not be null");
        }
        if (i2 > 0) {
            return e(new c(dateTimeFieldType, i2, false));
        }
        throw new IllegalArgumentException("Illegal number of digits: " + i2);
    }

    public lq5 q(DateTimeFieldType dateTimeFieldType, int i2, int i3) {
        if (dateTimeFieldType == null) {
            throw new IllegalArgumentException("Field type must not be null");
        }
        if (i3 < i2) {
            i3 = i2;
        }
        if (i2 < 0 || i3 <= 0) {
            throw new IllegalArgumentException();
        }
        return e(new d(dateTimeFieldType, i2, i3));
    }

    public lq5 r(int i2, int i3) {
        return q(DateTimeFieldType.hourOfDay(), i2, i3);
    }

    public lq5 s(int i2, int i3) {
        return q(DateTimeFieldType.minuteOfDay(), i2, i3);
    }

    public lq5 t(int i2, int i3) {
        return q(DateTimeFieldType.secondOfDay(), i2, i3);
    }

    public lq5 u() {
        return I(DateTimeFieldType.halfdayOfDay());
    }

    public lq5 v(int i2) {
        return n(DateTimeFieldType.hourOfDay(), i2, 2);
    }

    public lq5 w(int i2) {
        return n(DateTimeFieldType.hourOfHalfday(), i2, 2);
    }

    public lq5 x(char c2) {
        return e(new a(c2));
    }

    public lq5 y(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Literal must not be null");
        }
        int length = str.length();
        if (length != 0) {
            return length != 1 ? e(new h(str)) : e(new a(str.charAt(0)));
        }
        return this;
    }

    public lq5 z(int i2) {
        return n(DateTimeFieldType.millisOfSecond(), i2, 3);
    }
}
