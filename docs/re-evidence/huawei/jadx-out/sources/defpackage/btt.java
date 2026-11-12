package defpackage;

import com.huawei.haf.threadpool.ThreadPoolManager;

/* JADX INFO: loaded from: classes.dex */
public class btt {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile btt f1147c;

    private btt() {
    }

    public static btt d() {
        if (f1147c == null) {
            synchronized (btt.class) {
                if (f1147c == null) {
                    f1147c = new btt();
                }
            }
        }
        return f1147c;
    }

    public void c(Runnable runnable) {
        ThreadPoolManager.c().execute(runnable);
    }
}
