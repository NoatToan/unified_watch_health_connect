package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.huawei.haf.application.BaseApplication;
import com.huawei.hihealth.HiAccountInfo;
import com.huawei.hihealth.HiAppInfo;
import com.huawei.hihealth.HiDeviceInfo;
import com.huawei.hihealth.HiGoalInfo;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.HiHealthUserPermission;
import com.huawei.hihealth.HiUserInfo;
import com.huawei.hihealth.HiUserPreference;
import com.huawei.hihealth.WearKitPermission;
import com.huawei.hihealthservice.db.table.DBPointCommon;
import com.huawei.hihealthservice.db.table.DBSessionCommon;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.OperationKey;
import health.compact.a.KeyManager;
import health.compact.a.LogAnonymous;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class kwf {
    public static List<HiHealthData> m(Cursor cursor, String str) {
        return DBPointCommon.parsePointListWithDeviceUUID(cursor, str);
    }

    public static List<HiHealthData> t(Cursor cursor) {
        return DBPointCommon.parseMergePointListWithClientIdAndMerged(cursor);
    }

    public static List<HiHealthData> q(Cursor cursor) {
        return DBPointCommon.parseNoSyncPointList(cursor);
    }

    public static boolean e(Exception exc) {
        String message = exc.getMessage();
        return !TextUtils.isEmpty(message) && (message.contains("file is not a database") || message.contains("database disk image is malformed"));
    }

    public static List<HiHealthData> g(Cursor cursor, String[] strArr) {
        if (cursor == null) {
            LogUtil.j("Debug_ParseCursorUtil", "parseRawSportCursor() Cursor query == null");
            return null;
        }
        ArrayList arrayList = new ArrayList();
        while (cursor.moveToNext()) {
            try {
                try {
                    HiHealthData hiHealthData = new HiHealthData();
                    hiHealthData.setStartTime(cursor.getLong(cursor.getColumnIndex("start_time")));
                    hiHealthData.setEndTime(cursor.getLong(cursor.getColumnIndex("end_time")));
                    hiHealthData.setType(cursor.getInt(cursor.getColumnIndex("session_type")));
                    for (String str : strArr) {
                        hiHealthData.putDouble(str, cursor.getDouble(cursor.getColumnIndex(str)));
                    }
                    arrayList.add(hiHealthData);
                } catch (SQLiteException e) {
                    if (e(e)) {
                        ReleaseLogUtil.a("HiH_ParseCursorUtil", "parseRawSportCursor need to clean clone data", e.getMessage());
                        KeyManager.a(false);
                    }
                    cursor.close();
                    return arrayList;
                }
            } catch (Throwable th) {
                cursor.close();
                throw th;
            }
        }
        cursor.close();
        return arrayList;
    }

    public static List<HiHealthData> i(Cursor cursor, String[] strArr) {
        return DBSessionCommon.parseNoSyncRawSportCursor(cursor, strArr);
    }

    public static List<HiHealthData> h(Cursor cursor, String[] strArr) {
        return DBPointCommon.parseNoSyncDeviceStatCursor(cursor, strArr);
    }

    public static List<HiHealthData> b(Cursor cursor, String[] strArr) {
        return DBPointCommon.parseAggregatePointCursor(cursor, strArr);
    }

    public static List<HiHealthData> j(Cursor cursor, String[] strArr) {
        return DBPointCommon.parseAggregateWeightPointCursor(cursor, strArr);
    }

    public static List<HiHealthData> a(Cursor cursor, String[] strArr) {
        return DBPointCommon.parseAggregateHealthPointCursor(cursor, strArr);
    }

    public static List<HiHealthData> c(Cursor cursor, String[] strArr) {
        return DBSessionCommon.parseAggregateRawMixCursor(cursor, strArr);
    }

    public static List<HiHealthData> e(Cursor cursor, String[] strArr) {
        return DBSessionCommon.parseAggregateHealthSessionCursor(cursor, strArr);
    }

    public static List<HiHealthData> c(Cursor cursor, String[] strArr, boolean z) {
        return kvq.e(cursor, strArr, z);
    }

    public static List<HiHealthData> e(int i, Cursor cursor, String[] strArr) {
        return kvq.b(i, cursor, strArr);
    }

    public static List<HiHealthData> d(Cursor cursor, String[] strArr, boolean z) {
        return kvq.b(cursor, strArr, z);
    }

    public static List<HiHealthData> d(Cursor cursor, String str) {
        return DBSessionCommon.parseAggregateRawSessionCursor(cursor, str);
    }

    public static List<HiHealthData> a(Cursor cursor, String str) {
        return DBSessionCommon.parseAggregateRawHealthSessionCursor(cursor, str);
    }

    public static List<HiHealthData> b(Cursor cursor, String str) {
        if (cursor == null) {
            LogUtil.j("Debug_ParseCursorUtil", "parseAggregateSessionChangeCountCursor() Cursor query == null");
            return null;
        }
        ArrayList arrayList = new ArrayList();
        while (cursor.moveToNext()) {
            try {
                try {
                    HiHealthData hiHealthData = new HiHealthData();
                    hiHealthData.putInt(str, cursor.getInt(cursor.getColumnIndex(str)));
                    arrayList.add(hiHealthData);
                } catch (SQLiteException e) {
                    if (e(e)) {
                        ReleaseLogUtil.a("HiH_ParseCursorUtil", "parseAggregateSessionChangeCountCursor need to clean clone data", e.getMessage());
                        KeyManager.a(false);
                    }
                    cursor.close();
                    return arrayList;
                }
            } catch (Throwable th) {
                cursor.close();
                throw th;
            }
        }
        cursor.close();
        return arrayList;
    }

    public static List<HiHealthData> d(Cursor cursor, String[] strArr) {
        return kvl.c(cursor, strArr);
    }

    public static List<HiHealthData> x(Cursor cursor) {
        return DBSessionCommon.parseSessionCursor(cursor);
    }

    public static List<HiHealthData> l(Cursor cursor) {
        return DBSessionCommon.parseHealthSessionCursor(cursor);
    }

    public static List<HiHealthData> n(Cursor cursor, String str) {
        return kvl.a(cursor, str);
    }

    public static List<String> u(Cursor cursor) {
        return kvl.e(cursor);
    }

    public static List<HiHealthData> p(Cursor cursor) {
        return kvl.c(cursor);
    }

    public static List<HiHealthData> d(Cursor cursor, boolean z) {
        return kvl.a(cursor, z);
    }

    public static List<HiHealthData> r(Cursor cursor) {
        return kvl.a(cursor);
    }

    public static List<Integer> w(Cursor cursor) {
        return kvl.b(cursor);
    }

    public static List<HiHealthData> o(Cursor cursor, String str) {
        return kuz.c(cursor, str);
    }

    public static Double g(Cursor cursor, String str) {
        if (cursor == null) {
            LogUtil.j("Debug_ParseCursorUtil", "parseOneDataValueCursor() Cursor query == null");
            return null;
        }
        try {
            return cursor.moveToNext() ? Double.valueOf(cursor.getDouble(cursor.getColumnIndex(str))) : null;
        } catch (SQLiteException e) {
            if (e(e)) {
                ReleaseLogUtil.a("HiH_ParseCursorUtil", "parseOneDataValueCursor need to clean clone data", e.getMessage());
                KeyManager.a(false);
            }
            return null;
        } finally {
            cursor.close();
        }
    }

    public static List<HiHealthData> y(Cursor cursor) {
        return kvq.b(cursor);
    }

    public static List<kuk> ab(Cursor cursor) {
        return kvq.c(cursor);
    }

    public static kuk s(Cursor cursor) {
        return kvq.d(cursor);
    }

    public static List<Integer> v(Cursor cursor) {
        return kvq.e(cursor);
    }

    public static HiAppInfo d(Cursor cursor) {
        return kun.d(cursor);
    }

    public static List<HiAppInfo> a(Cursor cursor) {
        return kun.e(cursor);
    }

    public static List<HiHealthUserPermission> ac(Cursor cursor) {
        LogUtil.a("Debug_ParseCursorUtil", "enter parseUserPermissionCursor", "Cursor =", cursor);
        return kvr.c(cursor);
    }

    public static HiDeviceInfo g(Cursor cursor) {
        return kuw.b(cursor);
    }

    public static List<HiDeviceInfo> j(Cursor cursor) {
        return kuw.d(cursor);
    }

    public static List<Integer> i(Cursor cursor) {
        return kus.b(cursor);
    }

    public static List<kym> h(Cursor cursor) {
        return kus.e(cursor);
    }

    public static kym f(Cursor cursor) {
        return kus.a(cursor);
    }

    public static int b(Cursor cursor, String str, int i) {
        if (cursor == null) {
            LogUtil.j("Debug_ParseCursorUtil", "parseOneIntCursor is null");
            return i;
        }
        try {
            if (cursor.moveToNext()) {
                i = cursor.getInt(cursor.getColumnIndex(str));
            }
            return i;
        } catch (SQLiteDatabaseCorruptException e) {
            ReleaseLogUtil.a("HiH_ParseCursorUtil", "parseOneIntCursor SQLiteDatabaseCorruptException", LogAnonymous.b(e));
            return i;
        } catch (SQLiteException e2) {
            ReleaseLogUtil.a("HiH_ParseCursorUtil", "parseOneIntCursor sqLiteException message:" + e2.getMessage());
            LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>(1);
            linkedHashMap.put("errorCode", Integer.toString(-1));
            ljv.d(BaseApplication.b()).c(OperationKey.HEALTH_APP_SQL_ERROR_2129011.value(), linkedHashMap, true);
            if (e(e2)) {
                ReleaseLogUtil.a("HiH_ParseCursorUtil", "parseOneIntCursor need to clean clone data", e2.getMessage());
                KeyManager.a(false);
            }
            return i;
        } finally {
            cursor.close();
        }
    }

    public static int f(Cursor cursor, String str) {
        return b(cursor, str, 0);
    }

    public static String j(Cursor cursor, String str) {
        try {
            if (cursor == null) {
                LogUtil.j("Debug_ParseCursorUtil", "parseOneStringCursor is null");
                return null;
            }
            return cursor.moveToNext() ? cursor.getString(cursor.getColumnIndex(str)) : null;
        } catch (Exception e) {
            ReleaseLogUtil.a("HiH_ParseCursorUtil", "parseOneStringCursor ", e.getClass().getSimpleName());
            if (e(e)) {
                ReleaseLogUtil.a("HiH_ParseCursorUtil", "parseOneStringCursor need to clean clone data", e.getMessage());
                KeyManager.a(false);
            }
            return null;
        } finally {
            cursor.close();
        }
    }

    public static long h(Cursor cursor, String str) {
        try {
            if (cursor == null) {
                LogUtil.j("Debug_ParseCursorUtil", "parseOneStringCursor is null");
                return 0L;
            }
            return cursor.moveToNext() ? cursor.getLong(cursor.getColumnIndex(str)) : 0L;
        } catch (SQLiteException e) {
            if (e(e)) {
                ReleaseLogUtil.a("HiH_ParseCursorUtil", "parseOneLongCursor need to clean clone data", e.getMessage());
                KeyManager.a(false);
            }
            return 0L;
        } finally {
            cursor.close();
        }
    }

    public static List<Integer> i(Cursor cursor, String str) {
        if (cursor == null) {
            LogUtil.j("Debug_ParseCursorUtil", "parseOneIntListCursor is null");
            return null;
        }
        ArrayList arrayList = new ArrayList();
        while (cursor.moveToNext()) {
            try {
                try {
                    arrayList.add(Integer.valueOf(cursor.getInt(cursor.getColumnIndex(str))));
                } catch (SQLiteException e) {
                    if (e(e)) {
                        ReleaseLogUtil.a("HiH_ParseCursorUtil", "parseOneIntListCursor need to clean clone data", e.getMessage());
                        KeyManager.a(false);
                    }
                    cursor.close();
                    return arrayList;
                }
            } catch (Throwable th) {
                cursor.close();
                throw th;
            }
        }
        cursor.close();
        return arrayList;
    }

    public static List<Integer> c(Cursor cursor, String str) {
        if (cursor == null) {
            LogUtil.j("Debug_ParseCursorUtil", "parseDataSourceClientCursor is null");
            return null;
        }
        ArrayList arrayList = new ArrayList();
        while (cursor.moveToNext()) {
            try {
                try {
                    arrayList.add(Integer.valueOf(cursor.getInt(cursor.getColumnIndex(str))));
                } catch (SQLiteException e) {
                    if (e(e)) {
                        ReleaseLogUtil.a("HiH_ParseCursorUtil", "parseDataSourceClientCursor need to clean clone data", e.getMessage());
                        KeyManager.a(false);
                    }
                    cursor.close();
                    return arrayList;
                }
            } catch (Throwable th) {
                cursor.close();
                throw th;
            }
        }
        cursor.close();
        return arrayList;
    }

    public static List<Integer> k(Cursor cursor, String str) {
        if (cursor == null) {
            LogUtil.j("Debug_ParseCursorUtil", "parseSleepLastSevenDayTime cursor is null");
            return null;
        }
        ArrayList arrayList = new ArrayList();
        while (cursor.moveToNext()) {
            try {
                try {
                    arrayList.add(Integer.valueOf(cursor.getInt(cursor.getColumnIndex(str))));
                } catch (SQLiteException e) {
                    if (e(e)) {
                        ReleaseLogUtil.a("HiH_ParseCursorUtil", "parseSleepLastSevenDayTime need to clean clone data", e.getMessage());
                        KeyManager.a(false);
                    }
                    cursor.close();
                    return arrayList;
                }
            } catch (Throwable th) {
                cursor.close();
                throw th;
            }
        }
        cursor.close();
        return arrayList;
    }

    public static List<HiUserInfo> aa(Cursor cursor) {
        return kvs.d(cursor);
    }

    public static HiUserInfo z(Cursor cursor) {
        return kvs.b(cursor);
    }

    public static HiAccountInfo e(Cursor cursor) {
        return kur.a(cursor);
    }

    public static List<HiGoalInfo> n(Cursor cursor) {
        return kut.a(cursor);
    }

    public static kul ad(Cursor cursor) {
        return kvo.a(cursor);
    }

    public static List<kul> k(Cursor cursor) {
        return kvo.c(cursor);
    }

    public static boolean m(Cursor cursor) {
        try {
            if (cursor == null) {
                return false;
            }
            return cursor.moveToNext();
        } catch (SQLiteException e) {
            if (e(e)) {
                ReleaseLogUtil.a("HiH_ParseCursorUtil", "parseHasDataCursor need to clean clone data", e.getMessage());
                KeyManager.a(false);
            }
            return false;
        } finally {
            cursor.close();
        }
    }

    public static List<HiUserPreference> ae(Cursor cursor) {
        return kvv.b(cursor);
    }

    public static HiUserPreference ai(Cursor cursor) {
        return kvv.c(cursor);
    }

    public static List<WearKitPermission> ah(Cursor cursor) {
        return kwa.c(cursor);
    }

    public static List<HiHealthData> e(Cursor cursor, String str) {
        return kvt.a(cursor, str);
    }

    public static List<HiHealthData> o(Cursor cursor) {
        return kvt.e(cursor);
    }

    public static long b(Cursor cursor) {
        return kvt.d(cursor);
    }

    public static List<HiHealthData> c(Cursor cursor) {
        return kvu.e(cursor);
    }
}
