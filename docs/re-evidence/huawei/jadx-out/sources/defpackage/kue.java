package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.data.model.HiTrackMetaData;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hihealthservice.db.table.DBPointCommon;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.LogAnonymous;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import net.zetetic.database.sqlcipher.SQLiteDatabase;

/* JADX INFO: loaded from: classes10.dex */
public class kue {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int[] f39498b = {2007, 2006, 2015, 2008, 2009, 2010, 2011, 2012, 2013, 2014, 2106, 2103, 2104, 2107, 2108};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int[] f39499c = {47201, 47202, 47203, 47204, 47501, 47502, 47503, 47504};

    public static void d(SQLiteDatabase sQLiteDatabase, SQLiteDatabase sQLiteDatabase2) {
        if (sQLiteDatabase == null || sQLiteDatabase2 == null) {
            ReleaseLogUtil.e("MigrateDataBaseData", "database or sensitiveDatabase is null");
            return;
        }
        String[] strArr = {"_id", "start_time", "end_time", "type_id", "value", "metadata", DBPointCommon.COLUMN_UNIT_ID, "client_id", "merged", "sync_status", "timeZone", "modified_time"};
        StringBuffer stringBuffer = new StringBuffer();
        int[] iArr = f39498b;
        String[] strArr2 = new String[iArr.length];
        kwb.d("type_id", iArr, stringBuffer, strArr2, 0);
        Cursor cursorQuery = sQLiteDatabase.query("sample_point_health", strArr, stringBuffer.toString(), strArr2, null, null, null);
        ArrayList arrayList = new ArrayList(10);
        int[] iArr2 = null;
        while (cursorQuery.moveToNext()) {
            try {
                try {
                    if (iArr2 == null) {
                        int[] iArr3 = new int[12];
                        for (int i = 0; i < 12; i++) {
                            iArr3[i] = cursorQuery.getColumnIndex(strArr[i]);
                        }
                        iArr2 = iArr3;
                    }
                    arrayList.add(a(cursorQuery, iArr2));
                } catch (RuntimeException e) {
                    throw e;
                } catch (Exception e2) {
                    ReleaseLogUtil.e("HiH_MigrateDataBaseData", "copySensitiveDataFromNormalDatabase Exception", LogAnonymous.b(e2));
                }
            } catch (Throwable th) {
                cursorQuery.close();
                throw th;
            }
        }
        cursorQuery.close();
        if (arrayList.isEmpty()) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            sQLiteDatabase2.insert("sample_point_health", (String) null, (ContentValues) it.next());
        }
        sQLiteDatabase.delete("sample_point_health", stringBuffer.toString(), strArr2);
    }

    private static ContentValues a(Cursor cursor, int[] iArr) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("_id", Integer.valueOf(cursor.getInt(iArr[0])));
        contentValues.put("start_time", Long.valueOf(cursor.getLong(iArr[1])));
        contentValues.put("end_time", Long.valueOf(cursor.getLong(iArr[2])));
        contentValues.put("type_id", Integer.valueOf(cursor.getInt(iArr[3])));
        contentValues.put("value", Double.valueOf(cursor.getDouble(iArr[4])));
        contentValues.put("metadata", cursor.getString(iArr[5]));
        contentValues.put(DBPointCommon.COLUMN_UNIT_ID, Integer.valueOf(cursor.getInt(iArr[6])));
        contentValues.put("client_id", Integer.valueOf(cursor.getInt(iArr[7])));
        contentValues.put("merged", Integer.valueOf(cursor.getInt(iArr[8])));
        contentValues.put("sync_status", Integer.valueOf(cursor.getInt(iArr[9])));
        contentValues.put("timeZone", cursor.getString(iArr[10]));
        contentValues.put("modified_time", Long.valueOf(cursor.getLong(iArr[11])));
        return contentValues;
    }

    public static void c(SQLiteDatabase sQLiteDatabase, SQLiteDatabase sQLiteDatabase2) {
        if (sQLiteDatabase == null || sQLiteDatabase2 == null) {
            LogUtil.j("MigrateDataBaseData", "copySensitiveStatDataFromNormalDatabase database is null");
            return;
        }
        String[] strArr = {"_id", "date", "hihealth_type", "stat_type", "value", "user_id", DBPointCommon.COLUMN_UNIT_ID, "client_id", "timeZone", "sync_status", "modified_time"};
        StringBuffer stringBuffer = new StringBuffer();
        int[] iArr = f39499c;
        String[] strArr2 = new String[iArr.length];
        kwb.d("stat_type", iArr, stringBuffer, strArr2, 0);
        Cursor cursorQuery = sQLiteDatabase.query("hihealth_stat_day", strArr, stringBuffer.toString(), strArr2, null, null, null);
        ArrayList arrayList = new ArrayList(10);
        int[] iArr2 = null;
        while (cursorQuery.moveToNext()) {
            try {
                try {
                    if (iArr2 == null) {
                        int[] iArr3 = new int[11];
                        for (int i = 0; i < 11; i++) {
                            iArr3[i] = cursorQuery.getColumnIndex(strArr[i]);
                        }
                        iArr2 = iArr3;
                    }
                    arrayList.add(d(cursorQuery, iArr2));
                } catch (RuntimeException e) {
                    throw e;
                } catch (Exception e2) {
                    ReleaseLogUtil.e("HiH_MigrateDataBaseData", "copySensitiveStatDataFromNormalDatabase Exception", LogAnonymous.b(e2));
                }
            } catch (Throwable th) {
                cursorQuery.close();
                throw th;
            }
        }
        cursorQuery.close();
        if (arrayList.isEmpty()) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            sQLiteDatabase2.insert("hihealth_stat_day", (String) null, (ContentValues) it.next());
        }
        sQLiteDatabase.delete("hihealth_stat_day", stringBuffer.toString(), strArr2);
    }

    private static ContentValues d(Cursor cursor, int[] iArr) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("_id", Integer.valueOf(cursor.getInt(iArr[0])));
        contentValues.put("date", Integer.valueOf(cursor.getInt(iArr[1])));
        contentValues.put("hihealth_type", Integer.valueOf(cursor.getInt(iArr[2])));
        contentValues.put("stat_type", Integer.valueOf(cursor.getInt(iArr[3])));
        contentValues.put("value", Double.valueOf(cursor.getDouble(iArr[4])));
        contentValues.put("user_id", Integer.valueOf(cursor.getInt(iArr[5])));
        contentValues.put(DBPointCommon.COLUMN_UNIT_ID, Integer.valueOf(cursor.getInt(iArr[6])));
        contentValues.put("client_id", Integer.valueOf(cursor.getInt(iArr[7])));
        contentValues.put("timeZone", cursor.getString(iArr[8]));
        contentValues.put("sync_status", Integer.valueOf(cursor.getInt(iArr[9])));
        contentValues.put("modified_time", Long.valueOf(cursor.getLong(iArr[10])));
        return contentValues;
    }

    public static boolean d(SQLiteDatabase sQLiteDatabase) {
        boolean zD = d(sQLiteDatabase, e(sQLiteDatabase, 30001));
        LogUtil.a("MigrateDataBaseData", "updateSequenceTableData result = ", Boolean.valueOf(zD));
        return zD;
    }

    private static boolean d(SQLiteDatabase sQLiteDatabase, List<HiHealthData> list) {
        if (list == null || list.isEmpty()) {
            LogUtil.j("MigrateDataBaseData", "updateSequenceData fail, no data to update");
            return false;
        }
        int i = 0;
        for (HiHealthData hiHealthData : list) {
            int sportType = ((HiTrackMetaData) HiJsonUtil.d(hiHealthData.getMetaData(), HiTrackMetaData.class)).getSportType();
            if (sportType == 0) {
                LogUtil.j("MigrateDataBaseData", "updateSequenceData sportType is illegal");
            } else {
                ContentValues contentValues = new ContentValues();
                contentValues.put("sync_status", (Integer) 0);
                contentValues.put("sub_type_id", Integer.valueOf(sportType));
                if (sQLiteDatabase.update("sample_sequence", contentValues, "_id =? ", new String[]{Long.toString(hiHealthData.getDataId())}) <= 0) {
                    i++;
                    LogUtil.j("MigrateDataBaseData", "updateSequenceData fail, the data start time = ", Long.valueOf(hiHealthData.getStartTime()));
                }
            }
        }
        LogUtil.a("MigrateDataBaseData", "updateSequenceData updateFailCount = ", Integer.valueOf(i));
        return i <= 0;
    }

    private static List<HiHealthData> e(SQLiteDatabase sQLiteDatabase, int i) {
        Cursor cursorQuery = sQLiteDatabase.query("sample_sequence", new String[]{"_id", "start_time", "meta_data"}, "type_id =? ", new String[]{Integer.toString(i)}, null, null, null);
        ArrayList arrayList = new ArrayList(10);
        while (cursorQuery.moveToNext()) {
            try {
                HiHealthData hiHealthData = new HiHealthData();
                hiHealthData.setDataId(cursorQuery.getInt(0));
                hiHealthData.setStartTime(cursorQuery.getLong(1));
                hiHealthData.setMetaData(cursorQuery.getString(2));
                arrayList.add(hiHealthData);
            } catch (Throwable th) {
                cursorQuery.close();
                throw th;
            }
        }
        cursorQuery.close();
        return arrayList;
    }
}
