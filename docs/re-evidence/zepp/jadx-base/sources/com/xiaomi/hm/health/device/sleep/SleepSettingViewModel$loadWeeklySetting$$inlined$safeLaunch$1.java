package com.xiaomi.hm.health.device.sleep;

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

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0001*\u00020\u0000H\u008a@¨\u0006\u0002"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "com/xiaomi/hm/health/devicex/manage/coroutines/ExtKt$safeLaunch$1", "<anonymous>"}, k = 3, mv = {1, 5, 1})
@DebugMetadata(c = "com.xiaomi.hm.health.device.sleep.SleepSettingViewModel$loadWeeklySetting$$inlined$safeLaunch$1", f = "SleepSettingViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class SleepSettingViewModel$loadWeeklySetting$$inlined$safeLaunch$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int a;
    private /* synthetic */ Object b;
    public final /* synthetic */ SleepSettingViewModel c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SleepSettingViewModel$loadWeeklySetting$$inlined$safeLaunch$1(Continuation continuation, SleepSettingViewModel sleepSettingViewModel) {
        super(2, continuation);
        this.c = sleepSettingViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        SleepSettingViewModel$loadWeeklySetting$$inlined$safeLaunch$1 sleepSettingViewModel$loadWeeklySetting$$inlined$safeLaunch$1 = new SleepSettingViewModel$loadWeeklySetting$$inlined$safeLaunch$1(continuation, this.c);
        sleepSettingViewModel$loadWeeklySetting$$inlined$safeLaunch$1.b = obj;
        return sleepSettingViewModel$loadWeeklySetting$$inlined$safeLaunch$1;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((SleepSettingViewModel$loadWeeklySetting$$inlined$safeLaunch$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        a.getCOROUTINE_SUSPENDED();
        if (this.a != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        int i = 0;
        int length = this.c.weeklyBitSet.length();
        if (length > 0) {
            while (true) {
                int i2 = i + 1;
                this.c.weeklyBitSet.set(i, true);
                if (i2 >= length) {
                    break;
                }
                i = i2;
            }
        }
        this.c.weeklySwitchLiveData.postValue(this.c.weeklyBitSet);
        return Unit.INSTANCE;
    }
}
