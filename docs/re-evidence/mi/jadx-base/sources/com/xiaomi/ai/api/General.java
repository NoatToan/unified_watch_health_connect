package com.xiaomi.ai.api;

import com.xiaomi.ai.api.common.Context;
import com.xiaomi.ai.api.common.ContextPayload;
import com.xiaomi.ai.api.common.EventPayload;
import com.xiaomi.ai.api.common.InstructionPayload;
import com.xiaomi.ai.api.common.NamespaceName;
import com.xiaomi.ai.api.common.Required;
import com.xiaomi.common.Optional;
import defpackage.c4h;
import defpackage.mj1;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class General {

    @NamespaceName(name = "CacheResource", namespace = AIApiConstants.General.NAME)
    public static class CacheResource implements InstructionPayload {

        @Required
        private mj1 instructions;

        public CacheResource() {
        }

        public CacheResource(mj1 mj1Var) {
            this.instructions = mj1Var;
        }

        @Required
        public mj1 getInstructions() {
            return this.instructions;
        }

        @Required
        public CacheResource setInstructions(mj1 mj1Var) {
            this.instructions = mj1Var;
            return this;
        }
    }

    @NamespaceName(name = "ClearSession", namespace = AIApiConstants.General.NAME)
    public static class ClearSession implements EventPayload {
    }

    public static class ContextDeleteItem {

        @Required
        private String name;

        @Required
        private String namespace;

        public ContextDeleteItem() {
        }

        public ContextDeleteItem(String str, String str2) {
            this.namespace = str;
            this.name = str2;
        }

        @Required
        public String getName() {
            return this.name;
        }

        @Required
        public String getNamespace() {
            return this.namespace;
        }

        @Required
        public ContextDeleteItem setName(String str) {
            this.name = str;
            return this;
        }

        @Required
        public ContextDeleteItem setNamespace(String str) {
            this.namespace = str;
            return this;
        }
    }

    @NamespaceName(name = "ContextUpdate", namespace = AIApiConstants.General.NAME)
    public static class ContextUpdate implements EventPayload {
        private Optional<String> id = Optional.a();
        private Optional<List<ContextDeleteItem>> delete_items = Optional.a();
        private Optional<Boolean> enable_incremental_update = Optional.a();
        private Optional<Boolean> is_test_full_context = Optional.a();
        private Optional<Boolean> not_store = Optional.a();

        public Optional<List<ContextDeleteItem>> getDeleteItems() {
            return this.delete_items;
        }

        public Optional<String> getId() {
            return this.id;
        }

        public Optional<Boolean> isEnableIncrementalUpdate() {
            return this.enable_incremental_update;
        }

        public Optional<Boolean> isNotStore() {
            return this.not_store;
        }

        public Optional<Boolean> isTestFullContext() {
            return this.is_test_full_context;
        }

        public ContextUpdate setDeleteItems(List<ContextDeleteItem> list) {
            this.delete_items = Optional.e(list);
            return this;
        }

        public ContextUpdate setEnableIncrementalUpdate(boolean z) {
            this.enable_incremental_update = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public ContextUpdate setId(String str) {
            this.id = Optional.e(str);
            return this;
        }

        public ContextUpdate setIsTestFullContext(boolean z) {
            this.is_test_full_context = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public ContextUpdate setNotStore(boolean z) {
            this.not_store = Optional.e(Boolean.valueOf(z));
            return this;
        }
    }

    @NamespaceName(name = "DebugInfo", namespace = AIApiConstants.General.NAME)
    public static class DebugInfo implements InstructionPayload {
        private Optional<SpeechDebugInfo> speech = Optional.a();

        public Optional<SpeechDebugInfo> getSpeech() {
            return this.speech;
        }

        public DebugInfo setSpeech(SpeechDebugInfo speechDebugInfo) {
            this.speech = Optional.e(speechDebugInfo);
            return this;
        }
    }

    @NamespaceName(name = "DevicePosition", namespace = AIApiConstants.General.NAME)
    public static class DevicePosition implements ContextPayload {
        private Optional<Double> longitude = Optional.a();
        private Optional<Double> latitude = Optional.a();
        private Optional<Double> direction = Optional.a();
        private Optional<Double> elevation = Optional.a();
        private Optional<String> current_road = Optional.a();

        public Optional<String> getCurrentRoad() {
            return this.current_road;
        }

        public Optional<Double> getDirection() {
            return this.direction;
        }

        public Optional<Double> getElevation() {
            return this.elevation;
        }

        public Optional<Double> getLatitude() {
            return this.latitude;
        }

        public Optional<Double> getLongitude() {
            return this.longitude;
        }

        public DevicePosition setCurrentRoad(String str) {
            this.current_road = Optional.e(str);
            return this;
        }

        public DevicePosition setDirection(double d) {
            this.direction = Optional.e(Double.valueOf(d));
            return this;
        }

        public DevicePosition setElevation(double d) {
            this.elevation = Optional.e(Double.valueOf(d));
            return this;
        }

        public DevicePosition setLatitude(double d) {
            this.latitude = Optional.e(Double.valueOf(d));
            return this;
        }

        public DevicePosition setLongitude(double d) {
            this.longitude = Optional.e(Double.valueOf(d));
            return this;
        }
    }

    @NamespaceName(name = "DeviceStateReport", namespace = AIApiConstants.General.NAME)
    public static class DeviceStateReport implements EventPayload {
        private Optional<AudioPlayer.PlaybackState> audio_player_state = Optional.a();
        private Optional<VideoPlayer.VideoPlaybackState> video_player_state = Optional.a();
        private Optional<Boolean> is_idle = Optional.a();
        private Optional<Boolean> is_sleep_mode = Optional.a();

        public Optional<AudioPlayer.PlaybackState> getAudioPlayerState() {
            return this.audio_player_state;
        }

        public Optional<VideoPlayer.VideoPlaybackState> getVideoPlayerState() {
            return this.video_player_state;
        }

        public Optional<Boolean> isIdle() {
            return this.is_idle;
        }

        public Optional<Boolean> isSleepMode() {
            return this.is_sleep_mode;
        }

        public DeviceStateReport setAudioPlayerState(AudioPlayer.PlaybackState playbackState) {
            this.audio_player_state = Optional.e(playbackState);
            return this;
        }

        public DeviceStateReport setIsIdle(boolean z) {
            this.is_idle = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public DeviceStateReport setIsSleepMode(boolean z) {
            this.is_sleep_mode = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public DeviceStateReport setVideoPlayerState(VideoPlayer.VideoPlaybackState videoPlaybackState) {
            this.video_player_state = Optional.e(videoPlaybackState);
            return this;
        }
    }

    @NamespaceName(name = "ExecuteSpec", namespace = AIApiConstants.General.NAME)
    public static class ExecuteSpec implements InstructionPayload {

        @Required
        private c4h spec;

        public ExecuteSpec() {
        }

        public ExecuteSpec(c4h c4hVar) {
            this.spec = c4hVar;
        }

        @Required
        public c4h getSpec() {
            return this.spec;
        }

        @Required
        public ExecuteSpec setSpec(c4h c4hVar) {
            this.spec = c4hVar;
            return this;
        }
    }

    @NamespaceName(name = "FetchDeviceLog", namespace = AIApiConstants.General.NAME)
    public static class FetchDeviceLog implements InstructionPayload {
        private Optional<String> feedback_id = Optional.a();

        public Optional<String> getFeedbackId() {
            return this.feedback_id;
        }

        public FetchDeviceLog setFeedbackId(String str) {
            this.feedback_id = Optional.e(str);
            return this;
        }
    }

    @NamespaceName(name = "FetchDeviceState", namespace = AIApiConstants.General.NAME)
    public static class FetchDeviceState implements InstructionPayload {
    }

    @NamespaceName(name = "FetchResource", namespace = AIApiConstants.General.NAME)
    public static class FetchResource implements EventPayload {

        @Required
        private String command;

        @Required
        private boolean needs_cache;

        @Required
        private ResourceType type;

        public FetchResource() {
        }

        public FetchResource(ResourceType resourceType, boolean z, String str) {
            this.type = resourceType;
            this.needs_cache = z;
            this.command = str;
        }

        @Required
        public String getCommand() {
            return this.command;
        }

        @Required
        public ResourceType getType() {
            return this.type;
        }

        @Required
        public boolean isNeedsCache() {
            return this.needs_cache;
        }

        @Required
        public FetchResource setCommand(String str) {
            this.command = str;
            return this;
        }

        @Required
        public FetchResource setNeedsCache(boolean z) {
            this.needs_cache = z;
            return this;
        }

        @Required
        public FetchResource setType(ResourceType resourceType) {
            this.type = resourceType;
            return this;
        }
    }

    @NamespaceName(name = "GeneralInfoUpload", namespace = AIApiConstants.General.NAME)
    public static class GeneralInfoUpload {
    }

    public enum ModeActionType {
        UNKNOWN(-1),
        OPEN(0),
        CLOSE(1),
        SWITCH(2);

        private int id;

        ModeActionType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    @NamespaceName(name = "ModeOp", namespace = AIApiConstants.General.NAME)
    public static class ModeOp implements InstructionPayload {

        @Required
        private ModeActionType action;

        @Required
        private ModeType mode;

        public ModeOp() {
        }

        public ModeOp(ModeActionType modeActionType, ModeType modeType) {
            this.action = modeActionType;
            this.mode = modeType;
        }

        @Required
        public ModeActionType getAction() {
            return this.action;
        }

        @Required
        public ModeType getMode() {
            return this.mode;
        }

        @Required
        public ModeOp setAction(ModeActionType modeActionType) {
            this.action = modeActionType;
            return this;
        }

        @Required
        public ModeOp setMode(ModeType modeType) {
            this.mode = modeType;
            return this;
        }
    }

    public enum ModeType {
        UNKNOWN(-1),
        SOUNDBOX(0),
        TV(1);

        private int id;

        ModeType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    @NamespaceName(name = "PickDevice", namespace = AIApiConstants.General.NAME)
    public static class PickDevice implements InstructionPayload {

        @Required
        private String pid;

        @Required
        private String vid;

        public PickDevice() {
        }

        public PickDevice(String str, String str2) {
            this.vid = str;
            this.pid = str2;
        }

        @Required
        public String getPid() {
            return this.pid;
        }

        @Required
        public String getVid() {
            return this.vid;
        }

        @Required
        public PickDevice setPid(String str) {
            this.pid = str;
            return this;
        }

        @Required
        public PickDevice setVid(String str) {
            this.vid = str;
            return this;
        }
    }

    public static class PushMsgMeta {

        @Required
        private long expiration_in_seconds;

        @Required
        private String id;

        @Required
        private long send_timestamp;

        @Required
        private String sub_type;

        public PushMsgMeta() {
        }

        public PushMsgMeta(String str, String str2, long j, long j2) {
            this.id = str;
            this.sub_type = str2;
            this.send_timestamp = j;
            this.expiration_in_seconds = j2;
        }

        @Required
        public long getExpirationInSeconds() {
            return this.expiration_in_seconds;
        }

        @Required
        public String getId() {
            return this.id;
        }

        @Required
        public long getSendTimestamp() {
            return this.send_timestamp;
        }

        @Required
        public String getSubType() {
            return this.sub_type;
        }

        @Required
        public PushMsgMeta setExpirationInSeconds(long j) {
            this.expiration_in_seconds = j;
            return this;
        }

        @Required
        public PushMsgMeta setId(String str) {
            this.id = str;
            return this;
        }

        @Required
        public PushMsgMeta setSendTimestamp(long j) {
            this.send_timestamp = j;
            return this;
        }

        @Required
        public PushMsgMeta setSubType(String str) {
            this.sub_type = str;
            return this;
        }
    }

    @NamespaceName(name = "QueryClientStatus", namespace = AIApiConstants.General.NAME)
    public static class QueryClientStatus implements InstructionPayload {

        @Required
        private QueryItem item;

        public QueryClientStatus() {
        }

        public QueryClientStatus(QueryItem queryItem) {
            this.item = queryItem;
        }

        @Required
        public QueryItem getItem() {
            return this.item;
        }

        @Required
        public QueryClientStatus setItem(QueryItem queryItem) {
            this.item = queryItem;
            return this;
        }
    }

    public enum QueryItem {
        UNKNOWN(-1),
        MEDIA_VOLUME(0),
        PLAYING_ITEM_ARTIST(1),
        PLAYING_ITEM_TITLE(2),
        PLAYER_LOOP_MODE(3),
        BLUETOOTH_CONNECTED_STATUS(4),
        DATA_TRAFFIC(5),
        REMAINING_BATTERY(6),
        BLUETOOTH_DEVICE_REMAINING_BATTERY(7),
        EARPHONE_REMAINING_BATTERY(8),
        SOUNDBOX_REMAINING_BATTERY(9),
        ALARM_REMAINING_BATTERY(10);

        private int id;

        QueryItem(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    @NamespaceName(name = "RenewSession", namespace = AIApiConstants.General.NAME)
    public static class RenewSession implements ContextPayload {
    }

    @NamespaceName(name = "RenewSessionHistory", namespace = AIApiConstants.General.NAME)
    public static class RenewSessionHistory implements ContextPayload {
    }

    @NamespaceName(name = "RequestState", namespace = AIApiConstants.General.NAME)
    public static class RequestState implements ContextPayload {
        private Optional<String> origin = Optional.a();

        @Deprecated
        private Optional<String> tts_vendor = Optional.a();

        @Deprecated
        private Optional<Settings.ClientInfo> client_info = Optional.a();
        private Optional<Boolean> is_init_wakeup = Optional.a();

        @Deprecated
        private Optional<String> speaker = Optional.a();

        @Deprecated
        private Optional<Boolean> executing_device_picking = Optional.a();
        private Optional<Settings.AsrConfig> asr_config = Optional.a();
        private Optional<Settings.TtsConfig> tts_config = Optional.a();
        private Optional<Settings.NlpConfig> nlp_config = Optional.a();
        private Optional<RequestWakeupState> wakeup_state = Optional.a();
        private Optional<Boolean> is_internal = Optional.a();

        public Optional<Settings.AsrConfig> getAsrConfig() {
            return this.asr_config;
        }

        @Deprecated
        public Optional<Settings.ClientInfo> getClientInfo() {
            return this.client_info;
        }

        public Optional<Settings.NlpConfig> getNlpConfig() {
            return this.nlp_config;
        }

        public Optional<String> getOrigin() {
            return this.origin;
        }

        @Deprecated
        public Optional<String> getSpeaker() {
            return this.speaker;
        }

        public Optional<Settings.TtsConfig> getTtsConfig() {
            return this.tts_config;
        }

        @Deprecated
        public Optional<String> getTtsVendor() {
            return this.tts_vendor;
        }

        public Optional<RequestWakeupState> getWakeupState() {
            return this.wakeup_state;
        }

        @Deprecated
        public Optional<Boolean> isExecutingDevicePicking() {
            return this.executing_device_picking;
        }

        public Optional<Boolean> isInitWakeup() {
            return this.is_init_wakeup;
        }

        public Optional<Boolean> isInternal() {
            return this.is_internal;
        }

        public RequestState setAsrConfig(Settings.AsrConfig asrConfig) {
            this.asr_config = Optional.e(asrConfig);
            return this;
        }

        @Deprecated
        public RequestState setClientInfo(Settings.ClientInfo clientInfo) {
            this.client_info = Optional.e(clientInfo);
            return this;
        }

        @Deprecated
        public RequestState setExecutingDevicePicking(boolean z) {
            this.executing_device_picking = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public RequestState setIsInitWakeup(boolean z) {
            this.is_init_wakeup = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public RequestState setIsInternal(boolean z) {
            this.is_internal = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public RequestState setNlpConfig(Settings.NlpConfig nlpConfig) {
            this.nlp_config = Optional.e(nlpConfig);
            return this;
        }

        public RequestState setOrigin(String str) {
            this.origin = Optional.e(str);
            return this;
        }

        @Deprecated
        public RequestState setSpeaker(String str) {
            this.speaker = Optional.e(str);
            return this;
        }

        public RequestState setTtsConfig(Settings.TtsConfig ttsConfig) {
            this.tts_config = Optional.e(ttsConfig);
            return this;
        }

        @Deprecated
        public RequestState setTtsVendor(String str) {
            this.tts_vendor = Optional.e(str);
            return this;
        }

        public RequestState setWakeupState(RequestWakeupState requestWakeupState) {
            this.wakeup_state = Optional.e(requestWakeupState);
            return this;
        }
    }

    public static class RequestWakeupState {
        private Optional<WakeupOriginType> origin = Optional.a();

        public Optional<WakeupOriginType> getOrigin() {
            return this.origin;
        }

        public RequestWakeupState setOrigin(WakeupOriginType wakeupOriginType) {
            this.origin = Optional.e(wakeupOriginType);
            return this;
        }
    }

    public enum ResourceType {
        UNKNOWN(-1),
        MUSIC(0),
        SCENE(1),
        VOICE(2),
        SONG_LIST(3);

        private int id;

        ResourceType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    @NamespaceName(name = "SetClientTracker", namespace = AIApiConstants.General.NAME)
    public static class SetClientTracker implements InstructionPayload {

        @Required
        private String token;

        public SetClientTracker() {
        }

        public SetClientTracker(String str) {
            this.token = str;
        }

        @Required
        public String getToken() {
            return this.token;
        }

        @Required
        public SetClientTracker setToken(String str) {
            this.token = str;
            return this;
        }
    }

    public static class SpeechDebugInfo {
        private Optional<Boolean> is_asr_potential = Optional.a();
        private Optional<Boolean> is_screen_grammar = Optional.a();
        private Optional<String> asr_query_debug = Optional.a();
        private Optional<String> tts_vendor = Optional.a();

        public Optional<String> getAsrQueryDebug() {
            return this.asr_query_debug;
        }

        public Optional<String> getTtsVendor() {
            return this.tts_vendor;
        }

        public Optional<Boolean> isAsrPotential() {
            return this.is_asr_potential;
        }

        public Optional<Boolean> isScreenGrammar() {
            return this.is_screen_grammar;
        }

        public SpeechDebugInfo setAsrQueryDebug(String str) {
            this.asr_query_debug = Optional.e(str);
            return this;
        }

        public SpeechDebugInfo setIsAsrPotential(boolean z) {
            this.is_asr_potential = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public SpeechDebugInfo setIsScreenGrammar(boolean z) {
            this.is_screen_grammar = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public SpeechDebugInfo setTtsVendor(String str) {
            this.tts_vendor = Optional.e(str);
            return this;
        }
    }

    @NamespaceName(name = "Success", namespace = AIApiConstants.General.NAME)
    public static class Success implements InstructionPayload {

        @Required
        private String id;

        public Success() {
        }

        public Success(String str) {
            this.id = str;
        }

        @Required
        public String getId() {
            return this.id;
        }

        @Required
        public Success setId(String str) {
            this.id = str;
            return this;
        }
    }

    public enum ThirdPartyRequestType {
        UNKNOWN(-1),
        TRANSLATE(0),
        TTS(1);

        private int id;

        ThirdPartyRequestType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    @NamespaceName(name = "ThirdPartyWakeupState", namespace = AIApiConstants.General.NAME)
    public static class ThirdPartyWakeupState implements ContextPayload {

        @Required
        private String activity_id;

        @Required
        private String encrypted_user_info;

        @Required
        private String wakeup_id;

        public ThirdPartyWakeupState() {
        }

        public ThirdPartyWakeupState(String str, String str2, String str3) {
            this.encrypted_user_info = str;
            this.activity_id = str2;
            this.wakeup_id = str3;
        }

        @Required
        public String getActivityId() {
            return this.activity_id;
        }

        @Required
        public String getEncryptedUserInfo() {
            return this.encrypted_user_info;
        }

        @Required
        public String getWakeupId() {
            return this.wakeup_id;
        }

        @Required
        public ThirdPartyWakeupState setActivityId(String str) {
            this.activity_id = str;
            return this;
        }

        @Required
        public ThirdPartyWakeupState setEncryptedUserInfo(String str) {
            this.encrypted_user_info = str;
            return this;
        }

        @Required
        public ThirdPartyWakeupState setWakeupId(String str) {
            this.wakeup_id = str;
            return this;
        }
    }

    public static class TranslateParam {

        @Required
        private String src_lang;

        @Required
        private String target_lang;

        @Required
        private String text;

        public TranslateParam() {
        }

        public TranslateParam(String str, String str2, String str3) {
            this.src_lang = str;
            this.target_lang = str2;
            this.text = str3;
        }

        @Required
        public String getSrcLang() {
            return this.src_lang;
        }

        @Required
        public String getTargetLang() {
            return this.target_lang;
        }

        @Required
        public String getText() {
            return this.text;
        }

        @Required
        public TranslateParam setSrcLang(String str) {
            this.src_lang = str;
            return this;
        }

        @Required
        public TranslateParam setTargetLang(String str) {
            this.target_lang = str;
            return this;
        }

        @Required
        public TranslateParam setText(String str) {
            this.text = str;
            return this;
        }
    }

    @NamespaceName(name = "UpdateGlobalContexts", namespace = AIApiConstants.General.NAME)
    public static class UpdateGlobalContexts implements EventPayload {
        private Optional<List<Context<Object>>> create_or_update_items = Optional.a();
        private Optional<List<ContextDeleteItem>> delete_items = Optional.a();

        public Optional<List<Context<Object>>> getCreateOrUpdateItems() {
            return this.create_or_update_items;
        }

        public Optional<List<ContextDeleteItem>> getDeleteItems() {
            return this.delete_items;
        }

        public UpdateGlobalContexts setCreateOrUpdateItems(List<Context<Object>> list) {
            this.create_or_update_items = Optional.e(list);
            return this;
        }

        public UpdateGlobalContexts setDeleteItems(List<ContextDeleteItem> list) {
            this.delete_items = Optional.e(list);
            return this;
        }
    }

    public enum WakeupOriginType {
        UNKNOWN(-1),
        VOICE(0),
        PRESS_BUTTON(1),
        UI(2),
        BLOOTH_TOOTH(3),
        OTHERS(4);

        private int id;

        WakeupOriginType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    @NamespaceName(name = "Push", namespace = AIApiConstants.General.NAME)
    public static class Push implements InstructionPayload {

        @Required
        private mj1 instructions;
        private Optional<PushMsgMeta> msg_meta = Optional.a();

        public Push() {
        }

        @Required
        public mj1 getInstructions() {
            return this.instructions;
        }

        public Optional<PushMsgMeta> getMsgMeta() {
            return this.msg_meta;
        }

        @Required
        public Push setInstructions(mj1 mj1Var) {
            this.instructions = mj1Var;
            return this;
        }

        public Push setMsgMeta(PushMsgMeta pushMsgMeta) {
            this.msg_meta = Optional.e(pushMsgMeta);
            return this;
        }

        public Push(mj1 mj1Var) {
            this.instructions = mj1Var;
        }
    }

    public static class TTSParam {

        @Required
        private String text;
        private Optional<Settings.TtsConfig> tts = Optional.a();

        public TTSParam() {
        }

        @Required
        public String getText() {
            return this.text;
        }

        public Optional<Settings.TtsConfig> getTts() {
            return this.tts;
        }

        @Required
        public TTSParam setText(String str) {
            this.text = str;
            return this;
        }

        public TTSParam setTts(Settings.TtsConfig ttsConfig) {
            this.tts = Optional.e(ttsConfig);
            return this;
        }

        public TTSParam(String str) {
            this.text = str;
        }
    }

    @NamespaceName(name = "Experiment", namespace = AIApiConstants.General.NAME)
    public static class Experiment implements InstructionPayload {

        @Required
        private String eid;
        private Optional<Experiments.ExperimentType> type = Optional.a();
        private Optional<c4h> param = Optional.a();

        public Experiment() {
        }

        @Required
        public String getEid() {
            return this.eid;
        }

        public Optional<c4h> getParam() {
            return this.param;
        }

        public Optional<Experiments.ExperimentType> getType() {
            return this.type;
        }

        @Required
        public Experiment setEid(String str) {
            this.eid = str;
            return this;
        }

        public Experiment setParam(c4h c4hVar) {
            this.param = Optional.e(c4hVar);
            return this;
        }

        public Experiment setType(Experiments.ExperimentType experimentType) {
            this.type = Optional.e(experimentType);
            return this;
        }

        public Experiment(String str) {
            this.eid = str;
        }
    }

    @NamespaceName(name = "ThirdPartyRequest", namespace = AIApiConstants.General.NAME)
    public static class ThirdPartyRequest implements EventPayload {
        private Optional<TranslateParam> translate_param = Optional.a();
        private Optional<TTSParam> tts_param = Optional.a();

        @Required
        private ThirdPartyRequestType type;

        public ThirdPartyRequest() {
        }

        public Optional<TranslateParam> getTranslateParam() {
            return this.translate_param;
        }

        public Optional<TTSParam> getTtsParam() {
            return this.tts_param;
        }

        @Required
        public ThirdPartyRequestType getType() {
            return this.type;
        }

        public ThirdPartyRequest setTranslateParam(TranslateParam translateParam) {
            this.translate_param = Optional.e(translateParam);
            return this;
        }

        public ThirdPartyRequest setTtsParam(TTSParam tTSParam) {
            this.tts_param = Optional.e(tTSParam);
            return this;
        }

        @Required
        public ThirdPartyRequest setType(ThirdPartyRequestType thirdPartyRequestType) {
            this.type = thirdPartyRequestType;
            return this;
        }

        public ThirdPartyRequest(ThirdPartyRequestType thirdPartyRequestType) {
            this.type = thirdPartyRequestType;
        }
    }

    @NamespaceName(name = "SwitchTone", namespace = AIApiConstants.General.NAME)
    public static class SwitchTone implements InstructionPayload {

        @Required
        private String tone_id;
        private Optional<String> vendor_id = Optional.a();
        private Optional<String> speaker = Optional.a();
        private Optional<Common.UserInfo> user = Optional.a();
        private Optional<String> vendor = Optional.a();
        private Optional<String> name = Optional.a();

        public SwitchTone() {
        }

        public Optional<String> getName() {
            return this.name;
        }

        public Optional<String> getSpeaker() {
            return this.speaker;
        }

        @Required
        public String getToneId() {
            return this.tone_id;
        }

        public Optional<Common.UserInfo> getUser() {
            return this.user;
        }

        public Optional<String> getVendor() {
            return this.vendor;
        }

        public Optional<String> getVendorId() {
            return this.vendor_id;
        }

        public SwitchTone setName(String str) {
            this.name = Optional.e(str);
            return this;
        }

        public SwitchTone setSpeaker(String str) {
            this.speaker = Optional.e(str);
            return this;
        }

        @Required
        public SwitchTone setToneId(String str) {
            this.tone_id = str;
            return this;
        }

        public SwitchTone setUser(Common.UserInfo userInfo) {
            this.user = Optional.e(userInfo);
            return this;
        }

        public SwitchTone setVendor(String str) {
            this.vendor = Optional.e(str);
            return this;
        }

        public SwitchTone setVendorId(String str) {
            this.vendor_id = Optional.e(str);
            return this;
        }

        public SwitchTone(String str) {
            this.tone_id = str;
        }
    }
}
