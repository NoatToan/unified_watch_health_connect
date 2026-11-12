package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.hiai.awareness.AwarenessConstants;
import com.huawei.hwbasemgr.HwBaseManager;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public class fll extends HwBaseManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f34175a;
    private volatile boolean d;

    static class d {
        public static final fll d = new fll(BaseApplication.getContext());
    }

    private fll(Context context) {
        super(context);
        this.f34175a = new Object();
        this.d = false;
    }

    public static fll c() {
        return d.d;
    }

    private static ContentValues d(fln flnVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("huid", flnVar.e());
        contentValues.put("type", Integer.valueOf(flnVar.d()));
        contentValues.put("timestamp", Long.valueOf(flnVar.a()));
        contentValues.put("frequency", Integer.valueOf(flnVar.b()));
        return contentValues;
    }

    @Override // com.huawei.hwbasemgr.HwBaseManager
    public Integer getModuleId() {
        return 1020;
    }

    public void c(int i, String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("ClickRecordMgr", "clickRecord isEmpty");
        } else {
            final fln flnVar = new fln(ltb.h(System.currentTimeMillis()), i, 1, str);
            lsy.a(new Runnable() { // from class: fll.2
                @Override // java.lang.Runnable
                public void run() {
                    fll.this.a();
                    fll.this.b(flnVar);
                }
            });
        }
    }

    public void d(final long j, final long j2, final String str, final int i, final IBaseResponseCallback iBaseResponseCallback) {
        if (iBaseResponseCallback == null) {
            LogUtil.j("ClickRecordMgr", "queryClickRecordSum callback == null");
            throw new IllegalArgumentException("queryClickRecordSum callback == null");
        }
        if (TextUtils.isEmpty(str) || j > j2) {
            LogUtil.j("ClickRecordMgr", "queryClickRecordSum illegal input");
            iBaseResponseCallback.a(AwarenessConstants.ERROR_UNKNOWN_CODE, 0);
        } else {
            lsy.a(new Runnable() { // from class: fll.3
                @Override // java.lang.Runnable
                public void run() {
                    fll.this.a();
                    String strF = fll.this.f();
                    LogUtil.d("ClickRecordMgr", "queryClickRecordSum getSqlSumString sqlString = ", strF);
                    long j3 = j;
                    long j4 = j2;
                    fll.this.e(strF, new String[]{String.valueOf(j3), String.valueOf(j4), str, String.valueOf(i)}, iBaseResponseCallback);
                }
            });
        }
    }

    public int b(flr flrVar) {
        if (flrVar == null) {
            LogUtil.j("ClickRecordMgr", "queryClickRecordCount readOption is null");
            return 0;
        }
        String strA = flrVar.a();
        if (TextUtils.isEmpty(strA) || TextUtils.isEmpty(flrVar.h()) || flrVar.b() > flrVar.d()) {
            LogUtil.j("ClickRecordMgr", "queryClickRecordCount illegal input");
            return 0;
        }
        a();
        Cursor cursorRawQueryStorageData = rawQueryStorageData(1, b(), new String[]{String.valueOf(flrVar.b()), String.valueOf(flrVar.d()), strA, flrVar.h()});
        if (cursorRawQueryStorageData == null) {
            return 0;
        }
        int i = 0;
        while (cursorRawQueryStorageData.moveToNext()) {
            try {
                try {
                    i = cursorRawQueryStorageData.getInt(cursorRawQueryStorageData.getColumnIndex("total"));
                    LogUtil.d("ClickRecordMgr", "queryClickRecordCount counter = ", Integer.valueOf(i));
                } catch (SQLiteException e) {
                    LogUtil.e("ClickRecordMgr", "queryClickRecordCount exception is", ExceptionUtils.c(e));
                    cursorRawQueryStorageData.close();
                    return i;
                }
            } catch (Throwable th) {
                cursorRawQueryStorageData.close();
                throw th;
            }
        }
        cursorRawQueryStorageData.close();
        return i;
    }

    public void a(final long j, final long j2, final String str, final IBaseResponseCallback iBaseResponseCallback) {
        if (iBaseResponseCallback == null) {
            LogUtil.j("ClickRecordMgr", "queryAllRecord callback is null");
            throw new IllegalArgumentException("queryAllRecord callback == null");
        }
        if (TextUtils.isEmpty(str) || j > j2) {
            LogUtil.j("ClickRecordMgr", "queryAllRecord illegal input");
            iBaseResponseCallback.a(AwarenessConstants.ERROR_UNKNOWN_CODE, null);
        } else {
            lsy.a(new Runnable() { // from class: fll.1
                @Override // java.lang.Runnable
                public void run() {
                    fll.this.a();
                    String strE = fll.this.e();
                    LogUtil.d("ClickRecordMgr", "getSqlAllString sqlString = ", strE);
                    long j3 = j;
                    long j4 = j2;
                    fll.this.c(strE, new String[]{String.valueOf(j3), String.valueOf(j4), str}, iBaseResponseCallback);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(String str, String[] strArr, IBaseResponseCallback iBaseResponseCallback) {
        if (iBaseResponseCallback == null) {
            LogUtil.j("ClickRecordMgr", "queryAllRecord callback null");
            throw new IllegalArgumentException("queryAllRecord callback == null");
        }
        if (str == null || strArr == null) {
            LogUtil.j("ClickRecordMgr", "queryAllRecord null");
            iBaseResponseCallback.a(AwarenessConstants.ERROR_UNKNOWN_CODE, null);
            return;
        }
        Cursor cursorRawQueryStorageData = rawQueryStorageData(1, str, strArr);
        if (cursorRawQueryStorageData != null) {
            ArrayList arrayList = new ArrayList(10);
            while (cursorRawQueryStorageData.moveToNext()) {
                try {
                    try {
                        arrayList.add(new fln(cursorRawQueryStorageData.getLong(cursorRawQueryStorageData.getColumnIndex("timestamp")), cursorRawQueryStorageData.getInt(cursorRawQueryStorageData.getColumnIndex("type")), cursorRawQueryStorageData.getInt(cursorRawQueryStorageData.getColumnIndex("frequency")), cursorRawQueryStorageData.getString(cursorRawQueryStorageData.getColumnIndex("huid"))));
                    } catch (SQLiteException e) {
                        LogUtil.e("ClickRecordMgr", "queryAllRecord exception is", ExceptionUtils.c(e));
                    }
                } catch (Throwable th) {
                    cursorRawQueryStorageData.close();
                    throw th;
                }
            }
            cursorRawQueryStorageData.close();
            iBaseResponseCallback.a(0, arrayList);
            return;
        }
        iBaseResponseCallback.a(AwarenessConstants.ERROR_UNKNOWN_CODE, null);
    }

    public List<fln> e(flr flrVar) {
        String[] strArr;
        if (flrVar == null) {
            LogUtil.j("ClickRecordMgr", "queryClickTypeRecord readOption is null");
            return new ArrayList(0);
        }
        String strA = flrVar.a();
        if (TextUtils.isEmpty(strA) || TextUtils.isEmpty(flrVar.h()) || flrVar.b() > flrVar.d()) {
            LogUtil.j("ClickRecordMgr", "queryClickTypeRecord huid or type is null");
            return new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList(10);
        a();
        String strC = c(flrVar.e(), flrVar.c());
        if (flrVar.c() <= 0) {
            strArr = new String[]{String.valueOf(flrVar.b()), String.valueOf(flrVar.d()), strA, flrVar.h()};
        } else {
            strArr = new String[]{String.valueOf(flrVar.b()), String.valueOf(flrVar.d()), strA, flrVar.h(), String.valueOf(flrVar.c())};
        }
        Cursor cursorRawQueryStorageData = rawQueryStorageData(1, strC, strArr);
        if (cursorRawQueryStorageData != null) {
            while (cursorRawQueryStorageData.moveToNext()) {
                try {
                    try {
                        arrayList.add(new fln(cursorRawQueryStorageData.getLong(cursorRawQueryStorageData.getColumnIndex("timestamp")), cursorRawQueryStorageData.getInt(cursorRawQueryStorageData.getColumnIndex("type")), cursorRawQueryStorageData.getInt(cursorRawQueryStorageData.getColumnIndex("frequency")), cursorRawQueryStorageData.getString(cursorRawQueryStorageData.getColumnIndex("huid"))));
                    } catch (SQLiteException e) {
                        LogUtil.e("ClickRecordMgr", "queryClickTypeRecord Exception is ", ExceptionUtils.c(e));
                        cursorRawQueryStorageData.close();
                        return arrayList;
                    }
                } catch (Throwable th) {
                    cursorRawQueryStorageData.close();
                    throw th;
                }
            }
            cursorRawQueryStorageData.close();
            return arrayList;
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(String str, String[] strArr, IBaseResponseCallback iBaseResponseCallback) {
        if (iBaseResponseCallback == null) {
            LogUtil.j("ClickRecordMgr", "queryRecordSumOrCount callback null");
            throw new IllegalArgumentException("queryRecordSumOrCount callback == null");
        }
        if (str == null || strArr == null) {
            LogUtil.j("ClickRecordMgr", "queryRecordSumOrCount null");
            iBaseResponseCallback.a(AwarenessConstants.ERROR_UNKNOWN_CODE, 0);
            return;
        }
        Cursor cursorRawQueryStorageData = rawQueryStorageData(1, str, strArr);
        if (cursorRawQueryStorageData != null) {
            int i = 0;
            while (cursorRawQueryStorageData.moveToNext()) {
                try {
                    try {
                        i = cursorRawQueryStorageData.getInt(cursorRawQueryStorageData.getColumnIndex("total"));
                        LogUtil.d("ClickRecordMgr", "queryRecordSumOrCount counter = ", Integer.valueOf(i));
                    } catch (SQLiteException e) {
                        LogUtil.e("ClickRecordMgr", "queryRecordSumOrCount Exception is", ExceptionUtils.c(e));
                    }
                } catch (Throwable th) {
                    cursorRawQueryStorageData.close();
                    throw th;
                }
            }
            cursorRawQueryStorageData.close();
            iBaseResponseCallback.a(0, Integer.valueOf(i));
            return;
        }
        iBaseResponseCallback.a(AwarenessConstants.ERROR_UNKNOWN_CODE, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(fln flnVar) {
        synchronized (this) {
            if (flnVar == null) {
                LogUtil.j("ClickRecordMgr", "updateOrInsertRecord null");
                return;
            }
            try {
                if (a(flnVar)) {
                    LogUtil.d("ClickRecordMgr", "updateOrInsertRecord update result = ", Long.valueOf(c(flnVar)));
                } else {
                    LogUtil.d("ClickRecordMgr", "updateOrInsertRecord insert result = ", Long.valueOf(e(flnVar)));
                }
            } catch (SQLiteDatabaseLockedException unused) {
                ReleaseLogUtil.a("R_ClickRecordMgr", "updateOrInsertRecord SQLiteDatabaseLockedException");
                LogUtil.b("SqliteDatabaseLockedExceptionTag", "ErrorType: updateOrInsertRecord SQLiteDatabaseLockedException, biKey:", "2129026");
            }
        }
    }

    private String d() {
        StringBuilder sb = new StringBuilder(16);
        sb.append("_id integer primary key autoincrement,timestamp integer not null,type integer not null,frequency integer not null,huid text");
        return sb.toString();
    }

    private long c(fln flnVar) {
        if (flnVar == null) {
            LogUtil.j("ClickRecordMgr", "update null");
            return 200004L;
        }
        int iB = flnVar.b();
        ContentValues contentValues = new ContentValues();
        contentValues.put("frequency", Integer.valueOf(iB + 1));
        return updateStorageData("click_record", 1, contentValues, a(flnVar.a(), flnVar.d(), flnVar.e()));
    }

    private long e(fln flnVar) {
        if (flnVar == null) {
            LogUtil.j("ClickRecordMgr", "insert clickRecordInfo null");
            return 200004L;
        }
        return insertStorageData("click_record", 1, d(flnVar));
    }

    private boolean a(fln flnVar) {
        int count;
        if (flnVar == null) {
            LogUtil.j("ClickRecordMgr", "queryExist null");
            return false;
        }
        Cursor cursorQueryStorageData = queryStorageData("click_record", 1, a(flnVar.a(), flnVar.d(), flnVar.e()));
        if (cursorQueryStorageData != null) {
            try {
                count = cursorQueryStorageData.getCount();
                while (cursorQueryStorageData.moveToNext()) {
                    flnVar.b(cursorQueryStorageData.getInt(cursorQueryStorageData.getColumnIndex("frequency")));
                }
            } catch (Throwable th) {
                if (cursorQueryStorageData != null) {
                    try {
                        cursorQueryStorageData.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } else {
            count = 0;
        }
        if (cursorQueryStorageData != null) {
            cursorQueryStorageData.close();
        }
        return count != 0;
    }

    private String a(long j, int i, String str) {
        StringBuffer stringBuffer = new StringBuffer(16);
        stringBuffer.append("huid='").append(str).append("' AND type='").append(i).append("' AND timestamp='").append(j).append("'");
        return stringBuffer.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        if (this.d) {
            return;
        }
        synchronized (this.f34175a) {
            if (this.d) {
                return;
            }
            LogUtil.d("ClickRecordMgr", "create table error code =", Integer.valueOf(createStorageDataTable("click_record", 1, d())));
            this.d = true;
        }
    }

    private String b() {
        StringBuilder sb = new StringBuilder(16);
        sb.append("SELECT COUNT(*) AS total FROM ");
        sb.append(getTableFullName("click_record"));
        sb.append(" WHERE timestamp >=? and timestamp <=? and huid =? and type =? ");
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String f() {
        StringBuilder sb = new StringBuilder(16);
        sb.append("SELECT SUM(frequency) AS total FROM ");
        sb.append(getTableFullName("click_record"));
        sb.append(" WHERE timestamp >=? and timestamp <=? and huid =? and type =? ");
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String e() {
        StringBuilder sb = new StringBuilder(16);
        sb.append("SELECT * FROM ");
        sb.append(getTableFullName("click_record"));
        sb.append(" WHERE timestamp >=? and timestamp <=? and huid =? ");
        return sb.toString();
    }

    private String c(String str, int i) {
        StringBuilder sb = new StringBuilder(16);
        sb.append("SELECT * FROM ");
        sb.append(getTableFullName("click_record"));
        sb.append(" WHERE timestamp >=? and timestamp <=? and huid =? and type =? ");
        if (" asc ".equals(str)) {
            sb.append(" order by timestamp asc ");
        } else {
            sb.append(" order by timestamp desc ");
        }
        if (i > 0) {
            sb.append(" limit ? ");
        }
        return sb.toString();
    }
}
