package com.xiaomi.smarthome.library.bluetooth.connect;

import android.annotation.TargetApi;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothGattService;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.xiaomi.fitness.devicesettings.huami.vibratemode.VibrateModeProgressBar;
import com.xiaomi.smarthome.cache.BleCacheManager;
import com.xiaomi.smarthome.frame.log.BluetoothMyLogger;
import com.xiaomi.smarthome.library.bluetooth.BluetoothConstants;
import com.xiaomi.smarthome.library.bluetooth.BluetoothContextManager;
import com.xiaomi.smarthome.library.bluetooth.Constants;
import com.xiaomi.smarthome.library.bluetooth.connect.listener.GattResponseListener;
import com.xiaomi.smarthome.library.bluetooth.connect.listener.ReadCharacterListener;
import com.xiaomi.smarthome.library.bluetooth.connect.listener.ReadRssiListener;
import com.xiaomi.smarthome.library.bluetooth.connect.listener.RequestMtuListener;
import com.xiaomi.smarthome.library.bluetooth.connect.listener.ServiceDiscoverListener;
import com.xiaomi.smarthome.library.bluetooth.connect.listener.WriteCharacterListener;
import com.xiaomi.smarthome.library.bluetooth.connect.listener.WriteDescriptorListener;
import com.xiaomi.smarthome.library.bluetooth.connect.response.BleResponse;
import com.xiaomi.smarthome.library.bluetooth.proxy.ProxyBulk;
import com.xiaomi.smarthome.library.bluetooth.proxy.ProxyInterceptor;
import com.xiaomi.smarthome.library.bluetooth.proxy.ProxyUtils;
import com.xiaomi.smarthome.library.bluetooth.utils.BluetoothLog;
import com.xiaomi.smarthome.library.bluetooth.utils.BluetoothPermissionUtil;
import com.xiaomi.smarthome.library.bluetooth.utils.BluetoothUtils;
import com.xiaomi.smarthome.library.common.util.ByteUtils;
import com.xiaomi.smarthome.library.common.util.Version;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
@TargetApi(18)
public class BleConnectWorker implements Handler.Callback, IBleConnectWorker, IBluetoothGattResponse, ProxyInterceptor, RuntimeChecker {
    private static final boolean DEBUG = !BluetoothContextManager.isReleaseBuild();
    private static final int MSG_DISCONNECT_TIMEOUT = 289;
    private static final int MSG_GATT_RESPONSE = 288;
    private BleGattProfile mBleGattProfile;
    private BluetoothDevice mBluetoothDevice;
    private BluetoothGatt mBluetoothGatt;
    private IBluetoothGattResponse mBluetoothGattResponse;
    private volatile int mConnectStatus;
    private Map<UUID, Map<UUID, BluetoothGattCharacteristic>> mDeviceProfile;
    private GattResponseListener mGattResponseListener;
    private final Object mLock = new Object();
    private RuntimeChecker mRuntimeChecker;
    private Handler mWorkerHandler;

    public BleConnectWorker(String str, RuntimeChecker runtimeChecker) {
        BluetoothAdapter bluetoothAdapter = BluetoothUtils.getBluetoothAdapter();
        if (bluetoothAdapter == null) {
            throw new IllegalStateException("ble adapter null");
        }
        this.mBluetoothDevice = bluetoothAdapter.getRemoteDevice(str);
        this.mRuntimeChecker = runtimeChecker;
        this.mWorkerHandler = new Handler(Looper.myLooper(), this);
        this.mDeviceProfile = new HashMap();
        this.mBluetoothGattResponse = (IBluetoothGattResponse) ProxyUtils.getProxy(this, IBluetoothGattResponse.class, this);
    }

    private void broadcastCharacterChanged(UUID uuid, UUID uuid2, byte[] bArr) {
        Intent intent = new Intent("com.xiaomi.smarthome.bluetooth.character_changed");
        intent.putExtra("key_device_address", this.mBluetoothDevice.getAddress());
        intent.putExtra("key_service_uuid", uuid);
        intent.putExtra("key_character_uuid", uuid2);
        intent.putExtra("key_character_value", bArr);
        BluetoothUtils.sendBroadcast(intent);
    }

    private void broadcastCharacterWrite(UUID uuid, UUID uuid2, byte[] bArr, int i) {
        Intent intent = new Intent("com.xiaomi.smarthome.bluetooth.character_write");
        intent.putExtra("key_device_address", this.mBluetoothDevice.getAddress());
        intent.putExtra("key_service_uuid", uuid);
        intent.putExtra("key_character_uuid", uuid2);
        intent.putExtra("key_character_value", bArr);
        intent.putExtra("key_character_write_status", i);
        BluetoothUtils.sendBroadcast(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void broadcastConnectStatus(int i) {
        if (DEBUG) {
            BluetoothLog.v(String.format("broadcastConnectStatus status = %s", Integer.valueOf(i)));
        }
        if (i == 32) {
            BleCacheManager.getInstance().getBleDeviceState(this.mBluetoothDevice.getAddress()).notifyDisconnect();
        }
        Intent intent = new Intent("com.xiaomi.smarthome.bluetooth.connect_status_changed");
        intent.putExtra("key_device_address", this.mBluetoothDevice.getAddress());
        intent.putExtra("key_connect_status", i);
        BluetoothUtils.sendBroadcast(intent);
    }

    private boolean checkPermission() {
        return BluetoothPermissionUtil.checkBluetoothPermission(BluetoothContextManager.getContext());
    }

    private String getAddress() {
        return this.mBluetoothDevice.getAddress();
    }

    private BluetoothGattCharacteristic getCharacter(UUID uuid, UUID uuid2) {
        BluetoothGatt bluetoothGatt;
        BluetoothGattService service;
        Map<UUID, BluetoothGattCharacteristic> map;
        BluetoothGattCharacteristic bluetoothGattCharacteristic = (uuid == null || uuid2 == null || (map = this.mDeviceProfile.get(uuid)) == null) ? null : map.get(uuid2);
        return (bluetoothGattCharacteristic != null || (bluetoothGatt = this.mBluetoothGatt) == null || (service = bluetoothGatt.getService(uuid)) == null) ? bluetoothGattCharacteristic : service.getCharacteristic(uuid2);
    }

    private boolean isCharacteristicIndicatable(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        return (bluetoothGattCharacteristic == null || (bluetoothGattCharacteristic.getProperties() & 32) == 0) ? false : true;
    }

    private boolean isCharacteristicNoRspWritable(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        return (bluetoothGattCharacteristic == null || (bluetoothGattCharacteristic.getProperties() & 4) == 0) ? false : true;
    }

    private boolean isCharacteristicNotifyable(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        return (bluetoothGattCharacteristic == null || (bluetoothGattCharacteristic.getProperties() & 16) == 0) ? false : true;
    }

    private boolean isCharacteristicReadable(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        return (bluetoothGattCharacteristic == null || (bluetoothGattCharacteristic.getProperties() & 2) == 0) ? false : true;
    }

    private boolean isCharacteristicWritable(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        return true;
    }

    private void refreshServiceProfile() {
        boolean z = DEBUG;
        if (z) {
            BluetoothLog.v(String.format("refreshServiceProfile for %s", this.mBluetoothDevice.getAddress()));
        }
        BluetoothGatt bluetoothGatt = this.mBluetoothGatt;
        if (bluetoothGatt == null) {
            if (z) {
                BluetoothLog.e(String.format("ble gatt null", new Object[0]));
                return;
            }
            return;
        }
        List<BluetoothGattService> services2 = bluetoothGatt.getServices();
        HashMap map = new HashMap();
        for (BluetoothGattService bluetoothGattService : services2) {
            UUID uuid = bluetoothGattService.getUuid();
            Map map2 = (Map) map.get(uuid);
            if (map2 == null) {
                if (DEBUG) {
                    BluetoothLog.v("Service: " + uuid);
                }
                map2 = new HashMap();
                map.put(bluetoothGattService.getUuid(), map2);
            }
            for (BluetoothGattCharacteristic bluetoothGattCharacteristic : bluetoothGattService.getCharacteristics()) {
                UUID uuid2 = bluetoothGattCharacteristic.getUuid();
                if (DEBUG) {
                    BluetoothLog.v("character: uuid = " + uuid2);
                }
                map2.put(bluetoothGattCharacteristic.getUuid(), bluetoothGattCharacteristic);
            }
        }
        this.mDeviceProfile.clear();
        this.mDeviceProfile.putAll(map);
        this.mBleGattProfile = new BleGattProfile(this.mDeviceProfile);
    }

    private void releaseAfterDisconnected() {
        boolean z = DEBUG;
        if (z) {
            BluetoothLog.v(String.format("releaseAfterDisconnected for %s", getAddress()));
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("releaseAfterDisconnected，mBluetoothGatt=null: ");
            sb.append(this.mBluetoothGatt == null);
            BluetoothMyLogger.d(sb.toString());
        }
        this.mWorkerHandler.removeMessages(MSG_DISCONNECT_TIMEOUT);
        if (this.mBluetoothGatt == null) {
            if (z) {
                BluetoothLog.v(String.format("releaseAfterDisconnected for %s failed, mBluetoothGatt is null", getAddress()));
                return;
            }
            return;
        }
        refreshDeviceCache();
        if (this.mBluetoothGatt != null) {
            if (z) {
                BluetoothLog.v("Closing...");
            }
            if (checkPermission()) {
                this.mBluetoothGatt.close();
            } else {
                BluetoothMyLogger.d("releaseAfterDisconnected: Android 12+, no bluetooth connect or scan permission!!!");
            }
        }
        this.mBluetoothGatt = null;
        this.mWorkerHandler.postDelayed(new Runnable() { // from class: com.xiaomi.smarthome.library.bluetooth.connect.BleConnectWorker.1
            @Override // java.lang.Runnable
            public void run() {
                if (BleConnectWorker.this.mGattResponseListener == null) {
                    BleConnectWorker.this.setConnectStatus(0);
                    BleConnectWorker.this.broadcastConnectStatus(32);
                    return;
                }
                boolean zOnConnectStatusChanged = BleConnectWorker.this.mGattResponseListener.onConnectStatusChanged(false);
                BleConnectWorker.this.setConnectStatus(0);
                if (zOnConnectStatusChanged) {
                    BleConnectWorker.this.broadcastConnectStatus(32);
                }
            }
        }, 600L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setConnectStatus(int i) {
        if (DEBUG) {
            BluetoothLog.v(String.format("setConnectStatus status = %s", Constants.getStatusText(i)));
        }
        this.mConnectStatus = i;
    }

    @Override // com.xiaomi.smarthome.library.bluetooth.connect.RuntimeChecker
    public void checkRuntime() {
        this.mRuntimeChecker.checkRuntime();
    }

    @Override // com.xiaomi.smarthome.library.bluetooth.connect.IBleConnectWorker
    public void clearGattResponseListener(GattResponseListener gattResponseListener) {
        checkRuntime();
        if (this.mGattResponseListener == gattResponseListener) {
            this.mGattResponseListener = null;
        }
    }

    @Override // com.xiaomi.smarthome.library.bluetooth.connect.IBleConnectWorker
    public void closeGatt() {
        checkRuntime();
        boolean z = DEBUG;
        if (z) {
            BluetoothLog.v(String.format("closeGatt for %s", getAddress()));
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("close gatt, mBluetoothGatt is null=");
            sb.append(this.mBluetoothGatt == null);
            BluetoothMyLogger.d(sb.toString());
        }
        if (this.mBluetoothGatt == null) {
            GattResponseListener gattResponseListener = this.mGattResponseListener;
            if (gattResponseListener != null) {
                gattResponseListener.onConnectStatusChanged(false);
            }
            setConnectStatus(0);
            broadcastConnectStatus(32);
            return;
        }
        if (z) {
            BluetoothLog.v("Disconnecting...");
        }
        this.mWorkerHandler.sendEmptyMessageDelayed(MSG_DISCONNECT_TIMEOUT, VibrateModeProgressBar.sLongToLong);
        if (checkPermission()) {
            this.mBluetoothGatt.disconnect();
        } else {
            BluetoothMyLogger.d("closeGatt: Android 12+, no bluetooth connect or scan permission!!!");
        }
    }

    @Override // com.xiaomi.smarthome.library.bluetooth.connect.IBleConnectWorker
    public boolean discoverService() {
        checkRuntime();
        if (DEBUG) {
            BluetoothLog.v(String.format("discoverService for %s", getAddress()));
        }
        if (this.mBluetoothGatt == null) {
            BluetoothLog.e(String.format("discoverService but gatt is null!", new Object[0]));
            return false;
        }
        if (!checkPermission()) {
            BluetoothMyLogger.d("discoverService: Android 12+, no bluetooth connect or scan permission!!!");
            return false;
        }
        if (this.mBluetoothGatt.discoverServices()) {
            return true;
        }
        BluetoothLog.e(String.format("discoverServices failed", new Object[0]));
        return false;
    }

    @Override // com.xiaomi.smarthome.library.bluetooth.connect.IBleConnectWorker
    public int getCurrentStatus() {
        checkRuntime();
        return this.mConnectStatus;
    }

    @Override // com.xiaomi.smarthome.library.bluetooth.connect.IBleConnectWorker
    public BleGattProfile getGattProfile() {
        return this.mBleGattProfile;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        int i = message.what;
        if (i == MSG_GATT_RESPONSE) {
            ProxyBulk.safeInvoke(message.obj);
            return true;
        }
        if (i != MSG_DISCONNECT_TIMEOUT) {
            return true;
        }
        BluetoothLog.d("disconnect timeout");
        releaseAfterDisconnected();
        return true;
    }

    @Override // com.xiaomi.smarthome.library.bluetooth.connect.IBleConnectWorker
    public void isCharacterExist(UUID uuid, UUID uuid2, BleResponse<Void> bleResponse) {
        if (bleResponse == null) {
            return;
        }
        if (this.mBluetoothGatt == null || this.mDeviceProfile == null) {
            bleResponse.onResponse(-8, null);
        } else if (getCharacter(uuid, uuid2) != null) {
            bleResponse.onResponse(0, null);
        } else {
            bleResponse.onResponse(-1, null);
        }
    }

    @Override // com.xiaomi.smarthome.library.bluetooth.connect.IBluetoothGattResponse
    public void onCharacteristicChanged(BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr) {
        checkRuntime();
        if (DEBUG) {
            BluetoothLog.v(String.format("onCharacteristicChanged for %s: value = %s, service = 0x%s, character = 0x%s", this.mBluetoothDevice.getAddress(), ByteUtils.byteToString(bArr), bluetoothGattCharacteristic.getService().getUuid(), bluetoothGattCharacteristic.getUuid()));
        }
        broadcastCharacterChanged(bluetoothGattCharacteristic.getService().getUuid(), bluetoothGattCharacteristic.getUuid(), bArr);
    }

    @Override // com.xiaomi.smarthome.library.bluetooth.connect.IBluetoothGattResponse
    public void onCharacteristicRead(BluetoothGattCharacteristic bluetoothGattCharacteristic, int i, byte[] bArr) {
        checkRuntime();
        if (DEBUG) {
            BluetoothLog.v(String.format("onCharacteristicRead for %s: status = %d, service = 0x%s, character = 0x%s, value = %s", this.mBluetoothDevice.getAddress(), Integer.valueOf(i), bluetoothGattCharacteristic.getService().getUuid(), bluetoothGattCharacteristic.getUuid(), ByteUtils.byteToString(bArr)));
        }
        GattResponseListener gattResponseListener = this.mGattResponseListener;
        if (gattResponseListener == null || !(gattResponseListener instanceof ReadCharacterListener)) {
            return;
        }
        ((ReadCharacterListener) gattResponseListener).onCharacteristicRead(bluetoothGattCharacteristic, i, bArr);
    }

    @Override // com.xiaomi.smarthome.library.bluetooth.connect.IBluetoothGattResponse
    public void onCharacteristicWrite(BluetoothGattCharacteristic bluetoothGattCharacteristic, int i, byte[] bArr) {
        checkRuntime();
        if (DEBUG) {
            BluetoothLog.v(String.format("onCharacteristicWrite for %s: status = %d, service = 0x%s, character = 0x%s, value = %s", this.mBluetoothDevice.getAddress(), Integer.valueOf(i), bluetoothGattCharacteristic.getService().getUuid(), bluetoothGattCharacteristic.getUuid(), ByteUtils.byteToString(bArr)));
        }
        GattResponseListener gattResponseListener = this.mGattResponseListener;
        if (gattResponseListener != null && (gattResponseListener instanceof WriteCharacterListener)) {
            ((WriteCharacterListener) gattResponseListener).onCharacteristicWrite(bluetoothGattCharacteristic, i, bArr);
        }
        broadcastCharacterWrite(bluetoothGattCharacteristic.getService().getUuid(), bluetoothGattCharacteristic.getUuid(), bArr, i);
    }

    @Override // com.xiaomi.smarthome.library.bluetooth.connect.IBluetoothGattResponse
    public void onConnectionStateChange(int i, int i2) {
        checkRuntime();
        if (DEBUG) {
            BluetoothLog.v(String.format("onConnectionStateChange for %s: status = %d, newState = %d", this.mBluetoothDevice.getAddress(), Integer.valueOf(i), Integer.valueOf(i2)));
        } else {
            BluetoothMyLogger.d(String.format("onConnectionStateChange status=%d, newState=%d", Integer.valueOf(i), Integer.valueOf(i2)));
        }
        if (i != 0 || i2 != 2) {
            releaseAfterDisconnected();
            return;
        }
        setConnectStatus(2);
        if (!checkPermission()) {
            BluetoothMyLogger.d("onConnectionStateChange: Android 12+, no bluetooth connect or scan permission!!!");
            return;
        }
        if (this.mBluetoothDevice.getBondState() == 12) {
            BluetoothMyLogger.d("Waiting 1600 ms for a possible Service Changed indication...");
            waitFor(1600);
        }
        GattResponseListener gattResponseListener = this.mGattResponseListener;
        if (gattResponseListener != null) {
            gattResponseListener.onConnectStatusChanged(true);
        }
    }

    @Override // com.xiaomi.smarthome.library.bluetooth.connect.IBluetoothGattResponse
    public void onDescriptorWrite(BluetoothGattDescriptor bluetoothGattDescriptor, int i) {
        checkRuntime();
        if (DEBUG) {
            BluetoothLog.v(String.format("onDescriptorWrite for %s: status = %d, service = 0x%s, character = 0x%s, descriptor = 0x%s", this.mBluetoothDevice.getAddress(), Integer.valueOf(i), bluetoothGattDescriptor.getCharacteristic().getService().getUuid(), bluetoothGattDescriptor.getCharacteristic().getUuid(), bluetoothGattDescriptor.getUuid()));
        }
        GattResponseListener gattResponseListener = this.mGattResponseListener;
        if (gattResponseListener == null || !(gattResponseListener instanceof WriteDescriptorListener)) {
            return;
        }
        ((WriteDescriptorListener) gattResponseListener).onDescriptorWrite(bluetoothGattDescriptor, i);
    }

    @Override // com.xiaomi.smarthome.library.bluetooth.proxy.ProxyInterceptor
    public boolean onIntercept(Object obj, Method method, Object[] objArr) {
        this.mWorkerHandler.obtainMessage(MSG_GATT_RESPONSE, new ProxyBulk(obj, method, objArr)).sendToTarget();
        return true;
    }

    @Override // com.xiaomi.smarthome.library.bluetooth.connect.IBluetoothGattResponse
    public void onMtuChanged(int i, int i2) {
        checkRuntime();
        if (DEBUG) {
            BluetoothLog.v(String.format("onMtuChanged for %s, mtu = %d, status = %d", this.mBluetoothDevice.getAddress(), Integer.valueOf(i), Integer.valueOf(i2)));
        }
        GattResponseListener gattResponseListener = this.mGattResponseListener;
        if (gattResponseListener == null || !(gattResponseListener instanceof RequestMtuListener)) {
            return;
        }
        ((RequestMtuListener) gattResponseListener).onMtuChanged(i, i2);
    }

    @Override // com.xiaomi.smarthome.library.bluetooth.connect.IBluetoothGattResponse
    public void onReadRemoteRssi(int i, int i2) {
        checkRuntime();
        if (DEBUG) {
            BluetoothLog.v(String.format("onReadRemoteRssi for %s, rssi = %d, status = %d", this.mBluetoothDevice.getAddress(), Integer.valueOf(i), Integer.valueOf(i2)));
        }
        GattResponseListener gattResponseListener = this.mGattResponseListener;
        if (gattResponseListener == null || !(gattResponseListener instanceof ReadRssiListener)) {
            return;
        }
        ((ReadRssiListener) gattResponseListener).onReadRemoteRssi(i, i2);
    }

    @Override // com.xiaomi.smarthome.library.bluetooth.connect.IBluetoothGattResponse
    public void onServicesDiscovered(int i) {
        checkRuntime();
        if (DEBUG) {
            BluetoothLog.v(String.format("onServicesDiscovered for %s: status = %d", this.mBluetoothDevice.getAddress(), Integer.valueOf(i)));
        }
        if (i == 0) {
            setConnectStatus(19);
            broadcastConnectStatus(16);
            refreshServiceProfile();
        }
        GattResponseListener gattResponseListener = this.mGattResponseListener;
        if (gattResponseListener == null || !(gattResponseListener instanceof ServiceDiscoverListener)) {
            return;
        }
        ((ServiceDiscoverListener) gattResponseListener).onServicesDiscovered(i, this.mBleGattProfile);
    }

    @Override // com.xiaomi.smarthome.library.bluetooth.connect.IBleConnectWorker
    public boolean openGatt() {
        checkRuntime();
        if (!checkPermission()) {
            BluetoothMyLogger.d("openGatt: Android 12+, no bluetooth connect or scan permission!!!");
            return false;
        }
        BluetoothMyLogger.d("start openGatt for connect ble device");
        if (DEBUG) {
            BluetoothLog.v(String.format("openGatt for %s", getAddress()));
        }
        if (this.mBluetoothGatt != null) {
            BluetoothMyLogger.d(String.format("Previous gatt not closed", new Object[0]));
            return true;
        }
        Context context = BluetoothContextManager.getContext();
        BluetoothGattResponse bluetoothGattResponse = new BluetoothGattResponse(this.mBluetoothGattResponse);
        BleCacheManager.getInstance().getBleDeviceState(getAddress()).notifyConnecting();
        this.mBluetoothDevice = BluetoothUtils.getBluetoothAdapter().getRemoteDevice(getAddress());
        if (Version.isMarshmallow()) {
            this.mBluetoothGatt = this.mBluetoothDevice.connectGatt(context, false, bluetoothGattResponse, 2);
        } else {
            this.mBluetoothGatt = this.mBluetoothDevice.connectGatt(context, false, bluetoothGattResponse);
        }
        if (this.mBluetoothGatt != null) {
            return true;
        }
        BluetoothMyLogger.d("openGatt failed: connectGatt return null!");
        return false;
    }

    @Override // com.xiaomi.smarthome.library.bluetooth.connect.IBleConnectWorker
    public boolean readCharacteristic(UUID uuid, UUID uuid2) {
        if (DEBUG) {
            BluetoothLog.v(String.format("readCharacteristic for %s: service = 0x%s, character = 0x%s", this.mBluetoothDevice.getAddress(), uuid, uuid2));
        }
        checkRuntime();
        if (!checkPermission()) {
            BluetoothMyLogger.d("readCharacteristic: Android 12+, no bluetooth connect or scan permission!!!");
            return false;
        }
        BluetoothGattCharacteristic character = getCharacter(uuid, uuid2);
        if (character == null) {
            BluetoothLog.e(String.format("characteristic not exist!", new Object[0]));
            return false;
        }
        if (!isCharacteristicReadable(character)) {
            BluetoothLog.e(String.format("characteristic not readable!", new Object[0]));
            return false;
        }
        BluetoothGatt bluetoothGatt = this.mBluetoothGatt;
        if (bluetoothGatt == null) {
            BluetoothLog.e(String.format("ble gatt null", new Object[0]));
            return false;
        }
        if (bluetoothGatt.readCharacteristic(character)) {
            return true;
        }
        BluetoothLog.e(String.format("readCharacteristic failed", new Object[0]));
        return false;
    }

    @Override // com.xiaomi.smarthome.library.bluetooth.connect.IBleConnectWorker
    public boolean readRemoteRssi() {
        checkRuntime();
        if (DEBUG) {
            BluetoothLog.v(String.format("readRemoteRssi for %s", getAddress()));
        }
        if (!checkPermission()) {
            BluetoothMyLogger.d("readRemoteRssi: Android 12+, no bluetooth connect or scan permission!!!");
            return false;
        }
        BluetoothGatt bluetoothGatt = this.mBluetoothGatt;
        if (bluetoothGatt == null) {
            BluetoothLog.e(String.format("ble gatt null", new Object[0]));
            return false;
        }
        if (bluetoothGatt.readRemoteRssi()) {
            return true;
        }
        BluetoothLog.e(String.format("readRemoteRssi failed", new Object[0]));
        return false;
    }

    @Override // com.xiaomi.smarthome.library.bluetooth.connect.IBleConnectWorker
    public boolean refreshDeviceCache() {
        boolean z = DEBUG;
        if (z) {
            BluetoothLog.v(String.format("refreshDeviceCache for %s", getAddress()));
        }
        checkRuntime();
        BluetoothGatt bluetoothGatt = this.mBluetoothGatt;
        if (bluetoothGatt == null) {
            if (z) {
                BluetoothLog.e(String.format("ble gatt null", new Object[0]));
            }
            return false;
        }
        if (BluetoothUtils.refreshGattCache(bluetoothGatt)) {
            return true;
        }
        if (z) {
            BluetoothLog.e(String.format("refreshDeviceCache failed", new Object[0]));
        }
        return false;
    }

    @Override // com.xiaomi.smarthome.library.bluetooth.connect.IBleConnectWorker
    public void registerGattResponseListener(GattResponseListener gattResponseListener) {
        checkRuntime();
        this.mGattResponseListener = gattResponseListener;
    }

    @Override // com.xiaomi.smarthome.library.bluetooth.connect.IBleConnectWorker
    public boolean requestConnectionPriority(int i) {
        if (DEBUG) {
            BluetoothLog.v(String.format("requestConnectionPriority for %s: connectionPriority = %d", getAddress(), Integer.valueOf(i)));
        }
        if (this.mBluetoothGatt == null) {
            BluetoothLog.e(String.format("ble gatt null", new Object[0]));
            return false;
        }
        if (i < 0 || i > 2) {
            BluetoothLog.e(String.format("connectionPriority not within valid range", new Object[0]));
            return false;
        }
        if (!checkPermission()) {
            BluetoothMyLogger.d("requestConnectionPriority: Android 12+, no bluetooth connect or scan permission!!!");
            return false;
        }
        if (this.mBluetoothGatt.requestConnectionPriority(i)) {
            return true;
        }
        BluetoothLog.e(String.format("requestConnectionPriority failed", new Object[0]));
        return false;
    }

    @Override // com.xiaomi.smarthome.library.bluetooth.connect.IBleConnectWorker
    public boolean requestMtu(int i) {
        checkRuntime();
        boolean z = DEBUG;
        if (z) {
            BluetoothLog.v(String.format("requestMtu for %s, mtu = %d", getAddress(), Integer.valueOf(i)));
        }
        if (this.mBluetoothGatt == null) {
            if (z) {
                BluetoothLog.e(String.format("ble gatt null", new Object[0]));
            }
            return false;
        }
        if (!checkPermission()) {
            BluetoothMyLogger.d("requestMtu: Android 12+, no bluetooth connect or scan permission!!!");
            return false;
        }
        if (this.mBluetoothGatt.requestMtu(i)) {
            return true;
        }
        BluetoothLog.e(String.format("requestMtu failed", new Object[0]));
        return false;
    }

    @Override // com.xiaomi.smarthome.library.bluetooth.connect.IBleConnectWorker
    public boolean setCharacteristicIndication(UUID uuid, UUID uuid2, boolean z) {
        checkRuntime();
        if (DEBUG) {
            BluetoothLog.v(String.format("setCharacteristicIndication for %s, service = %s, character = %s, enable = %b", getAddress(), uuid, uuid2, Boolean.valueOf(z)));
        }
        if (!checkPermission()) {
            BluetoothMyLogger.d("setCharacteristicIndication: Android 12+, no bluetooth connect or scan permission!!!");
            return false;
        }
        BluetoothGattCharacteristic character = getCharacter(uuid, uuid2);
        if (character == null) {
            BluetoothLog.e(String.format("characteristic not exist!", new Object[0]));
            return false;
        }
        if (!isCharacteristicIndicatable(character)) {
            BluetoothLog.e(String.format("characteristic not indicatable!", new Object[0]));
            return false;
        }
        BluetoothGatt bluetoothGatt = this.mBluetoothGatt;
        if (bluetoothGatt == null) {
            BluetoothLog.e(String.format("ble gatt null", new Object[0]));
            return false;
        }
        if (!bluetoothGatt.setCharacteristicNotification(character, z)) {
            BluetoothLog.e(String.format("setCharacteristicIndication failed", new Object[0]));
            return false;
        }
        BluetoothGattDescriptor descriptor = character.getDescriptor(BluetoothConstants.CLIENT_CHARACTERISTIC_CONFIG);
        if (descriptor == null) {
            BluetoothLog.e(String.format("getDescriptor for indicate null!", new Object[0]));
            return false;
        }
        if (!descriptor.setValue(z ? BluetoothGattDescriptor.ENABLE_INDICATION_VALUE : BluetoothGattDescriptor.DISABLE_NOTIFICATION_VALUE)) {
            BluetoothLog.e(String.format("setValue for indicate descriptor failed!", new Object[0]));
            return false;
        }
        if (this.mBluetoothGatt.writeDescriptor(descriptor)) {
            return true;
        }
        BluetoothLog.e(String.format("writeDescriptor for indicate failed", new Object[0]));
        return false;
    }

    @Override // com.xiaomi.smarthome.library.bluetooth.connect.IBleConnectWorker
    public boolean setCharacteristicNotification(UUID uuid, UUID uuid2, boolean z) {
        checkRuntime();
        if (DEBUG) {
            BluetoothLog.v(String.format("setCharacteristicNotification for %s, service = %s, character = %s, enable = %b", getAddress(), uuid, uuid2, Boolean.valueOf(z)));
        }
        if (!checkPermission()) {
            BluetoothMyLogger.d("setCharacteristicNotification: Android 12+, no bluetooth connect or scan permission!!!");
            return false;
        }
        BluetoothGattCharacteristic character = getCharacter(uuid, uuid2);
        if (character == null) {
            BluetoothLog.e(String.format("characteristic not exist!", new Object[0]));
            return false;
        }
        if (!isCharacteristicNotifyable(character)) {
            BluetoothLog.e(String.format("characteristic not notifyable!", new Object[0]));
            return false;
        }
        BluetoothGatt bluetoothGatt = this.mBluetoothGatt;
        if (bluetoothGatt == null) {
            BluetoothLog.e(String.format("ble gatt null", new Object[0]));
            return false;
        }
        if (!bluetoothGatt.setCharacteristicNotification(character, z)) {
            BluetoothLog.e(String.format("setCharacteristicNotification failed", new Object[0]));
            return false;
        }
        BluetoothGattDescriptor descriptor = character.getDescriptor(BluetoothConstants.CLIENT_CHARACTERISTIC_CONFIG);
        if (descriptor == null) {
            BluetoothLog.e(String.format("getDescriptor for notify null!", new Object[0]));
            return false;
        }
        if (!descriptor.setValue(z ? BluetoothGattDescriptor.ENABLE_NOTIFICATION_VALUE : BluetoothGattDescriptor.DISABLE_NOTIFICATION_VALUE)) {
            BluetoothLog.e(String.format("setValue for notify descriptor failed!", new Object[0]));
            return false;
        }
        if (this.mBluetoothGatt.writeDescriptor(descriptor)) {
            return true;
        }
        BluetoothLog.e(String.format("writeDescriptor for notify failed", new Object[0]));
        return false;
    }

    public void waitFor(int i) {
        synchronized (this.mLock) {
            try {
                this.mLock.wait(i);
            } catch (InterruptedException unused) {
                BluetoothLog.d("Sleeping interrupted");
            }
        }
    }

    @Override // com.xiaomi.smarthome.library.bluetooth.connect.IBleConnectWorker
    public boolean writeCharacteristic(UUID uuid, UUID uuid2, byte[] bArr) {
        if (DEBUG) {
            BluetoothLog.v(String.format("writeCharacteristic for %s: service = 0x%s, character = 0x%s, value = 0x%s", this.mBluetoothDevice.getAddress(), uuid, uuid2, ByteUtils.byteToString(bArr)));
        }
        checkRuntime();
        if (!checkPermission()) {
            BluetoothMyLogger.d("writeCharacteristic: Android 12+, no bluetooth connect or scan permission!!!");
            return false;
        }
        BluetoothGattCharacteristic character = getCharacter(uuid, uuid2);
        if (character == null) {
            BluetoothLog.e(String.format("characteristic not exist!", new Object[0]));
            return false;
        }
        if (!isCharacteristicWritable(character)) {
            BluetoothLog.e(String.format("characteristic not writable!", new Object[0]));
            return false;
        }
        if (this.mBluetoothGatt == null) {
            BluetoothLog.e(String.format("ble gatt null", new Object[0]));
            return false;
        }
        if (bArr == null) {
            bArr = ByteUtils.EMPTY_BYTES;
        }
        character.setValue(bArr);
        if (this.mBluetoothGatt.writeCharacteristic(character)) {
            return true;
        }
        BluetoothLog.e(String.format("writeCharacteristic failed", new Object[0]));
        return false;
    }

    @Override // com.xiaomi.smarthome.library.bluetooth.connect.IBleConnectWorker
    public boolean writeCharacteristicWithNoRsp(UUID uuid, UUID uuid2, byte[] bArr) {
        if (DEBUG) {
            BluetoothLog.v(String.format("writeCharacteristicWithNoRsp for %s: service = 0x%s, character = 0x%s, value = 0x%s", this.mBluetoothDevice.getAddress(), uuid, uuid2, ByteUtils.byteToString(bArr)));
        }
        checkRuntime();
        if (!checkPermission()) {
            BluetoothMyLogger.d("writeCharacteristicWithNoRsp: Android 12+, no bluetooth connect or scan permission!!!");
            return false;
        }
        BluetoothGattCharacteristic character = getCharacter(uuid, uuid2);
        if (character == null) {
            BluetoothLog.e(String.format("characteristic not exist!", new Object[0]));
            return false;
        }
        if (!isCharacteristicNoRspWritable(character)) {
            BluetoothLog.e(String.format("characteristic not norsp writable!", new Object[0]));
            return false;
        }
        if (this.mBluetoothGatt == null) {
            BluetoothLog.e(String.format("ble gatt null", new Object[0]));
            return false;
        }
        if (bArr == null) {
            bArr = ByteUtils.EMPTY_BYTES;
        }
        character.setValue(bArr);
        character.setWriteType(1);
        if (this.mBluetoothGatt.writeCharacteristic(character)) {
            return true;
        }
        BluetoothLog.e(String.format("writeCharacteristic failed", new Object[0]));
        return false;
    }
}
