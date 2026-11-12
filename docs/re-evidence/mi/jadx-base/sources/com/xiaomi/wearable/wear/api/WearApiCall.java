package com.xiaomi.wearable.wear.api;

import android.os.RemoteException;
import android.text.TextUtils;
import androidx.annotation.Keep;
import com.xiaomi.wearable.ChannelInfo;
import com.xiaomi.wearable.connection.Connection;
import com.xiaomi.wearable.connection.RealConnection;
import com.xiaomi.wearable.core.CapabilityManager;
import com.xiaomi.wearable.core.CoreExtKt;
import com.xiaomi.wearable.core.DeviceInfo;
import com.xiaomi.wearable.core.ICallback;
import com.xiaomi.wearable.core.WearApiResult;
import com.xiaomi.wearable.core.WearApiTask;
import com.xiaomi.wearable.core.c;
import com.xiaomi.wearable.core.server.DataDispatcher;
import com.xiaomi.wearable.transport.queue.ITaskQueue;
import defpackage.zd4;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public abstract class WearApiCall<C extends RealConnection> implements IWearApiCall, DataHandler {
    protected static final String TAG = "WearApiCall";
    private int deviceCapability;
    private int deviceCapabilityV2;
    private volatile boolean mConnected;
    protected C mConnection;
    private final DataDispatcher mDataDispatcher;
    protected DeviceInfo mDeviceInfo;
    public int wearMode = 0;
    private boolean isCurrent = false;
    private boolean isDestroyed = false;
    protected volatile ITaskQueue mQueue = null;
    private volatile com.xiaomi.wearable.core.a waitingConnectionCallback = null;

    public class a implements zd4 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.xiaomi.wearable.core.a f14449a;

        public a(com.xiaomi.wearable.core.a aVar) {
            this.f14449a = aVar;
        }

        @Override // defpackage.zd4
        public void onConnectFailure(int i, String str) {
            WearApiCall.this.onUnauthConnectFailure(i, str, this.f14449a);
        }

        @Override // defpackage.zd4
        public void onConnectSuccess() {
            WearApiCall.this.onUnauthConnected(this.f14449a);
        }
    }

    public WearApiCall(DeviceInfo deviceInfo) {
        this.mDeviceInfo = deviceInfo;
        CoreExtKt.logger.d(TAG, "WearApiCall() called with: did = [" + deviceInfo.getDid() + "], address = [" + deviceInfo.getAddress() + "]");
        this.mDeviceInfo = deviceInfo;
        this.mDataDispatcher = new DataDispatcher(deviceInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: callbackClient, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public void lambda$massCall$1(ICallback iCallback, WearApiResult wearApiResult) {
        try {
            if (iCallback.asBinder().isBinderAlive()) {
                iCallback.onCallback(wearApiResult);
            }
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    private void callbackUnauth(ICallback iCallback) {
        if (iCallback == null) {
            return;
        }
        try {
            iCallback.onCallback(new WearApiResult(-3));
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // com.xiaomi.wearable.wear.api.IWearApiCall
    public void addDeviceDataHandler(int i, c cVar) {
        CoreExtKt.logger.i(TAG, "addDeviceDataHandler() called with: deviceDataHandler = [" + cVar + "]");
        this.mDataDispatcher.register(i, cVar);
    }

    @Override // com.xiaomi.wearable.wear.api.IWearApiCall
    public int call(int i, byte[] bArr, boolean z, final ICallback iCallback, int i2) {
        return call(i, bArr, z, new Callback() { // from class: v6r
            @Override // com.xiaomi.wearable.wear.api.Callback
            public final void onCallback(WearApiResult wearApiResult) {
                this.f36571a.lambda$call$0(iCallback, wearApiResult);
            }
        }, i2, -1);
    }

    @Override // com.xiaomi.wearable.wear.api.IWearApiCall
    public void cancel(int i) {
        ITaskQueue iTaskQueue = this.mQueue;
        if (iTaskQueue != null) {
            iTaskQueue.cancel(i);
            return;
        }
        CoreExtKt.logger.i(TAG, "cancel() queue is null [" + i + "]");
    }

    @Override // com.xiaomi.wearable.wear.api.IWearApiCall
    public void closeUnauthConnection(String str) {
        CoreExtKt.logger.i(TAG, "closeUnauthConnection() called with: address = [" + str + "]");
        destroy();
    }

    @Override // com.xiaomi.wearable.wear.api.IWearApiCall
    public int connectionType() {
        return 0;
    }

    @Override // com.xiaomi.wearable.wear.api.IWearApiCall
    public void destroy() {
        CoreExtKt.logger.i(TAG, "destroy: " + this + ", did = " + this.mDeviceInfo.getDid());
        this.isDestroyed = true;
        if (this.mConnected) {
            onDisconnected();
        }
        if (this.mQueue != null) {
            this.mQueue.destroy();
        }
        this.mConnection.disconnect(false);
        setCurrent(false);
        this.mDataDispatcher.destroy();
    }

    public final String getAddress() {
        return this.mDeviceInfo.getAddress();
    }

    public int getAppCapability() {
        return CapabilityManager.INSTANCE.getAppCapabilities();
    }

    public ChannelInfo getChannelInfo() {
        return null;
    }

    public Connection getConnection() {
        return this.mConnection;
    }

    public int getDeviceCapability() {
        int i = this.deviceCapability;
        String did = this.mDeviceInfo.getDid();
        if (TextUtils.isEmpty(did)) {
            return 0;
        }
        return i == 0 ? CapabilityManager.INSTANCE.getDeviceCapabilities(did) : i;
    }

    public int getDeviceCapabilityV2() {
        int i = this.deviceCapabilityV2;
        String did = this.mDeviceInfo.getDid();
        if (TextUtils.isEmpty(did)) {
            return 0;
        }
        return i == 0 ? CapabilityManager.INSTANCE.getDeviceCapabilitiesV2(did) : i;
    }

    public final DeviceInfo getDeviceInfo() {
        return this.mDeviceInfo;
    }

    public boolean getSpecificModel() {
        return false;
    }

    public abstract int getVersion();

    @Override // com.xiaomi.wearable.wear.api.DataHandler
    public boolean handleData(int i, byte[] bArr) {
        CoreExtKt.logger.i(TAG, "handleData  type=" + i);
        try {
            this.mDataDispatcher.dispatchData(i, bArr);
            return false;
        } catch (RemoteException e) {
            CoreExtKt.logger.e(TAG, "handleData() error = [" + i + "]", e);
            return false;
        }
    }

    public abstract void internalConnect(boolean z, zd4 zd4Var);

    public boolean isAuthConnected() {
        return this.mConnection.isConnect();
    }

    public boolean isConnected() {
        return this.mConnected;
    }

    public final boolean isCurrent() {
        return this.isCurrent;
    }

    public boolean isDestroyed() {
        return this.isDestroyed;
    }

    @Override // com.xiaomi.wearable.wear.api.IWearApiCall
    public boolean isIDLE() {
        return this.mQueue.isIdle();
    }

    @Override // com.xiaomi.wearable.wear.api.IWearApiCall
    public int massCall(int i, int i2, byte[] bArr, boolean z, final ICallback iCallback, int i3) {
        return call(i2, bArr, z, new Callback() { // from class: u6r
            @Override // com.xiaomi.wearable.wear.api.Callback
            public final void onCallback(WearApiResult wearApiResult) {
                this.f35478a.lambda$massCall$1(iCallback, wearApiResult);
            }
        }, i3, i);
    }

    public abstract ITaskQueue newTaskQueue();

    public void onConnectFailureInternal(int i) {
        com.xiaomi.wearable.core.a aVar = this.waitingConnectionCallback;
        if (aVar == null) {
            return;
        }
        CoreExtKt.logger.i(TAG, "onConnectFailure() bind process errorCode = [" + i + "]");
        openUnauthConnection(aVar);
        this.waitingConnectionCallback = null;
    }

    public void onConnectSuccessInternal() {
        com.xiaomi.wearable.core.a aVar = this.waitingConnectionCallback;
        if (aVar != null) {
            CoreExtKt.logger.i(TAG, "onConnectSuccessInternal() called ");
            try {
                aVar.onConnected(getVersion());
            } catch (RemoteException e) {
                CoreExtKt.logger.e(TAG, "onConnectSuccess() exception", e);
            }
        }
        this.waitingConnectionCallback = null;
    }

    public void onConnected() {
        CoreExtKt.logger.i(TAG, "onConnected() did = " + this.mDeviceInfo.getDid() + ", ref = " + this);
        this.mConnected = true;
        if (this.mQueue == null) {
            this.mQueue = newTaskQueue();
        }
        this.mQueue.open();
    }

    public void onDisconnected() {
        CoreExtKt.logger.i(TAG, "onDisconnected: did = " + this.mDeviceInfo.getDid() + ", ref = " + this);
        this.mConnected = false;
        if (this.mQueue != null) {
            this.mQueue.close(-3);
        }
        ProxyDataManager.INSTANCE.clearProxyData();
    }

    public void onUnauthConnectFailure(int i, String str, com.xiaomi.wearable.core.a aVar) {
    }

    public void onUnauthConnected(com.xiaomi.wearable.core.a aVar) {
    }

    public void onUpdate(DeviceInfo deviceInfo) {
        CoreExtKt.logger.i(TAG, "onUpdate() called with: deviceInfo = [" + deviceInfo + "], connection = " + this.mConnection);
        this.mDeviceInfo = deviceInfo;
        this.mConnection.update(deviceInfo);
        this.mDataDispatcher.update(deviceInfo);
    }

    @Override // com.xiaomi.wearable.wear.api.IWearApiCall
    public int openMassChannel() {
        int andIncrement = WearApiTask.taskId.getAndIncrement();
        CoreExtKt.logger.i(TAG, "openMassChannel() called " + andIncrement);
        return andIncrement;
    }

    @Override // com.xiaomi.wearable.wear.api.IWearApiCall
    public void openUnauthConnection(com.xiaomi.wearable.core.a aVar) {
        CoreExtKt.logger.i(TAG, "openUnauthConnection() called with: this = [" + this + "]");
        if (!this.mConnection.getIsConnecting()) {
            internalConnect(true, new a(aVar));
        } else {
            CoreExtKt.logger.i(TAG, "openUnauthConnection() current device connecting, waiting to bind");
            this.waitingConnectionCallback = aVar;
        }
    }

    @Override // com.xiaomi.wearable.wear.api.IWearApiCall
    public void removeDeviceDataHandler(int i, c cVar) {
        this.mDataDispatcher.unregister(i, cVar);
    }

    @Override // com.xiaomi.wearable.wear.api.IWearApiCall
    public void setCurrent(boolean z) {
        CoreExtKt.logger.i(TAG, "setCurrent() called with: isCurrent = [" + z + "], did = " + this.mDeviceInfo.getDid());
        this.isCurrent = z;
    }

    public void setDeviceCapability(int i) {
        this.deviceCapability = i;
        String did = this.mDeviceInfo.getDid();
        if (TextUtils.isEmpty(did)) {
            return;
        }
        CapabilityManager.INSTANCE.setDeviceCapabilities(did, i);
    }

    public void setDeviceCapabilityV2(int i) {
        this.deviceCapabilityV2 = i;
        String did = this.mDeviceInfo.getDid();
        if (TextUtils.isEmpty(did)) {
            return;
        }
        CapabilityManager.INSTANCE.setDeviceCapabilitiesV2(did, i);
    }

    @Override // com.xiaomi.wearable.wear.api.IWearApiCall
    public void setWearMode(int i) {
        this.wearMode = i;
    }

    @Override // com.xiaomi.wearable.wear.api.IWearApiCall
    public void unauthCall(String str, byte[] bArr, boolean z, ICallback iCallback, int i) {
        CoreExtKt.logger.i(TAG, "unauthCall() called with: address = [" + str + "], callback = [" + iCallback + "], timeout = [" + i + "]");
        if (isConnected()) {
            call(getVersion() == 0 ? 101 : 100, bArr, z, iCallback, i);
        } else {
            CoreExtKt.logger.e(TAG, "unauthCall: open unauthConnection first");
            callbackUnauth(iCallback);
        }
    }

    private int call(int i, byte[] bArr, boolean z, Callback callback, int i2, int i3) {
        if (i2 <= 0) {
            throw new IllegalArgumentException("timeout should larger than 0");
        }
        WearApiTask wearApiTask = new WearApiTask(this.mQueue, i, bArr, z, callback, i2, i3);
        if (!this.mConnected) {
            CoreExtKt.logger.i(TAG, "call() mConnect = false, did = " + this.mDeviceInfo.getDid() + " , call = " + this);
            wearApiTask.onDisconnect();
        } else if (this.mQueue != null) {
            this.mQueue.enqueue(wearApiTask);
        } else {
            CoreExtKt.logger.i(TAG, "call: mQueue = null, discard task");
        }
        return wearApiTask.getId();
    }
}
