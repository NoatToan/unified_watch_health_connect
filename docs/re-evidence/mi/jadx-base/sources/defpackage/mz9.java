package defpackage;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.MeteringRectangle;
import android.util.Rational;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import androidx.camera.core.CameraControl;
import androidx.camera.core.impl.CameraCaptureFailure;
import androidx.camera.core.impl.CameraControlInternal;
import androidx.camera.core.impl.e;
import java.util.Collections;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public class mz9 {
    public static final MeteringRectangle[] u = new MeteringRectangle[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dd3 f27369a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f27370b;
    public final ScheduledExecutorService c;
    public final wtf f;
    public ScheduledFuture<?> i;
    public MeteringRectangle[] p;
    public MeteringRectangle[] q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public MeteringRectangle[] f27372r;
    public cb3.a<Object> s;
    public cb3.a<Void> t;
    public volatile boolean d = false;
    public volatile Rational e = null;
    public boolean g = false;
    public Integer h = 0;
    public long j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f27371k = false;
    public boolean l = false;
    public int m = 1;
    public dd3.c n = null;
    public dd3.c o = null;

    public class a extends we3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ cb3.a f27373a;

        public a(cb3.a aVar) {
            this.f27373a = aVar;
        }

        @Override // defpackage.we3
        public void a() {
            cb3.a aVar = this.f27373a;
            if (aVar != null) {
                aVar.f(new CameraControl.OperationCanceledException("Camera is closed"));
            }
        }

        @Override // defpackage.we3
        public void b(ye3 ye3Var) {
            cb3.a aVar = this.f27373a;
            if (aVar != null) {
                aVar.c(ye3Var);
            }
        }

        @Override // defpackage.we3
        public void c(CameraCaptureFailure cameraCaptureFailure) {
            cb3.a aVar = this.f27373a;
            if (aVar != null) {
                aVar.f(new CameraControlInternal.CameraControlException(cameraCaptureFailure));
            }
        }
    }

    public class b extends we3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ cb3.a f27375a;

        public b(cb3.a aVar) {
            this.f27375a = aVar;
        }

        @Override // defpackage.we3
        public void a() {
            cb3.a aVar = this.f27375a;
            if (aVar != null) {
                aVar.f(new CameraControl.OperationCanceledException("Camera is closed"));
            }
        }

        @Override // defpackage.we3
        public void b(ye3 ye3Var) {
            cb3.a aVar = this.f27375a;
            if (aVar != null) {
                aVar.c(null);
            }
        }

        @Override // defpackage.we3
        public void c(CameraCaptureFailure cameraCaptureFailure) {
            cb3.a aVar = this.f27375a;
            if (aVar != null) {
                aVar.f(new CameraControlInternal.CameraControlException(cameraCaptureFailure));
            }
        }
    }

    public mz9(dd3 dd3Var, ScheduledExecutorService scheduledExecutorService, Executor executor, lgi lgiVar) {
        MeteringRectangle[] meteringRectangleArr = u;
        this.p = meteringRectangleArr;
        this.q = meteringRectangleArr;
        this.f27372r = meteringRectangleArr;
        this.s = null;
        this.t = null;
        this.f27369a = dd3Var;
        this.f27370b = executor;
        this.c = scheduledExecutorService;
        this.f = new wtf(lgiVar);
    }

    public void b(pe3.a aVar) {
        aVar.e(CaptureRequest.CONTROL_AF_MODE, Integer.valueOf(this.f27369a.C(this.g ? 1 : j())));
        MeteringRectangle[] meteringRectangleArr = this.p;
        if (meteringRectangleArr.length != 0) {
            aVar.e(CaptureRequest.CONTROL_AF_REGIONS, meteringRectangleArr);
        }
        MeteringRectangle[] meteringRectangleArr2 = this.q;
        if (meteringRectangleArr2.length != 0) {
            aVar.e(CaptureRequest.CONTROL_AE_REGIONS, meteringRectangleArr2);
        }
        MeteringRectangle[] meteringRectangleArr3 = this.f27372r;
        if (meteringRectangleArr3.length != 0) {
            aVar.e(CaptureRequest.CONTROL_AWB_REGIONS, meteringRectangleArr3);
        }
    }

    public void c(boolean z, boolean z2) {
        if (this.d) {
            e.a aVar = new e.a();
            aVar.q(true);
            aVar.p(this.m);
            pe3.a aVar2 = new pe3.a();
            if (z) {
                aVar2.e(CaptureRequest.CONTROL_AF_TRIGGER, 2);
            }
            if (z2) {
                aVar2.e(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 2);
            }
            aVar.e(aVar2.c());
            this.f27369a.d0(Collections.singletonList(aVar.h()));
        }
    }

    public void d(cb3.a<Void> aVar) {
        i("Cancelled by another cancelFocusAndMetering()");
        h("Cancelled by cancelFocusAndMetering()");
        this.t = aVar;
        g();
        if (o()) {
            c(true, false);
        }
        MeteringRectangle[] meteringRectangleArr = u;
        this.p = meteringRectangleArr;
        this.q = meteringRectangleArr;
        this.f27372r = meteringRectangleArr;
        this.g = false;
        final long jG0 = this.f27369a.g0();
        if (this.t != null) {
            final int iC = this.f27369a.C(j());
            dd3.c cVar = new dd3.c() { // from class: lz9
                @Override // dd3.c
                public final boolean a(TotalCaptureResult totalCaptureResult) {
                    return this.f25580a.k(iC, jG0, totalCaptureResult);
                }
            };
            this.o = cVar;
            this.f27369a.t(cVar);
        }
    }

    public void e() {
        d(null);
    }

    public final void f() {
        cb3.a<Void> aVar = this.t;
        if (aVar != null) {
            aVar.c(null);
            this.t = null;
        }
    }

    public final void g() {
        ScheduledFuture<?> scheduledFuture = this.i;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
            this.i = null;
        }
    }

    public final void h(String str) {
        this.f27369a.X(this.n);
        cb3.a<Object> aVar = this.s;
        if (aVar != null) {
            aVar.f(new CameraControl.OperationCanceledException(str));
            this.s = null;
        }
    }

    public final void i(String str) {
        this.f27369a.X(this.o);
        cb3.a<Void> aVar = this.t;
        if (aVar != null) {
            aVar.f(new CameraControl.OperationCanceledException(str));
            this.t = null;
        }
    }

    @VisibleForTesting
    public int j() {
        return this.m != 3 ? 4 : 3;
    }

    public final /* synthetic */ boolean k(int i, long j, TotalCaptureResult totalCaptureResult) {
        if (((Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_MODE)).intValue() != i || !dd3.L(totalCaptureResult, j)) {
            return false;
        }
        f();
        return true;
    }

    public void l(boolean z) {
        if (z == this.d) {
            return;
        }
        this.d = z;
        if (this.d) {
            return;
        }
        e();
    }

    public void m(Rational rational) {
        this.e = rational;
    }

    public void n(int i) {
        this.m = i;
    }

    public final boolean o() {
        return this.p.length > 0;
    }

    public void p(cb3.a<Void> aVar) {
        if (!this.d) {
            if (aVar != null) {
                aVar.f(new CameraControl.OperationCanceledException("Camera is not active."));
                return;
            }
            return;
        }
        e.a aVar2 = new e.a();
        aVar2.p(this.m);
        aVar2.q(true);
        pe3.a aVar3 = new pe3.a();
        aVar3.e(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 1);
        aVar2.e(aVar3.c());
        aVar2.c(new b(aVar));
        this.f27369a.d0(Collections.singletonList(aVar2.h()));
    }

    public void q(cb3.a<ye3> aVar, boolean z) {
        if (!this.d) {
            if (aVar != null) {
                aVar.f(new CameraControl.OperationCanceledException("Camera is not active."));
                return;
            }
            return;
        }
        e.a aVar2 = new e.a();
        aVar2.p(this.m);
        aVar2.q(true);
        pe3.a aVar3 = new pe3.a();
        aVar3.e(CaptureRequest.CONTROL_AF_TRIGGER, 1);
        if (z) {
            aVar3.e(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(this.f27369a.B(1)));
        }
        aVar2.e(aVar3.c());
        aVar2.c(new a(aVar));
        this.f27369a.d0(Collections.singletonList(aVar2.h()));
    }
}
