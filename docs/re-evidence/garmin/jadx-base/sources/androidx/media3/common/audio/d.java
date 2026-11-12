package androidx.media3.common.audio;

import com.google.common.primitives.UnsignedBytes;
import fa.z;
import j20.x;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class d extends b {
    @Override // androidx.media3.common.audio.b
    public final AudioProcessor.a b(AudioProcessor.a aVar) throws AudioProcessor.UnhandledAudioFormatException {
        int i14 = aVar.f8125c;
        if (i14 == 3 || i14 == 2 || i14 == 268435456 || i14 == 21 || i14 == 1342177280 || i14 == 22 || i14 == 1610612736 || i14 == 4) {
            return i14 != 2 ? new AudioProcessor.a(aVar.f8123a, aVar.f8124b, 2) : AudioProcessor.a.f8122e;
        }
        throw new AudioProcessor.UnhandledAudioFormatException(aVar);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0032  */
    @Override // androidx.media3.common.audio.AudioProcessor
    public final void queueInput(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i14 = iLimit - iPosition;
        int i15 = this.f8131b.f8125c;
        if (i15 == 3) {
            i14 *= 2;
        } else if (i15 == 4) {
            i14 /= 2;
        } else {
            if (i15 != 21) {
                if (i15 == 22) {
                    i14 /= 2;
                } else if (i15 != 268435456) {
                    if (i15 != 1342177280) {
                        if (i15 != 1610612736) {
                            x.h();
                            return;
                        }
                        i14 /= 2;
                    }
                }
            }
            i14 /= 3;
            i14 *= 2;
        }
        ByteBuffer byteBufferF = f(i14);
        int i16 = this.f8131b.f8125c;
        if (i16 == 3) {
            while (iPosition < iLimit) {
                byteBufferF.put((byte) 0);
                byteBufferF.put((byte) ((byteBuffer.get(iPosition) & UnsignedBytes.MAX_VALUE) - 128));
                iPosition++;
            }
        } else if (i16 == 4) {
            while (iPosition < iLimit) {
                short sH = (short) (z.h(byteBuffer.getFloat(iPosition), -1.0f, 1.0f) * 32767.0f);
                byteBufferF.put((byte) (sH & 255));
                byteBufferF.put((byte) ((sH >> 8) & 255));
                iPosition += 4;
            }
        } else if (i16 == 21) {
            while (iPosition < iLimit) {
                byteBufferF.put(byteBuffer.get(iPosition + 1));
                byteBufferF.put(byteBuffer.get(iPosition + 2));
                iPosition += 3;
            }
        } else if (i16 == 22) {
            while (iPosition < iLimit) {
                byteBufferF.put(byteBuffer.get(iPosition + 2));
                byteBufferF.put(byteBuffer.get(iPosition + 3));
                iPosition += 4;
            }
        } else if (i16 == 268435456) {
            while (iPosition < iLimit) {
                byteBufferF.put(byteBuffer.get(iPosition + 1));
                byteBufferF.put(byteBuffer.get(iPosition));
                iPosition += 2;
            }
        } else if (i16 == 1342177280) {
            while (iPosition < iLimit) {
                byteBufferF.put(byteBuffer.get(iPosition + 1));
                byteBufferF.put(byteBuffer.get(iPosition));
                iPosition += 3;
            }
        } else {
            if (i16 != 1610612736) {
                x.h();
                return;
            }
            while (iPosition < iLimit) {
                byteBufferF.put(byteBuffer.get(iPosition + 1));
                byteBufferF.put(byteBuffer.get(iPosition));
                iPosition += 4;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        byteBufferF.flip();
    }
}
