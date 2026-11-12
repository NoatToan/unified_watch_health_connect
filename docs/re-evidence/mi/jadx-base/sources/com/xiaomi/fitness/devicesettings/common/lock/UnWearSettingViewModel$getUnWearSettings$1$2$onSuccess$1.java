package com.xiaomi.fitness.devicesettings.common.lock;

import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import defpackage.axo;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.xiaomi.fitness.devicesettings.common.lock.UnWearSettingViewModel$getUnWearSettings$1$2$onSuccess$1", f = "UnWearSettingViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class UnWearSettingViewModel$getUnWearSettings$1$2$onSuccess$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ axo $lockScreen;
    final /* synthetic */ Function1<Boolean, Unit> $success;
    int label;
    final /* synthetic */ UnWearSettingViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public UnWearSettingViewModel$getUnWearSettings$1$2$onSuccess$1(axo axoVar, Function1<? super Boolean, Unit> function1, UnWearSettingViewModel unWearSettingViewModel, Continuation<? super UnWearSettingViewModel$getUnWearSettings$1$2$onSuccess$1> continuation) {
        super(2, continuation);
        this.$lockScreen = axoVar;
        this.$success = function1;
        this.this$0 = unWearSettingViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UnWearSettingViewModel$getUnWearSettings$1$2$onSuccess$1(this.$lockScreen, this.$success, this.this$0, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        Logger.e("getUnWearSettings onSuccess lockScreen.status:" + this.$lockScreen.c + "  ismainThread:" + AppUtil.INSTANCE.isMainThread(), new Object[0]);
        int i = this.$lockScreen.c;
        if (i == 1) {
            this.$success.invoke2(Boxing.boxBoolean(false));
        } else if (i == 2) {
            this.$success.invoke2(Boxing.boxBoolean(true));
        } else if (i == 3) {
            this.this$0.setRequired(true);
            this.$success.invoke2(Boxing.boxBoolean(true));
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((UnWearSettingViewModel$getUnWearSettings$1$2$onSuccess$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
