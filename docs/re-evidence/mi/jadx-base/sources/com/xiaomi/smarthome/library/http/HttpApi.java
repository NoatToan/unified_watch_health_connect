package com.xiaomi.smarthome.library.http;

import android.app.Application;
import com.xiaomi.smarthome.library.MiJiaEnvironment;
import com.xiaomi.smarthome.library.common.util.SharePrefsManager;
import com.xiaomi.smarthome.library.http.async.AsyncHandler;
import com.xiaomi.smarthome.library.http.async.HttpAsyncHandle;
import com.xiaomi.smarthome.library.http.sync.SyncHandler;
import com.xiaomi.smarthome.library.http.util.HeaderUtil;
import com.xiaomi.smarthome.library.http.util.KeyValuePairUtil;
import com.xiaomi.smarthome.library.http.util.RequestParamUtil;
import com.xiaomi.smarthome.network.NetworkDepApi;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.CookieManager;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Headers;
import okhttp3.OkHttpClient;
import okhttp3.RequestBody;
import okhttp3.Response;

/* JADX INFO: loaded from: classes2.dex */
public class HttpApi {
    private static volatile OkHttpClient mDefaultClient;
    private static CookieManager sCookieManager;

    private static Application getApplicationWithReflection() {
        try {
            Method method = Class.forName("android.app.ActivityThread").getMethod("currentActivityThread", new Class[0]);
            method.setAccessible(true);
            Object objInvoke = method.invoke(null, new Object[0]);
            return (Application) objInvoke.getClass().getMethod("getApplication", new Class[0]).invoke(objInvoke, new Object[0]);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    private static OkHttpClient getDefaultClient() {
        if (mDefaultClient == null) {
            synchronized (HttpApi.class) {
                try {
                    if (mDefaultClient == null) {
                        mDefaultClient = ClientUtil.create();
                        sCookieManager = ClientUtil.sCookieManage;
                        NetworkDepApi.getInstance().installCommonOnce();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return mDefaultClient;
    }

    public static CookieManager initAndGetCookieManager() {
        getDefaultClient();
        return sCookieManager;
    }

    public static <R> R sendRequest(OkHttpClient okHttpClient, Request request, SyncHandler<R> syncHandler) throws Exception {
        Response responseExecute;
        if (okHttpClient == null) {
            throw new RuntimeException("client is null");
        }
        if (syncHandler == null) {
            throw new RuntimeException("handler is null");
        }
        okhttp3.Request.Builder builder = new okhttp3.Request.Builder();
        Headers headers = HeaderUtil.getHeaders(request.getHeaders());
        if (headers != null) {
            builder.headers(headers);
        }
        if (request.getMethod().equals("POST")) {
            builder.url(request.getUrl()).post(KeyValuePairUtil.getRequestBody(request));
        } else {
            if (!request.getMethod().equals("GET")) {
                throw new RuntimeException("method unsupported");
            }
            builder.url(KeyValuePairUtil.getUrlWithQueryString(request.getUrl(), request.getQueryParams()));
        }
        try {
            responseExecute = okHttpClient.newCall(builder.build()).execute();
            try {
                R rProcessResponse = syncHandler.processResponse(responseExecute);
                if (responseExecute != null && responseExecute.body() != null) {
                    responseExecute.close();
                }
                return rProcessResponse;
            } catch (Throwable th) {
                th = th;
                if (responseExecute != null && responseExecute.body() != null) {
                    responseExecute.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            responseExecute = null;
        }
    }

    public static HttpAsyncHandle sendRequestDefault(Request request, final AsyncHandler asyncHandler) {
        okhttp3.Request.Builder builder = new okhttp3.Request.Builder();
        Headers headers = HeaderUtil.getHeaders(request.getHeaders());
        if (headers != null) {
            builder.headers(headers);
        }
        if (request.getMethod().equals("POST")) {
            builder.url(request.getUrl()).post(KeyValuePairUtil.getRequestBody(request));
        } else {
            if (!request.getMethod().equals("GET")) {
                throw new RuntimeException("method unsupported");
            }
            builder.url(KeyValuePairUtil.getUrlWithQueryString(request.getUrl(), request.getQueryParams()));
        }
        Call callNewCall = getDefaultClient().newCall(builder.build());
        callNewCall.enqueue(new Callback() { // from class: com.xiaomi.smarthome.library.http.HttpApi.2
            @Override // okhttp3.Callback
            public void onFailure(Call call, IOException iOException) {
                AsyncHandler asyncHandler2 = asyncHandler;
                if (asyncHandler2 != null) {
                    asyncHandler2.processFailure(call, iOException);
                }
            }

            @Override // okhttp3.Callback
            public void onResponse(Call call, Response response) throws IOException {
                AsyncHandler asyncHandler2 = asyncHandler;
                if (asyncHandler2 != null) {
                    asyncHandler2.processResponse(response);
                }
                if (response.body() != null) {
                    response.close();
                }
            }
        });
        return new HttpAsyncHandle(callNewCall);
    }

    public static HttpAsyncHandle sendRequestDefault(Request request, RequestBody requestBody, final AsyncHandler asyncHandler) {
        okhttp3.Request.Builder builder = new okhttp3.Request.Builder();
        Headers headers = HeaderUtil.getHeaders(request.getHeaders());
        if (headers != null) {
            builder.headers(headers);
        }
        if (request.getMethod().equals("POST")) {
            builder.url(request.getUrl()).post(requestBody);
        } else if (request.getMethod().equals("GET")) {
            builder.url(KeyValuePairUtil.getUrlWithQueryString(request.getUrl(), request.getQueryParams()));
        } else {
            throw new RuntimeException("method unsupported");
        }
        Call callNewCall = getDefaultClient().newCall(builder.build());
        callNewCall.enqueue(new Callback() { // from class: com.xiaomi.smarthome.library.http.HttpApi.3
            @Override // okhttp3.Callback
            public void onFailure(Call call, IOException iOException) {
                AsyncHandler asyncHandler2 = asyncHandler;
                if (asyncHandler2 != null) {
                    asyncHandler2.processFailure(call, iOException);
                }
            }

            @Override // okhttp3.Callback
            public void onResponse(Call call, Response response) throws IOException {
                AsyncHandler asyncHandler2 = asyncHandler;
                if (asyncHandler2 != null) {
                    asyncHandler2.processResponse(response);
                }
                if (response.body() != null) {
                    response.close();
                }
            }
        });
        return new HttpAsyncHandle(callNewCall);
    }

    public static <R> R sendRequest(Request request, SyncHandler<R> syncHandler) throws Exception {
        return (R) sendRequest(getDefaultClient(), request, syncHandler);
    }

    public static HttpAsyncHandle sendRequest(Request request, AsyncHandler asyncHandler) throws Exception {
        return sendRequest(getDefaultClient(), request, asyncHandler);
    }

    public static HttpAsyncHandle sendRequest(OkHttpClient okHttpClient, Request request, final AsyncHandler asyncHandler) {
        if (okHttpClient != null) {
            okhttp3.Request.Builder builder = new okhttp3.Request.Builder();
            Headers headers = HeaderUtil.getHeaders(request.getHeaders());
            if (headers != null) {
                builder.headers(headers);
            }
            if (MiJiaEnvironment.isDebugBuildType() || MiJiaEnvironment.isSdkBuildType() || MiJiaEnvironment.isInGreyPublish() || MiJiaEnvironment.isDevChannel()) {
                try {
                    for (String str : SharePrefsManager.getSettingString(getApplicationWithReflection(), "developer_setting", "debug_header_extra", "").split("\n")) {
                        String[] strArrSplit = str.split(":");
                        if (strArrSplit.length == 2) {
                            builder.addHeader(strArrSplit[0].trim(), strArrSplit[1].trim());
                        }
                    }
                } catch (Throwable unused) {
                }
            }
            if (request.getMethod().equals("POST")) {
                builder.url(request.getUrl()).post(KeyValuePairUtil.getRequestBody(request));
            } else if (request.getMethod().equals("GET")) {
                builder.url(KeyValuePairUtil.getUrlWithQueryString(request.getUrl(), request.getQueryParams()));
            } else {
                throw new RuntimeException("method unsupported");
            }
            Call callNewCall = okHttpClient.newCall(builder.build());
            callNewCall.enqueue(new Callback() { // from class: com.xiaomi.smarthome.library.http.HttpApi.1
                @Override // okhttp3.Callback
                public void onFailure(Call call, IOException iOException) {
                    AsyncHandler asyncHandler2 = asyncHandler;
                    if (asyncHandler2 != null) {
                        asyncHandler2.processFailure(call, iOException);
                    }
                }

                @Override // okhttp3.Callback
                public void onResponse(Call call, Response response) throws IOException {
                    AsyncHandler asyncHandler2 = asyncHandler;
                    if (asyncHandler2 != null) {
                        asyncHandler2.processResponse(response);
                    }
                    if (response.body() != null) {
                        response.close();
                    }
                }
            });
            return new HttpAsyncHandle(callNewCall);
        }
        throw new RuntimeException("client is null");
    }

    @Deprecated
    public static <R> R sendRequest(OkHttpClient okHttpClient, Request2 request2, SyncHandler<R> syncHandler) throws Exception {
        if (okHttpClient == null) {
            throw new RuntimeException("client is null");
        }
        if (syncHandler != null) {
            okhttp3.Request.Builder builder = new okhttp3.Request.Builder();
            Headers headers = HeaderUtil.getHeaders(request2.getHeaders());
            if (headers != null) {
                builder.headers(headers);
            }
            if (request2.getMethod().equals("POST")) {
                builder.url(request2.getUrl()).post(RequestParamUtil.getRequestBody(request2.getQueryParams()));
            } else if (request2.getMethod().equals("GET")) {
                builder.url(RequestParamUtil.getUrlWithQueryString(request2.getUrl(), request2.getQueryParams()));
            } else {
                throw new RuntimeException("method unsupported");
            }
            try {
                Response responseExecute = okHttpClient.newCall(builder.build()).execute();
                R rProcessResponse = syncHandler.processResponse(responseExecute);
                if (responseExecute != null && responseExecute.body() != null) {
                    responseExecute.close();
                }
                return rProcessResponse;
            } catch (IOException e) {
                throw new RuntimeException("failure:" + e.getMessage());
            }
        }
        throw new RuntimeException("handler is null");
    }

    @Deprecated
    public static HttpAsyncHandle sendRequest(OkHttpClient okHttpClient, Request2 request2, final AsyncHandler asyncHandler) {
        if (okHttpClient != null) {
            okhttp3.Request.Builder builder = new okhttp3.Request.Builder();
            Headers headers = HeaderUtil.getHeaders(request2.getHeaders());
            if (headers != null) {
                builder.headers(headers);
            }
            if (request2.getMethod().equals("POST")) {
                builder.url(request2.getUrl()).post(RequestParamUtil.getRequestBody(request2.getQueryParams()));
            } else if (request2.getMethod().equals("GET")) {
                builder.url(RequestParamUtil.getUrlWithQueryString(request2.getUrl(), request2.getQueryParams()));
            } else {
                throw new RuntimeException("method unsupported");
            }
            Call callNewCall = okHttpClient.newCall(builder.build());
            callNewCall.enqueue(new Callback() { // from class: com.xiaomi.smarthome.library.http.HttpApi.4
                @Override // okhttp3.Callback
                public void onFailure(Call call, IOException iOException) {
                    AsyncHandler asyncHandler2 = asyncHandler;
                    if (asyncHandler2 != null) {
                        asyncHandler2.processFailure(call, iOException);
                    }
                }

                @Override // okhttp3.Callback
                public void onResponse(Call call, Response response) throws IOException {
                    AsyncHandler asyncHandler2 = asyncHandler;
                    if (asyncHandler2 != null) {
                        asyncHandler2.processResponse(response);
                    }
                    if (response.body() != null) {
                        response.close();
                    }
                }
            });
            return new HttpAsyncHandle(callNewCall);
        }
        throw new RuntimeException("client is null");
    }
}
