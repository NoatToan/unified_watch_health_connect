package aj;

import android.text.TextUtils;
import ch.qos.logback.core.CoreConstants;
import com.google.common.net.HttpHeaders;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class k implements i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map<String, List<j>> f3357b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile Map<String, String> f3358c;

    public static final class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Map<String, List<j>> f3359b;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Map<String, List<j>> f3360a = f3359b;

        static {
            String property = System.getProperty("http.agent");
            if (!TextUtils.isEmpty(property)) {
                int length = property.length();
                StringBuilder sb3 = new StringBuilder(property.length());
                for (int i14 = 0; i14 < length; i14++) {
                    char cCharAt = property.charAt(i14);
                    if ((cCharAt > 31 || cCharAt == '\t') && cCharAt < 127) {
                        sb3.append(cCharAt);
                    } else {
                        sb3.append('?');
                    }
                }
                property = sb3.toString();
            }
            HashMap map = new HashMap(2);
            if (!TextUtils.isEmpty(property)) {
                map.put(HttpHeaders.USER_AGENT, Collections.singletonList(new b(property)));
            }
            f3359b = Collections.unmodifiableMap(map);
        }
    }

    public static final class b implements j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f3361a;

        public b(String str) {
            this.f3361a = str;
        }

        @Override // aj.j
        public final String a() {
            return this.f3361a;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof b) {
                return this.f3361a.equals(((b) obj).f3361a);
            }
            return false;
        }

        public final int hashCode() {
            return this.f3361a.hashCode();
        }

        public final String toString() {
            return am.j.o(this.f3361a, "'}", new StringBuilder("StringHeaderFactory{value='"));
        }
    }

    public k(Map<String, List<j>> map) {
        this.f3357b = Collections.unmodifiableMap(map);
    }

    public final HashMap a() {
        HashMap map = new HashMap();
        for (Map.Entry<String, List<j>> entry : this.f3357b.entrySet()) {
            List<j> value = entry.getValue();
            StringBuilder sb3 = new StringBuilder();
            int size = value.size();
            for (int i14 = 0; i14 < size; i14++) {
                String strA = value.get(i14).a();
                if (!TextUtils.isEmpty(strA)) {
                    sb3.append(strA);
                    if (i14 != value.size() - 1) {
                        sb3.append(CoreConstants.COMMA_CHAR);
                    }
                }
            }
            String string = sb3.toString();
            if (!TextUtils.isEmpty(string)) {
                map.put(entry.getKey(), string);
            }
        }
        return map;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            return this.f3357b.equals(((k) obj).f3357b);
        }
        return false;
    }

    @Override // aj.i
    public final Map<String, String> getHeaders() {
        if (this.f3358c == null) {
            synchronized (this) {
                try {
                    if (this.f3358c == null) {
                        this.f3358c = Collections.unmodifiableMap(a());
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
        return this.f3358c;
    }

    public final int hashCode() {
        return this.f3357b.hashCode();
    }

    public final String toString() {
        return "LazyHeaders{headers=" + this.f3357b + CoreConstants.CURLY_RIGHT;
    }
}
