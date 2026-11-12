package com.huami.heartrate.viewmodel;

import android.util.Pair;
import android.util.SparseArray;
import androidx.p008lifecycle.FlowLiveDataConversions;
import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.ViewModel;
import androidx.p008lifecycle.ViewModelKt;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.chart.data.ChartData;
import com.huami.heartrate.chart.HandleDataKt;
import com.huami.heartrate.koin.HeartRateScopeKt;
import com.huami.heartrate.repository.entity.HeartRateEntity;
import com.huami.heartrate.usecase.GetLocalMeasureHRDataUseCase;
import com.huami.heartrate.usecase.GetLocalWholeDayHRDataUseCase;
import com.huami.heartrate.usecase.QueryRestHeartRateByDayUseCase;
import com.huami.heartrate.utils.ExtensionUtilsKt;
import com.huami.heartrate.utils.HeartRateTimeUtils;
import com.huami.mifit.sportlib.common.DataTypeSource;
import com.loc.z;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.scope.Scope;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u0000 H2\u00020\u00012\u00020\u0002:\u0001HB\u000f\u0012\u0006\u0010E\u001a\u00020\u0005¢\u0006\u0004\bF\u0010GJ\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u000e\u0010\t\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005JG\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\n27\b\u0002\u0010\u0015\u001a1\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0016\u0012\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u0012\u0012\u0004\u0012\u00020\u00140\u0011\u0018\u00010\fJ\u000e\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0005R\u001d\u0010\u001b\u001a\u00020\r8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010\u001f\u001a\u00020\u001c8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0018\u001a\u0004\b\u001d\u0010\u001eR\u001d\u0010#\u001a\u00020 8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b!\u0010\"R\u001d\u0010(\u001a\u00020$8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010\u0018\u001a\u0004\b&\u0010'R/\u0010-\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\r0*0)8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\u0018\u001a\u0004\b+\u0010,R\u001c\u0010/\u001a\b\u0012\u0004\u0012\u00020\r0)8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010.R\"\u00101\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120)8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010.R)\u00105\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u000203020)8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010\u0018\u001a\u0004\b4\u0010,R#\u00106\u001a\b\u0012\u0004\u0012\u00020\u00140)8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b4\u0010\u0018\u001a\u0004\b0\u0010,R#\u00108\u001a\b\u0012\u0004\u0012\u00020\u00050)8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b7\u0010,R%\u0010<\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\r0*098F@\u0006¢\u0006\u0006\u001a\u0004\b:\u0010;R\u0019\u0010>\u001a\b\u0012\u0004\u0012\u00020\r098F@\u0006¢\u0006\u0006\u001a\u0004\b=\u0010;R\u001f\u0010@\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u0012098F@\u0006¢\u0006\u0006\u001a\u0004\b?\u0010;R\u0019\u0010B\u001a\b\u0012\u0004\u0012\u00020\u0014098F@\u0006¢\u0006\u0006\u001a\u0004\bA\u0010;R\u001f\u0010D\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020302098F@\u0006¢\u0006\u0006\u001a\u0004\bC\u0010;¨\u0006I"}, d2 = {"Lcom/huami/heartrate/viewmodel/LocalHRDataViewModel;", "Landroidx/lifecycle/ViewModel;", "Lorg/koin/core/component/KoinComponent;", "", z.j, "", "date", "loadData", "a", "setDataDate", "", "dateFrom", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "rawArray", "Landroid/util/Pair;", "Landroid/util/SparseArray;", "Lcom/huami/chart/data/ChartData;", "", "convertOnChartData", "fetchHRData", "refreshMeasureHeartRate", "Lkotlin/Lazy;", "b", "()[B", "defaultWholeDayHr", "Lcom/huami/heartrate/usecase/GetLocalMeasureHRDataUseCase;", "c", "()Lcom/huami/heartrate/usecase/GetLocalMeasureHRDataUseCase;", "getLocalMeasureHRDataUseCase", "Lcom/huami/heartrate/usecase/GetLocalWholeDayHRDataUseCase;", "e", "()Lcom/huami/heartrate/usecase/GetLocalWholeDayHRDataUseCase;", "getLocalWholeDayHRDataUseCase", "Lcom/huami/heartrate/usecase/QueryRestHeartRateByDayUseCase;", GoogleApiAvailabilityLight.a, "h", "()Lcom/huami/heartrate/usecase/QueryRestHeartRateByDayUseCase;", "restHrUseCase", "Landroidx/lifecycle/MutableLiveData;", "", "f", "()Landroidx/lifecycle/MutableLiveData;", "hrRawDataMutableData", "Landroidx/lifecycle/MutableLiveData;", "hrMergedRawDataMutableLiveData", "g", "hrChartDataMutableLiveData", "", "Lcom/huami/heartrate/repository/entity/HeartRateEntity;", "i", "_manageHrRawDataMutableData", "restHeartRateMutableLiveData", "getDateLiveData", "dateLiveData", "Landroidx/lifecycle/LiveData;", "getHrRawDataLiveData", "()Landroidx/lifecycle/LiveData;", "hrRawDataLiveData", "getHrMergedDataLiveData", "hrMergedDataLiveData", "getHrChartDataLiveData", "hrChartDataLiveData", "getRestHeartRateLiveData", "restHeartRateLiveData", "getMeasureHrRawData", "measureHrRawData", "userId", "<init>", "(Ljava/lang/String;)V", "Companion", "heartrate_release"}, k = 1, mv = {1, 5, 1})
public final class LocalHRDataViewModel extends ViewModel implements KoinComponent {

    @NotNull
    private static final String k = "LocalHRDataViewModel";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy defaultWholeDayHr = LazyKt__LazyJVMKt.lazy(c.a);

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy getLocalMeasureHRDataUseCase;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy getLocalWholeDayHRDataUseCase;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Lazy restHrUseCase;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final Lazy hrRawDataMutableData;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<byte[]> hrMergedRawDataMutableLiveData;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<SparseArray<ChartData>> hrChartDataMutableLiveData;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final Lazy _manageHrRawDataMutableData;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final Lazy restHeartRateMutableLiveData;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    private final Lazy dateLiveData;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n"}, d2 = {"Landroidx/lifecycle/MutableLiveData;", "", "Lcom/huami/heartrate/repository/entity/HeartRateEntity;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<MutableLiveData<List<? extends HeartRateEntity>>> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MutableLiveData<List<HeartRateEntity>> getA() {
            return new MutableLiveData<>();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Landroidx/lifecycle/MutableLiveData;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<MutableLiveData<String>> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MutableLiveData<String> getA() {
            return new MutableLiveData<>();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0012\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<byte[]> {
        public static final c a = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final byte[] getA() {
            ArrayList arrayList = new ArrayList();
            int i = 0;
            do {
                i++;
                arrayList.add((byte) -1);
            } while (i <= 1440);
            return CollectionsKt___CollectionsKt.toByteArray(arrayList);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.heartrate.viewmodel.LocalHRDataViewModel$fetchHRData$1", f = "LocalHRDataViewModel.kt", i = {0, 1}, l = {152, 153}, m = "invokeSuspend", n = {"getMeasureHrData", "wholeDayHrData"}, s = {"L$0", "L$0"})
    public static final class d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        private /* synthetic */ Object b;
        public final /* synthetic */ long d;
        public final /* synthetic */ Function1<byte[], Pair<SparseArray<ChartData>, Integer>> e;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "Lcom/huami/heartrate/repository/entity/HeartRateEntity;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.heartrate.viewmodel.LocalHRDataViewModel$fetchHRData$1$getMeasureHrData$1", f = "LocalHRDataViewModel.kt", i = {}, l = {146}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends HeartRateEntity>>, Object> {
            public int a;
            public final /* synthetic */ LocalHRDataViewModel b;
            public final /* synthetic */ long c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(LocalHRDataViewModel localHRDataViewModel, long j, Continuation<? super a> continuation) {
                super(2, continuation);
                this.b = localHRDataViewModel;
                this.c = j;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new a(this.b, this.c, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends HeartRateEntity>> continuation) {
                return invoke2(coroutineScope, (Continuation<? super List<HeartRateEntity>>) continuation);
            }

            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super List<HeartRateEntity>> continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                int i = this.a;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    GetLocalMeasureHRDataUseCase getLocalMeasureHRDataUseCaseC = this.b.c();
                    HeartRateTimeUtils heartRateTimeUtils = HeartRateTimeUtils.INSTANCE;
                    long jMillsToSecond = ExtensionUtilsKt.millsToSecond(heartRateTimeUtils.getDayStartTime(this.c));
                    long jMillsToSecond2 = ExtensionUtilsKt.millsToSecond(heartRateTimeUtils.getDayEndTime(this.c));
                    this.a = 1;
                    obj = getLocalMeasureHRDataUseCaseC.getLocalMeasureHRData(jMillsToSecond, jMillsToSecond2, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return obj;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0012\n\u0000\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.heartrate.viewmodel.LocalHRDataViewModel$fetchHRData$1$getWholeDayHrData$1", f = "LocalHRDataViewModel.kt", i = {}, l = {142}, m = "invokeSuspend", n = {}, s = {})
        public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Map<String, ? extends byte[]>>, Object> {
            public int a;
            public final /* synthetic */ LocalHRDataViewModel b;
            public final /* synthetic */ long c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(LocalHRDataViewModel localHRDataViewModel, long j, Continuation<? super b> continuation) {
                super(2, continuation);
                this.b = localHRDataViewModel;
                this.c = j;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new b(this.b, this.c, continuation);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Map<String, ? extends byte[]>> continuation) {
                return invoke2(coroutineScope, (Continuation<? super Map<String, byte[]>>) continuation);
            }

            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Map<String, byte[]>> continuation) {
                return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                int i = this.a;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    GetLocalWholeDayHRDataUseCase getLocalWholeDayHRDataUseCaseE = this.b.e();
                    long j = this.c;
                    this.a = 1;
                    obj = getLocalWholeDayHRDataUseCaseE.getLocalWholeDayHRData(j, j, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return obj;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(long j, Function1<? super byte[], ? extends Pair<SparseArray<ChartData>, Integer>> function1, Continuation<? super d> continuation) {
            super(2, continuation);
            this.d = j;
            this.e = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            d dVar = LocalHRDataViewModel.this.new d(this.d, this.e, continuation);
            dVar.b = obj;
            return dVar;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:24:0x007b  */
        /* JADX WARN: Code duplicated, block: B:26:0x007e  */
        /* JADX WARN: Code duplicated, block: B:32:0x008a  */
        /* JADX WARN: Code duplicated, block: B:33:0x0099  */
        /* JADX WARN: Code duplicated, block: B:36:0x00a5  */
        /* JADX WARN: Code duplicated, block: B:38:0x00b6  */
        /* JADX WARN: Code duplicated, block: B:42:0x00ce  */
        /* JADX WARN: Code duplicated, block: B:48:0x00ea  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Deferred deferred;
            Map map;
            List listEmptyList;
            boolean z;
            byte[] bArrB;
            LocalHRDataViewModel localHRDataViewModel;
            Function1<byte[], Pair<SparseArray<ChartData>, Integer>> function1;
            SparseArray sparseArray;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            boolean z2 = true;
            if (i != 0) {
                if (i == 1) {
                    deferred = (Deferred) this.b;
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    map = (Map) this.b;
                    ResultKt.throwOnFailure(obj);
                }
                listEmptyList = (List) obj;
                if (map != null || map.isEmpty()) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    if (listEmptyList != null && !listEmptyList.isEmpty()) {
                        z2 = false;
                    }
                    if (z2) {
                        LocalHRDataViewModel.this.hrChartDataMutableLiveData.postValue(new SparseArray(0));
                    } else {
                        LocalHRDataViewModel.this.f().postValue(map);
                        if (map != null) {
                        }
                        if (bArrB == null) {
                            bArrB = LocalHRDataViewModel.this.b();
                        }
                        byte[] bArrMergeMeasureToWholeDay = HandleDataKt.mergeMeasureToWholeDay(bArrB, listEmptyList);
                        localHRDataViewModel = LocalHRDataViewModel.this;
                        function1 = this.e;
                        localHRDataViewModel.hrMergedRawDataMutableLiveData.postValue(bArrMergeMeasureToWholeDay);
                        if (function1 != null) {
                            localHRDataViewModel.hrChartDataMutableLiveData.postValue(sparseArray);
                        }
                    }
                } else {
                    LocalHRDataViewModel.this.f().postValue(map);
                    bArrB = map != null ? (byte[]) map.get(HeartRateTimeUtils.INSTANCE.getChinaDateString(this.d)) : null;
                    if (bArrB == null) {
                        bArrB = LocalHRDataViewModel.this.b();
                    }
                    byte[] bArrMergeMeasureToWholeDay2 = HandleDataKt.mergeMeasureToWholeDay(bArrB, listEmptyList);
                    localHRDataViewModel = LocalHRDataViewModel.this;
                    function1 = this.e;
                    localHRDataViewModel.hrMergedRawDataMutableLiveData.postValue(bArrMergeMeasureToWholeDay2);
                    if (function1 != null && (sparseArray = (SparseArray) function1.invoke(bArrMergeMeasureToWholeDay2).first) != null) {
                        localHRDataViewModel.hrChartDataMutableLiveData.postValue(sparseArray);
                    }
                }
                MutableLiveData mutableLiveDataI = LocalHRDataViewModel.this.i();
                if (listEmptyList == null) {
                    listEmptyList = CollectionsKt__CollectionsKt.emptyList();
                }
                mutableLiveDataI.postValue(listEmptyList);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.b;
            Deferred deferredB = kotlinx.coroutines.e.b(coroutineScope, null, null, new b(LocalHRDataViewModel.this, this.d, null), 3, null);
            Deferred deferredB2 = kotlinx.coroutines.e.b(coroutineScope, null, null, new a(LocalHRDataViewModel.this, this.d, null), 3, null);
            this.b = deferredB2;
            this.a = 1;
            Object objAwait = deferredB.await(this);
            if (objAwait == coroutine_suspended) {
                return coroutine_suspended;
            }
            deferred = deferredB2;
            obj = objAwait;
            Map map2 = (Map) obj;
            this.b = map2;
            this.a = 2;
            Object objAwait2 = deferred.await(this);
            if (objAwait2 == coroutine_suspended) {
                return coroutine_suspended;
            }
            map = map2;
            obj = objAwait2;
            listEmptyList = (List) obj;
            if (map != null) {
                z = true;
            } else {
                z = true;
            }
            if (z) {
                LocalHRDataViewModel.this.f().postValue(map);
                if (map != null) {
                }
                if (bArrB == null) {
                    bArrB = LocalHRDataViewModel.this.b();
                }
                byte[] bArrMergeMeasureToWholeDay3 = HandleDataKt.mergeMeasureToWholeDay(bArrB, listEmptyList);
                localHRDataViewModel = LocalHRDataViewModel.this;
                function1 = this.e;
                localHRDataViewModel.hrMergedRawDataMutableLiveData.postValue(bArrMergeMeasureToWholeDay3);
                if (function1 != null) {
                    localHRDataViewModel.hrChartDataMutableLiveData.postValue(sparseArray);
                }
            } else {
                if (listEmptyList != null) {
                    z2 = false;
                }
                if (z2) {
                    LocalHRDataViewModel.this.hrChartDataMutableLiveData.postValue(new SparseArray(0));
                } else {
                    LocalHRDataViewModel.this.f().postValue(map);
                    if (map != null) {
                    }
                    if (bArrB == null) {
                        bArrB = LocalHRDataViewModel.this.b();
                    }
                    byte[] bArrMergeMeasureToWholeDay4 = HandleDataKt.mergeMeasureToWholeDay(bArrB, listEmptyList);
                    localHRDataViewModel = LocalHRDataViewModel.this;
                    function1 = this.e;
                    localHRDataViewModel.hrMergedRawDataMutableLiveData.postValue(bArrMergeMeasureToWholeDay4);
                    if (function1 != null) {
                        localHRDataViewModel.hrChartDataMutableLiveData.postValue(sparseArray);
                    }
                }
            }
            MutableLiveData mutableLiveDataI2 = LocalHRDataViewModel.this.i();
            if (listEmptyList == null) {
                listEmptyList = CollectionsKt__CollectionsKt.emptyList();
            }
            mutableLiveDataI2.postValue(listEmptyList);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.heartrate.viewmodel.LocalHRDataViewModel$fetchRestHeartRateByDate$1", f = "LocalHRDataViewModel.kt", i = {}, l = {DataTypeSource.SPORT_TYPE_DISCO}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public Object a;
        public int b;
        public final /* synthetic */ String d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, Continuation<? super e> continuation) {
            super(2, continuation);
            this.d = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return LocalHRDataViewModel.this.new e(this.d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((e) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            MutableLiveData mutableLiveData;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                MutableLiveData mutableLiveDataG = LocalHRDataViewModel.this.g();
                QueryRestHeartRateByDayUseCase queryRestHeartRateByDayUseCaseH = LocalHRDataViewModel.this.h();
                String str = this.d;
                this.a = mutableLiveDataG;
                this.b = 1;
                Object restHeartRateByDate = queryRestHeartRateByDayUseCaseH.getRestHeartRateByDate(str, this);
                if (restHeartRateByDate == coroutine_suspended) {
                    return coroutine_suspended;
                }
                mutableLiveData = mutableLiveDataG;
                obj = restHeartRateByDate;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                mutableLiveData = (MutableLiveData) this.a;
                ResultKt.throwOnFailure(obj);
            }
            mutableLiveData.postValue(obj);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0012\n\u0000\u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00010\u0000H\n"}, d2 = {"Landroidx/lifecycle/MutableLiveData;", "", "", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<MutableLiveData<Map<String, ? extends byte[]>>> {
        public static final f a = new f();

        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MutableLiveData<Map<String, byte[]>> getA() {
            return new MutableLiveData<>();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.heartrate.viewmodel.LocalHRDataViewModel$observeWholeHrDataChanged$1", f = "LocalHRDataViewModel.kt", i = {}, l = {121}, m = "invokeSuspend", n = {}, s = {})
    public static final class g extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0006\u001a\u001e\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00000\u0000\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00030\u00030\u00052\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u008a@"}, d2 = {"", "kotlin.jvm.PlatformType", "date", "", "isWholeDataEmpty", "Landroid/util/Pair;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.heartrate.viewmodel.LocalHRDataViewModel$observeWholeHrDataChanged$1$1", f = "LocalHRDataViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function3<String, Boolean, Continuation<? super Pair<String, Boolean>>, Object> {
            public int a;
            public /* synthetic */ Object b;
            public /* synthetic */ boolean c;

            public a(Continuation<? super a> continuation) {
                super(3, continuation);
            }

            @Nullable
            public final Object a(String str, boolean z, @Nullable Continuation<? super Pair<String, Boolean>> continuation) {
                a aVar = new a(continuation);
                aVar.b = str;
                aVar.c = z;
                return aVar.invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Object invoke(String str, Boolean bool, Continuation<? super Pair<String, Boolean>> continuation) {
                return a(str, bool.booleanValue(), continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                if (this.a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return new Pair((String) this.b, Boxing.boxBoolean(this.c));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0006\u001a\u00020\u00052\"\u0010\u0004\u001a\u001e\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00030\u00030\u0000H\u008a@"}, d2 = {"Landroid/util/Pair;", "", "kotlin.jvm.PlatformType", "", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.heartrate.viewmodel.LocalHRDataViewModel$observeWholeHrDataChanged$1$2", f = "LocalHRDataViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class b extends SuspendLambda implements Function2<Pair<String, Boolean>, Continuation<? super Unit>, Object> {
            public int a;
            public /* synthetic */ Object b;
            public final /* synthetic */ LocalHRDataViewModel c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(LocalHRDataViewModel localHRDataViewModel, Continuation<? super b> continuation) {
                super(2, continuation);
                this.c = localHRDataViewModel;
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@NotNull Pair<String, Boolean> pair, @Nullable Continuation<? super Unit> continuation) {
                return ((b) create(pair, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                b bVar = new b(this.c, continuation);
                bVar.b = obj;
                return bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                if (this.a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.c.loadData((String) ((Pair) this.b).first);
                return Unit.INSTANCE;
            }
        }

        public g(Continuation<? super g> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return LocalHRDataViewModel.this.new g(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((g) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowFlowOn = FlowKt.flowOn(FlowKt.distinctUntilChanged(FlowKt.flowCombine(FlowLiveDataConversions.asFlow(LocalHRDataViewModel.this.getDateLiveData()), LocalHRDataViewModel.this.e().observeWholeDayHrDataChanged((String) LocalHRDataViewModel.this.getDateLiveData().getValue()), new a(null))), Dispatchers.getIO());
                b bVar = new b(LocalHRDataViewModel.this, null);
                this.a = 1;
                if (FlowKt.collectLatest(flowFlowOn, bVar, this) == coroutine_suspended) {
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.heartrate.viewmodel.LocalHRDataViewModel$refreshMeasureHeartRate$1", f = "LocalHRDataViewModel.kt", i = {}, l = {193}, m = "invokeSuspend", n = {}, s = {})
    public static final class h extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ long c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(long j, Continuation<? super h> continuation) {
            super(2, continuation);
            this.c = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return LocalHRDataViewModel.this.new h(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((h) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                GetLocalMeasureHRDataUseCase getLocalMeasureHRDataUseCaseC = LocalHRDataViewModel.this.c();
                HeartRateTimeUtils heartRateTimeUtils = HeartRateTimeUtils.INSTANCE;
                long jMillsToSecond = ExtensionUtilsKt.millsToSecond(heartRateTimeUtils.getDayStartTime(this.c));
                long jMillsToSecond2 = ExtensionUtilsKt.millsToSecond(heartRateTimeUtils.getDayEndTime(this.c));
                this.a = 1;
                obj = getLocalMeasureHRDataUseCaseC.getLocalMeasureHRData(jMillsToSecond, jMillsToSecond2, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            List listEmptyList = (List) obj;
            MutableLiveData mutableLiveDataI = LocalHRDataViewModel.this.i();
            if (listEmptyList == null) {
                listEmptyList = CollectionsKt__CollectionsKt.emptyList();
            }
            mutableLiveDataI.postValue(listEmptyList);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Landroidx/lifecycle/MutableLiveData;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class i extends Lambda implements Function0<MutableLiveData<Integer>> {
        public static final i a = new i();

        public i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MutableLiveData<Integer> getA() {
            return new MutableLiveData<>();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LocalHRDataViewModel(@NotNull String str) {
        final Scope hrScopeByUserId = HeartRateScopeKt.getHrScopeByUserId(str);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.SYNCHRONIZED;
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.getLocalMeasureHRDataUseCase = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<GetLocalMeasureHRDataUseCase>() { // from class: com.huami.heartrate.viewmodel.LocalHRDataViewModel$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [com.huami.heartrate.usecase.GetLocalMeasureHRDataUseCase, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final GetLocalMeasureHRDataUseCase getA() {
                return hrScopeByUserId.get(Reflection.getOrCreateKotlinClass(GetLocalMeasureHRDataUseCase.class), qualifier, objArr);
            }
        });
        final Scope hrScopeByUserId2 = HeartRateScopeKt.getHrScopeByUserId(str);
        final Object[] objArr2 = 0 == true ? 1 : 0;
        final Object[] objArr3 = 0 == true ? 1 : 0;
        this.getLocalWholeDayHRDataUseCase = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<GetLocalWholeDayHRDataUseCase>() { // from class: com.huami.heartrate.viewmodel.LocalHRDataViewModel$special$$inlined$inject$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [com.huami.heartrate.usecase.GetLocalWholeDayHRDataUseCase, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final GetLocalWholeDayHRDataUseCase getA() {
                return hrScopeByUserId2.get(Reflection.getOrCreateKotlinClass(GetLocalWholeDayHRDataUseCase.class), objArr2, objArr3);
            }
        });
        final Scope hrScopeByUserId3 = HeartRateScopeKt.getHrScopeByUserId(str);
        final Object[] objArr4 = 0 == true ? 1 : 0;
        final Object[] objArr5 = 0 == true ? 1 : 0;
        this.restHrUseCase = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<QueryRestHeartRateByDayUseCase>() { // from class: com.huami.heartrate.viewmodel.LocalHRDataViewModel$special$$inlined$inject$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [com.huami.heartrate.usecase.QueryRestHeartRateByDayUseCase, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final QueryRestHeartRateByDayUseCase getA() {
                return hrScopeByUserId3.get(Reflection.getOrCreateKotlinClass(QueryRestHeartRateByDayUseCase.class), objArr4, objArr5);
            }
        });
        this.hrRawDataMutableData = LazyKt__LazyJVMKt.lazy(f.a);
        this.hrMergedRawDataMutableLiveData = new MutableLiveData<>();
        this.hrChartDataMutableLiveData = new MutableLiveData<>();
        this._manageHrRawDataMutableData = LazyKt__LazyJVMKt.lazy(a.a);
        this.restHeartRateMutableLiveData = LazyKt__LazyJVMKt.lazy(i.a);
        this.dateLiveData = LazyKt__LazyJVMKt.lazy(b.a);
    }

    private final void a(String date) {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new e(date, null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final byte[] b() {
        return (byte[]) this.defaultWholeDayHr.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final GetLocalMeasureHRDataUseCase c() {
        return (GetLocalMeasureHRDataUseCase) this.getLocalMeasureHRDataUseCase.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final GetLocalWholeDayHRDataUseCase e() {
        return (GetLocalWholeDayHRDataUseCase) this.getLocalWholeDayHRDataUseCase.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MutableLiveData<Map<String, byte[]>> f() {
        return (MutableLiveData) this.hrRawDataMutableData.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void fetchHRData$default(LocalHRDataViewModel localHRDataViewModel, long j, Function1 function1, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            function1 = null;
        }
        localHRDataViewModel.fetchHRData(j, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MutableLiveData<Integer> g() {
        return (MutableLiveData) this.restHeartRateMutableLiveData.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MutableLiveData<String> getDateLiveData() {
        return (MutableLiveData) this.dateLiveData.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final QueryRestHeartRateByDayUseCase h() {
        return (QueryRestHeartRateByDayUseCase) this.restHrUseCase.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MutableLiveData<List<HeartRateEntity>> i() {
        return (MutableLiveData) this._manageHrRawDataMutableData.getValue();
    }

    private final void j() {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new g(null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void loadData(String date) {
        a(date);
        Date date2 = HeartRateTimeUtils.INSTANCE.parseDate(date);
        Long lValueOf = date2 == null ? null : Long.valueOf(date2.getTime());
        fetchHRData(lValueOf == null ? System.currentTimeMillis() : lValueOf.longValue(), HandleDataKt.getWholeDayHeartRateDataConvert());
    }

    public final void fetchHRData(long dateFrom, @Nullable Function1<? super byte[], ? extends Pair<SparseArray<ChartData>, Integer>> convertOnChartData) {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new d(dateFrom, convertOnChartData, null), 2, null);
    }

    @NotNull
    public final LiveData<SparseArray<ChartData>> getHrChartDataLiveData() {
        return this.hrChartDataMutableLiveData;
    }

    @NotNull
    public final LiveData<byte[]> getHrMergedDataLiveData() {
        return this.hrMergedRawDataMutableLiveData;
    }

    @NotNull
    public final LiveData<Map<String, byte[]>> getHrRawDataLiveData() {
        return f();
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    @NotNull
    public final LiveData<List<HeartRateEntity>> getMeasureHrRawData() {
        return i();
    }

    @NotNull
    public final LiveData<Integer> getRestHeartRateLiveData() {
        return g();
    }

    public final void refreshMeasureHeartRate(@NotNull String dateFrom) {
        Date date = HeartRateTimeUtils.INSTANCE.parseDate(dateFrom);
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new h(date == null ? 0L : date.getTime(), null), 2, null);
    }

    public final void setDataDate(@NotNull String date) {
        getDateLiveData().setValue(date);
        j();
    }
}
