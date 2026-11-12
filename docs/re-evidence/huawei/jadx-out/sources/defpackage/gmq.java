package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.huawei.basefitnessadvice.model.Plan;
import com.huawei.basefitnessadvice.model.PlanRecord;
import com.huawei.health.plan.model.data.BaseDao;
import com.huawei.openalliance.ad.constant.JsbMapKeyNames;
import com.huawei.operation.utils.Constants;
import com.huawei.pluginachievement.manager.model.ParsedFieldTag;
import health.compact.a.DbManager;
import health.compact.a.LogAnonymous;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import health.compact.a.util.LogUtil;
import health.compact.a.utils.StringUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public class gmq extends BaseDao {
    /* JADX WARN: Code duplicated, block: B:21:0x006f A[PHI: r7
      0x006f: PHI (r7v6 android.database.Cursor) = (r7v4 android.database.Cursor), (r7v8 android.database.Cursor) binds: [B:20:0x006d, B:15:0x005e] A[DONT_GENERATE, DONT_INLINE]] */
    public List<PlanRecord> c(int i, int i2, String str) {
        if (i == 0) {
            i2++;
        } else {
            i++;
        }
        ArrayList arrayList = new ArrayList(10);
        String str2 = "select * from " + gmc.g().getTableFullName("plan_records") + " where userId=? AND (status=0 OR (status=1 AND workoutTimes>0)) ORDER BY status ASC,finishDate DESC LIMIT ?,?";
        String[] strArr = {StringUtils.c((Object) str), String.valueOf(i), String.valueOf(i2)};
        Cursor cursorRawQueryStorageData = null;
        try {
            try {
                cursorRawQueryStorageData = gmc.g().rawQueryStorageData(1, str2, strArr);
                if (cursorRawQueryStorageData != null) {
                    while (cursorRawQueryStorageData.moveToNext()) {
                        PlanRecord planRecordB = b(cursorRawQueryStorageData);
                        if (planRecordB.acquirePlanType() != 3) {
                            arrayList.add(planRecordB);
                        }
                    }
                }
                if (cursorRawQueryStorageData != null) {
                    cursorRawQueryStorageData.close();
                }
            } catch (SQLiteException unused) {
                LogUtil.c("Suggestion_PlanRecordDao", "SQLiteException getPlan");
                if (cursorRawQueryStorageData != null) {
                    cursorRawQueryStorageData.close();
                }
            }
            LogUtil.e("Suggestion_PlanRecordDao", "getJoinedPlans: ", arrayList.toString());
            return arrayList;
        } catch (Throwable th) {
            if (cursorRawQueryStorageData != null) {
                cursorRawQueryStorageData.close();
            }
            throw th;
        }
    }

    private PlanRecord b(Cursor cursor) {
        PlanRecord planRecord = new PlanRecord();
        planRecord.savePlanId(cursor.getString(cursor.getColumnIndex("planId")));
        planRecord.savePlanName(cursor.getString(cursor.getColumnIndex("planName")));
        planRecord.savePlanType(cursor.getInt(cursor.getColumnIndex("planType")));
        planRecord.saveStartDate(cursor.getString(cursor.getColumnIndex(Constants.START_DATE)));
        planRecord.saveEndDate(cursor.getString(cursor.getColumnIndex("endDate")));
        planRecord.saveCalorie(cursor.getFloat(cursor.getColumnIndex("calorie")));
        planRecord.saveDistance(cursor.getFloat(cursor.getColumnIndex("distance")));
        planRecord.saveActualCalorie(cursor.getFloat(cursor.getColumnIndex("actualCalorie")));
        planRecord.saveActualDistance(cursor.getFloat(cursor.getColumnIndex("actualDistance")));
        planRecord.setDuration(cursor.getLong(cursor.getColumnIndex("actualDuration")));
        planRecord.saveFinishRate(cursor.getFloat(cursor.getColumnIndex("finishRate")));
        planRecord.saveFinishDate(cursor.getLong(cursor.getColumnIndex("finishDate")));
        planRecord.saveWeekTimes(cursor.getInt(cursor.getColumnIndex("weekTimes")));
        planRecord.saveWorkoutTimes(cursor.getInt(cursor.getColumnIndex("workoutTimes")));
        planRecord.saveDifficulty(cursor.getInt(cursor.getColumnIndex("difficulty")));
        planRecord.saveWorkoutDays(cursor.getInt(cursor.getColumnIndex("workoutDays")));
        planRecord.saveGoal(cursor.getInt(cursor.getColumnIndex(ParsedFieldTag.GOAL)));
        planRecord.setPlanCategory(cursor.getInt(cursor.getColumnIndex("planCategory")));
        planRecord.saveExcludedDates(ifp.g(cursor.getString(cursor.getColumnIndex("excludedDates"))));
        return planRecord;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00f8  */
    public Plan b(String str, String str2) throws Throwable {
        Plan plan;
        Throwable th;
        Cursor cursor = null;
        plan = null;
        Plan plan2 = null;
        cursor = null;
        try {
            Cursor cursorRawQueryStorageData = gmc.g().rawQueryStorageData(1, "select * from " + gmc.g().getTableFullName("plan_records") + " where userId=? and planId=?", new String[]{str, str2});
            if (cursorRawQueryStorageData != null) {
                try {
                    try {
                        if (cursorRawQueryStorageData.moveToNext()) {
                            plan = new Plan();
                            try {
                                plan.saveId(cursorRawQueryStorageData.getString(cursorRawQueryStorageData.getColumnIndex("planId")));
                                plan.putName(cursorRawQueryStorageData.getString(cursorRawQueryStorageData.getColumnIndex("planName")));
                                plan.saveType(cursorRawQueryStorageData.getInt(cursorRawQueryStorageData.getColumnIndex("planType")));
                                plan.saveStartDate(cursorRawQueryStorageData.getString(cursorRawQueryStorageData.getColumnIndex(Constants.START_DATE)));
                                plan.saveEndDate(cursorRawQueryStorageData.getString(cursorRawQueryStorageData.getColumnIndex("endDate")));
                                plan.saveWorkoutCount(cursorRawQueryStorageData.getInt(cursorRawQueryStorageData.getColumnIndex("workoutCount")));
                                plan.saveWeekCount(cursorRawQueryStorageData.getInt(cursorRawQueryStorageData.getColumnIndex("weekCount")));
                                plan.saveCalorie(cursorRawQueryStorageData.getFloat(cursorRawQueryStorageData.getColumnIndex("calorie")));
                                plan.setPlanCategory(cursorRawQueryStorageData.getInt(cursorRawQueryStorageData.getColumnIndex("planCategory")));
                                plan.setGoal(cursorRawQueryStorageData.getInt(cursorRawQueryStorageData.getColumnIndex(ParsedFieldTag.GOAL)));
                                plan.setDifficulty(cursorRawQueryStorageData.getInt(cursorRawQueryStorageData.getColumnIndex("difficulty")));
                                plan2 = plan;
                            } catch (SQLiteException e) {
                                cursor = cursorRawQueryStorageData;
                                e = e;
                                try {
                                    LogUtil.c("Suggestion_PlanRecordDao", LogAnonymous.b(e));
                                    if (cursor != null) {
                                        cursor.close();
                                    }
                                    return plan;
                                } catch (Throwable th2) {
                                    th = th2;
                                    th = th;
                                    if (cursor != null) {
                                        cursor.close();
                                    }
                                    throw th;
                                }
                            }
                        }
                    } catch (SQLiteException e2) {
                        cursor = cursorRawQueryStorageData;
                        e = e2;
                        plan = null;
                    }
                } catch (Throwable th3) {
                    th = th3;
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
            return plan2;
        } catch (SQLiteException e3) {
            e = e3;
            plan = null;
        } catch (Throwable th4) {
            th = th4;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x005e  */
    public PlanRecord c(String str, String str2) {
        SQLiteException e;
        Cursor cursorRawQueryStorageData;
        String[] strArr = {str, str2};
        Cursor cursor = null;
        planRecordB = null;
        PlanRecord planRecordB = null;
        try {
            cursorRawQueryStorageData = gmc.g().rawQueryStorageData(1, "select * from " + gmc.g().getTableFullName("plan_records") + " where userId=? AND planId=?", strArr);
            if (cursorRawQueryStorageData != null) {
                try {
                    try {
                        if (cursorRawQueryStorageData.moveToNext()) {
                            planRecordB = b(cursorRawQueryStorageData);
                        }
                    } catch (SQLiteException e2) {
                        e = e2;
                        LogUtil.c("Suggestion_PlanRecordDao", LogAnonymous.b(e));
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
            return planRecordB;
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

    /* JADX WARN: Code duplicated, block: B:30:0x00a1  */
    public Plan b(String str) {
        Plan plan;
        Throwable th;
        Cursor cursor = null;
        plan = null;
        Plan plan2 = null;
        cursor = null;
        try {
            Cursor cursorRawQueryStorageData = gmc.g().rawQueryStorageData(1, "select * from " + gmc.g().getTableFullName("plan_records") + " where userId=? and status=0", new String[]{StringUtils.c((Object) str)});
            if (cursorRawQueryStorageData != null) {
                try {
                    try {
                        if (cursorRawQueryStorageData.moveToNext()) {
                            plan = new Plan();
                            try {
                                plan.saveId(cursorRawQueryStorageData.getString(cursorRawQueryStorageData.getColumnIndex("planId")));
                                plan.putName(cursorRawQueryStorageData.getString(cursorRawQueryStorageData.getColumnIndex("planName")));
                                plan.saveType(cursorRawQueryStorageData.getInt(cursorRawQueryStorageData.getColumnIndex("planType")));
                                plan.setVersion(cursorRawQueryStorageData.getString(cursorRawQueryStorageData.getColumnIndex("version")));
                                plan2 = plan;
                            } catch (SQLiteException e) {
                                cursor = cursorRawQueryStorageData;
                                e = e;
                                try {
                                    LogUtil.c("Suggestion_PlanRecordDao", LogAnonymous.b(e));
                                    if (cursor != null) {
                                        cursor.close();
                                    }
                                    return plan;
                                } catch (Throwable th2) {
                                    th = th2;
                                    th = th;
                                    if (cursor != null) {
                                        cursor.close();
                                    }
                                    throw th;
                                }
                            }
                        }
                    } catch (SQLiteException e2) {
                        cursor = cursorRawQueryStorageData;
                        e = e2;
                        plan = null;
                    }
                } catch (Throwable th3) {
                    th = th3;
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
            return plan2;
        } catch (SQLiteException e3) {
            e = e3;
            plan = null;
        } catch (Throwable th4) {
            th = th4;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public boolean c(String str, Plan plan) {
        if (plan == null) {
            return false;
        }
        gmc.g().deleteStorageData("plan_records", 1, "userId=? and planId=?", new String[]{StringUtils.c((Object) str), StringUtils.c((Object) plan.acquireId())});
        ContentValues contentValues = new ContentValues();
        contentValues.put(JsbMapKeyNames.H5_USER_ID, str);
        contentValues.put("planId", plan.acquireId());
        contentValues.put("planType", Integer.valueOf(plan.acquireType()));
        contentValues.put("planName", plan.acquireName());
        contentValues.put("workoutCount", Integer.valueOf(plan.getWorkoutCount()));
        contentValues.put("weekCount", Integer.valueOf(plan.getWeekCount()));
        contentValues.put(Constants.START_DATE, plan.acquireStartDate());
        contentValues.put("endDate", plan.getEndDate());
        contentValues.put("calorie", Float.valueOf(plan.getCalorie()));
        contentValues.put("planCategory", Integer.valueOf(plan.getPlanCategory()));
        contentValues.put("distance", Float.valueOf(plan.getDistance()));
        contentValues.put("difficulty", Integer.valueOf(plan.getDifficulty()));
        contentValues.put(ParsedFieldTag.GOAL, Integer.valueOf(plan.acquireGoal()));
        contentValues.put("version", plan.acquireVersion());
        contentValues.put("weekTimes", Integer.valueOf(plan.acquireWeekTimes()));
        contentValues.put("excludedDates", gzm.d(plan.acquireExcludedDates()));
        contentValues.put("status", (Integer) 0);
        return gmc.g().insertStorageData("plan_records", 1, contentValues) > 0;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0082  */
    public void c(String str, List<PlanRecord> list) {
        boolean z;
        if (list == null) {
            return;
        }
        boolean z2 = false;
        try {
            if (DbManager.i(String.valueOf(fga.b()))) {
                z = false;
            } else {
                gmc.g().h();
                z = true;
            }
            try {
                try {
                    c();
                    for (PlanRecord planRecord : list) {
                        if (planRecord != null) {
                            PlanRecord planRecordC = c(str, planRecord.acquirePlanId());
                            if (planRecordC == null) {
                                b(str, planRecord);
                            } else if (planRecord.acquireFinishDate() != planRecordC.acquireFinishDate()) {
                                e(str, planRecord);
                            }
                        }
                    }
                    if (z) {
                        gmc.g().f();
                    }
                } catch (SQLiteException e) {
                    e = e;
                    ReleaseLogUtil.a("Suggestion_PlanRecordDao", "SQLiteDatabaseLockedException:", LogAnonymous.b(e));
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

    private void b(String str, PlanRecord planRecord) {
        if (planRecord == null) {
            return;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put(JsbMapKeyNames.H5_USER_ID, str);
        contentValues.put("planId", planRecord.acquirePlanId());
        contentValues.put("planType", Integer.valueOf(planRecord.acquirePlanType()));
        contentValues.put("planName", planRecord.acquirePlanName());
        contentValues.put("weekCount", Integer.valueOf(planRecord.acquireWeekCount()));
        contentValues.put(Constants.START_DATE, planRecord.acquireStartDate());
        contentValues.put("endDate", planRecord.acquireEndDate());
        contentValues.put("calorie", Float.valueOf(planRecord.acquireCalorie()));
        contentValues.put("distance", Float.valueOf(planRecord.acquireDistance()));
        contentValues.put("actualCalorie", Float.valueOf(planRecord.acquireActualCalorie()));
        contentValues.put("actualDistance", Float.valueOf(planRecord.acquireActualDistance()));
        contentValues.put("actualDuration", Long.valueOf(planRecord.getTotalDuration()));
        contentValues.put("difficulty", Integer.valueOf(planRecord.acquireDifficulty()));
        contentValues.put(ParsedFieldTag.GOAL, Integer.valueOf(planRecord.acquireGoal()));
        contentValues.put("weekTimes", Integer.valueOf(planRecord.acquireWeekTimes()));
        contentValues.put("finishDate", Long.valueOf(planRecord.acquireFinishDate()));
        contentValues.put("finishRate", Float.valueOf(planRecord.acquireFinishRate()));
        contentValues.put("workoutTimes", Integer.valueOf(planRecord.acquireWorkoutTimes()));
        contentValues.put("workoutDays", Integer.valueOf(planRecord.acquireWorkoutDays()));
        contentValues.put("excludedDates", gzm.d(planRecord.acquireExcludedDates()));
        contentValues.put("version", planRecord.acquireVersion());
        contentValues.put("status", (Integer) 1);
        contentValues.put("planCategory", Integer.valueOf(planRecord.getPlanCategory()));
        gmc.g().insertStorageData("plan_records", 1, contentValues);
    }

    public void a(String str, String str2) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("workoutRecords", Integer.valueOf(ifp.e((Object) "1")));
        gmc.g().updateStorageData("plan_records", 1, contentValues, "planId=? AND userId=? AND status=1", new String[]{StringUtils.c((Object) str2), StringUtils.c((Object) str)});
    }

    public void e(String str, PlanRecord planRecord) {
        if (planRecord == null) {
            return;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("actualCalorie", Float.valueOf(planRecord.acquireActualCalorie()));
        contentValues.put("actualDistance", Float.valueOf(planRecord.acquireActualDistance()));
        contentValues.put("actualDuration", Long.valueOf(planRecord.getTotalDuration()));
        contentValues.put("finishRate", Float.valueOf(planRecord.acquireFinishRate()));
        contentValues.put("workoutTimes", Integer.valueOf(planRecord.acquireWorkoutTimes()));
        contentValues.put("workoutDays", Integer.valueOf(planRecord.acquireWorkoutDays()));
        if (!TextUtils.isEmpty(planRecord.acquirePlanName())) {
            contentValues.put("planName", planRecord.acquirePlanName());
        }
        contentValues.put("finishDate", Long.valueOf(planRecord.acquireFinishDate()));
        gmc.g().updateStorageData("plan_records", 1, contentValues, "planId=? AND userId=?", new String[]{StringUtils.c((Object) planRecord.acquirePlanId()), StringUtils.c((Object) str)});
    }

    public boolean e(String str, String str2, String str3) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("planName", str3);
        return gmc.g().updateStorageData("plan_records", 1, contentValues, "planId=? and userId=?", new String[]{StringUtils.c((Object) str2), StringUtils.c((Object) str)}) > 0;
    }

    public boolean a(String str, String str2, long j) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("status", (Integer) 1);
        contentValues.put("finishDate", Long.valueOf(j));
        return gmc.g().updateStorageData("plan_records", 1, contentValues, "planId=? and userId=? and status=0", new String[]{StringUtils.c((Object) str2), StringUtils.c((Object) str)}) > 0;
    }

    public boolean d(String str, String str2) {
        Cursor cursorRawQueryStorageData = null;
        try {
            cursorRawQueryStorageData = gmc.g().rawQueryStorageData(1, "select * from " + gmc.g().getTableFullName("plan_records") + " where userId=? AND planId=? AND workoutRecords=1", new String[]{str, str2});
            return cursorRawQueryStorageData != null ? cursorRawQueryStorageData.moveToNext() : false;
        } catch (SQLiteException e) {
            LogUtil.c("Suggestion_PlanRecordDao", LogAnonymous.b(e));
            return false;
        } finally {
            if (cursorRawQueryStorageData != null) {
                cursorRawQueryStorageData.close();
            }
        }
    }

    private void c() {
        gmc.g().deleteStorageData("plan_records", 1, "status=1 AND workoutTimes=0");
    }

    public void e(String str, String str2) {
        gmc.g().deleteStorageData("plan_records", 1, "userId=? AND planId=?", new String[]{StringUtils.c((Object) str), StringUtils.c((Object) str2)});
    }

    public void d() {
        gmc.g().deleteStorageData("plan_records", 1, null, null);
    }
}
