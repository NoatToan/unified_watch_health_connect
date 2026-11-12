package com.xiaomi.smarthome.library.bluetooth.connect;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.xiaomi.smarthome.library.bluetooth.BleConnectOptions;
import com.xiaomi.smarthome.library.bluetooth.connect.request.BleBatchWriteRequest;
import com.xiaomi.smarthome.library.bluetooth.connect.request.BleConnectRequest;
import com.xiaomi.smarthome.library.bluetooth.connect.request.BleIndicationRequest;
import com.xiaomi.smarthome.library.bluetooth.connect.request.BleNotifyRequest;
import com.xiaomi.smarthome.library.bluetooth.connect.request.BleReadRequest;
import com.xiaomi.smarthome.library.bluetooth.connect.request.BleReadRssiRequest;
import com.xiaomi.smarthome.library.bluetooth.connect.request.BleRequest;
import com.xiaomi.smarthome.library.bluetooth.connect.request.BleRequestMtuRequest;
import com.xiaomi.smarthome.library.bluetooth.connect.request.BleUnindicationRequest;
import com.xiaomi.smarthome.library.bluetooth.connect.request.BleUnnotifyRequest;
import com.xiaomi.smarthome.library.bluetooth.connect.request.BleWriteNoRspFastRequest;
import com.xiaomi.smarthome.library.bluetooth.connect.request.BleWriteNoRspRequest;
import com.xiaomi.smarthome.library.bluetooth.connect.request.BleWriteRequest;
import com.xiaomi.smarthome.library.bluetooth.connect.request.IFastSchedule;
import com.xiaomi.smarthome.library.bluetooth.connect.response.BleResponse;
import com.xiaomi.smarthome.library.bluetooth.utils.BluetoothLog;
import com.xiaomi.smarthome.library.common.util.ListUtils;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public class BleConnectDispatcher implements IBleConnectDispatcher, RuntimeChecker, Handler.Callback {
    private static final int MAX_REQUEST_COUNT = 100;
    private static final int MSG_SCHEDULE_NEXT = 18;
    private String mAddress;
    private BleRequest mCurrentRequest;
    private IBleConnectWorker mWorker;
    private List<BleRequest> mBleWorkList = new LinkedList();
    private Handler mHandler = new Handler(Looper.myLooper(), this);

    private BleConnectDispatcher(String str) {
        this.mAddress = str;
        this.mWorker = new BleConnectWorker(str, this);
    }

    private void addNewRequest(BleRequest bleRequest) {
        checkRuntime();
        if (this.mBleWorkList.size() < 100) {
            bleRequest.setRuntimeChecker(this);
            bleRequest.setAddress(this.mAddress);
            bleRequest.setWorker(this.mWorker);
            this.mBleWorkList.add(bleRequest);
        } else {
            bleRequest.onResponse(-11);
        }
        scheduleNextRequest(10L);
    }

    public static BleConnectDispatcher newInstance(String str) {
        return new BleConnectDispatcher(str);
    }

    private void scheduleNextRequest(long j) {
        if (this.mBleWorkList.size() > 0 && (this.mBleWorkList.get(0) instanceof IFastSchedule)) {
            j = 0;
        }
        this.mHandler.sendEmptyMessageDelayed(18, j);
    }

    @Override // com.xiaomi.smarthome.library.bluetooth.connect.RuntimeChecker
    public void checkRuntime() {
        if (Thread.currentThread() != this.mHandler.getLooper().getThread()) {
            throw new IllegalStateException("Thread Context Illegal");
        }
    }

    public void connect(BleConnectOptions bleConnectOptions, BleResponser bleResponser) {
        addNewRequest(new BleConnectRequest(bleConnectOptions, bleResponser));
    }

    public void disconnect() {
        checkRuntime();
        BluetoothLog.w(String.format("start process disconnect", new Object[0]));
        BleRequest bleRequest = this.mCurrentRequest;
        if (bleRequest != null) {
            bleRequest.cancel();
            this.mCurrentRequest = null;
        }
        Iterator<BleRequest> it = this.mBleWorkList.iterator();
        while (it.hasNext()) {
            it.next().cancel();
        }
        this.mBleWorkList.clear();
        this.mWorker.closeGatt();
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what != 18) {
            return true;
        }
        scheduleNextRequest();
        return true;
    }

    public void indication(UUID uuid, UUID uuid2, BleResponser bleResponser) {
        addNewRequest(new BleIndicationRequest(uuid, uuid2, bleResponser));
    }

    public void isCharacterExist(UUID uuid, UUID uuid2, BleResponse<Void> bleResponse) {
        this.mWorker.isCharacterExist(uuid, uuid2, bleResponse);
    }

    public void notify(UUID uuid, UUID uuid2, BleResponser bleResponser) {
        addNewRequest(new BleNotifyRequest(uuid, uuid2, bleResponser));
    }

    @Override // com.xiaomi.smarthome.library.bluetooth.connect.IBleConnectDispatcher
    public void onRequestCompleted(BleRequest bleRequest) {
        checkRuntime();
        if (bleRequest != this.mCurrentRequest) {
            throw new IllegalStateException("request not match");
        }
        this.mCurrentRequest = null;
        scheduleNextRequest(10L);
    }

    public void read(UUID uuid, UUID uuid2, BleResponser bleResponser) {
        addNewRequest(new BleReadRequest(uuid, uuid2, bleResponser));
    }

    public void readRemoteRssi(BleResponser bleResponser) {
        addNewRequest(new BleReadRssiRequest(bleResponser));
    }

    public void refreshGattCache() {
        checkRuntime();
        this.mWorker.refreshDeviceCache();
    }

    public void requestConnectionPriority(int i) {
        this.mWorker.requestConnectionPriority(i);
    }

    public void requestMtu(int i, BleResponser bleResponser) {
        addNewRequest(new BleRequestMtuRequest(i, bleResponser));
    }

    public void unindication(UUID uuid, UUID uuid2) {
        addNewRequest(new BleUnindicationRequest(uuid, uuid2));
    }

    public void unnotify(UUID uuid, UUID uuid2) {
        addNewRequest(new BleUnnotifyRequest(uuid, uuid2));
    }

    public void write(UUID uuid, UUID uuid2, byte[] bArr, BleResponser bleResponser) {
        addNewRequest(new BleWriteRequest(uuid, uuid2, bArr, bleResponser));
    }

    public void writeBatchNoRsp(UUID uuid, UUID uuid2, List<byte[]> list, BleResponser bleResponser) {
        addNewRequest(new BleBatchWriteRequest(uuid, uuid2, list, bleResponser));
    }

    public void writeNoRsp(UUID uuid, UUID uuid2, byte[] bArr, BleResponser bleResponser) {
        addNewRequest(new BleWriteNoRspRequest(uuid, uuid2, bArr, bleResponser));
    }

    public void writeNoRspFast(UUID uuid, UUID uuid2, byte[] bArr, BleResponser bleResponser) {
        addNewRequest(new BleWriteNoRspFastRequest(uuid, uuid2, bArr, bleResponser));
    }

    private void scheduleNextRequest() {
        if (this.mCurrentRequest == null && !ListUtils.isEmpty(this.mBleWorkList)) {
            BleRequest bleRequestRemove = this.mBleWorkList.remove(0);
            this.mCurrentRequest = bleRequestRemove;
            bleRequestRemove.process(this);
        }
    }
}
