package defpackage;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import com.huawei.haf.application.BaseApplication;
import com.huawei.health.threeCircle.remind.ThreeCircleNotificationReceiver;
import com.huawei.health.threeCircle.remind.model.ThreeCircleRemindData;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.huawei.plugindaemon.R;
import com.huawei.threecircle.manager.WheelChairStateManager;
import health.compact.a.CommonUtil;
import health.compact.a.LogAnonymous;
import health.compact.a.LogUtil;
import health.compact.a.ReleaseLogUtil;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes9.dex */
public class ikc {
    private static final int[] e = {R.string.IDS_hw_health_active_record_tips_title_one, R.string.IDS_hw_health_active_record_tips_title_two, R.string.IDS_hw_health_active_record_tips_title_three, R.string.IDS_hw_health_active_record_tips_title_four};

    public static void c(ThreeCircleRemindData threeCircleRemindData) {
        Context contextB = BaseApplication.b();
        if (CommonUtil.q(contextB)) {
            ReleaseLogUtil.c("R_TC_3CircNotifMgr", "App is on foreground");
            return;
        }
        String remindType = threeCircleRemindData.getRemindType();
        String subRemindType = threeCircleRemindData.getSubRemindType();
        String remindText = threeCircleRemindData.getRemindText();
        if (TextUtils.isEmpty(remindType) || TextUtils.isEmpty(remindText)) {
            ReleaseLogUtil.d("R_TC_3CircNotifMgr", "remindType is ", remindType, ", content is ", remindText);
        } else {
            d(c(contextB, remindType, subRemindType), remindText, remindType, subRemindType);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:33:0x0058  */
    private static String c(Context context, String str, String str2) {
        str.hashCode();
        switch (str) {
            case "LagEncourage":
                Resources resources = context.getResources();
                int[] iArr = e;
                return resources.getString(iArr[new SecureRandom().nextInt(iArr.length)]);
            case "PerfectWeek":
                return context.getResources().getString(R.string.ids_active_perfect_week);
            case "ActiveWeek":
                return context.getResources().getString(R.string.ids_active_active_week);
            case "TodayAchievement":
                return d(context, str2);
            case "OverGoal":
                return context.getResources().getString(R.string.ids_active_done_over);
            case "PerfectMonth":
                return context.getResources().getString(R.string.ids_active_perfect_month);
            case "YesterdaySummary":
                return context.getResources().getString(R.string.ids_active_done_yesterday);
            default:
                return "";
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:21:0x003a  */
    private static String d(Context context, String str) {
        byte b2;
        str.hashCode();
        switch (str) {
            case "DoneIntensity":
                b2 = 0;
                break;
            case "DoneCalorie":
                b2 = 1;
                break;
            case "DoneAll":
                b2 = 2;
                break;
            case "DoneActiveH":
                b2 = 3;
                break;
            default:
                b2 = -1;
                break;
        }
        if (b2 == 0) {
            return context.getResources().getString(R.string.ids_active_done_intensity);
        }
        if (b2 == 1) {
            return context.getResources().getString(R.string.ids_active_done_calorie);
        }
        if (b2 == 2) {
            return context.getResources().getString(R.string.ids_active_done_all);
        }
        if (b2 == 3) {
            if (WheelChairStateManager.a().d()) {
                return context.getResources().getString(R.string.ids_active_done_active_hours_wc);
            }
            return context.getResources().getString(R.string.ids_active_done_active_hours);
        }
        return "";
    }

    private static void d(String str, String str2, String str3, String str4) {
        PendingIntent pendingIntentD;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            ReleaseLogUtil.d("R_TC_3CircNotifMgr", "sendNotification, title or content is empty");
            return;
        }
        int iA = ikx.a("notificationTimes", System.currentTimeMillis());
        if (iA >= 3) {
            ReleaseLogUtil.c("R_TC_3CircNotifMgr", "sendNotification, times is limit, value is ", Integer.valueOf(iA));
            return;
        }
        Context contextB = BaseApplication.b();
        Notification.Builder builderC = lsb.d().c();
        builderC.setSmallIcon(R.drawable.healthlogo_ic_notification);
        builderC.setContentTitle(str);
        builderC.setContentText(str2);
        builderC.setStyle(new Notification.BigTextStyle().bigText(str2));
        if (Build.VERSION.SDK_INT > 33) {
            pendingIntentD = c(contextB, str, str3, str4);
        } else {
            pendingIntentD = d(contextB, str, str3, str4);
        }
        builderC.setContentIntent(pendingIntentD);
        builderC.setAutoCancel(true);
        builderC.setDefaults(1);
        builderC.setOngoing(false);
        builderC.setOnlyAlertOnce(true);
        try {
            lsb.d().c(20230505, builderC.build());
            int i = iA + 1;
            ikx.a("notificationTimes", System.currentTimeMillis(), i);
            ReleaseLogUtil.c("R_TC_3CircNotifMgr", "sendNotification, title is ", str, ", content is ", str2, ", times is ", Integer.valueOf(i));
        } catch (SecurityException e2) {
            ReleaseLogUtil.b("R_TC_3CircNotifMgr", "sendNotification error: ", LogAnonymous.b(e2));
        }
    }

    private static PendingIntent d(Context context, String str, String str2, String str3) {
        Intent intent = new Intent(context, (Class<?>) ThreeCircleNotificationReceiver.class);
        intent.putExtra("name", str);
        intent.putExtra("remindType", str2);
        intent.putExtra("subRemindType", str3);
        return PendingIntent.getBroadcast(context, 0, intent, 201326592);
    }

    private static PendingIntent c(Context context, String str, String str2, String str3) {
        String str4 = "huaweischeme://healthapp/router/threeCircleNotify?&name=" + str + "&remindType=" + str2 + "&subRemindType=" + str3;
        LogUtil.b("TC_3CircNotifMgr", "deeplink is ", str4);
        Intent intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse(str4));
        intent.setPackage(BaseApplication.d());
        return PendingIntent.getActivity(context, 0, intent, 201326592);
    }
}
