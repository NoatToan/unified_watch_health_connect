package com.xiaomi.hm.health.device.service;

import android.os.Binder;
import android.os.Handler;
import android.os.HandlerThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.huami.bluetooth.device.HeadsetDevice;
import com.huami.bluetooth.device.MozartDevice;
import com.huami.bluetooth.device.RealtimeHeartRateDevice;
import com.huami.bluetooth.profile.ecf.data.AppState;
import com.huami.devicex.manager.DeviceManagerApi;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.baseutil.GlobalConfig;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMCallback;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.device.HMMiLiDevice;
import com.xiaomi.hm.health.bt.device.HMMiLiProDevice;
import com.xiaomi.hm.health.bt.device.HMNormandyDevice;
import com.xiaomi.hm.health.bt.device.LullabyDevice;
import com.xiaomi.hm.health.bt.profile.alert.HMAlertMode;
import com.xiaomi.hm.health.bt.profile.alert.HMAlertModeExt;
import com.xiaomi.hm.health.bt.profile.auth.IHMAuthCallback;
import com.xiaomi.hm.health.bt.profile.base.BatteryInfo;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.SportCalibrateInfo;
import com.xiaomi.hm.health.bt.profile.hr.HMHeartRateController;
import com.xiaomi.hm.health.bt.profile.sport.IHMSportListener;
import com.xiaomi.hm.health.bt.profile.sport.SportCommand;
import com.xiaomi.hm.health.bt.profile.sport.SportConfig;
import com.xiaomi.hm.health.bt.profile.sport.SportInfo;
import com.xiaomi.hm.health.databases.model.Device;
import com.xiaomi.hm.health.device.HMDeviceUtils;
import com.xiaomi.hm.health.device.event.HMDeviceBatteryEvent;
import com.xiaomi.hm.health.device.event.HMDeviceConnectionEvent;
import com.xiaomi.hm.health.device.event.HMDeviceRealtimeStepEvent;
import com.xiaomi.hm.health.device.service.BleServiceWrapper;
import com.xiaomi.hm.health.devicelib.DeviceBattery;
import com.xiaomi.hm.health.devicelib.DeviceConnectionStatus;
import com.xiaomi.hm.health.devicelib.IDeviceBatteryCallback;
import com.xiaomi.hm.health.devicelib.IDeviceCallback;
import com.xiaomi.hm.health.devicelib.IDeviceConnectionCallback;
import com.xiaomi.hm.health.devicelib.IDeviceHRCallback;
import com.xiaomi.hm.health.devicelib.IDeviceInterface;
import com.xiaomi.hm.health.devicelib.IDeviceStepCallback;
import com.xiaomi.hm.health.devicelib.UserData;
import com.xiaomi.hm.health.heartrate.HeartRateCenter;
import java.util.HashMap;
import kotlin.Lazy;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes18.dex */
public class BleServiceWrapper extends Binder implements IDeviceInterface {
    private static final String h = "HMBLEService";
    private final HashMap<HMDeviceType, IDeviceStepCallback> a = new HashMap<>();
    private final HashMap<HMDeviceType, IDeviceConnectionCallback> b = new HashMap<>();
    private final HashMap<HMDeviceType, IDeviceBatteryCallback> c = new HashMap<>();
    private final Lazy<DeviceManagerApi> d = KoinJavaComponent.inject(DeviceManagerApi.class);
    private Handler e;
    private Handler f;
    private d g;

    public class a extends HMCallback {
        public final /* synthetic */ IDeviceCallback a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean onUIThread, final IDeviceCallback val$callback) {
            super(onUIThread);
            this.a = val$callback;
        }

        @Override // com.xiaomi.hm.health.bt.device.HMCallback
        public void onFinish(boolean result) {
            super.onFinish(result);
            IDeviceCallback iDeviceCallback = this.a;
            if (iDeviceCallback != null) {
                iDeviceCallback.onFinish(result);
            }
        }

        @Override // com.xiaomi.hm.health.bt.device.HMCallback
        public void onStart() {
            super.onStart();
            IDeviceCallback iDeviceCallback = this.a;
            if (iDeviceCallback != null) {
                iDeviceCallback.onStart();
            }
        }
    }

    public class b extends HMCallback {
        public final /* synthetic */ SportConfig a;

        public b(final SportConfig val$config) {
            this.a = val$config;
        }

        @Override // com.xiaomi.hm.health.bt.device.HMCallback
        public void onFinish(boolean result) {
            super.onFinish(result);
            HMLog.d(BleServiceWrapper.h, "sendSportConfig:" + this.a + ",result:" + result, new Object[0]);
        }
    }

    public class c extends HMCallback {
        public final /* synthetic */ SportCommand a;
        public final /* synthetic */ SportInfo b;

        public c(final SportCommand val$command, final SportInfo val$info) {
            this.a = val$command;
            this.b = val$info;
        }

        @Override // com.xiaomi.hm.health.bt.device.HMCallback
        public void onFinish(boolean result) {
            super.onFinish(result);
            HMLog.d(BleServiceWrapper.h, "sendSportCommand:" + this.a + ",info:" + this.b + ",result:" + result, new Object[0]);
        }
    }

    public class d implements HMHeartRateController.IHeartRateCallback {
        public IDeviceHRCallback a;

        public d(IDeviceHRCallback callback) {
            this.a = callback;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(int i) {
            IDeviceHRCallback iDeviceHRCallback = this.a;
            if (iDeviceHRCallback != null) {
                iDeviceHRCallback.onHrChanged(i);
            }
        }

        @Override // com.xiaomi.hm.health.bt.profile.hr.HMHeartRateController.IHeartRateCallback
        public void onHeartRateChanged(final int hr) {
            if (!GlobalConfig.get().isBuildInner()) {
                if (BleServiceWrapper.this.e != null) {
                    BleServiceWrapper.this.e.post(new Runnable() { // from class: com.xiaomi.hm.health.device.service.a
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.a.b(hr);
                        }
                    });
                }
            } else {
                IDeviceHRCallback iDeviceHRCallback = this.a;
                if (iDeviceHRCallback != null) {
                    iDeviceHRCallback.onHrChanged(hr);
                }
            }
        }

        @Override // com.xiaomi.hm.health.bt.profile.hr.HMHeartRateController.IHeartRateCallback
        public void onOpen(boolean result) {
            HMLog.i(BleServiceWrapper.h, "onOpen:" + result, new Object[0]);
        }
    }

    public BleServiceWrapper() {
        this.e = null;
        if (!GlobalConfig.get().isBuildInner()) {
            this.e = new Handler();
        }
        HandlerThread handlerThread = new HandlerThread(h);
        handlerThread.start();
        this.f = new Handler(handlerThread.getLooper());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private DeviceBattery c(@Nullable HMBaseDevice device) {
        MozartDevice mozartDevice;
        HeadsetDevice.HeadsetDeviceState headsetState;
        if (device == 0) {
            return null;
        }
        BatteryInfo batteryInfo = ((device instanceof MozartDevice) && (headsetState = (mozartDevice = (MozartDevice) device).getHeadsetState()) != null && headsetState.isRightConnected()) ? mozartDevice.getBatteryInfo(HeadsetDevice.Part.Right.INSTANCE) : device.getBatteryInfo();
        if (batteryInfo == null) {
            return null;
        }
        return new DeviceBattery(batteryInfo.getLevel());
    }

    private DeviceBattery d(@NonNull HMDeviceType deviceType) {
        return c(this.d.getValue().getDevice(deviceType));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void e(HMBaseDevice hMBaseDevice, AppState appState) {
        HMLog.i(h, "syncAppState: " + appState + " " + ((MozartDevice) hMBaseDevice).syncAppState(appState), new Object[0]);
    }

    public void enableRealtimeHeartRate(int source, boolean enable, IDeviceHRCallback callback) {
        HMLog.d(h, "enableRealtimeHeartRate source:" + source + ",enable=" + enable, new Object[0]);
        HMDeviceSource hMDeviceSourceFromValue = HMDeviceSource.fromValue(source);
        IHMAuthCallback device = this.d.getValue().getDevice(hMDeviceSourceFromValue.getType());
        if (device == null) {
            HMLog.i(h, "enableRealtimeHeartRate device is null!!!", new Object[0]);
            return;
        }
        if (!(device instanceof RealtimeHeartRateDevice)) {
            HMLog.d(h, "not support source:" + source, new Object[0]);
            return;
        }
        if (!enable) {
            HMLog.i(h, "stopRealtimeMeasureHr " + hMDeviceSourceFromValue, new Object[0]);
            if (hMDeviceSourceFromValue.getType() == HMDeviceType.MILI) {
                HeartRateCenter.INSTANCE.stopRealtimeHrForSpecialModule(h);
                return;
            } else {
                ((RealtimeHeartRateDevice) device).stopRealtimeMeasureHr();
                return;
            }
        }
        HMLog.i(h, "startRealtimeMeasureHr " + hMDeviceSourceFromValue, new Object[0]);
        if (hMDeviceSourceFromValue.getType() != HMDeviceType.MILI) {
            ((RealtimeHeartRateDevice) device).startRealtimeMeasureHr(new d(callback));
            return;
        }
        d dVar = new d(callback);
        this.g = dVar;
        HeartRateCenter.INSTANCE.startRealtimeHrForSpecialModule(h, dVar);
    }

    public void enableRealtimeStep(int source, boolean enable, IDeviceStepCallback callback) {
        HMLog.d(h, "enableRealtimeStep source:" + source + ",enable=" + enable, new Object[0]);
        synchronized (this.a) {
            HMDeviceType type = HMDeviceSource.fromValue(source).getType();
            if (enable) {
                this.a.put(type, callback);
            } else {
                this.a.remove(type);
            }
        }
    }

    public void enableSixAxis(int source, boolean enable, final IDeviceCallback callback) {
        HMDeviceSource hMDeviceSourceFromValue = HMDeviceSource.fromValue(source);
        if (hMDeviceSourceFromValue != HMDeviceSource.SHOES_MARS || !this.d.getValue().hasBound(hMDeviceSourceFromValue)) {
            if (callback != null) {
                callback.onStart();
                callback.onFinish(false);
                return;
            }
            return;
        }
        HMNormandyDevice hMNormandyDevice = (HMNormandyDevice) this.d.getValue().getDevice(hMDeviceSourceFromValue.getType());
        if (hMNormandyDevice != null) {
            hMNormandyDevice.enableSixAxis(enable, new a(false, callback));
        } else if (callback != null) {
            callback.onStart();
            callback.onFinish(false);
        }
    }

    @Override // com.xiaomi.hm.health.devicelib.IDeviceInterface
    public int getBoundBrandType(HMDeviceType type) {
        Integer brandType;
        Device bindInfo = this.d.getValue().getBindInfo(type);
        if (bindInfo == null || (brandType = bindInfo.getBrandType()) == null) {
            return -1;
        }
        return brandType.intValue();
    }

    @Override // com.xiaomi.hm.health.devicelib.IDeviceInterface
    public HMDeviceSource getBoundDevice(HMDeviceType type) {
        return HMDeviceSource.fromValue(getDeviceSource(type.getValue()));
    }

    @Override // com.xiaomi.hm.health.devicelib.IDeviceInterface
    public DeviceBattery getDeviceBattery(HMDeviceSource source) {
        if (source == null) {
            return null;
        }
        return d(source.getType());
    }

    public String getDeviceId(int source) {
        return this.d.getValue().getBoundDeviceId(HMDeviceSource.fromValue(source).getType());
    }

    public int getDeviceSource(int type) {
        return this.d.getValue().getBoundDeviceSource(HMDeviceType.fromValue(type)).getValue();
    }

    @Override // com.xiaomi.hm.health.devicelib.IDeviceInterface
    public UserData getUserData() {
        return HMDeviceUtils.getThirdPartyUserData();
    }

    public boolean hasBound(int source) {
        HMLog.d(h, "hasBound source:" + source, new Object[0]);
        return this.d.getValue().hasBound(HMDeviceSource.fromValue(source));
    }

    public boolean hasBoundType(int type) {
        HMLog.d(h, "hasBound type:" + type, new Object[0]);
        return this.d.getValue().hasBound(HMDeviceType.fromValue(type));
    }

    public boolean isConnected(int source) {
        HMLog.d(h, "isConnected:" + source, new Object[0]);
        HMBaseDevice device = this.d.getValue().getDevice(HMDeviceSource.fromValue(source).getType());
        return device != null && device.isConnected();
    }

    public void onEvent(HMDeviceRealtimeStepEvent event) {
        HMLog.d(h, "onEvent:" + event, new Object[0]);
        synchronized (this.a) {
            IDeviceStepCallback iDeviceStepCallback = this.a.get(event.getDeviceType());
            if (iDeviceStepCallback != null) {
                iDeviceStepCallback.onStepChanged(event.getRealtimeStep());
            }
        }
    }

    @Override // com.xiaomi.hm.health.devicelib.IDeviceInterface
    public void sendSportCommand(HMDeviceSource source, final SportCommand command, final SportInfo info) {
        HMMiLiProDevice hMMiLiProDevice = (HMMiLiProDevice) this.d.getValue().getDevice(source.getType());
        if (hMMiLiProDevice == null) {
            return;
        }
        if (command == SportCommand.NOTIFY) {
            HMLog.i(h, "SportCommand:" + command + ",SportInfo:" + info, new Object[0]);
        }
        hMMiLiProDevice.sendSportCommand(command, info, new c(command, info));
    }

    @Override // com.xiaomi.hm.health.devicelib.IDeviceInterface
    public void sendSportConfig(HMDeviceSource source, final SportConfig config, IHMSportListener listener) {
        HMMiLiProDevice hMMiLiProDevice = (HMMiLiProDevice) this.d.getValue().getDevice(source.getType());
        if (hMMiLiProDevice == null) {
            return;
        }
        hMMiLiProDevice.sendSportConfig(config, listener, new b(config));
    }

    @Override // com.xiaomi.hm.health.devicelib.IDeviceInterface
    public void sendVerifyDistanceCommand(HMDeviceSource source, long timestamp, int distance, int steps, HMCallback callback) {
        HMMiLiProDevice hMMiLiProDevice = (HMMiLiProDevice) this.d.getValue().getDevice(source.getType());
        if (hMMiLiProDevice == null) {
            callback.onFinish(false);
            return;
        }
        SportCalibrateInfo sportCalibrateInfo = new SportCalibrateInfo();
        sportCalibrateInfo.setStartTimestamp((int) timestamp);
        sportCalibrateInfo.setDistance(distance);
        sportCalibrateInfo.setStep(steps);
        hMMiLiProDevice.sportCalibrate(sportCalibrateInfo, callback);
    }

    public void setBatteryCallback(int source, IDeviceBatteryCallback callback) {
        synchronized (this.c) {
            HMDeviceType type = HMDeviceSource.fromValue(source).getType();
            if (callback == null) {
                this.c.remove(type);
            } else {
                this.c.put(type, callback);
            }
        }
    }

    public void setConnectionCallback(int source, IDeviceConnectionCallback callback) {
        synchronized (this.b) {
            HMDeviceType type = HMDeviceSource.fromValue(source).getType();
            if (callback == null) {
                this.b.remove(type);
            } else {
                this.b.put(type, callback);
            }
        }
    }

    @Override // com.xiaomi.hm.health.devicelib.IDeviceInterface
    public void syncAppState(HMDeviceSource source, final AppState state) {
        final HMBaseDevice device = this.d.getValue().getDevice(source.getType());
        if (device != null && (device instanceof MozartDevice)) {
            this.f.post(new Runnable() { // from class: ty
                @Override // java.lang.Runnable
                public final void run() {
                    BleServiceWrapper.e(device, state);
                }
            });
        }
    }

    public void vibrate(int type, int pace) {
        HMLog.d(h, "vibrate type:" + type, new Object[0]);
        HMBaseDevice device = this.d.getValue().getDevice(HMDeviceType.fromValue(type));
        if (device instanceof HMMiLiDevice) {
            ((HMMiLiDevice) device).alert(new HMAlertModeExt(HMAlertMode.ALERT_PACE, pace), new HMCallback());
        }
    }

    public void vibrateHr(int type, int hr) {
        HMLog.d(h, "vibrate type:" + type, new Object[0]);
        HMBaseDevice device = this.d.getValue().getDevice(HMDeviceType.fromValue(type));
        if (device instanceof HMMiLiDevice) {
            ((HMMiLiDevice) device).alert(new HMAlertModeExt(HMAlertMode.ALERT_HR, hr), new HMCallback());
        }
    }

    @Override // com.xiaomi.hm.health.devicelib.IDeviceInterface
    public void vibratePace(HMDeviceType type, int pace) {
        vibrate(type.getValue(), pace);
    }

    @Override // com.xiaomi.hm.health.devicelib.IDeviceInterface
    public boolean hasBound(HMDeviceSource source) {
        return hasBound(source.getValue());
    }

    @Override // com.xiaomi.hm.health.devicelib.IDeviceInterface
    public String getDeviceId(HMDeviceSource source) {
        return getDeviceId(source.getValue());
    }

    @Override // com.xiaomi.hm.health.devicelib.IDeviceInterface
    public boolean hasBound(HMDeviceType type) {
        return hasBoundType(type.getValue());
    }

    @Override // com.xiaomi.hm.health.devicelib.IDeviceInterface
    public boolean isConnected(HMDeviceSource source) {
        return isConnected(source.getValue());
    }

    public void onEvent(HMDeviceBatteryEvent event) {
        HeadsetDevice.HeadsetDeviceState headsetState;
        BatteryInfo batteryInfo;
        HMLog.d(h, "onEvent:" + event, new Object[0]);
        synchronized (this.c) {
            HMDeviceType deviceType = event.getDeviceType();
            IDeviceBatteryCallback iDeviceBatteryCallback = this.c.get(deviceType);
            if (iDeviceBatteryCallback == null) {
                return;
            }
            IHMAuthCallback device = this.d.getValue().getDevice(deviceType);
            if ((device instanceof MozartDevice) && !(device instanceof LullabyDevice) && (headsetState = ((MozartDevice) device).getHeadsetState()) != null && headsetState.isRightConnected() && (batteryInfo = ((MozartDevice) device).getBatteryInfo(HeadsetDevice.Part.Right.INSTANCE)) != null) {
                iDeviceBatteryCallback.onBatteryLevelChanged(batteryInfo.getLevel());
            } else {
                iDeviceBatteryCallback.onBatteryLevelChanged(event.getBatteryInfo().getLevel());
            }
        }
    }

    @Override // com.xiaomi.hm.health.devicelib.IDeviceInterface
    public void vibrateHr(HMDeviceType type, int hr) {
        vibrateHr(type.getValue(), hr);
    }

    @Override // com.xiaomi.hm.health.devicelib.IDeviceInterface
    public void enableRealtimeStep(HMDeviceSource source, boolean enable, IDeviceStepCallback callback) {
        enableRealtimeStep(source.getValue(), enable, callback);
    }

    @Override // com.xiaomi.hm.health.devicelib.IDeviceInterface
    public void setBatteryCallback(HMDeviceSource source, IDeviceBatteryCallback callback) {
        setBatteryCallback(source.getValue(), callback);
    }

    @Override // com.xiaomi.hm.health.devicelib.IDeviceInterface
    public void setConnectionCallback(HMDeviceSource source, IDeviceConnectionCallback callback) {
        setConnectionCallback(source.getValue(), callback);
    }

    @Override // com.xiaomi.hm.health.devicelib.IDeviceInterface
    public void enableSixAxis(HMDeviceSource source, boolean enable, IDeviceCallback callback) {
        enableSixAxis(source.getValue(), enable, callback);
    }

    @Override // com.xiaomi.hm.health.devicelib.IDeviceInterface
    public void enableRealtimeHeartRate(HMDeviceSource source, boolean enable, IDeviceHRCallback callback) {
        enableRealtimeHeartRate(source.getValue(), enable, callback);
    }

    public void onEvent(HMDeviceConnectionEvent event) {
        HMLog.d(h, "onEvent:" + event, new Object[0]);
        synchronized (this.b) {
            DeviceConnectionStatus deviceConnectionStatus = DeviceConnectionStatus.CONNECTING;
            if (event.isConnected()) {
                deviceConnectionStatus = DeviceConnectionStatus.CONNECTED;
            } else if (!event.isConnecting() && event.isDisconnected()) {
                deviceConnectionStatus = DeviceConnectionStatus.DISCONNECTED;
            }
            IDeviceConnectionCallback iDeviceConnectionCallback = this.b.get(event.getDeviceType());
            if (iDeviceConnectionCallback != null) {
                iDeviceConnectionCallback.onConnectionStateChanged(deviceConnectionStatus);
            }
        }
    }
}
