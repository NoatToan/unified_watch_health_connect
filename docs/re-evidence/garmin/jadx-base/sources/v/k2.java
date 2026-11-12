package v;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Build;
import androidx.camera.core.CameraControl;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class k2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f173869a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final androidx.lifecycle.y0<Integer> f173870b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final androidx.lifecycle.y0<Integer> f173871c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f173872d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Executor f173873e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f173874f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f173875g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public androidx.concurrent.futures.b.a<Void> f173876h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f173877i;

    /* JADX WARN: Code duplicated, block: B:17:0x0044  */
    public k2(l lVar, androidx.camera.camera2.internal.compat.h hVar, Executor executor) {
        boolean z14;
        int i14;
        this.f173869a = lVar;
        this.f173873e = executor;
        Objects.requireNonNull(hVar);
        boolean zA = y.f.a(new tr2.b(hVar, 15));
        this.f173872d = zA;
        if (hVar.d() && (i14 = Build.VERSION.SDK_INT) >= 35) {
            Integer num = (!hVar.d() || i14 < 35) ? null : (Integer) hVar.a(CameraCharacteristics.FLASH_TORCH_STRENGTH_MAX_LEVEL);
            z14 = (num == null ? 1 : num.intValue()) > 1;
        }
        int iB = (zA && z14) ? hVar.b() : 0;
        this.f173875g = iB;
        this.f173870b = new androidx.lifecycle.y0<>(0);
        this.f173871c = new androidx.lifecycle.y0<>(Integer.valueOf(iB));
        lVar.p(new l.c() { // from class: v.j2
            @Override // v.l.c
            public final boolean a(TotalCaptureResult totalCaptureResult) {
                k2 k2Var = this.f173855a;
                if (k2Var.f173876h != null) {
                    Integer num2 = (Integer) totalCaptureResult.getRequest().get(CaptureRequest.FLASH_MODE);
                    if ((num2 != null && num2.intValue() == 2) == k2Var.f173877i) {
                        k2Var.f173876h.b(null);
                        k2Var.f173876h = null;
                    }
                }
                return false;
            }
        });
    }

    public final void a(androidx.concurrent.futures.b.a<Void> aVar, int i14) {
        if (!this.f173872d) {
            if (aVar != null) {
                aVar.d(new IllegalStateException("No flash unit"));
                return;
            }
            return;
        }
        if (!this.f173874f) {
            b(0);
            if (aVar != null) {
                aVar.d(new CameraControl.OperationCanceledException("Camera is not active."));
                return;
            }
            return;
        }
        l lVar = this.f173869a;
        lVar.getClass();
        this.f173877i = i14 != 0;
        lVar.r(i14);
        b(i14);
        androidx.concurrent.futures.b.a<Void> aVar2 = this.f173876h;
        if (aVar2 != null) {
            aVar2.d(new CameraControl.OperationCanceledException("There is a new enableTorch being set"));
        }
        this.f173876h = aVar;
    }

    public final void b(int i14) {
        Integer numValueOf = Integer.valueOf(i14 != 1 ? 0 : 1);
        boolean zB = j0.u.b();
        androidx.lifecycle.y0<Integer> y0Var = this.f173870b;
        if (zB) {
            y0Var.m(numValueOf);
        } else {
            y0Var.j(numValueOf);
        }
    }
}
