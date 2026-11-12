package com.google.android.exoplayer2.extractor.flac;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.ExtractorsFactory;
import com.google.android.exoplayer2.extractor.FlacFrameReader;
import com.google.android.exoplayer2.extractor.FlacMetadataReader;
import com.google.android.exoplayer2.extractor.FlacSeekTableSeekMap;
import com.google.android.exoplayer2.extractor.FlacStreamMetadata;
import com.google.android.exoplayer2.extractor.PositionHolder;
import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.extractor.a;
import com.google.android.exoplayer2.extractor.flac.FlacExtractor;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class FlacExtractor implements Extractor {
    public static final ExtractorsFactory FACTORY = new ExtractorsFactory() { // from class: t82
        @Override // com.google.android.exoplayer2.extractor.ExtractorsFactory
        public final Extractor[] createExtractors() {
            return FlacExtractor.f();
        }

        @Override // com.google.android.exoplayer2.extractor.ExtractorsFactory
        public /* synthetic */ Extractor[] createExtractors(Uri uri, Map map) {
            return a.a(this, uri, map);
        }
    };
    public static final int FLAG_DISABLE_ID3_METADATA = 1;
    private static final int o = 0;
    private static final int p = 1;
    private static final int q = 2;
    private static final int r = 3;
    private static final int s = 4;
    private static final int t = 5;
    private static final int u = 32768;
    private static final int v = -1;
    private final byte[] a;
    private final ParsableByteArray b;
    private final boolean c;
    private final FlacFrameReader.SampleNumberHolder d;
    private ExtractorOutput e;
    private TrackOutput f;
    private int g;

    @Nullable
    private Metadata h;
    private FlacStreamMetadata i;
    private int j;
    private int k;
    private a l;
    private int m;
    private long n;

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    public FlacExtractor() {
        this(0);
    }

    private long b(ParsableByteArray data, boolean foundEndOfInput) {
        boolean zCheckAndReadFrameHeader;
        Assertions.checkNotNull(this.i);
        int position = data.getPosition();
        while (position <= data.limit() - 16) {
            data.setPosition(position);
            if (FlacFrameReader.checkAndReadFrameHeader(data, this.i, this.k, this.d)) {
                data.setPosition(position);
                return this.d.sampleNumber;
            }
            position++;
        }
        if (!foundEndOfInput) {
            data.setPosition(position);
            return -1L;
        }
        while (position <= data.limit() - this.j) {
            data.setPosition(position);
            try {
                zCheckAndReadFrameHeader = FlacFrameReader.checkAndReadFrameHeader(data, this.i, this.k, this.d);
            } catch (IndexOutOfBoundsException unused) {
                zCheckAndReadFrameHeader = false;
            }
            if (data.getPosition() <= data.limit() ? zCheckAndReadFrameHeader : false) {
                data.setPosition(position);
                return this.d.sampleNumber;
            }
            position++;
        }
        data.setPosition(data.limit());
        return -1L;
    }

    private void c(ExtractorInput input) throws IOException {
        this.k = FlacMetadataReader.getFrameStartMarker(input);
        ((ExtractorOutput) Util.castNonNull(this.e)).seekMap(d(input.getPosition(), input.getLength()));
        this.g = 5;
    }

    private SeekMap d(long firstFramePosition, long streamLength) {
        Assertions.checkNotNull(this.i);
        FlacStreamMetadata flacStreamMetadata = this.i;
        if (flacStreamMetadata.seekTable != null) {
            return new FlacSeekTableSeekMap(flacStreamMetadata, firstFramePosition);
        }
        if (streamLength == -1 || flacStreamMetadata.totalSamples <= 0) {
            return new SeekMap.Unseekable(flacStreamMetadata.getDurationUs());
        }
        a aVar = new a(flacStreamMetadata, this.k, firstFramePosition, streamLength);
        this.l = aVar;
        return aVar.getSeekMap();
    }

    private void e(ExtractorInput input) throws IOException {
        byte[] bArr = this.a;
        input.peekFully(bArr, 0, bArr.length);
        input.resetPeekPosition();
        this.g = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Extractor[] f() {
        return new Extractor[]{new FlacExtractor()};
    }

    private void g() {
        ((TrackOutput) Util.castNonNull(this.f)).sampleMetadata((this.n * 1000000) / ((long) ((FlacStreamMetadata) Util.castNonNull(this.i)).sampleRate), 1, this.m, 0, null);
    }

    private int h(ExtractorInput input, PositionHolder seekPosition) throws IOException {
        boolean z;
        Assertions.checkNotNull(this.f);
        Assertions.checkNotNull(this.i);
        a aVar = this.l;
        if (aVar != null && aVar.isSeeking()) {
            return this.l.handlePendingSeek(input, seekPosition);
        }
        if (this.n == -1) {
            this.n = FlacFrameReader.getFirstSampleNumber(input, this.i);
            return 0;
        }
        int iLimit = this.b.limit();
        if (iLimit < 32768) {
            int i = input.read(this.b.getData(), iLimit, 32768 - iLimit);
            z = i == -1;
            if (!z) {
                this.b.setLimit(iLimit + i);
            } else if (this.b.bytesLeft() == 0) {
                g();
                return -1;
            }
        } else {
            z = false;
        }
        int position = this.b.getPosition();
        int i2 = this.m;
        int i3 = this.j;
        if (i2 < i3) {
            ParsableByteArray parsableByteArray = this.b;
            parsableByteArray.skipBytes(Math.min(i3 - i2, parsableByteArray.bytesLeft()));
        }
        long jB = b(this.b, z);
        int position2 = this.b.getPosition() - position;
        this.b.setPosition(position);
        this.f.sampleData(this.b, position2);
        this.m += position2;
        if (jB != -1) {
            g();
            this.m = 0;
            this.n = jB;
        }
        if (this.b.bytesLeft() < 16) {
            int iBytesLeft = this.b.bytesLeft();
            System.arraycopy(this.b.getData(), this.b.getPosition(), this.b.getData(), 0, iBytesLeft);
            this.b.setPosition(0);
            this.b.setLimit(iBytesLeft);
        }
        return 0;
    }

    private void i(ExtractorInput input) throws IOException {
        this.h = FlacMetadataReader.readId3Metadata(input, !this.c);
        this.g = 1;
    }

    private void j(ExtractorInput input) throws IOException {
        FlacMetadataReader.FlacStreamMetadataHolder flacStreamMetadataHolder = new FlacMetadataReader.FlacStreamMetadataHolder(this.i);
        boolean metadataBlock = false;
        while (!metadataBlock) {
            metadataBlock = FlacMetadataReader.readMetadataBlock(input, flacStreamMetadataHolder);
            this.i = (FlacStreamMetadata) Util.castNonNull(flacStreamMetadataHolder.flacStreamMetadata);
        }
        Assertions.checkNotNull(this.i);
        this.j = Math.max(this.i.minFrameSize, 6);
        ((TrackOutput) Util.castNonNull(this.f)).format(this.i.getFormat(this.a, this.h));
        this.g = 4;
    }

    private void k(ExtractorInput input) throws IOException {
        FlacMetadataReader.readStreamMarker(input);
        this.g = 3;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public void init(ExtractorOutput output) {
        this.e = output;
        this.f = output.track(0, 1);
        output.endTracks();
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public int read(ExtractorInput input, PositionHolder seekPosition) throws IOException {
        int i = this.g;
        if (i == 0) {
            i(input);
            return 0;
        }
        if (i == 1) {
            e(input);
            return 0;
        }
        if (i == 2) {
            k(input);
            return 0;
        }
        if (i == 3) {
            j(input);
            return 0;
        }
        if (i == 4) {
            c(input);
            return 0;
        }
        if (i == 5) {
            return h(input, seekPosition);
        }
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public void release() {
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public void seek(long position, long timeUs) {
        if (position == 0) {
            this.g = 0;
        } else {
            a aVar = this.l;
            if (aVar != null) {
                aVar.setSeekTargetUs(timeUs);
            }
        }
        this.n = timeUs != 0 ? -1L : 0L;
        this.m = 0;
        this.b.reset(0);
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public boolean sniff(ExtractorInput input) throws IOException {
        FlacMetadataReader.peekId3Metadata(input, false);
        return FlacMetadataReader.checkAndPeekStreamMarker(input);
    }

    public FlacExtractor(int flags) {
        this.a = new byte[42];
        this.b = new ParsableByteArray(new byte[32768], 0);
        this.c = (flags & 1) != 0;
        this.d = new FlacFrameReader.SampleNumberHolder();
        this.g = 0;
    }
}
