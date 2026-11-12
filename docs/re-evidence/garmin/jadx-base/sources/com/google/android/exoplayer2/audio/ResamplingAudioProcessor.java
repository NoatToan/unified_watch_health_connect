package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.util.Util;
import com.google.common.primitives.UnsignedBytes;
import j20.x;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes13.dex */
final class ResamplingAudioProcessor extends BaseAudioProcessor {
    @Override // com.google.android.exoplayer2.audio.BaseAudioProcessor
    public AudioProcessor.AudioFormat onConfigure(AudioProcessor.AudioFormat audioFormat) throws AudioProcessor.UnhandledAudioFormatException {
        int i14 = audioFormat.encoding;
        if (i14 == 3 || i14 == 2 || i14 == 268435456 || i14 == 536870912 || i14 == 805306368 || i14 == 4) {
            return i14 != 2 ? new AudioProcessor.AudioFormat(audioFormat.sampleRate, audioFormat.channelCount, 2) : AudioProcessor.AudioFormat.NOT_SET;
        }
        throw new AudioProcessor.UnhandledAudioFormatException(audioFormat);
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public void queueInput(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i14 = iLimit - iPosition;
        int i15 = this.inputAudioFormat.encoding;
        if (i15 == 3) {
            i14 *= 2;
        } else if (i15 == 4) {
            i14 /= 2;
        } else if (i15 != 268435456) {
            if (i15 != 536870912) {
                if (i15 != 805306368) {
                    x.h();
                    return;
                }
                i14 /= 2;
            } else {
                i14 /= 3;
                i14 *= 2;
            }
        }
        ByteBuffer byteBufferReplaceOutputBuffer = replaceOutputBuffer(i14);
        int i16 = this.inputAudioFormat.encoding;
        if (i16 == 3) {
            while (iPosition < iLimit) {
                byteBufferReplaceOutputBuffer.put((byte) 0);
                byteBufferReplaceOutputBuffer.put((byte) ((byteBuffer.get(iPosition) & UnsignedBytes.MAX_VALUE) - 128));
                iPosition++;
            }
        } else if (i16 == 4) {
            while (iPosition < iLimit) {
                short sConstrainValue = (short) (Util.constrainValue(byteBuffer.getFloat(iPosition), -1.0f, 1.0f) * 32767.0f);
                byteBufferReplaceOutputBuffer.put((byte) (sConstrainValue & 255));
                byteBufferReplaceOutputBuffer.put((byte) ((sConstrainValue >> 8) & 255));
                iPosition += 4;
            }
        } else if (i16 == 268435456) {
            while (iPosition < iLimit) {
                byteBufferReplaceOutputBuffer.put(byteBuffer.get(iPosition + 1));
                byteBufferReplaceOutputBuffer.put(byteBuffer.get(iPosition));
                iPosition += 2;
            }
        } else if (i16 == 536870912) {
            while (iPosition < iLimit) {
                byteBufferReplaceOutputBuffer.put(byteBuffer.get(iPosition + 1));
                byteBufferReplaceOutputBuffer.put(byteBuffer.get(iPosition + 2));
                iPosition += 3;
            }
        } else {
            if (i16 != 805306368) {
                x.h();
                return;
            }
            while (iPosition < iLimit) {
                byteBufferReplaceOutputBuffer.put(byteBuffer.get(iPosition + 2));
                byteBufferReplaceOutputBuffer.put(byteBuffer.get(iPosition + 3));
                iPosition += 4;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        byteBufferReplaceOutputBuffer.flip();
    }
}
