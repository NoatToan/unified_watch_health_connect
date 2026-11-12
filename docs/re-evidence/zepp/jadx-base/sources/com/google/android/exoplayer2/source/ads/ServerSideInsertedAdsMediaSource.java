package com.google.android.exoplayer2.source.ads;

import android.os.Handler;
import android.util.Pair;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.FormatHolder;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.SeekParameters;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.drm.DrmSessionEventListener;
import com.google.android.exoplayer2.drm.h;
import com.google.android.exoplayer2.offline.StreamKey;
import com.google.android.exoplayer2.source.BaseMediaSource;
import com.google.android.exoplayer2.source.EmptySampleStream;
import com.google.android.exoplayer2.source.ForwardingTimeline;
import com.google.android.exoplayer2.source.LoadEventInfo;
import com.google.android.exoplayer2.source.MediaLoadData;
import com.google.android.exoplayer2.source.MediaPeriod;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.MediaSourceEventListener;
import com.google.android.exoplayer2.source.SampleStream;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.ExoTrackSelection;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.upstream.TransferListener;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Iterables;
import com.google.common.collect.ListMultimap;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class ServerSideInsertedAdsMediaSource extends BaseMediaSource implements MediaSource.MediaSourceCaller, MediaSourceEventListener, DrmSessionEventListener {
    private final MediaSource g;

    @Nullable
    @GuardedBy("this")
    private Handler k;

    @Nullable
    private d l;

    @Nullable
    private Timeline m;
    private final ListMultimap<Long, d> h = ArrayListMultimap.create();
    private AdPlaybackState n = AdPlaybackState.NONE;
    private final MediaSourceEventListener.EventDispatcher i = createEventDispatcher(null);
    private final DrmSessionEventListener.EventDispatcher j = createDrmEventDispatcher(null);

    public static final class a implements MediaPeriod {
        public final d a;
        public final MediaSource.MediaPeriodId b;
        public final MediaSourceEventListener.EventDispatcher c;
        public final DrmSessionEventListener.EventDispatcher d;
        public MediaPeriod.Callback e;
        public long f;
        public boolean[] g = new boolean[0];

        public a(d sharedPeriod, MediaSource.MediaPeriodId mediaPeriodId, MediaSourceEventListener.EventDispatcher mediaSourceEventDispatcher, DrmSessionEventListener.EventDispatcher drmEventDispatcher) {
            this.a = sharedPeriod;
            this.b = mediaPeriodId;
            this.c = mediaSourceEventDispatcher;
            this.d = drmEventDispatcher;
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
        public boolean continueLoading(long positionUs) {
            return this.a.e(this, positionUs);
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod
        public void discardBuffer(long positionUs, boolean toKeyframe) {
            this.a.f(this, positionUs, toKeyframe);
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod
        public long getAdjustedSeekPositionUs(long positionUs, SeekParameters seekParameters) {
            return this.a.h(this, positionUs, seekParameters);
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
        public long getBufferedPositionUs() {
            return this.a.i(this);
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
        public long getNextLoadPositionUs() {
            return this.a.l(this);
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod
        public List<StreamKey> getStreamKeys(List<ExoTrackSelection> trackSelections) {
            return this.a.m(trackSelections);
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod
        public TrackGroupArray getTrackGroups() {
            return this.a.o();
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
        public boolean isLoading() {
            return this.a.p(this);
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod
        public void maybeThrowPrepareError() throws IOException {
            this.a.u();
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod
        public void prepare(MediaPeriod.Callback callback, long positionUs) {
            this.e = callback;
            this.a.z(this, positionUs);
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod
        public long readDiscontinuity() {
            return this.a.B(this);
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
        public void reevaluateBuffer(long positionUs) {
            this.a.C(this, positionUs);
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod
        public long seekToUs(long positionUs) {
            return this.a.F(this, positionUs);
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod
        public long selectTracks(ExoTrackSelection[] selections, boolean[] mayRetainStreamFlags, SampleStream[] streams, boolean[] streamResetFlags, long positionUs) {
            if (this.g.length == 0) {
                this.g = new boolean[streams.length];
            }
            return this.a.G(this, selections, mayRetainStreamFlags, streams, streamResetFlags, positionUs);
        }
    }

    public static final class b implements SampleStream {
        private final a a;
        private final int b;

        public b(a mediaPeriod, int streamIndex) {
            this.a = mediaPeriod;
            this.b = streamIndex;
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        public boolean isReady() {
            return this.a.a.q(this.b);
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        public void maybeThrowError() throws IOException {
            this.a.a.t(this.b);
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        public int readData(FormatHolder formatHolder, DecoderInputBuffer buffer, int readFlags) {
            a aVar = this.a;
            return aVar.a.A(aVar, this.b, formatHolder, buffer, readFlags);
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        public int skipData(long positionUs) {
            a aVar = this.a;
            return aVar.a.H(aVar, this.b, positionUs);
        }
    }

    public static final class c extends ForwardingTimeline {
        private final AdPlaybackState d;

        public c(Timeline contentTimeline, AdPlaybackState adPlaybackState) {
            super(contentTimeline);
            Assertions.checkState(contentTimeline.getPeriodCount() == 1);
            Assertions.checkState(contentTimeline.getWindowCount() == 1);
            this.d = adPlaybackState;
        }

        @Override // com.google.android.exoplayer2.source.ForwardingTimeline, com.google.android.exoplayer2.Timeline
        public Timeline.Period getPeriod(int periodIndex, Timeline.Period period, boolean setIds) {
            super.getPeriod(periodIndex, period, setIds);
            long j = period.durationUs;
            period.set(period.id, period.uid, period.windowIndex, j == C.TIME_UNSET ? this.d.contentDurationUs : ServerSideInsertedAdsUtil.getMediaPeriodPositionUsForContent(j, -1, this.d), -ServerSideInsertedAdsUtil.getMediaPeriodPositionUsForContent(-period.getPositionInWindowUs(), -1, this.d), this.d, period.isPlaceholder);
            return period;
        }

        @Override // com.google.android.exoplayer2.source.ForwardingTimeline, com.google.android.exoplayer2.Timeline
        public Timeline.Window getWindow(int windowIndex, Timeline.Window window, long defaultPositionProjectionUs) {
            super.getWindow(windowIndex, window, defaultPositionProjectionUs);
            long mediaPeriodPositionUsForContent = ServerSideInsertedAdsUtil.getMediaPeriodPositionUsForContent(window.positionInFirstPeriodUs, -1, this.d);
            long j = window.durationUs;
            if (j == C.TIME_UNSET) {
                long j2 = this.d.contentDurationUs;
                if (j2 != C.TIME_UNSET) {
                    window.durationUs = j2 - mediaPeriodPositionUsForContent;
                }
            } else {
                window.durationUs = ServerSideInsertedAdsUtil.getMediaPeriodPositionUsForContent(window.positionInFirstPeriodUs + j, -1, this.d) - mediaPeriodPositionUsForContent;
            }
            window.positionInFirstPeriodUs = mediaPeriodPositionUsForContent;
            return window;
        }
    }

    public static final class d implements MediaPeriod.Callback {
        private final MediaPeriod a;
        private AdPlaybackState d;

        @Nullable
        private a e;
        private boolean f;
        private boolean g;
        private final List<a> b = new ArrayList();
        private final Map<Long, Pair<LoadEventInfo, MediaLoadData>> c = new HashMap();
        public ExoTrackSelection[] h = new ExoTrackSelection[0];
        public SampleStream[] i = new SampleStream[0];
        public MediaLoadData[] j = new MediaLoadData[0];

        public d(MediaPeriod actualMediaPeriod, AdPlaybackState adPlaybackState) {
            this.a = actualMediaPeriod;
            this.d = adPlaybackState;
        }

        private int g(MediaLoadData mediaLoadData) {
            String str;
            if (mediaLoadData.trackFormat == null) {
                return -1;
            }
            int i = 0;
            while (true) {
                ExoTrackSelection[] exoTrackSelectionArr = this.h;
                if (i >= exoTrackSelectionArr.length) {
                    return -1;
                }
                if (exoTrackSelectionArr[i] != null) {
                    TrackGroup trackGroup = exoTrackSelectionArr[i].getTrackGroup();
                    boolean z = mediaLoadData.trackType == 0 && trackGroup.equals(o().get(0));
                    for (int i2 = 0; i2 < trackGroup.length; i2++) {
                        Format format = trackGroup.getFormat(i2);
                        if (format.equals(mediaLoadData.trackFormat) || (z && (str = format.id) != null && str.equals(mediaLoadData.trackFormat.id))) {
                            return i;
                        }
                    }
                }
                i++;
            }
        }

        private long k(a mediaPeriod, long positionUs) {
            if (positionUs == Long.MIN_VALUE) {
                return Long.MIN_VALUE;
            }
            long mediaPeriodPositionUs = ServerSideInsertedAdsUtil.getMediaPeriodPositionUs(positionUs, mediaPeriod.b, this.d);
            if (mediaPeriodPositionUs >= ServerSideInsertedAdsMediaSource.f(mediaPeriod, this.d)) {
                return Long.MIN_VALUE;
            }
            return mediaPeriodPositionUs;
        }

        private long n(a mediaPeriod, long positionUs) {
            long j = mediaPeriod.f;
            return positionUs < j ? ServerSideInsertedAdsUtil.getStreamPositionUs(j, mediaPeriod.b, this.d) - (mediaPeriod.f - positionUs) : ServerSideInsertedAdsUtil.getStreamPositionUs(positionUs, mediaPeriod.b, this.d);
        }

        private void s(a mediaPeriod, int streamIndex) {
            boolean[] zArr = mediaPeriod.g;
            if (zArr[streamIndex]) {
                return;
            }
            MediaLoadData[] mediaLoadDataArr = this.j;
            if (mediaLoadDataArr[streamIndex] != null) {
                zArr[streamIndex] = true;
                mediaPeriod.c.downstreamFormatChanged(ServerSideInsertedAdsMediaSource.d(mediaPeriod, mediaLoadDataArr[streamIndex], this.d));
            }
        }

        public int A(a mediaPeriod, int streamIndex, FormatHolder formatHolder, DecoderInputBuffer buffer, int readFlags) {
            int data = ((SampleStream) Util.castNonNull(this.i[streamIndex])).readData(formatHolder, buffer, readFlags | 1 | 4);
            long jK = k(mediaPeriod, buffer.timeUs);
            if ((data == -4 && jK == Long.MIN_VALUE) || (data == -3 && i(mediaPeriod) == Long.MIN_VALUE && !buffer.waitingForKeys)) {
                s(mediaPeriod, streamIndex);
                buffer.clear();
                buffer.addFlag(4);
                return -4;
            }
            if (data == -4) {
                s(mediaPeriod, streamIndex);
                ((SampleStream) Util.castNonNull(this.i[streamIndex])).readData(formatHolder, buffer, readFlags);
                buffer.timeUs = jK;
            }
            return data;
        }

        public long B(a mediaPeriod) {
            if (!mediaPeriod.equals(this.b.get(0))) {
                return C.TIME_UNSET;
            }
            long discontinuity = this.a.readDiscontinuity();
            return discontinuity == C.TIME_UNSET ? C.TIME_UNSET : ServerSideInsertedAdsUtil.getMediaPeriodPositionUs(discontinuity, mediaPeriod.b, this.d);
        }

        public void C(a mediaPeriod, long positionUs) {
            this.a.reevaluateBuffer(n(mediaPeriod, positionUs));
        }

        public void D(MediaSource mediaSource) {
            mediaSource.releasePeriod(this.a);
        }

        public void E(a mediaPeriod) {
            if (mediaPeriod.equals(this.e)) {
                this.e = null;
                this.c.clear();
            }
            this.b.remove(mediaPeriod);
        }

        public long F(a mediaPeriod, long positionUs) {
            return ServerSideInsertedAdsUtil.getMediaPeriodPositionUs(this.a.seekToUs(ServerSideInsertedAdsUtil.getStreamPositionUs(positionUs, mediaPeriod.b, this.d)), mediaPeriod.b, this.d);
        }

        public long G(a mediaPeriod, ExoTrackSelection[] selections, boolean[] mayRetainStreamFlags, SampleStream[] streams, boolean[] streamResetFlags, long positionUs) {
            mediaPeriod.f = positionUs;
            if (!mediaPeriod.equals(this.b.get(0))) {
                for (int i = 0; i < selections.length; i++) {
                    boolean z = true;
                    if (selections[i] != null) {
                        if (mayRetainStreamFlags[i] && streams[i] != null) {
                            z = false;
                        }
                        streamResetFlags[i] = z;
                        if (streamResetFlags[i]) {
                            streams[i] = Util.areEqual(this.h[i], selections[i]) ? new b(mediaPeriod, i) : new EmptySampleStream();
                        }
                    } else {
                        streams[i] = null;
                        streamResetFlags[i] = true;
                    }
                }
                return positionUs;
            }
            this.h = (ExoTrackSelection[]) Arrays.copyOf(selections, selections.length);
            long streamPositionUs = ServerSideInsertedAdsUtil.getStreamPositionUs(positionUs, mediaPeriod.b, this.d);
            SampleStream[] sampleStreamArr = this.i;
            SampleStream[] sampleStreamArr2 = sampleStreamArr.length == 0 ? new SampleStream[selections.length] : (SampleStream[]) Arrays.copyOf(sampleStreamArr, sampleStreamArr.length);
            long jSelectTracks = this.a.selectTracks(selections, mayRetainStreamFlags, sampleStreamArr2, streamResetFlags, streamPositionUs);
            this.i = (SampleStream[]) Arrays.copyOf(sampleStreamArr2, sampleStreamArr2.length);
            this.j = (MediaLoadData[]) Arrays.copyOf(this.j, sampleStreamArr2.length);
            for (int i2 = 0; i2 < sampleStreamArr2.length; i2++) {
                if (sampleStreamArr2[i2] == null) {
                    streams[i2] = null;
                    this.j[i2] = null;
                } else if (streams[i2] == null || streamResetFlags[i2]) {
                    streams[i2] = new b(mediaPeriod, i2);
                    this.j[i2] = null;
                }
            }
            return ServerSideInsertedAdsUtil.getMediaPeriodPositionUs(jSelectTracks, mediaPeriod.b, this.d);
        }

        public int H(a mediaPeriod, int streamIndex, long positionUs) {
            return ((SampleStream) Util.castNonNull(this.i[streamIndex])).skipData(ServerSideInsertedAdsUtil.getStreamPositionUs(positionUs, mediaPeriod.b, this.d));
        }

        public void I(AdPlaybackState adPlaybackState) {
            this.d = adPlaybackState;
        }

        public void c(a mediaPeriod) {
            this.b.add(mediaPeriod);
        }

        public boolean d(MediaSource.MediaPeriodId id, long positionUs) {
            a aVar = (a) Iterables.getLast(this.b);
            return ServerSideInsertedAdsUtil.getStreamPositionUs(positionUs, id, this.d) == ServerSideInsertedAdsUtil.getStreamPositionUs(ServerSideInsertedAdsMediaSource.f(aVar, this.d), aVar.b, this.d);
        }

        public boolean e(a mediaPeriod, long positionUs) {
            a aVar = this.e;
            if (aVar != null && !mediaPeriod.equals(aVar)) {
                for (Pair<LoadEventInfo, MediaLoadData> pair : this.c.values()) {
                    aVar.c.loadCompleted((LoadEventInfo) pair.first, ServerSideInsertedAdsMediaSource.d(aVar, (MediaLoadData) pair.second, this.d));
                    mediaPeriod.c.loadStarted((LoadEventInfo) pair.first, ServerSideInsertedAdsMediaSource.d(mediaPeriod, (MediaLoadData) pair.second, this.d));
                }
            }
            this.e = mediaPeriod;
            return this.a.continueLoading(n(mediaPeriod, positionUs));
        }

        public void f(a mediaPeriod, long positionUs, boolean toKeyframe) {
            this.a.discardBuffer(ServerSideInsertedAdsUtil.getStreamPositionUs(positionUs, mediaPeriod.b, this.d), toKeyframe);
        }

        public long h(a mediaPeriod, long positionUs, SeekParameters seekParameters) {
            return ServerSideInsertedAdsUtil.getMediaPeriodPositionUs(this.a.getAdjustedSeekPositionUs(ServerSideInsertedAdsUtil.getStreamPositionUs(positionUs, mediaPeriod.b, this.d), seekParameters), mediaPeriod.b, this.d);
        }

        public long i(a mediaPeriod) {
            return k(mediaPeriod, this.a.getBufferedPositionUs());
        }

        @Nullable
        public a j(@Nullable MediaLoadData mediaLoadData) {
            if (mediaLoadData == null || mediaLoadData.mediaStartTimeMs == C.TIME_UNSET) {
                return null;
            }
            for (int i = 0; i < this.b.size(); i++) {
                a aVar = this.b.get(i);
                long mediaPeriodPositionUs = ServerSideInsertedAdsUtil.getMediaPeriodPositionUs(C.msToUs(mediaLoadData.mediaStartTimeMs), aVar.b, this.d);
                long jF = ServerSideInsertedAdsMediaSource.f(aVar, this.d);
                if (mediaPeriodPositionUs >= 0 && mediaPeriodPositionUs < jF) {
                    return aVar;
                }
            }
            return null;
        }

        public long l(a mediaPeriod) {
            return k(mediaPeriod, this.a.getNextLoadPositionUs());
        }

        public List<StreamKey> m(List<ExoTrackSelection> trackSelections) {
            return this.a.getStreamKeys(trackSelections);
        }

        public TrackGroupArray o() {
            return this.a.getTrackGroups();
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod.Callback
        public void onPrepared(MediaPeriod actualMediaPeriod) {
            this.g = true;
            for (int i = 0; i < this.b.size(); i++) {
                a aVar = this.b.get(i);
                MediaPeriod.Callback callback = aVar.e;
                if (callback != null) {
                    callback.onPrepared(aVar);
                }
            }
        }

        public boolean p(a mediaPeriod) {
            return mediaPeriod.equals(this.e) && this.a.isLoading();
        }

        public boolean q(int streamIndex) {
            return ((SampleStream) Util.castNonNull(this.i[streamIndex])).isReady();
        }

        public boolean r() {
            return this.b.isEmpty();
        }

        public void t(int streamIndex) throws IOException {
            ((SampleStream) Util.castNonNull(this.i[streamIndex])).maybeThrowError();
        }

        public void u() throws IOException {
            this.a.maybeThrowPrepareError();
        }

        @Override // com.google.android.exoplayer2.source.SequenceableLoader.Callback
        /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
        public void onContinueLoadingRequested(MediaPeriod source) {
            a aVar = this.e;
            if (aVar == null) {
                return;
            }
            ((MediaPeriod.Callback) Assertions.checkNotNull(aVar.e)).onContinueLoadingRequested(this.e);
        }

        public void w(a mediaPeriod, MediaLoadData mediaLoadData) {
            int iG = g(mediaLoadData);
            if (iG != -1) {
                this.j[iG] = mediaLoadData;
                mediaPeriod.g[iG] = true;
            }
        }

        public void x(LoadEventInfo loadEventInfo) {
            this.c.remove(Long.valueOf(loadEventInfo.loadTaskId));
        }

        public void y(LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
            this.c.put(Long.valueOf(loadEventInfo.loadTaskId), Pair.create(loadEventInfo, mediaLoadData));
        }

        public void z(a mediaPeriod, long positionUs) {
            mediaPeriod.f = positionUs;
            if (this.f) {
                if (this.g) {
                    ((MediaPeriod.Callback) Assertions.checkNotNull(mediaPeriod.e)).onPrepared(mediaPeriod);
                }
            } else {
                this.f = true;
                this.a.prepare(this, ServerSideInsertedAdsUtil.getStreamPositionUs(positionUs, mediaPeriod.b, this.d));
            }
        }
    }

    public ServerSideInsertedAdsMediaSource(MediaSource mediaSource) {
        this.g = mediaSource;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static MediaLoadData d(a mediaPeriod, MediaLoadData mediaLoadData, AdPlaybackState adPlaybackState) {
        return new MediaLoadData(mediaLoadData.dataType, mediaLoadData.trackType, mediaLoadData.trackFormat, mediaLoadData.trackSelectionReason, mediaLoadData.trackSelectionData, e(mediaLoadData.mediaStartTimeMs, mediaPeriod, adPlaybackState), e(mediaLoadData.mediaEndTimeMs, mediaPeriod, adPlaybackState));
    }

    private static long e(long mediaPositionMs, a mediaPeriod, AdPlaybackState adPlaybackState) {
        if (mediaPositionMs == C.TIME_UNSET) {
            return C.TIME_UNSET;
        }
        long jMsToUs = C.msToUs(mediaPositionMs);
        MediaSource.MediaPeriodId mediaPeriodId = mediaPeriod.b;
        return C.usToMs(mediaPeriodId.isAd() ? ServerSideInsertedAdsUtil.getMediaPeriodPositionUsForAd(jMsToUs, mediaPeriodId.adGroupIndex, mediaPeriodId.adIndexInAdGroup, adPlaybackState) : ServerSideInsertedAdsUtil.getMediaPeriodPositionUsForContent(jMsToUs, -1, adPlaybackState));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long f(a mediaPeriod, AdPlaybackState adPlaybackState) {
        MediaSource.MediaPeriodId mediaPeriodId = mediaPeriod.b;
        if (mediaPeriodId.isAd()) {
            AdPlaybackState.AdGroup adGroup = adPlaybackState.getAdGroup(mediaPeriodId.adGroupIndex);
            if (adGroup.count == -1) {
                return 0L;
            }
            return adGroup.durationsUs[mediaPeriodId.adIndexInAdGroup];
        }
        int i = mediaPeriodId.nextAdGroupIndex;
        if (i == -1) {
            return Long.MAX_VALUE;
        }
        long j = adPlaybackState.getAdGroup(i).timeUs;
        if (j == Long.MIN_VALUE) {
            return Long.MAX_VALUE;
        }
        return j;
    }

    @Nullable
    private a g(@Nullable MediaSource.MediaPeriodId mediaPeriodId, @Nullable MediaLoadData mediaLoadData, boolean useLoadingPeriod) {
        if (mediaPeriodId == null) {
            return null;
        }
        List<d> list = this.h.get(Long.valueOf(mediaPeriodId.windowSequenceNumber));
        if (list.isEmpty()) {
            return null;
        }
        if (useLoadingPeriod) {
            d dVar = (d) Iterables.getLast(list);
            return dVar.e != null ? dVar.e : (a) Iterables.getLast(dVar.b);
        }
        for (int i = 0; i < list.size(); i++) {
            a aVarJ = list.get(i).j(mediaLoadData);
            if (aVarJ != null) {
                return aVarJ;
            }
        }
        return (a) list.get(0).b.get(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h(AdPlaybackState adPlaybackState) {
        Iterator<d> it2 = this.h.values().iterator();
        while (it2.hasNext()) {
            it2.next().I(adPlaybackState);
        }
        d dVar = this.l;
        if (dVar != null) {
            dVar.I(adPlaybackState);
        }
        this.n = adPlaybackState;
        if (this.m != null) {
            refreshSourceInfo(new c(this.m, adPlaybackState));
        }
    }

    private void i() {
        d dVar = this.l;
        if (dVar != null) {
            dVar.D(this.g);
            this.l = null;
        }
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public MediaPeriod createPeriod(MediaSource.MediaPeriodId id, Allocator allocator, long startPositionUs) {
        d dVar = this.l;
        if (dVar != null) {
            this.l = null;
            this.h.put(Long.valueOf(id.windowSequenceNumber), dVar);
        } else {
            dVar = (d) Iterables.getLast(this.h.get(Long.valueOf(id.windowSequenceNumber)), null);
            if (dVar == null || !dVar.d(id, startPositionUs)) {
                dVar = new d(this.g.createPeriod(new MediaSource.MediaPeriodId(id.periodUid, id.windowSequenceNumber), allocator, ServerSideInsertedAdsUtil.getStreamPositionUs(startPositionUs, id, this.n)), this.n);
                this.h.put(Long.valueOf(id.windowSequenceNumber), dVar);
            }
        }
        a aVar = new a(dVar, id, createEventDispatcher(id), createDrmEventDispatcher(id));
        dVar.c(aVar);
        return aVar;
    }

    @Override // com.google.android.exoplayer2.source.BaseMediaSource
    public void disableInternal() {
        i();
        this.g.disable(this);
    }

    @Override // com.google.android.exoplayer2.source.BaseMediaSource
    public void enableInternal() {
        this.g.enable(this);
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public MediaItem getMediaItem() {
        return this.g.getMediaItem();
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public void maybeThrowSourceInfoRefreshError() throws IOException {
        this.g.maybeThrowSourceInfoRefreshError();
    }

    @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
    public void onDownstreamFormatChanged(int windowIndex, @Nullable MediaSource.MediaPeriodId mediaPeriodId, MediaLoadData mediaLoadData) {
        a aVarG = g(mediaPeriodId, mediaLoadData, false);
        if (aVarG == null) {
            this.i.downstreamFormatChanged(mediaLoadData);
        } else {
            aVarG.a.w(aVarG, mediaLoadData);
            aVarG.c.downstreamFormatChanged(d(aVarG, mediaLoadData, this.n));
        }
    }

    @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
    public void onDrmKeysLoaded(int windowIndex, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
        a aVarG = g(mediaPeriodId, null, false);
        if (aVarG == null) {
            this.j.drmKeysLoaded();
        } else {
            aVarG.d.drmKeysLoaded();
        }
    }

    @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
    public void onDrmKeysRemoved(int windowIndex, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
        a aVarG = g(mediaPeriodId, null, false);
        if (aVarG == null) {
            this.j.drmKeysRemoved();
        } else {
            aVarG.d.drmKeysRemoved();
        }
    }

    @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
    public void onDrmKeysRestored(int windowIndex, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
        a aVarG = g(mediaPeriodId, null, false);
        if (aVarG == null) {
            this.j.drmKeysRestored();
        } else {
            aVarG.d.drmKeysRestored();
        }
    }

    @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
    public /* synthetic */ void onDrmSessionAcquired(int i, MediaSource.MediaPeriodId mediaPeriodId) {
        h.d(this, i, mediaPeriodId);
    }

    @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
    public void onDrmSessionAcquired(int windowIndex, @Nullable MediaSource.MediaPeriodId mediaPeriodId, int state) {
        a aVarG = g(mediaPeriodId, null, true);
        if (aVarG == null) {
            this.j.drmSessionAcquired(state);
        } else {
            aVarG.d.drmSessionAcquired(state);
        }
    }

    @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
    public void onDrmSessionManagerError(int windowIndex, @Nullable MediaSource.MediaPeriodId mediaPeriodId, Exception error) {
        a aVarG = g(mediaPeriodId, null, false);
        if (aVarG == null) {
            this.j.drmSessionManagerError(error);
        } else {
            aVarG.d.drmSessionManagerError(error);
        }
    }

    @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
    public void onDrmSessionReleased(int windowIndex, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
        a aVarG = g(mediaPeriodId, null, false);
        if (aVarG == null) {
            this.j.drmSessionReleased();
        } else {
            aVarG.d.drmSessionReleased();
        }
    }

    @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
    public void onLoadCanceled(int windowIndex, @Nullable MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
        a aVarG = g(mediaPeriodId, mediaLoadData, true);
        if (aVarG == null) {
            this.i.loadCanceled(loadEventInfo, mediaLoadData);
        } else {
            aVarG.a.x(loadEventInfo);
            aVarG.c.loadCanceled(loadEventInfo, d(aVarG, mediaLoadData, this.n));
        }
    }

    @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
    public void onLoadCompleted(int windowIndex, @Nullable MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
        a aVarG = g(mediaPeriodId, mediaLoadData, true);
        if (aVarG == null) {
            this.i.loadCompleted(loadEventInfo, mediaLoadData);
        } else {
            aVarG.a.x(loadEventInfo);
            aVarG.c.loadCompleted(loadEventInfo, d(aVarG, mediaLoadData, this.n));
        }
    }

    @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
    public void onLoadError(int windowIndex, @Nullable MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, IOException error, boolean wasCanceled) {
        a aVarG = g(mediaPeriodId, mediaLoadData, true);
        if (aVarG == null) {
            this.i.loadError(loadEventInfo, mediaLoadData, error, wasCanceled);
            return;
        }
        if (wasCanceled) {
            aVarG.a.x(loadEventInfo);
        }
        aVarG.c.loadError(loadEventInfo, d(aVarG, mediaLoadData, this.n), error, wasCanceled);
    }

    @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
    public void onLoadStarted(int windowIndex, @Nullable MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
        a aVarG = g(mediaPeriodId, mediaLoadData, true);
        if (aVarG == null) {
            this.i.loadStarted(loadEventInfo, mediaLoadData);
        } else {
            aVarG.a.y(loadEventInfo, mediaLoadData);
            aVarG.c.loadStarted(loadEventInfo, d(aVarG, mediaLoadData, this.n));
        }
    }

    @Override // com.google.android.exoplayer2.source.MediaSource.MediaSourceCaller
    public void onSourceInfoRefreshed(MediaSource source, Timeline timeline) {
        this.m = timeline;
        if (AdPlaybackState.NONE.equals(this.n)) {
            return;
        }
        refreshSourceInfo(new c(timeline, this.n));
    }

    @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
    public void onUpstreamDiscarded(int windowIndex, MediaSource.MediaPeriodId mediaPeriodId, MediaLoadData mediaLoadData) {
        a aVarG = g(mediaPeriodId, mediaLoadData, false);
        if (aVarG == null) {
            this.i.upstreamDiscarded(mediaLoadData);
        } else {
            aVarG.c.upstreamDiscarded(d(aVarG, mediaLoadData, this.n));
        }
    }

    @Override // com.google.android.exoplayer2.source.BaseMediaSource
    public void prepareSourceInternal(@Nullable TransferListener mediaTransferListener) {
        Handler handlerCreateHandlerForCurrentLooper = Util.createHandlerForCurrentLooper();
        synchronized (this) {
            this.k = handlerCreateHandlerForCurrentLooper;
        }
        this.g.addEventListener(handlerCreateHandlerForCurrentLooper, this);
        this.g.addDrmEventListener(handlerCreateHandlerForCurrentLooper, this);
        this.g.prepareSource(this, mediaTransferListener);
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public void releasePeriod(MediaPeriod mediaPeriod) {
        a aVar = (a) mediaPeriod;
        aVar.a.E(aVar);
        if (aVar.a.r()) {
            this.h.remove(Long.valueOf(aVar.b.windowSequenceNumber), aVar.a);
            if (this.h.isEmpty()) {
                this.l = aVar.a;
            } else {
                aVar.a.D(this.g);
            }
        }
    }

    @Override // com.google.android.exoplayer2.source.BaseMediaSource
    public void releaseSourceInternal() {
        i();
        this.m = null;
        synchronized (this) {
            this.k = null;
        }
        this.g.releaseSource(this);
        this.g.removeEventListener(this);
        this.g.removeDrmEventListener(this);
    }

    public void setAdPlaybackState(final AdPlaybackState adPlaybackState) {
        Assertions.checkArgument(adPlaybackState.adGroupCount >= this.n.adGroupCount);
        for (int i = adPlaybackState.removedAdGroupCount; i < adPlaybackState.adGroupCount; i++) {
            AdPlaybackState.AdGroup adGroup = adPlaybackState.getAdGroup(i);
            Assertions.checkArgument(adGroup.isServerSideInserted);
            if (i < this.n.adGroupCount) {
                Assertions.checkArgument(ServerSideInsertedAdsUtil.getAdCountInGroup(adPlaybackState, i) >= ServerSideInsertedAdsUtil.getAdCountInGroup(this.n, i));
            }
            if (adGroup.timeUs == Long.MIN_VALUE) {
                Assertions.checkArgument(ServerSideInsertedAdsUtil.getAdCountInGroup(adPlaybackState, i) == 0);
            }
        }
        synchronized (this) {
            Handler handler = this.k;
            if (handler == null) {
                this.n = adPlaybackState;
            } else {
                handler.post(new Runnable() { // from class: bo6
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.h(adPlaybackState);
                    }
                });
            }
        }
    }
}
