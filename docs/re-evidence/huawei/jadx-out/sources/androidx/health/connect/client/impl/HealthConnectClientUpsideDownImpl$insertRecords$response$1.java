package androidx.health.connect.client.impl;

import android.health.connect.HealthConnectManager;
import android.health.connect.InsertRecordsResponse;
import androidx.core.os.OutcomeReceiverKt;
import androidx.health.connect.client.impl.platform.records.RecordConvertersKt;
import androidx.health.connect.client.records.Record;
import defpackage.createFailure;
import defpackage.probeCoroutineCreated;
import defpackage.yzc;
import defpackage.yzp;
import defpackage.zbg;
import defpackage.zgf;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n"}, d2 = {"<anonymous>", "Landroid/health/connect/InsertRecordsResponse;", "kotlin.jvm.PlatformType"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "androidx.health.connect.client.impl.HealthConnectClientUpsideDownImpl$insertRecords$response$1", f = "HealthConnectClientUpsideDownImpl.kt", i = {}, l = {634}, m = "invokeSuspend", n = {}, s = {})
final class HealthConnectClientUpsideDownImpl$insertRecords$response$1 extends SuspendLambda implements Function1<Continuation<? super InsertRecordsResponse>, Object> {
    final /* synthetic */ List<Record> $records;
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
        List<Record> list = this.$records;
        this.L$0 = healthConnectClientUpsideDownImpl;
        this.L$1 = list;
        this.label = 1;
        HealthConnectClientUpsideDownImpl$insertRecords$response$1 healthConnectClientUpsideDownImpl$insertRecords$response$1 = this;
        zgf zgfVar = new zgf(zbg.c(healthConnectClientUpsideDownImpl$insertRecords$response$1), 1);
        zgfVar.initCancellability();
        zgf zgfVar2 = zgfVar;
        HealthConnectManager healthConnectManager = healthConnectClientUpsideDownImpl.healthConnectManager;
        List<Record> list2 = list;
        ArrayList arrayList = new ArrayList(yzp.e(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(RecordConvertersKt.toPlatformRecord((Record) it.next()));
        }
        healthConnectManager.insertRecords(arrayList, healthConnectClientUpsideDownImpl.executor, OutcomeReceiverKt.asOutcomeReceiver(zgfVar2));
        Object objB = zgfVar.b();
        if (objB == zbg.a()) {
            probeCoroutineCreated.e(healthConnectClientUpsideDownImpl$insertRecords$response$1);
        }
        return objB == objA ? objA : objB;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super InsertRecordsResponse> continuation) {
        return ((HealthConnectClientUpsideDownImpl$insertRecords$response$1) create(continuation)).invokeSuspend(yzc.e);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<yzc> create(Continuation<?> continuation) {
        return new HealthConnectClientUpsideDownImpl$insertRecords$response$1(this.this$0, this.$records, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    HealthConnectClientUpsideDownImpl$insertRecords$response$1(HealthConnectClientUpsideDownImpl healthConnectClientUpsideDownImpl, List<? extends Record> list, Continuation<? super HealthConnectClientUpsideDownImpl$insertRecords$response$1> continuation) {
        super(1, continuation);
        this.this$0 = healthConnectClientUpsideDownImpl;
        this.$records = list;
    }
}
