package defpackage;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.huawei.health.knit.ui.KnitFragment;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.ui.main.stories.health.model.weight.card.CardConstants;
import health.compact.a.AuthorizationUtils;
import java.util.HashMap;

/* JADX INFO: loaded from: classes19.dex */
public class vlv {
    public static void e(Activity activity, Intent intent) {
        if (activity == null || intent == null) {
            LogUtil.j("HealthWeight_FastingLiteUtils", "geToFastingLite activity or intent is null");
            return;
        }
        if (intent.getIntExtra("fastingLiteNotification", -1) != 1) {
            LogUtil.j("HealthWeight_FastingLiteUtils", "fastingLiteNotification type is undefined");
            return;
        }
        LogUtil.a("HealthWeight_FastingLiteUtils", "onReceive currentUserId = " + LoginInit.getInstance(activity).getAccountInfo(1011));
        if (!AuthorizationUtils.c(activity) || !LoginInit.getInstance(activity).getIsLogined() || TextUtils.isEmpty(LoginInit.getInstance(activity).getAccountInfo(1011))) {
            LogUtil.a("HealthWeight_FastingLiteUtils", "moudle has not init, start app");
            c(activity, new Bundle());
        } else {
            if ("fasting_report".equals(intent.getAction())) {
                CardConstants.b(activity, "#/summary_report");
                activity.finish();
                return;
            }
            CardConstants.b(activity, "#/plan_setting");
        }
        c(activity);
        activity.finish();
    }

    private static void c(Context context, Bundle bundle) {
        Intent intent = new Intent();
        if (context != null) {
            intent.setComponent(new ComponentName(context.getPackageName(), context.getPackageManager().getLaunchIntentForPackage(context.getPackageName()).getComponent().getClassName()));
            intent.setAction("android.intent.action.MAIN");
            intent.addCategory("android.intent.category.LAUNCHER");
            intent.setFlags(268435456);
            intent.putExtra(KnitFragment.KEY_EXTRA, bundle);
            iov.d(context, intent);
        }
    }

    private static void c(Context context) {
        HashMap map = new HashMap(16);
        map.put("click", 1);
        lmf.d().c(context, AnalyticsValue.FASTING_LITE_NOTIFICATION_CLICKED_2060086.value(), map, 0);
    }
}
