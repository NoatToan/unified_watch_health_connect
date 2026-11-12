package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Size;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class kyp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final RectF f24429a = new RectF(-1.0f, -1.0f, 1.0f, 1.0f);

    public static Matrix a(Rect rect) {
        return b(new RectF(rect));
    }

    public static Matrix b(RectF rectF) {
        Matrix matrix = new Matrix();
        matrix.setRectToRect(f24429a, rectF, Matrix.ScaleToFit.FILL);
        return matrix;
    }

    public static Matrix c(RectF rectF, RectF rectF2, int i) {
        Matrix matrix = new Matrix();
        matrix.setRectToRect(rectF, f24429a, Matrix.ScaleToFit.FILL);
        matrix.postRotate(i);
        matrix.postConcat(b(rectF2));
        return matrix;
    }

    public static boolean d(int i) {
        if (i == 90 || i == 270) {
            return true;
        }
        if (i == 0 || i == 180) {
            return false;
        }
        throw new IllegalArgumentException("Invalid rotation degrees: " + i);
    }

    public static boolean e(Size size, boolean z, Size size2, boolean z2) {
        float width;
        float width2;
        float width3;
        float f;
        if (z) {
            width = size.getWidth() / size.getHeight();
            width2 = width;
        } else {
            width = (size.getWidth() + 1.0f) / (size.getHeight() - 1.0f);
            width2 = (size.getWidth() - 1.0f) / (size.getHeight() + 1.0f);
        }
        if (z2) {
            width3 = size2.getWidth() / size2.getHeight();
            f = width3;
        } else {
            float width4 = (size2.getWidth() + 1.0f) / (size2.getHeight() - 1.0f);
            width3 = (size2.getWidth() - 1.0f) / (size2.getHeight() + 1.0f);
            f = width4;
        }
        return width >= width3 && f >= width2;
    }

    public static int f(int i) {
        if (i == 0) {
            return 0;
        }
        if (i == 1) {
            return 90;
        }
        if (i == 2) {
            return 180;
        }
        if (i == 3) {
            return 270;
        }
        throw new IllegalStateException("Unexpected rotation value " + i);
    }
}
