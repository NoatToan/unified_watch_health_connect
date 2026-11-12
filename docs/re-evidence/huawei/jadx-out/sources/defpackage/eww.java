package defpackage;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Intent;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.R;
import com.huawei.up.utils.ErrorCode;

/* JADX INFO: loaded from: classes7.dex */
public class eww {
    public static void e(String str) {
        Intent intent = new Intent();
        intent.setPackage("com.huawei.health");
        intent.setClassName("com.huawei.health", "com.huawei.health.MainActivity");
        Notification notificationBuild = lsb.d().c().setAutoCancel(false).setPriority(0).setSmallIcon(R.drawable.healthlogo_ic_notification).setShowWhen(true).setOngoing(true).setWhen(System.currentTimeMillis()).setContentIntent(PendingIntent.getActivity(BaseApplication.getContext(), 0, intent, 201326592)).setContentText(BaseApplication.getContext().getResources().getString(R.string.IDS_daily_music_notification) + " · " + str).build();
        lsb.d().c(ErrorCode.HWID_IS_STOPED, notificationBuild);
        StringBuilder sb = new StringBuilder("sendNotification complete, notification: ");
        sb.append(notificationBuild.toString());
        LogUtil.a("NotificationUtil", sb.toString());
    }

    public static void d() {
        lsb.d().e(ErrorCode.HWID_IS_STOPED);
        LogUtil.a("NotificationUtil", "cancelNotification complete");
    }
}
