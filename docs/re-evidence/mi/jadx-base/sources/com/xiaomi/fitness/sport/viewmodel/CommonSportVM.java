package com.xiaomi.fitness.sport.viewmodel;

import android.annotation.SuppressLint;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ScopeExtKt;
import com.miui.tsmclient.entity.CardInfo;
import com.xiaomi.fit.data.common.data.sport.Location;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.data.common.util.FitnessFileUtils;
import com.xiaomi.fit.fitness.export.api.FitnessDataGetter;
import com.xiaomi.fit.fitness.export.data.FitnessPersistKey;
import com.xiaomi.fit.fitness.export.data.SportReportKey;
import com.xiaomi.fit.fitness.export.di.FitnessDataExtKt;
import com.xiaomi.fit.fitness.parser.schema.DailyRecordKey;
import com.xiaomi.fit.fitness.parser.utils.FitnessParserUtils;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.sport.bean.SportingData;
import com.xiaomi.fitness.sport.model.CommonSportModel;
import com.xiaomi.fitness.sport.model.SportModel;
import com.xiaomi.fitness.sport.route.detail.server.RouteRepository;
import com.xiaomi.fitness.sport_export.bean.ClockData;
import com.xiaomi.fitness.sport_export.data.RouteInfo;
import com.xiaomi.fitness.sport_manager_export.data.FinishSportData;
import com.xiaomi.fitness.sport_manager_export.di.SportManagerExtKt;
import com.xiaomi.fitness.sport_manager_export.listener.ISportManagerPreference;
import com.xiaomi.fitness.sport_manager_export.listener.MusicData;
import com.xiaomi.fitness.training_plan_export.model.HabitDayPlan;
import com.xiaomi.wearable.gpsalgorithm.FitnessSportAlgo;
import com.xiaomi.wearable.gpsalgorithm.data.GpsTrackData;
import java.io.File;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u00105\u001a\u00020\u000f2\b\u00106\u001a\u0004\u0018\u00010&H\u0016J\u0017\u00107\u001a\u00020\u000f2\b\u00108\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0002\u00109J0\u0010:\u001a\u00020\u000f2\u0006\u0010;\u001a\u00020\u001a2\u0006\u0010<\u001a\u00020\u001a2\u0006\u0010=\u001a\u00020\u001a2\u0006\u0010>\u001a\u00020\u001a2\u0006\u0010?\u001a\u00020\u001aH\u0016J\b\u0010@\u001a\u00020\u000fH\u0016J\b\u0010A\u001a\u00020\u000fH\u0016J$\u0010B\u001a\u00020\u000f2\u0006\u0010C\u001a\u00020\u00132\b\u0010D\u001a\u0004\u0018\u00010E2\b\u0010F\u001a\u0004\u0018\u00010GH\u0016J\u0010\u0010H\u001a\u00020\u000f2\u0006\u00106\u001a\u00020IH\u0016J\u0010\u0010J\u001a\u00020\u000f2\u0006\u0010K\u001a\u00020LH\u0016J\u0010\u0010M\u001a\u00020\u000f2\u0006\u0010K\u001a\u00020LH\u0016J)\u0010N\u001a\u00020\u000f2!\u0010O\u001a\u001d\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u000f0\nJ\b\u0010P\u001a\u00020\u000fH\u0007J\b\u0010Q\u001a\u00020\u001aH\u0016J\b\u0010R\u001a\u00020\u0013H\u0014J\b\u0010S\u001a\u00020\u0013H\u0014J\u0010\u0010T\u001a\u00020\u000f2\u0006\u0010K\u001a\u00020LH\u0016J\u000e\u0010U\u001a\u00020\u000f2\u0006\u0010V\u001a\u00020\u001aJ9\u0010W\u001a\u00020\u000f2\u0006\u0010X\u001a\u00020Y2)\u0010Z\u001a%\u0012\u001b\u0012\u0019\u0012\u0004\u0012\u00020\u000b\u0018\u00010.¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b([\u0012\u0004\u0012\u00020\u000f0\nJ\u0010\u0010\\\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010.H\u0016R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR+\u0010\t\u001a\u001f\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0014\"\u0004\b\u0018\u0010\u0016R\u001a\u0010\u0019\u001a\u00020\u001aX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR \u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00130 X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u0017\u0010%\u001a\b\u0012\u0004\u0012\u00020&0 ¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\"R\u0017\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00130 ¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\"R \u0010*\u001a\b\u0012\u0004\u0012\u00020\u001a0 X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\"\"\u0004\b,\u0010$R\u0016\u0010-\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010.X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010/\u001a\u0002008\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b1\u00102\"\u0004\b3\u00104¨\u0006]"}, d2 = {"Lcom/xiaomi/fitness/sport/viewmodel/CommonSportVM;", "Lcom/xiaomi/fitness/sport/viewmodel/BaseSportVM;", "Lcom/xiaomi/fitness/sport/model/CommonSportModel;", "<init>", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "locationChanged", "Lkotlin/Function1;", "Lcom/xiaomi/fit/data/common/data/sport/Location;", "Lkotlin/ParameterName;", "name", "location", "", "locationList", "", "isStop", "", "()Z", "setStop", "(Z)V", "isFirstInit", "setFirstInit", "curGpsStatus", "", "getCurGpsStatus", "()I", "setCurGpsStatus", "(I)V", "lockScreenReceiverAlreadyRegistered", "Landroidx/lifecycle/MutableLiveData;", "getLockScreenReceiverAlreadyRegistered", "()Landroidx/lifecycle/MutableLiveData;", "setLockScreenReceiverAlreadyRegistered", "(Landroidx/lifecycle/MutableLiveData;)V", "updateMusicInfo", "Lcom/xiaomi/fitness/sport_manager_export/listener/MusicData;", "getUpdateMusicInfo", "updateMusicState", "getUpdateMusicState", "sportStateLiveData", "getSportStateLiveData", "setSportStateLiveData", "routeList", "", "routeRepository", "Lcom/xiaomi/fitness/sport/route/detail/server/RouteRepository;", "getRouteRepository", "()Lcom/xiaomi/fitness/sport/route/detail/server/RouteRepository;", "setRouteRepository", "(Lcom/xiaomi/fitness/sport/route/detail/server/RouteRepository;)V", "onUpdateSongInfo", "data", "onPlayState", "isPlaying", "(Ljava/lang/Boolean;)V", "onSportStarted", "code", "startTime", "timeZone", DailyRecordKey.sportType, "sportLaunchType", "onSportPaused", "onSportRestarted", "onSportFinished", "validSport", "ids", "", "finishSportData", "Lcom/xiaomi/fitness/sport_manager_export/data/FinishSportData;", "onSuccess", "Lcom/xiaomi/fitness/sport/bean/SportingData;", LifecycleConstantKt.ON_STOP, CardInfo.KEY_OWNER, "Landroidx/lifecycle/LifecycleOwner;", LifecycleConstantKt.ON_RESUME, "setLocationChangedListener", "changed", "syncRecoverGps", "getGpsAccuracyStatus", "isNeedJumpSportDetailPage", "isSupportSportMusic", LifecycleConstantKt.ON_DESTROY, "routeClockIn", "status", "loadRouteList", "route", "Lcom/xiaomi/fitness/sport_export/data/RouteInfo;", "callback", "list", "getRouteLists", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCommonSportVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CommonSportVM.kt\ncom/xiaomi/fitness/sport/viewmodel/CommonSportVM\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,263:1\n1863#2,2:264\n1863#2,2:266\n*S KotlinDebug\n*F\n+ 1 CommonSportVM.kt\ncom/xiaomi/fitness/sport/viewmodel/CommonSportVM\n*L\n146#1:264,2\n200#1:266,2\n*E\n"})
public final class CommonSportVM extends BaseSportVM<CommonSportModel> {
    private int curGpsStatus;
    private boolean isStop;

    @Nullable
    private Function1<? super Location, Unit> locationChanged;

    @Nullable
    private List<? extends Location> routeList;
    public RouteRepository routeRepository;

    @NotNull
    private final String TAG = "CommonSportVM";

    @NotNull
    private List<Location> locationList = new ArrayList();
    private boolean isFirstInit = true;

    @NotNull
    private MutableLiveData<Boolean> lockScreenReceiverAlreadyRegistered = new MutableLiveData<>(Boolean.FALSE);

    @NotNull
    private final MutableLiveData<MusicData> updateMusicInfo = new MutableLiveData<>();

    @NotNull
    private final MutableLiveData<Boolean> updateMusicState = new MutableLiveData<>();

    @NotNull
    private MutableLiveData<Integer> sportStateLiveData = new MutableLiveData<>();

    /* JADX INFO: renamed from: com.xiaomi.fitness.sport.viewmodel.CommonSportVM$loadRouteList$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.sport.viewmodel.CommonSportVM$loadRouteList$1", f = "CommonSportVM.kt", i = {}, l = {253}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function1<List<? extends Location>, Unit> $callback;
        final /* synthetic */ RouteInfo $route;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(RouteInfo routeInfo, Function1<? super List<? extends Location>, Unit> function1, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$route = routeInfo;
            this.$callback = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CommonSportVM.this.new AnonymousClass1(this.$route, this.$callback, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CommonSportVM commonSportVM;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CommonSportVM commonSportVM2 = CommonSportVM.this;
                FitnessDataGetter fitnessDataExtKt = FitnessDataExtKt.getInstance(FitnessDataGetter.INSTANCE);
                String file = this.$route.getFile();
                String strValueOf = String.valueOf(this.$route.getId());
                this.L$0 = commonSportVM2;
                this.label = 1;
                Object routeGpsData = fitnessDataExtKt.getRouteGpsData(file, strValueOf, this);
                if (routeGpsData == coroutine_suspended) {
                    return coroutine_suspended;
                }
                commonSportVM = commonSportVM2;
                obj = routeGpsData;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                commonSportVM = (CommonSportVM) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            commonSportVM.routeList = (List) obj;
            this.$callback.invoke2(CommonSportVM.this.routeList);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.sport.viewmodel.CommonSportVM$routeClockIn$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.sport.viewmodel.CommonSportVM$routeClockIn$1", f = "CommonSportVM.kt", i = {}, l = {234}, m = "invokeSuspend", n = {}, s = {})
    public static final class C30651 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ ClockData $clockData;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C30651(ClockData clockData, Continuation<? super C30651> continuation) {
            super(2, continuation);
            this.$clockData = clockData;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CommonSportVM.this.new C30651(this.$clockData, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            String key;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                RouteRepository routeRepository = CommonSportVM.this.getRouteRepository();
                String did = CommonSportVM.this.getDid();
                SportReportKey sportReportKey = FitnessPersistKey.INSTANCE.getSportReportKey(CommonSportVM.this.getSportType());
                if (sportReportKey == null || (key = sportReportKey.getKey()) == null) {
                    key = "outdoor_running";
                }
                String str = key;
                long startTime = CommonSportVM.this.getStartTime();
                ClockData clockData = this.$clockData;
                this.label = 1;
                if (routeRepository.routeClockIn(did, str, startTime, "bind", clockData, this) == coroutine_suspended) {
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
            return ((C30651) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public final int getCurGpsStatus() {
        return this.curGpsStatus;
    }

    @Override // com.xiaomi.fitness.sport.viewmodel.BaseSportVM
    public int getGpsAccuracyStatus() {
        return this.curGpsStatus;
    }

    @NotNull
    public final MutableLiveData<Boolean> getLockScreenReceiverAlreadyRegistered() {
        return this.lockScreenReceiverAlreadyRegistered;
    }

    @Override // com.xiaomi.fitness.sport.viewmodel.BaseSportVM
    @Nullable
    public List<Location> getRouteLists() {
        return this.routeList;
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
    public final MutableLiveData<Integer> getSportStateLiveData() {
        return this.sportStateLiveData;
    }

    @Override // com.xiaomi.fitness.sport.viewmodel.BaseSportVM, com.xiaomi.fitness.baseui.BaseViewModel
    @NotNull
    public String getTAG() {
        return this.TAG;
    }

    @NotNull
    public final MutableLiveData<MusicData> getUpdateMusicInfo() {
        return this.updateMusicInfo;
    }

    @NotNull
    public final MutableLiveData<Boolean> getUpdateMusicState() {
        return this.updateMusicState;
    }

    /* JADX INFO: renamed from: isFirstInit, reason: from getter */
    public final boolean getIsFirstInit() {
        return this.isFirstInit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.sport.viewmodel.BaseSportVM
    public boolean isNeedJumpSportDetailPage() {
        try {
            if (((CommonSportModel) getMModel()).getHabitDayPlan() == null) {
                return true;
            }
            HabitDayPlan habitDayPlan = ((CommonSportModel) getMModel()).getHabitDayPlan();
            Intrinsics.checkNotNull(habitDayPlan);
            return !habitDayPlan.isCreateTestRunning();
        } catch (Exception e) {
            Logger.e(getTAG(), "isNeedJumpSportDetailPage", e);
            return true;
        }
    }

    /* JADX INFO: renamed from: isStop, reason: from getter */
    public final boolean getIsStop() {
        return this.isStop;
    }

    @Override // com.xiaomi.fitness.sport.viewmodel.BaseSportVM
    public boolean isSupportSportMusic() {
        return true;
    }

    public final void loadRouteList(@NotNull RouteInfo route, @NotNull Function1<? super List<? extends Location>, Unit> callback) {
        Intrinsics.checkNotNullParameter(route, "route");
        Intrinsics.checkNotNullParameter(callback, "callback");
        setRouteInfo(route);
        ScopeExtKt.scopeNetLife(this, Dispatchers.getIO(), new AnonymousClass1(route, callback, null));
    }

    @Override // com.xiaomi.fitness.sport.viewmodel.BaseSportVM, androidx.lifecycle.DefaultLifecycleObserver
    public void onDestroy(@NotNull LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        this.locationChanged = null;
        super.onDestroy(owner);
    }

    @Override // com.xiaomi.fitness.sport.viewmodel.BaseSportVM, com.xiaomi.fitness.sport_manager_export.listener.IPlayerEventListener
    public void onPlayState(@Nullable Boolean isPlaying) {
        super.onPlayState(isPlaying);
        MutableLiveData<Boolean> mutableLiveData = this.updateMusicState;
        Intrinsics.checkNotNull(isPlaying);
        mutableLiveData.postValue(isPlaying);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onResume(@NotNull LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        super.onResume(owner);
        FitnessLogUtils.i(getTAG(), LifecycleConstantKt.ON_RESUME);
        String tag = getTAG();
        SportModel.Companion companion = SportModel.INSTANCE;
        Logger.d(tag, "sportGoalType " + companion.getGOAL_TYPE());
        Logger.d(getTAG(), "sportGoalValue " + companion.getGOAL_VALUE());
        this.isStop = false;
        if (this.locationList.size() > 0) {
            List<Location> listSmoothGpsTrack = FitnessSportAlgo.smoothGpsTrack(new GpsTrackData.Builder().locationList(this.locationList).build(), null);
            Intrinsics.checkNotNull(listSmoothGpsTrack);
            for (Location location : listSmoothGpsTrack) {
                Function1<? super Location, Unit> function1 = this.locationChanged;
                if (function1 != null) {
                    Intrinsics.checkNotNull(location);
                    function1.invoke2(location);
                }
            }
            this.locationList.clear();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.sport.viewmodel.BaseSportVM, com.xiaomi.fitness.sport_manager_export.listener.ISportStateChangedListener
    public void onSportFinished(boolean validSport, @Nullable byte[] ids, @Nullable FinishSportData finishSportData) {
        super.onSportFinished(validSport, ids, null);
        ((CommonSportModel) getMModel()).onSportFinished(validSport, ids, null);
        this.sportStateLiveData.setValue(4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.sport.viewmodel.BaseSportVM, com.xiaomi.fitness.sport_manager_export.listener.ISportStateChangedListener
    public void onSportPaused() {
        super.onSportPaused();
        ((CommonSportModel) getMModel()).onSportPaused();
        this.sportStateLiveData.setValue(2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.sport.viewmodel.BaseSportVM, com.xiaomi.fitness.sport_manager_export.listener.ISportStateChangedListener
    public void onSportRestarted() {
        super.onSportRestarted();
        ((CommonSportModel) getMModel()).onSportRestarted();
        this.sportStateLiveData.setValue(3);
    }

    @Override // com.xiaomi.fitness.sport.viewmodel.BaseSportVM, com.xiaomi.fitness.sport_manager_export.listener.ISportStateChangedListener
    public void onSportStarted(int code, int startTime, int timeZone, int sportType, int sportLaunchType) {
        super.onSportStarted(code, startTime, timeZone, sportType, sportLaunchType);
        this.sportStateLiveData.setValue(1);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStop(@NotNull LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        super.onStop(owner);
        FitnessLogUtils.i(getTAG(), LifecycleConstantKt.ON_STOP);
        this.isStop = true;
    }

    @Override // com.xiaomi.fitness.sport.viewmodel.BaseSportVM, com.xiaomi.fitness.sport_manager_export.listener.IPlayerEventListener
    public void onUpdateSongInfo(@Nullable MusicData data) {
        super.onUpdateSongInfo(data);
        MutableLiveData<MusicData> mutableLiveData = this.updateMusicInfo;
        Intrinsics.checkNotNull(data);
        mutableLiveData.setValue(data);
    }

    public final void routeClockIn(int status) {
        List<Integer> wholeKiloPaceList = getSportStateCaller().getWholeKiloPaceList();
        RouteInfo routeInfo = getRouteInfo();
        ClockData clockData = new ClockData(wholeKiloPaceList, routeInfo != null ? routeInfo.getId() : -1, status);
        FitnessLogUtils.i(getTAG(), "clockData:" + clockData);
        BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getIO(), null, new C30651(clockData, null), 2, null);
    }

    public final void setCurGpsStatus(int i) {
        this.curGpsStatus = i;
    }

    public final void setFirstInit(boolean z) {
        this.isFirstInit = z;
    }

    public final void setLocationChangedListener(@NotNull Function1<? super Location, Unit> changed) {
        Intrinsics.checkNotNullParameter(changed, "changed");
        this.locationChanged = changed;
    }

    public final void setLockScreenReceiverAlreadyRegistered(@NotNull MutableLiveData<Boolean> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.lockScreenReceiverAlreadyRegistered = mutableLiveData;
    }

    public final void setRouteRepository(@NotNull RouteRepository routeRepository) {
        Intrinsics.checkNotNullParameter(routeRepository, "<set-?>");
        this.routeRepository = routeRepository;
    }

    public final void setSportStateLiveData(@NotNull MutableLiveData<Integer> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.sportStateLiveData = mutableLiveData;
    }

    public final void setStop(boolean z) {
        this.isStop = z;
    }

    @SuppressLint({"WrongConstant"})
    public final void syncRecoverGps() {
        File file = new File(SportManagerExtKt.getInstance(ISportManagerPreference.INSTANCE).getRecoverSportGps());
        FitnessLogUtils.i(getTAG(), "file :" + file);
        byte[] file2 = FitnessFileUtils.INSTANCE.readFile(file);
        FitnessLogUtils.i(getTAG(), "size :" + (file2 != null ? Integer.valueOf(file2.length) : null) + " ");
        if (file2 == null || file2.length == 0) {
            return;
        }
        ByteBuffer byteBufferOrder = ByteBuffer.wrap(file2).order(ByteOrder.LITTLE_ENDIAN);
        ArrayList arrayList = new ArrayList();
        long j = 0;
        long j2 = 0;
        while (byteBufferOrder.position() + 18 <= file2.length) {
            FitnessParserUtils fitnessParserUtils = FitnessParserUtils.INSTANCE;
            Intrinsics.checkNotNull(byteBufferOrder);
            long intFor4Bytes$default = FitnessParserUtils.getIntFor4Bytes$default(fitnessParserUtils, byteBufferOrder, false, 2, null);
            if (j2 == j) {
                j2 = intFor4Bytes$default;
            }
            float floatFor4Bytes = fitnessParserUtils.getFloatFor4Bytes(byteBufferOrder);
            float floatFor4Bytes2 = fitnessParserUtils.getFloatFor4Bytes(byteBufferOrder);
            float floatFor4Bytes3 = fitnessParserUtils.getFloatFor4Bytes(byteBufferOrder);
            int intFor2Bytes$default = FitnessParserUtils.getIntFor2Bytes$default(fitnessParserUtils, byteBufferOrder, false, 2, null);
            Location location = new Location();
            location.longitude = floatFor4Bytes;
            location.latitude = floatFor4Bytes2;
            location.horizontalAccuracy = floatFor4Bytes3;
            location.timeStamp = intFor4Bytes$default;
            location.speed = ((65520 & intFor2Bytes$default) >> 4) / 10.0f;
            location.gpsSource = intFor2Bytes$default & 15;
            arrayList.add(location);
            j = 0;
        }
        List<Location> listSmoothGpsTrack = FitnessSportAlgo.smoothGpsTrack(new GpsTrackData.Builder().locationList(arrayList).startTime(j2).build(), null);
        Intrinsics.checkNotNull(listSmoothGpsTrack);
        for (Location location2 : listSmoothGpsTrack) {
            Function1<? super Location, Unit> function1 = this.locationChanged;
            if (function1 != null) {
                Intrinsics.checkNotNull(location2);
                function1.invoke2(location2);
            }
        }
    }

    @Override // com.xiaomi.fitness.sport.viewmodel.BaseSportVM, com.xiaomi.fitness.sport.interfaces.ISportDataListener
    public void onSuccess(@NotNull SportingData data) {
        Intrinsics.checkNotNullParameter(data, "data");
        super.onSuccess(data);
        if (data.getLocationResult().size() <= 0 || data.getLocationResult().get(0).getLocation() == null) {
            return;
        }
        if (this.isStop) {
            List<Location> list = this.locationList;
            Location location = data.getLocationResult().get(0).getLocation();
            Intrinsics.checkNotNullExpressionValue(location, "getLocation(...)");
            list.add(location);
        } else {
            Function1<? super Location, Unit> function1 = this.locationChanged;
            if (function1 != null) {
                Location location2 = data.getLocationResult().get(0).getLocation();
                Intrinsics.checkNotNullExpressionValue(location2, "getLocation(...)");
                function1.invoke2(location2);
            }
        }
        this.curGpsStatus = data.getLocationResult().get(0).getGpsAccuracyStatus();
    }
}
