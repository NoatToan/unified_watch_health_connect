package com.google.android.exoplayer2.source;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.upstream.TransferListener;
import com.google.android.exoplayer2.util.Assertions;
import com.google.common.collect.Multimap;
import com.google.common.collect.MultimapBuilder;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class MergingMediaSource extends CompositeMediaSource<Integer> {
    private static final int u = -1;
    private static final MediaItem v = new MediaItem.Builder().setMediaId("MergingMediaSource").build();
    private final boolean j;
    private final boolean k;
    private final MediaSource[] l;
    private final Timeline[] m;
    private final ArrayList<MediaSource> n;
    private final CompositeSequenceableLoaderFactory o;
    private final Map<Object, Long> p;
    private final Multimap<Object, ClippingMediaPeriod> q;
    private int r;
    private long[][] s;

    @Nullable
    private IllegalMergeException t;

    public static final class IllegalMergeException extends IOException {
        public static final int REASON_PERIOD_COUNT_MISMATCH = 0;
        public final int reason;

        @Documented
        @Retention(RetentionPolicy.SOURCE)
        public @interface Reason {
        }

        public IllegalMergeException(int reason) {
            this.reason = reason;
        }
    }

    public static final class a extends ForwardingTimeline {
        private final long[] d;
        private final long[] e;

        public a(Timeline timeline, Map<Object, Long> clippedDurationsUs) {
            super(timeline);
            int windowCount = timeline.getWindowCount();
            this.e = new long[timeline.getWindowCount()];
            Timeline.Window window = new Timeline.Window();
            for (int i = 0; i < windowCount; i++) {
                this.e[i] = timeline.getWindow(i, window).durationUs;
            }
            int periodCount = timeline.getPeriodCount();
            this.d = new long[periodCount];
            Timeline.Period period = new Timeline.Period();
            for (int i2 = 0; i2 < periodCount; i2++) {
                timeline.getPeriod(i2, period, true);
                long jLongValue = ((Long) Assertions.checkNotNull(clippedDurationsUs.get(period.uid))).longValue();
                long[] jArr = this.d;
                jArr[i2] = jLongValue == Long.MIN_VALUE ? period.durationUs : jLongValue;
                long j = period.durationUs;
                if (j != C.TIME_UNSET) {
                    long[] jArr2 = this.e;
                    int i3 = period.windowIndex;
                    jArr2[i3] = jArr2[i3] - (j - jArr[i2]);
                }
            }
        }

        @Override // com.google.android.exoplayer2.source.ForwardingTimeline, com.google.android.exoplayer2.Timeline
        public Timeline.Period getPeriod(int periodIndex, Timeline.Period period, boolean setIds) {
            super.getPeriod(periodIndex, period, setIds);
            period.durationUs = this.d[periodIndex];
            return period;
        }

        /* JADX WARN: Code duplicated, block: B:8:0x001e  */
        @Override // com.google.android.exoplayer2.source.ForwardingTimeline, com.google.android.exoplayer2.Timeline
        public Timeline.Window getWindow(int windowIndex, Timeline.Window window, long defaultPositionProjectionUs) {
            long jMin;
            super.getWindow(windowIndex, window, defaultPositionProjectionUs);
            long j = this.e[windowIndex];
            window.durationUs = j;
            if (j != C.TIME_UNSET) {
                long j2 = window.defaultPositionUs;
                if (j2 == C.TIME_UNSET) {
                    jMin = window.defaultPositionUs;
                } else {
                    jMin = Math.min(j2, j);
                }
            } else {
                jMin = window.defaultPositionUs;
            }
            window.defaultPositionUs = jMin;
            return window;
        }
    }

    public MergingMediaSource(MediaSource... mediaSources) {
        this(false, mediaSources);
    }

    private void c() {
        Timeline.Period period = new Timeline.Period();
        for (int i = 0; i < this.r; i++) {
            long j = -this.m[0].getPeriod(i, period).getPositionInWindowUs();
            int i2 = 1;
            while (true) {
                Timeline[] timelineArr = this.m;
                if (i2 < timelineArr.length) {
                    this.s[i][i2] = j - (-timelineArr[i2].getPeriod(i, period).getPositionInWindowUs());
                    i2++;
                }
            }
        }
    }

    private void d() {
        Timeline[] timelineArr;
        Timeline.Period period = new Timeline.Period();
        for (int i = 0; i < this.r; i++) {
            long j = Long.MIN_VALUE;
            int i2 = 0;
            while (true) {
                timelineArr = this.m;
                if (i2 >= timelineArr.length) {
                    break;
                }
                long durationUs = timelineArr[i2].getPeriod(i, period).getDurationUs();
                if (durationUs != C.TIME_UNSET) {
                    long j2 = durationUs + this.s[i][i2];
                    if (j == Long.MIN_VALUE || j2 < j) {
                        j = j2;
                    }
                }
                i2++;
            }
            Object uidOfPeriod = timelineArr[0].getUidOfPeriod(i);
            this.p.put(uidOfPeriod, Long.valueOf(j));
            Iterator<ClippingMediaPeriod> it2 = this.q.get(uidOfPeriod).iterator();
            while (it2.hasNext()) {
                it2.next().updateClipping(0L, j);
            }
        }
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public MediaPeriod createPeriod(MediaSource.MediaPeriodId id, Allocator allocator, long startPositionUs) {
        int length = this.l.length;
        MediaPeriod[] mediaPeriodArr = new MediaPeriod[length];
        int indexOfPeriod = this.m[0].getIndexOfPeriod(id.periodUid);
        for (int i = 0; i < length; i++) {
            mediaPeriodArr[i] = this.l[i].createPeriod(id.copyWithPeriodUid(this.m[i].getUidOfPeriod(indexOfPeriod)), allocator, startPositionUs - this.s[indexOfPeriod][i]);
        }
        d dVar = new d(this.o, this.s[indexOfPeriod], mediaPeriodArr);
        if (!this.k) {
            return dVar;
        }
        ClippingMediaPeriod clippingMediaPeriod = new ClippingMediaPeriod(dVar, true, 0L, ((Long) Assertions.checkNotNull(this.p.get(id.periodUid))).longValue());
        this.q.put(id.periodUid, clippingMediaPeriod);
        return clippingMediaPeriod;
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public MediaItem getMediaItem() {
        MediaSource[] mediaSourceArr = this.l;
        return mediaSourceArr.length > 0 ? mediaSourceArr[0].getMediaItem() : v;
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource, com.google.android.exoplayer2.source.MediaSource
    public void maybeThrowSourceInfoRefreshError() throws IOException {
        IllegalMergeException illegalMergeException = this.t;
        if (illegalMergeException != null) {
            throw illegalMergeException;
        }
        super.maybeThrowSourceInfoRefreshError();
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource, com.google.android.exoplayer2.source.BaseMediaSource
    public void prepareSourceInternal(@Nullable TransferListener mediaTransferListener) {
        super.prepareSourceInternal(mediaTransferListener);
        for (int i = 0; i < this.l.length; i++) {
            prepareChildSource(Integer.valueOf(i), this.l[i]);
        }
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public void releasePeriod(MediaPeriod mediaPeriod) {
        if (this.k) {
            ClippingMediaPeriod clippingMediaPeriod = (ClippingMediaPeriod) mediaPeriod;
            for (Map.Entry<Object, ClippingMediaPeriod> entry : this.q.entries()) {
                if (entry.getValue().equals(clippingMediaPeriod)) {
                    this.q.remove(entry.getKey(), entry.getValue());
                    break;
                }
            }
            mediaPeriod = clippingMediaPeriod.mediaPeriod;
        }
        d dVar = (d) mediaPeriod;
        int i = 0;
        while (true) {
            MediaSource[] mediaSourceArr = this.l;
            if (i >= mediaSourceArr.length) {
                return;
            }
            mediaSourceArr[i].releasePeriod(dVar.a(i));
            i++;
        }
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource, com.google.android.exoplayer2.source.BaseMediaSource
    public void releaseSourceInternal() {
        super.releaseSourceInternal();
        Arrays.fill(this.m, (Object) null);
        this.r = -1;
        this.t = null;
        this.n.clear();
        Collections.addAll(this.n, this.l);
    }

    public MergingMediaSource(boolean adjustPeriodTimeOffsets, MediaSource... mediaSources) {
        this(adjustPeriodTimeOffsets, false, mediaSources);
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource
    @Nullable
    public MediaSource.MediaPeriodId getMediaPeriodIdForChildMediaPeriodId(Integer id, MediaSource.MediaPeriodId mediaPeriodId) {
        if (id.intValue() == 0) {
            return mediaPeriodId;
        }
        return null;
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource
    /* JADX INFO: renamed from: onChildSourceInfoRefreshed, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void b(Integer id, MediaSource mediaSource, Timeline timeline) {
        if (this.t != null) {
            return;
        }
        if (this.r == -1) {
            this.r = timeline.getPeriodCount();
        } else if (timeline.getPeriodCount() != this.r) {
            this.t = new IllegalMergeException(0);
            return;
        }
        if (this.s.length == 0) {
            this.s = (long[][]) Array.newInstance((Class<?>) long.class, this.r, this.m.length);
        }
        this.n.remove(mediaSource);
        this.m[id.intValue()] = timeline;
        if (this.n.isEmpty()) {
            if (this.j) {
                c();
            }
            Timeline aVar = this.m[0];
            if (this.k) {
                d();
                aVar = new a(aVar, this.p);
            }
            refreshSourceInfo(aVar);
        }
    }

    public MergingMediaSource(boolean adjustPeriodTimeOffsets, boolean clipDurations, MediaSource... mediaSources) {
        this(adjustPeriodTimeOffsets, clipDurations, new DefaultCompositeSequenceableLoaderFactory(), mediaSources);
    }

    public MergingMediaSource(boolean adjustPeriodTimeOffsets, boolean clipDurations, CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory, MediaSource... mediaSources) {
        this.j = adjustPeriodTimeOffsets;
        this.k = clipDurations;
        this.l = mediaSources;
        this.o = compositeSequenceableLoaderFactory;
        this.n = new ArrayList<>(Arrays.asList(mediaSources));
        this.r = -1;
        this.m = new Timeline[mediaSources.length];
        this.s = new long[0][];
        this.p = new HashMap();
        this.q = MultimapBuilder.hashKeys().arrayListValues().build();
    }
}
