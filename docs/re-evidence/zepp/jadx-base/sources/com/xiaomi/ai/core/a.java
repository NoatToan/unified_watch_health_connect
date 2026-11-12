package com.xiaomi.ai.core;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.xiaomi.ai.api.AIApiConstants;
import com.xiaomi.ai.api.Settings;
import com.xiaomi.ai.api.StdStatuses;
import com.xiaomi.ai.api.common.APIUtils;
import com.xiaomi.ai.api.common.Event;
import com.xiaomi.ai.error.AivsError;
import com.xiaomi.ai.log.Logger;
import com.xiaomi.ai.track.TrackData;
import com.xiaomi.ai.transport.LiteCryptInterceptor;
import com.xiaomi.common.Optional;
import java.io.IOException;

/* JADX INFO: loaded from: classes18.dex */
public abstract class a {
    public static final int AUTH_APP_ANONYMOUS = 5;
    public static final int AUTH_APP_OAUTH = 4;
    public static final int AUTH_DEVICE_ANONYMOUS = 6;
    public static final int AUTH_DEVICE_OAUTH = 1;
    public static final int AUTH_DEVICE_TOKEN = 3;
    public static final int AUTH_MIOT = 2;
    public static final int AUTH_SERVER = 7;
    private static final String TAG = "Channel";
    public AivsConfig mAivsConfig;
    public com.xiaomi.ai.a.a mAuthProvider;
    public int mAuthType;
    public Settings.ClientInfo mClientInfo;
    public com.xiaomi.ai.transport.b mHttpDns;
    public AivsError mLastError = null;
    public b mListener;
    public TrackData mTrackData;
    public com.xiaomi.ai.track.a mTrackInfo;

    /* JADX WARN: Code duplicated, block: B:17:0x0046  */
    public a(AivsConfig aivsConfig, Settings.ClientInfo clientInfo, int i, b bVar) {
        com.xiaomi.ai.a.a cVar;
        this.mAivsConfig = aivsConfig;
        this.mClientInfo = clientInfo;
        this.mAuthType = i;
        this.mListener = bVar;
        if (i == 1) {
            cVar = new com.xiaomi.ai.a.a.c(i, this);
        } else if (i == 2) {
            cVar = new com.xiaomi.ai.a.a.b(this);
        } else if (i == 3) {
            cVar = new com.xiaomi.ai.a.a.a(this);
        } else if (i == 4) {
            cVar = new com.xiaomi.ai.a.a.c(i, this);
        } else {
            if (i != 7) {
                throw new IllegalArgumentException("Channel: unsupported authType=" + i);
            }
            cVar = new com.xiaomi.ai.a.a.d(this);
        }
        this.mAuthProvider = cVar;
    }

    public a(AivsConfig aivsConfig, Settings.ClientInfo clientInfo, com.xiaomi.ai.a.a aVar, b bVar) {
        this.mAivsConfig = aivsConfig;
        this.mClientInfo = clientInfo;
        this.mAuthProvider = aVar;
        this.mListener = bVar;
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
        sb.append("_");
        sb.append(str2);
        return sb.toString();
    }

    private Settings.AsrConfig getAsrConfig() {
        boolean z;
        Settings.AudioFormat audioFormat = new Settings.AudioFormat();
        audioFormat.setCodec(this.mAivsConfig.getString(AivsConfig.Asr.CODEC, AivsConfig.Asr.CODEC_PCM));
        audioFormat.setBits(this.mAivsConfig.getInt(AivsConfig.Asr.BITS, 16));
        audioFormat.setRate(this.mAivsConfig.getInt(AivsConfig.Asr.BITRATE, 16000));
        audioFormat.setChannel(this.mAivsConfig.getInt(AivsConfig.Asr.CHANNEL, 1));
        Settings.AsrTuningParams asrTuningParams = new Settings.AsrTuningParams();
        if (this.mAivsConfig.containsKey(AivsConfig.Asr.VENDOR)) {
            asrTuningParams.setVendor(this.mAivsConfig.getString(AivsConfig.Asr.VENDOR));
            z = true;
        } else {
            z = false;
        }
        if (this.mAivsConfig.containsKey(AivsConfig.Asr.MAX_AUDIO_SECONDS)) {
            asrTuningParams.setMaxAudioSeconds(this.mAivsConfig.getInt(AivsConfig.Asr.MAX_AUDIO_SECONDS, 30));
            z = true;
        }
        if (this.mAivsConfig.containsKey(AivsConfig.Asr.ENABLE_TIMEOUT)) {
            asrTuningParams.setEnableTimeout(this.mAivsConfig.getBoolean(AivsConfig.Asr.ENABLE_TIMEOUT, true));
            z = true;
        }
        Settings.AsrConfig asrConfig = new Settings.AsrConfig();
        asrConfig.setVad(this.mAivsConfig.getInt(AivsConfig.Asr.VAD_TYPE, 0) == 0);
        asrConfig.setFormat(audioFormat);
        asrConfig.setLang(this.mAivsConfig.getString(AivsConfig.Asr.LANG, "zh-CN"));
        asrConfig.setPartialResult(this.mAivsConfig.getBoolean(AivsConfig.Asr.ENABLE_PARTIAL_RESULT, true));
        if (z) {
            asrConfig.setTuningParams(asrTuningParams);
        }
        asrConfig.setSmartVolume(this.mAivsConfig.getBoolean(AivsConfig.Asr.ENABLE_SMART_VOLUME, false));
        return asrConfig;
    }

    private Settings.PreAsrConfig getPreAsrConfig() {
        Settings.PreAsrConfig preAsrConfig = new Settings.PreAsrConfig();
        preAsrConfig.setTrack(this.mAivsConfig.getInt(AivsConfig.PreAsr.PRE_ASR_TRACK));
        return preAsrConfig;
    }

    private Settings.TtsConfig getTtsConfig() {
        boolean z;
        Settings.TtsTuningParams ttsTuningParams = new Settings.TtsTuningParams();
        boolean z2 = true;
        if (this.mAivsConfig.containsKey(AivsConfig.Tts.VENDOR)) {
            ttsTuningParams.setVendor(this.mAivsConfig.getString(AivsConfig.Tts.VENDOR));
            z = true;
        } else {
            z = false;
        }
        if (this.mAivsConfig.containsKey(AivsConfig.Tts.SPEED)) {
            ttsTuningParams.setSpeed(this.mAivsConfig.getInt(AivsConfig.Tts.SPEED));
            z = true;
        }
        if (this.mAivsConfig.containsKey(AivsConfig.Tts.TONE)) {
            ttsTuningParams.setSpeed(this.mAivsConfig.getInt(AivsConfig.Tts.TONE));
            z = true;
        }
        if (this.mAivsConfig.containsKey(AivsConfig.Tts.RATE)) {
            ttsTuningParams.setSpeed(this.mAivsConfig.getInt(AivsConfig.Tts.RATE));
        } else {
            z2 = z;
        }
        Settings.TtsConfig ttsConfig = new Settings.TtsConfig();
        ttsConfig.setCodec(this.mAivsConfig.getString(AivsConfig.Tts.CODEC, AivsConfig.Tts.CODEC_MP3));
        ttsConfig.setLang(this.mAivsConfig.getString(AivsConfig.Tts.LANG, "zh-CN"));
        if (this.mAivsConfig.containsKey(AivsConfig.Tts.VOLUME)) {
            ttsConfig.setVolume(this.mAivsConfig.getInt(AivsConfig.Tts.VOLUME));
        }
        if (this.mAivsConfig.containsKey(AivsConfig.Tts.AUDIO_VENDOR)) {
            ttsConfig.setVendor(this.mAivsConfig.getString(AivsConfig.Tts.AUDIO_VENDOR));
        }
        if (this.mAivsConfig.containsKey(AivsConfig.Tts.AUDIO_SPEAKER)) {
            ttsConfig.setSpeaker(this.mAivsConfig.getString(AivsConfig.Tts.AUDIO_SPEAKER));
        }
        ttsConfig.setAudioType(this.mAivsConfig.getString(AivsConfig.Tts.AUDIO_TYPE).equals(AivsConfig.Tts.AUDIO_TYPE_STREAM) ? Settings.TtsAudioType.STREAM : Settings.TtsAudioType.URL);
        if (z2) {
            ttsConfig.setTuningParams(ttsTuningParams);
        }
        return ttsConfig;
    }

    public void addTrackProcess(ObjectNode objectNode) {
        TrackData trackData;
        if (!this.mAivsConfig.getBoolean(AivsConfig.Track.ENABLE) || (trackData = this.mTrackData) == null) {
            return;
        }
        trackData.addConnectProcess(objectNode);
    }

    public void clearAuthToken() {
        Logger.c("Channel", "clearAuthToken");
        getListener().b(this, "access_token");
        getListener().b(this, "refresh_token");
        getListener().b(this, "expire_at");
    }

    public TrackData createTrackData() {
        com.xiaomi.ai.track.a aVar;
        if (!this.mAivsConfig.getBoolean(AivsConfig.Track.ENABLE) || (aVar = this.mTrackInfo) == null) {
            return null;
        }
        return new TrackData(aVar);
    }

    public AivsConfig getAivsConfig() {
        return this.mAivsConfig;
    }

    public com.xiaomi.ai.a.a getAuthProvider() {
        return this.mAuthProvider;
    }

    public abstract String getChannelType();

    public Settings.ClientInfo getClientInfo() {
        return this.mClientInfo;
    }

    public abstract int getErrorCode();

    public abstract int getFailureCode();

    public com.xiaomi.ai.transport.b getHttpDns() {
        return this.mHttpDns;
    }

    public Event<Settings.GlobalConfig> getInitEvent() {
        Settings.GlobalConfig globalConfig = new Settings.GlobalConfig();
        globalConfig.setTts(getTtsConfig());
        globalConfig.setAsr(getAsrConfig());
        Settings.SDKConfig sDKConfig = new Settings.SDKConfig();
        sDKConfig.setLang(Settings.SDKLanguage.JAVA);
        sDKConfig.setVersion(getListener().g(this));
        globalConfig.setSdk(sDKConfig);
        globalConfig.setClientInfo(getClientInfo());
        if (this.mAivsConfig.getString(AivsConfig.Asr.CODEC, AivsConfig.Asr.CODEC_PCM).equals(AivsConfig.Asr.CODEC_SOUNDAI)) {
            globalConfig.setPreAsr(getPreAsrConfig());
        }
        Settings.PushConfig pushConfig = null;
        if (this.mAivsConfig.containsKey(AivsConfig.Push.UMENG_PUSH_DEVICE_TOKEN)) {
            Settings.UMengPushConfig uMengPushConfig = new Settings.UMengPushConfig();
            uMengPushConfig.setDeviceToken(this.mAivsConfig.getString(AivsConfig.Push.UMENG_PUSH_DEVICE_TOKEN));
            Settings.PushConfig pushConfig2 = new Settings.PushConfig();
            pushConfig2.setUmeng(uMengPushConfig);
            pushConfig = pushConfig2;
        }
        if (this.mAivsConfig.containsKey(AivsConfig.Push.MI_PUSH_REGID)) {
            Settings.MIPushConfig mIPushConfig = new Settings.MIPushConfig();
            mIPushConfig.setRegId(this.mAivsConfig.getString(AivsConfig.Push.MI_PUSH_REGID));
            if (pushConfig == null) {
                pushConfig = new Settings.PushConfig();
            }
            pushConfig.setMi(mIPushConfig);
        }
        if (pushConfig != null) {
            globalConfig.setPush(pushConfig);
        }
        if (this.mAivsConfig.containsKey(AivsConfig.Locale.LANGS) && this.mAivsConfig.containsKey(AivsConfig.Locale.LOCATION)) {
            Settings.LocaleConfig localeConfig = new Settings.LocaleConfig();
            localeConfig.setLocation(this.mAivsConfig.getString(AivsConfig.Locale.LOCATION));
            localeConfig.setLangs(this.mAivsConfig.getStringList(AivsConfig.Locale.LANGS));
            if (this.mAivsConfig.containsKey(AivsConfig.Locale.REGION)) {
                localeConfig.setRegion(this.mAivsConfig.getEnum(AivsConfig.Locale.REGION));
            }
            globalConfig.setLocale(localeConfig);
        }
        return APIUtils.buildEvent(globalConfig);
    }

    public b getListener() {
        return this.mListener;
    }

    public String getStorageId() {
        String string = this.mAivsConfig.getString(AivsConfig.Auth.CLIENT_ID);
        if (!this.mClientInfo.getDeviceId().isPresent()) {
            throw new IllegalArgumentException("device id not set");
        }
        return buildStorageId(this.mAuthType, string, this.mClientInfo.getDeviceId().get());
    }

    public TrackData getTrackData() {
        return this.mTrackData;
    }

    public abstract boolean isConnected();

    public abstract boolean postData(byte[] bArr);

    public abstract boolean postData(byte[] bArr, int i, int i2);

    public abstract boolean postEvent(Event event);

    public int processErrorMsg(LiteCryptInterceptor liteCryptInterceptor, String str) {
        String str2;
        String str3;
        if (liteCryptInterceptor == null) {
            return 0;
        }
        try {
            JsonNode tree = APIUtils.getObjectMapper().readTree(str);
            if (tree == null || !tree.has("status")) {
                str2 = "onFailure: unknown error, clean all cache";
            } else {
                JsonNode jsonNode = tree.get("status");
                if (jsonNode != null && jsonNode.isObject() && jsonNode.path("code") != null) {
                    int iAsInt = jsonNode.path("code").asInt();
                    if (iAsInt == 40110018) {
                        liteCryptInterceptor.clearAes();
                        str3 = "onFailure: aes key expired";
                    } else {
                        if (iAsInt != 40110020 && iAsInt != 40110021) {
                            if (iAsInt == 40110022) {
                                Logger.d("Channel", "onFailure: miss key, switch to wss mode");
                                switchToWssMode();
                            } else if (iAsInt == 500) {
                                liteCryptInterceptor.clearAes();
                                str3 = "onFailure: 500 Internal Server Error, clear aes cache";
                            } else {
                                Logger.d("Channel", "onFailure: unexpected code, clean all cache");
                                liteCryptInterceptor.clearAes();
                                liteCryptInterceptor.clearPubkey();
                            }
                            return iAsInt;
                        }
                        liteCryptInterceptor.clearPubkey();
                        str3 = "onFailure: rsa key expired";
                    }
                    Logger.d("Channel", str3);
                    return iAsInt;
                }
                str2 = "onFailure: no error code, clean all cache";
            }
            Logger.d("Channel", str2);
            liteCryptInterceptor.clearAes();
            liteCryptInterceptor.clearPubkey();
            return 0;
        } catch (IOException unused) {
            Logger.d("Channel", "parse json failed: " + str);
            return 0;
        }
    }

    public boolean retryOnFailure() {
        return getErrorCode() == 401;
    }

    public final void setTrackInfo(com.xiaomi.ai.track.a aVar) {
        this.mTrackInfo = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00c1 A[Catch: all -> 0x014a, TryCatch #0 {, blocks: (B:11:0x0033, B:12:0x0036, B:14:0x003f, B:16:0x0048, B:18:0x0051, B:22:0x005d, B:24:0x0063, B:25:0x0083, B:27:0x0085, B:29:0x00a6, B:31:0x00ac, B:33:0x00b9, B:40:0x00d3, B:34:0x00c1, B:38:0x00cd), top: B:54:0x0033 }] */
    public final boolean start() {
        Logger.b("Channel", "start");
        if (this.mTrackInfo == null && this.mAivsConfig.getBoolean(AivsConfig.Track.ENABLE)) {
            Logger.d("Channel", "start: trackInfo is empty, should disable track");
            return false;
        }
        long j = ((long) this.mAivsConfig.getInt(AivsConfig.Connection.CONNECT_TIMEOUT, 5)) * 1000;
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (this) {
            this.mLastError = null;
            int i = 0;
            do {
                boolean z = (getErrorCode() != 401 || getFailureCode() == 40110018 || getFailureCode() == 40110020 || getFailureCode() == 40110021) ? false : true;
                if (!startConnect(z)) {
                    i++;
                    Logger.b("Channel", "start: count=" + i + ",forceRefresh=" + z);
                    if (z && getErrorCode() == 401) {
                        clearAuthToken();
                        if (!this.mAivsConfig.getBoolean(AivsConfig.Connection.QUIT_IF_NEW_TOKEN_INVALID, false)) {
                            if (System.currentTimeMillis() - jCurrentTimeMillis >= j) {
                                break;
                            }
                            break;
                            break;
                        }
                        Logger.c("Channel", "new token auth failed too, quit");
                        break;
                    }
                    if (System.currentTimeMillis() - jCurrentTimeMillis >= j || i > 2) {
                        break;
                    }
                } else {
                    Logger.b("Channel", "start: connect ok, time=" + (System.currentTimeMillis() - jCurrentTimeMillis) + "ms");
                    return true;
                }
            } while (retryOnFailure());
            long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
            Logger.d("Channel", "start: failed to connect, time=" + jCurrentTimeMillis2 + "ms");
            AivsError aivsError = this.mLastError;
            if (aivsError != null) {
                this.mListener.a(this, aivsError);
                this.mLastError = null;
            } else {
                this.mListener.a(this, new AivsError(StdStatuses.CONNECT_FAILED, "Channel connection failed, time=" + jCurrentTimeMillis2 + "ms"));
            }
            if ("xmd".equals(getChannelType()) && this.mHttpDns.b()) {
                Logger.b("Channel", "change Channel from xmd to ws");
                this.mHttpDns.c();
                this.mListener.a(this, 0);
            }
            return false;
        }
    }

    public final boolean start(com.xiaomi.ai.track.a aVar) {
        Logger.b("Channel", "start with track");
        this.mTrackInfo = aVar;
        return start();
    }

    public abstract boolean startConnect(boolean z);

    public abstract void stop();

    public void switchToWssMode() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void updateGlobalConfig(Event event) {
        if (event == null || !AIApiConstants.Settings.GlobalConfig.equals(event.getFullName())) {
            return;
        }
        if (!(event.getPayload() instanceof Settings.GlobalConfig)) {
            Logger.d("Channel", "updateGlobalConfig: Payload is not GlobalConfig");
            return;
        }
        Optional<Settings.ClientInfo> clientInfo = ((Settings.GlobalConfig) event.getPayload()).getClientInfo();
        if (clientInfo.isPresent()) {
            Optional<Double> latitude = clientInfo.get().getLatitude();
            Optional<Double> longitude = clientInfo.get().getLongitude();
            if (latitude.isPresent() && longitude.isPresent()) {
                this.mClientInfo.setLatitude(latitude.get().doubleValue());
                this.mClientInfo.setLongitude(longitude.get().doubleValue());
            }
            Optional<String> timeZone = clientInfo.get().getTimeZone();
            if (timeZone.isPresent()) {
                this.mClientInfo.setTimeZone(timeZone.get());
            }
            Logger.b("Channel", "updateGlobalConfig update success");
        }
    }

    public void updateTrack(String str, int i) {
        TrackData trackData;
        if (!this.mAivsConfig.getBoolean(AivsConfig.Track.ENABLE) || (trackData = this.mTrackData) == null) {
            return;
        }
        trackData.set(str, i);
    }

    public void updateTrack(String str, String str2) {
        TrackData trackData;
        if (!this.mAivsConfig.getBoolean(AivsConfig.Track.ENABLE) || (trackData = this.mTrackData) == null) {
            return;
        }
        trackData.set(str, str2);
    }

    public void updateTrackTimestamp(String str, long j) {
        TrackData trackData;
        if (!this.mAivsConfig.getBoolean(AivsConfig.Track.ENABLE) || (trackData = this.mTrackData) == null) {
            return;
        }
        trackData.setTimestamp(str, j);
    }
}
