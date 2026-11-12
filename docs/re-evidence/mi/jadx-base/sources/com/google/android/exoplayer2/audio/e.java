package com.google.android.exoplayer2.audio;

import defpackage.wlq;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends c {
    public static final int i = Float.floatToIntBits(Float.NaN);

    public static void l(int i2, ByteBuffer byteBuffer) {
        int iFloatToIntBits = Float.floatToIntBits((float) (((double) i2) * 4.656612875245797E-10d));
        if (iFloatToIntBits == i) {
            iFloatToIntBits = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(iFloatToIntBits);
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public void a(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferK;
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i2 = iLimit - iPosition;
        int i3 = this.f7851b.c;
        if (i3 == 536870912) {
            byteBufferK = k((i2 / 3) * 4);
            while (iPosition < iLimit) {
                l(((byteBuffer.get(iPosition) & 255) << 8) | ((byteBuffer.get(iPosition + 1) & 255) << 16) | ((byteBuffer.get(iPosition + 2) & 255) << 24), byteBufferK);
                iPosition += 3;
            }
        } else {
            if (i3 != 805306368) {
                throw new IllegalStateException();
            }
            byteBufferK = k(i2);
            while (iPosition < iLimit) {
                l((byteBuffer.get(iPosition) & 255) | ((byteBuffer.get(iPosition + 1) & 255) << 8) | ((byteBuffer.get(iPosition + 2) & 255) << 16) | ((byteBuffer.get(iPosition + 3) & 255) << 24), byteBufferK);
                iPosition += 4;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        byteBufferK.flip();
    }

    @Override // com.google.android.exoplayer2.audio.c
    public AudioProcessor.a g(AudioProcessor.a aVar) throws AudioProcessor.UnhandledAudioFormatException {
        int i2 = aVar.c;
        if (wlq.n0(i2)) {
            return i2 != 4 ? new AudioProcessor.a(aVar.f7824a, aVar.f7825b, 4) : AudioProcessor.a.e;
        }
        throw new AudioProcessor.UnhandledAudioFormatException(aVar);
    }
}
