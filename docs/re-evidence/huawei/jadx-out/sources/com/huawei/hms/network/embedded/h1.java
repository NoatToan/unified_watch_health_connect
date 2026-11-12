package com.huawei.hms.network.embedded;

import com.huawei.hms.framework.common.CheckParamUtils;
import com.huawei.hms.framework.common.ExtLogger;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.network.Version;
import com.huawei.hms.network.api.advance.WrapperLogger;
import com.huawei.hms.network.httpclient.Callback;
import com.huawei.hms.network.httpclient.Interceptor;
import com.huawei.hms.network.httpclient.Request;
import com.huawei.hms.network.httpclient.RequestBody;
import com.huawei.hms.network.httpclient.RequestFinishedInfo;
import com.huawei.hms.network.httpclient.Response;
import com.huawei.hms.network.httpclient.ResponseBody;
import com.huawei.hms.network.httpclient.Submit;
import com.huawei.hms.network.httpclient.config.NetworkConfig;
import com.huawei.hms.network.httpclient.websocket.WebSocket;
import com.huawei.hms.network.httpclient.websocket.WebSocketListener;
import com.huawei.hms.network.inner.api.RequestContext;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.annotation.Nonnull;

/* JADX INFO: loaded from: classes.dex */
public class h1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f14840a = "SafeApi";

    /* JADX INFO: loaded from: classes34.dex */
    public static final class d extends Request {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Request f14844a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public e f14845b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public NetworkConfig f14846c;

        @Override // com.huawei.hms.network.httpclient.Request
        public Request.Builder newBuilder() {
            return this.f14844a.newBuilder();
        }

        @Override // com.huawei.hms.network.httpclient.Request
        public String getUrl() {
            return this.f14844a.getUrl();
        }

        @Override // com.huawei.hms.network.httpclient.Request
        public Object getTag() {
            return this.f14844a.getTag();
        }

        @Override // com.huawei.hms.network.httpclient.Request
        public String getOptions() {
            return this.f14844a.getOptions();
        }

        public NetworkConfig getNetConfig() {
            NetworkConfig networkConfig = this.f14846c;
            if (networkConfig != null) {
                return networkConfig;
            }
            NetworkConfig networkConfig2 = new NetworkConfig(getOptions());
            this.f14846c = networkConfig2;
            return networkConfig2;
        }

        @Override // com.huawei.hms.network.httpclient.Request
        public String getMethod() {
            return this.f14844a.getMethod();
        }

        @Override // com.huawei.hms.network.httpclient.Request
        public Map<String, List<String>> getHeaders() {
            return this.f14844a.getHeaders();
        }

        @Override // com.huawei.hms.network.httpclient.Request
        public e getBody() {
            e eVar = this.f14845b;
            if (eVar != null) {
                return eVar;
            }
            RequestBody body = this.f14844a.getBody();
            if (body == null || (body instanceof e)) {
                this.f14845b = (e) body;
            } else {
                this.f14845b = new e(body);
            }
            return this.f14845b;
        }

        public d(Request request) {
            CheckParamUtils.checkNotNull(request, "SafeRequest request == null");
            this.f14844a = request;
        }
    }

    /* JADX INFO: loaded from: classes34.dex */
    public static final class h<T> extends Submit<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Submit<T> f14850a;

        @Override // com.huawei.hms.network.httpclient.Submit
        public Request request() throws IOException {
            return this.f14850a.request();
        }

        @Override // com.huawei.hms.network.httpclient.Submit
        public boolean isExecuted() {
            return this.f14850a.isExecuted();
        }

        @Override // com.huawei.hms.network.httpclient.Submit
        public boolean isCanceled() {
            return this.f14850a.isCanceled();
        }

        @Override // com.huawei.hms.network.httpclient.Submit
        public RequestFinishedInfo getRequestFinishedInfo() {
            return this.f14850a.getRequestFinishedInfo();
        }

        @Override // com.huawei.hms.network.httpclient.Submit
        public Response<T> execute() throws IOException {
            return this.f14850a.execute();
        }

        @Override // com.huawei.hms.network.httpclient.Submit
        public void enqueue(Callback<T> callback) {
            this.f14850a.enqueue(callback);
        }

        @Override // com.huawei.hms.network.httpclient.Submit
        /* JADX INFO: renamed from: clone */
        public Submit<T> mo1386clone() {
            return this.f14850a.mo1386clone();
        }

        @Override // com.huawei.hms.network.httpclient.Submit
        public void cancel() {
            this.f14850a.cancel();
        }

        public h(Submit<T> submit) {
            CheckParamUtils.checkNotNull(submit, "SafeSubmit<T> submit == null");
            this.f14850a = submit;
        }
    }

    public static final class i extends WebSocket {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WebSocket f14851a;

        @Override // com.huawei.hms.network.httpclient.websocket.WebSocket
        public boolean send(byte[] bArr) {
            return this.f14851a.send(bArr);
        }

        @Override // com.huawei.hms.network.httpclient.websocket.WebSocket
        public boolean send(String str) {
            return this.f14851a.send(str);
        }

        @Override // com.huawei.hms.network.httpclient.websocket.WebSocket
        public void resetPingInterval(long j) {
            this.f14851a.resetPingInterval(j);
        }

        @Override // com.huawei.hms.network.httpclient.websocket.WebSocket
        public Request request() {
            return this.f14851a.request();
        }

        @Override // com.huawei.hms.network.httpclient.websocket.WebSocket
        public long queueSize() {
            return this.f14851a.queueSize();
        }

        public WebSocket getWebSocket() {
            return this.f14851a;
        }

        @Override // com.huawei.hms.network.httpclient.websocket.WebSocket
        public boolean enableDynamicPing(int i) {
            return this.f14851a.enableDynamicPing(i);
        }

        @Override // com.huawei.hms.network.httpclient.websocket.WebSocket
        public boolean close(int i, @Nonnull String str) {
            return this.f14851a.close(i, str);
        }

        @Override // com.huawei.hms.network.httpclient.websocket.WebSocket
        public void cancel() {
            this.f14851a.cancel();
        }

        public i(WebSocket webSocket) {
            CheckParamUtils.checkNotNull(webSocket, "SafeWebSocket webSocket == null");
            this.f14851a = webSocket;
        }
    }

    /* JADX INFO: loaded from: classes34.dex */
    public static final class b extends Interceptor.Chain {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Interceptor.Chain f14842a;

        @Override // com.huawei.hms.network.httpclient.Interceptor.Chain
        public RequestFinishedInfo requestFinishedInfo() {
            d1 requestTask;
            if (!h1.apiAvailable(5) || (requestTask = ((b1) this.f14842a).getRequestTask()) == null) {
                return null;
            }
            return requestTask.getRequestFinishedInfo();
        }

        @Override // com.huawei.hms.network.httpclient.Interceptor.Chain
        public d request() {
            return (d) this.f14842a.request();
        }

        public Response<ResponseBody> proceed(RequestContext requestContext, d1 d1Var) throws IOException {
            return ((b1) this.f14842a).a(requestContext, d1Var);
        }

        @Override // com.huawei.hms.network.httpclient.Interceptor.Chain
        public Response<ResponseBody> proceed(Request request) throws IOException {
            return this.f14842a.proceed(request);
        }

        public d1 getRequestTask() {
            return ((b1) this.f14842a).getRequestTask();
        }

        public a1 getRealHttpclient() {
            return (a1) ((b1) this.f14842a).getClient();
        }

        public z2 getRCEventListener() {
            return ((b1) this.f14842a).getRCEventListener();
        }

        public b(Interceptor.Chain chain) {
            CheckParamUtils.checkNotNull(chain, "SafeChain chain == null");
            this.f14842a = chain;
        }
    }

    /* JADX INFO: loaded from: classes34.dex */
    public static final class f<T> extends Response<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Response<T> f14848a;

        @Override // com.huawei.hms.network.httpclient.Response
        public String getUrl() {
            return this.f14848a.getUrl();
        }

        @Override // com.huawei.hms.network.httpclient.Response
        public String getMessage() {
            return this.f14848a.getMessage();
        }

        @Override // com.huawei.hms.network.httpclient.Response
        public Map<String, List<String>> getHeaders() {
            return this.f14848a.getHeaders();
        }

        @Override // com.huawei.hms.network.httpclient.Response
        public ResponseBody getErrorBody() {
            return this.f14848a.getErrorBody();
        }

        @Override // com.huawei.hms.network.httpclient.Response
        public int getCode() {
            return this.f14848a.getCode();
        }

        @Override // com.huawei.hms.network.httpclient.Response
        public T getBody() {
            return this.f14848a.getBody();
        }

        @Override // com.huawei.hms.network.httpclient.Response
        public Response.Builder createBuilder() {
            return this.f14848a.createBuilder();
        }

        @Override // com.huawei.hms.network.httpclient.Response, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.f14848a.close();
        }

        public f(Response<T> response) {
            CheckParamUtils.checkNotNull(response, "SafeResponse<T> response == null");
            this.f14848a = response;
        }
    }

    /* JADX INFO: loaded from: classes34.dex */
    public static final class e extends RequestBody {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final RequestBody f14847a;

        @Override // com.huawei.hms.network.httpclient.RequestBody
        public void writeTo(OutputStream outputStream) throws IOException {
            this.f14847a.writeTo(outputStream);
        }

        @Override // com.huawei.hms.network.httpclient.RequestBody
        public boolean isDuplex() {
            if (h1.apiAvailable(5)) {
                return this.f14847a.isDuplex();
            }
            return false;
        }

        public int hashCode() {
            return this.f14847a.hashCode();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || e.class != obj.getClass()) {
                return false;
            }
            return this.f14847a.equals(((e) obj).f14847a);
        }

        @Override // com.huawei.hms.network.httpclient.RequestBody
        public boolean endOfStream() {
            return this.f14847a.endOfStream();
        }

        @Override // com.huawei.hms.network.httpclient.RequestBody
        public String contentType() {
            return this.f14847a.contentType();
        }

        @Override // com.huawei.hms.network.httpclient.RequestBody
        public long contentLength() throws IOException {
            return this.f14847a.contentLength();
        }

        public e(RequestBody requestBody) {
            CheckParamUtils.checkNotNull(requestBody, "SafeRequestBody requestBody == null");
            this.f14847a = requestBody;
        }
    }

    /* JADX INFO: loaded from: classes34.dex */
    public static class k extends ExtLogger {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WrapperLogger f14853a;

        @Override // com.huawei.hms.framework.common.ExtLogger
        public void w(String str, String str2, Throwable th) {
            this.f14853a.w(str, str2, th);
        }

        @Override // com.huawei.hms.framework.common.ExtLogger
        public void w(String str, String str2) {
            this.f14853a.w(str, str2);
        }

        @Override // com.huawei.hms.framework.common.ExtLogger
        public void v(String str, String str2) {
            this.f14853a.v(str, str2);
        }

        @Override // com.huawei.hms.framework.common.ExtLogger
        public void i(String str, String str2) {
            this.f14853a.i(str, str2);
        }

        @Override // com.huawei.hms.framework.common.ExtLogger
        public void e(String str, String str2, Throwable th) {
            this.f14853a.e(str, str2, th);
        }

        @Override // com.huawei.hms.framework.common.ExtLogger
        public void e(String str, String str2) {
            this.f14853a.e(str, str2);
        }

        @Override // com.huawei.hms.framework.common.ExtLogger
        public void d(String str, String str2) {
            this.f14853a.d(str, str2);
        }

        public k(WrapperLogger wrapperLogger) {
            CheckParamUtils.checkNotNull(wrapperLogger, "SafeWrapperLogger wrapperLogger == null");
            this.f14853a = wrapperLogger;
        }
    }

    /* JADX INFO: loaded from: classes34.dex */
    public static class j extends WebSocketListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WebSocketListener f14852a;

        @Override // com.huawei.hms.network.httpclient.websocket.WebSocketListener
        public void onOpen(WebSocket webSocket, Response<ResponseBody> response) {
            this.f14852a.onOpen(webSocket, response);
        }

        @Override // com.huawei.hms.network.httpclient.websocket.WebSocketListener
        public void onMessage(WebSocket webSocket, byte[] bArr) {
            this.f14852a.onMessage(webSocket, bArr);
        }

        @Override // com.huawei.hms.network.httpclient.websocket.WebSocketListener
        public void onMessage(WebSocket webSocket, String str) {
            this.f14852a.onMessage(webSocket, str);
        }

        @Override // com.huawei.hms.network.httpclient.websocket.WebSocketListener
        public void onFailure(WebSocket webSocket, Throwable th, Response<ResponseBody> response) {
            this.f14852a.onFailure(webSocket, th, response);
        }

        @Override // com.huawei.hms.network.httpclient.websocket.WebSocketListener
        public void onClosing(WebSocket webSocket, int i, String str) {
            this.f14852a.onClosing(webSocket, i, str);
        }

        @Override // com.huawei.hms.network.httpclient.websocket.WebSocketListener
        public void onClosed(WebSocket webSocket, int i, String str) {
            this.f14852a.onClosed(webSocket, i, str);
        }

        public j(WebSocketListener webSocketListener) {
            CheckParamUtils.checkNotNull(webSocketListener, "SafeWebSocketListener listener == null");
            this.f14852a = webSocketListener;
        }
    }

    /* JADX INFO: loaded from: classes34.dex */
    public static final class g extends ResponseBody {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ResponseBody f14849a;

        @Override // com.huawei.hms.network.httpclient.ResponseBody
        public InputStream getInputStream() {
            return this.f14849a.getInputStream();
        }

        @Override // com.huawei.hms.network.httpclient.ResponseBody
        public String getContentType() {
            return this.f14849a.getContentType();
        }

        @Override // com.huawei.hms.network.httpclient.ResponseBody
        public long getContentLength() {
            return this.f14849a.getContentLength();
        }

        @Override // com.huawei.hms.network.httpclient.ResponseBody, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.f14849a.close();
        }

        public g(ResponseBody responseBody) {
            CheckParamUtils.checkNotNull(responseBody, "SafeResponseBody responseBody == null");
            this.f14849a = responseBody;
        }
    }

    /* JADX INFO: loaded from: classes34.dex */
    public static final class a<T> extends Callback<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Callback<T> f14841a;

        @Override // com.huawei.hms.network.httpclient.Callback
        public void onResponse(Submit<T> submit, Response<T> response) throws IOException {
            this.f14841a.onResponse(submit, response);
        }

        @Override // com.huawei.hms.network.httpclient.Callback
        public void onFailure(Submit<T> submit, Throwable th) {
            this.f14841a.onFailure(submit, th);
        }

        public a(Callback<T> callback) {
            CheckParamUtils.checkNotNull(callback, "SafeCallback<T> callback == null");
            this.f14841a = callback;
        }
    }

    /* JADX INFO: loaded from: classes34.dex */
    public static final class c extends Interceptor {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Interceptor f14843a;

        public String toString() {
            return "SafeInterceptor{interceptor=" + this.f14843a.getClass().getName() + '}';
        }

        @Override // com.huawei.hms.network.httpclient.Interceptor
        public Response<ResponseBody> intercept(Interceptor.Chain chain) throws IOException {
            return this.f14843a.intercept(chain);
        }

        public c(Interceptor interceptor) {
            CheckParamUtils.checkNotNull(interceptor, "SafeInterceptor interceptor == null");
            this.f14843a = interceptor;
        }
    }

    public static boolean apiAvailable(int i2) {
        Logger.v(f14840a, "Version.getApi = " + Version.getApi());
        return i2 <= Version.getApi();
    }
}
