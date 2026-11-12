package health.compact.a;

import android.app.Notification;
import android.content.Context;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.plugindaemon.R;

/* JADX INFO: loaded from: classes2.dex */
public class NotificationHelper {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f36620b = "NotificationHelper";

    private NotificationHelper() {
    }

    public static void e(Context context, Notification.Builder builder) {
        if (context == null || builder == null) {
            com.huawei.hwlogsmodel.LogUtil.j(f36620b, "context or builder is null");
        } else if ("com.huawei.bone".equals(BaseApplication.getAppPackage())) {
            builder.setSmallIcon(R.drawable.ic_wear_notification);
        } else {
            builder.setSmallIcon(R.drawable.healthlogo_ic_notification);
        }
    }
}
