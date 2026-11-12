package com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.brightness;

import com.huami.bluetooth.profile.channel.module.settings.entity.displayandbrightness.DisplayAndBrightness;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.repo.IWatchSettingRepo;
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
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0001*\u00020\u0000H\u008a@¨\u0006\u0002"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "com/xiaomi/hm/health/devicex/manage/coroutines/ExtKt$safeLaunch$2", "<anonymous>"}, k = 3, mv = {1, 5, 1})
@DebugMetadata(c = "com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.brightness.DisplayBrightnessViewModel$querySettings$$inlined$safeLaunch$1", f = "DisplayBrightnessViewModel.kt", i = {}, l = {64}, m = "invokeSuspend", n = {}, s = {})
public final class DisplayBrightnessViewModel$querySettings$$inlined$safeLaunch$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int a;
    private /* synthetic */ Object b;
    public final /* synthetic */ DisplayBrightnessViewModel c;
    public final /* synthetic */ boolean d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DisplayBrightnessViewModel$querySettings$$inlined$safeLaunch$1(Continuation continuation, DisplayBrightnessViewModel displayBrightnessViewModel, boolean z) {
        super(2, continuation);
        this.c = displayBrightnessViewModel;
        this.d = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        DisplayBrightnessViewModel$querySettings$$inlined$safeLaunch$1 displayBrightnessViewModel$querySettings$$inlined$safeLaunch$1 = new DisplayBrightnessViewModel$querySettings$$inlined$safeLaunch$1(continuation, this.c, this.d);
        displayBrightnessViewModel$querySettings$$inlined$safeLaunch$1.b = obj;
        return displayBrightnessViewModel$querySettings$$inlined$safeLaunch$1;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((DisplayBrightnessViewModel$querySettings$$inlined$safeLaunch$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            IWatchSettingRepo iWatchSettingRepoF = this.c.f();
            boolean z = this.d;
            this.a = 1;
            obj = iWatchSettingRepoF.queryDisplayBrightnessV1(z, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        DisplayAndBrightness displayAndBrightness = (DisplayAndBrightness) obj;
        if (displayAndBrightness != null) {
            this.c._displayBrightnessSetting.postValue(displayAndBrightness);
        }
        return Unit.INSTANCE;
    }
}
