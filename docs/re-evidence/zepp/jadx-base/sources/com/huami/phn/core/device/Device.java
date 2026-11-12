package com.huami.phn.core.device;

import com.xiaomi.hm.health.device.webapi.device.HMDeviceWebAPI;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bR\u0016\u0010\u0003\u001a\u00020\u00028&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0004R\u0016\u0010\t\u001a\u00020\u00068&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lcom/huami/phn/core/device/Device;", "", "", "isPhnSupport", "()Z", "isPhnEnable", "", "getDisplayName", "()Ljava/lang/String;", HMDeviceWebAPI.PARAM_UPDATE_DEVICE_INFO_DISPLAY_NAME, "<init>", "()V", "phn_coach_release"}, k = 1, mv = {1, 5, 1})
public abstract class Device {
    @NotNull
    public abstract String getDisplayName();

    public abstract boolean isPhnEnable();

    public abstract boolean isPhnSupport();
}
