package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.huawei.basefitnessadvice.model.Plan;
import com.huawei.health.device.model.RecordAction;
import com.huawei.health.plan.model.data.BaseDao;
import com.huawei.health.sport.model.AnnualWorkoutRecord;
import com.huawei.health.sport.model.WorkoutRecord;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.HwExerciseConstants;
import com.huawei.hwfoundationmodel.trackmodel.HeartRateData;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.JsbMapKeyNames;
import com.huawei.operation.utils.Constants;
import com.huawei.pluginachievement.manager.model.ParsedFieldTag;
import com.huawei.pluginfitnessadvice.Classify;
import health.compact.a.DbManager;
import health.compact.a.LogAnonymous;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import health.compact.a.utils.StringUtils;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes29.dex */
public class gmw extends BaseDao {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Map<String, Integer> f35759b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static gzy f35760c = new gzy();

    static {
        TreeMap treeMap = new TreeMap();
        f35759b = treeMap;
        treeMap.put("Y001", 137);
        f35759b.put("Y002", 137);
        f35759b.put("Y003", 137);
        f35759b.put("Y004", 137);
        f35759b.put("Y005", 137);
        f35759b.put("Y006", 137);
        f35759b.put("Y007", 137);
        f35759b.put("Y008", 137);
        f35759b.put("Y009", 137);
        f35759b.put("Y010", 137);
        f35759b.put("Y015", 137);
        f35759b.put("Y016", 137);
        f35759b.put("Y017", 137);
        f35759b.put("Y018", 137);
    }

    private static boolean a(WorkoutRecord workoutRecord) {
        return workoutRecord.acquireDistance() > 0.0f;
    }

    public static boolean c(String str, WorkoutRecord workoutRecord) {
        LogUtil.a("Suggestion_WRDaoHelper", "updatePlanProgress enter");
        if (workoutRecord == null) {
            LogUtil.j("Suggestion_WRDaoHelper", "workoutRecord == null");
            return false;
        }
        if (workoutRecord.isFitnessRecordFromDevice() && b(str, workoutRecord)) {
            LogUtil.j("Suggestion_WRDaoHelper", "device sync same record. workout record id:", Integer.valueOf(workoutRecord.acquireId()));
            return true;
        }
        if (TextUtils.isEmpty(workoutRecord.acquirePlanId())) {
            LogUtil.a("Suggestion_WRDaoHelper", "Fitness workoutRecord");
            workoutRecord.saveRecordType(0);
        } else if (gnw.f35849b) {
            ghf ghfVarA = gmi.b().a();
            if (ghfVarA == null && gnu.e(workoutRecord.acquirePlanId()) == 0) {
                e(str, workoutRecord);
            } else if (gnw.e(ghfVarA, workoutRecord)) {
                workoutRecord.savePlanId("");
            } else {
                workoutRecord.saveRecordType(1);
            }
        } else if (gnu.e(workoutRecord.acquirePlanId()) == 0) {
            LogUtil.a("Suggestion_WRDaoHelper", "runPlan workoutRecord");
            e(str, workoutRecord);
        } else if (gnu.e(workoutRecord.acquirePlanId()) == 3) {
            LogUtil.a("Suggestion_WRDaoHelper", "fitness plan workoutRecord");
            if (gme.c().a(workoutRecord)) {
                LogUtil.a("Suggestion_WRDaoHelper", "today workout record has exceed plan last date");
                workoutRecord.savePlanId("");
            } else {
                List<WorkoutRecord> listA = a(str, workoutRecord.acquirePlanId(), workoutRecord.acquireWorkoutDate());
                if (listA.isEmpty()) {
                    LogUtil.a("Suggestion_WRDaoHelper", "today has no record");
                    workoutRecord.saveRecordType(1);
                } else {
                    d(str, workoutRecord, listA);
                }
            }
        }
        return g(str, workoutRecord);
    }

    private static boolean g(String str, WorkoutRecord workoutRecord) {
        if (gmv.e(str, Long.toString(workoutRecord.acquireExerciseTime())) != null) {
            boolean zC = c(str, Long.toString(workoutRecord.acquireExerciseTime()), workoutRecord.acquireExtend());
            LogUtil.a("Suggestion_WRDaoHelper", "update result:", Boolean.valueOf(zC));
            return zC;
        }
        boolean zA = a(str, workoutRecord);
        LogUtil.a("Suggestion_WRDaoHelper", "insert result:", Boolean.valueOf(zA));
        return zA;
    }

    private static void e(String str, WorkoutRecord workoutRecord) throws Throwable {
        if (e(workoutRecord)) {
            LogUtil.a("Suggestion_WRDaoHelper", "runPlan workoutRecord beyond plan");
            workoutRecord.savePlanId("");
        } else {
            d(str, workoutRecord);
        }
    }

    public static boolean b(String str, WorkoutRecord workoutRecord) {
        return gmv.e(str, Long.toString(workoutRecord.acquireExerciseTime())) != null;
    }

    private static void d(String str, WorkoutRecord workoutRecord, List<WorkoutRecord> list) throws Throwable {
        if (njy.e(list) || workoutRecord == null) {
            return;
        }
        long jA = ift.a(workoutRecord.acquireExerciseTime());
        for (WorkoutRecord workoutRecord2 : list) {
            if (workoutRecord2 != null) {
                long jA2 = ift.a(workoutRecord2.acquireExerciseTime());
                if (jA == jA2) {
                    LogUtil.a("Suggestion_WRDaoHelper", "today has record");
                    d(str, workoutRecord);
                } else if (jA > jA2) {
                    LogUtil.a("Suggestion_WRDaoHelper", "invalid plan record");
                    workoutRecord.savePlanId("");
                }
            }
        }
    }

    private static boolean e(WorkoutRecord workoutRecord) {
        Plan currentPlan = gls.b().getCurrentPlan();
        if (currentPlan == null) {
            LogUtil.j("Suggestion_WRDaoHelper", "hasWorkoutRecordBeyondRunPlan plan == null");
            return true;
        }
        if (gnu.e(currentPlan.acquireId()) == 3) {
            LogUtil.j("Suggestion_WRDaoHelper", "hasWorkoutRecordBeyondRunPlan fitness plan");
            return true;
        }
        if (ift.a(workoutRecord.acquireExerciseTime()) <= ift.a(ifw.e(currentPlan.getEndDate(), "yyyy-MM-dd") * 1000)) {
            return false;
        }
        LogUtil.a("Suggestion_WRDaoHelper", "hasWorkoutRecordBeyondRunPlan plan expired");
        return true;
    }

    private static void d(String str, WorkoutRecord workoutRecord) throws Throwable {
        if (workoutRecord == null) {
            return;
        }
        WorkoutRecord workoutRecordC = c(str, workoutRecord.acquirePlanId(), workoutRecord.acquireWorkoutId(), workoutRecord.acquireWorkoutDate(), workoutRecord.acquireWorkoutOrder());
        if (workoutRecordC == null) {
            LogUtil.a("Suggestion_WRDaoHelper", "currentWorkoutRecord == null");
            workoutRecord.saveRecordType(1);
            return;
        }
        if (workoutRecordC.acquireWorkoutDate() != null && !workoutRecordC.acquireWorkoutDate().equals(ift.e(workoutRecordC.acquireWorkoutDate(), "yyyy-MM-dd", Locale.ENGLISH))) {
            LogUtil.a("Suggestion_WRDaoHelper", "update workout data: ", workoutRecordC.acquireWorkoutDate());
            c(str, workoutRecordC.acquirePlanId(), workoutRecordC.acquireWorkoutDate(), workoutRecordC.acquireWorkoutOrder());
        }
        if (!glr.e(workoutRecordC)) {
            LogUtil.a("Suggestion_WRDaoHelper", "invalidWorkoutRecord");
            workoutRecord.saveRecordType(1);
            b(str, workoutRecordC.acquirePlanId(), workoutRecordC.acquireWorkoutDate(), workoutRecordC.acquireWorkoutOrder());
        } else if (!c(workoutRecordC, workoutRecord)) {
            LogUtil.a("Suggestion_WRDaoHelper", "invalid plan record");
            workoutRecord.savePlanId("");
        } else if (a(workoutRecordC, workoutRecord)) {
            LogUtil.a("Suggestion_WRDaoHelper", "updateWorkoutRecord");
            workoutRecord.saveRecordType(1);
            a(str, workoutRecordC.acquirePlanId(), workoutRecordC.acquireWorkoutDate(), workoutRecordC.acquireWorkoutOrder());
        } else {
            LogUtil.a("Suggestion_WRDaoHelper", "handlePlanRecord common record type");
            workoutRecord.saveRecordType(0);
        }
    }

    private static boolean c(WorkoutRecord workoutRecord, WorkoutRecord workoutRecord2) {
        if (ift.a(workoutRecord.acquireExerciseTime()) == ift.a(workoutRecord2.acquireExerciseTime())) {
            return true;
        }
        LogUtil.a("Suggestion_WRDaoHelper", "history workoutRecord is not same day as current workoutRecord");
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:50:0x0114  */
    /* JADX WARN: Not initialized variable reg: 5, insn: 0x0111: MOVE (r4 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r5 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]), block:B:48:0x0111 */
    public static void b(String str, List<WorkoutRecord> list) {
        boolean z;
        boolean z2;
        if (njy.e(list)) {
            return;
        }
        boolean z3 = false;
        try {
            try {
                if (DbManager.i(String.valueOf(fga.b()))) {
                    z = false;
                } else {
                    gmc.g().h();
                    z = true;
                }
                try {
                    for (WorkoutRecord workoutRecord : list) {
                        if (workoutRecord != null) {
                            workoutRecord.saveRecordType(1);
                            WorkoutRecord workoutRecordC = c(str, workoutRecord.acquirePlanId(), workoutRecord.acquireWorkoutId(), workoutRecord.acquireWorkoutDate(), workoutRecord.acquireWorkoutOrder());
                            if (workoutRecordC == null) {
                                a(str, workoutRecord);
                            } else {
                                if (workoutRecordC.acquireWorkoutDate() != null && !workoutRecordC.acquireWorkoutDate().equals(ift.e(workoutRecordC.acquireWorkoutDate(), "yyyy-MM-dd", Locale.ENGLISH))) {
                                    LogUtil.a("Suggestion_WRDaoHelper", "update workout Id:", workoutRecordC.acquireWorkoutId(), " data: ", workoutRecordC.acquireWorkoutDate());
                                    c(str, workoutRecordC.acquirePlanId(), workoutRecordC.acquireWorkoutDate(), workoutRecordC.acquireWorkoutOrder());
                                }
                                if (!glr.e(workoutRecordC)) {
                                    b(str, workoutRecordC.acquirePlanId(), workoutRecordC.acquireWorkoutDate(), workoutRecordC.acquireWorkoutOrder());
                                    a(str, workoutRecord);
                                } else if (a(workoutRecordC, workoutRecord)) {
                                    a(str, workoutRecordC.acquirePlanId(), workoutRecordC.acquireWorkoutDate(), workoutRecordC.acquireWorkoutOrder());
                                    a(str, workoutRecord);
                                }
                            }
                        }
                    }
                    if (z) {
                        gmc.g().f();
                    }
                    LogUtil.d("Suggestion_WRDaoHelper", "workoutRecords：", list.toString());
                } catch (SQLiteException e) {
                    e = e;
                    ReleaseLogUtil.a("Suggestion_WRDaoHelper", "SQLiteDatabaseLockedException:", LogAnonymous.b(e));
                    if (z) {
                        gmc.g().f();
                    }
                    LogUtil.d("Suggestion_WRDaoHelper", "workoutRecords：", list.toString());
                }
            } catch (Throwable th) {
                th = th;
                z3 = z2;
                if (z3) {
                    gmc.g().f();
                }
                LogUtil.d("Suggestion_WRDaoHelper", "workoutRecords：", list.toString());
                throw th;
            }
        } catch (SQLiteException e2) {
            e = e2;
            z = false;
        } catch (Throwable th2) {
            th = th2;
            if (z3) {
                gmc.g().f();
            }
            LogUtil.d("Suggestion_WRDaoHelper", "workoutRecords：", list.toString());
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00ff  */
    /* JADX WARN: Not initialized variable reg: 5, insn: 0x00fc: MOVE (r4 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r5 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]), block:B:42:0x00fc */
    public static void a(String str, String str2, List<WorkoutRecord> list) {
        boolean z;
        boolean z2;
        if (njy.e(list)) {
            return;
        }
        boolean z3 = false;
        try {
            try {
                if (DbManager.i(String.valueOf(fga.b()))) {
                    z = false;
                } else {
                    gmc.g().h();
                    z = true;
                }
                try {
                    List<WorkoutRecord> listA = gmv.a(str2, str);
                    for (WorkoutRecord workoutRecord : list) {
                        if (workoutRecord != null) {
                            workoutRecord.saveRecordType(1);
                            WorkoutRecord workoutRecordD = d(listA, workoutRecord.acquireExerciseTime());
                            if (workoutRecordD == null) {
                                LogUtil.a("Suggestion_WRDaoHelper", "local record not exist.the cloudWorkoutRecord:", Integer.valueOf(workoutRecord.acquireId()));
                                a(str2, workoutRecord);
                            } else if (!glr.e(workoutRecordD)) {
                                LogUtil.a("Suggestion_WRDaoHelper", "currentWorkoutRecord is not valid.");
                                d(str2, workoutRecordD.acquirePlanId(), workoutRecordD.acquireExerciseTime());
                                a(str2, workoutRecord);
                            } else {
                                LogUtil.a("Suggestion_WRDaoHelper", "local has exist record,", workoutRecord.acquireWorkoutName());
                            }
                            LogUtil.a("Suggestion_WRDaoHelper", "insertWorkoutRecords:", workoutRecord.acquirePlanId(), " workoutId:", workoutRecord.acquireWorkoutId(), " exerciseTime:", Long.valueOf(workoutRecord.acquireExerciseTime()));
                        }
                    }
                    if (z) {
                        gmc.g().f();
                    }
                    LogUtil.d("Suggestion_WRDaoHelper", "workoutRecords：", list.toString());
                } catch (SQLiteException e) {
                    e = e;
                    ReleaseLogUtil.a("Suggestion_WRDaoHelper", "SQLiteDatabaseLockedException:", LogAnonymous.b(e));
                    if (z) {
                        gmc.g().f();
                    }
                    LogUtil.d("Suggestion_WRDaoHelper", "workoutRecords：", list.toString());
                }
            } catch (Throwable th) {
                th = th;
                z3 = z2;
                if (z3) {
                    gmc.g().f();
                }
                LogUtil.d("Suggestion_WRDaoHelper", "workoutRecords：", list.toString());
                throw th;
            }
        } catch (SQLiteException e2) {
            e = e2;
            z = false;
        } catch (Throwable th2) {
            th = th2;
            if (z3) {
                gmc.g().f();
            }
            LogUtil.d("Suggestion_WRDaoHelper", "workoutRecords：", list.toString());
            throw th;
        }
    }

    private static WorkoutRecord d(List<WorkoutRecord> list, long j) {
        for (WorkoutRecord workoutRecord : list) {
            LogUtil.a("Suggestion_WRDaoHelper", workoutRecord.acquireWorkoutName(), " local tm:", Long.valueOf(workoutRecord.acquireExerciseTime()), " cloud tm:", Long.valueOf(j));
            if (ifw.a(workoutRecord.acquireExerciseTime()) == ifw.a(j)) {
                return workoutRecord;
            }
        }
        return null;
    }

    private static boolean a(WorkoutRecord workoutRecord, WorkoutRecord workoutRecord2) {
        if (a(workoutRecord2)) {
            if (workoutRecord.acquireActualDistance() != workoutRecord2.acquireActualDistance()) {
                return workoutRecord.acquireActualDistance() < workoutRecord2.acquireActualDistance();
            }
            return workoutRecord.getDuration() > workoutRecord2.getDuration();
        }
        if (workoutRecord.acquireActualCalorie() != workoutRecord2.acquireActualCalorie()) {
            return workoutRecord.acquireActualCalorie() < workoutRecord2.acquireActualCalorie();
        }
        return workoutRecord.getDuration() < workoutRecord2.getDuration();
    }

    public static boolean a(String str, WorkoutRecord workoutRecord) {
        String strE;
        ContentValues contentValues = new ContentValues();
        if (workoutRecord == null) {
            LogUtil.j("Suggestion_WRDaoHelper", "insertWorkoutRecord workoutRecord");
            return false;
        }
        contentValues.put(JsbMapKeyNames.H5_USER_ID, str);
        contentValues.put("planId", StringUtils.c((Object) workoutRecord.acquirePlanId()));
        contentValues.put(HwExerciseConstants.METHOD_PARAM_WORKOUT_ID, workoutRecord.acquireWorkoutId());
        contentValues.put("recordIndex", Integer.valueOf(workoutRecord.acquireId()));
        contentValues.put("workoutName", workoutRecord.acquireWorkoutName());
        contentValues.put("exerciseDate", Integer.valueOf(ifp.e((Object) ieg.d(new Date(workoutRecord.acquireExerciseTime()), "yyyyMMdd"))));
        contentValues.put("exerciseTime", Long.valueOf(workoutRecord.acquireExerciseTime()));
        contentValues.put("actualCalorie", Float.valueOf(workoutRecord.acquireActualCalorie()));
        contentValues.put("actualDistance", Float.valueOf(workoutRecord.acquireActualDistance()));
        contentValues.put("calorie", Float.valueOf(workoutRecord.acquireCalorie()));
        contentValues.put("distance", Float.valueOf(workoutRecord.acquireDistance()));
        contentValues.put("finishRate", Float.valueOf(workoutRecord.acquireFinishRate()));
        contentValues.put("during", Integer.valueOf(workoutRecord.getDuration()));
        contentValues.put("workoutOrder", Integer.valueOf(workoutRecord.acquireWorkoutOrder()));
        contentValues.put("upperHeartRate", Integer.valueOf(workoutRecord.acquireUpperHeartRate()));
        contentValues.put("lowerHeartRate", Integer.valueOf(workoutRecord.acquireLowerHeartRate()));
        if (TextUtils.isEmpty(workoutRecord.acquireWorkoutDate())) {
            strE = ift.i(workoutRecord.acquireExerciseTime());
        } else {
            strE = ift.e(workoutRecord.acquireWorkoutDate(), "yyyy-MM-dd", Locale.ENGLISH);
        }
        contentValues.put("workoutDate", strE);
        contentValues.put("bestPace", Integer.valueOf(workoutRecord.acquireBestPace()));
        contentValues.put("oxygen", Double.valueOf(ped.b(workoutRecord.acquireOxygen())));
        contentValues.put("trainingLoadPeak", Integer.valueOf(workoutRecord.acquireTrainingLoadPeak()));
        contentValues.put("weekNum", Integer.valueOf(workoutRecord.acquireWeekNum()));
        contentValues.put(WorkoutRecord.Extend.RunWorkout.RUN_WORKOUT_TRAJECTORY_ID, workoutRecord.acquireTrajectoryId());
        contentValues.put("actionSummary", workoutRecord.acquireActionSummary());
        contentValues.put("recordType", Integer.valueOf(workoutRecord.acquireRecordType()));
        contentValues.put("version", workoutRecord.acquireVersion());
        contentValues.put("wearType", Integer.valueOf(workoutRecord.acquireWearType()));
        contentValues.put("sportRecordType", Integer.valueOf(workoutRecord.getSportRecordType()));
        contentValues.put(ParsedFieldTag.NPES_TOTAL_SCORE, Long.valueOf(workoutRecord.getTotalScore()));
        contentValues.put("recordModeType", Integer.valueOf(workoutRecord.getRecordModeType()));
        contentValues.put("extend", workoutRecord.acquireExtend());
        return c(contentValues, workoutRecord) > 0;
    }

    private static long c(ContentValues contentValues, WorkoutRecord workoutRecord) {
        List<HeartRateData> listAcquireHeartRateDataList = workoutRecord.acquireHeartRateDataList();
        Gson gson = new Gson();
        if (listAcquireHeartRateDataList != null) {
            contentValues.put("heartRateList", gson.toJson(listAcquireHeartRateDataList));
        }
        List<HeartRateData> listAcquireInvalidHeartRateList = workoutRecord.acquireInvalidHeartRateList();
        if (listAcquireInvalidHeartRateList != null) {
            contentValues.put("invalidHeartRateList", gson.toJson(listAcquireInvalidHeartRateList));
        }
        contentValues.put("category", Integer.valueOf(workoutRecord.acquireCategory()));
        List<Integer> intensityZone = workoutRecord.getIntensityZone();
        if (intensityZone != null) {
            contentValues.put("intensityZone", gson.toJson(intensityZone));
        }
        contentValues.put(HwExerciseConstants.JSON_NAME_TRAINING_POINTS, Integer.valueOf(workoutRecord.getTrainPoint()));
        return gmc.g().insertStorageData("workout_record", 1, contentValues);
    }

    public static boolean a(String str, String str2, String str3, int i) {
        ContentValues contentValues = new ContentValues();
        String strE = ift.e(str3, "yyyy-MM-dd", Locale.ENGLISH);
        contentValues.put("recordType", (Integer) 0);
        gmc gmcVarG = gmc.g();
        StringBuilder sb = new StringBuilder("planId=? and userId=? and recordType=1 and workoutDate=? and workoutOrder=");
        sb.append(i);
        return gmcVarG.updateStorageData("workout_record", 1, contentValues, sb.toString(), new String[]{StringUtils.c((Object) str2), StringUtils.c((Object) str), StringUtils.c((Object) strE)}) > 0;
    }

    public static boolean c(String str, String str2, String str3) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("extend", str3);
        return gmc.g().updateStorageData("workout_record", 1, contentValues, "userId=? and exerciseTime=?", new String[]{StringUtils.c((Object) str), StringUtils.c((Object) str2)}) > 0;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0083  */
    public static boolean c(String str, WorkoutRecord workoutRecord, int i) {
        boolean z;
        boolean z2 = false;
        if (workoutRecord == null) {
            return false;
        }
        try {
            try {
                if (DbManager.i(String.valueOf(fga.b()))) {
                    z = false;
                } else {
                    gmc.g().h();
                    z = true;
                }
                try {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("recordIndex", Integer.valueOf(i));
                    int iUpdateStorageData = gmc.g().updateStorageData("workout_record", 1, contentValues, "userId=? and exerciseTime= " + workoutRecord.acquireExerciseTime(), new String[]{StringUtils.c((Object) str)});
                    if (z) {
                        gmc.g().f();
                    }
                    if (iUpdateStorageData > 0) {
                        z2 = true;
                    }
                } catch (SQLiteException e) {
                    e = e;
                    ReleaseLogUtil.a("Suggestion_WRDaoHelper", "SQLiteDatabaseLockedException:", LogAnonymous.b(e));
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
        return z2;
    }

    public static boolean b(String str, String str2, String str3, int i) {
        int iDeleteStorageData;
        if (str3 == null || str2 == null || str == null) {
            LogUtil.e("Suggestion_WRDaoHelper", "delWorkoutRecord para error");
            return false;
        }
        String strE = ift.e(str3, "yyyy-MM-dd", Locale.ENGLISH);
        int iDeleteStorageData2 = gmc.g().deleteStorageData("workout_record", 1, "planId=? and userId=? and recordType=1 and workoutDate=? and workoutOrder=" + i, new String[]{StringUtils.c((Object) str2), StringUtils.c((Object) str), StringUtils.c((Object) strE)});
        if (str3.equals(strE)) {
            iDeleteStorageData = 0;
        } else {
            iDeleteStorageData = gmc.g().deleteStorageData("workout_record", 1, "planId=? and userId=? and recordType=1 and workoutDate=? and workoutOrder=" + i, new String[]{StringUtils.c((Object) str2), StringUtils.c((Object) str), StringUtils.c((Object) str3)});
        }
        return iDeleteStorageData2 > 0 || iDeleteStorageData > 0;
    }

    public static void d(String str, String str2, long j) {
        gmc gmcVarG = gmc.g();
        StringBuilder sb = new StringBuilder("planId=? and userId=? and exerciseTime=");
        sb.append(j);
        LogUtil.a("Suggestion_WRDaoHelper", "delWorkoutRecord:", Long.valueOf(j), Boolean.valueOf(gmcVarG.deleteStorageData("workout_record", 1, sb.toString(), new String[]{StringUtils.c((Object) str2), StringUtils.c((Object) str)}) > 0));
    }

    public static void a(String str) {
        gmc.g().deleteStorageData("workout_record", 1, "planId=?", new String[]{StringUtils.c((Object) str)});
    }

    public static int e(long j, String str, String str2) {
        return gmc.g().deleteStorageData("workout_record", 1, "exerciseTime=? and userId=? and workoutId=?", new String[]{StringUtils.c(Long.valueOf(j)), str, str2});
    }

    public static WorkoutRecord c(String str, String str2, String str3, String str4, int i) throws Throwable {
        WorkoutRecord workoutRecordD = d(new String[]{str2, str, str3, StringUtils.c((Object) str4), StringUtils.c(Integer.valueOf(i))}, "select * from " + gmc.g().getTableFullName("workout_record") + " where planId=? and userId=? and workoutId=? and recordType=1 and workoutDate=? and workoutOrder=?");
        if (workoutRecordD == null) {
            String strE = ift.e(str4, "yyyy-MM-dd", Locale.ENGLISH);
            if (strE == null || str4 == null) {
                LogUtil.e("Suggestion_WRDaoHelper", "getWorkoutRecords format fail, workoutDate", str4);
                return workoutRecordD;
            }
            if (!str4.equals(strE)) {
                return d(str, str2, str4, i, strE);
            }
        }
        return workoutRecordD;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x004b  */
    private static WorkoutRecord d(String[] strArr, String str) throws Throwable {
        SQLiteException e;
        Cursor cursorRawQueryStorageData;
        Cursor cursor = null;
        workoutRecordB = null;
        WorkoutRecord workoutRecordB = null;
        try {
            cursorRawQueryStorageData = gmc.g().rawQueryStorageData(1, str, strArr);
            if (cursorRawQueryStorageData != null) {
                try {
                    try {
                        if (cursorRawQueryStorageData.moveToNext()) {
                            LogUtil.a("Suggestion_WRDaoHelper", "getWorkoutRecord with compatibility");
                            workoutRecordB = b(cursorRawQueryStorageData);
                        }
                    } catch (SQLiteException e2) {
                        e = e2;
                        LogUtil.e("Suggestion_WRDaoHelper", "getWorkoutRecord data:", LogAnonymous.b(e));
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
            return workoutRecordB;
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

    public static WorkoutRecord b(Cursor cursor) {
        if (cursor == null) {
            return null;
        }
        WorkoutRecord workoutRecord = new WorkoutRecord();
        e(cursor, workoutRecord);
        String strA = a(cursor, "heartRateList");
        if (!TextUtils.isEmpty(strA) && !Constants.NULL.equals(strA)) {
            workoutRecord.saveHeartRateDataList(peh.c(strA, HeartRateData[].class));
        }
        String strA2 = a(cursor, "invalidHeartRateList");
        if (!TextUtils.isEmpty(strA2) && !Constants.NULL.equals(strA2)) {
            workoutRecord.saveInvalidHeartRateList(peh.c(strA2, HeartRateData[].class));
        }
        workoutRecord.saveCategory(e(cursor, "category"));
        String strA3 = a(cursor, "intensityZone");
        if (!TextUtils.isEmpty(strA3) && !Constants.NULL.equals(strA3)) {
            workoutRecord.setIntensityZone(peh.c(strA3, Integer[].class));
        }
        workoutRecord.setTrainPoint(e(cursor, HwExerciseConstants.JSON_NAME_TRAINING_POINTS));
        d(workoutRecord);
        LogUtil.a("Suggestion_WRDaoHelper", "getWorkoutRecord PId=", workoutRecord.acquirePlanId(), ",WId=", workoutRecord.acquireWorkoutId(), ",WName=", workoutRecord.acquireWorkoutName());
        return workoutRecord;
    }

    public static long e(Cursor cursor) {
        if (cursor == null) {
            return 0L;
        }
        return c(cursor, "exerciseTime");
    }

    private static void e(Cursor cursor, WorkoutRecord workoutRecord) {
        workoutRecord.savePlanId(a(cursor, "planId"));
        workoutRecord.saveId(e(cursor, "recordIndex"));
        workoutRecord.saveWorkoutId(a(cursor, HwExerciseConstants.METHOD_PARAM_WORKOUT_ID));
        workoutRecord.saveWorkoutName(a(cursor, "workoutName"));
        workoutRecord.saveActualCalorie(d(cursor, "actualCalorie"));
        workoutRecord.saveActualDistance(d(cursor, "actualDistance"));
        workoutRecord.saveCalorie(d(cursor, "calorie"));
        workoutRecord.saveDistance(d(cursor, "distance"));
        workoutRecord.setDuration(e(cursor, "during"));
        workoutRecord.saveWorkoutOrder(e(cursor, "workoutOrder"));
        workoutRecord.saveWorkoutDate(a(cursor, "workoutDate"));
        workoutRecord.saveExerciseTime(c(cursor, "exerciseTime"));
        workoutRecord.saveFinishRate(d(cursor, "finishRate"));
        workoutRecord.saveUpperHeartRate(e(cursor, "upperHeartRate"));
        workoutRecord.saveLowerHeartRate(e(cursor, "lowerHeartRate"));
        workoutRecord.saveBestPace(e(cursor, "bestPace"));
        workoutRecord.saveOxygen(b(cursor, "oxygen"));
        workoutRecord.saveTrainingLoadPeak(e(cursor, "trainingLoadPeak"));
        workoutRecord.saveWeekNum(e(cursor, "weekNum"));
        workoutRecord.saveTrajectoryId(a(cursor, WorkoutRecord.Extend.RunWorkout.RUN_WORKOUT_TRAJECTORY_ID));
        workoutRecord.saveActionSummary(a(cursor, "actionSummary"));
        workoutRecord.saveRecordType(e(cursor, "recordType"));
        workoutRecord.saveVersion(a(cursor, "version"));
        workoutRecord.saveWearType(e(cursor, "wearType"));
        workoutRecord.saveTotalScore(c(cursor, ParsedFieldTag.NPES_TOTAL_SCORE));
        workoutRecord.saveRecordModeType(e(cursor, "recordModeType"));
        workoutRecord.saveExtend(a(cursor, "extend"));
    }

    public static AnnualWorkoutRecord c(Cursor cursor) {
        AnnualWorkoutRecord annualWorkoutRecord = new AnnualWorkoutRecord();
        if (cursor != null) {
            annualWorkoutRecord.saveWorkoutName(a(cursor, "workoutName"));
            annualWorkoutRecord.setDuration(e(cursor, "during"));
            annualWorkoutRecord.saveWorkoutDate(a(cursor, "workoutDate"));
            annualWorkoutRecord.saveExerciseTime(c(cursor, "exerciseTime"));
            annualWorkoutRecord.saveActualCalorie(d(cursor, "actualCalorie"));
            annualWorkoutRecord.saveWorkoutId(a(cursor, HwExerciseConstants.METHOD_PARAM_WORKOUT_ID));
            annualWorkoutRecord.saveVersion(a(cursor, "version"));
            String strA = a(cursor, "primaryClassify");
            if (!TextUtils.isEmpty(strA) && !Constants.NULL.equals(strA)) {
                annualWorkoutRecord.setPrimaryClassify(peh.c(strA, Classify[].class));
            }
            String strA2 = a(cursor, "secondClassify");
            if (!TextUtils.isEmpty(strA2) && !Constants.NULL.equals(strA2)) {
                annualWorkoutRecord.setSecondClassify(peh.c(strA2, Classify[].class));
            }
        }
        return annualWorkoutRecord;
    }

    private static String a(Cursor cursor, String str) {
        try {
            int columnIndex = cursor.getColumnIndex(str);
            return columnIndex == -1 ? "" : cursor.getString(columnIndex);
        } catch (SQLiteException unused) {
            ReleaseLogUtil.a("Suggestion_WRDaoHelper", "getColumnValue SQLiteException");
            return "";
        } catch (IllegalStateException unused2) {
            ReleaseLogUtil.a("Suggestion_WRDaoHelper", "getColumnValue IllegalStateException");
            return "";
        }
    }

    public static int e(Cursor cursor, String str) {
        try {
            int columnIndex = cursor.getColumnIndex(str);
            if (columnIndex == -1) {
                return 0;
            }
            return cursor.getInt(columnIndex);
        } catch (SQLiteException unused) {
            ReleaseLogUtil.a("Suggestion_WRDaoHelper", "getColumnValueInt SQLiteException");
            return 0;
        } catch (IllegalStateException unused2) {
            ReleaseLogUtil.a("Suggestion_WRDaoHelper", "getColumnValueInt IllegalStateException");
            return 0;
        }
    }

    private static float d(Cursor cursor, String str) {
        try {
            int columnIndex = cursor.getColumnIndex(str);
            if (columnIndex == -1) {
                return 0.0f;
            }
            return cursor.getFloat(columnIndex);
        } catch (SQLiteException unused) {
            ReleaseLogUtil.a("Suggestion_WRDaoHelper", "getColumnValueFloat SQLiteException");
            return 0.0f;
        } catch (IllegalStateException unused2) {
            ReleaseLogUtil.a("Suggestion_WRDaoHelper", "getColumnValueFloat IllegalStateException");
            return 0.0f;
        }
    }

    private static long c(Cursor cursor, String str) {
        try {
            int columnIndex = cursor.getColumnIndex(str);
            if (columnIndex == -1) {
                return 0L;
            }
            return cursor.getLong(columnIndex);
        } catch (SQLiteException unused) {
            ReleaseLogUtil.a("Suggestion_WRDaoHelper", "getColumnValueLong SQLiteException");
            return 0L;
        } catch (IllegalStateException unused2) {
            ReleaseLogUtil.a("Suggestion_WRDaoHelper", "getColumnValueLong IllegalStateException");
            return 0L;
        }
    }

    private static double b(Cursor cursor, String str) {
        try {
            int columnIndex = cursor.getColumnIndex(str);
            if (columnIndex == -1) {
                return 0.0d;
            }
            return cursor.getDouble(columnIndex);
        } catch (SQLiteException unused) {
            ReleaseLogUtil.a("Suggestion_WRDaoHelper", "getColumnValueDouble SQLiteException");
            return 0.0d;
        } catch (IllegalStateException unused2) {
            ReleaseLogUtil.a("Suggestion_WRDaoHelper", "getColumnValueDouble IllegalStateException");
            return 0.0d;
        }
    }

    private static void d(WorkoutRecord workoutRecord) {
        int iE;
        int iB;
        if (!workoutRecord.isFitnessRecordFromDevice()) {
            LogUtil.a("Suggestion_WRDaoHelper", "record not from device");
            return;
        }
        if (workoutRecord.acquireWorkoutName() == null && workoutRecord.acquireWorkoutId() != null && (iB = f35760c.b(workoutRecord.acquireWorkoutId().trim())) != 0) {
            workoutRecord.saveWorkoutName(BaseApplication.getContext().getResources().getString(iB));
        }
        List<RecordAction> listC = peh.c(workoutRecord.acquireActionSummary(), RecordAction[].class);
        ArrayList arrayList = new ArrayList(listC.size());
        for (RecordAction recordAction : listC) {
            if (recordAction != null && (iE = e(arrayList, recordAction)) != 0) {
                recordAction.setActionName(BaseApplication.getContext().getResources().getString(iE));
                arrayList.add(recordAction);
            }
        }
        workoutRecord.saveActionSummary(new Gson().toJson(arrayList));
    }

    private static int e(List<RecordAction> list, RecordAction recordAction) {
        String strTrim;
        if (!TextUtils.isEmpty(recordAction.getActionId())) {
            strTrim = recordAction.getActionId().trim();
        } else if (!TextUtils.isEmpty(recordAction.getActionName())) {
            strTrim = recordAction.getActionName().trim();
        } else {
            strTrim = "";
        }
        int iB = f35760c.b(strTrim);
        if (iB != 0) {
            return iB;
        }
        list.add(recordAction);
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0083  */
    private static WorkoutRecord d(String str, String str2, String str3, int i, String str4) throws Throwable {
        SQLiteException e;
        Cursor cursorRawQueryStorageData;
        LogUtil.j("Suggestion_WRDaoHelper", "getWorkoutRecords format data src: ", str3, " dst start data: ", str4);
        String str5 = "select * from " + gmc.g().getTableFullName("workout_record") + " where planId=? and userId=? and recordType=1 and workoutDate=? and workoutOrder=?";
        String[] strArr = {str2, str, StringUtils.c((Object) str4), StringUtils.c(Integer.valueOf(i))};
        Cursor cursor = null;
        workoutRecordB = null;
        WorkoutRecord workoutRecordB = null;
        try {
            cursorRawQueryStorageData = gmc.g().rawQueryStorageData(1, str5, strArr);
            if (cursorRawQueryStorageData != null) {
                try {
                    try {
                        if (cursorRawQueryStorageData.moveToNext()) {
                            LogUtil.a("Suggestion_WRDaoHelper", "getWorkoutRecord");
                            workoutRecordB = b(cursorRawQueryStorageData);
                        }
                    } catch (SQLiteException e2) {
                        e = e2;
                        LogUtil.e("Suggestion_WRDaoHelper", "getWorkoutRecordCompatibility:", LogAnonymous.b(e));
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
            return workoutRecordB;
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

    /* JADX WARN: Code duplicated, block: B:15:0x0065 A[PHI: r6
      0x0065: PHI (r6v3 android.database.Cursor) = (r6v1 android.database.Cursor), (r6v4 android.database.Cursor) binds: [B:14:0x0063, B:8:0x004d] A[DONT_GENERATE, DONT_INLINE]] */
    public static List<WorkoutRecord> a(String str, String str2, String str3) {
        ArrayList arrayList = new ArrayList(10);
        Cursor cursorRawQueryStorageData = null;
        try {
            try {
                cursorRawQueryStorageData = gmc.g().rawQueryStorageData(1, "select * from " + gmc.g().getTableFullName("workout_record") + " where planId=? and userId=? and recordType=1 and workoutDate=? ", new String[]{str2, str, str3});
                if (cursorRawQueryStorageData != null && cursorRawQueryStorageData.moveToNext()) {
                    LogUtil.a("Suggestion_WRDaoHelper", "getWorkoutRecord by date");
                    arrayList.add(b(cursorRawQueryStorageData));
                }
                if (cursorRawQueryStorageData != null) {
                    cursorRawQueryStorageData.close();
                }
            } catch (SQLiteException e) {
                LogUtil.e("Suggestion_WRDaoHelper", "getWorkoutRecordByDay:", LogAnonymous.b(e));
                if (cursorRawQueryStorageData != null) {
                    cursorRawQueryStorageData.close();
                }
            }
            String strE = ift.e(str3, "yyyy-MM-dd", Locale.ENGLISH);
            if (strE == null || str3 == null) {
                LogUtil.e("Suggestion_WRDaoHelper", "getWorkoutRecords format fail, workoutDate", str3);
                return arrayList;
            }
            if (str3.equals(strE)) {
                return arrayList;
            }
            LogUtil.j("Suggestion_WRDaoHelper", "getWorkoutRecords format data src: ", str3, " dst start data: ", strE);
            return b(str, str2, strE);
        } catch (Throwable th) {
            if (cursorRawQueryStorageData != null) {
                cursorRawQueryStorageData.close();
            }
            throw th;
        }
    }

    private static List<WorkoutRecord> b(String str, String str2, String str3) {
        ArrayList arrayList = new ArrayList(10);
        Cursor cursorRawQueryStorageData = null;
        try {
            cursorRawQueryStorageData = gmc.g().rawQueryStorageData(1, "select * from " + gmc.g().getTableFullName("workout_record") + " where planId=? and userId=? and recordType=1 and workoutDate=? ", new String[]{str2, str, str3});
            if (cursorRawQueryStorageData != null && cursorRawQueryStorageData.moveToNext()) {
                LogUtil.a("Suggestion_WRDaoHelper", "getWorkoutRecord workout date");
                arrayList.add(b(cursorRawQueryStorageData));
            }
            if (cursorRawQueryStorageData != null) {
                return arrayList;
            }
        } catch (SQLiteException e) {
            LogUtil.e("Suggestion_WRDaoHelper", "getWorkoutDataCursor", LogAnonymous.b(e));
        } finally {
            if (cursorRawQueryStorageData != null) {
                cursorRawQueryStorageData.close();
            }
        }
        return arrayList;
    }

    public static boolean c(String str, String str2, String str3, int i) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("workoutDate", ift.e(str3, "yyyy-MM-dd", Locale.ENGLISH));
        gmc gmcVarG = gmc.g();
        StringBuilder sb = new StringBuilder("planId=? and userId=? and recordType=1 and workoutDate=? and workoutOrder=");
        sb.append(i);
        return gmcVarG.updateStorageData("workout_record", 1, contentValues, sb.toString(), new String[]{StringUtils.c((Object) str2), StringUtils.c((Object) str), str3}) > 0;
    }

    public static boolean b() {
        return gmc.g().deleteStorageData("workout_record", 1, null, null) == 0;
    }

    public static void d(List<WorkoutRecord> list) {
        if (njy.e(list)) {
            return;
        }
        for (WorkoutRecord workoutRecord : list) {
            if (workoutRecord != null && workoutRecord.acquireCategory() == 0) {
                Integer num = f35759b.get(workoutRecord.acquireWorkoutId());
                int iIntValue = num != null ? num.intValue() : 0;
                workoutRecord.saveCategory(iIntValue);
                workoutRecord.setCategoryIntoExtend(iIntValue);
            }
        }
    }
}
