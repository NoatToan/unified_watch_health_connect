package com.google.android.exoplayer2.extractor.ts;

import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.PositionHolder;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.TimestampAdjuster;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
final class c {
    private static final int i = 20000;
    private boolean c;
    private boolean d;
    private boolean e;
    private final TimestampAdjuster a = new TimestampAdjuster(0);
    private long f = C.TIME_UNSET;
    private long g = C.TIME_UNSET;
    private long h = C.TIME_UNSET;
    private final ParsableByteArray b = new ParsableByteArray();

    private static boolean a(byte[] scrBytes) {
        return (scrBytes[0] & 196) == 68 && (scrBytes[2] & 4) == 4 && (scrBytes[4] & 4) == 4 && (scrBytes[5] & 1) == 1 && (scrBytes[8] & 3) == 3;
    }

    private int b(ExtractorInput input) {
        this.b.reset(Util.EMPTY_BYTE_ARRAY);
        this.c = true;
        input.resetPeekPosition();
        return 0;
    }

    private int f(byte[] data, int position) {
        return (data[position + 3] & 255) | ((data[position] & 255) << 24) | ((data[position + 1] & 255) << 16) | ((data[position + 2] & 255) << 8);
    }

    private int h(ExtractorInput input, PositionHolder seekPositionHolder) throws IOException {
        int iMin = (int) Math.min(20000L, input.getLength());
        long j = 0;
        if (input.getPosition() != j) {
            seekPositionHolder.position = j;
            return 1;
        }
        this.b.reset(iMin);
        input.resetPeekPosition();
        input.peekFully(this.b.getData(), 0, iMin);
        this.f = i(this.b);
        this.d = true;
        return 0;
    }

    private long i(ParsableByteArray packetBuffer) {
        int iLimit = packetBuffer.limit();
        for (int position = packetBuffer.getPosition(); position < iLimit - 3; position++) {
            if (f(packetBuffer.getData(), position) == 442) {
                packetBuffer.setPosition(position + 4);
                long jL = l(packetBuffer);
                if (jL != C.TIME_UNSET) {
                    return jL;
                }
            }
        }
        return C.TIME_UNSET;
    }

    private int j(ExtractorInput input, PositionHolder seekPositionHolder) throws IOException {
        long length = input.getLength();
        int iMin = (int) Math.min(20000L, length);
        long j = length - ((long) iMin);
        if (input.getPosition() != j) {
            seekPositionHolder.position = j;
            return 1;
        }
        this.b.reset(iMin);
        input.resetPeekPosition();
        input.peekFully(this.b.getData(), 0, iMin);
        this.g = k(this.b);
        this.e = true;
        return 0;
    }

    private long k(ParsableByteArray packetBuffer) {
        int position = packetBuffer.getPosition();
        for (int iLimit = packetBuffer.limit() - 4; iLimit >= position; iLimit--) {
            if (f(packetBuffer.getData(), iLimit) == 442) {
                packetBuffer.setPosition(iLimit + 4);
                long jL = l(packetBuffer);
                if (jL != C.TIME_UNSET) {
                    return jL;
                }
            }
        }
        return C.TIME_UNSET;
    }

    public static long l(ParsableByteArray packetBuffer) {
        int position = packetBuffer.getPosition();
        if (packetBuffer.bytesLeft() < 9) {
            return C.TIME_UNSET;
        }
        byte[] bArr = new byte[9];
        packetBuffer.readBytes(bArr, 0, 9);
        packetBuffer.setPosition(position);
        return !a(bArr) ? C.TIME_UNSET : m(bArr);
    }

    private static long m(byte[] scrBytes) {
        return (((((long) scrBytes[0]) & 56) >> 3) << 30) | ((((long) scrBytes[0]) & 3) << 28) | ((((long) scrBytes[1]) & 255) << 20) | (((((long) scrBytes[2]) & 248) >> 3) << 15) | ((((long) scrBytes[2]) & 3) << 13) | ((((long) scrBytes[3]) & 255) << 5) | ((((long) scrBytes[4]) & 248) >> 3);
    }

    public long c() {
        return this.h;
    }

    public TimestampAdjuster d() {
        return this.a;
    }

    public boolean e() {
        return this.c;
    }

    public int g(ExtractorInput input, PositionHolder seekPositionHolder) throws IOException {
        if (!this.e) {
            return j(input, seekPositionHolder);
        }
        if (this.g == C.TIME_UNSET) {
            return b(input);
        }
        if (!this.d) {
            return h(input, seekPositionHolder);
        }
        long j = this.f;
        if (j == C.TIME_UNSET) {
            return b(input);
        }
        this.h = this.a.adjustTsTimestamp(this.g) - this.a.adjustTsTimestamp(j);
        return b(input);
    }
}
