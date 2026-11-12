package yb;

import androidx.media3.decoder.DecoderException;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.extractor.text.SubtitleDecoderException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public abstract class h extends ia.e<l, m, SubtitleDecoderException> implements j {
    public h(String str) {
        super(new l[2], new m[2]);
        int i14 = this.f92393g;
        DecoderInputBuffer[] decoderInputBufferArr = this.f92391e;
        fa.a.d(i14 == decoderInputBufferArr.length);
        for (DecoderInputBuffer decoderInputBuffer : decoderInputBufferArr) {
            decoderInputBuffer.e(1024);
        }
    }

    @Override // ia.e
    public final DecoderInputBuffer d() {
        return new l();
    }

    @Override // ia.e
    public final ia.d e() {
        return new g(this);
    }

    @Override // ia.e
    public final DecoderException f(Throwable th3) {
        return new SubtitleDecoderException("Unexpected decode error", th3);
    }

    @Override // ia.e
    public final DecoderException g(DecoderInputBuffer decoderInputBuffer, ia.d dVar, boolean z14) {
        l lVar = (l) decoderInputBuffer;
        m mVar = (m) dVar;
        try {
            ByteBuffer byteBuffer = lVar.f8631d;
            byteBuffer.getClass();
            i iVarK = k(byteBuffer.limit(), byteBuffer.array(), z14);
            long j8 = lVar.f8633f;
            long j14 = lVar.f195659j;
            mVar.f92385b = j8;
            mVar.f195660d = iVarK;
            if (j14 != Long.MAX_VALUE) {
                j8 = j14;
            }
            mVar.f195661e = j8;
            mVar.f92386c = false;
            return null;
        } catch (SubtitleDecoderException e4) {
            return e4;
        }
    }

    public abstract i k(int i14, byte[] bArr, boolean z14);

    @Override // yb.j
    public final void setPositionUs(long j8) {
    }
}
