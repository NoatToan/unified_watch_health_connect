package com.xiaomi.fitness.milink.export;

import com.xiaomi.fitness.camera.sport_capture_export.ISportCaptureManager;
import com.xiaomi.fitness.camera.sport_capture_export.SportCaptureExtKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b¨\u0006\t"}, d2 = {"Lcom/xiaomi/fitness/milink/export/CastBizManager;", "", "<init>", "()V", "isOtherCasting", "", "isRequest", "deviceId", "", "milink-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CastBizManager {

    @NotNull
    public static final CastBizManager INSTANCE = new CastBizManager();

    private CastBizManager() {
    }

    public static /* synthetic */ boolean isOtherCasting$default(CastBizManager castBizManager, boolean z, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = "";
        }
        return castBizManager.isOtherCasting(z, str);
    }

    public final boolean isOtherCasting(boolean isRequest, @NotNull String deviceId) {
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        return isRequest ? SportCaptureExtKt.getInstance(ISportCaptureManager.INSTANCE).isSportCaptureDeviceId(deviceId) : SportCaptureExtKt.getInstance(ISportCaptureManager.INSTANCE).isProjecting();
    }
}
