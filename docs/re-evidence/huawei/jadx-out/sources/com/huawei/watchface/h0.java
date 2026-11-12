package com.huawei.watchface;

import android.os.SystemClock;
import com.huawei.hianalytics.process.HiAnalyticsManager;
import com.huawei.watchface.api.HwWatchFaceApi;
import com.huawei.watchface.environment.Environment;
import com.huawei.watchface.utils.BackgroundTaskUtils;
import com.huawei.watchface.utils.CommonUtils;
import com.huawei.watchface.utils.HwLog;
import com.huawei.watchface.utils.MobileInfoHelper;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

/* JADX INFO: loaded from: classes20.dex */
public class h0 {
    public void a(Throwable th, Boolean bool) {
        if (th == null) {
            HwLog.w("CrashReport", "cause is null");
            return;
        }
        HwLog.i("CrashReport", "reportException");
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        try {
            try {
                if (!HiAnalyticsManager.getInitFlag("theme_ha_normal_tag")) {
                    HwLog.i("CrashReport", "isSigned && !HiAnalyticsManager.getInitFlag(AnalyticsUtils.THEME_HA_NORMAL_TAG)");
                    b();
                    SystemClock.sleep(1000L);
                }
                th.printStackTrace(printWriter);
                StringBuilder sb = new StringBuilder();
                sb.append(stringWriter.toString());
                if (th.getMessage().contains("thread")) {
                    sb.append(a());
                }
                String strM = CommonUtils.m();
                sb.append("|topActivity:");
                sb.append(strM);
                sb.append("|intercepted:");
                sb.append(bool);
                String string = sb.toString();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("type", th.getClass().getName());
                if (!HwWatchFaceApi.getInstance(Environment.getApplicationContext()).isOversea()) {
                    linkedHashMap.put("message", CommonUtils.d(string));
                }
                linkedHashMap.put("occur_version", MobileInfoHelper.getVersion());
                linkedHashMap.put("topActivity", strM);
                HwLog.i("CrashReport", "type: " + th.getClass().getName());
                e.a(linkedHashMap);
                if (!bool.booleanValue()) {
                    SystemClock.sleep(1000L);
                }
                HwLog.i("CrashReport", "HiAnalytics.onReport() after");
            } catch (Exception e) {
                HwLog.i("CrashReport", "reportException : " + HwLog.printException(e));
            }
        } finally {
            c0.a(stringWriter);
            c0.a(printWriter);
        }
    }

    public final void b() {
        try {
            BackgroundTaskUtils.submit(new Runnable() { // from class: com.huawei.watchface.h0$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    m.d().a(Environment.getApplicationContext());
                }
            });
        } catch (Exception e) {
            HwLog.e("CrashReport", "initHiAnalytics  Exception : " + HwLog.printException(e));
        }
    }

    public final String a() {
        StringBuilder sb = new StringBuilder("CurThreadsNum : ");
        Set<Thread> setKeySet = Thread.getAllStackTraces().keySet();
        sb.append(setKeySet.size());
        sb.append("\nThreads list:\n");
        Iterator<Thread> it = setKeySet.iterator();
        while (it.hasNext()) {
            sb.append(it.next().getName());
            sb.append('\n');
        }
        return sb.toString();
    }
}
