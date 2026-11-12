package com.xiaomi.smarthome.library.bluetooth.connect;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.xiaomi.smarthome.library.bluetooth.BleConnectOptions;
import com.xiaomi.smarthome.library.bluetooth.connect.response.BleConnectResponse;
import com.xiaomi.smarthome.library.bluetooth.connect.response.BleNotifyResponse;
import com.xiaomi.smarthome.library.bluetooth.connect.response.BleReadResponse;
import com.xiaomi.smarthome.library.bluetooth.connect.response.BleReadRssiResponse;
import com.xiaomi.smarthome.library.bluetooth.connect.response.BleRequestMtuResponse;
import com.xiaomi.smarthome.library.bluetooth.connect.response.BleResponse;
import com.xiaomi.smarthome.library.bluetooth.connect.response.BleWriteResponse;
import com.xiaomi.smarthome.library.bluetooth.connect.response.BleWriteResponse2;
import com.xiaomi.smarthome.library.bluetooth.proxy.ProxyInterceptor;
import com.xiaomi.smarthome.library.bluetooth.proxy.ProxyUtils;
import com.xiaomi.smarthome.library.bluetooth.utils.BluetoothLog;
import com.xiaomi.smarthome.library.bluetooth.utils.BluetoothUtils;
import com.xiaomi.smarthome.library.common.util.MessageHandlerThread;
import java.lang.reflect.Method;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public class BleConnectMaster implements IBleConnectMaster, ProxyInterceptor, Handler.Callback {
    private static final int CHECK_ALIVE_CYCLE = 15000;
    private static final int CHECK_ALIVE_LIMIT = 120000;
    private static final int MSG_CHECK_ALIVE = 256;
    private String mAddress;
    private BleConnectDispatcher mBleConnectDispatcher;
    private Handler mHandler;
    private Handler mMainHandler = new Handler(Looper.getMainLooper());
    private MessageHandlerThread mThread;
    private long mTimeStamp;

    private BleConnectMaster(String str) {
        this.mAddress = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void assertCalledInMainThread() {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("");
        }
    }

    private void checkAlive() {
        if (System.currentTimeMillis() - this.mTimeStamp <= 120000 || BluetoothUtils.isBleDeviceConnected(this.mAddress)) {
            prepareCheckAlive();
        } else {
            stopMasterLooper();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void initDispatcherIfNeeded() {
        if (this.mBleConnectDispatcher == null) {
            this.mBleConnectDispatcher = BleConnectDispatcher.newInstance(this.mAddress);
        }
    }

    public static IBleConnectMaster newInstance(String str) {
        assertCalledInMainThread();
        BleConnectMaster bleConnectMaster = new BleConnectMaster(str);
        return (IBleConnectMaster) ProxyUtils.getProxy(bleConnectMaster, IBleConnectMaster.class, bleConnectMaster);
    }

    private void prepareCheckAlive() {
        this.mMainHandler.post(new Runnable() { // from class: com.xiaomi.smarthome.library.bluetooth.connect.BleConnectMaster.2
            @Override // java.lang.Runnable
            public void run() {
                if (BleConnectMaster.this.mHandler != null) {
                    BleConnectMaster.this.mHandler.sendEmptyMessageDelayed(256, 15000L);
                }
            }
        });
    }

    private void reportToObserver() {
        BleConnectObserver.getInstance().reportAction(this.mAddress);
    }

    private void startMasterLooper() {
        assertCalledInMainThread();
        if (this.mThread == null) {
            MessageHandlerThread messageHandlerThread = new MessageHandlerThread(String.format("BleConnectMaster(%s)", this.mAddress));
            this.mThread = messageHandlerThread;
            messageHandlerThread.start();
            this.mHandler = new Handler(this.mThread.getLooper(), this);
        }
    }

    private void stopMasterLooper() {
        this.mMainHandler.post(new Runnable() { // from class: com.xiaomi.smarthome.library.bluetooth.connect.BleConnectMaster.1
            @Override // java.lang.Runnable
            public void run() {
                BleConnectMaster.assertCalledInMainThread();
                if (BleConnectMaster.this.mThread != null) {
                    BleConnectMaster.this.mThread.quit();
                    BleConnectMaster.this.mThread = null;
                    BleConnectMaster.this.mHandler = null;
                    BleConnectMaster.this.mBleConnectDispatcher = null;
                }
            }
        });
    }

    private void updateTimeStamp(long j) {
        this.mTimeStamp = j;
    }

    @Override // com.xiaomi.smarthome.library.bluetooth.connect.IBleConnectMaster
    public void connect(BleConnectOptions bleConnectOptions, BleConnectResponse bleConnectResponse) {
        this.mBleConnectDispatcher.connect(bleConnectOptions, BleResponser.newInstance(bleConnectResponse));
    }

    @Override // com.xiaomi.smarthome.library.bluetooth.connect.IBleConnectMaster
    public void disconnect() {
        this.mBleConnectDispatcher.disconnect();
    }

    public Handler getHandler() {
        assertCalledInMainThread();
        if (this.mHandler == null) {
            startMasterLooper();
        }
        return this.mHandler;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what != 256) {
            return true;
        }
        checkAlive();
        return true;
    }

    @Override // com.xiaomi.smarthome.library.bluetooth.connect.IBleConnectMaster
    public void indication(UUID uuid, UUID uuid2, BleNotifyResponse bleNotifyResponse) {
        this.mBleConnectDispatcher.indication(uuid, uuid2, BleResponser.newInstance(bleNotifyResponse));
    }

    @Override // com.xiaomi.smarthome.library.bluetooth.connect.IBleConnectMaster
    public void isCharacterExist(UUID uuid, UUID uuid2, BleResponse<Void> bleResponse) {
        this.mBleConnectDispatcher.isCharacterExist(uuid, uuid2, bleResponse);
    }

    @Override // com.xiaomi.smarthome.library.bluetooth.connect.IBleConnectMaster
    public void notify(UUID uuid, UUID uuid2, BleNotifyResponse bleNotifyResponse) {
        this.mBleConnectDispatcher.notify(uuid, uuid2, BleResponser.newInstance(bleNotifyResponse));
    }

    @Override // com.xiaomi.smarthome.library.bluetooth.proxy.ProxyInterceptor
    public boolean onIntercept(final Object obj, final Method method, final Object[] objArr) {
        assertCalledInMainThread();
        final BleConnectMaster bleConnectMaster = (BleConnectMaster) obj;
        bleConnectMaster.updateTimeStamp(System.currentTimeMillis());
        bleConnectMaster.reportToObserver();
        bleConnectMaster.getHandler().post(new Runnable() { // from class: com.xiaomi.smarthome.library.bluetooth.connect.BleConnectMaster.3
            @Override // java.lang.Runnable
            public void run() {
                try {
                    bleConnectMaster.initDispatcherIfNeeded();
                    method.invoke(obj, objArr);
                } catch (Exception e) {
                    BluetoothLog.w(e);
                }
            }
        });
        return true;
    }

    @Override // com.xiaomi.smarthome.library.bluetooth.connect.IBleConnectMaster
    public void read(UUID uuid, UUID uuid2, BleReadResponse bleReadResponse) {
        this.mBleConnectDispatcher.read(uuid, uuid2, BleResponser.newInstance(bleReadResponse));
    }

    @Override // com.xiaomi.smarthome.library.bluetooth.connect.IBleConnectMaster
    public void readRemoteRssi(BleReadRssiResponse bleReadRssiResponse) {
        this.mBleConnectDispatcher.readRemoteRssi(BleResponser.newInstance(bleReadRssiResponse));
    }

    @Override // com.xiaomi.smarthome.library.bluetooth.connect.IBleConnectMaster
    public void refreshGattCache() {
        this.mBleConnectDispatcher.refreshGattCache();
    }

    @Override // com.xiaomi.smarthome.library.bluetooth.connect.IBleConnectMaster
    public void requestConnectionPriority(int i) {
        this.mBleConnectDispatcher.requestConnectionPriority(i);
    }

    @Override // com.xiaomi.smarthome.library.bluetooth.connect.IBleConnectMaster
    public void requestMtu(int i, BleRequestMtuResponse bleRequestMtuResponse) {
        this.mBleConnectDispatcher.requestMtu(i, BleResponser.newInstance(bleRequestMtuResponse));
    }

    @Override // com.xiaomi.smarthome.library.bluetooth.connect.IBleConnectMaster
    public void unindication(UUID uuid, UUID uuid2) {
        this.mBleConnectDispatcher.unindication(uuid, uuid2);
    }

    @Override // com.xiaomi.smarthome.library.bluetooth.connect.IBleConnectMaster
    public void unnotify(UUID uuid, UUID uuid2) {
        this.mBleConnectDispatcher.unnotify(uuid, uuid2);
    }

    @Override // com.xiaomi.smarthome.library.bluetooth.connect.IBleConnectMaster
    public void write(UUID uuid, UUID uuid2, byte[] bArr, BleWriteResponse bleWriteResponse) {
        if (bleWriteResponse instanceof BleWriteResponse2) {
            writeNoRsp(uuid, uuid2, bArr, bleWriteResponse);
        } else {
            this.mBleConnectDispatcher.write(uuid, uuid2, bArr, BleResponser.newInstance(bleWriteResponse));
        }
    }

    @Override // com.xiaomi.smarthome.library.bluetooth.connect.IBleConnectMaster
    public void writeBatchNoRsp(String str, UUID uuid, UUID uuid2, List<byte[]> list, BleWriteResponse bleWriteResponse) {
        this.mBleConnectDispatcher.writeBatchNoRsp(uuid, uuid2, list, BleResponser.newInstance(bleWriteResponse));
    }

    @Override // com.xiaomi.smarthome.library.bluetooth.connect.IBleConnectMaster
    public void writeNoRsp(UUID uuid, UUID uuid2, byte[] bArr, BleWriteResponse bleWriteResponse) {
        this.mBleConnectDispatcher.writeNoRsp(uuid, uuid2, bArr, BleResponser.newInstance(bleWriteResponse));
    }

    @Override // com.xiaomi.smarthome.library.bluetooth.connect.IBleConnectMaster
    public void writeNoRspFast(UUID uuid, UUID uuid2, byte[] bArr, BleWriteResponse bleWriteResponse) {
        this.mBleConnectDispatcher.writeNoRspFast(uuid, uuid2, bArr, BleResponser.newInstance(bleWriteResponse));
    }
}
