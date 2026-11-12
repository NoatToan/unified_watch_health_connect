package com.google.android.exoplayer2.extractor.ts;

import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.PositionHolder;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.TimestampAdjuster;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
final class e {
    private final int a;
    private boolean d;
    private boolean e;
    private boolean f;
    private final TimestampAdjuster b = new TimestampAdjuster(0);
    private long g = C.TIME_UNSET;
    private long h = C.TIME_UNSET;
    private long i = C.TIME_UNSET;
    private final ParsableByteArray c = new ParsableByteArray();

    public e(int timestampSearchBytes) {
        this.a = timestampSearchBytes;
    }

    private int a(ExtractorInput input) {
        this.c.reset(Util.EMPTY_BYTE_ARRAY);
        this.d = true;
        input.resetPeekPosition();
        return 0;
    }

    private int f(ExtractorInput input, PositionHolder seekPositionHolder, int pcrPid) throws IOException {
        int iMin = (int) Math.min(this.a, input.getLength());
        long j = 0;
        if (input.getPosition() != j) {
            seekPositionHolder.position = j;
            return 1;
        }
        this.c.reset(iMin);
        input.resetPeekPosition();
        input.peekFully(this.c.getData(), 0, iMin);
        this.g = g(this.c, pcrPid);
        this.e = true;
        return 0;
    }

    private long g(ParsableByteArray packetBuffer, int pcrPid) {
        int iLimit = packetBuffer.limit();
        for (int position = packetBuffer.getPosition(); position < iLimit; position++) {
            if (packetBuffer.getData()[position] == 71) {
                long pcrFromPacket = TsUtil.readPcrFromPacket(packetBuffer, position, pcrPid);
                if (pcrFromPacket != C.TIME_UNSET) {
                    return pcrFromPacket;
                }
            }
        }
        return C.TIME_UNSET;
    }

    private int h(ExtractorInput input, PositionHolder seekPositionHolder, int pcrPid) throws IOException {
        long length = input.getLength();
        int iMin = (int) Math.min(this.a, length);
        long j = length - ((long) iMin);
        if (input.getPosition() != j) {
            seekPositionHolder.position = j;
            return 1;
        }
        this.c.reset(iMin);
        input.resetPeekPosition();
        input.peekFully(this.c.getData(), 0, iMin);
        this.h = i(this.c, pcrPid);
        this.f = true;
        return 0;
    }

    private long i(ParsableByteArray packetBuffer, int pcrPid) {
        int position = packetBuffer.getPosition();
        int iLimit = packetBuffer.limit();
        for (int i = iLimit - 188; i >= position; i--) {
            if (TsUtil.isStartOfTsPacket(packetBuffer.getData(), position, iLimit, i)) {
                long pcrFromPacket = TsUtil.readPcrFromPacket(packetBuffer, i, pcrPid);
                if (pcrFromPacket != C.TIME_UNSET) {
                    return pcrFromPacket;
                }
            }
        }
        return C.TIME_UNSET;
    }

    public long b() {
        return this.i;
    }

    public TimestampAdjuster c() {
        return this.b;
    }

    public boolean d() {
        return this.d;
    }

    public int e(ExtractorInput input, PositionHolder seekPositionHolder, int pcrPid) throws IOException {
        if (pcrPid <= 0) {
            return a(input);
        }
        if (!this.f) {
            return h(input, seekPositionHolder, pcrPid);
        }
        if (this.h == C.TIME_UNSET) {
            return a(input);
        }
        if (!this.e) {
            return f(input, seekPositionHolder, pcrPid);
        }
        long j = this.g;
        if (j == C.TIME_UNSET) {
            return a(input);
        }
        this.i = this.b.adjustTsTimestamp(this.h) - this.b.adjustTsTimestamp(j);
        return a(input);
    }
}
