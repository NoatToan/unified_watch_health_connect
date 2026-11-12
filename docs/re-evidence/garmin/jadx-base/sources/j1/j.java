package j1;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Size;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final k.d f96246i = k.d.FILL_CENTER;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Size f96247a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Rect f96248b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f96249c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Matrix f96250d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f96251e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f96252f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f96253g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public k.d f96254h = f96246i;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f96255a;

        static {
            int[] iArr = new int[k.d.values().length];
            f96255a = iArr;
            try {
                iArr[k.d.FIT_CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f96255a[k.d.FILL_CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f96255a[k.d.FIT_END.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f96255a[k.d.FILL_END.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f96255a[k.d.FIT_START.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f96255a[k.d.FILL_START.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public final Matrix a(Size size, int i14, Rect rect) {
        Matrix matrix = null;
        if (!f()) {
            return null;
        }
        Matrix matrix2 = new Matrix();
        if (f()) {
            matrix = new Matrix(this.f96250d);
            matrix.postConcat(c(size, i14));
        }
        matrix.invert(matrix2);
        Matrix matrix3 = new Matrix();
        matrix3.setRectToRect(new RectF(0.0f, 0.0f, rect.width(), rect.height()), new RectF(0.0f, 0.0f, 1.0f, 1.0f), Matrix.ScaleToFit.FILL);
        matrix2.postConcat(matrix3);
        return matrix2;
    }

    public final Size b() {
        return j0.v.d(this.f96249c) ? new Size(this.f96248b.height(), this.f96248b.width()) : new Size(this.f96248b.width(), this.f96248b.height());
    }

    public final Matrix c(Size size, int i14) {
        Matrix.ScaleToFit scaleToFit;
        RectF rectF;
        k7.h.f(f(), null);
        if (j0.v.e(size, true, b())) {
            rectF = new RectF(0.0f, 0.0f, size.getWidth(), size.getHeight());
        } else {
            RectF rectF2 = new RectF(0.0f, 0.0f, size.getWidth(), size.getHeight());
            Size sizeB = b();
            RectF rectF3 = new RectF(0.0f, 0.0f, sizeB.getWidth(), sizeB.getHeight());
            Matrix matrix = new Matrix();
            k.d dVar = this.f96254h;
            switch (a.f96255a[dVar.ordinal()]) {
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
                    dVar.toString();
                    scaleToFit = Matrix.ScaleToFit.FILL;
                    break;
            }
            if (dVar == k.d.FIT_CENTER || dVar == k.d.FIT_START || dVar == k.d.FIT_END) {
                matrix.setRectToRect(rectF3, rectF2, scaleToFit);
            } else {
                matrix.setRectToRect(rectF2, rectF3, scaleToFit);
                matrix.invert(matrix);
            }
            matrix.mapRect(rectF3);
            if (i14 == 1) {
                float width = size.getWidth() / 2.0f;
                float f14 = width + width;
                rectF = new RectF(f14 - rectF3.right, rectF3.top, f14 - rectF3.left, rectF3.bottom);
            } else {
                rectF = rectF3;
            }
        }
        Matrix matrixA = j0.v.a(this.f96249c, false, new RectF(this.f96248b), rectF);
        if (this.f96252f && this.f96253g) {
            boolean zD = j0.v.d(this.f96249c);
            Rect rect = this.f96248b;
            if (zD) {
                matrixA.preScale(1.0f, -1.0f, rect.centerX(), this.f96248b.centerY());
                return matrixA;
            }
            matrixA.preScale(-1.0f, 1.0f, rect.centerX(), this.f96248b.centerY());
        }
        return matrixA;
    }

    public final Matrix d() {
        k7.h.f(f(), null);
        RectF rectF = new RectF(0.0f, 0.0f, this.f96247a.getWidth(), this.f96247a.getHeight());
        return j0.v.a(!this.f96253g ? this.f96249c : -j0.c.b(this.f96251e), false, rectF, rectF);
    }

    public final RectF e(Size size, int i14) {
        k7.h.f(f(), null);
        Matrix matrixC = c(size, i14);
        RectF rectF = new RectF(0.0f, 0.0f, this.f96247a.getWidth(), this.f96247a.getHeight());
        matrixC.mapRect(rectF);
        return rectF;
    }

    public final boolean f() {
        return (this.f96248b == null || this.f96247a == null || !(!this.f96253g || this.f96251e != -1)) ? false : true;
    }
}
