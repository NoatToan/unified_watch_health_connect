package com.xiaomi.hm.health.ui.smartplay.btphone.btphone;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0001*\u00020\u0000H\u008a@¨\u0006\u0002"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "com/xiaomi/hm/health/utils/ex/CoroutinesExtsKt$safeLaunch$1", "<anonymous>"}, k = 3, mv = {1, 5, 1})
@DebugMetadata(c = "com.xiaomi.hm.health.ui.smartplay.btphone.btphone.BtPhoneSettingViewModel$checkFunctionNormal$$inlined$safeLaunch$1", f = "BtPhoneSettingViewModel.kt", i = {}, l = {25}, m = "invokeSuspend", n = {}, s = {})
public final class BtPhoneSettingViewModel$checkFunctionNormal$$inlined$safeLaunch$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int a;
    private /* synthetic */ Object b;
    public final /* synthetic */ BtPhoneSettingViewModel c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BtPhoneSettingViewModel$checkFunctionNormal$$inlined$safeLaunch$1(Continuation continuation, BtPhoneSettingViewModel btPhoneSettingViewModel) {
        super(2, continuation);
        this.c = btPhoneSettingViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        BtPhoneSettingViewModel$checkFunctionNormal$$inlined$safeLaunch$1 btPhoneSettingViewModel$checkFunctionNormal$$inlined$safeLaunch$1 = new BtPhoneSettingViewModel$checkFunctionNormal$$inlined$safeLaunch$1(continuation, this.c);
        btPhoneSettingViewModel$checkFunctionNormal$$inlined$safeLaunch$1.b = obj;
        return btPhoneSettingViewModel$checkFunctionNormal$$inlined$safeLaunch$1;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((BtPhoneSettingViewModel$checkFunctionNormal$$inlined$safeLaunch$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            if (this.c.needCheckPairStatus && this.c.btPhoneSetting.getDeviceEnable()) {
                this.c.needCheckPairStatus = false;
                BtPhoneSettingViewModel btPhoneSettingViewModel = this.c;
                this.a = 1;
                if (btPhoneSettingViewModel.e(true, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
