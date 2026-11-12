package com.xiaomi.fitness.repo.reddot;

import com.xiaomi.fit.fitness.export.api.repository.IRedDotRepository;
import com.xiaomi.fit.fitness.export.data.annotation.HomeDataType;
import com.xiaomi.fit.fitness.export.data.item.RedDotItem;
import com.xiaomi.fit.fitness.parser.sport.base.SportReportBaseParser;
import com.xiaomi.fitness.aggregation.health.dao.RedDotDaoProxy;
import com.xiaomi.fitness.aggregation.health.entity.CloudContract;
import com.xiaomi.fitness.statistics.StatConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
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

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J:\u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00060\u00052\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000eH\u0016J2\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00060\u00052\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0007H\u0002J2\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00060\u00052\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0007H\u0002¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/fitness/repo/reddot/RedDotRepository;", "Lcom/xiaomi/fit/fitness/export/api/repository/IRedDotRepository;", "<init>", "()V", "getRedDotMap", "Lkotlinx/coroutines/flow/Flow;", "", "", "Lcom/xiaomi/fit/fitness/export/data/item/RedDotItem;", "dataType", "Lcom/xiaomi/fit/fitness/export/data/annotation/HomeDataType;", StatConstants.PARAM_START, StatConstants.PARAM_END, CloudContract.COL_VIEW_TAG, "", "loadByMonth", "loadByDayWeek", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nRedDotRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RedDotRepository.kt\ncom/xiaomi/fitness/repo/reddot/RedDotRepository\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,103:1\n53#2:104\n55#2:108\n53#2:109\n55#2:113\n50#3:105\n55#3:107\n50#3:110\n55#3:112\n107#4:106\n107#4:111\n*S KotlinDebug\n*F\n+ 1 RedDotRepository.kt\ncom/xiaomi/fitness/repo/reddot/RedDotRepository\n*L\n82#1:104\n82#1:108\n92#1:109\n92#1:113\n82#1:105\n82#1:107\n92#1:110\n92#1:112\n82#1:106\n92#1:111\n*E\n"})
public final class RedDotRepository implements IRedDotRepository {
    private final Flow<Map<Long, RedDotItem>> loadByDayWeek(final HomeDataType dataType, long start, long end) {
        if (dataType != HomeDataType.TODAY_HEALTH) {
            final Flow<List<RedDotItem>> flowQueryRedDotList = RedDotDaoProxy.INSTANCE.queryRedDotList(dataType, start, end);
            return FlowKt.flowOn(new Flow<Map<Long, RedDotItem>>() { // from class: com.xiaomi.fitness.repo.reddot.RedDotRepository$loadByDayWeek$$inlined$map$2

                /* JADX INFO: renamed from: com.xiaomi.fitness.repo.reddot.RedDotRepository$loadByDayWeek$$inlined$map$2$2, reason: invalid class name */
                @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, k = 3, mv = {2, 0, 0}, xi = 48)
                @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 RedDotRepository.kt\ncom/xiaomi/fitness/repo/reddot/RedDotRepository\n*L\n1#1,222:1\n54#2:223\n93#3,7:224\n*E\n"})
                public static final class AnonymousClass2<T> implements FlowCollector {
                    final /* synthetic */ FlowCollector $this_unsafeFlow;

                    /* JADX INFO: renamed from: com.xiaomi.fitness.repo.reddot.RedDotRepository$loadByDayWeek$$inlined$map$2$2$1, reason: invalid class name */
                    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                    @DebugMetadata(c = "com.xiaomi.fitness.repo.reddot.RedDotRepository$loadByDayWeek$$inlined$map$2$2", f = "RedDotRepository.kt", i = {}, l = {SportReportBaseParser.ReportType.targetValueNumber}, m = "emit", n = {}, s = {})
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

                    public AnonymousClass2(FlowCollector flowCollector) {
                        this.$this_unsafeFlow = flowCollector;
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
                        int i3 = 1;
                        if (i2 == 0) {
                            ResultKt.throwOnFailure(obj2);
                            FlowCollector flowCollector = this.$this_unsafeFlow;
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            for (RedDotItem redDotItem : (List) obj) {
                                long time = redDotItem.getTime();
                                linkedHashMap.put(Boxing.boxLong(time), new RedDotItem(redDotItem.getDataType(), time, 0L, 4, null));
                                i3 = 1;
                            }
                            anonymousClass1.label = i3;
                            if (flowCollector.emit(linkedHashMap, anonymousClass1) == coroutine_suspended) {
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
                public Object collect(@NotNull FlowCollector<? super Map<Long, RedDotItem>> flowCollector, @NotNull Continuation continuation) {
                    Object objCollect = flowQueryRedDotList.collect(new AnonymousClass2(flowCollector), continuation);
                    return objCollect == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                }
            }, Dispatchers.getIO());
        }
        ArrayList arrayListArrayListOf = CollectionsKt__CollectionsKt.arrayListOf(HomeDataType.HR, HomeDataType.STRESS, HomeDataType.SLEEP, HomeDataType.SPO2);
        final LinkedHashMap linkedHashMap = new LinkedHashMap();
        final Flow<List<RedDotItem>> flowQueryRedDotDataTypeList = RedDotDaoProxy.INSTANCE.queryRedDotDataTypeList(arrayListArrayListOf, start, end);
        return FlowKt.flowOn(new Flow<Map<Long, RedDotItem>>() { // from class: com.xiaomi.fitness.repo.reddot.RedDotRepository$loadByDayWeek$$inlined$map$1

            /* JADX INFO: renamed from: com.xiaomi.fitness.repo.reddot.RedDotRepository$loadByDayWeek$$inlined$map$1$2, reason: invalid class name */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, k = 3, mv = {2, 0, 0}, xi = 48)
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 RedDotRepository.kt\ncom/xiaomi/fitness/repo/reddot/RedDotRepository\n*L\n1#1,222:1\n54#2:223\n83#3,6:224\n*E\n"})
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ HomeDataType $dataType$inlined;
                final /* synthetic */ Map $map$inlined;
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                /* JADX INFO: renamed from: com.xiaomi.fitness.repo.reddot.RedDotRepository$loadByDayWeek$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @DebugMetadata(c = "com.xiaomi.fitness.repo.reddot.RedDotRepository$loadByDayWeek$$inlined$map$1$2", f = "RedDotRepository.kt", i = {}, l = {SportReportBaseParser.ReportType.targetValueNumber}, m = "emit", n = {}, s = {})
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

                public AnonymousClass2(FlowCollector flowCollector, HomeDataType homeDataType, Map map) {
                    this.$this_unsafeFlow = flowCollector;
                    this.$dataType$inlined = homeDataType;
                    this.$map$inlined = map;
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
                        Iterator it = ((List) obj).iterator();
                        while (it.hasNext()) {
                            long time = ((RedDotItem) it.next()).getTime();
                            this.$map$inlined.put(Boxing.boxLong(time), new RedDotItem(this.$dataType$inlined, time, 0L, 4, null));
                        }
                        Map map = this.$map$inlined;
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(map, anonymousClass1) == coroutine_suspended) {
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
            public Object collect(@NotNull FlowCollector<? super Map<Long, RedDotItem>> flowCollector, @NotNull Continuation continuation) {
                Object objCollect = flowQueryRedDotDataTypeList.collect(new AnonymousClass2(flowCollector, dataType, linkedHashMap), continuation);
                return objCollect == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        }, Dispatchers.getIO());
    }

    private final Flow<Map<Long, RedDotItem>> loadByMonth(HomeDataType dataType, long start, long end) {
        return FlowKt.flowOn(FlowKt.flow(new RedDotRepository$loadByMonth$mapFlow$1(start, end, dataType, null)), Dispatchers.getIO());
    }

    @Override // com.xiaomi.fit.fitness.export.api.repository.IRedDotRepository
    @NotNull
    public Flow<Map<Long, RedDotItem>> getRedDotMap(@NotNull HomeDataType dataType, long start, long end, @NotNull String viewTag) {
        Intrinsics.checkNotNullParameter(dataType, "dataType");
        Intrinsics.checkNotNullParameter(viewTag, "viewTag");
        return Intrinsics.areEqual(viewTag, "months") ? loadByMonth(dataType, start, end) : loadByDayWeek(dataType, start, end);
    }
}
