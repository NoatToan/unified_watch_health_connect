package b0;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.media.ImageWriter;
import androidx.camera.core.ImageProcessingUtil;
import androidx.camera.core.impl.o1;
import androidx.core.os.OperationCanceledException;
import com.google.common.util.concurrent.ListenableFuture;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public abstract class i0 implements o1.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public g0.a f13941a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile int f13942b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile int f13943c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile boolean f13945e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile boolean f13946f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Executor f13947g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public androidx.camera.core.g f13948h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ImageWriter f13949i;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ByteBuffer f13954n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ByteBuffer f13955o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ByteBuffer f13956p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ByteBuffer f13957q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ByteBuffer f13958r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ByteBuffer f13959t;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile int f13944d = 1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Rect f13950j = new Rect();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Rect f13951k = new Rect();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Matrix f13952l = new Matrix();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Matrix f13953m = new Matrix();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Object f13960v = new Object();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f13961w = true;

    @Override // androidx.camera.core.impl.o1.a
    public final void a(o1 o1Var) {
        try {
            androidx.camera.core.e eVarB = b(o1Var);
            if (eVarB != null) {
                f(eVarB);
            }
        } catch (IllegalStateException unused) {
        }
    }

    public abstract androidx.camera.core.e b(o1 o1Var);

    public final ListenableFuture<Void> c(final androidx.camera.core.e eVar) throws Throwable {
        Object obj;
        Executor executor;
        final g0.a aVar;
        boolean z14;
        androidx.camera.core.g gVar;
        ImageWriter imageWriter;
        ByteBuffer byteBuffer;
        ByteBuffer byteBuffer2;
        ByteBuffer byteBuffer3;
        ByteBuffer byteBuffer4;
        ByteBuffer byteBuffer5;
        ByteBuffer byteBuffer6;
        b1 b1VarJ;
        b1 b1Var;
        int i14 = this.f13945e ? this.f13942b : 0;
        Object obj2 = this.f13960v;
        synchronized (obj2) {
            try {
                try {
                    executor = this.f13947g;
                    aVar = this.f13941a;
                    z14 = this.f13945e && i14 != this.f13943c;
                    if (z14) {
                        h(eVar, i14);
                    }
                    if (this.f13945e || this.f13944d == 3) {
                        e(eVar);
                    }
                    try {
                        gVar = this.f13948h;
                        try {
                            imageWriter = this.f13949i;
                            byteBuffer = this.f13954n;
                            byteBuffer2 = this.f13955o;
                            byteBuffer3 = this.f13956p;
                            byteBuffer4 = this.f13957q;
                            byteBuffer5 = this.f13958r;
                            byteBuffer6 = this.f13959t;
                        } catch (Throwable th3) {
                            th = th3;
                            obj = obj2;
                            throw th;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        obj = obj2;
                    }
                } catch (Throwable th5) {
                    th = th5;
                }
            } catch (Throwable th6) {
                th = th6;
                obj = obj2;
            }
        }
        if (aVar == null || executor == null || !this.f13961w) {
            OperationCanceledException operationCanceledException = new OperationCanceledException("No analyzer or executor currently set.");
            l0.j.a aVar2 = l0.j.f107810a;
            return new l0.m.a(operationCanceledException);
        }
        int i15 = this.f13944d;
        if (gVar != null) {
            if (i15 == 2) {
                b1VarJ = ImageProcessingUtil.d(eVar, gVar, byteBuffer, i14, this.f13946f);
            } else {
                if (this.f13944d == 1) {
                    if (this.f13946f) {
                        ImageProcessingUtil.a(eVar);
                    }
                    if (imageWriter != null && byteBuffer2 != null && byteBuffer3 != null && byteBuffer4 != null) {
                        b1VarJ = ImageProcessingUtil.i(eVar, gVar, imageWriter, byteBuffer2, byteBuffer3, byteBuffer4, i14);
                    }
                }
                b1Var = null;
            }
            b1Var = b1VarJ;
        } else {
            if (i15 == 3) {
                if (this.f13946f) {
                    ImageProcessingUtil.a(eVar);
                }
                if (byteBuffer2 != null && byteBuffer3 != null && byteBuffer4 != null && byteBuffer5 != null && byteBuffer6 != null) {
                    b1VarJ = ImageProcessingUtil.j(eVar, byteBuffer2, byteBuffer3, byteBuffer4, byteBuffer5, byteBuffer6, i14);
                    b1Var = b1VarJ;
                }
            }
            b1Var = null;
        }
        boolean z15 = b1Var == null;
        final androidx.camera.core.e eVar2 = z15 ? eVar : b1Var;
        final Rect rect = new Rect();
        final Matrix matrix = new Matrix();
        synchronized (this.f13960v) {
            if (z14 && !z15) {
                try {
                    g(eVar.getWidth(), eVar.getHeight(), eVar2.getWidth(), eVar2.getHeight());
                } catch (Throwable th7) {
                    throw th7;
                }
            }
            this.f13943c = i14;
            rect.set(this.f13951k);
            matrix.set(this.f13953m);
        }
        final androidx.concurrent.futures.b.a aVar3 = new androidx.concurrent.futures.b.a();
        androidx.concurrent.futures.b.d<T> dVar = new androidx.concurrent.futures.b.d<>(aVar3);
        aVar3.f6080b = dVar;
        aVar3.f6079a = v.h.class;
        try {
            executor.execute(new Runnable() { // from class: b0.h0
                @Override // java.lang.Runnable
                public final void run() {
                    i0 i0Var = this.f13931a;
                    androidx.camera.core.e eVar3 = eVar;
                    Matrix matrix2 = matrix;
                    androidx.camera.core.e eVar4 = eVar2;
                    Rect rect2 = rect;
                    g0.a aVar4 = aVar;
                    androidx.concurrent.futures.b.a aVar5 = aVar3;
                    if (!i0Var.f13961w) {
                        aVar5.d(new OperationCanceledException("ImageAnalysis is detached"));
                        return;
                    }
                    a1 a1Var = new a1(eVar4, new f(eVar3.A0().a(), eVar3.A0().getTimestamp(), i0Var.f13945e ? 0 : i0Var.f13942b, matrix2, eVar3.A0().b()));
                    if (!rect2.isEmpty()) {
                        a1Var.c(rect2);
                    }
                    aVar4.e(a1Var);
                    aVar5.b(null);
                }
            });
            aVar3.f6079a = "analyzeImage";
            return dVar;
        } catch (Exception e4) {
            dVar.a(e4);
            return dVar;
        }
    }

    public abstract void d();

    public final void e(androidx.camera.core.e eVar) {
        if (this.f13944d != 1 && this.f13944d != 3) {
            if (this.f13944d == 2 && this.f13954n == null) {
                this.f13954n = ByteBuffer.allocateDirect(eVar.getHeight() * eVar.getWidth() * 4);
                return;
            }
            return;
        }
        if (this.f13955o == null) {
            this.f13955o = ByteBuffer.allocateDirect(eVar.getHeight() * eVar.getWidth());
        }
        this.f13955o.position(0);
        if (this.f13956p == null) {
            this.f13956p = ByteBuffer.allocateDirect((eVar.getHeight() * eVar.getWidth()) / 4);
        }
        this.f13956p.position(0);
        if (this.f13957q == null) {
            this.f13957q = ByteBuffer.allocateDirect((eVar.getHeight() * eVar.getWidth()) / 4);
        }
        this.f13957q.position(0);
        if (this.f13944d == 3) {
            if (this.f13958r == null) {
                this.f13958r = ByteBuffer.allocateDirect(eVar.getHeight() * eVar.getWidth());
            }
            this.f13958r.position(0);
            if (this.f13959t == null) {
                this.f13959t = ByteBuffer.allocateDirect((eVar.getHeight() * eVar.getWidth()) / 2);
            }
            this.f13959t.position(0);
        }
    }

    public abstract void f(androidx.camera.core.e eVar);

    public final void g(int i14, int i15, int i16, int i17) {
        int i18 = this.f13942b;
        Matrix matrix = new Matrix();
        if (i18 > 0) {
            RectF rectF = new RectF(0.0f, 0.0f, i14, i15);
            RectF rectF2 = j0.v.f95963a;
            Matrix.ScaleToFit scaleToFit = Matrix.ScaleToFit.FILL;
            matrix.setRectToRect(rectF, rectF2, scaleToFit);
            matrix.postRotate(i18);
            RectF rectF3 = new RectF(0.0f, 0.0f, i16, i17);
            Matrix matrix2 = new Matrix();
            matrix2.setRectToRect(rectF2, rectF3, scaleToFit);
            matrix.postConcat(matrix2);
        }
        RectF rectF4 = new RectF(this.f13950j);
        matrix.mapRect(rectF4);
        Rect rect = new Rect();
        rectF4.round(rect);
        this.f13951k = rect;
        this.f13953m.setConcat(this.f13952l, matrix);
    }

    public final void h(androidx.camera.core.e eVar, int i14) {
        androidx.camera.core.g gVar = this.f13948h;
        if (gVar == null) {
            return;
        }
        gVar.e();
        int width = eVar.getWidth();
        int height = eVar.getHeight();
        int iF = this.f13948h.f();
        int iG = this.f13948h.g();
        boolean z14 = i14 == 90 || i14 == 270;
        int i15 = z14 ? height : width;
        if (!z14) {
            width = height;
        }
        this.f13948h = new androidx.camera.core.g(q0.a(i15, width, iF, iG));
        if (this.f13944d == 1) {
            ImageWriter imageWriter = this.f13949i;
            if (imageWriter != null) {
                imageWriter.close();
            }
            this.f13949i = ImageWriter.newInstance(this.f13948h.getSurface(), this.f13948h.g());
        }
    }

    public final void i(Executor executor, g0.a aVar) {
        if (aVar == null) {
            d();
        }
        synchronized (this.f13960v) {
            this.f13941a = aVar;
            this.f13947g = executor;
        }
    }

    public final void j(Matrix matrix) {
        synchronized (this.f13960v) {
            this.f13952l = matrix;
            this.f13953m = new Matrix(this.f13952l);
        }
    }

    public final void k(Rect rect) {
        synchronized (this.f13960v) {
            this.f13950j = rect;
            this.f13951k = new Rect(this.f13950j);
        }
    }
}
