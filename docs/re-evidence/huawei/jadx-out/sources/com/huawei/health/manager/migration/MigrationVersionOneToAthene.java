package com.huawei.health.manager.migration;

import android.content.Context;
import android.content.SharedPreferences;
import com.huawei.health.connectivity.standstepcounter.StandStepCounterManager;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.SharedPerferenceUtils;

/* JADX INFO: loaded from: classes2.dex */
public class MigrationVersionOneToAthene implements InterfaceMigration {
    @Override // com.huawei.health.manager.migration.InterfaceMigration
    public boolean filter(String str) {
        return "v1".equals(str);
    }

    @Override // com.huawei.health.manager.migration.InterfaceMigration
    public void migration(Context context) {
        if (context == null) {
            LogUtil.a("MigrationVersionOneToAthene", "context is null");
            return;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences("plugin_device_preferences_settings", 0);
        sharedPreferences.edit().remove("plugin_device_phonecounter_standardstep").commit();
        sharedPreferences.edit().remove("plugin_device_last_time_and_this_time").commit();
        boolean z = sharedPreferences.getBoolean("KEY_PHONE_NOTIFICATION_COUNTER_ENABLED", true);
        if (new StandStepCounterManager(context).d(1) != null) {
            a(context, z);
            d(context, !z);
        }
        SharedPerferenceUtils.c(context, "Athene");
    }

    private static void a(Context context, boolean z) {
        LogUtil.a("MigrationVersionOneToAthene", "setStepsNotificationShowStatus=", Boolean.valueOf(z));
        SharedPreferences sharedPreferences = context.getSharedPreferences(SharedPerferenceUtils.c() + "daemonService_perference", 0);
        if (sharedPreferences == null) {
            LogUtil.a("MigrationVersionOneToAthene", "sharedPreferences is null");
            return;
        }
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        String string = Boolean.toString(z);
        if (editorEdit != null) {
            editorEdit.putString("steps_notification_status", string);
            editorEdit.commit();
            LogUtil.a("MigrationVersionOneToAthene", "setStepsNotificationShowStatus success");
        }
    }

    private static void d(Context context, boolean z) {
        LogUtil.a("MigrationVersionOneToAthene", "setGoalNotificationShowStatus=", Boolean.valueOf(z));
        SharedPreferences sharedPreferences = context.getSharedPreferences(SharedPerferenceUtils.c() + "daemonService_perference", 0);
        if (sharedPreferences == null) {
            LogUtil.a("MigrationVersionOneToAthene", "sharedPreferences is null");
            return;
        }
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        String string = Boolean.toString(z);
        if (editorEdit != null) {
            editorEdit.putString("goal_notification_status", string);
            editorEdit.commit();
            LogUtil.a("MigrationVersionOneToAthene", "setGoalNotificationShowStatus success");
        }
    }
}
