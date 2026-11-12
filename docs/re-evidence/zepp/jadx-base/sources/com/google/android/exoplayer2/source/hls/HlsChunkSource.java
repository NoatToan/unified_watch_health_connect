package com.google.android.exoplayer2.source.hls;

import android.net.Uri;
import android.os.SystemClock;
import android.util.Pair;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.source.BehindLiveWindowException;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.chunk.BaseMediaChunkIterator;
import com.google.android.exoplayer2.source.chunk.Chunk;
import com.google.android.exoplayer2.source.chunk.DataChunk;
import com.google.android.exoplayer2.source.chunk.MediaChunk;
import com.google.android.exoplayer2.source.chunk.MediaChunkIterator;
import com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist;
import com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker;
import com.google.android.exoplayer2.trackselection.BaseTrackSelection;
import com.google.android.exoplayer2.trackselection.ExoTrackSelection;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.TransferListener;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.UriUtil;
import com.google.android.exoplayer2.util.Util;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;
import com.google.common.primitives.Ints;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
class HlsChunkSource {
    public static final int s = 0;
    public static final int t = 1;
    public static final int u = 2;
    private static final int v = 4;
    private final HlsExtractorFactory a;
    private final DataSource b;
    private final DataSource c;
    private final TimestampAdjusterProvider d;
    private final Uri[] e;
    private final Format[] f;
    private final HlsPlaylistTracker g;
    private final TrackGroup h;

    @Nullable
    private final List<Format> i;
    private boolean k;

    @Nullable
    private IOException m;

    @Nullable
    private Uri n;
    private boolean o;
    private ExoTrackSelection p;
    private boolean r;
    private final com.google.android.exoplayer2.source.hls.b j = new com.google.android.exoplayer2.source.hls.b(4);
    private byte[] l = Util.EMPTY_BYTE_ARRAY;
    private long q = C.TIME_UNSET;

    public static final class HlsChunkHolder {

        @Nullable
        public Chunk chunk;
        public boolean endOfStream;

        @Nullable
        public Uri playlistUrl;

        public HlsChunkHolder() {
            clear();
        }

        public void clear() {
            this.chunk = null;
            this.endOfStream = false;
            this.playlistUrl = null;
        }
    }

    public static final class a extends DataChunk {
        private byte[] d;

        public a(DataSource dataSource, DataSpec dataSpec, Format trackFormat, int trackSelectionReason, @Nullable Object trackSelectionData, byte[] scratchSpace) {
            super(dataSource, dataSpec, 3, trackFormat, trackSelectionReason, trackSelectionData, scratchSpace);
        }

        @Nullable
        public byte[] b() {
            return this.d;
        }

        @Override // com.google.android.exoplayer2.source.chunk.DataChunk
        public void consume(byte[] data, int limit) {
            this.d = Arrays.copyOf(data, limit);
        }
    }

    @VisibleForTesting
    public static final class b extends BaseMediaChunkIterator {
        private final List<HlsMediaPlaylist.SegmentBase> d;
        private final long e;
        private final String f;

        public b(String playlistBaseUri, long startOfPlaylistInPeriodUs, List<HlsMediaPlaylist.SegmentBase> segmentBases) {
            super(0L, segmentBases.size() - 1);
            this.f = playlistBaseUri;
            this.e = startOfPlaylistInPeriodUs;
            this.d = segmentBases;
        }

        @Override // com.google.android.exoplayer2.source.chunk.MediaChunkIterator
        public long getChunkEndTimeUs() {
            checkInBounds();
            HlsMediaPlaylist.SegmentBase segmentBase = this.d.get((int) getCurrentIndex());
            return this.e + segmentBase.relativeStartTimeUs + segmentBase.durationUs;
        }

        @Override // com.google.android.exoplayer2.source.chunk.MediaChunkIterator
        public long getChunkStartTimeUs() {
            checkInBounds();
            return this.e + this.d.get((int) getCurrentIndex()).relativeStartTimeUs;
        }

        @Override // com.google.android.exoplayer2.source.chunk.MediaChunkIterator
        public DataSpec getDataSpec() {
            checkInBounds();
            HlsMediaPlaylist.SegmentBase segmentBase = this.d.get((int) getCurrentIndex());
            return new DataSpec(UriUtil.resolveToUri(this.f, segmentBase.url), segmentBase.byteRangeOffset, segmentBase.byteRangeLength);
        }
    }

    public static final class c extends BaseTrackSelection {
        private int e;

        public c(TrackGroup group, int[] tracks) {
            super(group, tracks);
            this.e = indexOf(group.getFormat(tracks[0]));
        }

        @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
        public int getSelectedIndex() {
            return this.e;
        }

        @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
        @Nullable
        public Object getSelectionData() {
            return null;
        }

        @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
        public int getSelectionReason() {
            return 0;
        }

        @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
        public void updateSelectedTrack(long playbackPositionUs, long bufferedDurationUs, long availableDurationUs, List<? extends MediaChunk> queue, MediaChunkIterator[] mediaChunkIterators) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (isBlacklisted(this.e, jElapsedRealtime)) {
                for (int i = this.length - 1; i >= 0; i--) {
                    if (!isBlacklisted(i, jElapsedRealtime)) {
                        this.e = i;
                        return;
                    }
                }
                throw new IllegalStateException();
            }
        }
    }

    public static final class d {
        public final HlsMediaPlaylist.SegmentBase a;
        public final long b;
        public final int c;
        public final boolean d;

        public d(HlsMediaPlaylist.SegmentBase segmentBase, long mediaSequence, int partIndex) {
            this.a = segmentBase;
            this.b = mediaSequence;
            this.c = partIndex;
            this.d = (segmentBase instanceof HlsMediaPlaylist.Part) && ((HlsMediaPlaylist.Part) segmentBase).isPreload;
        }
    }

    public HlsChunkSource(HlsExtractorFactory extractorFactory, HlsPlaylistTracker playlistTracker, Uri[] playlistUrls, Format[] playlistFormats, HlsDataSourceFactory dataSourceFactory, @Nullable TransferListener mediaTransferListener, TimestampAdjusterProvider timestampAdjusterProvider, @Nullable List<Format> muxedCaptionFormats) {
        this.a = extractorFactory;
        this.g = playlistTracker;
        this.e = playlistUrls;
        this.f = playlistFormats;
        this.d = timestampAdjusterProvider;
        this.i = muxedCaptionFormats;
        DataSource dataSourceCreateDataSource = dataSourceFactory.createDataSource(1);
        this.b = dataSourceCreateDataSource;
        if (mediaTransferListener != null) {
            dataSourceCreateDataSource.addTransferListener(mediaTransferListener);
        }
        this.c = dataSourceFactory.createDataSource(3);
        this.h = new TrackGroup(playlistFormats);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < playlistUrls.length; i++) {
            if ((playlistFormats[i].roleFlags & 16384) == 0) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        this.p = new c(this.h, Ints.toArray(arrayList));
    }

    @Nullable
    private static Uri c(HlsMediaPlaylist playlist, @Nullable HlsMediaPlaylist.SegmentBase segmentBase) {
        String str;
        if (segmentBase == null || (str = segmentBase.fullSegmentEncryptionKeyUri) == null) {
            return null;
        }
        return UriUtil.resolveToUri(playlist.baseUri, str);
    }

    private Pair<Long, Integer> e(@Nullable com.google.android.exoplayer2.source.hls.c previous, boolean switchingTrack, HlsMediaPlaylist mediaPlaylist, long startOfPlaylistInPeriodUs, long loadPositionUs) {
        int i = -1;
        if (previous != null && !switchingTrack) {
            if (!previous.isLoadCompleted()) {
                return new Pair<>(Long.valueOf(previous.chunkIndex), Integer.valueOf(previous.e));
            }
            Long lValueOf = Long.valueOf(previous.e == -1 ? previous.getNextChunkIndex() : previous.chunkIndex);
            int i2 = previous.e;
            return new Pair<>(lValueOf, Integer.valueOf(i2 != -1 ? i2 + 1 : -1));
        }
        long j = mediaPlaylist.durationUs + startOfPlaylistInPeriodUs;
        if (previous != null && !this.o) {
            loadPositionUs = previous.startTimeUs;
        }
        if (!mediaPlaylist.hasEndTag && loadPositionUs >= j) {
            return new Pair<>(Long.valueOf(mediaPlaylist.mediaSequence + ((long) mediaPlaylist.segments.size())), -1);
        }
        long j2 = loadPositionUs - startOfPlaylistInPeriodUs;
        int iBinarySearchFloor = Util.binarySearchFloor((List<? extends Comparable<? super Long>>) mediaPlaylist.segments, Long.valueOf(j2), true, !this.g.isLive() || previous == null);
        long j3 = ((long) iBinarySearchFloor) + mediaPlaylist.mediaSequence;
        if (iBinarySearchFloor >= 0) {
            HlsMediaPlaylist.Segment segment = mediaPlaylist.segments.get(iBinarySearchFloor);
            List<HlsMediaPlaylist.Part> list = j2 < segment.relativeStartTimeUs + segment.durationUs ? segment.parts : mediaPlaylist.trailingParts;
            for (int i3 = 0; i3 < list.size(); i3++) {
                HlsMediaPlaylist.Part part = list.get(i3);
                if (j2 < part.relativeStartTimeUs + part.durationUs) {
                    if (!part.isIndependent) {
                        break;
                    }
                    j3 += list == mediaPlaylist.trailingParts ? 1L : 0L;
                    i = i3;
                    break;
                }
            }
        }
        return new Pair<>(Long.valueOf(j3), Integer.valueOf(i));
    }

    @Nullable
    private static d f(HlsMediaPlaylist mediaPlaylist, long nextMediaSequence, int nextPartIndex) {
        int i = (int) (nextMediaSequence - mediaPlaylist.mediaSequence);
        if (i == mediaPlaylist.segments.size()) {
            if (nextPartIndex == -1) {
                nextPartIndex = 0;
            }
            if (nextPartIndex < mediaPlaylist.trailingParts.size()) {
                return new d(mediaPlaylist.trailingParts.get(nextPartIndex), nextMediaSequence, nextPartIndex);
            }
            return null;
        }
        HlsMediaPlaylist.Segment segment = mediaPlaylist.segments.get(i);
        if (nextPartIndex == -1) {
            return new d(segment, nextMediaSequence, -1);
        }
        if (nextPartIndex < segment.parts.size()) {
            return new d(segment.parts.get(nextPartIndex), nextMediaSequence, nextPartIndex);
        }
        int i2 = i + 1;
        if (i2 < mediaPlaylist.segments.size()) {
            return new d(mediaPlaylist.segments.get(i2), nextMediaSequence + 1, -1);
        }
        if (mediaPlaylist.trailingParts.isEmpty()) {
            return null;
        }
        return new d(mediaPlaylist.trailingParts.get(0), nextMediaSequence + 1, 0);
    }

    @VisibleForTesting
    public static List<HlsMediaPlaylist.SegmentBase> h(HlsMediaPlaylist playlist, long mediaSequence, int partIndex) {
        int i = (int) (mediaSequence - playlist.mediaSequence);
        if (i < 0 || playlist.segments.size() < i) {
            return ImmutableList.of();
        }
        ArrayList arrayList = new ArrayList();
        if (i < playlist.segments.size()) {
            if (partIndex != -1) {
                HlsMediaPlaylist.Segment segment = playlist.segments.get(i);
                if (partIndex == 0) {
                    arrayList.add(segment);
                } else if (partIndex < segment.parts.size()) {
                    List<HlsMediaPlaylist.Part> list = segment.parts;
                    arrayList.addAll(list.subList(partIndex, list.size()));
                }
                i++;
            }
            List<HlsMediaPlaylist.Segment> list2 = playlist.segments;
            arrayList.addAll(list2.subList(i, list2.size()));
            partIndex = 0;
        }
        if (playlist.partTargetDurationUs != C.TIME_UNSET) {
            int i2 = partIndex != -1 ? partIndex : 0;
            if (i2 < playlist.trailingParts.size()) {
                List<HlsMediaPlaylist.Part> list3 = playlist.trailingParts;
                arrayList.addAll(list3.subList(i2, list3.size()));
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    @Nullable
    private Chunk k(@Nullable Uri keyUri, int selectedTrackIndex) {
        if (keyUri == null) {
            return null;
        }
        byte[] bArrD = this.j.d(keyUri);
        if (bArrD != null) {
            this.j.c(keyUri, bArrD);
            return null;
        }
        return new a(this.c, new DataSpec.Builder().setUri(keyUri).setFlags(1).build(), this.f[selectedTrackIndex], this.p.getSelectionReason(), this.p.getSelectionData(), this.l);
    }

    private long r(long playbackPositionUs) {
        long j = this.q;
        return (j > C.TIME_UNSET ? 1 : (j == C.TIME_UNSET ? 0 : -1)) != 0 ? j - playbackPositionUs : C.TIME_UNSET;
    }

    private void v(HlsMediaPlaylist mediaPlaylist) {
        this.q = mediaPlaylist.hasEndTag ? C.TIME_UNSET : mediaPlaylist.getEndTimeUs() - this.g.getInitialStartTimeUs();
    }

    public MediaChunkIterator[] a(@Nullable com.google.android.exoplayer2.source.hls.c previous, long loadPositionUs) {
        int i;
        int iIndexOf = previous == null ? -1 : this.h.indexOf(previous.trackFormat);
        int length = this.p.length();
        MediaChunkIterator[] mediaChunkIteratorArr = new MediaChunkIterator[length];
        boolean z = false;
        int i2 = 0;
        while (i2 < length) {
            int indexInTrackGroup = this.p.getIndexInTrackGroup(i2);
            Uri uri = this.e[indexInTrackGroup];
            if (this.g.isSnapshotValid(uri)) {
                HlsMediaPlaylist playlistSnapshot = this.g.getPlaylistSnapshot(uri, z);
                Assertions.checkNotNull(playlistSnapshot);
                long initialStartTimeUs = playlistSnapshot.startTimeUs - this.g.getInitialStartTimeUs();
                i = i2;
                Pair<Long, Integer> pairE = e(previous, indexInTrackGroup != iIndexOf, playlistSnapshot, initialStartTimeUs, loadPositionUs);
                mediaChunkIteratorArr[i] = new b(playlistSnapshot.baseUri, initialStartTimeUs, h(playlistSnapshot, ((Long) pairE.first).longValue(), ((Integer) pairE.second).intValue()));
            } else {
                mediaChunkIteratorArr[i2] = MediaChunkIterator.EMPTY;
                i = i2;
            }
            i2 = i + 1;
            z = false;
        }
        return mediaChunkIteratorArr;
    }

    public int b(com.google.android.exoplayer2.source.hls.c mediaChunk) {
        if (mediaChunk.e == -1) {
            return 1;
        }
        HlsMediaPlaylist hlsMediaPlaylist = (HlsMediaPlaylist) Assertions.checkNotNull(this.g.getPlaylistSnapshot(this.e[this.h.indexOf(mediaChunk.trackFormat)], false));
        int i = (int) (mediaChunk.chunkIndex - hlsMediaPlaylist.mediaSequence);
        if (i < 0) {
            return 1;
        }
        List<HlsMediaPlaylist.Part> list = i < hlsMediaPlaylist.segments.size() ? hlsMediaPlaylist.segments.get(i).parts : hlsMediaPlaylist.trailingParts;
        if (mediaChunk.e >= list.size()) {
            return 2;
        }
        HlsMediaPlaylist.Part part = list.get(mediaChunk.e);
        if (part.isPreload) {
            return 0;
        }
        return Util.areEqual(Uri.parse(UriUtil.resolve(hlsMediaPlaylist.baseUri, part.url)), mediaChunk.dataSpec.uri) ? 1 : 2;
    }

    public void d(long playbackPositionUs, long loadPositionUs, List<com.google.android.exoplayer2.source.hls.c> queue, boolean allowEndOfStream, HlsChunkHolder out) {
        HlsMediaPlaylist hlsMediaPlaylist;
        long initialStartTimeUs;
        Uri uri;
        int i;
        com.google.android.exoplayer2.source.hls.c cVar = queue.isEmpty() ? null : (com.google.android.exoplayer2.source.hls.c) Iterables.getLast(queue);
        int iIndexOf = cVar == null ? -1 : this.h.indexOf(cVar.trackFormat);
        long jMax = loadPositionUs - playbackPositionUs;
        long jR = r(playbackPositionUs);
        if (cVar != null && !this.o) {
            long durationUs = cVar.getDurationUs();
            jMax = Math.max(0L, jMax - durationUs);
            if (jR != C.TIME_UNSET) {
                jR = Math.max(0L, jR - durationUs);
            }
        }
        this.p.updateSelectedTrack(playbackPositionUs, jMax, jR, queue, a(cVar, loadPositionUs));
        int selectedIndexInTrackGroup = this.p.getSelectedIndexInTrackGroup();
        boolean z = iIndexOf != selectedIndexInTrackGroup;
        Uri uri2 = this.e[selectedIndexInTrackGroup];
        if (!this.g.isSnapshotValid(uri2)) {
            out.playlistUrl = uri2;
            this.r &= uri2.equals(this.n);
            this.n = uri2;
            return;
        }
        HlsMediaPlaylist playlistSnapshot = this.g.getPlaylistSnapshot(uri2, true);
        Assertions.checkNotNull(playlistSnapshot);
        this.o = playlistSnapshot.hasIndependentSegments;
        v(playlistSnapshot);
        long initialStartTimeUs2 = playlistSnapshot.startTimeUs - this.g.getInitialStartTimeUs();
        Pair<Long, Integer> pairE = e(cVar, z, playlistSnapshot, initialStartTimeUs2, loadPositionUs);
        long jLongValue = ((Long) pairE.first).longValue();
        int iIntValue = ((Integer) pairE.second).intValue();
        if (jLongValue >= playlistSnapshot.mediaSequence || cVar == null || !z) {
            hlsMediaPlaylist = playlistSnapshot;
            initialStartTimeUs = initialStartTimeUs2;
            uri = uri2;
            i = selectedIndexInTrackGroup;
        } else {
            Uri uri3 = this.e[iIndexOf];
            HlsMediaPlaylist playlistSnapshot2 = this.g.getPlaylistSnapshot(uri3, true);
            Assertions.checkNotNull(playlistSnapshot2);
            initialStartTimeUs = playlistSnapshot2.startTimeUs - this.g.getInitialStartTimeUs();
            Pair<Long, Integer> pairE2 = e(cVar, false, playlistSnapshot2, initialStartTimeUs, loadPositionUs);
            jLongValue = ((Long) pairE2.first).longValue();
            iIntValue = ((Integer) pairE2.second).intValue();
            i = iIndexOf;
            uri = uri3;
            hlsMediaPlaylist = playlistSnapshot2;
        }
        if (jLongValue < hlsMediaPlaylist.mediaSequence) {
            this.m = new BehindLiveWindowException();
            return;
        }
        d dVarF = f(hlsMediaPlaylist, jLongValue, iIntValue);
        if (dVarF == null) {
            if (!hlsMediaPlaylist.hasEndTag) {
                out.playlistUrl = uri;
                this.r &= uri.equals(this.n);
                this.n = uri;
                return;
            } else {
                if (allowEndOfStream || hlsMediaPlaylist.segments.isEmpty()) {
                    out.endOfStream = true;
                    return;
                }
                dVarF = new d((HlsMediaPlaylist.SegmentBase) Iterables.getLast(hlsMediaPlaylist.segments), (hlsMediaPlaylist.mediaSequence + ((long) hlsMediaPlaylist.segments.size())) - 1, -1);
            }
        }
        this.r = false;
        this.n = null;
        Uri uriC = c(hlsMediaPlaylist, dVarF.a.initializationSegment);
        Chunk chunkK = k(uriC, i);
        out.chunk = chunkK;
        if (chunkK != null) {
            return;
        }
        Uri uriC2 = c(hlsMediaPlaylist, dVarF.a);
        Chunk chunkK2 = k(uriC2, i);
        out.chunk = chunkK2;
        if (chunkK2 != null) {
            return;
        }
        boolean zN = com.google.android.exoplayer2.source.hls.c.n(cVar, uri, hlsMediaPlaylist, dVarF, initialStartTimeUs);
        if (zN && dVarF.d) {
            return;
        }
        out.chunk = com.google.android.exoplayer2.source.hls.c.b(this.a, this.b, this.f[i], initialStartTimeUs, hlsMediaPlaylist, dVarF, uri, this.i, this.p.getSelectionReason(), this.p.getSelectionData(), this.k, this.d, cVar, this.j.b(uriC2), this.j.b(uriC), zN);
    }

    public int g(long playbackPositionUs, List<? extends MediaChunk> queue) {
        return (this.m != null || this.p.length() < 2) ? queue.size() : this.p.evaluateQueueSize(playbackPositionUs, queue);
    }

    public TrackGroup i() {
        return this.h;
    }

    public ExoTrackSelection j() {
        return this.p;
    }

    public boolean l(Chunk chunk, long exclusionDurationMs) {
        ExoTrackSelection exoTrackSelection = this.p;
        return exoTrackSelection.blacklist(exoTrackSelection.indexOf(this.h.indexOf(chunk.trackFormat)), exclusionDurationMs);
    }

    public void m() throws IOException {
        IOException iOException = this.m;
        if (iOException != null) {
            throw iOException;
        }
        Uri uri = this.n;
        if (uri == null || !this.r) {
            return;
        }
        this.g.maybeThrowPlaylistRefreshError(uri);
    }

    public boolean n(Uri playlistUrl) {
        return Util.contains(this.e, playlistUrl);
    }

    public void o(Chunk chunk) {
        if (chunk instanceof a) {
            a aVar = (a) chunk;
            this.l = aVar.getDataHolder();
            this.j.c(aVar.dataSpec.uri, (byte[]) Assertions.checkNotNull(aVar.b()));
        }
    }

    public boolean p(Uri playlistUrl, long exclusionDurationMs) {
        int iIndexOf;
        int i = 0;
        while (true) {
            Uri[] uriArr = this.e;
            if (i >= uriArr.length) {
                i = -1;
                break;
            }
            if (uriArr[i].equals(playlistUrl)) {
                break;
            }
            i++;
        }
        if (i == -1 || (iIndexOf = this.p.indexOf(i)) == -1) {
            return true;
        }
        this.r |= playlistUrl.equals(this.n);
        return exclusionDurationMs == C.TIME_UNSET || (this.p.blacklist(iIndexOf, exclusionDurationMs) && this.g.excludeMediaPlaylist(playlistUrl, exclusionDurationMs));
    }

    public void q() {
        this.m = null;
    }

    public void s(boolean isTimestampMaster) {
        this.k = isTimestampMaster;
    }

    public void t(ExoTrackSelection trackSelection) {
        this.p = trackSelection;
    }

    public boolean u(long playbackPositionUs, Chunk loadingChunk, List<? extends MediaChunk> queue) {
        if (this.m != null) {
            return false;
        }
        return this.p.shouldCancelChunkLoad(playbackPositionUs, loadingChunk, queue);
    }
}
