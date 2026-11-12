package defpackage;

import android.app.NotificationChannel;
import com.huawei.haf.common.base.BaseNotification;
import health.compact.a.NotificationUtils;

/* JADX INFO: loaded from: classes10.dex */
final class lse extends BaseNotification {
    private static volatile lse d;

    private lse() {
    }

    static lse e() {
        if (d == null) {
            synchronized (lse.class) {
                if (d == null) {
                    lse lseVar = new lse();
                    lseVar.e("com.huawei.health", e("IDS_device_transfer_data_notification_title", "IDS_app_name_health"), 4);
                    d = lseVar;
                }
            }
        }
        return d;
    }

    @Override // com.huawei.haf.common.base.BaseNotification
    public void e(NotificationChannel notificationChannel) {
        notificationChannel.setSound(null, null);
        NotificationUtils.c(notificationChannel, 4);
    }
}
