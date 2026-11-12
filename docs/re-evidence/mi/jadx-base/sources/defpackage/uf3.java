package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public class uf3 implements vf3.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CameraCharacteristics f35701a;

    public uf3(CameraCharacteristics cameraCharacteristics) {
        this.f35701a = cameraCharacteristics;
    }

    @Override // vf3.a
    public <T> T a(CameraCharacteristics.Key<T> key) {
        return (T) this.f35701a.get(key);
    }
}
