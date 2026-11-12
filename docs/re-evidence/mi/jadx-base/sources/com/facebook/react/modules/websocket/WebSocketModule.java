package com.facebook.react.modules.websocket;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.miui.tsmclient.common.net.NetConstants;
import com.miui.tsmclient.util.Constants;
import defpackage.cm8;
import defpackage.l1a;
import defpackage.ndj;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;
import okio.ByteString;

/* JADX INFO: loaded from: classes4.dex */
@ndj(hasConstants = false, name = WebSocketModule.NAME)
public final class WebSocketModule extends ReactContextBaseJavaModule {
    public static final String NAME = "WebSocketModule";
    private final Map<Integer, b> mContentHandlers;
    private l1a mCookieHandler;
    private ReactContext mReactContext;
    private final Map<Integer, WebSocket> mWebSocketConnections;

    public interface b {
        void a(String str, WritableMap writableMap);

        void b(ByteString byteString, WritableMap writableMap);
    }

    public WebSocketModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.mWebSocketConnections = new ConcurrentHashMap();
        this.mContentHandlers = new ConcurrentHashMap();
        this.mReactContext = reactApplicationContext;
        this.mCookieHandler = new l1a(reactApplicationContext);
    }

    private String getCookie(String str) {
        try {
            List<String> list = this.mCookieHandler.get(new URI(getDefaultOrigin(str)), new HashMap()).get(NetConstants.COOKIE);
            if (list != null && !list.isEmpty()) {
                return list.get(0);
            }
            return null;
        } catch (IOException | URISyntaxException unused) {
            throw new IllegalArgumentException("Unable to get cookie from " + str);
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0050  */
    private static String getDefaultOrigin(String str) {
        byte b2;
        try {
            String str2 = "";
            URI uri = new URI(str);
            String scheme = uri.getScheme();
            int iHashCode = scheme.hashCode();
            if (iHashCode != 3804) {
                if (iHashCode != 118039) {
                    if (iHashCode != 3213448) {
                        if (iHashCode == 99617003 && scheme.equals(Constants.URI_SCHEME)) {
                            b2 = 3;
                        } else {
                            b2 = -1;
                        }
                    } else if (scheme.equals("http")) {
                        b2 = 2;
                    } else {
                        b2 = -1;
                    }
                } else if (scheme.equals("wss")) {
                    b2 = 0;
                } else {
                    b2 = -1;
                }
            } else if (scheme.equals("ws")) {
                b2 = 1;
            } else {
                b2 = -1;
            }
            if (b2 == 0) {
                str2 = "" + Constants.URI_SCHEME;
            } else if (b2 == 1) {
                str2 = "http";
            } else if (b2 == 2 || b2 == 3) {
                str2 = "" + uri.getScheme();
            }
            return uri.getPort() != -1 ? String.format("%s://%s:%s", str2, uri.getHost(), Integer.valueOf(uri.getPort())) : String.format("%s://%s", str2, uri.getHost());
        } catch (URISyntaxException unused) {
            throw new IllegalArgumentException("Unable to set " + str + " as default origin header");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyWebSocketFailed(int i, String str) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putInt("id", i);
        writableMapCreateMap.putString("message", str);
        sendEvent("websocketFailed", writableMapCreateMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendEvent(String str, WritableMap writableMap) {
        ((DeviceEventManagerModule.RCTDeviceEventEmitter) this.mReactContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(str, writableMap);
    }

    @ReactMethod
    public void close(int i, String str, int i2) {
        WebSocket webSocket = this.mWebSocketConnections.get(Integer.valueOf(i2));
        if (webSocket == null) {
            return;
        }
        try {
            webSocket.close(i, str);
            this.mWebSocketConnections.remove(Integer.valueOf(i2));
            this.mContentHandlers.remove(Integer.valueOf(i2));
        } catch (Exception e) {
            cm8.j("ReactNative", "Could not close WebSocket connection for id " + i2, e);
        }
    }

    @ReactMethod
    public void connect(String str, ReadableArray readableArray, ReadableMap readableMap, int i) {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        OkHttpClient okHttpClientBuild = builder.connectTimeout(10L, timeUnit).writeTimeout(10L, timeUnit).readTimeout(0L, TimeUnit.MINUTES).build();
        Request.Builder builderUrl = new Request.Builder().tag(Integer.valueOf(i)).url(str);
        String cookie = getCookie(str);
        if (cookie != null) {
            builderUrl.addHeader(NetConstants.COOKIE, cookie);
        }
        if (readableMap != null && readableMap.hasKey("headers") && readableMap.getType("headers").equals(ReadableType.Map)) {
            ReadableMap map = readableMap.getMap("headers");
            ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator = map.keySetIterator();
            if (!map.hasKey("origin")) {
                builderUrl.addHeader("origin", getDefaultOrigin(str));
            }
            while (readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
                String strNextKey = readableMapKeySetIteratorKeySetIterator.nextKey();
                if (ReadableType.String.equals(map.getType(strNextKey))) {
                    builderUrl.addHeader(strNextKey, map.getString(strNextKey));
                } else {
                    cm8.C("ReactNative", "Ignoring: requested " + strNextKey + ", value not a string");
                }
            }
        } else {
            builderUrl.addHeader("origin", getDefaultOrigin(str));
        }
        if (readableArray != null && readableArray.size() > 0) {
            StringBuilder sb = new StringBuilder("");
            for (int i2 = 0; i2 < readableArray.size(); i2++) {
                String strTrim = readableArray.getString(i2).trim();
                if (!strTrim.isEmpty() && !strTrim.contains(",")) {
                    sb.append(strTrim);
                    sb.append(",");
                }
            }
            if (sb.length() > 0) {
                sb.replace(sb.length() - 1, sb.length(), "");
                builderUrl.addHeader("Sec-WebSocket-Protocol", sb.toString());
            }
        }
        okHttpClientBuild.newWebSocket(builderUrl.build(), new a(i));
        okHttpClientBuild.dispatcher().executorService().shutdown();
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @ReactMethod
    public void ping(int i) {
        WebSocket webSocket = this.mWebSocketConnections.get(Integer.valueOf(i));
        if (webSocket != null) {
            try {
                webSocket.send(ByteString.EMPTY);
                return;
            } catch (Exception e) {
                notifyWebSocketFailed(i, e.getMessage());
                return;
            }
        }
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putInt("id", i);
        writableMapCreateMap.putString("message", "client is null");
        sendEvent("websocketFailed", writableMapCreateMap);
        WritableMap writableMapCreateMap2 = Arguments.createMap();
        writableMapCreateMap2.putInt("id", i);
        writableMapCreateMap2.putInt("code", 0);
        writableMapCreateMap2.putString("reason", "client is null");
        sendEvent("websocketClosed", writableMapCreateMap2);
        this.mWebSocketConnections.remove(Integer.valueOf(i));
        this.mContentHandlers.remove(Integer.valueOf(i));
    }

    @ReactMethod
    public void send(String str, int i) {
        WebSocket webSocket = this.mWebSocketConnections.get(Integer.valueOf(i));
        if (webSocket != null) {
            try {
                webSocket.send(str);
                return;
            } catch (Exception e) {
                notifyWebSocketFailed(i, e.getMessage());
                return;
            }
        }
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putInt("id", i);
        writableMapCreateMap.putString("message", "client is null");
        sendEvent("websocketFailed", writableMapCreateMap);
        WritableMap writableMapCreateMap2 = Arguments.createMap();
        writableMapCreateMap2.putInt("id", i);
        writableMapCreateMap2.putInt("code", 0);
        writableMapCreateMap2.putString("reason", "client is null");
        sendEvent("websocketClosed", writableMapCreateMap2);
        this.mWebSocketConnections.remove(Integer.valueOf(i));
        this.mContentHandlers.remove(Integer.valueOf(i));
    }

    @ReactMethod
    public void sendBinary(String str, int i) {
        WebSocket webSocket = this.mWebSocketConnections.get(Integer.valueOf(i));
        if (webSocket != null) {
            try {
                webSocket.send(ByteString.decodeBase64(str));
                return;
            } catch (Exception e) {
                notifyWebSocketFailed(i, e.getMessage());
                return;
            }
        }
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putInt("id", i);
        writableMapCreateMap.putString("message", "client is null");
        sendEvent("websocketFailed", writableMapCreateMap);
        WritableMap writableMapCreateMap2 = Arguments.createMap();
        writableMapCreateMap2.putInt("id", i);
        writableMapCreateMap2.putInt("code", 0);
        writableMapCreateMap2.putString("reason", "client is null");
        sendEvent("websocketClosed", writableMapCreateMap2);
        this.mWebSocketConnections.remove(Integer.valueOf(i));
        this.mContentHandlers.remove(Integer.valueOf(i));
    }

    public void setContentHandler(int i, b bVar) {
        if (bVar != null) {
            this.mContentHandlers.put(Integer.valueOf(i), bVar);
        } else {
            this.mContentHandlers.remove(Integer.valueOf(i));
        }
    }

    public class a extends WebSocketListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f7473a;

        public a(int i) {
            this.f7473a = i;
        }

        @Override // okhttp3.WebSocketListener
        public void onClosed(WebSocket webSocket, int i, String str) {
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putInt("id", this.f7473a);
            writableMapCreateMap.putInt("code", i);
            writableMapCreateMap.putString("reason", str);
            WebSocketModule.this.sendEvent("websocketClosed", writableMapCreateMap);
        }

        @Override // okhttp3.WebSocketListener
        public void onClosing(WebSocket webSocket, int i, String str) {
            webSocket.close(i, str);
        }

        @Override // okhttp3.WebSocketListener
        public void onFailure(WebSocket webSocket, Throwable th, Response response) {
            WebSocketModule.this.notifyWebSocketFailed(this.f7473a, th.getMessage());
        }

        @Override // okhttp3.WebSocketListener
        public void onMessage(WebSocket webSocket, String str) {
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putInt("id", this.f7473a);
            writableMapCreateMap.putString("type", "text");
            b bVar = (b) WebSocketModule.this.mContentHandlers.get(Integer.valueOf(this.f7473a));
            if (bVar != null) {
                bVar.a(str, writableMapCreateMap);
            } else {
                writableMapCreateMap.putString("data", str);
            }
            WebSocketModule.this.sendEvent("websocketMessage", writableMapCreateMap);
        }

        @Override // okhttp3.WebSocketListener
        public void onOpen(WebSocket webSocket, Response response) {
            WebSocketModule.this.mWebSocketConnections.put(Integer.valueOf(this.f7473a), webSocket);
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putInt("id", this.f7473a);
            writableMapCreateMap.putString("protocol", response.header("Sec-WebSocket-Protocol", ""));
            WebSocketModule.this.sendEvent("websocketOpen", writableMapCreateMap);
        }

        @Override // okhttp3.WebSocketListener
        public void onMessage(WebSocket webSocket, ByteString byteString) {
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putInt("id", this.f7473a);
            writableMapCreateMap.putString("type", "binary");
            b bVar = (b) WebSocketModule.this.mContentHandlers.get(Integer.valueOf(this.f7473a));
            if (bVar != null) {
                bVar.b(byteString, writableMapCreateMap);
            } else {
                writableMapCreateMap.putString("data", byteString.base64());
            }
            WebSocketModule.this.sendEvent("websocketMessage", writableMapCreateMap);
        }
    }

    public void sendBinary(ByteString byteString, int i) {
        WebSocket webSocket = this.mWebSocketConnections.get(Integer.valueOf(i));
        if (webSocket == null) {
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putInt("id", i);
            writableMapCreateMap.putString("message", "client is null");
            sendEvent("websocketFailed", writableMapCreateMap);
            WritableMap writableMapCreateMap2 = Arguments.createMap();
            writableMapCreateMap2.putInt("id", i);
            writableMapCreateMap2.putInt("code", 0);
            writableMapCreateMap2.putString("reason", "client is null");
            sendEvent("websocketClosed", writableMapCreateMap2);
            this.mWebSocketConnections.remove(Integer.valueOf(i));
            this.mContentHandlers.remove(Integer.valueOf(i));
            return;
        }
        try {
            webSocket.send(byteString);
        } catch (Exception e) {
            notifyWebSocketFailed(i, e.getMessage());
        }
    }
}
