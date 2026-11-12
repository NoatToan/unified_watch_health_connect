package com.xiaomi.hm.health.speech.constant;

/* JADX INFO: loaded from: classes21.dex */
public enum SpeechError {
    DEFAULT(-1),
    NO_NETWORK(0),
    EMPTY_AUDIO(1),
    OTHER(2),
    SPEECH_ENGINE_PRE_CONDITION_ILLEGAL(3),
    SPEECH_ENGINE_NO_PERMISSION(4);

    private int speechErrorType;

    SpeechError(int speechErrorType) {
        this.speechErrorType = speechErrorType;
    }

    public static SpeechError getSpeechErrorBySpeechErrorTypeIntValue(int speechErrorTypeIntValue) {
        SpeechError speechError = DEFAULT;
        for (SpeechError speechError2 : values()) {
            if (speechError2.getSpeechErrorType() == speechErrorTypeIntValue) {
                return speechError2;
            }
        }
        return speechError;
    }

    public int getSpeechErrorType() {
        return this.speechErrorType;
    }
}
