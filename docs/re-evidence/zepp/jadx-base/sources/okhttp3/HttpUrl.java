package okhttp3;

import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import javax.annotation.Nullable;
import kotlin.text.Typography;
import kotlinx.serialization.json.internal.JsonLexerKt;
import okhttp3.internal.Util;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import okio.Buffer;

/* JADX INFO: loaded from: classes23.dex */
public final class HttpUrl {
    private static final char[] j = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public static final String k = " \"':;<=>@[]^`{}|/\\?#";
    public static final String l = " \"':;<=>@[]^`{}|/\\?#";
    public static final String m = " \"<>^`{}|/\\?#";
    public static final String n = "[]";
    public static final String o = " \"'<>#";
    public static final String p = " \"'<>#&=";
    public static final String q = " !\"#$&'(),/:;<=>?@[]\\^`{|}~";
    public static final String r = "\\^`{|}";
    public static final String s = " \"':;<=>@[]^`{}|/\\?#&!$(),~";
    public static final String t = "";
    public static final String u = " \"#<>\\^`{|}";
    public final String a;
    private final String b;
    private final String c;
    public final String d;
    public final int e;
    private final List<String> f;

    @Nullable
    private final List<String> g;

    @Nullable
    private final String h;
    private final String i;

    public static final class Builder {
        public static final String i = "Invalid URL host";

        @Nullable
        public String a;

        @Nullable
        public String d;
        public final List<String> f;

        @Nullable
        public List<String> g;

        @Nullable
        public String h;
        public String b = "";
        public String c = "";
        public int e = -1;

        public Builder() {
            ArrayList arrayList = new ArrayList();
            this.f = arrayList;
            arrayList.add("");
        }

        private Builder a(String str, boolean z) {
            int i2 = 0;
            do {
                int iDelimiterOffset = Util.delimiterOffset(str, i2, str.length(), "/\\");
                j(str, i2, iDelimiterOffset, iDelimiterOffset < str.length(), z);
                i2 = iDelimiterOffset + 1;
            } while (i2 <= str.length());
            return this;
        }

        private static String b(String str, int i2, int i3) {
            return Util.canonicalizeHost(HttpUrl.g(str, i2, i3, false));
        }

        private boolean d(String str) {
            return str.equals(".") || str.equalsIgnoreCase("%2e");
        }

        private boolean e(String str) {
            return str.equals("..") || str.equalsIgnoreCase("%2e.") || str.equalsIgnoreCase(".%2e") || str.equalsIgnoreCase("%2e%2e");
        }

        private static int g(String str, int i2, int i3) {
            try {
                int i4 = Integer.parseInt(HttpUrl.a(str, i2, i3, "", false, false, false, true, null));
                if (i4 <= 0 || i4 > 65535) {
                    return -1;
                }
                return i4;
            } catch (NumberFormatException unused) {
            }
        }

        private void h() {
            List<String> list = this.f;
            if (!list.remove(list.size() - 1).isEmpty() || this.f.isEmpty()) {
                this.f.add("");
            } else {
                List<String> list2 = this.f;
                list2.set(list2.size() - 1, "");
            }
        }

        private static int i(String str, int i2, int i3) {
            while (i2 < i3) {
                char cCharAt = str.charAt(i2);
                if (cCharAt == ':') {
                    return i2;
                }
                if (cCharAt == '[') {
                    do {
                        i2++;
                        if (i2 >= i3) {
                            break;
                        }
                    } while (str.charAt(i2) != ']');
                }
                i2++;
            }
            return i3;
        }

        private void j(String str, int i2, int i3, boolean z, boolean z2) {
            String strA = HttpUrl.a(str, i2, i3, " \"<>^`{}|/\\?#", z2, false, false, true, null);
            if (d(strA)) {
                return;
            }
            if (e(strA)) {
                h();
                return;
            }
            List<String> list = this.f;
            if (list.get(list.size() - 1).isEmpty()) {
                List<String> list2 = this.f;
                list2.set(list2.size() - 1, strA);
            } else {
                this.f.add(strA);
            }
            if (z) {
                this.f.add("");
            }
        }

        private void l(String str) {
            for (int size = this.g.size() - 2; size >= 0; size -= 2) {
                if (str.equals(this.g.get(size))) {
                    this.g.remove(size + 1);
                    this.g.remove(size);
                    if (this.g.isEmpty()) {
                        this.g = null;
                        return;
                    }
                }
            }
        }

        private void m(String str, int i2, int i3) {
            if (i2 == i3) {
                return;
            }
            char cCharAt = str.charAt(i2);
            if (cCharAt == '/' || cCharAt == '\\') {
                this.f.clear();
                this.f.add("");
                i2++;
            } else {
                List<String> list = this.f;
                list.set(list.size() - 1, "");
            }
            while (true) {
                int i4 = i2;
                if (i4 >= i3) {
                    return;
                }
                i2 = Util.delimiterOffset(str, i4, i3, "/\\");
                boolean z = i2 < i3;
                j(str, i4, i2, z, true);
                if (z) {
                    i2++;
                }
            }
        }

        private static int n(String str, int i2, int i3) {
            if (i3 - i2 < 2) {
                return -1;
            }
            char cCharAt = str.charAt(i2);
            if ((cCharAt >= 'a' && cCharAt <= 'z') || (cCharAt >= 'A' && cCharAt <= 'Z')) {
                while (true) {
                    i2++;
                    if (i2 >= i3) {
                        break;
                    }
                    char cCharAt2 = str.charAt(i2);
                    if (cCharAt2 < 'a' || cCharAt2 > 'z') {
                        if (cCharAt2 < 'A' || cCharAt2 > 'Z') {
                            if (cCharAt2 < '0' || cCharAt2 > '9') {
                                if (cCharAt2 != '+' && cCharAt2 != '-' && cCharAt2 != '.') {
                                    if (cCharAt2 == ':') {
                                        return i2;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return -1;
        }

        private static int o(String str, int i2, int i3) {
            int i4 = 0;
            while (i2 < i3) {
                char cCharAt = str.charAt(i2);
                if (cCharAt != '\\' && cCharAt != '/') {
                    break;
                }
                i4++;
                i2++;
            }
            return i4;
        }

        public Builder addEncodedPathSegment(String str) {
            Objects.requireNonNull(str, "encodedPathSegment == null");
            j(str, 0, str.length(), false, true);
            return this;
        }

        public Builder addEncodedPathSegments(String str) {
            Objects.requireNonNull(str, "encodedPathSegments == null");
            return a(str, true);
        }

        public Builder addEncodedQueryParameter(String str, @Nullable String str2) {
            Objects.requireNonNull(str, "encodedName == null");
            if (this.g == null) {
                this.g = new ArrayList();
            }
            this.g.add(HttpUrl.b(str, " \"'<>#&=", true, false, true, true));
            this.g.add(str2 != null ? HttpUrl.b(str2, " \"'<>#&=", true, false, true, true) : null);
            return this;
        }

        public Builder addPathSegment(String str) {
            Objects.requireNonNull(str, "pathSegment == null");
            j(str, 0, str.length(), false, false);
            return this;
        }

        public Builder addPathSegments(String str) {
            Objects.requireNonNull(str, "pathSegments == null");
            return a(str, false);
        }

        public Builder addQueryParameter(String str, @Nullable String str2) {
            Objects.requireNonNull(str, "name == null");
            if (this.g == null) {
                this.g = new ArrayList();
            }
            this.g.add(HttpUrl.b(str, HttpUrl.q, false, false, true, true));
            this.g.add(str2 != null ? HttpUrl.b(str2, HttpUrl.q, false, false, true, true) : null);
            return this;
        }

        public HttpUrl build() {
            if (this.a == null) {
                throw new IllegalStateException("scheme == null");
            }
            if (this.d != null) {
                return new HttpUrl(this);
            }
            throw new IllegalStateException("host == null");
        }

        public int c() {
            int i2 = this.e;
            return i2 != -1 ? i2 : HttpUrl.defaultPort(this.a);
        }

        public Builder encodedFragment(@Nullable String str) {
            this.h = str != null ? HttpUrl.b(str, "", true, false, false, false) : null;
            return this;
        }

        public Builder encodedPassword(String str) {
            Objects.requireNonNull(str, "encodedPassword == null");
            this.c = HttpUrl.b(str, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true);
            return this;
        }

        public Builder encodedPath(String str) {
            Objects.requireNonNull(str, "encodedPath == null");
            if (str.startsWith(FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE)) {
                m(str, 0, str.length());
                return this;
            }
            throw new IllegalArgumentException("unexpected encodedPath: " + str);
        }

        public Builder encodedQuery(@Nullable String str) {
            this.g = str != null ? HttpUrl.l(HttpUrl.b(str, " \"'<>#", true, false, true, true)) : null;
            return this;
        }

        public Builder encodedUsername(String str) {
            Objects.requireNonNull(str, "encodedUsername == null");
            this.b = HttpUrl.b(str, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true);
            return this;
        }

        public Builder f(@Nullable HttpUrl httpUrl, String str) {
            int iDelimiterOffset;
            int i2;
            int iSkipLeadingAsciiWhitespace = Util.skipLeadingAsciiWhitespace(str, 0, str.length());
            int iSkipTrailingAsciiWhitespace = Util.skipTrailingAsciiWhitespace(str, iSkipLeadingAsciiWhitespace, str.length());
            int iN = n(str, iSkipLeadingAsciiWhitespace, iSkipTrailingAsciiWhitespace);
            if (iN != -1) {
                if (str.regionMatches(true, iSkipLeadingAsciiWhitespace, "https:", 0, 6)) {
                    this.a = "https";
                    iSkipLeadingAsciiWhitespace += 6;
                } else {
                    if (!str.regionMatches(true, iSkipLeadingAsciiWhitespace, "http:", 0, 5)) {
                        throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but was '" + str.substring(0, iN) + "'");
                    }
                    this.a = "http";
                    iSkipLeadingAsciiWhitespace += 5;
                }
            } else {
                if (httpUrl == null) {
                    throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but no colon was found");
                }
                this.a = httpUrl.a;
            }
            int iO = o(str, iSkipLeadingAsciiWhitespace, iSkipTrailingAsciiWhitespace);
            char c = '?';
            char c2 = '#';
            if (iO >= 2 || httpUrl == null || !httpUrl.a.equals(this.a)) {
                int i3 = iSkipLeadingAsciiWhitespace + iO;
                boolean z = false;
                boolean z2 = false;
                while (true) {
                    iDelimiterOffset = Util.delimiterOffset(str, i3, iSkipTrailingAsciiWhitespace, "@/\\?#");
                    byte bCharAt = iDelimiterOffset != iSkipTrailingAsciiWhitespace ? str.charAt(iDelimiterOffset) : (byte) -1;
                    if (bCharAt == -1 || bCharAt == c2 || bCharAt == 47 || bCharAt == 92 || bCharAt == c) {
                        break;
                    }
                    if (bCharAt == 64) {
                        if (z) {
                            i2 = iDelimiterOffset;
                            this.c += "%40" + HttpUrl.a(str, i3, i2, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                        } else {
                            int iDelimiterOffset2 = Util.delimiterOffset(str, i3, iDelimiterOffset, JsonLexerKt.COLON);
                            i2 = iDelimiterOffset;
                            String strA = HttpUrl.a(str, i3, iDelimiterOffset2, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                            if (z2) {
                                strA = this.b + "%40" + strA;
                            }
                            this.b = strA;
                            if (iDelimiterOffset2 != i2) {
                                this.c = HttpUrl.a(str, iDelimiterOffset2 + 1, i2, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                                z = true;
                            }
                            z2 = true;
                        }
                        i3 = i2 + 1;
                    }
                    c = '?';
                    c2 = '#';
                }
                int i4 = i(str, i3, iDelimiterOffset);
                int i5 = i4 + 1;
                if (i5 < iDelimiterOffset) {
                    this.d = b(str, i3, i4);
                    int iG = g(str, i5, iDelimiterOffset);
                    this.e = iG;
                    if (iG == -1) {
                        throw new IllegalArgumentException("Invalid URL port: \"" + str.substring(i5, iDelimiterOffset) + '\"');
                    }
                } else {
                    this.d = b(str, i3, i4);
                    this.e = HttpUrl.defaultPort(this.a);
                }
                if (this.d == null) {
                    throw new IllegalArgumentException("Invalid URL host: \"" + str.substring(i3, i4) + '\"');
                }
                iSkipLeadingAsciiWhitespace = iDelimiterOffset;
            } else {
                this.b = httpUrl.encodedUsername();
                this.c = httpUrl.encodedPassword();
                this.d = httpUrl.d;
                this.e = httpUrl.e;
                this.f.clear();
                this.f.addAll(httpUrl.encodedPathSegments());
                if (iSkipLeadingAsciiWhitespace == iSkipTrailingAsciiWhitespace || str.charAt(iSkipLeadingAsciiWhitespace) == '#') {
                    encodedQuery(httpUrl.encodedQuery());
                }
            }
            int iDelimiterOffset3 = Util.delimiterOffset(str, iSkipLeadingAsciiWhitespace, iSkipTrailingAsciiWhitespace, "?#");
            m(str, iSkipLeadingAsciiWhitespace, iDelimiterOffset3);
            if (iDelimiterOffset3 < iSkipTrailingAsciiWhitespace && str.charAt(iDelimiterOffset3) == '?') {
                int iDelimiterOffset4 = Util.delimiterOffset(str, iDelimiterOffset3, iSkipTrailingAsciiWhitespace, '#');
                this.g = HttpUrl.l(HttpUrl.a(str, iDelimiterOffset3 + 1, iDelimiterOffset4, " \"'<>#", true, false, true, true, null));
                iDelimiterOffset3 = iDelimiterOffset4;
            }
            if (iDelimiterOffset3 < iSkipTrailingAsciiWhitespace && str.charAt(iDelimiterOffset3) == '#') {
                this.h = HttpUrl.a(str, 1 + iDelimiterOffset3, iSkipTrailingAsciiWhitespace, "", true, false, false, false, null);
            }
            return this;
        }

        public Builder fragment(@Nullable String str) {
            this.h = str != null ? HttpUrl.b(str, "", false, false, false, false) : null;
            return this;
        }

        public Builder host(String str) {
            Objects.requireNonNull(str, "host == null");
            String strB = b(str, 0, str.length());
            if (strB != null) {
                this.d = strB;
                return this;
            }
            throw new IllegalArgumentException("unexpected host: " + str);
        }

        public Builder k() {
            int size = this.f.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.f.set(i2, HttpUrl.b(this.f.get(i2), "[]", true, true, false, true));
            }
            List<String> list = this.g;
            if (list != null) {
                int size2 = list.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    String str = this.g.get(i3);
                    if (str != null) {
                        this.g.set(i3, HttpUrl.b(str, "\\^`{|}", true, true, true, true));
                    }
                }
            }
            String str2 = this.h;
            if (str2 != null) {
                this.h = HttpUrl.b(str2, " \"#<>\\^`{|}", true, true, false, false);
            }
            return this;
        }

        public Builder password(String str) {
            Objects.requireNonNull(str, "password == null");
            this.c = HttpUrl.b(str, " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
            return this;
        }

        public Builder port(int i2) {
            if (i2 > 0 && i2 <= 65535) {
                this.e = i2;
                return this;
            }
            throw new IllegalArgumentException("unexpected port: " + i2);
        }

        public Builder query(@Nullable String str) {
            this.g = str != null ? HttpUrl.l(HttpUrl.b(str, " \"'<>#", false, false, true, true)) : null;
            return this;
        }

        public Builder removeAllEncodedQueryParameters(String str) {
            Objects.requireNonNull(str, "encodedName == null");
            if (this.g == null) {
                return this;
            }
            l(HttpUrl.b(str, " \"'<>#&=", true, false, true, true));
            return this;
        }

        public Builder removeAllQueryParameters(String str) {
            Objects.requireNonNull(str, "name == null");
            if (this.g == null) {
                return this;
            }
            l(HttpUrl.b(str, HttpUrl.q, false, false, true, true));
            return this;
        }

        public Builder removePathSegment(int i2) {
            this.f.remove(i2);
            if (this.f.isEmpty()) {
                this.f.add("");
            }
            return this;
        }

        public Builder scheme(String str) {
            Objects.requireNonNull(str, "scheme == null");
            if (str.equalsIgnoreCase("http")) {
                this.a = "http";
            } else {
                if (!str.equalsIgnoreCase("https")) {
                    throw new IllegalArgumentException("unexpected scheme: " + str);
                }
                this.a = "https";
            }
            return this;
        }

        public Builder setEncodedPathSegment(int i2, String str) {
            Objects.requireNonNull(str, "encodedPathSegment == null");
            String strA = HttpUrl.a(str, 0, str.length(), " \"<>^`{}|/\\?#", true, false, false, true, null);
            this.f.set(i2, strA);
            if (!d(strA) && !e(strA)) {
                return this;
            }
            throw new IllegalArgumentException("unexpected path segment: " + str);
        }

        public Builder setEncodedQueryParameter(String str, @Nullable String str2) {
            removeAllEncodedQueryParameters(str);
            addEncodedQueryParameter(str, str2);
            return this;
        }

        public Builder setPathSegment(int i2, String str) {
            Objects.requireNonNull(str, "pathSegment == null");
            String strA = HttpUrl.a(str, 0, str.length(), " \"<>^`{}|/\\?#", false, false, false, true, null);
            if (!d(strA) && !e(strA)) {
                this.f.set(i2, strA);
                return this;
            }
            throw new IllegalArgumentException("unexpected path segment: " + str);
        }

        public Builder setQueryParameter(String str, @Nullable String str2) {
            removeAllQueryParameters(str);
            addQueryParameter(str, str2);
            return this;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            String str = this.a;
            if (str != null) {
                sb.append(str);
                sb.append("://");
            } else {
                sb.append("//");
            }
            if (!this.b.isEmpty() || !this.c.isEmpty()) {
                sb.append(this.b);
                if (!this.c.isEmpty()) {
                    sb.append(JsonLexerKt.COLON);
                    sb.append(this.c);
                }
                sb.append('@');
            }
            String str2 = this.d;
            if (str2 != null) {
                if (str2.indexOf(58) != -1) {
                    sb.append(JsonLexerKt.BEGIN_LIST);
                    sb.append(this.d);
                    sb.append(JsonLexerKt.END_LIST);
                } else {
                    sb.append(this.d);
                }
            }
            if (this.e != -1 || this.a != null) {
                int iC = c();
                String str3 = this.a;
                if (str3 == null || iC != HttpUrl.defaultPort(str3)) {
                    sb.append(JsonLexerKt.COLON);
                    sb.append(iC);
                }
            }
            HttpUrl.f(sb, this.f);
            if (this.g != null) {
                sb.append('?');
                HttpUrl.e(sb, this.g);
            }
            if (this.h != null) {
                sb.append('#');
                sb.append(this.h);
            }
            return sb.toString();
        }

        public Builder username(String str) {
            Objects.requireNonNull(str, "username == null");
            this.b = HttpUrl.b(str, " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
            return this;
        }
    }

    public HttpUrl(Builder builder) {
        this.a = builder.a;
        this.b = h(builder.b, false);
        this.c = h(builder.c, false);
        this.d = builder.d;
        this.e = builder.c();
        this.f = i(builder.f, false);
        List<String> list = builder.g;
        this.g = list != null ? i(list, true) : null;
        String str = builder.h;
        this.h = str != null ? h(str, false) : null;
        this.i = builder.toString();
    }

    public static String a(String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset) {
        int iCharCount = i;
        while (iCharCount < i2) {
            int iCodePointAt = str.codePointAt(iCharCount);
            if (iCodePointAt >= 32 && iCodePointAt != 127 && (iCodePointAt < 128 || !z4)) {
                if (str2.indexOf(iCodePointAt) == -1 && ((iCodePointAt != 37 || (z && (!z2 || k(str, iCharCount, i2)))) && (iCodePointAt != 43 || !z3))) {
                    iCharCount += Character.charCount(iCodePointAt);
                }
            }
            Buffer buffer = new Buffer();
            buffer.writeUtf8(str, i, iCharCount);
            d(buffer, str, iCharCount, i2, str2, z, z2, z3, z4, charset);
            return buffer.readUtf8();
        }
        return str.substring(i, i2);
    }

    public static String b(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4) {
        return a(str, 0, str.length(), str2, z, z2, z3, z4, null);
    }

    public static String c(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset) {
        return a(str, 0, str.length(), str2, z, z2, z3, z4, charset);
    }

    public static void d(Buffer buffer, String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset) {
        Buffer buffer2 = null;
        while (i < i2) {
            int iCodePointAt = str.codePointAt(i);
            if (!z || (iCodePointAt != 9 && iCodePointAt != 10 && iCodePointAt != 12 && iCodePointAt != 13)) {
                if (iCodePointAt == 43 && z3) {
                    buffer.writeUtf8(z ? "+" : "%2B");
                } else if (iCodePointAt < 32 || iCodePointAt == 127 || ((iCodePointAt >= 128 && z4) || str2.indexOf(iCodePointAt) != -1 || (iCodePointAt == 37 && (!z || (z2 && !k(str, i, i2)))))) {
                    if (buffer2 == null) {
                        buffer2 = new Buffer();
                    }
                    if (charset == null || charset.equals(Util.UTF_8)) {
                        buffer2.writeUtf8CodePoint(iCodePointAt);
                    } else {
                        buffer2.writeString(str, i, Character.charCount(iCodePointAt) + i, charset);
                    }
                    while (!buffer2.exhausted()) {
                        int i3 = buffer2.readByte() & 255;
                        buffer.writeByte(37);
                        char[] cArr = j;
                        buffer.writeByte((int) cArr[(i3 >> 4) & 15]);
                        buffer.writeByte((int) cArr[i3 & 15]);
                    }
                } else {
                    buffer.writeUtf8CodePoint(iCodePointAt);
                }
            }
            i += Character.charCount(iCodePointAt);
        }
    }

    public static int defaultPort(String str) {
        if (str.equals("http")) {
            return 80;
        }
        return str.equals("https") ? 443 : -1;
    }

    public static void e(StringBuilder sb, List<String> list) {
        int size = list.size();
        for (int i = 0; i < size; i += 2) {
            String str = list.get(i);
            String str2 = list.get(i + 1);
            if (i > 0) {
                sb.append(Typography.amp);
            }
            sb.append(str);
            if (str2 != null) {
                sb.append(com.alipay.sdk.m.n.a.h);
                sb.append(str2);
            }
        }
    }

    public static void f(StringBuilder sb, List<String> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            sb.append('/');
            sb.append(list.get(i));
        }
    }

    public static String g(String str, int i, int i2, boolean z) {
        for (int i3 = i; i3 < i2; i3++) {
            char cCharAt = str.charAt(i3);
            if (cCharAt == '%' || (cCharAt == '+' && z)) {
                Buffer buffer = new Buffer();
                buffer.writeUtf8(str, i, i3);
                j(buffer, str, i3, i2, z);
                return buffer.readUtf8();
            }
        }
        return str.substring(i, i2);
    }

    public static HttpUrl get(String str) {
        return new Builder().f(null, str).build();
    }

    public static String h(String str, boolean z) {
        return g(str, 0, str.length(), z);
    }

    private List<String> i(List<String> list, boolean z) {
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            String str = list.get(i);
            arrayList.add(str != null ? h(str, z) : null);
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0039  */
    public static void j(Buffer buffer, String str, int i, int i2, boolean z) {
        int i3;
        while (i < i2) {
            int iCodePointAt = str.codePointAt(i);
            if (iCodePointAt == 37 && (i3 = i + 2) < i2) {
                int iDecodeHexDigit = Util.decodeHexDigit(str.charAt(i + 1));
                int iDecodeHexDigit2 = Util.decodeHexDigit(str.charAt(i3));
                if (iDecodeHexDigit == -1 || iDecodeHexDigit2 == -1) {
                    buffer.writeUtf8CodePoint(iCodePointAt);
                } else {
                    buffer.writeByte((iDecodeHexDigit << 4) + iDecodeHexDigit2);
                    i = i3;
                }
            } else if (iCodePointAt == 43 && z) {
                buffer.writeByte(32);
            } else {
                buffer.writeUtf8CodePoint(iCodePointAt);
            }
            i += Character.charCount(iCodePointAt);
        }
    }

    public static boolean k(String str, int i, int i2) {
        int i3 = i + 2;
        return i3 < i2 && str.charAt(i) == '%' && Util.decodeHexDigit(str.charAt(i + 1)) != -1 && Util.decodeHexDigit(str.charAt(i3)) != -1;
    }

    public static List<String> l(String str) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i <= str.length()) {
            int iIndexOf = str.indexOf(38, i);
            if (iIndexOf == -1) {
                iIndexOf = str.length();
            }
            int iIndexOf2 = str.indexOf(61, i);
            if (iIndexOf2 == -1 || iIndexOf2 > iIndexOf) {
                arrayList.add(str.substring(i, iIndexOf));
                arrayList.add(null);
            } else {
                arrayList.add(str.substring(i, iIndexOf2));
                arrayList.add(str.substring(iIndexOf2 + 1, iIndexOf));
            }
            i = iIndexOf + 1;
        }
        return arrayList;
    }

    @Nullable
    public static HttpUrl parse(String str) {
        try {
            return get(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    @Nullable
    public String encodedFragment() {
        if (this.h == null) {
            return null;
        }
        return this.i.substring(this.i.indexOf(35) + 1);
    }

    public String encodedPassword() {
        if (this.c.isEmpty()) {
            return "";
        }
        return this.i.substring(this.i.indexOf(58, this.a.length() + 3) + 1, this.i.indexOf(64));
    }

    public String encodedPath() {
        int iIndexOf = this.i.indexOf(47, this.a.length() + 3);
        String str = this.i;
        return this.i.substring(iIndexOf, Util.delimiterOffset(str, iIndexOf, str.length(), "?#"));
    }

    public List<String> encodedPathSegments() {
        int iIndexOf = this.i.indexOf(47, this.a.length() + 3);
        String str = this.i;
        int iDelimiterOffset = Util.delimiterOffset(str, iIndexOf, str.length(), "?#");
        ArrayList arrayList = new ArrayList();
        while (iIndexOf < iDelimiterOffset) {
            int i = iIndexOf + 1;
            int iDelimiterOffset2 = Util.delimiterOffset(this.i, i, iDelimiterOffset, '/');
            arrayList.add(this.i.substring(i, iDelimiterOffset2));
            iIndexOf = iDelimiterOffset2;
        }
        return arrayList;
    }

    @Nullable
    public String encodedQuery() {
        if (this.g == null) {
            return null;
        }
        int iIndexOf = this.i.indexOf(63) + 1;
        String str = this.i;
        return this.i.substring(iIndexOf, Util.delimiterOffset(str, iIndexOf, str.length(), '#'));
    }

    public String encodedUsername() {
        if (this.b.isEmpty()) {
            return "";
        }
        int length = this.a.length() + 3;
        String str = this.i;
        return this.i.substring(length, Util.delimiterOffset(str, length, str.length(), ":@"));
    }

    public boolean equals(@Nullable Object obj) {
        return (obj instanceof HttpUrl) && ((HttpUrl) obj).i.equals(this.i);
    }

    @Nullable
    public String fragment() {
        return this.h;
    }

    public int hashCode() {
        return this.i.hashCode();
    }

    public String host() {
        return this.d;
    }

    public boolean isHttps() {
        return this.a.equals("https");
    }

    public Builder newBuilder() {
        Builder builder = new Builder();
        builder.a = this.a;
        builder.b = encodedUsername();
        builder.c = encodedPassword();
        builder.d = this.d;
        builder.e = this.e != defaultPort(this.a) ? this.e : -1;
        builder.f.clear();
        builder.f.addAll(encodedPathSegments());
        builder.encodedQuery(encodedQuery());
        builder.h = encodedFragment();
        return builder;
    }

    public String password() {
        return this.c;
    }

    public List<String> pathSegments() {
        return this.f;
    }

    public int pathSize() {
        return this.f.size();
    }

    public int port() {
        return this.e;
    }

    @Nullable
    public String query() {
        if (this.g == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        e(sb, this.g);
        return sb.toString();
    }

    @Nullable
    public String queryParameter(String str) {
        List<String> list = this.g;
        if (list == null) {
            return null;
        }
        int size = list.size();
        for (int i = 0; i < size; i += 2) {
            if (str.equals(this.g.get(i))) {
                return this.g.get(i + 1);
            }
        }
        return null;
    }

    public String queryParameterName(int i) {
        List<String> list = this.g;
        if (list != null) {
            return list.get(i * 2);
        }
        throw new IndexOutOfBoundsException();
    }

    public Set<String> queryParameterNames() {
        if (this.g == null) {
            return Collections.emptySet();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int size = this.g.size();
        for (int i = 0; i < size; i += 2) {
            linkedHashSet.add(this.g.get(i));
        }
        return Collections.unmodifiableSet(linkedHashSet);
    }

    public String queryParameterValue(int i) {
        List<String> list = this.g;
        if (list != null) {
            return list.get((i * 2) + 1);
        }
        throw new IndexOutOfBoundsException();
    }

    public List<String> queryParameterValues(String str) {
        if (this.g == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        int size = this.g.size();
        for (int i = 0; i < size; i += 2) {
            if (str.equals(this.g.get(i))) {
                arrayList.add(this.g.get(i + 1));
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    public int querySize() {
        List<String> list = this.g;
        if (list != null) {
            return list.size() / 2;
        }
        return 0;
    }

    public String redact() {
        return newBuilder("/...").username("").password("").build().toString();
    }

    @Nullable
    public HttpUrl resolve(String str) {
        Builder builderNewBuilder = newBuilder(str);
        if (builderNewBuilder != null) {
            return builderNewBuilder.build();
        }
        return null;
    }

    public String scheme() {
        return this.a;
    }

    public String toString() {
        return this.i;
    }

    @Nullable
    public String topPrivateDomain() {
        if (Util.verifyAsIpAddress(this.d)) {
            return null;
        }
        return PublicSuffixDatabase.get().getEffectiveTldPlusOne(this.d);
    }

    public URI uri() {
        String string = newBuilder().k().toString();
        try {
            return new URI(string);
        } catch (URISyntaxException e) {
            try {
                return URI.create(string.replaceAll("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]", ""));
            } catch (Exception unused) {
                throw new RuntimeException(e);
            }
        }
    }

    public URL url() {
        try {
            return new URL(this.i);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    public String username() {
        return this.b;
    }

    @Nullable
    public static HttpUrl get(URL url) {
        return parse(url.toString());
    }

    @Nullable
    public static HttpUrl get(URI uri) {
        return parse(uri.toString());
    }

    @Nullable
    public Builder newBuilder(String str) {
        try {
            return new Builder().f(this, str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }
}
