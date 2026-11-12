package com.xiaomi.fitness.devicesettings.base.unlock.phone;

import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.settingitem.settingitem.UnlockScreenType;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.xiaomi.fitness.devicesettings.base.unlock.phone.UnlockPhoneViewModel$getUnlockScreenType$1$1", f = "UnlockPhoneViewModel.kt", i = {}, l = {126}, m = "invokeSuspend", n = {}, s = {})
public final class UnlockPhoneViewModel$getUnlockScreenType$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ WearableDeviceModel $device;
    int label;
    final /* synthetic */ UnlockPhoneViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnlockPhoneViewModel$getUnlockScreenType$1$1(UnlockPhoneViewModel unlockPhoneViewModel, WearableDeviceModel wearableDeviceModel, Continuation<? super UnlockPhoneViewModel$getUnlockScreenType$1$1> continuation) {
        super(2, continuation);
        this.this$0 = unlockPhoneViewModel;
        this.$device = wearableDeviceModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UnlockPhoneViewModel$getUnlockScreenType$1$1(this.this$0, this.$device, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineDispatcher io2 = Dispatchers.getIO();
            UnlockPhoneViewModel$getUnlockScreenType$1$1$type$1 unlockPhoneViewModel$getUnlockScreenType$1$1$type$1 = new UnlockPhoneViewModel$getUnlockScreenType$1$1$type$1(this.$device, null);
            this.label = 1;
            obj = BuildersKt.withContext(io2, unlockPhoneViewModel$getUnlockScreenType$1$1$type$1, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        UnlockScreenType unlockScreenType = (UnlockScreenType) obj;
        if (unlockScreenType != null) {
            this.this$0.getUnlockDistanceRightValue().postValue(Boxing.boxInt(unlockScreenType.getUnlockScreenType()));
        } else {
            this.this$0.getUnlockDistanceRightValue().postValue(Boxing.boxInt(1));
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((UnlockPhoneViewModel$getUnlockScreenType$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
