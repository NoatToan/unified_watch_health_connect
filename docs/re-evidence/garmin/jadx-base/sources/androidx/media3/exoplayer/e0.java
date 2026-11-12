package androidx.media3.exoplayer;

/* JADX INFO: loaded from: classes.dex */
public interface e0 {
    void b(androidx.media3.common.y yVar);

    androidx.media3.common.y getPlaybackParameters();

    long getPositionUs();

    default boolean i() {
        return false;
    }
}
