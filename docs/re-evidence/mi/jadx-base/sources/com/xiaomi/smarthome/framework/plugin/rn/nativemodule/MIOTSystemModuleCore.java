package com.xiaomi.smarthome.framework.plugin.rn.nativemodule;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentFilter;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.net.DhcpInfo;
import android.net.wifi.WifiManager;
import android.nfc.NfcAdapter;
import android.os.Vibrator;
import android.text.format.Formatter;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.xiaomi.smarthome.framework.plugin.rn.constants.RnApiErrorInfo;
import com.xiaomi.smarthome.framework.plugin.rn.log.MRnLog;
import com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTSystem;
import com.xiaomi.smarthome.framework.plugin.rn.nativemodule.sensor.CompassSensor;
import com.xiaomi.smarthome.framework.plugin.rn.nativemodule.sensor.SensorHelper;
import com.xiaomi.smarthome.framework.plugin.rn.nativemodule.sensor.ShakeDetector;
import com.xiaomi.smarthome.framework.plugin.rn.nativemodule.volume.VolumeChangeObserver;
import com.xiaomi.smarthome.framework.plugin.rn.utils.RnCallbackMapUtil;
import com.xiaomi.smarthome.homeroom.model.Home;
import com.xiaomi.smarthome.utils.MiRouterUtils;
import defpackage.cxg;
import defpackage.ndj;
import java.net.InetAddress;

/* JADX INFO: loaded from: classes2.dex */
@ndj(name = MIOTSystemModuleCore.NAME)
public class MIOTSystemModuleCore extends MIOTBaseJavaModule implements IMIOTSystem, ReactModuleWithSpec {
    public static final String NAME = "MIOTSystem";
    public static final String TAG = "MIOTSystemModule";
    private static final long VIBRATOR_DURATION_LONG = 400;
    private static final long VIBRATOR_DURATION_SHORT = 15;
    private Sensor mAccelerometerSensor;
    private CompassSensor mCompassSensor;
    private Sensor mGyrosopeSensor;
    private SensorHelper mSensorHelper;
    private Sensor mShakeSensor;
    private VolumeChangeObserver mVolumeChangeObserver;

    public MIOTSystemModuleCore(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.mSensorHelper = new SensorHelper(reactApplicationContext);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startCompass$0(double d) {
        getEventProvider().sendCompressEvent(d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startShakeListener$2() {
        getEventProvider().sendShakeEvent();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startVolume$1(double d) {
        getEventProvider().sendVolumeChangeEvent(d);
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTSystem
    @ReactMethod
    public final void checkAPPSystemConfigEnable(String str, Callback callback) {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            callback.invoke(Boolean.FALSE, RnCallbackMapUtil.getCommonErrorMap("get current activity is null!"));
            return;
        }
        if (!"notification".equals(str)) {
            callback.invoke(Boolean.FALSE, RnCallbackMapUtil.getCommonErrorMap("unknown SystemConfig type!"));
            return;
        }
        boolean zA = cxg.b(currentActivity).a();
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putBoolean("enable", zA);
        callback.invoke(Boolean.TRUE, RnCallbackMapUtil.getCommonSuccessMap(writableMapCreateMap));
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTSystem
    @ReactMethod
    public void connectWifi(String str, String str2) {
        onMethodNotImplamente(" connectWifi(String ssid, String pwd) haven't been impl");
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTSystem
    @ReactMethod
    public final void getBatteryInfo(Callback callback) {
        MRnLog.d(TAG, "getBatteryInfo,");
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            MRnLog.w(TAG, "getBatteryInfo,getCurrentActivity returns null");
            return;
        }
        if (callback == null) {
            MRnLog.w(TAG, "getBatteryInfo,callback null");
            return;
        }
        Intent intentRegisterReceiver = currentActivity.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        int intExtra = intentRegisterReceiver.getIntExtra("status", -1);
        int intExtra2 = intentRegisterReceiver.getIntExtra("level", -1);
        if (intExtra2 < 0 || intExtra2 > 100) {
            callback.invoke(Boolean.FALSE, RnCallbackMapUtil.getCommonErrorMap(RnApiErrorInfo.DEVICE_ERROR, "illegal level"));
            return;
        }
        boolean z = intExtra == 2;
        MRnLog.d(TAG, "getBatteryInfo,level:" + intExtra2 + ",isCharging:" + z);
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("level", String.valueOf(intExtra2));
        writableMapCreateMap.putBoolean("isCharging", z);
        callback.invoke(Boolean.TRUE, RnCallbackMapUtil.getCommonSuccessMap(writableMapCreateMap));
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTSystem
    @ReactMethod
    public final void getGatewayIpAddress(Callback callback) {
        MRnLog.d(TAG, "getGatewayIpAddress,");
        WifiManager wifiManager = (WifiManager) getReactApplicationContext().getApplicationContext().getSystemService("wifi");
        if (wifiManager == null) {
            callback.invoke(Boolean.FALSE, RnCallbackMapUtil.getCommonErrorMap("wifi service error"));
            return;
        }
        DhcpInfo dhcpInfo = wifiManager.getDhcpInfo();
        if (dhcpInfo == null) {
            callback.invoke(Boolean.FALSE, RnCallbackMapUtil.getCommonErrorMap("getDhcpInfo error"));
            return;
        }
        String ipAddress = Formatter.formatIpAddress(dhcpInfo.gateway);
        WritableMap writableMapCreateMap = Arguments.createMap();
        MRnLog.d(TAG, "getGatewayIpAddress,ipAddress:" + ipAddress);
        writableMapCreateMap.putString("ipAddress", ipAddress);
        callback.invoke(Boolean.TRUE, RnCallbackMapUtil.getCommonSuccessMap(writableMapCreateMap));
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTSystem
    @ReactMethod
    public void getLocation(String str, Callback callback) {
        onMethodNotImplamente(" getLocation(String accuracy, Callback callback) haven't been impl");
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTSystem
    @ReactMethod
    public void getLocationServerState(Callback callback) {
        onMethodNotImplamente(" getLocationServerState(Callback callback) haven't been impl");
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTSystem
    @ReactMethod
    public final void getNfcInfo(Callback callback) {
        if (getCurrentActivity() == null) {
            callback.invoke(Boolean.FALSE, RnCallbackMapUtil.getCommonErrorMap(-1, "internal error:context is null"));
            return;
        }
        try {
            NfcAdapter defaultAdapter = NfcAdapter.getDefaultAdapter(getCurrentActivity());
            WritableMap writableMapCreateMap = Arguments.createMap();
            if (defaultAdapter == null) {
                writableMapCreateMap.putInt("status", -1);
                callback.invoke(Boolean.TRUE, RnCallbackMapUtil.getCommonSuccessMap(0, writableMapCreateMap));
            } else if (defaultAdapter.isEnabled()) {
                writableMapCreateMap.putInt("status", 1);
                callback.invoke(Boolean.TRUE, RnCallbackMapUtil.getCommonSuccessMap(0, writableMapCreateMap));
            } else {
                writableMapCreateMap.putInt("status", 0);
                callback.invoke(Boolean.TRUE, RnCallbackMapUtil.getCommonSuccessMap(0, writableMapCreateMap));
            }
        } catch (Throwable th) {
            MRnLog.w(TAG, "getNfcStatus error:", th);
            callback.invoke(Boolean.FALSE, RnCallbackMapUtil.getCommonErrorMap(-1, "internal error"));
        }
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTSystem
    @ReactMethod
    public final void getVolumeInfo(Callback callback) {
        MRnLog.d(TAG, "getVolumeInfo,");
        double currentVolume = new VolumeChangeObserver(getReactApplicationContext()).getCurrentVolume();
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putDouble("volume", currentVolume);
        callback.invoke(Boolean.TRUE, RnCallbackMapUtil.getCommonSuccessMap(writableMapCreateMap));
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTSystem
    @ReactMethod
    public final void getWifiBroadcastAddress(Callback callback) {
        if (callback == null) {
            return;
        }
        InetAddress wifiBroadcastAddressInner = MiRouterUtils.getWifiBroadcastAddressInner(getReactApplicationContext());
        if (wifiBroadcastAddressInner == null) {
            callback.invoke(Boolean.FALSE, RnCallbackMapUtil.getCommonErrorMap("not connect wifi..."));
            return;
        }
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString(Home.JSON_KEY_ADDRESS, wifiBroadcastAddressInner.getHostAddress());
        callback.invoke(Boolean.TRUE, RnCallbackMapUtil.getCommonSuccessMap(writableMapCreateMap));
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTSystem
    @ReactMethod
    public void isMiConnectSupportNFC(ReadableMap readableMap, Callback callback) {
        onMethodNotImplamente(" isMiConnectSupportNFC(ReadableMap map, Callback callback) haven't been impl");
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void onCatalystInstanceDestroy() {
        super.onCatalystInstanceDestroy();
        this.mSensorHelper.release();
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTSystem
    @ReactMethod
    public final void openAPPSystemConfigPage(String str) {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity != null && "notification".equals(str)) {
            Intent intent = new Intent();
            intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
            intent.putExtra("android.provider.extra.APP_PACKAGE", currentActivity.getPackageName());
            currentActivity.startActivity(intent);
        }
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTSystem
    @ReactMethod
    public final void scanCode(Callback callback) {
        getApplicationProvider().startScanCode(getCurrentActivity(), callback);
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTSystem
    @ReactMethod
    public final void startAccelerometer(String str, Callback callback) {
        Sensor sensor = this.mAccelerometerSensor;
        if (sensor != null) {
            this.mSensorHelper.unRegisterSensorEventListener(sensor);
        }
        this.mAccelerometerSensor = this.mSensorHelper.registerSensorEventListener(1, new SensorEventListener() { // from class: com.xiaomi.smarthome.framework.plugin.rn.nativemodule.MIOTSystemModuleCore.1
            @Override // android.hardware.SensorEventListener
            public void onAccuracyChanged(Sensor sensor2, int i) {
            }

            @Override // android.hardware.SensorEventListener
            public void onSensorChanged(SensorEvent sensorEvent) {
                MIOTSystemModuleCore.this.getEventProvider().sendAccelerometerEvent(sensorEvent);
            }
        }, str);
        callback.invoke(Boolean.TRUE, RnCallbackMapUtil.getCommonSuccessMap(0, null, "success"));
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTSystem
    @ReactMethod
    public void startAdvertising(ReadableMap readableMap) {
        onMethodNotImplamente(" startAdvertising(ReadableMap params) haven't been impl");
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTSystem
    @ReactMethod
    public final void startCompass(String str, Callback callback) {
        CompassSensor compassSensor = this.mCompassSensor;
        if (compassSensor != null) {
            compassSensor.unRegisterListener();
        }
        CompassSensor compassSensor2 = new CompassSensor(this.mSensorHelper, new CompassSensor.OnCompassChangeListener() { // from class: kye
            @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.sensor.CompassSensor.OnCompassChangeListener
            public final void onCompassChanged(double d) {
                this.f24420a.lambda$startCompass$0(d);
            }
        });
        this.mCompassSensor = compassSensor2;
        compassSensor2.registerListener(str);
        callback.invoke(Boolean.TRUE, RnCallbackMapUtil.getCommonSuccessMap(0, null, "success"));
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTSystem
    @ReactMethod
    public final void startGyroscope(String str, Callback callback) {
        Sensor sensor = this.mGyrosopeSensor;
        if (sensor != null) {
            this.mSensorHelper.unRegisterSensorEventListener(sensor);
        }
        this.mGyrosopeSensor = this.mSensorHelper.registerSensorEventListener(4, new SensorEventListener() { // from class: com.xiaomi.smarthome.framework.plugin.rn.nativemodule.MIOTSystemModuleCore.2
            @Override // android.hardware.SensorEventListener
            public void onAccuracyChanged(Sensor sensor2, int i) {
            }

            @Override // android.hardware.SensorEventListener
            public void onSensorChanged(SensorEvent sensorEvent) {
                MIOTSystemModuleCore.this.getEventProvider().sendGyroscopeEvent(sensorEvent);
            }
        }, str);
        callback.invoke(Boolean.TRUE, RnCallbackMapUtil.getCommonSuccessMap(0, null, "success"));
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTSystem
    @ReactMethod
    public final void startShakeListener(Callback callback) {
        MRnLog.d(TAG, "startShakeListener,");
        Sensor sensor = this.mShakeSensor;
        if (sensor != null) {
            this.mSensorHelper.unRegisterSensorEventListener(sensor);
        }
        this.mShakeSensor = this.mSensorHelper.registerSensorEventListener(1, new ShakeDetector(new ShakeDetector.ShakeListener() { // from class: iye
            @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.sensor.ShakeDetector.ShakeListener
            public final void onShake() {
                this.f22226a.lambda$startShakeListener$2();
            }
        }), SensorHelper.INTERVAL_UI);
        callback.invoke(Boolean.TRUE, RnCallbackMapUtil.getCommonSuccessMap(0, null, "success"));
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTSystem
    @ReactMethod
    public final void startVolume(ReadableMap readableMap, Callback callback) {
        MRnLog.d(TAG, "startVolume,");
        VolumeChangeObserver volumeChangeObserver = this.mVolumeChangeObserver;
        if (volumeChangeObserver != null) {
            volumeChangeObserver.unregisterVolumeReceiver();
        }
        VolumeChangeObserver volumeChangeObserver2 = new VolumeChangeObserver(getReactApplicationContext());
        this.mVolumeChangeObserver = volumeChangeObserver2;
        volumeChangeObserver2.setOnVolumeChangeListener(new VolumeChangeObserver.OnVolumeChangeListener() { // from class: jye
            @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.volume.VolumeChangeObserver.OnVolumeChangeListener
            public final void onVolumeChanged(double d) {
                this.f23245a.lambda$startVolume$1(d);
            }
        });
        this.mVolumeChangeObserver.registerVolumeReceiver();
        if (MIOTUtils.getBoolean(readableMap, "hideSystemSlider")) {
            getRnRuntimeProvider().setHideSystemSlider(true);
        }
        callback.invoke(Boolean.TRUE, RnCallbackMapUtil.getCommonSuccessMap(0, null, "success"));
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTSystem
    @ReactMethod
    public final void stopAccelerometer(Callback callback) {
        this.mSensorHelper.unRegisterSensorEventListener(this.mAccelerometerSensor);
        this.mAccelerometerSensor = null;
        callback.invoke(Boolean.TRUE, RnCallbackMapUtil.getCommonSuccessMap(0, null, "success"));
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTSystem
    @ReactMethod
    public final void stopCompass(Callback callback) {
        CompassSensor compassSensor = this.mCompassSensor;
        if (compassSensor != null) {
            compassSensor.unRegisterListener();
            this.mCompassSensor = null;
        }
        callback.invoke(Boolean.TRUE, RnCallbackMapUtil.getCommonSuccessMap(0, null, "success"));
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTSystem
    @ReactMethod
    public final void stopGyroscope(Callback callback) {
        this.mSensorHelper.unRegisterSensorEventListener(this.mGyrosopeSensor);
        this.mGyrosopeSensor = null;
        callback.invoke(Boolean.TRUE, RnCallbackMapUtil.getCommonSuccessMap(0, null, "success"));
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTSystem
    @ReactMethod
    public final void stopShakeListener(Callback callback) {
        MRnLog.d(TAG, "stopShakeListener,");
        this.mSensorHelper.unRegisterSensorEventListener(this.mShakeSensor);
        this.mShakeSensor = null;
        callback.invoke(Boolean.TRUE, RnCallbackMapUtil.getCommonSuccessMap(0, null, "success"));
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTSystem
    @ReactMethod
    public final void stopVolume(Callback callback) {
        MRnLog.d(TAG, "stopVolume,");
        VolumeChangeObserver volumeChangeObserver = this.mVolumeChangeObserver;
        if (volumeChangeObserver != null) {
            volumeChangeObserver.unregisterVolumeReceiver();
            this.mVolumeChangeObserver = null;
        }
        getRnRuntimeProvider().setHideSystemSlider(false);
        callback.invoke(Boolean.TRUE, RnCallbackMapUtil.getCommonSuccessMap(0, null, "success"));
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTSystem
    @ReactMethod
    public final void vibrateLong() {
        Vibrator vibrator = (Vibrator) getReactApplicationContext().getSystemService("vibrator");
        if (vibrator.hasVibrator()) {
            vibrator.vibrate(VIBRATOR_DURATION_LONG);
        } else {
            MRnLog.e(TAG, "vibrateLong,not hasVibrator");
        }
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTSystem
    @ReactMethod
    public final void vibrateShort() {
        Vibrator vibrator = (Vibrator) getReactApplicationContext().getSystemService("vibrator");
        if (vibrator.hasVibrator()) {
            vibrator.vibrate(15L);
        } else {
            MRnLog.e(TAG, "vibrateLong,not hasVibrator");
        }
    }

    @Override // com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces.IMIOTSystem
    @ReactMethod
    public void writeNFCData(ReadableMap readableMap, Callback callback) {
        onMethodNotImplamente(" writeNFCData(ReadableMap params, Callback callback) haven't been impl");
    }
}
