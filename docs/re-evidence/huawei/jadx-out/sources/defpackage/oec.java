package defpackage;

import java.io.IOException;
import java.net.CookieManager;
import java.net.CookiePolicy;
import java.net.CookieStore;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import okhttp3.Cookie;
import okhttp3.CookieJar;
import okhttp3.HttpUrl;

/* JADX INFO: loaded from: classes12.dex */
public class oec extends CookieManager implements CookieJar {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f44226a = "WebkitCookieProxy";
    private android.webkit.CookieManager d;

    public oec() {
        this(null, null);
    }

    oec(CookieStore cookieStore, CookiePolicy cookiePolicy) {
        super(cookieStore, cookiePolicy);
        this.d = android.webkit.CookieManager.getInstance();
    }

    @Override // okhttp3.CookieJar
    public void saveFromResponse(HttpUrl httpUrl, List<Cookie> list) {
        HashMap map = new HashMap();
        ArrayList arrayList = new ArrayList();
        for (Cookie cookie : list) {
            if (cookie != null) {
                arrayList.add(cookie.toString());
            }
        }
        map.put("Set-Cookie", arrayList);
        try {
            put(httpUrl.uri(), map);
        } catch (IOException e) {
            ocq.a(f44226a, "saveFromResponse header put cookie error", e);
        }
    }

    @Override // okhttp3.CookieJar
    public List<Cookie> loadForRequest(HttpUrl httpUrl) {
        ArrayList arrayList = new ArrayList();
        try {
            Iterator<List<String>> it = get(httpUrl.uri(), new HashMap()).values().iterator();
            while (it.hasNext()) {
                Iterator<String> it2 = it.next().iterator();
                while (it2.hasNext()) {
                    for (String str : it2.next().split(";")) {
                        arrayList.add(Cookie.parse(httpUrl, str));
                    }
                }
            }
        } catch (IOException e) {
            ocq.a(f44226a, "loadForRequest IOException", e);
        }
        return arrayList;
    }

    @Override // java.net.CookieManager, java.net.CookieHandler
    public void put(URI uri, Map<String, List<String>> map) throws IOException {
        if (uri == null || map == null) {
            ocq.c(f44226a, "put uri or responseHeaders is null.");
            return;
        }
        String string = uri.toString();
        Iterator<Map.Entry<String, List<String>>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            String key = it.next().getKey();
            if (key != null && (key.equalsIgnoreCase("Set-Cookie2") || key.equalsIgnoreCase("Set-Cookie"))) {
                Iterator<String> it2 = map.get(key).iterator();
                while (it2.hasNext()) {
                    this.d.setCookie(string, it2.next());
                }
            }
        }
    }

    @Override // java.net.CookieManager, java.net.CookieHandler
    public Map<String, List<String>> get(URI uri, Map<String, List<String>> map) throws IOException {
        if (uri == null || map == null) {
            ocq.c(f44226a, "get uri or responseHeaders is null.");
            throw new IllegalArgumentException("get uri or responseHeaders is null");
        }
        String string = uri.toString();
        HashMap map2 = new HashMap();
        String cookie = this.d.getCookie(string);
        if (cookie != null) {
            map2.put("Cookie", Arrays.asList(cookie));
        }
        return map2;
    }

    @Override // java.net.CookieManager
    public CookieStore getCookieStore() {
        throw new UnsupportedOperationException();
    }
}
