package com.xiaomi.smarthome.network;

import android.content.Context;
import android.os.Handler;
import android.os.IBinder;
import android.text.TextUtils;
import com.xiaomi.smarthome.core.entity.net.Crypto;
import com.xiaomi.smarthome.core.entity.net.NetError;
import com.xiaomi.smarthome.core.entity.net.NetRequest;
import com.xiaomi.smarthome.core.entity.net.NetResult;
import com.xiaomi.smarthome.core.server.IServerHandle;
import com.xiaomi.smarthome.core.server.internal.NetCallback;
import com.xiaomi.smarthome.core.server.internal.NetHandle;
import com.xiaomi.smarthome.core.server.internal.api.SmartHomeAesApi;
import com.xiaomi.smarthome.core.server.internal.api.SmartHomeHttpsApi;
import com.xiaomi.smarthome.core.server.internal.api.SmartHomeOpenApi;
import com.xiaomi.smarthome.core.server.internal.api.SmartHomeRc4Api;
import com.xiaomi.smarthome.frame.AsyncCallback;
import com.xiaomi.smarthome.frame.AsyncHandle;
import com.xiaomi.smarthome.frame.Error;
import com.xiaomi.smarthome.frame.JsonParser;
import com.xiaomi.smarthome.frame.SmartHomeApiParser;
import com.xiaomi.smarthome.frame.SyncCallback;
import com.xiaomi.smarthome.library.common.util.MessageHandlerThread;
import com.xiaomi.smarthome.utils.ExtsKt;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes2.dex */
public class SmartHomeRequestManager {
    private static volatile SmartHomeRequestManager sInstance;
    private Handler mWorkerHandler;
    private MessageHandlerThread mWorkerThread;
    private List<SmartHomeRequestRecord> mSmartHomeRequestRecordList = new CopyOnWriteArrayList();
    private Random mRandom = new Random();

    public static class SmartHomeRequestRecord {
        WeakReference<AsyncHandle> handle;
        long requestId;
        int requestTag;

        private SmartHomeRequestRecord() {
        }
    }

    private SmartHomeRequestManager() {
        MessageHandlerThread messageHandlerThread = new MessageHandlerThread("SmartHomeRequestWorker");
        this.mWorkerThread = messageHandlerThread;
        messageHandlerThread.start();
        this.mWorkerHandler = new Handler(this.mWorkerThread.getLooper());
    }

    private void addSmartHomeRequestRecord(final long j, final int i, final AsyncHandle asyncHandle) {
        this.mWorkerHandler.post(new Runnable() { // from class: com.xiaomi.smarthome.network.SmartHomeRequestManager.2
            @Override // java.lang.Runnable
            public void run() {
                SmartHomeRequestRecord smartHomeRequestRecord = new SmartHomeRequestRecord();
                smartHomeRequestRecord.requestId = j;
                smartHomeRequestRecord.handle = new WeakReference<>(asyncHandle);
                smartHomeRequestRecord.requestTag = i;
                SmartHomeRequestManager.this.mSmartHomeRequestRecordList.add(smartHomeRequestRecord);
            }
        });
    }

    private void cancelSmartHomeRequest(final int i) {
        this.mWorkerHandler.post(new Runnable() { // from class: com.xiaomi.smarthome.network.SmartHomeRequestManager.4
            @Override // java.lang.Runnable
            public void run() {
                WeakReference<AsyncHandle> weakReference;
                for (int i2 = 0; i2 < SmartHomeRequestManager.this.mSmartHomeRequestRecordList.size(); i2++) {
                    SmartHomeRequestRecord smartHomeRequestRecord = (SmartHomeRequestRecord) SmartHomeRequestManager.this.mSmartHomeRequestRecordList.get(i2);
                    if (smartHomeRequestRecord.requestTag == i && (weakReference = smartHomeRequestRecord.handle) != null && weakReference.get() != null) {
                        smartHomeRequestRecord.handle.get().cancel();
                    }
                }
            }
        });
    }

    private long generateRequestId() {
        return this.mRandom.nextLong();
    }

    public static SmartHomeRequestManager getInstance() {
        if (sInstance == null) {
            synchronized (SmartHomeRequestManager.class) {
                try {
                    if (sInstance == null) {
                        sInstance = new SmartHomeRequestManager();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return sInstance;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeSmartHomeRequestRecord(final long j) {
        this.mWorkerHandler.post(new Runnable() { // from class: com.xiaomi.smarthome.network.SmartHomeRequestManager.3
            @Override // java.lang.Runnable
            public void run() {
                int i = 0;
                while (i < SmartHomeRequestManager.this.mSmartHomeRequestRecordList.size()) {
                    if (((SmartHomeRequestRecord) SmartHomeRequestManager.this.mSmartHomeRequestRecordList.get(i)).requestId == j) {
                        SmartHomeRequestManager.this.mSmartHomeRequestRecordList.remove(i);
                        i--;
                    }
                    i++;
                }
            }
        });
    }

    private IServerHandle sendSmartHomeRequestInternal(final NetRequest netRequest, final Crypto crypto, final NetCallback<NetResult, NetError> netCallback) {
        NetworkAsyncTask networkAsyncTask = new NetworkAsyncTask() { // from class: com.xiaomi.smarthome.network.SmartHomeRequestManager.5
            NetHandle mNetHandle;

            @Override // com.xiaomi.smarthome.core.server.IServerHandle.Stub, android.os.IInterface
            public IBinder asBinder() {
                return null;
            }

            @Override // com.xiaomi.smarthome.network.NetworkAsyncTask
            public void onCancel() {
                NetHandle netHandle = this.mNetHandle;
                if (netHandle != null) {
                    netHandle.cancel();
                }
            }

            @Override // java.lang.Runnable
            public void run() {
                Crypto crypto2 = crypto;
                if (crypto2 == Crypto.RC4) {
                    this.mNetHandle = SmartHomeRc4Api.getInstance().sendRequest(netRequest, netCallback);
                    return;
                }
                if (crypto2 == Crypto.NONE) {
                    this.mNetHandle = SmartHomeOpenApi.getInstance().sendRequest(netRequest, netCallback);
                    return;
                }
                if (crypto2 == Crypto.AES) {
                    this.mNetHandle = SmartHomeAesApi.getInstance().sendRequest(netRequest, netCallback);
                } else if (crypto2 == Crypto.HTTPS) {
                    this.mNetHandle = SmartHomeHttpsApi.getInstance().sendRequest(netRequest, netCallback);
                } else {
                    netCallback.onFailure(new NetError(-9999, "crypto not support"));
                }
            }
        };
        networkAsyncTask.execute();
        return networkAsyncTask;
    }

    public void cancelRequest(Context context) {
        if (context != null) {
            cancelSmartHomeRequest(context.hashCode());
        }
    }

    public <R> AsyncHandle sendSmartHomeRequest(Context context, NetRequest netRequest, JsonParser<R> jsonParser, Crypto crypto, AsyncCallback<R, Error> asyncCallback) {
        return sendSmartHomeRequestEx(context, netRequest, jsonParser, crypto, asyncCallback, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <R> AsyncHandle sendSmartHomeRequestEx(Context context, NetRequest netRequest, final JsonParser<R> jsonParser, Crypto crypto, final AsyncCallback<R, Error> asyncCallback, final boolean z) {
        IServerHandle iServerHandleSendSmartHomeRequestInternal;
        int iHashCode = context != null ? context.hashCode() : 0;
        final long jGenerateRequestId = generateRequestId();
        NetCallback<NetResult, NetError> netCallback = new NetCallback<NetResult, NetError>() { // from class: com.xiaomi.smarthome.network.SmartHomeRequestManager.1
            @Override // com.xiaomi.smarthome.core.server.internal.NetCallback
            public void onCache(NetResult netResult) {
            }

            @Override // com.xiaomi.smarthome.core.server.internal.NetCallback
            public void onFailure(NetError netError) {
                Error error = !TextUtils.isEmpty(netError.getmExtraMsg()) ? new Error(netError.getCode(), netError.getDetail(), netError.getmExtraMsg()) : new Error(netError.getCode(), netError.getDetail());
                AsyncCallback asyncCallback2 = asyncCallback;
                if (asyncCallback2 != null) {
                    asyncCallback2.sendFailureMessage(error);
                }
                if (asyncCallback instanceof SyncCallback) {
                    return;
                }
                SmartHomeRequestManager.this.removeSmartHomeRequestRecord(jGenerateRequestId);
            }

            @Override // com.xiaomi.smarthome.core.server.internal.NetCallback
            public void onSuccess(NetResult netResult) {
                SmartHomeApiParser.getInstance().parse(netResult, jsonParser, asyncCallback, z);
                if (netResult.mIsCache || (asyncCallback instanceof SyncCallback)) {
                    return;
                }
                SmartHomeRequestManager.this.removeSmartHomeRequestRecord(jGenerateRequestId);
            }
        };
        boolean z2 = asyncCallback instanceof SyncCallback;
        if (z2) {
            try {
                ((SyncCallback) asyncCallback).setUseSyncLockMode();
                Object syncLock = ((SyncCallback) asyncCallback).getSyncLock();
                synchronized (syncLock) {
                    iServerHandleSendSmartHomeRequestInternal = sendSmartHomeRequestInternal(netRequest, crypto, netCallback);
                    syncLock.wait();
                }
                SyncCallback syncCallback = (SyncCallback) asyncCallback;
                if (syncCallback.isSuccess()) {
                    asyncCallback.onSuccess(syncCallback.getResult());
                } else {
                    asyncCallback.onFailure(syncCallback.getError());
                }
            } catch (Throwable th) {
                if (asyncCallback != 0) {
                    asyncCallback.sendFailureMessage(new Error(-9999, ExtsKt.getString(th)));
                }
                return new AsyncHandle(null);
            }
        } else {
            try {
                iServerHandleSendSmartHomeRequestInternal = sendSmartHomeRequestInternal(netRequest, crypto, netCallback);
            } catch (Throwable th2) {
                if (asyncCallback != 0) {
                    asyncCallback.sendFailureMessage(new Error(-9999, ExtsKt.getString(th2)));
                }
                return new AsyncHandle(null);
            }
        }
        AsyncHandle asyncHandle = new AsyncHandle(iServerHandleSendSmartHomeRequestInternal);
        if (!z2) {
            addSmartHomeRequestRecord(jGenerateRequestId, iHashCode, asyncHandle);
        }
        return asyncHandle;
    }
}
