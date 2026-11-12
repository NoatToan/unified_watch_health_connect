package defpackage;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import androidx.core.app.NotificationManagerCompat;
import com.huawei.datatype.NotificationData;
import com.huawei.haf.common.base.BaseNotification;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.OpAnalyticsUtil;
import com.huawei.operation.OperationKey;
import com.huawei.ui.commonui.R;
import health.compact.a.CommonUtil;
import health.compact.a.KeyValDbManager;
import health.compact.a.Utils;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class miy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f41732a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static miy f41733b;
    private Context d;
    private int e = 0;

    private miy(Context context) {
        this.d = context;
    }

    public static miy e(Context context) {
        miy miyVar;
        synchronized (f41732a) {
            if (f41733b == null) {
                f41733b = new miy(context);
            }
            miyVar = f41733b;
        }
        return miyVar;
    }

    public void d(NotificationData notificationData, BaseNotification baseNotification) {
        b(notificationData, false, baseNotification);
    }

    public void b(NotificationData notificationData, boolean z, BaseNotification baseNotification) {
        if (notificationData == null) {
            LogUtil.j("SyncNotifyController", "notificationData is null");
            return;
        }
        if (CommonUtil.bg() || NotificationManagerCompat.from(BaseApplication.getContext()).areNotificationsEnabled()) {
            LogUtil.a("SyncNotifyController", "enter notify ,notificationData is", notificationData.toString());
            int iB = b(notificationData.getDetailUri());
            String detailUri = notificationData.getDetailUri();
            Intent intent = new Intent();
            if ("huaweischeme://healthapp/track".equals(detailUri)) {
                intent.setAction(CommonConstant.ACTION.HWID_SCHEME_URL);
                intent.setFlags(268435456);
                intent.setData(Uri.parse("huaweischeme://healthapp/track"));
            } else {
                intent.setComponent(notificationData.getComponentName());
                intent.putExtra("startTime", notificationData.getStartTime());
                intent.putExtra("endTime", notificationData.getEndTime());
                intent.putExtra(com.huawei.health.messagecenter.model.CommonUtil.DETAIL_URI, notificationData.getDetailUri());
                intent.putExtra("jumpFromFileSyncNotify", notificationData.getFlag());
                intent.putExtra("msgId", notificationData.getMsgId());
            }
            PendingIntent activity = PendingIntent.getActivity(this.d, iB, intent, 201326592);
            Notification.Builder builderC = baseNotification.c();
            builderC.setSmallIcon(R.drawable.healthlogo_ic_notification);
            builderC.setAutoCancel(true);
            builderC.setContentTitle(notificationData.getTitle());
            builderC.setContentText(notificationData.getDescription());
            builderC.setContentIntent(activity);
            builderC.setStyle(new Notification.BigTextStyle().bigText(notificationData.getDescription()));
            builderC.setGroupSummary(z);
            builderC.setPriority(0);
            baseNotification.c(iB, builderC.build());
            if (notificationData.getDetailUri().contains("messagecenter://sleepDetail")) {
                LogUtil.a("SyncNotifyController", "sleep notification show success!");
                e(OperationKey.SLEEP_FILE_SYNC_SEND_NOTIFICATION_2119014.value());
                return;
            } else {
                LogUtil.a("SyncNotifyController", "sport notification show success!");
                e(OperationKey.SPORT_FILE_SYNC_SEND_NOTIFICATION_2119015.value());
                return;
            }
        }
        LogUtil.j("SyncNotifyController", "notifyMsg Notification bar permission is not enabled.");
    }

    public void a() {
        lsb.d().b();
    }

    private void e(String str) {
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>(1);
        linkedHashMap.put("click", String.valueOf(1));
        OpAnalyticsUtil.getInstance().setEvent2nd(str, linkedHashMap);
    }

    public static NotificationData b() {
        if (!i() || Utils.o()) {
            return null;
        }
        LogUtil.a("SyncNotifyController", "enter createEcgNotificationData");
        return a(0L, 0L, "messagecenter://ecgDetail?ecgPageType=collection", BaseApplication.getContext().getResources().getString(R.string.IDS_quick_app_ecg), BaseApplication.getContext().getResources().getString(R.string.IDS_notifications_ecg_record));
    }

    public static NotificationData e() {
        if (!i()) {
            return null;
        }
        LogUtil.a("SyncNotifyController", "enter createEcgAnalysisNotificationData");
        return a(0L, 0L, "messagecenter://ecgDetail?ecgPageType=electrocardiogram", BaseApplication.getContext().getResources().getString(R.string.IDS_quick_app_ecg_analysis), BaseApplication.getContext().getResources().getString(R.string.IDS_notifications_ecg_details));
    }

    private static boolean i() {
        String strC = KeyValDbManager.d(BaseApplication.getContext()).c("health_msg_switch_noticebar");
        LogUtil.a("SyncNotifyController", "createEcgNotificationData : ", strC);
        return !"0".equals(strC);
    }

    public static NotificationData c() {
        LogUtil.a("SyncNotifyController", "enter createSportNotificationData");
        return a(0L, 0L, "messagecenter://sportHistory", BaseApplication.getContext().getResources().getString(BaseApplication.getContext().getResources().getIdentifier("IDS_hw_show_notifications_sport_title", "string", BaseApplication.getAppPackage())), BaseApplication.getContext().getResources().getString(R.string.IDS_hw_show_notifications_to_sport));
    }

    public static NotificationData b(String str, Map<String, String> map, String str2, String str3) {
        LogUtil.a("SyncNotifyController", "enter createHealthNotificationData");
        Uri.Builder builderAuthority = new Uri.Builder().scheme("messagecenter").authority(str);
        builderAuthority.appendQueryParameter("title", str2);
        if (map != null && !map.isEmpty()) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                builderAuthority.appendQueryParameter(entry.getKey(), entry.getValue());
            }
        }
        return a(0L, 0L, builderAuthority.toString(), str2, str3);
    }

    public static NotificationData d() {
        LogUtil.a("SyncNotifyController", "enter createMatchNotificationData");
        return a(0L, 0L, "huaweischeme://healthapp/track", BaseApplication.getContext().getResources().getString(BaseApplication.getContext().getResources().getIdentifier("IDS_hw_show_notifications_match_related_reminders_title", "string", BaseApplication.getAppPackage())), BaseApplication.getContext().getResources().getString(R.string.IDS_hw_show_notifications_to_match_related_reminders));
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
        if (!TextUtils.isEmpty(str2)) {
            notificationData.setTitle(str2);
        }
        LogUtil.a("SyncNotifyController", "progressNotificationData success,", notificationData.toString());
        return notificationData;
    }

    private int b(String str) {
        if (!TextUtils.isEmpty(str) && str.contains("messagecenter://sleepDetail")) {
            return 6001;
        }
        if (!TextUtils.isEmpty(str) && str.contains("messagecenter://sportHistory")) {
            return 7001;
        }
        if (!TextUtils.isEmpty(str) && str.contains("huaweischeme://healthapp/track")) {
            return 376833395;
        }
        if (!TextUtils.isEmpty(str) && str.contains("messagecenter://ecgDetail?ecgPageType=electrocardiogram")) {
            return 1784534443;
        }
        if (!TextUtils.isEmpty(str) && str.contains("messagecenter://ecgDetail?ecgPageType=collection")) {
            return 100233;
        }
        if (!TextUtils.isEmpty(str) && str.contains("messagecenter://healthDetail")) {
            if (Uri.parse(str) == null) {
                return this.e;
            }
            return Uri.parse(str).getQueryParameter("title").hashCode();
        }
        if (!TextUtils.isEmpty(str) && str.contains("sleep-management")) {
            return -1846814471;
        }
        int i = this.e;
        if (i < 5000) {
            this.e = i + 1;
        } else {
            this.e = 0;
        }
        return this.e;
    }
}
