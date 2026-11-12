package com.xiaomi.hm.health.device.setting.ui;

import android.content.ComponentCallbacks;
import android.content.Intent;
import android.os.Bundle;
import androidx.exifinterface.media.ExifInterface;
import androidx.p008lifecycle.ViewModelProvider;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.devicex.R;
import com.huami.devicex.manager.DeviceManagerApi;
import com.huami.koinstartup.KoinComponentAdapter;
import com.huami.view.basetitle.BaseTitleActivity;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.device.bind.analytic.ui.UIAnalytic;
import com.xiaomi.hm.health.device.firmware.HMFwOnlineUpgradeManager;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.brightness.DisplayBrightnessViewModel;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.sound.SoundVibrationViewModel;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.voice.OfflineVoiceWakeUpViewModel;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.wearmode.WearModeViewModel;
import com.xiaomi.hm.health.device.setting.viewmodel.DeviceFeatureViewModel;
import com.xiaomi.hm.health.device.setting.viewmodel.FeatureViewModel;
import com.xiaomi.hm.health.eventbus.EventFwCheckResult;
import de.greenrobot.event.EventBus;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.core.Koin;
import org.koin.core.qualifier.Qualifier;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 )2\u00020\u00012\u00020\u0002:\u0001)B\u0007¢\u0006\u0004\b'\u0010(J\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0014J\"\u0010\f\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0014J\b\u0010\r\u001a\u00020\u0005H\u0014J\u000e\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000eJ\b\u0010\u0011\u001a\u00020\u0005H\u0014R\u001d\u0010\u0017\u001a\u00020\u00128B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u001c\u001a\u00020\u00188B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u001a\u0010\u001bR\u001d\u0010!\u001a\u00020\u001d8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u0014\u001a\u0004\b\u001f\u0010 R\u001d\u0010&\u001a\u00020\"8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010\u0014\u001a\u0004\b$\u0010%¨\u0006*"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/ui/DeviceSettingActivity;", "Lcom/huami/view/basetitle/BaseTitleActivity;", "Lcom/huami/koinstartup/KoinComponentAdapter;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "onDestroy", "Lcom/xiaomi/hm/health/eventbus/EventFwCheckResult;", "result", "onEventMainThread", "onResume", "Lcom/huami/devicex/manager/DeviceManagerApi;", "x", "Lkotlin/Lazy;", "m", "()Lcom/huami/devicex/manager/DeviceManagerApi;", "deviceManagerApi", "Lcom/xiaomi/hm/health/device/setting/ui/SettingViewModelProvider;", "y", "o", "()Lcom/xiaomi/hm/health/device/setting/ui/SettingViewModelProvider;", "viewModelProvider", "Lcom/xiaomi/hm/health/device/setting/viewmodel/FeatureViewModel;", "z", GoogleApiAvailabilityLight.b, "()Lcom/xiaomi/hm/health/device/setting/viewmodel/FeatureViewModel;", "featureViewModel", "Lcom/xiaomi/hm/health/device/setting/viewmodel/DeviceFeatureViewModel;", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "l", "()Lcom/xiaomi/hm/health/device/setting/viewmodel/DeviceFeatureViewModel;", "deviceFeatureViewModel", "<init>", "()V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class DeviceSettingActivity extends BaseTitleActivity implements KoinComponentAdapter {

    @NotNull
    private static final String B = "DeviceSettingActivity";

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceFeatureViewModel;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceManagerApi;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    @NotNull
    private final Lazy viewModelProvider;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    @NotNull
    private final Lazy featureViewModel;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/viewmodel/DeviceFeatureViewModel;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<DeviceFeatureViewModel> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final DeviceFeatureViewModel getA() {
            return (DeviceFeatureViewModel) DeviceSettingActivity.this.o().get(DeviceFeatureViewModel.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/viewmodel/FeatureViewModel;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<FeatureViewModel> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final FeatureViewModel getA() {
            return (FeatureViewModel) DeviceSettingActivity.this.o().get(FeatureViewModel.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/ui/SettingViewModelProvider;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<SettingViewModelProvider> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SettingViewModelProvider getA() {
            DeviceSettingActivity deviceSettingActivity = DeviceSettingActivity.this;
            return new SettingViewModelProvider(deviceSettingActivity, deviceSettingActivity);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DeviceSettingActivity() {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.SYNCHRONIZED;
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.deviceManagerApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<DeviceManagerApi>() { // from class: com.xiaomi.hm.health.device.setting.ui.DeviceSettingActivity$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.devicex.manager.DeviceManagerApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final DeviceManagerApi getA() {
                ComponentCallbacks componentCallbacks = this;
                return AndroidKoinScopeExtKt.getKoinScope(componentCallbacks).get(Reflection.getOrCreateKotlinClass(DeviceManagerApi.class), qualifier, objArr);
            }
        });
        this.viewModelProvider = LazyKt__LazyJVMKt.lazy(new c());
        this.featureViewModel = LazyKt__LazyJVMKt.lazy(new b());
        this.deviceFeatureViewModel = LazyKt__LazyJVMKt.lazy(new a());
    }

    private final DeviceFeatureViewModel l() {
        return (DeviceFeatureViewModel) this.deviceFeatureViewModel.getValue();
    }

    private final DeviceManagerApi m() {
        return (DeviceManagerApi) this.deviceManagerApi.getValue();
    }

    private final FeatureViewModel n() {
        return (FeatureViewModel) this.featureViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SettingViewModelProvider o() {
        return (SettingViewModelProvider) this.viewModelProvider.getValue();
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponentAdapter.DefaultImpls.getKoin(this);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, android.app.Activity
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 0 && resultCode == -1) {
            finish();
        }
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setStyle(BaseTitleActivity.STYLE.NONE, 0, true);
        n().loadDeviceLiveData();
        l().loadAppsItemSetting();
        setContentView(R.layout.activity_device_setting);
        EventBus.getDefault().register(this);
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        EventBus.getDefault().unregister(this);
        ((DisplayBrightnessViewModel) new ViewModelProvider(this).get(DisplayBrightnessViewModel.class)).removeListener();
        ((OfflineVoiceWakeUpViewModel) new ViewModelProvider(this).get(OfflineVoiceWakeUpViewModel.class)).removeListener();
        ((SoundVibrationViewModel) new ViewModelProvider(this).get(SoundVibrationViewModel.class)).removeListener();
        ((WearModeViewModel) new ViewModelProvider(this).get(WearModeViewModel.class)).removeListener();
    }

    public final void onEventMainThread(@NotNull EventFwCheckResult result) {
        if (result.isSuccess) {
            HMFwOnlineUpgradeManager.checkUpgradeInDevicePage(this, HMDeviceType.MILI, true);
        }
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        UIAnalytic.analyticsDevicePageVisible(m().getBoundDeviceSource(HMDeviceType.MILI));
        l().checkFwUpgrade(this);
    }
}
