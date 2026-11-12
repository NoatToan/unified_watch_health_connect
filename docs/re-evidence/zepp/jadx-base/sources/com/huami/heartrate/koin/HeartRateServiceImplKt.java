package com.huami.heartrate.koin;

import android.util.Pair;
import android.util.SparseArray;
import com.huami.chart.data.ChartData;
import com.huami.heartrate.chart.HandleDataKt;
import com.huami.heartrate.chart.ShowValue;
import com.huami.heartrate.repository.entity.HeartRateData;
import com.huami.heartrate.repository.entity.HeartRateEntity;
import com.huami.heartrate.service.HeartRate;
import com.huami.heartrate.service.HeartRateInfo;
import com.huami.heartrate.service.HeartRateStatisticalInfo;
import com.huami.heartrate.utils.ExtensionUtilsKt;
import com.huami.heartrate.utils.HeartRateTimeUtils;
import com.xiaomi.hm.health.bodyfat.utils.ParamKey;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.IntRange;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0005\u001a\u001f\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u0080@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0016\u0010\t\u001a\u00020\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0002\u001a\f\u0010\f\u001a\u00020\u000b*\u00020\nH\u0002\"\u001d\u0010\u0011\u001a\u00020\r8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Lcom/huami/heartrate/repository/entity/HeartRateData;", ParamKey.heartRateData, "Lcom/huami/heartrate/service/HeartRateInfo;", "getHeartRateInfo", "(Lcom/huami/heartrate/repository/entity/HeartRateData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/util/SparseArray;", "Lcom/huami/chart/data/ChartData;", "chartDataSparseArray", "Lcom/huami/heartrate/chart/ShowValue;", "b", "Lcom/huami/heartrate/repository/entity/HeartRateEntity;", "Lcom/huami/heartrate/service/HeartRate;", "c", "", "a", "Lkotlin/Lazy;", "()[B", "defaultWholeDayHr", "heartrate_release"}, k = 2, mv = {1, 5, 1})
public final class HeartRateServiceImplKt {

    @NotNull
    private static final Lazy a = LazyKt__LazyJVMKt.lazy(a.a);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0012\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<byte[]> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final byte[] invoke() {
            IntRange intRange = new IntRange(0, 1440);
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(intRange, 10));
            Iterator<Integer> it2 = intRange.iterator();
            while (it2.hasNext()) {
                ((IntIterator) it2).nextInt();
                arrayList.add((byte) -1);
            }
            return CollectionsKt___CollectionsKt.toByteArray(arrayList);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/huami/heartrate/service/HeartRateInfo;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.heartrate.koin.HeartRateServiceImplKt$getHeartRateInfo$2", f = "HeartRateServiceImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super HeartRateInfo>, Object> {
        public int a;
        public final /* synthetic */ HeartRateData b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(HeartRateData heartRateData, Continuation<? super b> continuation) {
            super(2, continuation);
            this.b = heartRateData;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new b(this.b, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super HeartRateInfo> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            HeartRateData heartRateData = this.b;
            if (heartRateData == null) {
                return null;
            }
            Objects.requireNonNull(heartRateData, "null cannot be cast to non-null type com.huami.heartrate.repository.entity.HeartRateData");
            long time = heartRateData.getTime();
            int restingHrData = heartRateData.getRestingHrData();
            List<HeartRateEntity> listComponent3 = heartRateData.component3();
            byte[] wholeHrData = heartRateData.getWholeHrData();
            if (wholeHrData == null) {
                if (listComponent3 == null || listComponent3.isEmpty()) {
                    return null;
                }
            }
            if (wholeHrData == null) {
                wholeHrData = HeartRateServiceImplKt.a();
            }
            byte[] bArrMergeMeasureToWholeDay = HandleDataKt.mergeMeasureToWholeDay(wholeHrData, listComponent3);
            Pair<SparseArray<ChartData>, Integer> pairInvoke = HandleDataKt.getWholeDayHeartRateDataConvert().invoke(bArrMergeMeasureToWholeDay);
            ShowValue showValueB = HeartRateServiceImplKt.b((SparseArray) pairInvoke.first);
            int maxHR = showValueB.getMaxHR();
            int minHR = showValueB.getMinHR();
            int averageValidValue = showValueB.getAverageValidValue();
            Integer num = (Integer) pairInvoke.second;
            return new HeartRateInfo(time, new HeartRateStatisticalInfo(restingHrData, minHR, maxHR, averageValidValue, HandleDataKt.isValidHeartRate().invoke(num).booleanValue() ? new HeartRate(num.intValue(), HeartRateTimeUtils.INSTANCE.getTimeByPosition(time, HandleDataKt.findLastValidHeartRateIndex(bArrMergeMeasureToWholeDay))) : null), bArrMergeMeasureToWholeDay);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final byte[] a() {
        return (byte[]) a.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ShowValue b(SparseArray<ChartData> sparseArray) {
        return HandleDataKt.findMaxMinAverage(sparseArray);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final HeartRate c(HeartRateEntity heartRateEntity) {
        Integer hr = heartRateEntity.getHr();
        return new HeartRate(hr == null ? 0 : hr.intValue(), ExtensionUtilsKt.secondToMills(heartRateEntity.getTime()));
    }

    @Nullable
    public static final Object getHeartRateInfo(@Nullable HeartRateData heartRateData, @NotNull Continuation<? super HeartRateInfo> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new b(heartRateData, null), continuation);
    }
}
