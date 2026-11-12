package com.xiaomi.fitness.detail.viewmodel;

import com.mi.health.map.data.GpsValues;
import com.xiaomi.fit.data.common.data.sport.Location;
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
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lcom/mi/health/map/data/GpsValues;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.xiaomi.fitness.detail.viewmodel.SportRecordDetailViewModel$loadCommonGpsValue$3$gpsValuesTask$1", f = "SportRecordDetailViewModel.kt", i = {}, l = {396}, m = "invokeSuspend", n = {}, s = {})
public final class SportRecordDetailViewModel$loadCommonGpsValue$3$gpsValuesTask$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super GpsValues>, Object> {
    final /* synthetic */ List<Location> $gpsList;
    final /* synthetic */ List<Object> $pauseRecordList;
    final /* synthetic */ SportBasicReport $report;
    int label;
    final /* synthetic */ SportRecordDetailViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SportRecordDetailViewModel$loadCommonGpsValue$3$gpsValuesTask$1(SportRecordDetailViewModel sportRecordDetailViewModel, List<? extends Location> list, SportBasicReport sportBasicReport, List<? extends Object> list2, Continuation<? super SportRecordDetailViewModel$loadCommonGpsValue$3$gpsValuesTask$1> continuation) {
        super(2, continuation);
        this.this$0 = sportRecordDetailViewModel;
        this.$gpsList = list;
        this.$report = sportBasicReport;
        this.$pauseRecordList = list2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SportRecordDetailViewModel$loadCommonGpsValue$3$gpsValuesTask$1(this.this$0, this.$gpsList, this.$report, this.$pauseRecordList, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            SportRecordDetailViewModel sportRecordDetailViewModel = this.this$0;
            List<Location> list = this.$gpsList;
            SportBasicReport sportBasicReport = this.$report;
            List<Object> list2 = this.$pauseRecordList;
            this.label = 1;
            obj = sportRecordDetailViewModel.createGpsValue(list, sportBasicReport, list2, this);
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
        return ((SportRecordDetailViewModel$loadCommonGpsValue$3$gpsValuesTask$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
