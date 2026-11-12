package defpackage;

import com.facebook.react.bridge.ReactContext;
import com.google.android.exoplayer2.upstream.HttpDataSource;
import com.google.android.exoplayer2.upstream.a;
import com.google.android.exoplayer2.upstream.d;
import java.util.Map;
import okhttp3.JavaNetCookieJar;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: classes4.dex */
public class fp5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static a.InterfaceC0205a f18046a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static String f18047b;

    public static a.InterfaceC0205a a(ReactContext reactContext, pt5 pt5Var, Map<String, String> map) {
        return new d(reactContext, pt5Var, b(reactContext, pt5Var, map));
    }

    public static HttpDataSource.b b(ReactContext reactContext, pt5 pt5Var, Map<String, String> map) {
        OkHttpClient okHttpClientG = f7h.g();
        ((kk4) okHttpClientG.cookieJar()).b(new JavaNetCookieJar(new l1a(reactContext)));
        h7h h7hVar = new h7h(okHttpClientG, d(reactContext), pt5Var);
        if (map != null) {
            h7hVar.c().b(map);
        }
        return h7hVar;
    }

    public static a.InterfaceC0205a c(ReactContext reactContext, pt5 pt5Var, Map<String, String> map) {
        if (f18046a == null || (map != null && !map.isEmpty())) {
            f18046a = a(reactContext, pt5Var, map);
        }
        return f18046a;
    }

    public static String d(ReactContext reactContext) {
        if (f18047b == null) {
            f18047b = wlq.h0(reactContext, "ReactNativeVideo");
        }
        return f18047b;
    }
}
