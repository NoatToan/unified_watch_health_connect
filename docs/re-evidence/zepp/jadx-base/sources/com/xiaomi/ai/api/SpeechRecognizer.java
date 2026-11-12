package com.xiaomi.ai.api;

import com.amazon.alexa.avs.AVSAPIConstants;
import com.xiaomi.ai.api.common.ContextPayload;
import com.xiaomi.ai.api.common.EventPayload;
import com.xiaomi.ai.api.common.InstructionPayload;
import com.xiaomi.ai.api.common.NamespaceName;
import com.xiaomi.ai.api.common.Required;
import com.xiaomi.common.Optional;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public class SpeechRecognizer {

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

    @NamespaceName(name = "Cancel", namespace = "SpeechRecognizer")
    public static class Cancel implements EventPayload {
    }

    @NamespaceName(name = AVSAPIConstants.SpeechRecognizer.Directives.ExpectSpeech.NAME, namespace = "SpeechRecognizer")
    public static class ExpectSpeech implements InstructionPayload {

        @Deprecated
        private Optional<Integer> timeout = Optional.empty();
        private Optional<Integer> timeout_in_ms = Optional.empty();
        private Optional<PostBack> post_back = Optional.empty();
        private Optional<Integer> vad_idle_in_ms = Optional.empty();
        private Optional<Boolean> renew_session_after_timeout = Optional.empty();

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

        public Optional<Boolean> isRenewSessionAfterTimeout() {
            return this.renew_session_after_timeout;
        }

        public ExpectSpeech setPostBack(PostBack postBack) {
            this.post_back = Optional.ofNullable(postBack);
            return this;
        }

        public ExpectSpeech setRenewSessionAfterTimeout(boolean z) {
            this.renew_session_after_timeout = Optional.ofNullable(Boolean.valueOf(z));
            return this;
        }

        @Deprecated
        public ExpectSpeech setTimeout(int i) {
            this.timeout = Optional.ofNullable(Integer.valueOf(i));
            return this;
        }

        public ExpectSpeech setTimeoutInMs(int i) {
            this.timeout_in_ms = Optional.ofNullable(Integer.valueOf(i));
            return this;
        }

        public ExpectSpeech setVadIdleInMs(int i) {
            this.vad_idle_in_ms = Optional.ofNullable(Integer.valueOf(i));
            return this;
        }
    }

    @NamespaceName(name = "ExtendSpeech", namespace = "SpeechRecognizer")
    public static class ExtendSpeech implements InstructionPayload {
        private Optional<Integer> timeout_in_ms = Optional.empty();

        public Optional<Integer> getTimeoutInMs() {
            return this.timeout_in_ms;
        }

        public ExtendSpeech setTimeoutInMs(int i) {
            this.timeout_in_ms = Optional.ofNullable(Integer.valueOf(i));
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

    @NamespaceName(name = AVSAPIConstants.SpeechRecognizer.Events.Recognize.NAME, namespace = "SpeechRecognizer")
    public static class Recognize implements EventPayload {
        private Optional<Boolean> remove_end_punctuation = Optional.empty();

        @Deprecated
        private Optional<PostBack> post_back = Optional.empty();
        private Optional<Settings.AsrConfig> asr = Optional.empty();
        private Optional<Settings.TtsConfig> tts = Optional.empty();
        private Optional<Settings.PreAsrConfig> pre_asr = Optional.empty();
        private Optional<RecognizeScenario> scenario = Optional.empty();

        public Optional<Settings.AsrConfig> getAsr() {
            return this.asr;
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

        public Optional<Boolean> isRemoveEndPunctuation() {
            return this.remove_end_punctuation;
        }

        public Recognize setAsr(Settings.AsrConfig asrConfig) {
            this.asr = Optional.ofNullable(asrConfig);
            return this;
        }

        @Deprecated
        public Recognize setPostBack(PostBack postBack) {
            this.post_back = Optional.ofNullable(postBack);
            return this;
        }

        public Recognize setPreAsr(Settings.PreAsrConfig preAsrConfig) {
            this.pre_asr = Optional.ofNullable(preAsrConfig);
            return this;
        }

        public Recognize setRemoveEndPunctuation(boolean z) {
            this.remove_end_punctuation = Optional.ofNullable(Boolean.valueOf(z));
            return this;
        }

        public Recognize setScenario(RecognizeScenario recognizeScenario) {
            this.scenario = Optional.ofNullable(recognizeScenario);
            return this;
        }

        public Recognize setTts(Settings.TtsConfig ttsConfig) {
            this.tts = Optional.ofNullable(ttsConfig);
            return this;
        }
    }

    @NamespaceName(name = "RecognizeResult", namespace = "SpeechRecognizer")
    public static class RecognizeResult implements InstructionPayload {

        @Required
        private boolean is_final;

        @Required
        private List<RecognizeResultItem> results;

        public RecognizeResult() {
        }

        public RecognizeResult(boolean z, List<RecognizeResultItem> list) {
            this.is_final = z;
            this.results = list;
        }

        @Required
        public List<RecognizeResultItem> getResults() {
            return this.results;
        }

        @Required
        public boolean isFinal() {
            return this.is_final;
        }

        @Required
        public RecognizeResult setIsFinal(boolean z) {
            this.is_final = z;
            return this;
        }

        @Required
        public RecognizeResult setResults(List<RecognizeResultItem> list) {
            this.results = list;
            return this;
        }
    }

    public static class RecognizeResultItem {

        @Required
        private String text;
        private Optional<String> vendor = Optional.empty();
        private Optional<Double> confidence = Optional.empty();
        private Optional<List<RecognizeTranslationResult>> translation = Optional.empty();
        private Optional<Long> begin_offset = Optional.empty();
        private Optional<Long> end_offset = Optional.empty();
        private Optional<Long> asr_binary_offset = Optional.empty();

        public RecognizeResultItem() {
        }

        public RecognizeResultItem(String str) {
            this.text = str;
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

        public RecognizeResultItem setAsrBinaryOffset(long j) {
            this.asr_binary_offset = Optional.ofNullable(Long.valueOf(j));
            return this;
        }

        public RecognizeResultItem setBeginOffset(long j) {
            this.begin_offset = Optional.ofNullable(Long.valueOf(j));
            return this;
        }

        public RecognizeResultItem setConfidence(double d) {
            this.confidence = Optional.ofNullable(Double.valueOf(d));
            return this;
        }

        public RecognizeResultItem setEndOffset(long j) {
            this.end_offset = Optional.ofNullable(Long.valueOf(j));
            return this;
        }

        @Required
        public RecognizeResultItem setText(String str) {
            this.text = str;
            return this;
        }

        public RecognizeResultItem setTranslation(List<RecognizeTranslationResult> list) {
            this.translation = Optional.ofNullable(list);
            return this;
        }

        public RecognizeResultItem setVendor(String str) {
            this.vendor = Optional.ofNullable(str);
            return this;
        }
    }

    public static class RecognizeScenario {

        @Required
        private RecognizeScenarioType type;
        private Optional<RecognizeTranslationParam> translation_param = Optional.empty();
        private Optional<VideoTranslationParam> video_translation_param = Optional.empty();
        private Optional<OralExaminationParam> oral_examination_param = Optional.empty();

        public RecognizeScenario() {
        }

        public RecognizeScenario(RecognizeScenarioType recognizeScenarioType) {
            this.type = recognizeScenarioType;
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

        public RecognizeScenario setOralExaminationParam(OralExaminationParam oralExaminationParam) {
            this.oral_examination_param = Optional.ofNullable(oralExaminationParam);
            return this;
        }

        public RecognizeScenario setTranslationParam(RecognizeTranslationParam recognizeTranslationParam) {
            this.translation_param = Optional.ofNullable(recognizeTranslationParam);
            return this;
        }

        @Required
        public RecognizeScenario setType(RecognizeScenarioType recognizeScenarioType) {
            this.type = recognizeScenarioType;
            return this;
        }

        public RecognizeScenario setVideoTranslationParam(VideoTranslationParam videoTranslationParam) {
            this.video_translation_param = Optional.ofNullable(videoTranslationParam);
            return this;
        }
    }

    public enum RecognizeScenarioType {
        SIMULTANEOUS_TRANSLATION(0),
        VIDEO_TRANSLATION(1),
        ORAL_EXAMINATION(2);

        private int id;

        RecognizeScenarioType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    @NamespaceName(name = "RecognizeState", namespace = "SpeechRecognizer")
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

    @NamespaceName(name = "RecognizeStreamFinished", namespace = "SpeechRecognizer")
    public static class RecognizeStreamFinished implements EventPayload {
    }

    @NamespaceName(name = "RecognizeStreamStarted", namespace = "SpeechRecognizer")
    public static class RecognizeStreamStarted implements EventPayload {
    }

    public static class RecognizeTranslationParam {

        @Required
        private String dest_lang;
        private Optional<String> version = Optional.empty();
        private Optional<RecognizeTranslationWrapMode> wrap_mode = Optional.empty();
        private Optional<Boolean> retranslation = Optional.empty();
        private Optional<Float> retranslation_rate = Optional.empty();

        public RecognizeTranslationParam() {
        }

        public RecognizeTranslationParam(String str) {
            this.dest_lang = str;
        }

        @Required
        public String getDestLang() {
            return this.dest_lang;
        }

        public Optional<Float> getRetranslationRate() {
            return this.retranslation_rate;
        }

        public Optional<String> getVersion() {
            return this.version;
        }

        public Optional<RecognizeTranslationWrapMode> getWrapMode() {
            return this.wrap_mode;
        }

        public Optional<Boolean> isRetranslation() {
            return this.retranslation;
        }

        @Required
        public RecognizeTranslationParam setDestLang(String str) {
            this.dest_lang = str;
            return this;
        }

        public RecognizeTranslationParam setRetranslation(boolean z) {
            this.retranslation = Optional.ofNullable(Boolean.valueOf(z));
            return this;
        }

        public RecognizeTranslationParam setRetranslationRate(float f) {
            this.retranslation_rate = Optional.ofNullable(Float.valueOf(f));
            return this;
        }

        public RecognizeTranslationParam setVersion(String str) {
            this.version = Optional.ofNullable(str);
            return this;
        }

        public RecognizeTranslationParam setWrapMode(RecognizeTranslationWrapMode recognizeTranslationWrapMode) {
            this.wrap_mode = Optional.ofNullable(recognizeTranslationWrapMode);
            return this;
        }
    }

    public static class RecognizeTranslationResult {

        @Required
        private String dest_lang;

        @Required
        private String dest_text;

        @Required
        private boolean need_update;
        private Optional<Boolean> is_asr_last = Optional.empty();
        private Optional<Boolean> is_translation_last = Optional.empty();
        private Optional<Integer> seg_id = Optional.empty();

        public RecognizeTranslationResult() {
        }

        public RecognizeTranslationResult(String str, String str2, boolean z) {
            this.dest_text = str;
            this.dest_lang = str2;
            this.need_update = z;
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
            this.is_asr_last = Optional.ofNullable(Boolean.valueOf(z));
            return this;
        }

        public RecognizeTranslationResult setIsTranslationLast(boolean z) {
            this.is_translation_last = Optional.ofNullable(Boolean.valueOf(z));
            return this;
        }

        @Required
        public RecognizeTranslationResult setNeedUpdate(boolean z) {
            this.need_update = z;
            return this;
        }

        public RecognizeTranslationResult setSegId(int i) {
            this.seg_id = Optional.ofNullable(Integer.valueOf(i));
            return this;
        }
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

    @NamespaceName(name = "RecognizeVoiceprint", namespace = "SpeechRecognizer")
    public static class RecognizeVoiceprint implements InstructionPayload {
    }

    @NamespaceName(name = "RegisterVoiceprint", namespace = "SpeechRecognizer")
    public static class RegisterVoiceprint implements InstructionPayload {
    }

    @NamespaceName(name = AVSAPIConstants.SpeechRecognizer.Directives.StopCapture.NAME, namespace = "SpeechRecognizer")
    public static class StopCapture implements InstructionPayload {
    }

    public static class VideoTranslationParam {

        @Required
        private String dest_lang;
        private Optional<String> url = Optional.empty();

        public VideoTranslationParam() {
        }

        public VideoTranslationParam(String str) {
            this.dest_lang = str;
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
            this.url = Optional.ofNullable(str);
            return this;
        }
    }

    @NamespaceName(name = "VoiceprintIdle", namespace = "SpeechRecognizer")
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

    @NamespaceName(name = "VoiceprintRecognizeResult", namespace = "SpeechRecognizer")
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

    @NamespaceName(name = "VoiceprintRegistrationResult", namespace = "SpeechRecognizer")
    public static class VoiceprintRegistrationResult implements InstructionPayload {

        @Required
        private String id;

        @Required
        private int status_code;
        private Optional<String> message = Optional.empty();
        private Optional<String> nick_name = Optional.empty();
        private Optional<Boolean> is_finished = Optional.empty();

        public VoiceprintRegistrationResult() {
        }

        public VoiceprintRegistrationResult(String str, int i) {
            this.id = str;
            this.status_code = i;
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
            this.is_finished = Optional.ofNullable(Boolean.valueOf(z));
            return this;
        }

        public VoiceprintRegistrationResult setMessage(String str) {
            this.message = Optional.ofNullable(str);
            return this;
        }

        public VoiceprintRegistrationResult setNickName(String str) {
            this.nick_name = Optional.ofNullable(str);
            return this;
        }

        @Required
        public VoiceprintRegistrationResult setStatusCode(int i) {
            this.status_code = i;
            return this;
        }
    }

    @NamespaceName(name = "VoiceprintRegistrationStep", namespace = "SpeechRecognizer")
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
}
