package com.xiaomi.ai.android.core;

import android.util.Log;
import com.google.android.material.timepicker.TimeModel;
import com.xiaomi.ai.android.capability.AuthCapability;
import com.xiaomi.ai.android.capability.ConnectionCapability;
import com.xiaomi.ai.android.capability.ErrorCapability;
import com.xiaomi.ai.android.capability.StorageCapability;
import com.xiaomi.ai.android.utils.NetworkUtils;
import com.xiaomi.ai.api.AIApiConstants;
import com.xiaomi.ai.api.StdStatuses;
import com.xiaomi.ai.api.common.Instruction;
import com.xiaomi.ai.core.AivsConfig;
import com.xiaomi.ai.error.AivsError;
import com.xiaomi.ai.log.Logger;
import com.xiaomi.ai.track.TrackData;
import java.security.SecureRandom;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

/* JADX INFO: loaded from: classes18.dex */
public class a extends com.xiaomi.ai.core.b {
    private d a;
    private boolean c;
    private C0767a d;
    private int b = 0;
    private boolean e = true;
    private boolean f = false;
    private Set<String> g = new HashSet<String>() { // from class: com.xiaomi.ai.android.core.a.1
        {
            add(AIApiConstants.SpeechSynthesizer.Speak);
            add(AIApiConstants.SpeechSynthesizer.FinishSpeakStream);
        }
    };

    /* JADX INFO: renamed from: com.xiaomi.ai.android.core.a$a, reason: collision with other inner class name */
    public class C0767a extends Thread {
        private boolean b;

        private C0767a() {
            this.b = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean a() {
            boolean z;
            synchronized (this) {
                z = this.b;
            }
            return z;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            String str;
            String str2;
            String str3;
            String str4;
            Logger.b("ChannelManager", "ReconnectRunnable begin");
            try {
                Thread.sleep(100L);
            } catch (InterruptedException e) {
                Logger.d("ChannelManager", Log.getStackTraceString(e));
            }
            while (a.this.c) {
                try {
                    try {
                        synchronized (this) {
                            this.b = true;
                        }
                        try {
                            a aVar = a.this;
                            Thread.sleep(aVar.a(a.b(aVar)) * 1000);
                        } catch (InterruptedException e2) {
                            Logger.d("ChannelManager", Log.getStackTraceString(e2));
                        }
                        synchronized (this) {
                            this.b = false;
                        }
                        if (NetworkUtils.a(a.this.a.a())) {
                            com.xiaomi.ai.core.a aVarG = a.this.a.g();
                            if (aVarG != null) {
                                aVarG.getClientInfo().setNetwork(NetworkUtils.b(a.this.a.a()));
                                if (aVarG.start()) {
                                    a.this.e = true;
                                    str4 = "ChannelManager";
                                    str3 = "ReconnectThread: start success";
                                } else {
                                    str = "ChannelManager";
                                    str2 = "ReconnectRunnable: reconnect failed, times=" + a.this.b;
                                }
                                Logger.a(str4, str3);
                                break;
                            }
                            Logger.d("ChannelManager", "ReconnectThread: reconnect failed, channel is null");
                            break;
                        }
                        str = "ChannelManager";
                        str2 = "ReconnectRunnable: network is not available";
                        Logger.c(str, str2);
                        if (!a.this.c) {
                            str4 = "ChannelManager";
                            str3 = "ReconnectThread: don't do reconnect";
                        } else if (a.this.a.b().getInt(AivsConfig.Connection.KEEP_ALIVE_TYPE) != 0) {
                            str4 = "ChannelManager";
                            str3 = "ReconnectThread: don't KEEP_ALIVE_FOREVER";
                        }
                        Logger.a(str4, str3);
                    } catch (Throwable th) {
                        synchronized (a.this) {
                            a.this.d = null;
                            Logger.a("ChannelManager", "ReconnectThread: set mReconnectThread=null");
                            throw th;
                        }
                    }
                } catch (Exception e3) {
                    Logger.d("ChannelManager", Log.getStackTraceString(e3));
                    synchronized (a.this) {
                        a.this.d = null;
                        Logger.a("ChannelManager", "ReconnectThread: set mReconnectThread=null");
                    }
                }
            }
            synchronized (a.this) {
                a.this.d = null;
                Logger.a("ChannelManager", "ReconnectThread: set mReconnectThread=null");
            }
            Logger.b("ChannelManager", "ReconnectRunnable end");
        }
    }

    public a(d dVar) {
        this.a = dVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int a(int i) {
        if (i <= 0) {
            i = 0;
        } else if (i > 10) {
            i = 10;
        }
        int i2 = this.a.b().getInt(AivsConfig.Connection.MAX_RECONNECT_INTERVAL);
        if (i2 < 1800) {
            Logger.a("ChannelManager", "MAX_RECONNECT_INTERVAL must be larger than 1800");
            i2 = 1800;
        }
        int iPow = ((int) Math.pow(2.0d, i)) - 1;
        int iPow2 = ((int) Math.pow(2.0d, i + 1)) - 1;
        SecureRandom secureRandom = new SecureRandom();
        secureRandom.setSeed(UUID.randomUUID().toString().getBytes());
        int iNextInt = iPow + secureRandom.nextInt(iPow2 - iPow);
        if (iNextInt <= i2) {
            i2 = iNextInt;
        }
        Logger.c("ChannelManager", "getSleepTime:" + i2);
        return i2;
    }

    public static /* synthetic */ int b(a aVar) {
        int i = aVar.b;
        aVar.b = i + 1;
        return i;
    }

    @Override // com.xiaomi.ai.core.b
    public String a(com.xiaomi.ai.core.a aVar, String str) {
        StorageCapability storageCapability = (StorageCapability) this.a.a(StorageCapability.class);
        if (storageCapability == null) {
            return null;
        }
        String keyValue = storageCapability.readKeyValue(str);
        Logger.a("ChannelManager", "onRead: key=" + str + ", value=" + keyValue);
        return keyValue;
    }

    @Override // com.xiaomi.ai.core.b
    public String a(com.xiaomi.ai.core.a aVar, boolean z) {
        Logger.b("ChannelManager", "onGetToken");
        AuthCapability authCapability = (AuthCapability) this.a.a(AuthCapability.class);
        if (authCapability != null) {
            return authCapability.onGetToken(this.a.l(), z);
        }
        Logger.d("ChannelManager", "onGetToken: AuthCapability was not registered");
        return null;
    }

    public void a() {
        String str;
        String str2;
        Logger.b("ChannelManager", "reconnect");
        synchronized (this) {
            com.xiaomi.ai.core.a aVarG = this.a.g();
            if (!this.f && aVarG != null) {
                if (aVarG.isConnected()) {
                    Logger.b("ChannelManager", "reconnect: already connected");
                    return;
                }
                C0767a c0767a = this.d;
                if (c0767a == null) {
                    this.b = 0;
                    this.c = true;
                    C0767a c0767a2 = new C0767a();
                    this.d = c0767a2;
                    c0767a2.start();
                    str = "ChannelManager";
                    str2 = "reconnect: start new reconnect thread";
                } else if (c0767a.a()) {
                    this.b = 0;
                    this.d.interrupt();
                    str = "ChannelManager";
                    str2 = "reconnect: interrupt reconnect thread";
                } else {
                    str = "ChannelManager";
                    str2 = "reconnect: is already connecting";
                }
                Logger.b(str, str2);
                return;
            }
            Logger.c("ChannelManager", "reconnect: already released");
        }
    }

    @Override // com.xiaomi.ai.core.b
    public void a(long j) {
        this.a.j().c(this.a.e().c());
    }

    @Override // com.xiaomi.ai.core.b
    public void a(com.xiaomi.ai.core.a aVar) {
        Logger.b("ChannelManager", "onAuthExpired");
    }

    @Override // com.xiaomi.ai.core.b
    public void a(com.xiaomi.ai.core.a aVar, int i) {
        this.a.a(i, true);
    }

    @Override // com.xiaomi.ai.core.b
    public void a(com.xiaomi.ai.core.a aVar, Instruction instruction) {
        this.b = 0;
        this.a.j().b(instruction);
        if (this.g.contains(instruction.getFullName())) {
            this.a.f().b(instruction);
        }
        this.a.d().obtainMessage(1, instruction).sendToTarget();
        this.a.i().a(instruction);
    }

    @Override // com.xiaomi.ai.core.b
    public void a(com.xiaomi.ai.core.a aVar, AivsError aivsError) {
        ErrorCapability errorCapability;
        Logger.d("ChannelManager", "onError:" + aivsError.getErrorCode() + "," + aivsError.getErrorMessage());
        this.a.j().a(false);
        if (this.e && this.d == null && (errorCapability = (ErrorCapability) this.a.a(ErrorCapability.class)) != null) {
            Logger.b("ChannelManager", "capability.onError");
            errorCapability.onError(aivsError);
        }
    }

    @Override // com.xiaomi.ai.core.b
    public void a(com.xiaomi.ai.core.a aVar, TrackData trackData) {
        if (trackData == null) {
            return;
        }
        Logger.a("ChannelManager", "onSetNetworkInfo");
        String strC = NetworkUtils.c(this.a.a());
        trackData.set("network", strC);
        if ("WIFI".equals(strC)) {
            trackData.set("network.wifi.signal.level", NetworkUtils.e(this.a.a()));
            return;
        }
        int iD = NetworkUtils.d(this.a.a());
        if (iD != Integer.MAX_VALUE) {
            trackData.set("network.dbm", iD);
        }
        trackData.set("network.data.carrier.type", NetworkUtils.f(this.a.a()));
    }

    @Override // com.xiaomi.ai.core.b
    public void a(com.xiaomi.ai.core.a aVar, byte[] bArr) {
        this.a.j().d();
        this.a.f().a(bArr);
        this.a.i().a();
        Logger.a("ChannelManager", "onBinaryMessage length=" + bArr.length);
    }

    @Override // com.xiaomi.ai.core.b
    public boolean a(com.xiaomi.ai.core.a aVar, String str, String str2) {
        Logger.a("ChannelManager", "onWrite: key=" + str + ", value=" + str2);
        StorageCapability storageCapability = (StorageCapability) this.a.a(StorageCapability.class);
        return storageCapability != null && storageCapability.writeKeyValue(str, str2);
    }

    public void b() {
        Logger.a("ChannelManager", "onNetworkAvailable");
        if (this.a.b().getInt(AivsConfig.Connection.KEEP_ALIVE_TYPE) != 0 && this.a.c().b() <= 0) {
            return;
        }
        a();
    }

    @Override // com.xiaomi.ai.core.b
    public void b(com.xiaomi.ai.core.a aVar) {
        Logger.b("ChannelManager", "onAuthRefreshed");
    }

    @Override // com.xiaomi.ai.core.b
    public void b(com.xiaomi.ai.core.a aVar, String str) {
        StorageCapability storageCapability = (StorageCapability) this.a.a(StorageCapability.class);
        if (storageCapability != null) {
            storageCapability.removeKeyValue(str);
        }
        Logger.a("ChannelManager", "onRemove: key=" + str);
    }

    @Override // com.xiaomi.ai.core.b
    public String c(com.xiaomi.ai.core.a aVar) {
        Logger.b("ChannelManager", "onGetOAuthCode");
        AuthCapability authCapability = (AuthCapability) this.a.a(AuthCapability.class);
        if (authCapability != null) {
            return authCapability.onGetOAuthCode();
        }
        Logger.d("ChannelManager", "onGetOAuthCode: AuthCapability was not registered");
        return null;
    }

    public void c() {
        Logger.b("ChannelManager", "release");
        synchronized (this) {
            this.f = true;
            this.e = false;
            this.c = false;
            C0767a c0767a = this.d;
            if (c0767a != null) {
                c0767a.interrupt();
                this.d = null;
            }
        }
    }

    @Override // com.xiaomi.ai.core.b
    public String d() {
        ConnectionCapability connectionCapability = (ConnectionCapability) this.a.a(ConnectionCapability.class);
        if (connectionCapability != null) {
            return connectionCapability.onGetSSID();
        }
        return null;
    }

    @Override // com.xiaomi.ai.core.b
    public String d(com.xiaomi.ai.core.a aVar) {
        String str;
        Logger.b("ChannelManager", "onGetAuthorizationToken");
        AuthCapability authCapability = (AuthCapability) this.a.a(AuthCapability.class);
        if (authCapability != null) {
            AuthCapability.AuthorizationTokens authorizationTokensOnGetAuthorizationTokens = authCapability.onGetAuthorizationTokens();
            if (authorizationTokensOnGetAuthorizationTokens != null) {
                aVar.getListener().a(aVar, "access_token", authorizationTokensOnGetAuthorizationTokens.accessToken);
                aVar.getListener().a(aVar, "refresh_token", authorizationTokensOnGetAuthorizationTokens.refreshToken);
                aVar.getListener().a(aVar, "expire_at", String.format(TimeModel.NUMBER_FORMAT, Long.valueOf((System.currentTimeMillis() / 1000) + authorizationTokensOnGetAuthorizationTokens.expireIn)));
                aVar.getListener().a(aVar, "refresh_at", String.format(TimeModel.NUMBER_FORMAT, Long.valueOf(System.currentTimeMillis() / 1000)));
                String str2 = authorizationTokensOnGetAuthorizationTokens.accessToken;
                if (com.xiaomi.ai.b.f.a(str2)) {
                    aVar.updateTrack("sdk.connect.error.msg", "onGetAuthorizationToken error : emptyToken");
                }
                return str2;
            }
            aVar.updateTrack("sdk.connect.error.msg", "onGetAuthorizationToken error : authorizationTokens is null");
            str = "authorizationTokens is null";
        } else {
            aVar.updateTrack("sdk.connect.error.msg", "onGetAuthorizationToken error : capability is null");
            str = "onGetAuthorizationToken: AuthCapability was not registered";
        }
        Logger.d("ChannelManager", str);
        return null;
    }

    @Override // com.xiaomi.ai.core.b
    public void e(com.xiaomi.ai.core.a aVar) {
        Logger.b("ChannelManager", "onConnected");
        this.a.d().removeCallbacksAndMessages(null);
        this.a.e().b();
        this.a.f().b();
        this.a.c().c();
        if (this.a.b().getInt(AivsConfig.Connection.KEEP_ALIVE_TYPE) != 0) {
            this.a.i().d();
        }
        ConnectionCapability connectionCapability = (ConnectionCapability) this.a.a(ConnectionCapability.class);
        if (connectionCapability != null) {
            connectionCapability.onConnected();
        }
    }

    @Override // com.xiaomi.ai.core.b
    public boolean e() {
        return NetworkUtils.ipv6Available();
    }

    /* JADX WARN: Code duplicated, block: B:19:0x004d  */
    /* JADX WARN: Code duplicated, block: B:21:0x0059  */
    /* JADX WARN: Code duplicated, block: B:24:0x0068  */
    @Override // com.xiaomi.ai.core.b
    public void f(com.xiaomi.ai.core.a aVar) {
        String str;
        String str2;
        ConnectionCapability connectionCapability;
        ErrorCapability errorCapability;
        Logger.d("ChannelManager", "onDisconnected");
        this.a.j().a(false);
        synchronized (this) {
            if (this.f) {
                return;
            }
            if (this.d == null) {
                this.e = true;
                if (this.a.b().getInt(AivsConfig.Connection.KEEP_ALIVE_TYPE) == 0) {
                    this.c = true;
                    C0767a c0767a = new C0767a();
                    this.d = c0767a;
                    c0767a.start();
                } else {
                    str = "ChannelManager";
                    str2 = "onDisconnected: will not reconnect";
                }
                if (this.e) {
                    connectionCapability = (ConnectionCapability) this.a.a(ConnectionCapability.class);
                    if (connectionCapability != null) {
                        connectionCapability.onDisconnected();
                    }
                    errorCapability = (ErrorCapability) this.a.a(ErrorCapability.class);
                    if (errorCapability != null) {
                        errorCapability.onError(new AivsError(StdStatuses.CONNECTION_INTERRUPT, "Network disconnected"));
                    }
                    this.e = false;
                }
                this.a.c().a();
                this.a.i().e();
            }
            str = "ChannelManager";
            str2 = "onDisconnected: is already reconnecting or do not need reconnect";
            Logger.c(str, str2);
            if (this.e) {
                connectionCapability = (ConnectionCapability) this.a.a(ConnectionCapability.class);
                if (connectionCapability != null) {
                    connectionCapability.onDisconnected();
                }
                errorCapability = (ErrorCapability) this.a.a(ErrorCapability.class);
                if (errorCapability != null) {
                    errorCapability.onError(new AivsError(StdStatuses.CONNECTION_INTERRUPT, "Network disconnected"));
                }
                this.e = false;
            }
            this.a.c().a();
            this.a.i().e();
        }
    }

    @Override // com.xiaomi.ai.core.b
    public int g(com.xiaomi.ai.core.a aVar) {
        int i = 0;
        try {
            String[] strArrSplit = "1.16.4".split("\\.");
            i = Integer.parseInt(strArrSplit[2]) + (Integer.parseInt(strArrSplit[0]) * 1000000) + (Integer.parseInt(strArrSplit[1]) * 1000);
            Logger.a("ChannelManager", "onGetSDKVersion : " + i);
            return i;
        } catch (Exception e) {
            Logger.d("ChannelManager", Logger.throwableToString(e));
            return i;
        }
    }
}
