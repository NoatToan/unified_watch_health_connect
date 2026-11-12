package com.huawei.hms.network.embedded;

import java.nio.charset.Charset;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes34.dex */
public final class o7 {
    public static final String e = "([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)";
    public static final String f = "\"([^\"]*)\"";
    public static final Pattern g = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");
    public static final Pattern h = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15147a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f15148b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f15149c;

    @Nullable
    public final String d;

    public String toString() {
        return this.f15147a;
    }

    public int hashCode() {
        return this.f15147a.hashCode();
    }

    public boolean equals(@Nullable Object obj) {
        return (obj instanceof o7) && ((o7) obj).f15147a.equals(this.f15147a);
    }

    public String c() {
        return this.f15148b;
    }

    public String b() {
        return this.f15149c;
    }

    @Nullable
    public Charset a(@Nullable Charset charset) {
        try {
            String str = this.d;
            return str != null ? Charset.forName(str) : charset;
        } catch (IllegalArgumentException unused) {
            return charset;
        }
    }

    @Nullable
    public Charset a() {
        return a((Charset) null);
    }

    @Nullable
    public static o7 b(String str) {
        try {
            return a(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public static o7 a(String str) {
        Matcher matcher = g.matcher(str);
        if (!matcher.lookingAt()) {
            throw new IllegalArgumentException("No subtype found for: \"" + str + '\"');
        }
        String lowerCase = matcher.group(1).toLowerCase(Locale.US);
        String lowerCase2 = matcher.group(2).toLowerCase(Locale.US);
        Matcher matcher2 = h.matcher(str);
        String str2 = null;
        for (int iEnd = matcher.end(); iEnd < str.length(); iEnd = matcher2.end()) {
            matcher2.region(iEnd, str.length());
            if (!matcher2.lookingAt()) {
                throw new IllegalArgumentException("Parameter is not formatted correctly: \"" + str.substring(iEnd) + "\" for: \"" + str + '\"');
            }
            String strGroup = matcher2.group(1);
            if (strGroup != null && strGroup.equalsIgnoreCase("charset")) {
                String strGroup2 = matcher2.group(2);
                if (strGroup2 == null) {
                    strGroup2 = matcher2.group(3);
                } else if (strGroup2.startsWith("'") && strGroup2.endsWith("'") && strGroup2.length() > 2) {
                    strGroup2 = strGroup2.substring(1, strGroup2.length() - 1);
                }
                if (str2 != null && !strGroup2.equalsIgnoreCase(str2)) {
                    throw new IllegalArgumentException("Multiple charsets defined: \"" + str2 + "\" and: \"" + strGroup2 + "\" for: \"" + str + '\"');
                }
                str2 = strGroup2;
            }
        }
        return new o7(str, lowerCase, lowerCase2, str2);
    }

    public o7(String str, String str2, String str3, @Nullable String str4) {
        this.f15147a = str;
        this.f15148b = str2;
        this.f15149c = str3;
        this.d = str4;
    }
}
