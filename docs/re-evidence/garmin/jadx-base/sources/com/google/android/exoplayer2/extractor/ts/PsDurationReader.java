package com.google.android.exoplayer2.extractor.ts;

import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.PositionHolder;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.TimestampAdjuster;
import com.google.android.exoplayer2.util.Util;
import com.google.common.primitives.UnsignedBytes;

/* JADX INFO: loaded from: classes13.dex */
final class PsDurationReader {
    private static final String TAG = "PsDurationReader";
    private static final int TIMESTAMP_SEARCH_BYTES = 20000;
    private boolean isDurationRead;
    private boolean isFirstScrValueRead;
    private boolean isLastScrValueRead;
    private final TimestampAdjuster scrTimestampAdjuster = new TimestampAdjuster(0);
    private long firstScrValue = C.TIME_UNSET;
    private long lastScrValue = C.TIME_UNSET;
    private long durationUs = C.TIME_UNSET;
    private final ParsableByteArray packetBuffer = new ParsableByteArray();

    private static boolean checkMarkerBits(byte[] bArr) {
        return (bArr[0] & 196) == 68 && (bArr[2] & 4) == 4 && (bArr[4] & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3;
    }

    private int finishReadDuration(ExtractorInput extractorInput) {
        this.packetBuffer.reset(Util.EMPTY_BYTE_ARRAY);
        this.isDurationRead = true;
        extractorInput.resetPeekPosition();
        return 0;
    }

    private int peekIntAtPosition(byte[] bArr, int i14) {
        return (bArr[i14 + 3] & UnsignedBytes.MAX_VALUE) | ((bArr[i14] & UnsignedBytes.MAX_VALUE) << 24) | ((bArr[i14 + 1] & UnsignedBytes.MAX_VALUE) << 16) | ((bArr[i14 + 2] & UnsignedBytes.MAX_VALUE) << 8);
    }

    private int readFirstScrValue(ExtractorInput extractorInput, PositionHolder positionHolder) {
        int iMin = (int) Math.min(20000L, extractorInput.getLength());
        long j8 = 0;
        if (extractorInput.getPosition() != j8) {
            positionHolder.position = j8;
            return 1;
        }
        this.packetBuffer.reset(iMin);
        extractorInput.resetPeekPosition();
        extractorInput.peekFully(this.packetBuffer.getData(), 0, iMin);
        this.firstScrValue = readFirstScrValueFromBuffer(this.packetBuffer);
        this.isFirstScrValueRead = true;
        return 0;
    }

    private long readFirstScrValueFromBuffer(ParsableByteArray parsableByteArray) {
        int iLimit = parsableByteArray.limit();
        for (int position = parsableByteArray.getPosition(); position < iLimit - 3; position++) {
            if (peekIntAtPosition(parsableByteArray.getData(), position) == 442) {
                parsableByteArray.setPosition(position + 4);
                long scrValueFromPack = readScrValueFromPack(parsableByteArray);
                if (scrValueFromPack != C.TIME_UNSET) {
                    return scrValueFromPack;
                }
            }
        }
        return C.TIME_UNSET;
    }

    private int readLastScrValue(ExtractorInput extractorInput, PositionHolder positionHolder) {
        long length = extractorInput.getLength();
        int iMin = (int) Math.min(20000L, length);
        long j8 = length - ((long) iMin);
        if (extractorInput.getPosition() != j8) {
            positionHolder.position = j8;
            return 1;
        }
        this.packetBuffer.reset(iMin);
        extractorInput.resetPeekPosition();
        extractorInput.peekFully(this.packetBuffer.getData(), 0, iMin);
        this.lastScrValue = readLastScrValueFromBuffer(this.packetBuffer);
        this.isLastScrValueRead = true;
        return 0;
    }

    private long readLastScrValueFromBuffer(ParsableByteArray parsableByteArray) {
        int position = parsableByteArray.getPosition();
        for (int iLimit = parsableByteArray.limit() - 4; iLimit >= position; iLimit--) {
            if (peekIntAtPosition(parsableByteArray.getData(), iLimit) == 442) {
                parsableByteArray.setPosition(iLimit + 4);
                long scrValueFromPack = readScrValueFromPack(parsableByteArray);
                if (scrValueFromPack != C.TIME_UNSET) {
                    return scrValueFromPack;
                }
            }
        }
        return C.TIME_UNSET;
    }

    public static long readScrValueFromPack(ParsableByteArray parsableByteArray) {
        int position = parsableByteArray.getPosition();
        if (parsableByteArray.bytesLeft() < 9) {
            return C.TIME_UNSET;
        }
        byte[] bArr = new byte[9];
        parsableByteArray.readBytes(bArr, 0, 9);
        parsableByteArray.setPosition(position);
        return !checkMarkerBits(bArr) ? C.TIME_UNSET : readScrValueFromPackHeader(bArr);
    }

    private static long readScrValueFromPackHeader(byte[] bArr) {
        byte b14 = bArr[0];
        long j8 = (((((long) b14) & 56) >> 3) << 30) | ((((long) b14) & 3) << 28) | ((((long) bArr[1]) & 255) << 20);
        byte b15 = bArr[2];
        return j8 | (((((long) b15) & 248) >> 3) << 15) | ((((long) b15) & 3) << 13) | ((((long) bArr[3]) & 255) << 5) | ((((long) bArr[4]) & 248) >> 3);
    }

    public long getDurationUs() {
        return this.durationUs;
    }

    public TimestampAdjuster getScrTimestampAdjuster() {
        return this.scrTimestampAdjuster;
    }

    public boolean isDurationReadFinished() {
        return this.isDurationRead;
    }

    public int readDuration(ExtractorInput extractorInput, PositionHolder positionHolder) {
        if (!this.isLastScrValueRead) {
            return readLastScrValue(extractorInput, positionHolder);
        }
        if (this.lastScrValue == C.TIME_UNSET) {
            return finishReadDuration(extractorInput);
        }
        if (!this.isFirstScrValueRead) {
            return readFirstScrValue(extractorInput, positionHolder);
        }
        long j8 = this.firstScrValue;
        if (j8 == C.TIME_UNSET) {
            return finishReadDuration(extractorInput);
        }
        long jAdjustTsTimestamp = this.scrTimestampAdjuster.adjustTsTimestamp(this.lastScrValue) - this.scrTimestampAdjuster.adjustTsTimestamp(j8);
        this.durationUs = jAdjustTsTimestamp;
        if (jAdjustTsTimestamp < 0) {
            StringBuilder sb3 = new StringBuilder(65);
            sb3.append("Invalid duration: ");
            sb3.append(jAdjustTsTimestamp);
            sb3.append(". Using TIME_UNSET instead.");
            Log.w(TAG, sb3.toString());
            this.durationUs = C.TIME_UNSET;
        }
        return finishReadDuration(extractorInput);
    }
}
