package defpackage;

import com.huawei.hihealthservice.db.table.DBSessionCommon;

/* JADX INFO: loaded from: classes10.dex */
public class kvk extends DBSessionCommon {
    private kvk() {
    }

    static class b {
        private static final kvk e = new kvk();
    }

    public static kvk e() {
        return b.e;
    }

    public static String c() {
        return getSessionCreateTableSQL("sample_session_core");
    }

    public static String b() {
        return getSessionCommonIndexSQL("CoreSessionIndex", "sample_session_core");
    }

    @Override // com.huawei.hihealthservice.db.table.DBCommon
    public String getTableName() {
        return "sample_session_core";
    }
}
