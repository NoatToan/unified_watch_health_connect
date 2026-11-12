package androidx.camera.video.internal.compat.quirk;

import android.annotation.SuppressLint;
import android.os.Build;
import androidx.camera.core.impl.e2;
import d53.u;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/camera/video/internal/compat/quirk/PreviewFreezeAfterHighSpeedRecordingQuirk;", "Landroidx/camera/core/impl/e2;", "<init>", "()V", "camera-video_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"CameraXQuirksClassDetector"})
public final class PreviewFreezeAfterHighSpeedRecordingQuirk implements e2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PreviewFreezeAfterHighSpeedRecordingQuirk f6005a = new PreviewFreezeAfterHighSpeedRecordingQuirk();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final boolean f6006b;

    /* JADX WARN: Code duplicated, block: B:7:0x0020  */
    static {
        boolean z14;
        if (u.q(Build.BRAND, "google", true)) {
            String str = Build.MODEL;
            str.getClass();
            z14 = u.y(str, "Pixel", true);
        }
        f6006b = z14;
    }

    private PreviewFreezeAfterHighSpeedRecordingQuirk() {
    }
}
