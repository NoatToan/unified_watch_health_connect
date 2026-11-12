package com.xiaomi.hm.health.device.setting.life.feature;

import com.huami.koinstartup.KoinComponentAdapter;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMMiLiProDevice;
import com.xiaomi.hm.health.bt.profile.weather.weathermodule.WeatherModule;
import com.xiaomi.hm.health.device.deviceconfig.Feature;
import com.xiaomi.hm.health.device.deviceconfig.configs.ConfigHelperKt;
import com.xiaomi.hm.health.device.model.IZeppOSWeatherHandler;
import com.xiaomi.hm.health.device.setting.DeviceCenter;
import com.xiaomi.hm.health.weather.utils.SetTemperatureUnitUtil;
import com.xiaomi.mipush.sdk.MiPushClient;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00162\u00020\u00012\u00020\u0002:\u0001\u0016B\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0016R\u001d\u0010\u0010\u001a\u00020\u000b8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0013\u001a\u00020\u00118B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\r\u001a\u0004\b\f\u0010\u0012¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/life/feature/WeatherSubscriber;", "Lcom/xiaomi/hm/health/device/setting/life/feature/BleEventSubscriber;", "Lcom/huami/koinstartup/KoinComponentAdapter;", "", "c", "", "getName", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "device", "register", MiPushClient.COMMAND_UNREGISTER, "Lcom/xiaomi/hm/health/device/model/IZeppOSWeatherHandler;", "a", "Lkotlin/Lazy;", "b", "()Lcom/xiaomi/hm/health/device/model/IZeppOSWeatherHandler;", "zeppOSWeatherHandler", "Lcom/xiaomi/hm/health/device/setting/DeviceCenter;", "()Lcom/xiaomi/hm/health/device/setting/DeviceCenter;", "deviceCenter", "<init>", "()V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class WeatherSubscriber implements BleEventSubscriber, KoinComponentAdapter {

    @NotNull
    private static final String c = "ZeppOSWeatherSubscriber";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy zeppOSWeatherHandler;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceCenter;

    /* JADX WARN: Multi-variable type inference failed */
    public WeatherSubscriber() {
        KoinPlatformTools koinPlatformTools = KoinPlatformTools.INSTANCE;
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = koinPlatformTools.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.zeppOSWeatherHandler = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<IZeppOSWeatherHandler>() { // from class: com.xiaomi.hm.health.device.setting.life.feature.WeatherSubscriber$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.xiaomi.hm.health.device.model.IZeppOSWeatherHandler, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final IZeppOSWeatherHandler getA() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(IZeppOSWeatherHandler.class), qualifier, objArr);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode2 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr2 = 0 == true ? 1 : 0;
        final Object[] objArr3 = 0 == true ? 1 : 0;
        this.deviceCenter = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode2, (Function0) new Function0<DeviceCenter>() { // from class: com.xiaomi.hm.health.device.setting.life.feature.WeatherSubscriber$special$$inlined$inject$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.xiaomi.hm.health.device.setting.DeviceCenter, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final DeviceCenter getA() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(DeviceCenter.class), objArr2, objArr3);
            }
        });
    }

    private final DeviceCenter a() {
        return (DeviceCenter) this.deviceCenter.getValue();
    }

    private final IZeppOSWeatherHandler b() {
        return (IZeppOSWeatherHandler) this.zeppOSWeatherHandler.getValue();
    }

    private final void c() {
        SetTemperatureUnitUtil.INSTANCE.setTemperatureUnitWhenConnected();
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponentAdapter.DefaultImpls.getKoin(this);
    }

    @Override // com.xiaomi.hm.health.device.setting.life.feature.BleEventSubscriber
    @NotNull
    public String getName() {
        return c;
    }

    @Override // com.xiaomi.hm.health.device.setting.life.feature.BleEventSubscriber
    public void register(@NotNull HMBaseDevice device) {
        if (ConfigHelperKt.hasFeature(a().getDeviceSource(), Feature.WEATHER_SOURCE_S)) {
            HMBaseDevice device2 = a().getDevice();
            HMMiLiProDevice hMMiLiProDevice = device2 instanceof HMMiLiProDevice ? (HMMiLiProDevice) device2 : null;
            boolean z = false;
            if (hMMiLiProDevice != null && hMMiLiProDevice.supportHuamiOSWeather()) {
                z = true;
            }
            if (!z) {
                c();
                return;
            }
            HMBaseDevice device3 = a().getDevice();
            WeatherModule weatherModule = device3 == null ? null : (WeatherModule) device3.getChannelModule(WeatherModule.class);
            b().setWeatherProtocolVersion(weatherModule != null ? weatherModule.queryVersion() : null);
            b().fillWeatherCities(weatherModule);
            if (b().supportLocation()) {
                b().handleFailed();
            }
        }
    }

    @Override // com.xiaomi.hm.health.device.setting.life.feature.BleEventSubscriber
    public void unregister(@NotNull HMBaseDevice device) {
    }
}
