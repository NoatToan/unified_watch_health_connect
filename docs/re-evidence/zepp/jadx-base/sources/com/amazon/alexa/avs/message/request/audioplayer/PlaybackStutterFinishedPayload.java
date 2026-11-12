package com.amazon.alexa.avs.message.request.audioplayer;

/* JADX INFO: loaded from: classes2.dex */
public class PlaybackStutterFinishedPayload extends AudioPlayerPayload {
    private final long stutterDurationInMilliseconds;

    public PlaybackStutterFinishedPayload(String str, long j, long j2) {
        super(str, j);
        this.stutterDurationInMilliseconds = j2;
    }

    public long getStutterDurationInMilliseconds() {
        return this.stutterDurationInMilliseconds;
    }
}
