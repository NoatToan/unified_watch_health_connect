package sa;

import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.a0;

/* JADX INFO: loaded from: classes.dex */
public final class g implements n {
    @Override // sa.n
    public final int a(a0 a0Var, DecoderInputBuffer decoderInputBuffer, int i14) {
        decoderInputBuffer.f92372a = 4;
        return -4;
    }

    @Override // sa.n
    public final boolean isReady() {
        return true;
    }

    @Override // sa.n
    public final void maybeThrowError() {
    }

    @Override // sa.n
    public final int skipData(long j8) {
        return 0;
    }
}
