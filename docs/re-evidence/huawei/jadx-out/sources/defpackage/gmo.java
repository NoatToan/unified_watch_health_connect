package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import com.google.gson.JsonSyntaxException;
import com.huawei.basefitnessadvice.model.Plan;
import com.huawei.health.plan.model.data.BaseDao;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.utils.StringUtils;

/* JADX INFO: loaded from: classes29.dex */
public class gmo extends BaseDao {
    public boolean a(String str, String str2, String str3, String str4) {
        gmc.g().deleteStorageData("plans", 1, "planId='" + str + "'");
        ContentValues contentValues = new ContentValues();
        contentValues.put("planId", str);
        contentValues.put("lan", StringUtils.c((Object) str2));
        contentValues.put("version", StringUtils.c((Object) str3));
        contentValues.put("content", str4);
        long jInsertStorageData = gmc.g().insertStorageData("plans", 1, contentValues);
        LogUtil.d("Suggestion_PlanDao", "insertPlan：", contentValues.toString());
        return jInsertStorageData > 0;
    }

    public boolean d(String str, String str2, String str3) {
        Cursor cursorRawQueryStorageData = null;
        try {
            cursorRawQueryStorageData = gmc.g().rawQueryStorageData(1, "select * from " + gmc.g().getTableFullName("plans") + " where planId=? and lan=? and version=?", new String[]{str, StringUtils.c((Object) str2), StringUtils.c((Object) str3)});
            return cursorRawQueryStorageData != null ? cursorRawQueryStorageData.moveToNext() : false;
        } catch (SQLiteException unused) {
            LogUtil.e("Suggestion_PlanDao", "SQLiteException isExistPlan");
            return false;
        } finally {
            if (cursorRawQueryStorageData != null) {
                cursorRawQueryStorageData.close();
            }
        }
    }

    public boolean d(String str, Plan plan, String str2) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("content", plan.toString());
        int iUpdateStorageData = gmc.g().updateStorageData("plans", 1, contentValues, "planId=? and lan=? and version=?", new String[]{plan.acquireId(), StringUtils.c((Object) str), StringUtils.c((Object) str2)});
        LogUtil.a("Suggestion_PlanDao", "update plan clock result:", Integer.valueOf(iUpdateStorageData));
        return iUpdateStorageData > 0;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x006f A[PHI: r4 r8
      0x006f: PHI (r4v3 com.huawei.basefitnessadvice.model.Plan) = 
      (r4v8 com.huawei.basefitnessadvice.model.Plan)
      (r4v11 com.huawei.basefitnessadvice.model.Plan)
      (r4v7 com.huawei.basefitnessadvice.model.Plan)
     binds: [B:19:0x006d, B:16:0x0062, B:9:0x0051] A[DONT_GENERATE, DONT_INLINE]
      0x006f: PHI (r8v7 android.database.Cursor) = (r8v5 android.database.Cursor), (r8v6 android.database.Cursor), (r8v8 android.database.Cursor) binds: [B:19:0x006d, B:16:0x0062, B:9:0x0051] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:27:0x007d  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r4v2 */
    public Plan e(String str, String str2, String str3) throws Throwable {
        Cursor cursorRawQueryStorageData;
        String str4 = "select * from " + gmc.g().getTableFullName("plans") + " where planId=? and lan=? and version=?";
        String[] strArr = {str, StringUtils.c((Object) str2), StringUtils.c((Object) str3)};
        ?? r4 = 0;
        plan = null;
        plan = null;
        plan = null;
        plan = null;
        plan = null;
        Plan plan = null;
        try {
            try {
                cursorRawQueryStorageData = gmc.g().rawQueryStorageData(1, str4, strArr);
                if (cursorRawQueryStorageData != null) {
                    try {
                        if (cursorRawQueryStorageData.moveToNext()) {
                            plan = (Plan) peh.b(cursorRawQueryStorageData.getString(cursorRawQueryStorageData.getColumnIndex("content")), Plan.class);
                        }
                    } catch (SQLiteException unused) {
                        LogUtil.e("Suggestion_PlanDao", "SQLiteException getPlan");
                        if (cursorRawQueryStorageData != null) {
                            cursorRawQueryStorageData.close();
                        }
                    } catch (JsonSyntaxException unused2) {
                        LogUtil.e("Suggestion_PlanDao", "JsonSyntaxException getPlan");
                        if (cursorRawQueryStorageData != null) {
                            cursorRawQueryStorageData.close();
                        }
                    }
                }
                if (cursorRawQueryStorageData != null) {
                    cursorRawQueryStorageData.close();
                }
            } catch (Throwable th) {
                th = th;
                r4 = strArr;
                if (r4 != 0) {
                    r4.close();
                }
                throw th;
            }
        } catch (SQLiteException unused3) {
            cursorRawQueryStorageData = null;
        } catch (JsonSyntaxException unused4) {
            cursorRawQueryStorageData = null;
        } catch (Throwable th2) {
            th = th2;
            if (r4 != 0) {
                r4.close();
            }
            throw th;
        }
        return plan == null ? e(str, str3) : plan;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0077  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r3v3 */
    private Plan e(String str, String str2) throws Throwable {
        Cursor cursorRawQueryStorageData;
        String str3 = "select * from " + gmc.g().getTableFullName("plans") + " where planId=? and version=?";
        String[] strArr = {str, StringUtils.c((Object) str2)};
        ?? r3 = 0;
        plan = null;
        Plan plan = null;
        try {
            try {
                cursorRawQueryStorageData = gmc.g().rawQueryStorageData(1, str3, strArr);
                if (cursorRawQueryStorageData != null) {
                    try {
                        if (cursorRawQueryStorageData.moveToNext()) {
                            plan = (Plan) peh.b(cursorRawQueryStorageData.getString(cursorRawQueryStorageData.getColumnIndex("content")), Plan.class);
                        }
                    } catch (SQLiteException unused) {
                        LogUtil.e("Suggestion_PlanDao", "SQLiteException getExistPlan");
                        if (cursorRawQueryStorageData != null) {
                            cursorRawQueryStorageData.close();
                        }
                        return null;
                    } catch (JsonSyntaxException unused2) {
                        LogUtil.e("Suggestion_PlanDao", "JsonSyntaxException getExistPlan");
                        if (cursorRawQueryStorageData != null) {
                            cursorRawQueryStorageData.close();
                        }
                        return null;
                    }
                }
                if (cursorRawQueryStorageData != null) {
                    cursorRawQueryStorageData.close();
                }
                return plan;
            } catch (Throwable th) {
                r3 = strArr;
                th = th;
                if (r3 != 0) {
                    r3.close();
                }
                throw th;
            }
        } catch (SQLiteException unused3) {
            cursorRawQueryStorageData = null;
        } catch (JsonSyntaxException unused4) {
            cursorRawQueryStorageData = null;
        } catch (Throwable th2) {
            th = th2;
            if (r3 != 0) {
                r3.close();
            }
            throw th;
        }
    }
}
