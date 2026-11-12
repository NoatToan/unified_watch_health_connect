package v;

import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Build;
import android.os.Looper;
import android.util.Range;
import androidx.camera.core.CameraControl;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class o2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f173970a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f173971b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p2 f173972c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final androidx.lifecycle.y0<b0.l1> f173973d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b f173974e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f173975f = false;

    public class a implements l.c {
        public a() {
        }

        @Override // v.l.c
        public final boolean a(TotalCaptureResult totalCaptureResult) {
            o2.this.f173974e.a(totalCaptureResult);
            return false;
        }
    }

    public interface b {
        void a(TotalCaptureResult totalCaptureResult);

        float b();

        float c();

        void d(float f14, androidx.concurrent.futures.b.a<Void> aVar);

        void e();

        Rect f();

        void g(u.a.C3144a c3144a);
    }

    public o2(l lVar, androidx.camera.camera2.internal.compat.h hVar, Executor executor) {
        a aVar = new a();
        this.f173970a = lVar;
        this.f173971b = executor;
        b bVarA = a(hVar);
        this.f173974e = bVarA;
        p2 p2Var = new p2(bVarA.c(), bVarA.b());
        this.f173972c = p2Var;
        p2Var.f(1.0f);
        this.f173973d = new androidx.lifecycle.y0<>(m0.e.e(p2Var));
        lVar.p(aVar);
    }

    public static b a(androidx.camera.camera2.internal.compat.h hVar) {
        Range range;
        if (Build.VERSION.SDK_INT >= 30) {
            try {
                range = (Range) hVar.a(CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE);
            } catch (AssertionError unused) {
                range = null;
            }
            if (range != null) {
                return new v.b(hVar);
            }
        }
        return new f1(hVar);
    }

    public final void b(androidx.concurrent.futures.b.a aVar, m0.a aVar2) {
        m0.a aVarE;
        if (this.f173975f) {
            this.f173974e.d(aVar2.f115487a, aVar);
            this.f173970a.B();
            return;
        }
        synchronized (this.f173972c) {
            this.f173972c.f(1.0f);
            aVarE = m0.e.e(this.f173972c);
        }
        c(aVarE);
        aVar.d(new CameraControl.OperationCanceledException("Camera is not active."));
    }

    public final void c(m0.a aVar) {
        Looper looperMyLooper = Looper.myLooper();
        Looper mainLooper = Looper.getMainLooper();
        androidx.lifecycle.y0<b0.l1> y0Var = this.f173973d;
        if (looperMyLooper == mainLooper) {
            y0Var.m(aVar);
        } else {
            y0Var.j(aVar);
        }
    }
}
