package com.xiaomi.smarthome.core.server.internal.api;

import android.content.BroadcastReceiver;
import android.text.TextUtils;
import com.xiaomi.smarthome.core.entity.net.NetError;
import com.xiaomi.smarthome.core.entity.net.NetRequest;
import com.xiaomi.smarthome.core.entity.net.NetResult;
import com.xiaomi.smarthome.core.server.internal.NetCallback;
import com.xiaomi.smarthome.core.server.internal.NetHandle;
import com.xiaomi.smarthome.core.server.internal.globaldynamicsetting.GlobalDynamicSettingManager;
import com.xiaomi.smarthome.core.server.internal.util.KeyValuePairUtil;
import com.xiaomi.smarthome.core.server.internal.util.LocaleUtil;
import com.xiaomi.smarthome.core.server.internal.util.UserAgentUtil;
import com.xiaomi.smarthome.frame.ErrorCode;
import com.xiaomi.smarthome.frame.server_compact.ServerBean;
import com.xiaomi.smarthome.frame.server_compact.ServerCompact;
import com.xiaomi.smarthome.library.MiJiaEnvironment;
import com.xiaomi.smarthome.library.common.threadpool.ThreadPoolManager;
import com.xiaomi.smarthome.library.commonapi.SystemApi;
import com.xiaomi.smarthome.library.http.util.CookieUtil;
import com.xiaomi.smarthome.localcontrol.common.util.NetUtil;
import com.xiaomi.smarthome.setting.LoginSetting;
import com.xiaomi.smarthome.utils.ExtsKt;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.CookieManager;
import java.net.URLEncoder;
import java.util.concurrent.TimeUnit;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Dispatcher;
import okhttp3.FormBody;
import okhttp3.Interceptor;
import okhttp3.JavaNetCookieJar;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

/* JADX INFO: loaded from: classes10.dex */
public class SmartHomeOAuthHttpsApi {
    public static final String SMART_HOME_API = "https://api.io.mi.com";
    private static BroadcastReceiver mLocaleChangedReceiver;
    private static volatile SmartHomeOAuthHttpsApi sInstance;
    private static Object sLock = new Object();
    private CookieManager mCookieManager;
    private boolean mIsInitialized = false;
    private OkHttpClient mOkHttpClient;

    private SmartHomeOAuthHttpsApi() {
        OkHttpClient.Builder builderDispatcher = new OkHttpClient.Builder().dispatcher(new Dispatcher(ThreadPoolManager.getHttpThreadPool()));
        TimeUnit timeUnit = TimeUnit.SECONDS;
        OkHttpClient.Builder builderWriteTimeout = builderDispatcher.connectTimeout(20L, timeUnit).readTimeout(30L, timeUnit).writeTimeout(30L, timeUnit);
        CookieManager cookieManager = new CookieManager();
        this.mCookieManager = cookieManager;
        this.mOkHttpClient = builderWriteTimeout.cookieJar(new JavaNetCookieJar(cookieManager)).addNetworkInterceptor(new Interceptor() { // from class: com.xiaomi.smarthome.core.server.internal.api.SmartHomeOAuthHttpsApi.1
            @Override // okhttp3.Interceptor
            public Response intercept(Interceptor.Chain chain) throws IOException {
                return chain.proceed(chain.request().newBuilder().removeHeader("User-Agent").addHeader("User-Agent", UserAgentUtil.getUserAgent(MiJiaEnvironment.getAppContext())).build());
            }
        }).build();
    }

    private String buildUrl(NetRequest netRequest) {
        ServerBean server = GlobalDynamicSettingManager.getInstance().getServer();
        if (server == null || ServerCompact.isChinaMainLand(server)) {
            return NetUtil.MIOT_API_HOST + netRequest.getPath();
        }
        return "https://" + server.machineCode + ".api.io.mi.com/app" + netRequest.getPath();
    }

    public static SmartHomeOAuthHttpsApi getInstance() {
        if (sInstance == null) {
            synchronized (sLock) {
                try {
                    if (sInstance == null) {
                        sInstance = new SmartHomeOAuthHttpsApi();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return sInstance;
    }

    private void setLocaleCookie() {
        CookieUtil.addCookie(this.mCookieManager, SMART_HOME_API, "locale", LocaleUtil.getNewCodeLocaleString(LocaleUtil.getCurrentLocale(MiJiaEnvironment.getAppContext())), LoginSetting.COOKIE_DOMAIN_XIAOMI_IO, "/");
    }

    private void setTimezoneCookie() {
        String strEncode;
        try {
            strEncode = URLEncoder.encode(SystemApi.getInstance().getTimeZone(), "UTF-8");
        } catch (UnsupportedEncodingException unused) {
            strEncode = "";
        }
        CookieUtil.addCookie(this.mCookieManager, SMART_HOME_API, "timezone", strEncode, LoginSetting.COOKIE_DOMAIN_XIAOMI_IO, "/");
    }

    public boolean isInitialized() {
        boolean z;
        synchronized (sLock) {
            z = this.mIsInitialized;
        }
        return z;
    }

    public NetHandle sendRequest(NetRequest netRequest, final NetCallback<NetResult, NetError> netCallback) {
        Request requestBuild;
        if (netRequest == null) {
            if (netCallback != null) {
                netCallback.onFailure(new NetError(ErrorCode.INVALID.getCode(), "SmartHomeOAuthHttpsApi.sendRequest(netRequest=null)"));
            }
            return new NetHandle(null);
        }
        String strBuildUrl = buildUrl(netRequest);
        if (netRequest.getMethod().equals("POST")) {
            RequestBody requestBody = KeyValuePairUtil.getRequestBody(netRequest.getQueryParams());
            Request.Builder builderHeaders = new Request.Builder().url(strBuildUrl).headers(KeyValuePairUtil.getHeaders(netRequest.getHeaders()));
            if (requestBody == null) {
                requestBody = new FormBody.Builder().build();
            }
            requestBuild = builderHeaders.post(requestBody).build();
        } else {
            requestBuild = netRequest.getMethod().equals("GET") ? new Request.Builder().url(KeyValuePairUtil.getUrlWithQueryString(strBuildUrl, netRequest.getQueryParams())).headers(KeyValuePairUtil.getHeaders(netRequest.getHeaders())).build() : null;
        }
        if (requestBuild == null) {
            if (netCallback != null) {
                netCallback.onFailure(new NetError(ErrorCode.INVALID.getCode(), "SmartHomeOAuthHttpsApi.sendRequest(request=null)"));
            }
            return new NetHandle(null);
        }
        Call callNewCall = this.mOkHttpClient.newCall(requestBuild);
        callNewCall.enqueue(new Callback() { // from class: com.xiaomi.smarthome.core.server.internal.api.SmartHomeOAuthHttpsApi.2
            @Override // okhttp3.Callback
            public void onFailure(Call call, IOException iOException) {
                NetCallback netCallback2 = netCallback;
                if (netCallback2 != null) {
                    netCallback2.onFailure(new NetError(ErrorCode.INVALID.getCode(), ExtsKt.getString(iOException)));
                }
            }

            @Override // okhttp3.Callback
            public void onResponse(Call call, Response response) throws IOException {
                if (!response.isSuccessful()) {
                    if (response.code() == 401) {
                        try {
                            response.body().string();
                        } catch (Exception unused) {
                        }
                    }
                    NetCallback netCallback2 = netCallback;
                    if (netCallback2 != null) {
                        netCallback2.onFailure(new NetError(response.code(), ""));
                        return;
                    }
                    return;
                }
                try {
                    String strString = response.body().string();
                    if (MiJiaEnvironment.isDebugBuildType() || MiJiaEnvironment.isSdkBuildType()) {
                        TextUtils.isEmpty(strString);
                    }
                    NetResult netResult = new NetResult();
                    netResult.mResponse = strString;
                    NetCallback netCallback3 = netCallback;
                    if (netCallback3 != null) {
                        netCallback3.onSuccess(netResult);
                    }
                } catch (Exception e) {
                    if (netCallback != null) {
                        netCallback.onFailure(new NetError(ErrorCode.INVALID.getCode(), ExtsKt.getString(e)));
                    }
                }
            }
        });
        return new NetHandle(callNewCall);
    }

    public void setInitialized(boolean z) {
        synchronized (sLock) {
            this.mIsInitialized = z;
        }
    }
}
