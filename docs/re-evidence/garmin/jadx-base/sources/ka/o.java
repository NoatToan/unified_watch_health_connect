package ka;

import androidx.media3.common.audio.AudioProcessor;
import com.google.common.primitives.UnsignedBytes;
import fa.z;
import j20.x;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class o extends androidx.media3.common.audio.b {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f103721i = Float.floatToIntBits(Float.NaN);

    public static void g(int i14, ByteBuffer byteBuffer) {
        int iFloatToIntBits = Float.floatToIntBits((float) (((double) i14) * 4.656612875245797E-10d));
        if (iFloatToIntBits == f103721i) {
            iFloatToIntBits = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(iFloatToIntBits);
    }

    @Override // androidx.media3.common.audio.b
    public final AudioProcessor.a b(AudioProcessor.a aVar) throws AudioProcessor.UnhandledAudioFormatException {
        int i14 = aVar.f8125c;
        int i15 = z.f70071a;
        if (i14 == 21 || i14 == 1342177280 || i14 == 22 || i14 == 1610612736 || i14 == 4) {
            return i14 != 4 ? new AudioProcessor.a(aVar.f8123a, aVar.f8124b, 4) : AudioProcessor.a.f8122e;
        }
        throw new AudioProcessor.UnhandledAudioFormatException(aVar);
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final void queueInput(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferF;
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i14 = iLimit - iPosition;
        int i15 = this.f8131b.f8125c;
        if (i15 == 21) {
            byteBufferF = f((i14 / 3) * 4);
            while (iPosition < iLimit) {
                g(((byteBuffer.get(iPosition) & UnsignedBytes.MAX_VALUE) << 8) | ((byteBuffer.get(iPosition + 1) & UnsignedBytes.MAX_VALUE) << 16) | ((byteBuffer.get(iPosition + 2) & UnsignedBytes.MAX_VALUE) << 24), byteBufferF);
                iPosition += 3;
            }
        } else if (i15 == 22) {
            byteBufferF = f(i14);
            while (iPosition < iLimit) {
                g((byteBuffer.get(iPosition) & UnsignedBytes.MAX_VALUE) | ((byteBuffer.get(iPosition + 1) & UnsignedBytes.MAX_VALUE) << 8) | ((byteBuffer.get(iPosition + 2) & UnsignedBytes.MAX_VALUE) << 16) | ((byteBuffer.get(iPosition + 3) & UnsignedBytes.MAX_VALUE) << 24), byteBufferF);
                iPosition += 4;
            }
        } else if (i15 == 1342177280) {
            byteBufferF = f((i14 / 3) * 4);
            while (iPosition < iLimit) {
                g(((byteBuffer.get(iPosition + 2) & UnsignedBytes.MAX_VALUE) << 8) | ((byteBuffer.get(iPosition + 1) & UnsignedBytes.MAX_VALUE) << 16) | ((byteBuffer.get(iPosition) & UnsignedBytes.MAX_VALUE) << 24), byteBufferF);
                iPosition += 3;
            }
        } else {
            if (i15 != 1610612736) {
                x.h();
                return;
            }
            byteBufferF = f(i14);
            while (iPosition < iLimit) {
                g((byteBuffer.get(iPosition + 3) & UnsignedBytes.MAX_VALUE) | ((byteBuffer.get(iPosition + 2) & UnsignedBytes.MAX_VALUE) << 8) | ((byteBuffer.get(iPosition + 1) & UnsignedBytes.MAX_VALUE) << 16) | ((byteBuffer.get(iPosition) & UnsignedBytes.MAX_VALUE) << 24), byteBufferF);
                iPosition += 4;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        byteBufferF.flip();
    }
}
