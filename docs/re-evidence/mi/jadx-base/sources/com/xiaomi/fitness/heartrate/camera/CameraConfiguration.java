package com.xiaomi.fitness.heartrate.camera;

import android.hardware.camera2.CaptureRequest;
import android.os.Build;
import android.util.Range;
import androidx.camera.core.o;
import defpackage.qe3;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0011\u0010\r\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0012\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/fitness/heartrate/camera/CameraConfiguration;", "", "Landroidx/camera/core/o$b;", "previewBuilder", "", "configPreviewExtender", "(Landroidx/camera/core/o$b;)V", "", "", "DETECT_DISABLE_TABLE", "Ljava/util/Set;", "FPS_60_TABLE", "", "isEnableDetect", "()Z", "", "getFps", "()I", "fps", "<init>", "()V", "heartrate_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class CameraConfiguration {

    @NotNull
    private static final Set<String> DETECT_DISABLE_TABLE;

    @NotNull
    private static final Set<String> FPS_60_TABLE;

    @NotNull
    public static final CameraConfiguration INSTANCE = new CameraConfiguration();

    static {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        DETECT_DISABLE_TABLE = linkedHashSet;
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        FPS_60_TABLE = linkedHashSet2;
        linkedHashSet.add("tucana");
        linkedHashSet.add("cactus");
        linkedHashSet.add("vela");
        linkedHashSet2.add("laurus");
    }

    private CameraConfiguration() {
    }

    public final void configPreviewExtender(@NotNull o.b previewBuilder) {
        Intrinsics.checkNotNullParameter(previewBuilder, "previewBuilder");
        qe3 qe3VarA = new qe3(previewBuilder).a(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, new Range(Integer.valueOf(getFps()), Integer.valueOf(getFps())));
        Intrinsics.checkNotNullExpressionValue(qe3VarA, "setCaptureRequestOption(...)");
        qe3VarA.a(CaptureRequest.CONTROL_AF_MODE, 4);
        qe3VarA.a(CaptureRequest.CONTROL_AF_TRIGGER, 2);
    }

    public final int getFps() {
        Set<String> set = FPS_60_TABLE;
        return (set.contains(Build.DEVICE) || set.contains(Build.PRODUCT)) ? 60 : 30;
    }

    public final boolean isEnableDetect() {
        Set<String> set = DETECT_DISABLE_TABLE;
        return (set.contains(Build.DEVICE) || set.contains(Build.PRODUCT)) ? false : true;
    }
}
