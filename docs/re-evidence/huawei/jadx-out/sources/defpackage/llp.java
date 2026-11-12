package defpackage;

import com.huawei.hwappdfxmgr.threads.ThreadsCallBack;
import health.compact.a.LogUtil;

/* JADX INFO: loaded from: classes.dex */
public final class llp {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static ThreadsCallBack f40423c;

    public static void d(String str, long j) {
        ThreadsCallBack threadsCallBack = f40423c;
        if (threadsCallBack != null) {
            threadsCallBack.dumpThreadsMessage(str, j);
        } else {
            LogUtil.e(str, "the mCallback is null");
        }
    }

    public static void c(ThreadsCallBack threadsCallBack) {
        f40423c = threadsCallBack;
    }

    public static void c() {
        f40423c = null;
    }
}
