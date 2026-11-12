package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteQueryBuilder;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtils;

/* JADX INFO: loaded from: classes2.dex */
public class lsu extends CommonUtils {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f40766a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f40767b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f40768c;
    public static final String d;
    public static final String e;
    public static final String h;
    public static final String j;

    static {
        String str = "content://" + BaseApplication.getAppPackage() + ".HwNotificationContentProvider/";
        f40766a = str;
        h = str + "NotificationFlags";
        f40768c = str + "NotificationCollaboration";
        j = str + "NotificationList";
        f40767b = str + "ConnectDeviceInfo";
        e = str + "MidwareAuthority";
        d = "content://" + BaseApplication.getAppPackage() + ".HwNotificationContentProvider/ClockState";
    }

    public static String a(String str, String[] strArr, String str2, String[] strArr2, String str3) {
        SQLiteQueryBuilder sQLiteQueryBuilder = new SQLiteQueryBuilder();
        sQLiteQueryBuilder.setTables(str);
        String strBuildQuery = sQLiteQueryBuilder.buildQuery(strArr, str2, null, null, str3, null);
        if (strArr2 != null && strArr2.length >= 1) {
            for (int i = 0; strBuildQuery.contains("?") && i < strArr2.length; i++) {
                strBuildQuery = strBuildQuery.replaceFirst("\\?", strArr2[i]);
            }
        }
        return strBuildQuery;
    }

    public static Integer a(String str, Cursor cursor, String str2) {
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex == -1) {
            LogUtil.e(str2, "ERROR: getColumnIndex return -1!");
            return null;
        }
        return Integer.valueOf(columnIndex);
    }
}
