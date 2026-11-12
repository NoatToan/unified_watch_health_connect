package com.xiaomi.fitness.milink.util;

import com.xiaomi.fitness.milink.circulate.PhoneDeviceController;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.xiaomi.fitness.milink.util.MilinkHelper$syncEmptyLocalPhoneToDeviceInternal$1$1", f = "MilinkHelper.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class MilinkHelper$syncEmptyLocalPhoneToDeviceInternal$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ PhoneDeviceController $cacheController;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MilinkHelper$syncEmptyLocalPhoneToDeviceInternal$1$1(PhoneDeviceController phoneDeviceController, Continuation<? super MilinkHelper$syncEmptyLocalPhoneToDeviceInternal$1$1> continuation) {
        super(2, continuation);
        this.$cacheController = phoneDeviceController;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MilinkHelper$syncEmptyLocalPhoneToDeviceInternal$1$1(this.$cacheController, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        MilinkExtKt.syncShareDevice(CollectionsKt__CollectionsKt.mutableListOf(this.$cacheController));
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MilinkHelper$syncEmptyLocalPhoneToDeviceInternal$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
