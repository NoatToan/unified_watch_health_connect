package com.xiaomi.fitness.device.contact.export;

import com.amap.api.maps.model.MyLocationStyle;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0001H&J\"\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\u0005H&¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/fitness/device/contact/export/DeviceSyncCallback;", "", "onSyncSuccess", "", "did", "", "type", "", "result", "onSyncError", MyLocationStyle.ERROR_INFO, "device-contact-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface DeviceSyncCallback {
    void onSyncError(@NotNull String did, int type, @Nullable String errorInfo);

    void onSyncSuccess(@NotNull String did, int type, @Nullable Object result);
}
