package com.xiaomi.hm.health.bt.profile.base;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattService;
import android.content.Context;
import com.huami.bluetooth.profile.channel.BleChannelFactory;
import com.huami.bluetooth.profile.channel.Channel;
import com.huami.bluetooth.profile.channel.ChannelCallbackHolder;
import com.huami.bluetooth.profile.channel.ChannelFactory;
import com.huami.bluetooth.profile.channel.impl.BlePeripheral;
import com.huami.bluetooth.profile.channel.model.BleChannelLink;
import com.huami.bluetooth.profile.channel.module.BaseModule;
import com.huami.bluetooth.profile.channel.module.BuiltInModule;
import com.huami.bluetooth.profile.channel.module.ChannelModuleFactory;
import com.huami.bluetooth.profile.channel.module.ChannelModuleProvider;
import com.huami.bluetooth.profile.channel.module.ChannelModuleStore;
import com.huami.bluetooth.profile.channel.module.ChannelModuleStoreOwner;
import com.huami.bluetooth.profile.channel.module.activity.RealtimeActivityModule;
import com.huami.bluetooth.profile.channel.module.activity.RealtimeStepApi;
import com.huami.bluetooth.profile.channel.module.annotation.ChannelModule;
import com.huami.bluetooth.profile.channel.module.battery.BatteryApi;
import com.huami.bluetooth.profile.channel.module.settings.SettingsApi;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.HMBleConfig;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.device.HMCallback;
import com.xiaomi.hm.health.bt.gatt.GattPeripheral;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import com.xiaomi.hm.health.bt.gatt.IGattCallback;
import com.xiaomi.hm.health.bt.profile.base.BaseProfile;
import com.xiaomi.hm.health.bt.profile.feature.Feature;
import com.xiaomi.hm.health.bt.profile.feature.HMFeatureProfile;
import com.xiaomi.hm.health.bt.profile.mili.IMiLiProfile;
import java.nio.charset.Charset;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Objects;
import java.util.UUID;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@SuppressLint({"NewApi"})
public class BaseProfile extends GattPeripheral implements IBaseProfile, ChannelModuleStoreOwner, BatteryApi, RealtimeStepApi {
    public static final String TAG = "BaseProfile";
    private BluetoothGattCharacteristic O;
    private BluetoothGattCharacteristic P;
    private BluetoothGattCharacteristic Q;
    private BluetoothGattCharacteristic R;
    private BluetoothGattCharacteristic S;
    private BluetoothGattCharacteristic T;
    private BluetoothGattCharacteristic U;
    private final ChannelApiDecorate V;
    public BleChannelLink bleChannelLink;
    public BluetoothGattCharacteristic mCharacterTemperature;
    public BluetoothGattCharacteristic m_CharBattery;
    public BluetoothGattCharacteristic m_CharRealtimeSteps;
    public SettingsApi settingsApi;

    public BaseProfile(Context context, BluetoothDevice device, IGattCallback.IConnectionStateChangeCallback callback) {
        super(context, device, callback);
        this.m_CharRealtimeSteps = null;
        this.m_CharBattery = null;
        this.mCharacterTemperature = null;
        this.O = null;
        this.P = null;
        this.Q = null;
        this.R = null;
        this.S = null;
        this.T = null;
        this.U = null;
        this.settingsApi = null;
        this.V = new ChannelApiDecorate(null);
        this.bleChannelLink = new BleChannelLink(new BlePeripheral(this), getDevice().getAddress());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String m0() {
        return "创建ble channel失败";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void n0(IHMBatteryInfoCallback iHMBatteryInfoCallback, byte[] bArr) {
        iHMBatteryInfoCallback.onBatteryChanged(parseBatteryInfo(bArr));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void o0(IRealtimeStepCallback iRealtimeStepCallback, byte[] bArr) {
        RealtimeStep realtimeStep = parseRealtimeStep(bArr);
        if (realtimeStep != null) {
            iRealtimeStepCallback.onStepChanged(realtimeStep);
            return;
        }
        Debug.fi(TAG, "m_CharRealtimeSteps notify wrong value:" + GattUtils.bytesToHexString(bArr));
    }

    public boolean checkDevicePnpId() {
        if (this.S != null) {
            return true;
        }
        Debug.fi(TAG, "getGeneralDeviceInfo return as Characteristics pnpId wrong!!!");
        return false;
    }

    public boolean checkDeviceSoftwareVersionAndSystemIdAndSN() {
        if (this.O != null && this.R != null && this.Q != null) {
            return true;
        }
        Debug.fi(TAG, "getGeneralDeviceInfo return as Characteristics  software or systemId or sn wrong!!!");
        return false;
    }

    @Override // com.xiaomi.hm.health.bt.gatt.GattPeripheral, com.xiaomi.hm.health.bt.gatt.a0, com.xiaomi.hm.health.bt.gatt.IGattCallback
    public void destroy() {
        super.destroy();
        l0();
    }

    public byte[] filterZero(byte[] in) {
        if (in == null || in.length == 0) {
            return in;
        }
        int length = in.length;
        for (int length2 = in.length - 1; length2 >= 0 && in[length2] == 0; length2--) {
            length--;
        }
        if (length < 1) {
            return in;
        }
        byte[] bArr = new byte[length];
        System.arraycopy(in, 0, bArr, 0, length);
        return bArr;
    }

    @Nullable
    public DeviceInfo getBaseDeviceInfo() {
        Debug.fi(TAG, "getBaseDeviceInfo do nothing");
        return null;
    }

    @Override // com.huami.bluetooth.profile.channel.module.battery.BatteryApi
    public BatteryInfo getBatteryInfo() {
        return null;
    }

    @Nullable
    public <T extends BaseModule> T getChannelModule(Class<T> cls) {
        return (T) ChannelModuleProvider.INSTANCE.of(this).get(cls);
    }

    @Override // com.huami.bluetooth.profile.channel.module.ChannelModuleStoreOwner
    @Nullable
    public ChannelModuleFactory getChannelModuleFactory() {
        if (this.V == null) {
            return null;
        }
        return new ChannelModuleFactory(this.V);
    }

    @Override // com.huami.bluetooth.profile.channel.module.ChannelModuleStoreOwner
    @NotNull
    public ChannelModuleStore getChannelModuleStore() {
        return ChannelModuleStore.INSTANCE.getModuleStore(getDevice().getAddress());
    }

    public Calendar getDateTime() {
        BluetoothGattCharacteristic bluetoothGattCharacteristic = this.U;
        if (bluetoothGattCharacteristic == null) {
            Debug.fi(TAG, "getDateTime m_CharDateTime is null!!!");
            return null;
        }
        byte[] bArr = read(bluetoothGattCharacteristic);
        if (bArr == null || bArr.length != 11) {
            return null;
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(1, ((bArr[1] & 255) << 8) | (bArr[0] & 255));
        gregorianCalendar.set(2, bArr[2] - 1);
        gregorianCalendar.set(5, bArr[3]);
        gregorianCalendar.set(11, bArr[4]);
        gregorianCalendar.set(12, bArr[5]);
        gregorianCalendar.set(13, bArr[6]);
        gregorianCalendar.setTimeZone(ProfileUtils.getTimezone(bArr[10]));
        return gregorianCalendar;
    }

    public DeviceInfo getDeviceInfo() {
        GeneralDeviceInfo generalDeviceInfo = getGeneralDeviceInfo();
        return generalDeviceInfo != null ? new DeviceInfo(generalDeviceInfo, isThirdPartDevice()) : getSpecialDeviceInfo();
    }

    public GeneralDeviceInfo getGeneralDeviceInfo() {
        Debug.i(TAG, "getGeneralDeviceInfo");
        if (!checkDeviceSoftwareVersionAndSystemIdAndSN() || !checkDevicePnpId()) {
            return null;
        }
        GeneralDeviceInfo generalDeviceInfo = new GeneralDeviceInfo();
        setSoftwareRevision(generalDeviceInfo);
        setSystemId(generalDeviceInfo);
        setSerialNumber(generalDeviceInfo);
        setPnpInfo(generalDeviceInfo);
        setHardwareRevision(generalDeviceInfo);
        if (HMFeatureProfile.isSupport(this)) {
            Feature feature = HMFeatureProfile.getFeature(this);
            if (feature == null) {
                return null;
            }
            generalDeviceInfo.setDeviceFeature(feature);
            feature.hasSw(19);
        } else {
            generalDeviceInfo.setDeviceFeature(new Feature());
        }
        Debug.fi(TAG, "general device info:" + generalDeviceInfo);
        return generalDeviceInfo;
    }

    @Override // com.huami.bluetooth.profile.channel.module.activity.RealtimeStepApi
    public RealtimeStep getRealtimeStep() {
        return parseRealtimeStep(read(this.m_CharRealtimeSteps));
    }

    public SettingsApi getSettingsApi() {
        return this.settingsApi;
    }

    public DeviceInfo getSpecialDeviceInfo() {
        BluetoothGattCharacteristic bluetoothGattCharacteristic = this.T;
        if (bluetoothGattCharacteristic == null) {
            return null;
        }
        byte[] bArr = read(bluetoothGattCharacteristic);
        Debug.assertNotNull(bArr);
        if (bArr == null || !(bArr.length == 16 || bArr.length == 20)) {
            return null;
        }
        Debug.i(TAG, "device info ret len:" + bArr.length);
        int iCrc8 = GattUtils.crc8(new byte[]{bArr[0], bArr[1], bArr[2], bArr[3], bArr[4], bArr[5], bArr[6]}) ^ (bArr[3] & 255);
        Debug.assertTrue(iCrc8 == (bArr[7] & 255));
        if (iCrc8 != (bArr[7] & 255)) {
            Debug.i(TAG, "DeviceInfo CRC verification failed");
            return null;
        }
        byte[] bArr2 = new byte[8];
        System.arraycopy(bArr, 0, bArr2, 0, 8);
        int iBytesToInt = GattUtils.bytesToInt(bArr, 8);
        int iBytesToInt2 = GattUtils.bytesToInt(bArr, 12);
        return bArr.length == 20 ? new DeviceInfo(bArr2, iBytesToInt, iBytesToInt2, GattUtils.bytesToInt(bArr, 16), isThirdPartDevice()) : new DeviceInfo(bArr2, iBytesToInt, iBytesToInt2, isThirdPartDevice());
    }

    public boolean initChannel() {
        this.bleChannelLink = new BleChannelLink(new BlePeripheral(this), getDevice().getAddress());
        if (!isSupportChannel()) {
            return false;
        }
        Channel channelCreate = BleChannelFactory.INSTANCE.create(this.bleChannelLink);
        if (channelCreate == null) {
            HMLog.error(TAG, new Function0() { // from class: cr
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return BaseProfile.m0();
                }
            });
            return false;
        }
        this.V.decorate(ChannelFactory.INSTANCE.createChannel(channelCreate, new ChannelCallbackHolder(), HMBleConfig.APP_ID));
        getChannelModuleStore().updateChannel(this.V);
        return true;
    }

    @Override // com.xiaomi.hm.health.bt.gatt.GattPeripheral
    public boolean initCharacteristics() {
        BluetoothGattService service = getService(IBaseProfile.UUID_SERVICE_DEVICE_SERVICE);
        if (service != null) {
            BluetoothGattCharacteristic characteristic = service.getCharacteristic(IBaseProfile.UUID_CHARACTERISTIC_DEVICE_SOFTWARE_REVISION);
            this.O = characteristic;
            Debug.assertNotNull(characteristic);
            BluetoothGattCharacteristic characteristic2 = service.getCharacteristic(IBaseProfile.UUID_CHARACTERISTIC_DEVICE_HARDWARE_REVISION);
            this.P = characteristic2;
            Debug.assertNotNull(characteristic2);
            BluetoothGattCharacteristic characteristic3 = service.getCharacteristic(IBaseProfile.UUID_CHARACTERISTIC_DEVICE_SYSTEM_ID);
            this.R = characteristic3;
            Debug.assertNotNull(characteristic3);
            BluetoothGattCharacteristic characteristic4 = service.getCharacteristic(IBaseProfile.UUID_CHARACTERISTIC_DEVICE_SERIAL_NUMBER);
            this.Q = characteristic4;
            Debug.assertNotNull(characteristic4);
            BluetoothGattCharacteristic characteristic5 = service.getCharacteristic(IBaseProfile.UUID_CHARACTERISTIC_DEVICE_PNP_ID);
            this.S = characteristic5;
            Debug.assertNotNull(characteristic5);
        }
        BluetoothGattService service2 = getService(IBaseProfile.UUID_SERVICE_MILI_SERVICE);
        if (service2 == null) {
            return true;
        }
        this.T = service2.getCharacteristic(IMiLiProfile.UUID_CHARACTERISTIC_DEVICE_INFO);
        UUID uuid = IBaseProfile.UUID_CHARACTERISTIC_DATE_TIME;
        BluetoothGattCharacteristic characteristic6 = service2.getCharacteristic(uuid);
        this.U = characteristic6;
        if (characteristic6 != null) {
            return true;
        }
        Debug.fi(TAG, uuid + " is null!");
        return true;
    }

    public boolean isBaseOnHuamiOS() {
        return this.bleChannelLink.isBaseOnHuamiOS();
    }

    public boolean isSupportChannel() {
        return this.bleChannelLink.isSupportChannel();
    }

    public boolean isSupportWeixin() {
        BluetoothGattService service = getService(HMBaseProfile.UUID_SERVICE_WEIXIN_SERVICE);
        Debug.i(TAG, "isSupportWeixin:" + service);
        return service != null;
    }

    public boolean isThirdPartDevice() {
        return false;
    }

    public void l0() {
        this.V.unDecorate();
    }

    public BatteryInfo parseBatteryInfo(byte[] value) {
        return null;
    }

    public RealtimeStep parseRealtimeStep(byte[] value) {
        return null;
    }

    public byte[] readTemperature() {
        return read(this.mCharacterTemperature);
    }

    @Override // com.huami.bluetooth.profile.channel.module.battery.BatteryApi
    public boolean registerBatteryInfoCallback(@NotNull final IHMBatteryInfoCallback callback) {
        BluetoothGattCharacteristic bluetoothGattCharacteristic = this.m_CharBattery;
        return bluetoothGattCharacteristic != null && registerNotification(bluetoothGattCharacteristic, new IGattCallback.INotifyCallback() { // from class: ar
            @Override // com.xiaomi.hm.health.bt.gatt.IGattCallback.INotifyCallback
            public final void notify(byte[] bArr) {
                this.a.n0(callback, bArr);
            }
        });
    }

    @Override // com.huami.bluetooth.profile.channel.module.activity.RealtimeStepApi
    public boolean registerRealtimeStepCallback(final IRealtimeStepCallback callback) {
        boolean zRegisterNotification;
        RealtimeStep realtimeStep = getRealtimeStep();
        if (realtimeStep != null) {
            callback.onStepChanged(realtimeStep);
        } else {
            Debug.fi(TAG, "getRealtimeStep return null!!!");
        }
        synchronized (this.m_CharRealtimeSteps) {
            zRegisterNotification = registerNotification(this.m_CharRealtimeSteps, new IGattCallback.INotifyCallback() { // from class: br
                @Override // com.xiaomi.hm.health.bt.gatt.IGattCallback.INotifyCallback
                public final void notify(byte[] bArr) {
                    this.a.o0(callback, bArr);
                }
            });
        }
        return zRegisterNotification;
    }

    public boolean registerTemperatureCallback(final HMCallback<byte[]> callback) {
        BluetoothGattCharacteristic bluetoothGattCharacteristic = this.mCharacterTemperature;
        if (bluetoothGattCharacteristic == null) {
            return false;
        }
        Objects.requireNonNull(callback);
        return registerNotification(bluetoothGattCharacteristic, new IGattCallback.INotifyCallback() { // from class: zq
            @Override // com.xiaomi.hm.health.bt.gatt.IGattCallback.INotifyCallback
            public final void notify(byte[] bArr) {
                callback.onData(bArr);
            }
        });
    }

    public boolean setDateTime(Calendar cal) {
        if (this.U == null) {
            Debug.fi(TAG, "setDateTime m_CharDateTime is null!!!");
            return false;
        }
        byte[] bArrBytesOfTime = ProfileUtils.bytesOfTime(cal);
        Debug.i(TAG, "cmd:" + GattUtils.bytesToHexString(bArrBytesOfTime));
        return write(this.U, bArrBytesOfTime);
    }

    public void setHardwareRevision(GeneralDeviceInfo info) {
        byte[] bArrFilterZero;
        BluetoothGattCharacteristic bluetoothGattCharacteristic = this.P;
        if (bluetoothGattCharacteristic == null || (bArrFilterZero = filterZero(read(bluetoothGattCharacteristic))) == null || bArrFilterZero.length <= 0) {
            return;
        }
        info.hardwareRevision = new String(bArrFilterZero, Charset.forName("UTF-8"));
    }

    public void setPnpInfo(GeneralDeviceInfo info) {
        byte[] bArr;
        BluetoothGattCharacteristic bluetoothGattCharacteristic = this.S;
        if (bluetoothGattCharacteristic == null || (bArr = read(bluetoothGattCharacteristic)) == null || bArr.length != 7) {
            return;
        }
        Debug.i(TAG, "pnp id:" + GattUtils.bytesToHexString(bArr));
        PnP pnP = new PnP();
        pnP.vendorSource = bArr[0] & 255;
        pnP.vendorId = ((bArr[2] & 255) << 8) | (bArr[1] & 255);
        pnP.productId = ((bArr[4] & 255) << 8) | (bArr[3] & 255);
        pnP.productVersion = (bArr[5] & 255) | ((bArr[6] & 255) << 8);
        info.pnp = pnP;
    }

    public void setSerialNumber(GeneralDeviceInfo info) {
        BluetoothGattCharacteristic bluetoothGattCharacteristic = this.Q;
        if (bluetoothGattCharacteristic != null) {
            byte[] bArrFilterZero = filterZero(read(bluetoothGattCharacteristic));
            Debug.i(TAG, "serialNumber:" + GattUtils.bytesToHexString(bArrFilterZero));
            if (bArrFilterZero == null || bArrFilterZero.length <= 0) {
                return;
            }
            info.serialNumber = new String(bArrFilterZero, Charset.forName("UTF-8"));
        }
    }

    public void setSettingsApi(SettingsApi settingsApi) {
        this.settingsApi = settingsApi;
    }

    public void setSoftwareRevision(GeneralDeviceInfo info) {
        BluetoothGattCharacteristic bluetoothGattCharacteristic = this.O;
        if (bluetoothGattCharacteristic != null) {
            byte[] bArrFilterZero = filterZero(read(bluetoothGattCharacteristic));
            Debug.i(TAG, "revision:" + GattUtils.bytesToHexString(bArrFilterZero));
            if (bArrFilterZero == null || bArrFilterZero.length <= 0) {
                return;
            }
            info.firmwareRevision = new String(bArrFilterZero, Charset.forName("UTF-8"));
        }
    }

    public void setSystemId(GeneralDeviceInfo info) {
        byte[] bArr;
        BluetoothGattCharacteristic bluetoothGattCharacteristic = this.R;
        if (bluetoothGattCharacteristic == null || (bArr = read(bluetoothGattCharacteristic)) == null || bArr.length != 8) {
            return;
        }
        info.deviceID = String.format("%02X%02X%02X%02X%02X%02X%02X%02X", Byte.valueOf(bArr[0]), Byte.valueOf(bArr[1]), Byte.valueOf(bArr[2]), Byte.valueOf(bArr[3]), Byte.valueOf(bArr[4]), Byte.valueOf(bArr[5]), Byte.valueOf(bArr[6]), Byte.valueOf(bArr[7]));
        info.bytesOfDeviceID = bArr;
    }

    public boolean startListenerRealtimeStep() {
        RealtimeActivityModule realtimeActivityModule = (RealtimeActivityModule) getChannelModule(RealtimeActivityModule.class);
        if (realtimeActivityModule == null) {
            return false;
        }
        return realtimeActivityModule.startNotify();
    }

    @Override // com.huami.bluetooth.profile.channel.module.activity.RealtimeStepApi
    public boolean startNotify() {
        return false;
    }

    public boolean stopListenerRealtimeStep() {
        RealtimeActivityModule realtimeActivityModule = (RealtimeActivityModule) getChannelModule(RealtimeActivityModule.class);
        if (realtimeActivityModule == null) {
            return false;
        }
        return realtimeActivityModule.stopNotify();
    }

    @Override // com.huami.bluetooth.profile.channel.module.activity.RealtimeStepApi
    public boolean stopNotify() {
        return false;
    }

    @Override // com.huami.bluetooth.profile.channel.module.ChannelModuleStoreOwner
    public boolean supportModule(int moduleId) {
        ChannelApiDecorate channelApiDecorate = this.V;
        if (channelApiDecorate == null || channelApiDecorate.getVersion().getVersionCode() != 2) {
            return false;
        }
        BuiltInModule builtInModule = (BuiltInModule) getChannelModule(BuiltInModule.class);
        if (builtInModule == null) {
            Debug.fi("BuiltInModule", "BuiltInModule is null while check " + moduleId + " if supported by device");
            return false;
        }
        boolean zSupportModule = builtInModule.supportModule(moduleId);
        Debug.fi("BuiltInModule", "Is " + moduleId + " support? " + zSupportModule);
        return zSupportModule;
    }

    @Override // com.huami.bluetooth.profile.channel.module.battery.BatteryApi
    public void unregisterBatteryListener(@NotNull IHMBatteryInfoCallback listener) {
    }

    @Override // com.huami.bluetooth.profile.channel.module.activity.RealtimeStepApi
    public void unregisterRealtimeStepCallback(final IRealtimeStepCallback callback) {
        unregisterRealtimeStepCallback();
    }

    public boolean unregisterTemperature() {
        BluetoothGattCharacteristic bluetoothGattCharacteristic = this.mCharacterTemperature;
        if (bluetoothGattCharacteristic == null) {
            return false;
        }
        return unregisterNotification(bluetoothGattCharacteristic);
    }

    public void updateExternalDeviceInfo(@Nullable DeviceInfo realInfo) {
        Debug.fi(TAG, "updateExternalDeviceInfo do nothing");
    }

    public boolean writeTemperature(byte[] data) {
        return write(this.mCharacterTemperature, data);
    }

    public boolean unregisterRealtimeStepCallback() {
        boolean zUnregisterNotification;
        BluetoothGattCharacteristic bluetoothGattCharacteristic = this.m_CharRealtimeSteps;
        if (bluetoothGattCharacteristic == null) {
            return false;
        }
        synchronized (bluetoothGattCharacteristic) {
            zUnregisterNotification = unregisterNotification(this.m_CharRealtimeSteps);
        }
        return zUnregisterNotification;
    }

    @Override // com.huami.bluetooth.profile.channel.module.ChannelModuleStoreOwner
    public <T extends BaseModule> boolean supportModule(@NotNull Class<T> clazz) {
        try {
            ChannelModule channelModule = (ChannelModule) clazz.getAnnotation(ChannelModule.class);
            if (channelModule == null) {
                Debug.fi(TAG, clazz.getCanonicalName() + " has no ChannelModule annotation");
                return false;
            }
            return supportModule(channelModule.id());
        } catch (Exception e) {
            Debug.fi(TAG, "Check if support module exception:" + e.toString());
            return false;
        }
    }
}
