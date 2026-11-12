package com.amazon.alexa.avs.message.request.context;

import com.amazon.alexa.avs.message.Payload;

/* JADX INFO: loaded from: classes2.dex */
public final class PlaybackStatePayload extends Payload {
    private final long offsetInMilliseconds;
    private final String playerActivity;
    private final String token;

    public PlaybackStatePayload(String str, long j, String str2) {
        this.token = str;
        this.offsetInMilliseconds = j;
        this.playerActivity = str2;
    }

    public long getOffsetInMilliseconds() {
        return this.offsetInMilliseconds;
    }

    public String getPlayerActivity() {
        return this.playerActivity;
    }

    public String getToken() {
        return this.token;
    }
}
