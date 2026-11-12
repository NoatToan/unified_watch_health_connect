package com.xiaomi.ai.api;

import com.xiaomi.ai.api.common.ContextPayload;
import com.xiaomi.ai.api.common.EventPayload;
import com.xiaomi.ai.api.common.InstructionPayload;
import com.xiaomi.ai.api.common.NamespaceName;
import com.xiaomi.ai.api.common.Required;
import com.xiaomi.common.Optional;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class Settings {

    public static class AsrConfig {
        private Optional<Boolean> vad = Optional.a();
        private Optional<String> lang = Optional.a();
        private Optional<Boolean> partial_result = Optional.a();
        private Optional<AudioFormat> format = Optional.a();
        private Optional<AsrTuningParams> tuning_params = Optional.a();
        private Optional<Boolean> smart_volume = Optional.a();
        private Optional<Boolean> full_time_without_wakeup = Optional.a();
        private Optional<Boolean> process_empty_query = Optional.a();
        private Optional<AsrScenario> scenario = Optional.a();

        public Optional<AudioFormat> getFormat() {
            return this.format;
        }

        public Optional<String> getLang() {
            return this.lang;
        }

        public Optional<AsrScenario> getScenario() {
            return this.scenario;
        }

        public Optional<AsrTuningParams> getTuningParams() {
            return this.tuning_params;
        }

        public Optional<Boolean> isFullTimeWithoutWakeup() {
            return this.full_time_without_wakeup;
        }

        public Optional<Boolean> isPartialResult() {
            return this.partial_result;
        }

        public Optional<Boolean> isProcessEmptyQuery() {
            return this.process_empty_query;
        }

        public Optional<Boolean> isSmartVolume() {
            return this.smart_volume;
        }

        public Optional<Boolean> isVad() {
            return this.vad;
        }

        public AsrConfig setFormat(AudioFormat audioFormat) {
            this.format = Optional.e(audioFormat);
            return this;
        }

        public AsrConfig setFullTimeWithoutWakeup(boolean z) {
            this.full_time_without_wakeup = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public AsrConfig setLang(String str) {
            this.lang = Optional.e(str);
            return this;
        }

        public AsrConfig setPartialResult(boolean z) {
            this.partial_result = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public AsrConfig setProcessEmptyQuery(boolean z) {
            this.process_empty_query = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public AsrConfig setScenario(AsrScenario asrScenario) {
            this.scenario = Optional.e(asrScenario);
            return this;
        }

        public AsrConfig setSmartVolume(boolean z) {
            this.smart_volume = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public AsrConfig setTuningParams(AsrTuningParams asrTuningParams) {
            this.tuning_params = Optional.e(asrTuningParams);
            return this;
        }

        public AsrConfig setVad(boolean z) {
            this.vad = Optional.e(Boolean.valueOf(z));
            return this;
        }
    }

    public enum AsrScenario {
        UNKNOWN(-1),
        VIDEO_QA(0);

        private int id;

        AsrScenario(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public static class AsrTuningParams {
        private Optional<String> vendor = Optional.a();
        private Optional<Integer> max_audio_seconds = Optional.a();
        private Optional<Boolean> enable_timeout = Optional.a();

        public Optional<Integer> getMaxAudioSeconds() {
            return this.max_audio_seconds;
        }

        public Optional<String> getVendor() {
            return this.vendor;
        }

        public Optional<Boolean> isEnableTimeout() {
            return this.enable_timeout;
        }

        public AsrTuningParams setEnableTimeout(boolean z) {
            this.enable_timeout = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public AsrTuningParams setMaxAudioSeconds(int i) {
            this.max_audio_seconds = Optional.e(Integer.valueOf(i));
            return this;
        }

        public AsrTuningParams setVendor(String str) {
            this.vendor = Optional.e(str);
            return this;
        }
    }

    public static class AudioFormat {
        private Optional<String> codec = Optional.a();
        private Optional<Integer> bits = Optional.a();
        private Optional<Integer> rate = Optional.a();
        private Optional<Integer> channel = Optional.a();
        private Optional<Integer> opus_frame_size = Optional.a();

        public Optional<Integer> getBits() {
            return this.bits;
        }

        public Optional<Integer> getChannel() {
            return this.channel;
        }

        public Optional<String> getCodec() {
            return this.codec;
        }

        public Optional<Integer> getOpusFrameSize() {
            return this.opus_frame_size;
        }

        public Optional<Integer> getRate() {
            return this.rate;
        }

        public AudioFormat setBits(int i) {
            this.bits = Optional.e(Integer.valueOf(i));
            return this;
        }

        public AudioFormat setChannel(int i) {
            this.channel = Optional.e(Integer.valueOf(i));
            return this;
        }

        public AudioFormat setCodec(String str) {
            this.codec = Optional.e(str);
            return this;
        }

        public AudioFormat setOpusFrameSize(int i) {
            this.opus_frame_size = Optional.e(Integer.valueOf(i));
            return this;
        }

        public AudioFormat setRate(int i) {
            this.rate = Optional.e(Integer.valueOf(i));
            return this;
        }
    }

    @NamespaceName(name = "AuthorizationUpdated", namespace = AIApiConstants.Settings.NAME)
    @Deprecated
    public static class AuthorizationUpdated implements EventPayload {

        @Required
        private List<String> authorization;

        public AuthorizationUpdated() {
        }

        public AuthorizationUpdated(List<String> list) {
            this.authorization = list;
        }

        @Required
        public List<String> getAuthorization() {
            return this.authorization;
        }

        @Required
        public AuthorizationUpdated setAuthorization(List<String> list) {
            this.authorization = list;
            return this;
        }
    }

    public static class ClientInfo {
        private Optional<String> device_id = Optional.a();

        @Deprecated
        private Optional<Double> longitude = Optional.a();

        @Deprecated
        private Optional<Double> latitude = Optional.a();
        private Optional<String> time_zone = Optional.a();
        private Optional<Boolean> continuous_dialog = Optional.a();
        private Optional<String> android_id = Optional.a();
        private Optional<Network.NetworkType> network = Optional.a();
        private Optional<String> engine_id = Optional.a();
        private Optional<String> mode = Optional.a();
        private Optional<String> udid = Optional.a();
        private Optional<String> oaid = Optional.a();
        private Optional<String> vaid = Optional.a();
        private Optional<String> aaid = Optional.a();
        private Optional<String> vid = Optional.a();
        private Optional<String> pid = Optional.a();
        private Optional<String> miot_did = Optional.a();
        private Optional<Long> timestamp = Optional.a();
        private Optional<String> bind_id = Optional.a();
        private Optional<Long> capabilities_version = Optional.a();
        private Optional<WakeUpWithVoiceSetting> wake_up_with_voice_setting = Optional.a();
        private Optional<Boolean> gps_opened = Optional.a();
        private Optional<String> sn = Optional.a();
        private Optional<String> custom_did = Optional.a();
        private Optional<Boolean> restrict_imei = Optional.a();
        private Optional<String> model_id = Optional.a();
        private Optional<String> car_vid = Optional.a();

        public Optional<String> getAaid() {
            return this.aaid;
        }

        public Optional<String> getAndroidId() {
            return this.android_id;
        }

        public Optional<String> getBindId() {
            return this.bind_id;
        }

        public Optional<Long> getCapabilitiesVersion() {
            return this.capabilities_version;
        }

        public Optional<String> getCarVid() {
            return this.car_vid;
        }

        public Optional<String> getCustomDid() {
            return this.custom_did;
        }

        public Optional<String> getDeviceId() {
            return this.device_id;
        }

        public Optional<String> getEngineId() {
            return this.engine_id;
        }

        @Deprecated
        public Optional<Double> getLatitude() {
            return this.latitude;
        }

        @Deprecated
        public Optional<Double> getLongitude() {
            return this.longitude;
        }

        public Optional<String> getMiotDid() {
            return this.miot_did;
        }

        public Optional<String> getMode() {
            return this.mode;
        }

        public Optional<String> getModelId() {
            return this.model_id;
        }

        public Optional<Network.NetworkType> getNetwork() {
            return this.network;
        }

        public Optional<String> getOaid() {
            return this.oaid;
        }

        public Optional<String> getPid() {
            return this.pid;
        }

        public Optional<String> getSn() {
            return this.sn;
        }

        public Optional<String> getTimeZone() {
            return this.time_zone;
        }

        public Optional<Long> getTimestamp() {
            return this.timestamp;
        }

        public Optional<String> getUdid() {
            return this.udid;
        }

        public Optional<String> getVaid() {
            return this.vaid;
        }

        public Optional<String> getVid() {
            return this.vid;
        }

        public Optional<WakeUpWithVoiceSetting> getWakeUpWithVoiceSetting() {
            return this.wake_up_with_voice_setting;
        }

        public Optional<Boolean> isContinuousDialog() {
            return this.continuous_dialog;
        }

        public Optional<Boolean> isGpsOpened() {
            return this.gps_opened;
        }

        public Optional<Boolean> isRestrictImei() {
            return this.restrict_imei;
        }

        public ClientInfo setAaid(String str) {
            this.aaid = Optional.e(str);
            return this;
        }

        public ClientInfo setAndroidId(String str) {
            this.android_id = Optional.e(str);
            return this;
        }

        public ClientInfo setBindId(String str) {
            this.bind_id = Optional.e(str);
            return this;
        }

        public ClientInfo setCapabilitiesVersion(long j) {
            this.capabilities_version = Optional.e(Long.valueOf(j));
            return this;
        }

        public ClientInfo setCarVid(String str) {
            this.car_vid = Optional.e(str);
            return this;
        }

        public ClientInfo setContinuousDialog(boolean z) {
            this.continuous_dialog = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public ClientInfo setCustomDid(String str) {
            this.custom_did = Optional.e(str);
            return this;
        }

        public ClientInfo setDeviceId(String str) {
            this.device_id = Optional.e(str);
            return this;
        }

        public ClientInfo setEngineId(String str) {
            this.engine_id = Optional.e(str);
            return this;
        }

        public ClientInfo setGpsOpened(boolean z) {
            this.gps_opened = Optional.e(Boolean.valueOf(z));
            return this;
        }

        @Deprecated
        public ClientInfo setLatitude(double d) {
            this.latitude = Optional.e(Double.valueOf(d));
            return this;
        }

        @Deprecated
        public ClientInfo setLongitude(double d) {
            this.longitude = Optional.e(Double.valueOf(d));
            return this;
        }

        public ClientInfo setMiotDid(String str) {
            this.miot_did = Optional.e(str);
            return this;
        }

        public ClientInfo setMode(String str) {
            this.mode = Optional.e(str);
            return this;
        }

        public ClientInfo setModelId(String str) {
            this.model_id = Optional.e(str);
            return this;
        }

        public ClientInfo setNetwork(Network.NetworkType networkType) {
            this.network = Optional.e(networkType);
            return this;
        }

        public ClientInfo setOaid(String str) {
            this.oaid = Optional.e(str);
            return this;
        }

        public ClientInfo setPid(String str) {
            this.pid = Optional.e(str);
            return this;
        }

        public ClientInfo setRestrictImei(boolean z) {
            this.restrict_imei = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public ClientInfo setSn(String str) {
            this.sn = Optional.e(str);
            return this;
        }

        public ClientInfo setTimeZone(String str) {
            this.time_zone = Optional.e(str);
            return this;
        }

        public ClientInfo setTimestamp(long j) {
            this.timestamp = Optional.e(Long.valueOf(j));
            return this;
        }

        public ClientInfo setUdid(String str) {
            this.udid = Optional.e(str);
            return this;
        }

        public ClientInfo setVaid(String str) {
            this.vaid = Optional.e(str);
            return this;
        }

        public ClientInfo setVid(String str) {
            this.vid = Optional.e(str);
            return this;
        }

        public ClientInfo setWakeUpWithVoiceSetting(WakeUpWithVoiceSetting wakeUpWithVoiceSetting) {
            this.wake_up_with_voice_setting = Optional.e(wakeUpWithVoiceSetting);
            return this;
        }
    }

    @NamespaceName(name = "ConnectionChallengeAck", namespace = AIApiConstants.Settings.NAME)
    public static class ConnectionChallengeAck implements EventPayload {

        @Required
        private String challenge_md5;

        public ConnectionChallengeAck() {
        }

        public ConnectionChallengeAck(String str) {
            this.challenge_md5 = str;
        }

        @Required
        public String getChallengeMd5() {
            return this.challenge_md5;
        }

        @Required
        public ConnectionChallengeAck setChallengeMd5(String str) {
            this.challenge_md5 = str;
            return this;
        }
    }

    @NamespaceName(name = "GlobalConfig", namespace = AIApiConstants.Settings.NAME)
    public static class GlobalConfig implements EventPayload {
        private Optional<AsrConfig> asr = Optional.a();
        private Optional<TtsConfig> tts = Optional.a();
        private Optional<ClientInfo> client_info = Optional.a();
        private Optional<PreAsrConfig> pre_asr = Optional.a();
        private Optional<PushConfig> push = Optional.a();
        private Optional<SDKConfig> sdk = Optional.a();
        private Optional<LocaleConfig> locale = Optional.a();

        public Optional<AsrConfig> getAsr() {
            return this.asr;
        }

        public Optional<ClientInfo> getClientInfo() {
            return this.client_info;
        }

        public Optional<LocaleConfig> getLocale() {
            return this.locale;
        }

        public Optional<PreAsrConfig> getPreAsr() {
            return this.pre_asr;
        }

        public Optional<PushConfig> getPush() {
            return this.push;
        }

        public Optional<SDKConfig> getSdk() {
            return this.sdk;
        }

        public Optional<TtsConfig> getTts() {
            return this.tts;
        }

        public GlobalConfig setAsr(AsrConfig asrConfig) {
            this.asr = Optional.e(asrConfig);
            return this;
        }

        public GlobalConfig setClientInfo(ClientInfo clientInfo) {
            this.client_info = Optional.e(clientInfo);
            return this;
        }

        public GlobalConfig setLocale(LocaleConfig localeConfig) {
            this.locale = Optional.e(localeConfig);
            return this;
        }

        public GlobalConfig setPreAsr(PreAsrConfig preAsrConfig) {
            this.pre_asr = Optional.e(preAsrConfig);
            return this;
        }

        public GlobalConfig setPush(PushConfig pushConfig) {
            this.push = Optional.e(pushConfig);
            return this;
        }

        public GlobalConfig setSdk(SDKConfig sDKConfig) {
            this.sdk = Optional.e(sDKConfig);
            return this;
        }

        public GlobalConfig setTts(TtsConfig ttsConfig) {
            this.tts = Optional.e(ttsConfig);
            return this;
        }
    }

    @NamespaceName(name = "GlobalConfigState", namespace = AIApiConstants.Settings.NAME)
    @Deprecated
    public static class GlobalConfigState implements ContextPayload {
        private Optional<TtsConfig> tts = Optional.a();

        public Optional<TtsConfig> getTts() {
            return this.tts;
        }

        public GlobalConfigState setTts(TtsConfig ttsConfig) {
            this.tts = Optional.e(ttsConfig);
            return this;
        }
    }

    @NamespaceName(name = "HeadersUpdated", namespace = AIApiConstants.Settings.NAME)
    public static class HeadersUpdated implements EventPayload {
        private Optional<List<String>> authorization = Optional.a();
        private Optional<String> user_agent = Optional.a();

        public Optional<List<String>> getAuthorization() {
            return this.authorization;
        }

        public Optional<String> getUserAgent() {
            return this.user_agent;
        }

        public HeadersUpdated setAuthorization(List<String> list) {
            this.authorization = Optional.e(list);
            return this;
        }

        public HeadersUpdated setUserAgent(String str) {
            this.user_agent = Optional.e(str);
            return this;
        }
    }

    public static class MIPushConfig {

        @Required
        private String reg_id;

        public MIPushConfig() {
        }

        public MIPushConfig(String str) {
            this.reg_id = str;
        }

        @Required
        public String getRegId() {
            return this.reg_id;
        }

        @Required
        public MIPushConfig setRegId(String str) {
            this.reg_id = str;
            return this;
        }
    }

    @NamespaceName(name = "MediaPlayerList", namespace = AIApiConstants.Settings.NAME)
    public static class MediaPlayerList implements ContextPayload {

        @Required
        private List<MediaPlayer> players;

        public MediaPlayerList() {
        }

        public MediaPlayerList(List<MediaPlayer> list) {
            this.players = list;
        }

        @Required
        public List<MediaPlayer> getPlayers() {
            return this.players;
        }

        @Required
        public MediaPlayerList setPlayers(List<MediaPlayer> list) {
            this.players = list;
            return this;
        }
    }

    public static class NlpConfig {
        private Optional<Boolean> is_continue_nlp = Optional.a();

        @Deprecated
        private Optional<String> nlp_query = Optional.a();

        @Deprecated
        private Optional<NlpSource> source = Optional.a();

        @Deprecated
        public Optional<String> getNlpQuery() {
            return this.nlp_query;
        }

        @Deprecated
        public Optional<NlpSource> getSource() {
            return this.source;
        }

        public Optional<Boolean> isContinueNlp() {
            return this.is_continue_nlp;
        }

        public NlpConfig setIsContinueNlp(boolean z) {
            this.is_continue_nlp = Optional.e(Boolean.valueOf(z));
            return this;
        }

        @Deprecated
        public NlpConfig setNlpQuery(String str) {
            this.nlp_query = Optional.e(str);
            return this;
        }

        @Deprecated
        public NlpConfig setSource(NlpSource nlpSource) {
            this.source = Optional.e(nlpSource);
            return this;
        }
    }

    public enum NlpSource {
        UNKNOWN(-1),
        PRIVACY_POP(0),
        EMPTY_QUERY(1);

        private int id;

        NlpSource(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum PlayerSource {
        UNKNOWN(-1),
        AUTO(0),
        QQ_MUSIC(1),
        KW_MUSIC(2),
        XIAOMI_MUSIC(3),
        NETEASE_MUSIC(4),
        KUGOU_MUSIC(5);

        private int id;

        PlayerSource(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum PlayerType {
        UNKNOWN(-1),
        AUDIO(0),
        VIDEO(1);

        private int id;

        PlayerType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    @NamespaceName(name = "PowerState", namespace = AIApiConstants.Settings.NAME)
    public static class PowerState implements ContextPayload {

        @Required
        private boolean scheduled_shutdown;

        public PowerState() {
        }

        public PowerState(boolean z) {
            this.scheduled_shutdown = z;
        }

        @Required
        public boolean isScheduledShutdown() {
            return this.scheduled_shutdown;
        }

        @Required
        public PowerState setScheduledShutdown(boolean z) {
            this.scheduled_shutdown = z;
            return this;
        }
    }

    public static class PreAsrConfig {
        private Optional<Integer> track = Optional.a();

        public Optional<Integer> getTrack() {
            return this.track;
        }

        public PreAsrConfig setTrack(int i) {
            this.track = Optional.e(Integer.valueOf(i));
            return this;
        }
    }

    public static class PushConfig {
        private Optional<MIPushConfig> mi = Optional.a();
        private Optional<UMengPushConfig> umeng = Optional.a();
        private Optional<Boolean> disable_push = Optional.a();

        public Optional<MIPushConfig> getMi() {
            return this.mi;
        }

        public Optional<UMengPushConfig> getUmeng() {
            return this.umeng;
        }

        public Optional<Boolean> isDisablePush() {
            return this.disable_push;
        }

        public PushConfig setDisablePush(boolean z) {
            this.disable_push = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public PushConfig setMi(MIPushConfig mIPushConfig) {
            this.mi = Optional.e(mIPushConfig);
            return this;
        }

        public PushConfig setUmeng(UMengPushConfig uMengPushConfig) {
            this.umeng = Optional.e(uMengPushConfig);
            return this;
        }
    }

    public static class SDKConfig {

        @Required
        private SDKLanguage lang;

        @Required
        private int version;

        public SDKConfig() {
        }

        public SDKConfig(int i, SDKLanguage sDKLanguage) {
            this.version = i;
            this.lang = sDKLanguage;
        }

        @Required
        public SDKLanguage getLang() {
            return this.lang;
        }

        @Required
        public int getVersion() {
            return this.version;
        }

        @Required
        public SDKConfig setLang(SDKLanguage sDKLanguage) {
            this.lang = sDKLanguage;
            return this;
        }

        @Required
        public SDKConfig setVersion(int i) {
            this.version = i;
            return this;
        }
    }

    public enum SDKLanguage {
        UNKNOWN(-1),
        JAVA(0),
        CPP(1),
        C(2);

        private int id;

        SDKLanguage(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    @NamespaceName(name = "SetAIShortcut", namespace = AIApiConstants.Settings.NAME)
    public static class SetAIShortcut implements ContextPayload {
    }

    public enum TTSTextType {
        UNKNOWN(-1),
        PLAIN(0),
        SSML_XML(1),
        SSML_JSON(2);

        private int id;

        TTSTextType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    @NamespaceName(name = "TVClientInfo", namespace = AIApiConstants.Settings.NAME)
    public static class TVClientInfo implements ContextPayload {
        private Optional<TVLicense> license = Optional.a();

        public Optional<TVLicense> getLicense() {
            return this.license;
        }

        public TVClientInfo setLicense(TVLicense tVLicense) {
            this.license = Optional.e(tVLicense);
            return this;
        }
    }

    public enum TVLicense {
        UNKNOWN(-1),
        ICNTV(0),
        GITV(1);

        private int id;

        TVLicense(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum TtsAudioType {
        UNKNOWN(-1),
        STREAM(0),
        URL(1),
        URL_WS(2);

        private int id;

        TtsAudioType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public static class TtsConfig {
        private Optional<String> codec = Optional.a();
        private Optional<String> lang = Optional.a();
        private Optional<Integer> volume = Optional.a();
        private Optional<TtsAudioType> audio_type = Optional.a();
        private Optional<TtsTuningParams> tuning_params = Optional.a();
        private Optional<String> vendor = Optional.a();
        private Optional<String> speaker = Optional.a();
        private Optional<SpeechSynthesizer.TTSEmotion> emotion = Optional.a();
        private Optional<TtsStyle> style = Optional.a();
        private Optional<String> app_name = Optional.a();
        private Optional<TtsAudioType> streaming_audio_type = Optional.a();
        private Optional<Integer> stream_tts_tail_silence = Optional.a();
        private Optional<Integer> sample_rate = Optional.a();
        private Optional<TTSTextType> tts_text_type = Optional.a();
        private Optional<String> text = Optional.a();
        private Optional<Integer> delta_semitone = Optional.a();
        private Optional<String> delta_tempo = Optional.a();
        private Optional<Boolean> enable_cachedwave = Optional.a();
        private Optional<String> domain = Optional.a();
        private Optional<Integer> pitch = Optional.a();
        private Optional<Boolean> offline_first = Optional.a();
        private Optional<Boolean> need_filter_speak_text = Optional.a();

        public Optional<String> getAppName() {
            return this.app_name;
        }

        public Optional<TtsAudioType> getAudioType() {
            return this.audio_type;
        }

        public Optional<String> getCodec() {
            return this.codec;
        }

        public Optional<Integer> getDeltaSemitone() {
            return this.delta_semitone;
        }

        public Optional<String> getDeltaTempo() {
            return this.delta_tempo;
        }

        public Optional<String> getDomain() {
            return this.domain;
        }

        public Optional<SpeechSynthesizer.TTSEmotion> getEmotion() {
            return this.emotion;
        }

        public Optional<String> getLang() {
            return this.lang;
        }

        public Optional<Integer> getPitch() {
            return this.pitch;
        }

        public Optional<Integer> getSampleRate() {
            return this.sample_rate;
        }

        public Optional<String> getSpeaker() {
            return this.speaker;
        }

        public Optional<Integer> getStreamTtsTailSilence() {
            return this.stream_tts_tail_silence;
        }

        public Optional<TtsAudioType> getStreamingAudioType() {
            return this.streaming_audio_type;
        }

        public Optional<TtsStyle> getStyle() {
            return this.style;
        }

        public Optional<String> getText() {
            return this.text;
        }

        public Optional<TTSTextType> getTtsTextType() {
            return this.tts_text_type;
        }

        public Optional<TtsTuningParams> getTuningParams() {
            return this.tuning_params;
        }

        public Optional<String> getVendor() {
            return this.vendor;
        }

        public Optional<Integer> getVolume() {
            return this.volume;
        }

        public Optional<Boolean> isEnableCachedwave() {
            return this.enable_cachedwave;
        }

        public Optional<Boolean> isNeedFilterSpeakText() {
            return this.need_filter_speak_text;
        }

        public Optional<Boolean> isOfflineFirst() {
            return this.offline_first;
        }

        public TtsConfig setAppName(String str) {
            this.app_name = Optional.e(str);
            return this;
        }

        public TtsConfig setAudioType(TtsAudioType ttsAudioType) {
            this.audio_type = Optional.e(ttsAudioType);
            return this;
        }

        public TtsConfig setCodec(String str) {
            this.codec = Optional.e(str);
            return this;
        }

        public TtsConfig setDeltaSemitone(int i) {
            this.delta_semitone = Optional.e(Integer.valueOf(i));
            return this;
        }

        public TtsConfig setDeltaTempo(String str) {
            this.delta_tempo = Optional.e(str);
            return this;
        }

        public TtsConfig setDomain(String str) {
            this.domain = Optional.e(str);
            return this;
        }

        public TtsConfig setEmotion(SpeechSynthesizer.TTSEmotion tTSEmotion) {
            this.emotion = Optional.e(tTSEmotion);
            return this;
        }

        public TtsConfig setEnableCachedwave(boolean z) {
            this.enable_cachedwave = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public TtsConfig setLang(String str) {
            this.lang = Optional.e(str);
            return this;
        }

        public TtsConfig setNeedFilterSpeakText(boolean z) {
            this.need_filter_speak_text = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public TtsConfig setOfflineFirst(boolean z) {
            this.offline_first = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public TtsConfig setPitch(int i) {
            this.pitch = Optional.e(Integer.valueOf(i));
            return this;
        }

        public TtsConfig setSampleRate(int i) {
            this.sample_rate = Optional.e(Integer.valueOf(i));
            return this;
        }

        public TtsConfig setSpeaker(String str) {
            this.speaker = Optional.e(str);
            return this;
        }

        public TtsConfig setStreamTtsTailSilence(int i) {
            this.stream_tts_tail_silence = Optional.e(Integer.valueOf(i));
            return this;
        }

        public TtsConfig setStreamingAudioType(TtsAudioType ttsAudioType) {
            this.streaming_audio_type = Optional.e(ttsAudioType);
            return this;
        }

        public TtsConfig setStyle(TtsStyle ttsStyle) {
            this.style = Optional.e(ttsStyle);
            return this;
        }

        public TtsConfig setText(String str) {
            this.text = Optional.e(str);
            return this;
        }

        public TtsConfig setTtsTextType(TTSTextType tTSTextType) {
            this.tts_text_type = Optional.e(tTSTextType);
            return this;
        }

        public TtsConfig setTuningParams(TtsTuningParams ttsTuningParams) {
            this.tuning_params = Optional.e(ttsTuningParams);
            return this;
        }

        public TtsConfig setVendor(String str) {
            this.vendor = Optional.e(str);
            return this;
        }

        public TtsConfig setVolume(int i) {
            this.volume = Optional.e(Integer.valueOf(i));
            return this;
        }
    }

    public enum TtsStyle {
        UNKNOWN(-1),
        BASE(0),
        NAVI(1),
        WEATHER(2),
        MUSIC(3),
        CONTROL(4),
        GENERAL(5),
        SWEET(6);

        private int id;

        TtsStyle(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public static class TtsTuningParams {
        private Optional<String> vendor = Optional.a();
        private Optional<Integer> speed = Optional.a();
        private Optional<Integer> tone = Optional.a();
        private Optional<Integer> rate = Optional.a();

        public Optional<Integer> getRate() {
            return this.rate;
        }

        public Optional<Integer> getSpeed() {
            return this.speed;
        }

        public Optional<Integer> getTone() {
            return this.tone;
        }

        public Optional<String> getVendor() {
            return this.vendor;
        }

        public TtsTuningParams setRate(int i) {
            this.rate = Optional.e(Integer.valueOf(i));
            return this;
        }

        public TtsTuningParams setSpeed(int i) {
            this.speed = Optional.e(Integer.valueOf(i));
            return this;
        }

        public TtsTuningParams setTone(int i) {
            this.tone = Optional.e(Integer.valueOf(i));
            return this;
        }

        public TtsTuningParams setVendor(String str) {
            this.vendor = Optional.e(str);
            return this;
        }
    }

    public static class UMengPushConfig {

        @Required
        private String device_token;

        public UMengPushConfig() {
        }

        public UMengPushConfig(String str) {
            this.device_token = str;
        }

        @Required
        public String getDeviceToken() {
            return this.device_token;
        }

        @Required
        public UMengPushConfig setDeviceToken(String str) {
            this.device_token = str;
            return this;
        }
    }

    public static class WakeUpWithVoiceSetting {

        @Required
        private boolean voice;

        @Required
        private boolean voiceprint;

        public WakeUpWithVoiceSetting() {
        }

        public WakeUpWithVoiceSetting(boolean z, boolean z2) {
            this.voice = z;
            this.voiceprint = z2;
        }

        @Required
        public boolean isVoice() {
            return this.voice;
        }

        @Required
        public boolean isVoiceprint() {
            return this.voiceprint;
        }

        @Required
        public WakeUpWithVoiceSetting setVoice(boolean z) {
            this.voice = z;
            return this;
        }

        @Required
        public WakeUpWithVoiceSetting setVoiceprint(boolean z) {
            this.voiceprint = z;
            return this;
        }
    }

    public static class LocaleConfig {

        @Required
        private List<String> langs;

        @Required
        private String location;
        private Optional<Common.LocaleRegion> region = Optional.a();

        public LocaleConfig() {
        }

        @Required
        public List<String> getLangs() {
            return this.langs;
        }

        @Required
        public String getLocation() {
            return this.location;
        }

        public Optional<Common.LocaleRegion> getRegion() {
            return this.region;
        }

        @Required
        public LocaleConfig setLangs(List<String> list) {
            this.langs = list;
            return this;
        }

        @Required
        public LocaleConfig setLocation(String str) {
            this.location = str;
            return this;
        }

        public LocaleConfig setRegion(Common.LocaleRegion localeRegion) {
            this.region = Optional.e(localeRegion);
            return this;
        }

        public LocaleConfig(List<String> list, String str) {
            this.langs = list;
            this.location = str;
        }
    }

    @NamespaceName(name = "SetPlayerProperty", namespace = AIApiConstants.Settings.NAME)
    public static class SetPlayerProperty implements InstructionPayload {

        @Required
        private PlayerType player_type;
        private Optional<PlayerSource> source = Optional.a();

        public SetPlayerProperty() {
        }

        @Required
        public PlayerType getPlayerType() {
            return this.player_type;
        }

        public Optional<PlayerSource> getSource() {
            return this.source;
        }

        @Required
        public SetPlayerProperty setPlayerType(PlayerType playerType) {
            this.player_type = playerType;
            return this;
        }

        public SetPlayerProperty setSource(PlayerSource playerSource) {
            this.source = Optional.e(playerSource);
            return this;
        }

        public SetPlayerProperty(PlayerType playerType) {
            this.player_type = playerType;
        }
    }

    @NamespaceName(name = "ConnectionChallenge", namespace = AIApiConstants.Settings.NAME)
    public static class ConnectionChallenge implements InstructionPayload {

        @Required
        private String challenge;
        private Optional<String> aes_token = Optional.a();
        private Optional<Integer> token_expires_in = Optional.a();

        public ConnectionChallenge() {
        }

        public Optional<String> getAesToken() {
            return this.aes_token;
        }

        @Required
        public String getChallenge() {
            return this.challenge;
        }

        public Optional<Integer> getTokenExpiresIn() {
            return this.token_expires_in;
        }

        public ConnectionChallenge setAesToken(String str) {
            this.aes_token = Optional.e(str);
            return this;
        }

        @Required
        public ConnectionChallenge setChallenge(String str) {
            this.challenge = str;
            return this;
        }

        public ConnectionChallenge setTokenExpiresIn(int i) {
            this.token_expires_in = Optional.e(Integer.valueOf(i));
            return this;
        }

        public ConnectionChallenge(String str) {
            this.challenge = str;
        }
    }

    public static class MediaPlayer {

        @Required
        private String app_name;
        private Optional<List<Float>> multiples = Optional.a();
        private Optional<List<String>> play_mode = Optional.a();

        public MediaPlayer() {
        }

        @Required
        public String getAppName() {
            return this.app_name;
        }

        public Optional<List<Float>> getMultiples() {
            return this.multiples;
        }

        public Optional<List<String>> getPlayMode() {
            return this.play_mode;
        }

        @Required
        public MediaPlayer setAppName(String str) {
            this.app_name = str;
            return this;
        }

        public MediaPlayer setMultiples(List<Float> list) {
            this.multiples = Optional.e(list);
            return this;
        }

        public MediaPlayer setPlayMode(List<String> list) {
            this.play_mode = Optional.e(list);
            return this;
        }

        public MediaPlayer(String str) {
            this.app_name = str;
        }
    }
}
