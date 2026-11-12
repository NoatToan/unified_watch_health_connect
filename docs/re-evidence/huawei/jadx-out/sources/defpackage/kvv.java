package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteException;
import com.huawei.hihealth.HiUserPreference;
import com.huawei.hihealth.util.ReleaseLogUtil;
import com.huawei.hihealthservice.db.table.DBCommon;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginachievement.manager.model.MedalConstants;
import health.compact.a.KeyManager;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class kvv extends DBCommon {
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

    private kvv() {
    }

    static class c {
        private static final kvv e = new kvv();
    }

    public static kvv b() {
        return c.e;
    }

    public static String c() {
        StringBuilder sb = new StringBuilder(16);
        sb.append("create table  IF NOT EXISTS user_preference(_id integer primary key not null,key text not null,value text not null,user_id integer not null,sync_status integer not null,create_time integer not null,modified_time integer not null)");
        return sb.toString();
    }

    public static String e() {
        StringBuilder sb = new StringBuilder(16);
        sb.append(" CREATE INDEX UserPreferenceIndex ON user_preference(user_id,key)");
        return sb.toString();
    }

    @Override // com.huawei.hihealthservice.db.table.DBCommon
    public String getTableName() {
        return "user_preference";
    }

    @Override // com.huawei.hihealthservice.db.table.DBCommon
    public String[] getColumns() {
        return new String[]{"_id", MedalConstants.EVENT_KEY, "value", "user_id", "sync_status", "create_time", "modified_time"};
    }

    public static ContentValues b(HiUserPreference hiUserPreference) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(MedalConstants.EVENT_KEY, hiUserPreference.getKey());
        contentValues.put("value", hiUserPreference.getValue());
        contentValues.put("user_id", Integer.valueOf(hiUserPreference.getUserId()));
        contentValues.put("sync_status", Integer.valueOf(hiUserPreference.getSyncStatus()));
        contentValues.put("create_time", Long.valueOf(System.currentTimeMillis()));
        contentValues.put("modified_time", Long.valueOf(hiUserPreference.getModifiedTime()));
        return contentValues;
    }

    public static ContentValues a(HiUserPreference hiUserPreference) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("value", hiUserPreference.getValue());
        contentValues.put("sync_status", Integer.valueOf(hiUserPreference.getSyncStatus()));
        contentValues.put("modified_time", Long.valueOf(hiUserPreference.getModifiedTime()));
        return contentValues;
    }

    public static List<HiUserPreference> b(Cursor cursor) {
        if (cursor == null) {
            LogUtil.j("Debug_DBUserPreference", "parseUserPreferencesCursor cursor is null!");
            return null;
        }
        ArrayList arrayList = new ArrayList(10);
        while (cursor.moveToNext()) {
            try {
                try {
                    arrayList.add(d(cursor));
                } catch (SQLiteDatabaseCorruptException e) {
                    ReleaseLogUtil.e("HiH_DBUserPreference", "parseUserPreferencesCursor SQLiteDatabaseCorruptException e: ", e.getMessage());
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

    public static HiUserPreference c(Cursor cursor) {
        if (cursor == null) {
            LogUtil.j("Debug_DBUserPreference", "parseUserPreferenceCursor cursor is null!");
            return null;
        }
        try {
            return cursor.moveToNext() ? d(cursor) : null;
        } catch (SQLiteException e) {
            if (kwf.e(e)) {
                health.compact.a.hwlogsmodel.ReleaseLogUtil.a("HiH_DBUserPreference", "parseAccountInfoCursor need to clean clone data", e.getMessage());
                KeyManager.a(false);
            }
            return null;
        } catch (SQLiteDatabaseCorruptException e2) {
            ReleaseLogUtil.e("HiH_DBUserPreference", "parseUserPreferenceCursor SQLiteDatabaseCorruptException e: ", e2.getMessage());
            return null;
        } finally {
            cursor.close();
        }
    }

    private static HiUserPreference d(Cursor cursor) {
        HiUserPreference hiUserPreference = new HiUserPreference();
        hiUserPreference.setId(cursor.getInt(cursor.getColumnIndex("_id")));
        hiUserPreference.setKey(cursor.getString(cursor.getColumnIndex(MedalConstants.EVENT_KEY)));
        hiUserPreference.setValue(cursor.getString(cursor.getColumnIndex("value")));
        hiUserPreference.setUserId(cursor.getInt(cursor.getColumnIndex("user_id")));
        hiUserPreference.setSyncStatus(cursor.getInt(cursor.getColumnIndex("sync_status")));
        hiUserPreference.setCreateTime(cursor.getLong(cursor.getColumnIndex("create_time")));
        hiUserPreference.setModifiedTime(cursor.getLong(cursor.getColumnIndex("modified_time")));
        return hiUserPreference;
    }
}
