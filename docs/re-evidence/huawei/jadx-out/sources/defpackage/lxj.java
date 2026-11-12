package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;

/* JADX INFO: loaded from: classes10.dex */
public class lxj {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f41084c = new Object();

    private String d() {
        StringBuilder sb = new StringBuilder(16);
        sb.append("_id integer primary key autoincrement,User_ID NVARCHAR(300) not null,Device_ID NVARCHAR(300) not null,LastTotalSteps integer not null,LastTotalCalories integer not null,LastTotalDistance integer not null,Time_Stamp integer not null");
        return String.valueOf(sb);
    }

    private String c() {
        return "LastTotalValueDB";
    }

    public void b(lxg lxgVar) {
        synchronized (f41084c) {
            try {
                if (lxgVar == null) {
                    LogUtil.j("LastTotalValueDb", "createDBTable, fitnessManager is null");
                    return;
                }
                String strC = c();
                if (lxgVar.createStorageDataTable(strC, 1, d()) != 0) {
                    LogUtil.j("LastTotalValueDb", "database is bad.");
                    if (!lxgVar.deleteDatabase()) {
                        LogUtil.j("LastTotalValueDb", "data base error.");
                        return;
                    }
                    lxgVar.createStorageDataTable(strC, 1, d());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public ContentValues d(lyl lylVar, String str, String str2) {
        ContentValues contentValues = new ContentValues();
        if (lylVar == null) {
            LogUtil.j("LastTotalValueDb", "getContentValues lastTotalValue is null");
            return contentValues;
        }
        contentValues.put("User_ID", str);
        contentValues.put("Device_ID", str2);
        contentValues.put("LastTotalSteps", Integer.valueOf(lylVar.c()));
        contentValues.put("LastTotalCalories", Integer.valueOf(lylVar.d()));
        contentValues.put("LastTotalDistance", Integer.valueOf(lylVar.b()));
        contentValues.put("Time_Stamp", Long.valueOf(lylVar.a()));
        return contentValues;
    }

    private lyl c(Cursor cursor) {
        lyl lylVar = new lyl();
        lylVar.i(cursor.getInt(cursor.getColumnIndex("LastTotalSteps")));
        lylVar.a(cursor.getInt(cursor.getColumnIndex("LastTotalCalories")));
        lylVar.b(cursor.getInt(cursor.getColumnIndex("LastTotalDistance")));
        lylVar.b(cursor.getInt(cursor.getColumnIndex("Time_Stamp")));
        return lylVar;
    }

    private String e() {
        String strN = CommonUtil.n(mga.e());
        lxg.c(BaseApplication.getContext());
        LogUtil.a("LastTotalValueDb", "query condition first: ", strN, " second: ", CommonUtil.n(lxg.e()));
        StringBuilder sb = new StringBuilder("( Device_ID='");
        sb.append(mga.e());
        sb.append("' AND User_ID='");
        lxg.c(BaseApplication.getContext());
        sb.append(lxg.e());
        sb.append("' )");
        return sb.toString();
    }

    public lyl a(lxg lxgVar) {
        synchronized (f41084c) {
            lyl lylVar = new lyl();
            if (lxgVar == null) {
                LogUtil.j("LastTotalValueDb", "getTotalValue, fitnessManager is null");
                return lylVar;
            }
            Cursor cursorQueryStorageData = lxgVar.queryStorageData(c(), 1, e());
            if (cursorQueryStorageData == null) {
                LogUtil.j("LastTotalValueDb", "getLastTotalCalories cursor is null");
                return lylVar;
            }
            if (cursorQueryStorageData.moveToNext()) {
                lylVar = c(cursorQueryStorageData);
            }
            cursorQueryStorageData.close();
            LogUtil.a("05", 1, "LastTotalValueDb", "getTotalValue: ", lylVar);
            return lylVar;
        }
    }

    public long e(lxg lxgVar) {
        synchronized (f41084c) {
            try {
                if (lxgVar == null) {
                    LogUtil.j("LastTotalValueDb", "getLastTimestamp, fitnessManager is null");
                    return 0L;
                }
                lyl lylVarA = a(lxgVar);
                long jA = lylVarA != null ? lylVarA.a() : 0L;
                LogUtil.a("05", 1, "LastTotalValueDb", "getLastTimestamp timeStamp: ", Long.valueOf(jA));
                return jA;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void b(lxg lxgVar, lyl lylVar) {
        synchronized (f41084c) {
            try {
                if (lxgVar == null) {
                    LogUtil.j("LastTotalValueDb", "setLastTotalValue, fitnessManager is null");
                    return;
                }
                lxg.c(BaseApplication.getContext());
                ContentValues contentValuesD = d(lylVar, lxg.e(), mga.e());
                String strC = c();
                LogUtil.a("05", 1, "LastTotalValueDb", "setLastTotalValue total: ", lylVar);
                Cursor cursorQueryStorageData = lxgVar.queryStorageData(strC, 1, e());
                if (cursorQueryStorageData == null) {
                    LogUtil.j("LastTotalValueDb", "setLastTotalValue cursor is null");
                    return;
                }
                if (cursorQueryStorageData.moveToNext()) {
                    lxgVar.updateStorageData(strC, 1, contentValuesD, e());
                } else {
                    lxgVar.insertStorageData(strC, 1, contentValuesD);
                }
                cursorQueryStorageData.close();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
