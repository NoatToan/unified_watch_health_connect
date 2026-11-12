package defpackage;

import com.xiaomi.account.openauth.XiaomiOAuthConstants;
import com.xiaomi.ai.api.AIApiConstants;
import com.xiaomi.ai.api.Settings;
import com.xiaomi.ai.api.StdStatuses;
import com.xiaomi.ai.api.common.APIUtils;
import com.xiaomi.ai.api.common.Event;
import com.xiaomi.ai.core.XMDChannel;
import com.xiaomi.common.Optional;
import com.xiaomi.fitness.login.region.RegionManagerImpl;
import com.xiaomi.fitness.statistics.StatConstants;
import java.io.IOException;

/* JADX INFO: loaded from: classes7.dex */
public abstract class gt3 {
    public static final int AUTH_APP_ANONYMOUS = 5;
    public static final int AUTH_APP_OAUTH = 4;
    public static final int AUTH_DEVICE_ANONYMOUS = 6;
    public static final int AUTH_DEVICE_OAUTH = 1;
    public static final int AUTH_DEVICE_TOKEN = 3;
    public static final int AUTH_MIOT = 2;
    public static final int AUTH_SERVER = 7;
    private static final String TAG = "Channel";
    protected e01 mAivsConfig;
    protected tq1 mAuthProvider;
    protected int mAuthType;
    protected Settings.ClientInfo mClientInfo;
    protected c9s mHttpDns;
    protected lt3 mListener;
    protected klp mTrackData;
    protected nnp mTrackInfo;
    protected f01 mLastError = null;
    private boolean isTryAgain = false;

    /* JADX WARN: Code duplicated, block: B:18:0x004b  */
    public gt3(e01 e01Var, Settings.ClientInfo clientInfo, int i, lt3 lt3Var) {
        tq1 resVar;
        this.mAivsConfig = e01Var;
        this.mClientInfo = clientInfo;
        this.mAuthType = i;
        this.mListener = lt3Var;
        if (i == 1) {
            resVar = new res(i, this);
        } else if (i == 2) {
            resVar = new v9s(this);
        } else if (i == 3) {
            resVar = new c3s(this);
        } else if (i == 4) {
            resVar = new res(i, this);
        } else {
            if (i != 7) {
                throw new IllegalArgumentException("Channel: unsupported authType=" + i);
            }
            resVar = new cjs(this);
        }
        this.mAuthProvider = resVar;
    }

    public static String buildStorageId(int i, String str, String str2) {
        StringBuilder sb;
        String str3;
        switch (i) {
            case 1:
                sb = new StringBuilder();
                str3 = "DO-TOKEN-V1_";
                break;
            case 2:
                sb = new StringBuilder();
                str3 = "MIOT-TOKEN-V1_";
                break;
            case 3:
                sb = new StringBuilder();
                str3 = "TP-TOKEN-V1_";
                break;
            case 4:
                sb = new StringBuilder();
                str3 = "AO-TOKEN-V1_";
                break;
            case 5:
                sb = new StringBuilder();
                str3 = "AA-TOKEN-V1_";
                break;
            case 6:
                sb = new StringBuilder();
                str3 = "DAA-TOKEN-V1_";
                break;
            case 7:
                sb = new StringBuilder();
                str3 = "DS-SIGNATURE-V1_";
                break;
            default:
                throw new IllegalArgumentException("buildStorageId: unknown authType=" + i);
        }
        sb.append(str3);
        sb.append(str);
        sb.append(RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR);
        sb.append(str2);
        return sb.toString();
    }

    private Settings.AsrConfig getAsrConfig() {
        boolean z;
        Settings.AudioFormat audioFormat = new Settings.AudioFormat();
        audioFormat.setCodec(this.mAivsConfig.j("asr.codec", "PCM"));
        audioFormat.setBits(this.mAivsConfig.f("asr.bits", 16));
        audioFormat.setRate(this.mAivsConfig.f("asr.bitrate", 16000));
        audioFormat.setChannel(this.mAivsConfig.f("asr.channel", 1));
        Settings.AsrTuningParams asrTuningParams = new Settings.AsrTuningParams();
        if (this.mAivsConfig.a("asr.vendor")) {
            asrTuningParams.setVendor(this.mAivsConfig.i("asr.vendor"));
            z = true;
        } else {
            z = false;
        }
        if (this.mAivsConfig.a("asr.max_audio_seconds")) {
            asrTuningParams.setMaxAudioSeconds(this.mAivsConfig.f("asr.max_audio_seconds", 30));
            z = true;
        }
        if (this.mAivsConfig.a("asr.enable_timeout")) {
            asrTuningParams.setEnableTimeout(this.mAivsConfig.c("asr.enable_timeout", true));
            z = true;
        }
        Settings.AsrConfig asrConfig = new Settings.AsrConfig();
        asrConfig.setVad(this.mAivsConfig.f("asr.vad_type", 0) == 0);
        asrConfig.setFormat(audioFormat);
        asrConfig.setLang(this.mAivsConfig.j("asr.lang", "zh-CN"));
        asrConfig.setPartialResult(this.mAivsConfig.c("asr.enable_partial_result", true));
        if (z) {
            asrConfig.setTuningParams(asrTuningParams);
        }
        asrConfig.setSmartVolume(this.mAivsConfig.c("asr.enable_smart_volume", false));
        return asrConfig;
    }

    private Settings.PreAsrConfig getPreAsrConfig() {
        Settings.PreAsrConfig preAsrConfig = new Settings.PreAsrConfig();
        preAsrConfig.setTrack(this.mAivsConfig.e("pre.asr.track"));
        return preAsrConfig;
    }

    private Settings.TtsConfig getTtsConfig() {
        boolean z;
        Settings.TtsTuningParams ttsTuningParams = new Settings.TtsTuningParams();
        boolean z2 = true;
        if (this.mAivsConfig.a("tts.vendor")) {
            ttsTuningParams.setVendor(this.mAivsConfig.i("tts.vendor"));
            z = true;
        } else {
            z = false;
        }
        if (this.mAivsConfig.a("tts.speed")) {
            ttsTuningParams.setSpeed(this.mAivsConfig.e("tts.speed"));
            z = true;
        }
        if (this.mAivsConfig.a("tts.tone")) {
            ttsTuningParams.setTone(this.mAivsConfig.e("tts.tone"));
            z = true;
        }
        if (this.mAivsConfig.a("tts.rate")) {
            ttsTuningParams.setRate(this.mAivsConfig.e("tts.rate"));
        } else {
            z2 = z;
        }
        Settings.TtsConfig ttsConfig = new Settings.TtsConfig();
        ttsConfig.setCodec(this.mAivsConfig.j("tts.codec", "MP3"));
        ttsConfig.setLang(this.mAivsConfig.j("tts.lang", "zh-CN"));
        if (this.mAivsConfig.a("tts.volume")) {
            ttsConfig.setVolume(this.mAivsConfig.e("tts.volume"));
        }
        if (this.mAivsConfig.a("tts.audio_vendor")) {
            ttsConfig.setVendor(this.mAivsConfig.i("tts.audio_vendor"));
        }
        if (this.mAivsConfig.a("tts.audio_speaker")) {
            ttsConfig.setSpeaker(this.mAivsConfig.i("tts.audio_speaker"));
        }
        ttsConfig.setAudioType(this.mAivsConfig.i("tts.audio_type").equals("stream") ? Settings.TtsAudioType.STREAM : Settings.TtsAudioType.URL);
        if (z2) {
            ttsConfig.setTuningParams(ttsTuningParams);
        }
        return ttsConfig;
    }

    public void addTrackProcess(c4h c4hVar) {
        klp klpVar;
        if (!this.mAivsConfig.b("track.enable") || (klpVar = this.mTrackData) == null) {
            return;
        }
        klpVar.a(c4hVar);
    }

    public void clearAuthToken() {
        wpe.k(TAG, "clearAuthToken");
        getListener().onRemove(this, XiaomiOAuthConstants.EXTRA_ACCESS_TOKEN_2);
        getListener().onRemove(this, "refresh_token");
        getListener().onRemove(this, "expire_at");
    }

    public klp createTrackData() {
        nnp nnpVar;
        if (!this.mAivsConfig.b("track.enable") || (nnpVar = this.mTrackInfo) == null) {
            return null;
        }
        return new klp(nnpVar);
    }

    public e01 getAivsConfig() {
        return this.mAivsConfig;
    }

    public tq1 getAuthProvider() {
        return this.mAuthProvider;
    }

    public abstract String getChannelType();

    public Settings.ClientInfo getClientInfo() {
        return this.mClientInfo;
    }

    public f01 getError() {
        return new f01(StdStatuses.CONNECTION_INTERRUPT, "Network disconnected");
    }

    public abstract int getErrorCode();

    public abstract int getFailureCode();

    public c9s getHttpDns() {
        return this.mHttpDns;
    }

    public Event<Settings.GlobalConfig> getInitEvent() {
        Settings.PushConfig pushConfig;
        String strI = this.mAivsConfig.i("connection.global_config");
        if (strI != null) {
            try {
                wpe.h(TAG, "getInitEvent use aivsconfig ");
                return APIUtils.readEvent(strI);
            } catch (IOException e) {
                wpe.e(TAG, wpe.o(e));
            }
        }
        Settings.GlobalConfig globalConfig = new Settings.GlobalConfig();
        globalConfig.setTts(getTtsConfig());
        globalConfig.setAsr(getAsrConfig());
        Settings.SDKConfig sDKConfig = new Settings.SDKConfig();
        sDKConfig.setLang(Settings.SDKLanguage.JAVA);
        sDKConfig.setVersion(getListener().onGetSDKVersion(this));
        globalConfig.setSdk(sDKConfig);
        globalConfig.setClientInfo(getClientInfo());
        if (this.mAivsConfig.j("asr.codec", "PCM").equals("PCM_SOUNDAI")) {
            globalConfig.setPreAsr(getPreAsrConfig());
        }
        if (this.mAivsConfig.a("push.umeng_push_device_token")) {
            Settings.UMengPushConfig uMengPushConfig = new Settings.UMengPushConfig();
            uMengPushConfig.setDeviceToken(this.mAivsConfig.i("push.umeng_push_device_token"));
            pushConfig = new Settings.PushConfig();
            pushConfig.setUmeng(uMengPushConfig);
        } else {
            pushConfig = null;
        }
        if (this.mAivsConfig.a("push.mi_push_regid")) {
            Settings.MIPushConfig mIPushConfig = new Settings.MIPushConfig();
            mIPushConfig.setRegId(this.mAivsConfig.i("push.mi_push_regid"));
            if (pushConfig == null) {
                pushConfig = new Settings.PushConfig();
            }
            pushConfig.setMi(mIPushConfig);
        }
        if (pushConfig != null) {
            globalConfig.setPush(pushConfig);
        }
        if (this.mAivsConfig.a("locale.langs") && this.mAivsConfig.a("locale.location")) {
            Settings.LocaleConfig localeConfig = new Settings.LocaleConfig();
            localeConfig.setLocation(this.mAivsConfig.i("locale.location"));
            localeConfig.setLangs(this.mAivsConfig.k("locale.langs"));
            if (this.mAivsConfig.a("locale.region")) {
                localeConfig.setRegion(this.mAivsConfig.d("locale.region"));
            }
            globalConfig.setLocale(localeConfig);
        }
        return APIUtils.buildEvent(globalConfig);
    }

    public lt3 getListener() {
        return this.mListener;
    }

    public String getStorageId() {
        String strI = this.mAivsConfig.i("auth.client_id");
        if (!this.mClientInfo.getDeviceId().c()) {
            throw new IllegalArgumentException("device id not set");
        }
        return buildStorageId(this.mAuthType, strI, this.mClientInfo.getDeviceId().b());
    }

    public klp getTrackData() {
        return this.mTrackData;
    }

    public abstract int getType();

    public abstract boolean isConnected();

    public abstract boolean postData(byte[] bArr);

    public abstract boolean postData(byte[] bArr, int i, int i2);

    public abstract boolean postEvent(bf8 bf8Var);

    public abstract boolean postEvent(Event event);

    public int processErrorMsg(yhe yheVar, String str) {
        String str2;
        String str3;
        int iH = 0;
        if (yheVar != null) {
            try {
                zsd tree = APIUtils.getObjectMapper().readTree(str);
                if (tree == null || !tree.z("status")) {
                    str2 = "onFailure: unknown error, clean all cache";
                } else {
                    zsd zsdVarW = tree.w("status");
                    if (zsdVarW == null || !zsdVarW.H() || zsdVarW.T("code") == null) {
                        str2 = "onFailure: no error code, clean all cache";
                    } else {
                        iH = zsdVarW.T("code").h();
                        if (iH == 40110018) {
                            yheVar.r();
                            str3 = "onFailure: aes key expired";
                        } else if (iH == 40110020 || iH == 40110021) {
                            yheVar.s();
                            str3 = "onFailure: rsa key expired";
                        } else if (iH == 40110022) {
                            wpe.e(TAG, "onFailure: miss key, switch to wss mode");
                            switchToWssMode();
                        } else if (iH == 500) {
                            yheVar.r();
                            str3 = "onFailure: 500 Internal Server Error, clear aes cache";
                        } else {
                            str2 = "onFailure: unexpected code, clean all cache";
                        }
                        wpe.e(TAG, str3);
                    }
                }
                wpe.e(TAG, str2);
                yheVar.r();
                yheVar.s();
            } catch (IOException unused) {
                wpe.e(TAG, "parse json failed: " + str);
            }
        }
        return iH;
    }

    public boolean retryOnFailure() {
        return getErrorCode() == 401;
    }

    public void setAuthType(int i) {
        this.mAuthType = i;
    }

    public final void setTrackInfo(nnp nnpVar) {
        this.mTrackInfo = nnpVar;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00c4 A[Catch: all -> 0x005c, TryCatch #0 {all -> 0x005c, blocks: (B:11:0x0033, B:12:0x0036, B:14:0x003f, B:16:0x0048, B:18:0x0051, B:24:0x0060, B:27:0x0068, B:28:0x0086, B:31:0x008b, B:33:0x00a9, B:35:0x00af, B:37:0x00bc, B:51:0x00e9, B:38:0x00c4, B:42:0x00d0, B:47:0x00db, B:49:0x00e1), top: B:80:0x0033 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00d8  */
    public final boolean start() {
        boolean z;
        wpe.h(TAG, StatConstants.PARAM_START);
        if (this.mTrackInfo == null && this.mAivsConfig.b("track.enable")) {
            wpe.e(TAG, "start: trackInfo is empty, should disable track");
            return false;
        }
        long jF = ((long) this.mAivsConfig.f("connection.connect_timeout", 5)) * 1000;
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.isTryAgain = false;
        synchronized (this) {
            try {
                this.mLastError = null;
                int i = 0;
                do {
                    boolean z2 = (getErrorCode() != 401 || getFailureCode() == 40110018 || getFailureCode() == 40110020 || getFailureCode() == 40110021) ? false : true;
                    if (startConnect(z2)) {
                        wpe.h(TAG, "start: connect ok, time=" + (System.currentTimeMillis() - jCurrentTimeMillis) + "ms");
                        return true;
                    }
                    i++;
                    wpe.h(TAG, "start: count=" + i + ",forceRefresh=" + z2);
                    if (z2 && getErrorCode() == 401) {
                        clearAuthToken();
                        if (this.mAivsConfig.c("connection.quit_if_new_token_invalid", false)) {
                            wpe.k(TAG, "new token auth failed too, quit");
                            break;
                        }
                        if (System.currentTimeMillis() - jCurrentTimeMillis < jF) {
                            z = false;
                        } else {
                            z = false;
                        }
                        if (!z) {
                        }
                    } else {
                        if (System.currentTimeMillis() - jCurrentTimeMillis < jF || i > 2 || !retryOnFailure()) {
                            z = false;
                        } else {
                            z = true;
                        }
                        if (!z && getType() == 1) {
                            ((XMDChannel) this).finishTrack();
                        }
                    }
                } while (z);
                long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                wpe.e(TAG, "start: failed to connect, time=" + jCurrentTimeMillis2 + "ms");
                if (getType() == 0 && jCurrentTimeMillis2 > jF) {
                    this.mListener.detectWeakNetwork(this);
                }
                int iE = this.mAivsConfig.e("connection.try_again_threshold");
                if (getType() == 1 && jCurrentTimeMillis2 <= iE) {
                    this.isTryAgain = true;
                }
                if (getType() == 3 && this.mAivsConfig.c("connection.use_online_in_offline_mode", true)) {
                    this.isTryAgain = true;
                }
                if (this.isTryAgain) {
                    return false;
                }
                if (getType() == 1) {
                    ((XMDChannel) this).finishTrack();
                }
                f01 f01Var = this.mLastError;
                if (f01Var != null) {
                    this.mListener.onError(this, f01Var);
                    this.mLastError = null;
                } else {
                    this.mListener.onError(this, new f01(StdStatuses.CONNECT_FAILED, "Channel connection failed, time=" + jCurrentTimeMillis2 + "ms"));
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract boolean startConnect(boolean z);

    public abstract void stop();

    public void switchToWssMode() {
    }

    public boolean tryAgain() {
        return this.isTryAgain;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void updateGlobalConfig(Event event) {
        if (event == null || !AIApiConstants.Settings.GlobalConfig.equals(event.getFullName())) {
            return;
        }
        if (!(event.getPayload() instanceof Settings.GlobalConfig)) {
            wpe.e(TAG, "updateGlobalConfig: Payload is not GlobalConfig");
            return;
        }
        Optional<Settings.ClientInfo> clientInfo = ((Settings.GlobalConfig) event.getPayload()).getClientInfo();
        if (clientInfo.c()) {
            Optional<Double> latitude = clientInfo.b().getLatitude();
            Optional<Double> longitude = clientInfo.b().getLongitude();
            if (latitude.c() && longitude.c()) {
                this.mClientInfo.setLatitude(latitude.b().doubleValue());
                this.mClientInfo.setLongitude(longitude.b().doubleValue());
            }
            Optional<String> timeZone = clientInfo.b().getTimeZone();
            if (timeZone.c()) {
                this.mClientInfo.setTimeZone(timeZone.b());
            }
            wpe.h(TAG, "updateGlobalConfig update success");
        }
    }

    public void updateTrack(String str, int i) {
        klp klpVar;
        if (!this.mAivsConfig.b("track.enable") || (klpVar = this.mTrackData) == null) {
            return;
        }
        klpVar.g(str, i);
    }

    public void updateTrackTimestamp(String str, long j) {
        klp klpVar;
        if (!this.mAivsConfig.b("track.enable") || (klpVar = this.mTrackData) == null) {
            return;
        }
        klpVar.i(str, j);
    }

    public gt3(e01 e01Var, Settings.ClientInfo clientInfo, tq1 tq1Var, lt3 lt3Var) {
        this.mAivsConfig = e01Var;
        this.mClientInfo = clientInfo;
        this.mAuthProvider = tq1Var;
        this.mListener = lt3Var;
    }

    public final boolean start(nnp nnpVar) {
        wpe.h(TAG, "start with track");
        this.mTrackInfo = nnpVar;
        return start();
    }

    public void updateTrack(String str, String str2) {
        klp klpVar;
        if (!this.mAivsConfig.b("track.enable") || (klpVar = this.mTrackData) == null) {
            return;
        }
        klpVar.h(str, str2);
    }
}
