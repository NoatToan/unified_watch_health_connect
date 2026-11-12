package defpackage;

import java.util.HashMap;
import okhttp3.CookieJar;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: classes2.dex */
public class ftk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public HashMap<String, etk> f18230a = new HashMap<>();

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ftk f18231a = new ftk();
    }

    public static ftk e() {
        return a.f18231a;
    }

    public etk a(String str, CookieJar cookieJar) {
        etk etkVar = this.f18230a.get(str);
        if (etkVar != null) {
            return etkVar;
        }
        etk etkVarE = new etk.b().c(str).g(d(cookieJar)).b(c4b.f()).a(m5l.d()).e();
        this.f18230a.put(str, etkVarE);
        return etkVarE;
    }

    public <T> T b(Class<T> cls, String str) {
        return (T) c(cls, str, null);
    }

    public <T> T c(Class<T> cls, String str, CookieJar cookieJar) {
        return (T) a(str, cookieJar).b(cls);
    }

    public final OkHttpClient d(CookieJar cookieJar) {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        builder.addInterceptor(new amb()).addInterceptor(new f64());
        if (cookieJar != null) {
            builder.cookieJar(cookieJar);
        }
        return builder.build();
    }
}
