package com.google.android.exoplayer2.extractor.wav;

import android.util.Pair;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.audio.WavUtil;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import com.google.android.exoplayer2.v;

/* JADX INFO: loaded from: classes13.dex */
final class WavHeaderReader {
    private static final String TAG = "WavHeaderReader";

    public static final class ChunkHeader {
        public static final int SIZE_IN_BYTES = 8;

        /* JADX INFO: renamed from: id, reason: collision with root package name */
        public final int f53001id;
        public final long size;

        private ChunkHeader(int i14, long j8) {
            this.f53001id = i14;
            this.size = j8;
        }

        public static ChunkHeader peek(ExtractorInput extractorInput, ParsableByteArray parsableByteArray) {
            extractorInput.peekFully(parsableByteArray.getData(), 0, 8);
            parsableByteArray.setPosition(0);
            return new ChunkHeader(parsableByteArray.readInt(), parsableByteArray.readLittleEndianUnsignedInt());
        }
    }

    private WavHeaderReader() {
    }

    public static boolean checkFileType(ExtractorInput extractorInput) {
        ParsableByteArray parsableByteArray = new ParsableByteArray(8);
        int i14 = ChunkHeader.peek(extractorInput, parsableByteArray).f53001id;
        if (i14 != 1380533830 && i14 != 1380333108) {
            return false;
        }
        extractorInput.peekFully(parsableByteArray.getData(), 0, 4);
        parsableByteArray.setPosition(0);
        int i15 = parsableByteArray.readInt();
        if (i15 == 1463899717) {
            return true;
        }
        StringBuilder sb3 = new StringBuilder(34);
        sb3.append("Unsupported form type: ");
        sb3.append(i15);
        Log.e(TAG, sb3.toString());
        return false;
    }

    public static WavFormat readFormat(ExtractorInput extractorInput) {
        byte[] bArr;
        ParsableByteArray parsableByteArray = new ParsableByteArray(16);
        ChunkHeader chunkHeaderSkipToChunk = skipToChunk(WavUtil.FMT_FOURCC, extractorInput, parsableByteArray);
        Assertions.checkState(chunkHeaderSkipToChunk.size >= 16);
        extractorInput.peekFully(parsableByteArray.getData(), 0, 16);
        parsableByteArray.setPosition(0);
        int littleEndianUnsignedShort = parsableByteArray.readLittleEndianUnsignedShort();
        int littleEndianUnsignedShort2 = parsableByteArray.readLittleEndianUnsignedShort();
        int littleEndianUnsignedIntToInt = parsableByteArray.readLittleEndianUnsignedIntToInt();
        int littleEndianUnsignedIntToInt2 = parsableByteArray.readLittleEndianUnsignedIntToInt();
        int littleEndianUnsignedShort3 = parsableByteArray.readLittleEndianUnsignedShort();
        int littleEndianUnsignedShort4 = parsableByteArray.readLittleEndianUnsignedShort();
        int i14 = ((int) chunkHeaderSkipToChunk.size) - 16;
        if (i14 > 0) {
            bArr = new byte[i14];
            extractorInput.peekFully(bArr, 0, i14);
        } else {
            bArr = Util.EMPTY_BYTE_ARRAY;
        }
        byte[] bArr2 = bArr;
        extractorInput.skipFully((int) (extractorInput.getPeekPosition() - extractorInput.getPosition()));
        return new WavFormat(littleEndianUnsignedShort, littleEndianUnsignedShort2, littleEndianUnsignedIntToInt, littleEndianUnsignedIntToInt2, littleEndianUnsignedShort3, littleEndianUnsignedShort4, bArr2);
    }

    public static long readRf64SampleDataSize(ExtractorInput extractorInput) {
        ParsableByteArray parsableByteArray = new ParsableByteArray(8);
        ChunkHeader chunkHeaderPeek = ChunkHeader.peek(extractorInput, parsableByteArray);
        if (chunkHeaderPeek.f53001id != 1685272116) {
            extractorInput.resetPeekPosition();
            return -1L;
        }
        extractorInput.advancePeekPosition(8);
        parsableByteArray.setPosition(0);
        extractorInput.peekFully(parsableByteArray.getData(), 0, 8);
        long littleEndianLong = parsableByteArray.readLittleEndianLong();
        extractorInput.skipFully(((int) chunkHeaderPeek.size) + 8);
        return littleEndianLong;
    }

    private static ChunkHeader skipToChunk(int i14, ExtractorInput extractorInput, ParsableByteArray parsableByteArray) throws ParserException {
        ChunkHeader chunkHeaderPeek = ChunkHeader.peek(extractorInput, parsableByteArray);
        while (true) {
            int i15 = chunkHeaderPeek.f53001id;
            if (i15 == i14) {
                return chunkHeaderPeek;
            }
            v.e(39, i15, "Ignoring unknown WAV chunk: ", TAG);
            long j8 = chunkHeaderPeek.size + 8;
            if (j8 > 2147483647L) {
                int i16 = chunkHeaderPeek.f53001id;
                StringBuilder sb3 = new StringBuilder(51);
                sb3.append("Chunk is too large (~2GB+) to skip; id: ");
                sb3.append(i16);
                throw ParserException.createForUnsupportedContainerFeature(sb3.toString());
            }
            extractorInput.skipFully((int) j8);
            chunkHeaderPeek = ChunkHeader.peek(extractorInput, parsableByteArray);
        }
    }

    public static Pair<Long, Long> skipToSampleData(ExtractorInput extractorInput) {
        extractorInput.resetPeekPosition();
        ChunkHeader chunkHeaderSkipToChunk = skipToChunk(1684108385, extractorInput, new ParsableByteArray(8));
        extractorInput.skipFully(8);
        return Pair.create(Long.valueOf(extractorInput.getPosition()), Long.valueOf(chunkHeaderSkipToChunk.size));
    }
}
