package com.google.android.exoplayer2.extractor.flac;

import com.google.android.exoplayer2.extractor.BinarySearchSeeker;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.FlacFrameReader;
import com.google.android.exoplayer2.extractor.FlacStreamMetadata;
import defpackage.gv;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class a extends BinarySearchSeeker {

    public static final class b implements BinarySearchSeeker.TimestampSeeker {
        private final FlacStreamMetadata a;
        private final int b;
        private final FlacFrameReader.SampleNumberHolder c;

        private long a(ExtractorInput input) throws IOException {
            while (input.getPeekPosition() < input.getLength() - 6 && !FlacFrameReader.checkFrameHeaderFromPeek(input, this.a, this.b, this.c)) {
                input.advancePeekPosition(1);
            }
            if (input.getPeekPosition() < input.getLength() - 6) {
                return this.c.sampleNumber;
            }
            input.advancePeekPosition((int) (input.getLength() - input.getPeekPosition()));
            return this.a.totalSamples;
        }

        @Override // com.google.android.exoplayer2.extractor.BinarySearchSeeker.TimestampSeeker
        public /* synthetic */ void onSeekFinished() {
            gv.a(this);
        }

        @Override // com.google.android.exoplayer2.extractor.BinarySearchSeeker.TimestampSeeker
        public BinarySearchSeeker.TimestampSearchResult searchForTimestamp(ExtractorInput input, long targetSampleNumber) throws IOException {
            long position = input.getPosition();
            long jA = a(input);
            long peekPosition = input.getPeekPosition();
            input.advancePeekPosition(Math.max(6, this.a.minFrameSize));
            long jA2 = a(input);
            long peekPosition2 = input.getPeekPosition();
            if (jA > targetSampleNumber || jA2 <= targetSampleNumber) {
                return jA2 <= targetSampleNumber ? BinarySearchSeeker.TimestampSearchResult.underestimatedResult(jA2, peekPosition2) : BinarySearchSeeker.TimestampSearchResult.overestimatedResult(jA, position);
            }
            return BinarySearchSeeker.TimestampSearchResult.targetFoundResult(peekPosition);
        }

        private b(FlacStreamMetadata flacStreamMetadata, int frameStartMarker) {
            this.a = flacStreamMetadata;
            this.b = frameStartMarker;
            this.c = new FlacFrameReader.SampleNumberHolder();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(final FlacStreamMetadata flacStreamMetadata, int frameStartMarker, long firstFramePosition, long inputLength) {
        super(new BinarySearchSeeker.SeekTimestampConverter() { // from class: s82
            @Override // com.google.android.exoplayer2.extractor.BinarySearchSeeker.SeekTimestampConverter
            public final long timeUsToTargetTime(long j) {
                return flacStreamMetadata.getSampleNumber(j);
            }
        }, new b(flacStreamMetadata, frameStartMarker), flacStreamMetadata.getDurationUs(), 0L, flacStreamMetadata.totalSamples, firstFramePosition, inputLength, flacStreamMetadata.getApproxBytesPerFrame(), Math.max(6, flacStreamMetadata.minFrameSize));
        Objects.requireNonNull(flacStreamMetadata);
    }
}
