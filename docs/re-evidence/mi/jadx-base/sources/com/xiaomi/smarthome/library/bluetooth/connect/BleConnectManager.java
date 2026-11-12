package com.xiaomi.smarthome.library.bluetooth.connect;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.xiaomi.smarthome.library.bluetooth.BleConnectOptions;
import com.xiaomi.smarthome.library.bluetooth.connect.response.BleConnectResponse;
import com.xiaomi.smarthome.library.bluetooth.connect.response.BleNotifyResponse;
import com.xiaomi.smarthome.library.bluetooth.connect.response.BleReadResponse;
import com.xiaomi.smarthome.library.bluetooth.connect.response.BleReadRssiResponse;
import com.xiaomi.smarthome.library.bluetooth.connect.response.BleRequestMtuResponse;
import com.xiaomi.smarthome.library.bluetooth.connect.response.BleResponse;
import com.xiaomi.smarthome.library.bluetooth.connect.response.BleWriteResponse;
import com.xiaomi.smarthome.library.bluetooth.proxy.ProxyBulk;
import com.xiaomi.smarthome.library.bluetooth.proxy.ProxyInterceptor;
import com.xiaomi.smarthome.library.bluetooth.proxy.ProxyUtils;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public class BleConnectManager implements IBleConnectManager, ProxyInterceptor, Handler.Callback {
    private static volatile IBleConnectManager sInstance;
    private HashMap<String, IBleConnectMaster> mBleConnectWorkerMap = new HashMap<>();
    private Handler mHandler = new Handler(Looper.getMainLooper(), this);

    private BleConnectManager() {
    }

    private IBleConnectMaster getBleConnectMaster(String str) {
        IBleConnectMaster iBleConnectMaster = this.mBleConnectWorkerMap.get(str);
        if (iBleConnectMaster != null) {
            return iBleConnectMaster;
        }
        IBleConnectMaster iBleConnectMasterNewInstance = BleConnectMaster.newInstance(str);
        this.mBleConnectWorkerMap.put(str, iBleConnectMasterNewInstance);
        return iBleConnectMasterNewInstance;
    }

    public static IBleConnectManager getInstance() {
        if (sInstance == null) {
            synchronized (BleConnectManager.class) {
                try {
                    if (sInstance == null) {
                        BleConnectManager bleConnectManager = new BleConnectManager();
                        sInstance = (IBleConnectManager) ProxyUtils.getUIProxy(bleConnectManager, (Class<?>) IBleConnectManager.class, bleConnectManager);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return sInstance;
    }

    public void connect(String str, BleConnectResponse bleConnectResponse) {
        connect(str, null, bleConnectResponse);
    }

    @Override // com.xiaomi.smarthome.library.bluetooth.connect.IBleConnectManager
    public void disconnect(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        getBleConnectMaster(str).disconnect();
    }

    @Override // com.xiaomi.smarthome.library.bluetooth.connect.IBleConnectManager
    public void disconnectAllDevices() {
        for (IBleConnectMaster iBleConnectMaster : this.mBleConnectWorkerMap.values()) {
            if (iBleConnectMaster != null) {
                iBleConnectMaster.disconnect();
            }
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        ProxyBulk.safeInvoke(message.obj);
        return true;
    }

    @Override // com.xiaomi.smarthome.library.bluetooth.connect.IBleConnectManager
    public void indication(String str, UUID uuid, UUID uuid2, BleNotifyResponse bleNotifyResponse) {
        if (TextUtils.isEmpty(str) || uuid == null || uuid2 == null) {
            return;
        }
        getBleConnectMaster(str).indication(uuid, uuid2, bleNotifyResponse);
    }

    @Override // com.xiaomi.smarthome.library.bluetooth.connect.IBleConnectManager
    public void isCharacterExist(String str, UUID uuid, UUID uuid2, BleResponse<Void> bleResponse) {
        if (TextUtils.isEmpty(str) || uuid == null || uuid2 == null) {
            return;
        }
        getBleConnectMaster(str).isCharacterExist(uuid, uuid2, bleResponse);
    }

    @Override // com.xiaomi.smarthome.library.bluetooth.connect.IBleConnectManager
    public void notify(String str, UUID uuid, UUID uuid2, BleNotifyResponse bleNotifyResponse) {
        if (TextUtils.isEmpty(str) || uuid == null || uuid2 == null) {
            return;
        }
        getBleConnectMaster(str).notify(uuid, uuid2, bleNotifyResponse);
    }

    @Override // com.xiaomi.smarthome.library.bluetooth.proxy.ProxyInterceptor
    public boolean onIntercept(Object obj, Method method, Object[] objArr) {
        this.mHandler.obtainMessage(0, new ProxyBulk(obj, method, objArr)).sendToTarget();
        return true;
    }

    @Override // com.xiaomi.smarthome.library.bluetooth.connect.IBleConnectManager
    public void read(String str, UUID uuid, UUID uuid2, BleReadResponse bleReadResponse) {
        if (TextUtils.isEmpty(str) || uuid == null || uuid2 == null) {
            return;
        }
        getBleConnectMaster(str).read(uuid, uuid2, bleReadResponse);
    }

    @Override // com.xiaomi.smarthome.library.bluetooth.connect.IBleConnectManager
    public void readRemoteRssi(String str, BleReadRssiResponse bleReadRssiResponse) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        getBleConnectMaster(str).readRemoteRssi(bleReadRssiResponse);
    }

    @Override // com.xiaomi.smarthome.library.bluetooth.connect.IBleConnectManager
    public void refreshGattCache(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        getBleConnectMaster(str).refreshGattCache();
    }

    @Override // com.xiaomi.smarthome.library.bluetooth.connect.IBleConnectManager
    public void requestConnectionPriority(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        getBleConnectMaster(str).requestConnectionPriority(i);
    }

    @Override // com.xiaomi.smarthome.library.bluetooth.connect.IBleConnectManager
    public void requestMtu(String str, int i, BleRequestMtuResponse bleRequestMtuResponse) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        getBleConnectMaster(str).requestMtu(i, bleRequestMtuResponse);
    }

    @Override // com.xiaomi.smarthome.library.bluetooth.connect.IBleConnectManager
    public void unindication(String str, UUID uuid, UUID uuid2) {
        if (TextUtils.isEmpty(str) || uuid == null || uuid2 == null) {
            return;
        }
        getBleConnectMaster(str).unindication(uuid, uuid2);
    }

    @Override // com.xiaomi.smarthome.library.bluetooth.connect.IBleConnectManager
    public void unnotify(String str, UUID uuid, UUID uuid2) {
        if (TextUtils.isEmpty(str) || uuid == null || uuid2 == null) {
            return;
        }
        getBleConnectMaster(str).unnotify(uuid, uuid2);
    }

    @Override // com.xiaomi.smarthome.library.bluetooth.connect.IBleConnectManager
    public void write(String str, UUID uuid, UUID uuid2, byte[] bArr, BleWriteResponse bleWriteResponse) {
        if (TextUtils.isEmpty(str) || uuid == null || uuid2 == null || bArr == null) {
            return;
        }
        getBleConnectMaster(str).write(uuid, uuid2, bArr, bleWriteResponse);
    }

    @Override // com.xiaomi.smarthome.library.bluetooth.connect.IBleConnectManager
    public void writeBatchNoRsp(String str, UUID uuid, UUID uuid2, List<byte[]> list, BleWriteResponse bleWriteResponse) {
        if (TextUtils.isEmpty(str) || uuid == null || uuid2 == null || list == null) {
            return;
        }
        getBleConnectMaster(str).writeBatchNoRsp(str, uuid, uuid2, list, bleWriteResponse);
    }

    @Override // com.xiaomi.smarthome.library.bluetooth.connect.IBleConnectManager
    public void writeNoRsp(String str, UUID uuid, UUID uuid2, byte[] bArr, BleWriteResponse bleWriteResponse) {
        if (TextUtils.isEmpty(str) || uuid == null || uuid2 == null || bArr == null) {
            return;
        }
        getBleConnectMaster(str).writeNoRsp(uuid, uuid2, bArr, bleWriteResponse);
    }

    @Override // com.xiaomi.smarthome.library.bluetooth.connect.IBleConnectManager
    public void writeNoRspFast(String str, UUID uuid, UUID uuid2, byte[] bArr, BleWriteResponse bleWriteResponse) {
        if (TextUtils.isEmpty(str) || uuid == null || uuid2 == null || bArr == null) {
            return;
        }
        getBleConnectMaster(str).writeNoRspFast(uuid, uuid2, bArr, bleWriteResponse);
    }

    @Override // com.xiaomi.smarthome.library.bluetooth.connect.IBleConnectManager
    public void connect(String str, BleConnectOptions bleConnectOptions, BleConnectResponse bleConnectResponse) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        getBleConnectMaster(str).connect(bleConnectOptions, bleConnectResponse);
    }
}
