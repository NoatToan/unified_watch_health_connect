package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteException;
import com.huawei.hihealth.util.ReleaseLogUtil;
import com.huawei.hihealthservice.db.table.DBCommon;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.KeyManager;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes10.dex */
public class kus extends DBCommon {
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

    private kus() {
    }

    static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final kus f39530a = new kus();
    }

    public static kus b() {
        return e.f39530a;
    }

    public static String d() {
        StringBuilder sb = new StringBuilder(16);
        sb.append("create table  IF NOT EXISTS hihealth_dataclient(_id integer primary key not null,client_uuid text not null,user_id integer not null,device_id integer not null,app_id integer not null,sync_status integer not null,cloud_device integer,create_time integer not null,need_uploaddata integer not null)");
        return sb.toString();
    }

    public static String a() {
        StringBuilder sb = new StringBuilder(16);
        sb.append(" CREATE INDEX ClientIndex ON hihealth_dataclient(_id,user_id,device_id,app_id)");
        return sb.toString();
    }

    @Override // com.huawei.hihealthservice.db.table.DBCommon
    public String getTableName() {
        return "hihealth_dataclient";
    }

    @Override // com.huawei.hihealthservice.db.table.DBCommon
    public String[] getColumns() {
        return new String[]{"_id", "client_uuid", "user_id", "device_id", "app_id", "cloud_device", "sync_status", "create_time", "need_uploaddata"};
    }

    public static ContentValues b(kym kymVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("client_uuid", UUID.randomUUID().toString());
        contentValues.put("user_id", Integer.valueOf(kymVar.i()));
        contentValues.put("device_id", Integer.valueOf(kymVar.d()));
        contentValues.put("app_id", Integer.valueOf(kymVar.b()));
        contentValues.put("sync_status", Integer.valueOf(kymVar.f()));
        contentValues.put("cloud_device", Long.valueOf(kymVar.e()));
        contentValues.put("create_time", Long.valueOf(System.currentTimeMillis()));
        contentValues.put("need_uploaddata", Integer.valueOf(kymVar.g()));
        return contentValues;
    }

    public static ContentValues e(kym kymVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("sync_status", Integer.valueOf(kymVar.f()));
        contentValues.put("cloud_device", Long.valueOf(kymVar.e()));
        contentValues.put("need_uploaddata", Integer.valueOf(kymVar.g()));
        return contentValues;
    }

    public static ContentValues d(kym kymVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("need_uploaddata", Integer.valueOf(kymVar.g()));
        return contentValues;
    }

    public static kym a(Cursor cursor) {
        if (cursor == null) {
            LogUtil.j("Debug_DBDataClient", "parseClientCursor query is null ");
            return null;
        }
        try {
            return cursor.moveToNext() ? c(cursor) : null;
        } catch (SQLiteDatabaseCorruptException e2) {
            ReleaseLogUtil.e("HiH_DBDataClient", "parseClientCursor SQLiteDatabaseCorruptException e: ", e2.getMessage());
            return null;
        } finally {
            cursor.close();
        }
    }

    public static List<kym> e(Cursor cursor) {
        if (cursor == null) {
            LogUtil.j("Debug_DBDataClient", "getHiHealthClientList query is null ");
            return null;
        }
        ArrayList arrayList = new ArrayList(10);
        while (cursor.moveToNext()) {
            try {
                try {
                    arrayList.add(c(cursor));
                } catch (SQLiteDatabaseCorruptException e2) {
                    ReleaseLogUtil.e("HiH_DBDataClient", "parseClientsListCursor SQLiteDatabaseCorruptException e: ", e2.getMessage());
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

    private static kym c(Cursor cursor) {
        kym kymVar = new kym();
        kymVar.a(cursor.getInt(cursor.getColumnIndex("_id")));
        kymVar.g(cursor.getInt(cursor.getColumnIndex("user_id")));
        kymVar.d(cursor.getInt(cursor.getColumnIndex("app_id")));
        kymVar.b(cursor.getInt(cursor.getColumnIndex("device_id")));
        kymVar.h(cursor.getInt(cursor.getColumnIndex("sync_status")));
        kymVar.d(cursor.getLong(cursor.getColumnIndex("cloud_device")));
        kymVar.e(cursor.getLong(cursor.getColumnIndex("create_time")));
        return kymVar;
    }

    public static List<Integer> b(Cursor cursor) {
        ArrayList arrayList = new ArrayList(10);
        if (cursor == null) {
            LogUtil.j("Debug_DBDataClient", "getHiHealthClientList query is null ");
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(10);
        while (cursor.moveToNext()) {
            try {
                try {
                    arrayList2.add(Integer.valueOf(cursor.getInt(cursor.getColumnIndex("_id"))));
                } catch (SQLiteException e2) {
                    ReleaseLogUtil.e("HiH_DBDataClient", "parseClientIDListCursor SQLiteDatabaseCorruptException e: ", e2.getMessage());
                    if (kwf.e(e2)) {
                        health.compact.a.hwlogsmodel.ReleaseLogUtil.a("HiH_DBDataClient", "parseAccountInfoCursor need to clean clone data", e2.getMessage());
                        KeyManager.a(false);
                    }
                    cursor.close();
                    return arrayList2;
                }
            } catch (Throwable th) {
                cursor.close();
                throw th;
            }
        }
        cursor.close();
        return arrayList2;
    }
}
