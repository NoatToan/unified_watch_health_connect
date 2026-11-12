package com.huawei.pluginachievement.ui.kakatask;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.text.TextUtils;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.pluginachievement.R;
import com.huawei.pluginachievement.manager.model.KakaConstants;
import com.huawei.pluginachievement.ui.AchieveKaKaActivity;
import defpackage.ioi;
import defpackage.lsb;
import defpackage.osa;
import defpackage.osb;
import defpackage.qrs;
import defpackage.xjk;
import java.util.Calendar;

/* JADX INFO: loaded from: classes41.dex */
public class KakaReminderReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (xjk.d(intent)) {
            LogUtil.j("KakaReminderReceiver", "KakaReminderReceiver isDifferentTimeZone.");
            return;
        }
        String stringExtra = intent.getStringExtra("reminderHuid");
        String accountInfo = LoginInit.getInstance(context).getAccountInfo(1011);
        LogUtil.a("KakaReminderReceiver", "onReceive time ", Long.valueOf(System.currentTimeMillis()));
        if (TextUtils.isEmpty(stringExtra) || TextUtils.isEmpty(accountInfo) || !stringExtra.equals(accountInfo)) {
            return;
        }
        String strC = ioi.d().c(403);
        LogUtil.a("KakaReminderReceiver", "onReceive: kaKaReminderStatus -> " + strC);
        if (String.valueOf(false).equals(strC)) {
            return;
        }
        if (!osb.a(osa.e(context, "kakaLastCheckInTime")) || TextUtils.isEmpty(osa.e(context, "kakaLastCheckInTime"))) {
            c(context);
        }
    }

    private void c(Context context) {
        int i = Calendar.getInstance().get(11);
        LogUtil.a("KakaReminderReceiver", "setNotify hour ", Integer.valueOf(i));
        if (i <= 9 || i >= 22) {
            return;
        }
        a(context);
    }

    private void a(Context context) {
        lsb.d().e(20204000);
        Notification.Builder builderC = lsb.d().c();
        qrs.c(builderC);
        Resources resources = BaseApplication.getContext().getResources();
        builderC.setContentTitle(resources.getString(R.string.IDS_kaka_reminder_notice_title)).setContentText(resources.getString(R.string.IDS_kaka_reminder_notice_content));
        Intent intent = new Intent(context, (Class<?>) AchieveKaKaActivity.class);
        intent.putExtra(KakaConstants.KAKA_FROM_NOTIFICATION_KEY, true);
        builderC.setContentIntent(PendingIntent.getActivity(context, 0, intent, 201326592));
        builderC.setAutoCancel(true);
        lsb.d().c(20204000, builderC.build());
        LogUtil.a("KakaReminderReceiver", "setNotify success");
    }
}
