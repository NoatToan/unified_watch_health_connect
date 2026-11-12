package com.xiaomi.smarthome.library.bluetooth.connect.request;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Parcelable;
import com.xiaomi.smarthome.library.bluetooth.BluetoothContextManager;
import com.xiaomi.smarthome.library.bluetooth.Constants;
import com.xiaomi.smarthome.library.bluetooth.connect.BleGattProfile;
import com.xiaomi.smarthome.library.bluetooth.connect.BleResponser;
import com.xiaomi.smarthome.library.bluetooth.connect.IBleConnectDispatcher;
import com.xiaomi.smarthome.library.bluetooth.connect.IBleConnectWorker;
import com.xiaomi.smarthome.library.bluetooth.connect.RuntimeChecker;
import com.xiaomi.smarthome.library.bluetooth.connect.listener.GattResponseListener;
import com.xiaomi.smarthome.library.bluetooth.connect.response.BleResponse;
import com.xiaomi.smarthome.library.bluetooth.utils.BluetoothLog;
import com.xiaomi.smarthome.library.bluetooth.utils.BluetoothUtils;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public abstract class BleRequest implements IBleConnectWorker, IBleRequest, Handler.Callback, GattResponseListener, RuntimeChecker {
    private static final boolean DEBUG = !BluetoothContextManager.isReleaseBuild();
    protected static final int MSG_REQUEST_TIMEOUT = 32;
    protected String mAddress;
    protected byte[] mBytes;
    protected UUID mCharacterUUID;
    protected IBleConnectDispatcher mDispatcher;
    private boolean mFinished;
    protected boolean mRequestTimeout;
    protected BleResponser mResponse;
    protected int mResultCode;
    private RuntimeChecker mRuntimeChecker;
    protected UUID mServiceUUID;
    protected IBleConnectWorker mWorker;
    protected Bundle mExtra = new Bundle();
    protected Handler mHandler = new Handler(Looper.myLooper(), this);
    protected Handler mResponseHandler = new Handler(Looper.getMainLooper());

    public BleRequest(BleResponser bleResponser) {
        this.mResponse = bleResponser;
    }

    @Override // com.xiaomi.smarthome.library.bluetooth.connect.request.IBleRequest
    public void cancel() {
        checkRuntime();
        if (DEBUG) {
            log(String.format("request canceled", new Object[0]));
        }
        this.mHandler.removeCallbacksAndMessages(null);
        clearGattResponseListener(this);
        onResponse(-2);
    }

    @Override // com.xiaomi.smarthome.library.bluetooth.connect.RuntimeChecker
    public void checkRuntime() {
        this.mRuntimeChecker.checkRuntime();
    }

    @Override // com.xiaomi.smarthome.library.bluetooth.connect.IBleConnectWorker
    public void clearGattResponseListener(GattResponseListener gattResponseListener) {
        this.mWorker.clearGattResponseListener(gattResponseListener);
    }

    @Override // com.xiaomi.smarthome.library.bluetooth.connect.IBleConnectWorker
    public void closeGatt() {
        if (DEBUG) {
            log(String.format("close gatt", new Object[0]));
        }
        this.mWorker.closeGatt();
    }

    @Override // com.xiaomi.smarthome.library.bluetooth.connect.IBleConnectWorker
    public boolean discoverService() {
        return this.mWorker.discoverService();
    }

    public String getAddress() {
        return this.mAddress;
    }

    @Override // com.xiaomi.smarthome.library.bluetooth.connect.IBleConnectWorker
    public int getCurrentStatus() {
        return this.mWorker.getCurrentStatus();
    }

    public Bundle getExtra() {
        return this.mExtra;
    }

    @Override // com.xiaomi.smarthome.library.bluetooth.connect.IBleConnectWorker
    public BleGattProfile getGattProfile() {
        return this.mWorker.getGattProfile();
    }

    public int getIntExtra(String str, int i) {
        return this.mExtra.getInt(str, i);
    }

    public BleResponser getResponse() {
        return this.mResponse;
    }

    public int getResultCode() {
        return this.mResultCode;
    }

    public String getStatusText() {
        return Constants.getStatusText(getCurrentStatus());
    }

    public long getTimeoutInMillis() {
        return 30000L;
    }

    public boolean handleMessage(Message message) {
        if (message.what == 32) {
            this.mRequestTimeout = true;
            closeGatt();
        }
        return true;
    }

    @Override // com.xiaomi.smarthome.library.bluetooth.connect.IBleConnectWorker
    public void isCharacterExist(UUID uuid, UUID uuid2, BleResponse<Void> bleResponse) {
        this.mWorker.isCharacterExist(uuid, uuid2, bleResponse);
    }

    public void log(String str) {
        BluetoothLog.v(String.format("%s %s >>> %s", getClass().getSimpleName(), getAddress(), str));
    }

    public boolean onConnectStatusChanged(boolean z) {
        if (z) {
            return true;
        }
        onRequestCompleted(this.mRequestTimeout ? -7 : -1);
        return true;
    }

    public void onRequestCompleted(int i) {
        if (DEBUG) {
            log(String.format("request complete: code = %d", Integer.valueOf(i)));
        }
        this.mHandler.removeCallbacksAndMessages(null);
        clearGattResponseListener(this);
        onResponse(i);
        this.mDispatcher.onRequestCompleted(this);
    }

    public void onResponse(final int i) {
        if (this.mFinished) {
            return;
        }
        this.mFinished = true;
        this.mResponseHandler.post(new Runnable() { // from class: com.xiaomi.smarthome.library.bluetooth.connect.request.BleRequest.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    BleRequest bleRequest = BleRequest.this;
                    BleResponser bleResponser = bleRequest.mResponse;
                    if (bleResponser != null) {
                        bleResponser.onResponse(i, bleRequest.mExtra);
                    }
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        });
    }

    @Override // com.xiaomi.smarthome.library.bluetooth.connect.IBleConnectWorker
    public boolean openGatt() {
        return this.mWorker.openGatt();
    }

    @Override // com.xiaomi.smarthome.library.bluetooth.connect.request.IBleRequest
    public final void process(IBleConnectDispatcher iBleConnectDispatcher) {
        checkRuntime();
        this.mDispatcher = iBleConnectDispatcher;
        if (DEBUG) {
            BluetoothLog.w(String.format("Process %s, status = %s", getClass().getSimpleName(), getStatusText()));
        }
        if (!BluetoothUtils.isBleSupported()) {
            onRequestCompleted(-4);
            return;
        }
        if (!BluetoothUtils.isBluetoothEnabledInKuailian()) {
            onRequestCompleted(-5);
            return;
        }
        try {
            registerGattResponseListener(this);
            processRequest();
        } catch (Throwable th) {
            BluetoothLog.e(th);
            onRequestCompleted(-15);
        }
    }

    public abstract void processRequest();

    public void putByteArray(String str, byte[] bArr) {
        this.mExtra.putByteArray(str, bArr);
    }

    public void putIntExtra(String str, int i) {
        this.mExtra.putInt(str, i);
    }

    public void putParcelable(String str, Parcelable parcelable) {
        this.mExtra.putParcelable(str, parcelable);
    }

    @Override // com.xiaomi.smarthome.library.bluetooth.connect.IBleConnectWorker
    public boolean readCharacteristic(UUID uuid, UUID uuid2) {
        return this.mWorker.readCharacteristic(uuid, uuid2);
    }

    @Override // com.xiaomi.smarthome.library.bluetooth.connect.IBleConnectWorker
    public boolean readRemoteRssi() {
        return this.mWorker.readRemoteRssi();
    }

    @Override // com.xiaomi.smarthome.library.bluetooth.connect.IBleConnectWorker
    public boolean refreshDeviceCache() {
        return this.mWorker.refreshDeviceCache();
    }

    @Override // com.xiaomi.smarthome.library.bluetooth.connect.IBleConnectWorker
    public void registerGattResponseListener(GattResponseListener gattResponseListener) {
        this.mWorker.registerGattResponseListener(gattResponseListener);
    }

    @Override // com.xiaomi.smarthome.library.bluetooth.connect.IBleConnectWorker
    public boolean requestConnectionPriority(int i) {
        return this.mWorker.requestConnectionPriority(i);
    }

    @Override // com.xiaomi.smarthome.library.bluetooth.connect.IBleConnectWorker
    public boolean requestMtu(int i) {
        return this.mWorker.requestMtu(i);
    }

    public void setAddress(String str) {
        this.mAddress = str;
    }

    @Override // com.xiaomi.smarthome.library.bluetooth.connect.IBleConnectWorker
    public boolean setCharacteristicIndication(UUID uuid, UUID uuid2, boolean z) {
        return this.mWorker.setCharacteristicIndication(uuid, uuid2, z);
    }

    @Override // com.xiaomi.smarthome.library.bluetooth.connect.IBleConnectWorker
    public boolean setCharacteristicNotification(UUID uuid, UUID uuid2, boolean z) {
        return this.mWorker.setCharacteristicNotification(uuid, uuid2, z);
    }

    public void setResponse(BleResponser bleResponser) {
        this.mResponse = bleResponser;
    }

    public void setResultCode(int i) {
        this.mResultCode = i;
        putIntExtra("key_code", i);
    }

    public void setRuntimeChecker(RuntimeChecker runtimeChecker) {
        this.mRuntimeChecker = runtimeChecker;
    }

    public void setWorker(IBleConnectWorker iBleConnectWorker) {
        this.mWorker = iBleConnectWorker;
    }

    public void startRequestTiming() {
        this.mHandler.sendEmptyMessageDelayed(32, getTimeoutInMillis());
    }

    public void stopRequestTiming() {
        this.mHandler.removeMessages(32);
    }

    public String toString() {
        return getClass().getSimpleName();
    }

    @Override // com.xiaomi.smarthome.library.bluetooth.connect.IBleConnectWorker
    public boolean writeCharacteristic(UUID uuid, UUID uuid2, byte[] bArr) {
        return this.mWorker.writeCharacteristic(uuid, uuid2, bArr);
    }

    @Override // com.xiaomi.smarthome.library.bluetooth.connect.IBleConnectWorker
    public boolean writeCharacteristicWithNoRsp(UUID uuid, UUID uuid2, byte[] bArr) {
        return this.mWorker.writeCharacteristicWithNoRsp(uuid, uuid2, bArr);
    }
}
