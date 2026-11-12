package defpackage;

import android.app.NotificationChannel;
import com.huawei.haf.common.base.BaseNotification;
import health.compact.a.NotificationUtils;

/* JADX INFO: loaded from: classes37.dex */
final class lsi extends BaseNotification {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile lsi f40760c;

    lsi() {
    }

    static lsi a() {
        if (f40760c == null) {
            synchronized (lsi.class) {
                if (f40760c == null) {
                    lsi lsiVar = new lsi();
                    lsiVar.e("channel_content_info_id", e("IDS_hw_app_name", "IDS_app_name_health"), 2);
                    f40760c = lsiVar;
                }
            }
        }
        return f40760c;
    }

    @Override // com.huawei.haf.common.base.BaseNotification
    public void e(NotificationChannel notificationChannel) {
        super.e(notificationChannel);
        NotificationUtils.c(notificationChannel, 2);
    }
}
