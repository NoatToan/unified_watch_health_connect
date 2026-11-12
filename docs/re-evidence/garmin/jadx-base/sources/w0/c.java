package w0;

import android.content.Context;
import android.hardware.camera2.CameraManager;

/* JADX INFO: loaded from: classes.dex */
public class c implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CameraManager f180992a;

    public c(Context context) {
        this.f180992a = (CameraManager) context.getSystemService(CameraManager.class);
    }

    @Override // w0.f
    public final b a(String str) {
        return new b(this.f180992a, str);
    }
}
