package com.huawei.haf.application;

import android.app.Activity;
import com.huawei.haf.common.dfx.DfxMonitorTask;
import com.huawei.haf.common.dfx.memory.MemoryMonitor;
import com.huawei.haf.handler.HandlerExecutor;
import health.compact.a.DfxMonitorCenter;
import health.compact.a.LogUtil;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
final class ActivityLeakCheck implements DfxMonitorTask, Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f5782a;
    private Class d;
    private final String j;
    private final Map<Activity, Long> e = new WeakHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<Activity, Long> f5783b = new WeakHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f5784c = true;

    ActivityLeakCheck(String str) {
        this.j = str;
    }

    void d(Activity activity, long j, boolean z) {
        if (MemoryMonitor.d()) {
            this.e.put(activity, Long.valueOf(j));
        }
        this.d = z ? activity.getClass() : null;
    }

    void c(boolean z) {
        this.f5784c = !z;
        if (z) {
            return;
        }
        DfxMonitorCenter.c();
        if (MemoryMonitor.d()) {
            this.f5782a = 0;
            DfxMonitorCenter.e(this);
        }
    }

    @Override // com.huawei.haf.common.dfx.DfxMonitorTask
    public long monitorDelayTime() {
        return this.f5782a <= 0 ? 60000L : 300000L;
    }

    @Override // com.huawei.haf.common.dfx.DfxMonitorTask
    public void onMonitor() {
        HandlerExecutor.c(this);
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f5784c) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (this.f5782a <= 0) {
                e(jCurrentTimeMillis);
            }
            d(jCurrentTimeMillis);
            if (this.f5782a > 0) {
                DfxMonitorCenter.e(this);
            }
        }
    }

    private void e(long j) {
        if (this.e.isEmpty()) {
            return;
        }
        StringBuilder sbD = null;
        for (Map.Entry<Activity, Long> entry : this.e.entrySet()) {
            Activity key = entry.getKey();
            if (key != null) {
                this.f5783b.put(key, entry.getValue());
                sbD = d(sbD, key, j - entry.getValue().longValue());
                LogUtil.e(this.j, sbD.toString());
            }
        }
        this.e.clear();
    }

    private void d(long j) {
        int i = 0;
        this.f5782a = 0;
        if (this.f5783b.isEmpty()) {
            return;
        }
        HashMap map = new HashMap(this.f5783b.size());
        StringBuilder sbD = null;
        for (Map.Entry<Activity, Long> entry : this.f5783b.entrySet()) {
            Activity key = entry.getKey();
            if (key != null) {
                String name = key.getClass().getName();
                Integer num = (Integer) map.get(name);
                map.put(name, num == null ? 1 : Integer.valueOf(num.intValue() + 1));
                if (key.getClass() == this.d) {
                    i++;
                } else {
                    sbD = d(entry, j, sbD);
                }
            }
        }
        if (i > 1) {
            a(j, sbD);
        }
        if (map.isEmpty()) {
            return;
        }
        if (map.size() == 1 && i == 1) {
            return;
        }
        LogUtil.e(this.j, "Memory leak info: ", map);
    }

    private void a(long j, StringBuilder sb) {
        for (Map.Entry<Activity, Long> entry : this.f5783b.entrySet()) {
            Activity key = entry.getKey();
            if (key != null && key.getClass() == this.d) {
                sb = d(entry, j, sb);
            }
        }
    }

    private StringBuilder d(Map.Entry<Activity, Long> entry, long j, StringBuilder sb) {
        long jLongValue = j - entry.getValue().longValue();
        if (jLongValue == j) {
            return sb;
        }
        if (jLongValue > 300000) {
            Activity key = entry.getKey();
            StringBuilder sbD = d(sb, key, jLongValue);
            MemoryMonitor.c(key.getClass().getName(), null, sbD.toString(), j);
            entry.setValue(0L);
            return sbD;
        }
        this.f5782a++;
        return sb;
    }

    private StringBuilder d(StringBuilder sb, Activity activity, long j) {
        if (sb == null) {
            sb = new StringBuilder(128);
        }
        sb.delete(0, sb.length());
        sb.append("Memory leak risk: ");
        sb.append(activity);
        sb.append(", time(ms)=");
        sb.append(j);
        return sb;
    }
}
