package defpackage;

import android.content.ContentValues;
import com.huawei.hihealthservice.db.table.DBPointCommon;

/* JADX INFO: loaded from: classes10.dex */
public class kve extends DBPointCommon {
    private kve() {
    }

    public static kve a() {
        return a.f39538c;
    }

    static class a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final kve f39538c = new kve();
    }

    @Override // com.huawei.hihealthservice.db.table.DBCommon
    public String getTableName() {
        return "sample_point_health_stress";
    }

    public static String e() {
        return getPointCreateTableSQL("sample_point_health_stress");
    }

    public static String c() {
        return getStartTimeIndexSQL("HealthStressPointIndex", "sample_point_health_stress");
    }

    public static ContentValues c(int i) {
        ContentValues contentValues = new ContentValues(2);
        contentValues.put("merged", Integer.valueOf(i));
        contentValues.put("modified_time", Long.valueOf(System.currentTimeMillis()));
        return contentValues;
    }
}
