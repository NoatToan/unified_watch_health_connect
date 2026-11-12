package com.huami.sleep.daysleep.daydetail.repo;

import androidx.arch.core.util.Function;
import androidx.p008lifecycle.FlowLiveDataConversions;
import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.Transformations;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.chart.data.ChartDataList;
import com.huami.sky.service.RelaxData;
import com.huami.sky.service.RelaxScore;
import com.huami.sleep.datasource.ISleepDayDataSource;
import com.huami.sleep.daysleep.daydetail.vo.SleepCompareModel;
import com.huami.sleep.daysleep.quotient.SleepQuotientConvertKt;
import com.huami.sleep.daysleep.quotient.SleepQuotientDto;
import com.huami.sleep.daysleep.quotient.SleepQuotientParam;
import com.huami.sleep.daysleep.quotient.SleepQuotientProvider;
import com.huami.sleep.daysleep.tonality.ITonalityDataInterface;
import com.huami.sleep.daysleep.tonality.bean.QueryTonalityBean;
import com.huami.sleep.daysleep.tonality.bean.SleepTonalityBean;
import com.huami.sleep.ext.KoinExtKt;
import com.huami.sleep.koin.IDeviceManager;
import com.huami.sleep.model.BreathQualityRiskLevel;
import com.huami.sleep.repo.IBreathQualityRepo;
import com.huami.sleep.statistic.dto.TimeMode;
import com.huami.sleep.statistic.dto.TimeParam;
import com.huami.sleep.util.ChartTransmitUtil;
import com.huami.sleep.util.SleepTimeUtil;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.dataprocess.SleepInfo;
import com.xiaomi.hm.health.dataprocess.SportDay;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.ExperimentalCoroutinesApi;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u00103\u001a\u000201\u0012\u0006\u00106\u001a\u000204\u0012\u0006\u00109\u001a\u000207¢\u0006\u0004\b:\u0010;JR\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u0004H\u0002J0\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00112\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000bH\u0002J*\u0010\u0014\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u00130\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J,\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00132\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0018H\u0002J\b\u0010\u001a\u001a\u00020\tH\u0016J \u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u00182\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001bH\u0016J\u001e\u0010 \u001a\b\u0012\u0004\u0012\u00020\t0\u00182\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001bH\u0016J;\u0010#\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0\u000b0\u00130!2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001bH\u0097@ø\u0001\u0000¢\u0006\u0004\b#\u0010$J?\u0010%\u001a\u001e\u0012\u001a\u0012\u0018\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00110!2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001bH\u0097@ø\u0001\u0000¢\u0006\u0004\b%\u0010$Ja\u0010)\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0!2\u0006\u0010&\u001a\u00020\u00062\u0006\u0010'\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u0004H\u0097@ø\u0001\u0000¢\u0006\u0004\b)\u0010*J\u000e\u0010,\u001a\b\u0012\u0004\u0012\u00020+0\u000bH\u0016J\u000e\u0010-\u001a\b\u0012\u0004\u0012\u00020+0\u000bH\u0016J\u000e\u0010.\u001a\b\u0012\u0004\u0012\u00020+0\u000bH\u0016J\u0010\u00100\u001a\u00020/2\u0006\u0010\u001d\u001a\u00020\u001bH\u0016R\u0016\u00103\u001a\u0002018\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u00102R\u0016\u00106\u001a\u0002048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u00105R\u0016\u00109\u001a\u0002078\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u00108\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006<"}, d2 = {"Lcom/huami/sleep/daysleep/daydetail/repo/DaySleepRepo;", "Lcom/huami/sleep/daysleep/daydetail/repo/IDaySleepRepo;", "Lcom/huami/sky/service/RelaxData;", "relaxData", "", "intoSleepCount", "", "intoSleepTime", "baseSleepTime", "", "beMainSleep", "", "intoSleepTimes", "beToday", "awakeTimeIndex", "Lcom/huami/sleep/daysleep/tonality/bean/SleepTonalityBean;", "e", "Lkotlin/Triple;", "c", "Lkotlin/Pair;", GoogleApiAvailabilityLight.a, "Lcom/huami/sky/service/RelaxScore;", "scoreArray", "a", "Landroidx/lifecycle/LiveData;", "b", "isSnoreShow", "", "userId", "date", "Lcom/xiaomi/hm/health/dataprocess/SleepInfo;", "getSleepData", "hasSleepQuotient", "Lkotlinx/coroutines/flow/Flow;", "Lcom/huami/sleep/daysleep/quotient/SleepQuotientParam;", "getSleepQuotient", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSleepBreath", "selectDateTime", "sleepStartTime", "sleepEndTime", "fetchSleepTonalityData", "(JJJIZLjava/util/List;ZILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/huami/sleep/daysleep/daydetail/vo/SleepCompareModel;", "getmCompareDpSlplist", "getmCompareIntoSlplist", "getmCompareScoreSlplist", "", "clear", "Lcom/huami/sleep/datasource/ISleepDayDataSource;", "Lcom/huami/sleep/datasource/ISleepDayDataSource;", "sleepDataSource", "Lcom/huami/sleep/repo/IBreathQualityRepo;", "Lcom/huami/sleep/repo/IBreathQualityRepo;", "odiRepo", "Lcom/huami/sleep/daysleep/tonality/ITonalityDataInterface;", "Lcom/huami/sleep/daysleep/tonality/ITonalityDataInterface;", "tonalityData", "<init>", "(Lcom/huami/sleep/datasource/ISleepDayDataSource;Lcom/huami/sleep/repo/IBreathQualityRepo;Lcom/huami/sleep/daysleep/tonality/ITonalityDataInterface;)V", "sleep_release"}, k = 1, mv = {1, 5, 1})
public final class DaySleepRepo implements IDaySleepRepo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final ISleepDayDataSource sleepDataSource;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final IBreathQualityRepo odiRepo;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final ITonalityDataInterface tonalityData;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ long a;
        public final /* synthetic */ int b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(long j, int i) {
            super(0);
            this.a = j;
            this.b = i;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "more than 240 intoSleepTime = " + this.a + " - index = " + this.b;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ Ref.LongRef a;
        public final /* synthetic */ Ref.IntRef b;
        public final /* synthetic */ Ref.IntRef c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Ref.LongRef longRef, Ref.IntRef intRef, Ref.IntRef intRef2) {
            super(0);
            this.a = longRef;
            this.b = intRef;
            this.c = intRef2;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "more than 240 validScoreTime = " + this.a.element + " - sumScore = " + this.b.element + " - validCount = " + this.c.element;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.sleep.daysleep.daydetail.repo.DaySleepRepo", f = "DaySleepRepo.kt", i = {0, 0, 0, 0, 0, 0, 0, 0}, l = {150}, m = "fetchSleepTonalityData", n = {"this", "intoSleepTimes", "selectDateTime", "sleepStartTime", "intoSleepCount", "beMainSleep", "beToday", "awakeTimeIndex"}, s = {"L$0", "L$1", "J$0", "J$1", "I$0", "Z$0", "Z$1", "I$1"})
    public static final class c extends ContinuationImpl {
        public Object a;
        public Object b;
        public long c;
        public long d;
        public int e;
        public int f;
        public boolean g;
        public boolean h;
        public /* synthetic */ Object i;
        public int k;

        public c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.i = obj;
            this.k |= Integer.MIN_VALUE;
            return DaySleepRepo.this.fetchSleepTonalityData(0L, 0L, 0L, 0, false, null, false, 0, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@"}, d2 = {"Lcom/huami/sky/service/RelaxData;", "it", "Lcom/huami/sleep/daysleep/tonality/bean/SleepTonalityBean;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.sleep.daysleep.daydetail.repo.DaySleepRepo$fetchSleepTonalityData$2", f = "DaySleepRepo.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Function2<RelaxData, Continuation<? super SleepTonalityBean>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ int d;
        public final /* synthetic */ long e;
        public final /* synthetic */ long f;
        public final /* synthetic */ boolean g;
        public final /* synthetic */ List<Long> h;
        public final /* synthetic */ boolean i;
        public final /* synthetic */ int j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(int i, long j, long j2, boolean z, List<Long> list, boolean z2, int i2, Continuation<? super d> continuation) {
            super(2, continuation);
            this.d = i;
            this.e = j;
            this.f = j2;
            this.g = z;
            this.h = list;
            this.i = z2;
            this.j = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@Nullable RelaxData relaxData, @Nullable Continuation<? super SleepTonalityBean> continuation) {
            return ((d) create(relaxData, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            d dVar = DaySleepRepo.this.new d(this.d, this.e, this.f, this.g, this.h, this.i, this.j, continuation);
            dVar.b = obj;
            return dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return DaySleepRepo.this.e((RelaxData) this.b, this.d, this.e, this.f, this.g, this.h, this.i, this.j);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.sleep.daysleep.daydetail.repo.DaySleepRepo", f = "DaySleepRepo.kt", i = {}, l = {117}, m = "getSleepBreath", n = {}, s = {})
    public static final class e extends ContinuationImpl {
        public Object a;
        public /* synthetic */ Object b;
        public int d;

        public e(Continuation<? super e> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return DaySleepRepo.this.getSleepBreath(null, null, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u008a@"}, d2 = {"", "<anonymous parameter 0>", "Lcom/xiaomi/hm/health/dataprocess/SleepInfo;", "sleepInfo", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.sleep.daysleep.daydetail.repo.DaySleepRepo$getSleepBreath$2", f = "DaySleepRepo.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class f extends SuspendLambda implements Function3<Boolean, SleepInfo, Continuation<? super SleepInfo>, Object> {
        public int a;
        public /* synthetic */ Object b;

        public f(Continuation<? super f> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@Nullable Boolean bool, @Nullable SleepInfo sleepInfo, @Nullable Continuation<? super SleepInfo> continuation) {
            f fVar = new f(continuation);
            fVar.b = sleepInfo;
            return fVar.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return (SleepInfo) this.b;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0007\u001a\u0018\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00052\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u008a@"}, d2 = {"Lcom/xiaomi/hm/health/dataprocess/SleepInfo;", "sleepInfo", "Lkotlin/Pair;", "", "odiScoreAndCode", "Lkotlin/Triple;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.sleep.daysleep.daydetail.repo.DaySleepRepo$getSleepBreath$3", f = "DaySleepRepo.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class g extends SuspendLambda implements Function3<SleepInfo, Pair<? extends Integer, ? extends Integer>, Continuation<? super Triple<? extends Boolean, ? extends Integer, ? extends Integer>>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public /* synthetic */ Object c;

        public g(Continuation<? super g> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@Nullable SleepInfo sleepInfo, @Nullable Pair<Integer, Integer> pair, @Nullable Continuation<? super Triple<Boolean, Integer, Integer>> continuation) {
            g gVar = new g(continuation);
            gVar.b = sleepInfo;
            gVar.c = pair;
            return gVar.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            SleepInfo sleepInfo = (SleepInfo) this.b;
            Pair pair = (Pair) this.c;
            Integer num = pair == null ? null : (Integer) pair.getFirst();
            Integer num2 = pair != null ? (Integer) pair.getSecond() : null;
            return new Triple(Boxing.boxBoolean(BreathQualityRiskLevel.INSTANCE.getByCodeValue(num2 == null ? -1 : num2.intValue()) == null || !(sleepInfo != null && (sleepInfo.getHasSleep() || (sleepInfo.getOddStageSleep().isEmpty() ^ true)))), num, num2);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.sleep.daysleep.daydetail.repo.DaySleepRepo", f = "DaySleepRepo.kt", i = {0, 0}, l = {87}, m = "getSleepQuotient", n = {"userId", "date"}, s = {"L$0", "L$1"})
    public static final class h extends ContinuationImpl {
        public Object a;
        public Object b;
        public Object c;
        public /* synthetic */ Object d;
        public int f;

        public h(Continuation<? super h> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.d = obj;
            this.f |= Integer.MIN_VALUE;
            return DaySleepRepo.this.getSleepQuotient(null, null, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u008a@"}, d2 = {"", "<anonymous parameter 0>", "Lcom/xiaomi/hm/health/dataprocess/SleepInfo;", "sleepInfo", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.sleep.daysleep.daydetail.repo.DaySleepRepo$getSleepQuotient$2", f = "DaySleepRepo.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class i extends SuspendLambda implements Function3<Boolean, SleepInfo, Continuation<? super SleepInfo>, Object> {
        public int a;
        public /* synthetic */ Object b;

        public i(Continuation<? super i> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@Nullable Boolean bool, @Nullable SleepInfo sleepInfo, @Nullable Continuation<? super SleepInfo> continuation) {
            i iVar = new i(continuation);
            iVar.b = sleepInfo;
            return iVar.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return (SleepInfo) this.b;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u008a@"}, d2 = {"Lcom/xiaomi/hm/health/dataprocess/SleepInfo;", "sleepInfo", "Lkotlin/Pair;", "", "odiScoreAndCode", "", "Lcom/huami/sleep/daysleep/quotient/SleepQuotientParam;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.sleep.daysleep.daydetail.repo.DaySleepRepo$getSleepQuotient$3", f = "DaySleepRepo.kt", i = {}, l = {96}, m = "invokeSuspend", n = {}, s = {})
    public static final class j extends SuspendLambda implements Function3<SleepInfo, Pair<? extends Integer, ? extends Integer>, Continuation<? super Pair<? extends Integer, ? extends List<? extends SleepQuotientParam>>>, Object> {
        public Object a;
        public Object b;
        public Object c;
        public int d;
        public /* synthetic */ Object e;
        public /* synthetic */ Object f;
        public final /* synthetic */ String g;
        public final /* synthetic */ String h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(String str, String str2, Continuation<? super j> continuation) {
            super(3, continuation);
            this.g = str;
            this.h = str2;
        }

        @Override // kotlin.jvm.functions.Function3
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@Nullable SleepInfo sleepInfo, @Nullable Pair<Integer, Integer> pair, @Nullable Continuation<? super Pair<Integer, ? extends List<SleepQuotientParam>>> continuation) {
            j jVar = new j(this.g, this.h, continuation);
            jVar.e = sleepInfo;
            jVar.f = pair;
            return jVar.invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:17:0x0081  */
        /* JADX WARN: Code duplicated, block: B:19:? A[RETURN, SYNTHETIC] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            SleepQuotientDto sleepQuotientDto;
            SleepQuotientDto sleepQuotientDto2;
            String str;
            SleepQuotientProvider sleepQuotientProvider;
            TimeParam timeParam;
            Pair<Integer, List<SleepQuotientParam>> quotientData;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                SleepInfo sleepInfo = (SleepInfo) this.e;
                Pair pair = (Pair) this.f;
                if (sleepInfo == null) {
                    quotientData = null;
                } else {
                    String str2 = this.g;
                    String str3 = this.h;
                    SleepQuotientProvider sleepQuotientProvider2 = SleepQuotientProvider.INSTANCE;
                    TimeParam timeParam2 = new TimeParam(TimeMode.DAY, SportDay.fromString(str3).getTimestamp());
                    SleepQuotientDto sleepQuotientDtoConvertToQuotientDto = SleepQuotientConvertKt.convertToQuotientDto(sleepInfo, pair);
                    IDeviceManager deviceManager = KoinExtKt.getDeviceManager();
                    this.e = sleepQuotientDtoConvertToQuotientDto;
                    this.f = timeParam2;
                    this.a = str2;
                    this.b = sleepQuotientProvider2;
                    this.c = sleepQuotientDtoConvertToQuotientDto;
                    this.d = 1;
                    Object objIsEarbud = deviceManager.isEarbud(str2, str3, this);
                    if (objIsEarbud == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    sleepQuotientDto = sleepQuotientDtoConvertToQuotientDto;
                    sleepQuotientDto2 = sleepQuotientDto;
                    obj = objIsEarbud;
                    str = str2;
                    sleepQuotientProvider = sleepQuotientProvider2;
                    timeParam = timeParam2;
                }
                if (quotientData == null) {
                    return new Pair(Boxing.boxInt(0), CollectionsKt__CollectionsKt.emptyList());
                }
                return quotientData;
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            sleepQuotientDto = (SleepQuotientDto) this.c;
            sleepQuotientProvider = (SleepQuotientProvider) this.b;
            str = (String) this.a;
            timeParam = (TimeParam) this.f;
            sleepQuotientDto2 = (SleepQuotientDto) this.e;
            ResultKt.throwOnFailure(obj);
            sleepQuotientDto.setEarbud(((Boolean) obj).booleanValue());
            Unit unit = Unit.INSTANCE;
            quotientData = sleepQuotientProvider.getQuotientData(str, timeParam, sleepQuotientDto2);
            if (quotientData == null) {
                return new Pair(Boxing.boxInt(0), CollectionsKt__CollectionsKt.emptyList());
            }
            return quotientData;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class k extends Lambda implements Function0<String> {
        public final /* synthetic */ Ref.IntRef a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(Ref.IntRef intRef) {
            super(0);
            this.a = intRef;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "more than 240 last count = " + this.a.element;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class l extends Lambda implements Function0<String> {
        public final /* synthetic */ Triple<Long, Long, Long> a;
        public final /* synthetic */ long b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(Triple<Long, Long, Long> triple, long j) {
            super(0);
            this.a = triple;
            this.b = j;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "transmitSleepTonality tonalityStartTime = " + this.a.getFirst() + "  - tonalityEndTime = " + this.a.getSecond() + " - intoSleepTime = " + this.b + " - newIntoSleepTime = " + this.a.getThird();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class m extends Lambda implements Function0<String> {
        public static final m a = new m();

        public m() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "transmitSleepTonality validTonalityData is empty";
        }
    }

    public DaySleepRepo(@NotNull ISleepDayDataSource iSleepDayDataSource, @NotNull IBreathQualityRepo iBreathQualityRepo, @NotNull ITonalityDataInterface iTonalityDataInterface) {
        this.sleepDataSource = iSleepDayDataSource;
        this.odiRepo = iBreathQualityRepo;
        this.tonalityData = iTonalityDataInterface;
    }

    private final Pair<Long, Integer> a(List<RelaxScore> scoreArray, long intoSleepTime) {
        Ref.LongRef longRef = new Ref.LongRef();
        longRef.element = -1L;
        Ref.IntRef intRef = new Ref.IntRef();
        Ref.IntRef intRef2 = new Ref.IntRef();
        int i2 = 0;
        for (Object obj : scoreArray) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            RelaxScore relaxScore = (RelaxScore) obj;
            if (i2 == 0) {
                longRef.element = relaxScore.getCreateTime();
            }
            if (intoSleepTime == relaxScore.getCreateTime()) {
                HMLog.info("DaySleepRepo", new a(intoSleepTime, i2));
                longRef.element = intoSleepTime;
            }
            int value = relaxScore.getValue();
            if (value >= 0 && value <= 100) {
                intRef.element += relaxScore.getValue();
                intRef2.element++;
            }
            i2 = i3;
        }
        if (longRef.element == -1) {
            return null;
        }
        HMLog.info("DaySleepRepo", new b(longRef, intRef, intRef2));
        return new Pair<>(Long.valueOf(longRef.element), Integer.valueOf(intRef.element / intRef2.element));
    }

    private final LiveData<Boolean> b() {
        return KoinExtKt.getAppFunctions().checkConfigChanged();
    }

    private final Triple<Long, Long, Long> c(RelaxData relaxData, List<Long> intoSleepTimes) {
        List<RelaxScore> scores = relaxData.getScores();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(scores, 10));
        long j2 = -1;
        long jMin = -1;
        long jMax = -1;
        int i2 = 0;
        for (Object obj : scores) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            long createTime = ((RelaxScore) obj).getCreateTime();
            jMin = jMin == -1 ? createTime : Math.min(jMin, createTime);
            jMax = jMax == -1 ? createTime : Math.max(jMax, createTime);
            arrayList.add(Unit.INSTANCE);
            i2 = i3;
        }
        Iterator<T> it2 = intoSleepTimes.iterator();
        while (it2.hasNext()) {
            long jLongValue = ((Number) it2.next()).longValue();
            if (jMin <= jLongValue && jLongValue <= jMax) {
                j2 = jLongValue;
            }
        }
        return new Triple<>(Long.valueOf(jMin), Long.valueOf(jMax), Long.valueOf(j2));
    }

    private final List<Pair<Long, Integer>> d(RelaxData relaxData, long intoSleepTime) {
        ArrayList arrayList = new ArrayList();
        if (relaxData.getScores().size() < 240) {
            List<RelaxScore> scores = relaxData.getScores();
            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(scores, 10));
            int i2 = 0;
            for (Object obj : scores) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                }
                RelaxScore relaxScore = (RelaxScore) obj;
                int value = relaxScore.getValue();
                if (value >= 0 && value <= 100) {
                    arrayList.add(new Pair(Long.valueOf(relaxScore.getCreateTime()), Integer.valueOf(relaxScore.getValue())));
                }
                arrayList2.add(Unit.INSTANCE);
                i2 = i3;
            }
        } else {
            Ref.IntRef intRef = new Ref.IntRef();
            ArrayList arrayList3 = new ArrayList();
            int i4 = 0;
            for (Object obj2 : relaxData.getScores()) {
                int i5 = i4 + 1;
                if (i4 < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                }
                RelaxScore relaxScore2 = (RelaxScore) obj2;
                if (intRef.element == 5) {
                    Pair<Long, Integer> pairA = a(arrayList3, intoSleepTime);
                    if (pairA != null) {
                        arrayList.add(pairA);
                    }
                    intRef.element = 0;
                    arrayList3.clear();
                }
                arrayList3.add(relaxScore2);
                intRef.element++;
                i4 = i5;
            }
            if (intRef.element > 0) {
                HMLog.info("DaySleepRepo", new k(intRef));
                Pair<Long, Integer> pairA2 = a(arrayList3, intoSleepTime);
                if (pairA2 != null) {
                    arrayList.add(pairA2);
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SleepTonalityBean e(RelaxData relaxData, int intoSleepCount, long intoSleepTime, long baseSleepTime, boolean beMainSleep, List<Long> intoSleepTimes, boolean beToday, int awakeTimeIndex) {
        if (relaxData == null || relaxData.getScores().isEmpty()) {
            return null;
        }
        SleepTonalityBean sleepTonalityBean = new SleepTonalityBean();
        sleepTonalityBean.setIntoSleepTimeCount(intoSleepCount);
        sleepTonalityBean.setTagList(relaxData.getTags());
        Triple<Long, Long, Long> tripleC = c(relaxData, intoSleepTimes);
        sleepTonalityBean.setRelaxStartTimeMS(tripleC.getFirst().longValue());
        sleepTonalityBean.setRelaxEndTimeMS(tripleC.getSecond().longValue());
        sleepTonalityBean.setIntoSleepTime(tripleC.getThird().longValue());
        if (tripleC.getThird().longValue() == -1) {
            sleepTonalityBean.setIntoSleepSignIndex(-1);
        } else {
            sleepTonalityBean.setIntoSleepSignIndex(ChartTransmitUtil.INSTANCE.transmitDateTimeToSpecialInt(tripleC.getThird().longValue(), baseSleepTime));
        }
        HMLog.info("DaySleepRepo", new l(tripleC, intoSleepTime));
        List<Pair<Long, Integer>> listD = d(relaxData, tripleC.getThird().longValue());
        if (listD.isEmpty()) {
            HMLog.info("DaySleepRepo", m.a);
            return null;
        }
        sleepTonalityBean.setOffsetRelaxEndTimeMS(((Number) ((Pair) CollectionsKt.last((List) listD)).getFirst()).longValue());
        ChartTransmitUtil chartTransmitUtil = ChartTransmitUtil.INSTANCE;
        Triple<ChartDataList, Integer, Integer> tripleTransmitSleepTonalityData = chartTransmitUtil.transmitSleepTonalityData(baseSleepTime, tripleC.getFirst().longValue(), tripleC.getSecond().longValue(), listD);
        sleepTonalityBean.setRelaxChartDataList(tripleTransmitSleepTonalityData.getFirst());
        sleepTonalityBean.setRelaxMinScore(tripleTransmitSleepTonalityData.getSecond().intValue());
        sleepTonalityBean.setRelaxMaxScore(tripleTransmitSleepTonalityData.getThird().intValue());
        sleepTonalityBean.setBeMainSleep(beMainSleep);
        if (sleepTonalityBean.getIntoSleepTime() != -1) {
            sleepTonalityBean.setMusicListenTimeCount((int) (((sleepTonalityBean.getIntoSleepTime() - sleepTonalityBean.getRelaxStartTimeMS()) / ((long) 1000)) / ((long) 60)));
        }
        sleepTonalityBean.setMusicPlayTimeCount((int) (((sleepTonalityBean.getRelaxEndTimeMS() - sleepTonalityBean.getRelaxStartTimeMS()) / ((long) 1000)) / ((long) 60)));
        sleepTonalityBean.setBeToday(beToday);
        sleepTonalityBean.setAwakeTimeIndex(chartTransmitUtil.transmitIndexByZeroClock(awakeTimeIndex + 1));
        return sleepTonalityBean;
    }

    @Override // com.huami.sleep.daysleep.daydetail.repo.IDaySleepRepo
    public void clear(@NotNull String date) {
        this.sleepDataSource.removeDaySportLiveData(date);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // com.huami.sleep.daysleep.daydetail.repo.IDaySleepRepo
    @ExperimentalCoroutinesApi
    @Nullable
    public Object fetchSleepTonalityData(long j2, long j3, long j4, int i2, boolean z, @NotNull List<Long> list, boolean z2, int i3, @NotNull Continuation<? super Flow<SleepTonalityBean>> continuation) {
        c cVar;
        long j5;
        long j6;
        DaySleepRepo daySleepRepo;
        boolean z3;
        boolean z4;
        int i4;
        List<Long> list2;
        int i5;
        if (continuation instanceof c) {
            cVar = (c) continuation;
            int i6 = cVar.k;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                cVar.k = i6 - Integer.MIN_VALUE;
            } else {
                cVar = new c(continuation);
            }
        } else {
            cVar = new c(continuation);
        }
        Object sleepTonalityOriginalData = cVar.i;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i7 = cVar.k;
        if (i7 == 0) {
            ResultKt.throwOnFailure(sleepTonalityOriginalData);
            j5 = j2;
            j6 = j3;
            QueryTonalityBean queryTonalityBean = new QueryTonalityBean(j5, j6, j4);
            ITonalityDataInterface iTonalityDataInterface = this.tonalityData;
            cVar.a = this;
            cVar.b = list;
            cVar.c = j5;
            cVar.d = j6;
            cVar.e = i2;
            cVar.g = z;
            cVar.h = z2;
            cVar.f = i3;
            cVar.k = 1;
            sleepTonalityOriginalData = iTonalityDataInterface.getSleepTonalityOriginalData(queryTonalityBean, cVar);
            if (sleepTonalityOriginalData == coroutine_suspended) {
                return coroutine_suspended;
            }
            daySleepRepo = this;
            z3 = z;
            z4 = z2;
            i4 = i3;
            list2 = list;
            i5 = i2;
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i4 = cVar.f;
            z4 = cVar.h;
            z3 = cVar.g;
            i5 = cVar.e;
            long j7 = cVar.d;
            long j8 = cVar.c;
            list2 = (List) cVar.b;
            daySleepRepo = (DaySleepRepo) cVar.a;
            ResultKt.throwOnFailure(sleepTonalityOriginalData);
            j5 = j8;
            j6 = j7;
        }
        return FlowKt.mapLatest((Flow) sleepTonalityOriginalData, daySleepRepo.new d(i5, j6, j5, z3, list2, z4, i4, null));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.huami.sleep.daysleep.daydetail.repo.IDaySleepRepo
    @ExperimentalCoroutinesApi
    @Nullable
    public Object getSleepBreath(@NotNull String str, @NotNull String str2, @NotNull Continuation<? super Flow<Triple<Boolean, Integer, Integer>>> continuation) {
        e eVar;
        Flow flow;
        if (continuation instanceof e) {
            eVar = (e) continuation;
            int i2 = eVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                eVar.d = i2 - Integer.MIN_VALUE;
            } else {
                eVar = new e(continuation);
            }
        } else {
            eVar = new e(continuation);
        }
        Object obj = eVar.b;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = eVar.d;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            Flow flowFlowCombine = FlowKt.flowCombine(FlowLiveDataConversions.asFlow(b()), FlowLiveDataConversions.asFlow(this.sleepDataSource.getSleepInfo(str, str2)), new f(null));
            IBreathQualityRepo iBreathQualityRepo = this.odiRepo;
            long dayStartTime = SleepTimeUtil.INSTANCE.getDayStartTime(SportDay.fromString(str2).getTimestamp());
            eVar.a = flowFlowCombine;
            eVar.d = 1;
            Object dayOdiScore = iBreathQualityRepo.getDayOdiScore(str, dayStartTime, eVar);
            if (dayOdiScore == coroutine_suspended) {
                return coroutine_suspended;
            }
            obj = dayOdiScore;
            flow = flowFlowCombine;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            flow = (Flow) eVar.a;
            ResultKt.throwOnFailure(obj);
        }
        return FlowKt.flowOn(FlowKt.flowCombine(flow, (Flow) obj, new g(null)), Dispatchers.getIO());
    }

    @Override // com.huami.sleep.daysleep.daydetail.repo.IDaySleepRepo
    @NotNull
    public LiveData<SleepInfo> getSleepData(@NotNull String userId, @NotNull String date) {
        return this.sleepDataSource.getSleepInfo(userId, date);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.huami.sleep.daysleep.daydetail.repo.IDaySleepRepo
    @ExperimentalCoroutinesApi
    @Nullable
    public Object getSleepQuotient(@NotNull String str, @NotNull String str2, @NotNull Continuation<? super Flow<? extends Pair<Integer, ? extends List<SleepQuotientParam>>>> continuation) {
        h hVar;
        String str3;
        Flow flow;
        if (continuation instanceof h) {
            hVar = (h) continuation;
            int i2 = hVar.f;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                hVar.f = i2 - Integer.MIN_VALUE;
            } else {
                hVar = new h(continuation);
            }
        } else {
            hVar = new h(continuation);
        }
        Object obj = hVar.d;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = hVar.f;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            Flow flowFlowCombine = FlowKt.flowCombine(FlowLiveDataConversions.asFlow(b()), FlowLiveDataConversions.asFlow(this.sleepDataSource.getSleepInfo(str, str2)), new i(null));
            IBreathQualityRepo iBreathQualityRepo = this.odiRepo;
            long dayStartTime = SleepTimeUtil.INSTANCE.getDayStartTime(SportDay.fromString(str2).getTimestamp());
            hVar.a = str;
            hVar.b = str2;
            hVar.c = flowFlowCombine;
            hVar.f = 1;
            Object dayOdiScore = iBreathQualityRepo.getDayOdiScore(str, dayStartTime, hVar);
            if (dayOdiScore == coroutine_suspended) {
                return coroutine_suspended;
            }
            str3 = str;
            flow = flowFlowCombine;
            obj = dayOdiScore;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            flow = (Flow) hVar.c;
            str2 = (String) hVar.b;
            str3 = (String) hVar.a;
            ResultKt.throwOnFailure(obj);
        }
        return FlowKt.flowOn(FlowKt.flowCombine(flow, (Flow) obj, new j(str3, str2, null)), Dispatchers.getIO());
    }

    @Override // com.huami.sleep.daysleep.daydetail.repo.IDaySleepRepo
    @NotNull
    public List<SleepCompareModel> getmCompareDpSlplist() {
        return KoinExtKt.getSleepDataManager().getmCompareDpSlplist();
    }

    @Override // com.huami.sleep.daysleep.daydetail.repo.IDaySleepRepo
    @NotNull
    public List<SleepCompareModel> getmCompareIntoSlplist() {
        return KoinExtKt.getSleepDataManager().getmCompareIntoSlplist();
    }

    @Override // com.huami.sleep.daysleep.daydetail.repo.IDaySleepRepo
    @NotNull
    public List<SleepCompareModel> getmCompareScoreSlplist() {
        return KoinExtKt.getSleepDataManager().getmCompareScoreSlplist();
    }

    @Override // com.huami.sleep.daysleep.daydetail.repo.IDaySleepRepo
    @NotNull
    public LiveData<Boolean> hasSleepQuotient(@NotNull String userId, @NotNull String date) {
        return Transformations.map(this.sleepDataSource.getSleepInfo(userId, date), new Function<SleepInfo, Boolean>() { // from class: com.huami.sleep.daysleep.daydetail.repo.DaySleepRepo$hasSleepQuotient$$inlined$map$1
            @Override // androidx.arch.core.util.Function
            public final Boolean apply(SleepInfo sleepInfo) {
                SleepInfo sleepInfo2 = sleepInfo;
                boolean z = false;
                if (sleepInfo2 != null && sleepInfo2.getNonRemCount() + sleepInfo2.getRemCount() + sleepInfo2.getDreamTime() > 0) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
        });
    }

    @Override // com.huami.sleep.daysleep.daydetail.repo.IDaySleepRepo
    public boolean isSnoreShow() {
        return KoinExtKt.getAppFunctions().isSnoreShow();
    }
}
