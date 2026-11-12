package com.amazon.alexa.avs;

/* JADX INFO: loaded from: classes2.dex */
public enum SpeechProfile {
    CLOSE_TALK("CLOSE_TALK"),
    NEAR_FIELD("NEAR_FIELD");

    private final String profileName;

    SpeechProfile(String str) {
        this.profileName = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.profileName;
    }
}
