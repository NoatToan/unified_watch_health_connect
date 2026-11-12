package com.google.android.exoplayer2;

import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.ExoTrackSelection;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.upstream.DefaultAllocator;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.Util;

/* JADX INFO: loaded from: classes13.dex */
public class DefaultLoadControl implements LoadControl {
    public static final int DEFAULT_AUDIO_BUFFER_SIZE = 13107200;
    public static final int DEFAULT_BACK_BUFFER_DURATION_MS = 0;
    public static final int DEFAULT_BUFFER_FOR_PLAYBACK_AFTER_REBUFFER_MS = 5000;
    public static final int DEFAULT_BUFFER_FOR_PLAYBACK_MS = 2500;
    public static final int DEFAULT_CAMERA_MOTION_BUFFER_SIZE = 131072;
    public static final int DEFAULT_IMAGE_BUFFER_SIZE = 131072;
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
    private final DefaultAllocator allocator;
    private final long backBufferDurationUs;
    private final long bufferForPlaybackAfterRebufferUs;
    private final long bufferForPlaybackUs;
    private boolean isLoading;
    private final long maxBufferUs;
    private final long minBufferUs;
    private final boolean prioritizeTimeOverSizeThresholds;
    private final boolean retainBackBufferFromKeyframe;
    private int targetBufferBytes;
    private final int targetBufferBytesOverwrite;

    public static final class Builder {
        private DefaultAllocator allocator;
        private boolean buildCalled;
        private int minBufferMs = 50000;
        private int maxBufferMs = 50000;
        private int bufferForPlaybackMs = DefaultLoadControl.DEFAULT_BUFFER_FOR_PLAYBACK_MS;
        private int bufferForPlaybackAfterRebufferMs = 5000;
        private int targetBufferBytes = -1;
        private boolean prioritizeTimeOverSizeThresholds = false;
        private int backBufferDurationMs = 0;
        private boolean retainBackBufferFromKeyframe = false;

        public DefaultLoadControl build() {
            Assertions.checkState(!this.buildCalled);
            this.buildCalled = true;
            if (this.allocator == null) {
                this.allocator = new DefaultAllocator(true, 65536);
            }
            return new DefaultLoadControl(this.allocator, this.minBufferMs, this.maxBufferMs, this.bufferForPlaybackMs, this.bufferForPlaybackAfterRebufferMs, this.targetBufferBytes, this.prioritizeTimeOverSizeThresholds, this.backBufferDurationMs, this.retainBackBufferFromKeyframe);
        }

        @Deprecated
        public DefaultLoadControl createDefaultLoadControl() {
            return build();
        }

        public Builder setAllocator(DefaultAllocator defaultAllocator) {
            Assertions.checkState(!this.buildCalled);
            this.allocator = defaultAllocator;
            return this;
        }

        public Builder setBackBuffer(int i14, boolean z14) {
            Assertions.checkState(!this.buildCalled);
            DefaultLoadControl.assertGreaterOrEqual(i14, 0, "backBufferDurationMs", "0");
            this.backBufferDurationMs = i14;
            this.retainBackBufferFromKeyframe = z14;
            return this;
        }

        public Builder setBufferDurationsMs(int i14, int i15, int i16, int i17) {
            Assertions.checkState(!this.buildCalled);
            DefaultLoadControl.assertGreaterOrEqual(i16, 0, "bufferForPlaybackMs", "0");
            DefaultLoadControl.assertGreaterOrEqual(i17, 0, "bufferForPlaybackAfterRebufferMs", "0");
            DefaultLoadControl.assertGreaterOrEqual(i14, i16, "minBufferMs", "bufferForPlaybackMs");
            DefaultLoadControl.assertGreaterOrEqual(i14, i17, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
            DefaultLoadControl.assertGreaterOrEqual(i15, i14, "maxBufferMs", "minBufferMs");
            this.minBufferMs = i14;
            this.maxBufferMs = i15;
            this.bufferForPlaybackMs = i16;
            this.bufferForPlaybackAfterRebufferMs = i17;
            return this;
        }

        public Builder setPrioritizeTimeOverSizeThresholds(boolean z14) {
            Assertions.checkState(!this.buildCalled);
            this.prioritizeTimeOverSizeThresholds = z14;
            return this;
        }

        public Builder setTargetBufferBytes(int i14) {
            Assertions.checkState(!this.buildCalled);
            this.targetBufferBytes = i14;
            return this;
        }
    }

    public DefaultLoadControl(DefaultAllocator defaultAllocator, int i14, int i15, int i16, int i17, int i18, boolean z14, int i19, boolean z15) {
        assertGreaterOrEqual(i16, 0, "bufferForPlaybackMs", "0");
        assertGreaterOrEqual(i17, 0, "bufferForPlaybackAfterRebufferMs", "0");
        assertGreaterOrEqual(i14, i16, "minBufferMs", "bufferForPlaybackMs");
        assertGreaterOrEqual(i14, i17, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        assertGreaterOrEqual(i15, i14, "maxBufferMs", "minBufferMs");
        assertGreaterOrEqual(i19, 0, "backBufferDurationMs", "0");
        this.allocator = defaultAllocator;
        this.minBufferUs = Util.msToUs(i14);
        this.maxBufferUs = Util.msToUs(i15);
        this.bufferForPlaybackUs = Util.msToUs(i16);
        this.bufferForPlaybackAfterRebufferUs = Util.msToUs(i17);
        this.targetBufferBytesOverwrite = i18;
        this.targetBufferBytes = i18 == -1 ? 13107200 : i18;
        this.prioritizeTimeOverSizeThresholds = z14;
        this.backBufferDurationUs = Util.msToUs(i19);
        this.retainBackBufferFromKeyframe = z15;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void assertGreaterOrEqual(int i14, int i15, String str, String str2) {
        boolean z14 = i14 >= i15;
        StringBuilder sb3 = new StringBuilder(v.a(v.a(21, str), str2));
        sb3.append(str);
        sb3.append(" cannot be less than ");
        sb3.append(str2);
        Assertions.checkArgument(z14, sb3.toString());
    }

    private static int getDefaultBufferSize(int i14) {
        switch (i14) {
            case -2:
                return 0;
            case -1:
            default:
                vb.h.w();
                return 0;
            case 0:
                return DEFAULT_MUXED_BUFFER_SIZE;
            case 1:
                return 13107200;
            case 2:
                return DEFAULT_VIDEO_BUFFER_SIZE;
            case 3:
            case 4:
            case 5:
            case 6:
                return 131072;
        }
    }

    private void reset(boolean z14) {
        int i14 = this.targetBufferBytesOverwrite;
        if (i14 == -1) {
            i14 = 13107200;
        }
        this.targetBufferBytes = i14;
        this.isLoading = false;
        if (z14) {
            this.allocator.reset();
        }
    }

    public int calculateTargetBufferBytes(Renderer[] rendererArr, ExoTrackSelection[] exoTrackSelectionArr) {
        int defaultBufferSize = 0;
        for (int i14 = 0; i14 < rendererArr.length; i14++) {
            if (exoTrackSelectionArr[i14] != null) {
                defaultBufferSize += getDefaultBufferSize(rendererArr[i14].getTrackType());
            }
        }
        return Math.max(13107200, defaultBufferSize);
    }

    @Override // com.google.android.exoplayer2.LoadControl
    public Allocator getAllocator() {
        return this.allocator;
    }

    @Override // com.google.android.exoplayer2.LoadControl
    public long getBackBufferDurationUs() {
        return this.backBufferDurationUs;
    }

    @Override // com.google.android.exoplayer2.LoadControl
    public void onPrepared() {
        reset(false);
    }

    @Override // com.google.android.exoplayer2.LoadControl
    public void onReleased() {
        reset(true);
    }

    @Override // com.google.android.exoplayer2.LoadControl
    public void onStopped() {
        reset(true);
    }

    @Override // com.google.android.exoplayer2.LoadControl
    public void onTracksSelected(Renderer[] rendererArr, TrackGroupArray trackGroupArray, ExoTrackSelection[] exoTrackSelectionArr) {
        int iCalculateTargetBufferBytes = this.targetBufferBytesOverwrite;
        if (iCalculateTargetBufferBytes == -1) {
            iCalculateTargetBufferBytes = calculateTargetBufferBytes(rendererArr, exoTrackSelectionArr);
        }
        this.targetBufferBytes = iCalculateTargetBufferBytes;
        this.allocator.setTargetBufferSize(iCalculateTargetBufferBytes);
    }

    @Override // com.google.android.exoplayer2.LoadControl
    public boolean retainBackBufferFromKeyframe() {
        return this.retainBackBufferFromKeyframe;
    }

    @Override // com.google.android.exoplayer2.LoadControl
    public boolean shouldContinueLoading(long j8, long j14, float f14) {
        boolean z14 = true;
        boolean z15 = this.allocator.getTotalBytesAllocated() >= this.targetBufferBytes;
        long jMin = this.minBufferUs;
        if (f14 > 1.0f) {
            jMin = Math.min(Util.getMediaDurationForPlayoutDuration(jMin, f14), this.maxBufferUs);
        }
        if (j14 < Math.max(jMin, 500000L)) {
            if (!this.prioritizeTimeOverSizeThresholds && z15) {
                z14 = false;
            }
            this.isLoading = z14;
            if (!z14 && j14 < 500000) {
                Log.w("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j14 >= this.maxBufferUs || z15) {
            this.isLoading = false;
        }
        return this.isLoading;
    }

    @Override // com.google.android.exoplayer2.LoadControl
    public boolean shouldStartPlayback(long j8, float f14, boolean z14, long j14) {
        long playoutDurationForMediaDuration = Util.getPlayoutDurationForMediaDuration(j8, f14);
        long jMin = z14 ? this.bufferForPlaybackAfterRebufferUs : this.bufferForPlaybackUs;
        if (j14 != C.TIME_UNSET) {
            jMin = Math.min(j14 / 2, jMin);
        }
        if (jMin <= 0 || playoutDurationForMediaDuration >= jMin) {
            return true;
        }
        return !this.prioritizeTimeOverSizeThresholds && this.allocator.getTotalBytesAllocated() >= this.targetBufferBytes;
    }

    public DefaultLoadControl() {
        this(new DefaultAllocator(true, 65536), 50000, 50000, DEFAULT_BUFFER_FOR_PLAYBACK_MS, 5000, -1, false, 0, false);
    }
}
