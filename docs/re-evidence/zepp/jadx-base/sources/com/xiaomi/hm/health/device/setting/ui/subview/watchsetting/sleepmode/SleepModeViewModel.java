package com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.sleepmode;

import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.ViewModel;
import androidx.p008lifecycle.ViewModelKt;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.assistant.ocr.camera.CameraActivity;
import com.huami.bluetooth.profile.channel.module.settings.SettingsGroupType;
import com.huami.bluetooth.profile.channel.module.settings.SettingsModule;
import com.huami.bluetooth.profile.channel.module.settings.entity.general.General;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.Settings;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.device.HMMiLiProDevice;
import com.xiaomi.hm.health.device.HMDeviceManager;
import com.xiaomi.hm.health.device.setting.network.bean.SleepMode;
import com.xiaomi.hm.health.device.setting.network.bean.WatchSettings;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.loading.LoadingVo;
import com.xiaomi.hm.health.devicex.manage.coroutines.ExtKt;
import com.xmlywind.sdk.common.mta.PointCategory;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\"\u0010#J\f\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0002J.\u0010\u000b\u001a\u00020\n2&\u0010\t\u001a\"\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005j\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u0001`\bJ\u000e\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fJ\u000e\u0010\u000f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fR6\u0010\t\u001a\"\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005j\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u0001`\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\u0010R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00030\u00158\u0006@\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00158\u0006@\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001d\u0010\u0019R\u0018\u0010!\u001a\u0004\u0018\u00010\u00028B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006$"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/sleepmode/SleepModeViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/huami/bluetooth/profile/channel/module/settings/entity/general/General;", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/sleepmode/SleepModeVo;", "a", "Ljava/util/HashMap;", "Lcom/huami/bluetooth/profile/channel/module/settings/SettingsGroupType;", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/Settings;", "Lkotlin/collections/HashMap;", "watchSettings", "", PointCategory.INIT, "", "enable", "pushSleepModeToDevice", "pushSleepModeSmartEnableToDevice", "Ljava/util/HashMap;", "Lcom/huami/bluetooth/profile/channel/module/settings/SettingsModule;", "b", "Lcom/huami/bluetooth/profile/channel/module/settings/SettingsModule;", "settingsModule", "Landroidx/lifecycle/MutableLiveData;", "c", "Landroidx/lifecycle/MutableLiveData;", "getSleepScreenLiveData", "()Landroidx/lifecycle/MutableLiveData;", "sleepScreenLiveData", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/loading/LoadingVo;", GoogleApiAvailabilityLight.a, "getLoadingLiveData", "loadingLiveData", "getGeneral", "()Lcom/huami/bluetooth/profile/channel/module/settings/entity/general/General;", CameraActivity.CONTENT_TYPE_GENERAL, "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class SleepModeViewModel extends ViewModel {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private HashMap<SettingsGroupType, Settings> watchSettings;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private SettingsModule settingsModule;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<SleepModeVo> sleepScreenLiveData = new MutableLiveData<>();

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<LoadingVo> loadingLiveData = new MutableLiveData<>();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.sleepmode.SleepModeViewModel$pushSleepModeSmartEnableToDevice$1$1", f = "SleepModeViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ boolean c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z, Continuation<? super a> continuation) {
            super(2, continuation);
            this.c = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return SleepModeViewModel.this.new a(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            General general = SleepModeViewModel.this.getGeneral();
            if (general != null) {
                general.setSleepModeSmartEnableSwitch(Boxing.boxBoolean(this.c));
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/network/bean/WatchSettings;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function1<WatchSettings, Unit> {
        public final /* synthetic */ boolean a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(boolean z) {
            super(1);
            this.a = z;
        }

        public final void a(@NotNull WatchSettings watchSettings) {
            SleepMode sleepMode = watchSettings.getSleepMode();
            if (sleepMode == null) {
                return;
            }
            sleepMode.setSleepModeSmart(Boolean.valueOf(this.a));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(WatchSettings watchSettings) {
            a(watchSettings);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.sleepmode.SleepModeViewModel$pushSleepModeToDevice$1$1", f = "SleepModeViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ boolean c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(boolean z, Continuation<? super c> continuation) {
            super(2, continuation);
            this.c = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return SleepModeViewModel.this.new c(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            General general = SleepModeViewModel.this.getGeneral();
            if (general != null) {
                general.setSleepModeForDisplaySwitch(Boxing.boxBoolean(this.c));
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/network/bean/WatchSettings;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function1<WatchSettings, Unit> {
        public final /* synthetic */ boolean a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(boolean z) {
            super(1);
            this.a = z;
        }

        public final void a(@NotNull WatchSettings watchSettings) {
            SleepMode sleepMode = watchSettings.getSleepMode();
            if (sleepMode == null) {
                return;
            }
            sleepMode.setSleepModeDisplay(Boolean.valueOf(this.a));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(WatchSettings watchSettings) {
            a(watchSettings);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SleepModeVo a(General general) {
        return new SleepModeVo(general.getSleepModeForDisplaySwitch(), general.getSleepModeSmartEnableSwitch());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final General getGeneral() {
        HashMap<SettingsGroupType, Settings> map = this.watchSettings;
        Settings settings = map == null ? null : map.get(SettingsGroupType.GENERAL);
        if (settings instanceof General) {
            return (General) settings;
        }
        return null;
    }

    @NotNull
    public final MutableLiveData<LoadingVo> getLoadingLiveData() {
        return this.loadingLiveData;
    }

    @NotNull
    public final MutableLiveData<SleepModeVo> getSleepScreenLiveData() {
        return this.sleepScreenLiveData;
    }

    public final void init(@Nullable HashMap<SettingsGroupType, Settings> watchSettings) {
        this.watchSettings = watchSettings;
        HMBaseDevice device = HMDeviceManager.getInstance().getDevice(HMDeviceType.MILI);
        if (device instanceof HMMiLiProDevice) {
            this.settingsModule = (SettingsModule) ((HMMiLiProDevice) device).getChannelModule(SettingsModule.class);
            General general = getGeneral();
            if (general == null) {
                return;
            }
            getSleepScreenLiveData().setValue(a(general));
        }
    }

    public final void pushSleepModeSmartEnableToDevice(boolean enable) {
        LoadingVo.Companion.postStartMsg$default(LoadingVo.INSTANCE, this.loadingLiveData, null, 2, null);
        e.f(ViewModelKt.getViewModelScope(this), ExtKt.getExceptionHandler().plus(Dispatchers.getIO()), null, new SleepModeViewModel$pushSleepModeSmartEnableToDevice$$inlined$safeLaunch$1(null, this, enable), 2, null);
    }

    public final void pushSleepModeToDevice(boolean enable) {
        LoadingVo.Companion.postStartMsg$default(LoadingVo.INSTANCE, this.loadingLiveData, null, 2, null);
        e.f(ViewModelKt.getViewModelScope(this), ExtKt.getExceptionHandler().plus(Dispatchers.getIO()), null, new SleepModeViewModel$pushSleepModeToDevice$$inlined$safeLaunch$1(null, this, enable), 2, null);
    }
}
