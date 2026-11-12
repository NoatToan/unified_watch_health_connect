package com.xiaomi.hm.health.ui.smartplay.btphone.btphone;

import com.xiaomi.hm.health.utils.ex.LiveDataExKt;
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
@DebugMetadata(c = "com.xiaomi.hm.health.ui.smartplay.btphone.btphone.BtPhoneSettingViewModel$special$$inlined$safeLaunch$1", f = "BtPhoneSettingViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class BtPhoneSettingViewModel$special$$inlined$safeLaunch$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int a;
    private /* synthetic */ Object b;
    public final /* synthetic */ BtPhoneSettingViewModel c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BtPhoneSettingViewModel$special$$inlined$safeLaunch$1(Continuation continuation, BtPhoneSettingViewModel btPhoneSettingViewModel) {
        super(2, continuation);
        this.c = btPhoneSettingViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        BtPhoneSettingViewModel$special$$inlined$safeLaunch$1 btPhoneSettingViewModel$special$$inlined$safeLaunch$1 = new BtPhoneSettingViewModel$special$$inlined$safeLaunch$1(continuation, this.c);
        btPhoneSettingViewModel$special$$inlined$safeLaunch$1.b = obj;
        return btPhoneSettingViewModel$special$$inlined$safeLaunch$1;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((BtPhoneSettingViewModel$special$$inlined$safeLaunch$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        a.getCOROUTINE_SUSPENDED();
        if (this.a != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        this.c.g();
        LiveDataExKt.put(this.c.getBtPhoneSettingLiveData(), this.c.btPhoneSetting);
        CompletableDeferred completableDeferred = this.c.waitForInitBlock;
        Unit unit = Unit.INSTANCE;
        completableDeferred.complete(unit);
        return unit;
    }
}
