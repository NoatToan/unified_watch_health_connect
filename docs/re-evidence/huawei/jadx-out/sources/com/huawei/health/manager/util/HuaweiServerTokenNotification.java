package com.huawei.health.manager.util;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.plugindaemon.R;
import defpackage.lsb;

/* JADX INFO: loaded from: classes2.dex */
public class HuaweiServerTokenNotification {
    private HuaweiServerTokenNotification() {
    }

    public static void d(Context context) {
        if (context == null) {
            LogUtil.e("Step_HuaweiServerTokenNotification", "pushServerTokenInvalidNotification context is null");
            return;
        }
        Intent intent = new Intent();
        intent.setClassName(context, "com.huawei.health.MainActivity");
        PendingIntent activity = PendingIntent.getActivity(context, 0, intent, 1140850688);
        Notification.Builder builderC = lsb.d().c();
        builderC.setSmallIcon(R.drawable.healthlogo_ic_notification).setContentTitle(context.getString(R.string.IDS_plugindameon_server_token_invalid_relogin_title)).setContentText(context.getString(R.string.IDS_plugindameon_server_token_invalid_relogin_content)).setContentIntent(activity).setStyle(new Notification.BigTextStyle().bigText(context.getString(R.string.IDS_plugindameon_server_token_invalid_relogin_content)));
        builderC.setAutoCancel(true);
        lsb.d().c(121, builderC.build());
        LogUtil.d("Step_HuaweiServerTokenNotification", "showNotification");
    }
}
