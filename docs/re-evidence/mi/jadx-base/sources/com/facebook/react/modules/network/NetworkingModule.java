package com.facebook.react.modules.network;

import android.net.Uri;
import android.util.Base64;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.GuardedAsyncTask;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.xiaomi.smarthome.library.apache.http.protocol.HTTP;
import defpackage.bnk;
import defpackage.cm8;
import defpackage.cmb;
import defpackage.e7h;
import defpackage.f7h;
import defpackage.gci;
import defpackage.gkg;
import defpackage.ici;
import defpackage.kk4;
import defpackage.l1a;
import defpackage.nbo;
import defpackage.ndj;
import defpackage.osk;
import defpackage.qci;
import defpackage.qjg;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.CookieJar;
import okhttp3.Headers;
import okhttp3.Interceptor;
import okhttp3.JavaNetCookieJar;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okio.ByteString;
import okio.GzipSource;
import okio.Okio;

/* JADX INFO: loaded from: classes4.dex */
@ndj(name = NetworkingModule.NAME)
public final class NetworkingModule extends ReactContextBaseJavaModule {
    private static final int CHUNK_TIMEOUT_NS = 100000000;
    private static final String CONTENT_ENCODING_HEADER_NAME = "content-encoding";
    private static final String CONTENT_TYPE_HEADER_NAME = "content-type";
    private static final int MAX_CHUNK_SIZE_BETWEEN_FLUSHES = 8192;
    public static final String NAME = "Networking";
    private static final String REQUEST_BODY_KEY_BASE64 = "base64";
    private static final String REQUEST_BODY_KEY_FORMDATA = "formData";
    private static final String REQUEST_BODY_KEY_STRING = "string";
    private static final String REQUEST_BODY_KEY_URI = "uri";
    private static final String TAG = "NetworkingModule";
    private static final String USER_AGENT_HEADER_NAME = "user-agent";
    private static e customClientBuilder;
    private final OkHttpClient mClient;
    private final l1a mCookieHandler;
    private final kk4 mCookieJarContainer;
    private final String mDefaultUserAgent;
    private final List<g> mRequestBodyHandlers;
    private final Set<Integer> mRequestIds;
    private final List<h> mResponseHandlers;
    private boolean mShuttingDown;
    private final List<i> mUriHandlers;
    private qjg netRequestReporter;
    private f networkModuleProxy;

    public class a implements Interceptor {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f7423a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ DeviceEventManagerModule.RCTDeviceEventEmitter f7424b;
        public final /* synthetic */ int c;

        /* JADX INFO: renamed from: com.facebook.react.modules.network.NetworkingModule$a$a, reason: collision with other inner class name */
        public class C0167a implements gci {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public long f7425a = System.nanoTime();

            public C0167a() {
            }

            @Override // defpackage.gci
            public void a(long j, long j2, boolean z) {
                long jNanoTime = System.nanoTime();
                if ((z || NetworkingModule.shouldDispatch(jNanoTime, this.f7425a)) && !a.this.f7423a.equals("text")) {
                    a aVar = a.this;
                    osk.c(aVar.f7424b, aVar.c, j, j2);
                    this.f7425a = jNanoTime;
                }
            }
        }

        public a(String str, DeviceEventManagerModule.RCTDeviceEventEmitter rCTDeviceEventEmitter, int i) {
            this.f7423a = str;
            this.f7424b = rCTDeviceEventEmitter;
            this.c = i;
        }

        @Override // okhttp3.Interceptor
        public Response intercept(Interceptor.Chain chain) throws IOException {
            Response responseProceed = chain.proceed(chain.request());
            return responseProceed.newBuilder().body(new ici(responseProceed.body(), new C0167a())).build();
        }
    }

    public class b implements Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f7427a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ DeviceEventManagerModule.RCTDeviceEventEmitter f7428b;
        public final /* synthetic */ String c;
        public final /* synthetic */ boolean d;

        public b(int i, DeviceEventManagerModule.RCTDeviceEventEmitter rCTDeviceEventEmitter, String str, boolean z) {
            this.f7427a = i;
            this.f7428b = rCTDeviceEventEmitter;
            this.c = str;
            this.d = z;
        }

        @Override // okhttp3.Callback
        public void onFailure(Call call, IOException iOException) {
            String message;
            if (NetworkingModule.this.mShuttingDown) {
                return;
            }
            NetworkingModule.this.removeRequest(this.f7427a);
            if (iOException.getMessage() != null) {
                message = iOException.getMessage();
            } else {
                message = "Error while executing request: " + iOException.getClass().getSimpleName();
            }
            osk.f(this.f7428b, this.f7427a, message, iOException);
        }

        @Override // okhttp3.Callback
        public void onResponse(Call call, Response response) throws IOException {
            if (NetworkingModule.this.mShuttingDown) {
                return;
            }
            NetworkingModule.this.removeRequest(this.f7427a);
            osk.h(this.f7428b, this.f7427a, response.code(), NetworkingModule.translateHeaders(response.headers()), response.request().url().getUrl());
            try {
                ResponseBody responseBodyBody = response.body();
                if ("gzip".equalsIgnoreCase(response.header(HTTP.CONTENT_ENCODING)) && responseBodyBody != null) {
                    GzipSource gzipSource = new GzipSource(responseBodyBody.getSource());
                    String strHeader = response.header("Content-Type");
                    responseBodyBody = ResponseBody.create(strHeader != null ? MediaType.parse(strHeader) : null, -1L, Okio.buffer(gzipSource));
                }
                for (h hVar : NetworkingModule.this.mResponseHandlers) {
                    if (hVar.b(this.c)) {
                        osk.a(this.f7428b, this.f7427a, hVar.a(responseBodyBody));
                        osk.g(this.f7428b, this.f7427a);
                        return;
                    }
                }
                if (this.d && this.c.equals("text")) {
                    NetworkingModule.this.readWithProgress(this.f7428b, this.f7427a, responseBodyBody);
                    osk.g(this.f7428b, this.f7427a);
                    return;
                }
                String strString = "";
                if (this.c.equals("text")) {
                    try {
                        strString = responseBodyBody.string();
                    } catch (IOException e) {
                        if (!response.request().method().equalsIgnoreCase("HEAD")) {
                            osk.f(this.f7428b, this.f7427a, e.getMessage(), e);
                        }
                    }
                } else if (this.c.equals("base64")) {
                    strString = Base64.encodeToString(responseBodyBody.bytes(), 2);
                }
                osk.b(this.f7428b, this.f7427a, strString);
                osk.g(this.f7428b, this.f7427a);
            } catch (IOException e2) {
                osk.f(this.f7428b, this.f7427a, e2.getMessage(), e2);
            }
        }
    }

    public class c implements gci {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f7429a = System.nanoTime();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ DeviceEventManagerModule.RCTDeviceEventEmitter f7430b;
        public final /* synthetic */ int c;

        public c(DeviceEventManagerModule.RCTDeviceEventEmitter rCTDeviceEventEmitter, int i) {
            this.f7430b = rCTDeviceEventEmitter;
            this.c = i;
        }

        @Override // defpackage.gci
        public void a(long j, long j2, boolean z) {
            long jNanoTime = System.nanoTime();
            if (z || NetworkingModule.shouldDispatch(jNanoTime, this.f7429a)) {
                osk.d(this.f7430b, this.c, j, j2);
                this.f7429a = jNanoTime;
            }
        }
    }

    public class d extends GuardedAsyncTask<Void, Void> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f7431a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ReactContext reactContext, int i) {
            super(reactContext);
            this.f7431a = i;
        }

        @Override // com.facebook.react.bridge.GuardedAsyncTask
        public void doInBackgroundGuarded(Void... voidArr) {
            e7h.a(NetworkingModule.this.mClient, Integer.valueOf(this.f7431a));
        }
    }

    public interface e {
    }

    public interface f {
    }

    public interface g {
        boolean a(ReadableMap readableMap);

        RequestBody b(ReadableMap readableMap, String str);
    }

    public interface h {
        WritableMap a(ResponseBody responseBody) throws IOException;

        boolean b(String str);
    }

    public interface i {
        WritableMap a(Uri uri) throws IOException;

        boolean b(Uri uri, String str);
    }

    public NetworkingModule(ReactApplicationContext reactApplicationContext, String str, OkHttpClient okHttpClient, List<gkg> list) {
        super(reactApplicationContext);
        this.mRequestBodyHandlers = new ArrayList();
        this.mUriHandlers = new ArrayList();
        this.mResponseHandlers = new ArrayList();
        this.netRequestReporter = null;
        if (list != null) {
            OkHttpClient.Builder builderNewBuilder = okHttpClient.newBuilder();
            Iterator<gkg> it = list.iterator();
            while (it.hasNext()) {
                builderNewBuilder.addNetworkInterceptor(it.next().create());
            }
            okHttpClient = builderNewBuilder.build();
        }
        this.mClient = okHttpClient;
        this.mCookieHandler = new l1a(reactApplicationContext);
        this.mCookieJarContainer = (kk4) okHttpClient.cookieJar();
        this.mShuttingDown = false;
        this.mDefaultUserAgent = str;
        this.mRequestIds = new HashSet();
    }

    private synchronized void addRequest(int i2) {
        this.mRequestIds.add(Integer.valueOf(i2));
    }

    private static void applyCustomBuilder(OkHttpClient.Builder builder) {
    }

    private synchronized void cancelAllRequests() {
        try {
            Iterator<Integer> it = this.mRequestIds.iterator();
            while (it.hasNext()) {
                cancelRequest(it.next().intValue());
            }
            this.mRequestIds.clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    private void cancelRequest(int i2) {
        new d(getReactApplicationContext(), i2).execute(new Void[0]);
    }

    private MultipartBody.Builder constructMultipartBody(ReadableArray readableArray, String str, int i2) {
        MediaType mediaType;
        DeviceEventManagerModule.RCTDeviceEventEmitter eventEmitter = getEventEmitter();
        MultipartBody.Builder builder = new MultipartBody.Builder();
        builder.setType(MediaType.parse(str));
        int size = readableArray.size();
        for (int i3 = 0; i3 < size; i3++) {
            ReadableMap map = readableArray.getMap(i3);
            Headers headersExtractHeaders = extractHeaders(map.getArray("headers"), null);
            if (headersExtractHeaders == null) {
                osk.f(eventEmitter, i2, "Missing or invalid header format for FormData part.", null);
                return null;
            }
            String str2 = headersExtractHeaders.get(CONTENT_TYPE_HEADER_NAME);
            if (str2 != null) {
                mediaType = MediaType.parse(str2);
                headersExtractHeaders = headersExtractHeaders.newBuilder().removeAll(CONTENT_TYPE_HEADER_NAME).build();
            } else {
                mediaType = null;
            }
            if (map.hasKey(REQUEST_BODY_KEY_STRING)) {
                builder.addPart(headersExtractHeaders, RequestBody.create(mediaType, map.getString(REQUEST_BODY_KEY_STRING)));
            } else if (!map.hasKey("uri")) {
                osk.f(eventEmitter, i2, "Unrecognized FormData part.", null);
            } else {
                if (mediaType == null) {
                    osk.f(eventEmitter, i2, "Binary FormData part needs a content-type header.", null);
                    return null;
                }
                String string = map.getString("uri");
                InputStream inputStreamF = bnk.f(getReactApplicationContext(), string);
                if (inputStreamF == null) {
                    osk.f(eventEmitter, i2, "Could not retrieve file for uri " + string, null);
                    return null;
                }
                builder.addPart(headersExtractHeaders, bnk.a(mediaType, inputStreamF));
            }
        }
        return builder;
    }

    private Headers extractHeaders(ReadableArray readableArray, ReadableMap readableMap) {
        String str;
        if (readableArray == null) {
            return null;
        }
        Headers.Builder builder = new Headers.Builder();
        int size = readableArray.size();
        for (int i2 = 0; i2 < size; i2++) {
            ReadableArray array = readableArray.getArray(i2);
            if (array != null && array.size() == 2) {
                String strA = cmb.a(array.getString(0));
                String strB = cmb.b(array.getString(1));
                if (strA != null && strB != null) {
                    builder.add(strA, strB);
                }
            }
            return null;
        }
        if (builder.get(USER_AGENT_HEADER_NAME) == null && (str = this.mDefaultUserAgent) != null) {
            builder.add(USER_AGENT_HEADER_NAME, str);
        }
        if (readableMap == null || !readableMap.hasKey(REQUEST_BODY_KEY_STRING)) {
            builder.removeAll(CONTENT_ENCODING_HEADER_NAME);
        }
        return builder.build();
    }

    private DeviceEventManagerModule.RCTDeviceEventEmitter getEventEmitter() {
        return (DeviceEventManagerModule.RCTDeviceEventEmitter) getReactApplicationContext().getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void readWithProgress(DeviceEventManagerModule.RCTDeviceEventEmitter rCTDeviceEventEmitter, int i2, ResponseBody responseBody) throws IOException {
        long jM;
        qci qciVar;
        InputStream inputStreamByteStream;
        byte[] bArr;
        long j = -1;
        try {
            try {
                ici iciVar = (ici) responseBody;
                jM = iciVar.m();
                try {
                    j = iciVar.getContentLength();
                    while (true) {
                        int i3 = inputStreamByteStream.read(bArr);
                        if (i3 == -1) {
                            inputStreamByteStream.close();
                            return;
                        }
                        osk.e(rCTDeviceEventEmitter, i2, qciVar.a(bArr, i3), jM, j);
                    }
                } catch (ClassCastException unused) {
                }
            } catch (ClassCastException unused2) {
                jM = -1;
            }
            bArr = new byte[8192];
        } catch (Throwable th) {
            inputStreamByteStream.close();
            throw th;
        }
        qciVar = new qci(responseBody.get$contentType() == null ? nbo.f27758a : responseBody.get$contentType().charset(nbo.f27758a));
        inputStreamByteStream = responseBody.byteStream();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void removeRequest(int i2) {
        this.mRequestIds.remove(Integer.valueOf(i2));
    }

    public static void setCustomClientBuilder(e eVar) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean shouldDispatch(long j, long j2) {
        return j2 + 100000000 < j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static WritableMap translateHeaders(Headers headers) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        for (int i2 = 0; i2 < headers.size(); i2++) {
            String strName = headers.name(i2);
            if (writableMapCreateMap.hasKey(strName)) {
                writableMapCreateMap.putString(strName, writableMapCreateMap.getString(strName) + ", " + headers.value(i2));
            } else {
                writableMapCreateMap.putString(strName, headers.value(i2));
            }
        }
        return writableMapCreateMap;
    }

    private RequestBody wrapRequestBodyWithProgressEmitter(RequestBody requestBody, DeviceEventManagerModule.RCTDeviceEventEmitter rCTDeviceEventEmitter, int i2) {
        if (requestBody == null) {
            return null;
        }
        return bnk.c(requestBody, new c(rCTDeviceEventEmitter, i2));
    }

    @ReactMethod
    public void abortRequest(int i2) {
        cancelRequest(i2);
        removeRequest(i2);
    }

    public void addRequestBodyHandler(g gVar) {
        this.mRequestBodyHandlers.add(gVar);
    }

    public void addResponseHandler(h hVar) {
        this.mResponseHandlers.add(hVar);
    }

    public void addUriHandler(i iVar) {
        this.mUriHandlers.add(iVar);
    }

    @ReactMethod
    public void clearCookies(com.facebook.react.bridge.Callback callback) throws Exception {
        this.mCookieHandler.g(callback);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void initialize() {
        this.mCookieJarContainer.b(new JavaNetCookieJar(this.mCookieHandler));
    }

    public Request makeRNRequest(Request request, String str, RequestBody requestBody, DeviceEventManagerModule.RCTDeviceEventEmitter rCTDeviceEventEmitter, int i2) {
        return request.newBuilder().method(str, wrapRequestBodyWithProgressEmitter(requestBody, rCTDeviceEventEmitter, i2)).build();
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void onCatalystInstanceDestroy() throws Exception {
        this.mShuttingDown = true;
        cancelAllRequests();
        this.mCookieHandler.i();
        this.mCookieJarContainer.a();
        this.mRequestBodyHandlers.clear();
        this.mResponseHandlers.clear();
        this.mUriHandlers.clear();
    }

    public void removeRequestBodyHandler(g gVar) {
        this.mRequestBodyHandlers.remove(gVar);
    }

    public void removeResponseHandler(h hVar) {
        this.mResponseHandlers.remove(hVar);
    }

    public void removeUriHandler(i iVar) {
        this.mUriHandlers.remove(iVar);
    }

    @ReactMethod
    public void sendRequest(String str, String str2, int i2, ReadableArray readableArray, ReadableMap readableMap, String str3, boolean z, int i3, boolean z2) {
        try {
            qjg qjgVar = this.netRequestReporter;
            if (qjgVar != null) {
                qjgVar.reportNetRequest(str2);
            }
            sendRequestInternal(str, str2, i2, readableArray, readableMap, str3, z, i3, z2);
        } catch (Throwable th) {
            cm8.j(TAG, "Failed to send url request: " + str2, th);
            osk.f(getEventEmitter(), i2, th.getMessage(), th);
        }
    }

    public void sendRequestInternal(String str, String str2, int i2, ReadableArray readableArray, ReadableMap readableMap, String str3, boolean z, int i3, boolean z2) {
        g next;
        RequestBody requestBodyE;
        DeviceEventManagerModule.RCTDeviceEventEmitter eventEmitter = getEventEmitter();
        try {
            Uri uri = Uri.parse(str2);
            for (i iVar : this.mUriHandlers) {
                if (iVar.b(uri, str3)) {
                    osk.a(eventEmitter, i2, iVar.a(uri));
                    osk.g(eventEmitter, i2);
                    return;
                }
            }
            try {
                Request.Builder builderUrl = new Request.Builder().url(str2);
                if (i2 != 0) {
                    builderUrl.tag(Integer.valueOf(i2));
                }
                OkHttpClient.Builder builderNewBuilder = this.mClient.newBuilder();
                applyCustomBuilder(builderNewBuilder);
                if (!z2) {
                    builderNewBuilder.cookieJar(CookieJar.NO_COOKIES);
                }
                if (z) {
                    builderNewBuilder.addNetworkInterceptor(new a(str3, eventEmitter, i2));
                }
                if (i3 != this.mClient.connectTimeoutMillis()) {
                    builderNewBuilder.connectTimeout(i3, TimeUnit.MILLISECONDS);
                }
                OkHttpClient okHttpClientBuild = builderNewBuilder.build();
                Headers headersExtractHeaders = extractHeaders(readableArray, readableMap);
                if (headersExtractHeaders == null) {
                    osk.f(eventEmitter, i2, "Unrecognized headers format", null);
                    return;
                }
                String str4 = headersExtractHeaders.get(CONTENT_TYPE_HEADER_NAME);
                String str5 = headersExtractHeaders.get(CONTENT_ENCODING_HEADER_NAME);
                builderUrl.headers(headersExtractHeaders);
                if (readableMap == null) {
                    next = null;
                    break;
                }
                Iterator<g> it = this.mRequestBodyHandlers.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!next.a(readableMap));
                if (readableMap == null || str.toLowerCase().equals("get") || str.toLowerCase().equals("head")) {
                    requestBodyE = bnk.e(str);
                } else if (next != null) {
                    requestBodyE = next.b(readableMap, str4);
                } else if (readableMap.hasKey(REQUEST_BODY_KEY_STRING)) {
                    if (str4 == null) {
                        osk.f(eventEmitter, i2, "Payload is set but no content-type header specified", null);
                        return;
                    }
                    String string = readableMap.getString(REQUEST_BODY_KEY_STRING);
                    MediaType mediaType = MediaType.parse(str4);
                    if (bnk.g(str5)) {
                        requestBodyE = bnk.b(mediaType, string);
                        if (requestBodyE == null) {
                            osk.f(eventEmitter, i2, "Failed to gzip request body", null);
                            return;
                        }
                    } else {
                        requestBodyE = RequestBody.create(mediaType, string.getBytes(mediaType == null ? nbo.f27758a : mediaType.charset(nbo.f27758a)));
                    }
                } else if (readableMap.hasKey("base64")) {
                    if (str4 == null) {
                        osk.f(eventEmitter, i2, "Payload is set but no content-type header specified", null);
                        return;
                    }
                    requestBodyE = RequestBody.create(MediaType.parse(str4), ByteString.decodeBase64(readableMap.getString("base64")));
                } else if (readableMap.hasKey("uri")) {
                    if (str4 == null) {
                        osk.f(eventEmitter, i2, "Payload is set but no content-type header specified", null);
                        return;
                    }
                    String string2 = readableMap.getString("uri");
                    InputStream inputStreamF = bnk.f(getReactApplicationContext(), string2);
                    if (inputStreamF == null) {
                        osk.f(eventEmitter, i2, "Could not retrieve file for uri " + string2, null);
                        return;
                    }
                    requestBodyE = bnk.a(MediaType.parse(str4), inputStreamF);
                } else if (readableMap.hasKey(REQUEST_BODY_KEY_FORMDATA)) {
                    if (str4 == null) {
                        str4 = "multipart/form-data";
                    }
                    MultipartBody.Builder builderConstructMultipartBody = constructMultipartBody(readableMap.getArray(REQUEST_BODY_KEY_FORMDATA), str4, i2);
                    if (builderConstructMultipartBody == null) {
                        return;
                    } else {
                        requestBodyE = builderConstructMultipartBody.build();
                    }
                } else {
                    requestBodyE = bnk.e(str);
                }
                builderUrl.method(str, wrapRequestBodyWithProgressEmitter(requestBodyE, eventEmitter, i2));
                addRequest(i2);
                okHttpClientBuild.newCall(builderUrl.build()).enqueue(new b(i2, eventEmitter, str3, z));
            } catch (Exception e2) {
                osk.f(eventEmitter, i2, e2.getMessage(), null);
            }
        } catch (IOException e3) {
            osk.f(eventEmitter, i2, e3.getMessage(), e3);
        }
    }

    public void setNetRequestReporter(qjg qjgVar) {
        if (this.netRequestReporter == null) {
            this.netRequestReporter = qjgVar;
        }
    }

    public void setNetworkModuleProxy(f fVar) {
    }

    public NetworkingModule(ReactApplicationContext reactApplicationContext, String str, OkHttpClient okHttpClient) {
        this(reactApplicationContext, str, okHttpClient, null);
    }

    public NetworkingModule(ReactApplicationContext reactApplicationContext) {
        this(reactApplicationContext, null, f7h.b(reactApplicationContext), null);
    }

    public NetworkingModule(ReactApplicationContext reactApplicationContext, List<gkg> list) {
        this(reactApplicationContext, null, f7h.b(reactApplicationContext), list);
    }

    public NetworkingModule(ReactApplicationContext reactApplicationContext, String str) {
        this(reactApplicationContext, str, f7h.b(reactApplicationContext), null);
    }
}
