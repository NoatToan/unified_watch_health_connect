package com.xiaomi.ai.android.core;

import android.app.ActivityManager;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.HandlerThread;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.google.android.material.timepicker.TimeModel;
import com.xiaomi.account.openauth.XiaomiOAuthConstants;
import com.xiaomi.ai.android.capability.AuthCapability;
import com.xiaomi.ai.android.capability.Capability;
import com.xiaomi.ai.android.capability.ConnectionCapability;
import com.xiaomi.ai.android.capability.ErrorCapability;
import com.xiaomi.ai.android.capability.InstructionCapability;
import com.xiaomi.ai.android.capability.MIXEngineCapability;
import com.xiaomi.ai.android.capability.ResourceCapability;
import com.xiaomi.ai.android.capability.SpeechSynthesizerCapability;
import com.xiaomi.ai.android.capability.StorageCapability;
import com.xiaomi.ai.android.capability.TrackCapability;
import com.xiaomi.ai.android.utils.DeviceUtils;
import com.xiaomi.ai.android.utils.NetworkUtils;
import com.xiaomi.ai.api.AIApiConstants;
import com.xiaomi.ai.api.Settings;
import com.xiaomi.ai.api.StdStatuses;
import com.xiaomi.ai.api.common.Event;
import com.xiaomi.ai.core.XMDChannel;
import com.xiaomi.ai.local.interfaces.LocalExecutor;
import com.xiaomi.common.Optional;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.login.region.RegionManagerImpl;
import com.xiaomi.fitness.statistics.StatConstants;
import defpackage.bf8;
import defpackage.bqe;
import defpackage.c4h;
import defpackage.e01;
import defpackage.e3s;
import defpackage.f01;
import defpackage.gt3;
import defpackage.ses;
import defpackage.wpe;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class e extends Engine {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private e01 f10887a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private g f10888b;
    private f c;
    private a d;
    private gt3 e;
    private Map<Class<?>, Capability> f;
    private d g;
    private l h;
    private HandlerThread i;
    private HandlerThread j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Context f10889k;
    private int l;
    private i m;
    private b n;
    private Settings.ClientInfo o;
    private k p;
    private c q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private NetworkUtils.a f10890r;
    private volatile boolean s;
    private boolean t;
    private j u;
    private com.xiaomi.ai.android.b.b v;

    public e(Context context, e01 e01Var, Settings.ClientInfo clientInfo, int i) {
        this(context, e01Var, clientInfo, i, null);
    }

    private int b() {
        long j;
        String strOnRead = this.d.onRead(this.e, "xmd_ws_expire_at");
        if (TextUtils.isEmpty(strOnRead)) {
            return 1;
        }
        try {
            j = Long.parseLong(strOnRead);
        } catch (NumberFormatException e) {
            wpe.e("EngineImpl", Log.getStackTraceString(e));
            j = 0;
        }
        if (j - (System.currentTimeMillis() / 1000) >= 0) {
            wpe.k("EngineImpl", "checkWSDateInXMD: use websocket channel in xmd mode");
            this.f10887a.l("connection.enable_lite_crypt", false);
            return 0;
        }
        wpe.h("EngineImpl", "checkWSDateInXMD: clear wss expire time in xmd mode");
        this.d.onRemove(this.e, "xmd_ws_expire_at");
        this.f10887a.l("connection.enable_lite_crypt", true);
        return 1;
    }

    private void u() {
        Settings.ClientInfo clientInfo = this.o;
        wpe.k("EngineImpl", String.format(Locale.US, "versionName=%s, versionCode=%d, engineId=%s,GIT_COMMIT=%s, spec version=%s", "1.45.29", 20230207, (clientInfo == null || !clientInfo.getEngineId().c()) ? " " : this.o.getEngineId().b(), "799bbeb5", "0.0.618"));
    }

    private void v() {
        if (this.h.hasMessages(3)) {
            return;
        }
        wpe.b("EngineImpl", "start wait net, time out " + this.f10887a.e("connection.net_available_wait_time"));
        this.h.sendMessageDelayed(this.h.obtainMessage(3), (long) this.f10887a.e("connection.net_available_wait_time"));
    }

    public Capability a(Class<?> cls) {
        return this.f.get(cls);
    }

    public String c() {
        if (this.l == 1 && this.f10887a.b("auth.oauth.upload_miot_did")) {
            Optional<String> deviceId = this.o.getDeviceId();
            Optional<String> miotDid = this.o.getMiotDid();
            if (miotDid.c()) {
                String strA = e3s.a(deviceId.b() + RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR + miotDid.b());
                StringBuilder sb = new StringBuilder();
                sb.append(strA);
                sb.append(RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR);
                String string = sb.toString();
                wpe.b("EngineImpl", "getAuthPrefix upload miot did. prefix is " + string);
                return string;
            }
        }
        return "";
    }

    @Override // com.xiaomi.ai.android.core.Engine
    public void clearUserData() {
        wpe.e("EngineImpl", "clearUserData");
        com.xiaomi.ai.android.track.f.a().a(this.f10889k, "aivs_user_data.xml", this.f10887a.b("LimitedDiskCache.enable"));
    }

    public int d() {
        return this.l;
    }

    public gt3 e() {
        return this.e;
    }

    public a f() {
        return this.d;
    }

    @Override // com.xiaomi.ai.android.core.Engine
    public void finishTrace() {
        c4h c4hVarA = this.u.a();
        if (c4hVarA != null) {
            a(c4hVarA);
        } else {
            wpe.h("EngineImpl", "node is null");
        }
    }

    public int g() {
        int iF = this.f10887a.f("connection.channel_type", -1);
        if (iF != -1) {
            return iF == 1 ? b() : iF;
        }
        if (this.f10887a.b("connection.mix_engine")) {
            wpe.h("EngineImpl", "getChannelType: mix engine");
            boolean zA = a();
            MIXEngineCapability mIXEngineCapability = (MIXEngineCapability) a(MIXEngineCapability.class);
            if (zA) {
                if (mIXEngineCapability == null) {
                    return 3;
                }
                mIXEngineCapability.onInitMIXEngine(MIXEngineCapability.EngineLink.OFFLINE);
                return 3;
            }
            if (mIXEngineCapability != null) {
                mIXEngineCapability.onInitMIXEngine(MIXEngineCapability.EngineLink.ONLINE);
            }
        }
        return o();
    }

    @Override // com.xiaomi.ai.android.core.Engine
    public String getAccessToken() {
        StorageCapability storageCapability = (StorageCapability) a(StorageCapability.class);
        if (storageCapability != null) {
            return storageCapability.readKeyValue(XiaomiOAuthConstants.EXTRA_ACCESS_TOKEN_2);
        }
        return null;
    }

    @Override // com.xiaomi.ai.android.core.Engine
    public String getAuthorization() {
        String str;
        wpe.h("EngineImpl", "getAuthorization ");
        gt3 gt3Var = this.e;
        if (gt3Var == null || gt3Var.getAuthProvider() == null) {
            str = "getAuthorization: AuthProvider not set";
        } else {
            String authHeader = this.e.getAuthProvider().getAuthHeader(false, false, null);
            if (!TextUtils.isEmpty(authHeader)) {
                return authHeader;
            }
            str = "getAuthorization: failed to getAuthHeader";
        }
        wpe.e("EngineImpl", str);
        return null;
    }

    @Override // com.xiaomi.ai.android.core.Engine
    public long getExpireAt() {
        StorageCapability storageCapability = (StorageCapability) a(StorageCapability.class);
        if (storageCapability == null) {
            return -1L;
        }
        String keyValue = storageCapability.readKeyValue("expire_at");
        if (TextUtils.isEmpty(keyValue)) {
            return -1L;
        }
        try {
            return Long.parseLong(keyValue) * 1000;
        } catch (Exception e) {
            wpe.e("EngineImpl", wpe.o(e));
            return -1L;
        }
    }

    @Override // com.xiaomi.ai.android.core.Engine
    public int getSDKVersion() {
        return this.d.onGetSDKVersion(this.e);
    }

    public Settings.ClientInfo h() {
        return this.o;
    }

    public e01 i() {
        return this.f10887a;
    }

    @Override // com.xiaomi.ai.android.core.Engine
    public void interrupt() {
        if (this.s) {
            wpe.e("EngineImpl", "interrupt error,engine has been released");
            return;
        }
        wpe.h("EngineImpl", "interrupt");
        this.h.d();
        this.g.removeCallbacksAndMessages(null);
        this.c.b();
        this.f10888b.b();
        this.m.b();
    }

    public Context j() {
        return this.f10889k;
    }

    public d k() {
        return this.g;
    }

    public com.xiaomi.ai.android.b.b l() {
        return this.v;
    }

    public f m() {
        return this.c;
    }

    public g n() {
        return this.f10888b;
    }

    public int o() {
        int iF = this.f10887a.f("connection.default_channel_type", 0);
        String strA = com.xiaomi.ai.android.utils.d.a(this.f10889k, "aivs_cloud_control", "link_mode");
        if (TextUtils.isEmpty(strA)) {
            strA = this.d.onRead(this.e, "link_mode");
        }
        if (TextUtils.isEmpty(strA)) {
            wpe.h("EngineImpl", "use default: " + iF);
            return iF;
        }
        wpe.h("EngineImpl", "use cloud control link mode " + strA);
        if ("ws-wss".equals(strA)) {
            this.f10887a.l("connection.enable_lite_crypt", true);
        } else if ("wss".equals(strA)) {
            this.f10887a.l("connection.enable_lite_crypt", false);
            wpe.h("EngineImpl", "use wss link mode");
        } else if ("xmd".equals(strA) || iF != 0) {
            return b();
        }
        return 0;
    }

    public b p() {
        return this.n;
    }

    @Override // com.xiaomi.ai.android.core.Engine
    public boolean postData(byte[] bArr, int i, int i2, boolean z) {
        wpe.h("EngineImpl", "postData: offset=" + i + ", length=" + i2 + ", eof=" + z);
        if (i2 > 65536) {
            wpe.e("EngineImpl", "postData: Max frame length has been exceeded");
            return false;
        }
        if (this.e == null || this.h == null) {
            wpe.e("EngineImpl", "postData: already released or disconnected");
            a(new f01(StdStatuses.CONNECT_FAILED, "postData: already released or disconnected"));
            return false;
        }
        Bundle bundle = new Bundle();
        if (bArr != null && i >= 0 && i2 > 0) {
            byte[] bArr2 = new byte[i2];
            System.arraycopy(bArr, i, bArr2, 0, i2);
            bundle.putByteArray("data", bArr2);
        }
        bundle.putBoolean("eof", z);
        bundle.putBoolean("raw", false);
        Message messageObtainMessage = this.h.obtainMessage(1);
        messageObtainMessage.setData(bundle);
        this.p.b(this.c.a(), z);
        this.h.a(messageObtainMessage);
        return true;
    }

    @Override // com.xiaomi.ai.android.core.Engine
    public boolean postEvent(bf8 bf8Var) {
        gt3 gt3Var;
        if (bf8Var == null) {
            wpe.e("EngineImpl", "postEvent:EventWrapper is null");
            return false;
        }
        Event<?> eventA = bf8Var.a();
        if (wpe.l() == 3) {
            wpe.b("EngineImpl", "postEvent: event " + bf8Var.b());
        } else {
            wpe.h("EngineImpl", "postEvent: event: " + eventA.getFullName() + "," + eventA.getId());
        }
        if (this.e == null || this.h == null) {
            wpe.e("EngineImpl", "postEvent: already released or disconnected");
            a(new f01(StdStatuses.CONNECT_FAILED, "postEvent: already released or disconnected", eventA.getId()));
            return false;
        }
        if (this.f10887a.b("connection.enable_client_ping") && (gt3Var = this.e) != null && !gt3Var.isConnected() && AIApiConstants.System.ClientPing.equals(eventA.getFullName())) {
            this.n.a();
            return false;
        }
        this.p.b(eventA);
        this.c.c(eventA);
        l lVar = this.h;
        lVar.a(lVar.obtainMessage(0, bf8Var));
        gt3 gt3Var2 = this.e;
        if (gt3Var2 != null && !gt3Var2.isConnected()) {
            u();
            if (!this.d.a()) {
                int iG = g();
                int type = this.e.getType();
                wpe.h("EngineImpl", "currentChannelType =" + type + ", nextChannelType=" + iG);
                if (iG != type) {
                    a(iG, true);
                }
            }
            if (this.e.getType() == 3 || NetworkUtils.isNetworkAvailable(this.f10889k)) {
                this.d.a(false);
            } else {
                v();
            }
        }
        return true;
    }

    @Override // com.xiaomi.ai.android.core.Engine
    public boolean postRawData(byte[] bArr, int i, int i2) {
        wpe.b("EngineImpl", "postRawData: offset=" + i + ", length=" + i2);
        if (i2 > 65536) {
            wpe.e("EngineImpl", "postRawData: Max frame length has been exceeded");
            return false;
        }
        if (this.e == null || this.h == null) {
            wpe.e("EngineImpl", "postRawData: already released or disconnected");
            a(new f01(StdStatuses.CONNECT_FAILED, "postRawData: already released or disconnected"));
            return false;
        }
        Bundle bundle = new Bundle();
        if (bArr != null && i >= 0 && i2 > 0) {
            byte[] bArr2 = new byte[i2];
            System.arraycopy(bArr, i, bArr2, 0, i2);
            bundle.putByteArray("data", bArr2);
        }
        bundle.putBoolean("raw", true);
        Message messageObtainMessage = this.h.obtainMessage(1);
        messageObtainMessage.setData(bundle);
        this.p.b(this.c.a(), false);
        this.h.a(messageObtainMessage);
        return true;
    }

    public i q() {
        return this.m;
    }

    public k r() {
        return this.p;
    }

    @Override // com.xiaomi.ai.android.core.Engine
    public boolean registerCapability(Capability capability) {
        Map<Class<?>, Capability> map;
        Class<?> cls;
        if (capability instanceof AuthCapability) {
            map = this.f;
            cls = AuthCapability.class;
        } else if (capability instanceof ConnectionCapability) {
            map = this.f;
            cls = ConnectionCapability.class;
        } else if (capability instanceof ErrorCapability) {
            map = this.f;
            cls = ErrorCapability.class;
        } else if (capability instanceof InstructionCapability) {
            map = this.f;
            cls = InstructionCapability.class;
        } else if (capability instanceof SpeechSynthesizerCapability) {
            map = this.f;
            cls = SpeechSynthesizerCapability.class;
        } else if (capability instanceof StorageCapability) {
            map = this.f;
            cls = StorageCapability.class;
        } else if (capability instanceof TrackCapability) {
            map = this.f;
            cls = TrackCapability.class;
        } else if (capability instanceof ResourceCapability) {
            map = this.f;
            cls = ResourceCapability.class;
        } else {
            if (!(capability instanceof MIXEngineCapability)) {
                wpe.e("EngineImpl", "registerCapability: unknown Capability " + capability);
                return false;
            }
            map = this.f;
            cls = MIXEngineCapability.class;
        }
        map.put(cls, capability);
        return true;
    }

    @Override // com.xiaomi.ai.android.core.Engine
    public void release() {
        wpe.h("EngineImpl", "release start");
        this.s = true;
        this.q.h();
        NetworkUtils.a aVar = this.f10890r;
        if (aVar != null) {
            this.f10889k.unregisterReceiver(aVar);
            this.f10890r = null;
        }
        this.h.d();
        this.j.quit();
        try {
            this.j.join();
        } catch (InterruptedException e) {
            wpe.e("EngineImpl", wpe.o(e));
        }
        gt3 gt3Var = this.e;
        if (gt3Var != null) {
            gt3Var.stop();
            this.e = null;
        }
        this.g.removeCallbacksAndMessages(null);
        this.i.quit();
        try {
            this.i.join();
        } catch (InterruptedException e2) {
            wpe.e("EngineImpl", wpe.o(e2));
        }
        this.c.c();
        this.d.b();
        this.f10888b.d();
        this.m.c();
        if (this.f10887a.b("connection.enable_client_ping")) {
            this.n.a();
        }
        this.p.g();
        wpe.h("EngineImpl", "release end");
    }

    @Override // com.xiaomi.ai.android.core.Engine
    public String requestAuthorization() {
        String str;
        wpe.h("EngineImpl", "requestAuthorization: start");
        if (this.s) {
            str = "requestAuthorization error,engine has been released";
        } else {
            gt3 gt3Var = this.e;
            if (gt3Var == null || gt3Var.getAuthProvider() == null) {
                str = "forceRefreshAuthorization: AuthProvider not set";
            } else {
                String authHeader = this.e.getAuthProvider().getAuthHeader(true, false, null);
                if (!TextUtils.isEmpty(authHeader)) {
                    wpe.h("EngineImpl", "requestAuthorization: end");
                    return authHeader;
                }
                str = "forceRefreshAuthorization: failed to getAuthHeader";
            }
        }
        wpe.e("EngineImpl", str);
        return null;
    }

    @Override // com.xiaomi.ai.android.core.Engine
    public void reset() {
        if (this.e.getType() == 1) {
            ((XMDChannel) this.e).reset();
        }
    }

    @Override // com.xiaomi.ai.android.core.Engine
    public void restart() {
        if (this.s) {
            wpe.e("EngineImpl", "restart error,engine has been released");
            return;
        }
        wpe.h("EngineImpl", "restart");
        this.h.d();
        this.g.removeCallbacksAndMessages(null);
        this.c.c();
        this.f10888b.b();
        this.m.c();
        gt3 gt3Var = this.e;
        if (gt3Var != null) {
            gt3Var.stop();
            this.d.a(true);
        }
    }

    public l s() {
        return this.h;
    }

    @Override // com.xiaomi.ai.android.core.Engine
    public boolean setAuthorizationTokens(String str, String str2, long j) {
        StorageCapability storageCapability = (StorageCapability) a(StorageCapability.class);
        if (storageCapability == null) {
            return false;
        }
        storageCapability.writeKeyValue(XiaomiOAuthConstants.EXTRA_ACCESS_TOKEN_2, str);
        storageCapability.writeKeyValue("refresh_token", str2);
        storageCapability.writeKeyValue("expire_at", String.format(TimeModel.NUMBER_FORMAT, Long.valueOf((System.currentTimeMillis() / 1000) + j)));
        return true;
    }

    @Override // com.xiaomi.ai.android.core.Engine
    public void setLocalExecutor(LocalExecutor localExecutor) {
        this.v = new com.xiaomi.ai.android.b.b(this, localExecutor);
    }

    @Override // com.xiaomi.ai.android.core.Engine
    public void setLoggerHooker(bqe bqeVar) {
        wpe.m(bqeVar);
    }

    @Override // com.xiaomi.ai.android.core.Engine
    public synchronized boolean start() {
        wpe.h("EngineImpl", StatConstants.PARAM_START);
        if (this.s) {
            wpe.e("EngineImpl", "start error ,engine has been released");
            return false;
        }
        this.q.i();
        this.c.c();
        this.h.d();
        this.g.removeCallbacksAndMessages(null);
        this.e.stop();
        if (this.f10887a.b("track.enable")) {
            this.e.setTrackInfo(this.p.a());
        }
        this.p.b(true);
        if (this.e.getType() == 3 || NetworkUtils.isNetworkAvailable(this.f10889k)) {
            this.d.a(false);
        } else {
            v();
        }
        return true;
    }

    @Override // com.xiaomi.ai.android.core.Engine
    public void startTrace() {
        this.u.b();
    }

    public boolean t() {
        return this.t;
    }

    @Override // com.xiaomi.ai.android.core.Engine
    public void traceRequestId(String str) {
        this.u.a(str);
    }

    @Override // com.xiaomi.ai.android.core.Engine
    public void traceResult(String str, int i) {
        this.u.a(str, i);
    }

    @Override // com.xiaomi.ai.android.core.Engine
    public void traceTimeStamps(String str) {
        this.u.b(str);
    }

    @Override // com.xiaomi.ai.android.core.Engine
    public void updateAppData(JSONObject jSONObject) {
        if (jSONObject == null) {
            wpe.e("EngineImpl", "updateAppData: data is null");
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("updateAppData: ");
        sb.append(jSONObject);
        wpe.b("EngineImpl", sb.toString() == null ? null : jSONObject.toString());
        gt3 gt3Var = this.e;
        if (gt3Var == null || gt3Var.getType() != 3) {
            wpe.h("EngineImpl", "updateAppData: not update");
        } else {
            ((h) this.e).b(1, jSONObject.toString());
        }
    }

    @Override // com.xiaomi.ai.android.core.Engine
    public void updateContactData(JSONObject jSONObject) {
        if (jSONObject == null) {
            wpe.e("EngineImpl", "updateContactData: data is null");
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("updateContactData: ");
        sb.append(jSONObject);
        wpe.b("EngineImpl", sb.toString() == null ? null : jSONObject.toString());
        gt3 gt3Var = this.e;
        if (gt3Var == null || gt3Var.getType() != 3) {
            wpe.h("EngineImpl", "updateContactData: not update");
        } else {
            ((h) this.e).b(2, jSONObject.toString());
        }
    }

    @Override // com.xiaomi.ai.android.core.Engine
    public void updateIotData(JSONObject jSONObject) {
        if (jSONObject == null) {
            wpe.e("EngineImpl", "updateIotData: data is null");
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("updateIotData: ");
        sb.append(jSONObject);
        wpe.b("EngineImpl", sb.toString() == null ? null : jSONObject.toString());
        gt3 gt3Var = this.e;
        if (gt3Var == null || gt3Var.getType() != 3) {
            wpe.h("EngineImpl", "updateIotData: not update");
        } else {
            ((h) this.e).b(5, jSONObject.toString());
        }
    }

    @Override // com.xiaomi.ai.android.core.Engine
    public void updateSkillData(JSONObject jSONObject) {
        if (jSONObject == null) {
            wpe.e("EngineImpl", "updateSkillData: data is null");
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("updateSkillData: ");
        sb.append(jSONObject);
        wpe.b("EngineImpl", sb.toString() == null ? null : jSONObject.toString());
        gt3 gt3Var = this.e;
        if (gt3Var == null || gt3Var.getType() != 3) {
            wpe.h("EngineImpl", "updateSkillData: not update");
        } else {
            ((h) this.e).b(3, jSONObject.toString());
        }
    }

    @Override // com.xiaomi.ai.android.core.Engine
    public void updateTopContactData(JSONObject jSONObject) {
        if (jSONObject == null) {
            wpe.e("EngineImpl", "updateContactData: data is null");
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("updateTopContactData: ");
        sb.append(jSONObject);
        wpe.b("EngineImpl", sb.toString() == null ? null : jSONObject.toString());
        gt3 gt3Var = this.e;
        if (gt3Var == null || gt3Var.getType() != 3) {
            wpe.h("EngineImpl", "updateContactData: not update");
        } else {
            ((h) this.e).b(4, jSONObject.toString());
        }
    }

    @Override // com.xiaomi.ai.android.core.Engine
    public void uploadLogError(String str, String str2) {
        wpe.d(str, str2, true, false);
    }

    @Override // com.xiaomi.ai.android.core.Engine
    public void uploadLogInfo(String str, String str2) {
        wpe.g(str, str2, true, false);
    }

    @Override // com.xiaomi.ai.android.core.Engine
    public void uploadLogWarn(String str, String str2) {
        wpe.j(str, str2, true, false);
    }

    public e(Context context, e01 e01Var, Settings.ClientInfo clientInfo, int i, bqe bqeVar) {
        this(context, e01Var, clientInfo, i, bqeVar, null);
    }

    private Settings.ClientInfo a(Settings.ClientInfo clientInfo) {
        StringBuilder sb;
        String str;
        if (this.f10887a == null) {
            wpe.e("EngineImpl", "rebuildClientInfo: mConfig is null");
            return null;
        }
        if (clientInfo == null) {
            clientInfo = new Settings.ClientInfo();
        }
        if (!clientInfo.getTimeZone().c()) {
            clientInfo.setTimeZone(TimeZone.getDefault().getID());
        }
        if (!clientInfo.getNetwork().c()) {
            clientInfo.setNetwork(NetworkUtils.getBriefNetworkType(this.f10889k));
        }
        if (!this.f10887a.b("auth.support_multiply_client_id")) {
            clientInfo.setDeviceId(DeviceUtils.getDeviceId(this.f10889k));
            sb = new StringBuilder();
            str = "device id set by sdk ";
        } else {
            if (!clientInfo.getDeviceId().c()) {
                wpe.e("EngineImpl", "error: device id not set!!!");
                throw new IllegalArgumentException("device id not set!!!");
            }
            sb = new StringBuilder();
            str = "device id set by client ";
        }
        sb.append(str);
        sb.append(clientInfo.getDeviceId().b());
        wpe.b("EngineImpl", sb.toString());
        wpe.b("EngineImpl", "deviceId:" + clientInfo.getDeviceId().b());
        return clientInfo;
    }

    @Override // com.xiaomi.ai.android.core.Engine
    public void interrupt(boolean z) {
        if (this.s) {
            wpe.e("EngineImpl", "interrupt error,engine has been released");
            return;
        }
        if (z) {
            wpe.h("EngineImpl", "interrupt and reset");
            reset();
        }
        interrupt();
    }

    @Override // com.xiaomi.ai.android.core.Engine
    public boolean postData(byte[] bArr, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("postData: length=");
        sb.append(bArr != null ? bArr.length : 0);
        sb.append(", eof=");
        sb.append(z);
        wpe.h("EngineImpl", sb.toString());
        if (bArr != null && bArr.length > 65536) {
            wpe.e("EngineImpl", "postData: Max frame length has been exceeded");
            return false;
        }
        if (this.e == null || this.h == null) {
            wpe.e("EngineImpl", "postData: already released or disconnected");
            a(new f01(StdStatuses.CONNECT_FAILED, "postData: already released or disconnected"));
            return false;
        }
        Bundle bundle = new Bundle();
        bundle.putByteArray("data", bArr);
        bundle.putBoolean("eof", z);
        bundle.putBoolean("raw", false);
        Message messageObtainMessage = this.h.obtainMessage(1);
        messageObtainMessage.setData(bundle);
        this.p.b(this.c.a(), z);
        this.h.a(messageObtainMessage);
        return true;
    }

    @Override // com.xiaomi.ai.android.core.Engine
    public boolean postEvent(Event event) {
        String str;
        if (event == null) {
            str = "postEvent:event is null";
        } else {
            try {
                return postEvent(new bf8(event, event.toJsonString()));
            } catch (JsonProcessingException e) {
                a(new f01(StdStatuses.MISSING_PARAMETER, "required field not set", event.getId()));
                wpe.e("EngineImpl", Log.getStackTraceString(e));
                str = "postEvent: event failed, required field not set";
            }
        }
        wpe.e("EngineImpl", str);
        return false;
    }

    @Override // com.xiaomi.ai.android.core.Engine
    public void traceResult(String str, String str2) {
        this.u.a(str, str2);
    }

    @Override // com.xiaomi.ai.android.core.Engine
    public void traceTimeStamps(String str, long j) {
        this.u.b(str, j);
    }

    public e(Context context, e01 e01Var, Settings.ClientInfo clientInfo, int i, bqe bqeVar, Capability capability) {
        this.s = false;
        this.t = false;
        this.f10887a = e01Var;
        this.f10889k = context.getApplicationContext();
        this.l = i;
        a(clientInfo, bqeVar, capability);
        u();
    }

    public void a(int i, boolean z) {
        gt3 hVar;
        wpe.h("EngineImpl", "changeChannel: channelType=" + i + ", isNeedTrackInfo=" + z);
        gt3 gt3Var = this.e;
        if (gt3Var != null) {
            gt3Var.stop();
        }
        if (z) {
            this.p.b(false);
        }
        int i2 = this.l;
        if (i2 == 5 || i2 == 6) {
            com.xiaomi.ai.android.a.a.a aVar = new com.xiaomi.ai.android.a.a.a(this, i2);
            if (i == 1) {
                hVar = new XMDChannel(this.f10887a, this.o, aVar, this.d);
            } else {
                hVar = i == 3 ? new h(this.f10889k, this.f10887a, this.o, aVar, this.d, this) : new ses(this.f10887a, this.o, aVar, this.d);
            }
            aVar.setChannel(hVar);
        } else if (i == 1) {
            hVar = new XMDChannel(this.f10887a, this.o, i2, this.d);
        } else {
            hVar = i == 3 ? new h(this.f10889k, this.f10887a, this.o, i2, this.d, this) : new ses(this.f10887a, this.o, i2, this.d);
        }
        hVar.setAuthType(this.l);
        this.e = hVar;
        if (z && this.f10887a.b("track.enable")) {
            this.p.f();
            hVar.setTrackInfo(this.p.a());
        }
    }

    public void a(f01 f01Var) {
        ErrorCapability errorCapability = (ErrorCapability) a(ErrorCapability.class);
        if (errorCapability != null) {
            errorCapability.onError(f01Var);
        }
        wpe.e("EngineImpl", "Error:" + f01Var.c() + ":" + f01Var.b());
    }

    private void a(MIXEngineCapability mIXEngineCapability, int i) {
        String str;
        switch (i) {
            case 1:
                str = MIXEngineCapability.XAEE_SPEECH_ASR_INIT_ERROR;
                break;
            case 2:
                str = MIXEngineCapability.XAEE_SPEECH_ASR_RELOAD_ERROR;
                break;
            case 3:
                str = MIXEngineCapability.XAEE_SPEECH_EOS_INIT_ERROR;
                break;
            case 4:
                str = MIXEngineCapability.XAEE_SPEECH_REJECT_INIT_ERROR;
                break;
            case 5:
                str = MIXEngineCapability.XAEE_SPEECH_NLP_INIT_ERROR;
                break;
            case 6:
                str = MIXEngineCapability.XAEE_SPEECH_TTS_INIT_ERROR;
                break;
            default:
                str = MIXEngineCapability.XAEE_SPEECH_OTHER_ERROR;
                break;
        }
        wpe.h("EngineImpl", "showErrorMessageByCode: speech failed code:" + i + ", error:" + str);
        mIXEngineCapability.onConnectOfflineError(str);
    }

    private void a(Settings.ClientInfo clientInfo, bqe bqeVar, Capability capability) {
        boolean zA;
        MIXEngineCapability.EngineLink engineLink;
        if (bqeVar == null) {
            bqeVar = new com.xiaomi.ai.android.c.a();
        }
        wpe.m(bqeVar);
        this.f = new HashMap();
        if (capability != null) {
            registerCapability(capability);
        }
        if (this.f10887a.b("connection.mix_engine") && this.f10887a.f("connection.channel_type", -1) == -1) {
            wpe.h("EngineImpl", "getChannelType: mix engine check offline");
            zA = a();
            MIXEngineCapability mIXEngineCapability = (MIXEngineCapability) a(MIXEngineCapability.class);
            if (zA) {
                if (mIXEngineCapability != null) {
                    engineLink = MIXEngineCapability.EngineLink.OFFLINE;
                    mIXEngineCapability.onInitMIXEngine(engineLink);
                }
            } else if (mIXEngineCapability != null) {
                engineLink = MIXEngineCapability.EngineLink.ONLINE;
                mIXEngineCapability.onInitMIXEngine(engineLink);
            }
        } else {
            zA = false;
        }
        this.o = a(clientInfo);
        registerCapability(new com.xiaomi.ai.android.impl.b(this, this.l, this.f10887a.e("aivs.env")));
        registerCapability(new com.xiaomi.ai.android.impl.c(this));
        if (this.f10887a.b("LimitedDiskCache.enable")) {
            com.xiaomi.ai.android.track.f.a().a(this.f10887a.e("LimitedDiskCache.max_disk_save_times"));
        }
        this.u = new j();
        this.c = new f(this);
        this.f10888b = new g(this);
        this.d = new a(this);
        HandlerThread handlerThread = new HandlerThread("DownloadThread");
        this.i = handlerThread;
        handlerThread.start();
        this.g = new d(this, this.i.getLooper());
        HandlerThread handlerThread2 = new HandlerThread("UploadThread");
        this.j = handlerThread2;
        handlerThread2.start();
        this.h = new l(this, this.j.getLooper());
        a(zA);
        this.p = new k(this);
        this.m = new i(this);
        this.q = new c(this);
        if (this.f10887a.b("connection.enable_client_ping")) {
            this.n = new b(this);
        }
        NetworkUtils.a aVar = new NetworkUtils.a(this);
        this.f10890r = aVar;
        this.f10889k.registerReceiver(aVar, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    private void a(boolean z) {
        int iF = this.f10887a.f("connection.channel_type", -1);
        if (iF == -1) {
            iF = z ? 3 : o();
        } else if (iF == 1) {
            iF = b();
        }
        a(iF, false);
    }

    private boolean a() {
        String[] strArrSplit;
        this.t = false;
        MIXEngineCapability mIXEngineCapability = (MIXEngineCapability) a(MIXEngineCapability.class);
        if (mIXEngineCapability == null) {
            wpe.h("EngineImpl", "checkOffline: MIXEngineCapability is null");
            return false;
        }
        if (!mIXEngineCapability.isDeviceMemorySupported()) {
            wpe.h("EngineImpl", "checkOffline: device memory unsupported");
            mIXEngineCapability.onXaeeNotExist(MIXEngineCapability.XAEE_MEMORY_UNSUPPORTED);
            return false;
        }
        String strI = this.f10887a.i("connection.offline_service_package");
        if (TextUtils.isEmpty(strI)) {
            wpe.h("EngineImpl", "checkOffline: servicePackage is null");
            mIXEngineCapability.onXaeeNotExist(MIXEngineCapability.XAEE_SERVICE_PKG_EMPTY);
            return false;
        }
        if (!com.xiaomi.ai.android.utils.c.c(j(), strI)) {
            wpe.h("EngineImpl", "checkOffline: servicePackage is not installed");
            mIXEngineCapability.onXaeeNotExist(MIXEngineCapability.XAEE_NOT_INSTALLED);
            return false;
        }
        if (com.xiaomi.ai.android.utils.c.b(j(), strI) <= mIXEngineCapability.onGetMockXaeeVersion()) {
            wpe.h("EngineImpl", "checkOffline: version is mock");
            mIXEngineCapability.onXaeeNotExist(MIXEngineCapability.XAEE_MOCK_VERSION);
            return false;
        }
        this.t = true;
        try {
            int i = android.provider.Settings.Global.getInt(this.f10889k.getContentResolver(), "model_ready");
            wpe.b("EngineImpl", "checkOffline: xaee model is " + i);
            if (i != 1) {
                wpe.h("EngineImpl", "checkOffline: xaee model is disable");
                mIXEngineCapability.onConnectOfflineError(MIXEngineCapability.XAEE_MODEL_INVALID);
                return false;
            }
            String string = android.provider.Settings.Global.getString(this.f10889k.getContentResolver(), "speech_capability");
            wpe.b("EngineImpl", "checkOffline: capability offlineVersion: " + string);
            if (!TextUtils.isEmpty(string) && (strArrSplit = string.split(":")) != null && strArrSplit.length == 2) {
                int i2 = Integer.parseInt(strArrSplit[0]);
                int i3 = Integer.parseInt(strArrSplit[1]);
                int iF = this.f10887a.f("capability.version", 0);
                if (iF < i2 || iF > i3) {
                    wpe.h("EngineImpl", "checkOffline: capability is not match");
                    mIXEngineCapability.onConnectOfflineError(MIXEngineCapability.XAEE_VERSION_INCOMPATIBLE);
                    return false;
                }
            }
            if (!mIXEngineCapability.onGetXaeeHealth()) {
                wpe.h("EngineImpl", "checkOffline: xaee process is bad health");
                mIXEngineCapability.onConnectOfflineError(MIXEngineCapability.XAEE_APP_CRASHED);
                return false;
            }
            try {
                int i4 = android.provider.Settings.Global.getInt(this.f10889k.getContentResolver(), "edge_switch_enable");
                wpe.h("EngineImpl", "checkOffline: cloud " + i4);
                if (i4 == 0) {
                    wpe.h("EngineImpl", "checkOffline: cloud close");
                    mIXEngineCapability.onConnectOfflineError(MIXEngineCapability.XAEE_CLOUD_CLOSED);
                    return false;
                }
            } catch (Exception e) {
                wpe.e("EngineImpl", "get cloud error " + e.getMessage());
            }
            if (NetworkUtils.isNetworkAvailable(this.f10889k)) {
                try {
                    int i5 = android.provider.Settings.Global.getInt(this.f10889k.getContentResolver(), "speech_resident_state");
                    if (i5 != 1) {
                        wpe.h("EngineImpl", "checkOffline: speech resident init is not ready:" + i5);
                        mIXEngineCapability.onConnectOfflineError(MIXEngineCapability.XAEE_RESIDENT_INIT_FAILED);
                        return false;
                    }
                    try {
                        int i6 = android.provider.Settings.Global.getInt(this.f10889k.getContentResolver(), "speech_load_state", 0);
                        if (i6 != 0) {
                            a(mIXEngineCapability, i6);
                            return false;
                        }
                        if (!mIXEngineCapability.onGetProcessExist(strI)) {
                            wpe.h("EngineImpl", "checkOffline: xaee process is not exist");
                            mIXEngineCapability.onConnectOfflineError(MIXEngineCapability.XAEE_APP_KILLED);
                            return false;
                        }
                    } catch (Exception e2) {
                        wpe.e("EngineImpl", "get speech unknown error " + e2.getMessage());
                        mIXEngineCapability.onConnectOfflineError(MIXEngineCapability.XAEE_SPEECH_OTHER_ERROR);
                        return false;
                    }
                } catch (Exception e3) {
                    wpe.e("EngineImpl", "get speech resident init error " + e3.getMessage());
                    mIXEngineCapability.onConnectOfflineError(MIXEngineCapability.XAEE_RESIDENT_INIT_FAILED);
                    return false;
                }
            }
            ActivityManager activityManager = (ActivityManager) this.f10889k.getSystemService(LifecycleConstantKt.TYPE_ACTIVITY);
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            activityManager.getMemoryInfo(memoryInfo);
            long j = memoryInfo.availMem;
            long jG = this.f10887a.g("connection.offline_low_memory_standard");
            wpe.b("EngineImpl", "checkOffline: memory " + j + ":" + jG);
            if (j >= jG) {
                wpe.h("EngineImpl", "checkOffline: use offline");
                return true;
            }
            wpe.h("EngineImpl", "checkOffline: low memory");
            mIXEngineCapability.onConnectOfflineError(MIXEngineCapability.XAEE_LOW_MEMORY);
            return false;
        } catch (Exception e4) {
            wpe.e("EngineImpl", "get model error " + e4.getMessage());
            mIXEngineCapability.onConnectOfflineError(MIXEngineCapability.XAEE_MODEL_INVALID);
            return false;
        }
    }

    public boolean a(c4h c4hVar) {
        String str;
        if (this.s) {
            str = "postTrackData:mIsReleased=" + this.s;
        } else {
            if (this.f10887a.b("track.enable")) {
                wpe.b("EngineImpl", "postTrackData:" + c4hVar.toString());
                this.p.b(c4hVar);
                return true;
            }
            str = "postTrackData: AivsConfig.Track.ENABLE is false";
        }
        wpe.e("EngineImpl", str);
        return false;
    }
}
