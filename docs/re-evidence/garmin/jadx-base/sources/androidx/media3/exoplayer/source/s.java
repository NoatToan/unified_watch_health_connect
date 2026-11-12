package androidx.media3.exoplayer.source;

import androidx.media3.exoplayer.d0;

/* JADX INFO: loaded from: classes.dex */
public interface s {

    public interface a<T extends s> {
        void b(T t7);
    }

    boolean f(d0 d0Var);

    long getBufferedPositionUs();

    long getNextLoadPositionUs();

    boolean isLoading();

    void reevaluateBuffer(long j8);
}
