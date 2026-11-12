package com.google.android.exoplayer2.trackselection;

import android.os.SystemClock;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.chunk.Chunk;
import com.google.android.exoplayer2.source.chunk.MediaChunk;
import com.google.android.exoplayer2.trackselection.BaseTrackSelection;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class BaseTrackSelection implements ExoTrackSelection {
    private final int a;
    private final Format[] b;
    private final long[] c;
    private int d;
    public final TrackGroup group;
    public final int length;
    public final int[] tracks;

    public BaseTrackSelection(TrackGroup group, int... tracks) {
        this(group, tracks, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int b(Format format, Format format2) {
        return format2.bitrate - format.bitrate;
    }

    @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
    public boolean blacklist(int index, long exclusionDurationMs) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean zIsBlacklisted = isBlacklisted(index, jElapsedRealtime);
        int i = 0;
        while (i < this.length && !zIsBlacklisted) {
            zIsBlacklisted = (i == index || isBlacklisted(i, jElapsedRealtime)) ? false : true;
            i++;
        }
        if (!zIsBlacklisted) {
            return false;
        }
        long[] jArr = this.c;
        jArr[index] = Math.max(jArr[index], Util.addWithOverflowDefault(jElapsedRealtime, exclusionDurationMs, Long.MAX_VALUE));
        return true;
    }

    @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
    public void disable() {
    }

    @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
    public void enable() {
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BaseTrackSelection baseTrackSelection = (BaseTrackSelection) obj;
        return this.group == baseTrackSelection.group && Arrays.equals(this.tracks, baseTrackSelection.tracks);
    }

    @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
    public int evaluateQueueSize(long playbackPositionUs, List<? extends MediaChunk> queue) {
        return queue.size();
    }

    @Override // com.google.android.exoplayer2.trackselection.TrackSelection
    public final Format getFormat(int index) {
        return this.b[index];
    }

    @Override // com.google.android.exoplayer2.trackselection.TrackSelection
    public final int getIndexInTrackGroup(int index) {
        return this.tracks[index];
    }

    @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
    public final Format getSelectedFormat() {
        return this.b[getSelectedIndex()];
    }

    @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
    public final int getSelectedIndexInTrackGroup() {
        return this.tracks[getSelectedIndex()];
    }

    @Override // com.google.android.exoplayer2.trackselection.TrackSelection
    public final TrackGroup getTrackGroup() {
        return this.group;
    }

    @Override // com.google.android.exoplayer2.trackselection.TrackSelection
    public final int getType() {
        return this.a;
    }

    public int hashCode() {
        if (this.d == 0) {
            this.d = (System.identityHashCode(this.group) * 31) + Arrays.hashCode(this.tracks);
        }
        return this.d;
    }

    @Override // com.google.android.exoplayer2.trackselection.TrackSelection
    public final int indexOf(Format format) {
        for (int i = 0; i < this.length; i++) {
            if (this.b[i] == format) {
                return i;
            }
        }
        return -1;
    }

    @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
    public boolean isBlacklisted(int index, long nowMs) {
        return this.c[index] > nowMs;
    }

    @Override // com.google.android.exoplayer2.trackselection.TrackSelection
    public final int length() {
        return this.tracks.length;
    }

    @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
    public /* synthetic */ void onDiscontinuity() {
        a.a(this);
    }

    @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
    public /* synthetic */ void onPlayWhenReadyChanged(boolean z) {
        a.b(this, z);
    }

    @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
    public void onPlaybackSpeed(float playbackSpeed) {
    }

    @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
    public /* synthetic */ void onRebuffer() {
        a.c(this);
    }

    @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
    public /* synthetic */ boolean shouldCancelChunkLoad(long j, Chunk chunk, List list) {
        return a.d(this, j, chunk, list);
    }

    public BaseTrackSelection(TrackGroup group, int[] tracks, int type) {
        int i = 0;
        Assertions.checkState(tracks.length > 0);
        this.a = type;
        this.group = (TrackGroup) Assertions.checkNotNull(group);
        int length = tracks.length;
        this.length = length;
        this.b = new Format[length];
        for (int i2 = 0; i2 < tracks.length; i2++) {
            this.b[i2] = group.getFormat(tracks[i2]);
        }
        Arrays.sort(this.b, new Comparator() { // from class: rr
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return BaseTrackSelection.b((Format) obj, (Format) obj2);
            }
        });
        this.tracks = new int[this.length];
        while (true) {
            int i3 = this.length;
            if (i >= i3) {
                this.c = new long[i3];
                return;
            } else {
                this.tracks[i] = group.indexOf(this.b[i]);
                i++;
            }
        }
    }

    @Override // com.google.android.exoplayer2.trackselection.TrackSelection
    public final int indexOf(int indexInTrackGroup) {
        for (int i = 0; i < this.length; i++) {
            if (this.tracks[i] == indexInTrackGroup) {
                return i;
            }
        }
        return -1;
    }
}
