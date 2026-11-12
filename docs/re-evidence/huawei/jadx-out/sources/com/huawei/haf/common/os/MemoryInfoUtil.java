package com.huawei.haf.common.os;

import android.app.ActivityManager;
import android.os.Debug;
import android.os.Process;
import android.text.TextUtils;
import com.huawei.operation.utils.Constants;
import health.compact.a.CommonUtils;
import health.compact.a.LogUtil;
import health.compact.a.ProcessUtil;
import health.compact.a.ReflectionUtils;
import java.io.PrintWriter;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
final class MemoryInfoUtil {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static long f5916c;

    private MemoryInfoUtil() {
    }

    static long d() {
        ActivityManager activityManagerJ;
        if (f5916c == 0 && (activityManagerJ = CommonUtils.j()) != null) {
            f5916c = d(activityManagerJ).totalMem >> 20;
        }
        return f5916c;
    }

    static void a(PrintWriter printWriter, Debug.MemoryInfo memoryInfo) {
        try {
            AndroidPlatformV23.b(printWriter, memoryInfo);
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            LogUtil.c("HAF_MemoryInfoUtil", "dumpMemoryInfoTable fail. ex=", LogUtil.c(e));
        }
    }

    static void b(StringBuilder sb, Debug.MemoryInfo memoryInfo, int i) {
        AndroidPlatformV23.e(sb, memoryInfo);
        sb.append(", threads=");
        sb.append(e());
        e(sb);
        if (i >= 0) {
            e(sb, memoryInfo, i);
        }
    }

    static void a(StringBuilder sb) {
        ActivityManager activityManagerJ = CommonUtils.j();
        if (activityManagerJ == null) {
            return;
        }
        ActivityManager.MemoryInfo memoryInfoD = d(activityManagerJ);
        sb.append("System totalMem=");
        sb.append(memoryInfoD.totalMem >> 20);
        sb.append("M, availMem=");
        sb.append(memoryInfoD.availMem >> 20);
        sb.append("M, threshold=");
        sb.append(memoryInfoD.threshold >> 20);
        sb.append("M and isLowMemory=");
        sb.append(memoryInfoD.lowMemory);
        sb.append(", heapgrowthlimit=");
        sb.append(activityManagerJ.getMemoryClass());
        sb.append(", heapsize=");
        sb.append(activityManagerJ.getLargeMemoryClass());
    }

    static int a(Debug.MemoryInfo memoryInfo, String str, int i) {
        if (memoryInfo != null && !TextUtils.isEmpty(str)) {
            try {
                Object objE = ReflectionUtils.e(ReflectionUtils.e((Class<?>) Debug.MemoryInfo.class, str, (Class<?>[]) new Class[]{Integer.TYPE}), memoryInfo, Integer.valueOf(i));
                if (objE instanceof Integer) {
                    return ((Integer) objE).intValue();
                }
            } catch (NoSuchMethodException unused) {
                LogUtil.c("HAF_MemoryInfoUtil", "getMemoryOtherInfo NoSuchMethodException");
            }
        }
        return 0;
    }

    private static ActivityManager.MemoryInfo d(ActivityManager activityManager) {
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        activityManager.getMemoryInfo(memoryInfo);
        return memoryInfo;
    }

    private static int e() {
        ThreadGroup threadGroup = Thread.currentThread().getThreadGroup();
        ThreadGroup parent = threadGroup.getParent();
        while (true) {
            ThreadGroup threadGroup2 = parent;
            ThreadGroup threadGroup3 = threadGroup;
            threadGroup = threadGroup2;
            if (threadGroup != null) {
                parent = threadGroup.getParent();
            } else {
                return threadGroup3.activeCount();
            }
        }
    }

    private static void e(StringBuilder sb) {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(runningAppProcessInfo);
        sb.append(", importance=(");
        sb.append(runningAppProcessInfo.importance);
        sb.append(", ");
        sb.append(runningAppProcessInfo.importanceReasonCode);
        sb.append(Constants.RIGHT_BRACKET_ONLY);
    }

    private static void e(StringBuilder sb, Debug.MemoryInfo memoryInfo, int i) {
        int iA = a(memoryInfo, "getOtherPss", i);
        int iA2 = a(memoryInfo, "getOtherPrivate", i);
        int iA3 = a(memoryInfo, "getOtherSwappedOutPss", i);
        int iA4 = a(memoryInfo, "getOtherSwappedOut", i);
        sb.append(", dex-mmap=(");
        sb.append(iA);
        sb.append(", ");
        sb.append(iA2);
        sb.append(", ");
        sb.append(iA3);
        sb.append(", ");
        sb.append(iA4);
        sb.append(Constants.RIGHT_BRACKET_ONLY);
    }

    static class AndroidPlatformV23 {
        private AndroidPlatformV23() {
        }

        static void b(PrintWriter printWriter, Debug.MemoryInfo memoryInfo) throws NoSuchMethodException, ClassNotFoundException {
            Method methodE = ReflectionUtils.e(ReflectionUtils.e("android.app.ActivityThread"), "dumpMemInfoTable", (Class<?>[]) new Class[]{PrintWriter.class, Debug.MemoryInfo.class, Boolean.TYPE, Boolean.TYPE, Boolean.TYPE, Boolean.TYPE, Integer.TYPE, String.class, Long.TYPE, Long.TYPE, Long.TYPE, Long.TYPE, Long.TYPE, Long.TYPE});
            int iMyPid = Process.myPid();
            ReflectionUtils.e(methodE, (Object) null, printWriter, memoryInfo, false, true, false, false, Integer.valueOf(iMyPid), ProcessUtil.c(), 0, 0, 0, 0, 0, 0);
        }

        static void e(StringBuilder sb, Debug.MemoryInfo memoryInfo) {
            String memoryStat = memoryInfo.getMemoryStat("summary.java-heap");
            String memoryStat2 = memoryInfo.getMemoryStat("summary.native-heap");
            String memoryStat3 = memoryInfo.getMemoryStat("summary.code");
            String memoryStat4 = memoryInfo.getMemoryStat("summary.system");
            sb.append("total-pss=");
            sb.append(memoryInfo.getTotalPss());
            sb.append(", java-heap=");
            sb.append(memoryStat);
            sb.append(", native-heap=");
            sb.append(memoryStat2);
            sb.append(", code=");
            sb.append(memoryStat3);
            sb.append(", system=");
            sb.append(memoryStat4);
        }
    }

    static class AndroidPlatformV19 {
        private AndroidPlatformV19() {
        }
    }
}
