package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;
import health.compact.a.DbManager;

/* JADX INFO: loaded from: classes10.dex */
public class lyt {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f41160b = new Object();

    private String c() {
        StringBuffer stringBuffer = new StringBuffer(16);
        stringBuffer.append("_id integer primary key autoincrement,User_ID NVARCHAR(300) not null,Device_ID NVARCHAR(300) not null,LastTotalSteps integer not null,LastTotalCalories integer not null,LastTotalDistance integer not null,Time_Stamp integer not null");
        return String.valueOf(stringBuffer);
    }

    private String g() {
        return "LastTotalValueDB";
    }

    public void a() {
        synchronized (f41160b) {
            String strG = g();
            if (DbManager.a(BaseApplication.getContext(), "100007", strG, 1, c()) != 0) {
                LogUtil.j("LastTotalValueAw70Db", "database is bad.");
                if (!DbManager.b("100007")) {
                    LogUtil.j("LastTotalValueAw70Db", "data base error.");
                    return;
                }
                DbManager.a(BaseApplication.getContext(), "100007", strG, 1, c());
            }
        }
    }

    public ContentValues d(lyl lylVar, String str, String str2) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("User_ID", str);
        contentValues.put("Device_ID", str2);
        if (lylVar != null) {
            contentValues.put("LastTotalSteps", Integer.valueOf(lylVar.c()));
            contentValues.put("LastTotalCalories", Integer.valueOf(lylVar.d()));
            contentValues.put("LastTotalDistance", Integer.valueOf(lylVar.b()));
            contentValues.put("Time_Stamp", Long.valueOf(lylVar.a()));
        }
        return contentValues;
    }

    private lyl e(Cursor cursor) {
        lyl lylVar = new lyl();
        if (cursor != null) {
            lylVar.i(cursor.getInt(cursor.getColumnIndex("LastTotalSteps")));
            lylVar.a(cursor.getInt(cursor.getColumnIndex("LastTotalCalories")));
            lylVar.b(cursor.getInt(cursor.getColumnIndex("LastTotalDistance")));
            lylVar.b(cursor.getInt(cursor.getColumnIndex("Time_Stamp")));
        }
        return lylVar;
    }

    private String e() {
        String strN = CommonUtil.n(mga.b());
        lyn.c(BaseApplication.getContext());
        LogUtil.a("LastTotalValueAw70Db", "query condition first: ", strN, " second: ", CommonUtil.n(lyn.d()));
        StringBuilder sb = new StringBuilder("( Device_ID='");
        sb.append(mga.b());
        sb.append("' AND User_ID='");
        lyn.c(BaseApplication.getContext());
        sb.append(lyn.d());
        sb.append("' )");
        return sb.toString();
    }

    public lyl d() {
        synchronized (f41160b) {
            lyl lylVar = new lyl();
            Cursor cursorC = DbManager.c(BaseApplication.getContext(), "100007", g(), 1, e());
            if (cursorC == null) {
                LogUtil.j("LastTotalValueAw70Db", "getTotalValue: query error, cursor is null");
                return lylVar;
            }
            if (cursorC.moveToNext()) {
                lylVar = e(cursorC);
            }
            cursorC.close();
            LogUtil.a("LastTotalValueAw70Db", "getTotalValue: lastTotalValue: ", lylVar);
            return lylVar;
        }
    }

    public long b() {
        long jA;
        synchronized (f41160b) {
            lyl lylVarD = d();
            jA = lylVarD != null ? lylVarD.a() : 0L;
            LogUtil.a("LastTotalValueAw70Db", "getLastTimestamp: timestamp: ", Long.valueOf(jA));
        }
        return jA;
    }

    public void c(lyl lylVar) {
        synchronized (f41160b) {
            lyn.c(BaseApplication.getContext());
            ContentValues contentValuesD = d(lylVar, lyn.d(), mga.b());
            String strG = g();
            LogUtil.a("LastTotalValueAw70Db", "setLastTotalValue: totalValue:", lylVar);
            Cursor cursorC = DbManager.c(BaseApplication.getContext(), "100007", strG, 1, e());
            if (cursorC == null) {
                LogUtil.j("LastTotalValueAw70Db", "setLastTotalValue: query error, cursor is null");
                return;
            }
            if (cursorC.moveToNext()) {
                DbManager.d dVar = new DbManager.d();
                dVar.b(BaseApplication.getContext());
                dVar.c("100007");
                dVar.b(strG);
                dVar.e(1);
                DbManager.d(dVar, contentValuesD, e());
            } else {
                DbManager.c(BaseApplication.getContext(), "100007", strG, 1, contentValuesD);
            }
            cursorC.close();
        }
    }
}
