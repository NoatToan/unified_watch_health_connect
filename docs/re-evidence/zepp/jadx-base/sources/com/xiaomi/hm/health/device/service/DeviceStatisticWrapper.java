package com.xiaomi.hm.health.device.service;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.gson.ExclusionStrategy;
import com.google.gson.FieldAttributes;
import com.google.gson.GsonBuilder;
import com.huami.account.HMLoginManager;
import com.huami.account.keeper.HMAccountKeeper;
import com.huami.bluetooth.device.HeadsetDevice;
import com.huami.bluetooth.profile.ecf.data.MultiDeviceState;
import com.huami.devicex.injection.keeper.KeeperProxyApi;
import com.huami.network.base.handler.IHMHttpResponseHandler;
import com.huami.network.base.model.HMHttpResponseData;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMCallback;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMMiLiDevice;
import com.xiaomi.hm.health.bt.device.HMMiLiProDevice;
import com.xiaomi.hm.health.bt.device.HmEarbudDevice;
import com.xiaomi.hm.health.bt.error.HMDeviceError;
import com.xiaomi.hm.health.bt.model.HMPeytoSettings;
import com.xiaomi.hm.health.bt.model.HMStatisticInfo;
import com.xiaomi.hm.health.bt.model.statistic.EarbudStatistic;
import com.xiaomi.hm.health.bt.profile.base.BatteryInfo;
import com.xiaomi.hm.health.bt.profile.base.DeviceInfo;
import com.xiaomi.hm.health.bt.profile.gdsp.HMGDSPData;
import com.xiaomi.hm.health.bt.profile.gdsp.HMGDSPType;
import com.xiaomi.hm.health.bt.profile.gdsp.IHMDataCallback;
import com.xiaomi.hm.health.bt.profile.gdsp.temperature.HMTemperatureInfo;
import com.xiaomi.hm.health.bt.profile.mili.model.Progress;
import com.xiaomi.hm.health.dataprocess.SportDay;
import com.xiaomi.hm.health.device.HMDeviceConfig;
import com.xiaomi.hm.health.device.service.DeviceStatisticWrapper;
import com.xiaomi.hm.health.device.webapi.device.HMDeviceWebAPI;
import com.xiaomi.hm.health.device.webapi.device.StatisticInfo;
import java.util.Calendar;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes18.dex */
public class DeviceStatisticWrapper {
    private static final String a = "DeviceStatisticWrapper";
    private static AtomicBoolean b = new AtomicBoolean(false);
    private static final Lazy<KeeperProxyApi> c = KoinJavaComponent.inject(KeeperProxyApi.class);

    public class a extends HMCallback<HMTemperatureInfo> {
        public final /* synthetic */ DeviceInfo a;
        public final /* synthetic */ BatteryInfo b;
        public final /* synthetic */ HMStatisticInfo c;

        public a(DeviceInfo deviceInfo, BatteryInfo batteryInfo, HMStatisticInfo hMStatisticInfo) {
            this.a = deviceInfo;
            this.b = batteryInfo;
            this.c = hMStatisticInfo;
        }

        @Override // com.xiaomi.hm.health.bt.device.HMCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onData(HMTemperatureInfo hMTemperatureInfo) {
            super.onData(hMTemperatureInfo);
            DeviceStatisticWrapper.t(this.a, this.b, this.c, hMTemperatureInfo);
        }
    }

    public class b implements IHMDataCallback<HMGDSPData> {
        public final /* synthetic */ DeviceInfo a;
        public final /* synthetic */ BatteryInfo b;

        public b(DeviceInfo deviceInfo, BatteryInfo batteryInfo) {
            this.a = deviceInfo;
            this.b = batteryInfo;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String f() {
            return "GDSP sync start ...";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String g(HMDeviceError hMDeviceError) {
            return "GDSP sync stopped. - " + hMDeviceError.getError();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String h() {
            return "GDSP data null";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String i() {
            return "GDSP obj null";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String j(String str) {
            return "GDSP data: " + str;
        }

        @Override // com.xiaomi.hm.health.bt.profile.gdsp.IHMDataCallback
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public void onStop(HMGDSPData hMGDSPData, final HMDeviceError hMDeviceError) {
            HMLog.info(DeviceStatisticWrapper.a, new Function0() { // from class: com.xiaomi.hm.health.device.service.b
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return DeviceStatisticWrapper.b.g(hMDeviceError);
                }
            });
            if (hMGDSPData == null) {
                HMLog.info(DeviceStatisticWrapper.a, new Function0() { // from class: com.xiaomi.hm.health.device.service.e
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return DeviceStatisticWrapper.b.h();
                    }
                });
                DeviceStatisticWrapper.b.getAndSet(false);
                return;
            }
            Object obj = hMGDSPData.get();
            if (obj == null) {
                HMLog.info(DeviceStatisticWrapper.a, new Function0() { // from class: com.xiaomi.hm.health.device.service.d
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return DeviceStatisticWrapper.b.i();
                    }
                });
                DeviceStatisticWrapper.b.getAndSet(false);
                return;
            }
            final String strR = DeviceStatisticWrapper.r(obj);
            HMLog.info(DeviceStatisticWrapper.a, new Function0() { // from class: com.xiaomi.hm.health.device.service.c
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return DeviceStatisticWrapper.b.j(strR);
                }
            });
            DeviceInfo deviceInfo = this.a;
            BatteryInfo batteryInfo = this.b;
            DeviceStatisticWrapper.u(deviceInfo, batteryInfo != null ? batteryInfo.toJsonString() : null, strR);
        }

        @Override // com.xiaomi.hm.health.bt.profile.gdsp.IHMDataCallback
        public void onProgress(Progress progress) {
        }

        @Override // com.xiaomi.hm.health.bt.profile.gdsp.IHMDataCallback
        public void onStart() {
            HMLog.info(DeviceStatisticWrapper.a, new Function0() { // from class: com.xiaomi.hm.health.device.service.f
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return DeviceStatisticWrapper.b.f();
                }
            });
        }
    }

    public class c extends HMCallback<EarbudStatistic> {
        public final /* synthetic */ DeviceInfo a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(boolean z, DeviceInfo deviceInfo) {
            super(z);
            this.a = deviceInfo;
        }

        @Override // com.xiaomi.hm.health.bt.device.HMCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onFinish(EarbudStatistic earbudStatistic) {
            super.onFinish(earbudStatistic);
            if (earbudStatistic == null) {
                DeviceStatisticWrapper.b.getAndSet(false);
            } else {
                DeviceStatisticWrapper.u(this.a, null, DeviceStatisticWrapper.r(earbudStatistic));
            }
        }
    }

    public class d implements ExclusionStrategy {
        @Override // com.google.gson.ExclusionStrategy
        public boolean shouldSkipClass(Class<?> cls) {
            return false;
        }

        @Override // com.google.gson.ExclusionStrategy
        public boolean shouldSkipField(FieldAttributes fieldAttributes) {
            String name = fieldAttributes.getName();
            return "unknownFields".equals(name) || "memoizedIsInitialized".equals(name) || "memoizedSerializedSize".equals(name) || "memoizedHashCode".equals(name) || name.startsWith("bitField");
        }
    }

    public class e extends IHMHttpResponseHandler {
        public final /* synthetic */ DeviceInfo a;

        public e(DeviceInfo deviceInfo) {
            this.a = deviceInfo;
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onCancel(int i) {
            HMLog.i(DeviceStatisticWrapper.a, "uploadStatisticInfo onCancel, type: " + i, new Object[0]);
            DeviceStatisticWrapper.b.getAndSet(false);
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onCompleted() {
            HMLog.i(DeviceStatisticWrapper.a, "uploadStatisticInfo onCompleted", new Object[0]);
            DeviceStatisticWrapper.b.getAndSet(false);
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onError(Throwable th) {
            HMLog.i(DeviceStatisticWrapper.a, "uploadStatisticInfo onError: " + (th != null ? th.getMessage() : "null error"), new Object[0]);
            DeviceStatisticWrapper.b.getAndSet(false);
        }

        @Override // com.huami.network.base.handler.IHMHttpResponseHandler
        public void onItem(HMHttpResponseData hMHttpResponseData) {
            boolean uploadDeviceStatisticInfoResult = HMDeviceWebAPI.getUploadDeviceStatisticInfoResult(hMHttpResponseData);
            if (uploadDeviceStatisticInfoResult) {
                ((KeeperProxyApi) DeviceStatisticWrapper.c.getValue()).saveStatisticDay(this.a.getDeviceSource().getType(), new SportDay());
            }
            HMLog.i(DeviceStatisticWrapper.a, "uploadStatisticInfo result: " + uploadDeviceStatisticInfoResult, new Object[0]);
            DeviceStatisticWrapper.b.getAndSet(false);
        }
    }

    public class f extends IHMHttpResponseHandler {
        public final /* synthetic */ DeviceInfo a;

        public f(DeviceInfo deviceInfo) {
            this.a = deviceInfo;
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onCancel(int i) {
            HMLog.i(DeviceStatisticWrapper.a, "uploadStatisticInfoNew onCancel, type: " + i, new Object[0]);
            DeviceStatisticWrapper.b.getAndSet(false);
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onCompleted() {
            HMLog.i(DeviceStatisticWrapper.a, "uploadStatisticInfoNew onCompleted", new Object[0]);
            DeviceStatisticWrapper.b.getAndSet(false);
        }

        @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
        public void onError(Throwable th) {
            HMLog.i(DeviceStatisticWrapper.a, "uploadStatisticInfoNew onError: " + (th != null ? th.getMessage() : "null error"), new Object[0]);
            DeviceStatisticWrapper.b.getAndSet(false);
        }

        @Override // com.huami.network.base.handler.IHMHttpResponseHandler
        public void onItem(HMHttpResponseData hMHttpResponseData) {
            boolean uploadDeviceStatisticInfoResult = HMDeviceWebAPI.getUploadDeviceStatisticInfoResult(hMHttpResponseData);
            if (uploadDeviceStatisticInfoResult) {
                ((KeeperProxyApi) DeviceStatisticWrapper.c.getValue()).saveStatisticDay(this.a.getDeviceSource().getType(), new SportDay());
            }
            HMLog.i(DeviceStatisticWrapper.a, "uploadStatisticInfoNew result: " + uploadDeviceStatisticInfoResult, new Object[0]);
            DeviceStatisticWrapper.b.getAndSet(false);
        }
    }

    public static void getAndUpload(HMBaseDevice hMBaseDevice) {
        HMLog.i(a, "getAndUpload start", new Object[0]);
        boolean zIsInEU = HMLoginManager.isInEU();
        boolean agreeUserExperience = HMAccountKeeper.INSTANCE.readAgreeUserExperience();
        if (hMBaseDevice == null || zIsInEU || !agreeUserExperience) {
            HMLog.i(a, "return as device: " + hMBaseDevice + "; is in EU: " + zIsInEU + "; readAgreeProtocol: " + agreeUserExperience, new Object[0]);
            return;
        }
        SportDay statisticDay = c.getValue().getStatisticDay(hMBaseDevice.getDeviceType());
        if (statisticDay.equals(new SportDay())) {
            HMLog.i(a, "Skip upload statistic! Last " + hMBaseDevice.getDeviceType() + "upload day: " + statisticDay, new Object[0]);
            return;
        }
        if (hMBaseDevice instanceof HMMiLiDevice) {
            k((HMMiLiDevice) hMBaseDevice);
        } else if (hMBaseDevice instanceof HmEarbudDevice) {
            q((HmEarbudDevice) hMBaseDevice);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void handleHdStatistic(Object obj, @NotNull HMBaseDevice hMBaseDevice) {
        String secondEarVer;
        String firmwareVersionStr;
        HMLog.i(a, "handleHdStatistic", new Object[0]);
        DeviceInfo deviceInfo = hMBaseDevice.getDeviceInfo();
        if (deviceInfo == null) {
            HMLog.i(a, "device info is null", new Object[0]);
            return;
        }
        BatteryInfo batteryInfo = hMBaseDevice.getBatteryInfo();
        if (!(hMBaseDevice instanceof HeadsetDevice)) {
            u(deviceInfo, batteryInfo != null ? batteryInfo.toJsonString() : null, r(obj));
            return;
        }
        HeadsetDevice headsetDevice = (HeadsetDevice) hMBaseDevice;
        if (headsetDevice.getHeadsetState() == null) {
            u(deviceInfo, batteryInfo != null ? batteryInfo.toJsonString() : null, r(obj));
            return;
        }
        MultiDeviceState.Host hostVersionHost = headsetDevice.versionHost();
        HMLog.i(a, "versionHost is: " + hostVersionHost, new Object[0]);
        if (hostVersionHost == MultiDeviceState.Host.Left.INSTANCE) {
            secondEarVer = deviceInfo.getFirmwareVersionStr();
            firmwareVersionStr = headsetDevice.getSecondEarVer();
        } else {
            secondEarVer = headsetDevice.getSecondEarVer();
            firmwareVersionStr = deviceInfo.getFirmwareVersionStr();
        }
        v(deviceInfo, batteryInfo != null ? batteryInfo.toJsonString() : null, r(obj), secondEarVer, firmwareVersionStr);
    }

    public static boolean isRunning() {
        HMLog.debug(a, new Function0() { // from class: p91
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DeviceStatisticWrapper.l();
            }
        });
        return b.get();
    }

    private static void k(HMMiLiDevice hMMiLiDevice) {
        DeviceInfo deviceInfo = hMMiLiDevice.getDeviceInfo();
        if (deviceInfo == null) {
            HMLog.i(a, "device info is null", new Object[0]);
            return;
        }
        if (b.get()) {
            HMLog.i(a, "in running...", new Object[0]);
            return;
        }
        b.getAndSet(true);
        HMDeviceSource deviceSource = deviceInfo.getDeviceSource();
        if (HMDeviceConfig.hasFeatureProtoStatistics(deviceSource)) {
            s(hMMiLiDevice);
            return;
        }
        HMStatisticInfo statisticInfo = hMMiLiDevice.getStatisticInfo();
        if (statisticInfo == null) {
            b.getAndSet(false);
            HMLog.i(a, "hmStatisticInfo is null!!", new Object[0]);
            return;
        }
        HMLog.i(a, "HMStatisticInfo:" + statisticInfo, new Object[0]);
        BatteryInfo batteryInfo = hMMiLiDevice.getBatteryInfo();
        if (!HMDeviceConfig.hasFeatureTemperature(deviceSource)) {
            t(deviceInfo, batteryInfo, statisticInfo, null);
        } else {
            HMLog.i(a, "hasFeatureTemperature", new Object[0]);
            ((HMMiLiProDevice) hMMiLiDevice).getTemperatureInfo(new a(deviceInfo, batteryInfo, statisticInfo));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String l() {
        return "isRunning:" + b.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String m(boolean z) {
        return "setIsRunning:" + z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String n() {
        return "Upload proto statistic!";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String o(HMDeviceSource hMDeviceSource) {
        return "Unsupported device: " + hMDeviceSource;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String p() {
        return "settings is null";
    }

    private static void q(@NonNull HmEarbudDevice hmEarbudDevice) {
        DeviceInfo deviceInfo = hmEarbudDevice.getDeviceInfo();
        if (deviceInfo == null) {
            return;
        }
        hmEarbudDevice.getEarbudStatistic(new c(false, deviceInfo));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String r(Object obj) {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.setExclusionStrategies(new d());
        return gsonBuilder.create().toJson(obj).replace("_\":", "\":");
    }

    private static void s(HMMiLiDevice hMMiLiDevice) {
        HMLog.info(a, new Function0() { // from class: o91
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DeviceStatisticWrapper.n();
            }
        });
        DeviceInfo deviceInfo = hMMiLiDevice.getDeviceInfo();
        final HMDeviceSource deviceSource = deviceInfo.getDeviceSource();
        if (!(hMMiLiDevice instanceof HMMiLiProDevice)) {
            b.getAndSet(false);
            HMLog.error(a, new Function0() { // from class: l91
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return DeviceStatisticWrapper.o(deviceSource);
                }
            });
            return;
        }
        BatteryInfo batteryInfo = hMMiLiDevice.getBatteryInfo();
        HMMiLiProDevice hMMiLiProDevice = (HMMiLiProDevice) hMMiLiDevice;
        HMPeytoSettings peytoSettings = hMMiLiProDevice.getPeytoSettings();
        if (peytoSettings != null) {
            HMDeviceWebAPI.updateDeviceSettingToServer(deviceSource, peytoSettings);
        } else {
            HMLog.info(a, new Function0() { // from class: n91
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return DeviceStatisticWrapper.p();
                }
            });
        }
        hMMiLiProDevice.gdspSync(HMGDSPType.PROTO, Calendar.getInstance(), new b(deviceInfo, batteryInfo));
    }

    public static void setIsRunning(final boolean z) {
        HMLog.debug(a, new Function0() { // from class: m91
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DeviceStatisticWrapper.m(z);
            }
        });
        b.getAndSet(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void t(DeviceInfo deviceInfo, BatteryInfo batteryInfo, HMStatisticInfo hMStatisticInfo, HMTemperatureInfo hMTemperatureInfo) {
        HMLog.i(a, "uploadStatisticInfo.", new Object[0]);
        HMDeviceWebAPI.uploadDeviceStatisticInfo(deviceInfo, batteryInfo, hMStatisticInfo, hMTemperatureInfo, new e(deviceInfo));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void u(DeviceInfo deviceInfo, String str, String str2) {
        v(deviceInfo, str, str2, null, null);
    }

    private static void v(DeviceInfo deviceInfo, String str, String str2, @Nullable String str3, @Nullable String str4) {
        HMLog.i(a, "uploadStatisticInfoNew.", new Object[0]);
        HMDeviceWebAPI.uploadDeviceStatisticInfoNew(new StatisticInfo(deviceInfo, str, str2, str3, str4), new f(deviceInfo));
    }
}
