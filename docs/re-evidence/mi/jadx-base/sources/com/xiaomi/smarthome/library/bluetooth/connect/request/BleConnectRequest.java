package com.xiaomi.smarthome.library.bluetooth.connect.request;

import android.os.Message;
import com.xiaomi.fitness.devicesettings.huami.vibratemode.VibrateModeProgressBar;
import com.xiaomi.smarthome.library.bluetooth.BleConnectOptions;
import com.xiaomi.smarthome.library.bluetooth.BluetoothConstants;
import com.xiaomi.smarthome.library.bluetooth.connect.BleGattProfile;
import com.xiaomi.smarthome.library.bluetooth.connect.BleGattService;
import com.xiaomi.smarthome.library.bluetooth.connect.BleResponser;
import com.xiaomi.smarthome.library.bluetooth.connect.listener.ServiceDiscoverListener;
import com.xiaomi.smarthome.library.bluetooth.utils.BluetoothLog;
import com.xiaomi.smarthome.library.common.util.ListUtils;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes2.dex */
public class BleConnectRequest extends BleRequest implements ServiceDiscoverListener {
    private static final int MSG_CONNECT = 1;
    private static final int MSG_CONNECT_TIMEOUT = 3;
    private static final int MSG_DISCOVER_SERVICE = 2;
    private static final int MSG_DISCOVER_SERVICE_TIMEOUT = 4;
    private static final int MSG_RETRY_DISCOVER_SERVICE = 5;
    private int mConnectCount;
    private BleConnectOptions mConnectOptions;
    private int mServiceDiscoverCount;

    public BleConnectRequest(BleConnectOptions bleConnectOptions, BleResponser bleResponser) {
        super(bleResponser);
        this.mConnectOptions = bleConnectOptions == null ? new BleConnectOptions.Builder().build() : bleConnectOptions;
    }

    private boolean checkService(BleGattProfile bleGattProfile) {
        boolean z = false;
        if (bleGattProfile != null) {
            if (ListUtils.isEmpty(bleGattProfile.getServices())) {
                return false;
            }
            BleGattService service = bleGattProfile.getService(BluetoothConstants.MISERVICE);
            z = true;
            if (service != null) {
                return !ListUtils.isEmpty(service.getCharacters());
            }
        }
        return z;
    }

    private boolean doDiscoverService() {
        this.mServiceDiscoverCount++;
        return discoverService();
    }

    private boolean doOpenNewGatt() {
        this.mConnectCount++;
        return openGatt();
    }

    private void onConnectSuccess() {
        BleGattProfile gattProfile = getGattProfile();
        if (gattProfile != null) {
            putParcelable("key_gatt_profile", gattProfile);
        }
        onRequestCompleted(0);
    }

    private void onServiceDiscoverFailed() {
        BluetoothLog.v(String.format("onServiceDiscoverFailed", new Object[0]));
        refreshDeviceCache();
        this.mHandler.sendEmptyMessageDelayed(5, VibrateModeProgressBar.sLongToLong);
    }

    private void processConnect() {
        this.mHandler.removeCallbacksAndMessages(null);
        this.mServiceDiscoverCount = 0;
        int currentStatus = getCurrentStatus();
        if (currentStatus == 0) {
            if (doOpenNewGatt()) {
                this.mHandler.sendEmptyMessageDelayed(3, this.mConnectOptions.getConnectTimeout());
                return;
            } else {
                onRequestCompleted(-6);
                closeGatt();
                return;
            }
        }
        if (currentStatus == 2) {
            processDiscoverService();
        } else {
            if (currentStatus != 19) {
                return;
            }
            onConnectSuccess();
        }
    }

    private void processConnectTimeout() {
        log(String.format("connect timeout", new Object[0]));
        onRequestCompleted(-6);
        closeGatt();
    }

    private void processDiscoverService() {
        BluetoothLog.v(String.format("processDiscoverService, status = %s", getStatusText()));
        int currentStatus = getCurrentStatus();
        if (currentStatus == 0) {
            retryConnectIfNeeded();
            return;
        }
        if (currentStatus != 2) {
            if (currentStatus != 19) {
                return;
            }
            onConnectSuccess();
        } else if (doDiscoverService()) {
            this.mHandler.sendEmptyMessageDelayed(4, this.mConnectOptions.getServiceDiscoverTimeout());
        } else {
            onServiceDiscoverFailed();
        }
    }

    private void processDiscoverServiceTimeout() {
        log(String.format("service discover timeout", new Object[0]));
        onRequestCompleted(-6);
        closeGatt();
    }

    private boolean retryConnectIfNeeded() {
        if (this.mConnectCount < this.mConnectOptions.getConnectRetry() + 1) {
            retryConnectLater();
            return true;
        }
        onRequestCompleted(-6);
        return false;
    }

    private void retryConnectLater() {
        log(String.format("retry connect later", new Object[0]));
        this.mHandler.removeCallbacksAndMessages(null);
        this.mHandler.sendEmptyMessageDelayed(1, VibrateModeProgressBar.sLongToLong);
    }

    private void retryDiscoverServiceIfNeeded() {
        if (this.mServiceDiscoverCount < this.mConnectOptions.getServiceDiscoverRetry() + 1) {
            retryDiscoverServiceLater();
        } else {
            onRequestCompleted(-6);
            closeGatt();
        }
    }

    private void retryDiscoverServiceLater() {
        log(String.format("retry discover service later", new Object[0]));
        this.mHandler.removeCallbacksAndMessages(null);
        this.mHandler.sendEmptyMessageDelayed(2, VibrateModeProgressBar.sLongToLong);
    }

    @Override // com.xiaomi.smarthome.library.bluetooth.connect.request.BleRequest, android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            processConnect();
        } else if (i == 2) {
            processDiscoverService();
        } else if (i == 3) {
            processConnectTimeout();
        } else if (i == 4) {
            processDiscoverServiceTimeout();
        } else if (i == 5) {
            retryDiscoverServiceIfNeeded();
        }
        return super.handleMessage(message);
    }

    @Override // com.xiaomi.smarthome.library.bluetooth.connect.request.BleRequest, com.xiaomi.smarthome.library.bluetooth.connect.listener.GattResponseListener
    public boolean onConnectStatusChanged(boolean z) {
        checkRuntime();
        this.mHandler.removeMessages(3);
        if (z) {
            this.mHandler.sendEmptyMessageDelayed(2, 300L);
            return true;
        }
        this.mHandler.removeCallbacksAndMessages(null);
        return !retryConnectIfNeeded();
    }

    @Override // com.xiaomi.smarthome.library.bluetooth.connect.listener.ServiceDiscoverListener
    public void onServicesDiscovered(int i, BleGattProfile bleGattProfile) {
        checkRuntime();
        this.mHandler.removeMessages(4);
        if (i != 0) {
            onServiceDiscoverFailed();
        } else if (checkService(bleGattProfile)) {
            onConnectSuccess();
        } else {
            BluetoothLog.e(String.format("checkService return false", new Object[0]));
            onServiceDiscoverFailed();
        }
    }

    @Override // com.xiaomi.smarthome.library.bluetooth.connect.request.BleRequest
    public void processRequest() {
        processConnect();
    }

    @Override // com.xiaomi.smarthome.library.bluetooth.connect.request.BleRequest
    public String toString() {
        return "BleConnectRequest{options=" + this.mConnectOptions + AbstractJsonLexerKt.END_OBJ;
    }
}
