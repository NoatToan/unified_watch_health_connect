package androidx.camera.camera2.internal.compat.quirk;

import android.annotation.SuppressLint;
import android.os.Build;
import androidx.camera.core.impl.e2;
import d53.u;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/camera/camera2/internal/compat/quirk/PreviewUnderExposureQuirk;", "Landroidx/camera/core/impl/e2;", "<init>", "()V", "camera-camera2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"CameraXQuirksClassDetector"})
public final class PreviewUnderExposureQuirk implements e2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PreviewUnderExposureQuirk f5401a = new PreviewUnderExposureQuirk();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final boolean f5402b = u.q(Build.BRAND, "TCL", true);

    private PreviewUnderExposureQuirk() {
    }
}
