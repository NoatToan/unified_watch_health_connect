package y;

import androidx.camera.camera2.internal.compat.quirk.CrashWhenTakingPhotoWithAutoFlashAEModeQuirk;
import androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailWithAutoFlashQuirk;
import androidx.camera.core.impl.i2;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f192938a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f192939b;

    public a(i2 i2Var) {
        this.f192938a = i2Var.a(ImageCaptureFailWithAutoFlashQuirk.class);
        this.f192939b = x.c.f188202a.b(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.class) != null;
    }
}
