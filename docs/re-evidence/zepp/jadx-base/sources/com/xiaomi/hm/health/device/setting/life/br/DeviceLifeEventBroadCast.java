package com.xiaomi.hm.health.device.setting.life.br;

import android.content.Intent;
import androidx.core.app.NotificationCompat;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.huami.device.event.br.DeviceConnectingAbility;
import com.huami.device.event.br.DeviceInfoParcel;
import com.huami.device.event.br.DeviceLifeConst;
import com.huami.tools.log.HMLog;
import com.huami.watch.companion.watchface.cloud.WatchFaceApi;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.profile.base.DeviceInfo;
import com.xiaomi.hm.health.databases.model.Device;
import com.xiaomi.hm.health.device.HMDeviceManager;
import com.xiaomi.hm.health.device.setting.life.DeviceLifeCycle;
import com.xiaomi.hm.health.devicex.manage.api.repository.DeviceRepositoryApi;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u000f\u0012\u0006\u0010\u0019\u001a\u00020\u0016¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0012\u0010\u000b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J\u0010\u0010\f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016J\u001a\u0010\u0011\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\u0010\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u0005\u001a\u0004\u0018\u00010\u000eJ\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0005\u001a\u00020\u0004R\u0016\u0010\u0019\u001a\u00020\u00168\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001d\u0010\u001e\u001a\u00020\u001a8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0017\u0010\u001d¨\u0006!"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/life/br/DeviceLifeEventBroadCast;", "Lcom/xiaomi/hm/health/device/setting/life/DeviceLifeCycle;", "Lcom/huami/device/event/br/DeviceConnectingAbility;", "Lorg/koin/core/component/KoinComponent;", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "device", "", "onDeviceBind", "onDeviceUnBind", "", "deviceId", "onConnecting", "onBoundedDeviceConnected", "onBoundedDeviceDisconnect", "Lcom/xiaomi/hm/health/databases/model/Device;", "", "status", "onDeviceStatusChange", "enable", WatchFaceApi.CUSTOMIZABLE_DISABLE, "Lcom/huami/device/event/br/DeviceInfoParcel;", "createInfoDto", "Landroidx/localbroadcastmanager/content/LocalBroadcastManager;", "a", "Landroidx/localbroadcastmanager/content/LocalBroadcastManager;", NotificationCompat.MessagingStyle.Message.KEY_SENDER, "Lcom/xiaomi/hm/health/devicex/manage/api/repository/DeviceRepositoryApi;", "b", "Lkotlin/Lazy;", "()Lcom/xiaomi/hm/health/devicex/manage/api/repository/DeviceRepositoryApi;", "deviceRepositoryApi", "<init>", "(Landroidx/localbroadcastmanager/content/LocalBroadcastManager;)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class DeviceLifeEventBroadCast implements DeviceLifeCycle, DeviceConnectingAbility, KoinComponent {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final LocalBroadcastManager sender;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceRepositoryApi;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ Throwable a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Throwable th) {
            super(0);
            this.a = th;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "convert device info error " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ Throwable a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Throwable th) {
            super(0);
            this.a = th;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "convert device info error " + this.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DeviceLifeEventBroadCast(@NotNull LocalBroadcastManager localBroadcastManager) {
        this.sender = localBroadcastManager;
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = KoinPlatformTools.INSTANCE.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.deviceRepositoryApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<DeviceRepositoryApi>() { // from class: com.xiaomi.hm.health.device.setting.life.br.DeviceLifeEventBroadCast$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.xiaomi.hm.health.devicex.manage.api.repository.DeviceRepositoryApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final DeviceRepositoryApi invoke() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(DeviceRepositoryApi.class), qualifier, objArr);
            }
        });
    }

    private final DeviceRepositoryApi a() {
        return (DeviceRepositoryApi) this.deviceRepositoryApi.getValue();
    }

    @Nullable
    public final DeviceInfoParcel createInfoDto(@Nullable Device device) {
        if (device == null) {
            return null;
        }
        try {
            String device_id = device.getDevice_id();
            HMDeviceType hMDeviceTypeFromValue = HMDeviceType.fromValue(device.getDevice_type().intValue());
            HMDeviceSource hMDeviceSourceFromValue = HMDeviceSource.fromValue(device.getDevice_source().intValue());
            String device_address = device.getDevice_address();
            int value = HMDeviceManager.getInstance().getMajorDeviceTypeNew().getValue();
            Integer device_type = device.getDevice_type();
            return new DeviceInfoParcel(device_id, hMDeviceTypeFromValue, hMDeviceSourceFromValue, device_address, "", 0, device_type != null && value == device_type.intValue());
        } catch (Throwable th) {
            HMLog.error$default(null, null, null, new a(th), 7, null);
            return null;
        }
    }

    @Override // com.xiaomi.hm.health.device.setting.life.DeviceVisibility
    public void disable(@NotNull HMBaseDevice device) {
        Intent intent = new Intent(DeviceLifeConst.ACTION);
        DeviceInfoParcel deviceInfoParcelCreateInfoDto = createInfoDto(device);
        intent.putExtra(DeviceLifeConst.ACTION_LIFE_EVENT_KEY, deviceInfoParcelCreateInfoDto == null ? null : DeviceInfoParcel.copy$default(deviceInfoParcelCreateInfoDto, null, null, null, null, null, 7, false, 95, null));
        this.sender.sendBroadcast(intent);
    }

    @Override // com.xiaomi.hm.health.device.setting.life.DeviceVisibility
    public void enable(@NotNull HMBaseDevice device) {
        Intent intent = new Intent(DeviceLifeConst.ACTION);
        DeviceInfoParcel deviceInfoParcelCreateInfoDto = createInfoDto(device);
        intent.putExtra(DeviceLifeConst.ACTION_LIFE_EVENT_KEY, deviceInfoParcelCreateInfoDto == null ? null : DeviceInfoParcel.copy$default(deviceInfoParcelCreateInfoDto, null, null, null, null, null, 6, false, 95, null));
        this.sender.sendBroadcast(intent);
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    @Override // com.xiaomi.hm.health.device.setting.life.DeviceLifeCycle
    public void onBoundedDeviceConnected(@NotNull HMBaseDevice device) {
        Intent intent = new Intent(DeviceLifeConst.ACTION);
        DeviceInfoParcel deviceInfoParcelCreateInfoDto = createInfoDto(device);
        intent.putExtra(DeviceLifeConst.ACTION_LIFE_EVENT_KEY, deviceInfoParcelCreateInfoDto == null ? null : DeviceInfoParcel.copy$default(deviceInfoParcelCreateInfoDto, null, null, null, null, null, 4, false, 95, null));
        this.sender.sendBroadcast(intent);
    }

    @Override // com.xiaomi.hm.health.device.setting.life.DeviceLifeCycle
    public void onBoundedDeviceDisconnect(@NotNull String deviceId) {
        Device deviceFindDeviceById = a().findDeviceById(deviceId);
        Intent intent = new Intent(DeviceLifeConst.ACTION);
        DeviceInfoParcel deviceInfoParcelCreateInfoDto = createInfoDto(deviceFindDeviceById);
        intent.putExtra(DeviceLifeConst.ACTION_LIFE_EVENT_KEY, deviceInfoParcelCreateInfoDto == null ? null : DeviceInfoParcel.copy$default(deviceInfoParcelCreateInfoDto, null, null, null, null, null, 5, false, 95, null));
        this.sender.sendBroadcast(intent);
    }

    @Override // com.huami.device.event.br.DeviceConnectingAbility
    public void onConnecting(@Nullable String deviceId) {
        if (deviceId == null) {
            return;
        }
        Intent intent = new Intent(DeviceLifeConst.ACTION);
        DeviceInfoParcel deviceInfoParcelCreateInfoDto = createInfoDto(a().findDeviceById(deviceId));
        intent.putExtra(DeviceLifeConst.ACTION_LIFE_EVENT_KEY, deviceInfoParcelCreateInfoDto == null ? null : DeviceInfoParcel.copy$default(deviceInfoParcelCreateInfoDto, null, null, null, null, null, 3, false, 95, null));
        this.sender.sendBroadcast(intent);
    }

    @Override // com.xiaomi.hm.health.device.setting.life.DeviceLifeCycle
    public void onDeviceBind(@NotNull HMBaseDevice device) {
        Intent intent = new Intent(DeviceLifeConst.ACTION);
        DeviceInfoParcel deviceInfoParcelCreateInfoDto = createInfoDto(device);
        intent.putExtra(DeviceLifeConst.ACTION_LIFE_EVENT_KEY, deviceInfoParcelCreateInfoDto == null ? null : DeviceInfoParcel.copy$default(deviceInfoParcelCreateInfoDto, null, null, null, null, null, 1, false, 95, null));
        this.sender.sendBroadcast(intent);
    }

    @Override // com.xiaomi.hm.health.device.setting.life.DeviceLifeCycle
    public void onDeviceStatusChange(@Nullable Device device, int status) {
        if (status == 0) {
            Intent intent = new Intent(DeviceLifeConst.ACTION);
            DeviceInfoParcel deviceInfoParcelCreateInfoDto = createInfoDto(device);
            intent.putExtra(DeviceLifeConst.ACTION_LIFE_EVENT_KEY, deviceInfoParcelCreateInfoDto == null ? null : DeviceInfoParcel.copy$default(deviceInfoParcelCreateInfoDto, null, null, null, null, null, 3, false, 95, null));
            this.sender.sendBroadcast(intent);
        }
    }

    @Override // com.xiaomi.hm.health.device.setting.life.DeviceLifeCycle
    public void onDeviceUnBind(@NotNull HMBaseDevice device) {
        Intent intent = new Intent(DeviceLifeConst.ACTION);
        DeviceInfoParcel deviceInfoParcelCreateInfoDto = createInfoDto(device);
        intent.putExtra(DeviceLifeConst.ACTION_LIFE_EVENT_KEY, deviceInfoParcelCreateInfoDto == null ? null : DeviceInfoParcel.copy$default(deviceInfoParcelCreateInfoDto, null, null, null, null, null, 2, false, 95, null));
        this.sender.sendBroadcast(intent);
    }

    @Nullable
    public final DeviceInfoParcel createInfoDto(@NotNull HMBaseDevice device) {
        try {
            DeviceInfo deviceInfo = device.getDeviceInfo();
            String deviceID = deviceInfo.getDeviceID();
            HMDeviceType deviceType = device.getDeviceType();
            HMDeviceSource mDeviceSource = device.getMDeviceSource();
            String address = device.getAddress();
            if (address == null) {
                address = "";
            }
            return new DeviceInfoParcel(deviceID, deviceType, mDeviceSource, address, deviceInfo.getSerialNumber(), 0, HMDeviceManager.getInstance().getMajorDeviceTypeNew() == device.getDeviceType());
        } catch (Throwable th) {
            HMLog.error$default(null, null, null, new b(th), 7, null);
            return null;
        }
    }
}
