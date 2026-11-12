package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import okhttp3.Cookie;
import okhttp3.CookieJar;
import okhttp3.Headers;
import okhttp3.HttpUrl;

/* JADX INFO: loaded from: classes4.dex */
public class vcj implements kk4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public CookieJar f36747a = null;

    @Override // defpackage.kk4
    public void a() {
        this.f36747a = null;
    }

    @Override // defpackage.kk4
    public void b(CookieJar cookieJar) {
        this.f36747a = cookieJar;
    }

    @Override // okhttp3.CookieJar
    public List<Cookie> loadForRequest(HttpUrl httpUrl) {
        CookieJar cookieJar = this.f36747a;
        if (cookieJar == null) {
            return Collections.emptyList();
        }
        List<Cookie> listLoadForRequest = cookieJar.loadForRequest(httpUrl);
        ArrayList arrayList = new ArrayList();
        for (Cookie cookie : listLoadForRequest) {
            try {
                new Headers.Builder().add(cookie.name(), cookie.value());
                arrayList.add(cookie);
            } catch (IllegalArgumentException unused) {
            }
        }
        return arrayList;
    }

    @Override // okhttp3.CookieJar
    public void saveFromResponse(HttpUrl httpUrl, List<Cookie> list) {
        CookieJar cookieJar = this.f36747a;
        if (cookieJar != null) {
            cookieJar.saveFromResponse(httpUrl, list);
        }
    }
}
