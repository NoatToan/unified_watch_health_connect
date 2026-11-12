package com.google.android.exoplayer2.util;

import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.PlaybackParameters;

/* JADX INFO: loaded from: classes3.dex */
public final class StandaloneMediaClock implements MediaClock {
    private final Clock a;
    private boolean b;
    private long c;
    private long d;
    private PlaybackParameters e = PlaybackParameters.DEFAULT;

    public StandaloneMediaClock(Clock clock) {
        this.a = clock;
    }

    @Override // com.google.android.exoplayer2.util.MediaClock
    public PlaybackParameters getPlaybackParameters() {
        return this.e;
    }

    @Override // com.google.android.exoplayer2.util.MediaClock
    public long getPositionUs() {
        long j = this.c;
        if (!this.b) {
            return j;
        }
        long jElapsedRealtime = this.a.elapsedRealtime() - this.d;
        PlaybackParameters playbackParameters = this.e;
        return j + (playbackParameters.speed == 1.0f ? C.msToUs(jElapsedRealtime) : playbackParameters.getMediaTimeUsForPlayoutTimeMs(jElapsedRealtime));
    }

    public void resetPosition(long positionUs) {
        this.c = positionUs;
        if (this.b) {
            this.d = this.a.elapsedRealtime();
        }
    }

    @Override // com.google.android.exoplayer2.util.MediaClock
    public void setPlaybackParameters(PlaybackParameters playbackParameters) {
        if (this.b) {
            resetPosition(getPositionUs());
        }
        this.e = playbackParameters;
    }

    public void start() {
        if (this.b) {
            return;
        }
        this.d = this.a.elapsedRealtime();
        this.b = true;
    }

    public void stop() {
        if (this.b) {
            resetPosition(getPositionUs());
            this.b = false;
        }
    }
}
