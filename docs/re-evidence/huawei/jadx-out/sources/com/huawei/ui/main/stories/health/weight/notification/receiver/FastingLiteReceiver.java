package com.huawei.ui.main.stories.health.weight.notification.receiver;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.ui.main.R;
import defpackage.lsb;
import defpackage.ltb;
import defpackage.qrs;
import defpackage.uxb;
import defpackage.vgp;
import defpackage.vhl;
import defpackage.vhm;
import defpackage.vhn;
import defpackage.wvf;
import java.util.Calendar;

/* JADX INFO: loaded from: classes19.dex */
public class FastingLiteReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (!intent.hasExtra("fastingLiteUid")) {
            LogUtil.j("HealthWeight_FastingLiteReceiver", "has no extra ", "fastingLiteUid");
            return;
        }
        String stringExtra = intent.getStringExtra("fastingLiteUid");
        String accountInfo = LoginInit.getInstance(context).getAccountInfo(1011);
        LogUtil.a("HealthWeight_FastingLiteReceiver", "huid ", stringExtra, " currentUserId", accountInfo);
        if (TextUtils.isEmpty(stringExtra) || TextUtils.isEmpty(accountInfo) || !stringExtra.equals(accountInfo)) {
            return;
        }
        final int intExtra = intent.getIntExtra("fastingLiteId", -1);
        long longExtra = intent.getLongExtra("fastingLiteTime", 0L);
        LogUtil.a("HealthWeight_FastingLiteReceiver", "onReceive fastingLiteType = ", Integer.valueOf(intExtra), "; fastingLiteTime = ", ltb.e(longExtra));
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (Math.abs(b(jCurrentTimeMillis) - b(longExtra)) > 20 || d(jCurrentTimeMillis, intExtra)) {
            return;
        }
        ThreadPoolManager.c().execute(new Runnable() { // from class: vhq
            @Override // java.lang.Runnable
            public final void run() {
                this.d.c(intExtra);
            }
        });
    }

    public /* synthetic */ void c(int i) {
        vgp vgpVarB = vhn.b();
        if (vgpVarB == null || vgpVarB.d() == null || vgpVarB.d().d() == null) {
            LogUtil.j("HealthWeight_FastingLiteReceiver", "sendNotification getSetting fail");
            return;
        }
        if (vgpVarB.d().d().i() > 0) {
            LogUtil.a("HealthWeight_FastingLiteReceiver", "sendNotification lower version");
            vhl.e().c();
            return;
        }
        vhm vhmVarA = uxb.c().a();
        if (vhmVarA != null) {
            vhmVarA.u();
        }
        if (i == 20210707 || (vhmVarA != null && vhmVarA.l())) {
            uxb.c().g();
        }
        if (!wvf.e().d()) {
            LogUtil.j("HealthWeight_FastingLiteReceiver", "notice not enable");
        } else {
            b(i);
        }
    }

    private boolean d(long j, int i) {
        String strD = wvf.e().d(i);
        LogUtil.a("HealthWeight_FastingLiteReceiver", "isRepeatedNotification mLastRemindMap: ", strD);
        if (TextUtils.isEmpty(strD) || Math.abs(j - qrs.f(strD)) >= 1200000) {
            return false;
        }
        LogUtil.a("HealthWeight_FastingLiteReceiver", "isRepeatedNotification reminderId:", strD);
        return true;
    }

    private int b(long j) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        int i = (calendar.get(11) * 60) + calendar.get(12);
        LogUtil.a("HealthWeight_FastingLiteReceiver", "getMinute : ", Integer.valueOf(i));
        return i;
    }

    private void b(int i) {
        String string;
        int i2;
        if (i == 20100410) {
            string = BaseApplication.b().getResources().getString(R.string.IDS_wl_food_notice_b_status);
            i2 = 20100415;
        } else {
            if (i != 20100413) {
                if (i != 20210707) {
                    return;
                }
                String string2 = BaseApplication.b().getResources().getString(R.string.IDS_weight_fasting_notice);
                a(string2, string2, 20210707, i);
                return;
            }
            string = BaseApplication.b().getResources().getString(R.string.IDS_wl_food_notice_e_status);
            i2 = 20100417;
        }
        if (uxb.c().e()) {
            LogUtil.a("HealthWeight_FastingLiteReceiver", "sendNotification isRestDay");
        } else {
            a(string, string, i2, i);
        }
    }

    private void a(CharSequence charSequence, CharSequence charSequence2, int i, int i2) {
        if (TextUtils.isEmpty(charSequence2)) {
            LogUtil.j("HealthWeight_FastingLiteReceiver", "sendNotification content is null");
            return;
        }
        lsb.d().e(i);
        LogUtil.a("HealthWeight_FastingLiteReceiver", "setNotify reminderId = ", Integer.valueOf(i2));
        Notification.Builder builderC = lsb.d().c();
        qrs.c(builderC);
        builderC.setTicker(charSequence);
        builderC.setContentTitle(BaseApplication.b().getResources().getString(R.string.IDS_wl_food_entrance_light_f));
        builderC.setContentText(charSequence2);
        Intent intent = new Intent();
        intent.setClassName(BaseApplication.d(), "com.huawei.health.browseraction.HwSchemeBasicHealthActivity");
        intent.putExtra("fastingLiteNotification", 1);
        if (i2 == 20210707) {
            intent.setAction("fasting_report");
        }
        builderC.setContentIntent(PendingIntent.getActivity(BaseApplication.b(), i2, intent, 201326592));
        builderC.setAutoCancel(true);
        builderC.setDefaults(1);
        builderC.setOngoing(false);
        builderC.setOnlyAlertOnce(true);
        builderC.setStyle(new Notification.BigTextStyle().bigText(charSequence2));
        lsb.d().c(i, builderC.build());
        wvf.e().d(i2, String.valueOf(System.currentTimeMillis()));
        LogUtil.a("HealthWeight_FastingLiteReceiver", "sendNotification, notificationId: ", Integer.valueOf(i), ", reminderId: ", Integer.valueOf(i2));
    }
}
