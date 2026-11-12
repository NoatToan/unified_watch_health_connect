package com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.dnd;

import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.ViewModel;
import androidx.p008lifecycle.ViewModelKt;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.assistant.ocr.camera.CameraActivity;
import com.huami.bluetooth.profile.channel.module.settings.ChangeListener;
import com.huami.bluetooth.profile.channel.module.settings.SettingsGroupType;
import com.huami.bluetooth.profile.channel.module.settings.SettingsModule;
import com.huami.bluetooth.profile.channel.module.settings.entity.general.General;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.EnumData;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.Settings;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.Time;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.device.HMMiLiProDevice;
import com.xiaomi.hm.health.device.HMDeviceManager;
import com.xiaomi.hm.health.device.setting.network.WatchSettingsManager;
import com.xiaomi.hm.health.device.setting.network.bean.DndMode;
import com.xiaomi.hm.health.device.setting.network.bean.WatchSettings;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.WatchSettingExtsKt;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.loading.LoadingVo;
import com.xiaomi.hm.health.devicex.manage.coroutines.ExtKt;
import com.xmlywind.sdk.common.mta.PointCategory;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
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
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Y\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\n*\u0001&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b-\u0010.J.\u0010\b\u001a\u00020\u00072&\u0010\u0006\u001a\"\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002j\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u0005J\u000e\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tJ\u0016\u0010\u0010\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eJ\u0006\u0010\u0011\u001a\u00020\u0007R6\u0010\u0006\u001a\"\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002j\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0006@\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00148\u0006@\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001d\u0010\u0019R\u001f\u0010!\u001a\b\u0012\u0004\u0012\u00020\f0\u00148\u0006@\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0017\u001a\u0004\b \u0010\u0019R\u0018\u0010%\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010)\u001a\u00020&8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0018\u0010,\u001a\u0004\u0018\u00010\u00158B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+¨\u0006/"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/dnd/DndModeViewModel;", "Landroidx/lifecycle/ViewModel;", "Ljava/util/HashMap;", "Lcom/huami/bluetooth/profile/channel/module/settings/SettingsGroupType;", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/Settings;", "Lkotlin/collections/HashMap;", "watchSettings", "", PointCategory.INIT, "", "value", "pushDndModeToDevice", "", "start", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/Time;", "time", "pushTimeToDevice", "removeListener", "a", "Ljava/util/HashMap;", "Landroidx/lifecycle/MutableLiveData;", "Lcom/huami/bluetooth/profile/channel/module/settings/entity/general/General;", "b", "Landroidx/lifecycle/MutableLiveData;", "getDndModeLiveData", "()Landroidx/lifecycle/MutableLiveData;", "dndModeLiveData", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/loading/LoadingVo;", "c", "getLoadingLiveData", "loadingLiveData", GoogleApiAvailabilityLight.a, "getWriteResultLiveData", "writeResultLiveData", "Lcom/huami/bluetooth/profile/channel/module/settings/SettingsModule;", "e", "Lcom/huami/bluetooth/profile/channel/module/settings/SettingsModule;", "settingsModule", "com/xiaomi/hm/health/device/setting/ui/subview/watchsetting/dnd/DndModeViewModel$changeListener$1", "f", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/dnd/DndModeViewModel$changeListener$1;", "changeListener", "getGeneral", "()Lcom/huami/bluetooth/profile/channel/module/settings/entity/general/General;", CameraActivity.CONTENT_TYPE_GENERAL, "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class DndModeViewModel extends ViewModel {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private HashMap<SettingsGroupType, Settings> watchSettings;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private SettingsModule settingsModule;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<General> dndModeLiveData = new MutableLiveData<>();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<LoadingVo> loadingLiveData = new MutableLiveData<>();

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Boolean> writeResultLiveData = new MutableLiveData<>();

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final DndModeViewModel$changeListener$1 changeListener = new ChangeListener() { // from class: com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.dnd.DndModeViewModel$changeListener$1
        @Override // com.huami.bluetooth.profile.channel.module.settings.ChangeListener
        public void onChange(@NotNull HashMap<SettingsGroupType, Settings> settings) {
            Settings settings2 = settings.get(SettingsGroupType.GENERAL);
            General general = settings2 instanceof General ? (General) settings2 : null;
            if (general == null) {
                return;
            }
            this.a.getDndModeLiveData().postValue(general);
        }
    };

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.dnd.DndModeViewModel$pushDndModeToDevice$1$1", f = "DndModeViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ int c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i, Continuation<? super a> continuation) {
            super(2, continuation);
            this.c = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return DndModeViewModel.this.new a(this.c, continuation);
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
            General general = DndModeViewModel.this.getGeneral();
            EnumData dndMode = general == null ? null : general.getDndMode();
            if (dndMode != null) {
                dndMode.setValue(this.c);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/network/bean/WatchSettings;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function1<WatchSettings, Unit> {
        public final /* synthetic */ int a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i) {
            super(1);
            this.a = i;
        }

        public final void a(@NotNull WatchSettings watchSettings) {
            DndMode dndMode = watchSettings.getDndMode();
            if (dndMode == null) {
                return;
            }
            dndMode.setDndAutoEnableMode(Integer.valueOf(this.a));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(WatchSettings watchSettings) {
            a(watchSettings);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.dnd.DndModeViewModel$pushTimeToDevice$1$1", f = "DndModeViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ DndModeViewModel c;
        public final /* synthetic */ Time d;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/network/bean/WatchSettings;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function1<WatchSettings, Unit> {
            public final /* synthetic */ Time a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Time time) {
                super(1);
                this.a = time;
            }

            public final void a(@NotNull WatchSettings watchSettings) {
                DndMode dndMode = watchSettings.getDndMode();
                if (dndMode == null) {
                    return;
                }
                dndMode.setDndTimingStartTime(Integer.valueOf(WatchSettingExtsKt.toMinutes(this.a)));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(WatchSettings watchSettings) {
                a(watchSettings);
                return Unit.INSTANCE;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/network/bean/WatchSettings;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function1<WatchSettings, Unit> {
            public final /* synthetic */ Time a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(Time time) {
                super(1);
                this.a = time;
            }

            public final void a(@NotNull WatchSettings watchSettings) {
                DndMode dndMode = watchSettings.getDndMode();
                if (dndMode == null) {
                    return;
                }
                dndMode.setDndTimingEndTime(Integer.valueOf(WatchSettingExtsKt.toMinutes(this.a)));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(WatchSettings watchSettings) {
                a(watchSettings);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(boolean z, DndModeViewModel dndModeViewModel, Time time, Continuation<? super c> continuation) {
            super(2, continuation);
            this.b = z;
            this.c = dndModeViewModel;
            this.d = time;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new c(this.b, this.c, this.d, continuation);
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
            if (this.b) {
                WatchSettingsManager.modify$default(WatchSettingExtsKt.getWatchSettingManager(), false, new a(this.d), 1, null);
                General general = this.c.getGeneral();
                if (general != null) {
                    general.setDndStartTime(this.d);
                }
            } else {
                WatchSettingsManager.modify$default(WatchSettingExtsKt.getWatchSettingManager(), false, new b(this.d), 1, null);
                General general2 = this.c.getGeneral();
                if (general2 != null) {
                    general2.setDndStopTime(this.d);
                }
            }
            return Unit.INSTANCE;
        }
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
    public final MutableLiveData<General> getDndModeLiveData() {
        return this.dndModeLiveData;
    }

    @NotNull
    public final MutableLiveData<LoadingVo> getLoadingLiveData() {
        return this.loadingLiveData;
    }

    @NotNull
    public final MutableLiveData<Boolean> getWriteResultLiveData() {
        return this.writeResultLiveData;
    }

    public final void init(@Nullable HashMap<SettingsGroupType, Settings> watchSettings) {
        this.watchSettings = watchSettings;
        HMBaseDevice device = HMDeviceManager.getInstance().getDevice(HMDeviceType.MILI);
        if (device instanceof HMMiLiProDevice) {
            SettingsModule settingsModule = (SettingsModule) ((HMMiLiProDevice) device).getChannelModule(SettingsModule.class);
            this.settingsModule = settingsModule;
            if (settingsModule != null) {
                settingsModule.addListener(this.changeListener);
            }
            if (getGeneral() == null) {
                return;
            }
            getDndModeLiveData().setValue(getGeneral());
        }
    }

    public final void pushDndModeToDevice(int value) {
        LoadingVo.Companion.postStartMsg$default(LoadingVo.INSTANCE, this.loadingLiveData, null, 2, null);
        e.f(ViewModelKt.getViewModelScope(this), ExtKt.getExceptionHandler().plus(Dispatchers.getIO()), null, new DndModeViewModel$pushDndModeToDevice$$inlined$safeLaunch$1(null, this, value), 2, null);
    }

    public final void pushTimeToDevice(boolean start, @NotNull Time time) {
        LoadingVo.Companion.postStartMsg$default(LoadingVo.INSTANCE, this.loadingLiveData, null, 2, null);
        e.f(ViewModelKt.getViewModelScope(this), ExtKt.getExceptionHandler().plus(Dispatchers.getIO()), null, new DndModeViewModel$pushTimeToDevice$$inlined$safeLaunch$1(null, this, start, time), 2, null);
    }

    public final void removeListener() {
        SettingsModule settingsModule = this.settingsModule;
        if (settingsModule == null) {
            return;
        }
        settingsModule.removeListener(this.changeListener);
    }
}
