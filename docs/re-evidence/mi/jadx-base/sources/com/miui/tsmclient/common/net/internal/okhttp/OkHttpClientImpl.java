package com.miui.tsmclient.common.net.internal.okhttp;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.example.statistics.export.OneTrackConstant;
import com.miui.tsmclient.account.AccountInfo;
import com.miui.tsmclient.account.AccountManagerFactory;
import com.miui.tsmclient.account.IAccountManager;
import com.miui.tsmclient.common.net.ErrorInfo;
import com.miui.tsmclient.common.net.HttpLifecycleManager;
import com.miui.tsmclient.common.net.IHttpClient;
import com.miui.tsmclient.common.net.NetConstants;
import com.miui.tsmclient.common.net.RequestCallback;
import com.miui.tsmclient.common.net.host.Host;
import com.miui.tsmclient.common.net.request.BaseRequest;
import com.miui.tsmclient.util.EnvironmentConfig;
import com.miui.tsmclient.util.IOUtils;
import com.miui.tsmclient.util.LogUtils;
import com.miui.tsmclient.util.StringUtils;
import com.xiaomi.accountsdk.request.CipherException;
import com.xiaomi.accountsdk.request.SecureRequest;
import com.xiaomi.accountsdk.utils.AESCoder;
import com.xiaomi.accountsdk.utils.CryptCoder;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import okhttp3.Cache;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Dispatcher;
import okhttp3.FormBody;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes4.dex */
public class OkHttpClientImpl implements IHttpClient {
    private static final int DEFAULT_CACHE_MAX_SIZE = 314572800;
    private static final int DEFAULT_IO_TIMEOUT_MILLISECOND = 60000;
    private static final int DEFAULT_TIMEOUT_MILLISECOND = 10000;
    private static final String PROTOCOL_HTTP = "http://";
    private static final String PROTOCOL_HTTPS = "https://";
    private static final ThreadLocalAuthInfo mAuthInfo = new ThreadLocalAuthInfo();
    private OkHttpClient mClient;
    private Context mContext;
    private OkHttpClient mPersistClient;
    private Handler mHandler = new Handler(Looper.getMainLooper());
    private IAccountManager mAccountManager = AccountManagerFactory.createAccountManager();

    public static final class AuthInfo {
        private AccountInfo mAccountInfo;
        private CryptCoder mCoder;

        private AuthInfo() {
        }
    }

    public class CookieInterceptor implements Interceptor {
        private CookieInterceptor() {
        }

        @Override // okhttp3.Interceptor
        public Response intercept(Interceptor.Chain chain) throws IOException {
            Request request = chain.request();
            if (OkHttpClientImpl.isAuthRequired(request)) {
                BaseRequest baseRequest = OkHttpClientImpl.getBaseRequest(request);
                AccountInfo accountInfo = OkHttpClientImpl.mAuthInfo.get().mAccountInfo;
                baseRequest.addCookie("userId", accountInfo.getUserId());
                baseRequest.addCookie("serviceToken", accountInfo.getServiceToken());
                baseRequest.addCookie(baseRequest.getHost().getServiceId() + "_ph", accountInfo.getPh());
                request = request.newBuilder().header(NetConstants.COOKIE, StringUtils.join(baseRequest.getCookies(), "; ")).build();
            }
            return chain.proceed(request);
        }
    }

    public class CryptInterceptor implements Interceptor {
        private CryptInterceptor() {
        }

        private Response processResponse(Request request, Response response) throws IOException {
            if (response == null) {
                return null;
            }
            BaseRequest baseRequest = OkHttpClientImpl.getBaseRequest(request);
            ResponseBody responseBodyBody = response.body();
            if (responseBodyBody == null) {
                baseRequest.setResponse(response.isSuccessful());
                return response;
            }
            if (baseRequest.isStringResponse()) {
                String strString = responseBodyBody.string();
                if (OkHttpClientImpl.isCryptRequired(request)) {
                    try {
                        strString = OkHttpClientImpl.mAuthInfo.get().mCoder.decrypt(strString);
                    } catch (CipherException e) {
                        LogUtils.e("error occurred on CryptInterceptor", e);
                        throw new IOException(e);
                    }
                }
                LogUtils.t("bodyStr: " + strString);
                LogUtils.t("----------");
                baseRequest.setResponse(response.isSuccessful(), strString);
            } else {
                try {
                    LogUtils.t("start parsing inputStream");
                    InputStream inputStreamByteStream = responseBodyBody.byteStream();
                    if (inputStreamByteStream == null) {
                        LogUtils.e("byteStream is null");
                        throw new IOException("byteStream failed");
                    }
                    baseRequest.setResponse(response.isSuccessful(), inputStreamByteStream, responseBodyBody.get$contentLength());
                    IOUtils.closeQuietly(inputStreamByteStream);
                } catch (Throwable th) {
                    IOUtils.closeQuietly((InputStream) null);
                    throw th;
                }
            }
            return response;
        }

        @Override // okhttp3.Interceptor
        public Response intercept(Interceptor.Chain chain) throws IOException {
            RequestBody requestBodyBuild;
            Request requestBuild;
            Request request = chain.request();
            BaseRequest baseRequest = OkHttpClientImpl.getBaseRequest(request);
            boolean zIsAuthRequired = OkHttpClientImpl.isAuthRequired(request);
            boolean zIsCryptRequired = OkHttpClientImpl.isCryptRequired(request);
            baseRequest.addExtraParams();
            Map<String, String> params = baseRequest.getParams();
            if (zIsAuthRequired) {
                OkHttpClientImpl.this.loadAccountInfo(baseRequest.getHost());
                AccountInfo accountInfo = OkHttpClientImpl.mAuthInfo.getAccountInfo();
                String userId = accountInfo.getUserId();
                if (TextUtils.isEmpty(userId)) {
                    LogUtils.e("CryptInterceptor: userId is null");
                    throw new InternalIOException(14, "userId is null");
                }
                params.put("userId", userId);
                String ph = accountInfo.getPh();
                if (TextUtils.isEmpty(ph)) {
                    LogUtils.i("CryptInterceptor: ph is null");
                } else {
                    params.put(baseRequest.getHost().getServiceId() + "_ph", ph);
                }
                if (!TextUtils.isEmpty(EnvironmentConfig.getClientId())) {
                    params.put("clientId", EnvironmentConfig.getClientId());
                }
                params.put("token", accountInfo.getAuthToken());
                if (zIsCryptRequired) {
                    try {
                        params = SecureRequest.encryptParams(baseRequest.getMethod(), OkHttpClientImpl.this.getBaseRequestUrl(baseRequest), params, accountInfo.getSecurity(), OkHttpClientImpl.mAuthInfo.getCoder());
                    } catch (CipherException e) {
                        throw new IOException(e);
                    }
                }
                baseRequest.addExtras(params);
            }
            if ("GET".equals(baseRequest.getMethod())) {
                HttpUrl.Builder builderNewBuilder = request.url().newBuilder();
                for (Map.Entry<String, String> entry : params.entrySet()) {
                    builderNewBuilder.addQueryParameter(entry.getKey(), entry.getValue());
                }
                requestBuild = request.newBuilder().url(builderNewBuilder.build()).headers(Headers.of(baseRequest.getHeaders())).build();
            } else {
                MediaType mediaType = baseRequest.getContentType() != null ? MediaType.parse(baseRequest.getContentType()) : null;
                if (mediaType == null || "x-www-form-urlencoded".equals(mediaType.subtype())) {
                    FormBody.Builder builder = new FormBody.Builder();
                    for (Map.Entry<String, String> entry2 : params.entrySet()) {
                        builder.add(entry2.getKey(), entry2.getValue());
                    }
                    requestBodyBuild = builder.build();
                } else {
                    requestBodyBuild = RequestBody.create(mediaType, baseRequest.getCustomBody());
                }
                requestBuild = request.newBuilder().url(OkHttpClientImpl.this.getBaseRequestUrl(baseRequest)).headers(Headers.of(baseRequest.getHeaders())).method(baseRequest.getMethod(), requestBodyBuild).build();
            }
            Response responseProceed = chain.proceed(requestBuild);
            StringBuilder sb = new StringBuilder();
            sb.append(requestBuild.method());
            sb.append(": ");
            sb.append(OkHttpClientImpl.this.getBaseRequestUrl(baseRequest));
            sb.append("\nResponseStatus: ");
            sb.append(responseProceed != null ? responseProceed.toString() : null);
            LogUtils.t(sb.toString());
            return processResponse(requestBuild, responseProceed);
        }
    }

    public class HttpMonitorInterceptor implements Interceptor {
        private HttpMonitorInterceptor() {
        }

        @Override // okhttp3.Interceptor
        public Response intercept(Interceptor.Chain chain) throws IOException {
            boolean zIsConnected = OkHttpClientImpl.this.isConnected();
            Request request = chain.request();
            String url = request.url().getUrl();
            if (zIsConnected) {
                HttpLifecycleManager.getInstance().onStart(url);
            }
            Response responseProceed = chain.proceed(request);
            if (zIsConnected) {
                int i = OkHttpClientImpl.getBaseRequest(request).getResponse().getErrorInfo().mErrorCode;
                HttpLifecycleManager.getInstance().onStop(url, i);
                LogUtils.t("request_url:" + url + " http_code: " + responseProceed.code() + " response_code:" + i);
            }
            return responseProceed;
        }
    }

    public class PersistenceInterceptor implements Interceptor {
        private PersistenceInterceptor() {
        }

        @Override // okhttp3.Interceptor
        public Response intercept(Interceptor.Chain chain) throws IOException {
            Request request = chain.request();
            BaseRequest baseRequest = OkHttpClientImpl.getBaseRequest(request);
            Response responseProceed = chain.proceed(request);
            return (responseProceed == null || !baseRequest.isPersistence()) ? responseProceed : responseProceed.newBuilder().header("Cache-Control", "immutable").build();
        }
    }

    public class RetryInterceptor implements Interceptor {
        private final int maxRetry;

        public RetryInterceptor(int i) {
            this.maxRetry = i;
        }

        private boolean needRetry(int i, Response response) {
            return response != null && response.code() == 401 && i < this.maxRetry;
        }

        @Override // okhttp3.Interceptor
        public Response intercept(Interceptor.Chain chain) throws IOException {
            Request request = chain.request();
            Response responseProceed = chain.proceed(request);
            BaseRequest baseRequest = OkHttpClientImpl.getBaseRequest(request);
            int i = 1;
            if (baseRequest.isAuth()) {
                while (needRetry(i, responseProceed)) {
                    try {
                        responseProceed.close();
                    } catch (Exception e) {
                        LogUtils.e("close HTTP_UNAUTHORIZED response failed on RetryInterceptor", e);
                    }
                    i++;
                    OkHttpClientImpl.this.doPreRetry(baseRequest.getHost());
                    responseProceed = chain.proceed(request);
                }
            }
            LogUtils.t("RetryInterceptor requestCount:" + i);
            return responseProceed;
        }
    }

    public static class ThreadLocalAuthInfo extends ThreadLocal<AuthInfo> {
        private ThreadLocalAuthInfo() {
        }

        public AccountInfo getAccountInfo() {
            return get().mAccountInfo;
        }

        public CryptCoder getCoder() {
            return get().mCoder;
        }

        public void setAccountInfo(AccountInfo accountInfo) {
            AuthInfo authInfo = get();
            authInfo.mAccountInfo = accountInfo;
            if (accountInfo == null || TextUtils.isEmpty(accountInfo.getSecurity())) {
                authInfo.mCoder = null;
            } else {
                authInfo.mCoder = new AESCoder(accountInfo.getSecurity());
            }
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.lang.ThreadLocal
        public AuthInfo initialValue() {
            return new AuthInfo();
        }
    }

    public static class TimeoutInterceptor implements Interceptor {
        private TimeoutInterceptor() {
        }

        @Override // okhttp3.Interceptor
        public Response intercept(Interceptor.Chain chain) throws IOException {
            Request request = chain.request();
            BaseRequest baseRequest = OkHttpClientImpl.getBaseRequest(request);
            int connectTimeout = baseRequest.getConnectTimeout() >= 0 ? baseRequest.getConnectTimeout() : 10000;
            int readTimeout = baseRequest.getReadTimeout() >= 0 ? baseRequest.getReadTimeout() : 60000;
            int writeTimeout = baseRequest.getWriteTimeout() >= 0 ? baseRequest.getWriteTimeout() : 60000;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            return chain.withConnectTimeout(connectTimeout, timeUnit).withReadTimeout(readTimeout, timeUnit).withWriteTimeout(writeTimeout, timeUnit).proceed(request);
        }
    }

    public OkHttpClientImpl(Context context) {
        this.mContext = context;
        OkHttpClient okHttpClientBuild = new OkHttpClient.Builder().cache(new Cache(context.getCacheDir(), 314572800L)).addInterceptor(new HttpMonitorInterceptor()).addInterceptor(new TimeoutInterceptor()).addInterceptor(new RetryInterceptor(2)).addInterceptor(new CryptInterceptor()).addNetworkInterceptor(new CookieInterceptor()).addNetworkInterceptor(new PersistenceInterceptor()).build();
        this.mClient = okHttpClientBuild;
        this.mPersistClient = okHttpClientBuild.newBuilder().cache(new Cache(context.getFilesDir(), 314572800L)).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void doPreRetry(Host host) {
        ThreadLocalAuthInfo threadLocalAuthInfo = mAuthInfo;
        AccountInfo accountInfo = threadLocalAuthInfo.getAccountInfo();
        this.mAccountManager.resetAccount(this.mContext, host.getServiceId(), accountInfo == null ? null : accountInfo.getAuthToken());
        threadLocalAuthInfo.setAccountInfo(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static BaseRequest<?> getBaseRequest(Request request) throws IOException {
        if (request != null) {
            Object objTag = request.tag();
            if (objTag instanceof BaseRequest) {
                return (BaseRequest) objTag;
            }
        }
        throw new IOException("getBaseRequest failed");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String getBaseRequestUrl(BaseRequest baseRequest) {
        String url = baseRequest.getUrl();
        return url.startsWith(PROTOCOL_HTTP) ? url.replace(PROTOCOL_HTTP, PROTOCOL_HTTPS) : url;
    }

    private OkHttpClient getHttpClient(BaseRequest baseRequest) {
        return baseRequest.isPersistence() ? this.mPersistClient : this.mClient;
    }

    private Request getOkRequest(BaseRequest baseRequest) {
        return new Request.Builder().url(getBaseRequestUrl(baseRequest)).tag(baseRequest).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isAuthRequired(Request request) throws IOException {
        return getBaseRequest(request).isAuth();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isConnected() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.mContext.getSystemService(OneTrackConstant.EVENT_NAME_CONNECTIVITY)).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isCryptRequired(Request request) throws IOException {
        return getBaseRequest(request).isCrypt();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void loadAccountInfo(Host host) throws IOException {
        AccountInfo accountInfoLoadAccountInfo = this.mAccountManager.loadAccountInfo(this.mContext, host.getServiceId());
        if (accountInfoLoadAccountInfo == null || !accountInfoLoadAccountInfo.isValid()) {
            throw new InternalIOException(14, "Getting account info failed");
        }
        mAuthInfo.setAccountInfo(accountInfoLoadAccountInfo);
    }

    @Override // com.miui.tsmclient.common.net.IHttpClient
    public void cancel(BaseRequest baseRequest) {
        Dispatcher dispatcher = getHttpClient(baseRequest).dispatcher();
        for (Call call : dispatcher.queuedCalls()) {
            if (baseRequest == call.request().tag()) {
                call.cancel();
            }
        }
        for (Call call2 : dispatcher.runningCalls()) {
            if (baseRequest == call2.request().tag()) {
                call2.cancel();
            }
        }
    }

    @Override // com.miui.tsmclient.common.net.IHttpClient
    public <T> void enqueue(final BaseRequest<T> baseRequest) {
        getHttpClient(baseRequest).newCall(getOkRequest(baseRequest)).enqueue(new Callback() { // from class: com.miui.tsmclient.common.net.internal.okhttp.OkHttpClientImpl.1
            @Override // okhttp3.Callback
            public void onFailure(Call call, final IOException iOException) {
                LogUtils.v("Callback onFailure:" + OkHttpClientImpl.this.getBaseRequestUrl(baseRequest));
                final RequestCallback callback = baseRequest.getCallback();
                if (callback == null) {
                    return;
                }
                if (call.getCanceled()) {
                    callback.onCanceled();
                } else {
                    OkHttpClientImpl.this.mHandler.post(new Runnable() { // from class: com.miui.tsmclient.common.net.internal.okhttp.OkHttpClientImpl.1.1
                        @Override // java.lang.Runnable
                        public void run() {
                            IOException iOException2 = iOException;
                            callback.onFailed(new ErrorInfo(iOException2 instanceof InternalIOException ? ((InternalIOException) iOException2).getErrorCode() : -1, null));
                        }
                    });
                }
            }

            @Override // okhttp3.Callback
            public void onResponse(Call call, final Response response) throws IOException {
                LogUtils.v("Callback onResponse:" + OkHttpClientImpl.this.getBaseRequestUrl(baseRequest) + "\n" + baseRequest.getResponse());
                baseRequest.getResponse().setHttpStatusCode(response.code());
                final RequestCallback callback = baseRequest.getCallback();
                if (callback == null) {
                    return;
                }
                OkHttpClientImpl.this.mHandler.post(new Runnable() { // from class: com.miui.tsmclient.common.net.internal.okhttp.OkHttpClientImpl.1.2
                    @Override // java.lang.Runnable
                    public void run() {
                        if (response.isSuccessful()) {
                            callback.onResponse(baseRequest.getResult());
                        } else {
                            callback.onFailed(baseRequest.getResponse().getErrorInfo());
                        }
                    }
                });
            }
        });
    }

    @Override // com.miui.tsmclient.common.net.IHttpClient
    public <T> com.miui.tsmclient.common.net.Response<T> execute(BaseRequest<T> baseRequest) throws IOException {
        Response responseExecute = getHttpClient(baseRequest).newCall(getOkRequest(baseRequest)).execute();
        com.miui.tsmclient.common.net.Response<T> response = baseRequest.getResponse();
        if (responseExecute != null) {
            try {
                response.setHttpStatusCode(responseExecute.code());
                responseExecute.close();
            } catch (Exception e) {
                LogUtils.e("close response failed on execute", e);
            }
        }
        return response;
    }
}
