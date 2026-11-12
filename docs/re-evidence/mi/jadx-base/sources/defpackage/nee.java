package defpackage;

import android.text.TextUtils;
import androidx.annotation.VisibleForTesting;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes4.dex */
public final class nee implements dmb {
    public final Map<String, List<mee>> c;
    public volatile Map<String, String> d;

    public static final class a {
        public static final String d;
        public static final Map<String, List<mee>> e;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f27850a = true;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Map<String, List<mee>> f27851b = e;
        public boolean c = true;

        static {
            String strG = g();
            d = strG;
            HashMap map = new HashMap(2);
            if (!TextUtils.isEmpty(strG)) {
                map.put("User-Agent", Collections.singletonList(new b(strG)));
            }
            e = Collections.unmodifiableMap(map);
        }

        @VisibleForTesting
        public static String g() {
            String property = System.getProperty("http.agent");
            if (TextUtils.isEmpty(property)) {
                return property;
            }
            int length = property.length();
            StringBuilder sb = new StringBuilder(property.length());
            for (int i = 0; i < length; i++) {
                char cCharAt = property.charAt(i);
                if ((cCharAt > 31 || cCharAt == '\t') && cCharAt < 127) {
                    sb.append(cCharAt);
                } else {
                    sb.append('?');
                }
            }
            return sb.toString();
        }

        public a a(String str, mee meeVar) {
            if (this.c && "User-Agent".equalsIgnoreCase(str)) {
                return h(str, meeVar);
            }
            e();
            f(str).add(meeVar);
            return this;
        }

        public a b(String str, String str2) {
            return a(str, new b(str2));
        }

        public nee c() {
            this.f27850a = true;
            return new nee(this.f27851b);
        }

        public final Map<String, List<mee>> d() {
            HashMap map = new HashMap(this.f27851b.size());
            for (Map.Entry<String, List<mee>> entry : this.f27851b.entrySet()) {
                map.put(entry.getKey(), new ArrayList(entry.getValue()));
            }
            return map;
        }

        public final void e() {
            if (this.f27850a) {
                this.f27850a = false;
                this.f27851b = d();
            }
        }

        public final List<mee> f(String str) {
            List<mee> list = this.f27851b.get(str);
            if (list != null) {
                return list;
            }
            ArrayList arrayList = new ArrayList();
            this.f27851b.put(str, arrayList);
            return arrayList;
        }

        public a h(String str, mee meeVar) {
            e();
            if (meeVar == null) {
                this.f27851b.remove(str);
            } else {
                List<mee> listF = f(str);
                listF.clear();
                listF.add(meeVar);
            }
            if (this.c && "User-Agent".equalsIgnoreCase(str)) {
                this.c = false;
            }
            return this;
        }
    }

    public static final class b implements mee {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f27852a;

        public b(String str) {
            this.f27852a = str;
        }

        @Override // defpackage.mee
        public String a() {
            return this.f27852a;
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                return this.f27852a.equals(((b) obj).f27852a);
            }
            return false;
        }

        public int hashCode() {
            return this.f27852a.hashCode();
        }

        public String toString() {
            return "StringHeaderFactory{value='" + this.f27852a + '\'' + AbstractJsonLexerKt.END_OBJ;
        }
    }

    public nee(Map<String, List<mee>> map) {
        this.c = Collections.unmodifiableMap(map);
    }

    @Override // defpackage.dmb
    public Map<String, String> a() {
        if (this.d == null) {
            synchronized (this) {
                try {
                    if (this.d == null) {
                        this.d = Collections.unmodifiableMap(c());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.d;
    }

    public final String b(List<mee> list) {
        StringBuilder sb = new StringBuilder();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            String strA = list.get(i).a();
            if (!TextUtils.isEmpty(strA)) {
                sb.append(strA);
                if (i != list.size() - 1) {
                    sb.append(',');
                }
            }
        }
        return sb.toString();
    }

    public final Map<String, String> c() {
        HashMap map = new HashMap();
        for (Map.Entry<String, List<mee>> entry : this.c.entrySet()) {
            String strB = b(entry.getValue());
            if (!TextUtils.isEmpty(strB)) {
                map.put(entry.getKey(), strB);
            }
        }
        return map;
    }

    public boolean equals(Object obj) {
        if (obj instanceof nee) {
            return this.c.equals(((nee) obj).c);
        }
        return false;
    }

    public int hashCode() {
        return this.c.hashCode();
    }

    public String toString() {
        return "LazyHeaders{headers=" + this.c + AbstractJsonLexerKt.END_OBJ;
    }
}
