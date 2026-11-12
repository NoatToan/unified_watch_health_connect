package com.xiaomi.fitness.wearos.export;

import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.LifecycleOwner;
import com.xiaomi.fitness.watch.face.edit.entity.DialWidgetType;
import com.xiaomi.wearable.connection.Connection;
import com.xiaomi.wearable.connection.ConnectionCallback;
import com.xiaomi.wearable.core.CapabilityCallback;
import com.xiaomi.wearable.core.DeviceInfo;
import com.xiaomi.wearable.transport.queue.Messenger;
import com.xiaomi.wearable.wear.api.WearBinder;
import defpackage.kj2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 /2\u00020\u0001:\u0001/B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\u0016\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0007H\u0096@¢\u0006\u0002\u0010\nJ\b\u0010\u000b\u001a\u00020\fH\u0016J.\u0010\r\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u000e\u001a\u00020\f2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00050\u0010H\u0016J&\u0010\u0011\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00050\u0010H\u0016J.\u0010\u0012\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0013\u001a\u00020\u00142\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00050\u0010H\u0016J.\u0010\u0015\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u000e\u001a\u00020\f2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00050\u0010H\u0016J\b\u0010\u0016\u001a\u00020\fH\u0016J-\u0010\u0017\u001a\u00020\u00052#\u0010\u0018\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0019¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u00020\u00050\u0010H\u0016J+\u0010\u001d\u001a\u00020\u00052!\u0010\u001e\u001a\u001d\u0012\u0013\u0012\u00110\u0019¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u00020\u00050\u0010H\u0016J\u000e\u0010 \u001a\b\u0012\u0002\b\u0003\u0018\u00010!H\u0016J:\u0010\"\u001a\u00020\u00052\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u00072\u0006\u0010&\u001a\u00020\u00192\b\u0010'\u001a\u0004\u0018\u00010(2\u0006\u0010)\u001a\u00020\fH\u0016J\b\u0010*\u001a\u00020\fH\u0016J\u0010\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.H\u0016J\u0010\u0010)\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u00060"}, d2 = {"Lcom/xiaomi/fitness/wearos/export/WearOSUtilImpl;", "Lcom/xiaomi/fitness/wearos/export/WearOSUtil;", "<init>", "()V", "associate", "", "nodeId", "", "unbind", "peerId", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isUnderOobe", "", "setCalendarSync", "isChecked", "result", "Lkotlin/Function1;", "getCalendarSync", "getDndSync", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "setDndSync", "isWearosRequirementNotPass", "readBatteryInfo", "callBack", "", "Lkotlin/ParameterName;", "name", DialWidgetType.BATTERY_LEVEL, "syncWearOSBugreport", "handler", "message", "gotoWearOsTilePage", "Ljava/lang/Class;", "launchBindWearOSPage", "context", "Landroid/content/Context;", "mac", "product", "bundles", "Landroid/os/Bundle;", "isPhoneSwitching", "isWearOSZenMode", "getWearOSApi", "Lcom/xiaomi/fitness/wearos/export/WearOSApi;", "deviceInfo", "Lcom/xiaomi/wearable/core/DeviceInfo;", "Companion", "wearos_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class WearOSUtilImpl implements WearOSUtil {

    @NotNull
    public static final String TAG = "WearOSUtil";

    @Override // com.xiaomi.fitness.wearos.export.WearOSUtil
    public void associate(@Nullable String nodeId) {
    }

    @Override // com.xiaomi.fitness.wearos.export.WearOSUtil
    public void getCalendarSync(@Nullable String nodeId, @NotNull Function1<? super Boolean, Unit> result) {
        Intrinsics.checkNotNullParameter(result, "result");
    }

    @Override // com.xiaomi.fitness.wearos.export.WearOSUtil
    public void getDndSync(@Nullable String nodeId, @NotNull LifecycleOwner lifecycleOwner, @NotNull Function1<? super Boolean, Unit> result) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(result, "result");
    }

    @Override // com.xiaomi.fitness.wearos.export.WearOSUtil
    @NotNull
    public WearOSApi getWearOSApi(@NotNull DeviceInfo deviceInfo) {
        Intrinsics.checkNotNullParameter(deviceInfo, "deviceInfo");
        return new WearOSApi() { // from class: com.xiaomi.fitness.wearos.export.WearOSUtilImpl.getWearOSApi.1
            @Override // com.xiaomi.fitness.wearos.export.WearOSApi
            public void bindDevice(kj2 callback) {
                Intrinsics.checkNotNullParameter(callback, "callback");
            }

            @Override // com.xiaomi.wearable.wear.api.IDeviceApiCall
            public void destroy() {
            }

            @Override // com.xiaomi.wearable.wear.api.IDeviceApiCall
            public int getAppCapability() {
                return 0;
            }

            @Override // com.xiaomi.wearable.wear.api.IDeviceApiCall
            public WearBinder getBinder() {
                return null;
            }

            @Override // com.xiaomi.wearable.wear.api.IDeviceApiCall
            public Connection getConnection() {
                return new Connection() { // from class: com.xiaomi.fitness.wearos.export.WearOSUtilImpl$getWearOSApi$1$connection$1
                    @Override // com.xiaomi.wearable.connection.Connection
                    public void connect() {
                    }

                    @Override // com.xiaomi.wearable.connection.Connection
                    public void disconnect(boolean reconnectMonitor) {
                    }

                    @Override // com.xiaomi.wearable.connection.Connection
                    public ConnectionCallback getCallback() {
                        return null;
                    }

                    @Override // com.xiaomi.wearable.connection.Connection
                    public boolean isConnect() {
                        return false;
                    }

                    @Override // com.xiaomi.wearable.connection.Connection
                    public boolean needKeepAlive() {
                        return false;
                    }

                    @Override // com.xiaomi.wearable.connection.Connection
                    public boolean needRetryConnect(int status) {
                        return false;
                    }

                    @Override // com.xiaomi.wearable.connection.Connection
                    public void onBluetoothClose() {
                        Connection.DefaultImpls.onBluetoothClose(this);
                    }

                    @Override // com.xiaomi.wearable.connection.Connection
                    public void onBluetoothOpen() {
                        Connection.DefaultImpls.onBluetoothOpen(this);
                    }

                    @Override // com.xiaomi.wearable.connection.Connection
                    public void setCallback(ConnectionCallback connectionCallback) {
                    }

                    @Override // com.xiaomi.wearable.connection.Connection
                    public void connect(boolean z, boolean z2, int i) {
                        Connection.DefaultImpls.connect(this, z, z2, i);
                    }
                };
            }

            @Override // com.xiaomi.wearable.wear.api.IDeviceApiCall
            public boolean getCurrentDevice() {
                return false;
            }

            @Override // com.xiaomi.wearable.wear.api.IDeviceApiCall
            public int getDeviceCapability() {
                return 0;
            }

            @Override // com.xiaomi.wearable.wear.api.IDeviceApiCall
            public DeviceInfo getDeviceInfo() {
                return new DeviceInfo(null, null, "", null, 0, null, null, null, null, 0, null, false, null, null, null, null, false, false, false, false, 0, 2097147, null);
            }

            @Override // com.xiaomi.wearable.wear.api.IDeviceApiCall
            public Messenger getMessenger() {
                return null;
            }

            @Override // com.xiaomi.wearable.wear.api.IDeviceApiCall
            public boolean getSpecificModel() {
                return false;
            }

            @Override // com.xiaomi.wearable.wear.api.IDeviceApiCall
            public void init() {
            }

            @Override // com.xiaomi.fitness.wearos.export.WearOSApi
            public boolean isPhoneSwitching() {
                return false;
            }

            @Override // com.xiaomi.wearable.wear.api.IDeviceApiCall
            public void onUpdate(DeviceInfo deviceInfo2) {
                Intrinsics.checkNotNullParameter(deviceInfo2, "deviceInfo");
            }

            @Override // com.xiaomi.wearable.wear.api.IDeviceApiCall
            public void setAppCapability(int i) {
            }

            @Override // com.xiaomi.wearable.wear.api.IDeviceApiCall
            public void setBinder(WearBinder wearBinder) {
            }

            @Override // com.xiaomi.wearable.wear.api.IDeviceApiCall
            public void setCurrentDevice(boolean z) {
            }

            @Override // com.xiaomi.wearable.wear.api.IDeviceApiCall
            public void setDeviceCapability(int i) {
            }

            @Override // com.xiaomi.wearable.wear.api.IDeviceApiCall
            public void setDeviceCapabilityCallback(CapabilityCallback capabilityCallback) {
                WearOSApi.DefaultImpls.setDeviceCapabilityCallback(this, capabilityCallback);
            }

            @Override // com.xiaomi.wearable.wear.api.IDeviceApiCall
            public void setDeviceInfo(DeviceInfo value) {
                Intrinsics.checkNotNullParameter(value, "value");
            }
        };
    }

    @Override // com.xiaomi.fitness.wearos.export.WearOSUtil
    @Nullable
    public Class<?> gotoWearOsTilePage() {
        return null;
    }

    @Override // com.xiaomi.fitness.wearos.export.WearOSUtil
    public boolean isPhoneSwitching(@NotNull String nodeId) {
        Intrinsics.checkNotNullParameter(nodeId, "nodeId");
        return false;
    }

    @Override // com.xiaomi.fitness.wearos.export.WearOSUtil
    public boolean isUnderOobe() {
        return false;
    }

    @Override // com.xiaomi.fitness.wearos.export.WearOSUtil
    public boolean isWearOSZenMode() {
        return false;
    }

    @Override // com.xiaomi.fitness.wearos.export.WearOSUtil
    public boolean isWearosRequirementNotPass() {
        return true;
    }

    @Override // com.xiaomi.fitness.wearos.export.WearOSUtil
    public void launchBindWearOSPage(@NotNull Context context, @NotNull String mac, @NotNull String name, int product, @Nullable Bundle bundles, boolean isPhoneSwitching) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(mac, "mac");
        Intrinsics.checkNotNullParameter(name, "name");
    }

    @Override // com.xiaomi.fitness.wearos.export.WearOSUtil
    public void readBatteryInfo(@NotNull Function1<? super Integer, Unit> callBack) {
        Intrinsics.checkNotNullParameter(callBack, "callBack");
    }

    @Override // com.xiaomi.fitness.wearos.export.WearOSUtil
    public void setCalendarSync(@Nullable String nodeId, boolean isChecked, @NotNull Function1<? super Boolean, Unit> result) {
        Intrinsics.checkNotNullParameter(result, "result");
    }

    @Override // com.xiaomi.fitness.wearos.export.WearOSUtil
    public void setDndSync(@Nullable String nodeId, boolean isChecked, @NotNull Function1<? super Boolean, Unit> result) {
        Intrinsics.checkNotNullParameter(result, "result");
    }

    @Override // com.xiaomi.fitness.wearos.export.WearOSUtil
    public void syncWearOSBugreport(@NotNull Function1<? super Integer, Unit> handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
    }

    @Override // com.xiaomi.fitness.wearos.export.WearOSUtil
    @Nullable
    public Object unbind(@NotNull String str, @NotNull Continuation<? super Unit> continuation) {
        return Unit.INSTANCE;
    }
}
