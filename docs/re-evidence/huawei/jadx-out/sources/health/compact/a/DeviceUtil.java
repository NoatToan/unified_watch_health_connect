package health.compact.a;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwdataaccessmodel.db.contentprovider.DbContentProvider;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.DeviceDbForHomeCards;
import defpackage.yho;
import defpackage.yhp;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public class DeviceUtil {
    protected DeviceUtil() {
    }

    public static void b(Context context) {
        if (yhp.b()) {
            com.huawei.hwlogsmodel.LogUtil.a("DeviceUtil", "startDaemonService");
            Intent intent = new Intent();
            intent.setAction("com.huawei.daemonservice");
            intent.setPackage(context.getPackageName());
            intent.putExtra("startSyncData", "startSyncData");
            try {
                context.startService(intent);
            } catch (IllegalStateException | SecurityException unused) {
                com.huawei.hwlogsmodel.LogUtil.j("DeviceUtil", "start daemon service fail");
            }
        }
    }

    public static void e() {
        yhp.a();
    }

    public static boolean b() {
        if (EnvironmentUtils.b()) {
            yhp.a();
        }
        if (!c("module_" + String.valueOf(1000) + "_has_device_table")) {
            com.huawei.hwlogsmodel.LogUtil.j("DeviceUtil", "getHasDeviceDbInfo select table is not exist.");
            return false;
        }
        Cursor cursorC = null;
        try {
            try {
                cursorC = DbManager.c(BaseApplication.getContext(), String.valueOf(1000), "has_device_table", 2, (String) null);
                if (cursorC == null) {
                    com.huawei.hwlogsmodel.LogUtil.j("DeviceUtil", "Query Storage Data fail.");
                    if (cursorC != null && !cursorC.isClosed()) {
                        cursorC.close();
                    }
                    return false;
                }
                while (cursorC.moveToNext()) {
                    String string = cursorC.getString(cursorC.getColumnIndex("hasDeviceValue"));
                    if (CommonUtils.e(string, 0) > 0) {
                        com.huawei.hwlogsmodel.LogUtil.a("DeviceUtil", "There is one or more LOCAL_WEAR_DEVICES whether connected or not,content is:", string);
                        if (cursorC != null && !cursorC.isClosed()) {
                            cursorC.close();
                        }
                        return true;
                    }
                }
                if (cursorC != null && !cursorC.isClosed()) {
                    cursorC.close();
                }
                return false;
            } catch (Exception unused) {
                com.huawei.hwlogsmodel.LogUtil.e("DeviceUtil", "Query Storage exception");
                if (0 != 0 && !cursorC.isClosed()) {
                }
            }
        } catch (Throwable th) {
            if (0 != 0 && !cursorC.isClosed()) {
                cursorC.close();
            }
            throw th;
        }
    }

    public static void d(Context context, boolean z, Bundle bundle) {
        BluetoothAdapter defaultAdapter;
        if (context == null) {
            com.huawei.hwlogsmodel.LogUtil.e("DeviceUtil", "startPhoneService ", "context is null");
            return;
        }
        if (EnvironmentUtils.b()) {
            yhp.a();
        }
        if (z && ((defaultAdapter = BluetoothAdapter.getDefaultAdapter()) == null || defaultAdapter.getState() != 12)) {
            com.huawei.hwlogsmodel.LogUtil.a("DeviceUtil", "startPhoneService ", "bluetooth state not on");
            return;
        }
        if ((bundle == null || !"com.huawei.ohos.health.device".equals(bundle.getString("package"))) && !(b() && yho.b())) {
            return;
        }
        Intent intent = new Intent();
        intent.setAction("com.huawei.bone.action.StartPhoneService");
        intent.setPackage(context.getPackageName());
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        try {
            context.startService(intent);
        } catch (IllegalStateException | SecurityException unused) {
            com.huawei.hwlogsmodel.LogUtil.j("DeviceUtil", "start phone service fail");
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0062 A[DONT_GENERATE, PHI: r2 r3
      0x0062: PHI (r2v1 boolean) = (r2v0 boolean), (r2v3 boolean) binds: [B:24:0x0060, B:21:0x0054] A[DONT_GENERATE, DONT_INLINE]
      0x0062: PHI (r3v3 android.database.Cursor) = (r3v2 android.database.Cursor), (r3v4 android.database.Cursor) binds: [B:24:0x0060, B:21:0x0054] A[DONT_GENERATE, DONT_INLINE]] */
    private static boolean c(String str) {
        SQLiteDatabase sQLiteDatabaseE;
        DbContentProvider dbContentProviderB = DbContentProvider.b(BaseApplication.getContext());
        boolean z = false;
        if (dbContentProviderB == null) {
            com.huawei.hwlogsmodel.LogUtil.j("DeviceUtil", "isTableExist provider is null.");
            return false;
        }
        Cursor cursorRawQuery = null;
        try {
            sQLiteDatabaseE = dbContentProviderB.e();
        } catch (SQLiteException unused) {
            com.huawei.hwlogsmodel.LogUtil.e("DeviceUtil", "isTableExist getDatabase SQLiteException");
            sQLiteDatabaseE = null;
        }
        if (sQLiteDatabaseE == null) {
            com.huawei.hwlogsmodel.LogUtil.j("DeviceUtil", "isTableExist sqLiteDatabase is null.");
            return false;
        }
        try {
            try {
                cursorRawQuery = sQLiteDatabaseE.rawQuery(String.format(Locale.ENGLISH, "select count(*) from sqlite_master where type = 'table' and name = '%s'", str), null);
                if (cursorRawQuery != null && cursorRawQuery.moveToNext() && cursorRawQuery.getInt(0) > 0) {
                    z = true;
                }
                if (cursorRawQuery != null) {
                }
            } finally {
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                }
            }
        } catch (Throwable unused2) {
            com.huawei.hwlogsmodel.LogUtil.e("DeviceUtil", "isTableExist query occur exception.");
        }
        return z;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x007a A[PHI: r2 r5
      0x007a: PHI (r2v2 java.lang.String) = (r2v1 java.lang.String), (r2v4 java.lang.String) binds: [B:14:0x0078, B:9:0x006a] A[DONT_GENERATE, DONT_INLINE]
      0x007a: PHI (r5v3 android.database.Cursor) = (r5v2 android.database.Cursor), (r5v4 android.database.Cursor) binds: [B:14:0x0078, B:9:0x006a] A[DONT_GENERATE, DONT_INLINE]] */
    public static String c() {
        health.compact.a.hwlogsmodel.ReleaseLogUtil.d("R_DeviceUtil", "enter getExerciseInsertTime");
        String str = "huid='" + KeyValDbManager.d(BaseApplication.getContext()).c("user_id") + "'";
        health.compact.a.hwlogsmodel.ReleaseLogUtil.d("R_DeviceUtil", "getExerciseInsertTime selection");
        String string = "";
        Cursor cursorC = null;
        try {
            try {
                cursorC = DbManager.c(BaseApplication.getContext(), String.valueOf(22), DeviceDbForHomeCards.EXERCISE_INSERT_TIME_TABLE_NAME, 2, str);
                com.huawei.hwlogsmodel.LogUtil.a("DeviceUtil", "getExerciseInsertTime start to get cursor.");
                if (cursorC != null && cursorC.moveToNext()) {
                    string = cursorC.getString(cursorC.getColumnIndex(DeviceDbForHomeCards.EXERCISE_INSERT_TIME));
                }
                if (cursorC != null) {
                    cursorC.close();
                }
            } catch (SQLException unused) {
                com.huawei.hwlogsmodel.LogUtil.e("DeviceUtil", "Query Storage exception");
                if (cursorC != null) {
                    cursorC.close();
                }
            }
            com.huawei.hwlogsmodel.LogUtil.a("DeviceUtil", "getExerciseInsertTime content = ", string);
            return string;
        } catch (Throwable th) {
            if (cursorC != null) {
                cursorC.close();
            }
            throw th;
        }
    }
}
