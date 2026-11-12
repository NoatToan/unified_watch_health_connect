package com.huawei.hms.network.embedded;

import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.network.httpclient.Request;
import com.huawei.hms.network.httpclient.websocket.WebSocket;
import java.util.Random;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes34.dex */
public class i3 extends WebSocket implements k4 {
    public static final String e = "OkHttpWebSocketProxy";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ua f14901a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Request f14902b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public q7 f14903c;
    public p3 d;

    @Override // com.huawei.hms.network.httpclient.websocket.WebSocket
    public boolean send(byte[] bArr) {
        eb ebVarE = eb.e(bArr);
        this.d.onSend();
        return this.f14901a.b(ebVarE);
    }

    @Override // com.huawei.hms.network.httpclient.websocket.WebSocket
    public boolean send(String str) {
        return this.f14901a.b(str);
    }

    public void resetPingIntervalOnReadPong(long j) {
        this.f14901a.a(j);
        Logger.v(e, "resetPingIntervalOnReadPong " + j);
    }

    @Override // com.huawei.hms.network.httpclient.websocket.WebSocket
    public void resetPingInterval(long j) {
        Request request = this.f14902b;
        if (request != null) {
            int iEnableDynamicPing = ((h1.d) request).getNetConfig().enableDynamicPing();
            if (iEnableDynamicPing != 0) {
                Logger.w(e, "Cannot reset pinginterval,dynamicPing is enable " + iEnableDynamicPing);
            } else {
                this.f14901a.a(j);
                Logger.v(e, "resetPingInterval " + j);
            }
        }
    }

    @Override // com.huawei.hms.network.httpclient.websocket.WebSocket
    public Request request() {
        return this.f14902b;
    }

    @Override // com.huawei.hms.network.httpclient.websocket.WebSocket
    public long queueSize() {
        return this.f14901a.a();
    }

    public p3 getWebSocketListenerAdapter() {
        return this.d;
    }

    @Override // com.huawei.hms.network.httpclient.websocket.WebSocket
    public boolean enableDynamicPing(int i) {
        return this.d.enableDynamicPing(i);
    }

    @Override // com.huawei.hms.network.embedded.k4
    public void connect() {
        this.f14901a.a(this.f14903c);
    }

    @Override // com.huawei.hms.network.httpclient.websocket.WebSocket
    public boolean close(int i, @Nullable String str) {
        return this.f14901a.a(i, str);
    }

    @Override // com.huawei.hms.network.httpclient.websocket.WebSocket
    public void cancel() {
        this.f14901a.cancel();
    }

    public i3(t7.a aVar, h1.d dVar, WebSocket webSocket, q7 q7Var) {
        if (!(webSocket instanceof j4)) {
            throw new ClassCastException("websocket can not cast to WebSocketImpl");
        }
        this.d = new p3(webSocket, ((j4) webSocket).getWebSocketListener(), dVar);
        this.f14901a = new ua(aVar.a(), this.d, new Random(), q7Var.v());
        this.f14902b = dVar;
        this.f14903c = q7Var;
    }
}
