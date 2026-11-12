package androidx.media3.transformer;

import android.util.SparseLongArray;
import androidx.media3.common.C;
import androidx.media3.common.PlaybackParameters;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.MediaClock;

/* JADX INFO: loaded from: classes21.dex */
final class TransformerMediaClock implements MediaClock {
    private long minTrackTimeUs;
    private final SparseLongArray trackTypeToTimeUs = new SparseLongArray();

    @Override // androidx.media3.exoplayer.MediaClock
    public void setPlaybackParameters(PlaybackParameters playbackParameters) {
    }

    public void updateTimeForTrackType(int i, long j) {
        long j2 = this.trackTypeToTimeUs.get(i, C.TIME_UNSET);
        if (j2 == C.TIME_UNSET || j > j2) {
            this.trackTypeToTimeUs.put(i, j);
            if (j2 == C.TIME_UNSET || j2 == this.minTrackTimeUs) {
                this.minTrackTimeUs = Util.minValue(this.trackTypeToTimeUs);
            }
        }
    }

    @Override // androidx.media3.exoplayer.MediaClock
    public long getPositionUs() {
        return this.minTrackTimeUs;
    }

    @Override // androidx.media3.exoplayer.MediaClock
    public PlaybackParameters getPlaybackParameters() {
        return PlaybackParameters.DEFAULT;
    }
}
