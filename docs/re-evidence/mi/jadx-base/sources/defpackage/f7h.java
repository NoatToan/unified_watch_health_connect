package defpackage;

import android.content.Context;
import java.io.File;
import java.security.Provider;
import java.security.Security;
import java.util.concurrent.TimeUnit;
import okhttp3.Cache;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: classes4.dex */
public class f7h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static OkHttpClient f17501a;

    public static OkHttpClient a() {
        return c().build();
    }

    public static OkHttpClient b(Context context) {
        return d(context).build();
    }

    public static OkHttpClient.Builder c() {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        OkHttpClient.Builder builderCookieJar = builder.connectTimeout(0L, timeUnit).readTimeout(0L, timeUnit).writeTimeout(0L, timeUnit).cookieJar(new vcj());
        try {
            Security.insertProviderAt((Provider) Class.forName("org.conscrypt.OpenSSLProvider").newInstance(), 1);
            return builderCookieJar;
        } catch (Exception unused) {
            return f(builderCookieJar);
        }
    }

    public static OkHttpClient.Builder d(Context context) {
        return e(context, 10485760);
    }

    public static OkHttpClient.Builder e(Context context, int i) {
        OkHttpClient.Builder builderC = c();
        return i == 0 ? builderC : builderC.cache(new Cache(new File(context.getCacheDir(), "http-cache"), i));
    }

    public static OkHttpClient.Builder f(OkHttpClient.Builder builder) {
        return builder;
    }

    public static OkHttpClient g() {
        if (f17501a == null) {
            f17501a = a();
        }
        return f17501a;
    }
}
