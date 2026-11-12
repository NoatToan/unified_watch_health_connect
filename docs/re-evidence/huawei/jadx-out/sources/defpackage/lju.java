package defpackage;

import com.huawei.hwlogsmodel.LogUtil;

/* JADX INFO: loaded from: classes10.dex */
public class lju {
    public static int e() {
        Runtime runtime = Runtime.getRuntime();
        long jMaxMemory = runtime.maxMemory() / 1048576;
        long j = runtime.totalMemory() / 1048576;
        long jFreeMemory = j - (runtime.freeMemory() / 1048576);
        int i = (int) ((100 * jFreeMemory) / jMaxMemory);
        LogUtil.d("HiH_HiMemoryMonitorUtil", "mup :", Integer.valueOf(i), ", usedMem=", Long.valueOf(jFreeMemory), ", totalMem=", Long.valueOf(j), ", maxMemory=", Long.valueOf(jMaxMemory));
        return i;
    }

    public static int c(int i, int i2) {
        if (i <= 50) {
            return Math.max(i2, 1);
        }
        if (i <= 60) {
            return Math.max((int) (((double) i2) * 0.8d), 1);
        }
        if (i <= 70) {
            return Math.max((int) (((double) i2) * 0.6d), 1);
        }
        if (i <= 80) {
            return Math.max((int) (((double) i2) * 0.4d), 1);
        }
        if (i <= 90) {
            return Math.max((int) (((double) i2) * 0.2d), 1);
        }
        return 1;
    }
}
