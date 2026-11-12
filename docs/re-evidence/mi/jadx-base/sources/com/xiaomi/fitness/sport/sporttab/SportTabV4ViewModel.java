package com.xiaomi.fitness.sport.sporttab;

import androidx.lifecycle.CoroutineLiveDataKt;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.LiveDataScope;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.fitness.banner.export.v2.BannerItemV2;
import com.mi.health.course.export.data.CourseModel;
import com.mi.health.course.export.data.CourseSeriesData;
import com.miui.tsmclient.net.TSMAuthContants;
import com.xiaomi.fit.data.common.data.sport.SportBasicReport;
import com.xiaomi.fitness.baseui.AbsViewModel;
import com.xiaomi.fitness.medal.export.data.PopMedalData;
import com.xiaomi.fitness.sport.bean.RunningRouteTabBean;
import com.xiaomi.fitness.sport.route.detail.server.RouteRepository;
import com.xiaomi.fitness.sport_export.data.RunningRouteSupportCityBean;
import com.xiaomi.fitness.training_plan_export.manager.ITrainingManager;
import com.xiaomi.fitness.training_plan_export.manager.TrainingManagerExtKt;
import com.xiaomi.fitness.training_plan_export.model.ForceStopCheckResult;
import com.xiaomi.fitness.training_plan_export.model.GetEntranceInfoResult;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 52\u00020\u0001:\u00015B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010)0(J\u0010\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010-J\u000e\u0010.\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010/0(J\u000e\u00100\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001010(J\u000e\u00102\u001a\u0002032\u0006\u00104\u001a\u00020-R\u0019\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0013\"\u0004\b\u0019\u0010\u0015R&\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u001b0\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0013\"\u0004\b\u001e\u0010\u0015R&\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001b0\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0013\"\u0004\b\"\u0010\u0015R&\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0\u001b0\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0013\"\u0004\b&\u0010\u0015¨\u00066"}, d2 = {"Lcom/xiaomi/fitness/sport/sporttab/SportTabV4ViewModel;", "Lcom/xiaomi/fitness/baseui/AbsViewModel;", "<init>", "()V", "runningRouteIsCurrentCitySupportedResultFlow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/xiaomi/fitness/sport_export/data/RunningRouteSupportCityBean;", "getRunningRouteIsCurrentCitySupportedResultFlow", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "routeRepository", "Lcom/xiaomi/fitness/sport/route/detail/server/RouteRepository;", "getRouteRepository", "()Lcom/xiaomi/fitness/sport/route/detail/server/RouteRepository;", "setRouteRepository", "(Lcom/xiaomi/fitness/sport/route/detail/server/RouteRepository;)V", "medalToPopLiveData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/xiaomi/fitness/medal/export/data/PopMedalData;", "getMedalToPopLiveData", "()Landroidx/lifecycle/MutableLiveData;", "setMedalToPopLiveData", "(Landroidx/lifecycle/MutableLiveData;)V", "sportReportLiveData", "Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", "getSportReportLiveData", "setSportReportLiveData", "courseDataListLiveData", "", "Lcom/mi/health/course/export/data/CourseSeriesData;", "getCourseDataListLiveData", "setCourseDataListLiveData", "courseDataListOldLiveData", "Lcom/mi/health/course/export/data/CourseModel$CourseData;", "getCourseDataListOldLiveData", "setCourseDataListOldLiveData", "bannerItemListLiveData", "Lcom/fitness/banner/export/v2/BannerItemV2;", "getBannerItemListLiveData", "setBannerItemListLiveData", "getRunningRouteInletLiveData", "Landroidx/lifecycle/LiveData;", "Lcom/xiaomi/fitness/sport/bean/RunningRouteTabBean;", "updateRunningRouteIsCurrentCitySupportedFlow", "", TSMAuthContants.PARAM_CITYCODE, "", "getTrainingPlanEntranceInfo", "Lcom/xiaomi/fitness/training_plan_export/model/GetEntranceInfoResult;", "checkTrainingPlanForceStop", "Lcom/xiaomi/fitness/training_plan_export/model/ForceStopCheckResult;", "closeForceStopBubble", "", "data", "Companion", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SportTabV4ViewModel extends AbsViewModel {

    @NotNull
    public static final String TAG = "SportNewTabViewModel";
    public RouteRepository routeRepository;

    @NotNull
    private final MutableStateFlow<RunningRouteSupportCityBean> runningRouteIsCurrentCitySupportedResultFlow = StateFlowKt.MutableStateFlow(null);

    @NotNull
    private MutableLiveData<PopMedalData> medalToPopLiveData = new MutableLiveData<>();

    @NotNull
    private MutableLiveData<SportBasicReport> sportReportLiveData = new MutableLiveData<>();

    @NotNull
    private MutableLiveData<List<CourseSeriesData>> courseDataListLiveData = new MutableLiveData<>();

    @NotNull
    private MutableLiveData<List<CourseModel.CourseData>> courseDataListOldLiveData = new MutableLiveData<>();

    @NotNull
    private MutableLiveData<List<BannerItemV2>> bannerItemListLiveData = new MutableLiveData<>();

    /* JADX INFO: renamed from: com.xiaomi.fitness.sport.sporttab.SportTabV4ViewModel$checkTrainingPlanForceStop$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Landroidx/lifecycle/LiveDataScope;", "Lcom/xiaomi/fitness/training_plan_export/model/ForceStopCheckResult;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.sport.sporttab.SportTabV4ViewModel$checkTrainingPlanForceStop$1", f = "SportTabV4ViewModel.kt", i = {}, l = {62, 62}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<LiveDataScope<ForceStopCheckResult>, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<ForceStopCheckResult> liveDataScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            LiveDataScope liveDataScope;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.L$0;
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
            liveDataScope = (LiveDataScope) this.L$0;
            ITrainingManager trainingManagerExtKt = TrainingManagerExtKt.getInstance(ITrainingManager.INSTANCE);
            this.L$0 = liveDataScope;
            this.label = 1;
            obj = trainingManagerExtKt.checkForceStop(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.L$0 = null;
            this.label = 2;
            if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.sport.sporttab.SportTabV4ViewModel$closeForceStopBubble$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.sport.sporttab.SportTabV4ViewModel$closeForceStopBubble$1", f = "SportTabV4ViewModel.kt", i = {}, l = {67}, m = "invokeSuspend", n = {}, s = {})
    public static final class C29781 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $data;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29781(String str, Continuation<? super C29781> continuation) {
            super(2, continuation);
            this.$data = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C29781(this.$data, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                ITrainingManager trainingManagerExtKt = TrainingManagerExtKt.getInstance(ITrainingManager.INSTANCE);
                String str = this.$data;
                this.label = 1;
                if (trainingManagerExtKt.closeForceStopBubble(str, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C29781) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.sport.sporttab.SportTabV4ViewModel$getRunningRouteInletLiveData$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Landroidx/lifecycle/LiveDataScope;", "Lcom/xiaomi/fitness/sport/bean/RunningRouteTabBean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.sport.sporttab.SportTabV4ViewModel$getRunningRouteInletLiveData$1", f = "SportTabV4ViewModel.kt", i = {}, l = {46, 46}, m = "invokeSuspend", n = {}, s = {})
    public static final class C29791 extends SuspendLambda implements Function2<LiveDataScope<RunningRouteTabBean>, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        public C29791(Continuation<? super C29791> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C29791 c29791 = SportTabV4ViewModel.this.new C29791(continuation);
            c29791.L$0 = obj;
            return c29791;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<RunningRouteTabBean> liveDataScope, Continuation<? super Unit> continuation) {
            return ((C29791) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            LiveDataScope liveDataScope;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.L$0;
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
            liveDataScope = (LiveDataScope) this.L$0;
            RouteRepository routeRepository = SportTabV4ViewModel.this.getRouteRepository();
            this.L$0 = liveDataScope;
            this.label = 1;
            obj = routeRepository.getRunningRouateInlet(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.L$0 = null;
            this.label = 2;
            if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.sport.sporttab.SportTabV4ViewModel$getTrainingPlanEntranceInfo$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Landroidx/lifecycle/LiveDataScope;", "Lcom/xiaomi/fitness/training_plan_export/model/GetEntranceInfoResult;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.sport.sporttab.SportTabV4ViewModel$getTrainingPlanEntranceInfo$1", f = "SportTabV4ViewModel.kt", i = {}, l = {58, 58}, m = "invokeSuspend", n = {}, s = {})
    public static final class C29801 extends SuspendLambda implements Function2<LiveDataScope<GetEntranceInfoResult>, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        public C29801(Continuation<? super C29801> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C29801 c29801 = new C29801(continuation);
            c29801.L$0 = obj;
            return c29801;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<GetEntranceInfoResult> liveDataScope, Continuation<? super Unit> continuation) {
            return ((C29801) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            LiveDataScope liveDataScope;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.L$0;
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
            liveDataScope = (LiveDataScope) this.L$0;
            ITrainingManager trainingManagerExtKt = TrainingManagerExtKt.getInstance(ITrainingManager.INSTANCE);
            this.L$0 = liveDataScope;
            this.label = 1;
            obj = trainingManagerExtKt.getPlanEntranceInfo(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.L$0 = null;
            this.label = 2;
            if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.sport.sporttab.SportTabV4ViewModel$updateRunningRouteIsCurrentCitySupportedFlow$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.sport.sporttab.SportTabV4ViewModel$updateRunningRouteIsCurrentCitySupportedFlow$1", f = "SportTabV4ViewModel.kt", i = {}, l = {52}, m = "invokeSuspend", n = {}, s = {})
    public static final class C29811 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $cityCode;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29811(String str, Continuation<? super C29811> continuation) {
            super(2, continuation);
            this.$cityCode = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SportTabV4ViewModel.this.new C29811(this.$cityCode, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            MutableStateFlow mutableStateFlow;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                MutableStateFlow<RunningRouteSupportCityBean> runningRouteIsCurrentCitySupportedResultFlow = SportTabV4ViewModel.this.getRunningRouteIsCurrentCitySupportedResultFlow();
                RouteRepository routeRepository = SportTabV4ViewModel.this.getRouteRepository();
                String str = this.$cityCode;
                this.L$0 = runningRouteIsCurrentCitySupportedResultFlow;
                this.label = 1;
                Object runningRouteSupportCity = routeRepository.getRunningRouteSupportCity(str, this);
                if (runningRouteSupportCity == coroutine_suspended) {
                    return coroutine_suspended;
                }
                mutableStateFlow = runningRouteIsCurrentCitySupportedResultFlow;
                obj = runningRouteSupportCity;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                mutableStateFlow = (MutableStateFlow) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            mutableStateFlow.setValue(obj);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C29811) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @NotNull
    public final LiveData<ForceStopCheckResult> checkTrainingPlanForceStop() {
        return CoroutineLiveDataKt.liveData$default((CoroutineContext) null, 0L, new AnonymousClass1(null), 3, (Object) null);
    }

    public final void closeForceStopBubble(@NotNull String data) {
        Intrinsics.checkNotNullParameter(data, "data");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new C29781(data, null), 2, null);
    }

    @NotNull
    public final MutableLiveData<List<BannerItemV2>> getBannerItemListLiveData() {
        return this.bannerItemListLiveData;
    }

    @NotNull
    public final MutableLiveData<List<CourseSeriesData>> getCourseDataListLiveData() {
        return this.courseDataListLiveData;
    }

    @NotNull
    public final MutableLiveData<List<CourseModel.CourseData>> getCourseDataListOldLiveData() {
        return this.courseDataListOldLiveData;
    }

    @NotNull
    public final MutableLiveData<PopMedalData> getMedalToPopLiveData() {
        return this.medalToPopLiveData;
    }

    @NotNull
    public final RouteRepository getRouteRepository() {
        RouteRepository routeRepository = this.routeRepository;
        if (routeRepository != null) {
            return routeRepository;
        }
        Intrinsics.throwUninitializedPropertyAccessException("routeRepository");
        return null;
    }

    @NotNull
    public final LiveData<RunningRouteTabBean> getRunningRouteInletLiveData() {
        return CoroutineLiveDataKt.liveData$default((CoroutineContext) null, 0L, new C29791(null), 3, (Object) null);
    }

    @NotNull
    public final MutableStateFlow<RunningRouteSupportCityBean> getRunningRouteIsCurrentCitySupportedResultFlow() {
        return this.runningRouteIsCurrentCitySupportedResultFlow;
    }

    @NotNull
    public final MutableLiveData<SportBasicReport> getSportReportLiveData() {
        return this.sportReportLiveData;
    }

    @NotNull
    public final LiveData<GetEntranceInfoResult> getTrainingPlanEntranceInfo() {
        return CoroutineLiveDataKt.liveData$default((CoroutineContext) null, 0L, new C29801(null), 3, (Object) null);
    }

    public final void setBannerItemListLiveData(@NotNull MutableLiveData<List<BannerItemV2>> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.bannerItemListLiveData = mutableLiveData;
    }

    public final void setCourseDataListLiveData(@NotNull MutableLiveData<List<CourseSeriesData>> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.courseDataListLiveData = mutableLiveData;
    }

    public final void setCourseDataListOldLiveData(@NotNull MutableLiveData<List<CourseModel.CourseData>> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.courseDataListOldLiveData = mutableLiveData;
    }

    public final void setMedalToPopLiveData(@NotNull MutableLiveData<PopMedalData> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.medalToPopLiveData = mutableLiveData;
    }

    public final void setRouteRepository(@NotNull RouteRepository routeRepository) {
        Intrinsics.checkNotNullParameter(routeRepository, "<set-?>");
        this.routeRepository = routeRepository;
    }

    public final void setSportReportLiveData(@NotNull MutableLiveData<SportBasicReport> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.sportReportLiveData = mutableLiveData;
    }

    public final boolean updateRunningRouteIsCurrentCitySupportedFlow(@Nullable String cityCode) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new C29811(cityCode, null), 2, null);
        return true;
    }
}
