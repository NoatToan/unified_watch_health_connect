package ia;

import androidx.media3.decoder.DecoderException;
import yb.l;

/* JADX INFO: loaded from: classes.dex */
public interface c<I, O, E extends DecoderException> {
    void a(l lVar);

    void b(long j8);

    I dequeueInputBuffer();

    O dequeueOutputBuffer();

    void flush();

    void release();
}
