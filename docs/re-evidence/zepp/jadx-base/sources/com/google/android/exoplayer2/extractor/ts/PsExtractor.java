package com.google.android.exoplayer2.extractor.ts;

import android.net.Uri;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import androidx.core.view.InputDeviceCompat;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.ExtractorsFactory;
import com.google.android.exoplayer2.extractor.PositionHolder;
import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.extractor.a;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.ParsableBitArray;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.TimestampAdjuster;
import java.io.IOException;
import java.util.Map;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: loaded from: classes2.dex */
public final class PsExtractor implements Extractor {
    public static final int AUDIO_STREAM = 192;
    public static final int AUDIO_STREAM_MASK = 224;
    public static final ExtractorsFactory FACTORY = new ExtractorsFactory() { // from class: z46
        @Override // com.google.android.exoplayer2.extractor.ExtractorsFactory
        public final Extractor[] createExtractors() {
            return PsExtractor.b();
        }

        @Override // com.google.android.exoplayer2.extractor.ExtractorsFactory
        public /* synthetic */ Extractor[] createExtractors(Uri uri, Map map) {
            return a.a(this, uri, map);
        }
    };
    public static final int PRIVATE_STREAM_1 = 189;
    public static final int VIDEO_STREAM = 224;
    public static final int VIDEO_STREAM_MASK = 240;
    public static final int l = 442;
    public static final int m = 443;
    public static final int n = 1;
    public static final int o = 441;
    private static final int p = 256;
    private static final long q = 1048576;
    private static final long r = 8192;
    private final TimestampAdjuster a;
    private final SparseArray<a> b;
    private final ParsableByteArray c;
    private final c d;
    private boolean e;
    private boolean f;
    private boolean g;
    private long h;

    @Nullable
    private b i;
    private ExtractorOutput j;
    private boolean k;

    public static final class a {
        private static final int i = 64;
        private final ElementaryStreamReader a;
        private final TimestampAdjuster b;
        private final ParsableBitArray c = new ParsableBitArray(new byte[64]);
        private boolean d;
        private boolean e;
        private boolean f;
        private int g;
        private long h;

        public a(ElementaryStreamReader pesPayloadReader, TimestampAdjuster timestampAdjuster) {
            this.a = pesPayloadReader;
            this.b = timestampAdjuster;
        }

        private void b() {
            this.c.skipBits(8);
            this.d = this.c.readBit();
            this.e = this.c.readBit();
            this.c.skipBits(6);
            this.g = this.c.readBits(8);
        }

        private void c() {
            this.h = 0L;
            if (this.d) {
                this.c.skipBits(4);
                long bits = ((long) this.c.readBits(3)) << 30;
                this.c.skipBits(1);
                long bits2 = bits | ((long) (this.c.readBits(15) << 15));
                this.c.skipBits(1);
                long bits3 = bits2 | ((long) this.c.readBits(15));
                this.c.skipBits(1);
                if (!this.f && this.e) {
                    this.c.skipBits(4);
                    long bits4 = ((long) this.c.readBits(3)) << 30;
                    this.c.skipBits(1);
                    long bits5 = bits4 | ((long) (this.c.readBits(15) << 15));
                    this.c.skipBits(1);
                    long bits6 = bits5 | ((long) this.c.readBits(15));
                    this.c.skipBits(1);
                    this.b.adjustTsTimestamp(bits6);
                    this.f = true;
                }
                this.h = this.b.adjustTsTimestamp(bits3);
            }
        }

        public void a(ParsableByteArray data) throws ParserException {
            data.readBytes(this.c.data, 0, 3);
            this.c.setPosition(0);
            b();
            data.readBytes(this.c.data, 0, this.g);
            this.c.setPosition(0);
            c();
            this.a.packetStarted(this.h, 4);
            this.a.consume(data);
            this.a.packetFinished();
        }

        public void d() {
            this.f = false;
            this.a.seek();
        }
    }

    public PsExtractor() {
        this(new TimestampAdjuster(0L));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Extractor[] b() {
        return new Extractor[]{new PsExtractor()};
    }

    @RequiresNonNull({"output"})
    private void c(long inputLength) {
        if (this.k) {
            return;
        }
        this.k = true;
        if (this.d.c() == C.TIME_UNSET) {
            this.j.seekMap(new SeekMap.Unseekable(this.d.c()));
            return;
        }
        b bVar = new b(this.d.d(), this.d.c(), inputLength);
        this.i = bVar;
        this.j.seekMap(bVar.getSeekMap());
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public void init(ExtractorOutput output) {
        this.j = output;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public int read(ExtractorInput input, PositionHolder seekPosition) throws IOException {
        Assertions.checkStateNotNull(this.j);
        long length = input.getLength();
        if ((length != -1) && !this.d.e()) {
            return this.d.g(input, seekPosition);
        }
        c(length);
        b bVar = this.i;
        if (bVar != null && bVar.isSeeking()) {
            return this.i.handlePendingSeek(input, seekPosition);
        }
        input.resetPeekPosition();
        long peekPosition = length != -1 ? length - input.getPeekPosition() : -1L;
        if ((peekPosition != -1 && peekPosition < 4) || !input.peekFully(this.c.getData(), 0, 4, true)) {
            return -1;
        }
        this.c.setPosition(0);
        int i = this.c.readInt();
        if (i == 441) {
            return -1;
        }
        if (i == 442) {
            input.peekFully(this.c.getData(), 0, 10);
            this.c.setPosition(9);
            input.skipFully((this.c.readUnsignedByte() & 7) + 14);
            return 0;
        }
        if (i == 443) {
            input.peekFully(this.c.getData(), 0, 2);
            this.c.setPosition(0);
            input.skipFully(this.c.readUnsignedShort() + 6);
            return 0;
        }
        if (((i & InputDeviceCompat.SOURCE_ANY) >> 8) != 1) {
            input.skipFully(1);
            return 0;
        }
        int i2 = i & 255;
        a aVar = this.b.get(i2);
        if (!this.e) {
            if (aVar == null) {
                ElementaryStreamReader h262Reader = null;
                if (i2 == 189) {
                    h262Reader = new Ac3Reader();
                    this.f = true;
                    this.h = input.getPosition();
                } else if ((i2 & 224) == 192) {
                    h262Reader = new MpegAudioReader();
                    this.f = true;
                    this.h = input.getPosition();
                } else if ((i2 & 240) == 224) {
                    h262Reader = new H262Reader();
                    this.g = true;
                    this.h = input.getPosition();
                }
                if (h262Reader != null) {
                    h262Reader.createTracks(this.j, new TsPayloadReader.TrackIdGenerator(i2, 256));
                    aVar = new a(h262Reader, this.a);
                    this.b.put(i2, aVar);
                }
            }
            if (input.getPosition() > ((this.f && this.g) ? this.h + 8192 : 1048576L)) {
                this.e = true;
                this.j.endTracks();
            }
        }
        input.peekFully(this.c.getData(), 0, 2);
        this.c.setPosition(0);
        int unsignedShort = this.c.readUnsignedShort() + 6;
        if (aVar == null) {
            input.skipFully(unsignedShort);
        } else {
            this.c.reset(unsignedShort);
            input.readFully(this.c.getData(), 0, unsignedShort);
            this.c.setPosition(6);
            aVar.a(this.c);
            ParsableByteArray parsableByteArray = this.c;
            parsableByteArray.setLimit(parsableByteArray.capacity());
        }
        return 0;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public void release() {
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public void seek(long position, long timeUs) {
        boolean z = this.a.getTimestampOffsetUs() == C.TIME_UNSET;
        if (!z) {
            long firstSampleTimestampUs = this.a.getFirstSampleTimestampUs();
            z = (firstSampleTimestampUs == C.TIME_UNSET || firstSampleTimestampUs == 0 || firstSampleTimestampUs == timeUs) ? false : true;
        }
        if (z) {
            this.a.reset(timeUs);
        }
        b bVar = this.i;
        if (bVar != null) {
            bVar.setSeekTargetUs(timeUs);
        }
        for (int i = 0; i < this.b.size(); i++) {
            this.b.valueAt(i).d();
        }
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public boolean sniff(ExtractorInput input) throws IOException {
        byte[] bArr = new byte[14];
        input.peekFully(bArr, 0, 14);
        if (442 != (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        input.advancePeekPosition(bArr[13] & 7);
        input.peekFully(bArr, 0, 3);
        return 1 == ((((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8)) | (bArr[2] & 255));
    }

    public PsExtractor(TimestampAdjuster timestampAdjuster) {
        this.a = timestampAdjuster;
        this.c = new ParsableByteArray(4096);
        this.b = new SparseArray<>();
        this.d = new c();
    }
}
