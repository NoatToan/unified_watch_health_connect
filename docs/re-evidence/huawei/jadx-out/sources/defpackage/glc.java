package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.huawei.health.plan.model.PlanStat;
import com.huawei.health.plan.model.data.BaseDao;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.JsbMapKeyNames;
import health.compact.a.DbManager;
import health.compact.a.LogAnonymous;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import health.compact.a.utils.StringUtils;

/* JADX INFO: loaded from: classes29.dex */
public class glc extends BaseDao {
    private boolean a(int i, int i2) {
        return i == i2;
    }

    public static class c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final int[] f35617c = {4, 0, 1, 2, 3, 7};

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final int[] f35616b = {6, 8, 11};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final int[] f35615a = {5, 9, 10};
    }

    public boolean d(String str, String str2, int i, int i2) throws Throwable {
        int iC = c(str, str2, i, Integer.valueOf(i2), 1);
        if (iC >= 0) {
            int iB = b(str, null, i);
            if (i2 != 0 && (iB == 0 || i2 < iB)) {
                c(str, null, i, Integer.valueOf(i2), 1);
            }
        }
        return iC >= 0;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0095  */
    public void d(String str, String str2, PlanStat planStat) throws Throwable {
        boolean z;
        if (planStat == null) {
            return;
        }
        boolean z2 = false;
        try {
            if (DbManager.i(String.valueOf(fga.b()))) {
                z = false;
            } else {
                gmc.g().h();
                z = true;
            }
            for (int i = 0; i < 12; i++) {
                try {
                    int iC = c(str, str2, i, planStat.getValue(str2, i), 0);
                    if (iC >= 0 && i == 11) {
                        if (iC == 0) {
                            e(str, str2, 12, StringUtils.c(planStat.getValue(str2, 12)), 0);
                        } else {
                            b(str, str2, 12, StringUtils.c(planStat.getValue(str2, 12)), 0);
                        }
                    }
                } catch (SQLiteException e) {
                    e = e;
                    try {
                        ReleaseLogUtil.a("Suggestion_BestRecordDao", "SQLiteDatabaseLockedException:", LogAnonymous.b(e));
                        if (z) {
                            gmc.g().f();
                            return;
                        }
                        return;
                    } catch (Throwable th) {
                        th = th;
                        z2 = z;
                        z = z2;
                        if (z) {
                            gmc.g().f();
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (z) {
                        gmc.g().f();
                    }
                    throw th;
                }
            }
            if (z) {
                gmc.g().f();
            }
        } catch (SQLiteException e2) {
            e = e2;
            z = false;
        } catch (Throwable th3) {
            th = th3;
            z = z2;
            if (z) {
                gmc.g().f();
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00aa  */
    public void a(String str, String str2, PlanStat planStat) throws Throwable {
        boolean z;
        int i;
        LogUtil.d("Suggestion_BestRecordDao", "update best record: userId", str, " planId:", str2);
        if (planStat == null) {
            return;
        }
        boolean z2 = false;
        try {
            if (DbManager.i(String.valueOf(fga.b()))) {
                i = 0;
                z = false;
            } else {
                gmc.g().h();
                z = true;
                i = 0;
            }
            while (i < 12) {
                try {
                    int iC = c(str, str2, i, planStat.getValue(str2, i), 1);
                    if (iC >= 0 && i == 11) {
                        if (iC == 0) {
                            e(str, str2, 12, StringUtils.c(planStat.getValue(str2, 12)), 1);
                        } else {
                            b(str, str2, 12, StringUtils.c(planStat.getValue(str2, 12)), 1);
                        }
                    }
                    i++;
                } catch (SQLiteException e) {
                    e = e;
                    try {
                        ReleaseLogUtil.a("Suggestion_BestRecordDao", "SQLiteDatabaseLockedException:", LogAnonymous.b(e));
                        if (z) {
                            gmc.g().f();
                            return;
                        }
                        return;
                    } catch (Throwable th) {
                        th = th;
                        z2 = z;
                        z = z2;
                        if (z) {
                            gmc.g().f();
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (z) {
                        gmc.g().f();
                    }
                    throw th;
                }
            }
            if (z) {
                gmc.g().f();
            }
        } catch (SQLiteException e2) {
            e = e2;
            z = false;
        } catch (Throwable th3) {
            th = th3;
            z = z2;
            if (z) {
                gmc.g().f();
            }
            throw th;
        }
    }

    public void c(String str, String str2) {
        LogUtil.d("Suggestion_BestRecordDao", "delete best record：userId", str, " planId:", str2);
        gmc.g().deleteStorageData("best_record", 1, "planId=? and userId=?", new String[]{StringUtils.c((Object) str2), StringUtils.c((Object) str)});
    }

    public void b(String str, String str2) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("status", (Integer) 0);
        gmc.g().updateStorageData("best_record", 1, contentValues, "( planId=? OR planId='' ) AND userId=?", new String[]{StringUtils.c((Object) str2), StringUtils.c((Object) str)});
        LogUtil.d("Suggestion_BestRecordDao", "update best record: ", contentValues.toString());
    }

    public PlanStat d(String str, String str2) {
        PlanStat planStat = new PlanStat();
        String str3 = "select planId,type,value from " + gmc.g().getTableFullName("best_record") + " where  planId=? and userId=?";
        String[] strArr = {StringUtils.c((Object) str2), StringUtils.c((Object) str)};
        Cursor cursorRawQueryStorageData = null;
        try {
            try {
                cursorRawQueryStorageData = gmc.g().rawQueryStorageData(1, str3, strArr);
                if (cursorRawQueryStorageData != null) {
                    while (cursorRawQueryStorageData.moveToNext()) {
                        String string = cursorRawQueryStorageData.getString(cursorRawQueryStorageData.getColumnIndex("planId"));
                        int i = cursorRawQueryStorageData.getInt(cursorRawQueryStorageData.getColumnIndex("type"));
                        String string2 = cursorRawQueryStorageData.getString(cursorRawQueryStorageData.getColumnIndex("value"));
                        if (!TextUtils.isEmpty(string2)) {
                            planStat.setValue(string, i, string2);
                        }
                    }
                }
                if (cursorRawQueryStorageData != null) {
                    return planStat;
                }
            } catch (SQLiteException e) {
                LogUtil.e("Suggestion_BestRecordDao", LogAnonymous.b(e));
            }
            return planStat;
        } finally {
            if (cursorRawQueryStorageData != null) {
                cursorRawQueryStorageData.close();
            }
        }
    }

    public PlanStat e(String str, String str2) throws Throwable {
        SQLiteException e;
        PlanStat planStat;
        Throwable th;
        Cursor cursorRawQueryStorageData;
        String str3 = "SELECT planId,type,value FROM " + gmc.g().getTableFullName("best_record") + " WHERE ( planId=? OR planId='' ) AND userId=? AND status=1";
        String[] strArr = {StringUtils.c((Object) str2), StringUtils.c((Object) str)};
        Cursor cursor = null;
        planStat = null;
        PlanStat planStat2 = null;
        cursor = null;
        try {
            try {
                cursorRawQueryStorageData = gmc.g().rawQueryStorageData(1, str3, strArr);
                if (cursorRawQueryStorageData != null) {
                    while (cursorRawQueryStorageData.moveToNext()) {
                        try {
                            if (planStat2 == null) {
                                planStat2 = new PlanStat();
                            }
                            String string = cursorRawQueryStorageData.getString(cursorRawQueryStorageData.getColumnIndex("planId"));
                            int i = cursorRawQueryStorageData.getInt(cursorRawQueryStorageData.getColumnIndex("type"));
                            String string2 = cursorRawQueryStorageData.getString(cursorRawQueryStorageData.getColumnIndex("value"));
                            if (!TextUtils.isEmpty(string2)) {
                                planStat2.setValue(string, i, string2);
                            }
                        } catch (SQLiteException e2) {
                            e = e2;
                            PlanStat planStat3 = planStat2;
                            cursor = cursorRawQueryStorageData;
                            planStat = planStat3;
                            LogUtil.e("Suggestion_BestRecordDao", LogAnonymous.b(e));
                            if (cursor != null) {
                                cursor.close();
                            }
                            return planStat;
                        } catch (Throwable th2) {
                            th = th2;
                            if (cursorRawQueryStorageData != null) {
                                cursorRawQueryStorageData.close();
                            }
                            throw th;
                        }
                    }
                }
                if (cursorRawQueryStorageData != null) {
                    cursorRawQueryStorageData.close();
                }
                return planStat2;
            } catch (Throwable th3) {
                Cursor cursor2 = cursor;
                th = th3;
                cursorRawQueryStorageData = cursor2;
            }
        } catch (SQLiteException e3) {
            e = e3;
            planStat = null;
        }
    }

    public boolean a(String str, String str2) {
        String str3 = "select type from " + gmc.g().getTableFullName("best_record") + " where ( planId=? OR planId='' ) AND userId=? and status=1";
        String[] strArr = {StringUtils.c((Object) str2), StringUtils.c((Object) str)};
        boolean zMoveToNext = false;
        Cursor cursorRawQueryStorageData = null;
        try {
            cursorRawQueryStorageData = gmc.g().rawQueryStorageData(1, str3, strArr);
            if (cursorRawQueryStorageData != null) {
                zMoveToNext = cursorRawQueryStorageData.moveToNext();
                cursorRawQueryStorageData.close();
            }
            return zMoveToNext;
        } catch (SQLiteException e) {
            LogUtil.e("Suggestion_BestRecordDao", LogAnonymous.b(e));
            return zMoveToNext;
        } finally {
            if (cursorRawQueryStorageData != null) {
                cursorRawQueryStorageData.close();
            }
        }
    }

    private int e(String str, String str2, int i, Object obj, int i2) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("planId", StringUtils.c((Object) str2));
        contentValues.put(JsbMapKeyNames.H5_USER_ID, StringUtils.c((Object) str));
        contentValues.put("type", Integer.valueOf(i));
        contentValues.put("value", StringUtils.c(obj));
        contentValues.put("status", Integer.valueOf(i2));
        gmc.g().insertStorageData("best_record", 1, contentValues);
        LogUtil.d("Suggestion_BestRecordDao", "insert best record: ", contentValues.toString());
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0070  */
    private String a(String str, String str2, int i) throws Throwable {
        SQLiteException e;
        Cursor cursorRawQueryStorageData;
        String str3 = "select value from " + gmc.g().getTableFullName("best_record") + " where  planId=? and userId=? and type=?";
        String[] strArr = {StringUtils.c((Object) str2), StringUtils.c((Object) str), Integer.toString(i)};
        Cursor cursor = null;
        string = null;
        String string = null;
        try {
            cursorRawQueryStorageData = gmc.g().rawQueryStorageData(1, str3, strArr);
            if (cursorRawQueryStorageData != null) {
                try {
                    try {
                        if (cursorRawQueryStorageData.moveToNext()) {
                            string = cursorRawQueryStorageData.getString(cursorRawQueryStorageData.getColumnIndex("value"));
                        }
                    } catch (SQLiteException e2) {
                        e = e2;
                        LogUtil.e("Suggestion_BestRecordDao", LogAnonymous.b(e));
                        if (cursorRawQueryStorageData != null) {
                            cursorRawQueryStorageData.close();
                        }
                        return null;
                    }
                } catch (Throwable th) {
                    cursor = cursorRawQueryStorageData;
                    th = th;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            }
            if (cursorRawQueryStorageData != null) {
                cursorRawQueryStorageData.close();
            }
            return string;
        } catch (SQLiteException e3) {
            e = e3;
            cursorRawQueryStorageData = null;
        } catch (Throwable th2) {
            th = th2;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    private int b(String str, String str2, int i) {
        int iE = 0;
        if (a(i, 4) || a(i, 0) || a(i, 1) || a(i, 2) || a(i, 3)) {
            String str3 = "select value from " + gmc.g().getTableFullName("best_record") + " where  planId=? and userId=? and type=?";
            String[] strArr = {StringUtils.c((Object) str2), StringUtils.c((Object) str), Integer.toString(i)};
            Cursor cursorRawQueryStorageData = null;
            try {
                cursorRawQueryStorageData = gmc.g().rawQueryStorageData(1, str3, strArr);
                if (cursorRawQueryStorageData != null && cursorRawQueryStorageData.moveToNext()) {
                    iE = ifp.e((Object) cursorRawQueryStorageData.getString(cursorRawQueryStorageData.getColumnIndex("value")));
                }
                return iE;
            } catch (SQLiteException e) {
                LogUtil.e("Suggestion_BestRecordDao", LogAnonymous.b(e));
                return 0;
            } finally {
                if (cursorRawQueryStorageData != null) {
                    cursorRawQueryStorageData.close();
                }
            }
        }
        return 0;
    }

    private boolean e(int i, Object obj, String str) {
        for (int i2 : c.f35617c) {
            if (i == i2) {
                return c(obj, str);
            }
        }
        for (int i3 : c.f35616b) {
            if (i == i3) {
                return e(obj, str);
            }
        }
        for (int i4 : c.f35615a) {
            if (i == i4) {
                return b(obj, str);
            }
        }
        return false;
    }

    private boolean b(Object obj, String str) {
        return ifp.c(obj).floatValue() > ifp.c((Object) str).floatValue();
    }

    private boolean e(Object obj, String str) {
        return ifp.e(obj) > ifp.e((Object) str);
    }

    private boolean c(Object obj, String str) {
        int iE = ifp.e(obj);
        return iE != 0 && iE < ifp.e((Object) str);
    }

    private boolean c(Object obj) {
        if (obj instanceof Integer) {
            return ifp.e(obj) != 0;
        }
        return (obj instanceof Float) && ifp.c(obj).floatValue() != 0.0f;
    }

    private int c(String str, String str2, int i, Object obj, int i2) throws Throwable {
        if (!c(obj)) {
            return -2;
        }
        String strA = a(str, str2, i);
        if (strA == null) {
            int iE = e(str, str2, i, obj, i2);
            LogUtil.d("Suggestion_BestRecordDao", "insert best record: ", Integer.valueOf(i), obj.toString());
            return iE;
        }
        if (!e(i, obj, strA)) {
            return -1;
        }
        int iB = b(str, str2, i, StringUtils.c(obj), i2);
        LogUtil.d("Suggestion_BestRecordDao", "update best record: ", Integer.valueOf(i), obj.toString());
        return iB;
    }

    private int b(String str, String str2, int i, String str3, int i2) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("value", str3);
        contentValues.put("status", Integer.valueOf(i2));
        gmc.g().updateStorageData("best_record", 1, contentValues, "planId=? and userId=? and type=" + i, new String[]{StringUtils.c((Object) str2), StringUtils.c((Object) str)});
        LogUtil.d("Suggestion_BestRecordDao", "update best record: ", contentValues.toString());
        return 1;
    }
}
