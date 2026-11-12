package com.google.android.exoplayer2.extractor.rawcc;

import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.PositionHolder;
import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.io.IOException;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: loaded from: classes2.dex */
public final class RawCcExtractor implements Extractor {
    private static final int i = 9;
    private static final int j = 8;
    private static final int k = 1380139777;
    private static final int l = 4;
    private static final int m = 8;
    private static final int n = 0;
    private static final int o = 1;
    private static final int p = 2;
    private final Format a;
    private TrackOutput c;
    private int e;
    private long f;
    private int g;
    private int h;
    private final ParsableByteArray b = new ParsableByteArray(9);
    private int d = 0;

    public RawCcExtractor(Format format) {
        this.a = format;
    }

    private boolean a(ExtractorInput input) throws IOException {
        this.b.reset(8);
        if (!input.readFully(this.b.getData(), 0, 8, true)) {
            return false;
        }
        if (this.b.readInt() != k) {
            throw new IOException("Input not RawCC");
        }
        this.e = this.b.readUnsignedByte();
        return true;
    }

    @RequiresNonNull({"trackOutput"})
    private void b(ExtractorInput input) throws IOException {
        while (this.g > 0) {
            this.b.reset(3);
            input.readFully(this.b.getData(), 0, 3);
            this.c.sampleData(this.b, 3);
            this.h += 3;
            this.g--;
        }
        int i2 = this.h;
        if (i2 > 0) {
            this.c.sampleMetadata(this.f, 1, i2, 0, null);
        }
    }

    private boolean c(ExtractorInput input) throws IOException {
        int i2 = this.e;
        if (i2 == 0) {
            this.b.reset(5);
            if (!input.readFully(this.b.getData(), 0, 5, true)) {
                return false;
            }
            this.f = (this.b.readUnsignedInt() * 1000) / 45;
        } else {
            if (i2 != 1) {
                StringBuilder sb = new StringBuilder(39);
                sb.append("Unsupported version number: ");
                sb.append(i2);
                throw ParserException.createForMalformedContainer(sb.toString(), null);
            }
            this.b.reset(9);
            if (!input.readFully(this.b.getData(), 0, 9, true)) {
                return false;
            }
            this.f = this.b.readLong();
        }
        this.g = this.b.readUnsignedByte();
        this.h = 0;
        return true;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public void init(ExtractorOutput output) {
        output.seekMap(new SeekMap.Unseekable(C.TIME_UNSET));
        TrackOutput trackOutputTrack = output.track(0, 3);
        this.c = trackOutputTrack;
        trackOutputTrack.format(this.a);
        output.endTracks();
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public int read(ExtractorInput input, PositionHolder seekPosition) throws IOException {
        Assertions.checkStateNotNull(this.c);
        while (true) {
            int i2 = this.d;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException();
                    }
                    b(input);
                    this.d = 1;
                    return 0;
                }
                if (!c(input)) {
                    this.d = 0;
                    return -1;
                }
                this.d = 2;
            } else {
                if (!a(input)) {
                    return -1;
                }
                this.d = 1;
            }
        }
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public void release() {
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public void seek(long position, long timeUs) {
        this.d = 0;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public boolean sniff(ExtractorInput input) throws IOException {
        this.b.reset(8);
        input.peekFully(this.b.getData(), 0, 8);
        return this.b.readInt() == k;
    }
}
