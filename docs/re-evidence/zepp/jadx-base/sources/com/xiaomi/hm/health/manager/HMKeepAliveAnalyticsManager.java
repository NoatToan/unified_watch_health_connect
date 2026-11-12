package com.xiaomi.hm.health.manager;

import android.os.Handler;
import android.os.Process;
import com.huami.account.HMLoginManager;
import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CalculationEventBuilder;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.baseutil.TimeUtils;
import com.xiaomi.hm.health.device.event.StatEvent;
import com.xiaomi.hm.health.keeper.HMKeeper;

/* JADX INFO: loaded from: classes21.dex */
public class HMKeepAliveAnalyticsManager {
    private static final String a = "HMKeepAliveAnalyticsManager";
    private static final int b = -1;
    private static long c = System.currentTimeMillis();
    private static Handler d = new Handler();

    public class a implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            HMKeeper.setKeepAliveTimeEnd(System.currentTimeMillis());
            HMKeepAliveAnalyticsManager.d.postDelayed(this, 5000L);
        }
    }

    private static void b(long start, long end, boolean alive) {
        boolean keepAliveIsSetted = HMKeeper.getKeepAliveIsSetted();
        boolean zIsInMainland = HMLoginManager.isInMainland();
        long j = end - start;
        CalculationEventBuilder calculationEventBuilder = new CalculationEventBuilder(StatEvent.ALIVE_TIME_SPAN, j / 1000);
        calculationEventBuilder.addExtra("isSet", keepAliveIsSetted ? "1" : "0").addExtra("start", String.valueOf(start)).addExtra("end", String.valueOf(end)).setIdentified(zIsInMainland).setAnonymous(!zIsInMainland);
        if (alive) {
            calculationEventBuilder.addExtra("state", "alive");
        }
        Analytics.recordEvent(calculationEventBuilder);
        HMLog.i(a, "pid:" + HMKeeper.getLastPid(-1) + ";isSet:" + keepAliveIsSetted + ";timeSpan:" + j + ";start:" + start + ";end:" + end, new Object[0]);
    }

    private static void c() {
        d.postDelayed(new a(), 5000L);
    }

    public static void recordPerDay() {
        long keepAliveTimeStart = HMKeeper.getKeepAliveTimeStart(-1);
        if (keepAliveTimeStart == -1) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (TimeUtils.isTheSameDay(jCurrentTimeMillis, c)) {
            return;
        }
        b(keepAliveTimeStart, jCurrentTimeMillis, true);
        c = jCurrentTimeMillis;
    }

    public static void start() {
        int lastPid = HMKeeper.getLastPid(-1);
        long keepAliveTimeStart = HMKeeper.getKeepAliveTimeStart(-1);
        long keepAliveTimeEnd = HMKeeper.getKeepAliveTimeEnd(-1);
        if (lastPid != -1 && keepAliveTimeStart != -1 && keepAliveTimeEnd != -1) {
            b(keepAliveTimeStart, keepAliveTimeEnd, false);
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        HMKeeper.setLastPid(Process.myPid());
        HMKeeper.setKeepAliveTimeStart(jCurrentTimeMillis);
        HMKeeper.setKeepAliveTimeEnd(jCurrentTimeMillis);
        c();
    }
}
