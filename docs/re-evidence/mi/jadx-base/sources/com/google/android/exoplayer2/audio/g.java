package com.google.android.exoplayer2.audio;

import androidx.work.WorkInfo;
import defpackage.wlq;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
public final class g extends c {
    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public void a(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i = iLimit - iPosition;
        int i2 = this.f7851b.c;
        if (i2 == 3) {
            i *= 2;
        } else if (i2 == 4) {
            i /= 2;
        } else if (i2 != 268435456) {
            if (i2 != 536870912) {
                if (i2 != 805306368) {
                    throw new IllegalStateException();
                }
                i /= 2;
            } else {
                i /= 3;
                i *= 2;
            }
        }
        ByteBuffer byteBufferK = k(i);
        int i3 = this.f7851b.c;
        if (i3 == 3) {
            while (iPosition < iLimit) {
                byteBufferK.put((byte) 0);
                byteBufferK.put((byte) ((byteBuffer.get(iPosition) & 255) + WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT));
                iPosition++;
            }
        } else if (i3 == 4) {
            while (iPosition < iLimit) {
                short sQ = (short) (wlq.q(byteBuffer.getFloat(iPosition), -1.0f, 1.0f) * 32767.0f);
                byteBufferK.put((byte) (sQ & 255));
                byteBufferK.put((byte) ((sQ >> 8) & 255));
                iPosition += 4;
            }
        } else if (i3 == 268435456) {
            while (iPosition < iLimit) {
                byteBufferK.put(byteBuffer.get(iPosition + 1));
                byteBufferK.put(byteBuffer.get(iPosition));
                iPosition += 2;
            }
        } else if (i3 == 536870912) {
            while (iPosition < iLimit) {
                byteBufferK.put(byteBuffer.get(iPosition + 1));
                byteBufferK.put(byteBuffer.get(iPosition + 2));
                iPosition += 3;
            }
        } else {
            if (i3 != 805306368) {
                throw new IllegalStateException();
            }
            while (iPosition < iLimit) {
                byteBufferK.put(byteBuffer.get(iPosition + 2));
                byteBufferK.put(byteBuffer.get(iPosition + 3));
                iPosition += 4;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        byteBufferK.flip();
    }

    @Override // com.google.android.exoplayer2.audio.c
    public AudioProcessor.a g(AudioProcessor.a aVar) throws AudioProcessor.UnhandledAudioFormatException {
        int i = aVar.c;
        if (i == 3 || i == 2 || i == 268435456 || i == 536870912 || i == 805306368 || i == 4) {
            return i != 2 ? new AudioProcessor.a(aVar.f7824a, aVar.f7825b, 2) : AudioProcessor.a.e;
        }
        throw new AudioProcessor.UnhandledAudioFormatException(aVar);
    }
}
