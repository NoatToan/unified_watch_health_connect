package ka;

import androidx.media3.common.audio.AudioProcessor;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class h extends androidx.media3.common.audio.b {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int[] f103695i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int[] f103696j;

    @Override // androidx.media3.common.audio.b
    public final AudioProcessor.a b(AudioProcessor.a aVar) throws AudioProcessor.UnhandledAudioFormatException {
        int[] iArr = this.f103695i;
        if (iArr == null) {
            return AudioProcessor.a.f8122e;
        }
        int i14 = aVar.f8125c;
        int i15 = aVar.f8124b;
        if (i14 != 2) {
            throw new AudioProcessor.UnhandledAudioFormatException(aVar);
        }
        boolean z14 = i15 != iArr.length;
        int i16 = 0;
        while (i16 < iArr.length) {
            int i17 = iArr[i16];
            if (i17 >= i15) {
                throw new AudioProcessor.UnhandledAudioFormatException(aVar);
            }
            z14 |= i17 != i16;
            i16++;
        }
        return z14 ? new AudioProcessor.a(aVar.f8123a, iArr.length, 2) : AudioProcessor.a.f8122e;
    }

    @Override // androidx.media3.common.audio.b
    public final void c() {
        this.f103696j = this.f103695i;
    }

    @Override // androidx.media3.common.audio.b
    public final void e() {
        this.f103696j = null;
        this.f103695i = null;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final void queueInput(ByteBuffer byteBuffer) {
        int[] iArr = this.f103696j;
        iArr.getClass();
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        ByteBuffer byteBufferF = f(((iLimit - iPosition) / this.f8131b.f8126d) * this.f8132c.f8126d);
        while (iPosition < iLimit) {
            for (int i14 : iArr) {
                byteBufferF.putShort(byteBuffer.getShort((i14 * 2) + iPosition));
            }
            iPosition += this.f8131b.f8126d;
        }
        byteBuffer.position(iLimit);
        byteBufferF.flip();
    }
}
