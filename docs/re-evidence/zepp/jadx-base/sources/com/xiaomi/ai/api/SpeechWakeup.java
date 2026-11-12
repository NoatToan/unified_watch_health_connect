package com.xiaomi.ai.api;

import com.xiaomi.ai.api.common.EventPayload;
import com.xiaomi.ai.api.common.NamespaceName;
import com.xiaomi.ai.api.common.Required;
import com.xiaomi.common.Optional;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public class SpeechWakeup {

    public static class AcousticInfo {
        private Optional<String> group_id = Optional.empty();
        private Optional<String> group_info = Optional.empty();
        private Optional<String> wakeup_word_id = Optional.empty();
        private Optional<Long> sse_wakeup_ts = Optional.empty();
        private Optional<List<Float>> voiceprint_enroll_scores = Optional.empty();
        private Optional<String> wakeup_model_version = Optional.empty();

        public Optional<String> getGroupId() {
            return this.group_id;
        }

        public Optional<String> getGroupInfo() {
            return this.group_info;
        }

        public Optional<Long> getSseWakeupTs() {
            return this.sse_wakeup_ts;
        }

        public Optional<List<Float>> getVoiceprintEnrollScores() {
            return this.voiceprint_enroll_scores;
        }

        public Optional<String> getWakeupModelVersion() {
            return this.wakeup_model_version;
        }

        public Optional<String> getWakeupWordId() {
            return this.wakeup_word_id;
        }

        public AcousticInfo setGroupId(String str) {
            this.group_id = Optional.ofNullable(str);
            return this;
        }

        public AcousticInfo setGroupInfo(String str) {
            this.group_info = Optional.ofNullable(str);
            return this;
        }

        public AcousticInfo setSseWakeupTs(long j) {
            this.sse_wakeup_ts = Optional.ofNullable(Long.valueOf(j));
            return this;
        }

        public AcousticInfo setVoiceprintEnrollScores(List<Float> list) {
            this.voiceprint_enroll_scores = Optional.ofNullable(list);
            return this;
        }

        public AcousticInfo setWakeupModelVersion(String str) {
            this.wakeup_model_version = Optional.ofNullable(str);
            return this;
        }

        public AcousticInfo setWakeupWordId(String str) {
            this.wakeup_word_id = Optional.ofNullable(str);
            return this;
        }
    }

    public static class AudioMeta {

        @Required
        private int channel;

        @Required
        private String codec;

        @Required
        private int duration_in_ms;

        @Required
        private int rate;

        @Required
        private String type;
        private Optional<Long> wakeup_time = Optional.empty();

        public AudioMeta() {
        }

        public AudioMeta(String str, int i, int i2, String str2, int i3) {
            this.codec = str;
            this.channel = i;
            this.rate = i2;
            this.type = str2;
            this.duration_in_ms = i3;
        }

        @Required
        public int getChannel() {
            return this.channel;
        }

        @Required
        public String getCodec() {
            return this.codec;
        }

        @Required
        public int getDurationInMs() {
            return this.duration_in_ms;
        }

        @Required
        public int getRate() {
            return this.rate;
        }

        @Required
        public String getType() {
            return this.type;
        }

        public Optional<Long> getWakeupTime() {
            return this.wakeup_time;
        }

        @Required
        public AudioMeta setChannel(int i) {
            this.channel = i;
            return this;
        }

        @Required
        public AudioMeta setCodec(String str) {
            this.codec = str;
            return this;
        }

        @Required
        public AudioMeta setDurationInMs(int i) {
            this.duration_in_ms = i;
            return this;
        }

        @Required
        public AudioMeta setRate(int i) {
            this.rate = i;
            return this;
        }

        @Required
        public AudioMeta setType(String str) {
            this.type = str;
            return this;
        }

        public AudioMeta setWakeupTime(long j) {
            this.wakeup_time = Optional.ofNullable(Long.valueOf(j));
            return this;
        }
    }

    @NamespaceName(name = "Wakeup", namespace = AIApiConstants.SpeechWakeup.NAME)
    public static class Wakeup implements EventPayload {

        @Required
        private AudioMeta audio_meta;

        @Required
        private WakeupInfo wakeup_info;
        private Optional<AcousticInfo> acoustic_info = Optional.empty();
        private Optional<Boolean> recognize_voice_print = Optional.empty();
        private Optional<Boolean> recognize_followed = Optional.empty();

        public Wakeup() {
        }

        public Wakeup(WakeupInfo wakeupInfo, AudioMeta audioMeta) {
            this.wakeup_info = wakeupInfo;
            this.audio_meta = audioMeta;
        }

        public Optional<AcousticInfo> getAcousticInfo() {
            return this.acoustic_info;
        }

        @Required
        public AudioMeta getAudioMeta() {
            return this.audio_meta;
        }

        @Required
        public WakeupInfo getWakeupInfo() {
            return this.wakeup_info;
        }

        public Optional<Boolean> isRecognizeFollowed() {
            return this.recognize_followed;
        }

        public Optional<Boolean> isRecognizeVoicePrint() {
            return this.recognize_voice_print;
        }

        public Wakeup setAcousticInfo(AcousticInfo acousticInfo) {
            this.acoustic_info = Optional.ofNullable(acousticInfo);
            return this;
        }

        @Required
        public Wakeup setAudioMeta(AudioMeta audioMeta) {
            this.audio_meta = audioMeta;
            return this;
        }

        public Wakeup setRecognizeFollowed(boolean z) {
            this.recognize_followed = Optional.ofNullable(Boolean.valueOf(z));
            return this;
        }

        public Wakeup setRecognizeVoicePrint(boolean z) {
            this.recognize_voice_print = Optional.ofNullable(Boolean.valueOf(z));
            return this;
        }

        @Required
        public Wakeup setWakeupInfo(WakeupInfo wakeupInfo) {
            this.wakeup_info = wakeupInfo;
            return this;
        }
    }

    public static class WakeupInfo {

        @Required
        private String type;

        @Required
        private String vendor;
        private Optional<String> word = Optional.empty();
        private Optional<Long> ts = Optional.empty();

        public WakeupInfo() {
        }

        public WakeupInfo(String str, String str2) {
            this.vendor = str;
            this.type = str2;
        }

        public Optional<Long> getTs() {
            return this.ts;
        }

        @Required
        public String getType() {
            return this.type;
        }

        @Required
        public String getVendor() {
            return this.vendor;
        }

        public Optional<String> getWord() {
            return this.word;
        }

        public WakeupInfo setTs(long j) {
            this.ts = Optional.ofNullable(Long.valueOf(j));
            return this;
        }

        @Required
        public WakeupInfo setType(String str) {
            this.type = str;
            return this;
        }

        @Required
        public WakeupInfo setVendor(String str) {
            this.vendor = str;
            return this;
        }

        public WakeupInfo setWord(String str) {
            this.word = Optional.ofNullable(str);
            return this;
        }
    }

    @NamespaceName(name = "WakeupStreamFinished", namespace = AIApiConstants.SpeechWakeup.NAME)
    public static class WakeupStreamFinished implements EventPayload {
    }
}
