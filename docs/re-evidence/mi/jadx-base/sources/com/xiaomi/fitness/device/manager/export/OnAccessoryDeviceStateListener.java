package com.xiaomi.fitness.device.manager.export;

import com.miui.tsmclient.util.Constants;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&J\"\u0010\n\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/fitness/device/manager/export/OnAccessoryDeviceStateListener;", "", "onAccessoryDeviceModeChange", "", "did", "", "mode", "", Constants.EXTRA_FROM_APP, "", "onAccessoryDeviceModeDuplicate", "device-manager-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface OnAccessoryDeviceStateListener {
    void onAccessoryDeviceModeChange(@Nullable String did, int mode, boolean fromApp);

    void onAccessoryDeviceModeDuplicate(@Nullable String did, int mode, boolean fromApp);
}
