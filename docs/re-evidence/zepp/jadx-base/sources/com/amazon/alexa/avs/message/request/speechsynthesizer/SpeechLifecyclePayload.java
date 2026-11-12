package com.amazon.alexa.avs.message.request.speechsynthesizer;

import com.amazon.alexa.avs.message.Payload;

/* JADX INFO: loaded from: classes2.dex */
public final class SpeechLifecyclePayload extends Payload {
    private final String token;

    public SpeechLifecyclePayload(String str) {
        this.token = str;
    }

    public String getToken() {
        return this.token;
    }
}
