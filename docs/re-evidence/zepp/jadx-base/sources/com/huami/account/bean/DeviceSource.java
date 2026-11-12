package com.huami.account.bean;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/huami/account/bean/DeviceSource;", "", "Lcom/huami/account/bean/AuthDeviceSource;", "a", "Lcom/huami/account/bean/AuthDeviceSource;", "getVirtualDevice", "()Lcom/huami/account/bean/AuthDeviceSource;", "virtualDevice", "<init>", "()V", "accountui_release"}, k = 1, mv = {1, 5, 1})
public final class DeviceSource {

    @NotNull
    public static final DeviceSource INSTANCE = new DeviceSource();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final AuthDeviceSource virtualDevice = new AuthDeviceSource(-1, -1);

    private DeviceSource() {
    }

    @NotNull
    public final AuthDeviceSource getVirtualDevice() {
        return virtualDevice;
    }
}
