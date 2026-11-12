package com.xiaomi.fitness.devicesettings.common.contact;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.xiaomi.fitness.devicesettings.common.contact.TopContactViewModel$getContactListFromDevice$1$onSuccess$3", f = "TopContactViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class TopContactViewModel$getContactListFromDevice$1$onSuccess$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function0<Unit> $fail;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TopContactViewModel$getContactListFromDevice$1$onSuccess$3(Function0<Unit> function0, Continuation<? super TopContactViewModel$getContactListFromDevice$1$onSuccess$3> continuation) {
        super(2, continuation);
        this.$fail = function0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TopContactViewModel$getContactListFromDevice$1$onSuccess$3(this.$fail, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        this.$fail.invoke();
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TopContactViewModel$getContactListFromDevice$1$onSuccess$3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
