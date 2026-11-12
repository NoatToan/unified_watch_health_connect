package com.huawei.health.manager.migration;

import android.content.Context;
import android.content.SharedPreferences;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.up.model.UserInfomation;
import health.compact.a.SharedPerferenceUtils;

/* JADX INFO: loaded from: classes2.dex */
public class MigrationAtheneThreeToAtheneFour implements InterfaceMigration {
    @Override // com.huawei.health.manager.migration.InterfaceMigration
    public boolean filter(String str) {
        return "Athene3".equals(str);
    }

    @Override // com.huawei.health.manager.migration.InterfaceMigration
    public void migration(Context context) {
        if (context == null) {
            LogUtil.a("MigrationAtheneThreeToAtheneFour", "context is null");
            return;
        }
        d(context, e(context));
        c(context, d(context));
        SharedPerferenceUtils.c(context, "Athene4");
    }

    private static String e(Context context) {
        LogUtil.a("MigrationAtheneThreeToAtheneFour", "getStepsNotificationShowStatus");
        SharedPreferences sharedPreferences = context.getSharedPreferences(SharedPerferenceUtils.c() + "daemonService_perference", 0);
        if (sharedPreferences != null) {
            String string = sharedPreferences.getString("steps_notification_status", UserInfomation.BIRTHDAY_UNSETED);
            LogUtil.a("MigrationAtheneThreeToAtheneFour", " getStepsNotificationShowStatus= ", string);
            return string;
        }
        return UserInfomation.BIRTHDAY_UNSETED;
    }

    private static String d(Context context) {
        LogUtil.a("MigrationAtheneThreeToAtheneFour", "getGoalNotificationShowStatus");
        SharedPreferences sharedPreferences = context.getSharedPreferences(SharedPerferenceUtils.c() + "daemonService_perference", 0);
        if (sharedPreferences != null) {
            String string = sharedPreferences.getString("goal_notification_status", UserInfomation.BIRTHDAY_UNSETED);
            LogUtil.a("MigrationAtheneThreeToAtheneFour", " getGoalNotificationShowStatus= ", string);
            return string;
        }
        return UserInfomation.BIRTHDAY_UNSETED;
    }

    private static void d(Context context, String str) {
        LogUtil.a("MigrationAtheneThreeToAtheneFour", "setStepsNotificationShowStatusCommon=", str);
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("daemonService_perference_newFile", 0).edit();
        if (editorEdit != null) {
            editorEdit.putString("steps_notification_status", str);
            editorEdit.commit();
            LogUtil.a("MigrationAtheneThreeToAtheneFour", "setStepsNotificationShowStatus success");
        }
    }

    private static void c(Context context, String str) {
        LogUtil.a("MigrationAtheneThreeToAtheneFour", "setGoalNotificationShowStatusCommon=", str);
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("daemonService_perference_newFile", 0).edit();
        if (editorEdit != null) {
            editorEdit.putString("goal_notification_status", str);
            editorEdit.commit();
            LogUtil.a("MigrationAtheneThreeToAtheneFour", "setGoalNotificationShowStatus success");
        }
    }
}
