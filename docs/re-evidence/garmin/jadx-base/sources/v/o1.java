package v;

import android.graphics.PointF;
import android.graphics.Rect;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.MeteringRectangle;
import android.util.Rational;
import androidx.camera.camera2.internal.compat.quirk.AfRegionFlipHorizontallyQuirk;
import androidx.camera.core.CameraControl;
import androidx.camera.core.impl.CameraControlInternal;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;

/* JADX INFO: loaded from: classes.dex */
public class o1 {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final MeteringRectangle[] f173947v = new MeteringRectangle[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f173948a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f173949b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ScheduledExecutorService f173950c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final y.k f173953f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ScheduledFuture<?> f173956i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ScheduledFuture<?> f173957j;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public MeteringRectangle[] f173963p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public MeteringRectangle[] f173964q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public MeteringRectangle[] f173965r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public androidx.concurrent.futures.b.a<b0.e0> f173966s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f173967t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public m1 f173968u;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile boolean f173951d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile Rational f173952e = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f173954g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Integer f173955h = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f173958k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f173959l = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f173960m = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f173961n = 1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public k1 f173962o = null;

    public class a extends androidx.camera.core.impl.s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ androidx.concurrent.futures.b.a f173969a;

        public a(o1 o1Var, androidx.concurrent.futures.b.a aVar) {
            this.f173969a = aVar;
        }

        @Override // androidx.camera.core.impl.s
        public final void a(int i14) {
            androidx.concurrent.futures.b.a aVar = this.f173969a;
            if (aVar != null) {
                aVar.d(new CameraControl.OperationCanceledException("Camera is closed"));
            }
        }

        @Override // androidx.camera.core.impl.s
        public final void b(int i14, androidx.camera.core.impl.c0 c0Var) {
            androidx.concurrent.futures.b.a aVar = this.f173969a;
            if (aVar != null) {
                aVar.b(null);
            }
        }

        @Override // androidx.camera.core.impl.s
        public final void c(int i14, androidx.camera.core.impl.u uVar) {
            androidx.concurrent.futures.b.a aVar = this.f173969a;
            if (aVar != null) {
                aVar.d(new CameraControlInternal.CameraControlException(uVar));
            }
        }
    }

    public o1(l lVar, ScheduledExecutorService scheduledExecutorService, Executor executor, androidx.camera.core.impl.i2 i2Var) {
        MeteringRectangle[] meteringRectangleArr = f173947v;
        this.f173963p = meteringRectangleArr;
        this.f173964q = meteringRectangleArr;
        this.f173965r = meteringRectangleArr;
        this.f173966s = null;
        this.f173967t = false;
        this.f173968u = null;
        this.f173948a = lVar;
        this.f173949b = executor;
        this.f173950c = scheduledExecutorService;
        this.f173953f = new y.k(i2Var);
    }

    public final void a(boolean z14, boolean z15) {
        if (this.f173951d) {
            androidx.camera.core.impl.v0.a aVar = new androidx.camera.core.impl.v0.a();
            aVar.f5826f = true;
            aVar.f5823c = this.f173961n;
            u.a.C3144a c3144a = new u.a.C3144a();
            if (z14) {
                c3144a.c(CaptureRequest.CONTROL_AF_TRIGGER, 2);
            }
            if (z15) {
                c3144a.c(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 2);
            }
            aVar.c(c3144a.a());
            this.f173948a.A(Collections.singletonList(aVar.e()));
        }
    }

    public final void b() {
        l lVar = this.f173948a;
        lVar.f173878b.f173906a.remove(null);
        lVar.f173878b.f173906a.remove(this.f173962o);
        androidx.concurrent.futures.b.a<b0.e0> aVar = this.f173966s;
        if (aVar != null) {
            aVar.d(new CameraControl.OperationCanceledException("Cancelled by cancelFocusAndMetering()"));
            this.f173966s = null;
        }
        ScheduledFuture<?> scheduledFuture = this.f173956i;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
            this.f173956i = null;
        }
        ScheduledFuture<?> scheduledFuture2 = this.f173957j;
        if (scheduledFuture2 != null) {
            scheduledFuture2.cancel(true);
            this.f173957j = null;
        }
        if (this.f173963p.length > 0) {
            a(true, false);
        }
        MeteringRectangle[] meteringRectangleArr = f173947v;
        this.f173963p = meteringRectangleArr;
        this.f173964q = meteringRectangleArr;
        this.f173965r = meteringRectangleArr;
        this.f173954g = false;
        lVar.B();
    }

    public final ListenableFuture<Void> c(boolean z14) {
        if (l.t(this.f173948a.f173881e, 5) != 5) {
            l0.j.a aVar = l0.j.f107810a;
            return l0.m.c.f107817b;
        }
        androidx.concurrent.futures.b.a aVar2 = new androidx.concurrent.futures.b.a();
        androidx.concurrent.futures.b.d<T> dVar = new androidx.concurrent.futures.b.d<>(aVar2);
        aVar2.f6080b = dVar;
        aVar2.f6079a = h.class;
        try {
            this.f173949b.execute(new cd0.v(this, z14, aVar2, 4));
            aVar2.f6079a = "enableExternalFlashAeMode";
            return dVar;
        } catch (Exception e4) {
            dVar.a(e4);
            return dVar;
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0085  */
    /* JADX WARN: Code duplicated, block: B:35:0x008f  */
    /* JADX WARN: Code duplicated, block: B:36:0x00aa  */
    public final List<MeteringRectangle> d(List<b0.u0> list, int i14, Rational rational, Rect rect, int i15) {
        PointF pointF;
        MeteringRectangle meteringRectangle;
        if (list.isEmpty() || i14 == 0) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        Rational rational2 = new Rational(rect.width(), rect.height());
        for (b0.u0 u0Var : list) {
            if (arrayList.size() == i14) {
                break;
            }
            float f14 = u0Var.f14060a;
            float f15 = u0Var.f14062c;
            if (f14 >= 0.0f && f14 <= 1.0f) {
                float f16 = u0Var.f14061b;
                if (f16 >= 0.0f && f16 <= 1.0f) {
                    Rational rational3 = u0Var.f14063d;
                    if (rational3 == null) {
                        rational3 = rational;
                    }
                    y.k kVar = this.f173953f;
                    if (i15 == 1) {
                        if (kVar.f192948a.a(AfRegionFlipHorizontallyQuirk.class)) {
                            pointF = new PointF(1.0f - f14, f16);
                        }
                        if (!rational3.equals(rational2)) {
                            if (rational3.compareTo(rational2) > 0) {
                                float fDoubleValue = (float) (rational3.doubleValue() / rational2.doubleValue());
                                pointF.y = (1.0f / fDoubleValue) * (((float) ((((double) fDoubleValue) - 1.0d) / 2.0d)) + pointF.y);
                            } else {
                                float fDoubleValue2 = (float) (rational2.doubleValue() / rational3.doubleValue());
                                pointF.x = (1.0f / fDoubleValue2) * (((float) ((((double) fDoubleValue2) - 1.0d) / 2.0d)) + pointF.x);
                            }
                        }
                        int iWidth = (int) ((pointF.x * rect.width()) + rect.left);
                        int iHeight = (int) ((pointF.y * rect.height()) + rect.top);
                        int iWidth2 = ((int) (rect.width() * f15)) / 2;
                        int iHeight2 = ((int) (f15 * rect.height())) / 2;
                        Rect rect2 = new Rect(iWidth - iWidth2, iHeight - iHeight2, iWidth + iWidth2, iHeight + iHeight2);
                        rect2.left = Math.min(Math.max(rect2.left, rect.left), rect.right);
                        rect2.right = Math.min(Math.max(rect2.right, rect.left), rect.right);
                        rect2.top = Math.min(Math.max(rect2.top, rect.top), rect.bottom);
                        rect2.bottom = Math.min(Math.max(rect2.bottom, rect.top), rect.bottom);
                        meteringRectangle = new MeteringRectangle(rect2, 1000);
                        if (meteringRectangle.getWidth() == 0 && meteringRectangle.getHeight() != 0) {
                            arrayList.add(meteringRectangle);
                        }
                    } else {
                        kVar.getClass();
                    }
                    pointF = new PointF(f14, f16);
                    if (!rational3.equals(rational2)) {
                        if (rational3.compareTo(rational2) > 0) {
                            float fDoubleValue3 = (float) (rational3.doubleValue() / rational2.doubleValue());
                            pointF.y = (1.0f / fDoubleValue3) * (((float) ((((double) fDoubleValue3) - 1.0d) / 2.0d)) + pointF.y);
                        } else {
                            float fDoubleValue4 = (float) (rational2.doubleValue() / rational3.doubleValue());
                            pointF.x = (1.0f / fDoubleValue4) * (((float) ((((double) fDoubleValue4) - 1.0d) / 2.0d)) + pointF.x);
                        }
                    }
                    int iWidth3 = (int) ((pointF.x * rect.width()) + rect.left);
                    int iHeight3 = (int) ((pointF.y * rect.height()) + rect.top);
                    int iWidth4 = ((int) (rect.width() * f15)) / 2;
                    int iHeight4 = ((int) (f15 * rect.height())) / 2;
                    Rect rect3 = new Rect(iWidth3 - iWidth4, iHeight3 - iHeight4, iWidth3 + iWidth4, iHeight3 + iHeight4);
                    rect3.left = Math.min(Math.max(rect3.left, rect.left), rect.right);
                    rect3.right = Math.min(Math.max(rect3.right, rect.left), rect.right);
                    rect3.top = Math.min(Math.max(rect3.top, rect.top), rect.bottom);
                    rect3.bottom = Math.min(Math.max(rect3.bottom, rect.top), rect.bottom);
                    meteringRectangle = new MeteringRectangle(rect3, 1000);
                    if (meteringRectangle.getWidth() == 0) {
                    }
                }
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    public final void e(androidx.concurrent.futures.b.a<Void> aVar) {
        if (!this.f173951d) {
            aVar.d(new CameraControl.OperationCanceledException("Camera is not active."));
            return;
        }
        androidx.camera.core.impl.v0.a aVar2 = new androidx.camera.core.impl.v0.a();
        aVar2.f5823c = this.f173961n;
        aVar2.f5826f = true;
        u.a.C3144a c3144a = new u.a.C3144a();
        c3144a.c(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 1);
        aVar2.c(c3144a.a());
        aVar2.b(new a(this, aVar));
        this.f173948a.A(Collections.singletonList(aVar2.e()));
    }

    public final void f(boolean z14) {
        if (this.f173951d) {
            androidx.camera.core.impl.v0.a aVar = new androidx.camera.core.impl.v0.a();
            aVar.f5823c = this.f173961n;
            aVar.f5826f = true;
            u.a.C3144a c3144a = new u.a.C3144a();
            c3144a.c(CaptureRequest.CONTROL_AF_TRIGGER, 1);
            if (z14) {
                c3144a.e(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(l.t(this.f173948a.f173881e, 1)), androidx.camera.core.impl.x0.b.HIGH_PRIORITY_REQUIRED);
            }
            aVar.c(c3144a.a());
            aVar.b(new n1(this, null));
            this.f173948a.A(Collections.singletonList(aVar.e()));
        }
    }
}
