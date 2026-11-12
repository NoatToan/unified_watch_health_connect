package com.google.android.exoplayer2.extractor.ts;

import android.net.Uri;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.ConstantBitrateSeekMap;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.ExtractorsFactory;
import com.google.android.exoplayer2.extractor.PositionHolder;
import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.extractor.a;
import com.google.android.exoplayer2.extractor.ts.AdtsExtractor;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.ParsableBitArray;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.io.EOFException;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Map;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: loaded from: classes2.dex */
public final class AdtsExtractor implements Extractor {
    public static final ExtractorsFactory FACTORY = new ExtractorsFactory() { // from class: ga
        @Override // com.google.android.exoplayer2.extractor.ExtractorsFactory
        public final Extractor[] createExtractors() {
            return AdtsExtractor.e();
        }

        @Override // com.google.android.exoplayer2.extractor.ExtractorsFactory
        public /* synthetic */ Extractor[] createExtractors(Uri uri, Map map) {
            return a.a(this, uri, map);
        }
    };
    public static final int FLAG_ENABLE_CONSTANT_BITRATE_SEEKING = 1;
    private static final int m = 2048;
    private static final int n = 8192;
    private static final int o = 1000;
    private final int a;
    private final AdtsReader b;
    private final ParsableByteArray c;
    private final ParsableByteArray d;
    private final ParsableBitArray e;
    private ExtractorOutput f;
    private long g;
    private long h;
    private int i;
    private boolean j;
    private boolean k;
    private boolean l;

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    public AdtsExtractor() {
        this(0);
    }

    private void b(ExtractorInput input) throws IOException {
        if (this.j) {
            return;
        }
        this.i = -1;
        input.resetPeekPosition();
        long j = 0;
        if (input.getPosition() == 0) {
            g(input);
        }
        int i = 0;
        int i2 = 0;
        while (true) {
            try {
                if (input.peekFully(this.d.getData(), 0, 2, true)) {
                    this.d.setPosition(0);
                    if (!AdtsReader.isAdtsSyncWord(this.d.readUnsignedShort())) {
                        break;
                    }
                    if (input.peekFully(this.d.getData(), 0, 4, true)) {
                        this.e.setPosition(14);
                        int bits = this.e.readBits(13);
                        if (bits <= 6) {
                            this.j = true;
                            throw ParserException.createForMalformedContainer("Malformed ADTS stream", null);
                        }
                        j += (long) bits;
                        i2++;
                        if (i2 != 1000 && input.advancePeekPosition(bits - 6, true)) {
                        }
                    }
                }
            } catch (EOFException unused) {
            }
            i = i2;
            break;
        }
        input.resetPeekPosition();
        if (i > 0) {
            this.i = (int) (j / ((long) i));
        } else {
            this.i = -1;
        }
        this.j = true;
    }

    private static int c(int frameSize, long durationUsPerFrame) {
        return (int) ((((long) (frameSize * 8)) * 1000000) / durationUsPerFrame);
    }

    private SeekMap d(long inputLength) {
        return new ConstantBitrateSeekMap(inputLength, this.h, c(this.i, this.b.getSampleDurationUs()), this.i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Extractor[] e() {
        return new Extractor[]{new AdtsExtractor()};
    }

    @RequiresNonNull({"extractorOutput"})
    private void f(long inputLength, boolean canUseConstantBitrateSeeking, boolean readEndOfStream) {
        if (this.l) {
            return;
        }
        boolean z = canUseConstantBitrateSeeking && this.i > 0;
        if (z && this.b.getSampleDurationUs() == C.TIME_UNSET && !readEndOfStream) {
            return;
        }
        if (!z || this.b.getSampleDurationUs() == C.TIME_UNSET) {
            this.f.seekMap(new SeekMap.Unseekable(C.TIME_UNSET));
        } else {
            this.f.seekMap(d(inputLength));
        }
        this.l = true;
    }

    private int g(ExtractorInput input) throws IOException {
        int i = 0;
        while (true) {
            input.peekFully(this.d.getData(), 0, 10);
            this.d.setPosition(0);
            if (this.d.readUnsignedInt24() != 4801587) {
                break;
            }
            this.d.skipBytes(3);
            int synchSafeInt = this.d.readSynchSafeInt();
            i += synchSafeInt + 10;
            input.advancePeekPosition(synchSafeInt);
        }
        input.resetPeekPosition();
        input.advancePeekPosition(i);
        if (this.h == -1) {
            this.h = i;
        }
        return i;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public void init(ExtractorOutput output) {
        this.f = output;
        this.b.createTracks(output, new TsPayloadReader.TrackIdGenerator(0, 1));
        output.endTracks();
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public int read(ExtractorInput input, PositionHolder seekPosition) throws IOException {
        Assertions.checkStateNotNull(this.f);
        long length = input.getLength();
        boolean z = ((this.a & 1) == 0 || length == -1) ? false : true;
        if (z) {
            b(input);
        }
        int i = input.read(this.c.getData(), 0, 2048);
        boolean z2 = i == -1;
        f(length, z, z2);
        if (z2) {
            return -1;
        }
        this.c.setPosition(0);
        this.c.setLimit(i);
        if (!this.k) {
            this.b.packetStarted(this.g, 4);
            this.k = true;
        }
        this.b.consume(this.c);
        return 0;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public void release() {
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public void seek(long position, long timeUs) {
        this.k = false;
        this.b.seek();
        this.g = timeUs;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public boolean sniff(ExtractorInput input) throws IOException {
        int iG = g(input);
        int i = iG;
        while (true) {
            int i2 = 0;
            int i3 = 0;
            while (true) {
                input.peekFully(this.d.getData(), 0, 2);
                this.d.setPosition(0);
                if (!AdtsReader.isAdtsSyncWord(this.d.readUnsignedShort())) {
                    break;
                }
                i2++;
                if (i2 >= 4 && i3 > 188) {
                    return true;
                }
                input.peekFully(this.d.getData(), 0, 4);
                this.e.setPosition(14);
                int bits = this.e.readBits(13);
                if (bits <= 6) {
                    return false;
                }
                input.advancePeekPosition(bits - 6);
                i3 += bits;
            }
            input.resetPeekPosition();
            i++;
            if (i - iG >= 8192) {
                return false;
            }
            input.advancePeekPosition(i);
        }
    }

    public AdtsExtractor(int flags) {
        this.a = flags;
        this.b = new AdtsReader(true);
        this.c = new ParsableByteArray(2048);
        this.i = -1;
        this.h = -1L;
        ParsableByteArray parsableByteArray = new ParsableByteArray(10);
        this.d = parsableByteArray;
        this.e = new ParsableBitArray(parsableByteArray.getData());
    }
}
