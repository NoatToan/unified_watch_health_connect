package com.huawei.haf.common.os;

import android.os.Debug;
import com.huawei.haf.application.BaseApplication;
import health.compact.a.LogUtil;
import health.compact.a.ReflectionUtils;
import health.compact.a.ReleaseLogUtil;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;

/* JADX INFO: loaded from: classes.dex */
public class MemoryUtils {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Runnable f5917c = new Runnable() { // from class: com.huawei.haf.common.os.MemoryUtils.1
        @Override // java.lang.Runnable
        public void run() {
            MemoryUtils.c();
        }
    };
    public static final Runnable d = new Runnable() { // from class: com.huawei.haf.common.os.MemoryUtils.2
        @Override // java.lang.Runnable
        public void run() {
            MemoryUtils.e(true);
            MemoryUtils.a((Debug.MemoryInfo) null, true);
        }
    };

    private MemoryUtils() {
    }

    public static void c() {
        System.gc();
        System.runFinalization();
        System.gc();
    }

    public static long d() {
        return MemoryInfoUtil.d();
    }

    public static String a(Debug.MemoryInfo memoryInfo, boolean z) {
        if (memoryInfo == null) {
            memoryInfo = new Debug.MemoryInfo();
            Debug.getMemoryInfo(memoryInfo);
        }
        StringBuilder sb = new StringBuilder(256);
        MemoryInfoUtil.b(sb, memoryInfo, 10);
        if (z) {
            sb.append(", ver=");
            sb.append(BaseApplication.i());
            String string = sb.toString();
            ReleaseLogUtil.c("HAF_MemoryUtils", string);
            return string;
        }
        return sb.toString();
    }

    public static String e(Debug.MemoryInfo memoryInfo) {
        if (memoryInfo == null) {
            memoryInfo = new Debug.MemoryInfo();
            Debug.getMemoryInfo(memoryInfo);
        }
        StringWriter stringWriter = new StringWriter(4096);
        PrintWriter printWriter = new PrintWriter(stringWriter);
        MemoryInfoUtil.a(printWriter, memoryInfo);
        printWriter.close();
        return stringWriter.toString();
    }

    public static String e(boolean z) {
        StringBuilder sb = new StringBuilder(128);
        MemoryInfoUtil.a(sb);
        String string = sb.toString();
        if (z) {
            LogUtil.b("HAF_MemoryUtils", string);
        }
        return string;
    }

    public static int b(Debug.MemoryInfo memoryInfo, int i) {
        return MemoryInfoUtil.a(memoryInfo, "getOtherPss", i);
    }

    public static int a(Debug.MemoryInfo memoryInfo, int i) {
        return MemoryInfoUtil.a(memoryInfo, "getOtherSwappedOutPss", i);
    }

    public static boolean a(File file) {
        try {
            Debug.dumpHprofData(file.getPath());
            return true;
        } catch (IOException e) {
            LogUtil.d("HAF_MemoryUtils", "dumpHprofData ex=", LogUtil.c(e));
            return false;
        }
    }

    public static void a() {
        LogUtil.b("HAF_MemoryUtils", "trimRenderMemory");
        try {
            Class<?> clsE = ReflectionUtils.e("android.view.WindowManagerGlobal");
            ReflectionUtils.e(ReflectionUtils.e(clsE, "trimMemory", (Class<?>[]) new Class[]{Integer.TYPE}), ReflectionUtils.e(clsE, "getInstance"), 80);
        } catch (ClassNotFoundException unused) {
            LogUtil.d("HAF_MemoryUtils", "trimRenderMemory ClassNotFoundException.");
        } catch (NoSuchMethodException unused2) {
            LogUtil.d("HAF_MemoryUtils", "trimRenderMemory NoSuchMethodException.");
        }
    }
}
