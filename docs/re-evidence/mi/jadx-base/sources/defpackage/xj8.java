package defpackage;

import android.hardware.camera2.CaptureRequest;
import androidx.annotation.RequiresApi;
import androidx.camera.core.CameraControl;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public class xj8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dd3 f39177a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yj8 f39178b;
    public final Executor c;
    public boolean d = false;
    public cb3.a<Integer> e;
    public dd3.c f;

    public xj8(dd3 dd3Var, vf3 vf3Var, Executor executor) {
        this.f39177a = dd3Var;
        this.f39178b = new yj8(vf3Var, 0);
        this.c = executor;
    }

    public final void a() {
        cb3.a<Integer> aVar = this.e;
        if (aVar != null) {
            aVar.f(new CameraControl.OperationCanceledException("Cancelled by another setExposureCompensationIndex()"));
            this.e = null;
        }
        dd3.c cVar = this.f;
        if (cVar != null) {
            this.f39177a.X(cVar);
            this.f = null;
        }
    }

    public void b(boolean z) {
        if (z == this.d) {
            return;
        }
        this.d = z;
        if (z) {
            return;
        }
        this.f39178b.b(0);
        a();
    }

    public void c(pe3.a aVar) {
        aVar.e(CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION, Integer.valueOf(this.f39178b.a()));
    }
}
