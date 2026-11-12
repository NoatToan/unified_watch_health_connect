package defpackage;

import android.text.TextUtils;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class ymk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f40331a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final URI f40332b;
    public final Map<String, String> c;
    public final Map<String, String> d;
    public final boolean e;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public URI f40333a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Map<String, String> f40334b;
        public Map<String, String> c;
        public boolean d = true;

        public b a(String str) {
            String str2;
            if (TextUtils.isEmpty(str)) {
                return this;
            }
            URI uri = this.f40333a;
            String query = uri.getQuery();
            if (query == null) {
                str2 = str;
            } else {
                str2 = query + gv5.CONNECT_STR + str;
            }
            try {
                this.f40333a = new URI(uri.getScheme(), uri.getAuthority(), uri.getPath(), str2, uri.getFragment());
                return this;
            } catch (URISyntaxException unused) {
                throw new IllegalArgumentException("unexpected newQuery: " + str);
            }
        }

        public ymk b() {
            return new ymk(this);
        }

        public b c(boolean z) {
            this.d = z;
            return this;
        }

        public b d(Map<String, String> map) {
            this.c = map;
            return this;
        }

        public b e(Map<String, String> map) {
            this.f40334b = map;
            return this;
        }

        public b f(Map<String, String> map) {
            a(w4f.c(map));
            return this;
        }

        public b g(String str) {
            if (this.f40334b == null) {
                this.f40334b = new HashMap();
            }
            this.f40334b.put("User-Agent", str);
            return this;
        }

        public b h(String str) {
            try {
                this.f40333a = new URI(str);
                return this;
            } catch (URISyntaxException unused) {
                throw new IllegalArgumentException("unexpected url: " + str);
            }
        }
    }

    public ymk(b bVar) {
        URI uri = bVar.f40333a;
        this.f40332b = uri;
        this.f40331a = uri.toString();
        this.c = bVar.f40334b;
        this.d = bVar.c;
        this.e = bVar.d;
    }
}
