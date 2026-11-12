package com.amazon.alexa.avs.message.request.speechrecognizer;

import com.amazon.alexa.avs.SpeechProfile;
import com.amazon.alexa.avs.message.Payload;

/* JADX INFO: loaded from: classes2.dex */
public final class SpeechRecognizerPayload extends Payload {
    private final String format;
    private final String profile;

    public SpeechRecognizerPayload(SpeechProfile speechProfile, String str) {
        this.profile = speechProfile.toString();
        this.format = str;
    }

    public String getFormat() {
        return this.format;
    }

    public String getProfile() {
        return this.profile;
    }
}
