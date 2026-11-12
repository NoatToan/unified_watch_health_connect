package com.xiaomi.smarthome.library.http;

import android.text.TextUtils;
import com.xiaomi.smarthome.core.server.internal.util.UserAgentUtil;
import com.xiaomi.smarthome.frame.process.ProcessUtil;
import com.xiaomi.smarthome.library.MiJiaEnvironment;
import com.xiaomi.smarthome.library.common.threadpool.ThreadPoolManager;
import com.xiaomi.smarthome.library.log.MiJiaLog;
import java.io.IOException;
import java.net.CookieManager;
import java.util.concurrent.TimeUnit;
import okhttp3.ConnectionPool;
import okhttp3.Dispatcher;
import okhttp3.Interceptor;
import okhttp3.JavaNetCookieJar;
import okhttp3.OkHttpClient;
import okhttp3.Response;

/* JADX INFO: loaded from: classes2.dex */
public class ClientUtil {
    private static final String TAG = "ClientUtil";
    static CookieManager sCookieManage;
    static ConnectionPool sPool = new ConnectionPool(5, 60000, TimeUnit.MILLISECONDS);
    static Dispatcher sDispatcher = new Dispatcher(ThreadPoolManager.getHttpThreadPool());

    public static OkHttpClient create() {
        String userAgent;
        try {
            userAgent = UserAgentUtil.getUserAgent(MiJiaEnvironment.getAppContext());
        } catch (Exception e) {
            MiJiaLog.onlyLogcat(6, TAG, "create: " + e.getLocalizedMessage());
            userAgent = null;
        }
        return create(userAgent);
    }

    public static OkHttpClient create(final String str) {
        OkHttpClient.Builder builderConnectionPool = new OkHttpClient.Builder().dispatcher(sDispatcher).connectionPool(sPool);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        OkHttpClient.Builder builderWriteTimeout = builderConnectionPool.connectTimeout(20L, timeUnit).readTimeout(30L, timeUnit).writeTimeout(30L, timeUnit);
        CookieManager cookieManager = new CookieManager();
        sCookieManage = cookieManager;
        OkHttpClient.Builder builderCookieJar = builderWriteTimeout.cookieJar(new JavaNetCookieJar(cookieManager));
        if (ProcessUtil.isIsolateProcess(MiJiaEnvironment.getAppContext())) {
            builderCookieJar.cache(null);
        }
        if (!TextUtils.isEmpty(str)) {
            builderCookieJar.addNetworkInterceptor(new Interceptor() { // from class: com.xiaomi.smarthome.library.http.ClientUtil.1
                @Override // okhttp3.Interceptor
                public Response intercept(Interceptor.Chain chain) throws IOException {
                    return chain.proceed(chain.request().newBuilder().removeHeader("User-Agent").addHeader("User-Agent", str).build());
                }
            });
        }
        return builderCookieJar.build();
    }
}
