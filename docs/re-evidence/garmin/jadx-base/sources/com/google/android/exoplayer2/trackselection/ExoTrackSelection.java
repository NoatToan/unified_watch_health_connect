package com.google.android.exoplayer2.trackselection;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.chunk.Chunk;
import com.google.android.exoplayer2.source.chunk.MediaChunk;
import com.google.android.exoplayer2.source.chunk.MediaChunkIterator;
import com.google.android.exoplayer2.upstream.BandwidthMeter;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public interface ExoTrackSelection extends TrackSelection {

    public interface Factory {
        ExoTrackSelection[] createTrackSelections(Definition[] definitionArr, BandwidthMeter bandwidthMeter, MediaSource.MediaPeriodId mediaPeriodId, Timeline timeline);
    }

    boolean blacklist(int i14, long j8);

    void disable();

    void enable();

    int evaluateQueueSize(long j8, List<? extends MediaChunk> list);

    Format getSelectedFormat();

    int getSelectedIndex();

    int getSelectedIndexInTrackGroup();

    Object getSelectionData();

    int getSelectionReason();

    boolean isBlacklisted(int i14, long j8);

    default void onDiscontinuity() {
    }

    default void onPlayWhenReadyChanged(boolean z14) {
    }

    void onPlaybackSpeed(float f14);

    default void onRebuffer() {
    }

    default boolean shouldCancelChunkLoad(long j8, Chunk chunk, List<? extends MediaChunk> list) {
        return false;
    }

    void updateSelectedTrack(long j8, long j14, long j15, List<? extends MediaChunk> list, MediaChunkIterator[] mediaChunkIteratorArr);

    public static final class Definition {
        public final TrackGroup group;
        public final int[] tracks;
        public final int type;

        public Definition(TrackGroup trackGroup, int[] iArr, int i14) {
            this.group = trackGroup;
            this.tracks = iArr;
            this.type = i14;
        }

        public Definition(TrackGroup trackGroup, int... iArr) {
            this(trackGroup, iArr, 0);
        }
    }
}
