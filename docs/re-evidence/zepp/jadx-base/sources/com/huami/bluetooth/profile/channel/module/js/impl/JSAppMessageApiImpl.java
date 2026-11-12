package com.huami.bluetooth.profile.channel.module.js.impl;

import com.huami.bluetooth.business.IDeviceLifeCycle;
import com.huami.bluetooth.profile.channel.module.BaseModule;
import com.huami.bluetooth.profile.channel.module.js.JSAppMessageApi;
import com.huami.bluetooth.profile.channel.module.js.JSModule;
import com.huami.bluetooth.profile.channel.module.js.MessageListener;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.utils.ByteArrayKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00142\u00020\u00012\u00020\u0002:\u0001\u0014B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000e¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0005\u001a\u00020\u0003H\u0002J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\r\u001a\u00020\u0003H\u0016R\u0016\u0010\u0010\u001a\u00020\u000e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u000fR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0011¨\u0006\u0015"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/js/impl/JSAppMessageApiImpl;", "Lcom/huami/bluetooth/profile/channel/module/js/JSAppMessageApi;", "Lcom/huami/bluetooth/business/IDeviceLifeCycle;", "", "a", "b", "", "msg", "", "sendMessage", "Lcom/huami/bluetooth/profile/channel/module/js/MessageListener;", "messageListener", "onMessage", "onConnected", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "device", "Lcom/huami/bluetooth/profile/channel/module/js/MessageListener;", "<init>", "(Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class JSAppMessageApiImpl implements JSAppMessageApi, IDeviceLifeCycle {

    @NotNull
    private static final String c = "JSAppMessageApiImpl";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final HMBaseDevice device;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private MessageListener messageListener;

    public JSAppMessageApiImpl(@NotNull HMBaseDevice hMBaseDevice) {
        this.device = hMBaseDevice;
        hMBaseDevice.registerLifeCycleListener(this);
        b();
    }

    private final void a() throws Exception {
        if (!this.device.isConnected()) {
            throw new Exception("Device is not connected!");
        }
        if (!this.device.supportModule(JSModule.class)) {
            throw new Exception("Device not support js module");
        }
    }

    private final void b() {
        if (!this.device.supportModule(JSModule.class)) {
            Debug.fi(c, "Device not support js module");
            return;
        }
        JSModule jSModule = (JSModule) this.device.getChannelModule(JSModule.class);
        Debug.fi(c, Intrinsics.stringPlus("Init module:", jSModule));
        if (jSModule == null) {
            return;
        }
        jSModule.registerMessageListener(new MessageListener() { // from class: com.huami.bluetooth.profile.channel.module.js.impl.JSAppMessageApiImpl$initModule$1
            @Override // com.huami.bluetooth.profile.channel.module.js.MessageListener
            public void onMessage(@NotNull byte[] byteArr) {
                Debug.fi("JSAppMessageApiImpl", Intrinsics.stringPlus("Receive message from device ", ByteArrayKt.toHexString(byteArr)));
                MessageListener messageListener = this.a.messageListener;
                if (messageListener == null) {
                    return;
                }
                messageListener.onMessage(byteArr);
            }
        });
    }

    @Override // com.huami.bluetooth.business.IDeviceLifeCycle
    public void onConnectFailed() {
        IDeviceLifeCycle.DefaultImpls.onConnectFailed(this);
    }

    @Override // com.huami.bluetooth.business.IDeviceLifeCycle
    public void onConnectTimeout() {
        IDeviceLifeCycle.DefaultImpls.onConnectTimeout(this);
    }

    @Override // com.huami.bluetooth.business.IDeviceLifeCycle
    public void onConnected() {
        b();
    }

    @Override // com.huami.bluetooth.business.IDeviceLifeCycle
    public void onConnecting() {
        IDeviceLifeCycle.DefaultImpls.onConnecting(this);
    }

    @Override // com.huami.bluetooth.business.IDeviceLifeCycle
    public void onCreate(boolean z) {
        IDeviceLifeCycle.DefaultImpls.onCreate(this, z);
    }

    @Override // com.huami.bluetooth.business.IDeviceLifeCycle
    public void onDestroy() {
        IDeviceLifeCycle.DefaultImpls.onDestroy(this);
    }

    @Override // com.huami.bluetooth.business.IDeviceLifeCycle
    public void onDisConnect() {
        IDeviceLifeCycle.DefaultImpls.onDisConnect(this);
    }

    @Override // com.huami.bluetooth.profile.channel.module.js.JSAppMessageApi
    public void onMessage(@NotNull MessageListener messageListener) {
        this.messageListener = messageListener;
    }

    @Override // com.huami.bluetooth.profile.channel.module.js.JSAppMessageApi
    public boolean sendMessage(@NotNull byte[] msg) throws Exception {
        a();
        JSModule jSModule = (JSModule) this.device.getChannelModule(JSModule.class);
        if (jSModule == null) {
            throw new Exception("Js module is null");
        }
        Debug.fi(c, "Send data to device, size: " + msg.length + ", data: " + ByteArrayKt.toHexString(msg));
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean zSyncSendData$default = BaseModule.syncSendData$default(jSModule, msg, 0, 2, null);
        Debug.fi(c, Intrinsics.stringPlus("耗时：", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis)));
        return zSyncSendData$default;
    }
}
