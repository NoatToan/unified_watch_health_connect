package okhttp3;

import com.google.common.net.HttpHeaders;
import com.xiaomi.mipush.sdk.Constants;
import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.annotation.Nullable;
import okhttp3.internal.Util;
import okhttp3.internal.http.HttpDate;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import org.cybergarage.http.HTTP;

/* JADX INFO: loaded from: classes23.dex */
public final class Cookie {
    private static final Pattern j = Pattern.compile("(\\d{2,4})[^\\d]*");
    private static final Pattern k = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");
    private static final Pattern l = Pattern.compile("(\\d{1,2})[^\\d]*");
    private static final Pattern m = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");
    private final String a;
    private final String b;
    private final long c;
    private final String d;
    private final String e;
    private final boolean f;
    private final boolean g;
    private final boolean h;
    private final boolean i;

    public static final class Builder {

        @Nullable
        public String a;

        @Nullable
        public String b;

        @Nullable
        public String d;
        public boolean f;
        public boolean g;
        public boolean h;
        public boolean i;
        public long c = HttpDate.MAX_DATE;
        public String e = FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE;

        private Builder a(String str, boolean z) {
            Objects.requireNonNull(str, "domain == null");
            String strCanonicalizeHost = Util.canonicalizeHost(str);
            if (strCanonicalizeHost != null) {
                this.d = strCanonicalizeHost;
                this.i = z;
                return this;
            }
            throw new IllegalArgumentException("unexpected domain: " + str);
        }

        public Cookie build() {
            return new Cookie(this);
        }

        public Builder domain(String str) {
            return a(str, false);
        }

        public Builder expiresAt(long j) {
            if (j <= 0) {
                j = Long.MIN_VALUE;
            }
            if (j > HttpDate.MAX_DATE) {
                j = 253402300799999L;
            }
            this.c = j;
            this.h = true;
            return this;
        }

        public Builder hostOnlyDomain(String str) {
            return a(str, true);
        }

        public Builder httpOnly() {
            this.g = true;
            return this;
        }

        public Builder name(String str) {
            Objects.requireNonNull(str, "name == null");
            if (!str.trim().equals(str)) {
                throw new IllegalArgumentException("name is not trimmed");
            }
            this.a = str;
            return this;
        }

        public Builder path(String str) {
            if (!str.startsWith(FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE)) {
                throw new IllegalArgumentException("path must start with '/'");
            }
            this.e = str;
            return this;
        }

        public Builder secure() {
            this.f = true;
            return this;
        }

        public Builder value(String str) {
            Objects.requireNonNull(str, "value == null");
            if (!str.trim().equals(str)) {
                throw new IllegalArgumentException("value is not trimmed");
            }
            this.b = str;
            return this;
        }
    }

    private Cookie(String str, String str2, long j2, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = str;
        this.b = str2;
        this.c = j2;
        this.d = str3;
        this.e = str4;
        this.f = z;
        this.g = z2;
        this.i = z3;
        this.h = z4;
    }

    private static int a(String str, int i, int i2, boolean z) {
        while (i < i2) {
            char cCharAt = str.charAt(i);
            if (((cCharAt < ' ' && cCharAt != '\t') || cCharAt >= 127 || (cCharAt >= '0' && cCharAt <= '9') || ((cCharAt >= 'a' && cCharAt <= 'z') || ((cCharAt >= 'A' && cCharAt <= 'Z') || cCharAt == ':'))) == (!z)) {
                return i;
            }
            i++;
        }
        return i2;
    }

    private static boolean b(String str, String str2) {
        if (str.equals(str2)) {
            return true;
        }
        return str.endsWith(str2) && str.charAt((str.length() - str2.length()) - 1) == '.' && !Util.verifyAsIpAddress(str);
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00c0 A[PHI: r0
      0x00c0: PHI (r0v15 long) = (r0v2 long), (r0v5 long) binds: [B:42:0x00be, B:53:0x00e1] A[DONT_GENERATE, DONT_INLINE]] */
    @Nullable
    public static Cookie c(long j2, HttpUrl httpUrl, String str) {
        long j3;
        Cookie cookie;
        String str2;
        String str3;
        int length = str.length();
        char c = ';';
        int iDelimiterOffset = Util.delimiterOffset(str, 0, length, ';');
        char c2 = com.alipay.sdk.m.n.a.h;
        int iDelimiterOffset2 = Util.delimiterOffset(str, 0, iDelimiterOffset, com.alipay.sdk.m.n.a.h);
        if (iDelimiterOffset2 == iDelimiterOffset) {
            return null;
        }
        String strTrimSubstring = Util.trimSubstring(str, 0, iDelimiterOffset2);
        if (strTrimSubstring.isEmpty() || Util.indexOfControlOrNonAscii(strTrimSubstring) != -1) {
            return null;
        }
        String strTrimSubstring2 = Util.trimSubstring(str, iDelimiterOffset2 + 1, iDelimiterOffset);
        if (Util.indexOfControlOrNonAscii(strTrimSubstring2) != -1) {
            return null;
        }
        int i = iDelimiterOffset + 1;
        String str4 = null;
        String strD = null;
        long jF = -1;
        long jE = 253402300799999L;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = true;
        boolean z4 = false;
        while (i < length) {
            int iDelimiterOffset3 = Util.delimiterOffset(str, i, length, c);
            int iDelimiterOffset4 = Util.delimiterOffset(str, i, iDelimiterOffset3, c2);
            String strTrimSubstring3 = Util.trimSubstring(str, i, iDelimiterOffset4);
            String strTrimSubstring4 = iDelimiterOffset4 < iDelimiterOffset3 ? Util.trimSubstring(str, iDelimiterOffset4 + 1, iDelimiterOffset3) : "";
            if (strTrimSubstring3.equalsIgnoreCase("expires")) {
                try {
                    jE = e(strTrimSubstring4, 0, strTrimSubstring4.length());
                    z4 = true;
                } catch (NumberFormatException | IllegalArgumentException unused) {
                }
            } else if (strTrimSubstring3.equalsIgnoreCase(HTTP.MAX_AGE)) {
                jF = f(strTrimSubstring4);
                z4 = true;
            } else if (strTrimSubstring3.equalsIgnoreCase("domain")) {
                strD = d(strTrimSubstring4);
                z3 = false;
            } else if (strTrimSubstring3.equalsIgnoreCase("path")) {
                str4 = strTrimSubstring4;
            } else if (strTrimSubstring3.equalsIgnoreCase("secure")) {
                z = true;
            } else if (strTrimSubstring3.equalsIgnoreCase("httponly")) {
                z2 = true;
            }
            i = iDelimiterOffset3 + 1;
            c = ';';
            c2 = com.alipay.sdk.m.n.a.h;
        }
        long j4 = Long.MIN_VALUE;
        if (jF == Long.MIN_VALUE) {
            j3 = j4;
        } else if (jF != -1) {
            j4 = j2 + (jF <= 9223372036854775L ? jF * 1000 : Long.MAX_VALUE);
            if (j4 < j2 || j4 > HttpDate.MAX_DATE) {
                j3 = 253402300799999L;
            } else {
                j3 = j4;
            }
        } else {
            j3 = jE;
        }
        String strHost = httpUrl.host();
        if (strD == null) {
            str2 = strHost;
            cookie = null;
        } else {
            if (!b(strHost, strD)) {
                return null;
            }
            cookie = null;
            str2 = strD;
        }
        if (strHost.length() != str2.length() && PublicSuffixDatabase.get().getEffectiveTldPlusOne(str2) == null) {
            return cookie;
        }
        String strSubstring = FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE;
        if (str4 == null || !str4.startsWith(FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE)) {
            String strEncodedPath = httpUrl.encodedPath();
            int iLastIndexOf = strEncodedPath.lastIndexOf(47);
            if (iLastIndexOf != 0) {
                strSubstring = strEncodedPath.substring(0, iLastIndexOf);
            }
            str3 = strSubstring;
        } else {
            str3 = str4;
        }
        return new Cookie(strTrimSubstring, strTrimSubstring2, j3, str2, str3, z, z2, z3, z4);
    }

    private static String d(String str) {
        if (str.endsWith(".")) {
            throw new IllegalArgumentException();
        }
        if (str.startsWith(".")) {
            str = str.substring(1);
        }
        String strCanonicalizeHost = Util.canonicalizeHost(str);
        if (strCanonicalizeHost != null) {
            return strCanonicalizeHost;
        }
        throw new IllegalArgumentException();
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0081  */
    private static long e(String str, int i, int i2) {
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
        GregorianCalendar gregorianCalendar = new GregorianCalendar(Util.UTC);
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

    private static long f(String str) {
        try {
            long j2 = Long.parseLong(str);
            if (j2 <= 0) {
                return Long.MIN_VALUE;
            }
            return j2;
        } catch (NumberFormatException e) {
            if (str.matches("-?\\d+")) {
                return str.startsWith(Constants.ACCEPT_TIME_SEPARATOR_SERVER) ? Long.MIN_VALUE : Long.MAX_VALUE;
            }
            throw e;
        }
    }

    private static boolean g(HttpUrl httpUrl, String str) {
        String strEncodedPath = httpUrl.encodedPath();
        if (strEncodedPath.equals(str)) {
            return true;
        }
        if (strEncodedPath.startsWith(str)) {
            return str.endsWith(FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE) || strEncodedPath.charAt(str.length()) == '/';
        }
        return false;
    }

    @Nullable
    public static Cookie parse(HttpUrl httpUrl, String str) {
        return c(System.currentTimeMillis(), httpUrl, str);
    }

    public static List<Cookie> parseAll(HttpUrl httpUrl, Headers headers) {
        List<String> listValues = headers.values(HttpHeaders.SET_COOKIE);
        int size = listValues.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            Cookie cookie = parse(httpUrl, listValues.get(i));
            if (cookie != null) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(cookie);
            }
        }
        return arrayList != null ? Collections.unmodifiableList(arrayList) : Collections.emptyList();
    }

    public String domain() {
        return this.d;
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof Cookie)) {
            return false;
        }
        Cookie cookie = (Cookie) obj;
        return cookie.a.equals(this.a) && cookie.b.equals(this.b) && cookie.d.equals(this.d) && cookie.e.equals(this.e) && cookie.c == this.c && cookie.f == this.f && cookie.g == this.g && cookie.h == this.h && cookie.i == this.i;
    }

    public long expiresAt() {
        return this.c;
    }

    public String h(boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append(com.alipay.sdk.m.n.a.h);
        sb.append(this.b);
        if (this.h) {
            if (this.c == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                sb.append(HttpDate.format(new Date(this.c)));
            }
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

    public int hashCode() {
        int iHashCode = (((((((527 + this.a.hashCode()) * 31) + this.b.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31;
        long j2 = this.c;
        return ((((((((iHashCode + ((int) (j2 ^ (j2 >>> 32)))) * 31) + (!this.f ? 1 : 0)) * 31) + (!this.g ? 1 : 0)) * 31) + (!this.h ? 1 : 0)) * 31) + (!this.i ? 1 : 0);
    }

    public boolean hostOnly() {
        return this.i;
    }

    public boolean httpOnly() {
        return this.g;
    }

    public boolean matches(HttpUrl httpUrl) {
        if ((this.i ? httpUrl.host().equals(this.d) : b(httpUrl.host(), this.d)) && g(httpUrl, this.e)) {
            return !this.f || httpUrl.isHttps();
        }
        return false;
    }

    public String name() {
        return this.a;
    }

    public String path() {
        return this.e;
    }

    public boolean persistent() {
        return this.h;
    }

    public boolean secure() {
        return this.f;
    }

    public String toString() {
        return h(false);
    }

    public String value() {
        return this.b;
    }

    public Cookie(Builder builder) {
        String str = builder.a;
        Objects.requireNonNull(str, "builder.name == null");
        String str2 = builder.b;
        Objects.requireNonNull(str2, "builder.value == null");
        String str3 = builder.d;
        Objects.requireNonNull(str3, "builder.domain == null");
        this.a = str;
        this.b = str2;
        this.c = builder.c;
        this.d = str3;
        this.e = builder.e;
        this.f = builder.f;
        this.g = builder.g;
        this.h = builder.h;
        this.i = builder.i;
    }
}
