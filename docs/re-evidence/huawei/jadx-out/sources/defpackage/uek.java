package defpackage;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Intent;
import android.net.Uri;
import com.huawei.hwcommonmodel.application.BaseApplication;
import health.compact.a.SharedPreferenceManager;

/* JADX INFO: loaded from: classes43.dex */
public class uek {
    public static void d(Notification.Builder builder) {
        lsb.d().c(20211202, builder.build());
        SharedPreferenceManager.e(BaseApplication.getContext(), Integer.toString(10000), "last_time_notice_measure_ecg", String.valueOf(System.currentTimeMillis()), null);
    }

    public static Notification.Builder b(String str, String str2, boolean z) {
        return c(str, str2, z ? "com.huawei.health.ecgce.remind.measure.switch" : "com.huawei.health.ecg.remind.measure.switch");
    }

    public static Notification.Builder c(String str, String str2, String str3) {
        Notification.Builder builderC = lsb.d().c();
        qrs.c(builderC);
        builderC.setContentTitle(str).setContentText(str2).setStyle(new Notification.BigTextStyle().bigText(str2)).setAutoCancel(true).setDefaults(1).setOngoing(false).setOnlyAlertOnce(true);
        Intent intent = new Intent();
        if ("com.huawei.health.vascular-health.remind.measure.switch".equals(str3)) {
            intent.setData(Uri.parse("huaweihealth://huaweihealth.app/openwith?address=com.huawei.health.h5.vascular-health?h5pro=true&urlType=4&from=7"));
        } else {
            intent.setClassName(BaseApplication.getAppPackage(), "com.huawei.health.browseraction.HwSchemeBasicHealthActivity");
            intent.putExtra("ecgNotification", 1);
        }
        str3.hashCode();
        if (str3.equals("com.huawei.health.ecg.remind.measure.switch")) {
            intent.putExtra("ecgPageType", "collection");
        } else if (str3.equals("com.huawei.health.ecgce.remind.measure.switch")) {
            intent.putExtra("ecgPageType", "electrocardiogram");
        } else {
            intent.putExtra("ecgPageType", 0);
        }
        builderC.setContentIntent(PendingIntent.getActivity(com.huawei.haf.application.BaseApplication.b(), 0, intent, 201326592));
        return builderC;
    }

    public static byte[] e(byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr2 == null) {
            return null;
        }
        byte[] bArr3 = new byte[bArr.length + bArr2.length];
        System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
        System.arraycopy(bArr2, 0, bArr3, bArr.length, bArr2.length);
        return bArr3;
    }
}
