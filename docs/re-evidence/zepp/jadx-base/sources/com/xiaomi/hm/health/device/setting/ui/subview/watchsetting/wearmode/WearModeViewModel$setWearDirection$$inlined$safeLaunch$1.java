package com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.wearmode;

import com.huami.bluetooth.profile.channel.module.settings.SettingsGroupType;
import com.huami.bluetooth.profile.channel.module.settings.SettingsModule;
import com.huami.bluetooth.profile.channel.module.settings.entity.wearingway.v2.WearingWayV2;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.EnumData;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.WatchSettingExtsKt;
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
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0001*\u00020\u0000H\u008a@¨\u0006\u0002"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "com/xiaomi/hm/health/devicex/manage/coroutines/ExtKt$safeLaunch$1", "<anonymous>"}, k = 3, mv = {1, 5, 1})
@DebugMetadata(c = "com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.wearmode.WearModeViewModel$setWearDirection$$inlined$safeLaunch$1", f = "WearModeViewModel.kt", i = {}, l = {64}, m = "invokeSuspend", n = {}, s = {})
public final class WearModeViewModel$setWearDirection$$inlined$safeLaunch$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int a;
    private /* synthetic */ Object b;
    public final /* synthetic */ WearModeViewModel c;
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WearModeViewModel$setWearDirection$$inlined$safeLaunch$1(Continuation continuation, WearModeViewModel wearModeViewModel, int i) {
        super(2, continuation);
        this.c = wearModeViewModel;
        this.d = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        WearModeViewModel$setWearDirection$$inlined$safeLaunch$1 wearModeViewModel$setWearDirection$$inlined$safeLaunch$1 = new WearModeViewModel$setWearDirection$$inlined$safeLaunch$1(continuation, this.c, this.d);
        wearModeViewModel$setWearDirection$$inlined$safeLaunch$1.b = obj;
        return wearModeViewModel$setWearDirection$$inlined$safeLaunch$1;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((WearModeViewModel$setWearDirection$$inlined$safeLaunch$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x004f  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
        int i = this.a;
        boolean zBooleanValue = false;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            SettingsModule settingsModule = this.c.settingsModule;
            if (settingsModule != null) {
                SettingsGroupType settingsGroupType = SettingsGroupType.WEARING;
                WearingWayV2 wearingWayV2 = new WearingWayV2();
                wearingWayV2.setWearingDirection(new EnumData(this.d));
                Unit unit = Unit.INSTANCE;
                this.a = 1;
                obj = WatchSettingExtsKt.write(settingsModule, settingsGroupType, wearingWayV2, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            if (zBooleanValue) {
                WearModeViewModel.updateWearWay$default(this.c, false, null, Boxing.boxInt(this.d), 2, null);
            }
            this.c.getResultLiveData().postValue(Boxing.boxBoolean(zBooleanValue));
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        Boolean bool = (Boolean) obj;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        }
        if (zBooleanValue) {
            WearModeViewModel.updateWearWay$default(this.c, false, null, Boxing.boxInt(this.d), 2, null);
        }
        this.c.getResultLiveData().postValue(Boxing.boxBoolean(zBooleanValue));
        return Unit.INSTANCE;
    }
}
