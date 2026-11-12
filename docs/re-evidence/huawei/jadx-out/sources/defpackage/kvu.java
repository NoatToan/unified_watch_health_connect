package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealthservice.db.table.DBCommon;
import com.huawei.hwlogsmodel.LogUtil;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class kvu extends DBCommon {
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

    private kvu() {
    }

    static class a {
        private static final kvu d = new kvu();
    }

    public static kvu a() {
        return a.d;
    }

    public static String d() {
        StringBuilder sb = new StringBuilder(16);
        sb.append("create table  IF NOT EXISTS business_data_relation(_id integer primary key not null,business_type integer not null,business_id integer not null,relation_type integer not null,relation_id integer not null)");
        return sb.toString();
    }

    public static String c() {
        StringBuilder sb = new StringBuilder(16);
        sb.append(" CREATE INDEX BusinessRelationIndex ON business_data_relation(business_type,business_id,relation_type,relation_id)");
        return sb.toString();
    }

    @Override // com.huawei.hihealthservice.db.table.DBCommon
    public String getTableName() {
        return "business_data_relation";
    }

    @Override // com.huawei.hihealthservice.db.table.DBCommon
    public String[] getColumns() {
        return new String[]{"_id", "business_type", "business_id", "relation_type", "relation_id"};
    }

    public static ContentValues e(int i, long j, int i2, long j2) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("business_type", Integer.valueOf(i));
        contentValues.put("business_id", Long.valueOf(j));
        contentValues.put("relation_type", Integer.valueOf(i2));
        contentValues.put("relation_id", Long.valueOf(j2));
        return contentValues;
    }

    public static List<HiHealthData> e(Cursor cursor) {
        int[] iArr = null;
        if (cursor == null) {
            LogUtil.j("HiH_DbBusinessDataRelation", "parseBusinessRelationList() Cursor query == null");
            return null;
        }
        ArrayList arrayList = new ArrayList(10);
        while (cursor.moveToNext()) {
            try {
                if (iArr == null) {
                    String[] strArr = {"_id", "business_type", "business_id", "relation_type", "relation_id"};
                    int[] iArr2 = new int[5];
                    for (int i = 0; i < 5; i++) {
                        iArr2[i] = cursor.getColumnIndex(strArr[i]);
                    }
                    iArr = iArr2;
                }
                HiHealthData hiHealthData = new HiHealthData();
                hiHealthData.setDataId(cursor.getLong(iArr[0]));
                hiHealthData.putInt("business_type", cursor.getInt(iArr[1]));
                hiHealthData.putInt("business_id", cursor.getInt(iArr[2]));
                hiHealthData.putInt("relation_type", cursor.getInt(iArr[3]));
                hiHealthData.putInt("relation_id", cursor.getInt(iArr[4]));
                arrayList.add(hiHealthData);
            } catch (Throwable th) {
                cursor.close();
                throw th;
            }
        }
        cursor.close();
        return arrayList;
    }
}
