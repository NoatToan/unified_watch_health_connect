package com.huami.heartrate.viewmodel;

import androidx.arch.core.util.Function;
import androidx.p008lifecycle.CoroutineLiveDataKt;
import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.LiveDataScope;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.Transformations;
import androidx.p008lifecycle.ViewModel;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.chart.data.ChartDataList;
import com.huami.heartrate.dto.RestingHeartRate;
import com.huami.heartrate.koin.HeartRateScopeKt;
import com.huami.heartrate.resting.chart.RestingHrConvertChartVoKt;
import com.huami.heartrate.usecase.FetchRestingHrUseCase;
import com.huami.heartrate.vo.RestingHrLineVo;
import java.util.Calendar;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.scope.Scope;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\rB\u000f\u0012\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J&\u0010\n\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b0\u00072\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0016\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001d\u0010\u0014\u001a\u00020\u00108B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\r\u0010\u0013R#\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u0012\u001a\u0004\b\u0011\u0010\u0017R'\u0010\u001d\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b0\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR!\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001f\u0010\u001c¨\u0006%"}, d2 = {"Lcom/huami/heartrate/viewmodel/RestingHrViewModel;", "Landroidx/lifecycle/ViewModel;", "", "dateEnd", "", "e", "dateFrom", "Landroidx/lifecycle/LiveData;", "", "Lcom/huami/heartrate/dto/RestingHeartRate;", "c", "setRequestTime", "Ljava/util/Calendar;", "a", "Ljava/util/Calendar;", "dataEndCalendar", "Lcom/huami/heartrate/usecase/FetchRestingHrUseCase;", "b", "Lkotlin/Lazy;", "()Lcom/huami/heartrate/usecase/FetchRestingHrUseCase;", "fetchRestingHrUseCaseLazy", "Landroidx/lifecycle/MutableLiveData;", "Lcom/huami/heartrate/viewmodel/RestingHrViewModel$a;", "()Landroidx/lifecycle/MutableLiveData;", "requestTimeParamsMutableLiveData", GoogleApiAvailabilityLight.a, "Landroidx/lifecycle/LiveData;", "getRestingHrsLiveData", "()Landroidx/lifecycle/LiveData;", "restingHrsLiveData", "Lcom/huami/chart/data/ChartDataList;", "getChartDataList", "chartDataList", "", "userId", "<init>", "(Ljava/lang/String;)V", "heartrate_release"}, k = 1, mv = {1, 5, 1})
public final class RestingHrViewModel extends ViewModel {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private Calendar dataEndCalendar;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy fetchRestingHrUseCaseLazy;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy requestTimeParamsMutableLiveData;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final LiveData<List<RestingHeartRate>> restingHrsLiveData;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final LiveData<ChartDataList> chartDataList;

    /* JADX INFO: renamed from: com.huami.heartrate.viewmodel.RestingHrViewModel$a, reason: from toString */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\u001d\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0005\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0006\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0013\u0010\u0012¨\u0006\u0016"}, d2 = {"com/huami/heartrate/viewmodel/RestingHrViewModel$a", "", "", "a", "b", "dateFrom", "dateEnd", "Lcom/huami/heartrate/viewmodel/RestingHrViewModel$a;", "c", "", "toString", "", "hashCode", "other", "", "equals", "J", "f", "()J", "e", "<init>", "(JJ)V", "heartrate_release"}, k = 1, mv = {1, 5, 1})
    public static final /* data */ class RequestTimeParams {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        private final long dateFrom;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        private final long dateEnd;

        public RequestTimeParams(long j, long j2) {
            this.dateFrom = j;
            this.dateEnd = j2;
        }

        public static /* synthetic */ RequestTimeParams d(RequestTimeParams requestTimeParams, long j, long j2, int i, Object obj) {
            if ((i & 1) != 0) {
                j = requestTimeParams.dateFrom;
            }
            if ((i & 2) != 0) {
                j2 = requestTimeParams.dateEnd;
            }
            return requestTimeParams.c(j, j2);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final long getDateFrom() {
            return this.dateFrom;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final long getDateEnd() {
            return this.dateEnd;
        }

        @NotNull
        public final RequestTimeParams c(long dateFrom, long dateEnd) {
            return new RequestTimeParams(dateFrom, dateEnd);
        }

        public final long e() {
            return this.dateEnd;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RequestTimeParams)) {
                return false;
            }
            RequestTimeParams requestTimeParams = (RequestTimeParams) other;
            return this.dateFrom == requestTimeParams.dateFrom && this.dateEnd == requestTimeParams.dateEnd;
        }

        public final long f() {
            return this.dateFrom;
        }

        public int hashCode() {
            return (defpackage.b.a(this.dateFrom) * 31) + defpackage.b.a(this.dateEnd);
        }

        @NotNull
        public String toString() {
            return "RequestTimeParams(dateFrom=" + this.dateFrom + ", dateEnd=" + this.dateEnd + ")";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\u008a@"}, d2 = {"Landroidx/lifecycle/LiveDataScope;", "Lcom/huami/chart/data/ChartDataList;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.heartrate.viewmodel.RestingHrViewModel$chartDataList$1$1", f = "RestingHrViewModel.kt", i = {}, l = {42}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<LiveDataScope<ChartDataList>, Continuation<? super Unit>, Object> {
        public int a;
        private /* synthetic */ Object b;
        public final /* synthetic */ List<RestingHeartRate> c;
        public final /* synthetic */ RestingHrViewModel d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(List<RestingHeartRate> list, RestingHrViewModel restingHrViewModel, Continuation<? super b> continuation) {
            super(2, continuation);
            this.c = list;
            this.d = restingHrViewModel;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull LiveDataScope<ChartDataList> liveDataScope, @Nullable Continuation<? super Unit> continuation) {
            return ((b) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            b bVar = new b(this.c, this.d, continuation);
            bVar.b = obj;
            return bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                LiveDataScope liveDataScope = (LiveDataScope) this.b;
                RestingHrLineVo restingHrLineVoConvertChartVo = RestingHrConvertChartVoKt.convertChartVo(this.c, this.d.dataEndCalendar);
                ChartDataList chartDataList = null;
                if ((restingHrLineVoConvertChartVo == null ? null : restingHrLineVoConvertChartVo.getChartDatas()) != null) {
                    if (restingHrLineVoConvertChartVo.getChartDatas().size() != 0) {
                        chartDataList = new ChartDataList(restingHrLineVoConvertChartVo.getChartDatas(), 0, restingHrLineVoConvertChartVo.getEnd());
                    }
                }
                this.a = 1;
                if (liveDataScope.emit(chartDataList, this) == coroutine_suspended) {
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
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Landroidx/lifecycle/MutableLiveData;", "Lcom/huami/heartrate/viewmodel/RestingHrViewModel$a;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<MutableLiveData<RequestTimeParams>> {
        public static final c a = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MutableLiveData<RequestTimeParams> invoke() {
            return new MutableLiveData<>();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RestingHrViewModel(@NotNull String str) {
        final Scope hrScopeByUserId = HeartRateScopeKt.getHrScopeByUserId(str);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.SYNCHRONIZED;
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.fetchRestingHrUseCaseLazy = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<FetchRestingHrUseCase>() { // from class: com.huami.heartrate.viewmodel.RestingHrViewModel$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [com.huami.heartrate.usecase.FetchRestingHrUseCase, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final FetchRestingHrUseCase invoke() {
                return hrScopeByUserId.get(Reflection.getOrCreateKotlinClass(FetchRestingHrUseCase.class), qualifier, objArr);
            }
        });
        this.requestTimeParamsMutableLiveData = LazyKt__LazyJVMKt.lazy(c.a);
        LiveData<List<RestingHeartRate>> liveDataSwitchMap = Transformations.switchMap(b(), new Function<RequestTimeParams, LiveData<List<? extends RestingHeartRate>>>() { // from class: com.huami.heartrate.viewmodel.RestingHrViewModel$special$$inlined$switchMap$1
            @Override // androidx.arch.core.util.Function
            @NotNull
            public final LiveData<List<? extends RestingHeartRate>> apply(RestingHrViewModel.RequestTimeParams requestTimeParams) {
                RestingHrViewModel.RequestTimeParams requestTimeParams2 = requestTimeParams;
                return this.a.c(requestTimeParams2.getDateFrom(), requestTimeParams2.getDateEnd());
            }
        });
        this.restingHrsLiveData = liveDataSwitchMap;
        this.chartDataList = Transformations.switchMap(liveDataSwitchMap, new Function<List<? extends RestingHeartRate>, LiveData<ChartDataList>>() { // from class: com.huami.heartrate.viewmodel.RestingHrViewModel$special$$inlined$switchMap$2
            @Override // androidx.arch.core.util.Function
            @NotNull
            public final LiveData<ChartDataList> apply(List<? extends RestingHeartRate> list) {
                return CoroutineLiveDataKt.liveData$default(Dispatchers.getDefault(), 0L, new RestingHrViewModel.b(list, this.a, null), 2, (Object) null);
            }
        });
    }

    private final FetchRestingHrUseCase a() {
        return (FetchRestingHrUseCase) this.fetchRestingHrUseCaseLazy.getValue();
    }

    private final MutableLiveData<RequestTimeParams> b() {
        return (MutableLiveData) this.requestTimeParamsMutableLiveData.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LiveData<List<RestingHeartRate>> c(long dateFrom, long dateEnd) {
        return a().fetchRestingHr(dateFrom, dateEnd);
    }

    private final void e(long dateEnd) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(dateEnd);
        Unit unit = Unit.INSTANCE;
        this.dataEndCalendar = calendar;
    }

    @NotNull
    public final LiveData<ChartDataList> getChartDataList() {
        return this.chartDataList;
    }

    @NotNull
    public final LiveData<List<RestingHeartRate>> getRestingHrsLiveData() {
        return this.restingHrsLiveData;
    }

    public final void setRequestTime(long dateFrom, long dateEnd) {
        b().setValue(new RequestTimeParams(dateFrom, dateEnd));
        e(dateEnd);
    }
}
