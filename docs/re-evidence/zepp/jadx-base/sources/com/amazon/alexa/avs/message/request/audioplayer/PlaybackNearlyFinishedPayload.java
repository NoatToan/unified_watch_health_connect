package com.amazon.alexa.avs.message.request.audioplayer;

import com.amazon.alexa.avs.message.Payload;

/* JADX INFO: loaded from: classes2.dex */
public class PlaybackNearlyFinishedPayload extends Payload {
    private final String navigationToken;

    public PlaybackNearlyFinishedPayload(String str) {
        this.navigationToken = str;
    }

    public String getNavigationToken() {
        return this.navigationToken;
    }
}
