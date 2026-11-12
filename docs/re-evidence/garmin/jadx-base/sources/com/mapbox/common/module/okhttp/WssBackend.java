package com.mapbox.common.module.okhttp;

import androidx.room.a0;
import ch.qos.logback.core.spi.AbstractComponentTracker;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.mapbox.bindgen.Value;
import com.mapbox.common.HttpRequestError;
import com.mapbox.common.HttpRequestErrorType;
import com.mapbox.common.MapboxCommonLogger;
import com.mapbox.common.ResultCallback;
import com.mapbox.common.SettingsService;
import com.mapbox.common.SettingsServiceFactory;
import com.mapbox.common.SettingsServiceStorageType;
import com.mapbox.common.experimental.wss_backend.Data;
import com.mapbox.common.experimental.wss_backend.Request;
import com.mapbox.common.experimental.wss_backend.RequestObserver;
import com.mapbox.common.experimental.wss_backend.Service;
import com.mapbox.common.module.NetworkIdGenerator;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import okhttp3.OkHttpClient;
import okhttp3.WebSocket;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import w63.h;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0018\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0010\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u0004H\u0007J\u0010\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u0004H\u0016J\u0018\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u001eH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n \b*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/mapbox/common/module/okhttp/WssBackend;", "Lcom/mapbox/common/experimental/wss_backend/Service;", "()V", "connectTimeoutMs", "", "pingTimeoutMs", "settings", "Lcom/mapbox/common/SettingsService;", "kotlin.jvm.PlatformType", "socketMap", "", "Lcom/mapbox/common/module/okhttp/WebsocketObserverWrapper;", "wssClient", "Lokhttp3/OkHttpClient;", "cancelConnection", "", TtmlNode.ATTR_ID, "callback", "Lcom/mapbox/common/ResultCallback;", "connect", "request", "Lcom/mapbox/common/experimental/wss_backend/Request;", "observer", "Lcom/mapbox/common/experimental/wss_backend/RequestObserver;", "setConnectionTimeout", "connectTimeout", "setPingTimeout", "pingTimeout", "write", "data", "Lcom/mapbox/common/experimental/wss_backend/Data;", "Companion", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class WssBackend implements Service {
    public static final String TAG = "WssBackend";
    public static final String verboseSettingName = "com.mapbox.common.network.wss.enable_android_verbose_logging";
    private final SettingsService settings;
    private Map<Long, WebsocketObserverWrapper> socketMap;
    private OkHttpClient wssClient;
    private long pingTimeoutMs = 20000;
    private long connectTimeoutMs = AbstractComponentTracker.LINGERING_TIMEOUT;

    public WssBackend() {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.wssClient = builder.connectTimeout(10L, timeUnit).pingInterval(20L, timeUnit).build();
        this.socketMap = new LinkedHashMap();
        this.settings = SettingsServiceFactory.getInstance(SettingsServiceStorageType.NON_PERSISTENT);
    }

    @Override // com.mapbox.common.experimental.wss_backend.Service
    public void cancelConnection(long id3, ResultCallback callback) {
        callback.getClass();
        boolean zG = s.g(this.settings.get(verboseSettingName, new Value(false)).getValue(), new Value(true));
        if (zG) {
            MapboxCommonLogger.INSTANCE.logD$common_release(TAG, "Cancel for id " + id3);
        }
        if (!this.socketMap.containsKey(Long.valueOf(id3))) {
            if (zG) {
                MapboxCommonLogger.INSTANCE.logD$common_release(TAG, a0.f(id3, "Cancel for id ", ": connection does not exist"));
            }
            try {
                callback.run(false);
                return;
            } catch (Throwable unused) {
                if (zG) {
                    MapboxCommonLogger.INSTANCE.logD$common_release(TAG, a0.f(id3, "Cancel for id ", ": connection does not exist, callback crashed or null"));
                    return;
                }
                return;
            }
        }
        if (zG) {
            MapboxCommonLogger.INSTANCE.logD$common_release(TAG, a0.f(id3, "Cancel for id ", ": connection exists, closing and removing from socket map"));
        }
        WebsocketObserverWrapper websocketObserverWrapper = this.socketMap.get(Long.valueOf(id3));
        websocketObserverWrapper.getClass();
        websocketObserverWrapper.setOnClosedCallback(callback);
        WebsocketObserverWrapper websocketObserverWrapper2 = this.socketMap.get(Long.valueOf(id3));
        websocketObserverWrapper2.getClass();
        websocketObserverWrapper2.getWebSocket().close(WebsocketObserverWrapper.INSTANCE.getWebsocketClosedNormalCode(), "Closed by client");
        this.socketMap.remove(Long.valueOf(id3));
    }

    @Override // com.mapbox.common.experimental.wss_backend.Service
    public long connect(Request request, RequestObserver observer) {
        request.getClass();
        observer.getClass();
        long jNewId = NetworkIdGenerator.INSTANCE.newId();
        okhttp3.Request.Builder builder = new okhttp3.Request.Builder().get();
        String url = request.getUrl();
        url.getClass();
        okhttp3.Request.Builder builderUrl = builder.url(url);
        HashMap<String, String> headers = request.getHeaders();
        headers.getClass();
        for (Map.Entry<String, String> entry : headers.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            key.getClass();
            value.getClass();
            builderUrl.addHeader(key, value);
        }
        boolean zG = s.g(this.settings.get(verboseSettingName, new Value(false)).getValue(), new Value(true));
        WebsocketObserverWrapper websocketObserverWrapper = new WebsocketObserverWrapper(observer, jNewId, zG);
        okhttp3.Request requestBuild = builderUrl.build();
        websocketObserverWrapper.setWebSocket(this.wssClient.newWebSocket(requestBuild, websocketObserverWrapper));
        this.socketMap.put(Long.valueOf(jNewId), websocketObserverWrapper);
        if (zG) {
            MapboxCommonLogger.INSTANCE.logD$common_release(TAG, "Connecting, id " + jNewId + ", request " + requestBuild);
        }
        return jNewId;
    }

    public final void setConnectionTimeout(long connectTimeout) {
        this.connectTimeoutMs = connectTimeout;
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        long j8 = this.connectTimeoutMs;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.wssClient = builder.connectTimeout(j8, timeUnit).pingInterval(this.pingTimeoutMs, timeUnit).build();
    }

    @Override // com.mapbox.common.experimental.wss_backend.Service
    public void setPingTimeout(long pingTimeout) {
        this.pingTimeoutMs = pingTimeout;
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        long j8 = this.connectTimeoutMs;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.wssClient = builder.connectTimeout(j8, timeUnit).pingInterval(this.pingTimeoutMs, timeUnit).build();
    }

    @Override // com.mapbox.common.experimental.wss_backend.Service
    public void write(long id3, Data data) {
        WebSocket webSocket;
        RequestObserver requestObserver;
        WebSocket webSocket2;
        data.getClass();
        boolean zSend = false;
        boolean zG = s.g(this.settings.get(verboseSettingName, new Value(false)).getValue(), new Value(true));
        if (zG) {
            MapboxCommonLogger.INSTANCE.logD$common_release(TAG, "Write for id " + id3);
        }
        boolean zIsByteArray = data.isByteArray();
        Map<Long, WebsocketObserverWrapper> map = this.socketMap;
        if (zIsByteArray) {
            WebsocketObserverWrapper websocketObserverWrapper = map.get(Long.valueOf(id3));
            if (websocketObserverWrapper != null && (webSocket2 = websocketObserverWrapper.getWebSocket()) != null) {
                h.a aVar = h.f183361d;
                ByteBuffer byteBufferWrap = ByteBuffer.wrap(data.getByteArray());
                byteBufferWrap.getClass();
                aVar.getClass();
                byte[] bArr = new byte[byteBufferWrap.remaining()];
                byteBufferWrap.get(bArr);
                zSend = webSocket2.send(new h(bArr));
            }
        } else {
            WebsocketObserverWrapper websocketObserverWrapper2 = map.get(Long.valueOf(id3));
            if (websocketObserverWrapper2 != null && (webSocket = websocketObserverWrapper2.getWebSocket()) != null) {
                String string = data.getString();
                string.getClass();
                zSend = webSocket.send(string);
            }
        }
        if (zSend) {
            return;
        }
        if (zG) {
            MapboxCommonLogger.INSTANCE.logD$common_release(TAG, a0.f(id3, "Write for id ", " failed"));
        }
        HttpRequestError httpRequestError = new HttpRequestError(HttpRequestErrorType.OTHER_ERROR, "Message would overflow buffer or shutdown in progress");
        WebsocketObserverWrapper websocketObserverWrapper3 = this.socketMap.get(Long.valueOf(id3));
        if (websocketObserverWrapper3 == null || (requestObserver = websocketObserverWrapper3.getRequestObserver()) == null) {
            return;
        }
        requestObserver.onFailed(id3, httpRequestError, null);
    }
}
