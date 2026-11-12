package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import android.util.SparseArray;
import com.huawei.basichealthmodel.bean.TaskConfigBean;
import com.huawei.health.healthmodel.bean.HealthLifeBean;
import com.huawei.hihealthservice.db.table.DBSessionCommon;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginachievement.manager.model.ParsedFieldTag;
import health.compact.a.CommonUtils;
import health.compact.a.LogAnonymous;
import health.compact.a.utils.StringUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class bxd {
    public static List<HealthLifeBean> e(String str, int i, SparseArray<TaskConfigBean> sparseArray, boolean z) {
        String strE;
        if (TextUtils.isEmpty(str)) {
            return Collections.EMPTY_LIST;
        }
        HealthLifeBean healthLifeBeanD = d(str, 1, i);
        if (cbg.h(healthLifeBeanD)) {
            strE = healthLifeBeanD.getTarget();
        } else {
            healthLifeBeanD = new HealthLifeBean();
            healthLifeBeanD.setId(1);
            healthLifeBeanD.setRecordDay(i);
            strE = "";
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (TextUtils.isEmpty(strE)) {
            LogUtil.j("HL_ConfigDatabaseHelper", "use default task");
            strE = cfu.e(sparseArray);
            healthLifeBeanD.setTarget(strE);
            healthLifeBeanD.setLastTarget(strE);
            healthLifeBeanD.setAddStatus(1);
            healthLifeBeanD.setTimestamp(DateFormatUtil.d(i));
            healthLifeBeanD.setTimeZone(lsl.q(jCurrentTimeMillis));
        }
        List<Integer> listA = cfu.a(sparseArray);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        b(listA, arrayList, arrayList2, Arrays.asList(strE.split(",")), sparseArray);
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(healthLifeBeanD);
        arrayList3.addAll(c(arrayList, 1, i, sparseArray, str));
        if (!z && i < DateFormatUtil.a(jCurrentTimeMillis)) {
            return arrayList3;
        }
        arrayList3.addAll(c(arrayList2, 0, i, sparseArray, str));
        return arrayList3;
    }

    private static void b(List<Integer> list, List<Integer> list2, List<Integer> list3, List<String> list4, SparseArray<TaskConfigBean> sparseArray) {
        if (njy.e(list4)) {
            LogUtil.j("HL_ConfigDatabaseHelper", "setListForQueryOneDay idStringList ", list4);
            return;
        }
        if (list4.contains(String.valueOf(4))) {
            list.add(4);
        }
        for (Integer num : list) {
            if (list4.contains(String.valueOf(num))) {
                list2.add(num);
            } else if (cbg.b(num.intValue()) && sparseArray != null) {
                TaskConfigBean taskConfigBean = sparseArray.get(num.intValue());
                if (taskConfigBean != null && "false".equals(taskConfigBean.getSupportTask())) {
                    LogUtil.a("HL_ConfigDatabaseHelper", "queryOneDay getSupportTask false id ", num);
                } else {
                    list3.add(num);
                }
            }
        }
    }

    private static List<HealthLifeBean> c(List<Integer> list, int i, int i2, SparseArray<TaskConfigBean> sparseArray, String str) {
        TaskConfigBean taskConfigBean;
        if (njy.e(list) || TextUtils.isEmpty(str)) {
            LogUtil.j("HL_ConfigDatabaseHelper", "getSubscriptionTaskBeanList idList ", list, " userId ", str);
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (Integer num : list) {
            HealthLifeBean healthLifeBeanD = d(str, num.intValue(), i2);
            if (!cbg.h(healthLifeBeanD)) {
                healthLifeBeanD = new HealthLifeBean();
                healthLifeBeanD.setId(num.intValue());
                healthLifeBeanD.setRecordDay(i2);
                healthLifeBeanD.setTimestamp(DateFormatUtil.d(i2));
                healthLifeBeanD.setTimeZone(lsl.q(System.currentTimeMillis()));
            }
            healthLifeBeanD.setAddStatus(i);
            if (num.intValue() == 11) {
                arrayList.add(healthLifeBeanD);
            } else {
                boolean z = num.intValue() == 12;
                if (z && CommonUtils.j(healthLifeBeanD.getTarget()) < 2) {
                    healthLifeBeanD.setTarget("");
                }
                if (z) {
                    arrayList.add(healthLifeBeanD);
                } else {
                    if (TextUtils.isEmpty(healthLifeBeanD.getTarget()) && sparseArray != null && (taskConfigBean = sparseArray.get(num.intValue())) != null) {
                        healthLifeBeanD.setTarget(taskConfigBean.getDefaultGoal());
                    }
                    arrayList.add(healthLifeBeanD);
                }
            }
        }
        LogUtil.d("HL_ConfigDatabaseHelper", "getSubscriptionTaskBeanList taskList ", arrayList);
        return arrayList;
    }

    public static int b(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        return bxa.c("module_10031_health_task_config", "huid =? ", new String[]{str});
    }

    public static int a(int i) {
        return bxa.c("module_10031_health_task_config", "huid =? and recordDay >? ", new String[]{cbg.q(), String.valueOf(i)});
    }

    public static int e(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("HL_ConfigDatabaseHelper", "resetAllDataSyncStatus userId:", str);
            return -1;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("syncStatus", (Integer) 0);
        int iA = bxa.a("module_10031_health_task_config", contentValues, "huid =? ", new String[]{str});
        LogUtil.a("HL_ConfigDatabaseHelper", "resetAllDataSyncStatus flag:", Integer.valueOf(iA));
        return iA;
    }

    public static HealthLifeBean d(String str, int i, int i2) {
        if (TextUtils.isEmpty(str)) {
            return new HealthLifeBean();
        }
        return d("select * from module_10031_health_task_config where huid =? and id =? and recordDay<=? order by recordDay DESC limit 1", new String[]{str, String.valueOf(i), String.valueOf(i2)}, i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003d, code lost:
    
        if (r2 != null) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static HealthLifeBean d(String str, String[] strArr, int i) {
        HealthLifeBean healthLifeBean = new HealthLifeBean();
        try {
            Cursor cursorC = bxa.c(str, strArr);
            try {
                if (cursorC == null) {
                    LogUtil.j("HL_ConfigDatabaseHelper", "queryRecently cursor is null sql ", str, " selectionArgs ", strArr, " date ", Integer.valueOf(i));
                    if (cursorC != null) {
                        cursorC.close();
                        return healthLifeBean;
                    }
                    return healthLifeBean;
                }
                while (cursorC.moveToNext()) {
                    e(cursorC, healthLifeBean, i);
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
            LogUtil.e("HL_ConfigDatabaseHelper", "queryRecently exception ", LogAnonymous.b(e));
        }
    }

    public static HealthLifeBean b(int i, int i2, String str) {
        if (TextUtils.isEmpty(str)) {
            return new HealthLifeBean();
        }
        return b("select * from module_10031_health_task_config where huid =? and id =? and recordDay =? ", new String[]{str, String.valueOf(i), String.valueOf(i2)}, i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0042, code lost:
    
        if (r2 != null) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static HealthLifeBean b(String str, String[] strArr, int i) {
        HealthLifeBean healthLifeBean = new HealthLifeBean();
        try {
            Cursor cursorC = bxa.c(str, strArr);
            try {
                if (cursorC == null) {
                    LogUtil.j("HL_ConfigDatabaseHelper", "query cursor is null sql ", str, " selectionArgs ", strArr, " date ", Integer.valueOf(i));
                    if (cursorC != null) {
                        cursorC.close();
                        return healthLifeBean;
                    }
                    return healthLifeBean;
                }
                if (cursorC.moveToFirst()) {
                    do {
                        e(cursorC, healthLifeBean, i);
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
            LogUtil.e("HL_ConfigDatabaseHelper", "query exception ", LogAnonymous.b(e));
        }
    }

    private static void e(Cursor cursor, HealthLifeBean healthLifeBean, int i) {
        try {
            healthLifeBean.setTimeZone(cursor.getString(cursor.getColumnIndexOrThrow(DBSessionCommon.COLUMN_TIME_ZONE)));
            healthLifeBean.setLastTarget(cursor.getString(cursor.getColumnIndexOrThrow("lastTarget")));
            healthLifeBean.setCondition(cursor.getString(cursor.getColumnIndexOrThrow("condition")));
            healthLifeBean.setReserve(cursor.getString(cursor.getColumnIndexOrThrow("reserve")));
            healthLifeBean.setTarget(cursor.getString(cursor.getColumnIndexOrThrow("target")));
            healthLifeBean.setHuid(cursor.getString(cursor.getColumnIndexOrThrow("huid")));
            healthLifeBean.setTimestamp(cursor.getLong(cursor.getColumnIndexOrThrow("timestamp")));
            healthLifeBean.setId(cursor.getInt(cursor.getColumnIndexOrThrow("id")));
            healthLifeBean.setRecordDay(cursor.getInt(cursor.getColumnIndexOrThrow(ParsedFieldTag.RECORD_DAY)));
            healthLifeBean.setSyncStatus(cursor.getInt(cursor.getColumnIndexOrThrow("syncStatus")));
            healthLifeBean.setChallengeId(cursor.getInt(cursor.getColumnIndexOrThrow("challengeId")));
            healthLifeBean.setDataSource(cursor.getInt(cursor.getColumnIndexOrThrow("dataSource")));
            healthLifeBean.setTaskType(cursor.getInt(cursor.getColumnIndexOrThrow(ParsedFieldTag.TASK_TYPE)));
            int id = healthLifeBean.getId();
            if (i != healthLifeBean.getRecordDay()) {
                if (id == 11 || id == 12) {
                    healthLifeBean.setTarget("");
                }
            }
        } catch (SQLiteException | IllegalArgumentException e) {
            LogUtil.e("HL_ConfigDatabaseHelper", "conversion exception ", LogAnonymous.b(e));
        }
    }

    public static long a(List<HealthLifeBean> list, String str) {
        if (njy.e(list) || TextUtils.isEmpty(str)) {
            return -1L;
        }
        Iterator<HealthLifeBean> it = list.iterator();
        long j = 0;
        while (it.hasNext()) {
            if (c(it.next(), str) == -1) {
                j = -1;
            }
        }
        return j;
    }

    public static long c(HealthLifeBean healthLifeBean, String str) {
        if (!cbg.h(healthLifeBean) || TextUtils.isEmpty(str)) {
            return -1L;
        }
        int id = healthLifeBean.getId();
        int recordDay = healthLifeBean.getRecordDay();
        ContentValues contentValues = new ContentValues();
        contentValues.put(DBSessionCommon.COLUMN_TIME_ZONE, healthLifeBean.getTimeZone());
        contentValues.put("target", StringUtils.c((Object) healthLifeBean.getTarget()));
        contentValues.put("lastTarget", StringUtils.c((Object) healthLifeBean.getLastTarget()));
        contentValues.put("condition", healthLifeBean.getCondition());
        contentValues.put("reserve", healthLifeBean.getReserve());
        contentValues.put("huid", str);
        contentValues.put("timestamp", Long.valueOf(healthLifeBean.getTimestamp()));
        contentValues.put("id", Integer.valueOf(id));
        contentValues.put(ParsedFieldTag.RECORD_DAY, Integer.valueOf(recordDay));
        contentValues.put("syncStatus", Integer.valueOf(healthLifeBean.getSyncStatus()));
        contentValues.put("challengeId", Integer.valueOf(healthLifeBean.getChallengeId()));
        contentValues.put("dataSource", Integer.valueOf(healthLifeBean.getDataSource()));
        contentValues.put(ParsedFieldTag.TASK_TYPE, Integer.valueOf(healthLifeBean.getTaskType()));
        if (cbg.h(b(id, recordDay, str))) {
            return bxa.a("module_10031_health_task_config", contentValues, "huid =? and id =? and recordDay =? ", new String[]{str, String.valueOf(id), String.valueOf(recordDay)});
        }
        return bxa.d("module_10031_health_task_config", contentValues);
    }
}
