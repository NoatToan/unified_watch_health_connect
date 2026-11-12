package v;

import android.hardware.camera2.CameraCaptureSession;
import androidx.camera.core.impl.b3;

/* JADX INFO: loaded from: classes.dex */
public class z implements androidx.camera.core.impl.v0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final z f174138a = new z();

    @Override // androidx.camera.core.impl.v0.b
    public void a(b3<?> b3Var, androidx.camera.core.impl.v0.a aVar) {
        androidx.camera.core.impl.v0 v0VarR = b3Var.R();
        androidx.camera.core.impl.x0 x0Var = androidx.camera.core.impl.a2.P;
        androidx.camera.core.impl.h hVar = androidx.camera.core.impl.v0.f5810i;
        int i14 = new androidx.camera.core.impl.v0.a().e().f5815c;
        if (v0VarR != null) {
            i14 = v0VarR.f5815c;
            aVar.a(v0VarR.f5817e);
            x0Var = v0VarR.f5814b;
        }
        aVar.f5822b = androidx.camera.core.impl.w1.V(x0Var);
        u.a aVar2 = new u.a(b3Var);
        androidx.camera.core.impl.h hVar2 = u.a.O;
        Integer numValueOf = Integer.valueOf(i14);
        androidx.camera.core.impl.x0 x0Var2 = aVar2.N;
        aVar.f5823c = ((Integer) x0Var2.f(hVar2, numValueOf)).intValue();
        aVar.b(x0.e((CameraCaptureSession.CaptureCallback) x0Var2.f(u.a.S, new y())));
        aVar.c(a0.i.a.c(x0Var2).a());
    }
}
