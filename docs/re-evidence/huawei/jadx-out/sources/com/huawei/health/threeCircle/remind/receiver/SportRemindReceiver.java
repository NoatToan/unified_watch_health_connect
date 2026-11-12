package com.huawei.health.threeCircle.remind.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.huawei.haf.handler.HandlerCenter;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.threeCircle.remind.receiver.SportRemindReceiver;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.ijx;
import defpackage.ikx;
import defpackage.pil;
import defpackage.xjk;
import health.compact.a.CommonUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.Arrays;
import java.util.Calendar;

/* JADX INFO: loaded from: classes9.dex */
public class SportRemindReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        LogUtil.a("TC_SprtRmdRecv", "Receive sport remind broadcast-----------");
        if (intent == null) {
            LogUtil.j("TC_SprtRmdRecv", "intent == null");
            return;
        }
        LogUtil.a("TC_SprtRmdRecv", "intent action:", intent.getAction());
        final String[] stringArrayExtra = intent.getStringArrayExtra("remindType");
        if (stringArrayExtra == null || stringArrayExtra.length <= 0) {
            ReleaseLogUtil.e("R_TC_SprtRmdRecv", "remind type is empty.");
            return;
        }
        String str = stringArrayExtra[0];
        ijx.a().d(str);
        boolean zD = xjk.d(intent);
        ReleaseLogUtil.d("TC_SprtRmdRecv", "onReceive isDifferentTimeZone ", Boolean.valueOf(zD), " type ", str);
        if (zD) {
            return;
        }
        final int intExtra = intent.getIntExtra("reportDate", 0);
        final long jA = a(stringArrayExtra);
        ReleaseLogUtil.d("R_TC_SprtRmdRecv", "Receive remind:", Arrays.toString(stringArrayExtra), " reportDate:", Integer.valueOf(intExtra), "delayTime:", Long.valueOf(jA));
        ThreadPoolManager.c().execute(new Runnable() { // from class: ikt
            @Override // java.lang.Runnable
            public final void run() {
                this.d.d(stringArrayExtra, intExtra, jA);
            }
        });
    }

    public /* synthetic */ void d(String[] strArr, final int i, long j) {
        for (final String str : strArr) {
            if (c(str)) {
                LogUtil.a("TC_SprtRmdRecv", "send remindType is ", str);
                HandlerCenter.a().d(new Runnable() { // from class: ikq
                    @Override // java.lang.Runnable
                    public final void run() {
                        SportRemindReceiver.d(i, str);
                    }
                }, j);
            }
        }
    }

    public static /* synthetic */ void d(int i, String str) {
        if (i == 0) {
            ijx.a().c(str);
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putInt("reportDate", i);
        ijx.a().b(str, bundle);
    }

    private long a(String[] strArr) {
        for (String str : strArr) {
            if ("TodayAchievement".equals(str) || "LagEncourage".equals(str) || "OverGoal".equals(str)) {
                return 0L;
            }
        }
        int iNextInt = pil.b().nextInt(170);
        Calendar calendar = Calendar.getInstance();
        int i = calendar.get(12);
        int i2 = calendar.get(11);
        if ((i2 != 8 || i < 50) && (i2 != 9 || i > 10)) {
            return 0L;
        }
        return iNextInt * 60000;
    }

    private boolean c(String str) {
        if (CommonUtil.cl()) {
            return true;
        }
        if ("ActiveWeek".equals(str) || "PerfectWeek".equals(str)) {
            return ikx.a();
        }
        if ("PerfectMonth".equals(str)) {
            return ikx.c();
        }
        return true;
    }
}
