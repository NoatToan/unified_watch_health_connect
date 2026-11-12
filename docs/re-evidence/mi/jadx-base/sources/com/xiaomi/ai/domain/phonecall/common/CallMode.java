package com.xiaomi.ai.domain.phonecall.common;

/* JADX INFO: loaded from: classes7.dex */
public enum CallMode {
    DEFAULT("DEFAULT"),
    VIDEO("VIDEO"),
    VOICE("VOICE"),
    HAND_FREE("HAND_FREE");

    private String text;

    CallMode(String str) {
        this.text = str;
    }

    public static CallMode fromString(String str) {
        for (CallMode callMode : values()) {
            if (callMode.getText().equalsIgnoreCase(str)) {
                return callMode;
            }
        }
        return null;
    }

    public String getText() {
        return this.text;
    }
}
