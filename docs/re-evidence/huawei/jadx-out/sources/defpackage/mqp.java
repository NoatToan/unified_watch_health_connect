package defpackage;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Intent;
import android.net.Uri;
import com.huawei.haf.common.base.BaseNotification;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwdevicemgr.R;
import com.huawei.hwlogsmodel.LogUtil;

/* JADX INFO: loaded from: classes11.dex */
public class mqp extends BaseNotification {
    public static void b(String str, String str2, DeviceInfo deviceInfo, int i, int i2) {
        String str3;
        if (i2 == 1) {
            str3 = "huaweischeme://healthapp/basicHealth?healthType=8";
        } else {
            if (i2 != 2) {
                LogUtil.a("BloodGlucoseMatterNotificationUtils", "jump page is not in range");
                return;
            }
            str3 = "huaweihealth://huaweihealth.app/openwith?address=com.huawei.health.h5.matter?isImmerse&h5pro=true&pName=com.huawei.health&deviceMac=" + ifp.b(deviceInfo.getDeviceIdentify()) + "&bluetoothName=" + deviceInfo.getDeviceName() + "&jumpPage=home&startMode=2";
        }
        LogUtil.a("BloodGlucoseMatterNotificationUtils", "uri str is " + str3);
        Intent intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse(str3));
        intent.addCategory("android.intent.category.DEFAULT").addFlags(268435456);
        PendingIntent activity = PendingIntent.getActivity(BaseApplication.getContext(), 0, intent, 201326592);
        Notification.Builder builderC = lsb.d().c();
        builderC.setSmallIcon(R.drawable.healthlogo_ic_notification).setContentIntent(activity).setOngoing(false).setAutoCancel(true).setContentTitle(str).setContentText(str2).setStyle(new Notification.BigTextStyle().bigText(str2)).setWhen(System.currentTimeMillis());
        try {
            lsb.d().c(i + 20241212, builderC.build());
        } catch (Exception e) {
            LogUtil.e("BloodGlucoseMatterNotificationUtils", "updateBloodGlucoseNotification Exception ", ExceptionUtils.c(e));
        }
    }
}
