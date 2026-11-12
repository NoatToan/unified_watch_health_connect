package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.text.TextUtils;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.hwbasemgr.HwBaseManager;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public class flu extends HwBaseManager {

    static class d {
        public static final flu e = new flu(BaseApplication.getContext());
    }

    private flu(Context context) {
        super(context);
        LogUtil.a("UserLabelMgr", "create table error code =", Integer.valueOf(createStorageDataTable("health_user_label", 1, e())));
    }

    public static flu b() {
        return d.e;
    }

    private static String b(Cursor cursor, String str) {
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex != -1) {
            return cursor.getString(columnIndex);
        }
        LogUtil.j("UserLabelMgr", "getStringColumn wrong columnName = ", str);
        return "";
    }

    private static ContentValues d(flo floVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("huid", floVar.e());
        contentValues.put("uriKey", floVar.c());
        contentValues.put("uriValue", floVar.d());
        contentValues.put("timestamp", String.valueOf(System.currentTimeMillis()));
        return contentValues;
    }

    public long c(flo floVar) {
        LogUtil.a("UserLabelMgr", "UserLabelMgr insert data");
        return insertStorageData("health_user_label", 1, d(floVar));
    }

    public int b(flo floVar) {
        if (floVar == null) {
            return -1;
        }
        LogUtil.a("UserLabelMgr", "UserLabelMgr update data");
        ContentValues contentValues = new ContentValues();
        contentValues.put("uriValue", floVar.d());
        contentValues.put("timestamp", Long.valueOf(System.currentTimeMillis()));
        return updateStorageData("health_user_label", 1, contentValues, a(floVar.e(), floVar.c()));
    }

    public long e(flo floVar) {
        if (floVar == null) {
            return -1L;
        }
        if (d(floVar.c(), floVar.e()) == null) {
            return c(floVar);
        }
        return b(floVar);
    }

    @Override // com.huawei.hwbasemgr.HwBaseManager
    public Integer getModuleId() {
        return 1020;
    }

    private String e() {
        StringBuilder sb = new StringBuilder(16);
        sb.append("_id integer primary key autoincrement,huid text,uriKey text not null,uriValue text,timestamp text");
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r5v0, types: [flu] */
    public flo d(String str, String str2) throws Throwable {
        SQLiteDatabaseLockedException e;
        Cursor cursorQueryStorageData;
        ?? r1 = 0;
        flo floVar = null;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        LogUtil.a("UserLabelMgr", "UserLabelMgr queryUserLabel data");
        try {
            try {
                cursorQueryStorageData = queryStorageData("health_user_label", 1, a(str2, str));
                try {
                    if (cursorQueryStorageData != null) {
                        if (cursorQueryStorageData.moveToFirst()) {
                            flo floVar2 = new flo();
                            floVar2.b(cursorQueryStorageData.getString(cursorQueryStorageData.getColumnIndex("huid")));
                            floVar2.d(cursorQueryStorageData.getString(cursorQueryStorageData.getColumnIndex("uriKey")));
                            floVar2.c(cursorQueryStorageData.getString(cursorQueryStorageData.getColumnIndex("uriValue")));
                            floVar2.e(cursorQueryStorageData.getString(cursorQueryStorageData.getColumnIndex("timestamp")));
                            floVar = floVar2;
                        }
                        d(cursorQueryStorageData);
                        return floVar;
                    }
                    LogUtil.a("UserLabelMgr", "cursor is null");
                    d(cursorQueryStorageData);
                    return null;
                } catch (SQLiteDatabaseLockedException e2) {
                    e = e2;
                    ReleaseLogUtil.a("R_UserLabelMgr", "SQLiteDatabaseLockedException: ", ExceptionUtils.c(e));
                }
            } catch (Throwable th) {
                r1 = str;
                th = th;
                d(r1);
                throw th;
            }
        } catch (SQLiteDatabaseLockedException e3) {
            e = e3;
            cursorQueryStorageData = null;
        } catch (Throwable th2) {
            th = th2;
            d(r1);
            throw th;
        }
    }

    private void d(Cursor cursor) {
        if (cursor != null) {
            cursor.close();
        }
    }

    public String b(String str, String str2) {
        String strB;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            LogUtil.j("UserLabelMgr", "queryUriValueByKey text null");
            return null;
        }
        LogUtil.a("UserLabelMgr", "UserLabelMgr queryUriValueByKey data");
        try {
            Cursor cursorQueryStorageData = queryStorageData("health_user_label", 1, a(str2, str));
            if (cursorQueryStorageData != null) {
                if (cursorQueryStorageData.moveToFirst()) {
                    strB = b(cursorQueryStorageData, "uriValue");
                    LogUtil.d("UserLabelMgr", "uriValue = ", strB);
                }
                d(cursorQueryStorageData);
                return strB;
            }
            LogUtil.a("UserLabelMgr", "cursor is null");
            strB = "";
            d(cursorQueryStorageData);
            return strB;
        } catch (Throwable th) {
            d((Cursor) null);
            throw th;
        }
    }

    public List<flo> a(List<String> list, String str) {
        if (njy.e(list) || TextUtils.isEmpty(str)) {
            LogUtil.j("UserLabelMgr", "queryUserLabelList userLabelKeys is empty");
            return new ArrayList();
        }
        LogUtil.a("UserLabelMgr", "UserLabelMgr queryUserLabelList data");
        ArrayList arrayList = new ArrayList();
        try {
            Cursor cursorQueryStorageData = queryStorageData("health_user_label", 1, b(str));
            try {
                if (cursorQueryStorageData != null) {
                    while (cursorQueryStorageData.moveToNext()) {
                        String string = cursorQueryStorageData.getString(cursorQueryStorageData.getColumnIndex("uriKey"));
                        if (list.contains(string)) {
                            flo floVar = new flo();
                            floVar.b(cursorQueryStorageData.getString(cursorQueryStorageData.getColumnIndex("huid")));
                            floVar.d(string);
                            floVar.c(cursorQueryStorageData.getString(cursorQueryStorageData.getColumnIndex("uriValue")));
                            floVar.e(cursorQueryStorageData.getString(cursorQueryStorageData.getColumnIndex("timestamp")));
                            arrayList.add(floVar);
                        }
                    }
                } else {
                    LogUtil.a("UserLabelMgr", "cursor is null");
                }
                if (cursorQueryStorageData != null) {
                    cursorQueryStorageData.close();
                    return arrayList;
                }
            } catch (Throwable th) {
                if (cursorQueryStorageData != null) {
                    try {
                        cursorQueryStorageData.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (SQLException unused) {
            LogUtil.e("UserLabelMgr", "queryUserLabelList android SQLException");
        }
        return arrayList;
    }

    private String a(String str, String str2) {
        StringBuffer stringBuffer = new StringBuffer(16);
        stringBuffer.append("huid='").append(str).append("' AND uriKey='").append(str2).append("'");
        return stringBuffer.toString();
    }

    private String b(String str) {
        StringBuffer stringBuffer = new StringBuffer(16);
        stringBuffer.append("huid='").append(str).append("'");
        return stringBuffer.toString();
    }
}
