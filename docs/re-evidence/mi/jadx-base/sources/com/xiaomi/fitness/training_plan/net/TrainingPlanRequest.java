package com.xiaomi.fitness.training_plan.net;

import com.mibi.sdk.DeductConstants;
import com.xiaomi.fit.data.common.data.sport.SportBasicReport;
import com.xiaomi.fit.fitness.parser.sport.base.SportReportBaseParser;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.manager.internal.extetions.LogExtKt;
import com.xiaomi.fitness.devicesettings.bluttooth.todo.miui.MiuiCursorConstants;
import com.xiaomi.fitness.net.BaseRequest;
import com.xiaomi.fitness.net.extensions.HttpPoint;
import com.xiaomi.fitness.sport.route.detail.server.RouteRequest;
import com.xiaomi.fitness.sport_eco.SportConstants;
import com.xiaomi.fitness.training_plan.common.TrainReport;
import com.xiaomi.fitness.training_plan.util.TrainingReportUtils;
import com.xiaomi.fitness.training_plan_export.model.AbilityDayPlanCourse;
import com.xiaomi.fitness.training_plan_export.model.AbilityDetailSummary;
import com.xiaomi.fitness.training_plan_export.model.AbilityPlan;
import com.xiaomi.fitness.training_plan_export.model.ForceStopCheckResult;
import com.xiaomi.fitness.training_plan_export.model.GetEntranceInfoResult;
import com.xiaomi.fitness.training_plan_export.model.HabitPlan;
import com.xiaomi.fitness.training_plan_export.model.HabitPlanHome;
import com.xiaomi.fitness.training_plan_export.model.HabitPlanImprove;
import com.xiaomi.fitness.training_plan_export.model.HabitSuccessResult;
import com.xiaomi.fitness.training_plan_export.model.SportKey;
import com.xiaomi.fitness.training_plan_export.model.SportReportItem;
import com.xiaomi.fitness.training_plan_export.model.TrainingSportReportInfo;
import com.xiaomi.fitness.watch.face.edit.entity.DialWidgetType;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.SportSummary;
import dagger.hilt.android.EntryPointAccessors;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000Ì\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u0000 P2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001PB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0086@¢\u0006\u0002\u0010\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0086@¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0086@¢\u0006\u0002\u0010\u0011J\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00062\u0006\u0010\f\u001a\u00020\rH\u0086@¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0086@¢\u0006\u0002\u0010\u0011J\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0017\u001a\u00020\bH\u0086@¢\u0006\u0002\u0010\tJ \u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001a\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\bH\u0086@¢\u0006\u0002\u0010\u001cJ\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\f\u001a\u00020\rH\u0086@¢\u0006\u0002\u0010\u000eJ\u0018\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010\f\u001a\u00020\rH\u0086@¢\u0006\u0002\u0010\u000eJ\u0010\u0010!\u001a\u0004\u0018\u00010 H\u0086@¢\u0006\u0002\u0010\u0011J\u0018\u0010\"\u001a\u0004\u0018\u00010#2\u0006\u0010\u0017\u001a\u00020\bH\u0086@¢\u0006\u0002\u0010\tJ\u0010\u0010$\u001a\u0004\u0018\u00010%H\u0086@¢\u0006\u0002\u0010\u0011J\u0018\u0010&\u001a\u0004\u0018\u00010'2\u0006\u0010\f\u001a\u00020\rH\u0086@¢\u0006\u0002\u0010\u000eJ\u0010\u0010(\u001a\u0004\u0018\u00010'H\u0086@¢\u0006\u0002\u0010\u0011J\u0010\u0010)\u001a\u0004\u0018\u00010*H\u0086@¢\u0006\u0002\u0010\u0011J\u001a\u0010+\u001a\u0004\u0018\u00010,2\b\u0010-\u001a\u0004\u0018\u00010\rH\u0086@¢\u0006\u0002\u0010\u000eJ\u0010\u0010.\u001a\u0004\u0018\u00010/H\u0086@¢\u0006\u0002\u0010\u0011J\u0010\u00100\u001a\u0004\u0018\u000101H\u0086@¢\u0006\u0002\u0010\u0011J\u0010\u00102\u001a\u0004\u0018\u000103H\u0086@¢\u0006\u0002\u0010\u0011J\u0018\u00104\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\rH\u0086@¢\u0006\u0002\u0010\u000eJ\"\u00105\u001a\u0004\u0018\u0001062\u0006\u0010\u0017\u001a\u00020\b2\b\u0010-\u001a\u0004\u0018\u00010\rH\u0086@¢\u0006\u0002\u00107J \u00108\u001a\u0004\u0018\u0001092\u0006\u0010\u0017\u001a\u00020\b2\u0006\u0010:\u001a\u00020;H\u0086@¢\u0006\u0002\u0010<J\u0018\u0010=\u001a\u0004\u0018\u00010>2\u0006\u0010\u0017\u001a\u00020\bH\u0086@¢\u0006\u0002\u0010\tJ\u0018\u0010?\u001a\u0004\u0018\u00010@2\u0006\u0010A\u001a\u00020>H\u0086@¢\u0006\u0002\u0010BJ\u0018\u0010C\u001a\u0004\u0018\u00010D2\u0006\u0010A\u001a\u00020>H\u0086@¢\u0006\u0002\u0010BJ\"\u0010E\u001a\u0004\u0018\u00010F2\u0006\u0010\u0017\u001a\u00020\b2\b\u0010-\u001a\u0004\u0018\u00010\rH\u0086@¢\u0006\u0002\u00107J \u0010G\u001a\u0004\u0018\u00010H2\u0006\u0010\u0017\u001a\u00020\b2\u0006\u0010I\u001a\u00020JH\u0086@¢\u0006\u0002\u0010KJ0\u0010L\u001a\u0004\u0018\u00010@2\u0006\u0010\u0017\u001a\u00020\b2\u0006\u0010I\u001a\u00020J2\u0006\u0010M\u001a\u00020\u000b2\u0006\u0010N\u001a\u00020\rH\u0086@¢\u0006\u0002\u0010O¨\u0006Q"}, d2 = {"Lcom/xiaomi/fitness/training_plan/net/TrainingPlanRequest;", "Lcom/xiaomi/fitness/net/BaseRequest;", "Lcom/xiaomi/fitness/training_plan/net/TrainingPlanApiService;", "<init>", "()V", "getCurAbilityPlan", "Lcom/xiaomi/fitness/training_plan_export/model/AbilityPlan;", SportConstants.KEY_TIMESTAMP, "", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "confirmUserInfo", "", "data", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "stopAbilityPlan", "Lcom/xiaomi/fitness/training_plan/net/StopAbilityPlanResult;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "generateAbilityPlan", "getUserAbility", "Lcom/xiaomi/fitness/training_plan/net/UserAbility;", "getAbilityPlanSummary", "Lcom/xiaomi/fitness/training_plan_export/model/AbilityDetailSummary;", "planId", "getAbilityRunningCourseInfo", "Lcom/xiaomi/fitness/training_plan_export/model/AbilityDayPlanCourse;", "courseId", DialWidgetType.DATE, "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHabitPlanSuggest", "Lcom/xiaomi/fitness/training_plan/net/GetHabitPlanSuggestResult;", "generateHabitPlan", "Lcom/xiaomi/fitness/training_plan/net/GenerateHabitPlanResult;", "terminateHabitPlan", "getHabitPlanHomeDetail", "Lcom/xiaomi/fitness/training_plan_export/model/HabitPlanHome;", "getHabitPlanImproveCheck", "Lcom/xiaomi/fitness/training_plan_export/model/HabitPlanImprove;", "habitPlanImproveReply", "Lcom/xiaomi/fitness/training_plan_export/model/HabitSuccessResult;", "terminatePlan", "checkForceStop", "Lcom/xiaomi/fitness/training_plan_export/model/ForceStopCheckResult;", "getPlanHistory", "Lcom/xiaomi/fitness/training_plan/net/GetPlanHistoryResult;", "nextKey", "getHabitPlanDetail", "Lcom/xiaomi/fitness/training_plan_export/model/HabitPlan;", "getEntrancePlanInfo", "Lcom/xiaomi/fitness/training_plan_export/model/GetEntranceInfoResult;", "getPlanTypeList", "Lcom/xiaomi/fitness/training_plan/net/GetPlanTypeListResult;", "closeForceCloseBubble", "getPlanReportList", "Lcom/xiaomi/fitness/training_plan_export/model/TrainingSportReportInfo;", "(JLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTheReport", "Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", "sportKey", "Lcom/xiaomi/fitness/training_plan_export/model/SportKey;", "(JLcom/xiaomi/fitness/training_plan_export/model/SportKey;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPlanSettings", "Lcom/xiaomi/fitness/training_plan/net/SmartRunningRemindSettings;", "updateHabitPlanSettings", "Lcom/xiaomi/fitness/training_plan/net/ExecStatusResult;", "settings", "(Lcom/xiaomi/fitness/training_plan/net/SmartRunningRemindSettings;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateAbilityPlanSettings", "Lcom/xiaomi/fitness/training_plan/net/SmartRunningRemindSettingUpdateResult;", "getTrainPlanReport", "Lcom/xiaomi/fitness/training_plan/common/TrainReport;", "getSportPlanSettings", "Lcom/xiaomi/fitness/training_plan/net/SportRemindSettings;", "planType", "", "(JILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateSportPlanSettings", "remindSwitch", "remindTime", "(JIZLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "training-plan_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTrainingPlanRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TrainingPlanRequest.kt\ncom/xiaomi/fitness/training_plan/net/TrainingPlanRequest\n+ 2 BaseRequest.kt\ncom/xiaomi/fitness/net/BaseRequest\n+ 3 HttpExtension.kt\ncom/xiaomi/fitness/net/extensions/HttpExtensionKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,333:1\n141#2:334\n141#2:338\n141#2:342\n141#2:346\n141#2:350\n141#2:354\n141#2:358\n141#2:362\n141#2:366\n141#2:370\n141#2:374\n141#2:378\n141#2:382\n141#2:386\n141#2:390\n141#2:395\n141#2:399\n141#2:403\n141#2:407\n141#2:411\n141#2:415\n141#2:419\n141#2:423\n141#2:427\n141#2:431\n141#2:435\n141#2:439\n141#2:443\n31#3:335\n28#3,2:336\n31#3:339\n28#3,2:340\n31#3:343\n28#3,2:344\n31#3:347\n28#3,2:348\n31#3:351\n28#3,2:352\n31#3:355\n28#3,2:356\n31#3:359\n28#3,2:360\n31#3:363\n28#3,2:364\n31#3:367\n28#3,2:368\n31#3:371\n28#3,2:372\n31#3:375\n28#3,2:376\n31#3:379\n28#3,2:380\n31#3:383\n28#3,2:384\n31#3:387\n28#3,2:388\n31#3:391\n28#3,2:392\n31#3:396\n28#3,2:397\n31#3:400\n28#3,2:401\n31#3:404\n28#3,2:405\n31#3:408\n28#3,2:409\n31#3:412\n28#3,2:413\n31#3:416\n28#3,2:417\n31#3:420\n28#3,2:421\n31#3:424\n28#3,2:425\n31#3:428\n28#3,2:429\n31#3:432\n28#3,2:433\n31#3:436\n28#3,2:437\n31#3:440\n28#3,2:441\n31#3:444\n28#3,2:445\n1#4:394\n*S KotlinDebug\n*F\n+ 1 TrainingPlanRequest.kt\ncom/xiaomi/fitness/training_plan/net/TrainingPlanRequest\n*L\n32#1:334\n37#1:338\n46#1:342\n57#1:346\n68#1:350\n79#1:354\n91#1:358\n101#1:362\n110#1:366\n119#1:370\n130#1:374\n139#1:378\n148#1:382\n157#1:386\n166#1:390\n176#1:395\n185#1:399\n194#1:403\n203#1:407\n212#1:411\n224#1:415\n243#1:419\n259#1:423\n272#1:427\n287#1:431\n300#1:435\n312#1:439\n327#1:443\n32#1:335\n32#1:336,2\n37#1:339\n37#1:340,2\n46#1:343\n46#1:344,2\n57#1:347\n57#1:348,2\n68#1:351\n68#1:352,2\n79#1:355\n79#1:356,2\n91#1:359\n91#1:360,2\n101#1:363\n101#1:364,2\n110#1:367\n110#1:368,2\n119#1:371\n119#1:372,2\n130#1:375\n130#1:376,2\n139#1:379\n139#1:380,2\n148#1:383\n148#1:384,2\n157#1:387\n157#1:388,2\n166#1:391\n166#1:392,2\n176#1:396\n176#1:397,2\n185#1:400\n185#1:401,2\n194#1:404\n194#1:405,2\n203#1:408\n203#1:409,2\n212#1:412\n212#1:413,2\n224#1:416\n224#1:417,2\n243#1:420\n243#1:421,2\n259#1:424\n259#1:425,2\n272#1:428\n272#1:429,2\n287#1:432\n287#1:433,2\n300#1:436\n300#1:437,2\n312#1:440\n312#1:441,2\n327#1:444\n327#1:445,2\n*E\n"})
public final class TrainingPlanRequest extends BaseRequest<TrainingPlanApiService> {

    @NotNull
    private static final String TAG = "TrainingPlanRequest";

    /* JADX INFO: renamed from: com.xiaomi.fitness.training_plan.net.TrainingPlanRequest$checkForceStop$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.training_plan.net.TrainingPlanRequest", f = "TrainingPlanRequest.kt", i = {}, l = {166}, m = "checkForceStop", n = {}, s = {})
    public static final class AnonymousClass1 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TrainingPlanRequest.this.checkForceStop(this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.training_plan.net.TrainingPlanRequest$closeForceCloseBubble$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.training_plan.net.TrainingPlanRequest", f = "TrainingPlanRequest.kt", i = {}, l = {212}, m = "closeForceCloseBubble", n = {}, s = {})
    public static final class C32541 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C32541(Continuation<? super C32541> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TrainingPlanRequest.this.closeForceCloseBubble(null, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.training_plan.net.TrainingPlanRequest$confirmUserInfo$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.training_plan.net.TrainingPlanRequest", f = "TrainingPlanRequest.kt", i = {}, l = {37}, m = "confirmUserInfo", n = {}, s = {})
    public static final class C32551 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C32551(Continuation<? super C32551> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TrainingPlanRequest.this.confirmUserInfo(null, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.training_plan.net.TrainingPlanRequest$generateAbilityPlan$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.training_plan.net.TrainingPlanRequest", f = "TrainingPlanRequest.kt", i = {0}, l = {57}, m = "generateAbilityPlan", n = {"data"}, s = {"L$0"})
    public static final class C32561 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C32561(Continuation<? super C32561> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TrainingPlanRequest.this.generateAbilityPlan(null, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.training_plan.net.TrainingPlanRequest$generateHabitPlan$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.training_plan.net.TrainingPlanRequest", f = "TrainingPlanRequest.kt", i = {}, l = {110}, m = "generateHabitPlan", n = {}, s = {})
    public static final class C32571 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C32571(Continuation<? super C32571> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TrainingPlanRequest.this.generateHabitPlan(null, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.training_plan.net.TrainingPlanRequest$getAbilityPlanSummary$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.training_plan.net.TrainingPlanRequest", f = "TrainingPlanRequest.kt", i = {}, l = {77}, m = "getAbilityPlanSummary", n = {}, s = {})
    public static final class C32581 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C32581(Continuation<? super C32581> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TrainingPlanRequest.this.getAbilityPlanSummary(0L, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.training_plan.net.TrainingPlanRequest$getAbilityRunningCourseInfo$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.training_plan.net.TrainingPlanRequest", f = "TrainingPlanRequest.kt", i = {}, l = {88}, m = "getAbilityRunningCourseInfo", n = {}, s = {})
    public static final class C32591 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C32591(Continuation<? super C32591> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TrainingPlanRequest.this.getAbilityRunningCourseInfo(0L, 0L, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.training_plan.net.TrainingPlanRequest$getCurAbilityPlan$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.training_plan.net.TrainingPlanRequest", f = "TrainingPlanRequest.kt", i = {}, l = {32}, m = "getCurAbilityPlan", n = {}, s = {})
    public static final class C32601 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C32601(Continuation<? super C32601> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TrainingPlanRequest.this.getCurAbilityPlan(0L, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.training_plan.net.TrainingPlanRequest$getEntrancePlanInfo$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.training_plan.net.TrainingPlanRequest", f = "TrainingPlanRequest.kt", i = {}, l = {SportReportBaseParser.ReportType.divingCNS}, m = "getEntrancePlanInfo", n = {}, s = {})
    public static final class C32611 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C32611(Continuation<? super C32611> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TrainingPlanRequest.this.getEntrancePlanInfo(this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.training_plan.net.TrainingPlanRequest$getHabitPlanDetail$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.training_plan.net.TrainingPlanRequest", f = "TrainingPlanRequest.kt", i = {}, l = {185}, m = "getHabitPlanDetail", n = {}, s = {})
    public static final class C32621 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C32621(Continuation<? super C32621> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TrainingPlanRequest.this.getHabitPlanDetail(this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.training_plan.net.TrainingPlanRequest$getHabitPlanHomeDetail$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.training_plan.net.TrainingPlanRequest", f = "TrainingPlanRequest.kt", i = {}, l = {128}, m = "getHabitPlanHomeDetail", n = {}, s = {})
    public static final class C32631 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C32631(Continuation<? super C32631> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TrainingPlanRequest.this.getHabitPlanHomeDetail(0L, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.training_plan.net.TrainingPlanRequest$getHabitPlanImproveCheck$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.training_plan.net.TrainingPlanRequest", f = "TrainingPlanRequest.kt", i = {}, l = {139}, m = "getHabitPlanImproveCheck", n = {}, s = {})
    public static final class C32641 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C32641(Continuation<? super C32641> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TrainingPlanRequest.this.getHabitPlanImproveCheck(this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.training_plan.net.TrainingPlanRequest$getHabitPlanSuggest$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.training_plan.net.TrainingPlanRequest", f = "TrainingPlanRequest.kt", i = {}, l = {101}, m = "getHabitPlanSuggest", n = {}, s = {})
    public static final class C32651 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C32651(Continuation<? super C32651> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TrainingPlanRequest.this.getHabitPlanSuggest(null, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.training_plan.net.TrainingPlanRequest$getPlanHistory$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.training_plan.net.TrainingPlanRequest", f = "TrainingPlanRequest.kt", i = {}, l = {176}, m = "getPlanHistory", n = {}, s = {})
    public static final class C32661 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C32661(Continuation<? super C32661> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TrainingPlanRequest.this.getPlanHistory(null, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.training_plan.net.TrainingPlanRequest$getPlanReportList$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.training_plan.net.TrainingPlanRequest", f = "TrainingPlanRequest.kt", i = {}, l = {221}, m = "getPlanReportList", n = {}, s = {})
    public static final class C32671 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C32671(Continuation<? super C32671> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TrainingPlanRequest.this.getPlanReportList(0L, null, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.training_plan.net.TrainingPlanRequest$getPlanSettings$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.training_plan.net.TrainingPlanRequest", f = "TrainingPlanRequest.kt", i = {}, l = {SportSummary.VERSION_103}, m = "getPlanSettings", n = {}, s = {})
    public static final class C32681 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C32681(Continuation<? super C32681> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TrainingPlanRequest.this.getPlanSettings(0L, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.training_plan.net.TrainingPlanRequest$getPlanTypeList$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.training_plan.net.TrainingPlanRequest", f = "TrainingPlanRequest.kt", i = {}, l = {203}, m = "getPlanTypeList", n = {}, s = {})
    public static final class C32691 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C32691(Continuation<? super C32691> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TrainingPlanRequest.this.getPlanTypeList(this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.training_plan.net.TrainingPlanRequest$getSportPlanSettings$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.training_plan.net.TrainingPlanRequest", f = "TrainingPlanRequest.kt", i = {}, l = {312}, m = "getSportPlanSettings", n = {}, s = {})
    public static final class C32701 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C32701(Continuation<? super C32701> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TrainingPlanRequest.this.getSportPlanSettings(0L, 0, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.training_plan.net.TrainingPlanRequest$getTheReport$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.training_plan.net.TrainingPlanRequest", f = "TrainingPlanRequest.kt", i = {}, l = {243}, m = "getTheReport", n = {}, s = {})
    public static final class C32711 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C32711(Continuation<? super C32711> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TrainingPlanRequest.this.getTheReport(0L, null, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.training_plan.net.TrainingPlanRequest$getTrainPlanReport$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.training_plan.net.TrainingPlanRequest", f = "TrainingPlanRequest.kt", i = {}, l = {300}, m = "getTrainPlanReport", n = {}, s = {})
    public static final class C32721 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C32721(Continuation<? super C32721> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TrainingPlanRequest.this.getTrainPlanReport(0L, null, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.training_plan.net.TrainingPlanRequest$getUserAbility$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.training_plan.net.TrainingPlanRequest", f = "TrainingPlanRequest.kt", i = {}, l = {68}, m = "getUserAbility", n = {}, s = {})
    public static final class C32731 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C32731(Continuation<? super C32731> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TrainingPlanRequest.this.getUserAbility(this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.training_plan.net.TrainingPlanRequest$habitPlanImproveReply$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.training_plan.net.TrainingPlanRequest", f = "TrainingPlanRequest.kt", i = {}, l = {148}, m = "habitPlanImproveReply", n = {}, s = {})
    public static final class C32741 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C32741(Continuation<? super C32741> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TrainingPlanRequest.this.habitPlanImproveReply(null, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.training_plan.net.TrainingPlanRequest$stopAbilityPlan$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.training_plan.net.TrainingPlanRequest", f = "TrainingPlanRequest.kt", i = {}, l = {46}, m = "stopAbilityPlan", n = {}, s = {})
    public static final class C32751 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C32751(Continuation<? super C32751> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TrainingPlanRequest.this.stopAbilityPlan(this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.training_plan.net.TrainingPlanRequest$terminateHabitPlan$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.training_plan.net.TrainingPlanRequest", f = "TrainingPlanRequest.kt", i = {}, l = {119}, m = "terminateHabitPlan", n = {}, s = {})
    public static final class C32761 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C32761(Continuation<? super C32761> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TrainingPlanRequest.this.terminateHabitPlan(this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.training_plan.net.TrainingPlanRequest$terminatePlan$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.training_plan.net.TrainingPlanRequest", f = "TrainingPlanRequest.kt", i = {}, l = {157}, m = "terminatePlan", n = {}, s = {})
    public static final class C32771 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C32771(Continuation<? super C32771> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TrainingPlanRequest.this.terminatePlan(this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.training_plan.net.TrainingPlanRequest$updateAbilityPlanSettings$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.training_plan.net.TrainingPlanRequest", f = "TrainingPlanRequest.kt", i = {}, l = {287}, m = "updateAbilityPlanSettings", n = {}, s = {})
    public static final class C32781 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C32781(Continuation<? super C32781> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TrainingPlanRequest.this.updateAbilityPlanSettings(null, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.training_plan.net.TrainingPlanRequest$updateHabitPlanSettings$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.training_plan.net.TrainingPlanRequest", f = "TrainingPlanRequest.kt", i = {}, l = {272}, m = "updateHabitPlanSettings", n = {}, s = {})
    public static final class C32791 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C32791(Continuation<? super C32791> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TrainingPlanRequest.this.updateHabitPlanSettings(null, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.training_plan.net.TrainingPlanRequest$updateSportPlanSettings$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.training_plan.net.TrainingPlanRequest", f = "TrainingPlanRequest.kt", i = {}, l = {327}, m = "updateSportPlanSettings", n = {}, s = {})
    public static final class C32801 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C32801(Continuation<? super C32801> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TrainingPlanRequest.this.updateSportPlanSettings(0L, 0, false, null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object checkForceStop(@NotNull Continuation<? super ForceStopCheckResult> continuation) {
        AnonymousClass1 anonymousClass1;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            int i = anonymousClass1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(continuation);
        }
        Object objCheckForceStop = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = anonymousClass1.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objCheckForceStop);
                TrainingPlanApiService mService = getMService();
                anonymousClass1.label = 1;
                objCheckForceStop = mService.checkForceStop(anonymousClass1);
                if (objCheckForceStop == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objCheckForceStop);
            }
            Object objHandleResponse = ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(objCheckForceStop);
            Intrinsics.checkNotNull(objHandleResponse, "null cannot be cast to non-null type com.xiaomi.fitness.training_plan_export.model.ForceStopCheckResult");
            return (ForceStopCheckResult) objHandleResponse;
        } catch (Exception e) {
            e.printStackTrace();
            LogExtKt.loge(TAG, "checkForceStop,exception:" + Unit.INSTANCE);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object closeForceCloseBubble(@NotNull String str, @NotNull Continuation<? super Boolean> continuation) {
        C32541 c32541;
        if (continuation instanceof C32541) {
            c32541 = (C32541) continuation;
            int i = c32541.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c32541.label = i - Integer.MIN_VALUE;
            } else {
                c32541 = new C32541(continuation);
            }
        } else {
            c32541 = new C32541(continuation);
        }
        Object objCloseForceStopBubble = c32541.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c32541.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objCloseForceStopBubble);
                TrainingPlanApiService mService = getMService();
                c32541.label = 1;
                objCloseForceStopBubble = mService.closeForceStopBubble(str, c32541);
                if (objCloseForceStopBubble == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objCloseForceStopBubble);
            }
            Object objHandleResponse = ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(objCloseForceStopBubble);
            Intrinsics.checkNotNull(objHandleResponse, "null cannot be cast to non-null type com.xiaomi.fitness.training_plan.net.ExecStatusResult");
            return Boxing.boxBoolean(((ExecStatusResult) objHandleResponse).getResult());
        } catch (Exception e) {
            Logger.e(TAG, "closeForceCloseBubble exception", e);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object confirmUserInfo(@NotNull String str, @NotNull Continuation<? super Boolean> continuation) {
        C32551 c32551;
        boolean result;
        if (continuation instanceof C32551) {
            c32551 = (C32551) continuation;
            int i = c32551.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c32551.label = i - Integer.MIN_VALUE;
            } else {
                c32551 = new C32551(continuation);
            }
        } else {
            c32551 = new C32551(continuation);
        }
        Object objConfirmUserInfo = c32551.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c32551.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objConfirmUserInfo);
                TrainingPlanApiService mService = getMService();
                c32551.label = 1;
                objConfirmUserInfo = mService.confirmUserInfo(str, c32551);
                if (objConfirmUserInfo == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objConfirmUserInfo);
            }
            Object objHandleResponse = ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(objConfirmUserInfo);
            Intrinsics.checkNotNull(objHandleResponse, "null cannot be cast to non-null type com.xiaomi.fitness.training_plan.net.ExecStatusResult");
            result = ((ExecStatusResult) objHandleResponse).getResult();
        } catch (Exception e) {
            LogExtKt.loge(TAG, "confirmUserInfo exception:" + e.getMessage());
            result = false;
        }
        return Boxing.boxBoolean(result);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object generateAbilityPlan(@NotNull String str, @NotNull Continuation<? super AbilityPlan> continuation) {
        C32561 c32561;
        if (continuation instanceof C32561) {
            c32561 = (C32561) continuation;
            int i = c32561.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c32561.label = i - Integer.MIN_VALUE;
            } else {
                c32561 = new C32561(continuation);
            }
        } else {
            c32561 = new C32561(continuation);
        }
        Object objGenerateAbilityPlan = c32561.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c32561.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objGenerateAbilityPlan);
                TrainingPlanApiService mService = getMService();
                c32561.L$0 = str;
                c32561.label = 1;
                objGenerateAbilityPlan = mService.generateAbilityPlan(str, c32561);
                if (objGenerateAbilityPlan == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = (String) c32561.L$0;
                ResultKt.throwOnFailure(objGenerateAbilityPlan);
            }
            Object objHandleResponse = ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(objGenerateAbilityPlan);
            Intrinsics.checkNotNull(objHandleResponse, "null cannot be cast to non-null type com.xiaomi.fitness.training_plan.net.GenerateAbilityPlanResult");
            AbilityPlan result = ((GenerateAbilityPlanResult) objHandleResponse).getResult();
            Logger.d(TAG, "generateAbilityPlan:" + str);
            return result;
        } catch (Exception e) {
            LogExtKt.loge(TAG, "generateAbilityPlan exception:" + e.getMessage());
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object generateHabitPlan(@NotNull String str, @NotNull Continuation<? super GenerateHabitPlanResult> continuation) {
        C32571 c32571;
        if (continuation instanceof C32571) {
            c32571 = (C32571) continuation;
            int i = c32571.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c32571.label = i - Integer.MIN_VALUE;
            } else {
                c32571 = new C32571(continuation);
            }
        } else {
            c32571 = new C32571(continuation);
        }
        Object objGenerateHabitPlan = c32571.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c32571.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objGenerateHabitPlan);
                TrainingPlanApiService mService = getMService();
                c32571.label = 1;
                objGenerateHabitPlan = mService.generateHabitPlan(str, c32571);
                if (objGenerateHabitPlan == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objGenerateHabitPlan);
            }
            return ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(objGenerateHabitPlan);
        } catch (Exception e) {
            e.printStackTrace();
            LogExtKt.loge(TAG, "generateHabitPlan,exception:" + Unit.INSTANCE);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object getAbilityPlanSummary(long j, @NotNull Continuation<? super AbilityDetailSummary> continuation) {
        C32581 c32581;
        if (continuation instanceof C32581) {
            c32581 = (C32581) continuation;
            int i = c32581.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c32581.label = i - Integer.MIN_VALUE;
            } else {
                c32581 = new C32581(continuation);
            }
        } else {
            c32581 = new C32581(continuation);
        }
        Object abilityPlanDetailSummary = c32581.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c32581.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(abilityPlanDetailSummary);
                TrainingPlanApiService mService = getMService();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(DeductConstants.KEY_WX_PLAN_ID, j);
                String string = jSONObject.toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                c32581.label = 1;
                abilityPlanDetailSummary = mService.getAbilityPlanDetailSummary(string, c32581);
                if (abilityPlanDetailSummary == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(abilityPlanDetailSummary);
            }
            return (AbilityDetailSummary) ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(abilityPlanDetailSummary);
        } catch (Exception e) {
            LogExtKt.loge(TAG, "getAbilityPlanSummary exception:" + e.getMessage());
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object getAbilityRunningCourseInfo(long j, long j2, @NotNull Continuation<? super AbilityDayPlanCourse> continuation) {
        C32591 c32591;
        if (continuation instanceof C32591) {
            c32591 = (C32591) continuation;
            int i = c32591.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c32591.label = i - Integer.MIN_VALUE;
            } else {
                c32591 = new C32591(continuation);
            }
        } else {
            c32591 = new C32591(continuation);
        }
        Object abilityRunningCourseInfo = c32591.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c32591.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(abilityRunningCourseInfo);
                TrainingPlanApiService mService = getMService();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("course_id", j);
                jSONObject.put(DialWidgetType.DATE, j2);
                String string = jSONObject.toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                c32591.label = 1;
                abilityRunningCourseInfo = mService.getAbilityRunningCourseInfo(string, c32591);
                if (abilityRunningCourseInfo == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(abilityRunningCourseInfo);
            }
            Object objHandleResponse = ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(abilityRunningCourseInfo);
            Intrinsics.checkNotNull(objHandleResponse, "null cannot be cast to non-null type com.xiaomi.fitness.training_plan.net.GetAbilityCourseInfo");
            return ((GetAbilityCourseInfo) objHandleResponse).getCourseInfo();
        } catch (Exception e) {
            LogExtKt.loge(TAG, "getAbilityRunningCourseInfo exception:" + e.getMessage());
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object getCurAbilityPlan(long j, @NotNull Continuation<? super AbilityPlan> continuation) throws IOException {
        C32601 c32601;
        if (continuation instanceof C32601) {
            c32601 = (C32601) continuation;
            int i = c32601.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c32601.label = i - Integer.MIN_VALUE;
            } else {
                c32601 = new C32601(continuation);
            }
        } else {
            c32601 = new C32601(continuation);
        }
        Object weekAbilityPlan = c32601.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c32601.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(weekAbilityPlan);
            TrainingPlanApiService mService = getMService();
            c32601.label = 1;
            weekAbilityPlan = mService.getWeekAbilityPlan(c32601);
            if (weekAbilityPlan == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(weekAbilityPlan);
        }
        Object objHandleResponse = ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(weekAbilityPlan);
        Intrinsics.checkNotNull(objHandleResponse, "null cannot be cast to non-null type com.xiaomi.fitness.training_plan.net.GetCurAbilityPlanResult");
        return ((GetCurAbilityPlanResult) objHandleResponse).getResult();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object getEntrancePlanInfo(@NotNull Continuation<? super GetEntranceInfoResult> continuation) {
        C32611 c32611;
        if (continuation instanceof C32611) {
            c32611 = (C32611) continuation;
            int i = c32611.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c32611.label = i - Integer.MIN_VALUE;
            } else {
                c32611 = new C32611(continuation);
            }
        } else {
            c32611 = new C32611(continuation);
        }
        Object planEntranceInfo = c32611.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c32611.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(planEntranceInfo);
                TrainingPlanApiService mService = getMService();
                c32611.label = 1;
                planEntranceInfo = mService.getPlanEntranceInfo(c32611);
                if (planEntranceInfo == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(planEntranceInfo);
            }
            Object objHandleResponse = ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(planEntranceInfo);
            Intrinsics.checkNotNull(objHandleResponse, "null cannot be cast to non-null type com.xiaomi.fitness.training_plan_export.model.GetEntranceInfoResult");
            return (GetEntranceInfoResult) objHandleResponse;
        } catch (Exception e) {
            Logger.e(TAG, "getEntrancePlanInfo exception " + e.getMessage(), e);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object getHabitPlanDetail(@NotNull Continuation<? super HabitPlan> continuation) {
        C32621 c32621;
        if (continuation instanceof C32621) {
            c32621 = (C32621) continuation;
            int i = c32621.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c32621.label = i - Integer.MIN_VALUE;
            } else {
                c32621 = new C32621(continuation);
            }
        } else {
            c32621 = new C32621(continuation);
        }
        Object habitPlanDetail = c32621.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c32621.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(habitPlanDetail);
                TrainingPlanApiService mService = getMService();
                c32621.label = 1;
                habitPlanDetail = mService.getHabitPlanDetail(c32621);
                if (habitPlanDetail == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(habitPlanDetail);
            }
            Object objHandleResponse = ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(habitPlanDetail);
            Intrinsics.checkNotNull(objHandleResponse, "null cannot be cast to non-null type com.xiaomi.fitness.training_plan.net.GetHabitPlanDetailResult");
            return ((GetHabitPlanDetailResult) objHandleResponse).getHabitPlan();
        } catch (Exception e) {
            LogExtKt.loge(TAG, "getHabitPlanDetail,exception:" + e.getMessage());
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object getHabitPlanHomeDetail(long j, @NotNull Continuation<? super HabitPlanHome> continuation) {
        C32631 c32631;
        if (continuation instanceof C32631) {
            c32631 = (C32631) continuation;
            int i = c32631.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c32631.label = i - Integer.MIN_VALUE;
            } else {
                c32631 = new C32631(continuation);
            }
        } else {
            c32631 = new C32631(continuation);
        }
        Object habitPlanHomeDetail = c32631.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c32631.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(habitPlanHomeDetail);
                TrainingPlanApiService mService = getMService();
                JSONObject jSONObject = new JSONObject();
                if (j == -1) {
                    j = 0;
                }
                jSONObject.put(DeductConstants.KEY_WX_PLAN_ID, j);
                String string = jSONObject.toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                c32631.label = 1;
                habitPlanHomeDetail = mService.getHabitPlanHomeDetail(string, c32631);
                if (habitPlanHomeDetail == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(habitPlanHomeDetail);
            }
            Object objHandleResponse = ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(habitPlanHomeDetail);
            Intrinsics.checkNotNull(objHandleResponse, "null cannot be cast to non-null type com.xiaomi.fitness.training_plan_export.model.HabitPlanHome");
            return (HabitPlanHome) objHandleResponse;
        } catch (Exception e) {
            e.printStackTrace();
            LogExtKt.loge(TAG, "getHabitPlanHomeDetail,exception:" + Unit.INSTANCE);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object getHabitPlanImproveCheck(@NotNull Continuation<? super HabitPlanImprove> continuation) {
        C32641 c32641;
        if (continuation instanceof C32641) {
            c32641 = (C32641) continuation;
            int i = c32641.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c32641.label = i - Integer.MIN_VALUE;
            } else {
                c32641 = new C32641(continuation);
            }
        } else {
            c32641 = new C32641(continuation);
        }
        Object habitPlanImproveCheck = c32641.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c32641.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(habitPlanImproveCheck);
                TrainingPlanApiService mService = getMService();
                c32641.label = 1;
                habitPlanImproveCheck = mService.getHabitPlanImproveCheck(c32641);
                if (habitPlanImproveCheck == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(habitPlanImproveCheck);
            }
            Object objHandleResponse = ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(habitPlanImproveCheck);
            Intrinsics.checkNotNull(objHandleResponse, "null cannot be cast to non-null type com.xiaomi.fitness.training_plan_export.model.HabitPlanImprove");
            return (HabitPlanImprove) objHandleResponse;
        } catch (Exception e) {
            e.printStackTrace();
            LogExtKt.loge(TAG, "getHabitPlanImproveCheck,exception:" + Unit.INSTANCE);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object getHabitPlanSuggest(@NotNull String str, @NotNull Continuation<? super GetHabitPlanSuggestResult> continuation) {
        C32651 c32651;
        if (continuation instanceof C32651) {
            c32651 = (C32651) continuation;
            int i = c32651.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c32651.label = i - Integer.MIN_VALUE;
            } else {
                c32651 = new C32651(continuation);
            }
        } else {
            c32651 = new C32651(continuation);
        }
        Object habitPlanSuggest = c32651.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c32651.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(habitPlanSuggest);
                Logger.d(TAG, "getHabitPlanSuggest params: " + str);
                TrainingPlanApiService mService = getMService();
                c32651.label = 1;
                habitPlanSuggest = mService.getHabitPlanSuggest(str, c32651);
                if (habitPlanSuggest == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(habitPlanSuggest);
            }
            return ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(habitPlanSuggest);
        } catch (Exception e) {
            LogExtKt.loge(TAG, "getHabitPlanSuggest exception:" + e.getMessage());
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object getPlanHistory(@Nullable String str, @NotNull Continuation<? super GetPlanHistoryResult> continuation) {
        C32661 c32661;
        if (continuation instanceof C32661) {
            c32661 = (C32661) continuation;
            int i = c32661.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c32661.label = i - Integer.MIN_VALUE;
            } else {
                c32661 = new C32661(continuation);
            }
        } else {
            c32661 = new C32661(continuation);
        }
        Object trainingPlanHistory = c32661.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c32661.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(trainingPlanHistory);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(RouteRequest.KEY_NEXT_KEY, str);
                String string = jSONObject.toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                TrainingPlanApiService mService = getMService();
                c32661.label = 1;
                trainingPlanHistory = mService.getTrainingPlanHistory(string, c32661);
                if (trainingPlanHistory == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(trainingPlanHistory);
            }
            Object objHandleResponse = ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(trainingPlanHistory);
            Intrinsics.checkNotNull(objHandleResponse, "null cannot be cast to non-null type com.xiaomi.fitness.training_plan.net.GetPlanHistoryResult");
            return (GetPlanHistoryResult) objHandleResponse;
        } catch (Exception e) {
            e.printStackTrace();
            LogExtKt.loge(TAG, "getPlanHistory,exception:" + Unit.INSTANCE);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object getPlanReportList(long j, @Nullable String str, @NotNull Continuation<? super TrainingSportReportInfo> continuation) {
        C32671 c32671;
        if (continuation instanceof C32671) {
            c32671 = (C32671) continuation;
            int i = c32671.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c32671.label = i - Integer.MIN_VALUE;
            } else {
                c32671 = new C32671(continuation);
            }
        } else {
            c32671 = new C32671(continuation);
        }
        Object planSportReport = c32671.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c32671.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(planSportReport);
                TrainingPlanApiService mService = getMService();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(DeductConstants.KEY_WX_PLAN_ID, j);
                if (str == null) {
                    str = "";
                }
                jSONObject.put(RouteRequest.KEY_NEXT_KEY, str);
                String string = jSONObject.toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                c32671.label = 1;
                planSportReport = mService.getPlanSportReport(string, c32671);
                if (planSportReport == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(planSportReport);
            }
            Object objHandleResponse = ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(planSportReport);
            Intrinsics.checkNotNull(objHandleResponse, "null cannot be cast to non-null type com.xiaomi.fitness.training_plan.net.GetPlanSportReportListResult");
            return ((GetPlanSportReportListResult) objHandleResponse).getSportReportInfo();
        } catch (Exception e) {
            Logger.e(TAG, "getPlanReportList exception", e);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object getPlanSettings(long j, @NotNull Continuation<? super SmartRunningRemindSettings> continuation) {
        C32681 c32681;
        if (continuation instanceof C32681) {
            c32681 = (C32681) continuation;
            int i = c32681.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c32681.label = i - Integer.MIN_VALUE;
            } else {
                c32681 = new C32681(continuation);
            }
        } else {
            c32681 = new C32681(continuation);
        }
        Object habitPlanSettings = c32681.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c32681.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(habitPlanSettings);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put(DeductConstants.KEY_WX_PLAN_ID, Boxing.boxLong(j));
                TrainingPlanApiService mService = getMService();
                String json = getMGson().toJson(linkedHashMap);
                Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
                c32681.label = 1;
                habitPlanSettings = mService.getHabitPlanSettings(json, c32681);
                if (habitPlanSettings == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(habitPlanSettings);
            }
            return (SmartRunningRemindSettings) ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(habitPlanSettings);
        } catch (Exception e) {
            LogExtKt.loge(TAG, "getHabitPlanSettings,exception:" + e);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object getPlanTypeList(@NotNull Continuation<? super GetPlanTypeListResult> continuation) {
        C32691 c32691;
        if (continuation instanceof C32691) {
            c32691 = (C32691) continuation;
            int i = c32691.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c32691.label = i - Integer.MIN_VALUE;
            } else {
                c32691 = new C32691(continuation);
            }
        } else {
            c32691 = new C32691(continuation);
        }
        Object planTypeList = c32691.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c32691.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(planTypeList);
                TrainingPlanApiService mService = getMService();
                c32691.label = 1;
                planTypeList = mService.getPlanTypeList(c32691);
                if (planTypeList == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(planTypeList);
            }
            Object objHandleResponse = ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(planTypeList);
            Intrinsics.checkNotNull(objHandleResponse, "null cannot be cast to non-null type com.xiaomi.fitness.training_plan.net.GetPlanTypeListResult");
            return (GetPlanTypeListResult) objHandleResponse;
        } catch (Exception e) {
            Logger.e(TAG, "getPlanTypeList exception " + e.getMessage(), e);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object getSportPlanSettings(long j, int i, @NotNull Continuation<? super SportRemindSettings> continuation) {
        C32701 c32701;
        if (continuation instanceof C32701) {
            c32701 = (C32701) continuation;
            int i2 = c32701.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c32701.label = i2 - Integer.MIN_VALUE;
            } else {
                c32701 = new C32701(continuation);
            }
        } else {
            c32701 = new C32701(continuation);
        }
        Object sportPlanSettings = c32701.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = c32701.label;
        try {
            if (i3 == 0) {
                ResultKt.throwOnFailure(sportPlanSettings);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put(DeductConstants.KEY_WX_PLAN_ID, Boxing.boxLong(j));
                linkedHashMap.put("plan_type", Boxing.boxInt(i));
                TrainingPlanApiService mService = getMService();
                String json = getMGson().toJson(linkedHashMap);
                Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
                c32701.label = 1;
                sportPlanSettings = mService.getSportPlanSettings(json, c32701);
                if (sportPlanSettings == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(sportPlanSettings);
            }
            return (SportRemindSettings) ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(sportPlanSettings);
        } catch (Exception e) {
            LogExtKt.loge(TAG, "getSportPlanSettings,exception:" + e);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object getTheReport(long j, @NotNull SportKey sportKey, @NotNull Continuation<? super SportBasicReport> continuation) {
        C32711 c32711;
        if (continuation instanceof C32711) {
            c32711 = (C32711) continuation;
            int i = c32711.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c32711.label = i - Integer.MIN_VALUE;
            } else {
                c32711 = new C32711(continuation);
            }
        } else {
            c32711 = new C32711(continuation);
        }
        Object theSportReport = c32711.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c32711.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(theSportReport);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(DeductConstants.KEY_WX_PLAN_ID, j);
                JSONArray jSONArray = new JSONArray();
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("key", sportKey.getKey());
                jSONObject2.put("sid", sportKey.getSid());
                jSONObject2.put("time", sportKey.getTime());
                jSONArray.put(jSONObject2);
                Unit unit = Unit.INSTANCE;
                jSONObject.put("record_key_list", jSONArray);
                String string = jSONObject.toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                TrainingPlanApiService mService = getMService();
                c32711.label = 1;
                theSportReport = mService.getTheSportReport(string, c32711);
                if (theSportReport == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(theSportReport);
            }
            Object objHandleResponse = ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(theSportReport);
            Intrinsics.checkNotNull(objHandleResponse, "null cannot be cast to non-null type com.xiaomi.fitness.training_plan.net.GetTheSportReportResult");
            List<SportReportItem> reports = ((GetTheSportReportResult) objHandleResponse).getReports();
            List<SportReportItem> list = reports;
            if (list != null && !list.isEmpty()) {
                return TrainingReportUtils.INSTANCE.convertItem2Report(reports.get(0));
            }
            return null;
        } catch (Exception e) {
            Logger.e(TAG, "getTheReport exception", e);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object getTrainPlanReport(long j, @Nullable String str, @NotNull Continuation<? super TrainReport> continuation) {
        C32721 c32721;
        if (continuation instanceof C32721) {
            c32721 = (C32721) continuation;
            int i = c32721.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c32721.label = i - Integer.MIN_VALUE;
            } else {
                c32721 = new C32721(continuation);
            }
        } else {
            c32721 = new C32721(continuation);
        }
        Object trainPlanReport = c32721.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c32721.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(trainPlanReport);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put(DeductConstants.KEY_WX_PLAN_ID, Boxing.boxLong(j));
                if (str == null) {
                    str = "";
                }
                linkedHashMap.put(RouteRequest.KEY_NEXT_KEY, str);
                TrainingPlanApiService mService = getMService();
                String json = getMGson().toJson(linkedHashMap);
                Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
                c32721.label = 1;
                trainPlanReport = mService.getTrainPlanReport(json, c32721);
                if (trainPlanReport == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(trainPlanReport);
            }
            return (TrainReport) ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(trainPlanReport);
        } catch (Exception e) {
            LogExtKt.loge(TAG, "getTrainPlanReport,exception:" + e);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object getUserAbility(@NotNull Continuation<? super UserAbility> continuation) {
        C32731 c32731;
        if (continuation instanceof C32731) {
            c32731 = (C32731) continuation;
            int i = c32731.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c32731.label = i - Integer.MIN_VALUE;
            } else {
                c32731 = new C32731(continuation);
            }
        } else {
            c32731 = new C32731(continuation);
        }
        Object userAbility = c32731.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c32731.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(userAbility);
                TrainingPlanApiService mService = getMService();
                c32731.label = 1;
                userAbility = mService.getUserAbility(c32731);
                if (userAbility == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(userAbility);
            }
            return (UserAbility) ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(userAbility);
        } catch (Exception e) {
            LogExtKt.loge(TAG, "getUserAbility exception " + e.getMessage());
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object habitPlanImproveReply(@NotNull String str, @NotNull Continuation<? super HabitSuccessResult> continuation) {
        C32741 c32741;
        if (continuation instanceof C32741) {
            c32741 = (C32741) continuation;
            int i = c32741.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c32741.label = i - Integer.MIN_VALUE;
            } else {
                c32741 = new C32741(continuation);
            }
        } else {
            c32741 = new C32741(continuation);
        }
        Object objHabitPlanImproveReply = c32741.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c32741.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objHabitPlanImproveReply);
                TrainingPlanApiService mService = getMService();
                c32741.label = 1;
                objHabitPlanImproveReply = mService.habitPlanImproveReply(str, c32741);
                if (objHabitPlanImproveReply == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objHabitPlanImproveReply);
            }
            Object objHandleResponse = ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(objHabitPlanImproveReply);
            Intrinsics.checkNotNull(objHandleResponse, "null cannot be cast to non-null type com.xiaomi.fitness.training_plan_export.model.HabitSuccessResult");
            return (HabitSuccessResult) objHandleResponse;
        } catch (Exception e) {
            e.printStackTrace();
            LogExtKt.loge(TAG, "habitPlanImproveReply,exception:" + Unit.INSTANCE);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object stopAbilityPlan(@NotNull Continuation<? super StopAbilityPlanResult> continuation) {
        C32751 c32751;
        if (continuation instanceof C32751) {
            c32751 = (C32751) continuation;
            int i = c32751.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c32751.label = i - Integer.MIN_VALUE;
            } else {
                c32751 = new C32751(continuation);
            }
        } else {
            c32751 = new C32751(continuation);
        }
        Object objStopAbilityPlan = c32751.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c32751.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objStopAbilityPlan);
                TrainingPlanApiService mService = getMService();
                c32751.label = 1;
                objStopAbilityPlan = mService.stopAbilityPlan(c32751);
                if (objStopAbilityPlan == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objStopAbilityPlan);
            }
            Object objHandleResponse = ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(objStopAbilityPlan);
            Intrinsics.checkNotNull(objHandleResponse, "null cannot be cast to non-null type com.xiaomi.fitness.training_plan.net.StopAbilityPlanResult");
            return (StopAbilityPlanResult) objHandleResponse;
        } catch (Exception e) {
            LogExtKt.loge(TAG, "stopAbilityPlan exception:" + e.getMessage());
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object terminateHabitPlan(@NotNull Continuation<? super GenerateHabitPlanResult> continuation) {
        C32761 c32761;
        if (continuation instanceof C32761) {
            c32761 = (C32761) continuation;
            int i = c32761.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c32761.label = i - Integer.MIN_VALUE;
            } else {
                c32761 = new C32761(continuation);
            }
        } else {
            c32761 = new C32761(continuation);
        }
        Object objTerminateHabitPlan = c32761.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c32761.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objTerminateHabitPlan);
                TrainingPlanApiService mService = getMService();
                c32761.label = 1;
                objTerminateHabitPlan = mService.terminateHabitPlan(c32761);
                if (objTerminateHabitPlan == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objTerminateHabitPlan);
            }
            return ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(objTerminateHabitPlan);
        } catch (Exception e) {
            e.printStackTrace();
            LogExtKt.loge(TAG, "terminateHabitPlan,exception:" + Unit.INSTANCE);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object terminatePlan(@NotNull Continuation<? super HabitSuccessResult> continuation) {
        C32771 c32771;
        if (continuation instanceof C32771) {
            c32771 = (C32771) continuation;
            int i = c32771.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c32771.label = i - Integer.MIN_VALUE;
            } else {
                c32771 = new C32771(continuation);
            }
        } else {
            c32771 = new C32771(continuation);
        }
        Object objTerminateHabitPlan = c32771.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c32771.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objTerminateHabitPlan);
                TrainingPlanApiService mService = getMService();
                c32771.label = 1;
                objTerminateHabitPlan = mService.terminateHabitPlan(c32771);
                if (objTerminateHabitPlan == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objTerminateHabitPlan);
            }
            Object objHandleResponse = ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(objTerminateHabitPlan);
            Intrinsics.checkNotNull(objHandleResponse, "null cannot be cast to non-null type com.xiaomi.fitness.training_plan_export.model.HabitSuccessResult");
            return (HabitSuccessResult) objHandleResponse;
        } catch (Exception e) {
            e.printStackTrace();
            LogExtKt.loge(TAG, "terminatePlan,exception:" + Unit.INSTANCE);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object updateAbilityPlanSettings(@NotNull SmartRunningRemindSettings smartRunningRemindSettings, @NotNull Continuation<? super SmartRunningRemindSettingUpdateResult> continuation) {
        C32781 c32781;
        if (continuation instanceof C32781) {
            c32781 = (C32781) continuation;
            int i = c32781.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c32781.label = i - Integer.MIN_VALUE;
            } else {
                c32781 = new C32781(continuation);
            }
        } else {
            c32781 = new C32781(continuation);
        }
        Object objUpdateAbilityPlanSettings = c32781.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c32781.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objUpdateAbilityPlanSettings);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("reminder_switch", smartRunningRemindSettings.getRemindSwitch());
                jSONObject.put(MiuiCursorConstants.REMIND_TIME, smartRunningRemindSettings.getRemindTime());
                jSONObject.put("running_days", smartRunningRemindSettings.getRunningDays());
                jSONObject.put("strength_days", smartRunningRemindSettings.getStrengthDays());
                String string = jSONObject.toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                TrainingPlanApiService mService = getMService();
                c32781.label = 1;
                objUpdateAbilityPlanSettings = mService.updateAbilityPlanSettings(string, c32781);
                if (objUpdateAbilityPlanSettings == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objUpdateAbilityPlanSettings);
            }
            Object objHandleResponse = ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(objUpdateAbilityPlanSettings);
            Intrinsics.checkNotNull(objHandleResponse, "null cannot be cast to non-null type com.xiaomi.fitness.training_plan.net.SmartRunningRemindSettingUpdateResult");
            return (SmartRunningRemindSettingUpdateResult) objHandleResponse;
        } catch (Exception e) {
            LogExtKt.loge(TAG, "updateHabitPlanSettings,exception:" + e);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object updateHabitPlanSettings(@NotNull SmartRunningRemindSettings smartRunningRemindSettings, @NotNull Continuation<? super ExecStatusResult> continuation) {
        C32791 c32791;
        if (continuation instanceof C32791) {
            c32791 = (C32791) continuation;
            int i = c32791.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c32791.label = i - Integer.MIN_VALUE;
            } else {
                c32791 = new C32791(continuation);
            }
        } else {
            c32791 = new C32791(continuation);
        }
        Object objUpdateHabitPlanSettings = c32791.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c32791.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objUpdateHabitPlanSettings);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("reminder_switch", smartRunningRemindSettings.getRemindSwitch());
                jSONObject.put(MiuiCursorConstants.REMIND_TIME, smartRunningRemindSettings.getRemindTime());
                String string = jSONObject.toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                TrainingPlanApiService mService = getMService();
                c32791.label = 1;
                objUpdateHabitPlanSettings = mService.updateHabitPlanSettings(string, c32791);
                if (objUpdateHabitPlanSettings == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objUpdateHabitPlanSettings);
            }
            Object objHandleResponse = ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(objUpdateHabitPlanSettings);
            Intrinsics.checkNotNull(objHandleResponse, "null cannot be cast to non-null type com.xiaomi.fitness.training_plan.net.ExecStatusResult");
            return (ExecStatusResult) objHandleResponse;
        } catch (Exception e) {
            LogExtKt.loge(TAG, "updateHabitPlanSettings,exception:" + e);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object updateSportPlanSettings(long j, int i, boolean z, @NotNull String str, @NotNull Continuation<? super ExecStatusResult> continuation) {
        C32801 c32801;
        if (continuation instanceof C32801) {
            c32801 = (C32801) continuation;
            int i2 = c32801.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c32801.label = i2 - Integer.MIN_VALUE;
            } else {
                c32801 = new C32801(continuation);
            }
        } else {
            c32801 = new C32801(continuation);
        }
        Object objUpdateSportPlanSettings = c32801.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = c32801.label;
        try {
            if (i3 == 0) {
                ResultKt.throwOnFailure(objUpdateSportPlanSettings);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("remind_switch", z);
                jSONObject.put(MiuiCursorConstants.REMIND_TIME, str);
                jSONObject.put(DeductConstants.KEY_WX_PLAN_ID, j);
                jSONObject.put("plan_type", i);
                String string = jSONObject.toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                TrainingPlanApiService mService = getMService();
                c32801.label = 1;
                objUpdateSportPlanSettings = mService.updateSportPlanSettings(string, c32801);
                if (objUpdateSportPlanSettings == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objUpdateSportPlanSettings);
            }
            Object objHandleResponse = ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(objUpdateSportPlanSettings);
            Intrinsics.checkNotNull(objHandleResponse, "null cannot be cast to non-null type com.xiaomi.fitness.training_plan.net.ExecStatusResult");
            return (ExecStatusResult) objHandleResponse;
        } catch (Exception e) {
            LogExtKt.loge(TAG, "updateSportPlanSettings,exception:" + e);
            return null;
        }
    }
}
