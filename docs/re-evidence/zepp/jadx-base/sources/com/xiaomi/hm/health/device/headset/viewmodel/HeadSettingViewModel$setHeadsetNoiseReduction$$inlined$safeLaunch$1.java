package com.xiaomi.hm.health.device.headset.viewmodel;

import com.huami.bluetooth.device.HeadsetDevice;
import com.huami.bluetooth.profile.ecf.data.NoiseControl;
import com.xiaomi.hm.health.device.headset.vo.NoiseReductionModeVo;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0001*\u00020\u0000H\u008a@¨\u0006\u0002"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "com/xiaomi/hm/health/devicex/manage/coroutines/ExtKt$safeLaunch$2", "<anonymous>"}, k = 3, mv = {1, 5, 1})
@DebugMetadata(c = "com.xiaomi.hm.health.device.headset.viewmodel.HeadSettingViewModel$setHeadsetNoiseReduction$$inlined$safeLaunch$1", f = "HeadSettingViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class HeadSettingViewModel$setHeadsetNoiseReduction$$inlined$safeLaunch$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int a;
    private /* synthetic */ Object b;
    public final /* synthetic */ HeadSettingViewModel c;
    public final /* synthetic */ NoiseControl d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HeadSettingViewModel$setHeadsetNoiseReduction$$inlined$safeLaunch$1(Continuation continuation, HeadSettingViewModel headSettingViewModel, NoiseControl noiseControl) {
        super(2, continuation);
        this.c = headSettingViewModel;
        this.d = noiseControl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        HeadSettingViewModel$setHeadsetNoiseReduction$$inlined$safeLaunch$1 headSettingViewModel$setHeadsetNoiseReduction$$inlined$safeLaunch$1 = new HeadSettingViewModel$setHeadsetNoiseReduction$$inlined$safeLaunch$1(continuation, this.c, this.d);
        headSettingViewModel$setHeadsetNoiseReduction$$inlined$safeLaunch$1.b = obj;
        return headSettingViewModel$setHeadsetNoiseReduction$$inlined$safeLaunch$1;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((HeadSettingViewModel$setHeadsetNoiseReduction$$inlined$safeLaunch$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Boolean boolBoxBoolean;
        a.getCOROUTINE_SUSPENDED();
        if (this.a != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        HeadsetDevice headsetDevice = (HeadsetDevice) this.c.f();
        boolean zBooleanValue = (headsetDevice == null || (boolBoxBoolean = Boxing.boxBoolean(headsetDevice.setNoiseControl(this.d))) == null) ? false : boolBoxBoolean.booleanValue();
        if (zBooleanValue) {
            NoiseReductionModeVo noiseReductionModeVo = (NoiseReductionModeVo) this.c._noiseControl.getValue();
            if (noiseReductionModeVo != null) {
                noiseReductionModeVo.setNoiseControl(this.d);
            }
        } else {
            NoiseReductionModeVo noiseReductionModeVo2 = (NoiseReductionModeVo) this.c._noiseControl.getValue();
            this.c._noiseControl.postValue(noiseReductionModeVo2 != null ? NoiseReductionModeVo.copy$default(noiseReductionModeVo2, null, false, 3, null) : null);
        }
        this.c.a(zBooleanValue);
        return Unit.INSTANCE;
    }
}
