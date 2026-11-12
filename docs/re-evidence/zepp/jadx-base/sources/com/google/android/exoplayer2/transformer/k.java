package com.google.android.exoplayer2.transformer;

import android.util.SparseLongArray;
import androidx.annotation.RequiresApi;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.PlaybackParameters;
import com.google.android.exoplayer2.util.MediaClock;
import com.google.android.exoplayer2.util.Util;

/* JADX INFO: loaded from: classes3.dex */
@RequiresApi(18)
final class k implements MediaClock {
    private final SparseLongArray a = new SparseLongArray();
    private long b;

    public void a(int trackType, long timeUs) {
        long j = this.a.get(trackType, C.TIME_UNSET);
        if (j == C.TIME_UNSET || timeUs > j) {
            this.a.put(trackType, timeUs);
            if (j == C.TIME_UNSET || j == this.b) {
                this.b = Util.minValue(this.a);
            }
        }
    }

    @Override // com.google.android.exoplayer2.util.MediaClock
    public PlaybackParameters getPlaybackParameters() {
        return PlaybackParameters.DEFAULT;
    }

    @Override // com.google.android.exoplayer2.util.MediaClock
    public long getPositionUs() {
        return this.b;
    }

    @Override // com.google.android.exoplayer2.util.MediaClock
    public void setPlaybackParameters(PlaybackParameters playbackParameters) {
    }
}
