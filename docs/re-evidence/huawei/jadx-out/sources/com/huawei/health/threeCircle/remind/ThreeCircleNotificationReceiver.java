package com.huawei.health.threeCircle.remind;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.huawei.haf.application.BaseApplication;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.operation.utils.Constants;
import defpackage.gcn;
import defpackage.iov;
import defpackage.lmf;
import health.compact.a.LogUtil;
import health.compact.a.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes9.dex */
public class ThreeCircleNotificationReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        ReleaseLogUtil.c("R_TC_ThreeCircleNotificationReceiver", "onReceive click notification");
        c(intent.getStringExtra("name"), intent.getStringExtra("remindType"), intent.getStringExtra("subRemindType"));
    }

    public static void c(String str, String str2, String str3) {
        Intent intent = new Intent();
        if (c(str2, str3)) {
            e(str3);
        } else {
            intent = e(str2, str3);
            if (intent != null) {
                iov.d(BaseApplication.b(), intent);
            }
        }
        a(str, intent, str2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:25:0x0060  */
    private static Intent e(String str, String str2) {
        byte b2;
        if (TextUtils.isEmpty(str)) {
            LogUtil.e("TC_ThreeCircleNotificationReceiver", "getIntentByType remindType is empty");
            return null;
        }
        Intent intent = new Intent();
        intent.putExtra("type", 1);
        intent.setFlags(268435456);
        Context contextB = BaseApplication.b();
        str.hashCode();
        switch (str) {
            case "LagEncourage":
                b2 = 0;
                break;
            case "PerfectWeek":
                b2 = 1;
                break;
            case "ActiveWeek":
                b2 = 2;
                break;
            case "PerfectMonth":
                b2 = 3;
                break;
            default:
                b2 = -1;
                break;
        }
        if (b2 == 0) {
            e(contextB, intent, str2);
            return intent;
        }
        if (b2 == 1 || b2 == 2) {
            intent.setClassName(contextB, "com.huawei.ui.main.stories.fitness.activity.active.KnitActiveRecordActivity");
            intent.putExtra("sources", RemoteMessageConst.NOTIFICATION);
            LogUtil.b("TC_ThreeCircleNotificationReceiver", "go to KnitActiveRecordActivity");
            b();
            return intent;
        }
        if (b2 == 3) {
            intent.setClassName(contextB, "com.huawei.ui.main.stories.fitness.activity.active.KnitActiveRecordActivity");
            intent.putExtra("is_open_calendar", true);
            intent.putExtra("sources", RemoteMessageConst.NOTIFICATION);
            LogUtil.b("TC_ThreeCircleNotificationReceiver", "go to KnitActiveRecordActivity");
            b();
            return intent;
        }
        intent.setClassName(contextB, "com.huawei.health.MainActivity");
        intent.setFlags(335544320);
        intent.putExtra(Constants.HOME_TAB_NAME, Constants.HOME);
        LogUtil.b("TC_ThreeCircleNotificationReceiver", "go to mainActivity");
        return intent;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:17:0x0035  */
    private static void e(String str) {
        byte b2;
        int i;
        Context contextB = BaseApplication.b();
        switch (str) {
            case "LotIntensity_Walk":
                b2 = 0;
                break;
            case "LotCalorie_Walk":
                b2 = 1;
                break;
            case "LotIntensity_Run":
                b2 = 2;
                break;
            case "LotCalorie_Run":
                b2 = 3;
                break;
            default:
                b2 = -1;
                break;
        }
        if (b2 == 0 || b2 == 1) {
            LogUtil.b("TC_ThreeCircleNotificationReceiver", "go to walk");
            i = 257;
        } else {
            LogUtil.b("TC_ThreeCircleNotificationReceiver", "go to run");
            i = 258;
        }
        gcn.c().startRunCourseSport(contextB, i, -1, -1.0f, new Bundle());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:24:0x0044  */
    private static boolean c(String str, String str2) {
        byte b2;
        if (!"LagEncourage".equals(str)) {
            return false;
        }
        str2.hashCode();
        switch (str2) {
            case "LotIntensity_Walk":
                b2 = 0;
                break;
            case "LotCalorie_Walk":
                b2 = 1;
                break;
            case "LotIntensity_Run":
                b2 = 2;
                break;
            case "LotCalorie_Run":
                b2 = 3;
                break;
            default:
                b2 = -1;
                break;
        }
        return b2 == 0 || b2 == 1 || b2 == 2 || b2 == 3;
    }

    private static void b() {
        HashMap map = new HashMap(3);
        map.put("click", "1");
        map.put("from", 3);
        map.put("status", new ArrayList());
        lmf.d().c(BaseApplication.b(), AnalyticsValue.HEALTH_HOME_CIRCLE_RING_1040091.value(), map, 0);
    }

    private static void e(Context context, Intent intent, String str) {
        str.hashCode();
        if (str.equals("LotActiveHour")) {
            intent.setClassName(context, "com.huawei.ui.main.stories.fitness.activity.active.KnitActiveHoursActivity");
            LogUtil.b("TC_ThreeCircleNotificationReceiver", "go to KnitActiveHoursActivity");
        } else {
            intent.setClassName(context, "com.huawei.health.MainActivity");
            intent.setFlags(335544320);
            intent.putExtra(Constants.HOME_TAB_NAME, Constants.HOME);
            LogUtil.b("TC_ThreeCircleNotificationReceiver", "go to mainActivity");
        }
    }

    private static void a(String str, Intent intent, String str2) {
        HashMap map = new HashMap();
        map.put("click", "1");
        map.put("type", 1);
        map.put("name", str);
        map.put("url", (intent == null || intent.getData() == null) ? "" : intent.getData().toString());
        map.put("messageScenario", Integer.valueOf(d(str2)));
        lmf.d().c(BaseApplication.b(), AnalyticsValue.HEALTH_PUSH_OPEN_APP_2050008.value(), map, 0);
    }

    private static int d(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.b("TC_ThreeCircleNotificationReceiver", "remindType is empty");
            return -1;
        }
        str.hashCode();
        switch (str) {
            case "LagEncourage":
                return 5;
            case "PerfectWeek":
                return 7;
            case "ActiveWeek":
                return 6;
            case "TodayAchievement":
                return 0;
            case "OverGoal":
                return 1;
            case "PerfectMonth":
                return 8;
            case "YesterdaySummary":
                return 2;
            default:
                LogUtil.e("TC_ThreeCircleNotificationReceiver", "remindType does not match, remindType is ", str);
                return -1;
        }
    }
}
