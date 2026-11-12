package defpackage;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.xiaomi.ai.api.Network;
import com.xiaomi.ai.api.Settings;
import com.xiaomi.ai.api.StdStatuses;
import com.xiaomi.ai.api.common.APIUtils;
import com.xiaomi.ai.api.common.Event;
import com.xiaomi.smarthome.library.apache.http.protocol.HTTP;
import com.xiaomi.wearable.hm.BroadcastsKt;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class ses extends gt3 {
    public volatile boolean h;
    public tes i;

    public ses(e01 e01Var, Settings.ClientInfo clientInfo, int i, lt3 lt3Var) {
        super(e01Var, clientInfo, i, lt3Var);
        b();
        this.mHttpDns = this.h ? new c9s(this, new d3s(this.mAivsConfig).o()) : new c9s(this, new d3s(this.mAivsConfig).h());
    }

    public final Map<String, String> a(boolean z) {
        HashMap map = new HashMap();
        String authHeader = this.mAuthProvider.getAuthHeader(z, true, map);
        if (authHeader == null) {
            wpe.e("WSChannel", "getHeaders: failed to getAuthHeader");
            this.mLastError = this.mAuthProvider.getLastError();
            return null;
        }
        map.put("Authorization", authHeader);
        String strI = this.mAivsConfig.i("connection.user_agent");
        if (!yrs.b(strI)) {
            map.put("User-Agent", strI);
        }
        map.put("Heartbeat-Client", String.valueOf(this.mAivsConfig.f("connection.ping_interval", 90)));
        map.put(HTTP.TARGET_HOST, this.mHttpDns.e());
        String strRandomRequestId = APIUtils.randomRequestId(false);
        map.put("Client-Connection-Id", strRandomRequestId);
        wpe.h("WSChannel", "request Headers: clientConnectionId = " + strRandomRequestId);
        if (wpe.l() == 3) {
            wpe.b("WSChannel", "request Headers:\n" + yrs.a(map));
        }
        return map;
    }

    public final void b() {
        if (!this.mAivsConfig.b("connection.enable_lite_crypt")) {
            this.h = true;
            wpe.h("WSChannel", "checkWssMode:use wss by config");
            return;
        }
        String strOnRead = this.mListener.onRead(this, "wss_expire_at");
        if (yrs.b(strOnRead)) {
            this.h = false;
            wpe.k("WSChannel", "checkWssMode:not in wss mode");
        } else if (System.currentTimeMillis() / 1000 <= Long.parseLong(strOnRead)) {
            this.h = true;
            wpe.k("WSChannel", "checkWssMode:in wss mode");
        } else {
            this.h = false;
            this.mListener.onRemove(this, "wss_expire_at");
            wpe.k("WSChannel", "checkWssMode:wss mode expired, try ws mode");
        }
    }

    @Override // defpackage.gt3
    public String getChannelType() {
        return "ws";
    }

    @Override // defpackage.gt3
    public int getErrorCode() {
        tes tesVar = this.i;
        if (tesVar != null) {
            return tesVar.h();
        }
        return 0;
    }

    @Override // defpackage.gt3
    public int getFailureCode() {
        tes tesVar = this.i;
        if (tesVar != null) {
            return tesVar.g();
        }
        return 0;
    }

    @Override // defpackage.gt3
    public int getType() {
        return 0;
    }

    @Override // defpackage.gt3
    public boolean isConnected() {
        tes tesVar = this.i;
        return tesVar != null && tesVar.j();
    }

    @Override // defpackage.gt3
    public boolean postData(byte[] bArr) {
        boolean z;
        synchronized (this) {
            try {
                tes tesVar = this.i;
                z = tesVar != null && tesVar.j() && this.i.f(bArr);
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @Override // defpackage.gt3
    public boolean postEvent(bf8 bf8Var) {
        boolean z;
        synchronized (this) {
            try {
                updateGlobalConfig(bf8Var.a());
                tes tesVar = this.i;
                z = tesVar != null && tesVar.j() && this.i.c(bf8Var.b());
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:30:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:33:0x010a  */
    @Override // defpackage.gt3
    public boolean startConnect(boolean z) {
        String str;
        klp klpVar;
        String str2;
        if (this.mAivsConfig.b("track.enable")) {
            klp klpVar2 = new klp(this.mTrackInfo);
            this.mTrackData = klpVar2;
            this.mListener.onSetTrackData(this, klpVar2);
            updateTrackTimestamp("sdk.connect.start", System.currentTimeMillis());
        }
        String strName = Network.NetworkType.UNKNOWN.name();
        if (this.mClientInfo.getNetwork().c()) {
            strName = this.mClientInfo.getNetwork().b().name();
        }
        boolean z2 = false;
        try {
            Map<String, String> mapA = a(z);
            if (mapA != null) {
                if (this.i != null) {
                    wpe.k("WSChannel", "close mWsClient " + this.i);
                    this.i.a();
                } else {
                    wpe.k("WSChannel", "reset mWsClient");
                }
                tes tesVar = new tes(this);
                this.i = tesVar;
                if (tesVar.d(this.mHttpDns.k(strName), mapA)) {
                    this.mLastError = null;
                    z2 = true;
                    wpe.b("WSChannel", "startConnect success " + this.i);
                } else {
                    this.mLastError = this.i.i();
                    if (this.i.h() != 401) {
                        this.mHttpDns.g(strName);
                    }
                    wpe.e("WSChannel", "start: connection failed " + this.i);
                    str2 = "connect";
                }
                if (z2) {
                    str = "success";
                } else {
                    str = "failed";
                }
                updateTrack("sdk.connect.result", str);
                klpVar = this.mTrackData;
                if (klpVar != null) {
                    klpVar.b();
                }
                return z2;
            }
            wpe.e("WSChannel", "startConnect: headers is null");
            str2 = "gettoken";
            updateTrack("sdk.connect.error.step", str2);
        } catch (Exception e) {
            wpe.e("WSChannel", wpe.o(e));
            this.mHttpDns.g(strName);
            this.i = null;
            updateTrack("sdk.connect.error.msg", e.getMessage());
            updateTrack("sdk.connect.error.step", "exception");
        }
        if (z2) {
            str = "success";
        } else {
            str = "failed";
        }
        updateTrack("sdk.connect.result", str);
        klpVar = this.mTrackData;
        if (klpVar != null) {
            klpVar.b();
        }
        return z2;
    }

    @Override // defpackage.gt3
    public void stop() {
        wpe.h("WSChannel", BroadcastsKt.SILENT_PUSHING_STOP);
        synchronized (this) {
            try {
                tes tesVar = this.i;
                if (tesVar != null) {
                    tesVar.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.gt3
    public void switchToWssMode() {
        String str;
        if (this.h) {
            str = "switchToWss: already in wss mode";
        } else {
            this.mListener.onWrite(this, "wss_expire_at", String.valueOf((System.currentTimeMillis() / 1000) + 259200));
            this.h = true;
            this.mHttpDns = new c9s(this, new d3s(this.mAivsConfig).o());
            str = "switchToWss: done";
        }
        wpe.k("WSChannel", str);
    }

    public ses(e01 e01Var, Settings.ClientInfo clientInfo, tq1 tq1Var, lt3 lt3Var) {
        super(e01Var, clientInfo, tq1Var, lt3Var);
        b();
        this.mHttpDns = this.h ? new c9s(this, new d3s(this.mAivsConfig).o()) : new c9s(this, new d3s(this.mAivsConfig).h());
    }

    @Override // defpackage.gt3
    public boolean postData(byte[] bArr, int i, int i2) {
        synchronized (this) {
            try {
                tes tesVar = this.i;
                if (tesVar == null || !tesVar.j()) {
                    wpe.e("WSChannel", "postData: channel was not started");
                    return false;
                }
                byte[] bArr2 = new byte[i2];
                System.arraycopy(bArr, i, bArr2, 0, i2);
                return this.i.f(bArr2);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.gt3
    public boolean postEvent(Event event) {
        wpe.h("WSChannel", "send: " + event.getFullName() + "," + event.getId());
        try {
            return postEvent(new bf8(event, event.toJsonString()));
        } catch (JsonProcessingException unused) {
            wpe.e("WSChannel", "send: event failed, required field not set");
            getListener().onError(this, new f01(StdStatuses.MISSING_PARAMETER, "required field not set"));
            return false;
        }
    }
}
