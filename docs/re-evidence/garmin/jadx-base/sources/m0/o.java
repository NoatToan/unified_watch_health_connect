package m0;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Rational;
import androidx.camera.core.impl.q2;
import androidx.camera.core.internal.utils.ImageUtil;
import b0.i1;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class o {
    private o() {
    }

    public static HashMap a(Rect rect, boolean z14, Rational rational, int i14, int i15, int i16, Map map) {
        boolean z15 = false;
        k7.h.b(rect.width() > 0 && rect.height() > 0, "Cannot compute viewport crop rects zero sized sensor rect.");
        RectF rectF = new RectF(rect);
        HashMap map2 = new HashMap();
        RectF rectF2 = new RectF(rect);
        for (Map.Entry entry : map.entrySet()) {
            Matrix matrix = new Matrix();
            RectF rectF3 = new RectF(0.0f, 0.0f, ((q2) entry.getValue()).f().getWidth(), ((q2) entry.getValue()).f().getHeight());
            matrix.setRectToRect(rectF3, rectF, Matrix.ScaleToFit.CENTER);
            map2.put((i1) entry.getKey(), matrix);
            RectF rectF4 = new RectF();
            matrix.mapRect(rectF4, rectF3);
            rectF2.intersect(rectF4);
        }
        Rational rationalB = ImageUtil.b(rational, i14);
        if (i15 != 3) {
            Matrix matrix2 = new Matrix();
            RectF rectF5 = new RectF(0.0f, 0.0f, rationalB.getNumerator(), rationalB.getDenominator());
            if (i15 == 0) {
                matrix2.setRectToRect(rectF5, rectF2, Matrix.ScaleToFit.START);
            } else if (i15 == 1) {
                matrix2.setRectToRect(rectF5, rectF2, Matrix.ScaleToFit.CENTER);
            } else {
                if (i15 != 2) {
                    vb.h.z(am.j.h(i15, "Unexpected scale type: "));
                    return null;
                }
                matrix2.setRectToRect(rectF5, rectF2, Matrix.ScaleToFit.END);
            }
            RectF rectF6 = new RectF();
            matrix2.mapRect(rectF6, rectF5);
            boolean z16 = z14 ^ (i16 == 1);
            boolean z17 = i14 == 0 && !z16;
            boolean z18 = i14 == 90 && z16;
            if (z17 || z18) {
                rectF2 = rectF6;
            } else {
                boolean z19 = i14 == 0 && z16;
                boolean z24 = i14 == 270 && !z16;
                if (z19 || z24) {
                    float fCenterX = rectF2.centerX();
                    float f14 = fCenterX + fCenterX;
                    rectF2 = new RectF(f14 - rectF6.right, rectF6.top, f14 - rectF6.left, rectF6.bottom);
                } else {
                    boolean z25 = i14 == 90 && !z16;
                    boolean z26 = i14 == 180 && z16;
                    if (z25 || z26) {
                        float fCenterY = rectF2.centerY();
                        float f15 = fCenterY + fCenterY;
                        rectF2 = new RectF(rectF6.left, f15 - rectF6.bottom, rectF6.right, f15 - rectF6.top);
                    } else {
                        boolean z27 = i14 == 180 && !z16;
                        if (i14 == 270 && z16) {
                            z15 = true;
                        }
                        if (!z27 && !z15) {
                            throw new IllegalArgumentException("Invalid argument: mirrored " + z16 + " rotation " + i14);
                        }
                        float fCenterY2 = rectF2.centerY();
                        float f16 = fCenterY2 + fCenterY2;
                        RectF rectF7 = new RectF(rectF6.left, f16 - rectF6.bottom, rectF6.right, f16 - rectF6.top);
                        float fCenterX2 = rectF2.centerX();
                        float f17 = fCenterX2 + fCenterX2;
                        rectF2 = new RectF(f17 - rectF7.right, rectF7.top, f17 - rectF7.left, rectF7.bottom);
                    }
                }
            }
        }
        HashMap map3 = new HashMap();
        RectF rectF8 = new RectF();
        Matrix matrix3 = new Matrix();
        for (Map.Entry entry2 : map2.entrySet()) {
            ((Matrix) entry2.getValue()).invert(matrix3);
            matrix3.mapRect(rectF8, rectF2);
            Rect rect2 = new Rect();
            rectF8.round(rect2);
            map3.put((i1) entry2.getKey(), rect2);
        }
        return map3;
    }
}
