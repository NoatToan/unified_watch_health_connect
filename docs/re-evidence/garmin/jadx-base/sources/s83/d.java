package s83;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes11.dex */
public final class d extends AtomicLong implements ThreadFactory {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f157958b = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f157959a;

    public static class a implements ThreadFactory {
        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            throw new AssertionError("No threads allowed.");
        }
    }

    public d(String str) {
        this.f157959a = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, this.f157959a + incrementAndGet());
        thread.setDaemon(true);
        return thread;
    }
}
