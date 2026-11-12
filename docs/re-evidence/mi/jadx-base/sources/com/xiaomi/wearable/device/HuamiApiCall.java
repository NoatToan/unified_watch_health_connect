package com.xiaomi.wearable.device;

import com.xiaomi.wearable.core.CapabilityCallback;
import com.xiaomi.wearable.core.DeviceInfo;
import com.xiaomi.wearable.device.HuamiApiCall;
import com.xiaomi.wearable.hm.HuamiStepListener;
import com.xiaomi.wearable.huami_export.HuamiDeviceApi;
import com.xiaomi.wearable.transport.queue.Messenger;
import com.xiaomi.wearable.wear.api.WearBinder;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010*\u001a\u00020+H\u0016J\u0010\u0010,\u001a\u00020+2\u0006\u0010-\u001a\u00020.H\u0016J\u0010\u0010/\u001a\u00020+2\u0006\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u00100\u001a\u00020+H\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005R\u001b\u0010\t\u001a\u00020\n8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u001aX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001a\u0010\u001f\u001a\u00020 X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001a\u0010%\u001a\u00020 X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\"\"\u0004\b'\u0010$R\u0014\u0010(\u001a\u00020\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010\u001c¨\u00061"}, d2 = {"Lcom/xiaomi/wearable/device/HuamiApiCall;", "Lcom/xiaomi/wearable/huami_export/HuamiDeviceApi;", "deviceInfo", "Lcom/xiaomi/wearable/core/DeviceInfo;", "<init>", "(Lcom/xiaomi/wearable/core/DeviceInfo;)V", "getDeviceInfo", "()Lcom/xiaomi/wearable/core/DeviceInfo;", "setDeviceInfo", "connection", "Lcom/xiaomi/wearable/device/HuamiConnection;", "getConnection", "()Lcom/xiaomi/wearable/device/HuamiConnection;", "connection$delegate", "Lkotlin/Lazy;", "messenger", "Lcom/xiaomi/wearable/transport/queue/Messenger;", "getMessenger", "()Lcom/xiaomi/wearable/transport/queue/Messenger;", "binder", "Lcom/xiaomi/wearable/wear/api/WearBinder;", "getBinder", "()Lcom/xiaomi/wearable/wear/api/WearBinder;", "setBinder", "(Lcom/xiaomi/wearable/wear/api/WearBinder;)V", "currentDevice", "", "getCurrentDevice", "()Z", "setCurrentDevice", "(Z)V", "deviceCapability", "", "getDeviceCapability", "()I", "setDeviceCapability", "(I)V", "appCapability", "getAppCapability", "setAppCapability", "specificModel", "getSpecificModel", "init", "", "setStepCallback", "callback", "Lcom/xiaomi/wearable/hm/HuamiStepListener;", "onUpdate", "destroy", "huami_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HuamiApiCall implements HuamiDeviceApi {
    private int appCapability;

    @Nullable
    private WearBinder binder;

    /* JADX INFO: renamed from: connection$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy connection;
    private boolean currentDevice;
    private int deviceCapability;

    @NotNull
    private DeviceInfo deviceInfo;

    @Nullable
    private final Messenger messenger;

    public HuamiApiCall(@NotNull DeviceInfo deviceInfo) {
        Intrinsics.checkNotNullParameter(deviceInfo, "deviceInfo");
        this.deviceInfo = deviceInfo;
        this.connection = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: jjc
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HuamiApiCall.connection_delegate$lambda$0(this.f22858a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final HuamiConnection connection_delegate$lambda$0(HuamiApiCall this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return new HuamiConnection(this$0.getDeviceInfo(), this$0);
    }

    @Override // com.xiaomi.wearable.wear.api.IDeviceApiCall
    public void destroy() {
    }

    @Override // com.xiaomi.wearable.wear.api.IDeviceApiCall
    public int getAppCapability() {
        return this.appCapability;
    }

    @Override // com.xiaomi.wearable.wear.api.IDeviceApiCall
    @Nullable
    public WearBinder getBinder() {
        return this.binder;
    }

    @Override // com.xiaomi.wearable.wear.api.IDeviceApiCall
    public boolean getCurrentDevice() {
        return this.currentDevice;
    }

    @Override // com.xiaomi.wearable.wear.api.IDeviceApiCall
    public int getDeviceCapability() {
        return this.deviceCapability;
    }

    @Override // com.xiaomi.wearable.wear.api.IDeviceApiCall
    @NotNull
    public DeviceInfo getDeviceInfo() {
        return this.deviceInfo;
    }

    @Override // com.xiaomi.wearable.wear.api.IDeviceApiCall
    @Nullable
    public Messenger getMessenger() {
        return this.messenger;
    }

    @Override // com.xiaomi.wearable.wear.api.IDeviceApiCall
    public boolean getSpecificModel() {
        return false;
    }

    @Override // com.xiaomi.wearable.wear.api.IDeviceApiCall
    public void init() {
    }

    @Override // com.xiaomi.wearable.wear.api.IDeviceApiCall
    public void onUpdate(@NotNull DeviceInfo deviceInfo) {
        Intrinsics.checkNotNullParameter(deviceInfo, "deviceInfo");
        setDeviceInfo(deviceInfo);
        getConnection().onUpdate(deviceInfo);
    }

    @Override // com.xiaomi.wearable.wear.api.IDeviceApiCall
    public void setAppCapability(int i) {
        this.appCapability = i;
    }

    @Override // com.xiaomi.wearable.wear.api.IDeviceApiCall
    public void setBinder(@Nullable WearBinder wearBinder) {
        this.binder = wearBinder;
    }

    @Override // com.xiaomi.wearable.wear.api.IDeviceApiCall
    public void setCurrentDevice(boolean z) {
        this.currentDevice = z;
    }

    @Override // com.xiaomi.wearable.wear.api.IDeviceApiCall
    public void setDeviceCapability(int i) {
        this.deviceCapability = i;
    }

    @Override // com.xiaomi.wearable.wear.api.IDeviceApiCall
    public void setDeviceCapabilityCallback(@NotNull CapabilityCallback capabilityCallback) {
        HuamiDeviceApi.DefaultImpls.setDeviceCapabilityCallback(this, capabilityCallback);
    }

    @Override // com.xiaomi.wearable.wear.api.IDeviceApiCall
    public void setDeviceInfo(@NotNull DeviceInfo deviceInfo) {
        Intrinsics.checkNotNullParameter(deviceInfo, "<set-?>");
        this.deviceInfo = deviceInfo;
    }

    @Override // com.xiaomi.wearable.huami_export.HuamiDeviceApi
    public void setStepCallback(@NotNull HuamiStepListener callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        getConnection().setStepListener(callback);
    }

    @Override // com.xiaomi.wearable.wear.api.IDeviceApiCall
    @NotNull
    public HuamiConnection getConnection() {
        return (HuamiConnection) this.connection.getValue();
    }
}
