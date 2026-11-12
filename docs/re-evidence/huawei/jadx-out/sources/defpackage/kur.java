package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import com.huawei.hihealth.HiAccountInfo;
import com.huawei.hihealthservice.db.table.DBCommon;
import com.huawei.hwlogsmodel.LogUtil;
import com.tencent.connect.common.Constants;
import health.compact.a.KeyManager;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;

/* JADX INFO: loaded from: classes10.dex */
public class kur extends DBCommon {
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

    private kur() {
    }

    static class a {
        private static final kur e = new kur();
    }

    public static kur d() {
        return a.e;
    }

    public static String a() {
        StringBuilder sb = new StringBuilder(16);
        sb.append("create table  IF NOT EXISTS hihealth_account(_id integer primary key not null,huid text not null,app_id integer not null,user_name text,access_token text,service_token text,third_open_id text,third_token text,site_id integer,expires_in integer,is_login integer,type integer,create_time integer)");
        return sb.toString();
    }

    @Override // com.huawei.hihealthservice.db.table.DBCommon
    public String getTableName() {
        return "hihealth_account";
    }

    @Override // com.huawei.hihealthservice.db.table.DBCommon
    public String[] getColumns() {
        return new String[]{"huid", "app_id", "user_name", Constants.PARAM_ACCESS_TOKEN, "service_token", "third_open_id", "third_token", "site_id", Constants.PARAM_EXPIRES_IN, "is_login", "type", "create_time"};
    }

    public static ContentValues c(HiAccountInfo hiAccountInfo) {
        ContentValues contentValues = new ContentValues(12);
        contentValues.put("huid", hiAccountInfo.getHuid());
        contentValues.put("app_id", Integer.valueOf(hiAccountInfo.getAppId()));
        contentValues.put("user_name", hiAccountInfo.getUserName());
        contentValues.put(Constants.PARAM_ACCESS_TOKEN, hiAccountInfo.getAccessToken());
        contentValues.put("service_token", hiAccountInfo.getServiceToken());
        contentValues.put("third_open_id", hiAccountInfo.getThirdOpenId());
        contentValues.put("third_token", hiAccountInfo.getThirdToken());
        contentValues.put("site_id", Integer.valueOf(hiAccountInfo.getSiteId()));
        contentValues.put(Constants.PARAM_EXPIRES_IN, Long.valueOf(hiAccountInfo.getExpiresIn()));
        contentValues.put("is_login", Integer.valueOf(hiAccountInfo.getIsLogin()));
        contentValues.put("type", Integer.valueOf(hiAccountInfo.getType()));
        contentValues.put("create_time", Long.valueOf(System.currentTimeMillis()));
        return contentValues;
    }

    public static HiAccountInfo a(Cursor cursor) {
        HiAccountInfo hiAccountInfo;
        SQLiteException e;
        HiAccountInfo hiAccountInfo2 = null;
        if (cursor == null) {
            LogUtil.j("Debug_DBAccountInfo", "parseAccountInfoCursor query is null!");
            return null;
        }
        try {
            try {
                if (cursor.moveToNext()) {
                    hiAccountInfo = new HiAccountInfo();
                    try {
                        hiAccountInfo.setHuid(cursor.getString(cursor.getColumnIndex("huid")));
                        hiAccountInfo.setAppId(cursor.getInt(cursor.getColumnIndex("app_id")));
                        hiAccountInfo.setUserName(cursor.getString(cursor.getColumnIndex("user_name")));
                        hiAccountInfo.setAccessToken(cursor.getString(cursor.getColumnIndex(Constants.PARAM_ACCESS_TOKEN)));
                        hiAccountInfo.setServiceToken(cursor.getString(cursor.getColumnIndex("service_token")));
                        hiAccountInfo.setThirdOpenId(cursor.getString(cursor.getColumnIndex("third_open_id")));
                        hiAccountInfo.setThirdToken(cursor.getString(cursor.getColumnIndex("third_token")));
                        hiAccountInfo.setSiteId(cursor.getInt(cursor.getColumnIndex("site_id")));
                        hiAccountInfo.setExpiresIn(cursor.getInt(cursor.getColumnIndex(Constants.PARAM_EXPIRES_IN)));
                        hiAccountInfo.setLogin(cursor.getInt(cursor.getColumnIndex("is_login")));
                        hiAccountInfo.setType(cursor.getInt(cursor.getColumnIndex("type")));
                        hiAccountInfo2 = hiAccountInfo;
                    } catch (SQLiteException e2) {
                        e = e2;
                        if (kwf.e(e)) {
                            ReleaseLogUtil.a("HiH_DBAccountInfo", "parseAccountInfoCursor need to clean clone data", e.getMessage());
                            KeyManager.a(false);
                        }
                        return hiAccountInfo;
                    }
                }
                return hiAccountInfo2;
            } finally {
                cursor.close();
            }
        } catch (SQLiteException e3) {
            hiAccountInfo = null;
            e = e3;
        }
    }
}
