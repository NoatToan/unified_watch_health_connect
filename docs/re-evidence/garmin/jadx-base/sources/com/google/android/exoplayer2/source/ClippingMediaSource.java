package com.google.android.exoplayer2.source;

import com.garmin.android.apps.connectmobile.activities.model.PrivacyUpdateRequestError;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.upstream.TransferListener;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes14.dex */
public final class ClippingMediaSource extends CompositeMediaSource<Void> {
    private final boolean allowDynamicClippingUpdates;
    private IllegalClippingException clippingError;
    private ClippingTimeline clippingTimeline;
    private final boolean enableInitialDiscontinuity;
    private final long endUs;
    private final ArrayList<ClippingMediaPeriod> mediaPeriods;
    private final MediaSource mediaSource;
    private long periodEndUs;
    private long periodStartUs;
    private final boolean relativeToDefaultPosition;
    private final long startUs;
    private final Timeline.Window window;

    public static final class ClippingTimeline extends ForwardingTimeline {
        private final long durationUs;
        private final long endUs;
        private final boolean isDynamic;
        private final long startUs;

        public ClippingTimeline(Timeline timeline, long j8, long j14) throws IllegalClippingException {
            super(timeline);
            boolean z14 = false;
            if (timeline.getPeriodCount() != 1) {
                throw new IllegalClippingException(0);
            }
            Timeline.Window window = timeline.getWindow(0, new Timeline.Window());
            long jMax = Math.max(0L, j8);
            if (!window.isPlaceholder && jMax != 0 && !window.isSeekable) {
                throw new IllegalClippingException(1);
            }
            long jMax2 = j14 == Long.MIN_VALUE ? window.durationUs : Math.max(0L, j14);
            long j15 = window.durationUs;
            if (j15 != C.TIME_UNSET) {
                jMax2 = jMax2 > j15 ? j15 : jMax2;
                if (jMax > jMax2) {
                    throw new IllegalClippingException(2);
                }
            }
            this.startUs = jMax;
            this.endUs = jMax2;
            this.durationUs = jMax2 == C.TIME_UNSET ? -9223372036854775807L : jMax2 - jMax;
            if (window.isDynamic && (jMax2 == C.TIME_UNSET || (j15 != C.TIME_UNSET && jMax2 == j15))) {
                z14 = true;
            }
            this.isDynamic = z14;
        }

        @Override // com.google.android.exoplayer2.source.ForwardingTimeline, com.google.android.exoplayer2.Timeline
        public Timeline.Period getPeriod(int i14, Timeline.Period period, boolean z14) {
            this.timeline.getPeriod(0, period, z14);
            long positionInWindowUs = period.getPositionInWindowUs() - this.startUs;
            long j8 = this.durationUs;
            long j14 = C.TIME_UNSET;
            if (j8 != C.TIME_UNSET) {
                j14 = j8 - positionInWindowUs;
            }
            return period.set(period.f52879id, period.uid, 0, j14, positionInWindowUs);
        }

        @Override // com.google.android.exoplayer2.source.ForwardingTimeline, com.google.android.exoplayer2.Timeline
        public Timeline.Window getWindow(int i14, Timeline.Window window, long j8) {
            this.timeline.getWindow(0, window, 0L);
            long j14 = window.positionInFirstPeriodUs;
            long j15 = this.startUs;
            window.positionInFirstPeriodUs = j14 + j15;
            window.durationUs = this.durationUs;
            window.isDynamic = this.isDynamic;
            long j16 = window.defaultPositionUs;
            if (j16 != C.TIME_UNSET) {
                long jMax = Math.max(j16, j15);
                window.defaultPositionUs = jMax;
                long j17 = this.endUs;
                if (j17 != C.TIME_UNSET) {
                    jMax = Math.min(jMax, j17);
                }
                window.defaultPositionUs = jMax - this.startUs;
            }
            long jUsToMs = Util.usToMs(this.startUs);
            long j18 = window.presentationStartTimeMs;
            if (j18 != C.TIME_UNSET) {
                window.presentationStartTimeMs = j18 + jUsToMs;
            }
            long j19 = window.windowStartTimeMs;
            if (j19 != C.TIME_UNSET) {
                window.windowStartTimeMs = j19 + jUsToMs;
            }
            return window;
        }
    }

    public static final class IllegalClippingException extends IOException {
        public static final int REASON_INVALID_PERIOD_COUNT = 0;
        public static final int REASON_NOT_SEEKABLE_TO_START = 1;
        public static final int REASON_START_EXCEEDS_END = 2;
        public final int reason;

        @Target({ElementType.TYPE_USE})
        @Documented
        @Retention(RetentionPolicy.SOURCE)
        public @interface Reason {
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public IllegalClippingException(int i14) {
            String strValueOf = String.valueOf(getReasonDescription(i14));
            super(strValueOf.length() != 0 ? "Illegal clipping: ".concat(strValueOf) : new String("Illegal clipping: "));
            this.reason = i14;
        }

        private static String getReasonDescription(int i14) {
            if (i14 == 0) {
                return "invalid period count";
            }
            if (i14 != 1) {
                return i14 != 2 ? PrivacyUpdateRequestError.UNKNOWN : "start exceeds end";
            }
            return "not seekable to start";
        }
    }

    public ClippingMediaSource(MediaSource mediaSource, long j8, long j14, boolean z14, boolean z15, boolean z16) {
        Assertions.checkArgument(j8 >= 0);
        this.mediaSource = (MediaSource) Assertions.checkNotNull(mediaSource);
        this.startUs = j8;
        this.endUs = j14;
        this.enableInitialDiscontinuity = z14;
        this.allowDynamicClippingUpdates = z15;
        this.relativeToDefaultPosition = z16;
        this.mediaPeriods = new ArrayList<>();
        this.window = new Timeline.Window();
    }

    private void refreshClippedTimeline(Timeline timeline) {
        long j8;
        timeline.getWindow(0, this.window);
        long positionInFirstPeriodUs = this.window.getPositionInFirstPeriodUs();
        long j14 = Long.MIN_VALUE;
        if (this.clippingTimeline == null || this.mediaPeriods.isEmpty() || this.allowDynamicClippingUpdates) {
            j8 = this.startUs;
            long j15 = this.endUs;
            if (this.relativeToDefaultPosition) {
                long defaultPositionUs = this.window.getDefaultPositionUs();
                j8 += defaultPositionUs;
                j15 += defaultPositionUs;
            }
            this.periodStartUs = positionInFirstPeriodUs + j8;
            this.periodEndUs = this.endUs != Long.MIN_VALUE ? positionInFirstPeriodUs + j15 : Long.MIN_VALUE;
            int size = this.mediaPeriods.size();
            for (int i14 = 0; i14 < size; i14++) {
                this.mediaPeriods.get(i14).updateClipping(this.periodStartUs, this.periodEndUs);
            }
            j14 = j15;
        } else {
            j8 = this.periodStartUs - positionInFirstPeriodUs;
            if (this.endUs != Long.MIN_VALUE) {
                j14 = this.periodEndUs - positionInFirstPeriodUs;
            }
        }
        try {
            ClippingTimeline clippingTimeline = new ClippingTimeline(timeline, j8, j14);
            this.clippingTimeline = clippingTimeline;
            refreshSourceInfo(clippingTimeline);
        } catch (IllegalClippingException e4) {
            this.clippingError = e4;
            for (int i15 = 0; i15 < this.mediaPeriods.size(); i15++) {
                this.mediaPeriods.get(i15).setClippingError(this.clippingError);
            }
        }
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public MediaPeriod createPeriod(MediaSource.MediaPeriodId mediaPeriodId, Allocator allocator, long j8) {
        ClippingMediaPeriod clippingMediaPeriod = new ClippingMediaPeriod(this.mediaSource.createPeriod(mediaPeriodId, allocator, j8), this.enableInitialDiscontinuity, this.periodStartUs, this.periodEndUs);
        this.mediaPeriods.add(clippingMediaPeriod);
        return clippingMediaPeriod;
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public MediaItem getMediaItem() {
        return this.mediaSource.getMediaItem();
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource, com.google.android.exoplayer2.source.MediaSource
    public void maybeThrowSourceInfoRefreshError() throws IllegalClippingException {
        IllegalClippingException illegalClippingException = this.clippingError;
        if (illegalClippingException != null) {
            throw illegalClippingException;
        }
        super.maybeThrowSourceInfoRefreshError();
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource
    /* JADX INFO: renamed from: onChildSourceInfoRefreshed, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void lambda$prepareChildSource$0(Void r14, MediaSource mediaSource, Timeline timeline) {
        if (this.clippingError != null) {
            return;
        }
        refreshClippedTimeline(timeline);
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource, com.google.android.exoplayer2.source.BaseMediaSource
    public void prepareSourceInternal(TransferListener transferListener) {
        super.prepareSourceInternal(transferListener);
        prepareChildSource(null, this.mediaSource);
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public void releasePeriod(MediaPeriod mediaPeriod) {
        Assertions.checkState(this.mediaPeriods.remove(mediaPeriod));
        this.mediaSource.releasePeriod(((ClippingMediaPeriod) mediaPeriod).mediaPeriod);
        if (!this.mediaPeriods.isEmpty() || this.allowDynamicClippingUpdates) {
            return;
        }
        refreshClippedTimeline(((ClippingTimeline) Assertions.checkNotNull(this.clippingTimeline)).timeline);
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource, com.google.android.exoplayer2.source.BaseMediaSource
    public void releaseSourceInternal() {
        super.releaseSourceInternal();
        this.clippingError = null;
        this.clippingTimeline = null;
    }

    public ClippingMediaSource(MediaSource mediaSource, long j8) {
        this(mediaSource, 0L, j8, true, false, true);
    }

    public ClippingMediaSource(MediaSource mediaSource, long j8, long j14) {
        this(mediaSource, j8, j14, true, false, false);
    }
}
