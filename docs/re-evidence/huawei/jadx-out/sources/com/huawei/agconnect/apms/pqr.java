package com.huawei.agconnect.apms;

import android.app.Activity;
import android.os.Build;
import com.huawei.agconnect.apms.collect.model.event.interaction.AppStartEvent;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes3.dex */
public final class pqr {
    public static volatile pqr hij;
    public long cde;
    public long def;
    public long efg;
    public long fgh;
    public long ghi;
    public long bcd = Agent.getCreateTime();
    public boolean abc = true;

    public static final class abc implements Runnable {
        public long abc;
        public String bcd;
        public String cde;
        public long def;
        public long efg;
        public long fgh;

        public abc(long j, String str, String str2, long j2, long j3, long j4) {
            this.abc = j;
            this.bcd = str;
            this.cde = str2;
            this.def = j2;
            this.efg = j3;
            this.fgh = j4;
        }

        @Override // java.lang.Runnable
        public final void run() {
            pon.cde.add(new AppStartEvent(this.abc, this.bcd, this.cde, this.def, this.efg, this.fgh));
        }
    }

    public static pqr abc() {
        if (hij == null) {
            synchronized (pqr.class) {
                if (hij == null) {
                    hij = new pqr();
                }
            }
        }
        return hij;
    }

    public final void bcd(WeakReference<Activity> weakReference) {
        this.cde = System.currentTimeMillis();
        if (weakReference.get() != null && Build.VERSION.SDK_INT <= 28) {
            Activity activity = weakReference.get();
            if (Agent.isDisabled()) {
                return;
            }
            String simpleName = activity.getClass().getSimpleName().length() != 0 ? activity.getClass().getSimpleName() : "";
            long j = this.bcd;
            if (j != 0) {
                abc(j, simpleName, AppStartEvent.StartType.COLD_START, this.cde - j, -1L, -1L);
            } else {
                long j2 = this.fgh;
                if (j2 != 0 && this.abc) {
                    abc(j2, simpleName, AppStartEvent.StartType.HOT_START, this.cde - j2, -1L, -1L);
                }
            }
            this.bcd = 0L;
            this.cde = 0L;
            this.def = 0L;
            this.efg = 0L;
            this.fgh = 0L;
            this.ghi = 0L;
        }
    }

    public final void abc(WeakReference<Activity> weakReference) {
        this.def = System.currentTimeMillis();
        if (weakReference.get() != null && Build.VERSION.SDK_INT >= 29) {
            Activity activity = weakReference.get();
            if (Agent.isDisabled()) {
                return;
            }
            String simpleName = activity.getClass().getSimpleName().length() != 0 ? activity.getClass().getSimpleName() : "";
            long j = this.bcd;
            if (j != 0) {
                long j2 = this.def;
                long j3 = this.ghi;
                abc(j, simpleName, AppStartEvent.StartType.COLD_START, j2 - j, j3 - j, j2 - j3);
            } else {
                long j4 = this.efg;
                if (j4 != 0 && this.abc) {
                    long j5 = this.def;
                    long j6 = this.ghi;
                    abc(j4, simpleName, AppStartEvent.StartType.HOT_START, j5 - j4, j6 - j4, j5 - j6);
                }
            }
            this.bcd = 0L;
            this.cde = 0L;
            this.def = 0L;
            this.efg = 0L;
            this.fgh = 0L;
            this.ghi = 0L;
        }
    }

    public static void abc(long j, String str, String str2, long j2, long j3, long j4) {
        rqp rqpVarAbc;
        if (j2 > 0) {
            if (!tsr.abc()) {
                rqpVarAbc = rqp.abc();
            } else {
                rqpVarAbc = tsr.fgh.def;
            }
            if (j2 < rqpVarAbc.efg) {
                Agent.getExecutor().execute(new abc(j, str, str2, j2, j3, j4));
            }
        }
    }
}
