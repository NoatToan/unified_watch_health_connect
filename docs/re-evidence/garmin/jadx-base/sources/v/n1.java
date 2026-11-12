package v;

import androidx.camera.core.CameraControl;
import androidx.camera.core.impl.CameraControlInternal;

/* JADX INFO: loaded from: classes.dex */
public class n1 extends androidx.camera.core.impl.s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ androidx.concurrent.futures.b.a f173938a;

    public n1(o1 o1Var, androidx.concurrent.futures.b.a aVar) {
        this.f173938a = aVar;
    }

    @Override // androidx.camera.core.impl.s
    public final void a(int i14) {
        androidx.concurrent.futures.b.a aVar = this.f173938a;
        if (aVar != null) {
            aVar.d(new CameraControl.OperationCanceledException("Camera is closed"));
        }
    }

    @Override // androidx.camera.core.impl.s
    public final void b(int i14, androidx.camera.core.impl.c0 c0Var) {
        androidx.concurrent.futures.b.a aVar = this.f173938a;
        if (aVar != null) {
            aVar.b(c0Var);
        }
    }

    @Override // androidx.camera.core.impl.s
    public final void c(int i14, androidx.camera.core.impl.u uVar) {
        androidx.concurrent.futures.b.a aVar = this.f173938a;
        if (aVar != null) {
            aVar.d(new CameraControlInternal.CameraControlException(uVar));
        }
    }
}
