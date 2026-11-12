package defpackage;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.xiaomi.ai.api.AIApiConstants;
import com.xiaomi.ai.api.Settings;
import com.xiaomi.ai.api.StdStatuses;
import com.xiaomi.ai.api.common.APIUtils;
import com.xiaomi.ai.api.common.Event;
import com.xiaomi.ai.api.common.Instruction;
import com.xiaomi.common.Optional;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;
import okio.ByteString;

/* JADX INFO: loaded from: classes7.dex */
public class tes extends WebSocketListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ses f34628a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e01 f34629b;
    public WebSocket c;
    public yhe d;
    public volatile boolean e;
    public String f;
    public int g;
    public int h;
    public f01 i;
    public c4h j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Object f34630k = new Object();
    public String l;

    public tes(ses sesVar) {
        this.f34628a = sesVar;
        this.f34629b = sesVar.getAivsConfig();
    }

    public void a() {
        this.e = false;
        WebSocket webSocket = this.c;
        if (webSocket != null) {
            webSocket.cancel();
            this.c = null;
        }
    }

    public final void b(Instruction<?> instruction) {
        if (this.c == null || !AIApiConstants.Settings.ConnectionChallenge.equals(instruction.getHeader().getFullName())) {
            return;
        }
        this.l = instruction.getId();
        wpe.h("LiteCryptWsClient", "handShake: challenge id:" + this.l);
        this.f34628a.updateTrackTimestamp("sdk.connect.ws.recv.challenge", System.currentTimeMillis());
        Settings.ConnectionChallenge connectionChallenge = (Settings.ConnectionChallenge) instruction.getPayload();
        String challenge = connectionChallenge.getChallenge();
        Optional<String> aesToken = connectionChallenge.getAesToken();
        Optional<Integer> tokenExpiresIn = connectionChallenge.getTokenExpiresIn();
        if (aesToken.c() && tokenExpiresIn.c()) {
            this.d.y(aesToken.b(), (((long) tokenExpiresIn.b().intValue()) * 1000) + System.currentTimeMillis());
        }
        Settings.ConnectionChallengeAck connectionChallengeAck = new Settings.ConnectionChallengeAck();
        connectionChallengeAck.setChallengeMd5(e3s.a(challenge));
        Event eventBuildEvent = APIUtils.buildEvent(connectionChallengeAck);
        String string = eventBuildEvent.toString();
        this.f34628a.updateTrackTimestamp("sdk.connect.ws.send.challengeack", System.currentTimeMillis());
        wpe.h("LiteCryptWsClient", "handShake:send ackString, ackEvent:" + eventBuildEvent.getId());
        c(string);
        k();
        this.f34628a.updateTrackTimestamp("sdk.connect.finish", System.currentTimeMillis());
        this.e = true;
        this.f34628a.getListener().onConnected(this.f34628a);
        synchronized (this) {
            notify();
        }
    }

    public boolean c(String str) {
        if (wpe.l() == 3) {
            wpe.b("LiteCryptWsClient", "send: " + str);
        } else {
            wpe.h("LiteCryptWsClient", "send: text");
        }
        WebSocket webSocket = this.c;
        if (webSocket == null) {
            wpe.e("LiteCryptWsClient", "send: already closed");
            this.e = false;
            return false;
        }
        try {
            yhe yheVar = this.d;
            if (yheVar != null) {
                str = l12.f(yheVar.l(1, str.getBytes()), 10);
            }
            boolean zSend = webSocket.send(str);
            wpe.h("LiteCryptWsClient", "send: text, success=" + zSend);
            return zSend;
        } catch (Exception e) {
            wpe.e("LiteCryptWsClient", wpe.o(e));
            return false;
        }
    }

    public boolean d(String str, Map<String, String> map) {
        wpe.h("LiteCryptWsClient", "connectBlocking: " + str);
        this.f34628a.updateTrackTimestamp("sdk.connect.ws.start", System.currentTimeMillis());
        if (this.f34629b.b("track.enable")) {
            c4h c4hVarCreateObjectNode = APIUtils.getObjectMapper().createObjectNode();
            this.j = c4hVarCreateObjectNode;
            c4hVarCreateObjectNode.j0("type", "connect");
            this.j.j0("url", str);
        }
        this.i = null;
        this.e = false;
        this.g = 0;
        this.h = 0;
        this.f = str;
        int iF = this.f34629b.f("connection.connect_timeout", 5);
        int iF2 = this.f34629b.f("connection.ping_interval", 90);
        wpe.h("LiteCryptWsClient", "ws pingInterval:" + iF2);
        OkHttpClient.Builder builderNewBuilder = new OkHttpClient().newBuilder();
        long j = (long) iF;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        OkHttpClient.Builder builderPingInterval = builderNewBuilder.connectTimeout(j, timeUnit).pingInterval(iF2, timeUnit);
        if (this.f.startsWith("ws:")) {
            yhe yheVar = new yhe(this.f34628a);
            this.d = yheVar;
            builderPingInterval.addInterceptor(yheVar);
        } else {
            this.d = null;
        }
        OkHttpClient okHttpClientBuild = builderPingInterval.build();
        Request.Builder builderUrl = new Request.Builder().url(this.f);
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                builderUrl.addHeader(entry.getKey(), entry.getValue());
            }
        }
        this.c = okHttpClientBuild.newWebSocket(builderUrl.build(), this);
        wpe.b("LiteCryptWsClient", "mWebSocket:" + this.c + ", timeout:" + iF);
        synchronized (this) {
            try {
                wait(j * 1000);
            } catch (InterruptedException e) {
                wpe.e("LiteCryptWsClient", wpe.o(e));
            }
        }
        if (this.e) {
            synchronized (this.f34630k) {
                try {
                    c4h c4hVar = this.j;
                    if (c4hVar != null) {
                        c4hVar.g0("result", 0);
                        this.j.h0("timestamp", System.currentTimeMillis());
                        this.f34628a.addTrackProcess(this.j);
                        this.j = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else if (this.c != null) {
            wpe.k("LiteCryptWsClient", "connectBlocking: cancel connection");
            this.c.cancel();
            this.c = null;
            this.e = false;
            synchronized (this.f34630k) {
                try {
                    c4h c4hVar2 = this.j;
                    if (c4hVar2 != null) {
                        c4hVar2.g0("result", -1);
                        this.j.h0("timestamp", System.currentTimeMillis());
                        if (!this.j.A("msg")) {
                            this.j.j0("msg", "connection time out at " + this.f);
                        }
                        if (this.f34628a.getTrackData() != null && !this.f34628a.getTrackData().c().A("sdk.connect.error.msg")) {
                            this.f34628a.updateTrack("sdk.connect.error.msg", "connection time out at " + this.f);
                        }
                        this.f34628a.addTrackProcess(this.j);
                        this.j = null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.e;
    }

    public final boolean e(Response response, String str) {
        wpe.b("LiteCryptWsClient", "shouldSwitchToWss: errorMsg=" + str);
        if (response != null && response.code() == 426) {
            return true;
        }
        if (yrs.b(str)) {
            return false;
        }
        if (str.contains("Too many follow-up requests") || str.contains("Expected 'Connection' header value 'Upgrade' but")) {
            return true;
        }
        return str.contains("Control frames must be final.");
    }

    public boolean f(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        sb.append("send: ");
        sb.append(bArr != null ? bArr.length : 0);
        wpe.h("LiteCryptWsClient", sb.toString());
        WebSocket webSocket = this.c;
        if (webSocket == null) {
            wpe.e("LiteCryptWsClient", "send: already closed");
            this.e = false;
            return false;
        }
        try {
            yhe yheVar = this.d;
            boolean zSend = webSocket.send(yheVar != null ? ByteString.of(yheVar.l(1, bArr)) : ByteString.of(bArr));
            wpe.h("LiteCryptWsClient", "send: data, success=" + zSend);
            return zSend;
        } catch (GeneralSecurityException e) {
            wpe.e("LiteCryptWsClient", "send byte exception:" + wpe.o(e));
            return false;
        } catch (Exception e2) {
            wpe.e("LiteCryptWsClient", wpe.o(e2));
            return false;
        }
    }

    public int g() {
        return this.h;
    }

    public int h() {
        return this.g;
    }

    public f01 i() {
        return this.i;
    }

    public boolean j() {
        return this.e;
    }

    public final void k() {
        String jsonString;
        Event<Settings.GlobalConfig> initEvent = this.f34628a.getInitEvent();
        try {
            jsonString = initEvent.toJsonString();
        } catch (JsonProcessingException e) {
            wpe.e("LiteCryptWsClient", wpe.o(e));
            this.f34628a.getListener().onError(this.f34628a, new f01(StdStatuses.MISSING_PARAMETER, "required field not set"));
            jsonString = null;
        }
        if (jsonString == null) {
            wpe.e("LiteCryptWsClient", "eventString: GlobalConfig Event is null");
            return;
        }
        wpe.h("LiteCryptWsClient", "sendInitEvent:" + initEvent.getId());
        c(jsonString);
    }

    @Override // okhttp3.WebSocketListener
    public void onClosed(WebSocket webSocket, int i, String str) {
        wpe.e("LiteCryptWsClient", "onClosed: code=" + i + "reason=" + str + ", webSocket:" + webSocket + ",mWebSocket:" + this.c);
        if (webSocket != this.c) {
            wpe.k("LiteCryptWsClient", "onClosed: not same websocket, do nothing");
            return;
        }
        this.g = i;
        if (this.e) {
            this.f34628a.getListener().onDisconnected(this.f34628a);
        }
        synchronized (this) {
            try {
                if (!this.e) {
                    notify();
                }
                this.e = false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // okhttp3.WebSocketListener
    public void onClosing(WebSocket webSocket, int i, String str) {
        wpe.k("LiteCryptWsClient", "onClosing: code=" + i + ", reason=" + str + ", webSocket:" + webSocket + ",mWebSocket:" + this.c);
        if (webSocket != null) {
            webSocket.cancel();
            wpe.b("LiteCryptWsClient", "onClosing: cancel");
        }
        if (webSocket != this.c) {
            wpe.k("LiteCryptWsClient", "onClosing: not same websocket, do nothing");
            return;
        }
        if (this.e) {
            this.f34628a.getListener().onDisconnected(this.f34628a);
        }
        synchronized (this) {
            try {
                if (!this.e) {
                    notify();
                }
                this.e = false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // okhttp3.WebSocketListener
    public void onFailure(WebSocket webSocket, Throwable th, Response response) {
        boolean z;
        f01 f01Var;
        wpe.e("LiteCryptWsClient", "onFailure: " + th + ", " + response + " , webSocket:" + webSocket + ",mWebSocket:" + this.c);
        if (webSocket != this.c) {
            wpe.k("LiteCryptWsClient", "onFailure: not same websocket, do nothing");
            return;
        }
        klp trackData = this.f34628a.getTrackData();
        if (trackData == null || trackData.e()) {
            trackData = this.f34628a.createTrackData();
            z = true;
        } else {
            z = false;
        }
        String strString = "";
        String string = "";
        if (response != null) {
            try {
                strString = response.body().string();
                string = response.headers().toString();
                if (strString != null && strString.contains("device scope data validate error")) {
                    wpe.k("LiteCryptWsClient", "onFailure: clear cached token");
                    this.f34628a.clearAuthToken();
                }
            } catch (IOException e) {
                wpe.e("LiteCryptWsClient", wpe.o(e));
            }
        }
        if (trackData != null) {
            trackData.h("sdk.connect.error.msg", "onFailure: " + th + ", " + response + ", body=" + strString + ", header=" + string + ", challengeId=" + this.l);
        }
        String strO = wpe.o(th);
        wpe.e("LiteCryptWsClient", "onFailure: " + strO + ", " + response + ", body=" + strString + ", header=" + string);
        if (strO != null && strO.contains("SocketTimeoutException")) {
            this.f34628a.getListener().detectWeakNetwork(this.f34628a);
        }
        if (wpe.l() >= 3) {
            for (StackTraceElement stackTraceElement : th.getStackTrace()) {
                wpe.e("LiteCryptWsClient", "onFailure: " + stackTraceElement.toString());
            }
        }
        if (response != null) {
            int iCode = response.code();
            this.g = iCode;
            if (trackData != null) {
                trackData.g("sdk.connect.error.code", iCode);
            }
            int i = this.g;
            if (i == 401) {
                f01Var = new f01(401, strString);
            } else {
                if (i == 500) {
                    f01Var = new f01(500, strString);
                }
                this.h = this.f34628a.processErrorMsg(this.d, strString);
            }
            this.i = f01Var;
            this.h = this.f34628a.processErrorMsg(this.d, strString);
        }
        if (e(response, wpe.o(th))) {
            this.f34628a.switchToWssMode();
        }
        if (trackData != null) {
            trackData.i("sdk.disconnect", System.currentTimeMillis());
            if (z) {
                trackData.b();
            }
        }
        if (this.e) {
            this.f34628a.getListener().onDisconnected(this.f34628a);
        }
        synchronized (this) {
            try {
                if (!this.e) {
                    notify();
                }
                this.e = false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // okhttp3.WebSocketListener
    public void onMessage(WebSocket webSocket, String str) {
        String strO;
        wpe.b("LiteCryptWsClient", "onMessage: " + str + " ,webSocket:" + webSocket + ",mWebSocket:" + this.c);
        try {
            yhe yheVar = this.d;
            if (yheVar != null) {
                str = new String(yheVar.l(2, l12.b(str.getBytes(), 0)));
            }
            Instruction<?> instruction = APIUtils.readInstruction(str);
            dcd dcdVar = new dcd(instruction, str);
            wpe.h("LiteCryptWsClient", "onMessage:" + instruction.getFullName() + "," + (instruction.getDialogId().c() ? instruction.getDialogId().b() : ""));
            if (this.e) {
                this.f34628a.getListener().onInstruction(this.f34628a, dcdVar);
            } else {
                b(instruction);
            }
        } catch (IOException e) {
            e = e;
            strO = "onMessage: Exception: " + wpe.o(e);
            wpe.e("LiteCryptWsClient", strO);
        } catch (GeneralSecurityException e2) {
            e = e2;
            strO = "onMessage: Exception: " + wpe.o(e);
            wpe.e("LiteCryptWsClient", strO);
        } catch (Exception e3) {
            strO = wpe.o(e3);
            wpe.e("LiteCryptWsClient", strO);
        }
    }

    @Override // okhttp3.WebSocketListener
    public void onOpen(WebSocket webSocket, Response response) {
        String str;
        this.f34628a.updateTrackTimestamp("sdk.connect.ws.finish", System.currentTimeMillis());
        wpe.h("LiteCryptWsClient", "onOpen webSocket:" + webSocket + ",mWebSocket:" + this.c);
        if (this.c == null || (str = this.f) == null || !str.startsWith("wss:")) {
            return;
        }
        synchronized (this) {
            try {
                k();
                this.f34628a.updateTrackTimestamp("sdk.connect.finish", System.currentTimeMillis());
                this.e = true;
                this.f34628a.getListener().onConnected(this.f34628a);
                if (webSocket == this.c) {
                    notify();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // okhttp3.WebSocketListener
    public void onMessage(WebSocket webSocket, ByteString byteString) {
        String strO;
        wpe.h("LiteCryptWsClient", "onMessage: size=" + byteString.size() + ", webSocket:" + webSocket + ",mWebSocket:" + this.c);
        try {
            byte[] byteArray = byteString.toByteArray();
            yhe yheVar = this.d;
            if (yheVar != null) {
                byteArray = yheVar.l(2, byteString.toByteArray());
            }
            if (byteArray != null) {
                this.f34628a.getListener().onBinaryMessage(this.f34628a, byteArray);
                return;
            }
            wpe.e("LiteCryptWsClient", "onMessage: failed to decode bytes=" + byteString);
        } catch (GeneralSecurityException e) {
            strO = "onMessage1: Exception: " + wpe.o(e);
            wpe.e("LiteCryptWsClient", strO);
        } catch (Exception e2) {
            strO = wpe.o(e2);
            wpe.e("LiteCryptWsClient", strO);
        }
    }
}
