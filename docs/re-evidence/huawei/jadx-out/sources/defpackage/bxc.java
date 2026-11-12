package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.huawei.health.healthmodel.bean.HealthLifeBean;
import com.huawei.hihealthservice.db.table.DBSessionCommon;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginachievement.manager.model.ParsedFieldTag;
import health.compact.a.CommonUtil;
import health.compact.a.LogAnonymous;
import health.compact.a.utils.StringUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class bxc {
    public static int d(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        return bxa.c("module_10031_health_task_records", "huid =? ", new String[]{str});
    }

    public static int a(String str, int i, int i2) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        return bxa.c("module_10031_health_task_records", "huid =? and id =? and recordDay =? ", new String[]{str, String.valueOf(i2), String.valueOf(i)});
    }

    public static int c(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        return bxa.c("module_10031_health_task_records", "huid =? and recordDay<?", new String[]{str, String.valueOf(i)});
    }

    public static int a(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        return bxa.c("module_10031_health_task_records", "huid =? and recordDay >? ", new String[]{str, String.valueOf(i)});
    }

    public static int d(int i, int i2) {
        return c("select count(*) as recordCount from module_10031_health_task_records where huid =? and status >=1 and recordDay >=? and recordDay <=? ", new String[]{cbg.q(), String.valueOf(i), String.valueOf(i2)});
    }

    public static int b(int i, int i2, int i3) {
        return c("select count(*) as recordCount from module_10031_health_task_records where huid =? and id =? and status >=1 and recordDay >=? and recordDay <=? ", new String[]{cbg.q(), String.valueOf(i3), String.valueOf(i), String.valueOf(i2)});
    }

    public static int d(int i, int i2, int i3) {
        return c("select count(*) as recordCount from module_10031_health_task_records where huid =? and id =? and status =4 and recordDay >=? and recordDay <=? ", new String[]{cbg.q(), String.valueOf(i3), String.valueOf(i), String.valueOf(i2)});
    }

    private static int c(String str, String[] strArr) {
        try {
            Cursor cursorC = bxa.c(str, strArr);
            try {
                if (cursorC == null) {
                    LogUtil.j("HL_RecordDatabaseHelper", "queryRecordCount cursor is null sql ", str, " selectionArgs ", strArr);
                    if (cursorC != null) {
                        cursorC.close();
                    }
                    return 0;
                }
                int i = cursorC.moveToNext() ? cursorC.getInt(cursorC.getColumnIndexOrThrow("recordCount")) : -1;
                if (cursorC != null) {
                    cursorC.close();
                }
                return i;
            } catch (Throwable th) {
                if (cursorC != null) {
                    try {
                        cursorC.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (Exception e) {
            LogUtil.e("HL_RecordDatabaseHelper", "queryRecordCount exception ", LogAnonymous.b(e));
            return -1;
        }
    }

    public static int c(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("HL_RecordDatabaseHelper", "resetAllDataSyncStatus userId:", str);
            return -1;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("syncStatus", (Integer) 0);
        int iA = bxa.a("module_10031_health_task_records", contentValues, "huid =? ", new String[]{str});
        LogUtil.a("HL_RecordDatabaseHelper", "resetAllDataSyncStatus flag:", Integer.valueOf(iA));
        return iA;
    }

    public static HealthLifeBean c(int i, int i2, String str) {
        if (TextUtils.isEmpty(str)) {
            return new HealthLifeBean();
        }
        return a("select * from module_10031_health_task_records where huid =? and id =? and recordDay =? ", new String[]{str, String.valueOf(i), String.valueOf(i2)});
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0035, code lost:
    
        if (r2 != null) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static HealthLifeBean a(String str, String[] strArr) {
        HealthLifeBean healthLifeBean = new HealthLifeBean();
        try {
            Cursor cursorC = bxa.c(str, strArr);
            try {
                if (cursorC == null) {
                    LogUtil.j("HL_RecordDatabaseHelper", "query cursor is null sql ", str, " selectionArgs ", strArr);
                    if (cursorC != null) {
                        cursorC.close();
                        return healthLifeBean;
                    }
                    return healthLifeBean;
                }
                if (cursorC.moveToFirst()) {
                    do {
                        a(cursorC, healthLifeBean);
                    } while (cursorC.moveToNext());
                }
            } catch (Throwable th) {
                if (cursorC != null) {
                    try {
                        cursorC.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (Exception e) {
            LogUtil.e("HL_RecordDatabaseHelper", "query exception ", LogAnonymous.b(e));
        }
    }

    public static List<HealthLifeBean> a(int i, int i2, String str) {
        if (TextUtils.isEmpty(str)) {
            return Collections.EMPTY_LIST;
        }
        return e("select * from module_10031_health_task_records where huid =? and syncStatus <=? and recordDay between " + i + " and " + i2 + " order by recordDay asc ", new String[]{str, String.valueOf(0)});
    }

    public static List<HealthLifeBean> b(int i, int i2, String str) {
        if (TextUtils.isEmpty(str)) {
            return Collections.EMPTY_LIST;
        }
        return e("select * from module_10031_health_task_records where huid =? and recordDay >=? and recordDay <=? ", new String[]{str, String.valueOf(i), String.valueOf(i2)});
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003d, code lost:
    
        if (r2 != null) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static List<HealthLifeBean> e(String str, String[] strArr) {
        ArrayList arrayList = new ArrayList();
        try {
            Cursor cursorC = bxa.c(str, strArr);
            try {
                if (cursorC == null) {
                    LogUtil.j("HL_RecordDatabaseHelper", "queryList cursor is null sql ", str, " selectionArgs ", strArr);
                    if (cursorC != null) {
                        cursorC.close();
                        return arrayList;
                    }
                    return arrayList;
                }
                if (cursorC.moveToFirst()) {
                    do {
                        HealthLifeBean healthLifeBean = new HealthLifeBean();
                        a(cursorC, healthLifeBean);
                        arrayList.add(healthLifeBean);
                    } while (cursorC.moveToNext());
                }
            } catch (Throwable th) {
                if (cursorC != null) {
                    try {
                        cursorC.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (Exception e) {
            LogUtil.e("HL_RecordDatabaseHelper", "queryList exception ", LogAnonymous.b(e));
        }
    }

    private static void a(Cursor cursor, HealthLifeBean healthLifeBean) {
        try {
            healthLifeBean.setRest(cursor.getInt(cursor.getColumnIndexOrThrow("restStatus")));
            healthLifeBean.setTimeZone(cursor.getString(cursor.getColumnIndexOrThrow(DBSessionCommon.COLUMN_TIME_ZONE)));
            healthLifeBean.setCondition(cursor.getString(cursor.getColumnIndexOrThrow("condition")));
            healthLifeBean.setReserve(cursor.getString(cursor.getColumnIndexOrThrow("reserve")));
            healthLifeBean.setResult(cursor.getString(cursor.getColumnIndexOrThrow("result")));
            healthLifeBean.setTarget(cursor.getString(cursor.getColumnIndexOrThrow("target")));
            healthLifeBean.setHuid(cursor.getString(cursor.getColumnIndexOrThrow("huid")));
            healthLifeBean.setTimestamp(cursor.getLong(cursor.getColumnIndexOrThrow("timestamp")));
            healthLifeBean.setId(cursor.getInt(cursor.getColumnIndexOrThrow("id")));
            healthLifeBean.setType(cursor.getInt(cursor.getColumnIndexOrThrow("type")));
            healthLifeBean.setComplete(cursor.getInt(cursor.getColumnIndexOrThrow("status")));
            healthLifeBean.setRecordDay(cursor.getInt(cursor.getColumnIndexOrThrow(ParsedFieldTag.RECORD_DAY)));
            healthLifeBean.setSyncStatus(cursor.getInt(cursor.getColumnIndexOrThrow("syncStatus")));
            healthLifeBean.setChallengeId(cursor.getInt(cursor.getColumnIndexOrThrow("challengeId")));
            healthLifeBean.setDataSource(cursor.getInt(cursor.getColumnIndexOrThrow("dataSource")));
            healthLifeBean.setTaskType(cursor.getInt(cursor.getColumnIndexOrThrow(ParsedFieldTag.TASK_TYPE)));
        } catch (SQLiteException | IllegalArgumentException e) {
            LogUtil.e("HL_RecordDatabaseHelper", "conversion exception ", LogAnonymous.b(e));
        }
    }

    public static long a(List<HealthLifeBean> list, String str) {
        if (njy.e(list) || TextUtils.isEmpty(str)) {
            return -1L;
        }
        Iterator<HealthLifeBean> it = list.iterator();
        long j = 0;
        while (it.hasNext()) {
            if (a(it.next(), str) == -1) {
                j = -1;
            }
        }
        return j;
    }

    public static long a(HealthLifeBean healthLifeBean, String str) {
        if (!cbg.h(healthLifeBean) || TextUtils.isEmpty(str)) {
            return -1L;
        }
        HealthLifeBean healthLifeBeanC = c(healthLifeBean.getId(), healthLifeBean.getRecordDay(), str);
        if (cbg.h(healthLifeBeanC)) {
            if (d(healthLifeBean, healthLifeBeanC)) {
                return d(healthLifeBean, str);
            }
            return 0L;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("restStatus", Integer.valueOf(healthLifeBean.getRest()));
        contentValues.put(DBSessionCommon.COLUMN_TIME_ZONE, healthLifeBean.getTimeZone());
        contentValues.put("huid", str);
        contentValues.put("id", Integer.valueOf(healthLifeBean.getId()));
        contentValues.put("type", Integer.valueOf(healthLifeBean.getType()));
        contentValues.put("status", Integer.valueOf(healthLifeBean.getComplete()));
        contentValues.put("target", StringUtils.c((Object) healthLifeBean.getTarget()));
        contentValues.put("result", StringUtils.c((Object) healthLifeBean.getResult()));
        contentValues.put("timestamp", Long.valueOf(healthLifeBean.getTimestamp()));
        contentValues.put("condition", healthLifeBean.getCondition());
        contentValues.put("reserve", healthLifeBean.getReserve());
        contentValues.put(ParsedFieldTag.RECORD_DAY, Integer.valueOf(healthLifeBean.getRecordDay()));
        contentValues.put("syncStatus", Integer.valueOf(healthLifeBean.getSyncStatus()));
        contentValues.put("challengeId", Integer.valueOf(healthLifeBean.getChallengeId()));
        contentValues.put(ParsedFieldTag.TASK_TYPE, Integer.valueOf(healthLifeBean.getTaskType()));
        contentValues.put("dataSource", Integer.valueOf(healthLifeBean.getDataSource()));
        return bxa.d("module_10031_health_task_records", contentValues);
    }

    public static void e(List<HealthLifeBean> list, String str) {
        if (njy.e(list) || TextUtils.isEmpty(str)) {
            LogUtil.j("HL_RecordDatabaseHelper", "updateList list ", list, " userId ", str);
            return;
        }
        Iterator<HealthLifeBean> it = list.iterator();
        while (it.hasNext()) {
            d(it.next(), str);
        }
    }

    private static int d(HealthLifeBean healthLifeBean, String str) {
        if (!cbg.h(healthLifeBean) || TextUtils.isEmpty(str)) {
            LogUtil.j("HL_RecordDatabaseHelper", "update bean ", healthLifeBean, " userId ", str);
            return -1;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("restStatus", Integer.valueOf(healthLifeBean.getRest()));
        contentValues.put(DBSessionCommon.COLUMN_TIME_ZONE, healthLifeBean.getTimeZone());
        contentValues.put("status", Integer.valueOf(healthLifeBean.getComplete()));
        contentValues.put("target", StringUtils.c((Object) healthLifeBean.getTarget()));
        contentValues.put("result", StringUtils.c((Object) healthLifeBean.getResult()));
        contentValues.put("timestamp", Long.valueOf(healthLifeBean.getTimestamp()));
        contentValues.put("syncStatus", Integer.valueOf(healthLifeBean.getSyncStatus()));
        contentValues.put("challengeId", Integer.valueOf(healthLifeBean.getChallengeId()));
        contentValues.put(ParsedFieldTag.TASK_TYPE, Integer.valueOf(healthLifeBean.getTaskType()));
        contentValues.put("dataSource", Integer.valueOf(healthLifeBean.getDataSource()));
        return bxa.a("module_10031_health_task_records", contentValues, "huid =? and id =? and recordDay =? ", new String[]{str, String.valueOf(healthLifeBean.getId()), String.valueOf(healthLifeBean.getRecordDay())});
    }

    private static boolean d(HealthLifeBean healthLifeBean, HealthLifeBean healthLifeBean2) {
        int complete = healthLifeBean.getComplete();
        int complete2 = healthLifeBean2.getComplete();
        int iA = a(healthLifeBean.getId(), healthLifeBean.getResult());
        int iA2 = a(healthLifeBean2.getId(), healthLifeBean2.getResult());
        if (complete <= 0 && complete2 <= 0) {
            if (iA > iA2) {
                return true;
            }
            if (iA != iA2 || healthLifeBean.getChallengeId() == healthLifeBean2.getChallengeId()) {
                return false;
            }
            return healthLifeBean.getIsUpdated();
        }
        if (complete > 0 && complete2 <= 0) {
            return true;
        }
        if (complete <= 0) {
            return false;
        }
        if (TextUtils.isEmpty(healthLifeBean.getResult()) || !TextUtils.isEmpty(healthLifeBean2.getResult())) {
            return (!TextUtils.isEmpty(healthLifeBean.getResult()) || TextUtils.isEmpty(healthLifeBean2.getResult())) && iA >= iA2;
        }
        return true;
    }

    private static int a(int i, String str) {
        if (i == 7 || i == 6) {
            return 0;
        }
        return CommonUtil.j(str);
    }
}
