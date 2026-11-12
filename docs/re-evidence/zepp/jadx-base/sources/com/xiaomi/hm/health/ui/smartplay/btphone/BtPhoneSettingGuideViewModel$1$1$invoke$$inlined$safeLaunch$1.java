package com.xiaomi.hm.health.ui.smartplay.btphone;

import com.huami.bluetooth.profile.channel.module.phone.PairStatus;
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
@DebugMetadata(c = "com.xiaomi.hm.health.ui.smartplay.btphone.BtPhoneSettingGuideViewModel$1$1$invoke$$inlined$safeLaunch$1", f = "BtPhoneSettingGuideViewModel.kt", i = {}, l = {23}, m = "invokeSuspend", n = {}, s = {})
public final class BtPhoneSettingGuideViewModel$1$1$invoke$$inlined$safeLaunch$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int a;
    private /* synthetic */ Object b;
    public final /* synthetic */ BtPhoneSettingGuideViewModel c;
    public final /* synthetic */ PairStatus d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BtPhoneSettingGuideViewModel$1$1$invoke$$inlined$safeLaunch$1(Continuation continuation, BtPhoneSettingGuideViewModel btPhoneSettingGuideViewModel, PairStatus pairStatus) {
        super(2, continuation);
        this.c = btPhoneSettingGuideViewModel;
        this.d = pairStatus;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        BtPhoneSettingGuideViewModel$1$1$invoke$$inlined$safeLaunch$1 btPhoneSettingGuideViewModel$1$1$invoke$$inlined$safeLaunch$1 = new BtPhoneSettingGuideViewModel$1$1$invoke$$inlined$safeLaunch$1(continuation, this.c, this.d);
        btPhoneSettingGuideViewModel$1$1$invoke$$inlined$safeLaunch$1.b = obj;
        return btPhoneSettingGuideViewModel$1$1$invoke$$inlined$safeLaunch$1;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((BtPhoneSettingGuideViewModel$1$1$invoke$$inlined$safeLaunch$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            BtPhoneSettingGuideViewModel btPhoneSettingGuideViewModel = this.c;
            PairStatus pairStatus = this.d;
            this.a = 1;
            if (btPhoneSettingGuideViewModel.e(pairStatus, this) == coroutine_suspended) {
                return coroutine_suspended;
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
