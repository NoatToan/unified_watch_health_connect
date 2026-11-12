package defpackage;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import androidx.core.app.NotificationManagerCompat;
import com.huawei.health.receiver.GprsAbstractPushProcess;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.plugindevice.R;
import health.compact.a.CommonUtil;

/* JADX INFO: loaded from: classes30.dex */
public class gso extends GprsAbstractPushProcess {
    @Override // com.huawei.health.receiver.GprsAbstractPushProcess
    public void process(Context context, gsq.e eVar, GprsAbstractPushProcess.ProcessResult processResult) {
        c(eVar.d);
        processResult.onResult();
    }

    private void c(int i) {
        if (!CommonUtil.bg() && !NotificationManagerCompat.from(BaseApplication.getContext()).areNotificationsEnabled()) {
            LogUtil.j("GprsBloodPressurePushReceiver", "sendGprsBloodPressureNotification permission is not enabled.");
            return;
        }
        LogUtil.a("GprsBloodPressurePushReceiver", "sendGprsBloodPressureNotification dataNum:", Integer.valueOf(i));
        Intent intent = new Intent();
        intent.setData(Uri.parse("huaweischeme://healthapp/basicHealth?healthType=9"));
        PendingIntent activity = PendingIntent.getActivity(dxw.d(), 0, intent, 67108864);
        Resources resources = dxw.d().getResources();
        String string = resources.getString(R.string.IDS_device_recive_blood_pressure_content_two);
        Notification notificationBuild = lsb.d().c().setSmallIcon(com.huawei.ui.commonui.R.drawable.healthlogo_ic_notification).setContentTitle(resources.getString(R.string.IDS_device_recive_blood_pressure_title)).setContentText(string).setStyle(new Notification.BigTextStyle().bigText(string)).setContentIntent(activity).setAutoCancel(true).build();
        notificationBuild.flags |= 16;
        lsb.d().c(20210924, notificationBuild);
    }
}
