package com.xiaomi.fit.fitness.persist.db.utils;

import android.text.TextUtils;
import com.google.gson.JsonElement;
import com.xiaomi.fit.data.common.data.sport.SportBasicReport;
import com.xiaomi.fit.fitness.di.FitnessDataSingleModuleKt;
import com.xiaomi.fit.fitness.persist.db.FitnessDatabase;
import com.xiaomi.fit.fitness.persist.db.internal.SportReportEntity;
import com.xiaomi.fit.fitness.persist.db.internal.TrainingPlanWeekDao;
import com.xiaomi.fit.fitness.persist.db.internal.TrainingPlanWeekEntity;
import com.xiaomi.fit.fitness.persist.server.FitnessDataRequest;
import com.xiaomi.fitness.common.utils.LocaleUtil;
import com.xiaomi.fitness.device.manager.internal.extetions.LogExtKt;
import com.xiaomi.fitness.net.extensions.ScopeExtKt;
import com.xiaomi.fitness.training_plan_export.manager.ITrainingManager;
import com.xiaomi.fitness.training_plan_export.manager.TrainingManagerExtKt;
import com.xiaomi.fitness.training_plan_export.model.AbilityDayPlan;
import com.xiaomi.fitness.training_plan_export.model.AbilityDayPlanCourse;
import com.xiaomi.fitness.training_plan_export.model.CurrentWeekAbilityPlan;
import com.xiaomi.fitness.training_plan_export.model.CurrentWeekHabitPlan;
import com.xiaomi.fitness.training_plan_export.model.CurrentWeekPlan;
import com.xiaomi.fitness.training_plan_export.model.HabitDayPlan;
import com.xiaomi.fitness.training_plan_export.model.PlanModelsKt;
import com.xiaomi.fitness.training_plan_export.model.SportKey;
import com.xiaomi.fitness.training_plan_export.utils.DateUtils;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u000e\u001a\u00020\u000bH\u0086@¢\u0006\u0002\u0010\u000fJ\u0018\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H\u0002J\u0018\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0016H\u0002J\u0016\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00020\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0019J\u001e\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006 "}, d2 = {"Lcom/xiaomi/fit/fitness/persist/db/utils/TrainingPlanWeekDaoUtils;", "", "<init>", "()V", "TAG", "", "trainingPlanDao", "Lcom/xiaomi/fit/fitness/persist/db/internal/TrainingPlanWeekDao;", "getTrainingPlanDao", "()Lcom/xiaomi/fit/fitness/persist/db/internal/TrainingPlanWeekDao;", "notifyInsertSportReport", "", "sportReportEntity", "Lcom/xiaomi/fit/fitness/persist/db/internal/SportReportEntity;", "syncTrainingPlanInfo", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fuseHabitPlanInfo", "localHabitPlan", "Lcom/xiaomi/fitness/training_plan_export/model/CurrentWeekHabitPlan;", "serverHabitPlan", "fuseAbilityPlanInfo", "localAbilityPlan", "Lcom/xiaomi/fitness/training_plan_export/model/CurrentWeekAbilityPlan;", "serverAbilityPlan", "getCurWeekPlan", "Lkotlin/Pair;", "", "updateWeekPlan", "planId", "", "type", "weekPlanInfo", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTrainingPlanWeekDaoUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TrainingPlanWeekDaoUtils.kt\ncom/xiaomi/fit/fitness/persist/db/utils/TrainingPlanWeekDaoUtils\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,362:1\n1863#2,2:363\n1863#2:365\n774#2:366\n865#2,2:367\n1864#2:369\n1863#2:370\n774#2:371\n865#2,2:372\n1863#2:374\n774#2:375\n865#2,2:376\n1864#2:378\n1864#2:379\n*S KotlinDebug\n*F\n+ 1 TrainingPlanWeekDaoUtils.kt\ncom/xiaomi/fit/fitness/persist/db/utils/TrainingPlanWeekDaoUtils\n*L\n253#1:363,2\n270#1:365\n272#1:366\n272#1:367,2\n270#1:369\n306#1:370\n308#1:371\n308#1:372,2\n309#1:374\n311#1:375\n311#1:376,2\n309#1:378\n306#1:379\n*E\n"})
public final class TrainingPlanWeekDaoUtils {

    @NotNull
    public static final TrainingPlanWeekDaoUtils INSTANCE = new TrainingPlanWeekDaoUtils();

    @NotNull
    private static final String TAG = "TrainingPlanDaoUtils";

    /* JADX INFO: renamed from: com.xiaomi.fit.fitness.persist.db.utils.TrainingPlanWeekDaoUtils$notifyInsertSportReport$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fit.fitness.persist.db.utils.TrainingPlanWeekDaoUtils$notifyInsertSportReport$1", f = "TrainingPlanWeekDaoUtils.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nTrainingPlanWeekDaoUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TrainingPlanWeekDaoUtils.kt\ncom/xiaomi/fit/fitness/persist/db/utils/TrainingPlanWeekDaoUtils$notifyInsertSportReport$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,362:1\n1863#2,2:363\n1863#2:365\n1863#2,2:366\n1864#2:368\n*S KotlinDebug\n*F\n+ 1 TrainingPlanWeekDaoUtils.kt\ncom/xiaomi/fit/fitness/persist/db/utils/TrainingPlanWeekDaoUtils$notifyInsertSportReport$1\n*L\n69#1:363,2\n106#1:365\n108#1:366,2\n106#1:368\n*E\n"})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ SportReportEntity $sportReportEntity;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(SportReportEntity sportReportEntity, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$sportReportEntity = sportReportEntity;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$sportReportEntity, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            List<AbilityDayPlanCourse> courseList;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            try {
                Ref.BooleanRef booleanRef = new Ref.BooleanRef();
                SportBasicReport sportBasicReport = (SportBasicReport) FitnessDataSingleModuleKt.getGson().fromJson(this.$sportReportEntity.getValue(), SportBasicReport.class);
                if (sportBasicReport.getTrainingPlanId() == null) {
                    LogExtKt.logi(TrainingPlanWeekDaoUtils.TAG, "insert none plan report, ignore it!!");
                    return Unit.INSTANCE;
                }
                List<TrainingPlanWeekEntity> curWeekPlan = TrainingPlanWeekDaoUtils.INSTANCE.getTrainingPlanDao().getCurWeekPlan();
                List<TrainingPlanWeekEntity> list = curWeekPlan;
                if (list != null && !list.isEmpty()) {
                    TrainingPlanWeekEntity trainingPlanWeekEntity = curWeekPlan.get(0);
                    Long trainingPlanId = sportBasicReport.getTrainingPlanId();
                    long id = trainingPlanWeekEntity.getId();
                    if (trainingPlanId != null && trainingPlanId.longValue() == id) {
                        new SimpleDateFormat("yyyy-MM-DD", new Locale(LocaleUtil.getCurrentLocale()));
                        JSONObject jSONObject = new JSONObject(trainingPlanWeekEntity.getCurWeekPlan());
                        int type = trainingPlanWeekEntity.getType();
                        int i = 3;
                        int i2 = 1000;
                        if (type == 1) {
                            CurrentWeekHabitPlan currentWeekHabitPlan = (CurrentWeekHabitPlan) FitnessDataSingleModuleKt.getGson().fromJson(jSONObject.optString("plan_build"), CurrentWeekHabitPlan.class);
                            Long trainingPlanId2 = sportBasicReport.getTrainingPlanId();
                            long planId = currentWeekHabitPlan.getPlanId();
                            if (trainingPlanId2 != null && trainingPlanId2.longValue() == planId) {
                                List<HabitDayPlan> habitDayPlans = currentWeekHabitPlan.getHabitDayPlans();
                                SportReportEntity sportReportEntity = this.$sportReportEntity;
                                for (HabitDayPlan habitDayPlan : habitDayPlans) {
                                    long j = 1000;
                                    if (DateUtils.INSTANCE.isSameDate(habitDayPlan.getDate() * j, j * sportBasicReport.getStartTime())) {
                                        if (PlanModelsKt.isFinished(habitDayPlan)) {
                                            long time = sportReportEntity.getTime();
                                            SportKey sportKey = habitDayPlan.getSportKey();
                                            if (time < (sportKey != null ? sportKey.getTime() : Long.MAX_VALUE)) {
                                                habitDayPlan.setSportKey(new SportKey(sportReportEntity.getSid(), sportReportEntity.getKey(), sportReportEntity.getTime()));
                                                booleanRef.element = true;
                                            }
                                        } else {
                                            habitDayPlan.setStatus(3);
                                            habitDayPlan.setSportKey(new SportKey(sportReportEntity.getSid(), sportReportEntity.getKey(), sportReportEntity.getTime()));
                                            booleanRef.element = true;
                                        }
                                    }
                                }
                            } else {
                                LogExtKt.logi(TrainingPlanWeekDaoUtils.TAG, "device and local has different habit planid ");
                                booleanRef.element = true;
                            }
                        } else if (type != 2) {
                            LogExtKt.loge(TrainingPlanWeekDaoUtils.TAG, "local plan has wrong type");
                        } else {
                            CurrentWeekAbilityPlan currentWeekAbilityPlan = (CurrentWeekAbilityPlan) FitnessDataSingleModuleKt.getGson().fromJson(jSONObject.optString("plan_improve"), CurrentWeekAbilityPlan.class);
                            Long trainingPlanId3 = sportBasicReport.getTrainingPlanId();
                            long planId2 = currentWeekAbilityPlan.getPlanId();
                            if (trainingPlanId3 != null && trainingPlanId3.longValue() == planId2) {
                                List<AbilityDayPlan> abilityDayPlans = currentWeekAbilityPlan.getAbilityDayPlans();
                                SportReportEntity sportReportEntity2 = this.$sportReportEntity;
                                for (AbilityDayPlan abilityDayPlan : abilityDayPlans) {
                                    long j2 = i2;
                                    if (DateUtils.INSTANCE.isSameDate(abilityDayPlan.getDate() * j2, j2 * sportBasicReport.getStartTime()) && (courseList = abilityDayPlan.getCourseList()) != null) {
                                        for (AbilityDayPlanCourse abilityDayPlanCourse : courseList) {
                                            Long cloudCourseId = sportBasicReport.getCloudCourseId();
                                            long courseId = abilityDayPlanCourse.getCourseId();
                                            if (cloudCourseId != null && cloudCourseId.longValue() == courseId) {
                                                if (PlanModelsKt.isFinished(abilityDayPlanCourse)) {
                                                    long startTime = sportBasicReport.getStartTime();
                                                    SportKey sportKey2 = abilityDayPlanCourse.getSportKey();
                                                    if (startTime < (sportKey2 != null ? sportKey2.getTime() : Long.MAX_VALUE)) {
                                                        abilityDayPlanCourse.setSportKey(new SportKey(sportReportEntity2.getSid(), sportReportEntity2.getKey(), sportReportEntity2.getTime()));
                                                    }
                                                    booleanRef.element = true;
                                                } else {
                                                    abilityDayPlanCourse.setStatus(i);
                                                    abilityDayPlanCourse.setSportKey(new SportKey(sportReportEntity2.getSid(), sportReportEntity2.getKey(), sportReportEntity2.getTime()));
                                                    booleanRef.element = true;
                                                }
                                            }
                                            i = 3;
                                        }
                                    }
                                    i = 3;
                                    i2 = 1000;
                                }
                            } else {
                                LogExtKt.logi(TrainingPlanWeekDaoUtils.TAG, "device and local has different ability planid ");
                                booleanRef.element = true;
                            }
                        }
                    } else {
                        LogExtKt.logi(TrainingPlanWeekDaoUtils.TAG, "device has different plan from local");
                        booleanRef.element = true;
                    }
                    if (booleanRef.element) {
                        TrainingManagerExtKt.getInstance(ITrainingManager.INSTANCE).syncTrainingPlanWithDeviceIfNeeded();
                    }
                }
                return Unit.INSTANCE;
            } catch (Exception e) {
                LogExtKt.loge(TrainingPlanWeekDaoUtils.TAG, "notifyInsertSportReport exception " + e.getMessage());
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fit.fitness.persist.db.utils.TrainingPlanWeekDaoUtils$syncTrainingPlanInfo$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fit.fitness.persist.db.utils.TrainingPlanWeekDaoUtils", f = "TrainingPlanWeekDaoUtils.kt", i = {0}, l = {158}, m = "syncTrainingPlanInfo", n = {"this"}, s = {"L$0"})
    public static final class C16101 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C16101(Continuation<? super C16101> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TrainingPlanWeekDaoUtils.this.syncTrainingPlanInfo(this);
        }
    }

    private TrainingPlanWeekDaoUtils() {
    }

    private final void fuseAbilityPlanInfo(CurrentWeekAbilityPlan localAbilityPlan, CurrentWeekAbilityPlan serverAbilityPlan) {
        AbilityDayPlanCourse abilityDayPlanCourse;
        for (AbilityDayPlan abilityDayPlan : serverAbilityPlan.getAbilityDayPlans()) {
            long date = abilityDayPlan.getDate();
            List<AbilityDayPlan> abilityDayPlans = localAbilityPlan.getAbilityDayPlans();
            ArrayList arrayList = new ArrayList();
            for (Object obj : abilityDayPlans) {
                if (date == ((AbilityDayPlan) obj).getDate()) {
                    arrayList.add(obj);
                }
            }
            AbilityDayPlan abilityDayPlan2 = (AbilityDayPlan) arrayList.get(0);
            List<AbilityDayPlanCourse> courseList = abilityDayPlan.getCourseList();
            if (courseList != null) {
                for (AbilityDayPlanCourse abilityDayPlanCourse2 : courseList) {
                    long courseId = abilityDayPlanCourse2.getCourseId();
                    List<AbilityDayPlanCourse> courseList2 = abilityDayPlan2.getCourseList();
                    if (courseList2 != null) {
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj2 : courseList2) {
                            if (((AbilityDayPlanCourse) obj2).getCourseId() == courseId) {
                                arrayList2.add(obj2);
                            }
                        }
                        abilityDayPlanCourse = (AbilityDayPlanCourse) arrayList2.get(0);
                    } else {
                        abilityDayPlanCourse = null;
                    }
                    if (PlanModelsKt.isFinished(abilityDayPlanCourse2)) {
                        SportKey sportKey = abilityDayPlanCourse2.getSportKey();
                        SportKey sportKey2 = abilityDayPlanCourse != null ? abilityDayPlanCourse.getSportKey() : null;
                        if (sportKey == null || sportKey2 == null) {
                            LogExtKt.loge(TAG, "local and server finished but one of theme has empty sportKey!!");
                        } else if (sportKey.getTime() > sportKey2.getTime()) {
                            abilityDayPlanCourse2.setSportKey(sportKey2);
                        } else {
                            LogExtKt.logi(TAG, "server finished before local!!");
                        }
                    } else if (abilityDayPlanCourse == null || !PlanModelsKt.isFinished(abilityDayPlanCourse)) {
                        LogExtKt.logi(TAG, "local course is not finished!! " + date + " - " + courseId);
                    } else {
                        abilityDayPlanCourse2.setSportKey(abilityDayPlanCourse.getSportKey());
                    }
                }
            }
        }
    }

    private final void fuseHabitPlanInfo(CurrentWeekHabitPlan localHabitPlan, CurrentWeekHabitPlan serverHabitPlan) {
        for (HabitDayPlan habitDayPlan : serverHabitPlan.getHabitDayPlans()) {
            long date = habitDayPlan.getDate();
            List<HabitDayPlan> habitDayPlans = localHabitPlan.getHabitDayPlans();
            ArrayList arrayList = new ArrayList();
            for (Object obj : habitDayPlans) {
                if (((HabitDayPlan) obj).getDate() == date) {
                    arrayList.add(obj);
                }
            }
            HabitDayPlan habitDayPlan2 = (HabitDayPlan) arrayList.get(0);
            if (!habitDayPlan2.isRestDay()) {
                if (!PlanModelsKt.isFinished(habitDayPlan2)) {
                    LogExtKt.logi(TAG, "fuse local habit but local is not finished!! " + date);
                } else if (!PlanModelsKt.isFinished(habitDayPlan)) {
                    habitDayPlan.setStatus(3);
                    habitDayPlan.setSportKey(habitDayPlan2.getSportKey());
                } else if (habitDayPlan2.getSportKey() == null || habitDayPlan.getSportKey() == null) {
                    LogExtKt.loge(TAG, "fuse habitPlanInfo with case all finished but one of them has empty sportKey!!'");
                } else {
                    SportKey sportKey = habitDayPlan.getSportKey();
                    Intrinsics.checkNotNull(sportKey);
                    long time = sportKey.getTime();
                    SportKey sportKey2 = habitDayPlan2.getSportKey();
                    Intrinsics.checkNotNull(sportKey2);
                    if (time > sportKey2.getTime()) {
                        habitDayPlan.setSportKey(habitDayPlan2.getSportKey());
                    } else {
                        LogExtKt.logi(TAG, "server finished dayPlan is before local!!");
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TrainingPlanWeekDao getTrainingPlanDao() {
        return FitnessDatabase.INSTANCE.getInstance().trainingPlanWeekDao();
    }

    @Nullable
    public final Pair<Integer, String> getCurWeekPlan() {
        List<TrainingPlanWeekEntity> curWeekPlan = getTrainingPlanDao().getCurWeekPlan();
        List<TrainingPlanWeekEntity> list = curWeekPlan;
        if (list == null || list.isEmpty()) {
            return null;
        }
        TrainingPlanWeekEntity trainingPlanWeekEntity = curWeekPlan.get(0);
        return new Pair<>(Integer.valueOf(trainingPlanWeekEntity.getType()), trainingPlanWeekEntity.getCurWeekPlan());
    }

    public final void notifyInsertSportReport(@NotNull SportReportEntity sportReportEntity) {
        Intrinsics.checkNotNullParameter(sportReportEntity, "sportReportEntity");
        ScopeExtKt.scope(Dispatchers.getIO(), new AnonymousClass1(sportReportEntity, null));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public final Object syncTrainingPlanInfo(@NotNull Continuation<? super Unit> continuation) {
        C16101 c16101;
        TrainingPlanWeekDaoUtils trainingPlanWeekDaoUtils;
        CurrentWeekHabitPlan currentWeekHabitPlan;
        if (continuation instanceof C16101) {
            c16101 = (C16101) continuation;
            int i = c16101.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c16101.label = i - Integer.MIN_VALUE;
            } else {
                c16101 = new C16101(continuation);
            }
        } else {
            c16101 = new C16101(continuation);
        }
        Object weekTrainingPlan = c16101.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c16101.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(weekTrainingPlan);
                FitnessDataRequest companion = FitnessDataRequest.INSTANCE.getInstance();
                c16101.L$0 = this;
                c16101.label = 1;
                weekTrainingPlan = companion.getWeekTrainingPlan(c16101);
                if (weekTrainingPlan == coroutine_suspended) {
                    return coroutine_suspended;
                }
                trainingPlanWeekDaoUtils = this;
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                TrainingPlanWeekDaoUtils trainingPlanWeekDaoUtils2 = (TrainingPlanWeekDaoUtils) c16101.L$0;
                ResultKt.throwOnFailure(weekTrainingPlan);
                trainingPlanWeekDaoUtils = trainingPlanWeekDaoUtils2;
            }
            CurrentWeekPlan currentWeekPlan = (CurrentWeekPlan) weekTrainingPlan;
            List<TrainingPlanWeekEntity> curWeekPlan = trainingPlanWeekDaoUtils.getTrainingPlanDao().getCurWeekPlan();
            CurrentWeekHabitPlan habitWeekPlan = currentWeekPlan.getHabitWeekPlan();
            CurrentWeekAbilityPlan currentWeekAbilityPlan = null;
            if (habitWeekPlan != null) {
                habitWeekPlan.setType(1);
                currentWeekHabitPlan = habitWeekPlan;
            } else {
                currentWeekHabitPlan = 0;
            }
            CurrentWeekAbilityPlan abilityWeekPlan = currentWeekPlan.getAbilityWeekPlan();
            if (abilityWeekPlan != null) {
                abilityWeekPlan.setType(2);
                currentWeekAbilityPlan = abilityWeekPlan;
            }
            List<TrainingPlanWeekEntity> list = curWeekPlan;
            if (list != null && !list.isEmpty()) {
                TrainingPlanWeekEntity trainingPlanWeekEntity = curWeekPlan.get(0);
                if (currentWeekHabitPlan != 0) {
                    if (trainingPlanWeekEntity.getType() == 1) {
                        CurrentWeekHabitPlan currentWeekHabitPlan2 = (CurrentWeekHabitPlan) FitnessDataSingleModuleKt.getGson().fromJson(trainingPlanWeekEntity.getCurWeekPlan(), CurrentWeekHabitPlan.class);
                        if (currentWeekHabitPlan2.getPlanId() != currentWeekHabitPlan.getPlanId()) {
                            LogExtKt.logi(TAG, "local has different planId with server!! " + currentWeekHabitPlan2.getPlanId() + " - " + currentWeekHabitPlan.getPlanId());
                            trainingPlanWeekDaoUtils.getTrainingPlanDao().insert(new TrainingPlanWeekEntity(1, currentWeekHabitPlan.getPlanId(), FitnessDataSingleModuleKt.getGson().toJson(currentWeekHabitPlan), 0));
                        } else {
                            Intrinsics.checkNotNull(currentWeekHabitPlan2);
                            trainingPlanWeekDaoUtils.fuseHabitPlanInfo(currentWeekHabitPlan2, currentWeekHabitPlan);
                            trainingPlanWeekDaoUtils.getTrainingPlanDao().update(new TrainingPlanWeekEntity(1, currentWeekHabitPlan.getPlanId(), FitnessDataSingleModuleKt.getGson().toJson(currentWeekHabitPlan), 0));
                        }
                    } else {
                        LogExtKt.loge(TAG, "sync server habit plan with wrong type!!");
                    }
                } else if (currentWeekAbilityPlan == null) {
                    for (TrainingPlanWeekEntity trainingPlanWeekEntity2 : curWeekPlan) {
                        trainingPlanWeekEntity2.setStopped(1);
                        INSTANCE.getTrainingPlanDao().update(trainingPlanWeekEntity2);
                    }
                } else if (trainingPlanWeekEntity.getType() == 2) {
                    CurrentWeekAbilityPlan currentWeekAbilityPlan2 = (CurrentWeekAbilityPlan) FitnessDataSingleModuleKt.getGson().fromJson(trainingPlanWeekEntity.getCurWeekPlan(), CurrentWeekAbilityPlan.class);
                    Intrinsics.checkNotNull(currentWeekAbilityPlan2);
                    trainingPlanWeekDaoUtils.fuseAbilityPlanInfo(currentWeekAbilityPlan2, currentWeekAbilityPlan);
                    trainingPlanWeekDaoUtils.getTrainingPlanDao().update(new TrainingPlanWeekEntity(2, currentWeekAbilityPlan.getPlanId(), FitnessDataSingleModuleKt.getGson().toJson((JsonElement) currentWeekHabitPlan), 0));
                } else {
                    LogExtKt.loge(TAG, "sync server ability plan with wrong type!!");
                }
            } else if (currentWeekHabitPlan != 0 && PlanModelsKt.isValid(currentWeekHabitPlan)) {
                CurrentWeekHabitPlan habitWeekPlan2 = currentWeekPlan.getHabitWeekPlan();
                Intrinsics.checkNotNull(habitWeekPlan2);
                long planId = habitWeekPlan2.getPlanId();
                if (!currentWeekHabitPlan.getHabitDayPlans().isEmpty()) {
                    trainingPlanWeekDaoUtils.getTrainingPlanDao().insert(new TrainingPlanWeekEntity(1, planId, FitnessDataSingleModuleKt.getGson().toJson(currentWeekHabitPlan), 0));
                } else {
                    LogExtKt.loge(TAG, "sync server habit plan with empty plan!!");
                }
            } else if (currentWeekAbilityPlan == null || !PlanModelsKt.isValid(currentWeekAbilityPlan)) {
                LogExtKt.loge(TAG, "server has encounter error!!");
            } else {
                long planId2 = currentWeekAbilityPlan.getPlanId();
                if (!currentWeekAbilityPlan.getAbilityDayPlans().isEmpty()) {
                    trainingPlanWeekDaoUtils.getTrainingPlanDao().insert(new TrainingPlanWeekEntity(2, planId2, FitnessDataSingleModuleKt.getGson().toJson(currentWeekAbilityPlan), 0));
                } else {
                    LogExtKt.loge(TAG, "sync server ability plan with empty plan!!");
                }
            }
        } catch (Exception e) {
            LogExtKt.loge(TAG, "syncTrainingPlanInfo exception " + e.getMessage());
        }
        return Unit.INSTANCE;
    }

    public final void updateWeekPlan(long planId, int type, @NotNull String weekPlanInfo) {
        Intrinsics.checkNotNullParameter(weekPlanInfo, "weekPlanInfo");
        if (TextUtils.isEmpty(weekPlanInfo)) {
            LogExtKt.loge(TAG, "can not updateWeekPlan with empty weekPlanInfo!!");
            return;
        }
        TrainingPlanWeekEntity weekPlanById = getTrainingPlanDao().getWeekPlanById(planId);
        if (weekPlanById == null) {
            getTrainingPlanDao().insert(new TrainingPlanWeekEntity(type, planId, weekPlanInfo, 0));
        } else {
            weekPlanById.setCurWeekPlan(weekPlanInfo);
            getTrainingPlanDao().update(weekPlanById);
        }
    }
}
