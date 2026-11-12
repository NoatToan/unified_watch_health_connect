package com.xiaomi.ai.core;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.xiaomi.ai.api.AIApiConstants;
import com.xiaomi.ai.api.Network;
import com.xiaomi.ai.api.Settings;
import com.xiaomi.ai.api.StdStatuses;
import com.xiaomi.ai.api.common.APIUtils;
import com.xiaomi.ai.api.common.Event;
import com.xiaomi.ai.api.common.Instruction;
import com.xiaomi.common.Optional;
import com.xiaomi.smarthome.library.apache.http.protocol.HTTP;
import com.xiaomi.wearable.hm.BroadcastsKt;
import defpackage.bf8;
import defpackage.c4h;
import defpackage.c9s;
import defpackage.d3s;
import defpackage.dcd;
import defpackage.e01;
import defpackage.e3s;
import defpackage.f01;
import defpackage.gt3;
import defpackage.klp;
import defpackage.l12;
import defpackage.lt3;
import defpackage.sis;
import defpackage.tq1;
import defpackage.ues;
import defpackage.w9s;
import defpackage.wpe;
import defpackage.yhe;
import defpackage.yrs;
import java.net.URI;
import java.net.URISyntaxException;
import java.security.GeneralSecurityException;
import java.util.Date;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import miuix.animation.internal.FolmeCore;

/* JADX INFO: loaded from: classes7.dex */
public class XMDChannel extends gt3 {
    private static final int DEFAULT_XMD_PORT = 9200;
    private static final int DNS_TIMEOUT = 5;
    private static final int MAX_BINARY_SEQUENCE = 9000000;
    private static final int MAX_CORE_SEQUENCE = 2000000;
    private static final int MAX_NORMAL_SEQUENCE = 4000000;
    private static final int MAX_OTHER_SEQUENCE = 6000000;
    private static final int MIN_BINARY_SEQUENCE = 7000000;
    private static final int MIN_CORE_SEQUENCE = 1000000;
    private static final int MIN_NORMAL_SEQUENCE = 3000000;
    private static final int MIN_OTHER_SEQUENCE = 5000000;
    private static final String TAG = "XMDChannel";
    private static volatile boolean mLibLoaded;
    private boolean isSendGlobalConfigSuccess;
    private boolean isSupportCompress;
    private Map<Long, Long> mBinaryDelayMap;
    private Map<Long, String> mBinaryDialogMap;
    private int mBinarySequenceId;
    private long mConnId;
    private volatile boolean mConnected;
    private int mCoreSequenceId;
    private int mDnsFailCount;
    private int mDnsFailTime;
    private int mErrorCode;
    private int mFailureCode;
    private yhe mInterceptor;
    private int mNormalSequenceId;
    private int mOtherSequenceId;
    private c4h mTrackProcess;
    private long mXmdInstance;

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f10997a;

        public a(long j) {
            this.f10997a = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f10997a != 0) {
                wpe.h(XMDChannel.TAG, "ReleaseXmdRunnable: release xmdInstance=" + this.f10997a);
                XMDChannel.this.release_xmd_instance(this.f10997a);
            }
        }
    }

    public enum b {
        EMPTY(0),
        AUTHORIZATION(1),
        AIVS_ENCRYPTION_CRC(2),
        AIVS_ENCRYPTION_KEY(3),
        AIVS_ENCRYPTION_TOKEN(4),
        DATE(5),
        USER_AGENT(6),
        HEARTBEAT_CLIENT(7),
        EVENT_RESEND_COUNT(8),
        BINARY_RESEND_COUNT(9),
        RESEND_DELAY(10),
        STREAM_WAIT_TIME(11),
        CONN_RESEND_COUNT(12),
        CONN_RESEND_DELAY(13),
        ENABLE_MTU_DETECT(14),
        SLICE_SIZE(15),
        XMD_CONNECT_PARAMS_NUM(16);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f11002a;

        b(int i) {
            this.f11002a = i;
        }
    }

    public XMDChannel(e01 e01Var, Settings.ClientInfo clientInfo, int i, lt3 lt3Var) {
        super(e01Var, clientInfo, i, lt3Var);
        this.mCoreSequenceId = 1000000;
        this.mNormalSequenceId = MIN_NORMAL_SEQUENCE;
        this.mOtherSequenceId = 5000000;
        this.mBinarySequenceId = 7000000;
        this.mConnId = 0L;
        this.isSupportCompress = true;
        this.isSendGlobalConfigSuccess = false;
        init();
    }

    private void changeWsNext(int i) {
        long jCurrentTimeMillis = (System.currentTimeMillis() / 1000) + ((long) i);
        getListener().onWrite(this, "xmd_ws_expire_at", String.valueOf(jCurrentTimeMillis));
        wpe.h(TAG, "switch from xmd to ws next time. Expire at:" + new Date(jCurrentTimeMillis * 1000).toString());
    }

    private long connectXMD(String str, int i, String[] strArr) {
        long j = this.mXmdInstance;
        if (j != 0) {
            return connect_xmd(j, str, i, strArr);
        }
        wpe.k(TAG, "connectXMD: not available");
        return -1L;
    }

    private native long connect_xmd(long j, String str, int i, String[] strArr);

    private native long create_xmd_instance();

    private String[] getXMDHeader(Map<String, String> map) {
        int i = b.XMD_CONNECT_PARAMS_NUM.f11002a;
        String[] strArr = new String[i];
        strArr[b.AUTHORIZATION.f11002a] = map.get("Authorization");
        strArr[b.AIVS_ENCRYPTION_CRC.f11002a] = map.get("AIVS-Encryption-CRC");
        strArr[b.AIVS_ENCRYPTION_KEY.f11002a] = map.get("AIVS-Encryption-Key");
        strArr[b.AIVS_ENCRYPTION_TOKEN.f11002a] = map.get("AIVS-Encryption-Token");
        strArr[b.DATE.f11002a] = map.get(HTTP.DATE_HEADER);
        strArr[b.USER_AGENT.f11002a] = this.mAivsConfig.j("connection.user_agent", "");
        strArr[b.HEARTBEAT_CLIENT.f11002a] = String.valueOf(this.mAivsConfig.e("connection.xmd_ping_interval"));
        strArr[b.EVENT_RESEND_COUNT.f11002a] = String.valueOf(this.mAivsConfig.e("connection.xmd_event_resend_count"));
        strArr[b.BINARY_RESEND_COUNT.f11002a] = String.valueOf(this.mAivsConfig.e("connection.xmd_binary_resend_count"));
        strArr[b.RESEND_DELAY.f11002a] = String.valueOf(this.mAivsConfig.e("connection.xmd_resend_delay"));
        strArr[b.STREAM_WAIT_TIME.f11002a] = String.valueOf(this.mAivsConfig.e("connection.xmd_stream_wait_time"));
        strArr[b.CONN_RESEND_COUNT.f11002a] = String.valueOf(this.mAivsConfig.e("connection.xmd_conn_resend_count"));
        strArr[b.CONN_RESEND_DELAY.f11002a] = String.valueOf(this.mAivsConfig.e("connection.xmd_conn_resend_delay"));
        strArr[b.ENABLE_MTU_DETECT.f11002a] = String.valueOf(this.mAivsConfig.b("connection.xmd_enable_mtu_detect") ? 1 : 0);
        strArr[b.SLICE_SIZE.f11002a] = String.valueOf(this.mAivsConfig.e("connection.xmd_slice_size"));
        if (wpe.l() == 3) {
            b[] bVarArrValues = b.values();
            for (int i2 = 1; i2 < i; i2++) {
                wpe.b(TAG, bVarArrValues[i2].name() + ": " + strArr[i2]);
            }
        }
        return strArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void handShake(Instruction instruction) {
        if (!AIApiConstants.Settings.ConnectionChallenge.equals(instruction.getHeader().getFullName())) {
            wpe.e(TAG, "handShake: failed at " + instruction);
            return;
        }
        wpe.h(TAG, "handShake: challenge id:" + instruction.getId());
        updateTrackTimestamp("sdk.connect.ws.recv.challenge", System.currentTimeMillis());
        Settings.ConnectionChallenge connectionChallenge = (Settings.ConnectionChallenge) instruction.getPayload();
        String challenge = connectionChallenge.getChallenge();
        Optional<String> aesToken = connectionChallenge.getAesToken();
        Optional<Integer> tokenExpiresIn = connectionChallenge.getTokenExpiresIn();
        if (aesToken.c() && tokenExpiresIn.c()) {
            this.mInterceptor.y(aesToken.b(), (((long) tokenExpiresIn.b().intValue()) * 1000) + System.currentTimeMillis());
        }
        Settings.ConnectionChallengeAck connectionChallengeAck = new Settings.ConnectionChallengeAck();
        connectionChallengeAck.setChallengeMd5(e3s.a(challenge));
        Event eventBuildEvent = APIUtils.buildEvent(connectionChallengeAck);
        updateTrackTimestamp("sdk.connect.ws.send.challengeack", System.currentTimeMillis());
        this.mCoreSequenceId = 1000000;
        this.isSendGlobalConfigSuccess = false;
        postEvent(eventBuildEvent);
        sendInitEvent();
        this.mConnected = true;
        wpe.h(TAG, "handShake:send ackString, ackEvent:" + eventBuildEvent.getId());
        updateTrackTimestamp("sdk.connect.finish", System.currentTimeMillis());
        getListener().onConnected(this);
        synchronized (this) {
            notify();
        }
    }

    private void init() {
        synchronized (XMDChannel.class) {
            try {
                if (!mLibLoaded) {
                    System.loadLibrary("xmd");
                    mLibLoaded = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        set_log_level(wpe.l());
        this.mInterceptor = new yhe(this);
        this.mHttpDns = new c9s(this, new d3s(this.mAivsConfig).i());
        this.mBinaryDelayMap = new ConcurrentHashMap();
        this.mBinaryDialogMap = new ConcurrentHashMap();
        this.mDnsFailCount = this.mAivsConfig.f("connection.dns_fail_count", 4);
        this.mDnsFailTime = this.mAivsConfig.f("connection.dns_fail_time", 2000);
    }

    private boolean onBinary(byte[] bArr, long j) {
        StringBuilder sb = new StringBuilder();
        sb.append("onBinary：");
        sb.append(bArr == null ? AbstractJsonLexerKt.NULL : Integer.valueOf(bArr.length));
        sb.append(", packetId: ");
        sb.append(j);
        wpe.h(TAG, sb.toString());
        try {
            getListener().onBinaryMessage(this, this.mInterceptor.l(2, bArr));
            return true;
        } catch (GeneralSecurityException | Exception e) {
            wpe.e(TAG, wpe.o(e));
            return false;
        }
    }

    private void onBind(boolean z) {
        this.isSupportCompress = z;
    }

    private boolean onError(int i, String str) {
        f01 f01Var;
        boolean z;
        int i2;
        wpe.e(TAG, "onError: code=" + i + ", msg=" + str + ", network=" + this.mListener.onGetNetworkType());
        this.mErrorCode = i;
        if (i == 99999) {
            z = false;
            try {
                i2 = Integer.parseInt(str);
            } catch (NumberFormatException e) {
                wpe.e(TAG, wpe.o(e));
                i2 = 0;
            }
            if ((i2 >= MIN_NORMAL_SEQUENCE && i2 <= MAX_NORMAL_SEQUENCE) || (i2 >= 7000000 && i2 <= MAX_BINARY_SEQUENCE)) {
                getListener().detectUdpWeakNetwork(this, this.mBinaryDialogMap.remove(Long.valueOf(i2)));
                return true;
            }
            if (i2 >= 5000000 && i2 <= 6000000) {
                changeWsNext(259200);
            }
            str = "drop sequenceId: " + str;
        } else {
            this.mFailureCode = processErrorMsg(this.mInterceptor, str);
            int i3 = this.mErrorCode;
            if (i3 == 401) {
                f01Var = new f01(401, str);
            } else {
                if (i3 == 500) {
                    f01Var = new f01(500, str);
                }
                z = true;
            }
            this.mLastError = f01Var;
            z = true;
        }
        if (i != 401 && i != 900 && i != 904 && i != 905 && i != 101 && i != 97 && z) {
            changeWsNext(this.mAivsConfig.e("connection.xmd_ws_expire_in"));
        }
        if (this.mConnected) {
            getListener().onDisconnected(this);
        }
        c4h c4hVar = this.mTrackProcess;
        if (c4hVar != null) {
            c4hVar.j0("msg", str + ", code=" + i + ", connId=" + this.mConnId);
        }
        klp klpVar = this.mTrackData;
        if (klpVar != null) {
            klpVar.h("sdk.connect.error.msg", str + ", code=" + i + ", connId=" + this.mConnId);
        }
        if (this.mConnected) {
            stop();
        } else {
            synchronized (this) {
                notify();
            }
        }
        return true;
    }

    private boolean onInstruction(byte[] bArr, long j) {
        try {
            String strA = this.isSupportCompress ? w9s.a(this.mInterceptor.l(2, bArr)) : new String(this.mInterceptor.l(2, l12.b(bArr, 0)));
            Instruction instruction = APIUtils.readInstruction(strA);
            String strB = instruction.getDialogId().c() ? instruction.getDialogId().b() : "";
            dcd dcdVar = new dcd(instruction, strA);
            wpe.h(TAG, "onInstruction: " + instruction.getFullName() + "," + strB + "," + j);
            if (this.mConnected) {
                getListener().onInstruction(this, dcdVar);
                return true;
            }
            handShake(instruction);
            return true;
        } catch (Exception e) {
            wpe.e(TAG, wpe.o(e));
            return false;
        }
    }

    public static void onLogger(int i, String str, String str2) {
        if (i == 0) {
            wpe.e(str, str2);
            return;
        }
        if (i == 1) {
            wpe.k(str, str2);
        } else if (i == 2) {
            wpe.h(str, str2);
        } else {
            if (i != 3) {
                return;
            }
            wpe.b(str, str2);
        }
    }

    private void onSendSuccess(long j) {
        wpe.h(TAG, "onSendSuccess: " + j);
        if (j < 7000000 || j > 9000000) {
            if (j == FolmeCore.NANOS_TO_MS) {
                this.isSendGlobalConfigSuccess = true;
            }
        } else {
            Long l = this.mBinaryDelayMap.get(Long.valueOf(j));
            this.mListener.onSendDataSuccess(j, l != null ? System.currentTimeMillis() - l.longValue() : 0L);
            this.mBinaryDelayMap.remove(Long.valueOf(j));
            this.mBinaryDialogMap.remove(Long.valueOf(j));
        }
    }

    private void onTrackEvent(String str, long j) {
        wpe.b(TAG, "onTrackEvent: key =" + str + ", timestamp=" + j);
        updateTrackTimestamp(str, j);
    }

    private native boolean post_data(long j, byte[] bArr, int i, int i2);

    private native boolean post_event(long j, byte[] bArr, int i, int i2);

    /* JADX INFO: Access modifiers changed from: private */
    public native boolean release_xmd_instance(long j);

    private native void reset(long j);

    private void sendInitEvent() {
        Event<Settings.GlobalConfig> initEvent = getInitEvent();
        wpe.h(TAG, "sendInitEvent:" + initEvent.getId());
        postEvent(initEvent);
    }

    private native void set_log_level(int i);

    public void finishTrack() {
        klp klpVar = this.mTrackData;
        if (klpVar != null) {
            klpVar.b();
        }
    }

    @Override // defpackage.gt3
    public String getChannelType() {
        return "xmd";
    }

    @Override // defpackage.gt3
    public int getErrorCode() {
        return this.mErrorCode;
    }

    @Override // defpackage.gt3
    public int getFailureCode() {
        return this.mFailureCode;
    }

    @Override // defpackage.gt3
    public int getType() {
        return 1;
    }

    @Override // defpackage.gt3
    public boolean isConnected() {
        if (this.mXmdInstance == 0) {
            return false;
        }
        return this.mConnected;
    }

    @Override // defpackage.gt3
    public synchronized boolean postData(byte[] bArr) {
        String strO;
        String str;
        if (this.mXmdInstance == 0) {
            wpe.e(TAG, "postData: not available");
            return false;
        }
        int i = this.mBinarySequenceId;
        if (i >= MAX_BINARY_SEQUENCE) {
            this.mBinarySequenceId = 7000000;
        } else {
            this.mBinarySequenceId = i + 1;
        }
        long j = i;
        this.mBinaryDelayMap.put(Long.valueOf(j), Long.valueOf(System.currentTimeMillis()));
        String speechEventId = this.mListener.getSpeechEventId();
        if (!yrs.b(speechEventId)) {
            this.mBinaryDialogMap.put(Long.valueOf(j), speechEventId);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("postData: length=");
        sb.append(bArr == null ? 0 : bArr.length);
        sb.append(",");
        sb.append(i);
        wpe.h(TAG, sb.toString());
        try {
            try {
                byte[] bArrL = this.mInterceptor.l(1, bArr);
                boolean zPost_data = post_data(this.mXmdInstance, bArrL, bArrL.length, i);
                if (!zPost_data) {
                    stop();
                }
                return zPost_data;
            } catch (Exception e) {
                strO = wpe.o(e);
                str = TAG;
                wpe.e(str, strO);
                return false;
            }
        } catch (GeneralSecurityException e2) {
            strO = wpe.o(e2);
            str = TAG;
            wpe.e(str, strO);
            return false;
        }
    }

    @Override // defpackage.gt3
    public synchronized boolean postEvent(bf8 bf8Var) {
        int i;
        if (this.mXmdInstance == 0) {
            wpe.e(TAG, "postEvent: not available");
            return false;
        }
        Event<?> eventA = bf8Var.a();
        updateGlobalConfig(eventA);
        if (AIApiConstants.System.Ack.equals(eventA.getFullName()) || AIApiConstants.General.ContextUpdate.equals(eventA.getFullName())) {
            i = this.mNormalSequenceId;
            if (i >= MAX_NORMAL_SEQUENCE) {
                this.mNormalSequenceId = MIN_NORMAL_SEQUENCE;
            } else {
                this.mNormalSequenceId = i + 1;
            }
        } else if (AIApiConstants.Settings.ConnectionChallengeAck.equals(eventA.getFullName())) {
            i = this.mOtherSequenceId;
            if (i >= 6000000) {
                this.mOtherSequenceId = 5000000;
            } else {
                this.mOtherSequenceId = i + 1;
            }
        } else {
            i = this.mCoreSequenceId;
            if (i >= MAX_CORE_SEQUENCE) {
                this.mCoreSequenceId = 1000000;
            } else {
                this.mCoreSequenceId = i + 1;
            }
        }
        int i2 = i;
        try {
            String strB = bf8Var.b();
            if (wpe.l() == 3) {
                wpe.b(TAG, "postEvent: sequenceId=" + i2 + " event: " + strB);
            } else {
                wpe.h(TAG, "postEvent: " + eventA.getFullName() + "," + eventA.getId() + "," + i2);
            }
            byte[] bArrL = this.isSupportCompress ? this.mInterceptor.l(1, w9s.c(strB)) : l12.f(this.mInterceptor.l(1, strB.getBytes()), 10).getBytes();
            boolean zPost_event = post_event(this.mXmdInstance, bArrL, bArrL.length, i2);
            if (!zPost_event) {
                stop();
            }
            return zPost_event;
        } catch (Exception e) {
            wpe.e(TAG, wpe.o(e));
            return false;
        }
    }

    public void reset() {
        long j = this.mXmdInstance;
        if (j == 0) {
            wpe.k(TAG, "reset: not available");
        } else if (this.isSendGlobalConfigSuccess) {
            reset(j);
        } else {
            wpe.h(TAG, "reset: isSendGlobalConfigSuccess is false");
        }
    }

    @Override // defpackage.gt3
    public boolean startConnect(boolean z) {
        String str;
        String str2;
        wpe.h(TAG, "startConnect");
        if (this.mXmdInstance != 0) {
            wpe.k(TAG, "start: already start");
            return true;
        }
        if (this.mAivsConfig.b("track.enable")) {
            klp klpVar = new klp(this.mTrackInfo);
            this.mTrackData = klpVar;
            this.mListener.onSetTrackData(this, klpVar);
            updateTrackTimestamp("sdk.connect.start", System.currentTimeMillis());
        }
        this.mConnected = false;
        String strName = Network.NetworkType.UNKNOWN.name();
        if (this.mClientInfo.getNetwork().c()) {
            strName = this.mClientInfo.getNetwork().b().name();
        }
        String strK = this.mHttpDns.k(strName);
        try {
            URI uri = new URI(strK);
            String host = uri.getHost();
            int port = uri.getPort();
            if (port == -1) {
                port = DEFAULT_XMD_PORT;
            }
            if (!sis.c(host)) {
                wpe.h(TAG, "resolve dns by url. " + host + ":" + port);
                long jCurrentTimeMillis = System.currentTimeMillis();
                for (int i = 0; System.currentTimeMillis() - jCurrentTimeMillis <= this.mDnsFailTime && i < this.mDnsFailCount; i++) {
                    wpe.b(TAG, "resolveHostName count:" + i);
                    host = sis.a(host, 5);
                    if (host != null) {
                        break;
                    }
                }
                if (host == null) {
                    wpe.e(TAG, "resolve dns failed");
                    updateTrack("sdk.connect.error.msg", "resolve dns failed");
                    str = "sdk.connect.error.step";
                    str2 = "exception";
                }
                updateTrack(str, str2);
                updateTrack("sdk.connect.result", "failed");
                return false;
            }
            Map<String, String> mapX = this.mInterceptor.x(z);
            if (mapX == null) {
                wpe.e(TAG, "startConnect: headers is null");
                this.mLastError = this.mAuthProvider.getLastError();
                str = "sdk.connect.error.step";
                str2 = "gettoken";
                updateTrack(str, str2);
                updateTrack("sdk.connect.result", "failed");
                return false;
            }
            if (this.mAivsConfig.b("track.enable")) {
                c4h c4hVarCreateObjectNode = APIUtils.getObjectMapper().createObjectNode();
                this.mTrackProcess = c4hVarCreateObjectNode;
                c4hVarCreateObjectNode.j0("type", "connect");
                this.mTrackProcess.j0("url", strK);
            }
            this.mXmdInstance = create_xmd_instance();
            this.mConnId = connectXMD(host, port, getXMDHeader(mapX));
            wpe.h(TAG, "connId=" + this.mConnId);
            updateTrackTimestamp("sdk.connect.ws.start", System.currentTimeMillis());
            int iF = this.mAivsConfig.f("connection.connect_timeout", 5);
            synchronized (this) {
                try {
                    wait(((long) iF) * 1000);
                } catch (InterruptedException e) {
                    wpe.e(TAG, wpe.o(e));
                }
            }
            if (this.mConnected) {
                c4h c4hVar = this.mTrackProcess;
                if (c4hVar != null) {
                    c4hVar.g0("result", 0);
                    this.mTrackProcess.h0("timestamp", System.currentTimeMillis());
                    addTrackProcess(this.mTrackProcess);
                    this.mTrackProcess = null;
                }
            } else {
                wpe.e(TAG, "start failed");
                stop();
                if (getErrorCode() != 401) {
                    this.mHttpDns.g(strName);
                }
                c4h c4hVar2 = this.mTrackProcess;
                if (c4hVar2 != null) {
                    c4hVar2.g0("result", -1);
                    this.mTrackProcess.h0("timestamp", System.currentTimeMillis());
                    if (!this.mTrackProcess.A("msg")) {
                        this.mTrackProcess.j0("msg", "connection time out at " + strK + ", connId=" + this.mConnId);
                    }
                    klp klpVar2 = this.mTrackData;
                    if (klpVar2 != null && !klpVar2.c().A("sdk.connect.error.msg")) {
                        updateTrack("sdk.connect.error.msg", "connection time out at " + strK + ", connId=" + this.mConnId);
                    }
                    addTrackProcess(this.mTrackProcess);
                    updateTrack("sdk.connect.error.step", "connect");
                    updateTrackTimestamp("sdk.disconnect", System.currentTimeMillis());
                    this.mTrackProcess = null;
                }
            }
            updateTrack("sdk.connect.result", this.mConnected ? "success" : "failed");
            if (this.mTrackData != null && this.mConnected) {
                this.mTrackData.b();
            }
            return this.mConnected;
        } catch (URISyntaxException e2) {
            wpe.e(TAG, wpe.o(e2));
            this.mHttpDns.n(strName, "xmd_dns_cache");
            updateTrack("sdk.connect.error.msg", e2.getMessage());
        }
    }

    @Override // defpackage.gt3
    public synchronized void stop() {
        wpe.h(TAG, BroadcastsKt.SILENT_PUSHING_STOP);
        long j = this.mXmdInstance;
        if (j == 0) {
            wpe.k(TAG, "stop：not available");
            return;
        }
        ues.f35695a.execute(new a(j));
        this.mXmdInstance = 0L;
        this.mBinaryDelayMap.clear();
        this.mBinaryDialogMap.clear();
        if (!this.mConnected) {
            synchronized (this) {
                notify();
            }
        }
        this.mConnected = false;
    }

    public XMDChannel(e01 e01Var, Settings.ClientInfo clientInfo, tq1 tq1Var, lt3 lt3Var) {
        super(e01Var, clientInfo, tq1Var, lt3Var);
        this.mCoreSequenceId = 1000000;
        this.mNormalSequenceId = MIN_NORMAL_SEQUENCE;
        this.mOtherSequenceId = 5000000;
        this.mBinarySequenceId = 7000000;
        this.mConnId = 0L;
        this.isSupportCompress = true;
        this.isSendGlobalConfigSuccess = false;
        init();
    }

    @Override // defpackage.gt3
    public synchronized boolean postData(byte[] bArr, int i, int i2) {
        if (this.mXmdInstance == 0) {
            wpe.e(TAG, "postData2: not available");
            return false;
        }
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return postData(bArr2);
    }

    @Override // defpackage.gt3
    public synchronized boolean postEvent(Event event) {
        try {
        } catch (JsonProcessingException e) {
            wpe.e(TAG, "postEvent: post event failed, required field not set");
            wpe.e(TAG, wpe.o(e));
            getListener().onError(this, new f01(StdStatuses.MISSING_PARAMETER, "required field not set"));
            return false;
        }
        return postEvent(new bf8(event, event.toJsonString()));
    }
}
