package com.google.android.exoplayer2;

import android.os.SystemClock;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import com.google.common.primitives.Longs;

/* JADX INFO: loaded from: classes13.dex */
public final class DefaultLivePlaybackSpeedControl implements LivePlaybackSpeedControl {
    public static final float DEFAULT_FALLBACK_MAX_PLAYBACK_SPEED = 1.03f;
    public static final float DEFAULT_FALLBACK_MIN_PLAYBACK_SPEED = 0.97f;
    public static final long DEFAULT_MAX_LIVE_OFFSET_ERROR_MS_FOR_UNIT_SPEED = 20;
    public static final float DEFAULT_MIN_POSSIBLE_LIVE_OFFSET_SMOOTHING_FACTOR = 0.999f;
    public static final long DEFAULT_MIN_UPDATE_INTERVAL_MS = 1000;
    public static final float DEFAULT_PROPORTIONAL_CONTROL_FACTOR = 0.1f;
    public static final long DEFAULT_TARGET_LIVE_OFFSET_INCREMENT_ON_REBUFFER_MS = 500;
    private float adjustedPlaybackSpeed;
    private long currentTargetLiveOffsetUs;
    private final float fallbackMaxPlaybackSpeed;
    private final float fallbackMinPlaybackSpeed;
    private long idealTargetLiveOffsetUs;
    private long lastPlaybackSpeedUpdateMs;
    private final long maxLiveOffsetErrorUsForUnitSpeed;
    private float maxPlaybackSpeed;
    private long maxTargetLiveOffsetUs;
    private long mediaConfigurationTargetLiveOffsetUs;
    private float minPlaybackSpeed;
    private final float minPossibleLiveOffsetSmoothingFactor;
    private long minTargetLiveOffsetUs;
    private final long minUpdateIntervalMs;
    private final float proportionalControlFactor;
    private long smoothedMinPossibleLiveOffsetDeviationUs;
    private long smoothedMinPossibleLiveOffsetUs;
    private long targetLiveOffsetOverrideUs;
    private final long targetLiveOffsetRebufferDeltaUs;

    public static final class Builder {
        private float fallbackMinPlaybackSpeed = 0.97f;
        private float fallbackMaxPlaybackSpeed = 1.03f;
        private long minUpdateIntervalMs = 1000;
        private float proportionalControlFactorUs = 1.0E-7f;
        private long maxLiveOffsetErrorUsForUnitSpeed = Util.msToUs(20);
        private long targetLiveOffsetIncrementOnRebufferUs = Util.msToUs(500);
        private float minPossibleLiveOffsetSmoothingFactor = 0.999f;

        public DefaultLivePlaybackSpeedControl build() {
            return new DefaultLivePlaybackSpeedControl(this.fallbackMinPlaybackSpeed, this.fallbackMaxPlaybackSpeed, this.minUpdateIntervalMs, this.proportionalControlFactorUs, this.maxLiveOffsetErrorUsForUnitSpeed, this.targetLiveOffsetIncrementOnRebufferUs, this.minPossibleLiveOffsetSmoothingFactor);
        }

        public Builder setFallbackMaxPlaybackSpeed(float f14) {
            Assertions.checkArgument(f14 >= 1.0f);
            this.fallbackMaxPlaybackSpeed = f14;
            return this;
        }

        public Builder setFallbackMinPlaybackSpeed(float f14) {
            Assertions.checkArgument(0.0f < f14 && f14 <= 1.0f);
            this.fallbackMinPlaybackSpeed = f14;
            return this;
        }

        public Builder setMaxLiveOffsetErrorMsForUnitSpeed(long j8) {
            Assertions.checkArgument(j8 > 0);
            this.maxLiveOffsetErrorUsForUnitSpeed = Util.msToUs(j8);
            return this;
        }

        public Builder setMinPossibleLiveOffsetSmoothingFactor(float f14) {
            Assertions.checkArgument(f14 >= 0.0f && f14 < 1.0f);
            this.minPossibleLiveOffsetSmoothingFactor = f14;
            return this;
        }

        public Builder setMinUpdateIntervalMs(long j8) {
            Assertions.checkArgument(j8 > 0);
            this.minUpdateIntervalMs = j8;
            return this;
        }

        public Builder setProportionalControlFactor(float f14) {
            Assertions.checkArgument(f14 > 0.0f);
            this.proportionalControlFactorUs = f14 / 1000000.0f;
            return this;
        }

        public Builder setTargetLiveOffsetIncrementOnRebufferMs(long j8) {
            Assertions.checkArgument(j8 >= 0);
            this.targetLiveOffsetIncrementOnRebufferUs = Util.msToUs(j8);
            return this;
        }
    }

    private DefaultLivePlaybackSpeedControl(float f14, float f15, long j8, float f16, long j14, long j15, float f17) {
        this.fallbackMinPlaybackSpeed = f14;
        this.fallbackMaxPlaybackSpeed = f15;
        this.minUpdateIntervalMs = j8;
        this.proportionalControlFactor = f16;
        this.maxLiveOffsetErrorUsForUnitSpeed = j14;
        this.targetLiveOffsetRebufferDeltaUs = j15;
        this.minPossibleLiveOffsetSmoothingFactor = f17;
        this.mediaConfigurationTargetLiveOffsetUs = C.TIME_UNSET;
        this.targetLiveOffsetOverrideUs = C.TIME_UNSET;
        this.minTargetLiveOffsetUs = C.TIME_UNSET;
        this.maxTargetLiveOffsetUs = C.TIME_UNSET;
        this.minPlaybackSpeed = f14;
        this.maxPlaybackSpeed = f15;
        this.adjustedPlaybackSpeed = 1.0f;
        this.lastPlaybackSpeedUpdateMs = C.TIME_UNSET;
        this.idealTargetLiveOffsetUs = C.TIME_UNSET;
        this.currentTargetLiveOffsetUs = C.TIME_UNSET;
        this.smoothedMinPossibleLiveOffsetUs = C.TIME_UNSET;
        this.smoothedMinPossibleLiveOffsetDeviationUs = C.TIME_UNSET;
    }

    private void adjustTargetLiveOffsetUs(long j8) {
        long j14 = (this.smoothedMinPossibleLiveOffsetDeviationUs * 3) + this.smoothedMinPossibleLiveOffsetUs;
        if (this.currentTargetLiveOffsetUs > j14) {
            float fMsToUs = Util.msToUs(this.minUpdateIntervalMs);
            this.currentTargetLiveOffsetUs = Longs.max(j14, this.idealTargetLiveOffsetUs, this.currentTargetLiveOffsetUs - (((long) ((this.adjustedPlaybackSpeed - 1.0f) * fMsToUs)) + ((long) ((this.maxPlaybackSpeed - 1.0f) * fMsToUs))));
            return;
        }
        long jConstrainValue = Util.constrainValue(j8 - ((long) (Math.max(0.0f, this.adjustedPlaybackSpeed - 1.0f) / this.proportionalControlFactor)), this.currentTargetLiveOffsetUs, j14);
        this.currentTargetLiveOffsetUs = jConstrainValue;
        long j15 = this.maxTargetLiveOffsetUs;
        if (j15 == C.TIME_UNSET || jConstrainValue <= j15) {
            return;
        }
        this.currentTargetLiveOffsetUs = j15;
    }

    private void maybeResetTargetLiveOffsetUs() {
        long j8 = this.mediaConfigurationTargetLiveOffsetUs;
        if (j8 != C.TIME_UNSET) {
            long j14 = this.targetLiveOffsetOverrideUs;
            if (j14 != C.TIME_UNSET) {
                j8 = j14;
            }
            long j15 = this.minTargetLiveOffsetUs;
            if (j15 != C.TIME_UNSET && j8 < j15) {
                j8 = j15;
            }
            long j16 = this.maxTargetLiveOffsetUs;
            if (j16 != C.TIME_UNSET && j8 > j16) {
                j8 = j16;
            }
        } else {
            j8 = -9223372036854775807L;
        }
        if (this.idealTargetLiveOffsetUs == j8) {
            return;
        }
        this.idealTargetLiveOffsetUs = j8;
        this.currentTargetLiveOffsetUs = j8;
        this.smoothedMinPossibleLiveOffsetUs = C.TIME_UNSET;
        this.smoothedMinPossibleLiveOffsetDeviationUs = C.TIME_UNSET;
        this.lastPlaybackSpeedUpdateMs = C.TIME_UNSET;
    }

    private static long smooth(long j8, long j14, float f14) {
        return (long) (((1.0f - f14) * j14) + (j8 * f14));
    }

    private void updateSmoothedMinPossibleLiveOffsetUs(long j8, long j14) {
        long j15 = j8 - j14;
        long j16 = this.smoothedMinPossibleLiveOffsetUs;
        if (j16 == C.TIME_UNSET) {
            this.smoothedMinPossibleLiveOffsetUs = j15;
            this.smoothedMinPossibleLiveOffsetDeviationUs = 0L;
        } else {
            long jMax = Math.max(j15, smooth(j16, j15, this.minPossibleLiveOffsetSmoothingFactor));
            this.smoothedMinPossibleLiveOffsetUs = jMax;
            this.smoothedMinPossibleLiveOffsetDeviationUs = smooth(this.smoothedMinPossibleLiveOffsetDeviationUs, Math.abs(j15 - jMax), this.minPossibleLiveOffsetSmoothingFactor);
        }
    }

    @Override // com.google.android.exoplayer2.LivePlaybackSpeedControl
    public float getAdjustedPlaybackSpeed(long j8, long j14) {
        if (this.mediaConfigurationTargetLiveOffsetUs == C.TIME_UNSET) {
            return 1.0f;
        }
        updateSmoothedMinPossibleLiveOffsetUs(j8, j14);
        if (this.lastPlaybackSpeedUpdateMs != C.TIME_UNSET && SystemClock.elapsedRealtime() - this.lastPlaybackSpeedUpdateMs < this.minUpdateIntervalMs) {
            return this.adjustedPlaybackSpeed;
        }
        this.lastPlaybackSpeedUpdateMs = SystemClock.elapsedRealtime();
        adjustTargetLiveOffsetUs(j8);
        long j15 = j8 - this.currentTargetLiveOffsetUs;
        if (Math.abs(j15) < this.maxLiveOffsetErrorUsForUnitSpeed) {
            this.adjustedPlaybackSpeed = 1.0f;
        } else {
            this.adjustedPlaybackSpeed = Util.constrainValue((this.proportionalControlFactor * j15) + 1.0f, this.minPlaybackSpeed, this.maxPlaybackSpeed);
        }
        return this.adjustedPlaybackSpeed;
    }

    @Override // com.google.android.exoplayer2.LivePlaybackSpeedControl
    public long getTargetLiveOffsetUs() {
        return this.currentTargetLiveOffsetUs;
    }

    @Override // com.google.android.exoplayer2.LivePlaybackSpeedControl
    public void notifyRebuffer() {
        long j8 = this.currentTargetLiveOffsetUs;
        if (j8 == C.TIME_UNSET) {
            return;
        }
        long j14 = j8 + this.targetLiveOffsetRebufferDeltaUs;
        this.currentTargetLiveOffsetUs = j14;
        long j15 = this.maxTargetLiveOffsetUs;
        if (j15 != C.TIME_UNSET && j14 > j15) {
            this.currentTargetLiveOffsetUs = j15;
        }
        this.lastPlaybackSpeedUpdateMs = C.TIME_UNSET;
    }

    @Override // com.google.android.exoplayer2.LivePlaybackSpeedControl
    public void setLiveConfiguration(MediaItem.LiveConfiguration liveConfiguration) {
        this.mediaConfigurationTargetLiveOffsetUs = Util.msToUs(liveConfiguration.targetOffsetMs);
        this.minTargetLiveOffsetUs = Util.msToUs(liveConfiguration.minOffsetMs);
        this.maxTargetLiveOffsetUs = Util.msToUs(liveConfiguration.maxOffsetMs);
        float f14 = liveConfiguration.minPlaybackSpeed;
        if (f14 == -3.4028235E38f) {
            f14 = this.fallbackMinPlaybackSpeed;
        }
        this.minPlaybackSpeed = f14;
        float f15 = liveConfiguration.maxPlaybackSpeed;
        if (f15 == -3.4028235E38f) {
            f15 = this.fallbackMaxPlaybackSpeed;
        }
        this.maxPlaybackSpeed = f15;
        if (f14 == 1.0f && f15 == 1.0f) {
            this.mediaConfigurationTargetLiveOffsetUs = C.TIME_UNSET;
        }
        maybeResetTargetLiveOffsetUs();
    }

    @Override // com.google.android.exoplayer2.LivePlaybackSpeedControl
    public void setTargetLiveOffsetOverrideUs(long j8) {
        this.targetLiveOffsetOverrideUs = j8;
        maybeResetTargetLiveOffsetUs();
    }
}
