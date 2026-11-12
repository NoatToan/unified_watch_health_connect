package com.xiaomi.hm.health.device.agps;

import android.content.Context;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.huami.device.core.agps.AgpsUpgradeBuilder;
import com.huami.device.core.agps.api.DownloadResourceType;
import com.huami.device.core.agps.comm.AGPSGroup;
import com.huami.device.core.agps.impl.executor.AgpsUpgradeExecutor;
import com.huami.device.core.agps.impl.executor.UpgradeExecutor;
import com.huami.device.core.agps.impl.store.AgpsTimeStore;
import com.huami.devicex.funapi.DeviceXFunctionsKt;
import com.huami.devicex.funapi.ManagerFunctionsKt;
import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.baseutil.NetUtil;
import com.xiaomi.hm.health.baseutil.TimeUtils;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.device.HMMiLiProDevice;
import com.xiaomi.hm.health.bt.profile.base.AGpsDto;
import com.xiaomi.hm.health.bt.profile.base.BatteryInfo;
import com.xiaomi.hm.health.bt.profile.base.DeviceInfo;
import com.xiaomi.hm.health.bt.profile.dfu.HMFirmwareType;
import com.xiaomi.hm.health.bt.profile.dfu.IHMFirmwareUpgradeCallback;
import com.xiaomi.hm.health.bt.profile.mili.model.Progress;
import com.xiaomi.hm.health.device.HMDeviceConfig;
import com.xiaomi.hm.health.device.agps.HMAgpsUpgradeManager;
import com.xiaomi.hm.health.device.deviceconfig.Feature;
import com.xiaomi.hm.health.device.deviceconfig.configs.ConfigHelperKt;
import com.xiaomi.hm.health.device.event.HMDeviceFwUpgradeEvent;
import com.xiaomi.hm.health.device.event.StatEvent;
import com.xiaomi.hm.health.device.firmware.FwUpgradeFeature;
import de.greenrobot.event.EventBus;
import java.util.Calendar;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes20.dex */
public class HMAgpsUpgradeManager implements AgpsUpgradeApi {
    public static final int SWF_GPS_SONY_LLE = 22;
    private static final String a = "HMAgpsUpgradeManager";
    private static final int b = 1;
    private static final int c = 86400000;
    private static final int d = 2;
    private static final int e = 5;
    private static final int i = 0;
    private static final int j = 1;
    private static final int k = 2;
    private static final int l = 3;
    private static final int m = 4;
    private static final int n = 5;
    private static final UpgradeExecutor f = new AgpsUpgradeExecutor();
    private static final AtomicBoolean g = new AtomicBoolean(false);
    private static AGpsDto h = null;
    private static Progress o = null;

    public class a implements IHMFirmwareUpgradeCallback {
        public final /* synthetic */ HMDeviceSource a;

        public a(HMDeviceSource hMDeviceSource) {
            this.a = hMDeviceSource;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String c() {
            return "get time store is null when classicBtAgpsUpgrade auto upgrade.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String d() {
            return "classicBtAgpsUpgrade stop upgrade is false. upgrade failure.";
        }

        @Override // com.xiaomi.hm.health.bt.profile.dfu.IHMFirmwareUpgradeCallback
        public void onFwProgress(Progress progress) {
            EventBus.getDefault().post(new HMDeviceFwUpgradeEvent(this.a, HMFirmwareType.FIRMWARE_GPS_CEP, progress));
        }

        @Override // com.xiaomi.hm.health.bt.profile.dfu.IHMFirmwareUpgradeCallback
        public void onFwStart(int i) {
            EventBus.getDefault().post(new HMDeviceFwUpgradeEvent(this.a, HMFirmwareType.FIRMWARE_GPS_CEP, 0));
        }

        @Override // com.xiaomi.hm.health.bt.profile.dfu.IHMFirmwareUpgradeCallback
        public void onFwStop(boolean z) {
            EventBus.getDefault().post(new HMDeviceFwUpgradeEvent(this.a, HMFirmwareType.FIRMWARE_GPS_CEP, 2, z));
            AgpsTimeStore agpsTimeStoreApi = DeviceXFunctionsKt.getAgpsTimeStoreApi();
            if (agpsTimeStoreApi == null) {
                HMLog.warn(HMAgpsUpgradeManager.a, new Function0() { // from class: com.xiaomi.hm.health.device.agps.a
                    @Override // kotlin.jvm.functions.Function0
                    /* JADX INFO: renamed from: invoke */
                    public final Object getA() {
                        return HMAgpsUpgradeManager.a.c();
                    }
                });
            } else if (z) {
                agpsTimeStoreApi.setAgpsUpdateTime(System.currentTimeMillis());
            } else {
                HMLog.warn(HMAgpsUpgradeManager.a, new Function0() { // from class: com.xiaomi.hm.health.device.agps.b
                    @Override // kotlin.jvm.functions.Function0
                    /* JADX INFO: renamed from: invoke */
                    public final Object getA() {
                        return HMAgpsUpgradeManager.a.d();
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Unit A(final Integer num, final Integer num2) {
        HMLog.info(a, new Function0() { // from class: cj2
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object getA() {
                return HMAgpsUpgradeManager.z(num, num2);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String B() {
        return "aGpsDto null!";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String C(Integer num, Integer num2) {
        return "upgrade agps process --> " + num + " -- " + num2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String D() {
        return "error of check upgrade.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String E() {
        return "get time store is null when needAgpsUpgrade auto upgrade.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String F() {
        return "error of load agps dto";
    }

    @Nullable
    private static AgpsTimeStore G(HMDeviceType hMDeviceType) throws Exception {
        HMBaseDevice device = ManagerFunctionsKt.getDeviceManagerApi().getDevice(hMDeviceType);
        if (device == null) {
            throw new Exception("device is null");
        }
        if (!device.isConnected()) {
            throw new Exception("device is not connected");
        }
        if (!ConfigHelperKt.hasFeature(Feature.GT3_SOURCE, device.getMDeviceSource())) {
            return DeviceXFunctionsKt.getAgpsTimeStoreApi();
        }
        AGpsDto aGpsDto = h;
        if (aGpsDto != null) {
            return new HuamiOSAgpsTimeStore(aGpsDto);
        }
        throw new Exception("null of device info, dto not update yet.");
    }

    private static boolean H(HMDeviceType hMDeviceType, boolean z) {
        HMDeviceSource boundDeviceSource = ManagerFunctionsKt.getDeviceManagerApi().getBoundDeviceSource(hMDeviceType);
        if (g.get()) {
            HMLog.i(a, "Ignore as running!!!", new Object[0]);
            return false;
        }
        if (!ConfigHelperKt.hasFeature(Feature.SUPPORT_GPS, boundDeviceSource) && !HMDeviceConfig.hasFeatureClassicBtGPS(boundDeviceSource)) {
            HMLog.d(a, "Ignore as not support:" + boundDeviceSource, new Object[0]);
            return false;
        }
        if (z) {
            if (boundDeviceSource == HMDeviceSource.MILI_PEYTO) {
                return false;
            }
            int i2 = Calendar.getInstance().get(11);
            HMLog.i(a, "needAgpsUpgrade isAuto: true ; " + i2 + ", start: 2; stop: 5", new Object[0]);
            if (i2 < 2 || i2 > 5) {
                HMLog.i(a, "自动更新:时辰未到", new Object[0]);
                return false;
            }
            HMLog.i(a, "自动更新 开始!", new Object[0]);
            return true;
        }
        try {
            AgpsTimeStore agpsTimeStoreG = G(hMDeviceType);
            if (agpsTimeStoreG == null) {
                HMLog.warn(a, new Function0() { // from class: fj2
                    @Override // kotlin.jvm.functions.Function0
                    /* JADX INFO: renamed from: invoke */
                    public final Object getA() {
                        return HMAgpsUpgradeManager.E();
                    }
                });
                return false;
            }
            if (agpsTimeStoreG instanceof HuamiOSAgpsTimeStore) {
                return agpsTimeStoreG.isExpired();
            }
            HMBaseDevice device = ManagerFunctionsKt.getDeviceManagerApi().getDevice(hMDeviceType);
            if (System.currentTimeMillis() - agpsTimeStoreG.getAgpsUpdateTime() >= (z ? 86400000L : agpsTimeStoreG.getAGPSExpireTime(device.getDeviceInfo() != null ? device.getDeviceInfo().getDeviceFeature() : null))) {
                HMLog.i(a, "match time.", new Object[0]);
                return true;
            }
            HMLog.i(a, "Ignore as not timeout!!! isAuto -> " + z, new Object[0]);
            return false;
        } catch (Exception e2) {
            HMLog.error(a, "100", e2, new Function0() { // from class: yi2
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object getA() {
                    return HMAgpsUpgradeManager.D();
                }
            });
            return false;
        }
    }

    public static synchronized boolean checkAgpsUpgrade(Context context, HMDeviceType hMDeviceType) {
        HMLog.d(a, "checkAgpsUpgrade:" + hMDeviceType, new Object[0]);
        int iN = n(context, hMDeviceType, false, null);
        o(iN, false);
        HMLog.i(a, "agpsUpgradeState:" + iN, new Object[0]);
        if (iN != 0) {
            return false;
        }
        HMDeviceSource boundDeviceSource = ManagerFunctionsKt.getDeviceManagerApi().getBoundDeviceSource(hMDeviceType);
        return HMDeviceConfig.hasFeatureClassicBtGPS(boundDeviceSource) ? r(boundDeviceSource) : p(context, hMDeviceType, false);
    }

    public static synchronized boolean checkAutoAgpsUpgrade(Context context, HMDeviceType hMDeviceType) {
        try {
            HMLog.d(a, "checkAutoAgpsUpgrade:" + hMDeviceType, new Object[0]);
            AgpsTimeStore agpsTimeStoreG = G(hMDeviceType);
            int iN = n(context, hMDeviceType, true, agpsTimeStoreG);
            o(iN, true);
            HMLog.i(a, "agpsUpgradeState:" + iN, new Object[0]);
            if (iN != 0) {
                return false;
            }
            p(context, hMDeviceType, true);
            if (agpsTimeStoreG != null) {
                agpsTimeStoreG.setAutoAgpsCheckTime(System.currentTimeMillis());
            }
            return true;
        } catch (Throwable th) {
            HMLog.error(a, "100", th, new Function0() { // from class: jj2
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object getA() {
                    return HMAgpsUpgradeManager.w();
                }
            });
            try {
                HMBaseDevice device = ManagerFunctionsKt.getDeviceManagerApi().getDevice(hMDeviceType);
                if (device != null && device.getMDeviceSource() != null) {
                    new AgpsUpgradeListener(device.getMDeviceSource(), new HMAgpsUpgradeManager()).onResult(true, 0);
                }
            } catch (Throwable th2) {
                HMLog.error(a, "101", th2, new Function0() { // from class: hj2
                    @Override // kotlin.jvm.functions.Function0
                    /* JADX INFO: renamed from: invoke */
                    public final Object getA() {
                        return HMAgpsUpgradeManager.x();
                    }
                });
                return false;
            }
            return false;
        }
    }

    public static Progress getAgpsProgress() {
        return o;
    }

    public static boolean hasAgpsUpgrade(Context context, HMDeviceType hMDeviceType) {
        return n(context, hMDeviceType, false, null) == 0;
    }

    private static int n(Context context, HMDeviceType hMDeviceType, boolean z, AgpsTimeStore agpsTimeStore) {
        if (z && agpsTimeStore == null) {
            HMLog.warn(a, new Function0() { // from class: ej2
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object getA() {
                    return HMAgpsUpgradeManager.t();
                }
            });
            return 1;
        }
        if (z && TimeUtils.isToday(agpsTimeStore.getAutoAgpsCheckTime())) {
            HMLog.d(a, "return as has checked!!!", new Object[0]);
            return 1;
        }
        if (!H(hMDeviceType, false)) {
            HMLog.i(a, "return as no need!!!", new Object[0]);
            return 1;
        }
        if (HMDeviceConfig.hasFeatureClassicBtGPS(ManagerFunctionsKt.getDeviceManagerApi().getBoundDeviceSource(hMDeviceType)) && !z) {
            HMLog.i(a, "classic Bt upgrade", new Object[0]);
            return 0;
        }
        if (!NetUtil.isNetworkConnected(context)) {
            HMLog.i(a, "Ignore as network disconnect!!!", new Object[0]);
            return 2;
        }
        if (z && !NetUtil.isConnectedByWifi(context)) {
            HMLog.i(a, "Ignore as not wifi connection in auto mode!!!", new Object[0]);
            return 3;
        }
        HMMiLiProDevice hMMiLiProDevice = (HMMiLiProDevice) ManagerFunctionsKt.getDeviceManagerApi().getDevice(hMDeviceType);
        if (hMMiLiProDevice == null || !hMMiLiProDevice.isConnected()) {
            HMLog.i(a, "Ignore as no device connection!!!", new Object[0]);
            return 4;
        }
        if (FwUpgradeFeature.INSTANCE.supportDfuV5(hMDeviceType) || q(context, hMDeviceType)) {
            return 0;
        }
        HMLog.i(a, "Ignore as low battery!!!", new Object[0]);
        return 5;
    }

    private static void o(int i2, boolean z) {
        String str = StatEvent.EVENT_AGPS_DAYUPDATE;
        String str2 = StatEvent.EVENT_AGPS_DAYUPDATEOFFLINE;
        if (i2 == 2) {
            if (z) {
                str2 = StatEvent.EVENT_AGPS_NIGHTUPDATEOFFLINE;
            }
            Analytics.recordEvent(new CountEventBuilder(str2).setValue(StatEvent.NO_NETWORK));
            if (z) {
                str = StatEvent.EVENT_AGPS_NIGHTUPDATE;
            }
            Analytics.recordEvent(new CountEventBuilder(str).setValue(StatEvent.OFFLINE));
            return;
        }
        if (i2 == 3) {
            Analytics.recordEvent(new CountEventBuilder(StatEvent.EVENT_AGPS_NIGHTUPDATEOFFLINE).setValue(StatEvent.CELL));
            Analytics.recordEvent(new CountEventBuilder(StatEvent.EVENT_AGPS_NIGHTUPDATE).setValue(StatEvent.OFFLINE));
            return;
        }
        if (i2 == 4) {
            if (z) {
                str2 = StatEvent.EVENT_AGPS_NIGHTUPDATEOFFLINE;
            }
            Analytics.recordEvent(new CountEventBuilder(str2).setValue(StatEvent.UNCONNECT));
            if (z) {
                str = StatEvent.EVENT_AGPS_NIGHTUPDATE;
            }
            Analytics.recordEvent(new CountEventBuilder(str).setValue(StatEvent.OFFLINE));
            return;
        }
        if (i2 != 5) {
            return;
        }
        if (z) {
            str2 = StatEvent.EVENT_AGPS_NIGHTUPDATEOFFLINE;
        }
        Analytics.recordEvent(new CountEventBuilder(str2).setValue(StatEvent.OTHER));
        if (z) {
            str = StatEvent.EVENT_AGPS_NIGHTUPDATE;
        }
        Analytics.recordEvent(new CountEventBuilder(str).setValue(StatEvent.OFFLINE));
    }

    private static boolean p(Context context, HMDeviceType hMDeviceType, final boolean z) {
        HMLog.i(a, "checkAgpsUpgrade:" + z, new Object[0]);
        final HMMiLiProDevice hMMiLiProDevice = (HMMiLiProDevice) ManagerFunctionsKt.getDeviceManagerApi().getDevice(hMDeviceType);
        if (hMMiLiProDevice == null || !hMMiLiProDevice.isConnected()) {
            HMLog.i(a, "Error：device interrupt connection!!!", new Object[0]);
            return false;
        }
        g.getAndSet(true);
        f.execute(new Function0() { // from class: xi2
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object getA() {
                return HMAgpsUpgradeManager.v(hMMiLiProDevice, z);
            }
        });
        return true;
    }

    private static boolean q(Context context, HMDeviceType hMDeviceType) {
        BatteryInfo batteryInfo;
        HMBaseDevice device = ManagerFunctionsKt.getDeviceManagerApi().getDevice(hMDeviceType);
        if (device == null || (batteryInfo = device.getBatteryInfo()) == null) {
            return false;
        }
        if (batteryInfo.getLevel() > 10) {
            return true;
        }
        if (DeviceXFunctionsKt.getAppStateApi().isForeground() && context != null) {
            ManagerFunctionsKt.getLowBatteryApi().showMiliHelper(context);
        }
        return false;
    }

    private static boolean r(HMDeviceSource hMDeviceSource) {
        ManagerFunctionsKt.getSmartWatchUpgradeAgpsApi().agpsUpgrade(new a(hMDeviceSource));
        return true;
    }

    private static boolean s(HMMiLiProDevice hMMiLiProDevice) {
        DeviceInfo deviceInfo = hMMiLiProDevice.getDeviceInfo();
        if (deviceInfo == null) {
            HMLog.i(a, " deviceInfo is null!!!", new Object[0]);
            return false;
        }
        com.xiaomi.hm.health.bt.profile.feature.Feature deviceFeature = deviceInfo.getDeviceFeature();
        if (deviceFeature == null) {
            HMLog.i(a, "Feature is null!!!", new Object[0]);
            return false;
        }
        AgpsUpgradeListener agpsUpgradeListener = new AgpsUpgradeListener(deviceInfo.getDeviceSource(), new HMAgpsUpgradeManager());
        try {
            if (!(G(hMMiLiProDevice.getDeviceType()) instanceof HuamiOSAgpsTimeStore)) {
                boolean zUpgrade = AgpsUpgradeBuilder.INSTANCE.setAppInfo(new MifitAppInfoFactory().createInfo()).setIsUserIdentified(StatEvent.isUserIdentified().booleanValue()).setContext(DeviceXFunctionsKt.getContext()).setDevice(hMMiLiProDevice).setFeature(deviceFeature).setUpgradeListener(agpsUpgradeListener).build().upgrade(new Function2() { // from class: zi2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return HMAgpsUpgradeManager.A((Integer) obj, (Integer) obj2);
                    }
                });
                updateAGpsDto(hMMiLiProDevice);
                return zUpgrade;
            }
            if (h == null) {
                HMLog.error(a, new Function0() { // from class: gj2
                    @Override // kotlin.jvm.functions.Function0
                    /* JADX INFO: renamed from: invoke */
                    public final Object getA() {
                        return HMAgpsUpgradeManager.B();
                    }
                });
                updateAGpsDto(hMMiLiProDevice);
                return false;
            }
            boolean zUpgrade2 = AgpsUpgradeBuilder.INSTANCE.setUpgradeListener(agpsUpgradeListener).setDevice(hMMiLiProDevice).setContext(DeviceXFunctionsKt.getContext()).setAppInfo(new MifitAppInfoFactory().createInfo(DownloadResourceType.EPO)).setAgpsTypes(AGPSGroup.INSTANCE.decode(h.getAGpsType().intValue())).build().upgrade(new Function2() { // from class: aj2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return HMAgpsUpgradeManager.y((Integer) obj, (Integer) obj2);
                }
            });
            updateAGpsDto(hMMiLiProDevice);
            return zUpgrade2;
        } catch (Throwable th) {
            try {
                HMLog.e(a, th, "升级AGPS错误", new Object[0]);
                agpsUpgradeListener.onResult(false, null);
                agpsUpgradeListener.onStop();
                return false;
            } finally {
                updateAGpsDto(hMMiLiProDevice);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String t() {
        return "get time store is null when check agps auto upgrade.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String u() {
        return "doUpgrade agps then time store is null.";
    }

    @WorkerThread
    public static void updateAGpsDto(@Nullable HMBaseDevice hMBaseDevice) {
        if (hMBaseDevice == null) {
            h = null;
        }
        if (hMBaseDevice == null) {
            return;
        }
        if (!hMBaseDevice.isConnected()) {
            h = null;
        }
        try {
            h = hMBaseDevice.getAGpsDto();
        } catch (Exception e2) {
            HMLog.error(a, "100", e2, new Function0() { // from class: ij2
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object getA() {
                    return HMAgpsUpgradeManager.F();
                }
            });
            h = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Unit v(HMMiLiProDevice hMMiLiProDevice, boolean z) {
        boolean zS = s(hMMiLiProDevice);
        String str = StatEvent.EVENT_AGPS_NIGHTUPDATE;
        if (zS) {
            AgpsTimeStore agpsTimeStoreApi = DeviceXFunctionsKt.getAgpsTimeStoreApi();
            if (agpsTimeStoreApi != null) {
                agpsTimeStoreApi.setAgpsUpdateTime(System.currentTimeMillis());
            } else {
                HMLog.warn(a, new Function0() { // from class: dj2
                    @Override // kotlin.jvm.functions.Function0
                    /* JADX INFO: renamed from: invoke */
                    public final Object getA() {
                        return HMAgpsUpgradeManager.u();
                    }
                });
            }
            if (!z) {
                str = StatEvent.EVENT_AGPS_DAYUPDATE;
            }
            Analytics.recordEvent(new CountEventBuilder(str).setValue("Success"));
        } else {
            if (!z) {
                str = StatEvent.EVENT_AGPS_DAYUPDATE;
            }
            Analytics.recordEvent(new CountEventBuilder(str).setValue("Fail"));
        }
        g.getAndSet(false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String w() {
        return "error of check upgrade.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String x() {
        return "try to close agps upgrade error";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Unit y(final Integer num, final Integer num2) {
        HMLog.info(a, new Function0() { // from class: bj2
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object getA() {
                return HMAgpsUpgradeManager.C(num, num2);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String z(Integer num, Integer num2) {
        return "upgrade agps process --> " + num + " -- " + num2;
    }

    @Override // com.xiaomi.hm.health.device.agps.AgpsUpgradeApi
    public void updateAgpsProgress(@Nullable Progress progress) {
        if (progress == null) {
            o = null;
            return;
        }
        if (o == null) {
            o = new Progress();
        }
        Progress progress2 = o;
        progress2.total = progress.total;
        progress2.progress = progress.progress;
    }
}
