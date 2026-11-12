package com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.sleepmode;

import com.huami.bluetooth.profile.channel.module.settings.SettingsModule;
import com.huami.bluetooth.profile.channel.module.settings.entity.general.General;
import com.huami.devicex.R;
import com.xiaomi.hm.health.device.setting.network.WatchSettingsManager;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.SettingsExtsKt;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.WatchSettingExtsKt;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.loading.LoadingVo;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.sleepmode.SleepModeViewModel.a;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0001*\u00020\u0000H\u008a@¨\u0006\u0002"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "com/xiaomi/hm/health/devicex/manage/coroutines/ExtKt$safeLaunch$2", "<anonymous>"}, k = 3, mv = {1, 5, 1})
@DebugMetadata(c = "com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.sleepmode.SleepModeViewModel$pushSleepModeSmartEnableToDevice$$inlined$safeLaunch$1", f = "SleepModeViewModel.kt", i = {}, l = {64, 68}, m = "invokeSuspend", n = {}, s = {})
public final class SleepModeViewModel$pushSleepModeSmartEnableToDevice$$inlined$safeLaunch$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int a;
    private /* synthetic */ Object b;
    public final /* synthetic */ SleepModeViewModel c;
    public final /* synthetic */ boolean d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SleepModeViewModel$pushSleepModeSmartEnableToDevice$$inlined$safeLaunch$1(Continuation continuation, SleepModeViewModel sleepModeViewModel, boolean z) {
        super(2, continuation);
        this.c = sleepModeViewModel;
        this.d = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        SleepModeViewModel$pushSleepModeSmartEnableToDevice$$inlined$safeLaunch$1 sleepModeViewModel$pushSleepModeSmartEnableToDevice$$inlined$safeLaunch$1 = new SleepModeViewModel$pushSleepModeSmartEnableToDevice$$inlined$safeLaunch$1(continuation, this.c, this.d);
        sleepModeViewModel$pushSleepModeSmartEnableToDevice$$inlined$safeLaunch$1.b = obj;
        return sleepModeViewModel$pushSleepModeSmartEnableToDevice$$inlined$safeLaunch$1;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((SleepModeViewModel$pushSleepModeSmartEnableToDevice$$inlined$safeLaunch$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002f  */
    /* JADX WARN: Code duplicated, block: B:21:0x0055  */
    /* JADX WARN: Code duplicated, block: B:23:0x006a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:25:0x0087  */
    /* JADX WARN: Code duplicated, block: B:29:0x009d  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        boolean zBooleanValue;
        MainCoroutineDispatcher main;
        SleepModeViewModel.a aVar;
        General general;
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
            WatchSettingsManager.modify$default(WatchSettingExtsKt.getWatchSettingManager(), false, new SleepModeViewModel.b(this.d), 1, null);
            LoadingVo.INSTANCE.postSuccessMsg(this.c.getLoadingLiveData(), R.string.save_success);
            general = this.c.getGeneral();
            if (general != null) {
                this.c.getSleepScreenLiveData().postValue(this.c.a(general));
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        SettingsModule settingsModule = this.c.settingsModule;
        if (settingsModule == null) {
            zBooleanValue = false;
        } else {
            General general2 = new General();
            general2.setSleepModeSmartEnableSwitch(Boxing.boxBoolean(this.d));
            Unit unit = Unit.INSTANCE;
            this.a = 1;
            obj = SettingsExtsKt.write(settingsModule, general2, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        if (zBooleanValue) {
            main = Dispatchers.getMain();
            aVar = this.c.new a(this.d, null);
            this.a = 2;
            if (BuildersKt.withContext(main, aVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            WatchSettingsManager.modify$default(WatchSettingExtsKt.getWatchSettingManager(), false, new SleepModeViewModel.b(this.d), 1, null);
            LoadingVo.INSTANCE.postSuccessMsg(this.c.getLoadingLiveData(), R.string.save_success);
        } else {
            LoadingVo.INSTANCE.postFailMsg(this.c.getLoadingLiveData(), R.string.long_sit_set_failed);
        }
        general = this.c.getGeneral();
        if (general != null) {
            this.c.getSleepScreenLiveData().postValue(this.c.a(general));
        }
        return Unit.INSTANCE;
        Boolean bool = (Boolean) obj;
        if (bool == null) {
            zBooleanValue = false;
        } else {
            zBooleanValue = bool.booleanValue();
        }
        if (zBooleanValue) {
            main = Dispatchers.getMain();
            aVar = this.c.new a(this.d, null);
            this.a = 2;
            if (BuildersKt.withContext(main, aVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            WatchSettingsManager.modify$default(WatchSettingExtsKt.getWatchSettingManager(), false, new SleepModeViewModel.b(this.d), 1, null);
            LoadingVo.INSTANCE.postSuccessMsg(this.c.getLoadingLiveData(), R.string.save_success);
        } else {
            LoadingVo.INSTANCE.postFailMsg(this.c.getLoadingLiveData(), R.string.long_sit_set_failed);
        }
        general = this.c.getGeneral();
        if (general != null) {
            this.c.getSleepScreenLiveData().postValue(this.c.a(general));
        }
        return Unit.INSTANCE;
    }
}
