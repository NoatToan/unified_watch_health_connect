package defpackage;

import android.database.Cursor;
import android.text.TextUtils;
import com.huawei.haf.application.BaseApplication;
import health.compact.a.LogUtil;

/* JADX INFO: loaded from: classes20.dex */
public class xiz {
    public static void d(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            LogUtil.e("StorageAction", "registerNotificationAction, pkgName or action is null");
        } else {
            cpo.b("wearlink_sp_pull_service", str, str2);
            LogUtil.b("StorageAction", "registerNotificationAction end");
        }
    }

    public static String e(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.e("StorageAction", "queryAction, pkgName is null");
            return "";
        }
        String strD = cpo.d("wearlink_sp_pull_service", str, "");
        if (!TextUtils.isEmpty(strD)) {
            LogUtil.b("StorageAction", "queryAction serviceAction:", strD);
            return strD;
        }
        return a(str);
    }

    private static String a(String str) {
        Cursor cursorD = cow.d(BaseApplication.b(), String.valueOf(1000), "pull_service", "packageName='" + str + "'");
        String string = "";
        if (cursorD == null) {
            LogUtil.e("StorageAction", "cursor is null");
            return "";
        }
        if (cursorD.moveToNext()) {
            string = cursorD.getString(cursorD.getColumnIndex("serviceAction"));
            LogUtil.b("StorageAction", "getActionByPkgName: ", string);
        }
        cursorD.close();
        return string;
    }

    public static void b(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.e("StorageAction", "unregisterNotificationAction, pkgName is null");
            return;
        }
        d(str);
        cpo.b("wearlink_sp_pull_service", str);
        LogUtil.b("StorageAction", "unregisterNotificationAction end");
    }

    private static void d(String str) {
        cow.b(BaseApplication.b(), String.valueOf(1000), "pull_service", "packageName='" + str + "'");
    }
}
