package v;

import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraDevice;
import android.view.Surface;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class t extends CameraDevice.StateCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ androidx.concurrent.futures.b.a f174082a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f174083b;

    public t(s sVar, androidx.concurrent.futures.b.a aVar) {
        this.f174083b = sVar;
        this.f174082a = aVar;
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onClosed(CameraDevice cameraDevice) {
        this.f174083b.toString();
        this.f174082a.b(null);
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onDisconnected(CameraDevice cameraDevice) {
        this.f174083b.toString();
        this.f174082a.b(null);
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onError(CameraDevice cameraDevice, int i14) {
        this.f174083b.toString();
        this.f174082a.b(null);
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onOpened(CameraDevice cameraDevice) {
        s sVar = this.f174083b;
        sVar.toString();
        k0.h hVar = sVar.f174008c;
        c1 c1Var = new c1(sVar.f174017k0);
        SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        surfaceTexture.setDefaultBufferSize(640, 480);
        Surface surface = new Surface(surfaceTexture);
        androidx.camera.core.impl.p1 p1Var = new androidx.camera.core.impl.p1(surface);
        l0.j.f(p1Var.f5471e).addListener(new r0.h(21, surface, surfaceTexture), k0.b.a());
        androidx.camera.core.impl.l2.b bVar = new androidx.camera.core.impl.l2.b();
        b0.b0 b0Var = b0.b0.f13854d;
        androidx.camera.core.impl.o.b bVarA = androidx.camera.core.impl.l2.f.a(p1Var);
        if (b0Var == null) {
            j20.x.l("Null dynamicRange");
            return;
        }
        bVarA.f5663e = b0Var;
        bVar.f5611a.add(bVarA.a());
        bVar.f5612b.f5823c = 1;
        sVar.toString();
        androidx.camera.core.impl.l2 l2VarC = bVar.c();
        c2.a aVar = sVar.F;
        ListenableFuture listenableFutureD = c1Var.d(l2VarC, cameraDevice, new g2(aVar.f173753e, aVar.f173754f, aVar.f173752d, aVar.f173749a, aVar.f173750b, aVar.f173751c));
        androidx.concurrent.futures.b.a aVar2 = new androidx.concurrent.futures.b.a();
        androidx.concurrent.futures.b.d<T> dVar = new androidx.concurrent.futures.b.d<>(aVar2);
        aVar2.f6080b = dVar;
        aVar2.f6079a = h.class;
        try {
            listenableFutureD.addListener(new l0.g(aVar2, 0), k0.b.a());
            aVar2.f6079a = "transformVoidFuture [" + listenableFutureD + "]";
        } catch (Exception e4) {
            dVar.a(e4);
        }
        l0.b bVarJ = l0.j.j(l0.d.a(dVar), new o62.b0(19, c1Var, p1Var), hVar);
        Objects.requireNonNull(cameraDevice);
        bVarJ.addListener(new po.g(cameraDevice, 28), hVar);
    }
}
