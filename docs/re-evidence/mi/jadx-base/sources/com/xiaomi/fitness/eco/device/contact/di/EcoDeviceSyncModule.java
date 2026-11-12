package com.xiaomi.fitness.eco.device.contact.di;

import android.os.IBinder;
import com.xiaomi.fitness.eco.device.contact.EcoDeviceContactImpl;
import com.xiaomi.fitness.eco.device.contact.export.EcoDeviceContact;
import com.xiaomi.fitness.eco.device.contact.remote.EcoDeviceContactEngineImpl;
import com.xiaomi.fitness.eco.device.contact.remote.EcoDeviceContactEngineInternal;
import com.xiaomi.fitness.eco.device.contact.remote.a;
import defpackage.dr7;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH'¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\rH'¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/fitness/eco/device/contact/di/EcoDeviceSyncModule;", "", "Lcom/xiaomi/fitness/eco/device/contact/remote/EcoDeviceContactEngineImpl;", "binder", "Landroid/os/IBinder;", "bindEcoDeviceContactBinder", "(Lcom/xiaomi/fitness/eco/device/contact/remote/EcoDeviceContactEngineImpl;)Landroid/os/IBinder;", "Lcom/xiaomi/fitness/eco/device/contact/remote/EcoDeviceContactEngineInternal;", "bindEcoDeviceContactEngineInternal", "(Lcom/xiaomi/fitness/eco/device/contact/remote/EcoDeviceContactEngineImpl;)Lcom/xiaomi/fitness/eco/device/contact/remote/EcoDeviceContactEngineInternal;", "Lcom/xiaomi/fitness/eco/device/contact/remote/a;", "bindEcoDeviceContactEngine", "(Lcom/xiaomi/fitness/eco/device/contact/remote/EcoDeviceContactEngineImpl;)Lcom/xiaomi/fitness/eco/device/contact/remote/a;", "Lcom/xiaomi/fitness/eco/device/contact/EcoDeviceContactImpl;", "manager", "Ldr7;", "bindEcoDeviceContactManagerWrapper", "(Lcom/xiaomi/fitness/eco/device/contact/EcoDeviceContactImpl;)Ldr7;", "Lcom/xiaomi/fitness/eco/device/contact/export/EcoDeviceContact;", "bindEcoDeviceContactManager", "(Lcom/xiaomi/fitness/eco/device/contact/EcoDeviceContactImpl;)Lcom/xiaomi/fitness/eco/device/contact/export/EcoDeviceContact;", "<init>", "()V", "eco-device-contact_release"}, k = 1, mv = {2, 0, 0})
public abstract class EcoDeviceSyncModule {
    @NotNull
    public abstract IBinder bindEcoDeviceContactBinder(@NotNull EcoDeviceContactEngineImpl binder);

    @NotNull
    public abstract a bindEcoDeviceContactEngine(@NotNull EcoDeviceContactEngineImpl binder);

    @NotNull
    public abstract EcoDeviceContactEngineInternal bindEcoDeviceContactEngineInternal(@NotNull EcoDeviceContactEngineImpl binder);

    @NotNull
    public abstract EcoDeviceContact bindEcoDeviceContactManager(@NotNull EcoDeviceContactImpl manager);

    @NotNull
    public abstract dr7 bindEcoDeviceContactManagerWrapper(@NotNull EcoDeviceContactImpl manager);
}
