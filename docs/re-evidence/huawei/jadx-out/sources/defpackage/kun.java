package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import com.huawei.hihealth.HiAppInfo;
import com.huawei.hihealthservice.db.table.DBCommon;
import com.huawei.hwlogsmodel.LogUtil;
import com.tencent.open.SocialOperation;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class kun extends DBCommon {
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

    private kun() {
    }

    static class a {
        private static final kun e = new kun();
    }

    public static kun b() {
        return a.e;
    }

    public static String a() {
        StringBuilder sb = new StringBuilder(16);
        sb.append("create table  IF NOT EXISTS hihealth_app(_id integer primary key not null,package_name text not null,app_name text ,version text ,signature text ,cloud_code integer not null,sync_status integer not null,createTime text not null)");
        return sb.toString();
    }

    public static String e() {
        StringBuilder sb = new StringBuilder(16);
        sb.append(" CREATE INDEX AppInfoIndex ON hihealth_app(_id,package_name)");
        return sb.toString();
    }

    @Override // com.huawei.hihealthservice.db.table.DBCommon
    public String[] getColumns() {
        return new String[]{"_id", "package_name", "app_name", "version", SocialOperation.GAME_SIGNATURE, "cloud_code", "sync_status", "createTime"};
    }

    @Override // com.huawei.hihealthservice.db.table.DBCommon
    public String getTableName() {
        return "hihealth_app";
    }

    public static ContentValues b(HiAppInfo hiAppInfo, int i) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("package_name", hiAppInfo.getPackageName());
        contentValues.put("app_name", hiAppInfo.getAppName());
        contentValues.put("version", hiAppInfo.getVersion());
        contentValues.put(SocialOperation.GAME_SIGNATURE, hiAppInfo.getSignature());
        contentValues.put("cloud_code", Long.valueOf(hiAppInfo.getCloudCode()));
        contentValues.put("sync_status", Integer.valueOf(i));
        contentValues.put("createTime", Long.valueOf(System.currentTimeMillis()));
        return contentValues;
    }

    public static HiAppInfo d(Cursor cursor) {
        HiAppInfo hiAppInfo = null;
        if (cursor == null) {
            LogUtil.j("Debug_DBAppInfo", "parseAppInfoCursor query is null ");
            return null;
        }
        try {
            if (cursor.moveToNext()) {
                hiAppInfo = new HiAppInfo();
                hiAppInfo.setAppId(cursor.getInt(cursor.getColumnIndex("_id")));
                hiAppInfo.setPackageName(cursor.getString(cursor.getColumnIndex("package_name")));
                hiAppInfo.setAppName(cursor.getString(cursor.getColumnIndex("app_name")));
                hiAppInfo.setVersion(cursor.getString(cursor.getColumnIndex("version")));
                hiAppInfo.setSignature(cursor.getString(cursor.getColumnIndex(SocialOperation.GAME_SIGNATURE)));
            }
            return hiAppInfo;
        } finally {
            cursor.close();
        }
    }

    public static List<HiAppInfo> e(Cursor cursor) {
        int[] iArr = null;
        if (cursor == null) {
            return null;
        }
        LogUtil.a("Debug_DBAppInfo", "parseAllAppInfoCursor queryCursor is not null ");
        ArrayList arrayList = new ArrayList(10);
        while (cursor.moveToNext()) {
            try {
                if (iArr == null) {
                    String[] strArr = {"_id", "package_name", "app_name", "version", SocialOperation.GAME_SIGNATURE};
                    int[] iArr2 = new int[5];
                    for (int i = 0; i < 5; i++) {
                        iArr2[i] = cursor.getColumnIndex(strArr[i]);
                    }
                    iArr = iArr2;
                }
                HiAppInfo hiAppInfo = new HiAppInfo();
                hiAppInfo.setAppId(cursor.getInt(iArr[0]));
                hiAppInfo.setPackageName(cursor.getString(iArr[1]));
                hiAppInfo.setAppName(cursor.getString(iArr[2]));
                hiAppInfo.setVersion(cursor.getString(iArr[3]));
                hiAppInfo.setSignature(cursor.getString(iArr[4]));
                arrayList.add(hiAppInfo);
            } catch (Throwable th) {
                cursor.close();
                throw th;
            }
        }
        cursor.close();
        return arrayList;
    }
}
