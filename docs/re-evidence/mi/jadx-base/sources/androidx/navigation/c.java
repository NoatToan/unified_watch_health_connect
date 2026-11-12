package androidx.navigation;

import android.net.Uri;
import android.os.Bundle;
import io.sentry.SentryOptions;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class c {
    public static final Pattern j = Pattern.compile("^[a-zA-Z]+[+\\w\\-.]*:");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList<String> f2668a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map<String, C0047c> f2669b;
    public Pattern c;
    public boolean d;
    public boolean e;
    public final String f;
    public final String g;
    public Pattern h;
    public final String i;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f2670a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f2671b;
        public String c;

        public c a() {
            return new c(this.f2670a, this.f2671b, this.c);
        }

        public a b(String str) {
            if (str.isEmpty()) {
                throw new IllegalArgumentException("The NavDeepLink cannot have an empty action.");
            }
            this.f2671b = str;
            return this;
        }

        public a c(String str) {
            this.c = str;
            return this;
        }

        public a d(String str) {
            this.f2670a = str;
            return this;
        }
    }

    public static class b implements Comparable<b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f2672a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f2673b;

        public b(String str) {
            String[] strArrSplit = str.split("/", -1);
            this.f2672a = strArrSplit[0];
            this.f2673b = strArrSplit[1];
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(b bVar) {
            int i = this.f2672a.equals(bVar.f2672a) ? 2 : 0;
            return this.f2673b.equals(bVar.f2673b) ? i + 1 : i;
        }
    }

    /* JADX INFO: renamed from: androidx.navigation.c$c, reason: collision with other inner class name */
    public static class C0047c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f2674a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ArrayList<String> f2675b = new ArrayList<>();

        public void a(String str) {
            this.f2675b.add(str);
        }

        public String b(int i) {
            return this.f2675b.get(i);
        }

        public String c() {
            return this.f2674a;
        }

        public void d(String str) {
            this.f2674a = str;
        }

        public int e() {
            return this.f2675b.size();
        }
    }

    public c(String str, String str2, String str3) {
        this.f2668a = new ArrayList<>();
        this.f2669b = new HashMap();
        this.c = null;
        int i = 0;
        this.d = false;
        this.e = false;
        this.h = null;
        this.f = str;
        this.g = str2;
        this.i = str3;
        if (str != null) {
            Uri uri = Uri.parse(str);
            this.e = uri.getQuery() != null;
            StringBuilder sb = new StringBuilder("^");
            if (!j.matcher(str).find()) {
                sb.append("http[s]?://");
            }
            Pattern patternCompile = Pattern.compile("\\{(.+?)\\}");
            if (this.e) {
                Matcher matcher = Pattern.compile("(\\?)").matcher(str);
                if (matcher.find()) {
                    a(str.substring(0, matcher.start()), sb, patternCompile);
                }
                this.d = false;
                for (String str4 : uri.getQueryParameterNames()) {
                    StringBuilder sb2 = new StringBuilder();
                    String queryParameter = uri.getQueryParameter(str4);
                    Matcher matcher2 = patternCompile.matcher(queryParameter);
                    C0047c c0047c = new C0047c();
                    int iEnd = i;
                    while (matcher2.find()) {
                        c0047c.a(matcher2.group(1));
                        sb2.append(Pattern.quote(queryParameter.substring(iEnd, matcher2.start())));
                        sb2.append("(.+?)?");
                        iEnd = matcher2.end();
                    }
                    if (iEnd < queryParameter.length()) {
                        sb2.append(Pattern.quote(queryParameter.substring(iEnd)));
                    }
                    c0047c.d(sb2.toString().replace(SentryOptions.DEFAULT_PROPAGATION_TARGETS, "\\E.*\\Q"));
                    this.f2669b.put(str4, c0047c);
                    i = 0;
                }
            } else {
                this.d = a(str, sb, patternCompile);
            }
            this.c = Pattern.compile(sb.toString().replace(SentryOptions.DEFAULT_PROPAGATION_TARGETS, "\\E.*\\Q"), 2);
        }
        if (str3 != null) {
            if (!Pattern.compile("^[\\s\\S]+/[\\s\\S]+$").matcher(str3).matches()) {
                throw new IllegalArgumentException("The given mimeType " + str3 + " does not match to required \"type/subtype\" format");
            }
            b bVar = new b(str3);
            this.h = Pattern.compile(("^(" + bVar.f2672a + "|[*]+)/(" + bVar.f2673b + "|[*]+)$").replace("*|[*]", "[\\s\\S]"));
        }
    }

    public final boolean a(String str, StringBuilder sb, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        boolean z = !str.contains(SentryOptions.DEFAULT_PROPAGATION_TARGETS);
        int iEnd = 0;
        while (matcher.find()) {
            this.f2668a.add(matcher.group(1));
            sb.append(Pattern.quote(str.substring(iEnd, matcher.start())));
            sb.append("(.+?)");
            iEnd = matcher.end();
            z = false;
        }
        if (iEnd < str.length()) {
            sb.append(Pattern.quote(str.substring(iEnd)));
        }
        sb.append("($|(\\?(.)*))");
        return z;
    }

    public String b() {
        return this.g;
    }

    public Bundle c(Uri uri, Map<String, androidx.navigation.b> map) {
        Matcher matcher;
        Matcher matcher2 = this.c.matcher(uri.toString());
        if (!matcher2.matches()) {
            return null;
        }
        Bundle bundle = new Bundle();
        int size = this.f2668a.size();
        int i = 0;
        while (i < size) {
            String str = this.f2668a.get(i);
            i++;
            if (f(bundle, str, Uri.decode(matcher2.group(i)), map.get(str))) {
                return null;
            }
        }
        if (this.e) {
            for (String str2 : this.f2669b.keySet()) {
                C0047c c0047c = this.f2669b.get(str2);
                String queryParameter = uri.getQueryParameter(str2);
                if (queryParameter != null) {
                    matcher = Pattern.compile(c0047c.c()).matcher(queryParameter);
                    if (!matcher.matches()) {
                        return null;
                    }
                } else {
                    matcher = null;
                }
                for (int i2 = 0; i2 < c0047c.e(); i2++) {
                    String strDecode = matcher != null ? Uri.decode(matcher.group(i2 + 1)) : null;
                    String strB = c0047c.b(i2);
                    androidx.navigation.b bVar = map.get(strB);
                    if (strDecode != null && !strDecode.replaceAll("[{}]", "").equals(strB) && f(bundle, strB, strDecode, bVar)) {
                        return null;
                    }
                }
            }
        }
        return bundle;
    }

    public int d(String str) {
        if (this.i == null || !this.h.matcher(str).matches()) {
            return -1;
        }
        return new b(this.i).compareTo(new b(str));
    }

    public boolean e() {
        return this.d;
    }

    public final boolean f(Bundle bundle, String str, String str2, androidx.navigation.b bVar) {
        if (bVar == null) {
            bundle.putString(str, str2);
            return false;
        }
        try {
            bVar.a().g(bundle, str, str2);
            return false;
        } catch (IllegalArgumentException unused) {
            return true;
        }
    }

    public c(String str) {
        this(str, null, null);
    }
}
