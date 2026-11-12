package com.google.android.exoplayer2.mediacodec;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.audio.MpegAudioUtil;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
final class f {
    private static final long d = 529;
    private static final String e = "C2Mp3TimestampTracker";
    private long a;
    private long b;
    private boolean c;

    private long a(Format format) {
        return (this.a * 1000000) / ((long) format.sampleRate);
    }

    public void b() {
        this.a = 0L;
        this.b = 0L;
        this.c = false;
    }

    public long c(Format format, DecoderInputBuffer buffer) {
        if (this.c) {
            return buffer.timeUs;
        }
        ByteBuffer byteBuffer = (ByteBuffer) Assertions.checkNotNull(buffer.data);
        int i = 0;
        for (int i2 = 0; i2 < 4; i2++) {
            i = (i << 8) | (byteBuffer.get(i2) & 255);
        }
        int mpegAudioFrameSampleCount = MpegAudioUtil.parseMpegAudioFrameSampleCount(i);
        if (mpegAudioFrameSampleCount == -1) {
            this.c = true;
            Log.w(e, "MPEG audio header is invalid.");
            return buffer.timeUs;
        }
        if (this.a != 0) {
            long jA = a(format);
            this.a += (long) mpegAudioFrameSampleCount;
            return this.b + jA;
        }
        long j = buffer.timeUs;
        this.b = j;
        this.a = ((long) mpegAudioFrameSampleCount) - d;
        return j;
    }
}
