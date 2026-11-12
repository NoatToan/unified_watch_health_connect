package androidx.camera.core;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.media.ImageWriter;
import androidx.annotation.GuardedBy;
import androidx.annotation.IntRange;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import androidx.core.os.OperationCanceledException;
import defpackage.cb3;
import defpackage.f6d;
import defpackage.lhe;
import defpackage.m0m;
import defpackage.oua;
import defpackage.p5d;
import defpackage.r5d;
import defpackage.u6d;
import defpackage.zpe;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public abstract class h implements p5d.a {
    public static final RectF t = new RectF(-1.0f, -1.0f, 1.0f, 1.0f);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @GuardedBy("mAnalyzerLock")
    public g.a f1705a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @IntRange(from = 0, to = 359)
    public volatile int f1706b;

    @IntRange(from = 0, to = 359)
    public volatile int c;
    public volatile boolean e;
    public volatile boolean f;

    @GuardedBy("mAnalyzerLock")
    public Executor g;

    @GuardedBy("mAnalyzerLock")
    public q h;

    @GuardedBy("mAnalyzerLock")
    public ImageWriter i;

    @GuardedBy("mAnalyzerLock")
    @VisibleForTesting
    public ByteBuffer n;

    @GuardedBy("mAnalyzerLock")
    @VisibleForTesting
    public ByteBuffer o;

    @GuardedBy("mAnalyzerLock")
    @VisibleForTesting
    public ByteBuffer p;

    @GuardedBy("mAnalyzerLock")
    @VisibleForTesting
    public ByteBuffer q;
    public volatile int d = 1;

    @GuardedBy("mAnalyzerLock")
    public Rect j = new Rect();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @GuardedBy("mAnalyzerLock")
    public Rect f1707k = new Rect();

    @GuardedBy("mAnalyzerLock")
    public Matrix l = new Matrix();

    @GuardedBy("mAnalyzerLock")
    public Matrix m = new Matrix();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Object f1708r = new Object();
    public boolean s = true;

    public static q i(int i, int i2, int i3, int i4, int i5) {
        boolean z = i3 == 90 || i3 == 270;
        int i6 = z ? i2 : i;
        if (!z) {
            i = i2;
        }
        return new q(r5d.a(i6, i, i4, i5));
    }

    @VisibleForTesting
    public static Matrix k(int i, int i2, int i3, int i4, @IntRange(from = 0, to = 359) int i5) {
        Matrix matrix = new Matrix();
        if (i5 > 0) {
            matrix.setRectToRect(new RectF(0.0f, 0.0f, i, i2), t, Matrix.ScaleToFit.FILL);
            matrix.postRotate(i5);
            matrix.postConcat(l(new RectF(0.0f, 0.0f, i3, i4)));
        }
        return matrix;
    }

    public static Matrix l(RectF rectF) {
        Matrix matrix = new Matrix();
        matrix.setRectToRect(t, rectF, Matrix.ScaleToFit.FILL);
        return matrix;
    }

    public static Rect m(Rect rect, Matrix matrix) {
        RectF rectF = new RectF(rect);
        matrix.mapRect(rectF);
        Rect rect2 = new Rect();
        rectF.round(rect2);
        return rect2;
    }

    @Override // p5d.a
    public void a(p5d p5dVar) {
        try {
            m mVarD = d(p5dVar);
            if (mVarD != null) {
                p(mVarD);
            }
        } catch (IllegalStateException e) {
            zpe.d("ImageAnalysisAnalyzer", "Failed to acquire image.", e);
        }
    }

    public abstract m d(p5d p5dVar);

    /* JADX WARN: Code duplicated, block: B:41:0x006b  */
    public lhe<Void> e(final m mVar) {
        final Executor executor;
        final g.a aVar;
        boolean z;
        q qVar;
        ImageWriter imageWriter;
        ByteBuffer byteBuffer;
        ByteBuffer byteBuffer2;
        ByteBuffer byteBuffer3;
        ByteBuffer byteBuffer4;
        m mVarK;
        int i = this.e ? this.f1706b : 0;
        synchronized (this.f1708r) {
            try {
                executor = this.g;
                aVar = this.f1705a;
                z = this.e && i != this.c;
                if (z) {
                    r(mVar, i);
                }
                if (this.e) {
                    h(mVar);
                }
                qVar = this.h;
                imageWriter = this.i;
                byteBuffer = this.n;
                byteBuffer2 = this.o;
                byteBuffer3 = this.p;
                byteBuffer4 = this.q;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (aVar == null || executor == null || !this.s) {
            return oua.f(new OperationCanceledException("No analyzer or executor currently set."));
        }
        if (qVar == null) {
            mVarK = null;
        } else if (this.d == 2) {
            mVarK = ImageProcessingUtil.e(mVar, qVar, byteBuffer, i, this.f);
        } else if (this.d != 1) {
            mVarK = null;
        } else {
            if (this.f) {
                ImageProcessingUtil.c(mVar);
            }
            if (imageWriter == null || byteBuffer2 == null || byteBuffer3 == null || byteBuffer4 == null) {
                mVarK = null;
            } else {
                mVarK = ImageProcessingUtil.k(mVar, qVar, imageWriter, byteBuffer2, byteBuffer3, byteBuffer4, i);
            }
        }
        boolean z2 = mVarK == null;
        final m mVar2 = z2 ? mVar : mVarK;
        final Rect rect = new Rect();
        final Matrix matrix = new Matrix();
        synchronized (this.f1708r) {
            if (z && !z2) {
                try {
                    q(mVar.getWidth(), mVar.getHeight(), mVar2.getWidth(), mVar2.getHeight());
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            this.c = i;
            rect.set(this.f1707k);
            matrix.set(this.m);
        }
        return cb3.a(new cb3.c() { // from class: n2d
            @Override // cb3.c
            public final Object a(cb3.a aVar2) {
                return this.f27473a.o(executor, mVar, matrix, mVar2, rect, aVar, aVar2);
            }
        });
    }

    public void f() {
        this.s = true;
    }

    public abstract void g();

    @GuardedBy("mAnalyzerLock")
    public final void h(m mVar) {
        if (this.d != 1) {
            if (this.d == 2 && this.n == null) {
                this.n = ByteBuffer.allocateDirect(mVar.getWidth() * mVar.getHeight() * 4);
                return;
            }
            return;
        }
        if (this.o == null) {
            this.o = ByteBuffer.allocateDirect(mVar.getWidth() * mVar.getHeight());
        }
        this.o.position(0);
        if (this.p == null) {
            this.p = ByteBuffer.allocateDirect((mVar.getWidth() * mVar.getHeight()) / 4);
        }
        this.p.position(0);
        if (this.q == null) {
            this.q = ByteBuffer.allocateDirect((mVar.getWidth() * mVar.getHeight()) / 4);
        }
        this.q.position(0);
    }

    public void j() {
        this.s = false;
        g();
    }

    public final /* synthetic */ void n(m mVar, Matrix matrix, m mVar2, Rect rect, g.a aVar, cb3.a aVar2) {
        if (!this.s) {
            aVar2.f(new OperationCanceledException("ImageAnalysis is detached"));
            return;
        }
        m0m m0mVar = new m0m(mVar2, u6d.e(mVar.H().a(), mVar.H().getTimestamp(), this.e ? 0 : this.f1706b, matrix));
        if (!rect.isEmpty()) {
            m0mVar.a0(rect);
        }
        aVar.analyze(m0mVar);
        aVar2.c(null);
    }

    public final /* synthetic */ Object o(Executor executor, final m mVar, final Matrix matrix, final m mVar2, final Rect rect, final g.a aVar, final cb3.a aVar2) throws Exception {
        executor.execute(new Runnable() { // from class: o2d
            @Override // java.lang.Runnable
            public final void run() {
                this.f28668a.n(mVar, matrix, mVar2, rect, aVar, aVar2);
            }
        });
        return "analyzeImage";
    }

    public abstract void p(m mVar);

    @GuardedBy("mAnalyzerLock")
    public final void q(int i, int i2, int i3, int i4) {
        Matrix matrixK = k(i, i2, i3, i4, this.f1706b);
        this.f1707k = m(this.j, matrixK);
        this.m.setConcat(this.l, matrixK);
    }

    @GuardedBy("mAnalyzerLock")
    public final void r(m mVar, @IntRange(from = 0, to = 359) int i) {
        q qVar = this.h;
        if (qVar == null) {
            return;
        }
        qVar.l();
        this.h = i(mVar.getWidth(), mVar.getHeight(), i, this.h.b(), this.h.c());
        if (this.d == 1) {
            ImageWriter imageWriter = this.i;
            if (imageWriter != null) {
                f6d.a(imageWriter);
            }
            this.i = f6d.c(this.h.a(), this.h.c());
        }
    }

    public void s(Executor executor, g.a aVar) {
        synchronized (this.f1708r) {
            if (aVar == null) {
                try {
                    g();
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.f1705a = aVar;
            this.g = executor;
        }
    }

    public void t(boolean z) {
        this.f = z;
    }

    public void u(int i) {
        this.d = i;
    }

    public void v(boolean z) {
        this.e = z;
    }

    public void w(q qVar) {
        synchronized (this.f1708r) {
            this.h = qVar;
        }
    }

    public void x(int i) {
        this.f1706b = i;
    }

    public void y(Matrix matrix) {
        synchronized (this.f1708r) {
            this.l = matrix;
            this.m = new Matrix(this.l);
        }
    }

    public void z(Rect rect) {
        synchronized (this.f1708r) {
            this.j = rect;
            this.f1707k = new Rect(this.j);
        }
    }
}
