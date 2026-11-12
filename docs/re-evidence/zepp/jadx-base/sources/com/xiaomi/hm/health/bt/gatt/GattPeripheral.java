package com.xiaomi.hm.health.bt.gatt;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothGattService;
import android.content.Context;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.identity.auth.map.device.AccountManagerConstants;
import com.xiaomi.hm.health.bt.HMBleConfig;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.device.ScanReason;
import com.xiaomi.hm.health.bt.gatt.GattPeripheral;
import com.xiaomi.hm.health.bt.profile.base.HMNotifyResponse;
import com.xiaomi.hm.health.bt.profile.base.LEParams;
import com.xiaomi.hm.health.bt.profile.base.Mtu;
import com.xiaomi.hm.health.bt.profile.piece.HMPieceProfile;
import com.xiaomi.hm.health.bt.profile.slre.AsyncPieceEvent;
import com.xmlywind.sdk.common.mta.PointCategory;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes19.dex */
@SuppressLint({"NewApi"})
public class GattPeripheral extends a0 {
    private static final String H = "GattPeripheral";
    private static final int I = 1;
    private static final int J = 2;
    private static final int K = 2000;
    private static final int L = 500;
    private static final int M = 2000;
    private static final int N = 2;
    public static final int NOTIFY_TIMEOUT = 5000;
    public static final int PROFILE_STATE_UNKNOWN = 0;
    private boolean C;
    private long D;
    private final Mtu E;
    private final HMPieceProfile F;
    private int G;
    public IGattCallback.IConnectionStateChangeCallback mCallback;
    public int mProfileState;

    public GattPeripheral(Context context, BluetoothDevice device, IGattCallback.IConnectionStateChangeCallback callback) {
        super(context, device);
        this.mProfileState = 0;
        this.C = true;
        this.D = -1L;
        this.E = Mtu.createDefault();
        this.F = new HMPieceProfile();
        this.G = 0;
        this.mCallback = callback;
    }

    private boolean f0(int failCount, @Nullable DeviceAndBleBridge bridge) {
        return failCount >= 2 && bridge != null && HMBleConfig.SUPPORT_RE_CONNECT_WITH_SCAN;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void h0(AtomicBoolean atomicBoolean, HMNotifyResponse hMNotifyResponse, CountDownLatch countDownLatch, byte[] bArr) {
        if (atomicBoolean.getAndSet(true)) {
            return;
        }
        Debug.fi(H, "notify:" + GattUtils.bytesToHexString(bArr));
        hMNotifyResponse.from(bArr);
        countDownLatch.countDown();
    }

    public void clean() {
        this.mCallback = null;
    }

    @Override // com.xiaomi.hm.health.bt.gatt.IGattCallback
    public void cleanup() {
        this.mProfileState = 0;
    }

    @Override // com.xiaomi.hm.health.bt.gatt.a0
    public /* bridge */ /* synthetic */ void cleanupGatt() {
        super.cleanupGatt();
    }

    @Override // com.xiaomi.hm.health.bt.gatt.a0, com.xiaomi.hm.health.bt.gatt.IGattCallback
    public /* bridge */ /* synthetic */ void connect() {
        super.connect();
    }

    @Override // com.xiaomi.hm.health.bt.gatt.a0, com.xiaomi.hm.health.bt.gatt.IGattCallback
    public /* bridge */ /* synthetic */ void destroy() {
        super.destroy();
    }

    @Override // com.xiaomi.hm.health.bt.gatt.a0, com.xiaomi.hm.health.bt.gatt.IGattCallback
    public /* bridge */ /* synthetic */ void disconnect() {
        super.disconnect();
    }

    @Override // com.xiaomi.hm.health.bt.gatt.a0
    public /* bridge */ /* synthetic */ void enableRefreshGatt(boolean enable) {
        super.enableRefreshGatt(enable);
    }

    public final void g0() {
        cleanup();
        cleanupGatt();
        int state = BluetoothAdapter.getDefaultAdapter().getState();
        Debug.warn("BluetoothAdapter state:" + state);
        if (this.C) {
            if (state == 12 || state == 11) {
                try {
                    Debug.fi(H, "Delay 5 second before reconnect...");
                    Thread.sleep(2000L);
                } catch (InterruptedException unused) {
                }
                x();
            }
        }
    }

    @Override // com.xiaomi.hm.health.bt.gatt.a0, com.xiaomi.hm.health.bt.gatt.IGattCallback
    public /* bridge */ /* synthetic */ BluetoothDevice getDevice() {
        return super.getDevice();
    }

    @Override // com.xiaomi.hm.health.bt.gatt.a0
    public /* bridge */ /* synthetic */ DeviceAndBleBridge getDeviceAndBleBridge() {
        return super.getDeviceAndBleBridge();
    }

    public LEParams getLEParams() {
        return null;
    }

    public Mtu getMtu() {
        return this.E;
    }

    public int getPieceProfileVersion() {
        return this.F.getVersion();
    }

    @Override // com.xiaomi.hm.health.bt.gatt.a0, com.xiaomi.hm.health.bt.gatt.IGattCallback
    public /* bridge */ /* synthetic */ BluetoothGattService getService(UUID uuid) {
        return super.getService(uuid);
    }

    @Override // com.xiaomi.hm.health.bt.gatt.a0
    public /* bridge */ /* synthetic */ List getServices() {
        return super.getServices();
    }

    @Override // com.xiaomi.hm.health.bt.gatt.a0
    public /* bridge */ /* synthetic */ boolean hasNotification(BluetoothGattCharacteristic characteristic) {
        return super.hasNotification(characteristic);
    }

    @Override // com.xiaomi.hm.health.bt.gatt.IGattCallback
    public boolean init() {
        Debug.fi(H, PointCategory.INIT);
        IGattCallback.IConnectionStateChangeCallback iConnectionStateChangeCallback = this.mCallback;
        if (iConnectionStateChangeCallback != null) {
            iConnectionStateChangeCallback.onInitializing(getDevice());
        }
        if (!initCharacteristics()) {
            Debug.error("=================================================");
            Debug.error("============= INITIALIZATION FAILED =============");
            Debug.error("=================================================");
            this.mProfileState = 2;
            IGattCallback.IConnectionStateChangeCallback iConnectionStateChangeCallback2 = this.mCallback;
            if (iConnectionStateChangeCallback2 != null) {
                iConnectionStateChangeCallback2.onInitializationResult(getDevice(), false);
            }
            return false;
        }
        Debug.info("=================================================");
        Debug.info("============= INITIALIZATION SUCCESS ============");
        Debug.info("=================================================");
        this.mProfileState = 1;
        this.F.init(this, Build.VERSION.SDK_INT >= 21);
        IGattCallback.IConnectionStateChangeCallback iConnectionStateChangeCallback3 = this.mCallback;
        if (iConnectionStateChangeCallback3 != null) {
            iConnectionStateChangeCallback3.onInitializationResult(getDevice(), true);
        }
        return true;
    }

    public boolean initCharacteristics() {
        return true;
    }

    @Override // com.xiaomi.hm.health.bt.gatt.IGattCallback
    @NonNull
    public Boolean isAutoReconnect() {
        return Boolean.valueOf(this.C);
    }

    public boolean isConnected() {
        return this.mProfileState == 1 && getState() == IGattCallback.STATE.CONNECTED;
    }

    @Override // com.xiaomi.hm.health.bt.gatt.a0
    public /* bridge */ /* synthetic */ boolean isPauseConnectForScan() {
        return super.isPauseConnectForScan();
    }

    public boolean isSupportPatchWrite() {
        return this.F.isSupport();
    }

    public boolean needWaiteBeforeDiscoveryService() {
        return true;
    }

    public boolean needWaiteBeforeInit() {
        return true;
    }

    @Override // com.xiaomi.hm.health.bt.gatt.a0
    @SuppressLint({"NewApi"})
    public void onGattConnected() {
        Debug.fi(H, "onGattConnected");
        BluetoothSwitcher.offOn(0);
        IGattCallback.IConnectionStateChangeCallback iConnectionStateChangeCallback = this.mCallback;
        if (iConnectionStateChangeCallback != null) {
            iConnectionStateChangeCallback.onDeviceConnected(getDevice());
        }
        if (Build.VERSION.SDK_INT >= 28) {
            refreshGatt(true);
        }
        this.D = System.currentTimeMillis();
        IGattCallback.IConnectionStateChangeCallback iConnectionStateChangeCallback2 = this.mCallback;
        if (iConnectionStateChangeCallback2 != null) {
            iConnectionStateChangeCallback2.onDeviceDiscovering(getDevice());
        }
        boolean zA = A();
        Debug.fi(H, "discoverServices return " + zA);
        if (zA) {
            return;
        }
        g0();
    }

    @Override // com.xiaomi.hm.health.bt.gatt.a0
    /* JADX INFO: renamed from: onGattConnectionFailed */
    public void L(int status) {
        StringBuilder sb = new StringBuilder();
        sb.append("onGattConnectionFailed, connectFailCount: ");
        sb.append(this.G);
        sb.append(", autoReconnect: ");
        sb.append(this.C);
        sb.append(", bridge null: ");
        sb.append(this.deviceAndBleBridge == null);
        sb.append(", support: ");
        sb.append(HMBleConfig.SUPPORT_RE_CONNECT_WITH_SCAN);
        Debug.fi(H, sb.toString());
        IGattCallback.IConnectionStateChangeCallback iConnectionStateChangeCallback = this.mCallback;
        if (iConnectionStateChangeCallback != null) {
            iConnectionStateChangeCallback.onDeviceConnectionFailed(getDevice(), status);
        }
        GattUtils.getConnectedGattDevice(this.m_Context);
        if (status == 133 || status == 255) {
            this.G++;
        }
        if (!f0(this.G, this.deviceAndBleBridge)) {
            g0();
        } else {
            reConnectWithScan(ScanReason.ALWAYS_133);
            this.G = 0;
        }
    }

    @Override // com.xiaomi.hm.health.bt.gatt.a0
    /* JADX INFO: renamed from: onGattDisconnected */
    public void K(int status) {
        Debug.fi(H, "onGattDisconnected");
        IGattCallback.IConnectionStateChangeCallback iConnectionStateChangeCallback = this.mCallback;
        if (iConnectionStateChangeCallback != null) {
            iConnectionStateChangeCallback.onDeviceDisconnected(getDevice(), status);
        }
        g0();
    }

    @Override // com.xiaomi.hm.health.bt.gatt.a0
    /* JADX INFO: renamed from: onGattServiceDiscoverFailed */
    public void P(int status) {
        IGattCallback.IConnectionStateChangeCallback iConnectionStateChangeCallback = this.mCallback;
        if (iConnectionStateChangeCallback != null) {
            iConnectionStateChangeCallback.onDeviceDiscoveryFailed(getDevice(), status);
        }
        z();
    }

    @Override // com.xiaomi.hm.health.bt.gatt.a0
    @SuppressLint({"NewApi"})
    public void onGattServiceDiscovered() {
        Debug.fi(H, "onGattServiceDiscovered");
        BluetoothSwitcher.offOn(0);
        IGattCallback.IConnectionStateChangeCallback iConnectionStateChangeCallback = this.mCallback;
        if (iConnectionStateChangeCallback != null) {
            iConnectionStateChangeCallback.onDeviceDiscoverySuccess(getDevice());
        }
        if (System.currentTimeMillis() - this.D < 500 && needWaiteBeforeInit()) {
            Debug.fi(H, "waiting for service discovery...");
            try {
                Thread.sleep(2000L);
            } catch (Exception unused) {
            }
        }
        List services = getServices();
        if (services != null && services.size() > 0) {
            Iterator it2 = services.iterator();
            while (it2.hasNext()) {
                GattUtils.printService((BluetoothGattService) it2.next());
            }
        }
        init();
    }

    @Override // com.xiaomi.hm.health.bt.gatt.a0, android.bluetooth.BluetoothGattCallback
    public /* bridge */ /* synthetic */ void onMtuChanged(BluetoothGatt gatt, int mtu, int status) {
        super.onMtuChanged(gatt, mtu, status);
    }

    public void onPatchEvent(AsyncPieceEvent event) {
        this.F.onEvent(event);
    }

    @Override // com.xiaomi.hm.health.bt.gatt.a0, android.bluetooth.BluetoothGattCallback
    public /* bridge */ /* synthetic */ void onPhyUpdate(BluetoothGatt gatt, int txPhy, int rxPhy, int status) {
        super.onPhyUpdate(gatt, txPhy, rxPhy, status);
    }

    public boolean patchWrite(byte[] data, int profileType) {
        return this.F.patchWrite(data, profileType);
    }

    @Override // com.xiaomi.hm.health.bt.gatt.IGattCallback
    @SuppressLint({"NewApi"})
    public byte[] read(BluetoothGattCharacteristic characteristic) {
        if (characteristic != null && readCharacteristic(characteristic) == 0) {
            return characteristic.getValue();
        }
        return null;
    }

    @Override // com.xiaomi.hm.health.bt.gatt.a0, com.xiaomi.hm.health.bt.gatt.IGattCallback
    public /* bridge */ /* synthetic */ int readRemoteRssi() {
        return super.readRemoteRssi();
    }

    @Override // com.xiaomi.hm.health.bt.gatt.a0, com.xiaomi.hm.health.bt.gatt.IGattCallback
    public /* bridge */ /* synthetic */ void refreshGatt(boolean wait) {
        super.refreshGatt(wait);
    }

    @Override // com.xiaomi.hm.health.bt.gatt.a0
    public /* bridge */ /* synthetic */ void registerCallback(BluetoothGattCharacteristic characteristic, IGattCallback.INotifyCallback notifyCB) {
        super.registerCallback(characteristic, notifyCB);
    }

    @Override // com.xiaomi.hm.health.bt.gatt.a0, com.xiaomi.hm.health.bt.gatt.IGattCallback
    public /* bridge */ /* synthetic */ boolean registerNotification(BluetoothGattCharacteristic characteristic, IGattCallback.INotifyCallback notifyCB) {
        return super.registerNotification(characteristic, notifyCB);
    }

    @Override // com.xiaomi.hm.health.bt.gatt.a0, com.xiaomi.hm.health.bt.gatt.IGattCallback
    public /* bridge */ /* synthetic */ boolean requestConnectionPriority(int connectionPriority) {
        return super.requestConnectionPriority(connectionPriority);
    }

    @Override // com.xiaomi.hm.health.bt.gatt.a0, com.xiaomi.hm.health.bt.gatt.IGattCallback
    public /* bridge */ /* synthetic */ int requestMtu(int mtu) {
        return super.requestMtu(mtu);
    }

    public final boolean sendCommandWithNoResponse(BluetoothGattCharacteristic characteristic, byte[] cmd) {
        Debug.fi(H, "cmd:" + GattUtils.bytesToHexString(cmd));
        if (characteristic == null) {
            return false;
        }
        boolean zWrite = write(characteristic, cmd);
        Debug.fi(H, "result:" + zWrite);
        return zWrite;
    }

    public final HMNotifyResponse sendCommandWithResponse(BluetoothGattCharacteristic characteristic, byte[] cmd) {
        return sendCommandWithResponse(characteristic, cmd, 5000);
    }

    public final boolean sendCommandWithWrite(BluetoothGattCharacteristic characteristic, byte[] cmd) {
        return sendCommandWithNoResponse(characteristic, cmd);
    }

    @Override // com.xiaomi.hm.health.bt.gatt.IGattCallback
    public void setAutoReconnect(boolean enable) {
        this.C = enable;
    }

    @Override // com.xiaomi.hm.health.bt.gatt.a0
    public /* bridge */ /* synthetic */ void setDeviceAndBleBridge(DeviceAndBleBridge deviceAndBleBridge) {
        super.setDeviceAndBleBridge(deviceAndBleBridge);
    }

    public boolean setLEParams(int connIntMin, int connIntMax, int latency, int timeout, int advInt) {
        return false;
    }

    public boolean setLEParamsInternal(int connIntMin, int connIntMax, int latency, int timeout, int advInt) {
        return false;
    }

    @Override // com.xiaomi.hm.health.bt.gatt.a0
    public /* bridge */ /* synthetic */ void setPauseConnectForScan(boolean isAutoReconnecting) {
        super.setPauseConnectForScan(isAutoReconnecting);
    }

    @Override // com.xiaomi.hm.health.bt.gatt.a0, com.xiaomi.hm.health.bt.gatt.IGattCallback
    public /* bridge */ /* synthetic */ Phy setPreferredPhy(int txPhy, int rxPhy, int phyOptions) {
        return super.setPreferredPhy(txPhy, rxPhy, phyOptions);
    }

    public boolean sync() {
        return true;
    }

    @Override // com.xiaomi.hm.health.bt.gatt.a0
    public /* bridge */ /* synthetic */ void unRegisterCallback(BluetoothGattCharacteristic characteristic) {
        super.unRegisterCallback(characteristic);
    }

    @Override // com.xiaomi.hm.health.bt.gatt.a0, com.xiaomi.hm.health.bt.gatt.IGattCallback
    public /* bridge */ /* synthetic */ boolean unregisterNotification(BluetoothGattCharacteristic characteristic) {
        return super.unregisterNotification(characteristic);
    }

    public void waiting(Object obj, int timeout) {
        if (obj == null) {
            return;
        }
        synchronized (obj) {
            try {
                obj.wait(timeout);
            } catch (Exception unused) {
            }
        }
    }

    public void watingNotify(Object obj) {
        if (obj == null) {
            return;
        }
        synchronized (obj) {
            obj.notify();
        }
    }

    @Override // com.xiaomi.hm.health.bt.gatt.IGattCallback
    public boolean write(BluetoothGattCharacteristic characteristic, byte[] value) {
        return (characteristic == null || value == null || writeCharacteristic(characteristic, value) != 0) ? false : true;
    }

    @Override // com.xiaomi.hm.health.bt.gatt.a0
    @SuppressLint({"NewApi"})
    public final void x() {
        getMtu().resetMtu();
        Debug.debug(AccountManagerConstants.CLIENT_ID_PREFIX);
        Debug.debug("         name: " + GattUtils.getBluetoothDeviceName(getDevice()));
        Debug.debug("      address: " + getDevice().getAddress());
        switch (getDevice().getBondState()) {
            case 10:
                Debug.debug("   bond state: NONE");
                break;
            case 11:
                Debug.debug("   bond state: BONDING");
                break;
            case 12:
                Debug.debug("   bond state: BONDED");
                break;
        }
        int bluetoothDeviceType = GattUtils.getBluetoothDeviceType(getDevice());
        if (bluetoothDeviceType == 0) {
            Debug.debug("         type: UNKNOWN");
        } else if (bluetoothDeviceType == 1) {
            Debug.debug("         type: CLASSIC");
        } else if (bluetoothDeviceType == 2) {
            Debug.debug("         type: LE");
        } else if (bluetoothDeviceType == 3) {
            Debug.debug("         type: DUAL");
        }
        IGattCallback.IConnectionStateChangeCallback iConnectionStateChangeCallback = this.mCallback;
        if (iConnectionStateChangeCallback != null) {
            iConnectionStateChangeCallback.onDeviceConnecting(getDevice());
        }
        super.x();
    }

    @Override // com.xiaomi.hm.health.bt.gatt.a0
    public final void z() {
        super.z();
    }

    public final HMNotifyResponse sendCommandWithResponse(BluetoothGattCharacteristic characteristic, byte[] cmd, int timeout) {
        Debug.fi(H, "cmd:" + GattUtils.bytesToHexString(cmd));
        if (characteristic == null) {
            return null;
        }
        final HMNotifyResponse hMNotifyResponse = new HMNotifyResponse();
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        if (!registerNotification(characteristic, new IGattCallback.INotifyCallback() { // from class: ee2
            @Override // com.xiaomi.hm.health.bt.gatt.IGattCallback.INotifyCallback
            public final void notify(byte[] bArr) {
                GattPeripheral.h0(atomicBoolean, hMNotifyResponse, countDownLatch, bArr);
            }
        })) {
            return null;
        }
        if (write(characteristic, cmd)) {
            try {
                countDownLatch.await(timeout, TimeUnit.MILLISECONDS);
            } catch (Exception e) {
                Debug.fi(H, "await exception:" + e.getMessage());
            }
        }
        unregisterNotification(characteristic);
        Debug.fi(H, "result:" + hMNotifyResponse);
        return hMNotifyResponse;
    }

    public byte[] read(BluetoothGattDescriptor descriptor) {
        if (descriptor != null && Z(descriptor) == 0) {
            return descriptor.getValue();
        }
        return null;
    }
}
