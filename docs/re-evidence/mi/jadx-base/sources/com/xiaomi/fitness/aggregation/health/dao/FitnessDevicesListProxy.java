package com.xiaomi.fitness.aggregation.health.dao;

import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.fitness.export.data.annotation.HomeDataType;
import com.xiaomi.fit.fitness.export.data.item.FitnessDeviceItem;
import com.xiaomi.fit.fitness.parser.sport.base.SportReportBaseParser;
import com.xiaomi.fit.fitness.persist.db.utils.DailyRecordDaoUtils;
import com.xiaomi.fitness.aggregation.db.FitnessSummaryDatabase;
import com.xiaomi.fitness.aggregation.health.entity.FitnessDeviceItemEntity;
import com.xiaomi.fitness.statistics.StatConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rJ*\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\r0\u00102\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0015J\u001c\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u00132\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00150\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u0019"}, d2 = {"Lcom/xiaomi/fitness/aggregation/health/dao/FitnessDevicesListProxy;", "", "<init>", "()V", "TAG", "", "dao", "Lcom/xiaomi/fitness/aggregation/health/dao/FitnessDeviceListDao;", "getDao", "()Lcom/xiaomi/fitness/aggregation/health/dao/FitnessDeviceListDao;", "insert", "", "entityList", "", "Lcom/xiaomi/fitness/aggregation/health/entity/FitnessDeviceItemEntity;", "getDevicesList", "Lkotlinx/coroutines/flow/Flow;", "Lcom/xiaomi/fit/fitness/export/data/item/FitnessDeviceItem;", "dataType", "Lcom/xiaomi/fit/fitness/export/data/annotation/HomeDataType;", StatConstants.PARAM_START, "", StatConstants.PARAM_END, "delete", "timeList", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFitnessDevicesListProxy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FitnessDevicesListProxy.kt\ncom/xiaomi/fitness/aggregation/health/dao/FitnessDevicesListProxy\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 3 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 4 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 5 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,51:1\n37#2:52\n36#2,3:53\n53#3:56\n55#3:60\n50#4:57\n55#4:59\n107#5:58\n*S KotlinDebug\n*F\n+ 1 FitnessDevicesListProxy.kt\ncom/xiaomi/fitness/aggregation/health/dao/FitnessDevicesListProxy\n*L\n22#1:52\n22#1:53,3\n35#1:56\n35#1:60\n35#1:57\n35#1:59\n35#1:58\n*E\n"})
public final class FitnessDevicesListProxy {

    @NotNull
    public static final FitnessDevicesListProxy INSTANCE = new FitnessDevicesListProxy();

    @NotNull
    private static final String TAG = "DevicesList";

    private FitnessDevicesListProxy() {
    }

    private final FitnessDeviceListDao getDao() {
        return FitnessSummaryDatabase.INSTANCE.getInstance().getDevicesListDao();
    }

    public final void delete(@NotNull HomeDataType dataType, @NotNull List<Long> timeList) {
        Intrinsics.checkNotNullParameter(dataType, "dataType");
        Intrinsics.checkNotNullParameter(timeList, "timeList");
        getDao().delete(dataType, timeList);
    }

    @NotNull
    public final Flow<List<FitnessDeviceItem>> getDevicesList(@NotNull HomeDataType dataType, final long start, final long end) {
        Intrinsics.checkNotNullParameter(dataType, "dataType");
        Pair<Long, Long> pairNormalizeTime = TimeZoneUtil.INSTANCE.normalizeTime(start, end);
        final long jLongValue = pairNormalizeTime.getFirst().longValue();
        final long jLongValue2 = pairNormalizeTime.getSecond().longValue();
        DailyRecordDaoUtils.INSTANCE.requestFromServer(dataType, jLongValue, Long.valueOf(jLongValue2));
        final Flow<List<FitnessDeviceItemEntity>> flowQueryDeviceList = getDao().queryDeviceList(dataType, jLongValue, jLongValue2);
        return FlowKt.flowOn(new Flow<List<FitnessDeviceItem>>() { // from class: com.xiaomi.fitness.aggregation.health.dao.FitnessDevicesListProxy$getDevicesList$$inlined$map$1

            /* JADX INFO: renamed from: com.xiaomi.fitness.aggregation.health.dao.FitnessDevicesListProxy$getDevicesList$$inlined$map$1$2, reason: invalid class name */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, k = 3, mv = {2, 0, 0}, xi = 48)
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 FitnessDevicesListProxy.kt\ncom/xiaomi/fitness/aggregation/health/dao/FitnessDevicesListProxy\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,222:1\n54#2:223\n36#3,6:224\n42#3,2:231\n44#3:234\n1863#4:230\n1864#4:233\n*S KotlinDebug\n*F\n+ 1 FitnessDevicesListProxy.kt\ncom/xiaomi/fitness/aggregation/health/dao/FitnessDevicesListProxy\n*L\n41#1:230\n41#1:233\n*E\n"})
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ long $end$inlined;
                final /* synthetic */ long $realEnd$inlined;
                final /* synthetic */ long $realStart$inlined;
                final /* synthetic */ long $start$inlined;
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                /* JADX INFO: renamed from: com.xiaomi.fitness.aggregation.health.dao.FitnessDevicesListProxy$getDevicesList$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @DebugMetadata(c = "com.xiaomi.fitness.aggregation.health.dao.FitnessDevicesListProxy$getDevicesList$$inlined$map$1$2", f = "FitnessDevicesListProxy.kt", i = {}, l = {SportReportBaseParser.ReportType.targetValueNumber}, m = "emit", n = {}, s = {})
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector, long j, long j2, long j3, long j4) {
                    this.$this_unsafeFlow = flowCollector;
                    this.$start$inlined = j;
                    this.$end$inlined = j2;
                    this.$realStart$inlined = j3;
                    this.$realEnd$inlined = j4;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0017  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                @Nullable
                public final Object emit(Object obj, @NotNull Continuation continuation) {
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
                    Object obj2 = anonymousClass1.result;
                    Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = anonymousClass1.label;
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj2);
                        FlowCollector flowCollector = this.$this_unsafeFlow;
                        List list = (List) obj;
                        ArrayList arrayList = new ArrayList();
                        FitnessLogUtils.i("DevicesList", "getDevicesList: start = " + this.$start$inlined + ", end = " + this.$end$inlined + ", realStart = " + this.$realStart$inlined + ", realEnd = " + this.$realEnd$inlined + ", list.size = " + list.size());
                        Iterator<T> it = list.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((FitnessDeviceItemEntity) it.next()).toDeviceItem());
                        }
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(arrayList, anonymousClass1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            @Nullable
            public Object collect(@NotNull FlowCollector<? super List<FitnessDeviceItem>> flowCollector, @NotNull Continuation continuation) {
                Object objCollect = flowQueryDeviceList.collect(new AnonymousClass2(flowCollector, start, end, jLongValue, jLongValue2), continuation);
                return objCollect == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        }, Dispatchers.getIO());
    }

    public final void insert(@NotNull List<FitnessDeviceItemEntity> entityList) {
        Intrinsics.checkNotNullParameter(entityList, "entityList");
        FitnessDeviceListDao dao = getDao();
        FitnessDeviceItemEntity[] fitnessDeviceItemEntityArr = (FitnessDeviceItemEntity[]) entityList.toArray(new FitnessDeviceItemEntity[0]);
        dao.insert((FitnessDeviceItemEntity[]) Arrays.copyOf(fitnessDeviceItemEntityArr, fitnessDeviceItemEntityArr.length));
    }
}
