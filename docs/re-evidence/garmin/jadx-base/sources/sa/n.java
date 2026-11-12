package sa;

import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.a0;

/* JADX INFO: loaded from: classes.dex */
public interface n {
    int a(a0 a0Var, DecoderInputBuffer decoderInputBuffer, int i14);

    boolean isReady();

    void maybeThrowError();

    int skipData(long j8);
}
