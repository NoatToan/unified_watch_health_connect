package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import com.huawei.hihealth.HiThirdIdentity;
import com.huawei.hihealthservice.db.table.DBCommon;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;

/* JADX INFO: loaded from: classes10.dex */
public class kux extends DBCommon {
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

    private kux() {
    }

    static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final kux f39533a = new kux();
    }

    public static kux b() {
        return d.f39533a;
    }

    public static String e() {
        StringBuilder sb = new StringBuilder(16);
        sb.append("create table  IF NOT EXISTS hihealth_identity(_id integer primary key not null,package_name text not null,fingerprint text not null,level integer not null,identity integer not null,create_time text ,modified_time text)");
        return sb.toString();
    }

    @Override // com.huawei.hihealthservice.db.table.DBCommon
    public String getTableName() {
        return "hihealth_identity";
    }

    @Override // com.huawei.hihealthservice.db.table.DBCommon
    public String[] getColumns() {
        return new String[]{"_id", "package_name", HiAnalyticsConstant.HaKey.BI_KEY_FINGERPRINT, "level", "identity", "create_time", "modified_time"};
    }

    public static ContentValues e(HiThirdIdentity hiThirdIdentity, boolean z) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("package_name", hiThirdIdentity.getPackageName());
        contentValues.put(HiAnalyticsConstant.HaKey.BI_KEY_FINGERPRINT, hiThirdIdentity.getFingerprint());
        contentValues.put("level", Integer.valueOf(hiThirdIdentity.getLevel()));
        contentValues.put("identity", Integer.valueOf(hiThirdIdentity.getIdentity()));
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (z) {
            contentValues.put("create_time", Long.valueOf(jCurrentTimeMillis));
        }
        contentValues.put("modified_time", Long.valueOf(jCurrentTimeMillis));
        return contentValues;
    }
}
