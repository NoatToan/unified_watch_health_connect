package com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.wist;

import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.ViewModel;
import androidx.p008lifecycle.ViewModelKt;
import com.google.android.exoplayer2.source.rtsp.SessionDescription;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bluetooth.profile.channel.module.settings.ChangeListener;
import com.huami.bluetooth.profile.channel.module.settings.SettingsGroupType;
import com.huami.bluetooth.profile.channel.module.settings.SettingsModule;
import com.huami.bluetooth.profile.channel.module.settings.entity.screenlock.ScreenLockAndPassword;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.Settings;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.StringData;
import com.huami.devicex.manager.DeviceManagerApi;
import com.huami.sky.lib.constant.WebConstant;
import com.xiaomi.hm.health.bt.device.HMCallback;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.device.HMMiLiProDevice;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.repo.IWatchSettingRepo;
import com.xiaomi.hm.health.devicex.manage.coroutines.ExtKt;
import java.util.HashMap;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000q\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001!\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b9\u0010:J\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003J7\u0010\u0010\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u00052\b\b\u0002\u0010\u0012\u001a\u00020\u0007J/\u0010\u0017\u001a\u00020\u00052\b\b\u0002\u0010\u0014\u001a\u00020\u00072\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010\u0019\u001a\u00020\u0005H\u0014J\u0006\u0010\u001a\u001a\u00020\u0005R\u001d\u0010 \u001a\u00020\u001b8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010#\u001a\u00020!8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\"R\u001d\u0010'\u001a\u00020$8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010\u001d\u001a\u0004\b\u001c\u0010&R\u001e\u0010,\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010)0(8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0018\u00100\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0018\u00104\u001a\u0004\u0018\u0001018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u001b\u00108\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010)058F@\u0006¢\u0006\u0006\u001a\u0004\b6\u00107¨\u0006;"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/wist/OffWistSettingViewModel;", "Landroidx/lifecycle/ViewModel;", "Lorg/koin/core/component/KoinComponent;", "Lcom/xiaomi/hm/health/bt/device/HMDeviceType;", "mDeviceType", "", "initJob", "", "isChecked", "", "stringData", "", SessionDescription.p, "Lcom/xiaomi/hm/health/bt/device/HMCallback;", "Ljava/lang/Object;", "callBack", "setOffWistSetting", "(ZLjava/lang/String;Ljava/lang/Integer;Lcom/xiaomi/hm/health/bt/device/HMCallback;)V", "needDesc", "querySettings", "needRefreshObserver", "password", WebConstant.QueryParam.SWITCH, "updateDisplayBrightnessSetting", "(ZLjava/lang/String;Ljava/lang/Boolean;)V", "onCleared", "removeListener", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/repo/IWatchSettingRepo;", "a", "Lkotlin/Lazy;", "b", "()Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/repo/IWatchSettingRepo;", "watchSettingRepo", "com/xiaomi/hm/health/device/setting/ui/subview/watchsetting/wist/OffWistSettingViewModel$changeListener$1", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/wist/OffWistSettingViewModel$changeListener$1;", "changeListener", "Lcom/huami/devicex/manager/DeviceManagerApi;", "c", "()Lcom/huami/devicex/manager/DeviceManagerApi;", "deviceManagerApi", "Landroidx/lifecycle/MutableLiveData;", "Lcom/huami/bluetooth/profile/channel/module/settings/entity/screenlock/ScreenLockAndPassword;", GoogleApiAvailabilityLight.a, "Landroidx/lifecycle/MutableLiveData;", "_screenLockAndPassword", "Lcom/xiaomi/hm/health/bt/device/HMMiLiProDevice;", "e", "Lcom/xiaomi/hm/health/bt/device/HMMiLiProDevice;", "hmMiLiProDevice", "Lcom/huami/bluetooth/profile/channel/module/settings/SettingsModule;", "f", "Lcom/huami/bluetooth/profile/channel/module/settings/SettingsModule;", "settingsModule", "Landroidx/lifecycle/LiveData;", "getScreenLockAndPassword", "()Landroidx/lifecycle/LiveData;", "screenLockAndPassword", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class OffWistSettingViewModel extends ViewModel implements KoinComponent {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy watchSettingRepo;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final OffWistSettingViewModel$changeListener$1 changeListener;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceManagerApi;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<ScreenLockAndPassword> _screenLockAndPassword;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private HMMiLiProDevice hmMiLiProDevice;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    private SettingsModule settingsModule;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.wist.OffWistSettingViewModel$setOffWistSetting$2$1", f = "OffWistSettingViewModel.kt", i = {}, l = {69}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ HashMap<SettingsGroupType, Settings> c;
        public final /* synthetic */ HMCallback<Object> d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(HashMap<SettingsGroupType, Settings> map, HMCallback<Object> hMCallback, Continuation<? super a> continuation) {
            super(2, continuation);
            this.c = map;
            this.d = hMCallback;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return OffWistSettingViewModel.this.new a(this.c, this.d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            boolean zBooleanValue = false;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                SettingsModule settingsModule = OffWistSettingViewModel.this.settingsModule;
                if (settingsModule != null) {
                    HashMap<SettingsGroupType, Settings> map = this.c;
                    this.a = 1;
                    obj = settingsModule.writeSetting(map, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                this.d.sendOnFinishMessage(zBooleanValue);
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
            this.d.sendOnFinishMessage(zBooleanValue);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.wist.OffWistSettingViewModel$changeListener$1] */
    public OffWistSettingViewModel() {
        KoinPlatformTools koinPlatformTools = KoinPlatformTools.INSTANCE;
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = koinPlatformTools.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.watchSettingRepo = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<IWatchSettingRepo>() { // from class: com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.wist.OffWistSettingViewModel$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.repo.IWatchSettingRepo, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final IWatchSettingRepo invoke() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(IWatchSettingRepo.class), qualifier, objArr);
            }
        });
        this.changeListener = new ChangeListener() { // from class: com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.wist.OffWistSettingViewModel$changeListener$1
            @Override // com.huami.bluetooth.profile.channel.module.settings.ChangeListener
            public void onChange(@NotNull HashMap<SettingsGroupType, Settings> settings) {
                MutableLiveData mutableLiveData = this.a._screenLockAndPassword;
                Settings settings2 = settings.get(SettingsGroupType.SCREEN_UNLOCK_AND_PASSWORD);
                mutableLiveData.setValue(settings2 instanceof ScreenLockAndPassword ? (ScreenLockAndPassword) settings2 : null);
            }
        };
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode2 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr2 = 0 == true ? 1 : 0;
        final Object[] objArr3 = 0 == true ? 1 : 0;
        this.deviceManagerApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode2, (Function0) new Function0<DeviceManagerApi>() { // from class: com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.wist.OffWistSettingViewModel$special$$inlined$inject$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.devicex.manager.DeviceManagerApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final DeviceManagerApi invoke() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(DeviceManagerApi.class), objArr2, objArr3);
            }
        });
        MutableLiveData<ScreenLockAndPassword> mutableLiveData = new MutableLiveData<>();
        mutableLiveData.setValue(null);
        Unit unit = Unit.INSTANCE;
        this._screenLockAndPassword = mutableLiveData;
    }

    private final DeviceManagerApi a() {
        return (DeviceManagerApi) this.deviceManagerApi.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final IWatchSettingRepo b() {
        return (IWatchSettingRepo) this.watchSettingRepo.getValue();
    }

    public static /* synthetic */ void querySettings$default(OffWistSettingViewModel offWistSettingViewModel, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        offWistSettingViewModel.querySettings(z);
    }

    public static /* synthetic */ void setOffWistSetting$default(OffWistSettingViewModel offWistSettingViewModel, boolean z, String str, Integer num, HMCallback hMCallback, int i, Object obj) {
        if ((i & 4) != 0) {
            num = null;
        }
        offWistSettingViewModel.setOffWistSetting(z, str, num, hMCallback);
    }

    public static /* synthetic */ void updateDisplayBrightnessSetting$default(OffWistSettingViewModel offWistSettingViewModel, boolean z, String str, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            bool = null;
        }
        offWistSettingViewModel.updateDisplayBrightnessSetting(z, str, bool);
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    @NotNull
    public final LiveData<ScreenLockAndPassword> getScreenLockAndPassword() {
        return this._screenLockAndPassword;
    }

    public final void initJob(@NotNull HMDeviceType mDeviceType) {
        HMMiLiProDevice hMMiLiProDevice = (HMMiLiProDevice) a().getDevice(mDeviceType);
        this.hmMiLiProDevice = hMMiLiProDevice;
        SettingsModule settingsModule = hMMiLiProDevice == null ? null : (SettingsModule) hMMiLiProDevice.getChannelModule(SettingsModule.class);
        this.settingsModule = settingsModule;
        if (settingsModule == null) {
            return;
        }
        settingsModule.addListener(this.changeListener);
    }

    @Override // androidx.p008lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        CoroutineScopeKt.cancel$default(ViewModelKt.getViewModelScope(this), null, 1, null);
    }

    public final void querySettings(boolean needDesc) {
        e.f(ViewModelKt.getViewModelScope(this), ExtKt.getExceptionHandler().plus(Dispatchers.getIO()), null, new OffWistSettingViewModel$querySettings$$inlined$safeLaunch$1(null, this, needDesc), 2, null);
    }

    public final void removeListener() {
        SettingsModule settingsModule = this.settingsModule;
        if (settingsModule == null) {
            return;
        }
        settingsModule.removeListener(this.changeListener);
    }

    public final void setOffWistSetting(boolean isChecked, @NotNull String stringData, @Nullable Integer length, @NotNull HMCallback<Object> callBack) {
        callBack.onStart();
        HashMap map = new HashMap();
        SettingsGroupType settingsGroupType = SettingsGroupType.SCREEN_UNLOCK_AND_PASSWORD;
        ScreenLockAndPassword screenLockAndPassword = new ScreenLockAndPassword();
        screenLockAndPassword.setSwitch(Boolean.valueOf(isChecked));
        if (isChecked) {
            screenLockAndPassword.setPassword(new StringData(stringData, length, false, 4, null));
        }
        map.put(settingsGroupType, screenLockAndPassword);
        e.f(ViewModelKt.getViewModelScope(this), ExtKt.getExceptionHandler(), null, new OffWistSettingViewModel$setOffWistSetting$$inlined$safeLaunch$1(null, this, map, callBack), 2, null);
    }

    public final void updateDisplayBrightnessSetting(boolean needRefreshObserver, @Nullable String password, @Nullable Boolean bool) {
        ScreenLockAndPassword value = needRefreshObserver ? this._screenLockAndPassword.getValue() : this._screenLockAndPassword.getValue();
        if (value == null) {
            value = null;
        } else {
            if (password != null) {
                value.setPassword(new StringData(password));
            }
            if (bool != null) {
                value.setSwitch(bool);
            }
        }
        if (needRefreshObserver) {
            this._screenLockAndPassword.setValue(value);
        }
    }
}
