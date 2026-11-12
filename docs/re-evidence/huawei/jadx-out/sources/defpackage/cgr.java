package defpackage;

import android.app.Notification;
import android.text.TextUtils;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.hwdevice.outofprocess.util.NotificationContentProviderUtil;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public class cgr {
    public static boolean d(Notification notification, String str) {
        return SharedPreferenceManager.b("SUPPORT_NOTIFY_LIVE_LEVEL_CAPABILITY", "SUPPORT_NOTIFY_LIVE_LEVEL_CAPABILITY", false) && c(notification, str);
    }

    public static boolean c(Notification notification, String str) {
        if (notification != null && notification.extras != null) {
            try {
                int i = notification.extras.getInt("notification.live.type", 0);
                if (!TextUtils.isEmpty(str)) {
                    ReleaseLogUtil.d("Notify_LiveNotificationUtils", "onNotificationPosted or onNotificationRemoved liveInfo liveType0x20: ", Integer.valueOf(i), ",pkg=", str);
                }
                return i != 0 && e(str);
            } catch (RuntimeException e) {
                LogUtil.e("LiveNotificationUtils", "isMatchLiveInfoAndEvent ERROR: ", ExceptionUtils.c(e));
            }
        }
        return false;
    }

    public static boolean e(String str) {
        if (!NotificationContentProviderUtil.f()) {
            ReleaseLogUtil.e("Notify_LiveNotificationUtils", "onNotificationPosted FILTERED because LIVEINFO_SWITCH_IS_OFF,pkg=", str);
            return false;
        }
        if (!b(str)) {
            ReleaseLogUtil.e("Notify_LiveNotificationUtils", "onNotificationPosted FILTERED because LIVEINFO_WHITELIST_INCAPABLE,pkg=", str);
            return false;
        }
        ReleaseLogUtil.d("Notify_LiveNotificationUtils", "onNotificationPosted or onNotificationRemoved received liveInfo allowing continue,pkg=", str);
        return true;
    }

    public static boolean b(String str) {
        List<String> listE = NotificationContentProviderUtil.e(SharedPreferenceManager.b("NOTIFY_LIVE_LEVEL_VALUE", "NOTIFY_LIVE_LEVEL_VALUE", "levelDefault"));
        if (listE != null) {
            return listE.contains(str);
        }
        return false;
    }
}
