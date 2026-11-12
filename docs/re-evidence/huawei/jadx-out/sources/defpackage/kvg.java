package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import com.huawei.hihealth.HiSampleConfig;
import com.huawei.hihealthservice.db.table.DBCommon;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class kvg extends DBCommon {
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

    public static kvg c() {
        return c.d;
    }

    static class c {
        private static final kvg d = new kvg();
    }

    private kvg() {
    }

    public static String a() {
        StringBuilder sb = new StringBuilder(16);
        sb.append("create table  IF NOT EXISTS sample_config(_id integer primary key not null,type text,config_id text,scope_app text,scope_device_type text,config_data text,config_description text,meta_data text,client_id integer not null,sync_status integer not null,modified_time integer not null)");
        return sb.toString();
    }

    public static String e() {
        StringBuilder sb = new StringBuilder(16);
        sb.append(" CREATE INDEX SampleConfigIndex ON sample_config(type,config_id,scope_app,scope_device_type)");
        return sb.toString();
    }

    @Override // com.huawei.hihealthservice.db.table.DBCommon
    public String getTableName() {
        return "sample_config";
    }

    @Override // com.huawei.hihealthservice.db.table.DBCommon
    public String[] getColumns() {
        return new String[]{"_id", "type", "config_id", "scope_app", "scope_device_type", "config_data", "config_description", "meta_data", "client_id", "sync_status", "modified_time"};
    }

    public static ContentValues c(HiSampleConfig hiSampleConfig) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("type", hiSampleConfig.getType());
        contentValues.put("config_id", hiSampleConfig.getConfigId());
        contentValues.put("scope_app", hiSampleConfig.getScopeApp());
        contentValues.put("scope_device_type", hiSampleConfig.getScopeDeviceType());
        contentValues.put("config_data", hiSampleConfig.getConfigData());
        contentValues.put("config_description", hiSampleConfig.getConfigDescription());
        contentValues.put("meta_data", hiSampleConfig.getMetaData());
        contentValues.put("client_id", Integer.valueOf(hiSampleConfig.getClientId()));
        contentValues.put("sync_status", Integer.valueOf(hiSampleConfig.getSyncStatus()));
        contentValues.put("modified_time", Long.valueOf(hiSampleConfig.getModifiedTime()));
        return contentValues;
    }

    public static ContentValues a(HiSampleConfig hiSampleConfig) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("config_data", hiSampleConfig.getConfigData());
        contentValues.put("config_description", hiSampleConfig.getConfigDescription());
        contentValues.put("meta_data", hiSampleConfig.getMetaData());
        contentValues.put("client_id", Integer.valueOf(hiSampleConfig.getClientId()));
        contentValues.put("sync_status", Integer.valueOf(hiSampleConfig.getSyncStatus()));
        contentValues.put("modified_time", Long.valueOf(hiSampleConfig.getModifiedTime()));
        return contentValues;
    }

    public static ContentValues d(int i) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("sync_status", Integer.valueOf(i));
        return contentValues;
    }

    public static List<HiSampleConfig> b(Cursor cursor) {
        if (cursor == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList(10);
        while (cursor.moveToNext()) {
            try {
                arrayList.add(c(cursor));
            } catch (Throwable th) {
                cursor.close();
                throw th;
            }
        }
        cursor.close();
        return arrayList;
    }

    private static HiSampleConfig c(Cursor cursor) {
        return new HiSampleConfig.Builder().c(cursor.getInt(cursor.getColumnIndex("_id"))).h(cursor.getString(cursor.getColumnIndex("type"))).a(cursor.getString(cursor.getColumnIndex("config_id"))).f(cursor.getString(cursor.getColumnIndex("scope_app"))).i(cursor.getString(cursor.getColumnIndex("scope_device_type"))).b(cursor.getString(cursor.getColumnIndex("config_data"))).d(cursor.getString(cursor.getColumnIndex("config_description"))).c(cursor.getString(cursor.getColumnIndex("meta_data"))).d(cursor.getInt(cursor.getColumnIndex("client_id"))).b(cursor.getInt(cursor.getColumnIndex("sync_status"))).e(cursor.getLong(cursor.getColumnIndex("modified_time"))).c();
    }
}
