package com.xiaomi.hm.health.device;

import com.huami.devicex.manager.DeviceManagerApi;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.device.HmEarbudDevice;
import com.xiaomi.hm.health.bt.profile.base.DeviceInfo;
import com.xiaomi.hm.health.bt.profile.base.ProfileUtils;
import com.xiaomi.hm.health.databases.HMDaoManager;
import com.xiaomi.hm.health.databases.model.Device;
import com.xiaomi.hm.health.device.event.HMDeviceBindEvent;
import com.xiaomi.hm.health.device.webapi.device.HMDeviceWebAPI;
import com.xiaomi.hm.health.device.webapi.device.HMWebBindInfo;
import de.greenrobot.event.EventBus;
import java.util.Calendar;
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

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004R\u0016\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001d\u0010\u000f\u001a\u00020\u000b8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/hm/health/device/EarbudEnableHelper;", "Lorg/koin/core/component/KoinComponent;", "Lcom/xiaomi/hm/health/databases/model/Device;", "dbDevice", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "bleDevice", "", "enableEarbud", "", "TAG", "Ljava/lang/String;", "Lcom/huami/devicex/manager/DeviceManagerApi;", "a", "Lkotlin/Lazy;", "()Lcom/huami/devicex/manager/DeviceManagerApi;", "deviceManagerApi", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class EarbudEnableHelper implements KoinComponent {

    @NotNull
    public static final EarbudEnableHelper INSTANCE;

    @NotNull
    public static final String TAG = "EarbudEnableHelper";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final Lazy deviceManagerApi;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "stop device fail";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "active device fail";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        final EarbudEnableHelper earbudEnableHelper = new EarbudEnableHelper();
        INSTANCE = earbudEnableHelper;
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = KoinPlatformTools.INSTANCE.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        deviceManagerApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<DeviceManagerApi>() { // from class: com.xiaomi.hm.health.device.EarbudEnableHelper$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.devicex.manager.DeviceManagerApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final DeviceManagerApi getA() {
                KoinComponent koinComponent = earbudEnableHelper;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(DeviceManagerApi.class), qualifier, objArr);
            }
        });
    }

    private EarbudEnableHelper() {
    }

    private final DeviceManagerApi a() {
        return (DeviceManagerApi) deviceManagerApi.getValue();
    }

    public final boolean enableEarbud(@NotNull Device dbDevice, @Nullable HMBaseDevice bleDevice) {
        DeviceInfo deviceInfo;
        String firmwareVersionStr;
        DeviceManagerApi deviceManagerApiA = a();
        HMDeviceType hMDeviceType = HMDeviceType.EARBUD;
        Device bindInfo = deviceManagerApiA.getBindInfo(hMDeviceType);
        if (bindInfo != null) {
            if (!HMDeviceWebAPI.updateDeviceToWeb(HMWebBindInfo.createUpdateInfo(bindInfo.getDevice_type().intValue(), bindInfo.getDevice_id(), 0, bindInfo.getDisplayName()))) {
                HMLog.info(TAG, a.a);
                return false;
            }
            EarbudEnableHelper earbudEnableHelper = INSTANCE;
            HmEarbudDevice hmEarbudDevice = (HmEarbudDevice) earbudEnableHelper.a().getDevice(hMDeviceType);
            if (hmEarbudDevice != null) {
                hmEarbudDevice.cancelDownloadMusic();
            }
            HMDaoManager.getInstance().getEarbudMusicInfoDao().deleteAll();
            earbudEnableHelper.a().disableDevice(hMDeviceType);
            EventBus.getDefault().postSticky(new HMDeviceBindEvent(false, hMDeviceType));
        }
        HMWebBindInfo hMWebBindInfoCreateUpdateInfo = HMWebBindInfo.createUpdateInfo(dbDevice.getDevice_type().intValue(), dbDevice.getDevice_id(), 1, dbDevice.getDisplayName());
        if (bleDevice != null && (deviceInfo = bleDevice.getDeviceInfo()) != null && (firmwareVersionStr = deviceInfo.getFirmwareVersionStr()) != null) {
            hMWebBindInfoCreateUpdateInfo.mFwVersion = firmwareVersionStr;
        }
        if (!HMDeviceWebAPI.updateDeviceToWeb(hMWebBindInfoCreateUpdateInfo)) {
            HMLog.info(TAG, b.a);
            return false;
        }
        Calendar calendar = Calendar.getInstance();
        long timeInMillis = calendar.getTimeInMillis();
        int timezoneKey = ProfileUtils.getTimezoneKey(calendar.getTimeZone());
        dbDevice.setActiveStatus(1);
        dbDevice.setDevice_sync_data_time(Long.valueOf(timeInMillis));
        dbDevice.setTime_zone(Integer.valueOf(timezoneKey));
        dbDevice.setDevice_sync_data_time_hr(Long.valueOf(timeInMillis));
        dbDevice.setTime_zone_sync_hr(Integer.valueOf(timezoneKey));
        HMDeviceType type = HMDeviceSource.fromValue(dbDevice.getDevice_source().intValue()).getType();
        a().enableDevice(dbDevice, bleDevice);
        EventBus.getDefault().postSticky(new HMDeviceBindEvent(true, type));
        return true;
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }
}
