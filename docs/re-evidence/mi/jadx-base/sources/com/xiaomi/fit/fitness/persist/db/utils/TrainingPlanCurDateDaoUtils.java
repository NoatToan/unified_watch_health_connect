package com.xiaomi.fit.fitness.persist.db.utils;

import android.text.TextUtils;
import com.google.gson.Gson;
import com.xiaomi.fit.data.common.data.sport.SportBasicReport;
import com.xiaomi.fit.fitness.persist.db.FitnessDatabase;
import com.xiaomi.fit.fitness.persist.db.internal.SportReportEntity;
import com.xiaomi.fit.fitness.persist.db.internal.TrainingPlanCurDateDao;
import com.xiaomi.fit.fitness.persist.db.internal.TrainingPlanCurDateEntity;
import com.xiaomi.fit.fitness.persist.db.utils.TrainingPlanCurDateDaoUtils;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.training_plan_export.model.AbilityDayPlan;
import com.xiaomi.fitness.training_plan_export.model.AbilityDayPlanCourse;
import com.xiaomi.fitness.training_plan_export.model.AbilityPlanEntranceInfo;
import com.xiaomi.fitness.training_plan_export.model.HabitDayPlan;
import com.xiaomi.fitness.training_plan_export.model.HabitPlanEntranceInfo;
import com.xiaomi.fitness.training_plan_export.model.PlanModelsKt;
import com.xiaomi.fitness.training_plan_export.model.SportKey;
import com.xiaomi.fitness.training_plan_export.utils.DateUtils;
import com.xiaomi.fitness.watch.face.edit.entity.DialWidgetType;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014J\u0014\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0016J(\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0005J \u0010\u001e\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002J\u000e\u0010\u001f\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\u001bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u000e\u0010\u000f¨\u0006!"}, d2 = {"Lcom/xiaomi/fit/fitness/persist/db/utils/TrainingPlanCurDateDaoUtils;", "", "<init>", "()V", "TAG", "", "trainingPlanCurDateDao", "Lcom/xiaomi/fit/fitness/persist/db/internal/TrainingPlanCurDateDao;", "getTrainingPlanCurDateDao", "()Lcom/xiaomi/fit/fitness/persist/db/internal/TrainingPlanCurDateDao;", "trainingPlanCurDateDao$delegate", "Lkotlin/Lazy;", "gson", "Lcom/google/gson/Gson;", "getGson", "()Lcom/google/gson/Gson;", "gson$delegate", "notifyInsertSportReport", "", "entity", "Lcom/xiaomi/fit/fitness/persist/db/internal/SportReportEntity;", "getLocalCurDatePlanInfo", "Lkotlin/Pair;", "", "syncCurDatePlanInfo", "trainingType", "id", "", DialWidgetType.DATE, "planInfo", "getLocalCurDateByInfo", "deleteInfoByPlanId", "planId", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTrainingPlanCurDateDaoUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TrainingPlanCurDateDaoUtils.kt\ncom/xiaomi/fit/fitness/persist/db/utils/TrainingPlanCurDateDaoUtils\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,197:1\n1863#2:198\n1863#2,2:199\n1864#2:201\n1863#2,2:202\n1863#2,2:204\n1863#2,2:206\n*S KotlinDebug\n*F\n+ 1 TrainingPlanCurDateDaoUtils.kt\ncom/xiaomi/fit/fitness/persist/db/utils/TrainingPlanCurDateDaoUtils\n*L\n45#1:198\n79#1:199,2\n45#1:201\n117#1:202,2\n185#1:204,2\n189#1:206,2\n*E\n"})
public final class TrainingPlanCurDateDaoUtils {

    @NotNull
    private static final String TAG = "TrainingPlanCurDateDaoUtils";

    @NotNull
    public static final TrainingPlanCurDateDaoUtils INSTANCE = new TrainingPlanCurDateDaoUtils();

    /* JADX INFO: renamed from: trainingPlanCurDateDao$delegate, reason: from kotlin metadata */
    @NotNull
    private static final Lazy trainingPlanCurDateDao = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: nup
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return TrainingPlanCurDateDaoUtils.trainingPlanCurDateDao_delegate$lambda$0();
        }
    });

    /* JADX INFO: renamed from: gson$delegate, reason: from kotlin metadata */
    @NotNull
    private static final Lazy gson = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: oup
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return TrainingPlanCurDateDaoUtils.gson_delegate$lambda$1();
        }
    });

    private TrainingPlanCurDateDaoUtils() {
    }

    private final Gson getGson() {
        return (Gson) gson.getValue();
    }

    private final String getLocalCurDateByInfo(int trainingType, long id, long date) {
        try {
            List<TrainingPlanCurDateEntity> curDatePlan = getTrainingPlanCurDateDao().getCurDatePlan(trainingType, id, date);
            List<TrainingPlanCurDateEntity> list = curDatePlan;
            if (list != null && !list.isEmpty()) {
                String curDatePlan2 = curDatePlan.get(0).getCurDatePlan();
                return curDatePlan2 == null ? "" : curDatePlan2;
            }
            Logger.i(TAG, trainingType + " - " + id + " - " + date + " has empty local info!!");
            return "";
        } catch (Exception e) {
            Logger.e(TAG, "getLocalCurDatePlanInfo exception " + e.getMessage(), e);
            return "";
        }
    }

    private final TrainingPlanCurDateDao getTrainingPlanCurDateDao() {
        return (TrainingPlanCurDateDao) trainingPlanCurDateDao.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Gson gson_delegate$lambda$1() {
        return new Gson();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TrainingPlanCurDateDao trainingPlanCurDateDao_delegate$lambda$0() {
        return FitnessDatabase.INSTANCE.getInstance().trainingPlanCurDateDao();
    }

    public final void deleteInfoByPlanId(long planId) {
        try {
            if (planId != 0) {
                List<TrainingPlanCurDateEntity> infoByPlanId = getTrainingPlanCurDateDao().getInfoByPlanId(planId);
                if (infoByPlanId != null) {
                    Iterator<T> it = infoByPlanId.iterator();
                    while (it.hasNext()) {
                        INSTANCE.getTrainingPlanCurDateDao().deleteInfoByPlanId((TrainingPlanCurDateEntity) it.next());
                    }
                    return;
                }
                return;
            }
            List<TrainingPlanCurDateEntity> curDatePlan = getTrainingPlanCurDateDao().getCurDatePlan();
            if (curDatePlan != null) {
                Iterator<T> it2 = curDatePlan.iterator();
                while (it2.hasNext()) {
                    INSTANCE.getTrainingPlanCurDateDao().deleteInfoByPlanId((TrainingPlanCurDateEntity) it2.next());
                }
            }
        } catch (Exception e) {
            Logger.e(TAG, "deleteInfoByPlanId exception " + e.getMessage(), e);
        }
    }

    @NotNull
    public final Pair<Integer, String> getLocalCurDatePlanInfo() {
        try {
            List<TrainingPlanCurDateEntity> curDatePlan = getTrainingPlanCurDateDao().getCurDatePlan();
            Date date = new Date();
            List<TrainingPlanCurDateEntity> list = curDatePlan;
            if (list != null && !list.isEmpty()) {
                Pair<Integer, String> pair = new Pair<>(0, "");
                for (TrainingPlanCurDateEntity trainingPlanCurDateEntity : curDatePlan) {
                    if (DateUtils.INSTANCE.isSameDate(date, new Date(trainingPlanCurDateEntity.getDate() * ((long) 1000)))) {
                        Integer numValueOf = Integer.valueOf(trainingPlanCurDateEntity.getType());
                        String curDatePlan2 = trainingPlanCurDateEntity.getCurDatePlan();
                        if (curDatePlan2 == null) {
                            curDatePlan2 = "";
                        }
                        pair = new Pair<>(numValueOf, curDatePlan2);
                    }
                }
                return pair;
            }
            Logger.i(TAG, date + " has empty local info!!");
            return new Pair<>(0, "");
        } catch (Exception e) {
            Logger.e(TAG, "getLocalCurDatePlanInfo exception " + e.getMessage(), e);
            return new Pair<>(0, "");
        }
    }

    public final void notifyInsertSportReport(@NotNull SportReportEntity entity) {
        List<TrainingPlanCurDateEntity> infoByPlanId;
        List<AbilityDayPlanCourse> courseList;
        Intrinsics.checkNotNullParameter(entity, "entity");
        try {
            SportBasicReport sportBasicReport = (SportBasicReport) getGson().fromJson(entity.getValue(), SportBasicReport.class);
            Long trainingPlanId = sportBasicReport.getTrainingPlanId();
            Long cloudCourseId = sportBasicReport.getCloudCourseId();
            long startTime = sportBasicReport.getStartTime();
            if (trainingPlanId == null || (infoByPlanId = getTrainingPlanCurDateDao().getInfoByPlanId(trainingPlanId.longValue())) == null) {
                return;
            }
            for (TrainingPlanCurDateEntity trainingPlanCurDateEntity : infoByPlanId) {
                if (DateUtils.INSTANCE.isSameDate(startTime, trainingPlanCurDateEntity.getDate())) {
                    int type = trainingPlanCurDateEntity.getType();
                    if (type == 1) {
                        TrainingPlanCurDateDaoUtils trainingPlanCurDateDaoUtils = INSTANCE;
                        HabitPlanEntranceInfo habitPlanEntranceInfo = (HabitPlanEntranceInfo) trainingPlanCurDateDaoUtils.getGson().fromJson(trainingPlanCurDateEntity.getCurDatePlan(), HabitPlanEntranceInfo.class);
                        if (habitPlanEntranceInfo.getPlanId() != trainingPlanId.longValue()) {
                            Logger.i(TAG, "current sport report has different habit plan");
                            return;
                        }
                        HabitDayPlan habitDayPlan = habitPlanEntranceInfo.getHabitDayPlan();
                        if (!PlanModelsKt.isFinished(habitDayPlan)) {
                            PlanModelsKt.finish(habitDayPlan);
                            habitDayPlan.setSportKey(new SportKey(entity.getSid(), entity.getKey(), entity.getTime()));
                            trainingPlanCurDateDaoUtils.getTrainingPlanCurDateDao().update(new TrainingPlanCurDateEntity(1, trainingPlanId.longValue(), trainingPlanCurDateEntity.getDate(), trainingPlanCurDateDaoUtils.getGson().toJson(habitPlanEntranceInfo)));
                        }
                    } else if (type == 2) {
                        AbilityPlanEntranceInfo abilityPlanEntranceInfo = (AbilityPlanEntranceInfo) INSTANCE.getGson().fromJson(trainingPlanCurDateEntity.getCurDatePlan(), AbilityPlanEntranceInfo.class);
                        if (abilityPlanEntranceInfo.getPlanId() != trainingPlanId.longValue()) {
                            Logger.i(TAG, "current sport report has different ability plan");
                            return;
                        }
                        AbilityDayPlan abilityDayPlan = abilityPlanEntranceInfo.getAbilityDayPlan();
                        if (abilityDayPlan != null && (courseList = abilityDayPlan.getCourseList()) != null) {
                            boolean z = false;
                            for (AbilityDayPlanCourse abilityDayPlanCourse : courseList) {
                                long courseId = abilityDayPlanCourse.getCourseId();
                                if (cloudCourseId != null && courseId == cloudCourseId.longValue() && !PlanModelsKt.isFinished(abilityDayPlanCourse)) {
                                    PlanModelsKt.finish(abilityDayPlanCourse);
                                    abilityDayPlanCourse.setSportKey(new SportKey(entity.getSid(), entity.getKey(), entity.getTime()));
                                    z = true;
                                }
                            }
                            if (z) {
                                TrainingPlanCurDateDaoUtils trainingPlanCurDateDaoUtils2 = INSTANCE;
                                Logger.d(TAG, "update-local-ability-info:" + trainingPlanCurDateDaoUtils2.getGson().toJson(abilityPlanEntranceInfo));
                                Logger.d(TAG, "get-local-ability-info:" + trainingPlanCurDateDaoUtils2.getLocalCurDateByInfo(2, trainingPlanId.longValue(), trainingPlanCurDateEntity.getDate()));
                                trainingPlanCurDateDaoUtils2.getTrainingPlanCurDateDao().update(new TrainingPlanCurDateEntity(2, trainingPlanId.longValue(), trainingPlanCurDateEntity.getDate(), trainingPlanCurDateDaoUtils2.getGson().toJson(abilityPlanEntranceInfo)));
                            }
                        }
                    }
                }
            }
        } catch (Exception e) {
            Logger.e(TAG, "notifyInsertSportReport exception " + e.getMessage(), e);
        }
    }

    public final void syncCurDatePlanInfo(int trainingType, long id, long date, @Nullable String planInfo) {
        try {
            if (TextUtils.isEmpty(planInfo)) {
                Logger.i(TAG, "syncCurDatePlanInfo with empty planInfo!!");
                return;
            }
            Intrinsics.checkNotNull(planInfo);
            TrainingPlanCurDateEntity trainingPlanCurDateEntity = new TrainingPlanCurDateEntity(trainingType, id, date, planInfo);
            if (TextUtils.isEmpty(getLocalCurDateByInfo(trainingType, id, date))) {
                getTrainingPlanCurDateDao().insert(trainingPlanCurDateEntity);
            } else {
                getTrainingPlanCurDateDao().update(trainingPlanCurDateEntity);
            }
        } catch (Exception e) {
            Logger.e(TAG, "syncCurDatePlanInfo exception " + e.getMessage(), e);
        }
    }
}
