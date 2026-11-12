package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteException;
import com.huawei.hihealth.data.type.HealthSyncCategory;
import com.huawei.hihealthservice.db.table.DBCommon;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.LogAnonymous;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.List;
import net.zetetic.database.sqlcipher.SQLiteDatabase;

/* JADX INFO: loaded from: classes10.dex */
public class kvo extends DBCommon {
    private static final String[] d = {"cloud_code", "main_user_id", "sync_data_type", "sync_type_version", "sync_type_time", "modify_time", "sync_data_category"};

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

    private kvo() {
    }

    static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final kvo f39543a = new kvo();
    }

    public static kvo c() {
        return c.f39543a;
    }

    @Override // com.huawei.hihealthservice.db.table.DBCommon
    public String getTableName() {
        return "sync_anchor";
    }

    @Override // com.huawei.hihealthservice.db.table.DBCommon
    public String[] getColumns() {
        return d;
    }

    public static String e() {
        StringBuilder sb = new StringBuilder(16);
        sb.append("create table  IF NOT EXISTS sync_anchor(_id integer primary key not null,cloud_code integer not null,main_user_id integer not null,sync_data_type integer not null,sync_data_category integer not null,sync_type_version integer not null,sync_type_time integer not null,modify_time integer not null)");
        return sb.toString();
    }

    public static String b() {
        StringBuilder sb = new StringBuilder(16);
        sb.append(" CREATE INDEX SyncTypeIndex ON sync_anchor(cloud_code,main_user_id,sync_data_type)");
        return sb.toString();
    }

    public static kul a(Cursor cursor) {
        kul kulVar;
        SQLiteException e;
        kul kulVar2 = null;
        if (cursor == null) {
            LogUtil.j("Debug_DBSyncAnchor", "parseSyncAnchorTableCursor query is null!");
            return null;
        }
        try {
            try {
                if (cursor.moveToNext()) {
                    kulVar = new kul();
                    try {
                        kulVar.a(cursor.getInt(cursor.getColumnIndex("main_user_id")));
                        kulVar.a(cursor.getLong(cursor.getColumnIndex("cloud_code")));
                        kulVar.d(cursor.getInt(cursor.getColumnIndex("sync_data_type")));
                        kulVar.e(cursor.getLong(cursor.getColumnIndex("sync_type_version")));
                        kulVar.e(cursor.getInt(cursor.getColumnIndex("sync_type_time")));
                        kulVar.b(cursor.getInt(cursor.getColumnIndex("sync_data_category")));
                        kulVar2 = kulVar;
                    } catch (SQLiteException e2) {
                        e = e2;
                        ReleaseLogUtil.a("Debug_DBSyncAnchor", "parseSyncAnchorTableCursor() sqLiteException", LogAnonymous.b(e));
                        return kulVar;
                    }
                }
                return kulVar2;
            } catch (SQLiteException e3) {
                kulVar = null;
                e = e3;
            }
        } finally {
            cursor.close();
        }
    }

    public static List<kul> c(Cursor cursor) {
        ArrayList arrayList = new ArrayList(10);
        if (cursor == null) {
            LogUtil.j("Debug_DBSyncAnchor", "parseSyncAnchorTableCursor query is null!");
            return arrayList;
        }
        while (cursor.moveToNext()) {
            try {
                try {
                    kul kulVar = new kul();
                    kulVar.a(cursor.getInt(cursor.getColumnIndex("main_user_id")));
                    kulVar.a(cursor.getLong(cursor.getColumnIndex("cloud_code")));
                    kulVar.d(cursor.getInt(cursor.getColumnIndex("sync_data_type")));
                    kulVar.e(cursor.getLong(cursor.getColumnIndex("sync_type_version")));
                    kulVar.e(cursor.getInt(cursor.getColumnIndex("sync_type_time")));
                    kulVar.b(cursor.getInt(cursor.getColumnIndex("sync_data_category")));
                    arrayList.add(kulVar);
                } catch (SQLiteDatabaseCorruptException e) {
                    ReleaseLogUtil.a("Debug_DBSyncAnchor", "parseLocalVerisonCursor() SQLiteDatabaseCorruptException", LogAnonymous.b(e));
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

    public static void a(SQLiteDatabase sQLiteDatabase) {
        try {
            List<kul> listC = c(sQLiteDatabase.query("sync_anchor", d, null, null, null, null, null));
            if (njy.e(listC)) {
                return;
            }
            for (kul kulVar : listC) {
                kulVar.b(HealthSyncCategory.a(kulVar.b()));
                sQLiteDatabase.update("sync_anchor", kvw.e(kulVar), "main_user_id =? and cloud_code =? and sync_data_type =? ", new String[]{Integer.toString(kulVar.e()), Long.toString(kulVar.a()), Integer.toString(kulVar.b())});
            }
        } catch (SQLiteException e) {
            ReleaseLogUtil.a("Debug_DBSyncAnchor", "update SQLiteException!", LogAnonymous.b(e));
        } catch (Exception e2) {
            ReleaseLogUtil.a("Debug_DBSyncAnchor", "update Exception!", LogAnonymous.b(e2));
        }
    }
}
