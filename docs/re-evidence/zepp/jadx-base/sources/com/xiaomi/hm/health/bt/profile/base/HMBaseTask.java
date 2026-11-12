package com.xiaomi.hm.health.bt.profile.base;

import com.xiaomi.hm.health.bt.debug.Debug;

/* JADX INFO: loaded from: classes11.dex */
public abstract class HMBaseTask implements Runnable {
    private static final String a = "HMBaseTask";

    public abstract void doWork();

    @Override // java.lang.Runnable
    public final void run() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        Debug.fi(a, "==================== start " + getClass().getSimpleName() + " start ====================");
        try {
            doWork();
        } catch (Throwable th) {
            Debug.fi(a, "Task执行失败:" + th.toString());
        }
        Debug.fi(a, "====================end " + getClass().getSimpleName() + " end ====================<" + (System.currentTimeMillis() - jCurrentTimeMillis) + "ms>");
    }
}
