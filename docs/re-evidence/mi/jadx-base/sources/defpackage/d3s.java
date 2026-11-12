package defpackage;

/* JADX INFO: loaded from: classes7.dex */
public class d3s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public e01 f15059a;

    public d3s(e01 e01Var) {
        this.f15059a = e01Var;
    }

    public static String b(int i) {
        if (i == 0) {
            return "https://speech.ai.xiaomi.com/speech/v1.0/dump";
        }
        if (i == 1) {
            return "https://speech-preview.ai.xiaomi.com/speech/v1.0/dump";
        }
        return i == 3 ? "https://preview4test-speech.ai.xiaomi.com/speech/v1.0/dump" : "http://speech-staging.ai.xiaomi.com/speech/v1.0/dump";
    }

    public String a() {
        int iE = this.f15059a.e("aivs.env");
        if (iE == 2) {
            return "http://account-staging.ai.xiaomi.com";
        }
        return (iE == 1 || iE == 3) ? "https://account-preview.ai.xiaomi.com" : "https://account.ai.xiaomi.com";
    }

    public String c() {
        return "https://open.account.xiaomi.com/user/profile";
    }

    public String d() {
        int iE = this.f15059a.e("aivs.env");
        if (iE == 0) {
            return "https://cloudcontrol.ai.xiaomi.com/aivs/v1.0/config";
        }
        return (iE == 1 || iE == 3) ? "https://cloudcontrol-preview.ai.xiaomi.com/aivs/v1.0/config" : "http://cloudcontrol-staging.ai.xiaomi.com/aivs/v1.0/config";
    }

    public String e() {
        return a();
    }

    public String f() {
        if (this.f15059a.e("aivs.env") == 0) {
            return "https://tracker.ai.xiaomi.com/track/v3";
        }
        return (this.f15059a.e("aivs.env") == 1 || this.f15059a.e("aivs.env") == 3) ? "https://tracker-preview.ai.xiaomi.com/track/v3" : "http://tracker-staging.ai.srv/track/v3";
    }

    public String g() {
        int iE = this.f15059a.e("aivs.env");
        if (iE == 0) {
            return "https://speech.ai.xiaomi.com/speech/v1.0/wensheng/store";
        }
        return (iE == 1 || iE == 3) ? "https://speech-preview.ai.xiaomi.com/speech/v1.0/wensheng/store" : "http://speech-staging.ai.srv/speech/v1.0/wensheng/store";
    }

    public String h() {
        if (this.f15059a.a("connection.external_connect_url")) {
            return this.f15059a.i("connection.external_connect_url");
        }
        int iE = this.f15059a.e("aivs.env");
        if (iE == 2) {
            return "ws://staging.access.speech.ai.xiaomi.com/speech/v1.0/longaccess";
        }
        if (iE == 1) {
            return "ws://preview.access.speech.ai.xiaomi.com/speech/v1.0/longaccess";
        }
        if (iE == 3) {
            return "ws://preview4test.access.speech.ai.xiaomi.com/speech/v1.0/longaccess";
        }
        return this.f15059a.c("connection.enable_abroad_url", false) ? "ws://tw.access.speech.ai.xiaomi.com/speech/v1.0/longaccess" : "ws://access.speech.ai.xiaomi.com/speech/v1.0/longaccess";
    }

    public String i() {
        if (this.f15059a.a("connection.external_connect_url")) {
            return this.f15059a.i("connection.external_connect_url");
        }
        int iE = this.f15059a.e("aivs.env");
        if (iE == 2) {
            return "xmd://staging.accessxmd.speech.ai.xiaomi.com/speech/v1.0/longaccess";
        }
        if (iE == 1) {
            return "xmd://preview.accessxmd.speech.ai.xiaomi.com/speech/v1.0/longaccess";
        }
        if (iE == 3) {
            return "xmd://preview4test.accessxmd.speech.ai.xiaomi.com/speech/v1.0/longaccess";
        }
        return this.f15059a.c("connection.enable_abroad_url", false) ? "xmd://tw.accessxmd.speech.ai.xiaomi.com/speech/v1.0/longaccess" : "xmd://accessxmd.speech.ai.xiaomi.com/speech/v1.0/longaccess";
    }

    public String j() {
        int iE = this.f15059a.e("aivs.env");
        if (iE == 0) {
            return "https://speech.ai.xiaomi.com/speech/v1.0/dump";
        }
        if (iE == 1) {
            return "https://speech-preview.ai.xiaomi.com/speech/v1.0/dump";
        }
        return iE == 3 ? "https://preview4test-speech.ai.xiaomi.com/speech/v1.0/dump" : "http://speech-staging.ai.xiaomi.com/speech/v1.0/dump";
    }

    public String k() {
        return this.f15059a.e("aivs.env") == 2 ? "http://open.account.preview.n.xiaomi.net" : "https://account.xiaomi.com";
    }

    public String l() {
        int iE = this.f15059a.e("aivs.env");
        if (iE == 0) {
            return "https://nlp.ai.xiaomi.com/voiceassistant/privacy/v2";
        }
        return (iE == 1 || iE == 3) ? "https://nlp-preview.ai.xiaomi.com/voiceassistant/privacy/v2" : "http://nlp-staging.ai.srv/voiceassistant/privacy/v2";
    }

    public String m() {
        int iE = this.f15059a.e("aivs.env");
        if (iE == 0) {
            return "https://tracker.ai.xiaomi.com/track/perf/v2";
        }
        return (iE == 1 || iE == 3) ? "https://tracker-preview.ai.xiaomi.com/track/perf/v2" : "http://tracker-staging.ai.srv/track/perf/v2";
    }

    public String n() {
        int iE = this.f15059a.e("aivs.env");
        if (iE == 0) {
            return "http://query-suggestion.ai.xiaomi.com/simple/litecrypto/uniform/suggest/";
        }
        if (iE == 1) {
            return "http://query-suggestion-preview.ai.xiaomi.com/simple/litecrypto/uniform/suggest/";
        }
        return iE == 3 ? "http://preview4test-query-suggestion.ai.xiaomi.com/simple/litecrypto/uniform/suggest/" : "http://query-suggestion-staging.ai.xiaomi.com/simple/litecrypto/uniform/suggest/";
    }

    public String o() {
        if (this.f15059a.a("connection.external_connect_url")) {
            return this.f15059a.i("connection.external_connect_url");
        }
        int iE = this.f15059a.e("aivs.env");
        if (iE == 2) {
            return "ws://speech-staging.ai.xiaomi.com/speech/v1.0/longaccess";
        }
        if (iE == 1) {
            return "wss://speech-preview.ai.xiaomi.com/speech/v1.0/longaccess";
        }
        if (iE == 3) {
            return "wss://preview4test-access-speech.ai.xiaomi.com/speech/v1.0/longaccess";
        }
        return this.f15059a.c("connection.enable_abroad_url", false) ? "wss://tw.speech.ai.xiaomi.com/speech/v1.0/longaccess" : "wss://speech.ai.xiaomi.com/speech/v1.0/longaccess";
    }
}
