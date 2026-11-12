package com.xiaomi.hm.health.healthdata.ui.viewmodel;

import androidx.arch.core.util.Function;
import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.Transformations;
import androidx.p008lifecycle.ViewModelKt;
import com.amap.api.mapcore.util.hl;
import com.huami.sleep.statistic.sleepanalysis.ui.SleepAnalysisFragment;
import com.loc.z;
import com.xiaomi.hm.health.healthdata.core.AbstractHealthDataViewModel;
import com.xiaomi.hm.health.healthdata.core.dto.AvgItemDto;
import com.xiaomi.hm.health.healthdata.core.dto.BpDto;
import com.xiaomi.hm.health.healthdata.core.dto.DataItemDto;
import com.xiaomi.hm.health.healthdata.core.repo.HealthCoreDataRepo;
import com.xiaomi.hm.health.healthdata.dto.HealthDataType;
import com.xiaomi.hm.health.healthdata.dto.TimeMode;
import com.xiaomi.hm.health.healthdata.repository.ChartRepo;
import com.xiaomi.hm.health.healthdata.ui.view.BarChartBuilder;
import com.xiaomi.hm.health.healthdata.ui.view.LineChartBuilder;
import com.xiaomi.hm.health.healthdata.ui.vo.BarChartVo;
import com.xiaomi.hm.health.healthdata.ui.vo.HealthChartDataVo;
import com.xiaomi.hm.health.healthdata.ui.vo.converter.DataConverterKt;
import com.xiaomi.hm.health.healthdata.utils.HealthDataTimeUtils;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlin.text.k;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0004\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\u0006\u0010\u0014\u001a\u00020\u0011¢\u0006\u0004\b0\u00101J\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u001e\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bJ\u0016\u0010\f\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006R\u0016\u0010\u0010\u001a\u00020\r8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158\u0006@\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR!\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00158\u0006@\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001e\u0010\u001aR\u001f\u0010&\u001a\b\u0012\u0004\u0012\u00020!0 8\u0006@\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R%\u0010+\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020(0'0\u00158\u0006@\u0006¢\u0006\f\n\u0004\b)\u0010\u0018\u001a\u0004\b*\u0010\u001aR'\u0010/\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020(\u0018\u00010,0\u00158\u0006@\u0006¢\u0006\f\n\u0004\b-\u0010\u0018\u001a\u0004\b.\u0010\u001a¨\u00062"}, d2 = {"Lcom/xiaomi/hm/health/healthdata/ui/viewmodel/ChartDataViewModel;", "Lcom/xiaomi/hm/health/healthdata/core/AbstractHealthDataViewModel;", "", "getLatestValueString", "", "startMillis", "Lcom/xiaomi/hm/health/healthdata/dto/TimeMode;", SleepAnalysisFragment.TIME_MODE, "Lcom/xiaomi/hm/health/healthdata/dto/HealthDataType;", "type", "", "refreshChart", "refreshBpChart", "Lcom/xiaomi/hm/health/healthdata/core/repo/HealthCoreDataRepo;", "g", "Lcom/xiaomi/hm/health/healthdata/core/repo/HealthCoreDataRepo;", "healthDataRepo", "Lcom/xiaomi/hm/health/healthdata/repository/ChartRepo;", "h", "Lcom/xiaomi/hm/health/healthdata/repository/ChartRepo;", "chartRepo", "Landroidx/lifecycle/MutableLiveData;", "Lcom/xiaomi/hm/health/healthdata/ui/view/LineChartBuilder;", "i", "Landroidx/lifecycle/MutableLiveData;", "getChartData", "()Landroidx/lifecycle/MutableLiveData;", "chartData", "Lcom/xiaomi/hm/health/healthdata/ui/vo/HealthChartDataVo;", z.j, "getLatestValue", "latestValue", "Landroidx/lifecycle/LiveData;", "", hl.k, "Landroidx/lifecycle/LiveData;", "getLatestValueValid", "()Landroidx/lifecycle/LiveData;", "latestValueValid", "Lcom/xiaomi/hm/health/healthdata/ui/view/BarChartBuilder;", "", "l", "getBpChartData", "bpChartData", "Lcom/xiaomi/hm/health/healthdata/ui/vo/BarChartVo;", "m", "getLatestBpValue", "latestBpValue", "<init>", "(Lcom/xiaomi/hm/health/healthdata/core/repo/HealthCoreDataRepo;Lcom/xiaomi/hm/health/healthdata/repository/ChartRepo;)V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class ChartDataViewModel extends AbstractHealthDataViewModel {

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final HealthCoreDataRepo healthDataRepo;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final ChartRepo chartRepo;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<LineChartBuilder> chartData;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<HealthChartDataVo> latestValue;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    private final LiveData<Boolean> latestValueValid;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<BarChartBuilder<Number>> bpChartData;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<BarChartVo<Number>> latestBpValue;

    /* JADX INFO: renamed from: com.xiaomi.hm.health.healthdata.ui.viewmodel.ChartDataViewModel$refreshBpChart$1, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.healthdata.ui.viewmodel.ChartDataViewModel$refreshBpChart$1", f = "ChartDataViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ TimeMode b;
        public final /* synthetic */ ChartDataViewModel c;
        public final /* synthetic */ Date d;
        public final /* synthetic */ Ref.ObjectRef<List<BarChartVo<Number>>> e;
        public final /* synthetic */ Date f;

        /* JADX INFO: renamed from: com.xiaomi.hm.health.healthdata.ui.viewmodel.ChartDataViewModel$refreshBpChart$1$WhenMappings */
        @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[TimeMode.values().length];
                iArr[TimeMode.DAY.ordinal()] = 1;
                iArr[TimeMode.WEEK.ordinal()] = 2;
                iArr[TimeMode.MONTH.ordinal()] = 3;
                iArr[TimeMode.YEAR.ordinal()] = 4;
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(TimeMode timeMode, ChartDataViewModel chartDataViewModel, Date date, Ref.ObjectRef<List<BarChartVo<Number>>> objectRef, Date date2, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.b = timeMode;
            this.c = chartDataViewModel;
            this.d = date;
            this.e = objectRef;
            this.f = date2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new AnonymousClass1(this.b, this.c, this.d, this.e, this.f, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Type inference failed for: r7v11, types: [T, java.util.List] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            List<BpDto> listFindBpByDay;
            Boolean boolBoxBoolean;
            a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            int i = WhenMappings.$EnumSwitchMapping$0[this.b.ordinal()];
            if (i == 1) {
                listFindBpByDay = this.c.healthDataRepo.findBpByDay(this.d);
            } else if (i == 2) {
                listFindBpByDay = this.c.healthDataRepo.findBpByWeek(this.d);
            } else if (i == 3) {
                listFindBpByDay = this.c.healthDataRepo.findBpByMonth(this.d);
            } else {
                if (i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                listFindBpByDay = this.c.healthDataRepo.findBpByYear(this.d);
            }
            Ref.ObjectRef<List<BarChartVo<Number>>> objectRef = this.e;
            Date date = this.f;
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : listFindBpByDay) {
                Date uploadTime = ((BpDto) obj2).getUploadTime();
                boolean zBooleanValue = false;
                if (uploadTime != null && (boolBoxBoolean = Boxing.boxBoolean(uploadTime.after(date))) != null) {
                    zBooleanValue = boolBoxBoolean.booleanValue();
                }
                if (Boxing.boxBoolean(zBooleanValue).booleanValue()) {
                    arrayList.add(obj2);
                }
            }
            objectRef.element = DataConverterKt.toBpChartDataList(arrayList, this.d, this.b);
            BarChartBuilder<Number> barChartBuilder = this.c.chartRepo.getBarChartBuilder(this.d, this.b, this.e.element, HealthDataType.BLOOD_PRESSURE);
            if (barChartBuilder != null) {
                this.c.getBpChartData().postValue(barChartBuilder);
            }
            this.c.getLatestBpValue().postValue((BarChartVo) CollectionsKt.lastOrNull((List) this.e.element));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.hm.health.healthdata.ui.viewmodel.ChartDataViewModel$refreshChart$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.healthdata.ui.viewmodel.ChartDataViewModel$refreshChart$1", f = "ChartDataViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C16221 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ Ref.ObjectRef<List<HealthChartDataVo>> b;
        public final /* synthetic */ TimeMode c;
        public final /* synthetic */ ChartDataViewModel d;
        public final /* synthetic */ HealthDataType e;
        public final /* synthetic */ Date f;
        public final /* synthetic */ Date g;

        /* JADX INFO: renamed from: com.xiaomi.hm.health.healthdata.ui.viewmodel.ChartDataViewModel$refreshChart$1$WhenMappings */
        @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[TimeMode.values().length];
                iArr[TimeMode.DAY.ordinal()] = 1;
                iArr[TimeMode.WEEK.ordinal()] = 2;
                iArr[TimeMode.MONTH.ordinal()] = 3;
                iArr[TimeMode.YEAR.ordinal()] = 4;
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16221(Ref.ObjectRef<List<HealthChartDataVo>> objectRef, TimeMode timeMode, ChartDataViewModel chartDataViewModel, HealthDataType healthDataType, Date date, Date date2, Continuation<? super C16221> continuation) {
            super(2, continuation);
            this.b = objectRef;
            this.c = timeMode;
            this.d = chartDataViewModel;
            this.e = healthDataType;
            this.f = date;
            this.g = date2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C16221(this.b, this.c, this.d, this.e, this.f, this.g, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C16221) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Boolean boolBoxBoolean;
            T chartDataList;
            Object obj2;
            a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Ref.ObjectRef<List<HealthChartDataVo>> objectRef = this.b;
            int i = WhenMappings.$EnumSwitchMapping$0[this.c.ordinal()];
            if (i == 1) {
                List<DataItemDto> listFindByDay = this.d.healthDataRepo.findByDay(this.e, this.f);
                Date date = this.g;
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : listFindByDay) {
                    Date uploadTime = ((DataItemDto) obj3).getUploadTime();
                    boolean zBooleanValue = false;
                    if (uploadTime != null && (boolBoxBoolean = Boxing.boxBoolean(uploadTime.after(date))) != null) {
                        zBooleanValue = boolBoxBoolean.booleanValue();
                    }
                    if (Boxing.boxBoolean(zBooleanValue).booleanValue()) {
                        arrayList.add(obj3);
                    }
                }
                chartDataList = DataConverterKt.toChartDataList(arrayList, this.f);
            } else if (i == 2) {
                List<AvgItemDto> listFindAvgByWeek = this.d.healthDataRepo.findAvgByWeek(this.e, this.f);
                Date date2 = this.g;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj4 : listFindAvgByWeek) {
                    if (Boxing.boxBoolean(((AvgItemDto) obj4).getUploadTime().after(date2)).booleanValue()) {
                        arrayList2.add(obj4);
                    }
                }
                chartDataList = DataConverterKt.toChartDataList(arrayList2, this.c);
            } else if (i == 3) {
                List<AvgItemDto> listFindAvgByMonth = this.d.healthDataRepo.findAvgByMonth(this.e, this.f);
                Date date3 = this.g;
                ArrayList arrayList3 = new ArrayList();
                for (Object obj5 : listFindAvgByMonth) {
                    if (Boxing.boxBoolean(((AvgItemDto) obj5).getUploadTime().after(date3)).booleanValue()) {
                        arrayList3.add(obj5);
                    }
                }
                chartDataList = DataConverterKt.toChartDataList(arrayList3, this.c);
            } else {
                if (i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                List<AvgItemDto> listFindAvgByYear = this.d.healthDataRepo.findAvgByYear(this.e, this.f);
                Date date4 = this.g;
                ArrayList arrayList4 = new ArrayList();
                for (Object obj6 : listFindAvgByYear) {
                    if (Boxing.boxBoolean(((AvgItemDto) obj6).getUploadTime().after(date4)).booleanValue()) {
                        arrayList4.add(obj6);
                    }
                }
                chartDataList = DataConverterKt.toChartDataList(arrayList4, this.c);
            }
            objectRef.element = chartDataList;
            this.d.getChartData().postValue(this.d.chartRepo.getChartBuilder(this.f, this.c, this.b.element, this.e));
            LiveData latestValue = this.d.getLatestValue();
            Iterator<T> it2 = this.b.element.iterator();
            if (it2.hasNext()) {
                Object next = it2.next();
                if (it2.hasNext()) {
                    Integer numBoxInt = Boxing.boxInt(((HealthChartDataVo) next).getIndex());
                    do {
                        Object next2 = it2.next();
                        Integer numBoxInt2 = Boxing.boxInt(((HealthChartDataVo) next2).getIndex());
                        if (numBoxInt.compareTo(numBoxInt2) < 0) {
                            next = next2;
                            numBoxInt = numBoxInt2;
                        }
                    } while (it2.hasNext());
                }
                obj2 = next;
            } else {
                obj2 = null;
            }
            latestValue.postValue(obj2);
            return Unit.INSTANCE;
        }
    }

    public ChartDataViewModel(@NotNull HealthCoreDataRepo healthCoreDataRepo, @NotNull ChartRepo chartRepo) {
        super(healthCoreDataRepo, null, null, 6, null);
        this.healthDataRepo = healthCoreDataRepo;
        this.chartRepo = chartRepo;
        this.chartData = new MutableLiveData<>();
        MutableLiveData<HealthChartDataVo> mutableLiveData = new MutableLiveData<>();
        this.latestValue = mutableLiveData;
        this.latestValueValid = Transformations.map(mutableLiveData, new Function<HealthChartDataVo, Boolean>() { // from class: com.xiaomi.hm.health.healthdata.ui.viewmodel.ChartDataViewModel$special$$inlined$map$1
            @Override // androidx.arch.core.util.Function
            public final Boolean apply(HealthChartDataVo healthChartDataVo) {
                String value;
                Float floatOrNull;
                HealthChartDataVo healthChartDataVo2 = healthChartDataVo;
                float fFloatValue = Float.NaN;
                if (healthChartDataVo2 != null && (value = healthChartDataVo2.getValue()) != null && (floatOrNull = k.toFloatOrNull(value)) != null) {
                    fFloatValue = floatOrNull.floatValue();
                }
                return Boolean.valueOf(!Float.isNaN(fFloatValue));
            }
        });
        this.bpChartData = new MutableLiveData<>();
        this.latestBpValue = new MutableLiveData<>();
    }

    @NotNull
    public final MutableLiveData<BarChartBuilder<Number>> getBpChartData() {
        return this.bpChartData;
    }

    @NotNull
    public final MutableLiveData<LineChartBuilder> getChartData() {
        return this.chartData;
    }

    @NotNull
    public final MutableLiveData<BarChartVo<Number>> getLatestBpValue() {
        return this.latestBpValue;
    }

    @NotNull
    public final MutableLiveData<HealthChartDataVo> getLatestValue() {
        return this.latestValue;
    }

    @Nullable
    public final String getLatestValueString() {
        HealthChartDataVo value = this.latestValue.getValue();
        if (value == null) {
            return null;
        }
        return value.getValue();
    }

    @NotNull
    public final LiveData<Boolean> getLatestValueValid() {
        return this.latestValueValid;
    }

    public final void refreshBpChart(long startMillis, @NotNull TimeMode timeMode) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(startMillis);
        e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new AnonymousClass1(timeMode, this, calendar.getTime(), new Ref.ObjectRef(), new Date(HealthDataTimeUtils.INSTANCE.getUserCreateTimeStamp()), null), 2, null);
    }

    public final void refreshChart(long startMillis, @NotNull TimeMode timeMode, @NotNull HealthDataType type) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(startMillis);
        Date time = calendar.getTime();
        e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new C16221(new Ref.ObjectRef(), timeMode, this, type, time, new Date(HealthDataTimeUtils.INSTANCE.getUserCreateTimeStamp()), null), 2, null);
    }
}
