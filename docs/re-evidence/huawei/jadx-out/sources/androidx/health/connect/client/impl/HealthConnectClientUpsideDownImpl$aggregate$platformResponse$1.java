package androidx.health.connect.client.impl;

import android.health.connect.AggregateRecordsResponse;
import androidx.core.os.OutcomeReceiverKt;
import androidx.health.connect.client.impl.platform.request.RequestConvertersKt;
import androidx.health.connect.client.request.AggregateRequest;
import defpackage.createFailure;
import defpackage.probeCoroutineCreated;
import defpackage.yzc;
import defpackage.zbg;
import defpackage.zgf;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u0001H\n"}, d2 = {"<anonymous>", "Landroid/health/connect/AggregateRecordsResponse;", "", "kotlin.jvm.PlatformType"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "androidx.health.connect.client.impl.HealthConnectClientUpsideDownImpl$aggregate$platformResponse$1", f = "HealthConnectClientUpsideDownImpl.kt", i = {}, l = {634}, m = "invokeSuspend", n = {}, s = {})
final class HealthConnectClientUpsideDownImpl$aggregate$platformResponse$1 extends SuspendLambda implements Function1<Continuation<? super AggregateRecordsResponse<Object>>, Object> {
    final /* synthetic */ AggregateRequest $request;
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
        AggregateRequest aggregateRequest = this.$request;
        this.L$0 = healthConnectClientUpsideDownImpl;
        this.L$1 = aggregateRequest;
        this.label = 1;
        HealthConnectClientUpsideDownImpl$aggregate$platformResponse$1 healthConnectClientUpsideDownImpl$aggregate$platformResponse$1 = this;
        zgf zgfVar = new zgf(zbg.c(healthConnectClientUpsideDownImpl$aggregate$platformResponse$1), 1);
        zgfVar.initCancellability();
        healthConnectClientUpsideDownImpl.healthConnectManager.aggregate(RequestConvertersKt.toPlatformRequest(aggregateRequest), healthConnectClientUpsideDownImpl.executor, OutcomeReceiverKt.asOutcomeReceiver(zgfVar));
        Object objB = zgfVar.b();
        if (objB == zbg.a()) {
            probeCoroutineCreated.e(healthConnectClientUpsideDownImpl$aggregate$platformResponse$1);
        }
        return objB == objA ? objA : objB;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super AggregateRecordsResponse<Object>> continuation) {
        return ((HealthConnectClientUpsideDownImpl$aggregate$platformResponse$1) create(continuation)).invokeSuspend(yzc.e);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<yzc> create(Continuation<?> continuation) {
        return new HealthConnectClientUpsideDownImpl$aggregate$platformResponse$1(this.this$0, this.$request, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HealthConnectClientUpsideDownImpl$aggregate$platformResponse$1(HealthConnectClientUpsideDownImpl healthConnectClientUpsideDownImpl, AggregateRequest aggregateRequest, Continuation<? super HealthConnectClientUpsideDownImpl$aggregate$platformResponse$1> continuation) {
        super(1, continuation);
        this.this$0 = healthConnectClientUpsideDownImpl;
        this.$request = aggregateRequest;
    }
}
