package com.google.android.exoplayer2.extractor.wav;

import android.util.Pair;
import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.base.ParserMinimalBase;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
final class b {
    private static final String a = "WavHeaderReader";

    public static final class a {
        public static final int c = 8;
        public final int a;
        public final long b;

        private a(int id, long size) {
            this.a = id;
            this.b = size;
        }

        public static a a(ExtractorInput input, ParsableByteArray scratch) throws IOException {
            input.peekFully(scratch.getData(), 0, 8);
            scratch.setPosition(0);
            return new a(scratch.readInt(), scratch.readLittleEndianUnsignedInt());
        }
    }

    private b() {
    }

    @Nullable
    public static com.google.android.exoplayer2.extractor.wav.a a(ExtractorInput input) throws IOException {
        byte[] bArr;
        Assertions.checkNotNull(input);
        ParsableByteArray parsableByteArray = new ParsableByteArray(16);
        if (a.a(input, parsableByteArray).a != 1380533830) {
            return null;
        }
        input.peekFully(parsableByteArray.getData(), 0, 4);
        parsableByteArray.setPosition(0);
        int i = parsableByteArray.readInt();
        if (i != 1463899717) {
            StringBuilder sb = new StringBuilder(36);
            sb.append("Unsupported RIFF format: ");
            sb.append(i);
            Log.e(a, sb.toString());
            return null;
        }
        a aVarA = a.a(input, parsableByteArray);
        while (aVarA.a != 1718449184) {
            input.advancePeekPosition((int) aVarA.b);
            aVarA = a.a(input, parsableByteArray);
        }
        Assertions.checkState(aVarA.b >= 16);
        input.peekFully(parsableByteArray.getData(), 0, 16);
        parsableByteArray.setPosition(0);
        int littleEndianUnsignedShort = parsableByteArray.readLittleEndianUnsignedShort();
        int littleEndianUnsignedShort2 = parsableByteArray.readLittleEndianUnsignedShort();
        int littleEndianUnsignedIntToInt = parsableByteArray.readLittleEndianUnsignedIntToInt();
        int littleEndianUnsignedIntToInt2 = parsableByteArray.readLittleEndianUnsignedIntToInt();
        int littleEndianUnsignedShort3 = parsableByteArray.readLittleEndianUnsignedShort();
        int littleEndianUnsignedShort4 = parsableByteArray.readLittleEndianUnsignedShort();
        int i2 = ((int) aVarA.b) - 16;
        if (i2 > 0) {
            byte[] bArr2 = new byte[i2];
            input.peekFully(bArr2, 0, i2);
            bArr = bArr2;
        } else {
            bArr = Util.EMPTY_BYTE_ARRAY;
        }
        return new com.google.android.exoplayer2.extractor.wav.a(littleEndianUnsignedShort, littleEndianUnsignedShort2, littleEndianUnsignedIntToInt, littleEndianUnsignedIntToInt2, littleEndianUnsignedShort3, littleEndianUnsignedShort4, bArr);
    }

    public static Pair<Long, Long> b(ExtractorInput input) throws IOException {
        Assertions.checkNotNull(input);
        input.resetPeekPosition();
        ParsableByteArray parsableByteArray = new ParsableByteArray(8);
        a aVarA = a.a(input, parsableByteArray);
        while (true) {
            int i = aVarA.a;
            if (i == 1684108385) {
                input.skipFully(8);
                long position = input.getPosition();
                long j = aVarA.b + position;
                long length = input.getLength();
                if (length != -1 && j > length) {
                    StringBuilder sb = new StringBuilder(69);
                    sb.append("Data exceeds input length: ");
                    sb.append(j);
                    sb.append(", ");
                    sb.append(length);
                    Log.w(a, sb.toString());
                    j = length;
                }
                return Pair.create(Long.valueOf(position), Long.valueOf(j));
            }
            if (i != 1380533830 && i != 1718449184) {
                StringBuilder sb2 = new StringBuilder(39);
                sb2.append("Ignoring unknown WAV chunk: ");
                sb2.append(i);
                Log.w(a, sb2.toString());
            }
            long j2 = aVarA.b + 8;
            int i2 = aVarA.a;
            if (i2 == 1380533830) {
                j2 = 12;
            }
            if (j2 > ParserMinimalBase.MAX_INT_L) {
                StringBuilder sb3 = new StringBuilder(51);
                sb3.append("Chunk is too large (~2GB+) to skip; id: ");
                sb3.append(i2);
                throw ParserException.createForUnsupportedContainerFeature(sb3.toString());
            }
            input.skipFully((int) j2);
            aVarA = a.a(input, parsableByteArray);
        }
    }
}
