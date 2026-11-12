package com.xiaomi.fitness.device.contact.remote;

import android.os.RemoteCallbackList;
import android.os.RemoteException;
import com.xiaomi.fitness.device.contact.extensions.DeviceSyncExtKt;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.wearable.core.client.IDataHandler;
import com.xiaomi.wearable.core.client.IMiWearCoreClient;
import defpackage.c6f;
import defpackage.nl5;
import defpackage.s5f;
import defpackage.utc;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 <2\u00020\u0001:\u0001<B\t\b\u0007¢\u0006\u0004\b:\u0010;JC\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0006\u0010\b\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJC\u0010\r\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0006\u0010\b\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\r\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J5\u0010\u001d\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001b\u001a\u00020\u000e2\b\u0010\n\u001a\u0004\u0018\u00010\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ=\u0010 \u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u001f\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001b\u001a\u00020\u000e2\b\u0010\n\u001a\u0004\u0018\u00010\u001cH\u0016¢\u0006\u0004\b \u0010!J=\u0010#\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001b\u001a\u00020\u000e2\b\u0010\n\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\"\u001a\u00020\u0004H\u0016¢\u0006\u0004\b#\u0010$JE\u0010%\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u001f\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001b\u001a\u00020\u000e2\b\u0010\n\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\"\u001a\u00020\u0004H\u0016¢\u0006\u0004\b%\u0010&JE\u0010'\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0006\u0010\b\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b'\u0010\fJ\u0017\u0010)\u001a\u00020\u00142\u0006\u0010(\u001a\u00020\u0004H\u0016¢\u0006\u0004\b)\u0010*J\u0017\u0010-\u001a\u00020\u00142\u0006\u0010,\u001a\u00020+H\u0016¢\u0006\u0004\b-\u0010.J!\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010,\u001a\u0004\u0018\u00010+H\u0016¢\u0006\u0004\b\u0015\u0010/R\u001a\u00101\u001a\b\u0012\u0004\u0012\u00020+008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R \u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u000204038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0016\u00109\u001a\u0004\u0018\u00010\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b7\u00108¨\u0006="}, d2 = {"Lcom/xiaomi/fitness/device/contact/remote/DeviceContactEngineImpl;", "Lcom/xiaomi/fitness/device/contact/remote/DeviceContactEngineInternal;", "", "did", "", "type", "detailType", "path", "segmentLength", "Lutc;", "callback", "sendThirdPartyFile", "(Ljava/lang/String;IILjava/lang/String;ILutc;)I", "sendMassFile", "", "isThirdPartyDevice", "(Ljava/lang/String;)Z", "Lcom/xiaomi/wearable/core/client/IDataHandler;", "getDataHandler", "(Ljava/lang/String;)Lcom/xiaomi/wearable/core/client/IDataHandler;", "", "removeDataHandler", "(Ljava/lang/String;)V", "isIDLE", "()Z", "", "packet", "needResponse", "Lcom/xiaomi/fitness/device/contact/export/a;", "call", "(Ljava/lang/String;[BZLcom/xiaomi/fitness/device/contact/export/a;)I", "data", "callWithData", "(Ljava/lang/String;I[BZLcom/xiaomi/fitness/device/contact/export/a;)I", "timeout", "callTimeout", "(Ljava/lang/String;[BZLcom/xiaomi/fitness/device/contact/export/a;I)I", "callTimeoutWithData", "(Ljava/lang/String;I[BZLcom/xiaomi/fitness/device/contact/export/a;I)I", "sendFile", "taskId", "cancelTask", "(I)V", "Lnl5;", "handler", "addDataHandler", "(Lnl5;)V", "(ILnl5;)V", "Landroid/os/RemoteCallbackList;", "mDataHandlerRemotes", "Landroid/os/RemoteCallbackList;", "Ljava/util/concurrent/ConcurrentHashMap;", "Lcom/xiaomi/fitness/device/contact/remote/ContactTaskQueue;", "callTaskQueues", "Ljava/util/concurrent/ConcurrentHashMap;", "getMCurrentDeviceId", "()Ljava/lang/String;", "mCurrentDeviceId", "<init>", "()V", "Companion", "device-contact_release"}, k = 1, mv = {2, 0, 0})
public final class DeviceContactEngineImpl extends DeviceContactEngineInternal {
    private static final int DEFAULT_TIMEOUT = 8000;
    public static final int KEY_DEVICE_SYNC_BINDER = 3;

    @NotNull
    private final RemoteCallbackList<nl5> mDataHandlerRemotes = new RemoteCallbackList<>();

    @NotNull
    private final ConcurrentHashMap<String, ContactTaskQueue> callTaskQueues = new ConcurrentHashMap<>();

    private final synchronized String getMCurrentDeviceId() {
        WearableDeviceModel wearableDeviceModel;
        wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        return wearableDeviceModel != null ? wearableDeviceModel.getDid() : null;
    }

    private final boolean isThirdPartyDevice(String did) {
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getDeviceModel(did);
        DeviceSyncExtKt.logi("isThirdPartyDevice() called with: deviceModel = " + wearableDeviceModel + ", is thirdparty " + (wearableDeviceModel != null ? Boolean.valueOf(DeviceModelExtKt.isWearOS(wearableDeviceModel)) : null));
        if (wearableDeviceModel == null) {
            return false;
        }
        return DeviceModelExtKt.isWearOS(wearableDeviceModel);
    }

    private final int sendMassFile(String did, int type, int detailType, String path, int segmentLength, final utc callback) throws RemoteException {
        final int iOpenMassChannel = IMiWearCoreClient.INSTANCE.getInstance().openMassChannel(did);
        if (iOpenMassChannel != -1) {
            new c6f().f(iOpenMassChannel, type, detailType, path, segmentLength, new s5f() { // from class: com.xiaomi.fitness.device.contact.remote.DeviceContactEngineImpl.sendMassFile.1
                @Override // defpackage.s5f
                public void onComplete() {
                    DeviceSyncExtKt.logi("onComplete() called");
                    try {
                        utc utcVar = callback;
                        if (utcVar != null) {
                            utcVar.onComplete();
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    IMiWearCoreClient.INSTANCE.getInstance().closeMassChannel(iOpenMassChannel);
                }

                @Override // defpackage.s5f
                public void onFail(int errorCode, String errorMsg) {
                    DeviceSyncExtKt.logi("onFail() called with: errorCode = [" + errorCode + "], errorMsg = [" + errorMsg + "]");
                    try {
                        utc utcVar = callback;
                        if (utcVar != null) {
                            utcVar.onFail(errorCode, errorMsg);
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    IMiWearCoreClient.INSTANCE.getInstance().closeMassChannel(iOpenMassChannel);
                }

                @Override // defpackage.s5f
                public void onProgress(int sentCount, int totalCount) {
                    try {
                        utc utcVar = callback;
                        if (utcVar != null) {
                            try {
                                if (utcVar.asBinder().isBinderAlive() && utcVar.asBinder().pingBinder()) {
                                    utcVar.onProgress(sentCount, totalCount);
                                    return;
                                }
                                return;
                            } catch (Exception e) {
                                e.printStackTrace();
                                return;
                            }
                            e.printStackTrace();
                        }
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                }
            });
            return iOpenMassChannel;
        }
        if (callback != null) {
            callback.onFail(7, "open mass failed");
        }
        return -1;
    }

    private final int sendThirdPartyFile(String did, int type, int detailType, String path, int segmentLength, final utc callback) throws RemoteException {
        if (path != null && path.length() != 0) {
            IMiWearCoreClient.INSTANCE.getInstance().sendThirdFile(did, type, detailType, path, new s5f() { // from class: com.xiaomi.fitness.device.contact.remote.DeviceContactEngineImpl.sendThirdPartyFile.1
                @Override // defpackage.s5f
                public void onComplete() {
                    DeviceSyncExtKt.logi("onComplete() called");
                    try {
                        utc utcVar = callback;
                        if (utcVar != null) {
                            utcVar.onComplete();
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }

                @Override // defpackage.s5f
                public void onFail(int errorCode, String errorMsg) {
                    try {
                        utc utcVar = callback;
                        if (utcVar != null) {
                            utcVar.onFail(errorCode, errorMsg);
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }

                @Override // defpackage.s5f
                public void onProgress(int sentCount, int totalCount) {
                    DeviceSyncExtKt.logi("onProgress() called");
                    try {
                        utc utcVar = callback;
                        if (utcVar != null) {
                            utcVar.onProgress(sentCount, totalCount);
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });
            return 0;
        }
        if (callback == null) {
            return -1;
        }
        callback.onFail(8, "path is null");
        return -1;
    }

    @Override // com.xiaomi.fitness.device.contact.remote.DeviceContactEngineInternal, com.xiaomi.fitness.device.contact.remote.a
    public void addDataHandler(@NotNull nl5 handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.mDataHandlerRemotes.register(handler);
    }

    @Override // com.xiaomi.fitness.device.contact.remote.DeviceContactEngineInternal, com.xiaomi.fitness.device.contact.remote.a
    public int call(@Nullable String did, @Nullable byte[] packet, boolean needResponse, @Nullable com.xiaomi.fitness.device.contact.export.a callback) {
        return callTimeoutWithData(did, 101, packet, needResponse, callback, 8000);
    }

    @Override // com.xiaomi.fitness.device.contact.remote.DeviceContactEngineInternal, com.xiaomi.fitness.device.contact.remote.a
    public int callTimeout(@Nullable String did, @Nullable byte[] packet, boolean needResponse, @Nullable com.xiaomi.fitness.device.contact.export.a callback, int timeout) {
        return callTimeoutWithData(did, 101, packet, needResponse, callback, timeout);
    }

    @Override // com.xiaomi.fitness.device.contact.remote.DeviceContactEngineInternal, com.xiaomi.fitness.device.contact.remote.a
    public int callTimeoutWithData(@Nullable String did, int type, @Nullable byte[] data, boolean needResponse, @Nullable com.xiaomi.fitness.device.contact.export.a callback, int timeout) throws RemoteException {
        if (data == null) {
            return 0;
        }
        String mCurrentDeviceId = (did == null || did.length() == 0) ? getMCurrentDeviceId() : did;
        if (mCurrentDeviceId == null) {
            DeviceSyncExtKt.loge("did is null error");
            return 0;
        }
        ContactTaskQueue contactTaskQueue = this.callTaskQueues.get(mCurrentDeviceId);
        if (contactTaskQueue != null) {
            return contactTaskQueue.enqueue(new ContactCallTask(contactTaskQueue, mCurrentDeviceId, type, data, needResponse, callback, timeout));
        }
        DeviceSyncExtKt.loge("call queue is null did:" + mCurrentDeviceId + ", queue:" + this.callTaskQueues.size());
        if (callback != null) {
            callback.onSyncError(did, type, -1);
        }
        return 0;
    }

    @Override // com.xiaomi.fitness.device.contact.remote.DeviceContactEngineInternal, com.xiaomi.fitness.device.contact.remote.a
    public int callWithData(@Nullable String did, int type, @Nullable byte[] data, boolean needResponse, @Nullable com.xiaomi.fitness.device.contact.export.a callback) {
        return callTimeoutWithData(did, type, data, needResponse, callback, 8000);
    }

    @Override // com.xiaomi.fitness.device.contact.remote.DeviceContactEngineInternal, com.xiaomi.fitness.device.contact.remote.a
    public void cancelTask(int taskId) {
        ContactTaskQueue contactTaskQueue;
        if (taskId == 0 || (contactTaskQueue = this.callTaskQueues.get(getMCurrentDeviceId())) == null) {
            return;
        }
        contactTaskQueue.cancel(taskId);
    }

    @Override // com.xiaomi.fitness.device.contact.remote.DeviceContactEngineInternal
    @NotNull
    public IDataHandler getDataHandler(@NotNull String did) {
        Intrinsics.checkNotNullParameter(did, "did");
        DeviceSyncExtKt.logi("create data handler by " + did + " with " + this.mDataHandlerRemotes);
        ContactTaskQueue contactTaskQueue = new ContactTaskQueue(did, this.mDataHandlerRemotes);
        this.callTaskQueues.put(did, contactTaskQueue);
        return contactTaskQueue;
    }

    @Override // com.xiaomi.fitness.device.contact.remote.DeviceContactEngineInternal, com.xiaomi.fitness.device.contact.remote.a
    public boolean isIDLE() {
        String mCurrentDeviceId = getMCurrentDeviceId();
        if (mCurrentDeviceId != null) {
            return IMiWearCoreClient.INSTANCE.getInstance().isIdle(mCurrentDeviceId);
        }
        return false;
    }

    @Override // com.xiaomi.fitness.device.contact.remote.DeviceContactEngineInternal
    public void removeDataHandler(@NotNull String did) {
        Intrinsics.checkNotNullParameter(did, "did");
        DeviceSyncExtKt.logi("removeDataHandler() called with: did = " + did);
        this.callTaskQueues.remove(did);
    }

    @Override // com.xiaomi.fitness.device.contact.remote.DeviceContactEngineInternal, com.xiaomi.fitness.device.contact.remote.a
    public int sendFile(@Nullable String did, int type, int detailType, @Nullable String path, int segmentLength, @Nullable utc callback) throws RemoteException {
        if (did == null || did.length() == 0) {
            did = getMCurrentDeviceId();
        }
        String str = did;
        if (str != null) {
            return isThirdPartyDevice(str) ? sendThirdPartyFile(str, type, detailType, path, segmentLength, callback) : sendMassFile(str, type, detailType, path, segmentLength, callback);
        }
        DeviceSyncExtKt.loge("error target did is null");
        if (callback == null) {
            return -1;
        }
        callback.onFail(8, "did is null");
        return -1;
    }

    @Override // com.xiaomi.fitness.device.contact.remote.DeviceContactEngineInternal, com.xiaomi.fitness.device.contact.remote.a
    public void removeDataHandler(int type, @Nullable nl5 handler) {
        this.mDataHandlerRemotes.unregister(handler);
    }
}
