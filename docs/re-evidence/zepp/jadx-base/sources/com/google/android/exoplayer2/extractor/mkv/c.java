package com.google.android.exoplayer2.extractor.mkv;

import com.fasterxml.jackson.core.base.ParserMinimalBase;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
final class c {
    private static final int c = 1024;
    private static final int d = 440786851;
    private final ParsableByteArray a = new ParsableByteArray(8);
    private int b;

    private long a(ExtractorInput input) throws IOException {
        int i = 0;
        input.peekFully(this.a.getData(), 0, 1);
        int i2 = this.a.getData()[0] & 255;
        if (i2 == 0) {
            return Long.MIN_VALUE;
        }
        int i3 = 128;
        int i4 = 0;
        while ((i2 & i3) == 0) {
            i3 >>= 1;
            i4++;
        }
        int i5 = i2 & (~i3);
        input.peekFully(this.a.getData(), 1, i4);
        while (i < i4) {
            i++;
            i5 = (this.a.getData()[i] & 255) + (i5 << 8);
        }
        this.b += i4 + 1;
        return i5;
    }

    public boolean b(ExtractorInput input) throws IOException {
        long length = input.getLength();
        long j = 1024;
        if (length != -1 && length <= 1024) {
            j = length;
        }
        int i = (int) j;
        input.peekFully(this.a.getData(), 0, 4);
        long unsignedInt = this.a.readUnsignedInt();
        this.b = 4;
        while (unsignedInt != 440786851) {
            int i2 = this.b + 1;
            this.b = i2;
            if (i2 == i) {
                return false;
            }
            input.peekFully(this.a.getData(), 0, 1);
            unsignedInt = ((unsignedInt << 8) & (-256)) | ((long) (this.a.getData()[0] & 255));
        }
        long jA = a(input);
        long j2 = this.b;
        if (jA == Long.MIN_VALUE) {
            return false;
        }
        if (length != -1 && j2 + jA >= length) {
            return false;
        }
        while (true) {
            int i3 = this.b;
            long j3 = j2 + jA;
            if (i3 >= j3) {
                return ((long) i3) == j3;
            }
            if (a(input) == Long.MIN_VALUE) {
                return false;
            }
            long jA2 = a(input);
            if (jA2 < 0 || jA2 > ParserMinimalBase.MAX_INT_L) {
                return false;
            }
            if (jA2 != 0) {
                int i4 = (int) jA2;
                input.advancePeekPosition(i4);
                this.b += i4;
            }
        }
    }
}
