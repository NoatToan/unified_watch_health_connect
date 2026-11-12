package com.xiaomi.fitness.device.contact.di;

import android.os.IBinder;
import com.xiaomi.fitness.device.contact.DeviceContactImpl;
import com.xiaomi.fitness.device.contact.DeviceContactWrapper;
import com.xiaomi.fitness.device.contact.export.DeviceContact;
import com.xiaomi.fitness.device.contact.remote.DeviceContactEngineImpl;
import com.xiaomi.fitness.device.contact.remote.DeviceContactEngineInternal;
import com.xiaomi.fitness.device.contact.remote.a;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH'¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\rH'¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/fitness/device/contact/di/DeviceSyncModule;", "", "Lcom/xiaomi/fitness/device/contact/remote/DeviceContactEngineImpl;", "binder", "Landroid/os/IBinder;", "bindDeviceContactBinder", "(Lcom/xiaomi/fitness/device/contact/remote/DeviceContactEngineImpl;)Landroid/os/IBinder;", "Lcom/xiaomi/fitness/device/contact/remote/DeviceContactEngineInternal;", "bindDeviceContactEngineInternal", "(Lcom/xiaomi/fitness/device/contact/remote/DeviceContactEngineImpl;)Lcom/xiaomi/fitness/device/contact/remote/DeviceContactEngineInternal;", "Lcom/xiaomi/fitness/device/contact/remote/a;", "bindDeviceContactEngine", "(Lcom/xiaomi/fitness/device/contact/remote/DeviceContactEngineImpl;)Lcom/xiaomi/fitness/device/contact/remote/a;", "Lcom/xiaomi/fitness/device/contact/DeviceContactImpl;", "manager", "Lcom/xiaomi/fitness/device/contact/DeviceContactWrapper;", "bindDeviceContactManagerWrapper", "(Lcom/xiaomi/fitness/device/contact/DeviceContactImpl;)Lcom/xiaomi/fitness/device/contact/DeviceContactWrapper;", "Lcom/xiaomi/fitness/device/contact/export/DeviceContact;", "bindDeviceContactManager", "(Lcom/xiaomi/fitness/device/contact/DeviceContactImpl;)Lcom/xiaomi/fitness/device/contact/export/DeviceContact;", "<init>", "()V", "device-contact_release"}, k = 1, mv = {2, 0, 0})
public abstract class DeviceSyncModule {
    @NotNull
    public abstract IBinder bindDeviceContactBinder(@NotNull DeviceContactEngineImpl binder);

    @NotNull
    public abstract a bindDeviceContactEngine(@NotNull DeviceContactEngineImpl binder);

    @NotNull
    public abstract DeviceContactEngineInternal bindDeviceContactEngineInternal(@NotNull DeviceContactEngineImpl binder);

    @NotNull
    public abstract DeviceContact bindDeviceContactManager(@NotNull DeviceContactImpl manager);

    @NotNull
    public abstract DeviceContactWrapper bindDeviceContactManagerWrapper(@NotNull DeviceContactImpl manager);
}
