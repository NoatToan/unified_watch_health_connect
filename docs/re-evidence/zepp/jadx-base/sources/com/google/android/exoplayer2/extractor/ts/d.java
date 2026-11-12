package com.google.android.exoplayer2.extractor.ts;

import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.extractor.BinarySearchSeeker;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.TimestampAdjuster;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
final class d extends BinarySearchSeeker {
    private static final long c = 100000;
    private static final int d = 940;

    public static final class a implements BinarySearchSeeker.TimestampSeeker {
        private final TimestampAdjuster a;
        private final ParsableByteArray b = new ParsableByteArray();
        private final int c;
        private final int d;

        public a(int pcrPid, TimestampAdjuster pcrTimestampAdjuster, int timestampSearchBytes) {
            this.c = pcrPid;
            this.a = pcrTimestampAdjuster;
            this.d = timestampSearchBytes;
        }

        private BinarySearchSeeker.TimestampSearchResult a(ParsableByteArray packetBuffer, long targetPcrTimeUs, long bufferStartOffset) {
            int iFindSyncBytePosition;
            int iFindSyncBytePosition2;
            int iLimit = packetBuffer.limit();
            long j = -1;
            long j2 = -1;
            long j3 = -9223372036854775807L;
            while (packetBuffer.bytesLeft() >= 188 && (iFindSyncBytePosition2 = (iFindSyncBytePosition = TsUtil.findSyncBytePosition(packetBuffer.getData(), packetBuffer.getPosition(), iLimit)) + 188) <= iLimit) {
                long pcrFromPacket = TsUtil.readPcrFromPacket(packetBuffer, iFindSyncBytePosition, this.c);
                if (pcrFromPacket != C.TIME_UNSET) {
                    long jAdjustTsTimestamp = this.a.adjustTsTimestamp(pcrFromPacket);
                    if (jAdjustTsTimestamp > targetPcrTimeUs) {
                        return j3 == C.TIME_UNSET ? BinarySearchSeeker.TimestampSearchResult.overestimatedResult(jAdjustTsTimestamp, bufferStartOffset) : BinarySearchSeeker.TimestampSearchResult.targetFoundResult(bufferStartOffset + j2);
                    }
                    if (100000 + jAdjustTsTimestamp > targetPcrTimeUs) {
                        return BinarySearchSeeker.TimestampSearchResult.targetFoundResult(bufferStartOffset + ((long) iFindSyncBytePosition));
                    }
                    j2 = iFindSyncBytePosition;
                    j3 = jAdjustTsTimestamp;
                }
                packetBuffer.setPosition(iFindSyncBytePosition2);
                j = iFindSyncBytePosition2;
            }
            return j3 != C.TIME_UNSET ? BinarySearchSeeker.TimestampSearchResult.underestimatedResult(j3, bufferStartOffset + j) : BinarySearchSeeker.TimestampSearchResult.NO_TIMESTAMP_IN_RANGE_RESULT;
        }

        @Override // com.google.android.exoplayer2.extractor.BinarySearchSeeker.TimestampSeeker
        public void onSeekFinished() {
            this.b.reset(Util.EMPTY_BYTE_ARRAY);
        }

        @Override // com.google.android.exoplayer2.extractor.BinarySearchSeeker.TimestampSeeker
        public BinarySearchSeeker.TimestampSearchResult searchForTimestamp(ExtractorInput input, long targetTimestamp) throws IOException {
            long position = input.getPosition();
            int iMin = (int) Math.min(this.d, input.getLength() - position);
            this.b.reset(iMin);
            input.peekFully(this.b.getData(), 0, iMin);
            return a(this.b, targetTimestamp, position);
        }
    }

    public d(TimestampAdjuster pcrTimestampAdjuster, long streamDurationUs, long inputLength, int pcrPid, int timestampSearchBytes) {
        super(new BinarySearchSeeker.DefaultSeekTimestampConverter(), new a(pcrPid, pcrTimestampAdjuster, timestampSearchBytes), streamDurationUs, 0L, streamDurationUs + 1, 0L, inputLength, 188L, d);
    }
}
