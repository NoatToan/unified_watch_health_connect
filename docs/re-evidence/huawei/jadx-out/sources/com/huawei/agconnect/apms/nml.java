package com.huawei.agconnect.apms;

import android.app.Application;
import android.os.Build;
import android.text.TextUtils;
import com.huawei.agconnect.apms.collect.HiAnalyticsManager;
import com.huawei.agconnect.apms.log.AgentLog;
import com.huawei.agconnect.apms.log.AgentLogManager;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes3.dex */
public final class nml implements Runnable {
    public static final AgentLog ghi = AgentLogManager.getAgentLog();
    public final mlk def;
    public long efg;
    public final ScheduledExecutorService abc = Executors.newSingleThreadScheduledExecutor(new m("Collector"));
    public ScheduledFuture bcd = null;
    public long cde = 60000;
    public ReentrantLock fgh = new ReentrantLock();

    public static final class abc implements Runnable {
        public nml abc;
        public boolean bcd;

        public abc(nml nmlVar, boolean z) {
            this.abc = nmlVar;
            this.bcd = z;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.abc.abc(this.bcd);
            HiAnalyticsManager.getInstance().onReport();
        }
    }

    public nml(mlk mlkVar) {
        this.def = mlkVar;
    }

    public final void abc(boolean z) {
        long j;
        onm onmVar = new onm();
        onmVar.bcd = 1;
        onmVar.abc = System.currentTimeMillis();
        if (z) {
            try {
                if (vwx.abc().cde.get() || !abc()) {
                    this.def.bcd();
                } else {
                    ghi.info("skipping collection while app in background.");
                }
            } catch (Throwable th) {
                bcd.abc(th, com.huawei.agconnect.apms.abc.abc("exception occurred while executing collect: "), ghi);
            }
        } else {
            this.def.bcd();
        }
        if (4 == this.def.abc && this.bcd != null) {
            try {
                this.fgh.lock();
                ScheduledFuture scheduledFuture = this.bcd;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(true);
                    this.bcd = null;
                }
                this.fgh.unlock();
                ghi.debug("collector stopped.");
                this.def.ghi();
            } catch (Throwable th2) {
                this.fgh.unlock();
                throw th2;
            }
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (onmVar.bcd == 1) {
            onmVar.bcd = -1;
            j = jCurrentTimeMillis - onmVar.abc;
        } else {
            j = -1;
        }
        ghi.debug("tick took " + j + "ms.");
    }

    public final void bcd() {
        long jCurrentTimeMillis = this.efg == 0 ? -1L : System.currentTimeMillis() - this.efg;
        if (1000 + jCurrentTimeMillis >= this.cde || jCurrentTimeMillis == -1) {
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            try {
                abc(true);
            } catch (Throwable th) {
                bcd.abc(th, com.huawei.agconnect.apms.abc.abc("exception occurred when tick: "), ghi);
            }
            this.efg = jCurrentTimeMillis2;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.fgh.lock();
            bcd();
        } catch (Throwable th) {
            try {
                ghi.error("exception occurred when tick: " + th.getMessage());
            } finally {
                this.fgh.unlock();
            }
        }
    }

    public static boolean abc() {
        String processName;
        if (Build.VERSION.SDK_INT >= 28) {
            processName = Application.getProcessName();
        } else {
            try {
                processName = (String) Class.forName("android.app.ActivityThread").getMethod("currentProcessName", new Class[0]).invoke(null, new Object[0]);
            } catch (Throwable unused) {
                processName = "";
            }
        }
        if (Agent.getContext() == null || TextUtils.isEmpty(processName)) {
            return false;
        }
        return processName.equals(Agent.getContext().getPackageName());
    }
}
