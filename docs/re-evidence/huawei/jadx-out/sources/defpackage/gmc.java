package defpackage;

import android.content.BroadcastReceiver;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import com.huawei.basefitnessadvice.callback.UiCallback;
import com.huawei.basefitnessadvice.model.PlanRecord;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.plan.model.model.fitness.FitnessHistoryModel;
import com.huawei.health.suggestion.ResultCallback;
import com.huawei.hwbasemgr.HwBaseManager;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.OpAnalyticsUtil;
import health.compact.a.DbManager;
import health.compact.a.LogAnonymous;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes29.dex */
public class gmc extends HwBaseManager {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile gmc f35664b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static i f35665c;
    private j d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Locale f35663a = Locale.getDefault();
    private static volatile boolean e = false;

    private gmc(Context context) throws Throwable {
        super(context);
        if (this.d == null) {
            LogUtil.a("Suggestion_DatabaseManager", "registerLocaleChangeBroadcastReceiver");
            y();
        }
        if (f35665c == null) {
            f35665c = new i();
        }
        int iE = ifp.e((Object) buh.e("DATABASE_VERSION_KEY"));
        LogUtil.a("Suggestion_DatabaseManager", "oldVersion = ", Integer.valueOf(iE), "  DATABASE_VERSION = ", 30);
        if (iE != 0 && i()) {
            btt.d().c(new Runnable() { // from class: glz
                @Override // java.lang.Runnable
                public final void run() {
                    this.f35648c.p();
                }
            });
        } else if (iE < 30) {
            v();
            e(iE);
        }
    }

    /* synthetic */ void p() {
        FitnessHistoryModel.getInstance().downloadFitnessRecordFromCloud(new ResultCallback() { // from class: gmd
            @Override // com.huawei.health.suggestion.ResultCallback
            public final void onResult(int i2, Object obj) {
                this.e.c(i2, obj);
            }
        });
    }

    /* synthetic */ void c(int i2, Object obj) {
        LogUtil.a("Suggestion_DatabaseManager", "downloadFitnessRecordFromCloud resultCode = ", Integer.valueOf(i2), " object ", "", obj);
        gme.c().c(new UiCallback<List<PlanRecord>>() { // from class: gmc.1
            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            public void onFailure(int i3, String str) {
                LogUtil.a("Suggestion_DatabaseManager", "downloadFitnessRecordFromCloud, getPlanRecords errcode = ", Integer.valueOf(i3), " errorInfo ", str);
            }

            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onSuccess(List<PlanRecord> list) {
                LogUtil.a("Suggestion_DatabaseManager", "downloadFitnessRecordFromCloud getPlanRecords success.");
            }
        });
    }

    public boolean i() throws Throwable {
        if (w()) {
            return false;
        }
        ReleaseLogUtil.d("Suggestion_DatabaseManager", "reset database version");
        OpAnalyticsUtil.getInstance().setProbabilityProblemEvent("DatabaseManager", "rebuildDatabase");
        v();
        e(0);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0049  */
    /* JADX WARN: Code duplicated, block: B:32:? A[RETURN, SYNTHETIC] */
    private boolean w() {
        int columnCount;
        try {
            Cursor cursorRawQueryStorageData = rawQueryStorageData(1, "select * from " + getTableFullName("workout_record") + " LIMIT 1", new String[0]);
            if (cursorRawQueryStorageData != null) {
                try {
                    columnCount = cursorRawQueryStorageData.getColumnCount();
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
            } else {
                columnCount = 0;
            }
            if (cursorRawQueryStorageData != null) {
                try {
                    cursorRawQueryStorageData.close();
                } catch (SQLiteException unused) {
                    ReleaseLogUtil.a("Suggestion_DatabaseManager", "getColumnNum(), SQLiteException");
                }
            }
        } catch (SQLiteException unused2) {
            columnCount = 0;
            ReleaseLogUtil.a("Suggestion_DatabaseManager", "getColumnNum(), SQLiteException");
            if (columnCount != 0) {
                return true;
            }
            return false;
        }
        if (columnCount != 0) {
            return true;
        }
        return false;
    }

    private void e(int i2) throws Throwable {
        a(i2, 30);
        buh.d("DATABASE_VERSION_KEY", String.valueOf(30));
    }

    public static gmc g() {
        if (f35664b == null) {
            LogUtil.a("Suggestion_DatabaseManager", "start getInstance");
            synchronized (gmc.class) {
                if (f35664b == null) {
                    f35664b = new gmc(btx.c());
                }
            }
            LogUtil.a("Suggestion_DatabaseManager", "end getInstance");
        }
        return f35664b;
    }

    private void a(int i2, int i3) throws Throwable {
        LogUtil.a("Suggestion_DatabaseManager", "onUpgrade(): oldVersion:", Integer.valueOf(i2));
        int i4 = i2 + 1;
        if (i4 <= 8) {
            LogUtil.a("Suggestion_DatabaseManager", "tempOldVersion : ", Integer.valueOf(i4));
            a(i4);
            i4 = 9;
        }
        if (i4 == 9) {
            LogUtil.a("Suggestion_DatabaseManager", "tempOldVersion : ", Integer.valueOf(i4));
            d(i4);
            i4 = 10;
        }
        if (i4 <= 16) {
            LogUtil.a("Suggestion_DatabaseManager", "tempOldVersion : ", Integer.valueOf(i4));
            af();
            i4 = 17;
        }
        if (i4 <= 22) {
            LogUtil.a("Suggestion_DatabaseManager", "tempOldVersion : ", Integer.valueOf(i4));
            ac();
            i4 = 23;
        }
        if (i4 == 23) {
            LogUtil.a("Suggestion_DatabaseManager", "tempOldVersion : ", Integer.valueOf(i4));
            ad();
            i4 = 24;
        }
        int iB = b(i4);
        if (iB == 26) {
            LogUtil.a("Suggestion_DatabaseManager", "tempOldVersion : is 26");
            glw.c().b();
            ae();
            iB = 27;
        }
        if (iB == 27) {
            LogUtil.a("Suggestion_DatabaseManager", "tempOldVersion : is 27");
            glw.c().b();
            u();
            iB = 28;
        }
        if (iB == 28) {
            LogUtil.a("Suggestion_DatabaseManager", "tempOldVersion : is 28");
            aa();
            iB = 29;
        }
        if (iB == 29) {
            LogUtil.a("Suggestion_DatabaseManager", "tempOldVersion : is 29");
            x();
        } else if (iB != 30) {
            return;
        }
        LogUtil.a("Suggestion_DatabaseManager", ",tempOldVersion : is 30");
        u();
    }

    private int b(int i2) throws Throwable {
        if (i2 == 24) {
            LogUtil.a("Suggestion_DatabaseManager", "tempOldVersion : ", Integer.valueOf(i2));
            glw.c().b();
            u();
            ab();
            i2 = 25;
        }
        if (i2 != 25) {
            return i2;
        }
        LogUtil.a("Suggestion_DatabaseManager", "tempOldVersion : ", Integer.valueOf(i2));
        z();
        return 26;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0062  */
    private void aa() throws Throwable {
        boolean z;
        String strValueOf = String.valueOf(getModuleId());
        String tableFullName = getTableFullName("workout_record");
        boolean z2 = false;
        try {
            if (DbManager.i(String.valueOf(getModuleId()))) {
                z = false;
            } else {
                h();
                z = true;
            }
            try {
                try {
                    DbManager.c(strValueOf, "ALTER TABLE " + tableFullName + " ADD sportRecordType INTEGER DEFAULT 0");
                    if (z) {
                        f();
                    }
                } catch (SQLiteException e2) {
                    e = e2;
                    ReleaseLogUtil.a("Suggestion_DatabaseManager", "SQLiteDatabaseLockedException:", LogAnonymous.b(e));
                    if (z) {
                        f();
                    }
                }
            } catch (Throwable th) {
                th = th;
                z2 = z;
                if (z2) {
                    f();
                }
                throw th;
            }
        } catch (SQLiteException e3) {
            e = e3;
            z = false;
        } catch (Throwable th2) {
            th = th2;
            if (z2) {
                f();
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0087 A[PHI: r7
      0x0087: PHI (r7v3 boolean) = (r7v2 boolean), (r7v9 boolean) binds: [B:18:0x0085, B:9:0x006c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:25:0x0098  */
    private void x() throws Throwable {
        boolean z;
        String strValueOf = String.valueOf(getModuleId());
        String tableFullName = getTableFullName(gmh.c());
        String tableFullName2 = getTableFullName("workout_record");
        boolean z2 = false;
        try {
            try {
                if (DbManager.i(String.valueOf(getModuleId()))) {
                    z = false;
                } else {
                    h();
                    z = true;
                }
                try {
                    DbManager.c(strValueOf, "ALTER TABLE " + tableFullName + " ADD isAi INTEGER DEFAULT 0");
                    DbManager.c(strValueOf, "ALTER TABLE " + tableFullName2 + " ADD totalScore INTEGER");
                    DbManager.c(strValueOf, "ALTER TABLE " + tableFullName2 + " ADD recordModeType INTEGER DEFAULT 0");
                    if (z) {
                        f();
                    }
                } catch (SQLiteException e2) {
                    e = e2;
                    ReleaseLogUtil.a("Suggestion_DatabaseManager", "SQLiteDatabaseLockedException:", LogAnonymous.b(e));
                    if (z) {
                        f();
                    }
                }
            } catch (Throwable th) {
                th = th;
                z2 = z;
                if (z2) {
                    f();
                }
                throw th;
            }
        } catch (SQLiteException e3) {
            e = e3;
            z = false;
        } catch (Throwable th2) {
            th = th2;
            if (z2) {
                f();
            }
            throw th;
        }
        LogUtil.a("Suggestion_DatabaseManager", "updateAiFitWorkoutRecord end.");
    }

    private void u() {
        String strValueOf = String.valueOf(getModuleId());
        String tableFullName = getTableFullName(gmh.d());
        List<String> listE = DbManager.e(strValueOf);
        if (!njy.e(listE)) {
            for (String str : listE) {
                if (str != null && str.contains(tableFullName)) {
                    DbManager.c(strValueOf, "DROP TABLE IF EXISTS " + str);
                }
            }
        }
        HashMap map = new HashMap();
        map.put(gmh.c(), gmh.d);
        a(map);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0076  */
    private void ab() throws Throwable {
        boolean z;
        String strValueOf = String.valueOf(getModuleId());
        String tableFullName = getTableFullName("workout_record");
        boolean z2 = false;
        try {
            try {
                if (DbManager.i(String.valueOf(getModuleId()))) {
                    z = false;
                } else {
                    h();
                    z = true;
                }
                try {
                    DbManager.c(strValueOf, "ALTER TABLE " + tableFullName + " ADD intensityZone TEXT");
                    DbManager.c(strValueOf, "ALTER TABLE " + tableFullName + " ADD trainPoint INTEGER");
                    if (z) {
                        f();
                    }
                } catch (SQLiteException e2) {
                    e = e2;
                    ReleaseLogUtil.a("Suggestion_DatabaseManager", "SQLiteDatabaseLockedException:", LogAnonymous.b(e));
                    if (z) {
                        f();
                    }
                }
            } catch (Throwable th) {
                th = th;
                z2 = z;
                if (z2) {
                    f();
                }
                throw th;
            }
        } catch (SQLiteException e3) {
            e = e3;
            z = false;
        } catch (Throwable th2) {
            th = th2;
            if (z2) {
                f();
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0074 A[PHI: r6
      0x0074: PHI (r6v3 boolean) = (r6v2 boolean), (r6v9 boolean) binds: [B:18:0x0072, B:9:0x0059] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:25:0x0085  */
    private void z() throws Throwable {
        boolean z;
        LogUtil.a("Suggestion_DatabaseManager", "updatePlanRecordTable start.");
        String strValueOf = String.valueOf(getModuleId());
        String tableFullName = getTableFullName("plan_records");
        boolean z2 = false;
        try {
            try {
                if (DbManager.i(String.valueOf(getModuleId()))) {
                    z = false;
                } else {
                    h();
                    z = true;
                }
                try {
                    DbManager.c(strValueOf, "ALTER TABLE " + tableFullName + " ADD actualDuration REAL");
                    DbManager.c(strValueOf, "ALTER TABLE " + tableFullName + " ADD planCategory INTEGER");
                    if (z) {
                        f();
                    }
                } catch (SQLiteException e2) {
                    e = e2;
                    ReleaseLogUtil.a("Suggestion_DatabaseManager", "SQLiteDatabaseLockedException:", LogAnonymous.b(e));
                    if (z) {
                        f();
                    }
                }
            } catch (Throwable th) {
                th = th;
                z2 = z;
                if (z2) {
                    f();
                }
                throw th;
            }
        } catch (SQLiteException e3) {
            e = e3;
            z = false;
        } catch (Throwable th2) {
            th = th2;
            if (z2) {
                f();
            }
            throw th;
        }
        LogUtil.a("Suggestion_DatabaseManager", "updatePlanRecordTable end.");
    }

    private void a(int i2) {
        String strValueOf = String.valueOf(getModuleId());
        DbManager.c(strValueOf, "ALTER TABLE " + getTableFullName("workout_record") + " ADD wearType INTEGER DEFAULT 0");
        String str = "ALTER TABLE " + getTableFullName("workout_record") + " ADD extend TEXT";
        DbManager.c(strValueOf, str);
        LogUtil.a("Suggestion_DatabaseManager", "onUpgrade(): initVersion:", Integer.valueOf(i2), " sql:", str);
    }

    private void d(int i2) {
        String strValueOf = String.valueOf(getModuleId());
        String str = "ALTER TABLE " + getTableFullName("workout_record") + " ADD recordIndex INTEGER DEFAULT 0";
        DbManager.c(strValueOf, str);
        LogUtil.a("Suggestion_DatabaseManager", "onUpgrade(): initVersion:", Integer.valueOf(i2), " sql:", str);
    }

    private void ae() {
        String strValueOf = String.valueOf(getModuleId());
        String tableFullName = getTableFullName(gmh.d());
        List<String> listE = DbManager.e(strValueOf);
        if (njy.e(listE)) {
            return;
        }
        for (String str : listE) {
            if (str != null && str.contains(tableFullName)) {
                DbManager.c(strValueOf, "ALTER TABLE " + str + " ADD commodityFlag INTEGER");
                DbManager.c(strValueOf, "ALTER TABLE " + str + " ADD iconDisplay INTEGER");
                DbManager.c(strValueOf, "ALTER TABLE " + str + " ADD iconMessages TEXT");
            }
        }
    }

    private void af() {
        String strValueOf = String.valueOf(getModuleId());
        String tableFullName = getTableFullName("workout_record");
        DbManager.c(strValueOf, "ALTER TABLE " + tableFullName + " ADD heartRateList TEXT");
        DbManager.c(strValueOf, "ALTER TABLE " + tableFullName + " ADD invalidHeartRateList TEXT");
        LogUtil.a("Suggestion_DatabaseManager", "upgradeFitWorkoutAndRecordInfoTable upgrade() finish");
    }

    private void ac() {
        String strValueOf = String.valueOf(getModuleId());
        String tableFullName = getTableFullName("workout_record");
        List<String> listE = DbManager.e(strValueOf);
        if (njy.b(listE)) {
            for (String str : listE) {
                if (str != null && str.contains(tableFullName)) {
                    DbManager.c(strValueOf, "ALTER TABLE " + tableFullName + " ADD category INTEGER");
                }
            }
        }
    }

    private void ad() {
        String strValueOf = String.valueOf(getModuleId());
        String tableFullName = getTableFullName("workout_record");
        List<String> listE = DbManager.e(strValueOf);
        String[] strArr = {"'Y001'", "'Y002'", "'Y003'", "'Y004'", "'Y005'", "'Y006'", "'Y007'", "'Y008'", "'Y009'", "'Y010'", "'Y015'", "'Y016'", "'Y017'", "'Y018'"};
        if (njy.b(listE)) {
            for (String str : listE) {
                if (str != null && str.contains(tableFullName)) {
                    for (int i2 = 0; i2 < 14; i2++) {
                        DbManager.c(strValueOf, "UPDATE " + tableFullName + " SET category = 137 WHERE workoutId = " + strArr[i2]);
                    }
                }
            }
        }
    }

    @Override // com.huawei.hwbasemgr.HwBaseManager
    public Integer getModuleId() {
        return 101010;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v() {
        LogUtil.a("Suggestion_DatabaseManager", "initDb");
        Map<String, String> mapR = r();
        if (a(mapR)) {
            return;
        }
        LogUtil.j("Suggestion_DatabaseManager", "create all table failed.");
        if (deleteDatabase()) {
            a(mapR);
        } else {
            LogUtil.e("Suggestion_DatabaseManager", "data base error.");
        }
    }

    private boolean a(Map<String, String> map) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (createStorageDataTable(entry.getKey(), 1, entry.getValue()) != 0) {
                arrayList.add(entry.getKey());
            }
        }
        LogUtil.a("Suggestion_DatabaseManager", "create failed table list: ", Arrays.toString(arrayList.toArray()));
        return arrayList.isEmpty();
    }

    private Map<String, String> r() {
        HashMap map = new HashMap(18);
        map.put("plan_records", "planId TEXT,userId TEXT,planType INTEGER,difficulty INTEGER,workoutDays INTEGER,status INTEGER DEFAULT 0,planName TEXT,calorie REAL,distance REAL,actualCalorie REAL,actualDistance REAL,actualDuration REAL,finishRate REAL,goal INTEGER, INTEGER,weekCount INTEGER,workoutCount INTEGER,workoutTimes INTEGER,startDate TEXT,endDate TEXT,version TEXT,finishDate TEXT,excludedDates TEXT,weekTimes INTEGER,workoutRecords INTEGER,planCategory INTEGER,PRIMARY KEY(userId,planId)");
        map.put("workout_record", gmv.f35758b);
        map.put("plans", "recordId INTEGER PRIMARY KEY AUTOINCREMENT,planId TEXT,lan TEXT,version TEXT,content TEXT");
        map.put("best_record", "recordId INTEGER PRIMARY KEY AUTOINCREMENT,planId TEXT,userId TEXT,type INTEGER,value TEXT,status INTEGER");
        map.put("data_sync", "recordId INTEGER PRIMARY KEY AUTOINCREMENT,planId TEXT,userId TEXT,type INTEGER,value TEXT,syncTimes INTEGER");
        map.put(gmh.c(), gmh.d);
        map.put("fitness_total_record", "recordId INTEGER PRIMARY KEY AUTOINCREMENT,userId TEXT,recordDate INTEGER,recordTime INTEGER,recordCalorie REAL,recordDuration INTEGER,recordStatus INTEGER,recordTotalCalorie REAL,recordTotalDuration INTEGER,dayLastRecord INTEGER");
        map.put("best_record_fit", "recordId INTEGER PRIMARY KEY AUTOINCREMENT,actionId TEXT,userId TEXT,type INTEGER,value TEXT,completeTime INTEGER,status INTEGER");
        map.put("train_count", "recordId INTEGER PRIMARY KEY AUTOINCREMENT,userId TEXT,id TEXT,count INTEGER");
        return map;
    }

    public void h() {
        DbManager.a(String.valueOf(getModuleId()));
    }

    public void f() {
        try {
            DbManager.d(String.valueOf(getModuleId()));
        } catch (IllegalStateException unused) {
            ReleaseLogUtil.a("Suggestion_DatabaseManager", "endTransaction IllegalStateException");
        }
    }

    public glc j() {
        return c.f35667c;
    }

    public gmq s() {
        return h.d;
    }

    public gmo l() {
        return f.e;
    }

    public glv n() {
        return d.d;
    }

    public gmh o() {
        return e.e;
    }

    public gma k() {
        return a.d;
    }

    public gla m() {
        return b.d;
    }

    public gmx q() {
        return g.f35668c;
    }

    static final class c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final glc f35667c = new glc();
    }

    static final class h {
        private static final gmq d = new gmq();
    }

    static final class f {
        private static final gmo e = new gmo();
    }

    static final class d {
        private static final glv d = new glv();
    }

    static final class e {
        private static final gmh e = new gmh();
    }

    static final class a {
        private static final gma d = new gma();
    }

    static final class b {
        private static final gla d = new gla();
    }

    static final class g {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final gmx f35668c = new gmx();
    }

    private void y() {
        this.d = new j();
        btx.c().registerReceiver(this.d, new IntentFilter("android.intent.action.LOCALE_CHANGED"));
    }

    static class j extends BroadcastReceiver {
        private j() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            LogUtil.a("Suggestion_DatabaseManager", "LocaleChangeBroadcastReceiver#onReceive()");
            if (intent == null) {
                ReleaseLogUtil.a("Suggestion_DatabaseManager", "LocaleChangeReceiver, intent is null");
                return;
            }
            if (!"android.intent.action.LOCALE_CHANGED".equals(intent.getAction())) {
                ReleaseLogUtil.a("Suggestion_DatabaseManager", "Receiver not ACTION_LOCALE_CHANGED");
                return;
            }
            Locale locale = BaseApplication.b().getResources().getConfiguration().locale;
            if (locale == null || locale.equals(gmc.f35663a)) {
                if (gmc.f35665c == null || gmc.e) {
                    return;
                }
                ReleaseLogUtil.d("Suggestion_DatabaseManager", "registermLocaleChangeComponentCallbacks");
                BaseApplication.f().registerComponentCallbacks(gmc.f35665c);
                boolean unused = gmc.e = true;
                return;
            }
            ReleaseLogUtil.d("Suggestion_DatabaseManager", "LocaleChangeReceiver, Language change");
            Locale unused2 = gmc.f35663a = locale;
            gmc.t();
        }
    }

    static class i implements ComponentCallbacks {
        @Override // android.content.ComponentCallbacks
        public void onLowMemory() {
        }

        private i() {
        }

        @Override // android.content.ComponentCallbacks
        public void onConfigurationChanged(Configuration configuration) {
            LogUtil.a("Suggestion_DatabaseManager", "sCurrentLocale=", gmc.f35663a, ",newLocale=", configuration.locale);
            if (configuration.locale != null && !configuration.locale.equals(gmc.f35663a)) {
                Locale unused = gmc.f35663a = configuration.locale;
                gmc.t();
            }
            BaseApplication.f().unregisterComponentCallbacks(this);
            boolean unused2 = gmc.e = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void t() {
        ThreadPoolManager.c().b("Suggestion_DatabaseManager", new Runnable() { // from class: gmc.3
            @Override // java.lang.Runnable
            public void run() {
                xkf.q(xkf.c());
                ReleaseLogUtil.d("Suggestion_DatabaseManager", "initDatabase thread executed");
                if (gmc.f35664b != null) {
                    ReleaseLogUtil.d("Suggestion_DatabaseManager", "initDatabase start");
                    gmc.f35664b.v();
                }
            }
        });
    }
}
