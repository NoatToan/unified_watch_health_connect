package defpackage;

import com.huawei.haf.threadpool.ThreadPoolManager;

/* JADX INFO: loaded from: classes10.dex */
public class mit {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static ThreadPoolManager f41728a = ThreadPoolManager.d(2, 4);

    public static void b(String str, Runnable runnable) {
        f41728a.a(str, runnable);
    }
}
