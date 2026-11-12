package com.mapbox.common.module.okhttp;

import ch.qos.logback.core.CoreConstants;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.mapbox.common.HttpRequestError;
import com.mapbox.common.HttpRequestErrorType;
import com.mapbox.common.MapboxCommonLogger;
import com.mapbox.common.ResponseReadStream;
import com.mapbox.common.ResultCallback;
import com.mapbox.common.experimental.wss_backend.RequestObserver;
import com.mapbox.common.experimental.wss_backend.ResponseData;
import com.mapbox.common.experimental.wss_backend.WsOpCode;
import com.nimbusds.jose.jwk.JWKParameterNames;
import d53.c;
import java.util.HashMap;
import java.util.Locale;
import okhttp3.Headers;
import okhttp3.Response;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import w63.e;
import w63.h;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u0000 ;2\u00020\u0001:\u0001;B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ3\u0010\u000f\u001a\u001e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\fj\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r`\u000e2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0018\u0010\u001bJ)\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u001c2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ'\u0010#\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\rH\u0016¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010'R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010(R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010)R\"\u0010\u0012\u001a\u00020\u00118\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0012\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u0017\u00100\u001a\u00020/8\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\"\u00105\u001a\u0002048\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:¨\u0006<"}, d2 = {"Lcom/mapbox/common/module/okhttp/WebsocketObserverWrapper;", "Lokhttp3/WebSocketListener;", "Lcom/mapbox/common/experimental/wss_backend/RequestObserver;", "requestObserver", "", TtmlNode.ATTR_ID, "", "verbose", "<init>", "(Lcom/mapbox/common/experimental/wss_backend/RequestObserver;JZ)V", "Lokhttp3/Response;", "response", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "generateOutputHeaders", "(Lokhttp3/Response;)Ljava/util/HashMap;", "Lokhttp3/WebSocket;", "webSocket", "", "onOpen", "(Lokhttp3/WebSocket;Lokhttp3/Response;)V", "Lw63/h;", "bytes", "onMessage", "(Lokhttp3/WebSocket;Lw63/h;)V", "text", "(Lokhttp3/WebSocket;Ljava/lang/String;)V", "", JWKParameterNames.RSA_OTHER_PRIMES__FACTOR_CRT_COEFFICIENT, "onFailure", "(Lokhttp3/WebSocket;Ljava/lang/Throwable;Lokhttp3/Response;)V", "", "code", "reason", "onClosed", "(Lokhttp3/WebSocket;ILjava/lang/String;)V", "Lcom/mapbox/common/experimental/wss_backend/RequestObserver;", "getRequestObserver", "()Lcom/mapbox/common/experimental/wss_backend/RequestObserver;", "J", "Z", "Lokhttp3/WebSocket;", "getWebSocket", "()Lokhttp3/WebSocket;", "setWebSocket", "(Lokhttp3/WebSocket;)V", "Lw63/e;", "buffer", "Lw63/e;", "getBuffer", "()Lw63/e;", "Lcom/mapbox/common/ResultCallback;", "onClosedCallback", "Lcom/mapbox/common/ResultCallback;", "getOnClosedCallback", "()Lcom/mapbox/common/ResultCallback;", "setOnClosedCallback", "(Lcom/mapbox/common/ResultCallback;)V", "Companion", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
final class WebsocketObserverWrapper extends WebSocketListener {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final int websocketClosedNormalCode = 1000;
    private final e buffer;
    private final long id;
    public ResultCallback onClosedCallback;
    private final RequestObserver requestObserver;
    private final boolean verbose;
    public WebSocket webSocket;

    public WebsocketObserverWrapper(RequestObserver requestObserver, long j8, boolean z14) {
        requestObserver.getClass();
        this.requestObserver = requestObserver;
        this.id = j8;
        this.verbose = z14;
        this.buffer = new e();
    }

    private final HashMap<String, String> generateOutputHeaders(Response response) {
        HashMap<String, String> map = new HashMap<>();
        Headers headers = response.headers();
        int size = headers.size();
        for (int i14 = 0; i14 < size; i14++) {
            String lowerCase = headers.name(i14).toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            map.put(lowerCase, headers.value(i14));
        }
        return map;
    }

    public final e getBuffer() {
        return this.buffer;
    }

    public final ResultCallback getOnClosedCallback() {
        ResultCallback resultCallback = this.onClosedCallback;
        if (resultCallback != null) {
            return resultCallback;
        }
        s.m("onClosedCallback");
        throw null;
    }

    public final RequestObserver getRequestObserver() {
        return this.requestObserver;
    }

    public final WebSocket getWebSocket() {
        WebSocket webSocket = this.webSocket;
        if (webSocket != null) {
            return webSocket;
        }
        s.m("webSocket");
        throw null;
    }

    @Override // okhttp3.WebSocketListener
    public void onClosed(WebSocket webSocket, int code, String reason) {
        webSocket.getClass();
        reason.getClass();
        try {
            if (this.verbose) {
                MapboxCommonLogger.INSTANCE.logD$common_release(WssBackend.TAG, "Websocket onClosed code: " + code + ", reason: " + reason);
            }
            if (this.onClosedCallback != null) {
                if (code == websocketClosedNormalCode) {
                    getOnClosedCallback().run(true);
                    return;
                } else {
                    getOnClosedCallback().run(false);
                    return;
                }
            }
            this.requestObserver.onFailed(this.id, new HttpRequestError(HttpRequestErrorType.OTHER_ERROR, "Unexpected socket closure: " + code + ' ' + reason), null);
        } catch (Throwable unused) {
            if (this.verbose) {
                MapboxCommonLogger.INSTANCE.logD$common_release(WssBackend.TAG, "Websocket onClosed exception, probably callback is null or crashed");
            }
        }
    }

    @Override // okhttp3.WebSocketListener
    public void onFailure(WebSocket webSocket, Throwable t7, Response response) {
        String message;
        webSocket.getClass();
        t7.getClass();
        if (this.verbose) {
            MapboxCommonLogger.INSTANCE.logD$common_release(WssBackend.TAG, "Websocket onFailure: " + response + ", " + t7);
        }
        HttpRequestErrorType httpRequestErrorType = HttpRequestErrorType.OTHER_ERROR;
        if ((response == null || (message = response.message()) == null) && (message = t7.getMessage()) == null) {
            message = "Unknown error";
        }
        this.requestObserver.onFailed(this.id, new HttpRequestError(httpRequestErrorType, message), response != null ? Integer.valueOf(response.code()) : null);
    }

    @Override // okhttp3.WebSocketListener
    public void onMessage(WebSocket webSocket, String text) {
        webSocket.getClass();
        text.getClass();
        if (this.verbose) {
            MapboxCommonLogger.INSTANCE.logD$common_release(WssBackend.TAG, "Websocket onMessage (text): ".concat(text));
        }
        e eVar = this.buffer;
        byte[] bytes = text.getBytes(c.f57666b);
        bytes.getClass();
        eVar.getClass();
        eVar.write(bytes, 0, bytes.length);
        this.requestObserver.onData(this.id, WsOpCode.TEXT, true);
    }

    @Override // okhttp3.WebSocketListener
    public void onOpen(WebSocket webSocket, Response response) {
        webSocket.getClass();
        response.getClass();
        if (response.code() == 101) {
            if (this.verbose) {
                MapboxCommonLogger.INSTANCE.logD$common_release(WssBackend.TAG, "Websocket opened with code 101, switching protocols");
            }
            this.requestObserver.onSwitchingProtocols(this.id);
        }
        ResponseData responseData = new ResponseData(generateOutputHeaders(response), response.code(), new ResponseReadStream(this.buffer));
        if (this.verbose) {
            MapboxCommonLogger.INSTANCE.logD$common_release(WssBackend.TAG, "Calling onResponse with code " + response.code() + CoreConstants.CURLY_RIGHT);
        }
        this.requestObserver.onResponse(this.id, responseData);
    }

    public final void setOnClosedCallback(ResultCallback resultCallback) {
        resultCallback.getClass();
        this.onClosedCallback = resultCallback;
    }

    public final void setWebSocket(WebSocket webSocket) {
        webSocket.getClass();
        this.webSocket = webSocket;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/mapbox/common/module/okhttp/WebsocketObserverWrapper$Companion;", "", "()V", "websocketClosedNormalCode", "", "getWebsocketClosedNormalCode", "()I", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(j jVar) {
            this();
        }

        public final int getWebsocketClosedNormalCode() {
            return WebsocketObserverWrapper.websocketClosedNormalCode;
        }

        private Companion() {
        }
    }

    public /* synthetic */ WebsocketObserverWrapper(RequestObserver requestObserver, long j8, boolean z14, int i14, j jVar) {
        this(requestObserver, j8, (i14 & 4) != 0 ? false : z14);
    }

    @Override // okhttp3.WebSocketListener
    public void onMessage(WebSocket webSocket, h bytes) {
        webSocket.getClass();
        bytes.getClass();
        if (this.verbose) {
            MapboxCommonLogger.INSTANCE.logD$common_release(WssBackend.TAG, "Websocket onMessage (binary): " + bytes);
        }
        this.buffer.E(bytes);
        this.requestObserver.onData(this.id, WsOpCode.BINARY, true);
    }
}
