package com.google.android.exoplayer2.audio;

import defpackage.rk1;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends c {
    public int[] i;
    public int[] j;

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public void a(ByteBuffer byteBuffer) {
        int[] iArr = (int[]) rk1.e(this.j);
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        ByteBuffer byteBufferK = k(((iLimit - iPosition) / this.f7851b.d) * this.c.d);
        while (iPosition < iLimit) {
            for (int i : iArr) {
                byteBufferK.putShort(byteBuffer.getShort((i * 2) + iPosition));
            }
            iPosition += this.f7851b.d;
        }
        byteBuffer.position(iLimit);
        byteBufferK.flip();
    }

    @Override // com.google.android.exoplayer2.audio.c
    public AudioProcessor.a g(AudioProcessor.a aVar) throws AudioProcessor.UnhandledAudioFormatException {
        int[] iArr = this.i;
        if (iArr == null) {
            return AudioProcessor.a.e;
        }
        if (aVar.c != 2) {
            throw new AudioProcessor.UnhandledAudioFormatException(aVar);
        }
        boolean z = aVar.f7825b != iArr.length;
        int i = 0;
        while (i < iArr.length) {
            int i2 = iArr[i];
            if (i2 >= aVar.f7825b) {
                throw new AudioProcessor.UnhandledAudioFormatException(aVar);
            }
            z |= i2 != i;
            i++;
        }
        return z ? new AudioProcessor.a(aVar.f7824a, iArr.length, 2) : AudioProcessor.a.e;
    }

    @Override // com.google.android.exoplayer2.audio.c
    public void h() {
        this.j = this.i;
    }

    @Override // com.google.android.exoplayer2.audio.c
    public void j() {
        this.j = null;
        this.i = null;
    }

    public void l(int[] iArr) {
        this.i = iArr;
    }
}
