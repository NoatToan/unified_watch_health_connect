package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import com.google.gson.Gson;
import com.huawei.health.plan.model.data.BaseDao;
import com.huawei.health.plan.model.model.DataSync;
import com.huawei.health.sport.model.WorkoutRecord;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.JsbMapKeyNames;
import health.compact.a.LogAnonymous;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import health.compact.a.utils.StringUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public class glv extends BaseDao {
    public int b(String str) {
        int i = 0;
        Cursor cursorRawQueryStorageData = null;
        try {
            cursorRawQueryStorageData = gmc.g().rawQueryStorageData(1, "SELECT COUNT(*) AS recordCount FROM " + gmc.g().getTableFullName("data_sync") + " WHERE userId=?", new String[]{StringUtils.c((Object) str)});
            if (cursorRawQueryStorageData != null && cursorRawQueryStorageData.moveToNext()) {
                i = cursorRawQueryStorageData.getInt(cursorRawQueryStorageData.getColumnIndex("recordCount"));
            }
            return i;
        } catch (SQLiteException e) {
            LogUtil.e("Suggestion_DataSyncDao", "getSyncRecordCount:", LogAnonymous.b(e));
            return 0;
        } finally {
            if (cursorRawQueryStorageData != null) {
                cursorRawQueryStorageData.close();
            }
        }
    }

    public int d(long j) {
        int i = 0;
        Cursor cursorRawQueryStorageData = null;
        try {
            cursorRawQueryStorageData = gmc.g().rawQueryStorageData(1, "SELECT syncTimes FROM " + gmc.g().getTableFullName("data_sync") + " WHERE recordId=?", new String[]{String.valueOf(j)});
            if (cursorRawQueryStorageData != null && cursorRawQueryStorageData.moveToNext()) {
                i = cursorRawQueryStorageData.getInt(cursorRawQueryStorageData.getColumnIndex("syncTimes"));
            }
            return i;
        } catch (SQLiteException e) {
            LogUtil.e("Suggestion_DataSyncDao", "getSyncRecordTimes:", LogAnonymous.b(e));
            return 0;
        } finally {
            if (cursorRawQueryStorageData != null) {
                cursorRawQueryStorageData.close();
            }
        }
    }

    public void d(String str) {
        gmc.g().deleteStorageData("data_sync", 1, "planId=?", new String[]{StringUtils.c((Object) str)});
    }

    public void b(DataSync dataSync) {
        gmc.g().deleteStorageData("data_sync", 1, "recordId=" + dataSync.getRecordId());
    }

    public void c(String str, String str2, int i) {
        gmc.g().deleteStorageData("data_sync", 1, "userId=? and type=" + i + " and planId=?", new String[]{StringUtils.c((Object) str), StringUtils.c((Object) str2)});
    }

    public DataSync a(String str, long j) throws Throwable {
        Throwable th;
        Cursor cursorRawQueryStorageData;
        SQLiteException e;
        DataSync dataSync;
        Cursor cursor = null;
        dataSync = null;
        DataSync dataSync2 = null;
        DataSync dataSync3 = null;
        cursor = null;
        try {
            try {
                cursorRawQueryStorageData = gmc.g().rawQueryStorageData(1, "SELECT * FROM " + gmc.g().getTableFullName("data_sync") + " WHERE userId=? AND recordId > ? LIMIT 0,1 ", new String[]{str, String.valueOf(j)});
                if (cursorRawQueryStorageData != null) {
                    try {
                        try {
                            if (cursorRawQueryStorageData.moveToNext()) {
                                DataSync dataSync4 = new DataSync();
                                try {
                                    dataSync4.setRecordId(cursorRawQueryStorageData.getLong(cursorRawQueryStorageData.getColumnIndex("recordId")));
                                    dataSync4.setUserId(cursorRawQueryStorageData.getString(cursorRawQueryStorageData.getColumnIndex(JsbMapKeyNames.H5_USER_ID)));
                                    dataSync4.setType(cursorRawQueryStorageData.getInt(cursorRawQueryStorageData.getColumnIndex("type")));
                                    dataSync4.setValue(cursorRawQueryStorageData.getString(cursorRawQueryStorageData.getColumnIndex("value")));
                                    dataSync3 = dataSync4;
                                } catch (SQLiteException e2) {
                                    e = e2;
                                    dataSync2 = dataSync4;
                                    DataSync dataSync5 = dataSync2;
                                    cursor = cursorRawQueryStorageData;
                                    dataSync = dataSync5;
                                    LogUtil.e("Suggestion_DataSyncDao", "getSyncRecord:", LogAnonymous.b(e));
                                    if (cursor != null) {
                                        cursor.close();
                                    }
                                    return dataSync;
                                }
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            if (cursorRawQueryStorageData != null) {
                                cursorRawQueryStorageData.close();
                            }
                            throw th;
                        }
                    } catch (SQLiteException e3) {
                        e = e3;
                    }
                }
                if (cursorRawQueryStorageData != null) {
                    cursorRawQueryStorageData.close();
                }
                return dataSync3;
            } catch (SQLiteException e4) {
                e = e4;
                dataSync = null;
            }
        } catch (Throwable th3) {
            th = th3;
            cursorRawQueryStorageData = cursor;
        }
    }

    public List<DataSync> c(String str, int i) {
        ArrayList arrayList = new ArrayList();
        try {
            Cursor cursorRawQueryStorageData = gmc.g().rawQueryStorageData(1, "SELECT * FROM " + gmc.g().getTableFullName("data_sync") + " WHERE userId=? AND type=?", new String[]{str, String.valueOf(i)});
            if (cursorRawQueryStorageData != null) {
                while (cursorRawQueryStorageData.moveToNext()) {
                    try {
                        DataSync dataSync = new DataSync();
                        dataSync.setRecordId(cursorRawQueryStorageData.getLong(cursorRawQueryStorageData.getColumnIndex("recordId")));
                        dataSync.setUserId(cursorRawQueryStorageData.getString(cursorRawQueryStorageData.getColumnIndex(JsbMapKeyNames.H5_USER_ID)));
                        dataSync.setType(cursorRawQueryStorageData.getInt(cursorRawQueryStorageData.getColumnIndex("type")));
                        dataSync.setValue(cursorRawQueryStorageData.getString(cursorRawQueryStorageData.getColumnIndex("value")));
                        arrayList.add(dataSync);
                    } catch (Throwable th) {
                        if (cursorRawQueryStorageData != null) {
                            try {
                                cursorRawQueryStorageData.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                }
            }
            if (cursorRawQueryStorageData != null) {
                cursorRawQueryStorageData.close();
                return arrayList;
            }
        } catch (SQLiteException e) {
            LogUtil.e("Suggestion_DataSyncDao", "getSyncRecordByType:", LogAnonymous.b(e));
        }
        return arrayList;
    }

    public boolean b(String str, String str2, int i, String str3) {
        LogUtil.a("Suggestion_DataSyncDao", "addSyncRecord() enter");
        if (i == 1 || i == 4 || i == 5 || i == 7 || i == 8 || i == 6) {
            c(str, str2, i);
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("planId", StringUtils.c((Object) str2));
        contentValues.put(JsbMapKeyNames.H5_USER_ID, str);
        contentValues.put("type", Integer.valueOf(i));
        contentValues.put("value", str3);
        long jInsertStorageData = gmc.g().insertStorageData("data_sync", 1, contentValues);
        LogUtil.d("Suggestion_DataSyncDao", "addSyncRecord：", contentValues.toString());
        glr.d();
        return jInsertStorageData > 0;
    }

    public boolean a(DataSync dataSync) {
        if (dataSync == null) {
            return false;
        }
        LogUtil.d("Suggestion_DataSyncDao", "isBeyondSyncTimes：", dataSync);
        int iD = d(dataSync.getRecordId());
        if (iD >= 5) {
            return true;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("syncTimes", Integer.valueOf(iD + 1));
        gmc.g().updateStorageData("data_sync", 1, contentValues, "recordId=" + dataSync.getRecordId());
        return false;
    }

    public boolean a(String str, String str2, String str3) {
        return b(str, str2, 1, ifp.b(new String[]{str2, ifp.b(str3)}));
    }

    public boolean a(String str, String str2, long j) {
        return b(str, str2, 2, String.valueOf(j));
    }

    public boolean b(String str, WorkoutRecord workoutRecord, String str2) {
        return b(str, "", 3, ifp.b(new String[]{workoutRecord.acquireWorkoutId(), workoutRecord.acquireVersion(), workoutRecord.acquireWorkoutPackageId(), Integer.toString(workoutRecord.acquireCourseBelongType()), str2}));
    }

    public boolean d(String str, String str2, String str3) {
        return b(str, str2, 4, ifp.b(new String[]{str2, str3}));
    }

    public boolean b(String str, String str2) {
        return b(str, str2, 5, str2);
    }

    public boolean a(String str, String str2) {
        return b(str, str2, 7, str2);
    }

    public boolean d(String str, int i, String str2) {
        return b(str, str2, 8, ifp.b(new String[]{str2, Integer.toString(i)}));
    }

    public boolean e(String str, String str2) {
        return b(str, str2, 6, str2);
    }

    public boolean b(String str, pec pecVar) {
        return b(str, String.valueOf(pecVar.c()), 10, new Gson().toJson(pecVar));
    }

    public boolean c(String str, String str2, long j) {
        ReleaseLogUtil.d("Suggestion_DataSyncDao", "addUpdatePlanClock:", Long.valueOf(j));
        return b(str, str2, 11, Long.toString(j));
    }
}
