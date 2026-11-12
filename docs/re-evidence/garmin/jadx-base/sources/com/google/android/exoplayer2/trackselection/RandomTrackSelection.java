package com.google.android.exoplayer2.trackselection;

import android.os.SystemClock;
import bd0.e;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.chunk.MediaChunk;
import com.google.android.exoplayer2.source.chunk.MediaChunkIterator;
import com.google.android.exoplayer2.upstream.BandwidthMeter;
import java.util.List;
import java.util.Random;

/* JADX INFO: loaded from: classes14.dex */
public final class RandomTrackSelection extends BaseTrackSelection {
    private final Random random;
    private int selectedIndex;

    public RandomTrackSelection(TrackGroup trackGroup, int[] iArr, int i14, Random random) {
        super(trackGroup, iArr, i14);
        this.random = random;
        this.selectedIndex = random.nextInt(this.length);
    }

    @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
    public int getSelectedIndex() {
        return this.selectedIndex;
    }

    @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
    public Object getSelectionData() {
        return null;
    }

    @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
    public int getSelectionReason() {
        return 3;
    }

    @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
    public void updateSelectedTrack(long j8, long j14, long j15, List<? extends MediaChunk> list, MediaChunkIterator[] mediaChunkIteratorArr) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        int i14 = 0;
        for (int i15 = 0; i15 < this.length; i15++) {
            if (!isBlacklisted(i15, jElapsedRealtime)) {
                i14++;
            }
        }
        this.selectedIndex = this.random.nextInt(i14);
        if (i14 != this.length) {
            int i16 = 0;
            for (int i17 = 0; i17 < this.length; i17++) {
                if (!isBlacklisted(i17, jElapsedRealtime)) {
                    int i18 = i16 + 1;
                    if (this.selectedIndex == i16) {
                        this.selectedIndex = i17;
                        return;
                    }
                    i16 = i18;
                }
            }
        }
    }

    public static final class Factory implements ExoTrackSelection.Factory {
        private final Random random;

        public Factory(int i14) {
            this.random = new Random(i14);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ ExoTrackSelection lambda$createTrackSelections$0(ExoTrackSelection.Definition definition) {
            return new RandomTrackSelection(definition.group, definition.tracks, definition.type, this.random);
        }

        @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection.Factory
        public ExoTrackSelection[] createTrackSelections(ExoTrackSelection.Definition[] definitionArr, BandwidthMeter bandwidthMeter, MediaSource.MediaPeriodId mediaPeriodId, Timeline timeline) {
            return TrackSelectionUtil.createTrackSelectionsForDefinitions(definitionArr, new e(this, 22));
        }

        public Factory() {
            this.random = new Random();
        }
    }
}
