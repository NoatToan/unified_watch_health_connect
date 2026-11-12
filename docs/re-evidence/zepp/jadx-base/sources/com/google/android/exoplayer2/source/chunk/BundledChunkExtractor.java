package com.google.android.exoplayer2.source.chunk;

import android.util.SparseArray;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.extractor.ChunkIndex;
import com.google.android.exoplayer2.extractor.DummyTrackOutput;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.PositionHolder;
import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.extractor.b;
import com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor;
import com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor;
import com.google.android.exoplayer2.extractor.rawcc.RawCcExtractor;
import com.google.android.exoplayer2.source.chunk.BundledChunkExtractor;
import com.google.android.exoplayer2.source.chunk.ChunkExtractor;
import com.google.android.exoplayer2.upstream.DataReader;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class BundledChunkExtractor implements ExtractorOutput, ChunkExtractor {
    public static final ChunkExtractor.Factory FACTORY = new ChunkExtractor.Factory() { // from class: n90
        @Override // com.google.android.exoplayer2.source.chunk.ChunkExtractor.Factory
        public final ChunkExtractor createProgressiveMediaExtractor(int i, Format format, boolean z, List list, TrackOutput trackOutput) {
            return BundledChunkExtractor.b(i, format, z, list, trackOutput);
        }
    };
    private static final PositionHolder j = new PositionHolder();
    private final Extractor a;
    private final int b;
    private final Format c;
    private final SparseArray<a> d = new SparseArray<>();
    private boolean e;

    @Nullable
    private ChunkExtractor.TrackOutputProvider f;
    private long g;
    private SeekMap h;
    private Format[] i;

    public static final class a implements TrackOutput {
        private final int a;
        private final int b;

        @Nullable
        private final Format c;
        private final DummyTrackOutput d = new DummyTrackOutput();
        public Format e;
        private TrackOutput f;
        private long g;

        public a(int id, int type, @Nullable Format manifestFormat) {
            this.a = id;
            this.b = type;
            this.c = manifestFormat;
        }

        public void a(@Nullable ChunkExtractor.TrackOutputProvider trackOutputProvider, long endTimeUs) {
            if (trackOutputProvider == null) {
                this.f = this.d;
                return;
            }
            this.g = endTimeUs;
            TrackOutput trackOutputTrack = trackOutputProvider.track(this.a, this.b);
            this.f = trackOutputTrack;
            Format format = this.e;
            if (format != null) {
                trackOutputTrack.format(format);
            }
        }

        @Override // com.google.android.exoplayer2.extractor.TrackOutput
        public void format(Format format) {
            Format format2 = this.c;
            if (format2 != null) {
                format = format.withManifestFormatInfo(format2);
            }
            this.e = format;
            ((TrackOutput) Util.castNonNull(this.f)).format(this.e);
        }

        @Override // com.google.android.exoplayer2.extractor.TrackOutput
        public /* synthetic */ int sampleData(DataReader dataReader, int i, boolean z) {
            return b.a(this, dataReader, i, z);
        }

        @Override // com.google.android.exoplayer2.extractor.TrackOutput
        public int sampleData(DataReader input, int length, boolean allowEndOfInput, int sampleDataPart) throws IOException {
            return ((TrackOutput) Util.castNonNull(this.f)).sampleData(input, length, allowEndOfInput);
        }

        @Override // com.google.android.exoplayer2.extractor.TrackOutput
        public /* synthetic */ void sampleData(ParsableByteArray parsableByteArray, int i) {
            b.b(this, parsableByteArray, i);
        }

        @Override // com.google.android.exoplayer2.extractor.TrackOutput
        public void sampleMetadata(long timeUs, int flags, int size, int offset, @Nullable TrackOutput.CryptoData cryptoData) {
            long j = this.g;
            if (j != C.TIME_UNSET && timeUs >= j) {
                this.f = this.d;
            }
            ((TrackOutput) Util.castNonNull(this.f)).sampleMetadata(timeUs, flags, size, offset, cryptoData);
        }

        @Override // com.google.android.exoplayer2.extractor.TrackOutput
        public void sampleData(ParsableByteArray data, int length, int sampleDataPart) {
            ((TrackOutput) Util.castNonNull(this.f)).sampleData(data, length);
        }
    }

    public BundledChunkExtractor(Extractor extractor, int primaryTrackType, Format primaryTrackManifestFormat) {
        this.a = extractor;
        this.b = primaryTrackType;
        this.c = primaryTrackManifestFormat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ChunkExtractor b(int i, Format format, boolean z, List list, TrackOutput trackOutput) {
        Extractor fragmentedMp4Extractor;
        String str = format.containerMimeType;
        if (MimeTypes.isText(str)) {
            if (!MimeTypes.APPLICATION_RAWCC.equals(str)) {
                return null;
            }
            fragmentedMp4Extractor = new RawCcExtractor(format);
        } else if (MimeTypes.isMatroska(str)) {
            fragmentedMp4Extractor = new MatroskaExtractor(1);
        } else {
            fragmentedMp4Extractor = new FragmentedMp4Extractor(z ? 4 : 0, null, null, list, trackOutput);
        }
        return new BundledChunkExtractor(fragmentedMp4Extractor, i, format);
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorOutput
    public void endTracks() {
        Format[] formatArr = new Format[this.d.size()];
        for (int i = 0; i < this.d.size(); i++) {
            formatArr[i] = (Format) Assertions.checkStateNotNull(this.d.valueAt(i).e);
        }
        this.i = formatArr;
    }

    @Override // com.google.android.exoplayer2.source.chunk.ChunkExtractor
    @Nullable
    public ChunkIndex getChunkIndex() {
        SeekMap seekMap = this.h;
        if (seekMap instanceof ChunkIndex) {
            return (ChunkIndex) seekMap;
        }
        return null;
    }

    @Override // com.google.android.exoplayer2.source.chunk.ChunkExtractor
    @Nullable
    public Format[] getSampleFormats() {
        return this.i;
    }

    @Override // com.google.android.exoplayer2.source.chunk.ChunkExtractor
    public void init(@Nullable ChunkExtractor.TrackOutputProvider trackOutputProvider, long startTimeUs, long endTimeUs) {
        this.f = trackOutputProvider;
        this.g = endTimeUs;
        if (!this.e) {
            this.a.init(this);
            if (startTimeUs != C.TIME_UNSET) {
                this.a.seek(0L, startTimeUs);
            }
            this.e = true;
            return;
        }
        Extractor extractor = this.a;
        if (startTimeUs == C.TIME_UNSET) {
            startTimeUs = 0;
        }
        extractor.seek(0L, startTimeUs);
        for (int i = 0; i < this.d.size(); i++) {
            this.d.valueAt(i).a(trackOutputProvider, endTimeUs);
        }
    }

    @Override // com.google.android.exoplayer2.source.chunk.ChunkExtractor
    public boolean read(ExtractorInput input) throws IOException {
        int i = this.a.read(input, j);
        Assertions.checkState(i != 1);
        return i == 0;
    }

    @Override // com.google.android.exoplayer2.source.chunk.ChunkExtractor
    public void release() {
        this.a.release();
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorOutput
    public void seekMap(SeekMap seekMap) {
        this.h = seekMap;
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorOutput
    public TrackOutput track(int id, int type) {
        a aVar = this.d.get(id);
        if (aVar == null) {
            Assertions.checkState(this.i == null);
            aVar = new a(id, type, type == this.b ? this.c : null);
            aVar.a(this.f, this.g);
            this.d.put(id, aVar);
        }
        return aVar;
    }
}
