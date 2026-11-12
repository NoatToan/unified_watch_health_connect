package com.xiaomi.ai.api;

import com.xiaomi.ai.api.common.EventPayload;
import com.xiaomi.ai.api.common.InstructionPayload;
import com.xiaomi.ai.api.common.NamespaceName;
import com.xiaomi.ai.api.common.Required;
import com.xiaomi.common.Optional;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class SpeechSynthesizer {

    @NamespaceName(name = "CheckEmptyQuery", namespace = AIApiConstants.SpeechSynthesizer.NAME)
    public static class CheckEmptyQuery implements InstructionPayload {
        private Optional<Integer> duration = Optional.a();

        public Optional<Integer> getDuration() {
            return this.duration;
        }

        public CheckEmptyQuery setDuration(int i) {
            this.duration = Optional.e(Integer.valueOf(i));
            return this;
        }
    }

    @NamespaceName(name = "FinishSpeakStream", namespace = AIApiConstants.SpeechSynthesizer.NAME)
    public static class FinishSpeakStream implements InstructionPayload {
    }

    @NamespaceName(name = "RepeatSpeak", namespace = AIApiConstants.SpeechSynthesizer.NAME)
    public static class RepeatSpeak implements InstructionPayload {
    }

    @NamespaceName(name = "SpeakStream", namespace = AIApiConstants.SpeechSynthesizer.NAME)
    public static class SpeakStream implements InstructionPayload {

        @Required
        private String text;

        public SpeakStream() {
        }

        public SpeakStream(String str) {
            this.text = str;
        }

        @Required
        public String getText() {
            return this.text;
        }

        @Required
        public SpeakStream setText(String str) {
            this.text = str;
            return this;
        }
    }

    public static class SpeechStreamTtsSpeak {

        @Required
        private String text;

        public SpeechStreamTtsSpeak() {
        }

        public SpeechStreamTtsSpeak(String str) {
            this.text = str;
        }

        @Required
        public String getText() {
            return this.text;
        }

        @Required
        public SpeechStreamTtsSpeak setText(String str) {
            this.text = str;
            return this;
        }
    }

    public static class SpeechStreamTtsStartInfo {

        @Required
        private Settings.TtsConfig tts;

        public SpeechStreamTtsStartInfo() {
        }

        public SpeechStreamTtsStartInfo(Settings.TtsConfig ttsConfig) {
            this.tts = ttsConfig;
        }

        @Required
        public Settings.TtsConfig getTts() {
            return this.tts;
        }

        @Required
        public SpeechStreamTtsStartInfo setTts(Settings.TtsConfig ttsConfig) {
            this.tts = ttsConfig;
            return this;
        }
    }

    @NamespaceName(name = "StartSpeakStream", namespace = AIApiConstants.SpeechSynthesizer.NAME)
    public static class StartSpeakStream implements InstructionPayload {
        private Optional<Integer> sample_rate = Optional.a();
        private Optional<Common.TTSCodec> codec = Optional.a();

        public Optional<Common.TTSCodec> getCodec() {
            return this.codec;
        }

        public Optional<Integer> getSampleRate() {
            return this.sample_rate;
        }

        public StartSpeakStream setCodec(Common.TTSCodec tTSCodec) {
            this.codec = Optional.e(tTSCodec);
            return this;
        }

        public StartSpeakStream setSampleRate(int i) {
            this.sample_rate = Optional.e(Integer.valueOf(i));
            return this;
        }
    }

    public enum StreamSynthesizeType {
        UNKNOWN(0),
        BEGIN(1),
        SPEAK_STREAM(2),
        END(3);

        private int id;

        StreamSynthesizeType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public static class TTSEmotion {

        @Required
        private TTSEmotionCategory category;

        @Required
        private TTSEmotionLevel level;

        public TTSEmotion() {
        }

        public TTSEmotion(TTSEmotionCategory tTSEmotionCategory, TTSEmotionLevel tTSEmotionLevel) {
            this.category = tTSEmotionCategory;
            this.level = tTSEmotionLevel;
        }

        @Required
        public TTSEmotionCategory getCategory() {
            return this.category;
        }

        @Required
        public TTSEmotionLevel getLevel() {
            return this.level;
        }

        @Required
        public TTSEmotion setCategory(TTSEmotionCategory tTSEmotionCategory) {
            this.category = tTSEmotionCategory;
            return this;
        }

        @Required
        public TTSEmotion setLevel(TTSEmotionLevel tTSEmotionLevel) {
            this.level = tTSEmotionLevel;
            return this;
        }
    }

    public enum TTSEmotionCategory {
        DEFAULT(0),
        HAPPY(1),
        WARM(2),
        ANGRY(3),
        SAD(4),
        SHY(5),
        SURPRISE(6);

        private int id;

        TTSEmotionCategory(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum TTSEmotionLevel {
        UNKNOWN(-1),
        LOW(0),
        MEDIUM(1),
        HIGH(2);

        private int id;

        TTSEmotionLevel(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public static class TTSIntentInfo {

        @Required
        private String domain;

        public TTSIntentInfo() {
        }

        public TTSIntentInfo(String str) {
            this.domain = str;
        }

        @Required
        public String getDomain() {
            return this.domain;
        }

        @Required
        public TTSIntentInfo setDomain(String str) {
            this.domain = str;
            return this;
        }
    }

    public static class TTSTrackLog {

        @Required
        private String id;

        @Required
        private boolean is_track;

        @Required
        private String source;

        public TTSTrackLog() {
        }

        public TTSTrackLog(String str, String str2, boolean z) {
            this.source = str;
            this.id = str2;
            this.is_track = z;
        }

        @Required
        public String getId() {
            return this.id;
        }

        @Required
        public String getSource() {
            return this.source;
        }

        @Required
        public boolean isTrack() {
            return this.is_track;
        }

        @Required
        public TTSTrackLog setId(String str) {
            this.id = str;
            return this;
        }

        @Required
        public TTSTrackLog setIsTrack(boolean z) {
            this.is_track = z;
            return this;
        }

        @Required
        public TTSTrackLog setSource(String str) {
            this.source = str;
            return this;
        }
    }

    @NamespaceName(name = "StreamSynthesize", namespace = AIApiConstants.SpeechSynthesizer.NAME)
    public static class StreamSynthesize implements EventPayload {

        @Required
        private StreamSynthesizeType type;
        private Optional<SpeechStreamTtsStartInfo> start_info = Optional.a();
        private Optional<SpeechStreamTtsSpeak> speak_stream = Optional.a();

        public StreamSynthesize() {
        }

        public Optional<SpeechStreamTtsSpeak> getSpeakStream() {
            return this.speak_stream;
        }

        public Optional<SpeechStreamTtsStartInfo> getStartInfo() {
            return this.start_info;
        }

        @Required
        public StreamSynthesizeType getType() {
            return this.type;
        }

        public StreamSynthesize setSpeakStream(SpeechStreamTtsSpeak speechStreamTtsSpeak) {
            this.speak_stream = Optional.e(speechStreamTtsSpeak);
            return this;
        }

        public StreamSynthesize setStartInfo(SpeechStreamTtsStartInfo speechStreamTtsStartInfo) {
            this.start_info = Optional.e(speechStreamTtsStartInfo);
            return this;
        }

        @Required
        public StreamSynthesize setType(StreamSynthesizeType streamSynthesizeType) {
            this.type = streamSynthesizeType;
            return this;
        }

        public StreamSynthesize(StreamSynthesizeType streamSynthesizeType) {
            this.type = streamSynthesizeType;
        }
    }

    @NamespaceName(name = "Synthesize", namespace = AIApiConstants.SpeechSynthesizer.NAME)
    public static class Synthesize implements EventPayload {

        @Required
        private String text;
        private Optional<Settings.TtsConfig> tts = Optional.a();
        private Optional<Boolean> need_avatar = Optional.a();
        private Optional<TTSIntentInfo> intent_info = Optional.a();
        private Optional<String> ssml_text = Optional.a();

        public Synthesize() {
        }

        public Optional<TTSIntentInfo> getIntentInfo() {
            return this.intent_info;
        }

        public Optional<String> getSsmlText() {
            return this.ssml_text;
        }

        @Required
        public String getText() {
            return this.text;
        }

        public Optional<Settings.TtsConfig> getTts() {
            return this.tts;
        }

        public Optional<Boolean> isNeedAvatar() {
            return this.need_avatar;
        }

        public Synthesize setIntentInfo(TTSIntentInfo tTSIntentInfo) {
            this.intent_info = Optional.e(tTSIntentInfo);
            return this;
        }

        public Synthesize setNeedAvatar(boolean z) {
            this.need_avatar = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public Synthesize setSsmlText(String str) {
            this.ssml_text = Optional.e(str);
            return this;
        }

        @Required
        public Synthesize setText(String str) {
            this.text = str;
            return this;
        }

        public Synthesize setTts(Settings.TtsConfig ttsConfig) {
            this.tts = Optional.e(ttsConfig);
            return this;
        }

        public Synthesize(String str) {
            this.text = str;
        }
    }

    @NamespaceName(name = "Speak", namespace = AIApiConstants.SpeechSynthesizer.NAME)
    public static class Speak implements InstructionPayload {

        @Required
        private String text;
        private Optional<String> url = Optional.a();
        private Optional<Integer> sample_rate = Optional.a();
        private Optional<TTSEmotion> emotion = Optional.a();
        private Optional<Common.TTSCodec> codec = Optional.a();
        private Optional<Boolean> need_cache = Optional.a();
        private Optional<String> text_with_tag = Optional.a();
        private Optional<List<TTSTrackLog>> tts_log = Optional.a();
        private Optional<Settings.TtsStyle> style = Optional.a();
        private Optional<Boolean> text_only = Optional.a();
        private Optional<Settings.TtsConfig> tts_config = Optional.a();

        public Speak() {
        }

        public Optional<Common.TTSCodec> getCodec() {
            return this.codec;
        }

        public Optional<TTSEmotion> getEmotion() {
            return this.emotion;
        }

        public Optional<Integer> getSampleRate() {
            return this.sample_rate;
        }

        public Optional<Settings.TtsStyle> getStyle() {
            return this.style;
        }

        @Required
        public String getText() {
            return this.text;
        }

        public Optional<String> getTextWithTag() {
            return this.text_with_tag;
        }

        public Optional<Settings.TtsConfig> getTtsConfig() {
            return this.tts_config;
        }

        public Optional<List<TTSTrackLog>> getTtsLog() {
            return this.tts_log;
        }

        public Optional<String> getUrl() {
            return this.url;
        }

        public Optional<Boolean> isNeedCache() {
            return this.need_cache;
        }

        public Optional<Boolean> isTextOnly() {
            return this.text_only;
        }

        public Speak setCodec(Common.TTSCodec tTSCodec) {
            this.codec = Optional.e(tTSCodec);
            return this;
        }

        public Speak setEmotion(TTSEmotion tTSEmotion) {
            this.emotion = Optional.e(tTSEmotion);
            return this;
        }

        public Speak setNeedCache(boolean z) {
            this.need_cache = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public Speak setSampleRate(int i) {
            this.sample_rate = Optional.e(Integer.valueOf(i));
            return this;
        }

        public Speak setStyle(Settings.TtsStyle ttsStyle) {
            this.style = Optional.e(ttsStyle);
            return this;
        }

        @Required
        public Speak setText(String str) {
            this.text = str;
            return this;
        }

        public Speak setTextOnly(boolean z) {
            this.text_only = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public Speak setTextWithTag(String str) {
            this.text_with_tag = Optional.e(str);
            return this;
        }

        public Speak setTtsConfig(Settings.TtsConfig ttsConfig) {
            this.tts_config = Optional.e(ttsConfig);
            return this;
        }

        public Speak setTtsLog(List<TTSTrackLog> list) {
            this.tts_log = Optional.e(list);
            return this;
        }

        public Speak setUrl(String str) {
            this.url = Optional.e(str);
            return this;
        }

        public Speak(String str) {
            this.text = str;
        }
    }
}
