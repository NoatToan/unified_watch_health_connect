package com.google.android.exoplayer2.source.hls;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.extractor.DefaultExtractorInput;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.id3.Id3Decoder;
import com.google.android.exoplayer2.metadata.id3.PrivFrame;
import com.google.android.exoplayer2.source.chunk.MediaChunk;
import com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.TimestampAdjuster;
import com.google.android.exoplayer2.util.UriUtil;
import com.google.android.exoplayer2.util.Util;
import com.google.common.base.Ascii;
import com.google.common.collect.ImmutableList;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.math.BigInteger;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: loaded from: classes3.dex */
final class c extends MediaChunk {
    public static final String B = "com.apple.streaming.transportStreamTimestamp";
    private static final AtomicInteger C = new AtomicInteger();
    private boolean A;
    public final int a;
    public final int b;
    public final Uri c;
    public final boolean d;
    public final int e;

    @Nullable
    private final DataSource f;

    @Nullable
    private final DataSpec g;

    @Nullable
    private final HlsMediaChunkExtractor h;
    private final boolean i;
    private final boolean j;
    private final TimestampAdjuster k;
    private final HlsExtractorFactory l;

    @Nullable
    private final List<Format> m;

    @Nullable
    private final DrmInitData n;
    private final Id3Decoder o;
    private final ParsableByteArray p;
    private final boolean q;
    private final boolean r;
    private HlsMediaChunkExtractor s;
    private HlsSampleStreamWrapper t;
    private int u;
    private boolean v;
    private volatile boolean w;
    private boolean x;
    private ImmutableList<Integer> y;
    private boolean z;

    private c(HlsExtractorFactory extractorFactory, DataSource mediaDataSource, DataSpec dataSpec, Format format, boolean mediaSegmentEncrypted, @Nullable DataSource initDataSource, @Nullable DataSpec initDataSpec, boolean initSegmentEncrypted, Uri playlistUrl, @Nullable List<Format> muxedCaptionFormats, int trackSelectionReason, @Nullable Object trackSelectionData, long startTimeUs, long endTimeUs, long chunkMediaSequence, int partIndex, boolean isPublished, int discontinuitySequenceNumber, boolean hasGapTag, boolean isMasterTimestampSource, TimestampAdjuster timestampAdjuster, @Nullable DrmInitData drmInitData, @Nullable HlsMediaChunkExtractor previousExtractor, Id3Decoder id3Decoder, ParsableByteArray scratchId3Data, boolean shouldSpliceIn) {
        super(mediaDataSource, dataSpec, format, trackSelectionReason, trackSelectionData, startTimeUs, endTimeUs, chunkMediaSequence);
        this.q = mediaSegmentEncrypted;
        this.e = partIndex;
        this.A = isPublished;
        this.b = discontinuitySequenceNumber;
        this.g = initDataSpec;
        this.f = initDataSource;
        this.v = initDataSpec != null;
        this.r = initSegmentEncrypted;
        this.c = playlistUrl;
        this.i = isMasterTimestampSource;
        this.k = timestampAdjuster;
        this.j = hasGapTag;
        this.l = extractorFactory;
        this.m = muxedCaptionFormats;
        this.n = drmInitData;
        this.h = previousExtractor;
        this.o = id3Decoder;
        this.p = scratchId3Data;
        this.d = shouldSpliceIn;
        this.y = ImmutableList.of();
        this.a = C.getAndIncrement();
    }

    private static DataSource a(DataSource dataSource, @Nullable byte[] fullSegmentEncryptionKey, @Nullable byte[] encryptionIv) {
        if (fullSegmentEncryptionKey == null) {
            return dataSource;
        }
        Assertions.checkNotNull(encryptionIv);
        return new a(dataSource, fullSegmentEncryptionKey, encryptionIv);
    }

    public static c b(HlsExtractorFactory extractorFactory, DataSource dataSource, Format format, long startOfPlaylistInPeriodUs, HlsMediaPlaylist mediaPlaylist, HlsChunkSource.d segmentBaseHolder, Uri playlistUrl, @Nullable List<Format> muxedCaptionFormats, int trackSelectionReason, @Nullable Object trackSelectionData, boolean isMasterTimestampSource, TimestampAdjusterProvider timestampAdjusterProvider, @Nullable c previousChunk, @Nullable byte[] mediaSegmentKey, @Nullable byte[] initSegmentKey, boolean shouldSpliceIn) {
        DataSource dataSourceA;
        DataSpec dataSpec;
        boolean z;
        Id3Decoder id3Decoder;
        ParsableByteArray parsableByteArray;
        HlsMediaChunkExtractor hlsMediaChunkExtractor;
        HlsMediaPlaylist.SegmentBase segmentBase = segmentBaseHolder.a;
        DataSpec dataSpecBuild = new DataSpec.Builder().setUri(UriUtil.resolveToUri(mediaPlaylist.baseUri, segmentBase.url)).setPosition(segmentBase.byteRangeOffset).setLength(segmentBase.byteRangeLength).setFlags(segmentBaseHolder.d ? 8 : 0).build();
        boolean z2 = mediaSegmentKey != null;
        DataSource dataSourceA2 = a(dataSource, mediaSegmentKey, z2 ? d((String) Assertions.checkNotNull(segmentBase.encryptionIV)) : null);
        HlsMediaPlaylist.Segment segment = segmentBase.initializationSegment;
        if (segment != null) {
            boolean z3 = initSegmentKey != null;
            byte[] bArrD = z3 ? d((String) Assertions.checkNotNull(segment.encryptionIV)) : null;
            dataSpec = new DataSpec(UriUtil.resolveToUri(mediaPlaylist.baseUri, segment.url), segment.byteRangeOffset, segment.byteRangeLength);
            dataSourceA = a(dataSource, initSegmentKey, bArrD);
            z = z3;
        } else {
            dataSourceA = null;
            dataSpec = null;
            z = false;
        }
        long j = startOfPlaylistInPeriodUs + segmentBase.relativeStartTimeUs;
        long j2 = j + segmentBase.durationUs;
        int i = mediaPlaylist.discontinuitySequence + segmentBase.relativeDiscontinuitySequence;
        if (previousChunk != null) {
            DataSpec dataSpec2 = previousChunk.g;
            boolean z4 = dataSpec == dataSpec2 || (dataSpec != null && dataSpec2 != null && dataSpec.uri.equals(dataSpec2.uri) && dataSpec.position == previousChunk.g.position);
            boolean z5 = playlistUrl.equals(previousChunk.c) && previousChunk.x;
            id3Decoder = previousChunk.o;
            parsableByteArray = previousChunk.p;
            hlsMediaChunkExtractor = (z4 && z5 && !previousChunk.z && previousChunk.b == i) ? previousChunk.s : null;
        } else {
            id3Decoder = new Id3Decoder();
            parsableByteArray = new ParsableByteArray(10);
            hlsMediaChunkExtractor = null;
        }
        return new c(extractorFactory, dataSourceA2, dataSpecBuild, format, z2, dataSourceA, dataSpec, z, playlistUrl, muxedCaptionFormats, trackSelectionReason, trackSelectionData, j, j2, segmentBaseHolder.b, segmentBaseHolder.c, !segmentBaseHolder.d, i, segmentBase.hasGapTag, isMasterTimestampSource, timestampAdjusterProvider.getAdjuster(i), segmentBase.drmInitData, hlsMediaChunkExtractor, id3Decoder, parsableByteArray, shouldSpliceIn);
    }

    @RequiresNonNull({"output"})
    private void c(DataSource dataSource, DataSpec dataSpec, boolean dataIsEncrypted) throws IOException {
        DataSpec dataSpecSubrange;
        long position;
        long j;
        boolean z = false;
        if (dataIsEncrypted) {
            z = this.u != 0;
            dataSpecSubrange = dataSpec;
        } else {
            dataSpecSubrange = dataSpec.subrange(this.u);
        }
        try {
            DefaultExtractorInput defaultExtractorInputL = l(dataSource, dataSpecSubrange);
            if (z) {
                defaultExtractorInputL.skipFully(this.u);
            }
            while (!this.w && this.s.read(defaultExtractorInputL)) {
                try {
                    try {
                    } catch (EOFException e) {
                        if ((this.trackFormat.roleFlags & 16384) == 0) {
                            throw e;
                        }
                        this.s.onTruncatedSegmentParsed();
                        position = defaultExtractorInputL.getPosition();
                        j = dataSpec.position;
                    }
                } catch (Throwable th) {
                    this.u = (int) (defaultExtractorInputL.getPosition() - dataSpec.position);
                    throw th;
                }
            }
            position = defaultExtractorInputL.getPosition();
            j = dataSpec.position;
            this.u = (int) (position - j);
            Util.closeQuietly(dataSource);
        } catch (Throwable th2) {
            Util.closeQuietly(dataSource);
            throw th2;
        }
    }

    private static byte[] d(String ivString) {
        if (Ascii.toLowerCase(ivString).startsWith("0x")) {
            ivString = ivString.substring(2);
        }
        byte[] byteArray = new BigInteger(ivString, 16).toByteArray();
        byte[] bArr = new byte[16];
        int length = byteArray.length > 16 ? byteArray.length - 16 : 0;
        System.arraycopy(byteArray, length, bArr, (16 - byteArray.length) + length, byteArray.length - length);
        return bArr;
    }

    private static boolean g(HlsChunkSource.d segmentBaseHolder, HlsMediaPlaylist mediaPlaylist) {
        HlsMediaPlaylist.SegmentBase segmentBase = segmentBaseHolder.a;
        if (segmentBase instanceof HlsMediaPlaylist.Part) {
            return ((HlsMediaPlaylist.Part) segmentBase).isIndependent || (segmentBaseHolder.c == 0 && mediaPlaylist.hasIndependentSegments);
        }
        return mediaPlaylist.hasIndependentSegments;
    }

    @RequiresNonNull({"output"})
    private void i() throws IOException {
        try {
            this.k.sharedInitializeOrWait(this.i, this.startTimeUs);
            c(this.dataSource, this.dataSpec, this.q);
        } catch (InterruptedException unused) {
            throw new InterruptedIOException();
        }
    }

    @RequiresNonNull({"output"})
    private void j() throws IOException {
        if (this.v) {
            Assertions.checkNotNull(this.f);
            Assertions.checkNotNull(this.g);
            c(this.f, this.g, this.r);
            this.u = 0;
            this.v = false;
        }
    }

    private long k(ExtractorInput input) throws IOException {
        input.resetPeekPosition();
        try {
            this.p.reset(10);
            input.peekFully(this.p.getData(), 0, 10);
            if (this.p.readUnsignedInt24() != 4801587) {
                return C.TIME_UNSET;
            }
            this.p.skipBytes(3);
            int synchSafeInt = this.p.readSynchSafeInt();
            int i = synchSafeInt + 10;
            if (i > this.p.capacity()) {
                byte[] data = this.p.getData();
                this.p.reset(i);
                System.arraycopy(data, 0, this.p.getData(), 0, 10);
            }
            input.peekFully(this.p.getData(), 10, synchSafeInt);
            Metadata metadataDecode = this.o.decode(this.p.getData(), synchSafeInt);
            if (metadataDecode == null) {
                return C.TIME_UNSET;
            }
            int length = metadataDecode.length();
            for (int i2 = 0; i2 < length; i2++) {
                Metadata.Entry entry = metadataDecode.get(i2);
                if (entry instanceof PrivFrame) {
                    PrivFrame privFrame = (PrivFrame) entry;
                    if (B.equals(privFrame.owner)) {
                        System.arraycopy(privFrame.privateData, 0, this.p.getData(), 0, 8);
                        this.p.setPosition(0);
                        this.p.setLimit(8);
                        return this.p.readLong() & 8589934591L;
                    }
                }
            }
            return C.TIME_UNSET;
        } catch (EOFException unused) {
        }
    }

    @EnsuresNonNull({"extractor"})
    @RequiresNonNull({"output"})
    private DefaultExtractorInput l(DataSource dataSource, DataSpec dataSpec) throws IOException {
        DefaultExtractorInput defaultExtractorInput = new DefaultExtractorInput(dataSource, dataSpec.position, dataSource.open(dataSpec));
        if (this.s == null) {
            long jK = k(defaultExtractorInput);
            defaultExtractorInput.resetPeekPosition();
            HlsMediaChunkExtractor hlsMediaChunkExtractor = this.h;
            HlsMediaChunkExtractor hlsMediaChunkExtractorRecreate = hlsMediaChunkExtractor != null ? hlsMediaChunkExtractor.recreate() : this.l.createExtractor(dataSpec.uri, this.trackFormat, this.m, this.k, dataSource.getResponseHeaders(), defaultExtractorInput);
            this.s = hlsMediaChunkExtractorRecreate;
            if (hlsMediaChunkExtractorRecreate.isPackedAudioExtractor()) {
                this.t.S(jK != C.TIME_UNSET ? this.k.adjustTsTimestamp(jK) : this.startTimeUs);
            } else {
                this.t.S(0L);
            }
            this.t.E();
            this.s.init(this.t);
        }
        this.t.P(this.n);
        return defaultExtractorInput;
    }

    public static boolean n(@Nullable c previousChunk, Uri playlistUrl, HlsMediaPlaylist mediaPlaylist, HlsChunkSource.d segmentBaseHolder, long startOfPlaylistInPeriodUs) {
        if (previousChunk == null) {
            return false;
        }
        if (playlistUrl.equals(previousChunk.c) && previousChunk.x) {
            return false;
        }
        return !g(segmentBaseHolder, mediaPlaylist) || startOfPlaylistInPeriodUs + segmentBaseHolder.a.relativeStartTimeUs < previousChunk.endTimeUs;
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.Loadable
    public void cancelLoad() {
        this.w = true;
    }

    public void e(HlsSampleStreamWrapper output, ImmutableList<Integer> sampleQueueWriteIndices) {
        this.t = output;
        this.y = sampleQueueWriteIndices;
    }

    public void f() {
        this.z = true;
    }

    public int getFirstSampleIndex(int sampleQueueIndex) {
        Assertions.checkState(!this.d);
        if (sampleQueueIndex >= this.y.size()) {
            return 0;
        }
        return this.y.get(sampleQueueIndex).intValue();
    }

    public boolean h() {
        return this.A;
    }

    @Override // com.google.android.exoplayer2.source.chunk.MediaChunk
    public boolean isLoadCompleted() {
        return this.x;
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.Loadable
    public void load() throws IOException {
        HlsMediaChunkExtractor hlsMediaChunkExtractor;
        Assertions.checkNotNull(this.t);
        if (this.s == null && (hlsMediaChunkExtractor = this.h) != null && hlsMediaChunkExtractor.isReusable()) {
            this.s = this.h;
            this.v = false;
        }
        j();
        if (this.w) {
            return;
        }
        if (!this.j) {
            i();
        }
        this.x = !this.w;
    }

    public void m() {
        this.A = true;
    }
}
