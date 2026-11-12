package com.huawei.health.manager.migration;

import android.content.Context;
import android.content.SharedPreferences;
import com.huawei.health.connectivity.standstepcounter.StandStepCounterManager;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;
import health.compact.a.SharedPerferenceUtils;

/* JADX INFO: loaded from: classes2.dex */
public class MigrationAthenePreviewToAthene implements InterfaceMigration {
    @Override // com.huawei.health.manager.migration.InterfaceMigration
    public boolean filter(String str) {
        return "v2_preview".equals(str);
    }

    @Override // com.huawei.health.manager.migration.InterfaceMigration
    public void migration(Context context) {
        if (context == null) {
            LogUtil.a("MigrationAthenePreviewToAthene", "context is null");
            return;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences(SharedPerferenceUtils.c() + "daemonService_perference", 0);
        if (sharedPreferences == null) {
            LogUtil.a("MigrationAthenePreviewToAthene", "sharedPreferences is null");
            return;
        }
        boolean z = sharedPreferences.getBoolean("notification_status", !CommonUtil.au());
        sharedPreferences.edit().remove("notification_status");
        if (new StandStepCounterManager(context).d(1) != null) {
            c(sharedPreferences, z);
            b(sharedPreferences, !z);
        }
        SharedPerferenceUtils.c(context, "Athene");
    }

    private static void c(SharedPreferences sharedPreferences, boolean z) {
        LogUtil.a("MigrationAthenePreviewToAthene", "setStepsNotificationShowStatus=", Boolean.valueOf(z));
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        String string = Boolean.toString(z);
        if (editorEdit != null) {
            editorEdit.putString("steps_notification_status", string);
            editorEdit.commit();
            LogUtil.a("MigrationAthenePreviewToAthene", "setStepsNotificationShowStatus success");
        }
    }

    private static void b(SharedPreferences sharedPreferences, boolean z) {
        LogUtil.a("MigrationAthenePreviewToAthene", "setGoalNotificationShowStatus=", Boolean.valueOf(z));
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        String string = Boolean.toString(z);
        if (editorEdit != null) {
            editorEdit.putString("goal_notification_status", string);
            editorEdit.commit();
            LogUtil.a("MigrationAthenePreviewToAthene", "setGoalNotificationShowStatus success");
        }
    }
}
