package defpackage;

import com.huawei.haf.threadpool.ThreadPoolManager;

/* JADX INFO: loaded from: classes.dex */
public class lsy {
    public static int a(Runnable runnable) {
        ThreadPoolManager.c().execute(runnable);
        return 0;
    }
}
