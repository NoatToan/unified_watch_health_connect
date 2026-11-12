package com.xiaomi.hm.health.devicex.manage.impl.core.manager;

import android.bluetooth.BluetoothDevice;
import android.content.Context;
import com.huami.bluetooth.business.IScaleMeasureApi;
import com.huami.bluetooth.business.ScaleMeasureOwner;
import com.huami.bluetooth.device.HeadsetDevice;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMBoltClassicDevice;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMMiLiDevice;
import com.xiaomi.hm.health.bt.device.HMMiLiProDevice;
import com.xiaomi.hm.health.bt.device.HMWeightDevice;
import com.xiaomi.hm.health.bt.device.HmEarbudDevice;
import com.xiaomi.hm.health.bt.device.HmVirtualDevice;
import com.xiaomi.hm.health.bt.device.MozartDevice;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import com.xiaomi.hm.health.bt.ife.IHMConnectionCallback;
import com.xiaomi.hm.health.bt.profile.auth.AuthInfo;
import com.xiaomi.hm.health.bt.profile.sport.IHMSportListener;
import com.xiaomi.hm.health.bt.profile.sport.SportCommand;
import com.xiaomi.hm.health.databases.model.Device;
import com.xiaomi.hm.health.device.HMDeviceConfig;
import com.xiaomi.hm.health.device.bolt.FtmsErrorHelper;
import com.xiaomi.hm.health.device.callback.MyAuthCallback;
import com.xiaomi.hm.health.device.callback.MyBatteryChangedCallback;
import com.xiaomi.hm.health.device.callback.MyLFEventCallback;
import com.xiaomi.hm.health.device.callback.MyRealtimeStepCallback;
import com.xiaomi.hm.health.device.callback.MySpeechEventCallback;
import com.xiaomi.hm.health.device.callback.MyVibrateNotifyCallback;
import com.xiaomi.hm.health.device.callback.MyWeightValueCallback;
import com.xiaomi.hm.health.device.deviceconfig.Feature;
import com.xiaomi.hm.health.device.deviceconfig.configs.ConfigHelperKt;
import com.xiaomi.hm.health.device.event.TreadmillSportEvent;
import com.xiaomi.hm.health.devicex.manage.api.core.manager.DeviceConnectManger;
import com.xiaomi.hm.health.devicex.manage.api.core.manager.UserInfoProvider;
import com.xiaomi.hm.health.devicex.manage.impl.core.manager.HMDeviceConnectManager;
import de.greenrobot.event.EventBus;
import java.lang.reflect.Constructor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
public class HMDeviceConnectManager implements DeviceConnectManger {
    private static final String d = "HMDeviceConnectManager";
    private Context a;
    private UserInfoProvider b;
    private IHMConnectionCallback c;

    public HMDeviceConnectManager(Context context, UserInfoProvider userInfoProvider, IHMConnectionCallback connectionCallback) {
        this.a = context;
        this.b = userInfoProvider;
        this.c = connectionCallback;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void c(SportCommand sportCommand) {
        HMLog.i(d, "sport cmd: " + sportCommand, new Object[0]);
        EventBus.getDefault().postSticky(new TreadmillSportEvent(sportCommand));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void d(HeadsetDevice.HeadsetDeviceState headsetDeviceState) {
        EventBus.getDefault().post(headsetDeviceState);
    }

    @Override // com.xiaomi.hm.health.devicex.manage.api.core.manager.DeviceConnectManger
    @Nullable
    public HMBaseDevice createDevice(@NotNull Device device, boolean isPair) {
        HMBaseDevice hMBaseDeviceNewInstance;
        Context context = this.a;
        if (context == null || this.b == null) {
            return null;
        }
        if (!GattUtils.isSupportBle(context)) {
            HMLog.i(d, "return as not support ble!!!", new Object[0]);
            return null;
        }
        String device_address = device.getDevice_address();
        HMDeviceSource hMDeviceSourceFromValue = HMDeviceSource.fromValue(device.getDevice_source().intValue());
        String authkey = device.getAuthkey();
        HMLog.i(d, "address:" + device_address + ",source:" + hMDeviceSourceFromValue + ",authKey:" + authkey, new Object[0]);
        try {
            Class<? extends HMBaseDevice> deviceClass = ConfigHelperKt.getDeviceClass(hMDeviceSourceFromValue);
            if (deviceClass == null) {
                HMLog.i(d, "createBleDevice class is null", new Object[0]);
                return null;
            }
            Feature feature = Feature.BOLT_SERIES;
            if (ConfigHelperKt.hasFeature(hMDeviceSourceFromValue, feature)) {
                Constructor<? extends HMBaseDevice> declaredConstructor = deviceClass.getDeclaredConstructor(Context.class, BluetoothDevice.class);
                declaredConstructor.setAccessible(true);
                hMBaseDeviceNewInstance = declaredConstructor.newInstance(this.a, GattUtils.getRemoteDevice(device_address));
            } else if (ConfigHelperKt.hasFeature(Feature.HEADSET_MOZART_SOURCE_S, hMDeviceSourceFromValue)) {
                Constructor<? extends HMBaseDevice> declaredConstructor2 = deviceClass.getDeclaredConstructor(BluetoothDevice.class);
                declaredConstructor2.setAccessible(true);
                hMBaseDeviceNewInstance = declaredConstructor2.newInstance(GattUtils.getRemoteDevice(device_address));
            } else if (ConfigHelperKt.hasFeature(Feature.IS_VIRTUAL_DEVICE, hMDeviceSourceFromValue)) {
                hMBaseDeviceNewInstance = new HmVirtualDevice(this.a, hMDeviceSourceFromValue, device_address);
            } else {
                Constructor<? extends HMBaseDevice> declaredConstructor3 = deviceClass.getDeclaredConstructor(Context.class, String.class);
                declaredConstructor3.setAccessible(true);
                hMBaseDeviceNewInstance = declaredConstructor3.newInstance(this.a, device_address);
            }
            if (ConfigHelperKt.hasFeature(Feature.SUPPORT_OLD_AUTH_SOURCES, hMDeviceSourceFromValue)) {
                hMBaseDeviceNewInstance.setAuthInfo(new AuthInfo(this.b.getUserInfo(authkey, device.getUserId())));
            } else {
                AuthInfo authInfo = new AuthInfo(authkey, isPair);
                if (ConfigHelperKt.hasFeature(hMDeviceSourceFromValue, feature) || hMDeviceSourceFromValue == HMDeviceSource.WEIGHT_AMAZFIT_SCALE || hMDeviceSourceFromValue == HMDeviceSource.OTHER_HAYDN) {
                    authInfo.setUserInfo(this.b.getUserInfo(authkey, device.getUserId()));
                }
                hMBaseDeviceNewInstance.setAuthInfo(authInfo);
            }
            initBleDevice(hMBaseDeviceNewInstance, hMDeviceSourceFromValue, this.c);
            hMBaseDeviceNewInstance.create(false);
            return hMBaseDeviceNewInstance;
        } catch (Exception e) {
            HMLog.i(d, "createBleDevice exception:" + e.getMessage(), new Object[0]);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.hm.health.devicex.manage.api.core.manager.DeviceConnectManger
    public void initBleDevice(HMBaseDevice bleDevice, @NotNull final HMDeviceSource source, @NotNull final IHMConnectionCallback connectionCallback) {
        bleDevice.setAuthCallback(new MyAuthCallback(source));
        bleDevice.setConnectionCallback(connectionCallback);
        bleDevice.setBatteryChangedCallback(new MyBatteryChangedCallback(source.getType()));
        if (bleDevice instanceof HMBoltClassicDevice) {
            HMBoltClassicDevice hMBoltClassicDevice = (HMBoltClassicDevice) bleDevice;
            hMBoltClassicDevice.setSportListener(new IHMSportListener() { // from class: es2
                @Override // com.xiaomi.hm.health.bt.profile.sport.IHMSportListener
                public final void onSportCommand(SportCommand sportCommand) {
                    HMDeviceConnectManager.c(sportCommand);
                }
            });
            hMBoltClassicDevice.setFTMSListener(FtmsErrorHelper.INSTANCE);
        }
        bleDevice.setAutoReconnect(!ConfigHelperKt.hasFeature(Feature.NOT_SUPPORT_AUTO_CONNECT_SOURCES, source));
        if (HMDeviceConfig.isSupportRtStep(source)) {
            bleDevice.setRealtimeStepCallback(new MyRealtimeStepCallback(source.getType()));
        }
        if (HMDeviceConfig.isSuppotVibrateNotify(source) && (bleDevice instanceof HMMiLiDevice)) {
            ((HMMiLiDevice) bleDevice).setVibrateNotifyCallback(new MyVibrateNotifyCallback());
        }
        if (HMDeviceConfig.isSupportLFEvent(source)) {
            if (bleDevice instanceof HmEarbudDevice) {
                ((HmEarbudDevice) bleDevice).setLfCallback(new MyLFEventCallback());
            } else if (bleDevice instanceof MozartDevice) {
                ((MozartDevice) bleDevice).setLFCallback(new MyLFEventCallback());
            } else if (bleDevice instanceof HMMiLiProDevice) {
                ((HMMiLiProDevice) bleDevice).setLFEventCallback(new MyLFEventCallback());
            }
        }
        if (HMDeviceConfig.isSupportNewSpeech(source) && (bleDevice instanceof HMMiLiProDevice)) {
            ((HMMiLiProDevice) bleDevice).setSpeechEventCallback(new MySpeechEventCallback(source));
        }
        if (HMDeviceConfig.isWeightDevice(source)) {
            if (bleDevice instanceof ScaleMeasureOwner) {
                IScaleMeasureApi.INSTANCE.of((ScaleMeasureOwner) bleDevice).registerMeasureListener(new MyWeightValueCallback(source));
            } else if (bleDevice instanceof HMWeightDevice) {
                ((HMWeightDevice) bleDevice).setWeightDataCallback(new MyWeightValueCallback(source));
            }
        }
        if (bleDevice instanceof HeadsetDevice) {
            ((HeadsetDevice) bleDevice).registerStateListener(new HeadsetDevice.StateListener() { // from class: ds2
                @Override // com.huami.bluetooth.device.HeadsetDevice.StateListener
                public final void onStateChanged(HeadsetDevice.HeadsetDeviceState headsetDeviceState) {
                    HMDeviceConnectManager.d(headsetDeviceState);
                }
            });
        }
    }
}
