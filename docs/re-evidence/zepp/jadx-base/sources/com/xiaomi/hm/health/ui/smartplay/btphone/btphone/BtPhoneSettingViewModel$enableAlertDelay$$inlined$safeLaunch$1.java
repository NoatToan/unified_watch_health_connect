package com.xiaomi.hm.health.ui.smartplay.btphone.btphone;

import com.huami.tools.log.HMLog;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0001*\u00020\u0000H\u008a@¨\u0006\u0002"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "com/xiaomi/hm/health/utils/ex/CoroutinesExtsKt$safeLaunch$1", "<anonymous>"}, k = 3, mv = {1, 5, 1})
@DebugMetadata(c = "com.xiaomi.hm.health.ui.smartplay.btphone.btphone.BtPhoneSettingViewModel$enableAlertDelay$$inlined$safeLaunch$1", f = "BtPhoneSettingViewModel.kt", i = {}, l = {24, 26}, m = "invokeSuspend", n = {}, s = {})
public final class BtPhoneSettingViewModel$enableAlertDelay$$inlined$safeLaunch$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int a;
    private /* synthetic */ Object b;
    public final /* synthetic */ BtPhoneSettingViewModel c;
    public final /* synthetic */ boolean d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BtPhoneSettingViewModel$enableAlertDelay$$inlined$safeLaunch$1(Continuation continuation, BtPhoneSettingViewModel btPhoneSettingViewModel, boolean z) {
        super(2, continuation);
        this.c = btPhoneSettingViewModel;
        this.d = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        BtPhoneSettingViewModel$enableAlertDelay$$inlined$safeLaunch$1 btPhoneSettingViewModel$enableAlertDelay$$inlined$safeLaunch$1 = new BtPhoneSettingViewModel$enableAlertDelay$$inlined$safeLaunch$1(continuation, this.c, this.d);
        btPhoneSettingViewModel$enableAlertDelay$$inlined$safeLaunch$1.b = obj;
        return btPhoneSettingViewModel$enableAlertDelay$$inlined$safeLaunch$1;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((BtPhoneSettingViewModel$enableAlertDelay$$inlined$safeLaunch$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0063  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i != 0) {
            if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            if (((Boolean) obj).booleanValue()) {
                BtPhoneSettingViewModel.j(this.c, false, 1, null);
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        HMLog.info("BtPhoneSettingViewModel", new BtPhoneSettingViewModel.g(this.d));
        CompletableDeferred completableDeferred = this.c.waitForInitBlock;
        this.a = 1;
        if (completableDeferred.await(this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        int delayTime = this.c.btPhoneSetting.getUserSetting().getDelayTime();
        BtPhoneSettingViewModel btPhoneSettingViewModel = this.c;
        boolean z = this.d;
        this.a = 2;
        obj = btPhoneSettingViewModel.k(z, delayTime, this);
        if (obj == coroutine_suspended) {
            return coroutine_suspended;
        }
        if (((Boolean) obj).booleanValue()) {
            BtPhoneSettingViewModel.j(this.c, false, 1, null);
        }
        return Unit.INSTANCE;
    }
}
