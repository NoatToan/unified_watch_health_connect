package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import com.huawei.hihealthservice.db.helper.HiHealthDBHelper;
import com.huawei.hihealthservice.db.table.DBCommon;
import health.compact.a.LogAnonymous;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import net.zetetic.database.sqlcipher.SQLiteDatabase;

/* JADX INFO: loaded from: classes10.dex */
public class kuq extends DBCommon {
    @Override // com.huawei.hihealthservice.db.table.DBCommon
    public /* bridge */ /* synthetic */ int delete(String str, String[] strArr) {
        return super.delete(str, strArr);
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
    public /* bridge */ /* synthetic */ int update(ContentValues contentValues, String str, String[] strArr) {
        return super.update(contentValues, str, strArr);
    }

    private kuq() {
    }

    public static kuq e() {
        return e.f39529b;
    }

    static class e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final kuq f39529b = new kuq();
    }

    public static String a() {
        return kwm.c("config_data");
    }

    public static String c() {
        return kwm.d("configdataIndex", "config_data");
    }

    @Override // com.huawei.hihealthservice.db.table.DBCommon
    public String getTableName() {
        return "config_data";
    }

    @Override // com.huawei.hihealthservice.db.table.DBCommon
    public String[] getColumns() {
        return kwm.a();
    }

    public long d(String str, ContentValues contentValues) {
        SQLiteDatabase writableDatabase = HiHealthDBHelper.d().getWritableDatabase();
        if (writableDatabase != null) {
            return writableDatabase.insert(str, (String) null, contentValues);
        }
        return -1000L;
    }

    public int e(String str, String str2, String[] strArr) {
        SQLiteDatabase writableDatabase = HiHealthDBHelper.d().getWritableDatabase();
        if (writableDatabase != null) {
            return writableDatabase.delete(str, str2, strArr);
        }
        return -1000;
    }

    public int a(String str, ContentValues contentValues, String str2, String[] strArr) {
        SQLiteDatabase writableDatabase = HiHealthDBHelper.d().getWritableDatabase();
        if (writableDatabase != null) {
            return writableDatabase.update(str, contentValues, str2, strArr);
        }
        return -1000;
    }

    public Cursor d(String str, String str2, String[] strArr, String str3, String str4, String str5) {
        SQLiteDatabase writableDatabase = HiHealthDBHelper.d().getWritableDatabase();
        if (writableDatabase != null) {
            return writableDatabase.query(str, getColumns(), str2, strArr, str3, str4, str5);
        }
        return null;
    }

    @Override // com.huawei.hihealthservice.db.table.DBCommon
    public Cursor rawQuery(String str, String[] strArr) {
        SQLiteDatabase writableDatabase = HiHealthDBHelper.d().getWritableDatabase();
        if (writableDatabase != null) {
            return writableDatabase.rawQuery(str, strArr);
        }
        return null;
    }

    @Override // com.huawei.hihealthservice.db.table.DBCommon
    public void execSQL(String str, Object[] objArr) {
        try {
            SQLiteDatabase writableDatabase = HiHealthDBHelper.d().getWritableDatabase();
            if (writableDatabase != null) {
                writableDatabase.execSQL(str, objArr);
            }
        } catch (SQLiteException e2) {
            ReleaseLogUtil.a("HiH_DBConfigData", "ClearAllInfo SQLiteException!", LogAnonymous.b(e2));
        } catch (Exception e3) {
            ReleaseLogUtil.a("HiH_DBConfigData", "ClearAllInfo Exception!", LogAnonymous.b(e3));
        }
    }
}
