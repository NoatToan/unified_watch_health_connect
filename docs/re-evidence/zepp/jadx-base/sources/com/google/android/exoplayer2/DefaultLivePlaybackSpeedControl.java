package com.google.android.exoplayer2;

import android.os.SystemClock;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import com.google.common.primitives.Longs;

/* JADX INFO: loaded from: classes2.dex */
public final class DefaultLivePlaybackSpeedControl implements LivePlaybackSpeedControl {
    public static final float DEFAULT_FALLBACK_MAX_PLAYBACK_SPEED = 1.03f;
    public static final float DEFAULT_FALLBACK_MIN_PLAYBACK_SPEED = 0.97f;
    public static final long DEFAULT_MAX_LIVE_OFFSET_ERROR_MS_FOR_UNIT_SPEED = 20;
    public static final float DEFAULT_MIN_POSSIBLE_LIVE_OFFSET_SMOOTHING_FACTOR = 0.999f;
    public static final long DEFAULT_MIN_UPDATE_INTERVAL_MS = 1000;
    public static final float DEFAULT_PROPORTIONAL_CONTROL_FACTOR = 0.1f;
    public static final long DEFAULT_TARGET_LIVE_OFFSET_INCREMENT_ON_REBUFFER_MS = 500;
    private final float a;
    private final float b;
    private final long c;
    private final float d;
    private final long e;
    private final long f;
    private final float g;
    private long h;
    private long i;
    private long j;
    private long k;
    private long l;
    private long m;
    private float n;
    private float o;
    private float p;
    private long q;
    private long r;
    private long s;

    public static final class Builder {
        private float a = 0.97f;
        private float b = 1.03f;
        private long c = 1000;
        private float d = 1.0E-7f;
        private long e = C.msToUs(20);
        private long f = C.msToUs(500);
        private float g = 0.999f;

        public DefaultLivePlaybackSpeedControl build() {
            return new DefaultLivePlaybackSpeedControl(this.a, this.b, this.c, this.d, this.e, this.f, this.g);
        }

        public Builder setFallbackMaxPlaybackSpeed(float fallbackMaxPlaybackSpeed) {
            Assertions.checkArgument(fallbackMaxPlaybackSpeed >= 1.0f);
            this.b = fallbackMaxPlaybackSpeed;
            return this;
        }

        public Builder setFallbackMinPlaybackSpeed(float fallbackMinPlaybackSpeed) {
            Assertions.checkArgument(0.0f < fallbackMinPlaybackSpeed && fallbackMinPlaybackSpeed <= 1.0f);
            this.a = fallbackMinPlaybackSpeed;
            return this;
        }

        public Builder setMaxLiveOffsetErrorMsForUnitSpeed(long maxLiveOffsetErrorMsForUnitSpeed) {
            Assertions.checkArgument(maxLiveOffsetErrorMsForUnitSpeed > 0);
            this.e = C.msToUs(maxLiveOffsetErrorMsForUnitSpeed);
            return this;
        }

        public Builder setMinPossibleLiveOffsetSmoothingFactor(float minPossibleLiveOffsetSmoothingFactor) {
            Assertions.checkArgument(minPossibleLiveOffsetSmoothingFactor >= 0.0f && minPossibleLiveOffsetSmoothingFactor < 1.0f);
            this.g = minPossibleLiveOffsetSmoothingFactor;
            return this;
        }

        public Builder setMinUpdateIntervalMs(long minUpdateIntervalMs) {
            Assertions.checkArgument(minUpdateIntervalMs > 0);
            this.c = minUpdateIntervalMs;
            return this;
        }

        public Builder setProportionalControlFactor(float proportionalControlFactor) {
            Assertions.checkArgument(proportionalControlFactor > 0.0f);
            this.d = proportionalControlFactor / 1000000.0f;
            return this;
        }

        public Builder setTargetLiveOffsetIncrementOnRebufferMs(long targetLiveOffsetIncrementOnRebufferMs) {
            Assertions.checkArgument(targetLiveOffsetIncrementOnRebufferMs >= 0);
            this.f = C.msToUs(targetLiveOffsetIncrementOnRebufferMs);
            return this;
        }
    }

    private void a(long liveOffsetUs) {
        long j = this.r + (this.s * 3);
        if (this.m > j) {
            float fMsToUs = C.msToUs(this.c);
            this.m = Longs.max(j, this.j, this.m - (((long) ((this.p - 1.0f) * fMsToUs)) + ((long) ((this.n - 1.0f) * fMsToUs))));
            return;
        }
        long jConstrainValue = Util.constrainValue(liveOffsetUs - ((long) (Math.max(0.0f, this.p - 1.0f) / this.d)), this.m, j);
        this.m = jConstrainValue;
        long j2 = this.l;
        if (j2 == C.TIME_UNSET || jConstrainValue <= j2) {
            return;
        }
        this.m = j2;
    }

    private void b() {
        long j = this.h;
        if (j != C.TIME_UNSET) {
            long j2 = this.i;
            if (j2 != C.TIME_UNSET) {
                j = j2;
            }
            long j3 = this.k;
            if (j3 != C.TIME_UNSET && j < j3) {
                j = j3;
            }
            long j4 = this.l;
            if (j4 != C.TIME_UNSET && j > j4) {
                j = j4;
            }
        } else {
            j = -9223372036854775807L;
        }
        if (this.j == j) {
            return;
        }
        this.j = j;
        this.m = j;
        this.r = C.TIME_UNSET;
        this.s = C.TIME_UNSET;
        this.q = C.TIME_UNSET;
    }

    private static long c(long smoothedValue, long newValue, float smoothingFactor) {
        return (long) ((smoothedValue * smoothingFactor) + ((1.0f - smoothingFactor) * newValue));
    }

    private void d(long liveOffsetUs, long bufferedDurationUs) {
        long j = liveOffsetUs - bufferedDurationUs;
        long j2 = this.r;
        if (j2 == C.TIME_UNSET) {
            this.r = j;
            this.s = 0L;
        } else {
            long jMax = Math.max(j, c(j2, j, this.g));
            this.r = jMax;
            this.s = c(this.s, Math.abs(j - jMax), this.g);
        }
    }

    @Override // com.google.android.exoplayer2.LivePlaybackSpeedControl
    public float getAdjustedPlaybackSpeed(long liveOffsetUs, long bufferedDurationUs) {
        if (this.h == C.TIME_UNSET) {
            return 1.0f;
        }
        d(liveOffsetUs, bufferedDurationUs);
        if (this.q != C.TIME_UNSET && SystemClock.elapsedRealtime() - this.q < this.c) {
            return this.p;
        }
        this.q = SystemClock.elapsedRealtime();
        a(liveOffsetUs);
        long j = liveOffsetUs - this.m;
        if (Math.abs(j) < this.e) {
            this.p = 1.0f;
        } else {
            this.p = Util.constrainValue((this.d * j) + 1.0f, this.o, this.n);
        }
        return this.p;
    }

    @Override // com.google.android.exoplayer2.LivePlaybackSpeedControl
    public long getTargetLiveOffsetUs() {
        return this.m;
    }

    @Override // com.google.android.exoplayer2.LivePlaybackSpeedControl
    public void notifyRebuffer() {
        long j = this.m;
        if (j == C.TIME_UNSET) {
            return;
        }
        long j2 = j + this.f;
        this.m = j2;
        long j3 = this.l;
        if (j3 != C.TIME_UNSET && j2 > j3) {
            this.m = j3;
        }
        this.q = C.TIME_UNSET;
    }

    @Override // com.google.android.exoplayer2.LivePlaybackSpeedControl
    public void setLiveConfiguration(MediaItem.LiveConfiguration liveConfiguration) {
        this.h = C.msToUs(liveConfiguration.targetOffsetMs);
        this.k = C.msToUs(liveConfiguration.minOffsetMs);
        this.l = C.msToUs(liveConfiguration.maxOffsetMs);
        float f = liveConfiguration.minPlaybackSpeed;
        if (f == -3.4028235E38f) {
            f = this.a;
        }
        this.o = f;
        float f2 = liveConfiguration.maxPlaybackSpeed;
        if (f2 == -3.4028235E38f) {
            f2 = this.b;
        }
        this.n = f2;
        b();
    }

    @Override // com.google.android.exoplayer2.LivePlaybackSpeedControl
    public void setTargetLiveOffsetOverrideUs(long liveOffsetUs) {
        this.i = liveOffsetUs;
        b();
    }

    private DefaultLivePlaybackSpeedControl(float fallbackMinPlaybackSpeed, float fallbackMaxPlaybackSpeed, long minUpdateIntervalMs, float proportionalControlFactor, long maxLiveOffsetErrorUsForUnitSpeed, long targetLiveOffsetRebufferDeltaUs, float minPossibleLiveOffsetSmoothingFactor) {
        this.a = fallbackMinPlaybackSpeed;
        this.b = fallbackMaxPlaybackSpeed;
        this.c = minUpdateIntervalMs;
        this.d = proportionalControlFactor;
        this.e = maxLiveOffsetErrorUsForUnitSpeed;
        this.f = targetLiveOffsetRebufferDeltaUs;
        this.g = minPossibleLiveOffsetSmoothingFactor;
        this.h = C.TIME_UNSET;
        this.i = C.TIME_UNSET;
        this.k = C.TIME_UNSET;
        this.l = C.TIME_UNSET;
        this.o = fallbackMinPlaybackSpeed;
        this.n = fallbackMaxPlaybackSpeed;
        this.p = 1.0f;
        this.q = C.TIME_UNSET;
        this.j = C.TIME_UNSET;
        this.m = C.TIME_UNSET;
        this.r = C.TIME_UNSET;
        this.s = C.TIME_UNSET;
    }
}
