package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.huawei.health.plan.model.data.BaseDao;
import com.huawei.health.plan.model.model.BestRecordFitStat;
import com.huawei.health.sport.model.WorkoutRecord;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.JsbMapKeyNames;
import com.huawei.pluginachievement.manager.model.ParsedFieldTag;
import health.compact.a.DbManager;
import health.compact.a.LogAnonymous;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import health.compact.a.utils.StringUtils;

/* JADX INFO: loaded from: classes29.dex */
public class gla extends BaseDao {

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final int[] f35462a = new int[0];
        private static final int[] d = {1};
        private static final int[] e = new int[0];
    }

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        String f35459a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f35460b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f35461c;
        long e;

        private a() {
        }
    }

    private int a(String str, a aVar, Object obj) throws Throwable {
        if (aVar == null || !e(obj)) {
            return -2;
        }
        String strD = d(str, aVar.f35459a, aVar.f35460b);
        if (strD == null) {
            int iC = c(str, aVar, obj);
            int i = aVar.f35460b;
            LogUtil.d("Suggestion_BestRecordFitDao", "insert best record: ", Integer.valueOf(i), obj.toString());
            return iC;
        }
        if (!a(aVar.f35460b, obj, strD)) {
            return -1;
        }
        int iE = e(str, aVar, StringUtils.c(obj));
        int i2 = aVar.f35460b;
        LogUtil.d("Suggestion_BestRecordFitDao", "update best record: ", Integer.valueOf(i2), obj.toString());
        return iE;
    }

    private int e(String str, a aVar, String str2) {
        if (aVar == null) {
            return -1;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("value", str2);
        contentValues.put("status", Integer.valueOf(aVar.f35461c));
        contentValues.put(ParsedFieldTag.TASK_COMPLETE_TIME, Long.valueOf(aVar.e));
        gmc.g().updateStorageData("best_record_fit", 1, contentValues, "actionId=? and userId=? and type=" + aVar.f35460b, new String[]{StringUtils.c((Object) aVar.f35459a), StringUtils.c((Object) str)});
        LogUtil.d("Suggestion_BestRecordFitDao", "update best record: ", contentValues.toString());
        return 1;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0086  */
    public void a(String str, String str2, WorkoutRecord workoutRecord) throws Throwable {
        boolean z;
        if (workoutRecord == null) {
            return;
        }
        LogUtil.d("Suggestion_BestRecordFitDao", "update best record：userId", str, " actionId:", str2);
        boolean z2 = false;
        try {
            try {
                if (DbManager.i(String.valueOf(fga.b()))) {
                    z = false;
                } else {
                    gmc.g().h();
                    z = true;
                }
                try {
                    a aVar = new a();
                    aVar.f35459a = str2;
                    aVar.f35460b = 1;
                    aVar.f35461c = 1;
                    int iAcquireBestTimes = workoutRecord.acquireBestTimes();
                    aVar.e = workoutRecord.acquireExerciseTime();
                    LogUtil.d("Suggestion_BestRecordFitDao", "updateBestRecords(String userId, String actionId, WorkoutRecord workoutRecord) result = ", Integer.valueOf(a(str, aVar, Integer.valueOf(iAcquireBestTimes))));
                    if (z) {
                        gmc.g().f();
                    }
                } catch (SQLiteException e) {
                    e = e;
                    ReleaseLogUtil.a("Suggestion_BestRecordFitDao", "SQLiteDatabaseLockedException:", LogAnonymous.b(e));
                    if (z) {
                        gmc.g().f();
                    }
                }
            } catch (Throwable th) {
                th = th;
                z2 = z;
                if (z2) {
                    gmc.g().f();
                }
                throw th;
            }
        } catch (SQLiteException e2) {
            e = e2;
            z = false;
        } catch (Throwable th2) {
            th = th2;
            if (z2) {
                gmc.g().f();
            }
            throw th;
        }
    }

    public void b(String str, String str2) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("status", (Integer) 0);
        gmc.g().updateStorageData("best_record_fit", 1, contentValues, "( actionId=? OR actionId='' ) AND userId=?", new String[]{StringUtils.c((Object) str2), StringUtils.c((Object) str)});
        LogUtil.d("Suggestion_BestRecordFitDao", "update best record: ", contentValues.toString());
    }

    private int c(String str, a aVar, Object obj) {
        if (aVar == null) {
            return -1;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("actionId", StringUtils.c((Object) aVar.f35459a));
        contentValues.put(JsbMapKeyNames.H5_USER_ID, StringUtils.c((Object) str));
        contentValues.put("type", Integer.valueOf(aVar.f35460b));
        contentValues.put("value", StringUtils.c(obj));
        contentValues.put("status", Integer.valueOf(aVar.f35461c));
        contentValues.put(ParsedFieldTag.TASK_COMPLETE_TIME, Long.valueOf(aVar.e));
        gmc.g().insertStorageData("best_record_fit", 1, contentValues);
        LogUtil.d("Suggestion_BestRecordFitDao", "insert best record：", contentValues.toString());
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x007d  */
    private String d(String str, String str2, int i) throws Throwable {
        SQLiteException e;
        Cursor cursorRawQueryStorageData;
        String str3 = "select value from " + gmc.g().getTableFullName("best_record_fit") + " where  actionId=? and userId=? and type=?";
        String[] strArr = {StringUtils.c((Object) str2), StringUtils.c((Object) str), i + ""};
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
                        LogUtil.e("Suggestion_BestRecordFitDao", LogAnonymous.b(e));
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

    public BestRecordFitStat c(String str, String str2) throws Throwable {
        Throwable th;
        Cursor cursorRawQueryStorageData;
        SQLiteException e;
        BestRecordFitStat bestRecordFitStat;
        String str3 = "SELECT *  FROM " + gmc.g().getTableFullName("best_record_fit") + " WHERE ( actionId=? OR actionId='' ) AND userId=? AND status=1";
        String[] strArr = {StringUtils.c((Object) str2), StringUtils.c((Object) str)};
        Cursor cursor = null;
        bestRecordFitStat = null;
        BestRecordFitStat bestRecordFitStat2 = null;
        cursor = null;
        try {
            try {
                cursorRawQueryStorageData = gmc.g().rawQueryStorageData(1, str3, strArr);
                if (cursorRawQueryStorageData != null) {
                    while (cursorRawQueryStorageData.moveToNext()) {
                        try {
                            if (bestRecordFitStat2 == null) {
                                bestRecordFitStat2 = new BestRecordFitStat();
                            }
                            String string = cursorRawQueryStorageData.getString(cursorRawQueryStorageData.getColumnIndex("actionId"));
                            int i = cursorRawQueryStorageData.getInt(cursorRawQueryStorageData.getColumnIndex("type"));
                            String string2 = cursorRawQueryStorageData.getString(cursorRawQueryStorageData.getColumnIndex("value"));
                            long j = cursorRawQueryStorageData.getLong(cursorRawQueryStorageData.getColumnIndex(ParsedFieldTag.TASK_COMPLETE_TIME));
                            if (!TextUtils.isEmpty(string2)) {
                                bestRecordFitStat2.setValue(string, i, string2, j);
                            }
                        } catch (SQLiteException e2) {
                            e = e2;
                            BestRecordFitStat bestRecordFitStat3 = bestRecordFitStat2;
                            cursor = cursorRawQueryStorageData;
                            bestRecordFitStat = bestRecordFitStat3;
                            LogUtil.e("Suggestion_BestRecordFitDao", LogAnonymous.b(e));
                            if (cursor != null) {
                                cursor.close();
                            }
                            return bestRecordFitStat;
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
                return bestRecordFitStat2;
            } catch (SQLiteException e3) {
                e = e3;
                bestRecordFitStat = null;
            }
        } catch (Throwable th3) {
            Cursor cursor2 = cursor;
            th = th3;
            cursorRawQueryStorageData = cursor2;
        }
    }

    public boolean d(String str, String str2) {
        Cursor cursorRawQueryStorageData = null;
        try {
            cursorRawQueryStorageData = gmc.g().rawQueryStorageData(1, "select type from " + gmc.g().getTableFullName("best_record_fit") + " where ( actionId=? OR actionId='' ) AND userId=? and status=1", new String[]{StringUtils.c((Object) str2), StringUtils.c((Object) str)});
            return cursorRawQueryStorageData != null ? cursorRawQueryStorageData.moveToNext() : false;
        } catch (SQLiteException e) {
            LogUtil.e("Suggestion_BestRecordFitDao", LogAnonymous.b(e));
            return false;
        } finally {
            if (cursorRawQueryStorageData != null) {
                cursorRawQueryStorageData.close();
            }
        }
    }

    private boolean a(int i, Object obj, String str) {
        for (int i2 : c.f35462a) {
            if (i == i2) {
                return c(obj, str);
            }
        }
        for (int i3 : c.d) {
            if (i == i3) {
                return a(obj, str);
            }
        }
        for (int i4 : c.e) {
            if (i == i4) {
                return e(obj, str);
            }
        }
        return false;
    }

    private boolean e(Object obj, String str) {
        return ifp.c(obj).floatValue() > ifp.c((Object) str).floatValue();
    }

    private boolean a(Object obj, String str) {
        return ifp.e(obj) > ifp.e((Object) str);
    }

    private boolean c(Object obj, String str) {
        int iE = ifp.e(obj);
        return iE != 0 && iE < ifp.e((Object) str);
    }

    private boolean e(Object obj) {
        return ifp.e(obj) != 0;
    }
}
