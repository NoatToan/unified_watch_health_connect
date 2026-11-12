package defpackage;

import android.hardware.camera2.CameraDevice;
import androidx.annotation.RequiresApi;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.e;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public interface mk3 {
    lhe<Void> a(SessionConfig sessionConfig, CameraDevice cameraDevice, ivo ivoVar);

    lhe<Void> b(boolean z);

    SessionConfig c();

    void close();

    void d(SessionConfig sessionConfig);

    void e(List<e> list);

    void f();

    List<e> g();
}
