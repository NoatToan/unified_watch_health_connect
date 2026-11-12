package defpackage;

import android.content.ComponentName;
import android.content.res.Resources;
import android.os.Message;
import android.text.TextUtils;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcoresleepmgr.datatype.NotificationData;
import com.huawei.hwdetailedsleepmonitor.R;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.ui.commonui.utils.versioncontrol.VersionControlUtil;
import health.compact.a.CommonUtil;
import health.compact.a.KeyValDbManager;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.security.SecureRandom;
import java.util.IllegalFormatException;
import java.util.Locale;

/* JADX INFO: loaded from: classes10.dex */
public class ltq {
    public static boolean d(Message message, String str, long j, long j2) {
        boolean z;
        String strB;
        if (message == null) {
            ReleaseLogUtil.e("BTSYNC_SyncNotifyControllerUtil", "shouldSendSleepNotify message null");
            return false;
        }
        long j3 = 0;
        if (message.obj instanceof NotificationData) {
            NotificationData notificationData = (NotificationData) message.obj;
            long startTime = notificationData.getStartTime();
            long endTime = notificationData.getEndTime();
            if (endTime < 1000 * j) {
                LogUtil.j("SyncNotifyControllerUtil", "requestStartTime is ", Long.valueOf(j), ",wakeTime is ", Long.valueOf(endTime), ",device return info is not in ", Long.valueOf(j), Constants.LINK, Long.valueOf(j2));
                ReleaseLogUtil.e("BTSYNC_SyncNotifyControllerUtil", "shouldSendSleepNotify wakeTime is false");
                return false;
            }
            String strC = KeyValDbManager.d(BaseApplication.getContext()).c("user_id");
            if (!TextUtils.isEmpty(str)) {
                LogUtil.a("SyncNotifyControllerUtil", "deviceUUid :", CommonUtil.n(str));
                strB = lsp.b(com.huawei.haf.application.BaseApplication.b(), strC + str + "notDownWakeupTime");
            } else {
                strB = lsp.b(com.huawei.haf.application.BaseApplication.b(), strC + "notDownWakeupTime");
            }
            if (SharedPreferenceManager.d(String.valueOf(10024), strB, 0L) == endTime) {
                ReleaseLogUtil.e("BTSYNC_SyncNotifyControllerUtil", "spWakeupTime equals wakeTime");
                return false;
            }
            SharedPreferenceManager.c(String.valueOf(10024), strB, endTime);
            double d = ((endTime - startTime) * 1.0d) / 3600000.0d;
            boolean z2 = d > 3.0d;
            LogUtil.a("SyncNotifyControllerUtil", "saveCoreSleepData notify enter,the last data's fallAsleepTime :", Long.valueOf(startTime), "wakeTime :", Long.valueOf(endTime), "duration :", Double.valueOf(d), "isRunningForeground : ", Boolean.valueOf(BaseApplication.isRunningForeground()));
            z = z2;
            j3 = endTime;
        } else {
            z = false;
        }
        if (VersionControlUtil.isSupportSleepManagement()) {
            ReleaseLogUtil.d("BTSYNC_SyncNotifyControllerUtil", "shouldSendSleepNotify isShouldNotify is ", Boolean.valueOf(z), ", message.arg1 is ", Integer.valueOf(message.arg1), ", message.arg2 is ", Integer.valueOf(message.arg2));
            return z && message.arg1 == 0 && qeh.c(j3) && message.arg2 == 0;
        }
        ReleaseLogUtil.d("BTSYNC_SyncNotifyControllerUtil", "shouldSendSleepNotify isShouldNotify is ", Boolean.valueOf(z), " message.arg1 is", Integer.valueOf(message.arg1));
        return z && message.arg1 == 0 && qeh.c(j3);
    }

    public static NotificationData e(long j, long j2, int i) {
        String string;
        try {
            LogUtil.a("SyncNotifyControllerUtil", "enter createSleepNotificationData,notify fallAsleepTime is", Long.valueOf(j), "wake Time is", Long.valueOf(j2), " sleepScore is ", Integer.valueOf(i));
            int iNextInt = new SecureRandom().nextInt(3);
            if (iNextInt == 0) {
                string = BaseApplication.getContext().getResources().getString(R.string.IDS_notification_sleep_msg_one);
            } else if (iNextInt == 1) {
                string = BaseApplication.getContext().getResources().getString(R.string.IDS_notification_sleep_msg_two);
            } else {
                string = BaseApplication.getContext().getResources().getString(R.string.IDS_notification_sleep_msg_three);
            }
            return a(j, j2, "messagecenter://sleepDetail", BaseApplication.getContext().getResources().getString(R.string.IDS_hw_show_notifications_to_sleep_details_title), String.format(Locale.ENGLISH, string, Integer.valueOf(i)));
        } catch (Resources.NotFoundException unused) {
            LogUtil.e("SyncNotifyControllerUtil", "sleep resource value not found.");
            return null;
        } catch (IllegalFormatException unused2) {
            LogUtil.e("SyncNotifyControllerUtil", "date format is invalid.");
            return null;
        }
    }

    public static NotificationData a(long j, long j2, String str, String str2, String str3) {
        NotificationData notificationData = new NotificationData();
        notificationData.setComponentName(new ComponentName(BaseApplication.getAppPackage(), "com.huawei.pluginmessagecenter.activity.DispatchSkipEventActivity"));
        notificationData.setStartTime(j);
        notificationData.setEndTime(j2);
        notificationData.setFlag("jumpFromFileSyncNotify");
        notificationData.setDetailUri(str);
        notificationData.setMsgId("fileSyncNotify");
        notificationData.setDescription(str3);
        notificationData.setTitle(str2);
        LogUtil.a("SyncNotifyControllerUtil", "progressNotificationData success,", notificationData.toString());
        return notificationData;
    }
}
