package com.google.android.exoplayer2.source;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.upstream.TransferListener;
import com.google.android.exoplayer2.util.Assertions;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class ClippingMediaSource extends CompositeMediaSource<Void> {
    private final MediaSource j;
    private final long k;
    private final long l;
    private final boolean m;
    private final boolean n;
    private final boolean o;
    private final ArrayList<ClippingMediaPeriod> p;
    private final Timeline.Window q;

    @Nullable
    private a r;

    @Nullable
    private IllegalClippingException s;
    private long t;
    private long u;

    public static final class IllegalClippingException extends IOException {
        public static final int REASON_INVALID_PERIOD_COUNT = 0;
        public static final int REASON_NOT_SEEKABLE_TO_START = 1;
        public static final int REASON_START_EXCEEDS_END = 2;
        public final int reason;

        @Documented
        @Retention(RetentionPolicy.SOURCE)
        public @interface Reason {
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public IllegalClippingException(int reason) {
            String strValueOf = String.valueOf(a(reason));
            super(strValueOf.length() != 0 ? "Illegal clipping: ".concat(strValueOf) : new String("Illegal clipping: "));
            this.reason = reason;
        }

        private static String a(int reason) {
            if (reason == 0) {
                return "invalid period count";
            }
            if (reason != 1) {
                return reason != 2 ? "unknown" : "start exceeds end";
            }
            return "not seekable to start";
        }
    }

    public static final class a extends ForwardingTimeline {
        private final long d;
        private final long e;
        private final long f;
        private final boolean g;

        public a(Timeline timeline, long startUs, long endUs) throws IllegalClippingException {
            super(timeline);
            boolean z = false;
            if (timeline.getPeriodCount() != 1) {
                throw new IllegalClippingException(0);
            }
            Timeline.Window window = timeline.getWindow(0, new Timeline.Window());
            long jMax = Math.max(0L, startUs);
            if (!window.isPlaceholder && jMax != 0 && !window.isSeekable) {
                throw new IllegalClippingException(1);
            }
            long jMax2 = endUs == Long.MIN_VALUE ? window.durationUs : Math.max(0L, endUs);
            long j = window.durationUs;
            if (j != C.TIME_UNSET) {
                jMax2 = jMax2 > j ? j : jMax2;
                if (jMax > jMax2) {
                    throw new IllegalClippingException(2);
                }
            }
            this.d = jMax;
            this.e = jMax2;
            this.f = jMax2 == C.TIME_UNSET ? -9223372036854775807L : jMax2 - jMax;
            if (window.isDynamic && (jMax2 == C.TIME_UNSET || (j != C.TIME_UNSET && jMax2 == j))) {
                z = true;
            }
            this.g = z;
        }

        @Override // com.google.android.exoplayer2.source.ForwardingTimeline, com.google.android.exoplayer2.Timeline
        public Timeline.Period getPeriod(int periodIndex, Timeline.Period period, boolean setIds) {
            this.timeline.getPeriod(0, period, setIds);
            long positionInWindowUs = period.getPositionInWindowUs() - this.d;
            long j = this.f;
            return period.set(period.id, period.uid, 0, j == C.TIME_UNSET ? -9223372036854775807L : j - positionInWindowUs, positionInWindowUs);
        }

        @Override // com.google.android.exoplayer2.source.ForwardingTimeline, com.google.android.exoplayer2.Timeline
        public Timeline.Window getWindow(int windowIndex, Timeline.Window window, long defaultPositionProjectionUs) {
            this.timeline.getWindow(0, window, 0L);
            long j = window.positionInFirstPeriodUs;
            long j2 = this.d;
            window.positionInFirstPeriodUs = j + j2;
            window.durationUs = this.f;
            window.isDynamic = this.g;
            long j3 = window.defaultPositionUs;
            if (j3 != C.TIME_UNSET) {
                long jMax = Math.max(j3, j2);
                window.defaultPositionUs = jMax;
                long j4 = this.e;
                if (j4 != C.TIME_UNSET) {
                    jMax = Math.min(jMax, j4);
                }
                window.defaultPositionUs = jMax;
                window.defaultPositionUs = jMax - this.d;
            }
            long jUsToMs = C.usToMs(this.d);
            long j5 = window.presentationStartTimeMs;
            if (j5 != C.TIME_UNSET) {
                window.presentationStartTimeMs = j5 + jUsToMs;
            }
            long j6 = window.windowStartTimeMs;
            if (j6 != C.TIME_UNSET) {
                window.windowStartTimeMs = j6 + jUsToMs;
            }
            return window;
        }
    }

    public ClippingMediaSource(MediaSource mediaSource, long startPositionUs, long endPositionUs) {
        this(mediaSource, startPositionUs, endPositionUs, true, false, false);
    }

    private void c(Timeline timeline) {
        long j;
        long j2;
        timeline.getWindow(0, this.q);
        long positionInFirstPeriodUs = this.q.getPositionInFirstPeriodUs();
        if (this.r == null || this.p.isEmpty() || this.n) {
            long j3 = this.k;
            long j4 = this.l;
            if (this.o) {
                long defaultPositionUs = this.q.getDefaultPositionUs();
                j3 += defaultPositionUs;
                j4 += defaultPositionUs;
            }
            this.t = positionInFirstPeriodUs + j3;
            this.u = this.l != Long.MIN_VALUE ? positionInFirstPeriodUs + j4 : Long.MIN_VALUE;
            int size = this.p.size();
            for (int i = 0; i < size; i++) {
                this.p.get(i).updateClipping(this.t, this.u);
            }
            j = j3;
            j2 = j4;
        } else {
            long j5 = this.t - positionInFirstPeriodUs;
            j2 = this.l != Long.MIN_VALUE ? this.u - positionInFirstPeriodUs : Long.MIN_VALUE;
            j = j5;
        }
        try {
            a aVar = new a(timeline, j, j2);
            this.r = aVar;
            refreshSourceInfo(aVar);
        } catch (IllegalClippingException e) {
            this.s = e;
        }
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public MediaPeriod createPeriod(MediaSource.MediaPeriodId id, Allocator allocator, long startPositionUs) {
        ClippingMediaPeriod clippingMediaPeriod = new ClippingMediaPeriod(this.j.createPeriod(id, allocator, startPositionUs), this.m, this.t, this.u);
        this.p.add(clippingMediaPeriod);
        return clippingMediaPeriod;
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public MediaItem getMediaItem() {
        return this.j.getMediaItem();
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource, com.google.android.exoplayer2.source.MediaSource
    public void maybeThrowSourceInfoRefreshError() throws IOException {
        IllegalClippingException illegalClippingException = this.s;
        if (illegalClippingException != null) {
            throw illegalClippingException;
        }
        super.maybeThrowSourceInfoRefreshError();
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource, com.google.android.exoplayer2.source.BaseMediaSource
    public void prepareSourceInternal(@Nullable TransferListener mediaTransferListener) {
        super.prepareSourceInternal(mediaTransferListener);
        prepareChildSource(null, this.j);
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public void releasePeriod(MediaPeriod mediaPeriod) {
        Assertions.checkState(this.p.remove(mediaPeriod));
        this.j.releasePeriod(((ClippingMediaPeriod) mediaPeriod).mediaPeriod);
        if (!this.p.isEmpty() || this.n) {
            return;
        }
        c(((a) Assertions.checkNotNull(this.r)).timeline);
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource, com.google.android.exoplayer2.source.BaseMediaSource
    public void releaseSourceInternal() {
        super.releaseSourceInternal();
        this.s = null;
        this.r = null;
    }

    public ClippingMediaSource(MediaSource mediaSource, long durationUs) {
        this(mediaSource, 0L, durationUs, true, false, true);
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource
    /* JADX INFO: renamed from: onChildSourceInfoRefreshed, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void b(Void id, MediaSource mediaSource, Timeline timeline) {
        if (this.s != null) {
            return;
        }
        c(timeline);
    }

    public ClippingMediaSource(MediaSource mediaSource, long startPositionUs, long endPositionUs, boolean enableInitialDiscontinuity, boolean allowDynamicClippingUpdates, boolean relativeToDefaultPosition) {
        Assertions.checkArgument(startPositionUs >= 0);
        this.j = (MediaSource) Assertions.checkNotNull(mediaSource);
        this.k = startPositionUs;
        this.l = endPositionUs;
        this.m = enableInitialDiscontinuity;
        this.n = allowDynamicClippingUpdates;
        this.o = relativeToDefaultPosition;
        this.p = new ArrayList<>();
        this.q = new Timeline.Window();
    }
}
