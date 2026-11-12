package com.xiaomi.ai.core;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.huami.core.device.wifi_settings.ui.WifiSetActivity;
import com.huami.watch.companion.mediac.Command;
import com.xiaomi.ai.api.AIApiConstants;
import com.xiaomi.ai.api.Network;
import com.xiaomi.ai.api.Settings;
import com.xiaomi.ai.api.StdStatuses;
import com.xiaomi.ai.api.common.APIUtils;
import com.xiaomi.ai.api.common.Event;
import com.xiaomi.ai.api.common.Instruction;
import com.xiaomi.ai.b.f;
import com.xiaomi.ai.error.AivsError;
import com.xiaomi.ai.log.Logger;
import com.xiaomi.ai.track.TrackData;
import com.xiaomi.ai.transport.LiteCryptInterceptor;
import com.xiaomi.common.Optional;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.security.GeneralSecurityException;
import java.util.Map;

/* JADX INFO: loaded from: classes18.dex */
public class XMDChannel extends com.xiaomi.ai.core.a {
    private static final int DEFAULT_XMD_PORT = 9200;
    private static final int MAX_BINARY_SEQUENCE = 9000000;
    private static final int MAX_CORE_SEQUENCE = 3000000;
    private static final int MAX_NORMAL_SEQUENCE = 5000000;
    private static final int MIN_BINARY_SEQUENCE = 6000000;
    private static final int MIN_CORE_SEQUENCE = 0;
    private static final int MIN_NORMAL_SEQUENCE = 4000000;
    private static final String TAG = "XMDChannel";
    private static volatile boolean mLibLoaded;
    private int mBinarySequenceId;
    private long mConnId;
    private volatile boolean mConnected;
    private int mCoreSequenceId;
    private int mErrorCode;
    private int mFailureCode;
    private LiteCryptInterceptor mInterceptor;
    private int mNormalSequenceId;
    private ObjectNode mTrackProcess;
    private long mXmdInstance;

    public class a implements Runnable {
        private long b;

        public a(long j) {
            this.b = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.b != 0) {
                Logger.b(XMDChannel.TAG, "ReleaseXmdRunnable: release xmdInstance=" + this.b);
                XMDChannel.this.release_xmd_instance(this.b);
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
        XMD_CONNECT_PARAMS_NUM(12);

        private final int n;

        b(int i) {
            this.n = i;
        }
    }

    public XMDChannel(AivsConfig aivsConfig, Settings.ClientInfo clientInfo, int i, com.xiaomi.ai.core.b bVar) {
        super(aivsConfig, clientInfo, i, bVar);
        this.mCoreSequenceId = 1;
        this.mNormalSequenceId = MIN_NORMAL_SEQUENCE;
        this.mBinarySequenceId = 6000000;
        this.mConnId = 0L;
        init();
    }

    public XMDChannel(AivsConfig aivsConfig, Settings.ClientInfo clientInfo, com.xiaomi.ai.a.a aVar, com.xiaomi.ai.core.b bVar) {
        super(aivsConfig, clientInfo, aVar, bVar);
        this.mCoreSequenceId = 1;
        this.mNormalSequenceId = MIN_NORMAL_SEQUENCE;
        this.mBinarySequenceId = 6000000;
        this.mConnId = 0L;
        init();
    }

    private long connectXMD(String str, int i, String[] strArr) {
        long j = this.mXmdInstance;
        if (j != 0) {
            return connect_xmd(j, str, i, strArr);
        }
        Logger.c(TAG, "connectXMD: not available");
        return -1L;
    }

    private native long connect_xmd(long j, String str, int i, String[] strArr);

    private native long create_xmd_instance();

    private String[] getXMDHeader(Map<String, String> map) {
        String[] strArr = new String[b.XMD_CONNECT_PARAMS_NUM.n];
        strArr[b.AUTHORIZATION.n] = map.get("Authorization");
        strArr[b.AIVS_ENCRYPTION_CRC.n] = map.get("AIVS-Encryption-CRC");
        strArr[b.AIVS_ENCRYPTION_KEY.n] = map.get("AIVS-Encryption-Key");
        strArr[b.AIVS_ENCRYPTION_TOKEN.n] = map.get("AIVS-Encryption-Token");
        strArr[b.DATE.n] = map.get("Date");
        strArr[b.USER_AGENT.n] = this.mAivsConfig.getString(AivsConfig.Connection.USER_AGENT, "");
        strArr[b.HEARTBEAT_CLIENT.n] = String.valueOf(this.mAivsConfig.getInt(AivsConfig.Connection.XMD_PING_INTERVAL));
        strArr[b.EVENT_RESEND_COUNT.n] = String.valueOf(this.mAivsConfig.getInt(AivsConfig.Connection.XMD_EVENT_RESEND_COUNT));
        strArr[b.BINARY_RESEND_COUNT.n] = String.valueOf(this.mAivsConfig.getInt(AivsConfig.Connection.XMD_BINARY_RESEND_COUNT));
        strArr[b.RESEND_DELAY.n] = String.valueOf(this.mAivsConfig.getInt(AivsConfig.Connection.XMD_RESEND_DELAY));
        strArr[b.STREAM_WAIT_TIME.n] = String.valueOf(this.mAivsConfig.getInt(AivsConfig.Connection.XMD_STREAM_WAIT_TIME));
        return strArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void handShake(Instruction instruction) {
        if (!AIApiConstants.Settings.ConnectionChallenge.equals(instruction.getHeader().getFullName())) {
            Logger.d(TAG, "handShake: failed at " + instruction);
            return;
        }
        Logger.b(TAG, "handShake: challenge id:" + instruction.getId());
        updateTrackTimestamp("sdk.connect.ws.recv.challenge", System.currentTimeMillis());
        Settings.ConnectionChallenge connectionChallenge = (Settings.ConnectionChallenge) instruction.getPayload();
        String challenge = connectionChallenge.getChallenge();
        Optional<String> aesToken = connectionChallenge.getAesToken();
        Optional<Integer> tokenExpiresIn = connectionChallenge.getTokenExpiresIn();
        if (aesToken.isPresent() && tokenExpiresIn.isPresent()) {
            this.mInterceptor.updateAesToken(aesToken.get(), (((long) tokenExpiresIn.get().intValue()) * 1000) + System.currentTimeMillis());
        }
        Settings.ConnectionChallengeAck connectionChallengeAck = new Settings.ConnectionChallengeAck();
        connectionChallengeAck.setChallengeMd5(com.xiaomi.ai.b.b.a(challenge));
        Event eventBuildEvent = APIUtils.buildEvent(connectionChallengeAck);
        updateTrackTimestamp("sdk.connect.ws.send.challengeack", System.currentTimeMillis());
        postEvent(eventBuildEvent);
        sendInitEvent();
        this.mConnected = true;
        Logger.b(TAG, "handShake:send ackString, ackEvent:" + eventBuildEvent.getId());
        updateTrackTimestamp("sdk.connect.finish", System.currentTimeMillis());
        getListener().e(this);
        synchronized (this) {
            notify();
        }
    }

    private void init() {
        synchronized (XMDChannel.class) {
            if (!mLibLoaded) {
                System.loadLibrary("xmd");
                mLibLoaded = true;
            }
        }
        set_log_level(Logger.getLogLevel());
        this.mInterceptor = new LiteCryptInterceptor(this);
        this.mHttpDns = new com.xiaomi.ai.transport.b(this, new c(this.mAivsConfig).c());
    }

    private boolean onBinary(byte[] bArr, long j) {
        StringBuilder sb = new StringBuilder();
        sb.append("onBinary：");
        sb.append(bArr == null ? "null" : Integer.valueOf(bArr.length));
        sb.append(", packetId: ");
        sb.append(j);
        Logger.b(TAG, sb.toString());
        try {
            getListener().a(this, this.mInterceptor.aesCrypt(2, bArr));
            return true;
        } catch (GeneralSecurityException e) {
            Logger.d(TAG, Logger.throwableToString(e));
            return false;
        }
    }

    private boolean onError(int i, String str) {
        AivsError aivsError;
        Logger.d(TAG, "onError: code=" + i + ", msg=" + str);
        this.mErrorCode = i;
        if (i == 99999) {
            int i2 = 0;
            try {
                i2 = Integer.parseInt(str);
            } catch (NumberFormatException e) {
                Logger.d(TAG, Logger.throwableToString(e));
            }
            if ((i2 >= MIN_NORMAL_SEQUENCE && i2 <= 5000000) || (i2 >= 6000000 && i2 <= MAX_BINARY_SEQUENCE)) {
                return true;
            }
            str = "drop sequenceId: " + str;
        } else {
            this.mFailureCode = processErrorMsg(this.mInterceptor, str);
            int i3 = this.mErrorCode;
            if (i3 == 401) {
                aivsError = new AivsError(401, str);
            } else if (i3 == 500) {
                aivsError = new AivsError(500, str);
            }
            this.mLastError = aivsError;
        }
        if (this.mConnected) {
            getListener().f(this);
        }
        ObjectNode objectNode = this.mTrackProcess;
        if (objectNode != null) {
            objectNode.put("msg", str + ", code=" + i + ", connId=" + this.mConnId);
        }
        TrackData trackData = this.mTrackData;
        if (trackData != null) {
            trackData.set("sdk.connect.error.msg", str + ", code=" + i + ", connId=" + this.mConnId);
        }
        synchronized (this) {
            if (this.mConnected) {
                stop();
            } else {
                notify();
            }
        }
        return true;
    }

    private boolean onInstruction(String str, long j) {
        try {
            Instruction instruction = APIUtils.readInstruction(new String(this.mInterceptor.aesCrypt(2, com.xiaomi.ai.b.a.a(str.getBytes(), 0))));
            Logger.b(TAG, "onInstruction:" + instruction.getFullName() + "," + (instruction.getDialogId().isPresent() ? instruction.getDialogId().get() : "") + ", packetId: " + j);
            if (this.mConnected) {
                getListener().a(this, instruction);
                return true;
            }
            handShake(instruction);
            return true;
        } catch (IOException | GeneralSecurityException e) {
            Logger.d(TAG, Logger.throwableToString(e));
            return false;
        }
    }

    public static void onLogger(int i, String str, String str2) {
        if (i == 0) {
            Logger.d(str, str2);
            return;
        }
        if (i == 1) {
            Logger.c(str, str2);
        } else if (i == 2) {
            Logger.b(str, str2);
        } else {
            if (i != 3) {
                return;
            }
            Logger.a(str, str2);
        }
    }

    private void onSendSuccess(long j) {
        Logger.b(TAG, "onSendSuccess: " + j);
        if (j < 6000000 || j > 9000000) {
            return;
        }
        this.mListener.a(j);
    }

    private void onTrackEvent(String str, long j) {
        Logger.a(TAG, "onTrackEvent: key =" + str + ", timestamp=" + j);
        updateTrackTimestamp(str, j);
    }

    private native boolean post_data(long j, byte[] bArr, int i, int i2);

    private native boolean post_event(long j, String str, int i);

    /* JADX INFO: Access modifiers changed from: private */
    public native boolean release_xmd_instance(long j);

    private void sendInitEvent() {
        Event<Settings.GlobalConfig> initEvent = getInitEvent();
        Logger.b(TAG, "sendInitEvent:" + initEvent.getId());
        postEvent(initEvent);
    }

    private native void set_log_level(int i);

    @Override // com.xiaomi.ai.core.a
    public String getChannelType() {
        return "xmd";
    }

    @Override // com.xiaomi.ai.core.a
    public int getErrorCode() {
        return this.mErrorCode;
    }

    @Override // com.xiaomi.ai.core.a
    public int getFailureCode() {
        return this.mFailureCode;
    }

    @Override // com.xiaomi.ai.core.a
    public synchronized boolean isConnected() {
        if (this.mXmdInstance == 0) {
            Logger.d(TAG, "isConnected: not available");
            return false;
        }
        return this.mConnected;
    }

    @Override // com.xiaomi.ai.core.a
    public synchronized boolean postData(byte[] bArr) {
        if (this.mXmdInstance == 0) {
            Logger.d(TAG, "postData: not available");
            return false;
        }
        int i = this.mBinarySequenceId;
        if (i >= MAX_BINARY_SEQUENCE) {
            this.mBinarySequenceId = 6000000;
        } else {
            this.mBinarySequenceId = i + 1;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("postData :sequenceId=");
        sb.append(i);
        sb.append(" length=");
        sb.append(bArr == null ? 0 : bArr.length);
        Logger.b(TAG, sb.toString());
        try {
            byte[] bArrAesCrypt = this.mInterceptor.aesCrypt(1, bArr);
            return post_data(this.mXmdInstance, bArrAesCrypt, bArrAesCrypt.length, i);
        } catch (GeneralSecurityException e) {
            Logger.d(TAG, Logger.throwableToString(e));
            return false;
        }
    }

    @Override // com.xiaomi.ai.core.a
    public synchronized boolean postData(byte[] bArr, int i, int i2) {
        if (this.mXmdInstance == 0) {
            Logger.d(TAG, "postData2: not available");
            return false;
        }
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return postData(bArr2);
    }

    @Override // com.xiaomi.ai.core.a
    public synchronized boolean postEvent(Event event) {
        int i;
        try {
            if (this.mXmdInstance == 0) {
                Logger.d(TAG, "postEvent: not available");
                return false;
            }
            updateGlobalConfig(event);
            if (AIApiConstants.System.Ack.equals(event.getFullName())) {
                i = this.mNormalSequenceId;
                if (i >= 5000000) {
                    this.mNormalSequenceId = MIN_NORMAL_SEQUENCE;
                } else {
                    this.mNormalSequenceId = i + 1;
                }
            } else {
                i = this.mCoreSequenceId;
                if (i >= MAX_CORE_SEQUENCE) {
                    this.mCoreSequenceId = 1;
                } else {
                    this.mCoreSequenceId = i + 1;
                }
            }
            try {
                String jsonString = event.toJsonString();
                if (Logger.getLogLevel() == 3) {
                    Logger.a(TAG, "postEvent :sequenceId=" + i + " event: " + jsonString);
                } else {
                    Logger.b(TAG, "postEvent :sequenceId=" + i + " event: " + event.getFullName() + "," + event.getId());
                }
                return post_event(this.mXmdInstance, com.xiaomi.ai.b.a.b(this.mInterceptor.aesCrypt(1, jsonString.getBytes()), 10), i);
            } catch (JsonProcessingException e) {
                Logger.d(TAG, Logger.throwableToString(e));
                getListener().a(this, new AivsError(StdStatuses.MISSING_PARAMETER, "required field not set"));
                return false;
            } catch (GeneralSecurityException e2) {
                Logger.d(TAG, Logger.throwableToString(e2));
                return false;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.xiaomi.ai.core.a
    public boolean startConnect(boolean z) {
        if (this.mXmdInstance != 0) {
            Logger.c(TAG, "start: already start");
            return true;
        }
        if (this.mAivsConfig.getBoolean(AivsConfig.Track.ENABLE)) {
            TrackData trackData = new TrackData(this.mTrackInfo);
            this.mTrackData = trackData;
            this.mListener.a(this, trackData);
            updateTrackTimestamp("sdk.connect.start", System.currentTimeMillis());
        }
        this.mConnected = false;
        String strName = Network.NetworkType.UNKNOWN.name();
        if (this.mClientInfo.getNetwork().isPresent()) {
            strName = this.mClientInfo.getNetwork().get().name();
        }
        String strA = this.mHttpDns.a(strName);
        try {
            URI uri = new URI(strA);
            String host = uri.getHost();
            int port = uri.getPort();
            if (port == -1) {
                port = DEFAULT_XMD_PORT;
            }
            if (!com.xiaomi.ai.b.d.a(host)) {
                Logger.b(TAG, "resolve dns by url " + host + ":" + port);
                host = com.xiaomi.ai.b.d.a(host, 5);
                if (host == null) {
                    Logger.d(TAG, "resolve dns failed");
                    updateTrack("sdk.connect.error.msg", "resolve dns failed");
                    updateTrack("sdk.connect.error.step", Constants.EXCEPTION);
                    updateTrack("sdk.connect.result", "failed");
                    TrackData trackData2 = this.mTrackData;
                    if (trackData2 != null) {
                        trackData2.finishTrack();
                    }
                    return false;
                }
            }
            this.mXmdInstance = create_xmd_instance();
            Map<String, String> authHeaders = this.mInterceptor.getAuthHeaders(z);
            if (authHeaders == null) {
                Logger.d(TAG, "startConnect: headers is null");
                this.mLastError = this.mAuthProvider.a();
                updateTrack("sdk.connect.error.step", "gettoken");
                updateTrack("sdk.connect.result", "failed");
                TrackData trackData3 = this.mTrackData;
                if (trackData3 != null) {
                    trackData3.finishTrack();
                }
                return false;
            }
            Logger.a(TAG, "authHeaders: " + f.a(authHeaders));
            this.mConnId = connectXMD(host, port, getXMDHeader(authHeaders));
            Logger.c(TAG, "xmd connect ip=" + host + ", port=" + port + ", connectionId=" + this.mConnId);
            updateTrackTimestamp("sdk.connect.ws.start", System.currentTimeMillis());
            if (this.mAivsConfig.getBoolean(AivsConfig.Track.ENABLE)) {
                ObjectNode objectNodeCreateObjectNode = APIUtils.getObjectMapper().createObjectNode();
                this.mTrackProcess = objectNodeCreateObjectNode;
                objectNodeCreateObjectNode.put("type", WifiSetActivity.KEY_CONNECT);
                this.mTrackProcess.put("url", strA);
            }
            int i = this.mAivsConfig.getInt(AivsConfig.Connection.CONNECT_TIMEOUT, 5);
            synchronized (this) {
                try {
                    wait(((long) i) * 1000);
                } catch (InterruptedException e) {
                    Logger.d(TAG, Logger.throwableToString(e));
                }
            }
            if (this.mConnected) {
                ObjectNode objectNode = this.mTrackProcess;
                if (objectNode != null) {
                    objectNode.put("result", 0);
                    this.mTrackProcess.put("timestamp", System.currentTimeMillis());
                    addTrackProcess(this.mTrackProcess);
                    this.mTrackProcess = null;
                }
            } else {
                Logger.d(TAG, "start failed");
                stop();
                if (getErrorCode() != 401) {
                    this.mHttpDns.b(strName);
                }
                ObjectNode objectNode2 = this.mTrackProcess;
                if (objectNode2 != null) {
                    objectNode2.put("result", -1);
                    this.mTrackProcess.put("timestamp", System.currentTimeMillis());
                    if (!this.mTrackProcess.hasNonNull("msg")) {
                        this.mTrackProcess.put("msg", "connection time out at " + strA + ", connId=" + this.mConnId);
                    }
                    TrackData trackData4 = this.mTrackData;
                    if (trackData4 != null && !trackData4.getJsonNode().hasNonNull("sdk.connect.error.msg")) {
                        updateTrack("sdk.connect.error.msg", "connection time out at " + strA + ", connId=" + this.mConnId);
                    }
                    addTrackProcess(this.mTrackProcess);
                    updateTrack("sdk.connect.error.step", WifiSetActivity.KEY_CONNECT);
                    updateTrackTimestamp("sdk.disconnect", System.currentTimeMillis());
                    this.mTrackProcess = null;
                }
            }
            updateTrack("sdk.connect.result", this.mConnected ? "success" : "failed");
            TrackData trackData5 = this.mTrackData;
            if (trackData5 != null) {
                trackData5.finishTrack();
            }
            return this.mConnected;
        } catch (URISyntaxException e2) {
            Logger.d(TAG, Logger.throwableToString(e2));
            this.mHttpDns.b(strName, "xmd_dns_cache");
            updateTrack("sdk.connect.error.msg", e2.getMessage());
            updateTrack("sdk.connect.error.step", Constants.EXCEPTION);
            updateTrack("sdk.connect.result", "failed");
            TrackData trackData6 = this.mTrackData;
            if (trackData6 != null) {
                trackData6.finishTrack();
            }
            return false;
        }
    }

    @Override // com.xiaomi.ai.core.a
    public synchronized void stop() {
        Logger.b(TAG, Command.STOP);
        long j = this.mXmdInstance;
        if (j == 0) {
            Logger.c(TAG, "stop：not available");
            return;
        }
        com.xiaomi.ai.b.c.a.execute(new a(j));
        this.mXmdInstance = 0L;
        if (!this.mConnected) {
            synchronized (this) {
                notify();
            }
        }
        this.mConnected = false;
    }
}
