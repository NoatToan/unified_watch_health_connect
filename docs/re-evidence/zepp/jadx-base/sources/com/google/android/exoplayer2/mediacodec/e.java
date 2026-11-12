package com.google.android.exoplayer2.mediacodec;

import androidx.annotation.IntRange;
import androidx.annotation.VisibleForTesting;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.util.Assertions;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
final class e extends DecoderInputBuffer {
    public static final int g = 32;

    @VisibleForTesting
    public static final int h = 3072000;
    private long d;
    private int e;
    private int f;

    public e() {
        super(2);
        this.f = 32;
    }

    private boolean c(DecoderInputBuffer buffer) {
        ByteBuffer byteBuffer;
        if (!g()) {
            return true;
        }
        if (this.e >= this.f || buffer.isDecodeOnly() != isDecodeOnly()) {
            return false;
        }
        ByteBuffer byteBuffer2 = buffer.data;
        return byteBuffer2 == null || (byteBuffer = this.data) == null || byteBuffer.position() + byteBuffer2.remaining() <= 3072000;
    }

    public boolean b(DecoderInputBuffer buffer) {
        Assertions.checkArgument(!buffer.isEncrypted());
        Assertions.checkArgument(!buffer.hasSupplementalData());
        Assertions.checkArgument(!buffer.isEndOfStream());
        if (!c(buffer)) {
            return false;
        }
        int i = this.e;
        this.e = i + 1;
        if (i == 0) {
            this.timeUs = buffer.timeUs;
            if (buffer.isKeyFrame()) {
                setFlags(1);
            }
        }
        if (buffer.isDecodeOnly()) {
            setFlags(Integer.MIN_VALUE);
        }
        ByteBuffer byteBuffer = buffer.data;
        if (byteBuffer != null) {
            ensureSpaceForWrite(byteBuffer.remaining());
            this.data.put(byteBuffer);
        }
        this.d = buffer.timeUs;
        return true;
    }

    @Override // com.google.android.exoplayer2.decoder.DecoderInputBuffer, com.google.android.exoplayer2.decoder.Buffer
    public void clear() {
        super.clear();
        this.e = 0;
    }

    public long d() {
        return this.timeUs;
    }

    public long e() {
        return this.d;
    }

    public int f() {
        return this.e;
    }

    public boolean g() {
        return this.e > 0;
    }

    public void h(@IntRange(from = 1) int maxSampleCount) {
        Assertions.checkArgument(maxSampleCount > 0);
        this.f = maxSampleCount;
    }
}
