package j0;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Size;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final RectF f95963a = new RectF(-1.0f, -1.0f, 1.0f, 1.0f);

    private v() {
    }

    public static Matrix a(int i14, boolean z14, RectF rectF, RectF rectF2) {
        Matrix matrix = new Matrix();
        Matrix.ScaleToFit scaleToFit = Matrix.ScaleToFit.FILL;
        RectF rectF3 = f95963a;
        matrix.setRectToRect(rectF, rectF3, scaleToFit);
        matrix.postRotate(i14);
        if (z14) {
            matrix.postScale(-1.0f, 1.0f);
        }
        Matrix matrix2 = new Matrix();
        matrix2.setRectToRect(rectF3, rectF2, scaleToFit);
        matrix.postConcat(matrix2);
        return matrix;
    }

    public static int b(Matrix matrix) {
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        return l((int) Math.round(Math.atan2(fArr[3], fArr[0]) * 57.29577951308232d));
    }

    public static boolean c(Rect rect, Size size) {
        return (rect.left == 0 && rect.top == 0 && rect.width() == size.getWidth() && rect.height() == size.getHeight()) ? false : true;
    }

    public static boolean d(int i14) {
        if (i14 == 90 || i14 == 270) {
            return true;
        }
        if (i14 == 0 || i14 == 180) {
            return false;
        }
        vb.h.s(am.j.h(i14, "Invalid rotation degrees: "));
        return false;
    }

    public static boolean e(Size size, boolean z14, Size size2) {
        float width;
        float width2;
        if (z14) {
            width = size.getWidth() / size.getHeight();
            width2 = width;
        } else {
            width = (size.getWidth() + 1.0f) / (size.getHeight() - 1.0f);
            width2 = (size.getWidth() - 1.0f) / (size.getHeight() + 1.0f);
        }
        return width >= (((float) size2.getWidth()) - 1.0f) / (((float) size2.getHeight()) + 1.0f) && (((float) size2.getWidth()) + 1.0f) / (((float) size2.getHeight()) - 1.0f) >= width2;
    }

    public static boolean f(Matrix matrix) {
        float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
        matrix.mapVectors(fArr);
        float f14 = fArr[0];
        float f15 = fArr[1];
        float f16 = fArr[2];
        float f17 = fArr[3];
        float f18 = (f15 * f17) + (f14 * f16);
        float f19 = (f14 * f17) - (f15 * f16);
        double dSqrt = Math.sqrt((f15 * f15) + (f14 * f14)) * Math.sqrt((f17 * f17) + (f16 * f16));
        return ((float) Math.toDegrees(Math.atan2(((double) f19) / dSqrt, ((double) f18) / dSqrt))) > 0.0f;
    }

    public static Size g(Rect rect) {
        return new Size(rect.width(), rect.height());
    }

    public static String h(Rect rect) {
        Locale locale = Locale.US;
        return rect + "(" + rect.width() + "x" + rect.height() + ")";
    }

    public static Size i(Size size, int i14) {
        k7.h.b(i14 % 90 == 0, "Invalid rotation degrees: " + i14);
        return d(l(i14)) ? new Size(size.getHeight(), size.getWidth()) : size;
    }

    public static Rect j(Size size) {
        return new Rect(0, 0, size.getWidth(), size.getHeight());
    }

    public static RectF k(Size size) {
        float f14 = 0;
        return new RectF(f14, f14, size.getWidth(), size.getHeight());
    }

    public static int l(int i14) {
        return ((i14 % 360) + 360) % 360;
    }
}
