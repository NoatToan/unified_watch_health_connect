package com.xiaomi.ai.core;

import com.huami.core.device.wifi_settings.ui.WifiSetActivity;
import com.huami.watch.companion.mediac.Command;
import com.xiaomi.ai.api.Network;
import com.xiaomi.ai.api.Settings;
import com.xiaomi.ai.api.common.APIUtils;
import com.xiaomi.ai.api.common.Event;
import com.xiaomi.ai.b.f;
import com.xiaomi.ai.log.Logger;
import com.xiaomi.ai.track.TrackData;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.HashMap;
import java.util.Map;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: classes18.dex */
public class e extends a {
    private volatile boolean a;
    private OkHttpClient b;
    private com.xiaomi.ai.transport.c c;

    public e(AivsConfig aivsConfig, Settings.ClientInfo clientInfo, int i, b bVar) {
        super(aivsConfig, clientInfo, i, bVar);
        a();
        b();
        this.mHttpDns = this.a ? new com.xiaomi.ai.transport.b(this, new c(this.mAivsConfig).a()) : new com.xiaomi.ai.transport.b(this, new c(this.mAivsConfig).b());
    }

    public e(AivsConfig aivsConfig, Settings.ClientInfo clientInfo, com.xiaomi.ai.a.a aVar, b bVar) {
        super(aivsConfig, clientInfo, aVar, bVar);
        a();
        b();
        this.mHttpDns = this.a ? new com.xiaomi.ai.transport.b(this, new c(this.mAivsConfig).a()) : new com.xiaomi.ai.transport.b(this, new c(this.mAivsConfig).b());
    }

    private Map<String, String> a(boolean z) {
        HashMap map = new HashMap();
        String strA = this.mAuthProvider.a(z, true, (Map<String, String>) map);
        if (strA == null) {
            Logger.d("WSChannel", "getHeaders: failed to getAuthHeader");
            this.mLastError = this.mAuthProvider.a();
            return null;
        }
        map.put("Authorization", strA);
        String string = this.mAivsConfig.getString(AivsConfig.Connection.USER_AGENT);
        if (!f.a(string)) {
            map.put("User-Agent", string);
        }
        map.put("Heartbeat-Client", String.valueOf(this.mAivsConfig.getInt(AivsConfig.Connection.PING_INTERVAL, 90)));
        map.put("Host", this.mHttpDns.a());
        String strRandomRequestId = APIUtils.randomRequestId(false);
        map.put("Client-Connection-Id", strRandomRequestId);
        Logger.b("WSChannel", "request Headers: clientConnectionId = " + strRandomRequestId);
        Logger.a("WSChannel", "request Headers:\n" + f.a(map));
        return map;
    }

    private void a() {
        this.b = new OkHttpClient.Builder().build();
    }

    private void b() {
        if (!this.mAivsConfig.getBoolean(AivsConfig.Connection.ENABLE_LITE_CRYPT)) {
            this.a = true;
            Logger.b("WSChannel", "checkWssMode:use wss by config");
            return;
        }
        String strA = this.mListener.a(this, "link_mode");
        if (!f.a(strA) && strA.equals("wss")) {
            this.a = true;
            Logger.b("WSChannel", "checkWssMode:use cloud wss mode");
            return;
        }
        String strA2 = this.mListener.a(this, "wss_expire_at");
        if (f.a(strA2)) {
            this.a = false;
            Logger.c("WSChannel", "checkWssMode:not in wss mode");
        } else if (System.currentTimeMillis() / 1000 <= Long.parseLong(strA2)) {
            this.a = true;
            Logger.c("WSChannel", "checkWssMode:in wss mode");
        } else {
            this.a = false;
            this.mListener.b(this, "wss_expire_at");
            Logger.c("WSChannel", "checkWssMode:wss mode expired, try ws mode");
        }
    }

    @Override // com.xiaomi.ai.core.a
    public String getChannelType() {
        return "ws";
    }

    @Override // com.xiaomi.ai.core.a
    public int getErrorCode() {
        com.xiaomi.ai.transport.c cVar = this.c;
        if (cVar != null) {
            return cVar.b();
        }
        return 0;
    }

    @Override // com.xiaomi.ai.core.a
    public int getFailureCode() {
        com.xiaomi.ai.transport.c cVar = this.c;
        if (cVar != null) {
            return cVar.c();
        }
        return 0;
    }

    @Override // com.xiaomi.ai.core.a
    public boolean isConnected() {
        com.xiaomi.ai.transport.c cVar = this.c;
        return cVar != null && cVar.d();
    }

    @Override // com.xiaomi.ai.core.a
    public boolean postData(byte[] bArr) {
        boolean z;
        synchronized (this) {
            com.xiaomi.ai.transport.c cVar = this.c;
            z = cVar != null && cVar.d() && this.c.a(bArr);
        }
        return z;
    }

    @Override // com.xiaomi.ai.core.a
    public boolean postData(byte[] bArr, int i, int i2) {
        synchronized (this) {
            com.xiaomi.ai.transport.c cVar = this.c;
            if (cVar == null || !cVar.d()) {
                Logger.d("WSChannel", "postData: channel was not started");
                return false;
            }
            byte[] bArr2 = new byte[i2];
            System.arraycopy(bArr, i, bArr2, 0, i2);
            return this.c.a(bArr2);
        }
    }

    @Override // com.xiaomi.ai.core.a
    public boolean postEvent(Event event) {
        boolean z;
        synchronized (this) {
            updateGlobalConfig(event);
            com.xiaomi.ai.transport.c cVar = this.c;
            z = cVar != null && cVar.d() && this.c.a(event);
        }
        return z;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:29:0x0101  */
    /* JADX WARN: Code duplicated, block: B:32:0x010c  */
    @Override // com.xiaomi.ai.core.a
    public boolean startConnect(boolean z) {
        String str;
        TrackData trackData;
        String str2;
        if (this.mAivsConfig.getBoolean(AivsConfig.Track.ENABLE)) {
            TrackData trackData2 = new TrackData(this.mTrackInfo);
            this.mTrackData = trackData2;
            this.mListener.a(this, trackData2);
            updateTrackTimestamp("sdk.connect.start", System.currentTimeMillis());
        }
        boolean z2 = false;
        String strName = Network.NetworkType.UNKNOWN.name();
        if (this.mClientInfo.getNetwork().isPresent()) {
            strName = this.mClientInfo.getNetwork().get().name();
        }
        try {
            Map<String, String> mapA = a(z);
            if (mapA != null) {
                if (this.c != null) {
                    Logger.c("WSChannel", "close mWsClient " + this.c);
                    this.c.a();
                } else {
                    Logger.c("WSChannel", "reset mWsClient");
                }
                com.xiaomi.ai.transport.c cVar = new com.xiaomi.ai.transport.c(this);
                this.c = cVar;
                if (cVar.a(this.mHttpDns.a(strName), mapA, this.b)) {
                    this.mLastError = null;
                    z2 = true;
                    Logger.a("WSChannel", "startConnect success " + this.c);
                } else {
                    this.mLastError = this.c.e();
                    if (this.c.b() != 401) {
                        this.mHttpDns.b(strName);
                    }
                    Logger.d("WSChannel", "start: connection failed " + this.c);
                    str2 = WifiSetActivity.KEY_CONNECT;
                }
                if (z2) {
                    str = "success";
                } else {
                    str = "failed";
                }
                updateTrack("sdk.connect.result", str);
                trackData = this.mTrackData;
                if (trackData != null) {
                    trackData.finishTrack();
                }
                return z2;
            }
            Logger.d("WSChannel", "startConnect: headers is null");
            str2 = "gettoken";
            updateTrack("sdk.connect.error.step", str2);
        } catch (Exception e) {
            Logger.d("WSChannel", Logger.throwableToString(e));
            this.mHttpDns.b(strName);
            this.c = null;
            updateTrack("sdk.connect.error.msg", e.getMessage());
            updateTrack("sdk.connect.error.step", Constants.EXCEPTION);
        }
        if (z2) {
            str = "success";
        } else {
            str = "failed";
        }
        updateTrack("sdk.connect.result", str);
        trackData = this.mTrackData;
        if (trackData != null) {
            trackData.finishTrack();
        }
        return z2;
    }

    @Override // com.xiaomi.ai.core.a
    public void stop() {
        Logger.b("WSChannel", Command.STOP);
        synchronized (this) {
            com.xiaomi.ai.transport.c cVar = this.c;
            if (cVar != null) {
                cVar.a();
            }
        }
    }

    @Override // com.xiaomi.ai.core.a
    public void switchToWssMode() {
        String str;
        if (this.a) {
            str = "switchToWss: already in wss mode";
        } else {
            this.mListener.a(this, "wss_expire_at", String.valueOf((System.currentTimeMillis() / 1000) + 259200));
            this.a = true;
            this.mHttpDns = new com.xiaomi.ai.transport.b(this, new c(this.mAivsConfig).a());
            str = "switchToWss: done";
        }
        Logger.c("WSChannel", str);
    }
}
