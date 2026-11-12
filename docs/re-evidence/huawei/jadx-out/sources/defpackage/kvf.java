package defpackage;

import android.content.ContentValues;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealthservice.db.table.DBPointCommon;
import health.compact.a.HiDateUtil;

/* JADX INFO: loaded from: classes10.dex */
public class kvf extends DBPointCommon {
    private kvf() {
    }

    protected kvf(String str) {
        super(str);
    }

    public static kvf d() {
        return e.f39539b;
    }

    static class e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final kvf f39539b = new kvf();
    }

    public static String b() {
        return getPointCommonIndexSQL("HealthPointIndex", "sample_point_health");
    }

    public static String g() {
        return getStartTimeIndexSQL("PointHealthStartTimeIndex", "sample_point_health");
    }

    public static String e() {
        StringBuilder sb = new StringBuilder(16);
        sb.append(" CREATE INDEX  IF NOT EXISTS PointHealthSyncStatusIndex ON sample_point_health(sync_status)");
        return sb.toString();
    }

    public static String a() {
        return " DROP INDEX IF EXISTS HealthPointIndex";
    }

    public static String c() {
        return getPointCreateTableSQL("sample_point_health");
    }

    @Override // com.huawei.hihealthservice.db.table.DBCommon
    public String getTableName() {
        return "sample_point_health";
    }

    public static ContentValues e(HiHealthData hiHealthData, int i, int i2) {
        ContentValues contentValues = new ContentValues(11);
        contentValues.put("start_time", Long.valueOf(hiHealthData.getStartTime()));
        contentValues.put("end_time", Long.valueOf(hiHealthData.getEndTime()));
        contentValues.put("type_id", Integer.valueOf(hiHealthData.getType()));
        contentValues.put("value", Double.valueOf(hiHealthData.getValue()));
        contentValues.put("metadata", hiHealthData.getMetaData());
        contentValues.put(DBPointCommon.COLUMN_UNIT_ID, Integer.valueOf(hiHealthData.getPointUnit()));
        contentValues.put("client_id", Integer.valueOf(i));
        contentValues.put("merged", Integer.valueOf(i2));
        contentValues.put("sync_status", Integer.valueOf(hiHealthData.getSyncStatus()));
        contentValues.put("timeZone", HiDateUtil.c(hiHealthData.getTimeZone()));
        contentValues.put("modified_time", Long.valueOf(hiHealthData.getModifiedTime()));
        return contentValues;
    }

    public static ContentValues c(HiHealthData hiHealthData, int i) {
        ContentValues contentValues = new ContentValues(6);
        contentValues.put("value", Double.valueOf(hiHealthData.getValue()));
        contentValues.put("metadata", hiHealthData.getMetaData());
        contentValues.put(DBPointCommon.COLUMN_UNIT_ID, Integer.valueOf(hiHealthData.getPointUnit()));
        contentValues.put("sync_status", Integer.valueOf(hiHealthData.getSyncStatus()));
        contentValues.put("merged", Integer.valueOf(i));
        contentValues.put("modified_time", Long.valueOf(hiHealthData.getModifiedTime()));
        return contentValues;
    }

    public static ContentValues a(int i, int i2) {
        ContentValues contentValues = new ContentValues(3);
        contentValues.put("sync_status", Integer.valueOf(i2));
        contentValues.put("merged", Integer.valueOf(i));
        contentValues.put("modified_time", Long.valueOf(System.currentTimeMillis()));
        return contentValues;
    }
}
