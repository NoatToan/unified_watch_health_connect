package androidx.camera.video.internal.compat.quirk;

import android.os.Build;
import androidx.camera.core.impl.k0;
import z0.u;

/* JADX INFO: loaded from: classes.dex */
public class VideoEncoderCrashQuirk implements VideoQualityQuirk {
    @Override // androidx.camera.video.internal.compat.quirk.VideoQualityQuirk
    public final boolean c(k0 k0Var, u uVar) {
        return "positivo".equalsIgnoreCase(Build.BRAND) && "twist 2 pro".equalsIgnoreCase(Build.MODEL) && k0Var.b() == 0 && uVar == u.f200708a;
    }
}
