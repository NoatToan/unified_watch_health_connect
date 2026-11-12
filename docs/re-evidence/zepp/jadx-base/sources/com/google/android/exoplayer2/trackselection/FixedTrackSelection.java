package com.google.android.exoplayer2.trackselection;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.chunk.MediaChunk;
import com.google.android.exoplayer2.source.chunk.MediaChunkIterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class FixedTrackSelection extends BaseTrackSelection {
    private final int e;

    @Nullable
    private final Object f;

    public FixedTrackSelection(TrackGroup group, int track) {
        this(group, track, 0);
    }

    @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
    public int getSelectedIndex() {
        return 0;
    }

    @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
    @Nullable
    public Object getSelectionData() {
        return this.f;
    }

    @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
    public int getSelectionReason() {
        return this.e;
    }

    @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
    public void updateSelectedTrack(long playbackPositionUs, long bufferedDurationUs, long availableDurationUs, List<? extends MediaChunk> queue, MediaChunkIterator[] mediaChunkIterators) {
    }

    public FixedTrackSelection(TrackGroup group, int track, int type) {
        this(group, track, type, 0, null);
    }

    public FixedTrackSelection(TrackGroup group, int track, int type, int reason, @Nullable Object data) {
        super(group, new int[]{track}, type);
        this.e = reason;
        this.f = data;
    }
}
