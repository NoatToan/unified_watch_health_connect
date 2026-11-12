package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.huawei.basefitnessadvice.model.Plan;
import com.huawei.basefitnessadvice.model.PlanRecord;
import com.huawei.health.plan.model.PlanStat;
import com.huawei.health.plan.model.data.BaseDao;
import com.huawei.health.plan.model.util.SqlUtil;
import com.huawei.health.sport.model.WorkoutRecord;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.HwExerciseConstants;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.JsbMapKeyNames;
import com.huawei.operation.utils.Constants;
import com.huawei.pluginachievement.manager.model.ParsedFieldTag;
import health.compact.a.LogAnonymous;
import health.compact.a.utils.StringUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes29.dex */
public class gmv extends BaseDao {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f35758b = new SqlUtil.d().e("recordId").c().c("recordIndex", SqlUtil.SqliteColumnType.INTEGER).c(JsbMapKeyNames.H5_USER_ID, SqlUtil.SqliteColumnType.TEXT).c("planId", SqlUtil.SqliteColumnType.TEXT).c(HwExerciseConstants.METHOD_PARAM_WORKOUT_ID, SqlUtil.SqliteColumnType.TEXT).c("workoutName", SqlUtil.SqliteColumnType.TEXT).c("workoutOrder", SqlUtil.SqliteColumnType.INTEGER).c("workoutDate", SqlUtil.SqliteColumnType.TEXT).c("exerciseDate", SqlUtil.SqliteColumnType.INTEGER).c("exerciseTime", SqlUtil.SqliteColumnType.INTEGER).c("weekNum", SqlUtil.SqliteColumnType.INTEGER).c("during", SqlUtil.SqliteColumnType.INTEGER).c("actualCalorie", SqlUtil.SqliteColumnType.REAL).c("actualDistance", SqlUtil.SqliteColumnType.REAL).c("calorie", SqlUtil.SqliteColumnType.REAL).c("distance", SqlUtil.SqliteColumnType.REAL).c("finishRate", SqlUtil.SqliteColumnType.REAL).c("upperHeartRate", SqlUtil.SqliteColumnType.INTEGER).c("lowerHeartRate", SqlUtil.SqliteColumnType.INTEGER).c("bestPace", SqlUtil.SqliteColumnType.INTEGER).c("oxygen", SqlUtil.SqliteColumnType.REAL).c("trainingLoadPeak", SqlUtil.SqliteColumnType.INTEGER).c(WorkoutRecord.Extend.RunWorkout.RUN_WORKOUT_TRAJECTORY_ID, SqlUtil.SqliteColumnType.TEXT).c("actionSummary", SqlUtil.SqliteColumnType.TEXT).c("recordType", SqlUtil.SqliteColumnType.INTEGER).c("version", SqlUtil.SqliteColumnType.TEXT).c("wearType", SqlUtil.SqliteColumnType.INTEGER).c("extend", SqlUtil.SqliteColumnType.TEXT).c("heartRateList", SqlUtil.SqliteColumnType.TEXT).c("invalidHeartRateList", SqlUtil.SqliteColumnType.TEXT).c("category", SqlUtil.SqliteColumnType.INTEGER).c("intensityZone", SqlUtil.SqliteColumnType.TEXT).c(HwExerciseConstants.JSON_NAME_TRAINING_POINTS, SqlUtil.SqliteColumnType.INTEGER).c("sportRecordType", SqlUtil.SqliteColumnType.INTEGER).c(ParsedFieldTag.NPES_TOTAL_SCORE, SqlUtil.SqliteColumnType.INTEGER).c("recordModeType", SqlUtil.SqliteColumnType.INTEGER).a();

    /* JADX WARN: Code duplicated, block: B:18:0x0082 A[PHI: r4
      0x0082: PHI (r4v3 android.database.Cursor) = (r4v1 android.database.Cursor), (r4v4 android.database.Cursor) binds: [B:17:0x0080, B:11:0x0069] A[DONT_GENERATE, DONT_INLINE]] */
    public static PlanRecord c(String str, String str2) {
        PlanRecord planRecordC = gmc.g().s().c(str, str2);
        if (planRecordC == null) {
            planRecordC = new PlanRecord();
        }
        planRecordC.savePlanId(str2);
        String str3 = "select plan.finishDate as finishDate,sum( record.actualCalorie) as actualCalorie,sum( record.actualDistance) as actualDistance,sum( record.during) as during,count(distinct record.workoutDate) as days,count(record.recordId) as workoutTimes from " + gmc.g().getTableFullName("plan_records") + " as plan left join " + gmc.g().getTableFullName("workout_record") + " as record on record.planId = plan.planId and record.userId = plan.userId where plan.planId=? and plan.userId=? and (record.actualCalorie>0 or record.actualDistance>0)";
        LogUtil.a("Suggestion_WorkoutRecordDao", "getIntelligentPlanProgress sql:", str3);
        Cursor cursorRawQueryStorageData = null;
        try {
            try {
                cursorRawQueryStorageData = gmc.g().rawQueryStorageData(1, str3, new String[]{str2, str});
                if (cursorRawQueryStorageData != null && cursorRawQueryStorageData.moveToNext()) {
                    a(planRecordC, cursorRawQueryStorageData);
                }
                if (cursorRawQueryStorageData != null) {
                    cursorRawQueryStorageData.close();
                }
            } catch (SQLiteException e) {
                LogUtil.j("Suggestion_WorkoutRecordDao", "getIntelligentPlanProgress,", LogAnonymous.b(e));
                if (cursorRawQueryStorageData != null) {
                    cursorRawQueryStorageData.close();
                }
            }
            LogUtil.a("Suggestion_WorkoutRecordDao", "getIntelligentPlanProgress planRecord:", planRecordC.toString());
            return planRecordC;
        } catch (Throwable th) {
            if (cursorRawQueryStorageData != null) {
                cursorRawQueryStorageData.close();
            }
            throw th;
        }
    }

    private static void a(PlanRecord planRecord, Cursor cursor) {
        float f = cursor.getFloat(cursor.getColumnIndex("actualCalorie"));
        if (f > planRecord.acquireActualCalorie()) {
            planRecord.saveActualCalorie(f);
        }
        float f2 = cursor.getFloat(cursor.getColumnIndex("actualDistance"));
        if (f2 > planRecord.acquireActualDistance()) {
            planRecord.saveActualDistance(f2);
        }
        long j = cursor.getInt(cursor.getColumnIndex("during"));
        if (j > planRecord.getTotalDuration()) {
            planRecord.setDuration(j);
        }
        int i = cursor.getInt(cursor.getColumnIndex("days"));
        if (i > planRecord.acquireWorkoutDays()) {
            planRecord.saveWorkoutDays(i);
        }
        int i2 = cursor.getInt(cursor.getColumnIndex("workoutTimes"));
        if (i2 > planRecord.acquireWorkoutTimes()) {
            planRecord.saveWorkoutTimes(i2);
        }
        planRecord.saveFinishDate(cursor.getLong(cursor.getColumnIndex("finishDate")));
        planRecord.saveFinishRate(ped.a(e()));
    }

    private static float e() {
        Plan currentPlan = gls.b().getCurrentPlan();
        int iD = btw.d(currentPlan);
        if (iD == 0) {
            return 0.0f;
        }
        return (btw.c(currentPlan) * 100.0f) / iD;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0081 A[PHI: r1 r5
      0x0081: PHI (r1v1 com.huawei.basefitnessadvice.model.PlanRecord) = (r1v0 com.huawei.basefitnessadvice.model.PlanRecord), (r1v3 com.huawei.basefitnessadvice.model.PlanRecord) binds: [B:15:0x007f, B:9:0x006a] A[DONT_GENERATE, DONT_INLINE]
      0x0081: PHI (r5v3 android.database.Cursor) = (r5v2 android.database.Cursor), (r5v4 android.database.Cursor) binds: [B:15:0x007f, B:9:0x006a] A[DONT_GENERATE, DONT_INLINE]] */
    public static PlanRecord d(String str, String str2) {
        PlanRecord planRecord = new PlanRecord();
        planRecord.savePlanId(str2);
        Cursor cursorRawQueryStorageData = null;
        try {
            try {
                String str3 = "select plan.startDate,plan.finishDate,plan.planName,plan.planId,sum(record.actualCalorie) as actualCalorie,sum( case when record.calorie < record.actualCalorie then record.calorie else record.actualCalorie end ) as calorie,sum(record.actualDistance) as actualDistance,sum( record.during) as during,sum( case when record.distance < record.actualDistance then record.distance else record.actualDistance end ) as distance,sum(record.finishRate * ( case when plan.planType=0 then record.distance * 1.0/plan.distance else record.calorie * 1.0/plan.calorie end )) as finishRate,count(distinct record.workoutDate) as workoutDays,count(record.recordId) as workoutTimes from " + gmc.g().getTableFullName("plan_records") + " as plan left join " + gmc.g().getTableFullName("workout_record") + " as record on record.planId = plan.planId and record.userId = plan.userId where plan.planId=? and record.recordType=? and plan.userId=? and (record.actualCalorie>0 or record.actualDistance>0)";
                cursorRawQueryStorageData = gmc.g().rawQueryStorageData(1, str3, new String[]{str2, String.valueOf(1), str});
                LogUtil.a("Suggestion_WorkoutRecordDao", "getPlanProgress sql:", str3);
                if (cursorRawQueryStorageData != null && cursorRawQueryStorageData.moveToNext()) {
                    planRecord = c(cursorRawQueryStorageData);
                }
                if (cursorRawQueryStorageData != null) {
                    cursorRawQueryStorageData.close();
                }
            } catch (SQLiteException e) {
                LogUtil.e("Suggestion_WorkoutRecordDao", "getPlanProgress:", LogAnonymous.b(e));
                if (cursorRawQueryStorageData != null) {
                    cursorRawQueryStorageData.close();
                }
            }
            LogUtil.a("Suggestion_WorkoutRecordDao", "getPlanProgress planRecord:", planRecord.toString());
            return planRecord;
        } catch (Throwable th) {
            if (cursorRawQueryStorageData != null) {
                cursorRawQueryStorageData.close();
            }
            throw th;
        }
    }

    public static List<PlanRecord> c(int i, int i2, String str) {
        ArrayList arrayList = new ArrayList();
        if (i == 0) {
            i2++;
        } else {
            i++;
        }
        String str2 = "select plan.startDate,plan.finishDate,plan.planName,plan.planId,sum(record.actualCalorie) as actualCalorie,sum( case when record.calorie < record.actualCalorie then record.calorie else record.actualCalorie end ) as calorie,sum(record.actualDistance) as actualDistance,sum( record.during) as during,sum( case when record.distance < record.actualDistance then record.distance else record.actualDistance end ) as distance,sum(record.finishRate * ( case when plan.planType=0 then record.distance * 1.0/plan.distance else record.calorie * 1.0/plan.calorie end )) as finishRate,count(distinct record.workoutDate) as workoutDays,count(record.recordId) as workoutTimes from " + gmc.g().getTableFullName("plan_records") + " as plan left join " + gmc.g().getTableFullName("workout_record") + " as record on record.planId = plan.planId and record.userId = plan.userId where record.recordType=? and plan.planCategory= ? and plan.userId=? and (record.actualCalorie>0 or record.actualDistance>0) GROUP BY plan.planId ORDER BY finishDate DESC LIMIT ?,?";
        LogUtil.d("Suggestion_WorkoutRecordDao", "getOldRunPlanLocalRecords sql:", str2);
        String[] strArr = {String.valueOf(1), String.valueOf(0), str, String.valueOf(i), String.valueOf(i2)};
        LogUtil.d("Suggestion_WorkoutRecordDao", "getOldRunPlanLocalRecords selectArgs: ", Arrays.toString(strArr));
        try {
            Cursor cursorRawQueryStorageData = gmc.g().rawQueryStorageData(1, str2, strArr);
            if (cursorRawQueryStorageData != null) {
                while (cursorRawQueryStorageData.moveToNext()) {
                    try {
                        arrayList.add(c(cursorRawQueryStorageData));
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
            LogUtil.e("Suggestion_WorkoutRecordDao", "getPlanProgress:", LogAnonymous.b(e));
        }
        return arrayList;
    }

    private static PlanRecord c(Cursor cursor) {
        if (cursor == null) {
            return null;
        }
        PlanRecord planRecord = new PlanRecord();
        planRecord.saveActualCalorie(cursor.getFloat(cursor.getColumnIndex("actualCalorie")));
        planRecord.saveActualDistance(cursor.getFloat(cursor.getColumnIndex("actualDistance")));
        planRecord.setDuration(cursor.getLong(cursor.getColumnIndex("during")) * 1000);
        planRecord.saveCalorie(cursor.getFloat(cursor.getColumnIndex("calorie")));
        planRecord.saveDistance(cursor.getFloat(cursor.getColumnIndex("distance")));
        planRecord.saveWorkoutDays(cursor.getInt(cursor.getColumnIndex("workoutDays")));
        planRecord.saveWorkoutTimes(cursor.getInt(cursor.getColumnIndex("workoutTimes")));
        planRecord.saveStartDate(cursor.getString(cursor.getColumnIndex(Constants.START_DATE)));
        planRecord.saveFinishDate(cursor.getLong(cursor.getColumnIndex("finishDate")));
        planRecord.saveFinishRate(ped.a(cursor.getFloat(cursor.getColumnIndex("finishRate"))));
        planRecord.savePlanId(cursor.getString(cursor.getColumnIndex("planId")));
        planRecord.savePlanName(cursor.getString(cursor.getColumnIndex("planName")));
        LogUtil.a("Suggestion_WorkoutRecordDao", "getPlanRecord result: ", planRecord.toString());
        return planRecord;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0076  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r4v2 */
    public static WorkoutRecord e(String str, String str2) {
        SQLiteException e;
        Cursor cursorRawQueryStorageData;
        String[] strArr = {str, str2};
        ?? r4 = 0;
        workoutRecordB = null;
        WorkoutRecord workoutRecordB = null;
        try {
            try {
                cursorRawQueryStorageData = gmc.g().rawQueryStorageData(1, "select * from " + gmc.g().getTableFullName("workout_record") + " where userId=? and exerciseTime=?", strArr);
                if (cursorRawQueryStorageData != null) {
                    try {
                        LogUtil.a("Suggestion_WorkoutRecordDao", "Columns=", Integer.valueOf(cursorRawQueryStorageData.getColumnCount()));
                        if (cursorRawQueryStorageData.moveToNext()) {
                            workoutRecordB = gmw.b(cursorRawQueryStorageData);
                        }
                    } catch (SQLiteException e2) {
                        e = e2;
                        LogUtil.e("Suggestion_WorkoutRecordDao", "getWorkoutRecord", LogAnonymous.b(e));
                        if (cursorRawQueryStorageData != null) {
                            cursorRawQueryStorageData.close();
                        }
                        return null;
                    }
                }
                if (cursorRawQueryStorageData != null) {
                    cursorRawQueryStorageData.close();
                }
                return workoutRecordB;
            } catch (Throwable th) {
                r4 = strArr;
                th = th;
                if (r4 != 0) {
                    r4.close();
                }
                throw th;
            }
        } catch (SQLiteException e3) {
            e = e3;
            cursorRawQueryStorageData = null;
        } catch (Throwable th2) {
            th = th2;
            if (r4 != 0) {
                r4.close();
            }
            throw th;
        }
    }

    public static List<WorkoutRecord> a(String str, String str2) {
        ArrayList arrayList = new ArrayList(10);
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            LogUtil.e("Suggestion_WorkoutRecordDao", "the value of userId planId is null");
            return arrayList;
        }
        Cursor cursorRawQueryStorageData = null;
        try {
            try {
                cursorRawQueryStorageData = gmc.g().rawQueryStorageData(1, "select * from " + gmc.g().getTableFullName("workout_record") + " where planId=? and userId=? and recordType=1", new String[]{str2, str});
                if (cursorRawQueryStorageData != null) {
                    while (cursorRawQueryStorageData.moveToNext()) {
                        arrayList.add(gmw.b(cursorRawQueryStorageData));
                    }
                }
                if (cursorRawQueryStorageData != null) {
                    return arrayList;
                }
            } catch (SQLiteException e) {
                LogUtil.e("Suggestion_WorkoutRecordDao", "getWorkoutRecords:", LogAnonymous.b(e));
            }
            return arrayList;
        } finally {
            if (cursorRawQueryStorageData != null) {
                cursorRawQueryStorageData.close();
            }
        }
    }

    public static List<WorkoutRecord> b(String str, String str2, String str3, String str4) throws Throwable {
        Cursor cursorRawQueryStorageData;
        ArrayList arrayList = new ArrayList(10);
        String str5 = "select * from " + gmc.g().getTableFullName("workout_record") + " where planId=? and recordType=1 and userId=? and workoutDate>=? and workoutDate<=? ORDER BY exerciseTime DESC";
        Cursor cursorRawQueryStorageData2 = null;
        try {
            try {
                cursorRawQueryStorageData = gmc.g().rawQueryStorageData(1, str5, new String[]{str2, str, StringUtils.c((Object) str3), StringUtils.c((Object) str4)});
                if (cursorRawQueryStorageData != null) {
                    while (cursorRawQueryStorageData.moveToNext()) {
                        try {
                            arrayList.add(gmw.b(cursorRawQueryStorageData));
                        } catch (SQLiteException e) {
                            e = e;
                            cursorRawQueryStorageData2 = cursorRawQueryStorageData;
                            LogUtil.e("Suggestion_WorkoutRecordDao", "getWorkoutRecords by date:", LogAnonymous.b(e));
                            if (cursorRawQueryStorageData2 != null) {
                                cursorRawQueryStorageData2.close();
                            }
                        } catch (Throwable th) {
                            th = th;
                            if (cursorRawQueryStorageData != null) {
                                cursorRawQueryStorageData.close();
                            }
                            throw th;
                        }
                    }
                }
                String strE = ift.e(str3, "yyyy-MM-dd", Locale.ENGLISH);
                String strE2 = ift.e(str4, "yyyy-MM-dd", Locale.ENGLISH);
                if (strE == null || strE2 == null) {
                    LogUtil.e("Suggestion_WorkoutRecordDao", "format data fail, src start data: ", str3, " dst start data: ", strE2, " src end data: ", str4, " dst end data", strE2);
                    if (cursorRawQueryStorageData != null) {
                        cursorRawQueryStorageData.close();
                        return arrayList;
                    }
                } else {
                    if (!str3.equals(strE) || !str4.equals(strE2)) {
                        LogUtil.j("Suggestion_WorkoutRecordDao", "src start data: ", str3, " dst start data: ", strE2, " src end data: ", str4, " dst end data", strE2);
                        cursorRawQueryStorageData2 = gmc.g().rawQueryStorageData(1, str5, new String[]{str2, str, StringUtils.c((Object) strE), StringUtils.c((Object) strE2)});
                        if (cursorRawQueryStorageData2 != null) {
                            while (cursorRawQueryStorageData2.moveToNext()) {
                                arrayList.add(gmw.b(cursorRawQueryStorageData2));
                            }
                        }
                        cursorRawQueryStorageData = cursorRawQueryStorageData2;
                    }
                    if (cursorRawQueryStorageData != null) {
                        cursorRawQueryStorageData.close();
                        return arrayList;
                    }
                }
            } catch (SQLiteException e2) {
                e = e2;
            }
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            cursorRawQueryStorageData = cursorRawQueryStorageData2;
        }
    }

    public static List<Long> d(String str) {
        ArrayList arrayList = new ArrayList();
        Cursor cursorRawQueryStorageData = null;
        try {
            try {
                cursorRawQueryStorageData = gmc.g().rawQueryStorageData(1, "select exerciseTime from " + gmc.g().getTableFullName("workout_record") + " where userId=? ORDER BY exerciseTime DESC", new String[]{str});
                if (cursorRawQueryStorageData != null) {
                    while (cursorRawQueryStorageData.moveToNext()) {
                        arrayList.add(Long.valueOf(gmw.e(cursorRawQueryStorageData)));
                    }
                }
                if (cursorRawQueryStorageData != null) {
                    return arrayList;
                }
            } catch (SQLiteException e) {
                LogUtil.e("Suggestion_WorkoutRecordDao", "getAllExerciseTimeByUser:", LogAnonymous.b(e));
            }
            return arrayList;
        } finally {
            if (cursorRawQueryStorageData != null) {
                cursorRawQueryStorageData.close();
            }
        }
    }

    public static PlanStat d(String str, String str2, int i) {
        if (i == 0) {
            return j(str, str2);
        }
        return i(str, str2);
    }

    private static PlanStat j(String str, String str2) {
        PlanStat planStat = new PlanStat();
        Cursor cursorRawQueryStorageData = null;
        try {
            Cursor cursorRawQueryStorageData2 = gmc.g().rawQueryStorageData(1, "select max(actualDistance) as actualDistance,max(during) as during from " + gmc.g().getTableFullName("workout_record") + " where  userId=? and recordType=? and planId=?", new String[]{str, String.valueOf(1), str2});
            if (cursorRawQueryStorageData2 != null && cursorRawQueryStorageData2.moveToNext()) {
                planStat.setFarthestRunning(cursorRawQueryStorageData2.getFloat(cursorRawQueryStorageData2.getColumnIndex("actualDistance")));
                planStat.setLongestRunning(cursorRawQueryStorageData2.getInt(cursorRawQueryStorageData2.getColumnIndex("during")));
            }
            cursorRawQueryStorageData = gmc.g().rawQueryStorageData(1, "SELECT bestPace FROM " + gmc.g().getTableFullName("workout_record") + " WHERE userId=? and recordType=? AND planId=? AND actualDistance>=1 ORDER BY exerciseTime LIMIT 0,1 ", new String[]{str, String.valueOf(1), str2});
            if (cursorRawQueryStorageData != null && cursorRawQueryStorageData.moveToNext()) {
                planStat.setBestRecordForFirstOneKm(cursorRawQueryStorageData.getInt(cursorRawQueryStorageData.getColumnIndex("bestPace")));
            }
            if (cursorRawQueryStorageData != null) {
                return planStat;
            }
        } catch (SQLiteException e) {
            LogUtil.e("Suggestion_WorkoutRecordDao", "getRunPlanStat", LogAnonymous.b(e));
        } finally {
            if (cursorRawQueryStorageData != null) {
                cursorRawQueryStorageData.close();
            }
        }
        return planStat;
    }

    private static PlanStat i(String str, String str2) {
        PlanStat planStat = new PlanStat();
        Cursor cursorRawQueryStorageData = null;
        try {
            Cursor cursorRawQueryStorageData2 = gmc.g().rawQueryStorageData(1, "select max(s.actualCalorie) as actualCalorie , max(s.during) as during from ( select sum(actualCalorie) as actualCalorie,sum(during) as during from " + gmc.g().getTableFullName("workout_record") + " where  userId=? and recordType=? and planId=? group by weekNum ) as s", new String[]{str, String.valueOf(1), str2});
            if (cursorRawQueryStorageData2 != null && cursorRawQueryStorageData2.moveToNext()) {
                planStat.saveMostCaloriePerWeek(cursorRawQueryStorageData2.getFloat(cursorRawQueryStorageData2.getColumnIndex("actualCalorie")));
                planStat.saveLongestTimePerWeek(cursorRawQueryStorageData2.getInt(cursorRawQueryStorageData2.getColumnIndex("during")));
            }
            b(str, str2, planStat);
            cursorRawQueryStorageData = gmc.g().rawQueryStorageData(1, "select max(finishRate) as finishRate from " + gmc.g().getTableFullName("workout_record") + " where userId=? and recordType=? and planId=?", new String[]{str, String.valueOf(1), str2});
            if (cursorRawQueryStorageData != null && cursorRawQueryStorageData.moveToNext()) {
                planStat.saveHighestCompleteRate(ped.a(cursorRawQueryStorageData.getFloat(cursorRawQueryStorageData.getColumnIndex("finishRate"))));
            }
            if (cursorRawQueryStorageData != null) {
                return planStat;
            }
        } catch (SQLiteException e) {
            LogUtil.e("Suggestion_WorkoutRecordDao", "getFitPlanStatistics:", LogAnonymous.b(e));
        } finally {
            if (cursorRawQueryStorageData != null) {
                cursorRawQueryStorageData.close();
            }
        }
        return planStat;
    }

    private static void b(String str, String str2, PlanStat planStat) {
        if (planStat == null) {
            return;
        }
        Cursor cursorRawQueryStorageData = null;
        try {
            cursorRawQueryStorageData = gmc.g().rawQueryStorageData(1, "select  workoutId ,workoutName, max(s.workoutTimes) as workoutTimes from (select workoutId ,workoutName,count(workoutId) as workoutTimes from " + gmc.g().getTableFullName("workout_record") + " where userId=? and recordType=? and planId=? group by workoutId ) as s", new String[]{str, String.valueOf(1), str2});
            if (cursorRawQueryStorageData != null && cursorRawQueryStorageData.moveToNext()) {
                planStat.saveMostWorkoutTimes(cursorRawQueryStorageData.getInt(cursorRawQueryStorageData.getColumnIndex("workoutTimes")));
                planStat.setMostWorkoutName(cursorRawQueryStorageData.getString(cursorRawQueryStorageData.getColumnIndex("workoutName")));
            }
        } catch (SQLiteException e) {
            LogUtil.e("Suggestion_WorkoutRecordDao", "getMostTimeWorkout:", LogAnonymous.b(e));
        } finally {
            if (cursorRawQueryStorageData != null) {
                cursorRawQueryStorageData.close();
            }
        }
    }

    public static int a(String str, String str2, String str3) {
        int i = 0;
        Cursor cursorRawQueryStorageData = null;
        try {
            cursorRawQueryStorageData = gmc.g().rawQueryStorageData(1, "select count(recordId) as workoutCount from " + gmc.g().getTableFullName("workout_record") + " where userId=? and workoutId=? and version=?", new String[]{str, str2, str3});
            if (cursorRawQueryStorageData != null && cursorRawQueryStorageData.moveToNext()) {
                i = cursorRawQueryStorageData.getInt(cursorRawQueryStorageData.getColumnIndex("workoutCount"));
            }
            return i;
        } catch (SQLiteException e) {
            LogUtil.e("Suggestion_WorkoutRecordDao", "getWorkoutCompleteTimes:", LogAnonymous.b(e));
            return 0;
        } finally {
            if (cursorRawQueryStorageData != null) {
                cursorRawQueryStorageData.close();
            }
        }
    }

    public static Map<String, Integer> b(String str, String str2) {
        HashMap map = new HashMap(16);
        Cursor cursorRawQueryStorageData = null;
        try {
            try {
                cursorRawQueryStorageData = gmc.g().rawQueryStorageData(1, "SELECT workoutOrder ,workoutDate FROM " + gmc.g().getTableFullName("workout_record") + " WHERE planId=? AND userId=? ORDER BY exerciseTime", new String[]{str2, str});
                if (cursorRawQueryStorageData != null) {
                    while (cursorRawQueryStorageData.moveToNext()) {
                        map.put(cursorRawQueryStorageData.getString(cursorRawQueryStorageData.getColumnIndex("workoutDate")), Integer.valueOf(cursorRawQueryStorageData.getInt(cursorRawQueryStorageData.getColumnIndex("workoutOrder"))));
                    }
                }
                if (cursorRawQueryStorageData != null) {
                    return map;
                }
            } catch (SQLiteException e) {
                LogUtil.e("Suggestion_WorkoutRecordDao", "getWorkoutOrders:", LogAnonymous.b(e));
            }
            return map;
        } finally {
            if (cursorRawQueryStorageData != null) {
                cursorRawQueryStorageData.close();
            }
        }
    }

    public static List<WorkoutRecord> a(String str, long j, long j2) {
        String str2 = "select * from " + gmc.g().getTableFullName("workout_record") + " where workoutId GLOB ?  and userId = ?  and exerciseTime between " + j + " and " + j2 + " order by exerciseTime desc";
        ArrayList arrayList = new ArrayList();
        Cursor cursorRawQueryStorageData = gmc.g().rawQueryStorageData(1, str2, new String[]{"?[0-9][0-9]?*", str});
        if (cursorRawQueryStorageData != null) {
            while (cursorRawQueryStorageData.moveToNext()) {
                arrayList.add(gmw.b(cursorRawQueryStorageData));
            }
            cursorRawQueryStorageData.close();
        }
        return arrayList;
    }

    public static WorkoutRecord b(String str, long j, String str2) {
        String str3 = "select * from " + gmc.g().getTableFullName("workout_record") + " where userId=? and workoutId=? and exerciseTime between ? and ?";
        String[] strArr = {str, str2, Long.toString(j - 1000), Long.toString(j + 1000)};
        WorkoutRecord workoutRecordB = null;
        try {
            Cursor cursorRawQueryStorageData = gmc.g().rawQueryStorageData(1, str3, strArr);
            if (cursorRawQueryStorageData != null) {
                try {
                    LogUtil.a("Suggestion_WorkoutRecordDao", "Columns=", Integer.valueOf(cursorRawQueryStorageData.getColumnCount()));
                    if (cursorRawQueryStorageData.moveToNext()) {
                        workoutRecordB = gmw.b(cursorRawQueryStorageData);
                    }
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
            if (cursorRawQueryStorageData != null) {
                cursorRawQueryStorageData.close();
            }
            return workoutRecordB;
        } catch (SQLiteException e) {
            LogUtil.e("Suggestion_WorkoutRecordDao", "getWorkoutRecord", LogAnonymous.b(e));
            return workoutRecordB;
        }
    }
}
