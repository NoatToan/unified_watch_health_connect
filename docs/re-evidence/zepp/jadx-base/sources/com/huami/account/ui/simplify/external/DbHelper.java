package com.huami.account.ui.simplify.external;

import android.content.Context;
import android.text.TextUtils;
import com.huami.account.HMLoginManager;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.databases.HMDaoManager;
import com.xiaomi.hm.health.databases.HMDatabaseHelper;
import com.xiaomi.hm.health.databases.HMLocalPropertyUtil;
import java.io.File;

/* JADX INFO: loaded from: classes4.dex */
public class DbHelper {
    private static final String a = "DbHelper";

    public static void initDB(Context context, String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            File databasePath = context.getDatabasePath(HMDatabaseHelper.parseOldDbName(str));
            File databasePath2 = context.getDatabasePath(HMDatabaseHelper.parseNewMD5DbName(str));
            if (databasePath.exists()) {
                HMLog.i(a, " old file exists : " + databasePath.getAbsolutePath(), new Object[0]);
                if (databasePath.renameTo(databasePath2)) {
                    str = MD5.hexdigest(str);
                    HMLog.i(a, " renameTo " + databasePath2.getAbsolutePath() + " is ok", new Object[0]);
                }
            } else {
                HMLog.i(a, " not exists", new Object[0]);
                str = MD5.hexdigest(str);
            }
        } else {
            File databasePath3 = context.getDatabasePath(HMDatabaseHelper.parseOldDbName(str));
            File databasePath4 = context.getDatabasePath(HMDatabaseHelper.parseNewMD5DbName(str));
            File databasePath5 = context.getDatabasePath(HMDatabaseHelper.parseNewMD5DbName(str2));
            if (databasePath4.exists()) {
                HMLog.i(a, "huami case new file exists : " + databasePath4.getAbsolutePath(), new Object[0]);
                if (databasePath4.renameTo(databasePath5)) {
                    str = MD5.hexdigest(str2);
                    HMLog.i(a, "huami case renameTo " + databasePath5.getAbsolutePath() + " is ok", new Object[0]);
                } else {
                    str = MD5.hexdigest(str);
                }
            } else if (!databasePath3.exists()) {
                str = MD5.hexdigest(str2);
            } else if (databasePath3.renameTo(databasePath5)) {
                str = MD5.hexdigest(str2);
                HMLog.i(a, " renameTo " + databasePath5.getAbsolutePath() + " is ok", new Object[0]);
            }
        }
        HMDaoManager.init(context.getApplicationContext(), str);
        if (!HMLoginManager.isUnknown()) {
            HMLocalPropertyUtil.setLocalProperty(HMLocalPropertyUtil.LOCAL_PROPERTY_IS_IN_MAINLAND, String.valueOf(HMLoginManager.isInMainland()));
        }
        HMLog.i(a, "initDB ", new Object[0]);
    }
}
