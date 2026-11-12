package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;
import health.compact.a.DbManager;

/* JADX INFO: loaded from: classes11.dex */
public class mpp {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f42138b = new Object();

    private String b() {
        StringBuffer stringBuffer = new StringBuffer(16);
        stringBuffer.append("_id integer primary key autoincrement,User_ID NVARCHAR(300) not null,Device_ID NVARCHAR(300) not null,LastTotalSteps integer not null,LastTotalCalories integer not null,LastTotalDistance integer not null,Time_Stamp integer not null");
        return String.valueOf(stringBuffer);
    }

    private String f() {
        return "LastTotalValueDB";
    }

    public void d() {
        synchronized (f42138b) {
            String strF = f();
            if (DbManager.a(BaseApplication.getContext(), "100007", strF, 1, b()) != 0) {
                LogUtil.j("BasicLastTotalValueAw70Db", "database is bad.");
                if (!DbManager.b("100007")) {
                    LogUtil.j("BasicLastTotalValueAw70Db", "data base error.");
                    return;
                }
                DbManager.a(BaseApplication.getContext(), "100007", strF, 1, b());
            }
        }
    }

    public ContentValues d(mqg mqgVar, String str, String str2) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("User_ID", str);
        contentValues.put("Device_ID", str2);
        if (mqgVar != null) {
            contentValues.put("LastTotalSteps", Integer.valueOf(mqgVar.c()));
            contentValues.put("LastTotalCalories", Integer.valueOf(mqgVar.d()));
            contentValues.put("LastTotalDistance", Integer.valueOf(mqgVar.b()));
            contentValues.put("Time_Stamp", Long.valueOf(mqgVar.a()));
        }
        return contentValues;
    }

    private mqg a(Cursor cursor) {
        mqg mqgVar = new mqg();
        if (cursor != null) {
            mqgVar.h(cursor.getInt(cursor.getColumnIndex("LastTotalSteps")));
            mqgVar.c(cursor.getInt(cursor.getColumnIndex("LastTotalCalories")));
            mqgVar.e(cursor.getInt(cursor.getColumnIndex("LastTotalDistance")));
            mqgVar.e(cursor.getInt(cursor.getColumnIndex("Time_Stamp")));
        }
        return mqgVar;
    }

    private String c() {
        String strN = CommonUtil.n(mpz.c());
        mpq.c();
        LogUtil.a("BasicLastTotalValueAw70Db", "query condition first: ", strN, " second: ", CommonUtil.n(mpq.a()));
        StringBuilder sb = new StringBuilder("( Device_ID='");
        sb.append(mpz.c());
        sb.append("' AND User_ID='");
        mpq.c();
        sb.append(mpq.a());
        sb.append("' )");
        return sb.toString();
    }

    public mqg a() {
        synchronized (f42138b) {
            mqg mqgVar = new mqg();
            Cursor cursorC = DbManager.c(BaseApplication.getContext(), "100007", f(), 1, c());
            if (cursorC == null) {
                LogUtil.j("BasicLastTotalValueAw70Db", "getTotalValue: query error, cursor is null");
                return mqgVar;
            }
            if (cursorC.moveToNext()) {
                mqgVar = a(cursorC);
            }
            cursorC.close();
            LogUtil.a("BasicLastTotalValueAw70Db", "getTotalValue: lastTotalValue: ", mqgVar);
            return mqgVar;
        }
    }

    public long e() {
        long jA;
        synchronized (f42138b) {
            mqg mqgVarA = a();
            jA = mqgVarA != null ? mqgVarA.a() : 0L;
            LogUtil.a("BasicLastTotalValueAw70Db", "getLastTimestamp: timestamp: ", Long.valueOf(jA));
        }
        return jA;
    }

    public void d(mqg mqgVar) {
        synchronized (f42138b) {
            mpq.c();
            ContentValues contentValuesD = d(mqgVar, mpq.a(), mpz.c());
            String strF = f();
            LogUtil.a("BasicLastTotalValueAw70Db", "setLastTotalValue: totalValue:", mqgVar);
            Cursor cursorC = DbManager.c(BaseApplication.getContext(), "100007", strF, 1, c());
            if (cursorC == null) {
                LogUtil.j("BasicLastTotalValueAw70Db", "setLastTotalValue: query error, cursor is null");
                return;
            }
            if (cursorC.moveToNext()) {
                DbManager.d dVar = new DbManager.d();
                dVar.b(BaseApplication.getContext());
                dVar.c("100007");
                dVar.b(strF);
                dVar.e(1);
                DbManager.d(dVar, contentValuesD, c());
            } else {
                DbManager.c(BaseApplication.getContext(), "100007", strF, 1, contentValuesD);
            }
            cursorC.close();
        }
    }
}
