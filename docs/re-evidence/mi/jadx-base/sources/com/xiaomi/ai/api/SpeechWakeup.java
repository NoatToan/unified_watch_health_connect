package com.xiaomi.ai.api;

import com.xiaomi.ai.api.common.EventPayload;
import com.xiaomi.ai.api.common.NamespaceName;
import com.xiaomi.ai.api.common.Required;
import com.xiaomi.common.Optional;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class SpeechWakeup {

    public static class AcousticInfo {
        private Optional<String> group_id = Optional.a();
        private Optional<String> group_info = Optional.a();
        private Optional<String> wakeup_word_id = Optional.a();
        private Optional<Long> sse_wakeup_ts = Optional.a();
        private Optional<List<Float>> voiceprint_enroll_scores = Optional.a();
        private Optional<String> wakeup_model_version = Optional.a();

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
            this.group_id = Optional.e(str);
            return this;
        }

        public AcousticInfo setGroupInfo(String str) {
            this.group_info = Optional.e(str);
            return this;
        }

        public AcousticInfo setSseWakeupTs(long j) {
            this.sse_wakeup_ts = Optional.e(Long.valueOf(j));
            return this;
        }

        public AcousticInfo setVoiceprintEnrollScores(List<Float> list) {
            this.voiceprint_enroll_scores = Optional.e(list);
            return this;
        }

        public AcousticInfo setWakeupModelVersion(String str) {
            this.wakeup_model_version = Optional.e(str);
            return this;
        }

        public AcousticInfo setWakeupWordId(String str) {
            this.wakeup_word_id = Optional.e(str);
            return this;
        }
    }

    @NamespaceName(name = "WakeupStreamFinished", namespace = AIApiConstants.SpeechWakeup.NAME)
    public static class WakeupStreamFinished implements EventPayload {
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
        private Optional<Long> wakeup_time = Optional.a();

        public AudioMeta() {
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
            this.wakeup_time = Optional.e(Long.valueOf(j));
            return this;
        }

        public AudioMeta(String str, int i, int i2, String str2, int i3) {
            this.codec = str;
            this.channel = i;
            this.rate = i2;
            this.type = str2;
            this.duration_in_ms = i3;
        }
    }

    public static class WakeupInfo {

        @Required
        private String type;

        @Required
        private String vendor;
        private Optional<String> word = Optional.a();
        private Optional<Long> ts = Optional.a();
        private Optional<String> last_request_id = Optional.a();
        private Optional<Long> last_wakeup_time_interval = Optional.a();

        public WakeupInfo() {
        }

        public Optional<String> getLastRequestId() {
            return this.last_request_id;
        }

        public Optional<Long> getLastWakeupTimeInterval() {
            return this.last_wakeup_time_interval;
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

        public WakeupInfo setLastRequestId(String str) {
            this.last_request_id = Optional.e(str);
            return this;
        }

        public WakeupInfo setLastWakeupTimeInterval(long j) {
            this.last_wakeup_time_interval = Optional.e(Long.valueOf(j));
            return this;
        }

        public WakeupInfo setTs(long j) {
            this.ts = Optional.e(Long.valueOf(j));
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
            this.word = Optional.e(str);
            return this;
        }

        public WakeupInfo(String str, String str2) {
            this.vendor = str;
            this.type = str2;
        }
    }

    @NamespaceName(name = "Wakeup", namespace = AIApiConstants.SpeechWakeup.NAME)
    public static class Wakeup implements EventPayload {

        @Required
        private AudioMeta audio_meta;

        @Required
        private WakeupInfo wakeup_info;
        private Optional<AcousticInfo> acoustic_info = Optional.a();
        private Optional<Boolean> recognize_voice_print = Optional.a();
        private Optional<Boolean> recognize_followed = Optional.a();
        private Optional<Boolean> enable_natural_record_v2 = Optional.a();
        private Optional<Boolean> enable_natural_record_v2_duplex = Optional.a();
        private Optional<String> recognize_language = Optional.a();

        public Wakeup() {
        }

        public Optional<AcousticInfo> getAcousticInfo() {
            return this.acoustic_info;
        }

        @Required
        public AudioMeta getAudioMeta() {
            return this.audio_meta;
        }

        public Optional<String> getRecognizeLanguage() {
            return this.recognize_language;
        }

        @Required
        public WakeupInfo getWakeupInfo() {
            return this.wakeup_info;
        }

        public Optional<Boolean> isEnableNaturalRecordV2() {
            return this.enable_natural_record_v2;
        }

        public Optional<Boolean> isEnableNaturalRecordV2Duplex() {
            return this.enable_natural_record_v2_duplex;
        }

        public Optional<Boolean> isRecognizeFollowed() {
            return this.recognize_followed;
        }

        public Optional<Boolean> isRecognizeVoicePrint() {
            return this.recognize_voice_print;
        }

        public Wakeup setAcousticInfo(AcousticInfo acousticInfo) {
            this.acoustic_info = Optional.e(acousticInfo);
            return this;
        }

        @Required
        public Wakeup setAudioMeta(AudioMeta audioMeta) {
            this.audio_meta = audioMeta;
            return this;
        }

        public Wakeup setEnableNaturalRecordV2(boolean z) {
            this.enable_natural_record_v2 = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public Wakeup setEnableNaturalRecordV2Duplex(boolean z) {
            this.enable_natural_record_v2_duplex = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public Wakeup setRecognizeFollowed(boolean z) {
            this.recognize_followed = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public Wakeup setRecognizeLanguage(String str) {
            this.recognize_language = Optional.e(str);
            return this;
        }

        public Wakeup setRecognizeVoicePrint(boolean z) {
            this.recognize_voice_print = Optional.e(Boolean.valueOf(z));
            return this;
        }

        @Required
        public Wakeup setWakeupInfo(WakeupInfo wakeupInfo) {
            this.wakeup_info = wakeupInfo;
            return this;
        }

        public Wakeup(WakeupInfo wakeupInfo, AudioMeta audioMeta) {
            this.wakeup_info = wakeupInfo;
            this.audio_meta = audioMeta;
        }
    }
}
