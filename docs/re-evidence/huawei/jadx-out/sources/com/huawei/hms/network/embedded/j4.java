package com.huawei.hms.network.embedded;

import com.huawei.hms.network.httpclient.Request;
import com.huawei.hms.network.httpclient.websocket.WebSocket;
import com.huawei.hms.network.httpclient.websocket.WebSocketListener;

/* JADX INFO: loaded from: classes34.dex */
public class j4 extends WebSocket {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public WebSocket f14945a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Request f14946b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public WebSocketListener f14947c;

    public void setProxy(WebSocket webSocket) {
        this.f14945a = webSocket;
    }

    @Override // com.huawei.hms.network.httpclient.websocket.WebSocket
    public boolean send(byte[] bArr) {
        WebSocket webSocket = this.f14945a;
        if (webSocket == null) {
            return false;
        }
        return webSocket.send(bArr);
    }

    @Override // com.huawei.hms.network.httpclient.websocket.WebSocket
    public boolean send(String str) {
        WebSocket webSocket = this.f14945a;
        if (webSocket == null) {
            return false;
        }
        return webSocket.send(str);
    }

    public void resetPingIntervalOnReadPong(long j) {
        WebSocket webSocket = this.f14945a;
        if (webSocket == null || !(webSocket instanceof i3)) {
            return;
        }
        ((i3) webSocket).resetPingIntervalOnReadPong(j);
    }

    @Override // com.huawei.hms.network.httpclient.websocket.WebSocket
    public void resetPingInterval(long j) {
        WebSocket webSocket = this.f14945a;
        if (webSocket != null) {
            webSocket.resetPingInterval(j);
        }
    }

    @Override // com.huawei.hms.network.httpclient.websocket.WebSocket
    public Request request() {
        WebSocket webSocket = this.f14945a;
        if (webSocket == null) {
            return null;
        }
        return webSocket.request();
    }

    @Override // com.huawei.hms.network.httpclient.websocket.WebSocket
    public long queueSize() {
        WebSocket webSocket = this.f14945a;
        if (webSocket == null) {
            return 0L;
        }
        return webSocket.queueSize();
    }

    public WebSocketListener getWebSocketListener() {
        return this.f14947c;
    }

    public Request getRequest() {
        return this.f14946b;
    }

    @Override // com.huawei.hms.network.httpclient.websocket.WebSocket
    public boolean enableDynamicPing(int i) {
        WebSocket webSocket = this.f14945a;
        if (webSocket != null) {
            return webSocket.enableDynamicPing(i);
        }
        return false;
    }

    @Override // com.huawei.hms.network.httpclient.websocket.WebSocket
    public boolean close(int i, String str) {
        WebSocket webSocket = this.f14945a;
        if (webSocket == null) {
            return false;
        }
        return webSocket.close(i, str);
    }

    @Override // com.huawei.hms.network.httpclient.websocket.WebSocket
    public void cancel() {
        WebSocket webSocket = this.f14945a;
        if (webSocket != null) {
            webSocket.cancel();
        }
    }

    public j4(Request request, WebSocketListener webSocketListener) {
        this.f14946b = request;
        this.f14947c = webSocketListener;
    }
}
