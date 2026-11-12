package com.xiaomi.hm.health.device.bolt;

import android.os.AsyncTask;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.huami.devicex.funapi.DeviceXFunctionsKt;
import com.huami.devicex.manager.DeviceManagerApi;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.profile.base.ProfileUtils;
import com.xiaomi.hm.health.databases.model.Device;
import com.xiaomi.hm.health.device.event.HMDeviceBindEvent;
import com.xiaomi.hm.health.device.firmware.FirmwareManagerApi;
import com.xiaomi.hm.health.device.firmware.FirmwareOnlineManagerApi;
import com.xiaomi.hm.health.device.webapi.device.HMDeviceWebAPI;
import com.xiaomi.hm.health.device.webapi.device.HMWebBindInfo;
import de.greenrobot.event.EventBus;
import java.util.Calendar;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B+\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0012\u0012\u0006\u0010\u0017\u001a\u00020\u0012\u0012\u0006\u0010\u001b\u001a\u00020\u0018¢\u0006\u0004\b)\u0010*J'\u0010\u0007\u001a\u00020\u00032\u0016\u0010\u0006\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00020\u0005\"\u0004\u0018\u00010\u0002H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0003H\u0014R\u001b\u0010\u0011\u001a\u0004\u0018\u00010\f8\u0006@\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0017\u001a\u00020\u00128\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014R\u0016\u0010\u001b\u001a\u00020\u00188\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001d\u0010 \u001a\u00020\u001c8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u0013\u0010\u001fR\u001d\u0010$\u001a\u00020!8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\u001e\u001a\u0004\b\u0016\u0010#R\u001d\u0010(\u001a\u00020%8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010\u001e\u001a\u0004\b\r\u0010'¨\u0006+"}, d2 = {"Lcom/xiaomi/hm/health/device/bolt/TreadmillStartTask;", "Landroid/os/AsyncTask;", "Ljava/lang/Void;", "", "Lorg/koin/core/component/KoinComponent;", "", "params", "doInBackground", "([Ljava/lang/Void;)Ljava/lang/Boolean;", "result", "", "onPostExecute", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "a", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "getMBleDevice", "()Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "mBleDevice", "Lcom/xiaomi/hm/health/databases/model/Device;", "b", "Lcom/xiaomi/hm/health/databases/model/Device;", "stopDevice", "c", "mStartDevice", "Lcom/xiaomi/hm/health/device/bolt/TreadmillStartListener;", GoogleApiAvailabilityLight.a, "Lcom/xiaomi/hm/health/device/bolt/TreadmillStartListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/xiaomi/hm/health/device/firmware/FirmwareManagerApi;", "e", "Lkotlin/Lazy;", "()Lcom/xiaomi/hm/health/device/firmware/FirmwareManagerApi;", "firmwareManagerApi", "Lcom/xiaomi/hm/health/device/firmware/FirmwareOnlineManagerApi;", "f", "()Lcom/xiaomi/hm/health/device/firmware/FirmwareOnlineManagerApi;", "firmwareOnlineManagerApi", "Lcom/huami/devicex/manager/DeviceManagerApi;", "g", "()Lcom/huami/devicex/manager/DeviceManagerApi;", "deviceManagerApi", "<init>", "(Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;Lcom/xiaomi/hm/health/databases/model/Device;Lcom/xiaomi/hm/health/databases/model/Device;Lcom/xiaomi/hm/health/device/bolt/TreadmillStartListener;)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class TreadmillStartTask extends AsyncTask<Void, Void, Boolean> implements KoinComponent {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private final HMBaseDevice mBleDevice;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private final Device stopDevice;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Device mStartDevice;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final TreadmillStartListener listener;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final Lazy firmwareManagerApi;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final Lazy firmwareOnlineManagerApi;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceManagerApi;

    /* JADX WARN: Multi-variable type inference failed */
    public TreadmillStartTask(@Nullable HMBaseDevice hMBaseDevice, @Nullable Device device, @NotNull Device device2, @NotNull TreadmillStartListener treadmillStartListener) {
        this.mBleDevice = hMBaseDevice;
        this.stopDevice = device;
        this.mStartDevice = device2;
        this.listener = treadmillStartListener;
        KoinPlatformTools koinPlatformTools = KoinPlatformTools.INSTANCE;
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = koinPlatformTools.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.firmwareManagerApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<FirmwareManagerApi>() { // from class: com.xiaomi.hm.health.device.bolt.TreadmillStartTask$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.xiaomi.hm.health.device.firmware.FirmwareManagerApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final FirmwareManagerApi invoke() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(FirmwareManagerApi.class), qualifier, objArr);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode2 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr2 = 0 == true ? 1 : 0;
        final Object[] objArr3 = 0 == true ? 1 : 0;
        this.firmwareOnlineManagerApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode2, (Function0) new Function0<FirmwareOnlineManagerApi>() { // from class: com.xiaomi.hm.health.device.bolt.TreadmillStartTask$special$$inlined$inject$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.xiaomi.hm.health.device.firmware.FirmwareOnlineManagerApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final FirmwareOnlineManagerApi invoke() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(FirmwareOnlineManagerApi.class), objArr2, objArr3);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode3 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr4 = 0 == true ? 1 : 0;
        final Object[] objArr5 = 0 == true ? 1 : 0;
        this.deviceManagerApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode3, (Function0) new Function0<DeviceManagerApi>() { // from class: com.xiaomi.hm.health.device.bolt.TreadmillStartTask$special$$inlined$inject$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.devicex.manager.DeviceManagerApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final DeviceManagerApi invoke() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(DeviceManagerApi.class), objArr4, objArr5);
            }
        });
    }

    private final DeviceManagerApi a() {
        return (DeviceManagerApi) this.deviceManagerApi.getValue();
    }

    private final FirmwareManagerApi b() {
        return (FirmwareManagerApi) this.firmwareManagerApi.getValue();
    }

    private final FirmwareOnlineManagerApi c() {
        return (FirmwareOnlineManagerApi) this.firmwareOnlineManagerApi.getValue();
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    @Nullable
    public final HMBaseDevice getMBleDevice() {
        return this.mBleDevice;
    }

    @Override // android.os.AsyncTask
    public /* bridge */ /* synthetic */ void onPostExecute(Boolean bool) {
        onPostExecute(bool.booleanValue());
    }

    @Override // android.os.AsyncTask
    @NotNull
    public Boolean doInBackground(@NotNull Void... params) {
        Device device = this.stopDevice;
        if (device != null) {
            if (!HMDeviceWebAPI.updateDeviceToWeb(HMWebBindInfo.createUpdateInfo(device.getDevice_type().intValue(), this.stopDevice.getDevice_id(), 0, this.stopDevice.getDisplayName()))) {
                return Boolean.FALSE;
            }
            HMDeviceType hMDeviceTypeFromValue = HMDeviceType.fromValue(this.stopDevice.getDevice_type().intValue());
            a().disableDevice(hMDeviceTypeFromValue);
            EventBus.getDefault().postSticky(new HMDeviceBindEvent(false, hMDeviceTypeFromValue));
        }
        HMWebBindInfo hMWebBindInfoCreateUpdateInfo = HMWebBindInfo.createUpdateInfo(this.mStartDevice.getDevice_type().intValue(), this.mStartDevice.getDevice_id(), 1, this.mStartDevice.getDisplayName());
        HMBaseDevice hMBaseDevice = this.mBleDevice;
        if (hMBaseDevice != null && hMBaseDevice.getDeviceInfo() != null && this.mBleDevice.getDeviceInfo().getFirmwareVersionStr() != null) {
            hMWebBindInfoCreateUpdateInfo.mFwVersion = this.mBleDevice.getDeviceInfo().getFirmwareVersionStr();
        }
        if (!HMDeviceWebAPI.updateDeviceToWeb(hMWebBindInfoCreateUpdateInfo)) {
            return Boolean.FALSE;
        }
        Calendar calendar = Calendar.getInstance();
        long timeInMillis = calendar.getTimeInMillis();
        int timezoneKey = ProfileUtils.getTimezoneKey(calendar.getTimeZone());
        this.mStartDevice.setActiveStatus(1);
        this.mStartDevice.setDevice_sync_data_time(Long.valueOf(timeInMillis));
        this.mStartDevice.setTime_zone(Integer.valueOf(timezoneKey));
        this.mStartDevice.setDevice_sync_data_time_hr(Long.valueOf(timeInMillis));
        this.mStartDevice.setTime_zone_sync_hr(Integer.valueOf(timezoneKey));
        HMDeviceType type = HMDeviceSource.fromValue(this.mStartDevice.getDevice_source().intValue()).getType();
        a().enableDevice(this.mStartDevice, this.mBleDevice);
        if (!DeviceXFunctionsKt.getBuildConfigApi().isSupportCloudFwUpgrade() || c().useOnline(HMDeviceType.TREADMILL)) {
            b().setAllowUpgrade(false);
        } else {
            b().setAllowUpgrade(false);
        }
        EventBus.getDefault().postSticky(new HMDeviceBindEvent(true, type));
        return Boolean.TRUE;
    }

    public void onPostExecute(boolean result) {
        this.listener.onFinish(result);
    }
}
