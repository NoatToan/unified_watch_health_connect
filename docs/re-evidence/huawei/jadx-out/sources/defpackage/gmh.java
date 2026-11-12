package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.huawei.health.plan.model.data.BaseDao;
import com.huawei.health.plan.model.util.SqlUtil;
import com.huawei.health.sport.model.WorkoutRecord;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.HwExerciseConstants;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.openalliance.ad.constant.JsbMapKeyNames;
import com.huawei.operation.OpAnalyticsUtil;
import com.huawei.operation.OperationKey;
import com.huawei.pluginfitnessadvice.Attribute;
import com.huawei.pluginfitnessadvice.ChoreographedMultiActions;
import com.huawei.pluginfitnessadvice.Classify;
import com.huawei.pluginfitnessadvice.EquipmentWorkoutAction;
import com.huawei.pluginfitnessadvice.FitWorkout;
import com.huawei.pluginfitnessadvice.WorkoutAction;
import com.huawei.pluginfitnessadvice.pricetagbean.PriceTagBean;
import health.compact.a.LogAnonymous;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import health.compact.a.utils.StringUtils;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public class gmh extends BaseDao {
    public static final String d = new SqlUtil.d().e("recordId").c().c(JsbMapKeyNames.H5_USER_ID, SqlUtil.SqliteColumnType.TEXT).c(HwExerciseConstants.METHOD_PARAM_WORKOUT_ID, SqlUtil.SqliteColumnType.TEXT).c("name", SqlUtil.SqliteColumnType.TEXT).c("exerciseTimes", SqlUtil.SqliteColumnType.INTEGER).c("isSupportDevice", SqlUtil.SqliteColumnType.INTEGER).c("trainingPoints", SqlUtil.SqliteColumnType.TEXT).c("difficulty", SqlUtil.SqliteColumnType.INTEGER).c("equipments", SqlUtil.SqliteColumnType.TEXT).c("classes", SqlUtil.SqliteColumnType.TEXT).c("duration", SqlUtil.SqliteColumnType.INTEGER).c("calorie", SqlUtil.SqliteColumnType.REAL).c("distance", SqlUtil.SqliteColumnType.REAL).c("distance", SqlUtil.SqliteColumnType.REAL).c("picture", SqlUtil.SqliteColumnType.TEXT).c("midPicture", SqlUtil.SqliteColumnType.TEXT).c("description", SqlUtil.SqliteColumnType.TEXT).c("stage", SqlUtil.SqliteColumnType.INTEGER).c("users", SqlUtil.SqliteColumnType.INTEGER).c("version", SqlUtil.SqliteColumnType.TEXT).c("narrowPicture", SqlUtil.SqliteColumnType.TEXT).c("narrowDesc", SqlUtil.SqliteColumnType.TEXT).c("workoutActions", SqlUtil.SqliteColumnType.TEXT).c("publishDate", SqlUtil.SqliteColumnType.INTEGER).c("modified", SqlUtil.SqliteColumnType.INTEGER).c("type", SqlUtil.SqliteColumnType.INTEGER).c("measurementType", SqlUtil.SqliteColumnType.INTEGER).c("runActionNum", SqlUtil.SqliteColumnType.INTEGER).c("warmUpRunAction", SqlUtil.SqliteColumnType.TEXT).c("coolDownRunAction", SqlUtil.SqliteColumnType.TEXT).c("sequenceName", SqlUtil.SqliteColumnType.TEXT).c("sequenceStage", SqlUtil.SqliteColumnType.TEXT).c("repeatTimes", SqlUtil.SqliteColumnType.INTEGER).c("relativeCourses", SqlUtil.SqliteColumnType.TEXT).c("extendSeaMap", SqlUtil.SqliteColumnType.TEXT).c("secondClassify", SqlUtil.SqliteColumnType.TEXT).c("primaryClassify", SqlUtil.SqliteColumnType.TEXT).c("topicPreviewPicUrl", SqlUtil.SqliteColumnType.TEXT).c("supplierLogoUrl", SqlUtil.SqliteColumnType.TEXT).c(HwExerciseConstants.METHOD_PARAM_WORKOUT_TYPE, SqlUtil.SqliteColumnType.INTEGER).c("musicRunFlag", SqlUtil.SqliteColumnType.INTEGER).c("courseAttr", SqlUtil.SqliteColumnType.INTEGER).c("category", SqlUtil.SqliteColumnType.INTEGER).c("courseLibraryFlag", SqlUtil.SqliteColumnType.INTEGER).c(WorkoutRecord.Extend.COURSE_DEFINE_TYPE, SqlUtil.SqliteColumnType.INTEGER).c("lan", SqlUtil.SqliteColumnType.TEXT).c("extendProperty", SqlUtil.SqliteColumnType.TEXT).c("commodityFlag", SqlUtil.SqliteColumnType.INTEGER).c("iconDisplay", SqlUtil.SqliteColumnType.INTEGER).c("iconMessages", SqlUtil.SqliteColumnType.TEXT).c("isAi", SqlUtil.SqliteColumnType.INTEGER).a();

    public gmh() {
        b();
    }

    private void b() {
        int iF = f();
        int length = d.split(",").length;
        ReleaseLogUtil.d("Suggestion_FitWorkoutInfoDao", "table column num: ", Integer.valueOf(iF), " create column num:", Integer.valueOf(length));
        if (iF < length) {
            boolean zA = a();
            ReleaseLogUtil.d("Suggestion_FitWorkoutInfoDao", "delete table: ", Boolean.valueOf(zA));
            if (zA) {
                e();
            }
        }
    }

    private int f() {
        Cursor cursorRawQueryStorageData = null;
        try {
            cursorRawQueryStorageData = gmc.g().rawQueryStorageData(1, "select * from " + gmc.g().getTableFullName(c()) + " LIMIT 1", new String[0]);
            return cursorRawQueryStorageData != null ? cursorRawQueryStorageData.getColumnCount() : 0;
        } catch (SQLiteException unused) {
            ReleaseLogUtil.a("Suggestion_FitWorkoutInfoDao", "getColumnNum(), SQLiteException");
            return 0;
        } finally {
            if (cursorRawQueryStorageData != null) {
                cursorRawQueryStorageData.close();
            }
        }
    }

    private boolean a() {
        return gmc.g().deleteTable(String.valueOf(gmc.g().getModuleId()), c(), 1);
    }

    private void e() {
        ReleaseLogUtil.d("Suggestion_FitWorkoutInfoDao", "create table: ", Integer.valueOf(gmc.g().createStorageDataTable(c(), 1, d)));
    }

    public void c(String str, FitWorkout fitWorkout) throws Throwable {
        if (fitWorkout == null) {
            ReleaseLogUtil.a("Suggestion_FitWorkoutInfoDao", "fitWorkout is null");
            return;
        }
        ReleaseLogUtil.d("Suggestion_FitWorkoutInfoDao", "enter insertOrUpdateWorkout", fitWorkout.acquireId());
        FitWorkout fitWorkoutE = e(str, fitWorkout);
        if (fitWorkoutE != null) {
            int iAcquireUsers = fitWorkoutE.acquireUsers();
            int iAcquireUsers2 = fitWorkout.acquireUsers();
            if (iAcquireUsers > iAcquireUsers2) {
                fitWorkout.saveUsers(iAcquireUsers);
            }
            LogUtil.a("Suggestion_FitWorkoutInfoDao", "insertFitWorkout oldFitWorkoutUsers = ", Integer.valueOf(iAcquireUsers), " fitWorkoutUsers = ", Integer.valueOf(iAcquireUsers2));
            int iAcquireExerciseTimes = fitWorkoutE.acquireExerciseTimes();
            int iAcquireExerciseTimes2 = fitWorkout.acquireExerciseTimes();
            if (iAcquireExerciseTimes > iAcquireExerciseTimes2) {
                fitWorkout.saveExerciseTimes(iAcquireExerciseTimes);
            }
            LogUtil.a("Suggestion_FitWorkoutInfoDao", "insertFitWorkout oldAcquireExerciseTimes = ", Integer.valueOf(iAcquireExerciseTimes), " acquireExerciseTimes = ", Integer.valueOf(iAcquireExerciseTimes2));
            if (fitWorkout.acquireWorkoutActions() == null) {
                fitWorkout.saveWorkoutActions(fitWorkoutE.acquireWorkoutActions());
                LogUtil.a("Suggestion_FitWorkoutInfoDao", "insertFitWorkout fitWorkout.acquireWorkoutActions() == null");
            }
            b(fitWorkout, fitWorkoutE);
            b(str, fitWorkout);
            return;
        }
        d(str, fitWorkout);
    }

    private void b(FitWorkout fitWorkout, FitWorkout fitWorkout2) {
        if (fitWorkout == null || fitWorkout2 == null) {
            ReleaseLogUtil.e("Suggestion_FitWorkoutInfoDao", "updateOldFitWorkout ", Boolean.valueOf(fitWorkout == null));
            return;
        }
        ReleaseLogUtil.d("Suggestion_FitWorkoutInfoDao", "enter updateOldFitWorkout ");
        if (fitWorkout.acquireRunActionNum() == 0) {
            fitWorkout.saveRunActionNum(fitWorkout2.acquireRunActionNum());
        }
        if (fitWorkout.acquireSequenceStage() == null) {
            fitWorkout.saveSequenceStage(fitWorkout2.acquireSequenceStage());
        }
        if (fitWorkout.acquireRepeatTimes() == 0) {
            fitWorkout.saveRepeatTimes(fitWorkout2.acquireRepeatTimes());
        }
        if (fitWorkout.acquireSequenceName() == null) {
            fitWorkout.saveSequenceName(fitWorkout2.acquireSequenceName());
        }
        if (fitWorkout.acquireWarmUpRunAction() == null) {
            fitWorkout.saveWarmUpRunAction(fitWorkout2.acquireWarmUpRunAction());
        }
        if (fitWorkout.acquireCoolDownRunAction() == null) {
            fitWorkout.saveCoolDownRunAction(fitWorkout2.acquireCoolDownRunAction());
        }
        if (fitWorkout.getMusicRunFlag() == -1) {
            fitWorkout.setMusicRunFlag(fitWorkout2.getMusicRunFlag());
        }
    }

    private void d(String str, FitWorkout fitWorkout) {
        ContentValues contentValuesA = a(str, fitWorkout);
        long jInsertStorageData = gmc.g().insertStorageData(c(), 1, contentValuesA);
        if (jInsertStorageData < 0) {
            OpAnalyticsUtil.getInstance().setEventOneErrorCode(OperationKey.HEALTH_APP_GET_FITNESS_DATA_85070018.value(), (int) jInsertStorageData);
        } else {
            OpAnalyticsUtil.getInstance().setEventOneErrorCode(OperationKey.HEALTH_APP_GET_FITNESS_DATA_85070018.value(), 0);
        }
        ReleaseLogUtil.d("Suggestion_FitWorkoutInfoDao", "insertWorkout：", Long.valueOf(jInsertStorageData));
        LogUtil.d("Suggestion_FitWorkoutInfoDao", "insertWorkout：", contentValuesA);
    }

    public void d(String str, String str2) {
        LogUtil.a("Suggestion_FitWorkoutInfoDao", "delWorkout workoutId= ", str2);
        gmc.g().deleteStorageData(c(), 1, "userId=? AND workoutId=?", new String[]{StringUtils.c((Object) str), StringUtils.c((Object) str2)});
    }

    private ContentValues a(String str, FitWorkout fitWorkout) {
        ContentValues contentValues = new ContentValues();
        if (fitWorkout == null) {
            LogUtil.j("Suggestion_FitWorkoutInfoDao", "getContentValues, workout == null");
            return contentValues;
        }
        c(str, fitWorkout, contentValues);
        if (fitWorkout.isNewRunCourse() && njy.b(fitWorkout.getCourseActions())) {
            contentValues.put("workoutActions", new Gson().toJson(fitWorkout.getCourseActions()));
            LogUtil.a("Suggestion_FitWorkoutInfoDao", "TYPE_RUN_NEW value: ", new Gson().toJson(fitWorkout.getCourseActions()));
        } else if (fitWorkout.isEquipmentCourse() && fitWorkout.getEquipmentWorkoutAction() != null) {
            contentValues.put("workoutActions", new Gson().toJson(fitWorkout.getEquipmentWorkoutAction()));
            LogUtil.a("Suggestion_FitWorkoutInfoDao", "TYPE_EQUIPMENT value:", new Gson().toJson(fitWorkout.getEquipmentWorkoutAction()));
        } else if (fitWorkout.acquireWorkoutActions() != null) {
            contentValues.put("workoutActions", new Gson().toJson(fitWorkout.acquireWorkoutActions()));
            int type = fitWorkout.getType();
            LogUtil.d("Suggestion_FitWorkoutInfoDao", "workout Type: ", Integer.valueOf(type), " value: ", new Gson().toJson(fitWorkout.acquireWorkoutActions()));
        }
        if (fitWorkout.acquireListRelativeWorkouts() != null) {
            contentValues.put("relativeCourses", new Gson().toJson(fitWorkout.acquireListRelativeWorkouts()));
        }
        if (fitWorkout.acquireExtendSeaMap() != null && !fitWorkout.acquireExtendSeaMap().isEmpty()) {
            contentValues.put("extendSeaMap", fitWorkout.acquireExtendSeaMap());
        }
        contentValues.put("secondClassify", String.valueOf(fitWorkout.acquireClassifyInfo()));
        contentValues.put(HwExerciseConstants.METHOD_PARAM_WORKOUT_TYPE, Integer.valueOf(fitWorkout.getWorkoutType()));
        contentValues.put("primaryClassify", String.valueOf(fitWorkout.getPrimaryClassify()));
        contentValues.put("topicPreviewPicUrl", fitWorkout.getTopicPreviewPicUrl());
        contentValues.put("supplierLogoUrl", fitWorkout.getSupplierLogoUrl());
        contentValues.put("musicRunFlag", Integer.valueOf(fitWorkout.getMusicRunFlag()));
        contentValues.put("courseAttr", Integer.valueOf(fitWorkout.getCourseAttr()));
        contentValues.put("category", Integer.valueOf(fitWorkout.getCategory()));
        contentValues.put("courseLibraryFlag", Integer.valueOf(fitWorkout.getCourseLibraryFlag()));
        contentValues.put(WorkoutRecord.Extend.COURSE_DEFINE_TYPE, Integer.valueOf(fitWorkout.getCourseDefineType()));
        contentValues.put("lan", fitWorkout.getLan());
        contentValues.put("extendProperty", peh.c(fitWorkout.getExtendProperty()));
        contentValues.put("commodityFlag", Integer.valueOf(fitWorkout.acquireCommodityFlag()));
        contentValues.put("iconDisplay", Integer.valueOf(fitWorkout.getCornerImgDisplay()));
        List<PriceTagBean> listAcquirePriceTagBeanList = fitWorkout.acquirePriceTagBeanList();
        if (listAcquirePriceTagBeanList != null && !listAcquirePriceTagBeanList.isEmpty()) {
            contentValues.put("iconMessages", new Gson().toJson(listAcquirePriceTagBeanList));
        }
        contentValues.put("isAi", Integer.valueOf(fitWorkout.getIsAi()));
        LogUtil.d("Suggestion_FitWorkoutInfoDao", "getContentValues() workout=", fitWorkout.acquireId(), ", musicFlag=", Integer.valueOf(fitWorkout.getMusicRunFlag()), ", workoutGender=", Integer.valueOf(fitWorkout.getCourseAttr()));
        return contentValues;
    }

    private void c(String str, FitWorkout fitWorkout, ContentValues contentValues) {
        contentValues.put(HwExerciseConstants.METHOD_PARAM_WORKOUT_ID, fitWorkout.acquireId());
        contentValues.put("name", fitWorkout.acquireName());
        contentValues.put("isSupportDevice", Integer.valueOf(fitWorkout.acquireIsSupportDevice()));
        contentValues.put("trainingPoints", String.valueOf(fitWorkout.acquireTrainingpoints()));
        contentValues.put("difficulty", Integer.valueOf(fitWorkout.acquireDifficulty()));
        contentValues.put("equipments", String.valueOf(fitWorkout.acquireEquipments()));
        contentValues.put("classes", String.valueOf(fitWorkout.acquireClasses()));
        contentValues.put("duration", Integer.valueOf(fitWorkout.acquireDuration()));
        contentValues.put("calorie", Float.valueOf(fitWorkout.acquireCalorie()));
        contentValues.put("picture", fitWorkout.acquirePicture());
        contentValues.put("description", fitWorkout.acquireDescription());
        contentValues.put("users", Integer.valueOf(fitWorkout.acquireUsers()));
        contentValues.put("stage", Integer.valueOf(fitWorkout.acquireStage()));
        contentValues.put("version", fitWorkout.accquireVersion());
        contentValues.put("publishDate", Long.valueOf(fitWorkout.getPublishDate()));
        contentValues.put("modified", Long.valueOf(fitWorkout.getModified()));
        contentValues.put(JsbMapKeyNames.H5_USER_ID, StringUtils.c((Object) str));
        contentValues.put("exerciseTimes", Integer.valueOf(fitWorkout.acquireExerciseTimes()));
        contentValues.put("narrowPicture", fitWorkout.getNarrowPicture());
        contentValues.put("narrowDesc", fitWorkout.acquireNarrowDesc());
        contentValues.put("midPicture", fitWorkout.acquireMidPicture());
        contentValues.put("distance", Double.valueOf(fitWorkout.acquireDistance()));
        contentValues.put("type", Integer.valueOf(fitWorkout.getType()));
        contentValues.put("measurementType", Integer.valueOf(fitWorkout.acquireMeasurementType()));
        contentValues.put("warmUpRunAction", new Gson().toJson(fitWorkout.acquireWarmUpRunAction()));
        contentValues.put("coolDownRunAction", new Gson().toJson(fitWorkout.acquireCoolDownRunAction()));
        contentValues.put("sequenceName", fitWorkout.acquireSequenceName());
        contentValues.put("sequenceStage", fitWorkout.acquireSequenceStage());
        contentValues.put("repeatTimes", Integer.valueOf(fitWorkout.acquireRepeatTimes()));
        contentValues.put("runActionNum", Integer.valueOf(fitWorkout.acquireRunActionNum()));
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0045  */
    /* JADX WARN: Code duplicated, block: B:25:0x0073  */
    /* JADX WARN: Code duplicated, block: B:8:0x0041 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:9:0x0043  */
    private FitWorkout e(String str, FitWorkout fitWorkout) throws Throwable {
        Cursor cursorRawQueryStorageData;
        boolean z;
        Cursor cursor = null;
        fitWorkoutB = null;
        fitWorkoutB = null;
        FitWorkout fitWorkoutB = null;
        try {
            cursorRawQueryStorageData = gmc.g().rawQueryStorageData(1, "select * from " + gmc.g().getTableFullName(c()) + " where workoutId=? and userId=?", new String[]{fitWorkout.acquireId(), str});
            if (cursorRawQueryStorageData == null) {
                if (cursorRawQueryStorageData == null) {
                    z = true;
                } else {
                    z = false;
                }
                ReleaseLogUtil.a("Suggestion_FitWorkoutInfoDao", "hasExistWorkout(), cursor is null or end ", Boolean.valueOf(z));
            } else {
                try {
                    try {
                        if (!cursorRawQueryStorageData.moveToNext()) {
                            if (cursorRawQueryStorageData == null) {
                                z = true;
                            } else {
                                z = false;
                            }
                            ReleaseLogUtil.a("Suggestion_FitWorkoutInfoDao", "hasExistWorkout(), cursor is null or end ", Boolean.valueOf(z));
                        } else {
                            fitWorkoutB = b(cursorRawQueryStorageData);
                        }
                    } catch (SQLiteException unused) {
                        ReleaseLogUtil.a("Suggestion_FitWorkoutInfoDao", "hasExistWorkout(), SQLiteException");
                        if (cursorRawQueryStorageData != null) {
                            cursorRawQueryStorageData.close();
                        }
                        return fitWorkoutB;
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
            return fitWorkoutB;
        } catch (SQLiteException unused2) {
            cursorRawQueryStorageData = null;
        } catch (Throwable th2) {
            th = th2;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    protected FitWorkout b(Cursor cursor) {
        FitWorkout fitWorkout = new FitWorkout();
        if (cursor == null) {
            return fitWorkout;
        }
        b(cursor, fitWorkout);
        String string = cursor.getString(cursor.getColumnIndex("workoutActions"));
        if (!TextUtils.isEmpty(string)) {
            if (fitWorkout.isNewRunCourse()) {
                try {
                    fitWorkout.setCourseActions(peh.c(string, ChoreographedMultiActions[].class));
                } catch (JsonSyntaxException e) {
                    LogUtil.e("Suggestion_FitWorkoutInfoDao", "exception message = ", LogAnonymous.b(e));
                    LogUtil.e("Suggestion_FitWorkoutInfoDao", "workoutActionsJson = ", string);
                }
            } else if (fitWorkout.isEquipmentCourse()) {
                try {
                    fitWorkout.setEquipmentWorkoutAction((EquipmentWorkoutAction) peh.b(string, EquipmentWorkoutAction.class));
                } catch (JsonSyntaxException e2) {
                    LogUtil.e("Suggestion_FitWorkoutInfoDao", "exception message = ", LogAnonymous.b(e2));
                    LogUtil.e("Suggestion_FitWorkoutInfoDao", "workoutActionsJson = ", string);
                }
            } else {
                try {
                    fitWorkout.saveWorkoutActions(peh.c(string, WorkoutAction[].class));
                } catch (JsonSyntaxException e3) {
                    LogUtil.e("Suggestion_FitWorkoutInfoDao", "exception message = ", LogAnonymous.b(e3));
                    LogUtil.e("Suggestion_FitWorkoutInfoDao", "workoutActionsJson = ", string);
                }
            }
        }
        a(cursor, fitWorkout);
        fitWorkout.setCourseLibraryFlag(cursor.getInt(cursor.getColumnIndex("courseLibraryFlag")));
        fitWorkout.setCourseDefineType(cursor.getInt(cursor.getColumnIndex(WorkoutRecord.Extend.COURSE_DEFINE_TYPE)));
        fitWorkout.setLan(cursor.getString(cursor.getColumnIndex("lan")));
        fitWorkout.setExtendProperty(peh.b(cursor.getString(cursor.getColumnIndex("extendProperty"))));
        fitWorkout.setCommodityFlag(cursor.getInt(cursor.getColumnIndex("commodityFlag")));
        fitWorkout.setCornerImgDisplay(cursor.getInt(cursor.getColumnIndex("iconDisplay")));
        String string2 = cursor.getString(cursor.getColumnIndex("iconMessages"));
        if (!TextUtils.isEmpty(string2)) {
            try {
                fitWorkout.setPriceTagBeanList(peh.c(string2, PriceTagBean[].class));
            } catch (JsonSyntaxException e4) {
                LogUtil.e("Suggestion_FitWorkoutInfoDao", "exception message = ", LogAnonymous.b(e4));
                LogUtil.e("Suggestion_FitWorkoutInfoDao", "workoutActionsJson = ", string2);
            }
        }
        fitWorkout.setIsAi(gmw.e(cursor, "isAi"));
        a(fitWorkout, cursor);
        return fitWorkout;
    }

    private void a(Cursor cursor, FitWorkout fitWorkout) {
        fitWorkout.savePublishDate(cursor.getLong(cursor.getColumnIndex("publishDate")));
        fitWorkout.saveModified(cursor.getLong(cursor.getColumnIndex("modified")));
        fitWorkout.saveMidPicture(cursor.getString(cursor.getColumnIndex("midPicture")));
        String string = cursor.getString(cursor.getColumnIndex("warmUpRunAction"));
        if (!TextUtils.isEmpty(string)) {
            fitWorkout.saveWarmUpRunAction((WorkoutAction) peh.b(string, WorkoutAction.class));
        }
        String string2 = cursor.getString(cursor.getColumnIndex("coolDownRunAction"));
        if (!TextUtils.isEmpty(string2)) {
            fitWorkout.saveCoolDownRunAction((WorkoutAction) peh.b(string2, WorkoutAction.class));
        }
        fitWorkout.saveSequenceName(cursor.getString(cursor.getColumnIndex("sequenceName")));
        fitWorkout.saveSequenceStage(cursor.getString(cursor.getColumnIndex("sequenceStage")));
        fitWorkout.saveRepeatTimes(cursor.getInt(cursor.getColumnIndex("repeatTimes")));
        fitWorkout.saveRunActionNum(cursor.getInt(cursor.getColumnIndex("runActionNum")));
        fitWorkout.saveListRelativeWorkouts(peh.c(cursor.getString(cursor.getColumnIndex("relativeCourses")), String[].class));
        fitWorkout.saveExtendSeaMap(cursor.getString(cursor.getColumnIndex("extendSeaMap")));
    }

    private void b(Cursor cursor, FitWorkout fitWorkout) {
        fitWorkout.saveId(cursor.getString(cursor.getColumnIndex(HwExerciseConstants.METHOD_PARAM_WORKOUT_ID)));
        fitWorkout.saveName(cursor.getString(cursor.getColumnIndex("name")));
        fitWorkout.saveIsSupportDevice(cursor.getInt(cursor.getColumnIndex("isSupportDevice")));
        fitWorkout.saveTrainingpoints(peh.c(cursor.getString(cursor.getColumnIndex("trainingPoints")), Attribute[].class));
        fitWorkout.saveDifficulty(cursor.getInt(cursor.getColumnIndex("difficulty")));
        fitWorkout.saveEquipments(peh.c(cursor.getString(cursor.getColumnIndex("equipments")), Attribute[].class));
        fitWorkout.saveClasses(peh.c(cursor.getString(cursor.getColumnIndex("classes")), Attribute[].class));
        fitWorkout.saveDuration(cursor.getInt(cursor.getColumnIndex("duration")));
        fitWorkout.saveCalorie(cursor.getFloat(cursor.getColumnIndex("calorie")));
        fitWorkout.savePicture(cursor.getString(cursor.getColumnIndex("picture")));
        fitWorkout.saveDescription(cursor.getString(cursor.getColumnIndex("description")));
        fitWorkout.saveUsers(cursor.getInt(cursor.getColumnIndex("users")));
        fitWorkout.saveStage(cursor.getInt(cursor.getColumnIndex("stage")));
        fitWorkout.saveExerciseTimes(cursor.getInt(cursor.getColumnIndex("exerciseTimes")));
        fitWorkout.saveVersion(cursor.getString(cursor.getColumnIndex("version")));
        fitWorkout.saveNarrowPicture(cursor.getString(cursor.getColumnIndex("narrowPicture")));
        fitWorkout.saveNarrowDesc(cursor.getString(cursor.getColumnIndex("narrowDesc")));
        fitWorkout.saveDistance(cursor.getFloat(cursor.getColumnIndex("distance")));
        fitWorkout.setType(cursor.getInt(cursor.getColumnIndex("type")));
        fitWorkout.saveMeasurementType(cursor.getInt(cursor.getColumnIndex("measurementType")));
        fitWorkout.setWorkoutType(cursor.getInt(cursor.getColumnIndex(HwExerciseConstants.METHOD_PARAM_WORKOUT_TYPE)));
        fitWorkout.setTopicPreviewPicUrl(cursor.getString(cursor.getColumnIndex("topicPreviewPicUrl")));
        fitWorkout.setSupplierLogoUrl(cursor.getString(cursor.getColumnIndex("supplierLogoUrl")));
        fitWorkout.setMusicRunFlag(cursor.getInt(cursor.getColumnIndex("musicRunFlag")));
        fitWorkout.setCourseAttr(cursor.getInt(cursor.getColumnIndex("courseAttr")));
        fitWorkout.setCategory(cursor.getInt(cursor.getColumnIndex("category")));
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0079 A[Catch: all -> 0x0088, SQLiteException -> 0x008a, TRY_ENTER, TRY_LEAVE, TryCatch #1 {SQLiteException -> 0x008a, blocks: (B:8:0x0064, B:10:0x006a, B:16:0x0079), top: B:38:0x0064 }] */
    /* JADX WARN: Code duplicated, block: B:18:0x0084  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v4 */
    public FitWorkout b(String str, String str2, String str3) throws Throwable {
        Cursor cursorRawQueryStorageData;
        FitWorkout fitWorkout;
        boolean zE;
        LogUtil.a("Suggestion_FitWorkoutInfoDao", "getWorkout(String userId,String workoutId, String version) workoutId = ", str2, ",version=", str3);
        String str4 = "select * from " + gmc.g().getTableFullName(c()) + " where workoutId=? and userId=? and version=?";
        String[] strArr = {str2, str, str3};
        if (TextUtils.isEmpty(str3)) {
            str4 = "select * from " + gmc.g().getTableFullName(c()) + " where workoutId=? and userId=? ORDER BY version+0 DESC limit 0,1";
            strArr = new String[]{str2, str};
        }
        ?? r7 = 0;
        z = false;
        z = false;
        boolean z = false;
        Cursor cursor = null;
        fitWorkout = null;
        fitWorkout = null;
        FitWorkout fitWorkout2 = null;
        cursor = null;
        try {
            try {
                cursorRawQueryStorageData = gmc.g().rawQueryStorageData(1, str4, strArr);
                if (cursorRawQueryStorageData != null) {
                    try {
                        try {
                            if (cursorRawQueryStorageData.moveToNext()) {
                                FitWorkout fitWorkoutB = b(cursorRawQueryStorageData);
                                try {
                                    zE = e(fitWorkoutB);
                                    z = zE;
                                    if (!zE) {
                                        fitWorkout2 = fitWorkoutB;
                                    }
                                } catch (SQLiteException unused) {
                                    fitWorkout2 = fitWorkoutB;
                                    fitWorkout = fitWorkout2;
                                    cursor = cursorRawQueryStorageData;
                                    r7 = z;
                                    Object[] objArr = new Object[1];
                                    objArr[r7] = "getWorkout(), SQLiteException";
                                    ReleaseLogUtil.a("Suggestion_FitWorkoutInfoDao", objArr);
                                    if (cursor != null) {
                                        cursor.close();
                                    }
                                    fitWorkout2 = fitWorkout;
                                }
                            } else {
                                ReleaseLogUtil.e("Suggestion_FitWorkoutInfoDao", "getWorkout cursor == null");
                            }
                            if (cursorRawQueryStorageData != null) {
                                z = zE;
                                cursorRawQueryStorageData.close();
                            }
                        } catch (SQLiteException unused2) {
                        }
                    } catch (Throwable th) {
                        th = th;
                        if (cursorRawQueryStorageData != null) {
                            cursorRawQueryStorageData.close();
                        }
                        throw th;
                    }
                } else {
                    ReleaseLogUtil.e("Suggestion_FitWorkoutInfoDao", "getWorkout cursor == null");
                    if (cursorRawQueryStorageData != null) {
                        z = zE;
                        cursorRawQueryStorageData.close();
                    }
                }
            } catch (SQLiteException unused3) {
                fitWorkout = null;
            }
            z = zE;
            LogUtil.d("Suggestion_FitWorkoutInfoDao", "getWorkout(String userId,String workoutId, String version) = ", fitWorkout2);
            return fitWorkout2;
        } catch (Throwable th2) {
            th = th2;
            cursorRawQueryStorageData = cursor;
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x007d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:16:0x007f  */
    /* JADX WARN: Code duplicated, block: B:17:0x0081  */
    /* JADX WARN: Code duplicated, block: B:35:0x00c1  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r8v3 */
    public FitWorkout a(String str, String str2, String str3, String str4) throws Throwable {
        SQLiteException e;
        Cursor cursorRawQueryStorageData;
        FitWorkout fitWorkoutB;
        boolean z;
        LogUtil.a("Suggestion_FitWorkoutInfoDao", "getWorkout(String userId,String workoutId, String version) workoutId = ", str2, ",version=", str3, Constants.LANGUAGE_ASSIGN_STR, str4);
        String str5 = "select * from " + gmc.g().getTableFullName(d(str4)) + " where workoutId=? and userId=? and version=?";
        String[] strArr = {str2, str, str3};
        if (TextUtils.isEmpty(str3)) {
            str5 = "select * from " + gmc.g().getTableFullName(d(str4)) + " where workoutId=? and userId=? ORDER BY version+0 DESC limit 0,1";
            strArr = new String[]{str2, str};
        }
        ?? r8 = 0;
        try {
            try {
                cursorRawQueryStorageData = gmc.g().rawQueryStorageData(1, str5, strArr);
                if (cursorRawQueryStorageData != null) {
                    try {
                        if (cursorRawQueryStorageData.moveToNext()) {
                            fitWorkoutB = b(cursorRawQueryStorageData);
                            if (e(fitWorkoutB)) {
                            }
                        } else {
                            if (cursorRawQueryStorageData == null) {
                                z = true;
                            } else {
                                z = false;
                            }
                            ReleaseLogUtil.e("Suggestion_FitWorkoutInfoDao", "getWorkout cursor is null ", Boolean.valueOf(z));
                        }
                        fitWorkoutB = null;
                    } catch (SQLiteException e2) {
                        e = e2;
                        LogUtil.e("Suggestion_FitWorkoutInfoDao", " getWorkout ", LogAnonymous.b(e));
                        if (cursorRawQueryStorageData != null) {
                            cursorRawQueryStorageData.close();
                        }
                        return null;
                    }
                } else {
                    if (cursorRawQueryStorageData == null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    ReleaseLogUtil.e("Suggestion_FitWorkoutInfoDao", "getWorkout cursor is null ", Boolean.valueOf(z));
                    fitWorkoutB = null;
                }
                LogUtil.d("Suggestion_FitWorkoutInfoDao", "getWorkout(String userId,String workoutId, String version) = ", fitWorkoutB);
                if (cursorRawQueryStorageData != null) {
                    cursorRawQueryStorageData.close();
                }
                return fitWorkoutB;
            } catch (Throwable th) {
                th = th;
                r8 = str5;
                if (r8 != 0) {
                    r8.close();
                }
                throw th;
            }
        } catch (SQLiteException e3) {
            e = e3;
            cursorRawQueryStorageData = null;
        } catch (Throwable th2) {
            th = th2;
            if (r8 != 0) {
                r8.close();
            }
            throw th;
        }
    }

    private boolean e(FitWorkout fitWorkout) {
        if (fitWorkout.isNewRunCourse()) {
            return njy.e(fitWorkout.getCourseActions());
        }
        if (fitWorkout.isEquipmentCourse()) {
            return fitWorkout.getEquipmentWorkoutAction() == null;
        }
        return njy.e(fitWorkout.acquireWorkoutActions());
    }

    /* JADX WARN: Code duplicated, block: B:12:0x00bc  */
    public FitWorkout a(String str) throws Throwable {
        SQLiteException e;
        FitWorkout fitWorkout;
        Cursor cursorRawQueryStorageData;
        Cursor cursor = null;
        fitWorkout = null;
        FitWorkout fitWorkout2 = null;
        cursor = null;
        try {
            try {
                cursorRawQueryStorageData = gmc.g().rawQueryStorageData(1, "select * from " + gmc.g().getTableFullName(c()) + " where workoutId=?", new String[]{StringUtils.c((Object) str)});
                if (cursorRawQueryStorageData == null) {
                    ReleaseLogUtil.e("Suggestion_FitWorkoutInfoDao", "getWorkout(String workoutId) ", str, " cursor is null");
                } else {
                    try {
                        try {
                            if (!cursorRawQueryStorageData.moveToNext()) {
                                ReleaseLogUtil.e("Suggestion_FitWorkoutInfoDao", "getWorkout(String workoutId) ", str, " cursor is null");
                            } else {
                                FitWorkout fitWorkout3 = new FitWorkout();
                                try {
                                    fitWorkout3.saveId(cursorRawQueryStorageData.getString(cursorRawQueryStorageData.getColumnIndex(HwExerciseConstants.METHOD_PARAM_WORKOUT_ID)));
                                    fitWorkout3.saveName(cursorRawQueryStorageData.getString(cursorRawQueryStorageData.getColumnIndex("name")));
                                    fitWorkout3.saveTrainingpoints(peh.c(cursorRawQueryStorageData.getString(cursorRawQueryStorageData.getColumnIndex("trainingPoints")), Attribute[].class));
                                    fitWorkout3.saveDifficulty(cursorRawQueryStorageData.getInt(cursorRawQueryStorageData.getColumnIndex("difficulty")));
                                    fitWorkout3.saveClasses(peh.c(cursorRawQueryStorageData.getString(cursorRawQueryStorageData.getColumnIndex("classes")), Attribute[].class));
                                    a(fitWorkout3, cursorRawQueryStorageData);
                                    fitWorkout3.saveDuration(cursorRawQueryStorageData.getInt(cursorRawQueryStorageData.getColumnIndex("duration")));
                                    fitWorkout3.saveCalorie(cursorRawQueryStorageData.getFloat(cursorRawQueryStorageData.getColumnIndex("calorie")));
                                    fitWorkout3.saveVersion(cursorRawQueryStorageData.getString(cursorRawQueryStorageData.getColumnIndex("version")));
                                    fitWorkout2 = fitWorkout3;
                                } catch (SQLiteException e2) {
                                    e = e2;
                                    fitWorkout2 = fitWorkout3;
                                    fitWorkout = fitWorkout2;
                                    cursor = cursorRawQueryStorageData;
                                    LogUtil.e("Suggestion_FitWorkoutInfoDao", LogAnonymous.b(e));
                                    if (cursor != null) {
                                        cursor.close();
                                    }
                                    return fitWorkout;
                                }
                            }
                        } catch (Throwable th) {
                            th = th;
                            if (cursorRawQueryStorageData != null) {
                                cursorRawQueryStorageData.close();
                            }
                            throw th;
                        }
                    } catch (SQLiteException e3) {
                        e = e3;
                    }
                }
                if (cursorRawQueryStorageData != null) {
                    cursorRawQueryStorageData.close();
                }
                return fitWorkout2;
            } catch (Throwable th2) {
                th = th2;
                cursorRawQueryStorageData = cursor;
            }
        } catch (SQLiteException e4) {
            e = e4;
            fitWorkout = null;
        }
    }

    private void a(FitWorkout fitWorkout, Cursor cursor) {
        String strC = c(cursor, "secondClassify");
        String strC2 = c(cursor, "primaryClassify");
        if (!TextUtils.isEmpty(strC) && !com.huawei.operation.utils.Constants.NULL.equals(strC)) {
            fitWorkout.saveClassifyInfo(peh.c(strC, Classify[].class));
        }
        if (TextUtils.isEmpty(strC2) || com.huawei.operation.utils.Constants.NULL.equals(strC2)) {
            return;
        }
        fitWorkout.setPrimaryClassify(peh.c(strC2, Classify[].class));
    }

    private String c(Cursor cursor, String str) {
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex != -1) {
            return cursor.getString(columnIndex);
        }
        return "";
    }

    public void e(String str, String str2, String str3) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("exerciseTimes", Integer.valueOf(d(str, str2, str3) + 1));
        ReleaseLogUtil.d("Suggestion_FitWorkoutInfoDao", "updateWorkoutCompleteTimes result ", Long.valueOf(gmc.g().updateStorageData(c(), 1, contentValues, "workoutId=? and version=? and userId=?", new String[]{StringUtils.c((Object) str2), StringUtils.c((Object) str3), str})));
        LogUtil.d("Suggestion_FitWorkoutInfoDao", "updateWorkoutCompleteTimes：", contentValues.toString());
    }

    public void b(String str, FitWorkout fitWorkout) {
        ContentValues contentValuesA = a(str, fitWorkout);
        ReleaseLogUtil.d("Suggestion_FitWorkoutInfoDao", "updateWorkout ", Long.valueOf(gmc.g().updateStorageData(c(), 1, contentValuesA, "workoutId=? and version=? and userId=?", new String[]{StringUtils.c((Object) fitWorkout.acquireId()), StringUtils.c((Object) fitWorkout.accquireVersion()), str})));
        LogUtil.d("Suggestion_FitWorkoutInfoDao", "updateWorkout: ", contentValuesA);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0088 A[PHI: r6 r7
      0x0088: PHI (r6v4 android.database.Cursor) = (r6v3 android.database.Cursor), (r6v7 android.database.Cursor) binds: [B:17:0x0086, B:11:0x0075] A[DONT_GENERATE, DONT_INLINE]
      0x0088: PHI (r7v4 int) = (r7v1 int), (r7v6 int) binds: [B:17:0x0086, B:11:0x0075] A[DONT_GENERATE, DONT_INLINE]] */
    public int d(String str, String str2, String str3) {
        String str4 = "select * from " + gmc.g().getTableFullName(c()) + " where workoutId=? and version=? and userId=?";
        String[] strArr = {StringUtils.c((Object) str2), StringUtils.c((Object) str3), str};
        if (TextUtils.isEmpty(str3)) {
            str4 = "select * from " + gmc.g().getTableFullName(c()) + " where workoutId=? and userId=? ORDER BY version+0 DESC limit 0,1";
            strArr = new String[]{StringUtils.c((Object) str2), str};
        }
        Cursor cursorRawQueryStorageData = null;
        int i = 0;
        try {
            try {
                cursorRawQueryStorageData = gmc.g().rawQueryStorageData(1, str4, strArr);
                if (cursorRawQueryStorageData != null && cursorRawQueryStorageData.moveToNext()) {
                    i = cursorRawQueryStorageData.getInt(cursorRawQueryStorageData.getColumnIndex("exerciseTimes"));
                }
                if (cursorRawQueryStorageData != null) {
                    cursorRawQueryStorageData.close();
                }
            } catch (SQLiteException e) {
                LogUtil.e("Suggestion_FitWorkoutInfoDao", LogAnonymous.b(e));
                if (cursorRawQueryStorageData != null) {
                    cursorRawQueryStorageData.close();
                }
            }
            LogUtil.a("Suggestion_FitWorkoutInfoDao", "completeTimes = ", Integer.valueOf(i));
            return i;
        } catch (Throwable th) {
            if (cursorRawQueryStorageData != null) {
                cursorRawQueryStorageData.close();
            }
            throw th;
        }
    }

    public static String c() {
        return "fit_workouts_info" + gld.b();
    }

    public static String d(String str) {
        return "fit_workouts_info" + gld.d(str);
    }

    public static String d() {
        return "fit_workouts_info";
    }
}
