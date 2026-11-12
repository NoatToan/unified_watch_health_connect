package com.xiaomi.ai.api;

import com.xiaomi.ai.api.common.InstructionPayload;
import com.xiaomi.ai.api.common.NamespaceName;
import com.xiaomi.ai.api.common.Required;
import com.xiaomi.ai.api.core.nlp.Externals;
import com.xiaomi.common.Optional;
import defpackage.c4h;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class Internal {

    public static class CrossDeviceSession {

        @Required
        private String app_id;

        @Required
        private String device_id;

        @Required
        private String session_id;

        public CrossDeviceSession() {
        }

        public CrossDeviceSession(String str, String str2, String str3) {
            this.app_id = str;
            this.device_id = str2;
            this.session_id = str3;
        }

        @Required
        public String getAppId() {
            return this.app_id;
        }

        @Required
        public String getDeviceId() {
            return this.device_id;
        }

        @Required
        public String getSessionId() {
            return this.session_id;
        }

        @Required
        public CrossDeviceSession setAppId(String str) {
            this.app_id = str;
            return this;
        }

        @Required
        public CrossDeviceSession setDeviceId(String str) {
            this.device_id = str;
            return this;
        }

        @Required
        public CrossDeviceSession setSessionId(String str) {
            this.session_id = str;
            return this;
        }
    }

    public enum NetworkType {
        UNKNOWN(-1),
        NORMAL(0),
        WEAK_NET(1),
        NO_NET(2);

        private int id;

        NetworkType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    @NamespaceName(name = "OfflineExecution", namespace = "Internal")
    public static class OfflineExecution implements InstructionPayload {
        private Optional<TTSChangeInfo> tts_changed = Optional.a();

        public Optional<TTSChangeInfo> getTtsChanged() {
            return this.tts_changed;
        }

        public OfflineExecution setTtsChanged(TTSChangeInfo tTSChangeInfo) {
            this.tts_changed = Optional.e(tTSChangeInfo);
            return this;
        }
    }

    @NamespaceName(name = "SDKNlpState", namespace = "Internal")
    public static class SDKNlpState implements InstructionPayload {
        private Optional<Boolean> is_reject = Optional.a();
        private Optional<Boolean> is_asr_final_generated = Optional.a();
        private Optional<NetworkType> network_type = Optional.a();
        private Optional<String> synced_global_context_id = Optional.a();
        private Optional<Boolean> is_online_llm_timeout = Optional.a();

        public Optional<NetworkType> getNetworkType() {
            return this.network_type;
        }

        public Optional<String> getSyncedGlobalContextId() {
            return this.synced_global_context_id;
        }

        public Optional<Boolean> isAsrFinalGenerated() {
            return this.is_asr_final_generated;
        }

        public Optional<Boolean> isOnlineLlmTimeout() {
            return this.is_online_llm_timeout;
        }

        public Optional<Boolean> isReject() {
            return this.is_reject;
        }

        public SDKNlpState setIsAsrFinalGenerated(boolean z) {
            this.is_asr_final_generated = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public SDKNlpState setIsOnlineLlmTimeout(boolean z) {
            this.is_online_llm_timeout = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public SDKNlpState setIsReject(boolean z) {
            this.is_reject = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public SDKNlpState setNetworkType(NetworkType networkType) {
            this.network_type = Optional.e(networkType);
            return this;
        }

        public SDKNlpState setSyncedGlobalContextId(String str) {
            this.synced_global_context_id = Optional.e(str);
            return this;
        }
    }

    public static class SentenceAnswer {
        private Optional<String> history_operator_type = Optional.a();
        private Optional<String> current_operator_type = Optional.a();
        private Optional<Integer> cache_time = Optional.a();

        public Optional<Integer> getCacheTime() {
            return this.cache_time;
        }

        public Optional<String> getCurrentOperatorType() {
            return this.current_operator_type;
        }

        public Optional<String> getHistoryOperatorType() {
            return this.history_operator_type;
        }

        public SentenceAnswer setCacheTime(int i) {
            this.cache_time = Optional.e(Integer.valueOf(i));
            return this;
        }

        public SentenceAnswer setCurrentOperatorType(String str) {
            this.current_operator_type = Optional.e(str);
            return this;
        }

        public SentenceAnswer setHistoryOperatorType(String str) {
            this.history_operator_type = Optional.e(str);
            return this;
        }
    }

    @NamespaceName(name = "SpeechService", namespace = "Internal")
    public static class SpeechService implements InstructionPayload {

        @Deprecated
        private Optional<Boolean> need_avatar = Optional.a();
        private Optional<Boolean> need_empty_query = Optional.a();
        private Optional<SpeechTTSConfig> tts = Optional.a();
        private Optional<Boolean> tts_enable = Optional.a();
        private Optional<String> domain = Optional.a();
        private Optional<c4h> intention = Optional.a();
        private Optional<Boolean> need_avatar_v3 = Optional.a();
        private Optional<Integer> vad_max_pause_time = Optional.a();
        private Optional<Integer> asr_max_record_time = Optional.a();
        private Optional<Externals.PPRejectionType> rejection_type = Optional.a();
        private Optional<Boolean> skill_enable = Optional.a();
        private Optional<String> skill_id = Optional.a();
        private Optional<SpeechLargeLanguageModelData> large_language_model_data = Optional.a();

        public Optional<Integer> getAsrMaxRecordTime() {
            return this.asr_max_record_time;
        }

        public Optional<String> getDomain() {
            return this.domain;
        }

        public Optional<c4h> getIntention() {
            return this.intention;
        }

        public Optional<SpeechLargeLanguageModelData> getLargeLanguageModelData() {
            return this.large_language_model_data;
        }

        public Optional<Externals.PPRejectionType> getRejectionType() {
            return this.rejection_type;
        }

        public Optional<String> getSkillId() {
            return this.skill_id;
        }

        public Optional<SpeechTTSConfig> getTts() {
            return this.tts;
        }

        public Optional<Integer> getVadMaxPauseTime() {
            return this.vad_max_pause_time;
        }

        @Deprecated
        public Optional<Boolean> isNeedAvatar() {
            return this.need_avatar;
        }

        public Optional<Boolean> isNeedAvatarV3() {
            return this.need_avatar_v3;
        }

        public Optional<Boolean> isNeedEmptyQuery() {
            return this.need_empty_query;
        }

        public Optional<Boolean> isSkillEnable() {
            return this.skill_enable;
        }

        public Optional<Boolean> isTtsEnable() {
            return this.tts_enable;
        }

        public SpeechService setAsrMaxRecordTime(int i) {
            this.asr_max_record_time = Optional.e(Integer.valueOf(i));
            return this;
        }

        public SpeechService setDomain(String str) {
            this.domain = Optional.e(str);
            return this;
        }

        public SpeechService setIntention(c4h c4hVar) {
            this.intention = Optional.e(c4hVar);
            return this;
        }

        public SpeechService setLargeLanguageModelData(SpeechLargeLanguageModelData speechLargeLanguageModelData) {
            this.large_language_model_data = Optional.e(speechLargeLanguageModelData);
            return this;
        }

        @Deprecated
        public SpeechService setNeedAvatar(boolean z) {
            this.need_avatar = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public SpeechService setNeedAvatarV3(boolean z) {
            this.need_avatar_v3 = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public SpeechService setNeedEmptyQuery(boolean z) {
            this.need_empty_query = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public SpeechService setRejectionType(Externals.PPRejectionType pPRejectionType) {
            this.rejection_type = Optional.e(pPRejectionType);
            return this;
        }

        public SpeechService setSkillEnable(boolean z) {
            this.skill_enable = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public SpeechService setSkillId(String str) {
            this.skill_id = Optional.e(str);
            return this;
        }

        public SpeechService setTts(SpeechTTSConfig speechTTSConfig) {
            this.tts = Optional.e(speechTTSConfig);
            return this;
        }

        public SpeechService setTtsEnable(boolean z) {
            this.tts_enable = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public SpeechService setVadMaxPauseTime(int i) {
            this.vad_max_pause_time = Optional.e(Integer.valueOf(i));
            return this;
        }
    }

    @NamespaceName(name = "SpeechStreamControl", namespace = "Internal")
    public static class SpeechStreamControl implements InstructionPayload {
        private Optional<Boolean> end_speak_stream = Optional.a();

        public Optional<Boolean> isEndSpeakStream() {
            return this.end_speak_stream;
        }

        public SpeechStreamControl setEndSpeakStream(boolean z) {
            this.end_speak_stream = Optional.e(Boolean.valueOf(z));
            return this;
        }
    }

    public static class SpeechTTSConfig {
        private Optional<Common.TTSTone> tone = Optional.a();
        private Optional<Integer> stream_tts_tail_silence = Optional.a();

        public Optional<Integer> getStreamTtsTailSilence() {
            return this.stream_tts_tail_silence;
        }

        public Optional<Common.TTSTone> getTone() {
            return this.tone;
        }

        public SpeechTTSConfig setStreamTtsTailSilence(int i) {
            this.stream_tts_tail_silence = Optional.e(Integer.valueOf(i));
            return this;
        }

        public SpeechTTSConfig setTone(Common.TTSTone tTSTone) {
            this.tone = Optional.e(tTSTone);
            return this;
        }
    }

    @NamespaceName(name = "MergeText", namespace = "Internal")
    public static class MergeText implements InstructionPayload {

        @Required
        private Nlp.SummaryTextScenario scenario;

        @Required
        private List<String> text;
        private Optional<List<String>> split_queries = Optional.a();
        private Optional<Long> timeout_ms = Optional.a();

        public MergeText() {
        }

        @Required
        public Nlp.SummaryTextScenario getScenario() {
            return this.scenario;
        }

        public Optional<List<String>> getSplitQueries() {
            return this.split_queries;
        }

        @Required
        public List<String> getText() {
            return this.text;
        }

        public Optional<Long> getTimeoutMs() {
            return this.timeout_ms;
        }

        @Required
        public MergeText setScenario(Nlp.SummaryTextScenario summaryTextScenario) {
            this.scenario = summaryTextScenario;
            return this;
        }

        public MergeText setSplitQueries(List<String> list) {
            this.split_queries = Optional.e(list);
            return this;
        }

        @Required
        public MergeText setText(List<String> list) {
            this.text = list;
            return this;
        }

        public MergeText setTimeoutMs(long j) {
            this.timeout_ms = Optional.e(Long.valueOf(j));
            return this;
        }

        public MergeText(Nlp.SummaryTextScenario summaryTextScenario, List<String> list) {
            this.scenario = summaryTextScenario;
            this.text = list;
        }
    }

    public static class TTSChangeInfo {

        @Required
        private boolean tts_changed;
        private Optional<String> speak_inst_id = Optional.a();
        private Optional<String> tts_domain = Optional.a();

        public TTSChangeInfo() {
        }

        public Optional<String> getSpeakInstId() {
            return this.speak_inst_id;
        }

        public Optional<String> getTtsDomain() {
            return this.tts_domain;
        }

        @Required
        public boolean isTtsChanged() {
            return this.tts_changed;
        }

        public TTSChangeInfo setSpeakInstId(String str) {
            this.speak_inst_id = Optional.e(str);
            return this;
        }

        @Required
        public TTSChangeInfo setTtsChanged(boolean z) {
            this.tts_changed = z;
            return this;
        }

        public TTSChangeInfo setTtsDomain(String str) {
            this.tts_domain = Optional.e(str);
            return this;
        }

        public TTSChangeInfo(boolean z) {
            this.tts_changed = z;
        }
    }

    public static class SpeechLargeLanguageModelData {

        @Required
        private boolean enable_large_language_model_tts;

        @Required
        private String query;
        private Optional<String> model_name = Optional.a();
        private Optional<String> history_system_init = Optional.a();
        private Optional<Double> temperature = Optional.a();
        private Optional<Double> top_p = Optional.a();
        private Optional<Boolean> is_model_changed = Optional.a();

        public SpeechLargeLanguageModelData() {
        }

        public Optional<String> getHistorySystemInit() {
            return this.history_system_init;
        }

        public Optional<String> getModelName() {
            return this.model_name;
        }

        @Required
        public String getQuery() {
            return this.query;
        }

        public Optional<Double> getTemperature() {
            return this.temperature;
        }

        public Optional<Double> getTopP() {
            return this.top_p;
        }

        @Required
        public boolean isEnableLargeLanguageModelTts() {
            return this.enable_large_language_model_tts;
        }

        public Optional<Boolean> isModelChanged() {
            return this.is_model_changed;
        }

        @Required
        public SpeechLargeLanguageModelData setEnableLargeLanguageModelTts(boolean z) {
            this.enable_large_language_model_tts = z;
            return this;
        }

        public SpeechLargeLanguageModelData setHistorySystemInit(String str) {
            this.history_system_init = Optional.e(str);
            return this;
        }

        public SpeechLargeLanguageModelData setIsModelChanged(boolean z) {
            this.is_model_changed = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public SpeechLargeLanguageModelData setModelName(String str) {
            this.model_name = Optional.e(str);
            return this;
        }

        @Required
        public SpeechLargeLanguageModelData setQuery(String str) {
            this.query = str;
            return this;
        }

        public SpeechLargeLanguageModelData setTemperature(double d) {
            this.temperature = Optional.e(Double.valueOf(d));
            return this;
        }

        public SpeechLargeLanguageModelData setTopP(double d) {
            this.top_p = Optional.e(Double.valueOf(d));
            return this;
        }

        public SpeechLargeLanguageModelData(boolean z, String str) {
            this.enable_large_language_model_tts = z;
            this.query = str;
        }
    }
}
