package defpackage;

import com.huawei.hwlogsmodel.LogUtil;

/* JADX INFO: loaded from: classes10.dex */
public class mfy {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f41639b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f41640c;

    public static void b(int i, boolean z) {
        synchronized (f41639b) {
            try {
                if (z) {
                    f41640c = i | f41640c;
                } else {
                    f41640c = (~i) & f41640c;
                }
                LogUtil.a("DeviceDatabaseCacheUtil", "change result : ", Integer.toBinaryString(f41640c));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static boolean e(int i) {
        boolean z;
        synchronized (f41639b) {
            LogUtil.a("DeviceDatabaseCacheUtil", "isTagSuccess result : ", Integer.toBinaryString(f41640c));
            z = (f41640c & i) == i;
        }
        return z;
    }
}
