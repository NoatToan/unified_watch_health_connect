package com.xiaomi.ai.api;

import com.xiaomi.ai.api.common.EventPayload;
import com.xiaomi.ai.api.common.InstructionPayload;
import com.xiaomi.ai.api.common.NamespaceName;
import com.xiaomi.ai.api.common.Required;
import com.xiaomi.common.Optional;

/* JADX INFO: loaded from: classes18.dex */
public class SpeechSettings {

    @NamespaceName(name = "OperatedQuery", namespace = AIApiConstants.SpeechSettings.NAME)
    public static class OperatedQuery implements EventPayload {

        @Required
        private String query;

        public OperatedQuery() {
        }

        public OperatedQuery(String str) {
            this.query = str;
        }

        @Required
        public String getQuery() {
            return this.query;
        }

        @Required
        public OperatedQuery setQuery(String str) {
            this.query = str;
            return this;
        }
    }

    @NamespaceName(name = "SetLanguage", namespace = AIApiConstants.SpeechSettings.NAME)
    public static class SetLanguage implements InstructionPayload {

        @Required
        private String asr;
        private Optional<String> tts = Optional.empty();

        public SetLanguage() {
        }

        public SetLanguage(String str) {
            this.asr = str;
        }

        @Required
        public String getAsr() {
            return this.asr;
        }

        public Optional<String> getTts() {
            return this.tts;
        }

        @Required
        public SetLanguage setAsr(String str) {
            this.asr = str;
            return this;
        }

        public SetLanguage setTts(String str) {
            this.tts = Optional.ofNullable(str);
            return this;
        }
    }

    @NamespaceName(name = "UnsupportedLanguage", namespace = AIApiConstants.SpeechSettings.NAME)
    public static class UnsupportedLanguage implements InstructionPayload {

        @Required
        private String lang;

        public UnsupportedLanguage() {
        }

        public UnsupportedLanguage(String str) {
            this.lang = str;
        }

        @Required
        public String getLang() {
            return this.lang;
        }

        @Required
        public UnsupportedLanguage setLang(String str) {
            this.lang = str;
            return this;
        }
    }
}
