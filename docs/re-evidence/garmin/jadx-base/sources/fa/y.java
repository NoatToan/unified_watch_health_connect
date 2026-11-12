package fa;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class y implements ThreadFactory {
    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        int i14 = z.f70071a;
        return new Thread(runnable, "ExoPlayer:AudioTrackReleaseThread");
    }
}
