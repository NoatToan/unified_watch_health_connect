package com.huawei.hms.network.embedded;

import androidx.webkit.ProxyConfig;
import com.huawei.hms.network.okhttp.PublicSuffixDatabase;
import java.io.EOFException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes34.dex */
public final class m7 {
    public static final char[] j = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
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

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15089a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f15090b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f15091c;
    public final String d;
    public final int e;
    public final List<String> f;

    @Nullable
    public final List<String> g;

    @Nullable
    public final String h;
    public final String i;

    public String w() {
        return this.f15090b;
    }

    public URL v() {
        try {
            return new URL(this.i);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    public URI u() {
        String string = j().c().toString();
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

    public String toString() {
        return this.i;
    }

    @Nullable
    public String t() {
        if (f8.e(this.d)) {
            return null;
        }
        return PublicSuffixDatabase.a().a(this.d);
    }

    public String s() {
        return this.f15089a;
    }

    public String r() {
        return a("/...").q("").l("").a().toString();
    }

    public static final class a {
        public static final String i = "Invalid URL host";

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public String f15092a;

        @Nullable
        public String d;
        public final List<String> f;

        @Nullable
        public List<String> g;

        @Nullable
        public String h;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f15093b = "";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f15094c = "";
        public int e = -1;

        public String toString() {
            String str;
            StringBuilder sb = new StringBuilder();
            String str2 = this.f15092a;
            if (str2 != null) {
                sb.append(str2);
                str = "://";
            } else {
                str = "//";
            }
            sb.append(str);
            if (!this.f15093b.isEmpty() || !this.f15094c.isEmpty()) {
                sb.append(this.f15093b);
                if (!this.f15094c.isEmpty()) {
                    sb.append(':');
                    sb.append(this.f15094c);
                }
                sb.append('@');
            }
            String str3 = this.d;
            if (str3 != null) {
                if (str3.indexOf(58) != -1) {
                    sb.append('[');
                    sb.append(this.d);
                    sb.append(']');
                } else {
                    sb.append(this.d);
                }
            }
            if (this.e != -1 || this.f15092a != null) {
                int iB = b();
                String str4 = this.f15092a;
                if (str4 == null || iB != m7.e(str4)) {
                    sb.append(':');
                    sb.append(iB);
                }
            }
            m7.b(sb, this.f);
            if (this.g != null) {
                sb.append('?');
                m7.a(sb, this.g);
            }
            if (this.h != null) {
                sb.append('#');
                sb.append(this.h);
            }
            return sb.toString();
        }

        public a q(String str) {
            if (str == null) {
                throw new NullPointerException("username == null");
            }
            this.f15093b = m7.a(str, " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
            return this;
        }

        public a p(String str) {
            if (str == null) {
                throw new NullPointerException("scheme == null");
            }
            if (str.equalsIgnoreCase("http")) {
                this.f15092a = "http";
                return this;
            }
            if (str.equalsIgnoreCase(ProxyConfig.MATCH_HTTPS)) {
                this.f15092a = ProxyConfig.MATCH_HTTPS;
                return this;
            }
            throw new IllegalArgumentException("unexpected scheme: " + str);
        }

        public a o(String str) {
            if (str == null) {
                throw new NullPointerException("name == null");
            }
            if (this.g == null) {
                return this;
            }
            t(m7.a(str, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, true));
            return this;
        }

        public a n(String str) {
            if (str == null) {
                throw new NullPointerException("encodedName == null");
            }
            if (this.g == null) {
                return this;
            }
            t(m7.a(str, " \"'<>#&=", true, false, true, true));
            return this;
        }

        public a m(@Nullable String str) {
            this.g = str != null ? m7.h(m7.a(str, " \"'<>#", false, false, true, true)) : null;
            return this;
        }

        public a l(String str) {
            if (str == null) {
                throw new NullPointerException("password == null");
            }
            this.f15094c = m7.a(str, " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
            return this;
        }

        public a k(String str) {
            if (str == null) {
                throw new NullPointerException("host == null");
            }
            String strA = a(str, 0, str.length());
            if (strA != null) {
                this.d = strA;
                return this;
            }
            throw new IllegalArgumentException("unexpected host: " + str);
        }

        public a j(@Nullable String str) {
            this.h = str != null ? m7.a(str, "", false, false, false, false) : null;
            return this;
        }

        public a i(String str) {
            if (str == null) {
                throw new NullPointerException("encodedUsername == null");
            }
            this.f15093b = m7.a(str, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true);
            return this;
        }

        public a h(@Nullable String str) {
            this.g = str != null ? m7.h(m7.a(str, " \"'<>#", true, false, true, true)) : null;
            return this;
        }

        public a g(String str) {
            if (str == null) {
                throw new NullPointerException("encodedPath == null");
            }
            if (str.startsWith("/")) {
                d(str, 0, str.length());
                return this;
            }
            throw new IllegalArgumentException("unexpected encodedPath: " + str);
        }

        public a f(String str) {
            if (str == null) {
                throw new NullPointerException("encodedPassword == null");
            }
            this.f15094c = m7.a(str, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true);
            return this;
        }

        public a e(@Nullable String str) {
            this.h = str != null ? m7.a(str, "", true, false, false, false) : null;
            return this;
        }

        public a d(String str, @Nullable String str2) {
            o(str);
            b(str, str2);
            return this;
        }

        public a d(String str) {
            if (str != null) {
                return a(str, false);
            }
            throw new NullPointerException("pathSegments == null");
        }

        public a c(String str, @Nullable String str2) {
            n(str);
            a(str, str2);
            return this;
        }

        public a c(String str) {
            if (str == null) {
                throw new NullPointerException("pathSegment == null");
            }
            a(str, 0, str.length(), false, false);
            return this;
        }

        public a c() {
            int size = this.f.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.f.set(i2, m7.a(this.f.get(i2), "[]", true, true, false, true));
            }
            List<String> list = this.g;
            if (list != null) {
                int size2 = list.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    String str = this.g.get(i3);
                    if (str != null) {
                        this.g.set(i3, m7.a(str, "\\^`{|}", true, true, true, true));
                    }
                }
            }
            String str2 = this.h;
            if (str2 != null) {
                this.h = m7.a(str2, " \"#<>\\^`{|}", true, true, false, false);
            }
            return this;
        }

        public a b(String str, @Nullable String str2) {
            if (str == null) {
                throw new NullPointerException("name == null");
            }
            if (this.g == null) {
                this.g = new ArrayList();
            }
            this.g.add(m7.a(str, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, true));
            this.g.add(str2 != null ? m7.a(str2, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, true) : null);
            return this;
        }

        public a b(String str) {
            if (str != null) {
                return a(str, true);
            }
            throw new NullPointerException("encodedPathSegments == null");
        }

        public a b(int i2, String str) {
            if (str == null) {
                throw new NullPointerException("pathSegment == null");
            }
            String strA = m7.a(str, 0, str.length(), " \"<>^`{}|/\\?#", false, false, false, true, null);
            if (!r(strA) && !s(strA)) {
                this.f.set(i2, strA);
                return this;
            }
            throw new IllegalArgumentException("unexpected path segment: " + str);
        }

        public a b(int i2) {
            this.f.remove(i2);
            if (this.f.isEmpty()) {
                this.f.add("");
            }
            return this;
        }

        public int b() {
            int i2 = this.e;
            return i2 != -1 ? i2 : m7.e(this.f15092a);
        }

        public m7 a() {
            if (this.f15092a == null) {
                throw new IllegalStateException("scheme == null");
            }
            if (this.d != null) {
                return new m7(this);
            }
            throw new IllegalStateException("host == null");
        }

        public a a(String str, @Nullable String str2) {
            if (str == null) {
                throw new NullPointerException("encodedName == null");
            }
            if (this.g == null) {
                this.g = new ArrayList();
            }
            this.g.add(m7.a(str, " \"'<>#&=", true, false, true, true));
            this.g.add(str2 != null ? m7.a(str2, " \"'<>#&=", true, false, true, true) : null);
            return this;
        }

        public a a(String str) {
            if (str == null) {
                throw new NullPointerException("encodedPathSegment == null");
            }
            a(str, 0, str.length(), false, true);
            return this;
        }

        public a a(@Nullable m7 m7Var, String str) {
            int iA;
            int i2;
            int iB = f8.b(str, 0, str.length());
            int iC = f8.c(str, iB, str.length());
            int iE = e(str, iB, iC);
            if (iE != -1) {
                if (str.regionMatches(true, iB, "https:", 0, 6)) {
                    this.f15092a = ProxyConfig.MATCH_HTTPS;
                    iB += 6;
                } else {
                    if (!str.regionMatches(true, iB, "http:", 0, 5)) {
                        throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but was '" + str.substring(0, iE) + "'");
                    }
                    this.f15092a = "http";
                    iB += 5;
                }
            } else {
                if (m7Var == null) {
                    throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but no colon was found");
                }
                this.f15092a = m7Var.f15089a;
            }
            int iF = f(str, iB, iC);
            char c2 = '?';
            char c3 = '#';
            if (iF >= 2 || m7Var == null || !m7Var.f15089a.equals(this.f15092a)) {
                boolean z = false;
                boolean z2 = false;
                int i3 = iB + iF;
                while (true) {
                    iA = f8.a(str, i3, iC, "@/\\?#");
                    byte bCharAt = iA != iC ? str.charAt(iA) : (byte) -1;
                    if (bCharAt == -1 || bCharAt == c3 || bCharAt == 47 || bCharAt == 92 || bCharAt == c2) {
                        break;
                    }
                    if (bCharAt == 64) {
                        if (z) {
                            i2 = iA;
                            this.f15094c += "%40" + m7.a(str, i3, i2, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                        } else {
                            int iA2 = f8.a(str, i3, iA, ':');
                            i2 = iA;
                            String strA = m7.a(str, i3, iA2, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                            if (z2) {
                                strA = this.f15093b + "%40" + strA;
                            }
                            this.f15093b = strA;
                            if (iA2 != i2) {
                                this.f15094c = m7.a(str, iA2 + 1, i2, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                                z = true;
                            }
                            z2 = true;
                        }
                        i3 = i2 + 1;
                        c2 = '?';
                        c3 = '#';
                    }
                }
                int iC2 = c(str, i3, iA);
                int i4 = iC2 + 1;
                if (i4 < iA) {
                    this.d = a(str, i3, iC2);
                    int iB2 = b(str, i4, iA);
                    this.e = iB2;
                    if (iB2 == -1) {
                        throw new IllegalArgumentException("Invalid URL port: \"" + str.substring(i4, iA) + '\"');
                    }
                } else {
                    this.d = a(str, i3, iC2);
                    this.e = m7.e(this.f15092a);
                }
                if (this.d == null) {
                    throw new IllegalArgumentException("Invalid URL host: \"" + str.substring(i3, iC2) + '\"');
                }
                iB = iA;
            } else {
                this.f15093b = m7Var.f();
                this.f15094c = m7Var.b();
                this.d = m7Var.d;
                this.e = m7Var.e;
                this.f.clear();
                this.f.addAll(m7Var.d());
                if (iB == iC || str.charAt(iB) == '#') {
                    h(m7Var.e());
                }
            }
            int iA3 = f8.a(str, iB, iC, "?#");
            d(str, iB, iA3);
            if (iA3 < iC && str.charAt(iA3) == '?') {
                int iA4 = f8.a(str, iA3, iC, '#');
                this.g = m7.h(m7.a(str, iA3 + 1, iA4, " \"'<>#", true, false, true, true, null));
                iA3 = iA4;
            }
            if (iA3 < iC && str.charAt(iA3) == '#') {
                this.h = m7.a(str, 1 + iA3, iC, "", true, false, false, false, null);
            }
            return this;
        }

        public a a(int i2, String str) {
            if (str == null) {
                throw new NullPointerException("encodedPathSegment == null");
            }
            String strA = m7.a(str, 0, str.length(), " \"<>^`{}|/\\?#", true, false, false, true, null);
            this.f.set(i2, strA);
            if (!r(strA) && !s(strA)) {
                return this;
            }
            throw new IllegalArgumentException("unexpected path segment: " + str);
        }

        public a a(int i2) {
            if (i2 > 0 && i2 <= 65535) {
                this.e = i2;
                return this;
            }
            throw new IllegalArgumentException("unexpected port: " + i2);
        }

        private void t(String str) {
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

        private boolean s(String str) {
            return str.equals("..") || str.equalsIgnoreCase("%2e.") || str.equalsIgnoreCase(".%2e") || str.equalsIgnoreCase("%2e%2e");
        }

        private boolean r(String str) {
            return str.equals(".") || str.equalsIgnoreCase("%2e");
        }

        public static int f(String str, int i2, int i3) {
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

        public static int e(String str, int i2, int i3) {
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

        private void d(String str, int i2, int i3) {
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
                i2 = f8.a(str, i4, i3, "/\\");
                boolean z = i2 < i3;
                a(str, i4, i2, z, true);
                if (z) {
                    i2++;
                }
            }
        }

        private void d() {
            List<String> list = this.f;
            if (!list.remove(list.size() - 1).isEmpty() || this.f.isEmpty()) {
                this.f.add("");
            } else {
                List<String> list2 = this.f;
                list2.set(list2.size() - 1, "");
            }
        }

        public static int c(String str, int i2, int i3) {
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

        public static int b(String str, int i2, int i3) {
            try {
                int i4 = Integer.parseInt(m7.a(str, i2, i3, "", false, false, false, true, null));
                if (i4 <= 0 || i4 > 65535) {
                    return -1;
                }
                return i4;
            } catch (NumberFormatException unused) {
                return -1;
            }
        }

        private void a(String str, int i2, int i3, boolean z, boolean z2) {
            String strA = m7.a(str, i2, i3, " \"<>^`{}|/\\?#", z2, false, false, true, null);
            if (r(strA)) {
                return;
            }
            if (s(strA)) {
                d();
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

        @Nullable
        public static String a(String str, int i2, int i3) {
            return f8.a(m7.a(str, i2, i3, false));
        }

        private a a(String str, boolean z) {
            int i2 = 0;
            do {
                int iA = f8.a(str, i2, str.length(), "/\\");
                a(str, i2, iA, iA < str.length(), z);
                i2 = iA + 1;
            } while (i2 <= str.length());
            return this;
        }

        public a() {
            ArrayList arrayList = new ArrayList();
            this.f = arrayList;
            arrayList.add("");
        }
    }

    public int q() {
        List<String> list = this.g;
        if (list != null) {
            return list.size() / 2;
        }
        return 0;
    }

    public Set<String> p() {
        if (this.g == null) {
            return Collections.EMPTY_SET;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int size = this.g.size();
        for (int i = 0; i < size; i += 2) {
            linkedHashSet.add(this.g.get(i));
        }
        return Collections.unmodifiableSet(linkedHashSet);
    }

    @Nullable
    public String o() {
        if (this.g == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        a(sb, this.g);
        return sb.toString();
    }

    public int n() {
        return this.e;
    }

    public int m() {
        return this.f.size();
    }

    public List<String> l() {
        return this.f;
    }

    public String k() {
        return this.f15091c;
    }

    public a j() {
        a aVar = new a();
        aVar.f15092a = this.f15089a;
        aVar.f15093b = f();
        aVar.f15094c = b();
        aVar.d = this.d;
        aVar.e = this.e != e(this.f15089a) ? this.e : -1;
        aVar.f.clear();
        aVar.f.addAll(d());
        aVar.h(e());
        aVar.h = a();
        return aVar;
    }

    public boolean i() {
        return this.f15089a.equals(ProxyConfig.MATCH_HTTPS);
    }

    public int hashCode() {
        return this.i.hashCode();
    }

    public String h() {
        return this.d;
    }

    @Nullable
    public String g() {
        return this.h;
    }

    public String f() {
        if (this.f15090b.isEmpty()) {
            return "";
        }
        int length = this.f15089a.length() + 3;
        String str = this.i;
        return this.i.substring(length, f8.a(str, length, str.length(), ":@"));
    }

    public boolean equals(@Nullable Object obj) {
        return (obj instanceof m7) && ((m7) obj).i.equals(this.i);
    }

    @Nullable
    public String e() {
        if (this.g == null) {
            return null;
        }
        int iIndexOf = this.i.indexOf(63) + 1;
        String str = this.i;
        return this.i.substring(iIndexOf, f8.a(str, iIndexOf, str.length(), '#'));
    }

    public List<String> d() {
        int iIndexOf = this.i.indexOf(47, this.f15089a.length() + 3);
        String str = this.i;
        int iA = f8.a(str, iIndexOf, str.length(), "?#");
        ArrayList arrayList = new ArrayList();
        while (iIndexOf < iA) {
            int i = iIndexOf + 1;
            int iA2 = f8.a(this.i, i, iA, '/');
            arrayList.add(this.i.substring(i, iA2));
            iIndexOf = iA2;
        }
        return arrayList;
    }

    @Nullable
    public m7 d(String str) {
        a aVarA = a(str);
        if (aVarA != null) {
            return aVarA.a();
        }
        return null;
    }

    public List<String> c(String str) {
        if (this.g == null) {
            return Collections.EMPTY_LIST;
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

    public String c() {
        int iIndexOf = this.i.indexOf(47, this.f15089a.length() + 3);
        String str = this.i;
        return this.i.substring(iIndexOf, f8.a(str, iIndexOf, str.length(), "?#"));
    }

    @Nullable
    public String b(String str) {
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

    public String b(int i) {
        List<String> list = this.g;
        if (list != null) {
            return list.get((i * 2) + 1);
        }
        throw new IndexOutOfBoundsException();
    }

    public String b() {
        if (this.f15091c.isEmpty()) {
            return "";
        }
        int iIndexOf = this.i.indexOf(58, this.f15089a.length() + 3);
        return this.i.substring(iIndexOf + 1, this.i.indexOf(64));
    }

    public String a(int i) {
        List<String> list = this.g;
        if (list != null) {
            return list.get(i * 2);
        }
        throw new IndexOutOfBoundsException();
    }

    @Nullable
    public String a() {
        if (this.h == null) {
            return null;
        }
        return this.i.substring(this.i.indexOf(35) + 1);
    }

    @Nullable
    public a a(String str) {
        try {
            return new a().a(this, str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public static List<String> h(String str) {
        String strSubstring;
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
                strSubstring = null;
            } else {
                arrayList.add(str.substring(i, iIndexOf2));
                strSubstring = str.substring(iIndexOf2 + 1, iIndexOf);
            }
            arrayList.add(strSubstring);
            i = iIndexOf + 1;
        }
        return arrayList;
    }

    @Nullable
    public static m7 g(String str) {
        try {
            return f(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public static m7 f(String str) {
        return new a().a((m7) null, str).a();
    }

    public static int e(String str) {
        if (str.equals("http")) {
            return 80;
        }
        if (str.equals(ProxyConfig.MATCH_HTTPS)) {
            return g2.n;
        }
        return -1;
    }

    public static void b(StringBuilder sb, List<String> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            sb.append('/');
            sb.append(list.get(i));
        }
    }

    public static boolean a(String str, int i, int i2) {
        int i3 = i + 2;
        return i3 < i2 && str.charAt(i) == '%' && f8.a(str.charAt(i + 1)) != -1 && f8.a(str.charAt(i3)) != -1;
    }

    public static void a(StringBuilder sb, List<String> list) {
        int size = list.size();
        for (int i = 0; i < size; i += 2) {
            String str = list.get(i);
            String str2 = list.get(i + 1);
            if (i > 0) {
                sb.append('&');
            }
            sb.append(str);
            if (str2 != null) {
                sb.append('=');
                sb.append(str2);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0039  */
    public static void a(bb bbVar, String str, int i, int i2, boolean z) {
        int i3;
        while (i < i2) {
            int iCodePointAt = str.codePointAt(i);
            if (iCodePointAt == 37 && (i3 = i + 2) < i2) {
                int iA = f8.a(str.charAt(i + 1));
                int iA2 = f8.a(str.charAt(i3));
                if (iA == -1 || iA2 == -1) {
                    bbVar.c(iCodePointAt);
                } else {
                    bbVar.writeByte((iA << 4) + iA2);
                    i = i3;
                }
            } else if (iCodePointAt == 43 && z) {
                bbVar.writeByte(32);
            } else {
                bbVar.c(iCodePointAt);
            }
            i += Character.charCount(iCodePointAt);
        }
    }

    public static void a(bb bbVar, String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4, @Nullable Charset charset) {
        bb bbVar2 = null;
        while (i < i2) {
            int iCodePointAt = str.codePointAt(i);
            if (!z || (iCodePointAt != 9 && iCodePointAt != 10 && iCodePointAt != 12 && iCodePointAt != 13)) {
                if (iCodePointAt == 43 && z3) {
                    bbVar.a(z ? Marker.ANY_NON_NULL_MARKER : "%2B");
                } else if (iCodePointAt < 32 || iCodePointAt == 127 || ((iCodePointAt >= 128 && z4) || str2.indexOf(iCodePointAt) != -1 || (iCodePointAt == 37 && (!z || (z2 && !a(str, i, i2)))))) {
                    if (bbVar2 == null) {
                        bbVar2 = new bb();
                    }
                    if (charset == null || charset.equals(StandardCharsets.UTF_8)) {
                        bbVar2.c(iCodePointAt);
                    } else {
                        bbVar2.a(str, i, Character.charCount(iCodePointAt) + i, charset);
                    }
                    while (!bbVar2.i()) {
                        try {
                            byte b2 = bbVar2.readByte();
                            bbVar.writeByte(37);
                            char[] cArr = j;
                            bbVar.writeByte((int) cArr[((b2 & 255) >> 4) & 15]);
                            bbVar.writeByte((int) cArr[b2 & 15]);
                        } catch (EOFException e) {
                            throw new AssertionError(e);
                        }
                    }
                } else {
                    bbVar.c(iCodePointAt);
                }
            }
            i += Character.charCount(iCodePointAt);
        }
    }

    private List<String> a(List<String> list, boolean z) {
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            String str = list.get(i);
            arrayList.add(str != null ? a(str, z) : null);
        }
        return Collections.unmodifiableList(arrayList);
    }

    public static String a(String str, boolean z) {
        return a(str, 0, str.length(), z);
    }

    public static String a(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, @Nullable Charset charset) {
        return a(str, 0, str.length(), str2, z, z2, z3, z4, charset);
    }

    public static String a(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4) {
        return a(str, 0, str.length(), str2, z, z2, z3, z4, null);
    }

    public static String a(String str, int i, int i2, boolean z) {
        for (int i3 = i; i3 < i2; i3++) {
            char cCharAt = str.charAt(i3);
            if (cCharAt == '%' || (cCharAt == '+' && z)) {
                bb bbVar = new bb();
                bbVar.a(str, i, i3);
                a(bbVar, str, i3, i2, z);
                return bbVar.o();
            }
        }
        return str.substring(i, i2);
    }

    public static String a(String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4, @Nullable Charset charset) {
        int iCharCount = i;
        while (iCharCount < i2) {
            int iCodePointAt = str.codePointAt(iCharCount);
            if (iCodePointAt >= 32 && iCodePointAt != 127 && (iCodePointAt < 128 || !z4)) {
                if (str2.indexOf(iCodePointAt) == -1 && ((iCodePointAt != 37 || (z && (!z2 || a(str, iCharCount, i2)))) && (iCodePointAt != 43 || !z3))) {
                    iCharCount += Character.charCount(iCodePointAt);
                }
            }
            bb bbVar = new bb();
            bbVar.a(str, i, iCharCount);
            a(bbVar, str, iCharCount, i2, str2, z, z2, z3, z4, charset);
            return bbVar.o();
        }
        return str.substring(i, i2);
    }

    @Nullable
    public static m7 a(URL url) {
        return g(url.toString());
    }

    @Nullable
    public static m7 a(URI uri) {
        return g(uri.toString());
    }

    public m7(a aVar) {
        this.f15089a = aVar.f15092a;
        this.f15090b = a(aVar.f15093b, false);
        this.f15091c = a(aVar.f15094c, false);
        this.d = aVar.d;
        this.e = aVar.b();
        this.f = a(aVar.f, false);
        List<String> list = aVar.g;
        this.g = list != null ? a(list, true) : null;
        String str = aVar.h;
        this.h = str != null ? a(str, false) : null;
        this.i = aVar.toString();
    }
}
