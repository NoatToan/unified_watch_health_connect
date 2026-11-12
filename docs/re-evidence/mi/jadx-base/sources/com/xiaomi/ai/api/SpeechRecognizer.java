package com.xiaomi.ai.api;

import com.xiaomi.ai.api.common.ContextPayload;
import com.xiaomi.ai.api.common.EventPayload;
import com.xiaomi.ai.api.common.InstructionPayload;
import com.xiaomi.ai.api.common.NamespaceName;
import com.xiaomi.ai.api.common.Required;
import com.xiaomi.common.Optional;
import com.xiaomi.fitness.pay.export.data.response.OrderStatus;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class SpeechRecognizer {

    public static class AIMemoryParam {
        private Optional<String> asr_text = Optional.a();
        private Optional<Boolean> is_new = Optional.a();

        public Optional<String> getAsrText() {
            return this.asr_text;
        }

        public Optional<Boolean> isNew() {
            return this.is_new;
        }

        public AIMemoryParam setAsrText(String str) {
            this.asr_text = Optional.e(str);
            return this;
        }

        public AIMemoryParam setIsNew(boolean z) {
            this.is_new = Optional.e(Boolean.valueOf(z));
            return this;
        }
    }

    public static class AudioProcess {

        @Required
        private AudioProcessType enable;

        public AudioProcess() {
        }

        public AudioProcess(AudioProcessType audioProcessType) {
            this.enable = audioProcessType;
        }

        @Required
        public AudioProcessType getEnable() {
            return this.enable;
        }

        @Required
        public AudioProcess setEnable(AudioProcessType audioProcessType) {
            this.enable = audioProcessType;
            return this;
        }
    }

    public enum AudioProcessType {
        UNKNOWN(-1),
        STORAGE(0),
        STORAGE_ONLY(1);

        private int id;

        AudioProcessType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    @NamespaceName(name = OrderStatus.CANCEL, namespace = AIApiConstants.SpeechRecognizer.NAME)
    public static class Cancel implements EventPayload {
    }

    @NamespaceName(name = "ClientVad", namespace = AIApiConstants.SpeechRecognizer.NAME)
    public static class ClientVad implements EventPayload {
    }

    @NamespaceName(name = "DuplexRecognizeFinished", namespace = AIApiConstants.SpeechRecognizer.NAME)
    public static class DuplexRecognizeFinished implements EventPayload {
    }

    @NamespaceName(name = "DuplexRecognizeStarted", namespace = AIApiConstants.SpeechRecognizer.NAME)
    public static class DuplexRecognizeStarted implements EventPayload {
        private Optional<Settings.AsrConfig> asr = Optional.a();
        private Optional<Settings.TtsConfig> tts = Optional.a();
        private Optional<String> first_round_rid = Optional.a();
        private Optional<Boolean> is_async_tts_audio = Optional.a();

        public Optional<Settings.AsrConfig> getAsr() {
            return this.asr;
        }

        public Optional<String> getFirstRoundRid() {
            return this.first_round_rid;
        }

        public Optional<Settings.TtsConfig> getTts() {
            return this.tts;
        }

        public Optional<Boolean> isAsyncTtsAudio() {
            return this.is_async_tts_audio;
        }

        public DuplexRecognizeStarted setAsr(Settings.AsrConfig asrConfig) {
            this.asr = Optional.e(asrConfig);
            return this;
        }

        public DuplexRecognizeStarted setFirstRoundRid(String str) {
            this.first_round_rid = Optional.e(str);
            return this;
        }

        public DuplexRecognizeStarted setIsAsyncTtsAudio(boolean z) {
            this.is_async_tts_audio = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public DuplexRecognizeStarted setTts(Settings.TtsConfig ttsConfig) {
            this.tts = Optional.e(ttsConfig);
            return this;
        }
    }

    @NamespaceName(name = "ExpectSpeech", namespace = AIApiConstants.SpeechRecognizer.NAME)
    public static class ExpectSpeech implements InstructionPayload {

        @Deprecated
        private Optional<Integer> timeout = Optional.a();
        private Optional<Integer> timeout_in_ms = Optional.a();
        private Optional<PostBack> post_back = Optional.a();
        private Optional<Integer> vad_idle_in_ms = Optional.a();
        private Optional<Boolean> renew_session_after_timeout = Optional.a();
        private Optional<AutoController.Position> position = Optional.a();
        private Optional<Boolean> force_interrupt = Optional.a();

        public Optional<AutoController.Position> getPosition() {
            return this.position;
        }

        public Optional<PostBack> getPostBack() {
            return this.post_back;
        }

        @Deprecated
        public Optional<Integer> getTimeout() {
            return this.timeout;
        }

        public Optional<Integer> getTimeoutInMs() {
            return this.timeout_in_ms;
        }

        public Optional<Integer> getVadIdleInMs() {
            return this.vad_idle_in_ms;
        }

        public Optional<Boolean> isForceInterrupt() {
            return this.force_interrupt;
        }

        public Optional<Boolean> isRenewSessionAfterTimeout() {
            return this.renew_session_after_timeout;
        }

        public ExpectSpeech setForceInterrupt(boolean z) {
            this.force_interrupt = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public ExpectSpeech setPosition(AutoController.Position position) {
            this.position = Optional.e(position);
            return this;
        }

        public ExpectSpeech setPostBack(PostBack postBack) {
            this.post_back = Optional.e(postBack);
            return this;
        }

        public ExpectSpeech setRenewSessionAfterTimeout(boolean z) {
            this.renew_session_after_timeout = Optional.e(Boolean.valueOf(z));
            return this;
        }

        @Deprecated
        public ExpectSpeech setTimeout(int i) {
            this.timeout = Optional.e(Integer.valueOf(i));
            return this;
        }

        public ExpectSpeech setTimeoutInMs(int i) {
            this.timeout_in_ms = Optional.e(Integer.valueOf(i));
            return this;
        }

        public ExpectSpeech setVadIdleInMs(int i) {
            this.vad_idle_in_ms = Optional.e(Integer.valueOf(i));
            return this;
        }
    }

    @NamespaceName(name = "ExtendSpeech", namespace = AIApiConstants.SpeechRecognizer.NAME)
    public static class ExtendSpeech implements InstructionPayload {
        private Optional<Integer> timeout_in_ms = Optional.a();

        public Optional<Integer> getTimeoutInMs() {
            return this.timeout_in_ms;
        }

        public ExtendSpeech setTimeoutInMs(int i) {
            this.timeout_in_ms = Optional.e(Integer.valueOf(i));
            return this;
        }
    }

    public static class OralExaminationParam {

        @Required
        private String oral_text;

        public OralExaminationParam() {
        }

        public OralExaminationParam(String str) {
            this.oral_text = str;
        }

        @Required
        public String getOralText() {
            return this.oral_text;
        }

        @Required
        public OralExaminationParam setOralText(String str) {
            this.oral_text = str;
            return this;
        }
    }

    public static class PostBack {

        @Required
        private AudioProcess audio_process;

        public PostBack() {
        }

        public PostBack(AudioProcess audioProcess) {
            this.audio_process = audioProcess;
        }

        @Required
        public AudioProcess getAudioProcess() {
            return this.audio_process;
        }

        @Required
        public PostBack setAudioProcess(AudioProcess audioProcess) {
            this.audio_process = audioProcess;
            return this;
        }
    }

    @NamespaceName(name = "Recognize", namespace = AIApiConstants.SpeechRecognizer.NAME)
    public static class Recognize implements EventPayload {
        private Optional<Boolean> remove_end_punctuation = Optional.a();

        @Deprecated
        private Optional<PostBack> post_back = Optional.a();
        private Optional<Settings.AsrConfig> asr = Optional.a();
        private Optional<Settings.TtsConfig> tts = Optional.a();
        private Optional<Settings.PreAsrConfig> pre_asr = Optional.a();
        private Optional<RecognizeScenario> scenario = Optional.a();
        private Optional<Boolean> enable_natural_record_v2 = Optional.a();
        private Optional<Boolean> is_using_local_vad = Optional.a();
        private Optional<Boolean> is_duplex_from_offline_speech = Optional.a();
        private Optional<Common.KeyWordFreeType> key_word_free_type = Optional.a();
        private Optional<AutoController.Position> voice_position = Optional.a();

        public Optional<Settings.AsrConfig> getAsr() {
            return this.asr;
        }

        public Optional<Common.KeyWordFreeType> getKeyWordFreeType() {
            return this.key_word_free_type;
        }

        @Deprecated
        public Optional<PostBack> getPostBack() {
            return this.post_back;
        }

        public Optional<Settings.PreAsrConfig> getPreAsr() {
            return this.pre_asr;
        }

        public Optional<RecognizeScenario> getScenario() {
            return this.scenario;
        }

        public Optional<Settings.TtsConfig> getTts() {
            return this.tts;
        }

        public Optional<AutoController.Position> getVoicePosition() {
            return this.voice_position;
        }

        public Optional<Boolean> isDuplexFromOfflineSpeech() {
            return this.is_duplex_from_offline_speech;
        }

        public Optional<Boolean> isEnableNaturalRecordV2() {
            return this.enable_natural_record_v2;
        }

        public Optional<Boolean> isRemoveEndPunctuation() {
            return this.remove_end_punctuation;
        }

        public Optional<Boolean> isUsingLocalVad() {
            return this.is_using_local_vad;
        }

        public Recognize setAsr(Settings.AsrConfig asrConfig) {
            this.asr = Optional.e(asrConfig);
            return this;
        }

        public Recognize setEnableNaturalRecordV2(boolean z) {
            this.enable_natural_record_v2 = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public Recognize setIsDuplexFromOfflineSpeech(boolean z) {
            this.is_duplex_from_offline_speech = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public Recognize setIsUsingLocalVad(boolean z) {
            this.is_using_local_vad = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public Recognize setKeyWordFreeType(Common.KeyWordFreeType keyWordFreeType) {
            this.key_word_free_type = Optional.e(keyWordFreeType);
            return this;
        }

        @Deprecated
        public Recognize setPostBack(PostBack postBack) {
            this.post_back = Optional.e(postBack);
            return this;
        }

        public Recognize setPreAsr(Settings.PreAsrConfig preAsrConfig) {
            this.pre_asr = Optional.e(preAsrConfig);
            return this;
        }

        public Recognize setRemoveEndPunctuation(boolean z) {
            this.remove_end_punctuation = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public Recognize setScenario(RecognizeScenario recognizeScenario) {
            this.scenario = Optional.e(recognizeScenario);
            return this;
        }

        public Recognize setTts(Settings.TtsConfig ttsConfig) {
            this.tts = Optional.e(ttsConfig);
            return this;
        }

        public Recognize setVoicePosition(AutoController.Position position) {
            this.voice_position = Optional.e(position);
            return this;
        }
    }

    public enum RecognizeScenarioType {
        UNKNOWN(-1),
        SIMULTANEOUS_TRANSLATION(0),
        VIDEO_TRANSLATION(1),
        ORAL_EXAMINATION(2),
        AI_MEMORY(3);

        private int id;

        RecognizeScenarioType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    @NamespaceName(name = "RecognizeState", namespace = AIApiConstants.SpeechRecognizer.NAME)
    public static class RecognizeState implements ContextPayload {

        @Required
        private String wakeup_word;

        public RecognizeState() {
        }

        public RecognizeState(String str) {
            this.wakeup_word = str;
        }

        @Required
        public String getWakeupWord() {
            return this.wakeup_word;
        }

        @Required
        public RecognizeState setWakeupWord(String str) {
            this.wakeup_word = str;
            return this;
        }
    }

    @NamespaceName(name = "RecognizeStreamFinished", namespace = AIApiConstants.SpeechRecognizer.NAME)
    public static class RecognizeStreamFinished implements EventPayload {
    }

    @NamespaceName(name = "RecognizeStreamStarted", namespace = AIApiConstants.SpeechRecognizer.NAME)
    public static class RecognizeStreamStarted implements EventPayload {
    }

    public enum RecognizeTranslationWrapMode {
        UNKNOWN(0),
        VAD(1),
        PERIOD(2);

        private int id;

        RecognizeTranslationWrapMode(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    @NamespaceName(name = "RecognizeVoiceprint", namespace = AIApiConstants.SpeechRecognizer.NAME)
    public static class RecognizeVoiceprint implements InstructionPayload {
    }

    @NamespaceName(name = "RegisterVoiceprint", namespace = AIApiConstants.SpeechRecognizer.NAME)
    public static class RegisterVoiceprint implements InstructionPayload {
    }

    @NamespaceName(name = "StopCapture", namespace = AIApiConstants.SpeechRecognizer.NAME)
    public static class StopCapture implements InstructionPayload {
        private Optional<Integer> stop_time = Optional.a();

        public Optional<Integer> getStopTime() {
            return this.stop_time;
        }

        public StopCapture setStopTime(int i) {
            this.stop_time = Optional.e(Integer.valueOf(i));
            return this;
        }
    }

    public enum TranslationScenarioType {
        UNKNOWN(-1),
        SUBTITLE_TRANSLATION(0),
        ONLINE_TRANSLATION(1),
        OFFLINE_TRANSLATION(2),
        RECODER_TRANSLATION(3),
        SCAM_DETECTION(4),
        VIDEO_TRANSLATION(5);

        private int id;

        TranslationScenarioType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    @NamespaceName(name = "VoiceprintIdle", namespace = AIApiConstants.SpeechRecognizer.NAME)
    public static class VoiceprintIdle implements EventPayload {
    }

    public static class VoiceprintRecognitionResult {

        @Required
        private String id;

        @Required
        private String nick_name;

        public VoiceprintRecognitionResult() {
        }

        public VoiceprintRecognitionResult(String str, String str2) {
            this.id = str;
            this.nick_name = str2;
        }

        @Required
        public String getId() {
            return this.id;
        }

        @Required
        public String getNickName() {
            return this.nick_name;
        }

        @Required
        public VoiceprintRecognitionResult setId(String str) {
            this.id = str;
            return this;
        }

        @Required
        public VoiceprintRecognitionResult setNickName(String str) {
            this.nick_name = str;
            return this;
        }
    }

    @NamespaceName(name = "VoiceprintRecognizeResult", namespace = AIApiConstants.SpeechRecognizer.NAME)
    public static class VoiceprintRecognizeResult implements InstructionPayload {

        @Required
        private VoiceprintRecognitionResult result;

        public VoiceprintRecognizeResult() {
        }

        public VoiceprintRecognizeResult(VoiceprintRecognitionResult voiceprintRecognitionResult) {
            this.result = voiceprintRecognitionResult;
        }

        @Required
        public VoiceprintRecognitionResult getResult() {
            return this.result;
        }

        @Required
        public VoiceprintRecognizeResult setResult(VoiceprintRecognitionResult voiceprintRecognitionResult) {
            this.result = voiceprintRecognitionResult;
            return this;
        }
    }

    @NamespaceName(name = "VoiceprintRegistrationStep", namespace = AIApiConstants.SpeechRecognizer.NAME)
    public static class VoiceprintRegistrationStep implements InstructionPayload {

        @Required
        private int all;

        @Required
        private int current;

        public VoiceprintRegistrationStep() {
        }

        public VoiceprintRegistrationStep(int i, int i2) {
            this.all = i;
            this.current = i2;
        }

        @Required
        public int getAll() {
            return this.all;
        }

        @Required
        public int getCurrent() {
            return this.current;
        }

        @Required
        public VoiceprintRegistrationStep setAll(int i) {
            this.all = i;
            return this;
        }

        @Required
        public VoiceprintRegistrationStep setCurrent(int i) {
            this.current = i;
            return this;
        }
    }

    public static class WordTimestamp {

        @Required
        private long timestamp;

        @Required
        private String word;

        public WordTimestamp() {
        }

        public WordTimestamp(long j, String str) {
            this.timestamp = j;
            this.word = str;
        }

        @Required
        public long getTimestamp() {
            return this.timestamp;
        }

        @Required
        public String getWord() {
            return this.word;
        }

        @Required
        public WordTimestamp setTimestamp(long j) {
            this.timestamp = j;
            return this;
        }

        @Required
        public WordTimestamp setWord(String str) {
            this.word = str;
            return this;
        }
    }

    @NamespaceName(name = "RecognizeResult", namespace = AIApiConstants.SpeechRecognizer.NAME)
    public static class RecognizeResult implements InstructionPayload {

        @Required
        private boolean is_final;
        private Optional<Boolean> is_vad_begin = Optional.a();

        @Required
        private List<RecognizeResultItem> results;

        public RecognizeResult() {
        }

        @Required
        public List<RecognizeResultItem> getResults() {
            return this.results;
        }

        @Required
        public boolean isFinal() {
            return this.is_final;
        }

        public Optional<Boolean> isVadBegin() {
            return this.is_vad_begin;
        }

        @Required
        public RecognizeResult setIsFinal(boolean z) {
            this.is_final = z;
            return this;
        }

        public RecognizeResult setIsVadBegin(boolean z) {
            this.is_vad_begin = Optional.e(Boolean.valueOf(z));
            return this;
        }

        @Required
        public RecognizeResult setResults(List<RecognizeResultItem> list) {
            this.results = list;
            return this;
        }

        public RecognizeResult(boolean z, List<RecognizeResultItem> list) {
            this.is_final = z;
            this.results = list;
        }
    }

    public static class VideoTranslationParam {

        @Required
        private String dest_lang;
        private Optional<String> url = Optional.a();

        public VideoTranslationParam() {
        }

        @Required
        public String getDestLang() {
            return this.dest_lang;
        }

        public Optional<String> getUrl() {
            return this.url;
        }

        @Required
        public VideoTranslationParam setDestLang(String str) {
            this.dest_lang = str;
            return this;
        }

        public VideoTranslationParam setUrl(String str) {
            this.url = Optional.e(str);
            return this;
        }

        public VideoTranslationParam(String str) {
            this.dest_lang = str;
        }
    }

    public static class RecognizeTranslationResult {

        @Required
        private String dest_lang;

        @Required
        private String dest_text;

        @Required
        private boolean need_update;
        private Optional<Boolean> is_asr_last = Optional.a();
        private Optional<Boolean> is_translation_last = Optional.a();
        private Optional<Integer> seg_id = Optional.a();

        public RecognizeTranslationResult() {
        }

        @Required
        public String getDestLang() {
            return this.dest_lang;
        }

        @Required
        public String getDestText() {
            return this.dest_text;
        }

        public Optional<Integer> getSegId() {
            return this.seg_id;
        }

        public Optional<Boolean> isAsrLast() {
            return this.is_asr_last;
        }

        @Required
        public boolean isNeedUpdate() {
            return this.need_update;
        }

        public Optional<Boolean> isTranslationLast() {
            return this.is_translation_last;
        }

        @Required
        public RecognizeTranslationResult setDestLang(String str) {
            this.dest_lang = str;
            return this;
        }

        @Required
        public RecognizeTranslationResult setDestText(String str) {
            this.dest_text = str;
            return this;
        }

        public RecognizeTranslationResult setIsAsrLast(boolean z) {
            this.is_asr_last = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public RecognizeTranslationResult setIsTranslationLast(boolean z) {
            this.is_translation_last = Optional.e(Boolean.valueOf(z));
            return this;
        }

        @Required
        public RecognizeTranslationResult setNeedUpdate(boolean z) {
            this.need_update = z;
            return this;
        }

        public RecognizeTranslationResult setSegId(int i) {
            this.seg_id = Optional.e(Integer.valueOf(i));
            return this;
        }

        public RecognizeTranslationResult(String str, String str2, boolean z) {
            this.dest_text = str;
            this.dest_lang = str2;
            this.need_update = z;
        }
    }

    @NamespaceName(name = "VoiceprintRegistrationResult", namespace = AIApiConstants.SpeechRecognizer.NAME)
    public static class VoiceprintRegistrationResult implements InstructionPayload {

        @Required
        private String id;

        @Required
        private int status_code;
        private Optional<String> message = Optional.a();
        private Optional<String> nick_name = Optional.a();
        private Optional<Boolean> is_finished = Optional.a();

        public VoiceprintRegistrationResult() {
        }

        @Required
        public String getId() {
            return this.id;
        }

        public Optional<String> getMessage() {
            return this.message;
        }

        public Optional<String> getNickName() {
            return this.nick_name;
        }

        @Required
        public int getStatusCode() {
            return this.status_code;
        }

        public Optional<Boolean> isFinished() {
            return this.is_finished;
        }

        @Required
        public VoiceprintRegistrationResult setId(String str) {
            this.id = str;
            return this;
        }

        public VoiceprintRegistrationResult setIsFinished(boolean z) {
            this.is_finished = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public VoiceprintRegistrationResult setMessage(String str) {
            this.message = Optional.e(str);
            return this;
        }

        public VoiceprintRegistrationResult setNickName(String str) {
            this.nick_name = Optional.e(str);
            return this;
        }

        @Required
        public VoiceprintRegistrationResult setStatusCode(int i) {
            this.status_code = i;
            return this;
        }

        public VoiceprintRegistrationResult(String str, int i) {
            this.id = str;
            this.status_code = i;
        }
    }

    public static class RecognizeScenario {

        @Required
        private RecognizeScenarioType type;
        private Optional<RecognizeTranslationParam> translation_param = Optional.a();
        private Optional<VideoTranslationParam> video_translation_param = Optional.a();
        private Optional<OralExaminationParam> oral_examination_param = Optional.a();
        private Optional<AIMemoryParam> ai_memory_param = Optional.a();

        public RecognizeScenario() {
        }

        public Optional<AIMemoryParam> getAiMemoryParam() {
            return this.ai_memory_param;
        }

        public Optional<OralExaminationParam> getOralExaminationParam() {
            return this.oral_examination_param;
        }

        public Optional<RecognizeTranslationParam> getTranslationParam() {
            return this.translation_param;
        }

        @Required
        public RecognizeScenarioType getType() {
            return this.type;
        }

        public Optional<VideoTranslationParam> getVideoTranslationParam() {
            return this.video_translation_param;
        }

        public RecognizeScenario setAiMemoryParam(AIMemoryParam aIMemoryParam) {
            this.ai_memory_param = Optional.e(aIMemoryParam);
            return this;
        }

        public RecognizeScenario setOralExaminationParam(OralExaminationParam oralExaminationParam) {
            this.oral_examination_param = Optional.e(oralExaminationParam);
            return this;
        }

        public RecognizeScenario setTranslationParam(RecognizeTranslationParam recognizeTranslationParam) {
            this.translation_param = Optional.e(recognizeTranslationParam);
            return this;
        }

        @Required
        public RecognizeScenario setType(RecognizeScenarioType recognizeScenarioType) {
            this.type = recognizeScenarioType;
            return this;
        }

        public RecognizeScenario setVideoTranslationParam(VideoTranslationParam videoTranslationParam) {
            this.video_translation_param = Optional.e(videoTranslationParam);
            return this;
        }

        public RecognizeScenario(RecognizeScenarioType recognizeScenarioType) {
            this.type = recognizeScenarioType;
        }
    }

    public static class RecognizeResultItem {

        @Required
        private String text;
        private Optional<String> vendor = Optional.a();
        private Optional<Double> confidence = Optional.a();
        private Optional<List<RecognizeTranslationResult>> translation = Optional.a();
        private Optional<Long> begin_offset = Optional.a();
        private Optional<Long> end_offset = Optional.a();
        private Optional<Long> asr_binary_offset = Optional.a();
        private Optional<Boolean> is_nlp_request = Optional.a();
        private Optional<Boolean> is_stop = Optional.a();
        private Optional<String> origin_text = Optional.a();
        private Optional<Integer> speaker_id = Optional.a();
        private Optional<List<WordTimestamp>> words_timestamp = Optional.a();
        private Optional<String> origin_lang = Optional.a();
        private Optional<Long> asr_begin_timestamp = Optional.a();

        public RecognizeResultItem() {
        }

        public Optional<Long> getAsrBeginTimestamp() {
            return this.asr_begin_timestamp;
        }

        public Optional<Long> getAsrBinaryOffset() {
            return this.asr_binary_offset;
        }

        public Optional<Long> getBeginOffset() {
            return this.begin_offset;
        }

        public Optional<Double> getConfidence() {
            return this.confidence;
        }

        public Optional<Long> getEndOffset() {
            return this.end_offset;
        }

        public Optional<String> getOriginLang() {
            return this.origin_lang;
        }

        public Optional<String> getOriginText() {
            return this.origin_text;
        }

        public Optional<Integer> getSpeakerId() {
            return this.speaker_id;
        }

        @Required
        public String getText() {
            return this.text;
        }

        public Optional<List<RecognizeTranslationResult>> getTranslation() {
            return this.translation;
        }

        public Optional<String> getVendor() {
            return this.vendor;
        }

        public Optional<List<WordTimestamp>> getWordsTimestamp() {
            return this.words_timestamp;
        }

        public Optional<Boolean> isNlpRequest() {
            return this.is_nlp_request;
        }

        public Optional<Boolean> isStop() {
            return this.is_stop;
        }

        public RecognizeResultItem setAsrBeginTimestamp(long j) {
            this.asr_begin_timestamp = Optional.e(Long.valueOf(j));
            return this;
        }

        public RecognizeResultItem setAsrBinaryOffset(long j) {
            this.asr_binary_offset = Optional.e(Long.valueOf(j));
            return this;
        }

        public RecognizeResultItem setBeginOffset(long j) {
            this.begin_offset = Optional.e(Long.valueOf(j));
            return this;
        }

        public RecognizeResultItem setConfidence(double d) {
            this.confidence = Optional.e(Double.valueOf(d));
            return this;
        }

        public RecognizeResultItem setEndOffset(long j) {
            this.end_offset = Optional.e(Long.valueOf(j));
            return this;
        }

        public RecognizeResultItem setIsNlpRequest(boolean z) {
            this.is_nlp_request = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public RecognizeResultItem setIsStop(boolean z) {
            this.is_stop = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public RecognizeResultItem setOriginLang(String str) {
            this.origin_lang = Optional.e(str);
            return this;
        }

        public RecognizeResultItem setOriginText(String str) {
            this.origin_text = Optional.e(str);
            return this;
        }

        public RecognizeResultItem setSpeakerId(int i) {
            this.speaker_id = Optional.e(Integer.valueOf(i));
            return this;
        }

        @Required
        public RecognizeResultItem setText(String str) {
            this.text = str;
            return this;
        }

        public RecognizeResultItem setTranslation(List<RecognizeTranslationResult> list) {
            this.translation = Optional.e(list);
            return this;
        }

        public RecognizeResultItem setVendor(String str) {
            this.vendor = Optional.e(str);
            return this;
        }

        public RecognizeResultItem setWordsTimestamp(List<WordTimestamp> list) {
            this.words_timestamp = Optional.e(list);
            return this;
        }

        public RecognizeResultItem(String str) {
            this.text = str;
        }
    }

    public static class RecognizeTranslationParam {

        @Required
        private String dest_lang;
        private Optional<String> version = Optional.a();
        private Optional<RecognizeTranslationWrapMode> wrap_mode = Optional.a();
        private Optional<Boolean> retranslation = Optional.a();
        private Optional<Float> retranslation_rate = Optional.a();
        private Optional<Integer> timeout_in_sec = Optional.a();
        private Optional<Boolean> need_not_translate = Optional.a();
        private Optional<Boolean> need_save_audio = Optional.a();
        private Optional<List<String>> whitelist_device_model = Optional.a();
        private Optional<String> vendor = Optional.a();
        private Optional<TranslationScenarioType> type = Optional.a();
        private Optional<List<String>> origin_lang_list = Optional.a();
        private Optional<Boolean> enable_tts = Optional.a();
        private Optional<Boolean> enable_identify_language = Optional.a();

        public RecognizeTranslationParam() {
        }

        @Required
        public String getDestLang() {
            return this.dest_lang;
        }

        public Optional<List<String>> getOriginLangList() {
            return this.origin_lang_list;
        }

        public Optional<Float> getRetranslationRate() {
            return this.retranslation_rate;
        }

        public Optional<Integer> getTimeoutInSec() {
            return this.timeout_in_sec;
        }

        public Optional<TranslationScenarioType> getType() {
            return this.type;
        }

        public Optional<String> getVendor() {
            return this.vendor;
        }

        public Optional<String> getVersion() {
            return this.version;
        }

        public Optional<List<String>> getWhitelistDeviceModel() {
            return this.whitelist_device_model;
        }

        public Optional<RecognizeTranslationWrapMode> getWrapMode() {
            return this.wrap_mode;
        }

        public Optional<Boolean> isEnableIdentifyLanguage() {
            return this.enable_identify_language;
        }

        public Optional<Boolean> isEnableTts() {
            return this.enable_tts;
        }

        public Optional<Boolean> isNeedNotTranslate() {
            return this.need_not_translate;
        }

        public Optional<Boolean> isNeedSaveAudio() {
            return this.need_save_audio;
        }

        public Optional<Boolean> isRetranslation() {
            return this.retranslation;
        }

        @Required
        public RecognizeTranslationParam setDestLang(String str) {
            this.dest_lang = str;
            return this;
        }

        public RecognizeTranslationParam setEnableIdentifyLanguage(boolean z) {
            this.enable_identify_language = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public RecognizeTranslationParam setEnableTts(boolean z) {
            this.enable_tts = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public RecognizeTranslationParam setNeedNotTranslate(boolean z) {
            this.need_not_translate = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public RecognizeTranslationParam setNeedSaveAudio(boolean z) {
            this.need_save_audio = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public RecognizeTranslationParam setOriginLangList(List<String> list) {
            this.origin_lang_list = Optional.e(list);
            return this;
        }

        public RecognizeTranslationParam setRetranslation(boolean z) {
            this.retranslation = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public RecognizeTranslationParam setRetranslationRate(float f) {
            this.retranslation_rate = Optional.e(Float.valueOf(f));
            return this;
        }

        public RecognizeTranslationParam setTimeoutInSec(int i) {
            this.timeout_in_sec = Optional.e(Integer.valueOf(i));
            return this;
        }

        public RecognizeTranslationParam setType(TranslationScenarioType translationScenarioType) {
            this.type = Optional.e(translationScenarioType);
            return this;
        }

        public RecognizeTranslationParam setVendor(String str) {
            this.vendor = Optional.e(str);
            return this;
        }

        public RecognizeTranslationParam setVersion(String str) {
            this.version = Optional.e(str);
            return this;
        }

        public RecognizeTranslationParam setWhitelistDeviceModel(List<String> list) {
            this.whitelist_device_model = Optional.e(list);
            return this;
        }

        public RecognizeTranslationParam setWrapMode(RecognizeTranslationWrapMode recognizeTranslationWrapMode) {
            this.wrap_mode = Optional.e(recognizeTranslationWrapMode);
            return this;
        }

        public RecognizeTranslationParam(String str) {
            this.dest_lang = str;
        }
    }
}
