package defpackage;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes5.dex */
public final class xit implements ThreadFactory {
    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, "SplitCompatBackgroundThread");
    }
}
