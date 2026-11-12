package androidx.camera.camera2.internal.compat;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class t extends s {
    public t(Context context) {
        super(context);
    }

    @Override // androidx.camera.camera2.internal.compat.u, androidx.camera.camera2.internal.compat.q.b
    public final Set<Set<String>> d() throws CameraAccessExceptionCompat {
        try {
            return this.f5409a.getConcurrentCameraIds();
        } catch (CameraAccessException e4) {
            throw CameraAccessExceptionCompat.toCameraAccessExceptionCompat(e4);
        }
    }
}
