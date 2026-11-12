package com.xiaomi.ai.transport;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.huami.core.device.wifi_settings.ui.WifiSetActivity;
import com.xiaomi.ai.api.AIApiConstants;
import com.xiaomi.ai.api.Settings;
import com.xiaomi.ai.api.StdStatuses;
import com.xiaomi.ai.api.common.APIUtils;
import com.xiaomi.ai.api.common.Event;
import com.xiaomi.ai.api.common.Instruction;
import com.xiaomi.ai.b.f;
import com.xiaomi.ai.core.AivsConfig;
import com.xiaomi.ai.core.e;
import com.xiaomi.ai.error.AivsError;
import com.xiaomi.ai.log.Logger;
import com.xiaomi.ai.track.TrackData;
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

/* JADX INFO: loaded from: classes18.dex */
public class c extends WebSocketListener {
    private e a;
    private AivsConfig b;
    private WebSocket c;
    private LiteCryptInterceptor d;
    private volatile boolean e;
    private String f;
    private int g;
    private int h;
    private AivsError i;
    private ObjectNode j;
    private final Object k = new Object();
    private String l;

    public c(e eVar) {
        this.a = eVar;
        this.b = eVar.getAivsConfig();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void a(Instruction instruction) {
        if (this.c == null || !AIApiConstants.Settings.ConnectionChallenge.equals(instruction.getHeader().getFullName())) {
            return;
        }
        this.l = instruction.getId();
        Logger.b("LiteCryptWsClient", "handShake: challenge id:" + this.l);
        this.a.updateTrackTimestamp("sdk.connect.ws.recv.challenge", System.currentTimeMillis());
        Settings.ConnectionChallenge connectionChallenge = (Settings.ConnectionChallenge) instruction.getPayload();
        String challenge = connectionChallenge.getChallenge();
        Optional<String> aesToken = connectionChallenge.getAesToken();
        Optional<Integer> tokenExpiresIn = connectionChallenge.getTokenExpiresIn();
        if (aesToken.isPresent() && tokenExpiresIn.isPresent()) {
            this.d.updateAesToken(aesToken.get(), (((long) tokenExpiresIn.get().intValue()) * 1000) + System.currentTimeMillis());
        }
        Settings.ConnectionChallengeAck connectionChallengeAck = new Settings.ConnectionChallengeAck();
        connectionChallengeAck.setChallengeMd5(com.xiaomi.ai.b.b.a(challenge));
        Event eventBuildEvent = APIUtils.buildEvent(connectionChallengeAck);
        String string = eventBuildEvent.toString();
        this.a.updateTrackTimestamp("sdk.connect.ws.send.challengeack", System.currentTimeMillis());
        Logger.b("LiteCryptWsClient", "handShake:send ackString, ackEvent:" + eventBuildEvent.getId());
        a(string);
        f();
        this.a.updateTrackTimestamp("sdk.connect.finish", System.currentTimeMillis());
        this.e = true;
        this.a.getListener().e(this.a);
        synchronized (this) {
            notify();
        }
    }

    private boolean a(Response response, String str) {
        Logger.a("LiteCryptWsClient", "shouldSwitchToWss: errorMsg=" + str);
        if (response != null && response.code() == 426) {
            return true;
        }
        if (f.a(str)) {
            return false;
        }
        return str.contains("Too many follow-up requests") || str.contains("Expected 'Connection' header value 'Upgrade' but") || str.contains("Control frames must be final.");
    }

    private void f() {
        String jsonString;
        Event<Settings.GlobalConfig> initEvent = this.a.getInitEvent();
        try {
            jsonString = initEvent.toJsonString();
        } catch (JsonProcessingException e) {
            Logger.d("LiteCryptWsClient", Logger.throwableToString(e));
            this.a.getListener().a(this.a, new AivsError(StdStatuses.MISSING_PARAMETER, "required field not set"));
            jsonString = null;
        }
        if (jsonString == null) {
            Logger.d("LiteCryptWsClient", "eventString: GlobalConfig Event is null");
            return;
        }
        Logger.b("LiteCryptWsClient", "sendInitEvent:" + initEvent.getId() + ", device id:" + this.a.getClientInfo().getDeviceId().get());
        a(jsonString);
    }

    public void a() {
        this.e = false;
        WebSocket webSocket = this.c;
        if (webSocket != null) {
            webSocket.cancel();
            this.c = null;
        }
    }

    public boolean a(Event event) {
        Logger.b("LiteCryptWsClient", "postEvent:" + event.getFullName() + "," + event.getId());
        try {
            return a(event.toJsonString());
        } catch (JsonProcessingException e) {
            Logger.d("LiteCryptWsClient", Logger.throwableToString(e));
            return false;
        }
    }

    public boolean a(String str) {
        if (Logger.getLogLevel() == 3) {
            Logger.a("LiteCryptWsClient", "send: " + str);
        } else {
            Logger.b("LiteCryptWsClient", "send: text");
        }
        WebSocket webSocket = this.c;
        if (webSocket == null) {
            Logger.d("LiteCryptWsClient", "send: already closed");
            this.e = false;
            return false;
        }
        try {
            LiteCryptInterceptor liteCryptInterceptor = this.d;
            if (liteCryptInterceptor != null) {
                str = com.xiaomi.ai.b.a.b(liteCryptInterceptor.aesCrypt(1, str.getBytes()), 10);
            }
            boolean zSend = webSocket.send(str);
            Logger.b("LiteCryptWsClient", "send: text, success=" + zSend);
            return zSend;
        } catch (GeneralSecurityException e) {
            Logger.d("LiteCryptWsClient", Logger.throwableToString(e));
            return false;
        }
    }

    public boolean a(String str, Map<String, String> map, OkHttpClient okHttpClient) {
        Logger.b("LiteCryptWsClient", "connectBlocking: " + str);
        this.a.updateTrackTimestamp("sdk.connect.ws.start", System.currentTimeMillis());
        if (this.b.getBoolean(AivsConfig.Track.ENABLE)) {
            ObjectNode objectNodeCreateObjectNode = APIUtils.getObjectMapper().createObjectNode();
            this.j = objectNodeCreateObjectNode;
            objectNodeCreateObjectNode.put("type", WifiSetActivity.KEY_CONNECT);
            this.j.put("url", str);
        }
        this.i = null;
        this.e = false;
        this.g = 0;
        this.h = 0;
        this.f = str;
        int i = this.b.getInt(AivsConfig.Connection.CONNECT_TIMEOUT, 5);
        int i2 = this.b.getInt(AivsConfig.Connection.PING_INTERVAL, 90);
        Logger.b("LiteCryptWsClient", "ws pingInterval:" + i2);
        OkHttpClient.Builder builderNewBuilder = okHttpClient.newBuilder();
        long j = (long) i;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        OkHttpClient.Builder builderPingInterval = builderNewBuilder.connectTimeout(j, timeUnit).pingInterval(i2, timeUnit);
        if (this.f.startsWith("ws:")) {
            LiteCryptInterceptor liteCryptInterceptor = new LiteCryptInterceptor(this.a);
            this.d = liteCryptInterceptor;
            builderPingInterval.addInterceptor(liteCryptInterceptor);
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
        Logger.a("LiteCryptWsClient", "mWebSocket:" + this.c + ", timeout:" + i);
        synchronized (this) {
            try {
                wait(j * 1000);
            } catch (InterruptedException e) {
                Logger.d("LiteCryptWsClient", Logger.throwableToString(e));
            }
        }
        if (this.e) {
            synchronized (this.k) {
                ObjectNode objectNode = this.j;
                if (objectNode != null) {
                    objectNode.put("result", 0);
                    this.j.put("timestamp", System.currentTimeMillis());
                    this.a.addTrackProcess(this.j);
                    this.j = null;
                }
            }
        } else if (this.c != null) {
            Logger.c("LiteCryptWsClient", "connectBlocking: cancel connection");
            this.c.cancel();
            this.c = null;
            this.e = false;
            synchronized (this.k) {
                ObjectNode objectNode2 = this.j;
                if (objectNode2 != null) {
                    objectNode2.put("result", -1);
                    this.j.put("timestamp", System.currentTimeMillis());
                    if (!this.j.hasNonNull("msg")) {
                        this.j.put("msg", "connection time out at " + this.f);
                    }
                    if (this.a.getTrackData() != null && !this.a.getTrackData().getJsonNode().hasNonNull("sdk.connect.error.msg")) {
                        this.a.updateTrack("sdk.connect.error.msg", "connection time out at " + this.f);
                    }
                    this.a.addTrackProcess(this.j);
                    this.j = null;
                }
            }
        }
        return this.e;
    }

    public boolean a(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        sb.append("send: ");
        sb.append(bArr != null ? bArr.length : 0);
        Logger.b("LiteCryptWsClient", sb.toString());
        WebSocket webSocket = this.c;
        if (webSocket == null) {
            Logger.d("LiteCryptWsClient", "send: already closed");
            this.e = false;
            return false;
        }
        try {
            LiteCryptInterceptor liteCryptInterceptor = this.d;
            boolean zSend = webSocket.send(liteCryptInterceptor != null ? ByteString.of(liteCryptInterceptor.aesCrypt(1, bArr)) : ByteString.of(bArr));
            Logger.b("LiteCryptWsClient", "send: data, success=" + zSend);
            return zSend;
        } catch (GeneralSecurityException e) {
            Logger.d("LiteCryptWsClient", "send byte exception:" + Logger.throwableToString(e));
            return false;
        }
    }

    public int b() {
        return this.g;
    }

    public int c() {
        return this.h;
    }

    public boolean d() {
        return this.e;
    }

    public AivsError e() {
        return this.i;
    }

    @Override // okhttp3.WebSocketListener
    public void onClosed(WebSocket webSocket, int i, String str) {
        Logger.d("LiteCryptWsClient", "onClosed: code=" + i + "reason=" + str + ", webSocket:" + webSocket + ",mWebSocket:" + this.c);
        if (webSocket != this.c) {
            Logger.c("LiteCryptWsClient", "onClosed: not same websocket, do nothing");
            return;
        }
        this.g = i;
        if (this.e) {
            this.a.getListener().f(this.a);
        }
        synchronized (this) {
            if (!this.e) {
                notify();
            }
            this.e = false;
        }
    }

    @Override // okhttp3.WebSocketListener
    public void onClosing(WebSocket webSocket, int i, String str) {
        Logger.c("LiteCryptWsClient", "onClosing: code=" + i + ", reason=" + str + ", webSocket:" + webSocket + ",mWebSocket:" + this.c);
        if (webSocket != null) {
            webSocket.cancel();
            Logger.a("LiteCryptWsClient", "onClosing: cancel");
        }
        if (webSocket != this.c) {
            Logger.c("LiteCryptWsClient", "onClosing: not same websocket, do nothing");
            return;
        }
        if (this.e) {
            this.a.getListener().f(this.a);
        }
        synchronized (this) {
            if (!this.e) {
                notify();
            }
            this.e = false;
        }
    }

    @Override // okhttp3.WebSocketListener
    public void onFailure(WebSocket webSocket, Throwable th, Response response) {
        boolean z;
        AivsError aivsError;
        Logger.d("LiteCryptWsClient", "onFailure: " + th + ", " + response + " , webSocket:" + webSocket + ",mWebSocket:" + this.c);
        if (webSocket != this.c) {
            Logger.c("LiteCryptWsClient", "onFailure: not same websocket, do nothing");
            return;
        }
        TrackData trackData = this.a.getTrackData();
        if (trackData == null || trackData.isFinished()) {
            trackData = this.a.createTrackData();
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
                    Logger.c("LiteCryptWsClient", "onFailure: clear cached token");
                    this.a.clearAuthToken();
                }
            } catch (IOException e) {
                Logger.d("LiteCryptWsClient", Logger.throwableToString(e));
            }
        }
        if (trackData != null) {
            trackData.set("sdk.connect.error.msg", "onFailure: " + th + ", " + response + ", body=" + strString + ", header=" + string + ", challengeId=" + this.l);
        }
        Logger.d("LiteCryptWsClient", "onFailure: " + Logger.throwableToString(th) + ", " + response + ", body=" + strString + ", header=" + string);
        if (Logger.getLogLevel() >= 3) {
            for (StackTraceElement stackTraceElement : th.getStackTrace()) {
                Logger.d("LiteCryptWsClient", "onFailure: " + stackTraceElement.toString());
            }
        }
        if (response != null) {
            int iCode = response.code();
            this.g = iCode;
            if (trackData != null) {
                trackData.set("sdk.connect.error.code", iCode);
            }
            int i = this.g;
            if (i == 401) {
                aivsError = new AivsError(401, strString);
            } else {
                if (i == 500) {
                    aivsError = new AivsError(500, strString);
                }
                this.h = this.a.processErrorMsg(this.d, strString);
            }
            this.i = aivsError;
            this.h = this.a.processErrorMsg(this.d, strString);
        }
        if (a(response, Logger.throwableToString(th))) {
            this.a.switchToWssMode();
        }
        if (trackData != null) {
            trackData.setTimestamp("sdk.disconnect", System.currentTimeMillis());
            if (z) {
                trackData.finishTrack();
            }
        }
        if (this.e) {
            this.a.getListener().f(this.a);
        }
        synchronized (this) {
            if (!this.e) {
                notify();
            }
            this.e = false;
        }
    }

    @Override // okhttp3.WebSocketListener
    public void onMessage(WebSocket webSocket, String str) {
        Logger.a("LiteCryptWsClient", "onMessage: " + str + " ,webSocket:" + webSocket + ",mWebSocket:" + this.c);
        try {
            LiteCryptInterceptor liteCryptInterceptor = this.d;
            if (liteCryptInterceptor != null) {
                str = new String(liteCryptInterceptor.aesCrypt(2, com.xiaomi.ai.b.a.a(str.getBytes(), 0)));
            }
            Instruction instruction = APIUtils.readInstruction(str);
            if (instruction.getPayload() instanceof JsonNode) {
                Logger.d("LiteCryptWsClient", "onMessage: failed to readInstruction from, " + instruction.getFullName() + "," + (instruction.getDialogId().isPresent() ? instruction.getDialogId().get() : ""));
                return;
            }
            Logger.b("LiteCryptWsClient", "onMessage:" + instruction.getFullName() + "," + (instruction.getDialogId().isPresent() ? instruction.getDialogId().get() : ""));
            if (this.e) {
                this.a.getListener().a(this.a, instruction);
            } else {
                a(instruction);
            }
        } catch (IOException | GeneralSecurityException e) {
            Logger.d("LiteCryptWsClient", "onMessage: Exception: " + Logger.throwableToString(e));
        }
    }

    @Override // okhttp3.WebSocketListener
    public void onMessage(WebSocket webSocket, ByteString byteString) {
        Logger.b("LiteCryptWsClient", "onMessage: size=" + byteString.size() + ", webSocket:" + webSocket + ",mWebSocket:" + this.c);
        try {
            byte[] byteArray = byteString.toByteArray();
            LiteCryptInterceptor liteCryptInterceptor = this.d;
            if (liteCryptInterceptor != null) {
                byteArray = liteCryptInterceptor.aesCrypt(2, byteString.toByteArray());
            }
            if (byteArray != null) {
                this.a.getListener().a(this.a, byteArray);
                return;
            }
            Logger.d("LiteCryptWsClient", "onMessage: failed to decode bytes=" + byteString);
        } catch (GeneralSecurityException e) {
            Logger.d("LiteCryptWsClient", "onMessage1: Exception: " + Logger.throwableToString(e));
        }
    }

    @Override // okhttp3.WebSocketListener
    public void onOpen(WebSocket webSocket, Response response) {
        String str;
        this.a.updateTrackTimestamp("sdk.connect.ws.finish", System.currentTimeMillis());
        Logger.b("LiteCryptWsClient", "onOpen webSocket:" + webSocket + ",mWebSocket:" + this.c);
        if (this.c == null || (str = this.f) == null || !str.startsWith("wss:")) {
            return;
        }
        synchronized (this) {
            f();
            this.a.updateTrackTimestamp("sdk.connect.finish", System.currentTimeMillis());
            this.e = true;
            if (webSocket == this.c) {
                notify();
            }
        }
    }
}
