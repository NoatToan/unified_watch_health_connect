package com.xiaomi.ai.android.core;

import android.util.Log;
import com.google.android.material.timepicker.TimeModel;
import com.xiaomi.account.openauth.XiaomiOAuthConstants;
import com.xiaomi.ai.android.capability.AuthCapability;
import com.xiaomi.ai.android.capability.ConnectionCapability;
import com.xiaomi.ai.android.capability.ErrorCapability;
import com.xiaomi.ai.android.capability.MIXEngineCapability;
import com.xiaomi.ai.android.capability.StorageCapability;
import com.xiaomi.ai.android.utils.NetworkUtils;
import com.xiaomi.ai.api.AIApiConstants;
import com.xiaomi.ai.api.common.Instruction;
import com.xiaomi.onetrack.util.z;
import defpackage.dcd;
import defpackage.f01;
import defpackage.gt3;
import defpackage.klp;
import defpackage.lt3;
import defpackage.wpe;
import defpackage.yrs;
import java.security.SecureRandom;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

/* JADX INFO: loaded from: classes6.dex */
public class a extends lt3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private e f10875a;
    private boolean c;
    private b d;
    private Set<String> f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f10876b = 0;
    private boolean e = false;

    public class b extends Thread {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f10877a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f10878b;

        public b() {
            this.f10877a = false;
            this.f10878b = false;
        }

        public final int a(int i) {
            if (i <= 0) {
                return 0;
            }
            if (i > 10) {
                i = 10;
            }
            int iE = a.this.f10875a.i().e("connection.max_reconnect_interval");
            if (iE < 1800) {
                wpe.b("ChannelManager", "MAX_RECONNECT_INTERVAL must be larger than 1800");
                iE = 1800;
            }
            int iPow = ((int) Math.pow(2.0d, i)) - 1;
            int iPow2 = ((int) Math.pow(2.0d, i + 1.0f)) - 1;
            SecureRandom secureRandom = new SecureRandom();
            secureRandom.setSeed(UUID.randomUUID().toString().getBytes());
            int iNextInt = iPow + secureRandom.nextInt(iPow2 - iPow);
            return iNextInt > iE ? iE : iNextInt;
        }

        public synchronized void b(boolean z) {
            this.f10878b = z;
        }

        public synchronized boolean c() {
            return this.f10878b;
        }

        public final boolean e() {
            boolean z;
            synchronized (this) {
                z = this.f10877a;
            }
            return z;
        }

        /* JADX WARN: Code duplicated, block: B:130:0x01c3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:145:0x01a4 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:146:0x01bc A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:78:0x01aa A[Catch: all -> 0x00a4, Exception -> 0x00a7, TryCatch #6 {Exception -> 0x00a7, blocks: (B:22:0x006d, B:24:0x0075, B:28:0x007a, B:30:0x0086, B:32:0x009c, B:39:0x00b1, B:43:0x00b6, B:46:0x00c6, B:47:0x00cb, B:49:0x00d2, B:53:0x00e7, B:75:0x019c, B:57:0x010b, B:78:0x01aa, B:81:0x01c2, B:87:0x01ca, B:54:0x00ec, B:58:0x0110, B:60:0x0116, B:62:0x0123, B:64:0x0133, B:65:0x0138, B:71:0x017d, B:68:0x0157, B:74:0x0183, B:90:0x01cd, B:38:0x00aa, B:93:0x01d0), top: B:125:0x006d, outer: #2 }] */
        /* JADX WARN: Code duplicated, block: B:81:0x01c2 A[Catch: all -> 0x00a4, Exception -> 0x00a7, TRY_LEAVE, TryCatch #6 {Exception -> 0x00a7, blocks: (B:22:0x006d, B:24:0x0075, B:28:0x007a, B:30:0x0086, B:32:0x009c, B:39:0x00b1, B:43:0x00b6, B:46:0x00c6, B:47:0x00cb, B:49:0x00d2, B:53:0x00e7, B:75:0x019c, B:57:0x010b, B:78:0x01aa, B:81:0x01c2, B:87:0x01ca, B:54:0x00ec, B:58:0x0110, B:60:0x0116, B:62:0x0123, B:64:0x0133, B:65:0x0138, B:71:0x017d, B:68:0x0157, B:74:0x0183, B:90:0x01cd, B:38:0x00aa, B:93:0x01d0), top: B:125:0x006d, outer: #2 }] */
        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            String str6;
            gt3 gt3VarE;
            wpe.h("ChannelManager", "ReconnectRunnable begin");
            gt3 gt3VarE2 = a.this.f10875a.e();
            a aVar = a.this;
            if (gt3VarE2 == null) {
                synchronized (aVar) {
                    a.this.d = null;
                }
                wpe.e("ChannelManager", "ReconnectThread: reconnect failed, channel is null");
                return;
            }
            int iG = aVar.f10875a.g();
            int type = gt3VarE2.getType();
            wpe.h("ChannelManager", "currentChannelType =" + type + ", nextChannelType=" + iG);
            if (iG != type) {
                a.this.onChangeChannel(gt3VarE2, iG);
            }
            if (this.f10878b) {
                try {
                    Thread.sleep(100L);
                } catch (InterruptedException e) {
                    wpe.e("ChannelManager", Log.getStackTraceString(e));
                }
            }
            while (a.this.c) {
                try {
                    try {
                        synchronized (this) {
                            this.f10877a = true;
                        }
                        try {
                            int iA = a(a.d(a.this));
                            wpe.k("ChannelManager", "ReconnectThread: getSleepTime:" + iA);
                            if (iA > 0) {
                                Thread.sleep(((long) iA) * 1000);
                            }
                        } catch (InterruptedException unused) {
                            wpe.e("ChannelManager", " interrupt from sleep , start connect");
                        }
                        synchronized (this) {
                            this.f10877a = false;
                        }
                        gt3 gt3VarE3 = a.this.f10875a.e();
                        if (gt3VarE3 != null) {
                            if (gt3VarE3.getType() == 3 || NetworkUtils.isNetworkAvailable(a.this.f10875a.j())) {
                                gt3VarE3.getClientInfo().setNetwork(NetworkUtils.getBriefNetworkType(a.this.f10875a.j()));
                                if (gt3VarE3.start()) {
                                    str3 = "ChannelManager";
                                    str4 = "ReconnectThread: start success";
                                } else {
                                    if (gt3VarE3.tryAgain()) {
                                        wpe.k("ChannelManager", "ReconnectThread: reconnect failed, try again");
                                        if (gt3VarE3.getType() == 3) {
                                            MIXEngineCapability mIXEngineCapability = (MIXEngineCapability) a.this.f10875a.a(MIXEngineCapability.class);
                                            if (mIXEngineCapability != null) {
                                                mIXEngineCapability.onInitMIXEngine(MIXEngineCapability.EngineLink.ONLINE);
                                            }
                                            a aVar2 = a.this;
                                            aVar2.onChangeChannel(gt3VarE3, aVar2.f10875a.o());
                                            gt3VarE = a.this.f10875a.e();
                                            if (gt3VarE == null) {
                                                str = "ChannelManager";
                                                str2 = "ReconnectThread: use online channel, channel is null";
                                            }
                                            gt3VarE.start();
                                        } else {
                                            a.this.f10875a.i().l("connection.enable_lite_crypt", false);
                                            a.this.onChangeChannel(gt3VarE3, 0);
                                            gt3VarE = a.this.f10875a.e();
                                            if (gt3VarE == null) {
                                                str = "ChannelManager";
                                                str2 = "ReconnectThread: use ws channel, channel is null";
                                            }
                                            gt3VarE.start();
                                        }
                                    } else {
                                        str5 = "ChannelManager";
                                        str6 = "ReconnectThread: reconnect failed, times=" + a.this.f10876b;
                                    }
                                    if (!a.this.c) {
                                        str3 = "ChannelManager";
                                        str4 = "ReconnectThread: don't do reconnect";
                                    } else if (a.this.f10875a.i().e("connection.keep_alive_type") != 0) {
                                        str3 = "ChannelManager";
                                        str4 = "ReconnectThread: don't KEEP_ALIVE_FOREVER";
                                    } else {
                                        synchronized (this) {
                                            this.f10878b = true;
                                        }
                                    }
                                }
                                wpe.b(str3, str4);
                                break;
                            }
                            str5 = "ChannelManager";
                            str6 = "ReconnectThread: network is not available";
                            wpe.k(str5, str6);
                            if (!a.this.c) {
                                str3 = "ChannelManager";
                                str4 = "ReconnectThread: don't do reconnect";
                            } else if (a.this.f10875a.i().e("connection.keep_alive_type") != 0) {
                                str3 = "ChannelManager";
                                str4 = "ReconnectThread: don't KEEP_ALIVE_FOREVER";
                            } else {
                                synchronized (this) {
                                    this.f10878b = true;
                                }
                            }
                            wpe.b(str3, str4);
                            break;
                        }
                        str = "ChannelManager";
                        str2 = "ReconnectThread: reconnect failed, channel is null";
                        wpe.e(str, str2);
                    } catch (Exception e2) {
                        wpe.e("ChannelManager", Log.getStackTraceString(e2));
                        synchronized (a.this) {
                            a.this.d = null;
                            wpe.b("ChannelManager", "ReconnectThread: set mReconnectThread=null");
                        }
                    }
                } catch (Throwable th) {
                    synchronized (a.this) {
                        a.this.d = null;
                        wpe.b("ChannelManager", "ReconnectThread: set mReconnectThread=null");
                        throw th;
                    }
                }
            }
            synchronized (a.this) {
                a.this.d = null;
                wpe.b("ChannelManager", "ReconnectThread: set mReconnectThread=null");
            }
            wpe.h("ChannelManager", "ReconnectRunnable end");
        }
    }

    public a(e eVar) {
        HashSet hashSet = new HashSet();
        this.f = hashSet;
        this.f10875a = eVar;
        hashSet.add(AIApiConstants.SpeechSynthesizer.Speak);
        this.f.add(AIApiConstants.SpeechSynthesizer.FinishSpeakStream);
    }

    public static /* synthetic */ int d(a aVar) {
        int i = aVar.f10876b;
        aVar.f10876b = i + 1;
        return i;
    }

    public void b() {
        wpe.h("ChannelManager", "release");
        synchronized (this) {
            try {
                this.e = true;
                this.c = false;
                b bVar = this.d;
                if (bVar != null) {
                    bVar.interrupt();
                    this.d = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.lt3
    public void detectUdpWeakNetwork(gt3 gt3Var, String str) {
        ConnectionCapability connectionCapability = (ConnectionCapability) this.f10875a.a(ConnectionCapability.class);
        if (connectionCapability != null) {
            connectionCapability.onDetectWeakNetwork(str);
        }
    }

    @Override // defpackage.lt3
    public void detectWeakNetwork(gt3 gt3Var) {
        if (!"xmd".equals(com.xiaomi.ai.android.utils.d.a(this.f10875a.j(), "aivs_cloud_control", "link_mode")) || yrs.b(onRead(gt3Var, "xmd_ws_expire_at"))) {
            return;
        }
        wpe.h("ChannelManager", "detectWeakNetwork: clear wss expire time in xmd mode");
        onRemove(gt3Var, "xmd_ws_expire_at");
    }

    @Override // defpackage.lt3
    public String getSpeechEventId() {
        return this.f10875a.m().a();
    }

    @Override // defpackage.lt3
    public boolean ipv6Available() {
        return NetworkUtils.ipv6Available();
    }

    @Override // defpackage.lt3
    public void onAuthExpired(gt3 gt3Var) {
        wpe.h("ChannelManager", "onAuthExpired");
    }

    @Override // defpackage.lt3
    public void onAuthRefreshed(gt3 gt3Var) {
        wpe.h("ChannelManager", "onAuthRefreshed");
    }

    @Override // defpackage.lt3
    public void onBinaryMessage(gt3 gt3Var, byte[] bArr) {
        if (this.f10875a.l() == null || (this.f10875a.i().b("connection.enable_only_offline_use_executor") && gt3Var.getType() != 3)) {
            a(bArr);
        } else {
            this.f10875a.l().a(bArr);
        }
    }

    @Override // defpackage.lt3
    public void onChangeChannel(gt3 gt3Var, int i) {
        this.f10875a.a(i, true);
    }

    @Override // defpackage.lt3
    public void onClear(gt3 gt3Var) {
        StorageCapability storageCapability = (StorageCapability) this.f10875a.a(StorageCapability.class);
        if (storageCapability != null) {
            storageCapability.clearKeyValue();
        }
    }

    @Override // defpackage.lt3
    public void onConnected(gt3 gt3Var) {
        wpe.h("ChannelManager", "onConnected");
        this.f10875a.k().removeCallbacksAndMessages(null);
        this.f10875a.n().b();
        this.f10875a.s().c();
        if (this.f10875a.i().e("connection.keep_alive_type") != 0) {
            this.f10875a.q().d();
        }
        if (this.f10875a.i().b("connection.enable_client_ping")) {
            this.f10875a.p().b();
        }
        ConnectionCapability connectionCapability = (ConnectionCapability) this.f10875a.a(ConnectionCapability.class);
        if (connectionCapability != null) {
            connectionCapability.onConnected();
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0068  */
    /* JADX WARN: Code duplicated, block: B:24:0x0074  */
    /* JADX WARN: Code duplicated, block: B:27:0x0083  */
    @Override // defpackage.lt3
    public void onDisconnected(gt3 gt3Var) {
        String str;
        String str2;
        ConnectionCapability connectionCapability;
        ErrorCapability errorCapability;
        wpe.e("ChannelManager", "onDisconnected");
        boolean z = false;
        this.f10875a.r().b(false);
        if (this.f10875a.i().b("connection.enable_client_ping")) {
            this.f10875a.p().a();
        }
        synchronized (this) {
            try {
                if (this.e) {
                    return;
                }
                if (this.d == null) {
                    z = true;
                    if (this.f10875a.i().e("connection.keep_alive_type") == 0) {
                        this.c = true;
                        b bVar = new b();
                        this.d = bVar;
                        bVar.b(true);
                        this.d.start();
                    } else {
                        str = "ChannelManager";
                        str2 = "onDisconnected: will not reconnect";
                    }
                    if (z) {
                        connectionCapability = (ConnectionCapability) this.f10875a.a(ConnectionCapability.class);
                        if (connectionCapability != null) {
                            connectionCapability.onDisconnected();
                        }
                        errorCapability = (ErrorCapability) this.f10875a.a(ErrorCapability.class);
                        if (errorCapability != null) {
                            errorCapability.onError(gt3Var.getError());
                        }
                    }
                    this.f10875a.s().d();
                    this.f10875a.m().c();
                    this.f10875a.q().a();
                }
                str = "ChannelManager";
                str2 = "onDisconnected: is already reconnecting or do not need reconnect";
                wpe.k(str, str2);
                if (z) {
                    connectionCapability = (ConnectionCapability) this.f10875a.a(ConnectionCapability.class);
                    if (connectionCapability != null) {
                        connectionCapability.onDisconnected();
                    }
                    errorCapability = (ErrorCapability) this.f10875a.a(ErrorCapability.class);
                    if (errorCapability != null) {
                        errorCapability.onError(gt3Var.getError());
                    }
                }
                this.f10875a.s().d();
                this.f10875a.m().c();
                this.f10875a.q().a();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.lt3
    public void onError(gt3 gt3Var, f01 f01Var) {
        wpe.e("ChannelManager", "onError:" + f01Var.a() + "," + f01Var.b());
        this.f10875a.r().b(false);
        b bVar = this.d;
        if (bVar != null && bVar.c()) {
            wpe.h("ChannelManager", " not callback error on backoff reconnect ");
            return;
        }
        ErrorCapability errorCapability = (ErrorCapability) this.f10875a.a(ErrorCapability.class);
        if (errorCapability != null) {
            wpe.e("ChannelManager", "capability.onError");
            errorCapability.onError(f01Var);
        }
        if (this.f10875a.s().b() > 0) {
            this.f10875a.s().d();
        }
    }

    @Override // defpackage.lt3
    public String onGetAuthorizationToken(gt3 gt3Var) {
        String str;
        wpe.h("ChannelManager", "onGetAuthorizationToken");
        AuthCapability authCapability = (AuthCapability) this.f10875a.a(AuthCapability.class);
        if (authCapability != null) {
            AuthCapability.AuthorizationTokens authorizationTokensOnGetAuthorizationTokens = authCapability.onGetAuthorizationTokens();
            if (authorizationTokensOnGetAuthorizationTokens != null) {
                gt3Var.getListener().onWrite(gt3Var, XiaomiOAuthConstants.EXTRA_ACCESS_TOKEN_2, authorizationTokensOnGetAuthorizationTokens.accessToken);
                gt3Var.getListener().onWrite(gt3Var, "refresh_token", authorizationTokensOnGetAuthorizationTokens.refreshToken);
                gt3Var.getListener().onWrite(gt3Var, "expire_at", String.format(TimeModel.NUMBER_FORMAT, Long.valueOf((System.currentTimeMillis() / 1000) + authorizationTokensOnGetAuthorizationTokens.expireIn)));
                gt3Var.getListener().onWrite(gt3Var, "refresh_at", String.format(TimeModel.NUMBER_FORMAT, Long.valueOf(System.currentTimeMillis() / 1000)));
                String str2 = authorizationTokensOnGetAuthorizationTokens.accessToken;
                if (yrs.b(str2)) {
                    gt3Var.updateTrack("sdk.connect.error.msg", "onGetAuthorizationToken error : emptyToken");
                }
                return str2;
            }
            gt3Var.updateTrack("sdk.connect.error.msg", "onGetAuthorizationToken error : authorizationTokens is null");
            str = "authorizationTokens is null";
        } else {
            gt3Var.updateTrack("sdk.connect.error.msg", "onGetAuthorizationToken error : capability is null");
            str = "onGetAuthorizationToken: AuthCapability was not registered";
        }
        wpe.e("ChannelManager", str);
        return null;
    }

    @Override // defpackage.lt3
    public String onGetNetworkType() {
        return NetworkUtils.getNetworkType(this.f10875a.j());
    }

    @Override // defpackage.lt3
    public String onGetOAuthCode(gt3 gt3Var) {
        wpe.h("ChannelManager", "onGetOAuthCode");
        AuthCapability authCapability = (AuthCapability) this.f10875a.a(AuthCapability.class);
        if (authCapability != null) {
            return authCapability.onGetOAuthCode();
        }
        wpe.e("ChannelManager", "onGetOAuthCode: AuthCapability was not registered");
        return null;
    }

    @Override // defpackage.lt3
    public int onGetSDKVersion(gt3 gt3Var) {
        int i = 0;
        try {
            String[] strArrSplit = "1.45.29".split(z.f14007a);
            i = (Integer.parseInt(strArrSplit[0]) * 1000000) + (Integer.parseInt(strArrSplit[1]) * 1000) + Integer.parseInt(strArrSplit[2]);
            wpe.b("ChannelManager", "onGetSDKVersion : " + i);
            return i;
        } catch (Exception e) {
            wpe.e("ChannelManager", wpe.o(e));
            return i;
        }
    }

    @Override // defpackage.lt3
    public String onGetSSID() {
        ConnectionCapability connectionCapability = (ConnectionCapability) this.f10875a.a(ConnectionCapability.class);
        if (connectionCapability != null) {
            return connectionCapability.onGetSSID();
        }
        return null;
    }

    @Override // defpackage.lt3
    public String onGetToken(gt3 gt3Var, boolean z) {
        wpe.h("ChannelManager", "onGetToken");
        AuthCapability authCapability = (AuthCapability) this.f10875a.a(AuthCapability.class);
        if (authCapability != null) {
            return authCapability.onGetToken(this.f10875a.d(), z);
        }
        wpe.e("ChannelManager", "onGetToken: AuthCapability was not registered");
        return null;
    }

    @Override // defpackage.lt3
    public void onInstruction(gt3 gt3Var, dcd dcdVar) {
        if (this.f10875a.l() == null || (this.f10875a.i().b("connection.enable_only_offline_use_executor") && gt3Var.getType() != 3)) {
            a(dcdVar, false);
        } else {
            this.f10875a.l().a(dcdVar.a());
        }
    }

    @Override // defpackage.lt3
    public String onRead(gt3 gt3Var, String str) {
        StorageCapability storageCapability = (StorageCapability) this.f10875a.a(StorageCapability.class);
        if (storageCapability == null) {
            return null;
        }
        String keyValue = storageCapability.readKeyValue(str);
        wpe.b("ChannelManager", "onRead: key=" + str + ", value=" + keyValue);
        return keyValue;
    }

    @Override // defpackage.lt3
    public void onRemove(gt3 gt3Var, String str) {
        StorageCapability storageCapability = (StorageCapability) this.f10875a.a(StorageCapability.class);
        if (storageCapability != null) {
            storageCapability.removeKeyValue(str);
        }
        wpe.b("ChannelManager", "onRemove: key=" + str);
    }

    @Override // defpackage.lt3
    public void onSendDataSuccess(long j, long j2) {
        this.f10875a.r().a(this.f10875a.m().a(), j2);
    }

    @Override // defpackage.lt3
    public void onSetTrackData(gt3 gt3Var, klp klpVar) {
        if (klpVar == null) {
            return;
        }
        wpe.b("ChannelManager", "onSetNetworkInfo");
        String networkType = NetworkUtils.getNetworkType(this.f10875a.j());
        klpVar.h("network", networkType);
        if (NetworkUtils.NETWORK_TYPE_WIFI.equals(networkType)) {
            klpVar.g("network.wifi.signal.level", NetworkUtils.getWifiLevel(this.f10875a.j()));
        } else {
            klpVar.h("network.data.carrier.type", NetworkUtils.getCurrentCarrierType(this.f10875a.j()));
        }
    }

    @Override // defpackage.lt3
    public boolean onWrite(gt3 gt3Var, String str, String str2) {
        wpe.b("ChannelManager", "onWrite: key=" + str + ", value=" + str2);
        StorageCapability storageCapability = (StorageCapability) this.f10875a.a(StorageCapability.class);
        return storageCapability != null && storageCapability.writeKeyValue(str, str2);
    }

    public void b(boolean z) {
        wpe.b("ChannelManager", "onNetworkAvailable");
        if (this.f10875a.i().e("connection.keep_alive_type") == 0 || !z) {
            a(z);
        }
    }

    public void a(dcd dcdVar, boolean z) {
        Instruction<?> instructionA = dcdVar.a();
        this.f10876b = 0;
        this.f10875a.r().f(instructionA);
        if (!this.f10875a.i().b("tts.decoded_by_client") && !z && this.f.contains(instructionA.getFullName())) {
            this.f10875a.n().a(instructionA);
        }
        if (this.f10875a.i().b("connection.enable_client_ping") && AIApiConstants.System.Pong.equals(instructionA.getFullName())) {
            this.f10875a.p().a(instructionA);
        } else {
            this.f10875a.k().obtainMessage(1, dcdVar).sendToTarget();
            this.f10875a.q().a(instructionA);
        }
    }

    public void a(boolean z) {
        String str;
        String str2;
        wpe.h("ChannelManager", "asyncConnect: is reconnect = " + z);
        synchronized (this) {
            try {
                gt3 gt3VarE = this.f10875a.e();
                if (!this.e && gt3VarE != null) {
                    if (gt3VarE.isConnected()) {
                        wpe.h("ChannelManager", "reconnect: already connected");
                        return;
                    }
                    b bVar = this.d;
                    if (bVar == null) {
                        this.f10876b = 0;
                        this.c = true;
                        b bVar2 = new b();
                        this.d = bVar2;
                        bVar2.b(z);
                        this.d.start();
                        str = "ChannelManager";
                        str2 = "reconnect: start new reconnect thread";
                    } else if (bVar.e()) {
                        this.f10876b = 0;
                        if (!z) {
                            this.d.b(false);
                        }
                        this.d.interrupt();
                        str = "ChannelManager";
                        str2 = "reconnect: interrupt reconnect thread";
                    } else {
                        str = "ChannelManager";
                        str2 = "reconnect: is already connecting";
                    }
                    wpe.h(str, str2);
                    return;
                }
                wpe.k("ChannelManager", "reconnect: already released");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a(byte[] bArr) {
        wpe.b("ChannelManager", "onBinaryMessage length=" + bArr.length);
        this.f10875a.r().h();
        if (this.f10875a.i().b("tts.decoded_by_client")) {
            this.f10875a.k().obtainMessage(2, bArr).sendToTarget();
        } else {
            this.f10875a.n().b(bArr);
        }
        this.f10875a.q().f();
    }

    public boolean a() {
        return this.d != null;
    }
}
