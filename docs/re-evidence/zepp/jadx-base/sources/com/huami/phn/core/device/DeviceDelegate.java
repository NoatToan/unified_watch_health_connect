package com.huami.phn.core.device;

import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0015\u0010\u0016R5\u0010\f\u001a\u0015\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002¢\u0006\u0002\b\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR*\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"Lcom/huami/phn/core/device/DeviceDelegate;", "", "Lkotlin/Function1;", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "", "Lkotlin/ExtensionFunctionType;", "a", "Lkotlin/jvm/functions/Function1;", "getDeviceName", "()Lkotlin/jvm/functions/Function1;", "setDeviceName", "(Lkotlin/jvm/functions/Function1;)V", "deviceName", "", "b", "Ljava/util/List;", "getPhnDeviceSource", "()Ljava/util/List;", "setPhnDeviceSource", "(Ljava/util/List;)V", "phnDeviceSource", "<init>", "()V", "phn_coach_release"}, k = 1, mv = {1, 5, 1})
public final class DeviceDelegate {

    @NotNull
    public static final DeviceDelegate INSTANCE = new DeviceDelegate();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private static Function1<? super HMDeviceSource, String> deviceName;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private static List<? extends HMDeviceSource> phnDeviceSource;

    private DeviceDelegate() {
    }

    @Nullable
    public final Function1<HMDeviceSource, String> getDeviceName() {
        return deviceName;
    }

    @Nullable
    public final List<HMDeviceSource> getPhnDeviceSource() {
        return phnDeviceSource;
    }

    public final void setDeviceName(@Nullable Function1<? super HMDeviceSource, String> function1) {
        deviceName = function1;
    }

    public final void setPhnDeviceSource(@Nullable List<? extends HMDeviceSource> list) {
        phnDeviceSource = list;
    }
}
