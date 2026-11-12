package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.hwbasemgr.HwBaseManager;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;

/* JADX INFO: loaded from: classes11.dex */
public class moz {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f42096b = new Object();

    private String a() {
        StringBuilder sb = new StringBuilder(16);
        sb.append("_id integer primary key autoincrement,User_ID NVARCHAR(300) not null,Device_ID NVARCHAR(300) not null,LastTotalSteps integer not null,LastTotalCalories integer not null,LastTotalDistance integer not null,Time_Stamp integer not null");
        return String.valueOf(sb);
    }

    private String e() {
        return "LastTotalValueDB";
    }

    public void e(HwBaseManager hwBaseManager) {
        synchronized (f42096b) {
            try {
                if (hwBaseManager == null) {
                    LogUtil.j("BasicLastTotalValueDb", "createDBTable, fitnessManager is null");
                    return;
                }
                String strE = e();
                if (hwBaseManager.createStorageDataTable(strE, 1, a()) != 0) {
                    LogUtil.j("BasicLastTotalValueDb", "database is bad.");
                    if (!hwBaseManager.deleteDatabase()) {
                        LogUtil.j("BasicLastTotalValueDb", "data base error.");
                        return;
                    }
                    hwBaseManager.createStorageDataTable(strE, 1, a());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public ContentValues a(mqg mqgVar, String str, String str2) {
        ContentValues contentValues = new ContentValues();
        if (mqgVar == null) {
            LogUtil.j("BasicLastTotalValueDb", "getContentValues lastTotalValue is null");
            return contentValues;
        }
        contentValues.put("User_ID", str);
        contentValues.put("Device_ID", str2);
        contentValues.put("LastTotalSteps", Integer.valueOf(mqgVar.c()));
        contentValues.put("LastTotalCalories", Integer.valueOf(mqgVar.d()));
        contentValues.put("LastTotalDistance", Integer.valueOf(mqgVar.b()));
        contentValues.put("Time_Stamp", Long.valueOf(mqgVar.a()));
        return contentValues;
    }

    private mqg e(Cursor cursor) {
        mqg mqgVar = new mqg();
        mqgVar.h(cursor.getInt(cursor.getColumnIndex("LastTotalSteps")));
        mqgVar.c(cursor.getInt(cursor.getColumnIndex("LastTotalCalories")));
        mqgVar.e(cursor.getInt(cursor.getColumnIndex("LastTotalDistance")));
        mqgVar.e(cursor.getInt(cursor.getColumnIndex("Time_Stamp")));
        return mqgVar;
    }

    private String c() {
        String strN = CommonUtil.n(myo.b());
        mpg.d();
        LogUtil.a("BasicLastTotalValueDb", "query condition first: ", strN, " second: ", CommonUtil.n(mpg.b()));
        StringBuilder sb = new StringBuilder("( Device_ID='");
        sb.append(myo.b());
        sb.append("' AND User_ID='");
        mpg.d();
        sb.append(mpg.b());
        sb.append("' )");
        return sb.toString();
    }

    public mqg d(mpg mpgVar) {
        synchronized (f42096b) {
            mqg mqgVar = new mqg();
            if (mpgVar == null) {
                LogUtil.j("BasicLastTotalValueDb", "getTotalValue, fitnessManager is null");
                return mqgVar;
            }
            Cursor cursor = null;
            try {
                try {
                    Cursor cursorQueryStorageData = mpgVar.queryStorageData(e(), 1, c());
                    if (cursorQueryStorageData == null) {
                        LogUtil.j("BasicLastTotalValueDb", "getLastTotalCalories cursor is null");
                        if (cursorQueryStorageData != null) {
                            cursorQueryStorageData.close();
                        }
                        return mqgVar;
                    }
                    if (cursorQueryStorageData.moveToNext()) {
                        mqgVar = e(cursorQueryStorageData);
                    }
                    if (cursorQueryStorageData != null) {
                        cursorQueryStorageData.close();
                    }
                    LogUtil.a("BasicLastTotalValueDb", "getTotalValue: ", mqgVar);
                    return mqgVar;
                } catch (Exception e) {
                    LogUtil.e("BasicLastTotalValueDb", "queryStorageData Exception:", ExceptionUtils.c(e));
                    if (0 != 0) {
                        cursor.close();
                    }
                    return mqgVar;
                }
            } catch (Throwable th) {
                if (0 != 0) {
                    cursor.close();
                }
                throw th;
            }
        }
    }

    public long c(mpg mpgVar) {
        synchronized (f42096b) {
            try {
                if (mpgVar == null) {
                    LogUtil.j("BasicLastTotalValueDb", "getLastTimestamp, fitnessManager is null");
                    return 0L;
                }
                mqg mqgVarD = d(mpgVar);
                long jA = mqgVarD != null ? mqgVarD.a() : 0L;
                LogUtil.a("BasicLastTotalValueDb", "getLastTimestamp timeStamp: ", Long.valueOf(jA));
                return jA;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x007c A[Catch: all -> 0x0087, PHI: r10
      0x007c: PHI (r10v3 android.database.Cursor) = (r10v2 android.database.Cursor), (r10v4 android.database.Cursor) binds: [B:28:0x007a, B:22:0x0063] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TryCatch #1 {, blocks: (B:6:0x0007, B:7:0x0012, B:9:0x0014, B:15:0x004d, B:16:0x0050, B:30:0x007f, B:29:0x007c, B:33:0x0083, B:34:0x0086, B:11:0x0036, B:13:0x0040, B:18:0x0052, B:20:0x0058, B:21:0x0060, B:27:0x0069), top: B:39:0x0005, inners: #0 }] */
    public void c(mpg mpgVar, mqg mqgVar) {
        synchronized (f42096b) {
            if (mpgVar == null) {
                LogUtil.j("BasicLastTotalValueDb", "setLastTotalValue, fitnessManager is null");
                return;
            }
            mpg.d();
            ContentValues contentValuesA = a(mqgVar, mpg.b(), myo.b());
            String strE = e();
            LogUtil.a("BasicLastTotalValueDb", "setLastTotalValue total: ", mqgVar);
            Cursor cursorQueryStorageData = null;
            try {
                try {
                    cursorQueryStorageData = mpgVar.queryStorageData(strE, 1, c());
                    if (cursorQueryStorageData == null) {
                        LogUtil.j("BasicLastTotalValueDb", "setLastTotalValue cursor is null");
                        if (cursorQueryStorageData != null) {
                            cursorQueryStorageData.close();
                        }
                    } else {
                        if (cursorQueryStorageData.moveToNext()) {
                            mpgVar.updateStorageData(strE, 1, contentValuesA, c());
                        } else {
                            mpgVar.insertStorageData(strE, 1, contentValuesA);
                        }
                        if (cursorQueryStorageData != null) {
                            cursorQueryStorageData.close();
                        }
                    }
                } catch (Exception e) {
                    LogUtil.e("BasicLastTotalValueDb", "setLastTotalValue exception:", ExceptionUtils.c(e));
                    if (0 != 0) {
                        cursorQueryStorageData.close();
                    }
                }
            } catch (Throwable th) {
                if (0 != 0) {
                    cursorQueryStorageData.close();
                }
                throw th;
            }
        }
    }
}
