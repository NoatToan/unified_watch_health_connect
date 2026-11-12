package com.xiaomi.hm.health.speech.constant;

/* JADX INFO: loaded from: classes21.dex */
public enum SpeechDialogStatus {
    PROCESSING("PROCESSING"),
    FINISH("FINISH");

    private String speechDialogStatusDesc;

    SpeechDialogStatus(String speechDialogStatusDesc) {
        this.speechDialogStatusDesc = speechDialogStatusDesc;
    }

    public static SpeechDialogStatus getSpeechDialogStatusBySpeechDialogStatusDesc(String speechDialogStatusDesc) {
        for (SpeechDialogStatus speechDialogStatus : values()) {
            if (speechDialogStatus.getSpeechDialogStatusDesc().equals(speechDialogStatusDesc)) {
                return speechDialogStatus;
            }
        }
        return null;
    }

    public String getSpeechDialogStatusDesc() {
        return this.speechDialogStatusDesc;
    }
}
