package com.google.android.exoplayer2.extractor.mkv;

import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.common.primitives.UnsignedBytes;

/* JADX INFO: loaded from: classes13.dex */
final class Sniffer {
    private static final int ID_EBML = 440786851;
    private static final int SEARCH_LENGTH = 1024;
    private int peekLength;
    private final ParsableByteArray scratch = new ParsableByteArray(8);

    private long readUint(ExtractorInput extractorInput) {
        int i14 = 0;
        extractorInput.peekFully(this.scratch.getData(), 0, 1);
        int i15 = this.scratch.getData()[0] & UnsignedBytes.MAX_VALUE;
        if (i15 == 0) {
            return Long.MIN_VALUE;
        }
        int i16 = 128;
        int i17 = 0;
        while ((i15 & i16) == 0) {
            i16 >>= 1;
            i17++;
        }
        int i18 = i15 & (~i16);
        extractorInput.peekFully(this.scratch.getData(), 1, i17);
        while (i14 < i17) {
            i14++;
            i18 = (this.scratch.getData()[i14] & UnsignedBytes.MAX_VALUE) + (i18 << 8);
        }
        this.peekLength = i17 + 1 + this.peekLength;
        return i18;
    }

    public boolean sniff(ExtractorInput extractorInput) {
        long length = extractorInput.getLength();
        long j8 = 1024;
        if (length != -1 && length <= 1024) {
            j8 = length;
        }
        int i14 = (int) j8;
        extractorInput.peekFully(this.scratch.getData(), 0, 4);
        long unsignedInt = this.scratch.readUnsignedInt();
        this.peekLength = 4;
        while (unsignedInt != 440786851) {
            int i15 = this.peekLength + 1;
            this.peekLength = i15;
            if (i15 == i14) {
                return false;
            }
            extractorInput.peekFully(this.scratch.getData(), 0, 1);
            unsignedInt = ((unsignedInt << 8) & (-256)) | ((long) (this.scratch.getData()[0] & UnsignedBytes.MAX_VALUE));
        }
        long uint = readUint(extractorInput);
        long j14 = this.peekLength;
        if (uint != Long.MIN_VALUE && (length == -1 || j14 + uint < length)) {
            while (true) {
                int i16 = this.peekLength;
                long j15 = j14 + uint;
                if (i16 < j15) {
                    if (readUint(extractorInput) == Long.MIN_VALUE) {
                        return false;
                    }
                    long uint2 = readUint(extractorInput);
                    if (uint2 < 0 || uint2 > 2147483647L) {
                        return false;
                    }
                    if (uint2 != 0) {
                        int i17 = (int) uint2;
                        extractorInput.advancePeekPosition(i17);
                        this.peekLength += i17;
                    }
                } else if (i16 == j15) {
                    return true;
                }
            }
        }
        return false;
    }
}
