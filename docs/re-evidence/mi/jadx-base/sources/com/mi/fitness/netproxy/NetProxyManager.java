package com.mi.fitness.netproxy;

import android.os.Build;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.contact.export.DataHandlerWrapper;
import com.xiaomi.fitness.device.contact.export.DeviceContact;
import com.xiaomi.fitness.device.contact.export.DeviceSyncExtKt;
import com.xiaomi.fitness.device.contact.export.OnSyncCallback;
import com.xiaomi.fitness.device.contact.export.SyncResult;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.statistics.StatConstants;
import com.xiaomi.wearable.hm.BroadcastsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0005\u0018\u0000 \u001b2\u00020\u00012\u00020\u0002:\u0002\u001a\u001bB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0006\u0010\u000f\u001a\u00020\u0010J\"\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\u0010\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0006\u0010\u0019\u001a\u00020\u0010R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u001c"}, d2 = {"Lcom/mi/fitness/netproxy/NetProxyManager;", "Lcom/mi/fitness/netproxy/NetProxySender;", "Lcom/xiaomi/fitness/device/contact/export/DataHandlerWrapper;", "<init>", "()V", "jniContext", "", "tunnelThread", "Lcom/mi/fitness/netproxy/NetProxyManager$NetProxyThread;", "started", "", "getStarted", "()Z", "setStarted", "(Z)V", StatConstants.PARAM_START, "", "handleData", "did", "", "type", "", "data", "", "sendData", BroadcastsKt.SILENT_PUSHING_STOP, "NetProxyThread", "Companion", "netproxy_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class NetProxyManager extends DataHandlerWrapper implements NetProxySender {

    @NotNull
    private static final String TAG = "NetProxyManager";
    private long jniContext;
    private boolean started;

    @Nullable
    private NetProxyThread tunnelThread;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/mi/fitness/netproxy/NetProxyManager$NetProxyThread;", "Ljava/lang/Thread;", "jniContext", "", "<init>", "(J)V", "run", "", "netproxy_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class NetProxyThread extends Thread {
        private final long jniContext;

        public NetProxyThread(long j) {
            this.jniContext = j;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            super.run();
            NetProxy netProxy = NetProxy.INSTANCE;
            netProxy.netproxy_run(this.jniContext);
            netProxy.netproxy_done(this.jniContext);
        }
    }

    public final boolean getStarted() {
        return this.started;
    }

    @Override // com.xiaomi.fitness.device.contact.export.DataHandlerWrapper, com.xiaomi.fitness.device.contact.export.DataHandler
    public boolean handleData(@NotNull String did, int type, @Nullable byte[] data) {
        Intrinsics.checkNotNullParameter(did, "did");
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (!Intrinsics.areEqual(did, wearableDeviceModel != null ? wearableDeviceModel.getDid() : null)) {
            return false;
        }
        Logger.i(TAG, "handleData: type = " + type + ", dataSize = " + (data != null ? Integer.valueOf(data.length) : null));
        if (data == null) {
            return true;
        }
        try {
            NetProxy.INSTANCE.netproxy_upstream(this.jniContext, data);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            Logger.e(TAG, "handleData: exception ", e);
            return true;
        }
    }

    @Override // com.mi.fitness.netproxy.NetProxySender
    public void sendData(@NotNull byte[] data) {
        Intrinsics.checkNotNullParameter(data, "data");
        Logger.i(TAG, "sendData() called with: data size = " + data.length);
        DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE).call(108, data, false, new OnSyncCallback() { // from class: com.mi.fitness.netproxy.NetProxyManager.sendData.1
            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onError(String did, int type, int code) {
                Logger.e(NetProxyManager.TAG, "onError() called with: did = " + did + ", type = " + type + ", code = " + code);
            }

            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onSuccess(String did, int type, SyncResult result) {
                Logger.i(NetProxyManager.TAG, "onSuccess() called with: did = " + did + ", type = " + type + ", result = " + result);
            }
        }, 8000);
    }

    public final void setStarted(boolean z) {
        this.started = z;
    }

    public final void start() {
        Logger.i(TAG, "start() called, jniContext = " + this.jniContext + ", started = " + this.started);
        if (this.started) {
            return;
        }
        this.started = true;
        NetProxy netProxy = NetProxy.INSTANCE;
        this.jniContext = netProxy.netproxy_init(Build.VERSION.SDK_INT);
        netProxy.setNetProxySender(this);
        if (this.tunnelThread == null) {
            netProxy.netproxy_start(this.jniContext, 4);
            NetProxyThread netProxyThread = new NetProxyThread(this.jniContext);
            this.tunnelThread = netProxyThread;
            netProxyThread.setName("NetProxyThread");
            NetProxyThread netProxyThread2 = this.tunnelThread;
            if (netProxyThread2 != null) {
                netProxyThread2.start();
            }
        }
        DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE).addDataHandler(108, this);
    }

    public final void stop() {
        Logger.i(TAG, "onDeviceDisconnected() called, jni " + this.jniContext + ", started " + this.started);
        if (this.started) {
            this.started = false;
            NetProxy.INSTANCE.netproxy_stop(this.jniContext);
            this.tunnelThread = null;
            DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE).removeDataHandler(108, this);
        }
    }
}
