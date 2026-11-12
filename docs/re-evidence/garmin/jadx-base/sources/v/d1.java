package v;

import android.hardware.camera2.CameraDevice;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface d1 {
    void a(HashMap map);

    void b(List<androidx.camera.core.impl.v0> list);

    boolean c();

    void close();

    ListenableFuture d(androidx.camera.core.impl.l2 l2Var, CameraDevice cameraDevice, g2 g2Var);

    androidx.camera.core.impl.l2 e();

    void f(androidx.camera.core.impl.l2 l2Var);

    void g();

    List<androidx.camera.core.impl.v0> h();

    ListenableFuture release();
}
