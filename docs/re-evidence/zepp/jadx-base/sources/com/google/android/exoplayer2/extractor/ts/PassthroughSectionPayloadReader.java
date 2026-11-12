package com.google.android.exoplayer2.extractor.ts;

import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.TimestampAdjuster;
import com.google.android.exoplayer2.util.Util;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* JADX INFO: loaded from: classes2.dex */
public final class PassthroughSectionPayloadReader implements SectionPayloadReader {
    private Format a;
    private TimestampAdjuster b;
    private TrackOutput c;

    public PassthroughSectionPayloadReader(String mimeType) {
        this.a = new Format.Builder().setSampleMimeType(mimeType).build();
    }

    @EnsuresNonNull({"timestampAdjuster", "output"})
    private void a() {
        Assertions.checkStateNotNull(this.b);
        Util.castNonNull(this.c);
    }

    @Override // com.google.android.exoplayer2.extractor.ts.SectionPayloadReader
    public void consume(ParsableByteArray sectionData) {
        a();
        long lastAdjustedTimestampUs = this.b.getLastAdjustedTimestampUs();
        long timestampOffsetUs = this.b.getTimestampOffsetUs();
        if (lastAdjustedTimestampUs == C.TIME_UNSET || timestampOffsetUs == C.TIME_UNSET) {
            return;
        }
        Format format = this.a;
        if (timestampOffsetUs != format.subsampleOffsetUs) {
            Format formatBuild = format.buildUpon().setSubsampleOffsetUs(timestampOffsetUs).build();
            this.a = formatBuild;
            this.c.format(formatBuild);
        }
        int iBytesLeft = sectionData.bytesLeft();
        this.c.sampleData(sectionData, iBytesLeft);
        this.c.sampleMetadata(lastAdjustedTimestampUs, 1, iBytesLeft, 0, null);
    }

    @Override // com.google.android.exoplayer2.extractor.ts.SectionPayloadReader
    public void init(TimestampAdjuster timestampAdjuster, ExtractorOutput extractorOutput, TsPayloadReader.TrackIdGenerator idGenerator) {
        this.b = timestampAdjuster;
        idGenerator.generateNewId();
        TrackOutput trackOutputTrack = extractorOutput.track(idGenerator.getTrackId(), 5);
        this.c = trackOutputTrack;
        trackOutputTrack.format(this.a);
    }
}
