package com.ximalaya.ting.android.opensdk.httputil;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import com.ximalaya.ting.android.opensdk.constants.ConstantsOpenSdk;
import com.ximalaya.ting.android.opensdk.httputil.util.freeflow.FreeFlowServiceUtil;
import com.ximalaya.ting.android.opensdk.util.Logger;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import okhttp3.Cache;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.ConnectionPool;
import okhttp3.Dispatcher;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes22.dex */
public class BaseCall {
    public static String COLLECTOR_SWITCH = "x-a1-xdcs-collector-switch";
    public static int DEFAULT_TIMEOUT = 0;
    public static int DEFAULT_TIMEOUT_SHORT = 3000;
    public static int ERROR_CODE_DEFALUT = 603;
    public static String HTTPDNS_SWITCH = "x-a1-httpdns-switch";
    public static final String NET_ERR_CONTENT = "网络请求失败";
    public static boolean isEnableDnsCache = false;
    public static boolean isEnableXdcsCollect = true;
    private static Context mContext;
    private static volatile BaseCall singleton;
    private IIgnoreProxyUrl mIgnoreProxy;
    private OkHttpClient okHttpClient = new OkHttpClient();
    private OkHttpClient okHttpClientNotProxy;

    public interface IIgnoreProxyUrl {
        boolean isIgnoreUrl(URL url);
    }

    private BaseCall() {
    }

    public static Response doSync(OkHttpClient okHttpClient, Request request) throws Exception {
        return FirebasePerfOkHttpClient.execute(okHttpClient.newCall(AddDeviceInfoUtil.setDeviceInfo(request)));
    }

    public static synchronized BaseCall getInstanse() {
        if (singleton == null) {
            synchronized (BaseCall.class) {
                if (singleton == null) {
                    singleton = new BaseCall();
                }
            }
        }
        return singleton;
    }

    private static String getMsg(Response response, String str) {
        try {
            JSONObject jSONObject = new JSONObject(response.body().toString());
            return jSONObject.has("msg") ? jSONObject.getString("msg") : str;
        } catch (Exception e) {
            e.printStackTrace();
            return str;
        }
    }

    @NonNull
    private OkHttpClient getOkHttpClient(@NonNull Request request) {
        if (this.mIgnoreProxy == null || request.url() == null || !this.mIgnoreProxy.isIgnoreUrl(request.url().url())) {
            return request.isHttps() ? getOkHttpClientNotProxy() : this.okHttpClient;
        }
        return getOkHttpClientNotProxy();
    }

    public static void init(Context context) {
        mContext = context;
    }

    public static synchronized void release() {
        if (singleton != null) {
            singleton = null;
        }
    }

    private void setHttpConfigToBuilder(Context context, Config config, OkHttpClient.Builder builder, boolean z) {
        OkHttpClient.Builder builderUpdateProxyToBuilder = FreeFlowServiceUtil.updateProxyToBuilder(context, config, builder, z);
        if (mContext != null) {
            builderUpdateProxyToBuilder.cache(new Cache(new File(mContext.getCacheDir(), "request_cache"), 52428800L));
        }
    }

    public synchronized void addInterceptor(Interceptor interceptor) {
        OkHttpClient okHttpClient = this.okHttpClient;
        if (okHttpClient == null) {
            return;
        }
        OkHttpClient.Builder builderNewBuilder = okHttpClient.newBuilder();
        if (!builderNewBuilder.interceptors().contains(interceptor)) {
            builderNewBuilder.addInterceptor(interceptor);
        }
        this.okHttpClient = builderNewBuilder.build();
    }

    public synchronized void cancleTag(String str) {
        Dispatcher dispatcher;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        OkHttpClient okHttpClient = this.okHttpClient;
        if (okHttpClient != null && (dispatcher = okHttpClient.dispatcher()) != null) {
            for (Call call : dispatcher.runningCalls()) {
                Request request = call.request();
                if (request != null && str.equals(request.tag())) {
                    call.cancel();
                    return;
                }
            }
            for (Call call2 : dispatcher.queuedCalls()) {
                Request request2 = call2.request();
                if (request2 != null && str.equals(request2.tag())) {
                    call2.cancel();
                    return;
                }
            }
        }
    }

    public void doAsync(Request request, IHttpCallBack iHttpCallBack, int i) {
        OkHttpClient okHttpClient = getOkHttpClient(request);
        if (i != DEFAULT_TIMEOUT) {
            OkHttpClient.Builder builderNewBuilder = okHttpClient.newBuilder();
            long j = i;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            builderNewBuilder.connectTimeout(j, timeUnit);
            builderNewBuilder.readTimeout(j, timeUnit);
            builderNewBuilder.writeTimeout(j, timeUnit);
            okHttpClient = builderNewBuilder.build();
        }
        doAsync(okHttpClient, request, iHttpCallBack);
    }

    public OkHttpClient getOkHttpClientNotProxy() {
        return this.okHttpClient;
    }

    public void setHttpConfig(Config config) {
        OkHttpClient.Builder builderNewBuilder = this.okHttpClient.newBuilder();
        setHttpConfigToBuilder(mContext, config, builderNewBuilder, false);
        this.okHttpClient = builderNewBuilder.build();
    }

    public void setIgnoreProxy(IIgnoreProxyUrl iIgnoreProxyUrl) {
        this.mIgnoreProxy = iIgnoreProxyUrl;
    }

    public synchronized void updateOkhttpClient() {
        this.okHttpClient = new OkHttpClient();
    }

    public synchronized void updateOkhttpClientConnectPool() {
        OkHttpClient.Builder builderNewBuilder = this.okHttpClient.newBuilder();
        builderNewBuilder.connectionPool(new ConnectionPool());
        this.okHttpClient = builderNewBuilder.build();
    }

    public Response doSync(Request request) throws Exception {
        if (this.okHttpClient == null) {
            return null;
        }
        Request deviceInfo = AddDeviceInfoUtil.setDeviceInfo(request);
        return FirebasePerfOkHttpClient.execute(getOkHttpClient(deviceInfo).newCall(deviceInfo));
    }

    public OkHttpClient getOkHttpClient(@Nullable URL url) {
        if (url == null) {
            return this.okHttpClient;
        }
        IIgnoreProxyUrl iIgnoreProxyUrl = this.mIgnoreProxy;
        if (iIgnoreProxyUrl == null || !iIgnoreProxyUrl.isIgnoreUrl(url)) {
            return url.getPath().startsWith("https") ? getOkHttpClientNotProxy() : this.okHttpClient;
        }
        return getOkHttpClientNotProxy();
    }

    public Response doSync(Request request, int i) throws IOException {
        OkHttpClient okHttpClient = getOkHttpClient(request);
        if (i != DEFAULT_TIMEOUT) {
            OkHttpClient.Builder builderNewBuilder = okHttpClient.newBuilder();
            long j = i;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            builderNewBuilder.connectTimeout(j, timeUnit);
            builderNewBuilder.readTimeout(j, timeUnit);
            builderNewBuilder.writeTimeout(j, timeUnit);
            okHttpClient = builderNewBuilder.build();
        }
        return FirebasePerfOkHttpClient.execute(okHttpClient.newCall(AddDeviceInfoUtil.setDeviceInfo(request)));
    }

    public void doAsync(OkHttpClient okHttpClient, Request request, final IHttpCallBack iHttpCallBack) {
        if (okHttpClient == null) {
            doAsync(request, iHttpCallBack);
            return;
        }
        try {
            FirebasePerfOkHttpClient.enqueue(okHttpClient.newCall(AddDeviceInfoUtil.setDeviceInfo(request)), new Callback() { // from class: com.ximalaya.ting.android.opensdk.httputil.BaseCall.1
                @Override // okhttp3.Callback
                public void onFailure(Call call, IOException iOException) {
                    if (iHttpCallBack == null) {
                        return;
                    }
                    boolean z = ConstantsOpenSdk.isDebug;
                    String str = BaseCall.NET_ERR_CONTENT;
                    if (z) {
                        String message = iOException.getMessage();
                        if (!TextUtils.isEmpty(message)) {
                            str = message;
                        }
                    }
                    iHttpCallBack.onFailure(TypedValues.MotionType.TYPE_QUANTIZE_INTERPOLATOR, str);
                }

                @Override // okhttp3.Callback
                public void onResponse(Call call, Response response) throws IOException {
                    if (iHttpCallBack == null) {
                        try {
                            response.body().close();
                            return;
                        } catch (Exception e) {
                            e.printStackTrace();
                            return;
                        }
                    }
                    if (response != null) {
                        String strHeader = response.header(BaseCall.HTTPDNS_SWITCH);
                        String strHeader2 = response.header(BaseCall.COLLECTOR_SWITCH);
                        Logger.i("SAVE_LIFE", strHeader + "   " + strHeader2);
                        if (!TextUtils.isEmpty(strHeader)) {
                            if (strHeader.equals("on")) {
                                BaseCall.isEnableDnsCache = true;
                            } else if (strHeader.equals("off")) {
                                BaseCall.isEnableDnsCache = false;
                            }
                        }
                        if (!TextUtils.isEmpty(strHeader2)) {
                            if (strHeader2.equals("on")) {
                                BaseCall.isEnableXdcsCollect = true;
                            } else if (strHeader2.equals("off")) {
                                BaseCall.isEnableXdcsCollect = false;
                            }
                        }
                    }
                    iHttpCallBack.onResponse(response);
                    try {
                        response.body().close();
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                }
            });
        } catch (Exception unused) {
            if (iHttpCallBack != null) {
                iHttpCallBack.onFailure(TypedValues.MotionType.TYPE_QUANTIZE_INTERPOLATOR, NET_ERR_CONTENT);
            }
        }
    }

    public void doAsync(Request request, final IHttpCallBack iHttpCallBack) {
        if (this.okHttpClient == null) {
            return;
        }
        try {
            Request deviceInfo = AddDeviceInfoUtil.setDeviceInfo(request);
            FirebasePerfOkHttpClient.enqueue(getOkHttpClient(deviceInfo).newCall(deviceInfo), new Callback() { // from class: com.ximalaya.ting.android.opensdk.httputil.BaseCall.2
                @Override // okhttp3.Callback
                public void onFailure(Call call, IOException iOException) {
                    if (iHttpCallBack == null) {
                        return;
                    }
                    boolean z = ConstantsOpenSdk.isDebug;
                    String str = BaseCall.NET_ERR_CONTENT;
                    if (z) {
                        String message = iOException.getMessage();
                        if (!TextUtils.isEmpty(message)) {
                            str = message;
                        }
                    }
                    iHttpCallBack.onFailure(TypedValues.MotionType.TYPE_QUANTIZE_INTERPOLATOR, str);
                }

                @Override // okhttp3.Callback
                public void onResponse(Call call, Response response) throws IOException {
                    IHttpCallBack iHttpCallBack2 = iHttpCallBack;
                    if (iHttpCallBack2 == null) {
                        try {
                            response.body().close();
                            return;
                        } catch (Exception e) {
                            e.printStackTrace();
                            return;
                        }
                    }
                    iHttpCallBack2.onResponse(response);
                    try {
                        response.body().close();
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                }
            });
        } catch (Exception unused) {
            if (iHttpCallBack != null) {
                iHttpCallBack.onFailure(TypedValues.MotionType.TYPE_QUANTIZE_INTERPOLATOR, NET_ERR_CONTENT);
            }
        }
    }
}
