package androidx.camera.view;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Size;
import android.view.Display;
import android.view.TextureView;
import android.view.View;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import androidx.camera.core.r;
import defpackage.g6i;
import defpackage.kyp;
import defpackage.zpe;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class b {
    public static final PreviewView.ScaleType g = PreviewView.ScaleType.FILL_CENTER;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Size f1853a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Rect f1854b;
    public int c;
    public int d;
    public boolean e;
    public PreviewView.ScaleType f = g;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f1855a;

        static {
            int[] iArr = new int[PreviewView.ScaleType.values().length];
            f1855a = iArr;
            try {
                iArr[PreviewView.ScaleType.FIT_CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1855a[PreviewView.ScaleType.FILL_CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1855a[PreviewView.ScaleType.FIT_END.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1855a[PreviewView.ScaleType.FILL_END.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f1855a[PreviewView.ScaleType.FIT_START.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f1855a[PreviewView.ScaleType.FILL_START.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public static RectF b(RectF rectF, float f) {
        float f2 = f + f;
        return new RectF(f2 - rectF.right, rectF.top, f2 - rectF.left, rectF.bottom);
    }

    public static void n(Matrix matrix, RectF rectF, RectF rectF2, PreviewView.ScaleType scaleType) {
        Matrix.ScaleToFit scaleToFit;
        switch (a.f1855a[scaleType.ordinal()]) {
            case 1:
            case 2:
                scaleToFit = Matrix.ScaleToFit.CENTER;
                break;
            case 3:
            case 4:
                scaleToFit = Matrix.ScaleToFit.END;
                break;
            case 5:
            case 6:
                scaleToFit = Matrix.ScaleToFit.START;
                break;
            default:
                zpe.c("PreviewTransform", "Unexpected crop rect: " + scaleType);
                scaleToFit = Matrix.ScaleToFit.FILL;
                break;
        }
        if (scaleType == PreviewView.ScaleType.FIT_CENTER || scaleType == PreviewView.ScaleType.FIT_START || scaleType == PreviewView.ScaleType.FIT_END) {
            matrix.setRectToRect(rectF, rectF2, scaleToFit);
        } else {
            matrix.setRectToRect(rectF2, rectF, scaleToFit);
            matrix.invert(matrix);
        }
    }

    public Bitmap a(Bitmap bitmap, Size size, int i) {
        if (!k()) {
            return bitmap;
        }
        Matrix matrixI = i();
        RectF rectFJ = j(size, i);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(size.getWidth(), size.getHeight(), bitmap.getConfig());
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Matrix matrix = new Matrix();
        matrix.postConcat(matrixI);
        matrix.postScale(rectFJ.width() / this.f1853a.getWidth(), rectFJ.height() / this.f1853a.getHeight());
        matrix.postTranslate(rectFJ.left, rectFJ.top);
        canvas.drawBitmap(bitmap, matrix, new Paint(7));
        return bitmapCreateBitmap;
    }

    public Matrix c(Size size, int i) {
        if (!k()) {
            return null;
        }
        Matrix matrix = new Matrix();
        h(size, i).invert(matrix);
        Matrix matrix2 = new Matrix();
        matrix2.setRectToRect(new RectF(0.0f, 0.0f, this.f1853a.getWidth(), this.f1853a.getHeight()), new RectF(0.0f, 0.0f, 1.0f, 1.0f), Matrix.ScaleToFit.FILL);
        matrix.postConcat(matrix2);
        return matrix;
    }

    public RectF d(Size size, int i) {
        RectF rectF = new RectF(0.0f, 0.0f, size.getWidth(), size.getHeight());
        Size sizeE = e();
        RectF rectF2 = new RectF(0.0f, 0.0f, sizeE.getWidth(), sizeE.getHeight());
        Matrix matrix = new Matrix();
        n(matrix, rectF2, rectF, this.f);
        matrix.mapRect(rectF2);
        return i == 1 ? b(rectF2, size.getWidth() / 2.0f) : rectF2;
    }

    public final Size e() {
        return kyp.d(this.c) ? new Size(this.f1854b.height(), this.f1854b.width()) : new Size(this.f1854b.width(), this.f1854b.height());
    }

    public PreviewView.ScaleType f() {
        return this.f;
    }

    public Rect g() {
        return this.f1854b;
    }

    public Matrix h(Size size, int i) {
        g6i.i(k());
        Matrix matrixC = kyp.c(new RectF(this.f1854b), l(size) ? new RectF(0.0f, 0.0f, size.getWidth(), size.getHeight()) : d(size, i), this.c);
        if (this.e) {
            if (kyp.d(this.c)) {
                matrixC.preScale(1.0f, -1.0f, this.f1854b.centerX(), this.f1854b.centerY());
            } else {
                matrixC.preScale(-1.0f, 1.0f, this.f1854b.centerX(), this.f1854b.centerY());
            }
        }
        return matrixC;
    }

    @VisibleForTesting
    public Matrix i() {
        g6i.i(k());
        RectF rectF = new RectF(0.0f, 0.0f, this.f1853a.getWidth(), this.f1853a.getHeight());
        return kyp.c(rectF, rectF, -kyp.f(this.d));
    }

    public final RectF j(Size size, int i) {
        g6i.i(k());
        Matrix matrixH = h(size, i);
        RectF rectF = new RectF(0.0f, 0.0f, this.f1853a.getWidth(), this.f1853a.getHeight());
        matrixH.mapRect(rectF);
        return rectF;
    }

    public final boolean k() {
        return (this.f1854b == null || this.f1853a == null || this.d == -1) ? false : true;
    }

    @VisibleForTesting
    public boolean l(Size size) {
        return kyp.e(size, true, e(), false);
    }

    public void m(int i, int i2) {
        this.c = i;
        this.d = i2;
    }

    public void o(PreviewView.ScaleType scaleType) {
        this.f = scaleType;
    }

    public void p(r.g gVar, Size size, boolean z) {
        zpe.a("PreviewTransform", "Transformation info set: " + gVar + " " + size + " " + z);
        this.f1854b = gVar.a();
        this.c = gVar.b();
        this.d = gVar.c();
        this.f1853a = size;
        this.e = z;
    }

    public void q(Size size, int i, View view) {
        if (size.getHeight() == 0 || size.getWidth() == 0) {
            zpe.k("PreviewTransform", "Transform not applied due to PreviewView size: " + size);
            return;
        }
        if (k()) {
            if (view instanceof TextureView) {
                ((TextureView) view).setTransform(i());
            } else {
                Display display = view.getDisplay();
                if (display != null && display.getRotation() != this.d) {
                    zpe.c("PreviewTransform", "Non-display rotation not supported with SurfaceView / PERFORMANCE mode.");
                }
            }
            RectF rectFJ = j(size, i);
            view.setPivotX(0.0f);
            view.setPivotY(0.0f);
            view.setScaleX(rectFJ.width() / this.f1853a.getWidth());
            view.setScaleY(rectFJ.height() / this.f1853a.getHeight());
            view.setTranslationX(rectFJ.left - view.getLeft());
            view.setTranslationY(rectFJ.top - view.getTop());
        }
    }
}
