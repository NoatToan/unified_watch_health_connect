package com.google.android.exoplayer2;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Clock;
import com.google.android.exoplayer2.util.MediaClock;
import com.google.android.exoplayer2.util.StandaloneMediaClock;

/* JADX INFO: loaded from: classes2.dex */
final class DefaultMediaClock implements MediaClock {
    private final StandaloneMediaClock a;
    private final PlaybackParametersListener b;

    @Nullable
    private Renderer c;

    @Nullable
    private MediaClock d;
    private boolean e = true;
    private boolean f;

    public interface PlaybackParametersListener {
        void onPlaybackParametersChanged(PlaybackParameters newPlaybackParameters);
    }

    public DefaultMediaClock(PlaybackParametersListener listener, Clock clock) {
        this.b = listener;
        this.a = new StandaloneMediaClock(clock);
    }

    private boolean d(boolean isReadingAhead) {
        Renderer renderer = this.c;
        return renderer == null || renderer.isEnded() || (!this.c.isReady() && (isReadingAhead || this.c.hasReadStreamToEnd()));
    }

    private void h(boolean isReadingAhead) {
        if (d(isReadingAhead)) {
            this.e = true;
            if (this.f) {
                this.a.start();
                return;
            }
            return;
        }
        MediaClock mediaClock = (MediaClock) Assertions.checkNotNull(this.d);
        long positionUs = mediaClock.getPositionUs();
        if (this.e) {
            if (positionUs < this.a.getPositionUs()) {
                this.a.stop();
                return;
            } else {
                this.e = false;
                if (this.f) {
                    this.a.start();
                }
            }
        }
        this.a.resetPosition(positionUs);
        PlaybackParameters playbackParameters = mediaClock.getPlaybackParameters();
        if (playbackParameters.equals(this.a.getPlaybackParameters())) {
            return;
        }
        this.a.setPlaybackParameters(playbackParameters);
        this.b.onPlaybackParametersChanged(playbackParameters);
    }

    public void a(Renderer renderer) {
        if (renderer == this.c) {
            this.d = null;
            this.c = null;
            this.e = true;
        }
    }

    public void b(Renderer renderer) throws ExoPlaybackException {
        MediaClock mediaClock;
        MediaClock mediaClock2 = renderer.getMediaClock();
        if (mediaClock2 == null || mediaClock2 == (mediaClock = this.d)) {
            return;
        }
        if (mediaClock != null) {
            throw ExoPlaybackException.createForUnexpected(new IllegalStateException("Multiple renderer media clocks enabled."));
        }
        this.d = mediaClock2;
        this.c = renderer;
        mediaClock2.setPlaybackParameters(this.a.getPlaybackParameters());
    }

    public void c(long positionUs) {
        this.a.resetPosition(positionUs);
    }

    public void e() {
        this.f = true;
        this.a.start();
    }

    public void f() {
        this.f = false;
        this.a.stop();
    }

    public long g(boolean isReadingAhead) {
        h(isReadingAhead);
        return getPositionUs();
    }

    @Override // com.google.android.exoplayer2.util.MediaClock
    public PlaybackParameters getPlaybackParameters() {
        MediaClock mediaClock = this.d;
        return mediaClock != null ? mediaClock.getPlaybackParameters() : this.a.getPlaybackParameters();
    }

    @Override // com.google.android.exoplayer2.util.MediaClock
    public long getPositionUs() {
        return this.e ? this.a.getPositionUs() : ((MediaClock) Assertions.checkNotNull(this.d)).getPositionUs();
    }

    @Override // com.google.android.exoplayer2.util.MediaClock
    public void setPlaybackParameters(PlaybackParameters playbackParameters) {
        MediaClock mediaClock = this.d;
        if (mediaClock != null) {
            mediaClock.setPlaybackParameters(playbackParameters);
            playbackParameters = this.d.getPlaybackParameters();
        }
        this.a.setPlaybackParameters(playbackParameters);
    }
}
