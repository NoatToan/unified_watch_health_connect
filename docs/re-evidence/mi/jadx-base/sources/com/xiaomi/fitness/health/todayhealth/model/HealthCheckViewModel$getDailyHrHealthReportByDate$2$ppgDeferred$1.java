package com.xiaomi.fitness.health.todayhealth.model;

import com.mi.fitness.persist.server.data.GetProjectByTimeResponse;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lcom/mi/fitness/persist/server/data/GetProjectByTimeResponse;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.xiaomi.fitness.health.todayhealth.model.HealthCheckViewModel$getDailyHrHealthReportByDate$2$ppgDeferred$1", f = "HealthCheckViewModel.kt", i = {0}, l = {670}, m = "invokeSuspend", n = {"combinedData"}, s = {"L$0"})
public final class HealthCheckViewModel$getDailyHrHealthReportByDate$2$ppgDeferred$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super GetProjectByTimeResponse>, Object> {
    final /* synthetic */ long $endMillis;
    final /* synthetic */ long $startMillis;
    Object L$0;
    int label;
    final /* synthetic */ HealthCheckViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HealthCheckViewModel$getDailyHrHealthReportByDate$2$ppgDeferred$1(HealthCheckViewModel healthCheckViewModel, long j, long j2, Continuation<? super HealthCheckViewModel$getDailyHrHealthReportByDate$2$ppgDeferred$1> continuation) {
        super(2, continuation);
        this.this$0 = healthCheckViewModel;
        this.$startMillis = j;
        this.$endMillis = j2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new HealthCheckViewModel$getDailyHrHealthReportByDate$2$ppgDeferred$1(this.this$0, this.$startMillis, this.$endMillis, continuation);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0025  */
    /* JADX WARN: Code duplicated, block: B:13:0x004e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:16:0x0053  */
    /* JADX WARN: Code duplicated, block: B:18:0x0059  */
    /* JADX WARN: Code duplicated, block: B:21:0x0070  */
    /* JADX WARN: Code duplicated, block: B:23:0x0073  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x004c -> B:6:0x0013). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:18:0x0059
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r14.label
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L1d
            if (r1 != r2) goto L15
            java.lang.Object r1 = r14.L$0
            com.mi.fitness.persist.server.data.GetProjectByTimeResponse r1 = (com.mi.fitness.persist.server.data.GetProjectByTimeResponse) r1
            kotlin.ResultKt.throwOnFailure(r15)
        L13:
            r4 = r1
            goto L4f
        L15:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L1d:
            kotlin.ResultKt.throwOnFailure(r15)
            r15 = r2
            r1 = r3
            r10 = r1
        L23:
            if (r15 == 0) goto L7e
            com.xiaomi.fitness.health.todayhealth.model.HealthCheckViewModel r15 = r14.this$0
            com.xiaomi.fitness.health.todayhealth.service.HealthCheckRequest r15 = com.xiaomi.fitness.health.todayhealth.model.HealthCheckViewModel.access$getHealthCheckRequest(r15)
            com.mi.fitness.persist.server.data.GetProjectByTimeParams r13 = new com.mi.fitness.persist.server.data.GetProjectByTimeParams
            long r4 = r14.$startMillis
            java.lang.Long r6 = kotlin.coroutines.jvm.internal.Boxing.boxLong(r4)
            long r4 = r14.$endMillis
            java.lang.Long r7 = kotlin.coroutines.jvm.internal.Boxing.boxLong(r4)
            r11 = 8
            r12 = 0
            java.lang.String r5 = "ppg"
            r8 = 0
            r9 = 1
            r4 = r13
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
            r14.L$0 = r1
            r14.label = r2
            java.lang.Object r15 = r15.getProjectDataByTime(r13, r14)
            if (r15 != r0) goto L13
            return r0
        L4f:
            com.mi.fitness.persist.server.data.GetProjectByTimeResponse r15 = (com.mi.fitness.persist.server.data.GetProjectByTimeResponse) r15
            if (r4 == 0) goto L73
            java.util.List r1 = r15.getDataList()
            if (r1 == 0) goto L70
            java.util.List r5 = r4.getDataList()
            if (r5 == 0) goto L70
            java.util.Collection r5 = (java.util.Collection) r5
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.List r5 = kotlin.collections.CollectionsKt.plus(r5, r1)
            r8 = 6
            r9 = 0
            r6 = 0
            r7 = 0
            com.mi.fitness.persist.server.data.GetProjectByTimeResponse r1 = com.mi.fitness.persist.server.data.GetProjectByTimeResponse.copy$default(r4, r5, r6, r7, r8, r9)
            goto L71
        L70:
            r1 = r3
        L71:
            if (r1 != 0) goto L74
        L73:
            r1 = r15
        L74:
            boolean r4 = r15.getHasMore()
            java.lang.String r10 = r15.getNextKey()
            r15 = r4
            goto L23
        L7e:
            if (r1 != 0) goto L8a
            com.mi.fitness.persist.server.data.GetProjectByTimeResponse r1 = new com.mi.fitness.persist.server.data.GetProjectByTimeResponse
            java.util.List r15 = kotlin.collections.CollectionsKt.emptyList()
            r0 = 0
            r1.<init>(r15, r3, r0)
        L8a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.fitness.health.todayhealth.model.HealthCheckViewModel$getDailyHrHealthReportByDate$2$ppgDeferred$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super GetProjectByTimeResponse> continuation) {
        return ((HealthCheckViewModel$getDailyHrHealthReportByDate$2$ppgDeferred$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
