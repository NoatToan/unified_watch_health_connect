package com.xiaomi.wearable.spp;

import com.xiaomi.wearable.core.DeviceInfo;
import defpackage.izc;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\"\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/xiaomi/wearable/core/DeviceInfo;", "deviceInfo", "Lizc;", "createSppClient", "(Lcom/xiaomi/wearable/core/DeviceInfo;)Lizc;", "", "TAG", "Ljava/lang/String;", "miwear-core_release"}, k = 2, mv = {2, 0, 0})
public final class ClientManagerKt {

    @NotNull
    private static final String TAG = "SppClientFactory";

    @NotNull
    public static final izc createSppClient(@NotNull DeviceInfo deviceInfo) {
        Intrinsics.checkNotNullParameter(deviceInfo, "deviceInfo");
        return new SystemClient(deviceInfo.getAddress(), deviceInfo.getCreateBondWithoutDialog());
    }
}
