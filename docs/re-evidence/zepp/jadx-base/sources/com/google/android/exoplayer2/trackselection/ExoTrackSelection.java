package com.google.android.exoplayer2.trackselection;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.chunk.Chunk;
import com.google.android.exoplayer2.source.chunk.MediaChunk;
import com.google.android.exoplayer2.source.chunk.MediaChunkIterator;
import com.google.android.exoplayer2.upstream.BandwidthMeter;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public interface ExoTrackSelection extends TrackSelection {

    public static final class Definition {
        public final TrackGroup group;
        public final int[] tracks;
        public final int type;

        public Definition(TrackGroup group, int... tracks) {
            this(group, tracks, 0);
        }

        public Definition(TrackGroup group, int[] tracks, int type) {
            this.group = group;
            this.tracks = tracks;
            this.type = type;
        }
    }

    public interface Factory {
        ExoTrackSelection[] createTrackSelections(Definition[] definitions, BandwidthMeter bandwidthMeter, MediaSource.MediaPeriodId mediaPeriodId, Timeline timeline);
    }

    boolean blacklist(int index, long exclusionDurationMs);

    void disable();

    void enable();

    int evaluateQueueSize(long playbackPositionUs, List<? extends MediaChunk> queue);

    Format getSelectedFormat();

    int getSelectedIndex();

    int getSelectedIndexInTrackGroup();

    @Nullable
    Object getSelectionData();

    int getSelectionReason();

    boolean isBlacklisted(int index, long nowMs);

    void onDiscontinuity();

    void onPlayWhenReadyChanged(boolean playWhenReady);

    void onPlaybackSpeed(float playbackSpeed);

    void onRebuffer();

    boolean shouldCancelChunkLoad(long playbackPositionUs, Chunk loadingChunk, List<? extends MediaChunk> queue);

    void updateSelectedTrack(long playbackPositionUs, long bufferedDurationUs, long availableDurationUs, List<? extends MediaChunk> queue, MediaChunkIterator[] mediaChunkIterators);
}
