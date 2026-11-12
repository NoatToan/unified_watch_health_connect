package com.huawei.agconnect.apms;

import android.app.Activity;
import android.os.Build;
import com.huawei.agconnect.apms.collect.model.event.interaction.ActivityLoadEvent;
import com.huawei.agconnect.apms.log.AgentLog;
import com.huawei.agconnect.apms.log.AgentLogManager;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes3.dex */
public final class x {
    public static final AgentLog lmn = AgentLogManager.getAgentLog();
    public static volatile x mno;
    public long fgh;
    public long ghi;
    public long hij;
    public long ijk;
    public long jkl;
    public int cde = 0;
    public int def = 0;
    public int efg = 0;
    public gfe abc = new gfe();
    public WeakHashMap<Activity, Long> bcd = new WeakHashMap<>();
    public ExecutorService klm = Executors.newSingleThreadExecutor(new m("AppRenderReporter"));

    public static final class abc implements Runnable {
        public long abc;
        public String bcd;
        public String cde = ActivityLoadEvent.LoadType.COLD_LOAD;
        public long def;
        public long efg;
        public long fgh;

        public abc(long j, String str, long j2, long j3, long j4) {
            this.abc = j;
            this.bcd = str;
            this.def = j2;
            this.efg = j3;
            this.fgh = j4;
        }

        @Override // java.lang.Runnable
        public final void run() {
            pon.cde.add(new ActivityLoadEvent(this.abc, this.bcd, this.cde, this.def, this.efg, this.fgh));
        }
    }

    public static x abc() {
        if (mno == null) {
            synchronized (x.class) {
                if (mno == null) {
                    mno = new x();
                }
            }
        }
        return mno;
    }

    public final void bcd(WeakReference<Activity> weakReference) {
        this.hij = System.currentTimeMillis();
        if (weakReference.get() != null && Build.VERSION.SDK_INT >= 29) {
            Activity activity = weakReference.get();
            if (Agent.isDisabled() || this.ijk == 0) {
                return;
            }
            String simpleName = activity.getClass().getSimpleName().length() != 0 ? activity.getClass().getSimpleName() : "";
            long j = this.hij;
            long j2 = this.ijk;
            long j3 = this.fgh;
            this.klm.execute(new abc(j2, simpleName, j - j2, j3 - j2, j - j3));
            this.ijk = 0L;
            this.jkl = 0L;
        }
    }

    public final void abc(WeakReference<Activity> weakReference) {
        this.ghi = System.currentTimeMillis();
        if (weakReference.get() != null && Build.VERSION.SDK_INT <= 28) {
            Activity activity = weakReference.get();
            if (Agent.isDisabled() || this.jkl == 0) {
                return;
            }
            String simpleName = activity.getClass().getSimpleName().length() != 0 ? activity.getClass().getSimpleName() : "";
            long j = this.ghi;
            long j2 = this.jkl;
            this.klm.execute(new abc(j2, simpleName, j - j2, -1L, -1L));
            this.ijk = 0L;
            this.jkl = 0L;
        }
    }
}
