package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.util.Util;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
final class i extends BaseAudioProcessor {
    private static final int m = 2;
    private int f;
    private int g;
    private boolean h;
    private int i;
    private byte[] j = Util.EMPTY_BYTE_ARRAY;
    private int k;
    private long l;

    public long a() {
        return this.l;
    }

    public void b() {
        this.l = 0L;
    }

    public void c(int trimStartFrames, int trimEndFrames) {
        this.f = trimStartFrames;
        this.g = trimEndFrames;
    }

    @Override // com.google.android.exoplayer2.audio.BaseAudioProcessor, com.google.android.exoplayer2.audio.AudioProcessor
    public ByteBuffer getOutput() {
        int i;
        if (super.isEnded() && (i = this.k) > 0) {
            replaceOutputBuffer(i).put(this.j, 0, this.k).flip();
            this.k = 0;
        }
        return super.getOutput();
    }

    @Override // com.google.android.exoplayer2.audio.BaseAudioProcessor, com.google.android.exoplayer2.audio.AudioProcessor
    public boolean isEnded() {
        return super.isEnded() && this.k == 0;
    }

    @Override // com.google.android.exoplayer2.audio.BaseAudioProcessor
    public AudioProcessor.AudioFormat onConfigure(AudioProcessor.AudioFormat inputAudioFormat) throws AudioProcessor.UnhandledAudioFormatException {
        if (inputAudioFormat.encoding != 2) {
            throw new AudioProcessor.UnhandledAudioFormatException(inputAudioFormat);
        }
        this.h = true;
        return (this.f == 0 && this.g == 0) ? AudioProcessor.AudioFormat.NOT_SET : inputAudioFormat;
    }

    @Override // com.google.android.exoplayer2.audio.BaseAudioProcessor
    public void onFlush() {
        if (this.h) {
            this.h = false;
            int i = this.g;
            int i2 = this.inputAudioFormat.bytesPerFrame;
            this.j = new byte[i * i2];
            this.i = this.f * i2;
        }
        this.k = 0;
    }

    @Override // com.google.android.exoplayer2.audio.BaseAudioProcessor
    public void onQueueEndOfStream() {
        if (this.h) {
            int i = this.k;
            if (i > 0) {
                this.l += (long) (i / this.inputAudioFormat.bytesPerFrame);
            }
            this.k = 0;
        }
    }

    @Override // com.google.android.exoplayer2.audio.BaseAudioProcessor
    public void onReset() {
        this.j = Util.EMPTY_BYTE_ARRAY;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public void queueInput(ByteBuffer inputBuffer) {
        int iPosition = inputBuffer.position();
        int iLimit = inputBuffer.limit();
        int i = iLimit - iPosition;
        if (i == 0) {
            return;
        }
        int iMin = Math.min(i, this.i);
        this.l += (long) (iMin / this.inputAudioFormat.bytesPerFrame);
        this.i -= iMin;
        inputBuffer.position(iPosition + iMin);
        if (this.i > 0) {
            return;
        }
        int i2 = i - iMin;
        int length = (this.k + i2) - this.j.length;
        ByteBuffer byteBufferReplaceOutputBuffer = replaceOutputBuffer(length);
        int iConstrainValue = Util.constrainValue(length, 0, this.k);
        byteBufferReplaceOutputBuffer.put(this.j, 0, iConstrainValue);
        int iConstrainValue2 = Util.constrainValue(length - iConstrainValue, 0, i2);
        inputBuffer.limit(inputBuffer.position() + iConstrainValue2);
        byteBufferReplaceOutputBuffer.put(inputBuffer);
        inputBuffer.limit(iLimit);
        int i3 = i2 - iConstrainValue2;
        int i4 = this.k - iConstrainValue;
        this.k = i4;
        byte[] bArr = this.j;
        System.arraycopy(bArr, iConstrainValue, bArr, 0, i4);
        inputBuffer.get(this.j, this.k, i3);
        this.k += i3;
        byteBufferReplaceOutputBuffer.flip();
    }
}
