package defpackage;

import android.os.Build;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.gson.JsonSyntaxException;
import com.huawei.common.util.Utils;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.common.os.FileUtils;
import com.huawei.haf.common.utils.CollectionUtils;
import com.huawei.haf.common.utils.NetworkUtil;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.huawei.hms.framework.network.grs.GrsClient;
import com.huawei.hms.framework.network.restclient.Headers;
import com.huawei.hms.framework.network.restclient.Response;
import com.huawei.hms.framework.network.restclient.RestClient;
import com.huawei.hms.framework.network.restclient.RestClientGlobalInstance;
import com.huawei.hms.framework.network.restclient.Submit;
import com.huawei.hms.framework.network.restclient.converter.gson.GsonConverterFactory;
import com.huawei.hms.framework.network.restclient.hianalytics.RequestFinishedInfo;
import com.huawei.hms.framework.network.restclient.hwhttp.HttpClient;
import com.huawei.hms.framework.network.restclient.hwhttp.Interceptor;
import com.huawei.hms.framework.network.restclient.hwhttp.MediaType;
import com.huawei.hms.framework.network.restclient.hwhttp.Request;
import com.huawei.hms.framework.network.restclient.hwhttp.RequestBody;
import com.huawei.hms.framework.network.restclient.hwhttp.ResponseBody;
import com.huawei.hms.framework.network.restclient.hwhttp.url.HttpUrl;
import com.huawei.hms.network.NetworkKit;
import com.huawei.hms.network.embedded.j2;
import com.huawei.hms.network.embedded.w;
import com.huawei.networkclient.CommonApi;
import com.huawei.networkclient.IDownloadStrategy;
import com.huawei.networkclient.NetworkClientMgrApi;
import com.huawei.networkclient.ProgressListener;
import com.huawei.networkclient.ResultCallback;
import com.huawei.networkclient.cache.ICacheStrategy;
import com.huawei.networkclient.repository.DataConverterRepository;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.operation.ble.BleConstants;
import com.huawei.secure.android.common.ssl.SSLUtil;
import com.huawei.secure.android.common.ssl.SecureSSLSocketFactoryNew;
import com.huawei.secure.android.common.ssl.SecureX509SingleInstance;
import health.compact.a.BuildConfigProperties;
import health.compact.a.LogUtil;
import health.compact.a.ReleaseLogUtil;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.function.BiConsumer;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;

/* JADX INFO: loaded from: classes.dex */
public final class oet {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f44246b;
    private static final String e;
    private static volatile boolean g;
    private static volatile oet i;
    private ofj f;
    private DataConverterRepository k;
    private CommonApi l;
    private int n = 30000;
    private RestClient o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static ConcurrentHashMap<String, ProgressListener> f44245a = new ConcurrentHashMap<>();
    private static ConcurrentHashMap<String, Submit<ResponseBody>> d = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f44247c = new Object();
    private static ExecutorService j = Executors.newCachedThreadPool();
    private static long h = 0;

    static {
        String str;
        if (BuildConfigProperties.d() == "customTest") {
            str = BleConstants.WEIGHT_KEY;
        } else {
            str = BuildConfigProperties.a("IS_GREEN_VERSION", false) ? "green" : "";
        }
        e = str;
        f44246b = Utils.SERVICE_HEALTH_CLOUD + str;
        i = null;
        g = false;
    }

    private oet(boolean z) {
        if (BaseApplication.b().getMainLooper() == Looper.myLooper()) {
            ReleaseLogUtil.b("R_NetworkClientMgr", "init networkKit in main thread");
        }
        try {
            Future futureInit = NetworkKit.init(BaseApplication.b(), new NetworkKit.Callback() { // from class: oet.1
                @Override // com.huawei.hms.network.NetworkKit.Callback
                public void onResult(boolean z2) {
                    ReleaseLogUtil.c("R_NetworkClientMgr", "init networkKit result is: ", Boolean.valueOf(z2));
                }
            });
            if (futureInit != null) {
                futureInit.get(5000L, TimeUnit.MILLISECONDS);
            }
            NetworkKit.getInstance().initConnectionPool(5, 2L, TimeUnit.MINUTES);
        } catch (IllegalStateException unused) {
            ReleaseLogUtil.b("R_NetworkClientMgr", "NetworkClientMgr init IllegalStateException");
        } catch (InterruptedException unused2) {
            ReleaseLogUtil.b("R_NetworkClientMgr", "NetworkClientMgr init InterruptedException");
        } catch (ExecutionException unused3) {
            ReleaseLogUtil.b("R_NetworkClientMgr", "NetworkClientMgr init ExecutionException");
        } catch (TimeoutException unused4) {
            ReleaseLogUtil.b("R_NetworkClientMgr", "NetworkClientMgr init TimeoutException");
        }
        if (z) {
            return;
        }
        d(i());
    }

    public static oet d() {
        if (i == null) {
            synchronized (f44247c) {
                if (i == null) {
                    i = new oet(false);
                }
            }
        }
        return i;
    }

    public static oet c(HttpClient httpClient) {
        LogUtil.b("NetworkClientMgr", "getDiyInstance");
        oet oetVar = new oet(true);
        oetVar.d(httpClient);
        return oetVar;
    }

    public <T> T e(Class<? extends T> cls) {
        RestClient restClient = this.o;
        if (restClient == null) {
            ReleaseLogUtil.b("R_NetworkClientMgr", "not init");
            return null;
        }
        try {
            return (T) restClient.create(cls);
        } catch (IllegalArgumentException e2) {
            ReleaseLogUtil.b("R_NetworkClientMgr", "create network api fail, message is ", ExceptionUtils.c(e2));
            return null;
        }
    }

    public void e(String str) {
        d.remove(str);
        f44245a.remove(str);
    }

    public boolean c(String str) {
        return !d.containsKey(str);
    }

    /* JADX WARN: Not initialized variable reg: 12, insn: 0x0101: MOVE (r5 I:??[OBJECT, ARRAY]) = (r12 I:??[OBJECT, ARRAY]), block:B:46:0x0101 */
    public <Rsp> Rsp e(String str, Map<String, String> map, String str2, Class<Rsp> cls) throws Throwable {
        Closeable closeable;
        ResponseBody body;
        Submit<ResponseBody> submitCommonPostRaw;
        Closeable closeable2;
        String message;
        Rsp rsp;
        if (BaseApplication.b().getMainLooper() == Looper.myLooper()) {
            ReleaseLogUtil.b("R_NetworkClientMgr", "network action in main thread");
            LogUtil.d("NetworkClientMgr", "network action in main thread, responseType is ", cls.getSimpleName());
        }
        if (!b(map, (ResultCallback) null)) {
            return null;
        }
        try {
            try {
                try {
                    submitCommonPostRaw = this.l.commonPostRaw(str, map, str2);
                    try {
                        Response<ResponseBody> responseExecute = submitCommonPostRaw.execute();
                        body = responseExecute.getBody();
                        try {
                            ofz.a(submitCommonPostRaw);
                            if (body != null) {
                                ofp.c(str, str2.getBytes(StandardCharsets.UTF_8).length, body.getContentLength());
                            }
                            if (responseExecute.isOK()) {
                                rsp = (Rsp) this.k.d(cls).convert(responseExecute.getBody(), responseExecute.getHeaders(), cls);
                            } else {
                                ReleaseLogUtil.d("NetworkClientMgr", cls.getSimpleName(), " status code:", Integer.valueOf(responseExecute.getCode()));
                                rsp = null;
                            }
                            FileUtils.a(body);
                            return rsp;
                        } catch (JsonSyntaxException e2) {
                            e = e2;
                            ReleaseLogUtil.b("NetworkClientMgr", cls.getSimpleName(), " string convert error:", ExceptionUtils.c(e), " resBody:", body);
                            FileUtils.a(body);
                            return null;
                        } catch (IOException e3) {
                            e = e3;
                            ReleaseLogUtil.b("NetworkClientMgr", cls.getSimpleName(), " fail:", ExceptionUtils.c(e));
                            message = e.getMessage();
                            if (message != null) {
                                g();
                            }
                            b(submitCommonPostRaw);
                            FileUtils.a(body);
                            return null;
                        }
                    } catch (IOException e4) {
                        e = e4;
                        body = null;
                        ReleaseLogUtil.b("NetworkClientMgr", cls.getSimpleName(), " fail:", ExceptionUtils.c(e));
                        message = e.getMessage();
                        if (message != null && message.contains("javax.net.ssl.SSLSocketFactory javax.net.ssl.SSLContext.getSocketFactory()") && message.contains("null object reference")) {
                            g();
                        }
                        b(submitCommonPostRaw);
                        FileUtils.a(body);
                        return null;
                    }
                } catch (Throwable th) {
                    th = th;
                    closeable = closeable2;
                    FileUtils.a(closeable);
                    throw th;
                }
            } catch (IOException e5) {
                e = e5;
                submitCommonPostRaw = null;
            }
        } catch (JsonSyntaxException e6) {
            e = e6;
            body = null;
        } catch (Throwable th2) {
            th = th2;
            closeable = null;
            FileUtils.a(closeable);
            throw th;
        }
    }

    private static void g() {
        try {
            SecureSSLSocketFactoryNew secureSSLSocketFactoryNew = SecureSSLSocketFactoryNew.getInstance(BaseApplication.b());
            if (secureSSLSocketFactoryNew.getSslContext() == null) {
                secureSSLSocketFactoryNew.setContext(BaseApplication.b());
                SSLContext sSLContext = SSLUtil.setSSLContext();
                secureSSLSocketFactoryNew.setSslContext(sSLContext);
                sSLContext.init(null, new TrustManager[]{SecureX509SingleInstance.getInstance(BaseApplication.b())}, null);
            }
        } catch (IOException | IllegalAccessException | IllegalArgumentException | KeyManagementException | KeyStoreException | NoSuchAlgorithmException | CertificateException e2) {
            ReleaseLogUtil.b("NetworkClientMgr", "reInit fail to reset SSLContext:", ExceptionUtils.c(e2));
        }
    }

    public <Rsp> void c(String str, Map<String, String> map, String str2, Class<Rsp> cls, ResultCallback<Rsp> resultCallback) {
        if (b(map, resultCallback)) {
            Submit<ResponseBody> submitCommonPostRaw = this.l.commonPostRaw(str, map, str2);
            ofp.e(str, str2.getBytes(StandardCharsets.UTF_8).length);
            submitCommonPostRaw.enqueue(d(resultCallback, cls, submitCommonPostRaw));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <Rsp> void b(String str, Map<String, String> map, String str2, final Class<Rsp> cls, final ResultCallback<ofg<Rsp>> resultCallback, final ICacheStrategy iCacheStrategy) {
        Object objD;
        ReleaseLogUtil.c("R_NetworkClientMgr", "enter:callHttpPost with cache");
        final String key = iCacheStrategy.getKey();
        final int cacheStrategy = iCacheStrategy.getCacheStrategy();
        final boolean[] zArr = new boolean[1];
        if (ofj.d(cacheStrategy)) {
            objD = this.f.d(key, cls, iCacheStrategy);
            if (objD != null) {
                ReleaseLogUtil.c("R_NetworkClientMgr", "data from disk");
                resultCallback.onSuccess(new ofg<>(2, objD));
                zArr[0] = true;
            }
        } else {
            objD = null;
        }
        final Object obj = objD;
        if (ofj.e(cacheStrategy) && (ofj.b(cacheStrategy) || obj == null)) {
            c(str, map, str2, cls, new ResultCallback<Rsp>() { // from class: oet.5
                @Override // com.huawei.networkclient.ResultCallback
                public void onSuccess(Rsp rsp) {
                    DataConverterRepository.DataConverter dataConverterD = oet.this.k.d(cls);
                    if (obj == null || !dataConverterD.revert(rsp).equals(dataConverterD.revert(obj))) {
                        ReleaseLogUtil.c("R_NetworkClientMgr", "data from network");
                        resultCallback.onSuccess(new ofg(1, rsp));
                    }
                    if (ofj.d(cacheStrategy)) {
                        oet.this.a(rsp, dataConverterD, key, iCacheStrategy);
                    }
                }

                @Override // com.huawei.networkclient.ResultCallback
                public void onFailure(Throwable th) {
                    if (zArr[0]) {
                        return;
                    }
                    resultCallback.onFailure(th);
                }
            });
        }
        e(resultCallback, cacheStrategy, obj);
    }

    private <Rsp> void e(ResultCallback<ofg<Rsp>> resultCallback, int i2, Rsp rsp) {
        if (ofj.d(i2) && rsp == null && !ofj.e(i2)) {
            ReleaseLogUtil.b("R_NetworkClientMgr", "no cache on disk, consider enableNetwork to get data from network");
            resultCallback.onFailure(new Throwable("no cache on disk, consider enableNetwork to get data from network"));
        } else {
            if (ofj.d(i2) || ofj.e(i2)) {
                return;
            }
            ReleaseLogUtil.b("R_NetworkClientMgr", "wrong cacheStrategy");
            resultCallback.onFailure(new Throwable("wrong cacheStrategy"));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public <Rsp> void a(final Rsp rsp, final DataConverterRepository.DataConverter dataConverter, final String str, final ICacheStrategy iCacheStrategy) {
        ThreadPoolManager.c().b("network_cache", new Runnable() { // from class: oet.2
            @Override // java.lang.Runnable
            public void run() {
                oet.this.f.a(str, iCacheStrategy, dataConverter.revert(rsp));
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0056 A[Catch: IOException -> 0x0093, JsonSyntaxException -> 0x0095, TryCatch #1 {JsonSyntaxException -> 0x0095, blocks: (B:9:0x0033, B:12:0x003a, B:14:0x0047, B:16:0x0056, B:18:0x0061, B:20:0x006a, B:22:0x0075, B:13:0x0041), top: B:32:0x0033 }] */
    /* JADX WARN: Code duplicated, block: B:17:0x005f  */
    /* JADX WARN: Code duplicated, block: B:20:0x006a A[Catch: IOException -> 0x0093, JsonSyntaxException -> 0x0095, TryCatch #1 {JsonSyntaxException -> 0x0095, blocks: (B:9:0x0033, B:12:0x003a, B:14:0x0047, B:16:0x0056, B:18:0x0061, B:20:0x006a, B:22:0x0075, B:13:0x0041), top: B:32:0x0033 }] */
    /* JADX WARN: Code duplicated, block: B:22:0x0075 A[Catch: IOException -> 0x0093, JsonSyntaxException -> 0x0095, TRY_LEAVE, TryCatch #1 {JsonSyntaxException -> 0x0095, blocks: (B:9:0x0033, B:12:0x003a, B:14:0x0047, B:16:0x0056, B:18:0x0061, B:20:0x006a, B:22:0x0075, B:13:0x0041), top: B:32:0x0033 }] */
    public <Rsp> Rsp b(String str, Map<String, String> map, Map<String, String> map2, Class<Rsp> cls) {
        Submit<String> submitCommonGet;
        IOException e2;
        Response<String> responseExecute;
        String body;
        long length;
        if (BaseApplication.b().getMainLooper() == Looper.myLooper()) {
            ReleaseLogUtil.b("R_NetworkClientMgr", "network action in main thread");
            LogUtil.d("NetworkClientMgr", "network action in main thread, responseType is ", cls.getSimpleName());
        }
        if (b(map, (ResultCallback) null)) {
            if (map2 != null) {
                try {
                    try {
                        if (map2.isEmpty()) {
                            submitCommonGet = this.l.commonGet(str, map);
                        } else {
                            submitCommonGet = this.l.commonGet(str, map, map2);
                        }
                        try {
                            responseExecute = submitCommonGet.execute();
                            ofz.a(submitCommonGet);
                            body = responseExecute.getBody();
                            if (body != null) {
                                length = body.getBytes(StandardCharsets.UTF_8).length;
                            } else {
                                length = 0;
                            }
                            ofp.e(str, length);
                            if (responseExecute.isOK()) {
                                return (Rsp) this.k.d(cls).convert(body, cls);
                            }
                            LogUtil.e("NetworkClientMgr", cls.getSimpleName(), " status code:", Integer.valueOf(responseExecute.getCode()));
                            return null;
                        } catch (IOException e3) {
                            e2 = e3;
                            b(submitCommonGet);
                            LogUtil.d("NetworkClientMgr", cls.getSimpleName(), " fail:", ExceptionUtils.c(e2));
                            return null;
                        }
                    } catch (IOException e4) {
                        e2 = e4;
                        submitCommonGet = null;
                        b(submitCommonGet);
                        LogUtil.d("NetworkClientMgr", cls.getSimpleName(), " fail:", ExceptionUtils.c(e2));
                        return null;
                    }
                } catch (JsonSyntaxException e5) {
                    LogUtil.d("NetworkClientMgr", cls.getSimpleName(), " string convert error:", ExceptionUtils.c(e5));
                }
            } else {
                submitCommonGet = this.l.commonGet(str, map);
                responseExecute = submitCommonGet.execute();
                ofz.a(submitCommonGet);
                body = responseExecute.getBody();
                if (body != null) {
                    length = body.getBytes(StandardCharsets.UTF_8).length;
                } else {
                    length = 0;
                }
                ofp.e(str, length);
                if (responseExecute.isOK()) {
                    return (Rsp) this.k.d(cls).convert(body, cls);
                }
                LogUtil.e("NetworkClientMgr", cls.getSimpleName(), " status code:", Integer.valueOf(responseExecute.getCode()));
                return null;
            }
        }
        return null;
    }

    public <Rsp> void e(String str, Map<String, String> map, Map<String, String> map2, Class<Rsp> cls, ResultCallback<Rsp> resultCallback) {
        if (b(map, resultCallback)) {
            Submit<ResponseBody> submitCommonGetRaw = this.l.commonGetRaw(str, map, map2);
            submitCommonGetRaw.enqueue(d(resultCallback, cls, submitCommonGetRaw));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <Rsp> void d(String str, Map<String, String> map, Map<String, String> map2, final Class<Rsp> cls, final ResultCallback<ofg<Rsp>> resultCallback, final ICacheStrategy iCacheStrategy) {
        Object objD;
        ReleaseLogUtil.c("R_NetworkClientMgr", "enter:callHttpGet with cache");
        final String key = iCacheStrategy.getKey();
        final int cacheStrategy = iCacheStrategy.getCacheStrategy();
        final boolean[] zArr = new boolean[1];
        if (ofj.d(cacheStrategy)) {
            objD = this.f.d(key, cls, iCacheStrategy);
            if (objD != null) {
                ReleaseLogUtil.c("R_NetworkClientMgr", "data from disk");
                resultCallback.onSuccess(new ofg<>(2, objD));
                zArr[0] = true;
            }
        } else {
            objD = null;
        }
        final Object obj = objD;
        if (ofj.e(cacheStrategy) && (ofj.b(cacheStrategy) || obj == null)) {
            e(str, map, map2, cls, new ResultCallback<Rsp>() { // from class: oet.4
                @Override // com.huawei.networkclient.ResultCallback
                public void onSuccess(Rsp rsp) {
                    DataConverterRepository.DataConverter dataConverterD = oet.this.k.d(cls);
                    if (obj == null || !dataConverterD.revert(rsp).equals(dataConverterD.revert(obj))) {
                        ReleaseLogUtil.c("R_NetworkClientMgr", "data from network");
                        resultCallback.onSuccess(new ofg(1, rsp));
                    }
                    if (ofj.d(cacheStrategy)) {
                        oet.this.a(rsp, dataConverterD, key, iCacheStrategy);
                    }
                }

                @Override // com.huawei.networkclient.ResultCallback
                public void onFailure(Throwable th) {
                    if (zArr[0]) {
                        return;
                    }
                    resultCallback.onFailure(th);
                }
            });
        }
        e(resultCallback, cacheStrategy, obj);
    }

    public void a(final IDownloadStrategy iDownloadStrategy) {
        ProgressListener listener = iDownloadStrategy.getListener();
        if (listener == null) {
            listener = new oey();
        }
        final ProgressListener progressListener = listener;
        final String url = iDownloadStrategy.getUrl();
        if (d.containsKey(url) || f44245a.containsKey(url)) {
            ReleaseLogUtil.d("R_NetworkClientMgr", "is downloading, call cancelDownload or wait download finish");
            Throwable th = new Throwable("duplicate task calling when previous is downloading");
            iDownloadStrategy.handleException(th, 1003);
            progressListener.onFail(th);
            return;
        }
        f44245a.put(url, progressListener);
        final Submit<ResponseBody> submitE = e(iDownloadStrategy, url);
        if (submitE == null) {
            LogUtil.d("NetworkClientMgr", "commonDownload downloadSubmit is null");
        } else {
            d.put(url, submitE);
            submitE.enqueue(new com.huawei.hms.framework.network.restclient.ResultCallback<ResponseBody>() { // from class: oet.3
                @Override // com.huawei.hms.framework.network.restclient.ResultCallback
                public void onResponse(Response<ResponseBody> response) {
                    if (!response.isSuccessful()) {
                        ReleaseLogUtil.d("R_NetworkClientMgr", "download response not 2XX");
                    }
                    ResponseBody body = response.getBody();
                    ofp.e(url, body.getContentLength());
                    if (body.getInputStream() == null) {
                        ReleaseLogUtil.b("R_NetworkClientMgr", "download inputStream is null");
                        iDownloadStrategy.handleException(new Throwable("download inputStream is null"), response.getCode());
                        progressListener.onFail(new Throwable("download inputStream is null"));
                        oet.this.e(url);
                        FileUtils.a(body);
                        return;
                    }
                    iDownloadStrategy.handleResponseBody(body, response.getCode());
                    oet.this.e(url);
                }

                @Override // com.huawei.hms.framework.network.restclient.ResultCallback
                public void onFailure(Throwable th2) {
                    ReleaseLogUtil.b("R_NetworkClientMgr", "download url fail", ExceptionUtils.c(th2));
                    iDownloadStrategy.handleException(th2, 1001);
                    progressListener.onFail(th2);
                    oet.this.e(url);
                    oet.this.b(submitE);
                }
            });
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0026  */
    private Submit<ResponseBody> e(IDownloadStrategy iDownloadStrategy, String str) {
        Submit<ResponseBody> submitCommonDownload;
        Map<String, String> headers = iDownloadStrategy.getHeaders();
        int requestMethod = iDownloadStrategy.getRequestMethod();
        String requestBody = iDownloadStrategy.getRequestBody();
        if (requestMethod != 1) {
            submitCommonDownload = null;
        } else if (headers != null) {
            if (e(headers)) {
                submitCommonDownload = this.l.commonDownload(str, headers);
            } else {
                submitCommonDownload = null;
            }
        } else {
            submitCommonDownload = this.l.commonDownload(str);
        }
        if (requestMethod == 2) {
            if (TextUtils.isEmpty(requestBody)) {
                requestBody = RequestBody.create((MediaType) null, "").toString();
            }
            if (e(headers)) {
                return this.l.commonDownload(str, headers, requestBody);
            }
        }
        return submitCommonDownload;
    }

    public boolean b(String str) {
        if (TextUtils.isEmpty(str)) {
            ReleaseLogUtil.b("R_NetworkClientMgr", "url is null");
            return false;
        }
        if (!d.containsKey(str)) {
            ReleaseLogUtil.b("R_NetworkClientMgr", "without matched download task");
            return false;
        }
        f44245a.remove(str);
        Submit<ResponseBody> submitRemove = d.remove(str);
        if (submitRemove == null) {
            return false;
        }
        submitRemove.cancel();
        return true;
    }

    public void b() {
        this.f.b();
        f44245a.clear();
        d.clear();
        this.f = new ofj("network_cache", this.k);
    }

    private void d(HttpClient httpClient) {
        this.o = new RestClient.Builder().httpClient(httpClient.newBuilder().addInterceptor(new Interceptor() { // from class: oes
            @Override // com.huawei.hms.framework.network.restclient.hwhttp.Interceptor
            public final com.huawei.hms.framework.network.restclient.hwhttp.Response intercept(Interceptor.Chain chain) {
                return this.f44244b.c(chain);
            }
        }).build()).addConverterFactory(new ofc()).addConverterFactory(new oev()).addConverterFactory(GsonConverterFactory.create()).build();
        this.l = (CommonApi) e(CommonApi.class);
        DataConverterRepository dataConverterRepository = new DataConverterRepository();
        this.k = dataConverterRepository;
        dataConverterRepository.d(String.class, new ofn());
        this.k.d(byte[].class, new ofl());
        this.k.d(oeq.class, new ofm());
        this.f = new ofj("network_cache", this.k);
    }

    private HttpClient i() {
        RestClientGlobalInstance.getInstance().init(BaseApplication.b());
        return new HttpClient.Builder().readTimeout(30000).writeTimeout(30000).build();
    }

    private <Rsp> com.huawei.hms.framework.network.restclient.ResultCallback<ResponseBody> d(final ResultCallback<Rsp> resultCallback, final Class<Rsp> cls, final Submit<ResponseBody> submit) {
        return new com.huawei.hms.framework.network.restclient.ResultCallback<ResponseBody>() { // from class: oet.8
            @Override // com.huawei.hms.framework.network.restclient.ResultCallback
            public void onResponse(Response<ResponseBody> response) throws Throwable {
                ResponseBody body;
                ofz.a(submit);
                if (response == null) {
                    resultCallback.onFailure(new Throwable("empty response"));
                    return;
                }
                if (!response.isOK()) {
                    int code = response.getCode();
                    resultCallback.onFailure(new oeu(code, "response status code:" + code, response.getErrorBody(), response.getHeaders(), response.getBody()));
                    return;
                }
                ResponseBody responseBody = null;
                try {
                    try {
                        Object objConvert = oet.this.k.d(cls).convert(response.getBody(), response.getHeaders(), cls);
                        body = response.getBody();
                        try {
                            if (response.getUrl() != null && body != null) {
                                ofp.e(response.getUrl().toString(), body.getContentLength());
                            }
                            if (objConvert == null) {
                                resultCallback.onFailure(new Throwable("rsp is null"));
                            } else {
                                resultCallback.onSuccess(objConvert);
                            }
                            FileUtils.a(body);
                        } catch (JsonSyntaxException e2) {
                            e = e2;
                            responseBody = body;
                            resultCallback.onFailure(new Throwable(e.getMessage()));
                            FileUtils.a(responseBody);
                        } catch (Throwable th) {
                            th = th;
                            FileUtils.a(body);
                            throw th;
                        }
                    } catch (JsonSyntaxException e3) {
                        e = e3;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    body = responseBody;
                }
            }

            @Override // com.huawei.hms.framework.network.restclient.ResultCallback
            public void onFailure(Throwable th) {
                resultCallback.onFailure(th);
                oet.this.b(submit);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.huawei.hms.framework.network.restclient.hwhttp.Response c(Interceptor.Chain chain) throws IOException {
        final Request request = chain.request();
        final Headers headers = request.getHeaders();
        int iC = c(10000) + 100000000;
        ofz.c(iC, request);
        String str = headers.get(j2.v);
        if (!TextUtils.isEmpty(str) && str.toLowerCase(Locale.ENGLISH).contains(Constants.GZIP)) {
            request = request.newBuilder().headers(headers.newBuilder().removeAll(j2.v)).build();
        }
        String str2 = headers.get("Content-Encoding");
        if (!TextUtils.isEmpty(str2) && str2.toLowerCase(Locale.ENGLISH).contains(Constants.GZIP)) {
            request = request.newBuilder().requestBody(new RequestBody() { // from class: oet.6
                @Override // com.huawei.hms.framework.network.restclient.hwhttp.RequestBody
                public void writeTo(OutputStream outputStream) throws IOException {
                }

                @Override // com.huawei.hms.framework.network.restclient.hwhttp.RequestBody
                public byte[] body() {
                    return ofe.e(request.getBody().body());
                }

                @Override // com.huawei.hms.framework.network.restclient.hwhttp.RequestBody
                public String contentType() {
                    return headers.get("Content-Type");
                }
            }).build();
        }
        com.huawei.hms.framework.network.restclient.hwhttp.Response responseB = ofz.b(iC, chain.proceed(request));
        HttpUrl url = chain.request().getUrl();
        if (url == null || url.getUrl() == null || !f44245a.containsKey(url.getUrl())) {
            return responseB;
        }
        InputStream inputStream = responseB.getBody().getInputStream();
        LogUtil.c("NetworkClientMgr", "downloading url with listener:", url.getUrl());
        return responseB.newBuilder().body(responseB.getBody().newBuilder().inputStream(new oex(inputStream, responseB.getBody().getContentLength(), f44245a.get(url.getUrl()))).build()).build();
    }

    private boolean e(Map<String, String> map) {
        if (map == null) {
            ReleaseLogUtil.b("R_NetworkClientMgr", "request headers is null");
            return false;
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (TextUtils.isEmpty(entry.getValue())) {
                ReleaseLogUtil.b("R_NetworkClientMgr", "value of key:", entry.getKey(), " is empty");
                return false;
            }
        }
        return true;
    }

    private <Rsp> boolean b(Map<String, String> map, ResultCallback<Rsp> resultCallback) {
        try {
            if (NetworkUtil.h()) {
                if (this.l == null) {
                    if (resultCallback != null) {
                        resultCallback.onFailure(new Throwable("commonApi not init"));
                    }
                    ReleaseLogUtil.d("R_NetworkClientMgr", "isPreConditionCheckPass ", "commonApi not init");
                    return false;
                }
                if (e(map)) {
                    return true;
                }
                if (resultCallback != null) {
                    resultCallback.onFailure(new Throwable("headers invalid"));
                }
                ReleaseLogUtil.d("R_NetworkClientMgr", "isPreConditionCheckPass ", "request headers invalid");
                return false;
            }
        } catch (NoClassDefFoundError unused) {
            ReleaseLogUtil.b("R_NetworkClientMgr", "isPreConditionCheckPass ", "NetworkUtil NoClassDefFoundError.");
        }
        if (resultCallback != null) {
            resultCallback.onFailure(new Throwable("no network connection"));
        }
        ReleaseLogUtil.d("R_NetworkClientMgr", "isPreConditionCheckPass ", "no network connection");
        return false;
    }

    public <Rsp> void c(String str, Map<String, String> map, Class<Rsp> cls, ResultCallback<Rsp> resultCallback) {
        if (b(map, resultCallback)) {
            Submit<ResponseBody> submitDeleteReqRaw = this.l.deleteReqRaw(str, map);
            submitDeleteReqRaw.enqueue(d(resultCallback, cls, submitDeleteReqRaw));
        }
    }

    public <Rsp> void d(String str, Map<String, String> map, String str2, Class<Rsp> cls, ResultCallback<Rsp> resultCallback) {
        if (b(map, resultCallback)) {
            Submit<ResponseBody> submitPutReqRaw = this.l.putReqRaw(str, map, str2);
            ofp.e(str, str2.getBytes(StandardCharsets.UTF_8).length);
            submitPutReqRaw.enqueue(d(resultCallback, cls, submitPutReqRaw));
        }
    }

    public static boolean d(long j2) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (jElapsedRealtime - h < j2) {
            return false;
        }
        h = jElapsedRealtime;
        return true;
    }

    public void b(Submit<?> submit) {
        if (submit == null) {
            LogUtil.e("NetworkClientMgr", "requestFail submit is null.");
            return;
        }
        try {
            RequestFinishedInfo requestFinishedInfo = submit.request().getRequestFinishedInfo();
            if (requestFinishedInfo == null) {
                LogUtil.e("NetworkClientMgr", "requestFail info is null.");
                return;
            }
            RequestFinishedInfo.Metrics metrics = requestFinishedInfo.getMetrics();
            if (metrics == null) {
                LogUtil.e("NetworkClientMgr", "requestFail metrics is null.");
                return;
            }
            LogUtil.b("NetworkClientMgr", "DnsType : " + metrics.getDnsType() + " url: " + requestFinishedInfo.getUrl() + " : ");
            if ((w.l.equalsIgnoreCase(metrics.getDnsType()) || w.m.equalsIgnoreCase(metrics.getDnsType())) && d(3600000L)) {
                j();
            }
        } catch (Exception e2) {
            ReleaseLogUtil.b("R_NetworkClientMgr", " fail to requestFail", ExceptionUtils.c(e2));
        }
    }

    private void j() {
        ThreadPoolManager.c().execute(new Runnable() { // from class: oet.10
            @Override // java.lang.Runnable
            public void run() {
                GrsBaseInfo grsBaseInfo = new GrsBaseInfo();
                grsBaseInfo.setAppName(oet.f44246b);
                String string = BaseApplication.b().getSharedPreferences("grs_init_info", 0).getString("grs_countrycode_key", "");
                ReleaseLogUtil.c("R_NetworkClientMgr", "AppName : " + oet.f44246b + " CountrySource:" + string);
                if (TextUtils.isEmpty(string)) {
                    ReleaseLogUtil.c("R_NetworkClientMgr", "countryCode is null");
                    return;
                }
                grsBaseInfo.setCountrySource(string);
                grsBaseInfo.setSerCountry(string);
                grsBaseInfo.setRegCountry(string);
                grsBaseInfo.setVersionName(Build.VERSION.RELEASE);
                GrsClient grsClient = new GrsClient(BaseApplication.b(), grsBaseInfo);
                ReleaseLogUtil.c("R_NetworkClientMgr", "grsClient.forceExpire()");
                grsClient.forceExpire();
            }
        });
    }

    private SecureRandom h() {
        try {
            return SecureRandom.getInstanceStrong();
        } catch (NoSuchAlgorithmException e2) {
            ReleaseLogUtil.b("NetworkClientMgr", "getSecureRandom exception ", e2);
            return new SecureRandom();
        }
    }

    public int c(int i2) {
        if (i2 <= 0) {
            ReleaseLogUtil.d("NetworkClientMgr", "getSecureRandomForInt bound ", Integer.valueOf(i2));
            return 0;
        }
        return h().nextInt(i2);
    }

    private static void b(final HttpURLConnection httpURLConnection, Map<String, String> map) {
        if (httpURLConnection == null || CollectionUtils.c(map)) {
            return;
        }
        Objects.requireNonNull(httpURLConnection);
        map.forEach(new BiConsumer() { // from class: oew
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                httpURLConnection.setRequestProperty((String) obj, (String) obj2);
            }
        });
    }

    public void e() {
        g = true;
    }

    public void b(int i2) {
        if (i2 <= 0) {
            i2 = 30000;
        }
        this.n = i2;
    }

    public void c(String str, Map<String, String> map, NetworkClientMgrApi.SSECallback sSECallback) {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            httpURLConnection.setChunkedStreamingMode(0);
            httpURLConnection.setConnectTimeout(this.n);
            httpURLConnection.setReadTimeout(this.n);
            httpURLConnection.setRequestMethod("GET");
            b(httpURLConnection, map);
            j.execute(new e("", httpURLConnection, sSECallback));
        } catch (IOException e2) {
            ReleaseLogUtil.b("R_NetworkClientMgr", "CallSseGet IOException ", ExceptionUtils.c(e2));
            sSECallback.fail("CallSseGet IOException:" + e2.getMessage(), -1);
            sSECallback.complete("Stream ended", 0);
        }
    }

    public void a(String str, Map<String, String> map, String str2, NetworkClientMgrApi.SSECallback sSECallback) {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            httpURLConnection.setChunkedStreamingMode(0);
            httpURLConnection.setConnectTimeout(this.n);
            httpURLConnection.setReadTimeout(this.n);
            httpURLConnection.setRequestMethod("POST");
            b(httpURLConnection, map);
            j.execute(new e(str2, httpURLConnection, sSECallback));
        } catch (IOException e2) {
            ReleaseLogUtil.b("R_NetworkClientMgr", "CallSsePost IOException ", ExceptionUtils.c(e2));
            sSECallback.fail("CallSsePost IOException:" + e2.getMessage(), -1);
            sSECallback.complete("Stream ended", 0);
        }
    }

    /* JADX INFO: loaded from: classes40.dex */
    static class e implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final NetworkClientMgrApi.SSECallback f44264b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final HttpURLConnection f44265c;
        private final String e;

        e(String str, HttpURLConnection httpURLConnection, NetworkClientMgrApi.SSECallback sSECallback) {
            this.e = str;
            this.f44265c = httpURLConnection;
            this.f44264b = sSECallback;
        }

        @Override // java.lang.Runnable
        public void run() {
            ReleaseLogUtil.c("R_NetworkClientMgr", "startSseRequest waiting.....");
            boolean unused = oet.g = false;
            try {
                if (!TextUtils.isEmpty(this.e)) {
                    this.f44265c.setDoOutput(true);
                    this.f44265c.getOutputStream().write(this.e.getBytes(StandardCharsets.UTF_8));
                }
                int responseCode = this.f44265c.getResponseCode();
                try {
                    if (responseCode != 200) {
                        ReleaseLogUtil.b("R_NetworkClientMgr", "SseReqRunnable connection resultCode: ", Integer.valueOf(responseCode));
                        this.f44264b.fail("Error connection resultCode!", responseCode);
                        this.f44264b.complete("Stream ended", 0);
                        return;
                    }
                    try {
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this.f44265c.getInputStream(), StandardCharsets.UTF_8));
                        try {
                            StringBuilder sb = new StringBuilder();
                            while (true) {
                                String line = bufferedReader.readLine();
                                if (line == null || oet.g || Thread.currentThread().isInterrupted()) {
                                    break;
                                }
                                if (line.isEmpty()) {
                                    if (sb.length() > 0) {
                                        sb.append("\n");
                                        this.f44264b.success(sb.toString());
                                        sb.setLength(0);
                                    }
                                } else {
                                    sb.append(line);
                                    sb.append("\n");
                                }
                            }
                            bufferedReader.close();
                            this.f44265c.disconnect();
                            boolean unused2 = oet.g = false;
                            this.f44264b.complete("Stream ended", 0);
                        } catch (Throwable th) {
                            try {
                                bufferedReader.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    } catch (IOException e) {
                        ReleaseLogUtil.b("R_NetworkClientMgr", "SseReqRunnable IOException2: ", ExceptionUtils.c(e));
                        this.f44264b.fail("SseReqRunnable IOException: " + e.getMessage(), -1);
                        this.f44265c.disconnect();
                        boolean unused3 = oet.g = false;
                        this.f44264b.complete("Stream ended", 0);
                    }
                } catch (Throwable th3) {
                    this.f44265c.disconnect();
                    boolean unused4 = oet.g = false;
                    this.f44264b.complete("Stream ended", 0);
                    throw th3;
                }
            } catch (IOException e2) {
                ReleaseLogUtil.b("R_NetworkClientMgr", "SseReqRunnable IOException1: ", ExceptionUtils.c(e2));
                this.f44264b.fail("Connection error:" + e2.getMessage(), -1);
                this.f44264b.complete("Stream ended", 0);
            }
        }
    }
}
