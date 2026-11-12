package com.google.android.exoplayer2.audio;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.Assertions;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
final class e extends BaseAudioProcessor {

    @Nullable
    private int[] f;

    @Nullable
    private int[] g;

    public void a(@Nullable int[] outputChannels) {
        this.f = outputChannels;
    }

    @Override // com.google.android.exoplayer2.audio.BaseAudioProcessor
    public AudioProcessor.AudioFormat onConfigure(AudioProcessor.AudioFormat inputAudioFormat) throws AudioProcessor.UnhandledAudioFormatException {
        int[] iArr = this.f;
        if (iArr == null) {
            return AudioProcessor.AudioFormat.NOT_SET;
        }
        if (inputAudioFormat.encoding != 2) {
            throw new AudioProcessor.UnhandledAudioFormatException(inputAudioFormat);
        }
        boolean z = inputAudioFormat.channelCount != iArr.length;
        int i = 0;
        while (i < iArr.length) {
            int i2 = iArr[i];
            if (i2 >= inputAudioFormat.channelCount) {
                throw new AudioProcessor.UnhandledAudioFormatException(inputAudioFormat);
            }
            z |= i2 != i;
            i++;
        }
        return z ? new AudioProcessor.AudioFormat(inputAudioFormat.sampleRate, iArr.length, 2) : AudioProcessor.AudioFormat.NOT_SET;
    }

    @Override // com.google.android.exoplayer2.audio.BaseAudioProcessor
    public void onFlush() {
        this.g = this.f;
    }

    @Override // com.google.android.exoplayer2.audio.BaseAudioProcessor
    public void onReset() {
        this.g = null;
        this.f = null;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public void queueInput(ByteBuffer inputBuffer) {
        int[] iArr = (int[]) Assertions.checkNotNull(this.g);
        int iPosition = inputBuffer.position();
        int iLimit = inputBuffer.limit();
        ByteBuffer byteBufferReplaceOutputBuffer = replaceOutputBuffer(((iLimit - iPosition) / this.inputAudioFormat.bytesPerFrame) * this.outputAudioFormat.bytesPerFrame);
        while (iPosition < iLimit) {
            for (int i : iArr) {
                byteBufferReplaceOutputBuffer.putShort(inputBuffer.getShort((i * 2) + iPosition));
            }
            iPosition += this.inputAudioFormat.bytesPerFrame;
        }
        inputBuffer.position(iLimit);
        byteBufferReplaceOutputBuffer.flip();
    }
}
