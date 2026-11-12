package com.google.android.exoplayer2.source.dash;

import android.os.SystemClock;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.SeekParameters;
import com.google.android.exoplayer2.extractor.ChunkIndex;
import com.google.android.exoplayer2.source.BehindLiveWindowException;
import com.google.android.exoplayer2.source.chunk.BaseMediaChunkIterator;
import com.google.android.exoplayer2.source.chunk.BundledChunkExtractor;
import com.google.android.exoplayer2.source.chunk.Chunk;
import com.google.android.exoplayer2.source.chunk.ChunkExtractor;
import com.google.android.exoplayer2.source.chunk.ChunkHolder;
import com.google.android.exoplayer2.source.chunk.ContainerMediaChunk;
import com.google.android.exoplayer2.source.chunk.InitializationChunk;
import com.google.android.exoplayer2.source.chunk.MediaChunk;
import com.google.android.exoplayer2.source.chunk.MediaChunkIterator;
import com.google.android.exoplayer2.source.chunk.SingleSampleMediaChunk;
import com.google.android.exoplayer2.source.dash.manifest.AdaptationSet;
import com.google.android.exoplayer2.source.dash.manifest.BaseUrl;
import com.google.android.exoplayer2.source.dash.manifest.DashManifest;
import com.google.android.exoplayer2.source.dash.manifest.RangedUri;
import com.google.android.exoplayer2.source.dash.manifest.Representation;
import com.google.android.exoplayer2.trackselection.ExoTrackSelection;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.HttpDataSource;
import com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy;
import com.google.android.exoplayer2.upstream.LoaderErrorThrower;
import com.google.android.exoplayer2.upstream.TransferListener;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class DefaultDashChunkSource implements DashChunkSource {
    private final LoaderErrorThrower a;
    private final BaseUrlExclusionList b;
    private final int[] c;
    private final int d;
    private final DataSource e;
    private final long f;
    private final int g;

    @Nullable
    private final PlayerEmsgHandler.PlayerTrackEmsgHandler h;
    private ExoTrackSelection i;
    private DashManifest j;
    private int k;

    @Nullable
    private IOException l;
    private boolean m;
    public final RepresentationHolder[] representationHolders;

    public static final class Factory implements DashChunkSource.Factory {
        private final DataSource.Factory a;
        private final int b;
        private final ChunkExtractor.Factory c;

        public Factory(DataSource.Factory dataSourceFactory) {
            this(dataSourceFactory, 1);
        }

        @Override // com.google.android.exoplayer2.source.dash.DashChunkSource.Factory
        public DashChunkSource createDashChunkSource(LoaderErrorThrower manifestLoaderErrorThrower, DashManifest manifest, BaseUrlExclusionList baseUrlExclusionList, int periodIndex, int[] adaptationSetIndices, ExoTrackSelection trackSelection, int trackType, long elapsedRealtimeOffsetMs, boolean enableEventMessageTrack, List<Format> closedCaptionFormats, @Nullable PlayerEmsgHandler.PlayerTrackEmsgHandler playerEmsgHandler, @Nullable TransferListener transferListener) {
            DataSource dataSourceCreateDataSource = this.a.createDataSource();
            if (transferListener != null) {
                dataSourceCreateDataSource.addTransferListener(transferListener);
            }
            return new DefaultDashChunkSource(this.c, manifestLoaderErrorThrower, manifest, baseUrlExclusionList, periodIndex, adaptationSetIndices, trackSelection, trackType, dataSourceCreateDataSource, elapsedRealtimeOffsetMs, this.b, enableEventMessageTrack, closedCaptionFormats, playerEmsgHandler);
        }

        public Factory(DataSource.Factory dataSourceFactory, int maxSegmentsPerLoad) {
            this(BundledChunkExtractor.FACTORY, dataSourceFactory, maxSegmentsPerLoad);
        }

        public Factory(ChunkExtractor.Factory chunkExtractorFactory, DataSource.Factory dataSourceFactory, int maxSegmentsPerLoad) {
            this.c = chunkExtractorFactory;
            this.a = dataSourceFactory;
            this.b = maxSegmentsPerLoad;
        }
    }

    public static final class RepresentationHolder {

        @Nullable
        public final ChunkExtractor a;
        private final long b;
        private final long c;
        public final Representation representation;

        @Nullable
        public final DashSegmentIndex segmentIndex;
        public final BaseUrl selectedBaseUrl;

        public RepresentationHolder(long periodDurationUs, Representation representation, BaseUrl selectedBaseUrl, @Nullable ChunkExtractor chunkExtractor, long segmentNumShift, @Nullable DashSegmentIndex segmentIndex) {
            this.b = periodDurationUs;
            this.representation = representation;
            this.selectedBaseUrl = selectedBaseUrl;
            this.c = segmentNumShift;
            this.a = chunkExtractor;
            this.segmentIndex = segmentIndex;
        }

        @CheckResult
        public RepresentationHolder b(long newPeriodDurationUs, Representation newRepresentation) throws BehindLiveWindowException {
            long segmentNum;
            long segmentNum2;
            DashSegmentIndex index = this.representation.getIndex();
            DashSegmentIndex index2 = newRepresentation.getIndex();
            if (index == null) {
                return new RepresentationHolder(newPeriodDurationUs, newRepresentation, this.selectedBaseUrl, this.a, this.c, index);
            }
            if (!index.isExplicit()) {
                return new RepresentationHolder(newPeriodDurationUs, newRepresentation, this.selectedBaseUrl, this.a, this.c, index2);
            }
            long segmentCount = index.getSegmentCount(newPeriodDurationUs);
            if (segmentCount == 0) {
                return new RepresentationHolder(newPeriodDurationUs, newRepresentation, this.selectedBaseUrl, this.a, this.c, index2);
            }
            long firstSegmentNum = index.getFirstSegmentNum();
            long timeUs = index.getTimeUs(firstSegmentNum);
            long j = (segmentCount + firstSegmentNum) - 1;
            long timeUs2 = index.getTimeUs(j) + index.getDurationUs(j, newPeriodDurationUs);
            long firstSegmentNum2 = index2.getFirstSegmentNum();
            long timeUs3 = index2.getTimeUs(firstSegmentNum2);
            long j2 = this.c;
            if (timeUs2 != timeUs3) {
                if (timeUs2 < timeUs3) {
                    throw new BehindLiveWindowException();
                }
                if (timeUs3 < timeUs) {
                    segmentNum2 = j2 - (index2.getSegmentNum(timeUs, newPeriodDurationUs) - firstSegmentNum);
                } else {
                    segmentNum = index.getSegmentNum(timeUs3, newPeriodDurationUs);
                }
                return new RepresentationHolder(newPeriodDurationUs, newRepresentation, this.selectedBaseUrl, this.a, segmentNum2, index2);
            }
            segmentNum = j + 1;
            segmentNum2 = j2 + (segmentNum - firstSegmentNum2);
            return new RepresentationHolder(newPeriodDurationUs, newRepresentation, this.selectedBaseUrl, this.a, segmentNum2, index2);
        }

        @CheckResult
        public RepresentationHolder c(DashSegmentIndex segmentIndex) {
            return new RepresentationHolder(this.b, this.representation, this.selectedBaseUrl, this.a, this.c, segmentIndex);
        }

        @CheckResult
        public RepresentationHolder d(BaseUrl selectedBaseUrl) {
            return new RepresentationHolder(this.b, this.representation, selectedBaseUrl, this.a, this.c, this.segmentIndex);
        }

        public long getFirstAvailableSegmentNum(long nowUnixTimeUs) {
            return this.segmentIndex.getFirstAvailableSegmentNum(this.b, nowUnixTimeUs) + this.c;
        }

        public long getFirstSegmentNum() {
            return this.segmentIndex.getFirstSegmentNum() + this.c;
        }

        public long getLastAvailableSegmentNum(long nowUnixTimeUs) {
            return (getFirstAvailableSegmentNum(nowUnixTimeUs) + this.segmentIndex.getAvailableSegmentCount(this.b, nowUnixTimeUs)) - 1;
        }

        public long getSegmentCount() {
            return this.segmentIndex.getSegmentCount(this.b);
        }

        public long getSegmentEndTimeUs(long segmentNum) {
            return getSegmentStartTimeUs(segmentNum) + this.segmentIndex.getDurationUs(segmentNum - this.c, this.b);
        }

        public long getSegmentNum(long positionUs) {
            return this.segmentIndex.getSegmentNum(positionUs, this.b) + this.c;
        }

        public long getSegmentStartTimeUs(long segmentNum) {
            return this.segmentIndex.getTimeUs(segmentNum - this.c);
        }

        public RangedUri getSegmentUrl(long segmentNum) {
            return this.segmentIndex.getSegmentUrl(segmentNum - this.c);
        }

        public boolean isSegmentAvailableAtFullNetworkSpeed(long segmentNum, long nowPeriodTimeUs) {
            return this.segmentIndex.isExplicit() || nowPeriodTimeUs == C.TIME_UNSET || getSegmentEndTimeUs(segmentNum) <= nowPeriodTimeUs;
        }
    }

    public static final class RepresentationSegmentIterator extends BaseMediaChunkIterator {
        private final RepresentationHolder d;
        private final long e;

        public RepresentationSegmentIterator(RepresentationHolder representation, long firstAvailableSegmentNum, long lastAvailableSegmentNum, long nowPeriodTimeUs) {
            super(firstAvailableSegmentNum, lastAvailableSegmentNum);
            this.d = representation;
            this.e = nowPeriodTimeUs;
        }

        @Override // com.google.android.exoplayer2.source.chunk.MediaChunkIterator
        public long getChunkEndTimeUs() {
            checkInBounds();
            return this.d.getSegmentEndTimeUs(getCurrentIndex());
        }

        @Override // com.google.android.exoplayer2.source.chunk.MediaChunkIterator
        public long getChunkStartTimeUs() {
            checkInBounds();
            return this.d.getSegmentStartTimeUs(getCurrentIndex());
        }

        @Override // com.google.android.exoplayer2.source.chunk.MediaChunkIterator
        public DataSpec getDataSpec() {
            checkInBounds();
            long currentIndex = getCurrentIndex();
            RangedUri segmentUrl = this.d.getSegmentUrl(currentIndex);
            int i = this.d.isSegmentAvailableAtFullNetworkSpeed(currentIndex, this.e) ? 0 : 8;
            RepresentationHolder representationHolder = this.d;
            return DashUtil.buildDataSpec(representationHolder.selectedBaseUrl.url, segmentUrl, representationHolder.representation.getCacheKey(), i);
        }
    }

    public DefaultDashChunkSource(ChunkExtractor.Factory chunkExtractorFactory, LoaderErrorThrower manifestLoaderErrorThrower, DashManifest manifest, BaseUrlExclusionList baseUrlExclusionList, int periodIndex, int[] adaptationSetIndices, ExoTrackSelection trackSelection, int trackType, DataSource dataSource, long elapsedRealtimeOffsetMs, int maxSegmentsPerLoad, boolean enableEventMessageTrack, List<Format> closedCaptionFormats, @Nullable PlayerEmsgHandler.PlayerTrackEmsgHandler playerTrackEmsgHandler) {
        this.a = manifestLoaderErrorThrower;
        this.j = manifest;
        this.b = baseUrlExclusionList;
        this.c = adaptationSetIndices;
        this.i = trackSelection;
        this.d = trackType;
        this.e = dataSource;
        this.k = periodIndex;
        this.f = elapsedRealtimeOffsetMs;
        this.g = maxSegmentsPerLoad;
        this.h = playerTrackEmsgHandler;
        long periodDurationUs = manifest.getPeriodDurationUs(periodIndex);
        ArrayList<Representation> arrayListD = d();
        this.representationHolders = new RepresentationHolder[trackSelection.length()];
        int i = 0;
        while (i < this.representationHolders.length) {
            Representation representation = arrayListD.get(trackSelection.getIndexInTrackGroup(i));
            BaseUrl baseUrlSelectBaseUrl = baseUrlExclusionList.selectBaseUrl(representation.baseUrls);
            RepresentationHolder[] representationHolderArr = this.representationHolders;
            if (baseUrlSelectBaseUrl == null) {
                baseUrlSelectBaseUrl = representation.baseUrls.get(0);
            }
            int i2 = i;
            representationHolderArr[i2] = new RepresentationHolder(periodDurationUs, representation, baseUrlSelectBaseUrl, BundledChunkExtractor.FACTORY.createProgressiveMediaExtractor(trackType, representation.format, enableEventMessageTrack, closedCaptionFormats, playerTrackEmsgHandler), 0L, representation.getIndex());
            i = i2 + 1;
        }
    }

    private LoadErrorHandlingPolicy.FallbackOptions a(ExoTrackSelection trackSelection, List<BaseUrl> baseUrls) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        int length = trackSelection.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            if (trackSelection.isBlacklisted(i2, jElapsedRealtime)) {
                i++;
            }
        }
        int priorityCount = BaseUrlExclusionList.getPriorityCount(baseUrls);
        return new LoadErrorHandlingPolicy.FallbackOptions(priorityCount, priorityCount - this.b.getPriorityCountAfterExclusion(baseUrls), length, i);
    }

    private long b(long nowUnixTimeUs, long playbackPositionUs) {
        if (!this.j.dynamic) {
            return C.TIME_UNSET;
        }
        return Math.max(0L, Math.min(c(nowUnixTimeUs), this.representationHolders[0].getSegmentEndTimeUs(this.representationHolders[0].getLastAvailableSegmentNum(nowUnixTimeUs))) - playbackPositionUs);
    }

    private long c(long nowUnixTimeUs) {
        DashManifest dashManifest = this.j;
        long j = dashManifest.availabilityStartTimeMs;
        return j == C.TIME_UNSET ? C.TIME_UNSET : nowUnixTimeUs - C.msToUs(j + dashManifest.getPeriod(this.k).startMs);
    }

    private ArrayList<Representation> d() {
        List<AdaptationSet> list = this.j.getPeriod(this.k).adaptationSets;
        ArrayList<Representation> arrayList = new ArrayList<>();
        for (int i : this.c) {
            arrayList.addAll(list.get(i).representations);
        }
        return arrayList;
    }

    private long e(RepresentationHolder representationHolder, @Nullable MediaChunk previousChunk, long loadPositionUs, long firstAvailableSegmentNum, long lastAvailableSegmentNum) {
        return previousChunk != null ? previousChunk.getNextChunkIndex() : Util.constrainValue(representationHolder.getSegmentNum(loadPositionUs), firstAvailableSegmentNum, lastAvailableSegmentNum);
    }

    @Override // com.google.android.exoplayer2.source.chunk.ChunkSource
    public long getAdjustedSeekPositionUs(long positionUs, SeekParameters seekParameters) {
        for (RepresentationHolder representationHolder : this.representationHolders) {
            if (representationHolder.segmentIndex != null) {
                long segmentNum = representationHolder.getSegmentNum(positionUs);
                long segmentStartTimeUs = representationHolder.getSegmentStartTimeUs(segmentNum);
                long segmentCount = representationHolder.getSegmentCount();
                return seekParameters.resolveSeekPositionUs(positionUs, segmentStartTimeUs, (segmentStartTimeUs >= positionUs || (segmentCount != -1 && segmentNum >= (representationHolder.getFirstSegmentNum() + segmentCount) - 1)) ? segmentStartTimeUs : representationHolder.getSegmentStartTimeUs(segmentNum + 1));
            }
        }
        return positionUs;
    }

    @Override // com.google.android.exoplayer2.source.chunk.ChunkSource
    public void getNextChunk(long playbackPositionUs, long loadPositionUs, List<? extends MediaChunk> queue, ChunkHolder out) {
        int i;
        int i2;
        MediaChunkIterator[] mediaChunkIteratorArr;
        long j;
        DefaultDashChunkSource defaultDashChunkSource = this;
        if (defaultDashChunkSource.l != null) {
            return;
        }
        long j2 = loadPositionUs - playbackPositionUs;
        long jMsToUs = C.msToUs(defaultDashChunkSource.j.availabilityStartTimeMs) + C.msToUs(defaultDashChunkSource.j.getPeriod(defaultDashChunkSource.k).startMs) + loadPositionUs;
        PlayerEmsgHandler.PlayerTrackEmsgHandler playerTrackEmsgHandler = defaultDashChunkSource.h;
        if (playerTrackEmsgHandler == null || !playerTrackEmsgHandler.maybeRefreshManifestBeforeLoadingNextChunk(jMsToUs)) {
            long jMsToUs2 = C.msToUs(Util.getNowUnixTimeMs(defaultDashChunkSource.f));
            long jC = defaultDashChunkSource.c(jMsToUs2);
            MediaChunk mediaChunk = queue.isEmpty() ? null : queue.get(queue.size() - 1);
            int length = defaultDashChunkSource.i.length();
            MediaChunkIterator[] mediaChunkIteratorArr2 = new MediaChunkIterator[length];
            int i3 = 0;
            while (i3 < length) {
                RepresentationHolder representationHolder = defaultDashChunkSource.representationHolders[i3];
                if (representationHolder.segmentIndex == null) {
                    mediaChunkIteratorArr2[i3] = MediaChunkIterator.EMPTY;
                    i = i3;
                    i2 = length;
                    mediaChunkIteratorArr = mediaChunkIteratorArr2;
                    j = jMsToUs2;
                } else {
                    long firstAvailableSegmentNum = representationHolder.getFirstAvailableSegmentNum(jMsToUs2);
                    long lastAvailableSegmentNum = representationHolder.getLastAvailableSegmentNum(jMsToUs2);
                    i = i3;
                    i2 = length;
                    mediaChunkIteratorArr = mediaChunkIteratorArr2;
                    j = jMsToUs2;
                    long jE = e(representationHolder, mediaChunk, loadPositionUs, firstAvailableSegmentNum, lastAvailableSegmentNum);
                    if (jE < firstAvailableSegmentNum) {
                        mediaChunkIteratorArr[i] = MediaChunkIterator.EMPTY;
                    } else {
                        mediaChunkIteratorArr[i] = new RepresentationSegmentIterator(representationHolder, jE, lastAvailableSegmentNum, jC);
                    }
                }
                i3 = i + 1;
                jMsToUs2 = j;
                mediaChunkIteratorArr2 = mediaChunkIteratorArr;
                length = i2;
                defaultDashChunkSource = this;
            }
            long j3 = jMsToUs2;
            defaultDashChunkSource.i.updateSelectedTrack(playbackPositionUs, j2, defaultDashChunkSource.b(jMsToUs2, playbackPositionUs), queue, mediaChunkIteratorArr2);
            RepresentationHolder representationHolder2 = defaultDashChunkSource.representationHolders[defaultDashChunkSource.i.getSelectedIndex()];
            ChunkExtractor chunkExtractor = representationHolder2.a;
            if (chunkExtractor != null) {
                Representation representation = representationHolder2.representation;
                RangedUri initializationUri = chunkExtractor.getSampleFormats() == null ? representation.getInitializationUri() : null;
                RangedUri indexUri = representationHolder2.segmentIndex == null ? representation.getIndexUri() : null;
                if (initializationUri != null || indexUri != null) {
                    out.chunk = newInitializationChunk(representationHolder2, defaultDashChunkSource.e, defaultDashChunkSource.i.getSelectedFormat(), defaultDashChunkSource.i.getSelectionReason(), defaultDashChunkSource.i.getSelectionData(), initializationUri, indexUri);
                    return;
                }
            }
            long j4 = representationHolder2.b;
            long j5 = C.TIME_UNSET;
            boolean z = j4 != C.TIME_UNSET;
            if (representationHolder2.getSegmentCount() == 0) {
                out.endOfStream = z;
                return;
            }
            long firstAvailableSegmentNum2 = representationHolder2.getFirstAvailableSegmentNum(j3);
            long lastAvailableSegmentNum2 = representationHolder2.getLastAvailableSegmentNum(j3);
            boolean z2 = z;
            long jE2 = e(representationHolder2, mediaChunk, loadPositionUs, firstAvailableSegmentNum2, lastAvailableSegmentNum2);
            if (jE2 < firstAvailableSegmentNum2) {
                defaultDashChunkSource.l = new BehindLiveWindowException();
                return;
            }
            if (jE2 > lastAvailableSegmentNum2 || (defaultDashChunkSource.m && jE2 >= lastAvailableSegmentNum2)) {
                out.endOfStream = z2;
                return;
            }
            if (z2 && representationHolder2.getSegmentStartTimeUs(jE2) >= j4) {
                out.endOfStream = true;
                return;
            }
            int iMin = (int) Math.min(defaultDashChunkSource.g, (lastAvailableSegmentNum2 - jE2) + 1);
            if (j4 != C.TIME_UNSET) {
                while (iMin > 1 && representationHolder2.getSegmentStartTimeUs((((long) iMin) + jE2) - 1) >= j4) {
                    iMin--;
                }
            }
            int i4 = iMin;
            if (queue.isEmpty()) {
                j5 = loadPositionUs;
            }
            out.chunk = newMediaChunk(representationHolder2, defaultDashChunkSource.e, defaultDashChunkSource.d, defaultDashChunkSource.i.getSelectedFormat(), defaultDashChunkSource.i.getSelectionReason(), defaultDashChunkSource.i.getSelectionData(), jE2, i4, j5, jC);
        }
    }

    @Override // com.google.android.exoplayer2.source.chunk.ChunkSource
    public int getPreferredQueueSize(long playbackPositionUs, List<? extends MediaChunk> queue) {
        return (this.l != null || this.i.length() < 2) ? queue.size() : this.i.evaluateQueueSize(playbackPositionUs, queue);
    }

    @Override // com.google.android.exoplayer2.source.chunk.ChunkSource
    public void maybeThrowError() throws IOException {
        IOException iOException = this.l;
        if (iOException != null) {
            throw iOException;
        }
        this.a.maybeThrowError();
    }

    public Chunk newInitializationChunk(RepresentationHolder representationHolder, DataSource dataSource, Format trackFormat, int trackSelectionReason, Object trackSelectionData, @Nullable RangedUri initializationUri, RangedUri indexUri) {
        RangedUri rangedUri = initializationUri;
        Representation representation = representationHolder.representation;
        if (rangedUri != null) {
            RangedUri rangedUriAttemptMerge = rangedUri.attemptMerge(indexUri, representationHolder.selectedBaseUrl.url);
            if (rangedUriAttemptMerge != null) {
                rangedUri = rangedUriAttemptMerge;
            }
        } else {
            rangedUri = indexUri;
        }
        return new InitializationChunk(dataSource, DashUtil.buildDataSpec(representationHolder.selectedBaseUrl.url, rangedUri, representation.getCacheKey(), 0), trackFormat, trackSelectionReason, trackSelectionData, representationHolder.a);
    }

    public Chunk newMediaChunk(RepresentationHolder representationHolder, DataSource dataSource, int trackType, Format trackFormat, int trackSelectionReason, Object trackSelectionData, long firstSegmentNum, int maxSegmentCount, long seekTimeUs, long nowPeriodTimeUs) {
        Representation representation = representationHolder.representation;
        long segmentStartTimeUs = representationHolder.getSegmentStartTimeUs(firstSegmentNum);
        RangedUri segmentUrl = representationHolder.getSegmentUrl(firstSegmentNum);
        if (representationHolder.a == null) {
            return new SingleSampleMediaChunk(dataSource, DashUtil.buildDataSpec(representationHolder.selectedBaseUrl.url, segmentUrl, representation.getCacheKey(), representationHolder.isSegmentAvailableAtFullNetworkSpeed(firstSegmentNum, nowPeriodTimeUs) ? 0 : 8), trackFormat, trackSelectionReason, trackSelectionData, segmentStartTimeUs, representationHolder.getSegmentEndTimeUs(firstSegmentNum), firstSegmentNum, trackType, trackFormat);
        }
        int i = 1;
        int i2 = 1;
        while (i < maxSegmentCount) {
            RangedUri rangedUriAttemptMerge = segmentUrl.attemptMerge(representationHolder.getSegmentUrl(((long) i) + firstSegmentNum), representationHolder.selectedBaseUrl.url);
            if (rangedUriAttemptMerge == null) {
                break;
            }
            i2++;
            i++;
            segmentUrl = rangedUriAttemptMerge;
        }
        long j = (((long) i2) + firstSegmentNum) - 1;
        long segmentEndTimeUs = representationHolder.getSegmentEndTimeUs(j);
        long j2 = representationHolder.b;
        return new ContainerMediaChunk(dataSource, DashUtil.buildDataSpec(representationHolder.selectedBaseUrl.url, segmentUrl, representation.getCacheKey(), representationHolder.isSegmentAvailableAtFullNetworkSpeed(j, nowPeriodTimeUs) ? 0 : 8), trackFormat, trackSelectionReason, trackSelectionData, segmentStartTimeUs, segmentEndTimeUs, seekTimeUs, (j2 == C.TIME_UNSET || j2 > segmentEndTimeUs) ? -9223372036854775807L : j2, firstSegmentNum, i2, -representation.presentationTimeOffsetUs, representationHolder.a);
    }

    @Override // com.google.android.exoplayer2.source.chunk.ChunkSource
    public void onChunkLoadCompleted(Chunk chunk) {
        ChunkIndex chunkIndex;
        if (chunk instanceof InitializationChunk) {
            int iIndexOf = this.i.indexOf(((InitializationChunk) chunk).trackFormat);
            RepresentationHolder representationHolder = this.representationHolders[iIndexOf];
            if (representationHolder.segmentIndex == null && (chunkIndex = representationHolder.a.getChunkIndex()) != null) {
                this.representationHolders[iIndexOf] = representationHolder.c(new DashWrappingSegmentIndex(chunkIndex, representationHolder.representation.presentationTimeOffsetUs));
            }
        }
        PlayerEmsgHandler.PlayerTrackEmsgHandler playerTrackEmsgHandler = this.h;
        if (playerTrackEmsgHandler != null) {
            playerTrackEmsgHandler.onChunkLoadCompleted(chunk);
        }
    }

    @Override // com.google.android.exoplayer2.source.chunk.ChunkSource
    public boolean onChunkLoadError(Chunk chunk, boolean cancelable, LoadErrorHandlingPolicy.LoadErrorInfo loadErrorInfo, LoadErrorHandlingPolicy loadErrorHandlingPolicy) {
        LoadErrorHandlingPolicy.FallbackSelection fallbackSelectionFor;
        int i = 0;
        if (!cancelable) {
            return false;
        }
        PlayerEmsgHandler.PlayerTrackEmsgHandler playerTrackEmsgHandler = this.h;
        if (playerTrackEmsgHandler != null && playerTrackEmsgHandler.onChunkLoadError(chunk)) {
            return true;
        }
        if (!this.j.dynamic && (chunk instanceof MediaChunk)) {
            IOException iOException = loadErrorInfo.exception;
            if ((iOException instanceof HttpDataSource.InvalidResponseCodeException) && ((HttpDataSource.InvalidResponseCodeException) iOException).responseCode == 404) {
                RepresentationHolder representationHolder = this.representationHolders[this.i.indexOf(chunk.trackFormat)];
                long segmentCount = representationHolder.getSegmentCount();
                if (segmentCount != -1 && segmentCount != 0) {
                    if (((MediaChunk) chunk).getNextChunkIndex() > (representationHolder.getFirstSegmentNum() + segmentCount) - 1) {
                        this.m = true;
                        return true;
                    }
                }
            }
        }
        int iIndexOf = this.i.indexOf(chunk.trackFormat);
        RepresentationHolder representationHolder2 = this.representationHolders[iIndexOf];
        LoadErrorHandlingPolicy.FallbackOptions fallbackOptionsA = a(this.i, representationHolder2.representation.baseUrls);
        if ((!fallbackOptionsA.isFallbackAvailable(2) && !fallbackOptionsA.isFallbackAvailable(1)) || (fallbackSelectionFor = loadErrorHandlingPolicy.getFallbackSelectionFor(fallbackOptionsA, loadErrorInfo)) == null) {
            return false;
        }
        int i2 = fallbackSelectionFor.type;
        if (i2 == 2) {
            ExoTrackSelection exoTrackSelection = this.i;
            return exoTrackSelection.blacklist(exoTrackSelection.indexOf(chunk.trackFormat), fallbackSelectionFor.exclusionDurationMs);
        }
        if (i2 != 1) {
            return false;
        }
        this.b.exclude(representationHolder2.selectedBaseUrl, fallbackSelectionFor.exclusionDurationMs);
        boolean z = false;
        while (true) {
            RepresentationHolder[] representationHolderArr = this.representationHolders;
            if (i >= representationHolderArr.length) {
                return z;
            }
            BaseUrl baseUrlSelectBaseUrl = this.b.selectBaseUrl(representationHolderArr[i].representation.baseUrls);
            if (baseUrlSelectBaseUrl != null) {
                if (i == iIndexOf) {
                    z = true;
                }
                RepresentationHolder[] representationHolderArr2 = this.representationHolders;
                representationHolderArr2[i] = representationHolderArr2[i].d(baseUrlSelectBaseUrl);
            }
            i++;
        }
    }

    @Override // com.google.android.exoplayer2.source.chunk.ChunkSource
    public void release() {
        for (RepresentationHolder representationHolder : this.representationHolders) {
            ChunkExtractor chunkExtractor = representationHolder.a;
            if (chunkExtractor != null) {
                chunkExtractor.release();
            }
        }
    }

    @Override // com.google.android.exoplayer2.source.chunk.ChunkSource
    public boolean shouldCancelLoad(long playbackPositionUs, Chunk loadingChunk, List<? extends MediaChunk> queue) {
        if (this.l != null) {
            return false;
        }
        return this.i.shouldCancelChunkLoad(playbackPositionUs, loadingChunk, queue);
    }

    @Override // com.google.android.exoplayer2.source.dash.DashChunkSource
    public void updateManifest(DashManifest newManifest, int newPeriodIndex) {
        try {
            this.j = newManifest;
            this.k = newPeriodIndex;
            long periodDurationUs = newManifest.getPeriodDurationUs(newPeriodIndex);
            ArrayList<Representation> arrayListD = d();
            for (int i = 0; i < this.representationHolders.length; i++) {
                Representation representation = arrayListD.get(this.i.getIndexInTrackGroup(i));
                RepresentationHolder[] representationHolderArr = this.representationHolders;
                representationHolderArr[i] = representationHolderArr[i].b(periodDurationUs, representation);
            }
        } catch (BehindLiveWindowException e) {
            this.l = e;
        }
    }

    @Override // com.google.android.exoplayer2.source.dash.DashChunkSource
    public void updateTrackSelection(ExoTrackSelection trackSelection) {
        this.i = trackSelection;
    }
}
