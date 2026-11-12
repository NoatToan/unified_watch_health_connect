package com.huawei.hms.network.embedded;

import com.huawei.hms.network.okhttp.PublicSuffixDatabase;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.operation.ble.BleConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes34.dex */
public final class b7 {
    public static final Pattern j = Pattern.compile("(\\d{2,4})[^\\d]*");
    public static final Pattern k = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");
    public static final Pattern l = Pattern.compile("(\\d{1,2})[^\\d]*");
    public static final Pattern m = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14642a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f14643b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f14644c;
    public final String d;
    public final String e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;

    public String toString() {
        return a(false);
    }

    public String i() {
        return this.f14643b;
    }

    public int hashCode() {
        int iHashCode = this.f14642a.hashCode();
        int iHashCode2 = this.f14643b.hashCode();
        int iHashCode3 = this.d.hashCode();
        int iHashCode4 = this.e.hashCode();
        long j2 = this.f14644c;
        return ((((((((((((((((iHashCode + 527) * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + ((int) ((j2 >>> 32) ^ j2))) * 31) + (!this.f ? 1 : 0)) * 31) + (!this.g ? 1 : 0)) * 31) + (!this.h ? 1 : 0)) * 31) + (!this.i ? 1 : 0);
    }

    public boolean h() {
        return this.f;
    }

    public boolean g() {
        return this.h;
    }

    public String f() {
        return this.e;
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof b7)) {
            return false;
        }
        b7 b7Var = (b7) obj;
        return b7Var.f14642a.equals(this.f14642a) && b7Var.f14643b.equals(this.f14643b) && b7Var.d.equals(this.d) && b7Var.e.equals(this.e) && b7Var.f14644c == this.f14644c && b7Var.f == this.f && b7Var.g == this.g && b7Var.h == this.h && b7Var.i == this.i;
    }

    public String e() {
        return this.f14642a;
    }

    public boolean d() {
        return this.g;
    }

    public boolean c() {
        return this.i;
    }

    public long b() {
        return this.f14644c;
    }

    public boolean a(m7 m7Var) {
        if ((this.i ? m7Var.h().equals(this.d) : a(m7Var.h(), this.d)) && b(m7Var, this.e)) {
            return !this.f || m7Var.i();
        }
        return false;
    }

    public String a(boolean z) {
        String strA;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f14642a);
        sb.append('=');
        sb.append(this.f14643b);
        if (this.h) {
            if (this.f14644c == Long.MIN_VALUE) {
                strA = "; max-age=0";
            } else {
                sb.append("; expires=");
                strA = h9.a(new Date(this.f14644c));
            }
            sb.append(strA);
        }
        if (!this.i) {
            sb.append("; domain=");
            if (z) {
                sb.append(".");
            }
            sb.append(this.d);
        }
        sb.append("; path=");
        sb.append(this.e);
        if (this.f) {
            sb.append("; secure");
        }
        if (this.g) {
            sb.append("; httponly");
        }
        return sb.toString();
    }

    public String a() {
        return this.d;
    }

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public String f14645a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public String f14646b;

        @Nullable
        public String d;
        public boolean f;
        public boolean g;
        public boolean h;
        public boolean i;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f14647c = 253402300799999L;
        public String e = "/";

        public a e(String str) {
            if (str == null) {
                throw new NullPointerException("value == null");
            }
            if (!str.trim().equals(str)) {
                throw new IllegalArgumentException("value is not trimmed");
            }
            this.f14646b = str;
            return this;
        }

        public a d(String str) {
            if (!str.startsWith("/")) {
                throw new IllegalArgumentException("path must start with '/'");
            }
            this.e = str;
            return this;
        }

        public a c(String str) {
            if (str == null) {
                throw new NullPointerException("name == null");
            }
            if (!str.trim().equals(str)) {
                throw new IllegalArgumentException("name is not trimmed");
            }
            this.f14645a = str;
            return this;
        }

        public a c() {
            this.f = true;
            return this;
        }

        public a b(String str) {
            return a(str, true);
        }

        public a b() {
            this.g = true;
            return this;
        }

        public b7 a() {
            return new b7(this);
        }

        public a a(String str) {
            return a(str, false);
        }

        public a a(long j) {
            if (j <= 0) {
                j = Long.MIN_VALUE;
            }
            if (j > 253402300799999L) {
                j = 253402300799999L;
            }
            this.f14647c = j;
            this.h = true;
            return this;
        }

        private a a(String str, boolean z) {
            if (str == null) {
                throw new NullPointerException("domain == null");
            }
            String strA = f8.a(str);
            if (strA != null) {
                this.d = strA;
                this.i = z;
                return this;
            }
            throw new IllegalArgumentException("unexpected domain: " + str);
        }
    }

    public static boolean b(m7 m7Var, String str) {
        String strC = m7Var.c();
        if (strC.equals(str)) {
            return true;
        }
        if (strC.startsWith(str)) {
            return str.endsWith("/") || strC.charAt(str.length()) == '/';
        }
        return false;
    }

    public static long b(String str) {
        try {
            long j2 = Long.parseLong(str);
            if (j2 <= 0) {
                return Long.MIN_VALUE;
            }
            return j2;
        } catch (NumberFormatException e) {
            if (str.matches("-?\\d+")) {
                return str.startsWith(Constants.LINK) ? Long.MIN_VALUE : Long.MAX_VALUE;
            }
            throw e;
        }
    }

    public static boolean a(String str, String str2) {
        if (str.equals(str2)) {
            return true;
        }
        return str.endsWith(str2) && str.charAt((str.length() - str2.length()) - 1) == '.' && !f8.e(str);
    }

    public static List<b7> a(m7 m7Var, j7 j7Var) {
        List<String> listD = j7Var.d("Set-Cookie");
        int size = listD.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            b7 b7VarA = a(m7Var, listD.get(i));
            if (b7VarA != null) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(b7VarA);
            }
        }
        return arrayList != null ? Collections.unmodifiableList(arrayList) : Collections.EMPTY_LIST;
    }

    public static String a(String str) {
        if (str.endsWith(".")) {
            throw new IllegalArgumentException();
        }
        if (str.startsWith(".")) {
            str = str.substring(1);
        }
        String strA = f8.a(str);
        if (strA != null) {
            return strA;
        }
        throw new IllegalArgumentException();
    }

    @Nullable
    public static b7 a(m7 m7Var, String str) {
        return a(System.currentTimeMillis(), m7Var, str);
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00c0 A[PHI: r0
      0x00c0: PHI (r0v14 long) = (r0v2 long), (r0v6 long) binds: [B:42:0x00be, B:53:0x00e1] A[DONT_GENERATE, DONT_INLINE]] */
    @Nullable
    public static b7 a(long j2, m7 m7Var, String str) {
        long j3;
        b7 b7Var;
        String str2;
        String str3;
        int length = str.length();
        char c2 = ';';
        int iA = f8.a(str, 0, length, ';');
        char c3 = '=';
        int iA2 = f8.a(str, 0, iA, '=');
        if (iA2 == iA) {
            return null;
        }
        String strD = f8.d(str, 0, iA2);
        if (strD.isEmpty() || f8.c(strD) != -1) {
            return null;
        }
        String strD2 = f8.d(str, iA2 + 1, iA);
        if (f8.c(strD2) != -1) {
            return null;
        }
        int i = iA + 1;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        String strA = null;
        boolean z4 = true;
        long jB = -1;
        long jA = 253402300799999L;
        String strSubstring = null;
        while (i < length) {
            int iA3 = f8.a(str, i, length, c2);
            int iA4 = f8.a(str, i, iA3, c3);
            String strD3 = f8.d(str, i, iA4);
            String strD4 = iA4 < iA3 ? f8.d(str, iA4 + 1, iA3) : "";
            if (strD3.equalsIgnoreCase("expires")) {
                try {
                    jA = a(strD4, 0, strD4.length());
                    z3 = true;
                } catch (NumberFormatException | IllegalArgumentException unused) {
                }
            } else if (strD3.equalsIgnoreCase("max-age")) {
                jB = b(strD4);
                z3 = true;
            } else if (strD3.equalsIgnoreCase("domain")) {
                strA = a(strD4);
                z4 = false;
            } else if (strD3.equalsIgnoreCase(BleConstants.KEY_PATH)) {
                strSubstring = strD4;
            } else if (strD3.equalsIgnoreCase("secure")) {
                z = true;
            } else if (strD3.equalsIgnoreCase("httponly")) {
                z2 = true;
            }
            i = iA3 + 1;
            c2 = ';';
            c3 = '=';
        }
        long j4 = Long.MIN_VALUE;
        if (jB == Long.MIN_VALUE) {
            j3 = j4;
        } else if (jB != -1) {
            j4 = j2 + (jB <= 9223372036854775L ? jB * 1000 : Long.MAX_VALUE);
            if (j4 < j2 || j4 > 253402300799999L) {
                j3 = 253402300799999L;
            } else {
                j3 = j4;
            }
        } else {
            j3 = jA;
        }
        String strH = m7Var.h();
        if (strA == null) {
            str2 = strH;
            b7Var = null;
        } else {
            if (!a(strH, strA)) {
                return null;
            }
            b7Var = null;
            str2 = strA;
        }
        if (strH.length() != str2.length() && PublicSuffixDatabase.a().a(str2) == null) {
            return b7Var;
        }
        if (strSubstring == null || !strSubstring.startsWith("/")) {
            String strC = m7Var.c();
            int iLastIndexOf = strC.lastIndexOf(47);
            if (iLastIndexOf != 0) {
                strSubstring = strC.substring(0, iLastIndexOf);
                str3 = strSubstring;
            } else {
                str3 = "/";
            }
        } else {
            str3 = strSubstring;
        }
        return new b7(strD, strD2, j3, str2, str3, z, z2, z4, z3);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0081  */
    public static long a(String str, int i, int i2) {
        int iA = a(str, i, i2, false);
        Matcher matcher = m.matcher(str);
        int i3 = -1;
        int i4 = -1;
        int i5 = -1;
        int iIndexOf = -1;
        int i6 = -1;
        int i7 = -1;
        while (iA < i2) {
            int iA2 = a(str, iA + 1, i2, true);
            matcher.region(iA, iA2);
            if (i4 == -1 && matcher.usePattern(m).matches()) {
                i4 = Integer.parseInt(matcher.group(1));
                i6 = Integer.parseInt(matcher.group(2));
                i7 = Integer.parseInt(matcher.group(3));
            } else if (i5 == -1 && matcher.usePattern(l).matches()) {
                i5 = Integer.parseInt(matcher.group(1));
            } else if (iIndexOf == -1) {
                Pattern pattern = k;
                if (matcher.usePattern(pattern).matches()) {
                    iIndexOf = pattern.pattern().indexOf(matcher.group(1).toLowerCase(Locale.US)) / 4;
                } else if (i3 != -1 && matcher.usePattern(j).matches()) {
                    i3 = Integer.parseInt(matcher.group(1));
                }
            } else if (i3 != -1) {
            }
            iA = a(str, iA2 + 1, i2, false);
        }
        if (i3 >= 70 && i3 <= 99) {
            i3 += 1900;
        }
        if (i3 >= 0 && i3 <= 69) {
            i3 += 2000;
        }
        if (i3 < 1601) {
            throw new IllegalArgumentException();
        }
        if (iIndexOf == -1) {
            throw new IllegalArgumentException();
        }
        if (i5 < 1 || i5 > 31) {
            throw new IllegalArgumentException();
        }
        if (i4 < 0 || i4 > 23) {
            throw new IllegalArgumentException();
        }
        if (i6 < 0 || i6 > 59) {
            throw new IllegalArgumentException();
        }
        if (i7 < 0 || i7 > 59) {
            throw new IllegalArgumentException();
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar(f8.i);
        gregorianCalendar.setLenient(false);
        gregorianCalendar.set(1, i3);
        gregorianCalendar.set(2, iIndexOf - 1);
        gregorianCalendar.set(5, i5);
        gregorianCalendar.set(11, i4);
        gregorianCalendar.set(12, i6);
        gregorianCalendar.set(13, i7);
        gregorianCalendar.set(14, 0);
        return gregorianCalendar.getTimeInMillis();
    }

    public static int a(String str, int i, int i2, boolean z) {
        while (i < i2) {
            char cCharAt = str.charAt(i);
            if (((cCharAt < ' ' && cCharAt != '\t') || cCharAt >= 127 || (cCharAt >= '0' && cCharAt <= '9') || ((cCharAt >= 'a' && cCharAt <= 'z') || ((cCharAt >= 'A' && cCharAt <= 'Z') || cCharAt == ':'))) == (!z)) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public b7(String str, String str2, long j2, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4) {
        this.f14642a = str;
        this.f14643b = str2;
        this.f14644c = j2;
        this.d = str3;
        this.e = str4;
        this.f = z;
        this.g = z2;
        this.i = z3;
        this.h = z4;
    }

    public b7(a aVar) {
        String str = aVar.f14645a;
        if (str == null) {
            throw new NullPointerException("builder.name == null");
        }
        String str2 = aVar.f14646b;
        if (str2 == null) {
            throw new NullPointerException("builder.value == null");
        }
        String str3 = aVar.d;
        if (str3 == null) {
            throw new NullPointerException("builder.domain == null");
        }
        this.f14642a = str;
        this.f14643b = str2;
        this.f14644c = aVar.f14647c;
        this.d = str3;
        this.e = aVar.e;
        this.f = aVar.f;
        this.g = aVar.g;
        this.h = aVar.h;
        this.i = aVar.i;
    }
}
