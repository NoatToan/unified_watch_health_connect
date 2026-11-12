package com.xiaomi.fitness.device.contact.remote;

import android.os.DeadObjectException;
import com.xiaomi.fitness.device.contact.extensions.DeviceSyncExtKt;
import com.xiaomi.wearable.core.WearApiResult;
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
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.xiaomi.fitness.device.contact.remote.ContactTaskQueue$callback$1$onCallback$1", f = "ContactTaskQueue.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class ContactTaskQueue$callback$1$onCallback$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ContactCallTask $callTask;
    final /* synthetic */ WearApiResult $result;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContactTaskQueue$callback$1$onCallback$1(WearApiResult wearApiResult, ContactCallTask contactCallTask, Continuation<? super ContactTaskQueue$callback$1$onCallback$1> continuation) {
        super(2, continuation);
        this.$result = wearApiResult;
        this.$callTask = contactCallTask;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ContactTaskQueue$callback$1$onCallback$1(this.$result, this.$callTask, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        try {
            if (this.$result == null) {
                this.$callTask.onReceiveResponse(-2, null);
            } else if (this.$callTask.getNeedResponse()) {
                DeviceSyncExtKt.logi("call task callback need response true");
                if (this.$result.a() == -1 || this.$result.a() == -6) {
                    this.$callTask.onResponseTimeout();
                }
            } else {
                this.$callTask.onReceiveResponse(this.$result.a(), null);
            }
        } catch (DeadObjectException unused) {
            DeviceSyncExtKt.loge("process is dead");
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ContactTaskQueue$callback$1$onCallback$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
