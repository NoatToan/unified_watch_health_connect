package com.huawei.ui.main.stories.fitness.activity.coresleep.notification;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.bundle.AppBundle;
import com.huawei.haf.bundle.AppBundleExtension;
import com.huawei.haf.bundle.extension.ComponentInfo;
import com.huawei.health.arkuix.utils.ArkUIXConstants;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.utils.Constants;
import com.huawei.ui.main.R;
import defpackage.lsb;
import defpackage.lsl;
import defpackage.lua;
import defpackage.qrs;
import defpackage.ubu;
import defpackage.uth;
import defpackage.uwa;
import defpackage.vng;

/* JADX INFO: loaded from: classes19.dex */
public class HealthCommondReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            return;
        }
        LogUtil.a("HealthCommondReceiver", "onReceive: ", action);
        if ("start".equals(action)) {
            ubu.c(intent);
            return;
        }
        if (TtmlNode.END.equals(action)) {
            ubu.c();
            return;
        }
        if ("endTheDay".equals(action)) {
            ubu.c();
            ubu.d(System.currentTimeMillis());
            return;
        }
        if ("BLOOD_PRESSURE_MEASURE_PLAN_ACTION".equals(action)) {
            uth.c(intent, intent.getIntExtra("BLOOD_PRESSURE_MEASURE_PLAN_HOUR_OF_DAY", -1), intent.getIntExtra("BLOOD_PRESSURE_MEASURE_PLAN_MINUTE", -1));
            return;
        }
        if ("ACTION_BLOOD_SUGAR_SYNC".equals(action)) {
            LogUtil.a("HealthCommondReceiver", "ACTION_BLOOD_SUGAR_SYNC");
            uwa.a();
            uwa.b();
        } else if ("ACTION_EFFICIENT_REST".equals(action)) {
            int intExtra = intent.getIntExtra("type", -1);
            LogUtil.a("HealthCommondReceiver", "ACTION_EFFICIENT_REST, type = ", Integer.valueOf(intExtra));
            a(intExtra);
        } else {
            if ("WEIGHT_MEASURE_REMIND_ACTION".equals(action)) {
                LogUtil.a("HealthCommondReceiver", "WEIGHT_MEASURE_REMIND_ACTION");
                vng.g();
                vng.d();
                return;
            }
            LogUtil.j("HealthCommondReceiver", "action undefined");
        }
    }

    private boolean d() {
        long jD = lua.d(Integer.toString(10000), "ACTION_EFFICIENT_REST_TIME", 0L);
        LogUtil.a("HealthCommondReceiver", "isNotified Time: ", Long.valueOf(jD));
        boolean zC = lsl.c(jD, System.currentTimeMillis());
        LogUtil.a("HealthCommondReceiver", "isNotified: ", Boolean.valueOf(zC));
        return zC;
    }

    private void e(long j) {
        LogUtil.a("HealthCommondReceiver", "setNotificationTime: ", Long.valueOf(j));
        lua.a(Integer.toString(10000), "ACTION_EFFICIENT_REST_TIME", j);
    }

    private void a(int i) {
        if (i == -1 || d()) {
            return;
        }
        if (i == 1) {
            lsb.d().e(20200320);
            return;
        }
        e(System.currentTimeMillis());
        lsb.d().e(20200320);
        Notification.Builder builderC = lsb.d().c();
        qrs.c(builderC);
        Context contextB = BaseApplication.b();
        Intent intent = new Intent();
        AppBundleExtension appBundleExtensionC = AppBundle.c();
        String str = ComponentInfo.PluginSleepBriefs_A_1;
        String moduleForComponent = appBundleExtensionC.getModuleForComponent(ComponentInfo.PluginSleepBriefs_A_1);
        if (!TextUtils.isEmpty(moduleForComponent) && !AppBundle.c().isExistLocalModule(moduleForComponent)) {
            str = Constants.KNIT_SLEEP_DETAIL_ACTIVITY;
        }
        intent.setClassName(contextB, str);
        intent.setFlags(67108864);
        intent.addFlags(536870912);
        intent.setPackage(BaseApplication.d());
        intent.putExtra(ArkUIXConstants.FROM_TYPE, 2);
        builderC.setContentTitle(contextB.getString(R.string.IDS_rest_efficient_notify)).setContentIntent(PendingIntent.getActivity(contextB, 0, intent, 201326592));
        builderC.setAutoCancel(true);
        lsb.d().c(20200320, builderC.build());
    }
}
