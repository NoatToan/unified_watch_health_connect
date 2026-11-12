package com.xiaomi.fitness.device.manager;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.xiaomi.fitness.device.manager.DeviceModel;
import com.xiaomi.fitness.device.manager.bean.Device;
import com.xiaomi.fitness.device.manager.bean.DeviceInfo;
import com.xiaomi.passport.utils.LoginPreferenceConfig;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000*\u0018\b\u0000\u0010\u0001*\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u00030\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\u0011\u001a\u00020\u000fH\u0010¢\u0006\u0002\b\u0012J\u0010\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\nH\u0016J\u0010\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\nH\u0016J-\u0010\u0016\u001a\u00020\u000f2#\u0010\u0014\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00018\u0000¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\u000f0\u000eH\u0016J-\u0010\u001a\u001a\u00020\u000f2#\u0010\u0014\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00018\u0000¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\u000f0\u000eH\u0016R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR(\u0010\r\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0004\u0012\u00020\u000f0\u000e0\tX\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\f¨\u0006\u001b"}, d2 = {"Lcom/xiaomi/fitness/device/manager/BaseDeviceManager;", "T", "Lcom/xiaomi/fitness/device/manager/DeviceModel;", "Lcom/xiaomi/fitness/device/manager/bean/DeviceInfo;", "Lcom/xiaomi/fitness/device/manager/bean/Device;", "Lcom/xiaomi/fitness/device/manager/DeviceManager;", "<init>", "()V", "mDeviceStatusListeners", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Lcom/xiaomi/fitness/device/manager/OnDeviceStatusListener;", "getMDeviceStatusListeners", "()Ljava/util/concurrent/CopyOnWriteArrayList;", "mDeviceChangeListeners", "Lkotlin/Function1;", "", "getMDeviceChangeListeners", LoginPreferenceConfig.TYPE_REGISTER, "register$device_manager_release", "addDeviceStatusListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "removeDeviceStatusListener", "addDeviceChangeListener", "Lkotlin/ParameterName;", "name", "deviceModel", "removeDeviceChangeListener", "device-manager_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class BaseDeviceManager<T extends DeviceModel<? extends DeviceInfo<? extends Device>>> implements DeviceManager<T> {

    @NotNull
    private final CopyOnWriteArrayList<OnDeviceStatusListener> mDeviceStatusListeners = new CopyOnWriteArrayList<>();

    @NotNull
    private final CopyOnWriteArrayList<Function1<T, Unit>> mDeviceChangeListeners = new CopyOnWriteArrayList<>();

    public BaseDeviceManager() {
        register$device_manager_release();
    }

    @Override // com.xiaomi.fitness.device.manager.DeviceManager
    public void addDeviceChangeListener(@NotNull Function1<? super T, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.mDeviceChangeListeners.add(listener);
    }

    @Override // com.xiaomi.fitness.device.manager.DeviceManager
    public void addDeviceStatusListener(@NotNull OnDeviceStatusListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.mDeviceStatusListeners.add(listener);
    }

    @NotNull
    public final CopyOnWriteArrayList<Function1<T, Unit>> getMDeviceChangeListeners() {
        return this.mDeviceChangeListeners;
    }

    @NotNull
    public final CopyOnWriteArrayList<OnDeviceStatusListener> getMDeviceStatusListeners() {
        return this.mDeviceStatusListeners;
    }

    public void register$device_manager_release() {
        List<DeviceManager<DeviceModel<DeviceInfo<Device>>>> managers$device_manager_release = DeviceManagerImpl.INSTANCE.getManagers$device_manager_release();
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type com.xiaomi.fitness.device.manager.DeviceManager<com.xiaomi.fitness.device.manager.DeviceModel<com.xiaomi.fitness.device.manager.bean.DeviceInfo<com.xiaomi.fitness.device.manager.bean.Device>>>");
        managers$device_manager_release.add(this);
    }

    @Override // com.xiaomi.fitness.device.manager.DeviceManager
    public void removeDeviceChangeListener(@NotNull Function1<? super T, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.mDeviceChangeListeners.remove(listener);
    }

    @Override // com.xiaomi.fitness.device.manager.DeviceManager
    public void removeDeviceStatusListener(@NotNull OnDeviceStatusListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.mDeviceStatusListeners.remove(listener);
    }
}
