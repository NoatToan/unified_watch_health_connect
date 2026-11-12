package com.huami.bloodpressure_ui.week;

import androidx.arch.core.util.Function;
import androidx.p008lifecycle.CoroutineLiveDataKt;
import androidx.p008lifecycle.FlowLiveDataConversions;
import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.LiveDataScope;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.Transformations;
import androidx.p008lifecycle.ViewModelKt;
import com.huami.bigdata.statistics.bloodpressure.BloodPressureDateData;
import com.huami.bloodpressure_ui.base.BaseBloodPressureChartViewModel;
import com.huami.bloodpressure_ui.chart.BarChartVo;
import com.huami.bloodpressure_ui.chart.BloodPressureChartBuilder;
import com.huami.bloodpressure_ui.ext.BloodPressureBigDataExKt;
import com.huami.bloodpressure_ui.tab.TimeMode;
import com.huami.bloodpressure_ui.week.BloodPressureWeekChartViewModel.a;
import com.huami.chart.data.ChartDataList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0001B\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\t8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006@\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R3\u0010\u0018\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u000e\u0012\f\u0012\n \u0015*\u0004\u0018\u00010\u00040\u00040\u00140\r8\u0006@\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0010\u001a\u0004\b\u0017\u0010\u0012¨\u0006\u001b"}, d2 = {"Lcom/huami/bloodpressure_ui/week/BloodPressureWeekChartViewModel;", "Lcom/huami/bloodpressure_ui/base/BaseBloodPressureChartViewModel;", "", "Lcom/huami/bigdata/statistics/bloodpressure/BloodPressureDateData;", "", "it", "", "setAvgLineEnable", "(Ljava/lang/Boolean;)V", "Landroidx/lifecycle/MutableLiveData;", "f", "Landroidx/lifecycle/MutableLiveData;", "_avgLineEnable", "Landroidx/lifecycle/LiveData;", "Lcom/huami/bloodpressure_ui/chart/BloodPressureChartBuilder;", "g", "Landroidx/lifecycle/LiveData;", "getCurrentChartData", "()Landroidx/lifecycle/LiveData;", "currentChartData", "Lkotlin/Pair;", "kotlin.jvm.PlatformType", "h", "getMultiLiveData", "multiLiveData", "<init>", "()V", "bloodpressure-ui_release"}, k = 1, mv = {1, 5, 1})
public final class BloodPressureWeekChartViewModel extends BaseBloodPressureChartViewModel<List<? extends BloodPressureDateData>> {

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Boolean> _avgLineEnable;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final LiveData<BloodPressureChartBuilder> currentChartData;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final LiveData<Pair<BloodPressureChartBuilder, Boolean>> multiLiveData;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"Landroidx/lifecycle/LiveDataScope;", "Lcom/huami/bloodpressure_ui/chart/BloodPressureChartBuilder;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bloodpressure_ui.week.BloodPressureWeekChartViewModel$currentChartData$1$1", f = "BloodPressureWeekChartViewModel.kt", i = {}, l = {34}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<LiveDataScope<BloodPressureChartBuilder>, Continuation<? super Unit>, Object> {
        public int a;
        private /* synthetic */ Object b;
        public final /* synthetic */ List<BarChartVo<Number>> d;
        public final /* synthetic */ ChartDataList[] e;
        public final /* synthetic */ List<BarChartVo<Number>> f;

        /* JADX INFO: renamed from: com.huami.bloodpressure_ui.week.BloodPressureWeekChartViewModel$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0004\n\u0000\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n"}, d2 = {"", "Lcom/huami/bloodpressure_ui/chart/BarChartVo;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C0310a extends Lambda implements Function0<List<? extends BarChartVo<Number>>> {
            public final /* synthetic */ List<BarChartVo<Number>> a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0310a(List<BarChartVo<Number>> list) {
                super(0);
                this.a = list;
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final List<? extends BarChartVo<Number>> invoke() {
                return this.a;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"", "Lcom/huami/chart/data/ChartDataList;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function0<ChartDataList[]> {
            public final /* synthetic */ ChartDataList[] a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(ChartDataList[] chartDataListArr) {
                super(0);
                this.a = chartDataListArr;
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ChartDataList[] invoke() {
                return this.a;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0004\n\u0000\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n"}, d2 = {"", "Lcom/huami/bloodpressure_ui/chart/BarChartVo;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class c extends Lambda implements Function0<List<? extends BarChartVo<Number>>> {
            public final /* synthetic */ List<BarChartVo<Number>> a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(List<BarChartVo<Number>> list) {
                super(0);
                this.a = list;
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final List<? extends BarChartVo<Number>> invoke() {
                return this.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(List<BarChartVo<Number>> list, ChartDataList[] chartDataListArr, List<BarChartVo<Number>> list2, Continuation<? super a> continuation) {
            super(2, continuation);
            this.d = list;
            this.e = chartDataListArr;
            this.f = list2;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull LiveDataScope<BloodPressureChartBuilder> liveDataScope, @Nullable Continuation<? super Unit> continuation) {
            return ((a) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            a aVar = BloodPressureWeekChartViewModel.this.new a(this.d, this.e, this.f, continuation);
            aVar.b = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                LiveDataScope liveDataScope = (LiveDataScope) this.b;
                BloodPressureChartBuilder bloodPressureChartBuilder = new BloodPressureChartBuilder(new C0310a(this.d), BloodPressureWeekChartViewModel.this.get_currentTimeStamp().longValue(), TimeMode.WEEK, new b(this.e), new c(this.f), null, null, null, 0, null, 992, null);
                this.a = 1;
                if (liveDataScope.emit(bloodPressureChartBuilder, this) == coroutine_suspended) {
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\u0000\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u000e\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u0002H\u008a@"}, d2 = {"Lcom/huami/bloodpressure_ui/chart/BloodPressureChartBuilder;", "dataList", "", "kotlin.jvm.PlatformType", "avgEnable", "Lkotlin/Pair;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bloodpressure_ui.week.BloodPressureWeekChartViewModel$multiLiveData$1", f = "BloodPressureWeekChartViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function3<BloodPressureChartBuilder, Boolean, Continuation<? super Pair<? extends BloodPressureChartBuilder, ? extends Boolean>>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public /* synthetic */ Object c;

        public b(Continuation<? super b> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull BloodPressureChartBuilder bloodPressureChartBuilder, Boolean bool, @Nullable Continuation<? super Pair<BloodPressureChartBuilder, Boolean>> continuation) {
            b bVar = new b(continuation);
            bVar.b = bloodPressureChartBuilder;
            bVar.c = bool;
            return bVar.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return new Pair((BloodPressureChartBuilder) this.b, (Boolean) this.c);
        }
    }

    public BloodPressureWeekChartViewModel() {
        MutableLiveData<Boolean> mutableLiveData = new MutableLiveData<>();
        this._avgLineEnable = mutableLiveData;
        LiveData<BloodPressureChartBuilder> liveDataSwitchMap = Transformations.switchMap(get_currentChartList(), new Function<List<? extends BloodPressureDateData>, LiveData<BloodPressureChartBuilder>>() { // from class: com.huami.bloodpressure_ui.week.BloodPressureWeekChartViewModel$special$$inlined$switchMap$1
            @Override // androidx.arch.core.util.Function
            @NotNull
            public final LiveData<BloodPressureChartBuilder> apply(List<? extends BloodPressureDateData> list) {
                List<? extends BloodPressureDateData> listEmptyList = list;
                if (listEmptyList == null) {
                    listEmptyList = CollectionsKt__CollectionsKt.emptyList();
                }
                List<BarChartVo<Number>> weekBpChartDataList = BloodPressureBigDataExKt.toWeekBpChartDataList(listEmptyList, this.a.get_offset());
                List weekBpChartDataList$default = BloodPressureBigDataExKt.toWeekBpChartDataList$default(listEmptyList, 0.0f, 1, null);
                return CoroutineLiveDataKt.liveData$default((CoroutineContext) null, 0L, this.a.new a(weekBpChartDataList, BloodPressureBigDataExKt.toWeekAvgCharDataList(listEmptyList), weekBpChartDataList$default, null), 3, (Object) null);
            }
        });
        this.currentChartData = liveDataSwitchMap;
        this.multiLiveData = FlowLiveDataConversions.asLiveData$default(FlowKt.flowCombine(FlowLiveDataConversions.asFlow(liveDataSwitchMap), FlowLiveDataConversions.asFlow(mutableLiveData), new b(null)), ViewModelKt.getViewModelScope(this).getCoroutineContext().plus(Dispatchers.getMain()), 0L, 2, (Object) null);
    }

    @NotNull
    public final LiveData<BloodPressureChartBuilder> getCurrentChartData() {
        return this.currentChartData;
    }

    @NotNull
    public final LiveData<Pair<BloodPressureChartBuilder, Boolean>> getMultiLiveData() {
        return this.multiLiveData;
    }

    public final void setAvgLineEnable(@Nullable Boolean it2) {
        this._avgLineEnable.postValue(it2);
    }
}
