package com.xiaomi.ai.core;

/* JADX INFO: loaded from: classes18.dex */
public class c {
    private AivsConfig a;

    public c(AivsConfig aivsConfig) {
        this.a = aivsConfig;
    }

    public String a() {
        if (this.a.containsKey(AivsConfig.Connection.EXTERNAL_CONNECT_URL)) {
            return this.a.getString(AivsConfig.Connection.EXTERNAL_CONNECT_URL);
        }
        int i = this.a.getInt(AivsConfig.ENV);
        if (i == 2) {
            return "ws://speech-staging.ai.xiaomi.com/speech/v1.0/longaccess";
        }
        if (i == 1) {
            return "wss://speech-preview.ai.xiaomi.com/speech/v1.0/longaccess";
        }
        if (i == 3) {
            return "wss://preview4test-access-speech.ai.xiaomi.com/speech/v1.0/longaccess";
        }
        return this.a.getBoolean(AivsConfig.Connection.ENABLE_ABROAD_URL, false) ? "wss://tw.speech.ai.xiaomi.com/speech/v1.0/longaccess" : "wss://speech.ai.xiaomi.com/speech/v1.0/longaccess";
    }

    public String b() {
        if (this.a.containsKey(AivsConfig.Connection.EXTERNAL_CONNECT_URL)) {
            return this.a.getString(AivsConfig.Connection.EXTERNAL_CONNECT_URL);
        }
        int i = this.a.getInt(AivsConfig.ENV);
        if (i == 2) {
            return "ws://staging.access.speech.ai.xiaomi.com/speech/v1.0/longaccess";
        }
        if (i == 1) {
            return "ws://preview.access.speech.ai.xiaomi.com/speech/v1.0/longaccess";
        }
        if (i == 3) {
            return "ws://preview4test.access.speech.ai.xiaomi.com/speech/v1.0/longaccess";
        }
        return this.a.getBoolean(AivsConfig.Connection.ENABLE_ABROAD_URL, false) ? "ws://tw.access.speech.ai.xiaomi.com/speech/v1.0/longaccess" : "ws://access.speech.ai.xiaomi.com/speech/v1.0/longaccess";
    }

    public String c() {
        if (this.a.containsKey(AivsConfig.Connection.EXTERNAL_CONNECT_URL)) {
            return this.a.getString(AivsConfig.Connection.EXTERNAL_CONNECT_URL);
        }
        int i = this.a.getInt(AivsConfig.ENV);
        if (i == 2) {
            return "xmd://staging.accessxmd.speech.ai.xiaomi.com/speech/v1.0/longaccess";
        }
        if (i == 1) {
            return "xmd://preview.accessxmd.speech.ai.xiaomi.com/speech/v1.0/longaccess";
        }
        if (i == 3) {
            return "xmd://preview4test.accessxmd.speech.ai.xiaomi.com/speech/v1.0/longaccess";
        }
        return this.a.getBoolean(AivsConfig.Connection.ENABLE_ABROAD_URL, false) ? "xmd://tw.accessxmd.speech.ai.xiaomi.com/speech/v1.0/longaccess" : "xmd://accessxmd.speech.ai.xiaomi.com/speech/v1.0/longaccess";
    }

    public String d() {
        return this.a.getInt(AivsConfig.ENV) == 2 ? "http://open.account.preview.n.xiaomi.net" : "https://account.xiaomi.com";
    }

    public String e() {
        return this.a.getInt(AivsConfig.ENV) == 2 ? "http://account-staging.ai.xiaomi.com" : "https://account.ai.xiaomi.com";
    }

    public String f() {
        return e();
    }

    public String g() {
        return "https://open.account.xiaomi.com/user/profile";
    }

    public String h() {
        int i = this.a.getInt(AivsConfig.ENV);
        if (i == 0) {
            return "https://tracker.ai.xiaomi.com/track/perf/v2";
        }
        return (i == 1 || i == 3) ? "https://tracker-preview.ai.xiaomi.com/track/perf/v2" : "http://tracker-staging.ai.srv/track/perf/v2";
    }

    public String i() {
        if (this.a.getInt(AivsConfig.ENV) == 0) {
            return "https://tracker.ai.xiaomi.com/track/v3";
        }
        return (this.a.getInt(AivsConfig.ENV) == 1 || this.a.getInt(AivsConfig.ENV) == 3) ? "https://tracker-preview.ai.xiaomi.com/track/v3" : "http://tracker-staging.ai.srv/track/v3";
    }

    public String j() {
        int i = this.a.getInt(AivsConfig.ENV);
        if (i == 0) {
            return "http://tracker.ai.srv/track/uploadLog";
        }
        return (i == 1 || i == 3) ? "https://tracker-preview.ai.xiaomi.com/track/uploadLog" : "http://tracker-staging.ai.srv/track/uploadLog";
    }

    public String k() {
        int i = this.a.getInt(AivsConfig.ENV);
        if (i == 0) {
            return "https://cloudcontrol.ai.xiaomi.com/aivs/v1.0/config";
        }
        return (i == 1 || i == 3) ? "https://cloudcontrol-preview.ai.xiaomi.com/aivs/v1.0/config" : "http://cloudcontrol-staging.ai.xiaomi.com/aivs/v1.0/config";
    }

    public String l() {
        int i = this.a.getInt(AivsConfig.ENV);
        if (i == 0) {
            return "https://nlp.ai.xiaomi.com/voiceassistant/privacy/v2";
        }
        return (i == 1 || i == 3) ? "https://nlp-preview.ai.xiaomi.com/voiceassistant/privacy/v2" : "http://nlp-staging.ai.srv/voiceassistant/privacy/v2";
    }

    public String m() {
        int i = this.a.getInt(AivsConfig.ENV);
        if (i == 0) {
            return "http://query-suggestion.ai.xiaomi.com/simple/litecrypto/uniform/suggest/";
        }
        if (i == 1) {
            return "http://query-suggestion-preview.ai.xiaomi.com/simple/litecrypto/uniform/suggest/";
        }
        return i == 3 ? "http://preview4test-query-suggestion.ai.xiaomi.com/simple/litecrypto/uniform/suggest/" : "http://query-suggestion-staging.ai.xiaomi.com/simple/litecrypto/uniform/suggest/";
    }

    public String n() {
        int i = this.a.getInt(AivsConfig.ENV);
        if (i == 0) {
            return "https://speech.ai.xiaomi.com/speech/v1.0/dump";
        }
        if (i == 1) {
            return "https://speech-preview.ai.xiaomi.com/speech/v1.0/dump";
        }
        return i == 3 ? "https://preview4test-speech.ai.xiaomi.com/speech/v1.0/dump" : "http://speech-staging.ai.xiaomi.com/speech/v1.0/dump";
    }
}
