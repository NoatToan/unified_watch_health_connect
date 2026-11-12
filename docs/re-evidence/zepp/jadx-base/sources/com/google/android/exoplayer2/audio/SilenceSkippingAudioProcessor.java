package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class SilenceSkippingAudioProcessor extends BaseAudioProcessor {
    public static final long DEFAULT_MINIMUM_SILENCE_DURATION_US = 150000;
    public static final long DEFAULT_PADDING_SILENCE_US = 20000;
    public static final short DEFAULT_SILENCE_THRESHOLD_LEVEL = 1024;
    private static final int r = 0;
    private static final int s = 1;
    private static final int t = 2;
    private final long f;
    private final long g;
    private final short h;
    private int i;
    private boolean j;
    private byte[] k;
    private byte[] l;
    private int m;
    private int n;
    private int o;
    private boolean p;
    private long q;

    public SilenceSkippingAudioProcessor() {
        this(DEFAULT_MINIMUM_SILENCE_DURATION_US, 20000L, (short) 1024);
    }

    private int a(long durationUs) {
        return (int) ((durationUs * ((long) this.inputAudioFormat.sampleRate)) / 1000000);
    }

    private int b(ByteBuffer buffer) {
        int iLimit = buffer.limit();
        do {
            iLimit -= 2;
            if (iLimit < buffer.position()) {
                return buffer.position();
            }
        } while (Math.abs((int) buffer.getShort(iLimit)) <= this.h);
        int i = this.i;
        return ((iLimit / i) * i) + i;
    }

    private int c(ByteBuffer buffer) {
        for (int iPosition = buffer.position(); iPosition < buffer.limit(); iPosition += 2) {
            if (Math.abs((int) buffer.getShort(iPosition)) > this.h) {
                int i = this.i;
                return i * (iPosition / i);
            }
        }
        return buffer.limit();
    }

    private void d(ByteBuffer data) {
        int iRemaining = data.remaining();
        replaceOutputBuffer(iRemaining).put(data).flip();
        if (iRemaining > 0) {
            this.p = true;
        }
    }

    private void e(byte[] data, int length) {
        replaceOutputBuffer(length).put(data, 0, length).flip();
        if (length > 0) {
            this.p = true;
        }
    }

    private void f(ByteBuffer inputBuffer) {
        int iLimit = inputBuffer.limit();
        int iC = c(inputBuffer);
        int iPosition = iC - inputBuffer.position();
        byte[] bArr = this.k;
        int length = bArr.length;
        int i = this.n;
        int i2 = length - i;
        if (iC < iLimit && iPosition < i2) {
            e(bArr, i);
            this.n = 0;
            this.m = 0;
            return;
        }
        int iMin = Math.min(iPosition, i2);
        inputBuffer.limit(inputBuffer.position() + iMin);
        inputBuffer.get(this.k, this.n, iMin);
        int i3 = this.n + iMin;
        this.n = i3;
        byte[] bArr2 = this.k;
        if (i3 == bArr2.length) {
            if (this.p) {
                e(bArr2, this.o);
                this.q += (long) ((this.n - (this.o * 2)) / this.i);
            } else {
                this.q += (long) ((i3 - this.o) / this.i);
            }
            i(inputBuffer, this.k, this.n);
            this.n = 0;
            this.m = 2;
        }
        inputBuffer.limit(iLimit);
    }

    private void g(ByteBuffer inputBuffer) {
        int iLimit = inputBuffer.limit();
        inputBuffer.limit(Math.min(iLimit, inputBuffer.position() + this.k.length));
        int iB = b(inputBuffer);
        if (iB == inputBuffer.position()) {
            this.m = 1;
        } else {
            inputBuffer.limit(iB);
            d(inputBuffer);
        }
        inputBuffer.limit(iLimit);
    }

    private void h(ByteBuffer inputBuffer) {
        int iLimit = inputBuffer.limit();
        int iC = c(inputBuffer);
        inputBuffer.limit(iC);
        this.q += (long) (inputBuffer.remaining() / this.i);
        i(inputBuffer, this.l, this.o);
        if (iC < iLimit) {
            e(this.l, this.o);
            this.m = 0;
            inputBuffer.limit(iLimit);
        }
    }

    private void i(ByteBuffer input, byte[] buffer, int size) {
        int iMin = Math.min(input.remaining(), this.o);
        int i = this.o - iMin;
        System.arraycopy(buffer, size - i, this.l, 0, i);
        input.position(input.limit() - iMin);
        input.get(this.l, i, iMin);
    }

    public long getSkippedFrames() {
        return this.q;
    }

    @Override // com.google.android.exoplayer2.audio.BaseAudioProcessor, com.google.android.exoplayer2.audio.AudioProcessor
    public boolean isActive() {
        return this.j;
    }

    @Override // com.google.android.exoplayer2.audio.BaseAudioProcessor
    public AudioProcessor.AudioFormat onConfigure(AudioProcessor.AudioFormat inputAudioFormat) throws AudioProcessor.UnhandledAudioFormatException {
        if (inputAudioFormat.encoding == 2) {
            return this.j ? inputAudioFormat : AudioProcessor.AudioFormat.NOT_SET;
        }
        throw new AudioProcessor.UnhandledAudioFormatException(inputAudioFormat);
    }

    @Override // com.google.android.exoplayer2.audio.BaseAudioProcessor
    public void onFlush() {
        if (this.j) {
            this.i = this.inputAudioFormat.bytesPerFrame;
            int iA = a(this.f) * this.i;
            if (this.k.length != iA) {
                this.k = new byte[iA];
            }
            int iA2 = a(this.g) * this.i;
            this.o = iA2;
            if (this.l.length != iA2) {
                this.l = new byte[iA2];
            }
        }
        this.m = 0;
        this.q = 0L;
        this.n = 0;
        this.p = false;
    }

    @Override // com.google.android.exoplayer2.audio.BaseAudioProcessor
    public void onQueueEndOfStream() {
        int i = this.n;
        if (i > 0) {
            e(this.k, i);
        }
        if (this.p) {
            return;
        }
        this.q += (long) (this.o / this.i);
    }

    @Override // com.google.android.exoplayer2.audio.BaseAudioProcessor
    public void onReset() {
        this.j = false;
        this.o = 0;
        byte[] bArr = Util.EMPTY_BYTE_ARRAY;
        this.k = bArr;
        this.l = bArr;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public void queueInput(ByteBuffer inputBuffer) {
        while (inputBuffer.hasRemaining() && !hasPendingOutput()) {
            int i = this.m;
            if (i == 0) {
                g(inputBuffer);
            } else if (i == 1) {
                f(inputBuffer);
            } else {
                if (i != 2) {
                    throw new IllegalStateException();
                }
                h(inputBuffer);
            }
        }
    }

    public void setEnabled(boolean enabled) {
        this.j = enabled;
    }

    public SilenceSkippingAudioProcessor(long minimumSilenceDurationUs, long paddingSilenceUs, short silenceThresholdLevel) {
        Assertions.checkArgument(paddingSilenceUs <= minimumSilenceDurationUs);
        this.f = minimumSilenceDurationUs;
        this.g = paddingSilenceUs;
        this.h = silenceThresholdLevel;
        byte[] bArr = Util.EMPTY_BYTE_ARRAY;
        this.k = bArr;
        this.l = bArr;
    }
}
