package com.xiaomi.fitness.repo.reddot;

import com.xiaomi.fit.fitness.export.data.annotation.HomeDataType;
import com.xiaomi.fit.fitness.export.data.item.RedDotItem;
import com.xiaomi.fitness.aggregation.health.dao.RedDotDaoProxy;
import com.xiaomi.fitness.common.utils.TimeUtils;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\t\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "", "", "Lcom/xiaomi/fit/fitness/export/data/item/RedDotItem;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.xiaomi.fitness.repo.reddot.RedDotRepository$loadByMonth$mapFlow$1", f = "RedDotRepository.kt", i = {}, l = {69}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nRedDotRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RedDotRepository.kt\ncom/xiaomi/fitness/repo/reddot/RedDotRepository$loadByMonth$mapFlow$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,103:1\n1863#2,2:104\n*S KotlinDebug\n*F\n+ 1 RedDotRepository.kt\ncom/xiaomi/fitness/repo/reddot/RedDotRepository$loadByMonth$mapFlow$1\n*L\n51#1:104,2\n*E\n"})
public final class RedDotRepository$loadByMonth$mapFlow$1 extends SuspendLambda implements Function2<FlowCollector<? super Map<Long, ? extends RedDotItem>>, Continuation<? super Unit>, Object> {
    final /* synthetic */ HomeDataType $dataType;
    final /* synthetic */ long $end;
    final /* synthetic */ long $start;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RedDotRepository$loadByMonth$mapFlow$1(long j, long j2, HomeDataType homeDataType, Continuation<? super RedDotRepository$loadByMonth$mapFlow$1> continuation) {
        super(2, continuation);
        this.$start = j;
        this.$end = j2;
        this.$dataType = homeDataType;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        RedDotRepository$loadByMonth$mapFlow$1 redDotRepository$loadByMonth$mapFlow$1 = new RedDotRepository$loadByMonth$mapFlow$1(this.$start, this.$end, this.$dataType, continuation);
        redDotRepository$loadByMonth$mapFlow$1.L$0 = obj;
        return redDotRepository$loadByMonth$mapFlow$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(FlowCollector<? super Map<Long, ? extends RedDotItem>> flowCollector, Continuation<? super Unit> continuation) {
        return invoke2((FlowCollector<? super Map<Long, RedDotItem>>) flowCollector, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        LinkedHashMap linkedHashMap;
        LinkedHashMap linkedHashMap2;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        int i2 = 1;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            Calendar calendar = Calendar.getInstance();
            long j = 1000;
            calendar.setTimeInMillis(this.$start * j);
            TimeUtils.setToZeroOClock(calendar);
            calendar.set(calendar.get(1), calendar.get(2), 1);
            Ref.LongRef longRef = new Ref.LongRef();
            longRef.element = calendar.getTimeInMillis() / j;
            while (longRef.element < this.$end) {
                calendar.set(5, calendar.getActualMaximum(5));
                calendar.add(5, i2);
                long timeInMillis = calendar.getTimeInMillis() / j;
                HomeDataType homeDataType = this.$dataType;
                if (homeDataType == HomeDataType.TODAY_HEALTH) {
                    ArrayList arrayListArrayListOf = CollectionsKt__CollectionsKt.arrayListOf(HomeDataType.HR, HomeDataType.STRESS, HomeDataType.SLEEP, HomeDataType.SPO2);
                    HomeDataType homeDataType2 = this.$dataType;
                    Iterator it = arrayListArrayListOf.iterator();
                    while (it.hasNext()) {
                        LinkedHashMap linkedHashMap4 = linkedHashMap3;
                        HomeDataType homeDataType3 = homeDataType2;
                        if (RedDotDaoProxy.INSTANCE.queryRedDotCount((HomeDataType) it.next(), longRef.element, timeInMillis) > 0) {
                            linkedHashMap2 = linkedHashMap4;
                            linkedHashMap2.put(Boxing.boxLong(longRef.element), new RedDotItem(homeDataType3, longRef.element, 0L, 4, null));
                        } else {
                            linkedHashMap2 = linkedHashMap4;
                        }
                        linkedHashMap3 = linkedHashMap2;
                        homeDataType2 = homeDataType3;
                    }
                    linkedHashMap = linkedHashMap3;
                } else {
                    linkedHashMap = linkedHashMap3;
                    if (RedDotDaoProxy.INSTANCE.queryRedDotCount(homeDataType, longRef.element, timeInMillis) > 0) {
                        linkedHashMap.put(Boxing.boxLong(longRef.element), new RedDotItem(this.$dataType, longRef.element, 0L, 4, null));
                    }
                }
                if (RedDotDaoProxy.INSTANCE.queryRedDotCount(this.$dataType, longRef.element, timeInMillis) > 0) {
                    linkedHashMap.put(Boxing.boxLong(longRef.element), new RedDotItem(this.$dataType, longRef.element, 0L, 4, null));
                }
                longRef.element = timeInMillis;
                linkedHashMap3 = linkedHashMap;
                i2 = 1;
            }
            this.label = i2;
            if (flowCollector.emit(linkedHashMap3, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(FlowCollector<? super Map<Long, RedDotItem>> flowCollector, Continuation<? super Unit> continuation) {
        return ((RedDotRepository$loadByMonth$mapFlow$1) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
