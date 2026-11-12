package com.xiaomi.fitness.training_plan.habit_plan;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.google.gson.Gson;
import com.xiaomi.fit.data.common.data.sport.SportBasicReport;
import com.xiaomi.fit.fitness.DataExtKt;
import com.xiaomi.fit.fitness.export.data.FitnessPersistKey;
import com.xiaomi.fit.fitness.export.data.SportReportKey;
import com.xiaomi.fitness.account.manager.AccountCoreInfo;
import com.xiaomi.fitness.account.user.UserInfoManager;
import com.xiaomi.fitness.baseui.BaseViewModel;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.manager.internal.extetions.LogExtKt;
import com.xiaomi.fitness.training_plan.net.GenerateHabitPlanResult;
import com.xiaomi.fitness.training_plan.net.GetHabitPlanSuggestResult;
import com.xiaomi.fitness.training_plan.net.TrainingPlanRequest;
import com.xiaomi.fitness.training_plan_export.model.HabitPlan;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0006\u0010\u0012\u001a\u00020\u0013J\u001e\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aJ*\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00182\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00130 J\"\u0010!\u001a\u00020\u00132\u0006\u0010\"\u001a\u00020\u001a2\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00130 R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\f¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000f¨\u0006#"}, d2 = {"Lcom/xiaomi/fitness/training_plan/habit_plan/HabitPlanSuggestVM;", "Lcom/xiaomi/fitness/baseui/BaseViewModel;", "Lcom/xiaomi/fitness/training_plan/habit_plan/HabitPlanSuggestModel;", "<init>", "()V", "mUserInfoManager", "Lcom/xiaomi/fitness/account/user/UserInfoManager;", "getMUserInfoManager", "()Lcom/xiaomi/fitness/account/user/UserInfoManager;", "setMUserInfoManager", "(Lcom/xiaomi/fitness/account/user/UserInfoManager;)V", "suggestLiveData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/xiaomi/fitness/training_plan_export/model/HabitPlan;", "getSuggestLiveData", "()Landroidx/lifecycle/MutableLiveData;", "accountInfo", "Lcom/xiaomi/fitness/account/manager/AccountCoreInfo;", "getAccountInfo", "", "getHabitSuggest", "runningType", "", "runningDistance", "", "paceFaster", "", "generateHabitPlan", "daysOfWeek", "", "distance", "resultAction", "Lkotlin/Function1;", "habitImproveReply", "improve", "training-plan_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HabitPlanSuggestVM extends BaseViewModel<HabitPlanSuggestModel> {
    public UserInfoManager mUserInfoManager;

    @NotNull
    private final MutableLiveData<HabitPlan> suggestLiveData = new MutableLiveData<>();

    @NotNull
    private final MutableLiveData<AccountCoreInfo> accountInfo = new MutableLiveData<>();

    /* JADX INFO: renamed from: com.xiaomi.fitness.training_plan.habit_plan.HabitPlanSuggestVM$generateHabitPlan$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.training_plan.habit_plan.HabitPlanSuggestVM$generateHabitPlan$1", f = "HabitPlanSuggestVM.kt", i = {1}, l = {59, 72, 74}, m = "invokeSuspend", n = {"params"}, s = {"L$0"})
    @SourceDebugExtension({"SMAP\nHabitPlanSuggestVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HabitPlanSuggestVM.kt\ncom/xiaomi/fitness/training_plan/habit_plan/HabitPlanSuggestVM$generateHabitPlan$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,102:1\n1#2:103\n*E\n"})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $daysOfWeek;
        final /* synthetic */ float $distance;
        final /* synthetic */ Function1<Boolean, Unit> $resultAction;
        Object L$0;
        int label;
        final /* synthetic */ HabitPlanSuggestVM this$0;

        /* JADX INFO: renamed from: com.xiaomi.fitness.training_plan.habit_plan.HabitPlanSuggestVM$generateHabitPlan$1$2, reason: invalid class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.training_plan.habit_plan.HabitPlanSuggestVM$generateHabitPlan$1$2", f = "HabitPlanSuggestVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ GenerateHabitPlanResult $result;
            final /* synthetic */ Function1<Boolean, Unit> $resultAction;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public AnonymousClass2(GenerateHabitPlanResult generateHabitPlanResult, Function1<? super Boolean, Unit> function1, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.$result = generateHabitPlanResult;
                this.$resultAction = function1;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$result, this.$resultAction, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                GenerateHabitPlanResult generateHabitPlanResult = this.$result;
                if (generateHabitPlanResult != null) {
                    Function1<Boolean, Unit> function1 = this.$resultAction;
                    if (generateHabitPlanResult.getResult() != null) {
                        function1.invoke2(Boxing.boxBoolean(generateHabitPlanResult.getResult().getSuccess()));
                    } else {
                        function1.invoke2(Boxing.boxBoolean(false));
                    }
                } else {
                    this.$resultAction.invoke2(Boxing.boxBoolean(false));
                }
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(String str, float f, HabitPlanSuggestVM habitPlanSuggestVM, Function1<? super Boolean, Unit> function1, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$daysOfWeek = str;
            this.$distance = f;
            this.this$0 = habitPlanSuggestVM;
            this.$resultAction = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$daysOfWeek, this.$distance, this.this$0, this.$resultAction, continuation);
        }

        /* JADX WARN: Code duplicated, block: B:38:0x00ab  */
        /* JADX WARN: Code duplicated, block: B:54:0x0139 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            String key;
            String json;
            String sid;
            Integer distance;
            Integer calories;
            MainCoroutineDispatcher main;
            AnonymousClass2 anonymousClass2;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else if (i == 2) {
                    json = (String) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    GenerateHabitPlanResult generateHabitPlanResult = (GenerateHabitPlanResult) obj;
                    Logger.i(this.this$0.getTAG(), "generateHabitPlan params:" + json + " - result:" + generateHabitPlanResult);
                    main = Dispatchers.getMain();
                    anonymousClass2 = new AnonymousClass2(generateHabitPlanResult, this.$resultAction, null);
                    this.L$0 = null;
                    this.label = 3;
                    if (BuildersKt.withContext(main, anonymousClass2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            obj = DataExtKt.getLatestSportReport(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            SportBasicReport sportBasicReport = (SportBasicReport) obj;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("days_of_week", this.$daysOfWeek);
            linkedHashMap.put("running_distance", Boxing.boxFloat(this.$distance));
            linkedHashMap.put("first_sport_record_calories", Boxing.boxInt((sportBasicReport == null || (calories = sportBasicReport.getCalories()) == null) ? 0 : calories.intValue()));
            linkedHashMap.put("first_sport_record_distance", Boxing.boxInt((sportBasicReport == null || (distance = sportBasicReport.getDistance()) == null) ? 0 : distance.intValue()));
            linkedHashMap.put("first_sport_record_duration", Boxing.boxInt(sportBasicReport != null ? sportBasicReport.getDuration() : 0));
            Pair[] pairArr = new Pair[3];
            String str = "";
            if (sportBasicReport != null) {
                SportReportKey sportReportKey = FitnessPersistKey.INSTANCE.getSportReportKey(sportBasicReport.getSportType());
                key = sportReportKey != null ? sportReportKey.getKey() : null;
                if (key == null) {
                    key = "";
                }
            } else {
                key = "";
            }
            pairArr[0] = TuplesKt.to("key", key);
            if (sportBasicReport != null && (sid = sportBasicReport.getSid()) != null) {
                str = sid;
            }
            pairArr[1] = TuplesKt.to("sid", str);
            pairArr[2] = TuplesKt.to("time", Boxing.boxLong(sportBasicReport != null ? sportBasicReport.getStartTime() : 0L));
            linkedHashMap.put("first_sport_record_key", MapsKt__MapsKt.mapOf(pairArr));
            json = new Gson().toJson(linkedHashMap);
            TrainingPlanRequest trainingPlanRequest = new TrainingPlanRequest();
            Intrinsics.checkNotNull(json);
            this.L$0 = json;
            this.label = 2;
            obj = trainingPlanRequest.generateHabitPlan(json, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            GenerateHabitPlanResult generateHabitPlanResult2 = (GenerateHabitPlanResult) obj;
            Logger.i(this.this$0.getTAG(), "generateHabitPlan params:" + json + " - result:" + generateHabitPlanResult2);
            main = Dispatchers.getMain();
            anonymousClass2 = new AnonymousClass2(generateHabitPlanResult2, this.$resultAction, null);
            this.L$0 = null;
            this.label = 3;
            if (BuildersKt.withContext(main, anonymousClass2, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.training_plan.habit_plan.HabitPlanSuggestVM$getAccountInfo$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.training_plan.habit_plan.HabitPlanSuggestVM$getAccountInfo$1", f = "HabitPlanSuggestVM.kt", i = {}, l = {34}, m = "invokeSuspend", n = {}, s = {})
    public static final class C32461 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public C32461(Continuation<? super C32461> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return HabitPlanSuggestVM.this.new C32461(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                UserInfoManager mUserInfoManager = HabitPlanSuggestVM.this.getMUserInfoManager();
                this.label = 1;
                obj = mUserInfoManager.getMiAccountCoreInfo(true, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            HabitPlanSuggestVM.this.getAccountInfo().postValue((AccountCoreInfo) obj);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C32461) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.training_plan.habit_plan.HabitPlanSuggestVM$getHabitSuggest$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.training_plan.habit_plan.HabitPlanSuggestVM$getHabitSuggest$1", f = "HabitPlanSuggestVM.kt", i = {}, l = {46, 47}, m = "invokeSuspend", n = {}, s = {})
    public static final class C32471 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ boolean $paceFaster;
        final /* synthetic */ float $runningDistance;
        final /* synthetic */ int $runningType;
        int label;
        final /* synthetic */ HabitPlanSuggestVM this$0;

        /* JADX INFO: renamed from: com.xiaomi.fitness.training_plan.habit_plan.HabitPlanSuggestVM$getHabitSuggest$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.training_plan.habit_plan.HabitPlanSuggestVM$getHabitSuggest$1$1", f = "HabitPlanSuggestVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C07971 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ GetHabitPlanSuggestResult $result;
            int label;
            final /* synthetic */ HabitPlanSuggestVM this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C07971(GetHabitPlanSuggestResult getHabitPlanSuggestResult, HabitPlanSuggestVM habitPlanSuggestVM, Continuation<? super C07971> continuation) {
                super(2, continuation);
                this.$result = getHabitPlanSuggestResult;
                this.this$0 = habitPlanSuggestVM;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C07971(this.$result, this.this$0, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                GetHabitPlanSuggestResult getHabitPlanSuggestResult = this.$result;
                if (getHabitPlanSuggestResult != null) {
                    this.this$0.getSuggestLiveData().postValue(getHabitPlanSuggestResult.getResult());
                }
                LogExtKt.loge("result null");
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C07971) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C32471(int i, float f, boolean z, HabitPlanSuggestVM habitPlanSuggestVM, Continuation<? super C32471> continuation) {
            super(2, continuation);
            this.$runningType = i;
            this.$runningDistance = f;
            this.$paceFaster = z;
            this.this$0 = habitPlanSuggestVM;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C32471(this.$runningType, this.$runningDistance, this.$paceFaster, this.this$0, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("running_type", Boxing.boxInt(this.$runningType));
            linkedHashMap.put("running_distance", Boxing.boxFloat(this.$runningDistance));
            linkedHashMap.put("running_pace_faster", Boxing.boxBoolean(this.$paceFaster));
            String json = new Gson().toJson(linkedHashMap);
            TrainingPlanRequest trainingPlanRequest = new TrainingPlanRequest();
            Intrinsics.checkNotNull(json);
            this.label = 1;
            obj = trainingPlanRequest.getHabitPlanSuggest(json, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            MainCoroutineDispatcher main = Dispatchers.getMain();
            C07971 c07971 = new C07971((GetHabitPlanSuggestResult) obj, this.this$0, null);
            this.label = 2;
            if (BuildersKt.withContext(main, c07971, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C32471) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.training_plan.habit_plan.HabitPlanSuggestVM$habitImproveReply$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.training_plan.habit_plan.HabitPlanSuggestVM$habitImproveReply$1", f = "HabitPlanSuggestVM.kt", i = {}, l = {91, 92}, m = "invokeSuspend", n = {}, s = {})
    public static final class C32481 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ boolean $improve;
        final /* synthetic */ Function1<Boolean, Unit> $resultAction;
        int label;

        /* JADX INFO: renamed from: com.xiaomi.fitness.training_plan.habit_plan.HabitPlanSuggestVM$habitImproveReply$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.training_plan.habit_plan.HabitPlanSuggestVM$habitImproveReply$1$1", f = "HabitPlanSuggestVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C07981 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ boolean $result;
            final /* synthetic */ Function1<Boolean, Unit> $resultAction;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C07981(boolean z, Function1<? super Boolean, Unit> function1, Continuation<? super C07981> continuation) {
                super(2, continuation);
                this.$result = z;
                this.$resultAction = function1;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C07981(this.$result, this.$resultAction, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                if (this.$result) {
                    this.$resultAction.invoke2(Boxing.boxBoolean(true));
                } else {
                    this.$resultAction.invoke2(Boxing.boxBoolean(false));
                }
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C07981) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C32481(boolean z, Function1<? super Boolean, Unit> function1, Continuation<? super C32481> continuation) {
            super(2, continuation);
            this.$improve = z;
            this.$resultAction = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C32481(this.$improve, this.$resultAction, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            HabitSuggestRequest habitSuggestRequest = HabitSuggestRequest.INSTANCE;
            boolean z = this.$improve;
            this.label = 1;
            obj = habitSuggestRequest.habitImproveReply(z, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            MainCoroutineDispatcher main = Dispatchers.getMain();
            C07981 c07981 = new C07981(zBooleanValue, this.$resultAction, null);
            this.label = 2;
            if (BuildersKt.withContext(main, c07981, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C32481) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public final void generateHabitPlan(@NotNull String daysOfWeek, float distance, @NotNull Function1<? super Boolean, Unit> resultAction) {
        Intrinsics.checkNotNullParameter(daysOfWeek, "daysOfWeek");
        Intrinsics.checkNotNullParameter(resultAction, "resultAction");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new AnonymousClass1(daysOfWeek, distance, this, resultAction, null), 2, null);
    }

    @NotNull
    public final MutableLiveData<AccountCoreInfo> getAccountInfo() {
        return this.accountInfo;
    }

    public final void getHabitSuggest(int runningType, float runningDistance, boolean paceFaster) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new C32471(runningType, runningDistance, paceFaster, this, null), 2, null);
    }

    @NotNull
    public final UserInfoManager getMUserInfoManager() {
        UserInfoManager userInfoManager = this.mUserInfoManager;
        if (userInfoManager != null) {
            return userInfoManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mUserInfoManager");
        return null;
    }

    @NotNull
    public final MutableLiveData<HabitPlan> getSuggestLiveData() {
        return this.suggestLiveData;
    }

    public final void habitImproveReply(boolean improve, @NotNull Function1<? super Boolean, Unit> resultAction) {
        Intrinsics.checkNotNullParameter(resultAction, "resultAction");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new C32481(improve, resultAction, null), 2, null);
    }

    public final void setMUserInfoManager(@NotNull UserInfoManager userInfoManager) {
        Intrinsics.checkNotNullParameter(userInfoManager, "<set-?>");
        this.mUserInfoManager = userInfoManager;
    }

    /* JADX INFO: renamed from: getAccountInfo, reason: collision with other method in class */
    public final void m620getAccountInfo() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C32461(null), 3, null);
    }
}
