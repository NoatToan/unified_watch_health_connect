package v;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.util.Rational;
import android.util.Size;
import androidx.camera.camera2.internal.compat.quirk.PreviewPixelHDRnetQuirk;
import androidx.camera.core.impl.b3;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class m0 implements androidx.camera.core.impl.l2.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m0 f173929a = new m0();

    @Override // androidx.camera.core.impl.l2.e
    public final void a(Size size, b3<?> b3Var, androidx.camera.core.impl.l2.b bVar) {
        androidx.camera.core.impl.l2 l2VarH = b3Var.H();
        androidx.camera.core.impl.x0 x0Var = androidx.camera.core.impl.a2.P;
        int i14 = androidx.camera.core.impl.l2.a().f5608g.f5815c;
        if (l2VarH != null) {
            i14 = l2VarH.f5608g.f5815c;
            for (CameraDevice.StateCallback stateCallback : l2VarH.f5604c) {
                ArrayList arrayList = bVar.f5613c;
                if (!arrayList.contains(stateCallback)) {
                    arrayList.add(stateCallback);
                }
            }
            for (CameraCaptureSession.StateCallback stateCallback2 : l2VarH.f5605d) {
                ArrayList arrayList2 = bVar.f5614d;
                if (!arrayList2.contains(stateCallback2)) {
                    arrayList2.add(stateCallback2);
                }
            }
            bVar.f5612b.a(l2VarH.f5608g.f5817e);
            x0Var = l2VarH.f5608g.f5814b;
        }
        androidx.camera.core.impl.v0.a aVar = bVar.f5612b;
        aVar.getClass();
        aVar.f5822b = androidx.camera.core.impl.w1.V(x0Var);
        if (b3Var instanceof androidx.camera.core.impl.d2) {
            Rational rational = y.n.f192953a;
            if (((PreviewPixelHDRnetQuirk) x.c.f188202a.b(PreviewPixelHDRnetQuirk.class)) != null && !y.n.f192953a.equals(new Rational(size.getWidth(), size.getHeight()))) {
                u.a.C3144a c3144a = new u.a.C3144a();
                c3144a.c(CaptureRequest.TONEMAP_MODE, 2);
                bVar.f5612b.c(c3144a.a());
            }
        }
        u.a aVar2 = new u.a(b3Var);
        bVar.f5612b.f5823c = ((Integer) aVar2.N.f(u.a.O, Integer.valueOf(i14))).intValue();
        CameraDevice.StateCallback stateCallback3 = (CameraDevice.StateCallback) aVar2.N.f(u.a.Q, new r0.b());
        ArrayList arrayList3 = bVar.f5613c;
        if (!arrayList3.contains(stateCallback3)) {
            arrayList3.add(stateCallback3);
        }
        CameraCaptureSession.StateCallback stateCallback4 = (CameraCaptureSession.StateCallback) aVar2.N.f(u.a.R, new q0());
        ArrayList arrayList4 = bVar.f5614d;
        if (!arrayList4.contains(stateCallback4)) {
            arrayList4.add(stateCallback4);
        }
        x0 x0VarE = x0.e((CameraCaptureSession.CaptureCallback) aVar2.N.f(u.a.S, new y()));
        bVar.f5612b.b(x0VarE);
        ArrayList arrayList5 = bVar.f5615e;
        if (!arrayList5.contains(x0VarE)) {
            arrayList5.add(x0VarE);
        }
        int iL = b3Var.l();
        if (iL != 0) {
            androidx.camera.core.impl.v0.a aVar3 = bVar.f5612b;
            aVar3.getClass();
            if (iL != 0) {
                aVar3.f5822b.X(b3.G, Integer.valueOf(iL));
            }
        }
        int iC = b3Var.C();
        if (iC != 0) {
            androidx.camera.core.impl.v0.a aVar4 = bVar.f5612b;
            aVar4.getClass();
            if (iC != 0) {
                aVar4.f5822b.X(b3.F, Integer.valueOf(iC));
            }
        }
        androidx.camera.core.impl.w1 w1VarU = androidx.camera.core.impl.w1.U();
        androidx.camera.core.impl.h hVar = u.a.T;
        w1VarU.X(hVar, (String) aVar2.N.f(hVar, null));
        androidx.camera.core.impl.h hVar2 = u.a.P;
        Long l14 = (Long) aVar2.N.f(hVar2, -1L);
        l14.getClass();
        w1VarU.X(hVar2, l14);
        bVar.f5612b.c(w1VarU);
        bVar.f5612b.c(a0.i.a.c(aVar2.N).a());
    }
}
