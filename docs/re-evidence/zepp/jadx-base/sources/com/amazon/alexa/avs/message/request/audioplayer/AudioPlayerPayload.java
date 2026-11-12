package com.amazon.alexa.avs.message.request.audioplayer;

import com.amazon.alexa.avs.message.Payload;

/* JADX INFO: loaded from: classes2.dex */
public class AudioPlayerPayload extends Payload {
    private final long offsetInMilliseconds;
    private final String token;

    public AudioPlayerPayload(String str, long j) {
        this.token = str;
        this.offsetInMilliseconds = j;
    }

    public long getOffsetInMilliseconds() {
        return this.offsetInMilliseconds;
    }

    public String getToken() {
        return this.token;
    }
}
