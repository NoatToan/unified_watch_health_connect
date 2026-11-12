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
import j20.x;
import java.io.IOException;
import vb.h;

/* JADX INFO: loaded from: classes13.dex */
public final class RawCcExtractor implements Extractor {
    private static final int HEADER_ID = 1380139777;
    private static final int HEADER_SIZE = 8;
    private static final int SCRATCH_SIZE = 9;
    private static final int STATE_READING_HEADER = 0;
    private static final int STATE_READING_SAMPLES = 2;
    private static final int STATE_READING_TIMESTAMP_AND_COUNT = 1;
    private static final int TIMESTAMP_SIZE_V0 = 4;
    private static final int TIMESTAMP_SIZE_V1 = 8;
    private final Format format;
    private int remainingSampleCount;
    private int sampleBytesWritten;
    private long timestampUs;
    private TrackOutput trackOutput;
    private int version;
    private final ParsableByteArray dataScratch = new ParsableByteArray(9);
    private int parserState = 0;

    public RawCcExtractor(Format format) {
        this.format = format;
    }

    private boolean parseHeader(ExtractorInput extractorInput) throws IOException {
        this.dataScratch.reset(8);
        if (!extractorInput.readFully(this.dataScratch.getData(), 0, 8, true)) {
            return false;
        }
        if (this.dataScratch.readInt() == HEADER_ID) {
            this.version = this.dataScratch.readUnsignedByte();
            return true;
        }
        h.C("Input not RawCC");
        return false;
    }

    private void parseSamples(ExtractorInput extractorInput) {
        while (this.remainingSampleCount > 0) {
            this.dataScratch.reset(3);
            extractorInput.readFully(this.dataScratch.getData(), 0, 3);
            this.trackOutput.sampleData(this.dataScratch, 3);
            this.sampleBytesWritten += 3;
            this.remainingSampleCount--;
        }
        int i14 = this.sampleBytesWritten;
        if (i14 > 0) {
            this.trackOutput.sampleMetadata(this.timestampUs, 1, i14, 0, null);
        }
    }

    private boolean parseTimestampAndSampleCount(ExtractorInput extractorInput) throws ParserException {
        int i14 = this.version;
        if (i14 == 0) {
            this.dataScratch.reset(5);
            if (!extractorInput.readFully(this.dataScratch.getData(), 0, 5, true)) {
                return false;
            }
            this.timestampUs = (this.dataScratch.readUnsignedInt() * 1000) / 45;
        } else {
            if (i14 != 1) {
                StringBuilder sb3 = new StringBuilder(39);
                sb3.append("Unsupported version number: ");
                sb3.append(i14);
                throw ParserException.createForMalformedContainer(sb3.toString(), null);
            }
            this.dataScratch.reset(9);
            if (!extractorInput.readFully(this.dataScratch.getData(), 0, 9, true)) {
                return false;
            }
            this.timestampUs = this.dataScratch.readLong();
        }
        this.remainingSampleCount = this.dataScratch.readUnsignedByte();
        this.sampleBytesWritten = 0;
        return true;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public void init(ExtractorOutput extractorOutput) {
        extractorOutput.seekMap(new SeekMap.Unseekable(C.TIME_UNSET));
        TrackOutput trackOutputTrack = extractorOutput.track(0, 3);
        this.trackOutput = trackOutputTrack;
        trackOutputTrack.format(this.format);
        extractorOutput.endTracks();
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public int read(ExtractorInput extractorInput, PositionHolder positionHolder) {
        Assertions.checkStateNotNull(this.trackOutput);
        while (true) {
            int i14 = this.parserState;
            if (i14 != 0) {
                if (i14 != 1) {
                    if (i14 != 2) {
                        x.h();
                        return 0;
                    }
                    parseSamples(extractorInput);
                    this.parserState = 1;
                    return 0;
                }
                if (!parseTimestampAndSampleCount(extractorInput)) {
                    this.parserState = 0;
                    return -1;
                }
                this.parserState = 2;
            } else {
                if (!parseHeader(extractorInput)) {
                    return -1;
                }
                this.parserState = 1;
            }
        }
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public void release() {
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public void seek(long j8, long j14) {
        this.parserState = 0;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public boolean sniff(ExtractorInput extractorInput) {
        this.dataScratch.reset(8);
        extractorInput.peekFully(this.dataScratch.getData(), 0, 8);
        return this.dataScratch.readInt() == HEADER_ID;
    }
}
