package defpackage;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: loaded from: classes4.dex */
public class wc {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ThreadPoolExecutor f51842b = (ThreadPoolExecutor) Executors.newCachedThreadPool();

    public static void b(Runnable runnable) {
        f51842b.execute(runnable);
    }
}
