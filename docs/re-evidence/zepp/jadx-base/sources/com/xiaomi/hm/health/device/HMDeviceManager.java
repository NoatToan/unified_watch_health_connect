package com.xiaomi.hm.health.device;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.p008lifecycle.FlowLiveDataConversions;
import androidx.p008lifecycle.LiveData;
import com.huami.account.HMLoginManager;
import com.huami.bluetooth.device.MozartDevice;
import com.huami.devicex.funapi.DeviceXFunctionsKt;
import com.huami.devicex.injection.SensorHubControllerApi;
import com.huami.devicex.injection.basic.DeviceUtilsApi;
import com.huami.devicex.injection.basic.DeviceUtilsZeppApi;
import com.huami.devicex.injection.keeper.DeviceTimeStoreApi;
import com.huami.devicex.injection.keeper.KeeperProxyApi;
import com.huami.devicex.manager.DataCacheApi;
import com.huami.devicex.manager.DeviceManagerZeppApi;
import com.huami.devicex.manager.DeviceRepositoryWrapper;
import com.huami.ecg.core.db.entity.EcgData;
import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.huami.tools.log.HMLog;
import com.huami.watch.companion.CompanionApplication;
import com.huami.watch.companion.device.DeviceSource;
import com.huami.watch.companion.device.DeviceUtil;
import com.huami.watch.wififtp.WifiFtpModule;
import com.xiaomi.hm.health.bt.classic.HMSportController;
import com.xiaomi.hm.health.bt.device.HMBaseBleDevice;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMBoltClassicDevice;
import com.xiaomi.hm.health.bt.device.HMCallback;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.device.HMMiLiDevice;
import com.xiaomi.hm.health.bt.device.HMMiLiProDevice;
import com.xiaomi.hm.health.bt.device.HMWeightDevice;
import com.xiaomi.hm.health.bt.device.HmEarbudDevice;
import com.xiaomi.hm.health.bt.device.Status;
import com.xiaomi.hm.health.bt.device.smartwatch.HMSmartWatchDevice;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import com.xiaomi.hm.health.bt.ife.IHMConnectionCallback;
import com.xiaomi.hm.health.bt.profile.base.BatteryInfo;
import com.xiaomi.hm.health.bt.profile.base.DeviceInfo;
import com.xiaomi.hm.health.bt.profile.base.ProfileUtils;
import com.xiaomi.hm.health.bt.profile.base.RealtimeStep;
import com.xiaomi.hm.health.databases.HMDaoManager;
import com.xiaomi.hm.health.databases.LiveDataSupportKt;
import com.xiaomi.hm.health.databases.model.Device;
import com.xiaomi.hm.health.databases.model.DeviceDao;
import com.xiaomi.hm.health.device.HMDeviceManager;
import com.xiaomi.hm.health.device.amazfit_watch.HMWatchLogic;
import com.xiaomi.hm.health.device.assistant.BleExchangeService;
import com.xiaomi.hm.health.device.bolt.FtmsErrorHelper;
import com.xiaomi.hm.health.device.bolt.TreadmillMaintainEvent;
import com.xiaomi.hm.health.device.callback.MyActivityDataSyncCallback;
import com.xiaomi.hm.health.device.callback.MyGpsDataSyncCallback;
import com.xiaomi.hm.health.device.callback.MyHrDataSyncCallback;
import com.xiaomi.hm.health.device.callback.MyRealtimeStepCallback;
import com.xiaomi.hm.health.device.callback.weight.WeightDataCallbackFactory;
import com.xiaomi.hm.health.device.connect.ConnectAnalytic;
import com.xiaomi.hm.health.device.deviceconfig.Feature;
import com.xiaomi.hm.health.device.deviceconfig.configs.ConfigHelperKt;
import com.xiaomi.hm.health.device.deviceproperty.HMDevicePropertyCache;
import com.xiaomi.hm.health.device.earbud.repo.EarbudConfigDataManager;
import com.xiaomi.hm.health.device.earbud.service.EarbudMusicDownloadService;
import com.xiaomi.hm.health.device.event.HMActiveDeviceEvent;
import com.xiaomi.hm.health.device.event.HMDeviceBindEvent;
import com.xiaomi.hm.health.device.event.HMDeviceConnectionEvent;
import com.xiaomi.hm.health.device.event.HMDeviceRealtimeStepEvent;
import com.xiaomi.hm.health.device.event.HMDeviceSyncDataEvent;
import com.xiaomi.hm.health.device.event.StatEvent;
import com.xiaomi.hm.health.device.feature.sync.SyncCenterManager;
import com.xiaomi.hm.health.device.feature.sync.earbud.EarbudClashResolve;
import com.xiaomi.hm.health.device.feature.sync.earbud.EarbudClashResolveImpl;
import com.xiaomi.hm.health.device.firmware.FwUnZipStatusHolder;
import com.xiaomi.hm.health.device.firmware.HMFwUtils;
import com.xiaomi.hm.health.device.headset.MozartDeviceStateService;
import com.xiaomi.hm.health.device.health.device.HealthDetectInitFactory;
import com.xiaomi.hm.health.device.setting.life.DeviceLifeCycle;
import com.xiaomi.hm.health.device.setting.life.DeviceRestoreEventGetter;
import com.xiaomi.hm.health.device.setting.life.feature.MusicControllerSetter;
import com.xiaomi.hm.health.device.setting.life.impl.DeviceLifeCycleImpl;
import com.xiaomi.hm.health.device.webapi.device.HMDeviceWebAPI;
import com.xiaomi.hm.health.device.webapi.device.HMWebBindInfo;
import com.xiaomi.hm.health.devicex.manage.api.core.feature.DeviceSnService;
import com.xiaomi.hm.health.devicex.manage.api.core.manager.DeviceConnectManger;
import com.xiaomi.hm.health.devicex.manage.api.repository.DeviceRepositoryApi;
import com.xiaomi.hm.health.model.account.HMPersonInfo;
import com.xiaomi.hm.health.stress.StressUseCaseUtils;
import de.greenrobot.event.EventBus;
import defpackage.pt2;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;
import kotlin.Lazy;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.FlowKt;
import org.greenrobot.greendao.query.WhereCondition;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes20.dex */
@SuppressLint({"MissingPermission"})
public class HMDeviceManager implements IHMConnectionCallback, DeviceManagerZeppApi, DeviceTimeStoreApi {
    private static final String A = "single_stress";
    private static final Lazy<DeviceRepositoryApi> B = KoinJavaComponent.inject(DeviceRepositoryApi.class);
    private static final Lazy<DeviceRepositoryWrapper> C = KoinJavaComponent.inject(DeviceRepositoryWrapper.class);
    public static final String PROPERTY_SYNC_TIME = "huami.mifit.user.settings.synctime";
    private static final String u = "HMDeviceManager";
    private static final int v = 1;
    private static final int w = 120000;
    private static final long x = 1500;

    @SuppressLint({"StaticFieldLeak"})
    private static HMDeviceManager y = null;
    private static final String z = "all_day_stress";
    private final HMDeviceType[] a;
    private Context b;
    private final Lazy<DataCacheApi> c;
    private final Lazy<SensorHubControllerApi> d;
    private final Lazy<MusicControllerSetter> e;
    private final Lazy<DeviceUtilsApi> f;
    private final Lazy<KeeperProxyApi> g;
    private final EarbudClashResolve h;
    private final HashMap<HMDeviceType, HMBaseDevice> i;
    private final HashMap<HMDeviceType, Device> j;
    private final HashMap<String, String> k;
    private volatile boolean l;
    private LocaleDeviceRepo m;
    private Handler n;
    private final ConnectAnalytic o;
    private final Lazy<DeviceConnectManger> p;
    private DeviceLifeCycle q;
    private DeviceRestoreEventGetter r;
    private final Lazy<DeviceSnService> s;
    private final HMDeviceType[] t;

    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what == 1) {
                HMDeviceManager.this.destroyDevice((HMDeviceType) message.obj);
            }
        }
    }

    public class b extends HMCallback {
        @Override // com.xiaomi.hm.health.bt.device.HMCallback
        public void onFinish(boolean z) {
            HMLog.i(HMDeviceManager.u, "syncMacAddress: " + z, new Object[0]);
        }
    }

    public class c extends HMCallback<Boolean> {
        public c() {
        }

        @Override // com.xiaomi.hm.health.bt.device.HMCallback
        public void onFinish(boolean z) {
            HMLog.i(HMDeviceManager.u, "disableNotify: " + z, new Object[0]);
            if (z) {
                ((KeeperProxyApi) HMDeviceManager.this.g.getValue()).setWriteMaintain(false);
                ((KeeperProxyApi) HMDeviceManager.this.g.getValue()).setMaintain(false);
                ((KeeperProxyApi) HMDeviceManager.this.g.getValue()).setMaintainRedDotVisible(true);
                EventBus.getDefault().post(new TreadmillMaintainEvent(false));
            }
        }
    }

    public static /* synthetic */ class d {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;
        public static final /* synthetic */ int[] c;

        static {
            int[] iArr = new int[HMDeviceSource.values().length];
            c = iArr;
            try {
                iArr[HMDeviceSource.WEIGHT_AMAZFIT_SCALE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            int[] iArr2 = new int[HMDeviceType.values().length];
            b = iArr2;
            try {
                iArr2[HMDeviceType.MILI.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[HMDeviceType.SENSORHUB.ordinal()] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                b[HMDeviceType.SHOES.ordinal()] = 3;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                b[HMDeviceType.WEIGHT.ordinal()] = 4;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                b[HMDeviceType.WATCH.ordinal()] = 5;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                b[HMDeviceType.EARBUD.ordinal()] = 6;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                b[HMDeviceType.HEADSET.ordinal()] = 7;
            } catch (NoSuchFieldError unused8) {
            }
            int[] iArr3 = new int[Status.values().length];
            a = iArr3;
            try {
                iArr3[Status.CONNECTING_TIMEOUT.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[Status.DISCONNECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[Status.AUTH_SUCCESS.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[Status.SCANNING.ordinal()] = 4;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                a[Status.GATT_CONNECTED.ordinal()] = 5;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                a[Status.INIT_SUCCESS.ordinal()] = 6;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                a[Status.GATT_CONNECTING.ordinal()] = 7;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                a[Status.INIT_FAILED.ordinal()] = 8;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                a[Status.GATT_CONNECT_FAILED.ordinal()] = 9;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                a[Status.GATT_DISCONNECT.ordinal()] = 10;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                a[Status.AUTH_FAILED.ordinal()] = 11;
            } catch (NoSuchFieldError unused19) {
            }
        }
    }

    private HMDeviceManager(Context context) {
        HMDeviceType hMDeviceType = HMDeviceType.MILI;
        HMDeviceType hMDeviceType2 = HMDeviceType.WATCH;
        HMDeviceType hMDeviceType3 = HMDeviceType.SENSORHUB;
        HMDeviceType hMDeviceType4 = HMDeviceType.SHOES;
        HMDeviceType hMDeviceType5 = HMDeviceType.WEIGHT;
        this.a = new HMDeviceType[]{hMDeviceType, hMDeviceType2, hMDeviceType3, hMDeviceType4, hMDeviceType5};
        this.c = KoinJavaComponent.inject(DataCacheApi.class);
        this.d = KoinJavaComponent.inject(SensorHubControllerApi.class);
        this.e = KoinJavaComponent.inject(MusicControllerSetter.class);
        this.f = KoinJavaComponent.inject(DeviceUtilsApi.class);
        this.g = KoinJavaComponent.inject(KeeperProxyApi.class);
        this.h = new EarbudClashResolveImpl();
        this.i = new HashMap<>();
        this.j = new HashMap<>();
        this.k = new HashMap<>();
        this.l = false;
        this.m = null;
        this.o = new ConnectAnalytic();
        this.p = KoinJavaComponent.inject(DeviceConnectManger.class);
        this.s = KoinJavaComponent.inject(DeviceSnService.class);
        this.t = new HMDeviceType[]{hMDeviceType, hMDeviceType2, hMDeviceType4, HMDeviceType.HEADSET, HMDeviceType.EARBUD, hMDeviceType5, HMDeviceType.TREADMILL, hMDeviceType3};
        this.b = context.getApplicationContext();
        this.r = new DeviceRestoreEventGetter();
        HandlerThread handlerThread = new HandlerThread(u);
        handlerThread.start();
        this.n = new a(handlerThread.getLooper());
    }

    private void A0(HMDeviceType hMDeviceType) {
        Device deviceRemove = this.j.remove(hMDeviceType);
        if (deviceRemove != null) {
            deviceRemove.setDevice_bind_status(-1);
            deviceRemove.setStatus(-1);
            deviceRemove.setActiveStatus(0);
            B.getValue().update(deviceRemove);
            if (ConfigHelperKt.hasFeature(Feature.HEADSET_MOZART_SOURCE_S, HMDeviceSource.fromValue(deviceRemove.getDevice_source().intValue()))) {
                w0().removeDevice(deviceRemove);
            }
        }
    }

    private void B0() {
        this.j.clear();
        Iterator<HMBaseDevice> it2 = this.i.values().iterator();
        while (it2.hasNext()) {
            it2.next().destroy();
        }
        this.i.clear();
    }

    private void C0(@NotNull final HMDeviceType hMDeviceType, boolean z2) {
        F0(hMDeviceType, z2, new Runnable() { // from class: at2
            @Override // java.lang.Runnable
            public final void run() {
                this.a.i0(hMDeviceType);
            }
        });
    }

    private void D0(@NotNull HMDeviceType hMDeviceType) {
        if (!HMFwUtils.allowEarbudDataSync()) {
            HMLog.info(u, new Function0() { // from class: dt2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return HMDeviceManager.q0();
                }
            });
            return;
        }
        HmEarbudDevice hmEarbudDevice = (HmEarbudDevice) getDevice(hMDeviceType);
        if (hmEarbudDevice != null) {
            hmEarbudDevice.startSyncData(getBoundDeviceSyncTime(hMDeviceType), new MyActivityDataSyncCallback(this, getBoundDeviceSource(hMDeviceType)));
        } else {
            HMLog.warn(u, new Function0() { // from class: rs2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return HMDeviceManager.r0();
                }
            });
        }
    }

    private void E0(HMDeviceType hMDeviceType) {
        boolean z2;
        HMBaseDevice device = getDevice(hMDeviceType);
        if (hMDeviceType == HMDeviceType.WATCH) {
            HMLog.i(u, "return for watch.", new Object[0]);
            return;
        }
        if (device == null) {
            HMLog.i(u, "ERROR:未获取到绑定设备", new Object[0]);
            return;
        }
        DeviceInfo deviceInfo = device.getDeviceInfo();
        if (deviceInfo == null) {
            HMLog.i(u, "ERROR:设备信息为空", new Object[0]);
            return;
        }
        Device device2 = this.j.get(hMDeviceType);
        if (device2 == null) {
            HMLog.i(u, "ERROR:获取缓存设备信息为空", new Object[0]);
            return;
        }
        String firmwareVersionStr = deviceInfo.getFirmwareVersionStr();
        String firmware2VersionStr = deviceInfo.getFirmware2VersionStr();
        HMLog.i(u, "Update firmware version:" + firmwareVersionStr + "," + firmware2VersionStr, new Object[0]);
        if (TextUtils.equals(device2.getFirmware_version(), firmwareVersionStr) || firmwareVersionStr == null) {
            z2 = false;
        } else {
            device2.setFirmware_version(firmwareVersionStr);
            z2 = true;
        }
        if (!TextUtils.equals(device2.getHr_firmware_version(), firmware2VersionStr)) {
            device2.setHr_firmware_version(firmware2VersionStr);
            z2 = true;
        }
        if (z2) {
            device2.setFirmware_version(firmwareVersionStr);
            B.getValue().insertOrReplace(device2);
            if (ConfigHelperKt.hasFeature(Feature.HEADSET_MOZART_SOURCE_S, HMDeviceSource.fromValue(device2.getDevice_source().intValue()))) {
                w0().updateDevice(device2);
                return;
            }
            HMWebBindInfo hMWebBindInfoCreateUpdateInfo = HMWebBindInfo.createUpdateInfo(device2.getDevice_type().intValue(), device2.getDevice_id(), device2.getActiveStatus().intValue(), device2.getDisplayName());
            hMWebBindInfoCreateUpdateInfo.mFwVersion = firmwareVersionStr;
            hMWebBindInfoCreateUpdateInfo.setHrFwVersion(firmware2VersionStr);
            HMDeviceWebAPI.updateDeviceToWeb(hMWebBindInfoCreateUpdateInfo);
        }
    }

    private void F0(HMDeviceType hMDeviceType, boolean z2, Runnable runnable) {
        try {
            if (!HMFwUtils.allowDataSync(hMDeviceType)) {
                HMLog.warn(u, new Function0() { // from class: ts2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return HMDeviceManager.s0();
                    }
                });
                return;
            }
            SyncCenterManager syncCenterManager = SyncCenterManager.INSTANCE;
            if (syncCenterManager.isUsingSyncCenter(hMDeviceType)) {
                HMLog.info(u, new Function0() { // from class: vs2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return HMDeviceManager.t0();
                    }
                });
                syncCenterManager.start(hMDeviceType, z2);
            } else {
                HMLog.info(u, new Function0() { // from class: bt2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return HMDeviceManager.u0();
                    }
                });
                runnable.run();
            }
        } catch (Exception e) {
            HMLog.error(u, "001", e, new Function0() { // from class: ct2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return HMDeviceManager.v0();
                }
            });
        }
    }

    private void G(Device device) {
        B.getValue().insertOrReplace(device);
        HMDeviceType hMDeviceTypeFromValue = HMDeviceType.fromValue(device.getDevice_type().intValue());
        HMLog.i(u, "addBindInfo put device type = " + hMDeviceTypeFromValue.getValue() + "; mac address: " + device.getDevice_address(), new Object[0]);
        this.j.put(hMDeviceTypeFromValue, device);
    }

    private void H(HMDeviceType hMDeviceType, Status status) {
        String strValueOf = String.valueOf(getBoundDeviceSource(hMDeviceType).getValue());
        String str = this.k.get(strValueOf);
        int i = d.a[status.ordinal()];
        String str2 = StatEvent.DEVICE_CONNECT_SUCCESS;
        switch (i) {
            case 2:
            case 8:
            case 9:
            case 10:
            case 11:
                str2 = (!TextUtils.isEmpty(str) && str.equals(StatEvent.DEVICE_CONNECT_SUCCESS)) ? StatEvent.DEVICE_DISCONNECT : StatEvent.DEVICE_CONNECT_FAILED;
                break;
            case 3:
                break;
            case 4:
                str2 = StatEvent.DEVICE_SCAN;
                break;
            case 5:
            case 6:
            case 7:
                str2 = StatEvent.DEVICE_CONNECT;
                break;
            default:
                str2 = null;
                break;
        }
        if (TextUtils.isEmpty(str2) || str2.equals(str)) {
            return;
        }
        HMLog.i("bluetooth_analytics", str2, new Object[0]);
        boolean zIsInMainland = HMLoginManager.isInMainland();
        Analytics.recordEvent(new CountEventBuilder(str2).setValue(strValueOf).setIdentified(zIsInMainland).setAnonymous(!zIsInMainland));
        this.k.put(strValueOf, str2);
    }

    private void I() {
        List<Device> listFindBoundDevices = B.getValue().findBoundDevices(new HMDeviceType[0]);
        if (listFindBoundDevices.size() == 0) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        boolean z2 = true;
        for (Device device : listFindBoundDevices) {
            Integer activeStatus = device.getActiveStatus();
            HMLog.d(u, "device bind:" + device.getDevice_bind_status() + ",active:" + activeStatus, new Object[0]);
            if (ConfigHelperKt.hasFeature(Feature.HEADSET_MOZART_SOURCE_S, HMDeviceSource.fromValue(device.getDevice_source().intValue())) && (activeStatus == null || activeStatus.intValue() != 1)) {
                device.setActiveStatus(1);
                arrayList.add(device);
            }
            if (activeStatus != null) {
                z2 = false;
            }
        }
        if (!arrayList.isEmpty()) {
            B.getValue().updateDeviceInTx((Device[]) arrayList.toArray(new Device[0]));
        }
        if (z2) {
            for (Device device2 : listFindBoundDevices) {
                if (device2.getActiveStatus() == null) {
                    device2.setActiveStatus(1);
                    B.getValue().update(device2);
                }
            }
        }
    }

    private int J(HMDeviceType hMDeviceType) {
        HMDeviceType hMDeviceType2 = HMDeviceType.MILI;
        if (hMDeviceType != hMDeviceType2 && hMDeviceType != HMDeviceType.WATCH) {
            return C.getValue().findBindAndActiveDevices(hMDeviceType).size();
        }
        Lazy<DeviceRepositoryWrapper> lazy = C;
        return lazy.getValue().findBindAndActiveDevices(hMDeviceType2).size() + lazy.getValue().findBindAndActiveDevices(HMDeviceType.WATCH).size();
    }

    @Nullable
    private Device K() {
        List<Device> listFindMozartDeviceState = C.getValue().findMozartDeviceState();
        Device device = null;
        if (listFindMozartDeviceState.isEmpty()) {
            HMLog.info(u, new Function0() { // from class: ys2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return HMDeviceManager.R();
                }
            });
            return null;
        }
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        if (defaultAdapter == null) {
            HMLog.info(u, new Function0() { // from class: it2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return HMDeviceManager.S();
                }
            });
            return listFindMozartDeviceState.get(0);
        }
        MozartDeviceStateService mozartDeviceStateService = MozartDeviceStateService.get();
        Device device2 = null;
        Device device3 = null;
        for (Device device4 : listFindMozartDeviceState) {
            final String device_address = device4.getDevice_address();
            if (C.getValue().isBondedOnSystem(device_address)) {
                if (device3 == null) {
                    HMLog.info(u, new Function0() { // from class: st2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return HMDeviceManager.T(device_address);
                        }
                    });
                    device3 = device4;
                }
                BluetoothDevice remoteDevice = defaultAdapter.getRemoteDevice(device_address);
                if (device == null && mozartDeviceStateService.isA2dpPlaying(remoteDevice)) {
                    HMLog.info(u, new Function0() { // from class: tt2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return HMDeviceManager.U(device_address);
                        }
                    });
                    device = device4;
                }
                if (device2 == null && mozartDeviceStateService.isA2dpConnected(remoteDevice)) {
                    HMLog.info(u, new Function0() { // from class: qs2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return HMDeviceManager.V(device_address);
                        }
                    });
                    device2 = device4;
                }
            }
        }
        if (device != null) {
            return device;
        }
        return device2 != null ? device2 : device3;
    }

    private HMBaseDevice L(HMDeviceType hMDeviceType, boolean z2) {
        HMLog.i(u, "getDeviceInternal:" + hMDeviceType + ",isCreate:" + z2, new Object[0]);
        if (z2) {
            this.n.removeMessages(1, hMDeviceType);
        }
        HMDeviceType hMDeviceType2 = HMDeviceType.WATCH;
        HMDeviceSource boundDeviceSource = getBoundDeviceSource(hMDeviceType2);
        if (hMDeviceType != HMDeviceType.SENSORHUB && (hMDeviceType != hMDeviceType2 || ConfigHelperKt.hasFeature(Feature.EVEREST_2_SERIES, boundDeviceSource))) {
            HMBaseDevice hMBaseDevice = this.i.get(hMDeviceType);
            if (!z2) {
                return hMBaseDevice;
            }
            if (hMBaseDevice != null) {
                if (hMBaseDevice.needReconnect()) {
                    hMBaseDevice.reConnect(false);
                }
                return hMBaseDevice;
            }
            Device bindInfo = getBindInfo(hMDeviceType);
            if (bindInfo != null) {
                HMBaseDevice hMBaseDeviceCreateBleDevice = createBleDevice(bindInfo);
                if (hMBaseDeviceCreateBleDevice != null) {
                    this.i.put(hMDeviceType, hMBaseDeviceCreateBleDevice);
                    if (hMBaseDeviceCreateBleDevice instanceof HMMiLiDevice) {
                        HealthDetectInitFactory.INSTANCE.initHealth();
                    }
                } else {
                    HMLog.i(u, "createBleDevice return null!!!", new Object[0]);
                }
                return hMBaseDeviceCreateBleDevice;
            }
        }
        return null;
    }

    private long M() {
        if (d.c[getBoundDeviceSource(HMDeviceType.WEIGHT).ordinal()] != 1) {
            return HMLoginManager.getMiIdIfExistsOrHuamiID();
        }
        try {
            return Long.parseLong(HMPersonInfo.getInstance().getUserInfo().getUserid());
        } catch (Exception e) {
            HMLog.i(u, "Parse user id exception:" + e.toString(), new Object[0]);
            return 0L;
        }
    }

    private static boolean N(String str) {
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        return defaultAdapter != null && BluetoothAdapter.checkBluetoothAddress(str) && defaultAdapter.getRemoteDevice(str).getBondState() == 12;
    }

    private boolean O(HMDeviceType hMDeviceType) {
        if (hMDeviceType != HMDeviceType.VDevice && hMDeviceType != HMDeviceType.WATCH) {
            for (HMDeviceType hMDeviceType2 : HMDeviceType.values()) {
                if (hMDeviceType.getValue() == hMDeviceType2.getValue()) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean P(@Nullable HMBaseDevice hMBaseDevice, @Nullable Device device) {
        if (hMBaseDevice == null || device == null) {
            return false;
        }
        String address = hMBaseDevice.getBluetoothDevice().getAddress();
        return address != null && address.equals(device.getDevice_address());
    }

    private static boolean Q(Device device) {
        if (ConfigHelperKt.hasFeature(Feature.HEADSET_MOZART_SOURCE_S, HMDeviceSource.fromValue(device.getDevice_source().intValue()))) {
            return N(device.getDevice_address());
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String R() {
        return "getActiveHeadset - no devices!";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String S() {
        return "getActiveHeadset - no adapter!";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String T(String str) {
        return "getActiveHeadset - latest: " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String U(String str) {
        return "getActiveHeadset - playing: " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String V(String str) {
        return "getActiveHeadset - A2dp: " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ List W() {
        return HMDaoManager.getInstance().getDeviceDao().queryBuilder().where(DeviceDao.Properties.Device_bind_status.eq(1), new WhereCondition[0]).where(DeviceDao.Properties.ActiveStatus.eq(1), new WhereCondition[0]).list();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ List X() {
        return HMDaoManager.getInstance().getDeviceDao().queryBuilder().where(DeviceDao.Properties.Device_bind_status.eq(1), new WhereCondition[0]).where(DeviceDao.Properties.ActiveStatus.eq(0), new WhereCondition[0]).list();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object Y(List list, List list2, Continuation continuation) {
        List<Device> listX0 = x0(list);
        listX0.addAll(x0(list2));
        return listX0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String Z() {
        return "get invalid allDayPressureSyncTime";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String a0() {
        return "get invalid singlePressureSyncTime";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String b0() {
        return "no bound hearing aid.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String c0() {
        return "hearing aid device created.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d0(boolean z2) {
        boolean z3 = false;
        HMLog.i(u, "startSyncTreadmillGpsData", new Object[0]);
        HMBoltClassicDevice hMBoltClassicDevice = (HMBoltClassicDevice) getInstance().getDevice(HMDeviceType.TREADMILL);
        if (hMBoltClassicDevice == null || !hMBoltClassicDevice.isConnected()) {
            return;
        }
        HMSportController.TreadmillSportState sportState = hMBoltClassicDevice.getSportState();
        int errorCode = FtmsErrorHelper.INSTANCE.getErrorCode();
        if (sportState == HMSportController.TreadmillSportState.NONE && errorCode == -1) {
            z3 = true;
        }
        if (z2 || !z3) {
            return;
        }
        startSyncBoltGpsData();
    }

    public static String deviceToString(Device device) {
        if (device == null) {
            return "";
        }
        return "source:" + device.getDevice_source() + ", mac:" + device.getDevice_address() + ", active:" + device.getActiveStatus() + ", bind:" + device.getDevice_bind_status();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int e0(Device device, Device device2) {
        if (device == null && device2 == null) {
            return 0;
        }
        if (device == null) {
            return -1;
        }
        if (device2 == null) {
            return 1;
        }
        return device2.getDevice_bind_time().compareTo(device.getDevice_bind_time());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String f0() {
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String g0() {
        return "When sync device is null. HMDeviceManager#startSyncData. ";
    }

    public static List<Device> getActiveDevices() {
        return B.getValue().findAllActiveDevices();
    }

    public static LiveData<List<Device>> getDeviceList() {
        return FlowLiveDataConversions.asLiveData(FlowKt.combine(FlowLiveDataConversions.asFlow(LiveDataSupportKt.queryByLiveData(new String[]{"DEVICE"}, new Function0() { // from class: ws2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HMDeviceManager.W();
            }
        })), FlowLiveDataConversions.asFlow(LiveDataSupportKt.queryByLiveData(new String[]{"DEVICE"}, new Function0() { // from class: us2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HMDeviceManager.X();
            }
        })), new Function3() { // from class: mt2
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return HMDeviceManager.Y((List) obj, (List) obj2, (Continuation) obj3);
            }
        }));
    }

    public static List<Device> getDeviceListOrdered() {
        return C.getValue().getDeviceListOrdered();
    }

    public static synchronized HMDeviceManager getInstance() {
        return y;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String h0() {
        return " deviceId is null or deviceMac is null when call syncDeviceData use StressUseCaseUtils.INSTANCE.syncDeviceData.";
    }

    public static boolean has(HMDeviceType hMDeviceType) {
        return B.getValue().findBoundDevices(hMDeviceType).size() > 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i0(HMDeviceType hMDeviceType) {
        HMMiLiDevice hMMiLiDevice = (HMMiLiDevice) getDevice(hMDeviceType);
        if (hMMiLiDevice == null) {
            HMLog.warn(u, new Function0() { // from class: kt2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return HMDeviceManager.g0();
                }
            });
            return;
        }
        hMMiLiDevice.startSyncData(getBoundDeviceSyncTime(hMDeviceType), new MyActivityDataSyncCallback(this, getBoundDeviceSource(hMDeviceType)));
        if (HMDeviceConfig.hasFeatureOfflineHr(getBoundDeviceSource(hMDeviceType))) {
            ((HMMiLiProDevice) hMMiLiDevice).startSyncHrData(getProHrSyncTime(), new MyHrDataSyncCallback());
        }
        BleExchangeService.INSTANCE.shouldSyncCalendar(this.b);
        if (supportPressure()) {
            int value = hMMiLiDevice.getDeviceInfo().getDeviceSource().getValue();
            HMDeviceManager hMDeviceManager = getInstance();
            HMDeviceType hMDeviceType2 = HMDeviceType.MILI;
            String boundDeviceAddress = hMDeviceManager.getBoundDeviceAddress(hMDeviceType2);
            String boundDeviceId = hMDeviceManager.getBoundDeviceId(hMDeviceType2);
            String str = this.s.getValue().getSn(hMDeviceType2) + "";
            if (boundDeviceId == null || boundDeviceAddress == null) {
                HMLog.warn(u, new Function0() { // from class: gt2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return HMDeviceManager.h0();
                    }
                });
            } else {
                StressUseCaseUtils.INSTANCE.syncDeviceData(hMDeviceType.getValue(), value, boundDeviceId, boundDeviceAddress, str);
            }
        }
    }

    public static synchronized void init(Context context) {
        if (y == null) {
            HMDeviceManager hMDeviceManager = new HMDeviceManager(context);
            y = hMDeviceManager;
            hMDeviceManager.q = DeviceLifeCycleImpl.getInstance(context);
        }
    }

    public static boolean isBluetoothSwitching() {
        return HMBaseBleDevice.isBluetoothSwitching();
    }

    public static boolean isDeviceCreated(Device device) {
        HMBaseDevice hMBaseDeviceL = getInstance().L(HMDeviceType.fromValue(device.getDevice_type().intValue()), false);
        return (hMBaseDeviceL == null || hMBaseDeviceL.getBluetoothDevice() == null || device.getDevice_address() == null || !device.getDevice_address().equals(hMBaseDeviceL.getBluetoothDevice().getAddress())) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String j0(HMDeviceType hMDeviceType) {
        return hMDeviceType + " not bound!!!";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k0(HMDeviceType hMDeviceType) {
        this.d.getValue().syncSensorHubData(getBoundDeviceSyncTime(hMDeviceType), new MyActivityDataSyncCallback(this, HMDeviceSource.SENSORHUB));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String l0() {
        return "bleDevice is null then stop sync. SHOES#startSyncData";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void m0(HMDeviceType hMDeviceType) {
        HMBaseDevice device = getDevice(hMDeviceType);
        HMDeviceSource boundDeviceSource = getBoundDeviceSource(hMDeviceType);
        if (device == null) {
            HMLog.warn(u, new Function0() { // from class: jt2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return HMDeviceManager.l0();
                }
            });
        } else if (boundDeviceSource == HMDeviceSource.SHOES_MARS) {
            device.startSyncData(getBoundDeviceSyncTime(hMDeviceType), new MyActivityDataSyncCallback(this, boundDeviceSource));
        } else {
            device.startSyncData(Calendar.getInstance(), new MyActivityDataSyncCallback(this, HMDeviceSource.SHOES));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String n0() {
        return "(HMWeightDevice) getDevice(type) can not be null.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void o0(HMDeviceType hMDeviceType) {
        HMWeightDevice hMWeightDevice = (HMWeightDevice) getDevice(hMDeviceType);
        if (hMWeightDevice == null) {
            HMLog.warn(u, new Function0() { // from class: ht2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return HMDeviceManager.n0();
                }
            });
        } else {
            hMWeightDevice.startSyncData(M(), new WeightDataCallbackFactory().create());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String p0(HMDeviceType hMDeviceType) {
        return "startSyncData:" + hMDeviceType;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String q0() {
        return "sync earbud data is forbidden as in earbud device activity.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String r0() {
        return "HmEarbudDevice is null when call HmEarbudDevice#startSyncData";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String s0() {
        return "sync data is forbidden as in HMFwUpgradeFailedActivity.";
    }

    public static boolean supportHrSleep() {
        return HMDevicePropertyCache.getInstance().getMiliFeature().hasSw(7);
    }

    public static void syncMacAddress() {
        HMDeviceManager hMDeviceManager = getInstance();
        HMDeviceType hMDeviceType = HMDeviceType.MILI;
        HMDeviceSource boundDeviceSource = hMDeviceManager.getBoundDeviceSource(hMDeviceType);
        String boundDeviceAddress = hMDeviceManager.getBoundDeviceAddress(hMDeviceType);
        String boundDeviceAddress2 = ConfigHelperKt.hasHeadsetFeature(Feature.HEADSET_MOZART_SOURCE_S) ? hMDeviceManager.getBoundDeviceAddress(HMDeviceType.HEADSET) : null;
        HMDeviceSource hMDeviceSource = HMDeviceSource.VDEVICE;
        if (TextUtils.isEmpty(boundDeviceAddress) || !ConfigHelperKt.hasFeature(Feature.HR_SOURCE_S, boundDeviceSource)) {
            if (TextUtils.isEmpty(boundDeviceAddress2)) {
                boundDeviceAddress = null;
                boundDeviceSource = hMDeviceSource;
            } else {
                boundDeviceSource = hMDeviceManager.getBoundDeviceSource(HMDeviceType.HEADSET);
                boundDeviceAddress = boundDeviceAddress2;
            }
        }
        if (TextUtils.isEmpty(boundDeviceAddress) || boundDeviceSource == hMDeviceSource) {
            return;
        }
        HMLog.i(u, "mac: " + boundDeviceAddress + ", source: " + boundDeviceSource, new Object[0]);
        ((HMBoltClassicDevice) hMDeviceManager.getDevice(HMDeviceType.TREADMILL)).syncMacAddress(boundDeviceAddress, boundDeviceSource.getValue(), new b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String t0() {
        return "use new sync center";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String u0() {
        return "use normal sync center";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String v0() {
        return "error of start sync.";
    }

    private LocaleDeviceRepo w0() {
        if (this.m == null) {
            this.m = new LocaleDeviceRepo(this.b, HMLoginManager.getValidUid());
        }
        return this.m;
    }

    private static List<Device> x0(List<Device> list) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        for (Device device : list) {
            if (device.getDevice_type().intValue() == HMDeviceType.MILI.getValue() || device.getDevice_type().intValue() == HMDeviceType.WATCH.getValue()) {
                arrayList.add(device);
            } else if (device.getDevice_type().intValue() == HMDeviceType.WEIGHT.getValue()) {
                arrayList2.add(device);
            } else if (device.getDevice_type().intValue() == HMDeviceType.SHOES.getValue()) {
                arrayList3.add(device);
            } else if (device.getDevice_type().intValue() == HMDeviceType.OTHER.getValue()) {
                arrayList4.add(device);
            } else if (device.getDevice_type().intValue() == HMDeviceType.TREADMILL.getValue()) {
                arrayList5.add(device);
            } else if (device.getDevice_type().intValue() == HMDeviceType.HEADSET.getValue()) {
                if (Q(device)) {
                    arrayList6.add(device);
                }
            } else if (device.getDevice_type().intValue() == HMDeviceType.EARBUD.getValue()) {
                arrayList7.add(device);
            }
        }
        pt2 pt2Var = new Comparator() { // from class: pt2
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return HMDeviceManager.e0((Device) obj, (Device) obj2);
            }
        };
        Collections.sort(arrayList, pt2Var);
        Collections.sort(arrayList2, pt2Var);
        Collections.sort(arrayList3, pt2Var);
        Collections.sort(arrayList5, pt2Var);
        Collections.sort(arrayList6, pt2Var);
        Collections.sort(arrayList4, pt2Var);
        Collections.sort(arrayList7, pt2Var);
        ArrayList arrayList8 = new ArrayList();
        arrayList8.addAll(arrayList);
        arrayList8.addAll(arrayList2);
        arrayList8.addAll(arrayList3);
        arrayList8.addAll(arrayList4);
        arrayList8.addAll(arrayList5);
        arrayList8.addAll(arrayList6);
        arrayList8.addAll(arrayList7);
        return arrayList8;
    }

    private void y0(JSONObject jSONObject, String str) {
        boolean z2;
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject(str);
            Iterator<String> itKeys = jSONObject2.keys();
            while (true) {
                if (!itKeys.hasNext()) {
                    z2 = false;
                    break;
                }
                String next = itKeys.next();
                if (!"all_day_stress".equals(next) && !"single_stress".equals(next)) {
                    z2 = true;
                    break;
                }
            }
            if (z2) {
                JSONObject jSONObject3 = new JSONObject();
                if (jSONObject2.has("all_day_stress")) {
                    jSONObject3.put("all_day_stress", jSONObject2.getLong("all_day_stress"));
                }
                if (jSONObject2.has("single_stress")) {
                    jSONObject3.put("single_stress", jSONObject2.getLong("single_stress"));
                }
                jSONObject.put(str, jSONObject3);
            }
        } catch (Exception e) {
            HMLog.i(u, e.getMessage(), new Object[0]);
        }
    }

    private void z0(JSONObject jSONObject) {
        try {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                y0(jSONObject, itKeys.next());
            }
        } catch (Exception e) {
            HMLog.i(u, e.getMessage(), new Object[0]);
        }
    }

    @Override // com.huami.devicex.manager.DeviceManagerApi
    public synchronized void bindDevice(HMBaseDevice hMBaseDevice, Device device) {
        HMDeviceSource hMDeviceSourceFromValue = HMDeviceSource.fromValue(device.getDevice_source().intValue());
        HMDeviceType type = hMDeviceSourceFromValue.getType();
        HMLog.d(u, "bindDevice:" + hMDeviceSourceFromValue, new Object[0]);
        if (ConfigHelperKt.hasFeature(Feature.HEADSET_MOZART_SOURCE_S, HMDeviceSource.fromValue(device.getDevice_source().intValue()))) {
            HashMap<HMDeviceType, HMBaseDevice> map = this.i;
            HMDeviceType hMDeviceType = HMDeviceType.HEADSET;
            HMBaseDevice hMBaseDevice2 = map.get(hMDeviceType);
            if (hMBaseDevice2 != null) {
                hMBaseDevice2.destroy();
                this.j.remove(hMDeviceType);
                this.i.remove(hMDeviceType);
            }
            w0().updateDevice(device);
        }
        G(device);
        if (hMBaseDevice != null) {
            this.p.getValue().initBleDevice(hMBaseDevice, hMDeviceSourceFromValue, this);
            this.i.put(type, hMBaseDevice);
        }
        HMDeviceType hMDeviceType2 = HMDeviceType.VDevice;
        for (HMDeviceType hMDeviceType3 : this.a) {
            if (this.j.get(hMDeviceType3) != null) {
                hMDeviceType2 = hMDeviceType3;
                break;
            }
        }
        if (type == hMDeviceType2) {
            this.f.getValue().saveBaseStep();
        }
    }

    @Override // com.huami.devicex.manager.DeviceManagerApi
    public boolean checkConnectedWatchDevice(Activity activity, int i) {
        return this.f.getValue().checkConnectedWatchDevice(activity, i);
    }

    @Override // com.huami.devicex.manager.DeviceManagerApi
    public synchronized void checkforBindSensorhub() {
        if (!this.d.getValue().isSupportSensorHub()) {
            HMLog.d(u, "Not support sensorhub~", new Object[0]);
            return;
        }
        Calendar calendar = Calendar.getInstance();
        Device device = new Device();
        device.setDevice_id(EcgData.DEFAULT_DIGIT_VALUE);
        device.setDevice_bind_status(1);
        device.setActiveStatus(1);
        device.setDevice_bind_time(Long.valueOf(calendar.getTimeInMillis()));
        device.setDevice_sync_data_time(Long.valueOf(calendar.getTimeInMillis()));
        device.setDevice_source(Integer.valueOf(HMDeviceSource.SENSORHUB.getValue()));
        HMDeviceType hMDeviceType = HMDeviceType.SENSORHUB;
        device.setDevice_type(Integer.valueOf(hMDeviceType.getValue()));
        device.setTime_zone(Integer.valueOf(ProfileUtils.getTimezoneKey(calendar.getTimeZone())));
        G(device);
        this.d.getValue().create(this.b, new MyRealtimeStepCallback(hMDeviceType));
        EventBus.getDefault().postSticky(new HMDeviceBindEvent(true, hMDeviceType));
    }

    @Override // com.huami.devicex.manager.DeviceManagerApi
    @Nullable
    public HMBaseDevice createBleDevice(Device device) {
        return this.p.getValue().createDevice(device, false);
    }

    @Override // com.huami.devicex.manager.DeviceManagerApi
    @Nullable
    public synchronized HMBaseDevice createDevice(HMDeviceType hMDeviceType) {
        return L(hMDeviceType, true);
    }

    public synchronized void deInitDevices() {
        HMLog.i(u, "deInitDevices", new Object[0]);
        this.l = false;
        this.m = null;
        B0();
        for (Device device : B.getValue().findAll()) {
            if (device.getMigrate_device() != null && device.getMigrate_device().intValue() == 1 && device.getDevice_bind_status().intValue() == 1) {
                HMLog.d(u, "migrate device,not delete~", new Object[0]);
            } else {
                B.getValue().deleteById(device.getDevice_id());
            }
        }
        EventBus.getDefault().removeStickyEvent(HMDeviceRealtimeStepEvent.class);
        EventBus.getDefault().removeStickyEvent(HMDeviceSyncDataEvent.class);
        EventBus.getDefault().removeStickyEvent(HMDeviceBindEvent.class);
        EventBus.getDefault().removeStickyEvent(HMDeviceConnectionEvent.class);
        C.getValue().dumpDeviceTable();
    }

    @Override // com.huami.devicex.manager.DeviceManagerApi
    public synchronized void destroyDevice(HMDeviceType hMDeviceType) {
        HMLog.i(u, "destroyDevice:" + hMDeviceType, new Object[0]);
        HMBaseDevice hMBaseDeviceRemove = this.i.remove(hMDeviceType);
        if (hMBaseDeviceRemove != null) {
            hMBaseDeviceRemove.destroy();
        }
    }

    public synchronized void destroyDeviceDelay(HMDeviceType hMDeviceType) {
        HMLog.i(u, "destroyDeviceDelay:" + hMDeviceType, new Object[0]);
        Message message = new Message();
        message.what = 1;
        message.obj = hMDeviceType;
        this.n.sendMessageDelayed(message, 120000L);
    }

    @Override // com.huami.devicex.manager.DeviceManagerApi
    public synchronized void disableDevice(HMDeviceType hMDeviceType) {
        HMLog.d(u, "disableDevice:" + hMDeviceType, new Object[0]);
        Device deviceRemove = this.j.remove(hMDeviceType);
        if (deviceRemove != null) {
            deviceRemove.setActiveStatus(0);
            if (ConfigHelperKt.hasFeature(Feature.IS_VIRTUAL_DEVICE, HMDeviceSource.fromValue(deviceRemove.getDevice_source().intValue()))) {
                unbindDevice(hMDeviceType);
            }
            B.getValue().update(deviceRemove);
        }
        HMBaseDevice hMBaseDeviceRemove = this.i.remove(hMDeviceType);
        if (hMBaseDeviceRemove != null) {
            this.q.disable(hMBaseDeviceRemove);
            hMBaseDeviceRemove.destroy();
        }
    }

    public synchronized void dumpAllDevices() {
        for (HMBaseDevice hMBaseDevice : this.i.values()) {
            BluetoothDevice bluetoothDevice = hMBaseDevice.getBluetoothDevice();
            String bluetoothDeviceName = GattUtils.getBluetoothDeviceName(bluetoothDevice);
            String address = bluetoothDevice.getAddress();
            HMDeviceType deviceType = hMBaseDevice.getDeviceType();
            HMDeviceSource deviceSource = HMDeviceSource.VDEVICE;
            DeviceInfo deviceInfo = hMBaseDevice.getDeviceInfo();
            if (deviceInfo != null) {
                deviceSource = deviceInfo.getDeviceSource();
            }
            BatteryInfo batteryInfo = hMBaseDevice.getBatteryInfo();
            HMLog.d(u, "name:" + bluetoothDeviceName + ",address:" + address + ",type:" + deviceType + ",source:" + deviceSource + ",isConnected:" + hMBaseDevice.isConnected(), new Object[0]);
            StringBuilder sb = new StringBuilder();
            sb.append("deviceInfo:");
            sb.append(deviceInfo);
            HMLog.d(u, sb.toString(), new Object[0]);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("batteryInfo:");
            sb2.append(batteryInfo);
            HMLog.d(u, sb2.toString(), new Object[0]);
        }
    }

    @Override // com.huami.devicex.manager.DeviceManagerApi
    public synchronized void enableDevice(Device device, HMBaseDevice hMBaseDevice) {
        HMDeviceType hMDeviceTypeFromValue = HMDeviceType.fromValue(device.getDevice_type().intValue());
        HMDeviceSource hMDeviceSourceFromValue = HMDeviceSource.fromValue(device.getDevice_source().intValue());
        HMLog.i(u, "enableDevice type:" + hMDeviceTypeFromValue + ",source:" + hMDeviceSourceFromValue, new Object[0]);
        if (hMBaseDevice != null) {
            this.p.getValue().initBleDevice(hMBaseDevice, hMDeviceSourceFromValue, this);
        } else if (hMDeviceTypeFromValue != HMDeviceType.WATCH) {
            hMBaseDevice = createBleDevice(device);
        }
        if (hMBaseDevice != null) {
            this.q.enable(hMBaseDevice);
            this.i.put(hMDeviceTypeFromValue, hMBaseDevice);
        }
        B.getValue().insertOrReplace(device);
        HMLog.i(u, "enableDevice put device type = " + hMDeviceTypeFromValue.getValue() + "; mac address: " + device.getDevice_address(), new Object[0]);
        this.j.put(hMDeviceTypeFromValue, device);
        E0(hMDeviceTypeFromValue);
    }

    public void enableRealtimeStep(boolean z2, HMDeviceType hMDeviceType) {
        HMLog.i(u, "enableRealtimeStep:" + z2 + ",type:" + hMDeviceType, new Object[0]);
        HMBaseDevice hMBaseDevice = this.i.get(hMDeviceType);
        if (hMBaseDevice == null || !hMBaseDevice.isConnected()) {
            return;
        }
        hMBaseDevice.enableRealtimeStep(z2);
    }

    @Override // com.huami.devicex.manager.DeviceManagerApi
    public void freshFirmwareCached(HMDeviceType hMDeviceType, String str, String str2) {
        Device device = this.j.get(hMDeviceType);
        if (device == null) {
            HMLog.i(u, "ERROR:获取缓存设备信息为空", new Object[0]);
        } else if (str.equals(device.getDevice_address())) {
            device.setFirmware_version(str2);
        }
    }

    @Override // com.huami.devicex.manager.DeviceManagerApi
    public int getActiveStatus(HMDeviceType hMDeviceType) {
        return getInstance().J(hMDeviceType) >= 1 ? 0 : 1;
    }

    public synchronized long getAuthKeyUserId(HMDeviceType hMDeviceType) {
        Device device = this.j.get(hMDeviceType);
        if (device == null) {
            return -1L;
        }
        if (HMDeviceConfig.hasFeatureG1(HMDeviceSource.fromValue(device.getDevice_source().intValue()))) {
            String authkey = device.getAuthkey();
            if (!TextUtils.isEmpty(authkey)) {
                return Long.parseLong(authkey);
            }
        }
        return -1L;
    }

    @Override // com.huami.devicex.manager.DeviceManagerApi
    public synchronized BatteryInfo getBatteryInfo(HMDeviceType hMDeviceType) {
        HMBaseDevice hMBaseDevice;
        hMBaseDevice = this.i.get(hMDeviceType);
        return hMBaseDevice != null ? hMBaseDevice.getBatteryInfo() : null;
    }

    @Override // com.huami.devicex.manager.DeviceManagerApi
    @Nullable
    public Device getBindDevice(HMDeviceType hMDeviceType, String str) {
        return B.getValue().findBoundDevice(hMDeviceType, str);
    }

    @Override // com.huami.devicex.manager.DeviceManagerApi
    public Device getBindInfo(HMDeviceType hMDeviceType) {
        Device device;
        synchronized (this.j) {
            device = this.j.get(hMDeviceType);
        }
        return device;
    }

    @Nullable
    public Device getBoundDevice(BluetoothDevice bluetoothDevice, HMDeviceType hMDeviceType) {
        Device deviceFindBoundDeviceByAddress = B.getValue().findBoundDeviceByAddress(bluetoothDevice.getAddress());
        return deviceFindBoundDeviceByAddress != null ? deviceFindBoundDeviceByAddress : w0().getBoundDevice(bluetoothDevice, hMDeviceType);
    }

    @Override // com.huami.devicex.manager.DeviceManagerApi
    @org.jetbrains.annotations.Nullable
    public synchronized String getBoundDeviceAddress(@NotNull HMDeviceType hMDeviceType) {
        Device device = this.j.get(hMDeviceType);
        StringBuilder sb = new StringBuilder();
        sb.append("get bound device address type: ");
        sb.append(hMDeviceType);
        sb.append("; device address: ");
        sb.append(device != null ? device.getDevice_address() : "null");
        HMLog.i(u, sb.toString(), new Object[0]);
        if (device != null) {
            return device.getDevice_address();
        }
        return null;
    }

    @Override // com.huami.devicex.manager.DeviceManagerApi
    @Nullable
    public synchronized String getBoundDeviceFirmwareVersion(HMDeviceType hMDeviceType) {
        String deviceVersion;
        HMBaseDevice hMBaseDeviceL = L(hMDeviceType, false);
        deviceVersion = (hMBaseDeviceL == null || !hMBaseDeviceL.isConnected() || hMBaseDeviceL.getDeviceInfo() == null) ? null : hMBaseDeviceL.getDeviceVersion();
        Device device = this.j.get(hMDeviceType);
        String firmware_version = device != null ? device.getFirmware_version() : null;
        HMLog.i(u, "Version from device:" + deviceVersion + " Version from cached:" + firmware_version, new Object[0]);
        if (deviceVersion != null && firmware_version != null && !firmware_version.equals(deviceVersion)) {
            HMLog.i(u, "Error: cached firmware version not same with device", new Object[0]);
        }
        if (deviceVersion == null) {
            deviceVersion = firmware_version;
        }
        return deviceVersion;
    }

    @Override // com.huami.devicex.manager.DeviceManagerApi
    @Nullable
    public String getBoundDeviceHrFirmwareVersion(HMDeviceType hMDeviceType) {
        Device device = this.j.get(hMDeviceType);
        if (device != null) {
            return device.getHr_firmware_version();
        }
        return null;
    }

    @Override // com.huami.devicex.manager.DeviceManagerApi
    public synchronized String getBoundDeviceId(HMDeviceType hMDeviceType) {
        Device device = this.j.get(hMDeviceType);
        if (device == null) {
            return null;
        }
        return device.getDevice_id();
    }

    @Override // com.huami.devicex.manager.DeviceManagerApi
    public synchronized HMDeviceSource getBoundDeviceSource(HMDeviceType hMDeviceType) {
        Device device = this.j.get(hMDeviceType);
        if (device != null) {
            return HMDeviceSource.fromValue(device.getDevice_source().intValue());
        }
        return HMDeviceSource.VDEVICE;
    }

    @Override // com.huami.devicex.injection.keeper.DeviceTimeStoreApi
    public synchronized Calendar getBoundDeviceSyncTime(HMDeviceType hMDeviceType) {
        Calendar calendar;
        Device device = this.j.get(hMDeviceType);
        calendar = Calendar.getInstance();
        if (device != null) {
            long jLongValue = device.getDevice_sync_data_time().longValue();
            if (device.getTime_zone() == null || (device.getTime_zone().intValue() >= -48 && device.getTime_zone().intValue() <= 56)) {
                calendar.clear();
                calendar.setTimeInMillis(jLongValue);
                if (device.getTime_zone() != null) {
                    calendar.setTimeZone(ProfileUtils.getTimezone(device.getTime_zone().byteValue()));
                }
            } else {
                calendar.add(6, -1);
            }
            HMLog.i(u, "Bound device " + hMDeviceType + " sync time is : " + calendar.getTime(), new Object[0]);
        } else {
            HMLog.i(u, "No bound device for " + hMDeviceType, new Object[0]);
        }
        return calendar;
    }

    @Override // com.huami.devicex.manager.DeviceManagerApi
    public HashMap<String, HMDeviceType> getBoundDevices(HMDeviceType hMDeviceType) {
        List<Device> listFindBoundDevices = B.getValue().findBoundDevices(hMDeviceType);
        if (listFindBoundDevices.size() == 0) {
            return null;
        }
        HashMap<String, HMDeviceType> map = new HashMap<>();
        Iterator<Device> it2 = listFindBoundDevices.iterator();
        while (it2.hasNext()) {
            map.put(it2.next().getDevice_address(), hMDeviceType);
        }
        return map;
    }

    @Override // com.huami.devicex.manager.DeviceManagerApi
    public Device getConflictDevice(HMDeviceSource hMDeviceSource) {
        Device device;
        Device device2;
        synchronized (this.j) {
            HMDeviceType type = hMDeviceSource.getType();
            Device device3 = this.j.get(type);
            if (device3 != null) {
                return device3;
            }
            HMDeviceType hMDeviceType = HMDeviceType.MILI;
            if (type == hMDeviceType && (device2 = this.j.get(HMDeviceType.WATCH)) != null) {
                return device2;
            }
            if (type != HMDeviceType.WATCH || (device = this.j.get(hMDeviceType)) == null) {
                return null;
            }
            return device;
        }
    }

    @Override // com.huami.devicex.manager.DeviceManagerApi
    @Nullable
    public String getCurrentSessionId(@Nullable HMDeviceSource hMDeviceSource) {
        return this.o.getCurrentSessionId(hMDeviceSource);
    }

    @Override // com.huami.devicex.manager.DeviceManagerApi
    public synchronized HMBaseDevice getDevice(HMDeviceType hMDeviceType) {
        return L(hMDeviceType, false);
    }

    @Override // com.huami.devicex.manager.DeviceManagerApi
    public synchronized Device getDeviceBound(HMDeviceType hMDeviceType) {
        return this.j.get(hMDeviceType);
    }

    @Override // com.huami.devicex.injection.keeper.DeviceTimeStoreApi
    public synchronized Calendar getDeviceBoundTime(HMDeviceType hMDeviceType) {
        Calendar calendar;
        Long device_bind_time;
        Device device = this.j.get(hMDeviceType);
        calendar = Calendar.getInstance();
        if (device != null && (device_bind_time = device.getDevice_bind_time()) != null) {
            calendar.setTimeInMillis(device_bind_time.longValue());
        }
        return calendar;
    }

    @Override // com.huami.devicex.manager.DeviceManagerApi
    @NonNull
    public DeviceRestoreEventGetter getDeviceRestoreInfoGetter() {
        return this.r;
    }

    @Override // com.huami.devicex.manager.DeviceManagerApi
    public BatteryInfo getEarbudBattery(boolean z2, String str) {
        return this.g.getValue().getEarbudBattery(z2, str);
    }

    @Override // com.huami.devicex.injection.keeper.DeviceTimeStoreApi
    public Calendar getEarliestBoundTime(String str) {
        List<Device> listFindEarliestBoundTime = C.getValue().findEarliestBoundTime(str);
        if (listFindEarliestBoundTime.size() == 0) {
            return null;
        }
        Device device = listFindEarliestBoundTime.get(0);
        Calendar calendar = Calendar.getInstance();
        calendar.clear();
        calendar.setTimeInMillis(device.getDevice_bind_time().longValue());
        calendar.setTimeZone(ProfileUtils.getTimezone(device.getTime_zone().byteValue()));
        return calendar;
    }

    @Override // com.huami.devicex.injection.keeper.DeviceTimeStoreApi
    public synchronized Calendar getEcgSyncTime(HMDeviceType hMDeviceType) {
        Device device = this.j.get(hMDeviceType);
        if (device == null) {
            return Calendar.getInstance();
        }
        return getSyncTime(device.getEcgSyncTime() != null ? device.getEcgSyncTime() : device.getDevice_bind_time(), device.getEcgSyncTimeZone());
    }

    @Override // com.huami.devicex.injection.keeper.DeviceTimeStoreApi
    public synchronized Calendar getGpsSyncTime(HMDeviceType hMDeviceType) {
        Calendar calendar;
        Device device = this.j.get(hMDeviceType);
        calendar = Calendar.getInstance();
        if (device != null) {
            long jLongValue = device.getGps_sync_time() == null ? device.getDevice_bind_time().longValue() : device.getGps_sync_time().longValue();
            calendar.clear();
            calendar.setTimeInMillis(jLongValue);
            HMLog.i(u, "Bound device " + hMDeviceType + " gps sync time is : " + calendar.getTime(), new Object[0]);
        } else {
            HMLog.i(u, "No bound device for " + hMDeviceType, new Object[0]);
        }
        return calendar;
    }

    @Override // com.huami.devicex.manager.DeviceManagerApi
    public synchronized String getHardwareVersion(HMDeviceType hMDeviceType) {
        Device device;
        device = this.j.get(hMDeviceType);
        return device != null ? device.getHardwareVersion() : null;
    }

    public synchronized HMDeviceSource getInvalidAuthKeyDeviceSource() {
        Device device = this.j.get(HMDeviceType.MILI);
        if (device == null) {
            return HMDeviceSource.VDEVICE;
        }
        HMDeviceSource hMDeviceSourceFromValue = HMDeviceSource.fromValue(device.getDevice_source().intValue());
        if (HMDeviceConfig.hasFeatureG1(hMDeviceSourceFromValue) && TextUtils.isEmpty(device.getAuthkey())) {
            return hMDeviceSourceFromValue;
        }
        return HMDeviceSource.VDEVICE;
    }

    @Override // com.huami.devicex.manager.DeviceManagerApi
    public synchronized HMDeviceType getMajorDeviceType() {
        for (HMDeviceType hMDeviceType : this.a) {
            if (this.j.get(hMDeviceType) != null) {
                return hMDeviceType;
            }
        }
        return HMDeviceType.VDevice;
    }

    @Override // com.huami.devicex.manager.DeviceManagerApi
    public synchronized HMDeviceType getMajorDeviceTypeNew() {
        for (HMDeviceType hMDeviceType : this.t) {
            if (this.j.get(hMDeviceType) != null) {
                return hMDeviceType;
            }
        }
        return HMDeviceType.VDevice;
    }

    @Override // com.huami.devicex.manager.DeviceManagerApi
    public HMBaseDevice getMiliDevice() {
        return getInstance().getDevice(HMDeviceType.MILI);
    }

    @Nullable
    public HMMiLiProDevice getMiliProDevice() {
        HMBaseDevice miliDevice = getMiliDevice();
        if (miliDevice instanceof HMMiLiProDevice) {
            return (HMMiLiProDevice) miliDevice;
        }
        return null;
    }

    @Override // com.huami.devicex.injection.keeper.DeviceTimeStoreApi
    public synchronized Calendar getPaiSyncTime(HMDeviceType hMDeviceType) {
        Calendar calendar;
        Device device = this.j.get(hMDeviceType);
        calendar = Calendar.getInstance();
        if (device != null) {
            Long paiSyncTime = device.getPaiSyncTime();
            if (paiSyncTime == null) {
                paiSyncTime = device.getDevice_bind_time();
            }
            calendar.clear();
            calendar.setTimeInMillis(paiSyncTime.longValue());
            HMLog.i(u, "getPaiSyncTime : " + calendar.getTime(), new Object[0]);
        } else {
            HMLog.i(u, "No bound device for " + hMDeviceType, new Object[0]);
        }
        return calendar;
    }

    @Override // com.huami.devicex.injection.keeper.DeviceTimeStoreApi
    public synchronized Calendar getPressureAllDaySyncTime() {
        Calendar calendar;
        HMDeviceType hMDeviceType = HMDeviceType.MILI;
        Device device = this.j.get(hMDeviceType);
        calendar = Calendar.getInstance();
        if (device == null || !supportPressure()) {
            HMLog.i(u, "No bound device for pressure", new Object[0]);
        } else {
            long syncTime = getSyncTime(hMDeviceType, "all_day_stress");
            if (syncTime == 0 || syncTime > System.currentTimeMillis()) {
                HMLog.info(u, new Function0() { // from class: et2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return HMDeviceManager.Z();
                    }
                });
                syncTime = device.getDevice_bind_time().longValue();
            }
            calendar.clear();
            calendar.setTimeInMillis(syncTime);
            HMLog.i(u, "get pressure all day sync time is : " + calendar.getTime(), new Object[0]);
        }
        return calendar;
    }

    @Override // com.huami.devicex.injection.keeper.DeviceTimeStoreApi
    public synchronized Calendar getPressureSingleSyncTime() {
        Calendar calendar;
        HMDeviceType hMDeviceType = HMDeviceType.MILI;
        Device device = this.j.get(hMDeviceType);
        calendar = Calendar.getInstance();
        if (device == null || !supportPressure()) {
            HMLog.i(u, "No bound device for pressure", new Object[0]);
        } else {
            long syncTime = getSyncTime(hMDeviceType, "single_stress");
            if (syncTime == 0 || syncTime > System.currentTimeMillis()) {
                HMLog.info(u, new Function0() { // from class: ft2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return HMDeviceManager.a0();
                    }
                });
                syncTime = device.getDevice_bind_time().longValue();
            }
            calendar.clear();
            calendar.setTimeInMillis(syncTime);
            HMLog.i(u, "get pressure single sync time is : " + calendar.getTime(), new Object[0]);
        }
        return calendar;
    }

    @Nullable
    public synchronized HMDeviceType getPriorityConnectedDeviceType() {
        HashMap map = new HashMap();
        for (Device device : getBoundDevices()) {
            HMDeviceType hMDeviceTypeFromValue = HMDeviceType.fromValue(device.getDevice_type().intValue());
            if (isConnected(hMDeviceTypeFromValue)) {
                map.put(hMDeviceTypeFromValue, device);
            }
        }
        for (HMDeviceType hMDeviceType : this.t) {
            if (map.get(hMDeviceType) != null) {
                return hMDeviceType;
            }
        }
        return null;
    }

    @Override // com.huami.devicex.injection.keeper.DeviceTimeStoreApi
    public synchronized Calendar getProHrSyncTime() {
        Calendar calendar;
        Device device = this.j.get(HMDeviceType.MILI);
        calendar = Calendar.getInstance();
        if (device == null || !HMDeviceConfig.hasFeatureOfflineHr(HMDeviceSource.fromValue(device.getDevice_source().intValue()))) {
            HMLog.i(u, "No bound device for pro", new Object[0]);
        } else {
            Long device_sync_data_time_hr = device.getDevice_sync_data_time_hr();
            if (device_sync_data_time_hr == null) {
                device_sync_data_time_hr = device.getDevice_bind_time();
            }
            calendar.clear();
            calendar.setTimeInMillis(device_sync_data_time_hr.longValue());
            if (device.getTime_zone_sync_hr() != null) {
                calendar.setTimeZone(ProfileUtils.getTimezone(device.getTime_zone_sync_hr().byteValue()));
            }
            HMLog.i(u, "Pro hr sync time is : " + calendar.getTime(), new Object[0]);
        }
        return calendar;
    }

    @Override // com.huami.devicex.manager.DeviceManagerApi
    @Nullable
    public synchronized RealtimeStep getRealtimeStep(@NotNull HMDeviceType hMDeviceType) {
        Device device = this.j.get(hMDeviceType);
        if (device == null) {
            return null;
        }
        int iIntValue = device.getDevice_source().intValue();
        if (hMDeviceType != HMDeviceType.VDevice && hMDeviceType != HMDeviceType.WEIGHT) {
            if (hMDeviceType == HMDeviceType.SENSORHUB) {
                return this.d.getValue().getRealtimeStep();
            }
            if (hMDeviceType == HMDeviceType.WATCH) {
                return this.c.getValue().getmWatchRts();
            }
            HMBaseDevice hMBaseDevice = this.i.get(hMDeviceType);
            if (hMBaseDevice == null) {
                return null;
            }
            if (hMDeviceType == HMDeviceType.SHOES) {
                return iIntValue == HMDeviceSource.SHOES_MARS.getValue() ? hMBaseDevice.getStep() : hMBaseDevice.getStep();
            }
            if (hMDeviceType == HMDeviceType.MILI) {
                return hMBaseDevice.getStep();
            }
            return null;
        }
        return null;
    }

    public Calendar getSyncTime(Long l, Long l2) {
        Calendar calendar = Calendar.getInstance();
        calendar.clear();
        calendar.setTimeInMillis(l.longValue());
        if (l2 != null) {
            calendar.setTimeZone(ProfileUtils.getTimezone(l2.byteValue()));
        }
        return calendar;
    }

    @Override // com.huami.devicex.manager.DeviceManagerApi
    @NotNull
    public HMDeviceSource getWatchDeviceSource(com.huami.watch.companion.device.Device device) {
        return device == null ? HMDeviceSource.VDEVICE : HMDeviceSource.fromValue(DeviceSource.getDeviceSource(device));
    }

    @Override // com.huami.devicex.manager.DeviceManagerApi
    public synchronized boolean hasBound(HMDeviceType hMDeviceType) {
        return this.j.get(hMDeviceType) != null;
    }

    @Override // com.huami.devicex.manager.DeviceManagerApi
    public boolean hasBoundAnyDevice(@NotNull HMDeviceType hMDeviceType) {
        return B.getValue().findBoundDevices(hMDeviceType).size() > 0;
    }

    public synchronized boolean hasBoundBleDevice() {
        return this.i.size() > 0;
    }

    public boolean hasBoundHuamiDevice() {
        return C.getValue().hasBoundDevice();
    }

    public boolean hasBoundInHistory(HMDeviceSource hMDeviceSource) {
        return C.getValue().hasBoundInHistory(hMDeviceSource);
    }

    public synchronized void initDevices() {
        HMLog.i(u, "initDevices", new Object[0]);
        w0().migrateDeviceInfoToDb();
        C.getValue().dumpDeviceTable();
        B0();
        I();
        ArrayList<Device> arrayList = new ArrayList();
        for (Device device : B.getValue().findAllActiveDevices()) {
            if (!ConfigHelperKt.hasFeature(Feature.HEADSET_MOZART_SOURCE_S, HMDeviceSource.fromValue(device.getDevice_source().intValue()))) {
                arrayList.add(device);
            }
        }
        if (arrayList.size() > 0) {
            for (Device device2 : arrayList) {
                HMDeviceType hMDeviceTypeFromValue = HMDeviceType.fromValue(device2.getDevice_type().intValue());
                HMDeviceSource hMDeviceSourceFromValue = HMDeviceSource.fromValue(device2.getDevice_source().intValue());
                if (hMDeviceSourceFromValue == HMDeviceSource.MILI_PRO_OLD && hMDeviceTypeFromValue == HMDeviceType.MILI) {
                    hMDeviceSourceFromValue = HMDeviceSource.MILI_PRO;
                    device2.setDevice_source(Integer.valueOf(hMDeviceSourceFromValue.getValue()));
                    B.getValue().insertOrReplace(device2);
                }
                if (O(hMDeviceTypeFromValue)) {
                    HMLog.i(u, "bound device type:" + hMDeviceTypeFromValue + ",source:" + hMDeviceSourceFromValue + ",status:" + device2.getDevice_bind_status() + ",firmware version:" + device2.getFirmware_version(), new Object[0]);
                    this.j.put(hMDeviceTypeFromValue, device2);
                }
            }
        }
        DeviceRepositoryApi value = B.getValue();
        HMDeviceType hMDeviceType = HMDeviceType.WATCH;
        List<Device> listFindActiveDevices = value.findActiveDevices(hMDeviceType);
        int size = listFindActiveDevices.size();
        if (size == 1) {
            Device device3 = listFindActiveDevices.get(0);
            HMLog.i(u, "put watch device for init: " + device3 + "; mac address: " + device3.getDevice_address(), new Object[0]);
            this.j.put(hMDeviceType, device3);
            HMWatchLogic.connectCurrentDevice();
        } else {
            HMLog.d(u, "invalid watch size:" + size, new Object[0]);
        }
        HashMap<HMDeviceType, Device> map = this.j;
        HMDeviceType hMDeviceType2 = HMDeviceType.SENSORHUB;
        Device device4 = map.get(hMDeviceType2);
        HashMap<HMDeviceType, Device> map2 = this.j;
        HMDeviceType hMDeviceType3 = HMDeviceType.MILI;
        Device device5 = map2.get(hMDeviceType3);
        Device device6 = this.j.get(hMDeviceType);
        HashMap<HMDeviceType, Device> map3 = this.j;
        HMDeviceType hMDeviceType4 = HMDeviceType.EARBUD;
        Device device7 = map3.get(hMDeviceType4);
        HMBaseDevice hMBaseDeviceCreateBleDevice = null;
        HMDeviceSource hMDeviceSourceFromValue2 = device6 != null ? HMDeviceSource.fromValue(device6.getDevice_source().intValue()) : null;
        HMLog.i(u, "watchSource: " + hMDeviceSourceFromValue2, new Object[0]);
        if (device7 != null) {
            this.i.put(hMDeviceType4, createBleDevice(device7));
        }
        if (device5 != null) {
            if (!ConfigHelperKt.hasFeature(Feature.EVEREST_2_SERIES, HMDeviceSource.fromValue(device5.getDevice_source().intValue()))) {
                hMBaseDeviceCreateBleDevice = createBleDevice(device5);
            }
            if (hMBaseDeviceCreateBleDevice != null) {
                this.i.put(hMDeviceType3, hMBaseDeviceCreateBleDevice);
            } else {
                HMLog.i(u, "createBleDevice return null!!!", new Object[0]);
            }
            if (device4 != null) {
                A0(hMDeviceType2);
                this.d.getValue().destroy();
                EventBus.getDefault().postSticky(new HMDeviceBindEvent(false, hMDeviceType2));
            }
        } else if (ConfigHelperKt.hasFeature(Feature.EVEREST_2_SERIES, hMDeviceSourceFromValue2)) {
            HMSmartWatchDevice hMSmartWatchDevice = CompanionApplication.get().mBleConnection.mBleDevice;
            StringBuilder sb = new StringBuilder();
            sb.append("watchDevice not null: ");
            sb.append(hMSmartWatchDevice != null);
            HMLog.i(u, sb.toString(), new Object[0]);
            if (hMSmartWatchDevice != null && hMDeviceSourceFromValue2 != null) {
                this.p.getValue().initBleDevice(hMSmartWatchDevice, hMDeviceSourceFromValue2, this);
                this.i.put(hMDeviceType, hMSmartWatchDevice);
            }
        } else if (device4 != null) {
            this.d.getValue().create(this.b, new MyRealtimeStepCallback(hMDeviceType2));
        } else if (device6 == null) {
            checkforBindSensorhub();
        }
        this.e.getValue().initDefault();
        this.l = true;
        refreshMozartDeviceState();
        HashMap<HMDeviceType, Device> map4 = this.j;
        HMDeviceType hMDeviceType5 = HMDeviceType.HEARING_AID;
        Device device8 = map4.get(hMDeviceType5);
        if (device8 == null) {
            HMLog.info(u, new Function0() { // from class: xs2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return HMDeviceManager.b0();
                }
            });
        } else {
            HMBaseDevice hMBaseDeviceCreateBleDevice2 = createBleDevice(device8);
            if (hMBaseDeviceCreateBleDevice2 == null) {
                HMLog.i(u, "create aidDevice return null!!!", new Object[0]);
            } else {
                HMLog.info(u, new Function0() { // from class: ss2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return HMDeviceManager.c0();
                    }
                });
                this.i.put(hMDeviceType5, hMBaseDeviceCreateBleDevice2);
            }
        }
    }

    @Override // com.huami.devicex.manager.DeviceManagerApi
    public boolean isActive(Device device) {
        if (device == null) {
            return false;
        }
        boolean z2 = device.getActiveStatus() != null && device.getActiveStatus().intValue() == 1;
        if (ConfigHelperKt.hasFeature(Feature.HEADSET_MOZART_SOURCE_S, HMDeviceSource.fromValue(device.getDevice_source().intValue()))) {
            return z2 && isDeviceCreated(device);
        }
        return z2;
    }

    @Override // com.huami.devicex.manager.DeviceManagerApi
    public boolean isBluetoothEnable() {
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        return defaultAdapter != null && defaultAdapter.isEnabled();
    }

    @Override // com.huami.devicex.manager.DeviceManagerApi
    public boolean isBluetoothSupportAndDisable() {
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        return (defaultAdapter == null || defaultAdapter.isEnabled()) ? false : true;
    }

    @Override // com.huami.devicex.manager.DeviceManagerApi
    public boolean isBoundDevice(BluetoothDevice bluetoothDevice, HMDeviceSource hMDeviceSource) {
        return B.getValue().findBoundDeviceByAddress(bluetoothDevice.getAddress()) != null || w0().isBound(bluetoothDevice, hMDeviceSource);
    }

    @Override // com.huami.devicex.manager.DeviceManagerApi
    public synchronized boolean isConnected(HMDeviceType hMDeviceType) {
        if (hMDeviceType == HMDeviceType.SENSORHUB) {
            return true;
        }
        if (hMDeviceType == HMDeviceType.WATCH) {
            return HMWatchLogic.isConnected();
        }
        HMBaseDevice hMBaseDevice = this.i.get(hMDeviceType);
        if (hMBaseDevice == null) {
            return false;
        }
        if (hMDeviceType == HMDeviceType.EARBUD) {
            return ((HmEarbudDevice) hMBaseDevice).isAllConnected();
        }
        return hMBaseDevice.isConnected();
    }

    @Override // com.huami.devicex.manager.DeviceManagerApi
    public boolean isSupportSensorHub() {
        return this.d.getValue().isSupportSensorHub();
    }

    @Override // com.huami.devicex.manager.DeviceManagerApi
    public boolean isSyncingData(HMDeviceType hMDeviceType) {
        if (hMDeviceType == HMDeviceType.WATCH) {
            return HMWatchLogic.isSyncingData();
        }
        HMBaseDevice device = getDevice(hMDeviceType);
        if (device == null) {
            return false;
        }
        SyncCenterManager syncCenterManager = SyncCenterManager.INSTANCE;
        return syncCenterManager.isUsingSyncCenter() ? syncCenterManager.isSyncing(device) : device.isSyncingData();
    }

    @Override // com.huami.devicex.manager.DeviceManagerApi
    public boolean isUseWearCompanionName(@Nullable Device device) {
        return device != null && device.getDevice_type().intValue() == HMDeviceType.WATCH.getValue();
    }

    public synchronized boolean needBluetoothPermission() {
        if (Build.VERSION.SDK_INT < 23) {
            return false;
        }
        if (this.i.size() > 1) {
            return true;
        }
        if (this.i.size() != 1) {
            return false;
        }
        HMBaseDevice hMBaseDevice = this.i.get(HMDeviceType.MILI);
        return hMBaseDevice == null || ConfigHelperKt.hasFeature(Feature.IS_VIRTUAL_DEVICE, hMBaseDevice.getDeviceSource()) || GattUtils.getBluetoothDeviceType(hMBaseDevice.getBluetoothDevice()) == 0;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0061 A[PHI: r2
      0x0061: PHI (r2v5 com.xiaomi.hm.health.bt.device.Status) = (r2v4 com.xiaomi.hm.health.bt.device.Status), (r2v3 com.xiaomi.hm.health.bt.device.Status) binds: [B:21:0x0079, B:14:0x005f] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.xiaomi.hm.health.bt.ife.IHMConnectionCallback
    public void onConnectionStatusChanged(BluetoothDevice bluetoothDevice, HMDeviceType hMDeviceType, Status status) {
        Status status2;
        HMLog.i(u, "onConnectionStatusChanged device=" + bluetoothDevice + ",type=" + hMDeviceType + ",status=" + status, new Object[0]);
        if (hMDeviceType != HMDeviceType.EARBUD || getDevice(hMDeviceType) == null) {
            status2 = status;
        } else {
            HmEarbudDevice hmEarbudDevice = (HmEarbudDevice) getDevice(hMDeviceType);
            if (hmEarbudDevice.isAllConnected()) {
                EarbudMusicDownloadService.INSTANCE.startDownload(this.b);
                status2 = Status.AUTH_SUCCESS;
            } else {
                Status deviceStatus = hmEarbudDevice.getDeviceStatus();
                Status status3 = Status.DISCONNECTED;
                if (deviceStatus == status3 && hmEarbudDevice.getRightDevice() != null && hmEarbudDevice.getRightDevice().getDeviceStatus() == status3) {
                    status2 = status3;
                } else {
                    Status deviceStatus2 = hmEarbudDevice.getDeviceStatus();
                    status3 = Status.CONNECTING_TIMEOUT;
                    if (deviceStatus2 == status3 && hmEarbudDevice.getRightDevice() != null && hmEarbudDevice.getRightDevice().getDeviceStatus() == status3) {
                        status2 = status3;
                    } else {
                        status2 = Status.GATT_CONNECTING;
                    }
                }
            }
        }
        int i = d.a[status2.ordinal()];
        if (i == 1) {
            EventBus.getDefault().postSticky(new HMDeviceConnectionEvent(3, hMDeviceType));
            if (hMDeviceType == HMDeviceType.MILI) {
                WifiFtpModule.notifyDeviceConnectionChanged(false);
            }
        } else if (i == 2) {
            EventBus.getDefault().postSticky(new HMDeviceConnectionEvent(2, hMDeviceType));
            if (hMDeviceType == HMDeviceType.MILI) {
                WifiFtpModule.notifyDeviceConnectionChanged(false);
            }
        } else if (i != 3) {
            EventBus.getDefault().postSticky(new HMDeviceConnectionEvent(0, hMDeviceType));
            if (hMDeviceType == HMDeviceType.MILI) {
                WifiFtpModule.notifyDeviceConnectionChanged(false);
            }
        } else {
            E0(hMDeviceType);
            EventBus.getDefault().postSticky(new HMDeviceConnectionEvent(1, hMDeviceType));
            if (hMDeviceType == HMDeviceType.MILI) {
                WifiFtpModule.notifyDeviceConnectionChanged(true);
            }
            if (hMDeviceType == HMDeviceType.TREADMILL) {
                onTreadmillConnected(false);
            }
        }
        if (status != Status.AUTH_SUCCESS) {
            FwUnZipStatusHolder.onDisconnected(hMDeviceType, null);
        }
        H(hMDeviceType, status);
        this.o.analyticsForSession(hMDeviceType, status);
    }

    @Override // com.huami.devicex.manager.DeviceManagerApi
    public void onTreadmillConnected(final boolean z2) {
        syncMacAddress();
        if (this.g.getValue().needWriteMaintain()) {
            HMBaseDevice device = getDevice(HMDeviceType.TREADMILL);
            if (device instanceof HMBoltClassicDevice) {
                ((HMBoltClassicDevice) device).disableNotify(new c());
            }
        }
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: ot2
            @Override // java.lang.Runnable
            public final void run() {
                this.a.d0(z2);
            }
        }, 1500L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.huami.devicex.manager.DeviceManagerApi
    public void refreshMozartDeviceState() {
        HMBaseDevice hMBaseDeviceCreateBleDevice;
        synchronized (this) {
            HMLog.i(u, "refreshMozartDeviceState", new Object[0]);
            if (this.l) {
                Device activeHeadset = B.getValue().getActiveHeadset();
                HashMap<HMDeviceType, HMBaseDevice> map = this.i;
                HMDeviceType hMDeviceType = HMDeviceType.HEADSET;
                HMBaseDevice hMBaseDevice = map.get(hMDeviceType);
                if (hMBaseDevice == 0 || (hMBaseDevice instanceof MozartDevice)) {
                    if (hMBaseDevice != 0 && ((MozartDevice) hMBaseDevice).getUpgrading()) {
                        HMLog.i(u, "refreshMozartDeviceState -- skip when device upgrading", new Object[0]);
                        return;
                    }
                    if (P(hMBaseDevice, activeHeadset)) {
                        HMLog.i(u, "refreshMozartDeviceState -- no change!", new Object[0]);
                        return;
                    }
                    if (hMBaseDevice != 0 && activeHeadset != null) {
                        HMLog.i(u, "refreshMozartDeviceState -- disable device! " + hMBaseDevice.getBluetoothDevice().getAddress(), new Object[0]);
                        this.j.remove(hMDeviceType);
                        this.i.remove(hMDeviceType);
                        hMBaseDevice.destroy();
                    }
                    if (activeHeadset != null && (hMBaseDeviceCreateBleDevice = createBleDevice(activeHeadset)) != null) {
                        HMLog.i(u, "refreshMozartDeviceState -- enable device! " + activeHeadset.getDevice_address(), new Object[0]);
                        this.j.put(hMDeviceType, activeHeadset);
                        this.i.put(hMDeviceType, hMBaseDeviceCreateBleDevice);
                    }
                    EventBus.getDefault().post(new HMActiveDeviceEvent(HMDeviceSource.fromValue(activeHeadset == null ? HMDeviceSource.VDEVICE.getValue() : activeHeadset.getDevice_source().intValue()), activeHeadset));
                }
            }
        }
    }

    @Override // com.huami.devicex.manager.DeviceManagerApi
    public void resetEarbudSetting(boolean z2) {
        HMDaoManager.getInstance().getEarbudMusicInfoDao().deleteAll();
        this.g.getValue().saveEarbudRestTime(30);
        this.g.getValue().saveEarbudTomatoTime(25);
        this.g.getValue().saveEarbudTomatoRestTime(5);
        if (z2) {
            this.g.getValue().setShowEarbudAlarmDialog(true);
            this.g.getValue().saveIsShowEarbudRestDialog(true);
            this.g.getValue().saveIsShowEarbudTomatoDialog(true);
            this.g.getValue().setShowEarbudDeleteGuide(true);
            this.g.getValue().setShowEarbudDeleteTip(true);
            this.g.getValue().setShowEarbudAuditionDialog(true);
        }
        EarbudConfigDataManager.Companion companion = EarbudConfigDataManager.INSTANCE;
        companion.getInstance().getConfig().disableInComingCallTime();
        companion.getInstance().save();
    }

    @Override // com.huami.devicex.manager.DeviceManagerApi
    public void saveBaseStep() {
        this.f.getValue().saveBaseStep();
    }

    public void saveSyncTime(HMDeviceType hMDeviceType, String str, long j) {
        String boundDeviceAddress = getBoundDeviceAddress(hMDeviceType);
        if (TextUtils.isEmpty(boundDeviceAddress)) {
            return;
        }
        String property = DeviceXFunctionsKt.getPropertyStoreApi().getProperty(PROPERTY_SYNC_TIME, "");
        String string = null;
        if (TextUtils.isEmpty(property)) {
            try {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put(str, j);
                jSONObject.put(boundDeviceAddress, jSONObject2);
                string = jSONObject.toString();
            } catch (Exception e) {
                HMLog.i(u, e.getMessage(), new Object[0]);
            }
        } else {
            try {
                JSONObject jSONObject3 = new JSONObject(property);
                JSONObject jSONObject4 = jSONObject3.has(boundDeviceAddress) ? jSONObject3.getJSONObject(boundDeviceAddress) : new JSONObject();
                jSONObject4.put(str, j);
                jSONObject3.put(boundDeviceAddress, jSONObject4);
                z0(jSONObject3);
                string = jSONObject3.toString();
            } catch (Exception e2) {
                HMLog.i(u, e2.getMessage(), new Object[0]);
            }
        }
        if (TextUtils.isEmpty(string)) {
            return;
        }
        DeviceXFunctionsKt.getPropertyStoreApi().setProperty(PROPERTY_SYNC_TIME, string);
    }

    @Override // com.huami.devicex.injection.keeper.DeviceTimeStoreApi
    public synchronized void setBoundDeviceSyncTime(HMDeviceType hMDeviceType, Calendar calendar) {
        HMLog.i(u, "New sync time for " + hMDeviceType + " is : " + calendar.getTime(), new Object[0]);
        Device device = this.j.get(hMDeviceType);
        if (device != null) {
            device.setDevice_sync_data_time(Long.valueOf(calendar.getTimeInMillis()));
            device.setTime_zone(Integer.valueOf(ProfileUtils.getTimezoneKey(calendar.getTimeZone())));
            B.getValue().insertOrReplace(device);
        } else {
            HMLog.i(u, "No bound device for " + hMDeviceType, new Object[0]);
        }
    }

    @Override // com.huami.devicex.injection.keeper.DeviceTimeStoreApi
    public synchronized void setEcgSyncTime(HMDeviceType hMDeviceType, Calendar calendar) {
        HMLog.i(u, "set ecg sync time :" + calendar, new Object[0]);
        Device device = this.j.get(hMDeviceType);
        if (device != null) {
            device.setEcgSyncTime(Long.valueOf(calendar.getTimeInMillis()));
            device.setEcgSyncTimeZone(Long.valueOf(ProfileUtils.getTimezoneKey(calendar.getTimeZone())));
            B.getValue().insertOrReplace(device);
        } else {
            HMLog.i(u, "No bound device for " + hMDeviceType, new Object[0]);
        }
    }

    @Override // com.huami.devicex.injection.keeper.DeviceTimeStoreApi
    public synchronized void setGpsSyncTime(HMDeviceType hMDeviceType, Calendar calendar) {
        HMLog.i(u, "New gps sync time for " + hMDeviceType + " is : " + calendar.getTime(), new Object[0]);
        if (calendar.getTimeInMillis() > System.currentTimeMillis()) {
            HMLog.i(u, "ERROR:发生了时间穿越到未来到错误，错误时间来自其他平台", new Object[0]);
            calendar.setTimeInMillis(System.currentTimeMillis());
        }
        Device device = this.j.get(hMDeviceType);
        if (device != null) {
            device.setGps_sync_time(Long.valueOf(calendar.getTimeInMillis()));
            device.setGps_sync_timezone(Long.valueOf(ProfileUtils.getTimezoneKey(calendar.getTimeZone())));
            B.getValue().insertOrReplace(device);
        } else {
            List<Device> listFindBoundDevices = B.getValue().findBoundDevices(hMDeviceType);
            if (listFindBoundDevices.size() > 0) {
                for (Device device2 : listFindBoundDevices) {
                    device2.setGps_sync_time(Long.valueOf(calendar.getTimeInMillis()));
                    device2.setGps_sync_timezone(Long.valueOf(ProfileUtils.getTimezoneKey(calendar.getTimeZone())));
                    B.getValue().insertOrReplace(device2);
                }
            } else {
                HMLog.i(u, "No bound gps device for " + hMDeviceType, new Object[0]);
            }
        }
    }

    @Override // com.huami.devicex.injection.keeper.DeviceTimeStoreApi
    public synchronized void setPaiSyncTime(HMDeviceType hMDeviceType, Calendar calendar) {
        HMLog.i(u, "setPaiSyncTime : " + calendar, new Object[0]);
        Device device = this.j.get(hMDeviceType);
        if (device != null) {
            device.setPaiSyncTime(Long.valueOf(calendar.getTimeInMillis()));
            B.getValue().insertOrReplace(device);
        } else {
            HMLog.i(u, "No bound device for " + hMDeviceType, new Object[0]);
        }
    }

    @Override // com.huami.devicex.injection.keeper.DeviceTimeStoreApi
    public synchronized void setPressureAllDaySyncTime(Calendar calendar) {
        HMLog.i(u, "set pressure all day sync time is : " + calendar, new Object[0]);
        HMDeviceType hMDeviceType = HMDeviceType.MILI;
        Device device = this.j.get(hMDeviceType);
        if (supportPressure()) {
            Long lValueOf = Long.valueOf(calendar.getTimeInMillis());
            if (lValueOf.longValue() > System.currentTimeMillis()) {
                lValueOf = device.getDevice_bind_time();
            }
            saveSyncTime(hMDeviceType, "all_day_stress", lValueOf.longValue());
        } else {
            HMLog.i(u, "No bound device for pressure", new Object[0]);
        }
    }

    @Override // com.huami.devicex.injection.keeper.DeviceTimeStoreApi
    public synchronized void setPressureSingleSyncTime(Calendar calendar) {
        HMLog.i(u, "set pressure single sync time is : " + calendar, new Object[0]);
        HMDeviceType hMDeviceType = HMDeviceType.MILI;
        Device device = this.j.get(hMDeviceType);
        if (supportPressure()) {
            Long lValueOf = Long.valueOf(calendar.getTimeInMillis());
            if (lValueOf.longValue() > System.currentTimeMillis()) {
                lValueOf = device.getDevice_bind_time();
            }
            saveSyncTime(hMDeviceType, "single_stress", lValueOf.longValue());
        } else {
            HMLog.i(u, "No bound device for pressure", new Object[0]);
        }
    }

    @Override // com.huami.devicex.injection.keeper.DeviceTimeStoreApi
    public synchronized void setProHrSyncTime(Calendar calendar) {
        HMLog.i(u, "New pro hr sync time is : " + calendar, new Object[0]);
        Device device = this.j.get(HMDeviceType.MILI);
        if (device == null || !HMDeviceConfig.hasFeatureOfflineHr(HMDeviceSource.fromValue(device.getDevice_source().intValue()))) {
            HMLog.i(u, "No bound device for pro", new Object[0]);
        } else {
            device.setDevice_sync_data_time_hr(Long.valueOf(calendar.getTimeInMillis()));
            device.setTime_zone_sync_hr(Integer.valueOf(ProfileUtils.getTimezoneKey(calendar.getTimeZone())));
            B.getValue().insertOrReplace(device);
        }
    }

    @Override // com.huami.devicex.manager.DeviceManagerApi
    public void setUploadDeviceIds(@org.jetbrains.annotations.Nullable String str) {
        this.g.getValue().setUploadDeviceIds(str);
    }

    @Override // com.huami.devicex.manager.DeviceManagerApi
    public boolean startSyncBoltGpsData() {
        HMDeviceType hMDeviceType = HMDeviceType.TREADMILL;
        HMDeviceSource boundDeviceSource = getBoundDeviceSource(hMDeviceType);
        if (boundDeviceSource == HMDeviceSource.VDEVICE) {
            HMLog.i(u, "no device!", new Object[0]);
            return false;
        }
        HMLog.i(u, "start sync bolt gps data...", new Object[0]);
        HMBoltClassicDevice hMBoltClassicDevice = (HMBoltClassicDevice) getDevice(hMDeviceType);
        StringBuilder sb = new StringBuilder();
        sb.append("device null: ");
        sb.append(hMBoltClassicDevice == null);
        sb.append(", device connected: ");
        sb.append(hMBoltClassicDevice != null && hMBoltClassicDevice.isConnected());
        HMLog.i(u, sb.toString(), new Object[0]);
        if (hMBoltClassicDevice != null) {
            hMBoltClassicDevice.startSyncGpsData(getGpsSyncTime(hMDeviceType), new MyGpsDataSyncCallback(boundDeviceSource));
        }
        return true;
    }

    @Override // com.huami.devicex.manager.DeviceManagerApi
    public void startSyncData(@NotNull HMDeviceType hMDeviceType) {
        startSyncData(hMDeviceType, true);
    }

    @Override // com.huami.devicex.manager.DeviceManagerApi
    public boolean startSyncGpsData() {
        HMMiLiDevice hMMiLiDevice;
        HMDeviceSource boundDeviceSource = getBoundDeviceSource(HMDeviceType.WATCH);
        if (HMDeviceConfig.hasFeatureClassicBtGPS(boundDeviceSource)) {
            HMWatchLogic.getInstance().syncGpsData(new MyGpsDataSyncCallback(boundDeviceSource));
            return true;
        }
        HMDeviceType hMDeviceType = HMDeviceType.MILI;
        HMDeviceSource boundDeviceSource2 = getBoundDeviceSource(hMDeviceType);
        HMLog.i(u, "startSyncGpsData  device type: " + hMDeviceType, new Object[0]);
        if (!HMDeviceConfig.hasFeatureGPSData(boundDeviceSource2) || (hMMiLiDevice = (HMMiLiDevice) getDevice(hMDeviceType)) == null) {
            return false;
        }
        hMMiLiDevice.startSyncGpsData(getGpsSyncTime(hMDeviceType), new MyGpsDataSyncCallback(boundDeviceSource2));
        return true;
    }

    public void startSyncOneData(@NotNull final HMDeviceType hMDeviceType, boolean z2) {
        HMLog.info(u, new Function0() { // from class: rt2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HMDeviceManager.p0(hMDeviceType);
            }
        });
        if (!hasBound(hMDeviceType)) {
            HMLog.warn(u, new Function0() { // from class: qt2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return HMDeviceManager.j0(hMDeviceType);
                }
            });
        }
        switch (d.b[hMDeviceType.ordinal()]) {
            case 1:
                C0(hMDeviceType, z2);
                break;
            case 2:
                F0(hMDeviceType, z2, new Runnable() { // from class: lt2
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.k0(hMDeviceType);
                    }
                });
                break;
            case 3:
                F0(hMDeviceType, z2, new Runnable() { // from class: ps2
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.m0(hMDeviceType);
                    }
                });
                break;
            case 4:
                F0(hMDeviceType, z2, new Runnable() { // from class: nt2
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.o0(hMDeviceType);
                    }
                });
                break;
            case 5:
                HMWatchLogic.getInstance().syncFromWatchService(new MyActivityDataSyncCallback(this, HMDeviceSource.WATCH_AMAZFIT));
                break;
            case 6:
            case 7:
                this.h.syncDataFromDevice();
                break;
        }
    }

    @Override // com.huami.devicex.manager.DeviceManagerApi
    public boolean supportHealthDetect() {
        return HMDevicePropertyCache.getInstance().getMiliFeature().hasSw(34);
    }

    @Override // com.huami.devicex.manager.DeviceManagerApi
    public boolean supportPressure() {
        return HMDevicePropertyCache.getInstance().getMiliFeature().hasSw(3);
    }

    public boolean supportSpo2() {
        return HMDevicePropertyCache.getInstance().getMiliFeature().hasSw(4);
    }

    @Override // com.huami.devicex.manager.DeviceManagerApi
    @Nullable
    public Device toMifitDevice(com.huami.watch.companion.device.Device device) {
        if (device == null) {
            return null;
        }
        Device device2 = new Device(device.getCpuId());
        device2.setDevice_address(device.address());
        HMDeviceSource watchDeviceSource = getWatchDeviceSource(device);
        device2.setDevice_type(Integer.valueOf(watchDeviceSource.getType().getValue()));
        device2.setDevice_source(Integer.valueOf(watchDeviceSource.getValue()));
        device2.setActiveStatus(Integer.valueOf(device.isActive() ? 1 : 0));
        device2.setDevice_bind_status(1);
        device2.setDevice_bind_time(Long.valueOf(device.bindTimestamp()));
        device2.setDevice_sync_data_time(Long.valueOf(device.bindTimestamp()));
        device2.setTime_zone(Integer.valueOf(ProfileUtils.getTimezoneKey(TimeZone.getDefault())));
        device2.setStatus(1);
        device2.setSn(device.getSN());
        device2.setLastBindingPlatform(device.getLastBindingPlatform());
        device2.setFirmware_version(DeviceUtil.getRomVersion(device));
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("SN", device.getSN());
            jSONObject.put("overseaEdition", device.isOverseaEdition());
            jSONObject.put("huamiModel", device.info().getHuamiModel());
            jSONObject.put("huamiBuildNum", device.info().getHuamiBuildNum());
            jSONObject.put("androidDeviceId", device.info().getAndroidDId());
            jSONObject.put("modelNum", device.info().modelNumber());
            device2.setAdditionalInfo(jSONObject.toString());
        } catch (Exception e) {
            HMLog.i(u, "toMifitDevice exception:" + e.getMessage(), new Object[0]);
        }
        return device2;
    }

    @Override // com.huami.devicex.manager.DeviceManagerZeppApi
    @org.jetbrains.annotations.Nullable
    public com.huami.watch.companion.device.Device toWatchDevice(@org.jetbrains.annotations.Nullable Device device) {
        if (this.f.getValue() instanceof DeviceUtilsZeppApi) {
            return ((DeviceUtilsZeppApi) this.f.getValue()).toWatchDevice(device);
        }
        return null;
    }

    @Override // com.huami.devicex.manager.DeviceManagerApi
    public synchronized void unbindDevice(Device device) {
        device.setDevice_bind_status(-1);
        device.setStatus(-1);
        device.setActiveStatus(0);
        B.getValue().update(device);
        if (ConfigHelperKt.hasFeature(Feature.HEADSET_MOZART_SOURCE_S, HMDeviceSource.fromValue(device.getDevice_source().intValue()))) {
            w0().removeDevice(device);
        }
    }

    public synchronized void updateAuthKey(HMDeviceSource hMDeviceSource, String str) {
        if (hMDeviceSource != HMDeviceSource.VDEVICE && !TextUtils.isEmpty(str)) {
            Device device = this.j.get(hMDeviceSource.getType());
            if (device == null) {
                return;
            }
            if (TextUtils.isEmpty(device.getAuthkey())) {
                device.setAuthkey(str);
                B.getValue().insertOrReplace(device);
            } else {
                HMLog.i(u, "return as auth key exist!!!", new Object[0]);
            }
        }
    }

    @Override // com.huami.devicex.manager.DeviceManagerApi
    public void updateDevice(Device device) {
        B.getValue().insertOrReplace(device);
        if (ConfigHelperKt.hasFeature(Feature.HEADSET_MOZART_SOURCE_S, HMDeviceSource.fromValue(device.getDevice_source().intValue()))) {
            getInstance().w0().updateDevice(device);
        }
    }

    @Override // com.huami.devicex.manager.DeviceManagerApi
    public void updateDeviceImg(@org.jetbrains.annotations.Nullable ImageView imageView, @org.jetbrains.annotations.Nullable HMDeviceSource hMDeviceSource) {
        this.f.getValue().updateDeviceImg(imageView, hMDeviceSource);
    }

    @Override // com.huami.devicex.manager.DeviceManagerApi
    public synchronized boolean updateDisplayName(HMDeviceType hMDeviceType, String str) {
        Device device = this.j.get(hMDeviceType);
        if (device == null) {
            return false;
        }
        device.setDisplayName(str);
        B.getValue().insertOrReplace(device);
        if (ConfigHelperKt.hasFeature(Feature.HEADSET_MOZART_SOURCE_S, HMDeviceSource.fromValue(device.getDevice_source().intValue()))) {
            w0().updateDevice(device);
        }
        return true;
    }

    public void waiteDeviceSyncDone(HMDeviceType hMDeviceType) {
        HMBaseDevice device = getDevice(hMDeviceType);
        if (device == null) {
            return;
        }
        SyncCenterManager.INSTANCE.waiteForSyncDone(device);
    }

    @Override // com.huami.devicex.manager.DeviceManagerApi
    @Nullable
    public synchronized HMBaseDevice getDevice() {
        HMBaseDevice hMBaseDeviceL;
        hMBaseDeviceL = L(HMDeviceType.MILI, false);
        if (hMBaseDeviceL == null) {
            hMBaseDeviceL = L(HMDeviceType.WATCH, false);
        }
        return hMBaseDeviceL;
    }

    @Override // com.huami.devicex.manager.DeviceManagerApi
    public synchronized boolean hasBound(HMDeviceSource hMDeviceSource) {
        Device device;
        device = this.j.get(hMDeviceSource.getType());
        return device != null && device.getDevice_source().intValue() == hMDeviceSource.getValue();
    }

    @Override // com.huami.devicex.manager.DeviceManagerApi
    public boolean hasBoundAnyDevice(@NotNull HMDeviceSource hMDeviceSource) {
        return B.getValue().findBoundDevice(hMDeviceSource).size() > 0;
    }

    @Override // com.huami.devicex.manager.DeviceManagerApi
    public void startSyncData(@NotNull HMDeviceType hMDeviceType, boolean z2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(hMDeviceType);
        HMDeviceType hMDeviceType2 = HMDeviceType.HEADSET;
        if (hMDeviceType != hMDeviceType2 && hasBound(hMDeviceType2)) {
            arrayList.add(hMDeviceType2);
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            try {
                startSyncOneData((HMDeviceType) it2.next(), z2);
            } catch (Throwable th) {
                HMLog.error(u, "", th, new Function0() { // from class: zs2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return HMDeviceManager.f0();
                    }
                });
            }
        }
    }

    public static boolean has(HMDeviceSource hMDeviceSource) {
        return B.getValue().findBoundDevice(hMDeviceSource).size() > 0;
    }

    @Override // com.huami.devicex.manager.DeviceManagerApi
    public synchronized boolean hasBound(HMDeviceSource... hMDeviceSourceArr) {
        for (HMDeviceSource hMDeviceSource : hMDeviceSourceArr) {
            if (hasBound(hMDeviceSource)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.huami.devicex.injection.keeper.DeviceTimeStoreApi
    public long getSyncTime(HMDeviceType hMDeviceType, String str) {
        String property = DeviceXFunctionsKt.getPropertyStoreApi().getProperty(PROPERTY_SYNC_TIME, "");
        if (TextUtils.isEmpty(property)) {
            return 0L;
        }
        String boundDeviceAddress = getBoundDeviceAddress(hMDeviceType);
        if (TextUtils.isEmpty(boundDeviceAddress)) {
            return 0L;
        }
        try {
            return new JSONObject(property).getJSONObject(boundDeviceAddress).optLong(str);
        } catch (Exception e) {
            HMLog.i(u, e.getMessage(), new Object[0]);
            return 0L;
        }
    }

    public static List<Device> getBoundDevices() {
        List<Device> listFindAllBoundDeviceInOrder = C.getValue().findAllBoundDeviceInOrder();
        if (listFindAllBoundDeviceInOrder.size() == 0) {
            return listFindAllBoundDeviceInOrder;
        }
        ArrayList arrayList = new ArrayList();
        for (Device device : listFindAllBoundDeviceInOrder) {
            if (device.getDevice_type().intValue() != HMDeviceType.WATCH.getValue() || device.getStatus().intValue() == 1) {
                arrayList.add(device);
            }
        }
        return arrayList;
    }

    @Override // com.huami.devicex.manager.DeviceManagerApi
    public synchronized void unbindDevice(HMDeviceType hMDeviceType) {
        HMLog.d(u, "unbindDevice:" + hMDeviceType, new Object[0]);
        A0(hMDeviceType);
        HMBaseDevice hMBaseDeviceRemove = this.i.remove(hMDeviceType);
        if (hMBaseDeviceRemove != null) {
            this.q.onDeviceUnBind(hMBaseDeviceRemove);
            hMBaseDeviceRemove.destroy();
            if (ConfigHelperKt.hasFeature(Feature.HEADSET_MOZART_SOURCE_S, hMBaseDeviceRemove.getDeviceSource())) {
                refreshMozartDeviceState();
            }
        }
        HMDeviceType hMDeviceType2 = HMDeviceType.SENSORHUB;
        if (hMDeviceType == hMDeviceType2) {
            this.d.getValue().destroy();
            EventBus.getDefault().postSticky(new HMDeviceBindEvent(false, hMDeviceType2));
        }
    }
}
