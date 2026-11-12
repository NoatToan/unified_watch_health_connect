package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import com.huawei.haf.application.BaseApplication;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.data.constant.HiHealthDataKey;
import com.huawei.hihealthservice.db.table.DBCommon;
import com.huawei.hihealthservice.db.table.DBPointCommon;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.OperationKey;
import health.compact.a.HiDateUtil;
import health.compact.a.KeyManager;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class kvq extends DBCommon {
    @Override // com.huawei.hihealthservice.db.table.DBCommon
    public /* bridge */ /* synthetic */ int delete(String str, String[] strArr) {
        return super.delete(str, strArr);
    }

    @Override // com.huawei.hihealthservice.db.table.DBCommon
    public /* bridge */ /* synthetic */ void execSQL(String str, Object[] objArr) {
        super.execSQL(str, objArr);
    }

    @Override // com.huawei.hihealthservice.db.table.DBCommon
    public /* bridge */ /* synthetic */ long insert(ContentValues contentValues) {
        return super.insert(contentValues);
    }

    @Override // com.huawei.hihealthservice.db.table.DBCommon
    public /* bridge */ /* synthetic */ Cursor query(String str, String[] strArr, String str2, String str3, String str4) {
        return super.query(str, strArr, str2, str3, str4);
    }

    @Override // com.huawei.hihealthservice.db.table.DBCommon
    public /* bridge */ /* synthetic */ Cursor queryEX(String[] strArr, String str, String[] strArr2, String str2, String str3, String str4) {
        return super.queryEX(strArr, str, strArr2, str2, str3, str4);
    }

    @Override // com.huawei.hihealthservice.db.table.DBCommon
    public /* bridge */ /* synthetic */ Cursor rawQuery(String str, String[] strArr) {
        return super.rawQuery(str, strArr);
    }

    @Override // com.huawei.hihealthservice.db.table.DBCommon
    public /* bridge */ /* synthetic */ int update(ContentValues contentValues, String str, String[] strArr) {
        return super.update(contentValues, str, strArr);
    }

    private kvq() {
    }

    protected kvq(String str) {
        super(str);
    }

    static class a {
        private static final kvq d = new kvq();
    }

    public static kvq d() {
        return a.d;
    }

    public static String c() {
        StringBuilder sb = new StringBuilder(16);
        sb.append("create table  IF NOT EXISTS hihealth_stat_day(_id integer primary key not null,date integer not null,hihealth_type integer not null,stat_type integer not null,value double not null,user_id integer,unit_id integer not null,client_id integer,timeZone text not null,sync_status integer not null,modified_time integer not null)");
        return sb.toString();
    }

    public static String e() {
        StringBuilder sb = new StringBuilder(16);
        sb.append(" CREATE INDEX StatIndex ON hihealth_stat_day(date,stat_type,client_id)");
        return sb.toString();
    }

    public static String b() {
        StringBuilder sb = new StringBuilder(16);
        sb.append(" CREATE INDEX IF NOT EXISTS StatDaySyncStatusIndex ON hihealth_stat_day(sync_status)");
        return sb.toString();
    }

    @Override // com.huawei.hihealthservice.db.table.DBCommon
    public String getTableName() {
        return "hihealth_stat_day";
    }

    @Override // com.huawei.hihealthservice.db.table.DBCommon
    public String[] getColumns() {
        return new String[]{"_id", "date", "hihealth_type", "stat_type", "value", "user_id", DBPointCommon.COLUMN_UNIT_ID, "client_id", "timeZone", "sync_status", "modified_time"};
    }

    public static List<HiHealthData> b(Cursor cursor) {
        int[] iArr = null;
        if (cursor == null) {
            LogUtil.j("Debug_DBStatDay", "parseStatCursor() Cursor query == null");
            return null;
        }
        ArrayList arrayList = new ArrayList(10);
        while (cursor.moveToNext()) {
            try {
                if (iArr == null) {
                    String[] strArr = {"date", "hihealth_type", "stat_type", "value", DBPointCommon.COLUMN_UNIT_ID, "timeZone", "modified_time"};
                    int[] iArr2 = new int[7];
                    for (int i = 0; i < 7; i++) {
                        iArr2[i] = cursor.getColumnIndex(strArr[i]);
                    }
                    iArr = iArr2;
                }
                HiHealthData hiHealthData = new HiHealthData();
                long jA = HiDateUtil.a(cursor.getInt(iArr[0]));
                hiHealthData.setStartTime(jA);
                hiHealthData.setEndTime(jA);
                hiHealthData.putInt("hihealth_type", cursor.getInt(iArr[1]));
                hiHealthData.setType(cursor.getInt(iArr[2]));
                hiHealthData.setValue(cursor.getDouble(iArr[3]));
                hiHealthData.setPointUnit(cursor.getInt(iArr[4]));
                hiHealthData.setTimeZone(cursor.getString(iArr[5]));
                hiHealthData.setModifiedTime(cursor.getLong(iArr[6]));
                arrayList.add(hiHealthData);
            } catch (Throwable th) {
                cursor.close();
                throw th;
            }
        }
        cursor.close();
        return arrayList;
    }

    public static List<kuk> c(Cursor cursor) {
        if (cursor == null) {
            LogUtil.j("Debug_DBStatDay", "parseStatTablesCursor() Cursor query == null");
            return null;
        }
        ArrayList arrayList = new ArrayList(10);
        while (cursor.moveToNext()) {
            try {
                arrayList.add(a(cursor));
            } catch (Throwable th) {
                cursor.close();
                throw th;
            }
        }
        cursor.close();
        return arrayList;
    }

    public static kuk d(Cursor cursor) {
        if (cursor == null) {
            LogUtil.j("Debug_DBStatDay", "parseOneStatCursor() Cursor query == null");
            return null;
        }
        try {
            return cursor.moveToNext() ? a(cursor) : null;
        } catch (SQLiteException e) {
            ReleaseLogUtil.a("Debug_DBStatDay", "parseOneIntCursor sqLiteException message: " + e.getMessage());
            LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>(1);
            linkedHashMap.put("errorCode", Integer.toString(-1));
            ljv.d(BaseApplication.b()).c(OperationKey.HEALTH_APP_SQL_ERROR_2129011.value(), linkedHashMap, true);
            return null;
        } finally {
            cursor.close();
        }
    }

    private static kuk a(Cursor cursor) {
        kuk kukVar = new kuk();
        kukVar.c(cursor.getInt(cursor.getColumnIndex("_id")));
        kukVar.a(cursor.getInt(cursor.getColumnIndex("client_id")));
        kukVar.b(cursor.getInt(cursor.getColumnIndex("date")));
        kukVar.e(cursor.getInt(cursor.getColumnIndex("hihealth_type")));
        kukVar.d(cursor.getInt(cursor.getColumnIndex("stat_type")));
        kukVar.c(cursor.getDouble(cursor.getColumnIndex("value")));
        kukVar.f(cursor.getInt(cursor.getColumnIndex(DBPointCommon.COLUMN_UNIT_ID)));
        kukVar.c(cursor.getString(cursor.getColumnIndex("timeZone")));
        kukVar.a(cursor.getLong(cursor.getColumnIndex("modified_time")));
        kukVar.i(cursor.getInt(cursor.getColumnIndex("sync_status")));
        return kukVar;
    }

    public static List<Integer> e(Cursor cursor) {
        if (cursor == null) {
            LogUtil.j("Debug_DBStatDay", "parseStatCursorDays() Cursor query == null");
            return null;
        }
        ArrayList arrayList = new ArrayList(10);
        boolean z = true;
        int columnIndex = 0;
        while (cursor.moveToNext()) {
            try {
                if (z) {
                    columnIndex = cursor.getColumnIndex("date");
                    z = false;
                }
                arrayList.add(Integer.valueOf(cursor.getInt(columnIndex)));
            } catch (Throwable th) {
                cursor.close();
                throw th;
            }
        }
        cursor.close();
        return arrayList;
    }

    public static List<HiHealthData> b(Cursor cursor, String[] strArr, boolean z) {
        int[] iArr = null;
        if (cursor == null) {
            LogUtil.j("Debug_DBStatDay", "parseNoSyncStatCursor() Cursor query == null");
            return null;
        }
        ArrayList arrayList = new ArrayList(10);
        while (cursor.moveToNext()) {
            try {
                if (iArr == null) {
                    String[] strArr2 = {"_id", "date", "stat_type", "timeZone", "modified_time"};
                    int[] iArr2 = new int[strArr.length + 5];
                    for (int i = 0; i < 5; i++) {
                        iArr2[i] = cursor.getColumnIndex(strArr2[i]);
                    }
                    for (int i2 = 0; i2 < strArr.length; i2++) {
                        iArr2[i2 + 5] = cursor.getColumnIndex(strArr[i2]);
                    }
                    iArr = iArr2;
                }
                HiHealthData hiHealthData = new HiHealthData();
                hiHealthData.setDataId(cursor.getInt(iArr[0]));
                hiHealthData.setStartTime(HiDateUtil.a(cursor.getInt(iArr[1])));
                hiHealthData.setType(cursor.getInt(iArr[2]));
                hiHealthData.setTimeZone(cursor.getString(iArr[3]));
                hiHealthData.putLong("modified_time", cursor.getLong(iArr[4]));
                int length = iArr.length - strArr.length;
                for (String str : strArr) {
                    if (!z || !cursor.isNull(iArr[length])) {
                        hiHealthData.putDouble(str, cursor.getDouble(iArr[length]));
                    }
                    length++;
                }
                arrayList.add(hiHealthData);
            } catch (Throwable th) {
                cursor.close();
                throw th;
            }
        }
        cursor.close();
        return arrayList;
    }

    public static List<HiHealthData> e(Cursor cursor, String[] strArr, boolean z) {
        int[] iArr = null;
        if (cursor == null) {
            LogUtil.j("Debug_DBStatDay", "parseAggregateStatCursor() Cursor query == null");
            return null;
        }
        ArrayList arrayList = new ArrayList(10);
        while (cursor.moveToNext()) {
            try {
                try {
                    if (iArr == null) {
                        String[] strArr2 = {"date", "stat_type", "timeZone", "modified_time"};
                        int[] iArr2 = new int[strArr.length + 4];
                        for (int i = 0; i < 4; i++) {
                            iArr2[i] = cursor.getColumnIndex(strArr2[i]);
                        }
                        for (int i2 = 0; i2 < strArr.length; i2++) {
                            iArr2[i2 + 4] = cursor.getColumnIndex(strArr[i2]);
                        }
                        iArr = iArr2;
                    }
                    HiHealthData hiHealthData = new HiHealthData();
                    long jA = HiDateUtil.a(cursor.getInt(iArr[0]));
                    hiHealthData.setStartTime(jA);
                    hiHealthData.setEndTime(jA);
                    hiHealthData.setType(cursor.getInt(iArr[1]));
                    hiHealthData.setTimeZone(cursor.getString(iArr[2]));
                    if (strArr == HiHealthDataKey.d(10010)) {
                        hiHealthData.putLong("modified_time", cursor.getLong(iArr[3]));
                    }
                    int length = iArr.length - strArr.length;
                    for (String str : strArr) {
                        if (!z || !cursor.isNull(iArr[length])) {
                            hiHealthData.putDouble(str, cursor.getDouble(iArr[length]));
                        }
                        length++;
                    }
                    arrayList.add(hiHealthData);
                } catch (SQLiteException e) {
                    if (kwf.e(e)) {
                        ReleaseLogUtil.a("Debug_DBStatDay", "parseAggregateSessionChangeCountCursor need to clean clone data", e.getMessage());
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

    public static List<HiHealthData> b(int i, Cursor cursor, String[] strArr) {
        int[] iArr = null;
        if (cursor == null) {
            LogUtil.j("Debug_DBStatDay", "parseAggregateStatCursor() Cursor query == null");
            return null;
        }
        ArrayList arrayList = new ArrayList(10);
        while (cursor.moveToNext()) {
            try {
                int i2 = 0;
                if (iArr == null) {
                    String[] strArr2 = {"date", "hihealth_type", "stat_type", "timeZone", "modified_time"};
                    int[] iArr2 = new int[strArr.length + 5];
                    for (int i3 = 0; i3 < 5; i3++) {
                        iArr2[i3] = cursor.getColumnIndex(strArr2[i3]);
                    }
                    for (int i4 = 0; i4 < strArr.length; i4++) {
                        iArr2[i4 + 5] = cursor.getColumnIndex(strArr[i4]);
                    }
                    iArr = iArr2;
                }
                HiHealthData hiHealthData = new HiHealthData();
                long jA = HiDateUtil.a(cursor.getInt(iArr[0]));
                hiHealthData.setStartTime(jA);
                hiHealthData.setEndTime(jA);
                if (i > 0) {
                    hiHealthData.putInt("hihealth_type", i);
                } else {
                    hiHealthData.putInt("hihealth_type", cursor.getInt(iArr[1]));
                }
                hiHealthData.setType(cursor.getInt(iArr[2]));
                hiHealthData.setTimeZone(cursor.getString(iArr[3]));
                if (strArr == HiHealthDataKey.d(10010)) {
                    hiHealthData.putLong("modified_time", cursor.getLong(iArr[4]));
                }
                int length = iArr.length - strArr.length;
                int length2 = strArr.length;
                while (i2 < length2) {
                    hiHealthData.putDouble(strArr[i2], cursor.getDouble(iArr[length]));
                    i2++;
                    length++;
                }
                arrayList.add(hiHealthData);
            } catch (Throwable th) {
                cursor.close();
                throw th;
            }
        }
        cursor.close();
        return arrayList;
    }
}
