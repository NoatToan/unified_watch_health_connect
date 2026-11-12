package com.xiaomi.hm.health.device.headset.viewmodel;

import com.huami.bluetooth.device.MozartDevice;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0001*\u00020\u0000H\u008a@¨\u0006\u0002"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "com/xiaomi/hm/health/devicex/manage/coroutines/ExtKt$safeLaunch$2", "<anonymous>"}, k = 3, mv = {1, 5, 1})
@DebugMetadata(c = "com.xiaomi.hm.health.device.headset.viewmodel.HeadsetHearingHealthViewModel$setHearingHealth$$inlined$safeLaunch$1", f = "HeadsetHearingHealthViewModel.kt", i = {}, l = {67}, m = "invokeSuspend", n = {}, s = {})
public final class HeadsetHearingHealthViewModel$setHearingHealth$$inlined$safeLaunch$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int a;
    private /* synthetic */ Object b;
    public final /* synthetic */ HMBaseDevice c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ HeadsetHearingHealthViewModel e;
    public final /* synthetic */ Function1 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HeadsetHearingHealthViewModel$setHearingHealth$$inlined$safeLaunch$1(Continuation continuation, HMBaseDevice hMBaseDevice, boolean z, HeadsetHearingHealthViewModel headsetHearingHealthViewModel, Function1 function1) {
        super(2, continuation);
        this.c = hMBaseDevice;
        this.d = z;
        this.e = headsetHearingHealthViewModel;
        this.f = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        HeadsetHearingHealthViewModel$setHearingHealth$$inlined$safeLaunch$1 headsetHearingHealthViewModel$setHearingHealth$$inlined$safeLaunch$1 = new HeadsetHearingHealthViewModel$setHearingHealth$$inlined$safeLaunch$1(continuation, this.c, this.d, this.e, this.f);
        headsetHearingHealthViewModel$setHearingHealth$$inlined$safeLaunch$1.b = obj;
        return headsetHearingHealthViewModel$setHearingHealth$$inlined$safeLaunch$1;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((HeadsetHearingHealthViewModel$setHearingHealth$$inlined$safeLaunch$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            MozartDevice mozartDevice = (MozartDevice) this.c;
            this.e._writingResult.postValue(mozartDevice == null ? null : Boxing.boxBoolean(mozartDevice.setHearingHealth(this.d)));
            MozartDevice mozartDevice2 = (MozartDevice) this.c;
            Boolean boolBoxBoolean = mozartDevice2 == null ? null : Boxing.boxBoolean(mozartDevice2.setReportHeadsetInfoSwitch(this.d));
            MainCoroutineDispatcher main = Dispatchers.getMain();
            HeadsetHearingHealthViewModel.d dVar = new HeadsetHearingHealthViewModel.d(this.f, boolBoxBoolean, null);
            this.a = 1;
            if (BuildersKt.withContext(main, dVar, this) == coroutine_suspended) {
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
