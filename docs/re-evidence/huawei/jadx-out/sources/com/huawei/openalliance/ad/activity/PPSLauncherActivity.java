package com.huawei.openalliance.ad.activity;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.openalliance.ad.analysis.i;
import com.huawei.openalliance.ad.hw;

/* JADX INFO: loaded from: classes41.dex */
public class PPSLauncherActivity extends f {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.openalliance.ad.activity.f, android.app.Activity
    public void onCreate(Bundle bundle) {
        StringBuilder sb;
        Intent launchIntentForPackage;
        super.onCreate(bundle);
        try {
            if (a(this)) {
                hw.b("PPSLauncher", " app is active.");
                launchIntentForPackage = new Intent();
                launchIntentForPackage.setComponent(new ComponentName(getPackageName(), PPSBridgeActivity.class.getName()));
                launchIntentForPackage.setFlags(268435456);
            } else {
                hw.b("PPSLauncher", " app is not active. start launch app");
                launchIntentForPackage = getPackageManager().getLaunchIntentForPackage(getPackageName());
            }
            startActivity(launchIntentForPackage);
            a();
            try {
                finish();
            } catch (Throwable th) {
                th = th;
                sb = new StringBuilder("finish activity error:");
                sb.append(th.getClass().getName());
                String string = sb.toString();
            }
        } catch (Exception e) {
            hw.b("PPSLauncher", "intent is not supported:" + e.getClass().getName());
            try {
                finish();
            } catch (Throwable th2) {
                th = th2;
                sb = new StringBuilder("finish activity error:");
                sb.append(th.getClass().getName());
                String string2 = sb.toString();
            }
        } finally {
            try {
                finish();
            } catch (Throwable th3) {
                hw.b("PPSLauncher", "finish activity error:" + th3.getClass().getName());
            }
        }
    }

    @Override // com.huawei.openalliance.ad.activity.f, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }

    public boolean a(Context context) {
        for (ActivityManager.RunningTaskInfo runningTaskInfo : ((ActivityManager) context.getSystemService("activity")).getRunningTasks(10)) {
            hw.a("PPSLauncher", "topActivity=%s", runningTaskInfo.topActivity.getClassName());
            hw.a("PPSLauncher", "taskInfo.numActivities=%d", Integer.valueOf(runningTaskInfo.numActivities));
            if (runningTaskInfo.topActivity.getClassName().equalsIgnoreCase(PPSLauncherActivity.class.getName()) && runningTaskInfo.numActivities < 2) {
                return false;
            }
            if (runningTaskInfo.topActivity.getPackageName().equals(context.getPackageName())) {
                return true;
            }
        }
        return false;
    }

    private void a() {
        new i(this).b(getPackageName());
    }
}
