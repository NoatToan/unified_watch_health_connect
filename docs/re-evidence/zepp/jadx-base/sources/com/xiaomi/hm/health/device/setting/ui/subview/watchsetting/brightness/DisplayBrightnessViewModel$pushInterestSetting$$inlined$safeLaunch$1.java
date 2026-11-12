package com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.brightness;

import com.huami.bluetooth.profile.channel.module.settings.primarydata.EnumData;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.Time;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.brightness.DisplayBrightnessViewModel.j;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0001*\u00020\u0000H\u008a@¨\u0006\u0002"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "com/xiaomi/hm/health/devicex/manage/coroutines/ExtKt$safeLaunch$1", "<anonymous>"}, k = 3, mv = {1, 5, 1})
@DebugMetadata(c = "com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.brightness.DisplayBrightnessViewModel$pushInterestSetting$$inlined$safeLaunch$1", f = "DisplayBrightnessViewModel.kt", i = {}, l = {64}, m = "invokeSuspend", n = {}, s = {})
public final class DisplayBrightnessViewModel$pushInterestSetting$$inlined$safeLaunch$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int a;
    private /* synthetic */ Object b;
    public final /* synthetic */ DisplayBrightnessViewModel c;
    public final /* synthetic */ HashMap d;
    public final /* synthetic */ EnumData e;
    public final /* synthetic */ Time f;
    public final /* synthetic */ Time g;
    public final /* synthetic */ EnumData h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DisplayBrightnessViewModel$pushInterestSetting$$inlined$safeLaunch$1(Continuation continuation, DisplayBrightnessViewModel displayBrightnessViewModel, HashMap map, EnumData enumData, Time time, Time time2, EnumData enumData2) {
        super(2, continuation);
        this.c = displayBrightnessViewModel;
        this.d = map;
        this.e = enumData;
        this.f = time;
        this.g = time2;
        this.h = enumData2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        DisplayBrightnessViewModel$pushInterestSetting$$inlined$safeLaunch$1 displayBrightnessViewModel$pushInterestSetting$$inlined$safeLaunch$1 = new DisplayBrightnessViewModel$pushInterestSetting$$inlined$safeLaunch$1(continuation, this.c, this.d, this.e, this.f, this.g, this.h);
        displayBrightnessViewModel$pushInterestSetting$$inlined$safeLaunch$1.b = obj;
        return displayBrightnessViewModel$pushInterestSetting$$inlined$safeLaunch$1;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((DisplayBrightnessViewModel$pushInterestSetting$$inlined$safeLaunch$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineDispatcher io2 = Dispatchers.getIO();
            DisplayBrightnessViewModel.j jVar = this.c.new j(this.d, this.e, this.f, this.g, this.h, null);
            this.a = 1;
            if (BuildersKt.withContext(io2, jVar, this) == coroutine_suspended) {
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
