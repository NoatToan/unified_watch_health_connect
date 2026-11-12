package com.xiaomi.hm.health.speech.constant;

/* JADX INFO: loaded from: classes21.dex */
public enum AiEnginePlatform {
    XIAOMI("xiaoai"),
    AMAZON("Alexa");

    private String engineDesc;

    AiEnginePlatform(String engineDesc) {
        this.engineDesc = engineDesc;
    }

    public String getEngineDesc() {
        return this.engineDesc;
    }
}
