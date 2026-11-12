package com.xiaomi.wearable.wear.api;

import com.xiaomi.wearable.connection.Connection;
import com.xiaomi.wearable.core.CapabilityCallback;
import com.xiaomi.wearable.core.DeviceInfo;
import com.xiaomi.wearable.transport.queue.Messenger;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010'\u001a\u00020(H&J\u0010\u0010)\u001a\u00020(2\u0006\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010*\u001a\u00020(2\u0006\u0010+\u001a\u00020,H\u0016J\b\u0010-\u001a\u00020(H&R\u0018\u0010\u0002\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u0012\u0010\b\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u0004\u0018\u00010\rX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u0004\u0018\u00010\u0011X¦\u000e¢\u0006\f\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0016\u001a\u00020\u0017X¦\u000e¢\u0006\f\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0018\u0010\u001c\u001a\u00020\u001dX¦\u000e¢\u0006\f\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u0018\u0010\"\u001a\u00020\u001dX¦\u000e¢\u0006\f\u001a\u0004\b#\u0010\u001f\"\u0004\b$\u0010!R\u0012\u0010%\u001a\u00020\u0017X¦\u0004¢\u0006\u0006\u001a\u0004\b&\u0010\u0019¨\u0006."}, d2 = {"Lcom/xiaomi/wearable/wear/api/IDeviceApiCall;", "", "deviceInfo", "Lcom/xiaomi/wearable/core/DeviceInfo;", "getDeviceInfo", "()Lcom/xiaomi/wearable/core/DeviceInfo;", "setDeviceInfo", "(Lcom/xiaomi/wearable/core/DeviceInfo;)V", "connection", "Lcom/xiaomi/wearable/connection/Connection;", "getConnection", "()Lcom/xiaomi/wearable/connection/Connection;", "messenger", "Lcom/xiaomi/wearable/transport/queue/Messenger;", "getMessenger", "()Lcom/xiaomi/wearable/transport/queue/Messenger;", "binder", "Lcom/xiaomi/wearable/wear/api/WearBinder;", "getBinder", "()Lcom/xiaomi/wearable/wear/api/WearBinder;", "setBinder", "(Lcom/xiaomi/wearable/wear/api/WearBinder;)V", "currentDevice", "", "getCurrentDevice", "()Z", "setCurrentDevice", "(Z)V", "deviceCapability", "", "getDeviceCapability", "()I", "setDeviceCapability", "(I)V", "appCapability", "getAppCapability", "setAppCapability", "specificModel", "getSpecificModel", "init", "", "onUpdate", "setDeviceCapabilityCallback", "callback", "Lcom/xiaomi/wearable/core/CapabilityCallback;", "destroy", "miwear-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface IDeviceApiCall {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static void setDeviceCapabilityCallback(@NotNull IDeviceApiCall iDeviceApiCall, @NotNull CapabilityCallback callback) {
            Intrinsics.checkNotNullParameter(callback, "callback");
        }
    }

    void destroy();

    int getAppCapability();

    @Nullable
    WearBinder getBinder();

    @NotNull
    Connection getConnection();

    boolean getCurrentDevice();

    int getDeviceCapability();

    @NotNull
    DeviceInfo getDeviceInfo();

    @Nullable
    Messenger getMessenger();

    boolean getSpecificModel();

    void init();

    void onUpdate(@NotNull DeviceInfo deviceInfo);

    void setAppCapability(int i);

    void setBinder(@Nullable WearBinder wearBinder);

    void setCurrentDevice(boolean z);

    void setDeviceCapability(int i);

    void setDeviceCapabilityCallback(@NotNull CapabilityCallback callback);

    void setDeviceInfo(@NotNull DeviceInfo deviceInfo);
}
