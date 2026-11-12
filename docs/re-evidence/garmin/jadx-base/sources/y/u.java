package y;

import androidx.camera.camera2.internal.compat.quirk.CaptureIntentPreviewQuirk;
import androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailedForVideoSnapshotQuirk;
import androidx.camera.core.impl.i2;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f192964a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f192965b;

    public u(i2 i2Var) {
        boolean z14;
        Iterator it = i2Var.c(CaptureIntentPreviewQuirk.class).iterator();
        while (it.hasNext()) {
            if (((CaptureIntentPreviewQuirk) it.next()).a()) {
                z14 = true;
                this.f192964a = z14;
                this.f192965b = i2Var.a(ImageCaptureFailedForVideoSnapshotQuirk.class);
            }
        }
        z14 = false;
        this.f192964a = z14;
        this.f192965b = i2Var.a(ImageCaptureFailedForVideoSnapshotQuirk.class);
    }
}
