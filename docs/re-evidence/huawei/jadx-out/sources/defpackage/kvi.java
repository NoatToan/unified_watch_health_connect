package defpackage;

import android.content.ContentValues;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealthservice.db.table.DBSessionCommon;
import health.compact.a.HiDateUtil;

/* JADX INFO: loaded from: classes10.dex */
public class kvi extends DBSessionCommon {
    private kvi() {
    }

    static class a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final kvi f39541c = new kvi();
    }

    public static kvi a() {
        return a.f39541c;
    }

    public static String e() {
        return getSessionCreateTableSQL("sample_session");
    }

    public static String b() {
        return getSessionCommonIndexSQL("SessionIndex", "sample_session");
    }

    @Override // com.huawei.hihealthservice.db.table.DBCommon
    public String getTableName() {
        return "sample_session";
    }

    public static ContentValues b(int i, int i2) {
        ContentValues contentValues = new ContentValues(3);
        contentValues.put("sync_status", Integer.valueOf(i2));
        contentValues.put("merged", Integer.valueOf(i));
        contentValues.put("modified_time", Long.valueOf(System.currentTimeMillis()));
        return contentValues;
    }

    public static ContentValues c(HiHealthData hiHealthData, int i, int i2) {
        ContentValues contentValues = new ContentValues(9);
        contentValues.put("start_time", Long.valueOf(hiHealthData.getStartTime()));
        contentValues.put("end_time", Long.valueOf(hiHealthData.getEndTime()));
        contentValues.put("type_id", Integer.valueOf(hiHealthData.getType()));
        contentValues.put("metadata", hiHealthData.getMetaData());
        contentValues.put("client_id", Integer.valueOf(i));
        contentValues.put("merged", Integer.valueOf(i2));
        contentValues.put("sync_status", Integer.valueOf(hiHealthData.getSyncStatus()));
        contentValues.put(DBSessionCommon.COLUMN_TIME_ZONE, HiDateUtil.c(hiHealthData.getTimeZone()));
        contentValues.put("modified_time", Long.valueOf(System.currentTimeMillis()));
        return contentValues;
    }

    public static ContentValues b(HiHealthData hiHealthData, int i) {
        ContentValues contentValues = new ContentValues(5);
        contentValues.put("type_id", Integer.valueOf(hiHealthData.getType()));
        contentValues.put("metadata", hiHealthData.getMetaData());
        contentValues.put("merged", Integer.valueOf(i));
        contentValues.put("sync_status", Integer.valueOf(hiHealthData.getSyncStatus()));
        contentValues.put("modified_time", Long.valueOf(System.currentTimeMillis()));
        return contentValues;
    }
}
