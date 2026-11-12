package com.xiaomi.ai.android.core;

import android.content.Context;
import android.content.IntentFilter;
import android.location.Location;
import android.os.Bundle;
import android.os.HandlerThread;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.google.android.material.timepicker.TimeModel;
import com.xiaomi.ai.android.capability.AuthCapability;
import com.xiaomi.ai.android.capability.Capability;
import com.xiaomi.ai.android.capability.ConnectionCapability;
import com.xiaomi.ai.android.capability.ErrorCapability;
import com.xiaomi.ai.android.capability.InstructionCapability;
import com.xiaomi.ai.android.capability.SpeechSynthesizerCapability;
import com.xiaomi.ai.android.capability.StorageCapability;
import com.xiaomi.ai.android.capability.TrackCapability;
import com.xiaomi.ai.android.utils.DeviceUtils;
import com.xiaomi.ai.android.utils.NetworkUtils;
import com.xiaomi.ai.api.Settings;
import com.xiaomi.ai.api.StdStatuses;
import com.xiaomi.ai.api.Versions;
import com.xiaomi.ai.api.common.Event;
import com.xiaomi.ai.core.AivsConfig;
import com.xiaomi.ai.core.XMDChannel;
import com.xiaomi.ai.error.AivsError;
import com.xiaomi.ai.log.Logger;
import com.xiaomi.ai.log.LoggerHooker;
import com.xiaomi.common.Optional;
import io.flutter.plugins.connectivity.ConnectivityBroadcastReceiver;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes18.dex */
public class d extends Engine {
    private AivsConfig a;
    private f b;
    private e c;
    private a d;
    private com.xiaomi.ai.core.a e;
    private Map<Class<?>, Capability> f;
    private c g;
    private k h;
    private HandlerThread i;
    private HandlerThread j;
    private Context k;
    private int l;
    private h m;
    private Settings.ClientInfo n;
    private j o;
    private g p;
    private b q;
    private NetworkUtils.a r;
    private boolean s;
    private volatile boolean t = false;
    private i u;

    public d(Context context, AivsConfig aivsConfig, Settings.ClientInfo clientInfo, int i) {
        this.a = aivsConfig;
        this.k = context.getApplicationContext();
        this.l = i;
        a(clientInfo);
        r();
    }

    private void a(Settings.ClientInfo clientInfo) {
        g gVar;
        Logger.setLogHooker(new com.xiaomi.ai.android.b.a());
        this.n = b(clientInfo);
        this.f = new HashMap();
        registerCapability(new com.xiaomi.ai.android.impl.b(this, this.l, this.a.getInt(AivsConfig.ENV)));
        registerCapability(new com.xiaomi.ai.android.impl.c(this));
        if (q()) {
            Logger.b("EngineImpl", "logUpload enabled");
            synchronized (Logger.class) {
                gVar = (g) Logger.a();
                if (gVar == null) {
                    gVar = new g(this);
                    Logger.a(gVar);
                }
            }
            this.p = gVar;
        }
        if (this.a.getBoolean(AivsConfig.LimitedDiskCache.ENABLE)) {
            com.xiaomi.ai.android.track.f.a().a(this.a.getInt(AivsConfig.LimitedDiskCache.MAX_DISK_SAVE_TIMES));
        }
        this.u = new i();
        this.c = new e(this);
        this.b = new f(this);
        this.d = new a(this);
        HandlerThread handlerThread = new HandlerThread("DownloadThread");
        this.i = handlerThread;
        handlerThread.start();
        this.g = new c(this, this.i.getLooper());
        HandlerThread handlerThread2 = new HandlerThread("UploadThread");
        this.j = handlerThread2;
        handlerThread2.start();
        this.h = new k(this, this.j.getLooper());
        n();
        this.o = new j(this);
        this.m = new h(this);
        this.q = new b(this);
        if (this.a.getInt(AivsConfig.Connection.KEEP_ALIVE_TYPE) == 0) {
            NetworkUtils.a aVar = new NetworkUtils.a(this);
            this.r = aVar;
            this.k.registerReceiver(aVar, new IntentFilter(ConnectivityBroadcastReceiver.CONNECTIVITY_ACTION));
        }
    }

    private Settings.ClientInfo b(Settings.ClientInfo clientInfo) {
        StringBuilder sb;
        String str;
        Location locationA;
        if (this.a == null) {
            Logger.d("EngineImpl", "rebuildClientInfo: mConfig is null");
            return null;
        }
        if (clientInfo == null) {
            clientInfo = new Settings.ClientInfo();
        }
        if (!clientInfo.getTimeZone().isPresent()) {
            clientInfo.setTimeZone(TimeZone.getDefault().getID());
        }
        if (this.a.getBoolean(AivsConfig.Connection.ENABLE_AUTO_LOCATION) && ((!clientInfo.getLongitude().isPresent() || !clientInfo.getLatitude().isPresent()) && (locationA = com.xiaomi.ai.android.utils.c.a(this.k)) != null)) {
            clientInfo.setLongitude(locationA.getLongitude());
            clientInfo.setLatitude(locationA.getLatitude());
        }
        if (!clientInfo.getNetwork().isPresent()) {
            clientInfo.setNetwork(NetworkUtils.b(this.k));
        }
        if (!this.a.getBoolean(AivsConfig.Auth.SUPPORT_MULTIPLY_CLIENT_ID)) {
            clientInfo.setDeviceId(DeviceUtils.getDeviceId(this.k));
            sb = new StringBuilder();
            str = "device id set by sdk ";
        } else {
            if (!clientInfo.getDeviceId().isPresent()) {
                Logger.d("EngineImpl", "error: device id not set!!!");
                throw new IllegalArgumentException("device id not set!!!");
            }
            sb = new StringBuilder();
            str = "device id set by client ";
        }
        sb.append(str);
        sb.append(clientInfo.getDeviceId().get());
        Logger.c("EngineImpl", sb.toString());
        Logger.b("EngineImpl", "deviceId:" + clientInfo.getDeviceId().get());
        return clientInfo;
    }

    private void n() {
        int iP = p();
        if (iP == 1) {
            String strA = this.d.a(this.e, "xmd_ws_expire_at");
            if (!TextUtils.isEmpty(strA)) {
                long j = Long.parseLong(strA) - (System.currentTimeMillis() / 1000);
                if (j < 0 || j >= 86400) {
                    Logger.b("EngineImpl", "createChannel: clear wss expire time in xmd mode");
                    this.d.b(this.e, "xmd_ws_expire_at");
                } else {
                    Logger.b("EngineImpl", "createChannel: use websocket channel in xmd mode");
                    iP = 0;
                }
            }
        }
        a(iP, false);
    }

    private String o() {
        StringBuilder sb;
        String str;
        String strA = this.d.a(this.e, "link_mode");
        if (TextUtils.isEmpty(strA)) {
            strA = "ws-wss";
            sb = new StringBuilder();
            str = "use default link mode ";
        } else {
            sb = new StringBuilder();
            str = "use cloud control link mode ";
        }
        sb.append(str);
        sb.append(strA);
        Logger.b("EngineImpl", sb.toString());
        return strA;
    }

    private int p() {
        int i = this.a.getInt(AivsConfig.Connection.CHANNEL_TYPE, -1);
        if (i != -1) {
            return i;
        }
        String strO = o();
        return (strO.equals("ws-wss") || strO.equals("wss") || !strO.equals("xmd")) ? 0 : 1;
    }

    private boolean q() {
        StorageCapability storageCapability = (StorageCapability) a(StorageCapability.class);
        if (storageCapability == null) {
            Logger.b("EngineImpl", "use default uploadLogSwitch false");
            return false;
        }
        String keyValue = storageCapability.readKeyValue("upload_log_switch");
        if (TextUtils.isEmpty(keyValue)) {
            Logger.b("EngineImpl", "use default uploadLogSwitch false");
            return false;
        }
        Logger.b("EngineImpl", "use cloud control uploadLogSwitch " + keyValue);
        return "true".equals(keyValue);
    }

    private void r() {
        Settings.ClientInfo clientInfo = this.n;
        Logger.c("EngineImpl", String.format(Locale.US, "versionName=%s, versionCode=%d, engineId=%s,GIT_COMMIT=%s, spec version=%s", "1.16.4", 20210531, (clientInfo == null || !clientInfo.getEngineId().isPresent()) ? " " : this.n.getEngineId().get(), "bccd06c", Versions.SPEC_VERSION));
    }

    public Context a() {
        return this.k;
    }

    public Capability a(Class<?> cls) {
        return this.f.get(cls);
    }

    public void a(int i, boolean z) {
        com.xiaomi.ai.core.a eVar;
        if (z) {
            this.o.a(false);
        }
        int i2 = this.l;
        if (i2 == 5 || i2 == 6) {
            com.xiaomi.ai.android.a.a.a aVar = new com.xiaomi.ai.android.a.a.a(this, i2);
            eVar = i == 0 ? new com.xiaomi.ai.core.e(this.a, this.n, aVar, this.d) : new XMDChannel(this.a, this.n, aVar, this.d);
            aVar.a(eVar);
        } else {
            eVar = i == 0 ? new com.xiaomi.ai.core.e(this.a, this.n, i2, this.d) : new XMDChannel(this.a, this.n, i2, this.d);
        }
        this.e = eVar;
        if (z && this.a.getBoolean(AivsConfig.Track.ENABLE)) {
            this.o.b();
            this.e.setTrackInfo(this.o.f());
        }
    }

    public void a(AivsError aivsError) {
        ErrorCapability errorCapability = (ErrorCapability) a(ErrorCapability.class);
        if (errorCapability != null) {
            errorCapability.onError(aivsError);
        }
        Logger.d("EngineImpl", "Error:" + aivsError.getEventId() + ":" + aivsError.getErrorMessage());
    }

    public boolean a(ObjectNode objectNode) {
        String str;
        if (this.t) {
            str = "postTrackData:mIsReleased=" + this.t;
        } else {
            if (this.a.getBoolean(AivsConfig.Track.ENABLE)) {
                Logger.a("EngineImpl", "postTrackData:" + objectNode.toString());
                this.o.a(objectNode);
                return true;
            }
            str = "postTrackData: AivsConfig.Track.ENABLE is false";
        }
        Logger.d("EngineImpl", str);
        return false;
    }

    public AivsConfig b() {
        return this.a;
    }

    public k c() {
        return this.h;
    }

    @Override // com.xiaomi.ai.android.core.Engine
    public void clearUserData() {
        Logger.d("EngineImpl", "clearUserData");
        com.xiaomi.ai.android.track.f.a().a(this.k, "aivs_user_data.xml", this.a.getBoolean(AivsConfig.LimitedDiskCache.ENABLE));
    }

    public c d() {
        return this.g;
    }

    public e e() {
        return this.c;
    }

    public f f() {
        return this.b;
    }

    @Override // com.xiaomi.ai.android.core.Engine
    public void finishTrace() {
        ObjectNode objectNodeB = this.u.b();
        if (objectNodeB != null) {
            a(objectNodeB);
        } else {
            Logger.b("EngineImpl", "node is null");
        }
    }

    public com.xiaomi.ai.core.a g() {
        return this.e;
    }

    @Override // com.xiaomi.ai.android.core.Engine
    public String getAccessToken() {
        StorageCapability storageCapability = (StorageCapability) a(StorageCapability.class);
        if (storageCapability != null) {
            return storageCapability.readKeyValue("access_token");
        }
        return null;
    }

    @Override // com.xiaomi.ai.android.core.Engine
    public String getAuthorization() {
        String str;
        Logger.b("EngineImpl", "getAuthorization ");
        com.xiaomi.ai.core.a aVar = this.e;
        if (aVar == null || aVar.getAuthProvider() == null) {
            str = "getAuthorization: AuthProvider not set";
        } else {
            String strA = this.e.getAuthProvider().a(false, false, (Map<String, String>) null);
            if (!TextUtils.isEmpty(strA)) {
                return strA;
            }
            str = "getAuthorization: failed to getAuthHeader";
        }
        Logger.d("EngineImpl", str);
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
            Logger.d("EngineImpl", Logger.throwableToString(e));
            return -1L;
        }
    }

    @Override // com.xiaomi.ai.android.core.Engine
    public int getSDKVersion() {
        return this.d.g(this.e);
    }

    public a h() {
        return this.d;
    }

    public h i() {
        return this.m;
    }

    @Override // com.xiaomi.ai.android.core.Engine
    public void interrupt() {
        if (this.t) {
            Logger.d("EngineImpl", "interrupt error,engine has been released");
            return;
        }
        Logger.b("EngineImpl", "interrupt");
        this.h.a();
        this.g.removeCallbacksAndMessages(null);
        this.c.a();
        this.b.b();
        this.m.b();
    }

    public j j() {
        return this.o;
    }

    public String k() {
        if (this.l == 1 && this.a.getBoolean(AivsConfig.Auth.OAuth.ENABLE_UPLOAD_MIOT_DID)) {
            Optional<String> deviceId = this.n.getDeviceId();
            Optional<String> miotDid = this.n.getMiotDid();
            if (miotDid.isPresent()) {
                String strA = com.xiaomi.ai.b.b.a(deviceId.get() + "_" + miotDid.get());
                StringBuilder sb = new StringBuilder();
                sb.append(strA);
                sb.append("_");
                String string = sb.toString();
                Logger.a("EngineImpl", "getAuthPrefix upload miot did. prefix is " + string);
                return string;
            }
        }
        return "";
    }

    public int l() {
        return this.l;
    }

    public Settings.ClientInfo m() {
        return this.n;
    }

    @Override // com.xiaomi.ai.android.core.Engine
    public boolean postData(byte[] bArr, int i, int i2, boolean z) {
        if (!this.s) {
            Logger.d("EngineImpl", "postData2:mAvailable=" + this.s);
            return false;
        }
        if (!NetworkUtils.a(this.k)) {
            Logger.d("EngineImpl", "postData:network not available");
            a(new AivsError(StdStatuses.NETWORK_DISABLED, "network not available"));
            return false;
        }
        Logger.a("EngineImpl", "postData: offset=" + i + ", length=" + i2 + ", eof=" + z);
        if (i2 > 65536) {
            Logger.d("EngineImpl", "postData: Max frame length has been exceeded");
            return false;
        }
        if (this.e == null || this.h == null) {
            Logger.d("EngineImpl", "postData: already released or disconnected");
            a(new AivsError(StdStatuses.CONNECT_FAILED, "postData: already released or disconnected"));
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
        this.o.a(this.c.c());
        this.h.a(messageObtainMessage);
        return true;
    }

    @Override // com.xiaomi.ai.android.core.Engine
    public boolean postData(byte[] bArr, boolean z) {
        if (!this.s) {
            Logger.d("EngineImpl", "postData:mAvailable=" + this.s);
            return false;
        }
        if (!NetworkUtils.a(this.k)) {
            Logger.d("EngineImpl", "postData: network not available");
            a(new AivsError(StdStatuses.NETWORK_DISABLED, "network not available"));
            return false;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("postData: length=");
        sb.append(bArr != null ? bArr.length : 0);
        sb.append(", eof=");
        sb.append(z);
        Logger.a("EngineImpl", sb.toString());
        if (bArr != null && bArr.length > 65536) {
            Logger.d("EngineImpl", "postData: Max frame length has been exceeded");
            return false;
        }
        if (this.e == null || this.h == null) {
            Logger.d("EngineImpl", "postData: already released or disconnected");
            a(new AivsError(StdStatuses.CONNECT_FAILED, "postData: already released or disconnected"));
            return false;
        }
        Bundle bundle = new Bundle();
        bundle.putByteArray("data", bArr);
        bundle.putBoolean("eof", z);
        bundle.putBoolean("raw", false);
        Message messageObtainMessage = this.h.obtainMessage(1);
        messageObtainMessage.setData(bundle);
        this.o.a(this.c.c());
        this.h.a(messageObtainMessage);
        return true;
    }

    @Override // com.xiaomi.ai.android.core.Engine
    public boolean postEvent(Event event) {
        if (event == null) {
            Logger.d("EngineImpl", "postEvent:event is null");
            return false;
        }
        if (!this.s) {
            Logger.d("EngineImpl", "postEvent:mAvailable=" + this.s);
            return false;
        }
        if (!NetworkUtils.a(this.k)) {
            Logger.d("EngineImpl", "postEvent: network not available");
            a(new AivsError(StdStatuses.NETWORK_DISABLED, "network not available", event.getId()));
            return false;
        }
        try {
            String jsonString = event.toJsonString();
            if (Logger.getLogLevel() == 3) {
                Logger.a("EngineImpl", "postEvent: event " + jsonString);
            } else {
                Logger.b("EngineImpl", "postEvent: event: " + event.getFullName() + "," + event.getId());
            }
            com.xiaomi.ai.core.a aVar = this.e;
            if (aVar == null || this.h == null) {
                Logger.d("EngineImpl", "postEvent: already released or disconnected");
                a(new AivsError(StdStatuses.CONNECT_FAILED, "postEvent: already released or disconnected", event.getId()));
                return false;
            }
            if (!aVar.isConnected()) {
                r();
                this.d.a();
            }
            this.o.a(event);
            k kVar = this.h;
            kVar.a(kVar.obtainMessage(0, event));
            return true;
        } catch (JsonProcessingException e) {
            a(new AivsError(StdStatuses.MISSING_PARAMETER, "required field not set", event.getId()));
            Logger.d("EngineImpl", Log.getStackTraceString(e));
            Logger.d("EngineImpl", "postEvent: event failed, required field not set");
            return false;
        }
    }

    @Override // com.xiaomi.ai.android.core.Engine
    public boolean postRawData(byte[] bArr, int i, int i2) {
        if (!this.s) {
            Logger.d("EngineImpl", "postRawData:mAvailable=" + this.s);
            return false;
        }
        if (!NetworkUtils.a(this.k)) {
            Logger.d("EngineImpl", "postRawData:network not available");
            a(new AivsError(StdStatuses.NETWORK_DISABLED, "network not available"));
            return false;
        }
        Logger.a("EngineImpl", "postRawData: offset=" + i + ", length=" + i2);
        if (i2 > 65536) {
            Logger.d("EngineImpl", "postRawData: Max frame length has been exceeded");
            return false;
        }
        if (this.e == null || this.h == null) {
            Logger.d("EngineImpl", "postRawData: already released or disconnected");
            a(new AivsError(StdStatuses.CONNECT_FAILED, "postData: already released or disconnected"));
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
        this.o.a(this.c.c());
        this.h.a(messageObtainMessage);
        return true;
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
        } else {
            if (!(capability instanceof TrackCapability)) {
                Logger.d("EngineImpl", "registerCapability: unknown Capability " + capability);
                return false;
            }
            map = this.f;
            cls = TrackCapability.class;
        }
        map.put(cls, capability);
        return true;
    }

    @Override // com.xiaomi.ai.android.core.Engine
    public void release() {
        Logger.b("EngineImpl", "release start");
        this.t = true;
        this.s = false;
        this.q.b();
        NetworkUtils.a aVar = this.r;
        if (aVar != null) {
            this.k.unregisterReceiver(aVar);
            this.r = null;
        }
        this.h.a();
        this.j.quit();
        try {
            this.j.join();
        } catch (InterruptedException e) {
            Logger.d("EngineImpl", Logger.throwableToString(e));
        }
        com.xiaomi.ai.core.a aVar2 = this.e;
        if (aVar2 != null) {
            aVar2.stop();
            this.e = null;
        }
        this.g.removeCallbacksAndMessages(null);
        this.i.quit();
        try {
            this.i.join();
        } catch (InterruptedException e2) {
            Logger.d("EngineImpl", Logger.throwableToString(e2));
        }
        this.c.b();
        this.d.c();
        this.b.a();
        this.m.c();
        this.o.c();
        g gVar = this.p;
        if (gVar != null) {
            gVar.a(false);
            this.p = null;
        }
        Logger.b("EngineImpl", "release end");
    }

    @Override // com.xiaomi.ai.android.core.Engine
    public String requestAuthorization() {
        String str;
        Logger.b("EngineImpl", "requestAuthorization: start");
        if (this.t) {
            str = "requestAuthorization error,engine has been released";
        } else {
            com.xiaomi.ai.core.a aVar = this.e;
            if (aVar == null || aVar.getAuthProvider() == null) {
                str = "forceRefreshAuthorization: AuthProvider not set";
            } else {
                String strA = this.e.getAuthProvider().a(true, false, (Map<String, String>) null);
                if (!TextUtils.isEmpty(strA)) {
                    Logger.b("EngineImpl", "requestAuthorization: end");
                    return strA;
                }
                str = "forceRefreshAuthorization: failed to getAuthHeader";
            }
        }
        Logger.d("EngineImpl", str);
        return null;
    }

    @Override // com.xiaomi.ai.android.core.Engine
    public void restart() {
        if (this.t) {
            Logger.d("EngineImpl", "restart error,engine has been released");
            return;
        }
        Logger.b("EngineImpl", "restart");
        this.h.a();
        this.g.removeCallbacksAndMessages(null);
        this.c.b();
        this.b.b();
        this.m.c();
        com.xiaomi.ai.core.a aVar = this.e;
        if (aVar != null) {
            aVar.stop();
            this.d.a();
        }
    }

    @Override // com.xiaomi.ai.android.core.Engine
    public boolean setAuthorizationTokens(String str, String str2, long j) {
        StorageCapability storageCapability = (StorageCapability) a(StorageCapability.class);
        if (storageCapability == null) {
            return false;
        }
        storageCapability.writeKeyValue("access_token", str);
        storageCapability.writeKeyValue("refresh_token", str2);
        storageCapability.writeKeyValue("expire_at", String.format(TimeModel.NUMBER_FORMAT, Long.valueOf((System.currentTimeMillis() / 1000) + j)));
        return true;
    }

    @Override // com.xiaomi.ai.android.core.Engine
    public void setLoggerHooker(LoggerHooker loggerHooker) {
        Logger.setLogHooker(loggerHooker);
    }

    @Override // com.xiaomi.ai.android.core.Engine
    public synchronized boolean start() {
        Logger.b("EngineImpl", "start");
        if (this.t) {
            Logger.d("EngineImpl", "start error ,engine has been released");
            return false;
        }
        if (!NetworkUtils.a(this.k)) {
            Logger.d("EngineImpl", "network not available");
            a(new AivsError(StdStatuses.NETWORK_DISABLED, "network not available"));
            return false;
        }
        this.q.a();
        this.h.a();
        this.g.removeCallbacksAndMessages(null);
        this.e.stop();
        this.s = this.a.getBoolean(AivsConfig.Track.ENABLE) ? this.e.start(this.o.f()) : this.e.start();
        this.o.a(true);
        return this.s;
    }

    @Override // com.xiaomi.ai.android.core.Engine
    public void startTrace() {
        this.u.a();
    }

    @Override // com.xiaomi.ai.android.core.Engine
    public void traceRequestId(String str) {
        this.u.b(str);
    }

    @Override // com.xiaomi.ai.android.core.Engine
    public void traceResult(String str, int i) {
        this.u.b(str, i);
    }

    @Override // com.xiaomi.ai.android.core.Engine
    public void traceResult(String str, String str2) {
        this.u.a(str, str2);
    }

    @Override // com.xiaomi.ai.android.core.Engine
    public void traceTimeStamps(String str) {
        this.u.a(str);
    }

    @Override // com.xiaomi.ai.android.core.Engine
    public void traceTimeStamps(String str, long j) {
        this.u.a(str, j);
    }
}
