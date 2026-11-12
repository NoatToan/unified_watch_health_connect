package com.xiaomi.fitness.detail;

import com.mi.health.map.data.GpsValues;
import com.xiaomi.fit.data.common.data.sport.SportBasicReport;
import com.xiaomi.fit.data.common.data.sport.SportRecordKey;
import com.xiaomi.fitness.util.SportRecordUtil;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lcom/mi/health/map/data/GpsValues;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.xiaomi.fitness.detail.SportDetailGpsFragment$insertIntegerPoint$1$1$gpsValuesTask$1", f = "SportDetailGpsFragment.kt", i = {}, l = {476}, m = "invokeSuspend", n = {}, s = {})
public final class SportDetailGpsFragment$insertIntegerPoint$1$1$gpsValuesTask$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super GpsValues>, Object> {
    final /* synthetic */ GpsValues $it;
    final /* synthetic */ Map<SportRecordKey, List<Object>> $resultMap;
    int label;
    final /* synthetic */ SportDetailGpsFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SportDetailGpsFragment$insertIntegerPoint$1$1$gpsValuesTask$1(GpsValues gpsValues, Map<SportRecordKey, List<Object>> map, SportDetailGpsFragment sportDetailGpsFragment, Continuation<? super SportDetailGpsFragment$insertIntegerPoint$1$1$gpsValuesTask$1> continuation) {
        super(2, continuation);
        this.$it = gpsValues;
        this.$resultMap = map;
        this.this$0 = sportDetailGpsFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SportDetailGpsFragment$insertIntegerPoint$1$1$gpsValuesTask$1(this.$it, this.$resultMap, this.this$0, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            SportRecordUtil sportRecordUtil = SportRecordUtil.INSTANCE;
            GpsValues gpsValues = this.$it;
            Map<SportRecordKey, List<Object>> map = this.$resultMap;
            SportBasicReport mBasicReport = this.this$0.getMBasicReport();
            this.label = 1;
            obj = sportRecordUtil.insertIntegerValues(gpsValues, map, mBasicReport, this);
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

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super GpsValues> continuation) {
        return ((SportDetailGpsFragment$insertIntegerPoint$1$1$gpsValuesTask$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
