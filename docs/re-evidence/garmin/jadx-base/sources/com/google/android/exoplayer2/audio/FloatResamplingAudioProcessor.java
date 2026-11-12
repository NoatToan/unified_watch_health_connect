package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.util.Util;
import com.google.common.primitives.UnsignedBytes;
import j20.x;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes13.dex */
final class FloatResamplingAudioProcessor extends BaseAudioProcessor {
    private static final int FLOAT_NAN_AS_INT = Float.floatToIntBits(Float.NaN);
    private static final double PCM_32_BIT_INT_TO_PCM_32_BIT_FLOAT_FACTOR = 4.656612875245797E-10d;

    private static void writePcm32BitFloat(int i14, ByteBuffer byteBuffer) {
        int iFloatToIntBits = Float.floatToIntBits((float) (((double) i14) * PCM_32_BIT_INT_TO_PCM_32_BIT_FLOAT_FACTOR));
        if (iFloatToIntBits == FLOAT_NAN_AS_INT) {
            iFloatToIntBits = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(iFloatToIntBits);
    }

    @Override // com.google.android.exoplayer2.audio.BaseAudioProcessor
    public AudioProcessor.AudioFormat onConfigure(AudioProcessor.AudioFormat audioFormat) throws AudioProcessor.UnhandledAudioFormatException {
        int i14 = audioFormat.encoding;
        if (Util.isEncodingHighResolutionPcm(i14)) {
            return i14 != 4 ? new AudioProcessor.AudioFormat(audioFormat.sampleRate, audioFormat.channelCount, 4) : AudioProcessor.AudioFormat.NOT_SET;
        }
        throw new AudioProcessor.UnhandledAudioFormatException(audioFormat);
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public void queueInput(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferReplaceOutputBuffer;
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i14 = iLimit - iPosition;
        int i15 = this.inputAudioFormat.encoding;
        if (i15 == 536870912) {
            byteBufferReplaceOutputBuffer = replaceOutputBuffer((i14 / 3) * 4);
            while (iPosition < iLimit) {
                writePcm32BitFloat(((byteBuffer.get(iPosition) & UnsignedBytes.MAX_VALUE) << 8) | ((byteBuffer.get(iPosition + 1) & UnsignedBytes.MAX_VALUE) << 16) | ((byteBuffer.get(iPosition + 2) & UnsignedBytes.MAX_VALUE) << 24), byteBufferReplaceOutputBuffer);
                iPosition += 3;
            }
        } else {
            if (i15 != 805306368) {
                x.h();
                return;
            }
            byteBufferReplaceOutputBuffer = replaceOutputBuffer(i14);
            while (iPosition < iLimit) {
                writePcm32BitFloat((byteBuffer.get(iPosition) & UnsignedBytes.MAX_VALUE) | ((byteBuffer.get(iPosition + 1) & UnsignedBytes.MAX_VALUE) << 8) | ((byteBuffer.get(iPosition + 2) & UnsignedBytes.MAX_VALUE) << 16) | ((byteBuffer.get(iPosition + 3) & UnsignedBytes.MAX_VALUE) << 24), byteBufferReplaceOutputBuffer);
                iPosition += 4;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        byteBufferReplaceOutputBuffer.flip();
    }
}
