package com.xiaomi.wearable;

import com.xiaomi.fitness.common.app.AppManager;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.hm.health.bt.sdk.HuamiDevice;
import com.xiaomi.wearable.hm.m;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\"\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/xiaomi/wearable/hm/m;", "", "switchScanMode", "(Lcom/xiaomi/wearable/hm/m;)V", "", "TAG", "Ljava/lang/String;", "huami_release"}, k = 2, mv = {2, 0, 0})
public final class ScanExtKt {

    @NotNull
    private static final String TAG = "RealConnection";

    public static final void switchScanMode(@NotNull m mVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        HuamiDevice.setScanDeviceTimeout(30000);
        if (AppManager.INSTANCE.getInstance().isAppForeground()) {
            Logger.i(TAG, "switchScanMode: SCAN_MODE_LOW_LATENCY");
            HuamiDevice.setScanMode(2);
        } else {
            Logger.i(TAG, "switchScanMode: SCAN_MODE_LOW_POWER");
            HuamiDevice.setScanMode(0);
        }
    }
}
