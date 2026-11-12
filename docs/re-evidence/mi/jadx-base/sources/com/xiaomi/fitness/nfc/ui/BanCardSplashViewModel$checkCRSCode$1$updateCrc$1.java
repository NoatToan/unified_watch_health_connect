package com.xiaomi.fitness.nfc.ui;

import com.xiaomi.fitness.device.manager.export.HuamiApiCaller;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.xiaomi.fitness.nfc.ui.BanCardSplashViewModel$checkCRSCode$1$updateCrc$1", f = "BanCardSplashViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class BanCardSplashViewModel$checkCRSCode$1$updateCrc$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
    final /* synthetic */ HuamiApiCaller $huamiApiCaller;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BanCardSplashViewModel$checkCRSCode$1$updateCrc$1(HuamiApiCaller huamiApiCaller, Continuation<? super BanCardSplashViewModel$checkCRSCode$1$updateCrc$1> continuation) {
        super(2, continuation);
        this.$huamiApiCaller = huamiApiCaller;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BanCardSplashViewModel$checkCRSCode$1$updateCrc$1(this.$huamiApiCaller, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        HuamiApiCaller huamiApiCaller = this.$huamiApiCaller;
        Boolean boolBoxBoolean = huamiApiCaller != null ? Boxing.boxBoolean(huamiApiCaller.getCRSCode()) : null;
        return Boxing.boxBoolean(boolBoxBoolean != null ? boolBoxBoolean.booleanValue() : false);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
        return ((BanCardSplashViewModel$checkCRSCode$1$updateCrc$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
