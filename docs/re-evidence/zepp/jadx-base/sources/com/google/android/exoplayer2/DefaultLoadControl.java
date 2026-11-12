package com.google.android.exoplayer2;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.ExoTrackSelection;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.upstream.DefaultAllocator;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.Util;

/* JADX INFO: loaded from: classes2.dex */
public class DefaultLoadControl implements LoadControl {
    public static final int DEFAULT_AUDIO_BUFFER_SIZE = 13107200;
    public static final int DEFAULT_BACK_BUFFER_DURATION_MS = 0;
    public static final int DEFAULT_BUFFER_FOR_PLAYBACK_AFTER_REBUFFER_MS = 5000;
    public static final int DEFAULT_BUFFER_FOR_PLAYBACK_MS = 2500;
    public static final int DEFAULT_CAMERA_MOTION_BUFFER_SIZE = 131072;
    public static final int DEFAULT_MAX_BUFFER_MS = 50000;
    public static final int DEFAULT_METADATA_BUFFER_SIZE = 131072;
    public static final int DEFAULT_MIN_BUFFER_MS = 50000;
    public static final int DEFAULT_MIN_BUFFER_SIZE = 13107200;
    public static final int DEFAULT_MUXED_BUFFER_SIZE = 144310272;
    public static final boolean DEFAULT_PRIORITIZE_TIME_OVER_SIZE_THRESHOLDS = false;
    public static final boolean DEFAULT_RETAIN_BACK_BUFFER_FROM_KEYFRAME = false;
    public static final int DEFAULT_TARGET_BUFFER_BYTES = -1;
    public static final int DEFAULT_TEXT_BUFFER_SIZE = 131072;
    public static final int DEFAULT_VIDEO_BUFFER_SIZE = 131072000;
    private final DefaultAllocator a;
    private final long b;
    private final long c;
    private final long d;
    private final long e;
    private final int f;
    private final boolean g;
    private final long h;
    private final boolean i;
    private int j;
    private boolean k;

    public static final class Builder {

        @Nullable
        private DefaultAllocator a;
        private int b = 50000;
        private int c = 50000;
        private int d = 2500;
        private int e = 5000;
        private int f = -1;
        private boolean g = false;
        private int h = 0;
        private boolean i = false;
        private boolean j;

        public DefaultLoadControl build() {
            Assertions.checkState(!this.j);
            this.j = true;
            if (this.a == null) {
                this.a = new DefaultAllocator(true, 65536);
            }
            return new DefaultLoadControl(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i);
        }

        @Deprecated
        public DefaultLoadControl createDefaultLoadControl() {
            return build();
        }

        public Builder setAllocator(DefaultAllocator allocator) {
            Assertions.checkState(!this.j);
            this.a = allocator;
            return this;
        }

        public Builder setBackBuffer(int backBufferDurationMs, boolean retainBackBufferFromKeyframe) {
            Assertions.checkState(!this.j);
            DefaultLoadControl.b(backBufferDurationMs, 0, "backBufferDurationMs", "0");
            this.h = backBufferDurationMs;
            this.i = retainBackBufferFromKeyframe;
            return this;
        }

        public Builder setBufferDurationsMs(int minBufferMs, int maxBufferMs, int bufferForPlaybackMs, int bufferForPlaybackAfterRebufferMs) {
            Assertions.checkState(!this.j);
            DefaultLoadControl.b(bufferForPlaybackMs, 0, "bufferForPlaybackMs", "0");
            DefaultLoadControl.b(bufferForPlaybackAfterRebufferMs, 0, "bufferForPlaybackAfterRebufferMs", "0");
            DefaultLoadControl.b(minBufferMs, bufferForPlaybackMs, "minBufferMs", "bufferForPlaybackMs");
            DefaultLoadControl.b(minBufferMs, bufferForPlaybackAfterRebufferMs, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
            DefaultLoadControl.b(maxBufferMs, minBufferMs, "maxBufferMs", "minBufferMs");
            this.b = minBufferMs;
            this.c = maxBufferMs;
            this.d = bufferForPlaybackMs;
            this.e = bufferForPlaybackAfterRebufferMs;
            return this;
        }

        public Builder setPrioritizeTimeOverSizeThresholds(boolean prioritizeTimeOverSizeThresholds) {
            Assertions.checkState(!this.j);
            this.g = prioritizeTimeOverSizeThresholds;
            return this;
        }

        public Builder setTargetBufferBytes(int targetBufferBytes) {
            Assertions.checkState(!this.j);
            this.f = targetBufferBytes;
            return this;
        }
    }

    public DefaultLoadControl() {
        this(new DefaultAllocator(true, 65536), 50000, 50000, 2500, 5000, -1, false, 0, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(int value1, int value2, String name1, String name2) {
        boolean z = value1 >= value2;
        StringBuilder sb = new StringBuilder(String.valueOf(name1).length() + 21 + String.valueOf(name2).length());
        sb.append(name1);
        sb.append(" cannot be less than ");
        sb.append(name2);
        Assertions.checkArgument(z, sb.toString());
    }

    private static int c(int trackType) {
        if (trackType == 0) {
            return DEFAULT_MUXED_BUFFER_SIZE;
        }
        if (trackType == 1) {
            return 13107200;
        }
        if (trackType == 2) {
            return DEFAULT_VIDEO_BUFFER_SIZE;
        }
        if (trackType == 3 || trackType == 5 || trackType == 6) {
            return 131072;
        }
        if (trackType == 7) {
            return 0;
        }
        throw new IllegalArgumentException();
    }

    private void d(boolean resetAllocator) {
        int i = this.f;
        if (i == -1) {
            i = 13107200;
        }
        this.j = i;
        this.k = false;
        if (resetAllocator) {
            this.a.reset();
        }
    }

    public int calculateTargetBufferBytes(Renderer[] renderers, ExoTrackSelection[] trackSelectionArray) {
        int iC = 0;
        for (int i = 0; i < renderers.length; i++) {
            if (trackSelectionArray[i] != null) {
                iC += c(renderers[i].getTrackType());
            }
        }
        return Math.max(13107200, iC);
    }

    @Override // com.google.android.exoplayer2.LoadControl
    public Allocator getAllocator() {
        return this.a;
    }

    @Override // com.google.android.exoplayer2.LoadControl
    public long getBackBufferDurationUs() {
        return this.h;
    }

    @Override // com.google.android.exoplayer2.LoadControl
    public void onPrepared() {
        d(false);
    }

    @Override // com.google.android.exoplayer2.LoadControl
    public void onReleased() {
        d(true);
    }

    @Override // com.google.android.exoplayer2.LoadControl
    public void onStopped() {
        d(true);
    }

    @Override // com.google.android.exoplayer2.LoadControl
    public void onTracksSelected(Renderer[] renderers, TrackGroupArray trackGroups, ExoTrackSelection[] trackSelections) {
        int iCalculateTargetBufferBytes = this.f;
        if (iCalculateTargetBufferBytes == -1) {
            iCalculateTargetBufferBytes = calculateTargetBufferBytes(renderers, trackSelections);
        }
        this.j = iCalculateTargetBufferBytes;
        this.a.setTargetBufferSize(iCalculateTargetBufferBytes);
    }

    @Override // com.google.android.exoplayer2.LoadControl
    public boolean retainBackBufferFromKeyframe() {
        return this.i;
    }

    @Override // com.google.android.exoplayer2.LoadControl
    public boolean shouldContinueLoading(long playbackPositionUs, long bufferedDurationUs, float playbackSpeed) {
        boolean z = true;
        boolean z2 = this.a.getTotalBytesAllocated() >= this.j;
        long jMin = this.b;
        if (playbackSpeed > 1.0f) {
            jMin = Math.min(Util.getMediaDurationForPlayoutDuration(jMin, playbackSpeed), this.c);
        }
        if (bufferedDurationUs < Math.max(jMin, 500000L)) {
            if (!this.g && z2) {
                z = false;
            }
            this.k = z;
            if (!z && bufferedDurationUs < 500000) {
                Log.w("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (bufferedDurationUs >= this.c || z2) {
            this.k = false;
        }
        return this.k;
    }

    @Override // com.google.android.exoplayer2.LoadControl
    public boolean shouldStartPlayback(long bufferedDurationUs, float playbackSpeed, boolean rebuffering, long targetLiveOffsetUs) {
        long playoutDurationForMediaDuration = Util.getPlayoutDurationForMediaDuration(bufferedDurationUs, playbackSpeed);
        long jMin = rebuffering ? this.e : this.d;
        if (targetLiveOffsetUs != C.TIME_UNSET) {
            jMin = Math.min(targetLiveOffsetUs / 2, jMin);
        }
        return jMin <= 0 || playoutDurationForMediaDuration >= jMin || (!this.g && this.a.getTotalBytesAllocated() >= this.j);
    }

    public DefaultLoadControl(DefaultAllocator allocator, int minBufferMs, int maxBufferMs, int bufferForPlaybackMs, int bufferForPlaybackAfterRebufferMs, int targetBufferBytes, boolean prioritizeTimeOverSizeThresholds, int backBufferDurationMs, boolean retainBackBufferFromKeyframe) {
        b(bufferForPlaybackMs, 0, "bufferForPlaybackMs", "0");
        b(bufferForPlaybackAfterRebufferMs, 0, "bufferForPlaybackAfterRebufferMs", "0");
        b(minBufferMs, bufferForPlaybackMs, "minBufferMs", "bufferForPlaybackMs");
        b(minBufferMs, bufferForPlaybackAfterRebufferMs, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        b(maxBufferMs, minBufferMs, "maxBufferMs", "minBufferMs");
        b(backBufferDurationMs, 0, "backBufferDurationMs", "0");
        this.a = allocator;
        this.b = C.msToUs(minBufferMs);
        this.c = C.msToUs(maxBufferMs);
        this.d = C.msToUs(bufferForPlaybackMs);
        this.e = C.msToUs(bufferForPlaybackAfterRebufferMs);
        this.f = targetBufferBytes;
        this.j = targetBufferBytes == -1 ? 13107200 : targetBufferBytes;
        this.g = prioritizeTimeOverSizeThresholds;
        this.h = C.msToUs(backBufferDurationMs);
        this.i = retainBackBufferFromKeyframe;
    }
}
