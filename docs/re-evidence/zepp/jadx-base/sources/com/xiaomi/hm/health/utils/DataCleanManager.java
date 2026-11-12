package com.xiaomi.hm.health.utils;

import android.content.Context;
import android.os.Environment;
import android.text.TextUtils;
import com.huami.account.keeper.HMAccountKeeper;
import com.huami.network.hmnetwork.model.account.LoginData;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.databases.HMDaoManager;
import com.xiaomi.hm.health.thirdbind.tencent.QQLogin;
import java.io.File;

/* JADX INFO: loaded from: classes22.dex */
public class DataCleanManager {
    private static void a(String filePath) {
        g(new File(filePath));
    }

    private static void b(Context context) {
        g(new File(context.getFilesDir().getPath() + context.getPackageName() + "/databases"));
    }

    private static void c(Context context) {
        if (Environment.getExternalStorageState().equals("mounted")) {
            g(context.getExternalCacheDir());
        }
    }

    public static void cleanApplicationData(Context context, String... filepath) {
        QQLogin.getInstance(context).clean(true);
        LoginData loginData = HMAccountKeeper.INSTANCE.readLoginData();
        if (loginData != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("exitApp:");
            sb.append(TextUtils.isEmpty(loginData.getHuamiUid()) ? loginData.getThirdUid() : loginData.getHuamiUid());
            HMLog.i("cleanApplicationData", sb.toString(), new Object[0]);
            try {
                HMDaoManager.getInstance().clearDataBasesTables(TextUtils.isEmpty(loginData.getHuamiUid()) ? loginData.getThirdUid() : loginData.getHuamiUid());
            } catch (Exception e) {
                e.printStackTrace();
                HMLog.i("cleanApplicationData", e.getMessage(), new Object[0]);
            }
        }
        e(context);
        c(context);
        b(context);
        f(context);
        d(context);
        for (String str : filepath) {
            a(str);
        }
    }

    public static void cleanDatabaseByName(Context context, String dbName) {
        context.deleteDatabase(dbName);
    }

    private static void d(Context context) {
        g(context.getFilesDir());
    }

    private static void e(Context context) {
        g(context.getCacheDir());
    }

    private static void f(Context context) {
        g(new File(context.getFilesDir().getPath() + context.getPackageName() + "/shared_prefs"));
    }

    private static void g(File directory) {
        if (directory == null || !directory.exists() || !directory.isDirectory() || directory.listFiles() == null) {
            return;
        }
        for (File file : directory.listFiles()) {
            file.delete();
        }
    }
}
