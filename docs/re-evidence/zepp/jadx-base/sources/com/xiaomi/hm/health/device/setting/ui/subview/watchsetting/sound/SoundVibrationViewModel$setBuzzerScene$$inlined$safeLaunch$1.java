package com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.sound;

import com.huami.bluetooth.profile.channel.module.settings.SettingsGroupType;
import com.huami.bluetooth.profile.channel.module.settings.SettingsModule;
import com.huami.bluetooth.profile.channel.module.settings.entity.soundandvibrate.v2.SoundAndVibrateV2;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.EnumArray;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.Settings;
import com.xiaomi.hm.health.device.setting.network.WatchSettingsManager;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.WatchSettingExtsKt;
import java.util.ArrayList;
import java.util.HashMap;
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
@DebugMetadata(c = "com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.sound.SoundVibrationViewModel$setBuzzerScene$$inlined$safeLaunch$1", f = "SoundVibrationViewModel.kt", i = {}, l = {64}, m = "invokeSuspend", n = {}, s = {})
public final class SoundVibrationViewModel$setBuzzerScene$$inlined$safeLaunch$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int a;
    private /* synthetic */ Object b;
    public final /* synthetic */ SoundVibrationViewModel c;
    public final /* synthetic */ HashMap d;
    public final /* synthetic */ EnumArray e;
    public final /* synthetic */ ArrayList f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SoundVibrationViewModel$setBuzzerScene$$inlined$safeLaunch$1(Continuation continuation, SoundVibrationViewModel soundVibrationViewModel, HashMap map, EnumArray enumArray, ArrayList arrayList) {
        super(2, continuation);
        this.c = soundVibrationViewModel;
        this.d = map;
        this.e = enumArray;
        this.f = arrayList;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        SoundVibrationViewModel$setBuzzerScene$$inlined$safeLaunch$1 soundVibrationViewModel$setBuzzerScene$$inlined$safeLaunch$1 = new SoundVibrationViewModel$setBuzzerScene$$inlined$safeLaunch$1(continuation, this.c, this.d, this.e, this.f);
        soundVibrationViewModel$setBuzzerScene$$inlined$safeLaunch$1.b = obj;
        return soundVibrationViewModel$setBuzzerScene$$inlined$safeLaunch$1;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((SoundVibrationViewModel$setBuzzerScene$$inlined$safeLaunch$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:19:0x003f  */
    /* JADX WARN: Code duplicated, block: B:22:0x0048  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        boolean zBooleanValue;
        SoundAndVibrateV2 soundAndVibrateV2F;
        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            SettingsModule settingsModule = this.c.settingsModule;
            if (settingsModule == null) {
                zBooleanValue = false;
            } else {
                HashMap<SettingsGroupType, Settings> map = this.d;
                this.a = 1;
                obj = settingsModule.writeSetting(map, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            if (zBooleanValue) {
                soundAndVibrateV2F = this.c.f();
                if (soundAndVibrateV2F != null) {
                    soundAndVibrateV2F.setBuzzerScenes(this.e);
                }
                WatchSettingsManager.modify$default(WatchSettingExtsKt.getWatchSettingManager(), false, new SoundVibrationViewModel.f(this.f), 1, null);
            }
            this.c.b(zBooleanValue);
            this.c._soundAndVibrate.postValue(this.c._soundAndVibrate.getValue());
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        Boolean bool = (Boolean) obj;
        if (bool == null) {
            zBooleanValue = false;
        } else {
            zBooleanValue = bool.booleanValue();
        }
        if (zBooleanValue) {
            soundAndVibrateV2F = this.c.f();
            if (soundAndVibrateV2F != null) {
                soundAndVibrateV2F.setBuzzerScenes(this.e);
            }
            WatchSettingsManager.modify$default(WatchSettingExtsKt.getWatchSettingManager(), false, new SoundVibrationViewModel.f(this.f), 1, null);
        }
        this.c.b(zBooleanValue);
        this.c._soundAndVibrate.postValue(this.c._soundAndVibrate.getValue());
        return Unit.INSTANCE;
    }
}
