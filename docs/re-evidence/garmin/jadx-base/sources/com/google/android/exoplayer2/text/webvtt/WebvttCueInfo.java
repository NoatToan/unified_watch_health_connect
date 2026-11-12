package com.google.android.exoplayer2.text.webvtt;

import com.google.android.exoplayer2.text.Cue;

/* JADX INFO: loaded from: classes14.dex */
public final class WebvttCueInfo {
    public final Cue cue;
    public final long endTimeUs;
    public final long startTimeUs;

    public WebvttCueInfo(Cue cue, long j8, long j14) {
        this.cue = cue;
        this.startTimeUs = j8;
        this.endTimeUs = j14;
    }
}
