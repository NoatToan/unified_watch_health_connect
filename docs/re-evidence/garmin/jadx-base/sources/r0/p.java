package r0;

import android.graphics.Matrix;
import android.graphics.RectF;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.impl.l0;
import b0.c1;
import j0.v;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class p implements c1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Surface f148763b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f148764c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Size f148765d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float[] f148766e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float[] f148767f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public k7.b<c1.b> f148768g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Executor f148769h;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final androidx.concurrent.futures.b.d f148772k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final androidx.concurrent.futures.b.a<Void> f148773l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f148762a = new Object();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f148770i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f148771j = false;

    public p(Surface surface, int i14, int i15, Size size, c1.a aVar, c1.a aVar2, Matrix matrix) {
        float[] fArr = new float[16];
        this.f148766e = fArr;
        float[] fArr2 = new float[16];
        this.f148767f = fArr2;
        this.f148763b = surface;
        this.f148764c = i15;
        this.f148765d = size;
        a(fArr, new float[16], aVar);
        a(fArr2, new float[16], aVar2);
        androidx.concurrent.futures.b.a<Void> aVar3 = new androidx.concurrent.futures.b.a<>();
        androidx.concurrent.futures.b.d<T> dVar = new androidx.concurrent.futures.b.d<>(aVar3);
        aVar3.f6080b = dVar;
        try {
            this.f148773l = aVar3;
            aVar3.f6079a = "SurfaceOutputImpl close future complete";
        } catch (Exception e4) {
            dVar.a(e4);
        }
        this.f148772k = dVar;
    }

    public static void a(float[] fArr, float[] fArr2, c1.a aVar) {
        android.opengl.Matrix.setIdentityM(fArr, 0);
        if (aVar == null) {
            return;
        }
        j0.r.b(fArr);
        j0.r.a(aVar.e(), fArr);
        if (aVar.d()) {
            android.opengl.Matrix.translateM(fArr, 0, 1.0f, 0.0f, 0.0f);
            android.opengl.Matrix.scaleM(fArr, 0, -1.0f, 1.0f, 1.0f);
        }
        Size sizeI = v.i(aVar.c(), aVar.e());
        Matrix matrixA = v.a(aVar.e(), aVar.d(), v.k(aVar.c()), v.k(sizeI));
        RectF rectF = new RectF(aVar.b());
        matrixA.mapRect(rectF);
        float width = rectF.left / sizeI.getWidth();
        float height = ((sizeI.getHeight() - rectF.height()) - rectF.top) / sizeI.getHeight();
        float fWidth = rectF.width() / sizeI.getWidth();
        float fHeight = rectF.height() / sizeI.getHeight();
        android.opengl.Matrix.translateM(fArr, 0, width, height, 0.0f);
        android.opengl.Matrix.scaleM(fArr, 0, fWidth, fHeight, 1.0f);
        l0 l0VarA = aVar.a();
        android.opengl.Matrix.setIdentityM(fArr2, 0);
        j0.r.b(fArr2);
        if (l0VarA != null) {
            k7.h.f(l0VarA.j(), "Camera has no transform.");
            j0.r.a(l0VarA.b().h(), fArr2);
            if (l0VarA.e()) {
                android.opengl.Matrix.translateM(fArr2, 0, 1.0f, 0.0f, 0.0f);
                android.opengl.Matrix.scaleM(fArr2, 0, -1.0f, 1.0f, 1.0f);
            }
        }
        android.opengl.Matrix.invertM(fArr2, 0, fArr2, 0);
        android.opengl.Matrix.multiplyMM(fArr, 0, fArr2, 0, fArr, 0);
    }

    @Override // b0.c1
    public final void Q0(float[] fArr, float[] fArr2, boolean z14) {
        android.opengl.Matrix.multiplyMM(fArr, 0, fArr2, 0, z14 ? this.f148766e : this.f148767f, 0);
    }

    @Override // b0.c1
    public final Surface V0(k0.d dVar, k7.b bVar) {
        boolean z14;
        synchronized (this.f148762a) {
            this.f148769h = dVar;
            this.f148768g = bVar;
            z14 = this.f148770i;
        }
        if (z14) {
            c();
        }
        return this.f148763b;
    }

    public final void c() {
        Executor executor;
        k7.b<c1.b> bVar;
        AtomicReference atomicReference = new AtomicReference();
        synchronized (this.f148762a) {
            try {
                if (this.f148769h == null || (bVar = this.f148768g) == null) {
                    this.f148770i = true;
                } else if (!this.f148771j) {
                    atomicReference.set(bVar);
                    executor = this.f148769h;
                    this.f148770i = false;
                }
                executor = null;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (executor != null) {
            try {
                executor.execute(new h(1, this, atomicReference));
            } catch (RejectedExecutionException unused) {
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f148762a) {
            try {
                if (!this.f148771j) {
                    this.f148771j = true;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        this.f148773l.b(null);
    }

    @Override // b0.c1
    public final int getFormat() {
        return this.f148764c;
    }

    @Override // b0.c1
    public final Size getSize() {
        return this.f148765d;
    }

    @Override // b0.c1
    public final void i0(float[] fArr, float[] fArr2) {
        Q0(fArr, fArr2, true);
    }
}
