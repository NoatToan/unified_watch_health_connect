package com.xiaomi.fitness.device.contact;

import com.xiaomi.fitness.device.contact.export.DeviceContact;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/xiaomi/fitness/device/contact/DeviceContactWrapper;", "Lcom/xiaomi/fitness/device/contact/DeviceContactInternal;", "Lcom/xiaomi/fitness/device/contact/export/DeviceContact;", "device-contact_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface DeviceContactWrapper extends DeviceContactInternal, DeviceContact {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static void syncDataByWidget(@NotNull DeviceContactWrapper deviceContactWrapper, @NotNull String did, boolean z) {
            Intrinsics.checkNotNullParameter(did, "did");
            DeviceContact.DefaultImpls.syncDataByWidget(deviceContactWrapper, did, z);
        }
    }
}
