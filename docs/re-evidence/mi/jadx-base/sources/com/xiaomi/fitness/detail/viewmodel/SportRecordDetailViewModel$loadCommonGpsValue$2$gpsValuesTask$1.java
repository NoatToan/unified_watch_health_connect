package com.xiaomi.fitness.detail.viewmodel;

import com.mi.health.map.data.GpsValues;
import com.xiaomi.fit.data.common.data.sport.SportBasicReport;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lcom/mi/health/map/data/GpsValues;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.xiaomi.fitness.detail.viewmodel.SportRecordDetailViewModel$loadCommonGpsValue$2$gpsValuesTask$1", f = "SportRecordDetailViewModel.kt", i = {}, l = {387}, m = "invokeSuspend", n = {}, s = {})
public final class SportRecordDetailViewModel$loadCommonGpsValue$2$gpsValuesTask$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super GpsValues>, Object> {
    final /* synthetic */ List<Object> $gpsObject;
    final /* synthetic */ List<Object> $pauseRecordList;
    final /* synthetic */ SportBasicReport $report;
    final /* synthetic */ List<Object> $tgcData;
    int label;
    final /* synthetic */ SportRecordDetailViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SportRecordDetailViewModel$loadCommonGpsValue$2$gpsValuesTask$1(SportRecordDetailViewModel sportRecordDetailViewModel, SportBasicReport sportBasicReport, List<? extends Object> list, List<? extends Object> list2, List<? extends Object> list3, Continuation<? super SportRecordDetailViewModel$loadCommonGpsValue$2$gpsValuesTask$1> continuation) {
        super(2, continuation);
        this.this$0 = sportRecordDetailViewModel;
        this.$report = sportBasicReport;
        this.$pauseRecordList = list;
        this.$tgcData = list2;
        this.$gpsObject = list3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SportRecordDetailViewModel$loadCommonGpsValue$2$gpsValuesTask$1(this.this$0, this.$report, this.$pauseRecordList, this.$tgcData, this.$gpsObject, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            SportRecordDetailViewModel sportRecordDetailViewModel = this.this$0;
            SportBasicReport sportBasicReport = this.$report;
            List<Object> list = this.$pauseRecordList;
            List<Object> list2 = this.$tgcData;
            Intrinsics.checkNotNull(list2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.ByteArray>");
            List<Object> list3 = this.$gpsObject;
            this.label = 1;
            obj = sportRecordDetailViewModel.createGpsValue(sportBasicReport, list, list2, list3, this);
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
        return ((SportRecordDetailViewModel$loadCommonGpsValue$2$gpsValuesTask$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
