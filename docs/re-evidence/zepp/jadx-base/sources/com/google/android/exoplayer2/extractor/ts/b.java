package com.google.android.exoplayer2.extractor.ts;

import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.extractor.BinarySearchSeeker;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.TimestampAdjuster;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
final class b extends BinarySearchSeeker {
    private static final long c = 100000;
    private static final int d = 1000;
    private static final int e = 20000;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.extractor.ts.b$b, reason: collision with other inner class name */
    public static final class C0150b implements BinarySearchSeeker.TimestampSeeker {
        private final TimestampAdjuster a;
        private final ParsableByteArray b;

        private BinarySearchSeeker.TimestampSearchResult a(ParsableByteArray packetBuffer, long targetScrTimeUs, long bufferStartOffset) {
            int position = -1;
            long j = -9223372036854775807L;
            int position2 = -1;
            while (packetBuffer.bytesLeft() >= 4) {
                if (b.b(packetBuffer.getData(), packetBuffer.getPosition()) != 442) {
                    packetBuffer.skipBytes(1);
                } else {
                    packetBuffer.skipBytes(4);
                    long jL = c.l(packetBuffer);
                    if (jL != C.TIME_UNSET) {
                        long jAdjustTsTimestamp = this.a.adjustTsTimestamp(jL);
                        if (jAdjustTsTimestamp > targetScrTimeUs) {
                            return j == C.TIME_UNSET ? BinarySearchSeeker.TimestampSearchResult.overestimatedResult(jAdjustTsTimestamp, bufferStartOffset) : BinarySearchSeeker.TimestampSearchResult.targetFoundResult(bufferStartOffset + ((long) position2));
                        }
                        if (100000 + jAdjustTsTimestamp > targetScrTimeUs) {
                            return BinarySearchSeeker.TimestampSearchResult.targetFoundResult(bufferStartOffset + ((long) packetBuffer.getPosition()));
                        }
                        position2 = packetBuffer.getPosition();
                        j = jAdjustTsTimestamp;
                    }
                    b(packetBuffer);
                    position = packetBuffer.getPosition();
                }
            }
            return j != C.TIME_UNSET ? BinarySearchSeeker.TimestampSearchResult.underestimatedResult(j, bufferStartOffset + ((long) position)) : BinarySearchSeeker.TimestampSearchResult.NO_TIMESTAMP_IN_RANGE_RESULT;
        }

        private static void b(ParsableByteArray packetBuffer) {
            int iB;
            int iLimit = packetBuffer.limit();
            if (packetBuffer.bytesLeft() < 10) {
                packetBuffer.setPosition(iLimit);
                return;
            }
            packetBuffer.skipBytes(9);
            int unsignedByte = packetBuffer.readUnsignedByte() & 7;
            if (packetBuffer.bytesLeft() < unsignedByte) {
                packetBuffer.setPosition(iLimit);
                return;
            }
            packetBuffer.skipBytes(unsignedByte);
            if (packetBuffer.bytesLeft() < 4) {
                packetBuffer.setPosition(iLimit);
                return;
            }
            if (b.b(packetBuffer.getData(), packetBuffer.getPosition()) == 443) {
                packetBuffer.skipBytes(4);
                int unsignedShort = packetBuffer.readUnsignedShort();
                if (packetBuffer.bytesLeft() < unsignedShort) {
                    packetBuffer.setPosition(iLimit);
                    return;
                }
                packetBuffer.skipBytes(unsignedShort);
            }
            while (packetBuffer.bytesLeft() >= 4 && (iB = b.b(packetBuffer.getData(), packetBuffer.getPosition())) != 442 && iB != 441 && (iB >>> 8) == 1) {
                packetBuffer.skipBytes(4);
                if (packetBuffer.bytesLeft() < 2) {
                    packetBuffer.setPosition(iLimit);
                    return;
                }
                packetBuffer.setPosition(Math.min(packetBuffer.limit(), packetBuffer.getPosition() + packetBuffer.readUnsignedShort()));
            }
        }

        @Override // com.google.android.exoplayer2.extractor.BinarySearchSeeker.TimestampSeeker
        public void onSeekFinished() {
            this.b.reset(Util.EMPTY_BYTE_ARRAY);
        }

        @Override // com.google.android.exoplayer2.extractor.BinarySearchSeeker.TimestampSeeker
        public BinarySearchSeeker.TimestampSearchResult searchForTimestamp(ExtractorInput input, long targetTimestamp) throws IOException {
            long position = input.getPosition();
            int iMin = (int) Math.min(20000L, input.getLength() - position);
            this.b.reset(iMin);
            input.peekFully(this.b.getData(), 0, iMin);
            return a(this.b, targetTimestamp, position);
        }

        private C0150b(TimestampAdjuster scrTimestampAdjuster) {
            this.a = scrTimestampAdjuster;
            this.b = new ParsableByteArray();
        }
    }

    public b(TimestampAdjuster scrTimestampAdjuster, long streamDurationUs, long inputLength) {
        super(new BinarySearchSeeker.DefaultSeekTimestampConverter(), new C0150b(scrTimestampAdjuster), streamDurationUs, 0L, streamDurationUs + 1, 0L, inputLength, 188L, 1000);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int b(byte[] data, int position) {
        return (data[position + 3] & 255) | ((data[position] & 255) << 24) | ((data[position + 1] & 255) << 16) | ((data[position + 2] & 255) << 8);
    }
}
