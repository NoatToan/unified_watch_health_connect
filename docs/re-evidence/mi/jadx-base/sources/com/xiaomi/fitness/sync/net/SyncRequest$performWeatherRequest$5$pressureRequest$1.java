package com.xiaomi.fitness.sync.net;

import com.xiaomi.fitness.sync.export.model.PressureResp;
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

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fitness/sync/export/model/PressureResp;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.xiaomi.fitness.sync.net.SyncRequest$performWeatherRequest$5$pressureRequest$1", f = "SyncRequest.kt", i = {}, l = {529}, m = "invokeSuspend", n = {}, s = {})
public final class SyncRequest$performWeatherRequest$5$pressureRequest$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super PressureResp>, Object> {
    final /* synthetic */ String $pressureLocation;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SyncRequest$performWeatherRequest$5$pressureRequest$1(String str, Continuation<? super SyncRequest$performWeatherRequest$5$pressureRequest$1> continuation) {
        super(2, continuation);
        this.$pressureLocation = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SyncRequest$performWeatherRequest$5$pressureRequest$1(this.$pressureLocation, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            SyncApiService mService = SyncRequest.INSTANCE.getMService();
            String str = this.$pressureLocation;
            Intrinsics.checkNotNull(str);
            this.label = 1;
            obj = mService.getPressure(str, this);
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
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super PressureResp> continuation) {
        return ((SyncRequest$performWeatherRequest$5$pressureRequest$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
