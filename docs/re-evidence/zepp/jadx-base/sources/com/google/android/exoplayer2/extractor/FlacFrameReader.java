package com.google.android.exoplayer2.extractor;

import com.airoha.android.lib.fota.fotaState.StageEnum;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class FlacFrameReader {

    public static final class SampleNumberHolder {
        public long sampleNumber;
    }

    private FlacFrameReader() {
    }

    private static boolean a(ParsableByteArray data, FlacStreamMetadata flacStreamMetadata, int blockSizeKey) {
        int frameBlockSizeSamplesFromKey = readFrameBlockSizeSamplesFromKey(data, blockSizeKey);
        return frameBlockSizeSamplesFromKey != -1 && frameBlockSizeSamplesFromKey <= flacStreamMetadata.maxBlockSizeSamples;
    }

    private static boolean b(ParsableByteArray data, int frameStartPosition) {
        return data.readUnsignedByte() == Util.crc8(data.getData(), frameStartPosition, data.getPosition() - 1, 0);
    }

    private static boolean c(ParsableByteArray data, FlacStreamMetadata flacStreamMetadata, boolean isBlockSizeVariable, SampleNumberHolder sampleNumberHolder) {
        try {
            long utf8EncodedLong = data.readUtf8EncodedLong();
            if (!isBlockSizeVariable) {
                utf8EncodedLong *= (long) flacStreamMetadata.maxBlockSizeSamples;
            }
            sampleNumberHolder.sampleNumber = utf8EncodedLong;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public static boolean checkAndReadFrameHeader(ParsableByteArray data, FlacStreamMetadata flacStreamMetadata, int frameStartMarker, SampleNumberHolder sampleNumberHolder) {
        int position = data.getPosition();
        long unsignedInt = data.readUnsignedInt();
        long j = unsignedInt >>> 16;
        if (j != frameStartMarker) {
            return false;
        }
        return f((int) (15 & (unsignedInt >> 4)), flacStreamMetadata) && e((int) ((unsignedInt >> 1) & 7), flacStreamMetadata) && !(((unsignedInt & 1) > 1L ? 1 : ((unsignedInt & 1) == 1L ? 0 : -1)) == 0) && c(data, flacStreamMetadata, ((j & 1) > 1L ? 1 : ((j & 1) == 1L ? 0 : -1)) == 0, sampleNumberHolder) && a(data, flacStreamMetadata, (int) ((unsignedInt >> 12) & 15)) && d(data, flacStreamMetadata, (int) ((unsignedInt >> 8) & 15)) && b(data, position);
    }

    public static boolean checkFrameHeaderFromPeek(ExtractorInput input, FlacStreamMetadata flacStreamMetadata, int frameStartMarker, SampleNumberHolder sampleNumberHolder) throws IOException {
        long peekPosition = input.getPeekPosition();
        byte[] bArr = new byte[2];
        input.peekFully(bArr, 0, 2);
        if ((((bArr[0] & 255) << 8) | (bArr[1] & 255)) != frameStartMarker) {
            input.resetPeekPosition();
            input.advancePeekPosition((int) (peekPosition - input.getPosition()));
            return false;
        }
        ParsableByteArray parsableByteArray = new ParsableByteArray(16);
        System.arraycopy(bArr, 0, parsableByteArray.getData(), 0, 2);
        parsableByteArray.setLimit(ExtractorUtil.peekToLength(input, parsableByteArray.getData(), 2, 14));
        input.resetPeekPosition();
        input.advancePeekPosition((int) (peekPosition - input.getPosition()));
        return checkAndReadFrameHeader(parsableByteArray, flacStreamMetadata, frameStartMarker, sampleNumberHolder);
    }

    private static boolean d(ParsableByteArray data, FlacStreamMetadata flacStreamMetadata, int sampleRateKey) {
        int i = flacStreamMetadata.sampleRate;
        if (sampleRateKey == 0) {
            return true;
        }
        if (sampleRateKey <= 11) {
            return sampleRateKey == flacStreamMetadata.sampleRateLookupKey;
        }
        if (sampleRateKey == 12) {
            return data.readUnsignedByte() * 1000 == i;
        }
        if (sampleRateKey > 14) {
            return false;
        }
        int unsignedShort = data.readUnsignedShort();
        if (sampleRateKey == 14) {
            unsignedShort *= 10;
        }
        return unsignedShort == i;
    }

    private static boolean e(int bitsPerSampleKey, FlacStreamMetadata flacStreamMetadata) {
        return bitsPerSampleKey == 0 || bitsPerSampleKey == flacStreamMetadata.bitsPerSampleLookupKey;
    }

    private static boolean f(int channelAssignmentKey, FlacStreamMetadata flacStreamMetadata) {
        if (channelAssignmentKey <= 7) {
            return channelAssignmentKey == flacStreamMetadata.channels - 1;
        }
        return channelAssignmentKey <= 10 && flacStreamMetadata.channels == 2;
    }

    public static long getFirstSampleNumber(ExtractorInput input, FlacStreamMetadata flacStreamMetadata) throws IOException {
        input.resetPeekPosition();
        input.advancePeekPosition(1);
        byte[] bArr = new byte[1];
        input.peekFully(bArr, 0, 1);
        boolean z = (bArr[0] & 1) == 1;
        input.advancePeekPosition(2);
        int i = z ? 7 : 6;
        ParsableByteArray parsableByteArray = new ParsableByteArray(i);
        parsableByteArray.setLimit(ExtractorUtil.peekToLength(input, parsableByteArray.getData(), 0, i));
        input.resetPeekPosition();
        SampleNumberHolder sampleNumberHolder = new SampleNumberHolder();
        if (c(parsableByteArray, flacStreamMetadata, z, sampleNumberHolder)) {
            return sampleNumberHolder.sampleNumber;
        }
        throw ParserException.createForMalformedContainer(null, null);
    }

    public static int readFrameBlockSizeSamplesFromKey(ParsableByteArray data, int blockSizeKey) {
        switch (blockSizeKey) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return StageEnum.APP_RESULT_FOTA_NV_SUCCESS << (blockSizeKey - 2);
            case 6:
                return data.readUnsignedByte() + 1;
            case 7:
                return data.readUnsignedShort() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return 256 << (blockSizeKey - 8);
            default:
                return -1;
        }
    }
}
