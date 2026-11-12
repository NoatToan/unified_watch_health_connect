package androidx.health.connect.client.impl;

import android.health.connect.AggregateRecordsGroupedByDurationResponse;
import androidx.core.os.OutcomeReceiverKt;
import androidx.health.connect.client.impl.platform.request.RequestConvertersKt;
import androidx.health.connect.client.request.AggregateGroupByDurationRequest;
import defpackage.createFailure;
import defpackage.probeCoroutineCreated;
import defpackage.yzc;
import defpackage.zbg;
import defpackage.zgf;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \u0010\u0000\u001a^\u0012(\u0012&\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0012\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u0002 \u0004*.\u0012(\u0012&\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0012\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u0002\u0018\u00010\u00050\u0001H\n"}, d2 = {"<anonymous>", "", "Landroid/health/connect/AggregateRecordsGroupedByDurationResponse;", "", "kotlin.jvm.PlatformType", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "androidx.health.connect.client.impl.HealthConnectClientUpsideDownImpl$aggregateGroupByDuration$platformResponse$1", f = "HealthConnectClientUpsideDownImpl.kt", i = {}, l = {634}, m = "invokeSuspend", n = {}, s = {})
final class HealthConnectClientUpsideDownImpl$aggregateGroupByDuration$platformResponse$1 extends SuspendLambda implements Function1<Continuation<? super List<AggregateRecordsGroupedByDurationResponse<Object>>>, Object> {
    final /* synthetic */ AggregateGroupByDurationRequest $request;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ HealthConnectClientUpsideDownImpl this$0;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objA = zbg.a();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            createFailure.c(obj);
            return obj;
        }
        createFailure.c(obj);
        HealthConnectClientUpsideDownImpl healthConnectClientUpsideDownImpl = this.this$0;
        AggregateGroupByDurationRequest aggregateGroupByDurationRequest = this.$request;
        this.L$0 = healthConnectClientUpsideDownImpl;
        this.L$1 = aggregateGroupByDurationRequest;
        this.label = 1;
        HealthConnectClientUpsideDownImpl$aggregateGroupByDuration$platformResponse$1 healthConnectClientUpsideDownImpl$aggregateGroupByDuration$platformResponse$1 = this;
        zgf zgfVar = new zgf(zbg.c(healthConnectClientUpsideDownImpl$aggregateGroupByDuration$platformResponse$1), 1);
        zgfVar.initCancellability();
        healthConnectClientUpsideDownImpl.healthConnectManager.aggregateGroupByDuration(RequestConvertersKt.toPlatformRequest(aggregateGroupByDurationRequest), aggregateGroupByDurationRequest.getTimeRangeSlicer(), healthConnectClientUpsideDownImpl.executor, OutcomeReceiverKt.asOutcomeReceiver(zgfVar));
        Object objB = zgfVar.b();
        if (objB == zbg.a()) {
            probeCoroutineCreated.e(healthConnectClientUpsideDownImpl$aggregateGroupByDuration$platformResponse$1);
        }
        return objB == objA ? objA : objB;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super List<AggregateRecordsGroupedByDurationResponse<Object>>> continuation) {
        return ((HealthConnectClientUpsideDownImpl$aggregateGroupByDuration$platformResponse$1) create(continuation)).invokeSuspend(yzc.e);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<yzc> create(Continuation<?> continuation) {
        return new HealthConnectClientUpsideDownImpl$aggregateGroupByDuration$platformResponse$1(this.this$0, this.$request, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HealthConnectClientUpsideDownImpl$aggregateGroupByDuration$platformResponse$1(HealthConnectClientUpsideDownImpl healthConnectClientUpsideDownImpl, AggregateGroupByDurationRequest aggregateGroupByDurationRequest, Continuation<? super HealthConnectClientUpsideDownImpl$aggregateGroupByDuration$platformResponse$1> continuation) {
        super(1, continuation);
        this.this$0 = healthConnectClientUpsideDownImpl;
        this.$request = aggregateGroupByDurationRequest;
    }
}
