package v;

import android.hardware.camera2.CaptureRequest;
import androidx.camera.camera2.internal.compat.quirk.ImageCapturePixelHDRPlusQuirk;
import androidx.camera.core.impl.b3;

/* JADX INFO: loaded from: classes.dex */
public final class s1 extends z {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final s1 f174067c = new s1(new y.i());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y.i f174068b;

    private s1(y.i iVar) {
        this.f174068b = iVar;
    }

    @Override // v.z, androidx.camera.core.impl.v0.b
    public final void a(b3<?> b3Var, androidx.camera.core.impl.v0.a aVar) {
        super.a(b3Var, aVar);
        if (!(b3Var instanceof androidx.camera.core.impl.l1)) {
            vb.h.s("config is not ImageCaptureConfig");
            return;
        }
        androidx.camera.core.impl.l1 l1Var = (androidx.camera.core.impl.l1) b3Var;
        u.a.C3144a c3144a = new u.a.C3144a();
        androidx.camera.core.impl.h hVar = androidx.camera.core.impl.l1.O;
        if (l1Var.b(hVar)) {
            y.i iVar = this.f174068b;
            int iIntValue = ((Integer) l1Var.e(hVar)).intValue();
            iVar.getClass();
            if (((ImageCapturePixelHDRPlusQuirk) x.c.f188202a.b(ImageCapturePixelHDRPlusQuirk.class)) != null) {
                if (iIntValue == 0) {
                    c3144a.c(CaptureRequest.CONTROL_ENABLE_ZSL, Boolean.TRUE);
                } else if (iIntValue == 1) {
                    c3144a.c(CaptureRequest.CONTROL_ENABLE_ZSL, Boolean.FALSE);
                }
            }
        }
        aVar.c(c3144a.a());
    }
}
